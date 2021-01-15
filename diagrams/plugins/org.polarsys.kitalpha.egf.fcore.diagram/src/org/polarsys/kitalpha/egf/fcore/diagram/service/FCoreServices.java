/*******************************************************************************
 * Copyright (c) 2020 THALES GLOBAL SERVICES.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 *
 * SPDX-License-Identifier: EPL-2.0
 *  
 * Contributors:
 *   Thales - initial API and implementation
 ******************************************************************************/
package org.polarsys.kitalpha.egf.fcore.diagram.service;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.stream.Collectors;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.egf.common.helper.EMFHelper;
import org.eclipse.egf.model.pattern.Pattern;
import org.eclipse.egf.model.pattern.PatternLibrary;
import org.eclipse.egf.model.pattern.PatternMethod;
import org.eclipse.egf.model.pattern.PatternParameter;
import org.eclipse.egf.model.pattern.PatternViewpoint;
import org.eclipse.egf.pattern.jet.extension.JetPatternInitializer;
import org.eclipse.emf.codegen.jet.JETAttributeItem;
import org.eclipse.emf.codegen.jet.JETAttributeListItem;
import org.eclipse.emf.codegen.jet.JETDirectiveItem;
import org.eclipse.emf.codegen.jet.JETLiteralItem;
import org.eclipse.emf.codegen.jet.JETParser;
import org.eclipse.emf.codegen.jet.JETRootItem;
import org.eclipse.emf.codegen.jet.JETSubItem;
import org.eclipse.emf.codegen.jet.JETTokenItem;
import org.eclipse.emf.common.util.ECollections;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.swt.widgets.Shell;
import org.polarsys.kitalpha.egf.fcore.diagram.Activator;
import org.polarsys.kitalpha.egf.fcore.diagram.refresh.RefreshExtensionProvider;

import PatternDependencyAnalysis.PatternAnalysis;
import PatternDependencyAnalysis.PatternDependencyAnalysisFactory;
import PatternDependencyAnalysis.PatternMethodAnalysis;
import PatternDependencyAnalysis.PatternParameterAnalysis;
import PatternDependencyAnalysis.Root;
import PatternDependencyAnalysis.SectionAnalysis;

/**
 * Services to be used by "fcore" format manipulating code. Used in the
 * "fcore.odesign" viewpoint specification.
 * 
 * This is a WIP and an utility project. Use it at your own risk.
 * 
 * @author Arnaud Dieumegard
 */
public class FCoreServices {

	// CSV production constants
	private static final String CSV_CELL_NEWLINE_DELIMITER = "\n";
	private static final String CSV_CELL_DELIMITER = "\"";
	private static final String CSV_COLUMN_SEPARATOR = ";";
	private static final String HEADER_PATTERN_ANALYSIS = "Pattern;All parameters;Super Pattern;Method;Called Pattern;Section contribution;Pre-condition";
	private static final String HEADER_SECTION_ANALYSIS = "Section;Pattern;All parameters;Pre-condition";
	private static final String HEADER_PATTERN_HIERARCHY_ANALYSIS = "Pattern;CalledBy;InheritedBy;SuperPattern;PatternCalls";

	// EGF content constants
	private static final String LINEBREAK_PATTERN = "\r|\n";
	private static final String SECTION_PATTERN = "<h\\d>(.*)";
	private static final String DIV_PATTERN = "<div title=\"(.*)\"";
	private static final String EQUAL_STRING = "=";
	private static final String DOT_STRING = ".";
	private static final String PATTERN_ID = "patternId=";
	private static final String PATTERN_CALL_ATTRIBUTE = ":patternCall";

	// Visit aggregators
	private static List<String> externalResourceProblemNotified = new ArrayList<String>();
	private static List<Pattern> visitedPatterns = new ArrayList<Pattern>();

	// Analysis model factory
	private static PatternDependencyAnalysisFactory pdaFactory = PatternDependencyAnalysisFactory.eINSTANCE;

	/**
	 * Method called on diagram refresh (see {@link RefreshExtensionProvider} and
	 * org.eclipse.sirius.refreshExtensionProvider extension point.
	 */
	public static void clearVisitOnceFlags() {
		externalResourceProblemNotified.clear();
		visitedPatterns.clear();
	}

	/**
	 * Retrieve the patterns called through an egf:patternCall in the
	 * {@link PatternMethod} contained in {@code sourcePattern}. Method called by
	 * the "RelationPatternPatternCalls" relation definition in
	 * fcore.odesign:DiagramPatternHierarchy viewpoint representation.
	 * 
	 * @param sourcePattern The pattern to visit
	 * @return Returns the list of called Patterns.
	 */
	public List<Pattern> getAllMethodCalledPatterns(Pattern sourcePattern) {
		Map<PatternMethod, List<Pattern>> result = new HashMap<PatternMethod, List<Pattern>>();

		// Browse through methods
		sourcePattern.getMethods().stream().forEach(method -> {
			result.put(method, getCalledPatterns(method));
		});
		List<Pattern> returnValue = new ArrayList<Pattern>();
		result.entrySet().stream().forEach(entry -> returnValue.addAll(entry.getValue()));
		return returnValue;
	}

	/**
	 * Get all {@link Pattern} elements accessible (directly and indirectly through
	 * {@link Pattern} inheritance) from {@code viewpoint}. Format the result as xmi
	 * and csv files. Method called by the popup menu tool operation action "Export
	 * patterns analysis" defined in fcore.odesign:DiagramPatternHierarchy viewpoint
	 * representation.
	 * 
	 * @param viewpoint The viewpoint to analyze.
	 */
	public void exportViewpointPatterns(PatternViewpoint viewpoint) {
		List<PatternViewpoint> viewpoints = new ArrayList<PatternViewpoint>();
		Set<Pattern> containedPatterns = new HashSet<Pattern>();
		containedPatterns.addAll(getClosurePatternsFromViewpoint(viewpoint, viewpoints));
		exportAllMethodCalledPatterns(containedPatterns.stream().collect(Collectors.toList()));
	}

	/**
	 * Get all {@link Pattern} called through an EGF patternCall. {@code method}
	 * content is parsed.
	 * 
	 * @param method The method to visit.
	 * @return The list of called patterns.
	 */
	public List<Pattern> getCalledPatterns(PatternMethod method) {
		List<Pattern> result = new ArrayList<Pattern>();
		// Parse the code
		List<JETRootItem> parseRootItems = JETParser.parseRootItems(getMethodContent(method));
		parseRootItems.forEach(rootItem -> {
			if (rootItem instanceof JETDirectiveItem) {
				List<JETSubItem> children = rootItem.getChildren();
				// Search for patternCalls
				children.forEach(child -> {
					if (child instanceof JETAttributeListItem) {
						JETAttributeListItem attributeListItem = (JETAttributeListItem) child;
						JETAttributeItem patternCall = attributeListItem.getAttribute(PATTERN_CALL_ATTRIBUTE);
						if (patternCall != null) {
							JETTokenItem valueToken = patternCall.getValueToken();
							String text = valueToken.getText();
							// Retrieve the called pattern ID (in fact it is its qualified name)
							if (text.startsWith(PATTERN_ID)) {
								text = text.substring(11);
								text = text.substring(0, text.indexOf('"'));
								URI targetURI = URI.createURI(text, true);
								// Find the resource containing the called pattern
								Resource targetResource = method.getPattern().eResource().getResourceSet()
										.getResource(targetURI.trimFragment(), true);
								String[] fragments = targetURI.fragment().split(EQUAL_STRING);
								// Find the pattern. A call to targetResource.getEObject would have been nice
								// but it requires the called pattern Id instead of its qualified name.
								targetResource.getAllContents().forEachRemaining(obj -> {
									if (obj instanceof Pattern) {
										Pattern p = (Pattern) obj;
										PatternLibrary eContainer = (PatternLibrary) p.eContainer();
										String name = eContainer.getName() + DOT_STRING + p.getName();
										if (name.equals(fragments[1])) {
											result.add(p);
										}
									}
								});
							}
						}
					}
				});
			}
		});
		return result;
	}

	/**
	 * Retrieve the patterns called through an egf:patternCall in the
	 * {@link PatternMethod} contained in {@code sourcePattern}.
	 * 
	 * @param sourcePattern The pattern to visit
	 * @return Saves the list of called Patterns formated (xmi & csv)
	 */
	private boolean exportAllMethodCalledPatterns(List<Pattern> patterns) {
		// Generate CSV report for patterns analyses
		StringBuilder sBPatternAnalysis = new StringBuilder();
		sBPatternAnalysis.append(HEADER_PATTERN_ANALYSIS);
		sBPatternAnalysis.append(System.lineSeparator());

		// Generate CSV report for section analyses
		StringBuilder sBSectionAnalysis = new StringBuilder();
		sBSectionAnalysis.append(HEADER_SECTION_ANALYSIS);
		sBSectionAnalysis.append(System.lineSeparator());

		// Generate CSV report for pattern calls and inheritance analysis
		StringBuilder sBPatternHierarchyAnalysis = new StringBuilder();
		sBPatternHierarchyAnalysis.append(HEADER_PATTERN_HIERARCHY_ANALYSIS);
		sBPatternHierarchyAnalysis.append(System.lineSeparator());

		Root root = pdaFactory.createRoot();

		Map<Pattern, List<Pattern>> patternCalleeMap = new HashMap<Pattern, List<Pattern>>();
		Map<Pattern, List<Pattern>> patternChildMap = new HashMap<Pattern, List<Pattern>>();
		// Get content
		patterns.forEach(sourcePattern -> {
			getPatternContent(sourcePattern, sBPatternAnalysis, root, patternCalleeMap, patternChildMap);
		});

		// Set CalledBy and InheritedBy
		root.getPatterns().stream().forEach(patternAnalysis -> {
			sBPatternHierarchyAnalysis.append(getPatternFullLabel(patternAnalysis.getPattern()));
			sBPatternHierarchyAnalysis.append(CSV_COLUMN_SEPARATOR);
			
			List<Pattern> callees = patternCalleeMap.get(patternAnalysis.getPattern());
			if (callees != null) {
				patternAnalysis.getCalledBy().addAll(callees);
				sBPatternHierarchyAnalysis.append(CSV_CELL_DELIMITER + patternAnalysis.getCalledBy().stream().map(pat -> getPatternFullLabel(pat)).collect(Collectors.joining(CSV_CELL_NEWLINE_DELIMITER)) + CSV_CELL_DELIMITER);
			}
			
			sBPatternHierarchyAnalysis.append(CSV_COLUMN_SEPARATOR);
			
			List<Pattern> childs = patternChildMap.get(patternAnalysis.getPattern());
			if(childs != null) {
				patternAnalysis.getInheritedBy().addAll(childs);
				sBPatternHierarchyAnalysis.append(CSV_CELL_DELIMITER + patternAnalysis.getInheritedBy().stream().map(pat -> getPatternFullLabel(pat)).collect(Collectors.joining(CSV_CELL_NEWLINE_DELIMITER)) + CSV_CELL_DELIMITER);
			}
			
			sBPatternHierarchyAnalysis.append(CSV_COLUMN_SEPARATOR);
			sBPatternHierarchyAnalysis.append(getPatternFullLabel(patternAnalysis.getSuperPattern()));
			
			sBPatternHierarchyAnalysis.append(CSV_COLUMN_SEPARATOR);
			StringBuilder callsStr = new StringBuilder();
			callsStr.append(CSV_CELL_DELIMITER);
			patternAnalysis.getMethods().stream().map(PatternMethodAnalysis::getCalls).forEach(calls -> {
				String collectedString = calls.stream().map(PatternAnalysis::getPattern).map(pat -> getPatternFullLabel(pat)).collect(Collectors.joining(CSV_CELL_NEWLINE_DELIMITER));
				if (collectedString != "") {
					callsStr.append(collectedString);
					callsStr.append(CSV_CELL_NEWLINE_DELIMITER);
				}
			});;
			callsStr.append(CSV_CELL_DELIMITER);
			sBPatternHierarchyAnalysis.append(callsStr.toString());
			
			sBPatternHierarchyAnalysis.append(System.lineSeparator());
		});

		// Sort the patterns
		ECollections.sort(root.getPatterns(), new Comparator<PatternAnalysis>() {
			@Override
			public int compare(PatternAnalysis o1, PatternAnalysis o2) {
				String o1Name = o1.getPattern().getContainer().getName() + "." + o1.getPattern().getName();
				String o2Name = o2.getPattern().getContainer().getName() + "." + o2.getPattern().getName();
				return o1Name.compareTo(o2Name);
			}
		});

		// Sort the section analysis
		ECollections.sort(root.getSectionsAnalyses(), new Comparator<SectionAnalysis>() {
			@Override
			public int compare(SectionAnalysis o1, SectionAnalysis o2) {
				return o1.getSectionName().compareTo(o2.getSectionName());
			}
		});

		computeCSVForSectionAnalyses(sBSectionAnalysis, root);

		// Write to log
		Activator.getDefault().getLog().info(sBPatternAnalysis.toString());

		// Write to output files
		writeOutputFiles(sBPatternAnalysis, sBSectionAnalysis, sBPatternHierarchyAnalysis, root);

		return true;
	}

	private void writeOutputFiles(StringBuilder sBPatternAnalysis, StringBuilder sBSectionAnalysis, StringBuilder sBPatternHierarchyAnalysis, Root root) {
		// Write model to file
		ResourceSet resourceSet = new ResourceSetImpl();
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("pda", new XMIResourceFactoryImpl());
		Shell activeShell = Display.getDefault().getActiveShell();
		FileDialog fileXMISave = new FileDialog(activeShell, SWT.SAVE);
		fileXMISave.setFileName("Patterns_Analysis.pda");
		String outFilePath = fileXMISave.open();
		if (outFilePath != null) {
			// Write model
			try {
				URI fileURI = URI.createFileURI(new File(outFilePath).getAbsolutePath());
				Resource resource = resourceSet.createResource(fileURI);
				resource.getContents().add(root);
				resource.save(Collections.EMPTY_MAP);
			} catch (IOException e) {
				Activator.getDefault().getLog().error("Error while writing output pda file: " + outFilePath, e);
			}
			// Write csv files
			try {
				FileWriter outPatternsFile = new FileWriter(outFilePath + "_patterns.csv");
				outPatternsFile.write(sBPatternAnalysis.toString());
				outPatternsFile.close();

				FileWriter outSectionsFile = new FileWriter(outFilePath + "_sections.csv");
				outSectionsFile.write(sBSectionAnalysis.toString());
				outSectionsFile.close();
				
				FileWriter outHierarchyFile = new FileWriter(outFilePath + "_patterns_hierarchy.csv");
				outHierarchyFile.write(sBPatternHierarchyAnalysis.toString());
				outHierarchyFile.close();
			} catch (IOException e) {
				Activator.getDefault().getLog().error("Error while writing output csv file: " + outFilePath, e);
			}
		}
	}

	private void computeCSVForSectionAnalyses(StringBuilder sBSectionAnalysis, Root root) {
		root.getSectionsAnalyses().stream().forEach(sa -> {
			// One CSV line for each section / pattern couple
			sa.getContributingPatterns().stream().map(pattern -> {
				// Pattern name
				String patternName = getPatternFullLabel(pattern);
				// Pattern parameters and inherited parameters
				String patternParameters = CSV_CELL_DELIMITER + pattern.getAllParameters().stream().map(param -> {
					return getPatternParameterLabel(param);
				}).collect(Collectors.joining(CSV_CELL_NEWLINE_DELIMITER)) + CSV_CELL_DELIMITER;
				// Pattern preCondition method content
				String preConditionContent = CSV_CELL_DELIMITER + getMethodContent(pattern.getConditionMethod())
						+ CSV_CELL_DELIMITER;
				return sa.getSectionName() + CSV_COLUMN_SEPARATOR + patternName + CSV_COLUMN_SEPARATOR
						+ patternParameters + CSV_COLUMN_SEPARATOR + preConditionContent;
			}).forEach(sectionLine -> {
				sBSectionAnalysis.append(sectionLine);
				sBSectionAnalysis.append(System.lineSeparator());
			});
		});
	}

	/**
	 * Get content of {@code sourcePattern} formated as CSV
	 * 
	 * @param sourcePattern     The {@link Pattern} to analyse
	 * @param sBPatternAnalysis The {@link StringBuilder} containing the CSV content
	 *                          for pattern analysis
	 * @param root              The root of the PDA model
	 * @param patternCalleeMap  A map populated with list of patterns calling a
	 *                          pattern.
	 * @param patternChildMap   A map populated with list of patterns inheriting a
	 *                          pattern.
	 */
	private void getPatternContent(Pattern sourcePattern, StringBuilder sBPatternAnalysis, Root root,
			Map<Pattern, List<Pattern>> patternCalleeMap, Map<Pattern, List<Pattern>> patternChildMap) {
		Map<PatternMethod, List<Pattern>> patternCallResults = new HashMap<PatternMethod, List<Pattern>>();
		Map<PatternMethod, List<String>> patternSectionsResults = new HashMap<PatternMethod, List<String>>();

		PatternAnalysis patternAnalysis = pdaFactory.createPatternAnalysis();
		patternAnalysis.setPattern(sourcePattern);

		// Visit a pattern only once
		if (visitedPatterns.contains(sourcePattern)) {
			return;
		}

		String parameters = "";
		if (sourcePattern.getAllParameters() != null) {
			parameters += CSV_CELL_DELIMITER + sourcePattern.getAllParameters().stream().map(param -> {
				return getPatternParameterLabel(param);
			}).collect(Collectors.joining(CSV_CELL_NEWLINE_DELIMITER)) + CSV_CELL_DELIMITER;

			patternAnalysis.getParameters().addAll(sourcePattern.getAllParameters().stream().map(param -> {
				PatternParameterAnalysis patternParameterAnalysis = pdaFactory.createPatternParameterAnalysis();
				patternParameterAnalysis.setName(param.getName());
				patternParameterAnalysis.setType(param.getType());
				return patternParameterAnalysis;
			}).collect(Collectors.toList()));
		}

		String superPatternStr = "";
		Pattern superPattern = sourcePattern.getSuperPattern();
		if (superPattern != null) {
			superPatternStr = getPatternFullLabel(superPattern);
			patternAnalysis.setSuperPattern(superPattern);
			if (patternChildMap.containsKey(superPattern)) {
				patternChildMap.get(superPattern).add(sourcePattern);
			} else {
				List<Pattern> patterns = new ArrayList<Pattern>();
				patterns.add(sourcePattern);
				patternChildMap.put(superPattern, patterns);
			}
		}
		String sourceFormatedString = sourcePattern.getContainer().getName() + DOT_STRING + sourcePattern.getName()
				+ CSV_COLUMN_SEPARATOR + parameters + CSV_COLUMN_SEPARATOR + superPatternStr;

		// Browse through methods
		EList<PatternMethod> methods = sourcePattern.getMethods();
		PatternMethod preConditionMethod = sourcePattern.getConditionMethod();
		if (preConditionMethod != null) {
			methods.add(preConditionMethod);
		}

		int length = sBPatternAnalysis.length();
		methods.stream().forEach(method -> {
			addMethodContent(patternAnalysis, method, root);
			List<Pattern> calledPatterns = getCalledPatterns(method);

			calledPatterns.stream().forEach(calledPattern -> {
				if (patternCalleeMap.containsKey(calledPattern)) {
					patternCalleeMap.get(calledPattern).add(sourcePattern);
				} else {
					List<Pattern> patterns = new ArrayList<Pattern>();
					patterns.add(sourcePattern);
					patternCalleeMap.put(calledPattern, patterns);
				}
			});

			List<String> methodSections = getMethodSections(method);
			patternCallResults.put(method, calledPatterns);
			patternSectionsResults.put(method, methodSections);

			// Build cell string for calls
			String patternCallsCellStr = "";
			if (!calledPatterns.isEmpty()) {
				patternCallsCellStr = CSV_CELL_DELIMITER + calledPatterns.stream().map(calledPattern -> {
					return getPatternFullLabel(calledPattern);
				}).collect(Collectors.joining(CSV_CELL_NEWLINE_DELIMITER)) + CSV_CELL_DELIMITER;
			}

			// Build cell string for sections
			String methodSectionsCellStr = "";
			if (!methodSections.isEmpty()) {
				methodSectionsCellStr = CSV_CELL_DELIMITER
						+ methodSections.stream().collect(Collectors.joining(CSV_CELL_NEWLINE_DELIMITER))
						+ CSV_CELL_DELIMITER;
			}

			boolean isPreConditionMethod = method.equals(preConditionMethod);
			String methodName = isPreConditionMethod ? "preCondition" : method.getName();
			boolean isPreconditionContentOfInterest = isPreConditionMethod ? !getMethodContent(method).equals("")
					: false;
			if (!patternCallsCellStr.equals("") || !methodSectionsCellStr.equals("")
					|| isPreconditionContentOfInterest) {
				sBPatternAnalysis.append(sourceFormatedString + CSV_COLUMN_SEPARATOR + methodName + CSV_COLUMN_SEPARATOR
						+ patternCallsCellStr + CSV_COLUMN_SEPARATOR + methodSectionsCellStr);
				if (method.equals(preConditionMethod)) {
					sBPatternAnalysis.append(CSV_COLUMN_SEPARATOR + getMethodContent(method));
				}
				sBPatternAnalysis.append(System.lineSeparator());
			}
		});

		if (sBPatternAnalysis.length() == length) {
			// Nothing have been printed
			sBPatternAnalysis.append(sourceFormatedString);
			sBPatternAnalysis.append(System.lineSeparator());
		}

		root.getPatterns().add(patternAnalysis);
		visitedPatterns.add(sourcePattern);
	}

	private String getPatternFullLabel(Pattern pattern) {
		if (pattern != null) {
			return pattern.getContainer().getName() + DOT_STRING + pattern.getName();
		} else {
			return "";
		}
	}

	private String getPatternParameterLabel(PatternParameter param) {
		return param.getName() + ":" + param.getType();
	}

	/**
	 * Create a {@link PatternMethodAnalysis} element for {@code method} and adds it
	 * to {@code patternAnalysis}.
	 * 
	 * @param patternAnalysis The pattern analysis to populate.
	 * @param method          The method to analyze.
	 * @param root            The root of the analysis model.
	 */
	private void addMethodContent(PatternAnalysis patternAnalysis, PatternMethod method, Root root) {
		PatternMethodAnalysis patternMethodAnalysis = pdaFactory.createPatternMethodAnalysis();
		patternMethodAnalysis.setContent(getMethodContent(method));
		patternMethodAnalysis.setMethod(method);

		// Get pattern calls
		patternMethodAnalysis.getCalls().addAll(getCalledPatterns(method).stream().map(calledPattern -> {
			PatternAnalysis calledPatternAnalysis = pdaFactory.createPatternAnalysis();
			calledPatternAnalysis.setPattern(calledPattern);
			calledPatternAnalysis.setSuperPattern(calledPattern.getSuperPattern());
			return calledPatternAnalysis;
		}).collect(Collectors.toList()));

		// Get sections contributions
		getMethodSections(method).stream().forEach(section -> {
			patternMethodAnalysis.getSectionContributions().add(section);
			List<SectionAnalysis> matchingSA = root.getSectionsAnalyses().stream()
					.filter(sa -> sa.getSectionName().equals(section)).collect(Collectors.toList());
			Pattern analysedPattern = patternAnalysis.getPattern();
			if (matchingSA.isEmpty()) {
				SectionAnalysis sa = pdaFactory.createSectionAnalysis();
				sa.setSectionName(section);
				sa.getContributingPatterns().add(analysedPattern);
				root.getSectionsAnalyses().add(sa);
			} else {
				matchingSA.get(0).getContributingPatterns().add(analysedPattern);
			}
		});

		// Get methods
		patternAnalysis.getMethods().add(patternMethodAnalysis);
	}

	/**
	 * Get all {@link Pattern} elements accessible (directly and indirectly through
	 * {@link Pattern} inheritance) from {@code viewpoint}.
	 * 
	 * @param viewpoint     The viewpoint to visit.
	 * @param lstViewpoints The viewpoints already visited.
	 * @return The {@link Pattern found}
	 */
	private Set<Pattern> getClosurePatternsFromViewpoint(PatternViewpoint viewpoint,
			List<PatternViewpoint> lstViewpoints) {
		lstViewpoints.add(viewpoint);
		Set<Pattern> containedPatterns = new HashSet<Pattern>();
		// In all libraries
		viewpoint.getLibraries().forEach(library -> {
			// all patterns
			library.getElements().forEach(element -> {
				// store pattern
				containedPatterns.add(element);
				// get parent
				Pattern parent = element.getSuperPattern();
				if (parent != null) {
					// store parent
					containedPatterns.add(parent);
					// get parent library and viewpoint
					if (parent.getContainer() != library
							&& !lstViewpoints.contains(parent.getContainer().getPatternViewpoint())) {
						// and recurse
						containedPatterns.addAll(getClosurePatternsFromViewpoint(
								parent.getContainer().getPatternViewpoint(), lstViewpoints));
					}
				}
			});
		});
		return containedPatterns;
	}

	/**
	 * Get all html section declarations contained in {@code method} template.
	 * {@code method} content is parsed. Html sections shall be contained in a
	 * single {@link JETLiteralItem} to be found.
	 * 
	 * @param method The method to visit.
	 * @return The list of HTML sections (<h\d>...</h\d>).
	 */
	private List<String> getMethodSections(PatternMethod method) {
		List<String> result = new ArrayList<String>();
		// Parse the code
		List<JETRootItem> parseRootItems = JETParser.parseRootItems(getMethodContent(method));
		parseRootItems.forEach(rootItem -> {
			if (rootItem instanceof JETLiteralItem) {
				JETLiteralItem item = (JETLiteralItem) rootItem;
				java.util.regex.Pattern hPattern = java.util.regex.Pattern.compile(SECTION_PATTERN,
						java.util.regex.Pattern.DOTALL);
				Matcher matcher = hPattern.matcher(item.getText());
				if (matcher.find()) {
					result.add(matcher.group().replaceAll(LINEBREAK_PATTERN, ""));
				}

				java.util.regex.Pattern divPattern = java.util.regex.Pattern.compile(DIV_PATTERN,
						java.util.regex.Pattern.DOTALL);
				Matcher divMatcher = divPattern.matcher(item.getText());
				if (divMatcher.find()) {
					result.add(divMatcher.group().replaceAll(LINEBREAK_PATTERN, "").replaceAll("\"", ""));
				}

			}
		});
		return result;
	}

	/**
	 * Retrieve a {@link PatternMethod} content.
	 * 
	 * @param method The method.
	 */
	private String getMethodContent(PatternMethod method) {
		// Retrieve the pattern containing the method's code
		IFile methodPatternFile = getPatternMethodFile(method);
		if (methodPatternFile != null) {
			// Parse the code
			return readFile(methodPatternFile);
		}
		return "";
	}

	/**
	 * Retrieve a {@link PatternMethod} file.
	 * 
	 * @param method The method containing a link to its {@link Pattern}.
	 */
	private IFile getPatternMethodFile(PatternMethod method) {
		if (method != null) {
			Pattern sourcePattern = method.getPattern();
			if (method.getPatternFilePath().isPlatformPlugin()) {
				IResource resource = ResourcesPlugin.getWorkspace().getRoot()
						.findMember(method.getPatternFilePath().toPlatformString(true));

				IProject project = resource.getProject();
				if (project != null) {
					JetPatternInitializer methodPatternInitializer = new JetPatternInitializer(project, sourcePattern);
					return methodPatternInitializer.getFile(method);
				}
			} else {
				IProject project = EMFHelper.getProject(sourcePattern.eResource());
				if (project != null) {
					JetPatternInitializer patternInitializer = new JetPatternInitializer(project, sourcePattern);
					return patternInitializer.getFile(method);
				} else {
					// Notify this problem only once per service call
					String resourceURI = method.eResource().getURI().toFileString();
					if (!externalResourceProblemNotified.contains(resourceURI)) {
						Activator.getDefault().getLog().error(
								"Impossible to retrieve project, please try to load resource project into workspace: "
										+ resourceURI);
						externalResourceProblemNotified.add(resourceURI);
					}
				}
			}
		}
		return null;
	}

	/**
	 * Read a file content.
	 * 
	 * @param file The file to be red.
	 * @return The file content.
	 */
	private String readFile(IFile file) {
		StringBuilder inputContent = new StringBuilder("");
		try {
			BufferedReader buf = new BufferedReader(new InputStreamReader(file.getContents()));

			final int length = 10000;
			int read = length;
			char[] fileData = new char[length];
			while (read == length) {
				read = buf.read(fileData, 0, length);
				if (read > 0) {
					inputContent.append(fileData, 0, read);
				}
			}
			buf.close();
		} catch (CoreException | IOException e) {
			Activator.getDefault().getLog().error("Error while parsing file " + file.getLocationURI().toString(), e);
		}
		return inputContent.toString();
	}
}

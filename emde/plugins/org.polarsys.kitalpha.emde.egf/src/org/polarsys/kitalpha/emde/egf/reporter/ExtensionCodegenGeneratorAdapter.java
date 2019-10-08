/*******************************************************************************
 * Copyright (c) 2014 Thales Global Services S.A.S.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *  
 * Contributors:
 *   Thales Global Services S.A.S - initial API and implementation
 *******************************************************************************/
package org.polarsys.kitalpha.emde.egf.reporter;

import java.io.OutputStream;
import java.text.MessageFormat;

import org.eclipse.egf.common.generator.EGFJMerger;
import org.eclipse.egf.emf.pattern.base.CodegenGeneratorAdapter;
import org.eclipse.egf.emf.pattern.base.StringJETEmitter;
import org.eclipse.emf.codegen.ecore.CodeGenEcorePlugin;
import org.eclipse.emf.codegen.ecore.generator.Generator;
import org.eclipse.emf.codegen.ecore.genmodel.GenBase;
import org.eclipse.emf.codegen.jet.JETEmitter;
import org.eclipse.emf.codegen.merge.java.JControlModel;
import org.eclipse.emf.codegen.merge.java.JMerger;
import org.eclipse.emf.codegen.util.CodeGenUtil;
import org.eclipse.emf.common.util.BasicMonitor;
import org.eclipse.emf.common.util.Monitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.common.util.WrappedException;

/**
 * @author Xavier Maysonnave
 * 
 */
public class ExtensionCodegenGeneratorAdapter extends CodegenGeneratorAdapter {

	public ExtensionCodegenGeneratorAdapter(GenBase generatingObject) {
		super(generatingObject);
	}

	@Override
	public void generateJava(String targetPath, String packageName, String className, String output) {
		generateJava(targetPath, packageName, className, new StringJETEmitter(output), (Object[]) null, new BasicMonitor());
	}

	/**
	 * Generates a Java source file using JET, with
	 * {@link org.eclipse.emf.codegen.util.ImportManager import management} and,
	 * when running under Eclipse,
	 * {@link org.eclipse.emf.codegen.merge.java.JMerger merging} and
	 * {@link org.eclipse.jdt.core.formatter.CodeFormatter code formatting}
	 * capabilities.
	 * 
	 * <p>
	 * When running under Eclipse, the encoding for the file is determined from
	 * the workspace. Failing that, or in stand-alone, the platform default is
	 * used.
	 * 
	 * @param targetPath
	 *            the workspace path of the directory in or under which the file
	 *            will be created, depending on the specified package name. When
	 *            running stand-alone, this path will be converted to a platform
	 *            resource URI that should be mapped to a physical file URI by
	 *            the {@link #getURIConverter() URIConverter}.
	 * @param packageName
	 *            the package name for the generated compilation unit.
	 * @param className
	 *            the name of the public class in the generated compilation
	 *            unit.
	 * @param jetEmitter
	 *            the <code>JETEmitter</code> to use for generating the code.
	 * @param arguments
	 *            the argument array to pass to the <code>JETEmitter</code>'s
	 *            {@link JETEmitter#generate(Monitor, Object[])
	 *            generate(Monitor, Object[])} method. If null, an array will be
	 *            constructed containing only the {@link #generatingObject
	 *            object} for which code is being generated.
	 * @param monitor
	 *            the <code>Monitor</code> through which to report progress.
	 * 
	 *            <p>
	 *            This method also consults the following
	 *            {@link Generator#getOptions() generator options}:
	 *            <ul>
	 * 
	 *            <li>{@link Generator.Options#redirectionPattern
	 *            redirectionPattern}
	 *            <li>
	 *            {@link Generator.Options#forceOverwrite forceOverwrite}
	 *            <li>
	 *            {@link Generator.Options#dynamicTemplates dynamicTemplates}
	 *            <li>
	 *            {@link Generator.Options#mergerFacadeHelperClass
	 *            mergerFacadeHelperClass}
	 *            <li>
	 *            {@link Generator.Options#mergeRulesURI mergeRulesURI}
	 *            <li>
	 *            {@link Generator.Options#codeFormatting codeFormatting}
	 *            <li>
	 *            {@link Generator.Options#codeFormatterOptions
	 *            codeFormatterOptions}
	 *            <li>
	 *            {@link Generator.Options#resourceSet resourceSet}
	 *            </ul>
	 */
	@Override
	protected void generateJava(String targetPath, String packageName, String className, JETEmitter jetEmitter, Object[] arguments, Monitor monitor) {
		try {
			monitor.beginTask("", 4); //$NON-NLS-1$

			URI targetDirectory = toURI(targetPath).appendSegments(packageName.split("\\.")); //$NON-NLS-1$
			URI targetFile = targetDirectory.appendSegment(className + ".java"); //$NON-NLS-1$
			monitor.subTask(CodeGenEcorePlugin.INSTANCE.getString("_UI_Generating_message", new Object[] { targetFile })); //$NON-NLS-1$

			ensureContainerExists(targetDirectory, createMonitor(monitor, 1));

			if (arguments == null) {
				arguments = new Object[] { generatingObject };
			}
			createImportManager(packageName, className);
			setLineDelimiter(getLineDelimiter(targetFile, getEncoding(targetFile)));
			String emitterResult = jetEmitter.generate(createMonitor(monitor, 1), arguments, getLineDelimiter());

			boolean changed = true;
			String newContents = emitterResult;
			boolean targetExists = exists(targetFile);

			JControlModel jControlModel = getGenerator().getJControlModel();
			boolean mergeSuccessful = jControlModel.canMerge();

			// DMS This is not right. It replaced
			// "if (EMFPlugin.IS_ECLIPSE_RUNNING)" but can also be
			// false if an invalid facade has been specified.
			if (mergeSuccessful) {
				JMerger jMerger = new EGFJMerger(jControlModel);
				jMerger.setFixInterfaceBrace(jControlModel.getFacadeHelper().fixInterfaceBrace());

				try {
					jMerger.setSourceCompilationUnit(jMerger.createCompilationUnitForContents(emitterResult));
				} catch (RuntimeException runtimeException) {
					if (targetExists) {
						throw runtimeException;
					}
					mergeSuccessful = false;
				}

				if (mergeSuccessful) {
					// Create a code formatter for this compilation unit, if
					// needed.
					//
					Object codeFormatter = getGenerator().getOptions().codeFormatting ? createCodeFormatter(getGenerator().getOptions().codeFormatterOptions, targetFile) : null;

					if (targetExists) {
						monitor.subTask(CodeGenEcorePlugin.INSTANCE.getString("_UI_ExaminingOld_message", new Object[] { targetFile })); //$NON-NLS-1$
						jMerger.setTargetCompilationUnit(jMerger.createCompilationUnitForInputStream(createInputStream(targetFile), getEncoding(targetFile)));
						String oldContents = jMerger.getTargetCompilationUnitContents();

						monitor.subTask(CodeGenEcorePlugin.INSTANCE.getString("_UI_PreparingNew_message", new Object[] { targetFile })); //$NON-NLS-1$
						jMerger.merge();

						newContents = formatCode(jMerger.getTargetCompilationUnitContents(), codeFormatter);
						changed = !oldContents.equals(newContents);

						// If the target is read-only, we can ask the platform
						// to release it, and it may be
						// updated in the process.
						//
						if (changed && isReadOnly(targetFile) && validateEdit(targetFile, createMonitor(monitor, 1))) {
							jMerger.setTargetCompilationUnit(jMerger.createCompilationUnitForInputStream(createInputStream(targetFile), getEncoding(targetFile)));
							jMerger.remerge();
							newContents = formatCode(jMerger.getTargetCompilationUnitContents(), codeFormatter);
						}
					} else {
						changed = true;
						monitor.subTask(CodeGenEcorePlugin.INSTANCE.getString("_UI_PreparingNew_message", new Object[] { targetFile })); //$NON-NLS-1$

						jMerger.merge();
						newContents = formatCode(jMerger.getTargetCompilationUnitContents(), codeFormatter);
					}

					if (jControlModel.getFacadeHelper() != null) {
						jControlModel.getFacadeHelper().reset();
					}
				}
			}

			if (!mergeSuccessful) {
				// DMS What if Eclipse is running, but an invalid facade has
				// been specified? We still should
				// format code, use encoding,...
				newContents = CodeGenUtil.convertFormat(jControlModel.getLeadingTabReplacement(), jControlModel.convertToStandardBraceStyle(), emitterResult);
				if (targetExists) {
					monitor.subTask(CodeGenEcorePlugin.INSTANCE.getString("_UI_ExaminingOld_message", new Object[] { targetFile })); //$NON-NLS-1$
					String oldContents = getContents(targetFile, null);
					changed = !oldContents.equals(newContents);
				} else {
					changed = true;
				}
			}
			monitor.worked(1);

			if (changed) {
				String encoding = getEncoding(targetFile);
				byte[] bytes = encoding == null ? newContents.getBytes() : newContents.getBytes(encoding);

				// Apply a redirection pattern, if specified.
				//
				String redirection = getGenerator().getOptions().redirectionPattern;
				boolean redirect = redirection != null && redirection.indexOf("{0}") != -1; //$NON-NLS-1$

				if (redirect) {
					String baseName = MessageFormat.format(redirection, new Object[] { className + ".java" }); //$NON-NLS-1$
					targetFile = targetDirectory.appendSegment(baseName);
					monitor.subTask(CodeGenEcorePlugin.INSTANCE.getString("_UI_UsingAlternate_message", new Object[] { targetFile })); //$NON-NLS-1$
				}

				if (isReadOnly(targetFile)) {
					if (getGenerator().getOptions().forceOverwrite) {
						setWriteable(targetFile);
					} else {
						targetFile = targetDirectory.appendSegment("." + className + ".java.new"); //$NON-NLS-1$ //$NON-NLS-2$
						monitor.subTask(CodeGenEcorePlugin.INSTANCE.getString("_UI_UsingDefaultAlternate_message", new Object[] { targetFile })); //$NON-NLS-1$
					}
				}

				OutputStream outputStream = createOutputStream(targetFile);
				outputStream.write(bytes);
				outputStream.close();
			}
		} catch (Exception e) {
			// DMS Do a better job with specific exceptions? Just use chained
			// RuntimeExceptions?
			throw e instanceof RuntimeException ? (RuntimeException) e : new WrappedException(e);
		}
		// catch (JETException exception)
		// {
		// CodeGenEcorePlugin.INSTANCE.log(exception);
		// }
		// catch (Exception exception)
		// {
		// CodeGenEcorePlugin.INSTANCE.log(exception);
		// }
		finally {
			clearImportManager();
			setLineDelimiter(null);
			monitor.done();
		}
	}

}

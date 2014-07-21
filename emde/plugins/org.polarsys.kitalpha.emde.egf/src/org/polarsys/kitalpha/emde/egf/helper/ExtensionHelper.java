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
package org.polarsys.kitalpha.emde.egf.helper;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.emf.codegen.ecore.genmodel.GenClass;
import org.eclipse.emf.codegen.ecore.genmodel.GenModel;
import org.eclipse.emf.codegen.ecore.genmodel.GenPackage;
import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticException;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.common.util.UniqueEList;
import org.eclipse.emf.common.util.WrappedException;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.osgi.util.NLS;
import org.polarsys.kitalpha.emde.egf.l10n.Messages;
import org.polarsys.kitalpha.emde.extension.utils.ExtensionAnnotationsHelper;

/**
 * @author Xavier Maysonnave
 * 
 */
public class ExtensionHelper {

	private static final List<String> javaReservedKeyWords;

	static {
		List<String> keywords = new ArrayList<String>();
		/* java keyword */
		keywords.add("abstract"); //$NON-NLS-1$
		keywords.add("assert"); //$NON-NLS-1$    
		keywords.add("boolean"); //$NON-NLS-1$
		keywords.add("break"); //$NON-NLS-1$
		keywords.add("byte"); //$NON-NLS-1$
		keywords.add("case"); //$NON-NLS-1$
		keywords.add("catch"); //$NON-NLS-1$
		keywords.add("char"); //$NON-NLS-1$
		keywords.add("class"); //$NON-NLS-1$
		keywords.add("const"); //$NON-NLS-1$    
		keywords.add("continue"); //$NON-NLS-1$
		keywords.add("default"); //$NON-NLS-1$
		keywords.add("do"); //$NON-NLS-1$
		keywords.add("double"); //$NON-NLS-1$
		keywords.add("else"); //$NON-NLS-1$
		keywords.add("enum"); //$NON-NLS-1$    
		keywords.add("extends"); //$NON-NLS-1$
		keywords.add("final"); //$NON-NLS-1$
		keywords.add("finally"); //$NON-NLS-1$
		keywords.add("float"); //$NON-NLS-1$
		keywords.add("for"); //$NON-NLS-1$
		keywords.add("goto"); //$NON-NLS-1$    
		keywords.add("if"); //$NON-NLS-1$
		keywords.add("implements"); //$NON-NLS-1$
		keywords.add("import"); //$NON-NLS-1$
		keywords.add("instanceof"); //$NON-NLS-1$
		keywords.add("int"); //$NON-NLS-1$
		keywords.add("interface"); //$NON-NLS-1$
		keywords.add("long"); //$NON-NLS-1$
		keywords.add("native"); //$NON-NLS-1$
		keywords.add("new"); //$NON-NLS-1$
		keywords.add("package"); //$NON-NLS-1$
		keywords.add("private"); //$NON-NLS-1$
		keywords.add("protected"); //$NON-NLS-1$
		keywords.add("public"); //$NON-NLS-1$
		keywords.add("return"); //$NON-NLS-1$
		keywords.add("short"); //$NON-NLS-1$
		keywords.add("static"); //$NON-NLS-1$
		keywords.add("strictfp"); //$NON-NLS-1$
		keywords.add("super"); //$NON-NLS-1$
		keywords.add("switch"); //$NON-NLS-1$
		keywords.add("synchronized"); //$NON-NLS-1$
		keywords.add("this"); //$NON-NLS-1$
		keywords.add("throw"); //$NON-NLS-1$
		keywords.add("throws"); //$NON-NLS-1$
		keywords.add("transient"); //$NON-NLS-1$
		keywords.add("try"); //$NON-NLS-1$
		keywords.add("void"); //$NON-NLS-1$
		keywords.add("volatile"); //$NON-NLS-1$
		keywords.add("while"); //$NON-NLS-1$
		/* java literal values keyword */

		keywords.add("false"); //$NON-NLS-1$    
		keywords.add("null"); //$NON-NLS-1$
		keywords.add("true"); //$NON-NLS-1$    
		javaReservedKeyWords = Collections.unmodifiableList(keywords);
	}

	private ExtensionHelper() {
		// Prevent instantiation
	}

	public static boolean isJavaKeyword(String name) {
		return javaReservedKeyWords.contains(name.trim().toLowerCase());
	}

	public static boolean isValidJavaName(String name) {
		boolean result = false;
		if (name.trim().length() > 0) {
			int length = name.length();
			if ((length > 0) && Character.isJavaIdentifierStart(name.codePointAt(0))) {
				result = true;
				for (int i = Character.offsetByCodePoints(name, 0, 1); i < length; i = Character.offsetByCodePoints(name, i, 1)) {
					if (!Character.isJavaIdentifierPart(name.codePointAt(i))) {
						result = false;
						break;
					}
				}
			}
		}

		return result;
	}

	public static boolean hasChildCreationExtenders(GenModel genModel) {
		if (genModel == null) {
			return false;
		}
		for (GenPackage genPackage : genModel.getAllGenPackagesWithClassifiers()) {
			// Process GenPackage
			if (genPackage.isChildCreationExtenders()) {
				return true;
			}
		}
		return false;
	}

	public static boolean hasExtensibleProviderFactory(GenModel genModel) {
		if (genModel == null) {
			return false;
		}
		for (GenPackage genPackage : genModel.getAllGenPackagesWithClassifiers()) {
			// Process GenPackage
			if (genPackage.isExtensibleProviderFactory()) {
				return true;
			}
		}
		return false;
	}

	// Helpers
	public static boolean isTrackResourceModification(GenPackage genPackage) {
		return ExtensionAnnotationsHelper.isTrackResourceModification(genPackage.getEcorePackage());
	}

	public static boolean isUseIDAttributes(GenPackage genPackage) {
		return ExtensionAnnotationsHelper.isUseIDAttributes(genPackage.getEcorePackage());
	}

	public static boolean isUseUUIDS(GenPackage genPackage) {
		return ExtensionAnnotationsHelper.isUseUUIDS(genPackage.getEcorePackage());
	}

	public static boolean isImplemented(EClass eClass, EClass implementedEClass) {
		if ((eClass == null) || (eClass.getName() == null) || (implementedEClass == null) || (implementedEClass.getName() == null)) {
			return false;
		}
		// Current Class
		if ((eClass.getEPackage() != null) && (eClass.getEPackage().getNsURI() != null) && (implementedEClass.getEPackage() != null)) {
			if (eClass.getEPackage().getNsURI().equals(implementedEClass.getEPackage().getNsURI()) && eClass.getName().equals(implementedEClass.getName())) {
				return true;
			}
		}
		// SuperClass
		if (implementedEClass.getEPackage() != null) {
			for (EClass superType : eClass.getEAllSuperTypes()) {
				if ((superType.getEPackage() != null) && (superType.getEPackage().getNsURI() != null) && (superType.getName() != null)) {
					if (superType.getEPackage().getNsURI().equals(implementedEClass.getEPackage().getNsURI()) && superType.getName().equals(implementedEClass.getName())) {
						return true;
					}
				}
			}
		}
		return false;
	}

	public static Map<GenPackage, Map<GenClass, List<GenClass.ChildCreationData>>> getExtendedChildCreationData(GenPackage genPackage) throws CoreException {
		GenModel genModel = genPackage.getGenModel();
		Map<GenPackage, Map<GenClass, List<GenClass.ChildCreationData>>> result = new LinkedHashMap<GenPackage, Map<GenClass, List<GenClass.ChildCreationData>>>();
		List<GenPackage> allUsedGenPackagesWithClassifiers = genModel.getAllUsedGenPackagesWithClassifiers();
		// Retrieve annotated GenPackages, filter them if necessary
		for (GenPackage processedGenPackage : getUsedGenPackages(genPackage)) {
			if (processedGenPackage.hasClassifiers() && (allUsedGenPackagesWithClassifiers.contains(processedGenPackage) == false)) {
				EcoreUtil.resolveAll(processedGenPackage);
				genModel.getUsedGenPackages().add(processedGenPackage);
			}
		}
		// Process genPackage
		for (GenPackage processedGenPackage : genModel.getAllUsedGenPackagesWithClassifiers()) {
			for (GenClass genClass : processedGenPackage.getGenClasses()) {
				List<GenClass.ChildCreationData> allChildCreationData = genClass.getChildCreationData(genModel);
				for (GenClass.ChildCreationData childCreationData : allChildCreationData) {
					// It belongs to this package if the delegate feature is
					// from this package,
					// or the class is from this package and either there is no
					// delegate feature or the delegate feature is from some
					// used package.
					if (((childCreationData.delegatedFeature != null) && (childCreationData.delegatedFeature.getGenPackage() == genPackage)) || ((childCreationData.createClassifier.getGenPackage() == genPackage) && ((childCreationData.delegatedFeature == null) || allUsedGenPackagesWithClassifiers.contains(childCreationData.delegatedFeature.getGenPackage())))) {
						GenClass featureClass = childCreationData.createFeature.getGenClass();
						GenPackage featureGenPackage = featureClass.getGenPackage();
						Map<GenClass, List<GenClass.ChildCreationData>> map = result.get(featureGenPackage);
						if (map == null) {
							result.put(featureGenPackage, map = new LinkedHashMap<GenClass, List<GenClass.ChildCreationData>>());
						}
						List<GenClass.ChildCreationData> data = map.get(featureClass);
						if (data == null) {
							map.put(featureClass, data = new UniqueEList<GenClass.ChildCreationData>());
						}
						data.add(childCreationData);
					}
				}
			}
		}

		return result;
	}

	public static List<GenPackage> getUsedGenPackages(GenPackage genPackage) throws CoreException {
		BasicDiagnostic diagnostic = new BasicDiagnostic();
		List<GenPackage> genPackages = new ArrayList<GenPackage>();
		if ((genPackage == null) || (genPackage.eResource() == null)) {
			return genPackages;
		}
		ResourceSet resourceSet = genPackage.eResource().getResourceSet();
		if (resourceSet == null) {
			resourceSet = new ResourceSetImpl();
		}
		for (String detail : ExtensionAnnotationsHelper.getUsedGenPackages(genPackage.getEcorePackage())) {
			URI uri = URI.createURI(detail);
			if (uri.isRelative()) {
				diagnostic.add(new BasicDiagnostic(Diagnostic.ERROR, "org.polarsys.kitalpha.emde.egf", 0, NLS.bind(Messages.ExtensionHelper_Relative_URI_Error, genPackage.getEcorePackage().getName(), detail), null));
			}
			try {
				EObject eObject = resourceSet.getEObject(uri, true);
				if (eObject instanceof GenPackage && (genPackages.contains(eObject) == false)) {
					GenPackage processedGenPackage = (GenPackage) eObject;
					processedGenPackage.getGenModel().setImportManager(genPackage.getGenModel().getImportManager());
					genPackages.add(processedGenPackage);
				}
			} catch (WrappedException we) {
				diagnostic.add(new BasicDiagnostic(Diagnostic.ERROR, "org.polarsys.kitalpha.emde.egf", 0, NLS.bind(Messages.ExtensionHelper_URI_Error, genPackage.getEcorePackage().getName(), detail), null));
			} catch (RuntimeException re) {
				diagnostic.add(new BasicDiagnostic(Diagnostic.ERROR, "org.polarsys.kitalpha.emde.egf", 0, NLS.bind(Messages.ExtensionHelper_Resource_Error, genPackage.getEcorePackage().getName(), detail), null));
			}
		}
		if (diagnostic.getSeverity() != Diagnostic.OK) {
			throw DiagnosticException.toCoreException(new DiagnosticException(diagnostic));
		}
		return genPackages;
	}

}

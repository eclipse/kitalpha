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
/**
 * 
 */
package org.polarsys.kitalpha.emde.model;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EPackageRegistryImpl;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreSwitch;
import org.polarsys.kitalpha.emde.extension.utils.ExtensionAnnotationsHelper;

/**
 * @author Thomas Guiu
 * 
 */
public class ExtensionValidationHelper {

	private void loadModels() throws CoreException {
		Set<IFile> files = new HashSet<IFile>();
		// List ecore file from the workspace
		for (IProject proj : ResourcesPlugin.getWorkspace().getRoot().getProjects()) {
			if (proj.isAccessible())
				visit(proj, files);
		}

		// Load ecore files
		for (IFile file : files) {
			URI uri = URI.createPlatformResourceURI(file.getFullPath().toString());
			Resource resource = set.getResource(uri, true);
			EPackage pack = (EPackage) resource.getContents().get(0);
			REGISTRY.put(pack.getNsURI(), pack);
		}
	}

	public void validateSuperTypes(BasicDiagnostic diagnostic, EClass eclass) {
		EAnnotation annotation1 = eclass.getEAnnotation(ExtensionAnnotationsHelper.CONSTRAINT_NS_URI);
		if (annotation1 == null)
			return;

		EClass elementExtension = EmdePackage.eINSTANCE.getElementExtension();
		String nsURI = elementExtension.getEPackage().getNsURI();
		for (EClass cls : eclass.getEAllSuperTypes()) {
			if (nsURI.equals(cls.getEPackage().getNsURI()) && elementExtension.getName().equals(cls.getName())) {
				return;
			}
		}
		diagnostic.add(new BasicDiagnostic(Diagnostic.ERROR, "EClass " + eclass.getName(), 0, "The EClass must extends ElementExtension", new Object[] { eclass }));

	}

	public void validateConstraintAnnotation(BasicDiagnostic diagnostic, EClass eclass) {
		EAnnotation annotation = eclass.getEAnnotation(ExtensionAnnotationsHelper.CONSTRAINT_NS_URI);
		if (annotation != null) {
			String value = annotation.getDetails().get(ExtensionAnnotationsHelper.EXTENDED_ELEMENT);
			if (value == null) {
				diagnostic.add(new BasicDiagnostic(Diagnostic.ERROR, "EClass " + eclass.getName(), 0, "Missing annotation details '" + ExtensionAnnotationsHelper.EXTENDED_ELEMENT + "'", new Object[] { eclass }));
				return;
			}
			for (String val : value.trim().split("\\s"))
				doValidateConstraintValue(eclass, val, diagnostic);
		}

	}

	private void doValidateConstraintValue(EClass eclass, String value, BasicDiagnostic diagnostic) {
		if (value == null || "".equals(value))
			return;
		URI uri = URI.createURI(value);
		String fragment = uri.fragment();
		if (fragment.startsWith("//"))
			fragment = fragment.substring(2);
		uri = uri.trimFragment();
		EPackage ePackage = REGISTRY.getEPackage(uri.toString());
		if (ePackage == null) {
			diagnostic.add(new BasicDiagnostic(Diagnostic.ERROR, "EClass " + eclass.getName(), 0, "Cannot find package with nsURI '" + uri.toString() + "'", new Object[] { eclass }));
			return;
		}
		EClassifier eClassifier = ePackage.getEClassifier(fragment);
		if (eClassifier == null) {
			diagnostic.add(new BasicDiagnostic(Diagnostic.ERROR, "EPackage " + ePackage.getName(), 0, "Cannot find EClass '" + fragment + "' in package '" + ePackage.getNsURI() + "'", new Object[] { eclass }));
			return;
		}
	}

	private static Diagnostic toDiagnostic(org.eclipse.emf.ecore.resource.Resource.Diagnostic child) {
		BasicDiagnostic diagnostic = new BasicDiagnostic(Diagnostic.ERROR, "", 0, child.getMessage() + " Location:" + child.getLocation() + " (" + child.getLine() + "," + child.getColumn() + " )", null);
		return diagnostic;
	}

	private void visit(IContainer container, Set<IFile> files) throws CoreException {
		for (IResource res : container.members()) {
			if (!res.isAccessible())
				continue;
			if (res.getType() == IResource.FOLDER)
				visit((IContainer) res, files);
			else if (res.getType() == IResource.FILE) {
				IFile file = (IFile) res;
				if ("ecore".equals(file.getFileExtension()))
					files.add(file);
			}
		}
	}

	public static BasicDiagnostic visit(List<? extends Object> objects) throws CoreException {
		final BasicDiagnostic diagnostic = new BasicDiagnostic(BasicDiagnostic.OK, "", 0, "Extension validation", null);
		final ExtensionValidationHelper helper = createHelper();
		EcoreSwitch<String> _switch = new EcoreSwitch<String>() {

			@Override
			public String caseEClass(EClass object) {
				helper.validateSuperTypes(diagnostic, object);
				helper.validateConstraintAnnotation(diagnostic, object);
				return "";
			}

			@Override
			public String caseEPackage(EPackage object) {
				for (EClassifier cls : object.getEClassifiers())
					doSwitch(cls);
				return "";
			}
		};
		for (Object obj : objects) {
			if (obj instanceof EObject)
				_switch.doSwitch((EObject) obj);
		}
		return diagnostic;
	}

	public static BasicDiagnostic visit(Object object) throws CoreException {
		List<Object> objs = new ArrayList<Object>();
		objs.add(object);
		return visit(objs);
	}

	private static ExtensionValidationHelper createHelper() throws CoreException {
		ExtensionValidationHelper helper = new ExtensionValidationHelper();
		helper.loadModels();
		return helper;
	}

	private final ResourceSet set = new ResourceSetImpl();
	private static final EPackage.Registry REGISTRY = new EPackageRegistryImpl(EPackage.Registry.INSTANCE);
}

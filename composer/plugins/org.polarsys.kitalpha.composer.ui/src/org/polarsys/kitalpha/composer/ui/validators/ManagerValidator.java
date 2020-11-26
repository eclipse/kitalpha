/*******************************************************************************
 * Copyright (c) 2014, 2020 Thales Global Services S.A.S.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 * 
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *    Thales Global Services S.A.S - initial API and implementation
 *******************************************************************************/

package org.polarsys.kitalpha.composer.ui.validators;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.ui.PlatformUI;

import org.polarsys.kitalpha.composer.api.CodeManagerLauncher;
import org.polarsys.kitalpha.composer.api.ParameterError;
import org.polarsys.kitalpha.composer.extension.points.CodeManagerExtensions;
import org.polarsys.kitalpha.composer.ui.Activator;
import org.polarsys.kitalpha.composer.ui.launch.ICodeManagerLaunchConfigurationConstants;

public class ManagerValidator {
	private String ERROR_VALID_FOLDER1 = "The models contained in ";
	private String ERROR_VALID_FOLDER2 = "/ aren't valid";
	private String ERROR_VALID_FILE = "The model ";
	private String ERROR_VALID_EOBJECT = "The EObject ";
	private String ERROR_VALID_MODEL = " isn't valid";
	private String ERROR_VALID_END = " for this launch configuration.";
	private ILaunchConfiguration configuration = null;

	public ManagerValidator(ILaunchConfiguration configuration) {
		super();
		this.configuration = configuration;
	}

	public ResourceSet isValidIFolder(final IFolder folder) {
		ResourceSet resourceSet = new ResourceSetImpl();

		try {
			IResource[] members = folder.members();
			for (int index = 0; index < members.length; index++) {
				if (members[index] instanceof IFile) {
					IFile file = (IFile) members[index];
					Resource resource = isValidIFile(file);
					if (resource != null) {
						resourceSet.getResource(resource.getURI(), true);
					}
				}
			}

		} catch (CoreException e) {
			Activator.getDefault().getLog().log(e.getStatus());
		}

		return resourceSet;
	}

	public Resource isValidIFile(final IFile file) {
		Resource model = null;
		if (file != null) {

			ResourceSet resourceSet = new ResourceSetImpl();
			model = resourceSet.getResource(URI.createPlatformResourceURI(file
					.getFullPath().toString(), true), true);
			EObject root = model.getContents().get(0);
			boolean ok = isOk(configuration, root);
			if (ok) {
				return model;
			}
		}
		return null;
	}

	public EObject isValidEObject(final EObject eObject) {
		if (isOk(configuration, eObject)) {
			return eObject;
		}
		return null;
	}

	public static boolean openValidationDialog(
			Map<String, ParameterError> result) {
		boolean valid = false;

		if (result != null && !result.isEmpty()) {

			String parameterString = getParameterErrorsTrace(result);
			MessageDialog.openError(PlatformUI.getWorkbench()
					.getActiveWorkbenchWindow().getShell(), "Code Manager",
					"Problems encountered during validation :\n"
							+ parameterString);
			valid = false;

		} else {

			MessageDialog.openInformation(PlatformUI.getWorkbench()
					.getActiveWorkbenchWindow().getShell(), "Code Manager",
					"Validation completed successfully");
			valid = true;
		}
		return valid;
	}

	public static String getParameterErrorsTrace(
			Map<String, ParameterError> parametersMap) {
		String line = CodeManagerLauncher
				.getParameterErrorsTrace(parametersMap);

		line = line.replaceFirst(":", ":\n");
		line = line.replaceAll(",", "\n");

		return line;
	}

	private List<String> getChildrenBusinessUriExtensionList(
			final ILaunchConfiguration configuration) {

		IConfigurationElement[] children = null;
		List<String> businessUri = new ArrayList<String>();

		String generationName;
		try {
			generationName = configuration.getAttribute(
					ICodeManagerLaunchConfigurationConstants.GENERATION_NAME,
					"");

			IConfigurationElement element = CodeManagerExtensions
					.getBindingConfigElement(generationName);
			if (element != null) {
				children = element.getChildren();
				for (int index = 0; index < children.length; index++) {
					businessUri.add(children[index]
							.getAttribute(CodeManagerExtensions.ATT_URI));
				}
			}

		} catch (CoreException e) {
			Activator.getDefault().getLog().log(e.getStatus());
		}
		return businessUri;
	}

	private boolean isOk(final ILaunchConfiguration configuration,
			final EObject eObject) {
		boolean ok = false;
		String modelUri = eObject.eClass().getEPackage().getNsURI();
		List<String> businessUriList = getChildrenBusinessUriExtensionList(configuration);
		for (String businessUri : businessUriList) {
			ok = businessUri.equals(modelUri);
			if (ok) {
				break;
			}
		}

		return ok;
	}

	public class ValidationException extends Exception {

		/**
		 * Serial version ID.
		 */
		private static final long serialVersionUID = 3470254369248363780L;

		public ValidationException(IFile selection) {
			super(ERROR_VALID_FILE + selection.getName() + ERROR_VALID_MODEL
					+ ERROR_VALID_END);

		}

		public ValidationException(IFolder selection) {
			super(ERROR_VALID_FOLDER1 + selection.getName()
					+ ERROR_VALID_FOLDER2 + ERROR_VALID_END);

		}

		public ValidationException(EObject selection) {
			super(ERROR_VALID_EOBJECT + selection.toString()
					+ ERROR_VALID_MODEL + ERROR_VALID_END);

		}

	}
}

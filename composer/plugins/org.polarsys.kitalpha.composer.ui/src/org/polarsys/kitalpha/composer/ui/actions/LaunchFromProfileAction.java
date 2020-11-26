/*******************************************************************************
 * Copyright (c) 2014 Thales Global Services S.A.S.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 * 
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *    Thales Global Services S.A.S - initial API and implementation
 *******************************************************************************/


package org.polarsys.kitalpha.composer.ui.actions;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.dialogs.ErrorDialog;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.swt.widgets.Display;

import org.polarsys.kitalpha.composer.api.configuration.CodeManagerConfiguration;
import org.polarsys.kitalpha.composer.api.configuration.ConfigurationFactory;
import org.polarsys.kitalpha.composer.api.profiles.ComposerProfile;
import org.polarsys.kitalpha.composer.ui.Activator;
import org.polarsys.kitalpha.composer.ui.wizards.GenericLaunchConfigurationWizard;

/**
 * @author Yann Mortier
 * 
 */
public class LaunchFromProfileAction extends Action {

	private ComposerProfile profile;
	private List<Object> selection;

	public LaunchFromProfileAction(ComposerProfile profile,
			List<Object> selection) {
		super(profile.getName());
		this.profile = profile;
		this.selection = selection;
	}

	@Override
	public void run() {
		super.run();
		try {
			CodeManagerConfiguration configuration = ConfigurationFactory
					.getInstance().create(profile);
			//
			// Scan selection
			List<ResourceSet> resourceSets = new ArrayList<ResourceSet>();
			List<Resource> resources = new ArrayList<Resource>();
			List<EObject> eObjects = new ArrayList<EObject>();

			manageSelection(resourceSets, resources, eObjects, selection);

			for (ResourceSet resourceSet : resourceSets) {
				configuration.setResourceSet(resourceSet);
			
				GenericLaunchConfigurationWizard wizard = new GenericLaunchConfigurationWizard(
						configuration,profile);
				WizardDialog wizardDialog = new WizardDialog(Display
						.getCurrent().getActiveShell(), wizard);
				wizardDialog.open();
			
			}

			for (Resource resource : resources) {
				configuration.setResource(resource);
				
				GenericLaunchConfigurationWizard wizard = new GenericLaunchConfigurationWizard(
						configuration,profile);
				WizardDialog wizardDialog = new WizardDialog(Display
						.getCurrent().getActiveShell(), wizard);
				wizardDialog.open();
				
			}

			if (!eObjects.isEmpty()) {
				configuration.setObjects(eObjects);
				
				GenericLaunchConfigurationWizard wizard = new GenericLaunchConfigurationWizard(
						configuration,profile);
				WizardDialog wizardDialog = new WizardDialog(Display
						.getCurrent().getActiveShell(), wizard);
				wizardDialog.open();
				
			}

		} catch (CoreException e) {
			Activator.getDefault().getLog().log(e.getStatus());
			ErrorDialog.openError(Display.getCurrent().getActiveShell(),
					"Code generation", "Error while generating code", e
							.getStatus());
		}
	}

	private void manageSelection(List<ResourceSet> resourceSets,
			List<Resource> resources, List<EObject> objects,
			List<Object> selection) {

		for (Object o : selection) {
			if (o instanceof EObject) {
				objects.add((EObject) o);
			} else if (o instanceof Resource) {
				resources.add((Resource) o);
			} else if (o instanceof ResourceSet) {
				resourceSets.add((ResourceSet) o);
			} else if (o instanceof IFile) {
				IFile file = (IFile) o;
				Resource resource = getResource(file);
				if (resource != null) {
					resources.add(resource);
				} else {
					// TODO report error.
				}
			}
		}
	}

	private Resource getResource(IFile file) {
		Resource model = null;
		if (file != null) {

			ResourceSet resourceSet = new ResourceSetImpl();
			model = resourceSet.getResource(URI.createPlatformResourceURI(file
					.getFullPath().toString(), true), true);
			return model;
		}
		return null;
	}

}

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

package org.polarsys.kitalpha.composer.examples.extended;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.ui.INewWizard;

import org.polarsys.kitalpha.examples.generic.wizard.AbstractExampleWizard;

public class ExtendedUseCaseWizard extends AbstractExampleWizard implements
		INewWizard {

	@Override
	protected Collection<?> getProjectDescriptors() {
		
		List<ProjectDescriptor> projects = new ArrayList<ProjectDescriptor>(1);
		projects.add(new ProjectDescriptor("org.polarsys.kitalpha.composer.examples.extended", "zips/BasicAllocationEcore.zip", "org.polarsys.kitalpha.composer.examples.basic.allocation.ecore"));  //$NON-NLS-1$//$NON-NLS-2$ //$NON-NLS-3$
		projects.add(new ProjectDescriptor("org.polarsys.kitalpha.composer.examples.extended", "zips/BasicAllocationModel.zip", "org.polarsys.kitalpha.composer.examples.basic.allocation.ecore.model")); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
		projects.add(new ProjectDescriptor("org.polarsys.kitalpha.composer.examples.extended", "zips/BasicAllocationEdit.zip", "org.polarsys.kitalpha.composer.examples.basic.allocation.ecore.model.edit"));  //$NON-NLS-1$//$NON-NLS-2$ //$NON-NLS-3$
		projects.add(new ProjectDescriptor("org.polarsys.kitalpha.composer.examples.extended", "zips/BasicAllocationEditor.zip", "org.polarsys.kitalpha.composer.examples.basic.allocation.ecore.model.editor")); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
		projects.add(new ProjectDescriptor("org.polarsys.kitalpha.composer.examples.extended", "zips/BasicUseCaseGenerator.zip", "org.polarsys.kitalpha.composer.examples.basic.ecore.gen.generator")); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
		projects.add(new ProjectDescriptor("org.polarsys.kitalpha.composer.examples.extended", "zips/ExtendedAllocation.zip", "org.polarsys.kitalpha.composer.examples.extended.ecorex.allocation"));  //$NON-NLS-1$//$NON-NLS-2$ //$NON-NLS-3$
		projects.add(new ProjectDescriptor("org.polarsys.kitalpha.composer.examples.extended", "zips/ExtendedAllocationModel.zip", "org.polarsys.kitalpha.composer.examples.extended.ecorex.allocation.model"));  //$NON-NLS-1$//$NON-NLS-2$ //$NON-NLS-3$
		projects.add(new ProjectDescriptor("org.polarsys.kitalpha.composer.examples.extended", "zips/ExtendedAllocationEdit.zip", "org.polarsys.kitalpha.composer.examples.extended.ecorex.allocation.model.edit"));  //$NON-NLS-1$//$NON-NLS-2$ //$NON-NLS-3$
		projects.add(new ProjectDescriptor("org.polarsys.kitalpha.composer.examples.extended", "zips/ExtendedAllocationEditor.zip", "org.polarsys.kitalpha.composer.examples.extended.ecorex.allocation.model.editor"));  //$NON-NLS-1$//$NON-NLS-2$ //$NON-NLS-3$
		projects.add(new ProjectDescriptor("org.polarsys.kitalpha.composer.examples.extended", "zips/ExtendedBinding.zip", "org.polarsys.kitalpha.composer.examples.extended.ecorex.gen.binding")); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
		projects.add(new ProjectDescriptor("org.polarsys.kitalpha.composer.examples.extended", "zips/ExtendedGenerator.zip", "org.polarsys.kitalpha.composer.examples.extended.ecorex.gen.generator"));  //$NON-NLS-1$//$NON-NLS-2$ //$NON-NLS-3$
		
		return projects;
	}

	@Override
	protected void log(Exception e) {
		if (e instanceof CoreException) {
			Activator.getDefault().getLog().log(((CoreException)e).getStatus());
		} else {
			Activator.getDefault().getLog().log(new Status(IStatus.ERROR, Activator.getDefault().getBundle().getSymbolicName(),IStatus.ERROR, e.getMessage(),e));
		}
		
	}
}
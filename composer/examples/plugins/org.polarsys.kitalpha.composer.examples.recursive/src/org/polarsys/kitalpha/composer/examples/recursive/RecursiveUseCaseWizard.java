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

package org.polarsys.kitalpha.composer.examples.recursive;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.ui.INewWizard;

import org.polarsys.kitalpha.examples.generic.wizard.AbstractExampleWizard;

public class RecursiveUseCaseWizard extends AbstractExampleWizard implements
		INewWizard {

	@Override
	protected Collection<?> getProjectDescriptors() {
		
		List<ProjectDescriptor> projects = new ArrayList<ProjectDescriptor>(1);
		projects.add(new ProjectDescriptor("org.polarsys.kitalpha.composer.examples.recursive", "zips/RecursiveAllocationEcore.zip", "org.polarsys.kitalpha.composer.examples.recursive.allocation.ecore"));  //$NON-NLS-1$//$NON-NLS-2$ //$NON-NLS-3$
		projects.add(new ProjectDescriptor("org.polarsys.kitalpha.composer.examples.recursive", "zips/RecursiveAllocationModel.zip", "org.polarsys.kitalpha.composer.examples.recursive.allocation.ecore.model")); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
		projects.add(new ProjectDescriptor("org.polarsys.kitalpha.composer.examples.recursive", "zips/RecursiveAllocationEdit.zip", "org.polarsys.kitalpha.composer.examples.recursive.allocation.ecore.model.edit"));  //$NON-NLS-1$//$NON-NLS-2$ //$NON-NLS-3$
		projects.add(new ProjectDescriptor("org.polarsys.kitalpha.composer.examples.recursive", "zips/RecursiveAllocationEditor.zip", "org.polarsys.kitalpha.composer.examples.recursive.allocation.ecore.model.editor")); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
		projects.add(new ProjectDescriptor("org.polarsys.kitalpha.composer.examples.recursive", "zips/RecursiveUseCaseGenerator.zip", "org.polarsys.kitalpha.composer.examples.recursive.ecore.gen.generator")); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
		projects.add(new ProjectDescriptor("org.polarsys.kitalpha.composer.examples.recursive", "zips/RecursiveUseCaseStrategy.zip", "org.polarsys.kitalpha.composer.examples.recursive.ecore.gen.strategy"));  //$NON-NLS-1$//$NON-NLS-2$ //$NON-NLS-3$
		projects.add(new ProjectDescriptor("org.polarsys.kitalpha.composer.examples.recursive", "zips/RecursiveUseCaseRefinery.zip", "org.polarsys.kitalpha.composer.examples.recursive.ecore.gen.refinery")); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
		projects.add(new ProjectDescriptor("org.polarsys.kitalpha.composer.examples.recursive", "zips/RecursiveUseCaseComposergen.zip", "org.polarsys.kitalpha.composer.examples.recursive.ecore.gen.composergen"));  //$NON-NLS-1$//$NON-NLS-2$ //$NON-NLS-3$
		projects.add(new ProjectDescriptor("org.polarsys.kitalpha.composer.examples.recursive", "zips/RecursiveUseCaseBinding.zip", "org.polarsys.kitalpha.composer.examples.recursive.ecore.gen.binding"));  //$NON-NLS-1$//$NON-NLS-2$ //$NON-NLS-3$
		projects.add(new ProjectDescriptor("org.polarsys.kitalpha.composer.examples.advanced", "zips/AdvancedUseCaseGenerator.zip", "org.polarsys.kitalpha.composer.examples.advanced.ecore.gen.generator")); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
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

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

package org.polarsys.kitalpha.composer.examples.advanced;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.ui.INewWizard;

import org.polarsys.kitalpha.examples.generic.wizard.AbstractExampleWizard;

public class AdvancedUseCaseWizard extends AbstractExampleWizard implements
		INewWizard {

	@Override
	protected Collection<?> getProjectDescriptors() {
		
		List<ProjectDescriptor> projects = new ArrayList<ProjectDescriptor>(1);
		projects.add(new ProjectDescriptor("org.polarsys.kitalpha.composer.examples.advanced", "zips/AdvancedAllocationEcore.zip", "org.polarsys.kitalpha.composer.examples.advanced.allocation.ecore"));  //$NON-NLS-1$//$NON-NLS-2$ //$NON-NLS-3$
		projects.add(new ProjectDescriptor("org.polarsys.kitalpha.composer.examples.advanced", "zips/AdvancedAllocationModel.zip", "org.polarsys.kitalpha.composer.examples.advanced.allocation.ecore.model")); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
		projects.add(new ProjectDescriptor("org.polarsys.kitalpha.composer.examples.advanced", "zips/AdvancedAllocationEdit.zip", "org.polarsys.kitalpha.composer.examples.advanced.allocation.ecore.model.edit"));  //$NON-NLS-1$//$NON-NLS-2$ //$NON-NLS-3$
		projects.add(new ProjectDescriptor("org.polarsys.kitalpha.composer.examples.advanced", "zips/AdvancedAllocationEditor.zip", "org.polarsys.kitalpha.composer.examples.advanced.allocation.ecore.model.editor")); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
		projects.add(new ProjectDescriptor("org.polarsys.kitalpha.composer.examples.advanced", "zips/AdvancedUseCaseGenerator.zip", "org.polarsys.kitalpha.composer.examples.advanced.ecore.gen.generator")); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
		projects.add(new ProjectDescriptor("org.polarsys.kitalpha.composer.examples.advanced", "zips/AdvancedUseCaseBinding.zip", "org.polarsys.kitalpha.composer.examples.advanced.ecore.gen.binding")); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
		projects.add(new ProjectDescriptor("org.polarsys.kitalpha.composer.examples.advanced", "zips/AdvancedUseCaseStrategyOneFile.zip", "org.polarsys.kitalpha.composer.examples.advanced.ecore.gen.strategy.onefile"));  //$NON-NLS-1$//$NON-NLS-2$ //$NON-NLS-3$
		projects.add(new ProjectDescriptor("org.polarsys.kitalpha.composer.examples.advanced", "zips/AdvancedUseStrategyManyFile.zip", "org.polarsys.kitalpha.composer.examples.advanced.ecore.gen.strategy.manyfile")); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
		projects.add(new ProjectDescriptor("org.polarsys.kitalpha.composer.examples.advanced", "zips/AdvancedUseCaseRefinery.zip", "org.polarsys.kitalpha.composer.examples.advanced.ecore.gen.refinery")); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
		
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

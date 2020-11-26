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

package org.polarsys.kitalpha.composer.examples.basic;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.ui.INewWizard;

import org.polarsys.kitalpha.examples.generic.wizard.AbstractExampleWizard;

public class BasicUseCaseWizard extends AbstractExampleWizard implements
		INewWizard {

	@Override
	protected Collection<?> getProjectDescriptors() {
		
		List<ProjectDescriptor> projects = new ArrayList<ProjectDescriptor>(1);
		projects.add(new ProjectDescriptor("org.polarsys.kitalpha.composer.examples.basic", "zips/BasicAllocationEcore.zip", "org.polarsys.kitalpha.composer.examples.basic.allocation.ecore"));  //$NON-NLS-1$//$NON-NLS-2$ //$NON-NLS-3$
		projects.add(new ProjectDescriptor("org.polarsys.kitalpha.composer.examples.basic", "zips/BasicAllocationModel.zip", "org.polarsys.kitalpha.composer.examples.basic.allocation.ecore.model")); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
		projects.add(new ProjectDescriptor("org.polarsys.kitalpha.composer.examples.basic", "zips/BasicAllocationEdit.zip", "org.polarsys.kitalpha.composer.examples.basic.allocation.ecore.model.edit"));  //$NON-NLS-1$//$NON-NLS-2$ //$NON-NLS-3$
		projects.add(new ProjectDescriptor("org.polarsys.kitalpha.composer.examples.basic", "zips/BasicAllocationEditor.zip", "org.polarsys.kitalpha.composer.examples.basic.allocation.ecore.model.editor")); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
		projects.add(new ProjectDescriptor("org.polarsys.kitalpha.composer.examples.basic", "zips/BasicUseCaseBinding.zip", "org.polarsys.kitalpha.composer.examples.basic.ecore.gen.binding"));  //$NON-NLS-1$//$NON-NLS-2$ //$NON-NLS-3$
		projects.add(new ProjectDescriptor("org.polarsys.kitalpha.composer.examples.basic", "zips/BasicUseCaseGenerator.zip", "org.polarsys.kitalpha.composer.examples.basic.ecore.gen.generator")); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
		projects.add(new ProjectDescriptor("org.polarsys.kitalpha.composer.examples.basic", "zips/BasicUseCaseRefinery.zip", "org.polarsys.kitalpha.composer.examples.basic.ecore.gen.refinery"));  //$NON-NLS-1$//$NON-NLS-2$ //$NON-NLS-3$
		projects.add(new ProjectDescriptor("org.polarsys.kitalpha.composer.examples.basic", "zips/BasicUseCaseStrategy.zip", "org.polarsys.kitalpha.composer.examples.basic.ecore.gen.strategy")); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
		projects.add(new ProjectDescriptor("org.polarsys.kitalpha.composer.examples.basic", "zips/BasicUseCaseStrategyCompound.zip", "org.polarsys.kitalpha.composer.examples.basic.ecore.gen.strategy.compound"));  //$NON-NLS-1$//$NON-NLS-2$ //$NON-NLS-3$
		projects.add(new ProjectDescriptor("org.polarsys.kitalpha.composer.examples.basic", "zips/BasicUseCaseStrategyConsonant.zip", "org.polarsys.kitalpha.composer.examples.basic.ecore.gen.strategy.consonant")); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
		projects.add(new ProjectDescriptor("org.polarsys.kitalpha.composer.examples.basic", "zips/BasicUseCaseStrategyVowel.zip", "org.polarsys.kitalpha.composer.examples.basic.ecore.gen.strategy.vowel"));  //$NON-NLS-1$//$NON-NLS-2$ //$NON-NLS-3$
		
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

/*******************************************************************************
 * Copyright (c) 2014 Thales Global Services S.A.S.
 *  This program and the accompanying materials are made available under the
 *  terms of the Eclipse Public License 2.0 which is available at
 *  http://www.eclipse.org/legal/epl-2.0
 *  
 *  SPDX-License-Identifier: EPL-2.0
 * 
 * Contributors:
 *  Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/
package org.polarsys.kitalpha.cadence.examples;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;

import org.polarsys.kitalpha.examples.generic.wizard.AbstractExampleWizard;

/**
 * @author Yann Mortier
 * 
 */
public class BasicUseCaseWizard extends AbstractExampleWizard {

	/*
	 * (non-Javadoc)
	 * 
	 * @seeorg.polarsys.kitalpha.examples.generic.wizard.AbstractExampleWizard#
	 * getProjectDescriptors()
	 */
	@Override
	protected Collection<ProjectDescriptor> getProjectDescriptors() {
		List<ProjectDescriptor> projects = new ArrayList<ProjectDescriptor>();
		projects
				.add(new ProjectDescriptor(
						"org.polarsys.kitalpha.cadence.examples", "zips/BasicAllocationEcore.zip", "org.polarsys.kitalpha.composer.examples.basic.allocation.ecore")); //$NON-NLS-1$//$NON-NLS-2$ //$NON-NLS-3$
		projects
				.add(new ProjectDescriptor(
						"org.polarsys.kitalpha.cadence.examples", "zips/BasicAllocationModel.zip", "org.polarsys.kitalpha.composer.examples.basic.allocation.ecore.model")); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
		projects
				.add(new ProjectDescriptor(
						"org.polarsys.kitalpha.cadence.examples", "zips/BasicAllocationEdit.zip", "org.polarsys.kitalpha.composer.examples.basic.allocation.ecore.model.edit")); //$NON-NLS-1$//$NON-NLS-2$ //$NON-NLS-3$
		projects
				.add(new ProjectDescriptor(
						"org.polarsys.kitalpha.cadence.examples", "zips/BasicAllocationEditor.zip", "org.polarsys.kitalpha.composer.examples.basic.allocation.ecore.model.editor")); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
		projects
				.add(new ProjectDescriptor(
						"org.polarsys.kitalpha.cadence.examples", "zips/BasicWorkflow.zip", "org.polarsys.kitalpha.cadence.examples.basic.ecore.workflow")); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
		return projects;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.polarsys.kitalpha.examples.generic.wizard.AbstractExampleWizard#log
	 * (java.lang.Exception)
	 */
	@Override
	protected void log(Exception e) {
		if (e instanceof CoreException) {
			Activator.getDefault().getLog()
					.log(((CoreException) e).getStatus());
		} else {
			Activator.getDefault().getLog().log(
					new Status(IStatus.ERROR, Activator.getDefault()
							.getBundle().getSymbolicName(), IStatus.ERROR, e
							.getMessage(), e));
		}
	}

}

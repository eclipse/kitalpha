/*******************************************************************************
 * Copyright (c) 2013 THALES GLOBAL SERVICES.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    THALES GLOBAL SERVICES - Initial API and implementation
 *******************************************************************************/


/**
 * 
 */
package org.polarsys.kitalpha.accuracy.examples.wizard;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.ui.INewWizard;

import org.polarsys.kitalpha.examples.generic.wizard.AbstractExampleWizard;

/**
 * @author Yann Mortier
 */
public class AccuracyExampleWizard extends AbstractExampleWizard implements
		INewWizard {

	/*
	 * (non-Javadoc)
	 * 
	 * @seeorg.polarsys.kitalpha.examples.generic.wizard.AbstractExampleWizard#
	 * getProjectDescriptors()
	 */
	@Override
	protected Collection<ProjectDescriptor> getProjectDescriptors() {
		List<ProjectDescriptor> projects = new ArrayList<ProjectDescriptor>(1);
		projects
				.add(new ProjectDescriptor(
						"org.polarsys.kitaplha.accuracy.examples.wizard", "zips/Example.zip", "org.polarsys.kitaplha.accuracy.examples")); //$NON-NLS-1$//$NON-NLS-2$ //$NON-NLS-3$
		projects
				.add(new ProjectDescriptor(
						"org.polarsys.kitaplha.accuracy.examples.wizard", "zips/ExampleUI.zip", "org.polarsys.kitaplha.accuracy.examples.ui")); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
		projects
				.add(new ProjectDescriptor(
						"org.polarsys.kitaplha.accuracy.examples.wizard", "zips/LibraryModel.zip", "org.eclipse.emf.examples.library")); //$NON-NLS-1$//$NON-NLS-2$ //$NON-NLS-3$
		projects
				.add(new ProjectDescriptor(
						"org.polarsys.kitaplha.accuracy.examples.wizard", "zips/LibraryEdit.zip", "org.eclipse.emf.examples.library.edit")); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
		projects
				.add(new ProjectDescriptor(
						"org.polarsys.kitaplha.accuracy.examples.wizard", "zips/LibraryEditor.zip", "org.eclipse.emf.examples.library.editor")); //$NON-NLS-1$//$NON-NLS-2$ //$NON-NLS-3$
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

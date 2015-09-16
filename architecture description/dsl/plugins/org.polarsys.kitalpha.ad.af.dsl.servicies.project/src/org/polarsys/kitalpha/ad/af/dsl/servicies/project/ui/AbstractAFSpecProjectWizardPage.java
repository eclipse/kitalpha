/*******************************************************************************
 * Copyright (c) 2014 Thales Global Services S.A.S.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *  
 * Contributors:
 *   Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/

package org.polarsys.kitalpha.ad.af.dsl.servicies.project.ui;

import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.resources.IProject;
import org.eclipse.jface.wizard.WizardPage;
import org.polarsys.kitalpha.ad.af.dsl.servicies.project.ui.util.NamesValidityChecker;

/**
 * @author Boubekeur Zendagui
 */

public abstract class AbstractAFSpecProjectWizardPage  extends WizardPage {

	protected AbstractAFSpecProjectWizardPage(String pageName) {
		super(pageName);
	}

	/**
	 * Check if the provided data in widgets are well formated.
	 * @return True if data are well formated, false else.
	 */
	protected boolean vpDataChanged(String data, String message, boolean isProject) {
		String msg = "\n Only [a-z A-Z 0-9 _] character are allowed";
		if (! NamesValidityChecker.isValid(data, isProject))
		{
			updateStatus(message + msg);
			return false;
		}
		
		if (isProject)
		{
			IProject project = ResourcesPlugin.getWorkspace().getRoot().getProject(data);
			if (project.exists())
			{
				updateStatus("A project with the same name is available in the workspace");
				return false;
			}
		}
		
		updateStatus(null);
		return true;
	}
	
	/**
	 * Update the state of the page and display a warning message or an error 
	 * message on the  top of the page.
	 * @param message the message to dispay on the top of the page.
	 */
	private void updateStatus(String message) {
		setErrorMessage(message);
		setPageComplete(message == null);
	}
}

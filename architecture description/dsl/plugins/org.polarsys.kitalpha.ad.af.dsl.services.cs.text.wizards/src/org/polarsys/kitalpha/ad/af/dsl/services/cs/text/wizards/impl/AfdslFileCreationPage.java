/*******************************************************************************
 * Copyright (c) 2014, 2018 Thales Global Services S.A.S.
 *  This program and the accompanying materials are made available under the
 *  terms of the Eclipse Public License 2.0 which is available at
 *  http://www.eclipse.org/legal/epl-2.0
 *  
 *  SPDX-License-Identifier: EPL-2.0
 * 
 * Contributors:
 *  Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/

package org.polarsys.kitalpha.ad.af.dsl.services.cs.text.wizards.impl;

import java.util.regex.Pattern;

import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.widgets.Event;
import org.eclipse.ui.dialogs.WizardNewFileCreationPage;
import org.polarsys.kitalpha.ad.af.dsl.services.cs.text.wizards.AfdslResourceCreator;
import org.polarsys.kitalpha.ad.af.dsl.services.cs.text.wizards.messages.Messages;


/**
 * 
 * @author Amine Lajmi
 *
 */
public class AfdslFileCreationPage extends WizardNewFileCreationPage {

	public AfdslFileCreationPage(IStructuredSelection selection) {
		super(Messages.AfdslNewFile_AfdslFileWizard, selection);
		setTitle(Messages.AfdslNewFile_AfdslFileWizard);
		setDescription(Messages.AfdslNewFileCreationPage_CreateAfdslFileFromScratch + " (1/3)");
		setFileExtension(Messages.AfdslFileCreationPage_AfdslExtension);
	}

	@Override
	public void handleEvent(Event event) {
		String fileName = getFileName();
		Pattern pattern = Pattern.compile("(.*)" + "." + AfdslResourceCreator.AFTEXT_EXTENSION);
		boolean fileMatches = pattern.matcher(fileName).matches();
		if (fileName.length() > 0 && fileMatches) {
			String shortName = fileName.substring(0, fileName.indexOf("."));
			AfdslFileSecondPage secondPage = ((AfdslFileWizard) getWizard()).getSecondPage();
			secondPage.setShortName(shortName);
		}
		setPageComplete(validatePage());
	}
}

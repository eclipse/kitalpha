/*******************************************************************************
 * Copyright (c) 2014 Thales Global Services S.A.S.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *  Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/
/**
 * Copyright (c) THALES, 2012. All rights reserved.
 */
package org.polarsys.kitalpha.ad.viewpoint.dsl.services.cs.text.wizards.impl.conf;

import org.eclipse.core.resources.IFile;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.ide.IDE;
import org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.identifiers.EditorIDs;
import org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.resources.FileExtension;
import org.polarsys.kitalpha.ad.viewpoint.dsl.services.cs.text.wizards.AbstractWizard;
import org.polarsys.kitalpha.ad.viewpoint.dsl.services.cs.text.wizards.util.WizardsUtil;


/**
 * 
 * @author Amine Lajmi
 *
 */
public class VpconfWizard extends AbstractWizard implements INewWizard {
	
	public VpconfWizard() {
		setWindowTitle(Messages.VpconfFileCreationPage_Title);
	}
	
	@Override
	protected boolean createFirstPage(IStructuredSelection selection) {
		try {
			firstPage = new VpconfFileCreationPage(selection);
			return true;
		}catch(Exception ex) {
			return false;
		}
	}

	@Override
	protected boolean createSecondPage(IStructuredSelection selection) {
		return false;
	}

	@Override
	protected boolean createThirdPage(IStructuredSelection selection) {
		return false;
	}
	
	@Override
	public String getInitialContent() {
		return WizardsUtil.getInitialConfigurationContent(vpShortName, vpTargetApplication, vpRootProjectName, vpNsURI);
	}
		
	@Override
	public String getInitialContent(String fileName) {
		return WizardsUtil.getInitialConfigurationContent(vpShortName, fileName
				.replaceFirst("." + FileExtension.PRIMARY_EXTENSION, ""),
				vpTargetApplication, vpRootProjectName, vpNsURI);
	}

	@Override
	protected void bindEditor(IFile file) {
		IDE.setDefaultEditor(file,EditorIDs.CONFIG_EDITOR_ID);
	}
}

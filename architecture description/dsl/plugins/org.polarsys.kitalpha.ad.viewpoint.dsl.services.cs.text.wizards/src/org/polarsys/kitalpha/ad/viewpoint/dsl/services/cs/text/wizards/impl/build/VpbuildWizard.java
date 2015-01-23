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
package org.polarsys.kitalpha.ad.viewpoint.dsl.services.cs.text.wizards.impl.build;

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
public class VpbuildWizard extends AbstractWizard implements INewWizard {
	
	public VpbuildWizard() {
		setWindowTitle(Messages.VpbuildFileCreationPage_Title);
	}
	
	@Override
	protected boolean createFirstPage(IStructuredSelection selection) {
		try {
			firstPage = new VpbuildFileCreationPage(selection);
		}catch(Exception ex) {
			return false;
		}
		return true;
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
		return WizardsUtil.getInitialBuildContent(vpShortName);
	}
	
	@Override
	public String getInitialContent(String fileName) {
		return WizardsUtil.getInitialBuildContent(vpShortName, fileName.replaceFirst("." + FileExtension.PRIMARY_EXTENSION, ""));
	}
	
	@Override
	protected void bindEditor(IFile file) {
		IDE.setDefaultEditor(file,EditorIDs.BUILD_EDITOR_ID);	
	}
}

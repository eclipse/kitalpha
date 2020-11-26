/*******************************************************************************
 * Copyright (c) 2014, 2020 Thales Global Services S.A.S.
 *  This program and the accompanying materials are made available under the
 *  terms of the Eclipse Public License 2.0 which is available at
 *  http://www.eclipse.org/legal/epl-2.0
 *  
 *  SPDX-License-Identifier: EPL-2.0
 * 
 * Contributors:
 *  Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/
/**
 * Copyright (c) THALES, 2012. All rights reserved.
 */
package org.polarsys.kitalpha.ad.viewpoint.dsl.services.cs.text.wizards.impl.spec;

import org.eclipse.core.resources.IFile;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.ide.IDE;
import org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.identifiers.EditorIDs;
import org.polarsys.kitalpha.ad.viewpoint.dsl.services.cs.text.wizards.AbstractWizard;
import org.polarsys.kitalpha.ad.viewpoint.dsl.services.cs.text.wizards.util.WizardsUtil;


/**
 * 
 * @author Amine Lajmi
 *
 */
public class VpspecWizard extends AbstractWizard implements INewWizard {
	
	public VpspecWizard() {
		setWindowTitle(Messages.VpspecFileCreationPage_Title);
	}
	
	@Override
	protected boolean createFirstPage(IStructuredSelection selection) {
		try {
			firstPage = new VpspecFileCreationPage(selection);
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
		return WizardsUtil.getInitialSpecContent(vpShortName);
	}
	
	@Override
	public String getInitialContent(String fileName) {
		return WizardsUtil.getInitialSpecContent(vpShortName);
	}
	
	@Override
	protected void bindEditor(IFile file) {
		IDE.setDefaultEditor(file,EditorIDs.VPSPEC_EDITOR_ID);
	}
}

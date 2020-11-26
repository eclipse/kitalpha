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

package org.polarsys.kitalpha.ad.viewpoint.dsl.services.cs.text.wizards.impl.build;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.swt.widgets.Text;
import org.polarsys.kitalpha.ad.viewpoint.dsl.services.cs.text.wizards.AbstractThirdPage;
import org.polarsys.kitalpha.ad.viewpoint.dsl.services.cs.text.wizards.util.WizardsUtil;


/**
 * 
 * @author Amine Lajmi
 *
 */
public class VpbuildThirdPage extends AbstractThirdPage {

	private Text vpRootProjectNameText;
	private Text vpDescriptionProjectNameText;
	
	public VpbuildThirdPage(){
		super(Messages.VpbuildFileThirdPage_Title);
	}
	
	public VpbuildThirdPage(ISelection selection){
		super(Messages.VpbuildFileThirdPage_Title);
	}

	@Override
	protected void initializeProperties() {
		setVpRootProjectNameText(createTextProperty("Root project name:", ((VpbuildWizard)getWizard()).getVpRootProjectName() ,false));
		setVpDescriptionProjectNameText(createTextProperty("Viewpoint project name:", ((VpbuildWizard)getWizard()).getVpDescriptionProjectName() ,false));	
	}
	
	@Override
	protected boolean dataChanged() {
		String msg = "Only [a-z A-Z 0-9 _ -] character are allowed";
		if (! WizardsUtil.isValid(vpDescriptionProjectNameText.getText(), true)){
			updateStatus("Description project name must be valid: " + msg);
			return false;
		}		
		if (! WizardsUtil.isValid(vpRootProjectNameText.getText(), true)){
			updateStatus("Root project name must be valid: " + msg);
			return false;
		}
		IProject descProject = ResourcesPlugin.getWorkspace().getRoot().getProject(getVpDescriptionProjectNameText().getText());
		IProject rootProject = ResourcesPlugin.getWorkspace().getRoot().getProject(getVpRootProjectNameText().getText());
		if (descProject.exists()) {
			updateStatus(null);
			return true;
		}
		if (rootProject.exists()) {
			updateStatus("Project \""+ rootProject.getName()+"\" exists already");
			return false;
		}
		updateStatus(null);
		return true;
	}
	
	public Text getVpRootProjectNameText() {
		return vpRootProjectNameText;
	}

	public void setVpRootProjectNameText(Text vpRootProjectNameText) {
		this.vpRootProjectNameText = vpRootProjectNameText;
	}

	public Text getVpDescriptionProjectNameText() {
		return vpDescriptionProjectNameText;
	}

	public void setVpDescriptionProjectNameText(Text vpDescriptionProjectNameText) {
		this.vpDescriptionProjectNameText = vpDescriptionProjectNameText;
	}
}

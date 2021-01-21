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
package org.polarsys.kitalpha.ad.viewpoint.dsl.services.cs.text.wizards.impl.build;

import org.eclipse.jface.viewers.ISelection;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Text;
import org.polarsys.kitalpha.ad.viewpoint.dsl.services.cs.text.wizards.AbstractSecondPage;
import org.polarsys.kitalpha.ad.viewpoint.dsl.services.cs.text.wizards.util.WizardsUtil;


/**
 * 
 * @author Amine Lajmi
 *
 */
public class VpbuildSecondPage extends AbstractSecondPage{
	
	private Text vpShortNameText;
	
	private Combo targetapplicationListCombo;
	
	public VpbuildSecondPage(){
		super(Messages.VpbuildFileCreationPage_Title);
	}
	
	public VpbuildSecondPage(ISelection selection){
		super(selection, Messages.VpbuildFileCreationPage_Title);
	}
	
	@Override
	protected void initializeProperties() {
		setVpShortNameText(createTextProperty("Viewpoint short name :", ((VpbuildWizard)getWizard()).getVpShortName(), false));
		setTargetapplicationListCombo(createComboProperty("Target application:", WizardsUtil.getSupportedPlatforms(), 0, false));
	}
	
	@Override
	protected boolean dataChanged() {
		updateStatus(null);
		return true;
	}

	public void setVpShortNameText(Text vpShortNameText) {
		this.vpShortNameText = vpShortNameText;
	}

	public Text getVpShortNameText() {
		return vpShortNameText;
	}

	public void setTargetapplicationListCombo(Combo targetapplicationListCombo) {
		this.targetapplicationListCombo = targetapplicationListCombo;
	}

	public Combo getTargetapplicationListCombo() {
		return targetapplicationListCombo;
	}
}

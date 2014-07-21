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
package org.polarsys.kitalpha.ad.services.detachment.core.registeries.interfaces;

import org.eclipse.jface.wizard.WizardPage;


/**
 * @author Faycal Abka
 */
public abstract class AbstractDetachmentWizard extends WizardPage {
	
	/**
	 * Hold the order of the page in the dialog wizard
	 */
	private int wizardPageNumber;
	
	protected AbstractDetachmentWizard(String pageName) {
		super(pageName);
	}
	
	/**
	 * Set order of apparition of the current wizard page in the wizard dialog.
	 * @param wizardPageNumber positive integer upper than 0
	 */
	//TODO restriction on the given wizard page number
	public void setWizardPageNumber(int wizardPageNumber){
		if (wizardPageNumber > 0){
			this.wizardPageNumber = wizardPageNumber;
		}
	}
	
	
	public int getWizardPageNumber(){
		return this.wizardPageNumber;
	}

	/**
	 * 
	 * This method shall returns the inputed data in the wizard
	 * 
	 * @return the input data
	 */
	public abstract IDetachmentWizardData getDetachmentWizardData();
}

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
package org.polarsys.kitalpha.ad.viewpoint.dsl.services.cs.text.wizards.impl.data;

import org.eclipse.jface.viewers.ISelection;
import org.polarsys.kitalpha.ad.viewpoint.dsl.services.cs.text.wizards.AbstractSecondPage;


/**
 * 
 * @author Amine Lajmi
 *
 */
public class DataSecondPage extends AbstractSecondPage{
	
	public DataSecondPage(){
		super(Messages.DataFileCreationPage_Title);
	}
	
	public DataSecondPage(ISelection selection){
		super(selection, Messages.DataFileCreationPage_Title);
	}

	@Override
	protected void initializeProperties() {
	}

	@Override
	protected boolean dataChanged() {
		updateStatus(null);
		return true;
	}
}

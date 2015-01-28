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

package org.polarsys.kitalpha.ad.viewpoint.dsl.services.cs.text.wizards.impl.conf;

import org.eclipse.jface.viewers.ISelection;
import org.polarsys.kitalpha.ad.viewpoint.dsl.services.cs.text.wizards.AbstractThirdPage;


/**
 * 
 * @author Amine Lajmi
 *
 */
public class VpconfThirdPage extends AbstractThirdPage{

	public VpconfThirdPage(){
		super(Messages.VpconfFileThirdPage_Title);
	}

	public VpconfThirdPage(ISelection selection){
		super(Messages.VpconfFileThirdPage_Title);
	}

	@Override
	protected void initializeProperties() {
		// TODO Auto-generated method stub
	}

	@Override
	protected boolean dataChanged() {
		// TODO Auto-generated method stub
		return true;
	}
}

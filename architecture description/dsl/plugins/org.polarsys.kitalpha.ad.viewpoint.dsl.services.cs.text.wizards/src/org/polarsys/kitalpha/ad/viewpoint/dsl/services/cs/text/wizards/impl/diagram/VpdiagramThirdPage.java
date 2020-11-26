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

package org.polarsys.kitalpha.ad.viewpoint.dsl.services.cs.text.wizards.impl.diagram;

import org.eclipse.jface.viewers.ISelection;
import org.polarsys.kitalpha.ad.viewpoint.dsl.services.cs.text.wizards.AbstractThirdPage;


/**
 * 
 * @author Amine Lajmi
 *
 */
public class VpdiagramThirdPage extends AbstractThirdPage{
	
	public VpdiagramThirdPage(){
		super(Messages.VpdiagramFileThirdPage_Title);
	}
	
	public VpdiagramThirdPage(ISelection selection){
		super(Messages.VpdiagramFileThirdPage_Title);
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

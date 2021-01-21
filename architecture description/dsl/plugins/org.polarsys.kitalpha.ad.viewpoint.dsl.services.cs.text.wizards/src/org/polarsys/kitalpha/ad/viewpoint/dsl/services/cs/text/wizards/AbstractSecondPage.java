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

package org.polarsys.kitalpha.ad.viewpoint.dsl.services.cs.text.wizards;

import org.eclipse.jface.viewers.ISelection;

/**
 * 
 * @author Amine Lajmi
 *
 */
public abstract class AbstractSecondPage extends AbstractPropertiesPage{
	
	public AbstractSecondPage(){
		super(Messages.AbstractSecondPage_DefaultSecondPageTitle);
	}
	
	public AbstractSecondPage(ISelection selection){
		super(Messages.AbstractSecondPage_DefaultSecondPageTitle);
	}
	
	public AbstractSecondPage(String title){
		super(title);
	}
	
	public AbstractSecondPage(ISelection selection, String title){
		super(title);
	}
}

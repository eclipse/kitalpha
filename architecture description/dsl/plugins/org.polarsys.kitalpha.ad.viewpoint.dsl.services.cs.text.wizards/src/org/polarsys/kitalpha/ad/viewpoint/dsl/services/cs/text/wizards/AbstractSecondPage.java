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

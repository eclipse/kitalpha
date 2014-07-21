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


package org.polarsys.kitalpha.transposer.ui.internal.providers;


import org.eclipse.jface.viewers.IStructuredContentProvider;
import org.eclipse.jface.viewers.Viewer;

import org.polarsys.kitalpha.transposer.rules.handler.rules.contribution.ContributedPurpose;

/**
 * 
 * @author Guillaume Gebhart
 *
 */

public class ComboContentProvider implements IStructuredContentProvider{

	public Object[] getElements(Object inputElement) {
		
		if (inputElement instanceof ContributedPurpose[]) {
		  ContributedPurpose[] input = (ContributedPurpose[]) inputElement;
      return input;
		}

			
		
		
		return null;
	}
		

	public void dispose() {
		// TODO Auto-generated method stub
		
	}

	public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
		// TODO Auto-generated method stub
		
	}

}

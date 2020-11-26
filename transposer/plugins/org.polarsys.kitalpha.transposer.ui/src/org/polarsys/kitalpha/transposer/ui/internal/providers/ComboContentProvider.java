/*******************************************************************************
 * Copyright (c) 2014, 2020 Thales Global Services S.A.S.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 * 
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *    Thales Global Services S.A.S - initial API and implementation
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

	@Override
	public Object[] getElements(Object inputElement) {
		
		if (inputElement instanceof ContributedPurpose[]) {
		  ContributedPurpose[] input = (ContributedPurpose[]) inputElement;
      return input;
		}

			
		
		
		return null;
	}
		

	@Override
	public void dispose() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
		// TODO Auto-generated method stub
		
	}

}

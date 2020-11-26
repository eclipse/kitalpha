/*******************************************************************************
 * Copyright (c) 2014, 2018 Thales Global Services S.A.S.
 *  This program and the accompanying materials are made available under the
 *  terms of the Eclipse Public License 2.0 which is available at
 *  http://www.eclipse.org/legal/epl-2.0
 *  
 *  SPDX-License-Identifier: EPL-2.0
 * 
 * Contributors:
 *  Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/
package org.polarsys.kitalpha.cadence.ui.providers;




import java.util.List;
import java.util.Set;

import org.eclipse.jface.viewers.IStructuredContentProvider;
import org.eclipse.jface.viewers.Viewer;



/**
 * @author Guillaume Gebhart
 */
public class CadenceContentProvider implements  IStructuredContentProvider{

	@Override
	public Object[] getElements(Object inputElement) {


		if (inputElement instanceof List) {
			
			
			return ((List)inputElement).toArray();
		}
		
		if (inputElement instanceof Set) {
			
			
			return ((Set)inputElement).toArray();
		}
		
		if (inputElement instanceof Object[]) {
			
			
			return (Object[])inputElement;
		}
		
		
		
		return new Object[0];

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

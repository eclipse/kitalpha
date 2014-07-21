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



package org.polarsys.kitalpha.cadence.ui.providers;




import java.util.List;
import java.util.Set;

import org.eclipse.jface.viewers.IStructuredContentProvider;
import org.eclipse.jface.viewers.Viewer;



/**
 * @author Guillaume Gebhart
 */
public class CadenceContentProvider implements  IStructuredContentProvider{

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

	public void dispose() {
		// TODO Auto-generated method stub

	}

	public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
		// TODO Auto-generated method stub

	}

}

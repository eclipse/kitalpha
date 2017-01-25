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
package org.polarsys.kitalpha.model.common.share.ui.utilities.vp.providers;

import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.Viewer;
import org.polarsys.kitalpha.model.common.share.ui.utilities.vp.tree.IViewpointTreeDescription;
import org.polarsys.kitalpha.model.common.share.ui.utilities.vp.tree.ViewpointTreeContainer;

/**
 * @author Faycal Abka
 */
public class ViewpointTreeProvider implements ITreeContentProvider  {
	
	public void dispose() {

	}

	public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {

	}

	public Object[] getElements(Object inputElement) {
		
		if (inputElement instanceof ViewpointTreeContainer)
			return ((ViewpointTreeContainer)inputElement).getRoots().toArray();
		return getChildren(inputElement);
	}

	public Object[] getChildren(Object parentElement) {
			if (parentElement instanceof IViewpointTreeDescription){
				IViewpointTreeDescription vpd = (IViewpointTreeDescription)parentElement;
				return vpd.getChildren().toArray();
			}
			return null;
	}

	public Object getParent(Object element) {
		
		if (element instanceof IViewpointTreeDescription){
			//for(IViewpointTreeDescription v: ((IViewpointTreeDescription)element).getParents())
				return ((IViewpointTreeDescription)element).getParents();
		}
		return null;
	}

	public boolean hasChildren(Object element) {
		if (element instanceof IViewpointTreeDescription)
			return ((IViewpointTreeDescription)element).hasChildren();
		return false;
	}

}

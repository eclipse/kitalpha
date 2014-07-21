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

package org.polarsys.kitalpha.ad.services.detachment.ui.pages.providers;

import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.Viewer;
import org.polarsys.kitalpha.ad.services.detachment.core.utils.tree.IViewpointTreeDescription;
import org.polarsys.kitalpha.ad.services.detachment.core.utils.tree.ViewpointTreeContainer;

public class ViewpointTreeContentProvider implements ITreeContentProvider {

	@Override
	public void dispose() {
		// TODO Auto-generated method stub

	}

	@Override
	public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {

	}

	@Override
	public Object[] getElements(Object inputElement) {
		
		if (inputElement instanceof ViewpointTreeContainer)
			return ((ViewpointTreeContainer)inputElement).getRoots().toArray();
		return getChildren(inputElement);
	}

	@Override
	public Object[] getChildren(Object parentElement) {
			if (parentElement instanceof IViewpointTreeDescription){
				IViewpointTreeDescription vpd = (IViewpointTreeDescription)parentElement;
				return vpd.getChildren().toArray();
			}
			return null;
	}

	@Override
	public Object getParent(Object element) {
		
		if (element instanceof IViewpointTreeDescription){
			//for(IViewpointTreeDescription v: ((IViewpointTreeDescription)element).getParents())
				return ((IViewpointTreeDescription)element).getParents();
		}
		return null;
	}

	@Override
	public boolean hasChildren(Object element) {
		if (element instanceof IViewpointTreeDescription)
			return ((IViewpointTreeDescription)element).hasChildren();
		return false;
	}
}

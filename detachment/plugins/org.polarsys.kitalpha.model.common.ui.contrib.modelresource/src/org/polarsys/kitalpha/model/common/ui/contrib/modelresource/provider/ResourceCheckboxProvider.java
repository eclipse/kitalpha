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
package org.polarsys.kitalpha.model.common.ui.contrib.modelresource.provider;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.util.URI;
import org.eclipse.jface.viewers.IStructuredContentProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.swt.graphics.Image;
import org.polarsys.kitalpha.model.common.share.modelresources.exceptions.ModelResourceException;
import org.polarsys.kitalpha.model.common.share.modelresources.impl.ModelResources;
import org.polarsys.kitalpha.model.common.share.modelresources.interfaces.IModelResource;
import org.polarsys.kitalpha.model.common.share.modelresources.interfaces.IModelResources;
import org.polarsys.kitalpha.model.common.share.modelresources.interfaces.ModelResourceState;


/**
 * 
 * @author Faycal Abka
 *
 */

/*
 * FIXME: due to Neon migration, ITableLabelProvider was removed from Implementation interface
 */
public class ResourceCheckboxProvider extends LabelProvider implements IStructuredContentProvider {

	private ModelResourceState state;
	
	public ResourceCheckboxProvider(ModelResourceState state){
		this.state = state;
	}
	
	
	public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
		//Do nothing
	}

	public Object[] getElements(Object inputElement) {
		
		if (inputElement instanceof IModelResources){
			IModelResources filtredresources = new ModelResources();
			IModelResources _modelResources = (IModelResources)inputElement;
			
			List<IModelResource> allResources = _modelResources.getAllModelResources();
			
			for (IModelResource iModelResource : allResources) {
				try {
					/*
					 * FIXME When resource detachment take care about detachment platform:/plugin/...
					 * remove the test of filtred only the workspace resources.
					 */
					if (iModelResource.getResourceURI().isPlatformResource()){
						if (iModelResource.getResourceState().equals(state)){
							filtredresources.addResource(iModelResource.getResourceURI(), iModelResource);
						}
					}
				} catch (ModelResourceException e) {
					e.printStackTrace();
				}
			}
			
			return getURIString(filtredresources.getAllModelResourceURI()).toArray();
		}
		
		return null;
	}

	public Image getColumnImage(Object element, int columnIndex) {
		return null;
	}

	public String getColumnText(Object element, int columnIndex) {
		return (String)element;
	}

	
	
	/*
	 * Helpers
	 */
	
	//get URI strings
	private List<String> getURIString(List<URI> uris){
		List<String> result = new ArrayList<String>();
		
		for (URI uri : uris) {
			result.add(uri.toString());
		}
		
		return result;
	}
	
	@Override
	public void dispose() {
		super.dispose();
	}
	
}

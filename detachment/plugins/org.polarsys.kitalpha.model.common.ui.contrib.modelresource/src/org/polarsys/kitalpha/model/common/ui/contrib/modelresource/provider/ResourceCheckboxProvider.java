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
package org.polarsys.kitalpha.model.common.ui.contrib.modelresource.provider;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.util.URI;
import org.eclipse.jface.viewers.IStructuredContentProvider;
import org.eclipse.jface.viewers.ITableLabelProvider;
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
public class ResourceCheckboxProvider extends LabelProvider implements ITableLabelProvider, IStructuredContentProvider {

	private ModelResourceState state;
	
	public ResourceCheckboxProvider(ModelResourceState state){
		this.state = state;
	}
	
	
	@Override
	public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
		//Do nothing
	}

	@Override
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

	@Override
	public Image getColumnImage(Object element, int columnIndex) {
		return null;
	}

	@Override
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
	
}

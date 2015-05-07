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

package org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.decorator;

import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.jface.viewers.IDecoration;
import org.eclipse.jface.viewers.ILightweightLabelDecorator;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.ui.IDecoratorManager;
import org.eclipse.ui.PlatformUI;
import org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.callback.VpdslModelResourcesPropertysConstants;

public class UnsynchronizedResource extends LabelProvider implements ILightweightLabelDecorator {
	
	public static final String DECORATOR_ID = "org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui.vpdesc.decorator";
	
	
	public UnsynchronizedResource() {
	}
	
	public static UnsynchronizedResource getUnsynchronizationResource(){
		IDecoratorManager decoratorManager = getDecoratorManager();
		
		if (decoratorManager.getEnabled(DECORATOR_ID)){
			return (UnsynchronizedResource)decoratorManager.getBaseLabelProvider(DECORATOR_ID);
		}
		
		return null;
	}
	
	private static IDecoratorManager getDecoratorManager(){
		return PlatformUI.getWorkbench().getDecoratorManager();
	}
	
	@Override
	public void decorate(Object element, IDecoration decoration) {
		
		IResource resource = getResource(element);
		
		if (resource == null || !(resource.getType() == IResource.FILE) || !(resource.getFullPath().getFileExtension().endsWith("vptext"))) return;
		
		try {
			String value = resource.getPersistentProperty(VpdslModelResourcesPropertysConstants.syncQualifiedName);
			
			if (value != null && value.equals("false"))
			{
				decoration.addPrefix("[ Unsyncronized ] ");
			}
			else
			{
				decoration.addPrefix("");
			}
			
			//refresh();
			
		} catch (CoreException e) {
			e.printStackTrace();
		}
		
	}
	
	
	private IResource getResource(Object object) 
	{
		if (object instanceof IResource) 
		{
			return (IResource) object;
		}
		if (object instanceof IAdaptable) 
		{
			return (IResource) ((IAdaptable) object).getAdapter(IResource.class);
		}
		return null;
	}
	
	
}

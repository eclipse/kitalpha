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

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.jface.viewers.IDecoration;
import org.eclipse.jface.viewers.ILightweightLabelDecorator;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.LabelProviderChangedEvent;
import org.eclipse.swt.widgets.Display;
import org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.resources.ResourcesPropertysConstants;

public class UnsynchronizedResource extends LabelProvider implements ILightweightLabelDecorator {
	
	public static final String DECORATOR_ID = "org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui.vpdesc.decorator";
	
	
	public UnsynchronizedResource() {
	}
	
	
	@Override
	public void decorate(Object element, IDecoration decoration) {
		
		IFile resource = getResource(element);
		
		if (resource == null || 
				!(resource.exists()) ||
				!(resource.isAccessible()) ||
				!(resource.getFullPath().getFileExtension().endsWith("vptext"))) return;
		
		try {
			
			String value = resource.getPersistentProperty(ResourcesPropertysConstants.syncQualifiedName);
			
			if (value != null && value.equals("false"))
			{
				decoration.addPrefix("[ Unsyncronized ] ");
			}
			else
			{
				decoration.addPrefix("");
			}
			
			final LabelProviderChangedEvent event = new LabelProviderChangedEvent(this);
			Display.getDefault().syncExec(new Runnable() {
				
				@Override
				public void run() {
					fireLabelProviderChanged(event);
				}
			});
			
		} catch (CoreException e) {
			e.printStackTrace();
		}
		
	}
	
	
	private IFile getResource(Object object) 
	{
		if (object == null)
		{
			return null;
		}
		
		if (object instanceof IFile) 
		{
			return (IFile) object;
		}
		if (object instanceof IAdaptable) 
		{
			return (IFile) ((IAdaptable) object).getAdapter(IFile.class);
		}
		
		return null;
	}
	
	
}

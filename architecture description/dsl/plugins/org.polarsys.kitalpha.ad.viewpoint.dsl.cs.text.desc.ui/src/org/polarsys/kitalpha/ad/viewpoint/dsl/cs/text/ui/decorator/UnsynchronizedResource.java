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

package org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.decorator;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.jface.viewers.IDecoration;
import org.eclipse.jface.viewers.ILightweightLabelDecorator;
import org.eclipse.jface.viewers.LabelProvider;
import org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.resources.FileExtension;
import org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.resources.ResourceHelper;

public class UnsynchronizedResource extends LabelProvider implements ILightweightLabelDecorator {
	
	public static final String DECORATOR_ID = "org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui.vpdesc.decorator";
	private static final String UNSYNCRONIZED_RESOURCE_LABEL = "[ Unsynchronized ] ";
	
	
	public UnsynchronizedResource() {
	}
	
	
	@Override
	public void decorate(Object element, IDecoration decoration) {

		IFile resource = getResource(element);

		if (resource == null || 
				!(resource.exists()) ||
				!(resource.isAccessible()) ||
				(resource.getFullPath().getFileExtension() == null) ||
				!(resource.getFullPath().getFileExtension().endsWith(FileExtension.PRIMARY_EXTENSION))) {
			return;
		}

		boolean value = ResourceHelper.getSyncProperty(resource);

		if (!value)
		{
			decoration.addPrefix(UNSYNCRONIZED_RESOURCE_LABEL);
		}
		else
		{
			decoration.addPrefix("");
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

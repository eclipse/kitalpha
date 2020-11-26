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

package org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.decorator;

import java.net.URL;

import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Platform;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.viewers.IDecoration;
import org.eclipse.jface.viewers.ILabelProviderListener;
import org.eclipse.jface.viewers.ILightweightLabelDecorator;
import org.osgi.framework.Bundle;
import org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.resources.FileExtension;

/**
 * 
 * @author Faycal Abka
 *
 */
public class SpecFileDecorator implements ILightweightLabelDecorator {
	
	private static final Bundle bundle = Platform.getBundle("org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui"); //$NON-NLS-1$
	private static final URL url = FileLocator.find(bundle, new Path("icons/spec_overlay.gif"), null); //$NON-NLS-1$

	private final ImageDescriptor IMG_OVERLAY = ImageDescriptor.createFromURL(url);

	@Override
	public void addListener(ILabelProviderListener listener) {
	}

	@Override
	public void dispose() {
	}

	@Override
	public boolean isLabelProperty(Object element, String property) {
		return false;
	}

	@Override
	public void removeListener(ILabelProviderListener listener) {
	}
	

	@Override
	public void decorate(Object element, IDecoration decoration) {
		
		if (element instanceof IResource){
			IResource resource = (IResource)element;
			if (resource.getFullPath().toString().endsWith(FileExtension.SPECIFICATION_EXTENSION)){ //$NON-NLS-1$
				decoration.addOverlay(IMG_OVERLAY);
			}
		}
	}

}

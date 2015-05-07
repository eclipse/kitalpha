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

import java.net.URL;
import java.util.Collections;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Platform;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.viewers.IDecoration;
import org.eclipse.jface.viewers.ILabelProviderListener;
import org.eclipse.jface.viewers.ILightweightLabelDecorator;
import org.osgi.framework.Bundle;

/**
 * 
 * @author Faycal Abka
 *
 */
public class SpecFileDecorator implements ILightweightLabelDecorator {
	
	final static Bundle bundle = Platform.getBundle("org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui"); //$NON-NLS-1$
	final static URL url = FileLocator.find(bundle, new Path("icons/spec_overlay.gif"), Collections.emptyMap()); //$NON-NLS-1$
	
	private static final ImageDescriptor IMG_OVERLAY = ImageDescriptor.createFromURL(url);

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
			if (resource.getFullPath().toString().endsWith(".spec.vptext")){ //$NON-NLS-1$
				decoration.addOverlay(IMG_OVERLAY);
			}
		}
	}

}

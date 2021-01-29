/*******************************************************************************
 * Copyright (c) 2014, 2020 Thales Global Services S.A.S.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 * 
 * SPDX-License-Identifier: EPL-2.0
 *  
 * Contributors:
 *   Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/

package org.polarsys.kitalpha.ecore.diagram.service;

import java.net.URL;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.provider.EReferenceItemProvider;
import org.eclipse.emf.ecore.provider.EcoreItemProviderAdapterFactory;

public class StyleService {
	
	public Object getReferenceImage(EObject context){
		EcoreItemProviderAdapterFactory adapterFactory = new EcoreItemProviderAdapterFactory();
		FocusEReferenceItemProvider eReferenceItemProvider = new FocusEReferenceItemProvider(adapterFactory);
		final Object image = eReferenceItemProvider.getImage(context);
		return image;
	}
}

class FocusEReferenceItemProvider extends EReferenceItemProvider{
	public FocusEReferenceItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}
	
	@Override
	public Object getImage(Object object) {
		URL url = getClass().getResource("/icons/styles/ESupperReference.gif");
		return overlayImage(object, getComposedImage(object, url));
	}
}
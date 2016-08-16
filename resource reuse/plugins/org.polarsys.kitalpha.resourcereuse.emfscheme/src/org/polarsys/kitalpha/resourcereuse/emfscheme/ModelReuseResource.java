/*******************************************************************************
 * Copyright (c) 2016 Thales Global Services S.A.S.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *  Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/
package org.polarsys.kitalpha.resourcereuse.emfscheme;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.URIConverter;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceImpl;

public class ModelReuseResource extends XMIResourceImpl {
	
	private static URIConverter uriConverter;
	
	public ModelReuseResource() {
		super();
	}
	
	public ModelReuseResource(URI uri){
		super(uri);
	}
	
	
	@Override
	protected URIConverter getURIConverter() {
		if (uriConverter == null) {
			uriConverter = new ModelReuseURIConverter();
		}
		return uriConverter;
	}

}

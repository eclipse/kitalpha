/*******************************************************************************
 * Copyright (c) 2016, 2020 Thales Global Services S.A.S.
 *  This program and the accompanying materials are made available under the
 *  terms of the Eclipse Public License 2.0 which is available at
 *  http://www.eclipse.org/legal/epl-2.0
 *  
 *  SPDX-License-Identifier: EPL-2.0
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

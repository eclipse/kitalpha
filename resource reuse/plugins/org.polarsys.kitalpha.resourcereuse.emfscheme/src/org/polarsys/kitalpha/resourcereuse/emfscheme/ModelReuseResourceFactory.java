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
import org.eclipse.emf.ecore.resource.Resource.Factory;

/**
 * 
 * @author Xavier DECOOL
 * 
 */
public class ModelReuseResourceFactory implements Factory {

	@Override
	public org.eclipse.emf.ecore.resource.Resource createResource(URI uri) {
		return new ModelReuseResource(uri);
	}
}

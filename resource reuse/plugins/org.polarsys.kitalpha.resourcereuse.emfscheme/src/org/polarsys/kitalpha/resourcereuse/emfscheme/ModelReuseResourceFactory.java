/*******************************************************************************
 * Copyright (c) 2016 Thales Global Services S.A.S.
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

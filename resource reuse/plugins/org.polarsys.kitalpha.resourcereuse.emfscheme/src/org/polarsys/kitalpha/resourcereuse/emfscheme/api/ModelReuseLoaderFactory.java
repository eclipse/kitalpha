/*******************************************************************************
 * Copyright (c) 2016, 2018 Thales Global Services S.A.S.
 *  This program and the accompanying materials are made available under the
 *  terms of the Eclipse Public License 2.0 which is available at
 *  http://www.eclipse.org/legal/epl-2.0
 *  
 *  SPDX-License-Identifier: EPL-2.0
 * 
 * Contributors:
 *  Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/
package org.polarsys.kitalpha.resourcereuse.emfscheme.api;

import org.polarsys.kitalpha.resourcereuse.internal.emfscheme.resource.load.impl.InternalModelReuseLoader;
import org.polarsys.kitalpha.resourcereuse.internal.emfscheme.resource.load.impl.ModelReuseLoader;

public class ModelReuseLoaderFactory {
	
	public static IModelReuseLoader createModelReuseLoader(){
		return ModelReuseLoader.newInstance(new InternalModelReuseLoader());
	}

	private ModelReuseLoaderFactory() {
		super();
	}

}

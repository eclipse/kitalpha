/*******************************************************************************
 * Copyright (c) 2016, 2018 Thales Global Services S.A.S.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
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

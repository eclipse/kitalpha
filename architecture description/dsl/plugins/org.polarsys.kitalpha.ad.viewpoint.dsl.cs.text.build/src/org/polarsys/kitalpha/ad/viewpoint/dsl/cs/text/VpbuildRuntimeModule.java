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

package org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text;

import org.eclipse.xtext.resource.IResourceServiceProvider;
import org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.generator.IViewpointSynchronizer;
import org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.generator.VpbuildGenerator;
import org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.resource.VpbuildResourceServiceProvider;


/**
 * Use this class to register components to be used at runtime / without the Equinox extension registry.
 */
public class VpbuildRuntimeModule extends org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.AbstractVpbuildRuntimeModule {

	public Class<? extends IResourceServiceProvider> bindIResourceServiceProvider() {
		return VpbuildResourceServiceProvider.class;
	}
	
	public Class<? extends IViewpointSynchronizer> bindIViewpointSynchronizer() {
		return VpbuildGenerator.class;
	}
}

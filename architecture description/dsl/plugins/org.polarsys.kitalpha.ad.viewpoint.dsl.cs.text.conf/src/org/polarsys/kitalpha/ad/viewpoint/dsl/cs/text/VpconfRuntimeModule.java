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
import org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.generator.VpconfGenerator;
import org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.resource.VpconfResourceServiceProvider;
import org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ConfValueConverter;


/**
 * Use this class to register components to be used at runtime / without the Equinox extension registry.
 */
public class VpconfRuntimeModule extends org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.AbstractVpconfRuntimeModule {

	public Class<? extends IResourceServiceProvider> bindIResourceServiceProvider() {
		return VpconfResourceServiceProvider.class;
	}
	
	public Class<? extends IViewpointSynchronizer> bindIViewpointSynchronizer() {
		return VpconfGenerator.class;
	}
	
	public Class<? extends org.eclipse.xtext.conversion.IValueConverterService> bindIValueConverterService() {
		return ConfValueConverter.class;
	}
}

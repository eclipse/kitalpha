/*******************************************************************************
 * Copyright (c) 2014, 2018 Thales Global Services S.A.S.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *  Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/

package org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text;

import org.eclipse.xtext.naming.IQualifiedNameConverter;
import org.eclipse.xtext.naming.IQualifiedNameProvider;
import org.eclipse.xtext.resource.IResourceServiceProvider;
import org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.generator.IViewpointSynchronizer;
import org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.generator.VpservicesGenerator;
import org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.naming.ServicesQualifiedNameConverter;
import org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.naming.ServicesQualifiedNameProvider;
import org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.resource.VpservicesResourceServiceProvider;
import org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.CommonValueConverter;


/**
 * Use this class to register components to be used at runtime / without the Equinox extension registry.
 */
public class VpservicesRuntimeModule extends org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.AbstractVpservicesRuntimeModule {

	public Class<? extends IResourceServiceProvider> bindIResourceServiceProvider() {
		return VpservicesResourceServiceProvider.class;
	}
	
	public Class<? extends IViewpointSynchronizer> bindIViewpointSynchronizer() {
		return VpservicesGenerator.class;
	}
	
	public Class<? extends IQualifiedNameConverter> bindIQualifiedNameConverter() {
		return ServicesQualifiedNameConverter.class;
	}
	
	@Override
	public Class<? extends IQualifiedNameProvider> bindIQualifiedNameProvider() {
		return ServicesQualifiedNameProvider.class;
	}
	
	@Override
	public Class<? extends org.eclipse.xtext.conversion.IValueConverterService> bindIValueConverterService() {
		return CommonValueConverter.class;
	}
	
}

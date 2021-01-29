/*******************************************************************************
 * Copyright (c) 2014, 2020 Thales Global Services S.A.S.
 *  This program and the accompanying materials are made available under the
 *  terms of the Eclipse Public License 2.0 which is available at
 *  http://www.eclipse.org/legal/epl-2.0
 *  
 *  SPDX-License-Identifier: EPL-2.0
 * 
 * Contributors:
 *  Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/
package org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text;

import org.eclipse.xtext.resource.IResourceServiceProvider;
import org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.generator.ActivityexplorerGenerator;
import org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.generator.IViewpointSynchronizer;
import org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.resource.VpActivityExplorerResourceServiceProvider;
import org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.CommonValueConverter;

/**
 * @author Faycal Abka
 */
/**
 * Use this class to register components to be used at runtime / without the Equinox extension registry.
 */
public class ActivityexplorerRuntimeModule extends org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.AbstractActivityexplorerRuntimeModule {

	
	public Class<? extends IResourceServiceProvider> bindIResourceServiceProvider() {
		return VpActivityExplorerResourceServiceProvider.class;
	}
	
	public Class<? extends IViewpointSynchronizer> bindIViewpointSynchronizer() {
		return ActivityexplorerGenerator.class;
	}
	
	@Override
	public Class<? extends org.eclipse.xtext.conversion.IValueConverterService> bindIValueConverterService() {
		return CommonValueConverter.class;
	}
}

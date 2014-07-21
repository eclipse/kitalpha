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
import org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.generator.VpuiGenerator;
import org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.resource.VpuiResourceServiceProvider;
import org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.scoping.VpuiContainerManager;
import org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.scoping.VpuiGlobalScopeProvider;
import org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.VpuiValueConverter;


/**
 * 
 * @author Amine Lajmi
 *
 */
public class VpuiRuntimeModule extends org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.AbstractVpuiRuntimeModule {

	public Class<? extends IResourceServiceProvider> bindIResourceServiceProvider() {
		return VpuiResourceServiceProvider.class;
	}
	
	// contributed by org.eclipse.xtext.generator.builder.BuilderIntegrationFragment
	public Class<? extends org.eclipse.xtext.resource.IContainer.Manager> bindIContainer$Manager() {
		return VpuiContainerManager.class;
	}
	
	// contributed by org.eclipse.xtext.generator.scoping.AbstractScopingFragment
	public Class<? extends org.eclipse.xtext.scoping.IGlobalScopeProvider> bindIGlobalScopeProvider() {
		return VpuiGlobalScopeProvider.class;
	}
	
	// contributed by org.eclipse.xtext.generator.ecore2xtext.Ecore2XtextValueConverterServiceFragment
	public Class<? extends org.eclipse.xtext.conversion.IValueConverterService> bindIValueConverterService() {
		return VpuiValueConverter.class;
	}
	
	public Class<? extends IViewpointSynchronizer> bindIViewpointSynchronizer() {
		return VpuiGenerator.class;
	}
}

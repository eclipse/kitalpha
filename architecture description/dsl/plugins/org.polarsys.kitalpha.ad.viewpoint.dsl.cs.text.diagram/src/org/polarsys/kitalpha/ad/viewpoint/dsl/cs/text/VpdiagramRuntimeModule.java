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

import org.eclipse.xtext.parsetree.reconstr.impl.DefaultTransientValueService;
import org.eclipse.xtext.resource.IResourceServiceProvider;
import org.eclipse.xtext.serializer.tokens.ICrossReferenceSerializer;
import org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.generator.ExternalImportsTransientService;
import org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.generator.IViewpointSynchronizer;
import org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.generator.SequencerDiagramTransientValue;
import org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.generator.VpdiagramGenerator;
import org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.resource.VpdiagramResourceServiceProvider;
import org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.scoping.VpdiagramContainerManager;
import org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.scoping.VpdiagramGlobalScopeProvider;
import org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.serializer.ScopeDiagramSerializer;
import org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.CommonValueConverter;


/**
 * Use this class to register components to be used at runtime / without the Equinox extension registry.
 */
@SuppressWarnings("restriction")
public class VpdiagramRuntimeModule extends org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.AbstractVpdiagramRuntimeModule {

	public Class<? extends IResourceServiceProvider> bindIResourceServiceProvider() {
		return VpdiagramResourceServiceProvider.class;
	}
	
	// contributed by org.eclipse.xtext.generator.builder.BuilderIntegrationFragment
	public Class<? extends org.eclipse.xtext.resource.IContainer.Manager> bindIContainer$Manager() {
		return VpdiagramContainerManager.class;
	}
	

	// contributed by org.eclipse.xtext.generator.scoping.AbstractScopingFragment
	public Class<? extends org.eclipse.xtext.scoping.IGlobalScopeProvider> bindIGlobalScopeProvider() {
		return VpdiagramGlobalScopeProvider.class;
	}
	
	public Class<? extends IViewpointSynchronizer> bindIViewpointSynchronizer() {
		return VpdiagramGenerator.class;
	}

	public Class<? extends DefaultTransientValueService> bindExternalDiagramTransient() {
		return ExternalImportsTransientService.class;
	}
	
	public Class<? extends ICrossReferenceSerializer> bindCrossReferenceSerializer(){
		return ScopeDiagramSerializer.class;
	}
	
	public Class<? extends org.eclipse.xtext.serializer.sequencer.ITransientValueService> bindSequencerTransientValueService() {
		return SequencerDiagramTransientValue.class;
	}
	
	@Override
	public Class<? extends org.eclipse.xtext.conversion.IValueConverterService> bindIValueConverterService() {
		return CommonValueConverter.class;
	}
}

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

import org.eclipse.xtext.parsetree.reconstr.impl.DefaultTransientValueService;
import org.eclipse.xtext.resource.IResourceServiceProvider;
import org.eclipse.xtext.serializer.tokens.ICrossReferenceSerializer;
import org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.generator.DataGenerator;
import org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.generator.ExternalDataTransient;
import org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.generator.IViewpointSynchronizer;
import org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.generator.SequencerDataTransientValueService;
import org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.resource.DataResourceServiceProvider;
import org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.scoping.DataContainerManager;
import org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.scoping.DataGlobalScopeProvider;
import org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.serializer.DataCrossReferenceSerializer;
import org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.DataValueConverter;


/**
 * 
 * @author Amine Lajmi
 *
 */
@SuppressWarnings("restriction")
public class DataRuntimeModule extends org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.AbstractDataRuntimeModule {

	public Class<? extends IResourceServiceProvider> bindIResourceServiceProvider() {
		return DataResourceServiceProvider.class;
	}

	// contributed by org.eclipse.xtext.generator.ecore2xtext.Ecore2XtextValueConverterServiceFragment
	public Class<? extends org.eclipse.xtext.conversion.IValueConverterService> bindIValueConverterService() {
		return DataValueConverter.class;
	}
	
	// contributed by org.eclipse.xtext.generator.builder.BuilderIntegrationFragment
	public Class<? extends org.eclipse.xtext.resource.IContainer.Manager> bindIContainer$Manager() {
		return DataContainerManager.class;
	}
	
	// contributed by org.eclipse.xtext.generator.scoping.AbstractScopingFragment
	public Class<? extends org.eclipse.xtext.scoping.IGlobalScopeProvider> bindIGlobalScopeProvider() {
		return DataGlobalScopeProvider.class;
	}
	
	public Class<? extends IViewpointSynchronizer> bindIViewpointSynchronizer() {
		return DataGenerator.class;
	}
	
	public Class<? extends DefaultTransientValueService> bindExternalDataTransient() {
		return ExternalDataTransient.class;
	}
	
	public Class<? extends org.eclipse.xtext.serializer.sequencer.ITransientValueService> bindSequencerTransientValueService() {
		return SequencerDataTransientValueService.class;
	}
//	@SuppressWarnings("restriction")
//	public Class<? extends CrossReferenceSerializer> bindCrossReferenceSerializer(){
//		return ImportUriDataSerializer.class;
//	}
	
	public Class<? extends ICrossReferenceSerializer> bindCrossReferenceSerializer(){
		return DataCrossReferenceSerializer.class;
	}
}

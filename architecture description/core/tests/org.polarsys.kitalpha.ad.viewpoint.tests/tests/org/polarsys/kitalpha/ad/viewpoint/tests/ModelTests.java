/*******************************************************************************
 * Copyright (c) 2017, 2020 Thales Global Services S.A.S.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 * 
 * SPDX-License-Identifier: EPL-2.0
 *  
 * Contributors:
 *   Thales Global Services S.A.S - initial API and implementation
 *******************************************************************************/
package org.polarsys.kitalpha.ad.viewpoint.tests;


import org.eclipse.emf.common.command.BasicCommandStack;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.provider.EcoreItemProviderAdapterFactory;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.ReflectiveItemProviderAdapterFactory;
import org.eclipse.emf.edit.provider.resource.ResourceItemProviderAdapterFactory;
import org.polarsys.kitalpha.ad.services.manager.ViewpointManager;
import org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.edit.provider.ViewpointItemProviderAdapterFactory;
import org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.tools.model.edit.provider.ToolsItemProviderAdapterFactory;

import junit.framework.TestCase;


/**
 * @author Thomas Guiu
 * 
 */
public abstract class ModelTests extends TestCase {


	protected ResourceSet set;
	protected ViewpointManager m;
	private String modelPath;
	
	public ModelTests(String modelPath) {
		super();
		this.modelPath = modelPath;
	}

	@Override
	protected void setUp() throws Exception {
		ComposedAdapterFactory adapterFactory = new ComposedAdapterFactory(ComposedAdapterFactory.Descriptor.Registry.INSTANCE);

		adapterFactory.addAdapterFactory(new ResourceItemProviderAdapterFactory());

		adapterFactory.addAdapterFactory(new ViewpointItemProviderAdapterFactory());
		adapterFactory.addAdapterFactory(new ToolsItemProviderAdapterFactory());
		adapterFactory.addAdapterFactory(new EcoreItemProviderAdapterFactory());


		adapterFactory.addAdapterFactory(new ReflectiveItemProviderAdapterFactory());

		set = new AdapterFactoryEditingDomain(adapterFactory, new BasicCommandStack()).getResourceSet();  
		set.getResource(URI.createPlatformPluginURI(modelPath, true), true);
		m = ViewpointManager.getInstance(set);

	}

	@Override
	protected void tearDown() throws Exception {
		for (org.eclipse.emf.ecore.resource.Resource r : set.getResources())
			r.unload();
		set.getResources().clear();
	}


}

/*******************************************************************************
 * Copyright (c) 2016 Thales Global Services S.A.S.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *  
 * Contributors:
 *   Thales Global Services S.A.S - initial API and implementation
 *******************************************************************************/
package org.polarsys.kitalpha.ad.viewpoint.tests;


import org.eclipse.core.runtime.IStatus;
import org.eclipse.emf.common.command.BasicCommandStack;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.provider.EcoreItemProviderAdapterFactory;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.ReflectiveItemProviderAdapterFactory;
import org.eclipse.emf.edit.provider.resource.ResourceItemProviderAdapterFactory;
import org.osgi.framework.Version;
import org.polarsys.kitalpha.ad.metadata.helpers.MetadataHelper;
import org.polarsys.kitalpha.ad.services.manager.AlreadyInStateException;
import org.polarsys.kitalpha.ad.services.manager.ViewpointManager;
import org.polarsys.kitalpha.ad.services.manager.ViewpointManager.Listener;
import org.polarsys.kitalpha.ad.services.manager.ViewpointManager.OverallListener;
import org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.edit.provider.ViewpointItemProviderAdapterFactory;
import org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.tools.model.edit.provider.ToolsItemProviderAdapterFactory;
import org.polarsys.kitalpha.resourcereuse.helper.ResourceReuse;
import org.polarsys.kitalpha.resourcereuse.model.Resource;

import junit.framework.TestCase;


/**
 * @author Thomas Guiu
 * 
 */
public class BasicTests2 extends TestCase {


	private ResourceSet set;
	private ViewpointManager m1;
	
	@Override
	protected void setUp() throws Exception {
		ComposedAdapterFactory adapterFactory = new ComposedAdapterFactory(ComposedAdapterFactory.Descriptor.Registry.INSTANCE);

		adapterFactory.addAdapterFactory(new ResourceItemProviderAdapterFactory());

		adapterFactory.addAdapterFactory(new ViewpointItemProviderAdapterFactory());
		adapterFactory.addAdapterFactory(new ToolsItemProviderAdapterFactory());
		adapterFactory.addAdapterFactory(new EcoreItemProviderAdapterFactory());


		adapterFactory.addAdapterFactory(new ReflectiveItemProviderAdapterFactory());

		EditingDomain ed = new AdapterFactoryEditingDomain(adapterFactory, new BasicCommandStack());
		set = ed.getResourceSet();  
		URI uri = URI.createPlatformPluginURI("/org.polarsys.kitalpha.ad.viewpoint.tests/resource/My.componentsample", true);
		set.getResource(uri, true);
		m1 = ViewpointManager.getInstance(set);
		MetadataHelper.getViewpointMetadata(set).initMetadataStorage();
	}

	@Override
	protected void tearDown() throws Exception {
		for (org.eclipse.emf.ecore.resource.Resource r : set.getResources())
			r.unload();
		set.getResources().clear();
	}

	public void testManager5() throws Exception {
		assertFalse(m1.isActive("org.polarsys.kitalpha.vp.componentsampleperformance"));
		m1.activate("org.polarsys.kitalpha.vp.componentsampleperformance");
		assertTrue(m1.isActive("org.polarsys.kitalpha.vp.componentsampleperformance"));
	}

	public void testManager5_1() throws Exception {
		try {
			m1.desactivate("org.polarsys.kitalpha.vp.componentsampleperformance");
			fail("expecting an exception");
		} catch (AlreadyInStateException e) {
		}
	}

	public void testManager6() throws Exception {
		m1.activate("org.polarsys.kitalpha.vp.componentsampleperformance");
		try {
			m1.activate("org.polarsys.kitalpha.vp.componentsampleperformance");
			fail("expecting an exception");
		} catch (AlreadyInStateException e) {
		}
	}
	
	public void testManager7() throws Exception {
		assertFalse(m1.isActive("org.polarsys.kitalpha.vp.componentsampleperformance"));
		m1.activate("org.polarsys.kitalpha.vp.componentsampleperformance");
		assertTrue(m1.isActive("org.polarsys.kitalpha.vp.componentsampleperformance"));
		m1.desactivate("org.polarsys.kitalpha.vp.componentsampleperformance");
		assertFalse(m1.isActive("org.polarsys.kitalpha.vp.componentsampleperformance"));
		assertFalse(m1.isUsed("org.polarsys.kitalpha.vp.componentsampleperformance"));
	}
	
	public void testManager8() throws Exception {
		assertFalse(m1.isActive("org.polarsys.kitalpha.vp.componentsampleperformance"));
		m1.startUse("org.polarsys.kitalpha.vp.componentsampleperformance");
		assertTrue(m1.isActive("org.polarsys.kitalpha.vp.componentsampleperformance"));
	}
	
	public void testManager9() throws Exception {
		assertFalse(m1.isActive("org.polarsys.kitalpha.vp.componentsampleperformance"));
		m1.startUse("org.polarsys.kitalpha.vp.componentsampleperformance");
		assertTrue(m1.isActive("org.polarsys.kitalpha.vp.componentsampleperformance"));
		m1.stopUse("org.polarsys.kitalpha.vp.componentsampleperformance");
		assertFalse(m1.isActive("org.polarsys.kitalpha.vp.componentsampleperformance"));
		assertFalse(m1.isUsed("org.polarsys.kitalpha.vp.componentsampleperformance"));
	}
	
	public void testManager10() throws Exception {
		assertFalse(m1.isFiltered("org.polarsys.kitalpha.vp.componentsampleperformance"));
		m1.activate("org.polarsys.kitalpha.vp.componentsampleperformance");
		assertFalse(m1.isFiltered("org.polarsys.kitalpha.vp.componentsampleperformance"));
		m1.filter("org.polarsys.kitalpha.vp.componentsampleperformance", true);
		assertTrue(m1.isFiltered("org.polarsys.kitalpha.vp.componentsampleperformance"));
		m1.filter("org.polarsys.kitalpha.vp.componentsampleperformance", false);
		assertFalse(m1.isFiltered("org.polarsys.kitalpha.vp.componentsampleperformance"));
	}
	
	public void testManager11() throws Exception {
		org.polarsys.kitalpha.resourcereuse.model.Resource resource = ResourceReuse.createHelper().getResource("org.polarsys.kitalpha.vp.componentsampleperformance");
		assertNull(ViewpointManager.readVersion(resource));
	}
	
	public void testManager12() throws Exception {
		org.polarsys.kitalpha.resourcereuse.model.Resource resource = ResourceReuse.createHelper().getResource("org.polarsys.kitalpha.vp.componentsamplequalityassessment");
		Version version = ViewpointManager.readVersion(resource);
		assertNotNull(version);
		assertEquals("1.0.0", version.toString());
	}

	public void testManager13() throws Exception {
		org.polarsys.kitalpha.resourcereuse.model.Resource resource = ResourceReuse.createHelper().getResource("org.polarsys.kitalpha.vp.componentsamplequalityassessment");
		Resource viewpoint = ViewpointManager.getViewpoint("org.polarsys.kitalpha.vp.componentsamplequalityassessment");
		assertEquals(resource.getId(), viewpoint.getId());
		assertEquals(resource.getDomain(), viewpoint.getDomain());
		assertEquals(resource.getPath(), viewpoint.getPath());
		assertEquals(resource.getProviderSymbolicName(), viewpoint.getProviderSymbolicName());
	}

	public void testManager14() throws Exception {
		assertEquals(6, ViewpointManager.getAvailableViewpoints().length);
	}

	public void testManager15() throws Exception {
		TestListener listener = new TestListener();
		m1.addListener(listener);
		
		m1.activate("org.polarsys.kitalpha.vp.componentsampleperformance");
		m1.filter("org.polarsys.kitalpha.vp.componentsampleperformance", true);
		m1.filter("org.polarsys.kitalpha.vp.componentsampleperformance", false);
		m1.desactivate("org.polarsys.kitalpha.vp.componentsampleperformance");
		
		assertTrue(listener.filtered);
		assertTrue(listener.desactivated);
		assertTrue(listener.displayed);
		assertTrue(listener.activated);
	}

	public void testManager16() throws Exception {
		ResourceSet set2 = new ResourceSetImpl();  
		ViewpointManager m2 = ViewpointManager.getInstance(set2);
		TestListener listener = new TestListener();
		m2.addListener(listener);
		
		m1.activate("org.polarsys.kitalpha.vp.componentsampleperformance");
		m1.filter("org.polarsys.kitalpha.vp.componentsampleperformance", true);
		m1.filter("org.polarsys.kitalpha.vp.componentsampleperformance", false);
		m1.desactivate("org.polarsys.kitalpha.vp.componentsampleperformance");
		
		assertFalse(listener.filtered);
		assertFalse(listener.desactivated);
		assertFalse(listener.displayed);
		assertFalse(listener.activated);
	}

	public void testManager17() throws Exception {
		ResourceSet set2 = new ResourceSetImpl();  
		TestOverallListener overallListener = new TestOverallListener();
		ViewpointManager m2 = ViewpointManager.getInstance(set2);
		
		ViewpointManager.addOverallListener(overallListener);
		TestListener listener1 = new TestListener();
		m1.addListener(listener1);
		TestListener listener2 = new TestListener();
		m2.addListener(listener2);


		m1.activate("org.polarsys.kitalpha.vp.componentsampleperformance");
		m1.filter("org.polarsys.kitalpha.vp.componentsampleperformance", true);
		m1.filter("org.polarsys.kitalpha.vp.componentsampleperformance", false);
		m1.desactivate("org.polarsys.kitalpha.vp.componentsampleperformance");
		
		assertTrue(overallListener.filtered);
		assertTrue(overallListener.desactivated);
		assertTrue(overallListener.displayed);
		assertTrue(overallListener.activated);

		assertTrue(listener1.filtered);
		assertTrue(listener1.desactivated);
		assertTrue(listener1.displayed);
		assertTrue(listener1.activated);
		
		assertFalse(listener2.filtered);
		assertFalse(listener2.desactivated);
		assertFalse(listener2.displayed);
		assertFalse(listener2.activated);

	}
	
	public void testManager18() throws Exception {
		m1.startUse("org.polarsys.kitalpha.vp.componentsample");
		Resource viewpoint = ViewpointManager.getViewpoint("org.polarsys.kitalpha.vp.componentsample");

		// no version information
		MetadataHelper.getViewpointMetadata(set).updateVersion(viewpoint, null);
		IStatus result = ViewpointManager.checkViewpointsCompliancy(set);
		assertTrue(result.isOK());

		// versions match exactly
		MetadataHelper.getViewpointMetadata(set).updateVersion(viewpoint, new Version(1, 1, 0, null));
		result = ViewpointManager.checkViewpointsCompliancy(set);
		assertTrue(result.isOK());

		// versions match since major & minor are equals
		MetadataHelper.getViewpointMetadata(set).updateVersion(viewpoint, new Version(1, 1, 0, null));
		result = ViewpointManager.checkViewpointsCompliancy(set);
		assertTrue(result.isOK());

		// doesn't match
		MetadataHelper.getViewpointMetadata(set).updateVersion(viewpoint, new Version(1, 0, 0, null));
		result = ViewpointManager.checkViewpointsCompliancy(set);
		assertFalse(result.isOK());
	}

	public class TestOverallListener implements OverallListener {
		public boolean filtered, displayed, activated, desactivated; 
		@Override
		public void hasBeenActivated(Object ctx, Resource vp) {
			activated = true;
		}

		@Override
		public void hasBeenDeactivated(Object ctx, Resource vp) {
			desactivated = true;
		}

		@Override
		public void hasBeenFiltered(Object ctx, Resource vp) {
			filtered = true;
		}

		@Override
		public void hasBeenDisplayed(Object ctx, Resource vp) {
			displayed = true;
		}
		
	}
	public class TestListener implements Listener {
		public boolean filtered, displayed, activated, desactivated; 
		@Override
		public void hasBeenFiltered(Resource vp) {
			filtered = true;
		}
		
		@Override
		public void hasBeenDisplayed(Resource vp) {
			displayed = true;
		}
		
		@Override
		public void hasBeenDeactivated(Resource vp) {
			desactivated = true;
		}
		
		@Override
		public void hasBeenActivated(Resource vp) {
			activated = true;
		}
	}
}

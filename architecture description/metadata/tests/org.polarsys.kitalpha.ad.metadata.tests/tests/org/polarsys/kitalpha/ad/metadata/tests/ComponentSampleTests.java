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
package org.polarsys.kitalpha.ad.metadata.tests;


import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.osgi.framework.Version;
import org.polarsys.kitalpha.ad.metadata.helpers.MetadataHelper;
import org.polarsys.kitalpha.ad.metadata.helpers.ViewpointMetadata;
import org.polarsys.kitalpha.resourcereuse.helper.ResourceReuse;

import junit.framework.TestCase;


/**
 * @author Thomas Guiu
 * 
 */
public class ComponentSampleTests extends TestCase {


	private ResourceSet set;
	private ViewpointMetadata m1;
	
	@Override
	protected void setUp() throws Exception {
		set = new ResourceSetImpl();  
		URI uri = URI.createPlatformPluginURI("/org.polarsys.kitalpha.ad.metadata.tests/resource/My.componentsample", true);
		set.getResource(uri, true);
		m1 = MetadataHelper.getViewpointMetadata(set);
		m1.initMetadataStorage();
	}

	@Override
	protected void tearDown() throws Exception {
		for (Resource r : set.getResources())
			r.unload();
		set.getResources().clear();
	}

	public void testHelper1() throws Exception {
		Map<String, Version> viewpointUsages = m1.getViewpointUsages();
		assertNotNull(viewpointUsages);
	}
	
	public void testHelper2() throws Exception {
		org.polarsys.kitalpha.resourcereuse.model.Resource resource = ResourceReuse.createHelper().getResource("org.polarsys.kitalpha.vp.componentsampleperformance");
		assertNotNull(resource);
		m1.setUsage(resource, null, true);
		Map<String, Version> viewpointUsages = m1.getViewpointUsages();
		assertEquals(1, viewpointUsages.size());
		
	}
	
	public void testHelper3() throws Exception {
		org.polarsys.kitalpha.resourcereuse.model.Resource resource = ResourceReuse.createHelper().getResource("org.polarsys.kitalpha.vp.componentsampleperformance");
		assertNotNull(resource);
		m1.setUsage(resource, null, true);
		Map<String, Version> viewpointUsages = m1.getViewpointUsages();
		assertEquals(1, viewpointUsages.size());
		m1.setUsage(resource, null, false);
		viewpointUsages = m1.getViewpointUsages();
		assertEquals(0, viewpointUsages.size());
	}
	
	public void testHelper4() throws Exception {
		org.polarsys.kitalpha.resourcereuse.model.Resource resource = ResourceReuse.createHelper().getResource("org.polarsys.kitalpha.vp.componentsampleperformance");
		assertNotNull(resource);
		assertFalse(m1.isInUse(resource.getId()));
		m1.setUsage(resource, null, true);
		Map<String, Version> viewpointUsages = m1.getViewpointUsages();
		assertEquals(1, viewpointUsages.size());
		assertTrue(m1.isInUse(resource.getId()));
		
	}

	public void testHelper5() throws Exception {
		org.polarsys.kitalpha.resourcereuse.model.Resource resource = ResourceReuse.createHelper().getResource("org.polarsys.kitalpha.vp.componentsampleperformance");
		assertNotNull(resource);
		m1.setUsage(resource, null, true);
		Map<String, Version> viewpointUsages = m1.getViewpointUsages();
		assertEquals(1, viewpointUsages.size());
		assertFalse(m1.isFiltered(resource.getId()));
	}

	public void testHelper6() throws Exception {
		org.polarsys.kitalpha.resourcereuse.model.Resource resource = ResourceReuse.createHelper().getResource("org.polarsys.kitalpha.vp.componentsampleperformance");
		assertNotNull(resource);
		m1.setUsage(resource, null, true);
		Map<String, Version> viewpointUsages = m1.getViewpointUsages();
		assertEquals(1, viewpointUsages.size());
		m1.setFilter(resource.getId(), true);
		assertTrue(m1.isFiltered(resource.getId()));
	}

	public void testHelper7() throws Exception {
		org.polarsys.kitalpha.resourcereuse.model.Resource resource = ResourceReuse.createHelper().getResource("org.polarsys.kitalpha.vp.componentsampleperformance");
		assertNotNull(resource);
		m1.setUsage(resource, null, true);
		Map<String, Version> viewpointUsages = m1.getViewpointUsages();
		assertEquals(1, viewpointUsages.size());
		m1.setFilter(resource.getId(), true);
		m1.setFilter(resource.getId(), false);
		assertFalse(m1.isFiltered(resource.getId()));
		
	}

	public void testHelper9() throws Exception {
		org.polarsys.kitalpha.resourcereuse.model.Resource resource = ResourceReuse.createHelper().getResource("org.polarsys.kitalpha.vp.componentsampleperformance");
		assertNotNull(resource);
		m1.setUsage(resource, null, true);
		Map<String, Version> viewpointUsages = m1.getViewpointUsages();
		assertEquals(1, viewpointUsages.size());
		String versionString = "1.0.0";
		m1.updateVersion(resource, new Version(versionString));
		viewpointUsages = m1.getViewpointUsages();
		Version version2 = viewpointUsages.get(resource.getId());
		assertNotNull(version2);
		assertEquals(versionString, version2.toString());
	}

	public void testHelper8() throws Exception {
		org.polarsys.kitalpha.resourcereuse.model.Resource resource = ResourceReuse.createHelper().getResource("org.polarsys.kitalpha.vp.componentsampleperformance");
		assertNotNull(resource);
		m1.setUsage(resource, null, true);
		Map<String, Version> viewpointUsages = m1.getViewpointUsages();
		assertEquals(1, viewpointUsages.size());
		Version version = viewpointUsages.get(resource.getId());
		assertNull(version);
	}

}

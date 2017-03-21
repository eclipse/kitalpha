/*******************************************************************************
 * Copyright (c) 2016-2017 Thales Global Services S.A.S.
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

import org.eclipse.emf.ecore.resource.Resource;
import org.osgi.framework.Version;
import org.polarsys.kitalpha.resourcereuse.helper.ResourceReuse;


/**
 * @author Thomas Guiu
 * 
 */
public class ComponentSampleTests extends ModelTests {


	public ComponentSampleTests() {
		super("/org.polarsys.kitalpha.ad.metadata.tests/resource/My.componentsample");
	}

	public void testHelper1() throws Exception {
		Map<String, Version> viewpointUsages = helper.getViewpointReferences();
		assertNotNull(viewpointUsages);
	}
	
	public void testHelper2() throws Exception {
		org.polarsys.kitalpha.resourcereuse.model.Resource resource = ResourceReuse.createHelper().getResource("org.polarsys.kitalpha.vp.componentsampleperformance");
		assertNotNull(resource);
		helper.reference(resource, null);
		Map<String, Version> viewpointUsages = helper.getViewpointReferences();
		assertEquals(1, viewpointUsages.size());
		
	}
	
	public void testHelper3() throws Exception {
		org.polarsys.kitalpha.resourcereuse.model.Resource resource = ResourceReuse.createHelper().getResource("org.polarsys.kitalpha.vp.componentsampleperformance");
		assertNotNull(resource);
		helper.reference(resource, null);
		Map<String, Version> viewpointUsages = helper.getViewpointReferences();
		assertEquals(1, viewpointUsages.size());
		helper.unReference(resource);
		viewpointUsages = helper.getViewpointReferences();
		assertEquals(0, viewpointUsages.size());
	}
	
	public void testHelper4() throws Exception {
		org.polarsys.kitalpha.resourcereuse.model.Resource resource = ResourceReuse.createHelper().getResource("org.polarsys.kitalpha.vp.componentsampleperformance");
		assertNotNull(resource);
		assertFalse(helper.isReferenced(resource.getId()));
		helper.reference(resource, null);
		Map<String, Version> viewpointUsages = helper.getViewpointReferences();
		assertEquals(1, viewpointUsages.size());
		assertTrue(helper.isReferenced(resource.getId()));
		
	}

	public void testHelper5() throws Exception {
		org.polarsys.kitalpha.resourcereuse.model.Resource resource = ResourceReuse.createHelper().getResource("org.polarsys.kitalpha.vp.componentsampleperformance");
		assertNotNull(resource);
		helper.reference(resource, null);
		Map<String, Version> viewpointUsages = helper.getViewpointReferences();
		assertEquals(1, viewpointUsages.size());
		assertFalse(helper.isInactive(resource.getId()));
	}

	public void testHelper6() throws Exception {
		org.polarsys.kitalpha.resourcereuse.model.Resource resource = ResourceReuse.createHelper().getResource("org.polarsys.kitalpha.vp.componentsampleperformance");
		assertNotNull(resource);
		helper.reference(resource, null);
		Map<String, Version> viewpointUsages = helper.getViewpointReferences();
		assertEquals(1, viewpointUsages.size());
		helper.setActivationSate(resource.getId(), false);
		assertTrue(helper.isInactive(resource.getId()));
	}

	public void testHelper7() throws Exception {
		org.polarsys.kitalpha.resourcereuse.model.Resource resource = ResourceReuse.createHelper().getResource("org.polarsys.kitalpha.vp.componentsampleperformance");
		assertNotNull(resource);
		helper.reference(resource, null);
		Map<String, Version> viewpointUsages = helper.getViewpointReferences();
		assertEquals(1, viewpointUsages.size());
		helper.setActivationSate(resource.getId(), false);
		helper.setActivationSate(resource.getId(), true);
		assertFalse(helper.isInactive(resource.getId()));
		
	}

	public void testHelper9() throws Exception {
		org.polarsys.kitalpha.resourcereuse.model.Resource resource = ResourceReuse.createHelper().getResource("org.polarsys.kitalpha.vp.componentsampleperformance");
		assertNotNull(resource);
		helper.reference(resource, null);
		Map<String, Version> viewpointUsages = helper.getViewpointReferences();
		assertEquals(1, viewpointUsages.size());
		String versionString = "1.0.0";
		helper.updateVersion(resource, new Version(versionString));
		viewpointUsages = helper.getViewpointReferences();
		Version version2 = viewpointUsages.get(resource.getId());
		assertNotNull(version2);
		assertEquals(versionString, version2.toString());
	}

	public void testHelper8() throws Exception {
		org.polarsys.kitalpha.resourcereuse.model.Resource resource = ResourceReuse.createHelper().getResource("org.polarsys.kitalpha.vp.componentsampleperformance");
		assertNotNull(resource);
		helper.reference(resource, null);
		Map<String, Version> viewpointUsages = helper.getViewpointReferences();
		assertEquals(1, viewpointUsages.size());
		Version version = viewpointUsages.get(resource.getId());
		assertNull(version);
	}

	public void testHelper10() throws Exception {
		org.polarsys.kitalpha.resourcereuse.model.Resource resource = ResourceReuse.createHelper().getResource("org.polarsys.kitalpha.vp.componentsampleperformance");
		assertNotNull(resource);
		helper.reference(resource, new Version("1.0.0"));
		Map<String, Version> viewpointUsages = helper.getViewpointReferences();
		assertEquals(1, viewpointUsages.size());
		Version version = viewpointUsages.get(resource.getId());
		assertTrue(version.equals(new Version("1.0.0")));
		
		helper.reference(resource, new Version("2.0.0"));
		viewpointUsages = helper.getViewpointReferences();
		assertEquals(1, viewpointUsages.size());
		version = viewpointUsages.get(resource.getId());
		assertTrue(version.equals(new Version("2.0.0")));
	}
	
	public void testHelper11() throws Exception {
		for (Resource r : set.getResources()) {
			if ("componentsample".equals(r.getURI().fileExtension()))
				assertFalse(r.isModified());
			else if ("afm".equals(r.getURI().fileExtension()))
				assertTrue(r.isModified());
		}
	}

}

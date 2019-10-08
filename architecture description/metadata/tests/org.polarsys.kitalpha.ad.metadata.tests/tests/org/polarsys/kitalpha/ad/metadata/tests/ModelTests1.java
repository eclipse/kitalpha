/*******************************************************************************
 * Copyright (c) 2017 Thales Global Services S.A.S.
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

import org.osgi.framework.Version;
import org.polarsys.kitalpha.resourcereuse.helper.ResourceHelper;
import org.polarsys.kitalpha.resourcereuse.helper.ResourceReuse;
import org.polarsys.kitalpha.resourcereuse.model.Resource;

/**
 * @author Thomas Guiu
 * 
 */
public class ModelTests1 extends ModelTests {

	public ModelTests1() {
		super("/org.polarsys.kitalpha.ad.metadata.tests/resource/My1_a.componentsample");
	}

	public void testManager1() throws Exception {
		assertEquals(5, helper.getAllViewpointReferences().size());
		assertEquals(helper.getAllViewpointReferences().get(0).getVpId(), "org.polarsys.kitalpha.vp.componentsampleframework");
		assertEquals(helper.getAllViewpointReferences().get(1).getVpId(), "org.polarsys.kitalpha.vp.componentsample");
		assertEquals(helper.getAllViewpointReferences().get(2).getVpId(), "org.polarsys.kitalpha.vp.componentsampleframework");
		assertEquals(helper.getAllViewpointReferences().get(3).getVpId(), "org.polarsys.kitalpha.vp.componentsample");
		assertEquals(helper.getAllViewpointReferences().get(4).getVpId(), "org.polarsys.kitalpha.vp.componentsamplesafety");
	}
	
	public void testManager2() throws Exception {
		Map<String, Version> viewpointReferences = helper.getViewpointReferences();
		assertEquals(2, viewpointReferences.size());
		Version v1 = viewpointReferences.get("org.polarsys.kitalpha.vp.componentsample");
		Version v2 = viewpointReferences.get("org.polarsys.kitalpha.vp.componentsampleframework");
		assertNotNull(v1);
		assertNotNull(v2);
	}
	
	public void testManager4() throws Exception {
		ResourceHelper rr = ResourceReuse.createHelper();
		Version v1 = helper.getVersion(rr.getResource("org.polarsys.kitalpha.vp.componentsample"));
		assertNotNull(v1);
		assertEquals("1.1.0.qualifier", v1.toString());

		Version v2 = helper.getVersion(rr.getResource("org.polarsys.kitalpha.vp.componentsampleframework"));
		assertNotNull(v2);
		assertEquals("1.1.0.qualifier", v2.toString());
		
		Version v = helper.getVersion(rr.getResource("org.polarsys.kitalpha.vp.componentsamplesafety"));
		assertNotNull(v);
		assertEquals("1.1.0.qualifier", v.toString());
	}

    public void testManager5() throws Exception {
        ResourceHelper rr = ResourceReuse.createHelper();
        Resource safetyVPResource = rr.getResource("org.polarsys.kitalpha.vp.componentsamplesafety");
        String newVersion = "1.42.42";
        Version v = helper.getVersion(safetyVPResource);
        assertEquals("1.1.0.qualifier", v.toString());
        helper.updateVersion(safetyVPResource, new Version(newVersion));
        v = helper.getVersion(safetyVPResource);
        assertNotNull(v);
        assertEquals(newVersion, v.toString());
    }
    
    public void testManager6() throws Exception {
		// viewpoint is already referenced into a linked model.
		ResourceHelper rr = ResourceReuse.createHelper();
		Version version = new Version(1,2,3);
		org.polarsys.kitalpha.resourcereuse.model.Resource resource = ResourceReuse.createHelper().getResource("org.polarsys.kitalpha.vp.componentsamplesafety");
		helper.reference(resource, version);
		
		assertTrue(helper.isReferenced("org.polarsys.kitalpha.vp.componentsamplesafety"));
		Version v = helper.getVersion(rr.getResource("org.polarsys.kitalpha.vp.componentsamplesafety"));
		assertNotNull(v);
		assertEquals("1.2.3", v.toString());
	}
	
    public void testManager7() throws Exception {
		// the viewpoint is referenced in both metadata objects. So although the viewpoint is successfully uneferenced from the top metadata, it is still referenced from the second one.
		org.polarsys.kitalpha.resourcereuse.model.Resource resource = ResourceReuse.createHelper().getResource("org.polarsys.kitalpha.vp.componentsample");
		helper.unReference(resource);
		assertTrue(helper.isReferenced("org.polarsys.kitalpha.vp.componentsample"));
	}

	public void testManager8() throws Exception {
		// viewpoint is referenced into a linked model.
		org.polarsys.kitalpha.resourcereuse.model.Resource resource = ResourceReuse.createHelper().getResource("org.polarsys.kitalpha.vp.componentsamplesafety");
		helper.unReference(resource);
		assertTrue(helper.isReferenced("org.polarsys.kitalpha.vp.componentsamplesafety"));
	}
	
	public void testManager9() throws Exception {
		for (org.eclipse.emf.ecore.resource.Resource r : set.getResources()) {
			assertFalse(r.isModified());
		}
		
	}
	
	public void testManager10() throws Exception {
		
	}
	
	public void testManager20() throws Exception {
		assertFalse(helper.isReferenced("org.polarsys.kitalpha.vp.componentsampleperformance"));
		assertTrue(helper.isReferenced("org.polarsys.kitalpha.vp.componentsamplesafety"));  // referenced into linked afm
	}

}

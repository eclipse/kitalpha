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
import org.polarsys.kitalpha.ad.metadata.commands.SetViewpointFilterCommand;
import org.polarsys.kitalpha.ad.metadata.commands.SetViewpointUsageCommand;
import org.polarsys.kitalpha.ad.metadata.commands.UpdateViewpointVersionCommand;
import org.polarsys.kitalpha.ad.metadata.helpers.MetadataHelper;
import org.polarsys.kitalpha.ad.metadata.helpers.ViewpointMetadata;
import org.polarsys.kitalpha.resourcereuse.helper.ResourceHelper;
import org.polarsys.kitalpha.resourcereuse.helper.ResourceReuse;

import junit.framework.TestCase;


/**
 * @author Thomas Guiu
 * 
 */
public class ComponentSampleTests2 extends TestCase {


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
		assertFalse(m1.isReferenced("org.polarsys.kitalpha.vp.componentsampleperformance"));
		assertFalse(m1.isInactive("org.polarsys.kitalpha.vp.componentsampleperformance"));
		
		SetViewpointFilterCommand cmd = new SetViewpointFilterCommand(set, "org.polarsys.kitalpha.vp.componentsampleperformance", true);
		cmd.execute();
		
		assertFalse(m1.isReferenced("org.polarsys.kitalpha.vp.componentsampleperformance"));
		// the viewpoint is not referenced
		assertFalse(m1.isInactive("org.polarsys.kitalpha.vp.componentsampleperformance"));
	}
	
	public void testHelper2() throws Exception {
		assertFalse(m1.isReferenced("org.polarsys.kitalpha.vp.componentsampleperformance"));
		assertFalse(m1.isInactive("org.polarsys.kitalpha.vp.componentsampleperformance"));
		
		org.polarsys.kitalpha.resourcereuse.model.Resource resource = ResourceReuse.createHelper().getResource("org.polarsys.kitalpha.vp.componentsampleperformance");
		m1.reference(resource, null);
		SetViewpointFilterCommand cmd = new SetViewpointFilterCommand(set, "org.polarsys.kitalpha.vp.componentsampleperformance", true);
		cmd.execute();
		
		assertTrue(m1.isReferenced("org.polarsys.kitalpha.vp.componentsampleperformance"));
		assertTrue(m1.isInactive("org.polarsys.kitalpha.vp.componentsampleperformance"));
	}
	
	public void testHelper3() throws Exception {
		assertFalse(m1.isReferenced("org.polarsys.kitalpha.vp.componentsampleperformance"));
		assertFalse(m1.isInactive("org.polarsys.kitalpha.vp.componentsampleperformance"));
		
		org.polarsys.kitalpha.resourcereuse.model.Resource resource = ResourceReuse.createHelper().getResource("org.polarsys.kitalpha.vp.componentsampleperformance");
		m1.reference(resource, null);
		SetViewpointFilterCommand cmd = new SetViewpointFilterCommand(set, "org.polarsys.kitalpha.vp.componentsampleperformance", true);
		cmd.execute();
		cmd.undo();
		
		assertTrue(m1.isReferenced("org.polarsys.kitalpha.vp.componentsampleperformance"));
		assertFalse(m1.isInactive("org.polarsys.kitalpha.vp.componentsampleperformance"));
	}
	
	public void testHelper4() throws Exception {
		assertFalse(m1.isReferenced("org.polarsys.kitalpha.vp.componentsampleperformance"));
		assertFalse(m1.isInactive("org.polarsys.kitalpha.vp.componentsampleperformance"));
		
		org.polarsys.kitalpha.resourcereuse.model.Resource resource = ResourceReuse.createHelper().getResource("org.polarsys.kitalpha.vp.componentsampleperformance");
		m1.reference(resource, null);
		SetViewpointFilterCommand cmd = new SetViewpointFilterCommand(set, "org.polarsys.kitalpha.vp.componentsampleperformance", true);
		cmd.execute();
		cmd = new SetViewpointFilterCommand(set, "org.polarsys.kitalpha.vp.componentsampleperformance", false);
		cmd.execute();
		
		assertTrue(m1.isReferenced("org.polarsys.kitalpha.vp.componentsampleperformance"));
		assertFalse(m1.isInactive("org.polarsys.kitalpha.vp.componentsampleperformance"));
	}
	
	public void testHelper5() throws Exception {
		assertFalse(m1.isReferenced("org.polarsys.kitalpha.vp.componentsampleperformance"));
		assertFalse(m1.isInactive("org.polarsys.kitalpha.vp.componentsampleperformance"));
		
		org.polarsys.kitalpha.resourcereuse.model.Resource resource = ResourceReuse.createHelper().getResource("org.polarsys.kitalpha.vp.componentsampleperformance");
		SetViewpointUsageCommand cmd = new SetViewpointUsageCommand(set, resource,null, true);
		cmd.execute();
		
		Map<String, Version> viewpointReferences = m1.getViewpointReferences();
		assertNotNull(viewpointReferences);
		Version version2 = viewpointReferences.get("org.polarsys.kitalpha.vp.componentsampleperformance");

		assertNull(version2);
		assertTrue(m1.isReferenced("org.polarsys.kitalpha.vp.componentsampleperformance"));
		assertFalse(m1.isInactive("org.polarsys.kitalpha.vp.componentsampleperformance"));
	}
	
	public void testHelper6() throws Exception {
		assertFalse(m1.isReferenced("org.polarsys.kitalpha.vp.componentsampleperformance"));
		assertFalse(m1.isInactive("org.polarsys.kitalpha.vp.componentsampleperformance"));
		
		org.polarsys.kitalpha.resourcereuse.model.Resource resource = ResourceReuse.createHelper().getResource("org.polarsys.kitalpha.vp.componentsampleperformance");
		Version version = new Version(5,6,7);
		SetViewpointUsageCommand cmd = new SetViewpointUsageCommand(set, resource, version, true);
		cmd.execute();
		
		Map<String, Version> viewpointReferences = m1.getViewpointReferences();
		assertNotNull(viewpointReferences);
		Version version2 = viewpointReferences.get("org.polarsys.kitalpha.vp.componentsampleperformance");
		assertNotNull(version2);
		assertEquals(version, version2);

		assertTrue(m1.isReferenced("org.polarsys.kitalpha.vp.componentsampleperformance"));
		assertFalse(m1.isInactive("org.polarsys.kitalpha.vp.componentsampleperformance"));
	}
	

	public void testHelper7() throws Exception {
		assertFalse(m1.isReferenced("org.polarsys.kitalpha.vp.componentsampleperformance"));
		assertFalse(m1.isInactive("org.polarsys.kitalpha.vp.componentsampleperformance"));
		
		org.polarsys.kitalpha.resourcereuse.model.Resource resource = ResourceReuse.createHelper().getResource("org.polarsys.kitalpha.vp.componentsampleperformance");
		SetViewpointUsageCommand cmd = new SetViewpointUsageCommand(set, resource,null, true);
		cmd.execute();
		cmd.undo();

		assertFalse(m1.isReferenced("org.polarsys.kitalpha.vp.componentsampleperformance"));
		assertFalse(m1.isInactive("org.polarsys.kitalpha.vp.componentsampleperformance"));
	}
	
	public void testHelper8() throws Exception {
		assertFalse(m1.isReferenced("org.polarsys.kitalpha.vp.componentsampleperformance"));
		assertFalse(m1.isInactive("org.polarsys.kitalpha.vp.componentsampleperformance"));
		
		org.polarsys.kitalpha.resourcereuse.model.Resource resource = ResourceReuse.createHelper().getResource("org.polarsys.kitalpha.vp.componentsampleperformance");
		m1.reference(resource, null);

		Version version = new Version(5,6,7);
		UpdateViewpointVersionCommand cmd = new UpdateViewpointVersionCommand(set, resource, version);
		cmd.execute();
		
		Map<String, Version> viewpointReferences = m1.getViewpointReferences();
		assertNotNull(viewpointReferences);
		Version version2 = viewpointReferences.get("org.polarsys.kitalpha.vp.componentsampleperformance");
		assertNotNull(version2);
		assertEquals(version, version2);

		assertFalse(m1.isInactive("org.polarsys.kitalpha.vp.componentsampleperformance"));
	}
	
	public void testHelper9() throws Exception {
		assertFalse(m1.isReferenced("org.polarsys.kitalpha.vp.componentsampleperformance"));
		assertFalse(m1.isInactive("org.polarsys.kitalpha.vp.componentsampleperformance"));
		
		org.polarsys.kitalpha.resourcereuse.model.Resource resource = ResourceReuse.createHelper().getResource("org.polarsys.kitalpha.vp.componentsampleperformance");
		m1.reference(resource, null);

		Version version = new Version(5,6,7);
		UpdateViewpointVersionCommand cmd = new UpdateViewpointVersionCommand(set, resource, version);
		cmd.execute();
		cmd.undo();
		
		Map<String, Version> viewpointReferences = m1.getViewpointReferences();
		assertNotNull(viewpointReferences);
		Version version2 = viewpointReferences.get("org.polarsys.kitalpha.vp.componentsampleperformance");
		assertNull(version2);

		assertFalse(m1.isInactive("org.polarsys.kitalpha.vp.componentsampleperformance"));
	}
	
	public void testHelper10() throws Exception {
		assertFalse(m1.isReferenced("org.polarsys.kitalpha.vp.componentsampleperformance"));
		assertFalse(m1.isInactive("org.polarsys.kitalpha.vp.componentsampleperformance"));
		
		Version version = new Version(5,6,7);
		org.polarsys.kitalpha.resourcereuse.model.Resource resource = ResourceReuse.createHelper().getResource("org.polarsys.kitalpha.vp.componentsampleperformance");
		m1.reference(resource, version);

		UpdateViewpointVersionCommand cmd = new UpdateViewpointVersionCommand(set, resource, null);
		cmd.execute();
		
		Map<String, Version> viewpointReferences = m1.getViewpointReferences();
		assertNotNull(viewpointReferences);
		Version version2 = viewpointReferences.get("org.polarsys.kitalpha.vp.componentsampleperformance");
		assertNull(version2);

		assertFalse(m1.isInactive("org.polarsys.kitalpha.vp.componentsampleperformance"));
	}
}

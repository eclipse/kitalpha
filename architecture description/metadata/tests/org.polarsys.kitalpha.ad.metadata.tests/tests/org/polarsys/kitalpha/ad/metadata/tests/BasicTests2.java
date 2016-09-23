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

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.osgi.framework.Version;
import org.polarsys.kitalpha.ad.metadata.helpers.MetadataHelper;
import org.polarsys.kitalpha.ad.metadata.helpers.ViewpointMetadata;
import org.polarsys.kitalpha.ad.metadata.metadata.Metadata;

import junit.framework.TestCase;


/**
 * @author Thomas Guiu
 * 
 */
public class BasicTests2 extends TestCase {


	public void testHelper1() throws Exception {
		ResourceSet set1 = new ResourceSetImpl();  
		ViewpointMetadata m1 = MetadataHelper.getViewpointMetadata(set1);
		Map<String, Version> viewpointUsages = m1.getViewpointReferences();
		assertNotNull(viewpointUsages);
		assertEquals(0, viewpointUsages.size());
	}
	
	public void testHelper2() throws Exception {
		ResourceSet set = new ResourceSetImpl();  
		set.getResource(URI.createPlatformPluginURI("/org.polarsys.kitalpha.ad.metadata.tests/resource/My.componentsample", true), true);
		ViewpointMetadata m1 = MetadataHelper.getViewpointMetadata(set);
		Resource initMetadataStorage = m1.initMetadataStorage();
		assertNotNull(initMetadataStorage);
	}
	
	public void testHelper3() throws Exception {
		ResourceSet set = new ResourceSetImpl();  
		ViewpointMetadata m1 = MetadataHelper.getViewpointMetadata(set);
		Resource initMetadataStorage = m1.initMetadataStorage(URI.createPlatformPluginURI("/org.polarsys.kitalpha.ad.metadata.tests/resource/My."+ViewpointMetadata.STORAGE_EXTENSION, true));
		assertNotNull(initMetadataStorage);
		EList<EObject> contents = initMetadataStorage.getContents();
		assertNotNull(contents);
		assertEquals(1, contents.size());
		EObject eObject = contents.get(0);
		assertNotNull(eObject);
		assertTrue(eObject instanceof Metadata);
		Metadata meta = (Metadata)eObject;
		assertEquals(0, meta.getViewpointReferences().size());
	}

	public void testHelper4() throws Exception {
		ResourceSet set = new ResourceSetImpl();  
		ViewpointMetadata m1 = MetadataHelper.getViewpointMetadata(set);
		assertFalse(m1.hasMetadata());
		Resource initMetadataStorage = m1.initMetadataStorage(URI.createPlatformPluginURI("/org.polarsys.kitalpha.ad.metadata.tests/resource/My."+ViewpointMetadata.STORAGE_EXTENSION, true));
		assertTrue(m1.hasMetadata());
	}

	public void testHelper5() throws Exception {
		ResourceSet set = new ResourceSetImpl();  
		ViewpointMetadata m1 = MetadataHelper.getViewpointMetadata(set);
		Resource initMetadataStorage = m1.initMetadataStorage(URI.createPlatformPluginURI("/org.polarsys.kitalpha.ad.metadata.tests/resource/My."+ViewpointMetadata.STORAGE_EXTENSION, true));
		assertTrue(initMetadataStorage instanceof XMLResource);
		assertEquals("UTF-8", ((XMLResource)initMetadataStorage).getEncoding());
	}

	public void testHelper6() throws Exception {
		ResourceSet set = new ResourceSetImpl();  
		Resource modelResource = set.getResource(URI.createPlatformPluginURI("/org.polarsys.kitalpha.ad.metadata.tests/resource/My2.componentsample", true), true);
		Resource initMetadata = MetadataHelper.initMetadata(modelResource);
		assertNotNull(initMetadata);
		EList<EObject> contents = initMetadata.getContents();
		assertNotNull(contents);
		assertEquals(1, contents.size());
		EObject eObject = contents.get(0);
		assertNotNull(eObject);
		assertTrue(eObject instanceof Metadata);
		Metadata meta = (Metadata)eObject;
		assertEquals(2, meta.getViewpointReferences().size());
	}
}

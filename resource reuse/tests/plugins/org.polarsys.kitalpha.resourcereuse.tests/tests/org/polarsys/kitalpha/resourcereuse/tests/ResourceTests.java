/*******************************************************************************
 * Copyright (c) 2014, 2017 Thales Global Services S.A.S.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *  
 * Contributors:
 *   Thales Global Services S.A.S - initial API and implementation
 *******************************************************************************/
package org.polarsys.kitalpha.resourcereuse.tests;

import org.polarsys.kitalpha.resourcereuse.helper.ResourceReuse;
import org.polarsys.kitalpha.resourcereuse.helper.ResourceNotFoundException;
import org.polarsys.kitalpha.resourcereuse.model.Resource;
import org.polarsys.kitalpha.resourcereuse.model.SearchCriteria;

import junit.framework.TestCase;


/**
 * @author Thomas Guiu
 * 
 */
public class ResourceTests extends TestCase {

	public void testMetadata13() throws Exception {
		Resource resource = ResourceReuse.createHelper().getResource("resource44.id");
		assertNotNull(resource);
		assertNotNull(resource.getMetadataPath());
		assertEquals("path://test.metadata", resource.getMetadataPath());
	}

	public void testMetadata12() throws Exception {
		Resource resource = ResourceReuse.createHelper().getResource("resource3.id");
		assertNotNull(resource);
		assertNull(resource.getMetadataPath());
	}

	public void testSearchConcern11() throws Exception {
		SearchCriteria searchCriteria = new SearchCriteria();
		searchCriteria.getUsedInConcerns().add("concern2");
		searchCriteria.getConcerns().add("concern1");
		Resource[] resources = ResourceReuse.createHelper().getResources(searchCriteria);
		assertNotNull(resources);
		assertEquals(1, resources.length);
	}

	public void testSearchConcern10() throws Exception {
		SearchCriteria searchCriteria = new SearchCriteria();
		searchCriteria.getUserInConcerns().add("concern2");
		searchCriteria.getConcerns().add("concern1");
		Resource[] resources = ResourceReuse.createHelper().getResources(searchCriteria);
		assertNotNull(resources);
		assertEquals(0, resources.length);
	}

	public void testSearchConcern9() throws Exception {
		SearchCriteria searchCriteria = new SearchCriteria();
		searchCriteria.getUserInConcerns().add("concern2");
		searchCriteria.getConcerns().add("concern2");
		searchCriteria.setName(".*1");
		Resource[] resources = ResourceReuse.createHelper().getResources(searchCriteria);
		assertNotNull(resources);
		assertEquals(1, resources.length);
	}

	public void testSearchConcern8() throws Exception {
		SearchCriteria searchCriteria = new SearchCriteria();
		searchCriteria.getConcerns().add("concern2");
		searchCriteria.setName(".*1");
		Resource[] resources = ResourceReuse.createHelper().getResources(searchCriteria);
		assertNotNull(resources);
		assertEquals(1, resources.length);
	}

	public void testSearchConcern7() throws Exception {
		SearchCriteria searchCriteria = new SearchCriteria();
		searchCriteria.getConcerns().add("concern1");
		searchCriteria.setName(".*1");
		Resource[] resources = ResourceReuse.createHelper().getResources(searchCriteria);
		assertNotNull(resources);
		assertEquals(0, resources.length);
	}

	public void testSearchConcern6() throws Exception {
		SearchCriteria searchCriteria = new SearchCriteria();
		searchCriteria.getConcerns().add("concern1");
		searchCriteria.getConcerns().add("concern2");
		Resource[] resources = ResourceReuse.createHelper().getResources(searchCriteria);
		assertNotNull(resources);
		assertEquals(1, resources.length);
	}

	public void testSearchConcern5() throws Exception {
		SearchCriteria searchCriteria = new SearchCriteria();
		searchCriteria.getConcerns().add("concern2");
		Resource[] resources = ResourceReuse.createHelper().getResources(searchCriteria);
		assertNotNull(resources);
		assertEquals(3, resources.length);
	}

	public void testSearchConcern4() throws Exception {
		SearchCriteria searchCriteria = new SearchCriteria();
		searchCriteria.getUserInConcerns().add("concern2");
		searchCriteria.setName(".*1");
		Resource[] resources = ResourceReuse.createHelper().getResources(searchCriteria);
		assertNotNull(resources);
		assertEquals(1, resources.length);
	}

	public void testSearchConcern3() throws Exception {
		SearchCriteria searchCriteria = new SearchCriteria();
		searchCriteria.getUsedInConcerns().add("concern1");
		searchCriteria.setName(".*1");
		Resource[] resources = ResourceReuse.createHelper().getResources(searchCriteria);
		assertNotNull(resources);
		assertEquals(0, resources.length);
	}

	public void testSearchConcern2() throws Exception {
		SearchCriteria searchCriteria = new SearchCriteria();
		searchCriteria.getUsedInConcerns().add("concern1");
		searchCriteria.getUsedInConcerns().add("concern2");
		Resource[] resources = ResourceReuse.createHelper().getResources(searchCriteria);
		assertNotNull(resources);
		assertEquals(1, resources.length);
	}

	public void testSearchConcern1() throws Exception {
		SearchCriteria searchCriteria = new SearchCriteria();
		searchCriteria.getUserInConcerns().add("concern2");
		Resource[] resources = ResourceReuse.createHelper().getResources(searchCriteria);
		assertNotNull(resources);
		assertEquals(1, resources.length);
	}

	public void testSearchTagAndName() throws Exception {
		SearchCriteria searchCriteria = new SearchCriteria();
		searchCriteria.getTags().add("toto");
		searchCriteria.setName(".*44");
		Resource[] resources = ResourceReuse.createHelper().getResources(searchCriteria);
		assertNotNull(resources);
		assertEquals(1, resources.length);
	}

	public void testSearchTag3() throws Exception {
		SearchCriteria searchCriteria = new SearchCriteria();
		searchCriteria.getTags().add("unused tag");
		Resource[] resources = ResourceReuse.createHelper().getResources(searchCriteria);
		assertNotNull(resources);
		assertEquals(0, resources.length);
	}

	public void testSearchTag2() throws Exception {
		SearchCriteria searchCriteria = new SearchCriteria();
		searchCriteria.getTags().add("titi");
		searchCriteria.getTags().add("toto");

		Resource[] resources = ResourceReuse.createHelper().getResources(searchCriteria);
		assertNotNull(resources);
		assertEquals(2, resources.length);
	}

	public void testSearchTag1() throws Exception {
		SearchCriteria searchCriteria = new SearchCriteria();
		searchCriteria.getTags().add("titi");
		Resource[] resources = ResourceReuse.createHelper().getResources(searchCriteria);
		assertNotNull(resources);
		assertEquals(3, resources.length);
	}

	public void testSearchVersionAndId() throws Exception {
		SearchCriteria searchCriteria = new SearchCriteria();
		searchCriteria.setVersion("V1");
		searchCriteria.setId("resource4.id");
		Resource[] resources = ResourceReuse.createHelper().getResources(searchCriteria);
		assertNotNull(resources);
		assertEquals(1, resources.length);
	}

	public void testSearchVersion() throws Exception {
		SearchCriteria searchCriteria = new SearchCriteria();
		searchCriteria.setVersion("V1");
		Resource[] resources = ResourceReuse.createHelper().getResources(searchCriteria);
		assertNotNull(resources);
		assertEquals(2, resources.length);
	}

	public void testSearchDomain2() throws Exception {
		SearchCriteria searchCriteria = new SearchCriteria();
		searchCriteria.setDomain("re-test");
		Resource[] resources = ResourceReuse.createHelper().getResources(searchCriteria);
		assertNotNull(resources);
		assertEquals(1, resources.length);
	}

	public void testSearchDomain1() throws Exception {
		SearchCriteria searchCriteria = new SearchCriteria();
		searchCriteria.setDomain("test");
		Resource[] resources = ResourceReuse.createHelper().getResources(searchCriteria);
		assertNotNull(resources);
		assertEquals(3, resources.length);
	}

	public void testSearchId1() throws Exception {
		SearchCriteria searchCriteria = new SearchCriteria();
		searchCriteria.setId("resource.*");
		Resource[] resources = ResourceReuse.createHelper().getResources(searchCriteria);
		assertNotNull(resources);
		assertEquals(6, resources.length);
	}

	public void testSearchId2() throws Exception {
		SearchCriteria searchCriteria = new SearchCriteria();
		searchCriteria.setId("resource3.*");
		Resource[] resources = ResourceReuse.createHelper().getResources(searchCriteria);
		assertNotNull(resources);
		assertEquals(1, resources.length);
	}

	public void testSearchId3() throws Exception {
		SearchCriteria searchCriteria = new SearchCriteria();
		searchCriteria.setId("resource3.id");
		Resource[] resources = ResourceReuse.createHelper().getResources(searchCriteria);
		assertNotNull(resources);
		assertEquals(1, resources.length);
	}

	public void testSearchId4() throws Exception {
		SearchCriteria searchCriteria = new SearchCriteria();
		searchCriteria.setId("resource5.id");
		Resource[] resources = ResourceReuse.createHelper().getResources(searchCriteria);
		assertNotNull(resources);
		assertEquals(1, resources.length);
		assertNull(resources[0].getName());
	}

	public void testSearchEmptyCriteria() throws Exception {
		try {
			SearchCriteria searchCriteria = new SearchCriteria();
			ResourceReuse.createHelper().getResources(searchCriteria);
			fail("IllegalArgumentException was expected");
		} catch (IllegalArgumentException e) {
		}
	}

	public void testSearchNullCriteria() throws Exception {
		try {
			ResourceReuse.createHelper().getResources(null);
			fail("IllegalArgumentException was expected");
		} catch (IllegalArgumentException e) {
		}
	}

	public void testIdLookup4() throws Exception {
		try {
			Resource resource = ResourceReuse.createHelper().getResource("resource2.id");
			assertNotNull(resource);
			assertEquals(resource.getId(), "resource2.id");
		} catch (ResourceNotFoundException e) {
			fail("ResourceNotFoundException was not expected");
		}
	}

	public void testIdLookup3() throws Exception {
		try {
			ResourceReuse.createHelper().getResource("id");
			fail("ResourceNotFoundException was expected");
		} catch (ResourceNotFoundException e) {
		}
	}

	public void testIdLookup2() throws Exception {
		try {
			ResourceReuse.createHelper().getResource("");
			fail("IllegalArgumentException was expected");
		} catch (IllegalArgumentException e) {
		}
	}

	public void testIdLookup1() throws Exception {
		try {
			ResourceReuse.createHelper().getResource(null);
			fail("IllegalArgumentException was expected");
		} catch (IllegalArgumentException e) {
		}
	}
}

/*******************************************************************************
 * Copyright (c) 2014, 2017 Thales Global Services S.A.S.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 * 
 * SPDX-License-Identifier: EPL-2.0
 *  
 * Contributors:
 *   Thales Global Services S.A.S - initial API and implementation
 *******************************************************************************/
package org.polarsys.kitalpha.resourcereuse.tests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.fail;

import org.junit.Test;
import org.polarsys.kitalpha.resourcereuse.helper.ResourceNotFoundException;
import org.polarsys.kitalpha.resourcereuse.helper.ResourceReuse;
import org.polarsys.kitalpha.resourcereuse.model.Resource;
import org.polarsys.kitalpha.resourcereuse.model.SearchCriteria;



/**
 * @author Thomas Guiu
 * 
 */
public class ResourceTests {

	@Test
	public void checkMetadata13() throws Exception {
		Resource resource = ResourceReuse.createHelper().getResource("resource44.id");
		assertNotNull(resource);
		assertNotNull(resource.getMetadataPath());
		assertEquals("path://test.metadata", resource.getMetadataPath());
	}

	@Test
	public void checkMetadata12() throws Exception {
		Resource resource = ResourceReuse.createHelper().getResource("resource3.id");
		assertNotNull(resource);
		assertNull(resource.getMetadataPath());
	}

	@Test
	public void checkSearchConcern11() throws Exception {
		SearchCriteria searchCriteria = new SearchCriteria();
		searchCriteria.getUsedInConcerns().add("concern2");
		searchCriteria.getConcerns().add("concern1");
		Resource[] resources = ResourceReuse.createHelper().getResources(searchCriteria);
		assertNotNull(resources);
		assertEquals(1, resources.length);
	}

	@Test
	public void checkSearchConcern10() throws Exception {
		SearchCriteria searchCriteria = new SearchCriteria();
		searchCriteria.getUserInConcerns().add("concern2");
		searchCriteria.getConcerns().add("concern1");
		Resource[] resources = ResourceReuse.createHelper().getResources(searchCriteria);
		assertNotNull(resources);
		assertEquals(0, resources.length);
	}

	@Test
	public void checkSearchConcern9() throws Exception {
		SearchCriteria searchCriteria = new SearchCriteria();
		searchCriteria.getUserInConcerns().add("concern2");
		searchCriteria.getConcerns().add("concern2");
		searchCriteria.setName(".*1");
		Resource[] resources = ResourceReuse.createHelper().getResources(searchCriteria);
		assertNotNull(resources);
		assertEquals(1, resources.length);
	}

	@Test
	public void checkSearchConcern8() throws Exception {
		SearchCriteria searchCriteria = new SearchCriteria();
		searchCriteria.getConcerns().add("concern2");
		searchCriteria.setName(".*1");
		Resource[] resources = ResourceReuse.createHelper().getResources(searchCriteria);
		assertNotNull(resources);
		assertEquals(1, resources.length);
	}

	@Test
	public void checkSearchConcern7() throws Exception {
		SearchCriteria searchCriteria = new SearchCriteria();
		searchCriteria.getConcerns().add("concern1");
		searchCriteria.setName(".*1");
		Resource[] resources = ResourceReuse.createHelper().getResources(searchCriteria);
		assertNotNull(resources);
		assertEquals(0, resources.length);
	}

	@Test
	public void checkSearchConcern6() throws Exception {
		SearchCriteria searchCriteria = new SearchCriteria();
		searchCriteria.getConcerns().add("concern1");
		searchCriteria.getConcerns().add("concern2");
		Resource[] resources = ResourceReuse.createHelper().getResources(searchCriteria);
		assertNotNull(resources);
		assertEquals(1, resources.length);
	}

	@Test
	public void checkSearchConcern5() throws Exception {
		SearchCriteria searchCriteria = new SearchCriteria();
		searchCriteria.getConcerns().add("concern2");
		Resource[] resources = ResourceReuse.createHelper().getResources(searchCriteria);
		assertNotNull(resources);
		assertEquals(3, resources.length);
	}

	@Test
	public void checkSearchConcern4() throws Exception {
		SearchCriteria searchCriteria = new SearchCriteria();
		searchCriteria.getUserInConcerns().add("concern2");
		searchCriteria.setName(".*1");
		Resource[] resources = ResourceReuse.createHelper().getResources(searchCriteria);
		assertNotNull(resources);
		assertEquals(1, resources.length);
	}

	@Test
	public void checkSearchConcern3() throws Exception {
		SearchCriteria searchCriteria = new SearchCriteria();
		searchCriteria.getUsedInConcerns().add("concern1");
		searchCriteria.setName(".*1");
		Resource[] resources = ResourceReuse.createHelper().getResources(searchCriteria);
		assertNotNull(resources);
		assertEquals(0, resources.length);
	}

	@Test
	public void checkSearchConcern2() throws Exception {
		SearchCriteria searchCriteria = new SearchCriteria();
		searchCriteria.getUsedInConcerns().add("concern1");
		searchCriteria.getUsedInConcerns().add("concern2");
		Resource[] resources = ResourceReuse.createHelper().getResources(searchCriteria);
		assertNotNull(resources);
		assertEquals(1, resources.length);
	}

	@Test
	public void checkSearchConcern1() throws Exception {
		SearchCriteria searchCriteria = new SearchCriteria();
		searchCriteria.getUserInConcerns().add("concern2");
		Resource[] resources = ResourceReuse.createHelper().getResources(searchCriteria);
		assertNotNull(resources);
		assertEquals(1, resources.length);
	}

	@Test
	public void checkSearchTagAndName() throws Exception {
		SearchCriteria searchCriteria = new SearchCriteria();
		searchCriteria.getTags().add("toto");
		searchCriteria.setName(".*44");
		Resource[] resources = ResourceReuse.createHelper().getResources(searchCriteria);
		assertNotNull(resources);
		assertEquals(1, resources.length);
	}

	@Test
	public void checkSearchTag3() throws Exception {
		SearchCriteria searchCriteria = new SearchCriteria();
		searchCriteria.getTags().add("unused tag");
		Resource[] resources = ResourceReuse.createHelper().getResources(searchCriteria);
		assertNotNull(resources);
		assertEquals(0, resources.length);
	}

	@Test
	public void checkSearchTag2() throws Exception {
		SearchCriteria searchCriteria = new SearchCriteria();
		searchCriteria.getTags().add("titi");
		searchCriteria.getTags().add("toto");

		Resource[] resources = ResourceReuse.createHelper().getResources(searchCriteria);
		assertNotNull(resources);
		assertEquals(2, resources.length);
	}

	@Test
	public void checkSearchTag1() throws Exception {
		SearchCriteria searchCriteria = new SearchCriteria();
		searchCriteria.getTags().add("titi");
		Resource[] resources = ResourceReuse.createHelper().getResources(searchCriteria);
		assertNotNull(resources);
		assertEquals(3, resources.length);
	}

	@Test
	public void checkSearchVersionAndId() throws Exception {
		SearchCriteria searchCriteria = new SearchCriteria();
		searchCriteria.setVersion("V1");
		searchCriteria.setId("resource4.id");
		Resource[] resources = ResourceReuse.createHelper().getResources(searchCriteria);
		assertNotNull(resources);
		assertEquals(1, resources.length);
	}

	@Test
	public void checkSearchVersion() throws Exception {
		SearchCriteria searchCriteria = new SearchCriteria();
		searchCriteria.setVersion("V1");
		Resource[] resources = ResourceReuse.createHelper().getResources(searchCriteria);
		assertNotNull(resources);
		assertEquals(2, resources.length);
	}

	@Test
	public void checkSearchDomain2() throws Exception {
		SearchCriteria searchCriteria = new SearchCriteria();
		searchCriteria.setDomain("re-test");
		Resource[] resources = ResourceReuse.createHelper().getResources(searchCriteria);
		assertNotNull(resources);
		assertEquals(1, resources.length);
	}

	@Test
	public void checkSearchDomain1() throws Exception {
		SearchCriteria searchCriteria = new SearchCriteria();
		searchCriteria.setDomain("test");
		Resource[] resources = ResourceReuse.createHelper().getResources(searchCriteria);
		assertNotNull(resources);
		assertEquals(3, resources.length);
	}

	@Test
	public void checkSearchId1() throws Exception {
		SearchCriteria searchCriteria = new SearchCriteria();
		searchCriteria.setId("resource.*");
		Resource[] resources = ResourceReuse.createHelper().getResources(searchCriteria);
		assertNotNull(resources);
		assertEquals(6, resources.length);
	}

	@Test
	public void checkSearchId2() throws Exception {
		SearchCriteria searchCriteria = new SearchCriteria();
		searchCriteria.setId("resource3.*");
		Resource[] resources = ResourceReuse.createHelper().getResources(searchCriteria);
		assertNotNull(resources);
		assertEquals(1, resources.length);
	}

	@Test
	public void checkSearchId3() throws Exception {
		SearchCriteria searchCriteria = new SearchCriteria();
		searchCriteria.setId("resource3.id");
		Resource[] resources = ResourceReuse.createHelper().getResources(searchCriteria);
		assertNotNull(resources);
		assertEquals(1, resources.length);
	}

	@Test
	public void checkSearchId4() throws Exception {
		SearchCriteria searchCriteria = new SearchCriteria();
		searchCriteria.setId("resource5.id");
		Resource[] resources = ResourceReuse.createHelper().getResources(searchCriteria);
		assertNotNull(resources);
		assertEquals(1, resources.length);
		assertNull(resources[0].getName());
	}

	@Test
	public void checkSearchEmptyCriteria() throws Exception {
		try {
			SearchCriteria searchCriteria = new SearchCriteria();
			ResourceReuse.createHelper().getResources(searchCriteria);
			fail("IllegalArgumentException was expected");
		} catch (IllegalArgumentException e) {
		}
	}

	@Test
	public void checkSearchNullCriteria() throws Exception {
		try {
			ResourceReuse.createHelper().getResources(null);
			fail("IllegalArgumentException was expected");
		} catch (IllegalArgumentException e) {
		}
	}

	@Test
	public void checkIdLookup4() throws Exception {
		try {
			Resource resource = ResourceReuse.createHelper().getResource("resource2.id");
			assertNotNull(resource);
			assertEquals(resource.getId(), "resource2.id");
		} catch (ResourceNotFoundException e) {
			fail("ResourceNotFoundException was not expected");
		}
	}

	@Test
	public void checkIdLookup3() throws Exception {
		try {
			ResourceReuse.createHelper().getResource("id");
			fail("ResourceNotFoundException was expected");
		} catch (ResourceNotFoundException e) {
		}
	}

	@Test
	public void checkIdLookup2() throws Exception {
		try {
			ResourceReuse.createHelper().getResource("");
			fail("IllegalArgumentException was expected");
		} catch (IllegalArgumentException e) {
		}
	}

	@Test
	public void checkIdLookup1() throws Exception {
		try {
			ResourceReuse.createHelper().getResource(null);
			fail("IllegalArgumentException was expected");
		} catch (IllegalArgumentException e) {
		}
	}
}

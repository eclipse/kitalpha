/*******************************************************************************
 * Copyright (c) 2016, 2020 Thales Global Services S.A.S.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 * 
 * SPDX-License-Identifier: EPL-2.0
 *  
 * Contributors:
 *   Thales Global Services S.A.S - initial API and implementation
 *******************************************************************************/
package org.polarsys.kitalpha.resourcereuse.emfscheme.test.ju.api;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.polarsys.kitalpha.resourcereuse.emfscheme.ModelReuseURIConverter;
import org.polarsys.kitalpha.resourcereuse.emfscheme.api.IModelReuseLoader;
import org.polarsys.kitalpha.resourcereuse.emfscheme.api.ModelReuseLoaderFactory;
import org.polarsys.kitalpha.resourcereuse.emfscheme.helpers.ModelReuseHelper;
import org.polarsys.kitalpha.resourcereuse.model.SearchCriteria;

/**
 * Nominal tests
 * @author Faycal ABKA
 *
 */
public class ModelReuseLoaderTestsOK {
	
	private ResourceSet resourceSet;
	private IModelReuseLoader loader;
	
	private final String ID_TEST_RESOURCE = "org.polarsys.kitalpha.resourcereuse.emfscheme.test.ju.test";
	private final String TEST_MODEL_NAME  = "Model Test";
	
	private final URI modelReuseURI = URI.createURI("modelreuse:/id=org.polarsys.kitalpha.resourcereuse.emfscheme.test.ju.test");
	private final URI emfURI = URI.createURI("platform:/plugin/org.polarsys.kitalpha.resourcereuse.emfscheme.test.ju/models/Test.vpdesc");
	private final URI emfURI2 = URI.createURI("platform:/plugin/org.polarsys.kitalpha.resourcereuse.emfscheme.test.ju/models/Test2.vpdesc");
	
	@Before
	public void setup(){
		resourceSet = new ResourceSetImpl();
		loader = ModelReuseLoaderFactory.createModelReuseLoader();
	}

	//Test load(EObject, URI)
	@Test
	public void loadEObjectURI() {
		//model reuse
		Resource resource = loader.load(resourceSet, modelReuseURI);
		assertNotNull(resource);
		assertEquals(resourceSet.getResource(modelReuseURI, false), resource);
		
		//EMF
		resource = loader.load(resourceSet, emfURI);
		assertNotNull(resource);
		assertEquals(resourceSet.getResource(emfURI, false), resource);
		
		assertEquals(resourceSet.getResources().size(), 1);
		
	}

	//Test load(EObject, URI)
	@Test
	public void loadEObjectStringURI() {
		
		//model reuse
		Resource resource = loader.load(resourceSet, modelReuseURI);
		assertNotNull(resource);
		assertEquals(resourceSet.getResource(modelReuseURI, false), resource);
		
		
		loader.load(loader.load(resourceSet, emfURI), modelReuseURI.toString());
		assertEquals(resourceSet.getResources().size(), 1);
		assertEquals(resourceSet.getResources().get(0).getURI().toString(), modelReuseURI.toString());
		
		assertEquals(resourceSet.getResources().size(), 1);
	}

	//Test load(Resource, URI)
	@Test
	public void loadResourceURI() {
		Resource resource = resourceSet.getResource(emfURI2, true);
		Resource loadedResource = loader.load(resource, modelReuseURI);
		assertNotNull(loadedResource);
		assertEquals(resourceSet.getResource(modelReuseURI, false), loadedResource);
		
		assertEquals(resourceSet.getResources().size(), 2);
	}

	//Test load(Resource, URI)
	@Test
	public void loadResourceStringURI() {
		Resource resource = resourceSet.getResource(emfURI2, true);
		Resource loadedResource = loader.load(resource, modelReuseURI.toString());
		assertNotNull(loadedResource);
		assertEquals(resourceSet.getResource(modelReuseURI, false), loadedResource);
		
		assertEquals(resourceSet.getResources().size(), 2);
	}
	
	//Test load(ResourceSet, URI)
	@Test
	public void loadResourceSetURI() {
		Resource loadedResource = loader.load(resourceSet, modelReuseURI);
		assertNotNull(loadedResource);
		assertEquals(resourceSet.getResources().size(), 1);
		assertEquals(resourceSet.getResources().get(0).getURI().toString(), modelReuseURI.toString());
		assertEquals(resourceSet.getResource(modelReuseURI, false), loadedResource);
		
		assertEquals(resourceSet.getResources().size(), 1);
	}

	//Test load(ResourceSet, URI)
	@Test
	public void loadResourceSetStringURI() {
		Resource loadedResource = loader.load(resourceSet, modelReuseURI.toString());
		assertNotNull(loadedResource);
		assertEquals(resourceSet.getResources().size(), 1);
		assertEquals(resourceSet.getResources().get(0).getURI().toString(), modelReuseURI.toString());
		assertEquals(resourceSet.getResource(modelReuseURI, false), loadedResource);
		
		assertEquals(resourceSet.getResources().size(), 1);
	}
	
	//Test load(EObject, resourcereuse)
	@Test
	public void loadEObjectResourcereuse(){
		SearchCriteria c = new SearchCriteria();
		c.setId(ID_TEST_RESOURCE);
		c.setName(TEST_MODEL_NAME);
		List<org.polarsys.kitalpha.resourcereuse.model.Resource> resourcereuseList = ModelReuseHelper.findModelsAccordingToCriteria(c);
		
		Resource loadedResource = loader.load(resourceSet, resourcereuseList.get(0));
		assertNotNull(loadedResource);
		assertEquals(resourceSet.getResources().size(), 1);
		assertEquals(resourceSet.getResources().get(0).getURI().toString(), modelReuseURI.toString());
		assertEquals(resourceSet.getResource(modelReuseURI, false), loadedResource);
		
	}
	
	//Test load(Resource, resourcereuse)
	@Test
	public void loadResourceResourcereuse(){
		SearchCriteria c = new SearchCriteria();
		c.setId(ID_TEST_RESOURCE);
		c.setName(TEST_MODEL_NAME);
		List<org.polarsys.kitalpha.resourcereuse.model.Resource> resourcereuseList = ModelReuseHelper.findModelsAccordingToCriteria(c);
		Resource resource = resourceSet.getResource(emfURI2, true);
		
		Resource loadedResource = loader.load(resource, resourcereuseList.get(0));
		assertNotNull(loadedResource);
		assertEquals(resourceSet.getResources().size(), 2); 
		assertTrue(resourceSet.getResources().contains(loadedResource));
	}
	
	//Test load(ResourceSet, resourcereuse)
	@Test
	public void loadResourceSetResourcereuse(){
		SearchCriteria c = new SearchCriteria();
		c.setId(ID_TEST_RESOURCE);
		c.setName(TEST_MODEL_NAME);
		List<org.polarsys.kitalpha.resourcereuse.model.Resource> resourcereuseList = ModelReuseHelper.findModelsAccordingToCriteria(c);
		
		Resource loadedResource = loader.load(resourceSet, resourcereuseList.get(0));
		assertNotNull(loadedResource);
		assertEquals(resourceSet.getResources().size(), 1);
		assertEquals(resourceSet.getResource(modelReuseURI, false), loadedResource);
	}
	
	//Test load(EObject, resourcereuse string attributes
	@Test
	public void loadEObjectResourceReuseAttributes(){
		Resource loadedResource = loader.load(resourceSet, ID_TEST_RESOURCE, TEST_MODEL_NAME, null, null, null);
		assertNotNull(loadedResource);
		assertEquals(resourceSet.getResources().size(), 1);
		assertEquals(resourceSet.getResource(modelReuseURI, false), loadedResource);
	}
	
	//Test load(Resource, resourcereuse string attributes
	@Test
	public void loadResourceResourceReuseAttributes(){
		Resource resource = resourceSet.getResource(emfURI2, true);
		assertNotNull(resource);
		Resource loadedResource = loader.load(resource, ID_TEST_RESOURCE, TEST_MODEL_NAME, null, null, null);
		assertNotNull(loadedResource);
		assertEquals(resourceSet.getResources().size(), 2); 
		assertTrue(resourceSet.getResources().contains(loadedResource));
	}
	
	//Test load(ResourceSet, resourcereuse string attributes
	@Test
	public void loadResourceSetResourceReuseAttributes(){
		Resource loadedResource = loader.load(resourceSet, ID_TEST_RESOURCE, TEST_MODEL_NAME, null, null, null);
		assertNotNull(loadedResource);
		assertEquals(resourceSet.getResources().size(), 1);
		assertEquals(resourceSet.getResource(modelReuseURI, false), loadedResource);
	}

	//Test load(EObject, resourcereuse criteria
	@Test
	public void loadEObjectResourceReuseCriteria(){
		SearchCriteria c = new SearchCriteria();
		c.setId(ID_TEST_RESOURCE);
		c.setName(TEST_MODEL_NAME);
		Resource loadedResource = loader.load(resourceSet, c);
		assertNotNull(loadedResource);
		assertEquals(resourceSet.getResources().size(), 1);
		assertEquals(resourceSet.getResource(modelReuseURI, false), loadedResource);
	}

	//Test load(Resource, resourcereuse criteria
	@Test
	public void loadResourceResourceReuseCriteria(){
		SearchCriteria c = new SearchCriteria();
		c.setId(ID_TEST_RESOURCE);
		c.setName(TEST_MODEL_NAME);
		Resource loadedResource = loader.load(resourceSet, c);
		assertNotNull(loadedResource);
		assertEquals(resourceSet.getResources().size(), 1);
		assertEquals(resourceSet.getResource(modelReuseURI, false), loadedResource);
	}

	//Test load(EObject, resourcereuse criteria
	@Test
	public void loadResourceSetResourceReuseCriteria(){
		SearchCriteria c = new SearchCriteria();
		c.setId(ID_TEST_RESOURCE);
		c.setName(TEST_MODEL_NAME);
		Resource loadedResource = loader.load(resourceSet, c);
		assertNotNull(loadedResource);
		assertEquals(resourceSet.getResources().size(), 1);
		assertEquals(resourceSet.getResource(modelReuseURI, false), loadedResource);
	}
	
	
	
	
	
	//Test load(EObject, URIConverter, URI)
	@Test
	public void loadEObjectURIWithURIConverter() {
		//model reuse
		Resource resource = loader.load(resourceSet, new ModelReuseURIConverter(), modelReuseURI);
		assertNotNull(resource);
		assertEquals(resourceSet.getResource(modelReuseURI, false), resource);

		//EMF
		resource = loader.load(resourceSet, new ModelReuseURIConverter(),emfURI);
		assertNotNull(resource);
		assertEquals(resourceSet.getResource(emfURI, false), resource);

		assertEquals(resourceSet.getResources().size(), 1);
	}

	//Test load(EObject, URIConverter, URI)
	@Test
	public void loadEObjectStringURIURIConverter() {
		//model reuse
		Resource resource = loader.load(resourceSet, new ModelReuseURIConverter(), modelReuseURI.toString());
		assertNotNull(resource);
		assertEquals(resourceSet.getResource(modelReuseURI, false), resource);

		//EMF
		resource = loader.load(resourceSet, new ModelReuseURIConverter(), emfURI);
		assertNotNull(resource);
		assertEquals(resourceSet.getResource(emfURI, false), resource);

		assertEquals(resourceSet.getResources().size(), 1);
	}

	//Test load(Resource, URIConverter, URI)
	@Test
	public void loadResourceURIURIConverter() {
		Resource resource = resourceSet.getResource(emfURI2, true);
		Resource loadedResource = loader.load(resource, new ModelReuseURIConverter(), modelReuseURI);
		assertNotNull(loadedResource);
		assertEquals(resourceSet.getResource(modelReuseURI, false), loadedResource);
		
		assertEquals(resourceSet.getResources().size(), 2);
	}

	//Test load(Resource, URIConverter, URI)
	@Test
	public void loadResourceStringURIURIConverter() {
		Resource resource = resourceSet.getResource(emfURI2, true);
		Resource loadedResource = loader.load(resource, new ModelReuseURIConverter(), modelReuseURI.toString());
		assertNotNull(loadedResource);
		assertEquals(resourceSet.getResource(modelReuseURI, false), loadedResource);
		
		assertEquals(resourceSet.getResources().size(), 2);
	}

	//Test load(ResourceSet, URIConverter, URI)
	@Test
	public void loadResourceSetURIURIConverter() {
		Resource loadedResource = loader.load(resourceSet, new ModelReuseURIConverter(), modelReuseURI);
		assertNotNull(loadedResource);
		assertEquals(resourceSet.getResource(modelReuseURI, false), loadedResource);
		
		assertEquals(resourceSet.getResources().size(), 1);
	}

	//Test load(ResourceSet, URIConverter, URI)
	@Test
	public void loadResourceSetStringURIURIConverter() {
		Resource loadedResource = loader.load(resourceSet, new ModelReuseURIConverter(), modelReuseURI.toString());
		assertNotNull(loadedResource);
		assertEquals(resourceSet.getResource(modelReuseURI, false), loadedResource);
	}

	//Test load(EObject, URIConverter, resourcereuse)
	@Test
	public void loadEObjectResourcereuseURIConverter(){
		SearchCriteria c = new SearchCriteria();
		c.setId(ID_TEST_RESOURCE);
		c.setName(TEST_MODEL_NAME);
		List<org.polarsys.kitalpha.resourcereuse.model.Resource> resourcereuseList = ModelReuseHelper.findModelsAccordingToCriteria(c);
		
		Resource loadedResource = loader.load(resourceSet, new ModelReuseURIConverter(), resourcereuseList.get(0));
		assertNotNull(loadedResource);
		assertEquals(resourceSet.getResources().size(), 1);
		assertEquals(resourceSet.getResources().get(0).getURI().toString(), modelReuseURI.toString());
		assertEquals(resourceSet.getResource(modelReuseURI, false), loadedResource);
	}

	//Test load(Resource, URIConverter, resourcereuse)
	@Test
	public void loadResourceResourcereuseURIConverter(){
		SearchCriteria c = new SearchCriteria();
		c.setId(ID_TEST_RESOURCE);
		c.setName(TEST_MODEL_NAME);
		List<org.polarsys.kitalpha.resourcereuse.model.Resource> resourcereuseList = ModelReuseHelper.findModelsAccordingToCriteria(c);
		
		Resource resource = resourceSet.getResource(emfURI2, true);
		Resource loadedResource = loader.load(resource, new ModelReuseURIConverter(), resourcereuseList.get(0));
		assertNotNull(loadedResource);
		assertEquals(resourceSet.getResources().size(), 2); 
		assertTrue(resourceSet.getResources().contains(loadedResource));
	}

	//Test load(ResourceSet, URIConverter, resourcereuse)
	@Test
	public void loadResourceSetResourcereuseURIConverter(){
		SearchCriteria c = new SearchCriteria();
		c.setId(ID_TEST_RESOURCE);
		c.setName(TEST_MODEL_NAME);
		List<org.polarsys.kitalpha.resourcereuse.model.Resource> resourcereuseList = ModelReuseHelper.findModelsAccordingToCriteria(c);
		
		Resource loadedResource = loader.load(resourceSet, new ModelReuseURIConverter(), resourcereuseList.get(0));
		assertNotNull(loadedResource);
		assertEquals(resourceSet.getResources().size(), 1);
		assertEquals(resourceSet.getResources().get(0).getURI().toString(), modelReuseURI.toString());
		assertEquals(resourceSet.getResource(modelReuseURI, false), loadedResource);
	}

	//Test load(EObject, URIConverter, resourcereuse string attributes)
	@Test
	public void loadEObjectResourceReuseAttributesURIConverter(){
		Resource loadedResource = loader.load(resourceSet, new ModelReuseURIConverter(), ID_TEST_RESOURCE, TEST_MODEL_NAME, null, null, null);
		assertNotNull(loadedResource);
		assertEquals(resourceSet.getResources().size(), 1);
		assertEquals(resourceSet.getResource(modelReuseURI, false), loadedResource);
	}

	//Test load(Resource, URIConverter, resourcereuse string attributes)
	@Test
	public void loadResourceResourceReuseAttributesURIConverter(){
		Resource resource = resourceSet.getResource(emfURI2, true);
		Resource loadedResource = loader.load(resource, new ModelReuseURIConverter(), ID_TEST_RESOURCE, TEST_MODEL_NAME, null, null, null);
		assertNotNull(loadedResource);
		assertEquals(resourceSet.getResources().size(), 2); 
		assertTrue(resourceSet.getResources().contains(loadedResource));
	}

	//Test load(EObject, URIConverter, resourcereuse string attributes)
	@Test
	public void loadResourceSetResourceReuseAttributesURIConverter(){
		Resource loadedResource = loader.load(resourceSet, new ModelReuseURIConverter(), ID_TEST_RESOURCE, TEST_MODEL_NAME, null, null, null);
		assertNotNull(loadedResource);
		assertEquals(resourceSet.getResources().size(), 1);
		assertEquals(resourceSet.getResource(modelReuseURI, false), loadedResource);
	}

	//Test load(EObject, URIConverter, resourcereuse criteria)
	@Test
	public void loadEObjectResourceReuseCriteriaURIConverter(){
		SearchCriteria c = new SearchCriteria();
		c.setId(ID_TEST_RESOURCE);
		c.setName(TEST_MODEL_NAME);
		Resource loadedResource = loader.load(resourceSet, new ModelReuseURIConverter(), c);
		assertNotNull(loadedResource);
		assertEquals(resourceSet.getResources().size(), 1);
		assertEquals(resourceSet.getResource(modelReuseURI, false), loadedResource);
	}

	//Test load(Resource, URIConverter, resourcereuse criteria)
	@Test
	public void loadResourceResourceReuseCriteriaURIConverter(){
		SearchCriteria c = new SearchCriteria();
		c.setId(ID_TEST_RESOURCE);
		c.setName(TEST_MODEL_NAME);
		
		Resource resource = resourceSet.getResource(emfURI2, true);
		Resource loadedResource = loader.load(resource, new ModelReuseURIConverter(), c);
		assertNotNull(loadedResource);
		assertEquals(resourceSet.getResources().size(), 2); 
		assertTrue(resourceSet.getResources().contains(loadedResource));
	}

	//Test load(EObject, URIConverter, resourcereuse criteria)
	@Test
	public void loadResourceSetResourceReuseCriteriaURIConverter(){
		SearchCriteria c = new SearchCriteria();
		c.setId(ID_TEST_RESOURCE);
		c.setName(TEST_MODEL_NAME);
		Resource loadedResource = loader.load(resourceSet, new ModelReuseURIConverter(), c);
		assertNotNull(loadedResource);
		assertEquals(resourceSet.getResources().size(), 1);
		assertEquals(resourceSet.getResource(modelReuseURI, false), loadedResource);
	}


	@After
	public void tearDown(){
		Resource resource = resourceSet.getResource(emfURI, false);
		if (resource != null && resource.isLoaded()){
			resource.unload();
		}
		
		resource = resourceSet.getResource(modelReuseURI, false);
		if (resource != null && resource.isLoaded()){
			resource.unload();
		}
		
		resourceSet = null;
		resource = null;
		loader = null;
	}

}

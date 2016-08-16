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
package org.polarsys.kitalpha.resourcereuse.emfscheme.test.ju.api;

import java.util.List;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.URIConverter;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.polarsys.kitalpha.resourcereuse.emfscheme.ModelReuseURIConverter;
import org.polarsys.kitalpha.resourcereuse.emfscheme.api.IModelReuseLoader;
import org.polarsys.kitalpha.resourcereuse.emfscheme.api.ModelReuseLoaderFactory;
import org.polarsys.kitalpha.resourcereuse.emfscheme.helpers.ModelReuseHelper;
import org.polarsys.kitalpha.resourcereuse.model.SearchCriteria;

/**
 * Checks the behavior of emf scheme where resources does not exist
 * @author Faycal ABKA
 *
 */
public class ModelReuseLoaderTestsKO {
	
	private ResourceSet resourceSet;
	private IModelReuseLoader loader;
	
	private final static String ID_TEST_RESOURCE = "org.polarsys.kitalpha.resourcereuse.emfscheme.test.ju.test.doesnt.exist";
	private final static String TEST_MODEL_NAME  = "Model Test Doesn't Exist";
	
	private final URI modelReuseURI = URI.createURI("modelreuse:/Id=org.polarsys.kitalpha.resourcereuse.emfscheme.test.ju.test.doesnt.exist Name=Model Test Tags=[]");
	private final URI emfURI = URI.createURI("platform:/plugin/org.polarsys.kitalpha.resourcereuse.emfscheme.test.ju/models/Test.vpdesc");
	private final URI emfURI2 = URI.createURI("platform:/plugin/org.polarsys.kitalpha.resourcereuse.emfscheme.test.ju/models/Test2.vpdesc");
	
	private Resource resource;
	
	private final static SearchCriteria searchCriteria = new SearchCriteria();
	private final static List<org.polarsys.kitalpha.resourcereuse.model.Resource> resourcereuseList;
	
	private final static URIConverter modelReuseURIConverter = new ModelReuseURIConverter();
	
	static {
		searchCriteria.setId(ID_TEST_RESOURCE);
		searchCriteria.setName(TEST_MODEL_NAME);
		resourcereuseList = ModelReuseHelper.findModelsAccordingToCriteria(searchCriteria);
	}
	
	
	@Rule
	public ExpectedException expectedException = ExpectedException.none();
	
	@Before
	public void setup(){
		resourceSet = new ResourceSetImpl();
		loader = ModelReuseLoaderFactory.createModelReuseLoader();
		resource = resourceSet.getResource(emfURI2, true);
	}

	//Test load(EObject, URI)
	@Test(expected=RuntimeException.class)
	public void loadEObjectURI() throws Exception {
		expectedException.expect(RuntimeException.class);
		loader.load(resourceSet, modelReuseURI);
	}

	//Test load(EObject, URI)
	@Test(expected=RuntimeException.class)
	public void loadEObjectStringURI() throws Exception {
		expectedException.expect(RuntimeException.class);
		loader.load(resourceSet, modelReuseURI);
	}

	//Test load(Resource, URI)
	@Test(expected=RuntimeException.class)
	public void loadResourceURI() throws Exception {
		expectedException.expect(RuntimeException.class);
		loader.load(resource, modelReuseURI);
	}

	//Test load(Resource, URI)
	@Test(expected=RuntimeException.class)
	public void loadResourceStringURI() throws Exception {
		expectedException.expect(RuntimeException.class);
		loader.load(resource, modelReuseURI.toString());
	}
	
	//Test load(ResourceSet, URI)
	@Test(expected=RuntimeException.class)
	public void loadResourceSetURI() throws Exception {
		expectedException.expect(RuntimeException.class);
		loader.load(resourceSet, modelReuseURI);
	}

	//Test load(ResourceSet, URI)
	@Test(expected=RuntimeException.class)
	public void loadResourceSetStringURI() throws Exception {
		expectedException.expect(RuntimeException.class);
		Resource loadedResource = loader.load(resourceSet, modelReuseURI.toString());
	}
	
	//Test load(EObject, resourcereuse)
	@Test(expected=IndexOutOfBoundsException.class)
	public void loadEObjectResourcereuse(){
		SearchCriteria c = new SearchCriteria();
		c.setId(ID_TEST_RESOURCE);
		c.setName(TEST_MODEL_NAME);
		List<org.polarsys.kitalpha.resourcereuse.model.Resource> resourcereuseList = ModelReuseHelper.findModelsAccordingToCriteria(c);
		
		Resource loadedResource = loader.load(resourceSet, resourcereuseList.get(0));
		
	}
	
	//Test load(Resource, resourcereuse)
	@Test(expected=IndexOutOfBoundsException.class)
	public void loadResourceResourcereuse(){
		loader.load(resource, resourcereuseList.get(0));
	}
	
	//Test load(ResourceSet, resourcereuse)
	@Test(expected=IndexOutOfBoundsException.class)
	public void loadResourceSetResourcereuse(){
		SearchCriteria c = new SearchCriteria();
		c.setId(ID_TEST_RESOURCE);
		c.setName(TEST_MODEL_NAME);
		List<org.polarsys.kitalpha.resourcereuse.model.Resource> resourcereuseList = ModelReuseHelper.findModelsAccordingToCriteria(c);
		
		loader.load(resourceSet, resourcereuseList.get(0));
	}
	
	//Test load(EObject, resourcereuse string attributes
	@Test
	public void loadEObjectResourceReuseAttributes() throws Exception {
		expectedException.expect(RuntimeException.class);
		loader.load(resourceSet, ID_TEST_RESOURCE, TEST_MODEL_NAME, null, null, null);
	}
	
	//Test load(Resource, resourcereuse string attributes
	@Test
	public void loadResourceResourceReuseAttributes() throws Exception {
		expectedException.expect(RuntimeException.class);
		loader.load(resource, ID_TEST_RESOURCE, TEST_MODEL_NAME, null, null, null);
	}
	
	//Test load(ResourceSet, resourcereuse string attributes
	@Test
	public void loadResourceSetResourceReuseAttributes() throws Exception {
		expectedException.expect(RuntimeException.class);
		loader.load(resourceSet, ID_TEST_RESOURCE, TEST_MODEL_NAME, null, null, null);
	}

	//Test load(EObject, resourcereuse criteria
	@Test
	public void loadEObjectResourceReuseCriteria() throws Exception {
		expectedException.expect(RuntimeException.class);
		SearchCriteria c = new SearchCriteria();
		c.setId(ID_TEST_RESOURCE);
		c.setName(TEST_MODEL_NAME);
		loader.load(resourceSet, c);
	}

	//Test load(Resource, resourcereuse criteria
	@Test
	public void loadResourceResourceReuseCriteria() throws Exception {
		expectedException.expect(RuntimeException.class);
		SearchCriteria c = new SearchCriteria();
		c.setId(ID_TEST_RESOURCE);
		c.setName(TEST_MODEL_NAME);
		loader.load(resourceSet, c);
	}

	//Test load(EObject, resourcereuse criteria
	@Test
	public void loadResourceSetResourceReuseCriteria() throws Exception {
		expectedException.expect(RuntimeException.class);
		SearchCriteria c = new SearchCriteria();
		c.setId(ID_TEST_RESOURCE);
		c.setName(TEST_MODEL_NAME);
		loader.load(resourceSet, c);
	}
	
	
	
	
	
	//Test load(EObject, URIConverter, URI)
	@Test(expected=RuntimeException.class)
	public void loadEObjectURIWithURIConverter() throws Exception {
		expectedException.expect(RuntimeException.class);
		loader.load(resourceSet, modelReuseURIConverter, modelReuseURI);
	}

	//Test load(EObject, URIConverter, URI)
	@Test(expected=RuntimeException.class)
	public void loadEObjectStringURIURIConverter() {
		expectedException.expect(RuntimeException.class);
		//model reuse
		loader.load(resourceSet, modelReuseURIConverter, modelReuseURI.toString());
	}

	//Test load(Resource, URIConverter, URI)
	@Test(expected=RuntimeException.class)
	public void loadResourceURIURIConverter() throws Exception {
		expectedException.expect(RuntimeException.class);
		loader.load(resource, modelReuseURIConverter, modelReuseURI);
	}

	//Test load(Resource, URIConverter, URI)
	@Test(expected=RuntimeException.class)
	public void loadResourceStringURIURIConverter() throws Exception {
		expectedException.expect(RuntimeException.class);
		loader.load(resource, modelReuseURIConverter, modelReuseURI.toString());
	}

	//Test load(ResourceSet, URIConverter, URI)
	@Test(expected=RuntimeException.class)
	public void loadResourceSetURIURIConverter() throws Exception {
		expectedException.expect(RuntimeException.class);
		loader.load(resourceSet, modelReuseURIConverter, modelReuseURI);
	}

	//Test load(ResourceSet, URIConverter, URI)
	@Test(expected=RuntimeException.class)
	public void loadResourceSetStringURIURIConverter() throws Exception {
		expectedException.expect(RuntimeException.class);
		loader.load(resourceSet, modelReuseURIConverter, modelReuseURI.toString());
	}

	//Test load(EObject, URIConverter, resourcereuse)
	@Test(expected=IndexOutOfBoundsException.class)
	public void loadEObjectResourcereuseURIConverter(){
		SearchCriteria c = new SearchCriteria();
		c.setId(ID_TEST_RESOURCE);
		c.setName(TEST_MODEL_NAME);
		List<org.polarsys.kitalpha.resourcereuse.model.Resource> resourcereuseList = ModelReuseHelper.findModelsAccordingToCriteria(c);
		
		loader.load(resourceSet, modelReuseURIConverter, resourcereuseList.get(0));
	}

	//Test load(Resource, URIConverter, resourcereuse)
	@Test(expected=IndexOutOfBoundsException.class)
	public void loadResourceResourcereuseURIConverter(){
		loader.load(resource, modelReuseURIConverter, resourcereuseList.get(0));
	}

	//Test load(ResourceSet, URIConverter, resourcereuse)
	@Test(expected=IndexOutOfBoundsException.class)
	public void loadResourceSetResourcereuseURIConverter(){
		loader.load(resourceSet, modelReuseURIConverter, resourcereuseList.get(0));
	}

	//Test load(EObject, URIConverter, resourcereuse string attributes)
	@Test
	public void loadEObjectResourceReuseAttributesURIConverter() throws Exception {
		expectedException.expect(RuntimeException.class);
		loader.load(resourceSet, modelReuseURIConverter, ID_TEST_RESOURCE, TEST_MODEL_NAME, null, null, null);
	}

	//Test load(Resource, URIConverter, resourcereuse string attributes)
	@Test
	public void loadResourceResourceReuseAttributesURIConverter() throws Exception {
		expectedException.expect(RuntimeException.class);
		loader.load(resource, modelReuseURIConverter, ID_TEST_RESOURCE, TEST_MODEL_NAME, null, null, null);
	}

	//Test load(EObject, URIConverter, resourcereuse string attributes)
	@Test
	public void loadResourceSetResourceReuseAttributesURIConverter() throws Exception {
		expectedException.expect(RuntimeException.class);
		loader.load(resourceSet, modelReuseURIConverter, ID_TEST_RESOURCE, TEST_MODEL_NAME, null, null, null);
	}

	//Test load(EObject, URIConverter, resourcereuse criteria)
	@Test
	public void loadEObjectResourceReuseCriteriaURIConverter() throws Exception{
		expectedException.expect(RuntimeException.class);
		SearchCriteria c = new SearchCriteria();
		c.setId(ID_TEST_RESOURCE);
		c.setName(TEST_MODEL_NAME);
		loader.load(resourceSet, modelReuseURIConverter, c);
	}

	//Test load(Resource, URIConverter, resourcereuse criteria)
	@Test
	public void loadResourceResourceReuseCriteriaURIConverter() throws Exception{
		expectedException.expect(RuntimeException.class);
		loader.load(resource, modelReuseURIConverter, searchCriteria);
	}

	//Test load(EObject, URIConverter, resourcereuse criteria)
	@Test
	public void loadResourceSetResourceReuseCriteriaURIConverter() throws Exception{
		expectedException.expect(RuntimeException.class);
		SearchCriteria c = new SearchCriteria();
		c.setId(ID_TEST_RESOURCE);
		c.setName(TEST_MODEL_NAME);
		loader.load(resourceSet, modelReuseURIConverter, c);
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

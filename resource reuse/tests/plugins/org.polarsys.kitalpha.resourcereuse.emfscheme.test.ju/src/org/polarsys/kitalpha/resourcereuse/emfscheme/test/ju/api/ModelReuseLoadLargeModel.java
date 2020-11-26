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

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.junit.Before;
import org.junit.Test;
import org.polarsys.kitalpha.resourcereuse.emfscheme.api.IModelReuseLoader;
import org.polarsys.kitalpha.resourcereuse.emfscheme.api.ModelReuseLoaderFactory;

/**
 * @author Faycal ABKA
 */
public class ModelReuseLoadLargeModel {
	
	private ResourceSet resourceSet;
	private IModelReuseLoader loader;
	
	private final URI modelReuseURI = URI.createURI("modelreuse:/Id=org.polarsys.kitalpha.resourcereuse.emfscheme.test.ju.large.resource Name=Large Ecore Resource Tags=[]");
	private final URI modelReuseCorruptedURI = URI.createURI("modelreuse:/Id=org.polarsys.kitalpha.resourcereuse.emfscheme.test.ju.large.resource.corrupted Name=Large Corrupted Ecore Resource Tags=[]");
	
	
	@Before
	public void setup(){
		resourceSet = new ResourceSetImpl();
		loader = ModelReuseLoaderFactory.createModelReuseLoader();
	}

	@Test
	public void loadInLessThan40Second() {
		long start = System.currentTimeMillis();
		Resource resource = loader.load(resourceSet, modelReuseURI);
		long end = System.currentTimeMillis();
		assertTrue("Loading large model take more than 40 seconds", end - start <= 40000);
		assertNotNull(resource);
		assertEquals(resourceSet.getResource(modelReuseURI, false), resource);
	}
	
	
	@Test
	public void loadAndCheckHardwareSoftwareCompent() {
		long start = System.currentTimeMillis();
		Resource resource = loader.load(resourceSet, modelReuseURI);
		long end = System.currentTimeMillis();
		assertTrue("Loading large model take more than 40 seconds", end - start <= 40000);
		assertNotNull(resource);
		assertEquals(resourceSet.getResource(modelReuseURI, false), resource);
		
		EList<EObject> contents = resource.getContents();
		for (EObject eObject : contents) {
			EList<EObject> eContents = eObject.eContents();
			for (EObject eObject2 : eContents) {
				String name = ((ENamedElement)eObject2).getName();
				assertTrue("Element not found", name.contains("Component") 
						|| name.contains("Package")
						|| name.contains("Software")
						|| name.contains("Hardware"));
			}
		}
	}
}

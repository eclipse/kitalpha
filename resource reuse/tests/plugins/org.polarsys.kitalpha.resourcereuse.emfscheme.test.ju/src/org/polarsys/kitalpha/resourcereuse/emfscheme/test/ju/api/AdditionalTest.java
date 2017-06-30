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
package org.polarsys.kitalpha.resourcereuse.emfscheme.test.ju.api;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * @author Thomas Guiu
 *
 */
public class AdditionalTest {

	private ResourceSet resourceSet;
	
	
	@Before
	public void setup(){
		resourceSet = new ResourceSetImpl();
	}
	
	@After
	public void finish(){
		for (Resource r : resourceSet.getResources())
			r.unload();
		resourceSet.getResources().clear();
	}

	@Test
	public void testLoadCriteria1 () {
		URI uri = URI.createURI("modelreuse:/name=MyTestResource 1");
		Resource resource = resourceSet.getResource(uri, true);
		EObject eObject = resource.getContents().get(0);
		org.junit.Assert.assertNotNull(eObject);
	}

	@Test
	public void testLoadCriteria2 () {
		URI uri = URI.createURI("modelreuse:/name=MyTestResource%202");
		Resource resource = resourceSet.getResource(uri, true);
		EObject eObject = resource.getContents().get(0);
		org.junit.Assert.assertNotNull(eObject);
	}

	@Test (expected = RuntimeException.class)
	public void testLoadCriteria3 () {
		URI uri = URI.createURI("modelreuse:/name=MyTestResource");
		Resource resource = resourceSet.getResource(uri, true);
	}

	@Test
	public void testLoadCriteria4 () {
		URI uri = URI.createURI("modelreuse:/id=Test1.resource1");
		Resource resource = resourceSet.getResource(uri, true);
		EObject eObject = resource.getContents().get(0);
		org.junit.Assert.assertNotNull(eObject);
	}

	@Test
	public void testLoadCriteria5 () {
		URI uri = URI.createURI("modelreuse:/tags=tata");
		Resource resource = resourceSet.getResource(uri, true);
		EObject eObject = resource.getContents().get(0);
		org.junit.Assert.assertNotNull(eObject);
	}

	@Test
	public void testLoadCriteria6 () {
		// will match 2 resource, the first one will be used
		URI uri = URI.createURI("modelreuse:/tags=pipo");
		Resource resource = resourceSet.getResource(uri, true);
		EObject eObject = resource.getContents().get(0);
		org.junit.Assert.assertNotNull(eObject);
	}

	@Test
	public void testLoadURI1 () {
		URI uri = URI.createURI("modelreuse:/id=my_model#//Cls1");
		EObject eObject = resourceSet.getEObject(uri, true);
		org.junit.Assert.assertTrue(eObject instanceof EClass);
	}

	@Test
	public void testLoadURI2 () {
		URI uri = URI.createURI("modelreuse:/id=my_model#//Cls1/attr1");
		EObject eObject = resourceSet.getEObject(uri, true);
		org.junit.Assert.assertTrue(eObject instanceof EAttribute);
	}

	@Test
	public void testLoadModel1 () {
		URI uri = URI.createURI("platform:/plugin/org.polarsys.kitalpha.resourcereuse.emfscheme.test.ju/models/test_load1.componentsample");
		Resource resource = resourceSet.getResource(uri, true);
		EcoreUtil.resolveAll(resource);
	}

	@Test
	public void testLoadModel2 () {
		URI uri = URI.createURI("platform:/plugin/org.polarsys.kitalpha.resourcereuse.emfscheme.test.ju/models/test_load2.componentsample");
		Resource resource = resourceSet.getResource(uri, true);
		EcoreUtil.resolveAll(resource);
	}

	@Test
	public void testLoadModel3 () {
		URI uri = URI.createURI("platform:/plugin/org.polarsys.kitalpha.resourcereuse.emfscheme.test.ju/models/test_load3.componentsample");
		Resource resource = resourceSet.getResource(uri, true);
		EcoreUtil.resolveAll(resource);
	}

	@Test
	public void testLoadModel4 () {
		// the resource exists but the target element can not be found -> eProxy and no error
		URI uri = URI.createURI("platform:/plugin/org.polarsys.kitalpha.resourcereuse.emfscheme.test.ju/models/test_load4.componentsample");
		Resource resource = resourceSet.getResource(uri, true);
		EcoreUtil.resolveAll(resource);
	}

}

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
package org.polarsys.kitalpha.ad.viewpoint.tests;


import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.polarsys.kitalpha.ad.services.manager.ViewpointActivationException;
import org.polarsys.kitalpha.ad.services.manager.ViewpointManager;

import junit.framework.TestCase;


/**
 * @author Thomas Guiu
 * 
 */
public class BasicTests extends TestCase {


	public void testManager1() throws Exception {
		ResourceSet set1 = new ResourceSetImpl();  
		ViewpointManager m1 = ViewpointManager.getInstance(set1);
		assertNotNull(m1);
	}
	
	public void testManager2() throws Exception {
		ResourceSet set1 = new ResourceSetImpl();  
		ResourceSet set2 = new ResourceSetImpl();  
		ViewpointManager m1 = ViewpointManager.getInstance(set1);
		ViewpointManager m2 = ViewpointManager.getInstance(set2);
		assertNotSame(m1, m2);
	}
	public void testManager3() throws Exception {
		ResourceSet set1 = new ResourceSetImpl();  
		ViewpointManager m1 = ViewpointManager.getInstance(set1);
		ViewpointManager m2 = ViewpointManager.getInstance(set1);
		assertEquals(m1, m2);
	}

	public void testManager4() throws Exception {
		ResourceSet set1 = new ResourceSetImpl();  
		ViewpointManager m1 = ViewpointManager.getInstance(set1);
		try {
			m1.reference("");
			fail("expecting an exception");
		} catch (ViewpointActivationException e) {
		}
	}

	public void testManager4_1() throws Exception {
		ResourceSet set1 = new ResourceSetImpl();  
		ViewpointManager m1 = ViewpointManager.getInstance(set1);
		try {
			m1.desactivate("");
			fail("expecting an exception");
		} catch (ViewpointActivationException e) {
		}
	}

	public void testManager5() throws Exception {
		try {
			ViewpointManager m1 = ViewpointManager.getInstance(EcoreFactory.eINSTANCE.createEObject());
			fail("expecting an exception");
		} catch (IllegalArgumentException e) {
		}
	}
	
	public void testManager6() throws Exception {
		try {
			ViewpointManager m1 = ViewpointManager.getInstance((EObject)null);
			fail("expecting an exception");
		} catch (IllegalArgumentException e) {
		}
	}
	
	public void testManager7() throws Exception {
		try {
			ViewpointManager m1 = ViewpointManager.getInstance((ResourceSet)null);
			fail("expecting an exception");
		} catch (IllegalArgumentException e) {
		}
	}

}

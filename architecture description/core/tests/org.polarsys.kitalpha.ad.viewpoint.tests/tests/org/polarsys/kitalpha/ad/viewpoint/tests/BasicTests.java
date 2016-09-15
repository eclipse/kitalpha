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
package org.polarsys.kitalpha.ad.viewpoint.tests;


import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.osgi.framework.Version;
import org.polarsys.kitalpha.ad.services.manager.AlreadyInStateException;
import org.polarsys.kitalpha.ad.services.manager.ViewpointActivationException;
import org.polarsys.kitalpha.ad.services.manager.ViewpointManager;
import org.polarsys.kitalpha.ad.services.manager.ViewpointManager.Listener;
import org.polarsys.kitalpha.ad.services.manager.ViewpointManager.OverallListener;
import org.polarsys.kitalpha.resourcereuse.helper.ResourceReuse;
import org.polarsys.kitalpha.resourcereuse.model.Resource;

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

}

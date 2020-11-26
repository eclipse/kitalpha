/*******************************************************************************
 * Copyright (c) 2016 Thales Global Services S.A.S.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 * 
 * SPDX-License-Identifier: EPL-2.0
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
public class BasicTests3 extends TestCase {


//	public void testManager1() throws Exception {
//		assertEquals(6, ViewpointManager.getAvailableViewpointDescriptions().length);
//	}
	
	public void testManager2() throws Exception {
		assertTrue(ViewpointManager.canChangeState("org.polarsys.kitalpha.vp.componentsample"));
		assertFalse(ViewpointManager.canChangeState("does not exist"));
	}
	
	public void testManager3() throws Exception {
		assertFalse(ViewpointManager.canChangeActivation("org.polarsys.kitalpha.vp.componentsample"));
		assertTrue(ViewpointManager.canChangeActivation("org.polarsys.kitalpha.vp.componentsampleperformance"));
	}

}

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
package org.polarsys.kitalpha.ad.viewpoint.tests;


import org.eclipse.core.runtime.IStatus;
import org.polarsys.kitalpha.ad.services.manager.ViewpointManager;


/**
 * @author Thomas Guiu
 * 
 */
public class ModelTests1 extends ModelTests {


	public ModelTests1() {
		super("/org.polarsys.kitalpha.ad.viewpoint.tests/resource/My1_a.componentsample");
	}


	public void testManager2() throws Exception {
		assertFalse(m.isReferenced("org.polarsys.kitalpha.vp.componentsampleperformance"));
		assertTrue(m.isReferenced("org.polarsys.kitalpha.vp.componentsamplesafety"));  // referenced into linked afm
	}

	public void testManager1() throws Exception {
		assertTrue(m.hasMetadata());
	}

	public void testManager3() throws Exception {
		IStatus result = ViewpointManager.checkViewpointsCompliancy(set);
		assertTrue(result.isOK());
	}
	
	public void testManager4() throws Exception {
		assertFalse(m.isReferenced("org.polarsys.kitalpha.vp.componentsampleperformance"));
		m.reference("org.polarsys.kitalpha.vp.componentsampleperformance");
		assertTrue(m.isReferenced("org.polarsys.kitalpha.vp.componentsampleperformance"));
		m.unReference("org.polarsys.kitalpha.vp.componentsampleperformance");
		assertFalse(m.isReferenced("org.polarsys.kitalpha.vp.componentsampleperformance"));
		assertFalse(m.isInactive("org.polarsys.kitalpha.vp.componentsampleperformance"));
	}
}

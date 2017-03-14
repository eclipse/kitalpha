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
public class ModelTests4 extends ModelTests {


	public ModelTests4() {
		super("/org.polarsys.kitalpha.ad.viewpoint.tests/resource/My4.componentsample");
	}


	public void testManager4() throws Exception {
		assertTrue(m.isReferenced("org.polarsys.kitalpha.vp.componentsampleperformance"));
	}


	public void testManager6() throws Exception {
		// major difference in versions
		IStatus result = ViewpointManager.checkViewpointsCompliancy(set);
		assertFalse(result.isOK());
		assertEquals(1, result.getChildren().length);
		assertEquals("Expecting version '0.0.0' for viewpoint 'org.polarsys.kitalpha.vp.componentsampleperformance' (current version: '1.1.0.qualifier')", result.getChildren()[0].getMessage());
	}

}

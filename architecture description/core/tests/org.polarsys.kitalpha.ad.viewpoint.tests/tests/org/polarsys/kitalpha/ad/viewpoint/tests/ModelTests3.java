/*******************************************************************************
 * Copyright (c) 2017, 2020 Thales Global Services S.A.S.
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


import org.eclipse.core.runtime.IStatus;
import org.polarsys.kitalpha.ad.services.manager.ViewpointManager;


/**
 * @author Thomas Guiu
 * 
 */
public class ModelTests3 extends ModelTests {


	public ModelTests3() {
		super("/org.polarsys.kitalpha.ad.viewpoint.tests/resource/My3_a.componentsample");
	}


	public void testManager6() throws Exception {
		// major difference in versions
		IStatus result = ViewpointManager.checkViewpointsCompliancy(set);
		assertFalse(result.isOK());
		assertEquals(1, result.getChildren().length);
		assertEquals("The viewpoint 'org.polarsys.kitalpha.vp.componentsampleperformance' is needed in incompatible versions :1.3.0.qualifier / 1.1.1.qualifier", result.getChildren()[0].getMessage());
	}

}

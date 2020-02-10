/*******************************************************************************
 * Copyright (c) 2017, 2019 Thales Global Services S.A.S.
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
public class ModelTests3 extends ModelTests {


	public ModelTests3() {
		super("/org.polarsys.kitalpha.ad.viewpoint.tests/resource/My3_a.componentsample");
	}


	public void testManager6() throws Exception {
		// major difference in versions
		IStatus result = ViewpointManager.checkViewpointsCompliancy(set);
		assertFalse(result.isOK());
		assertEquals(1, result.getChildren().length);
		assertEquals("The viewpoint 'org.polarsys.kitalpha.vp.componentsampleperformance' is needed in incompatible versions :1.3.2.qualifier / 1.1.1.qualifier", result.getChildren()[0].getMessage());
	}

}

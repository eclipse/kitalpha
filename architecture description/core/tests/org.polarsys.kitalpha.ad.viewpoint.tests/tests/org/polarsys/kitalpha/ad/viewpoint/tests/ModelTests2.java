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
public class ModelTests2 extends ModelTests {


	public ModelTests2() {
		super("/org.polarsys.kitalpha.ad.viewpoint.tests/resource/My2_a.componentsample");
	}

	public void testManager5() throws Exception {
		// minor difference in versions
		IStatus result = ViewpointManager.checkViewpointsCompliancy(set);
		assertTrue(result.isOK());
	}

}

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
package org.polarsys.kitalpha.ad.metadata.tests;

/**
 * @author Thomas Guiu
 * 
 */
public class ModelTests2 extends ModelTests {

	public ModelTests2() {
		super("/org.polarsys.kitalpha.ad.metadata.tests/resource/My2_a.componentsample");
	}

	public void testManager1() throws Exception {
		assertTrue(helper.isInactive("org.polarsys.kitalpha.vp.componentsampleperformance"));
		// vp is inactive in linked metadata but active in top level metadata
		assertFalse(helper.isInactive("org.polarsys.kitalpha.vp.componentsamplesafety"));
	}
	

}

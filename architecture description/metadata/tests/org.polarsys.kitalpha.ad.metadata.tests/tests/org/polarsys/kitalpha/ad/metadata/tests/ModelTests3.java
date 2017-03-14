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
package org.polarsys.kitalpha.ad.metadata.tests;

import java.util.List;

import org.polarsys.kitalpha.ad.metadata.metadata.ViewpointReference;

/**
 * @author Thomas Guiu
 * 
 */
public class ModelTests3 extends ModelTests {

	public ModelTests3() {
		super("/org.polarsys.kitalpha.ad.metadata.tests/resource/top.afm");
	}

	public void testManager1() throws Exception {
		List<ViewpointReference> allViewpointReferences = helper.getAllViewpointReferences();
		assertEquals(12, allViewpointReferences.size());
		assertEquals("vp:top" , allViewpointReferences.get(0).getVpId());
		assertEquals("vp:1" , allViewpointReferences.get(1).getVpId());
		assertEquals("vp:2" , allViewpointReferences.get(2).getVpId());
		assertEquals("vp:3" , allViewpointReferences.get(3).getVpId());
		assertEquals("vp:1_1" , allViewpointReferences.get(4).getVpId());
		assertEquals("vp:1_2" , allViewpointReferences.get(5).getVpId());
		assertEquals("vp:1_3" , allViewpointReferences.get(6).getVpId());
		assertEquals("vp:2_1" , allViewpointReferences.get(7).getVpId());
		assertEquals("vp:3_1" , allViewpointReferences.get(8).getVpId());
		assertEquals("vp:3_2" , allViewpointReferences.get(9).getVpId());
		assertEquals("vp:2_1_1" , allViewpointReferences.get(10).getVpId());
		assertEquals("vp:2_1_2" , allViewpointReferences.get(11).getVpId());
	}
	

}

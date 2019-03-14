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
package org.polarsys.kitalpha.ad.metadata.tests;

import java.util.List;

import org.polarsys.kitalpha.ad.metadata.metadata.ViewpointReference;

/**
 * @author Thomas Guiu
 * 
 */
public class ModelTests4 extends ModelTests {

	public ModelTests4() {
		super("/org.polarsys.kitalpha.ad.metadata.tests/resource/A.afm");
	}

	public void testManager1() throws Exception {
		List<ViewpointReference> allViewpointReferences = helper.getAllViewpointReferences();
		// no more exception, cycles in metadata are supported
		
	}
	

}

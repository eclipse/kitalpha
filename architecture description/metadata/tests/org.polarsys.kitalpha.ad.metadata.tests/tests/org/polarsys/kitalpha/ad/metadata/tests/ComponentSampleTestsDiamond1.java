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
package org.polarsys.kitalpha.ad.metadata.tests;


import org.eclipse.emf.ecore.util.EcoreUtil;


/**
 * @author Thomas Guiu
 * 
 */
public class ComponentSampleTestsDiamond1 extends ModelTests {


	public ComponentSampleTestsDiamond1() {
		super("/org.polarsys.kitalpha.ad.metadata.tests/resource/diamond1.componentsample");
	}

	public void testUC1() throws Exception {
		assertFalse(helper.isReferenced("org.polarsys.kitalpha.vp.componentsampleperformance"));
		assertFalse(helper.isReferenced("org.polarsys.kitalpha.vp.componentsample"));
		assertFalse(helper.isReferenced("org.polarsys.kitalpha.vp.componentsamplesafety"));
		
	}
	
	public void testUC2() throws Exception {
		// expecting the target model and its afm companion
		assertEquals(2, set.getResources().size());
		EcoreUtil.resolveAll(set);
		// referenced models are loaded too
		assertEquals(2, set.getResources().size());
		assertEquals(0, helper.getViewpointReferences().size());
	}


}

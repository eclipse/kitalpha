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
package org.polarsys.kitalpha.ad.metadata.tests;


import org.eclipse.emf.ecore.util.EcoreUtil;
import org.osgi.framework.Version;
import org.polarsys.kitalpha.ad.metadata.helpers.MetadataHelper;
import org.polarsys.kitalpha.ad.services.manager.ViewpointManager;


/**
 * @author Thomas Guiu
 * 
 */
public class ComponentSampleTestsCycle1 extends ModelTests {


	public ComponentSampleTestsCycle1() {
		super("/org.polarsys.kitalpha.ad.metadata.tests/resource/cycle1.componentsample");
	}

	public void testUC1() throws Exception {
		assertFalse(helper.isReferenced("org.polarsys.kitalpha.vp.componentsampleperformance"));
		assertFalse(helper.isInactive("org.polarsys.kitalpha.vp.componentsampleperformance"));
		assertTrue(helper.isReferenced("org.polarsys.kitalpha.vp.componentsample"));
		assertTrue(helper.isReferenced("org.polarsys.kitalpha.vp.componentsamplesafety"));
		
	}
	
	public void testUC2() throws Exception {
		// expecting the target model and its afm companion
		assertEquals(2, set.getResources().size());
		EcoreUtil.resolveAll(set);
		// referenced models are loaded too
		assertEquals(4, set.getResources().size());
	}

	public void testUC3() throws Exception {
		EcoreUtil.resolveAll(set);
		assertEquals("cycle1.componentsample", set.getResources().get(0).getURI().lastSegment());
		assertEquals("cycle1.afm", set.getResources().get(1).getURI().lastSegment());
		assertEquals("cycle2.componentsample", set.getResources().get(2).getURI().lastSegment());
		assertEquals("cycle2.afm", set.getResources().get(3).getURI().lastSegment());
		
	}

	public void testUC4() throws Exception {
		org.polarsys.kitalpha.resourcereuse.model.Resource vp = ViewpointManager.getViewpoint("org.polarsys.kitalpha.vp.componentsample");
		
		try {
			Version fileVersion = MetadataHelper.getViewpointMetadata(set).getVersion(vp);
			assertNotNull(fileVersion);
		} catch (Exception e) {
			// the getVersion() call triggers a check of the metadata models 
			fail("An exception occured:" + e.getMessage());
		}
		
	}

}

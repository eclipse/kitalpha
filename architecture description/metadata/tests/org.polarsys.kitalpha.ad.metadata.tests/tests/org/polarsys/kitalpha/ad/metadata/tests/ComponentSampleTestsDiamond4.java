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


import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.osgi.framework.Version;
import org.polarsys.kitalpha.ad.metadata.commands.SetViewpointFilterCommand;
import org.polarsys.kitalpha.ad.metadata.commands.SetViewpointUsageCommand;
import org.polarsys.kitalpha.ad.metadata.commands.UpdateViewpointVersionCommand;
import org.polarsys.kitalpha.ad.metadata.helpers.MetadataHelper;
import org.polarsys.kitalpha.ad.metadata.helpers.ViewpointMetadata;
import org.polarsys.kitalpha.ad.services.manager.ViewpointManager;
import org.polarsys.kitalpha.resourcereuse.helper.ResourceHelper;
import org.polarsys.kitalpha.resourcereuse.helper.ResourceReuse;

import junit.framework.TestCase;


/**
 * @author Thomas Guiu
 * 
 */
public class ComponentSampleTestsDiamond4 extends ModelTests {


	public ComponentSampleTestsDiamond4() {
		super("/org.polarsys.kitalpha.ad.metadata.tests/resource/diamond4.componentsample");
	}

	public void testUC1() throws Exception {
		assertTrue(helper.isReferenced("org.polarsys.kitalpha.vp.componentsampleframework"));
		assertTrue(helper.isReferenced("org.polarsys.kitalpha.vp.componentsample"));
		assertTrue(helper.isReferenced("org.polarsys.kitalpha.vp.componentsamplequalityassessment"));
		assertTrue(helper.isReferenced("org.polarsys.kitalpha.vp.componentsamplesafety"));
		assertFalse(helper.isReferenced("org.polarsys.kitalpha.vp.componentsampleperformance"));
		
	}
	
	public void testUC2() throws Exception {
		// expecting the target model and its afm companion
		assertEquals(2, set.getResources().size());
		EcoreUtil.resolveAll(set);
		// referenced models are loaded too
		assertEquals(8, set.getResources().size());
	}

	public void testUC3() throws Exception {
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

/*******************************************************************************
 * Copyright (c) 2016, 2020 Thales Global Services S.A.S.
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
import org.polarsys.kitalpha.resourcereuse.helper.ResourceHelper;
import org.polarsys.kitalpha.resourcereuse.helper.ResourceReuse;

import junit.framework.TestCase;


/**
 * @author Thomas Guiu
 * 
 */
public class ComponentSampleTestsCycle2 extends ModelTests {


	public ComponentSampleTestsCycle2() {
		super("/org.polarsys.kitalpha.ad.metadata.tests/resource/cycle2.componentsample");
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
		assertEquals("cycle2.componentsample", set.getResources().get(0).getURI().lastSegment());
		assertEquals("cycle2.afm", set.getResources().get(1).getURI().lastSegment());
		assertEquals("cycle1.componentsample", set.getResources().get(2).getURI().lastSegment());
		assertEquals("cycle1.afm", set.getResources().get(3).getURI().lastSegment());
		
	}


}

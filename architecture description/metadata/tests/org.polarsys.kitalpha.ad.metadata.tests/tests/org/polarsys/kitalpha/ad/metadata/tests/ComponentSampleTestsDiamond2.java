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
public class ComponentSampleTestsDiamond2 extends ModelTests {


	public ComponentSampleTestsDiamond2() {
		super("/org.polarsys.kitalpha.ad.metadata.tests/resource/diamond2.componentsample");
	}

	public void testUC1() throws Exception {
		assertTrue(helper.isReferenced("org.polarsys.kitalpha.vp.componentsampleframework"));
		assertTrue(helper.isReferenced("org.polarsys.kitalpha.vp.componentsample"));
		assertTrue(helper.isReferenced("org.polarsys.kitalpha.vp.componentsamplequalityassessment"));
		assertFalse(helper.isReferenced("org.polarsys.kitalpha.vp.componentsamplesafety"));
		assertFalse(helper.isReferenced("org.polarsys.kitalpha.vp.componentsampleperformance"));
		
	}
	
	public void testUC2() throws Exception {
		// expecting the target model and its afm companion
		assertEquals(2, set.getResources().size());
		EcoreUtil.resolveAll(set);
		// referenced models are loaded too
		assertEquals(4, set.getResources().size());
		assertEquals(3, helper.getViewpointReferences().size());
	}


}

/*******************************************************************************
 * Copyright (c) 2021 Thales Global Services S.A.S.
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


import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.osgi.framework.Version;
import org.polarsys.kitalpha.ad.metadata.helpers.MetadataHelper;
import org.polarsys.kitalpha.ad.metadata.helpers.ViewpointMetadata;

import junit.framework.TestCase;


/**
 * @author Arnaud Dieumegard
 * 
 */
public class UpdateReferencedViewpointsTests extends TestCase {

	private static final String VERSION_1_1_0_QUALIFIER = "1.1.0.qualifier";
	private static final String VERSION_1_3_0_QUALIFIER = "1.3.0.qualifier";
	private static final String CS_VP_ID = "org.polarsys.kitalpha.vp.componentsample";
	private static final String CSP_VP_ID = "org.polarsys.kitalpha.vp.componentsampleperformance";
	private static final String CSS_VP_ID = "org.polarsys.kitalpha.vp.componentsamplesafety";
	private static final String CSF_VP_ID = "org.polarsys.kitalpha.vp.componentsampleframework";
	
	public void testHelperUpdateVPVersion() {
		ResourceSet set = new ResourceSetImpl();  
		// Init
		Resource initMetadataStorage = set.getResource(URI.createPlatformPluginURI("/org.polarsys.kitalpha.ad.metadata.tests/resource/My2_b."+ViewpointMetadata.STORAGE_EXTENSION, true), true);

		// Update metadata info
		ViewpointMetadata meta = MetadataHelper.getViewpointMetadata(set);
		
		// Test initial state
		Version versionCS = meta.getViewpointReferences().get(CS_VP_ID);
		Version versionCSF = meta.getViewpointReferences().get(CSF_VP_ID);
		Version versionCSS = meta.getViewpointReferences().get(CSS_VP_ID);
		Version versionCSP = meta.getViewpointReferences().get(CSP_VP_ID);
		
		assertTrue(versionCS.toString().equals(VERSION_1_1_0_QUALIFIER));
		assertTrue(versionCSF.toString().equals(VERSION_1_1_0_QUALIFIER));
		assertTrue(versionCSS.toString().equals(VERSION_1_1_0_QUALIFIER));
		assertTrue(versionCSP.toString().equals(VERSION_1_1_0_QUALIFIER));
		
		// Perform update
		MetadataHelper.initMetadata(initMetadataStorage);
		
		// Test expected state
		meta = MetadataHelper.getViewpointMetadata(set);
		versionCS = meta.getViewpointReferences().get(CS_VP_ID);
		versionCSF = meta.getViewpointReferences().get(CSF_VP_ID);
		versionCSS = meta.getViewpointReferences().get(CSS_VP_ID);
		versionCSP = meta.getViewpointReferences().get(CSP_VP_ID);
		
		assertTrue(versionCS.toString().equals(VERSION_1_3_0_QUALIFIER));
		assertTrue(versionCSF.toString().equals(VERSION_1_3_0_QUALIFIER));
		assertTrue(versionCSS.toString().equals(VERSION_1_3_0_QUALIFIER));
		assertTrue(versionCSP.toString().equals(VERSION_1_3_0_QUALIFIER));
	}
}

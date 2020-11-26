/*******************************************************************************
 * Copyright (c) 2017 Thales Global Services.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 * 
 * SPDX-License-Identifier: EPL-2.0
 *  
 * Contributors:
 *   Thales - initial API and implementation
 *******************************************************************************/
package org.polarsys.kitalpha.ad.integration.emde.tests.junit;

import static org.junit.Assert.*;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.junit.Test;
import org.polarsys.kitalpha.ad.services.manager.ViewpointManager;
import org.polarsys.kitalpha.emde.extension.ModelExtensionHelper;
import org.polarsys.kitalpha.emde.extension.ModelExtensionManager;

public class Usecase1 {
	
	@Test
	public void test1() {
		ResourceSet set1 = new ResourceSetImpl();
		ModelExtensionManager m1 = ModelExtensionHelper.getInstance(set1);
		URI uri = URI.createPlatformPluginURI("/org.polarsys.kitalpha.ad.integration.emde.tests.junit/resources/usecase1/AAA/My.a", true);
		Resource resource = set1.getResource(uri, true);
		ViewpointManager m2 = ViewpointManager.getInstance(set1);
		assertFalse(m2.isReferenced("org.polarsys.kitalpha.viewpoint.a"));
		assertTrue(m2.isReferenced("org.polarsys.kitalpha.viewpoint.b"));
		assertTrue(resource.getContents().size() == 1);
		
		EObject root = resource.getContents().get(0);
		EList<EObject> contents = root.eContents();
		assertTrue(contents.size() == 2);
		assertFalse(m1.isExtensionModelDisabled("aaa", "bbb"));
	}

}

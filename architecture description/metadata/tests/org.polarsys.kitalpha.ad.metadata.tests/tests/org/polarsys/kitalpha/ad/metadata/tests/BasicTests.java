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


import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.polarsys.kitalpha.ad.metadata.helpers.MetadataHelper;
import org.polarsys.kitalpha.ad.metadata.helpers.ViewpointMetadata;

import junit.framework.TestCase;


/**
 * @author Thomas Guiu
 * 
 */
public class BasicTests extends TestCase {


	public void testHelper1() throws Exception {
		ResourceSet set1 = new ResourceSetImpl();  
		ViewpointMetadata m1 = MetadataHelper.getViewpointMetadata(set1);
		assertNotNull(m1);
	}
	
	public void testHelper2() throws Exception {
		ResourceSet set1 = new ResourceSetImpl();  
		ResourceSet set2 = new ResourceSetImpl();  
		ViewpointMetadata m1 = MetadataHelper.getViewpointMetadata(set1);
		ViewpointMetadata m2 = MetadataHelper.getViewpointMetadata(set2);
		assertNotSame(m1, m2);
	}
	public void testHelper3() throws Exception {
		ResourceSet set1 = new ResourceSetImpl();  
		ViewpointMetadata m1 = MetadataHelper.getViewpointMetadata(set1);
		ViewpointMetadata m2 = MetadataHelper.getViewpointMetadata(set1);
		assertEquals(m1, m2);
	}
}

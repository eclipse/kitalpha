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

/**
 * @author Thomas
 *
 */
public class TestContribution extends org.polarsys.kitalpha.ad.metadata.helpers.Contribution {

	public static boolean preUpdateCalled, updateCalled, postUpdateCalled; 
	/**
	 * 
	 */
	public TestContribution() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void update(ResourceSet context) {
		updateCalled = true;
	}

	@Override
	public void postUpdate(ResourceSet context) {
		postUpdateCalled = true;
	}

	@Override
	public void preUpdate(ResourceSet context) {
		preUpdateCalled = true;
	}
	
	
	public static void testClean() {
		preUpdateCalled = false;
		updateCalled = false;
		postUpdateCalled = false;
	}

}

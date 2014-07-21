/*******************************************************************************
 * Copyright (c) 2014 Thales Global Services S.A.S.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *  
 * Contributors:
 *   Thales Global Services S.A.S - initial API and implementation
 *******************************************************************************/
package org.polarsys.kitalpha.resourcereuse.tests;

import junit.framework.Test;
import junit.framework.TestSuite;

/**
 * @author Thomas Guiu
 * 
 */
public class Tests {

	public static Test suite() {
		TestSuite suite = new TestSuite("Resource Reuse Test Suite"); //$NON-NLS-1$
		suite.addTest(new TestSuite(ResourceTests.class));
		return suite;
	}

}

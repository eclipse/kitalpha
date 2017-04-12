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
package org.polarsys.kitalpha.ad.viewpoint.tests;

import junit.framework.Test;
import junit.framework.TestSuite;

/**
 * @author Thomas Guiu
 * 
 */
public class AdViewpointTestSuite {

	public static Test suite() {
		TestSuite suite = new TestSuite("Viewpoint Manager Test Suite"); //$NON-NLS-1$
		suite.addTest(new TestSuite(BasicTests.class));
		suite.addTest(new TestSuite(BasicTests2.class));
		suite.addTest(new TestSuite(BasicTests3.class));

		suite.addTest(new TestSuite(ModelTests1.class));
		suite.addTest(new TestSuite(ModelTests2.class));
		suite.addTest(new TestSuite(ModelTests3.class));
		suite.addTest(new TestSuite(ModelTests4.class));
		return suite;
	}

}

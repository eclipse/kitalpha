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

import junit.framework.Test;
import junit.framework.TestSuite;

/**
 * @author Thomas Guiu
 * 
 */
public class AdMetaDataTestSuite {

	public static Test suite() {
		TestSuite suite = new TestSuite("Metadata Test Suite"); //$NON-NLS-1$
		suite.addTest(new TestSuite(BasicTests.class));
		suite.addTest(new TestSuite(BasicTests2.class));
		suite.addTest(new TestSuite(BasicTests3.class));
		suite.addTest(new TestSuite(ComponentSampleTests2.class));
		suite.addTest(new TestSuite(ComponentSampleTests.class));
		suite.addTest(new TestSuite(ComponentSampleTestsCycle1.class));
		suite.addTest(new TestSuite(ComponentSampleTestsCycle2.class));
		suite.addTest(new TestSuite(ComponentSampleTestsDiamond1.class));
		suite.addTest(new TestSuite(ComponentSampleTestsDiamond2.class));
		suite.addTest(new TestSuite(ComponentSampleTestsDiamond3.class));
		suite.addTest(new TestSuite(ComponentSampleTestsDiamond4.class));
		suite.addTest(new TestSuite(ModelTests1.class));
		suite.addTest(new TestSuite(ModelTests2.class));
		suite.addTest(new TestSuite(ModelTests3.class));
		suite.addTest(new TestSuite(ModelTests4.class));
		suite.addTest(new TestSuite(UpdateReferencedViewpointsTests.class));
		return suite;
	}

}

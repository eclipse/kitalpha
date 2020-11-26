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
package org.polarsys.kitalpha.ad.viewpoint.predicate.tests.junit.suites;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;
import org.polarsys.kitalpha.ad.viewpoint.predicate.tests.junit.ContextAPITests;
import org.polarsys.kitalpha.ad.viewpoint.predicate.tests.junit.ExtensionManagerTests;
import org.polarsys.kitalpha.ad.viewpoint.predicate.tests.junit.TransitionEngineAPI;

/**
 * 
 * @author Faycal Abka
 *
 */
@RunWith(Suite.class)
@SuiteClasses({ContextAPITests.class, 
	ExtensionManagerTests.class, 
	TransitionEngineAPI.class
	})
public class AllPredicatesTestSuite {

}

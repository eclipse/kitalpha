/*******************************************************************************
 * Copyright (c) 2017 Thales Global Services.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
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
public class AllPredicatesTests {

}

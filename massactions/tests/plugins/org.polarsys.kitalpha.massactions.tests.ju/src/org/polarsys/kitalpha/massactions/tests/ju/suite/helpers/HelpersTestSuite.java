/*******************************************************************************
 * Copyright (c) 2018, 2020 Thales Global Services S.A.S.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 * 
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *    Thales Global Services S.A.S - initial API and implementation
 *******************************************************************************/

package org.polarsys.kitalpha.massactions.tests.ju.suite.helpers;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.polarsys.kitalpha.massactions.tests.ju.test.helpers.CommonFeaturesTests;
import org.polarsys.kitalpha.massactions.tests.ju.test.helpers.UnfoldRowObjectTests;

/**
 * 
 * @author Sandu Postaru
 *
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({ CommonFeaturesTests.class, UnfoldRowObjectTests.class })
public class HelpersTestSuite {

}

/*******************************************************************************
 * Copyright (c) 2018 Thales Global Services S.A.S.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 * 
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *    Thales Global Services S.A.S - initial API and implementation
 *******************************************************************************/

package org.polarsys.kitalpha.massactions.tests.ju.suite;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.polarsys.kitalpha.massactions.tests.ju.suite.helpers.HelpersTestSuite;
import org.polarsys.kitalpha.massactions.tests.ju.suite.view.ViewsTestSuite;

/**
 * 
 * @author Sandu Postaru
 *
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({ HelpersTestSuite.class, ViewsTestSuite.class })
public class GlobalTestSuite {

}

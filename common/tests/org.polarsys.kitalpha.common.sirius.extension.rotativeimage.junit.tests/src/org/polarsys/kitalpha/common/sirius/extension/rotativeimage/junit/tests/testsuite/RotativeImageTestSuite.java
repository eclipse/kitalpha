/*******************************************************************************
 * Copyright (c) 2021 Thales Global Services S.A.S.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 * 
 * SPDX-License-Identifier: EPL-2.0
 *  
 * Contributors:
 *   Thales Global Services S.A.S - initial API and implementation
 *******************************************************************************/

package org.polarsys.kitalpha.common.sirius.extension.rotativeimage.junit.tests.testsuite;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;
import org.polarsys.kitalpha.common.sirius.extension.rotativeimage.junit.tests.testcases.ExtensionPointTest;
import org.polarsys.kitalpha.common.sirius.extension.rotativeimage.junit.tests.testcases.LoadSessionWithExtensionTest;
import org.polarsys.kitalpha.common.sirius.extension.rotativeimage.junit.tests.testcases.RotativeImageDisplayTest;
import org.polarsys.kitalpha.common.sirius.extension.rotativeimage.junit.tests.testcases.RotativeImageMovementTest;

/**
 * @author <a href="mailto:arnaud.dieumegard@obeo.fr">Arnaud Dieumegard</a>
 */
@RunWith(Suite.class)
@SuiteClasses({ ExtensionPointTest.class, LoadSessionWithExtensionTest.class, RotativeImageDisplayTest.class, RotativeImageMovementTest.class })
public class RotativeImageTestSuite {

}

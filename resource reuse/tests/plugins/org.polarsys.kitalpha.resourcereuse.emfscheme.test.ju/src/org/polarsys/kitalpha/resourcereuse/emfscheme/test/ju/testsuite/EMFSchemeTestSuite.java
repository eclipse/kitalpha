/*******************************************************************************
 * Copyright (c) 2016, 2017 Thales Global Services S.A.S.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 * 
 * SPDX-License-Identifier: EPL-2.0
 *  
 * Contributors:
 *   Thales Global Services S.A.S - initial API and implementation
 *******************************************************************************/

package org.polarsys.kitalpha.resourcereuse.emfscheme.test.ju.testsuite;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;
import org.polarsys.kitalpha.resourcereuse.emfscheme.test.ju.api.ModelReuseLoaderTestsKO;
import org.polarsys.kitalpha.resourcereuse.emfscheme.test.ju.api.ModelReuseLoaderTestsOK;
import org.polarsys.kitalpha.resourcereuse.emfscheme.test.ju.api.AdditionalTest;

/**
 * @author Faycal ABKA
 */
@RunWith(Suite.class)
@SuiteClasses({ AdditionalTest.class, ModelReuseLoaderTestsKO.class, ModelReuseLoaderTestsOK.class /*, ModelReuseLoadLargeModel.class */ })
public class EMFSchemeTestSuite {

}

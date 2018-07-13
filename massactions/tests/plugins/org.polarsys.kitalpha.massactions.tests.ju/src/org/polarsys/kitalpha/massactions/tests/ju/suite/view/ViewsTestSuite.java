/*******************************************************************************
 * Copyright (c) 2018 Thales Global Services S.A.S.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Thales Global Services S.A.S - initial API and implementation
 *******************************************************************************/

package org.polarsys.kitalpha.massactions.tests.ju.suite.view;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.polarsys.kitalpha.massactions.tests.ju.test.view.AddingElementsTest;
import org.polarsys.kitalpha.massactions.tests.ju.test.view.ColumnFilterTest;
import org.polarsys.kitalpha.massactions.tests.ju.test.view.ColumnGroupTest;
import org.polarsys.kitalpha.massactions.tests.ju.test.view.ColumnHideShowTest;
import org.polarsys.kitalpha.massactions.tests.ju.test.view.ColumnReorderTest;
import org.polarsys.kitalpha.massactions.tests.ju.test.view.ColumnSortTest;

/**
 * 
 * @author Sandu Postaru
 *
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({ AddingElementsTest.class, ColumnFilterTest.class, ColumnGroupTest.class, ColumnHideShowTest.class,
    ColumnReorderTest.class, ColumnSortTest.class })
public class ViewsTestSuite {

}

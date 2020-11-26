/*******************************************************************************
 * Copyright (c) 2018 Thales Global Services.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 * 
 * SPDX-License-Identifier: EPL-2.0
 *  
 * Contributors:
 *   Thales - initial API and implementation
 *******************************************************************************/
package org.polarsys.kitalpha.ad.viewpoint.predicate.tests.junit.testcases.contrib;

import org.polarsys.kitalpha.ad.viewpoint.predicate.interfaces.Context;
import org.polarsys.kitalpha.ad.viewpoint.predicate.interfaces.Predicate;

public class ContribPredicate implements Predicate {

	public ContribPredicate() {
	}

	@Override
	public boolean apply(Context e) {
		return e != null;
	}

}

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
package org.polarsys.kitalpha.ad.viewpoint.predicate.tests.junit;

import org.polarsys.kitalpha.ad.viewpoint.predicate.interfaces.Context;

public class TestContext extends Context {

	@Override
	protected void initializeContext() {
		add("varTest", "Unique Value");
	}

}

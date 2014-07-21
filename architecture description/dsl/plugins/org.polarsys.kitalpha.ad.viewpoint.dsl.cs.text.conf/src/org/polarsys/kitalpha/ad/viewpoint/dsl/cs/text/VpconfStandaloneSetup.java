/*******************************************************************************
 * Copyright (c) 2014 Thales Global Services S.A.S.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *  Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/

package org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text;

import org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.VpconfStandaloneSetupGenerated;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class VpconfStandaloneSetup extends VpconfStandaloneSetupGenerated{

	public static void doSetup() {
		new VpconfStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}


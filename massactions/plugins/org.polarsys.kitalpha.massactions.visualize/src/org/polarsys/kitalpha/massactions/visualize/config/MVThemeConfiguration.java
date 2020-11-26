/*******************************************************************************
 * Copyright (c) 2018, 2020  Thales Global Services S.A.S.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 * 
 * SPDX-License-Identifier: EPL-2.0
 *
 *  Contributors:
 *  Thales Global Services S.A.S - initial API and implementation
 *******************************************************************************/
package org.polarsys.kitalpha.massactions.visualize.config;

import org.polarsys.kitalpha.massactions.core.config.MAThemeConfiguration;
import org.polarsys.kitalpha.massactions.core.data.provider.MAImageRowHeaderDataProvider;

/**
 * An extension of the Modern Theme configuration, that adds support for icon
 * based row headers. See {@link MAImageRowHeaderDataProvider} for more
 * information.
 *
 * @author Sandu Postaru
 * 
 */
public class MVThemeConfiguration extends MAThemeConfiguration {

	public MVThemeConfiguration() {
		super();
		addThemeExtension(new MVGroupByThemeExtension());
	}
}

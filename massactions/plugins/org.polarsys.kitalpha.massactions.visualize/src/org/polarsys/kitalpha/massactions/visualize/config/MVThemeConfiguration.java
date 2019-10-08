/*******************************************************************************
 * Copyright (c) 2018  Thales Global Services S.A.S.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
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

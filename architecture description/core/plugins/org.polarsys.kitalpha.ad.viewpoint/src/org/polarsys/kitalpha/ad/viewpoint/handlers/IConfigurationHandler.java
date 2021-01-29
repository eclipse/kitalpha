/*******************************************************************************
 * Copyright (c) 2014, 2020 Thales Global Services S.A.S.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 * 
 * SPDX-License-Identifier: EPL-2.0
 *  
 * Contributors:
 *   Thales Global Services S.A.S - initial API and implementation
 *******************************************************************************/

package org.polarsys.kitalpha.ad.viewpoint.handlers;

import java.util.List;

import org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.Property;

/**
 * @author Thomas Guiu
 * 
 */
public interface IConfigurationHandler extends IElementHandler {
	void removeProperties(List<Property> properties);

	void createProperty(String name);

}

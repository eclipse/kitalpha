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

import org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.Rule;

/**
 * @author Thomas Guiu
 * 
 */
public interface IRuleHandler extends IElementHandler {
	void removeRules(List<Rule> rules);

	void createRule(String id);

	void createRule(String id, String type, String implementation);

}

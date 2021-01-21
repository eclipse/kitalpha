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

package org.polarsys.kitalpha.ad.viewpoint.integration.rules;

import org.osgi.framework.Bundle;
import org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.Rule;
import org.polarsys.kitalpha.ad.viewpoint.utils.ModelAccessor;

/**
 * @author Thomas Guiu
 * 
 */
public interface RuleProvider {

	boolean hasProvider(Bundle bundle);

	ElementDescriptor[] getAvailableImplementations();

	String getType();

	void execute(Rule rule, ModelAccessor properties, Object[] selection);

	boolean canExecute(Rule rule, ModelAccessor properties, Object[] selection);
}

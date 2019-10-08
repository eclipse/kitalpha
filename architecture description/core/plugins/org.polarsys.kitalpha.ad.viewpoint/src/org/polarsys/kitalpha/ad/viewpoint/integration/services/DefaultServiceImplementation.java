/*******************************************************************************
 * Copyright (c) 2014, 2018 Thales Global Services S.A.S.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *  
 * Contributors:
 *   Thales Global Services S.A.S - initial API and implementation
 *******************************************************************************/

package org.polarsys.kitalpha.ad.viewpoint.integration.services;

import org.polarsys.kitalpha.ad.common.AD_Log;
import org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.Rule;
import org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.Service;
import org.polarsys.kitalpha.ad.viewpoint.integration.rules.RuleProvider;
import org.polarsys.kitalpha.ad.viewpoint.integration.rules.Rules;
import org.polarsys.kitalpha.ad.viewpoint.utils.ModelAccessor;

/**
 * @author Thomas Guiu
 * 
 */
public class DefaultServiceImplementation implements ServiceImplementation {

	@Override
	public void run(Service service, ModelAccessor accessor, Object[] selection) {
		for (Rule rule : service.getRelatedRules()) {
			// Look for overriding rules
			rule = accessor.resolveRule(rule.getId());
			RuleProvider provider = Rules.getProvider(rule.getType());
			if (provider == null) {
				String message = "Cannot find provider: " + rule.getType() + " for rule '" + rule.getId() + "'";
				AD_Log.getDefault().logError(message);
			} else {
				provider.execute(rule, accessor, selection);
			}
		}

	}

	@Override
	public boolean canRun(Service service, ModelAccessor accessor, Object[] selection) {
		for (Rule rule : service.getRelatedRules()) {
			// Look for overriding rules
			String id = rule.getId();
			rule = accessor.resolveRule(id);
			if (rule == null) {
				AD_Log.getDefault().logError("Cannot find rule '" + id + "' in service '" + service.getId() + "'");
				return false;
			}
			RuleProvider provider = Rules.getProvider(rule.getType());
			if (provider == null) {
				String message = "Cannot find provider: " + rule.getType() + " for rule '" + id + "'";
				AD_Log.getDefault().logError(message);
				return false;
			} else {
				return provider.canExecute(rule, accessor, selection);
			}
		}
		return true;
	}
}

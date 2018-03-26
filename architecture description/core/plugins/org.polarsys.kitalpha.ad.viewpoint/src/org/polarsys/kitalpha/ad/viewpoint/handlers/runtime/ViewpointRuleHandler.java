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

package org.polarsys.kitalpha.ad.viewpoint.handlers.runtime;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.util.EcoreUtil;
import org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.Rule;
import org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.RuleSet;
import org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.Viewpoint;
import org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.ViewpointFactory;
import org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.tools.model.ViewpointElement;
import org.polarsys.kitalpha.ad.viewpoint.handlers.IRuleHandler;

/**
 * 
 * @author Thomas Guiu
 * 
 */
public class ViewpointRuleHandler extends ViewpointManager.ElementHandler implements IRuleHandler {

	public ViewpointRuleHandler(Viewpoint viewpoint, ViewpointManager mgr) {
		super(viewpoint, mgr);
	}

	public void removeRules(List<Rule> rules) {
		for (Rule rule : rules) {
			if (!isRemovable(rule)){
				continue;
			}
			// we need to remove reference in services too
			EcoreUtil.delete(rule);
		}
		saveModel();
	}

	public void createRule(String id) {
		createRule(id, null, null);
	}

	public void createRule(String id, String type, String implementation) {
		RuleSet set = getCurrentRuleSet();
		Rule rule = ViewpointFactory.eINSTANCE.createRule();
		rule.setId(id);
		rule.setType(type);
		rule.setImplementation(implementation);
		rule.setVpid(EcoreUtil.generateUUID());
		set.getNewRules().add(rule);
		saveModel();
	}

	private RuleSet getCurrentRuleSet() {
		RuleSet set = getViewpoint().getRuleSet();
		if (set == null) {
			set = ViewpointFactory.eINSTANCE.createRuleSet();
			set.setTarget(getViewpoint());
			set.setVpid(EcoreUtil.generateUUID());
			getViewpoint().setRuleSet(set);
		}
		return set;
	}

	public List<ViewpointElement> getElements() {
		List<ViewpointElement> rules = new ArrayList<ViewpointElement>();
		rules.addAll(getViewpoint().getRules());
		return rules;
	}

	public List<ViewpointElement> getElementsFromParents() {
		Map<String, ViewpointElement> name2prop = new HashMap<String, ViewpointElement>();
		for (Viewpoint vp : getViewpoint().getAllParents()) {
			for (ViewpointElement elt : vp.getRules()) {
				name2prop.put(getIdentifier(elt), elt);
			}
		}
		return new ArrayList<ViewpointElement>(name2prop.values());
	}

}

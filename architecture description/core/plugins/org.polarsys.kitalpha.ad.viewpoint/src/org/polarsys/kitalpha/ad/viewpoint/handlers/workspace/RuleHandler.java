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

package org.polarsys.kitalpha.ad.viewpoint.handlers.workspace;

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
import org.polarsys.kitalpha.ad.viewpoint.handlers.ResourceManager;

/**
 * 
 * @author Thomas Guiu
 * 
 */
public class RuleHandler extends WorkspaceManager.ElementHandler implements IRuleHandler {

	public RuleHandler(Viewpoint viewpoint, ResourceManager mgr) {
		super(viewpoint, mgr);
	}

	private RuleSet createRuleSet() {
		RuleSet ruleSet = ViewpointFactory.eINSTANCE.createRuleSet();
		ruleSet.setTarget(getViewpoint());
		ruleSet.setVpid(EcoreUtil.generateUUID());
		if (getWorkspace() != null){
			getWorkspace().getRuleSets().add(ruleSet);
		}
		return ruleSet;
	}

	@Override
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

	@Override
	public void createRule(String id) {
		createRule(id, null, null);
	}

	@Override
	public void createRule(String id, String type, String implementation) {
		if (getWorkspace() == null){
			throw new IllegalStateException("no workspace available");
		}
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
		if (getWorkspace() == null){
			return createRuleSet();
		}
		RuleSet set = getWorkspace().getRuleSet(getViewpoint());
		if (set == null){
			set = createRuleSet();
		}
		return set;
	}

	@Override
	public List<ViewpointElement> getElements() {
		List<? extends ViewpointElement> toRemove = null;
		List<? extends ViewpointElement> toAdd = null;

		Map<String, ViewpointElement> name2elt = new HashMap<String, ViewpointElement>();
		for (ViewpointElement elt : getViewpoint().getRules()) {
			name2elt.put(getIdentifier(elt), elt);
		}
		if (getWorkspace() != null) {
			RuleSet set = getWorkspace().getRuleSet(getViewpoint());
			if (set != null) {
				toRemove = set.getHiddenRules();
				toAdd = set.getNewRules();
			}
		}
		return computeElements(getViewpoint().getRules(), toRemove, toAdd);
	}

	@Override
	public List<ViewpointElement> getElementsFromParents() {
		Map<String, ViewpointElement> name2prop = new HashMap<String, ViewpointElement>();
		for (Viewpoint vp : getViewpoint().getAllParents()) {
			processViewpoint(vp, name2prop);
		}
		processViewpoint(getViewpoint(), name2prop);
		return new ArrayList<ViewpointElement>(name2prop.values());
	}

	private void processViewpoint(Viewpoint vp, Map<String, ViewpointElement> name2prop) {
		for (ViewpointElement elt : vp.getRules()) {
			name2prop.put(getIdentifier(elt), elt);
		}
	}

}

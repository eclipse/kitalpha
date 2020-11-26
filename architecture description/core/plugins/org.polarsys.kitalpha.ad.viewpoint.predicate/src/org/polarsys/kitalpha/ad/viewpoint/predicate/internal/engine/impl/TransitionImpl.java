/*******************************************************************************
 * Copyright (c) 2017 Thales Global Services.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 * 
 * SPDX-License-Identifier: EPL-2.0
 *  
 * Contributors:
 *   Thales - initial API and implementation
 *******************************************************************************/
package org.polarsys.kitalpha.ad.viewpoint.predicate.internal.engine.impl;

import java.util.HashMap;
import java.util.Map;

import org.polarsys.kitalpha.ad.viewpoint.predicate.interfaces.Action;
import org.polarsys.kitalpha.ad.viewpoint.predicate.interfaces.Predicate;

/**
 * Transition implementation
 * 
 * @author Faycal Abka
 *
 */
public class TransitionImpl implements InternalTransition {
	
	private final String viewpointID;
	private final String actionID;
	private final Action action;
	private final Map<String, Predicate> predicates;
	private final Map<String, String> diagnostics;
	
	/**
	 * 
	 * @param viewpointID
	 * @param actionID
	 * @param action
	 */
	public TransitionImpl(final String viewpointID, final String actionID, final Action action) {
		this.viewpointID = viewpointID;
		this.actionID = actionID;
		this.action = action;
		this.predicates = new HashMap<>();
		this.diagnostics = new HashMap<>();
	}
	
	/**
	 * Constructor of Transition.
	 * @param viewpointID
	 * @param actionID
	 * @param action
	 * @param predicates
	 * @param diagnostics
	 */
	public TransitionImpl(final String viewpointID, final String actionID, final Action action, 
			final Map<String, Predicate> predicates,
			final Map<String, String> diagnostics) {
		this.viewpointID = viewpointID;
		this.actionID = actionID;
		this.action = action;
		this.predicates = predicates;
		this.diagnostics = diagnostics;
	}

	@Override
	public String getViewpointID() {
		return this.viewpointID;
	}

	@Override
	public String getActionID() {
		return this.actionID;
	}


	@Override
	public Action getAction() {
		return this.action;
	}


	@Override
	public void addPredicate(final String id, final Predicate predicate) {
		this.predicates.put(id, predicate);
	}

	@Override
	public Map<String, Predicate> getPredicates() {
		return this.predicates;
	}

	@Override
	public Map<String, String> getDiagnosticMessages() {
		return this.diagnostics;
	}

	@Override
	public void addDiagnostic(String id, String diagnosticMessage) {
		getDiagnosticMessages().put(id, diagnosticMessage);
	}

	@Override
	public String getDiagnosticMessage(String predicateID) {
		return getDiagnosticMessages().get(predicateID);
	}

}

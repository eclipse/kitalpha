/*******************************************************************************
 * Copyright (c) 2017 Thales Global Services.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *  
 * Contributors:
 *   Thales - initial API and implementation
 *******************************************************************************/
package org.polarsys.kitalpha.ad.viewpoint.predicate.internal.engine.impl;

import java.util.HashMap;
import java.util.Map;

import org.polarsys.kitalpha.ad.viewpoint.predicate.interfaces.Action;
import org.polarsys.kitalpha.ad.viewpoint.predicate.interfaces.ContextProvider;
import org.polarsys.kitalpha.ad.viewpoint.predicate.interfaces.Predicate;
import org.polarsys.kitalpha.ad.viewpoint.predicate.interfaces.Transition;
import org.polarsys.kitalpha.ad.viewpoint.predicate.interfaces.TransitionEngine;
import org.polarsys.kitalpha.ad.viewpoint.predicate.interfaces.TransitionFactory;
import org.polarsys.kitalpha.ad.viewpoint.predicate.internal.extension.manager.TransitionExtensionManager;

/**
 * 
 * @author Faycal Abka
 *
 */
public class DefaultFactory implements TransitionFactory {
	
	public static final TransitionFactory INSTANCE = new DefaultFactory();
	
	private DefaultFactory() {
	}

	@Override
	public Transition createTransition(String viewpointID, String actionID, Action action) {
		return new TransitionImpl(viewpointID, actionID, action);
	}

	@Override
	public Transition createTransition(String viewpointID, String actionID, Action action, final Map<String, Predicate> predicates) {
		return new TransitionImpl(viewpointID, actionID, action, predicates, new HashMap<>());
	}
	
	@Override
	public Transition createTransition(String viewpointID, String actionID, Action action, Map<String, Predicate> predicates, Map<String, String> diagnosticMessages) {
		return new TransitionImpl(viewpointID, actionID, action, predicates, diagnosticMessages);
	}

	@Override
	public TransitionEngine createTransitionEngine(Transition transition, ContextProvider context) {
		return new TransitionEngineImpl(transition, context);
	}

	@Override
	public Transition createTransition(String viewpointID, String actionID) {
		return TransitionExtensionManager.getInstance().retriveTransition(viewpointID, actionID);
	}

	@Override
	public TransitionEngine createTransitionEngine(String viewpointID, String actionID, ContextProvider context) {
		return createTransitionEngine(createTransition(viewpointID, actionID), context);
	}

}

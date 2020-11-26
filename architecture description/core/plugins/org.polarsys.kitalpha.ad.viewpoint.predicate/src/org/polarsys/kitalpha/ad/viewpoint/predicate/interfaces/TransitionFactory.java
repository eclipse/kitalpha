/*******************************************************************************
 * Copyright (c) 2017, 2020 Thales Global Services.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 * 
 * SPDX-License-Identifier: EPL-2.0
 *  
 * Contributors:
 *   Thales - initial API and implementation
 *******************************************************************************/
package org.polarsys.kitalpha.ad.viewpoint.predicate.interfaces;

import java.util.Map;

/**
 * Interface which specify the ways to create Transitions and Transition engines.
 * There are two ways:
 * <ol>
 * 	<li>Predefined Action or/and predicates: The client knows and controls the terms of its transitions</li>
 * 	<li>From External sources: by introspection of the environment (i.e., default implementation: extension points)</li>
 * </ol>
 * 
 * @author Faycal Abka
 *
 */
public interface TransitionFactory {
	
	/**
	 * Create a new transition with a predefined action
	 * @param viewpointID optional parameter. Maybe null or empty
	 * @param actionID optional parameter. Maybe null or empty
	 * @param action to perform the transition
	 * @return new Transition without predicates (i.e., the transition will be executed)
	 */
	Transition createTransition(String viewpointID, String actionID, Action action);
	
	/**
	 * Create a new transition with a predefined action and predicates
	 * @param viewpointID optional parameter. Maybe null or empty
	 * @param actionID optional parameter. Maybe null or empty
	 * @param action to perform the transition
	 * @param predicates the predicates to evaluate before the execution of the action
	 * @return new Transition
	 */
	Transition createTransition(String viewpointID, String actionID, Action action, Map<String, Predicate> predicates);
	
	/**
	 * Create a new transition with a predefined action and predicates with diagnostic messages
	 * @param viewpointID optional parameter. Maybe null or empty
	 * @param actionID optional parameter. Maybe null or empty
	 * @param action to perform the transition
	 * @param predicates the predicates to evaluate before the execution of the action
	 * @param diagnosticMessages diagnostic messages
	 * @return
	 */
	Transition createTransition(String viewpointID, String actionID, Action action, Map<String, Predicate> predicates, Map<String, String> diagnosticMessages);
	
	/**
	 * Create an engine to execute a transition in a context
	 * @param transition to execute
	 * @param context of the transition
	 * @return a new engine to execute the transition
	 */
	TransitionEngine createTransitionEngine(Transition transition, ContextProvider context); 
	
	/*
	 ********************** Create a Transitions from external sources *****************************
	 */
	
	/**
	 * Create a transition from external source specified by the viewpointID and actionID
	 * If there are a several transitions, all their predicates are merged
	 * @param viewpointID
	 * @param actionID
	 * @return a new Transaction or an default transition with a NOP action
	 */
	Transition createTransition(String viewpointID, String actionID);
	
	/**
	 * Create a new engine which contains a transition from external source with a specific context
	 * If there are a several transitions, all their predicates are merged
	 * @param viewpointID of Transition
	 * @param actionID of transition
	 * @param context of evaluation and execution of transition
	 * @return the engine associated to transition. If the transition doesn't exist from external source, a default
	 * transition with NOP action is linked to the engine
	 */
	TransitionEngine createTransitionEngine(String viewpointID, String actionID, ContextProvider context);

}

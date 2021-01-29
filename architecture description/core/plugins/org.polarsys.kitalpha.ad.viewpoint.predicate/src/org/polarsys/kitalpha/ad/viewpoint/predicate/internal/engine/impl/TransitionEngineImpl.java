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
package org.polarsys.kitalpha.ad.viewpoint.predicate.internal.engine.impl;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.BinaryOperator;

import org.polarsys.kitalpha.ad.viewpoint.predicate.exceptions.EvaluationException;
import org.polarsys.kitalpha.ad.viewpoint.predicate.interfaces.Action;
import org.polarsys.kitalpha.ad.viewpoint.predicate.interfaces.Context;
import org.polarsys.kitalpha.ad.viewpoint.predicate.interfaces.ContextProvider;
import org.polarsys.kitalpha.ad.viewpoint.predicate.interfaces.Predicate;
import org.polarsys.kitalpha.ad.viewpoint.predicate.interfaces.Transition;
import org.polarsys.kitalpha.ad.viewpoint.predicate.interfaces.TransitionEngine;

/**
 * Transition Engine implementation
 * 
 * @author Faycal Abka
 *
 */
public class TransitionEngineImpl implements TransitionEngine {
	
	/**
	 * The transition to execute
	 */
	private final Transition transition;
	
	/**
	 * The context of the transition
	 */
	private final Context context;
	
	/**
	 * Keeps the evaluation of the predicates
	 */
	private final Map<String, Boolean> predicatesStates;
	
	
	/**
	 * Function which perform logic <code>and</code> operator between two boolean value
	 */
	private static final BinaryOperator<Boolean> and = (left, right) -> left && right;
	
	/**
	 * Constructor
	 * @param transition
	 * @param context
	 */
	public TransitionEngineImpl(final Transition transition, final ContextProvider context) {
		this.transition = transition;
		this.context = context.getContext();
		this.predicatesStates = new HashMap<>();
	}

	@Override
	public Transition getTransition() {
		return this.transition;
	}

	@Override
	public boolean eval() throws EvaluationException {
		try {
			initializeStates();
			Collection<Boolean> evalPredicates = predicatesStates.values();
			return evalPredicates.stream().reduce(true, and);
		} catch (Exception cause){
			throw new EvaluationException("An exception is thown while the evaluation of the predicates. See the exception stack for more information", cause);
		}
	}

	@Override
	public boolean run() throws EvaluationException {
		try {
			boolean result = eval();
			if (result){
				Action action = getTransition().getAction();
				action.run(context);
			}
			return result;
		} catch (Exception cause){
			throw new EvaluationException("An exception is thown while the execution of the action: " + getTransition().getActionID() + ". See the exception stack for more information", cause);
		}
	}
	
	private void initializeStates(){
		Map<String, Predicate> predicates = getTransition().getPredicates();
		for(Entry<String, Predicate> e: predicates.entrySet()){
			predicatesStates.put(e.getKey(), e.getValue().apply(context));
		}
	}

	@Override
	public Map<String, String> getDiagnosticMessages(boolean predicateValue) {
		Map<String, String> result = new HashMap<>();
		
		for(Entry<String, Boolean> e: predicatesStates.entrySet()){
			if (e.getValue() == predicateValue){
				String diagnosticMessage = getTransition().getDiagnosticMessage(e.getKey());
				result.put(e.getKey(), diagnosticMessage);
			}
		}
		
		return result;
	}

}

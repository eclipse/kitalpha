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

import org.polarsys.kitalpha.ad.viewpoint.predicate.exceptions.EvaluationException;

/**
 * Interface which specify the engine to execute a Transition.
 * The engine is responsible of :
 * <ol>
 * 	<li>Evaluation of predicates</li>
 * 	<li>Execution of action (Transition)</li>
 * 	<li>Wrapping all exception during the step of evaluation or execution</li>
 * 	<li>Retrieve diagnostic messages attached to predicate which are executed in the transtion</li>
 * </ol>
 * 
 * @author Faycal Abka
 *
 */
public interface TransitionEngine {
	
	/**
	 * @return the Transition associated the this engine
	 */
	Transition getTransition();
	
	/**
	 * Evaluate the predicates of the transition
	 * @return true if all predicate are evaluated to true, otherwise false
	 * @throws EvaluationException if in the evaluation time fails with exception cause 
	 */
	boolean eval() throws EvaluationException;
	
	/**
	 * Execute the Action (i.e., the transition)
	 * @return the boolean value returned in the evaluation time of predicates (i.e., eval() method)
	 * @throws EvaluationException if in the execution time fails with exception cause
	 */
	boolean run() throws EvaluationException;
	
	/**
	 * get Diagnostic messages attached to predicate which are evaluated to predicateValue
	 * @param predicateValue
	 * @return A map which contains the id of the predicate and the diagnostic message
	 */
	Map<String, String> getDiagnosticMessages(boolean predicateValue);
}

/*******************************************************************************
 * Copyright (c) 2017, 2018 Thales Global Services.
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
 * Interface which specify the transition.
 * A transition is declaration of three terms:
 * <ol>
 * 	<li>Viewpoint: represented by the ID of the viewpoint. mainly is the entity on which perform the transition</li>
 * 	<li>Action: Define the behavior (what to do) to perform the Transition</li>
 * 	<li>predicates: one or more predicate(s) which act as guard to the execution of the Action</li>
 * </ol>
 * 
 * <b>NB: </b>If the transition specify more than one predicate, the <i>and</i> operator is applied between the predicates
 * 
 * @author Faycal Abka
 *
 */
public interface Transition {
	
	/**
	 * @return the ID of the viewpoint
	 */
	String getViewpointID();
	
	/**
	 * @return the ID of the Action which responsible to perform the transition
	 */
	String getActionID();
	
	/**
	 * @return the action which perform the transition
	 */
	Action getAction();
	
	
	/**
	 * @return all predicate of this transition
	 */
	Map<String, Predicate> getPredicates();
	
	/**
	 * Association Predicate ID with diagnostic message
	 * @return
	 */
	Map<String, String> getDiagnosticMessages();
	
	/**
	 * @param predicateID
	 * @return diagnostic message of predicate
	 */
	String getDiagnosticMessage(String predicateID);
	

}

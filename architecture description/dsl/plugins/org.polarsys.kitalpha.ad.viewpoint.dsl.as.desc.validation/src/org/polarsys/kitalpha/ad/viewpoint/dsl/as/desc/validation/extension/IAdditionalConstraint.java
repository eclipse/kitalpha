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
 ******************************************************************************/

package org.polarsys.kitalpha.ad.viewpoint.dsl.as.desc.validation.extension;

/**
 * This interface allows contributor to provide information that allows to include
 * check of new model element in a generic EMF validation rule. This rule is created 
 * to allow contributor to provide new java rules behavior.  
 * @author Boubekeur Zendagui
 *
 */
public interface IAdditionalConstraint {

	/**
	 * This method allows contributor to inform the validation service to check 
	 * the current object
	 * @param object The model element under validation
	 * @return True if the object must be checked by the rule, False else.
	 */
	boolean isObjectInScope(Object object);
	
	/**
	 * Java implementation of the Rule
	 * @param data the model element under validation
	 * @return a {@link ValidationStatus}
	 */
	ValidationStatus validationRules(Object data);
	
	/**
	 * 
	 * @param status the result of the validationRules(Object data) method
	 * @param object the model element under validation
	 * @return The message to display to user if the validation rule failed
	 */
	String getMessage(ValidationStatus status, Object object);
}

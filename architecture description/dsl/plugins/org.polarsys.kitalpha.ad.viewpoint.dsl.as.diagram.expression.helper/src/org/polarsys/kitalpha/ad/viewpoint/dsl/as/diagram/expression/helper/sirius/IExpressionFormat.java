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


package org.polarsys.kitalpha.ad.viewpoint.dsl.as.diagram.expression.helper.sirius;

/**
 * @author Boubekeur Zendagui
 */
public interface IExpressionFormat {
	
	/**
	 * Check if the expression is well formated.
	 * @param expression the expression to check
	 * @return a valid expression to use in Viewpoint Specification Model
	 */
	String format(String expression);
	
	/**
	 * Check if the expression is well formated
	 * @param expression the expression to check
	 * @return True if the expression is well formated, false else;
	 */
	boolean isFormated(String expression);
}

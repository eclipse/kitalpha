/*******************************************************************************
 * Copyright (c) 2014, 2018 Thales Global Services S.A.S.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
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

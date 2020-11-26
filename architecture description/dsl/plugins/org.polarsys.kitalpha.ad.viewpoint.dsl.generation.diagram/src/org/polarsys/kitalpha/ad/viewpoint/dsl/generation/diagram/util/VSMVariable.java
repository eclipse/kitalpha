/*******************************************************************************
 * Copyright (c) 2014, 2018 Thales Global Services S.A.S.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 * 
 * SPDX-License-Identifier: EPL-2.0
 *  
 * Contributors:
 *   Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/

package org.polarsys.kitalpha.ad.viewpoint.dsl.generation.diagram.util;

import org.polarsys.kitalpha.ad.viewpoint.dsl.as.diagram.expression.helper.sirius.ExpressionInterpreter;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.diagram.expression.helper.sirius.ExpressionKind;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.diagram.expression.helper.sirius.OCLExpressionNotSupported;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.diagram.expression.helper.sirius.SiriusExpressionHelper;

/**
 * This enumeration contains all default variable provided by Sirius. They use 
 * depends on the context. 
 * 
 * @author Boubekeur Zendagui
 */
public enum VSMVariable {
	view, 
	container, 
	containerView, 
	diagram, 
	element, 
	elementView, 
	source, 
	sourceView, 
	target, 
	targetView, 
	edgeView,
	selection,
	i;

	public String toString() {
		switch (this) {
		case container:
			return "container";
		case containerView:
			return "containerView";
		case diagram:
			return "diagram";
		case edgeView:
			return "edgeView";
		case element:
			return "element";
		case elementView:
			return "elementView";
		case source:
			return "source";
		case sourceView:
			return "sourceView";
		case target:
			return "target";
		case targetView:
			return "targetView";
		case view:
			return "view";
		case i:
			return "i";
		case selection:
			return "selection";
		default:
			break;
		}
		throw new RuntimeException("VSM Variable not reconized");
	};
	
	/**
	 * Inner variable name depends on the used expression kind. For example in Acceleo 2,
	 * a variable name begin with '$'. This is not the case for Acceleo 3.
	 * 
	 * @return a valid value of the variable name to use in the VSM. 
	 */
	public String getInnerVariable(){
		return SiriusExpressionHelper.getInnerVariable(this.name());
	}
	
	/**
	 * This method is use do manage variables that are not in the scope of the current enum. These 
	 * variables can be a specifics ones defined in the context of a diagram generator.
	 * 
	 * Inner variable name depends on the used expression kind. For example in Acceleo 2,
	 * a variable name begin with '$'. This is not the case for Acceleo 3.
	 * 
	 * @param variableName the variable name to handle.
	 * 
	 * @return a valid value of the variable name to use in the VSM. 
	 */
	public static String getGenericInnerVariable(String variableName){
		return SiriusExpressionHelper.getInnerVariable(variableName);
	}
	
	/**
	 * Compute an expression with Variable Interpreter. The result is like 'Variable:[Variable Name]'.
	 * If the current expression kind is {@link ExpressionKind#Acceleo_2_x}, then the result is 
	 * an Acceleo 2 like expression 
	 * 
	 * @return a valid value of the variable name to use in the VSM. 
	 */
	public String getExpressionVariable(){
		switch ( SiriusExpressionHelper.getCurrentExpressionKind())
		{
			case QueryLegacy:
				return "<%$" + this.name() + "%>";
			case AQL:
			case Acceleo_3_x:
			case Ocl:
				return SiriusExpressionHelper.getExpressoin(this.name(), ExpressionInterpreter.Variable);
		}
		throw new IllegalStateException();
	}
	
	/**
	 * This method is use do manage variables that are not in the scope of the current enum. These 
	 * variables can be a specifics ones defined in the context of a diagram generator.
	 * 
	 * Compute an expression with Variable Interpreter. The result is like 'Variable:[Variable Name]'.
	 * If the current expression kind is {@link ExpressionKind#Acceleo_2_x}, then the result is 
	 * an Acceleo 2 like expression 
	 * 
	 * @param variableName the variable name to handle.
	 *  
	 * @return a valid value of the variable name to use in the VSM. 
	 */
	public static String getGenericExpressionVariable(String variableName){
		switch ( SiriusExpressionHelper.getCurrentExpressionKind())
		{
			case QueryLegacy:
				return "<%$" + variableName + "%>";
			case AQL:
			case Acceleo_3_x:
			case Ocl:
				return SiriusExpressionHelper.getExpressoin(variableName, ExpressionInterpreter.Variable);
		}
		throw new IllegalStateException();
	}
	
}

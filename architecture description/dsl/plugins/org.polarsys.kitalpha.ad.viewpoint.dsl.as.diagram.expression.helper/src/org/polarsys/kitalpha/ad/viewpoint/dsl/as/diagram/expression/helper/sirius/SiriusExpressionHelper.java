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

import org.polarsys.kitalpha.ad.viewpoint.dsl.as.diagram.expression.helper.extension.ExtensionManager;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.Viewpoint;
import org.polarsys.kitalpha.ad.viewpoint.dsl.generation.provider.resourceimpl.ViewpointResourceProviderRegistry;


/**
 * This helper provides methods to create a valid expression to use in a Viewpoint 
 * Specification Model (VSM).
 * 
 * Expression kind can be one of the one defined in {@link ExpressionKind}, 
 * expression can use one of the interpreter defined in {@link ExpressionKind.Interpreter}
 * 
 * The actual version add only delimiters to an expression, so we assume that the 
 * expression is valid.
 * 
 * @author Boubekeur Zendagui
 */

public class SiriusExpressionHelper {
	
	/**
	 * @return the default expression kind
	 */
	public static ExpressionKind getCurrentExpressionKind(){
		final Viewpoint viewpoint = ViewpointResourceProviderRegistry.getInstance().getViewpoint();
		return ExtensionManager.getDiagramExpressionLanguageFilters(viewpoint);
	}
	
	/**
	 * Return a semantic element of edge source or target node
	 * @param source if True so return target element of source node, 
	 * else, return target element of edge target.
	 * @return
	 */
	public static String getEdgeSemanticTarget(boolean source){
		final ExpressionKind currentExpressionKind = getCurrentExpressionKind();
		if (source)
		{
			switch (currentExpressionKind) {
			case AQL:
			case QueryLegacy:
				return "sourceNode.target";

			case Acceleo_3_x:
				return "sourceNode.oclAsType(viewpoint::DSemanticDecorator).target";

			case Ocl:
				throw new OCLExpressionNotSupported();
			}
		}
		else
		{
			switch (currentExpressionKind) {
			case AQL:
			case QueryLegacy:
				return "targetNode.target";

			case Acceleo_3_x:
				return "targetNode.oclAsType(viewpoint::DSemanticDecorator).target";

			case Ocl:
				throw new OCLExpressionNotSupported();
			}
		}
		
		return "";
	}
	
	/**
	 * @param expression the expression
	 * @return A valid expression to use in VSM
	 */
	public static String getExpressoin(String expression){
		ExpressionKind kind = getCurrentExpressionKind();
		return kind.format(expression);
	}
	
	
	/**
	 * @param expression the expression
	 * @param interpreter the interpreter to use in expression transformation
	 * @return a valid expression to use in VSM
	 */
	public static String getExpressoin(String expression, ExpressionInterpreter interpreter){
		return interpreter.format(expression);
	}
	
	/**
	 * @return concatenation character for a specific expression language
	 */
	public static String getConcatenationCharacter() {
		final ExpressionKind currentExpressionKind = SiriusExpressionHelper.getCurrentExpressionKind();
		return currentExpressionKind.getConcatenationCharacter();
	}
	
	/**
	 * 
	 * @param featureName
	 * @return
	 */
	public static String getInnerFeature(String featureName){
		switch (getCurrentExpressionKind()) {
		case QueryLegacy:
			return "<%" + featureName + "%>";
		case AQL:
			return "self."+featureName;
		case Acceleo_3_x:
			return featureName;
		case Ocl:
			throw new OCLExpressionNotSupported();
		}
		throw new RuntimeException();
	}
	
	/**
	 * 
	 * @param serviceName
	 * @return
	 */
	public static String getInnerJavaService(String serviceName){
		switch (getCurrentExpressionKind()) {
		case QueryLegacy:
			return "<%" + serviceName + "%>";
		case AQL:
			return "self."+serviceName;
		case Acceleo_3_x:
			return serviceName;
		case Ocl:
			throw new OCLExpressionNotSupported();
		}
		throw new RuntimeException();
	}
	
	/**
	 * @param variableName the name of the variable to transform
	 * @return well formated variable name
	 */
	public static String getInnerVariable(String variableName){
		switch (getCurrentExpressionKind()) {
		case QueryLegacy:
			return variableHasPrefix(variableName) ? variableName : "$" + variableName;
		case AQL:
		case Acceleo_3_x:
			return getVariableWithoutPrefix(variableName);
		case Ocl:
			throw new OCLExpressionNotSupported();
		}
		throw new RuntimeException();
	}
	
	/**
	 * Format a string depending on the current {@link ExpressionKind}
	 * @param string the string to format
	 * @return a formated string 
	 */
	public static String formatString(String string){
		String trimedString = string.trim();
		if (ExpressionInterpreter.isInterpreterExpression(trimedString)) {
			return string;
		}
		
		ExpressionKind expressionKind = getCurrentExpressionKind();
		switch (expressionKind) {
		case QueryLegacy:
			return string;
		case AQL:
			if (ExpressionKind.AQL.isFormated(trimedString)) {
				return trimedString.substring(4);
			}
			return stringHasDelimiters(string, '\'') ? string : '\'' + string + '\'';
			
		case Acceleo_3_x:
			return stringHasDelimiters(string, '\'') ? string : '\'' + string + '\'';
		case Ocl:
			throw new OCLExpressionNotSupported();
		}
		throw new RuntimeException("Interpreter " + expressionKind.toString() + " not known"); //$NON-NLS-1$ //$NON-NLS-2$
	}
	
	private static boolean stringHasDelimiters(String string, char delimiter){
		return string.charAt(0) == delimiter && string.charAt(string.length()-1) == delimiter;
	}
	
	/**
	 * @param variableName name of the variable to handle
	 * @return a variable name without any prefix. In this version, 
	 * the only known prefix is '$' 
	 */
	private static String getVariableWithoutPrefix(String variableName){
		if (variableHasPrefix(variableName)) {
			return variableName.substring(1, variableName.length());
		}
		return variableName;
	}
	
	/**
	 * check if the variable begin with a special prefix. In this version, 
	 * the only known prefix is '$' 
	 * @param variableName name of the variable to check
	 * @return if the variable name begin with $ character
	 */
	private static boolean variableHasPrefix(String variableName){
		return variableName != null && variableName.length() > 0 ? variableName.startsWith("$") : false ;
	}
	
}

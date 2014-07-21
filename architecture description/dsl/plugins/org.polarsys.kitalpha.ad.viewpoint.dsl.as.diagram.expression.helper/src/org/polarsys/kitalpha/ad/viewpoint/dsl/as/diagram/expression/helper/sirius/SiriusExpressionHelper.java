/*******************************************************************************
 * Copyright (c) 2014 Thales Global Services S.A.S.
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
		// TODO: add a preference allowing user to select expression kind. 
		return ExpressionKind.Acceleo_3_x;
		//return ExpressionKind.Acceleo_2_x;
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
	 * @param variableName the name of the variable to transform
	 * @return well formated variable name
	 */
	public static String getInnerVariable(String variableName){
		switch (getCurrentExpressionKind()) {
		case Acceleo_2_x:
			return variableHasPrefix(variableName) ? variableName : "$" + variableName;
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
		switch (getCurrentExpressionKind()) {
		case Acceleo_2_x:
			return string;
		case Acceleo_3_x:
			return stringHasAcceleo3Delimiters(string) ? string : '\'' + string + '\'';
		case Ocl:
			throw new OCLExpressionNotSupported();
		}
		throw new RuntimeException();
	}
	
	private static boolean stringHasAcceleo3Delimiters(String string){
		return string.charAt(0) == '\'' && string.charAt(string.length()-1) == '\'';
	}
	
	/**
	 * @param variableName name of the variable to handle
	 * @return a variable name without any prefix. In this version, 
	 * the only known prefix is '$' 
	 */
	private static String getVariableWithoutPrefix(String variableName){
		if (variableHasPrefix(variableName))
			return variableName.substring(1, variableName.length());
		else
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

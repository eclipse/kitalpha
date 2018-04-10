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
 * @author Boubekeur Zendagui
 */
public enum ExpressionInterpreter implements IExpressionFormat{
	Feature, Service, Variable;
	
	/**
	 * @see IExpressionFormat#format(String)
	 */
	@Override
	public String format(String expression) {
		if (isFormated(expression)) {
			return expression;
		}
		switch (this) {
		case Feature:
			return getExpression_I_Feature(expression);
		case Service:
			return getExpression_I_Service(expression);
		case Variable:
			return getExpression_I_Var(expression);
		}
		throw new RuntimeException("Expression Interpreter not supported");
	}

	
	/**
	 * @see IExpressionFormat#isFormated(String)
	 */
	@Override
	public boolean isFormated(String expression){
		switch (this) {
		case Feature:
		case Service:
			return containsPrefix(8, expression);
		case Variable:
			return containsPrefix(9, expression);
		}
		return false;
	}
	
	/**
	 * Add <code>feature:</code> prefix to expression
	 * @param expression the expression to format
	 * @return a formated expression to use in Viewpoint Specification Model
	 */
	private static String getExpression_I_Feature(String expression){
		return "feature:" + expression;
	}
	
	/**
	 * Add <code>service:</code> prefix to expression
	 * @param expression the expression to format
	 * @return a formated expression to use in Viewpoint Specification Model
	 */
	private static String getExpression_I_Service(String expression){
		// If the used Expression language is Query Legacy and if service has variable, 
		// 		remove $ character if they exist before each variable name
		if (SiriusExpressionHelper.getCurrentExpressionKind().equals(ExpressionKind.QueryLegacy)) {
			expression = expression.replaceAll("\\$", "");
		}
		
		return "service:" + expression;
	}
	
	/**
	 * Add <code>var:</code> prefix to expression
	 * @param expression the expression to format
	 * @return a formated expression to use in Viewpoint Specification Model
	 */
	private static String getExpression_I_Var(String expression){
		return "var:" + expression;
	}
	
	/**
	 * @param prefixLenght 
	 * @param expression
	 * @return
	 */
	private boolean containsPrefix (int prefixLenght, String expression){
		if (expression.length() < prefixLenght) {
			return false;
		}
		String firstCharacters = expression.substring(0, prefixLenght);
		switch (this) {
		case Feature:
			return firstCharacters.equals(Feature.name()+":");
		case Service:
			return firstCharacters.equals(Service.name()+":");
		case Variable:
			return firstCharacters.equals(Variable.name()+":");
		}
		return false;
	}
	
	public static boolean isInterpreterExpression(String expression){
		String firstCharacters;
		if (expression.length() > 4)
		{
			firstCharacters = expression.substring(0, 4);
			if (firstCharacters.equals(Variable.name().toLowerCase()+":")) {
				return true;
			}
		}
		else
		{
			if (expression.length() > 8)
			{
				firstCharacters = expression.substring(0, 8);
				if (firstCharacters.equals(Feature.name().toLowerCase()+":") || 
						firstCharacters.equals(Service.name().toLowerCase()+":")) {
					return true;
				}
			}
		}

		return false;
	}

}

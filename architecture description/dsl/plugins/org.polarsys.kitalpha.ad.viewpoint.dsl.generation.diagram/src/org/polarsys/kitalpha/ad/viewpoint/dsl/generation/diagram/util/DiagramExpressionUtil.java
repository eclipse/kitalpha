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

package org.polarsys.kitalpha.ad.viewpoint.dsl.generation.diagram.util;

import org.polarsys.kitalpha.ad.viewpoint.dsl.as.diagram.expression.helper.sirius.ExpressionInterpreter;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.diagram.expression.helper.sirius.SiriusExpressionHelper;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.diagram.expression.AbstractComputableElement;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.diagram.expression.JavaElement;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.diagram.expression.StringElement;

/**
 * @author Boubekeur Zendagui
 */

public class DiagramExpressionUtil {
	
	// Hidden constructor
	protected DiagramExpressionUtil() {
	}

	public final static String getAbstractComputableElementExpression(AbstractComputableElement element){
		VSMVariable[] emptyParameters = {};
		return getAbstractComputableElementExpression(element, emptyParameters);
	}
	/**
	 * This method transforms an {@link AbstractComputableElement} to an expression that can be added to a VSM. 
	 * @param element the {@link AbstractComputableElement} to transform to an expression.
	 * @param parameters the defaults parameters to add to a Java Service. This is optio 
	 * @return a textual Expression
	 */
	public final static String getAbstractComputableElementExpression(AbstractComputableElement element, VSMVariable... parameters){
		String expression = "";
		if (element instanceof StringElement)
		{
			StringElement stringElement = (StringElement) element;
			final String value = stringElement.getValue();
			if (value != null && ! value.isEmpty())
			{
				expression = value;
			}
		}
		
		if (element instanceof JavaElement)
		{
			JavaElement javaElement = (JavaElement) element;
			String method = javaElement.getMethod();
			if (method != null && ! method.isEmpty())
			{
				// Compute parameters
				String mParameters = "";
				if (parameters != null && parameters.length > 0)
				{
					StringBuilder builder = new StringBuilder();
					builder.append(parameters[0].getInnerVariable());
					for (int i = 1; i < parameters.length; i++) 
					{
						builder.append(", ").append(parameters[i].getInnerVariable());
					}
				}
				
				// Initialize VSM Service expression 
				method = JavaElementHelper.addDefaultParameterToJavaMethod(method, mParameters);
				expression = SiriusExpressionHelper.getExpressoin(method, ExpressionInterpreter.Service);
			}
		}
		
		return expression;
	}
}

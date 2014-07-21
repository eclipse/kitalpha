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

package org.polarsys.kitalpha.ad.viewpoint.dsl.generation.diagram.util;

import org.eclipse.emf.ecore.EObject;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.diagram.expression.ExpressionPackage;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.diagram.expression.JavaElement;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.AbstractEdge;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.AbstractNode;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.DiagramElement;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.VpdiagramPackage;

/**
 * @author Boubekeur Zendagui
 */

public class JavaElementHelper {
	
	
	public static String addDefaultParameterToJavaMethod(String javaMethod, String parameters){
		String brackets = javaMethod.substring(javaMethod.length()-2, javaMethod.length());
		String newJavaMethod;
		if (brackets.equals("()"))
		{
			newJavaMethod = javaMethod.substring(0, javaMethod.length()-2);
			newJavaMethod = newJavaMethod + "(" + parameters + ")";
			return newJavaMethod;
		}
		else
		{
			return javaMethod + "(" + parameters + ")";
		}
	}
	
	public static EObject getJavaElementContainer(JavaElement javaElement){
		EObject eObject = javaElement.eContainer();
		EObject jeRootContainer = null;
		switch (eObject.eClass().getClassifierID()) 
		{
			case VpdiagramPackage.HISTOGRAM_SECTION:
			case ExpressionPackage.EXPRESSION:
				jeRootContainer = eObject.eContainer().eContainer().eContainer();
				break;
				
			case VpdiagramPackage.CONDITION:
				jeRootContainer = eObject.eContainer().eContainer();
				break;
		}
		return jeRootContainer;
	}
	
	public static String getJavaElementContainerKind(JavaElement javaElement){
		String type = "";
		EObject jeRootContainer = getJavaElementContainer(javaElement);
		if (jeRootContainer != null)
		{
			if (jeRootContainer instanceof AbstractEdge)
				type = "edges";
			
			if (jeRootContainer instanceof AbstractNode)
				type = "nodes";
		}
		return type;
	}
	
	public static String getJavaElementContainerName(JavaElement javaElement){
		String name = "";
		EObject jeRootContainer = getJavaElementContainer(javaElement);
		
		if (jeRootContainer != null)
		{
			if (jeRootContainer instanceof DiagramElement)
				return ((DiagramElement)jeRootContainer).getName();
			
			if (jeRootContainer instanceof AbstractEdge)
				return ((AbstractEdge)jeRootContainer).getName();
		}
		
		return name;
	}
}

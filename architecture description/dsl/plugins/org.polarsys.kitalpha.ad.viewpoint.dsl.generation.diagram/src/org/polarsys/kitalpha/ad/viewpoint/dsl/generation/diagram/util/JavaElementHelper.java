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

package org.polarsys.kitalpha.ad.viewpoint.dsl.generation.diagram.util;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.diagram.expression.ExpressionPackage;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.diagram.expression.JavaElement;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.AbstractEdge;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.AbstractNode;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.DiagramElement;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.VpdiagramPackage;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.CustomizationExpression;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.StyleCustomizationDescriptions;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.VpstylecustomizationPackage;
import org.polarsys.kitalpha.ad.viewpoint.dsl.generation.diagram.javaservice.JavaMethodData;
import org.polarsys.kitalpha.ad.viewpoint.dsl.generation.diagram.javaservice.JavaMethodData.JavaMethodReturnType;

/**
 * @author Boubekeur Zendagui
 */

public class JavaElementHelper {
	
	/**
	 * This method compute the return type of a method depending on it parent.
	 * 
	 * @param javaElement The {@link JavaElement}
	 * @return {@link JavaMethodReturnType}
	 */
	public static JavaMethodReturnType computeExpectedMethodReturnType(JavaElement javaElement){
		EObject context = javaElement.eContainer();
		final EClass eClass = context.eClass();
		
		if (eClass.equals(ExpressionPackage.eINSTANCE.getExpression()))
		{
			if (context.eContainer().eClass().getClassifierID() == VpdiagramPackage.LABEL)
				return JavaMethodReturnType.String;
		}
		
		if (eClass.equals(VpdiagramPackage.eINSTANCE.getHistogramSection()))
			return JavaMethodReturnType.Integer;
		
		if (eClass.equals(VpdiagramPackage.eINSTANCE.getCondition()))
			return JavaMethodReturnType.Boolean;
		
		if (eClass.equals(VpstylecustomizationPackage.eINSTANCE.getCustomizationExpression()))
		{
			// Get the Containing EReference of a customization Expression to identify the expected return type
			final EStructuralFeature containingFeature = context.eContainingFeature();
			
			// Boolean return type
			if (containingFeature.equals(VpstylecustomizationPackage.eINSTANCE.getStyleCustomizationDescriptions_PrecondtionExpression()))
				return JavaMethodReturnType.Boolean; 
			
			// String return type
			if (containingFeature.equals(VpstylecustomizationPackage.eINSTANCE.getLabelCustomization_Expression())
					|| containingFeature.equals(VpstylecustomizationPackage.eINSTANCE.getAbstractNodeStyleCustomization_TooltipExpression()) )
				return JavaMethodReturnType.String; 
			
			// Integer return type
			if (containingFeature.equals(VpstylecustomizationPackage.eINSTANCE.getAbstractNodeStyleCustomization_BorderSizeComputationExpression())
					|| containingFeature.equals(VpstylecustomizationPackage.eINSTANCE.getEdgeStyleCustomization_SizeComputationExpression())
					|| containingFeature.equals(VpstylecustomizationPackage.eINSTANCE.getLozengeCustomization_HeightComputationExpression())
					|| containingFeature.equals(VpstylecustomizationPackage.eINSTANCE.getLozengeCustomization_WidthComputationExpression())
					|| containingFeature.equals(VpstylecustomizationPackage.eINSTANCE.getDotCustomization_StrokeSizeComputationExpression())
					|| containingFeature.equals(VpstylecustomizationPackage.eINSTANCE.getEllipseCustomization_HorizontalDiameterComputationExpression())
					|| containingFeature.equals(VpstylecustomizationPackage.eINSTANCE.getEllipseCustomization_VerticalDiameterComputationExpression())
					|| containingFeature.equals(VpstylecustomizationPackage.eINSTANCE.getNodeStyleCustomization_SizeComputationExpression()) )
			{
				return JavaMethodReturnType.Integer; 
			}
		}
		
		return JavaMethodReturnType.Unknown;
	}
	
	/**
	 * Create a {@link JavaMethodData} from a {@link JavaElement}. 
	 * This method computes the expected return Type and the name of the method. It compute the Java method 
	 * parameter depending on the context of use of the {@link JavaElement}
	 * @param javaElement the {@link JavaElement}
	 * @return a {@link JavaMethodData}
	 */
	public static JavaMethodData createJavaMethod(JavaElement javaElement){
		// Create a Java method Data object containing the Name and the Return type of the Java method
		final String method_name = getMethodName(javaElement);
		final JavaMethodReturnType returnType = computeExpectedMethodReturnType(javaElement);
		JavaMethodData javaMethodData = null;
		if (returnType != JavaMethodReturnType.Unknown) 
		{
			javaMethodData = new JavaMethodData(method_name, returnType);
			
			// Initializing the Java method parameters
			/*** Adding Parameters to the JavaMethod
			 * JavaMethod parameters depend on the context wherein the JavaElement is created
			 * If in a condition      --> - eObject   : EObject 				  (the current semantic object)
			 * 							  - view      : EObject 				  (the current view)
			 * 							  - container : EObject 				  (the semantic container of the current object)
			 * if in Label Expression --> - eObject   : EObject 				  (the current semantic object)
			 * 							  - diagram   : Viewpoint.DDiagram 		  (the current DSemanticdiagram)
			 * 							  - view      : Viewpoint.DDiagramElement (the current View for witch the label is calculated)
			 * if in an Histogram     --> - eObject   : EObject 				  (the current semantic object)
			 */

			javaMethodData.addMethodParameter("eObject", "EObject", "the current semantic object");

			EObject javaElementParent = javaElement.eContainer();
			final EClass javaElementParentEClass = javaElementParent.eClass();
			
			if (javaElementParentEClass.equals(VpdiagramPackage.eINSTANCE.getCondition()))
			{
				javaMethodData.addMethodParameter("view", "EObject", "the current view");
				javaMethodData.addMethodParameter("container", "EObject", "the semantic container of the current object");
			}
			
			if (javaElementParentEClass.equals(ExpressionPackage.eINSTANCE.getExpression()))
			{
				javaMethodData.addMethodParameter("diagram", "DDiagram", "the current DSemanticdiagram");
				javaMethodData.addMethodParameter("view", "DDiagramElement", "the current View for witch the label is calculated");
			}
			
			if (javaElementParentEClass.equals(VpstylecustomizationPackage.eINSTANCE.getCustomizationExpression()))
			{
				javaMethodData.addMethodParameter("view", "DDiagramElement", "the current View");
				javaMethodData.addMethodParameter("container", "EObject", "the semantic container");
			}
		}
		
		return javaMethodData;
	}
	
	/**
	 * Compute the Java method name from the one provided by end user in the {@link ExpressionPackage#JAVA_ELEMENT__METHOD} attribute.
	 * @param javaElement the {@link JavaElement}
	 * @return Java method name
	 */
	private static String getMethodName(JavaElement javaElement){
		String method_name = javaElement.getMethod();
		String twoLastChars = method_name.substring(method_name.length() - 2, method_name.length());
		if (twoLastChars.equals("()"))
			method_name = method_name.substring(0, method_name.length() - 2);
		
		return method_name;
	}
	
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
		final EClass eClass = eObject.eClass();
		if (eClass.equals(VpdiagramPackage.eINSTANCE.getHistogramSection())
				|| eClass.equals(ExpressionPackage.eINSTANCE.getExpression()))
		{
			jeRootContainer = eObject.eContainer().eContainer().eContainer();
		}
		
		if (eClass.equals(VpdiagramPackage.eINSTANCE.getCondition()))
		{
			jeRootContainer = eObject.eContainer().eContainer();
		}
		
		if (eClass.equals(VpstylecustomizationPackage.eINSTANCE.getCustomizationExpression()))
		{
			jeRootContainer = eObject;
		}
		return jeRootContainer;
	}
	
	public static String getJavaElementContainerKind(JavaElement javaElement){
		String type = "defaultpackage";
		EObject jeRootContainer = getJavaElementContainer(javaElement);
		if (jeRootContainer != null)
		{
			if (jeRootContainer instanceof AbstractEdge)
				type = "edges";
			
			if (jeRootContainer instanceof AbstractNode)
				type = "nodes";
			
			if (jeRootContainer instanceof CustomizationExpression)
				type = "customizations";
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
			
			if (jeRootContainer instanceof CustomizationExpression)
			{
				EObject aParent = jeRootContainer.eContainer();
				while (aParent instanceof StyleCustomizationDescriptions == false)
				{
					aParent = aParent.eContainer();
				}
				
				if (aParent instanceof StyleCustomizationDescriptions)
					return ((StyleCustomizationDescriptions)aParent).getName() + "StyleCustomization";
				else
					return "StyleCustomization";
			}
		}
		
		return name;
	}
}

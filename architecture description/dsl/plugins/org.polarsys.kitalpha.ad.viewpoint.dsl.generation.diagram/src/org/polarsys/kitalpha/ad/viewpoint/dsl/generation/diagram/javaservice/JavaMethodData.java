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

package org.polarsys.kitalpha.ad.viewpoint.dsl.generation.diagram.javaservice;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Boubekeur Zendagui
 */

public class JavaMethodData{
	private String name;
	private JavaMethodReturnType returnType;
	// a map container a set of <parameter name, parameter type>
	private List<MethodParameterData> methodParameter = new ArrayList<MethodParameterData>();
	private String methodCode;
	private List<String> requiredClassesFQN = new ArrayList<String>();
	
	public enum JavaMethodReturnType {
		Unknown,
		ConstructorType,
		Integer,
		String, 
		Boolean, 
		EObject, 
		EObjectList,
		EEnumLiteral; 
	}
	
	public JavaMethodData(String methodName, JavaMethodReturnType methodReturnType) {
		this.name = methodName;
		this.returnType = methodReturnType;
	}
	
	public JavaMethodData(String methodName, JavaMethodReturnType methodReturnType, String methodCode) {
		this.name = methodName;
		this.returnType = methodReturnType;
		this.methodCode = methodCode;
	}
	
	public List<MethodParameterData> getMethodParameter(){
		return methodParameter;
	}
	
	public void addMethodParameter(String name, String type, String documentation){
		boolean exist = false;
		for (MethodParameterData iMethodParameterData : methodParameter) 
		{
			if (iMethodParameterData.getName().equalsIgnoreCase(name)){
				exist = true;
				break;
			}
		}
		
		if (! exist)
		{
			methodParameter.add(new MethodParameterData(name, type, documentation));
		}
		else
		{
			// TODO: throw an exception
		}
	}
	
	public String getName() {
		return name;
	}
	
	public JavaMethodReturnType getReturnType() {
		return returnType;
	}
	
	public String getMethodCode() {
		return methodCode;
	}

	public List<String> getRequiredClassesFQN() {
		return requiredClassesFQN;
	}

	public boolean equals(String name, JavaMethodReturnType returnType) {
		return this.name.equalsIgnoreCase(name)
					&& this.returnType.equals(returnType);
	}
	
	public boolean isSignatureEquals(JavaMethodData method){
		List<MethodParameterData> foreignParameters = method.getMethodParameter();
		boolean result = true;
		if ( this.getMethodParameter().size() == foreignParameters.size())
		{
			for (int i = 0; i < this.getMethodParameter().size(); i++) 
				if ( ! this.getMethodParameter().get(i).equals(foreignParameters.get(i)))
					result = false;
		}
		
		return result;
	}
	
	@Override
	public boolean equals(Object arg0) {
		if (arg0 instanceof JavaMethodData)
		{
			JavaMethodData foreignJavaMethodData = (JavaMethodData) arg0;
			String foreignName = foreignJavaMethodData.getName();
			JavaMethodReturnType foreignReturnType = foreignJavaMethodData.getReturnType();
			
			// Check if the two methods shares the same name and return type
			if (this.name.equalsIgnoreCase(foreignName.toLowerCase()) &&
				isSignatureEquals(foreignJavaMethodData) &&
				this.returnType.equals(foreignReturnType))
			{
				return true;
			}
			
			if (this.name.equalsIgnoreCase(foreignName) &&
				isSignatureEquals(foreignJavaMethodData) &&
				! this.returnType.equals(foreignReturnType))
			{
				try {
					throw new JavaServiceGenerationException(JavaServiceGenerationException.Method_ReturnType);
				} catch (JavaServiceGenerationException e) {
					e.printStackTrace();
				}
			}
			
			return false;
		}
		return super.equals(arg0);
	}
}

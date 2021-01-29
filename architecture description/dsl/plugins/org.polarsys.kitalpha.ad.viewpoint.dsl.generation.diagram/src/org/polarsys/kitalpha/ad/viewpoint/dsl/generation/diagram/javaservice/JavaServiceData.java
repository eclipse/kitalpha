/*******************************************************************************
 * Copyright (c) 2014-2020 Thales Global Services S.A.S.
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

import org.eclipse.emf.ecore.EObject;
import org.polarsys.kitalpha.ad.viewpoint.dsl.generation.diagram.javaservice.JavaMethodData.JavaMethodReturnType;

/**
 * @author Boubekeur Zendagui
 */

public class JavaServiceData {
	private String packageName;
	private String className;
	private List<JavaMethodData> methods = new ArrayList<JavaMethodData>();
	
	/**
	 * The context define the Mapping used to generate the Java service. It can be an Edge, Container, Node or BorderedNode
	 * Some times, there is more then one model element that contribute to the Java Service. The context is one model element 
	 * that trigger generation of the Java Service java file. 
	 * */
	private EObject context;
	
	public JavaServiceData(String pack, String clazz){
		packageName = pack;
		className = clazz;
	}
	
	public JavaServiceData(String name){
		String[] nameElement = name.split("\\.");
		
		packageName = nameElement[0];
		className = nameElement[nameElement.length-1];
		
		for (int i = 1; i < nameElement.length-1; i++) 
		{
			packageName = packageName+ "." + nameElement[i];
		}
	}
	
	/**
	 * Collects all classes FQN required by all Java service methods.
	 * @return a {@link List} of java classes fully qualified names 
	 */
	public List<String> getAllRequiredClassesFQN(){
		List<String> result = new ArrayList<String>(); 
		for (JavaMethodData javaMethodData : methods) 
		{
			final List<String> requiredClassesFQN = javaMethodData.getRequiredClassesFQN();
			for (String classFQN : requiredClassesFQN) 
			{
				if (! result.contains(classFQN))
				{
					result.add(classFQN);
				}
			}
		}
		return result;
	}
	
	public void addMethod(String methodName, JavaMethodReturnType methodReturnType){
		JavaMethodData methodData = new JavaMethodData(methodName, methodReturnType);
		addMethod(methodData);
	}
	
	public void addMethod(JavaMethodData methodData){
		if (! isAvailable(methodData))
		{
			methods.add(methodData);
		}
	}
	
	public boolean isAvailable(JavaMethodData methodData){
		for (JavaMethodData iJavaMethodData : methods) 
		{
			if (iJavaMethodData.equals(methodData))
			{
				return true;
			}
		}
		return false;
	}
	
	public EObject getContext() {
		return context;
	}

	public void setContext(EObject context) {
		if (this.context == null || this.context != context)
		{
			this.context = context;
		}
		else
		{
			// TODO : Throw an exception
		}
	}
	
	public String getPackageName() {
		return packageName;
	}

	public String getClassName() {
		return className;
	}

	public List<JavaMethodData> getMethods() {
		return methods;
	}
	
	@Override
	public int hashCode() {
		return super.hashCode();
	}
	
	@Override
	public boolean equals(Object arg0) {
		if (arg0 instanceof JavaServiceData)
		{
			JavaServiceData foreignJavaServiceData = (JavaServiceData) arg0;
			String foreignPackage = foreignJavaServiceData.getPackageName();
			String foreignClass = foreignJavaServiceData.getClassName();
			List<JavaMethodData> foreignMethods = foreignJavaServiceData.getMethods();
			
			if (this.packageName.equals(foreignPackage.toLowerCase()) 
					|| this.className.equals(foreignClass.toLowerCase()))
			{
				return false;
			}

			if (this.methods.size() != foreignMethods.size())
			{
				return false;
			}

			for (JavaMethodData iMethod : this.methods) 
			{
				boolean found = false;
				for (JavaMethodData jMethod : foreignMethods) 
				{
					if (iMethod.equals(jMethod))
					{
						found = true;
					}
				}

				if (!found)
				{
					return false;
				}
			}

			return true;
		}
		
		return super.equals(arg0);
	}
}

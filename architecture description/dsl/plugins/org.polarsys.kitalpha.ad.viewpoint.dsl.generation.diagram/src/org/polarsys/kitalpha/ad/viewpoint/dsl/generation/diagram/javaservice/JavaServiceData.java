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

package org.polarsys.kitalpha.ad.viewpoint.dsl.generation.diagram.javaservice;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.polarsys.kitalpha.ad.viewpoint.dsl.generation.diagram.javaservice.JavaMethodData.JavaMethodReturnType;

/**
 * @author Boubekeur Zendagui
 */

public class JavaServiceData {
	private String PackageName;
	private String ClassName;
	private List<JavaMethodData> Methods = new ArrayList<JavaMethodData>();
	
	/**
	 * The context define the Mapping used to generate the Java service. It can be an Edge, Container, Node or BorderedNode
	 * Some times, there is more then one model element that contribute to the Java Service. The context is one model element 
	 * that trigger generation of the Java Service java file. 
	 * */
	private EObject _context;
	
	public JavaServiceData(String pack, String clazz){
		PackageName = pack;
		ClassName = clazz;
	}
	
	public JavaServiceData(String name){
		String[] nameElement = name.split("\\.");
		
		PackageName = nameElement[0];
		ClassName = nameElement[nameElement.length-1];
		
		for (int i = 1; i < nameElement.length-1; i++) 
			PackageName = PackageName+ "." + nameElement[i];
	}
	
	public void addMethod(JavaMethodData methodData){
		for (JavaMethodData iJavaMethodData : Methods) 
			if (iJavaMethodData.equals(methodData))
				return;
			
		Methods.add(methodData);
	}
	
	public void addMethod(String method_name, JavaMethodReturnType method_return_type){
		JavaMethodData methodData = new JavaMethodData(method_name, method_return_type);
		
		for (JavaMethodData iJavaMethodData : Methods) 
			if (iJavaMethodData.equals(methodData))
				return;
			
		Methods.add(methodData);
	}
	
	public EObject getContext() {
		return _context;
	}

	public void setContext(EObject context) {
		if (this._context == null || this._context != context)
		{
			this._context = context;
		}
		else
		{
			// TODO : Throw an exception
		}
		
	}
	
	public String getPackageName() {
		return PackageName;
	}

	public String getClassName() {
		return ClassName;
	}

	public List<JavaMethodData> getMethods() {
		return Methods;
	}
	
	@Override
	public boolean equals(Object arg0) {
		if (arg0 instanceof JavaServiceData){
			JavaServiceData foreignJavaServiceData = (JavaServiceData) arg0;
			String foreignPackage = foreignJavaServiceData.getPackageName();
			String foreignClass = foreignJavaServiceData.getClassName();
			List<JavaMethodData> foreignMethods = foreignJavaServiceData.getMethods();
			
			if (this.PackageName != foreignPackage.toLowerCase() 
					|| this.ClassName != foreignClass.toLowerCase()){
				return false;
			}

			if (this.Methods.size() != foreignMethods.size())
				return false;

			for (JavaMethodData iMethod : this.Methods) 
			{
				boolean found = false;

				for (JavaMethodData jMethod : foreignMethods) 
					if (iMethod.equals(jMethod))
						found = true;

				if (!found)
					return false;
			}

			return true;
		}
		
		return super.equals(arg0);
	}
}

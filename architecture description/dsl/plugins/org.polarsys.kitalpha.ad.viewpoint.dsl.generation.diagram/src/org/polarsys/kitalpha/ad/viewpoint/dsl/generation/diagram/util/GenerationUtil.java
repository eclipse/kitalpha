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

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.sirius.viewpoint.description.SystemColor;
import org.eclipse.sirius.viewpoint.description.SystemColors;
import org.eclipse.sirius.viewpoint.description.SytemColorsPalette;
import org.polarsys.kitalpha.ad.viewpoint.dsl.generation.diagram.javaservice.JavaServiceData;

/**
 * @author Boubekeur Zendagui
 */

public class GenerationUtil {

	private static Map<EObject, EObject> generationObjectsMap = new HashMap<EObject, EObject>();
	private static List<JavaServiceData> javaServiceToGenerate = new ArrayList<JavaServiceData>();
	private static SytemColorsPalette systemColorsPalette = null;
	
	public static void clear(){
		generationObjectsMap.clear();
		javaServiceToGenerate.clear();
		systemColorsPalette = null;
	}
	
	/***
	 *  DoReMi System colors section 
	 **/
	
	public static void setSytemColorsPalette(SytemColorsPalette sysColorsPalette){
		systemColorsPalette = sysColorsPalette;
	}
	
	public static SytemColorsPalette getSytemColorsPalette(){
		return systemColorsPalette;
	}
	
	public static SystemColor getSystemColor(SystemColors color){
		for (SystemColor iSystemColor : systemColorsPalette.getEntries()) 
			if (iSystemColor.getName().equals(color.getName()))
				return iSystemColor;
		
		return null;
	}
	
	/***
	 *  Mapping between VPDiagram Element and generated DoReMi element
	 **/
	
	public static void addObjectMapping(EObject vpElement, EObject doremiElement){
		if (vpElement == null || doremiElement == null)
		{
			// Throw an exception
		}

		if (! generationObjectsMap.containsKey(vpElement))
		{
			generationObjectsMap.put(vpElement, doremiElement);
		}
		else
		{
			// Throw an exception of existing element OR do nothing !!!??
		}
	}
	
	public static EObject getDoremiElement(EObject vpElement){
		return generationObjectsMap.get(vpElement);
	}
	
	/***
	 *  DoReMi Java services section
	 **/
	
	public static JavaServiceData getJavaServiceDataFor(EObject eObject){
		for (JavaServiceData iJavaServiceData : javaServiceToGenerate) 
		{
			if (iJavaServiceData.getContext().equals(eObject))
			{
				return iJavaServiceData;
			}
		}
		return null;
	}
	
	public static List<JavaServiceData> getAllJavaServiceData(){
		return javaServiceToGenerate;
	}
	
	public static JavaServiceData getJavaServiceData(String name){
		/**
		 * - Extract Package name and Class name from the service name
		 */
		String[] nameElement = name.split("\\.");
		String _PackageName = nameElement[0];
		String _ClassName = nameElement[nameElement.length-1];
		for (int i = 1; i < nameElement.length-1; i++) 
			_PackageName = _PackageName+ "." + nameElement[i];
		
		/**
		 * - Check if there is a service in "javaServiceToGenerate" which PackageName and ClassName 
		 *   properties values are equal to _PackageName and _ClassName.
		 * - If the service if found, then return it
		 */

		for (JavaServiceData iJavaServiceData : javaServiceToGenerate) {
			if (iJavaServiceData.getPackageName().toLowerCase().equals(_PackageName.toLowerCase())
					&& iJavaServiceData.getClassName().toLowerCase().equals(_ClassName.toLowerCase()))
			{
				return iJavaServiceData;
			}
		}
		/**
		 * - If the service is not found then create a new one, add it to the 
		 *   "javaServiceToGenerate" List and return it
		 */
		JavaServiceData javaService = new JavaServiceData(_PackageName, _ClassName);
		addJavaService(javaService);
		
		return javaService;
	}
	
	protected static void addJavaService(JavaServiceData javaService){
		// Check if the JavaService wasn't added to the "javaServiceToGenerate" List yet
		boolean addJavaService = true;
		for (JavaServiceData iJavaServiceData : javaServiceToGenerate) 
			if (iJavaServiceData.equals(javaService))
				addJavaService = false;
		
		// Add the JavaServiceData in the list if it is not added yet
		if (addJavaService)
			javaServiceToGenerate.add(javaService);
	}

}



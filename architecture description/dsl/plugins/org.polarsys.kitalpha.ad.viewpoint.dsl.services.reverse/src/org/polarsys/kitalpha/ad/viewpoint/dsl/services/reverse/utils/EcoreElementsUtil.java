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

package org.polarsys.kitalpha.ad.viewpoint.dsl.services.reverse.utils;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EPackageRegistryImpl;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * @author Boubekeur Zendagui
 */

public class EcoreElementsUtil {
	
	private static final EPackage.Registry REGISTRY = new EPackageRegistryImpl(EPackage.Registry.INSTANCE);
	
	public static EClass transformEClassToNsUriEClass(EClass element){
		EClass result = element;
		Resource resource = null;
		if (element.eIsProxy())
		{	
			// FIXME : handle proxy element
			// Since we use a TargetPlatformResourceSet, the proxy element are resolved automatically !!!
		}
		else
		{
			resource = element.eResource();
		}
		
		if ( resource.getURI().isPlatform() )
		{
			if (resource.getContents() != null && resource.getContents().size() > 0)
			{
				EObject rootElement = resource.getContents().get(0);
				if (rootElement instanceof EPackage )
				{
					String nsUri = ((EPackage) rootElement).getNsURI();
					URI packNsURI  = URI.createURI(nsUri);
					if (! REGISTRY.containsKey(nsUri))
					{
						REGISTRY.put(nsUri, rootElement);
					}
					
					EPackage nsuriRootElement = REGISTRY.getEPackage(packNsURI.toString());
					result = (EClass) lookForEClassifier(nsuriRootElement, element.getName());
				}
			}
		}
		
		return result;
	}
	
	public static EDataType transformEDataTypeToNsUriEDataType(EDataType element){
		EDataType result = element;
		Resource resource = null;
		if (element.eIsProxy())
		{	
			// FIXME : handle proxy element
			// Since we use a TargetPlatformResourceSet, the proxy element are resolved automatically !!!
		}
		else
		{
			resource = element.eResource();
		}
		
		if ( resource.getURI().isPlatform() )
		{
			if (resource.getContents() != null && resource.getContents().size() > 0)
			{
				EObject rootElement = resource.getContents().get(0);
				if (rootElement instanceof EPackage )
				{
					String nsUri = ((EPackage) rootElement).getNsURI();
					URI packNsURI  = URI.createURI(nsUri);
					if (! REGISTRY.containsKey(nsUri))
					{
						REGISTRY.put(nsUri, rootElement);
					}
					
					EPackage nsuriRootElement = REGISTRY.getEPackage(packNsURI.toString());
					result = (EDataType) lookForEClassifier(nsuriRootElement, element.getName());
				}
			}
		}
		
		return result;
	}
	
	public static EEnum transformEEnumToNsUriEEnum(EEnum element){
		EEnum result = element;
		Resource resource = null;
		if (element.eIsProxy())
		{	
			// FIXME : handle proxy element
			// Since we use a TargetPlatformResourceSet, the proxy element are resolved automatically !!!
		}
		else
		{
			resource = element.eResource();
		}
		
		if ( resource.getURI().isPlatform() )
		{
			if (resource.getContents() != null && resource.getContents().size() > 0)
			{
				EObject rootElement = resource.getContents().get(0);
				if (rootElement instanceof EPackage )
				{
					String nsUri = ((EPackage) rootElement).getNsURI();
					URI packNsURI  = URI.createURI(nsUri);
					if (! REGISTRY.containsKey(nsUri))
					{
						REGISTRY.put(nsUri, rootElement);
					}
					
					EPackage nsuriRootElement = REGISTRY.getEPackage(packNsURI.toString());
					result = (EEnum) lookForEClassifier(nsuriRootElement, element.getName());
				}
			}
		}
		
		return result;
	}
	
	private static EClassifier lookForEClassifier(EPackage ePackage, String name){
		// Try to get the classifier directly from the ePackage (parameter)
		EClassifier eClassifier = ePackage.getEClassifier(name);
		
		// If the EClassifier is not Found, then handle sub packages of ePackage (parameter)
		if (eClassifier == null)
		{
			for (EPackage iPackage : ePackage.getESubpackages()) 
			{
				eClassifier = lookForEClassifier(iPackage, name);
				if (eClassifier != null)
					break;
			}	
		}
		
		return eClassifier;
	}
	
	public static boolean areEClassesTheSame(EClass eClass1, EClass eClass2, Resource resource){
		if (eClass1.eIsProxy())
			eClass1 = (EClass) EcoreUtil.resolve(eClass1, resource);
		
		return ((eClass1 != null && eClass2 != null) &&
				(eClass1.getName().equals(eClass2.getName())))&& 
				(eClass1.getEPackage().getNsURI().equals(eClass2.getEPackage().getNsURI()) );
	}
	
}

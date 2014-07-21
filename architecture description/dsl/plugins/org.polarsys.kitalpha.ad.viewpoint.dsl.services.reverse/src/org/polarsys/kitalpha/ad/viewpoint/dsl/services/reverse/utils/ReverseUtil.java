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

package org.polarsys.kitalpha.ad.viewpoint.dsl.services.reverse.utils;

import java.util.ArrayList;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EPackageRegistryImpl;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.polarsys.kitalpha.ad.ta.extension.ITargetApplication;
import org.polarsys.kitalpha.ad.ta.extension.TargetApplicationExtensionManager;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.desc.helper.configuration.VpDslConfigurationHelper;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.Class;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.Viewpoint;
import org.polarsys.kitalpha.emde.model.ElementExtension;
import org.polarsys.kitalpha.emde.model.EmdePackage;

/**
 * @author Boubekeur Zendagui
 */

public class ReverseUtil {

	/**
	 * Return {@link URI} of a vpdesc model represented by an {@link IStructuredSelection} object 
	 * @param selection an {@link IStructuredSelection} object of the selected vpdesc resource
	 * @return {@link URI} of a vpdesc resource
	 */
	public static URI getDomainURI(IStructuredSelection selection){
		Object obj = selection.getFirstElement();
		if (obj instanceof IResource) 
		{
			IFile vpSpecFile = null;
			
			if (obj instanceof IFile)
				vpSpecFile = (IFile) obj;
		
			if (vpSpecFile != null && vpSpecFile.exists())
				return URI.createPlatformResourceURI(vpSpecFile.getFullPath().toString(), true);
		}
		
		return null;
	}
	
	/**
	 * Return a list of EPackages corresponding to NsUris list.
	 * @param nsUris a NsUri {@link List}
	 * @return a
	 */
	public static List<EPackage> getEPackagesByNsUri(List<String> nsUris){
		List<EPackage> result = new ArrayList<EPackage>();
		for (String nsUri : nsUris) 
		{
			EPackage ePackage = EPackageRegistryImpl.INSTANCE.getEPackage(nsUri);
			if (ePackage != null)
				result.add(ePackage);
//			else
//				throw new RuntimeException("There is no EPackage with nsuri = " + nsUri);
		}
		return result;
	}
	
	/**
	 * Return a list of EPackages corresponding to NsUris list.
	 * @param nsUris a NsUri {@link List}
	 * @return 
	 */
	public static List<EPackage> getEPackagesByNsUriRegex(List<String> nsUris){
		List<EPackage> result = new ArrayList<EPackage>();
		Set<Entry<String, Object>> entrySet = EPackageRegistryImpl.INSTANCE.entrySet();
		for (Entry<String, Object> entry : entrySet) 
		{
			String registryNsUri = entry.getKey();
			for (String nsUriRegex : nsUris) 
			{
				Pattern pattern = Pattern.compile(nsUriRegex);
			    Matcher matcher = pattern.matcher(registryNsUri);
				if (matcher.matches())
				{
					EPackage ePackage = null;
					if (entry.getValue() instanceof EPackage)
						ePackage = ((EPackage) entry.getValue());
					else
					{
						EPackage.Descriptor descriptor = (EPackage.Descriptor) entry.getValue();
						ePackage = descriptor.getEPackage();
					}

					if (ePackage != null)
						result.add(ePackage);
				}
			}
		}
		return result;
	}
	
	/**
	 * Check if an inheritance of a class is a generated one or not. Generated inheritance are :
	 * - Form {@link ElementExtension}
	 * - From target application basic semantic element
	 * @param vpClass The viewpoint class under reverse
	 * @param superClass it super class
	 * @param resource the resource of the EPackage produced by reverse process 
	 * @return True if the inheritance is a default one, false if inheritance is specified by user
	 */
	public static boolean isGeneratedInheritance(Class vpClass, EClass superClass, Resource resource) {
		// Check if the EClass in an EMDE EClass
		if (EcoreElementsUtil.areEClassesTheSame(superClass, EmdePackage.eINSTANCE.getElementExtension(), resource))
//		if (superClass.getEPackage().getNsURI().equals(EmdePackage.eINSTANCE.getNsURI()) 
//				&& superClass.getClassifierID() == EmdePackage.ELEMENT_EXTENSION)
			return true;
		
		// check if the EClass is a default semantic EClass of the target application 
		try 
		{
			Viewpoint viewpoint = (Viewpoint) EcoreUtil.getRootContainer(vpClass, true);
			String taName = VpDslConfigurationHelper.getTargetApplication(viewpoint);
			ITargetApplication targetApplication = TargetApplicationExtensionManager.getTargetApplicationClass(taName);
			List<EClass> defaultInheritanceList = targetApplication.getBasicSemanticElement();
			
			if (defaultInheritanceList != null && defaultInheritanceList.size() > 0)
				for (EClass defaultInheritance : defaultInheritanceList) 
					if (EcoreElementsUtil.areEClassesTheSame(superClass, defaultInheritance, resource))
						return true;
		} 
		catch (CoreException e) 
		{
			e.printStackTrace();
		} 
		
		return false;
	}
	
}

/*******************************************************************************
 * Copyright (c) 2014, 2018 Thales Global Services S.A.S.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 * 
 * SPDX-License-Identifier: EPL-2.0
 *  
 * Contributors:
 *   Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/

package org.polarsys.kitalpha.ad.viewpoint.dsl.generation.desc.util;

import java.io.IOException;
import java.security.InvalidParameterException;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.desc.helper.configuration.VpDslConfigurationHelper;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.desc.helper.desc.CoreModelHelper;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.Viewpoint;
import org.polarsys.kitalpha.ad.viewpoint.dsl.generation.common.manager.VpdslDescriptionModelManager;

/**
 * @author Boubekeur Zendagui
 */

public class ECoreResourceManager {
	
	enum EcoreGenerationstate {Generate, DoNotGenerate, Unknown}
	
	public static ECoreResourceManager INSTANCE = new ECoreResourceManager();
	private Resource eCoreResource = null;
	private EPackage ePackage = null;
	private ECoreFileInformation eCoreFileInformation = null;
	private EcoreGenerationstate ecoreGenerationstate = EcoreGenerationstate.Unknown;
	
	/**
	 * Allows to know if the ecore model is to generate or not. 
	 * Ecore model is generated in the following cases :
	 * 1- It not exists 
	 * 2- if OverwriteEcore configuration property is set to True.
	 * 
	 * If OverwriteEcore configuration property is set to False, then the ecore 
	 * generated will be forced if it not exists
	 * 
	 * @param load try load an existing ecore model if it exists
	 * @return True to generate ecore model, false else.
	 * @throws Exception 
	 */
	public boolean generateEcoreModel(boolean load) throws Exception{
		if (! ecoreGenerationstate.equals(EcoreGenerationstate.Unknown))
		{ 
			return ecoreGenerationstate.equals(EcoreGenerationstate.Generate);
		}
		else
		{
			// Get the current viewpoint 
			final Viewpoint viewpoint = VpdslDescriptionModelManager.INSTANCE.getVpDescriptionElement();
			
			// Get information to localize ecore model
			final String shortName = CoreModelHelper.getViewpointShortName(viewpoint); 
			final String rootProjectName =  VpDslConfigurationHelper.getRootProjectName(viewpoint);
			
			eCoreFileInformation = new ECoreFileInformation(rootProjectName, "models", shortName);
			if (eCoreFileInformation.EcoreFileExist())
			{
				if (! areResourcesInitialized()) {
					ECoreResourceManager.INSTANCE.loadECoreResource(eCoreFileInformation);
				}
				
				// Get the value of ecore overwrite configuration property
				boolean overwriteEcore = VpDslConfigurationHelper.getOverwriteEcore(viewpoint);
				ecoreGenerationstate = (overwriteEcore ? EcoreGenerationstate.Generate : EcoreGenerationstate.DoNotGenerate);
				return overwriteEcore;
			}
			else
			{
				ecoreGenerationstate = EcoreGenerationstate.Generate;
				return true;
			}
		}
	}
	
	public EPackage getEPackage() {
		return ePackage;
	}
	
	public Resource getEcoreResource() {
		return eCoreResource;
	}
	
	public ECoreFileInformation getECoreFileInformation(){
		return eCoreFileInformation;
	}
	
	public boolean areResourcesInitialized(){
		return (eCoreResource != null && ePackage != null ) ? true : false;
	}
	
	public void loadECoreResource(ECoreFileInformation arg) throws Exception{
		if (arg != null)
		{
			URI uri = arg.getEcorePlatformResourceURI();
			ResourceSet rSet = new ResourceSetImpl();
			eCoreResource = rSet.getResource(uri, true);
			ePackage = (EPackage)eCoreResource.getContents().get(0);
		}
		else
		{
			throw new InvalidParameterException("ECoreFileInformation parameter must be not null");
		}
	}
	
	public void initECoreResource(){
		eCoreResource = null;
		ePackage = null;
		ecoreGenerationstate = EcoreGenerationstate.Unknown;
	}
	
	public void saveModel(){
		final Map<Object, Object> saveOptions = new HashMap<Object, Object>();
		saveOptions.put(Resource.OPTION_SAVE_ONLY_IF_CHANGED, Resource.OPTION_SAVE_ONLY_IF_CHANGED_MEMORY_BUFFER);
		if (eCoreResource != null)
		{
			try
			{
				eCoreResource.save(saveOptions);
			}
			catch (IOException e) 
			{
				e.printStackTrace();
			}
		}
	}

}

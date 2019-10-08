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

package org.polarsys.kitalpha.ad.af.dsl.generation.desc.internal;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.eclipse.egf.core.producer.InvocationException;
import org.eclipse.emf.common.command.BasicCommandStack;
import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.command.CompoundCommand;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.edit.command.AddCommand;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.polarsys.kitalpha.ad.af.coredomain.af.model.AF;
import org.polarsys.kitalpha.ad.af.coredomain.af.model.AfPackage;
import org.polarsys.kitalpha.ad.af.coredomain.af.model.util.AfAdapterFactory;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.desc.helper.configuration.VpDslConfigurationHelper;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.Viewpoint;
import org.polarsys.kitalpha.ad.viewpoint.dsl.generation.helper.viewpoint.PlatformViewpointHelper;

/**
 * @author Boubekeur Zendagui
 */

public class AFViewpointRegistrationManager {
	
	/**
	 * 
	 * @param afBundleID
	 * @param afModelFolder
	 * @param afModelName
	 * @param viewpoints
	 * @throws IOException
	 * @throws InvocationException
	 */
	public static void registerNewGeneratedViewpoint(String afBundleID, 
													 String afModelFolder,
													 String afModelName,													 
			 										 List<Viewpoint> viewpoints) 
	throws IOException, InvocationException{
		
		if (!afModelName.endsWith(Constants.AF_MODELS_EXTENSION)) {
			afModelName += Constants.AF_MODELS_EXTENSION;
		}
		
		String uris = "/"+afBundleID+"/"+afModelFolder+"/"+afModelName;
		registerNewGeneratedViewpoint(uris, viewpoints);
	}
	
	public static void registerNewGeneratedViewpoint(String afResourceStringUri, Viewpoint viewpoint)
	throws IOException, InvocationException{
		List<Viewpoint> vpList = new ArrayList<Viewpoint>();
		vpList.add(viewpoint);
		
		registerNewGeneratedViewpoint(afResourceStringUri, vpList);
	}

	/**
	 * 
	 * @param afResourceStringUri
	 * @param viewpoints
	 * @throws IOException
	 * @throws InvocationException
	 */
	public static void registerNewGeneratedViewpoint(String afResourceStringUri, 
													 List<Viewpoint> viewpoints) 
	throws IOException, InvocationException{
		AdapterFactoryEditingDomain domain = new AdapterFactoryEditingDomain(new AfAdapterFactory(), new BasicCommandStack());
		Resource resource = domain.createResource(afResourceStringUri);
		resource.load(null);
		EList<EObject> content = resource.getContents();
		if (content!= null && content.size() > 0)
		{
			EObject modelRootElement = content.get(0);
			if (modelRootElement instanceof AF)
			{
				final AF af = (AF) modelRootElement;
				EditingDomain editingDomain = AdapterFactoryEditingDomain.getEditingDomainFor(af);
				CompoundCommand allAddCommands = new CompoundCommand();
				
				for (Viewpoint viewpoint : viewpoints) 
				{
					EObject afViewpoint = getAFViewpoint(viewpoint, resource.getResourceSet());
					if (afViewpoint != null)
					{
						Command  addCommand = AddCommand.create(editingDomain, af, AfPackage.eINSTANCE.getAF_Viewpoints() , afViewpoint);
						allAddCommands.append(addCommand);
					}
					else
					{
						throw new InvocationException("Unable to locate core domain Viewpoint");
					}
				}
				editingDomain.getCommandStack().execute(allAddCommands);
			}
		}
		resource.save(Collections.EMPTY_MAP);
		resource.unload();
	}
	
	/**
	 * 
	 * @param viewpoint
	 * @param resourceSet
	 * @return
	 */
	public static org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.Viewpoint getAFViewpoint(Viewpoint viewpoint, ResourceSet resourceSet){
		String viewpointID = VpDslConfigurationHelper.getRootProjectName(viewpoint);
		return PlatformViewpointHelper.getAFViewpoint(viewpointID, resourceSet);
	}
	
	public static org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.Viewpoint getAFViewpoint(Viewpoint viewpoint){
		return getAFViewpoint(viewpoint, null);
	}
}

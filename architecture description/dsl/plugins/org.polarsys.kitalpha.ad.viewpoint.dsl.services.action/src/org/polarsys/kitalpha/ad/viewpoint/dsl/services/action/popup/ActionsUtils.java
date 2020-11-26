/*******************************************************************************
 * Copyright (c) 2014 Thales Global Services S.A.S.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 * 
 * SPDX-License-Identifier: EPL-2.0
 *  
 * Contributors:
 *   Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/

package org.polarsys.kitalpha.ad.viewpoint.dsl.services.action.popup;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.jface.viewers.IStructuredSelection;

import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpconf.Configuration;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpconf.ConfigurationElement;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpconf.GenerationConfiguration;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.Viewpoint;

/**
 * @author Boubekeur Zendagui
 */

public class ActionsUtils {

	public static URI getDomainURI(IStructuredSelection selection){
		Object obj = selection.getFirstElement();
		if (obj instanceof IResource) 
		{
			IFile vpSpecFile = null;
			if (obj instanceof IFile)
				vpSpecFile = (IFile) obj;
			
			return URI.createPlatformResourceURI(vpSpecFile.getFullPath().toString(), true);
		}
		return null;
	}
	
	public static String getShortName(URI model){
		if (model == null || model.toString().length() == 0)
			return null;
		
		ResourceSet rs = new ResourceSetImpl();
		Resource r = rs.getResource(model, true);
		Viewpoint vpDes = (Viewpoint) r.getContents().get(0);
		if (vpDes != null){
			String result = vpDes.getShortName();
			r.unload();
			r = null;
			rs = null;
			return result;
		}
		return null;
	}
	
	public static String getRootProjectName(URI model){
		if (model == null || model.toString().length() == 0)
			return null;
		
		ResourceSet rs = new ResourceSetImpl();
		Resource r = rs.getResource(model, true);
		Viewpoint vpDes = (Viewpoint) r.getContents().get(0);
		if (vpDes != null)
			for (EObject iObject : vpDes.getVP_Aspects()) 
				if (iObject instanceof Configuration){
					Configuration conf = (Configuration) iObject;
					for (ConfigurationElement iConfElement : conf.getVpConfigurationElements()) 
						if (iConfElement instanceof GenerationConfiguration){
							String result = ((GenerationConfiguration)iConfElement).getProjectName();
							r.unload();
							r = null;
							rs = null;
							return result;
						}
				}
		return null;
	}
}

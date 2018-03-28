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

package org.polarsys.kitalpha.ad.viewpoint.dsl.services.project.utils;

import java.io.IOException;
import java.util.Collections;
import java.util.List;

import org.eclipse.core.resources.IProject;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.desc.helper.project.IViewpointDescriptionConstants;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.Aspect;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.Data;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.Viewpoint;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.VpdescFactory;

/**
 * @author Boubekeur Zendagui
 */

public class VPDescModelManager {
	
	public static Viewpoint createVpsSpecModel(IProject project, 
											   String vpShortName, 
											   boolean save,
											   EObject child,
											   EObject extension) throws IOException{
		
		Viewpoint vpDescription = createVpsSpecModel(project, vpShortName, false);

		if (child != null )
			vpDescription.eContents().add(child);
		
		if (extension != null )
			vpDescription.getVP_Aspects().add((Aspect)extension);
		
		if (save)
			saveModel(project, vpDescription, vpShortName);
		
		return vpDescription;
	}
	
	public static Viewpoint createVpsSpecModel(IProject project, 
											   String vpShortName, 
											   boolean save,
											   List<EObject> children,
											   List<EObject> extensions) throws IOException{
		
		Viewpoint vpDescription = createVpsSpecModel(project, vpShortName, false);
		
		if (children != null && ! children.isEmpty())
		{
			for (EObject eObject : children)
				vpDescription.eContents().add(eObject);
		}
		
		if (extensions != null && ! extensions.isEmpty())
		{
			for (EObject eObject : extensions)
				vpDescription.getVP_Aspects().add((Aspect)eObject);
		}
		
		if (save)
			saveModel(project, vpDescription, vpShortName);
		
		return vpDescription;
	}
	
	public static Viewpoint createVpsSpecModel(IProject project, 
											   String vpShortName, 
											   boolean save) throws IOException{
		Viewpoint vpdescription = VpdescFactory.eINSTANCE.createViewpoint(); 
		Data data = VpdescFactory.eINSTANCE.createData();
		data.setName(vpShortName +".data");
		vpdescription.setVP_Data(data);
		vpdescription.setShortName(vpShortName);
		vpdescription.setName(vpShortName);
		if (save)
			saveModel(project, vpdescription, vpShortName);
		
		return vpdescription;
	}
	
	public static void saveModel(IProject project, EObject rootObject, String vpShortName) throws IOException{
		String vpURI = '/' + project.getName() 
						+ '/' + IViewpointDescriptionConstants.VP_DESC__MODEL_FOLDER_NAME + '/' 
						+ vpShortName + '.' + IViewpointDescriptionConstants.VP_DESC__FILE_EXTENSION;
		
		ResourceSet set = new ResourceSetImpl();
		URI uri = URI.createPlatformResourceURI(vpURI, false);
		Resource createResource = set.createResource(uri);
		createResource.getContents().add(rootObject);
		createResource.save(Collections.EMPTY_MAP);
	}

}

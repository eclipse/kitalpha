/*******************************************************************************
 * Copyright (c) 2014 Thales Global Services S.A.S.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *  Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/
package org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.contentassist;

import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.sirius.viewpoint.description.Group;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.diagram.helper.specification.CoreDomainViewpointDiagramHelper;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.AbstractResource;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.EMFResource;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.Viewpoint;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.ViewpointResources;
import org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.resources.ResourceHelper;


/**
 * @author Faycal Abka
 */
public class NsUriFinder {
	public static Set<String> getViewpointRepresentation(EObject model){
		Set<String> namesGroup = new HashSet<String>();
		Collection<Group> usedGroup = getUsedGroups(model); //By use viewpoints
		Collection<String> usedDiagramPlatformUri = getUsedDiagramPlatformUri(model);
		
		for (Group group : usedGroup) {
			if (group.eResource().getURI().isPlatformResource())
				namesGroup.add(URI.createPlatformResourceURI(group.eResource().getURI().toPlatformString(true), true).toString());
			
			if (group.eResource().getURI().isPlatformPlugin())
				namesGroup.add(URI.createPlatformPluginURI(group.eResource().getURI().toPlatformString(true), true).toString());
		}
		
		if (usedDiagramPlatformUri != null && !usedDiagramPlatformUri.isEmpty())
			namesGroup.addAll(usedDiagramPlatformUri);
		
		return namesGroup;
		
	}
	
	private static Collection<String> getUsedDiagramPlatformUri(EObject model) {
		
		Collection<String> usedDiagrams = new HashSet<String>();
		
		Viewpoint vp = getRootViewpoint(model);
		
		ViewpointResources vpr = vp.getViewpointResources();
		
		if (vpr != null){
			EList<AbstractResource> allUsedResources = vpr.getUseResource();
			
			for (AbstractResource abstractResource : allUsedResources) {
				if (abstractResource instanceof EMFResource){
					EMFResource emfResource = (EMFResource)abstractResource;
					String uri = emfResource.getUri();
					
					//FIXME see how to deal with this test helper to be shared between
					//		other classes
					if (uri.endsWith(".odesign")){	//$NON-NLS-1$
						usedDiagrams.add(uri);
					}
					
				}
			}
		}
		
		return usedDiagrams;
	}

	private static List<Group> getUsedGroups(EObject model){
		
		Viewpoint viewpoint = getRootViewpoint(model);
		
		List<Group> groupes = CoreDomainViewpointDiagramHelper.getViewpointAccessibleSiriusGroup(viewpoint);
		
		return groupes;
	}


	//FIXME put these 2 methods in an abstract class in common plugin to be shared by Data
	//		NsUriFinder too (they are duplicated!)
	private static Viewpoint getRootViewpoint(EObject model){

		String projectName = EcoreUtil.getURI(model).segment(1);
		Resource standaloneResource = ResourceHelper.loadStandaloneResource(projectName);
		Viewpoint viewpoint = getCurrentViewpoint(standaloneResource);

		return viewpoint;
	}


	private static Viewpoint getCurrentViewpoint(Resource standaloneResource) {
		
		TreeIterator<EObject> it = standaloneResource.getAllContents();
		
		while (it.hasNext()){
			EObject v = it.next();
			if (v instanceof Viewpoint)
				return (Viewpoint)v;
		}
		return null;
	}
}

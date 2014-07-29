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

import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.sirius.viewpoint.description.Group;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.diagram.helper.specification.CoreDomainViewpointDiagramHelper;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.Viewpoint;
import org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.resources.ResourceHelper;


/**
 * @author Faycal Abka
 */
public class NsUriFinder {
	public static Set<String> getViewpointRepresentation(EObject model){
		Set<String> namesGroup = new HashSet<String>();
		Collection<Group> usedGroup = getUsedGroups(model);
		
		for (Group group : usedGroup) {
			if (group.eResource().getURI().isPlatformResource())
				namesGroup.add(URI.createPlatformResourceURI(group.eResource().getURI().toPlatformString(true), true).toString());
			
			if (group.eResource().getURI().isPlatformPlugin())
				namesGroup.add(URI.createPlatformPluginURI(group.eResource().getURI().toPlatformString(true), true).toString());
		}
		
		return namesGroup;
		
	}
	
	private static List<Group> getUsedGroups(EObject model){
		
		String projectName = EcoreUtil.getURI(model).segment(1);
		Resource standaloneResource = ResourceHelper.loadStandaloneResource(projectName);
		Viewpoint viewpoint = getCurrentRepresentations(standaloneResource);
		
		List<Group> groupes = CoreDomainViewpointDiagramHelper.getViewpointAccessibleSiriusGroup(viewpoint);
		
		return groupes;
	}


	private static Viewpoint getCurrentRepresentations(Resource standaloneResource) {
		
		TreeIterator<EObject> it = standaloneResource.getAllContents();
		
		while (it.hasNext()){
			EObject v = it.next();
			if (v instanceof Viewpoint)
				return (Viewpoint)v;
		}
		return null;
	}
}

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

package org.polarsys.kitalpha.ad.viewpoint.dsl.as.diagram.helper.specification;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.sirius.viewpoint.description.Group;
import org.polarsys.kitalpha.ad.integration.sirius.model.SiriusRepresentation;
import org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.Representation;
import org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.RepresentationElement;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.desc.helper.configuration.VpDslConfigurationHelper;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.desc.helper.desc.CoreDomainViewpointHelper;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.Viewpoint;

/**
 * @author Boubekeur Zendagui
 */

public class CoreDomainViewpointDiagramHelper extends CoreDomainViewpointHelper {


	/**
	 * Retrieve all accessible Sirius groups for a given viewpoint by regarding is viewpoint uses.
	 * @param viewpoint
	 * @return
	 */
	public static List<Group> getViewpointAccessibleSiriusGroup(Viewpoint viewpoint){ 
		List<Group> result = new ArrayList<Group>();
		EList<Viewpoint> useViewpoint = viewpoint.getUseViewpoint();
		if (useViewpoint.isEmpty() == false)
		{
			for (Viewpoint iUsedViewpoint : useViewpoint) 
			{
				List<Group> viewpointSiriusGroup = getViewpointSiriusGroup(iUsedViewpoint);
				if (viewpointSiriusGroup.isEmpty() == false)
				{
					result.addAll(viewpointSiriusGroup);
				}
			}
		}
		
		return result;
	}
	
	/**
	 * Get a Sirius Group generated from a given Dsl Viewpoint
	 * @param viewpoint
	 * @return
	 */
	public static List<Group> getViewpointSiriusGroup(Viewpoint viewpoint){
		List<Group> result = new ArrayList<Group>();
		String rootProjectName = VpDslConfigurationHelper.getRootProjectName(viewpoint);
		org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.Viewpoint coreDomainViewpoint = getCoreDomainViewpoint(rootProjectName, null);
		if (coreDomainViewpoint != null)
		{
			Representation representation = coreDomainViewpoint.getRepresentation();
			if (representation != null)
			{
				if (representation.getRepresentations().isEmpty() == false)
				{
					for (RepresentationElement rElement : representation.getRepresentations()) 
					{
						if (rElement instanceof SiriusRepresentation)
						{
							Group group = ((SiriusRepresentation) rElement).getOdesign();
							if (group != null)
								result.add(group);
						}
					}
				}
			}
		}
		
		return result;
	}
}

/*******************************************************************************
 * Copyright (c) 2017 Thales Global Services S.A.S.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *  Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/
package org.polarsys.kitalpha.model.common.contrib.unknownreference.metadata;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.polarsys.kitalpha.ad.metadata.metadata.Metadata;
import org.polarsys.kitalpha.ad.metadata.metadata.ViewpointReference;
import org.polarsys.kitalpha.model.common.scrutiny.contrib.unknownreferences.feedback.Feedback;
import org.polarsys.kitalpha.model.common.scrutiny.interfaces.IFeedback.FeedbackLevel;
import org.polarsys.kitalpha.model.common.scrutiny.interfaces.IFeedback.IFeedbackMessage;
import org.polarsys.kitalpha.model.common.scrutiny.interfaces.IScrutinize;
import org.polarsys.kitalpha.resourcereuse.helper.ResourceHelper;
import org.polarsys.kitalpha.resourcereuse.helper.ResourceNotFoundException;
import org.polarsys.kitalpha.resourcereuse.helper.ResourceReuse;

/**
 * 
 * @author Faycal Abka
 *
 */
public class MetadataUnknownReferencedViewpoint implements IScrutinize<Set<ViewpointReference>, Collection<IFeedbackMessage>> {

	private Set<ViewpointReference> unusedViewpoints = new HashSet<ViewpointReference>();
	private final ResourceHelper resourceReuseHelper = ResourceReuse.createHelper();
	
	public MetadataUnknownReferencedViewpoint() {
	}

	@Override
	public void findIn(EObject arg0) {
		

	}

	@Override
	public void findIn(Resource resource) {
		if (!resource.getContents().isEmpty() && resource.getContents().get(0) instanceof Metadata) {
			  Metadata root = (Metadata) resource.getContents().get(0);
			  for (ViewpointReference uv : root.getViewpointReferences()) {
				  try {
					  resourceReuseHelper.getResource(uv.getVpId()); //Check if the viewpoint is installed
					  //Do nothing. The viewpoint is installed
				  } catch (ResourceNotFoundException e){
					  unusedViewpoints.add(uv); //This means that the viewpoint is not installed.
				  }
			  }
		  }
	}

	@Override
	public Set<ViewpointReference> getAnalysisResult() {
		return unusedViewpoints;
	}

	@Override
	public Collection<IFeedbackMessage> getFeedbackAnalysisMessages() {
		Feedback feedback = new Feedback();
		for (ViewpointReference vr: unusedViewpoints){
			feedback.addFeedbackMessage(new Feedback.FeedbackMessage(FeedbackLevel.ERROR, "Uninstalled viewpoint: " + vr.getVpId())); //$NON-NLS-1$
		}
		return feedback.getFeedbackMessages();
	}

}

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
package org.polarsys.kitalpha.model.common.scrutiny.contrib.unknownreferences.scrutinizes;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.sirius.viewpoint.DRepresentationContainer;
import org.polarsys.kitalpha.model.common.scrutiny.contrib.unknownreferences.Messages;
import org.polarsys.kitalpha.model.common.scrutiny.contrib.unknownreferences.feedback.Feedback;
import org.polarsys.kitalpha.model.common.scrutiny.interfaces.IFeedback.FeedbackLevel;
import org.polarsys.kitalpha.model.common.scrutiny.interfaces.IFeedback.IFeedbackMessage;
import org.polarsys.kitalpha.model.common.scrutiny.interfaces.IScrutinize;

/**
 * @author Matthieu Helleboid
 */
public class InvalidDRepresentationContainer implements IScrutinize<Set<DRepresentationContainer>, Collection<IFeedbackMessage>> {

	
	private Set<DRepresentationContainer> representationContainers;
	
	public InvalidDRepresentationContainer() {
		this.representationContainers = new HashSet<DRepresentationContainer>();
	}
	
	@Override
	public void findIn(EObject eObject) {
		if (eObject instanceof DRepresentationContainer) {
			DRepresentationContainer dRepresentationContainer = (DRepresentationContainer) eObject;
			if (dRepresentationContainer.getViewpoint() == null || dRepresentationContainer.getViewpoint().eIsProxy()){
				representationContainers.add(dRepresentationContainer);
			}
		}
	}

	@Override
	public void findIn(Resource resource){
	}

	@Override
	public Set<DRepresentationContainer> getAnalysisResult() {
		return this.representationContainers;
	}

	@Override
	public Collection<IFeedbackMessage> getFeedbackAnalysisMessages() {
		Feedback feedback = new Feedback();
		
		for (DRepresentationContainer representationContainer : getAnalysisResult()) {
			String message = Messages.MISSING_SIRIUS_VIEWPOINT;
			if (representationContainer.getViewpoint() != null){
				message = message + Feedback.getProxyURI(representationContainer.getViewpoint());
			}
			IFeedbackMessage feedbackMessage = new Feedback.FeedbackMessage(FeedbackLevel.WARNING, message);
			feedback.addFeedbackMessage(feedbackMessage);
		}
		return feedback.getFeedbackMessages();
	}

}

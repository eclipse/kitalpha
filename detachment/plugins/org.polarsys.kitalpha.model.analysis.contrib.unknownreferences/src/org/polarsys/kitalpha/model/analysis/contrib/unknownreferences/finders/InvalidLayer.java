/*******************************************************************************
 * Copyright (c) 2013 THALES GLOBAL SERVICES.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    THALES GLOBAL SERVICES - Initial API and implementation
 *******************************************************************************/

package org.polarsys.kitalpha.model.analysis.contrib.unknownreferences.finders;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.sirius.diagram.description.Layer;
import org.polarsys.kitalpha.model.analysis.contrib.unknownreferences.Messages;
import org.polarsys.kitalpha.model.analysis.contrib.unknownreferences.feedback.Feedback;
import org.polarsys.kitalpha.model.analysis.interfaces.IFeedback.FeedbackLevel;
import org.polarsys.kitalpha.model.analysis.interfaces.IFeedback.IFeedbackMessage;
import org.polarsys.kitalpha.model.analysis.interfaces.IFinder;

/**
 * @author Matthieu Helleboid
 */
public class InvalidLayer implements IFinder<Set<Layer>, Collection<IFeedbackMessage>> {
	
	private Set<Layer> layers;

	public InvalidLayer() {
		this.layers = new HashSet<Layer>();
	}

	@Override
	public void findIn(EObject eObject) {
		if (eObject instanceof Layer) {
			Layer layer = (Layer) eObject;
			if (layer.eIsProxy()){
				layers.add(layer);
			}
			
		}
	}

	@Override
	public void findIn(Resource resource) {
		//Do nothing
	}

	@Override
	public Set<Layer> getAnalysisResult() {
		return this.layers;
	}

	@Override
	public Collection<IFeedbackMessage> getFeedbackAnalysisMessages() {
		Feedback feedback = new Feedback();

		for (Layer layer : getAnalysisResult()) {
			String message = Messages.INVALID_SIRIUS_LAYER;
			message = message + Feedback.getRepresentationName(layer);
			message = message + Feedback.getProxyURI(layer);
			IFeedbackMessage feedbackMessage = new Feedback.FeedbackMessage(FeedbackLevel.ERROR, message);
			feedback.addFeedbackMessage(feedbackMessage);
		}
		return feedback.getFeedbackMessages();
	}

}

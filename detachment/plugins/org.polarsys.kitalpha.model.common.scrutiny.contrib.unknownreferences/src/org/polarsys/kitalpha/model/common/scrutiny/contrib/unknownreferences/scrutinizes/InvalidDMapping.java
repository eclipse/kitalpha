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
import org.eclipse.sirius.viewpoint.DRepresentationElement;
import org.polarsys.kitalpha.model.common.scrutiny.contrib.unknownreferences.Messages;
import org.polarsys.kitalpha.model.common.scrutiny.contrib.unknownreferences.feedback.Feedback;
import org.polarsys.kitalpha.model.common.scrutiny.interfaces.IFeedback.FeedbackLevel;
import org.polarsys.kitalpha.model.common.scrutiny.interfaces.IFeedback.IFeedbackMessage;
import org.polarsys.kitalpha.model.common.scrutiny.interfaces.IScrutinize;

/**
 * @author Matthieu Helleboid
 */
public class InvalidDMapping implements IScrutinize<Set<DRepresentationElement>, Collection<IFeedbackMessage>> {

	private Set<DRepresentationElement> representationElements;

	public InvalidDMapping() {
		this.representationElements = new HashSet<DRepresentationElement>();
	}

	@Override
	public void findIn(EObject eObject) {
		
		if (eObject instanceof DRepresentationElement) {
			DRepresentationElement dRepresentationElement = (DRepresentationElement) eObject;
			if (dRepresentationElement.getMapping() != null && dRepresentationElement.getMapping().eIsProxy()){
				representationElements.add(dRepresentationElement);
			}
			
			if (dRepresentationElement.getMapping() == null) 
				System.out.println(dRepresentationElement);
		}
		
	}

	@Override
	public void findIn(Resource resource) {
		//Do nothing
	}

	@Override
	public Set<DRepresentationElement> getAnalysisResult() {
		return this.representationElements;
	}

	@Override
	public Collection<IFeedbackMessage> getFeedbackAnalysisMessages() {
		Feedback feedback = new Feedback();
		
		for (DRepresentationElement representationElement : getAnalysisResult()) {
			String message = Messages.INVALID_SIRIUS_ELT_MAPPING;
			
			if (representationElement.getMapping() != null){
				message = message + Feedback.getProxyURI(representationElement.getMapping());
			}
			IFeedbackMessage feedbackMessage = new Feedback.FeedbackMessage(FeedbackLevel.ERROR, message);
			feedback.addFeedbackMessage(feedbackMessage);
		}
		
		return feedback.getFeedbackMessages();
	}
}

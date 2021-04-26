/*******************************************************************************
 * Copyright (c) 2021 Thales Global Services S.A.S.
 *  This program and the accompanying materials are made available under the
 *  terms of the Eclipse Public License 2.0 which is available at
 *  http://www.eclipse.org/legal/epl-2.0
 *  
 *  SPDX-License-Identifier: EPL-2.0
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
import org.eclipse.sirius.diagram.DSemanticDiagram;
import org.polarsys.kitalpha.model.common.scrutiny.contrib.unknownreferences.Messages;
import org.polarsys.kitalpha.model.common.scrutiny.contrib.unknownreferences.feedback.Feedback;
import org.polarsys.kitalpha.model.common.scrutiny.interfaces.IScrutinize;
import org.polarsys.kitalpha.model.common.scrutiny.interfaces.IFeedback.FeedbackLevel;
import org.polarsys.kitalpha.model.common.scrutiny.interfaces.IFeedback.IFeedbackMessage;

/**
 * 
 * @author Thomas Guiu
 *
 */
public class InvalidDSemanticDiagram implements IScrutinize<Set<DSemanticDiagram>, Collection<IFeedbackMessage>>{

	private final Set<DSemanticDiagram> diagrams  = new HashSet<>();
	
	@Override
	public void findIn(EObject eObject) {
		if (eObject instanceof DSemanticDiagram) {
			DSemanticDiagram diag = (DSemanticDiagram) eObject;
			
			if (diag.getDescription() == null || diag.getDescription().eIsProxy()){
				diagrams.add(diag);
			}
			
		}
	}

	@Override
	public void findIn(Resource resource) {
		//Nothing to do
	}

	@Override
	public Set<DSemanticDiagram> getAnalysisResult() {
		return diagrams;
	}

	@Override
	public Collection<IFeedbackMessage> getFeedbackAnalysisMessages() {
		Feedback feedback = new Feedback();

		for (DSemanticDiagram diagram : getAnalysisResult()) {
			String message = Messages.INVALID_SIRIUS_DIAGRAM;
			message = message + Feedback.getRepresentationName(diagram);
			if (diagram.getDescription() != null)
				message = message + Feedback.getProxyURI(diagram.getDescription());
			IFeedbackMessage feedbackMessage = new Feedback.FeedbackMessage(FeedbackLevel.ERROR, message);
			feedback.addFeedbackMessage(feedbackMessage);
		}
		return feedback.getFeedbackMessages();
	}

}

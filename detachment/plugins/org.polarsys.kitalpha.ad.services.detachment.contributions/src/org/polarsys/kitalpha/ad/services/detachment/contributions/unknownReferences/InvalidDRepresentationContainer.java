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

package org.polarsys.kitalpha.ad.services.detachment.contributions.unknownReferences;

import java.util.HashSet;
import java.util.Set;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.ECrossReferenceAdapter;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.sirius.viewpoint.DRepresentationContainer;
import org.polarsys.kitalpha.ad.services.detachment.core.registeries.interfaces.IUnknownReferencesService;
import org.polarsys.kitalpha.ad.services.detachment.core.services.feedback.Feedback;
import org.polarsys.kitalpha.ad.services.detachment.core.services.feedback.IFeedback;
import org.polarsys.kitalpha.ad.services.detachment.core.services.feedback.IFeedback.FeedbackLevel;

/**
 * @author Matthieu Helleboid
 */
public class InvalidDRepresentationContainer implements
		IUnknownReferencesService<DRepresentationContainer> {
	
	private Set<DRepresentationContainer> representationContainers;

	public InvalidDRepresentationContainer() {
		this.representationContainers = new HashSet<DRepresentationContainer>();
	}

	@Override
	public void clean(ECrossReferenceAdapter crossReferenceAdapter) {
		for (DRepresentationContainer dRepresentationContainer : representationContainers) {
//			Collection<Setting> inverseReferences = crossReferenceAdapter.getInverseReferences(dRepresentationContainer);
//			EcoreUtil.delete(dRepresentationContainer, true);
			EcoreUtil.remove(dRepresentationContainer);
		}

	}

	@Override
	public void findIn(EObject eObject, IFeedback messages) {
		if (eObject instanceof DRepresentationContainer) {
			DRepresentationContainer dRepresentationContainer = (DRepresentationContainer) eObject;
			if (dRepresentationContainer.getViewpoint() == null || dRepresentationContainer.getViewpoint().eIsProxy()){
				representationContainers.add(dRepresentationContainer);
				addFeedbackMessages(dRepresentationContainer, messages);
			}
			
		}
	}

	@Override
	public void findIn(Resource resource, IFeedback messages) {
		//Do nothing
	}

	@Override
	public Set<DRepresentationContainer> getUndefinedReferences() {
		return representationContainers;
	}
	
	private void addFeedbackMessages(DRepresentationContainer dRepresentationContainer, IFeedback messages) {
		String message = "Missing Sirius Viewpoint";
		if (dRepresentationContainer.getViewpoint() != null) {
			message = message + Feedback.getProxyURI(dRepresentationContainer.getViewpoint());
		}
		messages.addFeedbackMessage(new Feedback.FeedbackMessage(FeedbackLevel.WARNING, message));
	}

	@Override
	public void dispose() {
		getUndefinedReferences().clear();
	}

}

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
import org.eclipse.emf.ecore.EStructuralFeature.Setting;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.ECrossReferenceAdapter;
import org.eclipse.sirius.diagram.DDiagram;
import org.eclipse.sirius.diagram.DiagramPackage;
import org.eclipse.sirius.diagram.description.filter.FilterDescription;
import org.polarsys.kitalpha.ad.services.detachment.core.registeries.interfaces.IUnknownReferencesService;
import org.polarsys.kitalpha.ad.services.detachment.core.services.feedback.Feedback;
import org.polarsys.kitalpha.ad.services.detachment.core.services.feedback.IFeedback;
import org.polarsys.kitalpha.ad.services.detachment.core.services.feedback.IFeedback.FeedbackLevel;

/**
 * @author Matthieu Helleboid
 */
public class InvalidFilterDescription implements
		IUnknownReferencesService<FilterDescription> {
	
	private Set<FilterDescription> filterDescriptions;

	public InvalidFilterDescription() {
		this.filterDescriptions = new HashSet<FilterDescription>();
	}

	@Override
	public void clean(ECrossReferenceAdapter crossReferenceAdapter) {
		for (FilterDescription filterDescription : filterDescriptions) {
			for (Setting setting : crossReferenceAdapter.getInverseReferences(filterDescription)) {
				if (setting.getEStructuralFeature().equals(DiagramPackage.eINSTANCE.getDDiagram_ActivatedFilters())) {
					DDiagram dDiagram = (DDiagram) setting.getEObject();
					dDiagram.getActivatedFilters().remove(filterDescription);
				}
			}
		}
	}

	@Override
	public void findIn(EObject eObject, IFeedback messages) {
		if (eObject instanceof FilterDescription) {
			FilterDescription filterDescription = (FilterDescription) eObject;
			if (filterDescription.eIsProxy()){
				filterDescriptions.add(filterDescription);
				addFeedbackMessages(filterDescription, messages);
			}
		}
	}

	@Override
	public void findIn(Resource resource, IFeedback messages) {
		//Do nothing
	}

	@Override
	public Set<FilterDescription> getUndefinedReferences() {
		return filterDescriptions;
	}
	
	
	private void addFeedbackMessages(FilterDescription filterDescription, IFeedback messages) {
		String message = "Invalid Sirius Filter Description";
		message = message + Feedback.getRepresentationName(filterDescription);
		message = message + Feedback.getProxyURI(filterDescription);
		messages.addFeedbackMessage(new Feedback.FeedbackMessage(FeedbackLevel.ERROR, message));
	}

	@Override
	public void dispose() {
		getUndefinedReferences().clear();		
	}

}

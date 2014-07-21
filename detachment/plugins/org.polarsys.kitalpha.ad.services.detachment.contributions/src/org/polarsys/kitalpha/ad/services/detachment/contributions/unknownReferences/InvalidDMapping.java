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
import org.eclipse.sirius.viewpoint.DRepresentationElement;
import org.polarsys.kitalpha.ad.services.detachment.core.registeries.interfaces.IUnknownReferencesService;
import org.polarsys.kitalpha.ad.services.detachment.core.services.feedback.Feedback;
import org.polarsys.kitalpha.ad.services.detachment.core.services.feedback.IFeedback;
import org.polarsys.kitalpha.ad.services.detachment.core.services.feedback.IFeedback.FeedbackLevel;

/**
 * @author Matthieu Helleboid
 */
public class InvalidDMapping implements IUnknownReferencesService<DRepresentationElement> {

	private Set<DRepresentationElement> representationElements;
	
	public InvalidDMapping() {
		this.representationElements = new HashSet<DRepresentationElement>();
	}

	@Override
	public void clean(ECrossReferenceAdapter crossReferenceAdapter) {
		for (DRepresentationElement dRepresentationElement : representationElements) {
//			Collection<Setting> inverseReferences = crossReferenceAdapter.getInverseReferences(dRepresentationElement);
//			for (Setting setting : inverseReferences) {
//				if (setting.getEStructuralFeature().equals(NotationPackage.eINSTANCE.getView_Element())) {
////					EcoreUtil.delete(setting.getEObject(), true);
//					EcoreUtil.remove(setting.getEObject());
//				}
//			}
//			EcoreUtil.delete(dRepresentationElement, true);
			EcoreUtil.remove(dRepresentationElement);
		}
	}

	
	@Override
	public void findIn(EObject eObject, IFeedback messages) {
		
		if (eObject instanceof DRepresentationElement) {
			DRepresentationElement dRepresentationElement = (DRepresentationElement) eObject;
			if (dRepresentationElement.getMapping() != null && dRepresentationElement.getMapping().eIsProxy()){
				representationElements.add(dRepresentationElement);
				addFeedbackMessages(dRepresentationElement, messages);
			}
			
			if (dRepresentationElement.getMapping() == null) 
				System.out.println(dRepresentationElement);
		}
	}

	@Override
	public void findIn(Resource resource, IFeedback messages) {
		//Do nothing
	}

	@Override
	public Set<DRepresentationElement> getUndefinedReferences() {
		return representationElements;
	}
	
	
	private void addFeedbackMessages(DRepresentationElement dRepresentationElement, IFeedback messages) {
		String message = "Invalid Sirius Element Mapping";
		message = message + Feedback.getRepresentationName(dRepresentationElement);
		if (dRepresentationElement.getMapping() != null) {
			message = message + Feedback.getProxyURI(dRepresentationElement.getMapping());
		}
		messages.addFeedbackMessage(new Feedback.FeedbackMessage(FeedbackLevel.ERROR, message));
	}

	
	@Override
	public void dispose() {
		getUndefinedReferences().clear();
	}

}

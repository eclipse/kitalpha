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
import org.eclipse.sirius.diagram.description.Layer;
import org.polarsys.kitalpha.ad.services.detachment.core.registeries.interfaces.IUnknownReferencesService;
import org.polarsys.kitalpha.ad.services.detachment.core.services.feedback.Feedback;
import org.polarsys.kitalpha.ad.services.detachment.core.services.feedback.IFeedback;
import org.polarsys.kitalpha.ad.services.detachment.core.services.feedback.IFeedback.FeedbackLevel;

/**
 * @author Matthieu Helleboid
 */
public class InvalidLayer implements IUnknownReferencesService<Layer> {
	
	private Set<Layer> layers;

	public InvalidLayer() {
		this.layers = new HashSet<Layer>();
	}

	@Override
	public void clean(ECrossReferenceAdapter crossReferenceAdapter) {
		for (Layer layer : layers) {
			for (Setting setting : crossReferenceAdapter.getInverseReferences(layer)) {
				if (setting.getEStructuralFeature().equals(DiagramPackage.eINSTANCE.getDDiagram_ActivatedLayers())) {
					DDiagram dDiagram = (DDiagram) setting.getEObject();
					dDiagram.getActivatedLayers().remove(layer);
				}
			}
		}
	}

	@Override
	public void findIn(EObject eObject, IFeedback messages) {
		if (eObject instanceof Layer) {
			Layer layer = (Layer) eObject;
			if (layer.eIsProxy()){
				layers.add(layer);
				addFeedbackMessages(layer, messages);
			}
			
		}
	}

	@Override
	public void findIn(Resource resource, IFeedback messages) {
		//Do nothing
	}

	@Override
	public Set<Layer> getUndefinedReferences() {
		return layers;
	}
	
	
	
	private void addFeedbackMessages(Layer layer, IFeedback messages) {
		String message = "Invalid Sirius Layer";
		message = message + Feedback.getRepresentationName(layer);
		message = message + Feedback.getProxyURI(layer);
		messages.addFeedbackMessage(new Feedback.FeedbackMessage(FeedbackLevel.ERROR, message));
	}

	@Override
	public void dispose() {
		getUndefinedReferences().clear();
	}

}

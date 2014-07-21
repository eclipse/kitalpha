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
import java.util.Map;
import java.util.Set;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.ECrossReferenceAdapter;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap.Entry;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.ecore.xml.type.AnyType;
import org.polarsys.kitalpha.ad.services.detachment.core.registeries.interfaces.IUnknownReferencesService;
import org.polarsys.kitalpha.ad.services.detachment.core.services.feedback.Feedback;
import org.polarsys.kitalpha.ad.services.detachment.core.services.feedback.IFeedback;
import org.polarsys.kitalpha.ad.services.detachment.core.services.feedback.IFeedback.FeedbackLevel;

/**
 * @author Matthieu Helleboid
 */
public class MissingEPackage implements IUnknownReferencesService<EPackage> {

	
	private Set<EPackage> ePackages;
	private Set<XMLResource> xmlResources;
	private Set<AnyType> anyTypes;
	
	
	public MissingEPackage() {
		this.ePackages = new HashSet<EPackage>();
		this.xmlResources = new HashSet<XMLResource>();
		this.anyTypes = new HashSet<AnyType>();
	}

	@Override
	public void clean(ECrossReferenceAdapter crossReferenceAdapter) {
		for (AnyType anyType : anyTypes) {
			//TODO should use our own crossReferenceAdapter
			EcoreUtil.delete(anyType, true);
		}
		for (XMLResource xmlResource : xmlResources) {
			xmlResource.getEObjectToExtensionMap().clear();
		}

	}

	@Override
	public void findIn(EObject eObject, IFeedback messages) {
		if (eObject instanceof AnyType) {
			AnyType anyType = (AnyType) eObject;
			EPackage ePackage = anyType.eClass().getEPackage();
			anyTypes.add(anyType);
			if (ePackage.eResource() == null){
				ePackages.add(ePackage);
				addFeedbackMessages(ePackage, messages);
			}
			System.out.println("Clean::::");
		}
	}

	@Override
	public void findIn(Resource resource, IFeedback messages) {
		if (resource instanceof XMLResource) {
			XMLResource xmlResource = (XMLResource) resource;
			xmlResources .add(xmlResource);
			Map<EObject, AnyType> eObjectToExtensionMap = xmlResource.getEObjectToExtensionMap();
			for (AnyType anyType : eObjectToExtensionMap.values()) {
				findIn(anyType.getMixed(), messages);
				findIn(anyType.getAny(), messages);
				findIn(anyType.getAnyAttribute(), messages);
			}
		}
	}
	
	private void findIn(FeatureMap featureMap, IFeedback messages) {
		for (Entry entry : featureMap) {
			Object value = entry.getValue();
			if (value instanceof AnyType) {
				AnyType anyType = (AnyType) value;
				ePackages.add(anyType.eClass().getEPackage());
				addFeedbackMessages(anyType.eClass().getEPackage(), messages);
			}
		}
	}

	@Override
	public Set<EPackage> getUndefinedReferences() {
		return ePackages;
	}
	
	
	private void addFeedbackMessages(EPackage ePackage, IFeedback messages) {
		String message = "Messing Ecore Package (" + ePackage.getNsURI() + ")";
		messages.addFeedbackMessage(new Feedback.FeedbackMessage(FeedbackLevel.ERROR, message));
	}

	@Override
	public void dispose() {
		getUndefinedReferences().clear();
	}

}

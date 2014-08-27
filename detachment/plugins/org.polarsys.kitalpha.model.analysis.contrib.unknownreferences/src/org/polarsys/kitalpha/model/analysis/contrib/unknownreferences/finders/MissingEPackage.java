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
import java.util.Map;
import java.util.Set;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap.Entry;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.ecore.xml.type.AnyType;
import org.polarsys.kitalpha.model.analysis.contrib.unknownreferences.Messages;
import org.polarsys.kitalpha.model.analysis.contrib.unknownreferences.feedback.Feedback;
import org.polarsys.kitalpha.model.analysis.interfaces.IFeedback.FeedbackLevel;
import org.polarsys.kitalpha.model.analysis.interfaces.IFeedback.IFeedbackMessage;
import org.polarsys.kitalpha.model.analysis.interfaces.IFinder;

/**
 * @author Matthieu Helleboid
 */
public class MissingEPackage implements IFinder<MissingEPackageResultWrapper, Collection<IFeedbackMessage>> {

	
	private Set<EPackage> ePackages;
	private Set<XMLResource> xmlResources;
	private Set<AnyType> anyTypes;
	
	
	public MissingEPackage() {
		this.ePackages = new HashSet<EPackage>();
		this.xmlResources = new HashSet<XMLResource>();
		this.anyTypes = new HashSet<AnyType>();
	}

	@Override
	public void findIn(EObject eObject) {
		if (eObject instanceof AnyType) {
			AnyType anyType = (AnyType) eObject;
			EPackage ePackage = anyType.eClass().getEPackage();
			anyTypes.add(anyType);
			if (ePackage.eResource() == null){
				ePackages.add(ePackage);
			}
		}
	}

	@Override
	public void findIn(Resource resource) {
		if (resource instanceof XMLResource) {
			XMLResource xmlResource = (XMLResource) resource;
			xmlResources .add(xmlResource);
			Map<EObject, AnyType> eObjectToExtensionMap = xmlResource.getEObjectToExtensionMap();
			for (AnyType anyType : eObjectToExtensionMap.values()) {
				findIn(anyType.getMixed());
				findIn(anyType.getAny());
				findIn(anyType.getAnyAttribute());
			}
		}
	}
	
	private void findIn(FeatureMap featureMap) {
		for (Entry entry : featureMap) {
			Object value = entry.getValue();
			if (value instanceof AnyType) {
				AnyType anyType = (AnyType) value;
				ePackages.add(anyType.eClass().getEPackage());
			}
		}
	}

	@Override
	public MissingEPackageResultWrapper getAnalysisResult() {
		return new MissingEPackageResultWrapper(ePackages, xmlResources, anyTypes);
	}

	@Override
	public Collection<IFeedbackMessage> getFeedbackAnalysisMessages() {
		Feedback feedback = new Feedback();

		for (EPackage ePackage : getAnalysisResult().getePackages()) {
			String message = Messages.MISSING_ECORE_PACKAGE;
			message = message + "(" + ePackage.getNsURI() + ")";
			IFeedbackMessage feedbackMessage = new Feedback.FeedbackMessage(FeedbackLevel.ERROR, message);
			feedback.addFeedbackMessage(feedbackMessage);
		}
		return feedback.getFeedbackMessages();
	}
}

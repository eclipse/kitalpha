/*******************************************************************************
 * Copyright (c) 2014, 2018 Thales Global Services S.A.S.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *  Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/
package org.polarsys.kitalpha.model.common.scrutiny.contrib.unknownreferences.scrutinizes;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.polarsys.kitalpha.model.common.scrutiny.contrib.unknownreferences.feedback.Feedback;
import org.polarsys.kitalpha.model.common.scrutiny.interfaces.IFeedback.FeedbackLevel;
import org.polarsys.kitalpha.model.common.scrutiny.interfaces.IFeedback.IFeedbackMessage;
import org.polarsys.kitalpha.model.common.scrutiny.interfaces.IScrutinize;

public class InvalidEReferences implements IScrutinize<Map<EObject, List<EReference>>, Collection<IFeedbackMessage>> {
	
	private Map<EObject, List<EReference>> invalidEReferences = new HashMap<EObject, List<EReference>>();

	public InvalidEReferences() {
	}

	@Override
	public void findIn(EObject eObject) {
		if (!(eObject instanceof EClass) && !eObject.eIsProxy()){
			EClass eClass = eObject.eClass();
			
			if (eClass != null){
				EList<EObject> eCrossReferences = eClass.eCrossReferences();
				
				for (EObject eCrossRef : eCrossReferences) {
					if (eCrossRef instanceof EReference){
						EReference ref = (EReference)eCrossRef;
						if (ref.isChangeable()){
							Object value = eObject.eGet(ref, true);
							if (value != null && value instanceof EObject && ((EObject)value).eIsProxy()){
								if (invalidEReferences.containsKey(eObject)){
									List<EReference> eRef = invalidEReferences.get(eObject);
									if (!eRef.contains(ref)){
										eRef.add(ref);
									}
								} else {
									List<EReference> list = new ArrayList<EReference>();
									list.add(ref);
									invalidEReferences.put(eObject, list);
								}
							}
						}
					}
				}
			}
		}
	}

	@Override
	public void findIn(Resource resource) {
		// TODO Auto-generated method stub

	}

	@Override
	public Map<EObject, List<EReference>> getAnalysisResult() {
		return invalidEReferences;
	}

	@Override
	public Collection<IFeedbackMessage> getFeedbackAnalysisMessages() {
		Feedback feedback = new Feedback();
		
		for (Entry<EObject, List<EReference>> entry: invalidEReferences.entrySet()) {
			EObject value = entry.getKey();
			List<EReference> references = entry.getValue();
			
			for (EReference eReference : references) {
				String message = "Invalid EReference to ";
				message += EcoreUtil.getURI((EObject)value.eGet(eReference)).toString();

				IFeedbackMessage feedbackMessage = new Feedback.FeedbackMessage(FeedbackLevel.ERROR, message);
				feedback.addFeedbackMessage(feedbackMessage);
			}
			
		}
		return feedback.getFeedbackMessages();
	}

}

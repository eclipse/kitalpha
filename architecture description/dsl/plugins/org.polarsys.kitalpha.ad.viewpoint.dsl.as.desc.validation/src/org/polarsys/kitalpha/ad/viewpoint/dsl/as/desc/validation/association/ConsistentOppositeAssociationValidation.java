/*******************************************************************************
 * Copyright (c) 2017 Thales Global Services S.A.S.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *  
 * Contributors:
 *   Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/
package org.polarsys.kitalpha.ad.viewpoint.dsl.as.desc.validation.association;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import org.eclipse.emf.ecore.EObject;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.desc.helper.desc.data.AssociationsHelper;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.LocalClassAssociation;

/**
 * 
 * @author Faycal Abka
 *
 */
public class ConsistentOppositeAssociationValidation extends AbstractAssociationConstraint {
	
	private final Map<VALIDATION_TYPE, String> messages;

	public ConsistentOppositeAssociationValidation() {
		this.messages = new HashMap<ConsistentOppositeAssociationValidation.VALIDATION_TYPE, String>();
	}

	@Override
	protected void setEStructuralFeatureName(EObject eObject) {
		eStructuralFeatureName = "opposite";
	}

	@Override
	protected boolean isObjectInScope(Object object) {
		return object instanceof LocalClassAssociation;
	}

	@Override
	protected boolean acceptAssociationBetween(EObject source, EObject target) {
		boolean result = true;
		this.messages.clear();
		
		if (source == null || target == null){
			return result;
		}
		
		LocalClassAssociation sourceAssociation = (LocalClassAssociation)source;
		LocalClassAssociation targetAssociation = (LocalClassAssociation)target;
		
		//COHERENCE
		boolean areCoherentType = AssociationsHelper.areCoherentOpposite(sourceAssociation, targetAssociation);
		if (!areCoherentType){
			messages.put(VALIDATION_TYPE.COHERENCE, "The opposite must be a feature of the reference's type.");
			result = false;
		}
		
		//Self opposite
		boolean isSelfOpposite = AssociationsHelper.areSelfOpposite(sourceAssociation, targetAssociation);
		if (isSelfOpposite){
			messages.put(VALIDATION_TYPE.SELF_OPPOSITE, "The opposite may not be its own opposite.");
			result = false;
		}
		
		//Transient
		boolean areBothTransient = AssociationsHelper.areTransientAssociations(sourceAssociation, targetAssociation);		
		if (!areBothTransient){
			messages.put(VALIDATION_TYPE.TRANSIENT, "The opposite of a transient reference must be transient.");
			result = false;
		}

		//Transient
		boolean areContainment = AssociationsHelper.areContainmentAssociations(sourceAssociation, targetAssociation);
		if (areContainment){
			messages.put(VALIDATION_TYPE.CONTAINMENT, "The opposite of a containment reference must not be a containment reference.");
			result = false;
		}
		
		boolean hasSingleContainer = AssociationsHelper.hasSingleContainer(sourceAssociation, targetAssociation);
		if (!hasSingleContainer){
			messages.put(VALIDATION_TYPE.CONTAINER, "The upper bound must be 1 for this association");
			result = false;
		}
		
		return result;
	}

	@Override
	protected String getMessageToDisplay(EObject source, EObject target) {
		StringBuffer feedback = new StringBuffer();
		
		LocalClassAssociation sourceAssociation = (LocalClassAssociation)source;
		LocalClassAssociation targetAssociation = (LocalClassAssociation)target;
		
		for(Entry<VALIDATION_TYPE, String> e: this.messages.entrySet()){
			VALIDATION_TYPE key = e.getKey();
			switch (key) {
			case COHERENCE:
				feedback.append(e.getValue())
					.append(" ")
					.append(sourceAssociation.getName()).append(" has a target type [").append(sourceAssociation.getLocalTarget().getName()).append("]")
					.append(" and the containing class of ").append(targetAssociation.getName())
					.append(" is [").append(AssociationsHelper.getContainingClass(targetAssociation).getName()).append("].");
				feedback.append("\n");
				break;
			case SELF_OPPOSITE:
				feedback.append(e.getValue())
				.append(" ")
				.append(sourceAssociation.getName()).append(" could not be it opposite.");
				feedback.append("\n");
				break;
			case TRANSIENT:
				feedback.append(e.getValue())
				.append(" ")
				.append(sourceAssociation.getName()).append(" is ");
				if (!sourceAssociation.isTransient()){
					feedback.append("not ");
				}
				feedback.append("transient ").append("while ").append(targetAssociation.getName()).append(" is ");
				if (!targetAssociation.isTransient()){
					feedback.append("not ");
				}
				feedback.append("transient.");
				feedback.append("\n");
				break;
			case CONTAINMENT:
				feedback.append(e.getValue())
				.append(" ")
				.append(sourceAssociation.getName()).append(" and ").append(targetAssociation.getName()).append(" are containment associations");
				feedback.append("\n");
				break;
			case CONTAINER:
				feedback.append(e.getValue()).append("...");
				feedback.append("\n");
				break;
			default:
				break;
			}
		}
		
		return feedback.toString();
	}
	
	private enum VALIDATION_TYPE {
		COHERENCE,
		SELF_OPPOSITE,
		TRANSIENT,
		CONTAINMENT,
		CONTAINER
	}

}

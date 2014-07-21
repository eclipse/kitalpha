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
package org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpservices.Property;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpservices.PropertySet;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpservices.Rule;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpservices.RuleSet;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpservices.Service;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpservices.ServiceSet;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpservices.VpservicesPackage;
import org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.Services;
import org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ServicesPackage;
import org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.VpservicesGrammarAccess;

@SuppressWarnings("all")
public class VpservicesSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private VpservicesGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == ServicesPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case ServicesPackage.SERVICES:
				if(context == grammarAccess.getServicesRule()) {
					sequence_Services(context, (Services) semanticObject); 
					return; 
				}
				else break;
			}
		else if(semanticObject.eClass().getEPackage() == VpservicesPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case VpservicesPackage.PROPERTY:
				if(context == grammarAccess.getPropertyRule()) {
					sequence_Property(context, (Property) semanticObject); 
					return; 
				}
				else break;
			case VpservicesPackage.PROPERTY_SET:
				if(context == grammarAccess.getAspectRule() ||
				   context == grammarAccess.getPropertySetRule()) {
					sequence_PropertySet(context, (PropertySet) semanticObject); 
					return; 
				}
				else break;
			case VpservicesPackage.RULE:
				if(context == grammarAccess.getRuleRule()) {
					sequence_Rule(context, (Rule) semanticObject); 
					return; 
				}
				else break;
			case VpservicesPackage.RULE_SET:
				if(context == grammarAccess.getAspectRule() ||
				   context == grammarAccess.getRuleSetRule()) {
					sequence_RuleSet(context, (RuleSet) semanticObject); 
					return; 
				}
				else break;
			case VpservicesPackage.SERVICE:
				if(context == grammarAccess.getServiceRule()) {
					sequence_Service(context, (Service) semanticObject); 
					return; 
				}
				else break;
			case VpservicesPackage.SERVICE_SET:
				if(context == grammarAccess.getAspectRule() ||
				   context == grammarAccess.getServiceSetRule()) {
					sequence_ServiceSet(context, (ServiceSet) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (name=FQN vpProperties+=Property*)
	 */
	protected void sequence_PropertySet(EObject context, PropertySet semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=EString Type=PropertyType? value=EString?)
	 */
	protected void sequence_Property(EObject context, Property semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=FQN description=EString? (vpRules+=Rule vpRules+=Rule*)?)
	 */
	protected void sequence_RuleSet(EObject context, RuleSet semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=FQN description=EString? type=Rules_Types class=EString?)
	 */
	protected void sequence_Rule(EObject context, Rule semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=FQN description=EString? (vpServices+=Service vpServices+=Service*)?)
	 */
	protected void sequence_ServiceSet(EObject context, ServiceSet semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=FQN description=EString? (relatedRules+=[Rule|FQN] relatedRules+=[Rule|FQN]*)?)
	 */
	protected void sequence_Service(EObject context, Service semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     services+=Aspect+
	 */
	protected void sequence_Services(EObject context, Services semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}

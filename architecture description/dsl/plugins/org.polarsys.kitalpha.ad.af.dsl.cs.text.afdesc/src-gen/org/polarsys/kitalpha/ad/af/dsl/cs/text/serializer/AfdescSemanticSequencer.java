/*******************************************************************************
 * Copyright (c) 2015 Thales Global Services S.A.S.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *  Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/
package org.polarsys.kitalpha.ad.af.dsl.cs.text.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticNodeProvider.INodesForEObjectProvider;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;
import org.polarsys.kitalpha.ad.af.dsl.as.model.afdesc.AfdescPackage;
import org.polarsys.kitalpha.ad.af.dsl.as.model.afdesc.ArchitectureFramework;
import org.polarsys.kitalpha.ad.af.dsl.as.model.afdesc.Configuration;
import org.polarsys.kitalpha.ad.af.dsl.as.model.afdesc.GenerationConfiguration;
import org.polarsys.kitalpha.ad.af.dsl.as.model.afdesc.Viewpoints;
import org.polarsys.kitalpha.ad.af.dsl.cs.text.services.AfdescGrammarAccess;

@SuppressWarnings("all")
public class AfdescSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private AfdescGrammarAccess grammarAccess;
	
	@Override
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == AfdescPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case AfdescPackage.ARCHITECTURE_FRAMEWORK:
				sequence_ArchitectureFramework(context, (ArchitectureFramework) semanticObject); 
				return; 
			case AfdescPackage.CONFIGURATION:
				sequence_Configuration(context, (Configuration) semanticObject); 
				return; 
			case AfdescPackage.GENERATION_CONFIGURATION:
				sequence_GenerationConfiguration(context, (GenerationConfiguration) semanticObject); 
				return; 
			case AfdescPackage.VIEWPOINTS:
				sequence_Viewpoints(context, (Viewpoints) semanticObject); 
				return; 
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (name=ID? description=STRING? shortName=STRING? af_viewpoints=Viewpoints? owned_configuration=Configuration)
	 */
	protected void sequence_ArchitectureFramework(EObject context, ArchitectureFramework semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ((owned_element+=ConfigurationElement owned_element+=ConfigurationElement*)?)
	 */
	protected void sequence_Configuration(EObject context, Configuration semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     rootProjectName=FQN
	 */
	protected void sequence_GenerationConfiguration(EObject context, GenerationConfiguration semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, AfdescPackage.Literals.GENERATION_CONFIGURATION__ROOT_PROJECT_NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AfdescPackage.Literals.GENERATION_CONFIGURATION__ROOT_PROJECT_NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getGenerationConfigurationAccess().getRootProjectNameFQNParserRuleCall_1_1_0(), semanticObject.getRootProjectName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     ((owned_viewpoints+=[Viewpoint|ID] owned_viewpoints+=[Viewpoint|ID]*)?)
	 */
	protected void sequence_Viewpoints(EObject context, Viewpoints semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}

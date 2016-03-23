/*******************************************************************************
 * Copyright (c) 2016 Thales Global Services S.A.S.
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
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpconf.Configuration;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpconf.GData;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpconf.Generation;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpconf.GenerationConfiguration;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpconf.TargetApplication;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpconf.VpconfPackage;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.configuration.ConfigurationPackage;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.configuration.DiagramGenerationConfiguration;
import org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.VpconfGrammarAccess;
import org.polarsys.kitalpha.ad.viewpoint.dsl.generation.conf.desc.aird.model.DescAirdGenConf.AirdGenerationConfiguration;
import org.polarsys.kitalpha.ad.viewpoint.dsl.generation.conf.desc.aird.model.DescAirdGenConf.DescAirdGenConfPackage;
import org.polarsys.kitalpha.ad.viewpoint.dsl.generation.conf.doc.model.DocGenConfiguration.DocGenConfigurationPackage;
import org.polarsys.kitalpha.ad.viewpoint.dsl.generation.conf.doc.model.DocGenConfiguration.DocumentationGenerationConfiguration;

@SuppressWarnings("all")
public class VpconfSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private VpconfGrammarAccess grammarAccess;
	
	@Override
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == DescAirdGenConfPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case DescAirdGenConfPackage.AIRD_GENERATION_CONFIGURATION:
				sequence_ModelsAirdGenerationConfiguration(context, (AirdGenerationConfiguration) semanticObject); 
				return; 
			}
		else if(semanticObject.eClass().getEPackage() == DocGenConfigurationPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case DocGenConfigurationPackage.DOCUMENTATION_GENERATION_CONFIGURATION:
				sequence_DocumentationGenerationConfiguration(context, (DocumentationGenerationConfiguration) semanticObject); 
				return; 
			}
		else if(semanticObject.eClass().getEPackage() == ConfigurationPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case ConfigurationPackage.DIAGRAM_GENERATION_CONFIGURATION:
				sequence_DiagramGenerationConfiguration(context, (DiagramGenerationConfiguration) semanticObject); 
				return; 
			}
		else if(semanticObject.eClass().getEPackage() == VpconfPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case VpconfPackage.CONFIGURATION:
				sequence_Configuration(context, (Configuration) semanticObject); 
				return; 
			case VpconfPackage.GDATA:
				sequence_GData(context, (GData) semanticObject); 
				return; 
			case VpconfPackage.GENERATION:
				sequence_Generation(context, (Generation) semanticObject); 
				return; 
			case VpconfPackage.GENERATION_CONFIGURATION:
				sequence_GenerationConfiguration(context, (GenerationConfiguration) semanticObject); 
				return; 
			case VpconfPackage.TARGET_APPLICATION:
				sequence_TargetApplication(context, (TargetApplication) semanticObject); 
				return; 
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (name=FQN vpConfigurationElements+=ConfigurationElement*)
	 */
	protected void sequence_Configuration(EObject context, Configuration semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (overwriteVSM=EBoolean?)
	 */
	protected void sequence_DiagramGenerationConfiguration(EObject context, DiagramGenerationConfiguration semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (ecoreToHtml=EBoolean?)
	 */
	protected void sequence_DocumentationGenerationConfiguration(EObject context, DocumentationGenerationConfiguration semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         model=EBoolean? 
	 *         edit=EBoolean? 
	 *         editor=EBoolean? 
	 *         test=EBoolean? 
	 *         javaDoc=EBoolean? 
	 *         overwriteEcore=EBoolean?
	 *     )
	 */
	protected void sequence_GData(EObject context, GData semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (projectName=FQN nsuri=STRING?)
	 */
	protected void sequence_GenerationConfiguration(EObject context, GenerationConfiguration semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (ownedDataGenerationConf=GData? ownedExtensionGenConf+=ExtensionGeneratrionConfiguration*)
	 */
	protected void sequence_Generation(EObject context, Generation semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (genRepresentations=EBoolean?)
	 */
	protected void sequence_ModelsAirdGenerationConfiguration(EObject context, AirdGenerationConfiguration semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     type=EString
	 */
	protected void sequence_TargetApplication(EObject context, TargetApplication semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}

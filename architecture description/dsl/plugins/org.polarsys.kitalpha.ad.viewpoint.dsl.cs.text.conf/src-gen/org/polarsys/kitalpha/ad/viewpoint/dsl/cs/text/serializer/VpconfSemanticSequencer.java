/*******************************************************************************
 * Copyright (c) 2017 Thales Global Services S.A.S.
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
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpconf.Configuration;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpconf.GData;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpconf.Generation;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpconf.GenerationConfiguration;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpconf.Release;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpconf.TargetApplication;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpconf.ViewConfiguration;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpconf.VpconfPackage;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.configuration.ConfigurationPackage;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.configuration.DiagramGenerationConfiguration;
import org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.VpconfGrammarAccess;
import org.polarsys.kitalpha.ad.viewpoint.dsl.generation.conf.desc.aird.model.descAirdGenConf.AirdGenerationConfiguration;
import org.polarsys.kitalpha.ad.viewpoint.dsl.generation.conf.desc.aird.model.descAirdGenConf.DescAirdGenConfPackage;
import org.polarsys.kitalpha.ad.viewpoint.dsl.generation.conf.doc.model.docGenConfiguration.DocGenConfigurationPackage;
import org.polarsys.kitalpha.ad.viewpoint.dsl.generation.conf.doc.model.docGenConfiguration.DocumentationGenerationConfiguration;

@SuppressWarnings("all")
public class VpconfSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private VpconfGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == ConfigurationPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case ConfigurationPackage.DIAGRAM_GENERATION_CONFIGURATION:
				sequence_DiagramGenerationConfiguration(context, (DiagramGenerationConfiguration) semanticObject); 
				return; 
			}
		else if (epackage == DescAirdGenConfPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case DescAirdGenConfPackage.AIRD_GENERATION_CONFIGURATION:
				sequence_ModelsAirdGenerationConfiguration(context, (AirdGenerationConfiguration) semanticObject); 
				return; 
			}
		else if (epackage == DocGenConfigurationPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case DocGenConfigurationPackage.DOCUMENTATION_GENERATION_CONFIGURATION:
				sequence_DocumentationGenerationConfiguration(context, (DocumentationGenerationConfiguration) semanticObject); 
				return; 
			}
		else if (epackage == VpconfPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
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
			case VpconfPackage.RELEASE:
				sequence_Release(context, (Release) semanticObject); 
				return; 
			case VpconfPackage.TARGET_APPLICATION:
				sequence_TargetApplication(context, (TargetApplication) semanticObject); 
				return; 
			case VpconfPackage.VIEW_CONFIGURATION:
				sequence_ViewConfiguration(context, (ViewConfiguration) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     Configuration returns Configuration
	 *
	 * Constraint:
	 *     (name=FQN vpConfigurationElements+=ConfigurationElement*)
	 */
	protected void sequence_Configuration(ISerializationContext context, Configuration semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ExtensionGeneratrionConfiguration returns DiagramGenerationConfiguration
	 *     DiagramGenerationConfiguration returns DiagramGenerationConfiguration
	 *
	 * Constraint:
	 *     overwriteVSM=EBoolean?
	 */
	protected void sequence_DiagramGenerationConfiguration(ISerializationContext context, DiagramGenerationConfiguration semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ExtensionGeneratrionConfiguration returns DocumentationGenerationConfiguration
	 *     DocumentationGenerationConfiguration returns DocumentationGenerationConfiguration
	 *
	 * Constraint:
	 *     ecoreToHtml=EBoolean?
	 */
	protected void sequence_DocumentationGenerationConfiguration(ISerializationContext context, DocumentationGenerationConfiguration semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     GData returns GData
	 *
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
	protected void sequence_GData(ISerializationContext context, GData semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ConfigurationElement returns GenerationConfiguration
	 *     GenerationConfiguration returns GenerationConfiguration
	 *
	 * Constraint:
	 *     (projectName=FQN nsuri=STRING?)
	 */
	protected void sequence_GenerationConfiguration(ISerializationContext context, GenerationConfiguration semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ConfigurationElement returns Generation
	 *     Generation returns Generation
	 *
	 * Constraint:
	 *     (ownedDataGenerationConf=GData? ownedExtensionGenConf+=ExtensionGeneratrionConfiguration*)
	 */
	protected void sequence_Generation(ISerializationContext context, Generation semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ExtensionGeneratrionConfiguration returns AirdGenerationConfiguration
	 *     ModelsAirdGenerationConfiguration returns AirdGenerationConfiguration
	 *
	 * Constraint:
	 *     genRepresentations=EBoolean?
	 */
	protected void sequence_ModelsAirdGenerationConfiguration(ISerializationContext context, AirdGenerationConfiguration semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ConfigurationElement returns Release
	 *     Release returns Release
	 *
	 * Constraint:
	 *     (viewpointVersion=Version? viewpointDescription=EString? (requiredExecutionEnvironment+=STRING requiredExecutionEnvironment+=STRING*)?)
	 */
	protected void sequence_Release(ISerializationContext context, Release semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ConfigurationElement returns TargetApplication
	 *     TargetApplication returns TargetApplication
	 *
	 * Constraint:
	 *     type=EString
	 */
	protected void sequence_TargetApplication(ISerializationContext context, TargetApplication semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, VpconfPackage.Literals.TARGET_APPLICATION__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, VpconfPackage.Literals.TARGET_APPLICATION__TYPE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getTargetApplicationAccess().getTypeEStringParserRuleCall_2_0(), semanticObject.getType());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     ConfigurationElement returns ViewConfiguration
	 *     ViewConfiguration returns ViewConfiguration
	 *
	 * Constraint:
	 *     (visible=EBoolean? activable=EBoolean?)
	 */
	protected void sequence_ViewConfiguration(ISerializationContext context, ViewConfiguration semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
}

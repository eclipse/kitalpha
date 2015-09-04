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
package org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.serializer;

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
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpui.FieldMapping;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpui.LocalClass;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpui.UI;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpui.UIContainer;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpui.UIDescription;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpui.UIField;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpui.VpuiPackage;
import org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.VpuiGrammarAccess;
import org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.Import;
import org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.UiPackage;
import org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.UserInterface;

@SuppressWarnings("all")
public class VpuiSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private VpuiGrammarAccess grammarAccess;
	
	@Override
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == UiPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case UiPackage.IMPORT:
				sequence_Import(context, (Import) semanticObject); 
				return; 
			case UiPackage.USER_INTERFACE:
				sequence_UserInterface(context, (UserInterface) semanticObject); 
				return; 
			}
		else if(semanticObject.eClass().getEPackage() == VpuiPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case VpuiPackage.FIELD_MAPPING:
				sequence_FieldMapping(context, (FieldMapping) semanticObject); 
				return; 
			case VpuiPackage.LOCAL_CLASS:
				sequence_LocalClass(context, (LocalClass) semanticObject); 
				return; 
			case VpuiPackage.UI:
				sequence_UI(context, (UI) semanticObject); 
				return; 
			case VpuiPackage.UI_CONTAINER:
				sequence_UIContainer(context, (UIContainer) semanticObject); 
				return; 
			case VpuiPackage.UI_DESCRIPTION:
				sequence_UIDescription(context, (UIDescription) semanticObject); 
				return; 
			case VpuiPackage.UI_FIELD:
				sequence_UIField(context, (UIField) semanticObject); 
				return; 
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (UI_Field_Mapped_To=[AbstractFeature|FQN]?)
	 */
	protected void sequence_FieldMapping(EObject context, FieldMapping semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     importedNamespace=FQN
	 */
	protected void sequence_Import(EObject context, Import semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, UiPackage.Literals.IMPORT__IMPORTED_NAMESPACE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, UiPackage.Literals.IMPORT__IMPORTED_NAMESPACE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getImportAccess().getImportedNamespaceFQNParserRuleCall_1_0(), semanticObject.getImportedNamespace());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     UI_For_LocalClass=[Class|FQN]
	 */
	protected void sequence_LocalClass(EObject context, LocalClass semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, VpuiPackage.Literals.LOCAL_CLASS__UI_FOR_LOCAL_CLASS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, VpuiPackage.Literals.LOCAL_CLASS__UI_FOR_LOCAL_CLASS));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getLocalClassAccess().getUI_For_LocalClassClassFQNParserRuleCall_2_0_1(), semanticObject.getUI_For_LocalClass());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         name=EString? 
	 *         label=EString? 
	 *         description=EString? 
	 *         (UI_fields+=UIField UI_fields+=UIField*)? 
	 *         (subContainers+=UIContainer subContainers+=UIContainer*)?
	 *     )
	 */
	protected void sequence_UIContainer(EObject context, UIContainer semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=FQN UIs+=UI*)
	 */
	protected void sequence_UIDescription(EObject context, UIDescription semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=EString label=EString? description=EString? type=UI_Field_Type? Mapping=FieldMapping)
	 */
	protected void sequence_UIField(EObject context, UIField semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=EString? UI_DataSource=DataSource? label=EString? UI_Containers+=UIContainer*)
	 */
	protected void sequence_UI(EObject context, UI semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (imports+=Import* uiDescription=Aspect)
	 */
	protected void sequence_UserInterface(EObject context, UserInterface semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}

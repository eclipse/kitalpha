/*******************************************************************************
 * Copyright (c) 2017, 2020 Thales Global Services S.A.S.
 *  This program and the accompanying materials are made available under the
 *  terms of the Eclipse Public License 2.0 which is available at
 *  http://www.eclipse.org/legal/epl-2.0
 *  
 *  SPDX-License-Identifier: EPL-2.0
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
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == UiPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case UiPackage.IMPORT:
				sequence_Import(context, (Import) semanticObject); 
				return; 
			case UiPackage.USER_INTERFACE:
				sequence_UserInterface(context, (UserInterface) semanticObject); 
				return; 
			}
		else if (epackage == VpuiPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
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
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     FieldMapping returns FieldMapping
	 *
	 * Constraint:
	 *     UI_Field_Mapped_To=[AbstractFeature|FQN]?
	 */
	protected void sequence_FieldMapping(ISerializationContext context, FieldMapping semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Import returns Import
	 *
	 * Constraint:
	 *     importedNamespace=FQN
	 */
	protected void sequence_Import(ISerializationContext context, Import semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, UiPackage.Literals.IMPORT__IMPORTED_NAMESPACE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, UiPackage.Literals.IMPORT__IMPORTED_NAMESPACE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getImportAccess().getImportedNamespaceFQNParserRuleCall_1_0(), semanticObject.getImportedNamespace());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     DataSource returns LocalClass
	 *     LocalClass returns LocalClass
	 *
	 * Constraint:
	 *     UI_For_LocalClass=[Class|FQN]
	 */
	protected void sequence_LocalClass(ISerializationContext context, LocalClass semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, VpuiPackage.Literals.LOCAL_CLASS__UI_FOR_LOCAL_CLASS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, VpuiPackage.Literals.LOCAL_CLASS__UI_FOR_LOCAL_CLASS));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getLocalClassAccess().getUI_For_LocalClassClassFQNParserRuleCall_2_0_1(), semanticObject.getUI_For_LocalClass());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     DisplayableElement returns UIContainer
	 *     UIContainer returns UIContainer
	 *
	 * Constraint:
	 *     (
	 *         name=EString? 
	 *         label=EString? 
	 *         description=EString? 
	 *         (UI_fields+=UIField UI_fields+=UIField*)? 
	 *         (subContainers+=UIContainer subContainers+=UIContainer*)?
	 *     )
	 */
	protected void sequence_UIContainer(ISerializationContext context, UIContainer semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Aspect returns UIDescription
	 *     UIDescription returns UIDescription
	 *
	 * Constraint:
	 *     (name=FQN UIs+=UI*)
	 */
	protected void sequence_UIDescription(ISerializationContext context, UIDescription semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     DisplayableElement returns UIField
	 *     UIField returns UIField
	 *
	 * Constraint:
	 *     (name=EString label=EString? description=EString? type=UI_Field_Type? Mapping=FieldMapping)
	 */
	protected void sequence_UIField(ISerializationContext context, UIField semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     DisplayableElement returns UI
	 *     UI returns UI
	 *
	 * Constraint:
	 *     (name=EString? UI_DataSource=DataSource? label=EString? UI_Containers+=UIContainer*)
	 */
	protected void sequence_UI(ISerializationContext context, UI semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     UserInterface returns UserInterface
	 *
	 * Constraint:
	 *     (imports+=Import* uiDescription=Aspect)
	 */
	protected void sequence_UserInterface(ISerializationContext context, UserInterface semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
}

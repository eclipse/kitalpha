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
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.commondata.CommondataPackage;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.commondata.ExternalAssociation;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.commondata.ExternalAttribute;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.commondata.ExternalClass;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.commondata.LocalAssociation;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.commondata.LocalAttribute;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.commondata.LocalClass;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.diagram.expression.DomainElement;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.diagram.expression.Expression;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.diagram.expression.ExpressionPackage;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.diagram.expression.JavaElement;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.diagram.expression.StringElement;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.ActionSet;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.BasicDecorator;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.BasicStyle;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.BorderedNode;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.Condition;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.Container;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.ContainerChildren;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.ContainerDescription;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.Create;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.DecoratorSet;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.Delete;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.Diagram;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.DiagramExtension;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.DiagramSet;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.DomainContainer;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.Drop;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.Edge;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.EdgeDescription;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.EdgeDomainAssociation;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.EdgeDomainElement;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.EdgeImport;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.EdgeStyle;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.FlatStyle;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.HistogramSection;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.HistogramStyle;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.ImageStyle;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.Label;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.MappingBasedDecorator;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.MappingSet;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.Node;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.NodeChildren;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.NodeDescription;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.NodeDomainElement;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.OpenAction;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.ReconnectEdge;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.SemanticBasedDecorator;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.VpdiagramPackage;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.BundledImageCustomization;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.ColorCustomization;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.ContainerStyleCustomization;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.ContainerWorkspaceImageCustomization;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.CustomizationExpression;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.Customizations;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.DotCustomization;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.EdgeStyleCustomization;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.EllipseCustomization;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.FlatContainerStyleCustomization;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.GaugeCustomization;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.LabelAlignmentCustomization;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.LabelCustomization;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.LozengeCustomization;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.NodeStyleCustomization;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.NodeWorkspaceImageCustomization;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.ShapeContainerStyleCustomization;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.SquareCustomization;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.StyleCustomizationDescriptions;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.StyleCustomizationReuse;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.VpstylecustomizationPackage;
import org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram.DiagramPackage;
import org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram.Diagrams;
import org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram.ImportGroup;
import org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram.ImportNameSpace;
import org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.VpdiagramGrammarAccess;

@SuppressWarnings("all")
public class VpdiagramSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private VpdiagramGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == CommondataPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case CommondataPackage.EXTERNAL_ASSOCIATION:
				sequence_ExternalAssociation(context, (ExternalAssociation) semanticObject); 
				return; 
			case CommondataPackage.EXTERNAL_ATTRIBUTE:
				sequence_ExternalAttribute(context, (ExternalAttribute) semanticObject); 
				return; 
			case CommondataPackage.EXTERNAL_CLASS:
				sequence_ExternalClass(context, (ExternalClass) semanticObject); 
				return; 
			case CommondataPackage.LOCAL_ASSOCIATION:
				sequence_LocalAssociation(context, (LocalAssociation) semanticObject); 
				return; 
			case CommondataPackage.LOCAL_ATTRIBUTE:
				sequence_LocalAttribute(context, (LocalAttribute) semanticObject); 
				return; 
			case CommondataPackage.LOCAL_CLASS:
				sequence_LocalClass2(context, (LocalClass) semanticObject); 
				return; 
			}
		else if (epackage == DiagramPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case DiagramPackage.DIAGRAMS:
				sequence_Diagrams(context, (Diagrams) semanticObject); 
				return; 
			case DiagramPackage.IMPORT_GROUP:
				sequence_ImportGroup(context, (ImportGroup) semanticObject); 
				return; 
			case DiagramPackage.IMPORT_NAME_SPACE:
				sequence_ImportNameSpace(context, (ImportNameSpace) semanticObject); 
				return; 
			}
		else if (epackage == ExpressionPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case ExpressionPackage.DOMAIN_ELEMENT:
				sequence_DomainElement(context, (DomainElement) semanticObject); 
				return; 
			case ExpressionPackage.EXPRESSION:
				sequence_Expression(context, (Expression) semanticObject); 
				return; 
			case ExpressionPackage.JAVA_ELEMENT:
				sequence_JavaElement(context, (JavaElement) semanticObject); 
				return; 
			case ExpressionPackage.STRING_ELEMENT:
				sequence_StringElement(context, (StringElement) semanticObject); 
				return; 
			}
		else if (epackage == VpdiagramPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case VpdiagramPackage.ACTION_SET:
				sequence_ActionSet(context, (ActionSet) semanticObject); 
				return; 
			case VpdiagramPackage.BASIC_DECORATOR:
				sequence_Basic(context, (BasicDecorator) semanticObject); 
				return; 
			case VpdiagramPackage.BASIC_STYLE:
				sequence_BasicStyle(context, (BasicStyle) semanticObject); 
				return; 
			case VpdiagramPackage.BORDERED_NODE:
				sequence_BorderedNode(context, (BorderedNode) semanticObject); 
				return; 
			case VpdiagramPackage.CONDITION:
				sequence_Condition(context, (Condition) semanticObject); 
				return; 
			case VpdiagramPackage.CONTAINER:
				sequence_Container(context, (Container) semanticObject); 
				return; 
			case VpdiagramPackage.CONTAINER_CHILDREN:
				sequence_ContainerChildren(context, (ContainerChildren) semanticObject); 
				return; 
			case VpdiagramPackage.CONTAINER_DESCRIPTION:
				sequence_ContainerDescription(context, (ContainerDescription) semanticObject); 
				return; 
			case VpdiagramPackage.CREATE:
				sequence_Create(context, (Create) semanticObject); 
				return; 
			case VpdiagramPackage.DECORATOR_SET:
				sequence_DecoratorSet(context, (DecoratorSet) semanticObject); 
				return; 
			case VpdiagramPackage.DELETE:
				sequence_Delete(context, (Delete) semanticObject); 
				return; 
			case VpdiagramPackage.DIAGRAM:
				sequence_Diagram(context, (Diagram) semanticObject); 
				return; 
			case VpdiagramPackage.DIAGRAM_EXTENSION:
				sequence_DiagramExtension(context, (DiagramExtension) semanticObject); 
				return; 
			case VpdiagramPackage.DIAGRAM_SET:
				sequence_DiagramSet(context, (DiagramSet) semanticObject); 
				return; 
			case VpdiagramPackage.DOMAIN_CONTAINER:
				sequence_DomainContainer(context, (DomainContainer) semanticObject); 
				return; 
			case VpdiagramPackage.DROP:
				sequence_Drop(context, (Drop) semanticObject); 
				return; 
			case VpdiagramPackage.EDGE:
				sequence_Edge(context, (Edge) semanticObject); 
				return; 
			case VpdiagramPackage.EDGE_DESCRIPTION:
				sequence_EdgeDescription(context, (EdgeDescription) semanticObject); 
				return; 
			case VpdiagramPackage.EDGE_DOMAIN_ASSOCIATION:
				sequence_EdgeDomainAssociation(context, (EdgeDomainAssociation) semanticObject); 
				return; 
			case VpdiagramPackage.EDGE_DOMAIN_ELEMENT:
				sequence_EdgeDomainElement(context, (EdgeDomainElement) semanticObject); 
				return; 
			case VpdiagramPackage.EDGE_IMPORT:
				sequence_EdgeImport(context, (EdgeImport) semanticObject); 
				return; 
			case VpdiagramPackage.EDGE_STYLE:
				sequence_EdgeStyle(context, (EdgeStyle) semanticObject); 
				return; 
			case VpdiagramPackage.FLAT_STYLE:
				sequence_FlatStyle(context, (FlatStyle) semanticObject); 
				return; 
			case VpdiagramPackage.HISTOGRAM_SECTION:
				sequence_HistogramSection(context, (HistogramSection) semanticObject); 
				return; 
			case VpdiagramPackage.HISTOGRAM_STYLE:
				sequence_HistogramStyle(context, (HistogramStyle) semanticObject); 
				return; 
			case VpdiagramPackage.IMAGE_STYLE:
				sequence_ImageStyle(context, (ImageStyle) semanticObject); 
				return; 
			case VpdiagramPackage.LABEL:
				sequence_Label(context, (Label) semanticObject); 
				return; 
			case VpdiagramPackage.MAPPING_BASED_DECORATOR:
				sequence_MappingBased(context, (MappingBasedDecorator) semanticObject); 
				return; 
			case VpdiagramPackage.MAPPING_SET:
				sequence_MappingSet(context, (MappingSet) semanticObject); 
				return; 
			case VpdiagramPackage.NODE:
				sequence_Node(context, (Node) semanticObject); 
				return; 
			case VpdiagramPackage.NODE_CHILDREN:
				sequence_NodeChildren(context, (NodeChildren) semanticObject); 
				return; 
			case VpdiagramPackage.NODE_DESCRIPTION:
				sequence_NodeDescription(context, (NodeDescription) semanticObject); 
				return; 
			case VpdiagramPackage.NODE_DOMAIN_ELEMENT:
				sequence_NodeDomainElement(context, (NodeDomainElement) semanticObject); 
				return; 
			case VpdiagramPackage.OPEN_ACTION:
				sequence_OpenAction(context, (OpenAction) semanticObject); 
				return; 
			case VpdiagramPackage.RECONNECT_EDGE:
				sequence_ReconnectEdge(context, (ReconnectEdge) semanticObject); 
				return; 
			case VpdiagramPackage.SEMANTIC_BASED_DECORATOR:
				sequence_SemanticBased(context, (SemanticBasedDecorator) semanticObject); 
				return; 
			}
		else if (epackage == VpstylecustomizationPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case VpstylecustomizationPackage.BUNDLED_IMAGE_CUSTOMIZATION:
				sequence_BundledImageCustomization(context, (BundledImageCustomization) semanticObject); 
				return; 
			case VpstylecustomizationPackage.COLOR_CUSTOMIZATION:
				sequence_ColorCustomization(context, (ColorCustomization) semanticObject); 
				return; 
			case VpstylecustomizationPackage.CONTAINER_STYLE_CUSTOMIZATION:
				sequence_ContainerStyleCustomization(context, (ContainerStyleCustomization) semanticObject); 
				return; 
			case VpstylecustomizationPackage.CONTAINER_WORKSPACE_IMAGE_CUSTOMIZATION:
				sequence_ContainerWorkspaceImageCustomization(context, (ContainerWorkspaceImageCustomization) semanticObject); 
				return; 
			case VpstylecustomizationPackage.CUSTOMIZATION_EXPRESSION:
				sequence_CustomizationExpression(context, (CustomizationExpression) semanticObject); 
				return; 
			case VpstylecustomizationPackage.CUSTOMIZATIONS:
				sequence_Customizations(context, (Customizations) semanticObject); 
				return; 
			case VpstylecustomizationPackage.DOT_CUSTOMIZATION:
				sequence_DotCustomization(context, (DotCustomization) semanticObject); 
				return; 
			case VpstylecustomizationPackage.EDGE_STYLE_CUSTOMIZATION:
				sequence_EdgeStyleCustomization(context, (EdgeStyleCustomization) semanticObject); 
				return; 
			case VpstylecustomizationPackage.ELLIPSE_CUSTOMIZATION:
				sequence_EllipseCustomization(context, (EllipseCustomization) semanticObject); 
				return; 
			case VpstylecustomizationPackage.FLAT_CONTAINER_STYLE_CUSTOMIZATION:
				sequence_FlatContainerStyleCustomization(context, (FlatContainerStyleCustomization) semanticObject); 
				return; 
			case VpstylecustomizationPackage.GAUGE_CUSTOMIZATION:
				sequence_GaugeCustomization(context, (GaugeCustomization) semanticObject); 
				return; 
			case VpstylecustomizationPackage.LABEL_ALIGNMENT_CUSTOMIZATION:
				sequence_LabelAlignementCustomization(context, (LabelAlignmentCustomization) semanticObject); 
				return; 
			case VpstylecustomizationPackage.LABEL_CUSTOMIZATION:
				sequence_LabelCustomization(context, (LabelCustomization) semanticObject); 
				return; 
			case VpstylecustomizationPackage.LOZENGE_CUSTOMIZATION:
				sequence_LozengeCustomization(context, (LozengeCustomization) semanticObject); 
				return; 
			case VpstylecustomizationPackage.NODE_STYLE_CUSTOMIZATION:
				sequence_NodeStyleCustomization(context, (NodeStyleCustomization) semanticObject); 
				return; 
			case VpstylecustomizationPackage.NODE_WORKSPACE_IMAGE_CUSTOMIZATION:
				sequence_NodeWorkspaceImageCustomization(context, (NodeWorkspaceImageCustomization) semanticObject); 
				return; 
			case VpstylecustomizationPackage.SHAPE_CONTAINER_STYLE_CUSTOMIZATION:
				sequence_ShapeContainerStyleCustomization(context, (ShapeContainerStyleCustomization) semanticObject); 
				return; 
			case VpstylecustomizationPackage.SQUARE_CUSTOMIZATION:
				sequence_SquareCustomization(context, (SquareCustomization) semanticObject); 
				return; 
			case VpstylecustomizationPackage.STYLE_CUSTOMIZATION_DESCRIPTIONS:
				sequence_StyleCustomizationDescriptions(context, (StyleCustomizationDescriptions) semanticObject); 
				return; 
			case VpstylecustomizationPackage.STYLE_CUSTOMIZATION_REUSE:
				sequence_StyleCustomizationReuse(context, (StyleCustomizationReuse) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     ActionSet returns ActionSet
	 *
	 * Constraint:
	 *     (actions+=Action* openActions+=OpenAction*)
	 */
	protected void sequence_ActionSet(ISerializationContext context, ActionSet semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     AbstractNodeStyle returns BasicStyle
	 *     BasicStyle returns BasicStyle
	 *
	 * Constraint:
	 *     (borderColor=SystemColors? backgroundColor=SystemColors? form=Node_Form?)
	 */
	protected void sequence_BasicStyle(ISerializationContext context, BasicStyle semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Decorator returns BasicDecorator
	 *     Basic returns BasicDecorator
	 *
	 * Constraint:
	 *     (
	 *         name=EString 
	 *         position=Position? 
	 *         direction=DecorationDistributionDirection? 
	 *         icon=STRING? 
	 *         precondition=ExpressionElement? 
	 *         tooltip=ExpressionElement?
	 *     )
	 */
	protected void sequence_Basic(ISerializationContext context, BasicDecorator semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     DiagramElement returns BorderedNode
	 *     AbstractNode returns BorderedNode
	 *     BorderedNode returns BorderedNode
	 *
	 * Constraint:
	 *     (name=EString imports=[NodeMapping|FQN]? the_domain=NodeDomainElement? synchronizationMode=SynchronizationMode? style+=NodeDescription*)
	 */
	protected void sequence_BorderedNode(ISerializationContext context, BorderedNode semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     SpecificNodeStyleCustomization returns BundledImageCustomization
	 *     BundledImageCustomization returns BundledImageCustomization
	 *
	 * Constraint:
	 *     shape=BundledImageShape
	 */
	protected void sequence_BundledImageCustomization(ISerializationContext context, BundledImageCustomization semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, VpstylecustomizationPackage.Literals.BUNDLED_IMAGE_CUSTOMIZATION__SHAPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, VpstylecustomizationPackage.Literals.BUNDLED_IMAGE_CUSTOMIZATION__SHAPE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getBundledImageCustomizationAccess().getShapeBundledImageShapeEnumRuleCall_3_0(), semanticObject.getShape());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     AbstractCustomization returns ColorCustomization
	 *     ColorCustomization returns ColorCustomization
	 *
	 * Constraint:
	 *     (colorUseCase=ColorUseCase (appliedOn+=[EObject|STRING] appliedOn+=[EObject|STRING]*)? applyonAll?='over-all-colors'? color=SystemColors)
	 */
	protected void sequence_ColorCustomization(ISerializationContext context, ColorCustomization semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Condition returns Condition
	 *
	 * Constraint:
	 *     expression=ForeignExpressionElement
	 */
	protected void sequence_Condition(ISerializationContext context, Condition semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, VpdiagramPackage.Literals.CONDITION__EXPRESSION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, VpdiagramPackage.Literals.CONDITION__EXPRESSION));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getConditionAccess().getExpressionForeignExpressionElementParserRuleCall_2_0(), semanticObject.getExpression());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     ContainerChildren returns ContainerChildren
	 *
	 * Constraint:
	 *     ((reused_nodes+=[AbstractNode|FQN] reused_nodes+=[AbstractNode|FQN]*)? owned_nodes+=AbstractNode*)
	 */
	protected void sequence_ContainerChildren(ISerializationContext context, ContainerChildren semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     AbstractDescription returns ContainerDescription
	 *     ContainerDescription returns ContainerDescription
	 *
	 * Constraint:
	 *     (condition=Condition? node_Label=Label? style=AbstractContainerStyle?)
	 */
	protected void sequence_ContainerDescription(ISerializationContext context, ContainerDescription semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     AbstractCustomization returns ContainerStyleCustomization
	 *     AbstractNodeStyleCustomization returns ContainerStyleCustomization
	 *     ContainerStyleCustomization returns ContainerStyleCustomization
	 *
	 * Constraint:
	 *     (
	 *         (appliedOn+=[ContainerStyleDescription|STRING] appliedOn+=[ContainerStyleDescription|STRING]*)? 
	 *         applyonAll=EBoolean? 
	 *         arcWith=EInt? 
	 *         arcHeight=EInt? 
	 *         roundedCorner=EBoolean? 
	 *         tooltipExpression=CustomizationExpression? 
	 *         borderSizeComputationExpression=CustomizationExpression? 
	 *         ownedSpecificContainerStyleCustomization+=SpecificContainerStyleCustomization*
	 *     )
	 */
	protected void sequence_ContainerStyleCustomization(ISerializationContext context, ContainerStyleCustomization semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     SpecificContainerStyleCustomization returns ContainerWorkspaceImageCustomization
	 *     ContainerWorkspaceImageCustomization returns ContainerWorkspaceImageCustomization
	 *
	 * Constraint:
	 *     workspacePath=EString
	 */
	protected void sequence_ContainerWorkspaceImageCustomization(ISerializationContext context, ContainerWorkspaceImageCustomization semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, VpstylecustomizationPackage.Literals.CONTAINER_WORKSPACE_IMAGE_CUSTOMIZATION__WORKSPACE_PATH) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, VpstylecustomizationPackage.Literals.CONTAINER_WORKSPACE_IMAGE_CUSTOMIZATION__WORKSPACE_PATH));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getContainerWorkspaceImageCustomizationAccess().getWorkspacePathEStringParserRuleCall_3_0(), semanticObject.getWorkspacePath());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     DiagramElement returns Container
	 *     DiagramChildren returns Container
	 *     AbstractNode returns Container
	 *     Container returns Container
	 *
	 * Constraint:
	 *     (
	 *         name=EString 
	 *         imports=[ContainerMapping|FQN]? 
	 *         the_domain=NodeDomainElement? 
	 *         contentLayout=ContainerLayout? 
	 *         synchronizationMode=SynchronizationMode? 
	 *         style+=ContainerDescription* 
	 *         children=ContainerChildren?
	 *     )
	 */
	protected void sequence_Container(ISerializationContext context, Container semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Action returns Create
	 *     Create returns Create
	 *
	 * Constraint:
	 *     (
	 *         name=EString 
	 *         precondition=EString? 
	 *         label=STRING? 
	 *         tool_For=[DiagramElement|FQN] 
	 *         onlyTheView?='only-view'? 
	 *         icon=STRING?
	 *     )
	 */
	protected void sequence_Create(ISerializationContext context, Create semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     CustomizationExpression returns CustomizationExpression
	 *
	 * Constraint:
	 *     ownedExpressionElement=AbstractComputableElement
	 */
	protected void sequence_CustomizationExpression(ISerializationContext context, CustomizationExpression semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, VpstylecustomizationPackage.Literals.CUSTOMIZATION_EXPRESSION__OWNED_EXPRESSION_ELEMENT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, VpstylecustomizationPackage.Literals.CUSTOMIZATION_EXPRESSION__OWNED_EXPRESSION_ELEMENT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getCustomizationExpressionAccess().getOwnedExpressionElementAbstractComputableElementParserRuleCall_1_0(), semanticObject.getOwnedExpressionElement());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Customizations returns Customizations
	 *
	 * Constraint:
	 *     (
	 *         (ownedCustomizationDescriptions+=StyleCustomizationDescriptions ownedCustomizationDescriptions+=StyleCustomizationDescriptions*)? 
	 *         (ownedCustomizationReuse+=StyleCustomizationReuse ownedCustomizationReuse+=StyleCustomizationReuse*)?
	 *     )
	 */
	protected void sequence_Customizations(ISerializationContext context, Customizations semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     DecoratorSet returns DecoratorSet
	 *
	 * Constraint:
	 *     decorators+=Decorator*
	 */
	protected void sequence_DecoratorSet(ISerializationContext context, DecoratorSet semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Action returns Delete
	 *     Delete returns Delete
	 *
	 * Constraint:
	 *     (name=EString precondition=EString? label=STRING? tool_For=[DiagramElement|FQN])
	 */
	protected void sequence_Delete(ISerializationContext context, Delete semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     DiagramRepresentation returns DiagramExtension
	 *     DiagramExtension returns DiagramExtension
	 *
	 * Constraint:
	 *     (
	 *         name=STRING 
	 *         extented_diagram=[DiagramDescription|FQN]? 
	 *         the_MappingSet=MappingSet? 
	 *         the_ActionSet=ActionSet? 
	 *         the_DecoratorSet=DecoratorSet? 
	 *         ownedCustomizations=Customizations?
	 *     )
	 */
	protected void sequence_DiagramExtension(ISerializationContext context, DiagramExtension semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Aspect returns DiagramSet
	 *     DiagramSet returns DiagramSet
	 *
	 * Constraint:
	 *     (name=FQN diagrams+=DiagramRepresentation*)
	 */
	protected void sequence_DiagramSet(ISerializationContext context, DiagramSet semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     DiagramRepresentation returns Diagram
	 *     Diagram returns Diagram
	 *
	 * Constraint:
	 *     (
	 *         name=STRING 
	 *         description=STRING? 
	 *         the_domain=DomainContainer 
	 *         the_MappingSet=MappingSet? 
	 *         the_ActionSet=ActionSet? 
	 *         the_DecoratorSet=DecoratorSet?
	 *     )
	 */
	protected void sequence_Diagram(ISerializationContext context, Diagram semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Diagrams returns Diagrams
	 *
	 * Constraint:
	 *     (imports+=AbstractImport* diagrams=Aspect)
	 */
	protected void sequence_Diagrams(ISerializationContext context, Diagrams semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     DomainContainer returns DomainContainer
	 *
	 * Constraint:
	 *     the_domain=AbstractClass
	 */
	protected void sequence_DomainContainer(ISerializationContext context, DomainContainer semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, VpdiagramPackage.Literals.DOMAIN_CONTAINER__THE_DOMAIN) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, VpdiagramPackage.Literals.DOMAIN_CONTAINER__THE_DOMAIN));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getDomainContainerAccess().getThe_domainAbstractClassParserRuleCall_1_1_0(), semanticObject.getThe_domain());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     ExpressionElement returns DomainElement
	 *     ForeignExpressionElement returns DomainElement
	 *     DomainElement returns DomainElement
	 *
	 * Constraint:
	 *     attribute=[Attribute|FQN]
	 */
	protected void sequence_DomainElement(ISerializationContext context, DomainElement semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, ExpressionPackage.Literals.DOMAIN_ELEMENT__ATTRIBUTE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ExpressionPackage.Literals.DOMAIN_ELEMENT__ATTRIBUTE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getDomainElementAccess().getAttributeAttributeFQNParserRuleCall_1_0_1(), semanticObject.getAttribute());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     SpecificNodeStyleCustomization returns DotCustomization
	 *     DotCustomization returns DotCustomization
	 *
	 * Constraint:
	 *     strokeSizeComputationExpression=CustomizationExpression
	 */
	protected void sequence_DotCustomization(ISerializationContext context, DotCustomization semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, VpstylecustomizationPackage.Literals.DOT_CUSTOMIZATION__STROKE_SIZE_COMPUTATION_EXPRESSION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, VpstylecustomizationPackage.Literals.DOT_CUSTOMIZATION__STROKE_SIZE_COMPUTATION_EXPRESSION));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getDotCustomizationAccess().getStrokeSizeComputationExpressionCustomizationExpressionParserRuleCall_3_0(), semanticObject.getStrokeSizeComputationExpression());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Action returns Drop
	 *     Drop returns Drop
	 *
	 * Constraint:
	 *     (name=EString precondition=EString? label=STRING? tool_For=[DiagramElement|FQN])
	 */
	protected void sequence_Drop(ISerializationContext context, Drop semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     EdgeDescription returns EdgeDescription
	 *
	 * Constraint:
	 *     (condition=Condition? begin_Label=Label? center_label=Label? end_label=Label? style=EdgeStyle?)
	 */
	protected void sequence_EdgeDescription(ISerializationContext context, EdgeDescription semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     EdgeDomainAssociation returns EdgeDomainAssociation
	 *
	 * Constraint:
	 *     (target_query=STRING | target_Locator=AbstractAssociation2)
	 */
	protected void sequence_EdgeDomainAssociation(ISerializationContext context, EdgeDomainAssociation semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     EdgeDomainElement returns EdgeDomainElement
	 *
	 * Constraint:
	 *     (
	 *         the_Domain=AbstractClass 
	 *         (target_query=STRING | target_Locator=AbstractAssociation2) 
	 *         (source_query=STRING | source_Locator=AbstractAssociation2)
	 *     )
	 */
	protected void sequence_EdgeDomainElement(ISerializationContext context, EdgeDomainElement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     DiagramElement returns EdgeImport
	 *     DiagramChildren returns EdgeImport
	 *     AbstractEdge returns EdgeImport
	 *     EdgeImport returns EdgeImport
	 *
	 * Constraint:
	 *     (name=EString imports=[EdgeMapping|FQN] synchronizationMode=SynchronizationMode? e_description+=EdgeDescription*)
	 */
	protected void sequence_EdgeImport(ISerializationContext context, EdgeImport semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     AbstractCustomization returns EdgeStyleCustomization
	 *     EdgeStyleCustomization returns EdgeStyleCustomization
	 *
	 * Constraint:
	 *     (
	 *         (appliedOn+=[EdgeStyleDescription|STRING] appliedOn+=[EdgeStyleDescription|STRING]*)? 
	 *         applyonAll=EBoolean? 
	 *         sourceArrow=EdgeArrows? 
	 *         targetArrow=EdgeArrows? 
	 *         routingStyle=EdgeRouting? 
	 *         foldingStyle=FoldingStyle? 
	 *         (centeredSourceMappings+=[DiagramElementMapping|STRING] centeredSourceMappings+=[DiagramElementMapping|STRING]*)? 
	 *         (centeredTargetMappings+=[DiagramElementMapping|STRING] centeredTargetMappings+=[DiagramElementMapping|STRING]*)? 
	 *         beginLabelStyleDescription=[BeginLabelStyleDescription|STRING]? 
	 *         centerLabelStyleDescription=[CenterLabelStyleDescription|STRING]? 
	 *         endLabelStyleDescription=[EndLabelStyleDescription|STRING]? 
	 *         lineStyle=LineStyle? 
	 *         sizeComputationExpression=CustomizationExpression? 
	 *         endCentering=CenterStyle?
	 *     )
	 */
	protected void sequence_EdgeStyleCustomization(ISerializationContext context, EdgeStyleCustomization semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     EdgeStyle returns EdgeStyle
	 *
	 * Constraint:
	 *     (lineStyle=LineStyle? beginDecorator=EdgeArrows? endDecorator=EdgeArrows? color=SystemColors?)
	 */
	protected void sequence_EdgeStyle(ISerializationContext context, EdgeStyle semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     DiagramElement returns Edge
	 *     DiagramChildren returns Edge
	 *     AbstractEdge returns Edge
	 *     Edge returns Edge
	 *
	 * Constraint:
	 *     (
	 *         name=EString 
	 *         (the_domain=EdgeDomainAssociation | the_domain=EdgeDomainElement) 
	 *         synchronizationMode=SynchronizationMode? 
	 *         source+=[DiagramElement|FQN] 
	 *         source+=[DiagramElement|FQN]* 
	 *         target+=[DiagramElement|FQN] 
	 *         target+=[DiagramElement|FQN]* 
	 *         e_description+=EdgeDescription*
	 *     )
	 */
	protected void sequence_Edge(ISerializationContext context, Edge semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     SpecificNodeStyleCustomization returns EllipseCustomization
	 *     EllipseCustomization returns EllipseCustomization
	 *
	 * Constraint:
	 *     (horizontalDiameterComputationExpression=CustomizationExpression verticalDiameterComputationExpression=CustomizationExpression)
	 */
	protected void sequence_EllipseCustomization(ISerializationContext context, EllipseCustomization semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, VpstylecustomizationPackage.Literals.ELLIPSE_CUSTOMIZATION__HORIZONTAL_DIAMETER_COMPUTATION_EXPRESSION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, VpstylecustomizationPackage.Literals.ELLIPSE_CUSTOMIZATION__HORIZONTAL_DIAMETER_COMPUTATION_EXPRESSION));
			if (transientValues.isValueTransient(semanticObject, VpstylecustomizationPackage.Literals.ELLIPSE_CUSTOMIZATION__VERTICAL_DIAMETER_COMPUTATION_EXPRESSION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, VpstylecustomizationPackage.Literals.ELLIPSE_CUSTOMIZATION__VERTICAL_DIAMETER_COMPUTATION_EXPRESSION));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getEllipseCustomizationAccess().getHorizontalDiameterComputationExpressionCustomizationExpressionParserRuleCall_6_0(), semanticObject.getHorizontalDiameterComputationExpression());
		feeder.accept(grammarAccess.getEllipseCustomizationAccess().getVerticalDiameterComputationExpressionCustomizationExpressionParserRuleCall_9_0(), semanticObject.getVerticalDiameterComputationExpression());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Expression returns Expression
	 *
	 * Constraint:
	 *     (expressionElements+=ExpressionElement expressionElements+=ExpressionElement*)?
	 */
	protected void sequence_Expression(ISerializationContext context, Expression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     AbstractAssociation2 returns ExternalAssociation
	 *     ExternalAssociation returns ExternalAssociation
	 *
	 * Constraint:
	 *     reference=[EReference|FQN]
	 */
	protected void sequence_ExternalAssociation(ISerializationContext context, ExternalAssociation semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, CommondataPackage.Literals.EXTERNAL_ASSOCIATION__REFERENCE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CommondataPackage.Literals.EXTERNAL_ASSOCIATION__REFERENCE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getExternalAssociationAccess().getReferenceEReferenceFQNParserRuleCall_2_0_1(), semanticObject.getReference());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     AbstractAttribute returns ExternalAttribute
	 *     ExternalAttribute returns ExternalAttribute
	 *
	 * Constraint:
	 *     attribute=[EAttribute|FQN]
	 */
	protected void sequence_ExternalAttribute(ISerializationContext context, ExternalAttribute semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, CommondataPackage.Literals.EXTERNAL_ATTRIBUTE__ATTRIBUTE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CommondataPackage.Literals.EXTERNAL_ATTRIBUTE__ATTRIBUTE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getExternalAttributeAccess().getAttributeEAttributeFQNParserRuleCall_2_0_1(), semanticObject.getAttribute());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     AbstractClass returns ExternalClass
	 *     ExternalClass returns ExternalClass
	 *
	 * Constraint:
	 *     class=[EClass|FQN]
	 */
	protected void sequence_ExternalClass(ISerializationContext context, ExternalClass semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, CommondataPackage.Literals.EXTERNAL_CLASS__CLASS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CommondataPackage.Literals.EXTERNAL_CLASS__CLASS));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getExternalClassAccess().getClassEClassFQNParserRuleCall_2_0_1(), semanticObject.getClass_());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     SpecificContainerStyleCustomization returns FlatContainerStyleCustomization
	 *     FlatContainerStyleCustomization returns FlatContainerStyleCustomization
	 *
	 * Constraint:
	 *     backgroundStyle=BackgroundStyle
	 */
	protected void sequence_FlatContainerStyleCustomization(ISerializationContext context, FlatContainerStyleCustomization semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, VpstylecustomizationPackage.Literals.FLAT_CONTAINER_STYLE_CUSTOMIZATION__BACKGROUND_STYLE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, VpstylecustomizationPackage.Literals.FLAT_CONTAINER_STYLE_CUSTOMIZATION__BACKGROUND_STYLE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getFlatContainerStyleCustomizationAccess().getBackgroundStyleBackgroundStyleEnumRuleCall_3_0(), semanticObject.getBackgroundStyle());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     AbstractContainerStyle returns FlatStyle
	 *     FlatStyle returns FlatStyle
	 *
	 * Constraint:
	 *     (borderColor=SystemColors? (backgroundStyle=BackgroundStyle? backgroundColor=SystemColors)? forgroundColor=SystemColors?)
	 */
	protected void sequence_FlatStyle(ISerializationContext context, FlatStyle semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     SpecificNodeStyleCustomization returns GaugeCustomization
	 *     GaugeCustomization returns GaugeCustomization
	 *
	 * Constraint:
	 *     alignement=AlignmentKind
	 */
	protected void sequence_GaugeCustomization(ISerializationContext context, GaugeCustomization semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, VpstylecustomizationPackage.Literals.GAUGE_CUSTOMIZATION__ALIGNEMENT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, VpstylecustomizationPackage.Literals.GAUGE_CUSTOMIZATION__ALIGNEMENT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getGaugeCustomizationAccess().getAlignementAlignmentKindEnumRuleCall_3_0(), semanticObject.getAlignement());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     HistogramSection returns HistogramSection
	 *
	 * Constraint:
	 *     (
	 *         backgroundColor=SystemColors? 
	 *         forgroundColor=SystemColors? 
	 *         minValue=ForeignExpressionElement? 
	 *         value=ForeignExpressionElement? 
	 *         maxValue=ForeignExpressionElement?
	 *     )
	 */
	protected void sequence_HistogramSection(ISerializationContext context, HistogramSection semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     AbstractNodeStyle returns HistogramStyle
	 *     HistogramStyle returns HistogramStyle
	 *
	 * Constraint:
	 *     (borderColor=SystemColors? sections+=HistogramSection*)
	 */
	protected void sequence_HistogramStyle(ISerializationContext context, HistogramStyle semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     AbstractContainerStyle returns ImageStyle
	 *     AbstractNodeStyle returns ImageStyle
	 *     ImageStyle returns ImageStyle
	 *
	 * Constraint:
	 *     (borderColor=SystemColors? imagePath=STRING)
	 */
	protected void sequence_ImageStyle(ISerializationContext context, ImageStyle semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     AbstractImport returns ImportGroup
	 *     ImportGroup returns ImportGroup
	 *
	 * Constraint:
	 *     importedGroup=EString
	 */
	protected void sequence_ImportGroup(ISerializationContext context, ImportGroup semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, DiagramPackage.Literals.IMPORT_GROUP__IMPORTED_GROUP) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DiagramPackage.Literals.IMPORT_GROUP__IMPORTED_GROUP));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getImportGroupAccess().getImportedGroupEStringParserRuleCall_2_0(), semanticObject.getImportedGroup());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     AbstractImport returns ImportNameSpace
	 *     ImportNameSpace returns ImportNameSpace
	 *
	 * Constraint:
	 *     importedNamespace=FQN
	 */
	protected void sequence_ImportNameSpace(ISerializationContext context, ImportNameSpace semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, DiagramPackage.Literals.IMPORT_NAME_SPACE__IMPORTED_NAMESPACE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DiagramPackage.Literals.IMPORT_NAME_SPACE__IMPORTED_NAMESPACE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getImportNameSpaceAccess().getImportedNamespaceFQNParserRuleCall_1_0(), semanticObject.getImportedNamespace());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     AbstractComputableElement returns JavaElement
	 *     ExpressionElement returns JavaElement
	 *     ForeignExpressionElement returns JavaElement
	 *     JavaElement returns JavaElement
	 *
	 * Constraint:
	 *     method=FQN
	 */
	protected void sequence_JavaElement(ISerializationContext context, JavaElement semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, ExpressionPackage.Literals.JAVA_ELEMENT__METHOD) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ExpressionPackage.Literals.JAVA_ELEMENT__METHOD));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getJavaElementAccess().getMethodFQNParserRuleCall_2_0(), semanticObject.getMethod());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     LabelAlignementCustomization returns LabelAlignmentCustomization
	 *
	 * Constraint:
	 *     alignment=LabelAlignment
	 */
	protected void sequence_LabelAlignementCustomization(ISerializationContext context, LabelAlignmentCustomization semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, VpstylecustomizationPackage.Literals.LABEL_ALIGNMENT_CUSTOMIZATION__ALIGNMENT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, VpstylecustomizationPackage.Literals.LABEL_ALIGNMENT_CUSTOMIZATION__ALIGNMENT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getLabelAlignementCustomizationAccess().getAlignmentLabelAlignmentEnumRuleCall_3_0(), semanticObject.getAlignment());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     AbstractCustomization returns LabelCustomization
	 *     LabelCustomization returns LabelCustomization
	 *
	 * Constraint:
	 *     (
	 *         (appliedOn+=[BasicLabelStyleDescription|STRING] appliedOn+=[BasicLabelStyleDescription|STRING]*)? 
	 *         applyonAll=EBoolean? 
	 *         ownedLabelAlignment=LabelAlignementCustomization? 
	 *         size=EInt? 
	 *         format=FontFormat? 
	 *         color=SystemColors 
	 *         (showIcon=EBoolean iconPath=EString)? 
	 *         expression=CustomizationExpression?
	 *     )
	 */
	protected void sequence_LabelCustomization(ISerializationContext context, LabelCustomization semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Label returns Label
	 *
	 * Constraint:
	 *     (value=Expression bold?='bold'? italic?='italic'? color=SystemColors? size=EInt?)
	 */
	protected void sequence_Label(ISerializationContext context, Label semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     AbstractAssociation2 returns LocalAssociation
	 *     LocalAssociation returns LocalAssociation
	 *
	 * Constraint:
	 *     reference=[AbstractAssociation|FQN]
	 */
	protected void sequence_LocalAssociation(ISerializationContext context, LocalAssociation semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, CommondataPackage.Literals.LOCAL_ASSOCIATION__REFERENCE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CommondataPackage.Literals.LOCAL_ASSOCIATION__REFERENCE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getLocalAssociationAccess().getReferenceAbstractAssociationFQNParserRuleCall_1_0_1(), semanticObject.getReference());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     AbstractAttribute returns LocalAttribute
	 *     LocalAttribute returns LocalAttribute
	 *
	 * Constraint:
	 *     attribute=[Attribute|FQN]
	 */
	protected void sequence_LocalAttribute(ISerializationContext context, LocalAttribute semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, CommondataPackage.Literals.LOCAL_ATTRIBUTE__ATTRIBUTE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CommondataPackage.Literals.LOCAL_ATTRIBUTE__ATTRIBUTE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getLocalAttributeAccess().getAttributeAttributeFQNParserRuleCall_1_0_1(), semanticObject.getAttribute());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     AbstractClass returns LocalClass
	 *     LocalClass2 returns LocalClass
	 *
	 * Constraint:
	 *     class=[Class|FQN]
	 */
	protected void sequence_LocalClass2(ISerializationContext context, LocalClass semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, CommondataPackage.Literals.LOCAL_CLASS__CLASS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CommondataPackage.Literals.LOCAL_CLASS__CLASS));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getLocalClass2Access().getClassClassFQNParserRuleCall_1_0_1(), semanticObject.getClass_());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     SpecificNodeStyleCustomization returns LozengeCustomization
	 *     LozengeCustomization returns LozengeCustomization
	 *
	 * Constraint:
	 *     (widthComputationExpression=CustomizationExpression heightComputationExpression=CustomizationExpression)
	 */
	protected void sequence_LozengeCustomization(ISerializationContext context, LozengeCustomization semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, VpstylecustomizationPackage.Literals.LOZENGE_CUSTOMIZATION__WIDTH_COMPUTATION_EXPRESSION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, VpstylecustomizationPackage.Literals.LOZENGE_CUSTOMIZATION__WIDTH_COMPUTATION_EXPRESSION));
			if (transientValues.isValueTransient(semanticObject, VpstylecustomizationPackage.Literals.LOZENGE_CUSTOMIZATION__HEIGHT_COMPUTATION_EXPRESSION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, VpstylecustomizationPackage.Literals.LOZENGE_CUSTOMIZATION__HEIGHT_COMPUTATION_EXPRESSION));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getLozengeCustomizationAccess().getWidthComputationExpressionCustomizationExpressionParserRuleCall_6_0(), semanticObject.getWidthComputationExpression());
		feeder.accept(grammarAccess.getLozengeCustomizationAccess().getHeightComputationExpressionCustomizationExpressionParserRuleCall_9_0(), semanticObject.getHeightComputationExpression());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Decorator returns MappingBasedDecorator
	 *     MappingBased returns MappingBasedDecorator
	 *
	 * Constraint:
	 *     (
	 *         name=EString 
	 *         position=Position? 
	 *         direction=DecorationDistributionDirection? 
	 *         icon=STRING? 
	 *         precondition=ExpressionElement? 
	 *         tooltip=ExpressionElement? 
	 *         (
	 *             (externalMappings+=[DiagramElementMapping|STRING] externalMappings+=[DiagramElementMapping|STRING]* internalMappings+=[DiagramElement|STRING]*) | 
	 *             (internalMappings+=[DiagramElement|STRING]? internalMappings+=[DiagramElement|STRING]*)
	 *         )
	 *     )
	 */
	protected void sequence_MappingBased(ISerializationContext context, MappingBasedDecorator semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     MappingSet returns MappingSet
	 *
	 * Constraint:
	 *     diagram_Elements+=DiagramChildren*
	 */
	protected void sequence_MappingSet(ISerializationContext context, MappingSet semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     NodeChildren returns NodeChildren
	 *
	 * Constraint:
	 *     ((reused_boderednodes+=[BorderedNode|FQN] reused_boderednodes+=[BorderedNode|FQN]*)? owned_boderednodes+=BorderedNode*)
	 */
	protected void sequence_NodeChildren(ISerializationContext context, NodeChildren semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     AbstractDescription returns NodeDescription
	 *     NodeDescription returns NodeDescription
	 *
	 * Constraint:
	 *     (condition=Condition? (node_Label=Label label_position=LabelPosition? label_alignement=LabelAlignment?)? style=AbstractNodeStyle?)
	 */
	protected void sequence_NodeDescription(ISerializationContext context, NodeDescription semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     NodeDomainElement returns NodeDomainElement
	 *
	 * Constraint:
	 *     (domain_Class=AbstractClass (query=STRING | chlidren_list=AbstractAssociation2)?)
	 */
	protected void sequence_NodeDomainElement(ISerializationContext context, NodeDomainElement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     AbstractCustomization returns NodeStyleCustomization
	 *     AbstractNodeStyleCustomization returns NodeStyleCustomization
	 *     NodeStyleCustomization returns NodeStyleCustomization
	 *
	 * Constraint:
	 *     (
	 *         (appliedOn+=[NodeStyleDescription|STRING] appliedOn+=[NodeStyleDescription|STRING]*)? 
	 *         applyonAll=EBoolean? 
	 *         labelPosition=LabelPosition? 
	 *         hideLabelByDefault=EBoolean? 
	 *         resizeKind=ResizeKind? 
	 *         tooltipExpression=CustomizationExpression? 
	 *         borderSizeComputationExpression=CustomizationExpression? 
	 *         sizeComputationExpression=CustomizationExpression? 
	 *         ownedSpecificNodeStyleCustomization+=SpecificNodeStyleCustomization*
	 *     )
	 */
	protected void sequence_NodeStyleCustomization(ISerializationContext context, NodeStyleCustomization semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     SpecificNodeStyleCustomization returns NodeWorkspaceImageCustomization
	 *     NodeWorkspaceImageCustomization returns NodeWorkspaceImageCustomization
	 *
	 * Constraint:
	 *     workspacePath=EString
	 */
	protected void sequence_NodeWorkspaceImageCustomization(ISerializationContext context, NodeWorkspaceImageCustomization semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, VpstylecustomizationPackage.Literals.NODE_WORKSPACE_IMAGE_CUSTOMIZATION__WORKSPACE_PATH) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, VpstylecustomizationPackage.Literals.NODE_WORKSPACE_IMAGE_CUSTOMIZATION__WORKSPACE_PATH));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getNodeWorkspaceImageCustomizationAccess().getWorkspacePathEStringParserRuleCall_3_0(), semanticObject.getWorkspacePath());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     DiagramElement returns Node
	 *     DiagramChildren returns Node
	 *     AbstractNode returns Node
	 *     Node returns Node
	 *
	 * Constraint:
	 *     (
	 *         name=EString 
	 *         imports=[NodeMapping|FQN]? 
	 *         the_domain=NodeDomainElement? 
	 *         synchronizationMode=SynchronizationMode? 
	 *         style+=NodeDescription* 
	 *         children=NodeChildren?
	 *     )
	 */
	protected void sequence_Node(ISerializationContext context, Node semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     OpenAction returns OpenAction
	 *
	 * Constraint:
	 *     (name=EString precondition=EString? label=STRING? icon=STRING?)
	 */
	protected void sequence_OpenAction(ISerializationContext context, OpenAction semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Action returns ReconnectEdge
	 *     ReconnectEdge returns ReconnectEdge
	 *
	 * Constraint:
	 *     (name=EString precondition=EString? label=STRING? tool_For=[DiagramElement|FQN])
	 */
	protected void sequence_ReconnectEdge(ISerializationContext context, ReconnectEdge semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Decorator returns SemanticBasedDecorator
	 *     SemanticBased returns SemanticBasedDecorator
	 *
	 * Constraint:
	 *     (
	 *         name=EString 
	 *         position=Position? 
	 *         direction=DecorationDistributionDirection? 
	 *         icon=STRING? 
	 *         precondition=ExpressionElement? 
	 *         tooltip=ExpressionElement? 
	 *         domain=AbstractClass?
	 *     )
	 */
	protected void sequence_SemanticBased(ISerializationContext context, SemanticBasedDecorator semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     SpecificContainerStyleCustomization returns ShapeContainerStyleCustomization
	 *     ShapeContainerStyleCustomization returns ShapeContainerStyleCustomization
	 *
	 * Constraint:
	 *     shape=ContainerShape
	 */
	protected void sequence_ShapeContainerStyleCustomization(ISerializationContext context, ShapeContainerStyleCustomization semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, VpstylecustomizationPackage.Literals.SHAPE_CONTAINER_STYLE_CUSTOMIZATION__SHAPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, VpstylecustomizationPackage.Literals.SHAPE_CONTAINER_STYLE_CUSTOMIZATION__SHAPE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getShapeContainerStyleCustomizationAccess().getShapeContainerShapeEnumRuleCall_3_0(), semanticObject.getShape());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     SpecificNodeStyleCustomization returns SquareCustomization
	 *     SquareCustomization returns SquareCustomization
	 *
	 * Constraint:
	 *     (width=EInt height=EInt)
	 */
	protected void sequence_SquareCustomization(ISerializationContext context, SquareCustomization semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, VpstylecustomizationPackage.Literals.SQUARE_CUSTOMIZATION__WIDTH) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, VpstylecustomizationPackage.Literals.SQUARE_CUSTOMIZATION__WIDTH));
			if (transientValues.isValueTransient(semanticObject, VpstylecustomizationPackage.Literals.SQUARE_CUSTOMIZATION__HEIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, VpstylecustomizationPackage.Literals.SQUARE_CUSTOMIZATION__HEIGHT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getSquareCustomizationAccess().getWidthEIntParserRuleCall_6_0(), semanticObject.getWidth());
		feeder.accept(grammarAccess.getSquareCustomizationAccess().getHeightEIntParserRuleCall_9_0(), semanticObject.getHeight());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     AbstractComputableElement returns StringElement
	 *     ExpressionElement returns StringElement
	 *     StringElement returns StringElement
	 *
	 * Constraint:
	 *     value=STRING
	 */
	protected void sequence_StringElement(ISerializationContext context, StringElement semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, ExpressionPackage.Literals.STRING_ELEMENT__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ExpressionPackage.Literals.STRING_ELEMENT__VALUE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getStringElementAccess().getValueSTRINGTerminalRuleCall_1_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     StyleCustomizationDescriptions returns StyleCustomizationDescriptions
	 *
	 * Constraint:
	 *     (
	 *         name=ID 
	 *         precondtionExpression=CustomizationExpression? 
	 *         (ownedCustomizations+=AbstractCustomization ownedCustomizations+=AbstractCustomization*)?
	 *     )
	 */
	protected void sequence_StyleCustomizationDescriptions(ISerializationContext context, StyleCustomizationDescriptions semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     StyleCustomizationReuse returns StyleCustomizationReuse
	 *
	 * Constraint:
	 *     (
	 *         reusedCustomization+=[EStructuralFeatureCustomization|STRING] 
	 *         reusedCustomization+=[EStructuralFeatureCustomization|STRING]* 
	 *         appliedOn+=[EObject|STRING] 
	 *         appliedOn+=[EObject|STRING]*
	 *     )
	 */
	protected void sequence_StyleCustomizationReuse(ISerializationContext context, StyleCustomizationReuse semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
}

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
package org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.contentassist.antlr;

import java.util.Collection;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;

import com.google.inject.Inject;

import org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.VpdiagramGrammarAccess;

public class VpdiagramParser extends AbstractContentAssistParser {
	
	@Inject
	private VpdiagramGrammarAccess grammarAccess;
	
	private Map<AbstractElement, String> nameMappings;
	
	@Override
	protected org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.contentassist.antlr.internal.InternalVpdiagramParser createParser() {
		org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.contentassist.antlr.internal.InternalVpdiagramParser result = new org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.contentassist.antlr.internal.InternalVpdiagramParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}
	
	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getAbstractImportAccess().getAlternatives(), "rule__AbstractImport__Alternatives");
					put(grammarAccess.getDiagramRepresentationAccess().getAlternatives(), "rule__DiagramRepresentation__Alternatives");
					put(grammarAccess.getDiagramElementAccess().getAlternatives(), "rule__DiagramElement__Alternatives");
					put(grammarAccess.getDiagramChildrenAccess().getAlternatives(), "rule__DiagramChildren__Alternatives");
					put(grammarAccess.getAbstractNodeAccess().getAlternatives(), "rule__AbstractNode__Alternatives");
					put(grammarAccess.getAbstractEdgeAccess().getAlternatives(), "rule__AbstractEdge__Alternatives");
					put(grammarAccess.getAbstractDescriptionAccess().getAlternatives(), "rule__AbstractDescription__Alternatives");
					put(grammarAccess.getAbstractContainerStyleAccess().getAlternatives(), "rule__AbstractContainerStyle__Alternatives");
					put(grammarAccess.getAbstractNodeStyleAccess().getAlternatives(), "rule__AbstractNodeStyle__Alternatives");
					put(grammarAccess.getNodeDomainElementAccess().getAlternatives_2_1(), "rule__NodeDomainElement__Alternatives_2_1");
					put(grammarAccess.getActionAccess().getAlternatives(), "rule__Action__Alternatives");
					put(grammarAccess.getEdgeAccess().getAlternatives_4(), "rule__Edge__Alternatives_4");
					put(grammarAccess.getEdgeDomainAssociationAccess().getAlternatives_1(), "rule__EdgeDomainAssociation__Alternatives_1");
					put(grammarAccess.getEdgeDomainElementAccess().getAlternatives_2(), "rule__EdgeDomainElement__Alternatives_2");
					put(grammarAccess.getEdgeDomainElementAccess().getAlternatives_3(), "rule__EdgeDomainElement__Alternatives_3");
					put(grammarAccess.getAbstractClassAccess().getAlternatives(), "rule__AbstractClass__Alternatives");
					put(grammarAccess.getAbstractAssociation2Access().getAlternatives(), "rule__AbstractAssociation2__Alternatives");
					put(grammarAccess.getAbstractAttributeAccess().getAlternatives(), "rule__AbstractAttribute__Alternatives");
					put(grammarAccess.getExpressionElementAccess().getAlternatives(), "rule__ExpressionElement__Alternatives");
					put(grammarAccess.getForeignExpressionElementAccess().getAlternatives(), "rule__ForeignExpressionElement__Alternatives");
					put(grammarAccess.getEStringAccess().getAlternatives(), "rule__EString__Alternatives");
					put(grammarAccess.getEBooleanAccess().getAlternatives(), "rule__EBoolean__Alternatives");
					put(grammarAccess.getNode_FormAccess().getAlternatives(), "rule__Node_Form__Alternatives");
					put(grammarAccess.getBackgroundStyleAccess().getAlternatives(), "rule__BackgroundStyle__Alternatives");
					put(grammarAccess.getLabelPositionAccess().getAlternatives(), "rule__LabelPosition__Alternatives");
					put(grammarAccess.getLabelAlignmentAccess().getAlternatives(), "rule__LabelAlignment__Alternatives");
					put(grammarAccess.getLineStyleAccess().getAlternatives(), "rule__LineStyle__Alternatives");
					put(grammarAccess.getEdgeArrowsAccess().getAlternatives(), "rule__EdgeArrows__Alternatives");
					put(grammarAccess.getSystemColorsAccess().getAlternatives(), "rule__SystemColors__Alternatives");
					put(grammarAccess.getContainerLayoutAccess().getAlternatives(), "rule__ContainerLayout__Alternatives");
					put(grammarAccess.getDiagramsAccess().getGroup(), "rule__Diagrams__Group__0");
					put(grammarAccess.getImportNameSpaceAccess().getGroup(), "rule__ImportNameSpace__Group__0");
					put(grammarAccess.getImportGroupAccess().getGroup(), "rule__ImportGroup__Group__0");
					put(grammarAccess.getDiagramSetAccess().getGroup(), "rule__DiagramSet__Group__0");
					put(grammarAccess.getDiagramAccess().getGroup(), "rule__Diagram__Group__0");
					put(grammarAccess.getDiagramAccess().getGroup_4(), "rule__Diagram__Group_4__0");
					put(grammarAccess.getDiagramExtensionAccess().getGroup(), "rule__DiagramExtension__Group__0");
					put(grammarAccess.getDiagramExtensionAccess().getGroup_4(), "rule__DiagramExtension__Group_4__0");
					put(grammarAccess.getMappingSetAccess().getGroup(), "rule__MappingSet__Group__0");
					put(grammarAccess.getEdgeDescriptionAccess().getGroup(), "rule__EdgeDescription__Group__0");
					put(grammarAccess.getEdgeDescriptionAccess().getGroup_4(), "rule__EdgeDescription__Group_4__0");
					put(grammarAccess.getEdgeDescriptionAccess().getGroup_5(), "rule__EdgeDescription__Group_5__0");
					put(grammarAccess.getEdgeDescriptionAccess().getGroup_6(), "rule__EdgeDescription__Group_6__0");
					put(grammarAccess.getConditionAccess().getGroup(), "rule__Condition__Group__0");
					put(grammarAccess.getEdgeStyleAccess().getGroup(), "rule__EdgeStyle__Group__0");
					put(grammarAccess.getEdgeStyleAccess().getGroup_3(), "rule__EdgeStyle__Group_3__0");
					put(grammarAccess.getEdgeStyleAccess().getGroup_4(), "rule__EdgeStyle__Group_4__0");
					put(grammarAccess.getEdgeStyleAccess().getGroup_5(), "rule__EdgeStyle__Group_5__0");
					put(grammarAccess.getEdgeStyleAccess().getGroup_6(), "rule__EdgeStyle__Group_6__0");
					put(grammarAccess.getContainerAccess().getGroup(), "rule__Container__Group__0");
					put(grammarAccess.getContainerAccess().getGroup_4(), "rule__Container__Group_4__0");
					put(grammarAccess.getContainerAccess().getGroup_5(), "rule__Container__Group_5__0");
					put(grammarAccess.getContainerAccess().getGroup_6(), "rule__Container__Group_6__0");
					put(grammarAccess.getContainerChildrenAccess().getGroup(), "rule__ContainerChildren__Group__0");
					put(grammarAccess.getContainerChildrenAccess().getGroup_3(), "rule__ContainerChildren__Group_3__0");
					put(grammarAccess.getContainerChildrenAccess().getGroup_3_2(), "rule__ContainerChildren__Group_3_2__0");
					put(grammarAccess.getNodeDomainElementAccess().getGroup(), "rule__NodeDomainElement__Group__0");
					put(grammarAccess.getNodeDomainElementAccess().getGroup_2(), "rule__NodeDomainElement__Group_2__0");
					put(grammarAccess.getNodeDomainElementAccess().getGroup_2_1_0(), "rule__NodeDomainElement__Group_2_1_0__0");
					put(grammarAccess.getNodeDomainElementAccess().getGroup_2_1_1(), "rule__NodeDomainElement__Group_2_1_1__0");
					put(grammarAccess.getContainerDescriptionAccess().getGroup(), "rule__ContainerDescription__Group__0");
					put(grammarAccess.getContainerDescriptionAccess().getGroup_4(), "rule__ContainerDescription__Group_4__0");
					put(grammarAccess.getContainerDescriptionAccess().getGroup_5(), "rule__ContainerDescription__Group_5__0");
					put(grammarAccess.getBasicStyleAccess().getGroup(), "rule__BasicStyle__Group__0");
					put(grammarAccess.getBasicStyleAccess().getGroup_3(), "rule__BasicStyle__Group_3__0");
					put(grammarAccess.getBasicStyleAccess().getGroup_4(), "rule__BasicStyle__Group_4__0");
					put(grammarAccess.getBasicStyleAccess().getGroup_5(), "rule__BasicStyle__Group_5__0");
					put(grammarAccess.getHistogramStyleAccess().getGroup(), "rule__HistogramStyle__Group__0");
					put(grammarAccess.getHistogramStyleAccess().getGroup_3(), "rule__HistogramStyle__Group_3__0");
					put(grammarAccess.getHistogramSectionAccess().getGroup(), "rule__HistogramSection__Group__0");
					put(grammarAccess.getHistogramSectionAccess().getGroup_3(), "rule__HistogramSection__Group_3__0");
					put(grammarAccess.getHistogramSectionAccess().getGroup_4(), "rule__HistogramSection__Group_4__0");
					put(grammarAccess.getHistogramSectionAccess().getGroup_5(), "rule__HistogramSection__Group_5__0");
					put(grammarAccess.getHistogramSectionAccess().getGroup_6(), "rule__HistogramSection__Group_6__0");
					put(grammarAccess.getHistogramSectionAccess().getGroup_7(), "rule__HistogramSection__Group_7__0");
					put(grammarAccess.getImageStyleAccess().getGroup(), "rule__ImageStyle__Group__0");
					put(grammarAccess.getImageStyleAccess().getGroup_3(), "rule__ImageStyle__Group_3__0");
					put(grammarAccess.getImageStyleAccess().getGroup_4(), "rule__ImageStyle__Group_4__0");
					put(grammarAccess.getFlatStyleAccess().getGroup(), "rule__FlatStyle__Group__0");
					put(grammarAccess.getFlatStyleAccess().getGroup_3(), "rule__FlatStyle__Group_3__0");
					put(grammarAccess.getFlatStyleAccess().getGroup_4(), "rule__FlatStyle__Group_4__0");
					put(grammarAccess.getFlatStyleAccess().getGroup_5(), "rule__FlatStyle__Group_5__0");
					put(grammarAccess.getLabelAccess().getGroup(), "rule__Label__Group__0");
					put(grammarAccess.getLabelAccess().getGroup_1(), "rule__Label__Group_1__0");
					put(grammarAccess.getLabelAccess().getGroup_2(), "rule__Label__Group_2__0");
					put(grammarAccess.getNodeAccess().getGroup(), "rule__Node__Group__0");
					put(grammarAccess.getNodeAccess().getGroup_4(), "rule__Node__Group_4__0");
					put(grammarAccess.getNodeAccess().getGroup_5(), "rule__Node__Group_5__0");
					put(grammarAccess.getNodeChildrenAccess().getGroup(), "rule__NodeChildren__Group__0");
					put(grammarAccess.getNodeChildrenAccess().getGroup_3(), "rule__NodeChildren__Group_3__0");
					put(grammarAccess.getNodeChildrenAccess().getGroup_3_2(), "rule__NodeChildren__Group_3_2__0");
					put(grammarAccess.getBorderedNodeAccess().getGroup(), "rule__BorderedNode__Group__0");
					put(grammarAccess.getBorderedNodeAccess().getGroup_4(), "rule__BorderedNode__Group_4__0");
					put(grammarAccess.getBorderedNodeAccess().getGroup_5(), "rule__BorderedNode__Group_5__0");
					put(grammarAccess.getNodeDescriptionAccess().getGroup(), "rule__NodeDescription__Group__0");
					put(grammarAccess.getNodeDescriptionAccess().getGroup_4(), "rule__NodeDescription__Group_4__0");
					put(grammarAccess.getNodeDescriptionAccess().getGroup_4_3(), "rule__NodeDescription__Group_4_3__0");
					put(grammarAccess.getNodeDescriptionAccess().getGroup_4_4(), "rule__NodeDescription__Group_4_4__0");
					put(grammarAccess.getNodeDescriptionAccess().getGroup_5(), "rule__NodeDescription__Group_5__0");
					put(grammarAccess.getActionSetAccess().getGroup(), "rule__ActionSet__Group__0");
					put(grammarAccess.getOpenActionAccess().getGroup(), "rule__OpenAction__Group__0");
					put(grammarAccess.getOpenActionAccess().getGroup_4(), "rule__OpenAction__Group_4__0");
					put(grammarAccess.getOpenActionAccess().getGroup_5(), "rule__OpenAction__Group_5__0");
					put(grammarAccess.getOpenActionAccess().getGroup_6(), "rule__OpenAction__Group_6__0");
					put(grammarAccess.getCreateAccess().getGroup(), "rule__Create__Group__0");
					put(grammarAccess.getCreateAccess().getGroup_4(), "rule__Create__Group_4__0");
					put(grammarAccess.getCreateAccess().getGroup_5(), "rule__Create__Group_5__0");
					put(grammarAccess.getCreateAccess().getGroup_6(), "rule__Create__Group_6__0");
					put(grammarAccess.getCreateAccess().getGroup_7(), "rule__Create__Group_7__0");
					put(grammarAccess.getDeleteAccess().getGroup(), "rule__Delete__Group__0");
					put(grammarAccess.getDeleteAccess().getGroup_4(), "rule__Delete__Group_4__0");
					put(grammarAccess.getDeleteAccess().getGroup_5(), "rule__Delete__Group_5__0");
					put(grammarAccess.getDeleteAccess().getGroup_6(), "rule__Delete__Group_6__0");
					put(grammarAccess.getDropAccess().getGroup(), "rule__Drop__Group__0");
					put(grammarAccess.getDropAccess().getGroup_4(), "rule__Drop__Group_4__0");
					put(grammarAccess.getDropAccess().getGroup_5(), "rule__Drop__Group_5__0");
					put(grammarAccess.getDropAccess().getGroup_6(), "rule__Drop__Group_6__0");
					put(grammarAccess.getReconnectEdgeAccess().getGroup(), "rule__ReconnectEdge__Group__0");
					put(grammarAccess.getReconnectEdgeAccess().getGroup_4(), "rule__ReconnectEdge__Group_4__0");
					put(grammarAccess.getReconnectEdgeAccess().getGroup_5(), "rule__ReconnectEdge__Group_5__0");
					put(grammarAccess.getReconnectEdgeAccess().getGroup_6(), "rule__ReconnectEdge__Group_6__0");
					put(grammarAccess.getDomainContainerAccess().getGroup(), "rule__DomainContainer__Group__0");
					put(grammarAccess.getDomainContainerAccess().getGroup_1(), "rule__DomainContainer__Group_1__0");
					put(grammarAccess.getEdgeAccess().getGroup(), "rule__Edge__Group__0");
					put(grammarAccess.getEdgeAccess().getGroup_4_0(), "rule__Edge__Group_4_0__0");
					put(grammarAccess.getEdgeAccess().getGroup_4_1(), "rule__Edge__Group_4_1__0");
					put(grammarAccess.getEdgeAccess().getGroup_5(), "rule__Edge__Group_5__0");
					put(grammarAccess.getEdgeAccess().getGroup_5_2(), "rule__Edge__Group_5_2__0");
					put(grammarAccess.getEdgeAccess().getGroup_6(), "rule__Edge__Group_6__0");
					put(grammarAccess.getEdgeAccess().getGroup_6_2(), "rule__Edge__Group_6_2__0");
					put(grammarAccess.getEdgeImportAccess().getGroup(), "rule__EdgeImport__Group__0");
					put(grammarAccess.getEdgeImportAccess().getGroup_4(), "rule__EdgeImport__Group_4__0");
					put(grammarAccess.getEdgeDomainAssociationAccess().getGroup(), "rule__EdgeDomainAssociation__Group__0");
					put(grammarAccess.getEdgeDomainAssociationAccess().getGroup_1_0(), "rule__EdgeDomainAssociation__Group_1_0__0");
					put(grammarAccess.getEdgeDomainElementAccess().getGroup(), "rule__EdgeDomainElement__Group__0");
					put(grammarAccess.getEdgeDomainElementAccess().getGroup_2_0(), "rule__EdgeDomainElement__Group_2_0__0");
					put(grammarAccess.getEdgeDomainElementAccess().getGroup_2_1(), "rule__EdgeDomainElement__Group_2_1__0");
					put(grammarAccess.getEdgeDomainElementAccess().getGroup_3_0(), "rule__EdgeDomainElement__Group_3_0__0");
					put(grammarAccess.getEdgeDomainElementAccess().getGroup_3_1(), "rule__EdgeDomainElement__Group_3_1__0");
					put(grammarAccess.getLocalClass2Access().getGroup(), "rule__LocalClass2__Group__0");
					put(grammarAccess.getExternalClassAccess().getGroup(), "rule__ExternalClass__Group__0");
					put(grammarAccess.getLocalAssociationAccess().getGroup(), "rule__LocalAssociation__Group__0");
					put(grammarAccess.getExternalAssociationAccess().getGroup(), "rule__ExternalAssociation__Group__0");
					put(grammarAccess.getLocalAttributeAccess().getGroup(), "rule__LocalAttribute__Group__0");
					put(grammarAccess.getExternalAttributeAccess().getGroup(), "rule__ExternalAttribute__Group__0");
					put(grammarAccess.getExpressionAccess().getGroup(), "rule__Expression__Group__0");
					put(grammarAccess.getExpressionAccess().getGroup_1(), "rule__Expression__Group_1__0");
					put(grammarAccess.getExpressionAccess().getGroup_1_1(), "rule__Expression__Group_1_1__0");
					put(grammarAccess.getJavaElementAccess().getGroup(), "rule__JavaElement__Group__0");
					put(grammarAccess.getDomainElementAccess().getGroup(), "rule__DomainElement__Group__0");
					put(grammarAccess.getStringElementAccess().getGroup(), "rule__StringElement__Group__0");
					put(grammarAccess.getFQNAccess().getGroup(), "rule__FQN__Group__0");
					put(grammarAccess.getFQNAccess().getGroup_1(), "rule__FQN__Group_1__0");
					put(grammarAccess.getDiagramsAccess().getImportsAssignment_1(), "rule__Diagrams__ImportsAssignment_1");
					put(grammarAccess.getDiagramsAccess().getDiagramsAssignment_2(), "rule__Diagrams__DiagramsAssignment_2");
					put(grammarAccess.getImportNameSpaceAccess().getImportedNamespaceAssignment_1(), "rule__ImportNameSpace__ImportedNamespaceAssignment_1");
					put(grammarAccess.getImportGroupAccess().getImportedGroupAssignment_2(), "rule__ImportGroup__ImportedGroupAssignment_2");
					put(grammarAccess.getDiagramSetAccess().getNameAssignment_2(), "rule__DiagramSet__NameAssignment_2");
					put(grammarAccess.getDiagramSetAccess().getDiagramsAssignment_4(), "rule__DiagramSet__DiagramsAssignment_4");
					put(grammarAccess.getDiagramAccess().getNameAssignment_2(), "rule__Diagram__NameAssignment_2");
					put(grammarAccess.getDiagramAccess().getDescriptionAssignment_4_1(), "rule__Diagram__DescriptionAssignment_4_1");
					put(grammarAccess.getDiagramAccess().getThe_domainAssignment_5(), "rule__Diagram__The_domainAssignment_5");
					put(grammarAccess.getDiagramAccess().getThe_MappingSetAssignment_6(), "rule__Diagram__The_MappingSetAssignment_6");
					put(grammarAccess.getDiagramAccess().getThe_ActionSetAssignment_7(), "rule__Diagram__The_ActionSetAssignment_7");
					put(grammarAccess.getDiagramExtensionAccess().getNameAssignment_2(), "rule__DiagramExtension__NameAssignment_2");
					put(grammarAccess.getDiagramExtensionAccess().getExtented_diagramAssignment_4_1(), "rule__DiagramExtension__Extented_diagramAssignment_4_1");
					put(grammarAccess.getDiagramExtensionAccess().getThe_MappingSetAssignment_5(), "rule__DiagramExtension__The_MappingSetAssignment_5");
					put(grammarAccess.getDiagramExtensionAccess().getThe_ActionSetAssignment_6(), "rule__DiagramExtension__The_ActionSetAssignment_6");
					put(grammarAccess.getMappingSetAccess().getDiagram_ElementsAssignment_3(), "rule__MappingSet__Diagram_ElementsAssignment_3");
					put(grammarAccess.getEdgeDescriptionAccess().getConditionAssignment_3(), "rule__EdgeDescription__ConditionAssignment_3");
					put(grammarAccess.getEdgeDescriptionAccess().getBegin_LabelAssignment_4_2(), "rule__EdgeDescription__Begin_LabelAssignment_4_2");
					put(grammarAccess.getEdgeDescriptionAccess().getCenter_labelAssignment_5_2(), "rule__EdgeDescription__Center_labelAssignment_5_2");
					put(grammarAccess.getEdgeDescriptionAccess().getEnd_labelAssignment_6_2(), "rule__EdgeDescription__End_labelAssignment_6_2");
					put(grammarAccess.getEdgeDescriptionAccess().getStyleAssignment_7(), "rule__EdgeDescription__StyleAssignment_7");
					put(grammarAccess.getConditionAccess().getExpressionAssignment_2(), "rule__Condition__ExpressionAssignment_2");
					put(grammarAccess.getEdgeStyleAccess().getLineStyleAssignment_3_1(), "rule__EdgeStyle__LineStyleAssignment_3_1");
					put(grammarAccess.getEdgeStyleAccess().getBeginDecoratorAssignment_4_1(), "rule__EdgeStyle__BeginDecoratorAssignment_4_1");
					put(grammarAccess.getEdgeStyleAccess().getEndDecoratorAssignment_5_1(), "rule__EdgeStyle__EndDecoratorAssignment_5_1");
					put(grammarAccess.getEdgeStyleAccess().getColorAssignment_6_1(), "rule__EdgeStyle__ColorAssignment_6_1");
					put(grammarAccess.getContainerAccess().getNameAssignment_2(), "rule__Container__NameAssignment_2");
					put(grammarAccess.getContainerAccess().getImportsAssignment_4_1(), "rule__Container__ImportsAssignment_4_1");
					put(grammarAccess.getContainerAccess().getThe_domainAssignment_5_1(), "rule__Container__The_domainAssignment_5_1");
					put(grammarAccess.getContainerAccess().getContentLayoutAssignment_6_1(), "rule__Container__ContentLayoutAssignment_6_1");
					put(grammarAccess.getContainerAccess().getStyleAssignment_7(), "rule__Container__StyleAssignment_7");
					put(grammarAccess.getContainerAccess().getChildrenAssignment_8(), "rule__Container__ChildrenAssignment_8");
					put(grammarAccess.getContainerChildrenAccess().getReused_nodesAssignment_3_1(), "rule__ContainerChildren__Reused_nodesAssignment_3_1");
					put(grammarAccess.getContainerChildrenAccess().getReused_nodesAssignment_3_2_1(), "rule__ContainerChildren__Reused_nodesAssignment_3_2_1");
					put(grammarAccess.getContainerChildrenAccess().getOwned_nodesAssignment_4(), "rule__ContainerChildren__Owned_nodesAssignment_4");
					put(grammarAccess.getNodeDomainElementAccess().getDomain_ClassAssignment_1(), "rule__NodeDomainElement__Domain_ClassAssignment_1");
					put(grammarAccess.getNodeDomainElementAccess().getQueryAssignment_2_1_0_1(), "rule__NodeDomainElement__QueryAssignment_2_1_0_1");
					put(grammarAccess.getNodeDomainElementAccess().getChlidren_listAssignment_2_1_1_1(), "rule__NodeDomainElement__Chlidren_listAssignment_2_1_1_1");
					put(grammarAccess.getContainerDescriptionAccess().getConditionAssignment_3(), "rule__ContainerDescription__ConditionAssignment_3");
					put(grammarAccess.getContainerDescriptionAccess().getNode_LabelAssignment_4_2(), "rule__ContainerDescription__Node_LabelAssignment_4_2");
					put(grammarAccess.getContainerDescriptionAccess().getStyleAssignment_5_2(), "rule__ContainerDescription__StyleAssignment_5_2");
					put(grammarAccess.getBasicStyleAccess().getBorderColorAssignment_3_1(), "rule__BasicStyle__BorderColorAssignment_3_1");
					put(grammarAccess.getBasicStyleAccess().getBackgroundColorAssignment_4_1(), "rule__BasicStyle__BackgroundColorAssignment_4_1");
					put(grammarAccess.getBasicStyleAccess().getFormAssignment_5_1(), "rule__BasicStyle__FormAssignment_5_1");
					put(grammarAccess.getHistogramStyleAccess().getBorderColorAssignment_3_1(), "rule__HistogramStyle__BorderColorAssignment_3_1");
					put(grammarAccess.getHistogramStyleAccess().getSectionsAssignment_4(), "rule__HistogramStyle__SectionsAssignment_4");
					put(grammarAccess.getHistogramSectionAccess().getBackgroundColorAssignment_3_1(), "rule__HistogramSection__BackgroundColorAssignment_3_1");
					put(grammarAccess.getHistogramSectionAccess().getForgroundColorAssignment_4_1(), "rule__HistogramSection__ForgroundColorAssignment_4_1");
					put(grammarAccess.getHistogramSectionAccess().getMinValueAssignment_5_1(), "rule__HistogramSection__MinValueAssignment_5_1");
					put(grammarAccess.getHistogramSectionAccess().getValueAssignment_6_1(), "rule__HistogramSection__ValueAssignment_6_1");
					put(grammarAccess.getHistogramSectionAccess().getMaxValueAssignment_7_1(), "rule__HistogramSection__MaxValueAssignment_7_1");
					put(grammarAccess.getImageStyleAccess().getBorderColorAssignment_3_1(), "rule__ImageStyle__BorderColorAssignment_3_1");
					put(grammarAccess.getImageStyleAccess().getImagePathAssignment_4_1(), "rule__ImageStyle__ImagePathAssignment_4_1");
					put(grammarAccess.getFlatStyleAccess().getBorderColorAssignment_3_1(), "rule__FlatStyle__BorderColorAssignment_3_1");
					put(grammarAccess.getFlatStyleAccess().getBackgroundStyleAssignment_4_1(), "rule__FlatStyle__BackgroundStyleAssignment_4_1");
					put(grammarAccess.getFlatStyleAccess().getBackgroundColorAssignment_4_2(), "rule__FlatStyle__BackgroundColorAssignment_4_2");
					put(grammarAccess.getFlatStyleAccess().getForgroundColorAssignment_5_1(), "rule__FlatStyle__ForgroundColorAssignment_5_1");
					put(grammarAccess.getLabelAccess().getValueAssignment_1_1(), "rule__Label__ValueAssignment_1_1");
					put(grammarAccess.getLabelAccess().getBoldAssignment_2_1(), "rule__Label__BoldAssignment_2_1");
					put(grammarAccess.getLabelAccess().getItalicAssignment_2_2(), "rule__Label__ItalicAssignment_2_2");
					put(grammarAccess.getLabelAccess().getColorAssignment_2_3(), "rule__Label__ColorAssignment_2_3");
					put(grammarAccess.getLabelAccess().getSizeAssignment_2_4(), "rule__Label__SizeAssignment_2_4");
					put(grammarAccess.getNodeAccess().getNameAssignment_2(), "rule__Node__NameAssignment_2");
					put(grammarAccess.getNodeAccess().getImportsAssignment_4_1(), "rule__Node__ImportsAssignment_4_1");
					put(grammarAccess.getNodeAccess().getThe_domainAssignment_5_1(), "rule__Node__The_domainAssignment_5_1");
					put(grammarAccess.getNodeAccess().getStyleAssignment_6(), "rule__Node__StyleAssignment_6");
					put(grammarAccess.getNodeAccess().getChildrenAssignment_7(), "rule__Node__ChildrenAssignment_7");
					put(grammarAccess.getNodeChildrenAccess().getReused_boderednodesAssignment_3_1(), "rule__NodeChildren__Reused_boderednodesAssignment_3_1");
					put(grammarAccess.getNodeChildrenAccess().getReused_boderednodesAssignment_3_2_1(), "rule__NodeChildren__Reused_boderednodesAssignment_3_2_1");
					put(grammarAccess.getNodeChildrenAccess().getOwned_boderednodesAssignment_4(), "rule__NodeChildren__Owned_boderednodesAssignment_4");
					put(grammarAccess.getBorderedNodeAccess().getNameAssignment_2(), "rule__BorderedNode__NameAssignment_2");
					put(grammarAccess.getBorderedNodeAccess().getImportsAssignment_4_1(), "rule__BorderedNode__ImportsAssignment_4_1");
					put(grammarAccess.getBorderedNodeAccess().getThe_domainAssignment_5_1(), "rule__BorderedNode__The_domainAssignment_5_1");
					put(grammarAccess.getBorderedNodeAccess().getStyleAssignment_6(), "rule__BorderedNode__StyleAssignment_6");
					put(grammarAccess.getNodeDescriptionAccess().getConditionAssignment_3(), "rule__NodeDescription__ConditionAssignment_3");
					put(grammarAccess.getNodeDescriptionAccess().getNode_LabelAssignment_4_2(), "rule__NodeDescription__Node_LabelAssignment_4_2");
					put(grammarAccess.getNodeDescriptionAccess().getLabel_positionAssignment_4_3_1(), "rule__NodeDescription__Label_positionAssignment_4_3_1");
					put(grammarAccess.getNodeDescriptionAccess().getLabel_alignementAssignment_4_4_1(), "rule__NodeDescription__Label_alignementAssignment_4_4_1");
					put(grammarAccess.getNodeDescriptionAccess().getStyleAssignment_5_2(), "rule__NodeDescription__StyleAssignment_5_2");
					put(grammarAccess.getActionSetAccess().getActionsAssignment_3(), "rule__ActionSet__ActionsAssignment_3");
					put(grammarAccess.getActionSetAccess().getOpenActionsAssignment_4(), "rule__ActionSet__OpenActionsAssignment_4");
					put(grammarAccess.getOpenActionAccess().getNameAssignment_2(), "rule__OpenAction__NameAssignment_2");
					put(grammarAccess.getOpenActionAccess().getPreconditionAssignment_4_1(), "rule__OpenAction__PreconditionAssignment_4_1");
					put(grammarAccess.getOpenActionAccess().getLabelAssignment_5_1(), "rule__OpenAction__LabelAssignment_5_1");
					put(grammarAccess.getOpenActionAccess().getIconAssignment_6_1(), "rule__OpenAction__IconAssignment_6_1");
					put(grammarAccess.getCreateAccess().getNameAssignment_2(), "rule__Create__NameAssignment_2");
					put(grammarAccess.getCreateAccess().getPreconditionAssignment_4_1(), "rule__Create__PreconditionAssignment_4_1");
					put(grammarAccess.getCreateAccess().getLabelAssignment_5_1(), "rule__Create__LabelAssignment_5_1");
					put(grammarAccess.getCreateAccess().getTool_ForAssignment_6_1(), "rule__Create__Tool_ForAssignment_6_1");
					put(grammarAccess.getCreateAccess().getIconAssignment_7_1(), "rule__Create__IconAssignment_7_1");
					put(grammarAccess.getDeleteAccess().getNameAssignment_2(), "rule__Delete__NameAssignment_2");
					put(grammarAccess.getDeleteAccess().getPreconditionAssignment_4_1(), "rule__Delete__PreconditionAssignment_4_1");
					put(grammarAccess.getDeleteAccess().getLabelAssignment_5_1(), "rule__Delete__LabelAssignment_5_1");
					put(grammarAccess.getDeleteAccess().getTool_ForAssignment_6_1(), "rule__Delete__Tool_ForAssignment_6_1");
					put(grammarAccess.getDropAccess().getNameAssignment_2(), "rule__Drop__NameAssignment_2");
					put(grammarAccess.getDropAccess().getPreconditionAssignment_4_1(), "rule__Drop__PreconditionAssignment_4_1");
					put(grammarAccess.getDropAccess().getLabelAssignment_5_1(), "rule__Drop__LabelAssignment_5_1");
					put(grammarAccess.getDropAccess().getTool_ForAssignment_6_1(), "rule__Drop__Tool_ForAssignment_6_1");
					put(grammarAccess.getReconnectEdgeAccess().getNameAssignment_2(), "rule__ReconnectEdge__NameAssignment_2");
					put(grammarAccess.getReconnectEdgeAccess().getPreconditionAssignment_4_1(), "rule__ReconnectEdge__PreconditionAssignment_4_1");
					put(grammarAccess.getReconnectEdgeAccess().getLabelAssignment_5_1(), "rule__ReconnectEdge__LabelAssignment_5_1");
					put(grammarAccess.getReconnectEdgeAccess().getTool_ForAssignment_6_1(), "rule__ReconnectEdge__Tool_ForAssignment_6_1");
					put(grammarAccess.getDomainContainerAccess().getThe_domainAssignment_1_1(), "rule__DomainContainer__The_domainAssignment_1_1");
					put(grammarAccess.getEdgeAccess().getNameAssignment_2(), "rule__Edge__NameAssignment_2");
					put(grammarAccess.getEdgeAccess().getThe_domainAssignment_4_0_1(), "rule__Edge__The_domainAssignment_4_0_1");
					put(grammarAccess.getEdgeAccess().getThe_domainAssignment_4_1_1(), "rule__Edge__The_domainAssignment_4_1_1");
					put(grammarAccess.getEdgeAccess().getSourceAssignment_5_1(), "rule__Edge__SourceAssignment_5_1");
					put(grammarAccess.getEdgeAccess().getSourceAssignment_5_2_1(), "rule__Edge__SourceAssignment_5_2_1");
					put(grammarAccess.getEdgeAccess().getTargetAssignment_6_1(), "rule__Edge__TargetAssignment_6_1");
					put(grammarAccess.getEdgeAccess().getTargetAssignment_6_2_1(), "rule__Edge__TargetAssignment_6_2_1");
					put(grammarAccess.getEdgeAccess().getE_descriptionAssignment_7(), "rule__Edge__E_descriptionAssignment_7");
					put(grammarAccess.getEdgeImportAccess().getNameAssignment_2(), "rule__EdgeImport__NameAssignment_2");
					put(grammarAccess.getEdgeImportAccess().getImportsAssignment_4_1(), "rule__EdgeImport__ImportsAssignment_4_1");
					put(grammarAccess.getEdgeImportAccess().getE_descriptionAssignment_5(), "rule__EdgeImport__E_descriptionAssignment_5");
					put(grammarAccess.getEdgeDomainAssociationAccess().getTarget_queryAssignment_1_0_1(), "rule__EdgeDomainAssociation__Target_queryAssignment_1_0_1");
					put(grammarAccess.getEdgeDomainAssociationAccess().getTarget_LocatorAssignment_1_1(), "rule__EdgeDomainAssociation__Target_LocatorAssignment_1_1");
					put(grammarAccess.getEdgeDomainElementAccess().getThe_DomainAssignment_1(), "rule__EdgeDomainElement__The_DomainAssignment_1");
					put(grammarAccess.getEdgeDomainElementAccess().getTarget_queryAssignment_2_0_1(), "rule__EdgeDomainElement__Target_queryAssignment_2_0_1");
					put(grammarAccess.getEdgeDomainElementAccess().getTarget_LocatorAssignment_2_1_1(), "rule__EdgeDomainElement__Target_LocatorAssignment_2_1_1");
					put(grammarAccess.getEdgeDomainElementAccess().getSource_queryAssignment_3_0_1(), "rule__EdgeDomainElement__Source_queryAssignment_3_0_1");
					put(grammarAccess.getEdgeDomainElementAccess().getSource_LocatorAssignment_3_1_1(), "rule__EdgeDomainElement__Source_LocatorAssignment_3_1_1");
					put(grammarAccess.getLocalClass2Access().getClassAssignment_1(), "rule__LocalClass2__ClassAssignment_1");
					put(grammarAccess.getExternalClassAccess().getClassAssignment_2(), "rule__ExternalClass__ClassAssignment_2");
					put(grammarAccess.getLocalAssociationAccess().getReferenceAssignment_1(), "rule__LocalAssociation__ReferenceAssignment_1");
					put(grammarAccess.getExternalAssociationAccess().getReferenceAssignment_2(), "rule__ExternalAssociation__ReferenceAssignment_2");
					put(grammarAccess.getLocalAttributeAccess().getAttributeAssignment_1(), "rule__LocalAttribute__AttributeAssignment_1");
					put(grammarAccess.getExternalAttributeAccess().getAttributeAssignment_2(), "rule__ExternalAttribute__AttributeAssignment_2");
					put(grammarAccess.getExpressionAccess().getExpressionElementsAssignment_1_0(), "rule__Expression__ExpressionElementsAssignment_1_0");
					put(grammarAccess.getExpressionAccess().getExpressionElementsAssignment_1_1_1(), "rule__Expression__ExpressionElementsAssignment_1_1_1");
					put(grammarAccess.getJavaElementAccess().getMethodAssignment_2(), "rule__JavaElement__MethodAssignment_2");
					put(grammarAccess.getDomainElementAccess().getAttributeAssignment_1(), "rule__DomainElement__AttributeAssignment_1");
					put(grammarAccess.getStringElementAccess().getValueAssignment_1(), "rule__StringElement__ValueAssignment_1");
				}
			};
		}
		return nameMappings.get(element);
	}
	
	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.contentassist.antlr.internal.InternalVpdiagramParser typedParser = (org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.contentassist.antlr.internal.InternalVpdiagramParser) parser;
			typedParser.entryRuleDiagrams();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}		
	}
	
	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}
	
	public VpdiagramGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(VpdiagramGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}

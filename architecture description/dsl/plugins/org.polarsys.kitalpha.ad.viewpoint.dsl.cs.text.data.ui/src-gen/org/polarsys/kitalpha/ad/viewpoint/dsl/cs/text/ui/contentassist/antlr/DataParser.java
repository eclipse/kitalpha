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

import org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.DataGrammarAccess;

public class DataParser extends AbstractContentAssistParser {
	
	@Inject
	private DataGrammarAccess grammarAccess;
	
	private Map<AbstractElement, String> nameMappings;
	
	@Override
	protected org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.contentassist.antlr.internal.InternalDataParser createParser() {
		org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.contentassist.antlr.internal.InternalDataParser result = new org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.contentassist.antlr.internal.InternalDataParser(null);
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
					put(grammarAccess.getAbstractSuperClassAccess().getAlternatives(), "rule__AbstractSuperClass__Alternatives");
					put(grammarAccess.getAbstractFeatureAccess().getAlternatives(), "rule__AbstractFeature__Alternatives");
					put(grammarAccess.getAbstractAssociationAccess().getAlternatives(), "rule__AbstractAssociation__Alternatives");
					put(grammarAccess.getAbstractAttributeTypeAccess().getAlternatives(), "rule__AbstractAttributeType__Alternatives");
					put(grammarAccess.getAbstractTypeAccess().getAlternatives(), "rule__AbstractType__Alternatives");
					put(grammarAccess.getEStringAccess().getAlternatives(), "rule__EString__Alternatives");
					put(grammarAccess.getEBooleanAccess().getAlternatives(), "rule__EBoolean__Alternatives");
					put(grammarAccess.getAssociation_TypesAccess().getAlternatives(), "rule__Association_Types__Alternatives");
					put(grammarAccess.getCardinalitiesAccess().getAlternatives(), "rule__Cardinalities__Alternatives");
					put(grammarAccess.getDataSpecAccess().getGroup(), "rule__DataSpec__Group__0");
					put(grammarAccess.getImportURIAccess().getGroup(), "rule__ImportURI__Group__0");
					put(grammarAccess.getImportAccess().getGroup(), "rule__Import__Group__0");
					put(grammarAccess.getDataAccess().getGroup(), "rule__Data__Group__0");
					put(grammarAccess.getDataAccess().getGroup_5_0(), "rule__Data__Group_5_0__0");
					put(grammarAccess.getClassAccess().getGroup(), "rule__Class__Group__0");
					put(grammarAccess.getClassAccess().getGroup_4(), "rule__Class__Group_4__0");
					put(grammarAccess.getClassAccess().getGroup_5(), "rule__Class__Group_5__0");
					put(grammarAccess.getClassAccess().getGroup_6(), "rule__Class__Group_6__0");
					put(grammarAccess.getClassAccess().getGroup_6_2(), "rule__Class__Group_6_2__0");
					put(grammarAccess.getClassAccess().getGroup_7(), "rule__Class__Group_7__0");
					put(grammarAccess.getClassAccess().getGroup_7_2(), "rule__Class__Group_7_2__0");
					put(grammarAccess.getClassAccess().getGroup_8(), "rule__Class__Group_8__0");
					put(grammarAccess.getClassAccess().getGroup_10(), "rule__Class__Group_10__0");
					put(grammarAccess.getClassAccess().getGroup_11(), "rule__Class__Group_11__0");
					put(grammarAccess.getClassAccess().getGroup_12(), "rule__Class__Group_12__0");
					put(grammarAccess.getEnumerationAccess().getGroup(), "rule__Enumeration__Group__0");
					put(grammarAccess.getEnumerationAccess().getGroup_5(), "rule__Enumeration__Group_5__0");
					put(grammarAccess.getEnumerationAccess().getGroup_5_1(), "rule__Enumeration__Group_5_1__0");
					put(grammarAccess.getLocalSuperClassAccess().getGroup(), "rule__LocalSuperClass__Group__0");
					put(grammarAccess.getExternalSuperClassAccess().getGroup(), "rule__ExternalSuperClass__Group__0");
					put(grammarAccess.getLocalClassAssociationAccess().getGroup(), "rule__LocalClassAssociation__Group__0");
					put(grammarAccess.getLocalClassAssociationAccess().getGroup_2(), "rule__LocalClassAssociation__Group_2__0");
					put(grammarAccess.getLocalClassAssociationAccess().getGroup_6_0(), "rule__LocalClassAssociation__Group_6_0__0");
					put(grammarAccess.getLocalClassAssociationAccess().getGroup_6_1(), "rule__LocalClassAssociation__Group_6_1__0");
					put(grammarAccess.getLocalClassAssociationAccess().getGroup_6_2(), "rule__LocalClassAssociation__Group_6_2__0");
					put(grammarAccess.getLocalClassAssociationAccess().getGroup_6_3(), "rule__LocalClassAssociation__Group_6_3__0");
					put(grammarAccess.getLocalClassAssociationAccess().getGroup_6_4(), "rule__LocalClassAssociation__Group_6_4__0");
					put(grammarAccess.getLocalClassAssociationAccess().getGroup_6_5(), "rule__LocalClassAssociation__Group_6_5__0");
					put(grammarAccess.getLocalClassAssociationAccess().getGroup_6_6(), "rule__LocalClassAssociation__Group_6_6__0");
					put(grammarAccess.getLocalClassAssociationAccess().getGroup_6_7(), "rule__LocalClassAssociation__Group_6_7__0");
					put(grammarAccess.getExternalClassAssociationAccess().getGroup(), "rule__ExternalClassAssociation__Group__0");
					put(grammarAccess.getExternalClassAssociationAccess().getGroup_2(), "rule__ExternalClassAssociation__Group_2__0");
					put(grammarAccess.getExternalClassAssociationAccess().getGroup_7_0(), "rule__ExternalClassAssociation__Group_7_0__0");
					put(grammarAccess.getExternalClassAssociationAccess().getGroup_7_1(), "rule__ExternalClassAssociation__Group_7_1__0");
					put(grammarAccess.getExternalClassAssociationAccess().getGroup_7_2(), "rule__ExternalClassAssociation__Group_7_2__0");
					put(grammarAccess.getExternalClassAssociationAccess().getGroup_7_3(), "rule__ExternalClassAssociation__Group_7_3__0");
					put(grammarAccess.getExternalClassAssociationAccess().getGroup_7_4(), "rule__ExternalClassAssociation__Group_7_4__0");
					put(grammarAccess.getExternalClassAssociationAccess().getGroup_7_5(), "rule__ExternalClassAssociation__Group_7_5__0");
					put(grammarAccess.getExternalClassAssociationAccess().getGroup_7_6(), "rule__ExternalClassAssociation__Group_7_6__0");
					put(grammarAccess.getLocalAttributeTypeAccess().getGroup(), "rule__LocalAttributeType__Group__0");
					put(grammarAccess.getExternalAttributeTypeAccess().getGroup(), "rule__ExternalAttributeType__Group__0");
					put(grammarAccess.getAttributeAccess().getGroup(), "rule__Attribute__Group__0");
					put(grammarAccess.getAttributeAccess().getGroup_2(), "rule__Attribute__Group_2__0");
					put(grammarAccess.getAttributeAccess().getGroup_5_0(), "rule__Attribute__Group_5_0__0");
					put(grammarAccess.getAttributeAccess().getGroup_5_1(), "rule__Attribute__Group_5_1__0");
					put(grammarAccess.getAttributeAccess().getGroup_5_2(), "rule__Attribute__Group_5_2__0");
					put(grammarAccess.getAttributeAccess().getGroup_5_3(), "rule__Attribute__Group_5_3__0");
					put(grammarAccess.getAttributeAccess().getGroup_5_4(), "rule__Attribute__Group_5_4__0");
					put(grammarAccess.getAttributeAccess().getGroup_5_5(), "rule__Attribute__Group_5_5__0");
					put(grammarAccess.getAttributeAccess().getGroup_5_6(), "rule__Attribute__Group_5_6__0");
					put(grammarAccess.getAttributeAccess().getGroup_5_7(), "rule__Attribute__Group_5_7__0");
					put(grammarAccess.getAttributeAccess().getGroup_6(), "rule__Attribute__Group_6__0");
					put(grammarAccess.getAttributeAccess().getGroup_6_2(), "rule__Attribute__Group_6_2__0");
					put(grammarAccess.getAttributeAccess().getGroup_6_2_1(), "rule__Attribute__Group_6_2_1__0");
					put(grammarAccess.getValueAccess().getGroup(), "rule__Value__Group__0");
					put(grammarAccess.getValueAccess().getGroup_1(), "rule__Value__Group_1__0");
					put(grammarAccess.getOperationAccess().getGroup(), "rule__Operation__Group__0");
					put(grammarAccess.getOperationAccess().getGroup_3(), "rule__Operation__Group_3__0");
					put(grammarAccess.getOperationAccess().getGroup_3_1(), "rule__Operation__Group_3_1__0");
					put(grammarAccess.getOperationAccess().getGroup_5(), "rule__Operation__Group_5__0");
					put(grammarAccess.getParameterAccess().getGroup(), "rule__Parameter__Group__0");
					put(grammarAccess.getExternalTypeAccess().getGroup(), "rule__ExternalType__Group__0");
					put(grammarAccess.getLocalTypeAccess().getGroup(), "rule__LocalType__Group__0");
					put(grammarAccess.getAnnotatableElementAccess().getGroup(), "rule__AnnotatableElement__Group__0");
					put(grammarAccess.getAnnotationAccess().getGroup(), "rule__Annotation__Group__0");
					put(grammarAccess.getAnnotationAccess().getGroup_3(), "rule__Annotation__Group_3__0");
					put(grammarAccess.getDetailAccess().getGroup(), "rule__Detail__Group__0");
					put(grammarAccess.getDetailAccess().getGroup_3(), "rule__Detail__Group_3__0");
					put(grammarAccess.getFQNAccess().getGroup(), "rule__FQN__Group__0");
					put(grammarAccess.getFQNAccess().getGroup_1(), "rule__FQN__Group_1__0");
					put(grammarAccess.getDataSpecAccess().getImportsAssignment_1(), "rule__DataSpec__ImportsAssignment_1");
					put(grammarAccess.getDataSpecAccess().getDataAssignment_2(), "rule__DataSpec__DataAssignment_2");
					put(grammarAccess.getImportNamespaceAccess().getImportedNamespaceAssignment(), "rule__ImportNamespace__ImportedNamespaceAssignment");
					put(grammarAccess.getImportURIAccess().getImportURIAssignment_1(), "rule__ImportURI__ImportURIAssignment_1");
					put(grammarAccess.getDataAccess().getNameAssignment_2(), "rule__Data__NameAssignment_2");
					put(grammarAccess.getDataAccess().getOwned_annotationsAssignment_4(), "rule__Data__Owned_annotationsAssignment_4");
					put(grammarAccess.getDataAccess().getDescriptionAssignment_5_0_1(), "rule__Data__DescriptionAssignment_5_0_1");
					put(grammarAccess.getDataAccess().getVP_ClassesAssignment_5_1(), "rule__Data__VP_ClassesAssignment_5_1");
					put(grammarAccess.getDataAccess().getVP_EnumerationsAssignment_5_2(), "rule__Data__VP_EnumerationsAssignment_5_2");
					put(grammarAccess.getClassAccess().getNameAssignment_2(), "rule__Class__NameAssignment_2");
					put(grammarAccess.getClassAccess().getDescriptionAssignment_4_1(), "rule__Class__DescriptionAssignment_4_1");
					put(grammarAccess.getClassAccess().getIconAssignment_5_1(), "rule__Class__IconAssignment_5_1");
					put(grammarAccess.getClassAccess().getExtendsAssignment_6_1(), "rule__Class__ExtendsAssignment_6_1");
					put(grammarAccess.getClassAccess().getExtendsAssignment_6_2_1(), "rule__Class__ExtendsAssignment_6_2_1");
					put(grammarAccess.getClassAccess().getInheritencesAssignment_7_1(), "rule__Class__InheritencesAssignment_7_1");
					put(grammarAccess.getClassAccess().getInheritencesAssignment_7_2_1(), "rule__Class__InheritencesAssignment_7_2_1");
					put(grammarAccess.getClassAccess().getAbstractAssignment_8_1(), "rule__Class__AbstractAssignment_8_1");
					put(grammarAccess.getClassAccess().getOwned_annotationsAssignment_9(), "rule__Class__Owned_annotationsAssignment_9");
					put(grammarAccess.getClassAccess().getVP_Class_AttributesAssignment_10_1(), "rule__Class__VP_Class_AttributesAssignment_10_1");
					put(grammarAccess.getClassAccess().getVP_Classes_AssociationsAssignment_11_1(), "rule__Class__VP_Classes_AssociationsAssignment_11_1");
					put(grammarAccess.getClassAccess().getVP_Class_OperationsAssignment_12_1(), "rule__Class__VP_Class_OperationsAssignment_12_1");
					put(grammarAccess.getEnumerationAccess().getNameAssignment_2(), "rule__Enumeration__NameAssignment_2");
					put(grammarAccess.getEnumerationAccess().getOwned_annotationsAssignment_4(), "rule__Enumeration__Owned_annotationsAssignment_4");
					put(grammarAccess.getEnumerationAccess().getOwnedValuesAssignment_5_0(), "rule__Enumeration__OwnedValuesAssignment_5_0");
					put(grammarAccess.getEnumerationAccess().getOwnedValuesAssignment_5_1_1(), "rule__Enumeration__OwnedValuesAssignment_5_1_1");
					put(grammarAccess.getLocalSuperClassAccess().getSuperClassAssignment_1(), "rule__LocalSuperClass__SuperClassAssignment_1");
					put(grammarAccess.getExternalSuperClassAccess().getSuperClassAssignment_2(), "rule__ExternalSuperClass__SuperClassAssignment_2");
					put(grammarAccess.getLocalClassAssociationAccess().getNameAssignment_1(), "rule__LocalClassAssociation__NameAssignment_1");
					put(grammarAccess.getLocalClassAssociationAccess().getDescriptionAssignment_2_1(), "rule__LocalClassAssociation__DescriptionAssignment_2_1");
					put(grammarAccess.getLocalClassAssociationAccess().getTypeAssignment_3(), "rule__LocalClassAssociation__TypeAssignment_3");
					put(grammarAccess.getLocalClassAssociationAccess().getCardinalityAssignment_4(), "rule__LocalClassAssociation__CardinalityAssignment_4");
					put(grammarAccess.getLocalClassAssociationAccess().getLocalTargetAssignment_5(), "rule__LocalClassAssociation__LocalTargetAssignment_5");
					put(grammarAccess.getLocalClassAssociationAccess().getOppositeAssignment_6_0_1(), "rule__LocalClassAssociation__OppositeAssignment_6_0_1");
					put(grammarAccess.getLocalClassAssociationAccess().getChangeableAssignment_6_1_1(), "rule__LocalClassAssociation__ChangeableAssignment_6_1_1");
					put(grammarAccess.getLocalClassAssociationAccess().getDerivedAssignment_6_2_1(), "rule__LocalClassAssociation__DerivedAssignment_6_2_1");
					put(grammarAccess.getLocalClassAssociationAccess().getOrderedAssignment_6_3_1(), "rule__LocalClassAssociation__OrderedAssignment_6_3_1");
					put(grammarAccess.getLocalClassAssociationAccess().getTransientAssignment_6_4_1(), "rule__LocalClassAssociation__TransientAssignment_6_4_1");
					put(grammarAccess.getLocalClassAssociationAccess().getUniqueAssignment_6_5_1(), "rule__LocalClassAssociation__UniqueAssignment_6_5_1");
					put(grammarAccess.getLocalClassAssociationAccess().getUnsettableAssignment_6_6_1(), "rule__LocalClassAssociation__UnsettableAssignment_6_6_1");
					put(grammarAccess.getLocalClassAssociationAccess().getVolatileAssignment_6_7_1(), "rule__LocalClassAssociation__VolatileAssignment_6_7_1");
					put(grammarAccess.getLocalClassAssociationAccess().getOwned_annotationsAssignment_7(), "rule__LocalClassAssociation__Owned_annotationsAssignment_7");
					put(grammarAccess.getExternalClassAssociationAccess().getNameAssignment_1(), "rule__ExternalClassAssociation__NameAssignment_1");
					put(grammarAccess.getExternalClassAssociationAccess().getDescriptionAssignment_2_1(), "rule__ExternalClassAssociation__DescriptionAssignment_2_1");
					put(grammarAccess.getExternalClassAssociationAccess().getTypeAssignment_3(), "rule__ExternalClassAssociation__TypeAssignment_3");
					put(grammarAccess.getExternalClassAssociationAccess().getCardinalityAssignment_4(), "rule__ExternalClassAssociation__CardinalityAssignment_4");
					put(grammarAccess.getExternalClassAssociationAccess().getExternalTargetAssignment_6(), "rule__ExternalClassAssociation__ExternalTargetAssignment_6");
					put(grammarAccess.getExternalClassAssociationAccess().getChangeableAssignment_7_0_1(), "rule__ExternalClassAssociation__ChangeableAssignment_7_0_1");
					put(grammarAccess.getExternalClassAssociationAccess().getDerivedAssignment_7_1_1(), "rule__ExternalClassAssociation__DerivedAssignment_7_1_1");
					put(grammarAccess.getExternalClassAssociationAccess().getOrderedAssignment_7_2_1(), "rule__ExternalClassAssociation__OrderedAssignment_7_2_1");
					put(grammarAccess.getExternalClassAssociationAccess().getTransientAssignment_7_3_1(), "rule__ExternalClassAssociation__TransientAssignment_7_3_1");
					put(grammarAccess.getExternalClassAssociationAccess().getUniqueAssignment_7_4_1(), "rule__ExternalClassAssociation__UniqueAssignment_7_4_1");
					put(grammarAccess.getExternalClassAssociationAccess().getUnsettableAssignment_7_5_1(), "rule__ExternalClassAssociation__UnsettableAssignment_7_5_1");
					put(grammarAccess.getExternalClassAssociationAccess().getVolatileAssignment_7_6_1(), "rule__ExternalClassAssociation__VolatileAssignment_7_6_1");
					put(grammarAccess.getExternalClassAssociationAccess().getOwned_annotationsAssignment_8(), "rule__ExternalClassAssociation__Owned_annotationsAssignment_8");
					put(grammarAccess.getLocalAttributeTypeAccess().getTypeAssignment_2(), "rule__LocalAttributeType__TypeAssignment_2");
					put(grammarAccess.getExternalAttributeTypeAccess().getTypeAssignment_2(), "rule__ExternalAttributeType__TypeAssignment_2");
					put(grammarAccess.getAttributeAccess().getNameAssignment_1(), "rule__Attribute__NameAssignment_1");
					put(grammarAccess.getAttributeAccess().getDescriptionAssignment_2_1(), "rule__Attribute__DescriptionAssignment_2_1");
					put(grammarAccess.getAttributeAccess().getOwned_typeAssignment_3(), "rule__Attribute__Owned_typeAssignment_3");
					put(grammarAccess.getAttributeAccess().getCardinalityAssignment_4(), "rule__Attribute__CardinalityAssignment_4");
					put(grammarAccess.getAttributeAccess().getIsIdAssignment_5_0_1(), "rule__Attribute__IsIdAssignment_5_0_1");
					put(grammarAccess.getAttributeAccess().getChangeableAssignment_5_1_1(), "rule__Attribute__ChangeableAssignment_5_1_1");
					put(grammarAccess.getAttributeAccess().getDerivedAssignment_5_2_1(), "rule__Attribute__DerivedAssignment_5_2_1");
					put(grammarAccess.getAttributeAccess().getOrderedAssignment_5_3_1(), "rule__Attribute__OrderedAssignment_5_3_1");
					put(grammarAccess.getAttributeAccess().getTransientAssignment_5_4_1(), "rule__Attribute__TransientAssignment_5_4_1");
					put(grammarAccess.getAttributeAccess().getUniqueAssignment_5_5_1(), "rule__Attribute__UniqueAssignment_5_5_1");
					put(grammarAccess.getAttributeAccess().getUnsettableAssignment_5_6_1(), "rule__Attribute__UnsettableAssignment_5_6_1");
					put(grammarAccess.getAttributeAccess().getVolatileAssignment_5_7_1(), "rule__Attribute__VolatileAssignment_5_7_1");
					put(grammarAccess.getAttributeAccess().getOwned_valuesAssignment_6_2_0(), "rule__Attribute__Owned_valuesAssignment_6_2_0");
					put(grammarAccess.getAttributeAccess().getOwned_valuesAssignment_6_2_1_1(), "rule__Attribute__Owned_valuesAssignment_6_2_1_1");
					put(grammarAccess.getAttributeAccess().getOwned_annotationsAssignment_7(), "rule__Attribute__Owned_annotationsAssignment_7");
					put(grammarAccess.getValueAccess().getNameAssignment_1_0(), "rule__Value__NameAssignment_1_0");
					put(grammarAccess.getValueAccess().getLiteralAssignment_2(), "rule__Value__LiteralAssignment_2");
					put(grammarAccess.getOperationAccess().getNameAssignment_1(), "rule__Operation__NameAssignment_1");
					put(grammarAccess.getOperationAccess().getParametersAssignment_3_0(), "rule__Operation__ParametersAssignment_3_0");
					put(grammarAccess.getOperationAccess().getParametersAssignment_3_1_1(), "rule__Operation__ParametersAssignment_3_1_1");
					put(grammarAccess.getOperationAccess().getOperation_typeAssignment_5_1(), "rule__Operation__Operation_typeAssignment_5_1");
					put(grammarAccess.getOperationAccess().getOwned_annotationsAssignment_6(), "rule__Operation__Owned_annotationsAssignment_6");
					put(grammarAccess.getParameterAccess().getParameter_typeAssignment_1(), "rule__Parameter__Parameter_typeAssignment_1");
					put(grammarAccess.getParameterAccess().getNameAssignment_2(), "rule__Parameter__NameAssignment_2");
					put(grammarAccess.getParameterAccess().getDescriptionAssignment_3(), "rule__Parameter__DescriptionAssignment_3");
					put(grammarAccess.getParameterAccess().getOwned_annotationsAssignment_4(), "rule__Parameter__Owned_annotationsAssignment_4");
					put(grammarAccess.getExternalTypeAccess().getTypeAssignment_2(), "rule__ExternalType__TypeAssignment_2");
					put(grammarAccess.getExternalTypeAccess().getCardinalityAssignment_3(), "rule__ExternalType__CardinalityAssignment_3");
					put(grammarAccess.getLocalTypeAccess().getTypeAssignment_1(), "rule__LocalType__TypeAssignment_1");
					put(grammarAccess.getLocalTypeAccess().getCardinalityAssignment_2(), "rule__LocalType__CardinalityAssignment_2");
					put(grammarAccess.getAnnotatableElementAccess().getOwned_annotationsAssignment_1(), "rule__AnnotatableElement__Owned_annotationsAssignment_1");
					put(grammarAccess.getAnnotationAccess().getSourceAssignment_2(), "rule__Annotation__SourceAssignment_2");
					put(grammarAccess.getAnnotationAccess().getOwned_detailsAssignment_3_1(), "rule__Annotation__Owned_detailsAssignment_3_1");
					put(grammarAccess.getDetailAccess().getKeyAssignment_2(), "rule__Detail__KeyAssignment_2");
					put(grammarAccess.getDetailAccess().getValueAssignment_3_1(), "rule__Detail__ValueAssignment_3_1");
					put(grammarAccess.getDataAccess().getUnorderedGroup_5(), "rule__Data__UnorderedGroup_5");
					put(grammarAccess.getLocalClassAssociationAccess().getUnorderedGroup_6(), "rule__LocalClassAssociation__UnorderedGroup_6");
					put(grammarAccess.getExternalClassAssociationAccess().getUnorderedGroup_7(), "rule__ExternalClassAssociation__UnorderedGroup_7");
					put(grammarAccess.getAttributeAccess().getUnorderedGroup_5(), "rule__Attribute__UnorderedGroup_5");
				}
			};
		}
		return nameMappings.get(element);
	}
	
	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.contentassist.antlr.internal.InternalDataParser typedParser = (org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.contentassist.antlr.internal.InternalDataParser) parser;
			typedParser.entryRuleDataSpec();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}		
	}
	
	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}
	
	public DataGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(DataGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}

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

import org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.VpuiGrammarAccess;

public class VpuiParser extends AbstractContentAssistParser {
	
	@Inject
	private VpuiGrammarAccess grammarAccess;
	
	private Map<AbstractElement, String> nameMappings;
	
	@Override
	protected org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.contentassist.antlr.internal.InternalVpuiParser createParser() {
		org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.contentassist.antlr.internal.InternalVpuiParser result = new org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.contentassist.antlr.internal.InternalVpuiParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}
	
	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getDisplayableElementAccess().getAlternatives(), "rule__DisplayableElement__Alternatives");
					put(grammarAccess.getEStringAccess().getAlternatives(), "rule__EString__Alternatives");
					put(grammarAccess.getEBooleanAccess().getAlternatives(), "rule__EBoolean__Alternatives");
					put(grammarAccess.getUI_Field_TypeAccess().getAlternatives(), "rule__UI_Field_Type__Alternatives");
					put(grammarAccess.getUserInterfaceAccess().getGroup(), "rule__UserInterface__Group__0");
					put(grammarAccess.getImportAccess().getGroup(), "rule__Import__Group__0");
					put(grammarAccess.getUIDescriptionAccess().getGroup(), "rule__UIDescription__Group__0");
					put(grammarAccess.getUIAccess().getGroup(), "rule__UI__Group__0");
					put(grammarAccess.getUIAccess().getGroup_5(), "rule__UI__Group_5__0");
					put(grammarAccess.getUIContainerAccess().getGroup(), "rule__UIContainer__Group__0");
					put(grammarAccess.getUIContainerAccess().getGroup_4(), "rule__UIContainer__Group_4__0");
					put(grammarAccess.getUIContainerAccess().getGroup_5(), "rule__UIContainer__Group_5__0");
					put(grammarAccess.getUIContainerAccess().getGroup_6(), "rule__UIContainer__Group_6__0");
					put(grammarAccess.getUIContainerAccess().getGroup_7(), "rule__UIContainer__Group_7__0");
					put(grammarAccess.getLocalClassAccess().getGroup(), "rule__LocalClass__Group__0");
					put(grammarAccess.getUIFieldAccess().getGroup(), "rule__UIField__Group__0");
					put(grammarAccess.getUIFieldAccess().getGroup_3(), "rule__UIField__Group_3__0");
					put(grammarAccess.getUIFieldAccess().getGroup_4(), "rule__UIField__Group_4__0");
					put(grammarAccess.getUIFieldAccess().getGroup_5(), "rule__UIField__Group_5__0");
					put(grammarAccess.getFieldMappingAccess().getGroup(), "rule__FieldMapping__Group__0");
					put(grammarAccess.getFQNAccess().getGroup(), "rule__FQN__Group__0");
					put(grammarAccess.getFQNAccess().getGroup_1(), "rule__FQN__Group_1__0");
					put(grammarAccess.getUserInterfaceAccess().getImportsAssignment_1(), "rule__UserInterface__ImportsAssignment_1");
					put(grammarAccess.getUserInterfaceAccess().getUiDescriptionAssignment_2(), "rule__UserInterface__UiDescriptionAssignment_2");
					put(grammarAccess.getImportAccess().getImportedNamespaceAssignment_1(), "rule__Import__ImportedNamespaceAssignment_1");
					put(grammarAccess.getUIDescriptionAccess().getNameAssignment_2(), "rule__UIDescription__NameAssignment_2");
					put(grammarAccess.getUIDescriptionAccess().getUIsAssignment_4(), "rule__UIDescription__UIsAssignment_4");
					put(grammarAccess.getUIAccess().getNameAssignment_2(), "rule__UI__NameAssignment_2");
					put(grammarAccess.getUIAccess().getUI_DataSourceAssignment_3(), "rule__UI__UI_DataSourceAssignment_3");
					put(grammarAccess.getUIAccess().getLabelAssignment_5_1(), "rule__UI__LabelAssignment_5_1");
					put(grammarAccess.getUIAccess().getUI_ContainersAssignment_6(), "rule__UI__UI_ContainersAssignment_6");
					put(grammarAccess.getUIContainerAccess().getNameAssignment_2(), "rule__UIContainer__NameAssignment_2");
					put(grammarAccess.getUIContainerAccess().getLabelAssignment_4_1(), "rule__UIContainer__LabelAssignment_4_1");
					put(grammarAccess.getUIContainerAccess().getDescriptionAssignment_5_1(), "rule__UIContainer__DescriptionAssignment_5_1");
					put(grammarAccess.getUIContainerAccess().getUI_fieldsAssignment_6_0(), "rule__UIContainer__UI_fieldsAssignment_6_0");
					put(grammarAccess.getUIContainerAccess().getUI_fieldsAssignment_6_1(), "rule__UIContainer__UI_fieldsAssignment_6_1");
					put(grammarAccess.getUIContainerAccess().getSubContainersAssignment_7_0(), "rule__UIContainer__SubContainersAssignment_7_0");
					put(grammarAccess.getUIContainerAccess().getSubContainersAssignment_7_1(), "rule__UIContainer__SubContainersAssignment_7_1");
					put(grammarAccess.getLocalClassAccess().getUI_For_LocalClassAssignment_2(), "rule__LocalClass__UI_For_LocalClassAssignment_2");
					put(grammarAccess.getUIFieldAccess().getNameAssignment_2(), "rule__UIField__NameAssignment_2");
					put(grammarAccess.getUIFieldAccess().getLabelAssignment_3_1(), "rule__UIField__LabelAssignment_3_1");
					put(grammarAccess.getUIFieldAccess().getDescriptionAssignment_4_1(), "rule__UIField__DescriptionAssignment_4_1");
					put(grammarAccess.getUIFieldAccess().getTypeAssignment_5_1(), "rule__UIField__TypeAssignment_5_1");
					put(grammarAccess.getUIFieldAccess().getMappingAssignment_7(), "rule__UIField__MappingAssignment_7");
					put(grammarAccess.getFieldMappingAccess().getUI_Field_Mapped_ToAssignment_2(), "rule__FieldMapping__UI_Field_Mapped_ToAssignment_2");
				}
			};
		}
		return nameMappings.get(element);
	}
	
	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.contentassist.antlr.internal.InternalVpuiParser typedParser = (org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.contentassist.antlr.internal.InternalVpuiParser) parser;
			typedParser.entryRuleUserInterface();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}		
	}
	
	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}
	
	public VpuiGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(VpuiGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}

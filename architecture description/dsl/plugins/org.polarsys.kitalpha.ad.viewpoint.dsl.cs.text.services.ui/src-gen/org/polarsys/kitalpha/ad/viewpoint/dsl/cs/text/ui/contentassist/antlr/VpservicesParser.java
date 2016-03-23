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

import org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.VpservicesGrammarAccess;

public class VpservicesParser extends AbstractContentAssistParser {
	
	@Inject
	private VpservicesGrammarAccess grammarAccess;
	
	private Map<AbstractElement, String> nameMappings;
	
	@Override
	protected org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.contentassist.antlr.internal.InternalVpservicesParser createParser() {
		org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.contentassist.antlr.internal.InternalVpservicesParser result = new org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.contentassist.antlr.internal.InternalVpservicesParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}
	
	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getAspectAccess().getAlternatives(), "rule__Aspect__Alternatives");
					put(grammarAccess.getEStringAccess().getAlternatives(), "rule__EString__Alternatives");
					put(grammarAccess.getEBooleanAccess().getAlternatives(), "rule__EBoolean__Alternatives");
					put(grammarAccess.getRules_TypesAccess().getAlternatives(), "rule__Rules_Types__Alternatives");
					put(grammarAccess.getPropertyTypeAccess().getAlternatives(), "rule__PropertyType__Alternatives");
					put(grammarAccess.getServicesAccess().getGroup(), "rule__Services__Group__0");
					put(grammarAccess.getServiceSetAccess().getGroup(), "rule__ServiceSet__Group__0");
					put(grammarAccess.getServiceSetAccess().getGroup_4(), "rule__ServiceSet__Group_4__0");
					put(grammarAccess.getServiceSetAccess().getGroup_5(), "rule__ServiceSet__Group_5__0");
					put(grammarAccess.getRuleSetAccess().getGroup(), "rule__RuleSet__Group__0");
					put(grammarAccess.getRuleSetAccess().getGroup_4(), "rule__RuleSet__Group_4__0");
					put(grammarAccess.getRuleSetAccess().getGroup_5(), "rule__RuleSet__Group_5__0");
					put(grammarAccess.getServiceAccess().getGroup(), "rule__Service__Group__0");
					put(grammarAccess.getServiceAccess().getGroup_3(), "rule__Service__Group_3__0");
					put(grammarAccess.getServiceAccess().getGroup_4(), "rule__Service__Group_4__0");
					put(grammarAccess.getServiceAccess().getGroup_4_2(), "rule__Service__Group_4_2__0");
					put(grammarAccess.getRuleAccess().getGroup(), "rule__Rule__Group__0");
					put(grammarAccess.getRuleAccess().getGroup_3(), "rule__Rule__Group_3__0");
					put(grammarAccess.getRuleAccess().getGroup_4(), "rule__Rule__Group_4__0");
					put(grammarAccess.getRuleAccess().getGroup_5(), "rule__Rule__Group_5__0");
					put(grammarAccess.getPropertySetAccess().getGroup(), "rule__PropertySet__Group__0");
					put(grammarAccess.getPropertyAccess().getGroup(), "rule__Property__Group__0");
					put(grammarAccess.getPropertyAccess().getGroup_3(), "rule__Property__Group_3__0");
					put(grammarAccess.getPropertyAccess().getGroup_4(), "rule__Property__Group_4__0");
					put(grammarAccess.getFQNAccess().getGroup(), "rule__FQN__Group__0");
					put(grammarAccess.getFQNAccess().getGroup_1(), "rule__FQN__Group_1__0");
					put(grammarAccess.getServicesAccess().getServicesAssignment_1(), "rule__Services__ServicesAssignment_1");
					put(grammarAccess.getServiceSetAccess().getNameAssignment_2(), "rule__ServiceSet__NameAssignment_2");
					put(grammarAccess.getServiceSetAccess().getDescriptionAssignment_4_1(), "rule__ServiceSet__DescriptionAssignment_4_1");
					put(grammarAccess.getServiceSetAccess().getVpServicesAssignment_5_0(), "rule__ServiceSet__VpServicesAssignment_5_0");
					put(grammarAccess.getServiceSetAccess().getVpServicesAssignment_5_1(), "rule__ServiceSet__VpServicesAssignment_5_1");
					put(grammarAccess.getRuleSetAccess().getNameAssignment_2(), "rule__RuleSet__NameAssignment_2");
					put(grammarAccess.getRuleSetAccess().getDescriptionAssignment_4_1(), "rule__RuleSet__DescriptionAssignment_4_1");
					put(grammarAccess.getRuleSetAccess().getVpRulesAssignment_5_0(), "rule__RuleSet__VpRulesAssignment_5_0");
					put(grammarAccess.getRuleSetAccess().getVpRulesAssignment_5_1(), "rule__RuleSet__VpRulesAssignment_5_1");
					put(grammarAccess.getServiceAccess().getNameAssignment_2(), "rule__Service__NameAssignment_2");
					put(grammarAccess.getServiceAccess().getDescriptionAssignment_3_1(), "rule__Service__DescriptionAssignment_3_1");
					put(grammarAccess.getServiceAccess().getRelatedRulesAssignment_4_1(), "rule__Service__RelatedRulesAssignment_4_1");
					put(grammarAccess.getServiceAccess().getRelatedRulesAssignment_4_2_1(), "rule__Service__RelatedRulesAssignment_4_2_1");
					put(grammarAccess.getRuleAccess().getNameAssignment_2(), "rule__Rule__NameAssignment_2");
					put(grammarAccess.getRuleAccess().getDescriptionAssignment_3_1(), "rule__Rule__DescriptionAssignment_3_1");
					put(grammarAccess.getRuleAccess().getTypeAssignment_4_1(), "rule__Rule__TypeAssignment_4_1");
					put(grammarAccess.getRuleAccess().getClassAssignment_5_2(), "rule__Rule__ClassAssignment_5_2");
					put(grammarAccess.getPropertySetAccess().getNameAssignment_2(), "rule__PropertySet__NameAssignment_2");
					put(grammarAccess.getPropertySetAccess().getVpPropertiesAssignment_4(), "rule__PropertySet__VpPropertiesAssignment_4");
					put(grammarAccess.getPropertyAccess().getNameAssignment_2(), "rule__Property__NameAssignment_2");
					put(grammarAccess.getPropertyAccess().getTypeAssignment_3_1(), "rule__Property__TypeAssignment_3_1");
					put(grammarAccess.getPropertyAccess().getValueAssignment_4_1(), "rule__Property__ValueAssignment_4_1");
				}
			};
		}
		return nameMappings.get(element);
	}
	
	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.contentassist.antlr.internal.InternalVpservicesParser typedParser = (org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.contentassist.antlr.internal.InternalVpservicesParser) parser;
			typedParser.entryRuleServices();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}		
	}
	
	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}
	
	public VpservicesGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(VpservicesGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}

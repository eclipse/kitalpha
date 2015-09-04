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
package org.polarsys.kitalpha.ad.af.dsl.cs.text.ui.contentassist.antlr;

import java.util.Collection;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;

import com.google.inject.Inject;

import org.polarsys.kitalpha.ad.af.dsl.cs.text.services.AfdescGrammarAccess;

public class AfdescParser extends AbstractContentAssistParser {
	
	@Inject
	private AfdescGrammarAccess grammarAccess;
	
	private Map<AbstractElement, String> nameMappings;
	
	@Override
	protected org.polarsys.kitalpha.ad.af.dsl.cs.text.ui.contentassist.antlr.internal.InternalAfdescParser createParser() {
		org.polarsys.kitalpha.ad.af.dsl.cs.text.ui.contentassist.antlr.internal.InternalAfdescParser result = new org.polarsys.kitalpha.ad.af.dsl.cs.text.ui.contentassist.antlr.internal.InternalAfdescParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}
	
	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getArchitectureFrameworkAccess().getGroup(), "rule__ArchitectureFramework__Group__0");
					put(grammarAccess.getArchitectureFrameworkAccess().getGroup_4(), "rule__ArchitectureFramework__Group_4__0");
					put(grammarAccess.getArchitectureFrameworkAccess().getGroup_5(), "rule__ArchitectureFramework__Group_5__0");
					put(grammarAccess.getConfigurationAccess().getGroup(), "rule__Configuration__Group__0");
					put(grammarAccess.getConfigurationAccess().getGroup_3(), "rule__Configuration__Group_3__0");
					put(grammarAccess.getConfigurationAccess().getGroup_3_1(), "rule__Configuration__Group_3_1__0");
					put(grammarAccess.getGenerationConfigurationAccess().getGroup(), "rule__GenerationConfiguration__Group__0");
					put(grammarAccess.getGenerationConfigurationAccess().getGroup_1(), "rule__GenerationConfiguration__Group_1__0");
					put(grammarAccess.getViewpointsAccess().getGroup(), "rule__Viewpoints__Group__0");
					put(grammarAccess.getViewpointsAccess().getGroup_3(), "rule__Viewpoints__Group_3__0");
					put(grammarAccess.getViewpointsAccess().getGroup_3_1(), "rule__Viewpoints__Group_3_1__0");
					put(grammarAccess.getFQNAccess().getGroup(), "rule__FQN__Group__0");
					put(grammarAccess.getFQNAccess().getGroup_1(), "rule__FQN__Group_1__0");
					put(grammarAccess.getArchitectureFrameworkAccess().getNameAssignment_2(), "rule__ArchitectureFramework__NameAssignment_2");
					put(grammarAccess.getArchitectureFrameworkAccess().getDescriptionAssignment_4_1(), "rule__ArchitectureFramework__DescriptionAssignment_4_1");
					put(grammarAccess.getArchitectureFrameworkAccess().getShortNameAssignment_5_1(), "rule__ArchitectureFramework__ShortNameAssignment_5_1");
					put(grammarAccess.getArchitectureFrameworkAccess().getAf_viewpointsAssignment_6(), "rule__ArchitectureFramework__Af_viewpointsAssignment_6");
					put(grammarAccess.getArchitectureFrameworkAccess().getOwned_configurationAssignment_7(), "rule__ArchitectureFramework__Owned_configurationAssignment_7");
					put(grammarAccess.getConfigurationAccess().getOwned_elementAssignment_3_0(), "rule__Configuration__Owned_elementAssignment_3_0");
					put(grammarAccess.getConfigurationAccess().getOwned_elementAssignment_3_1_1(), "rule__Configuration__Owned_elementAssignment_3_1_1");
					put(grammarAccess.getGenerationConfigurationAccess().getRootProjectNameAssignment_1_1(), "rule__GenerationConfiguration__RootProjectNameAssignment_1_1");
					put(grammarAccess.getViewpointsAccess().getOwned_viewpointsAssignment_3_0(), "rule__Viewpoints__Owned_viewpointsAssignment_3_0");
					put(grammarAccess.getViewpointsAccess().getOwned_viewpointsAssignment_3_1_1(), "rule__Viewpoints__Owned_viewpointsAssignment_3_1_1");
				}
			};
		}
		return nameMappings.get(element);
	}
	
	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			org.polarsys.kitalpha.ad.af.dsl.cs.text.ui.contentassist.antlr.internal.InternalAfdescParser typedParser = (org.polarsys.kitalpha.ad.af.dsl.cs.text.ui.contentassist.antlr.internal.InternalAfdescParser) parser;
			typedParser.entryRuleNamedElement();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}		
	}
	
	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}
	
	public AfdescGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(AfdescGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}

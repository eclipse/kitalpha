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

import org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.VpspecGrammarAccess;

public class VpspecParser extends AbstractContentAssistParser {
	
	@Inject
	private VpspecGrammarAccess grammarAccess;
	
	private Map<AbstractElement, String> nameMappings;
	
	@Override
	protected org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.contentassist.antlr.internal.InternalVpspecParser createParser() {
		org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.contentassist.antlr.internal.InternalVpspecParser result = new org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.contentassist.antlr.internal.InternalVpspecParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}
	
	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getEStringAccess().getAlternatives(), "rule__EString__Alternatives");
					put(grammarAccess.getEBooleanAccess().getAlternatives(), "rule__EBoolean__Alternatives");
					put(grammarAccess.getViewpointAccess().getGroup(), "rule__Viewpoint__Group__0");
					put(grammarAccess.getViewpointAccess().getGroup_4(), "rule__Viewpoint__Group_4__0");
					put(grammarAccess.getViewpointAccess().getGroup_5(), "rule__Viewpoint__Group_5__0");
					put(grammarAccess.getViewpointAccess().getGroup_6(), "rule__Viewpoint__Group_6__0");
					put(grammarAccess.getViewpointAccess().getGroup_6_2(), "rule__Viewpoint__Group_6_2__0");
					put(grammarAccess.getViewpointAccess().getGroup_7(), "rule__Viewpoint__Group_7__0");
					put(grammarAccess.getViewpointAccess().getGroup_7_2(), "rule__Viewpoint__Group_7_2__0");
					put(grammarAccess.getViewpointAccess().getGroup_8(), "rule__Viewpoint__Group_8__0");
					put(grammarAccess.getViewpointAccess().getGroup_8_2(), "rule__Viewpoint__Group_8_2__0");
					put(grammarAccess.getViewpointAccess().getGroup_9(), "rule__Viewpoint__Group_9__0");
					put(grammarAccess.getViewpointAccess().getGroup_9_2(), "rule__Viewpoint__Group_9_2__0");
					put(grammarAccess.getViewpointAccess().getGroup_10(), "rule__Viewpoint__Group_10__0");
					put(grammarAccess.getViewpointAccess().getGroup_10_2(), "rule__Viewpoint__Group_10_2__0");
					put(grammarAccess.getViewpointAccess().getGroup_11(), "rule__Viewpoint__Group_11__0");
					put(grammarAccess.getViewpointAccess().getGroup_11_2(), "rule__Viewpoint__Group_11_2__0");
					put(grammarAccess.getViewpointAccess().getGroup_12(), "rule__Viewpoint__Group_12__0");
					put(grammarAccess.getViewpointAccess().getGroup_12_2(), "rule__Viewpoint__Group_12_2__0");
					put(grammarAccess.getViewpointAccess().getGroup_13(), "rule__Viewpoint__Group_13__0");
					put(grammarAccess.getViewpointAccess().getGroup_14(), "rule__Viewpoint__Group_14__0");
					put(grammarAccess.getViewpointAccess().getGroup_15(), "rule__Viewpoint__Group_15__0");
					put(grammarAccess.getViewpointAccess().getGroup_16(), "rule__Viewpoint__Group_16__0");
					put(grammarAccess.getViewpointAccess().getGroup_17(), "rule__Viewpoint__Group_17__0");
					put(grammarAccess.getViewpointAccess().getGroup_18(), "rule__Viewpoint__Group_18__0");
					put(grammarAccess.getViewpointAccess().getGroup_19(), "rule__Viewpoint__Group_19__0");
					put(grammarAccess.getFQNAccess().getGroup(), "rule__FQN__Group__0");
					put(grammarAccess.getFQNAccess().getGroup_1(), "rule__FQN__Group_1__0");
					put(grammarAccess.getViewpointAccess().getShortNameAssignment_2(), "rule__Viewpoint__ShortNameAssignment_2");
					put(grammarAccess.getViewpointAccess().getNameAssignment_4_1(), "rule__Viewpoint__NameAssignment_4_1");
					put(grammarAccess.getViewpointAccess().getDescriptionAssignment_5_1(), "rule__Viewpoint__DescriptionAssignment_5_1");
					put(grammarAccess.getViewpointAccess().getParentsAssignment_6_1(), "rule__Viewpoint__ParentsAssignment_6_1");
					put(grammarAccess.getViewpointAccess().getParentsAssignment_6_2_1(), "rule__Viewpoint__ParentsAssignment_6_2_1");
					put(grammarAccess.getViewpointAccess().getDependenciesAssignment_7_1(), "rule__Viewpoint__DependenciesAssignment_7_1");
					put(grammarAccess.getViewpointAccess().getDependenciesAssignment_7_2_1(), "rule__Viewpoint__DependenciesAssignment_7_2_1");
					put(grammarAccess.getViewpointAccess().getUseViewpointAssignment_8_1(), "rule__Viewpoint__UseViewpointAssignment_8_1");
					put(grammarAccess.getViewpointAccess().getUseViewpointAssignment_8_2_1(), "rule__Viewpoint__UseViewpointAssignment_8_2_1");
					put(grammarAccess.getViewpointAccess().getUseAnyEMFResourceAssignment_9_1(), "rule__Viewpoint__UseAnyEMFResourceAssignment_9_1");
					put(grammarAccess.getViewpointAccess().getUseAnyEMFResourceAssignment_9_2_1(), "rule__Viewpoint__UseAnyEMFResourceAssignment_9_2_1");
					put(grammarAccess.getViewpointAccess().getUseDiagramResourceAssignment_10_1(), "rule__Viewpoint__UseDiagramResourceAssignment_10_1");
					put(grammarAccess.getViewpointAccess().getUseDiagramResourceAssignment_10_2_1(), "rule__Viewpoint__UseDiagramResourceAssignment_10_2_1");
					put(grammarAccess.getViewpointAccess().getUseWorkspaceResourceAssignment_11_1(), "rule__Viewpoint__UseWorkspaceResourceAssignment_11_1");
					put(grammarAccess.getViewpointAccess().getUseWorkspaceResourceAssignment_11_2_1(), "rule__Viewpoint__UseWorkspaceResourceAssignment_11_2_1");
					put(grammarAccess.getViewpointAccess().getUseFSResourceAssignment_12_1(), "rule__Viewpoint__UseFSResourceAssignment_12_1");
					put(grammarAccess.getViewpointAccess().getUseFSResourceAssignment_12_2_1(), "rule__Viewpoint__UseFSResourceAssignment_12_2_1");
					put(grammarAccess.getViewpointAccess().getVP_DataAssignment_13_1(), "rule__Viewpoint__VP_DataAssignment_13_1");
					put(grammarAccess.getViewpointAccess().getTypeAssignment_14_0(), "rule__Viewpoint__TypeAssignment_14_0");
					put(grammarAccess.getViewpointAccess().getVP_AspectsAssignment_14_1(), "rule__Viewpoint__VP_AspectsAssignment_14_1");
					put(grammarAccess.getViewpointAccess().getTypeAssignment_15_0(), "rule__Viewpoint__TypeAssignment_15_0");
					put(grammarAccess.getViewpointAccess().getVP_AspectsAssignment_15_1(), "rule__Viewpoint__VP_AspectsAssignment_15_1");
					put(grammarAccess.getViewpointAccess().getTypeAssignment_16_0(), "rule__Viewpoint__TypeAssignment_16_0");
					put(grammarAccess.getViewpointAccess().getVP_AspectsAssignment_16_1(), "rule__Viewpoint__VP_AspectsAssignment_16_1");
					put(grammarAccess.getViewpointAccess().getTypeAssignment_17_0(), "rule__Viewpoint__TypeAssignment_17_0");
					put(grammarAccess.getViewpointAccess().getVP_AspectsAssignment_17_1(), "rule__Viewpoint__VP_AspectsAssignment_17_1");
					put(grammarAccess.getViewpointAccess().getTypeAssignment_18_0(), "rule__Viewpoint__TypeAssignment_18_0");
					put(grammarAccess.getViewpointAccess().getVP_AspectsAssignment_18_1(), "rule__Viewpoint__VP_AspectsAssignment_18_1");
					put(grammarAccess.getViewpointAccess().getTypeAssignment_19_0(), "rule__Viewpoint__TypeAssignment_19_0");
					put(grammarAccess.getViewpointAccess().getVP_AspectsAssignment_19_1(), "rule__Viewpoint__VP_AspectsAssignment_19_1");
				}
			};
		}
		return nameMappings.get(element);
	}
	
	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.contentassist.antlr.internal.InternalVpspecParser typedParser = (org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.contentassist.antlr.internal.InternalVpspecParser) parser;
			typedParser.entryRuleViewpoint();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}		
	}
	
	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}
	
	public VpspecGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(VpspecGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}

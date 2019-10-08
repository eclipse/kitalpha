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
import java.util.HashMap;
import java.util.Map;

import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.VpbuildGrammarAccess;

import com.google.inject.Inject;

public class VpbuildParser extends AbstractContentAssistParser {
	
	@Inject
	private VpbuildGrammarAccess grammarAccess;
	
	private Map<AbstractElement, String> nameMappings;
	
	@Override
	protected org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.contentassist.antlr.internal.InternalVpbuildParser createParser() {
		org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.contentassist.antlr.internal.InternalVpbuildParser result = new org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.contentassist.antlr.internal.InternalVpbuildParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}
	
	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getTriggerAccess().getAlternatives(), "rule__Trigger__Alternatives");
					put(grammarAccess.getEStringAccess().getAlternatives(), "rule__EString__Alternatives");
					put(grammarAccess.getEBooleanAccess().getAlternatives(), "rule__EBoolean__Alternatives");
					put(grammarAccess.getProtocolTypeAccess().getAlternatives(), "rule__ProtocolType__Alternatives");
					put(grammarAccess.getUserPermissionAccess().getAlternatives(), "rule__UserPermission__Alternatives");
					put(grammarAccess.getBuildAccess().getGroup(), "rule__Build__Group__0");
					put(grammarAccess.getRepositoryAccess().getGroup(), "rule__Repository__Group__0");
					put(grammarAccess.getRepositoryAccess().getGroup_4(), "rule__Repository__Group_4__0");
					put(grammarAccess.getRepositoryAccess().getGroup_5(), "rule__Repository__Group_5__0");
					put(grammarAccess.getSourceFoulderAccess().getGroup(), "rule__SourceFoulder__Group__0");
					put(grammarAccess.getHudsonDeploymentAccess().getGroup(), "rule__HudsonDeployment__Group__0");
					put(grammarAccess.getHudsonDeploymentAccess().getGroup_3(), "rule__HudsonDeployment__Group_3__0");
					put(grammarAccess.getHudsonDeploymentAccess().getGroup_4(), "rule__HudsonDeployment__Group_4__0");
					put(grammarAccess.getHudsonDeploymentAccess().getGroup_5(), "rule__HudsonDeployment__Group_5__0");
					put(grammarAccess.getHudsonDeploymentAccess().getGroup_6(), "rule__HudsonDeployment__Group_6__0");
					put(grammarAccess.getHudsonDeploymentAccess().getGroup_7(), "rule__HudsonDeployment__Group_7__0");
					put(grammarAccess.getHudsonDeploymentAccess().getGroup_8(), "rule__HudsonDeployment__Group_8__0");
					put(grammarAccess.getHudsonDeploymentAccess().getGroup_9(), "rule__HudsonDeployment__Group_9__0");
					put(grammarAccess.getHudsonDeploymentAccess().getGroup_10(), "rule__HudsonDeployment__Group_10__0");
					put(grammarAccess.getHudsonDeploymentAccess().getGroup_11(), "rule__HudsonDeployment__Group_11__0");
					put(grammarAccess.getGenerationLocationAccess().getGroup(), "rule__GenerationLocation__Group__0");
					put(grammarAccess.getGenerationLocationAccess().getGroup_3(), "rule__GenerationLocation__Group_3__0");
					put(grammarAccess.getSCMAccess().getGroup(), "rule__SCM__Group__0");
					put(grammarAccess.getCronAccess().getGroup(), "rule__Cron__Group__0");
					put(grammarAccess.getUserAccess().getGroup(), "rule__User__Group__0");
					put(grammarAccess.getUserAccess().getGroup_3(), "rule__User__Group_3__0");
					put(grammarAccess.getFeatureAccess().getGroup(), "rule__Feature__Group__0");
					put(grammarAccess.getFQNAccess().getGroup(), "rule__FQN__Group__0");
					put(grammarAccess.getFQNAccess().getGroup_1(), "rule__FQN__Group_1__0");
					put(grammarAccess.getBuildAccess().getNameAssignment_2(), "rule__Build__NameAssignment_2");
					put(grammarAccess.getBuildAccess().getTarget_platformAssignment_5(), "rule__Build__Target_platformAssignment_5");
					put(grammarAccess.getBuildAccess().getMapped_repositoriesAssignment_6(), "rule__Build__Mapped_repositoriesAssignment_6");
					put(grammarAccess.getBuildAccess().getHudsonDeploymentAssignment_7(), "rule__Build__HudsonDeploymentAssignment_7");
					put(grammarAccess.getRepositoryAccess().getProtocolAssignment_2(), "rule__Repository__ProtocolAssignment_2");
					put(grammarAccess.getRepositoryAccess().getLocationAssignment_3(), "rule__Repository__LocationAssignment_3");
					put(grammarAccess.getRepositoryAccess().getFoldersAssignment_4_1(), "rule__Repository__FoldersAssignment_4_1");
					put(grammarAccess.getRepositoryAccess().getFeaturesAssignment_5_1(), "rule__Repository__FeaturesAssignment_5_1");
					put(grammarAccess.getSourceFoulderAccess().getNameAssignment_2(), "rule__SourceFoulder__NameAssignment_2");
					put(grammarAccess.getHudsonDeploymentAccess().getAntNameAssignment_3_1(), "rule__HudsonDeployment__AntNameAssignment_3_1");
					put(grammarAccess.getHudsonDeploymentAccess().getAssignedNodeAssignment_4_1(), "rule__HudsonDeployment__AssignedNodeAssignment_4_1");
					put(grammarAccess.getHudsonDeploymentAccess().getBuild_idAssignment_5_1(), "rule__HudsonDeployment__Build_idAssignment_5_1");
					put(grammarAccess.getHudsonDeploymentAccess().getEnabledAssignment_6_1(), "rule__HudsonDeployment__EnabledAssignment_6_1");
					put(grammarAccess.getHudsonDeploymentAccess().getJdkNameAssignment_7_1(), "rule__HudsonDeployment__JdkNameAssignment_7_1");
					put(grammarAccess.getHudsonDeploymentAccess().getUserDeployJobNameAssignment_8_1(), "rule__HudsonDeployment__UserDeployJobNameAssignment_8_1");
					put(grammarAccess.getHudsonDeploymentAccess().getUserDeployServerUrlAssignment_9_1(), "rule__HudsonDeployment__UserDeployServerUrlAssignment_9_1");
					put(grammarAccess.getHudsonDeploymentAccess().getUsersAssignment_10_2(), "rule__HudsonDeployment__UsersAssignment_10_2");
					put(grammarAccess.getHudsonDeploymentAccess().getTriggersAssignment_11_2(), "rule__HudsonDeployment__TriggersAssignment_11_2");
					put(grammarAccess.getHudsonDeploymentAccess().getGenerationLocationAssignment_12(), "rule__HudsonDeployment__GenerationLocationAssignment_12");
					put(grammarAccess.getGenerationLocationAccess().getFolderAssignment_2(), "rule__GenerationLocation__FolderAssignment_2");
					put(grammarAccess.getGenerationLocationAccess().getUrlAssignment_3_1(), "rule__GenerationLocation__UrlAssignment_3_1");
					put(grammarAccess.getSCMAccess().getPlanningAssignment_2(), "rule__SCM__PlanningAssignment_2");
					put(grammarAccess.getCronAccess().getPlanningAssignment_2(), "rule__Cron__PlanningAssignment_2");
					put(grammarAccess.getUserAccess().getLoginAssignment_2(), "rule__User__LoginAssignment_2");
					put(grammarAccess.getUserAccess().getPermissionAssignment_3_1(), "rule__User__PermissionAssignment_3_1");
					put(grammarAccess.getFeatureAccess().getNameAssignment_1(), "rule__Feature__NameAssignment_1");
				}
			};
		}
		return nameMappings.get(element);
	}
	
	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.contentassist.antlr.internal.InternalVpbuildParser typedParser = (org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.contentassist.antlr.internal.InternalVpbuildParser) parser;
			typedParser.entryRuleBuild();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}		
	}
	
	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}
	
	public VpbuildGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(VpbuildGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}

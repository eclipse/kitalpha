/*******************************************************************************
 * Copyright (c) 2015 Thales Global Services S.A.S.
 *  This program and the accompanying materials are made available under the
 *  terms of the Eclipse Public License 2.0 which is available at
 *  http://www.eclipse.org/legal/epl-2.0
 *  
 *  SPDX-License-Identifier: EPL-2.0
 * 
 * Contributors:
 *  Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/
package org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services;

import java.util.List;

import org.eclipse.xtext.Action;
import org.eclipse.xtext.Alternatives;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.EnumLiteralDeclaration;
import org.eclipse.xtext.EnumRule;
import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.GrammarUtil;
import org.eclipse.xtext.Group;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.TerminalRule;
import org.eclipse.xtext.service.AbstractElementFinder.AbstractGrammarElementFinder;
import org.eclipse.xtext.service.GrammarProvider;

import com.google.inject.Inject;
import com.google.inject.Singleton;

@Singleton
public class VpbuildGrammarAccess extends AbstractGrammarElementFinder {
	
	
	public class BuildElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Build");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cBuildAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cBuildKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cNameAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cNameFQNParserRuleCall_2_0 = (RuleCall)cNameAssignment_2.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Keyword cTargetPlatformKeyword_4 = (Keyword)cGroup.eContents().get(4);
		private final Assignment cTarget_platformAssignment_5 = (Assignment)cGroup.eContents().get(5);
		private final RuleCall cTarget_platformSTRINGTerminalRuleCall_5_0 = (RuleCall)cTarget_platformAssignment_5.eContents().get(0);
		private final Assignment cMapped_repositoriesAssignment_6 = (Assignment)cGroup.eContents().get(6);
		private final RuleCall cMapped_repositoriesRepositoryParserRuleCall_6_0 = (RuleCall)cMapped_repositoriesAssignment_6.eContents().get(0);
		private final Assignment cHudsonDeploymentAssignment_7 = (Assignment)cGroup.eContents().get(7);
		private final RuleCall cHudsonDeploymentHudsonDeploymentParserRuleCall_7_0 = (RuleCall)cHudsonDeploymentAssignment_7.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_8 = (Keyword)cGroup.eContents().get(8);
		
		/// ********************************************************************
		// * 							Build
		// * 
		// ******************************************************************** / / **
		// * 
		// * @author Amine Lajmi
		// *
		// * / Build returns vpdesc::Aspect:
		//	{vpbuild::Build} "Build" name=FQN "{" "target-platform:" target_platform=STRING mapped_repositories+=Repository*
		//	hudsonDeployment=HudsonDeployment? "}";
		@Override public ParserRule getRule() { return rule; }

		//{vpbuild::Build} "Build" name=FQN "{" "target-platform:" target_platform=STRING mapped_repositories+=Repository*
		//hudsonDeployment=HudsonDeployment? "}"
		public Group getGroup() { return cGroup; }

		//{vpbuild::Build}
		public Action getBuildAction_0() { return cBuildAction_0; }

		//"Build"
		public Keyword getBuildKeyword_1() { return cBuildKeyword_1; }

		//name=FQN
		public Assignment getNameAssignment_2() { return cNameAssignment_2; }

		//FQN
		public RuleCall getNameFQNParserRuleCall_2_0() { return cNameFQNParserRuleCall_2_0; }

		//"{"
		public Keyword getLeftCurlyBracketKeyword_3() { return cLeftCurlyBracketKeyword_3; }

		//"target-platform:"
		public Keyword getTargetPlatformKeyword_4() { return cTargetPlatformKeyword_4; }

		//target_platform=STRING
		public Assignment getTarget_platformAssignment_5() { return cTarget_platformAssignment_5; }

		//STRING
		public RuleCall getTarget_platformSTRINGTerminalRuleCall_5_0() { return cTarget_platformSTRINGTerminalRuleCall_5_0; }

		//mapped_repositories+=Repository*
		public Assignment getMapped_repositoriesAssignment_6() { return cMapped_repositoriesAssignment_6; }

		//Repository
		public RuleCall getMapped_repositoriesRepositoryParserRuleCall_6_0() { return cMapped_repositoriesRepositoryParserRuleCall_6_0; }

		//hudsonDeployment=HudsonDeployment?
		public Assignment getHudsonDeploymentAssignment_7() { return cHudsonDeploymentAssignment_7; }

		//HudsonDeployment
		public RuleCall getHudsonDeploymentHudsonDeploymentParserRuleCall_7_0() { return cHudsonDeploymentHudsonDeploymentParserRuleCall_7_0; }

		//"}"
		public Keyword getRightCurlyBracketKeyword_8() { return cRightCurlyBracketKeyword_8; }
	}

	public class RepositoryElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Repository");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cRepositoryAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cRepositoryKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cProtocolAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cProtocolProtocolTypeEnumRuleCall_2_0 = (RuleCall)cProtocolAssignment_2.eContents().get(0);
		private final Assignment cLocationAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cLocationSTRINGTerminalRuleCall_3_0 = (RuleCall)cLocationAssignment_3.eContents().get(0);
		private final Group cGroup_4 = (Group)cGroup.eContents().get(4);
		private final Keyword cLeftCurlyBracketKeyword_4_0 = (Keyword)cGroup_4.eContents().get(0);
		private final Assignment cFoldersAssignment_4_1 = (Assignment)cGroup_4.eContents().get(1);
		private final RuleCall cFoldersSourceFoulderParserRuleCall_4_1_0 = (RuleCall)cFoldersAssignment_4_1.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_4_2 = (Keyword)cGroup_4.eContents().get(2);
		private final Group cGroup_5 = (Group)cGroup.eContents().get(5);
		private final Keyword cFeaturesKeyword_5_0 = (Keyword)cGroup_5.eContents().get(0);
		private final Assignment cFeaturesAssignment_5_1 = (Assignment)cGroup_5.eContents().get(1);
		private final RuleCall cFeaturesFeatureParserRuleCall_5_1_0 = (RuleCall)cFeaturesAssignment_5_1.eContents().get(0);
		
		//Repository returns vpbuild::Repository:
		//	{vpbuild::Repository} "repository:" protocol=ProtocolType location=STRING ("{" folders+=SourceFoulder* "}")?
		//	("features:" features+=Feature*);
		@Override public ParserRule getRule() { return rule; }

		//{vpbuild::Repository} "repository:" protocol=ProtocolType location=STRING ("{" folders+=SourceFoulder* "}")?
		//("features:" features+=Feature*)
		public Group getGroup() { return cGroup; }

		//{vpbuild::Repository}
		public Action getRepositoryAction_0() { return cRepositoryAction_0; }

		//"repository:"
		public Keyword getRepositoryKeyword_1() { return cRepositoryKeyword_1; }

		//protocol=ProtocolType
		public Assignment getProtocolAssignment_2() { return cProtocolAssignment_2; }

		//ProtocolType
		public RuleCall getProtocolProtocolTypeEnumRuleCall_2_0() { return cProtocolProtocolTypeEnumRuleCall_2_0; }

		//location=STRING
		public Assignment getLocationAssignment_3() { return cLocationAssignment_3; }

		//STRING
		public RuleCall getLocationSTRINGTerminalRuleCall_3_0() { return cLocationSTRINGTerminalRuleCall_3_0; }

		//("{" folders+=SourceFoulder* "}")?
		public Group getGroup_4() { return cGroup_4; }

		//"{"
		public Keyword getLeftCurlyBracketKeyword_4_0() { return cLeftCurlyBracketKeyword_4_0; }

		//folders+=SourceFoulder*
		public Assignment getFoldersAssignment_4_1() { return cFoldersAssignment_4_1; }

		//SourceFoulder
		public RuleCall getFoldersSourceFoulderParserRuleCall_4_1_0() { return cFoldersSourceFoulderParserRuleCall_4_1_0; }

		//"}"
		public Keyword getRightCurlyBracketKeyword_4_2() { return cRightCurlyBracketKeyword_4_2; }

		//"features:" features+=Feature*
		public Group getGroup_5() { return cGroup_5; }

		//"features:"
		public Keyword getFeaturesKeyword_5_0() { return cFeaturesKeyword_5_0; }

		//features+=Feature*
		public Assignment getFeaturesAssignment_5_1() { return cFeaturesAssignment_5_1; }

		//Feature
		public RuleCall getFeaturesFeatureParserRuleCall_5_1_0() { return cFeaturesFeatureParserRuleCall_5_1_0; }
	}

	public class SourceFoulderElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "SourceFoulder");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cSourceFolderAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cFolderKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cNameAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cNameSTRINGTerminalRuleCall_2_0 = (RuleCall)cNameAssignment_2.eContents().get(0);
		
		//SourceFoulder returns vpbuild::SourceFolder:
		//	{vpbuild::SourceFolder} "folder" name=STRING;
		@Override public ParserRule getRule() { return rule; }

		//{vpbuild::SourceFolder} "folder" name=STRING
		public Group getGroup() { return cGroup; }

		//{vpbuild::SourceFolder}
		public Action getSourceFolderAction_0() { return cSourceFolderAction_0; }

		//"folder"
		public Keyword getFolderKeyword_1() { return cFolderKeyword_1; }

		//name=STRING
		public Assignment getNameAssignment_2() { return cNameAssignment_2; }

		//STRING
		public RuleCall getNameSTRINGTerminalRuleCall_2_0() { return cNameSTRINGTerminalRuleCall_2_0; }
	}

	public class HudsonDeploymentElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "HudsonDeployment");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cHudsonDeploymentAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cHudsonDeploymentKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cLeftCurlyBracketKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Group cGroup_3 = (Group)cGroup.eContents().get(3);
		private final Keyword cAntKeyword_3_0 = (Keyword)cGroup_3.eContents().get(0);
		private final Assignment cAntNameAssignment_3_1 = (Assignment)cGroup_3.eContents().get(1);
		private final RuleCall cAntNameSTRINGTerminalRuleCall_3_1_0 = (RuleCall)cAntNameAssignment_3_1.eContents().get(0);
		private final Group cGroup_4 = (Group)cGroup.eContents().get(4);
		private final Keyword cAssignedNodeKeyword_4_0 = (Keyword)cGroup_4.eContents().get(0);
		private final Assignment cAssignedNodeAssignment_4_1 = (Assignment)cGroup_4.eContents().get(1);
		private final RuleCall cAssignedNodeSTRINGTerminalRuleCall_4_1_0 = (RuleCall)cAssignedNodeAssignment_4_1.eContents().get(0);
		private final Group cGroup_5 = (Group)cGroup.eContents().get(5);
		private final Keyword cBuildIdKeyword_5_0 = (Keyword)cGroup_5.eContents().get(0);
		private final Assignment cBuild_idAssignment_5_1 = (Assignment)cGroup_5.eContents().get(1);
		private final RuleCall cBuild_idSTRINGTerminalRuleCall_5_1_0 = (RuleCall)cBuild_idAssignment_5_1.eContents().get(0);
		private final Group cGroup_6 = (Group)cGroup.eContents().get(6);
		private final Keyword cEnableKeyword_6_0 = (Keyword)cGroup_6.eContents().get(0);
		private final Assignment cEnabledAssignment_6_1 = (Assignment)cGroup_6.eContents().get(1);
		private final RuleCall cEnabledEBooleanParserRuleCall_6_1_0 = (RuleCall)cEnabledAssignment_6_1.eContents().get(0);
		private final Group cGroup_7 = (Group)cGroup.eContents().get(7);
		private final Keyword cJdkNameKeyword_7_0 = (Keyword)cGroup_7.eContents().get(0);
		private final Assignment cJdkNameAssignment_7_1 = (Assignment)cGroup_7.eContents().get(1);
		private final RuleCall cJdkNameSTRINGTerminalRuleCall_7_1_0 = (RuleCall)cJdkNameAssignment_7_1.eContents().get(0);
		private final Group cGroup_8 = (Group)cGroup.eContents().get(8);
		private final Keyword cUserDeployJobNameKeyword_8_0 = (Keyword)cGroup_8.eContents().get(0);
		private final Assignment cUserDeployJobNameAssignment_8_1 = (Assignment)cGroup_8.eContents().get(1);
		private final RuleCall cUserDeployJobNameSTRINGTerminalRuleCall_8_1_0 = (RuleCall)cUserDeployJobNameAssignment_8_1.eContents().get(0);
		private final Group cGroup_9 = (Group)cGroup.eContents().get(9);
		private final Keyword cUserDeployServerUrlKeyword_9_0 = (Keyword)cGroup_9.eContents().get(0);
		private final Assignment cUserDeployServerUrlAssignment_9_1 = (Assignment)cGroup_9.eContents().get(1);
		private final RuleCall cUserDeployServerUrlSTRINGTerminalRuleCall_9_1_0 = (RuleCall)cUserDeployServerUrlAssignment_9_1.eContents().get(0);
		private final Group cGroup_10 = (Group)cGroup.eContents().get(10);
		private final Keyword cUsersKeyword_10_0 = (Keyword)cGroup_10.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_10_1 = (Keyword)cGroup_10.eContents().get(1);
		private final Assignment cUsersAssignment_10_2 = (Assignment)cGroup_10.eContents().get(2);
		private final RuleCall cUsersUserParserRuleCall_10_2_0 = (RuleCall)cUsersAssignment_10_2.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_10_3 = (Keyword)cGroup_10.eContents().get(3);
		private final Group cGroup_11 = (Group)cGroup.eContents().get(11);
		private final Keyword cTriggersKeyword_11_0 = (Keyword)cGroup_11.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_11_1 = (Keyword)cGroup_11.eContents().get(1);
		private final Assignment cTriggersAssignment_11_2 = (Assignment)cGroup_11.eContents().get(2);
		private final RuleCall cTriggersTriggerParserRuleCall_11_2_0 = (RuleCall)cTriggersAssignment_11_2.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_11_3 = (Keyword)cGroup_11.eContents().get(3);
		private final Assignment cGenerationLocationAssignment_12 = (Assignment)cGroup.eContents().get(12);
		private final RuleCall cGenerationLocationGenerationLocationParserRuleCall_12_0 = (RuleCall)cGenerationLocationAssignment_12.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_13 = (Keyword)cGroup.eContents().get(13);
		
		//HudsonDeployment returns vpbuild::HudsonDeployment:
		//	{vpbuild::HudsonDeployment} "hudson-deployment" "{" ("ant:" antName=STRING)? ("assigned-node:" assignedNode=STRING)?
		//	("build-id:" build_id=STRING)? ("enable:" enabled=EBoolean)? ("jdk-name:" jdkName=STRING)? ("user-deploy-job-name:"
		//	userDeployJobName=STRING)? ("user-deploy-server-url:" userDeployServerUrl=STRING)? ("users" "{" users+=User* "}")?
		//	("triggers" "{" triggers+=Trigger* "}")? generationLocation=GenerationLocation? "}";
		@Override public ParserRule getRule() { return rule; }

		//{vpbuild::HudsonDeployment} "hudson-deployment" "{" ("ant:" antName=STRING)? ("assigned-node:" assignedNode=STRING)?
		//("build-id:" build_id=STRING)? ("enable:" enabled=EBoolean)? ("jdk-name:" jdkName=STRING)? ("user-deploy-job-name:"
		//userDeployJobName=STRING)? ("user-deploy-server-url:" userDeployServerUrl=STRING)? ("users" "{" users+=User* "}")?
		//("triggers" "{" triggers+=Trigger* "}")? generationLocation=GenerationLocation? "}"
		public Group getGroup() { return cGroup; }

		//{vpbuild::HudsonDeployment}
		public Action getHudsonDeploymentAction_0() { return cHudsonDeploymentAction_0; }

		//"hudson-deployment"
		public Keyword getHudsonDeploymentKeyword_1() { return cHudsonDeploymentKeyword_1; }

		//"{"
		public Keyword getLeftCurlyBracketKeyword_2() { return cLeftCurlyBracketKeyword_2; }

		//("ant:" antName=STRING)?
		public Group getGroup_3() { return cGroup_3; }

		//"ant:"
		public Keyword getAntKeyword_3_0() { return cAntKeyword_3_0; }

		//antName=STRING
		public Assignment getAntNameAssignment_3_1() { return cAntNameAssignment_3_1; }

		//STRING
		public RuleCall getAntNameSTRINGTerminalRuleCall_3_1_0() { return cAntNameSTRINGTerminalRuleCall_3_1_0; }

		//("assigned-node:" assignedNode=STRING)?
		public Group getGroup_4() { return cGroup_4; }

		//"assigned-node:"
		public Keyword getAssignedNodeKeyword_4_0() { return cAssignedNodeKeyword_4_0; }

		//assignedNode=STRING
		public Assignment getAssignedNodeAssignment_4_1() { return cAssignedNodeAssignment_4_1; }

		//STRING
		public RuleCall getAssignedNodeSTRINGTerminalRuleCall_4_1_0() { return cAssignedNodeSTRINGTerminalRuleCall_4_1_0; }

		//("build-id:" build_id=STRING)?
		public Group getGroup_5() { return cGroup_5; }

		//"build-id:"
		public Keyword getBuildIdKeyword_5_0() { return cBuildIdKeyword_5_0; }

		//build_id=STRING
		public Assignment getBuild_idAssignment_5_1() { return cBuild_idAssignment_5_1; }

		//STRING
		public RuleCall getBuild_idSTRINGTerminalRuleCall_5_1_0() { return cBuild_idSTRINGTerminalRuleCall_5_1_0; }

		//("enable:" enabled=EBoolean)?
		public Group getGroup_6() { return cGroup_6; }

		//"enable:"
		public Keyword getEnableKeyword_6_0() { return cEnableKeyword_6_0; }

		//enabled=EBoolean
		public Assignment getEnabledAssignment_6_1() { return cEnabledAssignment_6_1; }

		//EBoolean
		public RuleCall getEnabledEBooleanParserRuleCall_6_1_0() { return cEnabledEBooleanParserRuleCall_6_1_0; }

		//("jdk-name:" jdkName=STRING)?
		public Group getGroup_7() { return cGroup_7; }

		//"jdk-name:"
		public Keyword getJdkNameKeyword_7_0() { return cJdkNameKeyword_7_0; }

		//jdkName=STRING
		public Assignment getJdkNameAssignment_7_1() { return cJdkNameAssignment_7_1; }

		//STRING
		public RuleCall getJdkNameSTRINGTerminalRuleCall_7_1_0() { return cJdkNameSTRINGTerminalRuleCall_7_1_0; }

		//("user-deploy-job-name:" userDeployJobName=STRING)?
		public Group getGroup_8() { return cGroup_8; }

		//"user-deploy-job-name:"
		public Keyword getUserDeployJobNameKeyword_8_0() { return cUserDeployJobNameKeyword_8_0; }

		//userDeployJobName=STRING
		public Assignment getUserDeployJobNameAssignment_8_1() { return cUserDeployJobNameAssignment_8_1; }

		//STRING
		public RuleCall getUserDeployJobNameSTRINGTerminalRuleCall_8_1_0() { return cUserDeployJobNameSTRINGTerminalRuleCall_8_1_0; }

		//("user-deploy-server-url:" userDeployServerUrl=STRING)?
		public Group getGroup_9() { return cGroup_9; }

		//"user-deploy-server-url:"
		public Keyword getUserDeployServerUrlKeyword_9_0() { return cUserDeployServerUrlKeyword_9_0; }

		//userDeployServerUrl=STRING
		public Assignment getUserDeployServerUrlAssignment_9_1() { return cUserDeployServerUrlAssignment_9_1; }

		//STRING
		public RuleCall getUserDeployServerUrlSTRINGTerminalRuleCall_9_1_0() { return cUserDeployServerUrlSTRINGTerminalRuleCall_9_1_0; }

		//("users" "{" users+=User* "}")?
		public Group getGroup_10() { return cGroup_10; }

		//"users"
		public Keyword getUsersKeyword_10_0() { return cUsersKeyword_10_0; }

		//"{"
		public Keyword getLeftCurlyBracketKeyword_10_1() { return cLeftCurlyBracketKeyword_10_1; }

		//users+=User*
		public Assignment getUsersAssignment_10_2() { return cUsersAssignment_10_2; }

		//User
		public RuleCall getUsersUserParserRuleCall_10_2_0() { return cUsersUserParserRuleCall_10_2_0; }

		//"}"
		public Keyword getRightCurlyBracketKeyword_10_3() { return cRightCurlyBracketKeyword_10_3; }

		//("triggers" "{" triggers+=Trigger* "}")?
		public Group getGroup_11() { return cGroup_11; }

		//"triggers"
		public Keyword getTriggersKeyword_11_0() { return cTriggersKeyword_11_0; }

		//"{"
		public Keyword getLeftCurlyBracketKeyword_11_1() { return cLeftCurlyBracketKeyword_11_1; }

		//triggers+=Trigger*
		public Assignment getTriggersAssignment_11_2() { return cTriggersAssignment_11_2; }

		//Trigger
		public RuleCall getTriggersTriggerParserRuleCall_11_2_0() { return cTriggersTriggerParserRuleCall_11_2_0; }

		//"}"
		public Keyword getRightCurlyBracketKeyword_11_3() { return cRightCurlyBracketKeyword_11_3; }

		//generationLocation=GenerationLocation?
		public Assignment getGenerationLocationAssignment_12() { return cGenerationLocationAssignment_12; }

		//GenerationLocation
		public RuleCall getGenerationLocationGenerationLocationParserRuleCall_12_0() { return cGenerationLocationGenerationLocationParserRuleCall_12_0; }

		//"}"
		public Keyword getRightCurlyBracketKeyword_13() { return cRightCurlyBracketKeyword_13; }
	}

	public class GenerationLocationElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "GenerationLocation");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cGenerationLocationAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cGenerationLocationKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cFolderAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cFolderSTRINGTerminalRuleCall_2_0 = (RuleCall)cFolderAssignment_2.eContents().get(0);
		private final Group cGroup_3 = (Group)cGroup.eContents().get(3);
		private final Keyword cUrlKeyword_3_0 = (Keyword)cGroup_3.eContents().get(0);
		private final Assignment cUrlAssignment_3_1 = (Assignment)cGroup_3.eContents().get(1);
		private final RuleCall cUrlSTRINGTerminalRuleCall_3_1_0 = (RuleCall)cUrlAssignment_3_1.eContents().get(0);
		
		//GenerationLocation returns vpbuild::GenerationLocation:
		//	{vpbuild::GenerationLocation} "generation-location:" folder=STRING ("url:" url=STRING)?;
		@Override public ParserRule getRule() { return rule; }

		//{vpbuild::GenerationLocation} "generation-location:" folder=STRING ("url:" url=STRING)?
		public Group getGroup() { return cGroup; }

		//{vpbuild::GenerationLocation}
		public Action getGenerationLocationAction_0() { return cGenerationLocationAction_0; }

		//"generation-location:"
		public Keyword getGenerationLocationKeyword_1() { return cGenerationLocationKeyword_1; }

		//folder=STRING
		public Assignment getFolderAssignment_2() { return cFolderAssignment_2; }

		//STRING
		public RuleCall getFolderSTRINGTerminalRuleCall_2_0() { return cFolderSTRINGTerminalRuleCall_2_0; }

		//("url:" url=STRING)?
		public Group getGroup_3() { return cGroup_3; }

		//"url:"
		public Keyword getUrlKeyword_3_0() { return cUrlKeyword_3_0; }

		//url=STRING
		public Assignment getUrlAssignment_3_1() { return cUrlAssignment_3_1; }

		//STRING
		public RuleCall getUrlSTRINGTerminalRuleCall_3_1_0() { return cUrlSTRINGTerminalRuleCall_3_1_0; }
	}

	public class TriggerElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Trigger");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cSCMParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cCronParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		
		//Trigger returns vpbuild::Trigger:
		//	SCM | Cron;
		@Override public ParserRule getRule() { return rule; }

		//SCM | Cron
		public Alternatives getAlternatives() { return cAlternatives; }

		//SCM
		public RuleCall getSCMParserRuleCall_0() { return cSCMParserRuleCall_0; }

		//Cron
		public RuleCall getCronParserRuleCall_1() { return cCronParserRuleCall_1; }
	}

	public class SCMElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "SCM");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cSCMAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cSCMKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cPlanningAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cPlanningSTRINGTerminalRuleCall_2_0 = (RuleCall)cPlanningAssignment_2.eContents().get(0);
		
		//SCM returns vpbuild::SCM:
		//	{vpbuild::SCM} "SCM" planning=STRING;
		@Override public ParserRule getRule() { return rule; }

		//{vpbuild::SCM} "SCM" planning=STRING
		public Group getGroup() { return cGroup; }

		//{vpbuild::SCM}
		public Action getSCMAction_0() { return cSCMAction_0; }

		//"SCM"
		public Keyword getSCMKeyword_1() { return cSCMKeyword_1; }

		//planning=STRING
		public Assignment getPlanningAssignment_2() { return cPlanningAssignment_2; }

		//STRING
		public RuleCall getPlanningSTRINGTerminalRuleCall_2_0() { return cPlanningSTRINGTerminalRuleCall_2_0; }
	}

	public class CronElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Cron");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cCronAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cCronKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cPlanningAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cPlanningSTRINGTerminalRuleCall_2_0 = (RuleCall)cPlanningAssignment_2.eContents().get(0);
		
		//Cron returns vpbuild::Cron:
		//	{vpbuild::Cron} "Cron" planning=STRING;
		@Override public ParserRule getRule() { return rule; }

		//{vpbuild::Cron} "Cron" planning=STRING
		public Group getGroup() { return cGroup; }

		//{vpbuild::Cron}
		public Action getCronAction_0() { return cCronAction_0; }

		//"Cron"
		public Keyword getCronKeyword_1() { return cCronKeyword_1; }

		//planning=STRING
		public Assignment getPlanningAssignment_2() { return cPlanningAssignment_2; }

		//STRING
		public RuleCall getPlanningSTRINGTerminalRuleCall_2_0() { return cPlanningSTRINGTerminalRuleCall_2_0; }
	}

	public class UserElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "User");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cUserAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cLoginKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cLoginAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cLoginSTRINGTerminalRuleCall_2_0 = (RuleCall)cLoginAssignment_2.eContents().get(0);
		private final Group cGroup_3 = (Group)cGroup.eContents().get(3);
		private final Keyword cPermissionKeyword_3_0 = (Keyword)cGroup_3.eContents().get(0);
		private final Assignment cPermissionAssignment_3_1 = (Assignment)cGroup_3.eContents().get(1);
		private final RuleCall cPermissionUserPermissionEnumRuleCall_3_1_0 = (RuleCall)cPermissionAssignment_3_1.eContents().get(0);
		
		//User returns vpbuild::User:
		//	{vpbuild::User} "login:" login=STRING ("permission:" permission=UserPermission)?;
		@Override public ParserRule getRule() { return rule; }

		//{vpbuild::User} "login:" login=STRING ("permission:" permission=UserPermission)?
		public Group getGroup() { return cGroup; }

		//{vpbuild::User}
		public Action getUserAction_0() { return cUserAction_0; }

		//"login:"
		public Keyword getLoginKeyword_1() { return cLoginKeyword_1; }

		//login=STRING
		public Assignment getLoginAssignment_2() { return cLoginAssignment_2; }

		//STRING
		public RuleCall getLoginSTRINGTerminalRuleCall_2_0() { return cLoginSTRINGTerminalRuleCall_2_0; }

		//("permission:" permission=UserPermission)?
		public Group getGroup_3() { return cGroup_3; }

		//"permission:"
		public Keyword getPermissionKeyword_3_0() { return cPermissionKeyword_3_0; }

		//permission=UserPermission
		public Assignment getPermissionAssignment_3_1() { return cPermissionAssignment_3_1; }

		//UserPermission
		public RuleCall getPermissionUserPermissionEnumRuleCall_3_1_0() { return cPermissionUserPermissionEnumRuleCall_3_1_0; }
	}

	public class FeatureElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Feature");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cFeatureAction_0 = (Action)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameFQNParserRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		
		//Feature returns vpbuild::Feature:
		//	{vpbuild::Feature} name=FQN;
		@Override public ParserRule getRule() { return rule; }

		//{vpbuild::Feature} name=FQN
		public Group getGroup() { return cGroup; }

		//{vpbuild::Feature}
		public Action getFeatureAction_0() { return cFeatureAction_0; }

		//name=FQN
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }

		//FQN
		public RuleCall getNameFQNParserRuleCall_1_0() { return cNameFQNParserRuleCall_1_0; }
	}
	
	
	public class ProtocolTypeElements extends AbstractEnumRuleElementFinder {
		private final EnumRule rule = (EnumRule) GrammarUtil.findRuleForName(getGrammar(), "ProtocolType");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final EnumLiteralDeclaration cGitEnumLiteralDeclaration_0 = (EnumLiteralDeclaration)cAlternatives.eContents().get(0);
		private final Keyword cGitGitKeyword_0_0 = (Keyword)cGitEnumLiteralDeclaration_0.eContents().get(0);
		private final EnumLiteralDeclaration cSvnEnumLiteralDeclaration_1 = (EnumLiteralDeclaration)cAlternatives.eContents().get(1);
		private final Keyword cSvnSvnKeyword_1_0 = (Keyword)cSvnEnumLiteralDeclaration_1.eContents().get(0);
		private final EnumLiteralDeclaration cSvnsshEnumLiteralDeclaration_2 = (EnumLiteralDeclaration)cAlternatives.eContents().get(2);
		private final Keyword cSvnsshSvnSshKeyword_2_0 = (Keyword)cSvnsshEnumLiteralDeclaration_2.eContents().get(0);
		
		//enum ProtocolType returns vpbuild::ProtocolType:
		//	git | svn="svn://" | svnssh="svn+ssh://";
		public EnumRule getRule() { return rule; }

		//git | svn="svn://" | svnssh="svn+ssh://"
		public Alternatives getAlternatives() { return cAlternatives; }

		//git
		public EnumLiteralDeclaration getGitEnumLiteralDeclaration_0() { return cGitEnumLiteralDeclaration_0; }

		//"git"
		public Keyword getGitGitKeyword_0_0() { return cGitGitKeyword_0_0; }

		//svn="svn://"
		public EnumLiteralDeclaration getSvnEnumLiteralDeclaration_1() { return cSvnEnumLiteralDeclaration_1; }

		//"svn://"
		public Keyword getSvnSvnKeyword_1_0() { return cSvnSvnKeyword_1_0; }

		//svnssh="svn+ssh://"
		public EnumLiteralDeclaration getSvnsshEnumLiteralDeclaration_2() { return cSvnsshEnumLiteralDeclaration_2; }

		//"svn+ssh://"
		public Keyword getSvnsshSvnSshKeyword_2_0() { return cSvnsshSvnSshKeyword_2_0; }
	}

	public class UserPermissionElements extends AbstractEnumRuleElementFinder {
		private final EnumRule rule = (EnumRule) GrammarUtil.findRuleForName(getGrammar(), "UserPermission");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final EnumLiteralDeclaration cWRITEEnumLiteralDeclaration_0 = (EnumLiteralDeclaration)cAlternatives.eContents().get(0);
		private final Keyword cWRITEWRITEKeyword_0_0 = (Keyword)cWRITEEnumLiteralDeclaration_0.eContents().get(0);
		private final EnumLiteralDeclaration cEXECUTEEnumLiteralDeclaration_1 = (EnumLiteralDeclaration)cAlternatives.eContents().get(1);
		private final Keyword cEXECUTEEXECUTEKeyword_1_0 = (Keyword)cEXECUTEEnumLiteralDeclaration_1.eContents().get(0);
		private final EnumLiteralDeclaration cREADEnumLiteralDeclaration_2 = (EnumLiteralDeclaration)cAlternatives.eContents().get(2);
		private final Keyword cREADREADKeyword_2_0 = (Keyword)cREADEnumLiteralDeclaration_2.eContents().get(0);
		
		//enum UserPermission returns vpbuild::UserPermission:
		//	WRITE | EXECUTE | READ;
		public EnumRule getRule() { return rule; }

		//WRITE | EXECUTE | READ
		public Alternatives getAlternatives() { return cAlternatives; }

		//WRITE
		public EnumLiteralDeclaration getWRITEEnumLiteralDeclaration_0() { return cWRITEEnumLiteralDeclaration_0; }

		//"WRITE"
		public Keyword getWRITEWRITEKeyword_0_0() { return cWRITEWRITEKeyword_0_0; }

		//EXECUTE
		public EnumLiteralDeclaration getEXECUTEEnumLiteralDeclaration_1() { return cEXECUTEEnumLiteralDeclaration_1; }

		//"EXECUTE"
		public Keyword getEXECUTEEXECUTEKeyword_1_0() { return cEXECUTEEXECUTEKeyword_1_0; }

		//READ
		public EnumLiteralDeclaration getREADEnumLiteralDeclaration_2() { return cREADEnumLiteralDeclaration_2; }

		//"READ"
		public Keyword getREADREADKeyword_2_0() { return cREADREADKeyword_2_0; }
	}
	
	private final BuildElements pBuild;
	private final RepositoryElements pRepository;
	private final SourceFoulderElements pSourceFoulder;
	private final HudsonDeploymentElements pHudsonDeployment;
	private final GenerationLocationElements pGenerationLocation;
	private final TriggerElements pTrigger;
	private final SCMElements pSCM;
	private final CronElements pCron;
	private final UserElements pUser;
	private final ProtocolTypeElements unknownRuleProtocolType;
	private final UserPermissionElements unknownRuleUserPermission;
	private final FeatureElements pFeature;
	
	private final Grammar grammar;

	private final CommonGrammarAccess gaCommon;

	@Inject
	public VpbuildGrammarAccess(GrammarProvider grammarProvider,
		CommonGrammarAccess gaCommon) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaCommon = gaCommon;
		this.pBuild = new BuildElements();
		this.pRepository = new RepositoryElements();
		this.pSourceFoulder = new SourceFoulderElements();
		this.pHudsonDeployment = new HudsonDeploymentElements();
		this.pGenerationLocation = new GenerationLocationElements();
		this.pTrigger = new TriggerElements();
		this.pSCM = new SCMElements();
		this.pCron = new CronElements();
		this.pUser = new UserElements();
		this.unknownRuleProtocolType = new ProtocolTypeElements();
		this.unknownRuleUserPermission = new UserPermissionElements();
		this.pFeature = new FeatureElements();
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.Vpbuild".equals(grammar.getName())) {
				return grammar;
			}
			List<Grammar> grammars = grammar.getUsedGrammars();
			if (!grammars.isEmpty()) {
				grammar = grammars.iterator().next();
			} else {
				return null;
			}
		}
		return grammar;
	}
	
	@Override
	public Grammar getGrammar() {
		return grammar;
	}
	

	public CommonGrammarAccess getCommonGrammarAccess() {
		return gaCommon;
	}

	
	/// ********************************************************************
	// * 							Build
	// * 
	// ******************************************************************** / / **
	// * 
	// * @author Amine Lajmi
	// *
	// * / Build returns vpdesc::Aspect:
	//	{vpbuild::Build} "Build" name=FQN "{" "target-platform:" target_platform=STRING mapped_repositories+=Repository*
	//	hudsonDeployment=HudsonDeployment? "}";
	public BuildElements getBuildAccess() {
		return pBuild;
	}
	
	public ParserRule getBuildRule() {
		return getBuildAccess().getRule();
	}

	//Repository returns vpbuild::Repository:
	//	{vpbuild::Repository} "repository:" protocol=ProtocolType location=STRING ("{" folders+=SourceFoulder* "}")?
	//	("features:" features+=Feature*);
	public RepositoryElements getRepositoryAccess() {
		return pRepository;
	}
	
	public ParserRule getRepositoryRule() {
		return getRepositoryAccess().getRule();
	}

	//SourceFoulder returns vpbuild::SourceFolder:
	//	{vpbuild::SourceFolder} "folder" name=STRING;
	public SourceFoulderElements getSourceFoulderAccess() {
		return pSourceFoulder;
	}
	
	public ParserRule getSourceFoulderRule() {
		return getSourceFoulderAccess().getRule();
	}

	//HudsonDeployment returns vpbuild::HudsonDeployment:
	//	{vpbuild::HudsonDeployment} "hudson-deployment" "{" ("ant:" antName=STRING)? ("assigned-node:" assignedNode=STRING)?
	//	("build-id:" build_id=STRING)? ("enable:" enabled=EBoolean)? ("jdk-name:" jdkName=STRING)? ("user-deploy-job-name:"
	//	userDeployJobName=STRING)? ("user-deploy-server-url:" userDeployServerUrl=STRING)? ("users" "{" users+=User* "}")?
	//	("triggers" "{" triggers+=Trigger* "}")? generationLocation=GenerationLocation? "}";
	public HudsonDeploymentElements getHudsonDeploymentAccess() {
		return pHudsonDeployment;
	}
	
	public ParserRule getHudsonDeploymentRule() {
		return getHudsonDeploymentAccess().getRule();
	}

	//GenerationLocation returns vpbuild::GenerationLocation:
	//	{vpbuild::GenerationLocation} "generation-location:" folder=STRING ("url:" url=STRING)?;
	public GenerationLocationElements getGenerationLocationAccess() {
		return pGenerationLocation;
	}
	
	public ParserRule getGenerationLocationRule() {
		return getGenerationLocationAccess().getRule();
	}

	//Trigger returns vpbuild::Trigger:
	//	SCM | Cron;
	public TriggerElements getTriggerAccess() {
		return pTrigger;
	}
	
	public ParserRule getTriggerRule() {
		return getTriggerAccess().getRule();
	}

	//SCM returns vpbuild::SCM:
	//	{vpbuild::SCM} "SCM" planning=STRING;
	public SCMElements getSCMAccess() {
		return pSCM;
	}
	
	public ParserRule getSCMRule() {
		return getSCMAccess().getRule();
	}

	//Cron returns vpbuild::Cron:
	//	{vpbuild::Cron} "Cron" planning=STRING;
	public CronElements getCronAccess() {
		return pCron;
	}
	
	public ParserRule getCronRule() {
		return getCronAccess().getRule();
	}

	//User returns vpbuild::User:
	//	{vpbuild::User} "login:" login=STRING ("permission:" permission=UserPermission)?;
	public UserElements getUserAccess() {
		return pUser;
	}
	
	public ParserRule getUserRule() {
		return getUserAccess().getRule();
	}

	//enum ProtocolType returns vpbuild::ProtocolType:
	//	git | svn="svn://" | svnssh="svn+ssh://";
	public ProtocolTypeElements getProtocolTypeAccess() {
		return unknownRuleProtocolType;
	}
	
	public EnumRule getProtocolTypeRule() {
		return getProtocolTypeAccess().getRule();
	}

	//enum UserPermission returns vpbuild::UserPermission:
	//	WRITE | EXECUTE | READ;
	public UserPermissionElements getUserPermissionAccess() {
		return unknownRuleUserPermission;
	}
	
	public EnumRule getUserPermissionRule() {
		return getUserPermissionAccess().getRule();
	}

	//Feature returns vpbuild::Feature:
	//	{vpbuild::Feature} name=FQN;
	public FeatureElements getFeatureAccess() {
		return pFeature;
	}
	
	public ParserRule getFeatureRule() {
		return getFeatureAccess().getRule();
	}

	//EString returns ecore::EString:
	//	STRING | ID;
	public CommonGrammarAccess.EStringElements getEStringAccess() {
		return gaCommon.getEStringAccess();
	}
	
	public ParserRule getEStringRule() {
		return getEStringAccess().getRule();
	}

	//FQN returns ecore::EString:
	//	ID ("." => ID)*;
	public CommonGrammarAccess.FQNElements getFQNAccess() {
		return gaCommon.getFQNAccess();
	}
	
	public ParserRule getFQNRule() {
		return getFQNAccess().getRule();
	}

	//EBoolean returns ecore::EBoolean:
	//	"true" | "false";
	public CommonGrammarAccess.EBooleanElements getEBooleanAccess() {
		return gaCommon.getEBooleanAccess();
	}
	
	public ParserRule getEBooleanRule() {
		return getEBooleanAccess().getRule();
	}

	//EInt returns ecore::EInt:
	//	INT;
	public CommonGrammarAccess.EIntElements getEIntAccess() {
		return gaCommon.getEIntAccess();
	}
	
	public ParserRule getEIntRule() {
		return getEIntAccess().getRule();
	}

	//terminal ID:
	//	"^"? ("a".."z" | "A".."Z" | "_") ("a".."z" | "A".."Z" | "_" | "0".."9")*;
	public TerminalRule getIDRule() {
		return gaCommon.getIDRule();
	} 

	//terminal INT returns ecore::EInt:
	//	"0".."9"+;
	public TerminalRule getINTRule() {
		return gaCommon.getINTRule();
	} 

	//terminal STRING:
	//	"\"" ("\\" . / * 'b'|'t'|'n'|'f'|'r'|'u'|'"'|"'"|'\\' * / | !("\\" | "\""))* "\"" | "\'" ("\\" .
	//	/ * 'b'|'t'|'n'|'f'|'r'|'u'|'"'|"'"|'\\' * / | !("\\" | "\'"))* "\'";
	public TerminalRule getSTRINGRule() {
		return gaCommon.getSTRINGRule();
	} 

	//terminal ML_COMMENT:
	//	"/ *"->"* /";
	public TerminalRule getML_COMMENTRule() {
		return gaCommon.getML_COMMENTRule();
	} 

	//terminal SL_COMMENT:
	//	"//" !("\n" | "\r")* ("\r"? "\n")?;
	public TerminalRule getSL_COMMENTRule() {
		return gaCommon.getSL_COMMENTRule();
	} 

	//terminal WS:
	//	(" " | "\t" | "\r" | "\n")+;
	public TerminalRule getWSRule() {
		return gaCommon.getWSRule();
	} 

	//terminal ANY_OTHER:
	//	.;
	public TerminalRule getANY_OTHERRule() {
		return gaCommon.getANY_OTHERRule();
	} 
}

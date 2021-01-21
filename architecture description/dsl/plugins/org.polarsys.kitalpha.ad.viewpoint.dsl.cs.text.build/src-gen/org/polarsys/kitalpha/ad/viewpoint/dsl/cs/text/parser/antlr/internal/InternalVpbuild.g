/*******************************************************************************
 * Copyright (c) 2015, 2020 Thales Global Services S.A.S.
 *  This program and the accompanying materials are made available under the
 *  terms of the Eclipse Public License 2.0 which is available at
 *  http://www.eclipse.org/legal/epl-2.0
 *  
 *  SPDX-License-Identifier: EPL-2.0
 * 
 * Contributors:
 *  Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/
grammar InternalVpbuild;

options {
	superClass=AbstractInternalAntlrParser;
	
}

@lexer::header {
package org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
package org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.VpbuildGrammarAccess;

}

@parser::members {

 	private VpbuildGrammarAccess grammarAccess;
 	
    public InternalVpbuildParser(TokenStream input, VpbuildGrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }
    
    @Override
    protected String getFirstRuleName() {
    	return "Build";	
   	}
   	
   	@Override
   	protected VpbuildGrammarAccess getGrammarAccess() {
   		return grammarAccess;
   	}
}

@rulecatch { 
    catch (RecognitionException re) { 
        recover(input,re); 
        appendSkippedTokens();
    } 
}




// Entry rule entryRuleBuild
entryRuleBuild returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getBuildRule()); }
	 iv_ruleBuild=ruleBuild 
	 { $current=$iv_ruleBuild.current; } 
	 EOF 
;

// Rule Build
ruleBuild returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
    {
        $current = forceCreateModelElement(
            grammarAccess.getBuildAccess().getBuildAction_0(),
            $current);
    }
)	otherlv_1='Build' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getBuildAccess().getBuildKeyword_1());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getBuildAccess().getNameFQNParserRuleCall_2_0()); 
	    }
		lv_name_2_0=ruleFQN		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getBuildRule());
	        }
       		set(
       			$current, 
       			"name",
        		lv_name_2_0, 
        		"FQN");
	        afterParserOrEnumRuleCall();
	    }

)
)	otherlv_3='{' 
    {
    	newLeafNode(otherlv_3, grammarAccess.getBuildAccess().getLeftCurlyBracketKeyword_3());
    }
	otherlv_4='target-platform:' 
    {
    	newLeafNode(otherlv_4, grammarAccess.getBuildAccess().getTargetPlatformKeyword_4());
    }
(
(
		lv_target_platform_5_0=RULE_STRING
		{
			newLeafNode(lv_target_platform_5_0, grammarAccess.getBuildAccess().getTarget_platformSTRINGTerminalRuleCall_5_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getBuildRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"target_platform",
        		lv_target_platform_5_0, 
        		"STRING");
	    }

)
)(
(
		{ 
	        newCompositeNode(grammarAccess.getBuildAccess().getMapped_repositoriesRepositoryParserRuleCall_6_0()); 
	    }
		lv_mapped_repositories_6_0=ruleRepository		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getBuildRule());
	        }
       		add(
       			$current, 
       			"mapped_repositories",
        		lv_mapped_repositories_6_0, 
        		"Repository");
	        afterParserOrEnumRuleCall();
	    }

)
)*(
(
		{ 
	        newCompositeNode(grammarAccess.getBuildAccess().getHudsonDeploymentHudsonDeploymentParserRuleCall_7_0()); 
	    }
		lv_hudsonDeployment_7_0=ruleHudsonDeployment		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getBuildRule());
	        }
       		set(
       			$current, 
       			"hudsonDeployment",
        		lv_hudsonDeployment_7_0, 
        		"HudsonDeployment");
	        afterParserOrEnumRuleCall();
	    }

)
)?	otherlv_8='}' 
    {
    	newLeafNode(otherlv_8, grammarAccess.getBuildAccess().getRightCurlyBracketKeyword_8());
    }
)
;





// Entry rule entryRuleRepository
entryRuleRepository returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getRepositoryRule()); }
	 iv_ruleRepository=ruleRepository 
	 { $current=$iv_ruleRepository.current; } 
	 EOF 
;

// Rule Repository
ruleRepository returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
    {
        $current = forceCreateModelElement(
            grammarAccess.getRepositoryAccess().getRepositoryAction_0(),
            $current);
    }
)	otherlv_1='repository:' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getRepositoryAccess().getRepositoryKeyword_1());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getRepositoryAccess().getProtocolProtocolTypeEnumRuleCall_2_0()); 
	    }
		lv_protocol_2_0=ruleProtocolType		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getRepositoryRule());
	        }
       		set(
       			$current, 
       			"protocol",
        		lv_protocol_2_0, 
        		"ProtocolType");
	        afterParserOrEnumRuleCall();
	    }

)
)(
(
		lv_location_3_0=RULE_STRING
		{
			newLeafNode(lv_location_3_0, grammarAccess.getRepositoryAccess().getLocationSTRINGTerminalRuleCall_3_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getRepositoryRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"location",
        		lv_location_3_0, 
        		"STRING");
	    }

)
)(	otherlv_4='{' 
    {
    	newLeafNode(otherlv_4, grammarAccess.getRepositoryAccess().getLeftCurlyBracketKeyword_4_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getRepositoryAccess().getFoldersSourceFoulderParserRuleCall_4_1_0()); 
	    }
		lv_folders_5_0=ruleSourceFoulder		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getRepositoryRule());
	        }
       		add(
       			$current, 
       			"folders",
        		lv_folders_5_0, 
        		"SourceFoulder");
	        afterParserOrEnumRuleCall();
	    }

)
)*	otherlv_6='}' 
    {
    	newLeafNode(otherlv_6, grammarAccess.getRepositoryAccess().getRightCurlyBracketKeyword_4_2());
    }
)?(	otherlv_7='features:' 
    {
    	newLeafNode(otherlv_7, grammarAccess.getRepositoryAccess().getFeaturesKeyword_5_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getRepositoryAccess().getFeaturesFeatureParserRuleCall_5_1_0()); 
	    }
		lv_features_8_0=ruleFeature		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getRepositoryRule());
	        }
       		add(
       			$current, 
       			"features",
        		lv_features_8_0, 
        		"Feature");
	        afterParserOrEnumRuleCall();
	    }

)
)*))
;





// Entry rule entryRuleSourceFoulder
entryRuleSourceFoulder returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getSourceFoulderRule()); }
	 iv_ruleSourceFoulder=ruleSourceFoulder 
	 { $current=$iv_ruleSourceFoulder.current; } 
	 EOF 
;

// Rule SourceFoulder
ruleSourceFoulder returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
    {
        $current = forceCreateModelElement(
            grammarAccess.getSourceFoulderAccess().getSourceFolderAction_0(),
            $current);
    }
)	otherlv_1='folder' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getSourceFoulderAccess().getFolderKeyword_1());
    }
(
(
		lv_name_2_0=RULE_STRING
		{
			newLeafNode(lv_name_2_0, grammarAccess.getSourceFoulderAccess().getNameSTRINGTerminalRuleCall_2_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getSourceFoulderRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"name",
        		lv_name_2_0, 
        		"STRING");
	    }

)
))
;





// Entry rule entryRuleHudsonDeployment
entryRuleHudsonDeployment returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getHudsonDeploymentRule()); }
	 iv_ruleHudsonDeployment=ruleHudsonDeployment 
	 { $current=$iv_ruleHudsonDeployment.current; } 
	 EOF 
;

// Rule HudsonDeployment
ruleHudsonDeployment returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
    {
        $current = forceCreateModelElement(
            grammarAccess.getHudsonDeploymentAccess().getHudsonDeploymentAction_0(),
            $current);
    }
)	otherlv_1='hudson-deployment' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getHudsonDeploymentAccess().getHudsonDeploymentKeyword_1());
    }
	otherlv_2='{' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getHudsonDeploymentAccess().getLeftCurlyBracketKeyword_2());
    }
(	otherlv_3='ant:' 
    {
    	newLeafNode(otherlv_3, grammarAccess.getHudsonDeploymentAccess().getAntKeyword_3_0());
    }
(
(
		lv_antName_4_0=RULE_STRING
		{
			newLeafNode(lv_antName_4_0, grammarAccess.getHudsonDeploymentAccess().getAntNameSTRINGTerminalRuleCall_3_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getHudsonDeploymentRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"antName",
        		lv_antName_4_0, 
        		"STRING");
	    }

)
))?(	otherlv_5='assigned-node:' 
    {
    	newLeafNode(otherlv_5, grammarAccess.getHudsonDeploymentAccess().getAssignedNodeKeyword_4_0());
    }
(
(
		lv_assignedNode_6_0=RULE_STRING
		{
			newLeafNode(lv_assignedNode_6_0, grammarAccess.getHudsonDeploymentAccess().getAssignedNodeSTRINGTerminalRuleCall_4_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getHudsonDeploymentRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"assignedNode",
        		lv_assignedNode_6_0, 
        		"STRING");
	    }

)
))?(	otherlv_7='build-id:' 
    {
    	newLeafNode(otherlv_7, grammarAccess.getHudsonDeploymentAccess().getBuildIdKeyword_5_0());
    }
(
(
		lv_build_id_8_0=RULE_STRING
		{
			newLeafNode(lv_build_id_8_0, grammarAccess.getHudsonDeploymentAccess().getBuild_idSTRINGTerminalRuleCall_5_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getHudsonDeploymentRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"build_id",
        		lv_build_id_8_0, 
        		"STRING");
	    }

)
))?(	otherlv_9='enable:' 
    {
    	newLeafNode(otherlv_9, grammarAccess.getHudsonDeploymentAccess().getEnableKeyword_6_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getHudsonDeploymentAccess().getEnabledEBooleanParserRuleCall_6_1_0()); 
	    }
		lv_enabled_10_0=ruleEBoolean		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getHudsonDeploymentRule());
	        }
       		set(
       			$current, 
       			"enabled",
        		lv_enabled_10_0, 
        		"EBoolean");
	        afterParserOrEnumRuleCall();
	    }

)
))?(	otherlv_11='jdk-name:' 
    {
    	newLeafNode(otherlv_11, grammarAccess.getHudsonDeploymentAccess().getJdkNameKeyword_7_0());
    }
(
(
		lv_jdkName_12_0=RULE_STRING
		{
			newLeafNode(lv_jdkName_12_0, grammarAccess.getHudsonDeploymentAccess().getJdkNameSTRINGTerminalRuleCall_7_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getHudsonDeploymentRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"jdkName",
        		lv_jdkName_12_0, 
        		"STRING");
	    }

)
))?(	otherlv_13='user-deploy-job-name:' 
    {
    	newLeafNode(otherlv_13, grammarAccess.getHudsonDeploymentAccess().getUserDeployJobNameKeyword_8_0());
    }
(
(
		lv_userDeployJobName_14_0=RULE_STRING
		{
			newLeafNode(lv_userDeployJobName_14_0, grammarAccess.getHudsonDeploymentAccess().getUserDeployJobNameSTRINGTerminalRuleCall_8_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getHudsonDeploymentRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"userDeployJobName",
        		lv_userDeployJobName_14_0, 
        		"STRING");
	    }

)
))?(	otherlv_15='user-deploy-server-url:' 
    {
    	newLeafNode(otherlv_15, grammarAccess.getHudsonDeploymentAccess().getUserDeployServerUrlKeyword_9_0());
    }
(
(
		lv_userDeployServerUrl_16_0=RULE_STRING
		{
			newLeafNode(lv_userDeployServerUrl_16_0, grammarAccess.getHudsonDeploymentAccess().getUserDeployServerUrlSTRINGTerminalRuleCall_9_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getHudsonDeploymentRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"userDeployServerUrl",
        		lv_userDeployServerUrl_16_0, 
        		"STRING");
	    }

)
))?(	otherlv_17='users' 
    {
    	newLeafNode(otherlv_17, grammarAccess.getHudsonDeploymentAccess().getUsersKeyword_10_0());
    }
	otherlv_18='{' 
    {
    	newLeafNode(otherlv_18, grammarAccess.getHudsonDeploymentAccess().getLeftCurlyBracketKeyword_10_1());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getHudsonDeploymentAccess().getUsersUserParserRuleCall_10_2_0()); 
	    }
		lv_users_19_0=ruleUser		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getHudsonDeploymentRule());
	        }
       		add(
       			$current, 
       			"users",
        		lv_users_19_0, 
        		"User");
	        afterParserOrEnumRuleCall();
	    }

)
)*	otherlv_20='}' 
    {
    	newLeafNode(otherlv_20, grammarAccess.getHudsonDeploymentAccess().getRightCurlyBracketKeyword_10_3());
    }
)?(	otherlv_21='triggers' 
    {
    	newLeafNode(otherlv_21, grammarAccess.getHudsonDeploymentAccess().getTriggersKeyword_11_0());
    }
	otherlv_22='{' 
    {
    	newLeafNode(otherlv_22, grammarAccess.getHudsonDeploymentAccess().getLeftCurlyBracketKeyword_11_1());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getHudsonDeploymentAccess().getTriggersTriggerParserRuleCall_11_2_0()); 
	    }
		lv_triggers_23_0=ruleTrigger		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getHudsonDeploymentRule());
	        }
       		add(
       			$current, 
       			"triggers",
        		lv_triggers_23_0, 
        		"Trigger");
	        afterParserOrEnumRuleCall();
	    }

)
)*	otherlv_24='}' 
    {
    	newLeafNode(otherlv_24, grammarAccess.getHudsonDeploymentAccess().getRightCurlyBracketKeyword_11_3());
    }
)?(
(
		{ 
	        newCompositeNode(grammarAccess.getHudsonDeploymentAccess().getGenerationLocationGenerationLocationParserRuleCall_12_0()); 
	    }
		lv_generationLocation_25_0=ruleGenerationLocation		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getHudsonDeploymentRule());
	        }
       		set(
       			$current, 
       			"generationLocation",
        		lv_generationLocation_25_0, 
        		"GenerationLocation");
	        afterParserOrEnumRuleCall();
	    }

)
)?	otherlv_26='}' 
    {
    	newLeafNode(otherlv_26, grammarAccess.getHudsonDeploymentAccess().getRightCurlyBracketKeyword_13());
    }
)
;





// Entry rule entryRuleGenerationLocation
entryRuleGenerationLocation returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getGenerationLocationRule()); }
	 iv_ruleGenerationLocation=ruleGenerationLocation 
	 { $current=$iv_ruleGenerationLocation.current; } 
	 EOF 
;

// Rule GenerationLocation
ruleGenerationLocation returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
    {
        $current = forceCreateModelElement(
            grammarAccess.getGenerationLocationAccess().getGenerationLocationAction_0(),
            $current);
    }
)	otherlv_1='generation-location:' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getGenerationLocationAccess().getGenerationLocationKeyword_1());
    }
(
(
		lv_folder_2_0=RULE_STRING
		{
			newLeafNode(lv_folder_2_0, grammarAccess.getGenerationLocationAccess().getFolderSTRINGTerminalRuleCall_2_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getGenerationLocationRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"folder",
        		lv_folder_2_0, 
        		"STRING");
	    }

)
)(	otherlv_3='url:' 
    {
    	newLeafNode(otherlv_3, grammarAccess.getGenerationLocationAccess().getUrlKeyword_3_0());
    }
(
(
		lv_url_4_0=RULE_STRING
		{
			newLeafNode(lv_url_4_0, grammarAccess.getGenerationLocationAccess().getUrlSTRINGTerminalRuleCall_3_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getGenerationLocationRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"url",
        		lv_url_4_0, 
        		"STRING");
	    }

)
))?)
;





// Entry rule entryRuleTrigger
entryRuleTrigger returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getTriggerRule()); }
	 iv_ruleTrigger=ruleTrigger 
	 { $current=$iv_ruleTrigger.current; } 
	 EOF 
;

// Rule Trigger
ruleTrigger returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
    { 
        newCompositeNode(grammarAccess.getTriggerAccess().getSCMParserRuleCall_0()); 
    }
    this_SCM_0=ruleSCM
    { 
        $current = $this_SCM_0.current; 
        afterParserOrEnumRuleCall();
    }

    |
    { 
        newCompositeNode(grammarAccess.getTriggerAccess().getCronParserRuleCall_1()); 
    }
    this_Cron_1=ruleCron
    { 
        $current = $this_Cron_1.current; 
        afterParserOrEnumRuleCall();
    }
)
;





// Entry rule entryRuleSCM
entryRuleSCM returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getSCMRule()); }
	 iv_ruleSCM=ruleSCM 
	 { $current=$iv_ruleSCM.current; } 
	 EOF 
;

// Rule SCM
ruleSCM returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
    {
        $current = forceCreateModelElement(
            grammarAccess.getSCMAccess().getSCMAction_0(),
            $current);
    }
)	otherlv_1='SCM' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getSCMAccess().getSCMKeyword_1());
    }
(
(
		lv_planning_2_0=RULE_STRING
		{
			newLeafNode(lv_planning_2_0, grammarAccess.getSCMAccess().getPlanningSTRINGTerminalRuleCall_2_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getSCMRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"planning",
        		lv_planning_2_0, 
        		"STRING");
	    }

)
))
;





// Entry rule entryRuleCron
entryRuleCron returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getCronRule()); }
	 iv_ruleCron=ruleCron 
	 { $current=$iv_ruleCron.current; } 
	 EOF 
;

// Rule Cron
ruleCron returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
    {
        $current = forceCreateModelElement(
            grammarAccess.getCronAccess().getCronAction_0(),
            $current);
    }
)	otherlv_1='Cron' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getCronAccess().getCronKeyword_1());
    }
(
(
		lv_planning_2_0=RULE_STRING
		{
			newLeafNode(lv_planning_2_0, grammarAccess.getCronAccess().getPlanningSTRINGTerminalRuleCall_2_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getCronRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"planning",
        		lv_planning_2_0, 
        		"STRING");
	    }

)
))
;





// Entry rule entryRuleUser
entryRuleUser returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getUserRule()); }
	 iv_ruleUser=ruleUser 
	 { $current=$iv_ruleUser.current; } 
	 EOF 
;

// Rule User
ruleUser returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
    {
        $current = forceCreateModelElement(
            grammarAccess.getUserAccess().getUserAction_0(),
            $current);
    }
)	otherlv_1='login:' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getUserAccess().getLoginKeyword_1());
    }
(
(
		lv_login_2_0=RULE_STRING
		{
			newLeafNode(lv_login_2_0, grammarAccess.getUserAccess().getLoginSTRINGTerminalRuleCall_2_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getUserRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"login",
        		lv_login_2_0, 
        		"STRING");
	    }

)
)(	otherlv_3='permission:' 
    {
    	newLeafNode(otherlv_3, grammarAccess.getUserAccess().getPermissionKeyword_3_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getUserAccess().getPermissionUserPermissionEnumRuleCall_3_1_0()); 
	    }
		lv_permission_4_0=ruleUserPermission		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getUserRule());
	        }
       		set(
       			$current, 
       			"permission",
        		lv_permission_4_0, 
        		"UserPermission");
	        afterParserOrEnumRuleCall();
	    }

)
))?)
;





// Entry rule entryRuleFeature
entryRuleFeature returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getFeatureRule()); }
	 iv_ruleFeature=ruleFeature 
	 { $current=$iv_ruleFeature.current; } 
	 EOF 
;

// Rule Feature
ruleFeature returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
    {
        $current = forceCreateModelElement(
            grammarAccess.getFeatureAccess().getFeatureAction_0(),
            $current);
    }
)(
(
		{ 
	        newCompositeNode(grammarAccess.getFeatureAccess().getNameFQNParserRuleCall_1_0()); 
	    }
		lv_name_1_0=ruleFQN		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getFeatureRule());
	        }
       		set(
       			$current, 
       			"name",
        		lv_name_1_0, 
        		"FQN");
	        afterParserOrEnumRuleCall();
	    }

)
))
;







// Entry rule entryRuleFQN
entryRuleFQN returns [String current=null] 
	:
	{ newCompositeNode(grammarAccess.getFQNRule()); } 
	 iv_ruleFQN=ruleFQN 
	 { $current=$iv_ruleFQN.current.getText(); }  
	 EOF 
;

// Rule FQN
ruleFQN returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(    this_ID_0=RULE_ID    {
		$current.merge(this_ID_0);
    }

    { 
    newLeafNode(this_ID_0, grammarAccess.getFQNAccess().getIDTerminalRuleCall_0()); 
    }
(
	kw='.' 
    {
        $current.merge(kw);
        newLeafNode(kw, grammarAccess.getFQNAccess().getFullStopKeyword_1_0()); 
    }
(( RULE_ID)=>    this_ID_2=RULE_ID    {
		$current.merge(this_ID_2);
    }

    { 
    newLeafNode(this_ID_2, grammarAccess.getFQNAccess().getIDTerminalRuleCall_1_1()); 
    }
))*)
    ;





// Entry rule entryRuleEBoolean
entryRuleEBoolean returns [String current=null] 
	:
	{ newCompositeNode(grammarAccess.getEBooleanRule()); } 
	 iv_ruleEBoolean=ruleEBoolean 
	 { $current=$iv_ruleEBoolean.current.getText(); }  
	 EOF 
;

// Rule EBoolean
ruleEBoolean returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
	kw='true' 
    {
        $current.merge(kw);
        newLeafNode(kw, grammarAccess.getEBooleanAccess().getTrueKeyword_0()); 
    }

    |
	kw='false' 
    {
        $current.merge(kw);
        newLeafNode(kw, grammarAccess.getEBooleanAccess().getFalseKeyword_1()); 
    }
)
    ;







// Rule ProtocolType
ruleProtocolType returns [Enumerator current=null] 
    @init { enterRule(); }
    @after { leaveRule(); }:
((	enumLiteral_0='git' 
	{
        $current = grammarAccess.getProtocolTypeAccess().getGitEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
        newLeafNode(enumLiteral_0, grammarAccess.getProtocolTypeAccess().getGitEnumLiteralDeclaration_0()); 
    }
)
    |(	enumLiteral_1='svn://' 
	{
        $current = grammarAccess.getProtocolTypeAccess().getSvnEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
        newLeafNode(enumLiteral_1, grammarAccess.getProtocolTypeAccess().getSvnEnumLiteralDeclaration_1()); 
    }
)
    |(	enumLiteral_2='svn+ssh://' 
	{
        $current = grammarAccess.getProtocolTypeAccess().getSvnsshEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
        newLeafNode(enumLiteral_2, grammarAccess.getProtocolTypeAccess().getSvnsshEnumLiteralDeclaration_2()); 
    }
));



// Rule UserPermission
ruleUserPermission returns [Enumerator current=null] 
    @init { enterRule(); }
    @after { leaveRule(); }:
((	enumLiteral_0='WRITE' 
	{
        $current = grammarAccess.getUserPermissionAccess().getWRITEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
        newLeafNode(enumLiteral_0, grammarAccess.getUserPermissionAccess().getWRITEEnumLiteralDeclaration_0()); 
    }
)
    |(	enumLiteral_1='EXECUTE' 
	{
        $current = grammarAccess.getUserPermissionAccess().getEXECUTEEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
        newLeafNode(enumLiteral_1, grammarAccess.getUserPermissionAccess().getEXECUTEEnumLiteralDeclaration_1()); 
    }
)
    |(	enumLiteral_2='READ' 
	{
        $current = grammarAccess.getUserPermissionAccess().getREADEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
        newLeafNode(enumLiteral_2, grammarAccess.getUserPermissionAccess().getREADEnumLiteralDeclaration_2()); 
    }
));



RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;



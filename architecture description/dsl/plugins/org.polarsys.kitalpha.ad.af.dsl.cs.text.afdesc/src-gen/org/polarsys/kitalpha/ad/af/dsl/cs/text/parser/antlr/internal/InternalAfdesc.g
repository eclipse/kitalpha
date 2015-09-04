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
grammar InternalAfdesc;

options {
	superClass=AbstractInternalAntlrParser;
	
}

@lexer::header {
package org.polarsys.kitalpha.ad.af.dsl.cs.text.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
package org.polarsys.kitalpha.ad.af.dsl.cs.text.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.polarsys.kitalpha.ad.af.dsl.cs.text.services.AfdescGrammarAccess;

}

@parser::members {

 	private AfdescGrammarAccess grammarAccess;
 	
    public InternalAfdescParser(TokenStream input, AfdescGrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }
    
    @Override
    protected String getFirstRuleName() {
    	return "NamedElement";	
   	}
   	
   	@Override
   	protected AfdescGrammarAccess getGrammarAccess() {
   		return grammarAccess;
   	}
}

@rulecatch { 
    catch (RecognitionException re) { 
        recover(input,re); 
        appendSkippedTokens();
    } 
}




// Entry rule entryRuleNamedElement
entryRuleNamedElement returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getNamedElementRule()); }
	 iv_ruleNamedElement=ruleNamedElement 
	 { $current=$iv_ruleNamedElement.current; } 
	 EOF 
;

// Rule NamedElement
ruleNamedElement returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:

    { 
        newCompositeNode(grammarAccess.getNamedElementAccess().getArchitectureFrameworkParserRuleCall()); 
    }
    this_ArchitectureFramework_0=ruleArchitectureFramework
    { 
        $current = $this_ArchitectureFramework_0.current; 
        afterParserOrEnumRuleCall();
    }

;





// Entry rule entryRuleArchitectureFramework
entryRuleArchitectureFramework returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getArchitectureFrameworkRule()); }
	 iv_ruleArchitectureFramework=ruleArchitectureFramework 
	 { $current=$iv_ruleArchitectureFramework.current; } 
	 EOF 
;

// Rule ArchitectureFramework
ruleArchitectureFramework returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
    {
        $current = forceCreateModelElement(
            grammarAccess.getArchitectureFrameworkAccess().getArchitectureFrameworkAction_0(),
            $current);
    }
)	otherlv_1='ArchitectureFramework' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getArchitectureFrameworkAccess().getArchitectureFrameworkKeyword_1());
    }
(
(
		lv_name_2_0=RULE_ID
		{
			newLeafNode(lv_name_2_0, grammarAccess.getArchitectureFrameworkAccess().getNameIDTerminalRuleCall_2_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getArchitectureFrameworkRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"name",
        		lv_name_2_0, 
        		"ID");
	    }

)
)?	otherlv_3='{' 
    {
    	newLeafNode(otherlv_3, grammarAccess.getArchitectureFrameworkAccess().getLeftCurlyBracketKeyword_3());
    }
(	otherlv_4='description:' 
    {
    	newLeafNode(otherlv_4, grammarAccess.getArchitectureFrameworkAccess().getDescriptionKeyword_4_0());
    }
(
(
		lv_description_5_0=RULE_STRING
		{
			newLeafNode(lv_description_5_0, grammarAccess.getArchitectureFrameworkAccess().getDescriptionSTRINGTerminalRuleCall_4_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getArchitectureFrameworkRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"description",
        		lv_description_5_0, 
        		"STRING");
	    }

)
))?(	otherlv_6='shortName:' 
    {
    	newLeafNode(otherlv_6, grammarAccess.getArchitectureFrameworkAccess().getShortNameKeyword_5_0());
    }
(
(
		lv_shortName_7_0=RULE_STRING
		{
			newLeafNode(lv_shortName_7_0, grammarAccess.getArchitectureFrameworkAccess().getShortNameSTRINGTerminalRuleCall_5_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getArchitectureFrameworkRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"shortName",
        		lv_shortName_7_0, 
        		"STRING");
	    }

)
))?(
(
		{ 
	        newCompositeNode(grammarAccess.getArchitectureFrameworkAccess().getAf_viewpointsViewpointsParserRuleCall_6_0()); 
	    }
		lv_af_viewpoints_8_0=ruleViewpoints		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getArchitectureFrameworkRule());
	        }
       		set(
       			$current, 
       			"af_viewpoints",
        		lv_af_viewpoints_8_0, 
        		"Viewpoints");
	        afterParserOrEnumRuleCall();
	    }

)
)?(
(
		{ 
	        newCompositeNode(grammarAccess.getArchitectureFrameworkAccess().getOwned_configurationConfigurationParserRuleCall_7_0()); 
	    }
		lv_owned_configuration_9_0=ruleConfiguration		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getArchitectureFrameworkRule());
	        }
       		set(
       			$current, 
       			"owned_configuration",
        		lv_owned_configuration_9_0, 
        		"Configuration");
	        afterParserOrEnumRuleCall();
	    }

)
)	otherlv_10='}' 
    {
    	newLeafNode(otherlv_10, grammarAccess.getArchitectureFrameworkAccess().getRightCurlyBracketKeyword_8());
    }
)
;





// Entry rule entryRuleConfiguration
entryRuleConfiguration returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getConfigurationRule()); }
	 iv_ruleConfiguration=ruleConfiguration 
	 { $current=$iv_ruleConfiguration.current; } 
	 EOF 
;

// Rule Configuration
ruleConfiguration returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
    {
        $current = forceCreateModelElement(
            grammarAccess.getConfigurationAccess().getConfigurationAction_0(),
            $current);
    }
)	otherlv_1='Configuration' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getConfigurationAccess().getConfigurationKeyword_1());
    }
	otherlv_2='{' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getConfigurationAccess().getLeftCurlyBracketKeyword_2());
    }
((
(
		{ 
	        newCompositeNode(grammarAccess.getConfigurationAccess().getOwned_elementConfigurationElementParserRuleCall_3_0_0()); 
	    }
		lv_owned_element_3_0=ruleConfigurationElement		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getConfigurationRule());
	        }
       		add(
       			$current, 
       			"owned_element",
        		lv_owned_element_3_0, 
        		"ConfigurationElement");
	        afterParserOrEnumRuleCall();
	    }

)
)(	otherlv_4=',' 
    {
    	newLeafNode(otherlv_4, grammarAccess.getConfigurationAccess().getCommaKeyword_3_1_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getConfigurationAccess().getOwned_elementConfigurationElementParserRuleCall_3_1_1_0()); 
	    }
		lv_owned_element_5_0=ruleConfigurationElement		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getConfigurationRule());
	        }
       		add(
       			$current, 
       			"owned_element",
        		lv_owned_element_5_0, 
        		"ConfigurationElement");
	        afterParserOrEnumRuleCall();
	    }

)
))*)?	otherlv_6='}' 
    {
    	newLeafNode(otherlv_6, grammarAccess.getConfigurationAccess().getRightCurlyBracketKeyword_4());
    }
)
;





// Entry rule entryRuleConfigurationElement
entryRuleConfigurationElement returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getConfigurationElementRule()); }
	 iv_ruleConfigurationElement=ruleConfigurationElement 
	 { $current=$iv_ruleConfigurationElement.current; } 
	 EOF 
;

// Rule ConfigurationElement
ruleConfigurationElement returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:

    { 
        newCompositeNode(grammarAccess.getConfigurationElementAccess().getGenerationConfigurationParserRuleCall()); 
    }
    this_GenerationConfiguration_0=ruleGenerationConfiguration
    { 
        $current = $this_GenerationConfiguration_0.current; 
        afterParserOrEnumRuleCall();
    }

;





// Entry rule entryRuleGenerationConfiguration
entryRuleGenerationConfiguration returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getGenerationConfigurationRule()); }
	 iv_ruleGenerationConfiguration=ruleGenerationConfiguration 
	 { $current=$iv_ruleGenerationConfiguration.current; } 
	 EOF 
;

// Rule GenerationConfiguration
ruleGenerationConfiguration returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
    {
        $current = forceCreateModelElement(
            grammarAccess.getGenerationConfigurationAccess().getGenerationConfigurationAction_0(),
            $current);
    }
)(	otherlv_1='rootProjectName:' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getGenerationConfigurationAccess().getRootProjectNameKeyword_1_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getGenerationConfigurationAccess().getRootProjectNameFQNParserRuleCall_1_1_0()); 
	    }
		lv_rootProjectName_2_0=ruleFQN		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getGenerationConfigurationRule());
	        }
       		set(
       			$current, 
       			"rootProjectName",
        		lv_rootProjectName_2_0, 
        		"FQN");
	        afterParserOrEnumRuleCall();
	    }

)
)))
;





// Entry rule entryRuleViewpoints
entryRuleViewpoints returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getViewpointsRule()); }
	 iv_ruleViewpoints=ruleViewpoints 
	 { $current=$iv_ruleViewpoints.current; } 
	 EOF 
;

// Rule Viewpoints
ruleViewpoints returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
    {
        $current = forceCreateModelElement(
            grammarAccess.getViewpointsAccess().getViewpointsAction_0(),
            $current);
    }
)	otherlv_1='Viewpoints' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getViewpointsAccess().getViewpointsKeyword_1());
    }
	otherlv_2='{' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getViewpointsAccess().getLeftCurlyBracketKeyword_2());
    }
((
(
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getViewpointsRule());
	        }
        }
	otherlv_3=RULE_ID
	{
		newLeafNode(otherlv_3, grammarAccess.getViewpointsAccess().getOwned_viewpointsViewpointCrossReference_3_0_0()); 
	}

)
)(	otherlv_4=',' 
    {
    	newLeafNode(otherlv_4, grammarAccess.getViewpointsAccess().getCommaKeyword_3_1_0());
    }
(
(
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getViewpointsRule());
	        }
        }
	otherlv_5=RULE_ID
	{
		newLeafNode(otherlv_5, grammarAccess.getViewpointsAccess().getOwned_viewpointsViewpointCrossReference_3_1_1_0()); 
	}

)
))*)?	otherlv_6='}' 
    {
    	newLeafNode(otherlv_6, grammarAccess.getViewpointsAccess().getRightCurlyBracketKeyword_4());
    }
)
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





RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;



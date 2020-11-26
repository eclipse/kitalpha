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
grammar InternalVpservices;

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
import org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.VpservicesGrammarAccess;

}

@parser::members {

 	private VpservicesGrammarAccess grammarAccess;
 	
    public InternalVpservicesParser(TokenStream input, VpservicesGrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }
    
    @Override
    protected String getFirstRuleName() {
    	return "Services";	
   	}
   	
   	@Override
   	protected VpservicesGrammarAccess getGrammarAccess() {
   		return grammarAccess;
   	}
}

@rulecatch { 
    catch (RecognitionException re) { 
        recover(input,re); 
        appendSkippedTokens();
    } 
}




// Entry rule entryRuleServices
entryRuleServices returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getServicesRule()); }
	 iv_ruleServices=ruleServices 
	 { $current=$iv_ruleServices.current; } 
	 EOF 
;

// Rule Services
ruleServices returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
    {
        $current = forceCreateModelElement(
            grammarAccess.getServicesAccess().getServicesAction_0(),
            $current);
    }
)(
(
		{ 
	        newCompositeNode(grammarAccess.getServicesAccess().getServicesAspectParserRuleCall_1_0()); 
	    }
		lv_services_1_0=ruleAspect		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getServicesRule());
	        }
       		add(
       			$current, 
       			"services",
        		lv_services_1_0, 
        		"Aspect");
	        afterParserOrEnumRuleCall();
	    }

)
)+)
;





// Entry rule entryRuleAspect
entryRuleAspect returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getAspectRule()); }
	 iv_ruleAspect=ruleAspect 
	 { $current=$iv_ruleAspect.current; } 
	 EOF 
;

// Rule Aspect
ruleAspect returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
    { 
        newCompositeNode(grammarAccess.getAspectAccess().getServiceSetParserRuleCall_0()); 
    }
    this_ServiceSet_0=ruleServiceSet
    { 
        $current = $this_ServiceSet_0.current; 
        afterParserOrEnumRuleCall();
    }

    |
    { 
        newCompositeNode(grammarAccess.getAspectAccess().getRuleSetParserRuleCall_1()); 
    }
    this_RuleSet_1=ruleRuleSet
    { 
        $current = $this_RuleSet_1.current; 
        afterParserOrEnumRuleCall();
    }

    |
    { 
        newCompositeNode(grammarAccess.getAspectAccess().getPropertySetParserRuleCall_2()); 
    }
    this_PropertySet_2=rulePropertySet
    { 
        $current = $this_PropertySet_2.current; 
        afterParserOrEnumRuleCall();
    }
)
;





// Entry rule entryRuleServiceSet
entryRuleServiceSet returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getServiceSetRule()); }
	 iv_ruleServiceSet=ruleServiceSet 
	 { $current=$iv_ruleServiceSet.current; } 
	 EOF 
;

// Rule ServiceSet
ruleServiceSet returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
    {
        $current = forceCreateModelElement(
            grammarAccess.getServiceSetAccess().getServiceSetAction_0(),
            $current);
    }
)	otherlv_1='Services' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getServiceSetAccess().getServicesKeyword_1());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getServiceSetAccess().getNameFQNParserRuleCall_2_0()); 
	    }
		lv_name_2_0=ruleFQN		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getServiceSetRule());
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
    	newLeafNode(otherlv_3, grammarAccess.getServiceSetAccess().getLeftCurlyBracketKeyword_3());
    }
(	otherlv_4='description:' 
    {
    	newLeafNode(otherlv_4, grammarAccess.getServiceSetAccess().getDescriptionKeyword_4_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getServiceSetAccess().getDescriptionEStringParserRuleCall_4_1_0()); 
	    }
		lv_description_5_0=ruleEString		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getServiceSetRule());
	        }
       		set(
       			$current, 
       			"description",
        		lv_description_5_0, 
        		"EString");
	        afterParserOrEnumRuleCall();
	    }

)
))?((
(
		{ 
	        newCompositeNode(grammarAccess.getServiceSetAccess().getVpServicesServiceParserRuleCall_5_0_0()); 
	    }
		lv_vpServices_6_0=ruleService		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getServiceSetRule());
	        }
       		add(
       			$current, 
       			"vpServices",
        		lv_vpServices_6_0, 
        		"Service");
	        afterParserOrEnumRuleCall();
	    }

)
)(
(
		{ 
	        newCompositeNode(grammarAccess.getServiceSetAccess().getVpServicesServiceParserRuleCall_5_1_0()); 
	    }
		lv_vpServices_7_0=ruleService		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getServiceSetRule());
	        }
       		add(
       			$current, 
       			"vpServices",
        		lv_vpServices_7_0, 
        		"Service");
	        afterParserOrEnumRuleCall();
	    }

)
)*)?	otherlv_8='}' 
    {
    	newLeafNode(otherlv_8, grammarAccess.getServiceSetAccess().getRightCurlyBracketKeyword_6());
    }
)
;





// Entry rule entryRuleRuleSet
entryRuleRuleSet returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getRuleSetRule()); }
	 iv_ruleRuleSet=ruleRuleSet 
	 { $current=$iv_ruleRuleSet.current; } 
	 EOF 
;

// Rule RuleSet
ruleRuleSet returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
    {
        $current = forceCreateModelElement(
            grammarAccess.getRuleSetAccess().getRuleSetAction_0(),
            $current);
    }
)	otherlv_1='Rules' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getRuleSetAccess().getRulesKeyword_1());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getRuleSetAccess().getNameFQNParserRuleCall_2_0()); 
	    }
		lv_name_2_0=ruleFQN		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getRuleSetRule());
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
    	newLeafNode(otherlv_3, grammarAccess.getRuleSetAccess().getLeftCurlyBracketKeyword_3());
    }
(	otherlv_4='description:' 
    {
    	newLeafNode(otherlv_4, grammarAccess.getRuleSetAccess().getDescriptionKeyword_4_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getRuleSetAccess().getDescriptionEStringParserRuleCall_4_1_0()); 
	    }
		lv_description_5_0=ruleEString		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getRuleSetRule());
	        }
       		set(
       			$current, 
       			"description",
        		lv_description_5_0, 
        		"EString");
	        afterParserOrEnumRuleCall();
	    }

)
))?((
(
		{ 
	        newCompositeNode(grammarAccess.getRuleSetAccess().getVpRulesRuleParserRuleCall_5_0_0()); 
	    }
		lv_vpRules_6_0=ruleRule		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getRuleSetRule());
	        }
       		add(
       			$current, 
       			"vpRules",
        		lv_vpRules_6_0, 
        		"Rule");
	        afterParserOrEnumRuleCall();
	    }

)
)(
(
		{ 
	        newCompositeNode(grammarAccess.getRuleSetAccess().getVpRulesRuleParserRuleCall_5_1_0()); 
	    }
		lv_vpRules_7_0=ruleRule		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getRuleSetRule());
	        }
       		add(
       			$current, 
       			"vpRules",
        		lv_vpRules_7_0, 
        		"Rule");
	        afterParserOrEnumRuleCall();
	    }

)
)*)?	otherlv_8='}' 
    {
    	newLeafNode(otherlv_8, grammarAccess.getRuleSetAccess().getRightCurlyBracketKeyword_6());
    }
)
;





// Entry rule entryRuleService
entryRuleService returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getServiceRule()); }
	 iv_ruleService=ruleService 
	 { $current=$iv_ruleService.current; } 
	 EOF 
;

// Rule Service
ruleService returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
    {
        $current = forceCreateModelElement(
            grammarAccess.getServiceAccess().getServiceAction_0(),
            $current);
    }
)	otherlv_1='Service' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getServiceAccess().getServiceKeyword_1());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getServiceAccess().getNameFQNParserRuleCall_2_0()); 
	    }
		lv_name_2_0=ruleFQN		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getServiceRule());
	        }
       		set(
       			$current, 
       			"name",
        		lv_name_2_0, 
        		"FQN");
	        afterParserOrEnumRuleCall();
	    }

)
)(	otherlv_3='description:' 
    {
    	newLeafNode(otherlv_3, grammarAccess.getServiceAccess().getDescriptionKeyword_3_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getServiceAccess().getDescriptionEStringParserRuleCall_3_1_0()); 
	    }
		lv_description_4_0=ruleEString		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getServiceRule());
	        }
       		set(
       			$current, 
       			"description",
        		lv_description_4_0, 
        		"EString");
	        afterParserOrEnumRuleCall();
	    }

)
)	otherlv_5=',' 
    {
    	newLeafNode(otherlv_5, grammarAccess.getServiceAccess().getCommaKeyword_3_2());
    }
)?(	otherlv_6='orchestrates' 
    {
    	newLeafNode(otherlv_6, grammarAccess.getServiceAccess().getOrchestratesKeyword_4_0());
    }
(
(
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getServiceRule());
	        }
        }
		{ 
	        newCompositeNode(grammarAccess.getServiceAccess().getRelatedRulesRuleCrossReference_4_1_0()); 
	    }
		ruleFQN		{ 
	        afterParserOrEnumRuleCall();
	    }

)
)(	otherlv_8=',' 
    {
    	newLeafNode(otherlv_8, grammarAccess.getServiceAccess().getCommaKeyword_4_2_0());
    }
(
(
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getServiceRule());
	        }
        }
		{ 
	        newCompositeNode(grammarAccess.getServiceAccess().getRelatedRulesRuleCrossReference_4_2_1_0()); 
	    }
		ruleFQN		{ 
	        afterParserOrEnumRuleCall();
	    }

)
))*)?)
;





// Entry rule entryRuleRule
entryRuleRule returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getRuleRule()); }
	 iv_ruleRule=ruleRule 
	 { $current=$iv_ruleRule.current; } 
	 EOF 
;

// Rule Rule
ruleRule returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
    {
        $current = forceCreateModelElement(
            grammarAccess.getRuleAccess().getRuleAction_0(),
            $current);
    }
)	otherlv_1='Rule' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getRuleAccess().getRuleKeyword_1());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getRuleAccess().getNameFQNParserRuleCall_2_0()); 
	    }
		lv_name_2_0=ruleFQN		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getRuleRule());
	        }
       		set(
       			$current, 
       			"name",
        		lv_name_2_0, 
        		"FQN");
	        afterParserOrEnumRuleCall();
	    }

)
)(	otherlv_3='description:' 
    {
    	newLeafNode(otherlv_3, grammarAccess.getRuleAccess().getDescriptionKeyword_3_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getRuleAccess().getDescriptionEStringParserRuleCall_3_1_0()); 
	    }
		lv_description_4_0=ruleEString		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getRuleRule());
	        }
       		set(
       			$current, 
       			"description",
        		lv_description_4_0, 
        		"EString");
	        afterParserOrEnumRuleCall();
	    }

)
)	otherlv_5=',' 
    {
    	newLeafNode(otherlv_5, grammarAccess.getRuleAccess().getCommaKeyword_3_2());
    }
)?(	otherlv_6='type' 
    {
    	newLeafNode(otherlv_6, grammarAccess.getRuleAccess().getTypeKeyword_4_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getRuleAccess().getTypeRules_TypesEnumRuleCall_4_1_0()); 
	    }
		lv_type_7_0=ruleRules_Types		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getRuleRule());
	        }
       		set(
       			$current, 
       			"type",
        		lv_type_7_0, 
        		"Rules_Types");
	        afterParserOrEnumRuleCall();
	    }

)
))(	otherlv_8=',' 
    {
    	newLeafNode(otherlv_8, grammarAccess.getRuleAccess().getCommaKeyword_5_0());
    }
	otherlv_9='class' 
    {
    	newLeafNode(otherlv_9, grammarAccess.getRuleAccess().getClassKeyword_5_1());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getRuleAccess().getClassEStringParserRuleCall_5_2_0()); 
	    }
		lv_class_10_0=ruleEString		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getRuleRule());
	        }
       		set(
       			$current, 
       			"class",
        		lv_class_10_0, 
        		"EString");
	        afterParserOrEnumRuleCall();
	    }

)
))?)
;





// Entry rule entryRulePropertySet
entryRulePropertySet returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getPropertySetRule()); }
	 iv_rulePropertySet=rulePropertySet 
	 { $current=$iv_rulePropertySet.current; } 
	 EOF 
;

// Rule PropertySet
rulePropertySet returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
    {
        $current = forceCreateModelElement(
            grammarAccess.getPropertySetAccess().getPropertySetAction_0(),
            $current);
    }
)	otherlv_1='Properties' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getPropertySetAccess().getPropertiesKeyword_1());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getPropertySetAccess().getNameFQNParserRuleCall_2_0()); 
	    }
		lv_name_2_0=ruleFQN		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getPropertySetRule());
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
    	newLeafNode(otherlv_3, grammarAccess.getPropertySetAccess().getLeftCurlyBracketKeyword_3());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getPropertySetAccess().getVpPropertiesPropertyParserRuleCall_4_0()); 
	    }
		lv_vpProperties_4_0=ruleProperty		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getPropertySetRule());
	        }
       		add(
       			$current, 
       			"vpProperties",
        		lv_vpProperties_4_0, 
        		"Property");
	        afterParserOrEnumRuleCall();
	    }

)
)*	otherlv_5='}' 
    {
    	newLeafNode(otherlv_5, grammarAccess.getPropertySetAccess().getRightCurlyBracketKeyword_5());
    }
)
;





// Entry rule entryRuleProperty
entryRuleProperty returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getPropertyRule()); }
	 iv_ruleProperty=ruleProperty 
	 { $current=$iv_ruleProperty.current; } 
	 EOF 
;

// Rule Property
ruleProperty returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
    {
        $current = forceCreateModelElement(
            grammarAccess.getPropertyAccess().getPropertyAction_0(),
            $current);
    }
)	otherlv_1='Property' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getPropertyAccess().getPropertyKeyword_1());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getPropertyAccess().getNameEStringParserRuleCall_2_0()); 
	    }
		lv_name_2_0=ruleEString		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getPropertyRule());
	        }
       		set(
       			$current, 
       			"name",
        		lv_name_2_0, 
        		"EString");
	        afterParserOrEnumRuleCall();
	    }

)
)(	otherlv_3='type' 
    {
    	newLeafNode(otherlv_3, grammarAccess.getPropertyAccess().getTypeKeyword_3_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getPropertyAccess().getTypePropertyTypeEnumRuleCall_3_1_0()); 
	    }
		lv_Type_4_0=rulePropertyType		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getPropertyRule());
	        }
       		set(
       			$current, 
       			"Type",
        		lv_Type_4_0, 
        		"PropertyType");
	        afterParserOrEnumRuleCall();
	    }

)
))?(	otherlv_5='value' 
    {
    	newLeafNode(otherlv_5, grammarAccess.getPropertyAccess().getValueKeyword_4_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getPropertyAccess().getValueEStringParserRuleCall_4_1_0()); 
	    }
		lv_value_6_0=ruleEString		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getPropertyRule());
	        }
       		set(
       			$current, 
       			"value",
        		lv_value_6_0, 
        		"EString");
	        afterParserOrEnumRuleCall();
	    }

)
))?)
;





// Entry rule entryRuleEString
entryRuleEString returns [String current=null] 
	:
	{ newCompositeNode(grammarAccess.getEStringRule()); } 
	 iv_ruleEString=ruleEString 
	 { $current=$iv_ruleEString.current.getText(); }  
	 EOF 
;

// Rule EString
ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(    this_STRING_0=RULE_STRING    {
		$current.merge(this_STRING_0);
    }

    { 
    newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
    }

    |    this_ID_1=RULE_ID    {
		$current.merge(this_ID_1);
    }

    { 
    newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
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









// Rule Rules_Types
ruleRules_Types returns [Enumerator current=null] 
    @init { enterRule(); }
    @after { leaveRule(); }:
((	enumLiteral_0='Java' 
	{
        $current = grammarAccess.getRules_TypesAccess().getJavaEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
        newLeafNode(enumLiteral_0, grammarAccess.getRules_TypesAccess().getJavaEnumLiteralDeclaration_0()); 
    }
)
    |(	enumLiteral_1='EMFvalidation' 
	{
        $current = grammarAccess.getRules_TypesAccess().getEMFvalidationEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
        newLeafNode(enumLiteral_1, grammarAccess.getRules_TypesAccess().getEMFvalidationEnumLiteralDeclaration_1()); 
    }
));



// Rule PropertyType
rulePropertyType returns [Enumerator current=null] 
    @init { enterRule(); }
    @after { leaveRule(); }:
((	enumLiteral_0='Integer' 
	{
        $current = grammarAccess.getPropertyTypeAccess().getIntegerEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
        newLeafNode(enumLiteral_0, grammarAccess.getPropertyTypeAccess().getIntegerEnumLiteralDeclaration_0()); 
    }
)
    |(	enumLiteral_1='String' 
	{
        $current = grammarAccess.getPropertyTypeAccess().getStringEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
        newLeafNode(enumLiteral_1, grammarAccess.getPropertyTypeAccess().getStringEnumLiteralDeclaration_1()); 
    }
)
    |(	enumLiteral_2='Boolean' 
	{
        $current = grammarAccess.getPropertyTypeAccess().getBooleanEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
        newLeafNode(enumLiteral_2, grammarAccess.getPropertyTypeAccess().getBooleanEnumLiteralDeclaration_2()); 
    }
)
    |(	enumLiteral_3='Float' 
	{
        $current = grammarAccess.getPropertyTypeAccess().getFloatEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
        newLeafNode(enumLiteral_3, grammarAccess.getPropertyTypeAccess().getFloatEnumLiteralDeclaration_3()); 
    }
));



RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;



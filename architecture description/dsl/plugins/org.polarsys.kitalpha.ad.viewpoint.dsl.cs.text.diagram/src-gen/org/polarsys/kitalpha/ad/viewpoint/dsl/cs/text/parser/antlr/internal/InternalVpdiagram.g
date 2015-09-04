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
grammar InternalVpdiagram;

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
import org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.VpdiagramGrammarAccess;

}

@parser::members {

 	private VpdiagramGrammarAccess grammarAccess;
 	
    public InternalVpdiagramParser(TokenStream input, VpdiagramGrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }
    
    @Override
    protected String getFirstRuleName() {
    	return "Diagrams";	
   	}
   	
   	@Override
   	protected VpdiagramGrammarAccess getGrammarAccess() {
   		return grammarAccess;
   	}
}

@rulecatch { 
    catch (RecognitionException re) { 
        recover(input,re); 
        appendSkippedTokens();
    } 
}




// Entry rule entryRuleDiagrams
entryRuleDiagrams returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getDiagramsRule()); }
	 iv_ruleDiagrams=ruleDiagrams 
	 { $current=$iv_ruleDiagrams.current; } 
	 EOF 
;

// Rule Diagrams
ruleDiagrams returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
    {
        $current = forceCreateModelElement(
            grammarAccess.getDiagramsAccess().getDiagramsAction_0(),
            $current);
    }
)(
(
		{ 
	        newCompositeNode(grammarAccess.getDiagramsAccess().getImportsAbstractImportParserRuleCall_1_0()); 
	    }
		lv_imports_1_0=ruleAbstractImport		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getDiagramsRule());
	        }
       		add(
       			$current, 
       			"imports",
        		lv_imports_1_0, 
        		"AbstractImport");
	        afterParserOrEnumRuleCall();
	    }

)
)*(
(
		{ 
	        newCompositeNode(grammarAccess.getDiagramsAccess().getDiagramsAspectParserRuleCall_2_0()); 
	    }
		lv_diagrams_2_0=ruleAspect		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getDiagramsRule());
	        }
       		set(
       			$current, 
       			"diagrams",
        		lv_diagrams_2_0, 
        		"Aspect");
	        afterParserOrEnumRuleCall();
	    }

)
))
;





// Entry rule entryRuleAbstractImport
entryRuleAbstractImport returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getAbstractImportRule()); }
	 iv_ruleAbstractImport=ruleAbstractImport 
	 { $current=$iv_ruleAbstractImport.current; } 
	 EOF 
;

// Rule AbstractImport
ruleAbstractImport returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
    { 
        newCompositeNode(grammarAccess.getAbstractImportAccess().getImportNameSpaceParserRuleCall_0()); 
    }
    this_ImportNameSpace_0=ruleImportNameSpace
    { 
        $current = $this_ImportNameSpace_0.current; 
        afterParserOrEnumRuleCall();
    }

    |
    { 
        newCompositeNode(grammarAccess.getAbstractImportAccess().getImportGroupParserRuleCall_1()); 
    }
    this_ImportGroup_1=ruleImportGroup
    { 
        $current = $this_ImportGroup_1.current; 
        afterParserOrEnumRuleCall();
    }
)
;





// Entry rule entryRuleImportNameSpace
entryRuleImportNameSpace returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getImportNameSpaceRule()); }
	 iv_ruleImportNameSpace=ruleImportNameSpace 
	 { $current=$iv_ruleImportNameSpace.current; } 
	 EOF 
;

// Rule ImportNameSpace
ruleImportNameSpace returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='import' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getImportNameSpaceAccess().getImportKeyword_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getImportNameSpaceAccess().getImportedNamespaceFQNParserRuleCall_1_0()); 
	    }
		lv_importedNamespace_1_0=ruleFQN		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getImportNameSpaceRule());
	        }
       		set(
       			$current, 
       			"importedNamespace",
        		lv_importedNamespace_1_0, 
        		"FQN");
	        afterParserOrEnumRuleCall();
	    }

)
))
;





// Entry rule entryRuleImportGroup
entryRuleImportGroup returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getImportGroupRule()); }
	 iv_ruleImportGroup=ruleImportGroup 
	 { $current=$iv_ruleImportGroup.current; } 
	 EOF 
;

// Rule ImportGroup
ruleImportGroup returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='import' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getImportGroupAccess().getImportKeyword_0());
    }
	otherlv_1='external' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getImportGroupAccess().getExternalKeyword_1());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getImportGroupAccess().getImportedGroupEStringParserRuleCall_2_0()); 
	    }
		lv_importedGroup_2_0=ruleEString		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getImportGroupRule());
	        }
       		set(
       			$current, 
       			"importedGroup",
        		lv_importedGroup_2_0, 
        		"EString");
	        afterParserOrEnumRuleCall();
	    }

)
))
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

    { 
        newCompositeNode(grammarAccess.getAspectAccess().getDiagramSetParserRuleCall()); 
    }
    this_DiagramSet_0=ruleDiagramSet
    { 
        $current = $this_DiagramSet_0.current; 
        afterParserOrEnumRuleCall();
    }

;





// Entry rule entryRuleDiagramSet
entryRuleDiagramSet returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getDiagramSetRule()); }
	 iv_ruleDiagramSet=ruleDiagramSet 
	 { $current=$iv_ruleDiagramSet.current; } 
	 EOF 
;

// Rule DiagramSet
ruleDiagramSet returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
    {
        $current = forceCreateModelElement(
            grammarAccess.getDiagramSetAccess().getDiagramSetAction_0(),
            $current);
    }
)	otherlv_1='Diagrams' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getDiagramSetAccess().getDiagramsKeyword_1());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getDiagramSetAccess().getNameFQNParserRuleCall_2_0()); 
	    }
		lv_name_2_0=ruleFQN		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getDiagramSetRule());
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
    	newLeafNode(otherlv_3, grammarAccess.getDiagramSetAccess().getLeftCurlyBracketKeyword_3());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getDiagramSetAccess().getDiagramsDiagramRepresentationParserRuleCall_4_0()); 
	    }
		lv_diagrams_4_0=ruleDiagramRepresentation		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getDiagramSetRule());
	        }
       		add(
       			$current, 
       			"diagrams",
        		lv_diagrams_4_0, 
        		"DiagramRepresentation");
	        afterParserOrEnumRuleCall();
	    }

)
)*	otherlv_5='}' 
    {
    	newLeafNode(otherlv_5, grammarAccess.getDiagramSetAccess().getRightCurlyBracketKeyword_5());
    }
)
;





// Entry rule entryRuleDiagramRepresentation
entryRuleDiagramRepresentation returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getDiagramRepresentationRule()); }
	 iv_ruleDiagramRepresentation=ruleDiagramRepresentation 
	 { $current=$iv_ruleDiagramRepresentation.current; } 
	 EOF 
;

// Rule DiagramRepresentation
ruleDiagramRepresentation returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
    { 
        newCompositeNode(grammarAccess.getDiagramRepresentationAccess().getDiagramParserRuleCall_0()); 
    }
    this_Diagram_0=ruleDiagram
    { 
        $current = $this_Diagram_0.current; 
        afterParserOrEnumRuleCall();
    }

    |
    { 
        newCompositeNode(grammarAccess.getDiagramRepresentationAccess().getDiagramExtensionParserRuleCall_1()); 
    }
    this_DiagramExtension_1=ruleDiagramExtension
    { 
        $current = $this_DiagramExtension_1.current; 
        afterParserOrEnumRuleCall();
    }
)
;







// Entry rule entryRuleDiagramChildren
entryRuleDiagramChildren returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getDiagramChildrenRule()); }
	 iv_ruleDiagramChildren=ruleDiagramChildren 
	 { $current=$iv_ruleDiagramChildren.current; } 
	 EOF 
;

// Rule DiagramChildren
ruleDiagramChildren returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
    { 
        newCompositeNode(grammarAccess.getDiagramChildrenAccess().getAbstractEdgeParserRuleCall_0()); 
    }
    this_AbstractEdge_0=ruleAbstractEdge
    { 
        $current = $this_AbstractEdge_0.current; 
        afterParserOrEnumRuleCall();
    }

    |
    { 
        newCompositeNode(grammarAccess.getDiagramChildrenAccess().getContainerParserRuleCall_1()); 
    }
    this_Container_1=ruleContainer
    { 
        $current = $this_Container_1.current; 
        afterParserOrEnumRuleCall();
    }

    |
    { 
        newCompositeNode(grammarAccess.getDiagramChildrenAccess().getNodeParserRuleCall_2()); 
    }
    this_Node_2=ruleNode
    { 
        $current = $this_Node_2.current; 
        afterParserOrEnumRuleCall();
    }
)
;





// Entry rule entryRuleAbstractNode
entryRuleAbstractNode returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getAbstractNodeRule()); }
	 iv_ruleAbstractNode=ruleAbstractNode 
	 { $current=$iv_ruleAbstractNode.current; } 
	 EOF 
;

// Rule AbstractNode
ruleAbstractNode returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
    { 
        newCompositeNode(grammarAccess.getAbstractNodeAccess().getNodeParserRuleCall_0()); 
    }
    this_Node_0=ruleNode
    { 
        $current = $this_Node_0.current; 
        afterParserOrEnumRuleCall();
    }

    |
    { 
        newCompositeNode(grammarAccess.getAbstractNodeAccess().getBorderedNodeParserRuleCall_1()); 
    }
    this_BorderedNode_1=ruleBorderedNode
    { 
        $current = $this_BorderedNode_1.current; 
        afterParserOrEnumRuleCall();
    }

    |
    { 
        newCompositeNode(grammarAccess.getAbstractNodeAccess().getContainerParserRuleCall_2()); 
    }
    this_Container_2=ruleContainer
    { 
        $current = $this_Container_2.current; 
        afterParserOrEnumRuleCall();
    }
)
;





// Entry rule entryRuleAbstractEdge
entryRuleAbstractEdge returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getAbstractEdgeRule()); }
	 iv_ruleAbstractEdge=ruleAbstractEdge 
	 { $current=$iv_ruleAbstractEdge.current; } 
	 EOF 
;

// Rule AbstractEdge
ruleAbstractEdge returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
    { 
        newCompositeNode(grammarAccess.getAbstractEdgeAccess().getEdgeParserRuleCall_0()); 
    }
    this_Edge_0=ruleEdge
    { 
        $current = $this_Edge_0.current; 
        afterParserOrEnumRuleCall();
    }

    |
    { 
        newCompositeNode(grammarAccess.getAbstractEdgeAccess().getEdgeImportParserRuleCall_1()); 
    }
    this_EdgeImport_1=ruleEdgeImport
    { 
        $current = $this_EdgeImport_1.current; 
        afterParserOrEnumRuleCall();
    }
)
;







// Entry rule entryRuleAbstractContainerStyle
entryRuleAbstractContainerStyle returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getAbstractContainerStyleRule()); }
	 iv_ruleAbstractContainerStyle=ruleAbstractContainerStyle 
	 { $current=$iv_ruleAbstractContainerStyle.current; } 
	 EOF 
;

// Rule AbstractContainerStyle
ruleAbstractContainerStyle returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
    { 
        newCompositeNode(grammarAccess.getAbstractContainerStyleAccess().getFlatStyleParserRuleCall_0()); 
    }
    this_FlatStyle_0=ruleFlatStyle
    { 
        $current = $this_FlatStyle_0.current; 
        afterParserOrEnumRuleCall();
    }

    |
    { 
        newCompositeNode(grammarAccess.getAbstractContainerStyleAccess().getImageStyleParserRuleCall_1()); 
    }
    this_ImageStyle_1=ruleImageStyle
    { 
        $current = $this_ImageStyle_1.current; 
        afterParserOrEnumRuleCall();
    }
)
;





// Entry rule entryRuleAbstractNodeStyle
entryRuleAbstractNodeStyle returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getAbstractNodeStyleRule()); }
	 iv_ruleAbstractNodeStyle=ruleAbstractNodeStyle 
	 { $current=$iv_ruleAbstractNodeStyle.current; } 
	 EOF 
;

// Rule AbstractNodeStyle
ruleAbstractNodeStyle returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
    { 
        newCompositeNode(grammarAccess.getAbstractNodeStyleAccess().getImageStyleParserRuleCall_0()); 
    }
    this_ImageStyle_0=ruleImageStyle
    { 
        $current = $this_ImageStyle_0.current; 
        afterParserOrEnumRuleCall();
    }

    |
    { 
        newCompositeNode(grammarAccess.getAbstractNodeStyleAccess().getBasicStyleParserRuleCall_1()); 
    }
    this_BasicStyle_1=ruleBasicStyle
    { 
        $current = $this_BasicStyle_1.current; 
        afterParserOrEnumRuleCall();
    }

    |
    { 
        newCompositeNode(grammarAccess.getAbstractNodeStyleAccess().getHistogramStyleParserRuleCall_2()); 
    }
    this_HistogramStyle_2=ruleHistogramStyle
    { 
        $current = $this_HistogramStyle_2.current; 
        afterParserOrEnumRuleCall();
    }
)
;





// Entry rule entryRuleDiagram
entryRuleDiagram returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getDiagramRule()); }
	 iv_ruleDiagram=ruleDiagram 
	 { $current=$iv_ruleDiagram.current; } 
	 EOF 
;

// Rule Diagram
ruleDiagram returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
    {
        $current = forceCreateModelElement(
            grammarAccess.getDiagramAccess().getDiagramAction_0(),
            $current);
    }
)	otherlv_1='Diagram' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getDiagramAccess().getDiagramKeyword_1());
    }
(
(
		lv_name_2_0=RULE_STRING
		{
			newLeafNode(lv_name_2_0, grammarAccess.getDiagramAccess().getNameSTRINGTerminalRuleCall_2_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getDiagramRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"name",
        		lv_name_2_0, 
        		"STRING");
	    }

)
)	otherlv_3='{' 
    {
    	newLeafNode(otherlv_3, grammarAccess.getDiagramAccess().getLeftCurlyBracketKeyword_3());
    }
(	otherlv_4='description:' 
    {
    	newLeafNode(otherlv_4, grammarAccess.getDiagramAccess().getDescriptionKeyword_4_0());
    }
(
(
		lv_description_5_0=RULE_STRING
		{
			newLeafNode(lv_description_5_0, grammarAccess.getDiagramAccess().getDescriptionSTRINGTerminalRuleCall_4_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getDiagramRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"description",
        		lv_description_5_0, 
        		"STRING");
	    }

)
))?(
(
		{ 
	        newCompositeNode(grammarAccess.getDiagramAccess().getThe_domainDomainContainerParserRuleCall_5_0()); 
	    }
		lv_the_domain_6_0=ruleDomainContainer		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getDiagramRule());
	        }
       		set(
       			$current, 
       			"the_domain",
        		lv_the_domain_6_0, 
        		"DomainContainer");
	        afterParserOrEnumRuleCall();
	    }

)
)(
(
		{ 
	        newCompositeNode(grammarAccess.getDiagramAccess().getThe_MappingSetMappingSetParserRuleCall_6_0()); 
	    }
		lv_the_MappingSet_7_0=ruleMappingSet		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getDiagramRule());
	        }
       		set(
       			$current, 
       			"the_MappingSet",
        		lv_the_MappingSet_7_0, 
        		"MappingSet");
	        afterParserOrEnumRuleCall();
	    }

)
)?(
(
		{ 
	        newCompositeNode(grammarAccess.getDiagramAccess().getThe_ActionSetActionSetParserRuleCall_7_0()); 
	    }
		lv_the_ActionSet_8_0=ruleActionSet		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getDiagramRule());
	        }
       		set(
       			$current, 
       			"the_ActionSet",
        		lv_the_ActionSet_8_0, 
        		"ActionSet");
	        afterParserOrEnumRuleCall();
	    }

)
)?	otherlv_9='}' 
    {
    	newLeafNode(otherlv_9, grammarAccess.getDiagramAccess().getRightCurlyBracketKeyword_8());
    }
)
;





// Entry rule entryRuleDiagramExtension
entryRuleDiagramExtension returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getDiagramExtensionRule()); }
	 iv_ruleDiagramExtension=ruleDiagramExtension 
	 { $current=$iv_ruleDiagramExtension.current; } 
	 EOF 
;

// Rule DiagramExtension
ruleDiagramExtension returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
    {
        $current = forceCreateModelElement(
            grammarAccess.getDiagramExtensionAccess().getDiagramExtensionAction_0(),
            $current);
    }
)	otherlv_1='DiagramExtension' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getDiagramExtensionAccess().getDiagramExtensionKeyword_1());
    }
(
(
		lv_name_2_0=RULE_STRING
		{
			newLeafNode(lv_name_2_0, grammarAccess.getDiagramExtensionAccess().getNameSTRINGTerminalRuleCall_2_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getDiagramExtensionRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"name",
        		lv_name_2_0, 
        		"STRING");
	    }

)
)	otherlv_3='{' 
    {
    	newLeafNode(otherlv_3, grammarAccess.getDiagramExtensionAccess().getLeftCurlyBracketKeyword_3());
    }
(	otherlv_4='extended-diagram:' 
    {
    	newLeafNode(otherlv_4, grammarAccess.getDiagramExtensionAccess().getExtendedDiagramKeyword_4_0());
    }
(
(
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getDiagramExtensionRule());
	        }
        }
		{ 
	        newCompositeNode(grammarAccess.getDiagramExtensionAccess().getExtented_diagramDiagramDescriptionCrossReference_4_1_0()); 
	    }
		ruleFQN		{ 
	        afterParserOrEnumRuleCall();
	    }

)
))?(
(
		{ 
	        newCompositeNode(grammarAccess.getDiagramExtensionAccess().getThe_MappingSetMappingSetParserRuleCall_5_0()); 
	    }
		lv_the_MappingSet_6_0=ruleMappingSet		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getDiagramExtensionRule());
	        }
       		set(
       			$current, 
       			"the_MappingSet",
        		lv_the_MappingSet_6_0, 
        		"MappingSet");
	        afterParserOrEnumRuleCall();
	    }

)
)?(
(
		{ 
	        newCompositeNode(grammarAccess.getDiagramExtensionAccess().getThe_ActionSetActionSetParserRuleCall_6_0()); 
	    }
		lv_the_ActionSet_7_0=ruleActionSet		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getDiagramExtensionRule());
	        }
       		set(
       			$current, 
       			"the_ActionSet",
        		lv_the_ActionSet_7_0, 
        		"ActionSet");
	        afterParserOrEnumRuleCall();
	    }

)
)?	otherlv_8='}' 
    {
    	newLeafNode(otherlv_8, grammarAccess.getDiagramExtensionAccess().getRightCurlyBracketKeyword_7());
    }
)
;





// Entry rule entryRuleMappingSet
entryRuleMappingSet returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getMappingSetRule()); }
	 iv_ruleMappingSet=ruleMappingSet 
	 { $current=$iv_ruleMappingSet.current; } 
	 EOF 
;

// Rule MappingSet
ruleMappingSet returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
    {
        $current = forceCreateModelElement(
            grammarAccess.getMappingSetAccess().getMappingSetAction_0(),
            $current);
    }
)	otherlv_1='Mapping' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getMappingSetAccess().getMappingKeyword_1());
    }
	otherlv_2='{' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getMappingSetAccess().getLeftCurlyBracketKeyword_2());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getMappingSetAccess().getDiagram_ElementsDiagramChildrenParserRuleCall_3_0()); 
	    }
		lv_diagram_Elements_3_0=ruleDiagramChildren		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getMappingSetRule());
	        }
       		add(
       			$current, 
       			"diagram_Elements",
        		lv_diagram_Elements_3_0, 
        		"DiagramChildren");
	        afterParserOrEnumRuleCall();
	    }

)
)*	otherlv_4='}' 
    {
    	newLeafNode(otherlv_4, grammarAccess.getMappingSetAccess().getRightCurlyBracketKeyword_4());
    }
)
;





// Entry rule entryRuleEdgeDescription
entryRuleEdgeDescription returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getEdgeDescriptionRule()); }
	 iv_ruleEdgeDescription=ruleEdgeDescription 
	 { $current=$iv_ruleEdgeDescription.current; } 
	 EOF 
;

// Rule EdgeDescription
ruleEdgeDescription returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
    {
        $current = forceCreateModelElement(
            grammarAccess.getEdgeDescriptionAccess().getEdgeDescriptionAction_0(),
            $current);
    }
)	otherlv_1='Representation' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getEdgeDescriptionAccess().getRepresentationKeyword_1());
    }
	otherlv_2='{' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getEdgeDescriptionAccess().getLeftCurlyBracketKeyword_2());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getEdgeDescriptionAccess().getConditionConditionParserRuleCall_3_0()); 
	    }
		lv_condition_3_0=ruleCondition		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getEdgeDescriptionRule());
	        }
       		set(
       			$current, 
       			"condition",
        		lv_condition_3_0, 
        		"Condition");
	        afterParserOrEnumRuleCall();
	    }

)
)?(	otherlv_4='BeginLabel' 
    {
    	newLeafNode(otherlv_4, grammarAccess.getEdgeDescriptionAccess().getBeginLabelKeyword_4_0());
    }
	otherlv_5='{' 
    {
    	newLeafNode(otherlv_5, grammarAccess.getEdgeDescriptionAccess().getLeftCurlyBracketKeyword_4_1());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getEdgeDescriptionAccess().getBegin_LabelLabelParserRuleCall_4_2_0()); 
	    }
		lv_begin_Label_6_0=ruleLabel		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getEdgeDescriptionRule());
	        }
       		set(
       			$current, 
       			"begin_Label",
        		lv_begin_Label_6_0, 
        		"Label");
	        afterParserOrEnumRuleCall();
	    }

)
)	otherlv_7='}' 
    {
    	newLeafNode(otherlv_7, grammarAccess.getEdgeDescriptionAccess().getRightCurlyBracketKeyword_4_3());
    }
)?(	otherlv_8='CenterLabel' 
    {
    	newLeafNode(otherlv_8, grammarAccess.getEdgeDescriptionAccess().getCenterLabelKeyword_5_0());
    }
	otherlv_9='{' 
    {
    	newLeafNode(otherlv_9, grammarAccess.getEdgeDescriptionAccess().getLeftCurlyBracketKeyword_5_1());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getEdgeDescriptionAccess().getCenter_labelLabelParserRuleCall_5_2_0()); 
	    }
		lv_center_label_10_0=ruleLabel		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getEdgeDescriptionRule());
	        }
       		set(
       			$current, 
       			"center_label",
        		lv_center_label_10_0, 
        		"Label");
	        afterParserOrEnumRuleCall();
	    }

)
)	otherlv_11='}' 
    {
    	newLeafNode(otherlv_11, grammarAccess.getEdgeDescriptionAccess().getRightCurlyBracketKeyword_5_3());
    }
)?(	otherlv_12='EndLabel' 
    {
    	newLeafNode(otherlv_12, grammarAccess.getEdgeDescriptionAccess().getEndLabelKeyword_6_0());
    }
	otherlv_13='{' 
    {
    	newLeafNode(otherlv_13, grammarAccess.getEdgeDescriptionAccess().getLeftCurlyBracketKeyword_6_1());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getEdgeDescriptionAccess().getEnd_labelLabelParserRuleCall_6_2_0()); 
	    }
		lv_end_label_14_0=ruleLabel		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getEdgeDescriptionRule());
	        }
       		set(
       			$current, 
       			"end_label",
        		lv_end_label_14_0, 
        		"Label");
	        afterParserOrEnumRuleCall();
	    }

)
)	otherlv_15='}' 
    {
    	newLeafNode(otherlv_15, grammarAccess.getEdgeDescriptionAccess().getRightCurlyBracketKeyword_6_3());
    }
)?(
(
		{ 
	        newCompositeNode(grammarAccess.getEdgeDescriptionAccess().getStyleEdgeStyleParserRuleCall_7_0()); 
	    }
		lv_style_16_0=ruleEdgeStyle		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getEdgeDescriptionRule());
	        }
       		set(
       			$current, 
       			"style",
        		lv_style_16_0, 
        		"EdgeStyle");
	        afterParserOrEnumRuleCall();
	    }

)
)?	otherlv_17='}' 
    {
    	newLeafNode(otherlv_17, grammarAccess.getEdgeDescriptionAccess().getRightCurlyBracketKeyword_8());
    }
)
;





// Entry rule entryRuleCondition
entryRuleCondition returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getConditionRule()); }
	 iv_ruleCondition=ruleCondition 
	 { $current=$iv_ruleCondition.current; } 
	 EOF 
;

// Rule Condition
ruleCondition returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
    {
        $current = forceCreateModelElement(
            grammarAccess.getConditionAccess().getConditionAction_0(),
            $current);
    }
)	otherlv_1='condition:' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getConditionAccess().getConditionKeyword_1());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getConditionAccess().getExpressionForeignExpressionElementParserRuleCall_2_0()); 
	    }
		lv_expression_2_0=ruleForeignExpressionElement		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getConditionRule());
	        }
       		set(
       			$current, 
       			"expression",
        		lv_expression_2_0, 
        		"ForeignExpressionElement");
	        afterParserOrEnumRuleCall();
	    }

)
))
;





// Entry rule entryRuleEdgeStyle
entryRuleEdgeStyle returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getEdgeStyleRule()); }
	 iv_ruleEdgeStyle=ruleEdgeStyle 
	 { $current=$iv_ruleEdgeStyle.current; } 
	 EOF 
;

// Rule EdgeStyle
ruleEdgeStyle returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
    {
        $current = forceCreateModelElement(
            grammarAccess.getEdgeStyleAccess().getEdgeStyleAction_0(),
            $current);
    }
)	otherlv_1='Style' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getEdgeStyleAccess().getStyleKeyword_1());
    }
	otherlv_2='{' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getEdgeStyleAccess().getLeftCurlyBracketKeyword_2());
    }
(	otherlv_3='line-style:' 
    {
    	newLeafNode(otherlv_3, grammarAccess.getEdgeStyleAccess().getLineStyleKeyword_3_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getEdgeStyleAccess().getLineStyleLineStyleEnumRuleCall_3_1_0()); 
	    }
		lv_lineStyle_4_0=ruleLineStyle		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getEdgeStyleRule());
	        }
       		set(
       			$current, 
       			"lineStyle",
        		lv_lineStyle_4_0, 
        		"LineStyle");
	        afterParserOrEnumRuleCall();
	    }

)
))?(	otherlv_5='begin-decorator:' 
    {
    	newLeafNode(otherlv_5, grammarAccess.getEdgeStyleAccess().getBeginDecoratorKeyword_4_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getEdgeStyleAccess().getBeginDecoratorEdgeArrowsEnumRuleCall_4_1_0()); 
	    }
		lv_beginDecorator_6_0=ruleEdgeArrows		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getEdgeStyleRule());
	        }
       		set(
       			$current, 
       			"beginDecorator",
        		lv_beginDecorator_6_0, 
        		"EdgeArrows");
	        afterParserOrEnumRuleCall();
	    }

)
))?(	otherlv_7='end-decorator:' 
    {
    	newLeafNode(otherlv_7, grammarAccess.getEdgeStyleAccess().getEndDecoratorKeyword_5_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getEdgeStyleAccess().getEndDecoratorEdgeArrowsEnumRuleCall_5_1_0()); 
	    }
		lv_endDecorator_8_0=ruleEdgeArrows		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getEdgeStyleRule());
	        }
       		set(
       			$current, 
       			"endDecorator",
        		lv_endDecorator_8_0, 
        		"EdgeArrows");
	        afterParserOrEnumRuleCall();
	    }

)
))?(	otherlv_9='color:' 
    {
    	newLeafNode(otherlv_9, grammarAccess.getEdgeStyleAccess().getColorKeyword_6_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getEdgeStyleAccess().getColorSystemColorsEnumRuleCall_6_1_0()); 
	    }
		lv_color_10_0=ruleSystemColors		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getEdgeStyleRule());
	        }
       		set(
       			$current, 
       			"color",
        		lv_color_10_0, 
        		"SystemColors");
	        afterParserOrEnumRuleCall();
	    }

)
))?	otherlv_11='}' 
    {
    	newLeafNode(otherlv_11, grammarAccess.getEdgeStyleAccess().getRightCurlyBracketKeyword_7());
    }
)
;





// Entry rule entryRuleContainer
entryRuleContainer returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getContainerRule()); }
	 iv_ruleContainer=ruleContainer 
	 { $current=$iv_ruleContainer.current; } 
	 EOF 
;

// Rule Container
ruleContainer returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
    {
        $current = forceCreateModelElement(
            grammarAccess.getContainerAccess().getContainerAction_0(),
            $current);
    }
)	otherlv_1='Container' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getContainerAccess().getContainerKeyword_1());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getContainerAccess().getNameEStringParserRuleCall_2_0()); 
	    }
		lv_name_2_0=ruleEString		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getContainerRule());
	        }
       		set(
       			$current, 
       			"name",
        		lv_name_2_0, 
        		"EString");
	        afterParserOrEnumRuleCall();
	    }

)
)	otherlv_3='{' 
    {
    	newLeafNode(otherlv_3, grammarAccess.getContainerAccess().getLeftCurlyBracketKeyword_3());
    }
(	otherlv_4='import:' 
    {
    	newLeafNode(otherlv_4, grammarAccess.getContainerAccess().getImportKeyword_4_0());
    }
(
(
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getContainerRule());
	        }
        }
		{ 
	        newCompositeNode(grammarAccess.getContainerAccess().getImportsContainerMappingCrossReference_4_1_0()); 
	    }
		ruleFQN		{ 
	        afterParserOrEnumRuleCall();
	    }

)
))?(	otherlv_6='domain-context:' 
    {
    	newLeafNode(otherlv_6, grammarAccess.getContainerAccess().getDomainContextKeyword_5_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getContainerAccess().getThe_domainNodeDomainElementParserRuleCall_5_1_0()); 
	    }
		lv_the_domain_7_0=ruleNodeDomainElement		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getContainerRule());
	        }
       		set(
       			$current, 
       			"the_domain",
        		lv_the_domain_7_0, 
        		"NodeDomainElement");
	        afterParserOrEnumRuleCall();
	    }

)
))?(	otherlv_8='content-layout:' 
    {
    	newLeafNode(otherlv_8, grammarAccess.getContainerAccess().getContentLayoutKeyword_6_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getContainerAccess().getContentLayoutContainerLayoutEnumRuleCall_6_1_0()); 
	    }
		lv_contentLayout_9_0=ruleContainerLayout		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getContainerRule());
	        }
       		set(
       			$current, 
       			"contentLayout",
        		lv_contentLayout_9_0, 
        		"ContainerLayout");
	        afterParserOrEnumRuleCall();
	    }

)
))?(
(
		{ 
	        newCompositeNode(grammarAccess.getContainerAccess().getStyleContainerDescriptionParserRuleCall_7_0()); 
	    }
		lv_style_10_0=ruleContainerDescription		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getContainerRule());
	        }
       		add(
       			$current, 
       			"style",
        		lv_style_10_0, 
        		"ContainerDescription");
	        afterParserOrEnumRuleCall();
	    }

)
)*(
(
		{ 
	        newCompositeNode(grammarAccess.getContainerAccess().getChildrenContainerChildrenParserRuleCall_8_0()); 
	    }
		lv_children_11_0=ruleContainerChildren		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getContainerRule());
	        }
       		set(
       			$current, 
       			"children",
        		lv_children_11_0, 
        		"ContainerChildren");
	        afterParserOrEnumRuleCall();
	    }

)
)?	otherlv_12='}' 
    {
    	newLeafNode(otherlv_12, grammarAccess.getContainerAccess().getRightCurlyBracketKeyword_9());
    }
)
;





// Entry rule entryRuleContainerChildren
entryRuleContainerChildren returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getContainerChildrenRule()); }
	 iv_ruleContainerChildren=ruleContainerChildren 
	 { $current=$iv_ruleContainerChildren.current; } 
	 EOF 
;

// Rule ContainerChildren
ruleContainerChildren returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
    {
        $current = forceCreateModelElement(
            grammarAccess.getContainerChildrenAccess().getContainerChildrenAction_0(),
            $current);
    }
)	otherlv_1='Contains' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getContainerChildrenAccess().getContainsKeyword_1());
    }
	otherlv_2='{' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getContainerChildrenAccess().getLeftCurlyBracketKeyword_2());
    }
(	otherlv_3='reuse' 
    {
    	newLeafNode(otherlv_3, grammarAccess.getContainerChildrenAccess().getReuseKeyword_3_0());
    }
(
(
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getContainerChildrenRule());
	        }
        }
		{ 
	        newCompositeNode(grammarAccess.getContainerChildrenAccess().getReused_nodesAbstractNodeCrossReference_3_1_0()); 
	    }
		ruleFQN		{ 
	        afterParserOrEnumRuleCall();
	    }

)
)(	otherlv_5=',' 
    {
    	newLeafNode(otherlv_5, grammarAccess.getContainerChildrenAccess().getCommaKeyword_3_2_0());
    }
(
(
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getContainerChildrenRule());
	        }
        }
		{ 
	        newCompositeNode(grammarAccess.getContainerChildrenAccess().getReused_nodesAbstractNodeCrossReference_3_2_1_0()); 
	    }
		ruleFQN		{ 
	        afterParserOrEnumRuleCall();
	    }

)
))*)?(
(
		{ 
	        newCompositeNode(grammarAccess.getContainerChildrenAccess().getOwned_nodesAbstractNodeParserRuleCall_4_0()); 
	    }
		lv_owned_nodes_7_0=ruleAbstractNode		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getContainerChildrenRule());
	        }
       		add(
       			$current, 
       			"owned_nodes",
        		lv_owned_nodes_7_0, 
        		"AbstractNode");
	        afterParserOrEnumRuleCall();
	    }

)
)*	otherlv_8='}' 
    {
    	newLeafNode(otherlv_8, grammarAccess.getContainerChildrenAccess().getRightCurlyBracketKeyword_5());
    }
)
;





// Entry rule entryRuleNodeDomainElement
entryRuleNodeDomainElement returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getNodeDomainElementRule()); }
	 iv_ruleNodeDomainElement=ruleNodeDomainElement 
	 { $current=$iv_ruleNodeDomainElement.current; } 
	 EOF 
;

// Rule NodeDomainElement
ruleNodeDomainElement returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
    {
        $current = forceCreateModelElement(
            grammarAccess.getNodeDomainElementAccess().getNodeDomainElementAction_0(),
            $current);
    }
)(
(
		{ 
	        newCompositeNode(grammarAccess.getNodeDomainElementAccess().getDomain_ClassAbstractClassParserRuleCall_1_0()); 
	    }
		lv_domain_Class_1_0=ruleAbstractClass		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getNodeDomainElementRule());
	        }
       		set(
       			$current, 
       			"domain_Class",
        		lv_domain_Class_1_0, 
        		"AbstractClass");
	        afterParserOrEnumRuleCall();
	    }

)
)(	otherlv_2='provided-by' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getNodeDomainElementAccess().getProvidedByKeyword_2_0());
    }
((	otherlv_3='query' 
    {
    	newLeafNode(otherlv_3, grammarAccess.getNodeDomainElementAccess().getQueryKeyword_2_1_0_0());
    }
(
(
		lv_query_4_0=RULE_STRING
		{
			newLeafNode(lv_query_4_0, grammarAccess.getNodeDomainElementAccess().getQuerySTRINGTerminalRuleCall_2_1_0_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getNodeDomainElementRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"query",
        		lv_query_4_0, 
        		"STRING");
	    }

)
))
    |(	otherlv_5='association' 
    {
    	newLeafNode(otherlv_5, grammarAccess.getNodeDomainElementAccess().getAssociationKeyword_2_1_1_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getNodeDomainElementAccess().getChlidren_listAbstractAssociation2ParserRuleCall_2_1_1_1_0()); 
	    }
		lv_chlidren_list_6_0=ruleAbstractAssociation2		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getNodeDomainElementRule());
	        }
       		set(
       			$current, 
       			"chlidren_list",
        		lv_chlidren_list_6_0, 
        		"AbstractAssociation2");
	        afterParserOrEnumRuleCall();
	    }

)
))))?)
;





// Entry rule entryRuleContainerDescription
entryRuleContainerDescription returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getContainerDescriptionRule()); }
	 iv_ruleContainerDescription=ruleContainerDescription 
	 { $current=$iv_ruleContainerDescription.current; } 
	 EOF 
;

// Rule ContainerDescription
ruleContainerDescription returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
    {
        $current = forceCreateModelElement(
            grammarAccess.getContainerDescriptionAccess().getContainerDescriptionAction_0(),
            $current);
    }
)	otherlv_1='Representation' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getContainerDescriptionAccess().getRepresentationKeyword_1());
    }
	otherlv_2='{' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getContainerDescriptionAccess().getLeftCurlyBracketKeyword_2());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getContainerDescriptionAccess().getConditionConditionParserRuleCall_3_0()); 
	    }
		lv_condition_3_0=ruleCondition		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getContainerDescriptionRule());
	        }
       		set(
       			$current, 
       			"condition",
        		lv_condition_3_0, 
        		"Condition");
	        afterParserOrEnumRuleCall();
	    }

)
)?(	otherlv_4='Label' 
    {
    	newLeafNode(otherlv_4, grammarAccess.getContainerDescriptionAccess().getLabelKeyword_4_0());
    }
	otherlv_5='{' 
    {
    	newLeafNode(otherlv_5, grammarAccess.getContainerDescriptionAccess().getLeftCurlyBracketKeyword_4_1());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getContainerDescriptionAccess().getNode_LabelLabelParserRuleCall_4_2_0()); 
	    }
		lv_node_Label_6_0=ruleLabel		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getContainerDescriptionRule());
	        }
       		set(
       			$current, 
       			"node_Label",
        		lv_node_Label_6_0, 
        		"Label");
	        afterParserOrEnumRuleCall();
	    }

)
)	otherlv_7='}' 
    {
    	newLeafNode(otherlv_7, grammarAccess.getContainerDescriptionAccess().getRightCurlyBracketKeyword_4_3());
    }
)?(	otherlv_8='Style' 
    {
    	newLeafNode(otherlv_8, grammarAccess.getContainerDescriptionAccess().getStyleKeyword_5_0());
    }
((	'{' 
)=>	otherlv_9='{' 
    {
    	newLeafNode(otherlv_9, grammarAccess.getContainerDescriptionAccess().getLeftCurlyBracketKeyword_5_1());
    }
)(
(
		{ 
	        newCompositeNode(grammarAccess.getContainerDescriptionAccess().getStyleAbstractContainerStyleParserRuleCall_5_2_0()); 
	    }
		lv_style_10_0=ruleAbstractContainerStyle		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getContainerDescriptionRule());
	        }
       		set(
       			$current, 
       			"style",
        		lv_style_10_0, 
        		"AbstractContainerStyle");
	        afterParserOrEnumRuleCall();
	    }

)
)	otherlv_11='}' 
    {
    	newLeafNode(otherlv_11, grammarAccess.getContainerDescriptionAccess().getRightCurlyBracketKeyword_5_3());
    }
)?	otherlv_12='}' 
    {
    	newLeafNode(otherlv_12, grammarAccess.getContainerDescriptionAccess().getRightCurlyBracketKeyword_6());
    }
)
;





// Entry rule entryRuleBasicStyle
entryRuleBasicStyle returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getBasicStyleRule()); }
	 iv_ruleBasicStyle=ruleBasicStyle 
	 { $current=$iv_ruleBasicStyle.current; } 
	 EOF 
;

// Rule BasicStyle
ruleBasicStyle returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
    {
        $current = forceCreateModelElement(
            grammarAccess.getBasicStyleAccess().getBasicStyleAction_0(),
            $current);
    }
)	otherlv_1='BasicStyle' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getBasicStyleAccess().getBasicStyleKeyword_1());
    }
	otherlv_2='{' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getBasicStyleAccess().getLeftCurlyBracketKeyword_2());
    }
(	otherlv_3='border-color:' 
    {
    	newLeafNode(otherlv_3, grammarAccess.getBasicStyleAccess().getBorderColorKeyword_3_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getBasicStyleAccess().getBorderColorSystemColorsEnumRuleCall_3_1_0()); 
	    }
		lv_borderColor_4_0=ruleSystemColors		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getBasicStyleRule());
	        }
       		set(
       			$current, 
       			"borderColor",
        		lv_borderColor_4_0, 
        		"SystemColors");
	        afterParserOrEnumRuleCall();
	    }

)
))?(	otherlv_5='background:' 
    {
    	newLeafNode(otherlv_5, grammarAccess.getBasicStyleAccess().getBackgroundKeyword_4_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getBasicStyleAccess().getBackgroundColorSystemColorsEnumRuleCall_4_1_0()); 
	    }
		lv_backgroundColor_6_0=ruleSystemColors		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getBasicStyleRule());
	        }
       		set(
       			$current, 
       			"backgroundColor",
        		lv_backgroundColor_6_0, 
        		"SystemColors");
	        afterParserOrEnumRuleCall();
	    }

)
))?(	otherlv_7='form:' 
    {
    	newLeafNode(otherlv_7, grammarAccess.getBasicStyleAccess().getFormKeyword_5_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getBasicStyleAccess().getFormNode_FormEnumRuleCall_5_1_0()); 
	    }
		lv_form_8_0=ruleNode_Form		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getBasicStyleRule());
	        }
       		set(
       			$current, 
       			"form",
        		lv_form_8_0, 
        		"Node_Form");
	        afterParserOrEnumRuleCall();
	    }

)
))?	otherlv_9='}' 
    {
    	newLeafNode(otherlv_9, grammarAccess.getBasicStyleAccess().getRightCurlyBracketKeyword_6());
    }
)
;





// Entry rule entryRuleHistogramStyle
entryRuleHistogramStyle returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getHistogramStyleRule()); }
	 iv_ruleHistogramStyle=ruleHistogramStyle 
	 { $current=$iv_ruleHistogramStyle.current; } 
	 EOF 
;

// Rule HistogramStyle
ruleHistogramStyle returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
    {
        $current = forceCreateModelElement(
            grammarAccess.getHistogramStyleAccess().getHistogramStyleAction_0(),
            $current);
    }
)	otherlv_1='HistogramStyle' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getHistogramStyleAccess().getHistogramStyleKeyword_1());
    }
	otherlv_2='{' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getHistogramStyleAccess().getLeftCurlyBracketKeyword_2());
    }
(	otherlv_3='border-color:' 
    {
    	newLeafNode(otherlv_3, grammarAccess.getHistogramStyleAccess().getBorderColorKeyword_3_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getHistogramStyleAccess().getBorderColorSystemColorsEnumRuleCall_3_1_0()); 
	    }
		lv_borderColor_4_0=ruleSystemColors		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getHistogramStyleRule());
	        }
       		set(
       			$current, 
       			"borderColor",
        		lv_borderColor_4_0, 
        		"SystemColors");
	        afterParserOrEnumRuleCall();
	    }

)
))?(
(
		{ 
	        newCompositeNode(grammarAccess.getHistogramStyleAccess().getSectionsHistogramSectionParserRuleCall_4_0()); 
	    }
		lv_sections_5_0=ruleHistogramSection		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getHistogramStyleRule());
	        }
       		add(
       			$current, 
       			"sections",
        		lv_sections_5_0, 
        		"HistogramSection");
	        afterParserOrEnumRuleCall();
	    }

)
)*	otherlv_6='}' 
    {
    	newLeafNode(otherlv_6, grammarAccess.getHistogramStyleAccess().getRightCurlyBracketKeyword_5());
    }
)
;





// Entry rule entryRuleHistogramSection
entryRuleHistogramSection returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getHistogramSectionRule()); }
	 iv_ruleHistogramSection=ruleHistogramSection 
	 { $current=$iv_ruleHistogramSection.current; } 
	 EOF 
;

// Rule HistogramSection
ruleHistogramSection returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
    {
        $current = forceCreateModelElement(
            grammarAccess.getHistogramSectionAccess().getHistogramSectionAction_0(),
            $current);
    }
)	otherlv_1='Section' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getHistogramSectionAccess().getSectionKeyword_1());
    }
	otherlv_2='{' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getHistogramSectionAccess().getLeftCurlyBracketKeyword_2());
    }
(	otherlv_3='background:' 
    {
    	newLeafNode(otherlv_3, grammarAccess.getHistogramSectionAccess().getBackgroundKeyword_3_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getHistogramSectionAccess().getBackgroundColorSystemColorsEnumRuleCall_3_1_0()); 
	    }
		lv_backgroundColor_4_0=ruleSystemColors		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getHistogramSectionRule());
	        }
       		set(
       			$current, 
       			"backgroundColor",
        		lv_backgroundColor_4_0, 
        		"SystemColors");
	        afterParserOrEnumRuleCall();
	    }

)
))?(	otherlv_5='foreground:' 
    {
    	newLeafNode(otherlv_5, grammarAccess.getHistogramSectionAccess().getForegroundKeyword_4_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getHistogramSectionAccess().getForgroundColorSystemColorsEnumRuleCall_4_1_0()); 
	    }
		lv_forgroundColor_6_0=ruleSystemColors		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getHistogramSectionRule());
	        }
       		set(
       			$current, 
       			"forgroundColor",
        		lv_forgroundColor_6_0, 
        		"SystemColors");
	        afterParserOrEnumRuleCall();
	    }

)
))?(	otherlv_7='minValue:' 
    {
    	newLeafNode(otherlv_7, grammarAccess.getHistogramSectionAccess().getMinValueKeyword_5_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getHistogramSectionAccess().getMinValueForeignExpressionElementParserRuleCall_5_1_0()); 
	    }
		lv_minValue_8_0=ruleForeignExpressionElement		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getHistogramSectionRule());
	        }
       		set(
       			$current, 
       			"minValue",
        		lv_minValue_8_0, 
        		"ForeignExpressionElement");
	        afterParserOrEnumRuleCall();
	    }

)
))?(	otherlv_9='value:' 
    {
    	newLeafNode(otherlv_9, grammarAccess.getHistogramSectionAccess().getValueKeyword_6_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getHistogramSectionAccess().getValueForeignExpressionElementParserRuleCall_6_1_0()); 
	    }
		lv_value_10_0=ruleForeignExpressionElement		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getHistogramSectionRule());
	        }
       		set(
       			$current, 
       			"value",
        		lv_value_10_0, 
        		"ForeignExpressionElement");
	        afterParserOrEnumRuleCall();
	    }

)
))?(	otherlv_11='maxValue:' 
    {
    	newLeafNode(otherlv_11, grammarAccess.getHistogramSectionAccess().getMaxValueKeyword_7_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getHistogramSectionAccess().getMaxValueForeignExpressionElementParserRuleCall_7_1_0()); 
	    }
		lv_maxValue_12_0=ruleForeignExpressionElement		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getHistogramSectionRule());
	        }
       		set(
       			$current, 
       			"maxValue",
        		lv_maxValue_12_0, 
        		"ForeignExpressionElement");
	        afterParserOrEnumRuleCall();
	    }

)
))?	otherlv_13='}' 
    {
    	newLeafNode(otherlv_13, grammarAccess.getHistogramSectionAccess().getRightCurlyBracketKeyword_8());
    }
)
;





// Entry rule entryRuleImageStyle
entryRuleImageStyle returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getImageStyleRule()); }
	 iv_ruleImageStyle=ruleImageStyle 
	 { $current=$iv_ruleImageStyle.current; } 
	 EOF 
;

// Rule ImageStyle
ruleImageStyle returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
    {
        $current = forceCreateModelElement(
            grammarAccess.getImageStyleAccess().getImageStyleAction_0(),
            $current);
    }
)	otherlv_1='Image' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getImageStyleAccess().getImageKeyword_1());
    }
	otherlv_2='{' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getImageStyleAccess().getLeftCurlyBracketKeyword_2());
    }
(	otherlv_3='border:' 
    {
    	newLeafNode(otherlv_3, grammarAccess.getImageStyleAccess().getBorderKeyword_3_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getImageStyleAccess().getBorderColorSystemColorsEnumRuleCall_3_1_0()); 
	    }
		lv_borderColor_4_0=ruleSystemColors		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getImageStyleRule());
	        }
       		set(
       			$current, 
       			"borderColor",
        		lv_borderColor_4_0, 
        		"SystemColors");
	        afterParserOrEnumRuleCall();
	    }

)
))?(	otherlv_5='path:' 
    {
    	newLeafNode(otherlv_5, grammarAccess.getImageStyleAccess().getPathKeyword_4_0());
    }
(
(
		lv_imagePath_6_0=RULE_STRING
		{
			newLeafNode(lv_imagePath_6_0, grammarAccess.getImageStyleAccess().getImagePathSTRINGTerminalRuleCall_4_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getImageStyleRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"imagePath",
        		lv_imagePath_6_0, 
        		"STRING");
	    }

)
))	otherlv_7='}' 
    {
    	newLeafNode(otherlv_7, grammarAccess.getImageStyleAccess().getRightCurlyBracketKeyword_5());
    }
)
;





// Entry rule entryRuleFlatStyle
entryRuleFlatStyle returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getFlatStyleRule()); }
	 iv_ruleFlatStyle=ruleFlatStyle 
	 { $current=$iv_ruleFlatStyle.current; } 
	 EOF 
;

// Rule FlatStyle
ruleFlatStyle returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
    {
        $current = forceCreateModelElement(
            grammarAccess.getFlatStyleAccess().getFlatStyleAction_0(),
            $current);
    }
)	otherlv_1='FlatStyle' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getFlatStyleAccess().getFlatStyleKeyword_1());
    }
	otherlv_2='{' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getFlatStyleAccess().getLeftCurlyBracketKeyword_2());
    }
(	otherlv_3='border:' 
    {
    	newLeafNode(otherlv_3, grammarAccess.getFlatStyleAccess().getBorderKeyword_3_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getFlatStyleAccess().getBorderColorSystemColorsEnumRuleCall_3_1_0()); 
	    }
		lv_borderColor_4_0=ruleSystemColors		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getFlatStyleRule());
	        }
       		set(
       			$current, 
       			"borderColor",
        		lv_borderColor_4_0, 
        		"SystemColors");
	        afterParserOrEnumRuleCall();
	    }

)
))?(	otherlv_5='background:' 
    {
    	newLeafNode(otherlv_5, grammarAccess.getFlatStyleAccess().getBackgroundKeyword_4_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getFlatStyleAccess().getBackgroundStyleBackgroundStyleEnumRuleCall_4_1_0()); 
	    }
		lv_backgroundStyle_6_0=ruleBackgroundStyle		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getFlatStyleRule());
	        }
       		set(
       			$current, 
       			"backgroundStyle",
        		lv_backgroundStyle_6_0, 
        		"BackgroundStyle");
	        afterParserOrEnumRuleCall();
	    }

)
)?(
(
		{ 
	        newCompositeNode(grammarAccess.getFlatStyleAccess().getBackgroundColorSystemColorsEnumRuleCall_4_2_0()); 
	    }
		lv_backgroundColor_7_0=ruleSystemColors		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getFlatStyleRule());
	        }
       		set(
       			$current, 
       			"backgroundColor",
        		lv_backgroundColor_7_0, 
        		"SystemColors");
	        afterParserOrEnumRuleCall();
	    }

)
))?(	otherlv_8='foreground:' 
    {
    	newLeafNode(otherlv_8, grammarAccess.getFlatStyleAccess().getForegroundKeyword_5_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getFlatStyleAccess().getForgroundColorSystemColorsEnumRuleCall_5_1_0()); 
	    }
		lv_forgroundColor_9_0=ruleSystemColors		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getFlatStyleRule());
	        }
       		set(
       			$current, 
       			"forgroundColor",
        		lv_forgroundColor_9_0, 
        		"SystemColors");
	        afterParserOrEnumRuleCall();
	    }

)
))?	otherlv_10='}' 
    {
    	newLeafNode(otherlv_10, grammarAccess.getFlatStyleAccess().getRightCurlyBracketKeyword_6());
    }
)
;





// Entry rule entryRuleLabel
entryRuleLabel returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getLabelRule()); }
	 iv_ruleLabel=ruleLabel 
	 { $current=$iv_ruleLabel.current; } 
	 EOF 
;

// Rule Label
ruleLabel returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
    {
        $current = forceCreateModelElement(
            grammarAccess.getLabelAccess().getLabelAction_0(),
            $current);
    }
)(	otherlv_1='content:' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getLabelAccess().getContentKeyword_1_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getLabelAccess().getValueExpressionParserRuleCall_1_1_0()); 
	    }
		lv_value_2_0=ruleExpression		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getLabelRule());
	        }
       		set(
       			$current, 
       			"value",
        		lv_value_2_0, 
        		"Expression");
	        afterParserOrEnumRuleCall();
	    }

)
))(	otherlv_3='police:' 
    {
    	newLeafNode(otherlv_3, grammarAccess.getLabelAccess().getPoliceKeyword_2_0());
    }
(
(
		lv_bold_4_0=	'bold' 
    {
        newLeafNode(lv_bold_4_0, grammarAccess.getLabelAccess().getBoldBoldKeyword_2_1_0());
    }
 
	    {
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getLabelRule());
	        }
       		setWithLastConsumed($current, "bold", true, "bold");
	    }

)
)?(
(
		lv_italic_5_0=	'italic' 
    {
        newLeafNode(lv_italic_5_0, grammarAccess.getLabelAccess().getItalicItalicKeyword_2_2_0());
    }
 
	    {
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getLabelRule());
	        }
       		setWithLastConsumed($current, "italic", true, "italic");
	    }

)
)?(
(
		{ 
	        newCompositeNode(grammarAccess.getLabelAccess().getColorSystemColorsEnumRuleCall_2_3_0()); 
	    }
		lv_color_6_0=ruleSystemColors		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getLabelRule());
	        }
       		set(
       			$current, 
       			"color",
        		lv_color_6_0, 
        		"SystemColors");
	        afterParserOrEnumRuleCall();
	    }

)
)?(
(
		{ 
	        newCompositeNode(grammarAccess.getLabelAccess().getSizeEIntParserRuleCall_2_4_0()); 
	    }
		lv_size_7_0=ruleEInt		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getLabelRule());
	        }
       		set(
       			$current, 
       			"size",
        		lv_size_7_0, 
        		"EInt");
	        afterParserOrEnumRuleCall();
	    }

)
)?)?)
;





// Entry rule entryRuleNode
entryRuleNode returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getNodeRule()); }
	 iv_ruleNode=ruleNode 
	 { $current=$iv_ruleNode.current; } 
	 EOF 
;

// Rule Node
ruleNode returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
    {
        $current = forceCreateModelElement(
            grammarAccess.getNodeAccess().getNodeAction_0(),
            $current);
    }
)	otherlv_1='Node' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getNodeAccess().getNodeKeyword_1());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getNodeAccess().getNameEStringParserRuleCall_2_0()); 
	    }
		lv_name_2_0=ruleEString		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getNodeRule());
	        }
       		set(
       			$current, 
       			"name",
        		lv_name_2_0, 
        		"EString");
	        afterParserOrEnumRuleCall();
	    }

)
)	otherlv_3='{' 
    {
    	newLeafNode(otherlv_3, grammarAccess.getNodeAccess().getLeftCurlyBracketKeyword_3());
    }
(	otherlv_4='import:' 
    {
    	newLeafNode(otherlv_4, grammarAccess.getNodeAccess().getImportKeyword_4_0());
    }
(
(
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getNodeRule());
	        }
        }
		{ 
	        newCompositeNode(grammarAccess.getNodeAccess().getImportsNodeMappingCrossReference_4_1_0()); 
	    }
		ruleFQN		{ 
	        afterParserOrEnumRuleCall();
	    }

)
))?(	otherlv_6='domain-context:' 
    {
    	newLeafNode(otherlv_6, grammarAccess.getNodeAccess().getDomainContextKeyword_5_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getNodeAccess().getThe_domainNodeDomainElementParserRuleCall_5_1_0()); 
	    }
		lv_the_domain_7_0=ruleNodeDomainElement		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getNodeRule());
	        }
       		set(
       			$current, 
       			"the_domain",
        		lv_the_domain_7_0, 
        		"NodeDomainElement");
	        afterParserOrEnumRuleCall();
	    }

)
))?(
(
		{ 
	        newCompositeNode(grammarAccess.getNodeAccess().getStyleNodeDescriptionParserRuleCall_6_0()); 
	    }
		lv_style_8_0=ruleNodeDescription		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getNodeRule());
	        }
       		add(
       			$current, 
       			"style",
        		lv_style_8_0, 
        		"NodeDescription");
	        afterParserOrEnumRuleCall();
	    }

)
)*(
(
		{ 
	        newCompositeNode(grammarAccess.getNodeAccess().getChildrenNodeChildrenParserRuleCall_7_0()); 
	    }
		lv_children_9_0=ruleNodeChildren		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getNodeRule());
	        }
       		set(
       			$current, 
       			"children",
        		lv_children_9_0, 
        		"NodeChildren");
	        afterParserOrEnumRuleCall();
	    }

)
)?	otherlv_10='}' 
    {
    	newLeafNode(otherlv_10, grammarAccess.getNodeAccess().getRightCurlyBracketKeyword_8());
    }
)
;





// Entry rule entryRuleNodeChildren
entryRuleNodeChildren returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getNodeChildrenRule()); }
	 iv_ruleNodeChildren=ruleNodeChildren 
	 { $current=$iv_ruleNodeChildren.current; } 
	 EOF 
;

// Rule NodeChildren
ruleNodeChildren returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
    {
        $current = forceCreateModelElement(
            grammarAccess.getNodeChildrenAccess().getNodeChildrenAction_0(),
            $current);
    }
)	otherlv_1='Contains' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getNodeChildrenAccess().getContainsKeyword_1());
    }
	otherlv_2='{' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getNodeChildrenAccess().getLeftCurlyBracketKeyword_2());
    }
(	otherlv_3='reuse' 
    {
    	newLeafNode(otherlv_3, grammarAccess.getNodeChildrenAccess().getReuseKeyword_3_0());
    }
(
(
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getNodeChildrenRule());
	        }
        }
		{ 
	        newCompositeNode(grammarAccess.getNodeChildrenAccess().getReused_boderednodesBorderedNodeCrossReference_3_1_0()); 
	    }
		ruleFQN		{ 
	        afterParserOrEnumRuleCall();
	    }

)
)(	otherlv_5=',' 
    {
    	newLeafNode(otherlv_5, grammarAccess.getNodeChildrenAccess().getCommaKeyword_3_2_0());
    }
(
(
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getNodeChildrenRule());
	        }
        }
		{ 
	        newCompositeNode(grammarAccess.getNodeChildrenAccess().getReused_boderednodesBorderedNodeCrossReference_3_2_1_0()); 
	    }
		ruleFQN		{ 
	        afterParserOrEnumRuleCall();
	    }

)
))*)?(
(
		{ 
	        newCompositeNode(grammarAccess.getNodeChildrenAccess().getOwned_boderednodesBorderedNodeParserRuleCall_4_0()); 
	    }
		lv_owned_boderednodes_7_0=ruleBorderedNode		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getNodeChildrenRule());
	        }
       		add(
       			$current, 
       			"owned_boderednodes",
        		lv_owned_boderednodes_7_0, 
        		"BorderedNode");
	        afterParserOrEnumRuleCall();
	    }

)
)*	otherlv_8='}' 
    {
    	newLeafNode(otherlv_8, grammarAccess.getNodeChildrenAccess().getRightCurlyBracketKeyword_5());
    }
)
;





// Entry rule entryRuleBorderedNode
entryRuleBorderedNode returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getBorderedNodeRule()); }
	 iv_ruleBorderedNode=ruleBorderedNode 
	 { $current=$iv_ruleBorderedNode.current; } 
	 EOF 
;

// Rule BorderedNode
ruleBorderedNode returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
    {
        $current = forceCreateModelElement(
            grammarAccess.getBorderedNodeAccess().getBorderedNodeAction_0(),
            $current);
    }
)	otherlv_1='BorderedNode' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getBorderedNodeAccess().getBorderedNodeKeyword_1());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getBorderedNodeAccess().getNameEStringParserRuleCall_2_0()); 
	    }
		lv_name_2_0=ruleEString		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getBorderedNodeRule());
	        }
       		set(
       			$current, 
       			"name",
        		lv_name_2_0, 
        		"EString");
	        afterParserOrEnumRuleCall();
	    }

)
)	otherlv_3='{' 
    {
    	newLeafNode(otherlv_3, grammarAccess.getBorderedNodeAccess().getLeftCurlyBracketKeyword_3());
    }
(	otherlv_4='import:' 
    {
    	newLeafNode(otherlv_4, grammarAccess.getBorderedNodeAccess().getImportKeyword_4_0());
    }
(
(
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getBorderedNodeRule());
	        }
        }
		{ 
	        newCompositeNode(grammarAccess.getBorderedNodeAccess().getImportsNodeMappingCrossReference_4_1_0()); 
	    }
		ruleFQN		{ 
	        afterParserOrEnumRuleCall();
	    }

)
))?(	otherlv_6='domain-context:' 
    {
    	newLeafNode(otherlv_6, grammarAccess.getBorderedNodeAccess().getDomainContextKeyword_5_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getBorderedNodeAccess().getThe_domainNodeDomainElementParserRuleCall_5_1_0()); 
	    }
		lv_the_domain_7_0=ruleNodeDomainElement		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getBorderedNodeRule());
	        }
       		set(
       			$current, 
       			"the_domain",
        		lv_the_domain_7_0, 
        		"NodeDomainElement");
	        afterParserOrEnumRuleCall();
	    }

)
))?(
(
		{ 
	        newCompositeNode(grammarAccess.getBorderedNodeAccess().getStyleNodeDescriptionParserRuleCall_6_0()); 
	    }
		lv_style_8_0=ruleNodeDescription		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getBorderedNodeRule());
	        }
       		add(
       			$current, 
       			"style",
        		lv_style_8_0, 
        		"NodeDescription");
	        afterParserOrEnumRuleCall();
	    }

)
)*	otherlv_9='}' 
    {
    	newLeafNode(otherlv_9, grammarAccess.getBorderedNodeAccess().getRightCurlyBracketKeyword_7());
    }
)
;





// Entry rule entryRuleNodeDescription
entryRuleNodeDescription returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getNodeDescriptionRule()); }
	 iv_ruleNodeDescription=ruleNodeDescription 
	 { $current=$iv_ruleNodeDescription.current; } 
	 EOF 
;

// Rule NodeDescription
ruleNodeDescription returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
    {
        $current = forceCreateModelElement(
            grammarAccess.getNodeDescriptionAccess().getNodeDescriptionAction_0(),
            $current);
    }
)	otherlv_1='Representation' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getNodeDescriptionAccess().getRepresentationKeyword_1());
    }
	otherlv_2='{' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getNodeDescriptionAccess().getLeftCurlyBracketKeyword_2());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getNodeDescriptionAccess().getConditionConditionParserRuleCall_3_0()); 
	    }
		lv_condition_3_0=ruleCondition		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getNodeDescriptionRule());
	        }
       		set(
       			$current, 
       			"condition",
        		lv_condition_3_0, 
        		"Condition");
	        afterParserOrEnumRuleCall();
	    }

)
)?(	otherlv_4='Label' 
    {
    	newLeafNode(otherlv_4, grammarAccess.getNodeDescriptionAccess().getLabelKeyword_4_0());
    }
	otherlv_5='{' 
    {
    	newLeafNode(otherlv_5, grammarAccess.getNodeDescriptionAccess().getLeftCurlyBracketKeyword_4_1());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getNodeDescriptionAccess().getNode_LabelLabelParserRuleCall_4_2_0()); 
	    }
		lv_node_Label_6_0=ruleLabel		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getNodeDescriptionRule());
	        }
       		set(
       			$current, 
       			"node_Label",
        		lv_node_Label_6_0, 
        		"Label");
	        afterParserOrEnumRuleCall();
	    }

)
)(	otherlv_7='position:' 
    {
    	newLeafNode(otherlv_7, grammarAccess.getNodeDescriptionAccess().getPositionKeyword_4_3_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getNodeDescriptionAccess().getLabel_positionLabelPositionEnumRuleCall_4_3_1_0()); 
	    }
		lv_label_position_8_0=ruleLabelPosition		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getNodeDescriptionRule());
	        }
       		set(
       			$current, 
       			"label_position",
        		lv_label_position_8_0, 
        		"LabelPosition");
	        afterParserOrEnumRuleCall();
	    }

)
))?(	otherlv_9='alignment:' 
    {
    	newLeafNode(otherlv_9, grammarAccess.getNodeDescriptionAccess().getAlignmentKeyword_4_4_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getNodeDescriptionAccess().getLabel_alignementLabelAlignmentEnumRuleCall_4_4_1_0()); 
	    }
		lv_label_alignement_10_0=ruleLabelAlignment		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getNodeDescriptionRule());
	        }
       		set(
       			$current, 
       			"label_alignement",
        		lv_label_alignement_10_0, 
        		"LabelAlignment");
	        afterParserOrEnumRuleCall();
	    }

)
))?	otherlv_11='}' 
    {
    	newLeafNode(otherlv_11, grammarAccess.getNodeDescriptionAccess().getRightCurlyBracketKeyword_4_5());
    }
)?(	otherlv_12='Style' 
    {
    	newLeafNode(otherlv_12, grammarAccess.getNodeDescriptionAccess().getStyleKeyword_5_0());
    }
	otherlv_13='{' 
    {
    	newLeafNode(otherlv_13, grammarAccess.getNodeDescriptionAccess().getLeftCurlyBracketKeyword_5_1());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getNodeDescriptionAccess().getStyleAbstractNodeStyleParserRuleCall_5_2_0()); 
	    }
		lv_style_14_0=ruleAbstractNodeStyle		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getNodeDescriptionRule());
	        }
       		set(
       			$current, 
       			"style",
        		lv_style_14_0, 
        		"AbstractNodeStyle");
	        afterParserOrEnumRuleCall();
	    }

)
)	otherlv_15='}' 
    {
    	newLeafNode(otherlv_15, grammarAccess.getNodeDescriptionAccess().getRightCurlyBracketKeyword_5_3());
    }
)?	otherlv_16='}' 
    {
    	newLeafNode(otherlv_16, grammarAccess.getNodeDescriptionAccess().getRightCurlyBracketKeyword_6());
    }
)
;





// Entry rule entryRuleActionSet
entryRuleActionSet returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getActionSetRule()); }
	 iv_ruleActionSet=ruleActionSet 
	 { $current=$iv_ruleActionSet.current; } 
	 EOF 
;

// Rule ActionSet
ruleActionSet returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
    {
        $current = forceCreateModelElement(
            grammarAccess.getActionSetAccess().getActionSetAction_0(),
            $current);
    }
)	otherlv_1='Actions' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getActionSetAccess().getActionsKeyword_1());
    }
	otherlv_2='{' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getActionSetAccess().getLeftCurlyBracketKeyword_2());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getActionSetAccess().getActionsActionParserRuleCall_3_0()); 
	    }
		lv_actions_3_0=ruleAction		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getActionSetRule());
	        }
       		add(
       			$current, 
       			"actions",
        		lv_actions_3_0, 
        		"Action");
	        afterParserOrEnumRuleCall();
	    }

)
)*(
(
		{ 
	        newCompositeNode(grammarAccess.getActionSetAccess().getOpenActionsOpenActionParserRuleCall_4_0()); 
	    }
		lv_openActions_4_0=ruleOpenAction		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getActionSetRule());
	        }
       		add(
       			$current, 
       			"openActions",
        		lv_openActions_4_0, 
        		"OpenAction");
	        afterParserOrEnumRuleCall();
	    }

)
)*	otherlv_5='}' 
    {
    	newLeafNode(otherlv_5, grammarAccess.getActionSetAccess().getRightCurlyBracketKeyword_5());
    }
)
;





// Entry rule entryRuleOpenAction
entryRuleOpenAction returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getOpenActionRule()); }
	 iv_ruleOpenAction=ruleOpenAction 
	 { $current=$iv_ruleOpenAction.current; } 
	 EOF 
;

// Rule OpenAction
ruleOpenAction returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
    {
        $current = forceCreateModelElement(
            grammarAccess.getOpenActionAccess().getOpenActionAction_0(),
            $current);
    }
)	otherlv_1='OpenAction' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getOpenActionAccess().getOpenActionKeyword_1());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getOpenActionAccess().getNameEStringParserRuleCall_2_0()); 
	    }
		lv_name_2_0=ruleEString		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getOpenActionRule());
	        }
       		set(
       			$current, 
       			"name",
        		lv_name_2_0, 
        		"EString");
	        afterParserOrEnumRuleCall();
	    }

)
)	otherlv_3='{' 
    {
    	newLeafNode(otherlv_3, grammarAccess.getOpenActionAccess().getLeftCurlyBracketKeyword_3());
    }
(	otherlv_4='precondition:' 
    {
    	newLeafNode(otherlv_4, grammarAccess.getOpenActionAccess().getPreconditionKeyword_4_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getOpenActionAccess().getPreconditionEStringParserRuleCall_4_1_0()); 
	    }
		lv_precondition_5_0=ruleEString		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getOpenActionRule());
	        }
       		set(
       			$current, 
       			"precondition",
        		lv_precondition_5_0, 
        		"EString");
	        afterParserOrEnumRuleCall();
	    }

)
))?(	otherlv_6='label:' 
    {
    	newLeafNode(otherlv_6, grammarAccess.getOpenActionAccess().getLabelKeyword_5_0());
    }
(
(
		lv_label_7_0=RULE_STRING
		{
			newLeafNode(lv_label_7_0, grammarAccess.getOpenActionAccess().getLabelSTRINGTerminalRuleCall_5_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getOpenActionRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"label",
        		lv_label_7_0, 
        		"STRING");
	    }

)
))?(	otherlv_8='icon:' 
    {
    	newLeafNode(otherlv_8, grammarAccess.getOpenActionAccess().getIconKeyword_6_0());
    }
(
(
		lv_icon_9_0=RULE_STRING
		{
			newLeafNode(lv_icon_9_0, grammarAccess.getOpenActionAccess().getIconSTRINGTerminalRuleCall_6_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getOpenActionRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"icon",
        		lv_icon_9_0, 
        		"STRING");
	    }

)
))?	otherlv_10='}' 
    {
    	newLeafNode(otherlv_10, grammarAccess.getOpenActionAccess().getRightCurlyBracketKeyword_7());
    }
)
;





// Entry rule entryRuleAction
entryRuleAction returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getActionRule()); }
	 iv_ruleAction=ruleAction 
	 { $current=$iv_ruleAction.current; } 
	 EOF 
;

// Rule Action
ruleAction returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
    { 
        newCompositeNode(grammarAccess.getActionAccess().getCreateParserRuleCall_0()); 
    }
    this_Create_0=ruleCreate
    { 
        $current = $this_Create_0.current; 
        afterParserOrEnumRuleCall();
    }

    |
    { 
        newCompositeNode(grammarAccess.getActionAccess().getDeleteParserRuleCall_1()); 
    }
    this_Delete_1=ruleDelete
    { 
        $current = $this_Delete_1.current; 
        afterParserOrEnumRuleCall();
    }

    |
    { 
        newCompositeNode(grammarAccess.getActionAccess().getDropParserRuleCall_2()); 
    }
    this_Drop_2=ruleDrop
    { 
        $current = $this_Drop_2.current; 
        afterParserOrEnumRuleCall();
    }

    |
    { 
        newCompositeNode(grammarAccess.getActionAccess().getReconnectEdgeParserRuleCall_3()); 
    }
    this_ReconnectEdge_3=ruleReconnectEdge
    { 
        $current = $this_ReconnectEdge_3.current; 
        afterParserOrEnumRuleCall();
    }
)
;





// Entry rule entryRuleCreate
entryRuleCreate returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getCreateRule()); }
	 iv_ruleCreate=ruleCreate 
	 { $current=$iv_ruleCreate.current; } 
	 EOF 
;

// Rule Create
ruleCreate returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
    {
        $current = forceCreateModelElement(
            grammarAccess.getCreateAccess().getCreateAction_0(),
            $current);
    }
)	otherlv_1='Create' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getCreateAccess().getCreateKeyword_1());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getCreateAccess().getNameEStringParserRuleCall_2_0()); 
	    }
		lv_name_2_0=ruleEString		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getCreateRule());
	        }
       		set(
       			$current, 
       			"name",
        		lv_name_2_0, 
        		"EString");
	        afterParserOrEnumRuleCall();
	    }

)
)	otherlv_3='{' 
    {
    	newLeafNode(otherlv_3, grammarAccess.getCreateAccess().getLeftCurlyBracketKeyword_3());
    }
(	otherlv_4='precondition:' 
    {
    	newLeafNode(otherlv_4, grammarAccess.getCreateAccess().getPreconditionKeyword_4_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getCreateAccess().getPreconditionEStringParserRuleCall_4_1_0()); 
	    }
		lv_precondition_5_0=ruleEString		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getCreateRule());
	        }
       		set(
       			$current, 
       			"precondition",
        		lv_precondition_5_0, 
        		"EString");
	        afterParserOrEnumRuleCall();
	    }

)
))?(	otherlv_6='label:' 
    {
    	newLeafNode(otherlv_6, grammarAccess.getCreateAccess().getLabelKeyword_5_0());
    }
(
(
		lv_label_7_0=RULE_STRING
		{
			newLeafNode(lv_label_7_0, grammarAccess.getCreateAccess().getLabelSTRINGTerminalRuleCall_5_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getCreateRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"label",
        		lv_label_7_0, 
        		"STRING");
	    }

)
))?(	otherlv_8='action-for:' 
    {
    	newLeafNode(otherlv_8, grammarAccess.getCreateAccess().getActionForKeyword_6_0());
    }
(
(
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getCreateRule());
	        }
        }
		{ 
	        newCompositeNode(grammarAccess.getCreateAccess().getTool_ForDiagramElementCrossReference_6_1_0()); 
	    }
		ruleFQN		{ 
	        afterParserOrEnumRuleCall();
	    }

)
))(	otherlv_10='icon:' 
    {
    	newLeafNode(otherlv_10, grammarAccess.getCreateAccess().getIconKeyword_7_0());
    }
(
(
		lv_icon_11_0=RULE_STRING
		{
			newLeafNode(lv_icon_11_0, grammarAccess.getCreateAccess().getIconSTRINGTerminalRuleCall_7_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getCreateRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"icon",
        		lv_icon_11_0, 
        		"STRING");
	    }

)
))?	otherlv_12='}' 
    {
    	newLeafNode(otherlv_12, grammarAccess.getCreateAccess().getRightCurlyBracketKeyword_8());
    }
)
;





// Entry rule entryRuleDelete
entryRuleDelete returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getDeleteRule()); }
	 iv_ruleDelete=ruleDelete 
	 { $current=$iv_ruleDelete.current; } 
	 EOF 
;

// Rule Delete
ruleDelete returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
    {
        $current = forceCreateModelElement(
            grammarAccess.getDeleteAccess().getDeleteAction_0(),
            $current);
    }
)	otherlv_1='Delete' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getDeleteAccess().getDeleteKeyword_1());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getDeleteAccess().getNameEStringParserRuleCall_2_0()); 
	    }
		lv_name_2_0=ruleEString		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getDeleteRule());
	        }
       		set(
       			$current, 
       			"name",
        		lv_name_2_0, 
        		"EString");
	        afterParserOrEnumRuleCall();
	    }

)
)	otherlv_3='{' 
    {
    	newLeafNode(otherlv_3, grammarAccess.getDeleteAccess().getLeftCurlyBracketKeyword_3());
    }
(	otherlv_4='precondition:' 
    {
    	newLeafNode(otherlv_4, grammarAccess.getDeleteAccess().getPreconditionKeyword_4_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getDeleteAccess().getPreconditionEStringParserRuleCall_4_1_0()); 
	    }
		lv_precondition_5_0=ruleEString		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getDeleteRule());
	        }
       		set(
       			$current, 
       			"precondition",
        		lv_precondition_5_0, 
        		"EString");
	        afterParserOrEnumRuleCall();
	    }

)
))?(	otherlv_6='label:' 
    {
    	newLeafNode(otherlv_6, grammarAccess.getDeleteAccess().getLabelKeyword_5_0());
    }
(
(
		lv_label_7_0=RULE_STRING
		{
			newLeafNode(lv_label_7_0, grammarAccess.getDeleteAccess().getLabelSTRINGTerminalRuleCall_5_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getDeleteRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"label",
        		lv_label_7_0, 
        		"STRING");
	    }

)
))?(	otherlv_8='action-for:' 
    {
    	newLeafNode(otherlv_8, grammarAccess.getDeleteAccess().getActionForKeyword_6_0());
    }
(
(
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getDeleteRule());
	        }
        }
		{ 
	        newCompositeNode(grammarAccess.getDeleteAccess().getTool_ForDiagramElementCrossReference_6_1_0()); 
	    }
		ruleFQN		{ 
	        afterParserOrEnumRuleCall();
	    }

)
))	otherlv_10='}' 
    {
    	newLeafNode(otherlv_10, grammarAccess.getDeleteAccess().getRightCurlyBracketKeyword_7());
    }
)
;





// Entry rule entryRuleDrop
entryRuleDrop returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getDropRule()); }
	 iv_ruleDrop=ruleDrop 
	 { $current=$iv_ruleDrop.current; } 
	 EOF 
;

// Rule Drop
ruleDrop returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
    {
        $current = forceCreateModelElement(
            grammarAccess.getDropAccess().getDropAction_0(),
            $current);
    }
)	otherlv_1='Drop' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getDropAccess().getDropKeyword_1());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getDropAccess().getNameEStringParserRuleCall_2_0()); 
	    }
		lv_name_2_0=ruleEString		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getDropRule());
	        }
       		set(
       			$current, 
       			"name",
        		lv_name_2_0, 
        		"EString");
	        afterParserOrEnumRuleCall();
	    }

)
)	otherlv_3='{' 
    {
    	newLeafNode(otherlv_3, grammarAccess.getDropAccess().getLeftCurlyBracketKeyword_3());
    }
(	otherlv_4='precondition:' 
    {
    	newLeafNode(otherlv_4, grammarAccess.getDropAccess().getPreconditionKeyword_4_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getDropAccess().getPreconditionEStringParserRuleCall_4_1_0()); 
	    }
		lv_precondition_5_0=ruleEString		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getDropRule());
	        }
       		set(
       			$current, 
       			"precondition",
        		lv_precondition_5_0, 
        		"EString");
	        afterParserOrEnumRuleCall();
	    }

)
))?(	otherlv_6='label:' 
    {
    	newLeafNode(otherlv_6, grammarAccess.getDropAccess().getLabelKeyword_5_0());
    }
(
(
		lv_label_7_0=RULE_STRING
		{
			newLeafNode(lv_label_7_0, grammarAccess.getDropAccess().getLabelSTRINGTerminalRuleCall_5_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getDropRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"label",
        		lv_label_7_0, 
        		"STRING");
	    }

)
))?(	otherlv_8='action-for:' 
    {
    	newLeafNode(otherlv_8, grammarAccess.getDropAccess().getActionForKeyword_6_0());
    }
(
(
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getDropRule());
	        }
        }
		{ 
	        newCompositeNode(grammarAccess.getDropAccess().getTool_ForDiagramElementCrossReference_6_1_0()); 
	    }
		ruleFQN		{ 
	        afterParserOrEnumRuleCall();
	    }

)
))	otherlv_10='}' 
    {
    	newLeafNode(otherlv_10, grammarAccess.getDropAccess().getRightCurlyBracketKeyword_7());
    }
)
;





// Entry rule entryRuleReconnectEdge
entryRuleReconnectEdge returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getReconnectEdgeRule()); }
	 iv_ruleReconnectEdge=ruleReconnectEdge 
	 { $current=$iv_ruleReconnectEdge.current; } 
	 EOF 
;

// Rule ReconnectEdge
ruleReconnectEdge returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
    {
        $current = forceCreateModelElement(
            grammarAccess.getReconnectEdgeAccess().getReconnectEdgeAction_0(),
            $current);
    }
)	otherlv_1='ReconnectEdge' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getReconnectEdgeAccess().getReconnectEdgeKeyword_1());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getReconnectEdgeAccess().getNameEStringParserRuleCall_2_0()); 
	    }
		lv_name_2_0=ruleEString		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getReconnectEdgeRule());
	        }
       		set(
       			$current, 
       			"name",
        		lv_name_2_0, 
        		"EString");
	        afterParserOrEnumRuleCall();
	    }

)
)	otherlv_3='{' 
    {
    	newLeafNode(otherlv_3, grammarAccess.getReconnectEdgeAccess().getLeftCurlyBracketKeyword_3());
    }
(	otherlv_4='precondition:' 
    {
    	newLeafNode(otherlv_4, grammarAccess.getReconnectEdgeAccess().getPreconditionKeyword_4_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getReconnectEdgeAccess().getPreconditionEStringParserRuleCall_4_1_0()); 
	    }
		lv_precondition_5_0=ruleEString		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getReconnectEdgeRule());
	        }
       		set(
       			$current, 
       			"precondition",
        		lv_precondition_5_0, 
        		"EString");
	        afterParserOrEnumRuleCall();
	    }

)
))?(	otherlv_6='label:' 
    {
    	newLeafNode(otherlv_6, grammarAccess.getReconnectEdgeAccess().getLabelKeyword_5_0());
    }
(
(
		lv_label_7_0=RULE_STRING
		{
			newLeafNode(lv_label_7_0, grammarAccess.getReconnectEdgeAccess().getLabelSTRINGTerminalRuleCall_5_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getReconnectEdgeRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"label",
        		lv_label_7_0, 
        		"STRING");
	    }

)
))?(	otherlv_8='action-for:' 
    {
    	newLeafNode(otherlv_8, grammarAccess.getReconnectEdgeAccess().getActionForKeyword_6_0());
    }
(
(
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getReconnectEdgeRule());
	        }
        }
		{ 
	        newCompositeNode(grammarAccess.getReconnectEdgeAccess().getTool_ForDiagramElementCrossReference_6_1_0()); 
	    }
		ruleFQN		{ 
	        afterParserOrEnumRuleCall();
	    }

)
))	otherlv_10='}' 
    {
    	newLeafNode(otherlv_10, grammarAccess.getReconnectEdgeAccess().getRightCurlyBracketKeyword_7());
    }
)
;





// Entry rule entryRuleDomainContainer
entryRuleDomainContainer returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getDomainContainerRule()); }
	 iv_ruleDomainContainer=ruleDomainContainer 
	 { $current=$iv_ruleDomainContainer.current; } 
	 EOF 
;

// Rule DomainContainer
ruleDomainContainer returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
    {
        $current = forceCreateModelElement(
            grammarAccess.getDomainContainerAccess().getDomainContainerAction_0(),
            $current);
    }
)(	otherlv_1='domain-context:' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getDomainContainerAccess().getDomainContextKeyword_1_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getDomainContainerAccess().getThe_domainAbstractClassParserRuleCall_1_1_0()); 
	    }
		lv_the_domain_2_0=ruleAbstractClass		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getDomainContainerRule());
	        }
       		set(
       			$current, 
       			"the_domain",
        		lv_the_domain_2_0, 
        		"AbstractClass");
	        afterParserOrEnumRuleCall();
	    }

)
)))
;





// Entry rule entryRuleEdge
entryRuleEdge returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getEdgeRule()); }
	 iv_ruleEdge=ruleEdge 
	 { $current=$iv_ruleEdge.current; } 
	 EOF 
;

// Rule Edge
ruleEdge returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
    {
        $current = forceCreateModelElement(
            grammarAccess.getEdgeAccess().getEdgeAction_0(),
            $current);
    }
)	otherlv_1='Edge' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getEdgeAccess().getEdgeKeyword_1());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getEdgeAccess().getNameEStringParserRuleCall_2_0()); 
	    }
		lv_name_2_0=ruleEString		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getEdgeRule());
	        }
       		set(
       			$current, 
       			"name",
        		lv_name_2_0, 
        		"EString");
	        afterParserOrEnumRuleCall();
	    }

)
)	otherlv_3='{' 
    {
    	newLeafNode(otherlv_3, grammarAccess.getEdgeAccess().getLeftCurlyBracketKeyword_3());
    }
((	otherlv_4='association-context:' 
    {
    	newLeafNode(otherlv_4, grammarAccess.getEdgeAccess().getAssociationContextKeyword_4_0_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getEdgeAccess().getThe_domainEdgeDomainAssociationParserRuleCall_4_0_1_0()); 
	    }
		lv_the_domain_5_0=ruleEdgeDomainAssociation		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getEdgeRule());
	        }
       		set(
       			$current, 
       			"the_domain",
        		lv_the_domain_5_0, 
        		"EdgeDomainAssociation");
	        afterParserOrEnumRuleCall();
	    }

)
))
    |(	otherlv_6='class-association-context:' 
    {
    	newLeafNode(otherlv_6, grammarAccess.getEdgeAccess().getClassAssociationContextKeyword_4_1_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getEdgeAccess().getThe_domainEdgeDomainElementParserRuleCall_4_1_1_0()); 
	    }
		lv_the_domain_7_0=ruleEdgeDomainElement		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getEdgeRule());
	        }
       		set(
       			$current, 
       			"the_domain",
        		lv_the_domain_7_0, 
        		"EdgeDomainElement");
	        afterParserOrEnumRuleCall();
	    }

)
)))(	otherlv_8='source:' 
    {
    	newLeafNode(otherlv_8, grammarAccess.getEdgeAccess().getSourceKeyword_5_0());
    }
(
(
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getEdgeRule());
	        }
        }
		{ 
	        newCompositeNode(grammarAccess.getEdgeAccess().getSourceDiagramElementCrossReference_5_1_0()); 
	    }
		ruleFQN		{ 
	        afterParserOrEnumRuleCall();
	    }

)
)(	otherlv_10=',' 
    {
    	newLeafNode(otherlv_10, grammarAccess.getEdgeAccess().getCommaKeyword_5_2_0());
    }
(
(
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getEdgeRule());
	        }
        }
		{ 
	        newCompositeNode(grammarAccess.getEdgeAccess().getSourceDiagramElementCrossReference_5_2_1_0()); 
	    }
		ruleFQN		{ 
	        afterParserOrEnumRuleCall();
	    }

)
))*)(	otherlv_12='target:' 
    {
    	newLeafNode(otherlv_12, grammarAccess.getEdgeAccess().getTargetKeyword_6_0());
    }
(
(
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getEdgeRule());
	        }
        }
		{ 
	        newCompositeNode(grammarAccess.getEdgeAccess().getTargetDiagramElementCrossReference_6_1_0()); 
	    }
		ruleFQN		{ 
	        afterParserOrEnumRuleCall();
	    }

)
)(	otherlv_14=',' 
    {
    	newLeafNode(otherlv_14, grammarAccess.getEdgeAccess().getCommaKeyword_6_2_0());
    }
(
(
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getEdgeRule());
	        }
        }
		{ 
	        newCompositeNode(grammarAccess.getEdgeAccess().getTargetDiagramElementCrossReference_6_2_1_0()); 
	    }
		ruleFQN		{ 
	        afterParserOrEnumRuleCall();
	    }

)
))*)(
(
		{ 
	        newCompositeNode(grammarAccess.getEdgeAccess().getE_descriptionEdgeDescriptionParserRuleCall_7_0()); 
	    }
		lv_e_description_16_0=ruleEdgeDescription		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getEdgeRule());
	        }
       		add(
       			$current, 
       			"e_description",
        		lv_e_description_16_0, 
        		"EdgeDescription");
	        afterParserOrEnumRuleCall();
	    }

)
)*	otherlv_17='}' 
    {
    	newLeafNode(otherlv_17, grammarAccess.getEdgeAccess().getRightCurlyBracketKeyword_8());
    }
)
;





// Entry rule entryRuleEdgeImport
entryRuleEdgeImport returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getEdgeImportRule()); }
	 iv_ruleEdgeImport=ruleEdgeImport 
	 { $current=$iv_ruleEdgeImport.current; } 
	 EOF 
;

// Rule EdgeImport
ruleEdgeImport returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
    {
        $current = forceCreateModelElement(
            grammarAccess.getEdgeImportAccess().getEdgeImportAction_0(),
            $current);
    }
)	otherlv_1='EdgeImport' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getEdgeImportAccess().getEdgeImportKeyword_1());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getEdgeImportAccess().getNameEStringParserRuleCall_2_0()); 
	    }
		lv_name_2_0=ruleEString		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getEdgeImportRule());
	        }
       		set(
       			$current, 
       			"name",
        		lv_name_2_0, 
        		"EString");
	        afterParserOrEnumRuleCall();
	    }

)
)	otherlv_3='{' 
    {
    	newLeafNode(otherlv_3, grammarAccess.getEdgeImportAccess().getLeftCurlyBracketKeyword_3());
    }
(	otherlv_4='import:' 
    {
    	newLeafNode(otherlv_4, grammarAccess.getEdgeImportAccess().getImportKeyword_4_0());
    }
(
(
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getEdgeImportRule());
	        }
        }
		{ 
	        newCompositeNode(grammarAccess.getEdgeImportAccess().getImportsEdgeMappingCrossReference_4_1_0()); 
	    }
		ruleFQN		{ 
	        afterParserOrEnumRuleCall();
	    }

)
))(
(
		{ 
	        newCompositeNode(grammarAccess.getEdgeImportAccess().getE_descriptionEdgeDescriptionParserRuleCall_5_0()); 
	    }
		lv_e_description_6_0=ruleEdgeDescription		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getEdgeImportRule());
	        }
       		add(
       			$current, 
       			"e_description",
        		lv_e_description_6_0, 
        		"EdgeDescription");
	        afterParserOrEnumRuleCall();
	    }

)
)*	otherlv_7='}' 
    {
    	newLeafNode(otherlv_7, grammarAccess.getEdgeImportAccess().getRightCurlyBracketKeyword_6());
    }
)
;





// Entry rule entryRuleEdgeDomainAssociation
entryRuleEdgeDomainAssociation returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getEdgeDomainAssociationRule()); }
	 iv_ruleEdgeDomainAssociation=ruleEdgeDomainAssociation 
	 { $current=$iv_ruleEdgeDomainAssociation.current; } 
	 EOF 
;

// Rule EdgeDomainAssociation
ruleEdgeDomainAssociation returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
    {
        $current = forceCreateModelElement(
            grammarAccess.getEdgeDomainAssociationAccess().getEdgeDomainAssociationAction_0(),
            $current);
    }
)((	otherlv_1='query:' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getEdgeDomainAssociationAccess().getQueryKeyword_1_0_0());
    }
(
(
		lv_target_query_2_0=RULE_STRING
		{
			newLeafNode(lv_target_query_2_0, grammarAccess.getEdgeDomainAssociationAccess().getTarget_querySTRINGTerminalRuleCall_1_0_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getEdgeDomainAssociationRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"target_query",
        		lv_target_query_2_0, 
        		"STRING");
	    }

)
))
    |(
(
		{ 
	        newCompositeNode(grammarAccess.getEdgeDomainAssociationAccess().getTarget_LocatorAbstractAssociation2ParserRuleCall_1_1_0()); 
	    }
		lv_target_Locator_3_0=ruleAbstractAssociation2		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getEdgeDomainAssociationRule());
	        }
       		set(
       			$current, 
       			"target_Locator",
        		lv_target_Locator_3_0, 
        		"AbstractAssociation2");
	        afterParserOrEnumRuleCall();
	    }

)
)))
;





// Entry rule entryRuleEdgeDomainElement
entryRuleEdgeDomainElement returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getEdgeDomainElementRule()); }
	 iv_ruleEdgeDomainElement=ruleEdgeDomainElement 
	 { $current=$iv_ruleEdgeDomainElement.current; } 
	 EOF 
;

// Rule EdgeDomainElement
ruleEdgeDomainElement returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
    {
        $current = forceCreateModelElement(
            grammarAccess.getEdgeDomainElementAccess().getEdgeDomainElementAction_0(),
            $current);
    }
)(
(
		{ 
	        newCompositeNode(grammarAccess.getEdgeDomainElementAccess().getThe_DomainAbstractClassParserRuleCall_1_0()); 
	    }
		lv_the_Domain_1_0=ruleAbstractClass		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getEdgeDomainElementRule());
	        }
       		set(
       			$current, 
       			"the_Domain",
        		lv_the_Domain_1_0, 
        		"AbstractClass");
	        afterParserOrEnumRuleCall();
	    }

)
)((	otherlv_2='target-query:' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getEdgeDomainElementAccess().getTargetQueryKeyword_2_0_0());
    }
(
(
		lv_target_query_3_0=RULE_STRING
		{
			newLeafNode(lv_target_query_3_0, grammarAccess.getEdgeDomainElementAccess().getTarget_querySTRINGTerminalRuleCall_2_0_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getEdgeDomainElementRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"target_query",
        		lv_target_query_3_0, 
        		"STRING");
	    }

)
))
    |(	otherlv_4='target-association:' 
    {
    	newLeafNode(otherlv_4, grammarAccess.getEdgeDomainElementAccess().getTargetAssociationKeyword_2_1_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getEdgeDomainElementAccess().getTarget_LocatorAbstractAssociation2ParserRuleCall_2_1_1_0()); 
	    }
		lv_target_Locator_5_0=ruleAbstractAssociation2		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getEdgeDomainElementRule());
	        }
       		set(
       			$current, 
       			"target_Locator",
        		lv_target_Locator_5_0, 
        		"AbstractAssociation2");
	        afterParserOrEnumRuleCall();
	    }

)
)))((	otherlv_6='source-query:' 
    {
    	newLeafNode(otherlv_6, grammarAccess.getEdgeDomainElementAccess().getSourceQueryKeyword_3_0_0());
    }
(
(
		lv_source_query_7_0=RULE_STRING
		{
			newLeafNode(lv_source_query_7_0, grammarAccess.getEdgeDomainElementAccess().getSource_querySTRINGTerminalRuleCall_3_0_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getEdgeDomainElementRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"source_query",
        		lv_source_query_7_0, 
        		"STRING");
	    }

)
))
    |(	otherlv_8='source-association:' 
    {
    	newLeafNode(otherlv_8, grammarAccess.getEdgeDomainElementAccess().getSourceAssociationKeyword_3_1_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getEdgeDomainElementAccess().getSource_LocatorAbstractAssociation2ParserRuleCall_3_1_1_0()); 
	    }
		lv_source_Locator_9_0=ruleAbstractAssociation2		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getEdgeDomainElementRule());
	        }
       		set(
       			$current, 
       			"source_Locator",
        		lv_source_Locator_9_0, 
        		"AbstractAssociation2");
	        afterParserOrEnumRuleCall();
	    }

)
))))
;





// Entry rule entryRuleAbstractClass
entryRuleAbstractClass returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getAbstractClassRule()); }
	 iv_ruleAbstractClass=ruleAbstractClass 
	 { $current=$iv_ruleAbstractClass.current; } 
	 EOF 
;

// Rule AbstractClass
ruleAbstractClass returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
    { 
        newCompositeNode(grammarAccess.getAbstractClassAccess().getLocalClass2ParserRuleCall_0()); 
    }
    this_LocalClass2_0=ruleLocalClass2
    { 
        $current = $this_LocalClass2_0.current; 
        afterParserOrEnumRuleCall();
    }

    |
    { 
        newCompositeNode(grammarAccess.getAbstractClassAccess().getExternalClassParserRuleCall_1()); 
    }
    this_ExternalClass_1=ruleExternalClass
    { 
        $current = $this_ExternalClass_1.current; 
        afterParserOrEnumRuleCall();
    }
)
;





// Entry rule entryRuleLocalClass2
entryRuleLocalClass2 returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getLocalClass2Rule()); }
	 iv_ruleLocalClass2=ruleLocalClass2 
	 { $current=$iv_ruleLocalClass2.current; } 
	 EOF 
;

// Rule LocalClass2
ruleLocalClass2 returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
    {
        $current = forceCreateModelElement(
            grammarAccess.getLocalClass2Access().getLocalClassAction_0(),
            $current);
    }
)(
(
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getLocalClass2Rule());
	        }
        }
		{ 
	        newCompositeNode(grammarAccess.getLocalClass2Access().getClassClassCrossReference_1_0()); 
	    }
		ruleFQN		{ 
	        afterParserOrEnumRuleCall();
	    }

)
))
;





// Entry rule entryRuleExternalClass
entryRuleExternalClass returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getExternalClassRule()); }
	 iv_ruleExternalClass=ruleExternalClass 
	 { $current=$iv_ruleExternalClass.current; } 
	 EOF 
;

// Rule ExternalClass
ruleExternalClass returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
    {
        $current = forceCreateModelElement(
            grammarAccess.getExternalClassAccess().getExternalClassAction_0(),
            $current);
    }
)	otherlv_1='external' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getExternalClassAccess().getExternalKeyword_1());
    }
(
(
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getExternalClassRule());
	        }
        }
		{ 
	        newCompositeNode(grammarAccess.getExternalClassAccess().getClassEClassCrossReference_2_0()); 
	    }
		ruleFQN		{ 
	        afterParserOrEnumRuleCall();
	    }

)
))
;





// Entry rule entryRuleAbstractAssociation2
entryRuleAbstractAssociation2 returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getAbstractAssociation2Rule()); }
	 iv_ruleAbstractAssociation2=ruleAbstractAssociation2 
	 { $current=$iv_ruleAbstractAssociation2.current; } 
	 EOF 
;

// Rule AbstractAssociation2
ruleAbstractAssociation2 returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
    { 
        newCompositeNode(grammarAccess.getAbstractAssociation2Access().getExternalAssociationParserRuleCall_0()); 
    }
    this_ExternalAssociation_0=ruleExternalAssociation
    { 
        $current = $this_ExternalAssociation_0.current; 
        afterParserOrEnumRuleCall();
    }

    |
    { 
        newCompositeNode(grammarAccess.getAbstractAssociation2Access().getLocalAssociationParserRuleCall_1()); 
    }
    this_LocalAssociation_1=ruleLocalAssociation
    { 
        $current = $this_LocalAssociation_1.current; 
        afterParserOrEnumRuleCall();
    }
)
;





// Entry rule entryRuleLocalAssociation
entryRuleLocalAssociation returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getLocalAssociationRule()); }
	 iv_ruleLocalAssociation=ruleLocalAssociation 
	 { $current=$iv_ruleLocalAssociation.current; } 
	 EOF 
;

// Rule LocalAssociation
ruleLocalAssociation returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
    {
        $current = forceCreateModelElement(
            grammarAccess.getLocalAssociationAccess().getLocalAssociationAction_0(),
            $current);
    }
)(
(
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getLocalAssociationRule());
	        }
        }
		{ 
	        newCompositeNode(grammarAccess.getLocalAssociationAccess().getReferenceAbstractAssociationCrossReference_1_0()); 
	    }
		ruleFQN		{ 
	        afterParserOrEnumRuleCall();
	    }

)
))
;





// Entry rule entryRuleExternalAssociation
entryRuleExternalAssociation returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getExternalAssociationRule()); }
	 iv_ruleExternalAssociation=ruleExternalAssociation 
	 { $current=$iv_ruleExternalAssociation.current; } 
	 EOF 
;

// Rule ExternalAssociation
ruleExternalAssociation returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
    {
        $current = forceCreateModelElement(
            grammarAccess.getExternalAssociationAccess().getExternalAssociationAction_0(),
            $current);
    }
)	otherlv_1='external' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getExternalAssociationAccess().getExternalKeyword_1());
    }
(
(
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getExternalAssociationRule());
	        }
        }
		{ 
	        newCompositeNode(grammarAccess.getExternalAssociationAccess().getReferenceEReferenceCrossReference_2_0()); 
	    }
		ruleFQN		{ 
	        afterParserOrEnumRuleCall();
	    }

)
))
;







// Entry rule entryRuleLocalAttribute
entryRuleLocalAttribute returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getLocalAttributeRule()); }
	 iv_ruleLocalAttribute=ruleLocalAttribute 
	 { $current=$iv_ruleLocalAttribute.current; } 
	 EOF 
;

// Rule LocalAttribute
ruleLocalAttribute returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
    {
        $current = forceCreateModelElement(
            grammarAccess.getLocalAttributeAccess().getLocalAttributeAction_0(),
            $current);
    }
)(
(
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getLocalAttributeRule());
	        }
        }
		{ 
	        newCompositeNode(grammarAccess.getLocalAttributeAccess().getAttributeAttributeCrossReference_1_0()); 
	    }
		ruleFQN		{ 
	        afterParserOrEnumRuleCall();
	    }

)
))
;





// Entry rule entryRuleExternalAttribute
entryRuleExternalAttribute returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getExternalAttributeRule()); }
	 iv_ruleExternalAttribute=ruleExternalAttribute 
	 { $current=$iv_ruleExternalAttribute.current; } 
	 EOF 
;

// Rule ExternalAttribute
ruleExternalAttribute returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
    {
        $current = forceCreateModelElement(
            grammarAccess.getExternalAttributeAccess().getExternalAttributeAction_0(),
            $current);
    }
)	otherlv_1='external' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getExternalAttributeAccess().getExternalKeyword_1());
    }
(
(
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getExternalAttributeRule());
	        }
        }
		{ 
	        newCompositeNode(grammarAccess.getExternalAttributeAccess().getAttributeEAttributeCrossReference_2_0()); 
	    }
		ruleFQN		{ 
	        afterParserOrEnumRuleCall();
	    }

)
))
;





// Entry rule entryRuleExpression
entryRuleExpression returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getExpressionRule()); }
	 iv_ruleExpression=ruleExpression 
	 { $current=$iv_ruleExpression.current; } 
	 EOF 
;

// Rule Expression
ruleExpression returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
    {
        $current = forceCreateModelElement(
            grammarAccess.getExpressionAccess().getExpressionAction_0(),
            $current);
    }
)((
(
		{ 
	        newCompositeNode(grammarAccess.getExpressionAccess().getExpressionElementsExpressionElementParserRuleCall_1_0_0()); 
	    }
		lv_expressionElements_1_0=ruleExpressionElement		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getExpressionRule());
	        }
       		add(
       			$current, 
       			"expressionElements",
        		lv_expressionElements_1_0, 
        		"ExpressionElement");
	        afterParserOrEnumRuleCall();
	    }

)
)(	otherlv_2='+' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getExpressionAccess().getPlusSignKeyword_1_1_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getExpressionAccess().getExpressionElementsExpressionElementParserRuleCall_1_1_1_0()); 
	    }
		lv_expressionElements_3_0=ruleExpressionElement		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getExpressionRule());
	        }
       		add(
       			$current, 
       			"expressionElements",
        		lv_expressionElements_3_0, 
        		"ExpressionElement");
	        afterParserOrEnumRuleCall();
	    }

)
))*)?)
;





// Entry rule entryRuleExpressionElement
entryRuleExpressionElement returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getExpressionElementRule()); }
	 iv_ruleExpressionElement=ruleExpressionElement 
	 { $current=$iv_ruleExpressionElement.current; } 
	 EOF 
;

// Rule ExpressionElement
ruleExpressionElement returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
    { 
        newCompositeNode(grammarAccess.getExpressionElementAccess().getForeignExpressionElementParserRuleCall_0()); 
    }
    this_ForeignExpressionElement_0=ruleForeignExpressionElement
    { 
        $current = $this_ForeignExpressionElement_0.current; 
        afterParserOrEnumRuleCall();
    }

    |
    { 
        newCompositeNode(grammarAccess.getExpressionElementAccess().getStringElementParserRuleCall_1()); 
    }
    this_StringElement_1=ruleStringElement
    { 
        $current = $this_StringElement_1.current; 
        afterParserOrEnumRuleCall();
    }
)
;





// Entry rule entryRuleForeignExpressionElement
entryRuleForeignExpressionElement returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getForeignExpressionElementRule()); }
	 iv_ruleForeignExpressionElement=ruleForeignExpressionElement 
	 { $current=$iv_ruleForeignExpressionElement.current; } 
	 EOF 
;

// Rule ForeignExpressionElement
ruleForeignExpressionElement returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
    { 
        newCompositeNode(grammarAccess.getForeignExpressionElementAccess().getJavaElementParserRuleCall_0()); 
    }
    this_JavaElement_0=ruleJavaElement
    { 
        $current = $this_JavaElement_0.current; 
        afterParserOrEnumRuleCall();
    }

    |
    { 
        newCompositeNode(grammarAccess.getForeignExpressionElementAccess().getDomainElementParserRuleCall_1()); 
    }
    this_DomainElement_1=ruleDomainElement
    { 
        $current = $this_DomainElement_1.current; 
        afterParserOrEnumRuleCall();
    }
)
;





// Entry rule entryRuleJavaElement
entryRuleJavaElement returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getJavaElementRule()); }
	 iv_ruleJavaElement=ruleJavaElement 
	 { $current=$iv_ruleJavaElement.current; } 
	 EOF 
;

// Rule JavaElement
ruleJavaElement returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
    {
        $current = forceCreateModelElement(
            grammarAccess.getJavaElementAccess().getJavaElementAction_0(),
            $current);
    }
)	otherlv_1='Java' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getJavaElementAccess().getJavaKeyword_1());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getJavaElementAccess().getMethodFQNParserRuleCall_2_0()); 
	    }
		lv_method_2_0=ruleFQN		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getJavaElementRule());
	        }
       		set(
       			$current, 
       			"method",
        		lv_method_2_0, 
        		"FQN");
	        afterParserOrEnumRuleCall();
	    }

)
))
;





// Entry rule entryRuleDomainElement
entryRuleDomainElement returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getDomainElementRule()); }
	 iv_ruleDomainElement=ruleDomainElement 
	 { $current=$iv_ruleDomainElement.current; } 
	 EOF 
;

// Rule DomainElement
ruleDomainElement returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
    {
        $current = forceCreateModelElement(
            grammarAccess.getDomainElementAccess().getDomainElementAction_0(),
            $current);
    }
)(
(
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getDomainElementRule());
	        }
        }
		{ 
	        newCompositeNode(grammarAccess.getDomainElementAccess().getAttributeAttributeCrossReference_1_0()); 
	    }
		ruleFQN		{ 
	        afterParserOrEnumRuleCall();
	    }

)
))
;





// Entry rule entryRuleStringElement
entryRuleStringElement returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getStringElementRule()); }
	 iv_ruleStringElement=ruleStringElement 
	 { $current=$iv_ruleStringElement.current; } 
	 EOF 
;

// Rule StringElement
ruleStringElement returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
    {
        $current = forceCreateModelElement(
            grammarAccess.getStringElementAccess().getStringElementAction_0(),
            $current);
    }
)(
(
		lv_value_1_0=RULE_STRING
		{
			newLeafNode(lv_value_1_0, grammarAccess.getStringElementAccess().getValueSTRINGTerminalRuleCall_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getStringElementRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"value",
        		lv_value_1_0, 
        		"STRING");
	    }

)
))
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







// Entry rule entryRuleEInt
entryRuleEInt returns [String current=null] 
	:
	{ newCompositeNode(grammarAccess.getEIntRule()); } 
	 iv_ruleEInt=ruleEInt 
	 { $current=$iv_ruleEInt.current.getText(); }  
	 EOF 
;

// Rule EInt
ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
    this_INT_0=RULE_INT    {
		$current.merge(this_INT_0);
    }

    { 
    newLeafNode(this_INT_0, grammarAccess.getEIntAccess().getINTTerminalRuleCall()); 
    }

    ;





// Rule Node_Form
ruleNode_Form returns [Enumerator current=null] 
    @init { enterRule(); }
    @after { leaveRule(); }:
((	enumLiteral_0='Square' 
	{
        $current = grammarAccess.getNode_FormAccess().getSquareEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
        newLeafNode(enumLiteral_0, grammarAccess.getNode_FormAccess().getSquareEnumLiteralDeclaration_0()); 
    }
)
    |(	enumLiteral_1='Lozenge' 
	{
        $current = grammarAccess.getNode_FormAccess().getLozengeEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
        newLeafNode(enumLiteral_1, grammarAccess.getNode_FormAccess().getLozengeEnumLiteralDeclaration_1()); 
    }
)
    |(	enumLiteral_2='Eclipse' 
	{
        $current = grammarAccess.getNode_FormAccess().getEclipseEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
        newLeafNode(enumLiteral_2, grammarAccess.getNode_FormAccess().getEclipseEnumLiteralDeclaration_2()); 
    }
)
    |(	enumLiteral_3='Note' 
	{
        $current = grammarAccess.getNode_FormAccess().getNoteEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
        newLeafNode(enumLiteral_3, grammarAccess.getNode_FormAccess().getNoteEnumLiteralDeclaration_3()); 
    }
)
    |(	enumLiteral_4='Dot' 
	{
        $current = grammarAccess.getNode_FormAccess().getDotEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
        newLeafNode(enumLiteral_4, grammarAccess.getNode_FormAccess().getDotEnumLiteralDeclaration_4()); 
    }
)
    |(	enumLiteral_5='Triangle' 
	{
        $current = grammarAccess.getNode_FormAccess().getTriangleEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
        newLeafNode(enumLiteral_5, grammarAccess.getNode_FormAccess().getTriangleEnumLiteralDeclaration_5()); 
    }
)
    |(	enumLiteral_6='Stroke' 
	{
        $current = grammarAccess.getNode_FormAccess().getStrokeEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
        newLeafNode(enumLiteral_6, grammarAccess.getNode_FormAccess().getStrokeEnumLiteralDeclaration_6()); 
    }
)
    |(	enumLiteral_7='Ring' 
	{
        $current = grammarAccess.getNode_FormAccess().getRingEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
        newLeafNode(enumLiteral_7, grammarAccess.getNode_FormAccess().getRingEnumLiteralDeclaration_7()); 
    }
));



// Rule BackgroundStyle
ruleBackgroundStyle returns [Enumerator current=null] 
    @init { enterRule(); }
    @after { leaveRule(); }:
((	enumLiteral_0='GradientLeftToRight' 
	{
        $current = grammarAccess.getBackgroundStyleAccess().getGradientLeftToRightEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
        newLeafNode(enumLiteral_0, grammarAccess.getBackgroundStyleAccess().getGradientLeftToRightEnumLiteralDeclaration_0()); 
    }
)
    |(	enumLiteral_1='Liquid' 
	{
        $current = grammarAccess.getBackgroundStyleAccess().getLiquidEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
        newLeafNode(enumLiteral_1, grammarAccess.getBackgroundStyleAccess().getLiquidEnumLiteralDeclaration_1()); 
    }
)
    |(	enumLiteral_2='GradientTopToBottom' 
	{
        $current = grammarAccess.getBackgroundStyleAccess().getGradientTopToBottomEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
        newLeafNode(enumLiteral_2, grammarAccess.getBackgroundStyleAccess().getGradientTopToBottomEnumLiteralDeclaration_2()); 
    }
));



// Rule LabelPosition
ruleLabelPosition returns [Enumerator current=null] 
    @init { enterRule(); }
    @after { leaveRule(); }:
((	enumLiteral_0='border' 
	{
        $current = grammarAccess.getLabelPositionAccess().getBorderEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
        newLeafNode(enumLiteral_0, grammarAccess.getLabelPositionAccess().getBorderEnumLiteralDeclaration_0()); 
    }
)
    |(	enumLiteral_1='node' 
	{
        $current = grammarAccess.getLabelPositionAccess().getNodeEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
        newLeafNode(enumLiteral_1, grammarAccess.getLabelPositionAccess().getNodeEnumLiteralDeclaration_1()); 
    }
));



// Rule LabelAlignment
ruleLabelAlignment returns [Enumerator current=null] 
    @init { enterRule(); }
    @after { leaveRule(); }:
((	enumLiteral_0='center' 
	{
        $current = grammarAccess.getLabelAlignmentAccess().getCENTEREnumLiteralDeclaration_0().getEnumLiteral().getInstance();
        newLeafNode(enumLiteral_0, grammarAccess.getLabelAlignmentAccess().getCENTEREnumLiteralDeclaration_0()); 
    }
)
    |(	enumLiteral_1='left' 
	{
        $current = grammarAccess.getLabelAlignmentAccess().getLEFTEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
        newLeafNode(enumLiteral_1, grammarAccess.getLabelAlignmentAccess().getLEFTEnumLiteralDeclaration_1()); 
    }
)
    |(	enumLiteral_2='right' 
	{
        $current = grammarAccess.getLabelAlignmentAccess().getRIGHTEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
        newLeafNode(enumLiteral_2, grammarAccess.getLabelAlignmentAccess().getRIGHTEnumLiteralDeclaration_2()); 
    }
));



// Rule LineStyle
ruleLineStyle returns [Enumerator current=null] 
    @init { enterRule(); }
    @after { leaveRule(); }:
((	enumLiteral_0='solid' 
	{
        $current = grammarAccess.getLineStyleAccess().getSolidEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
        newLeafNode(enumLiteral_0, grammarAccess.getLineStyleAccess().getSolidEnumLiteralDeclaration_0()); 
    }
)
    |(	enumLiteral_1='dash' 
	{
        $current = grammarAccess.getLineStyleAccess().getDashEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
        newLeafNode(enumLiteral_1, grammarAccess.getLineStyleAccess().getDashEnumLiteralDeclaration_1()); 
    }
)
    |(	enumLiteral_2='dot' 
	{
        $current = grammarAccess.getLineStyleAccess().getDotEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
        newLeafNode(enumLiteral_2, grammarAccess.getLineStyleAccess().getDotEnumLiteralDeclaration_2()); 
    }
)
    |(	enumLiteral_3='dash_dot' 
	{
        $current = grammarAccess.getLineStyleAccess().getDash_dotEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
        newLeafNode(enumLiteral_3, grammarAccess.getLineStyleAccess().getDash_dotEnumLiteralDeclaration_3()); 
    }
));



// Rule EdgeArrows
ruleEdgeArrows returns [Enumerator current=null] 
    @init { enterRule(); }
    @after { leaveRule(); }:
((	enumLiteral_0='NoDecoration' 
	{
        $current = grammarAccess.getEdgeArrowsAccess().getNoDecorationEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
        newLeafNode(enumLiteral_0, grammarAccess.getEdgeArrowsAccess().getNoDecorationEnumLiteralDeclaration_0()); 
    }
)
    |(	enumLiteral_1='OutputArrow' 
	{
        $current = grammarAccess.getEdgeArrowsAccess().getOutputArrowEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
        newLeafNode(enumLiteral_1, grammarAccess.getEdgeArrowsAccess().getOutputArrowEnumLiteralDeclaration_1()); 
    }
)
    |(	enumLiteral_2='InputArrow' 
	{
        $current = grammarAccess.getEdgeArrowsAccess().getInputArrowEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
        newLeafNode(enumLiteral_2, grammarAccess.getEdgeArrowsAccess().getInputArrowEnumLiteralDeclaration_2()); 
    }
)
    |(	enumLiteral_3='OutputClosedArrow' 
	{
        $current = grammarAccess.getEdgeArrowsAccess().getOutputClosedArrowEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
        newLeafNode(enumLiteral_3, grammarAccess.getEdgeArrowsAccess().getOutputClosedArrowEnumLiteralDeclaration_3()); 
    }
)
    |(	enumLiteral_4='InputClosedArrow' 
	{
        $current = grammarAccess.getEdgeArrowsAccess().getInputClosedArrowEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
        newLeafNode(enumLiteral_4, grammarAccess.getEdgeArrowsAccess().getInputClosedArrowEnumLiteralDeclaration_4()); 
    }
)
    |(	enumLiteral_5='OutputFillClosedArrow' 
	{
        $current = grammarAccess.getEdgeArrowsAccess().getOutputFillClosedArrowEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
        newLeafNode(enumLiteral_5, grammarAccess.getEdgeArrowsAccess().getOutputFillClosedArrowEnumLiteralDeclaration_5()); 
    }
)
    |(	enumLiteral_6='InputFillClosedArrow' 
	{
        $current = grammarAccess.getEdgeArrowsAccess().getInputFillClosedArrowEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
        newLeafNode(enumLiteral_6, grammarAccess.getEdgeArrowsAccess().getInputFillClosedArrowEnumLiteralDeclaration_6()); 
    }
)
    |(	enumLiteral_7='Diamond' 
	{
        $current = grammarAccess.getEdgeArrowsAccess().getDiamondEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
        newLeafNode(enumLiteral_7, grammarAccess.getEdgeArrowsAccess().getDiamondEnumLiteralDeclaration_7()); 
    }
)
    |(	enumLiteral_8='FillDiamond' 
	{
        $current = grammarAccess.getEdgeArrowsAccess().getFillDiamondEnumLiteralDeclaration_8().getEnumLiteral().getInstance();
        newLeafNode(enumLiteral_8, grammarAccess.getEdgeArrowsAccess().getFillDiamondEnumLiteralDeclaration_8()); 
    }
)
    |(	enumLiteral_9='InputArrowWithDiamond' 
	{
        $current = grammarAccess.getEdgeArrowsAccess().getInputArrowWithDiamondEnumLiteralDeclaration_9().getEnumLiteral().getInstance();
        newLeafNode(enumLiteral_9, grammarAccess.getEdgeArrowsAccess().getInputArrowWithDiamondEnumLiteralDeclaration_9()); 
    }
)
    |(	enumLiteral_10='InputArrowWothFillDiamond' 
	{
        $current = grammarAccess.getEdgeArrowsAccess().getInputArrowWithFillDiamondEnumLiteralDeclaration_10().getEnumLiteral().getInstance();
        newLeafNode(enumLiteral_10, grammarAccess.getEdgeArrowsAccess().getInputArrowWithFillDiamondEnumLiteralDeclaration_10()); 
    }
));



// Rule SystemColors
ruleSystemColors returns [Enumerator current=null] 
    @init { enterRule(); }
    @after { leaveRule(); }:
((	enumLiteral_0='black' 
	{
        $current = grammarAccess.getSystemColorsAccess().getBlackEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
        newLeafNode(enumLiteral_0, grammarAccess.getSystemColorsAccess().getBlackEnumLiteralDeclaration_0()); 
    }
)
    |(	enumLiteral_1='blue' 
	{
        $current = grammarAccess.getSystemColorsAccess().getBlueEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
        newLeafNode(enumLiteral_1, grammarAccess.getSystemColorsAccess().getBlueEnumLiteralDeclaration_1()); 
    }
)
    |(	enumLiteral_2='red' 
	{
        $current = grammarAccess.getSystemColorsAccess().getRedEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
        newLeafNode(enumLiteral_2, grammarAccess.getSystemColorsAccess().getRedEnumLiteralDeclaration_2()); 
    }
)
    |(	enumLiteral_3='green' 
	{
        $current = grammarAccess.getSystemColorsAccess().getGreenEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
        newLeafNode(enumLiteral_3, grammarAccess.getSystemColorsAccess().getGreenEnumLiteralDeclaration_3()); 
    }
)
    |(	enumLiteral_4='yellow' 
	{
        $current = grammarAccess.getSystemColorsAccess().getYellowEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
        newLeafNode(enumLiteral_4, grammarAccess.getSystemColorsAccess().getYellowEnumLiteralDeclaration_4()); 
    }
)
    |(	enumLiteral_5='purple' 
	{
        $current = grammarAccess.getSystemColorsAccess().getPurpleEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
        newLeafNode(enumLiteral_5, grammarAccess.getSystemColorsAccess().getPurpleEnumLiteralDeclaration_5()); 
    }
)
    |(	enumLiteral_6='orange' 
	{
        $current = grammarAccess.getSystemColorsAccess().getOrangeEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
        newLeafNode(enumLiteral_6, grammarAccess.getSystemColorsAccess().getOrangeEnumLiteralDeclaration_6()); 
    }
)
    |(	enumLiteral_7='chocolate' 
	{
        $current = grammarAccess.getSystemColorsAccess().getChocolateEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
        newLeafNode(enumLiteral_7, grammarAccess.getSystemColorsAccess().getChocolateEnumLiteralDeclaration_7()); 
    }
)
    |(	enumLiteral_8='gray' 
	{
        $current = grammarAccess.getSystemColorsAccess().getGrayEnumLiteralDeclaration_8().getEnumLiteral().getInstance();
        newLeafNode(enumLiteral_8, grammarAccess.getSystemColorsAccess().getGrayEnumLiteralDeclaration_8()); 
    }
)
    |(	enumLiteral_9='white' 
	{
        $current = grammarAccess.getSystemColorsAccess().getWhiteEnumLiteralDeclaration_9().getEnumLiteral().getInstance();
        newLeafNode(enumLiteral_9, grammarAccess.getSystemColorsAccess().getWhiteEnumLiteralDeclaration_9()); 
    }
)
    |(	enumLiteral_10='dark_blue' 
	{
        $current = grammarAccess.getSystemColorsAccess().getDark_blueEnumLiteralDeclaration_10().getEnumLiteral().getInstance();
        newLeafNode(enumLiteral_10, grammarAccess.getSystemColorsAccess().getDark_blueEnumLiteralDeclaration_10()); 
    }
)
    |(	enumLiteral_11='dark_red' 
	{
        $current = grammarAccess.getSystemColorsAccess().getDark_redEnumLiteralDeclaration_11().getEnumLiteral().getInstance();
        newLeafNode(enumLiteral_11, grammarAccess.getSystemColorsAccess().getDark_redEnumLiteralDeclaration_11()); 
    }
)
    |(	enumLiteral_12='dark_green' 
	{
        $current = grammarAccess.getSystemColorsAccess().getDark_greenEnumLiteralDeclaration_12().getEnumLiteral().getInstance();
        newLeafNode(enumLiteral_12, grammarAccess.getSystemColorsAccess().getDark_greenEnumLiteralDeclaration_12()); 
    }
)
    |(	enumLiteral_13='dark_yellow' 
	{
        $current = grammarAccess.getSystemColorsAccess().getDark_yellowEnumLiteralDeclaration_13().getEnumLiteral().getInstance();
        newLeafNode(enumLiteral_13, grammarAccess.getSystemColorsAccess().getDark_yellowEnumLiteralDeclaration_13()); 
    }
)
    |(	enumLiteral_14='dark_purple' 
	{
        $current = grammarAccess.getSystemColorsAccess().getDark_purpleEnumLiteralDeclaration_14().getEnumLiteral().getInstance();
        newLeafNode(enumLiteral_14, grammarAccess.getSystemColorsAccess().getDark_purpleEnumLiteralDeclaration_14()); 
    }
)
    |(	enumLiteral_15='dark_orange' 
	{
        $current = grammarAccess.getSystemColorsAccess().getDark_orangeEnumLiteralDeclaration_15().getEnumLiteral().getInstance();
        newLeafNode(enumLiteral_15, grammarAccess.getSystemColorsAccess().getDark_orangeEnumLiteralDeclaration_15()); 
    }
)
    |(	enumLiteral_16='dark_chocolate' 
	{
        $current = grammarAccess.getSystemColorsAccess().getDark_chocolateEnumLiteralDeclaration_16().getEnumLiteral().getInstance();
        newLeafNode(enumLiteral_16, grammarAccess.getSystemColorsAccess().getDark_chocolateEnumLiteralDeclaration_16()); 
    }
)
    |(	enumLiteral_17='dark_gray' 
	{
        $current = grammarAccess.getSystemColorsAccess().getDark_grayEnumLiteralDeclaration_17().getEnumLiteral().getInstance();
        newLeafNode(enumLiteral_17, grammarAccess.getSystemColorsAccess().getDark_grayEnumLiteralDeclaration_17()); 
    }
)
    |(	enumLiteral_18='light_blue' 
	{
        $current = grammarAccess.getSystemColorsAccess().getLight_blueEnumLiteralDeclaration_18().getEnumLiteral().getInstance();
        newLeafNode(enumLiteral_18, grammarAccess.getSystemColorsAccess().getLight_blueEnumLiteralDeclaration_18()); 
    }
)
    |(	enumLiteral_19='light_red' 
	{
        $current = grammarAccess.getSystemColorsAccess().getLight_redEnumLiteralDeclaration_19().getEnumLiteral().getInstance();
        newLeafNode(enumLiteral_19, grammarAccess.getSystemColorsAccess().getLight_redEnumLiteralDeclaration_19()); 
    }
)
    |(	enumLiteral_20='light_green' 
	{
        $current = grammarAccess.getSystemColorsAccess().getLight_greenEnumLiteralDeclaration_20().getEnumLiteral().getInstance();
        newLeafNode(enumLiteral_20, grammarAccess.getSystemColorsAccess().getLight_greenEnumLiteralDeclaration_20()); 
    }
)
    |(	enumLiteral_21='light_yellow' 
	{
        $current = grammarAccess.getSystemColorsAccess().getLight_yellowEnumLiteralDeclaration_21().getEnumLiteral().getInstance();
        newLeafNode(enumLiteral_21, grammarAccess.getSystemColorsAccess().getLight_yellowEnumLiteralDeclaration_21()); 
    }
)
    |(	enumLiteral_22='light_purple' 
	{
        $current = grammarAccess.getSystemColorsAccess().getLight_purpleEnumLiteralDeclaration_22().getEnumLiteral().getInstance();
        newLeafNode(enumLiteral_22, grammarAccess.getSystemColorsAccess().getLight_purpleEnumLiteralDeclaration_22()); 
    }
)
    |(	enumLiteral_23='light_orange' 
	{
        $current = grammarAccess.getSystemColorsAccess().getLight_orangeEnumLiteralDeclaration_23().getEnumLiteral().getInstance();
        newLeafNode(enumLiteral_23, grammarAccess.getSystemColorsAccess().getLight_orangeEnumLiteralDeclaration_23()); 
    }
)
    |(	enumLiteral_24='light_chocolate' 
	{
        $current = grammarAccess.getSystemColorsAccess().getLight_chocolateEnumLiteralDeclaration_24().getEnumLiteral().getInstance();
        newLeafNode(enumLiteral_24, grammarAccess.getSystemColorsAccess().getLight_chocolateEnumLiteralDeclaration_24()); 
    }
)
    |(	enumLiteral_25='light_gray' 
	{
        $current = grammarAccess.getSystemColorsAccess().getLight_grayEnumLiteralDeclaration_25().getEnumLiteral().getInstance();
        newLeafNode(enumLiteral_25, grammarAccess.getSystemColorsAccess().getLight_grayEnumLiteralDeclaration_25()); 
    }
));



// Rule ContainerLayout
ruleContainerLayout returns [Enumerator current=null] 
    @init { enterRule(); }
    @after { leaveRule(); }:
((	enumLiteral_0='FreeForm' 
	{
        $current = grammarAccess.getContainerLayoutAccess().getFreeFormEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
        newLeafNode(enumLiteral_0, grammarAccess.getContainerLayoutAccess().getFreeFormEnumLiteralDeclaration_0()); 
    }
)
    |(	enumLiteral_1='List' 
	{
        $current = grammarAccess.getContainerLayoutAccess().getListEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
        newLeafNode(enumLiteral_1, grammarAccess.getContainerLayoutAccess().getListEnumLiteralDeclaration_1()); 
    }
));



RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;



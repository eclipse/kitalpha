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
grammar InternalData;

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
import org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.DataGrammarAccess;

}

@parser::members {

 	private DataGrammarAccess grammarAccess;
 	
    public InternalDataParser(TokenStream input, DataGrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }
    
    @Override
    protected String getFirstRuleName() {
    	return "DataSpec";	
   	}
   	
   	@Override
   	protected DataGrammarAccess getGrammarAccess() {
   		return grammarAccess;
   	}
}

@rulecatch { 
    catch (RecognitionException re) { 
        recover(input,re); 
        appendSkippedTokens();
    } 
}




// Entry rule entryRuleDataSpec
entryRuleDataSpec returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getDataSpecRule()); }
	 iv_ruleDataSpec=ruleDataSpec 
	 { $current=$iv_ruleDataSpec.current; } 
	 EOF 
;

// Rule DataSpec
ruleDataSpec returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
    {
        $current = forceCreateModelElement(
            grammarAccess.getDataSpecAccess().getDataSpecAction_0(),
            $current);
    }
)(
(
		{ 
	        newCompositeNode(grammarAccess.getDataSpecAccess().getImportsImportParserRuleCall_1_0()); 
	    }
		lv_imports_1_0=ruleImport		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getDataSpecRule());
	        }
       		add(
       			$current, 
       			"imports",
        		lv_imports_1_0, 
        		"org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.Data.Import");
	        afterParserOrEnumRuleCall();
	    }

)
)*(
(
		{ 
	        newCompositeNode(grammarAccess.getDataSpecAccess().getDataDataParserRuleCall_2_0()); 
	    }
		lv_data_2_0=ruleData		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getDataSpecRule());
	        }
       		set(
       			$current, 
       			"data",
        		lv_data_2_0, 
        		"org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.Data.Data");
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
        newCompositeNode(grammarAccess.getAbstractImportAccess().getImportNamespaceParserRuleCall_0()); 
    }
    this_ImportNamespace_0=ruleImportNamespace
    { 
        $current = $this_ImportNamespace_0.current; 
        afterParserOrEnumRuleCall();
    }

    |
    { 
        newCompositeNode(grammarAccess.getAbstractImportAccess().getImportURIParserRuleCall_1()); 
    }
    this_ImportURI_1=ruleImportURI
    { 
        $current = $this_ImportURI_1.current; 
        afterParserOrEnumRuleCall();
    }
)
;





// Entry rule entryRuleImportNamespace
entryRuleImportNamespace returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getImportNamespaceRule()); }
	 iv_ruleImportNamespace=ruleImportNamespace 
	 { $current=$iv_ruleImportNamespace.current; } 
	 EOF 
;

// Rule ImportNamespace
ruleImportNamespace returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
(
		{ 
	        newCompositeNode(grammarAccess.getImportNamespaceAccess().getImportedNamespaceFQNParserRuleCall_0()); 
	    }
		lv_importedNamespace_0_0=ruleFQN		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getImportNamespaceRule());
	        }
       		set(
       			$current, 
       			"importedNamespace",
        		lv_importedNamespace_0_0, 
        		"org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.Common.FQN");
	        afterParserOrEnumRuleCall();
	    }

)
)
;





// Entry rule entryRuleImportURI
entryRuleImportURI returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getImportURIRule()); }
	 iv_ruleImportURI=ruleImportURI 
	 { $current=$iv_ruleImportURI.current; } 
	 EOF 
;

// Rule ImportURI
ruleImportURI returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='external' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getImportURIAccess().getExternalKeyword_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getImportURIAccess().getImportURIEStringParserRuleCall_1_0()); 
	    }
		lv_importURI_1_0=ruleEString		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getImportURIRule());
	        }
       		set(
       			$current, 
       			"importURI",
        		lv_importURI_1_0, 
        		"org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.Common.EString");
	        afterParserOrEnumRuleCall();
	    }

)
))
;





// Entry rule entryRuleImport
entryRuleImport returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getImportRule()); }
	 iv_ruleImport=ruleImport 
	 { $current=$iv_ruleImport.current; } 
	 EOF 
;

// Rule Import
ruleImport returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='import' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getImportAccess().getImportKeyword_0());
    }

    { 
        newCompositeNode(grammarAccess.getImportAccess().getAbstractImportParserRuleCall_1()); 
    }
    this_AbstractImport_1=ruleAbstractImport
    { 
        $current = $this_AbstractImport_1.current; 
        afterParserOrEnumRuleCall();
    }
)
;





// Entry rule entryRuleData
entryRuleData returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getDataRule()); }
	 iv_ruleData=ruleData 
	 { $current=$iv_ruleData.current; } 
	 EOF 
;

// Rule Data
ruleData returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
    {
        $current = forceCreateModelElement(
            grammarAccess.getDataAccess().getDataAction_0(),
            $current);
    }
)	otherlv_1='Data' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getDataAccess().getDataKeyword_1());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getDataAccess().getNameFQNParserRuleCall_2_0()); 
	    }
		lv_name_2_0=ruleFQN		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getDataRule());
	        }
       		set(
       			$current, 
       			"name",
        		lv_name_2_0, 
        		"org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.Common.FQN");
	        afterParserOrEnumRuleCall();
	    }

)
)?	otherlv_3='{' 
    {
    	newLeafNode(otherlv_3, grammarAccess.getDataAccess().getLeftCurlyBracketKeyword_3());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getDataAccess().getOwned_annotationsAnnotationParserRuleCall_4_0()); 
	    }
		lv_owned_annotations_4_0=ruleAnnotation		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getDataRule());
	        }
       		add(
       			$current, 
       			"owned_annotations",
        		lv_owned_annotations_4_0, 
        		"org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.Data.Annotation");
	        afterParserOrEnumRuleCall();
	    }

)
)*(

(
	{ 
	  getUnorderedGroupHelper().enter(grammarAccess.getDataAccess().getUnorderedGroup_5());
	}
	(
		(

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getDataAccess().getUnorderedGroup_5(), 0)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getDataAccess().getUnorderedGroup_5(), 0);
	 				}
					({true}?=>(	otherlv_6='description:' 
    {
    	newLeafNode(otherlv_6, grammarAccess.getDataAccess().getDescriptionKeyword_5_0_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getDataAccess().getDescriptionEStringParserRuleCall_5_0_1_0()); 
	    }
		lv_description_7_0=ruleEString		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getDataRule());
	        }
       		set(
       			$current, 
       			"description",
        		lv_description_7_0, 
        		"org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.Common.EString");
	        afterParserOrEnumRuleCall();
	    }

)
)))
					{ 
	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getDataAccess().getUnorderedGroup_5());
	 				}
 				)
			)  |

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getDataAccess().getUnorderedGroup_5(), 1)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getDataAccess().getUnorderedGroup_5(), 1);
	 				}
					({true}?=>(
(
		{ 
	        newCompositeNode(grammarAccess.getDataAccess().getVP_ClassesClassParserRuleCall_5_1_0()); 
	    }
		lv_VP_Classes_8_0=ruleClass		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getDataRule());
	        }
       		add(
       			$current, 
       			"VP_Classes",
        		lv_VP_Classes_8_0, 
        		"org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.Data.Class");
	        afterParserOrEnumRuleCall();
	    }

)
))+
					{ 
	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getDataAccess().getUnorderedGroup_5());
	 				}
 				)
			)  |

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getDataAccess().getUnorderedGroup_5(), 2)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getDataAccess().getUnorderedGroup_5(), 2);
	 				}
					({true}?=>(
(
		{ 
	        newCompositeNode(grammarAccess.getDataAccess().getVP_EnumerationsEnumerationParserRuleCall_5_2_0()); 
	    }
		lv_VP_Enumerations_9_0=ruleEnumeration		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getDataRule());
	        }
       		add(
       			$current, 
       			"VP_Enumerations",
        		lv_VP_Enumerations_9_0, 
        		"org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.Data.Enumeration");
	        afterParserOrEnumRuleCall();
	    }

)
))+
					{ 
	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getDataAccess().getUnorderedGroup_5());
	 				}
 				)
			)  

		)*	
	)
)
	{ 
	  getUnorderedGroupHelper().leave(grammarAccess.getDataAccess().getUnorderedGroup_5());
	}

)	otherlv_10='}' 
    {
    	newLeafNode(otherlv_10, grammarAccess.getDataAccess().getRightCurlyBracketKeyword_6());
    }
)
;





// Entry rule entryRuleClass
entryRuleClass returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getClassRule()); }
	 iv_ruleClass=ruleClass 
	 { $current=$iv_ruleClass.current; } 
	 EOF 
;

// Rule Class
ruleClass returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
    {
        $current = forceCreateModelElement(
            grammarAccess.getClassAccess().getClassAction_0(),
            $current);
    }
)	otherlv_1='Class' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getClassAccess().getClassKeyword_1());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getClassAccess().getNameEStringParserRuleCall_2_0()); 
	    }
		lv_name_2_0=ruleEString		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getClassRule());
	        }
       		set(
       			$current, 
       			"name",
        		lv_name_2_0, 
        		"org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.Common.EString");
	        afterParserOrEnumRuleCall();
	    }

)
)	otherlv_3='{' 
    {
    	newLeafNode(otherlv_3, grammarAccess.getClassAccess().getLeftCurlyBracketKeyword_3());
    }
(	otherlv_4='description:' 
    {
    	newLeafNode(otherlv_4, grammarAccess.getClassAccess().getDescriptionKeyword_4_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getClassAccess().getDescriptionEStringParserRuleCall_4_1_0()); 
	    }
		lv_description_5_0=ruleEString		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getClassRule());
	        }
       		set(
       			$current, 
       			"description",
        		lv_description_5_0, 
        		"org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.Common.EString");
	        afterParserOrEnumRuleCall();
	    }

)
))?(	otherlv_6='icon:' 
    {
    	newLeafNode(otherlv_6, grammarAccess.getClassAccess().getIconKeyword_5_0());
    }
(
(
		lv_icon_7_0=RULE_STRING
		{
			newLeafNode(lv_icon_7_0, grammarAccess.getClassAccess().getIconSTRINGTerminalRuleCall_5_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getClassRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"icon",
        		lv_icon_7_0, 
        		"org.eclipse.xtext.common.Terminals.STRING");
	    }

)
))?(	otherlv_8='extends' 
    {
    	newLeafNode(otherlv_8, grammarAccess.getClassAccess().getExtendsKeyword_6_0());
    }
(
(
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getClassRule());
	        }
        }
		{ 
	        newCompositeNode(grammarAccess.getClassAccess().getExtendsEClassCrossReference_6_1_0()); 
	    }
		ruleFQN		{ 
	        afterParserOrEnumRuleCall();
	    }

)
)(	otherlv_10=',' 
    {
    	newLeafNode(otherlv_10, grammarAccess.getClassAccess().getCommaKeyword_6_2_0());
    }
(
(
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getClassRule());
	        }
        }
		{ 
	        newCompositeNode(grammarAccess.getClassAccess().getExtendsEClassCrossReference_6_2_1_0()); 
	    }
		ruleFQN		{ 
	        afterParserOrEnumRuleCall();
	    }

)
))*)?(	otherlv_12='superClass' 
    {
    	newLeafNode(otherlv_12, grammarAccess.getClassAccess().getSuperClassKeyword_7_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getClassAccess().getInheritencesAbstractSuperClassParserRuleCall_7_1_0()); 
	    }
		lv_Inheritences_13_0=ruleAbstractSuperClass		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getClassRule());
	        }
       		add(
       			$current, 
       			"Inheritences",
        		lv_Inheritences_13_0, 
        		"org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.Data.AbstractSuperClass");
	        afterParserOrEnumRuleCall();
	    }

)
)(	otherlv_14=',' 
    {
    	newLeafNode(otherlv_14, grammarAccess.getClassAccess().getCommaKeyword_7_2_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getClassAccess().getInheritencesAbstractSuperClassParserRuleCall_7_2_1_0()); 
	    }
		lv_Inheritences_15_0=ruleAbstractSuperClass		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getClassRule());
	        }
       		add(
       			$current, 
       			"Inheritences",
        		lv_Inheritences_15_0, 
        		"org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.Data.AbstractSuperClass");
	        afterParserOrEnumRuleCall();
	    }

)
))*)?(	otherlv_16='abstract:' 
    {
    	newLeafNode(otherlv_16, grammarAccess.getClassAccess().getAbstractKeyword_8_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getClassAccess().getAbstractEBooleanParserRuleCall_8_1_0()); 
	    }
		lv_abstract_17_0=ruleEBoolean		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getClassRule());
	        }
       		set(
       			$current, 
       			"abstract",
        		lv_abstract_17_0, 
        		"org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.Common.EBoolean");
	        afterParserOrEnumRuleCall();
	    }

)
))?(
(
		{ 
	        newCompositeNode(grammarAccess.getClassAccess().getOwned_annotationsAnnotationParserRuleCall_9_0()); 
	    }
		lv_owned_annotations_18_0=ruleAnnotation		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getClassRule());
	        }
       		add(
       			$current, 
       			"owned_annotations",
        		lv_owned_annotations_18_0, 
        		"org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.Data.Annotation");
	        afterParserOrEnumRuleCall();
	    }

)
)*(	otherlv_19='Attributes:' 
    {
    	newLeafNode(otherlv_19, grammarAccess.getClassAccess().getAttributesKeyword_10_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getClassAccess().getVP_Class_AttributesAttributeParserRuleCall_10_1_0()); 
	    }
		lv_VP_Class_Attributes_20_0=ruleAttribute		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getClassRule());
	        }
       		add(
       			$current, 
       			"VP_Class_Attributes",
        		lv_VP_Class_Attributes_20_0, 
        		"org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.Data.Attribute");
	        afterParserOrEnumRuleCall();
	    }

)
)*)?(	otherlv_21='Associations:' 
    {
    	newLeafNode(otherlv_21, grammarAccess.getClassAccess().getAssociationsKeyword_11_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getClassAccess().getVP_Classes_AssociationsAbstractAssociationParserRuleCall_11_1_0()); 
	    }
		lv_VP_Classes_Associations_22_0=ruleAbstractAssociation		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getClassRule());
	        }
       		add(
       			$current, 
       			"VP_Classes_Associations",
        		lv_VP_Classes_Associations_22_0, 
        		"org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.Data.AbstractAssociation");
	        afterParserOrEnumRuleCall();
	    }

)
)*)?(	otherlv_23='Operations:' 
    {
    	newLeafNode(otherlv_23, grammarAccess.getClassAccess().getOperationsKeyword_12_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getClassAccess().getVP_Class_OperationsOperationParserRuleCall_12_1_0()); 
	    }
		lv_VP_Class_Operations_24_0=ruleOperation		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getClassRule());
	        }
       		add(
       			$current, 
       			"VP_Class_Operations",
        		lv_VP_Class_Operations_24_0, 
        		"org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.Data.Operation");
	        afterParserOrEnumRuleCall();
	    }

)
)*)?	otherlv_25='}' 
    {
    	newLeafNode(otherlv_25, grammarAccess.getClassAccess().getRightCurlyBracketKeyword_13());
    }
)
;





// Entry rule entryRuleEnumeration
entryRuleEnumeration returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getEnumerationRule()); }
	 iv_ruleEnumeration=ruleEnumeration 
	 { $current=$iv_ruleEnumeration.current; } 
	 EOF 
;

// Rule Enumeration
ruleEnumeration returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
    {
        $current = forceCreateModelElement(
            grammarAccess.getEnumerationAccess().getEnumerationAction_0(),
            $current);
    }
)	otherlv_1='Enumeration' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getEnumerationAccess().getEnumerationKeyword_1());
    }
(
(
		lv_name_2_0=RULE_ID
		{
			newLeafNode(lv_name_2_0, grammarAccess.getEnumerationAccess().getNameIDTerminalRuleCall_2_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getEnumerationRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"name",
        		lv_name_2_0, 
        		"org.eclipse.xtext.common.Terminals.ID");
	    }

)
)	otherlv_3='{' 
    {
    	newLeafNode(otherlv_3, grammarAccess.getEnumerationAccess().getLeftCurlyBracketKeyword_3());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getEnumerationAccess().getOwned_annotationsAnnotationParserRuleCall_4_0()); 
	    }
		lv_owned_annotations_4_0=ruleAnnotation		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getEnumerationRule());
	        }
       		add(
       			$current, 
       			"owned_annotations",
        		lv_owned_annotations_4_0, 
        		"org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.Data.Annotation");
	        afterParserOrEnumRuleCall();
	    }

)
)*((
(
		{ 
	        newCompositeNode(grammarAccess.getEnumerationAccess().getOwnedValuesValueParserRuleCall_5_0_0()); 
	    }
		lv_ownedValues_5_0=ruleValue		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getEnumerationRule());
	        }
       		add(
       			$current, 
       			"ownedValues",
        		lv_ownedValues_5_0, 
        		"org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.Data.Value");
	        afterParserOrEnumRuleCall();
	    }

)
)(	otherlv_6=',' 
    {
    	newLeafNode(otherlv_6, grammarAccess.getEnumerationAccess().getCommaKeyword_5_1_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getEnumerationAccess().getOwnedValuesValueParserRuleCall_5_1_1_0()); 
	    }
		lv_ownedValues_7_0=ruleValue		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getEnumerationRule());
	        }
       		add(
       			$current, 
       			"ownedValues",
        		lv_ownedValues_7_0, 
        		"org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.Data.Value");
	        afterParserOrEnumRuleCall();
	    }

)
))*)	otherlv_8='}' 
    {
    	newLeafNode(otherlv_8, grammarAccess.getEnumerationAccess().getRightCurlyBracketKeyword_6());
    }
)
;





// Entry rule entryRuleAbstractSuperClass
entryRuleAbstractSuperClass returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getAbstractSuperClassRule()); }
	 iv_ruleAbstractSuperClass=ruleAbstractSuperClass 
	 { $current=$iv_ruleAbstractSuperClass.current; } 
	 EOF 
;

// Rule AbstractSuperClass
ruleAbstractSuperClass returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
    { 
        newCompositeNode(grammarAccess.getAbstractSuperClassAccess().getLocalSuperClassParserRuleCall_0()); 
    }
    this_LocalSuperClass_0=ruleLocalSuperClass
    { 
        $current = $this_LocalSuperClass_0.current; 
        afterParserOrEnumRuleCall();
    }

    |
    { 
        newCompositeNode(grammarAccess.getAbstractSuperClassAccess().getExternalSuperClassParserRuleCall_1()); 
    }
    this_ExternalSuperClass_1=ruleExternalSuperClass
    { 
        $current = $this_ExternalSuperClass_1.current; 
        afterParserOrEnumRuleCall();
    }
)
;





// Entry rule entryRuleLocalSuperClass
entryRuleLocalSuperClass returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getLocalSuperClassRule()); }
	 iv_ruleLocalSuperClass=ruleLocalSuperClass 
	 { $current=$iv_ruleLocalSuperClass.current; } 
	 EOF 
;

// Rule LocalSuperClass
ruleLocalSuperClass returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
    {
        $current = forceCreateModelElement(
            grammarAccess.getLocalSuperClassAccess().getLocalSuperClassAction_0(),
            $current);
    }
)(
(
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getLocalSuperClassRule());
	        }
        }
		{ 
	        newCompositeNode(grammarAccess.getLocalSuperClassAccess().getSuperClassClassCrossReference_1_0()); 
	    }
		ruleFQN		{ 
	        afterParserOrEnumRuleCall();
	    }

)
))
;





// Entry rule entryRuleExternalSuperClass
entryRuleExternalSuperClass returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getExternalSuperClassRule()); }
	 iv_ruleExternalSuperClass=ruleExternalSuperClass 
	 { $current=$iv_ruleExternalSuperClass.current; } 
	 EOF 
;

// Rule ExternalSuperClass
ruleExternalSuperClass returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
    {
        $current = forceCreateModelElement(
            grammarAccess.getExternalSuperClassAccess().getExternalSuperClassAction_0(),
            $current);
    }
)	otherlv_1='external' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getExternalSuperClassAccess().getExternalKeyword_1());
    }
(
(
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getExternalSuperClassRule());
	        }
        }
		{ 
	        newCompositeNode(grammarAccess.getExternalSuperClassAccess().getSuperClassEClassCrossReference_2_0()); 
	    }
		ruleFQN		{ 
	        afterParserOrEnumRuleCall();
	    }

)
))
;







// Entry rule entryRuleAbstractAssociation
entryRuleAbstractAssociation returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getAbstractAssociationRule()); }
	 iv_ruleAbstractAssociation=ruleAbstractAssociation 
	 { $current=$iv_ruleAbstractAssociation.current; } 
	 EOF 
;

// Rule AbstractAssociation
ruleAbstractAssociation returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
    { 
        newCompositeNode(grammarAccess.getAbstractAssociationAccess().getLocalClassAssociationParserRuleCall_0()); 
    }
    this_LocalClassAssociation_0=ruleLocalClassAssociation
    { 
        $current = $this_LocalClassAssociation_0.current; 
        afterParserOrEnumRuleCall();
    }

    |
    { 
        newCompositeNode(grammarAccess.getAbstractAssociationAccess().getExternalClassAssociationParserRuleCall_1()); 
    }
    this_ExternalClassAssociation_1=ruleExternalClassAssociation
    { 
        $current = $this_ExternalClassAssociation_1.current; 
        afterParserOrEnumRuleCall();
    }
)
;





// Entry rule entryRuleLocalClassAssociation
entryRuleLocalClassAssociation returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getLocalClassAssociationRule()); }
	 iv_ruleLocalClassAssociation=ruleLocalClassAssociation 
	 { $current=$iv_ruleLocalClassAssociation.current; } 
	 EOF 
;

// Rule LocalClassAssociation
ruleLocalClassAssociation returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
    {
        $current = forceCreateModelElement(
            grammarAccess.getLocalClassAssociationAccess().getLocalClassAssociationAction_0(),
            $current);
    }
)(
(
		{ 
	        newCompositeNode(grammarAccess.getLocalClassAssociationAccess().getNameEStringParserRuleCall_1_0()); 
	    }
		lv_name_1_0=ruleEString		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getLocalClassAssociationRule());
	        }
       		set(
       			$current, 
       			"name",
        		lv_name_1_0, 
        		"org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.Common.EString");
	        afterParserOrEnumRuleCall();
	    }

)
)(	otherlv_2='description' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getLocalClassAssociationAccess().getDescriptionKeyword_2_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getLocalClassAssociationAccess().getDescriptionEStringParserRuleCall_2_1_0()); 
	    }
		lv_description_3_0=ruleEString		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getLocalClassAssociationRule());
	        }
       		set(
       			$current, 
       			"description",
        		lv_description_3_0, 
        		"org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.Common.EString");
	        afterParserOrEnumRuleCall();
	    }

)
)	otherlv_4=',' 
    {
    	newLeafNode(otherlv_4, grammarAccess.getLocalClassAssociationAccess().getCommaKeyword_2_2());
    }
)?(
(
		{ 
	        newCompositeNode(grammarAccess.getLocalClassAssociationAccess().getTypeAssociation_TypesEnumRuleCall_3_0()); 
	    }
		lv_type_5_0=ruleAssociation_Types		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getLocalClassAssociationRule());
	        }
       		set(
       			$current, 
       			"type",
        		lv_type_5_0, 
        		"org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.Data.Association_Types");
	        afterParserOrEnumRuleCall();
	    }

)
)(
(
		{ 
	        newCompositeNode(grammarAccess.getLocalClassAssociationAccess().getCardinalityCardinalitiesEnumRuleCall_4_0()); 
	    }
		lv_cardinality_6_0=ruleCardinalities		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getLocalClassAssociationRule());
	        }
       		set(
       			$current, 
       			"cardinality",
        		lv_cardinality_6_0, 
        		"org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.Data.Cardinalities");
	        afterParserOrEnumRuleCall();
	    }

)
)(
(
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getLocalClassAssociationRule());
	        }
        }
		{ 
	        newCompositeNode(grammarAccess.getLocalClassAssociationAccess().getLocalTargetClassCrossReference_5_0()); 
	    }
		ruleFQN		{ 
	        afterParserOrEnumRuleCall();
	    }

)
)(

(
	{ 
	  getUnorderedGroupHelper().enter(grammarAccess.getLocalClassAssociationAccess().getUnorderedGroup_6());
	}
	(
		(

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getLocalClassAssociationAccess().getUnorderedGroup_6(), 0)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getLocalClassAssociationAccess().getUnorderedGroup_6(), 0);
	 				}
					({true}?=>(	otherlv_9='opposite:' 
    {
    	newLeafNode(otherlv_9, grammarAccess.getLocalClassAssociationAccess().getOppositeKeyword_6_0_0());
    }
(
(
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getLocalClassAssociationRule());
	        }
        }
		{ 
	        newCompositeNode(grammarAccess.getLocalClassAssociationAccess().getOppositeLocalClassAssociationCrossReference_6_0_1_0()); 
	    }
		ruleFQN		{ 
	        afterParserOrEnumRuleCall();
	    }

)
)))
					{ 
	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getLocalClassAssociationAccess().getUnorderedGroup_6());
	 				}
 				)
			)  |

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getLocalClassAssociationAccess().getUnorderedGroup_6(), 1)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getLocalClassAssociationAccess().getUnorderedGroup_6(), 1);
	 				}
					({true}?=>(	otherlv_11='changeable:' 
    {
    	newLeafNode(otherlv_11, grammarAccess.getLocalClassAssociationAccess().getChangeableKeyword_6_1_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getLocalClassAssociationAccess().getChangeableEBooleanParserRuleCall_6_1_1_0()); 
	    }
		lv_changeable_12_0=ruleEBoolean		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getLocalClassAssociationRule());
	        }
       		set(
       			$current, 
       			"changeable",
        		lv_changeable_12_0, 
        		"org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.Common.EBoolean");
	        afterParserOrEnumRuleCall();
	    }

)
)))
					{ 
	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getLocalClassAssociationAccess().getUnorderedGroup_6());
	 				}
 				)
			)  |

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getLocalClassAssociationAccess().getUnorderedGroup_6(), 2)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getLocalClassAssociationAccess().getUnorderedGroup_6(), 2);
	 				}
					({true}?=>(	otherlv_13='derived:' 
    {
    	newLeafNode(otherlv_13, grammarAccess.getLocalClassAssociationAccess().getDerivedKeyword_6_2_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getLocalClassAssociationAccess().getDerivedEBooleanParserRuleCall_6_2_1_0()); 
	    }
		lv_derived_14_0=ruleEBoolean		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getLocalClassAssociationRule());
	        }
       		set(
       			$current, 
       			"derived",
        		lv_derived_14_0, 
        		"org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.Common.EBoolean");
	        afterParserOrEnumRuleCall();
	    }

)
)))
					{ 
	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getLocalClassAssociationAccess().getUnorderedGroup_6());
	 				}
 				)
			)  |

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getLocalClassAssociationAccess().getUnorderedGroup_6(), 3)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getLocalClassAssociationAccess().getUnorderedGroup_6(), 3);
	 				}
					({true}?=>(	otherlv_15='ordered:' 
    {
    	newLeafNode(otherlv_15, grammarAccess.getLocalClassAssociationAccess().getOrderedKeyword_6_3_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getLocalClassAssociationAccess().getOrderedEBooleanParserRuleCall_6_3_1_0()); 
	    }
		lv_ordered_16_0=ruleEBoolean		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getLocalClassAssociationRule());
	        }
       		set(
       			$current, 
       			"ordered",
        		lv_ordered_16_0, 
        		"org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.Common.EBoolean");
	        afterParserOrEnumRuleCall();
	    }

)
)))
					{ 
	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getLocalClassAssociationAccess().getUnorderedGroup_6());
	 				}
 				)
			)  |

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getLocalClassAssociationAccess().getUnorderedGroup_6(), 4)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getLocalClassAssociationAccess().getUnorderedGroup_6(), 4);
	 				}
					({true}?=>(	otherlv_17='transient:' 
    {
    	newLeafNode(otherlv_17, grammarAccess.getLocalClassAssociationAccess().getTransientKeyword_6_4_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getLocalClassAssociationAccess().getTransientEBooleanParserRuleCall_6_4_1_0()); 
	    }
		lv_transient_18_0=ruleEBoolean		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getLocalClassAssociationRule());
	        }
       		set(
       			$current, 
       			"transient",
        		lv_transient_18_0, 
        		"org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.Common.EBoolean");
	        afterParserOrEnumRuleCall();
	    }

)
)))
					{ 
	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getLocalClassAssociationAccess().getUnorderedGroup_6());
	 				}
 				)
			)  |

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getLocalClassAssociationAccess().getUnorderedGroup_6(), 5)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getLocalClassAssociationAccess().getUnorderedGroup_6(), 5);
	 				}
					({true}?=>(	otherlv_19='unique:' 
    {
    	newLeafNode(otherlv_19, grammarAccess.getLocalClassAssociationAccess().getUniqueKeyword_6_5_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getLocalClassAssociationAccess().getUniqueEBooleanParserRuleCall_6_5_1_0()); 
	    }
		lv_unique_20_0=ruleEBoolean		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getLocalClassAssociationRule());
	        }
       		set(
       			$current, 
       			"unique",
        		lv_unique_20_0, 
        		"org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.Common.EBoolean");
	        afterParserOrEnumRuleCall();
	    }

)
)))
					{ 
	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getLocalClassAssociationAccess().getUnorderedGroup_6());
	 				}
 				)
			)  |

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getLocalClassAssociationAccess().getUnorderedGroup_6(), 6)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getLocalClassAssociationAccess().getUnorderedGroup_6(), 6);
	 				}
					({true}?=>(	otherlv_21='unsettable:' 
    {
    	newLeafNode(otherlv_21, grammarAccess.getLocalClassAssociationAccess().getUnsettableKeyword_6_6_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getLocalClassAssociationAccess().getUnsettableEBooleanParserRuleCall_6_6_1_0()); 
	    }
		lv_unsettable_22_0=ruleEBoolean		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getLocalClassAssociationRule());
	        }
       		set(
       			$current, 
       			"unsettable",
        		lv_unsettable_22_0, 
        		"org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.Common.EBoolean");
	        afterParserOrEnumRuleCall();
	    }

)
)))
					{ 
	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getLocalClassAssociationAccess().getUnorderedGroup_6());
	 				}
 				)
			)  |

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getLocalClassAssociationAccess().getUnorderedGroup_6(), 7)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getLocalClassAssociationAccess().getUnorderedGroup_6(), 7);
	 				}
					({true}?=>(	otherlv_23='volatile:' 
    {
    	newLeafNode(otherlv_23, grammarAccess.getLocalClassAssociationAccess().getVolatileKeyword_6_7_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getLocalClassAssociationAccess().getVolatileEBooleanParserRuleCall_6_7_1_0()); 
	    }
		lv_volatile_24_0=ruleEBoolean		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getLocalClassAssociationRule());
	        }
       		set(
       			$current, 
       			"volatile",
        		lv_volatile_24_0, 
        		"org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.Common.EBoolean");
	        afterParserOrEnumRuleCall();
	    }

)
)))
					{ 
	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getLocalClassAssociationAccess().getUnorderedGroup_6());
	 				}
 				)
			)  

		)*	
	)
)
	{ 
	  getUnorderedGroupHelper().leave(grammarAccess.getLocalClassAssociationAccess().getUnorderedGroup_6());
	}

)(
(
		{ 
	        newCompositeNode(grammarAccess.getLocalClassAssociationAccess().getOwned_annotationsAnnotationParserRuleCall_7_0()); 
	    }
		lv_owned_annotations_25_0=ruleAnnotation		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getLocalClassAssociationRule());
	        }
       		add(
       			$current, 
       			"owned_annotations",
        		lv_owned_annotations_25_0, 
        		"org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.Data.Annotation");
	        afterParserOrEnumRuleCall();
	    }

)
)*)
;





// Entry rule entryRuleExternalClassAssociation
entryRuleExternalClassAssociation returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getExternalClassAssociationRule()); }
	 iv_ruleExternalClassAssociation=ruleExternalClassAssociation 
	 { $current=$iv_ruleExternalClassAssociation.current; } 
	 EOF 
;

// Rule ExternalClassAssociation
ruleExternalClassAssociation returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
    {
        $current = forceCreateModelElement(
            grammarAccess.getExternalClassAssociationAccess().getExternalClassAssociationAction_0(),
            $current);
    }
)(
(
		{ 
	        newCompositeNode(grammarAccess.getExternalClassAssociationAccess().getNameEStringParserRuleCall_1_0()); 
	    }
		lv_name_1_0=ruleEString		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getExternalClassAssociationRule());
	        }
       		set(
       			$current, 
       			"name",
        		lv_name_1_0, 
        		"org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.Common.EString");
	        afterParserOrEnumRuleCall();
	    }

)
)(	otherlv_2='description' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getExternalClassAssociationAccess().getDescriptionKeyword_2_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getExternalClassAssociationAccess().getDescriptionEStringParserRuleCall_2_1_0()); 
	    }
		lv_description_3_0=ruleEString		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getExternalClassAssociationRule());
	        }
       		set(
       			$current, 
       			"description",
        		lv_description_3_0, 
        		"org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.Common.EString");
	        afterParserOrEnumRuleCall();
	    }

)
)	otherlv_4=',' 
    {
    	newLeafNode(otherlv_4, grammarAccess.getExternalClassAssociationAccess().getCommaKeyword_2_2());
    }
)?(
(
		{ 
	        newCompositeNode(grammarAccess.getExternalClassAssociationAccess().getTypeAssociation_TypesEnumRuleCall_3_0()); 
	    }
		lv_type_5_0=ruleAssociation_Types		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getExternalClassAssociationRule());
	        }
       		set(
       			$current, 
       			"type",
        		lv_type_5_0, 
        		"org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.Data.Association_Types");
	        afterParserOrEnumRuleCall();
	    }

)
)(
(
		{ 
	        newCompositeNode(grammarAccess.getExternalClassAssociationAccess().getCardinalityCardinalitiesEnumRuleCall_4_0()); 
	    }
		lv_cardinality_6_0=ruleCardinalities		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getExternalClassAssociationRule());
	        }
       		set(
       			$current, 
       			"cardinality",
        		lv_cardinality_6_0, 
        		"org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.Data.Cardinalities");
	        afterParserOrEnumRuleCall();
	    }

)
)	otherlv_7='external' 
    {
    	newLeafNode(otherlv_7, grammarAccess.getExternalClassAssociationAccess().getExternalKeyword_5());
    }
(
(
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getExternalClassAssociationRule());
	        }
        }
		{ 
	        newCompositeNode(grammarAccess.getExternalClassAssociationAccess().getExternalTargetEClassCrossReference_6_0()); 
	    }
		ruleFQN		{ 
	        afterParserOrEnumRuleCall();
	    }

)
)(

(
	{ 
	  getUnorderedGroupHelper().enter(grammarAccess.getExternalClassAssociationAccess().getUnorderedGroup_7());
	}
	(
		(

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getExternalClassAssociationAccess().getUnorderedGroup_7(), 0)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getExternalClassAssociationAccess().getUnorderedGroup_7(), 0);
	 				}
					({true}?=>(	otherlv_10='changeable:' 
    {
    	newLeafNode(otherlv_10, grammarAccess.getExternalClassAssociationAccess().getChangeableKeyword_7_0_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getExternalClassAssociationAccess().getChangeableEBooleanParserRuleCall_7_0_1_0()); 
	    }
		lv_changeable_11_0=ruleEBoolean		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getExternalClassAssociationRule());
	        }
       		set(
       			$current, 
       			"changeable",
        		lv_changeable_11_0, 
        		"org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.Common.EBoolean");
	        afterParserOrEnumRuleCall();
	    }

)
)))
					{ 
	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getExternalClassAssociationAccess().getUnorderedGroup_7());
	 				}
 				)
			)  |

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getExternalClassAssociationAccess().getUnorderedGroup_7(), 1)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getExternalClassAssociationAccess().getUnorderedGroup_7(), 1);
	 				}
					({true}?=>(	otherlv_12='derived:' 
    {
    	newLeafNode(otherlv_12, grammarAccess.getExternalClassAssociationAccess().getDerivedKeyword_7_1_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getExternalClassAssociationAccess().getDerivedEBooleanParserRuleCall_7_1_1_0()); 
	    }
		lv_derived_13_0=ruleEBoolean		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getExternalClassAssociationRule());
	        }
       		set(
       			$current, 
       			"derived",
        		lv_derived_13_0, 
        		"org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.Common.EBoolean");
	        afterParserOrEnumRuleCall();
	    }

)
)))
					{ 
	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getExternalClassAssociationAccess().getUnorderedGroup_7());
	 				}
 				)
			)  |

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getExternalClassAssociationAccess().getUnorderedGroup_7(), 2)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getExternalClassAssociationAccess().getUnorderedGroup_7(), 2);
	 				}
					({true}?=>(	otherlv_14='ordered:' 
    {
    	newLeafNode(otherlv_14, grammarAccess.getExternalClassAssociationAccess().getOrderedKeyword_7_2_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getExternalClassAssociationAccess().getOrderedEBooleanParserRuleCall_7_2_1_0()); 
	    }
		lv_ordered_15_0=ruleEBoolean		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getExternalClassAssociationRule());
	        }
       		set(
       			$current, 
       			"ordered",
        		lv_ordered_15_0, 
        		"org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.Common.EBoolean");
	        afterParserOrEnumRuleCall();
	    }

)
)))
					{ 
	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getExternalClassAssociationAccess().getUnorderedGroup_7());
	 				}
 				)
			)  |

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getExternalClassAssociationAccess().getUnorderedGroup_7(), 3)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getExternalClassAssociationAccess().getUnorderedGroup_7(), 3);
	 				}
					({true}?=>(	otherlv_16='transient:' 
    {
    	newLeafNode(otherlv_16, grammarAccess.getExternalClassAssociationAccess().getTransientKeyword_7_3_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getExternalClassAssociationAccess().getTransientEBooleanParserRuleCall_7_3_1_0()); 
	    }
		lv_transient_17_0=ruleEBoolean		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getExternalClassAssociationRule());
	        }
       		set(
       			$current, 
       			"transient",
        		lv_transient_17_0, 
        		"org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.Common.EBoolean");
	        afterParserOrEnumRuleCall();
	    }

)
)))
					{ 
	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getExternalClassAssociationAccess().getUnorderedGroup_7());
	 				}
 				)
			)  |

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getExternalClassAssociationAccess().getUnorderedGroup_7(), 4)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getExternalClassAssociationAccess().getUnorderedGroup_7(), 4);
	 				}
					({true}?=>(	otherlv_18='unique:' 
    {
    	newLeafNode(otherlv_18, grammarAccess.getExternalClassAssociationAccess().getUniqueKeyword_7_4_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getExternalClassAssociationAccess().getUniqueEBooleanParserRuleCall_7_4_1_0()); 
	    }
		lv_unique_19_0=ruleEBoolean		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getExternalClassAssociationRule());
	        }
       		set(
       			$current, 
       			"unique",
        		lv_unique_19_0, 
        		"org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.Common.EBoolean");
	        afterParserOrEnumRuleCall();
	    }

)
)))
					{ 
	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getExternalClassAssociationAccess().getUnorderedGroup_7());
	 				}
 				)
			)  |

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getExternalClassAssociationAccess().getUnorderedGroup_7(), 5)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getExternalClassAssociationAccess().getUnorderedGroup_7(), 5);
	 				}
					({true}?=>(	otherlv_20='unsettable:' 
    {
    	newLeafNode(otherlv_20, grammarAccess.getExternalClassAssociationAccess().getUnsettableKeyword_7_5_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getExternalClassAssociationAccess().getUnsettableEBooleanParserRuleCall_7_5_1_0()); 
	    }
		lv_unsettable_21_0=ruleEBoolean		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getExternalClassAssociationRule());
	        }
       		set(
       			$current, 
       			"unsettable",
        		lv_unsettable_21_0, 
        		"org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.Common.EBoolean");
	        afterParserOrEnumRuleCall();
	    }

)
)))
					{ 
	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getExternalClassAssociationAccess().getUnorderedGroup_7());
	 				}
 				)
			)  |

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getExternalClassAssociationAccess().getUnorderedGroup_7(), 6)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getExternalClassAssociationAccess().getUnorderedGroup_7(), 6);
	 				}
					({true}?=>(	otherlv_22='volatile:' 
    {
    	newLeafNode(otherlv_22, grammarAccess.getExternalClassAssociationAccess().getVolatileKeyword_7_6_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getExternalClassAssociationAccess().getVolatileEBooleanParserRuleCall_7_6_1_0()); 
	    }
		lv_volatile_23_0=ruleEBoolean		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getExternalClassAssociationRule());
	        }
       		set(
       			$current, 
       			"volatile",
        		lv_volatile_23_0, 
        		"org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.Common.EBoolean");
	        afterParserOrEnumRuleCall();
	    }

)
)))
					{ 
	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getExternalClassAssociationAccess().getUnorderedGroup_7());
	 				}
 				)
			)  

		)*	
	)
)
	{ 
	  getUnorderedGroupHelper().leave(grammarAccess.getExternalClassAssociationAccess().getUnorderedGroup_7());
	}

)(
(
		{ 
	        newCompositeNode(grammarAccess.getExternalClassAssociationAccess().getOwned_annotationsAnnotationParserRuleCall_8_0()); 
	    }
		lv_owned_annotations_24_0=ruleAnnotation		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getExternalClassAssociationRule());
	        }
       		add(
       			$current, 
       			"owned_annotations",
        		lv_owned_annotations_24_0, 
        		"org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.Data.Annotation");
	        afterParserOrEnumRuleCall();
	    }

)
)*)
;





// Entry rule entryRuleAbstractAttributeType
entryRuleAbstractAttributeType returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getAbstractAttributeTypeRule()); }
	 iv_ruleAbstractAttributeType=ruleAbstractAttributeType 
	 { $current=$iv_ruleAbstractAttributeType.current; } 
	 EOF 
;

// Rule AbstractAttributeType
ruleAbstractAttributeType returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
    { 
        newCompositeNode(grammarAccess.getAbstractAttributeTypeAccess().getLocalAttributeTypeParserRuleCall_0()); 
    }
    this_LocalAttributeType_0=ruleLocalAttributeType
    { 
        $current = $this_LocalAttributeType_0.current; 
        afterParserOrEnumRuleCall();
    }

    |
    { 
        newCompositeNode(grammarAccess.getAbstractAttributeTypeAccess().getExternalAttributeTypeParserRuleCall_1()); 
    }
    this_ExternalAttributeType_1=ruleExternalAttributeType
    { 
        $current = $this_ExternalAttributeType_1.current; 
        afterParserOrEnumRuleCall();
    }
)
;





// Entry rule entryRuleLocalAttributeType
entryRuleLocalAttributeType returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getLocalAttributeTypeRule()); }
	 iv_ruleLocalAttributeType=ruleLocalAttributeType 
	 { $current=$iv_ruleLocalAttributeType.current; } 
	 EOF 
;

// Rule LocalAttributeType
ruleLocalAttributeType returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
    {
        $current = forceCreateModelElement(
            grammarAccess.getLocalAttributeTypeAccess().getLocalAttributeTypeAction_0(),
            $current);
    }
)	otherlv_1='enum' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getLocalAttributeTypeAccess().getEnumKeyword_1());
    }
(
(
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getLocalAttributeTypeRule());
	        }
        }
		{ 
	        newCompositeNode(grammarAccess.getLocalAttributeTypeAccess().getTypeEnumerationCrossReference_2_0()); 
	    }
		ruleFQN		{ 
	        afterParserOrEnumRuleCall();
	    }

)
))
;





// Entry rule entryRuleExternalAttributeType
entryRuleExternalAttributeType returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getExternalAttributeTypeRule()); }
	 iv_ruleExternalAttributeType=ruleExternalAttributeType 
	 { $current=$iv_ruleExternalAttributeType.current; } 
	 EOF 
;

// Rule ExternalAttributeType
ruleExternalAttributeType returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
    {
        $current = forceCreateModelElement(
            grammarAccess.getExternalAttributeTypeAccess().getExternalAttributeTypeAction_0(),
            $current);
    }
)	otherlv_1='type' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getExternalAttributeTypeAccess().getTypeKeyword_1());
    }
(
(
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getExternalAttributeTypeRule());
	        }
        }
		{ 
	        newCompositeNode(grammarAccess.getExternalAttributeTypeAccess().getTypeEDataTypeCrossReference_2_0()); 
	    }
		ruleFQN		{ 
	        afterParserOrEnumRuleCall();
	    }

)
))
;





// Entry rule entryRuleAttribute
entryRuleAttribute returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getAttributeRule()); }
	 iv_ruleAttribute=ruleAttribute 
	 { $current=$iv_ruleAttribute.current; } 
	 EOF 
;

// Rule Attribute
ruleAttribute returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
    {
        $current = forceCreateModelElement(
            grammarAccess.getAttributeAccess().getAttributeAction_0(),
            $current);
    }
)(
(
		{ 
	        newCompositeNode(grammarAccess.getAttributeAccess().getNameEStringParserRuleCall_1_0()); 
	    }
		lv_name_1_0=ruleEString		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getAttributeRule());
	        }
       		set(
       			$current, 
       			"name",
        		lv_name_1_0, 
        		"org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.Common.EString");
	        afterParserOrEnumRuleCall();
	    }

)
)(	otherlv_2='description' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getAttributeAccess().getDescriptionKeyword_2_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getAttributeAccess().getDescriptionEStringParserRuleCall_2_1_0()); 
	    }
		lv_description_3_0=ruleEString		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getAttributeRule());
	        }
       		set(
       			$current, 
       			"description",
        		lv_description_3_0, 
        		"org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.Common.EString");
	        afterParserOrEnumRuleCall();
	    }

)
)	otherlv_4=',' 
    {
    	newLeafNode(otherlv_4, grammarAccess.getAttributeAccess().getCommaKeyword_2_2());
    }
)?(
(
		{ 
	        newCompositeNode(grammarAccess.getAttributeAccess().getOwned_typeAbstractAttributeTypeParserRuleCall_3_0()); 
	    }
		lv_owned_type_5_0=ruleAbstractAttributeType		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getAttributeRule());
	        }
       		set(
       			$current, 
       			"owned_type",
        		lv_owned_type_5_0, 
        		"org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.Data.AbstractAttributeType");
	        afterParserOrEnumRuleCall();
	    }

)
)(
(
		{ 
	        newCompositeNode(grammarAccess.getAttributeAccess().getCardinalityCardinalitiesEnumRuleCall_4_0()); 
	    }
		lv_cardinality_6_0=ruleCardinalities		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getAttributeRule());
	        }
       		set(
       			$current, 
       			"cardinality",
        		lv_cardinality_6_0, 
        		"org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.Data.Cardinalities");
	        afterParserOrEnumRuleCall();
	    }

)
)?(

(
	{ 
	  getUnorderedGroupHelper().enter(grammarAccess.getAttributeAccess().getUnorderedGroup_5());
	}
	(
		(

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getAttributeAccess().getUnorderedGroup_5(), 0)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getAttributeAccess().getUnorderedGroup_5(), 0);
	 				}
					({true}?=>(	otherlv_8='id:' 
    {
    	newLeafNode(otherlv_8, grammarAccess.getAttributeAccess().getIdKeyword_5_0_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getAttributeAccess().getIsIdEBooleanParserRuleCall_5_0_1_0()); 
	    }
		lv_isId_9_0=ruleEBoolean		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getAttributeRule());
	        }
       		set(
       			$current, 
       			"isId",
        		lv_isId_9_0, 
        		"org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.Common.EBoolean");
	        afterParserOrEnumRuleCall();
	    }

)
)))
					{ 
	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getAttributeAccess().getUnorderedGroup_5());
	 				}
 				)
			)  |

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getAttributeAccess().getUnorderedGroup_5(), 1)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getAttributeAccess().getUnorderedGroup_5(), 1);
	 				}
					({true}?=>(	otherlv_10='changeable:' 
    {
    	newLeafNode(otherlv_10, grammarAccess.getAttributeAccess().getChangeableKeyword_5_1_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getAttributeAccess().getChangeableEBooleanParserRuleCall_5_1_1_0()); 
	    }
		lv_changeable_11_0=ruleEBoolean		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getAttributeRule());
	        }
       		set(
       			$current, 
       			"changeable",
        		lv_changeable_11_0, 
        		"org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.Common.EBoolean");
	        afterParserOrEnumRuleCall();
	    }

)
)))
					{ 
	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getAttributeAccess().getUnorderedGroup_5());
	 				}
 				)
			)  |

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getAttributeAccess().getUnorderedGroup_5(), 2)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getAttributeAccess().getUnorderedGroup_5(), 2);
	 				}
					({true}?=>(	otherlv_12='derived:' 
    {
    	newLeafNode(otherlv_12, grammarAccess.getAttributeAccess().getDerivedKeyword_5_2_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getAttributeAccess().getDerivedEBooleanParserRuleCall_5_2_1_0()); 
	    }
		lv_derived_13_0=ruleEBoolean		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getAttributeRule());
	        }
       		set(
       			$current, 
       			"derived",
        		lv_derived_13_0, 
        		"org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.Common.EBoolean");
	        afterParserOrEnumRuleCall();
	    }

)
)))
					{ 
	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getAttributeAccess().getUnorderedGroup_5());
	 				}
 				)
			)  |

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getAttributeAccess().getUnorderedGroup_5(), 3)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getAttributeAccess().getUnorderedGroup_5(), 3);
	 				}
					({true}?=>(	otherlv_14='ordered:' 
    {
    	newLeafNode(otherlv_14, grammarAccess.getAttributeAccess().getOrderedKeyword_5_3_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getAttributeAccess().getOrderedEBooleanParserRuleCall_5_3_1_0()); 
	    }
		lv_ordered_15_0=ruleEBoolean		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getAttributeRule());
	        }
       		set(
       			$current, 
       			"ordered",
        		lv_ordered_15_0, 
        		"org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.Common.EBoolean");
	        afterParserOrEnumRuleCall();
	    }

)
)))
					{ 
	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getAttributeAccess().getUnorderedGroup_5());
	 				}
 				)
			)  |

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getAttributeAccess().getUnorderedGroup_5(), 4)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getAttributeAccess().getUnorderedGroup_5(), 4);
	 				}
					({true}?=>(	otherlv_16='transient:' 
    {
    	newLeafNode(otherlv_16, grammarAccess.getAttributeAccess().getTransientKeyword_5_4_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getAttributeAccess().getTransientEBooleanParserRuleCall_5_4_1_0()); 
	    }
		lv_transient_17_0=ruleEBoolean		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getAttributeRule());
	        }
       		set(
       			$current, 
       			"transient",
        		lv_transient_17_0, 
        		"org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.Common.EBoolean");
	        afterParserOrEnumRuleCall();
	    }

)
)))
					{ 
	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getAttributeAccess().getUnorderedGroup_5());
	 				}
 				)
			)  |

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getAttributeAccess().getUnorderedGroup_5(), 5)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getAttributeAccess().getUnorderedGroup_5(), 5);
	 				}
					({true}?=>(	otherlv_18='unique:' 
    {
    	newLeafNode(otherlv_18, grammarAccess.getAttributeAccess().getUniqueKeyword_5_5_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getAttributeAccess().getUniqueEBooleanParserRuleCall_5_5_1_0()); 
	    }
		lv_unique_19_0=ruleEBoolean		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getAttributeRule());
	        }
       		set(
       			$current, 
       			"unique",
        		lv_unique_19_0, 
        		"org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.Common.EBoolean");
	        afterParserOrEnumRuleCall();
	    }

)
)))
					{ 
	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getAttributeAccess().getUnorderedGroup_5());
	 				}
 				)
			)  |

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getAttributeAccess().getUnorderedGroup_5(), 6)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getAttributeAccess().getUnorderedGroup_5(), 6);
	 				}
					({true}?=>(	otherlv_20='unsettable:' 
    {
    	newLeafNode(otherlv_20, grammarAccess.getAttributeAccess().getUnsettableKeyword_5_6_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getAttributeAccess().getUnsettableEBooleanParserRuleCall_5_6_1_0()); 
	    }
		lv_unsettable_21_0=ruleEBoolean		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getAttributeRule());
	        }
       		set(
       			$current, 
       			"unsettable",
        		lv_unsettable_21_0, 
        		"org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.Common.EBoolean");
	        afterParserOrEnumRuleCall();
	    }

)
)))
					{ 
	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getAttributeAccess().getUnorderedGroup_5());
	 				}
 				)
			)  |

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getAttributeAccess().getUnorderedGroup_5(), 7)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getAttributeAccess().getUnorderedGroup_5(), 7);
	 				}
					({true}?=>(	otherlv_22='volatile:' 
    {
    	newLeafNode(otherlv_22, grammarAccess.getAttributeAccess().getVolatileKeyword_5_7_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getAttributeAccess().getVolatileEBooleanParserRuleCall_5_7_1_0()); 
	    }
		lv_volatile_23_0=ruleEBoolean		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getAttributeRule());
	        }
       		set(
       			$current, 
       			"volatile",
        		lv_volatile_23_0, 
        		"org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.Common.EBoolean");
	        afterParserOrEnumRuleCall();
	    }

)
)))
					{ 
	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getAttributeAccess().getUnorderedGroup_5());
	 				}
 				)
			)  

		)*	
	)
)
	{ 
	  getUnorderedGroupHelper().leave(grammarAccess.getAttributeAccess().getUnorderedGroup_5());
	}

)(	otherlv_24='values' 
    {
    	newLeafNode(otherlv_24, grammarAccess.getAttributeAccess().getValuesKeyword_6_0());
    }
	otherlv_25='(' 
    {
    	newLeafNode(otherlv_25, grammarAccess.getAttributeAccess().getLeftParenthesisKeyword_6_1());
    }
((
(
		{ 
	        newCompositeNode(grammarAccess.getAttributeAccess().getOwned_valuesValueParserRuleCall_6_2_0_0()); 
	    }
		lv_owned_values_26_0=ruleValue		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getAttributeRule());
	        }
       		add(
       			$current, 
       			"owned_values",
        		lv_owned_values_26_0, 
        		"org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.Data.Value");
	        afterParserOrEnumRuleCall();
	    }

)
)(	otherlv_27=',' 
    {
    	newLeafNode(otherlv_27, grammarAccess.getAttributeAccess().getCommaKeyword_6_2_1_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getAttributeAccess().getOwned_valuesValueParserRuleCall_6_2_1_1_0()); 
	    }
		lv_owned_values_28_0=ruleValue		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getAttributeRule());
	        }
       		add(
       			$current, 
       			"owned_values",
        		lv_owned_values_28_0, 
        		"org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.Data.Value");
	        afterParserOrEnumRuleCall();
	    }

)
))*)?	otherlv_29=')' 
    {
    	newLeafNode(otherlv_29, grammarAccess.getAttributeAccess().getRightParenthesisKeyword_6_3());
    }
)?(
(
		{ 
	        newCompositeNode(grammarAccess.getAttributeAccess().getOwned_annotationsAnnotationParserRuleCall_7_0()); 
	    }
		lv_owned_annotations_30_0=ruleAnnotation		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getAttributeRule());
	        }
       		add(
       			$current, 
       			"owned_annotations",
        		lv_owned_annotations_30_0, 
        		"org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.Data.Annotation");
	        afterParserOrEnumRuleCall();
	    }

)
)*)
;





// Entry rule entryRuleValue
entryRuleValue returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getValueRule()); }
	 iv_ruleValue=ruleValue 
	 { $current=$iv_ruleValue.current; } 
	 EOF 
;

// Rule Value
ruleValue returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
    {
        $current = forceCreateModelElement(
            grammarAccess.getValueAccess().getValueAction_0(),
            $current);
    }
)((
(
		{ 
	        newCompositeNode(grammarAccess.getValueAccess().getNameEStringParserRuleCall_1_0_0()); 
	    }
		lv_name_1_0=ruleEString		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getValueRule());
	        }
       		set(
       			$current, 
       			"name",
        		lv_name_1_0, 
        		"org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.Common.EString");
	        afterParserOrEnumRuleCall();
	    }

)
)	otherlv_2='literal' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getValueAccess().getLiteralKeyword_1_1());
    }
)?(
(
		{ 
	        newCompositeNode(grammarAccess.getValueAccess().getLiteralEStringParserRuleCall_2_0()); 
	    }
		lv_literal_3_0=ruleEString		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getValueRule());
	        }
       		set(
       			$current, 
       			"literal",
        		lv_literal_3_0, 
        		"org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.Common.EString");
	        afterParserOrEnumRuleCall();
	    }

)
))
;





// Entry rule entryRuleOperation
entryRuleOperation returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getOperationRule()); }
	 iv_ruleOperation=ruleOperation 
	 { $current=$iv_ruleOperation.current; } 
	 EOF 
;

// Rule Operation
ruleOperation returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
    {
        $current = forceCreateModelElement(
            grammarAccess.getOperationAccess().getOperationAction_0(),
            $current);
    }
)(
(
		{ 
	        newCompositeNode(grammarAccess.getOperationAccess().getNameEStringParserRuleCall_1_0()); 
	    }
		lv_name_1_0=ruleEString		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getOperationRule());
	        }
       		set(
       			$current, 
       			"name",
        		lv_name_1_0, 
        		"org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.Common.EString");
	        afterParserOrEnumRuleCall();
	    }

)
)	otherlv_2='(' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getOperationAccess().getLeftParenthesisKeyword_2());
    }
((
(
		{ 
	        newCompositeNode(grammarAccess.getOperationAccess().getParametersParameterParserRuleCall_3_0_0()); 
	    }
		lv_parameters_3_0=ruleParameter		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getOperationRule());
	        }
       		add(
       			$current, 
       			"parameters",
        		lv_parameters_3_0, 
        		"org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.Data.Parameter");
	        afterParserOrEnumRuleCall();
	    }

)
)(	otherlv_4=',' 
    {
    	newLeafNode(otherlv_4, grammarAccess.getOperationAccess().getCommaKeyword_3_1_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getOperationAccess().getParametersParameterParserRuleCall_3_1_1_0()); 
	    }
		lv_parameters_5_0=ruleParameter		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getOperationRule());
	        }
       		add(
       			$current, 
       			"parameters",
        		lv_parameters_5_0, 
        		"org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.Data.Parameter");
	        afterParserOrEnumRuleCall();
	    }

)
))*)?	otherlv_6=')' 
    {
    	newLeafNode(otherlv_6, grammarAccess.getOperationAccess().getRightParenthesisKeyword_4());
    }
(	otherlv_7='returns' 
    {
    	newLeafNode(otherlv_7, grammarAccess.getOperationAccess().getReturnsKeyword_5_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getOperationAccess().getOperation_typeAbstractTypeParserRuleCall_5_1_0()); 
	    }
		lv_operation_type_8_0=ruleAbstractType		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getOperationRule());
	        }
       		set(
       			$current, 
       			"operation_type",
        		lv_operation_type_8_0, 
        		"org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.Data.AbstractType");
	        afterParserOrEnumRuleCall();
	    }

)
))?(
(
		{ 
	        newCompositeNode(grammarAccess.getOperationAccess().getOwned_annotationsAnnotationParserRuleCall_6_0()); 
	    }
		lv_owned_annotations_9_0=ruleAnnotation		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getOperationRule());
	        }
       		add(
       			$current, 
       			"owned_annotations",
        		lv_owned_annotations_9_0, 
        		"org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.Data.Annotation");
	        afterParserOrEnumRuleCall();
	    }

)
)*)
;





// Entry rule entryRuleParameter
entryRuleParameter returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getParameterRule()); }
	 iv_ruleParameter=ruleParameter 
	 { $current=$iv_ruleParameter.current; } 
	 EOF 
;

// Rule Parameter
ruleParameter returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
    {
        $current = forceCreateModelElement(
            grammarAccess.getParameterAccess().getParameterAction_0(),
            $current);
    }
)(
(
		{ 
	        newCompositeNode(grammarAccess.getParameterAccess().getParameter_typeAbstractTypeParserRuleCall_1_0()); 
	    }
		lv_parameter_type_1_0=ruleAbstractType		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getParameterRule());
	        }
       		set(
       			$current, 
       			"parameter_type",
        		lv_parameter_type_1_0, 
        		"org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.Data.AbstractType");
	        afterParserOrEnumRuleCall();
	    }

)
)(
(
		{ 
	        newCompositeNode(grammarAccess.getParameterAccess().getNameEStringParserRuleCall_2_0()); 
	    }
		lv_name_2_0=ruleEString		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getParameterRule());
	        }
       		set(
       			$current, 
       			"name",
        		lv_name_2_0, 
        		"org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.Common.EString");
	        afterParserOrEnumRuleCall();
	    }

)
)(
(
		{ 
	        newCompositeNode(grammarAccess.getParameterAccess().getDescriptionEStringParserRuleCall_3_0()); 
	    }
		lv_description_3_0=ruleEString		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getParameterRule());
	        }
       		set(
       			$current, 
       			"description",
        		lv_description_3_0, 
        		"org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.Common.EString");
	        afterParserOrEnumRuleCall();
	    }

)
)?(
(
		{ 
	        newCompositeNode(grammarAccess.getParameterAccess().getOwned_annotationsAnnotationParserRuleCall_4_0()); 
	    }
		lv_owned_annotations_4_0=ruleAnnotation		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getParameterRule());
	        }
       		add(
       			$current, 
       			"owned_annotations",
        		lv_owned_annotations_4_0, 
        		"org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.Data.Annotation");
	        afterParserOrEnumRuleCall();
	    }

)
)*)
;





// Entry rule entryRuleAbstractType
entryRuleAbstractType returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getAbstractTypeRule()); }
	 iv_ruleAbstractType=ruleAbstractType 
	 { $current=$iv_ruleAbstractType.current; } 
	 EOF 
;

// Rule AbstractType
ruleAbstractType returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
    { 
        newCompositeNode(grammarAccess.getAbstractTypeAccess().getLocalTypeParserRuleCall_0()); 
    }
    this_LocalType_0=ruleLocalType
    { 
        $current = $this_LocalType_0.current; 
        afterParserOrEnumRuleCall();
    }

    |
    { 
        newCompositeNode(grammarAccess.getAbstractTypeAccess().getExternalTypeParserRuleCall_1()); 
    }
    this_ExternalType_1=ruleExternalType
    { 
        $current = $this_ExternalType_1.current; 
        afterParserOrEnumRuleCall();
    }
)
;





// Entry rule entryRuleExternalType
entryRuleExternalType returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getExternalTypeRule()); }
	 iv_ruleExternalType=ruleExternalType 
	 { $current=$iv_ruleExternalType.current; } 
	 EOF 
;

// Rule ExternalType
ruleExternalType returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
    {
        $current = forceCreateModelElement(
            grammarAccess.getExternalTypeAccess().getExternalTypeAction_0(),
            $current);
    }
)	otherlv_1='external' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getExternalTypeAccess().getExternalKeyword_1());
    }
(
(
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getExternalTypeRule());
	        }
        }
		{ 
	        newCompositeNode(grammarAccess.getExternalTypeAccess().getTypeEClassifierCrossReference_2_0()); 
	    }
		ruleFQN		{ 
	        afterParserOrEnumRuleCall();
	    }

)
)(
(
		{ 
	        newCompositeNode(grammarAccess.getExternalTypeAccess().getCardinalityCardinalitiesEnumRuleCall_3_0()); 
	    }
		lv_cardinality_3_0=ruleCardinalities		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getExternalTypeRule());
	        }
       		set(
       			$current, 
       			"cardinality",
        		lv_cardinality_3_0, 
        		"org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.Data.Cardinalities");
	        afterParserOrEnumRuleCall();
	    }

)
))
;





// Entry rule entryRuleLocalType
entryRuleLocalType returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getLocalTypeRule()); }
	 iv_ruleLocalType=ruleLocalType 
	 { $current=$iv_ruleLocalType.current; } 
	 EOF 
;

// Rule LocalType
ruleLocalType returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
    {
        $current = forceCreateModelElement(
            grammarAccess.getLocalTypeAccess().getLocalTypeAction_0(),
            $current);
    }
)(
(
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getLocalTypeRule());
	        }
        }
		{ 
	        newCompositeNode(grammarAccess.getLocalTypeAccess().getTypeViewpointClassifierCrossReference_1_0()); 
	    }
		ruleFQN		{ 
	        afterParserOrEnumRuleCall();
	    }

)
)(
(
		{ 
	        newCompositeNode(grammarAccess.getLocalTypeAccess().getCardinalityCardinalitiesEnumRuleCall_2_0()); 
	    }
		lv_cardinality_2_0=ruleCardinalities		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getLocalTypeRule());
	        }
       		set(
       			$current, 
       			"cardinality",
        		lv_cardinality_2_0, 
        		"org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.Data.Cardinalities");
	        afterParserOrEnumRuleCall();
	    }

)
))
;







// Entry rule entryRuleAnnotation
entryRuleAnnotation returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getAnnotationRule()); }
	 iv_ruleAnnotation=ruleAnnotation 
	 { $current=$iv_ruleAnnotation.current; } 
	 EOF 
;

// Rule Annotation
ruleAnnotation returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
    {
        $current = forceCreateModelElement(
            grammarAccess.getAnnotationAccess().getAnnotationAction_0(),
            $current);
    }
)	otherlv_1='Annotation' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getAnnotationAccess().getAnnotationKeyword_1());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getAnnotationAccess().getSourceEStringParserRuleCall_2_0()); 
	    }
		lv_source_2_0=ruleEString		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getAnnotationRule());
	        }
       		set(
       			$current, 
       			"source",
        		lv_source_2_0, 
        		"org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.Common.EString");
	        afterParserOrEnumRuleCall();
	    }

)
)(	otherlv_3='{' 
    {
    	newLeafNode(otherlv_3, grammarAccess.getAnnotationAccess().getLeftCurlyBracketKeyword_3_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getAnnotationAccess().getOwned_detailsDetailParserRuleCall_3_1_0()); 
	    }
		lv_owned_details_4_0=ruleDetail		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getAnnotationRule());
	        }
       		add(
       			$current, 
       			"owned_details",
        		lv_owned_details_4_0, 
        		"org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.Data.Detail");
	        afterParserOrEnumRuleCall();
	    }

)
)+	otherlv_5='}' 
    {
    	newLeafNode(otherlv_5, grammarAccess.getAnnotationAccess().getRightCurlyBracketKeyword_3_2());
    }
)?)
;





// Entry rule entryRuleDetail
entryRuleDetail returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getDetailRule()); }
	 iv_ruleDetail=ruleDetail 
	 { $current=$iv_ruleDetail.current; } 
	 EOF 
;

// Rule Detail
ruleDetail returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
    {
        $current = forceCreateModelElement(
            grammarAccess.getDetailAccess().getDetailAction_0(),
            $current);
    }
)	otherlv_1='key:' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getDetailAccess().getKeyKeyword_1());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getDetailAccess().getKeyEStringParserRuleCall_2_0()); 
	    }
		lv_key_2_0=ruleEString		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getDetailRule());
	        }
       		set(
       			$current, 
       			"key",
        		lv_key_2_0, 
        		"org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.Common.EString");
	        afterParserOrEnumRuleCall();
	    }

)
)(	otherlv_3='value:' 
    {
    	newLeafNode(otherlv_3, grammarAccess.getDetailAccess().getValueKeyword_3_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getDetailAccess().getValueEStringParserRuleCall_3_1_0()); 
	    }
		lv_value_4_0=ruleEString		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getDetailRule());
	        }
       		set(
       			$current, 
       			"value",
        		lv_value_4_0, 
        		"org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.Common.EString");
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







// Rule Association_Types
ruleAssociation_Types returns [Enumerator current=null] 
    @init { enterRule(); }
    @after { leaveRule(); }:
((	enumLiteral_0='contains' 
	{
        $current = grammarAccess.getAssociation_TypesAccess().getContainmentEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
        newLeafNode(enumLiteral_0, grammarAccess.getAssociation_TypesAccess().getContainmentEnumLiteralDeclaration_0()); 
    }
)
    |(	enumLiteral_1='refers' 
	{
        $current = grammarAccess.getAssociation_TypesAccess().getReferenceEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
        newLeafNode(enumLiteral_1, grammarAccess.getAssociation_TypesAccess().getReferenceEnumLiteralDeclaration_1()); 
    }
));



// Rule Cardinalities
ruleCardinalities returns [Enumerator current=null] 
    @init { enterRule(); }
    @after { leaveRule(); }:
((	enumLiteral_0='[0,*]' 
	{
        $current = grammarAccess.getCardinalitiesAccess().getNothing_Or_ManyEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
        newLeafNode(enumLiteral_0, grammarAccess.getCardinalitiesAccess().getNothing_Or_ManyEnumLiteralDeclaration_0()); 
    }
)
    |(	enumLiteral_1='[1,*]' 
	{
        $current = grammarAccess.getCardinalitiesAccess().getOne_Or_ManyEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
        newLeafNode(enumLiteral_1, grammarAccess.getCardinalitiesAccess().getOne_Or_ManyEnumLiteralDeclaration_1()); 
    }
)
    |(	enumLiteral_2='[0,1]' 
	{
        $current = grammarAccess.getCardinalitiesAccess().getNothing_Or_OneEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
        newLeafNode(enumLiteral_2, grammarAccess.getCardinalitiesAccess().getNothing_Or_OneEnumLiteralDeclaration_2()); 
    }
)
    |(	enumLiteral_3='[1,1]' 
	{
        $current = grammarAccess.getCardinalitiesAccess().getOnly_OneEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
        newLeafNode(enumLiteral_3, grammarAccess.getCardinalitiesAccess().getOnly_OneEnumLiteralDeclaration_3()); 
    }
));



RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;



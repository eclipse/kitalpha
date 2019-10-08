/*******************************************************************************
 * Copyright (c) 2017 Thales Global Services S.A.S.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *  Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/
package org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services;

import com.google.inject.Singleton;
import com.google.inject.Inject;

import java.util.List;

import org.eclipse.xtext.*;
import org.eclipse.xtext.service.GrammarProvider;
import org.eclipse.xtext.service.AbstractElementFinder.*;

import org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.CommonGrammarAccess;
import org.eclipse.xtext.common.services.TerminalsGrammarAccess;

@Singleton
public class DataGrammarAccess extends AbstractGrammarElementFinder {
	
	
	public class DataSpecElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.Data.DataSpec");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cDataSpecAction_0 = (Action)cGroup.eContents().get(0);
		private final Assignment cImportsAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cImportsImportParserRuleCall_1_0 = (RuleCall)cImportsAssignment_1.eContents().get(0);
		private final Assignment cDataAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cDataDataParserRuleCall_2_0 = (RuleCall)cDataAssignment_2.eContents().get(0);
		
		//DataSpec:
		//	{DataSpec} imports+=Import* data=Data;
		@Override public ParserRule getRule() { return rule; }

		//{DataSpec} imports+=Import* data=Data
		public Group getGroup() { return cGroup; }

		//{DataSpec}
		public Action getDataSpecAction_0() { return cDataSpecAction_0; }

		//imports+=Import*
		public Assignment getImportsAssignment_1() { return cImportsAssignment_1; }

		//Import
		public RuleCall getImportsImportParserRuleCall_1_0() { return cImportsImportParserRuleCall_1_0; }

		//data=Data
		public Assignment getDataAssignment_2() { return cDataAssignment_2; }

		//Data
		public RuleCall getDataDataParserRuleCall_2_0() { return cDataDataParserRuleCall_2_0; }
	}

	public class AbstractImportElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.Data.AbstractImport");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cImportNamespaceParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cImportURIParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		
		//AbstractImport:
		//	ImportNamespace | ImportURI;
		@Override public ParserRule getRule() { return rule; }

		//ImportNamespace | ImportURI
		public Alternatives getAlternatives() { return cAlternatives; }

		//ImportNamespace
		public RuleCall getImportNamespaceParserRuleCall_0() { return cImportNamespaceParserRuleCall_0; }

		//ImportURI
		public RuleCall getImportURIParserRuleCall_1() { return cImportURIParserRuleCall_1; }
	}

	public class ImportNamespaceElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.Data.ImportNamespace");
		private final Assignment cImportedNamespaceAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cImportedNamespaceFQNParserRuleCall_0 = (RuleCall)cImportedNamespaceAssignment.eContents().get(0);
		
		//ImportNamespace:
		//	importedNamespace=FQN;
		@Override public ParserRule getRule() { return rule; }

		//importedNamespace=FQN
		public Assignment getImportedNamespaceAssignment() { return cImportedNamespaceAssignment; }

		//FQN
		public RuleCall getImportedNamespaceFQNParserRuleCall_0() { return cImportedNamespaceFQNParserRuleCall_0; }
	}

	public class ImportURIElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.Data.ImportURI");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cExternalKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cImportURIAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cImportURIEStringParserRuleCall_1_0 = (RuleCall)cImportURIAssignment_1.eContents().get(0);
		
		//ImportURI:
		//	'external' importURI=EString;
		@Override public ParserRule getRule() { return rule; }

		//'external' importURI=EString
		public Group getGroup() { return cGroup; }

		//'external'
		public Keyword getExternalKeyword_0() { return cExternalKeyword_0; }

		//importURI=EString
		public Assignment getImportURIAssignment_1() { return cImportURIAssignment_1; }

		//EString
		public RuleCall getImportURIEStringParserRuleCall_1_0() { return cImportURIEStringParserRuleCall_1_0; }
	}

	public class ImportElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.Data.Import");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cImportKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final RuleCall cAbstractImportParserRuleCall_1 = (RuleCall)cGroup.eContents().get(1);
		
		//Import:
		//	'import' AbstractImport;
		@Override public ParserRule getRule() { return rule; }

		//'import' AbstractImport
		public Group getGroup() { return cGroup; }

		//'import'
		public Keyword getImportKeyword_0() { return cImportKeyword_0; }

		//AbstractImport
		public RuleCall getAbstractImportParserRuleCall_1() { return cAbstractImportParserRuleCall_1; }
	}

	public class DataElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.Data.Data");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cDataAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cDataKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cNameAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cNameFQNParserRuleCall_2_0 = (RuleCall)cNameAssignment_2.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cOwned_annotationsAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cOwned_annotationsAnnotationParserRuleCall_4_0 = (RuleCall)cOwned_annotationsAssignment_4.eContents().get(0);
		private final UnorderedGroup cUnorderedGroup_5 = (UnorderedGroup)cGroup.eContents().get(5);
		private final Group cGroup_5_0 = (Group)cUnorderedGroup_5.eContents().get(0);
		private final Keyword cDescriptionKeyword_5_0_0 = (Keyword)cGroup_5_0.eContents().get(0);
		private final Assignment cDescriptionAssignment_5_0_1 = (Assignment)cGroup_5_0.eContents().get(1);
		private final RuleCall cDescriptionEStringParserRuleCall_5_0_1_0 = (RuleCall)cDescriptionAssignment_5_0_1.eContents().get(0);
		private final Assignment cVP_ClassesAssignment_5_1 = (Assignment)cUnorderedGroup_5.eContents().get(1);
		private final RuleCall cVP_ClassesClassParserRuleCall_5_1_0 = (RuleCall)cVP_ClassesAssignment_5_1.eContents().get(0);
		private final Assignment cVP_EnumerationsAssignment_5_2 = (Assignment)cUnorderedGroup_5.eContents().get(2);
		private final RuleCall cVP_EnumerationsEnumerationParserRuleCall_5_2_0 = (RuleCall)cVP_EnumerationsAssignment_5_2.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_6 = (Keyword)cGroup.eContents().get(6);
		
		//Data vpdesc::Data:
		//	{vpdesc::Data} 'Data' name=FQN? '{' owned_annotations+=Annotation* (('description:' description=EString)? &
		//	VP_Classes+=Class* & VP_Enumerations+=Enumeration*) '}'
		@Override public ParserRule getRule() { return rule; }

		//{vpdesc::Data} 'Data' name=FQN? '{' owned_annotations+=Annotation* (('description:' description=EString)? &
		//VP_Classes+=Class* & VP_Enumerations+=Enumeration*) '}'
		public Group getGroup() { return cGroup; }

		//{vpdesc::Data}
		public Action getDataAction_0() { return cDataAction_0; }

		//'Data'
		public Keyword getDataKeyword_1() { return cDataKeyword_1; }

		//name=FQN?
		public Assignment getNameAssignment_2() { return cNameAssignment_2; }

		//FQN
		public RuleCall getNameFQNParserRuleCall_2_0() { return cNameFQNParserRuleCall_2_0; }

		//'{'
		public Keyword getLeftCurlyBracketKeyword_3() { return cLeftCurlyBracketKeyword_3; }

		//owned_annotations+=Annotation*
		public Assignment getOwned_annotationsAssignment_4() { return cOwned_annotationsAssignment_4; }

		//Annotation
		public RuleCall getOwned_annotationsAnnotationParserRuleCall_4_0() { return cOwned_annotationsAnnotationParserRuleCall_4_0; }

		//(('description:' description=EString)? & VP_Classes+=Class* & VP_Enumerations+=Enumeration*)
		public UnorderedGroup getUnorderedGroup_5() { return cUnorderedGroup_5; }

		//('description:' description=EString)?
		public Group getGroup_5_0() { return cGroup_5_0; }

		//'description:'
		public Keyword getDescriptionKeyword_5_0_0() { return cDescriptionKeyword_5_0_0; }

		//description=EString
		public Assignment getDescriptionAssignment_5_0_1() { return cDescriptionAssignment_5_0_1; }

		//EString
		public RuleCall getDescriptionEStringParserRuleCall_5_0_1_0() { return cDescriptionEStringParserRuleCall_5_0_1_0; }

		//VP_Classes+=Class*
		public Assignment getVP_ClassesAssignment_5_1() { return cVP_ClassesAssignment_5_1; }

		//Class
		public RuleCall getVP_ClassesClassParserRuleCall_5_1_0() { return cVP_ClassesClassParserRuleCall_5_1_0; }

		//VP_Enumerations+=Enumeration*
		public Assignment getVP_EnumerationsAssignment_5_2() { return cVP_EnumerationsAssignment_5_2; }

		//Enumeration
		public RuleCall getVP_EnumerationsEnumerationParserRuleCall_5_2_0() { return cVP_EnumerationsEnumerationParserRuleCall_5_2_0; }

		//'}'
		public Keyword getRightCurlyBracketKeyword_6() { return cRightCurlyBracketKeyword_6; }
	}

	public class ClassElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.Data.Class");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cClassAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cClassKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cNameAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cNameEStringParserRuleCall_2_0 = (RuleCall)cNameAssignment_2.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Group cGroup_4 = (Group)cGroup.eContents().get(4);
		private final Keyword cDescriptionKeyword_4_0 = (Keyword)cGroup_4.eContents().get(0);
		private final Assignment cDescriptionAssignment_4_1 = (Assignment)cGroup_4.eContents().get(1);
		private final RuleCall cDescriptionEStringParserRuleCall_4_1_0 = (RuleCall)cDescriptionAssignment_4_1.eContents().get(0);
		private final Group cGroup_5 = (Group)cGroup.eContents().get(5);
		private final Keyword cIconKeyword_5_0 = (Keyword)cGroup_5.eContents().get(0);
		private final Assignment cIconAssignment_5_1 = (Assignment)cGroup_5.eContents().get(1);
		private final RuleCall cIconSTRINGTerminalRuleCall_5_1_0 = (RuleCall)cIconAssignment_5_1.eContents().get(0);
		private final Group cGroup_6 = (Group)cGroup.eContents().get(6);
		private final Keyword cExtendsKeyword_6_0 = (Keyword)cGroup_6.eContents().get(0);
		private final Assignment cExtendsAssignment_6_1 = (Assignment)cGroup_6.eContents().get(1);
		private final CrossReference cExtendsEClassCrossReference_6_1_0 = (CrossReference)cExtendsAssignment_6_1.eContents().get(0);
		private final RuleCall cExtendsEClassFQNParserRuleCall_6_1_0_1 = (RuleCall)cExtendsEClassCrossReference_6_1_0.eContents().get(1);
		private final Group cGroup_6_2 = (Group)cGroup_6.eContents().get(2);
		private final Keyword cCommaKeyword_6_2_0 = (Keyword)cGroup_6_2.eContents().get(0);
		private final Assignment cExtendsAssignment_6_2_1 = (Assignment)cGroup_6_2.eContents().get(1);
		private final CrossReference cExtendsEClassCrossReference_6_2_1_0 = (CrossReference)cExtendsAssignment_6_2_1.eContents().get(0);
		private final RuleCall cExtendsEClassFQNParserRuleCall_6_2_1_0_1 = (RuleCall)cExtendsEClassCrossReference_6_2_1_0.eContents().get(1);
		private final Group cGroup_7 = (Group)cGroup.eContents().get(7);
		private final Keyword cSuperClassKeyword_7_0 = (Keyword)cGroup_7.eContents().get(0);
		private final Assignment cInheritencesAssignment_7_1 = (Assignment)cGroup_7.eContents().get(1);
		private final RuleCall cInheritencesAbstractSuperClassParserRuleCall_7_1_0 = (RuleCall)cInheritencesAssignment_7_1.eContents().get(0);
		private final Group cGroup_7_2 = (Group)cGroup_7.eContents().get(2);
		private final Keyword cCommaKeyword_7_2_0 = (Keyword)cGroup_7_2.eContents().get(0);
		private final Assignment cInheritencesAssignment_7_2_1 = (Assignment)cGroup_7_2.eContents().get(1);
		private final RuleCall cInheritencesAbstractSuperClassParserRuleCall_7_2_1_0 = (RuleCall)cInheritencesAssignment_7_2_1.eContents().get(0);
		private final Group cGroup_8 = (Group)cGroup.eContents().get(8);
		private final Keyword cAbstractKeyword_8_0 = (Keyword)cGroup_8.eContents().get(0);
		private final Assignment cAbstractAssignment_8_1 = (Assignment)cGroup_8.eContents().get(1);
		private final RuleCall cAbstractEBooleanParserRuleCall_8_1_0 = (RuleCall)cAbstractAssignment_8_1.eContents().get(0);
		private final Assignment cOwned_annotationsAssignment_9 = (Assignment)cGroup.eContents().get(9);
		private final RuleCall cOwned_annotationsAnnotationParserRuleCall_9_0 = (RuleCall)cOwned_annotationsAssignment_9.eContents().get(0);
		private final Group cGroup_10 = (Group)cGroup.eContents().get(10);
		private final Keyword cAttributesKeyword_10_0 = (Keyword)cGroup_10.eContents().get(0);
		private final Assignment cVP_Class_AttributesAssignment_10_1 = (Assignment)cGroup_10.eContents().get(1);
		private final RuleCall cVP_Class_AttributesAttributeParserRuleCall_10_1_0 = (RuleCall)cVP_Class_AttributesAssignment_10_1.eContents().get(0);
		private final Group cGroup_11 = (Group)cGroup.eContents().get(11);
		private final Keyword cAssociationsKeyword_11_0 = (Keyword)cGroup_11.eContents().get(0);
		private final Assignment cVP_Classes_AssociationsAssignment_11_1 = (Assignment)cGroup_11.eContents().get(1);
		private final RuleCall cVP_Classes_AssociationsAbstractAssociationParserRuleCall_11_1_0 = (RuleCall)cVP_Classes_AssociationsAssignment_11_1.eContents().get(0);
		private final Group cGroup_12 = (Group)cGroup.eContents().get(12);
		private final Keyword cOperationsKeyword_12_0 = (Keyword)cGroup_12.eContents().get(0);
		private final Assignment cVP_Class_OperationsAssignment_12_1 = (Assignment)cGroup_12.eContents().get(1);
		private final RuleCall cVP_Class_OperationsOperationParserRuleCall_12_1_0 = (RuleCall)cVP_Class_OperationsAssignment_12_1.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_13 = (Keyword)cGroup.eContents().get(13);
		
		////ViewpointClassifier returns vpdesc::ViewpointClassifier:
		// //	Class | Enumeration
		// //;
		// Class vpdesc::Class:
		//	{vpdesc::Class} 'Class' name=EString '{' ('description:' description=EString)? ('icon:' icon=STRING)? ('extends'
		//	extends+=[ecore::EClass|FQN] (',' extends+=[ecore::EClass|FQN])*)? ('superClass' Inheritences+=AbstractSuperClass
		//	(',' Inheritences+=AbstractSuperClass)*)? ('abstract:' abstract=EBoolean)? owned_annotations+=Annotation*
		//	('Attributes:' VP_Class_Attributes+=Attribute*)? ('Associations:' VP_Classes_Associations+=AbstractAssociation*)?
		//	('Operations:' VP_Class_Operations+=Operation*)? '}'
		@Override public ParserRule getRule() { return rule; }

		//{vpdesc::Class} 'Class' name=EString '{' ('description:' description=EString)? ('icon:' icon=STRING)? ('extends'
		//extends+=[ecore::EClass|FQN] (',' extends+=[ecore::EClass|FQN])*)? ('superClass' Inheritences+=AbstractSuperClass (','
		//Inheritences+=AbstractSuperClass)*)? ('abstract:' abstract=EBoolean)? owned_annotations+=Annotation* ('Attributes:'
		//VP_Class_Attributes+=Attribute*)? ('Associations:' VP_Classes_Associations+=AbstractAssociation*)? ('Operations:'
		//VP_Class_Operations+=Operation*)? '}'
		public Group getGroup() { return cGroup; }

		//{vpdesc::Class}
		public Action getClassAction_0() { return cClassAction_0; }

		//'Class'
		public Keyword getClassKeyword_1() { return cClassKeyword_1; }

		//name=EString
		public Assignment getNameAssignment_2() { return cNameAssignment_2; }

		//EString
		public RuleCall getNameEStringParserRuleCall_2_0() { return cNameEStringParserRuleCall_2_0; }

		//'{'
		public Keyword getLeftCurlyBracketKeyword_3() { return cLeftCurlyBracketKeyword_3; }

		//('description:' description=EString)?
		public Group getGroup_4() { return cGroup_4; }

		//'description:'
		public Keyword getDescriptionKeyword_4_0() { return cDescriptionKeyword_4_0; }

		//description=EString
		public Assignment getDescriptionAssignment_4_1() { return cDescriptionAssignment_4_1; }

		//EString
		public RuleCall getDescriptionEStringParserRuleCall_4_1_0() { return cDescriptionEStringParserRuleCall_4_1_0; }

		//('icon:' icon=STRING)?
		public Group getGroup_5() { return cGroup_5; }

		//'icon:'
		public Keyword getIconKeyword_5_0() { return cIconKeyword_5_0; }

		//icon=STRING
		public Assignment getIconAssignment_5_1() { return cIconAssignment_5_1; }

		//STRING
		public RuleCall getIconSTRINGTerminalRuleCall_5_1_0() { return cIconSTRINGTerminalRuleCall_5_1_0; }

		//('extends' extends+=[ecore::EClass|FQN] (',' extends+=[ecore::EClass|FQN])*)?
		public Group getGroup_6() { return cGroup_6; }

		//'extends'
		public Keyword getExtendsKeyword_6_0() { return cExtendsKeyword_6_0; }

		//extends+=[ecore::EClass|FQN]
		public Assignment getExtendsAssignment_6_1() { return cExtendsAssignment_6_1; }

		//[ecore::EClass|FQN]
		public CrossReference getExtendsEClassCrossReference_6_1_0() { return cExtendsEClassCrossReference_6_1_0; }

		//FQN
		public RuleCall getExtendsEClassFQNParserRuleCall_6_1_0_1() { return cExtendsEClassFQNParserRuleCall_6_1_0_1; }

		//(',' extends+=[ecore::EClass|FQN])*
		public Group getGroup_6_2() { return cGroup_6_2; }

		//','
		public Keyword getCommaKeyword_6_2_0() { return cCommaKeyword_6_2_0; }

		//extends+=[ecore::EClass|FQN]
		public Assignment getExtendsAssignment_6_2_1() { return cExtendsAssignment_6_2_1; }

		//[ecore::EClass|FQN]
		public CrossReference getExtendsEClassCrossReference_6_2_1_0() { return cExtendsEClassCrossReference_6_2_1_0; }

		//FQN
		public RuleCall getExtendsEClassFQNParserRuleCall_6_2_1_0_1() { return cExtendsEClassFQNParserRuleCall_6_2_1_0_1; }

		//('superClass' Inheritences+=AbstractSuperClass (',' Inheritences+=AbstractSuperClass)*)?
		public Group getGroup_7() { return cGroup_7; }

		//'superClass'
		public Keyword getSuperClassKeyword_7_0() { return cSuperClassKeyword_7_0; }

		//Inheritences+=AbstractSuperClass
		public Assignment getInheritencesAssignment_7_1() { return cInheritencesAssignment_7_1; }

		//AbstractSuperClass
		public RuleCall getInheritencesAbstractSuperClassParserRuleCall_7_1_0() { return cInheritencesAbstractSuperClassParserRuleCall_7_1_0; }

		//(',' Inheritences+=AbstractSuperClass)*
		public Group getGroup_7_2() { return cGroup_7_2; }

		//','
		public Keyword getCommaKeyword_7_2_0() { return cCommaKeyword_7_2_0; }

		//Inheritences+=AbstractSuperClass
		public Assignment getInheritencesAssignment_7_2_1() { return cInheritencesAssignment_7_2_1; }

		//AbstractSuperClass
		public RuleCall getInheritencesAbstractSuperClassParserRuleCall_7_2_1_0() { return cInheritencesAbstractSuperClassParserRuleCall_7_2_1_0; }

		//('abstract:' abstract=EBoolean)?
		public Group getGroup_8() { return cGroup_8; }

		//'abstract:'
		public Keyword getAbstractKeyword_8_0() { return cAbstractKeyword_8_0; }

		//abstract=EBoolean
		public Assignment getAbstractAssignment_8_1() { return cAbstractAssignment_8_1; }

		//EBoolean
		public RuleCall getAbstractEBooleanParserRuleCall_8_1_0() { return cAbstractEBooleanParserRuleCall_8_1_0; }

		//owned_annotations+=Annotation*
		public Assignment getOwned_annotationsAssignment_9() { return cOwned_annotationsAssignment_9; }

		//Annotation
		public RuleCall getOwned_annotationsAnnotationParserRuleCall_9_0() { return cOwned_annotationsAnnotationParserRuleCall_9_0; }

		//('Attributes:' VP_Class_Attributes+=Attribute*)?
		public Group getGroup_10() { return cGroup_10; }

		//'Attributes:'
		public Keyword getAttributesKeyword_10_0() { return cAttributesKeyword_10_0; }

		//VP_Class_Attributes+=Attribute*
		public Assignment getVP_Class_AttributesAssignment_10_1() { return cVP_Class_AttributesAssignment_10_1; }

		//Attribute
		public RuleCall getVP_Class_AttributesAttributeParserRuleCall_10_1_0() { return cVP_Class_AttributesAttributeParserRuleCall_10_1_0; }

		//('Associations:' VP_Classes_Associations+=AbstractAssociation*)?
		public Group getGroup_11() { return cGroup_11; }

		//'Associations:'
		public Keyword getAssociationsKeyword_11_0() { return cAssociationsKeyword_11_0; }

		//VP_Classes_Associations+=AbstractAssociation*
		public Assignment getVP_Classes_AssociationsAssignment_11_1() { return cVP_Classes_AssociationsAssignment_11_1; }

		//AbstractAssociation
		public RuleCall getVP_Classes_AssociationsAbstractAssociationParserRuleCall_11_1_0() { return cVP_Classes_AssociationsAbstractAssociationParserRuleCall_11_1_0; }

		//('Operations:' VP_Class_Operations+=Operation*)?
		public Group getGroup_12() { return cGroup_12; }

		//'Operations:'
		public Keyword getOperationsKeyword_12_0() { return cOperationsKeyword_12_0; }

		//VP_Class_Operations+=Operation*
		public Assignment getVP_Class_OperationsAssignment_12_1() { return cVP_Class_OperationsAssignment_12_1; }

		//Operation
		public RuleCall getVP_Class_OperationsOperationParserRuleCall_12_1_0() { return cVP_Class_OperationsOperationParserRuleCall_12_1_0; }

		//'}'
		public Keyword getRightCurlyBracketKeyword_13() { return cRightCurlyBracketKeyword_13; }
	}

	public class EnumerationElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.Data.Enumeration");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cEnumerationAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cEnumerationKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cNameAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cNameIDTerminalRuleCall_2_0 = (RuleCall)cNameAssignment_2.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cOwned_annotationsAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cOwned_annotationsAnnotationParserRuleCall_4_0 = (RuleCall)cOwned_annotationsAssignment_4.eContents().get(0);
		private final Group cGroup_5 = (Group)cGroup.eContents().get(5);
		private final Assignment cOwnedValuesAssignment_5_0 = (Assignment)cGroup_5.eContents().get(0);
		private final RuleCall cOwnedValuesValueParserRuleCall_5_0_0 = (RuleCall)cOwnedValuesAssignment_5_0.eContents().get(0);
		private final Group cGroup_5_1 = (Group)cGroup_5.eContents().get(1);
		private final Keyword cCommaKeyword_5_1_0 = (Keyword)cGroup_5_1.eContents().get(0);
		private final Assignment cOwnedValuesAssignment_5_1_1 = (Assignment)cGroup_5_1.eContents().get(1);
		private final RuleCall cOwnedValuesValueParserRuleCall_5_1_1_0 = (RuleCall)cOwnedValuesAssignment_5_1_1.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_6 = (Keyword)cGroup.eContents().get(6);
		
		//Enumeration vpdesc::Enumeration:
		//	{vpdesc::Enumeration} 'Enumeration' name=ID '{' owned_annotations+=Annotation* (ownedValues+=Value (','
		//	ownedValues+=Value)*) '}'
		@Override public ParserRule getRule() { return rule; }

		//{vpdesc::Enumeration} 'Enumeration' name=ID '{' owned_annotations+=Annotation* (ownedValues+=Value (','
		//ownedValues+=Value)*) '}'
		public Group getGroup() { return cGroup; }

		//{vpdesc::Enumeration}
		public Action getEnumerationAction_0() { return cEnumerationAction_0; }

		//'Enumeration'
		public Keyword getEnumerationKeyword_1() { return cEnumerationKeyword_1; }

		//name=ID
		public Assignment getNameAssignment_2() { return cNameAssignment_2; }

		//ID
		public RuleCall getNameIDTerminalRuleCall_2_0() { return cNameIDTerminalRuleCall_2_0; }

		//'{'
		public Keyword getLeftCurlyBracketKeyword_3() { return cLeftCurlyBracketKeyword_3; }

		//owned_annotations+=Annotation*
		public Assignment getOwned_annotationsAssignment_4() { return cOwned_annotationsAssignment_4; }

		//Annotation
		public RuleCall getOwned_annotationsAnnotationParserRuleCall_4_0() { return cOwned_annotationsAnnotationParserRuleCall_4_0; }

		//(ownedValues+=Value (',' ownedValues+=Value)*)
		public Group getGroup_5() { return cGroup_5; }

		//ownedValues+=Value
		public Assignment getOwnedValuesAssignment_5_0() { return cOwnedValuesAssignment_5_0; }

		//Value
		public RuleCall getOwnedValuesValueParserRuleCall_5_0_0() { return cOwnedValuesValueParserRuleCall_5_0_0; }

		//(',' ownedValues+=Value)*
		public Group getGroup_5_1() { return cGroup_5_1; }

		//','
		public Keyword getCommaKeyword_5_1_0() { return cCommaKeyword_5_1_0; }

		//ownedValues+=Value
		public Assignment getOwnedValuesAssignment_5_1_1() { return cOwnedValuesAssignment_5_1_1; }

		//Value
		public RuleCall getOwnedValuesValueParserRuleCall_5_1_1_0() { return cOwnedValuesValueParserRuleCall_5_1_1_0; }

		//'}'
		public Keyword getRightCurlyBracketKeyword_6() { return cRightCurlyBracketKeyword_6; }
	}

	public class AbstractSuperClassElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.Data.AbstractSuperClass");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cLocalSuperClassParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cExternalSuperClassParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		
		//AbstractSuperClass vpdesc::AbstractSuperClass:
		//	LocalSuperClass | ExternalSuperClass
		@Override public ParserRule getRule() { return rule; }

		//LocalSuperClass | ExternalSuperClass
		public Alternatives getAlternatives() { return cAlternatives; }

		//LocalSuperClass
		public RuleCall getLocalSuperClassParserRuleCall_0() { return cLocalSuperClassParserRuleCall_0; }

		//ExternalSuperClass
		public RuleCall getExternalSuperClassParserRuleCall_1() { return cExternalSuperClassParserRuleCall_1; }
	}

	public class LocalSuperClassElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.Data.LocalSuperClass");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cLocalSuperClassAction_0 = (Action)cGroup.eContents().get(0);
		private final Assignment cSuperClassAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final CrossReference cSuperClassClassCrossReference_1_0 = (CrossReference)cSuperClassAssignment_1.eContents().get(0);
		private final RuleCall cSuperClassClassFQNParserRuleCall_1_0_1 = (RuleCall)cSuperClassClassCrossReference_1_0.eContents().get(1);
		
		//LocalSuperClass vpdesc::AbstractSuperClass:
		//	{vpdesc::LocalSuperClass} superClass=[vpdesc::Class|FQN]
		@Override public ParserRule getRule() { return rule; }

		//{vpdesc::LocalSuperClass} superClass=[vpdesc::Class|FQN]
		public Group getGroup() { return cGroup; }

		//{vpdesc::LocalSuperClass}
		public Action getLocalSuperClassAction_0() { return cLocalSuperClassAction_0; }

		//superClass=[vpdesc::Class|FQN]
		public Assignment getSuperClassAssignment_1() { return cSuperClassAssignment_1; }

		//[vpdesc::Class|FQN]
		public CrossReference getSuperClassClassCrossReference_1_0() { return cSuperClassClassCrossReference_1_0; }

		//FQN
		public RuleCall getSuperClassClassFQNParserRuleCall_1_0_1() { return cSuperClassClassFQNParserRuleCall_1_0_1; }
	}

	public class ExternalSuperClassElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.Data.ExternalSuperClass");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cExternalSuperClassAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cExternalKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cSuperClassAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final CrossReference cSuperClassEClassCrossReference_2_0 = (CrossReference)cSuperClassAssignment_2.eContents().get(0);
		private final RuleCall cSuperClassEClassFQNParserRuleCall_2_0_1 = (RuleCall)cSuperClassEClassCrossReference_2_0.eContents().get(1);
		
		//ExternalSuperClass vpdesc::AbstractSuperClass:
		//	{vpdesc::ExternalSuperClass} 'external' superClass=[ecore::EClass|FQN]
		@Override public ParserRule getRule() { return rule; }

		//{vpdesc::ExternalSuperClass} 'external' superClass=[ecore::EClass|FQN]
		public Group getGroup() { return cGroup; }

		//{vpdesc::ExternalSuperClass}
		public Action getExternalSuperClassAction_0() { return cExternalSuperClassAction_0; }

		//'external'
		public Keyword getExternalKeyword_1() { return cExternalKeyword_1; }

		//superClass=[ecore::EClass|FQN]
		public Assignment getSuperClassAssignment_2() { return cSuperClassAssignment_2; }

		//[ecore::EClass|FQN]
		public CrossReference getSuperClassEClassCrossReference_2_0() { return cSuperClassEClassCrossReference_2_0; }

		//FQN
		public RuleCall getSuperClassEClassFQNParserRuleCall_2_0_1() { return cSuperClassEClassFQNParserRuleCall_2_0_1; }
	}

	public class AbstractFeatureElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.Data.AbstractFeature");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cAbstractAssociationParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cAttributeParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		
		//AbstractFeature vpdesc::AbstractFeature:
		//	AbstractAssociation | Attribute
		@Override public ParserRule getRule() { return rule; }

		//AbstractAssociation | Attribute
		public Alternatives getAlternatives() { return cAlternatives; }

		//AbstractAssociation
		public RuleCall getAbstractAssociationParserRuleCall_0() { return cAbstractAssociationParserRuleCall_0; }

		//Attribute
		public RuleCall getAttributeParserRuleCall_1() { return cAttributeParserRuleCall_1; }
	}

	public class AbstractAssociationElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.Data.AbstractAssociation");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cLocalClassAssociationParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cExternalClassAssociationParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		
		//AbstractAssociation vpdesc::AbstractAssociation:
		//	LocalClassAssociation | ExternalClassAssociation
		@Override public ParserRule getRule() { return rule; }

		//LocalClassAssociation | ExternalClassAssociation
		public Alternatives getAlternatives() { return cAlternatives; }

		//LocalClassAssociation
		public RuleCall getLocalClassAssociationParserRuleCall_0() { return cLocalClassAssociationParserRuleCall_0; }

		//ExternalClassAssociation
		public RuleCall getExternalClassAssociationParserRuleCall_1() { return cExternalClassAssociationParserRuleCall_1; }
	}

	public class LocalClassAssociationElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.Data.LocalClassAssociation");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cLocalClassAssociationAction_0 = (Action)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameEStringParserRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Group cGroup_2 = (Group)cGroup.eContents().get(2);
		private final Keyword cDescriptionKeyword_2_0 = (Keyword)cGroup_2.eContents().get(0);
		private final Assignment cDescriptionAssignment_2_1 = (Assignment)cGroup_2.eContents().get(1);
		private final RuleCall cDescriptionEStringParserRuleCall_2_1_0 = (RuleCall)cDescriptionAssignment_2_1.eContents().get(0);
		private final Keyword cCommaKeyword_2_2 = (Keyword)cGroup_2.eContents().get(2);
		private final Assignment cTypeAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cTypeAssociation_TypesEnumRuleCall_3_0 = (RuleCall)cTypeAssignment_3.eContents().get(0);
		private final Assignment cCardinalityAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cCardinalityCardinalitiesEnumRuleCall_4_0 = (RuleCall)cCardinalityAssignment_4.eContents().get(0);
		private final Assignment cLocalTargetAssignment_5 = (Assignment)cGroup.eContents().get(5);
		private final CrossReference cLocalTargetClassCrossReference_5_0 = (CrossReference)cLocalTargetAssignment_5.eContents().get(0);
		private final RuleCall cLocalTargetClassFQNParserRuleCall_5_0_1 = (RuleCall)cLocalTargetClassCrossReference_5_0.eContents().get(1);
		private final UnorderedGroup cUnorderedGroup_6 = (UnorderedGroup)cGroup.eContents().get(6);
		private final Group cGroup_6_0 = (Group)cUnorderedGroup_6.eContents().get(0);
		private final Keyword cOppositeKeyword_6_0_0 = (Keyword)cGroup_6_0.eContents().get(0);
		private final Assignment cOppositeAssignment_6_0_1 = (Assignment)cGroup_6_0.eContents().get(1);
		private final CrossReference cOppositeLocalClassAssociationCrossReference_6_0_1_0 = (CrossReference)cOppositeAssignment_6_0_1.eContents().get(0);
		private final RuleCall cOppositeLocalClassAssociationFQNParserRuleCall_6_0_1_0_1 = (RuleCall)cOppositeLocalClassAssociationCrossReference_6_0_1_0.eContents().get(1);
		private final Group cGroup_6_1 = (Group)cUnorderedGroup_6.eContents().get(1);
		private final Keyword cChangeableKeyword_6_1_0 = (Keyword)cGroup_6_1.eContents().get(0);
		private final Assignment cChangeableAssignment_6_1_1 = (Assignment)cGroup_6_1.eContents().get(1);
		private final RuleCall cChangeableEBooleanParserRuleCall_6_1_1_0 = (RuleCall)cChangeableAssignment_6_1_1.eContents().get(0);
		private final Group cGroup_6_2 = (Group)cUnorderedGroup_6.eContents().get(2);
		private final Keyword cDerivedKeyword_6_2_0 = (Keyword)cGroup_6_2.eContents().get(0);
		private final Assignment cDerivedAssignment_6_2_1 = (Assignment)cGroup_6_2.eContents().get(1);
		private final RuleCall cDerivedEBooleanParserRuleCall_6_2_1_0 = (RuleCall)cDerivedAssignment_6_2_1.eContents().get(0);
		private final Group cGroup_6_3 = (Group)cUnorderedGroup_6.eContents().get(3);
		private final Keyword cOrderedKeyword_6_3_0 = (Keyword)cGroup_6_3.eContents().get(0);
		private final Assignment cOrderedAssignment_6_3_1 = (Assignment)cGroup_6_3.eContents().get(1);
		private final RuleCall cOrderedEBooleanParserRuleCall_6_3_1_0 = (RuleCall)cOrderedAssignment_6_3_1.eContents().get(0);
		private final Group cGroup_6_4 = (Group)cUnorderedGroup_6.eContents().get(4);
		private final Keyword cTransientKeyword_6_4_0 = (Keyword)cGroup_6_4.eContents().get(0);
		private final Assignment cTransientAssignment_6_4_1 = (Assignment)cGroup_6_4.eContents().get(1);
		private final RuleCall cTransientEBooleanParserRuleCall_6_4_1_0 = (RuleCall)cTransientAssignment_6_4_1.eContents().get(0);
		private final Group cGroup_6_5 = (Group)cUnorderedGroup_6.eContents().get(5);
		private final Keyword cUniqueKeyword_6_5_0 = (Keyword)cGroup_6_5.eContents().get(0);
		private final Assignment cUniqueAssignment_6_5_1 = (Assignment)cGroup_6_5.eContents().get(1);
		private final RuleCall cUniqueEBooleanParserRuleCall_6_5_1_0 = (RuleCall)cUniqueAssignment_6_5_1.eContents().get(0);
		private final Group cGroup_6_6 = (Group)cUnorderedGroup_6.eContents().get(6);
		private final Keyword cUnsettableKeyword_6_6_0 = (Keyword)cGroup_6_6.eContents().get(0);
		private final Assignment cUnsettableAssignment_6_6_1 = (Assignment)cGroup_6_6.eContents().get(1);
		private final RuleCall cUnsettableEBooleanParserRuleCall_6_6_1_0 = (RuleCall)cUnsettableAssignment_6_6_1.eContents().get(0);
		private final Group cGroup_6_7 = (Group)cUnorderedGroup_6.eContents().get(7);
		private final Keyword cVolatileKeyword_6_7_0 = (Keyword)cGroup_6_7.eContents().get(0);
		private final Assignment cVolatileAssignment_6_7_1 = (Assignment)cGroup_6_7.eContents().get(1);
		private final RuleCall cVolatileEBooleanParserRuleCall_6_7_1_0 = (RuleCall)cVolatileAssignment_6_7_1.eContents().get(0);
		private final Assignment cOwned_annotationsAssignment_7 = (Assignment)cGroup.eContents().get(7);
		private final RuleCall cOwned_annotationsAnnotationParserRuleCall_7_0 = (RuleCall)cOwned_annotationsAssignment_7.eContents().get(0);
		
		//LocalClassAssociation vpdesc::AbstractAssociation:
		//	{vpdesc::LocalClassAssociation} name=EString ('description' description=EString ',')? type=Association_Types
		//	cardinality=Cardinalities LocalTarget=[vpdesc::Class|FQN] (('opposite:'
		//	opposite=[vpdesc::LocalClassAssociation|FQN])? & ('changeable:' changeable=EBoolean)? & ('derived:'
		//	derived=EBoolean)? & ('ordered:' ordered=EBoolean)? & ('transient:' transient=EBoolean)? & ('unique:'
		//	unique=EBoolean)? & ('unsettable:' unsettable=EBoolean)? & ('volatile:' volatile=EBoolean)?)
		//	owned_annotations+=Annotation*
		@Override public ParserRule getRule() { return rule; }

		//{vpdesc::LocalClassAssociation} name=EString ('description' description=EString ',')? type=Association_Types
		//cardinality=Cardinalities LocalTarget=[vpdesc::Class|FQN] (('opposite:' opposite=[vpdesc::LocalClassAssociation|FQN])?
		//& ('changeable:' changeable=EBoolean)? & ('derived:' derived=EBoolean)? & ('ordered:' ordered=EBoolean)? &
		//('transient:' transient=EBoolean)? & ('unique:' unique=EBoolean)? & ('unsettable:' unsettable=EBoolean)? &
		//('volatile:' volatile=EBoolean)?) owned_annotations+=Annotation*
		public Group getGroup() { return cGroup; }

		//{vpdesc::LocalClassAssociation}
		public Action getLocalClassAssociationAction_0() { return cLocalClassAssociationAction_0; }

		//name=EString
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }

		//EString
		public RuleCall getNameEStringParserRuleCall_1_0() { return cNameEStringParserRuleCall_1_0; }

		//('description' description=EString ',')?
		public Group getGroup_2() { return cGroup_2; }

		//'description'
		public Keyword getDescriptionKeyword_2_0() { return cDescriptionKeyword_2_0; }

		//description=EString
		public Assignment getDescriptionAssignment_2_1() { return cDescriptionAssignment_2_1; }

		//EString
		public RuleCall getDescriptionEStringParserRuleCall_2_1_0() { return cDescriptionEStringParserRuleCall_2_1_0; }

		//','
		public Keyword getCommaKeyword_2_2() { return cCommaKeyword_2_2; }

		//type=Association_Types
		public Assignment getTypeAssignment_3() { return cTypeAssignment_3; }

		//Association_Types
		public RuleCall getTypeAssociation_TypesEnumRuleCall_3_0() { return cTypeAssociation_TypesEnumRuleCall_3_0; }

		//cardinality=Cardinalities
		public Assignment getCardinalityAssignment_4() { return cCardinalityAssignment_4; }

		//Cardinalities
		public RuleCall getCardinalityCardinalitiesEnumRuleCall_4_0() { return cCardinalityCardinalitiesEnumRuleCall_4_0; }

		//LocalTarget=[vpdesc::Class|FQN]
		public Assignment getLocalTargetAssignment_5() { return cLocalTargetAssignment_5; }

		//[vpdesc::Class|FQN]
		public CrossReference getLocalTargetClassCrossReference_5_0() { return cLocalTargetClassCrossReference_5_0; }

		//FQN
		public RuleCall getLocalTargetClassFQNParserRuleCall_5_0_1() { return cLocalTargetClassFQNParserRuleCall_5_0_1; }

		//(('opposite:' opposite=[vpdesc::LocalClassAssociation|FQN])? & ('changeable:' changeable=EBoolean)? & ('derived:'
		//derived=EBoolean)? & ('ordered:' ordered=EBoolean)? & ('transient:' transient=EBoolean)? & ('unique:'
		//unique=EBoolean)? & ('unsettable:' unsettable=EBoolean)? & ('volatile:' volatile=EBoolean)?)
		public UnorderedGroup getUnorderedGroup_6() { return cUnorderedGroup_6; }

		//('opposite:' opposite=[vpdesc::LocalClassAssociation|FQN])?
		public Group getGroup_6_0() { return cGroup_6_0; }

		//'opposite:'
		public Keyword getOppositeKeyword_6_0_0() { return cOppositeKeyword_6_0_0; }

		//opposite=[vpdesc::LocalClassAssociation|FQN]
		public Assignment getOppositeAssignment_6_0_1() { return cOppositeAssignment_6_0_1; }

		//[vpdesc::LocalClassAssociation|FQN]
		public CrossReference getOppositeLocalClassAssociationCrossReference_6_0_1_0() { return cOppositeLocalClassAssociationCrossReference_6_0_1_0; }

		//FQN
		public RuleCall getOppositeLocalClassAssociationFQNParserRuleCall_6_0_1_0_1() { return cOppositeLocalClassAssociationFQNParserRuleCall_6_0_1_0_1; }

		//('changeable:' changeable=EBoolean)?
		public Group getGroup_6_1() { return cGroup_6_1; }

		//'changeable:'
		public Keyword getChangeableKeyword_6_1_0() { return cChangeableKeyword_6_1_0; }

		//changeable=EBoolean
		public Assignment getChangeableAssignment_6_1_1() { return cChangeableAssignment_6_1_1; }

		//EBoolean
		public RuleCall getChangeableEBooleanParserRuleCall_6_1_1_0() { return cChangeableEBooleanParserRuleCall_6_1_1_0; }

		//('derived:' derived=EBoolean)?
		public Group getGroup_6_2() { return cGroup_6_2; }

		//'derived:'
		public Keyword getDerivedKeyword_6_2_0() { return cDerivedKeyword_6_2_0; }

		//derived=EBoolean
		public Assignment getDerivedAssignment_6_2_1() { return cDerivedAssignment_6_2_1; }

		//EBoolean
		public RuleCall getDerivedEBooleanParserRuleCall_6_2_1_0() { return cDerivedEBooleanParserRuleCall_6_2_1_0; }

		//('ordered:' ordered=EBoolean)?
		public Group getGroup_6_3() { return cGroup_6_3; }

		//'ordered:'
		public Keyword getOrderedKeyword_6_3_0() { return cOrderedKeyword_6_3_0; }

		//ordered=EBoolean
		public Assignment getOrderedAssignment_6_3_1() { return cOrderedAssignment_6_3_1; }

		//EBoolean
		public RuleCall getOrderedEBooleanParserRuleCall_6_3_1_0() { return cOrderedEBooleanParserRuleCall_6_3_1_0; }

		//('transient:' transient=EBoolean)?
		public Group getGroup_6_4() { return cGroup_6_4; }

		//'transient:'
		public Keyword getTransientKeyword_6_4_0() { return cTransientKeyword_6_4_0; }

		//transient=EBoolean
		public Assignment getTransientAssignment_6_4_1() { return cTransientAssignment_6_4_1; }

		//EBoolean
		public RuleCall getTransientEBooleanParserRuleCall_6_4_1_0() { return cTransientEBooleanParserRuleCall_6_4_1_0; }

		//('unique:' unique=EBoolean)?
		public Group getGroup_6_5() { return cGroup_6_5; }

		//'unique:'
		public Keyword getUniqueKeyword_6_5_0() { return cUniqueKeyword_6_5_0; }

		//unique=EBoolean
		public Assignment getUniqueAssignment_6_5_1() { return cUniqueAssignment_6_5_1; }

		//EBoolean
		public RuleCall getUniqueEBooleanParserRuleCall_6_5_1_0() { return cUniqueEBooleanParserRuleCall_6_5_1_0; }

		//('unsettable:' unsettable=EBoolean)?
		public Group getGroup_6_6() { return cGroup_6_6; }

		//'unsettable:'
		public Keyword getUnsettableKeyword_6_6_0() { return cUnsettableKeyword_6_6_0; }

		//unsettable=EBoolean
		public Assignment getUnsettableAssignment_6_6_1() { return cUnsettableAssignment_6_6_1; }

		//EBoolean
		public RuleCall getUnsettableEBooleanParserRuleCall_6_6_1_0() { return cUnsettableEBooleanParserRuleCall_6_6_1_0; }

		//('volatile:' volatile=EBoolean)?
		public Group getGroup_6_7() { return cGroup_6_7; }

		//'volatile:'
		public Keyword getVolatileKeyword_6_7_0() { return cVolatileKeyword_6_7_0; }

		//volatile=EBoolean
		public Assignment getVolatileAssignment_6_7_1() { return cVolatileAssignment_6_7_1; }

		//EBoolean
		public RuleCall getVolatileEBooleanParserRuleCall_6_7_1_0() { return cVolatileEBooleanParserRuleCall_6_7_1_0; }

		//owned_annotations+=Annotation*
		public Assignment getOwned_annotationsAssignment_7() { return cOwned_annotationsAssignment_7; }

		//Annotation
		public RuleCall getOwned_annotationsAnnotationParserRuleCall_7_0() { return cOwned_annotationsAnnotationParserRuleCall_7_0; }
	}

	public class ExternalClassAssociationElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.Data.ExternalClassAssociation");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cExternalClassAssociationAction_0 = (Action)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameEStringParserRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Group cGroup_2 = (Group)cGroup.eContents().get(2);
		private final Keyword cDescriptionKeyword_2_0 = (Keyword)cGroup_2.eContents().get(0);
		private final Assignment cDescriptionAssignment_2_1 = (Assignment)cGroup_2.eContents().get(1);
		private final RuleCall cDescriptionEStringParserRuleCall_2_1_0 = (RuleCall)cDescriptionAssignment_2_1.eContents().get(0);
		private final Keyword cCommaKeyword_2_2 = (Keyword)cGroup_2.eContents().get(2);
		private final Assignment cTypeAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cTypeAssociation_TypesEnumRuleCall_3_0 = (RuleCall)cTypeAssignment_3.eContents().get(0);
		private final Assignment cCardinalityAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cCardinalityCardinalitiesEnumRuleCall_4_0 = (RuleCall)cCardinalityAssignment_4.eContents().get(0);
		private final Keyword cExternalKeyword_5 = (Keyword)cGroup.eContents().get(5);
		private final Assignment cExternalTargetAssignment_6 = (Assignment)cGroup.eContents().get(6);
		private final CrossReference cExternalTargetEClassCrossReference_6_0 = (CrossReference)cExternalTargetAssignment_6.eContents().get(0);
		private final RuleCall cExternalTargetEClassFQNParserRuleCall_6_0_1 = (RuleCall)cExternalTargetEClassCrossReference_6_0.eContents().get(1);
		private final UnorderedGroup cUnorderedGroup_7 = (UnorderedGroup)cGroup.eContents().get(7);
		private final Group cGroup_7_0 = (Group)cUnorderedGroup_7.eContents().get(0);
		private final Keyword cChangeableKeyword_7_0_0 = (Keyword)cGroup_7_0.eContents().get(0);
		private final Assignment cChangeableAssignment_7_0_1 = (Assignment)cGroup_7_0.eContents().get(1);
		private final RuleCall cChangeableEBooleanParserRuleCall_7_0_1_0 = (RuleCall)cChangeableAssignment_7_0_1.eContents().get(0);
		private final Group cGroup_7_1 = (Group)cUnorderedGroup_7.eContents().get(1);
		private final Keyword cDerivedKeyword_7_1_0 = (Keyword)cGroup_7_1.eContents().get(0);
		private final Assignment cDerivedAssignment_7_1_1 = (Assignment)cGroup_7_1.eContents().get(1);
		private final RuleCall cDerivedEBooleanParserRuleCall_7_1_1_0 = (RuleCall)cDerivedAssignment_7_1_1.eContents().get(0);
		private final Group cGroup_7_2 = (Group)cUnorderedGroup_7.eContents().get(2);
		private final Keyword cOrderedKeyword_7_2_0 = (Keyword)cGroup_7_2.eContents().get(0);
		private final Assignment cOrderedAssignment_7_2_1 = (Assignment)cGroup_7_2.eContents().get(1);
		private final RuleCall cOrderedEBooleanParserRuleCall_7_2_1_0 = (RuleCall)cOrderedAssignment_7_2_1.eContents().get(0);
		private final Group cGroup_7_3 = (Group)cUnorderedGroup_7.eContents().get(3);
		private final Keyword cTransientKeyword_7_3_0 = (Keyword)cGroup_7_3.eContents().get(0);
		private final Assignment cTransientAssignment_7_3_1 = (Assignment)cGroup_7_3.eContents().get(1);
		private final RuleCall cTransientEBooleanParserRuleCall_7_3_1_0 = (RuleCall)cTransientAssignment_7_3_1.eContents().get(0);
		private final Group cGroup_7_4 = (Group)cUnorderedGroup_7.eContents().get(4);
		private final Keyword cUniqueKeyword_7_4_0 = (Keyword)cGroup_7_4.eContents().get(0);
		private final Assignment cUniqueAssignment_7_4_1 = (Assignment)cGroup_7_4.eContents().get(1);
		private final RuleCall cUniqueEBooleanParserRuleCall_7_4_1_0 = (RuleCall)cUniqueAssignment_7_4_1.eContents().get(0);
		private final Group cGroup_7_5 = (Group)cUnorderedGroup_7.eContents().get(5);
		private final Keyword cUnsettableKeyword_7_5_0 = (Keyword)cGroup_7_5.eContents().get(0);
		private final Assignment cUnsettableAssignment_7_5_1 = (Assignment)cGroup_7_5.eContents().get(1);
		private final RuleCall cUnsettableEBooleanParserRuleCall_7_5_1_0 = (RuleCall)cUnsettableAssignment_7_5_1.eContents().get(0);
		private final Group cGroup_7_6 = (Group)cUnorderedGroup_7.eContents().get(6);
		private final Keyword cVolatileKeyword_7_6_0 = (Keyword)cGroup_7_6.eContents().get(0);
		private final Assignment cVolatileAssignment_7_6_1 = (Assignment)cGroup_7_6.eContents().get(1);
		private final RuleCall cVolatileEBooleanParserRuleCall_7_6_1_0 = (RuleCall)cVolatileAssignment_7_6_1.eContents().get(0);
		private final Assignment cOwned_annotationsAssignment_8 = (Assignment)cGroup.eContents().get(8);
		private final RuleCall cOwned_annotationsAnnotationParserRuleCall_8_0 = (RuleCall)cOwned_annotationsAssignment_8.eContents().get(0);
		
		//ExternalClassAssociation vpdesc::AbstractAssociation:
		//	{vpdesc::ExternalClassAssociation} name=EString ('description' description=EString ',')? type=Association_Types
		//	cardinality=Cardinalities 'external' ExternalTarget=[ecore::EClass|FQN] (('changeable:' changeable=EBoolean)? &
		//	('derived:' derived=EBoolean)? & ('ordered:' ordered=EBoolean)? & ('transient:' transient=EBoolean)? & ('unique:'
		//	unique=EBoolean)? & ('unsettable:' unsettable=EBoolean)? & ('volatile:' volatile=EBoolean)?)
		//	owned_annotations+=Annotation*
		@Override public ParserRule getRule() { return rule; }

		//{vpdesc::ExternalClassAssociation} name=EString ('description' description=EString ',')? type=Association_Types
		//cardinality=Cardinalities 'external' ExternalTarget=[ecore::EClass|FQN] (('changeable:' changeable=EBoolean)? &
		//('derived:' derived=EBoolean)? & ('ordered:' ordered=EBoolean)? & ('transient:' transient=EBoolean)? & ('unique:'
		//unique=EBoolean)? & ('unsettable:' unsettable=EBoolean)? & ('volatile:' volatile=EBoolean)?)
		//owned_annotations+=Annotation*
		public Group getGroup() { return cGroup; }

		//{vpdesc::ExternalClassAssociation}
		public Action getExternalClassAssociationAction_0() { return cExternalClassAssociationAction_0; }

		//name=EString
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }

		//EString
		public RuleCall getNameEStringParserRuleCall_1_0() { return cNameEStringParserRuleCall_1_0; }

		//('description' description=EString ',')?
		public Group getGroup_2() { return cGroup_2; }

		//'description'
		public Keyword getDescriptionKeyword_2_0() { return cDescriptionKeyword_2_0; }

		//description=EString
		public Assignment getDescriptionAssignment_2_1() { return cDescriptionAssignment_2_1; }

		//EString
		public RuleCall getDescriptionEStringParserRuleCall_2_1_0() { return cDescriptionEStringParserRuleCall_2_1_0; }

		//','
		public Keyword getCommaKeyword_2_2() { return cCommaKeyword_2_2; }

		//type=Association_Types
		public Assignment getTypeAssignment_3() { return cTypeAssignment_3; }

		//Association_Types
		public RuleCall getTypeAssociation_TypesEnumRuleCall_3_0() { return cTypeAssociation_TypesEnumRuleCall_3_0; }

		//cardinality=Cardinalities
		public Assignment getCardinalityAssignment_4() { return cCardinalityAssignment_4; }

		//Cardinalities
		public RuleCall getCardinalityCardinalitiesEnumRuleCall_4_0() { return cCardinalityCardinalitiesEnumRuleCall_4_0; }

		//'external'
		public Keyword getExternalKeyword_5() { return cExternalKeyword_5; }

		//ExternalTarget=[ecore::EClass|FQN]
		public Assignment getExternalTargetAssignment_6() { return cExternalTargetAssignment_6; }

		//[ecore::EClass|FQN]
		public CrossReference getExternalTargetEClassCrossReference_6_0() { return cExternalTargetEClassCrossReference_6_0; }

		//FQN
		public RuleCall getExternalTargetEClassFQNParserRuleCall_6_0_1() { return cExternalTargetEClassFQNParserRuleCall_6_0_1; }

		//(('changeable:' changeable=EBoolean)? & ('derived:' derived=EBoolean)? & ('ordered:' ordered=EBoolean)? & ('transient:'
		//transient=EBoolean)? & ('unique:' unique=EBoolean)? & ('unsettable:' unsettable=EBoolean)? & ('volatile:'
		//volatile=EBoolean)?)
		public UnorderedGroup getUnorderedGroup_7() { return cUnorderedGroup_7; }

		//('changeable:' changeable=EBoolean)?
		public Group getGroup_7_0() { return cGroup_7_0; }

		//'changeable:'
		public Keyword getChangeableKeyword_7_0_0() { return cChangeableKeyword_7_0_0; }

		//changeable=EBoolean
		public Assignment getChangeableAssignment_7_0_1() { return cChangeableAssignment_7_0_1; }

		//EBoolean
		public RuleCall getChangeableEBooleanParserRuleCall_7_0_1_0() { return cChangeableEBooleanParserRuleCall_7_0_1_0; }

		//('derived:' derived=EBoolean)?
		public Group getGroup_7_1() { return cGroup_7_1; }

		//'derived:'
		public Keyword getDerivedKeyword_7_1_0() { return cDerivedKeyword_7_1_0; }

		//derived=EBoolean
		public Assignment getDerivedAssignment_7_1_1() { return cDerivedAssignment_7_1_1; }

		//EBoolean
		public RuleCall getDerivedEBooleanParserRuleCall_7_1_1_0() { return cDerivedEBooleanParserRuleCall_7_1_1_0; }

		//('ordered:' ordered=EBoolean)?
		public Group getGroup_7_2() { return cGroup_7_2; }

		//'ordered:'
		public Keyword getOrderedKeyword_7_2_0() { return cOrderedKeyword_7_2_0; }

		//ordered=EBoolean
		public Assignment getOrderedAssignment_7_2_1() { return cOrderedAssignment_7_2_1; }

		//EBoolean
		public RuleCall getOrderedEBooleanParserRuleCall_7_2_1_0() { return cOrderedEBooleanParserRuleCall_7_2_1_0; }

		//('transient:' transient=EBoolean)?
		public Group getGroup_7_3() { return cGroup_7_3; }

		//'transient:'
		public Keyword getTransientKeyword_7_3_0() { return cTransientKeyword_7_3_0; }

		//transient=EBoolean
		public Assignment getTransientAssignment_7_3_1() { return cTransientAssignment_7_3_1; }

		//EBoolean
		public RuleCall getTransientEBooleanParserRuleCall_7_3_1_0() { return cTransientEBooleanParserRuleCall_7_3_1_0; }

		//('unique:' unique=EBoolean)?
		public Group getGroup_7_4() { return cGroup_7_4; }

		//'unique:'
		public Keyword getUniqueKeyword_7_4_0() { return cUniqueKeyword_7_4_0; }

		//unique=EBoolean
		public Assignment getUniqueAssignment_7_4_1() { return cUniqueAssignment_7_4_1; }

		//EBoolean
		public RuleCall getUniqueEBooleanParserRuleCall_7_4_1_0() { return cUniqueEBooleanParserRuleCall_7_4_1_0; }

		//('unsettable:' unsettable=EBoolean)?
		public Group getGroup_7_5() { return cGroup_7_5; }

		//'unsettable:'
		public Keyword getUnsettableKeyword_7_5_0() { return cUnsettableKeyword_7_5_0; }

		//unsettable=EBoolean
		public Assignment getUnsettableAssignment_7_5_1() { return cUnsettableAssignment_7_5_1; }

		//EBoolean
		public RuleCall getUnsettableEBooleanParserRuleCall_7_5_1_0() { return cUnsettableEBooleanParserRuleCall_7_5_1_0; }

		//('volatile:' volatile=EBoolean)?
		public Group getGroup_7_6() { return cGroup_7_6; }

		//'volatile:'
		public Keyword getVolatileKeyword_7_6_0() { return cVolatileKeyword_7_6_0; }

		//volatile=EBoolean
		public Assignment getVolatileAssignment_7_6_1() { return cVolatileAssignment_7_6_1; }

		//EBoolean
		public RuleCall getVolatileEBooleanParserRuleCall_7_6_1_0() { return cVolatileEBooleanParserRuleCall_7_6_1_0; }

		//owned_annotations+=Annotation*
		public Assignment getOwned_annotationsAssignment_8() { return cOwned_annotationsAssignment_8; }

		//Annotation
		public RuleCall getOwned_annotationsAnnotationParserRuleCall_8_0() { return cOwned_annotationsAnnotationParserRuleCall_8_0; }
	}

	public class AbstractAttributeTypeElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.Data.AbstractAttributeType");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cLocalAttributeTypeParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cExternalAttributeTypeParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		
		//AbstractAttributeType vpdesc::AbstractAttributeType:
		//	LocalAttributeType | ExternalAttributeType
		@Override public ParserRule getRule() { return rule; }

		//LocalAttributeType | ExternalAttributeType
		public Alternatives getAlternatives() { return cAlternatives; }

		//LocalAttributeType
		public RuleCall getLocalAttributeTypeParserRuleCall_0() { return cLocalAttributeTypeParserRuleCall_0; }

		//ExternalAttributeType
		public RuleCall getExternalAttributeTypeParserRuleCall_1() { return cExternalAttributeTypeParserRuleCall_1; }
	}

	public class LocalAttributeTypeElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.Data.LocalAttributeType");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cLocalAttributeTypeAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cEnumKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cTypeAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final CrossReference cTypeEnumerationCrossReference_2_0 = (CrossReference)cTypeAssignment_2.eContents().get(0);
		private final RuleCall cTypeEnumerationFQNParserRuleCall_2_0_1 = (RuleCall)cTypeEnumerationCrossReference_2_0.eContents().get(1);
		
		//LocalAttributeType vpdesc::AbstractAttributeType:
		//	{vpdesc::LocalAttributeType} 'enum' type=[vpdesc::Enumeration|FQN]
		@Override public ParserRule getRule() { return rule; }

		//{vpdesc::LocalAttributeType} 'enum' type=[vpdesc::Enumeration|FQN]
		public Group getGroup() { return cGroup; }

		//{vpdesc::LocalAttributeType}
		public Action getLocalAttributeTypeAction_0() { return cLocalAttributeTypeAction_0; }

		//'enum'
		public Keyword getEnumKeyword_1() { return cEnumKeyword_1; }

		//type=[vpdesc::Enumeration|FQN]
		public Assignment getTypeAssignment_2() { return cTypeAssignment_2; }

		//[vpdesc::Enumeration|FQN]
		public CrossReference getTypeEnumerationCrossReference_2_0() { return cTypeEnumerationCrossReference_2_0; }

		//FQN
		public RuleCall getTypeEnumerationFQNParserRuleCall_2_0_1() { return cTypeEnumerationFQNParserRuleCall_2_0_1; }
	}

	public class ExternalAttributeTypeElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.Data.ExternalAttributeType");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cExternalAttributeTypeAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cTypeKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cTypeAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final CrossReference cTypeEDataTypeCrossReference_2_0 = (CrossReference)cTypeAssignment_2.eContents().get(0);
		private final RuleCall cTypeEDataTypeFQNParserRuleCall_2_0_1 = (RuleCall)cTypeEDataTypeCrossReference_2_0.eContents().get(1);
		
		//ExternalAttributeType vpdesc::AbstractAttributeType:
		//	{vpdesc::ExternalAttributeType} 'type' type=[ecore::EDataType|FQN]
		@Override public ParserRule getRule() { return rule; }

		//{vpdesc::ExternalAttributeType} 'type' type=[ecore::EDataType|FQN]
		public Group getGroup() { return cGroup; }

		//{vpdesc::ExternalAttributeType}
		public Action getExternalAttributeTypeAction_0() { return cExternalAttributeTypeAction_0; }

		//'type'
		public Keyword getTypeKeyword_1() { return cTypeKeyword_1; }

		//type=[ecore::EDataType|FQN]
		public Assignment getTypeAssignment_2() { return cTypeAssignment_2; }

		//[ecore::EDataType|FQN]
		public CrossReference getTypeEDataTypeCrossReference_2_0() { return cTypeEDataTypeCrossReference_2_0; }

		//FQN
		public RuleCall getTypeEDataTypeFQNParserRuleCall_2_0_1() { return cTypeEDataTypeFQNParserRuleCall_2_0_1; }
	}

	public class AttributeElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.Data.Attribute");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cAttributeAction_0 = (Action)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameEStringParserRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Group cGroup_2 = (Group)cGroup.eContents().get(2);
		private final Keyword cDescriptionKeyword_2_0 = (Keyword)cGroup_2.eContents().get(0);
		private final Assignment cDescriptionAssignment_2_1 = (Assignment)cGroup_2.eContents().get(1);
		private final RuleCall cDescriptionEStringParserRuleCall_2_1_0 = (RuleCall)cDescriptionAssignment_2_1.eContents().get(0);
		private final Keyword cCommaKeyword_2_2 = (Keyword)cGroup_2.eContents().get(2);
		private final Assignment cOwned_typeAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cOwned_typeAbstractAttributeTypeParserRuleCall_3_0 = (RuleCall)cOwned_typeAssignment_3.eContents().get(0);
		private final Assignment cCardinalityAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cCardinalityCardinalitiesEnumRuleCall_4_0 = (RuleCall)cCardinalityAssignment_4.eContents().get(0);
		private final UnorderedGroup cUnorderedGroup_5 = (UnorderedGroup)cGroup.eContents().get(5);
		private final Group cGroup_5_0 = (Group)cUnorderedGroup_5.eContents().get(0);
		private final Keyword cIdKeyword_5_0_0 = (Keyword)cGroup_5_0.eContents().get(0);
		private final Assignment cIsIdAssignment_5_0_1 = (Assignment)cGroup_5_0.eContents().get(1);
		private final RuleCall cIsIdEBooleanParserRuleCall_5_0_1_0 = (RuleCall)cIsIdAssignment_5_0_1.eContents().get(0);
		private final Group cGroup_5_1 = (Group)cUnorderedGroup_5.eContents().get(1);
		private final Keyword cChangeableKeyword_5_1_0 = (Keyword)cGroup_5_1.eContents().get(0);
		private final Assignment cChangeableAssignment_5_1_1 = (Assignment)cGroup_5_1.eContents().get(1);
		private final RuleCall cChangeableEBooleanParserRuleCall_5_1_1_0 = (RuleCall)cChangeableAssignment_5_1_1.eContents().get(0);
		private final Group cGroup_5_2 = (Group)cUnorderedGroup_5.eContents().get(2);
		private final Keyword cDerivedKeyword_5_2_0 = (Keyword)cGroup_5_2.eContents().get(0);
		private final Assignment cDerivedAssignment_5_2_1 = (Assignment)cGroup_5_2.eContents().get(1);
		private final RuleCall cDerivedEBooleanParserRuleCall_5_2_1_0 = (RuleCall)cDerivedAssignment_5_2_1.eContents().get(0);
		private final Group cGroup_5_3 = (Group)cUnorderedGroup_5.eContents().get(3);
		private final Keyword cOrderedKeyword_5_3_0 = (Keyword)cGroup_5_3.eContents().get(0);
		private final Assignment cOrderedAssignment_5_3_1 = (Assignment)cGroup_5_3.eContents().get(1);
		private final RuleCall cOrderedEBooleanParserRuleCall_5_3_1_0 = (RuleCall)cOrderedAssignment_5_3_1.eContents().get(0);
		private final Group cGroup_5_4 = (Group)cUnorderedGroup_5.eContents().get(4);
		private final Keyword cTransientKeyword_5_4_0 = (Keyword)cGroup_5_4.eContents().get(0);
		private final Assignment cTransientAssignment_5_4_1 = (Assignment)cGroup_5_4.eContents().get(1);
		private final RuleCall cTransientEBooleanParserRuleCall_5_4_1_0 = (RuleCall)cTransientAssignment_5_4_1.eContents().get(0);
		private final Group cGroup_5_5 = (Group)cUnorderedGroup_5.eContents().get(5);
		private final Keyword cUniqueKeyword_5_5_0 = (Keyword)cGroup_5_5.eContents().get(0);
		private final Assignment cUniqueAssignment_5_5_1 = (Assignment)cGroup_5_5.eContents().get(1);
		private final RuleCall cUniqueEBooleanParserRuleCall_5_5_1_0 = (RuleCall)cUniqueAssignment_5_5_1.eContents().get(0);
		private final Group cGroup_5_6 = (Group)cUnorderedGroup_5.eContents().get(6);
		private final Keyword cUnsettableKeyword_5_6_0 = (Keyword)cGroup_5_6.eContents().get(0);
		private final Assignment cUnsettableAssignment_5_6_1 = (Assignment)cGroup_5_6.eContents().get(1);
		private final RuleCall cUnsettableEBooleanParserRuleCall_5_6_1_0 = (RuleCall)cUnsettableAssignment_5_6_1.eContents().get(0);
		private final Group cGroup_5_7 = (Group)cUnorderedGroup_5.eContents().get(7);
		private final Keyword cVolatileKeyword_5_7_0 = (Keyword)cGroup_5_7.eContents().get(0);
		private final Assignment cVolatileAssignment_5_7_1 = (Assignment)cGroup_5_7.eContents().get(1);
		private final RuleCall cVolatileEBooleanParserRuleCall_5_7_1_0 = (RuleCall)cVolatileAssignment_5_7_1.eContents().get(0);
		private final Group cGroup_6 = (Group)cGroup.eContents().get(6);
		private final Keyword cValuesKeyword_6_0 = (Keyword)cGroup_6.eContents().get(0);
		private final Keyword cLeftParenthesisKeyword_6_1 = (Keyword)cGroup_6.eContents().get(1);
		private final Group cGroup_6_2 = (Group)cGroup_6.eContents().get(2);
		private final Assignment cOwned_valuesAssignment_6_2_0 = (Assignment)cGroup_6_2.eContents().get(0);
		private final RuleCall cOwned_valuesValueParserRuleCall_6_2_0_0 = (RuleCall)cOwned_valuesAssignment_6_2_0.eContents().get(0);
		private final Group cGroup_6_2_1 = (Group)cGroup_6_2.eContents().get(1);
		private final Keyword cCommaKeyword_6_2_1_0 = (Keyword)cGroup_6_2_1.eContents().get(0);
		private final Assignment cOwned_valuesAssignment_6_2_1_1 = (Assignment)cGroup_6_2_1.eContents().get(1);
		private final RuleCall cOwned_valuesValueParserRuleCall_6_2_1_1_0 = (RuleCall)cOwned_valuesAssignment_6_2_1_1.eContents().get(0);
		private final Keyword cRightParenthesisKeyword_6_3 = (Keyword)cGroup_6.eContents().get(3);
		private final Assignment cOwned_annotationsAssignment_7 = (Assignment)cGroup.eContents().get(7);
		private final RuleCall cOwned_annotationsAnnotationParserRuleCall_7_0 = (RuleCall)cOwned_annotationsAssignment_7.eContents().get(0);
		
		//Attribute vpdesc::Attribute:
		//	{vpdesc::Attribute} name=EString ('description' description=EString ',')? owned_type=AbstractAttributeType
		//	cardinality=Cardinalities? (('id:' isId=EBoolean)? & ('changeable:' changeable=EBoolean)? & ('derived:'
		//	derived=EBoolean)? & ('ordered:' ordered=EBoolean)? & ('transient:' transient=EBoolean)? & ('unique:'
		//	unique=EBoolean)? & ('unsettable:' unsettable=EBoolean)? & ('volatile:' volatile=EBoolean)?) ('values' '('
		//	(owned_values+=Value (',' owned_values+=Value)*)? ')')? owned_annotations+=Annotation*
		@Override public ParserRule getRule() { return rule; }

		//{vpdesc::Attribute} name=EString ('description' description=EString ',')? owned_type=AbstractAttributeType
		//cardinality=Cardinalities? (('id:' isId=EBoolean)? & ('changeable:' changeable=EBoolean)? & ('derived:'
		//derived=EBoolean)? & ('ordered:' ordered=EBoolean)? & ('transient:' transient=EBoolean)? & ('unique:'
		//unique=EBoolean)? & ('unsettable:' unsettable=EBoolean)? & ('volatile:' volatile=EBoolean)?) ('values' '('
		//(owned_values+=Value (',' owned_values+=Value)*)? ')')? owned_annotations+=Annotation*
		public Group getGroup() { return cGroup; }

		//{vpdesc::Attribute}
		public Action getAttributeAction_0() { return cAttributeAction_0; }

		//name=EString
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }

		//EString
		public RuleCall getNameEStringParserRuleCall_1_0() { return cNameEStringParserRuleCall_1_0; }

		//('description' description=EString ',')?
		public Group getGroup_2() { return cGroup_2; }

		//'description'
		public Keyword getDescriptionKeyword_2_0() { return cDescriptionKeyword_2_0; }

		//description=EString
		public Assignment getDescriptionAssignment_2_1() { return cDescriptionAssignment_2_1; }

		//EString
		public RuleCall getDescriptionEStringParserRuleCall_2_1_0() { return cDescriptionEStringParserRuleCall_2_1_0; }

		//','
		public Keyword getCommaKeyword_2_2() { return cCommaKeyword_2_2; }

		//owned_type=AbstractAttributeType
		public Assignment getOwned_typeAssignment_3() { return cOwned_typeAssignment_3; }

		//AbstractAttributeType
		public RuleCall getOwned_typeAbstractAttributeTypeParserRuleCall_3_0() { return cOwned_typeAbstractAttributeTypeParserRuleCall_3_0; }

		//cardinality=Cardinalities?
		public Assignment getCardinalityAssignment_4() { return cCardinalityAssignment_4; }

		//Cardinalities
		public RuleCall getCardinalityCardinalitiesEnumRuleCall_4_0() { return cCardinalityCardinalitiesEnumRuleCall_4_0; }

		//(('id:' isId=EBoolean)? & ('changeable:' changeable=EBoolean)? & ('derived:' derived=EBoolean)? & ('ordered:'
		//ordered=EBoolean)? & ('transient:' transient=EBoolean)? & ('unique:' unique=EBoolean)? & ('unsettable:'
		//unsettable=EBoolean)? & ('volatile:' volatile=EBoolean)?)
		public UnorderedGroup getUnorderedGroup_5() { return cUnorderedGroup_5; }

		//('id:' isId=EBoolean)?
		public Group getGroup_5_0() { return cGroup_5_0; }

		//'id:'
		public Keyword getIdKeyword_5_0_0() { return cIdKeyword_5_0_0; }

		//isId=EBoolean
		public Assignment getIsIdAssignment_5_0_1() { return cIsIdAssignment_5_0_1; }

		//EBoolean
		public RuleCall getIsIdEBooleanParserRuleCall_5_0_1_0() { return cIsIdEBooleanParserRuleCall_5_0_1_0; }

		//('changeable:' changeable=EBoolean)?
		public Group getGroup_5_1() { return cGroup_5_1; }

		//'changeable:'
		public Keyword getChangeableKeyword_5_1_0() { return cChangeableKeyword_5_1_0; }

		//changeable=EBoolean
		public Assignment getChangeableAssignment_5_1_1() { return cChangeableAssignment_5_1_1; }

		//EBoolean
		public RuleCall getChangeableEBooleanParserRuleCall_5_1_1_0() { return cChangeableEBooleanParserRuleCall_5_1_1_0; }

		//('derived:' derived=EBoolean)?
		public Group getGroup_5_2() { return cGroup_5_2; }

		//'derived:'
		public Keyword getDerivedKeyword_5_2_0() { return cDerivedKeyword_5_2_0; }

		//derived=EBoolean
		public Assignment getDerivedAssignment_5_2_1() { return cDerivedAssignment_5_2_1; }

		//EBoolean
		public RuleCall getDerivedEBooleanParserRuleCall_5_2_1_0() { return cDerivedEBooleanParserRuleCall_5_2_1_0; }

		//('ordered:' ordered=EBoolean)?
		public Group getGroup_5_3() { return cGroup_5_3; }

		//'ordered:'
		public Keyword getOrderedKeyword_5_3_0() { return cOrderedKeyword_5_3_0; }

		//ordered=EBoolean
		public Assignment getOrderedAssignment_5_3_1() { return cOrderedAssignment_5_3_1; }

		//EBoolean
		public RuleCall getOrderedEBooleanParserRuleCall_5_3_1_0() { return cOrderedEBooleanParserRuleCall_5_3_1_0; }

		//('transient:' transient=EBoolean)?
		public Group getGroup_5_4() { return cGroup_5_4; }

		//'transient:'
		public Keyword getTransientKeyword_5_4_0() { return cTransientKeyword_5_4_0; }

		//transient=EBoolean
		public Assignment getTransientAssignment_5_4_1() { return cTransientAssignment_5_4_1; }

		//EBoolean
		public RuleCall getTransientEBooleanParserRuleCall_5_4_1_0() { return cTransientEBooleanParserRuleCall_5_4_1_0; }

		//('unique:' unique=EBoolean)?
		public Group getGroup_5_5() { return cGroup_5_5; }

		//'unique:'
		public Keyword getUniqueKeyword_5_5_0() { return cUniqueKeyword_5_5_0; }

		//unique=EBoolean
		public Assignment getUniqueAssignment_5_5_1() { return cUniqueAssignment_5_5_1; }

		//EBoolean
		public RuleCall getUniqueEBooleanParserRuleCall_5_5_1_0() { return cUniqueEBooleanParserRuleCall_5_5_1_0; }

		//('unsettable:' unsettable=EBoolean)?
		public Group getGroup_5_6() { return cGroup_5_6; }

		//'unsettable:'
		public Keyword getUnsettableKeyword_5_6_0() { return cUnsettableKeyword_5_6_0; }

		//unsettable=EBoolean
		public Assignment getUnsettableAssignment_5_6_1() { return cUnsettableAssignment_5_6_1; }

		//EBoolean
		public RuleCall getUnsettableEBooleanParserRuleCall_5_6_1_0() { return cUnsettableEBooleanParserRuleCall_5_6_1_0; }

		//('volatile:' volatile=EBoolean)?
		public Group getGroup_5_7() { return cGroup_5_7; }

		//'volatile:'
		public Keyword getVolatileKeyword_5_7_0() { return cVolatileKeyword_5_7_0; }

		//volatile=EBoolean
		public Assignment getVolatileAssignment_5_7_1() { return cVolatileAssignment_5_7_1; }

		//EBoolean
		public RuleCall getVolatileEBooleanParserRuleCall_5_7_1_0() { return cVolatileEBooleanParserRuleCall_5_7_1_0; }

		//('values' '(' (owned_values+=Value (',' owned_values+=Value)*)? ')')?
		public Group getGroup_6() { return cGroup_6; }

		//'values'
		public Keyword getValuesKeyword_6_0() { return cValuesKeyword_6_0; }

		//'('
		public Keyword getLeftParenthesisKeyword_6_1() { return cLeftParenthesisKeyword_6_1; }

		//(owned_values+=Value (',' owned_values+=Value)*)?
		public Group getGroup_6_2() { return cGroup_6_2; }

		//owned_values+=Value
		public Assignment getOwned_valuesAssignment_6_2_0() { return cOwned_valuesAssignment_6_2_0; }

		//Value
		public RuleCall getOwned_valuesValueParserRuleCall_6_2_0_0() { return cOwned_valuesValueParserRuleCall_6_2_0_0; }

		//(',' owned_values+=Value)*
		public Group getGroup_6_2_1() { return cGroup_6_2_1; }

		//','
		public Keyword getCommaKeyword_6_2_1_0() { return cCommaKeyword_6_2_1_0; }

		//owned_values+=Value
		public Assignment getOwned_valuesAssignment_6_2_1_1() { return cOwned_valuesAssignment_6_2_1_1; }

		//Value
		public RuleCall getOwned_valuesValueParserRuleCall_6_2_1_1_0() { return cOwned_valuesValueParserRuleCall_6_2_1_1_0; }

		//')'
		public Keyword getRightParenthesisKeyword_6_3() { return cRightParenthesisKeyword_6_3; }

		//owned_annotations+=Annotation*
		public Assignment getOwned_annotationsAssignment_7() { return cOwned_annotationsAssignment_7; }

		//Annotation
		public RuleCall getOwned_annotationsAnnotationParserRuleCall_7_0() { return cOwned_annotationsAnnotationParserRuleCall_7_0; }
	}

	public class ValueElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.Data.Value");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cValueAction_0 = (Action)cGroup.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Assignment cNameAssignment_1_0 = (Assignment)cGroup_1.eContents().get(0);
		private final RuleCall cNameEStringParserRuleCall_1_0_0 = (RuleCall)cNameAssignment_1_0.eContents().get(0);
		private final Keyword cLiteralKeyword_1_1 = (Keyword)cGroup_1.eContents().get(1);
		private final Assignment cLiteralAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cLiteralEStringParserRuleCall_2_0 = (RuleCall)cLiteralAssignment_2.eContents().get(0);
		
		//Value vpdesc::Value:
		//	{vpdesc::Value} (name=EString 'literal')? literal=EString
		@Override public ParserRule getRule() { return rule; }

		//{vpdesc::Value} (name=EString 'literal')? literal=EString
		public Group getGroup() { return cGroup; }

		//{vpdesc::Value}
		public Action getValueAction_0() { return cValueAction_0; }

		//(name=EString 'literal')?
		public Group getGroup_1() { return cGroup_1; }

		//name=EString
		public Assignment getNameAssignment_1_0() { return cNameAssignment_1_0; }

		//EString
		public RuleCall getNameEStringParserRuleCall_1_0_0() { return cNameEStringParserRuleCall_1_0_0; }

		//'literal'
		public Keyword getLiteralKeyword_1_1() { return cLiteralKeyword_1_1; }

		//literal=EString
		public Assignment getLiteralAssignment_2() { return cLiteralAssignment_2; }

		//EString
		public RuleCall getLiteralEStringParserRuleCall_2_0() { return cLiteralEStringParserRuleCall_2_0; }
	}

	public class OperationElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.Data.Operation");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cOperationAction_0 = (Action)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameEStringParserRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cLeftParenthesisKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Group cGroup_3 = (Group)cGroup.eContents().get(3);
		private final Assignment cParametersAssignment_3_0 = (Assignment)cGroup_3.eContents().get(0);
		private final RuleCall cParametersParameterParserRuleCall_3_0_0 = (RuleCall)cParametersAssignment_3_0.eContents().get(0);
		private final Group cGroup_3_1 = (Group)cGroup_3.eContents().get(1);
		private final Keyword cCommaKeyword_3_1_0 = (Keyword)cGroup_3_1.eContents().get(0);
		private final Assignment cParametersAssignment_3_1_1 = (Assignment)cGroup_3_1.eContents().get(1);
		private final RuleCall cParametersParameterParserRuleCall_3_1_1_0 = (RuleCall)cParametersAssignment_3_1_1.eContents().get(0);
		private final Keyword cRightParenthesisKeyword_4 = (Keyword)cGroup.eContents().get(4);
		private final Group cGroup_5 = (Group)cGroup.eContents().get(5);
		private final Keyword cReturnsKeyword_5_0 = (Keyword)cGroup_5.eContents().get(0);
		private final Assignment cOperation_typeAssignment_5_1 = (Assignment)cGroup_5.eContents().get(1);
		private final RuleCall cOperation_typeAbstractTypeParserRuleCall_5_1_0 = (RuleCall)cOperation_typeAssignment_5_1.eContents().get(0);
		private final Assignment cOwned_annotationsAssignment_6 = (Assignment)cGroup.eContents().get(6);
		private final RuleCall cOwned_annotationsAnnotationParserRuleCall_6_0 = (RuleCall)cOwned_annotationsAssignment_6.eContents().get(0);
		
		//Operation vpdesc::Operation:
		//	{vpdesc::Operation} name=EString '(' (parameters+=Parameter (',' parameters+=Parameter)*)? ')' ('returns'
		//	operation_type=AbstractType)? owned_annotations+=Annotation*
		@Override public ParserRule getRule() { return rule; }

		//{vpdesc::Operation} name=EString '(' (parameters+=Parameter (',' parameters+=Parameter)*)? ')' ('returns'
		//operation_type=AbstractType)? owned_annotations+=Annotation*
		public Group getGroup() { return cGroup; }

		//{vpdesc::Operation}
		public Action getOperationAction_0() { return cOperationAction_0; }

		//name=EString
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }

		//EString
		public RuleCall getNameEStringParserRuleCall_1_0() { return cNameEStringParserRuleCall_1_0; }

		//'('
		public Keyword getLeftParenthesisKeyword_2() { return cLeftParenthesisKeyword_2; }

		//(parameters+=Parameter (',' parameters+=Parameter)*)?
		public Group getGroup_3() { return cGroup_3; }

		//parameters+=Parameter
		public Assignment getParametersAssignment_3_0() { return cParametersAssignment_3_0; }

		//Parameter
		public RuleCall getParametersParameterParserRuleCall_3_0_0() { return cParametersParameterParserRuleCall_3_0_0; }

		//(',' parameters+=Parameter)*
		public Group getGroup_3_1() { return cGroup_3_1; }

		//','
		public Keyword getCommaKeyword_3_1_0() { return cCommaKeyword_3_1_0; }

		//parameters+=Parameter
		public Assignment getParametersAssignment_3_1_1() { return cParametersAssignment_3_1_1; }

		//Parameter
		public RuleCall getParametersParameterParserRuleCall_3_1_1_0() { return cParametersParameterParserRuleCall_3_1_1_0; }

		//')'
		public Keyword getRightParenthesisKeyword_4() { return cRightParenthesisKeyword_4; }

		//('returns' operation_type=AbstractType)?
		public Group getGroup_5() { return cGroup_5; }

		//'returns'
		public Keyword getReturnsKeyword_5_0() { return cReturnsKeyword_5_0; }

		//operation_type=AbstractType
		public Assignment getOperation_typeAssignment_5_1() { return cOperation_typeAssignment_5_1; }

		//AbstractType
		public RuleCall getOperation_typeAbstractTypeParserRuleCall_5_1_0() { return cOperation_typeAbstractTypeParserRuleCall_5_1_0; }

		//owned_annotations+=Annotation*
		public Assignment getOwned_annotationsAssignment_6() { return cOwned_annotationsAssignment_6; }

		//Annotation
		public RuleCall getOwned_annotationsAnnotationParserRuleCall_6_0() { return cOwned_annotationsAnnotationParserRuleCall_6_0; }
	}

	public class ParameterElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.Data.Parameter");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cParameterAction_0 = (Action)cGroup.eContents().get(0);
		private final Assignment cParameter_typeAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cParameter_typeAbstractTypeParserRuleCall_1_0 = (RuleCall)cParameter_typeAssignment_1.eContents().get(0);
		private final Assignment cNameAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cNameEStringParserRuleCall_2_0 = (RuleCall)cNameAssignment_2.eContents().get(0);
		private final Assignment cDescriptionAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cDescriptionEStringParserRuleCall_3_0 = (RuleCall)cDescriptionAssignment_3.eContents().get(0);
		private final Assignment cOwned_annotationsAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cOwned_annotationsAnnotationParserRuleCall_4_0 = (RuleCall)cOwned_annotationsAssignment_4.eContents().get(0);
		
		//Parameter vpdesc::Parameter:
		//	{vpdesc::Parameter} parameter_type=AbstractType name=EString description=EString? owned_annotations+=Annotation*
		@Override public ParserRule getRule() { return rule; }

		//{vpdesc::Parameter} parameter_type=AbstractType name=EString description=EString? owned_annotations+=Annotation*
		public Group getGroup() { return cGroup; }

		//{vpdesc::Parameter}
		public Action getParameterAction_0() { return cParameterAction_0; }

		//parameter_type=AbstractType
		public Assignment getParameter_typeAssignment_1() { return cParameter_typeAssignment_1; }

		//AbstractType
		public RuleCall getParameter_typeAbstractTypeParserRuleCall_1_0() { return cParameter_typeAbstractTypeParserRuleCall_1_0; }

		//name=EString
		public Assignment getNameAssignment_2() { return cNameAssignment_2; }

		//EString
		public RuleCall getNameEStringParserRuleCall_2_0() { return cNameEStringParserRuleCall_2_0; }

		//description=EString?
		public Assignment getDescriptionAssignment_3() { return cDescriptionAssignment_3; }

		//EString
		public RuleCall getDescriptionEStringParserRuleCall_3_0() { return cDescriptionEStringParserRuleCall_3_0; }

		//owned_annotations+=Annotation*
		public Assignment getOwned_annotationsAssignment_4() { return cOwned_annotationsAssignment_4; }

		//Annotation
		public RuleCall getOwned_annotationsAnnotationParserRuleCall_4_0() { return cOwned_annotationsAnnotationParserRuleCall_4_0; }
	}

	public class AbstractTypeElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.Data.AbstractType");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cLocalTypeParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cExternalTypeParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		
		//AbstractType vpdesc::AbstractType:
		//	LocalType | ExternalType
		@Override public ParserRule getRule() { return rule; }

		//LocalType | ExternalType
		public Alternatives getAlternatives() { return cAlternatives; }

		//LocalType
		public RuleCall getLocalTypeParserRuleCall_0() { return cLocalTypeParserRuleCall_0; }

		//ExternalType
		public RuleCall getExternalTypeParserRuleCall_1() { return cExternalTypeParserRuleCall_1; }
	}

	public class ExternalTypeElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.Data.ExternalType");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cExternalTypeAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cExternalKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cTypeAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final CrossReference cTypeEClassifierCrossReference_2_0 = (CrossReference)cTypeAssignment_2.eContents().get(0);
		private final RuleCall cTypeEClassifierFQNParserRuleCall_2_0_1 = (RuleCall)cTypeEClassifierCrossReference_2_0.eContents().get(1);
		private final Assignment cCardinalityAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cCardinalityCardinalitiesEnumRuleCall_3_0 = (RuleCall)cCardinalityAssignment_3.eContents().get(0);
		
		//ExternalType vpdesc::AbstractType:
		//	{vpdesc::ExternalType} 'external' type=[ecore::EClassifier|FQN] cardinality=Cardinalities
		@Override public ParserRule getRule() { return rule; }

		//{vpdesc::ExternalType} 'external' type=[ecore::EClassifier|FQN] cardinality=Cardinalities
		public Group getGroup() { return cGroup; }

		//{vpdesc::ExternalType}
		public Action getExternalTypeAction_0() { return cExternalTypeAction_0; }

		//'external'
		public Keyword getExternalKeyword_1() { return cExternalKeyword_1; }

		//type=[ecore::EClassifier|FQN]
		public Assignment getTypeAssignment_2() { return cTypeAssignment_2; }

		//[ecore::EClassifier|FQN]
		public CrossReference getTypeEClassifierCrossReference_2_0() { return cTypeEClassifierCrossReference_2_0; }

		//FQN
		public RuleCall getTypeEClassifierFQNParserRuleCall_2_0_1() { return cTypeEClassifierFQNParserRuleCall_2_0_1; }

		//cardinality=Cardinalities
		public Assignment getCardinalityAssignment_3() { return cCardinalityAssignment_3; }

		//Cardinalities
		public RuleCall getCardinalityCardinalitiesEnumRuleCall_3_0() { return cCardinalityCardinalitiesEnumRuleCall_3_0; }
	}

	public class LocalTypeElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.Data.LocalType");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cLocalTypeAction_0 = (Action)cGroup.eContents().get(0);
		private final Assignment cTypeAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final CrossReference cTypeViewpointClassifierCrossReference_1_0 = (CrossReference)cTypeAssignment_1.eContents().get(0);
		private final RuleCall cTypeViewpointClassifierFQNParserRuleCall_1_0_1 = (RuleCall)cTypeViewpointClassifierCrossReference_1_0.eContents().get(1);
		private final Assignment cCardinalityAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cCardinalityCardinalitiesEnumRuleCall_2_0 = (RuleCall)cCardinalityAssignment_2.eContents().get(0);
		
		//LocalType vpdesc::AbstractType:
		//	{vpdesc::LocalType} type=[vpdesc::ViewpointClassifier|FQN] cardinality=Cardinalities
		@Override public ParserRule getRule() { return rule; }

		//{vpdesc::LocalType} type=[vpdesc::ViewpointClassifier|FQN] cardinality=Cardinalities
		public Group getGroup() { return cGroup; }

		//{vpdesc::LocalType}
		public Action getLocalTypeAction_0() { return cLocalTypeAction_0; }

		//type=[vpdesc::ViewpointClassifier|FQN]
		public Assignment getTypeAssignment_1() { return cTypeAssignment_1; }

		//[vpdesc::ViewpointClassifier|FQN]
		public CrossReference getTypeViewpointClassifierCrossReference_1_0() { return cTypeViewpointClassifierCrossReference_1_0; }

		//FQN
		public RuleCall getTypeViewpointClassifierFQNParserRuleCall_1_0_1() { return cTypeViewpointClassifierFQNParserRuleCall_1_0_1; }

		//cardinality=Cardinalities
		public Assignment getCardinalityAssignment_2() { return cCardinalityAssignment_2; }

		//Cardinalities
		public RuleCall getCardinalityCardinalitiesEnumRuleCall_2_0() { return cCardinalityCardinalitiesEnumRuleCall_2_0; }
	}

	public class AnnotatableElementElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.Data.AnnotatableElement");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cAnnotatableElementAction_0 = (Action)cGroup.eContents().get(0);
		private final Assignment cOwned_annotationsAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cOwned_annotationsAnnotationParserRuleCall_1_0 = (RuleCall)cOwned_annotationsAssignment_1.eContents().get(0);
		
		//AnnotatableElement vpdesc::AnnotatableElement:
		//	{vpdesc::AnnotatableElement} owned_annotations+=Annotation*
		@Override public ParserRule getRule() { return rule; }

		//{vpdesc::AnnotatableElement} owned_annotations+=Annotation*
		public Group getGroup() { return cGroup; }

		//{vpdesc::AnnotatableElement}
		public Action getAnnotatableElementAction_0() { return cAnnotatableElementAction_0; }

		//owned_annotations+=Annotation*
		public Assignment getOwned_annotationsAssignment_1() { return cOwned_annotationsAssignment_1; }

		//Annotation
		public RuleCall getOwned_annotationsAnnotationParserRuleCall_1_0() { return cOwned_annotationsAnnotationParserRuleCall_1_0; }
	}

	public class AnnotationElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.Data.Annotation");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cAnnotationAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cAnnotationKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cSourceAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cSourceEStringParserRuleCall_2_0 = (RuleCall)cSourceAssignment_2.eContents().get(0);
		private final Group cGroup_3 = (Group)cGroup.eContents().get(3);
		private final Keyword cLeftCurlyBracketKeyword_3_0 = (Keyword)cGroup_3.eContents().get(0);
		private final Assignment cOwned_detailsAssignment_3_1 = (Assignment)cGroup_3.eContents().get(1);
		private final RuleCall cOwned_detailsDetailParserRuleCall_3_1_0 = (RuleCall)cOwned_detailsAssignment_3_1.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_3_2 = (Keyword)cGroup_3.eContents().get(2);
		
		//Annotation vpdesc::Annotation:
		//	{vpdesc::Annotation} 'Annotation' source=EString ('{' owned_details+=Detail+ '}')?
		@Override public ParserRule getRule() { return rule; }

		//{vpdesc::Annotation} 'Annotation' source=EString ('{' owned_details+=Detail+ '}')?
		public Group getGroup() { return cGroup; }

		//{vpdesc::Annotation}
		public Action getAnnotationAction_0() { return cAnnotationAction_0; }

		//'Annotation'
		public Keyword getAnnotationKeyword_1() { return cAnnotationKeyword_1; }

		//source=EString
		public Assignment getSourceAssignment_2() { return cSourceAssignment_2; }

		//EString
		public RuleCall getSourceEStringParserRuleCall_2_0() { return cSourceEStringParserRuleCall_2_0; }

		//('{' owned_details+=Detail+ '}')?
		public Group getGroup_3() { return cGroup_3; }

		//'{'
		public Keyword getLeftCurlyBracketKeyword_3_0() { return cLeftCurlyBracketKeyword_3_0; }

		//owned_details+=Detail+
		public Assignment getOwned_detailsAssignment_3_1() { return cOwned_detailsAssignment_3_1; }

		//Detail
		public RuleCall getOwned_detailsDetailParserRuleCall_3_1_0() { return cOwned_detailsDetailParserRuleCall_3_1_0; }

		//'}'
		public Keyword getRightCurlyBracketKeyword_3_2() { return cRightCurlyBracketKeyword_3_2; }
	}

	public class DetailElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.Data.Detail");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cDetailAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cKeyKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cKeyAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cKeyEStringParserRuleCall_2_0 = (RuleCall)cKeyAssignment_2.eContents().get(0);
		private final Group cGroup_3 = (Group)cGroup.eContents().get(3);
		private final Keyword cValueKeyword_3_0 = (Keyword)cGroup_3.eContents().get(0);
		private final Assignment cValueAssignment_3_1 = (Assignment)cGroup_3.eContents().get(1);
		private final RuleCall cValueEStringParserRuleCall_3_1_0 = (RuleCall)cValueAssignment_3_1.eContents().get(0);
		
		//Detail vpdesc::Detail:
		//	{vpdesc::Detail} 'key:' key=EString ('value:' value=EString)?
		@Override public ParserRule getRule() { return rule; }

		//{vpdesc::Detail} 'key:' key=EString ('value:' value=EString)?
		public Group getGroup() { return cGroup; }

		//{vpdesc::Detail}
		public Action getDetailAction_0() { return cDetailAction_0; }

		//'key:'
		public Keyword getKeyKeyword_1() { return cKeyKeyword_1; }

		//key=EString
		public Assignment getKeyAssignment_2() { return cKeyAssignment_2; }

		//EString
		public RuleCall getKeyEStringParserRuleCall_2_0() { return cKeyEStringParserRuleCall_2_0; }

		//('value:' value=EString)?
		public Group getGroup_3() { return cGroup_3; }

		//'value:'
		public Keyword getValueKeyword_3_0() { return cValueKeyword_3_0; }

		//value=EString
		public Assignment getValueAssignment_3_1() { return cValueAssignment_3_1; }

		//EString
		public RuleCall getValueEStringParserRuleCall_3_1_0() { return cValueEStringParserRuleCall_3_1_0; }
	}
	
	
	public class Association_TypesElements extends AbstractEnumRuleElementFinder {
		private final EnumRule rule = (EnumRule) GrammarUtil.findRuleForName(getGrammar(), "org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.Data.Association_Types");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final EnumLiteralDeclaration cContainmentEnumLiteralDeclaration_0 = (EnumLiteralDeclaration)cAlternatives.eContents().get(0);
		private final Keyword cContainmentContainsKeyword_0_0 = (Keyword)cContainmentEnumLiteralDeclaration_0.eContents().get(0);
		private final EnumLiteralDeclaration cReferenceEnumLiteralDeclaration_1 = (EnumLiteralDeclaration)cAlternatives.eContents().get(1);
		private final Keyword cReferenceRefersKeyword_1_0 = (Keyword)cReferenceEnumLiteralDeclaration_1.eContents().get(0);
		
		//enum Association_Types returns vpdesc::Association_Types:
		//	containment='contains' | reference='refers';
		public EnumRule getRule() { return rule; }

		//containment='contains' | reference='refers'
		public Alternatives getAlternatives() { return cAlternatives; }

		//containment='contains'
		public EnumLiteralDeclaration getContainmentEnumLiteralDeclaration_0() { return cContainmentEnumLiteralDeclaration_0; }

		//'contains'
		public Keyword getContainmentContainsKeyword_0_0() { return cContainmentContainsKeyword_0_0; }

		//reference='refers'
		public EnumLiteralDeclaration getReferenceEnumLiteralDeclaration_1() { return cReferenceEnumLiteralDeclaration_1; }

		//'refers'
		public Keyword getReferenceRefersKeyword_1_0() { return cReferenceRefersKeyword_1_0; }
	}

	public class CardinalitiesElements extends AbstractEnumRuleElementFinder {
		private final EnumRule rule = (EnumRule) GrammarUtil.findRuleForName(getGrammar(), "org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.Data.Cardinalities");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final EnumLiteralDeclaration cNothing_Or_ManyEnumLiteralDeclaration_0 = (EnumLiteralDeclaration)cAlternatives.eContents().get(0);
		private final Keyword cNothing_Or_Many0Keyword_0_0 = (Keyword)cNothing_Or_ManyEnumLiteralDeclaration_0.eContents().get(0);
		private final EnumLiteralDeclaration cOne_Or_ManyEnumLiteralDeclaration_1 = (EnumLiteralDeclaration)cAlternatives.eContents().get(1);
		private final Keyword cOne_Or_Many1Keyword_1_0 = (Keyword)cOne_Or_ManyEnumLiteralDeclaration_1.eContents().get(0);
		private final EnumLiteralDeclaration cNothing_Or_OneEnumLiteralDeclaration_2 = (EnumLiteralDeclaration)cAlternatives.eContents().get(2);
		private final Keyword cNothing_Or_One01Keyword_2_0 = (Keyword)cNothing_Or_OneEnumLiteralDeclaration_2.eContents().get(0);
		private final EnumLiteralDeclaration cOnly_OneEnumLiteralDeclaration_3 = (EnumLiteralDeclaration)cAlternatives.eContents().get(3);
		private final Keyword cOnly_One11Keyword_3_0 = (Keyword)cOnly_OneEnumLiteralDeclaration_3.eContents().get(0);
		
		//enum Cardinalities returns vpdesc::Cardinalities:
		//	Nothing_Or_Many='[0,*]' | One_Or_Many='[1,*]' | Nothing_Or_One='[0,1]' | Only_One='[1,1]';
		public EnumRule getRule() { return rule; }

		//Nothing_Or_Many='[0,*]' | One_Or_Many='[1,*]' | Nothing_Or_One='[0,1]' | Only_One='[1,1]'
		public Alternatives getAlternatives() { return cAlternatives; }

		//Nothing_Or_Many='[0,*]'
		public EnumLiteralDeclaration getNothing_Or_ManyEnumLiteralDeclaration_0() { return cNothing_Or_ManyEnumLiteralDeclaration_0; }

		//'[0,*]'
		public Keyword getNothing_Or_Many0Keyword_0_0() { return cNothing_Or_Many0Keyword_0_0; }

		//One_Or_Many='[1,*]'
		public EnumLiteralDeclaration getOne_Or_ManyEnumLiteralDeclaration_1() { return cOne_Or_ManyEnumLiteralDeclaration_1; }

		//'[1,*]'
		public Keyword getOne_Or_Many1Keyword_1_0() { return cOne_Or_Many1Keyword_1_0; }

		//Nothing_Or_One='[0,1]'
		public EnumLiteralDeclaration getNothing_Or_OneEnumLiteralDeclaration_2() { return cNothing_Or_OneEnumLiteralDeclaration_2; }

		//'[0,1]'
		public Keyword getNothing_Or_One01Keyword_2_0() { return cNothing_Or_One01Keyword_2_0; }

		//Only_One='[1,1]'
		public EnumLiteralDeclaration getOnly_OneEnumLiteralDeclaration_3() { return cOnly_OneEnumLiteralDeclaration_3; }

		//'[1,1]'
		public Keyword getOnly_One11Keyword_3_0() { return cOnly_One11Keyword_3_0; }
	}
	
	private final DataSpecElements pDataSpec;
	private final AbstractImportElements pAbstractImport;
	private final ImportNamespaceElements pImportNamespace;
	private final ImportURIElements pImportURI;
	private final ImportElements pImport;
	private final DataElements pData;
	private final ClassElements pClass;
	private final EnumerationElements pEnumeration;
	private final AbstractSuperClassElements pAbstractSuperClass;
	private final LocalSuperClassElements pLocalSuperClass;
	private final ExternalSuperClassElements pExternalSuperClass;
	private final AbstractFeatureElements pAbstractFeature;
	private final AbstractAssociationElements pAbstractAssociation;
	private final LocalClassAssociationElements pLocalClassAssociation;
	private final ExternalClassAssociationElements pExternalClassAssociation;
	private final AbstractAttributeTypeElements pAbstractAttributeType;
	private final LocalAttributeTypeElements pLocalAttributeType;
	private final ExternalAttributeTypeElements pExternalAttributeType;
	private final AttributeElements pAttribute;
	private final ValueElements pValue;
	private final OperationElements pOperation;
	private final ParameterElements pParameter;
	private final AbstractTypeElements pAbstractType;
	private final ExternalTypeElements pExternalType;
	private final LocalTypeElements pLocalType;
	private final AnnotatableElementElements pAnnotatableElement;
	private final AnnotationElements pAnnotation;
	private final DetailElements pDetail;
	private final Association_TypesElements eAssociation_Types;
	private final CardinalitiesElements eCardinalities;
	
	private final Grammar grammar;

	private final CommonGrammarAccess gaCommon;

	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public DataGrammarAccess(GrammarProvider grammarProvider,
		CommonGrammarAccess gaCommon,
		TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaCommon = gaCommon;
		this.gaTerminals = gaTerminals;
		this.pDataSpec = new DataSpecElements();
		this.pAbstractImport = new AbstractImportElements();
		this.pImportNamespace = new ImportNamespaceElements();
		this.pImportURI = new ImportURIElements();
		this.pImport = new ImportElements();
		this.pData = new DataElements();
		this.pClass = new ClassElements();
		this.pEnumeration = new EnumerationElements();
		this.pAbstractSuperClass = new AbstractSuperClassElements();
		this.pLocalSuperClass = new LocalSuperClassElements();
		this.pExternalSuperClass = new ExternalSuperClassElements();
		this.pAbstractFeature = new AbstractFeatureElements();
		this.pAbstractAssociation = new AbstractAssociationElements();
		this.pLocalClassAssociation = new LocalClassAssociationElements();
		this.pExternalClassAssociation = new ExternalClassAssociationElements();
		this.pAbstractAttributeType = new AbstractAttributeTypeElements();
		this.pLocalAttributeType = new LocalAttributeTypeElements();
		this.pExternalAttributeType = new ExternalAttributeTypeElements();
		this.pAttribute = new AttributeElements();
		this.pValue = new ValueElements();
		this.pOperation = new OperationElements();
		this.pParameter = new ParameterElements();
		this.pAbstractType = new AbstractTypeElements();
		this.pExternalType = new ExternalTypeElements();
		this.pLocalType = new LocalTypeElements();
		this.pAnnotatableElement = new AnnotatableElementElements();
		this.pAnnotation = new AnnotationElements();
		this.pDetail = new DetailElements();
		this.eAssociation_Types = new Association_TypesElements();
		this.eCardinalities = new CardinalitiesElements();
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.Data".equals(grammar.getName())) {
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

	public TerminalsGrammarAccess getTerminalsGrammarAccess() {
		return gaTerminals;
	}

	
	//DataSpec:
	//	{DataSpec} imports+=Import* data=Data;
	public DataSpecElements getDataSpecAccess() {
		return pDataSpec;
	}
	
	public ParserRule getDataSpecRule() {
		return getDataSpecAccess().getRule();
	}

	//AbstractImport:
	//	ImportNamespace | ImportURI;
	public AbstractImportElements getAbstractImportAccess() {
		return pAbstractImport;
	}
	
	public ParserRule getAbstractImportRule() {
		return getAbstractImportAccess().getRule();
	}

	//ImportNamespace:
	//	importedNamespace=FQN;
	public ImportNamespaceElements getImportNamespaceAccess() {
		return pImportNamespace;
	}
	
	public ParserRule getImportNamespaceRule() {
		return getImportNamespaceAccess().getRule();
	}

	//ImportURI:
	//	'external' importURI=EString;
	public ImportURIElements getImportURIAccess() {
		return pImportURI;
	}
	
	public ParserRule getImportURIRule() {
		return getImportURIAccess().getRule();
	}

	//Import:
	//	'import' AbstractImport;
	public ImportElements getImportAccess() {
		return pImport;
	}
	
	public ParserRule getImportRule() {
		return getImportAccess().getRule();
	}

	//Data vpdesc::Data:
	//	{vpdesc::Data} 'Data' name=FQN? '{' owned_annotations+=Annotation* (('description:' description=EString)? &
	//	VP_Classes+=Class* & VP_Enumerations+=Enumeration*) '}'
	public DataElements getDataAccess() {
		return pData;
	}
	
	public ParserRule getDataRule() {
		return getDataAccess().getRule();
	}

	////ViewpointClassifier returns vpdesc::ViewpointClassifier:
	// //	Class | Enumeration
	// //;
	// Class vpdesc::Class:
	//	{vpdesc::Class} 'Class' name=EString '{' ('description:' description=EString)? ('icon:' icon=STRING)? ('extends'
	//	extends+=[ecore::EClass|FQN] (',' extends+=[ecore::EClass|FQN])*)? ('superClass' Inheritences+=AbstractSuperClass
	//	(',' Inheritences+=AbstractSuperClass)*)? ('abstract:' abstract=EBoolean)? owned_annotations+=Annotation*
	//	('Attributes:' VP_Class_Attributes+=Attribute*)? ('Associations:' VP_Classes_Associations+=AbstractAssociation*)?
	//	('Operations:' VP_Class_Operations+=Operation*)? '}'
	public ClassElements getClassAccess() {
		return pClass;
	}
	
	public ParserRule getClassRule() {
		return getClassAccess().getRule();
	}

	//Enumeration vpdesc::Enumeration:
	//	{vpdesc::Enumeration} 'Enumeration' name=ID '{' owned_annotations+=Annotation* (ownedValues+=Value (','
	//	ownedValues+=Value)*) '}'
	public EnumerationElements getEnumerationAccess() {
		return pEnumeration;
	}
	
	public ParserRule getEnumerationRule() {
		return getEnumerationAccess().getRule();
	}

	//AbstractSuperClass vpdesc::AbstractSuperClass:
	//	LocalSuperClass | ExternalSuperClass
	public AbstractSuperClassElements getAbstractSuperClassAccess() {
		return pAbstractSuperClass;
	}
	
	public ParserRule getAbstractSuperClassRule() {
		return getAbstractSuperClassAccess().getRule();
	}

	//LocalSuperClass vpdesc::AbstractSuperClass:
	//	{vpdesc::LocalSuperClass} superClass=[vpdesc::Class|FQN]
	public LocalSuperClassElements getLocalSuperClassAccess() {
		return pLocalSuperClass;
	}
	
	public ParserRule getLocalSuperClassRule() {
		return getLocalSuperClassAccess().getRule();
	}

	//ExternalSuperClass vpdesc::AbstractSuperClass:
	//	{vpdesc::ExternalSuperClass} 'external' superClass=[ecore::EClass|FQN]
	public ExternalSuperClassElements getExternalSuperClassAccess() {
		return pExternalSuperClass;
	}
	
	public ParserRule getExternalSuperClassRule() {
		return getExternalSuperClassAccess().getRule();
	}

	//AbstractFeature vpdesc::AbstractFeature:
	//	AbstractAssociation | Attribute
	public AbstractFeatureElements getAbstractFeatureAccess() {
		return pAbstractFeature;
	}
	
	public ParserRule getAbstractFeatureRule() {
		return getAbstractFeatureAccess().getRule();
	}

	//AbstractAssociation vpdesc::AbstractAssociation:
	//	LocalClassAssociation | ExternalClassAssociation
	public AbstractAssociationElements getAbstractAssociationAccess() {
		return pAbstractAssociation;
	}
	
	public ParserRule getAbstractAssociationRule() {
		return getAbstractAssociationAccess().getRule();
	}

	//LocalClassAssociation vpdesc::AbstractAssociation:
	//	{vpdesc::LocalClassAssociation} name=EString ('description' description=EString ',')? type=Association_Types
	//	cardinality=Cardinalities LocalTarget=[vpdesc::Class|FQN] (('opposite:'
	//	opposite=[vpdesc::LocalClassAssociation|FQN])? & ('changeable:' changeable=EBoolean)? & ('derived:'
	//	derived=EBoolean)? & ('ordered:' ordered=EBoolean)? & ('transient:' transient=EBoolean)? & ('unique:'
	//	unique=EBoolean)? & ('unsettable:' unsettable=EBoolean)? & ('volatile:' volatile=EBoolean)?)
	//	owned_annotations+=Annotation*
	public LocalClassAssociationElements getLocalClassAssociationAccess() {
		return pLocalClassAssociation;
	}
	
	public ParserRule getLocalClassAssociationRule() {
		return getLocalClassAssociationAccess().getRule();
	}

	//ExternalClassAssociation vpdesc::AbstractAssociation:
	//	{vpdesc::ExternalClassAssociation} name=EString ('description' description=EString ',')? type=Association_Types
	//	cardinality=Cardinalities 'external' ExternalTarget=[ecore::EClass|FQN] (('changeable:' changeable=EBoolean)? &
	//	('derived:' derived=EBoolean)? & ('ordered:' ordered=EBoolean)? & ('transient:' transient=EBoolean)? & ('unique:'
	//	unique=EBoolean)? & ('unsettable:' unsettable=EBoolean)? & ('volatile:' volatile=EBoolean)?)
	//	owned_annotations+=Annotation*
	public ExternalClassAssociationElements getExternalClassAssociationAccess() {
		return pExternalClassAssociation;
	}
	
	public ParserRule getExternalClassAssociationRule() {
		return getExternalClassAssociationAccess().getRule();
	}

	//AbstractAttributeType vpdesc::AbstractAttributeType:
	//	LocalAttributeType | ExternalAttributeType
	public AbstractAttributeTypeElements getAbstractAttributeTypeAccess() {
		return pAbstractAttributeType;
	}
	
	public ParserRule getAbstractAttributeTypeRule() {
		return getAbstractAttributeTypeAccess().getRule();
	}

	//LocalAttributeType vpdesc::AbstractAttributeType:
	//	{vpdesc::LocalAttributeType} 'enum' type=[vpdesc::Enumeration|FQN]
	public LocalAttributeTypeElements getLocalAttributeTypeAccess() {
		return pLocalAttributeType;
	}
	
	public ParserRule getLocalAttributeTypeRule() {
		return getLocalAttributeTypeAccess().getRule();
	}

	//ExternalAttributeType vpdesc::AbstractAttributeType:
	//	{vpdesc::ExternalAttributeType} 'type' type=[ecore::EDataType|FQN]
	public ExternalAttributeTypeElements getExternalAttributeTypeAccess() {
		return pExternalAttributeType;
	}
	
	public ParserRule getExternalAttributeTypeRule() {
		return getExternalAttributeTypeAccess().getRule();
	}

	//Attribute vpdesc::Attribute:
	//	{vpdesc::Attribute} name=EString ('description' description=EString ',')? owned_type=AbstractAttributeType
	//	cardinality=Cardinalities? (('id:' isId=EBoolean)? & ('changeable:' changeable=EBoolean)? & ('derived:'
	//	derived=EBoolean)? & ('ordered:' ordered=EBoolean)? & ('transient:' transient=EBoolean)? & ('unique:'
	//	unique=EBoolean)? & ('unsettable:' unsettable=EBoolean)? & ('volatile:' volatile=EBoolean)?) ('values' '('
	//	(owned_values+=Value (',' owned_values+=Value)*)? ')')? owned_annotations+=Annotation*
	public AttributeElements getAttributeAccess() {
		return pAttribute;
	}
	
	public ParserRule getAttributeRule() {
		return getAttributeAccess().getRule();
	}

	//Value vpdesc::Value:
	//	{vpdesc::Value} (name=EString 'literal')? literal=EString
	public ValueElements getValueAccess() {
		return pValue;
	}
	
	public ParserRule getValueRule() {
		return getValueAccess().getRule();
	}

	//Operation vpdesc::Operation:
	//	{vpdesc::Operation} name=EString '(' (parameters+=Parameter (',' parameters+=Parameter)*)? ')' ('returns'
	//	operation_type=AbstractType)? owned_annotations+=Annotation*
	public OperationElements getOperationAccess() {
		return pOperation;
	}
	
	public ParserRule getOperationRule() {
		return getOperationAccess().getRule();
	}

	//Parameter vpdesc::Parameter:
	//	{vpdesc::Parameter} parameter_type=AbstractType name=EString description=EString? owned_annotations+=Annotation*
	public ParameterElements getParameterAccess() {
		return pParameter;
	}
	
	public ParserRule getParameterRule() {
		return getParameterAccess().getRule();
	}

	//AbstractType vpdesc::AbstractType:
	//	LocalType | ExternalType
	public AbstractTypeElements getAbstractTypeAccess() {
		return pAbstractType;
	}
	
	public ParserRule getAbstractTypeRule() {
		return getAbstractTypeAccess().getRule();
	}

	//ExternalType vpdesc::AbstractType:
	//	{vpdesc::ExternalType} 'external' type=[ecore::EClassifier|FQN] cardinality=Cardinalities
	public ExternalTypeElements getExternalTypeAccess() {
		return pExternalType;
	}
	
	public ParserRule getExternalTypeRule() {
		return getExternalTypeAccess().getRule();
	}

	//LocalType vpdesc::AbstractType:
	//	{vpdesc::LocalType} type=[vpdesc::ViewpointClassifier|FQN] cardinality=Cardinalities
	public LocalTypeElements getLocalTypeAccess() {
		return pLocalType;
	}
	
	public ParserRule getLocalTypeRule() {
		return getLocalTypeAccess().getRule();
	}

	//AnnotatableElement vpdesc::AnnotatableElement:
	//	{vpdesc::AnnotatableElement} owned_annotations+=Annotation*
	public AnnotatableElementElements getAnnotatableElementAccess() {
		return pAnnotatableElement;
	}
	
	public ParserRule getAnnotatableElementRule() {
		return getAnnotatableElementAccess().getRule();
	}

	//Annotation vpdesc::Annotation:
	//	{vpdesc::Annotation} 'Annotation' source=EString ('{' owned_details+=Detail+ '}')?
	public AnnotationElements getAnnotationAccess() {
		return pAnnotation;
	}
	
	public ParserRule getAnnotationRule() {
		return getAnnotationAccess().getRule();
	}

	//Detail vpdesc::Detail:
	//	{vpdesc::Detail} 'key:' key=EString ('value:' value=EString)?
	public DetailElements getDetailAccess() {
		return pDetail;
	}
	
	public ParserRule getDetailRule() {
		return getDetailAccess().getRule();
	}

	//enum Association_Types returns vpdesc::Association_Types:
	//	containment='contains' | reference='refers';
	public Association_TypesElements getAssociation_TypesAccess() {
		return eAssociation_Types;
	}
	
	public EnumRule getAssociation_TypesRule() {
		return getAssociation_TypesAccess().getRule();
	}

	//enum Cardinalities returns vpdesc::Cardinalities:
	//	Nothing_Or_Many='[0,*]' | One_Or_Many='[1,*]' | Nothing_Or_One='[0,1]' | Only_One='[1,1]';
	public CardinalitiesElements getCardinalitiesAccess() {
		return eCardinalities;
	}
	
	public EnumRule getCardinalitiesRule() {
		return getCardinalitiesAccess().getRule();
	}

	//EString:
	//	STRING | ID;
	public CommonGrammarAccess.EStringElements getEStringAccess() {
		return gaCommon.getEStringAccess();
	}
	
	public ParserRule getEStringRule() {
		return getEStringAccess().getRule();
	}

	//FQN:
	//	ID ("." => ID)*;
	public CommonGrammarAccess.FQNElements getFQNAccess() {
		return gaCommon.getFQNAccess();
	}
	
	public ParserRule getFQNRule() {
		return getFQNAccess().getRule();
	}

	//EBoolean ecore::EBoolean:
	//	'true' | 'false'
	public CommonGrammarAccess.EBooleanElements getEBooleanAccess() {
		return gaCommon.getEBooleanAccess();
	}
	
	public ParserRule getEBooleanRule() {
		return getEBooleanAccess().getRule();
	}

	//EInt ecore::EInt:
	//	INT
	public CommonGrammarAccess.EIntElements getEIntAccess() {
		return gaCommon.getEIntAccess();
	}
	
	public ParserRule getEIntRule() {
		return getEIntAccess().getRule();
	}

	//terminal ID:
	//	'^'? ('a'..'z' | 'A'..'Z' | '_') ('a'..'z' | 'A'..'Z' | '_' | '0'..'9')*;
	public TerminalRule getIDRule() {
		return gaTerminals.getIDRule();
	} 

	//terminal INT returns ecore::EInt:
	//	'0'..'9'+;
	public TerminalRule getINTRule() {
		return gaTerminals.getINTRule();
	} 

	//terminal STRING:
	//	'"' ('\\' . | !('\\' | '"'))* '"' | "'" ('\\' . | !('\\' | "'"))* "'";
	public TerminalRule getSTRINGRule() {
		return gaTerminals.getSTRINGRule();
	} 

	//terminal ML_COMMENT:
	//	'/ *'->'* /';
	public TerminalRule getML_COMMENTRule() {
		return gaTerminals.getML_COMMENTRule();
	} 

	//terminal SL_COMMENT:
	//	'//' !('\n' | '\r')* ('\r'? '\n')?;
	public TerminalRule getSL_COMMENTRule() {
		return gaTerminals.getSL_COMMENTRule();
	} 

	//terminal WS:
	//	' ' | '\t' | '\r' | '\n'+;
	public TerminalRule getWSRule() {
		return gaTerminals.getWSRule();
	} 

	//terminal ANY_OTHER:
	//	.;
	public TerminalRule getANY_OTHERRule() {
		return gaTerminals.getANY_OTHERRule();
	} 
}

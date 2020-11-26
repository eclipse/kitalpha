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
public class VpuiGrammarAccess extends AbstractGrammarElementFinder {
	
	
	public class UserInterfaceElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.Vpui.UserInterface");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cUserInterfaceAction_0 = (Action)cGroup.eContents().get(0);
		private final Assignment cImportsAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cImportsImportParserRuleCall_1_0 = (RuleCall)cImportsAssignment_1.eContents().get(0);
		private final Assignment cUiDescriptionAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cUiDescriptionAspectParserRuleCall_2_0 = (RuleCall)cUiDescriptionAssignment_2.eContents().get(0);
		
		//UserInterface:
		//	{UserInterface} imports+=Import* uiDescription=Aspect;
		@Override public ParserRule getRule() { return rule; }

		//{UserInterface} imports+=Import* uiDescription=Aspect
		public Group getGroup() { return cGroup; }

		//{UserInterface}
		public Action getUserInterfaceAction_0() { return cUserInterfaceAction_0; }

		//imports+=Import*
		public Assignment getImportsAssignment_1() { return cImportsAssignment_1; }

		//Import
		public RuleCall getImportsImportParserRuleCall_1_0() { return cImportsImportParserRuleCall_1_0; }

		//uiDescription=Aspect
		public Assignment getUiDescriptionAssignment_2() { return cUiDescriptionAssignment_2; }

		//Aspect
		public RuleCall getUiDescriptionAspectParserRuleCall_2_0() { return cUiDescriptionAspectParserRuleCall_2_0; }
	}

	public class ImportElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.Vpui.Import");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cImportKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cImportedNamespaceAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cImportedNamespaceFQNParserRuleCall_1_0 = (RuleCall)cImportedNamespaceAssignment_1.eContents().get(0);
		
		//Import:
		//	'import' importedNamespace=FQN;
		@Override public ParserRule getRule() { return rule; }

		//'import' importedNamespace=FQN
		public Group getGroup() { return cGroup; }

		//'import'
		public Keyword getImportKeyword_0() { return cImportKeyword_0; }

		//importedNamespace=FQN
		public Assignment getImportedNamespaceAssignment_1() { return cImportedNamespaceAssignment_1; }

		//FQN
		public RuleCall getImportedNamespaceFQNParserRuleCall_1_0() { return cImportedNamespaceFQNParserRuleCall_1_0; }
	}

	public class AspectElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.Vpui.Aspect");
		private final RuleCall cUIDescriptionParserRuleCall = (RuleCall)rule.eContents().get(1);
		
		//Aspect vpdesc::Aspect:
		//	UIDescription
		@Override public ParserRule getRule() { return rule; }

		//UIDescription
		public RuleCall getUIDescriptionParserRuleCall() { return cUIDescriptionParserRuleCall; }
	}

	public class UIDescriptionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.Vpui.UIDescription");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cUIDescriptionAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cUIDescriptionKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cNameAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cNameFQNParserRuleCall_2_0 = (RuleCall)cNameAssignment_2.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cUIsAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cUIsUIParserRuleCall_4_0 = (RuleCall)cUIsAssignment_4.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_5 = (Keyword)cGroup.eContents().get(5);
		
		/// ********************************************************************
		// * 							vpui
		// * 
		// ******************************************************************** /
		//UIDescription vpdesc::Aspect:
		//	{vpui::UIDescription} 'UIDescription' name=FQN '{' => UIs+=UI* '}'
		@Override public ParserRule getRule() { return rule; }

		//{vpui::UIDescription} 'UIDescription' name=FQN '{' => UIs+=UI* '}'
		public Group getGroup() { return cGroup; }

		//{vpui::UIDescription}
		public Action getUIDescriptionAction_0() { return cUIDescriptionAction_0; }

		//'UIDescription'
		public Keyword getUIDescriptionKeyword_1() { return cUIDescriptionKeyword_1; }

		//name=FQN
		public Assignment getNameAssignment_2() { return cNameAssignment_2; }

		//FQN
		public RuleCall getNameFQNParserRuleCall_2_0() { return cNameFQNParserRuleCall_2_0; }

		//'{'
		public Keyword getLeftCurlyBracketKeyword_3() { return cLeftCurlyBracketKeyword_3; }

		//=> UIs+=UI*
		public Assignment getUIsAssignment_4() { return cUIsAssignment_4; }

		//UI
		public RuleCall getUIsUIParserRuleCall_4_0() { return cUIsUIParserRuleCall_4_0; }

		//'}'
		public Keyword getRightCurlyBracketKeyword_5() { return cRightCurlyBracketKeyword_5; }
	}

	public class DisplayableElementElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.Vpui.DisplayableElement");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cUIContainerParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cUIParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		private final RuleCall cUIFieldParserRuleCall_2 = (RuleCall)cAlternatives.eContents().get(2);
		
		//DisplayableElement vpui::DisplayableElement:
		//	UIContainer | UI | UIField
		@Override public ParserRule getRule() { return rule; }

		//UIContainer | UI | UIField
		public Alternatives getAlternatives() { return cAlternatives; }

		//UIContainer
		public RuleCall getUIContainerParserRuleCall_0() { return cUIContainerParserRuleCall_0; }

		//UI
		public RuleCall getUIParserRuleCall_1() { return cUIParserRuleCall_1; }

		//UIField
		public RuleCall getUIFieldParserRuleCall_2() { return cUIFieldParserRuleCall_2; }
	}

	public class UIElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.Vpui.UI");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cUIAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cUIKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cNameAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cNameEStringParserRuleCall_2_0 = (RuleCall)cNameAssignment_2.eContents().get(0);
		private final Assignment cUI_DataSourceAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cUI_DataSourceDataSourceParserRuleCall_3_0 = (RuleCall)cUI_DataSourceAssignment_3.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_4 = (Keyword)cGroup.eContents().get(4);
		private final Group cGroup_5 = (Group)cGroup.eContents().get(5);
		private final Keyword cLabelKeyword_5_0 = (Keyword)cGroup_5.eContents().get(0);
		private final Assignment cLabelAssignment_5_1 = (Assignment)cGroup_5.eContents().get(1);
		private final RuleCall cLabelEStringParserRuleCall_5_1_0 = (RuleCall)cLabelAssignment_5_1.eContents().get(0);
		private final Assignment cUI_ContainersAssignment_6 = (Assignment)cGroup.eContents().get(6);
		private final RuleCall cUI_ContainersUIContainerParserRuleCall_6_0 = (RuleCall)cUI_ContainersAssignment_6.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_7 = (Keyword)cGroup.eContents().get(7);
		
		//UI vpui::UI:
		//	{vpui::UI} 'UI' name=EString? UI_DataSource=DataSource? '{' ('label:' label=EString)? UI_Containers+=UIContainer* '}'
		@Override public ParserRule getRule() { return rule; }

		//{vpui::UI} 'UI' name=EString? UI_DataSource=DataSource? '{' ('label:' label=EString)? UI_Containers+=UIContainer* '}'
		public Group getGroup() { return cGroup; }

		//{vpui::UI}
		public Action getUIAction_0() { return cUIAction_0; }

		//'UI'
		public Keyword getUIKeyword_1() { return cUIKeyword_1; }

		//name=EString?
		public Assignment getNameAssignment_2() { return cNameAssignment_2; }

		//EString
		public RuleCall getNameEStringParserRuleCall_2_0() { return cNameEStringParserRuleCall_2_0; }

		//UI_DataSource=DataSource?
		public Assignment getUI_DataSourceAssignment_3() { return cUI_DataSourceAssignment_3; }

		//DataSource
		public RuleCall getUI_DataSourceDataSourceParserRuleCall_3_0() { return cUI_DataSourceDataSourceParserRuleCall_3_0; }

		//'{'
		public Keyword getLeftCurlyBracketKeyword_4() { return cLeftCurlyBracketKeyword_4; }

		//('label:' label=EString)?
		public Group getGroup_5() { return cGroup_5; }

		//'label:'
		public Keyword getLabelKeyword_5_0() { return cLabelKeyword_5_0; }

		//label=EString
		public Assignment getLabelAssignment_5_1() { return cLabelAssignment_5_1; }

		//EString
		public RuleCall getLabelEStringParserRuleCall_5_1_0() { return cLabelEStringParserRuleCall_5_1_0; }

		//UI_Containers+=UIContainer*
		public Assignment getUI_ContainersAssignment_6() { return cUI_ContainersAssignment_6; }

		//UIContainer
		public RuleCall getUI_ContainersUIContainerParserRuleCall_6_0() { return cUI_ContainersUIContainerParserRuleCall_6_0; }

		//'}'
		public Keyword getRightCurlyBracketKeyword_7() { return cRightCurlyBracketKeyword_7; }
	}

	public class UIContainerElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.Vpui.UIContainer");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cUIContainerAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cContainerKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cNameAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cNameEStringParserRuleCall_2_0 = (RuleCall)cNameAssignment_2.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Group cGroup_4 = (Group)cGroup.eContents().get(4);
		private final Keyword cLabelKeyword_4_0 = (Keyword)cGroup_4.eContents().get(0);
		private final Assignment cLabelAssignment_4_1 = (Assignment)cGroup_4.eContents().get(1);
		private final RuleCall cLabelEStringParserRuleCall_4_1_0 = (RuleCall)cLabelAssignment_4_1.eContents().get(0);
		private final Group cGroup_5 = (Group)cGroup.eContents().get(5);
		private final Keyword cDescriptionKeyword_5_0 = (Keyword)cGroup_5.eContents().get(0);
		private final Assignment cDescriptionAssignment_5_1 = (Assignment)cGroup_5.eContents().get(1);
		private final RuleCall cDescriptionEStringParserRuleCall_5_1_0 = (RuleCall)cDescriptionAssignment_5_1.eContents().get(0);
		private final Group cGroup_6 = (Group)cGroup.eContents().get(6);
		private final Assignment cUI_fieldsAssignment_6_0 = (Assignment)cGroup_6.eContents().get(0);
		private final RuleCall cUI_fieldsUIFieldParserRuleCall_6_0_0 = (RuleCall)cUI_fieldsAssignment_6_0.eContents().get(0);
		private final Assignment cUI_fieldsAssignment_6_1 = (Assignment)cGroup_6.eContents().get(1);
		private final RuleCall cUI_fieldsUIFieldParserRuleCall_6_1_0 = (RuleCall)cUI_fieldsAssignment_6_1.eContents().get(0);
		private final Group cGroup_7 = (Group)cGroup.eContents().get(7);
		private final Assignment cSubContainersAssignment_7_0 = (Assignment)cGroup_7.eContents().get(0);
		private final RuleCall cSubContainersUIContainerParserRuleCall_7_0_0 = (RuleCall)cSubContainersAssignment_7_0.eContents().get(0);
		private final Assignment cSubContainersAssignment_7_1 = (Assignment)cGroup_7.eContents().get(1);
		private final RuleCall cSubContainersUIContainerParserRuleCall_7_1_0 = (RuleCall)cSubContainersAssignment_7_1.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_8 = (Keyword)cGroup.eContents().get(8);
		
		//UIContainer vpui::UIContainer:
		//	{vpui::UIContainer} 'Container' name=EString? '{' ('label:' label=EString)? ('description:' description=EString)?
		//	(UI_fields+=UIField UI_fields+=UIField*)? (subContainers+=UIContainer subContainers+=UIContainer*)? '}'
		@Override public ParserRule getRule() { return rule; }

		//{vpui::UIContainer} 'Container' name=EString? '{' ('label:' label=EString)? ('description:' description=EString)?
		//(UI_fields+=UIField UI_fields+=UIField*)? (subContainers+=UIContainer subContainers+=UIContainer*)? '}'
		public Group getGroup() { return cGroup; }

		//{vpui::UIContainer}
		public Action getUIContainerAction_0() { return cUIContainerAction_0; }

		//'Container'
		public Keyword getContainerKeyword_1() { return cContainerKeyword_1; }

		//name=EString?
		public Assignment getNameAssignment_2() { return cNameAssignment_2; }

		//EString
		public RuleCall getNameEStringParserRuleCall_2_0() { return cNameEStringParserRuleCall_2_0; }

		//'{'
		public Keyword getLeftCurlyBracketKeyword_3() { return cLeftCurlyBracketKeyword_3; }

		//('label:' label=EString)?
		public Group getGroup_4() { return cGroup_4; }

		//'label:'
		public Keyword getLabelKeyword_4_0() { return cLabelKeyword_4_0; }

		//label=EString
		public Assignment getLabelAssignment_4_1() { return cLabelAssignment_4_1; }

		//EString
		public RuleCall getLabelEStringParserRuleCall_4_1_0() { return cLabelEStringParserRuleCall_4_1_0; }

		//('description:' description=EString)?
		public Group getGroup_5() { return cGroup_5; }

		//'description:'
		public Keyword getDescriptionKeyword_5_0() { return cDescriptionKeyword_5_0; }

		//description=EString
		public Assignment getDescriptionAssignment_5_1() { return cDescriptionAssignment_5_1; }

		//EString
		public RuleCall getDescriptionEStringParserRuleCall_5_1_0() { return cDescriptionEStringParserRuleCall_5_1_0; }

		//(UI_fields+=UIField UI_fields+=UIField*)?
		public Group getGroup_6() { return cGroup_6; }

		//UI_fields+=UIField
		public Assignment getUI_fieldsAssignment_6_0() { return cUI_fieldsAssignment_6_0; }

		//UIField
		public RuleCall getUI_fieldsUIFieldParserRuleCall_6_0_0() { return cUI_fieldsUIFieldParserRuleCall_6_0_0; }

		//UI_fields+=UIField*
		public Assignment getUI_fieldsAssignment_6_1() { return cUI_fieldsAssignment_6_1; }

		//UIField
		public RuleCall getUI_fieldsUIFieldParserRuleCall_6_1_0() { return cUI_fieldsUIFieldParserRuleCall_6_1_0; }

		//(subContainers+=UIContainer subContainers+=UIContainer*)?
		public Group getGroup_7() { return cGroup_7; }

		//subContainers+=UIContainer
		public Assignment getSubContainersAssignment_7_0() { return cSubContainersAssignment_7_0; }

		//UIContainer
		public RuleCall getSubContainersUIContainerParserRuleCall_7_0_0() { return cSubContainersUIContainerParserRuleCall_7_0_0; }

		//subContainers+=UIContainer*
		public Assignment getSubContainersAssignment_7_1() { return cSubContainersAssignment_7_1; }

		//UIContainer
		public RuleCall getSubContainersUIContainerParserRuleCall_7_1_0() { return cSubContainersUIContainerParserRuleCall_7_1_0; }

		//'}'
		public Keyword getRightCurlyBracketKeyword_8() { return cRightCurlyBracketKeyword_8; }
	}

	public class DataSourceElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.Vpui.DataSource");
		private final RuleCall cLocalClassParserRuleCall = (RuleCall)rule.eContents().get(1);
		
		//DataSource vpui::DataSource:
		//	LocalClass
		@Override public ParserRule getRule() { return rule; }

		//LocalClass
		public RuleCall getLocalClassParserRuleCall() { return cLocalClassParserRuleCall; }
	}

	public class LocalClassElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.Vpui.LocalClass");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cLocalClassAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cForKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cUI_For_LocalClassAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final CrossReference cUI_For_LocalClassClassCrossReference_2_0 = (CrossReference)cUI_For_LocalClassAssignment_2.eContents().get(0);
		private final RuleCall cUI_For_LocalClassClassFQNParserRuleCall_2_0_1 = (RuleCall)cUI_For_LocalClassClassCrossReference_2_0.eContents().get(1);
		
		//LocalClass vpui::DataSource:
		//	{vpui::LocalClass} 'for' UI_For_LocalClass=[vpdesc::Class|FQN]
		@Override public ParserRule getRule() { return rule; }

		//{vpui::LocalClass} 'for' UI_For_LocalClass=[vpdesc::Class|FQN]
		public Group getGroup() { return cGroup; }

		//{vpui::LocalClass}
		public Action getLocalClassAction_0() { return cLocalClassAction_0; }

		//'for'
		public Keyword getForKeyword_1() { return cForKeyword_1; }

		//UI_For_LocalClass=[vpdesc::Class|FQN]
		public Assignment getUI_For_LocalClassAssignment_2() { return cUI_For_LocalClassAssignment_2; }

		//[vpdesc::Class|FQN]
		public CrossReference getUI_For_LocalClassClassCrossReference_2_0() { return cUI_For_LocalClassClassCrossReference_2_0; }

		//FQN
		public RuleCall getUI_For_LocalClassClassFQNParserRuleCall_2_0_1() { return cUI_For_LocalClassClassFQNParserRuleCall_2_0_1; }
	}

	public class UIFieldElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.Vpui.UIField");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cUIFieldAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cFieldKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cNameAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cNameEStringParserRuleCall_2_0 = (RuleCall)cNameAssignment_2.eContents().get(0);
		private final Group cGroup_3 = (Group)cGroup.eContents().get(3);
		private final Keyword cLabelKeyword_3_0 = (Keyword)cGroup_3.eContents().get(0);
		private final Assignment cLabelAssignment_3_1 = (Assignment)cGroup_3.eContents().get(1);
		private final RuleCall cLabelEStringParserRuleCall_3_1_0 = (RuleCall)cLabelAssignment_3_1.eContents().get(0);
		private final Group cGroup_4 = (Group)cGroup.eContents().get(4);
		private final Keyword cDescriptionKeyword_4_0 = (Keyword)cGroup_4.eContents().get(0);
		private final Assignment cDescriptionAssignment_4_1 = (Assignment)cGroup_4.eContents().get(1);
		private final RuleCall cDescriptionEStringParserRuleCall_4_1_0 = (RuleCall)cDescriptionAssignment_4_1.eContents().get(0);
		private final Keyword cCommaKeyword_4_2 = (Keyword)cGroup_4.eContents().get(2);
		private final Group cGroup_5 = (Group)cGroup.eContents().get(5);
		private final Keyword cTypeKeyword_5_0 = (Keyword)cGroup_5.eContents().get(0);
		private final Assignment cTypeAssignment_5_1 = (Assignment)cGroup_5.eContents().get(1);
		private final RuleCall cTypeUI_Field_TypeEnumRuleCall_5_1_0 = (RuleCall)cTypeAssignment_5_1.eContents().get(0);
		private final Keyword cCommaKeyword_6 = (Keyword)cGroup.eContents().get(6);
		private final Assignment cMappingAssignment_7 = (Assignment)cGroup.eContents().get(7);
		private final RuleCall cMappingFieldMappingParserRuleCall_7_0 = (RuleCall)cMappingAssignment_7.eContents().get(0);
		
		//UIField vpui::UIField:
		//	{vpui::UIField} 'Field' name=EString ('label:' label=EString)? ('description:' description=EString ',')? ('type'
		//	type=UI_Field_Type)? ',' Mapping=FieldMapping
		@Override public ParserRule getRule() { return rule; }

		//{vpui::UIField} 'Field' name=EString ('label:' label=EString)? ('description:' description=EString ',')? ('type'
		//type=UI_Field_Type)? ',' Mapping=FieldMapping
		public Group getGroup() { return cGroup; }

		//{vpui::UIField}
		public Action getUIFieldAction_0() { return cUIFieldAction_0; }

		//'Field'
		public Keyword getFieldKeyword_1() { return cFieldKeyword_1; }

		//name=EString
		public Assignment getNameAssignment_2() { return cNameAssignment_2; }

		//EString
		public RuleCall getNameEStringParserRuleCall_2_0() { return cNameEStringParserRuleCall_2_0; }

		//('label:' label=EString)?
		public Group getGroup_3() { return cGroup_3; }

		//'label:'
		public Keyword getLabelKeyword_3_0() { return cLabelKeyword_3_0; }

		//label=EString
		public Assignment getLabelAssignment_3_1() { return cLabelAssignment_3_1; }

		//EString
		public RuleCall getLabelEStringParserRuleCall_3_1_0() { return cLabelEStringParserRuleCall_3_1_0; }

		//('description:' description=EString ',')?
		public Group getGroup_4() { return cGroup_4; }

		//'description:'
		public Keyword getDescriptionKeyword_4_0() { return cDescriptionKeyword_4_0; }

		//description=EString
		public Assignment getDescriptionAssignment_4_1() { return cDescriptionAssignment_4_1; }

		//EString
		public RuleCall getDescriptionEStringParserRuleCall_4_1_0() { return cDescriptionEStringParserRuleCall_4_1_0; }

		//','
		public Keyword getCommaKeyword_4_2() { return cCommaKeyword_4_2; }

		//('type' type=UI_Field_Type)?
		public Group getGroup_5() { return cGroup_5; }

		//'type'
		public Keyword getTypeKeyword_5_0() { return cTypeKeyword_5_0; }

		//type=UI_Field_Type
		public Assignment getTypeAssignment_5_1() { return cTypeAssignment_5_1; }

		//UI_Field_Type
		public RuleCall getTypeUI_Field_TypeEnumRuleCall_5_1_0() { return cTypeUI_Field_TypeEnumRuleCall_5_1_0; }

		//','
		public Keyword getCommaKeyword_6() { return cCommaKeyword_6; }

		//Mapping=FieldMapping
		public Assignment getMappingAssignment_7() { return cMappingAssignment_7; }

		//FieldMapping
		public RuleCall getMappingFieldMappingParserRuleCall_7_0() { return cMappingFieldMappingParserRuleCall_7_0; }
	}

	public class FieldMappingElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.Vpui.FieldMapping");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cFieldMappingAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cMappedToKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cUI_Field_Mapped_ToAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final CrossReference cUI_Field_Mapped_ToAbstractFeatureCrossReference_2_0 = (CrossReference)cUI_Field_Mapped_ToAssignment_2.eContents().get(0);
		private final RuleCall cUI_Field_Mapped_ToAbstractFeatureFQNParserRuleCall_2_0_1 = (RuleCall)cUI_Field_Mapped_ToAbstractFeatureCrossReference_2_0.eContents().get(1);
		
		//FieldMapping vpui::FieldMapping:
		//	{vpui::FieldMapping} 'mapped-to' UI_Field_Mapped_To=[vpdesc::AbstractFeature|FQN]?
		@Override public ParserRule getRule() { return rule; }

		//{vpui::FieldMapping} 'mapped-to' UI_Field_Mapped_To=[vpdesc::AbstractFeature|FQN]?
		public Group getGroup() { return cGroup; }

		//{vpui::FieldMapping}
		public Action getFieldMappingAction_0() { return cFieldMappingAction_0; }

		//'mapped-to'
		public Keyword getMappedToKeyword_1() { return cMappedToKeyword_1; }

		//UI_Field_Mapped_To=[vpdesc::AbstractFeature|FQN]?
		public Assignment getUI_Field_Mapped_ToAssignment_2() { return cUI_Field_Mapped_ToAssignment_2; }

		//[vpdesc::AbstractFeature|FQN]
		public CrossReference getUI_Field_Mapped_ToAbstractFeatureCrossReference_2_0() { return cUI_Field_Mapped_ToAbstractFeatureCrossReference_2_0; }

		//FQN
		public RuleCall getUI_Field_Mapped_ToAbstractFeatureFQNParserRuleCall_2_0_1() { return cUI_Field_Mapped_ToAbstractFeatureFQNParserRuleCall_2_0_1; }
	}
	
	
	public class UI_Field_TypeElements extends AbstractEnumRuleElementFinder {
		private final EnumRule rule = (EnumRule) GrammarUtil.findRuleForName(getGrammar(), "org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.Vpui.UI_Field_Type");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final EnumLiteralDeclaration cTextEnumLiteralDeclaration_0 = (EnumLiteralDeclaration)cAlternatives.eContents().get(0);
		private final Keyword cTextTextKeyword_0_0 = (Keyword)cTextEnumLiteralDeclaration_0.eContents().get(0);
		private final EnumLiteralDeclaration cTextareaEnumLiteralDeclaration_1 = (EnumLiteralDeclaration)cAlternatives.eContents().get(1);
		private final Keyword cTextareaTextareaKeyword_1_0 = (Keyword)cTextareaEnumLiteralDeclaration_1.eContents().get(0);
		private final EnumLiteralDeclaration cCheckboxEnumLiteralDeclaration_2 = (EnumLiteralDeclaration)cAlternatives.eContents().get(2);
		private final Keyword cCheckboxCheckboxKeyword_2_0 = (Keyword)cCheckboxEnumLiteralDeclaration_2.eContents().get(0);
		private final EnumLiteralDeclaration cRadioboxEnumLiteralDeclaration_3 = (EnumLiteralDeclaration)cAlternatives.eContents().get(3);
		private final Keyword cRadioboxRadioboxKeyword_3_0 = (Keyword)cRadioboxEnumLiteralDeclaration_3.eContents().get(0);
		private final EnumLiteralDeclaration cSimpleChoiceListEnumLiteralDeclaration_4 = (EnumLiteralDeclaration)cAlternatives.eContents().get(4);
		private final Keyword cSimpleChoiceListSimpleChoiceListKeyword_4_0 = (Keyword)cSimpleChoiceListEnumLiteralDeclaration_4.eContents().get(0);
		private final EnumLiteralDeclaration cMultipleChoiceListEnumLiteralDeclaration_5 = (EnumLiteralDeclaration)cAlternatives.eContents().get(5);
		private final Keyword cMultipleChoiceListMultipleChoiceListKeyword_5_0 = (Keyword)cMultipleChoiceListEnumLiteralDeclaration_5.eContents().get(0);
		private final EnumLiteralDeclaration cRichtextEnumLiteralDeclaration_6 = (EnumLiteralDeclaration)cAlternatives.eContents().get(6);
		private final Keyword cRichtextRichtextKeyword_6_0 = (Keyword)cRichtextEnumLiteralDeclaration_6.eContents().get(0);
		
		//enum UI_Field_Type returns vpui::UI_Field_Type:
		//	text | textarea | checkbox | radiobox | simpleChoiceList | multipleChoiceList | richtext;
		public EnumRule getRule() { return rule; }

		//text | textarea | checkbox | radiobox | simpleChoiceList | multipleChoiceList | richtext
		public Alternatives getAlternatives() { return cAlternatives; }

		//text
		public EnumLiteralDeclaration getTextEnumLiteralDeclaration_0() { return cTextEnumLiteralDeclaration_0; }

		//'text'
		public Keyword getTextTextKeyword_0_0() { return cTextTextKeyword_0_0; }

		//textarea
		public EnumLiteralDeclaration getTextareaEnumLiteralDeclaration_1() { return cTextareaEnumLiteralDeclaration_1; }

		//'textarea'
		public Keyword getTextareaTextareaKeyword_1_0() { return cTextareaTextareaKeyword_1_0; }

		//checkbox
		public EnumLiteralDeclaration getCheckboxEnumLiteralDeclaration_2() { return cCheckboxEnumLiteralDeclaration_2; }

		//'checkbox'
		public Keyword getCheckboxCheckboxKeyword_2_0() { return cCheckboxCheckboxKeyword_2_0; }

		//radiobox
		public EnumLiteralDeclaration getRadioboxEnumLiteralDeclaration_3() { return cRadioboxEnumLiteralDeclaration_3; }

		//'radiobox'
		public Keyword getRadioboxRadioboxKeyword_3_0() { return cRadioboxRadioboxKeyword_3_0; }

		//simpleChoiceList
		public EnumLiteralDeclaration getSimpleChoiceListEnumLiteralDeclaration_4() { return cSimpleChoiceListEnumLiteralDeclaration_4; }

		//'simpleChoiceList'
		public Keyword getSimpleChoiceListSimpleChoiceListKeyword_4_0() { return cSimpleChoiceListSimpleChoiceListKeyword_4_0; }

		//multipleChoiceList
		public EnumLiteralDeclaration getMultipleChoiceListEnumLiteralDeclaration_5() { return cMultipleChoiceListEnumLiteralDeclaration_5; }

		//'multipleChoiceList'
		public Keyword getMultipleChoiceListMultipleChoiceListKeyword_5_0() { return cMultipleChoiceListMultipleChoiceListKeyword_5_0; }

		//richtext
		public EnumLiteralDeclaration getRichtextEnumLiteralDeclaration_6() { return cRichtextEnumLiteralDeclaration_6; }

		//'richtext'
		public Keyword getRichtextRichtextKeyword_6_0() { return cRichtextRichtextKeyword_6_0; }
	}
	
	private final UserInterfaceElements pUserInterface;
	private final ImportElements pImport;
	private final AspectElements pAspect;
	private final UIDescriptionElements pUIDescription;
	private final DisplayableElementElements pDisplayableElement;
	private final UIElements pUI;
	private final UIContainerElements pUIContainer;
	private final DataSourceElements pDataSource;
	private final LocalClassElements pLocalClass;
	private final UIFieldElements pUIField;
	private final FieldMappingElements pFieldMapping;
	private final UI_Field_TypeElements eUI_Field_Type;
	
	private final Grammar grammar;

	private final CommonGrammarAccess gaCommon;

	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public VpuiGrammarAccess(GrammarProvider grammarProvider,
		CommonGrammarAccess gaCommon,
		TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaCommon = gaCommon;
		this.gaTerminals = gaTerminals;
		this.pUserInterface = new UserInterfaceElements();
		this.pImport = new ImportElements();
		this.pAspect = new AspectElements();
		this.pUIDescription = new UIDescriptionElements();
		this.pDisplayableElement = new DisplayableElementElements();
		this.pUI = new UIElements();
		this.pUIContainer = new UIContainerElements();
		this.pDataSource = new DataSourceElements();
		this.pLocalClass = new LocalClassElements();
		this.pUIField = new UIFieldElements();
		this.pFieldMapping = new FieldMappingElements();
		this.eUI_Field_Type = new UI_Field_TypeElements();
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.Vpui".equals(grammar.getName())) {
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

	
	//UserInterface:
	//	{UserInterface} imports+=Import* uiDescription=Aspect;
	public UserInterfaceElements getUserInterfaceAccess() {
		return pUserInterface;
	}
	
	public ParserRule getUserInterfaceRule() {
		return getUserInterfaceAccess().getRule();
	}

	//Import:
	//	'import' importedNamespace=FQN;
	public ImportElements getImportAccess() {
		return pImport;
	}
	
	public ParserRule getImportRule() {
		return getImportAccess().getRule();
	}

	//Aspect vpdesc::Aspect:
	//	UIDescription
	public AspectElements getAspectAccess() {
		return pAspect;
	}
	
	public ParserRule getAspectRule() {
		return getAspectAccess().getRule();
	}

	/// ********************************************************************
	// * 							vpui
	// * 
	// ******************************************************************** /
	//UIDescription vpdesc::Aspect:
	//	{vpui::UIDescription} 'UIDescription' name=FQN '{' => UIs+=UI* '}'
	public UIDescriptionElements getUIDescriptionAccess() {
		return pUIDescription;
	}
	
	public ParserRule getUIDescriptionRule() {
		return getUIDescriptionAccess().getRule();
	}

	//DisplayableElement vpui::DisplayableElement:
	//	UIContainer | UI | UIField
	public DisplayableElementElements getDisplayableElementAccess() {
		return pDisplayableElement;
	}
	
	public ParserRule getDisplayableElementRule() {
		return getDisplayableElementAccess().getRule();
	}

	//UI vpui::UI:
	//	{vpui::UI} 'UI' name=EString? UI_DataSource=DataSource? '{' ('label:' label=EString)? UI_Containers+=UIContainer* '}'
	public UIElements getUIAccess() {
		return pUI;
	}
	
	public ParserRule getUIRule() {
		return getUIAccess().getRule();
	}

	//UIContainer vpui::UIContainer:
	//	{vpui::UIContainer} 'Container' name=EString? '{' ('label:' label=EString)? ('description:' description=EString)?
	//	(UI_fields+=UIField UI_fields+=UIField*)? (subContainers+=UIContainer subContainers+=UIContainer*)? '}'
	public UIContainerElements getUIContainerAccess() {
		return pUIContainer;
	}
	
	public ParserRule getUIContainerRule() {
		return getUIContainerAccess().getRule();
	}

	//DataSource vpui::DataSource:
	//	LocalClass
	public DataSourceElements getDataSourceAccess() {
		return pDataSource;
	}
	
	public ParserRule getDataSourceRule() {
		return getDataSourceAccess().getRule();
	}

	//LocalClass vpui::DataSource:
	//	{vpui::LocalClass} 'for' UI_For_LocalClass=[vpdesc::Class|FQN]
	public LocalClassElements getLocalClassAccess() {
		return pLocalClass;
	}
	
	public ParserRule getLocalClassRule() {
		return getLocalClassAccess().getRule();
	}

	//UIField vpui::UIField:
	//	{vpui::UIField} 'Field' name=EString ('label:' label=EString)? ('description:' description=EString ',')? ('type'
	//	type=UI_Field_Type)? ',' Mapping=FieldMapping
	public UIFieldElements getUIFieldAccess() {
		return pUIField;
	}
	
	public ParserRule getUIFieldRule() {
		return getUIFieldAccess().getRule();
	}

	//FieldMapping vpui::FieldMapping:
	//	{vpui::FieldMapping} 'mapped-to' UI_Field_Mapped_To=[vpdesc::AbstractFeature|FQN]?
	public FieldMappingElements getFieldMappingAccess() {
		return pFieldMapping;
	}
	
	public ParserRule getFieldMappingRule() {
		return getFieldMappingAccess().getRule();
	}

	//enum UI_Field_Type returns vpui::UI_Field_Type:
	//	text | textarea | checkbox | radiobox | simpleChoiceList | multipleChoiceList | richtext;
	public UI_Field_TypeElements getUI_Field_TypeAccess() {
		return eUI_Field_Type;
	}
	
	public EnumRule getUI_Field_TypeRule() {
		return getUI_Field_TypeAccess().getRule();
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

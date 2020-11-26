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
import org.eclipse.xtext.CrossReference;
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
public class VpservicesGrammarAccess extends AbstractGrammarElementFinder {
	
	
	public class ServicesElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Services");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cServicesAction_0 = (Action)cGroup.eContents().get(0);
		private final Assignment cServicesAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cServicesAspectParserRuleCall_1_0 = (RuleCall)cServicesAssignment_1.eContents().get(0);
		
		/// ********************************************************************
		// * 							vpservices
		// * 
		// ******************************************************************** /
		////Aggregate services
		// Services:
		//	{Services} services+=Aspect+;
		@Override public ParserRule getRule() { return rule; }

		//{Services} services+=Aspect+
		public Group getGroup() { return cGroup; }

		//{Services}
		public Action getServicesAction_0() { return cServicesAction_0; }

		//services+=Aspect+
		public Assignment getServicesAssignment_1() { return cServicesAssignment_1; }

		//Aspect
		public RuleCall getServicesAspectParserRuleCall_1_0() { return cServicesAspectParserRuleCall_1_0; }
	}

	public class AspectElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Aspect");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cServiceSetParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cRuleSetParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		private final RuleCall cPropertySetParserRuleCall_2 = (RuleCall)cAlternatives.eContents().get(2);
		
		//Aspect returns vpdesc::Aspect:
		//	ServiceSet | RuleSet | PropertySet;
		@Override public ParserRule getRule() { return rule; }

		//ServiceSet | RuleSet | PropertySet
		public Alternatives getAlternatives() { return cAlternatives; }

		//ServiceSet
		public RuleCall getServiceSetParserRuleCall_0() { return cServiceSetParserRuleCall_0; }

		//RuleSet
		public RuleCall getRuleSetParserRuleCall_1() { return cRuleSetParserRuleCall_1; }

		//PropertySet
		public RuleCall getPropertySetParserRuleCall_2() { return cPropertySetParserRuleCall_2; }
	}

	public class ServiceSetElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "ServiceSet");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cServiceSetAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cServicesKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cNameAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cNameFQNParserRuleCall_2_0 = (RuleCall)cNameAssignment_2.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Group cGroup_4 = (Group)cGroup.eContents().get(4);
		private final Keyword cDescriptionKeyword_4_0 = (Keyword)cGroup_4.eContents().get(0);
		private final Assignment cDescriptionAssignment_4_1 = (Assignment)cGroup_4.eContents().get(1);
		private final RuleCall cDescriptionEStringParserRuleCall_4_1_0 = (RuleCall)cDescriptionAssignment_4_1.eContents().get(0);
		private final Group cGroup_5 = (Group)cGroup.eContents().get(5);
		private final Assignment cVpServicesAssignment_5_0 = (Assignment)cGroup_5.eContents().get(0);
		private final RuleCall cVpServicesServiceParserRuleCall_5_0_0 = (RuleCall)cVpServicesAssignment_5_0.eContents().get(0);
		private final Assignment cVpServicesAssignment_5_1 = (Assignment)cGroup_5.eContents().get(1);
		private final RuleCall cVpServicesServiceParserRuleCall_5_1_0 = (RuleCall)cVpServicesAssignment_5_1.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_6 = (Keyword)cGroup.eContents().get(6);
		
		//ServiceSet returns vpdesc::Aspect:
		//	{vpservices::ServiceSet} "Services" name=FQN "{" ("description:" description=EString)? (vpServices+=Service
		//	vpServices+=Service*)? "}";
		@Override public ParserRule getRule() { return rule; }

		//{vpservices::ServiceSet} "Services" name=FQN "{" ("description:" description=EString)? (vpServices+=Service
		//vpServices+=Service*)? "}"
		public Group getGroup() { return cGroup; }

		//{vpservices::ServiceSet}
		public Action getServiceSetAction_0() { return cServiceSetAction_0; }

		//"Services"
		public Keyword getServicesKeyword_1() { return cServicesKeyword_1; }

		//name=FQN
		public Assignment getNameAssignment_2() { return cNameAssignment_2; }

		//FQN
		public RuleCall getNameFQNParserRuleCall_2_0() { return cNameFQNParserRuleCall_2_0; }

		//"{"
		public Keyword getLeftCurlyBracketKeyword_3() { return cLeftCurlyBracketKeyword_3; }

		//("description:" description=EString)?
		public Group getGroup_4() { return cGroup_4; }

		//"description:"
		public Keyword getDescriptionKeyword_4_0() { return cDescriptionKeyword_4_0; }

		//description=EString
		public Assignment getDescriptionAssignment_4_1() { return cDescriptionAssignment_4_1; }

		//EString
		public RuleCall getDescriptionEStringParserRuleCall_4_1_0() { return cDescriptionEStringParserRuleCall_4_1_0; }

		//(vpServices+=Service vpServices+=Service*)?
		public Group getGroup_5() { return cGroup_5; }

		//vpServices+=Service
		public Assignment getVpServicesAssignment_5_0() { return cVpServicesAssignment_5_0; }

		//Service
		public RuleCall getVpServicesServiceParserRuleCall_5_0_0() { return cVpServicesServiceParserRuleCall_5_0_0; }

		//vpServices+=Service*
		public Assignment getVpServicesAssignment_5_1() { return cVpServicesAssignment_5_1; }

		//Service
		public RuleCall getVpServicesServiceParserRuleCall_5_1_0() { return cVpServicesServiceParserRuleCall_5_1_0; }

		//"}"
		public Keyword getRightCurlyBracketKeyword_6() { return cRightCurlyBracketKeyword_6; }
	}

	public class RuleSetElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "RuleSet");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cRuleSetAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cRulesKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cNameAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cNameFQNParserRuleCall_2_0 = (RuleCall)cNameAssignment_2.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Group cGroup_4 = (Group)cGroup.eContents().get(4);
		private final Keyword cDescriptionKeyword_4_0 = (Keyword)cGroup_4.eContents().get(0);
		private final Assignment cDescriptionAssignment_4_1 = (Assignment)cGroup_4.eContents().get(1);
		private final RuleCall cDescriptionEStringParserRuleCall_4_1_0 = (RuleCall)cDescriptionAssignment_4_1.eContents().get(0);
		private final Group cGroup_5 = (Group)cGroup.eContents().get(5);
		private final Assignment cVpRulesAssignment_5_0 = (Assignment)cGroup_5.eContents().get(0);
		private final RuleCall cVpRulesRuleParserRuleCall_5_0_0 = (RuleCall)cVpRulesAssignment_5_0.eContents().get(0);
		private final Assignment cVpRulesAssignment_5_1 = (Assignment)cGroup_5.eContents().get(1);
		private final RuleCall cVpRulesRuleParserRuleCall_5_1_0 = (RuleCall)cVpRulesAssignment_5_1.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_6 = (Keyword)cGroup.eContents().get(6);
		
		//RuleSet returns vpdesc::Aspect:
		//	{vpservices::RuleSet} "Rules" name=FQN "{" ("description:" description=EString)? (vpRules+=Rule vpRules+=Rule*)? "}";
		@Override public ParserRule getRule() { return rule; }

		//{vpservices::RuleSet} "Rules" name=FQN "{" ("description:" description=EString)? (vpRules+=Rule vpRules+=Rule*)? "}"
		public Group getGroup() { return cGroup; }

		//{vpservices::RuleSet}
		public Action getRuleSetAction_0() { return cRuleSetAction_0; }

		//"Rules"
		public Keyword getRulesKeyword_1() { return cRulesKeyword_1; }

		//name=FQN
		public Assignment getNameAssignment_2() { return cNameAssignment_2; }

		//FQN
		public RuleCall getNameFQNParserRuleCall_2_0() { return cNameFQNParserRuleCall_2_0; }

		//"{"
		public Keyword getLeftCurlyBracketKeyword_3() { return cLeftCurlyBracketKeyword_3; }

		//("description:" description=EString)?
		public Group getGroup_4() { return cGroup_4; }

		//"description:"
		public Keyword getDescriptionKeyword_4_0() { return cDescriptionKeyword_4_0; }

		//description=EString
		public Assignment getDescriptionAssignment_4_1() { return cDescriptionAssignment_4_1; }

		//EString
		public RuleCall getDescriptionEStringParserRuleCall_4_1_0() { return cDescriptionEStringParserRuleCall_4_1_0; }

		//(vpRules+=Rule vpRules+=Rule*)?
		public Group getGroup_5() { return cGroup_5; }

		//vpRules+=Rule
		public Assignment getVpRulesAssignment_5_0() { return cVpRulesAssignment_5_0; }

		//Rule
		public RuleCall getVpRulesRuleParserRuleCall_5_0_0() { return cVpRulesRuleParserRuleCall_5_0_0; }

		//vpRules+=Rule*
		public Assignment getVpRulesAssignment_5_1() { return cVpRulesAssignment_5_1; }

		//Rule
		public RuleCall getVpRulesRuleParserRuleCall_5_1_0() { return cVpRulesRuleParserRuleCall_5_1_0; }

		//"}"
		public Keyword getRightCurlyBracketKeyword_6() { return cRightCurlyBracketKeyword_6; }
	}

	public class ServiceElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Service");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cServiceAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cServiceKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cNameAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cNameFQNParserRuleCall_2_0 = (RuleCall)cNameAssignment_2.eContents().get(0);
		private final Group cGroup_3 = (Group)cGroup.eContents().get(3);
		private final Keyword cDescriptionKeyword_3_0 = (Keyword)cGroup_3.eContents().get(0);
		private final Assignment cDescriptionAssignment_3_1 = (Assignment)cGroup_3.eContents().get(1);
		private final RuleCall cDescriptionEStringParserRuleCall_3_1_0 = (RuleCall)cDescriptionAssignment_3_1.eContents().get(0);
		private final Keyword cCommaKeyword_3_2 = (Keyword)cGroup_3.eContents().get(2);
		private final Group cGroup_4 = (Group)cGroup.eContents().get(4);
		private final Keyword cOrchestratesKeyword_4_0 = (Keyword)cGroup_4.eContents().get(0);
		private final Assignment cRelatedRulesAssignment_4_1 = (Assignment)cGroup_4.eContents().get(1);
		private final CrossReference cRelatedRulesRuleCrossReference_4_1_0 = (CrossReference)cRelatedRulesAssignment_4_1.eContents().get(0);
		private final RuleCall cRelatedRulesRuleFQNParserRuleCall_4_1_0_1 = (RuleCall)cRelatedRulesRuleCrossReference_4_1_0.eContents().get(1);
		private final Group cGroup_4_2 = (Group)cGroup_4.eContents().get(2);
		private final Keyword cCommaKeyword_4_2_0 = (Keyword)cGroup_4_2.eContents().get(0);
		private final Assignment cRelatedRulesAssignment_4_2_1 = (Assignment)cGroup_4_2.eContents().get(1);
		private final CrossReference cRelatedRulesRuleCrossReference_4_2_1_0 = (CrossReference)cRelatedRulesAssignment_4_2_1.eContents().get(0);
		private final RuleCall cRelatedRulesRuleFQNParserRuleCall_4_2_1_0_1 = (RuleCall)cRelatedRulesRuleCrossReference_4_2_1_0.eContents().get(1);
		
		//Service returns vpservices::Service:
		//	{vpservices::Service} "Service" name=FQN //('id:' id = EString)?
		// //('vpid:' vpid = EString)?
		// ("description:"
		//	description=EString ",")? ("orchestrates" relatedRules+=[vpservices::Rule|FQN] (","
		//	relatedRules+=[vpservices::Rule|FQN])*)?;
		@Override public ParserRule getRule() { return rule; }

		//{vpservices::Service} "Service" name=FQN //('id:' id = EString)?
		// //('vpid:' vpid = EString)?
		// ("description:"
		//description=EString ",")? ("orchestrates" relatedRules+=[vpservices::Rule|FQN] (","
		//relatedRules+=[vpservices::Rule|FQN])*)?
		public Group getGroup() { return cGroup; }

		//{vpservices::Service}
		public Action getServiceAction_0() { return cServiceAction_0; }

		//"Service"
		public Keyword getServiceKeyword_1() { return cServiceKeyword_1; }

		//name=FQN
		public Assignment getNameAssignment_2() { return cNameAssignment_2; }

		//FQN
		public RuleCall getNameFQNParserRuleCall_2_0() { return cNameFQNParserRuleCall_2_0; }

		//("description:" description=EString ",")?
		public Group getGroup_3() { return cGroup_3; }

		//"description:"
		public Keyword getDescriptionKeyword_3_0() { return cDescriptionKeyword_3_0; }

		//description=EString
		public Assignment getDescriptionAssignment_3_1() { return cDescriptionAssignment_3_1; }

		//EString
		public RuleCall getDescriptionEStringParserRuleCall_3_1_0() { return cDescriptionEStringParserRuleCall_3_1_0; }

		//","
		public Keyword getCommaKeyword_3_2() { return cCommaKeyword_3_2; }

		//("orchestrates" relatedRules+=[vpservices::Rule|FQN] ("," relatedRules+=[vpservices::Rule|FQN])*)?
		public Group getGroup_4() { return cGroup_4; }

		//"orchestrates"
		public Keyword getOrchestratesKeyword_4_0() { return cOrchestratesKeyword_4_0; }

		//relatedRules+=[vpservices::Rule|FQN]
		public Assignment getRelatedRulesAssignment_4_1() { return cRelatedRulesAssignment_4_1; }

		//[vpservices::Rule|FQN]
		public CrossReference getRelatedRulesRuleCrossReference_4_1_0() { return cRelatedRulesRuleCrossReference_4_1_0; }

		//FQN
		public RuleCall getRelatedRulesRuleFQNParserRuleCall_4_1_0_1() { return cRelatedRulesRuleFQNParserRuleCall_4_1_0_1; }

		//("," relatedRules+=[vpservices::Rule|FQN])*
		public Group getGroup_4_2() { return cGroup_4_2; }

		//","
		public Keyword getCommaKeyword_4_2_0() { return cCommaKeyword_4_2_0; }

		//relatedRules+=[vpservices::Rule|FQN]
		public Assignment getRelatedRulesAssignment_4_2_1() { return cRelatedRulesAssignment_4_2_1; }

		//[vpservices::Rule|FQN]
		public CrossReference getRelatedRulesRuleCrossReference_4_2_1_0() { return cRelatedRulesRuleCrossReference_4_2_1_0; }

		//FQN
		public RuleCall getRelatedRulesRuleFQNParserRuleCall_4_2_1_0_1() { return cRelatedRulesRuleFQNParserRuleCall_4_2_1_0_1; }
	}

	public class RuleElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Rule");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cRuleAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cRuleKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cNameAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cNameFQNParserRuleCall_2_0 = (RuleCall)cNameAssignment_2.eContents().get(0);
		private final Group cGroup_3 = (Group)cGroup.eContents().get(3);
		private final Keyword cDescriptionKeyword_3_0 = (Keyword)cGroup_3.eContents().get(0);
		private final Assignment cDescriptionAssignment_3_1 = (Assignment)cGroup_3.eContents().get(1);
		private final RuleCall cDescriptionEStringParserRuleCall_3_1_0 = (RuleCall)cDescriptionAssignment_3_1.eContents().get(0);
		private final Keyword cCommaKeyword_3_2 = (Keyword)cGroup_3.eContents().get(2);
		private final Group cGroup_4 = (Group)cGroup.eContents().get(4);
		private final Keyword cTypeKeyword_4_0 = (Keyword)cGroup_4.eContents().get(0);
		private final Assignment cTypeAssignment_4_1 = (Assignment)cGroup_4.eContents().get(1);
		private final RuleCall cTypeRules_TypesEnumRuleCall_4_1_0 = (RuleCall)cTypeAssignment_4_1.eContents().get(0);
		private final Group cGroup_5 = (Group)cGroup.eContents().get(5);
		private final Keyword cCommaKeyword_5_0 = (Keyword)cGroup_5.eContents().get(0);
		private final Keyword cClassKeyword_5_1 = (Keyword)cGroup_5.eContents().get(1);
		private final Assignment cClassAssignment_5_2 = (Assignment)cGroup_5.eContents().get(2);
		private final RuleCall cClassEStringParserRuleCall_5_2_0 = (RuleCall)cClassAssignment_5_2.eContents().get(0);
		
		//Rule returns vpservices::Rule:
		//	{vpservices::Rule} "Rule" name=FQN //('id:' id = EString)?
		// //('vpid:' vpid = EString)?
		// ("description:"
		//	description=EString ",")? ("type" type=Rules_Types) ("," "class" class=EString)?;
		@Override public ParserRule getRule() { return rule; }

		//{vpservices::Rule} "Rule" name=FQN //('id:' id = EString)?
		// //('vpid:' vpid = EString)?
		// ("description:"
		//description=EString ",")? ("type" type=Rules_Types) ("," "class" class=EString)?
		public Group getGroup() { return cGroup; }

		//{vpservices::Rule}
		public Action getRuleAction_0() { return cRuleAction_0; }

		//"Rule"
		public Keyword getRuleKeyword_1() { return cRuleKeyword_1; }

		//name=FQN
		public Assignment getNameAssignment_2() { return cNameAssignment_2; }

		//FQN
		public RuleCall getNameFQNParserRuleCall_2_0() { return cNameFQNParserRuleCall_2_0; }

		//("description:" description=EString ",")?
		public Group getGroup_3() { return cGroup_3; }

		//"description:"
		public Keyword getDescriptionKeyword_3_0() { return cDescriptionKeyword_3_0; }

		//description=EString
		public Assignment getDescriptionAssignment_3_1() { return cDescriptionAssignment_3_1; }

		//EString
		public RuleCall getDescriptionEStringParserRuleCall_3_1_0() { return cDescriptionEStringParserRuleCall_3_1_0; }

		//","
		public Keyword getCommaKeyword_3_2() { return cCommaKeyword_3_2; }

		//"type" type=Rules_Types
		public Group getGroup_4() { return cGroup_4; }

		//"type"
		public Keyword getTypeKeyword_4_0() { return cTypeKeyword_4_0; }

		//type=Rules_Types
		public Assignment getTypeAssignment_4_1() { return cTypeAssignment_4_1; }

		//Rules_Types
		public RuleCall getTypeRules_TypesEnumRuleCall_4_1_0() { return cTypeRules_TypesEnumRuleCall_4_1_0; }

		//("," "class" class=EString)?
		public Group getGroup_5() { return cGroup_5; }

		//","
		public Keyword getCommaKeyword_5_0() { return cCommaKeyword_5_0; }

		//"class"
		public Keyword getClassKeyword_5_1() { return cClassKeyword_5_1; }

		//class=EString
		public Assignment getClassAssignment_5_2() { return cClassAssignment_5_2; }

		//EString
		public RuleCall getClassEStringParserRuleCall_5_2_0() { return cClassEStringParserRuleCall_5_2_0; }
	}

	public class PropertySetElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "PropertySet");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cPropertySetAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cPropertiesKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cNameAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cNameFQNParserRuleCall_2_0 = (RuleCall)cNameAssignment_2.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cVpPropertiesAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cVpPropertiesPropertyParserRuleCall_4_0 = (RuleCall)cVpPropertiesAssignment_4.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_5 = (Keyword)cGroup.eContents().get(5);
		
		//PropertySet returns vpdesc::Aspect:
		//	{vpservices::PropertySet} "Properties" name=FQN "{" vpProperties+=Property* "}";
		@Override public ParserRule getRule() { return rule; }

		//{vpservices::PropertySet} "Properties" name=FQN "{" vpProperties+=Property* "}"
		public Group getGroup() { return cGroup; }

		//{vpservices::PropertySet}
		public Action getPropertySetAction_0() { return cPropertySetAction_0; }

		//"Properties"
		public Keyword getPropertiesKeyword_1() { return cPropertiesKeyword_1; }

		//name=FQN
		public Assignment getNameAssignment_2() { return cNameAssignment_2; }

		//FQN
		public RuleCall getNameFQNParserRuleCall_2_0() { return cNameFQNParserRuleCall_2_0; }

		//"{"
		public Keyword getLeftCurlyBracketKeyword_3() { return cLeftCurlyBracketKeyword_3; }

		//vpProperties+=Property*
		public Assignment getVpPropertiesAssignment_4() { return cVpPropertiesAssignment_4; }

		//Property
		public RuleCall getVpPropertiesPropertyParserRuleCall_4_0() { return cVpPropertiesPropertyParserRuleCall_4_0; }

		//"}"
		public Keyword getRightCurlyBracketKeyword_5() { return cRightCurlyBracketKeyword_5; }
	}

	public class PropertyElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Property");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cPropertyAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cPropertyKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cNameAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cNameEStringParserRuleCall_2_0 = (RuleCall)cNameAssignment_2.eContents().get(0);
		private final Group cGroup_3 = (Group)cGroup.eContents().get(3);
		private final Keyword cTypeKeyword_3_0 = (Keyword)cGroup_3.eContents().get(0);
		private final Assignment cTypeAssignment_3_1 = (Assignment)cGroup_3.eContents().get(1);
		private final RuleCall cTypePropertyTypeEnumRuleCall_3_1_0 = (RuleCall)cTypeAssignment_3_1.eContents().get(0);
		private final Group cGroup_4 = (Group)cGroup.eContents().get(4);
		private final Keyword cValueKeyword_4_0 = (Keyword)cGroup_4.eContents().get(0);
		private final Assignment cValueAssignment_4_1 = (Assignment)cGroup_4.eContents().get(1);
		private final RuleCall cValueEStringParserRuleCall_4_1_0 = (RuleCall)cValueAssignment_4_1.eContents().get(0);
		
		//Property returns vpservices::Property:
		//	{vpservices::Property} "Property" name=EString ("type" Type=PropertyType)? ("value" value=EString)?;
		@Override public ParserRule getRule() { return rule; }

		//{vpservices::Property} "Property" name=EString ("type" Type=PropertyType)? ("value" value=EString)?
		public Group getGroup() { return cGroup; }

		//{vpservices::Property}
		public Action getPropertyAction_0() { return cPropertyAction_0; }

		//"Property"
		public Keyword getPropertyKeyword_1() { return cPropertyKeyword_1; }

		//name=EString
		public Assignment getNameAssignment_2() { return cNameAssignment_2; }

		//EString
		public RuleCall getNameEStringParserRuleCall_2_0() { return cNameEStringParserRuleCall_2_0; }

		//("type" Type=PropertyType)?
		public Group getGroup_3() { return cGroup_3; }

		//"type"
		public Keyword getTypeKeyword_3_0() { return cTypeKeyword_3_0; }

		//Type=PropertyType
		public Assignment getTypeAssignment_3_1() { return cTypeAssignment_3_1; }

		//PropertyType
		public RuleCall getTypePropertyTypeEnumRuleCall_3_1_0() { return cTypePropertyTypeEnumRuleCall_3_1_0; }

		//("value" value=EString)?
		public Group getGroup_4() { return cGroup_4; }

		//"value"
		public Keyword getValueKeyword_4_0() { return cValueKeyword_4_0; }

		//value=EString
		public Assignment getValueAssignment_4_1() { return cValueAssignment_4_1; }

		//EString
		public RuleCall getValueEStringParserRuleCall_4_1_0() { return cValueEStringParserRuleCall_4_1_0; }
	}
	
	
	public class Rules_TypesElements extends AbstractEnumRuleElementFinder {
		private final EnumRule rule = (EnumRule) GrammarUtil.findRuleForName(getGrammar(), "Rules_Types");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final EnumLiteralDeclaration cJavaEnumLiteralDeclaration_0 = (EnumLiteralDeclaration)cAlternatives.eContents().get(0);
		private final Keyword cJavaJavaKeyword_0_0 = (Keyword)cJavaEnumLiteralDeclaration_0.eContents().get(0);
		private final EnumLiteralDeclaration cEMFvalidationEnumLiteralDeclaration_1 = (EnumLiteralDeclaration)cAlternatives.eContents().get(1);
		private final Keyword cEMFvalidationEMFvalidationKeyword_1_0 = (Keyword)cEMFvalidationEnumLiteralDeclaration_1.eContents().get(0);
		
		//enum Rules_Types returns vpservices::Rules_Types:
		//	Java | EMFvalidation;
		public EnumRule getRule() { return rule; }

		//Java | EMFvalidation
		public Alternatives getAlternatives() { return cAlternatives; }

		//Java
		public EnumLiteralDeclaration getJavaEnumLiteralDeclaration_0() { return cJavaEnumLiteralDeclaration_0; }

		//"Java"
		public Keyword getJavaJavaKeyword_0_0() { return cJavaJavaKeyword_0_0; }

		//EMFvalidation
		public EnumLiteralDeclaration getEMFvalidationEnumLiteralDeclaration_1() { return cEMFvalidationEnumLiteralDeclaration_1; }

		//"EMFvalidation"
		public Keyword getEMFvalidationEMFvalidationKeyword_1_0() { return cEMFvalidationEMFvalidationKeyword_1_0; }
	}

	public class PropertyTypeElements extends AbstractEnumRuleElementFinder {
		private final EnumRule rule = (EnumRule) GrammarUtil.findRuleForName(getGrammar(), "PropertyType");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final EnumLiteralDeclaration cIntegerEnumLiteralDeclaration_0 = (EnumLiteralDeclaration)cAlternatives.eContents().get(0);
		private final Keyword cIntegerIntegerKeyword_0_0 = (Keyword)cIntegerEnumLiteralDeclaration_0.eContents().get(0);
		private final EnumLiteralDeclaration cStringEnumLiteralDeclaration_1 = (EnumLiteralDeclaration)cAlternatives.eContents().get(1);
		private final Keyword cStringStringKeyword_1_0 = (Keyword)cStringEnumLiteralDeclaration_1.eContents().get(0);
		private final EnumLiteralDeclaration cBooleanEnumLiteralDeclaration_2 = (EnumLiteralDeclaration)cAlternatives.eContents().get(2);
		private final Keyword cBooleanBooleanKeyword_2_0 = (Keyword)cBooleanEnumLiteralDeclaration_2.eContents().get(0);
		private final EnumLiteralDeclaration cFloatEnumLiteralDeclaration_3 = (EnumLiteralDeclaration)cAlternatives.eContents().get(3);
		private final Keyword cFloatFloatKeyword_3_0 = (Keyword)cFloatEnumLiteralDeclaration_3.eContents().get(0);
		
		//enum PropertyType returns vpservices::PropertyType:
		//	Integer | String | Boolean | Float;
		public EnumRule getRule() { return rule; }

		//Integer | String | Boolean | Float
		public Alternatives getAlternatives() { return cAlternatives; }

		//Integer
		public EnumLiteralDeclaration getIntegerEnumLiteralDeclaration_0() { return cIntegerEnumLiteralDeclaration_0; }

		//"Integer"
		public Keyword getIntegerIntegerKeyword_0_0() { return cIntegerIntegerKeyword_0_0; }

		//String
		public EnumLiteralDeclaration getStringEnumLiteralDeclaration_1() { return cStringEnumLiteralDeclaration_1; }

		//"String"
		public Keyword getStringStringKeyword_1_0() { return cStringStringKeyword_1_0; }

		//Boolean
		public EnumLiteralDeclaration getBooleanEnumLiteralDeclaration_2() { return cBooleanEnumLiteralDeclaration_2; }

		//"Boolean"
		public Keyword getBooleanBooleanKeyword_2_0() { return cBooleanBooleanKeyword_2_0; }

		//Float
		public EnumLiteralDeclaration getFloatEnumLiteralDeclaration_3() { return cFloatEnumLiteralDeclaration_3; }

		//"Float"
		public Keyword getFloatFloatKeyword_3_0() { return cFloatFloatKeyword_3_0; }
	}
	
	private final ServicesElements pServices;
	private final AspectElements pAspect;
	private final ServiceSetElements pServiceSet;
	private final RuleSetElements pRuleSet;
	private final ServiceElements pService;
	private final RuleElements pRule;
	private final PropertySetElements pPropertySet;
	private final PropertyElements pProperty;
	private final Rules_TypesElements unknownRuleRules_Types;
	private final PropertyTypeElements unknownRulePropertyType;
	
	private final Grammar grammar;

	private final CommonGrammarAccess gaCommon;

	@Inject
	public VpservicesGrammarAccess(GrammarProvider grammarProvider,
		CommonGrammarAccess gaCommon) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaCommon = gaCommon;
		this.pServices = new ServicesElements();
		this.pAspect = new AspectElements();
		this.pServiceSet = new ServiceSetElements();
		this.pRuleSet = new RuleSetElements();
		this.pService = new ServiceElements();
		this.pRule = new RuleElements();
		this.pPropertySet = new PropertySetElements();
		this.pProperty = new PropertyElements();
		this.unknownRuleRules_Types = new Rules_TypesElements();
		this.unknownRulePropertyType = new PropertyTypeElements();
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.Vpservices".equals(grammar.getName())) {
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
	// * 							vpservices
	// * 
	// ******************************************************************** /
	////Aggregate services
	// Services:
	//	{Services} services+=Aspect+;
	public ServicesElements getServicesAccess() {
		return pServices;
	}
	
	public ParserRule getServicesRule() {
		return getServicesAccess().getRule();
	}

	//Aspect returns vpdesc::Aspect:
	//	ServiceSet | RuleSet | PropertySet;
	public AspectElements getAspectAccess() {
		return pAspect;
	}
	
	public ParserRule getAspectRule() {
		return getAspectAccess().getRule();
	}

	//ServiceSet returns vpdesc::Aspect:
	//	{vpservices::ServiceSet} "Services" name=FQN "{" ("description:" description=EString)? (vpServices+=Service
	//	vpServices+=Service*)? "}";
	public ServiceSetElements getServiceSetAccess() {
		return pServiceSet;
	}
	
	public ParserRule getServiceSetRule() {
		return getServiceSetAccess().getRule();
	}

	//RuleSet returns vpdesc::Aspect:
	//	{vpservices::RuleSet} "Rules" name=FQN "{" ("description:" description=EString)? (vpRules+=Rule vpRules+=Rule*)? "}";
	public RuleSetElements getRuleSetAccess() {
		return pRuleSet;
	}
	
	public ParserRule getRuleSetRule() {
		return getRuleSetAccess().getRule();
	}

	//Service returns vpservices::Service:
	//	{vpservices::Service} "Service" name=FQN //('id:' id = EString)?
	// //('vpid:' vpid = EString)?
	// ("description:"
	//	description=EString ",")? ("orchestrates" relatedRules+=[vpservices::Rule|FQN] (","
	//	relatedRules+=[vpservices::Rule|FQN])*)?;
	public ServiceElements getServiceAccess() {
		return pService;
	}
	
	public ParserRule getServiceRule() {
		return getServiceAccess().getRule();
	}

	//Rule returns vpservices::Rule:
	//	{vpservices::Rule} "Rule" name=FQN //('id:' id = EString)?
	// //('vpid:' vpid = EString)?
	// ("description:"
	//	description=EString ",")? ("type" type=Rules_Types) ("," "class" class=EString)?;
	public RuleElements getRuleAccess() {
		return pRule;
	}
	
	public ParserRule getRuleRule() {
		return getRuleAccess().getRule();
	}

	//PropertySet returns vpdesc::Aspect:
	//	{vpservices::PropertySet} "Properties" name=FQN "{" vpProperties+=Property* "}";
	public PropertySetElements getPropertySetAccess() {
		return pPropertySet;
	}
	
	public ParserRule getPropertySetRule() {
		return getPropertySetAccess().getRule();
	}

	//Property returns vpservices::Property:
	//	{vpservices::Property} "Property" name=EString ("type" Type=PropertyType)? ("value" value=EString)?;
	public PropertyElements getPropertyAccess() {
		return pProperty;
	}
	
	public ParserRule getPropertyRule() {
		return getPropertyAccess().getRule();
	}

	//enum Rules_Types returns vpservices::Rules_Types:
	//	Java | EMFvalidation;
	public Rules_TypesElements getRules_TypesAccess() {
		return unknownRuleRules_Types;
	}
	
	public EnumRule getRules_TypesRule() {
		return getRules_TypesAccess().getRule();
	}

	//enum PropertyType returns vpservices::PropertyType:
	//	Integer | String | Boolean | Float;
	public PropertyTypeElements getPropertyTypeAccess() {
		return unknownRulePropertyType;
	}
	
	public EnumRule getPropertyTypeRule() {
		return getPropertyTypeAccess().getRule();
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

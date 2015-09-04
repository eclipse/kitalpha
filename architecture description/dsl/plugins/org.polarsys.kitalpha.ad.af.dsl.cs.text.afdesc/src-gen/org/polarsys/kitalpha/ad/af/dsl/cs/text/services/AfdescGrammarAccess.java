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
package org.polarsys.kitalpha.ad.af.dsl.cs.text.services;

import com.google.inject.Singleton;
import com.google.inject.Inject;

import java.util.List;

import org.eclipse.xtext.*;
import org.eclipse.xtext.service.GrammarProvider;
import org.eclipse.xtext.service.AbstractElementFinder.*;

import org.eclipse.xtext.common.services.TerminalsGrammarAccess;

@Singleton
public class AfdescGrammarAccess extends AbstractGrammarElementFinder {
	
	
	public class NamedElementElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "NamedElement");
		private final RuleCall cArchitectureFrameworkParserRuleCall = (RuleCall)rule.eContents().get(1);
		
		/// **
		// * 
		// * @author Amine Lajmi
		// *
		// * / NamedElement returns afdsl::NamedElement:
		//	ArchitectureFramework;
		@Override public ParserRule getRule() { return rule; }

		//ArchitectureFramework
		public RuleCall getArchitectureFrameworkParserRuleCall() { return cArchitectureFrameworkParserRuleCall; }
	}

	public class ArchitectureFrameworkElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "ArchitectureFramework");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cArchitectureFrameworkAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cArchitectureFrameworkKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cNameAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cNameIDTerminalRuleCall_2_0 = (RuleCall)cNameAssignment_2.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Group cGroup_4 = (Group)cGroup.eContents().get(4);
		private final Keyword cDescriptionKeyword_4_0 = (Keyword)cGroup_4.eContents().get(0);
		private final Assignment cDescriptionAssignment_4_1 = (Assignment)cGroup_4.eContents().get(1);
		private final RuleCall cDescriptionSTRINGTerminalRuleCall_4_1_0 = (RuleCall)cDescriptionAssignment_4_1.eContents().get(0);
		private final Group cGroup_5 = (Group)cGroup.eContents().get(5);
		private final Keyword cShortNameKeyword_5_0 = (Keyword)cGroup_5.eContents().get(0);
		private final Assignment cShortNameAssignment_5_1 = (Assignment)cGroup_5.eContents().get(1);
		private final RuleCall cShortNameSTRINGTerminalRuleCall_5_1_0 = (RuleCall)cShortNameAssignment_5_1.eContents().get(0);
		private final Assignment cAf_viewpointsAssignment_6 = (Assignment)cGroup.eContents().get(6);
		private final RuleCall cAf_viewpointsViewpointsParserRuleCall_6_0 = (RuleCall)cAf_viewpointsAssignment_6.eContents().get(0);
		private final Assignment cOwned_configurationAssignment_7 = (Assignment)cGroup.eContents().get(7);
		private final RuleCall cOwned_configurationConfigurationParserRuleCall_7_0 = (RuleCall)cOwned_configurationAssignment_7.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_8 = (Keyword)cGroup.eContents().get(8);
		
		//ArchitectureFramework returns afdsl::ArchitectureFramework:
		//	{afdsl::ArchitectureFramework} "ArchitectureFramework" name=ID? "{" ("description:" description=STRING)?
		//	("shortName:" shortName=STRING)? //(af_aspects+=Aspect)*
		//	af_viewpoints=Viewpoints? owned_configuration=Configuration "}";
		@Override public ParserRule getRule() { return rule; }

		//{afdsl::ArchitectureFramework} "ArchitectureFramework" name=ID? "{" ("description:" description=STRING)? ("shortName:"
		//shortName=STRING)? //(af_aspects+=Aspect)*
		//af_viewpoints=Viewpoints? owned_configuration=Configuration "}"
		public Group getGroup() { return cGroup; }

		//{afdsl::ArchitectureFramework}
		public Action getArchitectureFrameworkAction_0() { return cArchitectureFrameworkAction_0; }

		//"ArchitectureFramework"
		public Keyword getArchitectureFrameworkKeyword_1() { return cArchitectureFrameworkKeyword_1; }

		//name=ID?
		public Assignment getNameAssignment_2() { return cNameAssignment_2; }

		//ID
		public RuleCall getNameIDTerminalRuleCall_2_0() { return cNameIDTerminalRuleCall_2_0; }

		//"{"
		public Keyword getLeftCurlyBracketKeyword_3() { return cLeftCurlyBracketKeyword_3; }

		//("description:" description=STRING)?
		public Group getGroup_4() { return cGroup_4; }

		//"description:"
		public Keyword getDescriptionKeyword_4_0() { return cDescriptionKeyword_4_0; }

		//description=STRING
		public Assignment getDescriptionAssignment_4_1() { return cDescriptionAssignment_4_1; }

		//STRING
		public RuleCall getDescriptionSTRINGTerminalRuleCall_4_1_0() { return cDescriptionSTRINGTerminalRuleCall_4_1_0; }

		//("shortName:" shortName=STRING)?
		public Group getGroup_5() { return cGroup_5; }

		//"shortName:"
		public Keyword getShortNameKeyword_5_0() { return cShortNameKeyword_5_0; }

		//shortName=STRING
		public Assignment getShortNameAssignment_5_1() { return cShortNameAssignment_5_1; }

		//STRING
		public RuleCall getShortNameSTRINGTerminalRuleCall_5_1_0() { return cShortNameSTRINGTerminalRuleCall_5_1_0; }

		//af_viewpoints=Viewpoints?
		public Assignment getAf_viewpointsAssignment_6() { return cAf_viewpointsAssignment_6; }

		//Viewpoints
		public RuleCall getAf_viewpointsViewpointsParserRuleCall_6_0() { return cAf_viewpointsViewpointsParserRuleCall_6_0; }

		//owned_configuration=Configuration
		public Assignment getOwned_configurationAssignment_7() { return cOwned_configurationAssignment_7; }

		//Configuration
		public RuleCall getOwned_configurationConfigurationParserRuleCall_7_0() { return cOwned_configurationConfigurationParserRuleCall_7_0; }

		//"}"
		public Keyword getRightCurlyBracketKeyword_8() { return cRightCurlyBracketKeyword_8; }
	}

	public class ConfigurationElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Configuration");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cConfigurationAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cConfigurationKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cLeftCurlyBracketKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Group cGroup_3 = (Group)cGroup.eContents().get(3);
		private final Assignment cOwned_elementAssignment_3_0 = (Assignment)cGroup_3.eContents().get(0);
		private final RuleCall cOwned_elementConfigurationElementParserRuleCall_3_0_0 = (RuleCall)cOwned_elementAssignment_3_0.eContents().get(0);
		private final Group cGroup_3_1 = (Group)cGroup_3.eContents().get(1);
		private final Keyword cCommaKeyword_3_1_0 = (Keyword)cGroup_3_1.eContents().get(0);
		private final Assignment cOwned_elementAssignment_3_1_1 = (Assignment)cGroup_3_1.eContents().get(1);
		private final RuleCall cOwned_elementConfigurationElementParserRuleCall_3_1_1_0 = (RuleCall)cOwned_elementAssignment_3_1_1.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_4 = (Keyword)cGroup.eContents().get(4);
		
		//Configuration returns afdsl::Configuration:
		//	{afdsl::Configuration} "Configuration" "{" (owned_element+=ConfigurationElement (","
		//	owned_element+=ConfigurationElement)*)? "}";
		@Override public ParserRule getRule() { return rule; }

		//{afdsl::Configuration} "Configuration" "{" (owned_element+=ConfigurationElement (","
		//owned_element+=ConfigurationElement)*)? "}"
		public Group getGroup() { return cGroup; }

		//{afdsl::Configuration}
		public Action getConfigurationAction_0() { return cConfigurationAction_0; }

		//"Configuration"
		public Keyword getConfigurationKeyword_1() { return cConfigurationKeyword_1; }

		//"{"
		public Keyword getLeftCurlyBracketKeyword_2() { return cLeftCurlyBracketKeyword_2; }

		//(owned_element+=ConfigurationElement ("," owned_element+=ConfigurationElement)*)?
		public Group getGroup_3() { return cGroup_3; }

		//owned_element+=ConfigurationElement
		public Assignment getOwned_elementAssignment_3_0() { return cOwned_elementAssignment_3_0; }

		//ConfigurationElement
		public RuleCall getOwned_elementConfigurationElementParserRuleCall_3_0_0() { return cOwned_elementConfigurationElementParserRuleCall_3_0_0; }

		//("," owned_element+=ConfigurationElement)*
		public Group getGroup_3_1() { return cGroup_3_1; }

		//","
		public Keyword getCommaKeyword_3_1_0() { return cCommaKeyword_3_1_0; }

		//owned_element+=ConfigurationElement
		public Assignment getOwned_elementAssignment_3_1_1() { return cOwned_elementAssignment_3_1_1; }

		//ConfigurationElement
		public RuleCall getOwned_elementConfigurationElementParserRuleCall_3_1_1_0() { return cOwned_elementConfigurationElementParserRuleCall_3_1_1_0; }

		//"}"
		public Keyword getRightCurlyBracketKeyword_4() { return cRightCurlyBracketKeyword_4; }
	}

	public class ConfigurationElementElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "ConfigurationElement");
		private final RuleCall cGenerationConfigurationParserRuleCall = (RuleCall)rule.eContents().get(1);
		
		//ConfigurationElement returns afdsl::ConfigurationElement:
		//	GenerationConfiguration;
		@Override public ParserRule getRule() { return rule; }

		//GenerationConfiguration
		public RuleCall getGenerationConfigurationParserRuleCall() { return cGenerationConfigurationParserRuleCall; }
	}

	public class GenerationConfigurationElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "GenerationConfiguration");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cGenerationConfigurationAction_0 = (Action)cGroup.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Keyword cRootProjectNameKeyword_1_0 = (Keyword)cGroup_1.eContents().get(0);
		private final Assignment cRootProjectNameAssignment_1_1 = (Assignment)cGroup_1.eContents().get(1);
		private final RuleCall cRootProjectNameFQNParserRuleCall_1_1_0 = (RuleCall)cRootProjectNameAssignment_1_1.eContents().get(0);
		
		//GenerationConfiguration returns afdsl::ConfigurationElement:
		//	{afdsl::GenerationConfiguration} ("rootProjectName:" rootProjectName=FQN);
		@Override public ParserRule getRule() { return rule; }

		//{afdsl::GenerationConfiguration} ("rootProjectName:" rootProjectName=FQN)
		public Group getGroup() { return cGroup; }

		//{afdsl::GenerationConfiguration}
		public Action getGenerationConfigurationAction_0() { return cGenerationConfigurationAction_0; }

		//"rootProjectName:" rootProjectName=FQN
		public Group getGroup_1() { return cGroup_1; }

		//"rootProjectName:"
		public Keyword getRootProjectNameKeyword_1_0() { return cRootProjectNameKeyword_1_0; }

		//rootProjectName=FQN
		public Assignment getRootProjectNameAssignment_1_1() { return cRootProjectNameAssignment_1_1; }

		//FQN
		public RuleCall getRootProjectNameFQNParserRuleCall_1_1_0() { return cRootProjectNameFQNParserRuleCall_1_1_0; }
	}

	public class ViewpointsElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Viewpoints");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cViewpointsAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cViewpointsKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cLeftCurlyBracketKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Group cGroup_3 = (Group)cGroup.eContents().get(3);
		private final Assignment cOwned_viewpointsAssignment_3_0 = (Assignment)cGroup_3.eContents().get(0);
		private final CrossReference cOwned_viewpointsViewpointCrossReference_3_0_0 = (CrossReference)cOwned_viewpointsAssignment_3_0.eContents().get(0);
		private final RuleCall cOwned_viewpointsViewpointIDTerminalRuleCall_3_0_0_1 = (RuleCall)cOwned_viewpointsViewpointCrossReference_3_0_0.eContents().get(1);
		private final Group cGroup_3_1 = (Group)cGroup_3.eContents().get(1);
		private final Keyword cCommaKeyword_3_1_0 = (Keyword)cGroup_3_1.eContents().get(0);
		private final Assignment cOwned_viewpointsAssignment_3_1_1 = (Assignment)cGroup_3_1.eContents().get(1);
		private final CrossReference cOwned_viewpointsViewpointCrossReference_3_1_1_0 = (CrossReference)cOwned_viewpointsAssignment_3_1_1.eContents().get(0);
		private final RuleCall cOwned_viewpointsViewpointIDTerminalRuleCall_3_1_1_0_1 = (RuleCall)cOwned_viewpointsViewpointCrossReference_3_1_1_0.eContents().get(1);
		private final Keyword cRightCurlyBracketKeyword_4 = (Keyword)cGroup.eContents().get(4);
		
		//Viewpoints returns afdsl::Viewpoints:
		//	{afdsl::Viewpoints} "Viewpoints" "{" (owned_viewpoints+=[vpspec::Viewpoint] (","
		//	owned_viewpoints+=[vpspec::Viewpoint])*)? "}";
		@Override public ParserRule getRule() { return rule; }

		//{afdsl::Viewpoints} "Viewpoints" "{" (owned_viewpoints+=[vpspec::Viewpoint] (","
		//owned_viewpoints+=[vpspec::Viewpoint])*)? "}"
		public Group getGroup() { return cGroup; }

		//{afdsl::Viewpoints}
		public Action getViewpointsAction_0() { return cViewpointsAction_0; }

		//"Viewpoints"
		public Keyword getViewpointsKeyword_1() { return cViewpointsKeyword_1; }

		//"{"
		public Keyword getLeftCurlyBracketKeyword_2() { return cLeftCurlyBracketKeyword_2; }

		//(owned_viewpoints+=[vpspec::Viewpoint] ("," owned_viewpoints+=[vpspec::Viewpoint])*)?
		public Group getGroup_3() { return cGroup_3; }

		//owned_viewpoints+=[vpspec::Viewpoint]
		public Assignment getOwned_viewpointsAssignment_3_0() { return cOwned_viewpointsAssignment_3_0; }

		//[vpspec::Viewpoint]
		public CrossReference getOwned_viewpointsViewpointCrossReference_3_0_0() { return cOwned_viewpointsViewpointCrossReference_3_0_0; }

		//ID
		public RuleCall getOwned_viewpointsViewpointIDTerminalRuleCall_3_0_0_1() { return cOwned_viewpointsViewpointIDTerminalRuleCall_3_0_0_1; }

		//("," owned_viewpoints+=[vpspec::Viewpoint])*
		public Group getGroup_3_1() { return cGroup_3_1; }

		//","
		public Keyword getCommaKeyword_3_1_0() { return cCommaKeyword_3_1_0; }

		//owned_viewpoints+=[vpspec::Viewpoint]
		public Assignment getOwned_viewpointsAssignment_3_1_1() { return cOwned_viewpointsAssignment_3_1_1; }

		//[vpspec::Viewpoint]
		public CrossReference getOwned_viewpointsViewpointCrossReference_3_1_1_0() { return cOwned_viewpointsViewpointCrossReference_3_1_1_0; }

		//ID
		public RuleCall getOwned_viewpointsViewpointIDTerminalRuleCall_3_1_1_0_1() { return cOwned_viewpointsViewpointIDTerminalRuleCall_3_1_1_0_1; }

		//"}"
		public Keyword getRightCurlyBracketKeyword_4() { return cRightCurlyBracketKeyword_4; }
	}

	public class FQNElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "FQN");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cIDTerminalRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Keyword cFullStopKeyword_1_0 = (Keyword)cGroup_1.eContents().get(0);
		private final RuleCall cIDTerminalRuleCall_1_1 = (RuleCall)cGroup_1.eContents().get(1);
		
		//FQN returns ecore::EString:
		//	ID ("." => ID)*;
		@Override public ParserRule getRule() { return rule; }

		//ID ("." => ID)*
		public Group getGroup() { return cGroup; }

		//ID
		public RuleCall getIDTerminalRuleCall_0() { return cIDTerminalRuleCall_0; }

		//("." => ID)*
		public Group getGroup_1() { return cGroup_1; }

		//"."
		public Keyword getFullStopKeyword_1_0() { return cFullStopKeyword_1_0; }

		//=> ID
		public RuleCall getIDTerminalRuleCall_1_1() { return cIDTerminalRuleCall_1_1; }
	}
	
	
	private final NamedElementElements pNamedElement;
	private final ArchitectureFrameworkElements pArchitectureFramework;
	private final ConfigurationElements pConfiguration;
	private final ConfigurationElementElements pConfigurationElement;
	private final GenerationConfigurationElements pGenerationConfiguration;
	private final ViewpointsElements pViewpoints;
	private final FQNElements pFQN;
	
	private final Grammar grammar;

	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public AfdescGrammarAccess(GrammarProvider grammarProvider,
		TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pNamedElement = new NamedElementElements();
		this.pArchitectureFramework = new ArchitectureFrameworkElements();
		this.pConfiguration = new ConfigurationElements();
		this.pConfigurationElement = new ConfigurationElementElements();
		this.pGenerationConfiguration = new GenerationConfigurationElements();
		this.pViewpoints = new ViewpointsElements();
		this.pFQN = new FQNElements();
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("org.polarsys.kitalpha.ad.af.dsl.cs.text.Afdesc".equals(grammar.getName())) {
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
	

	public TerminalsGrammarAccess getTerminalsGrammarAccess() {
		return gaTerminals;
	}

	
	/// **
	// * 
	// * @author Amine Lajmi
	// *
	// * / NamedElement returns afdsl::NamedElement:
	//	ArchitectureFramework;
	public NamedElementElements getNamedElementAccess() {
		return pNamedElement;
	}
	
	public ParserRule getNamedElementRule() {
		return getNamedElementAccess().getRule();
	}

	//ArchitectureFramework returns afdsl::ArchitectureFramework:
	//	{afdsl::ArchitectureFramework} "ArchitectureFramework" name=ID? "{" ("description:" description=STRING)?
	//	("shortName:" shortName=STRING)? //(af_aspects+=Aspect)*
	//	af_viewpoints=Viewpoints? owned_configuration=Configuration "}";
	public ArchitectureFrameworkElements getArchitectureFrameworkAccess() {
		return pArchitectureFramework;
	}
	
	public ParserRule getArchitectureFrameworkRule() {
		return getArchitectureFrameworkAccess().getRule();
	}

	//Configuration returns afdsl::Configuration:
	//	{afdsl::Configuration} "Configuration" "{" (owned_element+=ConfigurationElement (","
	//	owned_element+=ConfigurationElement)*)? "}";
	public ConfigurationElements getConfigurationAccess() {
		return pConfiguration;
	}
	
	public ParserRule getConfigurationRule() {
		return getConfigurationAccess().getRule();
	}

	//ConfigurationElement returns afdsl::ConfigurationElement:
	//	GenerationConfiguration;
	public ConfigurationElementElements getConfigurationElementAccess() {
		return pConfigurationElement;
	}
	
	public ParserRule getConfigurationElementRule() {
		return getConfigurationElementAccess().getRule();
	}

	//GenerationConfiguration returns afdsl::ConfigurationElement:
	//	{afdsl::GenerationConfiguration} ("rootProjectName:" rootProjectName=FQN);
	public GenerationConfigurationElements getGenerationConfigurationAccess() {
		return pGenerationConfiguration;
	}
	
	public ParserRule getGenerationConfigurationRule() {
		return getGenerationConfigurationAccess().getRule();
	}

	//Viewpoints returns afdsl::Viewpoints:
	//	{afdsl::Viewpoints} "Viewpoints" "{" (owned_viewpoints+=[vpspec::Viewpoint] (","
	//	owned_viewpoints+=[vpspec::Viewpoint])*)? "}";
	public ViewpointsElements getViewpointsAccess() {
		return pViewpoints;
	}
	
	public ParserRule getViewpointsRule() {
		return getViewpointsAccess().getRule();
	}

	//FQN returns ecore::EString:
	//	ID ("." => ID)*;
	public FQNElements getFQNAccess() {
		return pFQN;
	}
	
	public ParserRule getFQNRule() {
		return getFQNAccess().getRule();
	}

	//terminal ID:
	//	"^"? ("a".."z" | "A".."Z" | "_") ("a".."z" | "A".."Z" | "_" | "0".."9")*;
	public TerminalRule getIDRule() {
		return gaTerminals.getIDRule();
	} 

	//terminal INT returns ecore::EInt:
	//	"0".."9"+;
	public TerminalRule getINTRule() {
		return gaTerminals.getINTRule();
	} 

	//terminal STRING:
	//	"\"" ("\\" . / * 'b'|'t'|'n'|'f'|'r'|'u'|'"'|"'"|'\\' * / | !("\\" | "\""))* "\"" | "\'" ("\\" .
	//	/ * 'b'|'t'|'n'|'f'|'r'|'u'|'"'|"'"|'\\' * / | !("\\" | "\'"))* "\'";
	public TerminalRule getSTRINGRule() {
		return gaTerminals.getSTRINGRule();
	} 

	//terminal ML_COMMENT:
	//	"/ *"->"* /";
	public TerminalRule getML_COMMENTRule() {
		return gaTerminals.getML_COMMENTRule();
	} 

	//terminal SL_COMMENT:
	//	"//" !("\n" | "\r")* ("\r"? "\n")?;
	public TerminalRule getSL_COMMENTRule() {
		return gaTerminals.getSL_COMMENTRule();
	} 

	//terminal WS:
	//	(" " | "\t" | "\r" | "\n")+;
	public TerminalRule getWSRule() {
		return gaTerminals.getWSRule();
	} 

	//terminal ANY_OTHER:
	//	.;
	public TerminalRule getANY_OTHERRule() {
		return gaTerminals.getANY_OTHERRule();
	} 
}

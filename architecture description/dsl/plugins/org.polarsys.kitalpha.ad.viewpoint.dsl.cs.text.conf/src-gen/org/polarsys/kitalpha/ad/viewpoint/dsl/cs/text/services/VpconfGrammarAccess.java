/*
* generated by Xtext
*/

package org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services;

import com.google.inject.Singleton;
import com.google.inject.Inject;

import java.util.List;

import org.eclipse.xtext.*;
import org.eclipse.xtext.service.GrammarProvider;
import org.eclipse.xtext.service.AbstractElementFinder.*;

import org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.CommonGrammarAccess;

@Singleton
public class VpconfGrammarAccess extends AbstractGrammarElementFinder {
	
	
	public class ConfigurationElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Configuration");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cConfigurationAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cConfigurationKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cNameAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cNameFQNParserRuleCall_2_0 = (RuleCall)cNameAssignment_2.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cVpConfigurationElementsAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cVpConfigurationElementsConfigurationElementParserRuleCall_4_0 = (RuleCall)cVpConfigurationElementsAssignment_4.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_5 = (Keyword)cGroup.eContents().get(5);
		
		/// ********************************************************************
		//
		// * 							vpconf
		//
		// * 
		//
		// ******************************************************************** / Configuration returns vpdesc::Aspect:
		//
		//	{vpconf::Configuration} "Configuration" name=FQN "{" vpConfigurationElements+=ConfigurationElement* "}";
		public ParserRule getRule() { return rule; }

		//{vpconf::Configuration} "Configuration" name=FQN "{" vpConfigurationElements+=ConfigurationElement* "}"
		public Group getGroup() { return cGroup; }

		//{vpconf::Configuration}
		public Action getConfigurationAction_0() { return cConfigurationAction_0; }

		//"Configuration"
		public Keyword getConfigurationKeyword_1() { return cConfigurationKeyword_1; }

		//name=FQN
		public Assignment getNameAssignment_2() { return cNameAssignment_2; }

		//FQN
		public RuleCall getNameFQNParserRuleCall_2_0() { return cNameFQNParserRuleCall_2_0; }

		//"{"
		public Keyword getLeftCurlyBracketKeyword_3() { return cLeftCurlyBracketKeyword_3; }

		//vpConfigurationElements+=ConfigurationElement*
		public Assignment getVpConfigurationElementsAssignment_4() { return cVpConfigurationElementsAssignment_4; }

		//ConfigurationElement
		public RuleCall getVpConfigurationElementsConfigurationElementParserRuleCall_4_0() { return cVpConfigurationElementsConfigurationElementParserRuleCall_4_0; }

		//"}"
		public Keyword getRightCurlyBracketKeyword_5() { return cRightCurlyBracketKeyword_5; }
	}

	public class ConfigurationElementElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "ConfigurationElement");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cTargetApplicationParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cGenerationConfigurationParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		private final RuleCall cGenerationParserRuleCall_2 = (RuleCall)cAlternatives.eContents().get(2);
		
		//ConfigurationElement returns vpconf::ConfigurationElement:
		//
		//	TargetApplication | GenerationConfiguration | Generation;
		public ParserRule getRule() { return rule; }

		//TargetApplication | GenerationConfiguration | Generation
		public Alternatives getAlternatives() { return cAlternatives; }

		//TargetApplication
		public RuleCall getTargetApplicationParserRuleCall_0() { return cTargetApplicationParserRuleCall_0; }

		//GenerationConfiguration
		public RuleCall getGenerationConfigurationParserRuleCall_1() { return cGenerationConfigurationParserRuleCall_1; }

		//Generation
		public RuleCall getGenerationParserRuleCall_2() { return cGenerationParserRuleCall_2; }
	}

	public class TargetApplicationElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "TargetApplication");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cTargetApplicationAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cTargetKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cTypeAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cTypeTargetApplicationTypeParserRuleCall_2_0 = (RuleCall)cTypeAssignment_2.eContents().get(0);
		
		//TargetApplication returns vpconf::ConfigurationElement:
		//
		//	{vpconf::TargetApplication} //('id' id = EString)?
		//
		//	"target" type=TargetApplicationType;
		public ParserRule getRule() { return rule; }

		//{vpconf::TargetApplication} //('id' id = EString)?
		//
		//"target" type=TargetApplicationType
		public Group getGroup() { return cGroup; }

		//{vpconf::TargetApplication}
		public Action getTargetApplicationAction_0() { return cTargetApplicationAction_0; }

		////('id' id = EString)?
		//
		//"target"
		public Keyword getTargetKeyword_1() { return cTargetKeyword_1; }

		//type=TargetApplicationType
		public Assignment getTypeAssignment_2() { return cTypeAssignment_2; }

		//TargetApplicationType
		public RuleCall getTypeTargetApplicationTypeParserRuleCall_2_0() { return cTypeTargetApplicationTypeParserRuleCall_2_0; }
	}

	public class GenerationConfigurationElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "GenerationConfiguration");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cGenerationConfigurationAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cProjectKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cProjectNameAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cProjectNameFQNParserRuleCall_2_0 = (RuleCall)cProjectNameAssignment_2.eContents().get(0);
		private final Group cGroup_3 = (Group)cGroup.eContents().get(3);
		private final Keyword cNsuriKeyword_3_0 = (Keyword)cGroup_3.eContents().get(0);
		private final Assignment cNsuriAssignment_3_1 = (Assignment)cGroup_3.eContents().get(1);
		private final RuleCall cNsuriSTRINGTerminalRuleCall_3_1_0 = (RuleCall)cNsuriAssignment_3_1.eContents().get(0);
		
		//GenerationConfiguration returns vpconf::ConfigurationElement:
		//
		//	{vpconf::GenerationConfiguration} //('id' id = EString)?
		//
		//	"project" projectName=FQN ("nsuri" nsuri=STRING)?;
		public ParserRule getRule() { return rule; }

		//{vpconf::GenerationConfiguration} //('id' id = EString)?
		//
		//"project" projectName=FQN ("nsuri" nsuri=STRING)?
		public Group getGroup() { return cGroup; }

		//{vpconf::GenerationConfiguration}
		public Action getGenerationConfigurationAction_0() { return cGenerationConfigurationAction_0; }

		////('id' id = EString)?
		//
		//"project"
		public Keyword getProjectKeyword_1() { return cProjectKeyword_1; }

		//projectName=FQN
		public Assignment getProjectNameAssignment_2() { return cProjectNameAssignment_2; }

		//FQN
		public RuleCall getProjectNameFQNParserRuleCall_2_0() { return cProjectNameFQNParserRuleCall_2_0; }

		//("nsuri" nsuri=STRING)?
		public Group getGroup_3() { return cGroup_3; }

		//"nsuri"
		public Keyword getNsuriKeyword_3_0() { return cNsuriKeyword_3_0; }

		//nsuri=STRING
		public Assignment getNsuriAssignment_3_1() { return cNsuriAssignment_3_1; }

		//STRING
		public RuleCall getNsuriSTRINGTerminalRuleCall_3_1_0() { return cNsuriSTRINGTerminalRuleCall_3_1_0; }
	}

	public class GenerationElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Generation");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cGenerationAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cGenerationKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cLeftCurlyBracketKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cOwnedDataGenerationConfAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cOwnedDataGenerationConfGDataParserRuleCall_3_0 = (RuleCall)cOwnedDataGenerationConfAssignment_3.eContents().get(0);
		private final Assignment cOwnedExtensionGenConfAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cOwnedExtensionGenConfExtensionGeneratrionConfigurationParserRuleCall_4_0 = (RuleCall)cOwnedExtensionGenConfAssignment_4.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_5 = (Keyword)cGroup.eContents().get(5);
		
		//Generation returns vpconf::ConfigurationElement:
		//
		//	{vpconf::Generation} "generation" "{" ownedDataGenerationConf=GData?
		//
		//	ownedExtensionGenConf+=ExtensionGeneratrionConfiguration? "}";
		public ParserRule getRule() { return rule; }

		//{vpconf::Generation} "generation" "{" ownedDataGenerationConf=GData?
		//
		//ownedExtensionGenConf+=ExtensionGeneratrionConfiguration? "}"
		public Group getGroup() { return cGroup; }

		//{vpconf::Generation}
		public Action getGenerationAction_0() { return cGenerationAction_0; }

		//"generation"
		public Keyword getGenerationKeyword_1() { return cGenerationKeyword_1; }

		//"{"
		public Keyword getLeftCurlyBracketKeyword_2() { return cLeftCurlyBracketKeyword_2; }

		//ownedDataGenerationConf=GData?
		public Assignment getOwnedDataGenerationConfAssignment_3() { return cOwnedDataGenerationConfAssignment_3; }

		//GData
		public RuleCall getOwnedDataGenerationConfGDataParserRuleCall_3_0() { return cOwnedDataGenerationConfGDataParserRuleCall_3_0; }

		//ownedExtensionGenConf+=ExtensionGeneratrionConfiguration?
		public Assignment getOwnedExtensionGenConfAssignment_4() { return cOwnedExtensionGenConfAssignment_4; }

		//ExtensionGeneratrionConfiguration
		public RuleCall getOwnedExtensionGenConfExtensionGeneratrionConfigurationParserRuleCall_4_0() { return cOwnedExtensionGenConfExtensionGeneratrionConfigurationParserRuleCall_4_0; }

		//"}"
		public Keyword getRightCurlyBracketKeyword_5() { return cRightCurlyBracketKeyword_5; }
	}

	public class GDataElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "GData");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cGDataAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cDataKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cLeftParenthesisKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Group cGroup_3 = (Group)cGroup.eContents().get(3);
		private final Group cGroup_3_0 = (Group)cGroup_3.eContents().get(0);
		private final Keyword cModelKeyword_3_0_0 = (Keyword)cGroup_3_0.eContents().get(0);
		private final Assignment cModelAssignment_3_0_1 = (Assignment)cGroup_3_0.eContents().get(1);
		private final RuleCall cModelEBooleanParserRuleCall_3_0_1_0 = (RuleCall)cModelAssignment_3_0_1.eContents().get(0);
		private final Group cGroup_3_1 = (Group)cGroup_3.eContents().get(1);
		private final Keyword cEditKeyword_3_1_0 = (Keyword)cGroup_3_1.eContents().get(0);
		private final Assignment cEditAssignment_3_1_1 = (Assignment)cGroup_3_1.eContents().get(1);
		private final RuleCall cEditEBooleanParserRuleCall_3_1_1_0 = (RuleCall)cEditAssignment_3_1_1.eContents().get(0);
		private final Group cGroup_3_2 = (Group)cGroup_3.eContents().get(2);
		private final Keyword cEditorKeyword_3_2_0 = (Keyword)cGroup_3_2.eContents().get(0);
		private final Assignment cEditorAssignment_3_2_1 = (Assignment)cGroup_3_2.eContents().get(1);
		private final RuleCall cEditorEBooleanParserRuleCall_3_2_1_0 = (RuleCall)cEditorAssignment_3_2_1.eContents().get(0);
		private final Group cGroup_3_3 = (Group)cGroup_3.eContents().get(3);
		private final Keyword cTestKeyword_3_3_0 = (Keyword)cGroup_3_3.eContents().get(0);
		private final Assignment cTestAssignment_3_3_1 = (Assignment)cGroup_3_3.eContents().get(1);
		private final RuleCall cTestEBooleanParserRuleCall_3_3_1_0 = (RuleCall)cTestAssignment_3_3_1.eContents().get(0);
		private final Group cGroup_3_4 = (Group)cGroup_3.eContents().get(4);
		private final Keyword cJavadocKeyword_3_4_0 = (Keyword)cGroup_3_4.eContents().get(0);
		private final Assignment cJavaDocAssignment_3_4_1 = (Assignment)cGroup_3_4.eContents().get(1);
		private final RuleCall cJavaDocEBooleanParserRuleCall_3_4_1_0 = (RuleCall)cJavaDocAssignment_3_4_1.eContents().get(0);
		private final Group cGroup_3_5 = (Group)cGroup_3.eContents().get(5);
		private final Keyword cOverwriteEcoreKeyword_3_5_0 = (Keyword)cGroup_3_5.eContents().get(0);
		private final Assignment cOverwriteEcoreAssignment_3_5_1 = (Assignment)cGroup_3_5.eContents().get(1);
		private final RuleCall cOverwriteEcoreEBooleanParserRuleCall_3_5_1_0 = (RuleCall)cOverwriteEcoreAssignment_3_5_1.eContents().get(0);
		private final Keyword cRightParenthesisKeyword_4 = (Keyword)cGroup.eContents().get(4);
		
		//GData returns vpconf::GData:
		//
		//	{vpconf::GData} "data" "(" (("Model:" model=EBoolean)? ("Edit:" edit=EBoolean)? ("Editor:" editor=EBoolean)? ("Test:"
		//
		//	test=EBoolean)? ("Javadoc:" javaDoc=EBoolean)? ("OverwriteEcore:" overwriteEcore=EBoolean)?) ")";
		public ParserRule getRule() { return rule; }

		//{vpconf::GData} "data" "(" (("Model:" model=EBoolean)? ("Edit:" edit=EBoolean)? ("Editor:" editor=EBoolean)? ("Test:"
		//
		//test=EBoolean)? ("Javadoc:" javaDoc=EBoolean)? ("OverwriteEcore:" overwriteEcore=EBoolean)?) ")"
		public Group getGroup() { return cGroup; }

		//{vpconf::GData}
		public Action getGDataAction_0() { return cGDataAction_0; }

		//"data"
		public Keyword getDataKeyword_1() { return cDataKeyword_1; }

		//"("
		public Keyword getLeftParenthesisKeyword_2() { return cLeftParenthesisKeyword_2; }

		//("Model:" model=EBoolean)? ("Edit:" edit=EBoolean)? ("Editor:" editor=EBoolean)? ("Test:" test=EBoolean)? ("Javadoc:"
		//
		//javaDoc=EBoolean)? ("OverwriteEcore:" overwriteEcore=EBoolean)?
		public Group getGroup_3() { return cGroup_3; }

		//("Model:" model=EBoolean)?
		public Group getGroup_3_0() { return cGroup_3_0; }

		//"Model:"
		public Keyword getModelKeyword_3_0_0() { return cModelKeyword_3_0_0; }

		//model=EBoolean
		public Assignment getModelAssignment_3_0_1() { return cModelAssignment_3_0_1; }

		//EBoolean
		public RuleCall getModelEBooleanParserRuleCall_3_0_1_0() { return cModelEBooleanParserRuleCall_3_0_1_0; }

		//("Edit:" edit=EBoolean)?
		public Group getGroup_3_1() { return cGroup_3_1; }

		//"Edit:"
		public Keyword getEditKeyword_3_1_0() { return cEditKeyword_3_1_0; }

		//edit=EBoolean
		public Assignment getEditAssignment_3_1_1() { return cEditAssignment_3_1_1; }

		//EBoolean
		public RuleCall getEditEBooleanParserRuleCall_3_1_1_0() { return cEditEBooleanParserRuleCall_3_1_1_0; }

		//("Editor:" editor=EBoolean)?
		public Group getGroup_3_2() { return cGroup_3_2; }

		//"Editor:"
		public Keyword getEditorKeyword_3_2_0() { return cEditorKeyword_3_2_0; }

		//editor=EBoolean
		public Assignment getEditorAssignment_3_2_1() { return cEditorAssignment_3_2_1; }

		//EBoolean
		public RuleCall getEditorEBooleanParserRuleCall_3_2_1_0() { return cEditorEBooleanParserRuleCall_3_2_1_0; }

		//("Test:" test=EBoolean)?
		public Group getGroup_3_3() { return cGroup_3_3; }

		//"Test:"
		public Keyword getTestKeyword_3_3_0() { return cTestKeyword_3_3_0; }

		//test=EBoolean
		public Assignment getTestAssignment_3_3_1() { return cTestAssignment_3_3_1; }

		//EBoolean
		public RuleCall getTestEBooleanParserRuleCall_3_3_1_0() { return cTestEBooleanParserRuleCall_3_3_1_0; }

		//("Javadoc:" javaDoc=EBoolean)?
		public Group getGroup_3_4() { return cGroup_3_4; }

		//"Javadoc:"
		public Keyword getJavadocKeyword_3_4_0() { return cJavadocKeyword_3_4_0; }

		//javaDoc=EBoolean
		public Assignment getJavaDocAssignment_3_4_1() { return cJavaDocAssignment_3_4_1; }

		//EBoolean
		public RuleCall getJavaDocEBooleanParserRuleCall_3_4_1_0() { return cJavaDocEBooleanParserRuleCall_3_4_1_0; }

		//("OverwriteEcore:" overwriteEcore=EBoolean)?
		public Group getGroup_3_5() { return cGroup_3_5; }

		//"OverwriteEcore:"
		public Keyword getOverwriteEcoreKeyword_3_5_0() { return cOverwriteEcoreKeyword_3_5_0; }

		//overwriteEcore=EBoolean
		public Assignment getOverwriteEcoreAssignment_3_5_1() { return cOverwriteEcoreAssignment_3_5_1; }

		//EBoolean
		public RuleCall getOverwriteEcoreEBooleanParserRuleCall_3_5_1_0() { return cOverwriteEcoreEBooleanParserRuleCall_3_5_1_0; }

		//")"
		public Keyword getRightParenthesisKeyword_4() { return cRightParenthesisKeyword_4; }
	}

	public class ExtensionGeneratrionConfigurationElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "ExtensionGeneratrionConfiguration");
		private final RuleCall cDiagramGenerationConfigurationParserRuleCall = (RuleCall)rule.eContents().get(1);
		
		//ExtensionGeneratrionConfiguration returns vpconf::ExtensionGeneratrionConfiguration:
		//
		//	DiagramGenerationConfiguration;
		public ParserRule getRule() { return rule; }

		//DiagramGenerationConfiguration
		public RuleCall getDiagramGenerationConfigurationParserRuleCall() { return cDiagramGenerationConfigurationParserRuleCall; }
	}

	public class DiagramGenerationConfigurationElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "DiagramGenerationConfiguration");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cDiagramGenerationConfigurationAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cDiagramKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cLeftParenthesisKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Group cGroup_3 = (Group)cGroup.eContents().get(3);
		private final Keyword cOverwriteOdesignKeyword_3_0 = (Keyword)cGroup_3.eContents().get(0);
		private final Assignment cOverwriteVSMAssignment_3_1 = (Assignment)cGroup_3.eContents().get(1);
		private final RuleCall cOverwriteVSMEBooleanParserRuleCall_3_1_0 = (RuleCall)cOverwriteVSMAssignment_3_1.eContents().get(0);
		private final Keyword cRightParenthesisKeyword_4 = (Keyword)cGroup.eContents().get(4);
		
		//DiagramGenerationConfiguration returns vpconf::ExtensionGeneratrionConfiguration:
		//
		//	{vpdiagramConfig::DiagramGenerationConfiguration} "diagram" "(" ("overwriteOdesign:" overwriteVSM=EBoolean) ")";
		public ParserRule getRule() { return rule; }

		//{vpdiagramConfig::DiagramGenerationConfiguration} "diagram" "(" ("overwriteOdesign:" overwriteVSM=EBoolean) ")"
		public Group getGroup() { return cGroup; }

		//{vpdiagramConfig::DiagramGenerationConfiguration}
		public Action getDiagramGenerationConfigurationAction_0() { return cDiagramGenerationConfigurationAction_0; }

		//"diagram"
		public Keyword getDiagramKeyword_1() { return cDiagramKeyword_1; }

		//"("
		public Keyword getLeftParenthesisKeyword_2() { return cLeftParenthesisKeyword_2; }

		//"overwriteOdesign:" overwriteVSM=EBoolean
		public Group getGroup_3() { return cGroup_3; }

		//"overwriteOdesign:"
		public Keyword getOverwriteOdesignKeyword_3_0() { return cOverwriteOdesignKeyword_3_0; }

		//overwriteVSM=EBoolean
		public Assignment getOverwriteVSMAssignment_3_1() { return cOverwriteVSMAssignment_3_1; }

		//EBoolean
		public RuleCall getOverwriteVSMEBooleanParserRuleCall_3_1_0() { return cOverwriteVSMEBooleanParserRuleCall_3_1_0; }

		//")"
		public Keyword getRightParenthesisKeyword_4() { return cRightParenthesisKeyword_4; }
	}

	public class TargetApplicationTypeElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "TargetApplicationType");
		private final Keyword cEMFKeyword = (Keyword)rule.eContents().get(1);
		
		////GenerateVPDocumentation returns vpconf::ConfigurationElement:
		//
		////	{vpconf::GenerateVPDocumentation}
		//
		////	//('id' id = EString)?
		//
		////	'documentation'	(value?=EBoolean)
		//
		////	;
		//
		////
		//
		////EmfGeneration returns vpconf::EmfGeneration:
		//
		////	{vpconf::EmfGeneration}
		//
		////	//('id' id = EString)?
		//
		////	'GenerationConfiguration' '{'
		//
		////		'EmfGeneration' 'erasePluginsBeforeGeneration:'	(EraseEmfPluginsBeforeGeneration?=EBoolean)
		//
		////	'}'
		//
		////	;
		//
		//TargetApplicationType:
		//
		//	"EMF";
		public ParserRule getRule() { return rule; }

		//"EMF"
		public Keyword getEMFKeyword() { return cEMFKeyword; }
	}
	
	
	private ConfigurationElements pConfiguration;
	private ConfigurationElementElements pConfigurationElement;
	private TargetApplicationElements pTargetApplication;
	private GenerationConfigurationElements pGenerationConfiguration;
	private GenerationElements pGeneration;
	private GDataElements pGData;
	private ExtensionGeneratrionConfigurationElements pExtensionGeneratrionConfiguration;
	private DiagramGenerationConfigurationElements pDiagramGenerationConfiguration;
	private TargetApplicationTypeElements pTargetApplicationType;
	
	private final Grammar grammar;

	private CommonGrammarAccess gaCommon;

	@Inject
	public VpconfGrammarAccess(GrammarProvider grammarProvider,
		CommonGrammarAccess gaCommon) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaCommon = gaCommon;
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.Vpconf".equals(grammar.getName())) {
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
	
	
	public Grammar getGrammar() {
		return grammar;
	}
	

	public CommonGrammarAccess getCommonGrammarAccess() {
		return gaCommon;
	}

	
	/// ********************************************************************
	//
	// * 							vpconf
	//
	// * 
	//
	// ******************************************************************** / Configuration returns vpdesc::Aspect:
	//
	//	{vpconf::Configuration} "Configuration" name=FQN "{" vpConfigurationElements+=ConfigurationElement* "}";
	public ConfigurationElements getConfigurationAccess() {
		return (pConfiguration != null) ? pConfiguration : (pConfiguration = new ConfigurationElements());
	}
	
	public ParserRule getConfigurationRule() {
		return getConfigurationAccess().getRule();
	}

	//ConfigurationElement returns vpconf::ConfigurationElement:
	//
	//	TargetApplication | GenerationConfiguration | Generation;
	public ConfigurationElementElements getConfigurationElementAccess() {
		return (pConfigurationElement != null) ? pConfigurationElement : (pConfigurationElement = new ConfigurationElementElements());
	}
	
	public ParserRule getConfigurationElementRule() {
		return getConfigurationElementAccess().getRule();
	}

	//TargetApplication returns vpconf::ConfigurationElement:
	//
	//	{vpconf::TargetApplication} //('id' id = EString)?
	//
	//	"target" type=TargetApplicationType;
	public TargetApplicationElements getTargetApplicationAccess() {
		return (pTargetApplication != null) ? pTargetApplication : (pTargetApplication = new TargetApplicationElements());
	}
	
	public ParserRule getTargetApplicationRule() {
		return getTargetApplicationAccess().getRule();
	}

	//GenerationConfiguration returns vpconf::ConfigurationElement:
	//
	//	{vpconf::GenerationConfiguration} //('id' id = EString)?
	//
	//	"project" projectName=FQN ("nsuri" nsuri=STRING)?;
	public GenerationConfigurationElements getGenerationConfigurationAccess() {
		return (pGenerationConfiguration != null) ? pGenerationConfiguration : (pGenerationConfiguration = new GenerationConfigurationElements());
	}
	
	public ParserRule getGenerationConfigurationRule() {
		return getGenerationConfigurationAccess().getRule();
	}

	//Generation returns vpconf::ConfigurationElement:
	//
	//	{vpconf::Generation} "generation" "{" ownedDataGenerationConf=GData?
	//
	//	ownedExtensionGenConf+=ExtensionGeneratrionConfiguration? "}";
	public GenerationElements getGenerationAccess() {
		return (pGeneration != null) ? pGeneration : (pGeneration = new GenerationElements());
	}
	
	public ParserRule getGenerationRule() {
		return getGenerationAccess().getRule();
	}

	//GData returns vpconf::GData:
	//
	//	{vpconf::GData} "data" "(" (("Model:" model=EBoolean)? ("Edit:" edit=EBoolean)? ("Editor:" editor=EBoolean)? ("Test:"
	//
	//	test=EBoolean)? ("Javadoc:" javaDoc=EBoolean)? ("OverwriteEcore:" overwriteEcore=EBoolean)?) ")";
	public GDataElements getGDataAccess() {
		return (pGData != null) ? pGData : (pGData = new GDataElements());
	}
	
	public ParserRule getGDataRule() {
		return getGDataAccess().getRule();
	}

	//ExtensionGeneratrionConfiguration returns vpconf::ExtensionGeneratrionConfiguration:
	//
	//	DiagramGenerationConfiguration;
	public ExtensionGeneratrionConfigurationElements getExtensionGeneratrionConfigurationAccess() {
		return (pExtensionGeneratrionConfiguration != null) ? pExtensionGeneratrionConfiguration : (pExtensionGeneratrionConfiguration = new ExtensionGeneratrionConfigurationElements());
	}
	
	public ParserRule getExtensionGeneratrionConfigurationRule() {
		return getExtensionGeneratrionConfigurationAccess().getRule();
	}

	//DiagramGenerationConfiguration returns vpconf::ExtensionGeneratrionConfiguration:
	//
	//	{vpdiagramConfig::DiagramGenerationConfiguration} "diagram" "(" ("overwriteOdesign:" overwriteVSM=EBoolean) ")";
	public DiagramGenerationConfigurationElements getDiagramGenerationConfigurationAccess() {
		return (pDiagramGenerationConfiguration != null) ? pDiagramGenerationConfiguration : (pDiagramGenerationConfiguration = new DiagramGenerationConfigurationElements());
	}
	
	public ParserRule getDiagramGenerationConfigurationRule() {
		return getDiagramGenerationConfigurationAccess().getRule();
	}

	////GenerateVPDocumentation returns vpconf::ConfigurationElement:
	//
	////	{vpconf::GenerateVPDocumentation}
	//
	////	//('id' id = EString)?
	//
	////	'documentation'	(value?=EBoolean)
	//
	////	;
	//
	////
	//
	////EmfGeneration returns vpconf::EmfGeneration:
	//
	////	{vpconf::EmfGeneration}
	//
	////	//('id' id = EString)?
	//
	////	'GenerationConfiguration' '{'
	//
	////		'EmfGeneration' 'erasePluginsBeforeGeneration:'	(EraseEmfPluginsBeforeGeneration?=EBoolean)
	//
	////	'}'
	//
	////	;
	//
	//TargetApplicationType:
	//
	//	"EMF";
	public TargetApplicationTypeElements getTargetApplicationTypeAccess() {
		return (pTargetApplicationType != null) ? pTargetApplicationType : (pTargetApplicationType = new TargetApplicationTypeElements());
	}
	
	public ParserRule getTargetApplicationTypeRule() {
		return getTargetApplicationTypeAccess().getRule();
	}

	//EString returns ecore::EString:
	//
	//	STRING | ID;
	public CommonGrammarAccess.EStringElements getEStringAccess() {
		return gaCommon.getEStringAccess();
	}
	
	public ParserRule getEStringRule() {
		return getEStringAccess().getRule();
	}

	//FQN returns ecore::EString:
	//
	//	ID ("." => ID)*;
	public CommonGrammarAccess.FQNElements getFQNAccess() {
		return gaCommon.getFQNAccess();
	}
	
	public ParserRule getFQNRule() {
		return getFQNAccess().getRule();
	}

	//EBoolean returns ecore::EBoolean:
	//
	//	"true" | "false";
	public CommonGrammarAccess.EBooleanElements getEBooleanAccess() {
		return gaCommon.getEBooleanAccess();
	}
	
	public ParserRule getEBooleanRule() {
		return getEBooleanAccess().getRule();
	}

	//EInt returns ecore::EInt:
	//
	//	INT;
	public CommonGrammarAccess.EIntElements getEIntAccess() {
		return gaCommon.getEIntAccess();
	}
	
	public ParserRule getEIntRule() {
		return getEIntAccess().getRule();
	}

	//terminal ID:
	//
	//	"^"? ("a".."z" | "A".."Z" | "_") ("a".."z" | "A".."Z" | "_" | "0".."9")*;
	public TerminalRule getIDRule() {
		return gaCommon.getIDRule();
	} 

	//terminal INT returns ecore::EInt:
	//
	//	"0".."9"+;
	public TerminalRule getINTRule() {
		return gaCommon.getINTRule();
	} 

	//terminal STRING:
	//
	//	"\"" ("\\" ("b" | "t" | "n" | "f" | "r" | "u" | "\"" | "\'" | "\\") | !("\\" | "\""))* "\"" | "\'" ("\\" ("b" | "t" |
	//
	//	"n" | "f" | "r" | "u" | "\"" | "\'" | "\\") | !("\\" | "\'"))* "\'";
	public TerminalRule getSTRINGRule() {
		return gaCommon.getSTRINGRule();
	} 

	//terminal ML_COMMENT:
	//
	//	"/ *"->"* /";
	public TerminalRule getML_COMMENTRule() {
		return gaCommon.getML_COMMENTRule();
	} 

	//terminal SL_COMMENT:
	//
	//	"//" !("\n" | "\r")* ("\r"? "\n")?;
	public TerminalRule getSL_COMMENTRule() {
		return gaCommon.getSL_COMMENTRule();
	} 

	//terminal WS:
	//
	//	(" " | "\t" | "\r" | "\n")+;
	public TerminalRule getWSRule() {
		return gaCommon.getWSRule();
	} 

	//terminal ANY_OTHER:
	//
	//	.;
	public TerminalRule getANY_OTHERRule() {
		return gaCommon.getANY_OTHERRule();
	} 
}

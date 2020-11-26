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
public class VpconfGrammarAccess extends AbstractGrammarElementFinder {
	
	
	public class ConfigurationElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.Vpconf.Configuration");
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
		// * 							vpconf
		// * 
		// ******************************************************************** /
		//Configuration vpdesc::Aspect:
		//	{vpconf::Configuration} 'Configuration' name=FQN '{' vpConfigurationElements+=ConfigurationElement* '}'
		@Override public ParserRule getRule() { return rule; }

		//{vpconf::Configuration} 'Configuration' name=FQN '{' vpConfigurationElements+=ConfigurationElement* '}'
		public Group getGroup() { return cGroup; }

		//{vpconf::Configuration}
		public Action getConfigurationAction_0() { return cConfigurationAction_0; }

		//'Configuration'
		public Keyword getConfigurationKeyword_1() { return cConfigurationKeyword_1; }

		//name=FQN
		public Assignment getNameAssignment_2() { return cNameAssignment_2; }

		//FQN
		public RuleCall getNameFQNParserRuleCall_2_0() { return cNameFQNParserRuleCall_2_0; }

		//'{'
		public Keyword getLeftCurlyBracketKeyword_3() { return cLeftCurlyBracketKeyword_3; }

		//vpConfigurationElements+=ConfigurationElement*
		public Assignment getVpConfigurationElementsAssignment_4() { return cVpConfigurationElementsAssignment_4; }

		//ConfigurationElement
		public RuleCall getVpConfigurationElementsConfigurationElementParserRuleCall_4_0() { return cVpConfigurationElementsConfigurationElementParserRuleCall_4_0; }

		//'}'
		public Keyword getRightCurlyBracketKeyword_5() { return cRightCurlyBracketKeyword_5; }
	}

	public class ConfigurationElementElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.Vpconf.ConfigurationElement");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cTargetApplicationParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cGenerationConfigurationParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		private final RuleCall cGenerationParserRuleCall_2 = (RuleCall)cAlternatives.eContents().get(2);
		private final RuleCall cReleaseParserRuleCall_3 = (RuleCall)cAlternatives.eContents().get(3);
		private final RuleCall cViewConfigurationParserRuleCall_4 = (RuleCall)cAlternatives.eContents().get(4);
		
		//ConfigurationElement vpconf::ConfigurationElement:
		//	TargetApplication | GenerationConfiguration | Generation | Release | ViewConfiguration
		@Override public ParserRule getRule() { return rule; }

		//TargetApplication | GenerationConfiguration | Generation | Release | ViewConfiguration
		public Alternatives getAlternatives() { return cAlternatives; }

		//TargetApplication
		public RuleCall getTargetApplicationParserRuleCall_0() { return cTargetApplicationParserRuleCall_0; }

		//GenerationConfiguration
		public RuleCall getGenerationConfigurationParserRuleCall_1() { return cGenerationConfigurationParserRuleCall_1; }

		//Generation
		public RuleCall getGenerationParserRuleCall_2() { return cGenerationParserRuleCall_2; }

		//Release
		public RuleCall getReleaseParserRuleCall_3() { return cReleaseParserRuleCall_3; }

		//ViewConfiguration
		public RuleCall getViewConfigurationParserRuleCall_4() { return cViewConfigurationParserRuleCall_4; }
	}

	public class TargetApplicationElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.Vpconf.TargetApplication");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cTargetApplicationAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cTargetKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cTypeAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cTypeEStringParserRuleCall_2_0 = (RuleCall)cTypeAssignment_2.eContents().get(0);
		
		//TargetApplication vpconf::ConfigurationElement:
		//	{vpconf::TargetApplication} //('id' id = EString)?
		// 'target' type=EString
		@Override public ParserRule getRule() { return rule; }

		//{vpconf::TargetApplication} //('id' id = EString)?
		// 'target' type=EString
		public Group getGroup() { return cGroup; }

		//{vpconf::TargetApplication}
		public Action getTargetApplicationAction_0() { return cTargetApplicationAction_0; }

		////('id' id = EString)?
		// 'target'
		public Keyword getTargetKeyword_1() { return cTargetKeyword_1; }

		//type=EString
		public Assignment getTypeAssignment_2() { return cTypeAssignment_2; }

		//EString
		public RuleCall getTypeEStringParserRuleCall_2_0() { return cTypeEStringParserRuleCall_2_0; }
	}

	public class GenerationConfigurationElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.Vpconf.GenerationConfiguration");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cGenerationConfigurationAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cProjectKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cProjectNameAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cProjectNameFQNParserRuleCall_2_0 = (RuleCall)cProjectNameAssignment_2.eContents().get(0);
		private final Group cGroup_3 = (Group)cGroup.eContents().get(3);
		private final Keyword cNsuriKeyword_3_0 = (Keyword)cGroup_3.eContents().get(0);
		private final Assignment cNsuriAssignment_3_1 = (Assignment)cGroup_3.eContents().get(1);
		private final RuleCall cNsuriSTRINGTerminalRuleCall_3_1_0 = (RuleCall)cNsuriAssignment_3_1.eContents().get(0);
		
		//GenerationConfiguration vpconf::ConfigurationElement:
		//	{vpconf::GenerationConfiguration} //('id' id = EString)?
		// 'project' projectName=FQN ('nsuri' nsuri=STRING)?
		@Override public ParserRule getRule() { return rule; }

		//{vpconf::GenerationConfiguration} //('id' id = EString)?
		// 'project' projectName=FQN ('nsuri' nsuri=STRING)?
		public Group getGroup() { return cGroup; }

		//{vpconf::GenerationConfiguration}
		public Action getGenerationConfigurationAction_0() { return cGenerationConfigurationAction_0; }

		////('id' id = EString)?
		// 'project'
		public Keyword getProjectKeyword_1() { return cProjectKeyword_1; }

		//projectName=FQN
		public Assignment getProjectNameAssignment_2() { return cProjectNameAssignment_2; }

		//FQN
		public RuleCall getProjectNameFQNParserRuleCall_2_0() { return cProjectNameFQNParserRuleCall_2_0; }

		//('nsuri' nsuri=STRING)?
		public Group getGroup_3() { return cGroup_3; }

		//'nsuri'
		public Keyword getNsuriKeyword_3_0() { return cNsuriKeyword_3_0; }

		//nsuri=STRING
		public Assignment getNsuriAssignment_3_1() { return cNsuriAssignment_3_1; }

		//STRING
		public RuleCall getNsuriSTRINGTerminalRuleCall_3_1_0() { return cNsuriSTRINGTerminalRuleCall_3_1_0; }
	}

	public class GenerationElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.Vpconf.Generation");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cGenerationAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cGenerationKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cLeftCurlyBracketKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cOwnedDataGenerationConfAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cOwnedDataGenerationConfGDataParserRuleCall_3_0 = (RuleCall)cOwnedDataGenerationConfAssignment_3.eContents().get(0);
		private final Assignment cOwnedExtensionGenConfAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cOwnedExtensionGenConfExtensionGeneratrionConfigurationParserRuleCall_4_0 = (RuleCall)cOwnedExtensionGenConfAssignment_4.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_5 = (Keyword)cGroup.eContents().get(5);
		
		//Generation vpconf::ConfigurationElement:
		//	{vpconf::Generation} 'generation' '{' ownedDataGenerationConf=GData?
		//	ownedExtensionGenConf+=ExtensionGeneratrionConfiguration* '}'
		@Override public ParserRule getRule() { return rule; }

		//{vpconf::Generation} 'generation' '{' ownedDataGenerationConf=GData?
		//ownedExtensionGenConf+=ExtensionGeneratrionConfiguration* '}'
		public Group getGroup() { return cGroup; }

		//{vpconf::Generation}
		public Action getGenerationAction_0() { return cGenerationAction_0; }

		//'generation'
		public Keyword getGenerationKeyword_1() { return cGenerationKeyword_1; }

		//'{'
		public Keyword getLeftCurlyBracketKeyword_2() { return cLeftCurlyBracketKeyword_2; }

		//ownedDataGenerationConf=GData?
		public Assignment getOwnedDataGenerationConfAssignment_3() { return cOwnedDataGenerationConfAssignment_3; }

		//GData
		public RuleCall getOwnedDataGenerationConfGDataParserRuleCall_3_0() { return cOwnedDataGenerationConfGDataParserRuleCall_3_0; }

		//ownedExtensionGenConf+=ExtensionGeneratrionConfiguration*
		public Assignment getOwnedExtensionGenConfAssignment_4() { return cOwnedExtensionGenConfAssignment_4; }

		//ExtensionGeneratrionConfiguration
		public RuleCall getOwnedExtensionGenConfExtensionGeneratrionConfigurationParserRuleCall_4_0() { return cOwnedExtensionGenConfExtensionGeneratrionConfigurationParserRuleCall_4_0; }

		//'}'
		public Keyword getRightCurlyBracketKeyword_5() { return cRightCurlyBracketKeyword_5; }
	}

	public class GDataElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.Vpconf.GData");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cGDataAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cDataKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cLeftParenthesisKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Group cGroup_3 = (Group)cGroup.eContents().get(3);
		private final Group cGroup_3_0 = (Group)cGroup_3.eContents().get(0);
		private final Keyword cModelKeyword_3_0_0 = (Keyword)cGroup_3_0.eContents().get(0);
		private final Keyword cColonKeyword_3_0_1 = (Keyword)cGroup_3_0.eContents().get(1);
		private final Assignment cModelAssignment_3_0_2 = (Assignment)cGroup_3_0.eContents().get(2);
		private final RuleCall cModelEBooleanParserRuleCall_3_0_2_0 = (RuleCall)cModelAssignment_3_0_2.eContents().get(0);
		private final Group cGroup_3_1 = (Group)cGroup_3.eContents().get(1);
		private final Keyword cEditKeyword_3_1_0 = (Keyword)cGroup_3_1.eContents().get(0);
		private final Keyword cColonKeyword_3_1_1 = (Keyword)cGroup_3_1.eContents().get(1);
		private final Assignment cEditAssignment_3_1_2 = (Assignment)cGroup_3_1.eContents().get(2);
		private final RuleCall cEditEBooleanParserRuleCall_3_1_2_0 = (RuleCall)cEditAssignment_3_1_2.eContents().get(0);
		private final Group cGroup_3_2 = (Group)cGroup_3.eContents().get(2);
		private final Keyword cEditorKeyword_3_2_0 = (Keyword)cGroup_3_2.eContents().get(0);
		private final Keyword cColonKeyword_3_2_1 = (Keyword)cGroup_3_2.eContents().get(1);
		private final Assignment cEditorAssignment_3_2_2 = (Assignment)cGroup_3_2.eContents().get(2);
		private final RuleCall cEditorEBooleanParserRuleCall_3_2_2_0 = (RuleCall)cEditorAssignment_3_2_2.eContents().get(0);
		private final Group cGroup_3_3 = (Group)cGroup_3.eContents().get(3);
		private final Keyword cTestKeyword_3_3_0 = (Keyword)cGroup_3_3.eContents().get(0);
		private final Keyword cColonKeyword_3_3_1 = (Keyword)cGroup_3_3.eContents().get(1);
		private final Assignment cTestAssignment_3_3_2 = (Assignment)cGroup_3_3.eContents().get(2);
		private final RuleCall cTestEBooleanParserRuleCall_3_3_2_0 = (RuleCall)cTestAssignment_3_3_2.eContents().get(0);
		private final Group cGroup_3_4 = (Group)cGroup_3.eContents().get(4);
		private final Keyword cJavadocKeyword_3_4_0 = (Keyword)cGroup_3_4.eContents().get(0);
		private final Keyword cColonKeyword_3_4_1 = (Keyword)cGroup_3_4.eContents().get(1);
		private final Assignment cJavaDocAssignment_3_4_2 = (Assignment)cGroup_3_4.eContents().get(2);
		private final RuleCall cJavaDocEBooleanParserRuleCall_3_4_2_0 = (RuleCall)cJavaDocAssignment_3_4_2.eContents().get(0);
		private final Group cGroup_3_5 = (Group)cGroup_3.eContents().get(5);
		private final Keyword cOverwriteEcoreKeyword_3_5_0 = (Keyword)cGroup_3_5.eContents().get(0);
		private final Keyword cColonKeyword_3_5_1 = (Keyword)cGroup_3_5.eContents().get(1);
		private final Assignment cOverwriteEcoreAssignment_3_5_2 = (Assignment)cGroup_3_5.eContents().get(2);
		private final RuleCall cOverwriteEcoreEBooleanParserRuleCall_3_5_2_0 = (RuleCall)cOverwriteEcoreAssignment_3_5_2.eContents().get(0);
		private final Keyword cRightParenthesisKeyword_4 = (Keyword)cGroup.eContents().get(4);
		
		//GData vpconf::GData:
		//	{vpconf::GData} 'data' '(' (('Model' ':' model=EBoolean)? ('Edit' ':' edit=EBoolean)? ('Editor' ':' editor=EBoolean)?
		//	('Test' ':' test=EBoolean)? ('Javadoc' ':' javaDoc=EBoolean)? ('OverwriteEcore' ':' overwriteEcore=EBoolean)?) ')'
		@Override public ParserRule getRule() { return rule; }

		//{vpconf::GData} 'data' '(' (('Model' ':' model=EBoolean)? ('Edit' ':' edit=EBoolean)? ('Editor' ':' editor=EBoolean)?
		//('Test' ':' test=EBoolean)? ('Javadoc' ':' javaDoc=EBoolean)? ('OverwriteEcore' ':' overwriteEcore=EBoolean)?) ')'
		public Group getGroup() { return cGroup; }

		//{vpconf::GData}
		public Action getGDataAction_0() { return cGDataAction_0; }

		//'data'
		public Keyword getDataKeyword_1() { return cDataKeyword_1; }

		//'('
		public Keyword getLeftParenthesisKeyword_2() { return cLeftParenthesisKeyword_2; }

		//(('Model' ':' model=EBoolean)? ('Edit' ':' edit=EBoolean)? ('Editor' ':' editor=EBoolean)? ('Test' ':' test=EBoolean)?
		//('Javadoc' ':' javaDoc=EBoolean)? ('OverwriteEcore' ':' overwriteEcore=EBoolean)?)
		public Group getGroup_3() { return cGroup_3; }

		//('Model' ':' model=EBoolean)?
		public Group getGroup_3_0() { return cGroup_3_0; }

		//'Model'
		public Keyword getModelKeyword_3_0_0() { return cModelKeyword_3_0_0; }

		//':'
		public Keyword getColonKeyword_3_0_1() { return cColonKeyword_3_0_1; }

		//model=EBoolean
		public Assignment getModelAssignment_3_0_2() { return cModelAssignment_3_0_2; }

		//EBoolean
		public RuleCall getModelEBooleanParserRuleCall_3_0_2_0() { return cModelEBooleanParserRuleCall_3_0_2_0; }

		//('Edit' ':' edit=EBoolean)?
		public Group getGroup_3_1() { return cGroup_3_1; }

		//'Edit'
		public Keyword getEditKeyword_3_1_0() { return cEditKeyword_3_1_0; }

		//':'
		public Keyword getColonKeyword_3_1_1() { return cColonKeyword_3_1_1; }

		//edit=EBoolean
		public Assignment getEditAssignment_3_1_2() { return cEditAssignment_3_1_2; }

		//EBoolean
		public RuleCall getEditEBooleanParserRuleCall_3_1_2_0() { return cEditEBooleanParserRuleCall_3_1_2_0; }

		//('Editor' ':' editor=EBoolean)?
		public Group getGroup_3_2() { return cGroup_3_2; }

		//'Editor'
		public Keyword getEditorKeyword_3_2_0() { return cEditorKeyword_3_2_0; }

		//':'
		public Keyword getColonKeyword_3_2_1() { return cColonKeyword_3_2_1; }

		//editor=EBoolean
		public Assignment getEditorAssignment_3_2_2() { return cEditorAssignment_3_2_2; }

		//EBoolean
		public RuleCall getEditorEBooleanParserRuleCall_3_2_2_0() { return cEditorEBooleanParserRuleCall_3_2_2_0; }

		//('Test' ':' test=EBoolean)?
		public Group getGroup_3_3() { return cGroup_3_3; }

		//'Test'
		public Keyword getTestKeyword_3_3_0() { return cTestKeyword_3_3_0; }

		//':'
		public Keyword getColonKeyword_3_3_1() { return cColonKeyword_3_3_1; }

		//test=EBoolean
		public Assignment getTestAssignment_3_3_2() { return cTestAssignment_3_3_2; }

		//EBoolean
		public RuleCall getTestEBooleanParserRuleCall_3_3_2_0() { return cTestEBooleanParserRuleCall_3_3_2_0; }

		//('Javadoc' ':' javaDoc=EBoolean)?
		public Group getGroup_3_4() { return cGroup_3_4; }

		//'Javadoc'
		public Keyword getJavadocKeyword_3_4_0() { return cJavadocKeyword_3_4_0; }

		//':'
		public Keyword getColonKeyword_3_4_1() { return cColonKeyword_3_4_1; }

		//javaDoc=EBoolean
		public Assignment getJavaDocAssignment_3_4_2() { return cJavaDocAssignment_3_4_2; }

		//EBoolean
		public RuleCall getJavaDocEBooleanParserRuleCall_3_4_2_0() { return cJavaDocEBooleanParserRuleCall_3_4_2_0; }

		//('OverwriteEcore' ':' overwriteEcore=EBoolean)?
		public Group getGroup_3_5() { return cGroup_3_5; }

		//'OverwriteEcore'
		public Keyword getOverwriteEcoreKeyword_3_5_0() { return cOverwriteEcoreKeyword_3_5_0; }

		//':'
		public Keyword getColonKeyword_3_5_1() { return cColonKeyword_3_5_1; }

		//overwriteEcore=EBoolean
		public Assignment getOverwriteEcoreAssignment_3_5_2() { return cOverwriteEcoreAssignment_3_5_2; }

		//EBoolean
		public RuleCall getOverwriteEcoreEBooleanParserRuleCall_3_5_2_0() { return cOverwriteEcoreEBooleanParserRuleCall_3_5_2_0; }

		//')'
		public Keyword getRightParenthesisKeyword_4() { return cRightParenthesisKeyword_4; }
	}

	public class ExtensionGeneratrionConfigurationElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.Vpconf.ExtensionGeneratrionConfiguration");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cDiagramGenerationConfigurationParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cDocumentationGenerationConfigurationParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		private final RuleCall cModelsAirdGenerationConfigurationParserRuleCall_2 = (RuleCall)cAlternatives.eContents().get(2);
		
		//ExtensionGeneratrionConfiguration vpconf::ExtensionGeneratrionConfiguration:
		//	DiagramGenerationConfiguration | DocumentationGenerationConfiguration | ModelsAirdGenerationConfiguration
		@Override public ParserRule getRule() { return rule; }

		//DiagramGenerationConfiguration | DocumentationGenerationConfiguration | ModelsAirdGenerationConfiguration
		public Alternatives getAlternatives() { return cAlternatives; }

		//DiagramGenerationConfiguration
		public RuleCall getDiagramGenerationConfigurationParserRuleCall_0() { return cDiagramGenerationConfigurationParserRuleCall_0; }

		//DocumentationGenerationConfiguration
		public RuleCall getDocumentationGenerationConfigurationParserRuleCall_1() { return cDocumentationGenerationConfigurationParserRuleCall_1; }

		//ModelsAirdGenerationConfiguration
		public RuleCall getModelsAirdGenerationConfigurationParserRuleCall_2() { return cModelsAirdGenerationConfigurationParserRuleCall_2; }
	}

	public class DiagramGenerationConfigurationElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.Vpconf.DiagramGenerationConfiguration");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cDiagramGenerationConfigurationAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cDiagramKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cLeftParenthesisKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Group cGroup_3 = (Group)cGroup.eContents().get(3);
		private final Keyword cOverwriteOdesignKeyword_3_0 = (Keyword)cGroup_3.eContents().get(0);
		private final Keyword cColonKeyword_3_1 = (Keyword)cGroup_3.eContents().get(1);
		private final Assignment cOverwriteVSMAssignment_3_2 = (Assignment)cGroup_3.eContents().get(2);
		private final RuleCall cOverwriteVSMEBooleanParserRuleCall_3_2_0 = (RuleCall)cOverwriteVSMAssignment_3_2.eContents().get(0);
		private final Keyword cRightParenthesisKeyword_4 = (Keyword)cGroup.eContents().get(4);
		
		//DiagramGenerationConfiguration vpconf::ExtensionGeneratrionConfiguration:
		//	{vpdiagramConfig::DiagramGenerationConfiguration} 'diagram' '(' ('OverwriteOdesign' ':' overwriteVSM=EBoolean)? ')'
		@Override public ParserRule getRule() { return rule; }

		//{vpdiagramConfig::DiagramGenerationConfiguration} 'diagram' '(' ('OverwriteOdesign' ':' overwriteVSM=EBoolean)? ')'
		public Group getGroup() { return cGroup; }

		//{vpdiagramConfig::DiagramGenerationConfiguration}
		public Action getDiagramGenerationConfigurationAction_0() { return cDiagramGenerationConfigurationAction_0; }

		//'diagram'
		public Keyword getDiagramKeyword_1() { return cDiagramKeyword_1; }

		//'('
		public Keyword getLeftParenthesisKeyword_2() { return cLeftParenthesisKeyword_2; }

		//('OverwriteOdesign' ':' overwriteVSM=EBoolean)?
		public Group getGroup_3() { return cGroup_3; }

		//'OverwriteOdesign'
		public Keyword getOverwriteOdesignKeyword_3_0() { return cOverwriteOdesignKeyword_3_0; }

		//':'
		public Keyword getColonKeyword_3_1() { return cColonKeyword_3_1; }

		//overwriteVSM=EBoolean
		public Assignment getOverwriteVSMAssignment_3_2() { return cOverwriteVSMAssignment_3_2; }

		//EBoolean
		public RuleCall getOverwriteVSMEBooleanParserRuleCall_3_2_0() { return cOverwriteVSMEBooleanParserRuleCall_3_2_0; }

		//')'
		public Keyword getRightParenthesisKeyword_4() { return cRightParenthesisKeyword_4; }
	}

	public class DocumentationGenerationConfigurationElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.Vpconf.DocumentationGenerationConfiguration");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cDocumentationGenerationConfigurationAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cDocumentationKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cLeftParenthesisKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Group cGroup_3 = (Group)cGroup.eContents().get(3);
		private final Keyword cEcoreToHtmlKeyword_3_0 = (Keyword)cGroup_3.eContents().get(0);
		private final Assignment cEcoreToHtmlAssignment_3_1 = (Assignment)cGroup_3.eContents().get(1);
		private final RuleCall cEcoreToHtmlEBooleanParserRuleCall_3_1_0 = (RuleCall)cEcoreToHtmlAssignment_3_1.eContents().get(0);
		private final Keyword cRightParenthesisKeyword_4 = (Keyword)cGroup.eContents().get(4);
		
		//DocumentationGenerationConfiguration vpconf::ExtensionGeneratrionConfiguration:
		//	{docGenConfig::DocumentationGenerationConfiguration} 'documentation' '(' ('EcoreToHtml:' ecoreToHtml=EBoolean)? ')'
		@Override public ParserRule getRule() { return rule; }

		//{docGenConfig::DocumentationGenerationConfiguration} 'documentation' '(' ('EcoreToHtml:' ecoreToHtml=EBoolean)? ')'
		public Group getGroup() { return cGroup; }

		//{docGenConfig::DocumentationGenerationConfiguration}
		public Action getDocumentationGenerationConfigurationAction_0() { return cDocumentationGenerationConfigurationAction_0; }

		//'documentation'
		public Keyword getDocumentationKeyword_1() { return cDocumentationKeyword_1; }

		//'('
		public Keyword getLeftParenthesisKeyword_2() { return cLeftParenthesisKeyword_2; }

		//('EcoreToHtml:' ecoreToHtml=EBoolean)?
		public Group getGroup_3() { return cGroup_3; }

		//'EcoreToHtml:'
		public Keyword getEcoreToHtmlKeyword_3_0() { return cEcoreToHtmlKeyword_3_0; }

		//ecoreToHtml=EBoolean
		public Assignment getEcoreToHtmlAssignment_3_1() { return cEcoreToHtmlAssignment_3_1; }

		//EBoolean
		public RuleCall getEcoreToHtmlEBooleanParserRuleCall_3_1_0() { return cEcoreToHtmlEBooleanParserRuleCall_3_1_0; }

		//')'
		public Keyword getRightParenthesisKeyword_4() { return cRightParenthesisKeyword_4; }
	}

	public class ModelsAirdGenerationConfigurationElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.Vpconf.ModelsAirdGenerationConfiguration");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cAirdGenerationConfigurationAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cEcoreKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cLeftParenthesisKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Group cGroup_3 = (Group)cGroup.eContents().get(3);
		private final Keyword cAirdKeyword_3_0 = (Keyword)cGroup_3.eContents().get(0);
		private final Keyword cColonKeyword_3_1 = (Keyword)cGroup_3.eContents().get(1);
		private final Assignment cGenRepresentationsAssignment_3_2 = (Assignment)cGroup_3.eContents().get(2);
		private final RuleCall cGenRepresentationsEBooleanParserRuleCall_3_2_0 = (RuleCall)cGenRepresentationsAssignment_3_2.eContents().get(0);
		private final Keyword cRightParenthesisKeyword_4 = (Keyword)cGroup.eContents().get(4);
		
		//ModelsAirdGenerationConfiguration vpconf::ExtensionGeneratrionConfiguration:
		//	{airdGenConfig::AirdGenerationConfiguration} 'ecore' '(' ('aird' ':' genRepresentations=EBoolean)? ')'
		@Override public ParserRule getRule() { return rule; }

		//{airdGenConfig::AirdGenerationConfiguration} 'ecore' '(' ('aird' ':' genRepresentations=EBoolean)? ')'
		public Group getGroup() { return cGroup; }

		//{airdGenConfig::AirdGenerationConfiguration}
		public Action getAirdGenerationConfigurationAction_0() { return cAirdGenerationConfigurationAction_0; }

		//'ecore'
		public Keyword getEcoreKeyword_1() { return cEcoreKeyword_1; }

		//'('
		public Keyword getLeftParenthesisKeyword_2() { return cLeftParenthesisKeyword_2; }

		//('aird' ':' genRepresentations=EBoolean)?
		public Group getGroup_3() { return cGroup_3; }

		//'aird'
		public Keyword getAirdKeyword_3_0() { return cAirdKeyword_3_0; }

		//':'
		public Keyword getColonKeyword_3_1() { return cColonKeyword_3_1; }

		//genRepresentations=EBoolean
		public Assignment getGenRepresentationsAssignment_3_2() { return cGenRepresentationsAssignment_3_2; }

		//EBoolean
		public RuleCall getGenRepresentationsEBooleanParserRuleCall_3_2_0() { return cGenRepresentationsEBooleanParserRuleCall_3_2_0; }

		//')'
		public Keyword getRightParenthesisKeyword_4() { return cRightParenthesisKeyword_4; }
	}

	public class ReleaseElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.Vpconf.Release");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cReleaseAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cReleaseKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cLeftCurlyBracketKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Group cGroup_3 = (Group)cGroup.eContents().get(3);
		private final Keyword cVersionKeyword_3_0 = (Keyword)cGroup_3.eContents().get(0);
		private final Keyword cColonKeyword_3_1 = (Keyword)cGroup_3.eContents().get(1);
		private final Assignment cViewpointVersionAssignment_3_2 = (Assignment)cGroup_3.eContents().get(2);
		private final RuleCall cViewpointVersionVersionParserRuleCall_3_2_0 = (RuleCall)cViewpointVersionAssignment_3_2.eContents().get(0);
		private final Group cGroup_4 = (Group)cGroup.eContents().get(4);
		private final Keyword cDescriptionKeyword_4_0 = (Keyword)cGroup_4.eContents().get(0);
		private final Keyword cColonKeyword_4_1 = (Keyword)cGroup_4.eContents().get(1);
		private final Assignment cViewpointDescriptionAssignment_4_2 = (Assignment)cGroup_4.eContents().get(2);
		private final RuleCall cViewpointDescriptionEStringParserRuleCall_4_2_0 = (RuleCall)cViewpointDescriptionAssignment_4_2.eContents().get(0);
		private final Group cGroup_5 = (Group)cGroup.eContents().get(5);
		private final Keyword cExecutionKeyword_5_0 = (Keyword)cGroup_5.eContents().get(0);
		private final Keyword cEnvironmentsKeyword_5_1 = (Keyword)cGroup_5.eContents().get(1);
		private final Keyword cColonKeyword_5_2 = (Keyword)cGroup_5.eContents().get(2);
		private final Group cGroup_5_3 = (Group)cGroup_5.eContents().get(3);
		private final Assignment cRequiredExecutionEnvironmentAssignment_5_3_0 = (Assignment)cGroup_5_3.eContents().get(0);
		private final RuleCall cRequiredExecutionEnvironmentSTRINGTerminalRuleCall_5_3_0_0 = (RuleCall)cRequiredExecutionEnvironmentAssignment_5_3_0.eContents().get(0);
		private final Group cGroup_5_3_1 = (Group)cGroup_5_3.eContents().get(1);
		private final Keyword cCommaKeyword_5_3_1_0 = (Keyword)cGroup_5_3_1.eContents().get(0);
		private final Assignment cRequiredExecutionEnvironmentAssignment_5_3_1_1 = (Assignment)cGroup_5_3_1.eContents().get(1);
		private final RuleCall cRequiredExecutionEnvironmentSTRINGTerminalRuleCall_5_3_1_1_0 = (RuleCall)cRequiredExecutionEnvironmentAssignment_5_3_1_1.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_6 = (Keyword)cGroup.eContents().get(6);
		
		//Release vpconf::Release:
		//	{vpconf::Release} 'release' '{' ('version' ':' viewpointVersion=Version)? ('description' ':'
		//	viewpointDescription=EString)? ('execution' 'environments' ':' (requiredExecutionEnvironment+=STRING (','
		//	requiredExecutionEnvironment+=STRING)*))? '}'
		@Override public ParserRule getRule() { return rule; }

		//{vpconf::Release} 'release' '{' ('version' ':' viewpointVersion=Version)? ('description' ':'
		//viewpointDescription=EString)? ('execution' 'environments' ':' (requiredExecutionEnvironment+=STRING (','
		//requiredExecutionEnvironment+=STRING)*))? '}'
		public Group getGroup() { return cGroup; }

		//{vpconf::Release}
		public Action getReleaseAction_0() { return cReleaseAction_0; }

		//'release'
		public Keyword getReleaseKeyword_1() { return cReleaseKeyword_1; }

		//'{'
		public Keyword getLeftCurlyBracketKeyword_2() { return cLeftCurlyBracketKeyword_2; }

		//('version' ':' viewpointVersion=Version)?
		public Group getGroup_3() { return cGroup_3; }

		//'version'
		public Keyword getVersionKeyword_3_0() { return cVersionKeyword_3_0; }

		//':'
		public Keyword getColonKeyword_3_1() { return cColonKeyword_3_1; }

		//viewpointVersion=Version
		public Assignment getViewpointVersionAssignment_3_2() { return cViewpointVersionAssignment_3_2; }

		//Version
		public RuleCall getViewpointVersionVersionParserRuleCall_3_2_0() { return cViewpointVersionVersionParserRuleCall_3_2_0; }

		//('description' ':' viewpointDescription=EString)?
		public Group getGroup_4() { return cGroup_4; }

		//'description'
		public Keyword getDescriptionKeyword_4_0() { return cDescriptionKeyword_4_0; }

		//':'
		public Keyword getColonKeyword_4_1() { return cColonKeyword_4_1; }

		//viewpointDescription=EString
		public Assignment getViewpointDescriptionAssignment_4_2() { return cViewpointDescriptionAssignment_4_2; }

		//EString
		public RuleCall getViewpointDescriptionEStringParserRuleCall_4_2_0() { return cViewpointDescriptionEStringParserRuleCall_4_2_0; }

		//('execution' 'environments' ':' (requiredExecutionEnvironment+=STRING (',' requiredExecutionEnvironment+=STRING)*))?
		public Group getGroup_5() { return cGroup_5; }

		//'execution'
		public Keyword getExecutionKeyword_5_0() { return cExecutionKeyword_5_0; }

		//'environments'
		public Keyword getEnvironmentsKeyword_5_1() { return cEnvironmentsKeyword_5_1; }

		//':'
		public Keyword getColonKeyword_5_2() { return cColonKeyword_5_2; }

		//(requiredExecutionEnvironment+=STRING (',' requiredExecutionEnvironment+=STRING)*)
		public Group getGroup_5_3() { return cGroup_5_3; }

		//requiredExecutionEnvironment+=STRING
		public Assignment getRequiredExecutionEnvironmentAssignment_5_3_0() { return cRequiredExecutionEnvironmentAssignment_5_3_0; }

		//STRING
		public RuleCall getRequiredExecutionEnvironmentSTRINGTerminalRuleCall_5_3_0_0() { return cRequiredExecutionEnvironmentSTRINGTerminalRuleCall_5_3_0_0; }

		//(',' requiredExecutionEnvironment+=STRING)*
		public Group getGroup_5_3_1() { return cGroup_5_3_1; }

		//','
		public Keyword getCommaKeyword_5_3_1_0() { return cCommaKeyword_5_3_1_0; }

		//requiredExecutionEnvironment+=STRING
		public Assignment getRequiredExecutionEnvironmentAssignment_5_3_1_1() { return cRequiredExecutionEnvironmentAssignment_5_3_1_1; }

		//STRING
		public RuleCall getRequiredExecutionEnvironmentSTRINGTerminalRuleCall_5_3_1_1_0() { return cRequiredExecutionEnvironmentSTRINGTerminalRuleCall_5_3_1_1_0; }

		//'}'
		public Keyword getRightCurlyBracketKeyword_6() { return cRightCurlyBracketKeyword_6; }
	}

	public class ViewConfigurationElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.Vpconf.ViewConfiguration");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cViewConfigurationAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cViewKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cLeftCurlyBracketKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Group cGroup_3 = (Group)cGroup.eContents().get(3);
		private final Keyword cVisibleKeyword_3_0 = (Keyword)cGroup_3.eContents().get(0);
		private final Keyword cColonKeyword_3_1 = (Keyword)cGroup_3.eContents().get(1);
		private final Assignment cVisibleAssignment_3_2 = (Assignment)cGroup_3.eContents().get(2);
		private final RuleCall cVisibleEBooleanParserRuleCall_3_2_0 = (RuleCall)cVisibleAssignment_3_2.eContents().get(0);
		private final Group cGroup_4 = (Group)cGroup.eContents().get(4);
		private final Keyword cActivableKeyword_4_0 = (Keyword)cGroup_4.eContents().get(0);
		private final Keyword cColonKeyword_4_1 = (Keyword)cGroup_4.eContents().get(1);
		private final Assignment cActivableAssignment_4_2 = (Assignment)cGroup_4.eContents().get(2);
		private final RuleCall cActivableEBooleanParserRuleCall_4_2_0 = (RuleCall)cActivableAssignment_4_2.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_5 = (Keyword)cGroup.eContents().get(5);
		
		//ViewConfiguration vpconf::ViewConfiguration:
		//	{vpconf::ViewConfiguration} 'view' '{' ('visible' ':' visible=EBoolean)? ('activable' ':' activable=EBoolean)? '}'
		@Override public ParserRule getRule() { return rule; }

		//{vpconf::ViewConfiguration} 'view' '{' ('visible' ':' visible=EBoolean)? ('activable' ':' activable=EBoolean)? '}'
		public Group getGroup() { return cGroup; }

		//{vpconf::ViewConfiguration}
		public Action getViewConfigurationAction_0() { return cViewConfigurationAction_0; }

		//'view'
		public Keyword getViewKeyword_1() { return cViewKeyword_1; }

		//'{'
		public Keyword getLeftCurlyBracketKeyword_2() { return cLeftCurlyBracketKeyword_2; }

		//('visible' ':' visible=EBoolean)?
		public Group getGroup_3() { return cGroup_3; }

		//'visible'
		public Keyword getVisibleKeyword_3_0() { return cVisibleKeyword_3_0; }

		//':'
		public Keyword getColonKeyword_3_1() { return cColonKeyword_3_1; }

		//visible=EBoolean
		public Assignment getVisibleAssignment_3_2() { return cVisibleAssignment_3_2; }

		//EBoolean
		public RuleCall getVisibleEBooleanParserRuleCall_3_2_0() { return cVisibleEBooleanParserRuleCall_3_2_0; }

		//('activable' ':' activable=EBoolean)?
		public Group getGroup_4() { return cGroup_4; }

		//'activable'
		public Keyword getActivableKeyword_4_0() { return cActivableKeyword_4_0; }

		//':'
		public Keyword getColonKeyword_4_1() { return cColonKeyword_4_1; }

		//activable=EBoolean
		public Assignment getActivableAssignment_4_2() { return cActivableAssignment_4_2; }

		//EBoolean
		public RuleCall getActivableEBooleanParserRuleCall_4_2_0() { return cActivableEBooleanParserRuleCall_4_2_0; }

		//'}'
		public Keyword getRightCurlyBracketKeyword_5() { return cRightCurlyBracketKeyword_5; }
	}

	public class VersionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.Vpconf.Version");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cINTTerminalRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Keyword cFullStopKeyword_1_0 = (Keyword)cGroup_1.eContents().get(0);
		private final Group cGroup_1_1 = (Group)cGroup_1.eContents().get(1);
		private final RuleCall cINTTerminalRuleCall_1_1_0 = (RuleCall)cGroup_1_1.eContents().get(0);
		private final Group cGroup_1_1_1 = (Group)cGroup_1_1.eContents().get(1);
		private final Keyword cFullStopKeyword_1_1_1_0 = (Keyword)cGroup_1_1_1.eContents().get(0);
		private final RuleCall cINTTerminalRuleCall_1_1_1_1 = (RuleCall)cGroup_1_1_1.eContents().get(1);
		private final Group cGroup_1_1_1_2 = (Group)cGroup_1_1_1.eContents().get(2);
		private final Keyword cFullStopKeyword_1_1_1_2_0 = (Keyword)cGroup_1_1_1_2.eContents().get(0);
		private final RuleCall cQualifierParserRuleCall_1_1_1_2_1 = (RuleCall)cGroup_1_1_1_2.eContents().get(1);
		
		//Version vpconf::Version:
		//	INT ('.' (INT ('.' INT ('.' Qualifier)?)?))?
		@Override public ParserRule getRule() { return rule; }

		//INT ('.' (INT ('.' INT ('.' Qualifier)?)?))?
		public Group getGroup() { return cGroup; }

		//INT
		public RuleCall getINTTerminalRuleCall_0() { return cINTTerminalRuleCall_0; }

		//('.' (INT ('.' INT ('.' Qualifier)?)?))?
		public Group getGroup_1() { return cGroup_1; }

		//'.'
		public Keyword getFullStopKeyword_1_0() { return cFullStopKeyword_1_0; }

		//(INT ('.' INT ('.' Qualifier)?)?)
		public Group getGroup_1_1() { return cGroup_1_1; }

		//INT
		public RuleCall getINTTerminalRuleCall_1_1_0() { return cINTTerminalRuleCall_1_1_0; }

		//('.' INT ('.' Qualifier)?)?
		public Group getGroup_1_1_1() { return cGroup_1_1_1; }

		//'.'
		public Keyword getFullStopKeyword_1_1_1_0() { return cFullStopKeyword_1_1_1_0; }

		//INT
		public RuleCall getINTTerminalRuleCall_1_1_1_1() { return cINTTerminalRuleCall_1_1_1_1; }

		//('.' Qualifier)?
		public Group getGroup_1_1_1_2() { return cGroup_1_1_1_2; }

		//'.'
		public Keyword getFullStopKeyword_1_1_1_2_0() { return cFullStopKeyword_1_1_1_2_0; }

		//Qualifier
		public RuleCall getQualifierParserRuleCall_1_1_1_2_1() { return cQualifierParserRuleCall_1_1_1_2_1; }
	}

	public class QualifierElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.Vpconf.Qualifier");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Alternatives cAlternatives_0 = (Alternatives)cGroup.eContents().get(0);
		private final RuleCall cINTTerminalRuleCall_0_0 = (RuleCall)cAlternatives_0.eContents().get(0);
		private final RuleCall cIDTerminalRuleCall_0_1 = (RuleCall)cAlternatives_0.eContents().get(1);
		private final Keyword c_Keyword_0_2 = (Keyword)cAlternatives_0.eContents().get(2);
		private final Alternatives cAlternatives_1 = (Alternatives)cGroup.eContents().get(1);
		private final RuleCall cINTTerminalRuleCall_1_0 = (RuleCall)cAlternatives_1.eContents().get(0);
		private final RuleCall cIDTerminalRuleCall_1_1 = (RuleCall)cAlternatives_1.eContents().get(1);
		private final Keyword c_Keyword_1_2 = (Keyword)cAlternatives_1.eContents().get(2);
		private final Keyword cHyphenMinusKeyword_1_3 = (Keyword)cAlternatives_1.eContents().get(3);
		
		//Qualifier:
		//	(INT | ID | '_') (INT | ID | '_' | '-')*;
		@Override public ParserRule getRule() { return rule; }

		//(INT | ID | '_') (INT | ID | '_' | '-')*
		public Group getGroup() { return cGroup; }

		//(INT | ID | '_')
		public Alternatives getAlternatives_0() { return cAlternatives_0; }

		//INT
		public RuleCall getINTTerminalRuleCall_0_0() { return cINTTerminalRuleCall_0_0; }

		//ID
		public RuleCall getIDTerminalRuleCall_0_1() { return cIDTerminalRuleCall_0_1; }

		//'_'
		public Keyword get_Keyword_0_2() { return c_Keyword_0_2; }

		//(INT | ID | '_' | '-')*
		public Alternatives getAlternatives_1() { return cAlternatives_1; }

		//INT
		public RuleCall getINTTerminalRuleCall_1_0() { return cINTTerminalRuleCall_1_0; }

		//ID
		public RuleCall getIDTerminalRuleCall_1_1() { return cIDTerminalRuleCall_1_1; }

		//'_'
		public Keyword get_Keyword_1_2() { return c_Keyword_1_2; }

		//'-'
		public Keyword getHyphenMinusKeyword_1_3() { return cHyphenMinusKeyword_1_3; }
	}
	
	
	private final ConfigurationElements pConfiguration;
	private final ConfigurationElementElements pConfigurationElement;
	private final TargetApplicationElements pTargetApplication;
	private final GenerationConfigurationElements pGenerationConfiguration;
	private final GenerationElements pGeneration;
	private final GDataElements pGData;
	private final ExtensionGeneratrionConfigurationElements pExtensionGeneratrionConfiguration;
	private final DiagramGenerationConfigurationElements pDiagramGenerationConfiguration;
	private final DocumentationGenerationConfigurationElements pDocumentationGenerationConfiguration;
	private final ModelsAirdGenerationConfigurationElements pModelsAirdGenerationConfiguration;
	private final ReleaseElements pRelease;
	private final ViewConfigurationElements pViewConfiguration;
	private final VersionElements pVersion;
	private final QualifierElements pQualifier;
	
	private final Grammar grammar;

	private final CommonGrammarAccess gaCommon;

	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public VpconfGrammarAccess(GrammarProvider grammarProvider,
		CommonGrammarAccess gaCommon,
		TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaCommon = gaCommon;
		this.gaTerminals = gaTerminals;
		this.pConfiguration = new ConfigurationElements();
		this.pConfigurationElement = new ConfigurationElementElements();
		this.pTargetApplication = new TargetApplicationElements();
		this.pGenerationConfiguration = new GenerationConfigurationElements();
		this.pGeneration = new GenerationElements();
		this.pGData = new GDataElements();
		this.pExtensionGeneratrionConfiguration = new ExtensionGeneratrionConfigurationElements();
		this.pDiagramGenerationConfiguration = new DiagramGenerationConfigurationElements();
		this.pDocumentationGenerationConfiguration = new DocumentationGenerationConfigurationElements();
		this.pModelsAirdGenerationConfiguration = new ModelsAirdGenerationConfigurationElements();
		this.pRelease = new ReleaseElements();
		this.pViewConfiguration = new ViewConfigurationElements();
		this.pVersion = new VersionElements();
		this.pQualifier = new QualifierElements();
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

	
	/// ********************************************************************
	// * 							vpconf
	// * 
	// ******************************************************************** /
	//Configuration vpdesc::Aspect:
	//	{vpconf::Configuration} 'Configuration' name=FQN '{' vpConfigurationElements+=ConfigurationElement* '}'
	public ConfigurationElements getConfigurationAccess() {
		return pConfiguration;
	}
	
	public ParserRule getConfigurationRule() {
		return getConfigurationAccess().getRule();
	}

	//ConfigurationElement vpconf::ConfigurationElement:
	//	TargetApplication | GenerationConfiguration | Generation | Release | ViewConfiguration
	public ConfigurationElementElements getConfigurationElementAccess() {
		return pConfigurationElement;
	}
	
	public ParserRule getConfigurationElementRule() {
		return getConfigurationElementAccess().getRule();
	}

	//TargetApplication vpconf::ConfigurationElement:
	//	{vpconf::TargetApplication} //('id' id = EString)?
	// 'target' type=EString
	public TargetApplicationElements getTargetApplicationAccess() {
		return pTargetApplication;
	}
	
	public ParserRule getTargetApplicationRule() {
		return getTargetApplicationAccess().getRule();
	}

	//GenerationConfiguration vpconf::ConfigurationElement:
	//	{vpconf::GenerationConfiguration} //('id' id = EString)?
	// 'project' projectName=FQN ('nsuri' nsuri=STRING)?
	public GenerationConfigurationElements getGenerationConfigurationAccess() {
		return pGenerationConfiguration;
	}
	
	public ParserRule getGenerationConfigurationRule() {
		return getGenerationConfigurationAccess().getRule();
	}

	//Generation vpconf::ConfigurationElement:
	//	{vpconf::Generation} 'generation' '{' ownedDataGenerationConf=GData?
	//	ownedExtensionGenConf+=ExtensionGeneratrionConfiguration* '}'
	public GenerationElements getGenerationAccess() {
		return pGeneration;
	}
	
	public ParserRule getGenerationRule() {
		return getGenerationAccess().getRule();
	}

	//GData vpconf::GData:
	//	{vpconf::GData} 'data' '(' (('Model' ':' model=EBoolean)? ('Edit' ':' edit=EBoolean)? ('Editor' ':' editor=EBoolean)?
	//	('Test' ':' test=EBoolean)? ('Javadoc' ':' javaDoc=EBoolean)? ('OverwriteEcore' ':' overwriteEcore=EBoolean)?) ')'
	public GDataElements getGDataAccess() {
		return pGData;
	}
	
	public ParserRule getGDataRule() {
		return getGDataAccess().getRule();
	}

	//ExtensionGeneratrionConfiguration vpconf::ExtensionGeneratrionConfiguration:
	//	DiagramGenerationConfiguration | DocumentationGenerationConfiguration | ModelsAirdGenerationConfiguration
	public ExtensionGeneratrionConfigurationElements getExtensionGeneratrionConfigurationAccess() {
		return pExtensionGeneratrionConfiguration;
	}
	
	public ParserRule getExtensionGeneratrionConfigurationRule() {
		return getExtensionGeneratrionConfigurationAccess().getRule();
	}

	//DiagramGenerationConfiguration vpconf::ExtensionGeneratrionConfiguration:
	//	{vpdiagramConfig::DiagramGenerationConfiguration} 'diagram' '(' ('OverwriteOdesign' ':' overwriteVSM=EBoolean)? ')'
	public DiagramGenerationConfigurationElements getDiagramGenerationConfigurationAccess() {
		return pDiagramGenerationConfiguration;
	}
	
	public ParserRule getDiagramGenerationConfigurationRule() {
		return getDiagramGenerationConfigurationAccess().getRule();
	}

	//DocumentationGenerationConfiguration vpconf::ExtensionGeneratrionConfiguration:
	//	{docGenConfig::DocumentationGenerationConfiguration} 'documentation' '(' ('EcoreToHtml:' ecoreToHtml=EBoolean)? ')'
	public DocumentationGenerationConfigurationElements getDocumentationGenerationConfigurationAccess() {
		return pDocumentationGenerationConfiguration;
	}
	
	public ParserRule getDocumentationGenerationConfigurationRule() {
		return getDocumentationGenerationConfigurationAccess().getRule();
	}

	//ModelsAirdGenerationConfiguration vpconf::ExtensionGeneratrionConfiguration:
	//	{airdGenConfig::AirdGenerationConfiguration} 'ecore' '(' ('aird' ':' genRepresentations=EBoolean)? ')'
	public ModelsAirdGenerationConfigurationElements getModelsAirdGenerationConfigurationAccess() {
		return pModelsAirdGenerationConfiguration;
	}
	
	public ParserRule getModelsAirdGenerationConfigurationRule() {
		return getModelsAirdGenerationConfigurationAccess().getRule();
	}

	//Release vpconf::Release:
	//	{vpconf::Release} 'release' '{' ('version' ':' viewpointVersion=Version)? ('description' ':'
	//	viewpointDescription=EString)? ('execution' 'environments' ':' (requiredExecutionEnvironment+=STRING (','
	//	requiredExecutionEnvironment+=STRING)*))? '}'
	public ReleaseElements getReleaseAccess() {
		return pRelease;
	}
	
	public ParserRule getReleaseRule() {
		return getReleaseAccess().getRule();
	}

	//ViewConfiguration vpconf::ViewConfiguration:
	//	{vpconf::ViewConfiguration} 'view' '{' ('visible' ':' visible=EBoolean)? ('activable' ':' activable=EBoolean)? '}'
	public ViewConfigurationElements getViewConfigurationAccess() {
		return pViewConfiguration;
	}
	
	public ParserRule getViewConfigurationRule() {
		return getViewConfigurationAccess().getRule();
	}

	//Version vpconf::Version:
	//	INT ('.' (INT ('.' INT ('.' Qualifier)?)?))?
	public VersionElements getVersionAccess() {
		return pVersion;
	}
	
	public ParserRule getVersionRule() {
		return getVersionAccess().getRule();
	}

	//Qualifier:
	//	(INT | ID | '_') (INT | ID | '_' | '-')*;
	public QualifierElements getQualifierAccess() {
		return pQualifier;
	}
	
	public ParserRule getQualifierRule() {
		return getQualifierAccess().getRule();
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

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
public class VpdiagramGrammarAccess extends AbstractGrammarElementFinder {
	
	
	public class DiagramsElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.Vpdiagram.Diagrams");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cDiagramsAction_0 = (Action)cGroup.eContents().get(0);
		private final Assignment cImportsAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cImportsAbstractImportParserRuleCall_1_0 = (RuleCall)cImportsAssignment_1.eContents().get(0);
		private final Assignment cDiagramsAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cDiagramsAspectParserRuleCall_2_0 = (RuleCall)cDiagramsAssignment_2.eContents().get(0);
		
		//Diagrams:
		//	{Diagrams} imports+=AbstractImport* diagrams=Aspect;
		@Override public ParserRule getRule() { return rule; }

		//{Diagrams} imports+=AbstractImport* diagrams=Aspect
		public Group getGroup() { return cGroup; }

		//{Diagrams}
		public Action getDiagramsAction_0() { return cDiagramsAction_0; }

		//imports+=AbstractImport*
		public Assignment getImportsAssignment_1() { return cImportsAssignment_1; }

		//AbstractImport
		public RuleCall getImportsAbstractImportParserRuleCall_1_0() { return cImportsAbstractImportParserRuleCall_1_0; }

		//diagrams=Aspect
		public Assignment getDiagramsAssignment_2() { return cDiagramsAssignment_2; }

		//Aspect
		public RuleCall getDiagramsAspectParserRuleCall_2_0() { return cDiagramsAspectParserRuleCall_2_0; }
	}

	public class AbstractImportElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.Vpdiagram.AbstractImport");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cImportNameSpaceParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cImportGroupParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		
		//AbstractImport:
		//	ImportNameSpace | ImportGroup;
		@Override public ParserRule getRule() { return rule; }

		//ImportNameSpace | ImportGroup
		public Alternatives getAlternatives() { return cAlternatives; }

		//ImportNameSpace
		public RuleCall getImportNameSpaceParserRuleCall_0() { return cImportNameSpaceParserRuleCall_0; }

		//ImportGroup
		public RuleCall getImportGroupParserRuleCall_1() { return cImportGroupParserRuleCall_1; }
	}

	public class ImportNameSpaceElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.Vpdiagram.ImportNameSpace");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cImportKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cImportedNamespaceAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cImportedNamespaceFQNParserRuleCall_1_0 = (RuleCall)cImportedNamespaceAssignment_1.eContents().get(0);
		
		//ImportNameSpace:
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

	public class ImportGroupElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.Vpdiagram.ImportGroup");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cImportKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cExternalKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cImportedGroupAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cImportedGroupEStringParserRuleCall_2_0 = (RuleCall)cImportedGroupAssignment_2.eContents().get(0);
		
		//ImportGroup:
		//	'import' 'external' importedGroup=EString;
		@Override public ParserRule getRule() { return rule; }

		//'import' 'external' importedGroup=EString
		public Group getGroup() { return cGroup; }

		//'import'
		public Keyword getImportKeyword_0() { return cImportKeyword_0; }

		//'external'
		public Keyword getExternalKeyword_1() { return cExternalKeyword_1; }

		//importedGroup=EString
		public Assignment getImportedGroupAssignment_2() { return cImportedGroupAssignment_2; }

		//EString
		public RuleCall getImportedGroupEStringParserRuleCall_2_0() { return cImportedGroupEStringParserRuleCall_2_0; }
	}

	public class AspectElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.Vpdiagram.Aspect");
		private final RuleCall cDiagramSetParserRuleCall = (RuleCall)rule.eContents().get(1);
		
		//Aspect vpdesc::Aspect:
		//	DiagramSet
		@Override public ParserRule getRule() { return rule; }

		//DiagramSet
		public RuleCall getDiagramSetParserRuleCall() { return cDiagramSetParserRuleCall; }
	}

	public class DiagramSetElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.Vpdiagram.DiagramSet");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cDiagramSetAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cDiagramsKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cNameAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cNameFQNParserRuleCall_2_0 = (RuleCall)cNameAssignment_2.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cDiagramsAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cDiagramsDiagramRepresentationParserRuleCall_4_0 = (RuleCall)cDiagramsAssignment_4.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_5 = (Keyword)cGroup.eContents().get(5);
		
		/// ********************************************************************
		// * 							vpdiagram
		// * 
		// ******************************************************************** /
		//DiagramSet vpdesc::Aspect:
		//	{vpdiagram::DiagramSet} 'Diagrams' name=FQN '{' diagrams+=DiagramRepresentation* '}'
		@Override public ParserRule getRule() { return rule; }

		//{vpdiagram::DiagramSet} 'Diagrams' name=FQN '{' diagrams+=DiagramRepresentation* '}'
		public Group getGroup() { return cGroup; }

		//{vpdiagram::DiagramSet}
		public Action getDiagramSetAction_0() { return cDiagramSetAction_0; }

		//'Diagrams'
		public Keyword getDiagramsKeyword_1() { return cDiagramsKeyword_1; }

		//name=FQN
		public Assignment getNameAssignment_2() { return cNameAssignment_2; }

		//FQN
		public RuleCall getNameFQNParserRuleCall_2_0() { return cNameFQNParserRuleCall_2_0; }

		//'{'
		public Keyword getLeftCurlyBracketKeyword_3() { return cLeftCurlyBracketKeyword_3; }

		//diagrams+=DiagramRepresentation*
		public Assignment getDiagramsAssignment_4() { return cDiagramsAssignment_4; }

		//DiagramRepresentation
		public RuleCall getDiagramsDiagramRepresentationParserRuleCall_4_0() { return cDiagramsDiagramRepresentationParserRuleCall_4_0; }

		//'}'
		public Keyword getRightCurlyBracketKeyword_5() { return cRightCurlyBracketKeyword_5; }
	}

	public class DiagramRepresentationElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.Vpdiagram.DiagramRepresentation");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cDiagramParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cDiagramExtensionParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		
		//DiagramRepresentation vpdiagram::DiagramRepresentation:
		//	Diagram | DiagramExtension
		@Override public ParserRule getRule() { return rule; }

		//Diagram | DiagramExtension
		public Alternatives getAlternatives() { return cAlternatives; }

		//Diagram
		public RuleCall getDiagramParserRuleCall_0() { return cDiagramParserRuleCall_0; }

		//DiagramExtension
		public RuleCall getDiagramExtensionParserRuleCall_1() { return cDiagramExtensionParserRuleCall_1; }
	}

	public class DiagramElementElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.Vpdiagram.DiagramElement");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cDiagramChildrenParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cBorderedNodeParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		
		//DiagramElement vpdiagram::DiagramElement:
		//	DiagramChildren | BorderedNode
		@Override public ParserRule getRule() { return rule; }

		//DiagramChildren | BorderedNode
		public Alternatives getAlternatives() { return cAlternatives; }

		//DiagramChildren
		public RuleCall getDiagramChildrenParserRuleCall_0() { return cDiagramChildrenParserRuleCall_0; }

		//BorderedNode
		public RuleCall getBorderedNodeParserRuleCall_1() { return cBorderedNodeParserRuleCall_1; }
	}

	public class DiagramChildrenElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.Vpdiagram.DiagramChildren");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cAbstractEdgeParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cContainerParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		private final RuleCall cNodeParserRuleCall_2 = (RuleCall)cAlternatives.eContents().get(2);
		
		//DiagramChildren vpdiagram::DiagramChildren:
		//	AbstractEdge | Container | Node
		@Override public ParserRule getRule() { return rule; }

		//AbstractEdge | Container | Node
		public Alternatives getAlternatives() { return cAlternatives; }

		//AbstractEdge
		public RuleCall getAbstractEdgeParserRuleCall_0() { return cAbstractEdgeParserRuleCall_0; }

		//Container
		public RuleCall getContainerParserRuleCall_1() { return cContainerParserRuleCall_1; }

		//Node
		public RuleCall getNodeParserRuleCall_2() { return cNodeParserRuleCall_2; }
	}

	public class AbstractNodeElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.Vpdiagram.AbstractNode");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cNodeParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cBorderedNodeParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		private final RuleCall cContainerParserRuleCall_2 = (RuleCall)cAlternatives.eContents().get(2);
		
		//AbstractNode vpdiagram::AbstractNode:
		//	Node | BorderedNode | Container
		@Override public ParserRule getRule() { return rule; }

		//Node | BorderedNode | Container
		public Alternatives getAlternatives() { return cAlternatives; }

		//Node
		public RuleCall getNodeParserRuleCall_0() { return cNodeParserRuleCall_0; }

		//BorderedNode
		public RuleCall getBorderedNodeParserRuleCall_1() { return cBorderedNodeParserRuleCall_1; }

		//Container
		public RuleCall getContainerParserRuleCall_2() { return cContainerParserRuleCall_2; }
	}

	public class AbstractEdgeElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.Vpdiagram.AbstractEdge");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cEdgeParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cEdgeImportParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		
		//AbstractEdge vpdiagram::DiagramChildren:
		//	Edge | EdgeImport
		@Override public ParserRule getRule() { return rule; }

		//Edge | EdgeImport
		public Alternatives getAlternatives() { return cAlternatives; }

		//Edge
		public RuleCall getEdgeParserRuleCall_0() { return cEdgeParserRuleCall_0; }

		//EdgeImport
		public RuleCall getEdgeImportParserRuleCall_1() { return cEdgeImportParserRuleCall_1; }
	}

	public class AbstractDescriptionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.Vpdiagram.AbstractDescription");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cContainerDescriptionParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cNodeDescriptionParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		
		//AbstractDescription vpdiagram::AbstractDescription:
		//	ContainerDescription | NodeDescription
		@Override public ParserRule getRule() { return rule; }

		//ContainerDescription | NodeDescription
		public Alternatives getAlternatives() { return cAlternatives; }

		//ContainerDescription
		public RuleCall getContainerDescriptionParserRuleCall_0() { return cContainerDescriptionParserRuleCall_0; }

		//NodeDescription
		public RuleCall getNodeDescriptionParserRuleCall_1() { return cNodeDescriptionParserRuleCall_1; }
	}

	public class AbstractContainerStyleElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.Vpdiagram.AbstractContainerStyle");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cFlatStyleParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cImageStyleParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		
		//AbstractContainerStyle vpdiagram::AbstractContainerStyle:
		//	FlatStyle | ImageStyle
		@Override public ParserRule getRule() { return rule; }

		//FlatStyle | ImageStyle
		public Alternatives getAlternatives() { return cAlternatives; }

		//FlatStyle
		public RuleCall getFlatStyleParserRuleCall_0() { return cFlatStyleParserRuleCall_0; }

		//ImageStyle
		public RuleCall getImageStyleParserRuleCall_1() { return cImageStyleParserRuleCall_1; }
	}

	public class AbstractNodeStyleElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.Vpdiagram.AbstractNodeStyle");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cImageStyleParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cBasicStyleParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		private final RuleCall cHistogramStyleParserRuleCall_2 = (RuleCall)cAlternatives.eContents().get(2);
		
		//AbstractNodeStyle vpdiagram::AbstractNodeStyle:
		//	ImageStyle | BasicStyle | HistogramStyle
		@Override public ParserRule getRule() { return rule; }

		//ImageStyle | BasicStyle | HistogramStyle
		public Alternatives getAlternatives() { return cAlternatives; }

		//ImageStyle
		public RuleCall getImageStyleParserRuleCall_0() { return cImageStyleParserRuleCall_0; }

		//BasicStyle
		public RuleCall getBasicStyleParserRuleCall_1() { return cBasicStyleParserRuleCall_1; }

		//HistogramStyle
		public RuleCall getHistogramStyleParserRuleCall_2() { return cHistogramStyleParserRuleCall_2; }
	}

	public class DiagramElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.Vpdiagram.Diagram");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cDiagramAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cDiagramKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cNameAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cNameSTRINGTerminalRuleCall_2_0 = (RuleCall)cNameAssignment_2.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Group cGroup_4 = (Group)cGroup.eContents().get(4);
		private final Keyword cDescriptionKeyword_4_0 = (Keyword)cGroup_4.eContents().get(0);
		private final Assignment cDescriptionAssignment_4_1 = (Assignment)cGroup_4.eContents().get(1);
		private final RuleCall cDescriptionSTRINGTerminalRuleCall_4_1_0 = (RuleCall)cDescriptionAssignment_4_1.eContents().get(0);
		private final Assignment cThe_domainAssignment_5 = (Assignment)cGroup.eContents().get(5);
		private final RuleCall cThe_domainDomainContainerParserRuleCall_5_0 = (RuleCall)cThe_domainAssignment_5.eContents().get(0);
		private final Assignment cThe_MappingSetAssignment_6 = (Assignment)cGroup.eContents().get(6);
		private final RuleCall cThe_MappingSetMappingSetParserRuleCall_6_0 = (RuleCall)cThe_MappingSetAssignment_6.eContents().get(0);
		private final Assignment cThe_ActionSetAssignment_7 = (Assignment)cGroup.eContents().get(7);
		private final RuleCall cThe_ActionSetActionSetParserRuleCall_7_0 = (RuleCall)cThe_ActionSetAssignment_7.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_8 = (Keyword)cGroup.eContents().get(8);
		
		//Diagram vpdiagram::DiagramRepresentation:
		//	{vpdiagram::Diagram} 'Diagram' name=STRING '{' ('description:' description=STRING)? the_domain=DomainContainer
		//	the_MappingSet=MappingSet? the_ActionSet=ActionSet? '}'
		@Override public ParserRule getRule() { return rule; }

		//{vpdiagram::Diagram} 'Diagram' name=STRING '{' ('description:' description=STRING)? the_domain=DomainContainer
		//the_MappingSet=MappingSet? the_ActionSet=ActionSet? '}'
		public Group getGroup() { return cGroup; }

		//{vpdiagram::Diagram}
		public Action getDiagramAction_0() { return cDiagramAction_0; }

		//'Diagram'
		public Keyword getDiagramKeyword_1() { return cDiagramKeyword_1; }

		//name=STRING
		public Assignment getNameAssignment_2() { return cNameAssignment_2; }

		//STRING
		public RuleCall getNameSTRINGTerminalRuleCall_2_0() { return cNameSTRINGTerminalRuleCall_2_0; }

		//'{'
		public Keyword getLeftCurlyBracketKeyword_3() { return cLeftCurlyBracketKeyword_3; }

		//('description:' description=STRING)?
		public Group getGroup_4() { return cGroup_4; }

		//'description:'
		public Keyword getDescriptionKeyword_4_0() { return cDescriptionKeyword_4_0; }

		//description=STRING
		public Assignment getDescriptionAssignment_4_1() { return cDescriptionAssignment_4_1; }

		//STRING
		public RuleCall getDescriptionSTRINGTerminalRuleCall_4_1_0() { return cDescriptionSTRINGTerminalRuleCall_4_1_0; }

		//the_domain=DomainContainer
		public Assignment getThe_domainAssignment_5() { return cThe_domainAssignment_5; }

		//DomainContainer
		public RuleCall getThe_domainDomainContainerParserRuleCall_5_0() { return cThe_domainDomainContainerParserRuleCall_5_0; }

		//the_MappingSet=MappingSet?
		public Assignment getThe_MappingSetAssignment_6() { return cThe_MappingSetAssignment_6; }

		//MappingSet
		public RuleCall getThe_MappingSetMappingSetParserRuleCall_6_0() { return cThe_MappingSetMappingSetParserRuleCall_6_0; }

		//the_ActionSet=ActionSet?
		public Assignment getThe_ActionSetAssignment_7() { return cThe_ActionSetAssignment_7; }

		//ActionSet
		public RuleCall getThe_ActionSetActionSetParserRuleCall_7_0() { return cThe_ActionSetActionSetParserRuleCall_7_0; }

		//'}'
		public Keyword getRightCurlyBracketKeyword_8() { return cRightCurlyBracketKeyword_8; }
	}

	public class DiagramExtensionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.Vpdiagram.DiagramExtension");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cDiagramExtensionAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cDiagramExtensionKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cNameAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cNameSTRINGTerminalRuleCall_2_0 = (RuleCall)cNameAssignment_2.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Group cGroup_4 = (Group)cGroup.eContents().get(4);
		private final Keyword cExtendedDiagramKeyword_4_0 = (Keyword)cGroup_4.eContents().get(0);
		private final Assignment cExtented_diagramAssignment_4_1 = (Assignment)cGroup_4.eContents().get(1);
		private final CrossReference cExtented_diagramDiagramDescriptionCrossReference_4_1_0 = (CrossReference)cExtented_diagramAssignment_4_1.eContents().get(0);
		private final RuleCall cExtented_diagramDiagramDescriptionFQNParserRuleCall_4_1_0_1 = (RuleCall)cExtented_diagramDiagramDescriptionCrossReference_4_1_0.eContents().get(1);
		private final Assignment cThe_MappingSetAssignment_5 = (Assignment)cGroup.eContents().get(5);
		private final RuleCall cThe_MappingSetMappingSetParserRuleCall_5_0 = (RuleCall)cThe_MappingSetAssignment_5.eContents().get(0);
		private final Assignment cThe_ActionSetAssignment_6 = (Assignment)cGroup.eContents().get(6);
		private final RuleCall cThe_ActionSetActionSetParserRuleCall_6_0 = (RuleCall)cThe_ActionSetAssignment_6.eContents().get(0);
		private final Assignment cOwnedCustomizationsAssignment_7 = (Assignment)cGroup.eContents().get(7);
		private final RuleCall cOwnedCustomizationsCustomizationsParserRuleCall_7_0 = (RuleCall)cOwnedCustomizationsAssignment_7.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_8 = (Keyword)cGroup.eContents().get(8);
		
		//DiagramExtension vpdiagram::DiagramRepresentation:
		//	{vpdiagram::DiagramExtension} 'DiagramExtension' name=STRING '{' ('extended-diagram:'
		//	extented_diagram=[siriusDiagramDescription::DiagramDescription|FQN])? the_MappingSet=MappingSet?
		//	the_ActionSet=ActionSet? ownedCustomizations=Customizations? '}'
		@Override public ParserRule getRule() { return rule; }

		//{vpdiagram::DiagramExtension} 'DiagramExtension' name=STRING '{' ('extended-diagram:'
		//extented_diagram=[siriusDiagramDescription::DiagramDescription|FQN])? the_MappingSet=MappingSet?
		//the_ActionSet=ActionSet? ownedCustomizations=Customizations? '}'
		public Group getGroup() { return cGroup; }

		//{vpdiagram::DiagramExtension}
		public Action getDiagramExtensionAction_0() { return cDiagramExtensionAction_0; }

		//'DiagramExtension'
		public Keyword getDiagramExtensionKeyword_1() { return cDiagramExtensionKeyword_1; }

		//name=STRING
		public Assignment getNameAssignment_2() { return cNameAssignment_2; }

		//STRING
		public RuleCall getNameSTRINGTerminalRuleCall_2_0() { return cNameSTRINGTerminalRuleCall_2_0; }

		//'{'
		public Keyword getLeftCurlyBracketKeyword_3() { return cLeftCurlyBracketKeyword_3; }

		//('extended-diagram:' extented_diagram=[siriusDiagramDescription::DiagramDescription|FQN])?
		public Group getGroup_4() { return cGroup_4; }

		//'extended-diagram:'
		public Keyword getExtendedDiagramKeyword_4_0() { return cExtendedDiagramKeyword_4_0; }

		//extented_diagram=[siriusDiagramDescription::DiagramDescription|FQN]
		public Assignment getExtented_diagramAssignment_4_1() { return cExtented_diagramAssignment_4_1; }

		//[siriusDiagramDescription::DiagramDescription|FQN]
		public CrossReference getExtented_diagramDiagramDescriptionCrossReference_4_1_0() { return cExtented_diagramDiagramDescriptionCrossReference_4_1_0; }

		//FQN
		public RuleCall getExtented_diagramDiagramDescriptionFQNParserRuleCall_4_1_0_1() { return cExtented_diagramDiagramDescriptionFQNParserRuleCall_4_1_0_1; }

		//the_MappingSet=MappingSet?
		public Assignment getThe_MappingSetAssignment_5() { return cThe_MappingSetAssignment_5; }

		//MappingSet
		public RuleCall getThe_MappingSetMappingSetParserRuleCall_5_0() { return cThe_MappingSetMappingSetParserRuleCall_5_0; }

		//the_ActionSet=ActionSet?
		public Assignment getThe_ActionSetAssignment_6() { return cThe_ActionSetAssignment_6; }

		//ActionSet
		public RuleCall getThe_ActionSetActionSetParserRuleCall_6_0() { return cThe_ActionSetActionSetParserRuleCall_6_0; }

		//ownedCustomizations=Customizations?
		public Assignment getOwnedCustomizationsAssignment_7() { return cOwnedCustomizationsAssignment_7; }

		//Customizations
		public RuleCall getOwnedCustomizationsCustomizationsParserRuleCall_7_0() { return cOwnedCustomizationsCustomizationsParserRuleCall_7_0; }

		//'}'
		public Keyword getRightCurlyBracketKeyword_8() { return cRightCurlyBracketKeyword_8; }
	}

	public class MappingSetElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.Vpdiagram.MappingSet");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cMappingSetAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cMappingKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cLeftCurlyBracketKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cDiagram_ElementsAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cDiagram_ElementsDiagramChildrenParserRuleCall_3_0 = (RuleCall)cDiagram_ElementsAssignment_3.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_4 = (Keyword)cGroup.eContents().get(4);
		
		//MappingSet vpdiagram::MappingSet:
		//	{vpdiagram::MappingSet} 'Mapping' '{' diagram_Elements+=DiagramChildren* '}'
		@Override public ParserRule getRule() { return rule; }

		//{vpdiagram::MappingSet} 'Mapping' '{' diagram_Elements+=DiagramChildren* '}'
		public Group getGroup() { return cGroup; }

		//{vpdiagram::MappingSet}
		public Action getMappingSetAction_0() { return cMappingSetAction_0; }

		//'Mapping'
		public Keyword getMappingKeyword_1() { return cMappingKeyword_1; }

		//'{'
		public Keyword getLeftCurlyBracketKeyword_2() { return cLeftCurlyBracketKeyword_2; }

		//diagram_Elements+=DiagramChildren*
		public Assignment getDiagram_ElementsAssignment_3() { return cDiagram_ElementsAssignment_3; }

		//DiagramChildren
		public RuleCall getDiagram_ElementsDiagramChildrenParserRuleCall_3_0() { return cDiagram_ElementsDiagramChildrenParserRuleCall_3_0; }

		//'}'
		public Keyword getRightCurlyBracketKeyword_4() { return cRightCurlyBracketKeyword_4; }
	}

	public class EdgeDescriptionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.Vpdiagram.EdgeDescription");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cEdgeDescriptionAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cRepresentationKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cLeftCurlyBracketKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cConditionAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cConditionConditionParserRuleCall_3_0 = (RuleCall)cConditionAssignment_3.eContents().get(0);
		private final Group cGroup_4 = (Group)cGroup.eContents().get(4);
		private final Keyword cBeginLabelKeyword_4_0 = (Keyword)cGroup_4.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_4_1 = (Keyword)cGroup_4.eContents().get(1);
		private final Assignment cBegin_LabelAssignment_4_2 = (Assignment)cGroup_4.eContents().get(2);
		private final RuleCall cBegin_LabelLabelParserRuleCall_4_2_0 = (RuleCall)cBegin_LabelAssignment_4_2.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_4_3 = (Keyword)cGroup_4.eContents().get(3);
		private final Group cGroup_5 = (Group)cGroup.eContents().get(5);
		private final Keyword cCenterLabelKeyword_5_0 = (Keyword)cGroup_5.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_5_1 = (Keyword)cGroup_5.eContents().get(1);
		private final Assignment cCenter_labelAssignment_5_2 = (Assignment)cGroup_5.eContents().get(2);
		private final RuleCall cCenter_labelLabelParserRuleCall_5_2_0 = (RuleCall)cCenter_labelAssignment_5_2.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_5_3 = (Keyword)cGroup_5.eContents().get(3);
		private final Group cGroup_6 = (Group)cGroup.eContents().get(6);
		private final Keyword cEndLabelKeyword_6_0 = (Keyword)cGroup_6.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_6_1 = (Keyword)cGroup_6.eContents().get(1);
		private final Assignment cEnd_labelAssignment_6_2 = (Assignment)cGroup_6.eContents().get(2);
		private final RuleCall cEnd_labelLabelParserRuleCall_6_2_0 = (RuleCall)cEnd_labelAssignment_6_2.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_6_3 = (Keyword)cGroup_6.eContents().get(3);
		private final Assignment cStyleAssignment_7 = (Assignment)cGroup.eContents().get(7);
		private final RuleCall cStyleEdgeStyleParserRuleCall_7_0 = (RuleCall)cStyleAssignment_7.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_8 = (Keyword)cGroup.eContents().get(8);
		
		//EdgeDescription vpdiagram::EdgeDescription:
		//	{vpdiagram::EdgeDescription} 'Representation' '{' condition=Condition? ('BeginLabel' '{' begin_Label=Label '}')?
		//	('CenterLabel' '{' center_label=Label '}')? ('EndLabel' '{' end_label=Label '}')? style=EdgeStyle? '}'
		@Override public ParserRule getRule() { return rule; }

		//{vpdiagram::EdgeDescription} 'Representation' '{' condition=Condition? ('BeginLabel' '{' begin_Label=Label '}')?
		//('CenterLabel' '{' center_label=Label '}')? ('EndLabel' '{' end_label=Label '}')? style=EdgeStyle? '}'
		public Group getGroup() { return cGroup; }

		//{vpdiagram::EdgeDescription}
		public Action getEdgeDescriptionAction_0() { return cEdgeDescriptionAction_0; }

		//'Representation'
		public Keyword getRepresentationKeyword_1() { return cRepresentationKeyword_1; }

		//'{'
		public Keyword getLeftCurlyBracketKeyword_2() { return cLeftCurlyBracketKeyword_2; }

		//condition=Condition?
		public Assignment getConditionAssignment_3() { return cConditionAssignment_3; }

		//Condition
		public RuleCall getConditionConditionParserRuleCall_3_0() { return cConditionConditionParserRuleCall_3_0; }

		//('BeginLabel' '{' begin_Label=Label '}')?
		public Group getGroup_4() { return cGroup_4; }

		//'BeginLabel'
		public Keyword getBeginLabelKeyword_4_0() { return cBeginLabelKeyword_4_0; }

		//'{'
		public Keyword getLeftCurlyBracketKeyword_4_1() { return cLeftCurlyBracketKeyword_4_1; }

		//begin_Label=Label
		public Assignment getBegin_LabelAssignment_4_2() { return cBegin_LabelAssignment_4_2; }

		//Label
		public RuleCall getBegin_LabelLabelParserRuleCall_4_2_0() { return cBegin_LabelLabelParserRuleCall_4_2_0; }

		//'}'
		public Keyword getRightCurlyBracketKeyword_4_3() { return cRightCurlyBracketKeyword_4_3; }

		//('CenterLabel' '{' center_label=Label '}')?
		public Group getGroup_5() { return cGroup_5; }

		//'CenterLabel'
		public Keyword getCenterLabelKeyword_5_0() { return cCenterLabelKeyword_5_0; }

		//'{'
		public Keyword getLeftCurlyBracketKeyword_5_1() { return cLeftCurlyBracketKeyword_5_1; }

		//center_label=Label
		public Assignment getCenter_labelAssignment_5_2() { return cCenter_labelAssignment_5_2; }

		//Label
		public RuleCall getCenter_labelLabelParserRuleCall_5_2_0() { return cCenter_labelLabelParserRuleCall_5_2_0; }

		//'}'
		public Keyword getRightCurlyBracketKeyword_5_3() { return cRightCurlyBracketKeyword_5_3; }

		//('EndLabel' '{' end_label=Label '}')?
		public Group getGroup_6() { return cGroup_6; }

		//'EndLabel'
		public Keyword getEndLabelKeyword_6_0() { return cEndLabelKeyword_6_0; }

		//'{'
		public Keyword getLeftCurlyBracketKeyword_6_1() { return cLeftCurlyBracketKeyword_6_1; }

		//end_label=Label
		public Assignment getEnd_labelAssignment_6_2() { return cEnd_labelAssignment_6_2; }

		//Label
		public RuleCall getEnd_labelLabelParserRuleCall_6_2_0() { return cEnd_labelLabelParserRuleCall_6_2_0; }

		//'}'
		public Keyword getRightCurlyBracketKeyword_6_3() { return cRightCurlyBracketKeyword_6_3; }

		//style=EdgeStyle?
		public Assignment getStyleAssignment_7() { return cStyleAssignment_7; }

		//EdgeStyle
		public RuleCall getStyleEdgeStyleParserRuleCall_7_0() { return cStyleEdgeStyleParserRuleCall_7_0; }

		//'}'
		public Keyword getRightCurlyBracketKeyword_8() { return cRightCurlyBracketKeyword_8; }
	}

	public class ConditionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.Vpdiagram.Condition");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cConditionAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cConditionKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cExpressionAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cExpressionForeignExpressionElementParserRuleCall_2_0 = (RuleCall)cExpressionAssignment_2.eContents().get(0);
		
		//Condition vpdiagram::Condition:
		//	{vpdiagram::Condition} 'condition:' expression=ForeignExpressionElement
		@Override public ParserRule getRule() { return rule; }

		//{vpdiagram::Condition} 'condition:' expression=ForeignExpressionElement
		public Group getGroup() { return cGroup; }

		//{vpdiagram::Condition}
		public Action getConditionAction_0() { return cConditionAction_0; }

		//'condition:'
		public Keyword getConditionKeyword_1() { return cConditionKeyword_1; }

		//expression=ForeignExpressionElement
		public Assignment getExpressionAssignment_2() { return cExpressionAssignment_2; }

		//ForeignExpressionElement
		public RuleCall getExpressionForeignExpressionElementParserRuleCall_2_0() { return cExpressionForeignExpressionElementParserRuleCall_2_0; }
	}

	public class EdgeStyleElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.Vpdiagram.EdgeStyle");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cEdgeStyleAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cStyleKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cLeftCurlyBracketKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Group cGroup_3 = (Group)cGroup.eContents().get(3);
		private final Keyword cLineStyleKeyword_3_0 = (Keyword)cGroup_3.eContents().get(0);
		private final Assignment cLineStyleAssignment_3_1 = (Assignment)cGroup_3.eContents().get(1);
		private final RuleCall cLineStyleLineStyleEnumRuleCall_3_1_0 = (RuleCall)cLineStyleAssignment_3_1.eContents().get(0);
		private final Group cGroup_4 = (Group)cGroup.eContents().get(4);
		private final Keyword cBeginDecoratorKeyword_4_0 = (Keyword)cGroup_4.eContents().get(0);
		private final Assignment cBeginDecoratorAssignment_4_1 = (Assignment)cGroup_4.eContents().get(1);
		private final RuleCall cBeginDecoratorEdgeArrowsEnumRuleCall_4_1_0 = (RuleCall)cBeginDecoratorAssignment_4_1.eContents().get(0);
		private final Group cGroup_5 = (Group)cGroup.eContents().get(5);
		private final Keyword cEndDecoratorKeyword_5_0 = (Keyword)cGroup_5.eContents().get(0);
		private final Assignment cEndDecoratorAssignment_5_1 = (Assignment)cGroup_5.eContents().get(1);
		private final RuleCall cEndDecoratorEdgeArrowsEnumRuleCall_5_1_0 = (RuleCall)cEndDecoratorAssignment_5_1.eContents().get(0);
		private final Group cGroup_6 = (Group)cGroup.eContents().get(6);
		private final Keyword cColorKeyword_6_0 = (Keyword)cGroup_6.eContents().get(0);
		private final Assignment cColorAssignment_6_1 = (Assignment)cGroup_6.eContents().get(1);
		private final RuleCall cColorSystemColorsEnumRuleCall_6_1_0 = (RuleCall)cColorAssignment_6_1.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_7 = (Keyword)cGroup.eContents().get(7);
		
		//EdgeStyle vpdiagram::EdgeStyle:
		//	{vpdiagram::EdgeStyle} 'Style' '{' ('line-style:' lineStyle=LineStyle)? ('begin-decorator:'
		//	beginDecorator=EdgeArrows)? ('end-decorator:' endDecorator=EdgeArrows)? ('color:' color=SystemColors)? '}'
		@Override public ParserRule getRule() { return rule; }

		//{vpdiagram::EdgeStyle} 'Style' '{' ('line-style:' lineStyle=LineStyle)? ('begin-decorator:' beginDecorator=EdgeArrows)?
		//('end-decorator:' endDecorator=EdgeArrows)? ('color:' color=SystemColors)? '}'
		public Group getGroup() { return cGroup; }

		//{vpdiagram::EdgeStyle}
		public Action getEdgeStyleAction_0() { return cEdgeStyleAction_0; }

		//'Style'
		public Keyword getStyleKeyword_1() { return cStyleKeyword_1; }

		//'{'
		public Keyword getLeftCurlyBracketKeyword_2() { return cLeftCurlyBracketKeyword_2; }

		//('line-style:' lineStyle=LineStyle)?
		public Group getGroup_3() { return cGroup_3; }

		//'line-style:'
		public Keyword getLineStyleKeyword_3_0() { return cLineStyleKeyword_3_0; }

		//lineStyle=LineStyle
		public Assignment getLineStyleAssignment_3_1() { return cLineStyleAssignment_3_1; }

		//LineStyle
		public RuleCall getLineStyleLineStyleEnumRuleCall_3_1_0() { return cLineStyleLineStyleEnumRuleCall_3_1_0; }

		//('begin-decorator:' beginDecorator=EdgeArrows)?
		public Group getGroup_4() { return cGroup_4; }

		//'begin-decorator:'
		public Keyword getBeginDecoratorKeyword_4_0() { return cBeginDecoratorKeyword_4_0; }

		//beginDecorator=EdgeArrows
		public Assignment getBeginDecoratorAssignment_4_1() { return cBeginDecoratorAssignment_4_1; }

		//EdgeArrows
		public RuleCall getBeginDecoratorEdgeArrowsEnumRuleCall_4_1_0() { return cBeginDecoratorEdgeArrowsEnumRuleCall_4_1_0; }

		//('end-decorator:' endDecorator=EdgeArrows)?
		public Group getGroup_5() { return cGroup_5; }

		//'end-decorator:'
		public Keyword getEndDecoratorKeyword_5_0() { return cEndDecoratorKeyword_5_0; }

		//endDecorator=EdgeArrows
		public Assignment getEndDecoratorAssignment_5_1() { return cEndDecoratorAssignment_5_1; }

		//EdgeArrows
		public RuleCall getEndDecoratorEdgeArrowsEnumRuleCall_5_1_0() { return cEndDecoratorEdgeArrowsEnumRuleCall_5_1_0; }

		//('color:' color=SystemColors)?
		public Group getGroup_6() { return cGroup_6; }

		//'color:'
		public Keyword getColorKeyword_6_0() { return cColorKeyword_6_0; }

		//color=SystemColors
		public Assignment getColorAssignment_6_1() { return cColorAssignment_6_1; }

		//SystemColors
		public RuleCall getColorSystemColorsEnumRuleCall_6_1_0() { return cColorSystemColorsEnumRuleCall_6_1_0; }

		//'}'
		public Keyword getRightCurlyBracketKeyword_7() { return cRightCurlyBracketKeyword_7; }
	}

	public class ContainerElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.Vpdiagram.Container");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cContainerAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cContainerKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cNameAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cNameEStringParserRuleCall_2_0 = (RuleCall)cNameAssignment_2.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Group cGroup_4 = (Group)cGroup.eContents().get(4);
		private final Keyword cImportKeyword_4_0 = (Keyword)cGroup_4.eContents().get(0);
		private final Assignment cImportsAssignment_4_1 = (Assignment)cGroup_4.eContents().get(1);
		private final CrossReference cImportsContainerMappingCrossReference_4_1_0 = (CrossReference)cImportsAssignment_4_1.eContents().get(0);
		private final RuleCall cImportsContainerMappingFQNParserRuleCall_4_1_0_1 = (RuleCall)cImportsContainerMappingCrossReference_4_1_0.eContents().get(1);
		private final Group cGroup_5 = (Group)cGroup.eContents().get(5);
		private final Keyword cDomainContextKeyword_5_0 = (Keyword)cGroup_5.eContents().get(0);
		private final Assignment cThe_domainAssignment_5_1 = (Assignment)cGroup_5.eContents().get(1);
		private final RuleCall cThe_domainNodeDomainElementParserRuleCall_5_1_0 = (RuleCall)cThe_domainAssignment_5_1.eContents().get(0);
		private final Group cGroup_6 = (Group)cGroup.eContents().get(6);
		private final Keyword cContentLayoutKeyword_6_0 = (Keyword)cGroup_6.eContents().get(0);
		private final Assignment cContentLayoutAssignment_6_1 = (Assignment)cGroup_6.eContents().get(1);
		private final RuleCall cContentLayoutContainerLayoutEnumRuleCall_6_1_0 = (RuleCall)cContentLayoutAssignment_6_1.eContents().get(0);
		private final Assignment cSynchronizationModeAssignment_7 = (Assignment)cGroup.eContents().get(7);
		private final RuleCall cSynchronizationModeSynchronizationModeEnumRuleCall_7_0 = (RuleCall)cSynchronizationModeAssignment_7.eContents().get(0);
		private final Assignment cStyleAssignment_8 = (Assignment)cGroup.eContents().get(8);
		private final RuleCall cStyleContainerDescriptionParserRuleCall_8_0 = (RuleCall)cStyleAssignment_8.eContents().get(0);
		private final Assignment cChildrenAssignment_9 = (Assignment)cGroup.eContents().get(9);
		private final RuleCall cChildrenContainerChildrenParserRuleCall_9_0 = (RuleCall)cChildrenAssignment_9.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_10 = (Keyword)cGroup.eContents().get(10);
		
		//Container vpdiagram::Container:
		//	{vpdiagram::Container} 'Container' name=EString '{' ('import:'
		//	imports=[siriusDiagramDescription::ContainerMapping|FQN])? ('domain-context:' the_domain=NodeDomainElement)?
		//	('content-layout:' contentLayout=ContainerLayout)? synchronizationMode=SynchronizationMode?
		//	style+=ContainerDescription* children=ContainerChildren? '}'
		@Override public ParserRule getRule() { return rule; }

		//{vpdiagram::Container} 'Container' name=EString '{' ('import:'
		//imports=[siriusDiagramDescription::ContainerMapping|FQN])? ('domain-context:' the_domain=NodeDomainElement)?
		//('content-layout:' contentLayout=ContainerLayout)? synchronizationMode=SynchronizationMode?
		//style+=ContainerDescription* children=ContainerChildren? '}'
		public Group getGroup() { return cGroup; }

		//{vpdiagram::Container}
		public Action getContainerAction_0() { return cContainerAction_0; }

		//'Container'
		public Keyword getContainerKeyword_1() { return cContainerKeyword_1; }

		//name=EString
		public Assignment getNameAssignment_2() { return cNameAssignment_2; }

		//EString
		public RuleCall getNameEStringParserRuleCall_2_0() { return cNameEStringParserRuleCall_2_0; }

		//'{'
		public Keyword getLeftCurlyBracketKeyword_3() { return cLeftCurlyBracketKeyword_3; }

		//('import:' imports=[siriusDiagramDescription::ContainerMapping|FQN])?
		public Group getGroup_4() { return cGroup_4; }

		//'import:'
		public Keyword getImportKeyword_4_0() { return cImportKeyword_4_0; }

		//imports=[siriusDiagramDescription::ContainerMapping|FQN]
		public Assignment getImportsAssignment_4_1() { return cImportsAssignment_4_1; }

		//[siriusDiagramDescription::ContainerMapping|FQN]
		public CrossReference getImportsContainerMappingCrossReference_4_1_0() { return cImportsContainerMappingCrossReference_4_1_0; }

		//FQN
		public RuleCall getImportsContainerMappingFQNParserRuleCall_4_1_0_1() { return cImportsContainerMappingFQNParserRuleCall_4_1_0_1; }

		//('domain-context:' the_domain=NodeDomainElement)?
		public Group getGroup_5() { return cGroup_5; }

		//'domain-context:'
		public Keyword getDomainContextKeyword_5_0() { return cDomainContextKeyword_5_0; }

		//the_domain=NodeDomainElement
		public Assignment getThe_domainAssignment_5_1() { return cThe_domainAssignment_5_1; }

		//NodeDomainElement
		public RuleCall getThe_domainNodeDomainElementParserRuleCall_5_1_0() { return cThe_domainNodeDomainElementParserRuleCall_5_1_0; }

		//('content-layout:' contentLayout=ContainerLayout)?
		public Group getGroup_6() { return cGroup_6; }

		//'content-layout:'
		public Keyword getContentLayoutKeyword_6_0() { return cContentLayoutKeyword_6_0; }

		//contentLayout=ContainerLayout
		public Assignment getContentLayoutAssignment_6_1() { return cContentLayoutAssignment_6_1; }

		//ContainerLayout
		public RuleCall getContentLayoutContainerLayoutEnumRuleCall_6_1_0() { return cContentLayoutContainerLayoutEnumRuleCall_6_1_0; }

		//synchronizationMode=SynchronizationMode?
		public Assignment getSynchronizationModeAssignment_7() { return cSynchronizationModeAssignment_7; }

		//SynchronizationMode
		public RuleCall getSynchronizationModeSynchronizationModeEnumRuleCall_7_0() { return cSynchronizationModeSynchronizationModeEnumRuleCall_7_0; }

		//style+=ContainerDescription*
		public Assignment getStyleAssignment_8() { return cStyleAssignment_8; }

		//ContainerDescription
		public RuleCall getStyleContainerDescriptionParserRuleCall_8_0() { return cStyleContainerDescriptionParserRuleCall_8_0; }

		//children=ContainerChildren?
		public Assignment getChildrenAssignment_9() { return cChildrenAssignment_9; }

		//ContainerChildren
		public RuleCall getChildrenContainerChildrenParserRuleCall_9_0() { return cChildrenContainerChildrenParserRuleCall_9_0; }

		//'}'
		public Keyword getRightCurlyBracketKeyword_10() { return cRightCurlyBracketKeyword_10; }
	}

	public class ContainerChildrenElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.Vpdiagram.ContainerChildren");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cContainerChildrenAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cContainsKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cLeftCurlyBracketKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Group cGroup_3 = (Group)cGroup.eContents().get(3);
		private final Keyword cReuseKeyword_3_0 = (Keyword)cGroup_3.eContents().get(0);
		private final Assignment cReused_nodesAssignment_3_1 = (Assignment)cGroup_3.eContents().get(1);
		private final CrossReference cReused_nodesAbstractNodeCrossReference_3_1_0 = (CrossReference)cReused_nodesAssignment_3_1.eContents().get(0);
		private final RuleCall cReused_nodesAbstractNodeFQNParserRuleCall_3_1_0_1 = (RuleCall)cReused_nodesAbstractNodeCrossReference_3_1_0.eContents().get(1);
		private final Group cGroup_3_2 = (Group)cGroup_3.eContents().get(2);
		private final Keyword cCommaKeyword_3_2_0 = (Keyword)cGroup_3_2.eContents().get(0);
		private final Assignment cReused_nodesAssignment_3_2_1 = (Assignment)cGroup_3_2.eContents().get(1);
		private final CrossReference cReused_nodesAbstractNodeCrossReference_3_2_1_0 = (CrossReference)cReused_nodesAssignment_3_2_1.eContents().get(0);
		private final RuleCall cReused_nodesAbstractNodeFQNParserRuleCall_3_2_1_0_1 = (RuleCall)cReused_nodesAbstractNodeCrossReference_3_2_1_0.eContents().get(1);
		private final Assignment cOwned_nodesAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cOwned_nodesAbstractNodeParserRuleCall_4_0 = (RuleCall)cOwned_nodesAssignment_4.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_5 = (Keyword)cGroup.eContents().get(5);
		
		//ContainerChildren vpdiagram::ContainerChildren:
		//	{vpdiagram::ContainerChildren} 'Contains' '{' ('reuse' reused_nodes+=[vpdiagram::AbstractNode|FQN] (','
		//	reused_nodes+=[vpdiagram::AbstractNode|FQN])*)? owned_nodes+=AbstractNode* '}'
		@Override public ParserRule getRule() { return rule; }

		//{vpdiagram::ContainerChildren} 'Contains' '{' ('reuse' reused_nodes+=[vpdiagram::AbstractNode|FQN] (','
		//reused_nodes+=[vpdiagram::AbstractNode|FQN])*)? owned_nodes+=AbstractNode* '}'
		public Group getGroup() { return cGroup; }

		//{vpdiagram::ContainerChildren}
		public Action getContainerChildrenAction_0() { return cContainerChildrenAction_0; }

		//'Contains'
		public Keyword getContainsKeyword_1() { return cContainsKeyword_1; }

		//'{'
		public Keyword getLeftCurlyBracketKeyword_2() { return cLeftCurlyBracketKeyword_2; }

		//('reuse' reused_nodes+=[vpdiagram::AbstractNode|FQN] (',' reused_nodes+=[vpdiagram::AbstractNode|FQN])*)?
		public Group getGroup_3() { return cGroup_3; }

		//'reuse'
		public Keyword getReuseKeyword_3_0() { return cReuseKeyword_3_0; }

		//reused_nodes+=[vpdiagram::AbstractNode|FQN]
		public Assignment getReused_nodesAssignment_3_1() { return cReused_nodesAssignment_3_1; }

		//[vpdiagram::AbstractNode|FQN]
		public CrossReference getReused_nodesAbstractNodeCrossReference_3_1_0() { return cReused_nodesAbstractNodeCrossReference_3_1_0; }

		//FQN
		public RuleCall getReused_nodesAbstractNodeFQNParserRuleCall_3_1_0_1() { return cReused_nodesAbstractNodeFQNParserRuleCall_3_1_0_1; }

		//(',' reused_nodes+=[vpdiagram::AbstractNode|FQN])*
		public Group getGroup_3_2() { return cGroup_3_2; }

		//','
		public Keyword getCommaKeyword_3_2_0() { return cCommaKeyword_3_2_0; }

		//reused_nodes+=[vpdiagram::AbstractNode|FQN]
		public Assignment getReused_nodesAssignment_3_2_1() { return cReused_nodesAssignment_3_2_1; }

		//[vpdiagram::AbstractNode|FQN]
		public CrossReference getReused_nodesAbstractNodeCrossReference_3_2_1_0() { return cReused_nodesAbstractNodeCrossReference_3_2_1_0; }

		//FQN
		public RuleCall getReused_nodesAbstractNodeFQNParserRuleCall_3_2_1_0_1() { return cReused_nodesAbstractNodeFQNParserRuleCall_3_2_1_0_1; }

		//owned_nodes+=AbstractNode*
		public Assignment getOwned_nodesAssignment_4() { return cOwned_nodesAssignment_4; }

		//AbstractNode
		public RuleCall getOwned_nodesAbstractNodeParserRuleCall_4_0() { return cOwned_nodesAbstractNodeParserRuleCall_4_0; }

		//'}'
		public Keyword getRightCurlyBracketKeyword_5() { return cRightCurlyBracketKeyword_5; }
	}

	public class NodeDomainElementElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.Vpdiagram.NodeDomainElement");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cNodeDomainElementAction_0 = (Action)cGroup.eContents().get(0);
		private final Assignment cDomain_ClassAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cDomain_ClassAbstractClassParserRuleCall_1_0 = (RuleCall)cDomain_ClassAssignment_1.eContents().get(0);
		private final Group cGroup_2 = (Group)cGroup.eContents().get(2);
		private final Keyword cProvidedByKeyword_2_0 = (Keyword)cGroup_2.eContents().get(0);
		private final Alternatives cAlternatives_2_1 = (Alternatives)cGroup_2.eContents().get(1);
		private final Group cGroup_2_1_0 = (Group)cAlternatives_2_1.eContents().get(0);
		private final Keyword cQueryKeyword_2_1_0_0 = (Keyword)cGroup_2_1_0.eContents().get(0);
		private final Assignment cQueryAssignment_2_1_0_1 = (Assignment)cGroup_2_1_0.eContents().get(1);
		private final RuleCall cQuerySTRINGTerminalRuleCall_2_1_0_1_0 = (RuleCall)cQueryAssignment_2_1_0_1.eContents().get(0);
		private final Group cGroup_2_1_1 = (Group)cAlternatives_2_1.eContents().get(1);
		private final Keyword cAssociationKeyword_2_1_1_0 = (Keyword)cGroup_2_1_1.eContents().get(0);
		private final Assignment cChlidren_listAssignment_2_1_1_1 = (Assignment)cGroup_2_1_1.eContents().get(1);
		private final RuleCall cChlidren_listAbstractAssociation2ParserRuleCall_2_1_1_1_0 = (RuleCall)cChlidren_listAssignment_2_1_1_1.eContents().get(0);
		
		//NodeDomainElement vpdiagram::NodeDomainElement:
		//	{vpdiagram::NodeDomainElement} domain_Class=AbstractClass ('provided-by' ('query' query=STRING | 'association'
		//	chlidren_list=AbstractAssociation2))?
		@Override public ParserRule getRule() { return rule; }

		//{vpdiagram::NodeDomainElement} domain_Class=AbstractClass ('provided-by' ('query' query=STRING | 'association'
		//chlidren_list=AbstractAssociation2))?
		public Group getGroup() { return cGroup; }

		//{vpdiagram::NodeDomainElement}
		public Action getNodeDomainElementAction_0() { return cNodeDomainElementAction_0; }

		//domain_Class=AbstractClass
		public Assignment getDomain_ClassAssignment_1() { return cDomain_ClassAssignment_1; }

		//AbstractClass
		public RuleCall getDomain_ClassAbstractClassParserRuleCall_1_0() { return cDomain_ClassAbstractClassParserRuleCall_1_0; }

		//('provided-by' ('query' query=STRING | 'association' chlidren_list=AbstractAssociation2))?
		public Group getGroup_2() { return cGroup_2; }

		//'provided-by'
		public Keyword getProvidedByKeyword_2_0() { return cProvidedByKeyword_2_0; }

		//('query' query=STRING | 'association' chlidren_list=AbstractAssociation2)
		public Alternatives getAlternatives_2_1() { return cAlternatives_2_1; }

		//'query' query=STRING
		public Group getGroup_2_1_0() { return cGroup_2_1_0; }

		//'query'
		public Keyword getQueryKeyword_2_1_0_0() { return cQueryKeyword_2_1_0_0; }

		//query=STRING
		public Assignment getQueryAssignment_2_1_0_1() { return cQueryAssignment_2_1_0_1; }

		//STRING
		public RuleCall getQuerySTRINGTerminalRuleCall_2_1_0_1_0() { return cQuerySTRINGTerminalRuleCall_2_1_0_1_0; }

		//'association' chlidren_list=AbstractAssociation2
		public Group getGroup_2_1_1() { return cGroup_2_1_1; }

		//'association'
		public Keyword getAssociationKeyword_2_1_1_0() { return cAssociationKeyword_2_1_1_0; }

		//chlidren_list=AbstractAssociation2
		public Assignment getChlidren_listAssignment_2_1_1_1() { return cChlidren_listAssignment_2_1_1_1; }

		//AbstractAssociation2
		public RuleCall getChlidren_listAbstractAssociation2ParserRuleCall_2_1_1_1_0() { return cChlidren_listAbstractAssociation2ParserRuleCall_2_1_1_1_0; }
	}

	public class ContainerDescriptionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.Vpdiagram.ContainerDescription");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cContainerDescriptionAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cRepresentationKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cLeftCurlyBracketKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cConditionAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cConditionConditionParserRuleCall_3_0 = (RuleCall)cConditionAssignment_3.eContents().get(0);
		private final Group cGroup_4 = (Group)cGroup.eContents().get(4);
		private final Keyword cLabelKeyword_4_0 = (Keyword)cGroup_4.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_4_1 = (Keyword)cGroup_4.eContents().get(1);
		private final Assignment cNode_LabelAssignment_4_2 = (Assignment)cGroup_4.eContents().get(2);
		private final RuleCall cNode_LabelLabelParserRuleCall_4_2_0 = (RuleCall)cNode_LabelAssignment_4_2.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_4_3 = (Keyword)cGroup_4.eContents().get(3);
		private final Group cGroup_5 = (Group)cGroup.eContents().get(5);
		private final Keyword cStyleKeyword_5_0 = (Keyword)cGroup_5.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_5_1 = (Keyword)cGroup_5.eContents().get(1);
		private final Assignment cStyleAssignment_5_2 = (Assignment)cGroup_5.eContents().get(2);
		private final RuleCall cStyleAbstractContainerStyleParserRuleCall_5_2_0 = (RuleCall)cStyleAssignment_5_2.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_5_3 = (Keyword)cGroup_5.eContents().get(3);
		private final Keyword cRightCurlyBracketKeyword_6 = (Keyword)cGroup.eContents().get(6);
		
		//ContainerDescription vpdiagram::ContainerDescription:
		//	{vpdiagram::ContainerDescription} 'Representation' '{' condition=Condition? ('Label' '{' node_Label=Label '}')?
		//	('Style' => '{' style=AbstractContainerStyle '}')? '}'
		@Override public ParserRule getRule() { return rule; }

		//{vpdiagram::ContainerDescription} 'Representation' '{' condition=Condition? ('Label' '{' node_Label=Label '}')? ('Style'
		//=> '{' style=AbstractContainerStyle '}')? '}'
		public Group getGroup() { return cGroup; }

		//{vpdiagram::ContainerDescription}
		public Action getContainerDescriptionAction_0() { return cContainerDescriptionAction_0; }

		//'Representation'
		public Keyword getRepresentationKeyword_1() { return cRepresentationKeyword_1; }

		//'{'
		public Keyword getLeftCurlyBracketKeyword_2() { return cLeftCurlyBracketKeyword_2; }

		//condition=Condition?
		public Assignment getConditionAssignment_3() { return cConditionAssignment_3; }

		//Condition
		public RuleCall getConditionConditionParserRuleCall_3_0() { return cConditionConditionParserRuleCall_3_0; }

		//('Label' '{' node_Label=Label '}')?
		public Group getGroup_4() { return cGroup_4; }

		//'Label'
		public Keyword getLabelKeyword_4_0() { return cLabelKeyword_4_0; }

		//'{'
		public Keyword getLeftCurlyBracketKeyword_4_1() { return cLeftCurlyBracketKeyword_4_1; }

		//node_Label=Label
		public Assignment getNode_LabelAssignment_4_2() { return cNode_LabelAssignment_4_2; }

		//Label
		public RuleCall getNode_LabelLabelParserRuleCall_4_2_0() { return cNode_LabelLabelParserRuleCall_4_2_0; }

		//'}'
		public Keyword getRightCurlyBracketKeyword_4_3() { return cRightCurlyBracketKeyword_4_3; }

		//('Style' => '{' style=AbstractContainerStyle '}')?
		public Group getGroup_5() { return cGroup_5; }

		//'Style'
		public Keyword getStyleKeyword_5_0() { return cStyleKeyword_5_0; }

		//=> '{'
		public Keyword getLeftCurlyBracketKeyword_5_1() { return cLeftCurlyBracketKeyword_5_1; }

		//style=AbstractContainerStyle
		public Assignment getStyleAssignment_5_2() { return cStyleAssignment_5_2; }

		//AbstractContainerStyle
		public RuleCall getStyleAbstractContainerStyleParserRuleCall_5_2_0() { return cStyleAbstractContainerStyleParserRuleCall_5_2_0; }

		//'}'
		public Keyword getRightCurlyBracketKeyword_5_3() { return cRightCurlyBracketKeyword_5_3; }

		//'}'
		public Keyword getRightCurlyBracketKeyword_6() { return cRightCurlyBracketKeyword_6; }
	}

	public class BasicStyleElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.Vpdiagram.BasicStyle");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cBasicStyleAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cBasicStyleKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cLeftCurlyBracketKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Group cGroup_3 = (Group)cGroup.eContents().get(3);
		private final Keyword cBorderColorKeyword_3_0 = (Keyword)cGroup_3.eContents().get(0);
		private final Assignment cBorderColorAssignment_3_1 = (Assignment)cGroup_3.eContents().get(1);
		private final RuleCall cBorderColorSystemColorsEnumRuleCall_3_1_0 = (RuleCall)cBorderColorAssignment_3_1.eContents().get(0);
		private final Group cGroup_4 = (Group)cGroup.eContents().get(4);
		private final Keyword cBackgroundKeyword_4_0 = (Keyword)cGroup_4.eContents().get(0);
		private final Assignment cBackgroundColorAssignment_4_1 = (Assignment)cGroup_4.eContents().get(1);
		private final RuleCall cBackgroundColorSystemColorsEnumRuleCall_4_1_0 = (RuleCall)cBackgroundColorAssignment_4_1.eContents().get(0);
		private final Group cGroup_5 = (Group)cGroup.eContents().get(5);
		private final Keyword cFormKeyword_5_0 = (Keyword)cGroup_5.eContents().get(0);
		private final Assignment cFormAssignment_5_1 = (Assignment)cGroup_5.eContents().get(1);
		private final RuleCall cFormNode_FormEnumRuleCall_5_1_0 = (RuleCall)cFormAssignment_5_1.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_6 = (Keyword)cGroup.eContents().get(6);
		
		//BasicStyle vpdiagram::BasicStyle:
		//	{vpdiagram::BasicStyle} 'BasicStyle' '{' ('border-color:' borderColor=SystemColors)? ('background:'
		//	backgroundColor=SystemColors)? ('form:' form=Node_Form)? '}'
		@Override public ParserRule getRule() { return rule; }

		//{vpdiagram::BasicStyle} 'BasicStyle' '{' ('border-color:' borderColor=SystemColors)? ('background:'
		//backgroundColor=SystemColors)? ('form:' form=Node_Form)? '}'
		public Group getGroup() { return cGroup; }

		//{vpdiagram::BasicStyle}
		public Action getBasicStyleAction_0() { return cBasicStyleAction_0; }

		//'BasicStyle'
		public Keyword getBasicStyleKeyword_1() { return cBasicStyleKeyword_1; }

		//'{'
		public Keyword getLeftCurlyBracketKeyword_2() { return cLeftCurlyBracketKeyword_2; }

		//('border-color:' borderColor=SystemColors)?
		public Group getGroup_3() { return cGroup_3; }

		//'border-color:'
		public Keyword getBorderColorKeyword_3_0() { return cBorderColorKeyword_3_0; }

		//borderColor=SystemColors
		public Assignment getBorderColorAssignment_3_1() { return cBorderColorAssignment_3_1; }

		//SystemColors
		public RuleCall getBorderColorSystemColorsEnumRuleCall_3_1_0() { return cBorderColorSystemColorsEnumRuleCall_3_1_0; }

		//('background:' backgroundColor=SystemColors)?
		public Group getGroup_4() { return cGroup_4; }

		//'background:'
		public Keyword getBackgroundKeyword_4_0() { return cBackgroundKeyword_4_0; }

		//backgroundColor=SystemColors
		public Assignment getBackgroundColorAssignment_4_1() { return cBackgroundColorAssignment_4_1; }

		//SystemColors
		public RuleCall getBackgroundColorSystemColorsEnumRuleCall_4_1_0() { return cBackgroundColorSystemColorsEnumRuleCall_4_1_0; }

		//('form:' form=Node_Form)?
		public Group getGroup_5() { return cGroup_5; }

		//'form:'
		public Keyword getFormKeyword_5_0() { return cFormKeyword_5_0; }

		//form=Node_Form
		public Assignment getFormAssignment_5_1() { return cFormAssignment_5_1; }

		//Node_Form
		public RuleCall getFormNode_FormEnumRuleCall_5_1_0() { return cFormNode_FormEnumRuleCall_5_1_0; }

		//'}'
		public Keyword getRightCurlyBracketKeyword_6() { return cRightCurlyBracketKeyword_6; }
	}

	public class HistogramStyleElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.Vpdiagram.HistogramStyle");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cHistogramStyleAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cHistogramStyleKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cLeftCurlyBracketKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Group cGroup_3 = (Group)cGroup.eContents().get(3);
		private final Keyword cBorderColorKeyword_3_0 = (Keyword)cGroup_3.eContents().get(0);
		private final Assignment cBorderColorAssignment_3_1 = (Assignment)cGroup_3.eContents().get(1);
		private final RuleCall cBorderColorSystemColorsEnumRuleCall_3_1_0 = (RuleCall)cBorderColorAssignment_3_1.eContents().get(0);
		private final Assignment cSectionsAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cSectionsHistogramSectionParserRuleCall_4_0 = (RuleCall)cSectionsAssignment_4.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_5 = (Keyword)cGroup.eContents().get(5);
		
		//HistogramStyle vpdiagram::HistogramStyle:
		//	{vpdiagram::HistogramStyle} 'HistogramStyle' '{' ('border-color:' borderColor=SystemColors)?
		//	sections+=HistogramSection* '}'
		@Override public ParserRule getRule() { return rule; }

		//{vpdiagram::HistogramStyle} 'HistogramStyle' '{' ('border-color:' borderColor=SystemColors)? sections+=HistogramSection*
		//'}'
		public Group getGroup() { return cGroup; }

		//{vpdiagram::HistogramStyle}
		public Action getHistogramStyleAction_0() { return cHistogramStyleAction_0; }

		//'HistogramStyle'
		public Keyword getHistogramStyleKeyword_1() { return cHistogramStyleKeyword_1; }

		//'{'
		public Keyword getLeftCurlyBracketKeyword_2() { return cLeftCurlyBracketKeyword_2; }

		//('border-color:' borderColor=SystemColors)?
		public Group getGroup_3() { return cGroup_3; }

		//'border-color:'
		public Keyword getBorderColorKeyword_3_0() { return cBorderColorKeyword_3_0; }

		//borderColor=SystemColors
		public Assignment getBorderColorAssignment_3_1() { return cBorderColorAssignment_3_1; }

		//SystemColors
		public RuleCall getBorderColorSystemColorsEnumRuleCall_3_1_0() { return cBorderColorSystemColorsEnumRuleCall_3_1_0; }

		//sections+=HistogramSection*
		public Assignment getSectionsAssignment_4() { return cSectionsAssignment_4; }

		//HistogramSection
		public RuleCall getSectionsHistogramSectionParserRuleCall_4_0() { return cSectionsHistogramSectionParserRuleCall_4_0; }

		//'}'
		public Keyword getRightCurlyBracketKeyword_5() { return cRightCurlyBracketKeyword_5; }
	}

	public class HistogramSectionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.Vpdiagram.HistogramSection");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cHistogramSectionAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cSectionKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cLeftCurlyBracketKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Group cGroup_3 = (Group)cGroup.eContents().get(3);
		private final Keyword cBackgroundKeyword_3_0 = (Keyword)cGroup_3.eContents().get(0);
		private final Assignment cBackgroundColorAssignment_3_1 = (Assignment)cGroup_3.eContents().get(1);
		private final RuleCall cBackgroundColorSystemColorsEnumRuleCall_3_1_0 = (RuleCall)cBackgroundColorAssignment_3_1.eContents().get(0);
		private final Group cGroup_4 = (Group)cGroup.eContents().get(4);
		private final Keyword cForegroundKeyword_4_0 = (Keyword)cGroup_4.eContents().get(0);
		private final Assignment cForgroundColorAssignment_4_1 = (Assignment)cGroup_4.eContents().get(1);
		private final RuleCall cForgroundColorSystemColorsEnumRuleCall_4_1_0 = (RuleCall)cForgroundColorAssignment_4_1.eContents().get(0);
		private final Group cGroup_5 = (Group)cGroup.eContents().get(5);
		private final Keyword cMinValueKeyword_5_0 = (Keyword)cGroup_5.eContents().get(0);
		private final Assignment cMinValueAssignment_5_1 = (Assignment)cGroup_5.eContents().get(1);
		private final RuleCall cMinValueForeignExpressionElementParserRuleCall_5_1_0 = (RuleCall)cMinValueAssignment_5_1.eContents().get(0);
		private final Group cGroup_6 = (Group)cGroup.eContents().get(6);
		private final Keyword cValueKeyword_6_0 = (Keyword)cGroup_6.eContents().get(0);
		private final Assignment cValueAssignment_6_1 = (Assignment)cGroup_6.eContents().get(1);
		private final RuleCall cValueForeignExpressionElementParserRuleCall_6_1_0 = (RuleCall)cValueAssignment_6_1.eContents().get(0);
		private final Group cGroup_7 = (Group)cGroup.eContents().get(7);
		private final Keyword cMaxValueKeyword_7_0 = (Keyword)cGroup_7.eContents().get(0);
		private final Assignment cMaxValueAssignment_7_1 = (Assignment)cGroup_7.eContents().get(1);
		private final RuleCall cMaxValueForeignExpressionElementParserRuleCall_7_1_0 = (RuleCall)cMaxValueAssignment_7_1.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_8 = (Keyword)cGroup.eContents().get(8);
		
		//HistogramSection vpdiagram::HistogramSection:
		//	{vpdiagram::HistogramSection} 'Section' '{' ('background:' backgroundColor=SystemColors)? ('foreground:'
		//	forgroundColor=SystemColors)? ('minValue:' minValue=ForeignExpressionElement)? ('value:'
		//	value=ForeignExpressionElement)? ('maxValue:' maxValue=ForeignExpressionElement)? '}'
		@Override public ParserRule getRule() { return rule; }

		//{vpdiagram::HistogramSection} 'Section' '{' ('background:' backgroundColor=SystemColors)? ('foreground:'
		//forgroundColor=SystemColors)? ('minValue:' minValue=ForeignExpressionElement)? ('value:'
		//value=ForeignExpressionElement)? ('maxValue:' maxValue=ForeignExpressionElement)? '}'
		public Group getGroup() { return cGroup; }

		//{vpdiagram::HistogramSection}
		public Action getHistogramSectionAction_0() { return cHistogramSectionAction_0; }

		//'Section'
		public Keyword getSectionKeyword_1() { return cSectionKeyword_1; }

		//'{'
		public Keyword getLeftCurlyBracketKeyword_2() { return cLeftCurlyBracketKeyword_2; }

		//('background:' backgroundColor=SystemColors)?
		public Group getGroup_3() { return cGroup_3; }

		//'background:'
		public Keyword getBackgroundKeyword_3_0() { return cBackgroundKeyword_3_0; }

		//backgroundColor=SystemColors
		public Assignment getBackgroundColorAssignment_3_1() { return cBackgroundColorAssignment_3_1; }

		//SystemColors
		public RuleCall getBackgroundColorSystemColorsEnumRuleCall_3_1_0() { return cBackgroundColorSystemColorsEnumRuleCall_3_1_0; }

		//('foreground:' forgroundColor=SystemColors)?
		public Group getGroup_4() { return cGroup_4; }

		//'foreground:'
		public Keyword getForegroundKeyword_4_0() { return cForegroundKeyword_4_0; }

		//forgroundColor=SystemColors
		public Assignment getForgroundColorAssignment_4_1() { return cForgroundColorAssignment_4_1; }

		//SystemColors
		public RuleCall getForgroundColorSystemColorsEnumRuleCall_4_1_0() { return cForgroundColorSystemColorsEnumRuleCall_4_1_0; }

		//('minValue:' minValue=ForeignExpressionElement)?
		public Group getGroup_5() { return cGroup_5; }

		//'minValue:'
		public Keyword getMinValueKeyword_5_0() { return cMinValueKeyword_5_0; }

		//minValue=ForeignExpressionElement
		public Assignment getMinValueAssignment_5_1() { return cMinValueAssignment_5_1; }

		//ForeignExpressionElement
		public RuleCall getMinValueForeignExpressionElementParserRuleCall_5_1_0() { return cMinValueForeignExpressionElementParserRuleCall_5_1_0; }

		//('value:' value=ForeignExpressionElement)?
		public Group getGroup_6() { return cGroup_6; }

		//'value:'
		public Keyword getValueKeyword_6_0() { return cValueKeyword_6_0; }

		//value=ForeignExpressionElement
		public Assignment getValueAssignment_6_1() { return cValueAssignment_6_1; }

		//ForeignExpressionElement
		public RuleCall getValueForeignExpressionElementParserRuleCall_6_1_0() { return cValueForeignExpressionElementParserRuleCall_6_1_0; }

		//('maxValue:' maxValue=ForeignExpressionElement)?
		public Group getGroup_7() { return cGroup_7; }

		//'maxValue:'
		public Keyword getMaxValueKeyword_7_0() { return cMaxValueKeyword_7_0; }

		//maxValue=ForeignExpressionElement
		public Assignment getMaxValueAssignment_7_1() { return cMaxValueAssignment_7_1; }

		//ForeignExpressionElement
		public RuleCall getMaxValueForeignExpressionElementParserRuleCall_7_1_0() { return cMaxValueForeignExpressionElementParserRuleCall_7_1_0; }

		//'}'
		public Keyword getRightCurlyBracketKeyword_8() { return cRightCurlyBracketKeyword_8; }
	}

	public class ImageStyleElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.Vpdiagram.ImageStyle");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cImageStyleAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cImageKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cLeftCurlyBracketKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Group cGroup_3 = (Group)cGroup.eContents().get(3);
		private final Keyword cBorderKeyword_3_0 = (Keyword)cGroup_3.eContents().get(0);
		private final Assignment cBorderColorAssignment_3_1 = (Assignment)cGroup_3.eContents().get(1);
		private final RuleCall cBorderColorSystemColorsEnumRuleCall_3_1_0 = (RuleCall)cBorderColorAssignment_3_1.eContents().get(0);
		private final Group cGroup_4 = (Group)cGroup.eContents().get(4);
		private final Keyword cPathKeyword_4_0 = (Keyword)cGroup_4.eContents().get(0);
		private final Assignment cImagePathAssignment_4_1 = (Assignment)cGroup_4.eContents().get(1);
		private final RuleCall cImagePathSTRINGTerminalRuleCall_4_1_0 = (RuleCall)cImagePathAssignment_4_1.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_5 = (Keyword)cGroup.eContents().get(5);
		
		//ImageStyle vpdiagram::ImageStyle:
		//	{vpdiagram::ImageStyle} 'Image' '{' ('border:' borderColor=SystemColors)? ('path:' imagePath=STRING) '}'
		@Override public ParserRule getRule() { return rule; }

		//{vpdiagram::ImageStyle} 'Image' '{' ('border:' borderColor=SystemColors)? ('path:' imagePath=STRING) '}'
		public Group getGroup() { return cGroup; }

		//{vpdiagram::ImageStyle}
		public Action getImageStyleAction_0() { return cImageStyleAction_0; }

		//'Image'
		public Keyword getImageKeyword_1() { return cImageKeyword_1; }

		//'{'
		public Keyword getLeftCurlyBracketKeyword_2() { return cLeftCurlyBracketKeyword_2; }

		//('border:' borderColor=SystemColors)?
		public Group getGroup_3() { return cGroup_3; }

		//'border:'
		public Keyword getBorderKeyword_3_0() { return cBorderKeyword_3_0; }

		//borderColor=SystemColors
		public Assignment getBorderColorAssignment_3_1() { return cBorderColorAssignment_3_1; }

		//SystemColors
		public RuleCall getBorderColorSystemColorsEnumRuleCall_3_1_0() { return cBorderColorSystemColorsEnumRuleCall_3_1_0; }

		//('path:' imagePath=STRING)
		public Group getGroup_4() { return cGroup_4; }

		//'path:'
		public Keyword getPathKeyword_4_0() { return cPathKeyword_4_0; }

		//imagePath=STRING
		public Assignment getImagePathAssignment_4_1() { return cImagePathAssignment_4_1; }

		//STRING
		public RuleCall getImagePathSTRINGTerminalRuleCall_4_1_0() { return cImagePathSTRINGTerminalRuleCall_4_1_0; }

		//'}'
		public Keyword getRightCurlyBracketKeyword_5() { return cRightCurlyBracketKeyword_5; }
	}

	public class FlatStyleElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.Vpdiagram.FlatStyle");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cFlatStyleAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cFlatStyleKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cLeftCurlyBracketKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Group cGroup_3 = (Group)cGroup.eContents().get(3);
		private final Keyword cBorderKeyword_3_0 = (Keyword)cGroup_3.eContents().get(0);
		private final Assignment cBorderColorAssignment_3_1 = (Assignment)cGroup_3.eContents().get(1);
		private final RuleCall cBorderColorSystemColorsEnumRuleCall_3_1_0 = (RuleCall)cBorderColorAssignment_3_1.eContents().get(0);
		private final Group cGroup_4 = (Group)cGroup.eContents().get(4);
		private final Keyword cBackgroundKeyword_4_0 = (Keyword)cGroup_4.eContents().get(0);
		private final Assignment cBackgroundStyleAssignment_4_1 = (Assignment)cGroup_4.eContents().get(1);
		private final RuleCall cBackgroundStyleBackgroundStyleEnumRuleCall_4_1_0 = (RuleCall)cBackgroundStyleAssignment_4_1.eContents().get(0);
		private final Assignment cBackgroundColorAssignment_4_2 = (Assignment)cGroup_4.eContents().get(2);
		private final RuleCall cBackgroundColorSystemColorsEnumRuleCall_4_2_0 = (RuleCall)cBackgroundColorAssignment_4_2.eContents().get(0);
		private final Group cGroup_5 = (Group)cGroup.eContents().get(5);
		private final Keyword cForegroundKeyword_5_0 = (Keyword)cGroup_5.eContents().get(0);
		private final Assignment cForgroundColorAssignment_5_1 = (Assignment)cGroup_5.eContents().get(1);
		private final RuleCall cForgroundColorSystemColorsEnumRuleCall_5_1_0 = (RuleCall)cForgroundColorAssignment_5_1.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_6 = (Keyword)cGroup.eContents().get(6);
		
		//FlatStyle vpdiagram::FlatStyle:
		//	{vpdiagram::FlatStyle} 'FlatStyle' '{' ('border:' borderColor=SystemColors)? ('background:'
		//	backgroundStyle=BackgroundStyle? backgroundColor=SystemColors)? ('foreground:' forgroundColor=SystemColors)? '}'
		@Override public ParserRule getRule() { return rule; }

		//{vpdiagram::FlatStyle} 'FlatStyle' '{' ('border:' borderColor=SystemColors)? ('background:'
		//backgroundStyle=BackgroundStyle? backgroundColor=SystemColors)? ('foreground:' forgroundColor=SystemColors)? '}'
		public Group getGroup() { return cGroup; }

		//{vpdiagram::FlatStyle}
		public Action getFlatStyleAction_0() { return cFlatStyleAction_0; }

		//'FlatStyle'
		public Keyword getFlatStyleKeyword_1() { return cFlatStyleKeyword_1; }

		//'{'
		public Keyword getLeftCurlyBracketKeyword_2() { return cLeftCurlyBracketKeyword_2; }

		//('border:' borderColor=SystemColors)?
		public Group getGroup_3() { return cGroup_3; }

		//'border:'
		public Keyword getBorderKeyword_3_0() { return cBorderKeyword_3_0; }

		//borderColor=SystemColors
		public Assignment getBorderColorAssignment_3_1() { return cBorderColorAssignment_3_1; }

		//SystemColors
		public RuleCall getBorderColorSystemColorsEnumRuleCall_3_1_0() { return cBorderColorSystemColorsEnumRuleCall_3_1_0; }

		//('background:' backgroundStyle=BackgroundStyle? backgroundColor=SystemColors)?
		public Group getGroup_4() { return cGroup_4; }

		//'background:'
		public Keyword getBackgroundKeyword_4_0() { return cBackgroundKeyword_4_0; }

		//backgroundStyle=BackgroundStyle?
		public Assignment getBackgroundStyleAssignment_4_1() { return cBackgroundStyleAssignment_4_1; }

		//BackgroundStyle
		public RuleCall getBackgroundStyleBackgroundStyleEnumRuleCall_4_1_0() { return cBackgroundStyleBackgroundStyleEnumRuleCall_4_1_0; }

		//backgroundColor=SystemColors
		public Assignment getBackgroundColorAssignment_4_2() { return cBackgroundColorAssignment_4_2; }

		//SystemColors
		public RuleCall getBackgroundColorSystemColorsEnumRuleCall_4_2_0() { return cBackgroundColorSystemColorsEnumRuleCall_4_2_0; }

		//('foreground:' forgroundColor=SystemColors)?
		public Group getGroup_5() { return cGroup_5; }

		//'foreground:'
		public Keyword getForegroundKeyword_5_0() { return cForegroundKeyword_5_0; }

		//forgroundColor=SystemColors
		public Assignment getForgroundColorAssignment_5_1() { return cForgroundColorAssignment_5_1; }

		//SystemColors
		public RuleCall getForgroundColorSystemColorsEnumRuleCall_5_1_0() { return cForgroundColorSystemColorsEnumRuleCall_5_1_0; }

		//'}'
		public Keyword getRightCurlyBracketKeyword_6() { return cRightCurlyBracketKeyword_6; }
	}

	public class LabelElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.Vpdiagram.Label");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cLabelAction_0 = (Action)cGroup.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Keyword cContentKeyword_1_0 = (Keyword)cGroup_1.eContents().get(0);
		private final Assignment cValueAssignment_1_1 = (Assignment)cGroup_1.eContents().get(1);
		private final RuleCall cValueExpressionParserRuleCall_1_1_0 = (RuleCall)cValueAssignment_1_1.eContents().get(0);
		private final Group cGroup_2 = (Group)cGroup.eContents().get(2);
		private final Keyword cPoliceKeyword_2_0 = (Keyword)cGroup_2.eContents().get(0);
		private final Assignment cBoldAssignment_2_1 = (Assignment)cGroup_2.eContents().get(1);
		private final Keyword cBoldBoldKeyword_2_1_0 = (Keyword)cBoldAssignment_2_1.eContents().get(0);
		private final Assignment cItalicAssignment_2_2 = (Assignment)cGroup_2.eContents().get(2);
		private final Keyword cItalicItalicKeyword_2_2_0 = (Keyword)cItalicAssignment_2_2.eContents().get(0);
		private final Assignment cColorAssignment_2_3 = (Assignment)cGroup_2.eContents().get(3);
		private final RuleCall cColorSystemColorsEnumRuleCall_2_3_0 = (RuleCall)cColorAssignment_2_3.eContents().get(0);
		private final Assignment cSizeAssignment_2_4 = (Assignment)cGroup_2.eContents().get(4);
		private final RuleCall cSizeEIntParserRuleCall_2_4_0 = (RuleCall)cSizeAssignment_2_4.eContents().get(0);
		
		//Label vpdiagram::Label:
		//	{vpdiagram::Label} ('content:' value=Expression) ('police:' bold?='bold'? italic?='italic'? color=SystemColors?
		//	size=EInt?)?
		@Override public ParserRule getRule() { return rule; }

		//{vpdiagram::Label} ('content:' value=Expression) ('police:' bold?='bold'? italic?='italic'? color=SystemColors?
		//size=EInt?)?
		public Group getGroup() { return cGroup; }

		//{vpdiagram::Label}
		public Action getLabelAction_0() { return cLabelAction_0; }

		//('content:' value=Expression)
		public Group getGroup_1() { return cGroup_1; }

		//'content:'
		public Keyword getContentKeyword_1_0() { return cContentKeyword_1_0; }

		//value=Expression
		public Assignment getValueAssignment_1_1() { return cValueAssignment_1_1; }

		//Expression
		public RuleCall getValueExpressionParserRuleCall_1_1_0() { return cValueExpressionParserRuleCall_1_1_0; }

		//('police:' bold?='bold'? italic?='italic'? color=SystemColors? size=EInt?)?
		public Group getGroup_2() { return cGroup_2; }

		//'police:'
		public Keyword getPoliceKeyword_2_0() { return cPoliceKeyword_2_0; }

		//bold?='bold'?
		public Assignment getBoldAssignment_2_1() { return cBoldAssignment_2_1; }

		//'bold'
		public Keyword getBoldBoldKeyword_2_1_0() { return cBoldBoldKeyword_2_1_0; }

		//italic?='italic'?
		public Assignment getItalicAssignment_2_2() { return cItalicAssignment_2_2; }

		//'italic'
		public Keyword getItalicItalicKeyword_2_2_0() { return cItalicItalicKeyword_2_2_0; }

		//color=SystemColors?
		public Assignment getColorAssignment_2_3() { return cColorAssignment_2_3; }

		//SystemColors
		public RuleCall getColorSystemColorsEnumRuleCall_2_3_0() { return cColorSystemColorsEnumRuleCall_2_3_0; }

		//size=EInt?
		public Assignment getSizeAssignment_2_4() { return cSizeAssignment_2_4; }

		//EInt
		public RuleCall getSizeEIntParserRuleCall_2_4_0() { return cSizeEIntParserRuleCall_2_4_0; }
	}

	public class NodeElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.Vpdiagram.Node");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cNodeAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cNodeKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cNameAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cNameEStringParserRuleCall_2_0 = (RuleCall)cNameAssignment_2.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Group cGroup_4 = (Group)cGroup.eContents().get(4);
		private final Keyword cImportKeyword_4_0 = (Keyword)cGroup_4.eContents().get(0);
		private final Assignment cImportsAssignment_4_1 = (Assignment)cGroup_4.eContents().get(1);
		private final CrossReference cImportsNodeMappingCrossReference_4_1_0 = (CrossReference)cImportsAssignment_4_1.eContents().get(0);
		private final RuleCall cImportsNodeMappingFQNParserRuleCall_4_1_0_1 = (RuleCall)cImportsNodeMappingCrossReference_4_1_0.eContents().get(1);
		private final Group cGroup_5 = (Group)cGroup.eContents().get(5);
		private final Keyword cDomainContextKeyword_5_0 = (Keyword)cGroup_5.eContents().get(0);
		private final Assignment cThe_domainAssignment_5_1 = (Assignment)cGroup_5.eContents().get(1);
		private final RuleCall cThe_domainNodeDomainElementParserRuleCall_5_1_0 = (RuleCall)cThe_domainAssignment_5_1.eContents().get(0);
		private final Assignment cSynchronizationModeAssignment_6 = (Assignment)cGroup.eContents().get(6);
		private final RuleCall cSynchronizationModeSynchronizationModeEnumRuleCall_6_0 = (RuleCall)cSynchronizationModeAssignment_6.eContents().get(0);
		private final Assignment cStyleAssignment_7 = (Assignment)cGroup.eContents().get(7);
		private final RuleCall cStyleNodeDescriptionParserRuleCall_7_0 = (RuleCall)cStyleAssignment_7.eContents().get(0);
		private final Assignment cChildrenAssignment_8 = (Assignment)cGroup.eContents().get(8);
		private final RuleCall cChildrenNodeChildrenParserRuleCall_8_0 = (RuleCall)cChildrenAssignment_8.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_9 = (Keyword)cGroup.eContents().get(9);
		
		//Node vpdiagram::Node:
		//	{vpdiagram::Node} 'Node' name=EString '{' ('import:' imports=[siriusDiagramDescription::NodeMapping|FQN])?
		//	('domain-context:' the_domain=NodeDomainElement)? synchronizationMode=SynchronizationMode? style+=NodeDescription*
		//	children=NodeChildren? '}'
		@Override public ParserRule getRule() { return rule; }

		//{vpdiagram::Node} 'Node' name=EString '{' ('import:' imports=[siriusDiagramDescription::NodeMapping|FQN])?
		//('domain-context:' the_domain=NodeDomainElement)? synchronizationMode=SynchronizationMode? style+=NodeDescription*
		//children=NodeChildren? '}'
		public Group getGroup() { return cGroup; }

		//{vpdiagram::Node}
		public Action getNodeAction_0() { return cNodeAction_0; }

		//'Node'
		public Keyword getNodeKeyword_1() { return cNodeKeyword_1; }

		//name=EString
		public Assignment getNameAssignment_2() { return cNameAssignment_2; }

		//EString
		public RuleCall getNameEStringParserRuleCall_2_0() { return cNameEStringParserRuleCall_2_0; }

		//'{'
		public Keyword getLeftCurlyBracketKeyword_3() { return cLeftCurlyBracketKeyword_3; }

		//('import:' imports=[siriusDiagramDescription::NodeMapping|FQN])?
		public Group getGroup_4() { return cGroup_4; }

		//'import:'
		public Keyword getImportKeyword_4_0() { return cImportKeyword_4_0; }

		//imports=[siriusDiagramDescription::NodeMapping|FQN]
		public Assignment getImportsAssignment_4_1() { return cImportsAssignment_4_1; }

		//[siriusDiagramDescription::NodeMapping|FQN]
		public CrossReference getImportsNodeMappingCrossReference_4_1_0() { return cImportsNodeMappingCrossReference_4_1_0; }

		//FQN
		public RuleCall getImportsNodeMappingFQNParserRuleCall_4_1_0_1() { return cImportsNodeMappingFQNParserRuleCall_4_1_0_1; }

		//('domain-context:' the_domain=NodeDomainElement)?
		public Group getGroup_5() { return cGroup_5; }

		//'domain-context:'
		public Keyword getDomainContextKeyword_5_0() { return cDomainContextKeyword_5_0; }

		//the_domain=NodeDomainElement
		public Assignment getThe_domainAssignment_5_1() { return cThe_domainAssignment_5_1; }

		//NodeDomainElement
		public RuleCall getThe_domainNodeDomainElementParserRuleCall_5_1_0() { return cThe_domainNodeDomainElementParserRuleCall_5_1_0; }

		//synchronizationMode=SynchronizationMode?
		public Assignment getSynchronizationModeAssignment_6() { return cSynchronizationModeAssignment_6; }

		//SynchronizationMode
		public RuleCall getSynchronizationModeSynchronizationModeEnumRuleCall_6_0() { return cSynchronizationModeSynchronizationModeEnumRuleCall_6_0; }

		//style+=NodeDescription*
		public Assignment getStyleAssignment_7() { return cStyleAssignment_7; }

		//NodeDescription
		public RuleCall getStyleNodeDescriptionParserRuleCall_7_0() { return cStyleNodeDescriptionParserRuleCall_7_0; }

		//children=NodeChildren?
		public Assignment getChildrenAssignment_8() { return cChildrenAssignment_8; }

		//NodeChildren
		public RuleCall getChildrenNodeChildrenParserRuleCall_8_0() { return cChildrenNodeChildrenParserRuleCall_8_0; }

		//'}'
		public Keyword getRightCurlyBracketKeyword_9() { return cRightCurlyBracketKeyword_9; }
	}

	public class NodeChildrenElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.Vpdiagram.NodeChildren");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cNodeChildrenAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cContainsKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cLeftCurlyBracketKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Group cGroup_3 = (Group)cGroup.eContents().get(3);
		private final Keyword cReuseKeyword_3_0 = (Keyword)cGroup_3.eContents().get(0);
		private final Assignment cReused_boderednodesAssignment_3_1 = (Assignment)cGroup_3.eContents().get(1);
		private final CrossReference cReused_boderednodesBorderedNodeCrossReference_3_1_0 = (CrossReference)cReused_boderednodesAssignment_3_1.eContents().get(0);
		private final RuleCall cReused_boderednodesBorderedNodeFQNParserRuleCall_3_1_0_1 = (RuleCall)cReused_boderednodesBorderedNodeCrossReference_3_1_0.eContents().get(1);
		private final Group cGroup_3_2 = (Group)cGroup_3.eContents().get(2);
		private final Keyword cCommaKeyword_3_2_0 = (Keyword)cGroup_3_2.eContents().get(0);
		private final Assignment cReused_boderednodesAssignment_3_2_1 = (Assignment)cGroup_3_2.eContents().get(1);
		private final CrossReference cReused_boderednodesBorderedNodeCrossReference_3_2_1_0 = (CrossReference)cReused_boderednodesAssignment_3_2_1.eContents().get(0);
		private final RuleCall cReused_boderednodesBorderedNodeFQNParserRuleCall_3_2_1_0_1 = (RuleCall)cReused_boderednodesBorderedNodeCrossReference_3_2_1_0.eContents().get(1);
		private final Assignment cOwned_boderednodesAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cOwned_boderednodesBorderedNodeParserRuleCall_4_0 = (RuleCall)cOwned_boderednodesAssignment_4.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_5 = (Keyword)cGroup.eContents().get(5);
		
		//NodeChildren vpdiagram::NodeChildren:
		//	{vpdiagram::NodeChildren} 'Contains' '{' ('reuse' reused_boderednodes+=[vpdiagram::BorderedNode|FQN] (','
		//	reused_boderednodes+=[vpdiagram::BorderedNode|FQN])*)? owned_boderednodes+=BorderedNode* '}'
		@Override public ParserRule getRule() { return rule; }

		//{vpdiagram::NodeChildren} 'Contains' '{' ('reuse' reused_boderednodes+=[vpdiagram::BorderedNode|FQN] (','
		//reused_boderednodes+=[vpdiagram::BorderedNode|FQN])*)? owned_boderednodes+=BorderedNode* '}'
		public Group getGroup() { return cGroup; }

		//{vpdiagram::NodeChildren}
		public Action getNodeChildrenAction_0() { return cNodeChildrenAction_0; }

		//'Contains'
		public Keyword getContainsKeyword_1() { return cContainsKeyword_1; }

		//'{'
		public Keyword getLeftCurlyBracketKeyword_2() { return cLeftCurlyBracketKeyword_2; }

		//('reuse' reused_boderednodes+=[vpdiagram::BorderedNode|FQN] (',' reused_boderednodes+=[vpdiagram::BorderedNode|FQN])*)?
		public Group getGroup_3() { return cGroup_3; }

		//'reuse'
		public Keyword getReuseKeyword_3_0() { return cReuseKeyword_3_0; }

		//reused_boderednodes+=[vpdiagram::BorderedNode|FQN]
		public Assignment getReused_boderednodesAssignment_3_1() { return cReused_boderednodesAssignment_3_1; }

		//[vpdiagram::BorderedNode|FQN]
		public CrossReference getReused_boderednodesBorderedNodeCrossReference_3_1_0() { return cReused_boderednodesBorderedNodeCrossReference_3_1_0; }

		//FQN
		public RuleCall getReused_boderednodesBorderedNodeFQNParserRuleCall_3_1_0_1() { return cReused_boderednodesBorderedNodeFQNParserRuleCall_3_1_0_1; }

		//(',' reused_boderednodes+=[vpdiagram::BorderedNode|FQN])*
		public Group getGroup_3_2() { return cGroup_3_2; }

		//','
		public Keyword getCommaKeyword_3_2_0() { return cCommaKeyword_3_2_0; }

		//reused_boderednodes+=[vpdiagram::BorderedNode|FQN]
		public Assignment getReused_boderednodesAssignment_3_2_1() { return cReused_boderednodesAssignment_3_2_1; }

		//[vpdiagram::BorderedNode|FQN]
		public CrossReference getReused_boderednodesBorderedNodeCrossReference_3_2_1_0() { return cReused_boderednodesBorderedNodeCrossReference_3_2_1_0; }

		//FQN
		public RuleCall getReused_boderednodesBorderedNodeFQNParserRuleCall_3_2_1_0_1() { return cReused_boderednodesBorderedNodeFQNParserRuleCall_3_2_1_0_1; }

		//owned_boderednodes+=BorderedNode*
		public Assignment getOwned_boderednodesAssignment_4() { return cOwned_boderednodesAssignment_4; }

		//BorderedNode
		public RuleCall getOwned_boderednodesBorderedNodeParserRuleCall_4_0() { return cOwned_boderednodesBorderedNodeParserRuleCall_4_0; }

		//'}'
		public Keyword getRightCurlyBracketKeyword_5() { return cRightCurlyBracketKeyword_5; }
	}

	public class BorderedNodeElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.Vpdiagram.BorderedNode");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cBorderedNodeAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cBorderedNodeKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cNameAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cNameEStringParserRuleCall_2_0 = (RuleCall)cNameAssignment_2.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Group cGroup_4 = (Group)cGroup.eContents().get(4);
		private final Keyword cImportKeyword_4_0 = (Keyword)cGroup_4.eContents().get(0);
		private final Assignment cImportsAssignment_4_1 = (Assignment)cGroup_4.eContents().get(1);
		private final CrossReference cImportsNodeMappingCrossReference_4_1_0 = (CrossReference)cImportsAssignment_4_1.eContents().get(0);
		private final RuleCall cImportsNodeMappingFQNParserRuleCall_4_1_0_1 = (RuleCall)cImportsNodeMappingCrossReference_4_1_0.eContents().get(1);
		private final Group cGroup_5 = (Group)cGroup.eContents().get(5);
		private final Keyword cDomainContextKeyword_5_0 = (Keyword)cGroup_5.eContents().get(0);
		private final Assignment cThe_domainAssignment_5_1 = (Assignment)cGroup_5.eContents().get(1);
		private final RuleCall cThe_domainNodeDomainElementParserRuleCall_5_1_0 = (RuleCall)cThe_domainAssignment_5_1.eContents().get(0);
		private final Assignment cSynchronizationModeAssignment_6 = (Assignment)cGroup.eContents().get(6);
		private final RuleCall cSynchronizationModeSynchronizationModeEnumRuleCall_6_0 = (RuleCall)cSynchronizationModeAssignment_6.eContents().get(0);
		private final Assignment cStyleAssignment_7 = (Assignment)cGroup.eContents().get(7);
		private final RuleCall cStyleNodeDescriptionParserRuleCall_7_0 = (RuleCall)cStyleAssignment_7.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_8 = (Keyword)cGroup.eContents().get(8);
		
		//BorderedNode vpdiagram::BorderedNode:
		//	{vpdiagram::BorderedNode} 'BorderedNode' name=EString '{' ('import:'
		//	imports=[siriusDiagramDescription::NodeMapping|FQN])? ('domain-context:' the_domain=NodeDomainElement)?
		//	synchronizationMode=SynchronizationMode? style+=NodeDescription* '}'
		@Override public ParserRule getRule() { return rule; }

		//{vpdiagram::BorderedNode} 'BorderedNode' name=EString '{' ('import:'
		//imports=[siriusDiagramDescription::NodeMapping|FQN])? ('domain-context:' the_domain=NodeDomainElement)?
		//synchronizationMode=SynchronizationMode? style+=NodeDescription* '}'
		public Group getGroup() { return cGroup; }

		//{vpdiagram::BorderedNode}
		public Action getBorderedNodeAction_0() { return cBorderedNodeAction_0; }

		//'BorderedNode'
		public Keyword getBorderedNodeKeyword_1() { return cBorderedNodeKeyword_1; }

		//name=EString
		public Assignment getNameAssignment_2() { return cNameAssignment_2; }

		//EString
		public RuleCall getNameEStringParserRuleCall_2_0() { return cNameEStringParserRuleCall_2_0; }

		//'{'
		public Keyword getLeftCurlyBracketKeyword_3() { return cLeftCurlyBracketKeyword_3; }

		//('import:' imports=[siriusDiagramDescription::NodeMapping|FQN])?
		public Group getGroup_4() { return cGroup_4; }

		//'import:'
		public Keyword getImportKeyword_4_0() { return cImportKeyword_4_0; }

		//imports=[siriusDiagramDescription::NodeMapping|FQN]
		public Assignment getImportsAssignment_4_1() { return cImportsAssignment_4_1; }

		//[siriusDiagramDescription::NodeMapping|FQN]
		public CrossReference getImportsNodeMappingCrossReference_4_1_0() { return cImportsNodeMappingCrossReference_4_1_0; }

		//FQN
		public RuleCall getImportsNodeMappingFQNParserRuleCall_4_1_0_1() { return cImportsNodeMappingFQNParserRuleCall_4_1_0_1; }

		//('domain-context:' the_domain=NodeDomainElement)?
		public Group getGroup_5() { return cGroup_5; }

		//'domain-context:'
		public Keyword getDomainContextKeyword_5_0() { return cDomainContextKeyword_5_0; }

		//the_domain=NodeDomainElement
		public Assignment getThe_domainAssignment_5_1() { return cThe_domainAssignment_5_1; }

		//NodeDomainElement
		public RuleCall getThe_domainNodeDomainElementParserRuleCall_5_1_0() { return cThe_domainNodeDomainElementParserRuleCall_5_1_0; }

		//synchronizationMode=SynchronizationMode?
		public Assignment getSynchronizationModeAssignment_6() { return cSynchronizationModeAssignment_6; }

		//SynchronizationMode
		public RuleCall getSynchronizationModeSynchronizationModeEnumRuleCall_6_0() { return cSynchronizationModeSynchronizationModeEnumRuleCall_6_0; }

		//style+=NodeDescription*
		public Assignment getStyleAssignment_7() { return cStyleAssignment_7; }

		//NodeDescription
		public RuleCall getStyleNodeDescriptionParserRuleCall_7_0() { return cStyleNodeDescriptionParserRuleCall_7_0; }

		//'}'
		public Keyword getRightCurlyBracketKeyword_8() { return cRightCurlyBracketKeyword_8; }
	}

	public class NodeDescriptionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.Vpdiagram.NodeDescription");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cNodeDescriptionAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cRepresentationKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cLeftCurlyBracketKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cConditionAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cConditionConditionParserRuleCall_3_0 = (RuleCall)cConditionAssignment_3.eContents().get(0);
		private final Group cGroup_4 = (Group)cGroup.eContents().get(4);
		private final Keyword cLabelKeyword_4_0 = (Keyword)cGroup_4.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_4_1 = (Keyword)cGroup_4.eContents().get(1);
		private final Assignment cNode_LabelAssignment_4_2 = (Assignment)cGroup_4.eContents().get(2);
		private final RuleCall cNode_LabelLabelParserRuleCall_4_2_0 = (RuleCall)cNode_LabelAssignment_4_2.eContents().get(0);
		private final Group cGroup_4_3 = (Group)cGroup_4.eContents().get(3);
		private final Keyword cPositionKeyword_4_3_0 = (Keyword)cGroup_4_3.eContents().get(0);
		private final Assignment cLabel_positionAssignment_4_3_1 = (Assignment)cGroup_4_3.eContents().get(1);
		private final RuleCall cLabel_positionLabelPositionEnumRuleCall_4_3_1_0 = (RuleCall)cLabel_positionAssignment_4_3_1.eContents().get(0);
		private final Group cGroup_4_4 = (Group)cGroup_4.eContents().get(4);
		private final Keyword cAlignmentKeyword_4_4_0 = (Keyword)cGroup_4_4.eContents().get(0);
		private final Assignment cLabel_alignementAssignment_4_4_1 = (Assignment)cGroup_4_4.eContents().get(1);
		private final RuleCall cLabel_alignementLabelAlignmentEnumRuleCall_4_4_1_0 = (RuleCall)cLabel_alignementAssignment_4_4_1.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_4_5 = (Keyword)cGroup_4.eContents().get(5);
		private final Group cGroup_5 = (Group)cGroup.eContents().get(5);
		private final Keyword cStyleKeyword_5_0 = (Keyword)cGroup_5.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_5_1 = (Keyword)cGroup_5.eContents().get(1);
		private final Assignment cStyleAssignment_5_2 = (Assignment)cGroup_5.eContents().get(2);
		private final RuleCall cStyleAbstractNodeStyleParserRuleCall_5_2_0 = (RuleCall)cStyleAssignment_5_2.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_5_3 = (Keyword)cGroup_5.eContents().get(3);
		private final Keyword cRightCurlyBracketKeyword_6 = (Keyword)cGroup.eContents().get(6);
		
		//NodeDescription vpdiagram::NodeDescription:
		//	{vpdiagram::NodeDescription} 'Representation' '{' condition=Condition? ('Label' '{' node_Label=Label ('position:'
		//	label_position=LabelPosition)? ('alignment:' label_alignement=LabelAlignment)? '}')? ('Style' '{'
		//	style=AbstractNodeStyle '}')? '}'
		@Override public ParserRule getRule() { return rule; }

		//{vpdiagram::NodeDescription} 'Representation' '{' condition=Condition? ('Label' '{' node_Label=Label ('position:'
		//label_position=LabelPosition)? ('alignment:' label_alignement=LabelAlignment)? '}')? ('Style' '{'
		//style=AbstractNodeStyle '}')? '}'
		public Group getGroup() { return cGroup; }

		//{vpdiagram::NodeDescription}
		public Action getNodeDescriptionAction_0() { return cNodeDescriptionAction_0; }

		//'Representation'
		public Keyword getRepresentationKeyword_1() { return cRepresentationKeyword_1; }

		//'{'
		public Keyword getLeftCurlyBracketKeyword_2() { return cLeftCurlyBracketKeyword_2; }

		//condition=Condition?
		public Assignment getConditionAssignment_3() { return cConditionAssignment_3; }

		//Condition
		public RuleCall getConditionConditionParserRuleCall_3_0() { return cConditionConditionParserRuleCall_3_0; }

		//('Label' '{' node_Label=Label ('position:' label_position=LabelPosition)? ('alignment:'
		//label_alignement=LabelAlignment)? '}')?
		public Group getGroup_4() { return cGroup_4; }

		//'Label'
		public Keyword getLabelKeyword_4_0() { return cLabelKeyword_4_0; }

		//'{'
		public Keyword getLeftCurlyBracketKeyword_4_1() { return cLeftCurlyBracketKeyword_4_1; }

		//node_Label=Label
		public Assignment getNode_LabelAssignment_4_2() { return cNode_LabelAssignment_4_2; }

		//Label
		public RuleCall getNode_LabelLabelParserRuleCall_4_2_0() { return cNode_LabelLabelParserRuleCall_4_2_0; }

		//('position:' label_position=LabelPosition)?
		public Group getGroup_4_3() { return cGroup_4_3; }

		//'position:'
		public Keyword getPositionKeyword_4_3_0() { return cPositionKeyword_4_3_0; }

		//label_position=LabelPosition
		public Assignment getLabel_positionAssignment_4_3_1() { return cLabel_positionAssignment_4_3_1; }

		//LabelPosition
		public RuleCall getLabel_positionLabelPositionEnumRuleCall_4_3_1_0() { return cLabel_positionLabelPositionEnumRuleCall_4_3_1_0; }

		//('alignment:' label_alignement=LabelAlignment)?
		public Group getGroup_4_4() { return cGroup_4_4; }

		//'alignment:'
		public Keyword getAlignmentKeyword_4_4_0() { return cAlignmentKeyword_4_4_0; }

		//label_alignement=LabelAlignment
		public Assignment getLabel_alignementAssignment_4_4_1() { return cLabel_alignementAssignment_4_4_1; }

		//LabelAlignment
		public RuleCall getLabel_alignementLabelAlignmentEnumRuleCall_4_4_1_0() { return cLabel_alignementLabelAlignmentEnumRuleCall_4_4_1_0; }

		//'}'
		public Keyword getRightCurlyBracketKeyword_4_5() { return cRightCurlyBracketKeyword_4_5; }

		//('Style' '{' style=AbstractNodeStyle '}')?
		public Group getGroup_5() { return cGroup_5; }

		//'Style'
		public Keyword getStyleKeyword_5_0() { return cStyleKeyword_5_0; }

		//'{'
		public Keyword getLeftCurlyBracketKeyword_5_1() { return cLeftCurlyBracketKeyword_5_1; }

		//style=AbstractNodeStyle
		public Assignment getStyleAssignment_5_2() { return cStyleAssignment_5_2; }

		//AbstractNodeStyle
		public RuleCall getStyleAbstractNodeStyleParserRuleCall_5_2_0() { return cStyleAbstractNodeStyleParserRuleCall_5_2_0; }

		//'}'
		public Keyword getRightCurlyBracketKeyword_5_3() { return cRightCurlyBracketKeyword_5_3; }

		//'}'
		public Keyword getRightCurlyBracketKeyword_6() { return cRightCurlyBracketKeyword_6; }
	}

	public class ActionSetElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.Vpdiagram.ActionSet");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cActionSetAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cActionsKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cLeftCurlyBracketKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cActionsAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cActionsActionParserRuleCall_3_0 = (RuleCall)cActionsAssignment_3.eContents().get(0);
		private final Assignment cOpenActionsAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cOpenActionsOpenActionParserRuleCall_4_0 = (RuleCall)cOpenActionsAssignment_4.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_5 = (Keyword)cGroup.eContents().get(5);
		
		//ActionSet vpdiagram::ActionSet:
		//	{vpdiagram::ActionSet} 'Actions' '{' actions+=Action* openActions+=OpenAction* '}'
		@Override public ParserRule getRule() { return rule; }

		//{vpdiagram::ActionSet} 'Actions' '{' actions+=Action* openActions+=OpenAction* '}'
		public Group getGroup() { return cGroup; }

		//{vpdiagram::ActionSet}
		public Action getActionSetAction_0() { return cActionSetAction_0; }

		//'Actions'
		public Keyword getActionsKeyword_1() { return cActionsKeyword_1; }

		//'{'
		public Keyword getLeftCurlyBracketKeyword_2() { return cLeftCurlyBracketKeyword_2; }

		//actions+=Action*
		public Assignment getActionsAssignment_3() { return cActionsAssignment_3; }

		//Action
		public RuleCall getActionsActionParserRuleCall_3_0() { return cActionsActionParserRuleCall_3_0; }

		//openActions+=OpenAction*
		public Assignment getOpenActionsAssignment_4() { return cOpenActionsAssignment_4; }

		//OpenAction
		public RuleCall getOpenActionsOpenActionParserRuleCall_4_0() { return cOpenActionsOpenActionParserRuleCall_4_0; }

		//'}'
		public Keyword getRightCurlyBracketKeyword_5() { return cRightCurlyBracketKeyword_5; }
	}

	public class OpenActionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.Vpdiagram.OpenAction");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cOpenActionAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cOpenActionKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cNameAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cNameEStringParserRuleCall_2_0 = (RuleCall)cNameAssignment_2.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Group cGroup_4 = (Group)cGroup.eContents().get(4);
		private final Keyword cPreconditionKeyword_4_0 = (Keyword)cGroup_4.eContents().get(0);
		private final Assignment cPreconditionAssignment_4_1 = (Assignment)cGroup_4.eContents().get(1);
		private final RuleCall cPreconditionEStringParserRuleCall_4_1_0 = (RuleCall)cPreconditionAssignment_4_1.eContents().get(0);
		private final Group cGroup_5 = (Group)cGroup.eContents().get(5);
		private final Keyword cLabelKeyword_5_0 = (Keyword)cGroup_5.eContents().get(0);
		private final Assignment cLabelAssignment_5_1 = (Assignment)cGroup_5.eContents().get(1);
		private final RuleCall cLabelSTRINGTerminalRuleCall_5_1_0 = (RuleCall)cLabelAssignment_5_1.eContents().get(0);
		private final Group cGroup_6 = (Group)cGroup.eContents().get(6);
		private final Keyword cIconKeyword_6_0 = (Keyword)cGroup_6.eContents().get(0);
		private final Assignment cIconAssignment_6_1 = (Assignment)cGroup_6.eContents().get(1);
		private final RuleCall cIconSTRINGTerminalRuleCall_6_1_0 = (RuleCall)cIconAssignment_6_1.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_7 = (Keyword)cGroup.eContents().get(7);
		
		//OpenAction vpdiagram::OpenAction:
		//	{vpdiagram::OpenAction} 'OpenAction' name=EString '{' ('precondition:' precondition=EString)? ('label:'
		//	label=STRING)? ('icon:' icon=STRING)? '}'
		@Override public ParserRule getRule() { return rule; }

		//{vpdiagram::OpenAction} 'OpenAction' name=EString '{' ('precondition:' precondition=EString)? ('label:' label=STRING)?
		//('icon:' icon=STRING)? '}'
		public Group getGroup() { return cGroup; }

		//{vpdiagram::OpenAction}
		public Action getOpenActionAction_0() { return cOpenActionAction_0; }

		//'OpenAction'
		public Keyword getOpenActionKeyword_1() { return cOpenActionKeyword_1; }

		//name=EString
		public Assignment getNameAssignment_2() { return cNameAssignment_2; }

		//EString
		public RuleCall getNameEStringParserRuleCall_2_0() { return cNameEStringParserRuleCall_2_0; }

		//'{'
		public Keyword getLeftCurlyBracketKeyword_3() { return cLeftCurlyBracketKeyword_3; }

		//('precondition:' precondition=EString)?
		public Group getGroup_4() { return cGroup_4; }

		//'precondition:'
		public Keyword getPreconditionKeyword_4_0() { return cPreconditionKeyword_4_0; }

		//precondition=EString
		public Assignment getPreconditionAssignment_4_1() { return cPreconditionAssignment_4_1; }

		//EString
		public RuleCall getPreconditionEStringParserRuleCall_4_1_0() { return cPreconditionEStringParserRuleCall_4_1_0; }

		//('label:' label=STRING)?
		public Group getGroup_5() { return cGroup_5; }

		//'label:'
		public Keyword getLabelKeyword_5_0() { return cLabelKeyword_5_0; }

		//label=STRING
		public Assignment getLabelAssignment_5_1() { return cLabelAssignment_5_1; }

		//STRING
		public RuleCall getLabelSTRINGTerminalRuleCall_5_1_0() { return cLabelSTRINGTerminalRuleCall_5_1_0; }

		//('icon:' icon=STRING)?
		public Group getGroup_6() { return cGroup_6; }

		//'icon:'
		public Keyword getIconKeyword_6_0() { return cIconKeyword_6_0; }

		//icon=STRING
		public Assignment getIconAssignment_6_1() { return cIconAssignment_6_1; }

		//STRING
		public RuleCall getIconSTRINGTerminalRuleCall_6_1_0() { return cIconSTRINGTerminalRuleCall_6_1_0; }

		//'}'
		public Keyword getRightCurlyBracketKeyword_7() { return cRightCurlyBracketKeyword_7; }
	}

	public class ActionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.Vpdiagram.Action");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cCreateParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cDeleteParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		private final RuleCall cDropParserRuleCall_2 = (RuleCall)cAlternatives.eContents().get(2);
		private final RuleCall cReconnectEdgeParserRuleCall_3 = (RuleCall)cAlternatives.eContents().get(3);
		
		//Action vpdiagram::Action:
		//	Create | Delete | Drop | ReconnectEdge
		@Override public ParserRule getRule() { return rule; }

		//Create | Delete | Drop | ReconnectEdge
		public Alternatives getAlternatives() { return cAlternatives; }

		//Create
		public RuleCall getCreateParserRuleCall_0() { return cCreateParserRuleCall_0; }

		//Delete
		public RuleCall getDeleteParserRuleCall_1() { return cDeleteParserRuleCall_1; }

		//Drop
		public RuleCall getDropParserRuleCall_2() { return cDropParserRuleCall_2; }

		//ReconnectEdge
		public RuleCall getReconnectEdgeParserRuleCall_3() { return cReconnectEdgeParserRuleCall_3; }
	}

	public class CreateElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.Vpdiagram.Create");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cCreateAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cCreateKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cNameAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cNameEStringParserRuleCall_2_0 = (RuleCall)cNameAssignment_2.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Group cGroup_4 = (Group)cGroup.eContents().get(4);
		private final Keyword cPreconditionKeyword_4_0 = (Keyword)cGroup_4.eContents().get(0);
		private final Assignment cPreconditionAssignment_4_1 = (Assignment)cGroup_4.eContents().get(1);
		private final RuleCall cPreconditionEStringParserRuleCall_4_1_0 = (RuleCall)cPreconditionAssignment_4_1.eContents().get(0);
		private final Group cGroup_5 = (Group)cGroup.eContents().get(5);
		private final Keyword cLabelKeyword_5_0 = (Keyword)cGroup_5.eContents().get(0);
		private final Assignment cLabelAssignment_5_1 = (Assignment)cGroup_5.eContents().get(1);
		private final RuleCall cLabelSTRINGTerminalRuleCall_5_1_0 = (RuleCall)cLabelAssignment_5_1.eContents().get(0);
		private final Group cGroup_6 = (Group)cGroup.eContents().get(6);
		private final Keyword cActionForKeyword_6_0 = (Keyword)cGroup_6.eContents().get(0);
		private final Assignment cTool_ForAssignment_6_1 = (Assignment)cGroup_6.eContents().get(1);
		private final CrossReference cTool_ForDiagramElementCrossReference_6_1_0 = (CrossReference)cTool_ForAssignment_6_1.eContents().get(0);
		private final RuleCall cTool_ForDiagramElementFQNParserRuleCall_6_1_0_1 = (RuleCall)cTool_ForDiagramElementCrossReference_6_1_0.eContents().get(1);
		private final Assignment cOnlyTheViewAssignment_7 = (Assignment)cGroup.eContents().get(7);
		private final Keyword cOnlyTheViewOnlyViewKeyword_7_0 = (Keyword)cOnlyTheViewAssignment_7.eContents().get(0);
		private final Group cGroup_8 = (Group)cGroup.eContents().get(8);
		private final Keyword cIconKeyword_8_0 = (Keyword)cGroup_8.eContents().get(0);
		private final Assignment cIconAssignment_8_1 = (Assignment)cGroup_8.eContents().get(1);
		private final RuleCall cIconSTRINGTerminalRuleCall_8_1_0 = (RuleCall)cIconAssignment_8_1.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_9 = (Keyword)cGroup.eContents().get(9);
		
		//Create vpdiagram::Action:
		//	{vpdiagram::Create} 'Create' name=EString '{' ('precondition:' precondition=EString)? ('label:' label=STRING)?
		//	('action-for:' tool_For=[vpdiagram::DiagramElement|FQN]) onlyTheView?='only-view'? ('icon:' icon=STRING)? '}'
		@Override public ParserRule getRule() { return rule; }

		//{vpdiagram::Create} 'Create' name=EString '{' ('precondition:' precondition=EString)? ('label:' label=STRING)?
		//('action-for:' tool_For=[vpdiagram::DiagramElement|FQN]) onlyTheView?='only-view'? ('icon:' icon=STRING)? '}'
		public Group getGroup() { return cGroup; }

		//{vpdiagram::Create}
		public Action getCreateAction_0() { return cCreateAction_0; }

		//'Create'
		public Keyword getCreateKeyword_1() { return cCreateKeyword_1; }

		//name=EString
		public Assignment getNameAssignment_2() { return cNameAssignment_2; }

		//EString
		public RuleCall getNameEStringParserRuleCall_2_0() { return cNameEStringParserRuleCall_2_0; }

		//'{'
		public Keyword getLeftCurlyBracketKeyword_3() { return cLeftCurlyBracketKeyword_3; }

		//('precondition:' precondition=EString)?
		public Group getGroup_4() { return cGroup_4; }

		//'precondition:'
		public Keyword getPreconditionKeyword_4_0() { return cPreconditionKeyword_4_0; }

		//precondition=EString
		public Assignment getPreconditionAssignment_4_1() { return cPreconditionAssignment_4_1; }

		//EString
		public RuleCall getPreconditionEStringParserRuleCall_4_1_0() { return cPreconditionEStringParserRuleCall_4_1_0; }

		//('label:' label=STRING)?
		public Group getGroup_5() { return cGroup_5; }

		//'label:'
		public Keyword getLabelKeyword_5_0() { return cLabelKeyword_5_0; }

		//label=STRING
		public Assignment getLabelAssignment_5_1() { return cLabelAssignment_5_1; }

		//STRING
		public RuleCall getLabelSTRINGTerminalRuleCall_5_1_0() { return cLabelSTRINGTerminalRuleCall_5_1_0; }

		//('action-for:' tool_For=[vpdiagram::DiagramElement|FQN])
		public Group getGroup_6() { return cGroup_6; }

		//'action-for:'
		public Keyword getActionForKeyword_6_0() { return cActionForKeyword_6_0; }

		//tool_For=[vpdiagram::DiagramElement|FQN]
		public Assignment getTool_ForAssignment_6_1() { return cTool_ForAssignment_6_1; }

		//[vpdiagram::DiagramElement|FQN]
		public CrossReference getTool_ForDiagramElementCrossReference_6_1_0() { return cTool_ForDiagramElementCrossReference_6_1_0; }

		//FQN
		public RuleCall getTool_ForDiagramElementFQNParserRuleCall_6_1_0_1() { return cTool_ForDiagramElementFQNParserRuleCall_6_1_0_1; }

		//onlyTheView?='only-view'?
		public Assignment getOnlyTheViewAssignment_7() { return cOnlyTheViewAssignment_7; }

		//'only-view'
		public Keyword getOnlyTheViewOnlyViewKeyword_7_0() { return cOnlyTheViewOnlyViewKeyword_7_0; }

		//('icon:' icon=STRING)?
		public Group getGroup_8() { return cGroup_8; }

		//'icon:'
		public Keyword getIconKeyword_8_0() { return cIconKeyword_8_0; }

		//icon=STRING
		public Assignment getIconAssignment_8_1() { return cIconAssignment_8_1; }

		//STRING
		public RuleCall getIconSTRINGTerminalRuleCall_8_1_0() { return cIconSTRINGTerminalRuleCall_8_1_0; }

		//'}'
		public Keyword getRightCurlyBracketKeyword_9() { return cRightCurlyBracketKeyword_9; }
	}

	public class DeleteElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.Vpdiagram.Delete");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cDeleteAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cDeleteKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cNameAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cNameEStringParserRuleCall_2_0 = (RuleCall)cNameAssignment_2.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Group cGroup_4 = (Group)cGroup.eContents().get(4);
		private final Keyword cPreconditionKeyword_4_0 = (Keyword)cGroup_4.eContents().get(0);
		private final Assignment cPreconditionAssignment_4_1 = (Assignment)cGroup_4.eContents().get(1);
		private final RuleCall cPreconditionEStringParserRuleCall_4_1_0 = (RuleCall)cPreconditionAssignment_4_1.eContents().get(0);
		private final Group cGroup_5 = (Group)cGroup.eContents().get(5);
		private final Keyword cLabelKeyword_5_0 = (Keyword)cGroup_5.eContents().get(0);
		private final Assignment cLabelAssignment_5_1 = (Assignment)cGroup_5.eContents().get(1);
		private final RuleCall cLabelSTRINGTerminalRuleCall_5_1_0 = (RuleCall)cLabelAssignment_5_1.eContents().get(0);
		private final Group cGroup_6 = (Group)cGroup.eContents().get(6);
		private final Keyword cActionForKeyword_6_0 = (Keyword)cGroup_6.eContents().get(0);
		private final Assignment cTool_ForAssignment_6_1 = (Assignment)cGroup_6.eContents().get(1);
		private final CrossReference cTool_ForDiagramElementCrossReference_6_1_0 = (CrossReference)cTool_ForAssignment_6_1.eContents().get(0);
		private final RuleCall cTool_ForDiagramElementFQNParserRuleCall_6_1_0_1 = (RuleCall)cTool_ForDiagramElementCrossReference_6_1_0.eContents().get(1);
		private final Keyword cRightCurlyBracketKeyword_7 = (Keyword)cGroup.eContents().get(7);
		
		//Delete vpdiagram::Action:
		//	{vpdiagram::Delete} 'Delete' name=EString '{' ('precondition:' precondition=EString)? ('label:' label=STRING)?
		//	('action-for:' tool_For=[vpdiagram::DiagramElement|FQN]) '}'
		@Override public ParserRule getRule() { return rule; }

		//{vpdiagram::Delete} 'Delete' name=EString '{' ('precondition:' precondition=EString)? ('label:' label=STRING)?
		//('action-for:' tool_For=[vpdiagram::DiagramElement|FQN]) '}'
		public Group getGroup() { return cGroup; }

		//{vpdiagram::Delete}
		public Action getDeleteAction_0() { return cDeleteAction_0; }

		//'Delete'
		public Keyword getDeleteKeyword_1() { return cDeleteKeyword_1; }

		//name=EString
		public Assignment getNameAssignment_2() { return cNameAssignment_2; }

		//EString
		public RuleCall getNameEStringParserRuleCall_2_0() { return cNameEStringParserRuleCall_2_0; }

		//'{'
		public Keyword getLeftCurlyBracketKeyword_3() { return cLeftCurlyBracketKeyword_3; }

		//('precondition:' precondition=EString)?
		public Group getGroup_4() { return cGroup_4; }

		//'precondition:'
		public Keyword getPreconditionKeyword_4_0() { return cPreconditionKeyword_4_0; }

		//precondition=EString
		public Assignment getPreconditionAssignment_4_1() { return cPreconditionAssignment_4_1; }

		//EString
		public RuleCall getPreconditionEStringParserRuleCall_4_1_0() { return cPreconditionEStringParserRuleCall_4_1_0; }

		//('label:' label=STRING)?
		public Group getGroup_5() { return cGroup_5; }

		//'label:'
		public Keyword getLabelKeyword_5_0() { return cLabelKeyword_5_0; }

		//label=STRING
		public Assignment getLabelAssignment_5_1() { return cLabelAssignment_5_1; }

		//STRING
		public RuleCall getLabelSTRINGTerminalRuleCall_5_1_0() { return cLabelSTRINGTerminalRuleCall_5_1_0; }

		//('action-for:' tool_For=[vpdiagram::DiagramElement|FQN])
		public Group getGroup_6() { return cGroup_6; }

		//'action-for:'
		public Keyword getActionForKeyword_6_0() { return cActionForKeyword_6_0; }

		//tool_For=[vpdiagram::DiagramElement|FQN]
		public Assignment getTool_ForAssignment_6_1() { return cTool_ForAssignment_6_1; }

		//[vpdiagram::DiagramElement|FQN]
		public CrossReference getTool_ForDiagramElementCrossReference_6_1_0() { return cTool_ForDiagramElementCrossReference_6_1_0; }

		//FQN
		public RuleCall getTool_ForDiagramElementFQNParserRuleCall_6_1_0_1() { return cTool_ForDiagramElementFQNParserRuleCall_6_1_0_1; }

		//'}'
		public Keyword getRightCurlyBracketKeyword_7() { return cRightCurlyBracketKeyword_7; }
	}

	public class DropElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.Vpdiagram.Drop");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cDropAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cDropKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cNameAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cNameEStringParserRuleCall_2_0 = (RuleCall)cNameAssignment_2.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Group cGroup_4 = (Group)cGroup.eContents().get(4);
		private final Keyword cPreconditionKeyword_4_0 = (Keyword)cGroup_4.eContents().get(0);
		private final Assignment cPreconditionAssignment_4_1 = (Assignment)cGroup_4.eContents().get(1);
		private final RuleCall cPreconditionEStringParserRuleCall_4_1_0 = (RuleCall)cPreconditionAssignment_4_1.eContents().get(0);
		private final Group cGroup_5 = (Group)cGroup.eContents().get(5);
		private final Keyword cLabelKeyword_5_0 = (Keyword)cGroup_5.eContents().get(0);
		private final Assignment cLabelAssignment_5_1 = (Assignment)cGroup_5.eContents().get(1);
		private final RuleCall cLabelSTRINGTerminalRuleCall_5_1_0 = (RuleCall)cLabelAssignment_5_1.eContents().get(0);
		private final Group cGroup_6 = (Group)cGroup.eContents().get(6);
		private final Keyword cActionForKeyword_6_0 = (Keyword)cGroup_6.eContents().get(0);
		private final Assignment cTool_ForAssignment_6_1 = (Assignment)cGroup_6.eContents().get(1);
		private final CrossReference cTool_ForDiagramElementCrossReference_6_1_0 = (CrossReference)cTool_ForAssignment_6_1.eContents().get(0);
		private final RuleCall cTool_ForDiagramElementFQNParserRuleCall_6_1_0_1 = (RuleCall)cTool_ForDiagramElementCrossReference_6_1_0.eContents().get(1);
		private final Keyword cRightCurlyBracketKeyword_7 = (Keyword)cGroup.eContents().get(7);
		
		//Drop vpdiagram::Action:
		//	{vpdiagram::Drop} 'Drop' name=EString '{' ('precondition:' precondition=EString)? ('label:' label=STRING)?
		//	('action-for:' tool_For=[vpdiagram::DiagramElement|FQN]) '}'
		@Override public ParserRule getRule() { return rule; }

		//{vpdiagram::Drop} 'Drop' name=EString '{' ('precondition:' precondition=EString)? ('label:' label=STRING)?
		//('action-for:' tool_For=[vpdiagram::DiagramElement|FQN]) '}'
		public Group getGroup() { return cGroup; }

		//{vpdiagram::Drop}
		public Action getDropAction_0() { return cDropAction_0; }

		//'Drop'
		public Keyword getDropKeyword_1() { return cDropKeyword_1; }

		//name=EString
		public Assignment getNameAssignment_2() { return cNameAssignment_2; }

		//EString
		public RuleCall getNameEStringParserRuleCall_2_0() { return cNameEStringParserRuleCall_2_0; }

		//'{'
		public Keyword getLeftCurlyBracketKeyword_3() { return cLeftCurlyBracketKeyword_3; }

		//('precondition:' precondition=EString)?
		public Group getGroup_4() { return cGroup_4; }

		//'precondition:'
		public Keyword getPreconditionKeyword_4_0() { return cPreconditionKeyword_4_0; }

		//precondition=EString
		public Assignment getPreconditionAssignment_4_1() { return cPreconditionAssignment_4_1; }

		//EString
		public RuleCall getPreconditionEStringParserRuleCall_4_1_0() { return cPreconditionEStringParserRuleCall_4_1_0; }

		//('label:' label=STRING)?
		public Group getGroup_5() { return cGroup_5; }

		//'label:'
		public Keyword getLabelKeyword_5_0() { return cLabelKeyword_5_0; }

		//label=STRING
		public Assignment getLabelAssignment_5_1() { return cLabelAssignment_5_1; }

		//STRING
		public RuleCall getLabelSTRINGTerminalRuleCall_5_1_0() { return cLabelSTRINGTerminalRuleCall_5_1_0; }

		//('action-for:' tool_For=[vpdiagram::DiagramElement|FQN])
		public Group getGroup_6() { return cGroup_6; }

		//'action-for:'
		public Keyword getActionForKeyword_6_0() { return cActionForKeyword_6_0; }

		//tool_For=[vpdiagram::DiagramElement|FQN]
		public Assignment getTool_ForAssignment_6_1() { return cTool_ForAssignment_6_1; }

		//[vpdiagram::DiagramElement|FQN]
		public CrossReference getTool_ForDiagramElementCrossReference_6_1_0() { return cTool_ForDiagramElementCrossReference_6_1_0; }

		//FQN
		public RuleCall getTool_ForDiagramElementFQNParserRuleCall_6_1_0_1() { return cTool_ForDiagramElementFQNParserRuleCall_6_1_0_1; }

		//'}'
		public Keyword getRightCurlyBracketKeyword_7() { return cRightCurlyBracketKeyword_7; }
	}

	public class ReconnectEdgeElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.Vpdiagram.ReconnectEdge");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cReconnectEdgeAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cReconnectEdgeKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cNameAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cNameEStringParserRuleCall_2_0 = (RuleCall)cNameAssignment_2.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Group cGroup_4 = (Group)cGroup.eContents().get(4);
		private final Keyword cPreconditionKeyword_4_0 = (Keyword)cGroup_4.eContents().get(0);
		private final Assignment cPreconditionAssignment_4_1 = (Assignment)cGroup_4.eContents().get(1);
		private final RuleCall cPreconditionEStringParserRuleCall_4_1_0 = (RuleCall)cPreconditionAssignment_4_1.eContents().get(0);
		private final Group cGroup_5 = (Group)cGroup.eContents().get(5);
		private final Keyword cLabelKeyword_5_0 = (Keyword)cGroup_5.eContents().get(0);
		private final Assignment cLabelAssignment_5_1 = (Assignment)cGroup_5.eContents().get(1);
		private final RuleCall cLabelSTRINGTerminalRuleCall_5_1_0 = (RuleCall)cLabelAssignment_5_1.eContents().get(0);
		private final Group cGroup_6 = (Group)cGroup.eContents().get(6);
		private final Keyword cActionForKeyword_6_0 = (Keyword)cGroup_6.eContents().get(0);
		private final Assignment cTool_ForAssignment_6_1 = (Assignment)cGroup_6.eContents().get(1);
		private final CrossReference cTool_ForDiagramElementCrossReference_6_1_0 = (CrossReference)cTool_ForAssignment_6_1.eContents().get(0);
		private final RuleCall cTool_ForDiagramElementFQNParserRuleCall_6_1_0_1 = (RuleCall)cTool_ForDiagramElementCrossReference_6_1_0.eContents().get(1);
		private final Keyword cRightCurlyBracketKeyword_7 = (Keyword)cGroup.eContents().get(7);
		
		//ReconnectEdge vpdiagram::Action:
		//	{vpdiagram::ReconnectEdge} 'ReconnectEdge' name=EString '{' ('precondition:' precondition=EString)? ('label:'
		//	label=STRING)? ('action-for:' tool_For=[vpdiagram::DiagramElement|FQN]) '}'
		@Override public ParserRule getRule() { return rule; }

		//{vpdiagram::ReconnectEdge} 'ReconnectEdge' name=EString '{' ('precondition:' precondition=EString)? ('label:'
		//label=STRING)? ('action-for:' tool_For=[vpdiagram::DiagramElement|FQN]) '}'
		public Group getGroup() { return cGroup; }

		//{vpdiagram::ReconnectEdge}
		public Action getReconnectEdgeAction_0() { return cReconnectEdgeAction_0; }

		//'ReconnectEdge'
		public Keyword getReconnectEdgeKeyword_1() { return cReconnectEdgeKeyword_1; }

		//name=EString
		public Assignment getNameAssignment_2() { return cNameAssignment_2; }

		//EString
		public RuleCall getNameEStringParserRuleCall_2_0() { return cNameEStringParserRuleCall_2_0; }

		//'{'
		public Keyword getLeftCurlyBracketKeyword_3() { return cLeftCurlyBracketKeyword_3; }

		//('precondition:' precondition=EString)?
		public Group getGroup_4() { return cGroup_4; }

		//'precondition:'
		public Keyword getPreconditionKeyword_4_0() { return cPreconditionKeyword_4_0; }

		//precondition=EString
		public Assignment getPreconditionAssignment_4_1() { return cPreconditionAssignment_4_1; }

		//EString
		public RuleCall getPreconditionEStringParserRuleCall_4_1_0() { return cPreconditionEStringParserRuleCall_4_1_0; }

		//('label:' label=STRING)?
		public Group getGroup_5() { return cGroup_5; }

		//'label:'
		public Keyword getLabelKeyword_5_0() { return cLabelKeyword_5_0; }

		//label=STRING
		public Assignment getLabelAssignment_5_1() { return cLabelAssignment_5_1; }

		//STRING
		public RuleCall getLabelSTRINGTerminalRuleCall_5_1_0() { return cLabelSTRINGTerminalRuleCall_5_1_0; }

		//('action-for:' tool_For=[vpdiagram::DiagramElement|FQN])
		public Group getGroup_6() { return cGroup_6; }

		//'action-for:'
		public Keyword getActionForKeyword_6_0() { return cActionForKeyword_6_0; }

		//tool_For=[vpdiagram::DiagramElement|FQN]
		public Assignment getTool_ForAssignment_6_1() { return cTool_ForAssignment_6_1; }

		//[vpdiagram::DiagramElement|FQN]
		public CrossReference getTool_ForDiagramElementCrossReference_6_1_0() { return cTool_ForDiagramElementCrossReference_6_1_0; }

		//FQN
		public RuleCall getTool_ForDiagramElementFQNParserRuleCall_6_1_0_1() { return cTool_ForDiagramElementFQNParserRuleCall_6_1_0_1; }

		//'}'
		public Keyword getRightCurlyBracketKeyword_7() { return cRightCurlyBracketKeyword_7; }
	}

	public class DomainContainerElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.Vpdiagram.DomainContainer");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cDomainContainerAction_0 = (Action)cGroup.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Keyword cDomainContextKeyword_1_0 = (Keyword)cGroup_1.eContents().get(0);
		private final Assignment cThe_domainAssignment_1_1 = (Assignment)cGroup_1.eContents().get(1);
		private final RuleCall cThe_domainAbstractClassParserRuleCall_1_1_0 = (RuleCall)cThe_domainAssignment_1_1.eContents().get(0);
		
		//DomainContainer vpdiagram::DomainContainer:
		//	{vpdiagram::DomainContainer} ('domain-context:' the_domain=AbstractClass)
		@Override public ParserRule getRule() { return rule; }

		//{vpdiagram::DomainContainer} ('domain-context:' the_domain=AbstractClass)
		public Group getGroup() { return cGroup; }

		//{vpdiagram::DomainContainer}
		public Action getDomainContainerAction_0() { return cDomainContainerAction_0; }

		//('domain-context:' the_domain=AbstractClass)
		public Group getGroup_1() { return cGroup_1; }

		//'domain-context:'
		public Keyword getDomainContextKeyword_1_0() { return cDomainContextKeyword_1_0; }

		//the_domain=AbstractClass
		public Assignment getThe_domainAssignment_1_1() { return cThe_domainAssignment_1_1; }

		//AbstractClass
		public RuleCall getThe_domainAbstractClassParserRuleCall_1_1_0() { return cThe_domainAbstractClassParserRuleCall_1_1_0; }
	}

	public class EdgeElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.Vpdiagram.Edge");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cEdgeAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cEdgeKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cNameAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cNameEStringParserRuleCall_2_0 = (RuleCall)cNameAssignment_2.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Alternatives cAlternatives_4 = (Alternatives)cGroup.eContents().get(4);
		private final Group cGroup_4_0 = (Group)cAlternatives_4.eContents().get(0);
		private final Keyword cAssociationContextKeyword_4_0_0 = (Keyword)cGroup_4_0.eContents().get(0);
		private final Assignment cThe_domainAssignment_4_0_1 = (Assignment)cGroup_4_0.eContents().get(1);
		private final RuleCall cThe_domainEdgeDomainAssociationParserRuleCall_4_0_1_0 = (RuleCall)cThe_domainAssignment_4_0_1.eContents().get(0);
		private final Group cGroup_4_1 = (Group)cAlternatives_4.eContents().get(1);
		private final Keyword cClassAssociationContextKeyword_4_1_0 = (Keyword)cGroup_4_1.eContents().get(0);
		private final Assignment cThe_domainAssignment_4_1_1 = (Assignment)cGroup_4_1.eContents().get(1);
		private final RuleCall cThe_domainEdgeDomainElementParserRuleCall_4_1_1_0 = (RuleCall)cThe_domainAssignment_4_1_1.eContents().get(0);
		private final Assignment cSynchronizationModeAssignment_5 = (Assignment)cGroup.eContents().get(5);
		private final RuleCall cSynchronizationModeSynchronizationModeEnumRuleCall_5_0 = (RuleCall)cSynchronizationModeAssignment_5.eContents().get(0);
		private final Group cGroup_6 = (Group)cGroup.eContents().get(6);
		private final Keyword cSourceKeyword_6_0 = (Keyword)cGroup_6.eContents().get(0);
		private final Assignment cSourceAssignment_6_1 = (Assignment)cGroup_6.eContents().get(1);
		private final CrossReference cSourceDiagramElementCrossReference_6_1_0 = (CrossReference)cSourceAssignment_6_1.eContents().get(0);
		private final RuleCall cSourceDiagramElementFQNParserRuleCall_6_1_0_1 = (RuleCall)cSourceDiagramElementCrossReference_6_1_0.eContents().get(1);
		private final Group cGroup_6_2 = (Group)cGroup_6.eContents().get(2);
		private final Keyword cCommaKeyword_6_2_0 = (Keyword)cGroup_6_2.eContents().get(0);
		private final Assignment cSourceAssignment_6_2_1 = (Assignment)cGroup_6_2.eContents().get(1);
		private final CrossReference cSourceDiagramElementCrossReference_6_2_1_0 = (CrossReference)cSourceAssignment_6_2_1.eContents().get(0);
		private final RuleCall cSourceDiagramElementFQNParserRuleCall_6_2_1_0_1 = (RuleCall)cSourceDiagramElementCrossReference_6_2_1_0.eContents().get(1);
		private final Group cGroup_7 = (Group)cGroup.eContents().get(7);
		private final Keyword cTargetKeyword_7_0 = (Keyword)cGroup_7.eContents().get(0);
		private final Assignment cTargetAssignment_7_1 = (Assignment)cGroup_7.eContents().get(1);
		private final CrossReference cTargetDiagramElementCrossReference_7_1_0 = (CrossReference)cTargetAssignment_7_1.eContents().get(0);
		private final RuleCall cTargetDiagramElementFQNParserRuleCall_7_1_0_1 = (RuleCall)cTargetDiagramElementCrossReference_7_1_0.eContents().get(1);
		private final Group cGroup_7_2 = (Group)cGroup_7.eContents().get(2);
		private final Keyword cCommaKeyword_7_2_0 = (Keyword)cGroup_7_2.eContents().get(0);
		private final Assignment cTargetAssignment_7_2_1 = (Assignment)cGroup_7_2.eContents().get(1);
		private final CrossReference cTargetDiagramElementCrossReference_7_2_1_0 = (CrossReference)cTargetAssignment_7_2_1.eContents().get(0);
		private final RuleCall cTargetDiagramElementFQNParserRuleCall_7_2_1_0_1 = (RuleCall)cTargetDiagramElementCrossReference_7_2_1_0.eContents().get(1);
		private final Assignment cE_descriptionAssignment_8 = (Assignment)cGroup.eContents().get(8);
		private final RuleCall cE_descriptionEdgeDescriptionParserRuleCall_8_0 = (RuleCall)cE_descriptionAssignment_8.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_9 = (Keyword)cGroup.eContents().get(9);
		
		//Edge vpdiagram::AbstractEdge:
		//	{vpdiagram::Edge} 'Edge' name=EString '{' ('association-context:' the_domain=EdgeDomainAssociation |
		//	'class-association-context:' the_domain=EdgeDomainElement) synchronizationMode=SynchronizationMode? ('source:'
		//	source+=[vpdiagram::DiagramElement|FQN] (',' source+=[vpdiagram::DiagramElement|FQN])*) ('target:'
		//	target+=[vpdiagram::DiagramElement|FQN] (',' target+=[vpdiagram::DiagramElement|FQN])*)
		//	e_description+=EdgeDescription* '}'
		@Override public ParserRule getRule() { return rule; }

		//{vpdiagram::Edge} 'Edge' name=EString '{' ('association-context:' the_domain=EdgeDomainAssociation |
		//'class-association-context:' the_domain=EdgeDomainElement) synchronizationMode=SynchronizationMode? ('source:'
		//source+=[vpdiagram::DiagramElement|FQN] (',' source+=[vpdiagram::DiagramElement|FQN])*) ('target:'
		//target+=[vpdiagram::DiagramElement|FQN] (',' target+=[vpdiagram::DiagramElement|FQN])*)
		//e_description+=EdgeDescription* '}'
		public Group getGroup() { return cGroup; }

		//{vpdiagram::Edge}
		public Action getEdgeAction_0() { return cEdgeAction_0; }

		//'Edge'
		public Keyword getEdgeKeyword_1() { return cEdgeKeyword_1; }

		//name=EString
		public Assignment getNameAssignment_2() { return cNameAssignment_2; }

		//EString
		public RuleCall getNameEStringParserRuleCall_2_0() { return cNameEStringParserRuleCall_2_0; }

		//'{'
		public Keyword getLeftCurlyBracketKeyword_3() { return cLeftCurlyBracketKeyword_3; }

		//('association-context:' the_domain=EdgeDomainAssociation | 'class-association-context:' the_domain=EdgeDomainElement)
		public Alternatives getAlternatives_4() { return cAlternatives_4; }

		//'association-context:' the_domain=EdgeDomainAssociation
		public Group getGroup_4_0() { return cGroup_4_0; }

		//'association-context:'
		public Keyword getAssociationContextKeyword_4_0_0() { return cAssociationContextKeyword_4_0_0; }

		//the_domain=EdgeDomainAssociation
		public Assignment getThe_domainAssignment_4_0_1() { return cThe_domainAssignment_4_0_1; }

		//EdgeDomainAssociation
		public RuleCall getThe_domainEdgeDomainAssociationParserRuleCall_4_0_1_0() { return cThe_domainEdgeDomainAssociationParserRuleCall_4_0_1_0; }

		//'class-association-context:' the_domain=EdgeDomainElement
		public Group getGroup_4_1() { return cGroup_4_1; }

		//'class-association-context:'
		public Keyword getClassAssociationContextKeyword_4_1_0() { return cClassAssociationContextKeyword_4_1_0; }

		//the_domain=EdgeDomainElement
		public Assignment getThe_domainAssignment_4_1_1() { return cThe_domainAssignment_4_1_1; }

		//EdgeDomainElement
		public RuleCall getThe_domainEdgeDomainElementParserRuleCall_4_1_1_0() { return cThe_domainEdgeDomainElementParserRuleCall_4_1_1_0; }

		//synchronizationMode=SynchronizationMode?
		public Assignment getSynchronizationModeAssignment_5() { return cSynchronizationModeAssignment_5; }

		//SynchronizationMode
		public RuleCall getSynchronizationModeSynchronizationModeEnumRuleCall_5_0() { return cSynchronizationModeSynchronizationModeEnumRuleCall_5_0; }

		//('source:' source+=[vpdiagram::DiagramElement|FQN] (',' source+=[vpdiagram::DiagramElement|FQN])*)
		public Group getGroup_6() { return cGroup_6; }

		//'source:'
		public Keyword getSourceKeyword_6_0() { return cSourceKeyword_6_0; }

		//source+=[vpdiagram::DiagramElement|FQN]
		public Assignment getSourceAssignment_6_1() { return cSourceAssignment_6_1; }

		//[vpdiagram::DiagramElement|FQN]
		public CrossReference getSourceDiagramElementCrossReference_6_1_0() { return cSourceDiagramElementCrossReference_6_1_0; }

		//FQN
		public RuleCall getSourceDiagramElementFQNParserRuleCall_6_1_0_1() { return cSourceDiagramElementFQNParserRuleCall_6_1_0_1; }

		//(',' source+=[vpdiagram::DiagramElement|FQN])*
		public Group getGroup_6_2() { return cGroup_6_2; }

		//','
		public Keyword getCommaKeyword_6_2_0() { return cCommaKeyword_6_2_0; }

		//source+=[vpdiagram::DiagramElement|FQN]
		public Assignment getSourceAssignment_6_2_1() { return cSourceAssignment_6_2_1; }

		//[vpdiagram::DiagramElement|FQN]
		public CrossReference getSourceDiagramElementCrossReference_6_2_1_0() { return cSourceDiagramElementCrossReference_6_2_1_0; }

		//FQN
		public RuleCall getSourceDiagramElementFQNParserRuleCall_6_2_1_0_1() { return cSourceDiagramElementFQNParserRuleCall_6_2_1_0_1; }

		//('target:' target+=[vpdiagram::DiagramElement|FQN] (',' target+=[vpdiagram::DiagramElement|FQN])*)
		public Group getGroup_7() { return cGroup_7; }

		//'target:'
		public Keyword getTargetKeyword_7_0() { return cTargetKeyword_7_0; }

		//target+=[vpdiagram::DiagramElement|FQN]
		public Assignment getTargetAssignment_7_1() { return cTargetAssignment_7_1; }

		//[vpdiagram::DiagramElement|FQN]
		public CrossReference getTargetDiagramElementCrossReference_7_1_0() { return cTargetDiagramElementCrossReference_7_1_0; }

		//FQN
		public RuleCall getTargetDiagramElementFQNParserRuleCall_7_1_0_1() { return cTargetDiagramElementFQNParserRuleCall_7_1_0_1; }

		//(',' target+=[vpdiagram::DiagramElement|FQN])*
		public Group getGroup_7_2() { return cGroup_7_2; }

		//','
		public Keyword getCommaKeyword_7_2_0() { return cCommaKeyword_7_2_0; }

		//target+=[vpdiagram::DiagramElement|FQN]
		public Assignment getTargetAssignment_7_2_1() { return cTargetAssignment_7_2_1; }

		//[vpdiagram::DiagramElement|FQN]
		public CrossReference getTargetDiagramElementCrossReference_7_2_1_0() { return cTargetDiagramElementCrossReference_7_2_1_0; }

		//FQN
		public RuleCall getTargetDiagramElementFQNParserRuleCall_7_2_1_0_1() { return cTargetDiagramElementFQNParserRuleCall_7_2_1_0_1; }

		//e_description+=EdgeDescription*
		public Assignment getE_descriptionAssignment_8() { return cE_descriptionAssignment_8; }

		//EdgeDescription
		public RuleCall getE_descriptionEdgeDescriptionParserRuleCall_8_0() { return cE_descriptionEdgeDescriptionParserRuleCall_8_0; }

		//'}'
		public Keyword getRightCurlyBracketKeyword_9() { return cRightCurlyBracketKeyword_9; }
	}

	public class EdgeImportElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.Vpdiagram.EdgeImport");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cEdgeImportAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cEdgeImportKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cNameAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cNameEStringParserRuleCall_2_0 = (RuleCall)cNameAssignment_2.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Group cGroup_4 = (Group)cGroup.eContents().get(4);
		private final Keyword cImportKeyword_4_0 = (Keyword)cGroup_4.eContents().get(0);
		private final Assignment cImportsAssignment_4_1 = (Assignment)cGroup_4.eContents().get(1);
		private final CrossReference cImportsEdgeMappingCrossReference_4_1_0 = (CrossReference)cImportsAssignment_4_1.eContents().get(0);
		private final RuleCall cImportsEdgeMappingFQNParserRuleCall_4_1_0_1 = (RuleCall)cImportsEdgeMappingCrossReference_4_1_0.eContents().get(1);
		private final Assignment cSynchronizationModeAssignment_5 = (Assignment)cGroup.eContents().get(5);
		private final RuleCall cSynchronizationModeSynchronizationModeEnumRuleCall_5_0 = (RuleCall)cSynchronizationModeAssignment_5.eContents().get(0);
		private final Assignment cE_descriptionAssignment_6 = (Assignment)cGroup.eContents().get(6);
		private final RuleCall cE_descriptionEdgeDescriptionParserRuleCall_6_0 = (RuleCall)cE_descriptionAssignment_6.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_7 = (Keyword)cGroup.eContents().get(7);
		
		//EdgeImport vpdiagram::AbstractEdge:
		//	{vpdiagram::EdgeImport} 'EdgeImport' name=EString '{' ('import:' imports=[siriusDiagramDescription::EdgeMapping|FQN])
		//	synchronizationMode=SynchronizationMode? e_description+=EdgeDescription* '}'
		@Override public ParserRule getRule() { return rule; }

		//{vpdiagram::EdgeImport} 'EdgeImport' name=EString '{' ('import:' imports=[siriusDiagramDescription::EdgeMapping|FQN])
		//synchronizationMode=SynchronizationMode? e_description+=EdgeDescription* '}'
		public Group getGroup() { return cGroup; }

		//{vpdiagram::EdgeImport}
		public Action getEdgeImportAction_0() { return cEdgeImportAction_0; }

		//'EdgeImport'
		public Keyword getEdgeImportKeyword_1() { return cEdgeImportKeyword_1; }

		//name=EString
		public Assignment getNameAssignment_2() { return cNameAssignment_2; }

		//EString
		public RuleCall getNameEStringParserRuleCall_2_0() { return cNameEStringParserRuleCall_2_0; }

		//'{'
		public Keyword getLeftCurlyBracketKeyword_3() { return cLeftCurlyBracketKeyword_3; }

		//('import:' imports=[siriusDiagramDescription::EdgeMapping|FQN])
		public Group getGroup_4() { return cGroup_4; }

		//'import:'
		public Keyword getImportKeyword_4_0() { return cImportKeyword_4_0; }

		//imports=[siriusDiagramDescription::EdgeMapping|FQN]
		public Assignment getImportsAssignment_4_1() { return cImportsAssignment_4_1; }

		//[siriusDiagramDescription::EdgeMapping|FQN]
		public CrossReference getImportsEdgeMappingCrossReference_4_1_0() { return cImportsEdgeMappingCrossReference_4_1_0; }

		//FQN
		public RuleCall getImportsEdgeMappingFQNParserRuleCall_4_1_0_1() { return cImportsEdgeMappingFQNParserRuleCall_4_1_0_1; }

		//synchronizationMode=SynchronizationMode?
		public Assignment getSynchronizationModeAssignment_5() { return cSynchronizationModeAssignment_5; }

		//SynchronizationMode
		public RuleCall getSynchronizationModeSynchronizationModeEnumRuleCall_5_0() { return cSynchronizationModeSynchronizationModeEnumRuleCall_5_0; }

		//e_description+=EdgeDescription*
		public Assignment getE_descriptionAssignment_6() { return cE_descriptionAssignment_6; }

		//EdgeDescription
		public RuleCall getE_descriptionEdgeDescriptionParserRuleCall_6_0() { return cE_descriptionEdgeDescriptionParserRuleCall_6_0; }

		//'}'
		public Keyword getRightCurlyBracketKeyword_7() { return cRightCurlyBracketKeyword_7; }
	}

	public class EdgeDomainAssociationElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.Vpdiagram.EdgeDomainAssociation");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cEdgeDomainAssociationAction_0 = (Action)cGroup.eContents().get(0);
		private final Alternatives cAlternatives_1 = (Alternatives)cGroup.eContents().get(1);
		private final Group cGroup_1_0 = (Group)cAlternatives_1.eContents().get(0);
		private final Keyword cQueryKeyword_1_0_0 = (Keyword)cGroup_1_0.eContents().get(0);
		private final Assignment cTarget_queryAssignment_1_0_1 = (Assignment)cGroup_1_0.eContents().get(1);
		private final RuleCall cTarget_querySTRINGTerminalRuleCall_1_0_1_0 = (RuleCall)cTarget_queryAssignment_1_0_1.eContents().get(0);
		private final Assignment cTarget_LocatorAssignment_1_1 = (Assignment)cAlternatives_1.eContents().get(1);
		private final RuleCall cTarget_LocatorAbstractAssociation2ParserRuleCall_1_1_0 = (RuleCall)cTarget_LocatorAssignment_1_1.eContents().get(0);
		
		//EdgeDomainAssociation vpdiagram::EdgeDomainAssociation:
		//	{vpdiagram::EdgeDomainAssociation} ('query:' target_query=STRING | target_Locator=AbstractAssociation2)
		@Override public ParserRule getRule() { return rule; }

		//{vpdiagram::EdgeDomainAssociation} ('query:' target_query=STRING | target_Locator=AbstractAssociation2)
		public Group getGroup() { return cGroup; }

		//{vpdiagram::EdgeDomainAssociation}
		public Action getEdgeDomainAssociationAction_0() { return cEdgeDomainAssociationAction_0; }

		//('query:' target_query=STRING | target_Locator=AbstractAssociation2)
		public Alternatives getAlternatives_1() { return cAlternatives_1; }

		//'query:' target_query=STRING
		public Group getGroup_1_0() { return cGroup_1_0; }

		//'query:'
		public Keyword getQueryKeyword_1_0_0() { return cQueryKeyword_1_0_0; }

		//target_query=STRING
		public Assignment getTarget_queryAssignment_1_0_1() { return cTarget_queryAssignment_1_0_1; }

		//STRING
		public RuleCall getTarget_querySTRINGTerminalRuleCall_1_0_1_0() { return cTarget_querySTRINGTerminalRuleCall_1_0_1_0; }

		//target_Locator=AbstractAssociation2
		public Assignment getTarget_LocatorAssignment_1_1() { return cTarget_LocatorAssignment_1_1; }

		//AbstractAssociation2
		public RuleCall getTarget_LocatorAbstractAssociation2ParserRuleCall_1_1_0() { return cTarget_LocatorAbstractAssociation2ParserRuleCall_1_1_0; }
	}

	public class EdgeDomainElementElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.Vpdiagram.EdgeDomainElement");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cEdgeDomainElementAction_0 = (Action)cGroup.eContents().get(0);
		private final Assignment cThe_DomainAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cThe_DomainAbstractClassParserRuleCall_1_0 = (RuleCall)cThe_DomainAssignment_1.eContents().get(0);
		private final Alternatives cAlternatives_2 = (Alternatives)cGroup.eContents().get(2);
		private final Group cGroup_2_0 = (Group)cAlternatives_2.eContents().get(0);
		private final Keyword cTargetQueryKeyword_2_0_0 = (Keyword)cGroup_2_0.eContents().get(0);
		private final Assignment cTarget_queryAssignment_2_0_1 = (Assignment)cGroup_2_0.eContents().get(1);
		private final RuleCall cTarget_querySTRINGTerminalRuleCall_2_0_1_0 = (RuleCall)cTarget_queryAssignment_2_0_1.eContents().get(0);
		private final Group cGroup_2_1 = (Group)cAlternatives_2.eContents().get(1);
		private final Keyword cTargetAssociationKeyword_2_1_0 = (Keyword)cGroup_2_1.eContents().get(0);
		private final Assignment cTarget_LocatorAssignment_2_1_1 = (Assignment)cGroup_2_1.eContents().get(1);
		private final RuleCall cTarget_LocatorAbstractAssociation2ParserRuleCall_2_1_1_0 = (RuleCall)cTarget_LocatorAssignment_2_1_1.eContents().get(0);
		private final Alternatives cAlternatives_3 = (Alternatives)cGroup.eContents().get(3);
		private final Group cGroup_3_0 = (Group)cAlternatives_3.eContents().get(0);
		private final Keyword cSourceQueryKeyword_3_0_0 = (Keyword)cGroup_3_0.eContents().get(0);
		private final Assignment cSource_queryAssignment_3_0_1 = (Assignment)cGroup_3_0.eContents().get(1);
		private final RuleCall cSource_querySTRINGTerminalRuleCall_3_0_1_0 = (RuleCall)cSource_queryAssignment_3_0_1.eContents().get(0);
		private final Group cGroup_3_1 = (Group)cAlternatives_3.eContents().get(1);
		private final Keyword cSourceAssociationKeyword_3_1_0 = (Keyword)cGroup_3_1.eContents().get(0);
		private final Assignment cSource_LocatorAssignment_3_1_1 = (Assignment)cGroup_3_1.eContents().get(1);
		private final RuleCall cSource_LocatorAbstractAssociation2ParserRuleCall_3_1_1_0 = (RuleCall)cSource_LocatorAssignment_3_1_1.eContents().get(0);
		
		//EdgeDomainElement vpdiagram::EdgeDomainAssociation:
		//	{vpdiagram::EdgeDomainElement} the_Domain=AbstractClass ('target-query:' target_query=STRING | 'target-association:'
		//	target_Locator=AbstractAssociation2) ('source-query:' source_query=STRING | 'source-association:'
		//	source_Locator=AbstractAssociation2)
		@Override public ParserRule getRule() { return rule; }

		//{vpdiagram::EdgeDomainElement} the_Domain=AbstractClass ('target-query:' target_query=STRING | 'target-association:'
		//target_Locator=AbstractAssociation2) ('source-query:' source_query=STRING | 'source-association:'
		//source_Locator=AbstractAssociation2)
		public Group getGroup() { return cGroup; }

		//{vpdiagram::EdgeDomainElement}
		public Action getEdgeDomainElementAction_0() { return cEdgeDomainElementAction_0; }

		//the_Domain=AbstractClass
		public Assignment getThe_DomainAssignment_1() { return cThe_DomainAssignment_1; }

		//AbstractClass
		public RuleCall getThe_DomainAbstractClassParserRuleCall_1_0() { return cThe_DomainAbstractClassParserRuleCall_1_0; }

		//('target-query:' target_query=STRING | 'target-association:' target_Locator=AbstractAssociation2)
		public Alternatives getAlternatives_2() { return cAlternatives_2; }

		//'target-query:' target_query=STRING
		public Group getGroup_2_0() { return cGroup_2_0; }

		//'target-query:'
		public Keyword getTargetQueryKeyword_2_0_0() { return cTargetQueryKeyword_2_0_0; }

		//target_query=STRING
		public Assignment getTarget_queryAssignment_2_0_1() { return cTarget_queryAssignment_2_0_1; }

		//STRING
		public RuleCall getTarget_querySTRINGTerminalRuleCall_2_0_1_0() { return cTarget_querySTRINGTerminalRuleCall_2_0_1_0; }

		//'target-association:' target_Locator=AbstractAssociation2
		public Group getGroup_2_1() { return cGroup_2_1; }

		//'target-association:'
		public Keyword getTargetAssociationKeyword_2_1_0() { return cTargetAssociationKeyword_2_1_0; }

		//target_Locator=AbstractAssociation2
		public Assignment getTarget_LocatorAssignment_2_1_1() { return cTarget_LocatorAssignment_2_1_1; }

		//AbstractAssociation2
		public RuleCall getTarget_LocatorAbstractAssociation2ParserRuleCall_2_1_1_0() { return cTarget_LocatorAbstractAssociation2ParserRuleCall_2_1_1_0; }

		//('source-query:' source_query=STRING | 'source-association:' source_Locator=AbstractAssociation2)
		public Alternatives getAlternatives_3() { return cAlternatives_3; }

		//'source-query:' source_query=STRING
		public Group getGroup_3_0() { return cGroup_3_0; }

		//'source-query:'
		public Keyword getSourceQueryKeyword_3_0_0() { return cSourceQueryKeyword_3_0_0; }

		//source_query=STRING
		public Assignment getSource_queryAssignment_3_0_1() { return cSource_queryAssignment_3_0_1; }

		//STRING
		public RuleCall getSource_querySTRINGTerminalRuleCall_3_0_1_0() { return cSource_querySTRINGTerminalRuleCall_3_0_1_0; }

		//'source-association:' source_Locator=AbstractAssociation2
		public Group getGroup_3_1() { return cGroup_3_1; }

		//'source-association:'
		public Keyword getSourceAssociationKeyword_3_1_0() { return cSourceAssociationKeyword_3_1_0; }

		//source_Locator=AbstractAssociation2
		public Assignment getSource_LocatorAssignment_3_1_1() { return cSource_LocatorAssignment_3_1_1; }

		//AbstractAssociation2
		public RuleCall getSource_LocatorAbstractAssociation2ParserRuleCall_3_1_1_0() { return cSource_LocatorAbstractAssociation2ParserRuleCall_3_1_1_0; }
	}

	public class CustomizationsElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.Vpdiagram.Customizations");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cCustomizationsAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cCustomizationsKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cLeftCurlyBracketKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Group cGroup_3 = (Group)cGroup.eContents().get(3);
		private final Assignment cOwnedCustomizationDescriptionsAssignment_3_0 = (Assignment)cGroup_3.eContents().get(0);
		private final RuleCall cOwnedCustomizationDescriptionsStyleCustomizationDescriptionsParserRuleCall_3_0_0 = (RuleCall)cOwnedCustomizationDescriptionsAssignment_3_0.eContents().get(0);
		private final Assignment cOwnedCustomizationDescriptionsAssignment_3_1 = (Assignment)cGroup_3.eContents().get(1);
		private final RuleCall cOwnedCustomizationDescriptionsStyleCustomizationDescriptionsParserRuleCall_3_1_0 = (RuleCall)cOwnedCustomizationDescriptionsAssignment_3_1.eContents().get(0);
		private final Group cGroup_4 = (Group)cGroup.eContents().get(4);
		private final Assignment cOwnedCustomizationReuseAssignment_4_0 = (Assignment)cGroup_4.eContents().get(0);
		private final RuleCall cOwnedCustomizationReuseStyleCustomizationReuseParserRuleCall_4_0_0 = (RuleCall)cOwnedCustomizationReuseAssignment_4_0.eContents().get(0);
		private final Assignment cOwnedCustomizationReuseAssignment_4_1 = (Assignment)cGroup_4.eContents().get(1);
		private final RuleCall cOwnedCustomizationReuseStyleCustomizationReuseParserRuleCall_4_1_0 = (RuleCall)cOwnedCustomizationReuseAssignment_4_1.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_5 = (Keyword)cGroup.eContents().get(5);
		
		/// **********************************************
		// * 				Style customization
		// ********************************************** /
		//Customizations styleCusto::Customizations:
		//	{styleCusto::Customizations} 'customizations' '{' (ownedCustomizationDescriptions+=StyleCustomizationDescriptions
		//	ownedCustomizationDescriptions+=StyleCustomizationDescriptions*)? (ownedCustomizationReuse+=StyleCustomizationReuse
		//	ownedCustomizationReuse+=StyleCustomizationReuse*)? '}'
		@Override public ParserRule getRule() { return rule; }

		//{styleCusto::Customizations} 'customizations' '{' (ownedCustomizationDescriptions+=StyleCustomizationDescriptions
		//ownedCustomizationDescriptions+=StyleCustomizationDescriptions*)? (ownedCustomizationReuse+=StyleCustomizationReuse
		//ownedCustomizationReuse+=StyleCustomizationReuse*)? '}'
		public Group getGroup() { return cGroup; }

		//{styleCusto::Customizations}
		public Action getCustomizationsAction_0() { return cCustomizationsAction_0; }

		//'customizations'
		public Keyword getCustomizationsKeyword_1() { return cCustomizationsKeyword_1; }

		//'{'
		public Keyword getLeftCurlyBracketKeyword_2() { return cLeftCurlyBracketKeyword_2; }

		//(ownedCustomizationDescriptions+=StyleCustomizationDescriptions
		//ownedCustomizationDescriptions+=StyleCustomizationDescriptions*)?
		public Group getGroup_3() { return cGroup_3; }

		//ownedCustomizationDescriptions+=StyleCustomizationDescriptions
		public Assignment getOwnedCustomizationDescriptionsAssignment_3_0() { return cOwnedCustomizationDescriptionsAssignment_3_0; }

		//StyleCustomizationDescriptions
		public RuleCall getOwnedCustomizationDescriptionsStyleCustomizationDescriptionsParserRuleCall_3_0_0() { return cOwnedCustomizationDescriptionsStyleCustomizationDescriptionsParserRuleCall_3_0_0; }

		//ownedCustomizationDescriptions+=StyleCustomizationDescriptions*
		public Assignment getOwnedCustomizationDescriptionsAssignment_3_1() { return cOwnedCustomizationDescriptionsAssignment_3_1; }

		//StyleCustomizationDescriptions
		public RuleCall getOwnedCustomizationDescriptionsStyleCustomizationDescriptionsParserRuleCall_3_1_0() { return cOwnedCustomizationDescriptionsStyleCustomizationDescriptionsParserRuleCall_3_1_0; }

		//(ownedCustomizationReuse+=StyleCustomizationReuse ownedCustomizationReuse+=StyleCustomizationReuse*)?
		public Group getGroup_4() { return cGroup_4; }

		//ownedCustomizationReuse+=StyleCustomizationReuse
		public Assignment getOwnedCustomizationReuseAssignment_4_0() { return cOwnedCustomizationReuseAssignment_4_0; }

		//StyleCustomizationReuse
		public RuleCall getOwnedCustomizationReuseStyleCustomizationReuseParserRuleCall_4_0_0() { return cOwnedCustomizationReuseStyleCustomizationReuseParserRuleCall_4_0_0; }

		//ownedCustomizationReuse+=StyleCustomizationReuse*
		public Assignment getOwnedCustomizationReuseAssignment_4_1() { return cOwnedCustomizationReuseAssignment_4_1; }

		//StyleCustomizationReuse
		public RuleCall getOwnedCustomizationReuseStyleCustomizationReuseParserRuleCall_4_1_0() { return cOwnedCustomizationReuseStyleCustomizationReuseParserRuleCall_4_1_0; }

		//'}'
		public Keyword getRightCurlyBracketKeyword_5() { return cRightCurlyBracketKeyword_5; }
	}

	public class StyleCustomizationDescriptionsElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.Vpdiagram.StyleCustomizationDescriptions");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cStyleCustomizationDescriptionsAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cCustomizationKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cNameAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cNameIDTerminalRuleCall_2_0 = (RuleCall)cNameAssignment_2.eContents().get(0);
		private final Group cGroup_3 = (Group)cGroup.eContents().get(3);
		private final Keyword cWhenKeyword_3_0 = (Keyword)cGroup_3.eContents().get(0);
		private final Keyword cLeftParenthesisKeyword_3_1 = (Keyword)cGroup_3.eContents().get(1);
		private final Assignment cPrecondtionExpressionAssignment_3_2 = (Assignment)cGroup_3.eContents().get(2);
		private final RuleCall cPrecondtionExpressionCustomizationExpressionParserRuleCall_3_2_0 = (RuleCall)cPrecondtionExpressionAssignment_3_2.eContents().get(0);
		private final Keyword cRightParenthesisKeyword_3_3 = (Keyword)cGroup_3.eContents().get(3);
		private final Keyword cWithKeyword_4 = (Keyword)cGroup.eContents().get(4);
		private final Keyword cLeftCurlyBracketKeyword_5 = (Keyword)cGroup.eContents().get(5);
		private final Group cGroup_6 = (Group)cGroup.eContents().get(6);
		private final Assignment cOwnedCustomizationsAssignment_6_0 = (Assignment)cGroup_6.eContents().get(0);
		private final RuleCall cOwnedCustomizationsAbstractCustomizationParserRuleCall_6_0_0 = (RuleCall)cOwnedCustomizationsAssignment_6_0.eContents().get(0);
		private final Assignment cOwnedCustomizationsAssignment_6_1 = (Assignment)cGroup_6.eContents().get(1);
		private final RuleCall cOwnedCustomizationsAbstractCustomizationParserRuleCall_6_1_0 = (RuleCall)cOwnedCustomizationsAssignment_6_1.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_7 = (Keyword)cGroup.eContents().get(7);
		
		//StyleCustomizationDescriptions styleCusto::StyleCustomizationDescriptions:
		//	{styleCusto::StyleCustomizationDescriptions} 'customization' name=ID ('when' '('
		//	precondtionExpression=CustomizationExpression ')')? 'with' '{' (ownedCustomizations+=AbstractCustomization
		//	ownedCustomizations+=AbstractCustomization*)? '}'
		@Override public ParserRule getRule() { return rule; }

		//{styleCusto::StyleCustomizationDescriptions} 'customization' name=ID ('when' '('
		//precondtionExpression=CustomizationExpression ')')? 'with' '{' (ownedCustomizations+=AbstractCustomization
		//ownedCustomizations+=AbstractCustomization*)? '}'
		public Group getGroup() { return cGroup; }

		//{styleCusto::StyleCustomizationDescriptions}
		public Action getStyleCustomizationDescriptionsAction_0() { return cStyleCustomizationDescriptionsAction_0; }

		//'customization'
		public Keyword getCustomizationKeyword_1() { return cCustomizationKeyword_1; }

		//name=ID
		public Assignment getNameAssignment_2() { return cNameAssignment_2; }

		//ID
		public RuleCall getNameIDTerminalRuleCall_2_0() { return cNameIDTerminalRuleCall_2_0; }

		//('when' '(' precondtionExpression=CustomizationExpression ')')?
		public Group getGroup_3() { return cGroup_3; }

		//'when'
		public Keyword getWhenKeyword_3_0() { return cWhenKeyword_3_0; }

		//'('
		public Keyword getLeftParenthesisKeyword_3_1() { return cLeftParenthesisKeyword_3_1; }

		//precondtionExpression=CustomizationExpression
		public Assignment getPrecondtionExpressionAssignment_3_2() { return cPrecondtionExpressionAssignment_3_2; }

		//CustomizationExpression
		public RuleCall getPrecondtionExpressionCustomizationExpressionParserRuleCall_3_2_0() { return cPrecondtionExpressionCustomizationExpressionParserRuleCall_3_2_0; }

		//')'
		public Keyword getRightParenthesisKeyword_3_3() { return cRightParenthesisKeyword_3_3; }

		//'with'
		public Keyword getWithKeyword_4() { return cWithKeyword_4; }

		//'{'
		public Keyword getLeftCurlyBracketKeyword_5() { return cLeftCurlyBracketKeyword_5; }

		//(ownedCustomizations+=AbstractCustomization ownedCustomizations+=AbstractCustomization*)?
		public Group getGroup_6() { return cGroup_6; }

		//ownedCustomizations+=AbstractCustomization
		public Assignment getOwnedCustomizationsAssignment_6_0() { return cOwnedCustomizationsAssignment_6_0; }

		//AbstractCustomization
		public RuleCall getOwnedCustomizationsAbstractCustomizationParserRuleCall_6_0_0() { return cOwnedCustomizationsAbstractCustomizationParserRuleCall_6_0_0; }

		//ownedCustomizations+=AbstractCustomization*
		public Assignment getOwnedCustomizationsAssignment_6_1() { return cOwnedCustomizationsAssignment_6_1; }

		//AbstractCustomization
		public RuleCall getOwnedCustomizationsAbstractCustomizationParserRuleCall_6_1_0() { return cOwnedCustomizationsAbstractCustomizationParserRuleCall_6_1_0; }

		//'}'
		public Keyword getRightCurlyBracketKeyword_7() { return cRightCurlyBracketKeyword_7; }
	}

	public class AbstractCustomizationElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.Vpdiagram.AbstractCustomization");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cEdgeStyleCustomizationParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cColorCustomizationParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		private final RuleCall cLabelCustomizationParserRuleCall_2 = (RuleCall)cAlternatives.eContents().get(2);
		private final RuleCall cAbstractNodeStyleCustomizationParserRuleCall_3 = (RuleCall)cAlternatives.eContents().get(3);
		
		//AbstractCustomization styleCusto::AbstractCustomization:
		//	EdgeStyleCustomization | ColorCustomization | LabelCustomization | AbstractNodeStyleCustomization
		@Override public ParserRule getRule() { return rule; }

		//EdgeStyleCustomization | ColorCustomization | LabelCustomization | AbstractNodeStyleCustomization
		public Alternatives getAlternatives() { return cAlternatives; }

		//EdgeStyleCustomization
		public RuleCall getEdgeStyleCustomizationParserRuleCall_0() { return cEdgeStyleCustomizationParserRuleCall_0; }

		//ColorCustomization
		public RuleCall getColorCustomizationParserRuleCall_1() { return cColorCustomizationParserRuleCall_1; }

		//LabelCustomization
		public RuleCall getLabelCustomizationParserRuleCall_2() { return cLabelCustomizationParserRuleCall_2; }

		//AbstractNodeStyleCustomization
		public RuleCall getAbstractNodeStyleCustomizationParserRuleCall_3() { return cAbstractNodeStyleCustomizationParserRuleCall_3; }
	}

	public class EdgeStyleCustomizationElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.Vpdiagram.EdgeStyleCustomization");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cEdgeStyleCustomizationAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cEdgeKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Group cGroup_2 = (Group)cGroup.eContents().get(2);
		private final Keyword cLeftParenthesisKeyword_2_0 = (Keyword)cGroup_2.eContents().get(0);
		private final Group cGroup_2_1 = (Group)cGroup_2.eContents().get(1);
		private final Assignment cAppliedOnAssignment_2_1_0 = (Assignment)cGroup_2_1.eContents().get(0);
		private final CrossReference cAppliedOnEdgeStyleDescriptionCrossReference_2_1_0_0 = (CrossReference)cAppliedOnAssignment_2_1_0.eContents().get(0);
		private final RuleCall cAppliedOnEdgeStyleDescriptionSTRINGTerminalRuleCall_2_1_0_0_1 = (RuleCall)cAppliedOnEdgeStyleDescriptionCrossReference_2_1_0_0.eContents().get(1);
		private final Group cGroup_2_1_1 = (Group)cGroup_2_1.eContents().get(1);
		private final Keyword cCommaKeyword_2_1_1_0 = (Keyword)cGroup_2_1_1.eContents().get(0);
		private final Assignment cAppliedOnAssignment_2_1_1_1 = (Assignment)cGroup_2_1_1.eContents().get(1);
		private final CrossReference cAppliedOnEdgeStyleDescriptionCrossReference_2_1_1_1_0 = (CrossReference)cAppliedOnAssignment_2_1_1_1.eContents().get(0);
		private final RuleCall cAppliedOnEdgeStyleDescriptionSTRINGTerminalRuleCall_2_1_1_1_0_1 = (RuleCall)cAppliedOnEdgeStyleDescriptionCrossReference_2_1_1_1_0.eContents().get(1);
		private final Keyword cRightParenthesisKeyword_2_2 = (Keyword)cGroup_2.eContents().get(2);
		private final Keyword cLeftCurlyBracketKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Group cGroup_4 = (Group)cGroup.eContents().get(4);
		private final Keyword cOverAllEdgesKeyword_4_0 = (Keyword)cGroup_4.eContents().get(0);
		private final Keyword cColonKeyword_4_1 = (Keyword)cGroup_4.eContents().get(1);
		private final Assignment cApplyonAllAssignment_4_2 = (Assignment)cGroup_4.eContents().get(2);
		private final RuleCall cApplyonAllEBooleanParserRuleCall_4_2_0 = (RuleCall)cApplyonAllAssignment_4_2.eContents().get(0);
		private final Group cGroup_5 = (Group)cGroup.eContents().get(5);
		private final Keyword cSourceKeyword_5_0 = (Keyword)cGroup_5.eContents().get(0);
		private final Keyword cColonKeyword_5_1 = (Keyword)cGroup_5.eContents().get(1);
		private final Assignment cSourceArrowAssignment_5_2 = (Assignment)cGroup_5.eContents().get(2);
		private final RuleCall cSourceArrowEdgeArrowsEnumRuleCall_5_2_0 = (RuleCall)cSourceArrowAssignment_5_2.eContents().get(0);
		private final Group cGroup_6 = (Group)cGroup.eContents().get(6);
		private final Keyword cTargetKeyword_6_0 = (Keyword)cGroup_6.eContents().get(0);
		private final Keyword cColonKeyword_6_1 = (Keyword)cGroup_6.eContents().get(1);
		private final Assignment cTargetArrowAssignment_6_2 = (Assignment)cGroup_6.eContents().get(2);
		private final RuleCall cTargetArrowEdgeArrowsEnumRuleCall_6_2_0 = (RuleCall)cTargetArrowAssignment_6_2.eContents().get(0);
		private final Group cGroup_7 = (Group)cGroup.eContents().get(7);
		private final Keyword cRoutingKeyword_7_0 = (Keyword)cGroup_7.eContents().get(0);
		private final Keyword cColonKeyword_7_1 = (Keyword)cGroup_7.eContents().get(1);
		private final Assignment cRoutingStyleAssignment_7_2 = (Assignment)cGroup_7.eContents().get(2);
		private final RuleCall cRoutingStyleEdgeRoutingEnumRuleCall_7_2_0 = (RuleCall)cRoutingStyleAssignment_7_2.eContents().get(0);
		private final Group cGroup_8 = (Group)cGroup.eContents().get(8);
		private final Keyword cFoldingKeyword_8_0 = (Keyword)cGroup_8.eContents().get(0);
		private final Keyword cColonKeyword_8_1 = (Keyword)cGroup_8.eContents().get(1);
		private final Assignment cFoldingStyleAssignment_8_2 = (Assignment)cGroup_8.eContents().get(2);
		private final RuleCall cFoldingStyleFoldingStyleEnumRuleCall_8_2_0 = (RuleCall)cFoldingStyleAssignment_8_2.eContents().get(0);
		private final Group cGroup_9 = (Group)cGroup.eContents().get(9);
		private final Keyword cCenterSourceMappingsKeyword_9_0 = (Keyword)cGroup_9.eContents().get(0);
		private final Keyword cColonKeyword_9_1 = (Keyword)cGroup_9.eContents().get(1);
		private final Group cGroup_9_2 = (Group)cGroup_9.eContents().get(2);
		private final Assignment cCenteredSourceMappingsAssignment_9_2_0 = (Assignment)cGroup_9_2.eContents().get(0);
		private final CrossReference cCenteredSourceMappingsDiagramElementMappingCrossReference_9_2_0_0 = (CrossReference)cCenteredSourceMappingsAssignment_9_2_0.eContents().get(0);
		private final RuleCall cCenteredSourceMappingsDiagramElementMappingSTRINGTerminalRuleCall_9_2_0_0_1 = (RuleCall)cCenteredSourceMappingsDiagramElementMappingCrossReference_9_2_0_0.eContents().get(1);
		private final Group cGroup_9_2_1 = (Group)cGroup_9_2.eContents().get(1);
		private final Keyword cCommaKeyword_9_2_1_0 = (Keyword)cGroup_9_2_1.eContents().get(0);
		private final Assignment cCenteredSourceMappingsAssignment_9_2_1_1 = (Assignment)cGroup_9_2_1.eContents().get(1);
		private final CrossReference cCenteredSourceMappingsDiagramElementMappingCrossReference_9_2_1_1_0 = (CrossReference)cCenteredSourceMappingsAssignment_9_2_1_1.eContents().get(0);
		private final RuleCall cCenteredSourceMappingsDiagramElementMappingSTRINGTerminalRuleCall_9_2_1_1_0_1 = (RuleCall)cCenteredSourceMappingsDiagramElementMappingCrossReference_9_2_1_1_0.eContents().get(1);
		private final Group cGroup_10 = (Group)cGroup.eContents().get(10);
		private final Keyword cCenterTargetMappingsKeyword_10_0 = (Keyword)cGroup_10.eContents().get(0);
		private final Keyword cColonKeyword_10_1 = (Keyword)cGroup_10.eContents().get(1);
		private final Group cGroup_10_2 = (Group)cGroup_10.eContents().get(2);
		private final Assignment cCenteredTargetMappingsAssignment_10_2_0 = (Assignment)cGroup_10_2.eContents().get(0);
		private final CrossReference cCenteredTargetMappingsDiagramElementMappingCrossReference_10_2_0_0 = (CrossReference)cCenteredTargetMappingsAssignment_10_2_0.eContents().get(0);
		private final RuleCall cCenteredTargetMappingsDiagramElementMappingSTRINGTerminalRuleCall_10_2_0_0_1 = (RuleCall)cCenteredTargetMappingsDiagramElementMappingCrossReference_10_2_0_0.eContents().get(1);
		private final Group cGroup_10_2_1 = (Group)cGroup_10_2.eContents().get(1);
		private final Keyword cCommaKeyword_10_2_1_0 = (Keyword)cGroup_10_2_1.eContents().get(0);
		private final Assignment cCenteredTargetMappingsAssignment_10_2_1_1 = (Assignment)cGroup_10_2_1.eContents().get(1);
		private final CrossReference cCenteredTargetMappingsDiagramElementMappingCrossReference_10_2_1_1_0 = (CrossReference)cCenteredTargetMappingsAssignment_10_2_1_1.eContents().get(0);
		private final RuleCall cCenteredTargetMappingsDiagramElementMappingSTRINGTerminalRuleCall_10_2_1_1_0_1 = (RuleCall)cCenteredTargetMappingsDiagramElementMappingCrossReference_10_2_1_1_0.eContents().get(1);
		private final Group cGroup_11 = (Group)cGroup.eContents().get(11);
		private final Keyword cBeginLabelStyleDescriptionKeyword_11_0 = (Keyword)cGroup_11.eContents().get(0);
		private final Keyword cColonKeyword_11_1 = (Keyword)cGroup_11.eContents().get(1);
		private final Assignment cBeginLabelStyleDescriptionAssignment_11_2 = (Assignment)cGroup_11.eContents().get(2);
		private final CrossReference cBeginLabelStyleDescriptionBeginLabelStyleDescriptionCrossReference_11_2_0 = (CrossReference)cBeginLabelStyleDescriptionAssignment_11_2.eContents().get(0);
		private final RuleCall cBeginLabelStyleDescriptionBeginLabelStyleDescriptionSTRINGTerminalRuleCall_11_2_0_1 = (RuleCall)cBeginLabelStyleDescriptionBeginLabelStyleDescriptionCrossReference_11_2_0.eContents().get(1);
		private final Group cGroup_12 = (Group)cGroup.eContents().get(12);
		private final Keyword cCenterLabelStyleDescriptionKeyword_12_0 = (Keyword)cGroup_12.eContents().get(0);
		private final Keyword cColonKeyword_12_1 = (Keyword)cGroup_12.eContents().get(1);
		private final Assignment cCenterLabelStyleDescriptionAssignment_12_2 = (Assignment)cGroup_12.eContents().get(2);
		private final CrossReference cCenterLabelStyleDescriptionCenterLabelStyleDescriptionCrossReference_12_2_0 = (CrossReference)cCenterLabelStyleDescriptionAssignment_12_2.eContents().get(0);
		private final RuleCall cCenterLabelStyleDescriptionCenterLabelStyleDescriptionSTRINGTerminalRuleCall_12_2_0_1 = (RuleCall)cCenterLabelStyleDescriptionCenterLabelStyleDescriptionCrossReference_12_2_0.eContents().get(1);
		private final Group cGroup_13 = (Group)cGroup.eContents().get(13);
		private final Keyword cEndLabelStyleDescriptionKeyword_13_0 = (Keyword)cGroup_13.eContents().get(0);
		private final Keyword cColonKeyword_13_1 = (Keyword)cGroup_13.eContents().get(1);
		private final Assignment cEndLabelStyleDescriptionAssignment_13_2 = (Assignment)cGroup_13.eContents().get(2);
		private final CrossReference cEndLabelStyleDescriptionEndLabelStyleDescriptionCrossReference_13_2_0 = (CrossReference)cEndLabelStyleDescriptionAssignment_13_2.eContents().get(0);
		private final RuleCall cEndLabelStyleDescriptionEndLabelStyleDescriptionSTRINGTerminalRuleCall_13_2_0_1 = (RuleCall)cEndLabelStyleDescriptionEndLabelStyleDescriptionCrossReference_13_2_0.eContents().get(1);
		private final Group cGroup_14 = (Group)cGroup.eContents().get(14);
		private final Keyword cLineStyleKeyword_14_0 = (Keyword)cGroup_14.eContents().get(0);
		private final Keyword cColonKeyword_14_1 = (Keyword)cGroup_14.eContents().get(1);
		private final Assignment cLineStyleAssignment_14_2 = (Assignment)cGroup_14.eContents().get(2);
		private final RuleCall cLineStyleLineStyleEnumRuleCall_14_2_0 = (RuleCall)cLineStyleAssignment_14_2.eContents().get(0);
		private final Group cGroup_15 = (Group)cGroup.eContents().get(15);
		private final Keyword cSizeKeyword_15_0 = (Keyword)cGroup_15.eContents().get(0);
		private final Keyword cColonKeyword_15_1 = (Keyword)cGroup_15.eContents().get(1);
		private final Assignment cSizeComputationExpressionAssignment_15_2 = (Assignment)cGroup_15.eContents().get(2);
		private final RuleCall cSizeComputationExpressionCustomizationExpressionParserRuleCall_15_2_0 = (RuleCall)cSizeComputationExpressionAssignment_15_2.eContents().get(0);
		private final Group cGroup_16 = (Group)cGroup.eContents().get(16);
		private final Keyword cEndCenteringKeyword_16_0 = (Keyword)cGroup_16.eContents().get(0);
		private final Keyword cColonKeyword_16_1 = (Keyword)cGroup_16.eContents().get(1);
		private final Assignment cEndCenteringAssignment_16_2 = (Assignment)cGroup_16.eContents().get(2);
		private final RuleCall cEndCenteringCenterStyleEnumRuleCall_16_2_0 = (RuleCall)cEndCenteringAssignment_16_2.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_17 = (Keyword)cGroup.eContents().get(17);
		
		//EdgeStyleCustomization styleCusto::EdgeStyleCustomization:
		//	{styleCusto::EdgeStyleCustomization} 'edge' ('(' (appliedOn+=[siriusDDStyle::EdgeStyleDescription|STRING] (','
		//	appliedOn+=[siriusDDStyle::EdgeStyleDescription|STRING])*) ')')? '{' ('over-all-edges' ':' applyonAll=EBoolean)?
		//	('source' ':' sourceArrow=EdgeArrows)? ('target' ':' targetArrow=EdgeArrows)? ('routing' ':'
		//	routingStyle=EdgeRouting)? ('folding' ':' foldingStyle=FoldingStyle)? ('center-source-mappings' ':'
		//	(centeredSourceMappings+=[siriusDiagramDescription::DiagramElementMapping|STRING] (','
		//	centeredSourceMappings+=[siriusDiagramDescription::DiagramElementMapping|STRING])*))? ('center-target-mappings' ':'
		//	(centeredTargetMappings+=[siriusDiagramDescription::DiagramElementMapping|STRING] (','
		//	centeredTargetMappings+=[siriusDiagramDescription::DiagramElementMapping|STRING])*))?
		//	('begin-label-style-description' ':' beginLabelStyleDescription=[siriusDDStyle::BeginLabelStyleDescription|STRING])?
		//	('center-label-style-description' ':'
		//	centerLabelStyleDescription=[siriusDDStyle::CenterLabelStyleDescription|STRING])? ('end-label-style-description' ':'
		//	endLabelStyleDescription=[siriusDDStyle::EndLabelStyleDescription|STRING])? ('line-style' ':' lineStyle=LineStyle)?
		//	('size' ':' sizeComputationExpression=CustomizationExpression)? ('end-centering' ':' endCentering=CenterStyle)? '}'
		@Override public ParserRule getRule() { return rule; }

		//{styleCusto::EdgeStyleCustomization} 'edge' ('(' (appliedOn+=[siriusDDStyle::EdgeStyleDescription|STRING] (','
		//appliedOn+=[siriusDDStyle::EdgeStyleDescription|STRING])*) ')')? '{' ('over-all-edges' ':' applyonAll=EBoolean)?
		//('source' ':' sourceArrow=EdgeArrows)? ('target' ':' targetArrow=EdgeArrows)? ('routing' ':'
		//routingStyle=EdgeRouting)? ('folding' ':' foldingStyle=FoldingStyle)? ('center-source-mappings' ':'
		//(centeredSourceMappings+=[siriusDiagramDescription::DiagramElementMapping|STRING] (','
		//centeredSourceMappings+=[siriusDiagramDescription::DiagramElementMapping|STRING])*))? ('center-target-mappings' ':'
		//(centeredTargetMappings+=[siriusDiagramDescription::DiagramElementMapping|STRING] (','
		//centeredTargetMappings+=[siriusDiagramDescription::DiagramElementMapping|STRING])*))? ('begin-label-style-description'
		//':' beginLabelStyleDescription=[siriusDDStyle::BeginLabelStyleDescription|STRING])? ('center-label-style-description'
		//':' centerLabelStyleDescription=[siriusDDStyle::CenterLabelStyleDescription|STRING])? ('end-label-style-description'
		//':' endLabelStyleDescription=[siriusDDStyle::EndLabelStyleDescription|STRING])? ('line-style' ':'
		//lineStyle=LineStyle)? ('size' ':' sizeComputationExpression=CustomizationExpression)? ('end-centering' ':'
		//endCentering=CenterStyle)? '}'
		public Group getGroup() { return cGroup; }

		//{styleCusto::EdgeStyleCustomization}
		public Action getEdgeStyleCustomizationAction_0() { return cEdgeStyleCustomizationAction_0; }

		//'edge'
		public Keyword getEdgeKeyword_1() { return cEdgeKeyword_1; }

		//('(' (appliedOn+=[siriusDDStyle::EdgeStyleDescription|STRING] (','
		//appliedOn+=[siriusDDStyle::EdgeStyleDescription|STRING])*) ')')?
		public Group getGroup_2() { return cGroup_2; }

		//'('
		public Keyword getLeftParenthesisKeyword_2_0() { return cLeftParenthesisKeyword_2_0; }

		//(appliedOn+=[siriusDDStyle::EdgeStyleDescription|STRING] (',' appliedOn+=[siriusDDStyle::EdgeStyleDescription|STRING])*)
		public Group getGroup_2_1() { return cGroup_2_1; }

		//appliedOn+=[siriusDDStyle::EdgeStyleDescription|STRING]
		public Assignment getAppliedOnAssignment_2_1_0() { return cAppliedOnAssignment_2_1_0; }

		//[siriusDDStyle::EdgeStyleDescription|STRING]
		public CrossReference getAppliedOnEdgeStyleDescriptionCrossReference_2_1_0_0() { return cAppliedOnEdgeStyleDescriptionCrossReference_2_1_0_0; }

		//STRING
		public RuleCall getAppliedOnEdgeStyleDescriptionSTRINGTerminalRuleCall_2_1_0_0_1() { return cAppliedOnEdgeStyleDescriptionSTRINGTerminalRuleCall_2_1_0_0_1; }

		//(',' appliedOn+=[siriusDDStyle::EdgeStyleDescription|STRING])*
		public Group getGroup_2_1_1() { return cGroup_2_1_1; }

		//','
		public Keyword getCommaKeyword_2_1_1_0() { return cCommaKeyword_2_1_1_0; }

		//appliedOn+=[siriusDDStyle::EdgeStyleDescription|STRING]
		public Assignment getAppliedOnAssignment_2_1_1_1() { return cAppliedOnAssignment_2_1_1_1; }

		//[siriusDDStyle::EdgeStyleDescription|STRING]
		public CrossReference getAppliedOnEdgeStyleDescriptionCrossReference_2_1_1_1_0() { return cAppliedOnEdgeStyleDescriptionCrossReference_2_1_1_1_0; }

		//STRING
		public RuleCall getAppliedOnEdgeStyleDescriptionSTRINGTerminalRuleCall_2_1_1_1_0_1() { return cAppliedOnEdgeStyleDescriptionSTRINGTerminalRuleCall_2_1_1_1_0_1; }

		//')'
		public Keyword getRightParenthesisKeyword_2_2() { return cRightParenthesisKeyword_2_2; }

		//'{'
		public Keyword getLeftCurlyBracketKeyword_3() { return cLeftCurlyBracketKeyword_3; }

		//('over-all-edges' ':' applyonAll=EBoolean)?
		public Group getGroup_4() { return cGroup_4; }

		//'over-all-edges'
		public Keyword getOverAllEdgesKeyword_4_0() { return cOverAllEdgesKeyword_4_0; }

		//':'
		public Keyword getColonKeyword_4_1() { return cColonKeyword_4_1; }

		//applyonAll=EBoolean
		public Assignment getApplyonAllAssignment_4_2() { return cApplyonAllAssignment_4_2; }

		//EBoolean
		public RuleCall getApplyonAllEBooleanParserRuleCall_4_2_0() { return cApplyonAllEBooleanParserRuleCall_4_2_0; }

		//('source' ':' sourceArrow=EdgeArrows)?
		public Group getGroup_5() { return cGroup_5; }

		//'source'
		public Keyword getSourceKeyword_5_0() { return cSourceKeyword_5_0; }

		//':'
		public Keyword getColonKeyword_5_1() { return cColonKeyword_5_1; }

		//sourceArrow=EdgeArrows
		public Assignment getSourceArrowAssignment_5_2() { return cSourceArrowAssignment_5_2; }

		//EdgeArrows
		public RuleCall getSourceArrowEdgeArrowsEnumRuleCall_5_2_0() { return cSourceArrowEdgeArrowsEnumRuleCall_5_2_0; }

		//('target' ':' targetArrow=EdgeArrows)?
		public Group getGroup_6() { return cGroup_6; }

		//'target'
		public Keyword getTargetKeyword_6_0() { return cTargetKeyword_6_0; }

		//':'
		public Keyword getColonKeyword_6_1() { return cColonKeyword_6_1; }

		//targetArrow=EdgeArrows
		public Assignment getTargetArrowAssignment_6_2() { return cTargetArrowAssignment_6_2; }

		//EdgeArrows
		public RuleCall getTargetArrowEdgeArrowsEnumRuleCall_6_2_0() { return cTargetArrowEdgeArrowsEnumRuleCall_6_2_0; }

		//('routing' ':' routingStyle=EdgeRouting)?
		public Group getGroup_7() { return cGroup_7; }

		//'routing'
		public Keyword getRoutingKeyword_7_0() { return cRoutingKeyword_7_0; }

		//':'
		public Keyword getColonKeyword_7_1() { return cColonKeyword_7_1; }

		//routingStyle=EdgeRouting
		public Assignment getRoutingStyleAssignment_7_2() { return cRoutingStyleAssignment_7_2; }

		//EdgeRouting
		public RuleCall getRoutingStyleEdgeRoutingEnumRuleCall_7_2_0() { return cRoutingStyleEdgeRoutingEnumRuleCall_7_2_0; }

		//('folding' ':' foldingStyle=FoldingStyle)?
		public Group getGroup_8() { return cGroup_8; }

		//'folding'
		public Keyword getFoldingKeyword_8_0() { return cFoldingKeyword_8_0; }

		//':'
		public Keyword getColonKeyword_8_1() { return cColonKeyword_8_1; }

		//foldingStyle=FoldingStyle
		public Assignment getFoldingStyleAssignment_8_2() { return cFoldingStyleAssignment_8_2; }

		//FoldingStyle
		public RuleCall getFoldingStyleFoldingStyleEnumRuleCall_8_2_0() { return cFoldingStyleFoldingStyleEnumRuleCall_8_2_0; }

		//('center-source-mappings' ':' (centeredSourceMappings+=[siriusDiagramDescription::DiagramElementMapping|STRING] (','
		//centeredSourceMappings+=[siriusDiagramDescription::DiagramElementMapping|STRING])*))?
		public Group getGroup_9() { return cGroup_9; }

		//'center-source-mappings'
		public Keyword getCenterSourceMappingsKeyword_9_0() { return cCenterSourceMappingsKeyword_9_0; }

		//':'
		public Keyword getColonKeyword_9_1() { return cColonKeyword_9_1; }

		//(centeredSourceMappings+=[siriusDiagramDescription::DiagramElementMapping|STRING] (','
		//centeredSourceMappings+=[siriusDiagramDescription::DiagramElementMapping|STRING])*)
		public Group getGroup_9_2() { return cGroup_9_2; }

		//centeredSourceMappings+=[siriusDiagramDescription::DiagramElementMapping|STRING]
		public Assignment getCenteredSourceMappingsAssignment_9_2_0() { return cCenteredSourceMappingsAssignment_9_2_0; }

		//[siriusDiagramDescription::DiagramElementMapping|STRING]
		public CrossReference getCenteredSourceMappingsDiagramElementMappingCrossReference_9_2_0_0() { return cCenteredSourceMappingsDiagramElementMappingCrossReference_9_2_0_0; }

		//STRING
		public RuleCall getCenteredSourceMappingsDiagramElementMappingSTRINGTerminalRuleCall_9_2_0_0_1() { return cCenteredSourceMappingsDiagramElementMappingSTRINGTerminalRuleCall_9_2_0_0_1; }

		//(',' centeredSourceMappings+=[siriusDiagramDescription::DiagramElementMapping|STRING])*
		public Group getGroup_9_2_1() { return cGroup_9_2_1; }

		//','
		public Keyword getCommaKeyword_9_2_1_0() { return cCommaKeyword_9_2_1_0; }

		//centeredSourceMappings+=[siriusDiagramDescription::DiagramElementMapping|STRING]
		public Assignment getCenteredSourceMappingsAssignment_9_2_1_1() { return cCenteredSourceMappingsAssignment_9_2_1_1; }

		//[siriusDiagramDescription::DiagramElementMapping|STRING]
		public CrossReference getCenteredSourceMappingsDiagramElementMappingCrossReference_9_2_1_1_0() { return cCenteredSourceMappingsDiagramElementMappingCrossReference_9_2_1_1_0; }

		//STRING
		public RuleCall getCenteredSourceMappingsDiagramElementMappingSTRINGTerminalRuleCall_9_2_1_1_0_1() { return cCenteredSourceMappingsDiagramElementMappingSTRINGTerminalRuleCall_9_2_1_1_0_1; }

		//('center-target-mappings' ':' (centeredTargetMappings+=[siriusDiagramDescription::DiagramElementMapping|STRING] (','
		//centeredTargetMappings+=[siriusDiagramDescription::DiagramElementMapping|STRING])*))?
		public Group getGroup_10() { return cGroup_10; }

		//'center-target-mappings'
		public Keyword getCenterTargetMappingsKeyword_10_0() { return cCenterTargetMappingsKeyword_10_0; }

		//':'
		public Keyword getColonKeyword_10_1() { return cColonKeyword_10_1; }

		//(centeredTargetMappings+=[siriusDiagramDescription::DiagramElementMapping|STRING] (','
		//centeredTargetMappings+=[siriusDiagramDescription::DiagramElementMapping|STRING])*)
		public Group getGroup_10_2() { return cGroup_10_2; }

		//centeredTargetMappings+=[siriusDiagramDescription::DiagramElementMapping|STRING]
		public Assignment getCenteredTargetMappingsAssignment_10_2_0() { return cCenteredTargetMappingsAssignment_10_2_0; }

		//[siriusDiagramDescription::DiagramElementMapping|STRING]
		public CrossReference getCenteredTargetMappingsDiagramElementMappingCrossReference_10_2_0_0() { return cCenteredTargetMappingsDiagramElementMappingCrossReference_10_2_0_0; }

		//STRING
		public RuleCall getCenteredTargetMappingsDiagramElementMappingSTRINGTerminalRuleCall_10_2_0_0_1() { return cCenteredTargetMappingsDiagramElementMappingSTRINGTerminalRuleCall_10_2_0_0_1; }

		//(',' centeredTargetMappings+=[siriusDiagramDescription::DiagramElementMapping|STRING])*
		public Group getGroup_10_2_1() { return cGroup_10_2_1; }

		//','
		public Keyword getCommaKeyword_10_2_1_0() { return cCommaKeyword_10_2_1_0; }

		//centeredTargetMappings+=[siriusDiagramDescription::DiagramElementMapping|STRING]
		public Assignment getCenteredTargetMappingsAssignment_10_2_1_1() { return cCenteredTargetMappingsAssignment_10_2_1_1; }

		//[siriusDiagramDescription::DiagramElementMapping|STRING]
		public CrossReference getCenteredTargetMappingsDiagramElementMappingCrossReference_10_2_1_1_0() { return cCenteredTargetMappingsDiagramElementMappingCrossReference_10_2_1_1_0; }

		//STRING
		public RuleCall getCenteredTargetMappingsDiagramElementMappingSTRINGTerminalRuleCall_10_2_1_1_0_1() { return cCenteredTargetMappingsDiagramElementMappingSTRINGTerminalRuleCall_10_2_1_1_0_1; }

		//('begin-label-style-description' ':' beginLabelStyleDescription=[siriusDDStyle::BeginLabelStyleDescription|STRING])?
		public Group getGroup_11() { return cGroup_11; }

		//'begin-label-style-description'
		public Keyword getBeginLabelStyleDescriptionKeyword_11_0() { return cBeginLabelStyleDescriptionKeyword_11_0; }

		//':'
		public Keyword getColonKeyword_11_1() { return cColonKeyword_11_1; }

		//beginLabelStyleDescription=[siriusDDStyle::BeginLabelStyleDescription|STRING]
		public Assignment getBeginLabelStyleDescriptionAssignment_11_2() { return cBeginLabelStyleDescriptionAssignment_11_2; }

		//[siriusDDStyle::BeginLabelStyleDescription|STRING]
		public CrossReference getBeginLabelStyleDescriptionBeginLabelStyleDescriptionCrossReference_11_2_0() { return cBeginLabelStyleDescriptionBeginLabelStyleDescriptionCrossReference_11_2_0; }

		//STRING
		public RuleCall getBeginLabelStyleDescriptionBeginLabelStyleDescriptionSTRINGTerminalRuleCall_11_2_0_1() { return cBeginLabelStyleDescriptionBeginLabelStyleDescriptionSTRINGTerminalRuleCall_11_2_0_1; }

		//('center-label-style-description' ':' centerLabelStyleDescription=[siriusDDStyle::CenterLabelStyleDescription|STRING])?
		public Group getGroup_12() { return cGroup_12; }

		//'center-label-style-description'
		public Keyword getCenterLabelStyleDescriptionKeyword_12_0() { return cCenterLabelStyleDescriptionKeyword_12_0; }

		//':'
		public Keyword getColonKeyword_12_1() { return cColonKeyword_12_1; }

		//centerLabelStyleDescription=[siriusDDStyle::CenterLabelStyleDescription|STRING]
		public Assignment getCenterLabelStyleDescriptionAssignment_12_2() { return cCenterLabelStyleDescriptionAssignment_12_2; }

		//[siriusDDStyle::CenterLabelStyleDescription|STRING]
		public CrossReference getCenterLabelStyleDescriptionCenterLabelStyleDescriptionCrossReference_12_2_0() { return cCenterLabelStyleDescriptionCenterLabelStyleDescriptionCrossReference_12_2_0; }

		//STRING
		public RuleCall getCenterLabelStyleDescriptionCenterLabelStyleDescriptionSTRINGTerminalRuleCall_12_2_0_1() { return cCenterLabelStyleDescriptionCenterLabelStyleDescriptionSTRINGTerminalRuleCall_12_2_0_1; }

		//('end-label-style-description' ':' endLabelStyleDescription=[siriusDDStyle::EndLabelStyleDescription|STRING])?
		public Group getGroup_13() { return cGroup_13; }

		//'end-label-style-description'
		public Keyword getEndLabelStyleDescriptionKeyword_13_0() { return cEndLabelStyleDescriptionKeyword_13_0; }

		//':'
		public Keyword getColonKeyword_13_1() { return cColonKeyword_13_1; }

		//endLabelStyleDescription=[siriusDDStyle::EndLabelStyleDescription|STRING]
		public Assignment getEndLabelStyleDescriptionAssignment_13_2() { return cEndLabelStyleDescriptionAssignment_13_2; }

		//[siriusDDStyle::EndLabelStyleDescription|STRING]
		public CrossReference getEndLabelStyleDescriptionEndLabelStyleDescriptionCrossReference_13_2_0() { return cEndLabelStyleDescriptionEndLabelStyleDescriptionCrossReference_13_2_0; }

		//STRING
		public RuleCall getEndLabelStyleDescriptionEndLabelStyleDescriptionSTRINGTerminalRuleCall_13_2_0_1() { return cEndLabelStyleDescriptionEndLabelStyleDescriptionSTRINGTerminalRuleCall_13_2_0_1; }

		//('line-style' ':' lineStyle=LineStyle)?
		public Group getGroup_14() { return cGroup_14; }

		//'line-style'
		public Keyword getLineStyleKeyword_14_0() { return cLineStyleKeyword_14_0; }

		//':'
		public Keyword getColonKeyword_14_1() { return cColonKeyword_14_1; }

		//lineStyle=LineStyle
		public Assignment getLineStyleAssignment_14_2() { return cLineStyleAssignment_14_2; }

		//LineStyle
		public RuleCall getLineStyleLineStyleEnumRuleCall_14_2_0() { return cLineStyleLineStyleEnumRuleCall_14_2_0; }

		//('size' ':' sizeComputationExpression=CustomizationExpression)?
		public Group getGroup_15() { return cGroup_15; }

		//'size'
		public Keyword getSizeKeyword_15_0() { return cSizeKeyword_15_0; }

		//':'
		public Keyword getColonKeyword_15_1() { return cColonKeyword_15_1; }

		//sizeComputationExpression=CustomizationExpression
		public Assignment getSizeComputationExpressionAssignment_15_2() { return cSizeComputationExpressionAssignment_15_2; }

		//CustomizationExpression
		public RuleCall getSizeComputationExpressionCustomizationExpressionParserRuleCall_15_2_0() { return cSizeComputationExpressionCustomizationExpressionParserRuleCall_15_2_0; }

		//('end-centering' ':' endCentering=CenterStyle)?
		public Group getGroup_16() { return cGroup_16; }

		//'end-centering'
		public Keyword getEndCenteringKeyword_16_0() { return cEndCenteringKeyword_16_0; }

		//':'
		public Keyword getColonKeyword_16_1() { return cColonKeyword_16_1; }

		//endCentering=CenterStyle
		public Assignment getEndCenteringAssignment_16_2() { return cEndCenteringAssignment_16_2; }

		//CenterStyle
		public RuleCall getEndCenteringCenterStyleEnumRuleCall_16_2_0() { return cEndCenteringCenterStyleEnumRuleCall_16_2_0; }

		//'}'
		public Keyword getRightCurlyBracketKeyword_17() { return cRightCurlyBracketKeyword_17; }
	}

	public class ColorCustomizationElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.Vpdiagram.ColorCustomization");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cColorCustomizationAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cPaintKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cColorUseCaseAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cColorUseCaseColorUseCaseEnumRuleCall_2_0 = (RuleCall)cColorUseCaseAssignment_2.eContents().get(0);
		private final Group cGroup_3 = (Group)cGroup.eContents().get(3);
		private final Keyword cLeftParenthesisKeyword_3_0 = (Keyword)cGroup_3.eContents().get(0);
		private final Group cGroup_3_1 = (Group)cGroup_3.eContents().get(1);
		private final Assignment cAppliedOnAssignment_3_1_0 = (Assignment)cGroup_3_1.eContents().get(0);
		private final CrossReference cAppliedOnEObjectCrossReference_3_1_0_0 = (CrossReference)cAppliedOnAssignment_3_1_0.eContents().get(0);
		private final RuleCall cAppliedOnEObjectSTRINGTerminalRuleCall_3_1_0_0_1 = (RuleCall)cAppliedOnEObjectCrossReference_3_1_0_0.eContents().get(1);
		private final Group cGroup_3_1_1 = (Group)cGroup_3_1.eContents().get(1);
		private final Keyword cCommaKeyword_3_1_1_0 = (Keyword)cGroup_3_1_1.eContents().get(0);
		private final Assignment cAppliedOnAssignment_3_1_1_1 = (Assignment)cGroup_3_1_1.eContents().get(1);
		private final CrossReference cAppliedOnEObjectCrossReference_3_1_1_1_0 = (CrossReference)cAppliedOnAssignment_3_1_1_1.eContents().get(0);
		private final RuleCall cAppliedOnEObjectSTRINGTerminalRuleCall_3_1_1_1_0_1 = (RuleCall)cAppliedOnEObjectCrossReference_3_1_1_1_0.eContents().get(1);
		private final Keyword cRightParenthesisKeyword_3_2 = (Keyword)cGroup_3.eContents().get(2);
		private final Assignment cApplyonAllAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final Keyword cApplyonAllOverAllColorsKeyword_4_0 = (Keyword)cApplyonAllAssignment_4.eContents().get(0);
		private final Group cGroup_5 = (Group)cGroup.eContents().get(5);
		private final Keyword cWithKeyword_5_0 = (Keyword)cGroup_5.eContents().get(0);
		private final Assignment cColorAssignment_5_1 = (Assignment)cGroup_5.eContents().get(1);
		private final RuleCall cColorSystemColorsEnumRuleCall_5_1_0 = (RuleCall)cColorAssignment_5_1.eContents().get(0);
		
		//ColorCustomization styleCusto::ColorCustomization:
		//	{styleCusto::ColorCustomization} 'paint' colorUseCase=ColorUseCase ('(' (appliedOn+=[ecore::EObject|STRING] (','
		//	appliedOn+=[ecore::EObject|STRING])*) ')')? applyonAll?='over-all-colors'? ('with' color=SystemColors)
		@Override public ParserRule getRule() { return rule; }

		//{styleCusto::ColorCustomization} 'paint' colorUseCase=ColorUseCase ('(' (appliedOn+=[ecore::EObject|STRING] (','
		//appliedOn+=[ecore::EObject|STRING])*) ')')? applyonAll?='over-all-colors'? ('with' color=SystemColors)
		public Group getGroup() { return cGroup; }

		//{styleCusto::ColorCustomization}
		public Action getColorCustomizationAction_0() { return cColorCustomizationAction_0; }

		//'paint'
		public Keyword getPaintKeyword_1() { return cPaintKeyword_1; }

		//colorUseCase=ColorUseCase
		public Assignment getColorUseCaseAssignment_2() { return cColorUseCaseAssignment_2; }

		//ColorUseCase
		public RuleCall getColorUseCaseColorUseCaseEnumRuleCall_2_0() { return cColorUseCaseColorUseCaseEnumRuleCall_2_0; }

		//('(' (appliedOn+=[ecore::EObject|STRING] (',' appliedOn+=[ecore::EObject|STRING])*) ')')?
		public Group getGroup_3() { return cGroup_3; }

		//'('
		public Keyword getLeftParenthesisKeyword_3_0() { return cLeftParenthesisKeyword_3_0; }

		//(appliedOn+=[ecore::EObject|STRING] (',' appliedOn+=[ecore::EObject|STRING])*)
		public Group getGroup_3_1() { return cGroup_3_1; }

		//appliedOn+=[ecore::EObject|STRING]
		public Assignment getAppliedOnAssignment_3_1_0() { return cAppliedOnAssignment_3_1_0; }

		//[ecore::EObject|STRING]
		public CrossReference getAppliedOnEObjectCrossReference_3_1_0_0() { return cAppliedOnEObjectCrossReference_3_1_0_0; }

		//STRING
		public RuleCall getAppliedOnEObjectSTRINGTerminalRuleCall_3_1_0_0_1() { return cAppliedOnEObjectSTRINGTerminalRuleCall_3_1_0_0_1; }

		//(',' appliedOn+=[ecore::EObject|STRING])*
		public Group getGroup_3_1_1() { return cGroup_3_1_1; }

		//','
		public Keyword getCommaKeyword_3_1_1_0() { return cCommaKeyword_3_1_1_0; }

		//appliedOn+=[ecore::EObject|STRING]
		public Assignment getAppliedOnAssignment_3_1_1_1() { return cAppliedOnAssignment_3_1_1_1; }

		//[ecore::EObject|STRING]
		public CrossReference getAppliedOnEObjectCrossReference_3_1_1_1_0() { return cAppliedOnEObjectCrossReference_3_1_1_1_0; }

		//STRING
		public RuleCall getAppliedOnEObjectSTRINGTerminalRuleCall_3_1_1_1_0_1() { return cAppliedOnEObjectSTRINGTerminalRuleCall_3_1_1_1_0_1; }

		//')'
		public Keyword getRightParenthesisKeyword_3_2() { return cRightParenthesisKeyword_3_2; }

		//applyonAll?='over-all-colors'?
		public Assignment getApplyonAllAssignment_4() { return cApplyonAllAssignment_4; }

		//'over-all-colors'
		public Keyword getApplyonAllOverAllColorsKeyword_4_0() { return cApplyonAllOverAllColorsKeyword_4_0; }

		//('with' color=SystemColors)
		public Group getGroup_5() { return cGroup_5; }

		//'with'
		public Keyword getWithKeyword_5_0() { return cWithKeyword_5_0; }

		//color=SystemColors
		public Assignment getColorAssignment_5_1() { return cColorAssignment_5_1; }

		//SystemColors
		public RuleCall getColorSystemColorsEnumRuleCall_5_1_0() { return cColorSystemColorsEnumRuleCall_5_1_0; }
	}

	public class LabelCustomizationElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.Vpdiagram.LabelCustomization");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cLabelCustomizationAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cLabelKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Group cGroup_2 = (Group)cGroup.eContents().get(2);
		private final Keyword cLeftParenthesisKeyword_2_0 = (Keyword)cGroup_2.eContents().get(0);
		private final Group cGroup_2_1 = (Group)cGroup_2.eContents().get(1);
		private final Assignment cAppliedOnAssignment_2_1_0 = (Assignment)cGroup_2_1.eContents().get(0);
		private final CrossReference cAppliedOnBasicLabelStyleDescriptionCrossReference_2_1_0_0 = (CrossReference)cAppliedOnAssignment_2_1_0.eContents().get(0);
		private final RuleCall cAppliedOnBasicLabelStyleDescriptionSTRINGTerminalRuleCall_2_1_0_0_1 = (RuleCall)cAppliedOnBasicLabelStyleDescriptionCrossReference_2_1_0_0.eContents().get(1);
		private final Group cGroup_2_1_1 = (Group)cGroup_2_1.eContents().get(1);
		private final Keyword cCommaKeyword_2_1_1_0 = (Keyword)cGroup_2_1_1.eContents().get(0);
		private final Assignment cAppliedOnAssignment_2_1_1_1 = (Assignment)cGroup_2_1_1.eContents().get(1);
		private final CrossReference cAppliedOnBasicLabelStyleDescriptionCrossReference_2_1_1_1_0 = (CrossReference)cAppliedOnAssignment_2_1_1_1.eContents().get(0);
		private final RuleCall cAppliedOnBasicLabelStyleDescriptionSTRINGTerminalRuleCall_2_1_1_1_0_1 = (RuleCall)cAppliedOnBasicLabelStyleDescriptionCrossReference_2_1_1_1_0.eContents().get(1);
		private final Keyword cRightParenthesisKeyword_2_2 = (Keyword)cGroup_2.eContents().get(2);
		private final Keyword cLeftCurlyBracketKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Group cGroup_4 = (Group)cGroup.eContents().get(4);
		private final Keyword cOverAllLabelsKeyword_4_0 = (Keyword)cGroup_4.eContents().get(0);
		private final Keyword cColonKeyword_4_1 = (Keyword)cGroup_4.eContents().get(1);
		private final Assignment cApplyonAllAssignment_4_2 = (Assignment)cGroup_4.eContents().get(2);
		private final RuleCall cApplyonAllEBooleanParserRuleCall_4_2_0 = (RuleCall)cApplyonAllAssignment_4_2.eContents().get(0);
		private final Assignment cOwnedLabelAlignmentAssignment_5 = (Assignment)cGroup.eContents().get(5);
		private final RuleCall cOwnedLabelAlignmentLabelAlignementCustomizationParserRuleCall_5_0 = (RuleCall)cOwnedLabelAlignmentAssignment_5.eContents().get(0);
		private final Group cGroup_6 = (Group)cGroup.eContents().get(6);
		private final Keyword cSizeKeyword_6_0 = (Keyword)cGroup_6.eContents().get(0);
		private final Keyword cColonKeyword_6_1 = (Keyword)cGroup_6.eContents().get(1);
		private final Assignment cSizeAssignment_6_2 = (Assignment)cGroup_6.eContents().get(2);
		private final RuleCall cSizeEIntParserRuleCall_6_2_0 = (RuleCall)cSizeAssignment_6_2.eContents().get(0);
		private final Group cGroup_7 = (Group)cGroup.eContents().get(7);
		private final Keyword cFormatKeyword_7_0 = (Keyword)cGroup_7.eContents().get(0);
		private final Keyword cColonKeyword_7_1 = (Keyword)cGroup_7.eContents().get(1);
		private final Assignment cFormatAssignment_7_2 = (Assignment)cGroup_7.eContents().get(2);
		private final RuleCall cFormatFontFormatEnumRuleCall_7_2_0 = (RuleCall)cFormatAssignment_7_2.eContents().get(0);
		private final Group cGroup_8 = (Group)cGroup.eContents().get(8);
		private final Keyword cColorKeyword_8_0 = (Keyword)cGroup_8.eContents().get(0);
		private final Keyword cColonKeyword_8_1 = (Keyword)cGroup_8.eContents().get(1);
		private final Assignment cColorAssignment_8_2 = (Assignment)cGroup_8.eContents().get(2);
		private final RuleCall cColorSystemColorsEnumRuleCall_8_2_0 = (RuleCall)cColorAssignment_8_2.eContents().get(0);
		private final Group cGroup_9 = (Group)cGroup.eContents().get(9);
		private final Keyword cIconKeyword_9_0 = (Keyword)cGroup_9.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_9_1 = (Keyword)cGroup_9.eContents().get(1);
		private final Keyword cShowKeyword_9_2 = (Keyword)cGroup_9.eContents().get(2);
		private final Keyword cColonKeyword_9_3 = (Keyword)cGroup_9.eContents().get(3);
		private final Assignment cShowIconAssignment_9_4 = (Assignment)cGroup_9.eContents().get(4);
		private final RuleCall cShowIconEBooleanParserRuleCall_9_4_0 = (RuleCall)cShowIconAssignment_9_4.eContents().get(0);
		private final Keyword cPathKeyword_9_5 = (Keyword)cGroup_9.eContents().get(5);
		private final Keyword cColonKeyword_9_6 = (Keyword)cGroup_9.eContents().get(6);
		private final Assignment cIconPathAssignment_9_7 = (Assignment)cGroup_9.eContents().get(7);
		private final RuleCall cIconPathEStringParserRuleCall_9_7_0 = (RuleCall)cIconPathAssignment_9_7.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_9_8 = (Keyword)cGroup_9.eContents().get(8);
		private final Group cGroup_10 = (Group)cGroup.eContents().get(10);
		private final Keyword cExpressionKeyword_10_0 = (Keyword)cGroup_10.eContents().get(0);
		private final Keyword cColonKeyword_10_1 = (Keyword)cGroup_10.eContents().get(1);
		private final Assignment cExpressionAssignment_10_2 = (Assignment)cGroup_10.eContents().get(2);
		private final RuleCall cExpressionCustomizationExpressionParserRuleCall_10_2_0 = (RuleCall)cExpressionAssignment_10_2.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_11 = (Keyword)cGroup.eContents().get(11);
		
		//LabelCustomization styleCusto::LabelCustomization:
		//	{styleCusto::LabelCustomization} 'label' ('(' (appliedOn+=[siriusDStyle::BasicLabelStyleDescription|STRING] (','
		//	appliedOn+=[siriusDStyle::BasicLabelStyleDescription|STRING])*) ')')? '{' ('over-all-labels' ':'
		//	applyonAll=EBoolean)? ownedLabelAlignment=LabelAlignementCustomization? ('size' ':' size=EInt)? ('format' ':'
		//	format=FontFormat)? ('color' ':' color=SystemColors) ('icon' '{' 'show' ':' showIcon=EBoolean 'path' ':'
		//	iconPath=EString '}')? ('expression' ':' expression=CustomizationExpression)? '}'
		@Override public ParserRule getRule() { return rule; }

		//{styleCusto::LabelCustomization} 'label' ('(' (appliedOn+=[siriusDStyle::BasicLabelStyleDescription|STRING] (','
		//appliedOn+=[siriusDStyle::BasicLabelStyleDescription|STRING])*) ')')? '{' ('over-all-labels' ':' applyonAll=EBoolean)?
		//ownedLabelAlignment=LabelAlignementCustomization? ('size' ':' size=EInt)? ('format' ':' format=FontFormat)? ('color'
		//':' color=SystemColors) ('icon' '{' 'show' ':' showIcon=EBoolean 'path' ':' iconPath=EString '}')? ('expression' ':'
		//expression=CustomizationExpression)? '}'
		public Group getGroup() { return cGroup; }

		//{styleCusto::LabelCustomization}
		public Action getLabelCustomizationAction_0() { return cLabelCustomizationAction_0; }

		//'label'
		public Keyword getLabelKeyword_1() { return cLabelKeyword_1; }

		//('(' (appliedOn+=[siriusDStyle::BasicLabelStyleDescription|STRING] (','
		//appliedOn+=[siriusDStyle::BasicLabelStyleDescription|STRING])*) ')')?
		public Group getGroup_2() { return cGroup_2; }

		//'('
		public Keyword getLeftParenthesisKeyword_2_0() { return cLeftParenthesisKeyword_2_0; }

		//(appliedOn+=[siriusDStyle::BasicLabelStyleDescription|STRING] (','
		//appliedOn+=[siriusDStyle::BasicLabelStyleDescription|STRING])*)
		public Group getGroup_2_1() { return cGroup_2_1; }

		//appliedOn+=[siriusDStyle::BasicLabelStyleDescription|STRING]
		public Assignment getAppliedOnAssignment_2_1_0() { return cAppliedOnAssignment_2_1_0; }

		//[siriusDStyle::BasicLabelStyleDescription|STRING]
		public CrossReference getAppliedOnBasicLabelStyleDescriptionCrossReference_2_1_0_0() { return cAppliedOnBasicLabelStyleDescriptionCrossReference_2_1_0_0; }

		//STRING
		public RuleCall getAppliedOnBasicLabelStyleDescriptionSTRINGTerminalRuleCall_2_1_0_0_1() { return cAppliedOnBasicLabelStyleDescriptionSTRINGTerminalRuleCall_2_1_0_0_1; }

		//(',' appliedOn+=[siriusDStyle::BasicLabelStyleDescription|STRING])*
		public Group getGroup_2_1_1() { return cGroup_2_1_1; }

		//','
		public Keyword getCommaKeyword_2_1_1_0() { return cCommaKeyword_2_1_1_0; }

		//appliedOn+=[siriusDStyle::BasicLabelStyleDescription|STRING]
		public Assignment getAppliedOnAssignment_2_1_1_1() { return cAppliedOnAssignment_2_1_1_1; }

		//[siriusDStyle::BasicLabelStyleDescription|STRING]
		public CrossReference getAppliedOnBasicLabelStyleDescriptionCrossReference_2_1_1_1_0() { return cAppliedOnBasicLabelStyleDescriptionCrossReference_2_1_1_1_0; }

		//STRING
		public RuleCall getAppliedOnBasicLabelStyleDescriptionSTRINGTerminalRuleCall_2_1_1_1_0_1() { return cAppliedOnBasicLabelStyleDescriptionSTRINGTerminalRuleCall_2_1_1_1_0_1; }

		//')'
		public Keyword getRightParenthesisKeyword_2_2() { return cRightParenthesisKeyword_2_2; }

		//'{'
		public Keyword getLeftCurlyBracketKeyword_3() { return cLeftCurlyBracketKeyword_3; }

		//('over-all-labels' ':' applyonAll=EBoolean)?
		public Group getGroup_4() { return cGroup_4; }

		//'over-all-labels'
		public Keyword getOverAllLabelsKeyword_4_0() { return cOverAllLabelsKeyword_4_0; }

		//':'
		public Keyword getColonKeyword_4_1() { return cColonKeyword_4_1; }

		//applyonAll=EBoolean
		public Assignment getApplyonAllAssignment_4_2() { return cApplyonAllAssignment_4_2; }

		//EBoolean
		public RuleCall getApplyonAllEBooleanParserRuleCall_4_2_0() { return cApplyonAllEBooleanParserRuleCall_4_2_0; }

		//ownedLabelAlignment=LabelAlignementCustomization?
		public Assignment getOwnedLabelAlignmentAssignment_5() { return cOwnedLabelAlignmentAssignment_5; }

		//LabelAlignementCustomization
		public RuleCall getOwnedLabelAlignmentLabelAlignementCustomizationParserRuleCall_5_0() { return cOwnedLabelAlignmentLabelAlignementCustomizationParserRuleCall_5_0; }

		//('size' ':' size=EInt)?
		public Group getGroup_6() { return cGroup_6; }

		//'size'
		public Keyword getSizeKeyword_6_0() { return cSizeKeyword_6_0; }

		//':'
		public Keyword getColonKeyword_6_1() { return cColonKeyword_6_1; }

		//size=EInt
		public Assignment getSizeAssignment_6_2() { return cSizeAssignment_6_2; }

		//EInt
		public RuleCall getSizeEIntParserRuleCall_6_2_0() { return cSizeEIntParserRuleCall_6_2_0; }

		//('format' ':' format=FontFormat)?
		public Group getGroup_7() { return cGroup_7; }

		//'format'
		public Keyword getFormatKeyword_7_0() { return cFormatKeyword_7_0; }

		//':'
		public Keyword getColonKeyword_7_1() { return cColonKeyword_7_1; }

		//format=FontFormat
		public Assignment getFormatAssignment_7_2() { return cFormatAssignment_7_2; }

		//FontFormat
		public RuleCall getFormatFontFormatEnumRuleCall_7_2_0() { return cFormatFontFormatEnumRuleCall_7_2_0; }

		//('color' ':' color=SystemColors)
		public Group getGroup_8() { return cGroup_8; }

		//'color'
		public Keyword getColorKeyword_8_0() { return cColorKeyword_8_0; }

		//':'
		public Keyword getColonKeyword_8_1() { return cColonKeyword_8_1; }

		//color=SystemColors
		public Assignment getColorAssignment_8_2() { return cColorAssignment_8_2; }

		//SystemColors
		public RuleCall getColorSystemColorsEnumRuleCall_8_2_0() { return cColorSystemColorsEnumRuleCall_8_2_0; }

		//('icon' '{' 'show' ':' showIcon=EBoolean 'path' ':' iconPath=EString '}')?
		public Group getGroup_9() { return cGroup_9; }

		//'icon'
		public Keyword getIconKeyword_9_0() { return cIconKeyword_9_0; }

		//'{'
		public Keyword getLeftCurlyBracketKeyword_9_1() { return cLeftCurlyBracketKeyword_9_1; }

		//'show'
		public Keyword getShowKeyword_9_2() { return cShowKeyword_9_2; }

		//':'
		public Keyword getColonKeyword_9_3() { return cColonKeyword_9_3; }

		//showIcon=EBoolean
		public Assignment getShowIconAssignment_9_4() { return cShowIconAssignment_9_4; }

		//EBoolean
		public RuleCall getShowIconEBooleanParserRuleCall_9_4_0() { return cShowIconEBooleanParserRuleCall_9_4_0; }

		//'path'
		public Keyword getPathKeyword_9_5() { return cPathKeyword_9_5; }

		//':'
		public Keyword getColonKeyword_9_6() { return cColonKeyword_9_6; }

		//iconPath=EString
		public Assignment getIconPathAssignment_9_7() { return cIconPathAssignment_9_7; }

		//EString
		public RuleCall getIconPathEStringParserRuleCall_9_7_0() { return cIconPathEStringParserRuleCall_9_7_0; }

		//'}'
		public Keyword getRightCurlyBracketKeyword_9_8() { return cRightCurlyBracketKeyword_9_8; }

		//('expression' ':' expression=CustomizationExpression)?
		public Group getGroup_10() { return cGroup_10; }

		//'expression'
		public Keyword getExpressionKeyword_10_0() { return cExpressionKeyword_10_0; }

		//':'
		public Keyword getColonKeyword_10_1() { return cColonKeyword_10_1; }

		//expression=CustomizationExpression
		public Assignment getExpressionAssignment_10_2() { return cExpressionAssignment_10_2; }

		//CustomizationExpression
		public RuleCall getExpressionCustomizationExpressionParserRuleCall_10_2_0() { return cExpressionCustomizationExpressionParserRuleCall_10_2_0; }

		//'}'
		public Keyword getRightCurlyBracketKeyword_11() { return cRightCurlyBracketKeyword_11; }
	}

	public class LabelAlignementCustomizationElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.Vpdiagram.LabelAlignementCustomization");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cLabelAlignmentCustomizationAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cAlignmentKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cColonKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cAlignmentAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cAlignmentLabelAlignmentEnumRuleCall_3_0 = (RuleCall)cAlignmentAssignment_3.eContents().get(0);
		
		//LabelAlignementCustomization styleCusto::LabelAlignmentCustomization:
		//	{styleCusto::LabelAlignmentCustomization} 'alignment' ':' alignment=LabelAlignment
		@Override public ParserRule getRule() { return rule; }

		//{styleCusto::LabelAlignmentCustomization} 'alignment' ':' alignment=LabelAlignment
		public Group getGroup() { return cGroup; }

		//{styleCusto::LabelAlignmentCustomization}
		public Action getLabelAlignmentCustomizationAction_0() { return cLabelAlignmentCustomizationAction_0; }

		//'alignment'
		public Keyword getAlignmentKeyword_1() { return cAlignmentKeyword_1; }

		//':'
		public Keyword getColonKeyword_2() { return cColonKeyword_2; }

		//alignment=LabelAlignment
		public Assignment getAlignmentAssignment_3() { return cAlignmentAssignment_3; }

		//LabelAlignment
		public RuleCall getAlignmentLabelAlignmentEnumRuleCall_3_0() { return cAlignmentLabelAlignmentEnumRuleCall_3_0; }
	}

	public class AbstractNodeStyleCustomizationElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.Vpdiagram.AbstractNodeStyleCustomization");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cContainerStyleCustomizationParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cNodeStyleCustomizationParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		
		//AbstractNodeStyleCustomization styleCusto::AbstractNodeStyleCustomization:
		//	ContainerStyleCustomization | NodeStyleCustomization
		@Override public ParserRule getRule() { return rule; }

		//ContainerStyleCustomization | NodeStyleCustomization
		public Alternatives getAlternatives() { return cAlternatives; }

		//ContainerStyleCustomization
		public RuleCall getContainerStyleCustomizationParserRuleCall_0() { return cContainerStyleCustomizationParserRuleCall_0; }

		//NodeStyleCustomization
		public RuleCall getNodeStyleCustomizationParserRuleCall_1() { return cNodeStyleCustomizationParserRuleCall_1; }
	}

	public class ContainerStyleCustomizationElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.Vpdiagram.ContainerStyleCustomization");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cContainerStyleCustomizationAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cContainerKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Group cGroup_2 = (Group)cGroup.eContents().get(2);
		private final Keyword cLeftParenthesisKeyword_2_0 = (Keyword)cGroup_2.eContents().get(0);
		private final Group cGroup_2_1 = (Group)cGroup_2.eContents().get(1);
		private final Assignment cAppliedOnAssignment_2_1_0 = (Assignment)cGroup_2_1.eContents().get(0);
		private final CrossReference cAppliedOnContainerStyleDescriptionCrossReference_2_1_0_0 = (CrossReference)cAppliedOnAssignment_2_1_0.eContents().get(0);
		private final RuleCall cAppliedOnContainerStyleDescriptionSTRINGTerminalRuleCall_2_1_0_0_1 = (RuleCall)cAppliedOnContainerStyleDescriptionCrossReference_2_1_0_0.eContents().get(1);
		private final Group cGroup_2_1_1 = (Group)cGroup_2_1.eContents().get(1);
		private final Keyword cCommaKeyword_2_1_1_0 = (Keyword)cGroup_2_1_1.eContents().get(0);
		private final Assignment cAppliedOnAssignment_2_1_1_1 = (Assignment)cGroup_2_1_1.eContents().get(1);
		private final CrossReference cAppliedOnContainerStyleDescriptionCrossReference_2_1_1_1_0 = (CrossReference)cAppliedOnAssignment_2_1_1_1.eContents().get(0);
		private final RuleCall cAppliedOnContainerStyleDescriptionSTRINGTerminalRuleCall_2_1_1_1_0_1 = (RuleCall)cAppliedOnContainerStyleDescriptionCrossReference_2_1_1_1_0.eContents().get(1);
		private final Keyword cRightParenthesisKeyword_2_2 = (Keyword)cGroup_2.eContents().get(2);
		private final Keyword cLeftCurlyBracketKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Group cGroup_4 = (Group)cGroup.eContents().get(4);
		private final Keyword cOverAllContainersKeyword_4_0 = (Keyword)cGroup_4.eContents().get(0);
		private final Keyword cColonKeyword_4_1 = (Keyword)cGroup_4.eContents().get(1);
		private final Assignment cApplyonAllAssignment_4_2 = (Assignment)cGroup_4.eContents().get(2);
		private final RuleCall cApplyonAllEBooleanParserRuleCall_4_2_0 = (RuleCall)cApplyonAllAssignment_4_2.eContents().get(0);
		private final Group cGroup_5 = (Group)cGroup.eContents().get(5);
		private final Keyword cWidthKeyword_5_0 = (Keyword)cGroup_5.eContents().get(0);
		private final Keyword cColonKeyword_5_1 = (Keyword)cGroup_5.eContents().get(1);
		private final Assignment cArcWithAssignment_5_2 = (Assignment)cGroup_5.eContents().get(2);
		private final RuleCall cArcWithEIntParserRuleCall_5_2_0 = (RuleCall)cArcWithAssignment_5_2.eContents().get(0);
		private final Group cGroup_6 = (Group)cGroup.eContents().get(6);
		private final Keyword cHeightKeyword_6_0 = (Keyword)cGroup_6.eContents().get(0);
		private final Keyword cColonKeyword_6_1 = (Keyword)cGroup_6.eContents().get(1);
		private final Assignment cArcHeightAssignment_6_2 = (Assignment)cGroup_6.eContents().get(2);
		private final RuleCall cArcHeightEIntParserRuleCall_6_2_0 = (RuleCall)cArcHeightAssignment_6_2.eContents().get(0);
		private final Group cGroup_7 = (Group)cGroup.eContents().get(7);
		private final Keyword cRoundCornerKeyword_7_0 = (Keyword)cGroup_7.eContents().get(0);
		private final Keyword cColonKeyword_7_1 = (Keyword)cGroup_7.eContents().get(1);
		private final Assignment cRoundedCornerAssignment_7_2 = (Assignment)cGroup_7.eContents().get(2);
		private final RuleCall cRoundedCornerEBooleanParserRuleCall_7_2_0 = (RuleCall)cRoundedCornerAssignment_7_2.eContents().get(0);
		private final Group cGroup_8 = (Group)cGroup.eContents().get(8);
		private final Keyword cTooltipExpressionKeyword_8_0 = (Keyword)cGroup_8.eContents().get(0);
		private final Keyword cColonKeyword_8_1 = (Keyword)cGroup_8.eContents().get(1);
		private final Assignment cTooltipExpressionAssignment_8_2 = (Assignment)cGroup_8.eContents().get(2);
		private final RuleCall cTooltipExpressionCustomizationExpressionParserRuleCall_8_2_0 = (RuleCall)cTooltipExpressionAssignment_8_2.eContents().get(0);
		private final Group cGroup_9 = (Group)cGroup.eContents().get(9);
		private final Keyword cBorderDimensionKeyword_9_0 = (Keyword)cGroup_9.eContents().get(0);
		private final Keyword cColonKeyword_9_1 = (Keyword)cGroup_9.eContents().get(1);
		private final Assignment cBorderSizeComputationExpressionAssignment_9_2 = (Assignment)cGroup_9.eContents().get(2);
		private final RuleCall cBorderSizeComputationExpressionCustomizationExpressionParserRuleCall_9_2_0 = (RuleCall)cBorderSizeComputationExpressionAssignment_9_2.eContents().get(0);
		private final Assignment cOwnedSpecificContainerStyleCustomizationAssignment_10 = (Assignment)cGroup.eContents().get(10);
		private final RuleCall cOwnedSpecificContainerStyleCustomizationSpecificContainerStyleCustomizationParserRuleCall_10_0 = (RuleCall)cOwnedSpecificContainerStyleCustomizationAssignment_10.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_11 = (Keyword)cGroup.eContents().get(11);
		
		//ContainerStyleCustomization styleCusto::ContainerStyleCustomization:
		//	{styleCusto::ContainerStyleCustomization} 'container' ('('
		//	(appliedOn+=[siriusDDStyle::ContainerStyleDescription|STRING] (','
		//	appliedOn+=[siriusDDStyle::ContainerStyleDescription|STRING])*) ')')? '{' ('over-all-containers' ':'
		//	applyonAll=EBoolean)? ('width' ':' arcWith=EInt)? ('height' ':' arcHeight=EInt)? ('round-corner' ':'
		//	roundedCorner=EBoolean)? ('tooltip-expression' ':' tooltipExpression=CustomizationExpression)? ('border-dimension'
		//	':' borderSizeComputationExpression=CustomizationExpression)?
		//	ownedSpecificContainerStyleCustomization+=SpecificContainerStyleCustomization* '}'
		@Override public ParserRule getRule() { return rule; }

		//{styleCusto::ContainerStyleCustomization} 'container' ('(' (appliedOn+=[siriusDDStyle::ContainerStyleDescription|STRING]
		//(',' appliedOn+=[siriusDDStyle::ContainerStyleDescription|STRING])*) ')')? '{' ('over-all-containers' ':'
		//applyonAll=EBoolean)? ('width' ':' arcWith=EInt)? ('height' ':' arcHeight=EInt)? ('round-corner' ':'
		//roundedCorner=EBoolean)? ('tooltip-expression' ':' tooltipExpression=CustomizationExpression)? ('border-dimension' ':'
		//borderSizeComputationExpression=CustomizationExpression)?
		//ownedSpecificContainerStyleCustomization+=SpecificContainerStyleCustomization* '}'
		public Group getGroup() { return cGroup; }

		//{styleCusto::ContainerStyleCustomization}
		public Action getContainerStyleCustomizationAction_0() { return cContainerStyleCustomizationAction_0; }

		//'container'
		public Keyword getContainerKeyword_1() { return cContainerKeyword_1; }

		//('(' (appliedOn+=[siriusDDStyle::ContainerStyleDescription|STRING] (','
		//appliedOn+=[siriusDDStyle::ContainerStyleDescription|STRING])*) ')')?
		public Group getGroup_2() { return cGroup_2; }

		//'('
		public Keyword getLeftParenthesisKeyword_2_0() { return cLeftParenthesisKeyword_2_0; }

		//(appliedOn+=[siriusDDStyle::ContainerStyleDescription|STRING] (','
		//appliedOn+=[siriusDDStyle::ContainerStyleDescription|STRING])*)
		public Group getGroup_2_1() { return cGroup_2_1; }

		//appliedOn+=[siriusDDStyle::ContainerStyleDescription|STRING]
		public Assignment getAppliedOnAssignment_2_1_0() { return cAppliedOnAssignment_2_1_0; }

		//[siriusDDStyle::ContainerStyleDescription|STRING]
		public CrossReference getAppliedOnContainerStyleDescriptionCrossReference_2_1_0_0() { return cAppliedOnContainerStyleDescriptionCrossReference_2_1_0_0; }

		//STRING
		public RuleCall getAppliedOnContainerStyleDescriptionSTRINGTerminalRuleCall_2_1_0_0_1() { return cAppliedOnContainerStyleDescriptionSTRINGTerminalRuleCall_2_1_0_0_1; }

		//(',' appliedOn+=[siriusDDStyle::ContainerStyleDescription|STRING])*
		public Group getGroup_2_1_1() { return cGroup_2_1_1; }

		//','
		public Keyword getCommaKeyword_2_1_1_0() { return cCommaKeyword_2_1_1_0; }

		//appliedOn+=[siriusDDStyle::ContainerStyleDescription|STRING]
		public Assignment getAppliedOnAssignment_2_1_1_1() { return cAppliedOnAssignment_2_1_1_1; }

		//[siriusDDStyle::ContainerStyleDescription|STRING]
		public CrossReference getAppliedOnContainerStyleDescriptionCrossReference_2_1_1_1_0() { return cAppliedOnContainerStyleDescriptionCrossReference_2_1_1_1_0; }

		//STRING
		public RuleCall getAppliedOnContainerStyleDescriptionSTRINGTerminalRuleCall_2_1_1_1_0_1() { return cAppliedOnContainerStyleDescriptionSTRINGTerminalRuleCall_2_1_1_1_0_1; }

		//')'
		public Keyword getRightParenthesisKeyword_2_2() { return cRightParenthesisKeyword_2_2; }

		//'{'
		public Keyword getLeftCurlyBracketKeyword_3() { return cLeftCurlyBracketKeyword_3; }

		//('over-all-containers' ':' applyonAll=EBoolean)?
		public Group getGroup_4() { return cGroup_4; }

		//'over-all-containers'
		public Keyword getOverAllContainersKeyword_4_0() { return cOverAllContainersKeyword_4_0; }

		//':'
		public Keyword getColonKeyword_4_1() { return cColonKeyword_4_1; }

		//applyonAll=EBoolean
		public Assignment getApplyonAllAssignment_4_2() { return cApplyonAllAssignment_4_2; }

		//EBoolean
		public RuleCall getApplyonAllEBooleanParserRuleCall_4_2_0() { return cApplyonAllEBooleanParserRuleCall_4_2_0; }

		//('width' ':' arcWith=EInt)?
		public Group getGroup_5() { return cGroup_5; }

		//'width'
		public Keyword getWidthKeyword_5_0() { return cWidthKeyword_5_0; }

		//':'
		public Keyword getColonKeyword_5_1() { return cColonKeyword_5_1; }

		//arcWith=EInt
		public Assignment getArcWithAssignment_5_2() { return cArcWithAssignment_5_2; }

		//EInt
		public RuleCall getArcWithEIntParserRuleCall_5_2_0() { return cArcWithEIntParserRuleCall_5_2_0; }

		//('height' ':' arcHeight=EInt)?
		public Group getGroup_6() { return cGroup_6; }

		//'height'
		public Keyword getHeightKeyword_6_0() { return cHeightKeyword_6_0; }

		//':'
		public Keyword getColonKeyword_6_1() { return cColonKeyword_6_1; }

		//arcHeight=EInt
		public Assignment getArcHeightAssignment_6_2() { return cArcHeightAssignment_6_2; }

		//EInt
		public RuleCall getArcHeightEIntParserRuleCall_6_2_0() { return cArcHeightEIntParserRuleCall_6_2_0; }

		//('round-corner' ':' roundedCorner=EBoolean)?
		public Group getGroup_7() { return cGroup_7; }

		//'round-corner'
		public Keyword getRoundCornerKeyword_7_0() { return cRoundCornerKeyword_7_0; }

		//':'
		public Keyword getColonKeyword_7_1() { return cColonKeyword_7_1; }

		//roundedCorner=EBoolean
		public Assignment getRoundedCornerAssignment_7_2() { return cRoundedCornerAssignment_7_2; }

		//EBoolean
		public RuleCall getRoundedCornerEBooleanParserRuleCall_7_2_0() { return cRoundedCornerEBooleanParserRuleCall_7_2_0; }

		//('tooltip-expression' ':' tooltipExpression=CustomizationExpression)?
		public Group getGroup_8() { return cGroup_8; }

		//'tooltip-expression'
		public Keyword getTooltipExpressionKeyword_8_0() { return cTooltipExpressionKeyword_8_0; }

		//':'
		public Keyword getColonKeyword_8_1() { return cColonKeyword_8_1; }

		//tooltipExpression=CustomizationExpression
		public Assignment getTooltipExpressionAssignment_8_2() { return cTooltipExpressionAssignment_8_2; }

		//CustomizationExpression
		public RuleCall getTooltipExpressionCustomizationExpressionParserRuleCall_8_2_0() { return cTooltipExpressionCustomizationExpressionParserRuleCall_8_2_0; }

		//('border-dimension' ':' borderSizeComputationExpression=CustomizationExpression)?
		public Group getGroup_9() { return cGroup_9; }

		//'border-dimension'
		public Keyword getBorderDimensionKeyword_9_0() { return cBorderDimensionKeyword_9_0; }

		//':'
		public Keyword getColonKeyword_9_1() { return cColonKeyword_9_1; }

		//borderSizeComputationExpression=CustomizationExpression
		public Assignment getBorderSizeComputationExpressionAssignment_9_2() { return cBorderSizeComputationExpressionAssignment_9_2; }

		//CustomizationExpression
		public RuleCall getBorderSizeComputationExpressionCustomizationExpressionParserRuleCall_9_2_0() { return cBorderSizeComputationExpressionCustomizationExpressionParserRuleCall_9_2_0; }

		//ownedSpecificContainerStyleCustomization+=SpecificContainerStyleCustomization*
		public Assignment getOwnedSpecificContainerStyleCustomizationAssignment_10() { return cOwnedSpecificContainerStyleCustomizationAssignment_10; }

		//SpecificContainerStyleCustomization
		public RuleCall getOwnedSpecificContainerStyleCustomizationSpecificContainerStyleCustomizationParserRuleCall_10_0() { return cOwnedSpecificContainerStyleCustomizationSpecificContainerStyleCustomizationParserRuleCall_10_0; }

		//'}'
		public Keyword getRightCurlyBracketKeyword_11() { return cRightCurlyBracketKeyword_11; }
	}

	public class SpecificContainerStyleCustomizationElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.Vpdiagram.SpecificContainerStyleCustomization");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cContainerWorkspaceImageCustomizationParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cFlatContainerStyleCustomizationParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		private final RuleCall cShapeContainerStyleCustomizationParserRuleCall_2 = (RuleCall)cAlternatives.eContents().get(2);
		
		//SpecificContainerStyleCustomization styleCusto::SpecificContainerStyleCustomization:
		//	ContainerWorkspaceImageCustomization | FlatContainerStyleCustomization | ShapeContainerStyleCustomization
		@Override public ParserRule getRule() { return rule; }

		//ContainerWorkspaceImageCustomization | FlatContainerStyleCustomization | ShapeContainerStyleCustomization
		public Alternatives getAlternatives() { return cAlternatives; }

		//ContainerWorkspaceImageCustomization
		public RuleCall getContainerWorkspaceImageCustomizationParserRuleCall_0() { return cContainerWorkspaceImageCustomizationParserRuleCall_0; }

		//FlatContainerStyleCustomization
		public RuleCall getFlatContainerStyleCustomizationParserRuleCall_1() { return cFlatContainerStyleCustomizationParserRuleCall_1; }

		//ShapeContainerStyleCustomization
		public RuleCall getShapeContainerStyleCustomizationParserRuleCall_2() { return cShapeContainerStyleCustomizationParserRuleCall_2; }
	}

	public class ContainerWorkspaceImageCustomizationElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.Vpdiagram.ContainerWorkspaceImageCustomization");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cContainerWorkspaceImageCustomizationAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cWorkspaceKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cColonKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cWorkspacePathAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cWorkspacePathEStringParserRuleCall_3_0 = (RuleCall)cWorkspacePathAssignment_3.eContents().get(0);
		
		//ContainerWorkspaceImageCustomization styleCusto::ContainerWorkspaceImageCustomization:
		//	{styleCusto::ContainerWorkspaceImageCustomization} 'workspace' ':' workspacePath=EString
		@Override public ParserRule getRule() { return rule; }

		//{styleCusto::ContainerWorkspaceImageCustomization} 'workspace' ':' workspacePath=EString
		public Group getGroup() { return cGroup; }

		//{styleCusto::ContainerWorkspaceImageCustomization}
		public Action getContainerWorkspaceImageCustomizationAction_0() { return cContainerWorkspaceImageCustomizationAction_0; }

		//'workspace'
		public Keyword getWorkspaceKeyword_1() { return cWorkspaceKeyword_1; }

		//':'
		public Keyword getColonKeyword_2() { return cColonKeyword_2; }

		//workspacePath=EString
		public Assignment getWorkspacePathAssignment_3() { return cWorkspacePathAssignment_3; }

		//EString
		public RuleCall getWorkspacePathEStringParserRuleCall_3_0() { return cWorkspacePathEStringParserRuleCall_3_0; }
	}

	public class FlatContainerStyleCustomizationElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.Vpdiagram.FlatContainerStyleCustomization");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cFlatContainerStyleCustomizationAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cBackgroundKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cColonKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cBackgroundStyleAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cBackgroundStyleBackgroundStyleEnumRuleCall_3_0 = (RuleCall)cBackgroundStyleAssignment_3.eContents().get(0);
		
		//FlatContainerStyleCustomization styleCusto::FlatContainerStyleCustomization:
		//	{styleCusto::FlatContainerStyleCustomization} 'background' ':' backgroundStyle=BackgroundStyle
		@Override public ParserRule getRule() { return rule; }

		//{styleCusto::FlatContainerStyleCustomization} 'background' ':' backgroundStyle=BackgroundStyle
		public Group getGroup() { return cGroup; }

		//{styleCusto::FlatContainerStyleCustomization}
		public Action getFlatContainerStyleCustomizationAction_0() { return cFlatContainerStyleCustomizationAction_0; }

		//'background'
		public Keyword getBackgroundKeyword_1() { return cBackgroundKeyword_1; }

		//':'
		public Keyword getColonKeyword_2() { return cColonKeyword_2; }

		//backgroundStyle=BackgroundStyle
		public Assignment getBackgroundStyleAssignment_3() { return cBackgroundStyleAssignment_3; }

		//BackgroundStyle
		public RuleCall getBackgroundStyleBackgroundStyleEnumRuleCall_3_0() { return cBackgroundStyleBackgroundStyleEnumRuleCall_3_0; }
	}

	public class ShapeContainerStyleCustomizationElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.Vpdiagram.ShapeContainerStyleCustomization");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cShapeContainerStyleCustomizationAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cShapeKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cColonKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cShapeAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cShapeContainerShapeEnumRuleCall_3_0 = (RuleCall)cShapeAssignment_3.eContents().get(0);
		
		//ShapeContainerStyleCustomization styleCusto::ShapeContainerStyleCustomization:
		//	{styleCusto::ShapeContainerStyleCustomization} 'shape' ':' shape=ContainerShape
		@Override public ParserRule getRule() { return rule; }

		//{styleCusto::ShapeContainerStyleCustomization} 'shape' ':' shape=ContainerShape
		public Group getGroup() { return cGroup; }

		//{styleCusto::ShapeContainerStyleCustomization}
		public Action getShapeContainerStyleCustomizationAction_0() { return cShapeContainerStyleCustomizationAction_0; }

		//'shape'
		public Keyword getShapeKeyword_1() { return cShapeKeyword_1; }

		//':'
		public Keyword getColonKeyword_2() { return cColonKeyword_2; }

		//shape=ContainerShape
		public Assignment getShapeAssignment_3() { return cShapeAssignment_3; }

		//ContainerShape
		public RuleCall getShapeContainerShapeEnumRuleCall_3_0() { return cShapeContainerShapeEnumRuleCall_3_0; }
	}

	public class NodeStyleCustomizationElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.Vpdiagram.NodeStyleCustomization");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cNodeStyleCustomizationAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cNodeKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Group cGroup_2 = (Group)cGroup.eContents().get(2);
		private final Keyword cLeftParenthesisKeyword_2_0 = (Keyword)cGroup_2.eContents().get(0);
		private final Group cGroup_2_1 = (Group)cGroup_2.eContents().get(1);
		private final Assignment cAppliedOnAssignment_2_1_0 = (Assignment)cGroup_2_1.eContents().get(0);
		private final CrossReference cAppliedOnNodeStyleDescriptionCrossReference_2_1_0_0 = (CrossReference)cAppliedOnAssignment_2_1_0.eContents().get(0);
		private final RuleCall cAppliedOnNodeStyleDescriptionSTRINGTerminalRuleCall_2_1_0_0_1 = (RuleCall)cAppliedOnNodeStyleDescriptionCrossReference_2_1_0_0.eContents().get(1);
		private final Group cGroup_2_1_1 = (Group)cGroup_2_1.eContents().get(1);
		private final Keyword cCommaKeyword_2_1_1_0 = (Keyword)cGroup_2_1_1.eContents().get(0);
		private final Assignment cAppliedOnAssignment_2_1_1_1 = (Assignment)cGroup_2_1_1.eContents().get(1);
		private final CrossReference cAppliedOnNodeStyleDescriptionCrossReference_2_1_1_1_0 = (CrossReference)cAppliedOnAssignment_2_1_1_1.eContents().get(0);
		private final RuleCall cAppliedOnNodeStyleDescriptionSTRINGTerminalRuleCall_2_1_1_1_0_1 = (RuleCall)cAppliedOnNodeStyleDescriptionCrossReference_2_1_1_1_0.eContents().get(1);
		private final Keyword cRightParenthesisKeyword_2_2 = (Keyword)cGroup_2.eContents().get(2);
		private final Keyword cLeftCurlyBracketKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Group cGroup_4 = (Group)cGroup.eContents().get(4);
		private final Keyword cOverAllNodesKeyword_4_0 = (Keyword)cGroup_4.eContents().get(0);
		private final Keyword cColonKeyword_4_1 = (Keyword)cGroup_4.eContents().get(1);
		private final Assignment cApplyonAllAssignment_4_2 = (Assignment)cGroup_4.eContents().get(2);
		private final RuleCall cApplyonAllEBooleanParserRuleCall_4_2_0 = (RuleCall)cApplyonAllAssignment_4_2.eContents().get(0);
		private final Group cGroup_5 = (Group)cGroup.eContents().get(5);
		private final Keyword cLabelPositionKeyword_5_0 = (Keyword)cGroup_5.eContents().get(0);
		private final Keyword cColonKeyword_5_1 = (Keyword)cGroup_5.eContents().get(1);
		private final Assignment cLabelPositionAssignment_5_2 = (Assignment)cGroup_5.eContents().get(2);
		private final RuleCall cLabelPositionLabelPositionEnumRuleCall_5_2_0 = (RuleCall)cLabelPositionAssignment_5_2.eContents().get(0);
		private final Group cGroup_6 = (Group)cGroup.eContents().get(6);
		private final Keyword cHideLabelKeyword_6_0 = (Keyword)cGroup_6.eContents().get(0);
		private final Keyword cColonKeyword_6_1 = (Keyword)cGroup_6.eContents().get(1);
		private final Assignment cHideLabelByDefaultAssignment_6_2 = (Assignment)cGroup_6.eContents().get(2);
		private final RuleCall cHideLabelByDefaultEBooleanParserRuleCall_6_2_0 = (RuleCall)cHideLabelByDefaultAssignment_6_2.eContents().get(0);
		private final Group cGroup_7 = (Group)cGroup.eContents().get(7);
		private final Keyword cResizeKindKeyword_7_0 = (Keyword)cGroup_7.eContents().get(0);
		private final Keyword cColonKeyword_7_1 = (Keyword)cGroup_7.eContents().get(1);
		private final Assignment cResizeKindAssignment_7_2 = (Assignment)cGroup_7.eContents().get(2);
		private final RuleCall cResizeKindResizeKindEnumRuleCall_7_2_0 = (RuleCall)cResizeKindAssignment_7_2.eContents().get(0);
		private final Group cGroup_8 = (Group)cGroup.eContents().get(8);
		private final Keyword cTooltipExpressionKeyword_8_0 = (Keyword)cGroup_8.eContents().get(0);
		private final Keyword cColonKeyword_8_1 = (Keyword)cGroup_8.eContents().get(1);
		private final Assignment cTooltipExpressionAssignment_8_2 = (Assignment)cGroup_8.eContents().get(2);
		private final RuleCall cTooltipExpressionCustomizationExpressionParserRuleCall_8_2_0 = (RuleCall)cTooltipExpressionAssignment_8_2.eContents().get(0);
		private final Group cGroup_9 = (Group)cGroup.eContents().get(9);
		private final Keyword cBorderDimensionKeyword_9_0 = (Keyword)cGroup_9.eContents().get(0);
		private final Keyword cColonKeyword_9_1 = (Keyword)cGroup_9.eContents().get(1);
		private final Assignment cBorderSizeComputationExpressionAssignment_9_2 = (Assignment)cGroup_9.eContents().get(2);
		private final RuleCall cBorderSizeComputationExpressionCustomizationExpressionParserRuleCall_9_2_0 = (RuleCall)cBorderSizeComputationExpressionAssignment_9_2.eContents().get(0);
		private final Group cGroup_10 = (Group)cGroup.eContents().get(10);
		private final Keyword cSizeDimensionKeyword_10_0 = (Keyword)cGroup_10.eContents().get(0);
		private final Keyword cColonKeyword_10_1 = (Keyword)cGroup_10.eContents().get(1);
		private final Assignment cSizeComputationExpressionAssignment_10_2 = (Assignment)cGroup_10.eContents().get(2);
		private final RuleCall cSizeComputationExpressionCustomizationExpressionParserRuleCall_10_2_0 = (RuleCall)cSizeComputationExpressionAssignment_10_2.eContents().get(0);
		private final Assignment cOwnedSpecificNodeStyleCustomizationAssignment_11 = (Assignment)cGroup.eContents().get(11);
		private final RuleCall cOwnedSpecificNodeStyleCustomizationSpecificNodeStyleCustomizationParserRuleCall_11_0 = (RuleCall)cOwnedSpecificNodeStyleCustomizationAssignment_11.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_12 = (Keyword)cGroup.eContents().get(12);
		
		//NodeStyleCustomization styleCusto::NodeStyleCustomization:
		//	{styleCusto::NodeStyleCustomization} 'node' ('(' (appliedOn+=[siriusDDStyle::NodeStyleDescription|STRING] (','
		//	appliedOn+=[siriusDDStyle::NodeStyleDescription|STRING])*) ')')? '{' ('over-all-nodes' ':' applyonAll=EBoolean)?
		//	('label-position' ':' labelPosition=LabelPosition)? ('hide-label' ':' hideLabelByDefault=EBoolean)? ('resize-kind'
		//	':' resizeKind=ResizeKind)? ('tooltip-expression' ':' tooltipExpression=CustomizationExpression)? ('border-dimension'
		//	':' borderSizeComputationExpression=CustomizationExpression)? ('size-dimension' ':'
		//	sizeComputationExpression=CustomizationExpression)?
		//	ownedSpecificNodeStyleCustomization+=SpecificNodeStyleCustomization* '}'
		@Override public ParserRule getRule() { return rule; }

		//{styleCusto::NodeStyleCustomization} 'node' ('(' (appliedOn+=[siriusDDStyle::NodeStyleDescription|STRING] (','
		//appliedOn+=[siriusDDStyle::NodeStyleDescription|STRING])*) ')')? '{' ('over-all-nodes' ':' applyonAll=EBoolean)?
		//('label-position' ':' labelPosition=LabelPosition)? ('hide-label' ':' hideLabelByDefault=EBoolean)? ('resize-kind' ':'
		//resizeKind=ResizeKind)? ('tooltip-expression' ':' tooltipExpression=CustomizationExpression)? ('border-dimension' ':'
		//borderSizeComputationExpression=CustomizationExpression)? ('size-dimension' ':'
		//sizeComputationExpression=CustomizationExpression)?
		//ownedSpecificNodeStyleCustomization+=SpecificNodeStyleCustomization* '}'
		public Group getGroup() { return cGroup; }

		//{styleCusto::NodeStyleCustomization}
		public Action getNodeStyleCustomizationAction_0() { return cNodeStyleCustomizationAction_0; }

		//'node'
		public Keyword getNodeKeyword_1() { return cNodeKeyword_1; }

		//('(' (appliedOn+=[siriusDDStyle::NodeStyleDescription|STRING] (','
		//appliedOn+=[siriusDDStyle::NodeStyleDescription|STRING])*) ')')?
		public Group getGroup_2() { return cGroup_2; }

		//'('
		public Keyword getLeftParenthesisKeyword_2_0() { return cLeftParenthesisKeyword_2_0; }

		//(appliedOn+=[siriusDDStyle::NodeStyleDescription|STRING] (',' appliedOn+=[siriusDDStyle::NodeStyleDescription|STRING])*)
		public Group getGroup_2_1() { return cGroup_2_1; }

		//appliedOn+=[siriusDDStyle::NodeStyleDescription|STRING]
		public Assignment getAppliedOnAssignment_2_1_0() { return cAppliedOnAssignment_2_1_0; }

		//[siriusDDStyle::NodeStyleDescription|STRING]
		public CrossReference getAppliedOnNodeStyleDescriptionCrossReference_2_1_0_0() { return cAppliedOnNodeStyleDescriptionCrossReference_2_1_0_0; }

		//STRING
		public RuleCall getAppliedOnNodeStyleDescriptionSTRINGTerminalRuleCall_2_1_0_0_1() { return cAppliedOnNodeStyleDescriptionSTRINGTerminalRuleCall_2_1_0_0_1; }

		//(',' appliedOn+=[siriusDDStyle::NodeStyleDescription|STRING])*
		public Group getGroup_2_1_1() { return cGroup_2_1_1; }

		//','
		public Keyword getCommaKeyword_2_1_1_0() { return cCommaKeyword_2_1_1_0; }

		//appliedOn+=[siriusDDStyle::NodeStyleDescription|STRING]
		public Assignment getAppliedOnAssignment_2_1_1_1() { return cAppliedOnAssignment_2_1_1_1; }

		//[siriusDDStyle::NodeStyleDescription|STRING]
		public CrossReference getAppliedOnNodeStyleDescriptionCrossReference_2_1_1_1_0() { return cAppliedOnNodeStyleDescriptionCrossReference_2_1_1_1_0; }

		//STRING
		public RuleCall getAppliedOnNodeStyleDescriptionSTRINGTerminalRuleCall_2_1_1_1_0_1() { return cAppliedOnNodeStyleDescriptionSTRINGTerminalRuleCall_2_1_1_1_0_1; }

		//')'
		public Keyword getRightParenthesisKeyword_2_2() { return cRightParenthesisKeyword_2_2; }

		//'{'
		public Keyword getLeftCurlyBracketKeyword_3() { return cLeftCurlyBracketKeyword_3; }

		//('over-all-nodes' ':' applyonAll=EBoolean)?
		public Group getGroup_4() { return cGroup_4; }

		//'over-all-nodes'
		public Keyword getOverAllNodesKeyword_4_0() { return cOverAllNodesKeyword_4_0; }

		//':'
		public Keyword getColonKeyword_4_1() { return cColonKeyword_4_1; }

		//applyonAll=EBoolean
		public Assignment getApplyonAllAssignment_4_2() { return cApplyonAllAssignment_4_2; }

		//EBoolean
		public RuleCall getApplyonAllEBooleanParserRuleCall_4_2_0() { return cApplyonAllEBooleanParserRuleCall_4_2_0; }

		//('label-position' ':' labelPosition=LabelPosition)?
		public Group getGroup_5() { return cGroup_5; }

		//'label-position'
		public Keyword getLabelPositionKeyword_5_0() { return cLabelPositionKeyword_5_0; }

		//':'
		public Keyword getColonKeyword_5_1() { return cColonKeyword_5_1; }

		//labelPosition=LabelPosition
		public Assignment getLabelPositionAssignment_5_2() { return cLabelPositionAssignment_5_2; }

		//LabelPosition
		public RuleCall getLabelPositionLabelPositionEnumRuleCall_5_2_0() { return cLabelPositionLabelPositionEnumRuleCall_5_2_0; }

		//('hide-label' ':' hideLabelByDefault=EBoolean)?
		public Group getGroup_6() { return cGroup_6; }

		//'hide-label'
		public Keyword getHideLabelKeyword_6_0() { return cHideLabelKeyword_6_0; }

		//':'
		public Keyword getColonKeyword_6_1() { return cColonKeyword_6_1; }

		//hideLabelByDefault=EBoolean
		public Assignment getHideLabelByDefaultAssignment_6_2() { return cHideLabelByDefaultAssignment_6_2; }

		//EBoolean
		public RuleCall getHideLabelByDefaultEBooleanParserRuleCall_6_2_0() { return cHideLabelByDefaultEBooleanParserRuleCall_6_2_0; }

		//('resize-kind' ':' resizeKind=ResizeKind)?
		public Group getGroup_7() { return cGroup_7; }

		//'resize-kind'
		public Keyword getResizeKindKeyword_7_0() { return cResizeKindKeyword_7_0; }

		//':'
		public Keyword getColonKeyword_7_1() { return cColonKeyword_7_1; }

		//resizeKind=ResizeKind
		public Assignment getResizeKindAssignment_7_2() { return cResizeKindAssignment_7_2; }

		//ResizeKind
		public RuleCall getResizeKindResizeKindEnumRuleCall_7_2_0() { return cResizeKindResizeKindEnumRuleCall_7_2_0; }

		//('tooltip-expression' ':' tooltipExpression=CustomizationExpression)?
		public Group getGroup_8() { return cGroup_8; }

		//'tooltip-expression'
		public Keyword getTooltipExpressionKeyword_8_0() { return cTooltipExpressionKeyword_8_0; }

		//':'
		public Keyword getColonKeyword_8_1() { return cColonKeyword_8_1; }

		//tooltipExpression=CustomizationExpression
		public Assignment getTooltipExpressionAssignment_8_2() { return cTooltipExpressionAssignment_8_2; }

		//CustomizationExpression
		public RuleCall getTooltipExpressionCustomizationExpressionParserRuleCall_8_2_0() { return cTooltipExpressionCustomizationExpressionParserRuleCall_8_2_0; }

		//('border-dimension' ':' borderSizeComputationExpression=CustomizationExpression)?
		public Group getGroup_9() { return cGroup_9; }

		//'border-dimension'
		public Keyword getBorderDimensionKeyword_9_0() { return cBorderDimensionKeyword_9_0; }

		//':'
		public Keyword getColonKeyword_9_1() { return cColonKeyword_9_1; }

		//borderSizeComputationExpression=CustomizationExpression
		public Assignment getBorderSizeComputationExpressionAssignment_9_2() { return cBorderSizeComputationExpressionAssignment_9_2; }

		//CustomizationExpression
		public RuleCall getBorderSizeComputationExpressionCustomizationExpressionParserRuleCall_9_2_0() { return cBorderSizeComputationExpressionCustomizationExpressionParserRuleCall_9_2_0; }

		//('size-dimension' ':' sizeComputationExpression=CustomizationExpression)?
		public Group getGroup_10() { return cGroup_10; }

		//'size-dimension'
		public Keyword getSizeDimensionKeyword_10_0() { return cSizeDimensionKeyword_10_0; }

		//':'
		public Keyword getColonKeyword_10_1() { return cColonKeyword_10_1; }

		//sizeComputationExpression=CustomizationExpression
		public Assignment getSizeComputationExpressionAssignment_10_2() { return cSizeComputationExpressionAssignment_10_2; }

		//CustomizationExpression
		public RuleCall getSizeComputationExpressionCustomizationExpressionParserRuleCall_10_2_0() { return cSizeComputationExpressionCustomizationExpressionParserRuleCall_10_2_0; }

		//ownedSpecificNodeStyleCustomization+=SpecificNodeStyleCustomization*
		public Assignment getOwnedSpecificNodeStyleCustomizationAssignment_11() { return cOwnedSpecificNodeStyleCustomizationAssignment_11; }

		//SpecificNodeStyleCustomization
		public RuleCall getOwnedSpecificNodeStyleCustomizationSpecificNodeStyleCustomizationParserRuleCall_11_0() { return cOwnedSpecificNodeStyleCustomizationSpecificNodeStyleCustomizationParserRuleCall_11_0; }

		//'}'
		public Keyword getRightCurlyBracketKeyword_12() { return cRightCurlyBracketKeyword_12; }
	}

	public class SpecificNodeStyleCustomizationElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.Vpdiagram.SpecificNodeStyleCustomization");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cBundledImageCustomizationParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cLozengeCustomizationParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		private final RuleCall cGaugeCustomizationParserRuleCall_2 = (RuleCall)cAlternatives.eContents().get(2);
		private final RuleCall cEllipseCustomizationParserRuleCall_3 = (RuleCall)cAlternatives.eContents().get(3);
		private final RuleCall cNodeWorkspaceImageCustomizationParserRuleCall_4 = (RuleCall)cAlternatives.eContents().get(4);
		private final RuleCall cSquareCustomizationParserRuleCall_5 = (RuleCall)cAlternatives.eContents().get(5);
		private final RuleCall cDotCustomizationParserRuleCall_6 = (RuleCall)cAlternatives.eContents().get(6);
		
		//SpecificNodeStyleCustomization styleCusto::SpecificNodeStyleCustomization:
		//	BundledImageCustomization | LozengeCustomization | GaugeCustomization | EllipseCustomization |
		//	NodeWorkspaceImageCustomization | SquareCustomization | DotCustomization
		@Override public ParserRule getRule() { return rule; }

		//BundledImageCustomization | LozengeCustomization | GaugeCustomization | EllipseCustomization |
		//NodeWorkspaceImageCustomization | SquareCustomization | DotCustomization
		public Alternatives getAlternatives() { return cAlternatives; }

		//BundledImageCustomization
		public RuleCall getBundledImageCustomizationParserRuleCall_0() { return cBundledImageCustomizationParserRuleCall_0; }

		//LozengeCustomization
		public RuleCall getLozengeCustomizationParserRuleCall_1() { return cLozengeCustomizationParserRuleCall_1; }

		//GaugeCustomization
		public RuleCall getGaugeCustomizationParserRuleCall_2() { return cGaugeCustomizationParserRuleCall_2; }

		//EllipseCustomization
		public RuleCall getEllipseCustomizationParserRuleCall_3() { return cEllipseCustomizationParserRuleCall_3; }

		//NodeWorkspaceImageCustomization
		public RuleCall getNodeWorkspaceImageCustomizationParserRuleCall_4() { return cNodeWorkspaceImageCustomizationParserRuleCall_4; }

		//SquareCustomization
		public RuleCall getSquareCustomizationParserRuleCall_5() { return cSquareCustomizationParserRuleCall_5; }

		//DotCustomization
		public RuleCall getDotCustomizationParserRuleCall_6() { return cDotCustomizationParserRuleCall_6; }
	}

	public class BundledImageCustomizationElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.Vpdiagram.BundledImageCustomization");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cBundledImageCustomizationAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cShapeKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cColonKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cShapeAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cShapeBundledImageShapeEnumRuleCall_3_0 = (RuleCall)cShapeAssignment_3.eContents().get(0);
		
		//BundledImageCustomization styleCusto::BundledImageCustomization:
		//	{styleCusto::BundledImageCustomization} 'shape' ':' shape=BundledImageShape
		@Override public ParserRule getRule() { return rule; }

		//{styleCusto::BundledImageCustomization} 'shape' ':' shape=BundledImageShape
		public Group getGroup() { return cGroup; }

		//{styleCusto::BundledImageCustomization}
		public Action getBundledImageCustomizationAction_0() { return cBundledImageCustomizationAction_0; }

		//'shape'
		public Keyword getShapeKeyword_1() { return cShapeKeyword_1; }

		//':'
		public Keyword getColonKeyword_2() { return cColonKeyword_2; }

		//shape=BundledImageShape
		public Assignment getShapeAssignment_3() { return cShapeAssignment_3; }

		//BundledImageShape
		public RuleCall getShapeBundledImageShapeEnumRuleCall_3_0() { return cShapeBundledImageShapeEnumRuleCall_3_0; }
	}

	public class LozengeCustomizationElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.Vpdiagram.LozengeCustomization");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cLozengeCustomizationAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cLozengeDimensionKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cColonKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Keyword cLeftCurlyBracketKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Keyword cWidthKeyword_4 = (Keyword)cGroup.eContents().get(4);
		private final Keyword cColonKeyword_5 = (Keyword)cGroup.eContents().get(5);
		private final Assignment cWidthComputationExpressionAssignment_6 = (Assignment)cGroup.eContents().get(6);
		private final RuleCall cWidthComputationExpressionCustomizationExpressionParserRuleCall_6_0 = (RuleCall)cWidthComputationExpressionAssignment_6.eContents().get(0);
		private final Keyword cHeightKeyword_7 = (Keyword)cGroup.eContents().get(7);
		private final Keyword cColonKeyword_8 = (Keyword)cGroup.eContents().get(8);
		private final Assignment cHeightComputationExpressionAssignment_9 = (Assignment)cGroup.eContents().get(9);
		private final RuleCall cHeightComputationExpressionCustomizationExpressionParserRuleCall_9_0 = (RuleCall)cHeightComputationExpressionAssignment_9.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_10 = (Keyword)cGroup.eContents().get(10);
		
		//LozengeCustomization styleCusto::LozengeCustomization:
		//	{styleCusto::LozengeCustomization} 'lozenge-dimension' ':' '{' 'width' ':'
		//	widthComputationExpression=CustomizationExpression 'height' ':' heightComputationExpression=CustomizationExpression
		//	'}'
		@Override public ParserRule getRule() { return rule; }

		//{styleCusto::LozengeCustomization} 'lozenge-dimension' ':' '{' 'width' ':'
		//widthComputationExpression=CustomizationExpression 'height' ':' heightComputationExpression=CustomizationExpression
		//'}'
		public Group getGroup() { return cGroup; }

		//{styleCusto::LozengeCustomization}
		public Action getLozengeCustomizationAction_0() { return cLozengeCustomizationAction_0; }

		//'lozenge-dimension'
		public Keyword getLozengeDimensionKeyword_1() { return cLozengeDimensionKeyword_1; }

		//':'
		public Keyword getColonKeyword_2() { return cColonKeyword_2; }

		//'{'
		public Keyword getLeftCurlyBracketKeyword_3() { return cLeftCurlyBracketKeyword_3; }

		//'width'
		public Keyword getWidthKeyword_4() { return cWidthKeyword_4; }

		//':'
		public Keyword getColonKeyword_5() { return cColonKeyword_5; }

		//widthComputationExpression=CustomizationExpression
		public Assignment getWidthComputationExpressionAssignment_6() { return cWidthComputationExpressionAssignment_6; }

		//CustomizationExpression
		public RuleCall getWidthComputationExpressionCustomizationExpressionParserRuleCall_6_0() { return cWidthComputationExpressionCustomizationExpressionParserRuleCall_6_0; }

		//'height'
		public Keyword getHeightKeyword_7() { return cHeightKeyword_7; }

		//':'
		public Keyword getColonKeyword_8() { return cColonKeyword_8; }

		//heightComputationExpression=CustomizationExpression
		public Assignment getHeightComputationExpressionAssignment_9() { return cHeightComputationExpressionAssignment_9; }

		//CustomizationExpression
		public RuleCall getHeightComputationExpressionCustomizationExpressionParserRuleCall_9_0() { return cHeightComputationExpressionCustomizationExpressionParserRuleCall_9_0; }

		//'}'
		public Keyword getRightCurlyBracketKeyword_10() { return cRightCurlyBracketKeyword_10; }
	}

	public class GaugeCustomizationElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.Vpdiagram.GaugeCustomization");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cGaugeCustomizationAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cGaugeAlignmentKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cColonKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cAlignementAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cAlignementAlignmentKindEnumRuleCall_3_0 = (RuleCall)cAlignementAssignment_3.eContents().get(0);
		
		//GaugeCustomization styleCusto::GaugeCustomization:
		//	{styleCusto::GaugeCustomization} 'gauge-alignment' ':' alignement=AlignmentKind
		@Override public ParserRule getRule() { return rule; }

		//{styleCusto::GaugeCustomization} 'gauge-alignment' ':' alignement=AlignmentKind
		public Group getGroup() { return cGroup; }

		//{styleCusto::GaugeCustomization}
		public Action getGaugeCustomizationAction_0() { return cGaugeCustomizationAction_0; }

		//'gauge-alignment'
		public Keyword getGaugeAlignmentKeyword_1() { return cGaugeAlignmentKeyword_1; }

		//':'
		public Keyword getColonKeyword_2() { return cColonKeyword_2; }

		//alignement=AlignmentKind
		public Assignment getAlignementAssignment_3() { return cAlignementAssignment_3; }

		//AlignmentKind
		public RuleCall getAlignementAlignmentKindEnumRuleCall_3_0() { return cAlignementAlignmentKindEnumRuleCall_3_0; }
	}

	public class EllipseCustomizationElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.Vpdiagram.EllipseCustomization");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cEllipseCustomizationAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cEllipseDimensionKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cColonKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Keyword cLeftCurlyBracketKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Keyword cHorizontalKeyword_4 = (Keyword)cGroup.eContents().get(4);
		private final Keyword cColonKeyword_5 = (Keyword)cGroup.eContents().get(5);
		private final Assignment cHorizontalDiameterComputationExpressionAssignment_6 = (Assignment)cGroup.eContents().get(6);
		private final RuleCall cHorizontalDiameterComputationExpressionCustomizationExpressionParserRuleCall_6_0 = (RuleCall)cHorizontalDiameterComputationExpressionAssignment_6.eContents().get(0);
		private final Keyword cVerticalKeyword_7 = (Keyword)cGroup.eContents().get(7);
		private final Keyword cColonKeyword_8 = (Keyword)cGroup.eContents().get(8);
		private final Assignment cVerticalDiameterComputationExpressionAssignment_9 = (Assignment)cGroup.eContents().get(9);
		private final RuleCall cVerticalDiameterComputationExpressionCustomizationExpressionParserRuleCall_9_0 = (RuleCall)cVerticalDiameterComputationExpressionAssignment_9.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_10 = (Keyword)cGroup.eContents().get(10);
		
		//EllipseCustomization styleCusto::EllipseCustomization:
		//	{styleCusto::EllipseCustomization} 'ellipse-dimension' ':' '{' 'horizontal' ':'
		//	horizontalDiameterComputationExpression=CustomizationExpression 'vertical' ':'
		//	verticalDiameterComputationExpression=CustomizationExpression '}'
		@Override public ParserRule getRule() { return rule; }

		//{styleCusto::EllipseCustomization} 'ellipse-dimension' ':' '{' 'horizontal' ':'
		//horizontalDiameterComputationExpression=CustomizationExpression 'vertical' ':'
		//verticalDiameterComputationExpression=CustomizationExpression '}'
		public Group getGroup() { return cGroup; }

		//{styleCusto::EllipseCustomization}
		public Action getEllipseCustomizationAction_0() { return cEllipseCustomizationAction_0; }

		//'ellipse-dimension'
		public Keyword getEllipseDimensionKeyword_1() { return cEllipseDimensionKeyword_1; }

		//':'
		public Keyword getColonKeyword_2() { return cColonKeyword_2; }

		//'{'
		public Keyword getLeftCurlyBracketKeyword_3() { return cLeftCurlyBracketKeyword_3; }

		//'horizontal'
		public Keyword getHorizontalKeyword_4() { return cHorizontalKeyword_4; }

		//':'
		public Keyword getColonKeyword_5() { return cColonKeyword_5; }

		//horizontalDiameterComputationExpression=CustomizationExpression
		public Assignment getHorizontalDiameterComputationExpressionAssignment_6() { return cHorizontalDiameterComputationExpressionAssignment_6; }

		//CustomizationExpression
		public RuleCall getHorizontalDiameterComputationExpressionCustomizationExpressionParserRuleCall_6_0() { return cHorizontalDiameterComputationExpressionCustomizationExpressionParserRuleCall_6_0; }

		//'vertical'
		public Keyword getVerticalKeyword_7() { return cVerticalKeyword_7; }

		//':'
		public Keyword getColonKeyword_8() { return cColonKeyword_8; }

		//verticalDiameterComputationExpression=CustomizationExpression
		public Assignment getVerticalDiameterComputationExpressionAssignment_9() { return cVerticalDiameterComputationExpressionAssignment_9; }

		//CustomizationExpression
		public RuleCall getVerticalDiameterComputationExpressionCustomizationExpressionParserRuleCall_9_0() { return cVerticalDiameterComputationExpressionCustomizationExpressionParserRuleCall_9_0; }

		//'}'
		public Keyword getRightCurlyBracketKeyword_10() { return cRightCurlyBracketKeyword_10; }
	}

	public class NodeWorkspaceImageCustomizationElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.Vpdiagram.NodeWorkspaceImageCustomization");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cNodeWorkspaceImageCustomizationAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cWorkspaceKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cColonKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cWorkspacePathAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cWorkspacePathEStringParserRuleCall_3_0 = (RuleCall)cWorkspacePathAssignment_3.eContents().get(0);
		
		//NodeWorkspaceImageCustomization styleCusto::NodeWorkspaceImageCustomization:
		//	{styleCusto::NodeWorkspaceImageCustomization} 'workspace' ':' workspacePath=EString
		@Override public ParserRule getRule() { return rule; }

		//{styleCusto::NodeWorkspaceImageCustomization} 'workspace' ':' workspacePath=EString
		public Group getGroup() { return cGroup; }

		//{styleCusto::NodeWorkspaceImageCustomization}
		public Action getNodeWorkspaceImageCustomizationAction_0() { return cNodeWorkspaceImageCustomizationAction_0; }

		//'workspace'
		public Keyword getWorkspaceKeyword_1() { return cWorkspaceKeyword_1; }

		//':'
		public Keyword getColonKeyword_2() { return cColonKeyword_2; }

		//workspacePath=EString
		public Assignment getWorkspacePathAssignment_3() { return cWorkspacePathAssignment_3; }

		//EString
		public RuleCall getWorkspacePathEStringParserRuleCall_3_0() { return cWorkspacePathEStringParserRuleCall_3_0; }
	}

	public class SquareCustomizationElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.Vpdiagram.SquareCustomization");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cSquareCustomizationAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cSquareDimensionKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cColonKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Keyword cLeftCurlyBracketKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Keyword cWidthKeyword_4 = (Keyword)cGroup.eContents().get(4);
		private final Keyword cColonKeyword_5 = (Keyword)cGroup.eContents().get(5);
		private final Assignment cWidthAssignment_6 = (Assignment)cGroup.eContents().get(6);
		private final RuleCall cWidthEIntParserRuleCall_6_0 = (RuleCall)cWidthAssignment_6.eContents().get(0);
		private final Keyword cHeightKeyword_7 = (Keyword)cGroup.eContents().get(7);
		private final Keyword cColonKeyword_8 = (Keyword)cGroup.eContents().get(8);
		private final Assignment cHeightAssignment_9 = (Assignment)cGroup.eContents().get(9);
		private final RuleCall cHeightEIntParserRuleCall_9_0 = (RuleCall)cHeightAssignment_9.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_10 = (Keyword)cGroup.eContents().get(10);
		
		//SquareCustomization styleCusto::SquareCustomization:
		//	{styleCusto::SquareCustomization} 'square-dimension' ':' '{' 'width' ':' width=EInt 'height' ':' height=EInt '}'
		@Override public ParserRule getRule() { return rule; }

		//{styleCusto::SquareCustomization} 'square-dimension' ':' '{' 'width' ':' width=EInt 'height' ':' height=EInt '}'
		public Group getGroup() { return cGroup; }

		//{styleCusto::SquareCustomization}
		public Action getSquareCustomizationAction_0() { return cSquareCustomizationAction_0; }

		//'square-dimension'
		public Keyword getSquareDimensionKeyword_1() { return cSquareDimensionKeyword_1; }

		//':'
		public Keyword getColonKeyword_2() { return cColonKeyword_2; }

		//'{'
		public Keyword getLeftCurlyBracketKeyword_3() { return cLeftCurlyBracketKeyword_3; }

		//'width'
		public Keyword getWidthKeyword_4() { return cWidthKeyword_4; }

		//':'
		public Keyword getColonKeyword_5() { return cColonKeyword_5; }

		//width=EInt
		public Assignment getWidthAssignment_6() { return cWidthAssignment_6; }

		//EInt
		public RuleCall getWidthEIntParserRuleCall_6_0() { return cWidthEIntParserRuleCall_6_0; }

		//'height'
		public Keyword getHeightKeyword_7() { return cHeightKeyword_7; }

		//':'
		public Keyword getColonKeyword_8() { return cColonKeyword_8; }

		//height=EInt
		public Assignment getHeightAssignment_9() { return cHeightAssignment_9; }

		//EInt
		public RuleCall getHeightEIntParserRuleCall_9_0() { return cHeightEIntParserRuleCall_9_0; }

		//'}'
		public Keyword getRightCurlyBracketKeyword_10() { return cRightCurlyBracketKeyword_10; }
	}

	public class DotCustomizationElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.Vpdiagram.DotCustomization");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cDotCustomizationAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cStrokeDimensionKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cColonKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cStrokeSizeComputationExpressionAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cStrokeSizeComputationExpressionCustomizationExpressionParserRuleCall_3_0 = (RuleCall)cStrokeSizeComputationExpressionAssignment_3.eContents().get(0);
		
		//DotCustomization styleCusto::DotCustomization:
		//	{styleCusto::DotCustomization} 'stroke-dimension' ':' strokeSizeComputationExpression=CustomizationExpression
		@Override public ParserRule getRule() { return rule; }

		//{styleCusto::DotCustomization} 'stroke-dimension' ':' strokeSizeComputationExpression=CustomizationExpression
		public Group getGroup() { return cGroup; }

		//{styleCusto::DotCustomization}
		public Action getDotCustomizationAction_0() { return cDotCustomizationAction_0; }

		//'stroke-dimension'
		public Keyword getStrokeDimensionKeyword_1() { return cStrokeDimensionKeyword_1; }

		//':'
		public Keyword getColonKeyword_2() { return cColonKeyword_2; }

		//strokeSizeComputationExpression=CustomizationExpression
		public Assignment getStrokeSizeComputationExpressionAssignment_3() { return cStrokeSizeComputationExpressionAssignment_3; }

		//CustomizationExpression
		public RuleCall getStrokeSizeComputationExpressionCustomizationExpressionParserRuleCall_3_0() { return cStrokeSizeComputationExpressionCustomizationExpressionParserRuleCall_3_0; }
	}

	public class StyleCustomizationReuseElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.Vpdiagram.StyleCustomizationReuse");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cStyleCustomizationReuseAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cReuseKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Group cGroup_2 = (Group)cGroup.eContents().get(2);
		private final Assignment cReusedCustomizationAssignment_2_0 = (Assignment)cGroup_2.eContents().get(0);
		private final CrossReference cReusedCustomizationEStructuralFeatureCustomizationCrossReference_2_0_0 = (CrossReference)cReusedCustomizationAssignment_2_0.eContents().get(0);
		private final RuleCall cReusedCustomizationEStructuralFeatureCustomizationSTRINGTerminalRuleCall_2_0_0_1 = (RuleCall)cReusedCustomizationEStructuralFeatureCustomizationCrossReference_2_0_0.eContents().get(1);
		private final Group cGroup_2_1 = (Group)cGroup_2.eContents().get(1);
		private final Keyword cCommaKeyword_2_1_0 = (Keyword)cGroup_2_1.eContents().get(0);
		private final Assignment cReusedCustomizationAssignment_2_1_1 = (Assignment)cGroup_2_1.eContents().get(1);
		private final CrossReference cReusedCustomizationEStructuralFeatureCustomizationCrossReference_2_1_1_0 = (CrossReference)cReusedCustomizationAssignment_2_1_1.eContents().get(0);
		private final RuleCall cReusedCustomizationEStructuralFeatureCustomizationSTRINGTerminalRuleCall_2_1_1_0_1 = (RuleCall)cReusedCustomizationEStructuralFeatureCustomizationCrossReference_2_1_1_0.eContents().get(1);
		private final Keyword cOnKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Group cGroup_4 = (Group)cGroup.eContents().get(4);
		private final Assignment cAppliedOnAssignment_4_0 = (Assignment)cGroup_4.eContents().get(0);
		private final CrossReference cAppliedOnEObjectCrossReference_4_0_0 = (CrossReference)cAppliedOnAssignment_4_0.eContents().get(0);
		private final RuleCall cAppliedOnEObjectSTRINGTerminalRuleCall_4_0_0_1 = (RuleCall)cAppliedOnEObjectCrossReference_4_0_0.eContents().get(1);
		private final Group cGroup_4_1 = (Group)cGroup_4.eContents().get(1);
		private final Keyword cCommaKeyword_4_1_0 = (Keyword)cGroup_4_1.eContents().get(0);
		private final Assignment cAppliedOnAssignment_4_1_1 = (Assignment)cGroup_4_1.eContents().get(1);
		private final CrossReference cAppliedOnEObjectCrossReference_4_1_1_0 = (CrossReference)cAppliedOnAssignment_4_1_1.eContents().get(0);
		private final RuleCall cAppliedOnEObjectSTRINGTerminalRuleCall_4_1_1_0_1 = (RuleCall)cAppliedOnEObjectCrossReference_4_1_1_0.eContents().get(1);
		
		//StyleCustomizationReuse styleCusto::StyleCustomizationReuse:
		//	{styleCusto::StyleCustomizationReuse} 'reuse'
		//	(reusedCustomization+=[siriusDescription::EStructuralFeatureCustomization|STRING] (','
		//	reusedCustomization+=[siriusDescription::EStructuralFeatureCustomization|STRING])*) 'on'
		//	(appliedOn+=[ecore::EObject|STRING] (',' appliedOn+=[ecore::EObject|STRING])*)
		@Override public ParserRule getRule() { return rule; }

		//{styleCusto::StyleCustomizationReuse} 'reuse'
		//(reusedCustomization+=[siriusDescription::EStructuralFeatureCustomization|STRING] (','
		//reusedCustomization+=[siriusDescription::EStructuralFeatureCustomization|STRING])*) 'on'
		//(appliedOn+=[ecore::EObject|STRING] (',' appliedOn+=[ecore::EObject|STRING])*)
		public Group getGroup() { return cGroup; }

		//{styleCusto::StyleCustomizationReuse}
		public Action getStyleCustomizationReuseAction_0() { return cStyleCustomizationReuseAction_0; }

		//'reuse'
		public Keyword getReuseKeyword_1() { return cReuseKeyword_1; }

		//(reusedCustomization+=[siriusDescription::EStructuralFeatureCustomization|STRING] (','
		//reusedCustomization+=[siriusDescription::EStructuralFeatureCustomization|STRING])*)
		public Group getGroup_2() { return cGroup_2; }

		//reusedCustomization+=[siriusDescription::EStructuralFeatureCustomization|STRING]
		public Assignment getReusedCustomizationAssignment_2_0() { return cReusedCustomizationAssignment_2_0; }

		//[siriusDescription::EStructuralFeatureCustomization|STRING]
		public CrossReference getReusedCustomizationEStructuralFeatureCustomizationCrossReference_2_0_0() { return cReusedCustomizationEStructuralFeatureCustomizationCrossReference_2_0_0; }

		//STRING
		public RuleCall getReusedCustomizationEStructuralFeatureCustomizationSTRINGTerminalRuleCall_2_0_0_1() { return cReusedCustomizationEStructuralFeatureCustomizationSTRINGTerminalRuleCall_2_0_0_1; }

		//(',' reusedCustomization+=[siriusDescription::EStructuralFeatureCustomization|STRING])*
		public Group getGroup_2_1() { return cGroup_2_1; }

		//','
		public Keyword getCommaKeyword_2_1_0() { return cCommaKeyword_2_1_0; }

		//reusedCustomization+=[siriusDescription::EStructuralFeatureCustomization|STRING]
		public Assignment getReusedCustomizationAssignment_2_1_1() { return cReusedCustomizationAssignment_2_1_1; }

		//[siriusDescription::EStructuralFeatureCustomization|STRING]
		public CrossReference getReusedCustomizationEStructuralFeatureCustomizationCrossReference_2_1_1_0() { return cReusedCustomizationEStructuralFeatureCustomizationCrossReference_2_1_1_0; }

		//STRING
		public RuleCall getReusedCustomizationEStructuralFeatureCustomizationSTRINGTerminalRuleCall_2_1_1_0_1() { return cReusedCustomizationEStructuralFeatureCustomizationSTRINGTerminalRuleCall_2_1_1_0_1; }

		//'on'
		public Keyword getOnKeyword_3() { return cOnKeyword_3; }

		//(appliedOn+=[ecore::EObject|STRING] (',' appliedOn+=[ecore::EObject|STRING])*)
		public Group getGroup_4() { return cGroup_4; }

		//appliedOn+=[ecore::EObject|STRING]
		public Assignment getAppliedOnAssignment_4_0() { return cAppliedOnAssignment_4_0; }

		//[ecore::EObject|STRING]
		public CrossReference getAppliedOnEObjectCrossReference_4_0_0() { return cAppliedOnEObjectCrossReference_4_0_0; }

		//STRING
		public RuleCall getAppliedOnEObjectSTRINGTerminalRuleCall_4_0_0_1() { return cAppliedOnEObjectSTRINGTerminalRuleCall_4_0_0_1; }

		//(',' appliedOn+=[ecore::EObject|STRING])*
		public Group getGroup_4_1() { return cGroup_4_1; }

		//','
		public Keyword getCommaKeyword_4_1_0() { return cCommaKeyword_4_1_0; }

		//appliedOn+=[ecore::EObject|STRING]
		public Assignment getAppliedOnAssignment_4_1_1() { return cAppliedOnAssignment_4_1_1; }

		//[ecore::EObject|STRING]
		public CrossReference getAppliedOnEObjectCrossReference_4_1_1_0() { return cAppliedOnEObjectCrossReference_4_1_1_0; }

		//STRING
		public RuleCall getAppliedOnEObjectSTRINGTerminalRuleCall_4_1_1_0_1() { return cAppliedOnEObjectSTRINGTerminalRuleCall_4_1_1_0_1; }
	}

	public class CustomizationExpressionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.Vpdiagram.CustomizationExpression");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cCustomizationExpressionAction_0 = (Action)cGroup.eContents().get(0);
		private final Assignment cOwnedExpressionElementAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cOwnedExpressionElementAbstractComputableElementParserRuleCall_1_0 = (RuleCall)cOwnedExpressionElementAssignment_1.eContents().get(0);
		
		//CustomizationExpression styleCusto::CustomizationExpression:
		//	{styleCusto::CustomizationExpression} ownedExpressionElement=AbstractComputableElement
		@Override public ParserRule getRule() { return rule; }

		//{styleCusto::CustomizationExpression} ownedExpressionElement=AbstractComputableElement
		public Group getGroup() { return cGroup; }

		//{styleCusto::CustomizationExpression}
		public Action getCustomizationExpressionAction_0() { return cCustomizationExpressionAction_0; }

		//ownedExpressionElement=AbstractComputableElement
		public Assignment getOwnedExpressionElementAssignment_1() { return cOwnedExpressionElementAssignment_1; }

		//AbstractComputableElement
		public RuleCall getOwnedExpressionElementAbstractComputableElementParserRuleCall_1_0() { return cOwnedExpressionElementAbstractComputableElementParserRuleCall_1_0; }
	}

	public class AbstractClassElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.Vpdiagram.AbstractClass");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cLocalClass2ParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cExternalClassParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		
		/// ********************************************************************
		// * 							Common data
		// * 
		// ******************************************************************** /
		//AbstractClass commondata::AbstractClass:
		//	LocalClass2 | ExternalClass
		@Override public ParserRule getRule() { return rule; }

		//LocalClass2 | ExternalClass
		public Alternatives getAlternatives() { return cAlternatives; }

		//LocalClass2
		public RuleCall getLocalClass2ParserRuleCall_0() { return cLocalClass2ParserRuleCall_0; }

		//ExternalClass
		public RuleCall getExternalClassParserRuleCall_1() { return cExternalClassParserRuleCall_1; }
	}

	public class LocalClass2Elements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.Vpdiagram.LocalClass2");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cLocalClassAction_0 = (Action)cGroup.eContents().get(0);
		private final Assignment cClassAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final CrossReference cClassClassCrossReference_1_0 = (CrossReference)cClassAssignment_1.eContents().get(0);
		private final RuleCall cClassClassFQNParserRuleCall_1_0_1 = (RuleCall)cClassClassCrossReference_1_0.eContents().get(1);
		
		//LocalClass2 commondata::AbstractClass:
		//	{commondata::LocalClass} class=[vpdesc::Class|FQN]
		@Override public ParserRule getRule() { return rule; }

		//{commondata::LocalClass} class=[vpdesc::Class|FQN]
		public Group getGroup() { return cGroup; }

		//{commondata::LocalClass}
		public Action getLocalClassAction_0() { return cLocalClassAction_0; }

		//class=[vpdesc::Class|FQN]
		public Assignment getClassAssignment_1() { return cClassAssignment_1; }

		//[vpdesc::Class|FQN]
		public CrossReference getClassClassCrossReference_1_0() { return cClassClassCrossReference_1_0; }

		//FQN
		public RuleCall getClassClassFQNParserRuleCall_1_0_1() { return cClassClassFQNParserRuleCall_1_0_1; }
	}

	public class ExternalClassElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.Vpdiagram.ExternalClass");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cExternalClassAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cExternalKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cClassAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final CrossReference cClassEClassCrossReference_2_0 = (CrossReference)cClassAssignment_2.eContents().get(0);
		private final RuleCall cClassEClassFQNParserRuleCall_2_0_1 = (RuleCall)cClassEClassCrossReference_2_0.eContents().get(1);
		
		//ExternalClass commondata::AbstractClass:
		//	{commondata::ExternalClass} 'external' class=[ecore::EClass|FQN]
		@Override public ParserRule getRule() { return rule; }

		//{commondata::ExternalClass} 'external' class=[ecore::EClass|FQN]
		public Group getGroup() { return cGroup; }

		//{commondata::ExternalClass}
		public Action getExternalClassAction_0() { return cExternalClassAction_0; }

		//'external'
		public Keyword getExternalKeyword_1() { return cExternalKeyword_1; }

		//class=[ecore::EClass|FQN]
		public Assignment getClassAssignment_2() { return cClassAssignment_2; }

		//[ecore::EClass|FQN]
		public CrossReference getClassEClassCrossReference_2_0() { return cClassEClassCrossReference_2_0; }

		//FQN
		public RuleCall getClassEClassFQNParserRuleCall_2_0_1() { return cClassEClassFQNParserRuleCall_2_0_1; }
	}

	public class AbstractAssociation2Elements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.Vpdiagram.AbstractAssociation2");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cExternalAssociationParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cLocalAssociationParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		
		//AbstractAssociation2 commondata::AbstractAssociation:
		//	ExternalAssociation | LocalAssociation
		@Override public ParserRule getRule() { return rule; }

		//ExternalAssociation | LocalAssociation
		public Alternatives getAlternatives() { return cAlternatives; }

		//ExternalAssociation
		public RuleCall getExternalAssociationParserRuleCall_0() { return cExternalAssociationParserRuleCall_0; }

		//LocalAssociation
		public RuleCall getLocalAssociationParserRuleCall_1() { return cLocalAssociationParserRuleCall_1; }
	}

	public class LocalAssociationElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.Vpdiagram.LocalAssociation");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cLocalAssociationAction_0 = (Action)cGroup.eContents().get(0);
		private final Assignment cReferenceAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final CrossReference cReferenceAbstractAssociationCrossReference_1_0 = (CrossReference)cReferenceAssignment_1.eContents().get(0);
		private final RuleCall cReferenceAbstractAssociationFQNParserRuleCall_1_0_1 = (RuleCall)cReferenceAbstractAssociationCrossReference_1_0.eContents().get(1);
		
		//LocalAssociation commondata::AbstractAssociation:
		//	{commondata::LocalAssociation} reference=[vpdesc::AbstractAssociation|FQN]
		@Override public ParserRule getRule() { return rule; }

		//{commondata::LocalAssociation} reference=[vpdesc::AbstractAssociation|FQN]
		public Group getGroup() { return cGroup; }

		//{commondata::LocalAssociation}
		public Action getLocalAssociationAction_0() { return cLocalAssociationAction_0; }

		//reference=[vpdesc::AbstractAssociation|FQN]
		public Assignment getReferenceAssignment_1() { return cReferenceAssignment_1; }

		//[vpdesc::AbstractAssociation|FQN]
		public CrossReference getReferenceAbstractAssociationCrossReference_1_0() { return cReferenceAbstractAssociationCrossReference_1_0; }

		//FQN
		public RuleCall getReferenceAbstractAssociationFQNParserRuleCall_1_0_1() { return cReferenceAbstractAssociationFQNParserRuleCall_1_0_1; }
	}

	public class ExternalAssociationElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.Vpdiagram.ExternalAssociation");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cExternalAssociationAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cExternalKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cReferenceAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final CrossReference cReferenceEReferenceCrossReference_2_0 = (CrossReference)cReferenceAssignment_2.eContents().get(0);
		private final RuleCall cReferenceEReferenceFQNParserRuleCall_2_0_1 = (RuleCall)cReferenceEReferenceCrossReference_2_0.eContents().get(1);
		
		//ExternalAssociation commondata::AbstractAssociation:
		//	{commondata::ExternalAssociation} 'external' reference=[ecore::EReference|FQN]
		@Override public ParserRule getRule() { return rule; }

		//{commondata::ExternalAssociation} 'external' reference=[ecore::EReference|FQN]
		public Group getGroup() { return cGroup; }

		//{commondata::ExternalAssociation}
		public Action getExternalAssociationAction_0() { return cExternalAssociationAction_0; }

		//'external'
		public Keyword getExternalKeyword_1() { return cExternalKeyword_1; }

		//reference=[ecore::EReference|FQN]
		public Assignment getReferenceAssignment_2() { return cReferenceAssignment_2; }

		//[ecore::EReference|FQN]
		public CrossReference getReferenceEReferenceCrossReference_2_0() { return cReferenceEReferenceCrossReference_2_0; }

		//FQN
		public RuleCall getReferenceEReferenceFQNParserRuleCall_2_0_1() { return cReferenceEReferenceFQNParserRuleCall_2_0_1; }
	}

	public class AbstractAttributeElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.Vpdiagram.AbstractAttribute");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cExternalAttributeParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cLocalAttributeParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		
		//AbstractAttribute commondata::AbstractAttribute:
		//	ExternalAttribute | LocalAttribute
		@Override public ParserRule getRule() { return rule; }

		//ExternalAttribute | LocalAttribute
		public Alternatives getAlternatives() { return cAlternatives; }

		//ExternalAttribute
		public RuleCall getExternalAttributeParserRuleCall_0() { return cExternalAttributeParserRuleCall_0; }

		//LocalAttribute
		public RuleCall getLocalAttributeParserRuleCall_1() { return cLocalAttributeParserRuleCall_1; }
	}

	public class LocalAttributeElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.Vpdiagram.LocalAttribute");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cLocalAttributeAction_0 = (Action)cGroup.eContents().get(0);
		private final Assignment cAttributeAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final CrossReference cAttributeAttributeCrossReference_1_0 = (CrossReference)cAttributeAssignment_1.eContents().get(0);
		private final RuleCall cAttributeAttributeFQNParserRuleCall_1_0_1 = (RuleCall)cAttributeAttributeCrossReference_1_0.eContents().get(1);
		
		//LocalAttribute commondata::AbstractAttribute:
		//	{commondata::LocalAttribute} attribute=[vpdesc::Attribute|FQN]
		@Override public ParserRule getRule() { return rule; }

		//{commondata::LocalAttribute} attribute=[vpdesc::Attribute|FQN]
		public Group getGroup() { return cGroup; }

		//{commondata::LocalAttribute}
		public Action getLocalAttributeAction_0() { return cLocalAttributeAction_0; }

		//attribute=[vpdesc::Attribute|FQN]
		public Assignment getAttributeAssignment_1() { return cAttributeAssignment_1; }

		//[vpdesc::Attribute|FQN]
		public CrossReference getAttributeAttributeCrossReference_1_0() { return cAttributeAttributeCrossReference_1_0; }

		//FQN
		public RuleCall getAttributeAttributeFQNParserRuleCall_1_0_1() { return cAttributeAttributeFQNParserRuleCall_1_0_1; }
	}

	public class ExternalAttributeElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.Vpdiagram.ExternalAttribute");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cExternalAttributeAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cExternalKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cAttributeAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final CrossReference cAttributeEAttributeCrossReference_2_0 = (CrossReference)cAttributeAssignment_2.eContents().get(0);
		private final RuleCall cAttributeEAttributeFQNParserRuleCall_2_0_1 = (RuleCall)cAttributeEAttributeCrossReference_2_0.eContents().get(1);
		
		//ExternalAttribute commondata::AbstractAttribute:
		//	{commondata::ExternalAttribute} 'external' attribute=[ecore::EAttribute|FQN]
		@Override public ParserRule getRule() { return rule; }

		//{commondata::ExternalAttribute} 'external' attribute=[ecore::EAttribute|FQN]
		public Group getGroup() { return cGroup; }

		//{commondata::ExternalAttribute}
		public Action getExternalAttributeAction_0() { return cExternalAttributeAction_0; }

		//'external'
		public Keyword getExternalKeyword_1() { return cExternalKeyword_1; }

		//attribute=[ecore::EAttribute|FQN]
		public Assignment getAttributeAssignment_2() { return cAttributeAssignment_2; }

		//[ecore::EAttribute|FQN]
		public CrossReference getAttributeEAttributeCrossReference_2_0() { return cAttributeEAttributeCrossReference_2_0; }

		//FQN
		public RuleCall getAttributeEAttributeFQNParserRuleCall_2_0_1() { return cAttributeEAttributeFQNParserRuleCall_2_0_1; }
	}

	public class ExpressionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.Vpdiagram.Expression");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cExpressionAction_0 = (Action)cGroup.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Assignment cExpressionElementsAssignment_1_0 = (Assignment)cGroup_1.eContents().get(0);
		private final RuleCall cExpressionElementsExpressionElementParserRuleCall_1_0_0 = (RuleCall)cExpressionElementsAssignment_1_0.eContents().get(0);
		private final Group cGroup_1_1 = (Group)cGroup_1.eContents().get(1);
		private final Keyword cPlusSignKeyword_1_1_0 = (Keyword)cGroup_1_1.eContents().get(0);
		private final Assignment cExpressionElementsAssignment_1_1_1 = (Assignment)cGroup_1_1.eContents().get(1);
		private final RuleCall cExpressionElementsExpressionElementParserRuleCall_1_1_1_0 = (RuleCall)cExpressionElementsAssignment_1_1_1.eContents().get(0);
		
		/// ********************************************************************
		// * 							Expression
		// * 
		// ******************************************************************** /
		//Expression expression::Expression:
		//	{expression::Expression} (expressionElements+=ExpressionElement ('+' expressionElements+=ExpressionElement)*)?
		@Override public ParserRule getRule() { return rule; }

		//{expression::Expression} (expressionElements+=ExpressionElement ('+' expressionElements+=ExpressionElement)*)?
		public Group getGroup() { return cGroup; }

		//{expression::Expression}
		public Action getExpressionAction_0() { return cExpressionAction_0; }

		//(expressionElements+=ExpressionElement ('+' expressionElements+=ExpressionElement)*)?
		public Group getGroup_1() { return cGroup_1; }

		//expressionElements+=ExpressionElement
		public Assignment getExpressionElementsAssignment_1_0() { return cExpressionElementsAssignment_1_0; }

		//ExpressionElement
		public RuleCall getExpressionElementsExpressionElementParserRuleCall_1_0_0() { return cExpressionElementsExpressionElementParserRuleCall_1_0_0; }

		//('+' expressionElements+=ExpressionElement)*
		public Group getGroup_1_1() { return cGroup_1_1; }

		//'+'
		public Keyword getPlusSignKeyword_1_1_0() { return cPlusSignKeyword_1_1_0; }

		//expressionElements+=ExpressionElement
		public Assignment getExpressionElementsAssignment_1_1_1() { return cExpressionElementsAssignment_1_1_1; }

		//ExpressionElement
		public RuleCall getExpressionElementsExpressionElementParserRuleCall_1_1_1_0() { return cExpressionElementsExpressionElementParserRuleCall_1_1_1_0; }
	}

	public class AbstractComputableElementElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.Vpdiagram.AbstractComputableElement");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cJavaElementParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cStringElementParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		
		//AbstractComputableElement expression::AbstractComputableElement:
		//	JavaElement | StringElement
		@Override public ParserRule getRule() { return rule; }

		//JavaElement | StringElement
		public Alternatives getAlternatives() { return cAlternatives; }

		//JavaElement
		public RuleCall getJavaElementParserRuleCall_0() { return cJavaElementParserRuleCall_0; }

		//StringElement
		public RuleCall getStringElementParserRuleCall_1() { return cStringElementParserRuleCall_1; }
	}

	public class ExpressionElementElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.Vpdiagram.ExpressionElement");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cForeignExpressionElementParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cStringElementParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		
		//ExpressionElement expression::ExpressionElement:
		//	ForeignExpressionElement | StringElement
		@Override public ParserRule getRule() { return rule; }

		//ForeignExpressionElement | StringElement
		public Alternatives getAlternatives() { return cAlternatives; }

		//ForeignExpressionElement
		public RuleCall getForeignExpressionElementParserRuleCall_0() { return cForeignExpressionElementParserRuleCall_0; }

		//StringElement
		public RuleCall getStringElementParserRuleCall_1() { return cStringElementParserRuleCall_1; }
	}

	public class ForeignExpressionElementElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.Vpdiagram.ForeignExpressionElement");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cJavaElementParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cDomainElementParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		
		//ForeignExpressionElement expression::ForeignExpressionElement:
		//	JavaElement | DomainElement
		@Override public ParserRule getRule() { return rule; }

		//JavaElement | DomainElement
		public Alternatives getAlternatives() { return cAlternatives; }

		//JavaElement
		public RuleCall getJavaElementParserRuleCall_0() { return cJavaElementParserRuleCall_0; }

		//DomainElement
		public RuleCall getDomainElementParserRuleCall_1() { return cDomainElementParserRuleCall_1; }
	}

	public class JavaElementElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.Vpdiagram.JavaElement");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cJavaElementAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cJavaKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cMethodAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cMethodFQNParserRuleCall_2_0 = (RuleCall)cMethodAssignment_2.eContents().get(0);
		
		//JavaElement expression::JavaElement:
		//	{expression::JavaElement} 'Java' method=FQN
		@Override public ParserRule getRule() { return rule; }

		//{expression::JavaElement} 'Java' method=FQN
		public Group getGroup() { return cGroup; }

		//{expression::JavaElement}
		public Action getJavaElementAction_0() { return cJavaElementAction_0; }

		//'Java'
		public Keyword getJavaKeyword_1() { return cJavaKeyword_1; }

		//method=FQN
		public Assignment getMethodAssignment_2() { return cMethodAssignment_2; }

		//FQN
		public RuleCall getMethodFQNParserRuleCall_2_0() { return cMethodFQNParserRuleCall_2_0; }
	}

	public class DomainElementElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.Vpdiagram.DomainElement");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cDomainElementAction_0 = (Action)cGroup.eContents().get(0);
		private final Assignment cAttributeAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final CrossReference cAttributeAttributeCrossReference_1_0 = (CrossReference)cAttributeAssignment_1.eContents().get(0);
		private final RuleCall cAttributeAttributeFQNParserRuleCall_1_0_1 = (RuleCall)cAttributeAttributeCrossReference_1_0.eContents().get(1);
		
		//DomainElement expression::ForeignExpressionElement:
		//	{expression::DomainElement} attribute=[vpdesc::Attribute|FQN]
		@Override public ParserRule getRule() { return rule; }

		//{expression::DomainElement} attribute=[vpdesc::Attribute|FQN]
		public Group getGroup() { return cGroup; }

		//{expression::DomainElement}
		public Action getDomainElementAction_0() { return cDomainElementAction_0; }

		//attribute=[vpdesc::Attribute|FQN]
		public Assignment getAttributeAssignment_1() { return cAttributeAssignment_1; }

		//[vpdesc::Attribute|FQN]
		public CrossReference getAttributeAttributeCrossReference_1_0() { return cAttributeAttributeCrossReference_1_0; }

		//FQN
		public RuleCall getAttributeAttributeFQNParserRuleCall_1_0_1() { return cAttributeAttributeFQNParserRuleCall_1_0_1; }
	}

	public class StringElementElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.Vpdiagram.StringElement");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cStringElementAction_0 = (Action)cGroup.eContents().get(0);
		private final Assignment cValueAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cValueSTRINGTerminalRuleCall_1_0 = (RuleCall)cValueAssignment_1.eContents().get(0);
		
		//StringElement expression::StringElement:
		//	{expression::StringElement} value=STRING
		@Override public ParserRule getRule() { return rule; }

		//{expression::StringElement} value=STRING
		public Group getGroup() { return cGroup; }

		//{expression::StringElement}
		public Action getStringElementAction_0() { return cStringElementAction_0; }

		//value=STRING
		public Assignment getValueAssignment_1() { return cValueAssignment_1; }

		//STRING
		public RuleCall getValueSTRINGTerminalRuleCall_1_0() { return cValueSTRINGTerminalRuleCall_1_0; }
	}
	
	
	public class AlignmentKindElements extends AbstractEnumRuleElementFinder {
		private final EnumRule rule = (EnumRule) GrammarUtil.findRuleForName(getGrammar(), "org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.Vpdiagram.AlignmentKind");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final EnumLiteralDeclaration cHORIZONTALEnumLiteralDeclaration_0 = (EnumLiteralDeclaration)cAlternatives.eContents().get(0);
		private final Keyword cHORIZONTALHORIZONTALKeyword_0_0 = (Keyword)cHORIZONTALEnumLiteralDeclaration_0.eContents().get(0);
		private final EnumLiteralDeclaration cSQUAREEnumLiteralDeclaration_1 = (EnumLiteralDeclaration)cAlternatives.eContents().get(1);
		private final Keyword cSQUARESQUAREKeyword_1_0 = (Keyword)cSQUAREEnumLiteralDeclaration_1.eContents().get(0);
		private final EnumLiteralDeclaration cVERTICALEnumLiteralDeclaration_2 = (EnumLiteralDeclaration)cAlternatives.eContents().get(2);
		private final Keyword cVERTICALVERTICALKeyword_2_0 = (Keyword)cVERTICALEnumLiteralDeclaration_2.eContents().get(0);
		
		//enum AlignmentKind returns siriusDiagram::AlignmentKind:
		//	HORIZONTAL | SQUARE | VERTICAL;
		public EnumRule getRule() { return rule; }

		//HORIZONTAL | SQUARE | VERTICAL
		public Alternatives getAlternatives() { return cAlternatives; }

		//HORIZONTAL
		public EnumLiteralDeclaration getHORIZONTALEnumLiteralDeclaration_0() { return cHORIZONTALEnumLiteralDeclaration_0; }

		//'HORIZONTAL'
		public Keyword getHORIZONTALHORIZONTALKeyword_0_0() { return cHORIZONTALHORIZONTALKeyword_0_0; }

		//SQUARE
		public EnumLiteralDeclaration getSQUAREEnumLiteralDeclaration_1() { return cSQUAREEnumLiteralDeclaration_1; }

		//'SQUARE'
		public Keyword getSQUARESQUAREKeyword_1_0() { return cSQUARESQUAREKeyword_1_0; }

		//VERTICAL
		public EnumLiteralDeclaration getVERTICALEnumLiteralDeclaration_2() { return cVERTICALEnumLiteralDeclaration_2; }

		//'VERTICAL'
		public Keyword getVERTICALVERTICALKeyword_2_0() { return cVERTICALVERTICALKeyword_2_0; }
	}

	public class BundledImageShapeElements extends AbstractEnumRuleElementFinder {
		private final EnumRule rule = (EnumRule) GrammarUtil.findRuleForName(getGrammar(), "org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.Vpdiagram.BundledImageShape");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final EnumLiteralDeclaration cDotEnumLiteralDeclaration_0 = (EnumLiteralDeclaration)cAlternatives.eContents().get(0);
		private final Keyword cDotDotKeyword_0_0 = (Keyword)cDotEnumLiteralDeclaration_0.eContents().get(0);
		private final EnumLiteralDeclaration cRingEnumLiteralDeclaration_1 = (EnumLiteralDeclaration)cAlternatives.eContents().get(1);
		private final Keyword cRingRingKeyword_1_0 = (Keyword)cRingEnumLiteralDeclaration_1.eContents().get(0);
		private final EnumLiteralDeclaration cSquareEnumLiteralDeclaration_2 = (EnumLiteralDeclaration)cAlternatives.eContents().get(2);
		private final Keyword cSquareSquareKeyword_2_0 = (Keyword)cSquareEnumLiteralDeclaration_2.eContents().get(0);
		private final EnumLiteralDeclaration cStrokeEnumLiteralDeclaration_3 = (EnumLiteralDeclaration)cAlternatives.eContents().get(3);
		private final Keyword cStrokeStrokeKeyword_3_0 = (Keyword)cStrokeEnumLiteralDeclaration_3.eContents().get(0);
		private final EnumLiteralDeclaration cTriangleEnumLiteralDeclaration_4 = (EnumLiteralDeclaration)cAlternatives.eContents().get(4);
		private final Keyword cTriangleTriangleKeyword_4_0 = (Keyword)cTriangleEnumLiteralDeclaration_4.eContents().get(0);
		
		//enum BundledImageShape returns siriusDiagram::BundledImageShape:
		//	dot | ring | square | stroke | triangle;
		public EnumRule getRule() { return rule; }

		//dot | ring | square | stroke | triangle
		public Alternatives getAlternatives() { return cAlternatives; }

		//dot
		public EnumLiteralDeclaration getDotEnumLiteralDeclaration_0() { return cDotEnumLiteralDeclaration_0; }

		//'dot'
		public Keyword getDotDotKeyword_0_0() { return cDotDotKeyword_0_0; }

		//ring
		public EnumLiteralDeclaration getRingEnumLiteralDeclaration_1() { return cRingEnumLiteralDeclaration_1; }

		//'ring'
		public Keyword getRingRingKeyword_1_0() { return cRingRingKeyword_1_0; }

		//square
		public EnumLiteralDeclaration getSquareEnumLiteralDeclaration_2() { return cSquareEnumLiteralDeclaration_2; }

		//'square'
		public Keyword getSquareSquareKeyword_2_0() { return cSquareSquareKeyword_2_0; }

		//stroke
		public EnumLiteralDeclaration getStrokeEnumLiteralDeclaration_3() { return cStrokeEnumLiteralDeclaration_3; }

		//'stroke'
		public Keyword getStrokeStrokeKeyword_3_0() { return cStrokeStrokeKeyword_3_0; }

		//triangle
		public EnumLiteralDeclaration getTriangleEnumLiteralDeclaration_4() { return cTriangleEnumLiteralDeclaration_4; }

		//'triangle'
		public Keyword getTriangleTriangleKeyword_4_0() { return cTriangleTriangleKeyword_4_0; }
	}

	public class ResizeKindElements extends AbstractEnumRuleElementFinder {
		private final EnumRule rule = (EnumRule) GrammarUtil.findRuleForName(getGrammar(), "org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.Vpdiagram.ResizeKind");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final EnumLiteralDeclaration cNONEEnumLiteralDeclaration_0 = (EnumLiteralDeclaration)cAlternatives.eContents().get(0);
		private final Keyword cNONENONEKeyword_0_0 = (Keyword)cNONEEnumLiteralDeclaration_0.eContents().get(0);
		private final EnumLiteralDeclaration cNSEWEnumLiteralDeclaration_1 = (EnumLiteralDeclaration)cAlternatives.eContents().get(1);
		private final Keyword cNSEWNSEWKeyword_1_0 = (Keyword)cNSEWEnumLiteralDeclaration_1.eContents().get(0);
		private final EnumLiteralDeclaration cEAST_WESTEnumLiteralDeclaration_2 = (EnumLiteralDeclaration)cAlternatives.eContents().get(2);
		private final Keyword cEAST_WESTEAST_WESTKeyword_2_0 = (Keyword)cEAST_WESTEnumLiteralDeclaration_2.eContents().get(0);
		private final EnumLiteralDeclaration cNORTH_SOUTHEnumLiteralDeclaration_3 = (EnumLiteralDeclaration)cAlternatives.eContents().get(3);
		private final Keyword cNORTH_SOUTHNORTH_SOUTHKeyword_3_0 = (Keyword)cNORTH_SOUTHEnumLiteralDeclaration_3.eContents().get(0);
		
		//enum ResizeKind returns siriusDiagram::ResizeKind:
		//	NONE | NSEW | EAST_WEST | NORTH_SOUTH;
		public EnumRule getRule() { return rule; }

		//NONE | NSEW | EAST_WEST | NORTH_SOUTH
		public Alternatives getAlternatives() { return cAlternatives; }

		//NONE
		public EnumLiteralDeclaration getNONEEnumLiteralDeclaration_0() { return cNONEEnumLiteralDeclaration_0; }

		//'NONE'
		public Keyword getNONENONEKeyword_0_0() { return cNONENONEKeyword_0_0; }

		//NSEW
		public EnumLiteralDeclaration getNSEWEnumLiteralDeclaration_1() { return cNSEWEnumLiteralDeclaration_1; }

		//'NSEW'
		public Keyword getNSEWNSEWKeyword_1_0() { return cNSEWNSEWKeyword_1_0; }

		//EAST_WEST
		public EnumLiteralDeclaration getEAST_WESTEnumLiteralDeclaration_2() { return cEAST_WESTEnumLiteralDeclaration_2; }

		//'EAST_WEST'
		public Keyword getEAST_WESTEAST_WESTKeyword_2_0() { return cEAST_WESTEAST_WESTKeyword_2_0; }

		//NORTH_SOUTH
		public EnumLiteralDeclaration getNORTH_SOUTHEnumLiteralDeclaration_3() { return cNORTH_SOUTHEnumLiteralDeclaration_3; }

		//'NORTH_SOUTH'
		public Keyword getNORTH_SOUTHNORTH_SOUTHKeyword_3_0() { return cNORTH_SOUTHNORTH_SOUTHKeyword_3_0; }
	}

	public class ContainerShapeElements extends AbstractEnumRuleElementFinder {
		private final EnumRule rule = (EnumRule) GrammarUtil.findRuleForName(getGrammar(), "org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.Vpdiagram.ContainerShape");
		private final EnumLiteralDeclaration cParallelogramEnumLiteralDeclaration = (EnumLiteralDeclaration)rule.eContents().get(1);
		private final Keyword cParallelogramParallelogramKeyword_0 = (Keyword)cParallelogramEnumLiteralDeclaration.eContents().get(0);
		
		//enum ContainerShape returns siriusDiagram::ContainerShape:
		//	parallelogram;
		public EnumRule getRule() { return rule; }

		//parallelogram
		public EnumLiteralDeclaration getParallelogramEnumLiteralDeclaration() { return cParallelogramEnumLiteralDeclaration; }

		//'parallelogram'
		public Keyword getParallelogramParallelogramKeyword_0() { return cParallelogramParallelogramKeyword_0; }
	}

	public class FontFormatElements extends AbstractEnumRuleElementFinder {
		private final EnumRule rule = (EnumRule) GrammarUtil.findRuleForName(getGrammar(), "org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.Vpdiagram.FontFormat");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final EnumLiteralDeclaration cItalicEnumLiteralDeclaration_0 = (EnumLiteralDeclaration)cAlternatives.eContents().get(0);
		private final Keyword cItalicItalicKeyword_0_0 = (Keyword)cItalicEnumLiteralDeclaration_0.eContents().get(0);
		private final EnumLiteralDeclaration cBoldEnumLiteralDeclaration_1 = (EnumLiteralDeclaration)cAlternatives.eContents().get(1);
		private final Keyword cBoldBoldKeyword_1_0 = (Keyword)cBoldEnumLiteralDeclaration_1.eContents().get(0);
		private final EnumLiteralDeclaration cUnderlineEnumLiteralDeclaration_2 = (EnumLiteralDeclaration)cAlternatives.eContents().get(2);
		private final Keyword cUnderlineUnderlineKeyword_2_0 = (Keyword)cUnderlineEnumLiteralDeclaration_2.eContents().get(0);
		private final EnumLiteralDeclaration cStrike_throughEnumLiteralDeclaration_3 = (EnumLiteralDeclaration)cAlternatives.eContents().get(3);
		private final Keyword cStrike_throughStrike_throughKeyword_3_0 = (Keyword)cStrike_throughEnumLiteralDeclaration_3.eContents().get(0);
		
		//enum FontFormat returns sirius::FontFormat:
		//	italic | bold | underline | strike_through;
		public EnumRule getRule() { return rule; }

		//italic | bold | underline | strike_through
		public Alternatives getAlternatives() { return cAlternatives; }

		//italic
		public EnumLiteralDeclaration getItalicEnumLiteralDeclaration_0() { return cItalicEnumLiteralDeclaration_0; }

		//'italic'
		public Keyword getItalicItalicKeyword_0_0() { return cItalicItalicKeyword_0_0; }

		//bold
		public EnumLiteralDeclaration getBoldEnumLiteralDeclaration_1() { return cBoldEnumLiteralDeclaration_1; }

		//'bold'
		public Keyword getBoldBoldKeyword_1_0() { return cBoldBoldKeyword_1_0; }

		//underline
		public EnumLiteralDeclaration getUnderlineEnumLiteralDeclaration_2() { return cUnderlineEnumLiteralDeclaration_2; }

		//'underline'
		public Keyword getUnderlineUnderlineKeyword_2_0() { return cUnderlineUnderlineKeyword_2_0; }

		//strike_through
		public EnumLiteralDeclaration getStrike_throughEnumLiteralDeclaration_3() { return cStrike_throughEnumLiteralDeclaration_3; }

		//'strike_through'
		public Keyword getStrike_throughStrike_throughKeyword_3_0() { return cStrike_throughStrike_throughKeyword_3_0; }
	}

	public class CenterStyleElements extends AbstractEnumRuleElementFinder {
		private final EnumRule rule = (EnumRule) GrammarUtil.findRuleForName(getGrammar(), "org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.Vpdiagram.CenterStyle");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final EnumLiteralDeclaration cBothEnumLiteralDeclaration_0 = (EnumLiteralDeclaration)cAlternatives.eContents().get(0);
		private final Keyword cBothBothKeyword_0_0 = (Keyword)cBothEnumLiteralDeclaration_0.eContents().get(0);
		private final EnumLiteralDeclaration cNoneEnumLiteralDeclaration_1 = (EnumLiteralDeclaration)cAlternatives.eContents().get(1);
		private final Keyword cNoneNoneKeyword_1_0 = (Keyword)cNoneEnumLiteralDeclaration_1.eContents().get(0);
		private final EnumLiteralDeclaration cSourceEnumLiteralDeclaration_2 = (EnumLiteralDeclaration)cAlternatives.eContents().get(2);
		private final Keyword cSourceSourceKeyword_2_0 = (Keyword)cSourceEnumLiteralDeclaration_2.eContents().get(0);
		private final EnumLiteralDeclaration cTargetEnumLiteralDeclaration_3 = (EnumLiteralDeclaration)cAlternatives.eContents().get(3);
		private final Keyword cTargetTargetKeyword_3_0 = (Keyword)cTargetEnumLiteralDeclaration_3.eContents().get(0);
		
		//enum CenterStyle returns siriusDiagramDescription::CenteringStyle:
		//	Both | None | Source | Target;
		public EnumRule getRule() { return rule; }

		//Both | None | Source | Target
		public Alternatives getAlternatives() { return cAlternatives; }

		//Both
		public EnumLiteralDeclaration getBothEnumLiteralDeclaration_0() { return cBothEnumLiteralDeclaration_0; }

		//'Both'
		public Keyword getBothBothKeyword_0_0() { return cBothBothKeyword_0_0; }

		//None
		public EnumLiteralDeclaration getNoneEnumLiteralDeclaration_1() { return cNoneEnumLiteralDeclaration_1; }

		//'None'
		public Keyword getNoneNoneKeyword_1_0() { return cNoneNoneKeyword_1_0; }

		//Source
		public EnumLiteralDeclaration getSourceEnumLiteralDeclaration_2() { return cSourceEnumLiteralDeclaration_2; }

		//'Source'
		public Keyword getSourceSourceKeyword_2_0() { return cSourceSourceKeyword_2_0; }

		//Target
		public EnumLiteralDeclaration getTargetEnumLiteralDeclaration_3() { return cTargetEnumLiteralDeclaration_3; }

		//'Target'
		public Keyword getTargetTargetKeyword_3_0() { return cTargetTargetKeyword_3_0; }
	}

	public class FoldingStyleElements extends AbstractEnumRuleElementFinder {
		private final EnumRule rule = (EnumRule) GrammarUtil.findRuleForName(getGrammar(), "org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.Vpdiagram.FoldingStyle");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final EnumLiteralDeclaration cNONEEnumLiteralDeclaration_0 = (EnumLiteralDeclaration)cAlternatives.eContents().get(0);
		private final Keyword cNONENONEKeyword_0_0 = (Keyword)cNONEEnumLiteralDeclaration_0.eContents().get(0);
		private final EnumLiteralDeclaration cSOURCEEnumLiteralDeclaration_1 = (EnumLiteralDeclaration)cAlternatives.eContents().get(1);
		private final Keyword cSOURCESOURCEKeyword_1_0 = (Keyword)cSOURCEEnumLiteralDeclaration_1.eContents().get(0);
		private final EnumLiteralDeclaration cTARGETEnumLiteralDeclaration_2 = (EnumLiteralDeclaration)cAlternatives.eContents().get(2);
		private final Keyword cTARGETTARGETKeyword_2_0 = (Keyword)cTARGETEnumLiteralDeclaration_2.eContents().get(0);
		
		//enum FoldingStyle returns siriusDiagramDescription::FoldingStyle:
		//	NONE | SOURCE | TARGET;
		public EnumRule getRule() { return rule; }

		//NONE | SOURCE | TARGET
		public Alternatives getAlternatives() { return cAlternatives; }

		//NONE
		public EnumLiteralDeclaration getNONEEnumLiteralDeclaration_0() { return cNONEEnumLiteralDeclaration_0; }

		//'NONE'
		public Keyword getNONENONEKeyword_0_0() { return cNONENONEKeyword_0_0; }

		//SOURCE
		public EnumLiteralDeclaration getSOURCEEnumLiteralDeclaration_1() { return cSOURCEEnumLiteralDeclaration_1; }

		//'SOURCE'
		public Keyword getSOURCESOURCEKeyword_1_0() { return cSOURCESOURCEKeyword_1_0; }

		//TARGET
		public EnumLiteralDeclaration getTARGETEnumLiteralDeclaration_2() { return cTARGETEnumLiteralDeclaration_2; }

		//'TARGET'
		public Keyword getTARGETTARGETKeyword_2_0() { return cTARGETTARGETKeyword_2_0; }
	}

	public class EdgeRoutingElements extends AbstractEnumRuleElementFinder {
		private final EnumRule rule = (EnumRule) GrammarUtil.findRuleForName(getGrammar(), "org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.Vpdiagram.EdgeRouting");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final EnumLiteralDeclaration cStraightEnumLiteralDeclaration_0 = (EnumLiteralDeclaration)cAlternatives.eContents().get(0);
		private final Keyword cStraightStraightKeyword_0_0 = (Keyword)cStraightEnumLiteralDeclaration_0.eContents().get(0);
		private final EnumLiteralDeclaration cManhattanEnumLiteralDeclaration_1 = (EnumLiteralDeclaration)cAlternatives.eContents().get(1);
		private final Keyword cManhattanManhattanKeyword_1_0 = (Keyword)cManhattanEnumLiteralDeclaration_1.eContents().get(0);
		private final EnumLiteralDeclaration cTreeEnumLiteralDeclaration_2 = (EnumLiteralDeclaration)cAlternatives.eContents().get(2);
		private final Keyword cTreeTreeKeyword_2_0 = (Keyword)cTreeEnumLiteralDeclaration_2.eContents().get(0);
		
		//enum EdgeRouting returns siriusDiagram::EdgeRouting:
		//	straight | manhattan | tree;
		public EnumRule getRule() { return rule; }

		//straight | manhattan | tree
		public Alternatives getAlternatives() { return cAlternatives; }

		//straight
		public EnumLiteralDeclaration getStraightEnumLiteralDeclaration_0() { return cStraightEnumLiteralDeclaration_0; }

		//'straight'
		public Keyword getStraightStraightKeyword_0_0() { return cStraightStraightKeyword_0_0; }

		//manhattan
		public EnumLiteralDeclaration getManhattanEnumLiteralDeclaration_1() { return cManhattanEnumLiteralDeclaration_1; }

		//'manhattan'
		public Keyword getManhattanManhattanKeyword_1_0() { return cManhattanManhattanKeyword_1_0; }

		//tree
		public EnumLiteralDeclaration getTreeEnumLiteralDeclaration_2() { return cTreeEnumLiteralDeclaration_2; }

		//'tree'
		public Keyword getTreeTreeKeyword_2_0() { return cTreeTreeKeyword_2_0; }
	}

	public class ColorUseCaseElements extends AbstractEnumRuleElementFinder {
		private final EnumRule rule = (EnumRule) GrammarUtil.findRuleForName(getGrammar(), "org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.Vpdiagram.ColorUseCase");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final EnumLiteralDeclaration cBorderEnumLiteralDeclaration_0 = (EnumLiteralDeclaration)cAlternatives.eContents().get(0);
		private final Keyword cBorderBorderKeyword_0_0 = (Keyword)cBorderEnumLiteralDeclaration_0.eContents().get(0);
		private final EnumLiteralDeclaration cColorEnumLiteralDeclaration_1 = (EnumLiteralDeclaration)cAlternatives.eContents().get(1);
		private final Keyword cColorColorKeyword_1_0 = (Keyword)cColorEnumLiteralDeclaration_1.eContents().get(0);
		private final EnumLiteralDeclaration cBackgroundEnumLiteralDeclaration_2 = (EnumLiteralDeclaration)cAlternatives.eContents().get(2);
		private final Keyword cBackgroundBackgroundKeyword_2_0 = (Keyword)cBackgroundEnumLiteralDeclaration_2.eContents().get(0);
		private final EnumLiteralDeclaration cForegroundEnumLiteralDeclaration_3 = (EnumLiteralDeclaration)cAlternatives.eContents().get(3);
		private final Keyword cForegroundForegroundKeyword_3_0 = (Keyword)cForegroundEnumLiteralDeclaration_3.eContents().get(0);
		
		//enum ColorUseCase returns styleCusto::ColorUseCase:
		//	Border | Color | Background | Foreground='foreground';
		public EnumRule getRule() { return rule; }

		//Border | Color | Background | Foreground='foreground'
		public Alternatives getAlternatives() { return cAlternatives; }

		//Border
		public EnumLiteralDeclaration getBorderEnumLiteralDeclaration_0() { return cBorderEnumLiteralDeclaration_0; }

		//'Border'
		public Keyword getBorderBorderKeyword_0_0() { return cBorderBorderKeyword_0_0; }

		//Color
		public EnumLiteralDeclaration getColorEnumLiteralDeclaration_1() { return cColorEnumLiteralDeclaration_1; }

		//'Color'
		public Keyword getColorColorKeyword_1_0() { return cColorColorKeyword_1_0; }

		//Background
		public EnumLiteralDeclaration getBackgroundEnumLiteralDeclaration_2() { return cBackgroundEnumLiteralDeclaration_2; }

		//'Background'
		public Keyword getBackgroundBackgroundKeyword_2_0() { return cBackgroundBackgroundKeyword_2_0; }

		//Foreground='foreground'
		public EnumLiteralDeclaration getForegroundEnumLiteralDeclaration_3() { return cForegroundEnumLiteralDeclaration_3; }

		//'foreground'
		public Keyword getForegroundForegroundKeyword_3_0() { return cForegroundForegroundKeyword_3_0; }
	}

	public class Node_FormElements extends AbstractEnumRuleElementFinder {
		private final EnumRule rule = (EnumRule) GrammarUtil.findRuleForName(getGrammar(), "org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.Vpdiagram.Node_Form");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final EnumLiteralDeclaration cSquareEnumLiteralDeclaration_0 = (EnumLiteralDeclaration)cAlternatives.eContents().get(0);
		private final Keyword cSquareSquareKeyword_0_0 = (Keyword)cSquareEnumLiteralDeclaration_0.eContents().get(0);
		private final EnumLiteralDeclaration cLozengeEnumLiteralDeclaration_1 = (EnumLiteralDeclaration)cAlternatives.eContents().get(1);
		private final Keyword cLozengeLozengeKeyword_1_0 = (Keyword)cLozengeEnumLiteralDeclaration_1.eContents().get(0);
		private final EnumLiteralDeclaration cEclipseEnumLiteralDeclaration_2 = (EnumLiteralDeclaration)cAlternatives.eContents().get(2);
		private final Keyword cEclipseEclipseKeyword_2_0 = (Keyword)cEclipseEnumLiteralDeclaration_2.eContents().get(0);
		private final EnumLiteralDeclaration cNoteEnumLiteralDeclaration_3 = (EnumLiteralDeclaration)cAlternatives.eContents().get(3);
		private final Keyword cNoteNoteKeyword_3_0 = (Keyword)cNoteEnumLiteralDeclaration_3.eContents().get(0);
		private final EnumLiteralDeclaration cDotEnumLiteralDeclaration_4 = (EnumLiteralDeclaration)cAlternatives.eContents().get(4);
		private final Keyword cDotDotKeyword_4_0 = (Keyword)cDotEnumLiteralDeclaration_4.eContents().get(0);
		private final EnumLiteralDeclaration cTriangleEnumLiteralDeclaration_5 = (EnumLiteralDeclaration)cAlternatives.eContents().get(5);
		private final Keyword cTriangleTriangleKeyword_5_0 = (Keyword)cTriangleEnumLiteralDeclaration_5.eContents().get(0);
		private final EnumLiteralDeclaration cStrokeEnumLiteralDeclaration_6 = (EnumLiteralDeclaration)cAlternatives.eContents().get(6);
		private final Keyword cStrokeStrokeKeyword_6_0 = (Keyword)cStrokeEnumLiteralDeclaration_6.eContents().get(0);
		private final EnumLiteralDeclaration cRingEnumLiteralDeclaration_7 = (EnumLiteralDeclaration)cAlternatives.eContents().get(7);
		private final Keyword cRingRingKeyword_7_0 = (Keyword)cRingEnumLiteralDeclaration_7.eContents().get(0);
		
		//enum Node_Form returns vpdiagram::Node_Form:
		//	Square | Lozenge | Eclipse | Note | Dot | Triangle | Stroke | Ring;
		public EnumRule getRule() { return rule; }

		//Square | Lozenge | Eclipse | Note | Dot | Triangle | Stroke | Ring
		public Alternatives getAlternatives() { return cAlternatives; }

		//Square
		public EnumLiteralDeclaration getSquareEnumLiteralDeclaration_0() { return cSquareEnumLiteralDeclaration_0; }

		//'Square'
		public Keyword getSquareSquareKeyword_0_0() { return cSquareSquareKeyword_0_0; }

		//Lozenge
		public EnumLiteralDeclaration getLozengeEnumLiteralDeclaration_1() { return cLozengeEnumLiteralDeclaration_1; }

		//'Lozenge'
		public Keyword getLozengeLozengeKeyword_1_0() { return cLozengeLozengeKeyword_1_0; }

		//Eclipse
		public EnumLiteralDeclaration getEclipseEnumLiteralDeclaration_2() { return cEclipseEnumLiteralDeclaration_2; }

		//'Eclipse'
		public Keyword getEclipseEclipseKeyword_2_0() { return cEclipseEclipseKeyword_2_0; }

		//Note
		public EnumLiteralDeclaration getNoteEnumLiteralDeclaration_3() { return cNoteEnumLiteralDeclaration_3; }

		//'Note'
		public Keyword getNoteNoteKeyword_3_0() { return cNoteNoteKeyword_3_0; }

		//Dot
		public EnumLiteralDeclaration getDotEnumLiteralDeclaration_4() { return cDotEnumLiteralDeclaration_4; }

		//'Dot'
		public Keyword getDotDotKeyword_4_0() { return cDotDotKeyword_4_0; }

		//Triangle
		public EnumLiteralDeclaration getTriangleEnumLiteralDeclaration_5() { return cTriangleEnumLiteralDeclaration_5; }

		//'Triangle'
		public Keyword getTriangleTriangleKeyword_5_0() { return cTriangleTriangleKeyword_5_0; }

		//Stroke
		public EnumLiteralDeclaration getStrokeEnumLiteralDeclaration_6() { return cStrokeEnumLiteralDeclaration_6; }

		//'Stroke'
		public Keyword getStrokeStrokeKeyword_6_0() { return cStrokeStrokeKeyword_6_0; }

		//Ring
		public EnumLiteralDeclaration getRingEnumLiteralDeclaration_7() { return cRingEnumLiteralDeclaration_7; }

		//'Ring'
		public Keyword getRingRingKeyword_7_0() { return cRingRingKeyword_7_0; }
	}

	public class BackgroundStyleElements extends AbstractEnumRuleElementFinder {
		private final EnumRule rule = (EnumRule) GrammarUtil.findRuleForName(getGrammar(), "org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.Vpdiagram.BackgroundStyle");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final EnumLiteralDeclaration cGradientLeftToRightEnumLiteralDeclaration_0 = (EnumLiteralDeclaration)cAlternatives.eContents().get(0);
		private final Keyword cGradientLeftToRightGradientLeftToRightKeyword_0_0 = (Keyword)cGradientLeftToRightEnumLiteralDeclaration_0.eContents().get(0);
		private final EnumLiteralDeclaration cLiquidEnumLiteralDeclaration_1 = (EnumLiteralDeclaration)cAlternatives.eContents().get(1);
		private final Keyword cLiquidLiquidKeyword_1_0 = (Keyword)cLiquidEnumLiteralDeclaration_1.eContents().get(0);
		private final EnumLiteralDeclaration cGradientTopToBottomEnumLiteralDeclaration_2 = (EnumLiteralDeclaration)cAlternatives.eContents().get(2);
		private final Keyword cGradientTopToBottomGradientTopToBottomKeyword_2_0 = (Keyword)cGradientTopToBottomEnumLiteralDeclaration_2.eContents().get(0);
		
		//enum BackgroundStyle returns siriusDiagram::BackgroundStyle:
		//	GradientLeftToRight | Liquid | GradientTopToBottom;
		public EnumRule getRule() { return rule; }

		//GradientLeftToRight | Liquid | GradientTopToBottom
		public Alternatives getAlternatives() { return cAlternatives; }

		//GradientLeftToRight
		public EnumLiteralDeclaration getGradientLeftToRightEnumLiteralDeclaration_0() { return cGradientLeftToRightEnumLiteralDeclaration_0; }

		//'GradientLeftToRight'
		public Keyword getGradientLeftToRightGradientLeftToRightKeyword_0_0() { return cGradientLeftToRightGradientLeftToRightKeyword_0_0; }

		//Liquid
		public EnumLiteralDeclaration getLiquidEnumLiteralDeclaration_1() { return cLiquidEnumLiteralDeclaration_1; }

		//'Liquid'
		public Keyword getLiquidLiquidKeyword_1_0() { return cLiquidLiquidKeyword_1_0; }

		//GradientTopToBottom
		public EnumLiteralDeclaration getGradientTopToBottomEnumLiteralDeclaration_2() { return cGradientTopToBottomEnumLiteralDeclaration_2; }

		//'GradientTopToBottom'
		public Keyword getGradientTopToBottomGradientTopToBottomKeyword_2_0() { return cGradientTopToBottomGradientTopToBottomKeyword_2_0; }
	}

	public class LabelPositionElements extends AbstractEnumRuleElementFinder {
		private final EnumRule rule = (EnumRule) GrammarUtil.findRuleForName(getGrammar(), "org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.Vpdiagram.LabelPosition");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final EnumLiteralDeclaration cBorderEnumLiteralDeclaration_0 = (EnumLiteralDeclaration)cAlternatives.eContents().get(0);
		private final Keyword cBorderBorderKeyword_0_0 = (Keyword)cBorderEnumLiteralDeclaration_0.eContents().get(0);
		private final EnumLiteralDeclaration cNodeEnumLiteralDeclaration_1 = (EnumLiteralDeclaration)cAlternatives.eContents().get(1);
		private final Keyword cNodeNodeKeyword_1_0 = (Keyword)cNodeEnumLiteralDeclaration_1.eContents().get(0);
		
		//enum LabelPosition returns siriusDiagram::LabelPosition:
		//	border | node;
		public EnumRule getRule() { return rule; }

		//border | node
		public Alternatives getAlternatives() { return cAlternatives; }

		//border
		public EnumLiteralDeclaration getBorderEnumLiteralDeclaration_0() { return cBorderEnumLiteralDeclaration_0; }

		//'border'
		public Keyword getBorderBorderKeyword_0_0() { return cBorderBorderKeyword_0_0; }

		//node
		public EnumLiteralDeclaration getNodeEnumLiteralDeclaration_1() { return cNodeEnumLiteralDeclaration_1; }

		//'node'
		public Keyword getNodeNodeKeyword_1_0() { return cNodeNodeKeyword_1_0; }
	}

	public class LabelAlignmentElements extends AbstractEnumRuleElementFinder {
		private final EnumRule rule = (EnumRule) GrammarUtil.findRuleForName(getGrammar(), "org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.Vpdiagram.LabelAlignment");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final EnumLiteralDeclaration cCENTEREnumLiteralDeclaration_0 = (EnumLiteralDeclaration)cAlternatives.eContents().get(0);
		private final Keyword cCENTERCenterKeyword_0_0 = (Keyword)cCENTEREnumLiteralDeclaration_0.eContents().get(0);
		private final EnumLiteralDeclaration cLEFTEnumLiteralDeclaration_1 = (EnumLiteralDeclaration)cAlternatives.eContents().get(1);
		private final Keyword cLEFTLeftKeyword_1_0 = (Keyword)cLEFTEnumLiteralDeclaration_1.eContents().get(0);
		private final EnumLiteralDeclaration cRIGHTEnumLiteralDeclaration_2 = (EnumLiteralDeclaration)cAlternatives.eContents().get(2);
		private final Keyword cRIGHTRightKeyword_2_0 = (Keyword)cRIGHTEnumLiteralDeclaration_2.eContents().get(0);
		
		//enum LabelAlignment returns sirius::LabelAlignment:
		//	CENTER='center' | LEFT='left' | RIGHT='right';
		public EnumRule getRule() { return rule; }

		//CENTER='center' | LEFT='left' | RIGHT='right'
		public Alternatives getAlternatives() { return cAlternatives; }

		//CENTER='center'
		public EnumLiteralDeclaration getCENTEREnumLiteralDeclaration_0() { return cCENTEREnumLiteralDeclaration_0; }

		//'center'
		public Keyword getCENTERCenterKeyword_0_0() { return cCENTERCenterKeyword_0_0; }

		//LEFT='left'
		public EnumLiteralDeclaration getLEFTEnumLiteralDeclaration_1() { return cLEFTEnumLiteralDeclaration_1; }

		//'left'
		public Keyword getLEFTLeftKeyword_1_0() { return cLEFTLeftKeyword_1_0; }

		//RIGHT='right'
		public EnumLiteralDeclaration getRIGHTEnumLiteralDeclaration_2() { return cRIGHTEnumLiteralDeclaration_2; }

		//'right'
		public Keyword getRIGHTRightKeyword_2_0() { return cRIGHTRightKeyword_2_0; }
	}

	public class LineStyleElements extends AbstractEnumRuleElementFinder {
		private final EnumRule rule = (EnumRule) GrammarUtil.findRuleForName(getGrammar(), "org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.Vpdiagram.LineStyle");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final EnumLiteralDeclaration cSolidEnumLiteralDeclaration_0 = (EnumLiteralDeclaration)cAlternatives.eContents().get(0);
		private final Keyword cSolidSolidKeyword_0_0 = (Keyword)cSolidEnumLiteralDeclaration_0.eContents().get(0);
		private final EnumLiteralDeclaration cDashEnumLiteralDeclaration_1 = (EnumLiteralDeclaration)cAlternatives.eContents().get(1);
		private final Keyword cDashDashKeyword_1_0 = (Keyword)cDashEnumLiteralDeclaration_1.eContents().get(0);
		private final EnumLiteralDeclaration cDotEnumLiteralDeclaration_2 = (EnumLiteralDeclaration)cAlternatives.eContents().get(2);
		private final Keyword cDotDotKeyword_2_0 = (Keyword)cDotEnumLiteralDeclaration_2.eContents().get(0);
		private final EnumLiteralDeclaration cDash_dotEnumLiteralDeclaration_3 = (EnumLiteralDeclaration)cAlternatives.eContents().get(3);
		private final Keyword cDash_dotDash_dotKeyword_3_0 = (Keyword)cDash_dotEnumLiteralDeclaration_3.eContents().get(0);
		
		//enum LineStyle returns siriusDiagram::LineStyle:
		//	solid | dash | dot | dash_dot;
		public EnumRule getRule() { return rule; }

		//solid | dash | dot | dash_dot
		public Alternatives getAlternatives() { return cAlternatives; }

		//solid
		public EnumLiteralDeclaration getSolidEnumLiteralDeclaration_0() { return cSolidEnumLiteralDeclaration_0; }

		//'solid'
		public Keyword getSolidSolidKeyword_0_0() { return cSolidSolidKeyword_0_0; }

		//dash
		public EnumLiteralDeclaration getDashEnumLiteralDeclaration_1() { return cDashEnumLiteralDeclaration_1; }

		//'dash'
		public Keyword getDashDashKeyword_1_0() { return cDashDashKeyword_1_0; }

		//dot
		public EnumLiteralDeclaration getDotEnumLiteralDeclaration_2() { return cDotEnumLiteralDeclaration_2; }

		//'dot'
		public Keyword getDotDotKeyword_2_0() { return cDotDotKeyword_2_0; }

		//dash_dot
		public EnumLiteralDeclaration getDash_dotEnumLiteralDeclaration_3() { return cDash_dotEnumLiteralDeclaration_3; }

		//'dash_dot'
		public Keyword getDash_dotDash_dotKeyword_3_0() { return cDash_dotDash_dotKeyword_3_0; }
	}

	public class EdgeArrowsElements extends AbstractEnumRuleElementFinder {
		private final EnumRule rule = (EnumRule) GrammarUtil.findRuleForName(getGrammar(), "org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.Vpdiagram.EdgeArrows");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final EnumLiteralDeclaration cNoDecorationEnumLiteralDeclaration_0 = (EnumLiteralDeclaration)cAlternatives.eContents().get(0);
		private final Keyword cNoDecorationNoDecorationKeyword_0_0 = (Keyword)cNoDecorationEnumLiteralDeclaration_0.eContents().get(0);
		private final EnumLiteralDeclaration cOutputArrowEnumLiteralDeclaration_1 = (EnumLiteralDeclaration)cAlternatives.eContents().get(1);
		private final Keyword cOutputArrowOutputArrowKeyword_1_0 = (Keyword)cOutputArrowEnumLiteralDeclaration_1.eContents().get(0);
		private final EnumLiteralDeclaration cInputArrowEnumLiteralDeclaration_2 = (EnumLiteralDeclaration)cAlternatives.eContents().get(2);
		private final Keyword cInputArrowInputArrowKeyword_2_0 = (Keyword)cInputArrowEnumLiteralDeclaration_2.eContents().get(0);
		private final EnumLiteralDeclaration cOutputClosedArrowEnumLiteralDeclaration_3 = (EnumLiteralDeclaration)cAlternatives.eContents().get(3);
		private final Keyword cOutputClosedArrowOutputClosedArrowKeyword_3_0 = (Keyword)cOutputClosedArrowEnumLiteralDeclaration_3.eContents().get(0);
		private final EnumLiteralDeclaration cInputClosedArrowEnumLiteralDeclaration_4 = (EnumLiteralDeclaration)cAlternatives.eContents().get(4);
		private final Keyword cInputClosedArrowInputClosedArrowKeyword_4_0 = (Keyword)cInputClosedArrowEnumLiteralDeclaration_4.eContents().get(0);
		private final EnumLiteralDeclaration cOutputFillClosedArrowEnumLiteralDeclaration_5 = (EnumLiteralDeclaration)cAlternatives.eContents().get(5);
		private final Keyword cOutputFillClosedArrowOutputFillClosedArrowKeyword_5_0 = (Keyword)cOutputFillClosedArrowEnumLiteralDeclaration_5.eContents().get(0);
		private final EnumLiteralDeclaration cInputFillClosedArrowEnumLiteralDeclaration_6 = (EnumLiteralDeclaration)cAlternatives.eContents().get(6);
		private final Keyword cInputFillClosedArrowInputFillClosedArrowKeyword_6_0 = (Keyword)cInputFillClosedArrowEnumLiteralDeclaration_6.eContents().get(0);
		private final EnumLiteralDeclaration cDiamondEnumLiteralDeclaration_7 = (EnumLiteralDeclaration)cAlternatives.eContents().get(7);
		private final Keyword cDiamondDiamondKeyword_7_0 = (Keyword)cDiamondEnumLiteralDeclaration_7.eContents().get(0);
		private final EnumLiteralDeclaration cFillDiamondEnumLiteralDeclaration_8 = (EnumLiteralDeclaration)cAlternatives.eContents().get(8);
		private final Keyword cFillDiamondFillDiamondKeyword_8_0 = (Keyword)cFillDiamondEnumLiteralDeclaration_8.eContents().get(0);
		private final EnumLiteralDeclaration cInputArrowWithDiamondEnumLiteralDeclaration_9 = (EnumLiteralDeclaration)cAlternatives.eContents().get(9);
		private final Keyword cInputArrowWithDiamondInputArrowWithDiamondKeyword_9_0 = (Keyword)cInputArrowWithDiamondEnumLiteralDeclaration_9.eContents().get(0);
		private final EnumLiteralDeclaration cInputArrowWithFillDiamondEnumLiteralDeclaration_10 = (EnumLiteralDeclaration)cAlternatives.eContents().get(10);
		private final Keyword cInputArrowWithFillDiamondInputArrowWothFillDiamondKeyword_10_0 = (Keyword)cInputArrowWithFillDiamondEnumLiteralDeclaration_10.eContents().get(0);
		
		//enum EdgeArrows returns siriusDiagram::EdgeArrows:
		//	NoDecoration | OutputArrow | InputArrow | OutputClosedArrow | InputClosedArrow | OutputFillClosedArrow |
		//	InputFillClosedArrow | Diamond | FillDiamond | InputArrowWithDiamond |
		//	InputArrowWithFillDiamond='InputArrowWothFillDiamond';
		public EnumRule getRule() { return rule; }

		//NoDecoration | OutputArrow | InputArrow | OutputClosedArrow | InputClosedArrow | OutputFillClosedArrow |
		//InputFillClosedArrow | Diamond | FillDiamond | InputArrowWithDiamond |
		//InputArrowWithFillDiamond='InputArrowWothFillDiamond'
		public Alternatives getAlternatives() { return cAlternatives; }

		//NoDecoration
		public EnumLiteralDeclaration getNoDecorationEnumLiteralDeclaration_0() { return cNoDecorationEnumLiteralDeclaration_0; }

		//'NoDecoration'
		public Keyword getNoDecorationNoDecorationKeyword_0_0() { return cNoDecorationNoDecorationKeyword_0_0; }

		//OutputArrow
		public EnumLiteralDeclaration getOutputArrowEnumLiteralDeclaration_1() { return cOutputArrowEnumLiteralDeclaration_1; }

		//'OutputArrow'
		public Keyword getOutputArrowOutputArrowKeyword_1_0() { return cOutputArrowOutputArrowKeyword_1_0; }

		//InputArrow
		public EnumLiteralDeclaration getInputArrowEnumLiteralDeclaration_2() { return cInputArrowEnumLiteralDeclaration_2; }

		//'InputArrow'
		public Keyword getInputArrowInputArrowKeyword_2_0() { return cInputArrowInputArrowKeyword_2_0; }

		//OutputClosedArrow
		public EnumLiteralDeclaration getOutputClosedArrowEnumLiteralDeclaration_3() { return cOutputClosedArrowEnumLiteralDeclaration_3; }

		//'OutputClosedArrow'
		public Keyword getOutputClosedArrowOutputClosedArrowKeyword_3_0() { return cOutputClosedArrowOutputClosedArrowKeyword_3_0; }

		//InputClosedArrow
		public EnumLiteralDeclaration getInputClosedArrowEnumLiteralDeclaration_4() { return cInputClosedArrowEnumLiteralDeclaration_4; }

		//'InputClosedArrow'
		public Keyword getInputClosedArrowInputClosedArrowKeyword_4_0() { return cInputClosedArrowInputClosedArrowKeyword_4_0; }

		//OutputFillClosedArrow
		public EnumLiteralDeclaration getOutputFillClosedArrowEnumLiteralDeclaration_5() { return cOutputFillClosedArrowEnumLiteralDeclaration_5; }

		//'OutputFillClosedArrow'
		public Keyword getOutputFillClosedArrowOutputFillClosedArrowKeyword_5_0() { return cOutputFillClosedArrowOutputFillClosedArrowKeyword_5_0; }

		//InputFillClosedArrow
		public EnumLiteralDeclaration getInputFillClosedArrowEnumLiteralDeclaration_6() { return cInputFillClosedArrowEnumLiteralDeclaration_6; }

		//'InputFillClosedArrow'
		public Keyword getInputFillClosedArrowInputFillClosedArrowKeyword_6_0() { return cInputFillClosedArrowInputFillClosedArrowKeyword_6_0; }

		//Diamond
		public EnumLiteralDeclaration getDiamondEnumLiteralDeclaration_7() { return cDiamondEnumLiteralDeclaration_7; }

		//'Diamond'
		public Keyword getDiamondDiamondKeyword_7_0() { return cDiamondDiamondKeyword_7_0; }

		//FillDiamond
		public EnumLiteralDeclaration getFillDiamondEnumLiteralDeclaration_8() { return cFillDiamondEnumLiteralDeclaration_8; }

		//'FillDiamond'
		public Keyword getFillDiamondFillDiamondKeyword_8_0() { return cFillDiamondFillDiamondKeyword_8_0; }

		//InputArrowWithDiamond
		public EnumLiteralDeclaration getInputArrowWithDiamondEnumLiteralDeclaration_9() { return cInputArrowWithDiamondEnumLiteralDeclaration_9; }

		//'InputArrowWithDiamond'
		public Keyword getInputArrowWithDiamondInputArrowWithDiamondKeyword_9_0() { return cInputArrowWithDiamondInputArrowWithDiamondKeyword_9_0; }

		//InputArrowWithFillDiamond='InputArrowWothFillDiamond'
		public EnumLiteralDeclaration getInputArrowWithFillDiamondEnumLiteralDeclaration_10() { return cInputArrowWithFillDiamondEnumLiteralDeclaration_10; }

		//'InputArrowWothFillDiamond'
		public Keyword getInputArrowWithFillDiamondInputArrowWothFillDiamondKeyword_10_0() { return cInputArrowWithFillDiamondInputArrowWothFillDiamondKeyword_10_0; }
	}

	public class SystemColorsElements extends AbstractEnumRuleElementFinder {
		private final EnumRule rule = (EnumRule) GrammarUtil.findRuleForName(getGrammar(), "org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.Vpdiagram.SystemColors");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final EnumLiteralDeclaration cBlackEnumLiteralDeclaration_0 = (EnumLiteralDeclaration)cAlternatives.eContents().get(0);
		private final Keyword cBlackBlackKeyword_0_0 = (Keyword)cBlackEnumLiteralDeclaration_0.eContents().get(0);
		private final EnumLiteralDeclaration cBlueEnumLiteralDeclaration_1 = (EnumLiteralDeclaration)cAlternatives.eContents().get(1);
		private final Keyword cBlueBlueKeyword_1_0 = (Keyword)cBlueEnumLiteralDeclaration_1.eContents().get(0);
		private final EnumLiteralDeclaration cRedEnumLiteralDeclaration_2 = (EnumLiteralDeclaration)cAlternatives.eContents().get(2);
		private final Keyword cRedRedKeyword_2_0 = (Keyword)cRedEnumLiteralDeclaration_2.eContents().get(0);
		private final EnumLiteralDeclaration cGreenEnumLiteralDeclaration_3 = (EnumLiteralDeclaration)cAlternatives.eContents().get(3);
		private final Keyword cGreenGreenKeyword_3_0 = (Keyword)cGreenEnumLiteralDeclaration_3.eContents().get(0);
		private final EnumLiteralDeclaration cYellowEnumLiteralDeclaration_4 = (EnumLiteralDeclaration)cAlternatives.eContents().get(4);
		private final Keyword cYellowYellowKeyword_4_0 = (Keyword)cYellowEnumLiteralDeclaration_4.eContents().get(0);
		private final EnumLiteralDeclaration cPurpleEnumLiteralDeclaration_5 = (EnumLiteralDeclaration)cAlternatives.eContents().get(5);
		private final Keyword cPurplePurpleKeyword_5_0 = (Keyword)cPurpleEnumLiteralDeclaration_5.eContents().get(0);
		private final EnumLiteralDeclaration cOrangeEnumLiteralDeclaration_6 = (EnumLiteralDeclaration)cAlternatives.eContents().get(6);
		private final Keyword cOrangeOrangeKeyword_6_0 = (Keyword)cOrangeEnumLiteralDeclaration_6.eContents().get(0);
		private final EnumLiteralDeclaration cChocolateEnumLiteralDeclaration_7 = (EnumLiteralDeclaration)cAlternatives.eContents().get(7);
		private final Keyword cChocolateChocolateKeyword_7_0 = (Keyword)cChocolateEnumLiteralDeclaration_7.eContents().get(0);
		private final EnumLiteralDeclaration cGrayEnumLiteralDeclaration_8 = (EnumLiteralDeclaration)cAlternatives.eContents().get(8);
		private final Keyword cGrayGrayKeyword_8_0 = (Keyword)cGrayEnumLiteralDeclaration_8.eContents().get(0);
		private final EnumLiteralDeclaration cWhiteEnumLiteralDeclaration_9 = (EnumLiteralDeclaration)cAlternatives.eContents().get(9);
		private final Keyword cWhiteWhiteKeyword_9_0 = (Keyword)cWhiteEnumLiteralDeclaration_9.eContents().get(0);
		private final EnumLiteralDeclaration cDark_blueEnumLiteralDeclaration_10 = (EnumLiteralDeclaration)cAlternatives.eContents().get(10);
		private final Keyword cDark_blueDark_blueKeyword_10_0 = (Keyword)cDark_blueEnumLiteralDeclaration_10.eContents().get(0);
		private final EnumLiteralDeclaration cDark_redEnumLiteralDeclaration_11 = (EnumLiteralDeclaration)cAlternatives.eContents().get(11);
		private final Keyword cDark_redDark_redKeyword_11_0 = (Keyword)cDark_redEnumLiteralDeclaration_11.eContents().get(0);
		private final EnumLiteralDeclaration cDark_greenEnumLiteralDeclaration_12 = (EnumLiteralDeclaration)cAlternatives.eContents().get(12);
		private final Keyword cDark_greenDark_greenKeyword_12_0 = (Keyword)cDark_greenEnumLiteralDeclaration_12.eContents().get(0);
		private final EnumLiteralDeclaration cDark_yellowEnumLiteralDeclaration_13 = (EnumLiteralDeclaration)cAlternatives.eContents().get(13);
		private final Keyword cDark_yellowDark_yellowKeyword_13_0 = (Keyword)cDark_yellowEnumLiteralDeclaration_13.eContents().get(0);
		private final EnumLiteralDeclaration cDark_purpleEnumLiteralDeclaration_14 = (EnumLiteralDeclaration)cAlternatives.eContents().get(14);
		private final Keyword cDark_purpleDark_purpleKeyword_14_0 = (Keyword)cDark_purpleEnumLiteralDeclaration_14.eContents().get(0);
		private final EnumLiteralDeclaration cDark_orangeEnumLiteralDeclaration_15 = (EnumLiteralDeclaration)cAlternatives.eContents().get(15);
		private final Keyword cDark_orangeDark_orangeKeyword_15_0 = (Keyword)cDark_orangeEnumLiteralDeclaration_15.eContents().get(0);
		private final EnumLiteralDeclaration cDark_chocolateEnumLiteralDeclaration_16 = (EnumLiteralDeclaration)cAlternatives.eContents().get(16);
		private final Keyword cDark_chocolateDark_chocolateKeyword_16_0 = (Keyword)cDark_chocolateEnumLiteralDeclaration_16.eContents().get(0);
		private final EnumLiteralDeclaration cDark_grayEnumLiteralDeclaration_17 = (EnumLiteralDeclaration)cAlternatives.eContents().get(17);
		private final Keyword cDark_grayDark_grayKeyword_17_0 = (Keyword)cDark_grayEnumLiteralDeclaration_17.eContents().get(0);
		private final EnumLiteralDeclaration cLight_blueEnumLiteralDeclaration_18 = (EnumLiteralDeclaration)cAlternatives.eContents().get(18);
		private final Keyword cLight_blueLight_blueKeyword_18_0 = (Keyword)cLight_blueEnumLiteralDeclaration_18.eContents().get(0);
		private final EnumLiteralDeclaration cLight_redEnumLiteralDeclaration_19 = (EnumLiteralDeclaration)cAlternatives.eContents().get(19);
		private final Keyword cLight_redLight_redKeyword_19_0 = (Keyword)cLight_redEnumLiteralDeclaration_19.eContents().get(0);
		private final EnumLiteralDeclaration cLight_greenEnumLiteralDeclaration_20 = (EnumLiteralDeclaration)cAlternatives.eContents().get(20);
		private final Keyword cLight_greenLight_greenKeyword_20_0 = (Keyword)cLight_greenEnumLiteralDeclaration_20.eContents().get(0);
		private final EnumLiteralDeclaration cLight_yellowEnumLiteralDeclaration_21 = (EnumLiteralDeclaration)cAlternatives.eContents().get(21);
		private final Keyword cLight_yellowLight_yellowKeyword_21_0 = (Keyword)cLight_yellowEnumLiteralDeclaration_21.eContents().get(0);
		private final EnumLiteralDeclaration cLight_purpleEnumLiteralDeclaration_22 = (EnumLiteralDeclaration)cAlternatives.eContents().get(22);
		private final Keyword cLight_purpleLight_purpleKeyword_22_0 = (Keyword)cLight_purpleEnumLiteralDeclaration_22.eContents().get(0);
		private final EnumLiteralDeclaration cLight_orangeEnumLiteralDeclaration_23 = (EnumLiteralDeclaration)cAlternatives.eContents().get(23);
		private final Keyword cLight_orangeLight_orangeKeyword_23_0 = (Keyword)cLight_orangeEnumLiteralDeclaration_23.eContents().get(0);
		private final EnumLiteralDeclaration cLight_chocolateEnumLiteralDeclaration_24 = (EnumLiteralDeclaration)cAlternatives.eContents().get(24);
		private final Keyword cLight_chocolateLight_chocolateKeyword_24_0 = (Keyword)cLight_chocolateEnumLiteralDeclaration_24.eContents().get(0);
		private final EnumLiteralDeclaration cLight_grayEnumLiteralDeclaration_25 = (EnumLiteralDeclaration)cAlternatives.eContents().get(25);
		private final Keyword cLight_grayLight_grayKeyword_25_0 = (Keyword)cLight_grayEnumLiteralDeclaration_25.eContents().get(0);
		
		//enum SystemColors returns siriusDescription::SystemColors:
		//	black | blue | red | green | yellow | purple | orange | chocolate | gray | white | dark_blue | dark_red | dark_green
		//	| dark_yellow | dark_purple | dark_orange | dark_chocolate | dark_gray | light_blue | light_red | light_green |
		//	light_yellow | light_purple | light_orange | light_chocolate | light_gray;
		public EnumRule getRule() { return rule; }

		//black | blue | red | green | yellow | purple | orange | chocolate | gray | white | dark_blue | dark_red | dark_green |
		//dark_yellow | dark_purple | dark_orange | dark_chocolate | dark_gray | light_blue | light_red | light_green |
		//light_yellow | light_purple | light_orange | light_chocolate | light_gray
		public Alternatives getAlternatives() { return cAlternatives; }

		//black
		public EnumLiteralDeclaration getBlackEnumLiteralDeclaration_0() { return cBlackEnumLiteralDeclaration_0; }

		//'black'
		public Keyword getBlackBlackKeyword_0_0() { return cBlackBlackKeyword_0_0; }

		//blue
		public EnumLiteralDeclaration getBlueEnumLiteralDeclaration_1() { return cBlueEnumLiteralDeclaration_1; }

		//'blue'
		public Keyword getBlueBlueKeyword_1_0() { return cBlueBlueKeyword_1_0; }

		//red
		public EnumLiteralDeclaration getRedEnumLiteralDeclaration_2() { return cRedEnumLiteralDeclaration_2; }

		//'red'
		public Keyword getRedRedKeyword_2_0() { return cRedRedKeyword_2_0; }

		//green
		public EnumLiteralDeclaration getGreenEnumLiteralDeclaration_3() { return cGreenEnumLiteralDeclaration_3; }

		//'green'
		public Keyword getGreenGreenKeyword_3_0() { return cGreenGreenKeyword_3_0; }

		//yellow
		public EnumLiteralDeclaration getYellowEnumLiteralDeclaration_4() { return cYellowEnumLiteralDeclaration_4; }

		//'yellow'
		public Keyword getYellowYellowKeyword_4_0() { return cYellowYellowKeyword_4_0; }

		//purple
		public EnumLiteralDeclaration getPurpleEnumLiteralDeclaration_5() { return cPurpleEnumLiteralDeclaration_5; }

		//'purple'
		public Keyword getPurplePurpleKeyword_5_0() { return cPurplePurpleKeyword_5_0; }

		//orange
		public EnumLiteralDeclaration getOrangeEnumLiteralDeclaration_6() { return cOrangeEnumLiteralDeclaration_6; }

		//'orange'
		public Keyword getOrangeOrangeKeyword_6_0() { return cOrangeOrangeKeyword_6_0; }

		//chocolate
		public EnumLiteralDeclaration getChocolateEnumLiteralDeclaration_7() { return cChocolateEnumLiteralDeclaration_7; }

		//'chocolate'
		public Keyword getChocolateChocolateKeyword_7_0() { return cChocolateChocolateKeyword_7_0; }

		//gray
		public EnumLiteralDeclaration getGrayEnumLiteralDeclaration_8() { return cGrayEnumLiteralDeclaration_8; }

		//'gray'
		public Keyword getGrayGrayKeyword_8_0() { return cGrayGrayKeyword_8_0; }

		//white
		public EnumLiteralDeclaration getWhiteEnumLiteralDeclaration_9() { return cWhiteEnumLiteralDeclaration_9; }

		//'white'
		public Keyword getWhiteWhiteKeyword_9_0() { return cWhiteWhiteKeyword_9_0; }

		//dark_blue
		public EnumLiteralDeclaration getDark_blueEnumLiteralDeclaration_10() { return cDark_blueEnumLiteralDeclaration_10; }

		//'dark_blue'
		public Keyword getDark_blueDark_blueKeyword_10_0() { return cDark_blueDark_blueKeyword_10_0; }

		//dark_red
		public EnumLiteralDeclaration getDark_redEnumLiteralDeclaration_11() { return cDark_redEnumLiteralDeclaration_11; }

		//'dark_red'
		public Keyword getDark_redDark_redKeyword_11_0() { return cDark_redDark_redKeyword_11_0; }

		//dark_green
		public EnumLiteralDeclaration getDark_greenEnumLiteralDeclaration_12() { return cDark_greenEnumLiteralDeclaration_12; }

		//'dark_green'
		public Keyword getDark_greenDark_greenKeyword_12_0() { return cDark_greenDark_greenKeyword_12_0; }

		//dark_yellow
		public EnumLiteralDeclaration getDark_yellowEnumLiteralDeclaration_13() { return cDark_yellowEnumLiteralDeclaration_13; }

		//'dark_yellow'
		public Keyword getDark_yellowDark_yellowKeyword_13_0() { return cDark_yellowDark_yellowKeyword_13_0; }

		//dark_purple
		public EnumLiteralDeclaration getDark_purpleEnumLiteralDeclaration_14() { return cDark_purpleEnumLiteralDeclaration_14; }

		//'dark_purple'
		public Keyword getDark_purpleDark_purpleKeyword_14_0() { return cDark_purpleDark_purpleKeyword_14_0; }

		//dark_orange
		public EnumLiteralDeclaration getDark_orangeEnumLiteralDeclaration_15() { return cDark_orangeEnumLiteralDeclaration_15; }

		//'dark_orange'
		public Keyword getDark_orangeDark_orangeKeyword_15_0() { return cDark_orangeDark_orangeKeyword_15_0; }

		//dark_chocolate
		public EnumLiteralDeclaration getDark_chocolateEnumLiteralDeclaration_16() { return cDark_chocolateEnumLiteralDeclaration_16; }

		//'dark_chocolate'
		public Keyword getDark_chocolateDark_chocolateKeyword_16_0() { return cDark_chocolateDark_chocolateKeyword_16_0; }

		//dark_gray
		public EnumLiteralDeclaration getDark_grayEnumLiteralDeclaration_17() { return cDark_grayEnumLiteralDeclaration_17; }

		//'dark_gray'
		public Keyword getDark_grayDark_grayKeyword_17_0() { return cDark_grayDark_grayKeyword_17_0; }

		//light_blue
		public EnumLiteralDeclaration getLight_blueEnumLiteralDeclaration_18() { return cLight_blueEnumLiteralDeclaration_18; }

		//'light_blue'
		public Keyword getLight_blueLight_blueKeyword_18_0() { return cLight_blueLight_blueKeyword_18_0; }

		//light_red
		public EnumLiteralDeclaration getLight_redEnumLiteralDeclaration_19() { return cLight_redEnumLiteralDeclaration_19; }

		//'light_red'
		public Keyword getLight_redLight_redKeyword_19_0() { return cLight_redLight_redKeyword_19_0; }

		//light_green
		public EnumLiteralDeclaration getLight_greenEnumLiteralDeclaration_20() { return cLight_greenEnumLiteralDeclaration_20; }

		//'light_green'
		public Keyword getLight_greenLight_greenKeyword_20_0() { return cLight_greenLight_greenKeyword_20_0; }

		//light_yellow
		public EnumLiteralDeclaration getLight_yellowEnumLiteralDeclaration_21() { return cLight_yellowEnumLiteralDeclaration_21; }

		//'light_yellow'
		public Keyword getLight_yellowLight_yellowKeyword_21_0() { return cLight_yellowLight_yellowKeyword_21_0; }

		//light_purple
		public EnumLiteralDeclaration getLight_purpleEnumLiteralDeclaration_22() { return cLight_purpleEnumLiteralDeclaration_22; }

		//'light_purple'
		public Keyword getLight_purpleLight_purpleKeyword_22_0() { return cLight_purpleLight_purpleKeyword_22_0; }

		//light_orange
		public EnumLiteralDeclaration getLight_orangeEnumLiteralDeclaration_23() { return cLight_orangeEnumLiteralDeclaration_23; }

		//'light_orange'
		public Keyword getLight_orangeLight_orangeKeyword_23_0() { return cLight_orangeLight_orangeKeyword_23_0; }

		//light_chocolate
		public EnumLiteralDeclaration getLight_chocolateEnumLiteralDeclaration_24() { return cLight_chocolateEnumLiteralDeclaration_24; }

		//'light_chocolate'
		public Keyword getLight_chocolateLight_chocolateKeyword_24_0() { return cLight_chocolateLight_chocolateKeyword_24_0; }

		//light_gray
		public EnumLiteralDeclaration getLight_grayEnumLiteralDeclaration_25() { return cLight_grayEnumLiteralDeclaration_25; }

		//'light_gray'
		public Keyword getLight_grayLight_grayKeyword_25_0() { return cLight_grayLight_grayKeyword_25_0; }
	}

	public class ContainerLayoutElements extends AbstractEnumRuleElementFinder {
		private final EnumRule rule = (EnumRule) GrammarUtil.findRuleForName(getGrammar(), "org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.Vpdiagram.ContainerLayout");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final EnumLiteralDeclaration cFreeFormEnumLiteralDeclaration_0 = (EnumLiteralDeclaration)cAlternatives.eContents().get(0);
		private final Keyword cFreeFormFreeFormKeyword_0_0 = (Keyword)cFreeFormEnumLiteralDeclaration_0.eContents().get(0);
		private final EnumLiteralDeclaration cListEnumLiteralDeclaration_1 = (EnumLiteralDeclaration)cAlternatives.eContents().get(1);
		private final Keyword cListListKeyword_1_0 = (Keyword)cListEnumLiteralDeclaration_1.eContents().get(0);
		private final EnumLiteralDeclaration cHorizontalStackEnumLiteralDeclaration_2 = (EnumLiteralDeclaration)cAlternatives.eContents().get(2);
		private final Keyword cHorizontalStackHorizontalStackKeyword_2_0 = (Keyword)cHorizontalStackEnumLiteralDeclaration_2.eContents().get(0);
		private final EnumLiteralDeclaration cVerticalStackEnumLiteralDeclaration_3 = (EnumLiteralDeclaration)cAlternatives.eContents().get(3);
		private final Keyword cVerticalStackVerticalStackKeyword_3_0 = (Keyword)cVerticalStackEnumLiteralDeclaration_3.eContents().get(0);
		
		//enum ContainerLayout returns siriusDiagram::ContainerLayout:
		//	FreeForm | List | HorizontalStack | VerticalStack;
		public EnumRule getRule() { return rule; }

		//FreeForm | List | HorizontalStack | VerticalStack
		public Alternatives getAlternatives() { return cAlternatives; }

		//FreeForm
		public EnumLiteralDeclaration getFreeFormEnumLiteralDeclaration_0() { return cFreeFormEnumLiteralDeclaration_0; }

		//'FreeForm'
		public Keyword getFreeFormFreeFormKeyword_0_0() { return cFreeFormFreeFormKeyword_0_0; }

		//List
		public EnumLiteralDeclaration getListEnumLiteralDeclaration_1() { return cListEnumLiteralDeclaration_1; }

		//'List'
		public Keyword getListListKeyword_1_0() { return cListListKeyword_1_0; }

		//HorizontalStack
		public EnumLiteralDeclaration getHorizontalStackEnumLiteralDeclaration_2() { return cHorizontalStackEnumLiteralDeclaration_2; }

		//'HorizontalStack'
		public Keyword getHorizontalStackHorizontalStackKeyword_2_0() { return cHorizontalStackHorizontalStackKeyword_2_0; }

		//VerticalStack
		public EnumLiteralDeclaration getVerticalStackEnumLiteralDeclaration_3() { return cVerticalStackEnumLiteralDeclaration_3; }

		//'VerticalStack'
		public Keyword getVerticalStackVerticalStackKeyword_3_0() { return cVerticalStackVerticalStackKeyword_3_0; }
	}

	public class SynchronizationModeElements extends AbstractEnumRuleElementFinder {
		private final EnumRule rule = (EnumRule) GrammarUtil.findRuleForName(getGrammar(), "org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.Vpdiagram.SynchronizationMode");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final EnumLiteralDeclaration cSynchronizedEnumLiteralDeclaration_0 = (EnumLiteralDeclaration)cAlternatives.eContents().get(0);
		private final Keyword cSynchronizedSynchronizedKeyword_0_0 = (Keyword)cSynchronizedEnumLiteralDeclaration_0.eContents().get(0);
		private final EnumLiteralDeclaration cUnsynchronizableEnumLiteralDeclaration_1 = (EnumLiteralDeclaration)cAlternatives.eContents().get(1);
		private final Keyword cUnsynchronizableUnsynchronizableKeyword_1_0 = (Keyword)cUnsynchronizableEnumLiteralDeclaration_1.eContents().get(0);
		private final EnumLiteralDeclaration cNot_SynchronizedEnumLiteralDeclaration_2 = (EnumLiteralDeclaration)cAlternatives.eContents().get(2);
		private final Keyword cNot_SynchronizedNotSynchronizedKeyword_2_0 = (Keyword)cNot_SynchronizedEnumLiteralDeclaration_2.eContents().get(0);
		
		//enum SynchronizationMode returns vpdiagram::SynchronizationMode:
		//	Synchronized="synchronized" | Unsynchronizable="unsynchronizable" | Not_Synchronized="not-synchronized";
		public EnumRule getRule() { return rule; }

		//Synchronized="synchronized" | Unsynchronizable="unsynchronizable" | Not_Synchronized="not-synchronized"
		public Alternatives getAlternatives() { return cAlternatives; }

		//Synchronized="synchronized"
		public EnumLiteralDeclaration getSynchronizedEnumLiteralDeclaration_0() { return cSynchronizedEnumLiteralDeclaration_0; }

		//"synchronized"
		public Keyword getSynchronizedSynchronizedKeyword_0_0() { return cSynchronizedSynchronizedKeyword_0_0; }

		//Unsynchronizable="unsynchronizable"
		public EnumLiteralDeclaration getUnsynchronizableEnumLiteralDeclaration_1() { return cUnsynchronizableEnumLiteralDeclaration_1; }

		//"unsynchronizable"
		public Keyword getUnsynchronizableUnsynchronizableKeyword_1_0() { return cUnsynchronizableUnsynchronizableKeyword_1_0; }

		//Not_Synchronized="not-synchronized"
		public EnumLiteralDeclaration getNot_SynchronizedEnumLiteralDeclaration_2() { return cNot_SynchronizedEnumLiteralDeclaration_2; }

		//"not-synchronized"
		public Keyword getNot_SynchronizedNotSynchronizedKeyword_2_0() { return cNot_SynchronizedNotSynchronizedKeyword_2_0; }
	}
	
	private final DiagramsElements pDiagrams;
	private final AbstractImportElements pAbstractImport;
	private final ImportNameSpaceElements pImportNameSpace;
	private final ImportGroupElements pImportGroup;
	private final AspectElements pAspect;
	private final DiagramSetElements pDiagramSet;
	private final DiagramRepresentationElements pDiagramRepresentation;
	private final DiagramElementElements pDiagramElement;
	private final DiagramChildrenElements pDiagramChildren;
	private final AbstractNodeElements pAbstractNode;
	private final AbstractEdgeElements pAbstractEdge;
	private final AbstractDescriptionElements pAbstractDescription;
	private final AbstractContainerStyleElements pAbstractContainerStyle;
	private final AbstractNodeStyleElements pAbstractNodeStyle;
	private final DiagramElements pDiagram;
	private final DiagramExtensionElements pDiagramExtension;
	private final MappingSetElements pMappingSet;
	private final EdgeDescriptionElements pEdgeDescription;
	private final ConditionElements pCondition;
	private final EdgeStyleElements pEdgeStyle;
	private final ContainerElements pContainer;
	private final ContainerChildrenElements pContainerChildren;
	private final NodeDomainElementElements pNodeDomainElement;
	private final ContainerDescriptionElements pContainerDescription;
	private final BasicStyleElements pBasicStyle;
	private final HistogramStyleElements pHistogramStyle;
	private final HistogramSectionElements pHistogramSection;
	private final ImageStyleElements pImageStyle;
	private final FlatStyleElements pFlatStyle;
	private final LabelElements pLabel;
	private final NodeElements pNode;
	private final NodeChildrenElements pNodeChildren;
	private final BorderedNodeElements pBorderedNode;
	private final NodeDescriptionElements pNodeDescription;
	private final ActionSetElements pActionSet;
	private final OpenActionElements pOpenAction;
	private final ActionElements pAction;
	private final CreateElements pCreate;
	private final DeleteElements pDelete;
	private final DropElements pDrop;
	private final ReconnectEdgeElements pReconnectEdge;
	private final DomainContainerElements pDomainContainer;
	private final EdgeElements pEdge;
	private final EdgeImportElements pEdgeImport;
	private final EdgeDomainAssociationElements pEdgeDomainAssociation;
	private final EdgeDomainElementElements pEdgeDomainElement;
	private final CustomizationsElements pCustomizations;
	private final StyleCustomizationDescriptionsElements pStyleCustomizationDescriptions;
	private final AbstractCustomizationElements pAbstractCustomization;
	private final EdgeStyleCustomizationElements pEdgeStyleCustomization;
	private final ColorCustomizationElements pColorCustomization;
	private final LabelCustomizationElements pLabelCustomization;
	private final LabelAlignementCustomizationElements pLabelAlignementCustomization;
	private final AbstractNodeStyleCustomizationElements pAbstractNodeStyleCustomization;
	private final ContainerStyleCustomizationElements pContainerStyleCustomization;
	private final SpecificContainerStyleCustomizationElements pSpecificContainerStyleCustomization;
	private final ContainerWorkspaceImageCustomizationElements pContainerWorkspaceImageCustomization;
	private final FlatContainerStyleCustomizationElements pFlatContainerStyleCustomization;
	private final ShapeContainerStyleCustomizationElements pShapeContainerStyleCustomization;
	private final NodeStyleCustomizationElements pNodeStyleCustomization;
	private final SpecificNodeStyleCustomizationElements pSpecificNodeStyleCustomization;
	private final BundledImageCustomizationElements pBundledImageCustomization;
	private final LozengeCustomizationElements pLozengeCustomization;
	private final GaugeCustomizationElements pGaugeCustomization;
	private final EllipseCustomizationElements pEllipseCustomization;
	private final NodeWorkspaceImageCustomizationElements pNodeWorkspaceImageCustomization;
	private final SquareCustomizationElements pSquareCustomization;
	private final DotCustomizationElements pDotCustomization;
	private final StyleCustomizationReuseElements pStyleCustomizationReuse;
	private final CustomizationExpressionElements pCustomizationExpression;
	private final AlignmentKindElements eAlignmentKind;
	private final BundledImageShapeElements eBundledImageShape;
	private final ResizeKindElements eResizeKind;
	private final ContainerShapeElements eContainerShape;
	private final FontFormatElements eFontFormat;
	private final CenterStyleElements eCenterStyle;
	private final FoldingStyleElements eFoldingStyle;
	private final EdgeRoutingElements eEdgeRouting;
	private final ColorUseCaseElements eColorUseCase;
	private final Node_FormElements eNode_Form;
	private final BackgroundStyleElements eBackgroundStyle;
	private final LabelPositionElements eLabelPosition;
	private final LabelAlignmentElements eLabelAlignment;
	private final LineStyleElements eLineStyle;
	private final EdgeArrowsElements eEdgeArrows;
	private final SystemColorsElements eSystemColors;
	private final ContainerLayoutElements eContainerLayout;
	private final SynchronizationModeElements eSynchronizationMode;
	private final AbstractClassElements pAbstractClass;
	private final LocalClass2Elements pLocalClass2;
	private final ExternalClassElements pExternalClass;
	private final AbstractAssociation2Elements pAbstractAssociation2;
	private final LocalAssociationElements pLocalAssociation;
	private final ExternalAssociationElements pExternalAssociation;
	private final AbstractAttributeElements pAbstractAttribute;
	private final LocalAttributeElements pLocalAttribute;
	private final ExternalAttributeElements pExternalAttribute;
	private final ExpressionElements pExpression;
	private final AbstractComputableElementElements pAbstractComputableElement;
	private final ExpressionElementElements pExpressionElement;
	private final ForeignExpressionElementElements pForeignExpressionElement;
	private final JavaElementElements pJavaElement;
	private final DomainElementElements pDomainElement;
	private final StringElementElements pStringElement;
	
	private final Grammar grammar;

	private final CommonGrammarAccess gaCommon;

	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public VpdiagramGrammarAccess(GrammarProvider grammarProvider,
		CommonGrammarAccess gaCommon,
		TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaCommon = gaCommon;
		this.gaTerminals = gaTerminals;
		this.pDiagrams = new DiagramsElements();
		this.pAbstractImport = new AbstractImportElements();
		this.pImportNameSpace = new ImportNameSpaceElements();
		this.pImportGroup = new ImportGroupElements();
		this.pAspect = new AspectElements();
		this.pDiagramSet = new DiagramSetElements();
		this.pDiagramRepresentation = new DiagramRepresentationElements();
		this.pDiagramElement = new DiagramElementElements();
		this.pDiagramChildren = new DiagramChildrenElements();
		this.pAbstractNode = new AbstractNodeElements();
		this.pAbstractEdge = new AbstractEdgeElements();
		this.pAbstractDescription = new AbstractDescriptionElements();
		this.pAbstractContainerStyle = new AbstractContainerStyleElements();
		this.pAbstractNodeStyle = new AbstractNodeStyleElements();
		this.pDiagram = new DiagramElements();
		this.pDiagramExtension = new DiagramExtensionElements();
		this.pMappingSet = new MappingSetElements();
		this.pEdgeDescription = new EdgeDescriptionElements();
		this.pCondition = new ConditionElements();
		this.pEdgeStyle = new EdgeStyleElements();
		this.pContainer = new ContainerElements();
		this.pContainerChildren = new ContainerChildrenElements();
		this.pNodeDomainElement = new NodeDomainElementElements();
		this.pContainerDescription = new ContainerDescriptionElements();
		this.pBasicStyle = new BasicStyleElements();
		this.pHistogramStyle = new HistogramStyleElements();
		this.pHistogramSection = new HistogramSectionElements();
		this.pImageStyle = new ImageStyleElements();
		this.pFlatStyle = new FlatStyleElements();
		this.pLabel = new LabelElements();
		this.pNode = new NodeElements();
		this.pNodeChildren = new NodeChildrenElements();
		this.pBorderedNode = new BorderedNodeElements();
		this.pNodeDescription = new NodeDescriptionElements();
		this.pActionSet = new ActionSetElements();
		this.pOpenAction = new OpenActionElements();
		this.pAction = new ActionElements();
		this.pCreate = new CreateElements();
		this.pDelete = new DeleteElements();
		this.pDrop = new DropElements();
		this.pReconnectEdge = new ReconnectEdgeElements();
		this.pDomainContainer = new DomainContainerElements();
		this.pEdge = new EdgeElements();
		this.pEdgeImport = new EdgeImportElements();
		this.pEdgeDomainAssociation = new EdgeDomainAssociationElements();
		this.pEdgeDomainElement = new EdgeDomainElementElements();
		this.pCustomizations = new CustomizationsElements();
		this.pStyleCustomizationDescriptions = new StyleCustomizationDescriptionsElements();
		this.pAbstractCustomization = new AbstractCustomizationElements();
		this.pEdgeStyleCustomization = new EdgeStyleCustomizationElements();
		this.pColorCustomization = new ColorCustomizationElements();
		this.pLabelCustomization = new LabelCustomizationElements();
		this.pLabelAlignementCustomization = new LabelAlignementCustomizationElements();
		this.pAbstractNodeStyleCustomization = new AbstractNodeStyleCustomizationElements();
		this.pContainerStyleCustomization = new ContainerStyleCustomizationElements();
		this.pSpecificContainerStyleCustomization = new SpecificContainerStyleCustomizationElements();
		this.pContainerWorkspaceImageCustomization = new ContainerWorkspaceImageCustomizationElements();
		this.pFlatContainerStyleCustomization = new FlatContainerStyleCustomizationElements();
		this.pShapeContainerStyleCustomization = new ShapeContainerStyleCustomizationElements();
		this.pNodeStyleCustomization = new NodeStyleCustomizationElements();
		this.pSpecificNodeStyleCustomization = new SpecificNodeStyleCustomizationElements();
		this.pBundledImageCustomization = new BundledImageCustomizationElements();
		this.pLozengeCustomization = new LozengeCustomizationElements();
		this.pGaugeCustomization = new GaugeCustomizationElements();
		this.pEllipseCustomization = new EllipseCustomizationElements();
		this.pNodeWorkspaceImageCustomization = new NodeWorkspaceImageCustomizationElements();
		this.pSquareCustomization = new SquareCustomizationElements();
		this.pDotCustomization = new DotCustomizationElements();
		this.pStyleCustomizationReuse = new StyleCustomizationReuseElements();
		this.pCustomizationExpression = new CustomizationExpressionElements();
		this.eAlignmentKind = new AlignmentKindElements();
		this.eBundledImageShape = new BundledImageShapeElements();
		this.eResizeKind = new ResizeKindElements();
		this.eContainerShape = new ContainerShapeElements();
		this.eFontFormat = new FontFormatElements();
		this.eCenterStyle = new CenterStyleElements();
		this.eFoldingStyle = new FoldingStyleElements();
		this.eEdgeRouting = new EdgeRoutingElements();
		this.eColorUseCase = new ColorUseCaseElements();
		this.eNode_Form = new Node_FormElements();
		this.eBackgroundStyle = new BackgroundStyleElements();
		this.eLabelPosition = new LabelPositionElements();
		this.eLabelAlignment = new LabelAlignmentElements();
		this.eLineStyle = new LineStyleElements();
		this.eEdgeArrows = new EdgeArrowsElements();
		this.eSystemColors = new SystemColorsElements();
		this.eContainerLayout = new ContainerLayoutElements();
		this.eSynchronizationMode = new SynchronizationModeElements();
		this.pAbstractClass = new AbstractClassElements();
		this.pLocalClass2 = new LocalClass2Elements();
		this.pExternalClass = new ExternalClassElements();
		this.pAbstractAssociation2 = new AbstractAssociation2Elements();
		this.pLocalAssociation = new LocalAssociationElements();
		this.pExternalAssociation = new ExternalAssociationElements();
		this.pAbstractAttribute = new AbstractAttributeElements();
		this.pLocalAttribute = new LocalAttributeElements();
		this.pExternalAttribute = new ExternalAttributeElements();
		this.pExpression = new ExpressionElements();
		this.pAbstractComputableElement = new AbstractComputableElementElements();
		this.pExpressionElement = new ExpressionElementElements();
		this.pForeignExpressionElement = new ForeignExpressionElementElements();
		this.pJavaElement = new JavaElementElements();
		this.pDomainElement = new DomainElementElements();
		this.pStringElement = new StringElementElements();
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.Vpdiagram".equals(grammar.getName())) {
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

	
	//Diagrams:
	//	{Diagrams} imports+=AbstractImport* diagrams=Aspect;
	public DiagramsElements getDiagramsAccess() {
		return pDiagrams;
	}
	
	public ParserRule getDiagramsRule() {
		return getDiagramsAccess().getRule();
	}

	//AbstractImport:
	//	ImportNameSpace | ImportGroup;
	public AbstractImportElements getAbstractImportAccess() {
		return pAbstractImport;
	}
	
	public ParserRule getAbstractImportRule() {
		return getAbstractImportAccess().getRule();
	}

	//ImportNameSpace:
	//	'import' importedNamespace=FQN;
	public ImportNameSpaceElements getImportNameSpaceAccess() {
		return pImportNameSpace;
	}
	
	public ParserRule getImportNameSpaceRule() {
		return getImportNameSpaceAccess().getRule();
	}

	//ImportGroup:
	//	'import' 'external' importedGroup=EString;
	public ImportGroupElements getImportGroupAccess() {
		return pImportGroup;
	}
	
	public ParserRule getImportGroupRule() {
		return getImportGroupAccess().getRule();
	}

	//Aspect vpdesc::Aspect:
	//	DiagramSet
	public AspectElements getAspectAccess() {
		return pAspect;
	}
	
	public ParserRule getAspectRule() {
		return getAspectAccess().getRule();
	}

	/// ********************************************************************
	// * 							vpdiagram
	// * 
	// ******************************************************************** /
	//DiagramSet vpdesc::Aspect:
	//	{vpdiagram::DiagramSet} 'Diagrams' name=FQN '{' diagrams+=DiagramRepresentation* '}'
	public DiagramSetElements getDiagramSetAccess() {
		return pDiagramSet;
	}
	
	public ParserRule getDiagramSetRule() {
		return getDiagramSetAccess().getRule();
	}

	//DiagramRepresentation vpdiagram::DiagramRepresentation:
	//	Diagram | DiagramExtension
	public DiagramRepresentationElements getDiagramRepresentationAccess() {
		return pDiagramRepresentation;
	}
	
	public ParserRule getDiagramRepresentationRule() {
		return getDiagramRepresentationAccess().getRule();
	}

	//DiagramElement vpdiagram::DiagramElement:
	//	DiagramChildren | BorderedNode
	public DiagramElementElements getDiagramElementAccess() {
		return pDiagramElement;
	}
	
	public ParserRule getDiagramElementRule() {
		return getDiagramElementAccess().getRule();
	}

	//DiagramChildren vpdiagram::DiagramChildren:
	//	AbstractEdge | Container | Node
	public DiagramChildrenElements getDiagramChildrenAccess() {
		return pDiagramChildren;
	}
	
	public ParserRule getDiagramChildrenRule() {
		return getDiagramChildrenAccess().getRule();
	}

	//AbstractNode vpdiagram::AbstractNode:
	//	Node | BorderedNode | Container
	public AbstractNodeElements getAbstractNodeAccess() {
		return pAbstractNode;
	}
	
	public ParserRule getAbstractNodeRule() {
		return getAbstractNodeAccess().getRule();
	}

	//AbstractEdge vpdiagram::DiagramChildren:
	//	Edge | EdgeImport
	public AbstractEdgeElements getAbstractEdgeAccess() {
		return pAbstractEdge;
	}
	
	public ParserRule getAbstractEdgeRule() {
		return getAbstractEdgeAccess().getRule();
	}

	//AbstractDescription vpdiagram::AbstractDescription:
	//	ContainerDescription | NodeDescription
	public AbstractDescriptionElements getAbstractDescriptionAccess() {
		return pAbstractDescription;
	}
	
	public ParserRule getAbstractDescriptionRule() {
		return getAbstractDescriptionAccess().getRule();
	}

	//AbstractContainerStyle vpdiagram::AbstractContainerStyle:
	//	FlatStyle | ImageStyle
	public AbstractContainerStyleElements getAbstractContainerStyleAccess() {
		return pAbstractContainerStyle;
	}
	
	public ParserRule getAbstractContainerStyleRule() {
		return getAbstractContainerStyleAccess().getRule();
	}

	//AbstractNodeStyle vpdiagram::AbstractNodeStyle:
	//	ImageStyle | BasicStyle | HistogramStyle
	public AbstractNodeStyleElements getAbstractNodeStyleAccess() {
		return pAbstractNodeStyle;
	}
	
	public ParserRule getAbstractNodeStyleRule() {
		return getAbstractNodeStyleAccess().getRule();
	}

	//Diagram vpdiagram::DiagramRepresentation:
	//	{vpdiagram::Diagram} 'Diagram' name=STRING '{' ('description:' description=STRING)? the_domain=DomainContainer
	//	the_MappingSet=MappingSet? the_ActionSet=ActionSet? '}'
	public DiagramElements getDiagramAccess() {
		return pDiagram;
	}
	
	public ParserRule getDiagramRule() {
		return getDiagramAccess().getRule();
	}

	//DiagramExtension vpdiagram::DiagramRepresentation:
	//	{vpdiagram::DiagramExtension} 'DiagramExtension' name=STRING '{' ('extended-diagram:'
	//	extented_diagram=[siriusDiagramDescription::DiagramDescription|FQN])? the_MappingSet=MappingSet?
	//	the_ActionSet=ActionSet? ownedCustomizations=Customizations? '}'
	public DiagramExtensionElements getDiagramExtensionAccess() {
		return pDiagramExtension;
	}
	
	public ParserRule getDiagramExtensionRule() {
		return getDiagramExtensionAccess().getRule();
	}

	//MappingSet vpdiagram::MappingSet:
	//	{vpdiagram::MappingSet} 'Mapping' '{' diagram_Elements+=DiagramChildren* '}'
	public MappingSetElements getMappingSetAccess() {
		return pMappingSet;
	}
	
	public ParserRule getMappingSetRule() {
		return getMappingSetAccess().getRule();
	}

	//EdgeDescription vpdiagram::EdgeDescription:
	//	{vpdiagram::EdgeDescription} 'Representation' '{' condition=Condition? ('BeginLabel' '{' begin_Label=Label '}')?
	//	('CenterLabel' '{' center_label=Label '}')? ('EndLabel' '{' end_label=Label '}')? style=EdgeStyle? '}'
	public EdgeDescriptionElements getEdgeDescriptionAccess() {
		return pEdgeDescription;
	}
	
	public ParserRule getEdgeDescriptionRule() {
		return getEdgeDescriptionAccess().getRule();
	}

	//Condition vpdiagram::Condition:
	//	{vpdiagram::Condition} 'condition:' expression=ForeignExpressionElement
	public ConditionElements getConditionAccess() {
		return pCondition;
	}
	
	public ParserRule getConditionRule() {
		return getConditionAccess().getRule();
	}

	//EdgeStyle vpdiagram::EdgeStyle:
	//	{vpdiagram::EdgeStyle} 'Style' '{' ('line-style:' lineStyle=LineStyle)? ('begin-decorator:'
	//	beginDecorator=EdgeArrows)? ('end-decorator:' endDecorator=EdgeArrows)? ('color:' color=SystemColors)? '}'
	public EdgeStyleElements getEdgeStyleAccess() {
		return pEdgeStyle;
	}
	
	public ParserRule getEdgeStyleRule() {
		return getEdgeStyleAccess().getRule();
	}

	//Container vpdiagram::Container:
	//	{vpdiagram::Container} 'Container' name=EString '{' ('import:'
	//	imports=[siriusDiagramDescription::ContainerMapping|FQN])? ('domain-context:' the_domain=NodeDomainElement)?
	//	('content-layout:' contentLayout=ContainerLayout)? synchronizationMode=SynchronizationMode?
	//	style+=ContainerDescription* children=ContainerChildren? '}'
	public ContainerElements getContainerAccess() {
		return pContainer;
	}
	
	public ParserRule getContainerRule() {
		return getContainerAccess().getRule();
	}

	//ContainerChildren vpdiagram::ContainerChildren:
	//	{vpdiagram::ContainerChildren} 'Contains' '{' ('reuse' reused_nodes+=[vpdiagram::AbstractNode|FQN] (','
	//	reused_nodes+=[vpdiagram::AbstractNode|FQN])*)? owned_nodes+=AbstractNode* '}'
	public ContainerChildrenElements getContainerChildrenAccess() {
		return pContainerChildren;
	}
	
	public ParserRule getContainerChildrenRule() {
		return getContainerChildrenAccess().getRule();
	}

	//NodeDomainElement vpdiagram::NodeDomainElement:
	//	{vpdiagram::NodeDomainElement} domain_Class=AbstractClass ('provided-by' ('query' query=STRING | 'association'
	//	chlidren_list=AbstractAssociation2))?
	public NodeDomainElementElements getNodeDomainElementAccess() {
		return pNodeDomainElement;
	}
	
	public ParserRule getNodeDomainElementRule() {
		return getNodeDomainElementAccess().getRule();
	}

	//ContainerDescription vpdiagram::ContainerDescription:
	//	{vpdiagram::ContainerDescription} 'Representation' '{' condition=Condition? ('Label' '{' node_Label=Label '}')?
	//	('Style' => '{' style=AbstractContainerStyle '}')? '}'
	public ContainerDescriptionElements getContainerDescriptionAccess() {
		return pContainerDescription;
	}
	
	public ParserRule getContainerDescriptionRule() {
		return getContainerDescriptionAccess().getRule();
	}

	//BasicStyle vpdiagram::BasicStyle:
	//	{vpdiagram::BasicStyle} 'BasicStyle' '{' ('border-color:' borderColor=SystemColors)? ('background:'
	//	backgroundColor=SystemColors)? ('form:' form=Node_Form)? '}'
	public BasicStyleElements getBasicStyleAccess() {
		return pBasicStyle;
	}
	
	public ParserRule getBasicStyleRule() {
		return getBasicStyleAccess().getRule();
	}

	//HistogramStyle vpdiagram::HistogramStyle:
	//	{vpdiagram::HistogramStyle} 'HistogramStyle' '{' ('border-color:' borderColor=SystemColors)?
	//	sections+=HistogramSection* '}'
	public HistogramStyleElements getHistogramStyleAccess() {
		return pHistogramStyle;
	}
	
	public ParserRule getHistogramStyleRule() {
		return getHistogramStyleAccess().getRule();
	}

	//HistogramSection vpdiagram::HistogramSection:
	//	{vpdiagram::HistogramSection} 'Section' '{' ('background:' backgroundColor=SystemColors)? ('foreground:'
	//	forgroundColor=SystemColors)? ('minValue:' minValue=ForeignExpressionElement)? ('value:'
	//	value=ForeignExpressionElement)? ('maxValue:' maxValue=ForeignExpressionElement)? '}'
	public HistogramSectionElements getHistogramSectionAccess() {
		return pHistogramSection;
	}
	
	public ParserRule getHistogramSectionRule() {
		return getHistogramSectionAccess().getRule();
	}

	//ImageStyle vpdiagram::ImageStyle:
	//	{vpdiagram::ImageStyle} 'Image' '{' ('border:' borderColor=SystemColors)? ('path:' imagePath=STRING) '}'
	public ImageStyleElements getImageStyleAccess() {
		return pImageStyle;
	}
	
	public ParserRule getImageStyleRule() {
		return getImageStyleAccess().getRule();
	}

	//FlatStyle vpdiagram::FlatStyle:
	//	{vpdiagram::FlatStyle} 'FlatStyle' '{' ('border:' borderColor=SystemColors)? ('background:'
	//	backgroundStyle=BackgroundStyle? backgroundColor=SystemColors)? ('foreground:' forgroundColor=SystemColors)? '}'
	public FlatStyleElements getFlatStyleAccess() {
		return pFlatStyle;
	}
	
	public ParserRule getFlatStyleRule() {
		return getFlatStyleAccess().getRule();
	}

	//Label vpdiagram::Label:
	//	{vpdiagram::Label} ('content:' value=Expression) ('police:' bold?='bold'? italic?='italic'? color=SystemColors?
	//	size=EInt?)?
	public LabelElements getLabelAccess() {
		return pLabel;
	}
	
	public ParserRule getLabelRule() {
		return getLabelAccess().getRule();
	}

	//Node vpdiagram::Node:
	//	{vpdiagram::Node} 'Node' name=EString '{' ('import:' imports=[siriusDiagramDescription::NodeMapping|FQN])?
	//	('domain-context:' the_domain=NodeDomainElement)? synchronizationMode=SynchronizationMode? style+=NodeDescription*
	//	children=NodeChildren? '}'
	public NodeElements getNodeAccess() {
		return pNode;
	}
	
	public ParserRule getNodeRule() {
		return getNodeAccess().getRule();
	}

	//NodeChildren vpdiagram::NodeChildren:
	//	{vpdiagram::NodeChildren} 'Contains' '{' ('reuse' reused_boderednodes+=[vpdiagram::BorderedNode|FQN] (','
	//	reused_boderednodes+=[vpdiagram::BorderedNode|FQN])*)? owned_boderednodes+=BorderedNode* '}'
	public NodeChildrenElements getNodeChildrenAccess() {
		return pNodeChildren;
	}
	
	public ParserRule getNodeChildrenRule() {
		return getNodeChildrenAccess().getRule();
	}

	//BorderedNode vpdiagram::BorderedNode:
	//	{vpdiagram::BorderedNode} 'BorderedNode' name=EString '{' ('import:'
	//	imports=[siriusDiagramDescription::NodeMapping|FQN])? ('domain-context:' the_domain=NodeDomainElement)?
	//	synchronizationMode=SynchronizationMode? style+=NodeDescription* '}'
	public BorderedNodeElements getBorderedNodeAccess() {
		return pBorderedNode;
	}
	
	public ParserRule getBorderedNodeRule() {
		return getBorderedNodeAccess().getRule();
	}

	//NodeDescription vpdiagram::NodeDescription:
	//	{vpdiagram::NodeDescription} 'Representation' '{' condition=Condition? ('Label' '{' node_Label=Label ('position:'
	//	label_position=LabelPosition)? ('alignment:' label_alignement=LabelAlignment)? '}')? ('Style' '{'
	//	style=AbstractNodeStyle '}')? '}'
	public NodeDescriptionElements getNodeDescriptionAccess() {
		return pNodeDescription;
	}
	
	public ParserRule getNodeDescriptionRule() {
		return getNodeDescriptionAccess().getRule();
	}

	//ActionSet vpdiagram::ActionSet:
	//	{vpdiagram::ActionSet} 'Actions' '{' actions+=Action* openActions+=OpenAction* '}'
	public ActionSetElements getActionSetAccess() {
		return pActionSet;
	}
	
	public ParserRule getActionSetRule() {
		return getActionSetAccess().getRule();
	}

	//OpenAction vpdiagram::OpenAction:
	//	{vpdiagram::OpenAction} 'OpenAction' name=EString '{' ('precondition:' precondition=EString)? ('label:'
	//	label=STRING)? ('icon:' icon=STRING)? '}'
	public OpenActionElements getOpenActionAccess() {
		return pOpenAction;
	}
	
	public ParserRule getOpenActionRule() {
		return getOpenActionAccess().getRule();
	}

	//Action vpdiagram::Action:
	//	Create | Delete | Drop | ReconnectEdge
	public ActionElements getActionAccess() {
		return pAction;
	}
	
	public ParserRule getActionRule() {
		return getActionAccess().getRule();
	}

	//Create vpdiagram::Action:
	//	{vpdiagram::Create} 'Create' name=EString '{' ('precondition:' precondition=EString)? ('label:' label=STRING)?
	//	('action-for:' tool_For=[vpdiagram::DiagramElement|FQN]) onlyTheView?='only-view'? ('icon:' icon=STRING)? '}'
	public CreateElements getCreateAccess() {
		return pCreate;
	}
	
	public ParserRule getCreateRule() {
		return getCreateAccess().getRule();
	}

	//Delete vpdiagram::Action:
	//	{vpdiagram::Delete} 'Delete' name=EString '{' ('precondition:' precondition=EString)? ('label:' label=STRING)?
	//	('action-for:' tool_For=[vpdiagram::DiagramElement|FQN]) '}'
	public DeleteElements getDeleteAccess() {
		return pDelete;
	}
	
	public ParserRule getDeleteRule() {
		return getDeleteAccess().getRule();
	}

	//Drop vpdiagram::Action:
	//	{vpdiagram::Drop} 'Drop' name=EString '{' ('precondition:' precondition=EString)? ('label:' label=STRING)?
	//	('action-for:' tool_For=[vpdiagram::DiagramElement|FQN]) '}'
	public DropElements getDropAccess() {
		return pDrop;
	}
	
	public ParserRule getDropRule() {
		return getDropAccess().getRule();
	}

	//ReconnectEdge vpdiagram::Action:
	//	{vpdiagram::ReconnectEdge} 'ReconnectEdge' name=EString '{' ('precondition:' precondition=EString)? ('label:'
	//	label=STRING)? ('action-for:' tool_For=[vpdiagram::DiagramElement|FQN]) '}'
	public ReconnectEdgeElements getReconnectEdgeAccess() {
		return pReconnectEdge;
	}
	
	public ParserRule getReconnectEdgeRule() {
		return getReconnectEdgeAccess().getRule();
	}

	//DomainContainer vpdiagram::DomainContainer:
	//	{vpdiagram::DomainContainer} ('domain-context:' the_domain=AbstractClass)
	public DomainContainerElements getDomainContainerAccess() {
		return pDomainContainer;
	}
	
	public ParserRule getDomainContainerRule() {
		return getDomainContainerAccess().getRule();
	}

	//Edge vpdiagram::AbstractEdge:
	//	{vpdiagram::Edge} 'Edge' name=EString '{' ('association-context:' the_domain=EdgeDomainAssociation |
	//	'class-association-context:' the_domain=EdgeDomainElement) synchronizationMode=SynchronizationMode? ('source:'
	//	source+=[vpdiagram::DiagramElement|FQN] (',' source+=[vpdiagram::DiagramElement|FQN])*) ('target:'
	//	target+=[vpdiagram::DiagramElement|FQN] (',' target+=[vpdiagram::DiagramElement|FQN])*)
	//	e_description+=EdgeDescription* '}'
	public EdgeElements getEdgeAccess() {
		return pEdge;
	}
	
	public ParserRule getEdgeRule() {
		return getEdgeAccess().getRule();
	}

	//EdgeImport vpdiagram::AbstractEdge:
	//	{vpdiagram::EdgeImport} 'EdgeImport' name=EString '{' ('import:' imports=[siriusDiagramDescription::EdgeMapping|FQN])
	//	synchronizationMode=SynchronizationMode? e_description+=EdgeDescription* '}'
	public EdgeImportElements getEdgeImportAccess() {
		return pEdgeImport;
	}
	
	public ParserRule getEdgeImportRule() {
		return getEdgeImportAccess().getRule();
	}

	//EdgeDomainAssociation vpdiagram::EdgeDomainAssociation:
	//	{vpdiagram::EdgeDomainAssociation} ('query:' target_query=STRING | target_Locator=AbstractAssociation2)
	public EdgeDomainAssociationElements getEdgeDomainAssociationAccess() {
		return pEdgeDomainAssociation;
	}
	
	public ParserRule getEdgeDomainAssociationRule() {
		return getEdgeDomainAssociationAccess().getRule();
	}

	//EdgeDomainElement vpdiagram::EdgeDomainAssociation:
	//	{vpdiagram::EdgeDomainElement} the_Domain=AbstractClass ('target-query:' target_query=STRING | 'target-association:'
	//	target_Locator=AbstractAssociation2) ('source-query:' source_query=STRING | 'source-association:'
	//	source_Locator=AbstractAssociation2)
	public EdgeDomainElementElements getEdgeDomainElementAccess() {
		return pEdgeDomainElement;
	}
	
	public ParserRule getEdgeDomainElementRule() {
		return getEdgeDomainElementAccess().getRule();
	}

	/// **********************************************
	// * 				Style customization
	// ********************************************** /
	//Customizations styleCusto::Customizations:
	//	{styleCusto::Customizations} 'customizations' '{' (ownedCustomizationDescriptions+=StyleCustomizationDescriptions
	//	ownedCustomizationDescriptions+=StyleCustomizationDescriptions*)? (ownedCustomizationReuse+=StyleCustomizationReuse
	//	ownedCustomizationReuse+=StyleCustomizationReuse*)? '}'
	public CustomizationsElements getCustomizationsAccess() {
		return pCustomizations;
	}
	
	public ParserRule getCustomizationsRule() {
		return getCustomizationsAccess().getRule();
	}

	//StyleCustomizationDescriptions styleCusto::StyleCustomizationDescriptions:
	//	{styleCusto::StyleCustomizationDescriptions} 'customization' name=ID ('when' '('
	//	precondtionExpression=CustomizationExpression ')')? 'with' '{' (ownedCustomizations+=AbstractCustomization
	//	ownedCustomizations+=AbstractCustomization*)? '}'
	public StyleCustomizationDescriptionsElements getStyleCustomizationDescriptionsAccess() {
		return pStyleCustomizationDescriptions;
	}
	
	public ParserRule getStyleCustomizationDescriptionsRule() {
		return getStyleCustomizationDescriptionsAccess().getRule();
	}

	//AbstractCustomization styleCusto::AbstractCustomization:
	//	EdgeStyleCustomization | ColorCustomization | LabelCustomization | AbstractNodeStyleCustomization
	public AbstractCustomizationElements getAbstractCustomizationAccess() {
		return pAbstractCustomization;
	}
	
	public ParserRule getAbstractCustomizationRule() {
		return getAbstractCustomizationAccess().getRule();
	}

	//EdgeStyleCustomization styleCusto::EdgeStyleCustomization:
	//	{styleCusto::EdgeStyleCustomization} 'edge' ('(' (appliedOn+=[siriusDDStyle::EdgeStyleDescription|STRING] (','
	//	appliedOn+=[siriusDDStyle::EdgeStyleDescription|STRING])*) ')')? '{' ('over-all-edges' ':' applyonAll=EBoolean)?
	//	('source' ':' sourceArrow=EdgeArrows)? ('target' ':' targetArrow=EdgeArrows)? ('routing' ':'
	//	routingStyle=EdgeRouting)? ('folding' ':' foldingStyle=FoldingStyle)? ('center-source-mappings' ':'
	//	(centeredSourceMappings+=[siriusDiagramDescription::DiagramElementMapping|STRING] (','
	//	centeredSourceMappings+=[siriusDiagramDescription::DiagramElementMapping|STRING])*))? ('center-target-mappings' ':'
	//	(centeredTargetMappings+=[siriusDiagramDescription::DiagramElementMapping|STRING] (','
	//	centeredTargetMappings+=[siriusDiagramDescription::DiagramElementMapping|STRING])*))?
	//	('begin-label-style-description' ':' beginLabelStyleDescription=[siriusDDStyle::BeginLabelStyleDescription|STRING])?
	//	('center-label-style-description' ':'
	//	centerLabelStyleDescription=[siriusDDStyle::CenterLabelStyleDescription|STRING])? ('end-label-style-description' ':'
	//	endLabelStyleDescription=[siriusDDStyle::EndLabelStyleDescription|STRING])? ('line-style' ':' lineStyle=LineStyle)?
	//	('size' ':' sizeComputationExpression=CustomizationExpression)? ('end-centering' ':' endCentering=CenterStyle)? '}'
	public EdgeStyleCustomizationElements getEdgeStyleCustomizationAccess() {
		return pEdgeStyleCustomization;
	}
	
	public ParserRule getEdgeStyleCustomizationRule() {
		return getEdgeStyleCustomizationAccess().getRule();
	}

	//ColorCustomization styleCusto::ColorCustomization:
	//	{styleCusto::ColorCustomization} 'paint' colorUseCase=ColorUseCase ('(' (appliedOn+=[ecore::EObject|STRING] (','
	//	appliedOn+=[ecore::EObject|STRING])*) ')')? applyonAll?='over-all-colors'? ('with' color=SystemColors)
	public ColorCustomizationElements getColorCustomizationAccess() {
		return pColorCustomization;
	}
	
	public ParserRule getColorCustomizationRule() {
		return getColorCustomizationAccess().getRule();
	}

	//LabelCustomization styleCusto::LabelCustomization:
	//	{styleCusto::LabelCustomization} 'label' ('(' (appliedOn+=[siriusDStyle::BasicLabelStyleDescription|STRING] (','
	//	appliedOn+=[siriusDStyle::BasicLabelStyleDescription|STRING])*) ')')? '{' ('over-all-labels' ':'
	//	applyonAll=EBoolean)? ownedLabelAlignment=LabelAlignementCustomization? ('size' ':' size=EInt)? ('format' ':'
	//	format=FontFormat)? ('color' ':' color=SystemColors) ('icon' '{' 'show' ':' showIcon=EBoolean 'path' ':'
	//	iconPath=EString '}')? ('expression' ':' expression=CustomizationExpression)? '}'
	public LabelCustomizationElements getLabelCustomizationAccess() {
		return pLabelCustomization;
	}
	
	public ParserRule getLabelCustomizationRule() {
		return getLabelCustomizationAccess().getRule();
	}

	//LabelAlignementCustomization styleCusto::LabelAlignmentCustomization:
	//	{styleCusto::LabelAlignmentCustomization} 'alignment' ':' alignment=LabelAlignment
	public LabelAlignementCustomizationElements getLabelAlignementCustomizationAccess() {
		return pLabelAlignementCustomization;
	}
	
	public ParserRule getLabelAlignementCustomizationRule() {
		return getLabelAlignementCustomizationAccess().getRule();
	}

	//AbstractNodeStyleCustomization styleCusto::AbstractNodeStyleCustomization:
	//	ContainerStyleCustomization | NodeStyleCustomization
	public AbstractNodeStyleCustomizationElements getAbstractNodeStyleCustomizationAccess() {
		return pAbstractNodeStyleCustomization;
	}
	
	public ParserRule getAbstractNodeStyleCustomizationRule() {
		return getAbstractNodeStyleCustomizationAccess().getRule();
	}

	//ContainerStyleCustomization styleCusto::ContainerStyleCustomization:
	//	{styleCusto::ContainerStyleCustomization} 'container' ('('
	//	(appliedOn+=[siriusDDStyle::ContainerStyleDescription|STRING] (','
	//	appliedOn+=[siriusDDStyle::ContainerStyleDescription|STRING])*) ')')? '{' ('over-all-containers' ':'
	//	applyonAll=EBoolean)? ('width' ':' arcWith=EInt)? ('height' ':' arcHeight=EInt)? ('round-corner' ':'
	//	roundedCorner=EBoolean)? ('tooltip-expression' ':' tooltipExpression=CustomizationExpression)? ('border-dimension'
	//	':' borderSizeComputationExpression=CustomizationExpression)?
	//	ownedSpecificContainerStyleCustomization+=SpecificContainerStyleCustomization* '}'
	public ContainerStyleCustomizationElements getContainerStyleCustomizationAccess() {
		return pContainerStyleCustomization;
	}
	
	public ParserRule getContainerStyleCustomizationRule() {
		return getContainerStyleCustomizationAccess().getRule();
	}

	//SpecificContainerStyleCustomization styleCusto::SpecificContainerStyleCustomization:
	//	ContainerWorkspaceImageCustomization | FlatContainerStyleCustomization | ShapeContainerStyleCustomization
	public SpecificContainerStyleCustomizationElements getSpecificContainerStyleCustomizationAccess() {
		return pSpecificContainerStyleCustomization;
	}
	
	public ParserRule getSpecificContainerStyleCustomizationRule() {
		return getSpecificContainerStyleCustomizationAccess().getRule();
	}

	//ContainerWorkspaceImageCustomization styleCusto::ContainerWorkspaceImageCustomization:
	//	{styleCusto::ContainerWorkspaceImageCustomization} 'workspace' ':' workspacePath=EString
	public ContainerWorkspaceImageCustomizationElements getContainerWorkspaceImageCustomizationAccess() {
		return pContainerWorkspaceImageCustomization;
	}
	
	public ParserRule getContainerWorkspaceImageCustomizationRule() {
		return getContainerWorkspaceImageCustomizationAccess().getRule();
	}

	//FlatContainerStyleCustomization styleCusto::FlatContainerStyleCustomization:
	//	{styleCusto::FlatContainerStyleCustomization} 'background' ':' backgroundStyle=BackgroundStyle
	public FlatContainerStyleCustomizationElements getFlatContainerStyleCustomizationAccess() {
		return pFlatContainerStyleCustomization;
	}
	
	public ParserRule getFlatContainerStyleCustomizationRule() {
		return getFlatContainerStyleCustomizationAccess().getRule();
	}

	//ShapeContainerStyleCustomization styleCusto::ShapeContainerStyleCustomization:
	//	{styleCusto::ShapeContainerStyleCustomization} 'shape' ':' shape=ContainerShape
	public ShapeContainerStyleCustomizationElements getShapeContainerStyleCustomizationAccess() {
		return pShapeContainerStyleCustomization;
	}
	
	public ParserRule getShapeContainerStyleCustomizationRule() {
		return getShapeContainerStyleCustomizationAccess().getRule();
	}

	//NodeStyleCustomization styleCusto::NodeStyleCustomization:
	//	{styleCusto::NodeStyleCustomization} 'node' ('(' (appliedOn+=[siriusDDStyle::NodeStyleDescription|STRING] (','
	//	appliedOn+=[siriusDDStyle::NodeStyleDescription|STRING])*) ')')? '{' ('over-all-nodes' ':' applyonAll=EBoolean)?
	//	('label-position' ':' labelPosition=LabelPosition)? ('hide-label' ':' hideLabelByDefault=EBoolean)? ('resize-kind'
	//	':' resizeKind=ResizeKind)? ('tooltip-expression' ':' tooltipExpression=CustomizationExpression)? ('border-dimension'
	//	':' borderSizeComputationExpression=CustomizationExpression)? ('size-dimension' ':'
	//	sizeComputationExpression=CustomizationExpression)?
	//	ownedSpecificNodeStyleCustomization+=SpecificNodeStyleCustomization* '}'
	public NodeStyleCustomizationElements getNodeStyleCustomizationAccess() {
		return pNodeStyleCustomization;
	}
	
	public ParserRule getNodeStyleCustomizationRule() {
		return getNodeStyleCustomizationAccess().getRule();
	}

	//SpecificNodeStyleCustomization styleCusto::SpecificNodeStyleCustomization:
	//	BundledImageCustomization | LozengeCustomization | GaugeCustomization | EllipseCustomization |
	//	NodeWorkspaceImageCustomization | SquareCustomization | DotCustomization
	public SpecificNodeStyleCustomizationElements getSpecificNodeStyleCustomizationAccess() {
		return pSpecificNodeStyleCustomization;
	}
	
	public ParserRule getSpecificNodeStyleCustomizationRule() {
		return getSpecificNodeStyleCustomizationAccess().getRule();
	}

	//BundledImageCustomization styleCusto::BundledImageCustomization:
	//	{styleCusto::BundledImageCustomization} 'shape' ':' shape=BundledImageShape
	public BundledImageCustomizationElements getBundledImageCustomizationAccess() {
		return pBundledImageCustomization;
	}
	
	public ParserRule getBundledImageCustomizationRule() {
		return getBundledImageCustomizationAccess().getRule();
	}

	//LozengeCustomization styleCusto::LozengeCustomization:
	//	{styleCusto::LozengeCustomization} 'lozenge-dimension' ':' '{' 'width' ':'
	//	widthComputationExpression=CustomizationExpression 'height' ':' heightComputationExpression=CustomizationExpression
	//	'}'
	public LozengeCustomizationElements getLozengeCustomizationAccess() {
		return pLozengeCustomization;
	}
	
	public ParserRule getLozengeCustomizationRule() {
		return getLozengeCustomizationAccess().getRule();
	}

	//GaugeCustomization styleCusto::GaugeCustomization:
	//	{styleCusto::GaugeCustomization} 'gauge-alignment' ':' alignement=AlignmentKind
	public GaugeCustomizationElements getGaugeCustomizationAccess() {
		return pGaugeCustomization;
	}
	
	public ParserRule getGaugeCustomizationRule() {
		return getGaugeCustomizationAccess().getRule();
	}

	//EllipseCustomization styleCusto::EllipseCustomization:
	//	{styleCusto::EllipseCustomization} 'ellipse-dimension' ':' '{' 'horizontal' ':'
	//	horizontalDiameterComputationExpression=CustomizationExpression 'vertical' ':'
	//	verticalDiameterComputationExpression=CustomizationExpression '}'
	public EllipseCustomizationElements getEllipseCustomizationAccess() {
		return pEllipseCustomization;
	}
	
	public ParserRule getEllipseCustomizationRule() {
		return getEllipseCustomizationAccess().getRule();
	}

	//NodeWorkspaceImageCustomization styleCusto::NodeWorkspaceImageCustomization:
	//	{styleCusto::NodeWorkspaceImageCustomization} 'workspace' ':' workspacePath=EString
	public NodeWorkspaceImageCustomizationElements getNodeWorkspaceImageCustomizationAccess() {
		return pNodeWorkspaceImageCustomization;
	}
	
	public ParserRule getNodeWorkspaceImageCustomizationRule() {
		return getNodeWorkspaceImageCustomizationAccess().getRule();
	}

	//SquareCustomization styleCusto::SquareCustomization:
	//	{styleCusto::SquareCustomization} 'square-dimension' ':' '{' 'width' ':' width=EInt 'height' ':' height=EInt '}'
	public SquareCustomizationElements getSquareCustomizationAccess() {
		return pSquareCustomization;
	}
	
	public ParserRule getSquareCustomizationRule() {
		return getSquareCustomizationAccess().getRule();
	}

	//DotCustomization styleCusto::DotCustomization:
	//	{styleCusto::DotCustomization} 'stroke-dimension' ':' strokeSizeComputationExpression=CustomizationExpression
	public DotCustomizationElements getDotCustomizationAccess() {
		return pDotCustomization;
	}
	
	public ParserRule getDotCustomizationRule() {
		return getDotCustomizationAccess().getRule();
	}

	//StyleCustomizationReuse styleCusto::StyleCustomizationReuse:
	//	{styleCusto::StyleCustomizationReuse} 'reuse'
	//	(reusedCustomization+=[siriusDescription::EStructuralFeatureCustomization|STRING] (','
	//	reusedCustomization+=[siriusDescription::EStructuralFeatureCustomization|STRING])*) 'on'
	//	(appliedOn+=[ecore::EObject|STRING] (',' appliedOn+=[ecore::EObject|STRING])*)
	public StyleCustomizationReuseElements getStyleCustomizationReuseAccess() {
		return pStyleCustomizationReuse;
	}
	
	public ParserRule getStyleCustomizationReuseRule() {
		return getStyleCustomizationReuseAccess().getRule();
	}

	//CustomizationExpression styleCusto::CustomizationExpression:
	//	{styleCusto::CustomizationExpression} ownedExpressionElement=AbstractComputableElement
	public CustomizationExpressionElements getCustomizationExpressionAccess() {
		return pCustomizationExpression;
	}
	
	public ParserRule getCustomizationExpressionRule() {
		return getCustomizationExpressionAccess().getRule();
	}

	//enum AlignmentKind returns siriusDiagram::AlignmentKind:
	//	HORIZONTAL | SQUARE | VERTICAL;
	public AlignmentKindElements getAlignmentKindAccess() {
		return eAlignmentKind;
	}
	
	public EnumRule getAlignmentKindRule() {
		return getAlignmentKindAccess().getRule();
	}

	//enum BundledImageShape returns siriusDiagram::BundledImageShape:
	//	dot | ring | square | stroke | triangle;
	public BundledImageShapeElements getBundledImageShapeAccess() {
		return eBundledImageShape;
	}
	
	public EnumRule getBundledImageShapeRule() {
		return getBundledImageShapeAccess().getRule();
	}

	//enum ResizeKind returns siriusDiagram::ResizeKind:
	//	NONE | NSEW | EAST_WEST | NORTH_SOUTH;
	public ResizeKindElements getResizeKindAccess() {
		return eResizeKind;
	}
	
	public EnumRule getResizeKindRule() {
		return getResizeKindAccess().getRule();
	}

	//enum ContainerShape returns siriusDiagram::ContainerShape:
	//	parallelogram;
	public ContainerShapeElements getContainerShapeAccess() {
		return eContainerShape;
	}
	
	public EnumRule getContainerShapeRule() {
		return getContainerShapeAccess().getRule();
	}

	//enum FontFormat returns sirius::FontFormat:
	//	italic | bold | underline | strike_through;
	public FontFormatElements getFontFormatAccess() {
		return eFontFormat;
	}
	
	public EnumRule getFontFormatRule() {
		return getFontFormatAccess().getRule();
	}

	//enum CenterStyle returns siriusDiagramDescription::CenteringStyle:
	//	Both | None | Source | Target;
	public CenterStyleElements getCenterStyleAccess() {
		return eCenterStyle;
	}
	
	public EnumRule getCenterStyleRule() {
		return getCenterStyleAccess().getRule();
	}

	//enum FoldingStyle returns siriusDiagramDescription::FoldingStyle:
	//	NONE | SOURCE | TARGET;
	public FoldingStyleElements getFoldingStyleAccess() {
		return eFoldingStyle;
	}
	
	public EnumRule getFoldingStyleRule() {
		return getFoldingStyleAccess().getRule();
	}

	//enum EdgeRouting returns siriusDiagram::EdgeRouting:
	//	straight | manhattan | tree;
	public EdgeRoutingElements getEdgeRoutingAccess() {
		return eEdgeRouting;
	}
	
	public EnumRule getEdgeRoutingRule() {
		return getEdgeRoutingAccess().getRule();
	}

	//enum ColorUseCase returns styleCusto::ColorUseCase:
	//	Border | Color | Background | Foreground='foreground';
	public ColorUseCaseElements getColorUseCaseAccess() {
		return eColorUseCase;
	}
	
	public EnumRule getColorUseCaseRule() {
		return getColorUseCaseAccess().getRule();
	}

	//enum Node_Form returns vpdiagram::Node_Form:
	//	Square | Lozenge | Eclipse | Note | Dot | Triangle | Stroke | Ring;
	public Node_FormElements getNode_FormAccess() {
		return eNode_Form;
	}
	
	public EnumRule getNode_FormRule() {
		return getNode_FormAccess().getRule();
	}

	//enum BackgroundStyle returns siriusDiagram::BackgroundStyle:
	//	GradientLeftToRight | Liquid | GradientTopToBottom;
	public BackgroundStyleElements getBackgroundStyleAccess() {
		return eBackgroundStyle;
	}
	
	public EnumRule getBackgroundStyleRule() {
		return getBackgroundStyleAccess().getRule();
	}

	//enum LabelPosition returns siriusDiagram::LabelPosition:
	//	border | node;
	public LabelPositionElements getLabelPositionAccess() {
		return eLabelPosition;
	}
	
	public EnumRule getLabelPositionRule() {
		return getLabelPositionAccess().getRule();
	}

	//enum LabelAlignment returns sirius::LabelAlignment:
	//	CENTER='center' | LEFT='left' | RIGHT='right';
	public LabelAlignmentElements getLabelAlignmentAccess() {
		return eLabelAlignment;
	}
	
	public EnumRule getLabelAlignmentRule() {
		return getLabelAlignmentAccess().getRule();
	}

	//enum LineStyle returns siriusDiagram::LineStyle:
	//	solid | dash | dot | dash_dot;
	public LineStyleElements getLineStyleAccess() {
		return eLineStyle;
	}
	
	public EnumRule getLineStyleRule() {
		return getLineStyleAccess().getRule();
	}

	//enum EdgeArrows returns siriusDiagram::EdgeArrows:
	//	NoDecoration | OutputArrow | InputArrow | OutputClosedArrow | InputClosedArrow | OutputFillClosedArrow |
	//	InputFillClosedArrow | Diamond | FillDiamond | InputArrowWithDiamond |
	//	InputArrowWithFillDiamond='InputArrowWothFillDiamond';
	public EdgeArrowsElements getEdgeArrowsAccess() {
		return eEdgeArrows;
	}
	
	public EnumRule getEdgeArrowsRule() {
		return getEdgeArrowsAccess().getRule();
	}

	//enum SystemColors returns siriusDescription::SystemColors:
	//	black | blue | red | green | yellow | purple | orange | chocolate | gray | white | dark_blue | dark_red | dark_green
	//	| dark_yellow | dark_purple | dark_orange | dark_chocolate | dark_gray | light_blue | light_red | light_green |
	//	light_yellow | light_purple | light_orange | light_chocolate | light_gray;
	public SystemColorsElements getSystemColorsAccess() {
		return eSystemColors;
	}
	
	public EnumRule getSystemColorsRule() {
		return getSystemColorsAccess().getRule();
	}

	//enum ContainerLayout returns siriusDiagram::ContainerLayout:
	//	FreeForm | List | HorizontalStack | VerticalStack;
	public ContainerLayoutElements getContainerLayoutAccess() {
		return eContainerLayout;
	}
	
	public EnumRule getContainerLayoutRule() {
		return getContainerLayoutAccess().getRule();
	}

	//enum SynchronizationMode returns vpdiagram::SynchronizationMode:
	//	Synchronized="synchronized" | Unsynchronizable="unsynchronizable" | Not_Synchronized="not-synchronized";
	public SynchronizationModeElements getSynchronizationModeAccess() {
		return eSynchronizationMode;
	}
	
	public EnumRule getSynchronizationModeRule() {
		return getSynchronizationModeAccess().getRule();
	}

	/// ********************************************************************
	// * 							Common data
	// * 
	// ******************************************************************** /
	//AbstractClass commondata::AbstractClass:
	//	LocalClass2 | ExternalClass
	public AbstractClassElements getAbstractClassAccess() {
		return pAbstractClass;
	}
	
	public ParserRule getAbstractClassRule() {
		return getAbstractClassAccess().getRule();
	}

	//LocalClass2 commondata::AbstractClass:
	//	{commondata::LocalClass} class=[vpdesc::Class|FQN]
	public LocalClass2Elements getLocalClass2Access() {
		return pLocalClass2;
	}
	
	public ParserRule getLocalClass2Rule() {
		return getLocalClass2Access().getRule();
	}

	//ExternalClass commondata::AbstractClass:
	//	{commondata::ExternalClass} 'external' class=[ecore::EClass|FQN]
	public ExternalClassElements getExternalClassAccess() {
		return pExternalClass;
	}
	
	public ParserRule getExternalClassRule() {
		return getExternalClassAccess().getRule();
	}

	//AbstractAssociation2 commondata::AbstractAssociation:
	//	ExternalAssociation | LocalAssociation
	public AbstractAssociation2Elements getAbstractAssociation2Access() {
		return pAbstractAssociation2;
	}
	
	public ParserRule getAbstractAssociation2Rule() {
		return getAbstractAssociation2Access().getRule();
	}

	//LocalAssociation commondata::AbstractAssociation:
	//	{commondata::LocalAssociation} reference=[vpdesc::AbstractAssociation|FQN]
	public LocalAssociationElements getLocalAssociationAccess() {
		return pLocalAssociation;
	}
	
	public ParserRule getLocalAssociationRule() {
		return getLocalAssociationAccess().getRule();
	}

	//ExternalAssociation commondata::AbstractAssociation:
	//	{commondata::ExternalAssociation} 'external' reference=[ecore::EReference|FQN]
	public ExternalAssociationElements getExternalAssociationAccess() {
		return pExternalAssociation;
	}
	
	public ParserRule getExternalAssociationRule() {
		return getExternalAssociationAccess().getRule();
	}

	//AbstractAttribute commondata::AbstractAttribute:
	//	ExternalAttribute | LocalAttribute
	public AbstractAttributeElements getAbstractAttributeAccess() {
		return pAbstractAttribute;
	}
	
	public ParserRule getAbstractAttributeRule() {
		return getAbstractAttributeAccess().getRule();
	}

	//LocalAttribute commondata::AbstractAttribute:
	//	{commondata::LocalAttribute} attribute=[vpdesc::Attribute|FQN]
	public LocalAttributeElements getLocalAttributeAccess() {
		return pLocalAttribute;
	}
	
	public ParserRule getLocalAttributeRule() {
		return getLocalAttributeAccess().getRule();
	}

	//ExternalAttribute commondata::AbstractAttribute:
	//	{commondata::ExternalAttribute} 'external' attribute=[ecore::EAttribute|FQN]
	public ExternalAttributeElements getExternalAttributeAccess() {
		return pExternalAttribute;
	}
	
	public ParserRule getExternalAttributeRule() {
		return getExternalAttributeAccess().getRule();
	}

	/// ********************************************************************
	// * 							Expression
	// * 
	// ******************************************************************** /
	//Expression expression::Expression:
	//	{expression::Expression} (expressionElements+=ExpressionElement ('+' expressionElements+=ExpressionElement)*)?
	public ExpressionElements getExpressionAccess() {
		return pExpression;
	}
	
	public ParserRule getExpressionRule() {
		return getExpressionAccess().getRule();
	}

	//AbstractComputableElement expression::AbstractComputableElement:
	//	JavaElement | StringElement
	public AbstractComputableElementElements getAbstractComputableElementAccess() {
		return pAbstractComputableElement;
	}
	
	public ParserRule getAbstractComputableElementRule() {
		return getAbstractComputableElementAccess().getRule();
	}

	//ExpressionElement expression::ExpressionElement:
	//	ForeignExpressionElement | StringElement
	public ExpressionElementElements getExpressionElementAccess() {
		return pExpressionElement;
	}
	
	public ParserRule getExpressionElementRule() {
		return getExpressionElementAccess().getRule();
	}

	//ForeignExpressionElement expression::ForeignExpressionElement:
	//	JavaElement | DomainElement
	public ForeignExpressionElementElements getForeignExpressionElementAccess() {
		return pForeignExpressionElement;
	}
	
	public ParserRule getForeignExpressionElementRule() {
		return getForeignExpressionElementAccess().getRule();
	}

	//JavaElement expression::JavaElement:
	//	{expression::JavaElement} 'Java' method=FQN
	public JavaElementElements getJavaElementAccess() {
		return pJavaElement;
	}
	
	public ParserRule getJavaElementRule() {
		return getJavaElementAccess().getRule();
	}

	//DomainElement expression::ForeignExpressionElement:
	//	{expression::DomainElement} attribute=[vpdesc::Attribute|FQN]
	public DomainElementElements getDomainElementAccess() {
		return pDomainElement;
	}
	
	public ParserRule getDomainElementRule() {
		return getDomainElementAccess().getRule();
	}

	//StringElement expression::StringElement:
	//	{expression::StringElement} value=STRING
	public StringElementElements getStringElementAccess() {
		return pStringElement;
	}
	
	public ParserRule getStringElementRule() {
		return getStringElementAccess().getRule();
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

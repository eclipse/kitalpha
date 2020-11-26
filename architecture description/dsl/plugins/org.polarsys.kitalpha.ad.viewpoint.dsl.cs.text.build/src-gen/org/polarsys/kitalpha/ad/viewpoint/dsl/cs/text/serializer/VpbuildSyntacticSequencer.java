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
package org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.serializer;

import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.GroupAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;
import org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.VpbuildGrammarAccess;

import com.google.inject.Inject;

@SuppressWarnings("all")
public class VpbuildSyntacticSequencer extends AbstractSyntacticSequencer {

	protected VpbuildGrammarAccess grammarAccess;
	protected AbstractElementAlias match_HudsonDeployment___TriggersKeyword_11_0_LeftCurlyBracketKeyword_11_1_RightCurlyBracketKeyword_11_3__q;
	protected AbstractElementAlias match_HudsonDeployment___UsersKeyword_10_0_LeftCurlyBracketKeyword_10_1_RightCurlyBracketKeyword_10_3__q;
	protected AbstractElementAlias match_Repository___LeftCurlyBracketKeyword_4_0_RightCurlyBracketKeyword_4_2__q;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (VpbuildGrammarAccess) access;
		match_HudsonDeployment___TriggersKeyword_11_0_LeftCurlyBracketKeyword_11_1_RightCurlyBracketKeyword_11_3__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getHudsonDeploymentAccess().getTriggersKeyword_11_0()), new TokenAlias(false, false, grammarAccess.getHudsonDeploymentAccess().getLeftCurlyBracketKeyword_11_1()), new TokenAlias(false, false, grammarAccess.getHudsonDeploymentAccess().getRightCurlyBracketKeyword_11_3()));
		match_HudsonDeployment___UsersKeyword_10_0_LeftCurlyBracketKeyword_10_1_RightCurlyBracketKeyword_10_3__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getHudsonDeploymentAccess().getUsersKeyword_10_0()), new TokenAlias(false, false, grammarAccess.getHudsonDeploymentAccess().getLeftCurlyBracketKeyword_10_1()), new TokenAlias(false, false, grammarAccess.getHudsonDeploymentAccess().getRightCurlyBracketKeyword_10_3()));
		match_Repository___LeftCurlyBracketKeyword_4_0_RightCurlyBracketKeyword_4_2__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getRepositoryAccess().getLeftCurlyBracketKeyword_4_0()), new TokenAlias(false, false, grammarAccess.getRepositoryAccess().getRightCurlyBracketKeyword_4_2()));
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		return "";
	}
	
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			if(match_HudsonDeployment___TriggersKeyword_11_0_LeftCurlyBracketKeyword_11_1_RightCurlyBracketKeyword_11_3__q.equals(syntax))
				emit_HudsonDeployment___TriggersKeyword_11_0_LeftCurlyBracketKeyword_11_1_RightCurlyBracketKeyword_11_3__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_HudsonDeployment___UsersKeyword_10_0_LeftCurlyBracketKeyword_10_1_RightCurlyBracketKeyword_10_3__q.equals(syntax))
				emit_HudsonDeployment___UsersKeyword_10_0_LeftCurlyBracketKeyword_10_1_RightCurlyBracketKeyword_10_3__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Repository___LeftCurlyBracketKeyword_4_0_RightCurlyBracketKeyword_4_2__q.equals(syntax))
				emit_Repository___LeftCurlyBracketKeyword_4_0_RightCurlyBracketKeyword_4_2__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Ambiguous syntax:
	 *     ('triggers' '{' '}')?
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) 'hudson-deployment' '{' ('users' '{' '}')? (ambiguity) '}' (rule start)
	 *     (rule start) 'hudson-deployment' '{' ('users' '{' '}')? (ambiguity) generationLocation=GenerationLocation
	 *     antName=STRING ('users' '{' '}')? (ambiguity) '}' (rule end)
	 *     antName=STRING ('users' '{' '}')? (ambiguity) generationLocation=GenerationLocation
	 *     assignedNode=STRING ('users' '{' '}')? (ambiguity) '}' (rule end)
	 *     assignedNode=STRING ('users' '{' '}')? (ambiguity) generationLocation=GenerationLocation
	 *     build_id=STRING ('users' '{' '}')? (ambiguity) '}' (rule end)
	 *     build_id=STRING ('users' '{' '}')? (ambiguity) generationLocation=GenerationLocation
	 *     enabled=EBoolean ('users' '{' '}')? (ambiguity) '}' (rule end)
	 *     enabled=EBoolean ('users' '{' '}')? (ambiguity) generationLocation=GenerationLocation
	 *     jdkName=STRING ('users' '{' '}')? (ambiguity) '}' (rule end)
	 *     jdkName=STRING ('users' '{' '}')? (ambiguity) generationLocation=GenerationLocation
	 *     userDeployJobName=STRING ('users' '{' '}')? (ambiguity) '}' (rule end)
	 *     userDeployJobName=STRING ('users' '{' '}')? (ambiguity) generationLocation=GenerationLocation
	 *     userDeployServerUrl=STRING ('users' '{' '}')? (ambiguity) '}' (rule end)
	 *     userDeployServerUrl=STRING ('users' '{' '}')? (ambiguity) generationLocation=GenerationLocation
	 *     users+=User '}' (ambiguity) '}' (rule end)
	 *     users+=User '}' (ambiguity) generationLocation=GenerationLocation
	 */
	protected void emit_HudsonDeployment___TriggersKeyword_11_0_LeftCurlyBracketKeyword_11_1_RightCurlyBracketKeyword_11_3__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ('users' '{' '}')?
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) 'hudson-deployment' '{' (ambiguity) 'triggers' '{' triggers+=Trigger
	 *     (rule start) 'hudson-deployment' '{' (ambiguity) ('triggers' '{' '}')? '}' (rule start)
	 *     (rule start) 'hudson-deployment' '{' (ambiguity) ('triggers' '{' '}')? generationLocation=GenerationLocation
	 *     antName=STRING (ambiguity) 'triggers' '{' triggers+=Trigger
	 *     antName=STRING (ambiguity) ('triggers' '{' '}')? '}' (rule end)
	 *     antName=STRING (ambiguity) ('triggers' '{' '}')? generationLocation=GenerationLocation
	 *     assignedNode=STRING (ambiguity) 'triggers' '{' triggers+=Trigger
	 *     assignedNode=STRING (ambiguity) ('triggers' '{' '}')? '}' (rule end)
	 *     assignedNode=STRING (ambiguity) ('triggers' '{' '}')? generationLocation=GenerationLocation
	 *     build_id=STRING (ambiguity) 'triggers' '{' triggers+=Trigger
	 *     build_id=STRING (ambiguity) ('triggers' '{' '}')? '}' (rule end)
	 *     build_id=STRING (ambiguity) ('triggers' '{' '}')? generationLocation=GenerationLocation
	 *     enabled=EBoolean (ambiguity) 'triggers' '{' triggers+=Trigger
	 *     enabled=EBoolean (ambiguity) ('triggers' '{' '}')? '}' (rule end)
	 *     enabled=EBoolean (ambiguity) ('triggers' '{' '}')? generationLocation=GenerationLocation
	 *     jdkName=STRING (ambiguity) 'triggers' '{' triggers+=Trigger
	 *     jdkName=STRING (ambiguity) ('triggers' '{' '}')? '}' (rule end)
	 *     jdkName=STRING (ambiguity) ('triggers' '{' '}')? generationLocation=GenerationLocation
	 *     userDeployJobName=STRING (ambiguity) 'triggers' '{' triggers+=Trigger
	 *     userDeployJobName=STRING (ambiguity) ('triggers' '{' '}')? '}' (rule end)
	 *     userDeployJobName=STRING (ambiguity) ('triggers' '{' '}')? generationLocation=GenerationLocation
	 *     userDeployServerUrl=STRING (ambiguity) 'triggers' '{' triggers+=Trigger
	 *     userDeployServerUrl=STRING (ambiguity) ('triggers' '{' '}')? '}' (rule end)
	 *     userDeployServerUrl=STRING (ambiguity) ('triggers' '{' '}')? generationLocation=GenerationLocation
	 */
	protected void emit_HudsonDeployment___UsersKeyword_10_0_LeftCurlyBracketKeyword_10_1_RightCurlyBracketKeyword_10_3__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ('{' '}')?
	 *
	 * This ambiguous syntax occurs at:
	 *     location=STRING (ambiguity) 'features:' (rule end)
	 *     location=STRING (ambiguity) 'features:' features+=Feature
	 */
	protected void emit_Repository___LeftCurlyBracketKeyword_4_0_RightCurlyBracketKeyword_4_2__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}

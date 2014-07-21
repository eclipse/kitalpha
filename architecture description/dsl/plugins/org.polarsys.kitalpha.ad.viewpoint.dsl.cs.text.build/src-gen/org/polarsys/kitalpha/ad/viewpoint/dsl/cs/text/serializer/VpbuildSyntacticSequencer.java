package org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.serializer;

import com.google.inject.Inject;
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
	 * Syntax:
	 *     ('triggers' '{' '}')?
	 */
	protected void emit_HudsonDeployment___TriggersKeyword_11_0_LeftCurlyBracketKeyword_11_1_RightCurlyBracketKeyword_11_3__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('users' '{' '}')?
	 */
	protected void emit_HudsonDeployment___UsersKeyword_10_0_LeftCurlyBracketKeyword_10_1_RightCurlyBracketKeyword_10_3__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('{' '}')?
	 */
	protected void emit_Repository___LeftCurlyBracketKeyword_4_0_RightCurlyBracketKeyword_4_2__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}

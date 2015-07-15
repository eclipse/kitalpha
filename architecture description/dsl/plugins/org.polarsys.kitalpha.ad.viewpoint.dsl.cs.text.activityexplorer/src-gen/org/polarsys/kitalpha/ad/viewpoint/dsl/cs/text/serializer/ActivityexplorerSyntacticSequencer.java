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
import org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ActivityexplorerGrammarAccess;

@SuppressWarnings("all")
public class ActivityexplorerSyntacticSequencer extends AbstractSyntacticSequencer {

	protected ActivityexplorerGrammarAccess grammarAccess;
	protected AbstractElementAlias match_Page___HeaderKeyword_9_0_LeftCurlyBracketKeyword_9_1_RightCurlyBracketKeyword_9_4__q;
	protected AbstractElementAlias match_ViewpointActivityExplorer_RightCurlyBracketKeyword_2_1_a;
	protected AbstractElementAlias match_ViewpointActivityExplorer_RightCurlyBracketKeyword_2_1_p;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (ActivityexplorerGrammarAccess) access;
		match_Page___HeaderKeyword_9_0_LeftCurlyBracketKeyword_9_1_RightCurlyBracketKeyword_9_4__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getPageAccess().getHeaderKeyword_9_0()), new TokenAlias(false, false, grammarAccess.getPageAccess().getLeftCurlyBracketKeyword_9_1()), new TokenAlias(false, false, grammarAccess.getPageAccess().getRightCurlyBracketKeyword_9_4()));
		match_ViewpointActivityExplorer_RightCurlyBracketKeyword_2_1_a = new TokenAlias(true, true, grammarAccess.getViewpointActivityExplorerAccess().getRightCurlyBracketKeyword_2_1());
		match_ViewpointActivityExplorer_RightCurlyBracketKeyword_2_1_p = new TokenAlias(true, false, grammarAccess.getViewpointActivityExplorerAccess().getRightCurlyBracketKeyword_2_1());
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
			if(match_Page___HeaderKeyword_9_0_LeftCurlyBracketKeyword_9_1_RightCurlyBracketKeyword_9_4__q.equals(syntax))
				emit_Page___HeaderKeyword_9_0_LeftCurlyBracketKeyword_9_1_RightCurlyBracketKeyword_9_4__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_ViewpointActivityExplorer_RightCurlyBracketKeyword_2_1_a.equals(syntax))
				emit_ViewpointActivityExplorer_RightCurlyBracketKeyword_2_1_a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_ViewpointActivityExplorer_RightCurlyBracketKeyword_2_1_p.equals(syntax))
				emit_ViewpointActivityExplorer_RightCurlyBracketKeyword_2_1_p(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Syntax:
	 *     ('header' '{' '}')?
	 */
	protected void emit_Page___HeaderKeyword_9_0_LeftCurlyBracketKeyword_9_1_RightCurlyBracketKeyword_9_4__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     '}'*
	 */
	protected void emit_ViewpointActivityExplorer_RightCurlyBracketKeyword_2_1_a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     '}'+
	 */
	protected void emit_ViewpointActivityExplorer_RightCurlyBracketKeyword_2_1_p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}

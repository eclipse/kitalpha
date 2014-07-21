package org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.serializer;

import com.google.inject.Inject;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;
import org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.VpdiagramGrammarAccess;

@SuppressWarnings("all")
public class VpdiagramSyntacticSequencer extends AbstractSyntacticSequencer {

	protected VpdiagramGrammarAccess grammarAccess;
	protected AbstractElementAlias match_Label_PoliceKeyword_2_0_q;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (VpdiagramGrammarAccess) access;
		match_Label_PoliceKeyword_2_0_q = new TokenAlias(false, true, grammarAccess.getLabelAccess().getPoliceKeyword_2_0());
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
			if(match_Label_PoliceKeyword_2_0_q.equals(syntax))
				emit_Label_PoliceKeyword_2_0_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Syntax:
	 *     'police:'?
	 */
	protected void emit_Label_PoliceKeyword_2_0_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}

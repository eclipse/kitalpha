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
import org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.DataGrammarAccess;

@SuppressWarnings("all")
public class DataSyntacticSequencer extends AbstractSyntacticSequencer {

	protected DataGrammarAccess grammarAccess;
	protected AbstractElementAlias match_Attribute___ValuesKeyword_6_0_LeftParenthesisKeyword_6_1_RightParenthesisKeyword_6_3__q;
	protected AbstractElementAlias match_Class_AssociationsKeyword_11_0_q;
	protected AbstractElementAlias match_Class_AttributesKeyword_10_0_q;
	protected AbstractElementAlias match_Class_OperationsKeyword_12_0_q;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (DataGrammarAccess) access;
		match_Attribute___ValuesKeyword_6_0_LeftParenthesisKeyword_6_1_RightParenthesisKeyword_6_3__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getAttributeAccess().getValuesKeyword_6_0()), new TokenAlias(false, false, grammarAccess.getAttributeAccess().getLeftParenthesisKeyword_6_1()), new TokenAlias(false, false, grammarAccess.getAttributeAccess().getRightParenthesisKeyword_6_3()));
		match_Class_AssociationsKeyword_11_0_q = new TokenAlias(false, true, grammarAccess.getClassAccess().getAssociationsKeyword_11_0());
		match_Class_AttributesKeyword_10_0_q = new TokenAlias(false, true, grammarAccess.getClassAccess().getAttributesKeyword_10_0());
		match_Class_OperationsKeyword_12_0_q = new TokenAlias(false, true, grammarAccess.getClassAccess().getOperationsKeyword_12_0());
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
			if(match_Attribute___ValuesKeyword_6_0_LeftParenthesisKeyword_6_1_RightParenthesisKeyword_6_3__q.equals(syntax))
				emit_Attribute___ValuesKeyword_6_0_LeftParenthesisKeyword_6_1_RightParenthesisKeyword_6_3__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Class_AssociationsKeyword_11_0_q.equals(syntax))
				emit_Class_AssociationsKeyword_11_0_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Class_AttributesKeyword_10_0_q.equals(syntax))
				emit_Class_AttributesKeyword_10_0_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Class_OperationsKeyword_12_0_q.equals(syntax))
				emit_Class_OperationsKeyword_12_0_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Syntax:
	 *     ('values' '(' ')')?
	 */
	protected void emit_Attribute___ValuesKeyword_6_0_LeftParenthesisKeyword_6_1_RightParenthesisKeyword_6_3__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'Associations:'?
	 */
	protected void emit_Class_AssociationsKeyword_11_0_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'Attributes:'?
	 */
	protected void emit_Class_AttributesKeyword_10_0_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'Operations:'?
	 */
	protected void emit_Class_OperationsKeyword_12_0_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}

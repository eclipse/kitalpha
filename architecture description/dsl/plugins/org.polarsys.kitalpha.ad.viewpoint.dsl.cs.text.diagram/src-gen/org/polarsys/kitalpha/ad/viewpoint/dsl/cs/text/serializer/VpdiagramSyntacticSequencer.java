/*******************************************************************************
 * Copyright (c) 2017 Thales Global Services S.A.S.
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
import org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.VpdiagramGrammarAccess;

@SuppressWarnings("all")
public class VpdiagramSyntacticSequencer extends AbstractSyntacticSequencer {

	protected VpdiagramGrammarAccess grammarAccess;
	protected AbstractElementAlias match_Label_PoliceKeyword_2_0_q;
	protected AbstractElementAlias match_MappingBased___MappingsKeyword_9_0_0_ColonKeyword_9_0_1__q;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (VpdiagramGrammarAccess) access;
		match_Label_PoliceKeyword_2_0_q = new TokenAlias(false, true, grammarAccess.getLabelAccess().getPoliceKeyword_2_0());
		match_MappingBased___MappingsKeyword_9_0_0_ColonKeyword_9_0_1__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getMappingBasedAccess().getMappingsKeyword_9_0_0()), new TokenAlias(false, false, grammarAccess.getMappingBasedAccess().getColonKeyword_9_0_1()));
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
			if (match_Label_PoliceKeyword_2_0_q.equals(syntax))
				emit_Label_PoliceKeyword_2_0_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_MappingBased___MappingsKeyword_9_0_0_ColonKeyword_9_0_1__q.equals(syntax))
				emit_MappingBased___MappingsKeyword_9_0_0_ColonKeyword_9_0_1__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Ambiguous syntax:
	 *     'police:'?
	 *
	 * This ambiguous syntax occurs at:
	 *     value=Expression (ambiguity) (rule end)
	 */
	protected void emit_Label_PoliceKeyword_2_0_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ('mappings' ':')?
	 *
	 * This ambiguous syntax occurs at:
	 *     direction=DecorationDistributionDirection (ambiguity) '}' (rule end)
	 *     icon=STRING (ambiguity) '}' (rule end)
	 *     name=EString '{' (ambiguity) '}' (rule end)
	 *     position=Position (ambiguity) '}' (rule end)
	 *     precondition=ExpressionElement (ambiguity) '}' (rule end)
	 *     tooltip=ExpressionElement (ambiguity) '}' (rule end)
	 */
	protected void emit_MappingBased___MappingsKeyword_9_0_0_ColonKeyword_9_0_1__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}

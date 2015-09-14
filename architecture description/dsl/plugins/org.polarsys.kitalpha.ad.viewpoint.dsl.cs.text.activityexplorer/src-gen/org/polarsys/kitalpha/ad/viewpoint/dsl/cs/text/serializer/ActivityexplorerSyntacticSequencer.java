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
	protected AbstractElementAlias match_Page___HeaderKeyword_11_0_LeftCurlyBracketKeyword_11_1_RightCurlyBracketKeyword_11_4__q;
	protected AbstractElementAlias match_Page___SectionsKeyword_15_0_LeftCurlyBracketKeyword_15_1_RightCurlyBracketKeyword_15_3__q;
	protected AbstractElementAlias match_Section___ActivitiesKeyword_11_0_LeftCurlyBracketKeyword_11_1_RightCurlyBracketKeyword_11_3__q;
	protected AbstractElementAlias match_ViewpointActivityExplorer___PagesKeyword_5_0_LeftCurlyBracketKeyword_5_1_RightCurlyBracketKeyword_5_3__q;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (ActivityexplorerGrammarAccess) access;
		match_Page___HeaderKeyword_11_0_LeftCurlyBracketKeyword_11_1_RightCurlyBracketKeyword_11_4__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getPageAccess().getHeaderKeyword_11_0()), new TokenAlias(false, false, grammarAccess.getPageAccess().getLeftCurlyBracketKeyword_11_1()), new TokenAlias(false, false, grammarAccess.getPageAccess().getRightCurlyBracketKeyword_11_4()));
		match_Page___SectionsKeyword_15_0_LeftCurlyBracketKeyword_15_1_RightCurlyBracketKeyword_15_3__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getPageAccess().getSectionsKeyword_15_0()), new TokenAlias(false, false, grammarAccess.getPageAccess().getLeftCurlyBracketKeyword_15_1()), new TokenAlias(false, false, grammarAccess.getPageAccess().getRightCurlyBracketKeyword_15_3()));
		match_Section___ActivitiesKeyword_11_0_LeftCurlyBracketKeyword_11_1_RightCurlyBracketKeyword_11_3__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getSectionAccess().getActivitiesKeyword_11_0()), new TokenAlias(false, false, grammarAccess.getSectionAccess().getLeftCurlyBracketKeyword_11_1()), new TokenAlias(false, false, grammarAccess.getSectionAccess().getRightCurlyBracketKeyword_11_3()));
		match_ViewpointActivityExplorer___PagesKeyword_5_0_LeftCurlyBracketKeyword_5_1_RightCurlyBracketKeyword_5_3__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getViewpointActivityExplorerAccess().getPagesKeyword_5_0()), new TokenAlias(false, false, grammarAccess.getViewpointActivityExplorerAccess().getLeftCurlyBracketKeyword_5_1()), new TokenAlias(false, false, grammarAccess.getViewpointActivityExplorerAccess().getRightCurlyBracketKeyword_5_3()));
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
			if(match_Page___HeaderKeyword_11_0_LeftCurlyBracketKeyword_11_1_RightCurlyBracketKeyword_11_4__q.equals(syntax))
				emit_Page___HeaderKeyword_11_0_LeftCurlyBracketKeyword_11_1_RightCurlyBracketKeyword_11_4__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Page___SectionsKeyword_15_0_LeftCurlyBracketKeyword_15_1_RightCurlyBracketKeyword_15_3__q.equals(syntax))
				emit_Page___SectionsKeyword_15_0_LeftCurlyBracketKeyword_15_1_RightCurlyBracketKeyword_15_3__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Section___ActivitiesKeyword_11_0_LeftCurlyBracketKeyword_11_1_RightCurlyBracketKeyword_11_3__q.equals(syntax))
				emit_Section___ActivitiesKeyword_11_0_LeftCurlyBracketKeyword_11_1_RightCurlyBracketKeyword_11_3__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_ViewpointActivityExplorer___PagesKeyword_5_0_LeftCurlyBracketKeyword_5_1_RightCurlyBracketKeyword_5_3__q.equals(syntax))
				emit_ViewpointActivityExplorer___PagesKeyword_5_0_LeftCurlyBracketKeyword_5_1_RightCurlyBracketKeyword_5_3__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Syntax:
	 *     ('header' '{' '}')?
	 */
	protected void emit_Page___HeaderKeyword_11_0_LeftCurlyBracketKeyword_11_1_RightCurlyBracketKeyword_11_4__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('sections' '{' '}')?
	 */
	protected void emit_Page___SectionsKeyword_15_0_LeftCurlyBracketKeyword_15_1_RightCurlyBracketKeyword_15_3__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('activities' '{' '}')?
	 */
	protected void emit_Section___ActivitiesKeyword_11_0_LeftCurlyBracketKeyword_11_1_RightCurlyBracketKeyword_11_3__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('pages' '{' '}')?
	 */
	protected void emit_ViewpointActivityExplorer___PagesKeyword_5_0_LeftCurlyBracketKeyword_5_1_RightCurlyBracketKeyword_5_3__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}

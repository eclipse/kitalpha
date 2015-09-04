/*******************************************************************************
 * Copyright (c) 2015 Thales Global Services S.A.S.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
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
	 * Ambiguous syntax:
	 *     ('values' '(' ')')?
	 *
	 * This ambiguous syntax occurs at:
	 *     cardinality=Cardinalities (ambiguity) (rule end)
	 *     cardinality=Cardinalities (ambiguity) owned_annotations+=Annotation
	 *     changeable=EBoolean (ambiguity) (rule end)
	 *     changeable=EBoolean (ambiguity) owned_annotations+=Annotation
	 *     derived=EBoolean (ambiguity) (rule end)
	 *     derived=EBoolean (ambiguity) owned_annotations+=Annotation
	 *     isId=EBoolean (ambiguity) (rule end)
	 *     isId=EBoolean (ambiguity) owned_annotations+=Annotation
	 *     ordered=EBoolean (ambiguity) (rule end)
	 *     ordered=EBoolean (ambiguity) owned_annotations+=Annotation
	 *     owned_type=AbstractAttributeType (ambiguity) (rule end)
	 *     owned_type=AbstractAttributeType (ambiguity) owned_annotations+=Annotation
	 *     transient=EBoolean (ambiguity) (rule end)
	 *     transient=EBoolean (ambiguity) owned_annotations+=Annotation
	 *     unique=EBoolean (ambiguity) (rule end)
	 *     unique=EBoolean (ambiguity) owned_annotations+=Annotation
	 *     unsettable=EBoolean (ambiguity) (rule end)
	 *     unsettable=EBoolean (ambiguity) owned_annotations+=Annotation
	 *     volatile=EBoolean (ambiguity) (rule end)
	 *     volatile=EBoolean (ambiguity) owned_annotations+=Annotation
	 */
	protected void emit_Attribute___ValuesKeyword_6_0_LeftParenthesisKeyword_6_1_RightParenthesisKeyword_6_3__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     'Associations:'?
	 *
	 * This ambiguous syntax occurs at:
	 *     Inheritences+=AbstractSuperClass 'Attributes:'? (ambiguity) 'Operations:' VP_Class_Operations+=Operation
	 *     Inheritences+=AbstractSuperClass 'Attributes:'? (ambiguity) 'Operations:'? '}' (rule end)
	 *     VP_Class_Attributes+=Attribute (ambiguity) 'Operations:' VP_Class_Operations+=Operation
	 *     VP_Class_Attributes+=Attribute (ambiguity) 'Operations:'? '}' (rule end)
	 *     abstract=EBoolean 'Attributes:'? (ambiguity) 'Operations:' VP_Class_Operations+=Operation
	 *     abstract=EBoolean 'Attributes:'? (ambiguity) 'Operations:'? '}' (rule end)
	 *     description=EString 'Attributes:'? (ambiguity) 'Operations:' VP_Class_Operations+=Operation
	 *     description=EString 'Attributes:'? (ambiguity) 'Operations:'? '}' (rule end)
	 *     extends+=[EClass|FQN] 'Attributes:'? (ambiguity) 'Operations:' VP_Class_Operations+=Operation
	 *     extends+=[EClass|FQN] 'Attributes:'? (ambiguity) 'Operations:'? '}' (rule end)
	 *     icon=STRING 'Attributes:'? (ambiguity) 'Operations:' VP_Class_Operations+=Operation
	 *     icon=STRING 'Attributes:'? (ambiguity) 'Operations:'? '}' (rule end)
	 *     name=EString '{' 'Attributes:'? (ambiguity) 'Operations:' VP_Class_Operations+=Operation
	 *     name=EString '{' 'Attributes:'? (ambiguity) 'Operations:'? '}' (rule end)
	 *     owned_annotations+=Annotation 'Attributes:'? (ambiguity) 'Operations:' VP_Class_Operations+=Operation
	 *     owned_annotations+=Annotation 'Attributes:'? (ambiguity) 'Operations:'? '}' (rule end)
	 */
	protected void emit_Class_AssociationsKeyword_11_0_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     'Attributes:'?
	 *
	 * This ambiguous syntax occurs at:
	 *     Inheritences+=AbstractSuperClass (ambiguity) 'Associations:' VP_Classes_Associations+=AbstractAssociation
	 *     Inheritences+=AbstractSuperClass (ambiguity) 'Associations:'? 'Operations:' VP_Class_Operations+=Operation
	 *     Inheritences+=AbstractSuperClass (ambiguity) 'Associations:'? 'Operations:'? '}' (rule end)
	 *     abstract=EBoolean (ambiguity) 'Associations:' VP_Classes_Associations+=AbstractAssociation
	 *     abstract=EBoolean (ambiguity) 'Associations:'? 'Operations:' VP_Class_Operations+=Operation
	 *     abstract=EBoolean (ambiguity) 'Associations:'? 'Operations:'? '}' (rule end)
	 *     description=EString (ambiguity) 'Associations:' VP_Classes_Associations+=AbstractAssociation
	 *     description=EString (ambiguity) 'Associations:'? 'Operations:' VP_Class_Operations+=Operation
	 *     description=EString (ambiguity) 'Associations:'? 'Operations:'? '}' (rule end)
	 *     extends+=[EClass|FQN] (ambiguity) 'Associations:' VP_Classes_Associations+=AbstractAssociation
	 *     extends+=[EClass|FQN] (ambiguity) 'Associations:'? 'Operations:' VP_Class_Operations+=Operation
	 *     extends+=[EClass|FQN] (ambiguity) 'Associations:'? 'Operations:'? '}' (rule end)
	 *     icon=STRING (ambiguity) 'Associations:' VP_Classes_Associations+=AbstractAssociation
	 *     icon=STRING (ambiguity) 'Associations:'? 'Operations:' VP_Class_Operations+=Operation
	 *     icon=STRING (ambiguity) 'Associations:'? 'Operations:'? '}' (rule end)
	 *     name=EString '{' (ambiguity) 'Associations:' VP_Classes_Associations+=AbstractAssociation
	 *     name=EString '{' (ambiguity) 'Associations:'? 'Operations:' VP_Class_Operations+=Operation
	 *     name=EString '{' (ambiguity) 'Associations:'? 'Operations:'? '}' (rule end)
	 *     owned_annotations+=Annotation (ambiguity) 'Associations:' VP_Classes_Associations+=AbstractAssociation
	 *     owned_annotations+=Annotation (ambiguity) 'Associations:'? 'Operations:' VP_Class_Operations+=Operation
	 *     owned_annotations+=Annotation (ambiguity) 'Associations:'? 'Operations:'? '}' (rule end)
	 */
	protected void emit_Class_AttributesKeyword_10_0_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     'Operations:'?
	 *
	 * This ambiguous syntax occurs at:
	 *     Inheritences+=AbstractSuperClass 'Attributes:'? 'Associations:'? (ambiguity) '}' (rule end)
	 *     VP_Class_Attributes+=Attribute 'Associations:'? (ambiguity) '}' (rule end)
	 *     VP_Classes_Associations+=AbstractAssociation (ambiguity) '}' (rule end)
	 *     abstract=EBoolean 'Attributes:'? 'Associations:'? (ambiguity) '}' (rule end)
	 *     description=EString 'Attributes:'? 'Associations:'? (ambiguity) '}' (rule end)
	 *     extends+=[EClass|FQN] 'Attributes:'? 'Associations:'? (ambiguity) '}' (rule end)
	 *     icon=STRING 'Attributes:'? 'Associations:'? (ambiguity) '}' (rule end)
	 *     name=EString '{' 'Attributes:'? 'Associations:'? (ambiguity) '}' (rule end)
	 *     owned_annotations+=Annotation 'Attributes:'? 'Associations:'? (ambiguity) '}' (rule end)
	 */
	protected void emit_Class_OperationsKeyword_12_0_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}

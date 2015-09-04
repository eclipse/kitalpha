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
grammar InternalVpdiagram;

options {
	superClass=AbstractInternalContentAssistParser;
	backtrack=true;
	
}

@lexer::header {
package org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;
}

@parser::header {
package org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.VpdiagramGrammarAccess;

}

@parser::members {
 
 	private VpdiagramGrammarAccess grammarAccess;
 	
    public void setGrammarAccess(VpdiagramGrammarAccess grammarAccess) {
    	this.grammarAccess = grammarAccess;
    }
    
    @Override
    protected Grammar getGrammar() {
    	return grammarAccess.getGrammar();
    }
    
    @Override
    protected String getValueForTokenName(String tokenName) {
    	return tokenName;
    }

}




// Entry rule entryRuleDiagrams
entryRuleDiagrams 
:
{ before(grammarAccess.getDiagramsRule()); }
	 ruleDiagrams
{ after(grammarAccess.getDiagramsRule()); } 
	 EOF 
;

// Rule Diagrams
ruleDiagrams
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getDiagramsAccess().getGroup()); }
(rule__Diagrams__Group__0)
{ after(grammarAccess.getDiagramsAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleAbstractImport
entryRuleAbstractImport 
:
{ before(grammarAccess.getAbstractImportRule()); }
	 ruleAbstractImport
{ after(grammarAccess.getAbstractImportRule()); } 
	 EOF 
;

// Rule AbstractImport
ruleAbstractImport
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getAbstractImportAccess().getAlternatives()); }
(rule__AbstractImport__Alternatives)
{ after(grammarAccess.getAbstractImportAccess().getAlternatives()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleImportNameSpace
entryRuleImportNameSpace 
:
{ before(grammarAccess.getImportNameSpaceRule()); }
	 ruleImportNameSpace
{ after(grammarAccess.getImportNameSpaceRule()); } 
	 EOF 
;

// Rule ImportNameSpace
ruleImportNameSpace
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getImportNameSpaceAccess().getGroup()); }
(rule__ImportNameSpace__Group__0)
{ after(grammarAccess.getImportNameSpaceAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleImportGroup
entryRuleImportGroup 
:
{ before(grammarAccess.getImportGroupRule()); }
	 ruleImportGroup
{ after(grammarAccess.getImportGroupRule()); } 
	 EOF 
;

// Rule ImportGroup
ruleImportGroup
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getImportGroupAccess().getGroup()); }
(rule__ImportGroup__Group__0)
{ after(grammarAccess.getImportGroupAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleAspect
entryRuleAspect 
:
{ before(grammarAccess.getAspectRule()); }
	 ruleAspect
{ after(grammarAccess.getAspectRule()); } 
	 EOF 
;

// Rule Aspect
ruleAspect
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getAspectAccess().getDiagramSetParserRuleCall()); }
	ruleDiagramSet
{ after(grammarAccess.getAspectAccess().getDiagramSetParserRuleCall()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleDiagramSet
entryRuleDiagramSet 
:
{ before(grammarAccess.getDiagramSetRule()); }
	 ruleDiagramSet
{ after(grammarAccess.getDiagramSetRule()); } 
	 EOF 
;

// Rule DiagramSet
ruleDiagramSet
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getDiagramSetAccess().getGroup()); }
(rule__DiagramSet__Group__0)
{ after(grammarAccess.getDiagramSetAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleDiagramRepresentation
entryRuleDiagramRepresentation 
:
{ before(grammarAccess.getDiagramRepresentationRule()); }
	 ruleDiagramRepresentation
{ after(grammarAccess.getDiagramRepresentationRule()); } 
	 EOF 
;

// Rule DiagramRepresentation
ruleDiagramRepresentation
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getDiagramRepresentationAccess().getAlternatives()); }
(rule__DiagramRepresentation__Alternatives)
{ after(grammarAccess.getDiagramRepresentationAccess().getAlternatives()); }
)

;
finally {
	restoreStackSize(stackSize);
}





// Entry rule entryRuleDiagramChildren
entryRuleDiagramChildren 
:
{ before(grammarAccess.getDiagramChildrenRule()); }
	 ruleDiagramChildren
{ after(grammarAccess.getDiagramChildrenRule()); } 
	 EOF 
;

// Rule DiagramChildren
ruleDiagramChildren
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getDiagramChildrenAccess().getAlternatives()); }
(rule__DiagramChildren__Alternatives)
{ after(grammarAccess.getDiagramChildrenAccess().getAlternatives()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleAbstractNode
entryRuleAbstractNode 
:
{ before(grammarAccess.getAbstractNodeRule()); }
	 ruleAbstractNode
{ after(grammarAccess.getAbstractNodeRule()); } 
	 EOF 
;

// Rule AbstractNode
ruleAbstractNode
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getAbstractNodeAccess().getAlternatives()); }
(rule__AbstractNode__Alternatives)
{ after(grammarAccess.getAbstractNodeAccess().getAlternatives()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleAbstractEdge
entryRuleAbstractEdge 
:
{ before(grammarAccess.getAbstractEdgeRule()); }
	 ruleAbstractEdge
{ after(grammarAccess.getAbstractEdgeRule()); } 
	 EOF 
;

// Rule AbstractEdge
ruleAbstractEdge
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getAbstractEdgeAccess().getAlternatives()); }
(rule__AbstractEdge__Alternatives)
{ after(grammarAccess.getAbstractEdgeAccess().getAlternatives()); }
)

;
finally {
	restoreStackSize(stackSize);
}





// Entry rule entryRuleAbstractContainerStyle
entryRuleAbstractContainerStyle 
:
{ before(grammarAccess.getAbstractContainerStyleRule()); }
	 ruleAbstractContainerStyle
{ after(grammarAccess.getAbstractContainerStyleRule()); } 
	 EOF 
;

// Rule AbstractContainerStyle
ruleAbstractContainerStyle
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getAbstractContainerStyleAccess().getAlternatives()); }
(rule__AbstractContainerStyle__Alternatives)
{ after(grammarAccess.getAbstractContainerStyleAccess().getAlternatives()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleAbstractNodeStyle
entryRuleAbstractNodeStyle 
:
{ before(grammarAccess.getAbstractNodeStyleRule()); }
	 ruleAbstractNodeStyle
{ after(grammarAccess.getAbstractNodeStyleRule()); } 
	 EOF 
;

// Rule AbstractNodeStyle
ruleAbstractNodeStyle
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getAbstractNodeStyleAccess().getAlternatives()); }
(rule__AbstractNodeStyle__Alternatives)
{ after(grammarAccess.getAbstractNodeStyleAccess().getAlternatives()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleDiagram
entryRuleDiagram 
:
{ before(grammarAccess.getDiagramRule()); }
	 ruleDiagram
{ after(grammarAccess.getDiagramRule()); } 
	 EOF 
;

// Rule Diagram
ruleDiagram
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getDiagramAccess().getGroup()); }
(rule__Diagram__Group__0)
{ after(grammarAccess.getDiagramAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleDiagramExtension
entryRuleDiagramExtension 
:
{ before(grammarAccess.getDiagramExtensionRule()); }
	 ruleDiagramExtension
{ after(grammarAccess.getDiagramExtensionRule()); } 
	 EOF 
;

// Rule DiagramExtension
ruleDiagramExtension
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getDiagramExtensionAccess().getGroup()); }
(rule__DiagramExtension__Group__0)
{ after(grammarAccess.getDiagramExtensionAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleMappingSet
entryRuleMappingSet 
:
{ before(grammarAccess.getMappingSetRule()); }
	 ruleMappingSet
{ after(grammarAccess.getMappingSetRule()); } 
	 EOF 
;

// Rule MappingSet
ruleMappingSet
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getMappingSetAccess().getGroup()); }
(rule__MappingSet__Group__0)
{ after(grammarAccess.getMappingSetAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleEdgeDescription
entryRuleEdgeDescription 
:
{ before(grammarAccess.getEdgeDescriptionRule()); }
	 ruleEdgeDescription
{ after(grammarAccess.getEdgeDescriptionRule()); } 
	 EOF 
;

// Rule EdgeDescription
ruleEdgeDescription
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getEdgeDescriptionAccess().getGroup()); }
(rule__EdgeDescription__Group__0)
{ after(grammarAccess.getEdgeDescriptionAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleCondition
entryRuleCondition 
:
{ before(grammarAccess.getConditionRule()); }
	 ruleCondition
{ after(grammarAccess.getConditionRule()); } 
	 EOF 
;

// Rule Condition
ruleCondition
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getConditionAccess().getGroup()); }
(rule__Condition__Group__0)
{ after(grammarAccess.getConditionAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleEdgeStyle
entryRuleEdgeStyle 
:
{ before(grammarAccess.getEdgeStyleRule()); }
	 ruleEdgeStyle
{ after(grammarAccess.getEdgeStyleRule()); } 
	 EOF 
;

// Rule EdgeStyle
ruleEdgeStyle
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getEdgeStyleAccess().getGroup()); }
(rule__EdgeStyle__Group__0)
{ after(grammarAccess.getEdgeStyleAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleContainer
entryRuleContainer 
:
{ before(grammarAccess.getContainerRule()); }
	 ruleContainer
{ after(grammarAccess.getContainerRule()); } 
	 EOF 
;

// Rule Container
ruleContainer
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getContainerAccess().getGroup()); }
(rule__Container__Group__0)
{ after(grammarAccess.getContainerAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleContainerChildren
entryRuleContainerChildren 
:
{ before(grammarAccess.getContainerChildrenRule()); }
	 ruleContainerChildren
{ after(grammarAccess.getContainerChildrenRule()); } 
	 EOF 
;

// Rule ContainerChildren
ruleContainerChildren
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getContainerChildrenAccess().getGroup()); }
(rule__ContainerChildren__Group__0)
{ after(grammarAccess.getContainerChildrenAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleNodeDomainElement
entryRuleNodeDomainElement 
:
{ before(grammarAccess.getNodeDomainElementRule()); }
	 ruleNodeDomainElement
{ after(grammarAccess.getNodeDomainElementRule()); } 
	 EOF 
;

// Rule NodeDomainElement
ruleNodeDomainElement
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getNodeDomainElementAccess().getGroup()); }
(rule__NodeDomainElement__Group__0)
{ after(grammarAccess.getNodeDomainElementAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleContainerDescription
entryRuleContainerDescription 
:
{ before(grammarAccess.getContainerDescriptionRule()); }
	 ruleContainerDescription
{ after(grammarAccess.getContainerDescriptionRule()); } 
	 EOF 
;

// Rule ContainerDescription
ruleContainerDescription
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getContainerDescriptionAccess().getGroup()); }
(rule__ContainerDescription__Group__0)
{ after(grammarAccess.getContainerDescriptionAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleBasicStyle
entryRuleBasicStyle 
:
{ before(grammarAccess.getBasicStyleRule()); }
	 ruleBasicStyle
{ after(grammarAccess.getBasicStyleRule()); } 
	 EOF 
;

// Rule BasicStyle
ruleBasicStyle
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getBasicStyleAccess().getGroup()); }
(rule__BasicStyle__Group__0)
{ after(grammarAccess.getBasicStyleAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleHistogramStyle
entryRuleHistogramStyle 
:
{ before(grammarAccess.getHistogramStyleRule()); }
	 ruleHistogramStyle
{ after(grammarAccess.getHistogramStyleRule()); } 
	 EOF 
;

// Rule HistogramStyle
ruleHistogramStyle
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getHistogramStyleAccess().getGroup()); }
(rule__HistogramStyle__Group__0)
{ after(grammarAccess.getHistogramStyleAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleHistogramSection
entryRuleHistogramSection 
:
{ before(grammarAccess.getHistogramSectionRule()); }
	 ruleHistogramSection
{ after(grammarAccess.getHistogramSectionRule()); } 
	 EOF 
;

// Rule HistogramSection
ruleHistogramSection
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getHistogramSectionAccess().getGroup()); }
(rule__HistogramSection__Group__0)
{ after(grammarAccess.getHistogramSectionAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleImageStyle
entryRuleImageStyle 
:
{ before(grammarAccess.getImageStyleRule()); }
	 ruleImageStyle
{ after(grammarAccess.getImageStyleRule()); } 
	 EOF 
;

// Rule ImageStyle
ruleImageStyle
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getImageStyleAccess().getGroup()); }
(rule__ImageStyle__Group__0)
{ after(grammarAccess.getImageStyleAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleFlatStyle
entryRuleFlatStyle 
:
{ before(grammarAccess.getFlatStyleRule()); }
	 ruleFlatStyle
{ after(grammarAccess.getFlatStyleRule()); } 
	 EOF 
;

// Rule FlatStyle
ruleFlatStyle
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getFlatStyleAccess().getGroup()); }
(rule__FlatStyle__Group__0)
{ after(grammarAccess.getFlatStyleAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleLabel
entryRuleLabel 
:
{ before(grammarAccess.getLabelRule()); }
	 ruleLabel
{ after(grammarAccess.getLabelRule()); } 
	 EOF 
;

// Rule Label
ruleLabel
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getLabelAccess().getGroup()); }
(rule__Label__Group__0)
{ after(grammarAccess.getLabelAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleNode
entryRuleNode 
:
{ before(grammarAccess.getNodeRule()); }
	 ruleNode
{ after(grammarAccess.getNodeRule()); } 
	 EOF 
;

// Rule Node
ruleNode
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getNodeAccess().getGroup()); }
(rule__Node__Group__0)
{ after(grammarAccess.getNodeAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleNodeChildren
entryRuleNodeChildren 
:
{ before(grammarAccess.getNodeChildrenRule()); }
	 ruleNodeChildren
{ after(grammarAccess.getNodeChildrenRule()); } 
	 EOF 
;

// Rule NodeChildren
ruleNodeChildren
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getNodeChildrenAccess().getGroup()); }
(rule__NodeChildren__Group__0)
{ after(grammarAccess.getNodeChildrenAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleBorderedNode
entryRuleBorderedNode 
:
{ before(grammarAccess.getBorderedNodeRule()); }
	 ruleBorderedNode
{ after(grammarAccess.getBorderedNodeRule()); } 
	 EOF 
;

// Rule BorderedNode
ruleBorderedNode
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getBorderedNodeAccess().getGroup()); }
(rule__BorderedNode__Group__0)
{ after(grammarAccess.getBorderedNodeAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleNodeDescription
entryRuleNodeDescription 
:
{ before(grammarAccess.getNodeDescriptionRule()); }
	 ruleNodeDescription
{ after(grammarAccess.getNodeDescriptionRule()); } 
	 EOF 
;

// Rule NodeDescription
ruleNodeDescription
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getNodeDescriptionAccess().getGroup()); }
(rule__NodeDescription__Group__0)
{ after(grammarAccess.getNodeDescriptionAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleActionSet
entryRuleActionSet 
:
{ before(grammarAccess.getActionSetRule()); }
	 ruleActionSet
{ after(grammarAccess.getActionSetRule()); } 
	 EOF 
;

// Rule ActionSet
ruleActionSet
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getActionSetAccess().getGroup()); }
(rule__ActionSet__Group__0)
{ after(grammarAccess.getActionSetAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleOpenAction
entryRuleOpenAction 
:
{ before(grammarAccess.getOpenActionRule()); }
	 ruleOpenAction
{ after(grammarAccess.getOpenActionRule()); } 
	 EOF 
;

// Rule OpenAction
ruleOpenAction
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getOpenActionAccess().getGroup()); }
(rule__OpenAction__Group__0)
{ after(grammarAccess.getOpenActionAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleAction
entryRuleAction 
:
{ before(grammarAccess.getActionRule()); }
	 ruleAction
{ after(grammarAccess.getActionRule()); } 
	 EOF 
;

// Rule Action
ruleAction
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getActionAccess().getAlternatives()); }
(rule__Action__Alternatives)
{ after(grammarAccess.getActionAccess().getAlternatives()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleCreate
entryRuleCreate 
:
{ before(grammarAccess.getCreateRule()); }
	 ruleCreate
{ after(grammarAccess.getCreateRule()); } 
	 EOF 
;

// Rule Create
ruleCreate
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getCreateAccess().getGroup()); }
(rule__Create__Group__0)
{ after(grammarAccess.getCreateAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleDelete
entryRuleDelete 
:
{ before(grammarAccess.getDeleteRule()); }
	 ruleDelete
{ after(grammarAccess.getDeleteRule()); } 
	 EOF 
;

// Rule Delete
ruleDelete
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getDeleteAccess().getGroup()); }
(rule__Delete__Group__0)
{ after(grammarAccess.getDeleteAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleDrop
entryRuleDrop 
:
{ before(grammarAccess.getDropRule()); }
	 ruleDrop
{ after(grammarAccess.getDropRule()); } 
	 EOF 
;

// Rule Drop
ruleDrop
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getDropAccess().getGroup()); }
(rule__Drop__Group__0)
{ after(grammarAccess.getDropAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleReconnectEdge
entryRuleReconnectEdge 
:
{ before(grammarAccess.getReconnectEdgeRule()); }
	 ruleReconnectEdge
{ after(grammarAccess.getReconnectEdgeRule()); } 
	 EOF 
;

// Rule ReconnectEdge
ruleReconnectEdge
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getReconnectEdgeAccess().getGroup()); }
(rule__ReconnectEdge__Group__0)
{ after(grammarAccess.getReconnectEdgeAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleDomainContainer
entryRuleDomainContainer 
:
{ before(grammarAccess.getDomainContainerRule()); }
	 ruleDomainContainer
{ after(grammarAccess.getDomainContainerRule()); } 
	 EOF 
;

// Rule DomainContainer
ruleDomainContainer
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getDomainContainerAccess().getGroup()); }
(rule__DomainContainer__Group__0)
{ after(grammarAccess.getDomainContainerAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleEdge
entryRuleEdge 
:
{ before(grammarAccess.getEdgeRule()); }
	 ruleEdge
{ after(grammarAccess.getEdgeRule()); } 
	 EOF 
;

// Rule Edge
ruleEdge
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getEdgeAccess().getGroup()); }
(rule__Edge__Group__0)
{ after(grammarAccess.getEdgeAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleEdgeImport
entryRuleEdgeImport 
:
{ before(grammarAccess.getEdgeImportRule()); }
	 ruleEdgeImport
{ after(grammarAccess.getEdgeImportRule()); } 
	 EOF 
;

// Rule EdgeImport
ruleEdgeImport
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getEdgeImportAccess().getGroup()); }
(rule__EdgeImport__Group__0)
{ after(grammarAccess.getEdgeImportAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleEdgeDomainAssociation
entryRuleEdgeDomainAssociation 
:
{ before(grammarAccess.getEdgeDomainAssociationRule()); }
	 ruleEdgeDomainAssociation
{ after(grammarAccess.getEdgeDomainAssociationRule()); } 
	 EOF 
;

// Rule EdgeDomainAssociation
ruleEdgeDomainAssociation
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getEdgeDomainAssociationAccess().getGroup()); }
(rule__EdgeDomainAssociation__Group__0)
{ after(grammarAccess.getEdgeDomainAssociationAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleEdgeDomainElement
entryRuleEdgeDomainElement 
:
{ before(grammarAccess.getEdgeDomainElementRule()); }
	 ruleEdgeDomainElement
{ after(grammarAccess.getEdgeDomainElementRule()); } 
	 EOF 
;

// Rule EdgeDomainElement
ruleEdgeDomainElement
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getEdgeDomainElementAccess().getGroup()); }
(rule__EdgeDomainElement__Group__0)
{ after(grammarAccess.getEdgeDomainElementAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleAbstractClass
entryRuleAbstractClass 
:
{ before(grammarAccess.getAbstractClassRule()); }
	 ruleAbstractClass
{ after(grammarAccess.getAbstractClassRule()); } 
	 EOF 
;

// Rule AbstractClass
ruleAbstractClass
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getAbstractClassAccess().getAlternatives()); }
(rule__AbstractClass__Alternatives)
{ after(grammarAccess.getAbstractClassAccess().getAlternatives()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleLocalClass2
entryRuleLocalClass2 
:
{ before(grammarAccess.getLocalClass2Rule()); }
	 ruleLocalClass2
{ after(grammarAccess.getLocalClass2Rule()); } 
	 EOF 
;

// Rule LocalClass2
ruleLocalClass2
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getLocalClass2Access().getGroup()); }
(rule__LocalClass2__Group__0)
{ after(grammarAccess.getLocalClass2Access().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleExternalClass
entryRuleExternalClass 
:
{ before(grammarAccess.getExternalClassRule()); }
	 ruleExternalClass
{ after(grammarAccess.getExternalClassRule()); } 
	 EOF 
;

// Rule ExternalClass
ruleExternalClass
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getExternalClassAccess().getGroup()); }
(rule__ExternalClass__Group__0)
{ after(grammarAccess.getExternalClassAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleAbstractAssociation2
entryRuleAbstractAssociation2 
:
{ before(grammarAccess.getAbstractAssociation2Rule()); }
	 ruleAbstractAssociation2
{ after(grammarAccess.getAbstractAssociation2Rule()); } 
	 EOF 
;

// Rule AbstractAssociation2
ruleAbstractAssociation2
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getAbstractAssociation2Access().getAlternatives()); }
(rule__AbstractAssociation2__Alternatives)
{ after(grammarAccess.getAbstractAssociation2Access().getAlternatives()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleLocalAssociation
entryRuleLocalAssociation 
:
{ before(grammarAccess.getLocalAssociationRule()); }
	 ruleLocalAssociation
{ after(grammarAccess.getLocalAssociationRule()); } 
	 EOF 
;

// Rule LocalAssociation
ruleLocalAssociation
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getLocalAssociationAccess().getGroup()); }
(rule__LocalAssociation__Group__0)
{ after(grammarAccess.getLocalAssociationAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleExternalAssociation
entryRuleExternalAssociation 
:
{ before(grammarAccess.getExternalAssociationRule()); }
	 ruleExternalAssociation
{ after(grammarAccess.getExternalAssociationRule()); } 
	 EOF 
;

// Rule ExternalAssociation
ruleExternalAssociation
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getExternalAssociationAccess().getGroup()); }
(rule__ExternalAssociation__Group__0)
{ after(grammarAccess.getExternalAssociationAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}





// Entry rule entryRuleLocalAttribute
entryRuleLocalAttribute 
:
{ before(grammarAccess.getLocalAttributeRule()); }
	 ruleLocalAttribute
{ after(grammarAccess.getLocalAttributeRule()); } 
	 EOF 
;

// Rule LocalAttribute
ruleLocalAttribute
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getLocalAttributeAccess().getGroup()); }
(rule__LocalAttribute__Group__0)
{ after(grammarAccess.getLocalAttributeAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleExternalAttribute
entryRuleExternalAttribute 
:
{ before(grammarAccess.getExternalAttributeRule()); }
	 ruleExternalAttribute
{ after(grammarAccess.getExternalAttributeRule()); } 
	 EOF 
;

// Rule ExternalAttribute
ruleExternalAttribute
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getExternalAttributeAccess().getGroup()); }
(rule__ExternalAttribute__Group__0)
{ after(grammarAccess.getExternalAttributeAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleExpression
entryRuleExpression 
:
{ before(grammarAccess.getExpressionRule()); }
	 ruleExpression
{ after(grammarAccess.getExpressionRule()); } 
	 EOF 
;

// Rule Expression
ruleExpression
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getExpressionAccess().getGroup()); }
(rule__Expression__Group__0)
{ after(grammarAccess.getExpressionAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleExpressionElement
entryRuleExpressionElement 
:
{ before(grammarAccess.getExpressionElementRule()); }
	 ruleExpressionElement
{ after(grammarAccess.getExpressionElementRule()); } 
	 EOF 
;

// Rule ExpressionElement
ruleExpressionElement
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getExpressionElementAccess().getAlternatives()); }
(rule__ExpressionElement__Alternatives)
{ after(grammarAccess.getExpressionElementAccess().getAlternatives()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleForeignExpressionElement
entryRuleForeignExpressionElement 
:
{ before(grammarAccess.getForeignExpressionElementRule()); }
	 ruleForeignExpressionElement
{ after(grammarAccess.getForeignExpressionElementRule()); } 
	 EOF 
;

// Rule ForeignExpressionElement
ruleForeignExpressionElement
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getForeignExpressionElementAccess().getAlternatives()); }
(rule__ForeignExpressionElement__Alternatives)
{ after(grammarAccess.getForeignExpressionElementAccess().getAlternatives()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleJavaElement
entryRuleJavaElement 
:
{ before(grammarAccess.getJavaElementRule()); }
	 ruleJavaElement
{ after(grammarAccess.getJavaElementRule()); } 
	 EOF 
;

// Rule JavaElement
ruleJavaElement
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getJavaElementAccess().getGroup()); }
(rule__JavaElement__Group__0)
{ after(grammarAccess.getJavaElementAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleDomainElement
entryRuleDomainElement 
:
{ before(grammarAccess.getDomainElementRule()); }
	 ruleDomainElement
{ after(grammarAccess.getDomainElementRule()); } 
	 EOF 
;

// Rule DomainElement
ruleDomainElement
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getDomainElementAccess().getGroup()); }
(rule__DomainElement__Group__0)
{ after(grammarAccess.getDomainElementAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleStringElement
entryRuleStringElement 
:
{ before(grammarAccess.getStringElementRule()); }
	 ruleStringElement
{ after(grammarAccess.getStringElementRule()); } 
	 EOF 
;

// Rule StringElement
ruleStringElement
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getStringElementAccess().getGroup()); }
(rule__StringElement__Group__0)
{ after(grammarAccess.getStringElementAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleEString
entryRuleEString 
:
{ before(grammarAccess.getEStringRule()); }
	 ruleEString
{ after(grammarAccess.getEStringRule()); } 
	 EOF 
;

// Rule EString
ruleEString
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getEStringAccess().getAlternatives()); }
(rule__EString__Alternatives)
{ after(grammarAccess.getEStringAccess().getAlternatives()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleFQN
entryRuleFQN 
:
{ before(grammarAccess.getFQNRule()); }
	 ruleFQN
{ after(grammarAccess.getFQNRule()); } 
	 EOF 
;

// Rule FQN
ruleFQN
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getFQNAccess().getGroup()); }
(rule__FQN__Group__0)
{ after(grammarAccess.getFQNAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}





// Entry rule entryRuleEInt
entryRuleEInt 
:
{ before(grammarAccess.getEIntRule()); }
	 ruleEInt
{ after(grammarAccess.getEIntRule()); } 
	 EOF 
;

// Rule EInt
ruleEInt
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getEIntAccess().getINTTerminalRuleCall()); }
	RULE_INT
{ after(grammarAccess.getEIntAccess().getINTTerminalRuleCall()); }
)

;
finally {
	restoreStackSize(stackSize);
}




// Rule Node_Form
ruleNode_Form
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getNode_FormAccess().getAlternatives()); }
(rule__Node_Form__Alternatives)
{ after(grammarAccess.getNode_FormAccess().getAlternatives()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Rule BackgroundStyle
ruleBackgroundStyle
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getBackgroundStyleAccess().getAlternatives()); }
(rule__BackgroundStyle__Alternatives)
{ after(grammarAccess.getBackgroundStyleAccess().getAlternatives()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Rule LabelPosition
ruleLabelPosition
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getLabelPositionAccess().getAlternatives()); }
(rule__LabelPosition__Alternatives)
{ after(grammarAccess.getLabelPositionAccess().getAlternatives()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Rule LabelAlignment
ruleLabelAlignment
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getLabelAlignmentAccess().getAlternatives()); }
(rule__LabelAlignment__Alternatives)
{ after(grammarAccess.getLabelAlignmentAccess().getAlternatives()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Rule LineStyle
ruleLineStyle
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getLineStyleAccess().getAlternatives()); }
(rule__LineStyle__Alternatives)
{ after(grammarAccess.getLineStyleAccess().getAlternatives()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Rule EdgeArrows
ruleEdgeArrows
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getEdgeArrowsAccess().getAlternatives()); }
(rule__EdgeArrows__Alternatives)
{ after(grammarAccess.getEdgeArrowsAccess().getAlternatives()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Rule SystemColors
ruleSystemColors
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getSystemColorsAccess().getAlternatives()); }
(rule__SystemColors__Alternatives)
{ after(grammarAccess.getSystemColorsAccess().getAlternatives()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Rule ContainerLayout
ruleContainerLayout
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getContainerLayoutAccess().getAlternatives()); }
(rule__ContainerLayout__Alternatives)
{ after(grammarAccess.getContainerLayoutAccess().getAlternatives()); }
)

;
finally {
	restoreStackSize(stackSize);
}



rule__AbstractImport__Alternatives
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getAbstractImportAccess().getImportNameSpaceParserRuleCall_0()); }
	ruleImportNameSpace
{ after(grammarAccess.getAbstractImportAccess().getImportNameSpaceParserRuleCall_0()); }
)

    |(
{ before(grammarAccess.getAbstractImportAccess().getImportGroupParserRuleCall_1()); }
	ruleImportGroup
{ after(grammarAccess.getAbstractImportAccess().getImportGroupParserRuleCall_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__DiagramRepresentation__Alternatives
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getDiagramRepresentationAccess().getDiagramParserRuleCall_0()); }
	ruleDiagram
{ after(grammarAccess.getDiagramRepresentationAccess().getDiagramParserRuleCall_0()); }
)

    |(
{ before(grammarAccess.getDiagramRepresentationAccess().getDiagramExtensionParserRuleCall_1()); }
	ruleDiagramExtension
{ after(grammarAccess.getDiagramRepresentationAccess().getDiagramExtensionParserRuleCall_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__DiagramChildren__Alternatives
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getDiagramChildrenAccess().getAbstractEdgeParserRuleCall_0()); }
	ruleAbstractEdge
{ after(grammarAccess.getDiagramChildrenAccess().getAbstractEdgeParserRuleCall_0()); }
)

    |(
{ before(grammarAccess.getDiagramChildrenAccess().getContainerParserRuleCall_1()); }
	ruleContainer
{ after(grammarAccess.getDiagramChildrenAccess().getContainerParserRuleCall_1()); }
)

    |(
{ before(grammarAccess.getDiagramChildrenAccess().getNodeParserRuleCall_2()); }
	ruleNode
{ after(grammarAccess.getDiagramChildrenAccess().getNodeParserRuleCall_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__AbstractNode__Alternatives
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getAbstractNodeAccess().getNodeParserRuleCall_0()); }
	ruleNode
{ after(grammarAccess.getAbstractNodeAccess().getNodeParserRuleCall_0()); }
)

    |(
{ before(grammarAccess.getAbstractNodeAccess().getBorderedNodeParserRuleCall_1()); }
	ruleBorderedNode
{ after(grammarAccess.getAbstractNodeAccess().getBorderedNodeParserRuleCall_1()); }
)

    |(
{ before(grammarAccess.getAbstractNodeAccess().getContainerParserRuleCall_2()); }
	ruleContainer
{ after(grammarAccess.getAbstractNodeAccess().getContainerParserRuleCall_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__AbstractEdge__Alternatives
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getAbstractEdgeAccess().getEdgeParserRuleCall_0()); }
	ruleEdge
{ after(grammarAccess.getAbstractEdgeAccess().getEdgeParserRuleCall_0()); }
)

    |(
{ before(grammarAccess.getAbstractEdgeAccess().getEdgeImportParserRuleCall_1()); }
	ruleEdgeImport
{ after(grammarAccess.getAbstractEdgeAccess().getEdgeImportParserRuleCall_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__AbstractContainerStyle__Alternatives
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getAbstractContainerStyleAccess().getFlatStyleParserRuleCall_0()); }
	ruleFlatStyle
{ after(grammarAccess.getAbstractContainerStyleAccess().getFlatStyleParserRuleCall_0()); }
)

    |(
{ before(grammarAccess.getAbstractContainerStyleAccess().getImageStyleParserRuleCall_1()); }
	ruleImageStyle
{ after(grammarAccess.getAbstractContainerStyleAccess().getImageStyleParserRuleCall_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__AbstractNodeStyle__Alternatives
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getAbstractNodeStyleAccess().getImageStyleParserRuleCall_0()); }
	ruleImageStyle
{ after(grammarAccess.getAbstractNodeStyleAccess().getImageStyleParserRuleCall_0()); }
)

    |(
{ before(grammarAccess.getAbstractNodeStyleAccess().getBasicStyleParserRuleCall_1()); }
	ruleBasicStyle
{ after(grammarAccess.getAbstractNodeStyleAccess().getBasicStyleParserRuleCall_1()); }
)

    |(
{ before(grammarAccess.getAbstractNodeStyleAccess().getHistogramStyleParserRuleCall_2()); }
	ruleHistogramStyle
{ after(grammarAccess.getAbstractNodeStyleAccess().getHistogramStyleParserRuleCall_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__NodeDomainElement__Alternatives_2_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getNodeDomainElementAccess().getGroup_2_1_0()); }
(rule__NodeDomainElement__Group_2_1_0__0)
{ after(grammarAccess.getNodeDomainElementAccess().getGroup_2_1_0()); }
)

    |(
{ before(grammarAccess.getNodeDomainElementAccess().getGroup_2_1_1()); }
(rule__NodeDomainElement__Group_2_1_1__0)
{ after(grammarAccess.getNodeDomainElementAccess().getGroup_2_1_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Action__Alternatives
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getActionAccess().getCreateParserRuleCall_0()); }
	ruleCreate
{ after(grammarAccess.getActionAccess().getCreateParserRuleCall_0()); }
)

    |(
{ before(grammarAccess.getActionAccess().getDeleteParserRuleCall_1()); }
	ruleDelete
{ after(grammarAccess.getActionAccess().getDeleteParserRuleCall_1()); }
)

    |(
{ before(grammarAccess.getActionAccess().getDropParserRuleCall_2()); }
	ruleDrop
{ after(grammarAccess.getActionAccess().getDropParserRuleCall_2()); }
)

    |(
{ before(grammarAccess.getActionAccess().getReconnectEdgeParserRuleCall_3()); }
	ruleReconnectEdge
{ after(grammarAccess.getActionAccess().getReconnectEdgeParserRuleCall_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Edge__Alternatives_4
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getEdgeAccess().getGroup_4_0()); }
(rule__Edge__Group_4_0__0)
{ after(grammarAccess.getEdgeAccess().getGroup_4_0()); }
)

    |(
{ before(grammarAccess.getEdgeAccess().getGroup_4_1()); }
(rule__Edge__Group_4_1__0)
{ after(grammarAccess.getEdgeAccess().getGroup_4_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__EdgeDomainAssociation__Alternatives_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getEdgeDomainAssociationAccess().getGroup_1_0()); }
(rule__EdgeDomainAssociation__Group_1_0__0)
{ after(grammarAccess.getEdgeDomainAssociationAccess().getGroup_1_0()); }
)

    |(
{ before(grammarAccess.getEdgeDomainAssociationAccess().getTarget_LocatorAssignment_1_1()); }
(rule__EdgeDomainAssociation__Target_LocatorAssignment_1_1)
{ after(grammarAccess.getEdgeDomainAssociationAccess().getTarget_LocatorAssignment_1_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__EdgeDomainElement__Alternatives_2
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getEdgeDomainElementAccess().getGroup_2_0()); }
(rule__EdgeDomainElement__Group_2_0__0)
{ after(grammarAccess.getEdgeDomainElementAccess().getGroup_2_0()); }
)

    |(
{ before(grammarAccess.getEdgeDomainElementAccess().getGroup_2_1()); }
(rule__EdgeDomainElement__Group_2_1__0)
{ after(grammarAccess.getEdgeDomainElementAccess().getGroup_2_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__EdgeDomainElement__Alternatives_3
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getEdgeDomainElementAccess().getGroup_3_0()); }
(rule__EdgeDomainElement__Group_3_0__0)
{ after(grammarAccess.getEdgeDomainElementAccess().getGroup_3_0()); }
)

    |(
{ before(grammarAccess.getEdgeDomainElementAccess().getGroup_3_1()); }
(rule__EdgeDomainElement__Group_3_1__0)
{ after(grammarAccess.getEdgeDomainElementAccess().getGroup_3_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__AbstractClass__Alternatives
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getAbstractClassAccess().getLocalClass2ParserRuleCall_0()); }
	ruleLocalClass2
{ after(grammarAccess.getAbstractClassAccess().getLocalClass2ParserRuleCall_0()); }
)

    |(
{ before(grammarAccess.getAbstractClassAccess().getExternalClassParserRuleCall_1()); }
	ruleExternalClass
{ after(grammarAccess.getAbstractClassAccess().getExternalClassParserRuleCall_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__AbstractAssociation2__Alternatives
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getAbstractAssociation2Access().getExternalAssociationParserRuleCall_0()); }
	ruleExternalAssociation
{ after(grammarAccess.getAbstractAssociation2Access().getExternalAssociationParserRuleCall_0()); }
)

    |(
{ before(grammarAccess.getAbstractAssociation2Access().getLocalAssociationParserRuleCall_1()); }
	ruleLocalAssociation
{ after(grammarAccess.getAbstractAssociation2Access().getLocalAssociationParserRuleCall_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__ExpressionElement__Alternatives
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getExpressionElementAccess().getForeignExpressionElementParserRuleCall_0()); }
	ruleForeignExpressionElement
{ after(grammarAccess.getExpressionElementAccess().getForeignExpressionElementParserRuleCall_0()); }
)

    |(
{ before(grammarAccess.getExpressionElementAccess().getStringElementParserRuleCall_1()); }
	ruleStringElement
{ after(grammarAccess.getExpressionElementAccess().getStringElementParserRuleCall_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__ForeignExpressionElement__Alternatives
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getForeignExpressionElementAccess().getJavaElementParserRuleCall_0()); }
	ruleJavaElement
{ after(grammarAccess.getForeignExpressionElementAccess().getJavaElementParserRuleCall_0()); }
)

    |(
{ before(grammarAccess.getForeignExpressionElementAccess().getDomainElementParserRuleCall_1()); }
	ruleDomainElement
{ after(grammarAccess.getForeignExpressionElementAccess().getDomainElementParserRuleCall_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__EString__Alternatives
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); }
	RULE_STRING
{ after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); }
)

    |(
{ before(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); }
	RULE_ID
{ after(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Node_Form__Alternatives
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getNode_FormAccess().getSquareEnumLiteralDeclaration_0()); }
(	'Square' 
)
{ after(grammarAccess.getNode_FormAccess().getSquareEnumLiteralDeclaration_0()); }
)

    |(
{ before(grammarAccess.getNode_FormAccess().getLozengeEnumLiteralDeclaration_1()); }
(	'Lozenge' 
)
{ after(grammarAccess.getNode_FormAccess().getLozengeEnumLiteralDeclaration_1()); }
)

    |(
{ before(grammarAccess.getNode_FormAccess().getEclipseEnumLiteralDeclaration_2()); }
(	'Eclipse' 
)
{ after(grammarAccess.getNode_FormAccess().getEclipseEnumLiteralDeclaration_2()); }
)

    |(
{ before(grammarAccess.getNode_FormAccess().getNoteEnumLiteralDeclaration_3()); }
(	'Note' 
)
{ after(grammarAccess.getNode_FormAccess().getNoteEnumLiteralDeclaration_3()); }
)

    |(
{ before(grammarAccess.getNode_FormAccess().getDotEnumLiteralDeclaration_4()); }
(	'Dot' 
)
{ after(grammarAccess.getNode_FormAccess().getDotEnumLiteralDeclaration_4()); }
)

    |(
{ before(grammarAccess.getNode_FormAccess().getTriangleEnumLiteralDeclaration_5()); }
(	'Triangle' 
)
{ after(grammarAccess.getNode_FormAccess().getTriangleEnumLiteralDeclaration_5()); }
)

    |(
{ before(grammarAccess.getNode_FormAccess().getStrokeEnumLiteralDeclaration_6()); }
(	'Stroke' 
)
{ after(grammarAccess.getNode_FormAccess().getStrokeEnumLiteralDeclaration_6()); }
)

    |(
{ before(grammarAccess.getNode_FormAccess().getRingEnumLiteralDeclaration_7()); }
(	'Ring' 
)
{ after(grammarAccess.getNode_FormAccess().getRingEnumLiteralDeclaration_7()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__BackgroundStyle__Alternatives
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getBackgroundStyleAccess().getGradientLeftToRightEnumLiteralDeclaration_0()); }
(	'GradientLeftToRight' 
)
{ after(grammarAccess.getBackgroundStyleAccess().getGradientLeftToRightEnumLiteralDeclaration_0()); }
)

    |(
{ before(grammarAccess.getBackgroundStyleAccess().getLiquidEnumLiteralDeclaration_1()); }
(	'Liquid' 
)
{ after(grammarAccess.getBackgroundStyleAccess().getLiquidEnumLiteralDeclaration_1()); }
)

    |(
{ before(grammarAccess.getBackgroundStyleAccess().getGradientTopToBottomEnumLiteralDeclaration_2()); }
(	'GradientTopToBottom' 
)
{ after(grammarAccess.getBackgroundStyleAccess().getGradientTopToBottomEnumLiteralDeclaration_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__LabelPosition__Alternatives
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getLabelPositionAccess().getBorderEnumLiteralDeclaration_0()); }
(	'border' 
)
{ after(grammarAccess.getLabelPositionAccess().getBorderEnumLiteralDeclaration_0()); }
)

    |(
{ before(grammarAccess.getLabelPositionAccess().getNodeEnumLiteralDeclaration_1()); }
(	'node' 
)
{ after(grammarAccess.getLabelPositionAccess().getNodeEnumLiteralDeclaration_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__LabelAlignment__Alternatives
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getLabelAlignmentAccess().getCENTEREnumLiteralDeclaration_0()); }
(	'center' 
)
{ after(grammarAccess.getLabelAlignmentAccess().getCENTEREnumLiteralDeclaration_0()); }
)

    |(
{ before(grammarAccess.getLabelAlignmentAccess().getLEFTEnumLiteralDeclaration_1()); }
(	'left' 
)
{ after(grammarAccess.getLabelAlignmentAccess().getLEFTEnumLiteralDeclaration_1()); }
)

    |(
{ before(grammarAccess.getLabelAlignmentAccess().getRIGHTEnumLiteralDeclaration_2()); }
(	'right' 
)
{ after(grammarAccess.getLabelAlignmentAccess().getRIGHTEnumLiteralDeclaration_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__LineStyle__Alternatives
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getLineStyleAccess().getSolidEnumLiteralDeclaration_0()); }
(	'solid' 
)
{ after(grammarAccess.getLineStyleAccess().getSolidEnumLiteralDeclaration_0()); }
)

    |(
{ before(grammarAccess.getLineStyleAccess().getDashEnumLiteralDeclaration_1()); }
(	'dash' 
)
{ after(grammarAccess.getLineStyleAccess().getDashEnumLiteralDeclaration_1()); }
)

    |(
{ before(grammarAccess.getLineStyleAccess().getDotEnumLiteralDeclaration_2()); }
(	'dot' 
)
{ after(grammarAccess.getLineStyleAccess().getDotEnumLiteralDeclaration_2()); }
)

    |(
{ before(grammarAccess.getLineStyleAccess().getDash_dotEnumLiteralDeclaration_3()); }
(	'dash_dot' 
)
{ after(grammarAccess.getLineStyleAccess().getDash_dotEnumLiteralDeclaration_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__EdgeArrows__Alternatives
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getEdgeArrowsAccess().getNoDecorationEnumLiteralDeclaration_0()); }
(	'NoDecoration' 
)
{ after(grammarAccess.getEdgeArrowsAccess().getNoDecorationEnumLiteralDeclaration_0()); }
)

    |(
{ before(grammarAccess.getEdgeArrowsAccess().getOutputArrowEnumLiteralDeclaration_1()); }
(	'OutputArrow' 
)
{ after(grammarAccess.getEdgeArrowsAccess().getOutputArrowEnumLiteralDeclaration_1()); }
)

    |(
{ before(grammarAccess.getEdgeArrowsAccess().getInputArrowEnumLiteralDeclaration_2()); }
(	'InputArrow' 
)
{ after(grammarAccess.getEdgeArrowsAccess().getInputArrowEnumLiteralDeclaration_2()); }
)

    |(
{ before(grammarAccess.getEdgeArrowsAccess().getOutputClosedArrowEnumLiteralDeclaration_3()); }
(	'OutputClosedArrow' 
)
{ after(grammarAccess.getEdgeArrowsAccess().getOutputClosedArrowEnumLiteralDeclaration_3()); }
)

    |(
{ before(grammarAccess.getEdgeArrowsAccess().getInputClosedArrowEnumLiteralDeclaration_4()); }
(	'InputClosedArrow' 
)
{ after(grammarAccess.getEdgeArrowsAccess().getInputClosedArrowEnumLiteralDeclaration_4()); }
)

    |(
{ before(grammarAccess.getEdgeArrowsAccess().getOutputFillClosedArrowEnumLiteralDeclaration_5()); }
(	'OutputFillClosedArrow' 
)
{ after(grammarAccess.getEdgeArrowsAccess().getOutputFillClosedArrowEnumLiteralDeclaration_5()); }
)

    |(
{ before(grammarAccess.getEdgeArrowsAccess().getInputFillClosedArrowEnumLiteralDeclaration_6()); }
(	'InputFillClosedArrow' 
)
{ after(grammarAccess.getEdgeArrowsAccess().getInputFillClosedArrowEnumLiteralDeclaration_6()); }
)

    |(
{ before(grammarAccess.getEdgeArrowsAccess().getDiamondEnumLiteralDeclaration_7()); }
(	'Diamond' 
)
{ after(grammarAccess.getEdgeArrowsAccess().getDiamondEnumLiteralDeclaration_7()); }
)

    |(
{ before(grammarAccess.getEdgeArrowsAccess().getFillDiamondEnumLiteralDeclaration_8()); }
(	'FillDiamond' 
)
{ after(grammarAccess.getEdgeArrowsAccess().getFillDiamondEnumLiteralDeclaration_8()); }
)

    |(
{ before(grammarAccess.getEdgeArrowsAccess().getInputArrowWithDiamondEnumLiteralDeclaration_9()); }
(	'InputArrowWithDiamond' 
)
{ after(grammarAccess.getEdgeArrowsAccess().getInputArrowWithDiamondEnumLiteralDeclaration_9()); }
)

    |(
{ before(grammarAccess.getEdgeArrowsAccess().getInputArrowWithFillDiamondEnumLiteralDeclaration_10()); }
(	'InputArrowWothFillDiamond' 
)
{ after(grammarAccess.getEdgeArrowsAccess().getInputArrowWithFillDiamondEnumLiteralDeclaration_10()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__SystemColors__Alternatives
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getSystemColorsAccess().getBlackEnumLiteralDeclaration_0()); }
(	'black' 
)
{ after(grammarAccess.getSystemColorsAccess().getBlackEnumLiteralDeclaration_0()); }
)

    |(
{ before(grammarAccess.getSystemColorsAccess().getBlueEnumLiteralDeclaration_1()); }
(	'blue' 
)
{ after(grammarAccess.getSystemColorsAccess().getBlueEnumLiteralDeclaration_1()); }
)

    |(
{ before(grammarAccess.getSystemColorsAccess().getRedEnumLiteralDeclaration_2()); }
(	'red' 
)
{ after(grammarAccess.getSystemColorsAccess().getRedEnumLiteralDeclaration_2()); }
)

    |(
{ before(grammarAccess.getSystemColorsAccess().getGreenEnumLiteralDeclaration_3()); }
(	'green' 
)
{ after(grammarAccess.getSystemColorsAccess().getGreenEnumLiteralDeclaration_3()); }
)

    |(
{ before(grammarAccess.getSystemColorsAccess().getYellowEnumLiteralDeclaration_4()); }
(	'yellow' 
)
{ after(grammarAccess.getSystemColorsAccess().getYellowEnumLiteralDeclaration_4()); }
)

    |(
{ before(grammarAccess.getSystemColorsAccess().getPurpleEnumLiteralDeclaration_5()); }
(	'purple' 
)
{ after(grammarAccess.getSystemColorsAccess().getPurpleEnumLiteralDeclaration_5()); }
)

    |(
{ before(grammarAccess.getSystemColorsAccess().getOrangeEnumLiteralDeclaration_6()); }
(	'orange' 
)
{ after(grammarAccess.getSystemColorsAccess().getOrangeEnumLiteralDeclaration_6()); }
)

    |(
{ before(grammarAccess.getSystemColorsAccess().getChocolateEnumLiteralDeclaration_7()); }
(	'chocolate' 
)
{ after(grammarAccess.getSystemColorsAccess().getChocolateEnumLiteralDeclaration_7()); }
)

    |(
{ before(grammarAccess.getSystemColorsAccess().getGrayEnumLiteralDeclaration_8()); }
(	'gray' 
)
{ after(grammarAccess.getSystemColorsAccess().getGrayEnumLiteralDeclaration_8()); }
)

    |(
{ before(grammarAccess.getSystemColorsAccess().getWhiteEnumLiteralDeclaration_9()); }
(	'white' 
)
{ after(grammarAccess.getSystemColorsAccess().getWhiteEnumLiteralDeclaration_9()); }
)

    |(
{ before(grammarAccess.getSystemColorsAccess().getDark_blueEnumLiteralDeclaration_10()); }
(	'dark_blue' 
)
{ after(grammarAccess.getSystemColorsAccess().getDark_blueEnumLiteralDeclaration_10()); }
)

    |(
{ before(grammarAccess.getSystemColorsAccess().getDark_redEnumLiteralDeclaration_11()); }
(	'dark_red' 
)
{ after(grammarAccess.getSystemColorsAccess().getDark_redEnumLiteralDeclaration_11()); }
)

    |(
{ before(grammarAccess.getSystemColorsAccess().getDark_greenEnumLiteralDeclaration_12()); }
(	'dark_green' 
)
{ after(grammarAccess.getSystemColorsAccess().getDark_greenEnumLiteralDeclaration_12()); }
)

    |(
{ before(grammarAccess.getSystemColorsAccess().getDark_yellowEnumLiteralDeclaration_13()); }
(	'dark_yellow' 
)
{ after(grammarAccess.getSystemColorsAccess().getDark_yellowEnumLiteralDeclaration_13()); }
)

    |(
{ before(grammarAccess.getSystemColorsAccess().getDark_purpleEnumLiteralDeclaration_14()); }
(	'dark_purple' 
)
{ after(grammarAccess.getSystemColorsAccess().getDark_purpleEnumLiteralDeclaration_14()); }
)

    |(
{ before(grammarAccess.getSystemColorsAccess().getDark_orangeEnumLiteralDeclaration_15()); }
(	'dark_orange' 
)
{ after(grammarAccess.getSystemColorsAccess().getDark_orangeEnumLiteralDeclaration_15()); }
)

    |(
{ before(grammarAccess.getSystemColorsAccess().getDark_chocolateEnumLiteralDeclaration_16()); }
(	'dark_chocolate' 
)
{ after(grammarAccess.getSystemColorsAccess().getDark_chocolateEnumLiteralDeclaration_16()); }
)

    |(
{ before(grammarAccess.getSystemColorsAccess().getDark_grayEnumLiteralDeclaration_17()); }
(	'dark_gray' 
)
{ after(grammarAccess.getSystemColorsAccess().getDark_grayEnumLiteralDeclaration_17()); }
)

    |(
{ before(grammarAccess.getSystemColorsAccess().getLight_blueEnumLiteralDeclaration_18()); }
(	'light_blue' 
)
{ after(grammarAccess.getSystemColorsAccess().getLight_blueEnumLiteralDeclaration_18()); }
)

    |(
{ before(grammarAccess.getSystemColorsAccess().getLight_redEnumLiteralDeclaration_19()); }
(	'light_red' 
)
{ after(grammarAccess.getSystemColorsAccess().getLight_redEnumLiteralDeclaration_19()); }
)

    |(
{ before(grammarAccess.getSystemColorsAccess().getLight_greenEnumLiteralDeclaration_20()); }
(	'light_green' 
)
{ after(grammarAccess.getSystemColorsAccess().getLight_greenEnumLiteralDeclaration_20()); }
)

    |(
{ before(grammarAccess.getSystemColorsAccess().getLight_yellowEnumLiteralDeclaration_21()); }
(	'light_yellow' 
)
{ after(grammarAccess.getSystemColorsAccess().getLight_yellowEnumLiteralDeclaration_21()); }
)

    |(
{ before(grammarAccess.getSystemColorsAccess().getLight_purpleEnumLiteralDeclaration_22()); }
(	'light_purple' 
)
{ after(grammarAccess.getSystemColorsAccess().getLight_purpleEnumLiteralDeclaration_22()); }
)

    |(
{ before(grammarAccess.getSystemColorsAccess().getLight_orangeEnumLiteralDeclaration_23()); }
(	'light_orange' 
)
{ after(grammarAccess.getSystemColorsAccess().getLight_orangeEnumLiteralDeclaration_23()); }
)

    |(
{ before(grammarAccess.getSystemColorsAccess().getLight_chocolateEnumLiteralDeclaration_24()); }
(	'light_chocolate' 
)
{ after(grammarAccess.getSystemColorsAccess().getLight_chocolateEnumLiteralDeclaration_24()); }
)

    |(
{ before(grammarAccess.getSystemColorsAccess().getLight_grayEnumLiteralDeclaration_25()); }
(	'light_gray' 
)
{ after(grammarAccess.getSystemColorsAccess().getLight_grayEnumLiteralDeclaration_25()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__ContainerLayout__Alternatives
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getContainerLayoutAccess().getFreeFormEnumLiteralDeclaration_0()); }
(	'FreeForm' 
)
{ after(grammarAccess.getContainerLayoutAccess().getFreeFormEnumLiteralDeclaration_0()); }
)

    |(
{ before(grammarAccess.getContainerLayoutAccess().getListEnumLiteralDeclaration_1()); }
(	'List' 
)
{ after(grammarAccess.getContainerLayoutAccess().getListEnumLiteralDeclaration_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}



rule__Diagrams__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Diagrams__Group__0__Impl
	rule__Diagrams__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Diagrams__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getDiagramsAccess().getDiagramsAction_0()); }
(

)
{ after(grammarAccess.getDiagramsAccess().getDiagramsAction_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Diagrams__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Diagrams__Group__1__Impl
	rule__Diagrams__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Diagrams__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getDiagramsAccess().getImportsAssignment_1()); }
(rule__Diagrams__ImportsAssignment_1)*
{ after(grammarAccess.getDiagramsAccess().getImportsAssignment_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Diagrams__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Diagrams__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Diagrams__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getDiagramsAccess().getDiagramsAssignment_2()); }
(rule__Diagrams__DiagramsAssignment_2)
{ after(grammarAccess.getDiagramsAccess().getDiagramsAssignment_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}








rule__ImportNameSpace__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__ImportNameSpace__Group__0__Impl
	rule__ImportNameSpace__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ImportNameSpace__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getImportNameSpaceAccess().getImportKeyword_0()); }

	'import' 

{ after(grammarAccess.getImportNameSpaceAccess().getImportKeyword_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__ImportNameSpace__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__ImportNameSpace__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ImportNameSpace__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getImportNameSpaceAccess().getImportedNamespaceAssignment_1()); }
(rule__ImportNameSpace__ImportedNamespaceAssignment_1)
{ after(grammarAccess.getImportNameSpaceAccess().getImportedNamespaceAssignment_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__ImportGroup__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__ImportGroup__Group__0__Impl
	rule__ImportGroup__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ImportGroup__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getImportGroupAccess().getImportKeyword_0()); }

	'import' 

{ after(grammarAccess.getImportGroupAccess().getImportKeyword_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__ImportGroup__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__ImportGroup__Group__1__Impl
	rule__ImportGroup__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__ImportGroup__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getImportGroupAccess().getExternalKeyword_1()); }

	'external' 

{ after(grammarAccess.getImportGroupAccess().getExternalKeyword_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__ImportGroup__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__ImportGroup__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ImportGroup__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getImportGroupAccess().getImportedGroupAssignment_2()); }
(rule__ImportGroup__ImportedGroupAssignment_2)
{ after(grammarAccess.getImportGroupAccess().getImportedGroupAssignment_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}








rule__DiagramSet__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__DiagramSet__Group__0__Impl
	rule__DiagramSet__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__DiagramSet__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getDiagramSetAccess().getDiagramSetAction_0()); }
(

)
{ after(grammarAccess.getDiagramSetAccess().getDiagramSetAction_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__DiagramSet__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__DiagramSet__Group__1__Impl
	rule__DiagramSet__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__DiagramSet__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getDiagramSetAccess().getDiagramsKeyword_1()); }

	'Diagrams' 

{ after(grammarAccess.getDiagramSetAccess().getDiagramsKeyword_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__DiagramSet__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__DiagramSet__Group__2__Impl
	rule__DiagramSet__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__DiagramSet__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getDiagramSetAccess().getNameAssignment_2()); }
(rule__DiagramSet__NameAssignment_2)
{ after(grammarAccess.getDiagramSetAccess().getNameAssignment_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__DiagramSet__Group__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__DiagramSet__Group__3__Impl
	rule__DiagramSet__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__DiagramSet__Group__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getDiagramSetAccess().getLeftCurlyBracketKeyword_3()); }

	'{' 

{ after(grammarAccess.getDiagramSetAccess().getLeftCurlyBracketKeyword_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__DiagramSet__Group__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__DiagramSet__Group__4__Impl
	rule__DiagramSet__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__DiagramSet__Group__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getDiagramSetAccess().getDiagramsAssignment_4()); }
(rule__DiagramSet__DiagramsAssignment_4)*
{ after(grammarAccess.getDiagramSetAccess().getDiagramsAssignment_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__DiagramSet__Group__5
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__DiagramSet__Group__5__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__DiagramSet__Group__5__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getDiagramSetAccess().getRightCurlyBracketKeyword_5()); }

	'}' 

{ after(grammarAccess.getDiagramSetAccess().getRightCurlyBracketKeyword_5()); }
)

;
finally {
	restoreStackSize(stackSize);
}














rule__Diagram__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Diagram__Group__0__Impl
	rule__Diagram__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Diagram__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getDiagramAccess().getDiagramAction_0()); }
(

)
{ after(grammarAccess.getDiagramAccess().getDiagramAction_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Diagram__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Diagram__Group__1__Impl
	rule__Diagram__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Diagram__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getDiagramAccess().getDiagramKeyword_1()); }

	'Diagram' 

{ after(grammarAccess.getDiagramAccess().getDiagramKeyword_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Diagram__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Diagram__Group__2__Impl
	rule__Diagram__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Diagram__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getDiagramAccess().getNameAssignment_2()); }
(rule__Diagram__NameAssignment_2)
{ after(grammarAccess.getDiagramAccess().getNameAssignment_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Diagram__Group__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Diagram__Group__3__Impl
	rule__Diagram__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__Diagram__Group__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getDiagramAccess().getLeftCurlyBracketKeyword_3()); }

	'{' 

{ after(grammarAccess.getDiagramAccess().getLeftCurlyBracketKeyword_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Diagram__Group__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Diagram__Group__4__Impl
	rule__Diagram__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__Diagram__Group__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getDiagramAccess().getGroup_4()); }
(rule__Diagram__Group_4__0)?
{ after(grammarAccess.getDiagramAccess().getGroup_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Diagram__Group__5
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Diagram__Group__5__Impl
	rule__Diagram__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__Diagram__Group__5__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getDiagramAccess().getThe_domainAssignment_5()); }
(rule__Diagram__The_domainAssignment_5)
{ after(grammarAccess.getDiagramAccess().getThe_domainAssignment_5()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Diagram__Group__6
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Diagram__Group__6__Impl
	rule__Diagram__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__Diagram__Group__6__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getDiagramAccess().getThe_MappingSetAssignment_6()); }
(rule__Diagram__The_MappingSetAssignment_6)?
{ after(grammarAccess.getDiagramAccess().getThe_MappingSetAssignment_6()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Diagram__Group__7
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Diagram__Group__7__Impl
	rule__Diagram__Group__8
;
finally {
	restoreStackSize(stackSize);
}

rule__Diagram__Group__7__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getDiagramAccess().getThe_ActionSetAssignment_7()); }
(rule__Diagram__The_ActionSetAssignment_7)?
{ after(grammarAccess.getDiagramAccess().getThe_ActionSetAssignment_7()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Diagram__Group__8
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Diagram__Group__8__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Diagram__Group__8__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getDiagramAccess().getRightCurlyBracketKeyword_8()); }

	'}' 

{ after(grammarAccess.getDiagramAccess().getRightCurlyBracketKeyword_8()); }
)

;
finally {
	restoreStackSize(stackSize);
}




















rule__Diagram__Group_4__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Diagram__Group_4__0__Impl
	rule__Diagram__Group_4__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Diagram__Group_4__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getDiagramAccess().getDescriptionKeyword_4_0()); }

	'description:' 

{ after(grammarAccess.getDiagramAccess().getDescriptionKeyword_4_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Diagram__Group_4__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Diagram__Group_4__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Diagram__Group_4__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getDiagramAccess().getDescriptionAssignment_4_1()); }
(rule__Diagram__DescriptionAssignment_4_1)
{ after(grammarAccess.getDiagramAccess().getDescriptionAssignment_4_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__DiagramExtension__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__DiagramExtension__Group__0__Impl
	rule__DiagramExtension__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__DiagramExtension__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getDiagramExtensionAccess().getDiagramExtensionAction_0()); }
(

)
{ after(grammarAccess.getDiagramExtensionAccess().getDiagramExtensionAction_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__DiagramExtension__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__DiagramExtension__Group__1__Impl
	rule__DiagramExtension__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__DiagramExtension__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getDiagramExtensionAccess().getDiagramExtensionKeyword_1()); }

	'DiagramExtension' 

{ after(grammarAccess.getDiagramExtensionAccess().getDiagramExtensionKeyword_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__DiagramExtension__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__DiagramExtension__Group__2__Impl
	rule__DiagramExtension__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__DiagramExtension__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getDiagramExtensionAccess().getNameAssignment_2()); }
(rule__DiagramExtension__NameAssignment_2)
{ after(grammarAccess.getDiagramExtensionAccess().getNameAssignment_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__DiagramExtension__Group__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__DiagramExtension__Group__3__Impl
	rule__DiagramExtension__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__DiagramExtension__Group__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getDiagramExtensionAccess().getLeftCurlyBracketKeyword_3()); }

	'{' 

{ after(grammarAccess.getDiagramExtensionAccess().getLeftCurlyBracketKeyword_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__DiagramExtension__Group__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__DiagramExtension__Group__4__Impl
	rule__DiagramExtension__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__DiagramExtension__Group__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getDiagramExtensionAccess().getGroup_4()); }
(rule__DiagramExtension__Group_4__0)?
{ after(grammarAccess.getDiagramExtensionAccess().getGroup_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__DiagramExtension__Group__5
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__DiagramExtension__Group__5__Impl
	rule__DiagramExtension__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__DiagramExtension__Group__5__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getDiagramExtensionAccess().getThe_MappingSetAssignment_5()); }
(rule__DiagramExtension__The_MappingSetAssignment_5)?
{ after(grammarAccess.getDiagramExtensionAccess().getThe_MappingSetAssignment_5()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__DiagramExtension__Group__6
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__DiagramExtension__Group__6__Impl
	rule__DiagramExtension__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__DiagramExtension__Group__6__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getDiagramExtensionAccess().getThe_ActionSetAssignment_6()); }
(rule__DiagramExtension__The_ActionSetAssignment_6)?
{ after(grammarAccess.getDiagramExtensionAccess().getThe_ActionSetAssignment_6()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__DiagramExtension__Group__7
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__DiagramExtension__Group__7__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__DiagramExtension__Group__7__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getDiagramExtensionAccess().getRightCurlyBracketKeyword_7()); }

	'}' 

{ after(grammarAccess.getDiagramExtensionAccess().getRightCurlyBracketKeyword_7()); }
)

;
finally {
	restoreStackSize(stackSize);
}


















rule__DiagramExtension__Group_4__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__DiagramExtension__Group_4__0__Impl
	rule__DiagramExtension__Group_4__1
;
finally {
	restoreStackSize(stackSize);
}

rule__DiagramExtension__Group_4__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getDiagramExtensionAccess().getExtendedDiagramKeyword_4_0()); }

	'extended-diagram:' 

{ after(grammarAccess.getDiagramExtensionAccess().getExtendedDiagramKeyword_4_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__DiagramExtension__Group_4__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__DiagramExtension__Group_4__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__DiagramExtension__Group_4__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getDiagramExtensionAccess().getExtented_diagramAssignment_4_1()); }
(rule__DiagramExtension__Extented_diagramAssignment_4_1)
{ after(grammarAccess.getDiagramExtensionAccess().getExtented_diagramAssignment_4_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__MappingSet__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MappingSet__Group__0__Impl
	rule__MappingSet__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MappingSet__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMappingSetAccess().getMappingSetAction_0()); }
(

)
{ after(grammarAccess.getMappingSetAccess().getMappingSetAction_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MappingSet__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MappingSet__Group__1__Impl
	rule__MappingSet__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__MappingSet__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMappingSetAccess().getMappingKeyword_1()); }

	'Mapping' 

{ after(grammarAccess.getMappingSetAccess().getMappingKeyword_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MappingSet__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MappingSet__Group__2__Impl
	rule__MappingSet__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__MappingSet__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMappingSetAccess().getLeftCurlyBracketKeyword_2()); }

	'{' 

{ after(grammarAccess.getMappingSetAccess().getLeftCurlyBracketKeyword_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MappingSet__Group__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MappingSet__Group__3__Impl
	rule__MappingSet__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__MappingSet__Group__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMappingSetAccess().getDiagram_ElementsAssignment_3()); }
(rule__MappingSet__Diagram_ElementsAssignment_3)*
{ after(grammarAccess.getMappingSetAccess().getDiagram_ElementsAssignment_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MappingSet__Group__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MappingSet__Group__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MappingSet__Group__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMappingSetAccess().getRightCurlyBracketKeyword_4()); }

	'}' 

{ after(grammarAccess.getMappingSetAccess().getRightCurlyBracketKeyword_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}












rule__EdgeDescription__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__EdgeDescription__Group__0__Impl
	rule__EdgeDescription__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__EdgeDescription__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getEdgeDescriptionAccess().getEdgeDescriptionAction_0()); }
(

)
{ after(grammarAccess.getEdgeDescriptionAccess().getEdgeDescriptionAction_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__EdgeDescription__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__EdgeDescription__Group__1__Impl
	rule__EdgeDescription__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__EdgeDescription__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getEdgeDescriptionAccess().getRepresentationKeyword_1()); }

	'Representation' 

{ after(grammarAccess.getEdgeDescriptionAccess().getRepresentationKeyword_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__EdgeDescription__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__EdgeDescription__Group__2__Impl
	rule__EdgeDescription__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__EdgeDescription__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getEdgeDescriptionAccess().getLeftCurlyBracketKeyword_2()); }

	'{' 

{ after(grammarAccess.getEdgeDescriptionAccess().getLeftCurlyBracketKeyword_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__EdgeDescription__Group__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__EdgeDescription__Group__3__Impl
	rule__EdgeDescription__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__EdgeDescription__Group__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getEdgeDescriptionAccess().getConditionAssignment_3()); }
(rule__EdgeDescription__ConditionAssignment_3)?
{ after(grammarAccess.getEdgeDescriptionAccess().getConditionAssignment_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__EdgeDescription__Group__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__EdgeDescription__Group__4__Impl
	rule__EdgeDescription__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__EdgeDescription__Group__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getEdgeDescriptionAccess().getGroup_4()); }
(rule__EdgeDescription__Group_4__0)?
{ after(grammarAccess.getEdgeDescriptionAccess().getGroup_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__EdgeDescription__Group__5
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__EdgeDescription__Group__5__Impl
	rule__EdgeDescription__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__EdgeDescription__Group__5__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getEdgeDescriptionAccess().getGroup_5()); }
(rule__EdgeDescription__Group_5__0)?
{ after(grammarAccess.getEdgeDescriptionAccess().getGroup_5()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__EdgeDescription__Group__6
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__EdgeDescription__Group__6__Impl
	rule__EdgeDescription__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__EdgeDescription__Group__6__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getEdgeDescriptionAccess().getGroup_6()); }
(rule__EdgeDescription__Group_6__0)?
{ after(grammarAccess.getEdgeDescriptionAccess().getGroup_6()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__EdgeDescription__Group__7
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__EdgeDescription__Group__7__Impl
	rule__EdgeDescription__Group__8
;
finally {
	restoreStackSize(stackSize);
}

rule__EdgeDescription__Group__7__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getEdgeDescriptionAccess().getStyleAssignment_7()); }
(rule__EdgeDescription__StyleAssignment_7)?
{ after(grammarAccess.getEdgeDescriptionAccess().getStyleAssignment_7()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__EdgeDescription__Group__8
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__EdgeDescription__Group__8__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__EdgeDescription__Group__8__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getEdgeDescriptionAccess().getRightCurlyBracketKeyword_8()); }

	'}' 

{ after(grammarAccess.getEdgeDescriptionAccess().getRightCurlyBracketKeyword_8()); }
)

;
finally {
	restoreStackSize(stackSize);
}




















rule__EdgeDescription__Group_4__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__EdgeDescription__Group_4__0__Impl
	rule__EdgeDescription__Group_4__1
;
finally {
	restoreStackSize(stackSize);
}

rule__EdgeDescription__Group_4__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getEdgeDescriptionAccess().getBeginLabelKeyword_4_0()); }

	'BeginLabel' 

{ after(grammarAccess.getEdgeDescriptionAccess().getBeginLabelKeyword_4_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__EdgeDescription__Group_4__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__EdgeDescription__Group_4__1__Impl
	rule__EdgeDescription__Group_4__2
;
finally {
	restoreStackSize(stackSize);
}

rule__EdgeDescription__Group_4__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getEdgeDescriptionAccess().getLeftCurlyBracketKeyword_4_1()); }

	'{' 

{ after(grammarAccess.getEdgeDescriptionAccess().getLeftCurlyBracketKeyword_4_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__EdgeDescription__Group_4__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__EdgeDescription__Group_4__2__Impl
	rule__EdgeDescription__Group_4__3
;
finally {
	restoreStackSize(stackSize);
}

rule__EdgeDescription__Group_4__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getEdgeDescriptionAccess().getBegin_LabelAssignment_4_2()); }
(rule__EdgeDescription__Begin_LabelAssignment_4_2)
{ after(grammarAccess.getEdgeDescriptionAccess().getBegin_LabelAssignment_4_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__EdgeDescription__Group_4__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__EdgeDescription__Group_4__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__EdgeDescription__Group_4__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getEdgeDescriptionAccess().getRightCurlyBracketKeyword_4_3()); }

	'}' 

{ after(grammarAccess.getEdgeDescriptionAccess().getRightCurlyBracketKeyword_4_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}










rule__EdgeDescription__Group_5__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__EdgeDescription__Group_5__0__Impl
	rule__EdgeDescription__Group_5__1
;
finally {
	restoreStackSize(stackSize);
}

rule__EdgeDescription__Group_5__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getEdgeDescriptionAccess().getCenterLabelKeyword_5_0()); }

	'CenterLabel' 

{ after(grammarAccess.getEdgeDescriptionAccess().getCenterLabelKeyword_5_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__EdgeDescription__Group_5__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__EdgeDescription__Group_5__1__Impl
	rule__EdgeDescription__Group_5__2
;
finally {
	restoreStackSize(stackSize);
}

rule__EdgeDescription__Group_5__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getEdgeDescriptionAccess().getLeftCurlyBracketKeyword_5_1()); }

	'{' 

{ after(grammarAccess.getEdgeDescriptionAccess().getLeftCurlyBracketKeyword_5_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__EdgeDescription__Group_5__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__EdgeDescription__Group_5__2__Impl
	rule__EdgeDescription__Group_5__3
;
finally {
	restoreStackSize(stackSize);
}

rule__EdgeDescription__Group_5__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getEdgeDescriptionAccess().getCenter_labelAssignment_5_2()); }
(rule__EdgeDescription__Center_labelAssignment_5_2)
{ after(grammarAccess.getEdgeDescriptionAccess().getCenter_labelAssignment_5_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__EdgeDescription__Group_5__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__EdgeDescription__Group_5__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__EdgeDescription__Group_5__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getEdgeDescriptionAccess().getRightCurlyBracketKeyword_5_3()); }

	'}' 

{ after(grammarAccess.getEdgeDescriptionAccess().getRightCurlyBracketKeyword_5_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}










rule__EdgeDescription__Group_6__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__EdgeDescription__Group_6__0__Impl
	rule__EdgeDescription__Group_6__1
;
finally {
	restoreStackSize(stackSize);
}

rule__EdgeDescription__Group_6__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getEdgeDescriptionAccess().getEndLabelKeyword_6_0()); }

	'EndLabel' 

{ after(grammarAccess.getEdgeDescriptionAccess().getEndLabelKeyword_6_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__EdgeDescription__Group_6__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__EdgeDescription__Group_6__1__Impl
	rule__EdgeDescription__Group_6__2
;
finally {
	restoreStackSize(stackSize);
}

rule__EdgeDescription__Group_6__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getEdgeDescriptionAccess().getLeftCurlyBracketKeyword_6_1()); }

	'{' 

{ after(grammarAccess.getEdgeDescriptionAccess().getLeftCurlyBracketKeyword_6_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__EdgeDescription__Group_6__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__EdgeDescription__Group_6__2__Impl
	rule__EdgeDescription__Group_6__3
;
finally {
	restoreStackSize(stackSize);
}

rule__EdgeDescription__Group_6__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getEdgeDescriptionAccess().getEnd_labelAssignment_6_2()); }
(rule__EdgeDescription__End_labelAssignment_6_2)
{ after(grammarAccess.getEdgeDescriptionAccess().getEnd_labelAssignment_6_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__EdgeDescription__Group_6__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__EdgeDescription__Group_6__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__EdgeDescription__Group_6__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getEdgeDescriptionAccess().getRightCurlyBracketKeyword_6_3()); }

	'}' 

{ after(grammarAccess.getEdgeDescriptionAccess().getRightCurlyBracketKeyword_6_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}










rule__Condition__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Condition__Group__0__Impl
	rule__Condition__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Condition__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getConditionAccess().getConditionAction_0()); }
(

)
{ after(grammarAccess.getConditionAccess().getConditionAction_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Condition__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Condition__Group__1__Impl
	rule__Condition__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Condition__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getConditionAccess().getConditionKeyword_1()); }

	'condition:' 

{ after(grammarAccess.getConditionAccess().getConditionKeyword_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Condition__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Condition__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Condition__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getConditionAccess().getExpressionAssignment_2()); }
(rule__Condition__ExpressionAssignment_2)
{ after(grammarAccess.getConditionAccess().getExpressionAssignment_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}








rule__EdgeStyle__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__EdgeStyle__Group__0__Impl
	rule__EdgeStyle__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__EdgeStyle__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getEdgeStyleAccess().getEdgeStyleAction_0()); }
(

)
{ after(grammarAccess.getEdgeStyleAccess().getEdgeStyleAction_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__EdgeStyle__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__EdgeStyle__Group__1__Impl
	rule__EdgeStyle__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__EdgeStyle__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getEdgeStyleAccess().getStyleKeyword_1()); }

	'Style' 

{ after(grammarAccess.getEdgeStyleAccess().getStyleKeyword_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__EdgeStyle__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__EdgeStyle__Group__2__Impl
	rule__EdgeStyle__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__EdgeStyle__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getEdgeStyleAccess().getLeftCurlyBracketKeyword_2()); }

	'{' 

{ after(grammarAccess.getEdgeStyleAccess().getLeftCurlyBracketKeyword_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__EdgeStyle__Group__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__EdgeStyle__Group__3__Impl
	rule__EdgeStyle__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__EdgeStyle__Group__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getEdgeStyleAccess().getGroup_3()); }
(rule__EdgeStyle__Group_3__0)?
{ after(grammarAccess.getEdgeStyleAccess().getGroup_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__EdgeStyle__Group__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__EdgeStyle__Group__4__Impl
	rule__EdgeStyle__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__EdgeStyle__Group__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getEdgeStyleAccess().getGroup_4()); }
(rule__EdgeStyle__Group_4__0)?
{ after(grammarAccess.getEdgeStyleAccess().getGroup_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__EdgeStyle__Group__5
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__EdgeStyle__Group__5__Impl
	rule__EdgeStyle__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__EdgeStyle__Group__5__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getEdgeStyleAccess().getGroup_5()); }
(rule__EdgeStyle__Group_5__0)?
{ after(grammarAccess.getEdgeStyleAccess().getGroup_5()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__EdgeStyle__Group__6
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__EdgeStyle__Group__6__Impl
	rule__EdgeStyle__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__EdgeStyle__Group__6__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getEdgeStyleAccess().getGroup_6()); }
(rule__EdgeStyle__Group_6__0)?
{ after(grammarAccess.getEdgeStyleAccess().getGroup_6()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__EdgeStyle__Group__7
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__EdgeStyle__Group__7__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__EdgeStyle__Group__7__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getEdgeStyleAccess().getRightCurlyBracketKeyword_7()); }

	'}' 

{ after(grammarAccess.getEdgeStyleAccess().getRightCurlyBracketKeyword_7()); }
)

;
finally {
	restoreStackSize(stackSize);
}


















rule__EdgeStyle__Group_3__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__EdgeStyle__Group_3__0__Impl
	rule__EdgeStyle__Group_3__1
;
finally {
	restoreStackSize(stackSize);
}

rule__EdgeStyle__Group_3__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getEdgeStyleAccess().getLineStyleKeyword_3_0()); }

	'line-style:' 

{ after(grammarAccess.getEdgeStyleAccess().getLineStyleKeyword_3_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__EdgeStyle__Group_3__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__EdgeStyle__Group_3__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__EdgeStyle__Group_3__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getEdgeStyleAccess().getLineStyleAssignment_3_1()); }
(rule__EdgeStyle__LineStyleAssignment_3_1)
{ after(grammarAccess.getEdgeStyleAccess().getLineStyleAssignment_3_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__EdgeStyle__Group_4__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__EdgeStyle__Group_4__0__Impl
	rule__EdgeStyle__Group_4__1
;
finally {
	restoreStackSize(stackSize);
}

rule__EdgeStyle__Group_4__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getEdgeStyleAccess().getBeginDecoratorKeyword_4_0()); }

	'begin-decorator:' 

{ after(grammarAccess.getEdgeStyleAccess().getBeginDecoratorKeyword_4_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__EdgeStyle__Group_4__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__EdgeStyle__Group_4__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__EdgeStyle__Group_4__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getEdgeStyleAccess().getBeginDecoratorAssignment_4_1()); }
(rule__EdgeStyle__BeginDecoratorAssignment_4_1)
{ after(grammarAccess.getEdgeStyleAccess().getBeginDecoratorAssignment_4_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__EdgeStyle__Group_5__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__EdgeStyle__Group_5__0__Impl
	rule__EdgeStyle__Group_5__1
;
finally {
	restoreStackSize(stackSize);
}

rule__EdgeStyle__Group_5__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getEdgeStyleAccess().getEndDecoratorKeyword_5_0()); }

	'end-decorator:' 

{ after(grammarAccess.getEdgeStyleAccess().getEndDecoratorKeyword_5_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__EdgeStyle__Group_5__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__EdgeStyle__Group_5__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__EdgeStyle__Group_5__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getEdgeStyleAccess().getEndDecoratorAssignment_5_1()); }
(rule__EdgeStyle__EndDecoratorAssignment_5_1)
{ after(grammarAccess.getEdgeStyleAccess().getEndDecoratorAssignment_5_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__EdgeStyle__Group_6__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__EdgeStyle__Group_6__0__Impl
	rule__EdgeStyle__Group_6__1
;
finally {
	restoreStackSize(stackSize);
}

rule__EdgeStyle__Group_6__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getEdgeStyleAccess().getColorKeyword_6_0()); }

	'color:' 

{ after(grammarAccess.getEdgeStyleAccess().getColorKeyword_6_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__EdgeStyle__Group_6__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__EdgeStyle__Group_6__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__EdgeStyle__Group_6__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getEdgeStyleAccess().getColorAssignment_6_1()); }
(rule__EdgeStyle__ColorAssignment_6_1)
{ after(grammarAccess.getEdgeStyleAccess().getColorAssignment_6_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__Container__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Container__Group__0__Impl
	rule__Container__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Container__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getContainerAccess().getContainerAction_0()); }
(

)
{ after(grammarAccess.getContainerAccess().getContainerAction_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Container__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Container__Group__1__Impl
	rule__Container__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Container__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getContainerAccess().getContainerKeyword_1()); }

	'Container' 

{ after(grammarAccess.getContainerAccess().getContainerKeyword_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Container__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Container__Group__2__Impl
	rule__Container__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Container__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getContainerAccess().getNameAssignment_2()); }
(rule__Container__NameAssignment_2)
{ after(grammarAccess.getContainerAccess().getNameAssignment_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Container__Group__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Container__Group__3__Impl
	rule__Container__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__Container__Group__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getContainerAccess().getLeftCurlyBracketKeyword_3()); }

	'{' 

{ after(grammarAccess.getContainerAccess().getLeftCurlyBracketKeyword_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Container__Group__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Container__Group__4__Impl
	rule__Container__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__Container__Group__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getContainerAccess().getGroup_4()); }
(rule__Container__Group_4__0)?
{ after(grammarAccess.getContainerAccess().getGroup_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Container__Group__5
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Container__Group__5__Impl
	rule__Container__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__Container__Group__5__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getContainerAccess().getGroup_5()); }
(rule__Container__Group_5__0)?
{ after(grammarAccess.getContainerAccess().getGroup_5()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Container__Group__6
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Container__Group__6__Impl
	rule__Container__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__Container__Group__6__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getContainerAccess().getGroup_6()); }
(rule__Container__Group_6__0)?
{ after(grammarAccess.getContainerAccess().getGroup_6()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Container__Group__7
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Container__Group__7__Impl
	rule__Container__Group__8
;
finally {
	restoreStackSize(stackSize);
}

rule__Container__Group__7__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getContainerAccess().getStyleAssignment_7()); }
(rule__Container__StyleAssignment_7)*
{ after(grammarAccess.getContainerAccess().getStyleAssignment_7()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Container__Group__8
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Container__Group__8__Impl
	rule__Container__Group__9
;
finally {
	restoreStackSize(stackSize);
}

rule__Container__Group__8__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getContainerAccess().getChildrenAssignment_8()); }
(rule__Container__ChildrenAssignment_8)?
{ after(grammarAccess.getContainerAccess().getChildrenAssignment_8()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Container__Group__9
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Container__Group__9__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Container__Group__9__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getContainerAccess().getRightCurlyBracketKeyword_9()); }

	'}' 

{ after(grammarAccess.getContainerAccess().getRightCurlyBracketKeyword_9()); }
)

;
finally {
	restoreStackSize(stackSize);
}






















rule__Container__Group_4__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Container__Group_4__0__Impl
	rule__Container__Group_4__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Container__Group_4__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getContainerAccess().getImportKeyword_4_0()); }

	'import:' 

{ after(grammarAccess.getContainerAccess().getImportKeyword_4_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Container__Group_4__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Container__Group_4__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Container__Group_4__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getContainerAccess().getImportsAssignment_4_1()); }
(rule__Container__ImportsAssignment_4_1)
{ after(grammarAccess.getContainerAccess().getImportsAssignment_4_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__Container__Group_5__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Container__Group_5__0__Impl
	rule__Container__Group_5__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Container__Group_5__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getContainerAccess().getDomainContextKeyword_5_0()); }

	'domain-context:' 

{ after(grammarAccess.getContainerAccess().getDomainContextKeyword_5_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Container__Group_5__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Container__Group_5__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Container__Group_5__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getContainerAccess().getThe_domainAssignment_5_1()); }
(rule__Container__The_domainAssignment_5_1)
{ after(grammarAccess.getContainerAccess().getThe_domainAssignment_5_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__Container__Group_6__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Container__Group_6__0__Impl
	rule__Container__Group_6__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Container__Group_6__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getContainerAccess().getContentLayoutKeyword_6_0()); }

	'content-layout:' 

{ after(grammarAccess.getContainerAccess().getContentLayoutKeyword_6_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Container__Group_6__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Container__Group_6__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Container__Group_6__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getContainerAccess().getContentLayoutAssignment_6_1()); }
(rule__Container__ContentLayoutAssignment_6_1)
{ after(grammarAccess.getContainerAccess().getContentLayoutAssignment_6_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__ContainerChildren__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__ContainerChildren__Group__0__Impl
	rule__ContainerChildren__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ContainerChildren__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getContainerChildrenAccess().getContainerChildrenAction_0()); }
(

)
{ after(grammarAccess.getContainerChildrenAccess().getContainerChildrenAction_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__ContainerChildren__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__ContainerChildren__Group__1__Impl
	rule__ContainerChildren__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__ContainerChildren__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getContainerChildrenAccess().getContainsKeyword_1()); }

	'Contains' 

{ after(grammarAccess.getContainerChildrenAccess().getContainsKeyword_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__ContainerChildren__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__ContainerChildren__Group__2__Impl
	rule__ContainerChildren__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__ContainerChildren__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getContainerChildrenAccess().getLeftCurlyBracketKeyword_2()); }

	'{' 

{ after(grammarAccess.getContainerChildrenAccess().getLeftCurlyBracketKeyword_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__ContainerChildren__Group__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__ContainerChildren__Group__3__Impl
	rule__ContainerChildren__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__ContainerChildren__Group__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getContainerChildrenAccess().getGroup_3()); }
(rule__ContainerChildren__Group_3__0)?
{ after(grammarAccess.getContainerChildrenAccess().getGroup_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__ContainerChildren__Group__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__ContainerChildren__Group__4__Impl
	rule__ContainerChildren__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__ContainerChildren__Group__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getContainerChildrenAccess().getOwned_nodesAssignment_4()); }
(rule__ContainerChildren__Owned_nodesAssignment_4)*
{ after(grammarAccess.getContainerChildrenAccess().getOwned_nodesAssignment_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__ContainerChildren__Group__5
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__ContainerChildren__Group__5__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ContainerChildren__Group__5__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getContainerChildrenAccess().getRightCurlyBracketKeyword_5()); }

	'}' 

{ after(grammarAccess.getContainerChildrenAccess().getRightCurlyBracketKeyword_5()); }
)

;
finally {
	restoreStackSize(stackSize);
}














rule__ContainerChildren__Group_3__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__ContainerChildren__Group_3__0__Impl
	rule__ContainerChildren__Group_3__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ContainerChildren__Group_3__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getContainerChildrenAccess().getReuseKeyword_3_0()); }

	'reuse' 

{ after(grammarAccess.getContainerChildrenAccess().getReuseKeyword_3_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__ContainerChildren__Group_3__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__ContainerChildren__Group_3__1__Impl
	rule__ContainerChildren__Group_3__2
;
finally {
	restoreStackSize(stackSize);
}

rule__ContainerChildren__Group_3__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getContainerChildrenAccess().getReused_nodesAssignment_3_1()); }
(rule__ContainerChildren__Reused_nodesAssignment_3_1)
{ after(grammarAccess.getContainerChildrenAccess().getReused_nodesAssignment_3_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__ContainerChildren__Group_3__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__ContainerChildren__Group_3__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ContainerChildren__Group_3__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getContainerChildrenAccess().getGroup_3_2()); }
(rule__ContainerChildren__Group_3_2__0)*
{ after(grammarAccess.getContainerChildrenAccess().getGroup_3_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}








rule__ContainerChildren__Group_3_2__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__ContainerChildren__Group_3_2__0__Impl
	rule__ContainerChildren__Group_3_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ContainerChildren__Group_3_2__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getContainerChildrenAccess().getCommaKeyword_3_2_0()); }

	',' 

{ after(grammarAccess.getContainerChildrenAccess().getCommaKeyword_3_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__ContainerChildren__Group_3_2__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__ContainerChildren__Group_3_2__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ContainerChildren__Group_3_2__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getContainerChildrenAccess().getReused_nodesAssignment_3_2_1()); }
(rule__ContainerChildren__Reused_nodesAssignment_3_2_1)
{ after(grammarAccess.getContainerChildrenAccess().getReused_nodesAssignment_3_2_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__NodeDomainElement__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__NodeDomainElement__Group__0__Impl
	rule__NodeDomainElement__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__NodeDomainElement__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getNodeDomainElementAccess().getNodeDomainElementAction_0()); }
(

)
{ after(grammarAccess.getNodeDomainElementAccess().getNodeDomainElementAction_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__NodeDomainElement__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__NodeDomainElement__Group__1__Impl
	rule__NodeDomainElement__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__NodeDomainElement__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getNodeDomainElementAccess().getDomain_ClassAssignment_1()); }
(rule__NodeDomainElement__Domain_ClassAssignment_1)
{ after(grammarAccess.getNodeDomainElementAccess().getDomain_ClassAssignment_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__NodeDomainElement__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__NodeDomainElement__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__NodeDomainElement__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getNodeDomainElementAccess().getGroup_2()); }
(rule__NodeDomainElement__Group_2__0)?
{ after(grammarAccess.getNodeDomainElementAccess().getGroup_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}








rule__NodeDomainElement__Group_2__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__NodeDomainElement__Group_2__0__Impl
	rule__NodeDomainElement__Group_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__NodeDomainElement__Group_2__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getNodeDomainElementAccess().getProvidedByKeyword_2_0()); }

	'provided-by' 

{ after(grammarAccess.getNodeDomainElementAccess().getProvidedByKeyword_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__NodeDomainElement__Group_2__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__NodeDomainElement__Group_2__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__NodeDomainElement__Group_2__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getNodeDomainElementAccess().getAlternatives_2_1()); }
(rule__NodeDomainElement__Alternatives_2_1)
{ after(grammarAccess.getNodeDomainElementAccess().getAlternatives_2_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__NodeDomainElement__Group_2_1_0__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__NodeDomainElement__Group_2_1_0__0__Impl
	rule__NodeDomainElement__Group_2_1_0__1
;
finally {
	restoreStackSize(stackSize);
}

rule__NodeDomainElement__Group_2_1_0__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getNodeDomainElementAccess().getQueryKeyword_2_1_0_0()); }

	'query' 

{ after(grammarAccess.getNodeDomainElementAccess().getQueryKeyword_2_1_0_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__NodeDomainElement__Group_2_1_0__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__NodeDomainElement__Group_2_1_0__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__NodeDomainElement__Group_2_1_0__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getNodeDomainElementAccess().getQueryAssignment_2_1_0_1()); }
(rule__NodeDomainElement__QueryAssignment_2_1_0_1)
{ after(grammarAccess.getNodeDomainElementAccess().getQueryAssignment_2_1_0_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__NodeDomainElement__Group_2_1_1__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__NodeDomainElement__Group_2_1_1__0__Impl
	rule__NodeDomainElement__Group_2_1_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__NodeDomainElement__Group_2_1_1__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getNodeDomainElementAccess().getAssociationKeyword_2_1_1_0()); }

	'association' 

{ after(grammarAccess.getNodeDomainElementAccess().getAssociationKeyword_2_1_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__NodeDomainElement__Group_2_1_1__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__NodeDomainElement__Group_2_1_1__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__NodeDomainElement__Group_2_1_1__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getNodeDomainElementAccess().getChlidren_listAssignment_2_1_1_1()); }
(rule__NodeDomainElement__Chlidren_listAssignment_2_1_1_1)
{ after(grammarAccess.getNodeDomainElementAccess().getChlidren_listAssignment_2_1_1_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__ContainerDescription__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__ContainerDescription__Group__0__Impl
	rule__ContainerDescription__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ContainerDescription__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getContainerDescriptionAccess().getContainerDescriptionAction_0()); }
(

)
{ after(grammarAccess.getContainerDescriptionAccess().getContainerDescriptionAction_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__ContainerDescription__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__ContainerDescription__Group__1__Impl
	rule__ContainerDescription__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__ContainerDescription__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getContainerDescriptionAccess().getRepresentationKeyword_1()); }

	'Representation' 

{ after(grammarAccess.getContainerDescriptionAccess().getRepresentationKeyword_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__ContainerDescription__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__ContainerDescription__Group__2__Impl
	rule__ContainerDescription__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__ContainerDescription__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getContainerDescriptionAccess().getLeftCurlyBracketKeyword_2()); }

	'{' 

{ after(grammarAccess.getContainerDescriptionAccess().getLeftCurlyBracketKeyword_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__ContainerDescription__Group__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__ContainerDescription__Group__3__Impl
	rule__ContainerDescription__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__ContainerDescription__Group__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getContainerDescriptionAccess().getConditionAssignment_3()); }
(rule__ContainerDescription__ConditionAssignment_3)?
{ after(grammarAccess.getContainerDescriptionAccess().getConditionAssignment_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__ContainerDescription__Group__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__ContainerDescription__Group__4__Impl
	rule__ContainerDescription__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__ContainerDescription__Group__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getContainerDescriptionAccess().getGroup_4()); }
(rule__ContainerDescription__Group_4__0)?
{ after(grammarAccess.getContainerDescriptionAccess().getGroup_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__ContainerDescription__Group__5
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__ContainerDescription__Group__5__Impl
	rule__ContainerDescription__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__ContainerDescription__Group__5__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getContainerDescriptionAccess().getGroup_5()); }
(rule__ContainerDescription__Group_5__0)?
{ after(grammarAccess.getContainerDescriptionAccess().getGroup_5()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__ContainerDescription__Group__6
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__ContainerDescription__Group__6__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ContainerDescription__Group__6__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getContainerDescriptionAccess().getRightCurlyBracketKeyword_6()); }

	'}' 

{ after(grammarAccess.getContainerDescriptionAccess().getRightCurlyBracketKeyword_6()); }
)

;
finally {
	restoreStackSize(stackSize);
}
















rule__ContainerDescription__Group_4__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__ContainerDescription__Group_4__0__Impl
	rule__ContainerDescription__Group_4__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ContainerDescription__Group_4__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getContainerDescriptionAccess().getLabelKeyword_4_0()); }

	'Label' 

{ after(grammarAccess.getContainerDescriptionAccess().getLabelKeyword_4_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__ContainerDescription__Group_4__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__ContainerDescription__Group_4__1__Impl
	rule__ContainerDescription__Group_4__2
;
finally {
	restoreStackSize(stackSize);
}

rule__ContainerDescription__Group_4__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getContainerDescriptionAccess().getLeftCurlyBracketKeyword_4_1()); }

	'{' 

{ after(grammarAccess.getContainerDescriptionAccess().getLeftCurlyBracketKeyword_4_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__ContainerDescription__Group_4__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__ContainerDescription__Group_4__2__Impl
	rule__ContainerDescription__Group_4__3
;
finally {
	restoreStackSize(stackSize);
}

rule__ContainerDescription__Group_4__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getContainerDescriptionAccess().getNode_LabelAssignment_4_2()); }
(rule__ContainerDescription__Node_LabelAssignment_4_2)
{ after(grammarAccess.getContainerDescriptionAccess().getNode_LabelAssignment_4_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__ContainerDescription__Group_4__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__ContainerDescription__Group_4__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ContainerDescription__Group_4__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getContainerDescriptionAccess().getRightCurlyBracketKeyword_4_3()); }

	'}' 

{ after(grammarAccess.getContainerDescriptionAccess().getRightCurlyBracketKeyword_4_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}










rule__ContainerDescription__Group_5__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__ContainerDescription__Group_5__0__Impl
	rule__ContainerDescription__Group_5__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ContainerDescription__Group_5__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getContainerDescriptionAccess().getStyleKeyword_5_0()); }

	'Style' 

{ after(grammarAccess.getContainerDescriptionAccess().getStyleKeyword_5_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__ContainerDescription__Group_5__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__ContainerDescription__Group_5__1__Impl
	rule__ContainerDescription__Group_5__2
;
finally {
	restoreStackSize(stackSize);
}

rule__ContainerDescription__Group_5__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getContainerDescriptionAccess().getLeftCurlyBracketKeyword_5_1()); }
(
	'{' 
)
{ after(grammarAccess.getContainerDescriptionAccess().getLeftCurlyBracketKeyword_5_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__ContainerDescription__Group_5__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__ContainerDescription__Group_5__2__Impl
	rule__ContainerDescription__Group_5__3
;
finally {
	restoreStackSize(stackSize);
}

rule__ContainerDescription__Group_5__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getContainerDescriptionAccess().getStyleAssignment_5_2()); }
(rule__ContainerDescription__StyleAssignment_5_2)
{ after(grammarAccess.getContainerDescriptionAccess().getStyleAssignment_5_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__ContainerDescription__Group_5__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__ContainerDescription__Group_5__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ContainerDescription__Group_5__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getContainerDescriptionAccess().getRightCurlyBracketKeyword_5_3()); }

	'}' 

{ after(grammarAccess.getContainerDescriptionAccess().getRightCurlyBracketKeyword_5_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}










rule__BasicStyle__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__BasicStyle__Group__0__Impl
	rule__BasicStyle__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__BasicStyle__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getBasicStyleAccess().getBasicStyleAction_0()); }
(

)
{ after(grammarAccess.getBasicStyleAccess().getBasicStyleAction_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__BasicStyle__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__BasicStyle__Group__1__Impl
	rule__BasicStyle__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__BasicStyle__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getBasicStyleAccess().getBasicStyleKeyword_1()); }

	'BasicStyle' 

{ after(grammarAccess.getBasicStyleAccess().getBasicStyleKeyword_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__BasicStyle__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__BasicStyle__Group__2__Impl
	rule__BasicStyle__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__BasicStyle__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getBasicStyleAccess().getLeftCurlyBracketKeyword_2()); }

	'{' 

{ after(grammarAccess.getBasicStyleAccess().getLeftCurlyBracketKeyword_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__BasicStyle__Group__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__BasicStyle__Group__3__Impl
	rule__BasicStyle__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__BasicStyle__Group__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getBasicStyleAccess().getGroup_3()); }
(rule__BasicStyle__Group_3__0)?
{ after(grammarAccess.getBasicStyleAccess().getGroup_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__BasicStyle__Group__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__BasicStyle__Group__4__Impl
	rule__BasicStyle__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__BasicStyle__Group__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getBasicStyleAccess().getGroup_4()); }
(rule__BasicStyle__Group_4__0)?
{ after(grammarAccess.getBasicStyleAccess().getGroup_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__BasicStyle__Group__5
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__BasicStyle__Group__5__Impl
	rule__BasicStyle__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__BasicStyle__Group__5__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getBasicStyleAccess().getGroup_5()); }
(rule__BasicStyle__Group_5__0)?
{ after(grammarAccess.getBasicStyleAccess().getGroup_5()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__BasicStyle__Group__6
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__BasicStyle__Group__6__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__BasicStyle__Group__6__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getBasicStyleAccess().getRightCurlyBracketKeyword_6()); }

	'}' 

{ after(grammarAccess.getBasicStyleAccess().getRightCurlyBracketKeyword_6()); }
)

;
finally {
	restoreStackSize(stackSize);
}
















rule__BasicStyle__Group_3__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__BasicStyle__Group_3__0__Impl
	rule__BasicStyle__Group_3__1
;
finally {
	restoreStackSize(stackSize);
}

rule__BasicStyle__Group_3__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getBasicStyleAccess().getBorderColorKeyword_3_0()); }

	'border-color:' 

{ after(grammarAccess.getBasicStyleAccess().getBorderColorKeyword_3_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__BasicStyle__Group_3__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__BasicStyle__Group_3__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__BasicStyle__Group_3__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getBasicStyleAccess().getBorderColorAssignment_3_1()); }
(rule__BasicStyle__BorderColorAssignment_3_1)
{ after(grammarAccess.getBasicStyleAccess().getBorderColorAssignment_3_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__BasicStyle__Group_4__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__BasicStyle__Group_4__0__Impl
	rule__BasicStyle__Group_4__1
;
finally {
	restoreStackSize(stackSize);
}

rule__BasicStyle__Group_4__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getBasicStyleAccess().getBackgroundKeyword_4_0()); }

	'background:' 

{ after(grammarAccess.getBasicStyleAccess().getBackgroundKeyword_4_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__BasicStyle__Group_4__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__BasicStyle__Group_4__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__BasicStyle__Group_4__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getBasicStyleAccess().getBackgroundColorAssignment_4_1()); }
(rule__BasicStyle__BackgroundColorAssignment_4_1)
{ after(grammarAccess.getBasicStyleAccess().getBackgroundColorAssignment_4_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__BasicStyle__Group_5__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__BasicStyle__Group_5__0__Impl
	rule__BasicStyle__Group_5__1
;
finally {
	restoreStackSize(stackSize);
}

rule__BasicStyle__Group_5__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getBasicStyleAccess().getFormKeyword_5_0()); }

	'form:' 

{ after(grammarAccess.getBasicStyleAccess().getFormKeyword_5_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__BasicStyle__Group_5__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__BasicStyle__Group_5__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__BasicStyle__Group_5__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getBasicStyleAccess().getFormAssignment_5_1()); }
(rule__BasicStyle__FormAssignment_5_1)
{ after(grammarAccess.getBasicStyleAccess().getFormAssignment_5_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__HistogramStyle__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__HistogramStyle__Group__0__Impl
	rule__HistogramStyle__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__HistogramStyle__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getHistogramStyleAccess().getHistogramStyleAction_0()); }
(

)
{ after(grammarAccess.getHistogramStyleAccess().getHistogramStyleAction_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__HistogramStyle__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__HistogramStyle__Group__1__Impl
	rule__HistogramStyle__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__HistogramStyle__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getHistogramStyleAccess().getHistogramStyleKeyword_1()); }

	'HistogramStyle' 

{ after(grammarAccess.getHistogramStyleAccess().getHistogramStyleKeyword_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__HistogramStyle__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__HistogramStyle__Group__2__Impl
	rule__HistogramStyle__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__HistogramStyle__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getHistogramStyleAccess().getLeftCurlyBracketKeyword_2()); }

	'{' 

{ after(grammarAccess.getHistogramStyleAccess().getLeftCurlyBracketKeyword_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__HistogramStyle__Group__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__HistogramStyle__Group__3__Impl
	rule__HistogramStyle__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__HistogramStyle__Group__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getHistogramStyleAccess().getGroup_3()); }
(rule__HistogramStyle__Group_3__0)?
{ after(grammarAccess.getHistogramStyleAccess().getGroup_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__HistogramStyle__Group__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__HistogramStyle__Group__4__Impl
	rule__HistogramStyle__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__HistogramStyle__Group__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getHistogramStyleAccess().getSectionsAssignment_4()); }
(rule__HistogramStyle__SectionsAssignment_4)*
{ after(grammarAccess.getHistogramStyleAccess().getSectionsAssignment_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__HistogramStyle__Group__5
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__HistogramStyle__Group__5__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__HistogramStyle__Group__5__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getHistogramStyleAccess().getRightCurlyBracketKeyword_5()); }

	'}' 

{ after(grammarAccess.getHistogramStyleAccess().getRightCurlyBracketKeyword_5()); }
)

;
finally {
	restoreStackSize(stackSize);
}














rule__HistogramStyle__Group_3__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__HistogramStyle__Group_3__0__Impl
	rule__HistogramStyle__Group_3__1
;
finally {
	restoreStackSize(stackSize);
}

rule__HistogramStyle__Group_3__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getHistogramStyleAccess().getBorderColorKeyword_3_0()); }

	'border-color:' 

{ after(grammarAccess.getHistogramStyleAccess().getBorderColorKeyword_3_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__HistogramStyle__Group_3__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__HistogramStyle__Group_3__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__HistogramStyle__Group_3__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getHistogramStyleAccess().getBorderColorAssignment_3_1()); }
(rule__HistogramStyle__BorderColorAssignment_3_1)
{ after(grammarAccess.getHistogramStyleAccess().getBorderColorAssignment_3_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__HistogramSection__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__HistogramSection__Group__0__Impl
	rule__HistogramSection__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__HistogramSection__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getHistogramSectionAccess().getHistogramSectionAction_0()); }
(

)
{ after(grammarAccess.getHistogramSectionAccess().getHistogramSectionAction_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__HistogramSection__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__HistogramSection__Group__1__Impl
	rule__HistogramSection__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__HistogramSection__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getHistogramSectionAccess().getSectionKeyword_1()); }

	'Section' 

{ after(grammarAccess.getHistogramSectionAccess().getSectionKeyword_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__HistogramSection__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__HistogramSection__Group__2__Impl
	rule__HistogramSection__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__HistogramSection__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getHistogramSectionAccess().getLeftCurlyBracketKeyword_2()); }

	'{' 

{ after(grammarAccess.getHistogramSectionAccess().getLeftCurlyBracketKeyword_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__HistogramSection__Group__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__HistogramSection__Group__3__Impl
	rule__HistogramSection__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__HistogramSection__Group__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getHistogramSectionAccess().getGroup_3()); }
(rule__HistogramSection__Group_3__0)?
{ after(grammarAccess.getHistogramSectionAccess().getGroup_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__HistogramSection__Group__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__HistogramSection__Group__4__Impl
	rule__HistogramSection__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__HistogramSection__Group__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getHistogramSectionAccess().getGroup_4()); }
(rule__HistogramSection__Group_4__0)?
{ after(grammarAccess.getHistogramSectionAccess().getGroup_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__HistogramSection__Group__5
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__HistogramSection__Group__5__Impl
	rule__HistogramSection__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__HistogramSection__Group__5__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getHistogramSectionAccess().getGroup_5()); }
(rule__HistogramSection__Group_5__0)?
{ after(grammarAccess.getHistogramSectionAccess().getGroup_5()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__HistogramSection__Group__6
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__HistogramSection__Group__6__Impl
	rule__HistogramSection__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__HistogramSection__Group__6__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getHistogramSectionAccess().getGroup_6()); }
(rule__HistogramSection__Group_6__0)?
{ after(grammarAccess.getHistogramSectionAccess().getGroup_6()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__HistogramSection__Group__7
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__HistogramSection__Group__7__Impl
	rule__HistogramSection__Group__8
;
finally {
	restoreStackSize(stackSize);
}

rule__HistogramSection__Group__7__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getHistogramSectionAccess().getGroup_7()); }
(rule__HistogramSection__Group_7__0)?
{ after(grammarAccess.getHistogramSectionAccess().getGroup_7()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__HistogramSection__Group__8
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__HistogramSection__Group__8__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__HistogramSection__Group__8__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getHistogramSectionAccess().getRightCurlyBracketKeyword_8()); }

	'}' 

{ after(grammarAccess.getHistogramSectionAccess().getRightCurlyBracketKeyword_8()); }
)

;
finally {
	restoreStackSize(stackSize);
}




















rule__HistogramSection__Group_3__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__HistogramSection__Group_3__0__Impl
	rule__HistogramSection__Group_3__1
;
finally {
	restoreStackSize(stackSize);
}

rule__HistogramSection__Group_3__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getHistogramSectionAccess().getBackgroundKeyword_3_0()); }

	'background:' 

{ after(grammarAccess.getHistogramSectionAccess().getBackgroundKeyword_3_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__HistogramSection__Group_3__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__HistogramSection__Group_3__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__HistogramSection__Group_3__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getHistogramSectionAccess().getBackgroundColorAssignment_3_1()); }
(rule__HistogramSection__BackgroundColorAssignment_3_1)
{ after(grammarAccess.getHistogramSectionAccess().getBackgroundColorAssignment_3_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__HistogramSection__Group_4__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__HistogramSection__Group_4__0__Impl
	rule__HistogramSection__Group_4__1
;
finally {
	restoreStackSize(stackSize);
}

rule__HistogramSection__Group_4__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getHistogramSectionAccess().getForegroundKeyword_4_0()); }

	'foreground:' 

{ after(grammarAccess.getHistogramSectionAccess().getForegroundKeyword_4_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__HistogramSection__Group_4__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__HistogramSection__Group_4__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__HistogramSection__Group_4__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getHistogramSectionAccess().getForgroundColorAssignment_4_1()); }
(rule__HistogramSection__ForgroundColorAssignment_4_1)
{ after(grammarAccess.getHistogramSectionAccess().getForgroundColorAssignment_4_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__HistogramSection__Group_5__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__HistogramSection__Group_5__0__Impl
	rule__HistogramSection__Group_5__1
;
finally {
	restoreStackSize(stackSize);
}

rule__HistogramSection__Group_5__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getHistogramSectionAccess().getMinValueKeyword_5_0()); }

	'minValue:' 

{ after(grammarAccess.getHistogramSectionAccess().getMinValueKeyword_5_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__HistogramSection__Group_5__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__HistogramSection__Group_5__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__HistogramSection__Group_5__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getHistogramSectionAccess().getMinValueAssignment_5_1()); }
(rule__HistogramSection__MinValueAssignment_5_1)
{ after(grammarAccess.getHistogramSectionAccess().getMinValueAssignment_5_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__HistogramSection__Group_6__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__HistogramSection__Group_6__0__Impl
	rule__HistogramSection__Group_6__1
;
finally {
	restoreStackSize(stackSize);
}

rule__HistogramSection__Group_6__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getHistogramSectionAccess().getValueKeyword_6_0()); }

	'value:' 

{ after(grammarAccess.getHistogramSectionAccess().getValueKeyword_6_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__HistogramSection__Group_6__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__HistogramSection__Group_6__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__HistogramSection__Group_6__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getHistogramSectionAccess().getValueAssignment_6_1()); }
(rule__HistogramSection__ValueAssignment_6_1)
{ after(grammarAccess.getHistogramSectionAccess().getValueAssignment_6_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__HistogramSection__Group_7__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__HistogramSection__Group_7__0__Impl
	rule__HistogramSection__Group_7__1
;
finally {
	restoreStackSize(stackSize);
}

rule__HistogramSection__Group_7__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getHistogramSectionAccess().getMaxValueKeyword_7_0()); }

	'maxValue:' 

{ after(grammarAccess.getHistogramSectionAccess().getMaxValueKeyword_7_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__HistogramSection__Group_7__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__HistogramSection__Group_7__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__HistogramSection__Group_7__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getHistogramSectionAccess().getMaxValueAssignment_7_1()); }
(rule__HistogramSection__MaxValueAssignment_7_1)
{ after(grammarAccess.getHistogramSectionAccess().getMaxValueAssignment_7_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__ImageStyle__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__ImageStyle__Group__0__Impl
	rule__ImageStyle__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ImageStyle__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getImageStyleAccess().getImageStyleAction_0()); }
(

)
{ after(grammarAccess.getImageStyleAccess().getImageStyleAction_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__ImageStyle__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__ImageStyle__Group__1__Impl
	rule__ImageStyle__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__ImageStyle__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getImageStyleAccess().getImageKeyword_1()); }

	'Image' 

{ after(grammarAccess.getImageStyleAccess().getImageKeyword_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__ImageStyle__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__ImageStyle__Group__2__Impl
	rule__ImageStyle__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__ImageStyle__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getImageStyleAccess().getLeftCurlyBracketKeyword_2()); }

	'{' 

{ after(grammarAccess.getImageStyleAccess().getLeftCurlyBracketKeyword_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__ImageStyle__Group__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__ImageStyle__Group__3__Impl
	rule__ImageStyle__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__ImageStyle__Group__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getImageStyleAccess().getGroup_3()); }
(rule__ImageStyle__Group_3__0)?
{ after(grammarAccess.getImageStyleAccess().getGroup_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__ImageStyle__Group__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__ImageStyle__Group__4__Impl
	rule__ImageStyle__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__ImageStyle__Group__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getImageStyleAccess().getGroup_4()); }
(rule__ImageStyle__Group_4__0)
{ after(grammarAccess.getImageStyleAccess().getGroup_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__ImageStyle__Group__5
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__ImageStyle__Group__5__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ImageStyle__Group__5__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getImageStyleAccess().getRightCurlyBracketKeyword_5()); }

	'}' 

{ after(grammarAccess.getImageStyleAccess().getRightCurlyBracketKeyword_5()); }
)

;
finally {
	restoreStackSize(stackSize);
}














rule__ImageStyle__Group_3__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__ImageStyle__Group_3__0__Impl
	rule__ImageStyle__Group_3__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ImageStyle__Group_3__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getImageStyleAccess().getBorderKeyword_3_0()); }

	'border:' 

{ after(grammarAccess.getImageStyleAccess().getBorderKeyword_3_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__ImageStyle__Group_3__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__ImageStyle__Group_3__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ImageStyle__Group_3__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getImageStyleAccess().getBorderColorAssignment_3_1()); }
(rule__ImageStyle__BorderColorAssignment_3_1)
{ after(grammarAccess.getImageStyleAccess().getBorderColorAssignment_3_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__ImageStyle__Group_4__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__ImageStyle__Group_4__0__Impl
	rule__ImageStyle__Group_4__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ImageStyle__Group_4__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getImageStyleAccess().getPathKeyword_4_0()); }

	'path:' 

{ after(grammarAccess.getImageStyleAccess().getPathKeyword_4_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__ImageStyle__Group_4__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__ImageStyle__Group_4__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ImageStyle__Group_4__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getImageStyleAccess().getImagePathAssignment_4_1()); }
(rule__ImageStyle__ImagePathAssignment_4_1)
{ after(grammarAccess.getImageStyleAccess().getImagePathAssignment_4_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__FlatStyle__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__FlatStyle__Group__0__Impl
	rule__FlatStyle__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__FlatStyle__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getFlatStyleAccess().getFlatStyleAction_0()); }
(

)
{ after(grammarAccess.getFlatStyleAccess().getFlatStyleAction_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__FlatStyle__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__FlatStyle__Group__1__Impl
	rule__FlatStyle__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__FlatStyle__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getFlatStyleAccess().getFlatStyleKeyword_1()); }

	'FlatStyle' 

{ after(grammarAccess.getFlatStyleAccess().getFlatStyleKeyword_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__FlatStyle__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__FlatStyle__Group__2__Impl
	rule__FlatStyle__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__FlatStyle__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getFlatStyleAccess().getLeftCurlyBracketKeyword_2()); }

	'{' 

{ after(grammarAccess.getFlatStyleAccess().getLeftCurlyBracketKeyword_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__FlatStyle__Group__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__FlatStyle__Group__3__Impl
	rule__FlatStyle__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__FlatStyle__Group__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getFlatStyleAccess().getGroup_3()); }
(rule__FlatStyle__Group_3__0)?
{ after(grammarAccess.getFlatStyleAccess().getGroup_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__FlatStyle__Group__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__FlatStyle__Group__4__Impl
	rule__FlatStyle__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__FlatStyle__Group__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getFlatStyleAccess().getGroup_4()); }
(rule__FlatStyle__Group_4__0)?
{ after(grammarAccess.getFlatStyleAccess().getGroup_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__FlatStyle__Group__5
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__FlatStyle__Group__5__Impl
	rule__FlatStyle__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__FlatStyle__Group__5__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getFlatStyleAccess().getGroup_5()); }
(rule__FlatStyle__Group_5__0)?
{ after(grammarAccess.getFlatStyleAccess().getGroup_5()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__FlatStyle__Group__6
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__FlatStyle__Group__6__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__FlatStyle__Group__6__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getFlatStyleAccess().getRightCurlyBracketKeyword_6()); }

	'}' 

{ after(grammarAccess.getFlatStyleAccess().getRightCurlyBracketKeyword_6()); }
)

;
finally {
	restoreStackSize(stackSize);
}
















rule__FlatStyle__Group_3__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__FlatStyle__Group_3__0__Impl
	rule__FlatStyle__Group_3__1
;
finally {
	restoreStackSize(stackSize);
}

rule__FlatStyle__Group_3__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getFlatStyleAccess().getBorderKeyword_3_0()); }

	'border:' 

{ after(grammarAccess.getFlatStyleAccess().getBorderKeyword_3_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__FlatStyle__Group_3__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__FlatStyle__Group_3__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__FlatStyle__Group_3__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getFlatStyleAccess().getBorderColorAssignment_3_1()); }
(rule__FlatStyle__BorderColorAssignment_3_1)
{ after(grammarAccess.getFlatStyleAccess().getBorderColorAssignment_3_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__FlatStyle__Group_4__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__FlatStyle__Group_4__0__Impl
	rule__FlatStyle__Group_4__1
;
finally {
	restoreStackSize(stackSize);
}

rule__FlatStyle__Group_4__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getFlatStyleAccess().getBackgroundKeyword_4_0()); }

	'background:' 

{ after(grammarAccess.getFlatStyleAccess().getBackgroundKeyword_4_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__FlatStyle__Group_4__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__FlatStyle__Group_4__1__Impl
	rule__FlatStyle__Group_4__2
;
finally {
	restoreStackSize(stackSize);
}

rule__FlatStyle__Group_4__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getFlatStyleAccess().getBackgroundStyleAssignment_4_1()); }
(rule__FlatStyle__BackgroundStyleAssignment_4_1)?
{ after(grammarAccess.getFlatStyleAccess().getBackgroundStyleAssignment_4_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__FlatStyle__Group_4__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__FlatStyle__Group_4__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__FlatStyle__Group_4__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getFlatStyleAccess().getBackgroundColorAssignment_4_2()); }
(rule__FlatStyle__BackgroundColorAssignment_4_2)
{ after(grammarAccess.getFlatStyleAccess().getBackgroundColorAssignment_4_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}








rule__FlatStyle__Group_5__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__FlatStyle__Group_5__0__Impl
	rule__FlatStyle__Group_5__1
;
finally {
	restoreStackSize(stackSize);
}

rule__FlatStyle__Group_5__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getFlatStyleAccess().getForegroundKeyword_5_0()); }

	'foreground:' 

{ after(grammarAccess.getFlatStyleAccess().getForegroundKeyword_5_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__FlatStyle__Group_5__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__FlatStyle__Group_5__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__FlatStyle__Group_5__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getFlatStyleAccess().getForgroundColorAssignment_5_1()); }
(rule__FlatStyle__ForgroundColorAssignment_5_1)
{ after(grammarAccess.getFlatStyleAccess().getForgroundColorAssignment_5_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__Label__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Label__Group__0__Impl
	rule__Label__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Label__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getLabelAccess().getLabelAction_0()); }
(

)
{ after(grammarAccess.getLabelAccess().getLabelAction_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Label__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Label__Group__1__Impl
	rule__Label__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Label__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getLabelAccess().getGroup_1()); }
(rule__Label__Group_1__0)
{ after(grammarAccess.getLabelAccess().getGroup_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Label__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Label__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Label__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getLabelAccess().getGroup_2()); }
(rule__Label__Group_2__0)?
{ after(grammarAccess.getLabelAccess().getGroup_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}








rule__Label__Group_1__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Label__Group_1__0__Impl
	rule__Label__Group_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Label__Group_1__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getLabelAccess().getContentKeyword_1_0()); }

	'content:' 

{ after(grammarAccess.getLabelAccess().getContentKeyword_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Label__Group_1__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Label__Group_1__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Label__Group_1__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getLabelAccess().getValueAssignment_1_1()); }
(rule__Label__ValueAssignment_1_1)
{ after(grammarAccess.getLabelAccess().getValueAssignment_1_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__Label__Group_2__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Label__Group_2__0__Impl
	rule__Label__Group_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Label__Group_2__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getLabelAccess().getPoliceKeyword_2_0()); }

	'police:' 

{ after(grammarAccess.getLabelAccess().getPoliceKeyword_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Label__Group_2__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Label__Group_2__1__Impl
	rule__Label__Group_2__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Label__Group_2__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getLabelAccess().getBoldAssignment_2_1()); }
(rule__Label__BoldAssignment_2_1)?
{ after(grammarAccess.getLabelAccess().getBoldAssignment_2_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Label__Group_2__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Label__Group_2__2__Impl
	rule__Label__Group_2__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Label__Group_2__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getLabelAccess().getItalicAssignment_2_2()); }
(rule__Label__ItalicAssignment_2_2)?
{ after(grammarAccess.getLabelAccess().getItalicAssignment_2_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Label__Group_2__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Label__Group_2__3__Impl
	rule__Label__Group_2__4
;
finally {
	restoreStackSize(stackSize);
}

rule__Label__Group_2__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getLabelAccess().getColorAssignment_2_3()); }
(rule__Label__ColorAssignment_2_3)?
{ after(grammarAccess.getLabelAccess().getColorAssignment_2_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Label__Group_2__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Label__Group_2__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Label__Group_2__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getLabelAccess().getSizeAssignment_2_4()); }
(rule__Label__SizeAssignment_2_4)?
{ after(grammarAccess.getLabelAccess().getSizeAssignment_2_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}












rule__Node__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Node__Group__0__Impl
	rule__Node__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Node__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getNodeAccess().getNodeAction_0()); }
(

)
{ after(grammarAccess.getNodeAccess().getNodeAction_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Node__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Node__Group__1__Impl
	rule__Node__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Node__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getNodeAccess().getNodeKeyword_1()); }

	'Node' 

{ after(grammarAccess.getNodeAccess().getNodeKeyword_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Node__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Node__Group__2__Impl
	rule__Node__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Node__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getNodeAccess().getNameAssignment_2()); }
(rule__Node__NameAssignment_2)
{ after(grammarAccess.getNodeAccess().getNameAssignment_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Node__Group__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Node__Group__3__Impl
	rule__Node__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__Node__Group__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getNodeAccess().getLeftCurlyBracketKeyword_3()); }

	'{' 

{ after(grammarAccess.getNodeAccess().getLeftCurlyBracketKeyword_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Node__Group__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Node__Group__4__Impl
	rule__Node__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__Node__Group__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getNodeAccess().getGroup_4()); }
(rule__Node__Group_4__0)?
{ after(grammarAccess.getNodeAccess().getGroup_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Node__Group__5
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Node__Group__5__Impl
	rule__Node__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__Node__Group__5__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getNodeAccess().getGroup_5()); }
(rule__Node__Group_5__0)?
{ after(grammarAccess.getNodeAccess().getGroup_5()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Node__Group__6
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Node__Group__6__Impl
	rule__Node__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__Node__Group__6__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getNodeAccess().getStyleAssignment_6()); }
(rule__Node__StyleAssignment_6)*
{ after(grammarAccess.getNodeAccess().getStyleAssignment_6()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Node__Group__7
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Node__Group__7__Impl
	rule__Node__Group__8
;
finally {
	restoreStackSize(stackSize);
}

rule__Node__Group__7__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getNodeAccess().getChildrenAssignment_7()); }
(rule__Node__ChildrenAssignment_7)?
{ after(grammarAccess.getNodeAccess().getChildrenAssignment_7()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Node__Group__8
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Node__Group__8__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Node__Group__8__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getNodeAccess().getRightCurlyBracketKeyword_8()); }

	'}' 

{ after(grammarAccess.getNodeAccess().getRightCurlyBracketKeyword_8()); }
)

;
finally {
	restoreStackSize(stackSize);
}




















rule__Node__Group_4__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Node__Group_4__0__Impl
	rule__Node__Group_4__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Node__Group_4__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getNodeAccess().getImportKeyword_4_0()); }

	'import:' 

{ after(grammarAccess.getNodeAccess().getImportKeyword_4_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Node__Group_4__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Node__Group_4__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Node__Group_4__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getNodeAccess().getImportsAssignment_4_1()); }
(rule__Node__ImportsAssignment_4_1)
{ after(grammarAccess.getNodeAccess().getImportsAssignment_4_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__Node__Group_5__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Node__Group_5__0__Impl
	rule__Node__Group_5__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Node__Group_5__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getNodeAccess().getDomainContextKeyword_5_0()); }

	'domain-context:' 

{ after(grammarAccess.getNodeAccess().getDomainContextKeyword_5_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Node__Group_5__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Node__Group_5__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Node__Group_5__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getNodeAccess().getThe_domainAssignment_5_1()); }
(rule__Node__The_domainAssignment_5_1)
{ after(grammarAccess.getNodeAccess().getThe_domainAssignment_5_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__NodeChildren__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__NodeChildren__Group__0__Impl
	rule__NodeChildren__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__NodeChildren__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getNodeChildrenAccess().getNodeChildrenAction_0()); }
(

)
{ after(grammarAccess.getNodeChildrenAccess().getNodeChildrenAction_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__NodeChildren__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__NodeChildren__Group__1__Impl
	rule__NodeChildren__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__NodeChildren__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getNodeChildrenAccess().getContainsKeyword_1()); }

	'Contains' 

{ after(grammarAccess.getNodeChildrenAccess().getContainsKeyword_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__NodeChildren__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__NodeChildren__Group__2__Impl
	rule__NodeChildren__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__NodeChildren__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getNodeChildrenAccess().getLeftCurlyBracketKeyword_2()); }

	'{' 

{ after(grammarAccess.getNodeChildrenAccess().getLeftCurlyBracketKeyword_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__NodeChildren__Group__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__NodeChildren__Group__3__Impl
	rule__NodeChildren__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__NodeChildren__Group__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getNodeChildrenAccess().getGroup_3()); }
(rule__NodeChildren__Group_3__0)?
{ after(grammarAccess.getNodeChildrenAccess().getGroup_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__NodeChildren__Group__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__NodeChildren__Group__4__Impl
	rule__NodeChildren__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__NodeChildren__Group__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getNodeChildrenAccess().getOwned_boderednodesAssignment_4()); }
(rule__NodeChildren__Owned_boderednodesAssignment_4)*
{ after(grammarAccess.getNodeChildrenAccess().getOwned_boderednodesAssignment_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__NodeChildren__Group__5
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__NodeChildren__Group__5__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__NodeChildren__Group__5__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getNodeChildrenAccess().getRightCurlyBracketKeyword_5()); }

	'}' 

{ after(grammarAccess.getNodeChildrenAccess().getRightCurlyBracketKeyword_5()); }
)

;
finally {
	restoreStackSize(stackSize);
}














rule__NodeChildren__Group_3__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__NodeChildren__Group_3__0__Impl
	rule__NodeChildren__Group_3__1
;
finally {
	restoreStackSize(stackSize);
}

rule__NodeChildren__Group_3__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getNodeChildrenAccess().getReuseKeyword_3_0()); }

	'reuse' 

{ after(grammarAccess.getNodeChildrenAccess().getReuseKeyword_3_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__NodeChildren__Group_3__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__NodeChildren__Group_3__1__Impl
	rule__NodeChildren__Group_3__2
;
finally {
	restoreStackSize(stackSize);
}

rule__NodeChildren__Group_3__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getNodeChildrenAccess().getReused_boderednodesAssignment_3_1()); }
(rule__NodeChildren__Reused_boderednodesAssignment_3_1)
{ after(grammarAccess.getNodeChildrenAccess().getReused_boderednodesAssignment_3_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__NodeChildren__Group_3__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__NodeChildren__Group_3__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__NodeChildren__Group_3__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getNodeChildrenAccess().getGroup_3_2()); }
(rule__NodeChildren__Group_3_2__0)*
{ after(grammarAccess.getNodeChildrenAccess().getGroup_3_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}








rule__NodeChildren__Group_3_2__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__NodeChildren__Group_3_2__0__Impl
	rule__NodeChildren__Group_3_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__NodeChildren__Group_3_2__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getNodeChildrenAccess().getCommaKeyword_3_2_0()); }

	',' 

{ after(grammarAccess.getNodeChildrenAccess().getCommaKeyword_3_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__NodeChildren__Group_3_2__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__NodeChildren__Group_3_2__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__NodeChildren__Group_3_2__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getNodeChildrenAccess().getReused_boderednodesAssignment_3_2_1()); }
(rule__NodeChildren__Reused_boderednodesAssignment_3_2_1)
{ after(grammarAccess.getNodeChildrenAccess().getReused_boderednodesAssignment_3_2_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__BorderedNode__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__BorderedNode__Group__0__Impl
	rule__BorderedNode__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__BorderedNode__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getBorderedNodeAccess().getBorderedNodeAction_0()); }
(

)
{ after(grammarAccess.getBorderedNodeAccess().getBorderedNodeAction_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__BorderedNode__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__BorderedNode__Group__1__Impl
	rule__BorderedNode__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__BorderedNode__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getBorderedNodeAccess().getBorderedNodeKeyword_1()); }

	'BorderedNode' 

{ after(grammarAccess.getBorderedNodeAccess().getBorderedNodeKeyword_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__BorderedNode__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__BorderedNode__Group__2__Impl
	rule__BorderedNode__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__BorderedNode__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getBorderedNodeAccess().getNameAssignment_2()); }
(rule__BorderedNode__NameAssignment_2)
{ after(grammarAccess.getBorderedNodeAccess().getNameAssignment_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__BorderedNode__Group__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__BorderedNode__Group__3__Impl
	rule__BorderedNode__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__BorderedNode__Group__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getBorderedNodeAccess().getLeftCurlyBracketKeyword_3()); }

	'{' 

{ after(grammarAccess.getBorderedNodeAccess().getLeftCurlyBracketKeyword_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__BorderedNode__Group__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__BorderedNode__Group__4__Impl
	rule__BorderedNode__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__BorderedNode__Group__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getBorderedNodeAccess().getGroup_4()); }
(rule__BorderedNode__Group_4__0)?
{ after(grammarAccess.getBorderedNodeAccess().getGroup_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__BorderedNode__Group__5
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__BorderedNode__Group__5__Impl
	rule__BorderedNode__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__BorderedNode__Group__5__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getBorderedNodeAccess().getGroup_5()); }
(rule__BorderedNode__Group_5__0)?
{ after(grammarAccess.getBorderedNodeAccess().getGroup_5()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__BorderedNode__Group__6
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__BorderedNode__Group__6__Impl
	rule__BorderedNode__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__BorderedNode__Group__6__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getBorderedNodeAccess().getStyleAssignment_6()); }
(rule__BorderedNode__StyleAssignment_6)*
{ after(grammarAccess.getBorderedNodeAccess().getStyleAssignment_6()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__BorderedNode__Group__7
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__BorderedNode__Group__7__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__BorderedNode__Group__7__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getBorderedNodeAccess().getRightCurlyBracketKeyword_7()); }

	'}' 

{ after(grammarAccess.getBorderedNodeAccess().getRightCurlyBracketKeyword_7()); }
)

;
finally {
	restoreStackSize(stackSize);
}


















rule__BorderedNode__Group_4__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__BorderedNode__Group_4__0__Impl
	rule__BorderedNode__Group_4__1
;
finally {
	restoreStackSize(stackSize);
}

rule__BorderedNode__Group_4__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getBorderedNodeAccess().getImportKeyword_4_0()); }

	'import:' 

{ after(grammarAccess.getBorderedNodeAccess().getImportKeyword_4_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__BorderedNode__Group_4__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__BorderedNode__Group_4__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__BorderedNode__Group_4__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getBorderedNodeAccess().getImportsAssignment_4_1()); }
(rule__BorderedNode__ImportsAssignment_4_1)
{ after(grammarAccess.getBorderedNodeAccess().getImportsAssignment_4_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__BorderedNode__Group_5__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__BorderedNode__Group_5__0__Impl
	rule__BorderedNode__Group_5__1
;
finally {
	restoreStackSize(stackSize);
}

rule__BorderedNode__Group_5__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getBorderedNodeAccess().getDomainContextKeyword_5_0()); }

	'domain-context:' 

{ after(grammarAccess.getBorderedNodeAccess().getDomainContextKeyword_5_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__BorderedNode__Group_5__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__BorderedNode__Group_5__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__BorderedNode__Group_5__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getBorderedNodeAccess().getThe_domainAssignment_5_1()); }
(rule__BorderedNode__The_domainAssignment_5_1)
{ after(grammarAccess.getBorderedNodeAccess().getThe_domainAssignment_5_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__NodeDescription__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__NodeDescription__Group__0__Impl
	rule__NodeDescription__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__NodeDescription__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getNodeDescriptionAccess().getNodeDescriptionAction_0()); }
(

)
{ after(grammarAccess.getNodeDescriptionAccess().getNodeDescriptionAction_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__NodeDescription__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__NodeDescription__Group__1__Impl
	rule__NodeDescription__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__NodeDescription__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getNodeDescriptionAccess().getRepresentationKeyword_1()); }

	'Representation' 

{ after(grammarAccess.getNodeDescriptionAccess().getRepresentationKeyword_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__NodeDescription__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__NodeDescription__Group__2__Impl
	rule__NodeDescription__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__NodeDescription__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getNodeDescriptionAccess().getLeftCurlyBracketKeyword_2()); }

	'{' 

{ after(grammarAccess.getNodeDescriptionAccess().getLeftCurlyBracketKeyword_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__NodeDescription__Group__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__NodeDescription__Group__3__Impl
	rule__NodeDescription__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__NodeDescription__Group__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getNodeDescriptionAccess().getConditionAssignment_3()); }
(rule__NodeDescription__ConditionAssignment_3)?
{ after(grammarAccess.getNodeDescriptionAccess().getConditionAssignment_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__NodeDescription__Group__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__NodeDescription__Group__4__Impl
	rule__NodeDescription__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__NodeDescription__Group__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getNodeDescriptionAccess().getGroup_4()); }
(rule__NodeDescription__Group_4__0)?
{ after(grammarAccess.getNodeDescriptionAccess().getGroup_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__NodeDescription__Group__5
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__NodeDescription__Group__5__Impl
	rule__NodeDescription__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__NodeDescription__Group__5__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getNodeDescriptionAccess().getGroup_5()); }
(rule__NodeDescription__Group_5__0)?
{ after(grammarAccess.getNodeDescriptionAccess().getGroup_5()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__NodeDescription__Group__6
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__NodeDescription__Group__6__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__NodeDescription__Group__6__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getNodeDescriptionAccess().getRightCurlyBracketKeyword_6()); }

	'}' 

{ after(grammarAccess.getNodeDescriptionAccess().getRightCurlyBracketKeyword_6()); }
)

;
finally {
	restoreStackSize(stackSize);
}
















rule__NodeDescription__Group_4__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__NodeDescription__Group_4__0__Impl
	rule__NodeDescription__Group_4__1
;
finally {
	restoreStackSize(stackSize);
}

rule__NodeDescription__Group_4__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getNodeDescriptionAccess().getLabelKeyword_4_0()); }

	'Label' 

{ after(grammarAccess.getNodeDescriptionAccess().getLabelKeyword_4_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__NodeDescription__Group_4__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__NodeDescription__Group_4__1__Impl
	rule__NodeDescription__Group_4__2
;
finally {
	restoreStackSize(stackSize);
}

rule__NodeDescription__Group_4__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getNodeDescriptionAccess().getLeftCurlyBracketKeyword_4_1()); }

	'{' 

{ after(grammarAccess.getNodeDescriptionAccess().getLeftCurlyBracketKeyword_4_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__NodeDescription__Group_4__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__NodeDescription__Group_4__2__Impl
	rule__NodeDescription__Group_4__3
;
finally {
	restoreStackSize(stackSize);
}

rule__NodeDescription__Group_4__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getNodeDescriptionAccess().getNode_LabelAssignment_4_2()); }
(rule__NodeDescription__Node_LabelAssignment_4_2)
{ after(grammarAccess.getNodeDescriptionAccess().getNode_LabelAssignment_4_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__NodeDescription__Group_4__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__NodeDescription__Group_4__3__Impl
	rule__NodeDescription__Group_4__4
;
finally {
	restoreStackSize(stackSize);
}

rule__NodeDescription__Group_4__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getNodeDescriptionAccess().getGroup_4_3()); }
(rule__NodeDescription__Group_4_3__0)?
{ after(grammarAccess.getNodeDescriptionAccess().getGroup_4_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__NodeDescription__Group_4__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__NodeDescription__Group_4__4__Impl
	rule__NodeDescription__Group_4__5
;
finally {
	restoreStackSize(stackSize);
}

rule__NodeDescription__Group_4__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getNodeDescriptionAccess().getGroup_4_4()); }
(rule__NodeDescription__Group_4_4__0)?
{ after(grammarAccess.getNodeDescriptionAccess().getGroup_4_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__NodeDescription__Group_4__5
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__NodeDescription__Group_4__5__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__NodeDescription__Group_4__5__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getNodeDescriptionAccess().getRightCurlyBracketKeyword_4_5()); }

	'}' 

{ after(grammarAccess.getNodeDescriptionAccess().getRightCurlyBracketKeyword_4_5()); }
)

;
finally {
	restoreStackSize(stackSize);
}














rule__NodeDescription__Group_4_3__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__NodeDescription__Group_4_3__0__Impl
	rule__NodeDescription__Group_4_3__1
;
finally {
	restoreStackSize(stackSize);
}

rule__NodeDescription__Group_4_3__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getNodeDescriptionAccess().getPositionKeyword_4_3_0()); }

	'position:' 

{ after(grammarAccess.getNodeDescriptionAccess().getPositionKeyword_4_3_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__NodeDescription__Group_4_3__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__NodeDescription__Group_4_3__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__NodeDescription__Group_4_3__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getNodeDescriptionAccess().getLabel_positionAssignment_4_3_1()); }
(rule__NodeDescription__Label_positionAssignment_4_3_1)
{ after(grammarAccess.getNodeDescriptionAccess().getLabel_positionAssignment_4_3_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__NodeDescription__Group_4_4__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__NodeDescription__Group_4_4__0__Impl
	rule__NodeDescription__Group_4_4__1
;
finally {
	restoreStackSize(stackSize);
}

rule__NodeDescription__Group_4_4__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getNodeDescriptionAccess().getAlignmentKeyword_4_4_0()); }

	'alignment:' 

{ after(grammarAccess.getNodeDescriptionAccess().getAlignmentKeyword_4_4_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__NodeDescription__Group_4_4__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__NodeDescription__Group_4_4__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__NodeDescription__Group_4_4__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getNodeDescriptionAccess().getLabel_alignementAssignment_4_4_1()); }
(rule__NodeDescription__Label_alignementAssignment_4_4_1)
{ after(grammarAccess.getNodeDescriptionAccess().getLabel_alignementAssignment_4_4_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__NodeDescription__Group_5__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__NodeDescription__Group_5__0__Impl
	rule__NodeDescription__Group_5__1
;
finally {
	restoreStackSize(stackSize);
}

rule__NodeDescription__Group_5__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getNodeDescriptionAccess().getStyleKeyword_5_0()); }

	'Style' 

{ after(grammarAccess.getNodeDescriptionAccess().getStyleKeyword_5_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__NodeDescription__Group_5__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__NodeDescription__Group_5__1__Impl
	rule__NodeDescription__Group_5__2
;
finally {
	restoreStackSize(stackSize);
}

rule__NodeDescription__Group_5__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getNodeDescriptionAccess().getLeftCurlyBracketKeyword_5_1()); }

	'{' 

{ after(grammarAccess.getNodeDescriptionAccess().getLeftCurlyBracketKeyword_5_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__NodeDescription__Group_5__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__NodeDescription__Group_5__2__Impl
	rule__NodeDescription__Group_5__3
;
finally {
	restoreStackSize(stackSize);
}

rule__NodeDescription__Group_5__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getNodeDescriptionAccess().getStyleAssignment_5_2()); }
(rule__NodeDescription__StyleAssignment_5_2)
{ after(grammarAccess.getNodeDescriptionAccess().getStyleAssignment_5_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__NodeDescription__Group_5__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__NodeDescription__Group_5__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__NodeDescription__Group_5__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getNodeDescriptionAccess().getRightCurlyBracketKeyword_5_3()); }

	'}' 

{ after(grammarAccess.getNodeDescriptionAccess().getRightCurlyBracketKeyword_5_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}










rule__ActionSet__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__ActionSet__Group__0__Impl
	rule__ActionSet__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ActionSet__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getActionSetAccess().getActionSetAction_0()); }
(

)
{ after(grammarAccess.getActionSetAccess().getActionSetAction_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__ActionSet__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__ActionSet__Group__1__Impl
	rule__ActionSet__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__ActionSet__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getActionSetAccess().getActionsKeyword_1()); }

	'Actions' 

{ after(grammarAccess.getActionSetAccess().getActionsKeyword_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__ActionSet__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__ActionSet__Group__2__Impl
	rule__ActionSet__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__ActionSet__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getActionSetAccess().getLeftCurlyBracketKeyword_2()); }

	'{' 

{ after(grammarAccess.getActionSetAccess().getLeftCurlyBracketKeyword_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__ActionSet__Group__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__ActionSet__Group__3__Impl
	rule__ActionSet__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__ActionSet__Group__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getActionSetAccess().getActionsAssignment_3()); }
(rule__ActionSet__ActionsAssignment_3)*
{ after(grammarAccess.getActionSetAccess().getActionsAssignment_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__ActionSet__Group__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__ActionSet__Group__4__Impl
	rule__ActionSet__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__ActionSet__Group__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getActionSetAccess().getOpenActionsAssignment_4()); }
(rule__ActionSet__OpenActionsAssignment_4)*
{ after(grammarAccess.getActionSetAccess().getOpenActionsAssignment_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__ActionSet__Group__5
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__ActionSet__Group__5__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ActionSet__Group__5__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getActionSetAccess().getRightCurlyBracketKeyword_5()); }

	'}' 

{ after(grammarAccess.getActionSetAccess().getRightCurlyBracketKeyword_5()); }
)

;
finally {
	restoreStackSize(stackSize);
}














rule__OpenAction__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__OpenAction__Group__0__Impl
	rule__OpenAction__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__OpenAction__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getOpenActionAccess().getOpenActionAction_0()); }
(

)
{ after(grammarAccess.getOpenActionAccess().getOpenActionAction_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__OpenAction__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__OpenAction__Group__1__Impl
	rule__OpenAction__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__OpenAction__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getOpenActionAccess().getOpenActionKeyword_1()); }

	'OpenAction' 

{ after(grammarAccess.getOpenActionAccess().getOpenActionKeyword_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__OpenAction__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__OpenAction__Group__2__Impl
	rule__OpenAction__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__OpenAction__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getOpenActionAccess().getNameAssignment_2()); }
(rule__OpenAction__NameAssignment_2)
{ after(grammarAccess.getOpenActionAccess().getNameAssignment_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__OpenAction__Group__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__OpenAction__Group__3__Impl
	rule__OpenAction__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__OpenAction__Group__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getOpenActionAccess().getLeftCurlyBracketKeyword_3()); }

	'{' 

{ after(grammarAccess.getOpenActionAccess().getLeftCurlyBracketKeyword_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__OpenAction__Group__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__OpenAction__Group__4__Impl
	rule__OpenAction__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__OpenAction__Group__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getOpenActionAccess().getGroup_4()); }
(rule__OpenAction__Group_4__0)?
{ after(grammarAccess.getOpenActionAccess().getGroup_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__OpenAction__Group__5
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__OpenAction__Group__5__Impl
	rule__OpenAction__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__OpenAction__Group__5__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getOpenActionAccess().getGroup_5()); }
(rule__OpenAction__Group_5__0)?
{ after(grammarAccess.getOpenActionAccess().getGroup_5()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__OpenAction__Group__6
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__OpenAction__Group__6__Impl
	rule__OpenAction__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__OpenAction__Group__6__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getOpenActionAccess().getGroup_6()); }
(rule__OpenAction__Group_6__0)?
{ after(grammarAccess.getOpenActionAccess().getGroup_6()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__OpenAction__Group__7
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__OpenAction__Group__7__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__OpenAction__Group__7__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getOpenActionAccess().getRightCurlyBracketKeyword_7()); }

	'}' 

{ after(grammarAccess.getOpenActionAccess().getRightCurlyBracketKeyword_7()); }
)

;
finally {
	restoreStackSize(stackSize);
}


















rule__OpenAction__Group_4__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__OpenAction__Group_4__0__Impl
	rule__OpenAction__Group_4__1
;
finally {
	restoreStackSize(stackSize);
}

rule__OpenAction__Group_4__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getOpenActionAccess().getPreconditionKeyword_4_0()); }

	'precondition:' 

{ after(grammarAccess.getOpenActionAccess().getPreconditionKeyword_4_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__OpenAction__Group_4__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__OpenAction__Group_4__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__OpenAction__Group_4__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getOpenActionAccess().getPreconditionAssignment_4_1()); }
(rule__OpenAction__PreconditionAssignment_4_1)
{ after(grammarAccess.getOpenActionAccess().getPreconditionAssignment_4_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__OpenAction__Group_5__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__OpenAction__Group_5__0__Impl
	rule__OpenAction__Group_5__1
;
finally {
	restoreStackSize(stackSize);
}

rule__OpenAction__Group_5__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getOpenActionAccess().getLabelKeyword_5_0()); }

	'label:' 

{ after(grammarAccess.getOpenActionAccess().getLabelKeyword_5_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__OpenAction__Group_5__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__OpenAction__Group_5__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__OpenAction__Group_5__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getOpenActionAccess().getLabelAssignment_5_1()); }
(rule__OpenAction__LabelAssignment_5_1)
{ after(grammarAccess.getOpenActionAccess().getLabelAssignment_5_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__OpenAction__Group_6__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__OpenAction__Group_6__0__Impl
	rule__OpenAction__Group_6__1
;
finally {
	restoreStackSize(stackSize);
}

rule__OpenAction__Group_6__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getOpenActionAccess().getIconKeyword_6_0()); }

	'icon:' 

{ after(grammarAccess.getOpenActionAccess().getIconKeyword_6_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__OpenAction__Group_6__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__OpenAction__Group_6__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__OpenAction__Group_6__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getOpenActionAccess().getIconAssignment_6_1()); }
(rule__OpenAction__IconAssignment_6_1)
{ after(grammarAccess.getOpenActionAccess().getIconAssignment_6_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__Create__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Create__Group__0__Impl
	rule__Create__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Create__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getCreateAccess().getCreateAction_0()); }
(

)
{ after(grammarAccess.getCreateAccess().getCreateAction_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Create__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Create__Group__1__Impl
	rule__Create__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Create__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getCreateAccess().getCreateKeyword_1()); }

	'Create' 

{ after(grammarAccess.getCreateAccess().getCreateKeyword_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Create__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Create__Group__2__Impl
	rule__Create__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Create__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getCreateAccess().getNameAssignment_2()); }
(rule__Create__NameAssignment_2)
{ after(grammarAccess.getCreateAccess().getNameAssignment_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Create__Group__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Create__Group__3__Impl
	rule__Create__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__Create__Group__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getCreateAccess().getLeftCurlyBracketKeyword_3()); }

	'{' 

{ after(grammarAccess.getCreateAccess().getLeftCurlyBracketKeyword_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Create__Group__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Create__Group__4__Impl
	rule__Create__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__Create__Group__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getCreateAccess().getGroup_4()); }
(rule__Create__Group_4__0)?
{ after(grammarAccess.getCreateAccess().getGroup_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Create__Group__5
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Create__Group__5__Impl
	rule__Create__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__Create__Group__5__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getCreateAccess().getGroup_5()); }
(rule__Create__Group_5__0)?
{ after(grammarAccess.getCreateAccess().getGroup_5()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Create__Group__6
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Create__Group__6__Impl
	rule__Create__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__Create__Group__6__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getCreateAccess().getGroup_6()); }
(rule__Create__Group_6__0)
{ after(grammarAccess.getCreateAccess().getGroup_6()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Create__Group__7
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Create__Group__7__Impl
	rule__Create__Group__8
;
finally {
	restoreStackSize(stackSize);
}

rule__Create__Group__7__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getCreateAccess().getGroup_7()); }
(rule__Create__Group_7__0)?
{ after(grammarAccess.getCreateAccess().getGroup_7()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Create__Group__8
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Create__Group__8__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Create__Group__8__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getCreateAccess().getRightCurlyBracketKeyword_8()); }

	'}' 

{ after(grammarAccess.getCreateAccess().getRightCurlyBracketKeyword_8()); }
)

;
finally {
	restoreStackSize(stackSize);
}




















rule__Create__Group_4__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Create__Group_4__0__Impl
	rule__Create__Group_4__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Create__Group_4__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getCreateAccess().getPreconditionKeyword_4_0()); }

	'precondition:' 

{ after(grammarAccess.getCreateAccess().getPreconditionKeyword_4_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Create__Group_4__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Create__Group_4__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Create__Group_4__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getCreateAccess().getPreconditionAssignment_4_1()); }
(rule__Create__PreconditionAssignment_4_1)
{ after(grammarAccess.getCreateAccess().getPreconditionAssignment_4_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__Create__Group_5__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Create__Group_5__0__Impl
	rule__Create__Group_5__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Create__Group_5__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getCreateAccess().getLabelKeyword_5_0()); }

	'label:' 

{ after(grammarAccess.getCreateAccess().getLabelKeyword_5_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Create__Group_5__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Create__Group_5__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Create__Group_5__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getCreateAccess().getLabelAssignment_5_1()); }
(rule__Create__LabelAssignment_5_1)
{ after(grammarAccess.getCreateAccess().getLabelAssignment_5_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__Create__Group_6__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Create__Group_6__0__Impl
	rule__Create__Group_6__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Create__Group_6__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getCreateAccess().getActionForKeyword_6_0()); }

	'action-for:' 

{ after(grammarAccess.getCreateAccess().getActionForKeyword_6_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Create__Group_6__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Create__Group_6__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Create__Group_6__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getCreateAccess().getTool_ForAssignment_6_1()); }
(rule__Create__Tool_ForAssignment_6_1)
{ after(grammarAccess.getCreateAccess().getTool_ForAssignment_6_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__Create__Group_7__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Create__Group_7__0__Impl
	rule__Create__Group_7__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Create__Group_7__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getCreateAccess().getIconKeyword_7_0()); }

	'icon:' 

{ after(grammarAccess.getCreateAccess().getIconKeyword_7_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Create__Group_7__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Create__Group_7__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Create__Group_7__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getCreateAccess().getIconAssignment_7_1()); }
(rule__Create__IconAssignment_7_1)
{ after(grammarAccess.getCreateAccess().getIconAssignment_7_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__Delete__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Delete__Group__0__Impl
	rule__Delete__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Delete__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getDeleteAccess().getDeleteAction_0()); }
(

)
{ after(grammarAccess.getDeleteAccess().getDeleteAction_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Delete__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Delete__Group__1__Impl
	rule__Delete__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Delete__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getDeleteAccess().getDeleteKeyword_1()); }

	'Delete' 

{ after(grammarAccess.getDeleteAccess().getDeleteKeyword_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Delete__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Delete__Group__2__Impl
	rule__Delete__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Delete__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getDeleteAccess().getNameAssignment_2()); }
(rule__Delete__NameAssignment_2)
{ after(grammarAccess.getDeleteAccess().getNameAssignment_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Delete__Group__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Delete__Group__3__Impl
	rule__Delete__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__Delete__Group__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getDeleteAccess().getLeftCurlyBracketKeyword_3()); }

	'{' 

{ after(grammarAccess.getDeleteAccess().getLeftCurlyBracketKeyword_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Delete__Group__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Delete__Group__4__Impl
	rule__Delete__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__Delete__Group__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getDeleteAccess().getGroup_4()); }
(rule__Delete__Group_4__0)?
{ after(grammarAccess.getDeleteAccess().getGroup_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Delete__Group__5
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Delete__Group__5__Impl
	rule__Delete__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__Delete__Group__5__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getDeleteAccess().getGroup_5()); }
(rule__Delete__Group_5__0)?
{ after(grammarAccess.getDeleteAccess().getGroup_5()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Delete__Group__6
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Delete__Group__6__Impl
	rule__Delete__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__Delete__Group__6__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getDeleteAccess().getGroup_6()); }
(rule__Delete__Group_6__0)
{ after(grammarAccess.getDeleteAccess().getGroup_6()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Delete__Group__7
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Delete__Group__7__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Delete__Group__7__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getDeleteAccess().getRightCurlyBracketKeyword_7()); }

	'}' 

{ after(grammarAccess.getDeleteAccess().getRightCurlyBracketKeyword_7()); }
)

;
finally {
	restoreStackSize(stackSize);
}


















rule__Delete__Group_4__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Delete__Group_4__0__Impl
	rule__Delete__Group_4__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Delete__Group_4__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getDeleteAccess().getPreconditionKeyword_4_0()); }

	'precondition:' 

{ after(grammarAccess.getDeleteAccess().getPreconditionKeyword_4_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Delete__Group_4__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Delete__Group_4__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Delete__Group_4__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getDeleteAccess().getPreconditionAssignment_4_1()); }
(rule__Delete__PreconditionAssignment_4_1)
{ after(grammarAccess.getDeleteAccess().getPreconditionAssignment_4_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__Delete__Group_5__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Delete__Group_5__0__Impl
	rule__Delete__Group_5__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Delete__Group_5__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getDeleteAccess().getLabelKeyword_5_0()); }

	'label:' 

{ after(grammarAccess.getDeleteAccess().getLabelKeyword_5_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Delete__Group_5__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Delete__Group_5__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Delete__Group_5__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getDeleteAccess().getLabelAssignment_5_1()); }
(rule__Delete__LabelAssignment_5_1)
{ after(grammarAccess.getDeleteAccess().getLabelAssignment_5_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__Delete__Group_6__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Delete__Group_6__0__Impl
	rule__Delete__Group_6__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Delete__Group_6__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getDeleteAccess().getActionForKeyword_6_0()); }

	'action-for:' 

{ after(grammarAccess.getDeleteAccess().getActionForKeyword_6_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Delete__Group_6__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Delete__Group_6__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Delete__Group_6__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getDeleteAccess().getTool_ForAssignment_6_1()); }
(rule__Delete__Tool_ForAssignment_6_1)
{ after(grammarAccess.getDeleteAccess().getTool_ForAssignment_6_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__Drop__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Drop__Group__0__Impl
	rule__Drop__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Drop__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getDropAccess().getDropAction_0()); }
(

)
{ after(grammarAccess.getDropAccess().getDropAction_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Drop__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Drop__Group__1__Impl
	rule__Drop__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Drop__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getDropAccess().getDropKeyword_1()); }

	'Drop' 

{ after(grammarAccess.getDropAccess().getDropKeyword_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Drop__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Drop__Group__2__Impl
	rule__Drop__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Drop__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getDropAccess().getNameAssignment_2()); }
(rule__Drop__NameAssignment_2)
{ after(grammarAccess.getDropAccess().getNameAssignment_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Drop__Group__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Drop__Group__3__Impl
	rule__Drop__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__Drop__Group__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getDropAccess().getLeftCurlyBracketKeyword_3()); }

	'{' 

{ after(grammarAccess.getDropAccess().getLeftCurlyBracketKeyword_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Drop__Group__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Drop__Group__4__Impl
	rule__Drop__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__Drop__Group__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getDropAccess().getGroup_4()); }
(rule__Drop__Group_4__0)?
{ after(grammarAccess.getDropAccess().getGroup_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Drop__Group__5
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Drop__Group__5__Impl
	rule__Drop__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__Drop__Group__5__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getDropAccess().getGroup_5()); }
(rule__Drop__Group_5__0)?
{ after(grammarAccess.getDropAccess().getGroup_5()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Drop__Group__6
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Drop__Group__6__Impl
	rule__Drop__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__Drop__Group__6__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getDropAccess().getGroup_6()); }
(rule__Drop__Group_6__0)
{ after(grammarAccess.getDropAccess().getGroup_6()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Drop__Group__7
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Drop__Group__7__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Drop__Group__7__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getDropAccess().getRightCurlyBracketKeyword_7()); }

	'}' 

{ after(grammarAccess.getDropAccess().getRightCurlyBracketKeyword_7()); }
)

;
finally {
	restoreStackSize(stackSize);
}


















rule__Drop__Group_4__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Drop__Group_4__0__Impl
	rule__Drop__Group_4__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Drop__Group_4__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getDropAccess().getPreconditionKeyword_4_0()); }

	'precondition:' 

{ after(grammarAccess.getDropAccess().getPreconditionKeyword_4_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Drop__Group_4__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Drop__Group_4__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Drop__Group_4__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getDropAccess().getPreconditionAssignment_4_1()); }
(rule__Drop__PreconditionAssignment_4_1)
{ after(grammarAccess.getDropAccess().getPreconditionAssignment_4_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__Drop__Group_5__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Drop__Group_5__0__Impl
	rule__Drop__Group_5__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Drop__Group_5__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getDropAccess().getLabelKeyword_5_0()); }

	'label:' 

{ after(grammarAccess.getDropAccess().getLabelKeyword_5_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Drop__Group_5__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Drop__Group_5__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Drop__Group_5__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getDropAccess().getLabelAssignment_5_1()); }
(rule__Drop__LabelAssignment_5_1)
{ after(grammarAccess.getDropAccess().getLabelAssignment_5_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__Drop__Group_6__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Drop__Group_6__0__Impl
	rule__Drop__Group_6__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Drop__Group_6__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getDropAccess().getActionForKeyword_6_0()); }

	'action-for:' 

{ after(grammarAccess.getDropAccess().getActionForKeyword_6_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Drop__Group_6__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Drop__Group_6__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Drop__Group_6__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getDropAccess().getTool_ForAssignment_6_1()); }
(rule__Drop__Tool_ForAssignment_6_1)
{ after(grammarAccess.getDropAccess().getTool_ForAssignment_6_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__ReconnectEdge__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__ReconnectEdge__Group__0__Impl
	rule__ReconnectEdge__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ReconnectEdge__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getReconnectEdgeAccess().getReconnectEdgeAction_0()); }
(

)
{ after(grammarAccess.getReconnectEdgeAccess().getReconnectEdgeAction_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__ReconnectEdge__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__ReconnectEdge__Group__1__Impl
	rule__ReconnectEdge__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__ReconnectEdge__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getReconnectEdgeAccess().getReconnectEdgeKeyword_1()); }

	'ReconnectEdge' 

{ after(grammarAccess.getReconnectEdgeAccess().getReconnectEdgeKeyword_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__ReconnectEdge__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__ReconnectEdge__Group__2__Impl
	rule__ReconnectEdge__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__ReconnectEdge__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getReconnectEdgeAccess().getNameAssignment_2()); }
(rule__ReconnectEdge__NameAssignment_2)
{ after(grammarAccess.getReconnectEdgeAccess().getNameAssignment_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__ReconnectEdge__Group__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__ReconnectEdge__Group__3__Impl
	rule__ReconnectEdge__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__ReconnectEdge__Group__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getReconnectEdgeAccess().getLeftCurlyBracketKeyword_3()); }

	'{' 

{ after(grammarAccess.getReconnectEdgeAccess().getLeftCurlyBracketKeyword_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__ReconnectEdge__Group__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__ReconnectEdge__Group__4__Impl
	rule__ReconnectEdge__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__ReconnectEdge__Group__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getReconnectEdgeAccess().getGroup_4()); }
(rule__ReconnectEdge__Group_4__0)?
{ after(grammarAccess.getReconnectEdgeAccess().getGroup_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__ReconnectEdge__Group__5
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__ReconnectEdge__Group__5__Impl
	rule__ReconnectEdge__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__ReconnectEdge__Group__5__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getReconnectEdgeAccess().getGroup_5()); }
(rule__ReconnectEdge__Group_5__0)?
{ after(grammarAccess.getReconnectEdgeAccess().getGroup_5()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__ReconnectEdge__Group__6
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__ReconnectEdge__Group__6__Impl
	rule__ReconnectEdge__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__ReconnectEdge__Group__6__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getReconnectEdgeAccess().getGroup_6()); }
(rule__ReconnectEdge__Group_6__0)
{ after(grammarAccess.getReconnectEdgeAccess().getGroup_6()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__ReconnectEdge__Group__7
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__ReconnectEdge__Group__7__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ReconnectEdge__Group__7__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getReconnectEdgeAccess().getRightCurlyBracketKeyword_7()); }

	'}' 

{ after(grammarAccess.getReconnectEdgeAccess().getRightCurlyBracketKeyword_7()); }
)

;
finally {
	restoreStackSize(stackSize);
}


















rule__ReconnectEdge__Group_4__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__ReconnectEdge__Group_4__0__Impl
	rule__ReconnectEdge__Group_4__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ReconnectEdge__Group_4__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getReconnectEdgeAccess().getPreconditionKeyword_4_0()); }

	'precondition:' 

{ after(grammarAccess.getReconnectEdgeAccess().getPreconditionKeyword_4_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__ReconnectEdge__Group_4__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__ReconnectEdge__Group_4__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ReconnectEdge__Group_4__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getReconnectEdgeAccess().getPreconditionAssignment_4_1()); }
(rule__ReconnectEdge__PreconditionAssignment_4_1)
{ after(grammarAccess.getReconnectEdgeAccess().getPreconditionAssignment_4_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__ReconnectEdge__Group_5__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__ReconnectEdge__Group_5__0__Impl
	rule__ReconnectEdge__Group_5__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ReconnectEdge__Group_5__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getReconnectEdgeAccess().getLabelKeyword_5_0()); }

	'label:' 

{ after(grammarAccess.getReconnectEdgeAccess().getLabelKeyword_5_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__ReconnectEdge__Group_5__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__ReconnectEdge__Group_5__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ReconnectEdge__Group_5__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getReconnectEdgeAccess().getLabelAssignment_5_1()); }
(rule__ReconnectEdge__LabelAssignment_5_1)
{ after(grammarAccess.getReconnectEdgeAccess().getLabelAssignment_5_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__ReconnectEdge__Group_6__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__ReconnectEdge__Group_6__0__Impl
	rule__ReconnectEdge__Group_6__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ReconnectEdge__Group_6__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getReconnectEdgeAccess().getActionForKeyword_6_0()); }

	'action-for:' 

{ after(grammarAccess.getReconnectEdgeAccess().getActionForKeyword_6_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__ReconnectEdge__Group_6__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__ReconnectEdge__Group_6__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ReconnectEdge__Group_6__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getReconnectEdgeAccess().getTool_ForAssignment_6_1()); }
(rule__ReconnectEdge__Tool_ForAssignment_6_1)
{ after(grammarAccess.getReconnectEdgeAccess().getTool_ForAssignment_6_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__DomainContainer__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__DomainContainer__Group__0__Impl
	rule__DomainContainer__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__DomainContainer__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getDomainContainerAccess().getDomainContainerAction_0()); }
(

)
{ after(grammarAccess.getDomainContainerAccess().getDomainContainerAction_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__DomainContainer__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__DomainContainer__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__DomainContainer__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getDomainContainerAccess().getGroup_1()); }
(rule__DomainContainer__Group_1__0)
{ after(grammarAccess.getDomainContainerAccess().getGroup_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__DomainContainer__Group_1__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__DomainContainer__Group_1__0__Impl
	rule__DomainContainer__Group_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__DomainContainer__Group_1__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getDomainContainerAccess().getDomainContextKeyword_1_0()); }

	'domain-context:' 

{ after(grammarAccess.getDomainContainerAccess().getDomainContextKeyword_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__DomainContainer__Group_1__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__DomainContainer__Group_1__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__DomainContainer__Group_1__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getDomainContainerAccess().getThe_domainAssignment_1_1()); }
(rule__DomainContainer__The_domainAssignment_1_1)
{ after(grammarAccess.getDomainContainerAccess().getThe_domainAssignment_1_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__Edge__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Edge__Group__0__Impl
	rule__Edge__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Edge__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getEdgeAccess().getEdgeAction_0()); }
(

)
{ after(grammarAccess.getEdgeAccess().getEdgeAction_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Edge__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Edge__Group__1__Impl
	rule__Edge__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Edge__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getEdgeAccess().getEdgeKeyword_1()); }

	'Edge' 

{ after(grammarAccess.getEdgeAccess().getEdgeKeyword_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Edge__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Edge__Group__2__Impl
	rule__Edge__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Edge__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getEdgeAccess().getNameAssignment_2()); }
(rule__Edge__NameAssignment_2)
{ after(grammarAccess.getEdgeAccess().getNameAssignment_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Edge__Group__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Edge__Group__3__Impl
	rule__Edge__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__Edge__Group__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getEdgeAccess().getLeftCurlyBracketKeyword_3()); }

	'{' 

{ after(grammarAccess.getEdgeAccess().getLeftCurlyBracketKeyword_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Edge__Group__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Edge__Group__4__Impl
	rule__Edge__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__Edge__Group__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getEdgeAccess().getAlternatives_4()); }
(rule__Edge__Alternatives_4)
{ after(grammarAccess.getEdgeAccess().getAlternatives_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Edge__Group__5
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Edge__Group__5__Impl
	rule__Edge__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__Edge__Group__5__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getEdgeAccess().getGroup_5()); }
(rule__Edge__Group_5__0)
{ after(grammarAccess.getEdgeAccess().getGroup_5()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Edge__Group__6
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Edge__Group__6__Impl
	rule__Edge__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__Edge__Group__6__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getEdgeAccess().getGroup_6()); }
(rule__Edge__Group_6__0)
{ after(grammarAccess.getEdgeAccess().getGroup_6()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Edge__Group__7
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Edge__Group__7__Impl
	rule__Edge__Group__8
;
finally {
	restoreStackSize(stackSize);
}

rule__Edge__Group__7__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getEdgeAccess().getE_descriptionAssignment_7()); }
(rule__Edge__E_descriptionAssignment_7)*
{ after(grammarAccess.getEdgeAccess().getE_descriptionAssignment_7()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Edge__Group__8
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Edge__Group__8__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Edge__Group__8__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getEdgeAccess().getRightCurlyBracketKeyword_8()); }

	'}' 

{ after(grammarAccess.getEdgeAccess().getRightCurlyBracketKeyword_8()); }
)

;
finally {
	restoreStackSize(stackSize);
}




















rule__Edge__Group_4_0__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Edge__Group_4_0__0__Impl
	rule__Edge__Group_4_0__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Edge__Group_4_0__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getEdgeAccess().getAssociationContextKeyword_4_0_0()); }

	'association-context:' 

{ after(grammarAccess.getEdgeAccess().getAssociationContextKeyword_4_0_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Edge__Group_4_0__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Edge__Group_4_0__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Edge__Group_4_0__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getEdgeAccess().getThe_domainAssignment_4_0_1()); }
(rule__Edge__The_domainAssignment_4_0_1)
{ after(grammarAccess.getEdgeAccess().getThe_domainAssignment_4_0_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__Edge__Group_4_1__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Edge__Group_4_1__0__Impl
	rule__Edge__Group_4_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Edge__Group_4_1__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getEdgeAccess().getClassAssociationContextKeyword_4_1_0()); }

	'class-association-context:' 

{ after(grammarAccess.getEdgeAccess().getClassAssociationContextKeyword_4_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Edge__Group_4_1__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Edge__Group_4_1__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Edge__Group_4_1__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getEdgeAccess().getThe_domainAssignment_4_1_1()); }
(rule__Edge__The_domainAssignment_4_1_1)
{ after(grammarAccess.getEdgeAccess().getThe_domainAssignment_4_1_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__Edge__Group_5__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Edge__Group_5__0__Impl
	rule__Edge__Group_5__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Edge__Group_5__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getEdgeAccess().getSourceKeyword_5_0()); }

	'source:' 

{ after(grammarAccess.getEdgeAccess().getSourceKeyword_5_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Edge__Group_5__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Edge__Group_5__1__Impl
	rule__Edge__Group_5__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Edge__Group_5__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getEdgeAccess().getSourceAssignment_5_1()); }
(rule__Edge__SourceAssignment_5_1)
{ after(grammarAccess.getEdgeAccess().getSourceAssignment_5_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Edge__Group_5__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Edge__Group_5__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Edge__Group_5__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getEdgeAccess().getGroup_5_2()); }
(rule__Edge__Group_5_2__0)*
{ after(grammarAccess.getEdgeAccess().getGroup_5_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}








rule__Edge__Group_5_2__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Edge__Group_5_2__0__Impl
	rule__Edge__Group_5_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Edge__Group_5_2__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getEdgeAccess().getCommaKeyword_5_2_0()); }

	',' 

{ after(grammarAccess.getEdgeAccess().getCommaKeyword_5_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Edge__Group_5_2__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Edge__Group_5_2__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Edge__Group_5_2__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getEdgeAccess().getSourceAssignment_5_2_1()); }
(rule__Edge__SourceAssignment_5_2_1)
{ after(grammarAccess.getEdgeAccess().getSourceAssignment_5_2_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__Edge__Group_6__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Edge__Group_6__0__Impl
	rule__Edge__Group_6__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Edge__Group_6__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getEdgeAccess().getTargetKeyword_6_0()); }

	'target:' 

{ after(grammarAccess.getEdgeAccess().getTargetKeyword_6_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Edge__Group_6__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Edge__Group_6__1__Impl
	rule__Edge__Group_6__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Edge__Group_6__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getEdgeAccess().getTargetAssignment_6_1()); }
(rule__Edge__TargetAssignment_6_1)
{ after(grammarAccess.getEdgeAccess().getTargetAssignment_6_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Edge__Group_6__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Edge__Group_6__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Edge__Group_6__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getEdgeAccess().getGroup_6_2()); }
(rule__Edge__Group_6_2__0)*
{ after(grammarAccess.getEdgeAccess().getGroup_6_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}








rule__Edge__Group_6_2__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Edge__Group_6_2__0__Impl
	rule__Edge__Group_6_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Edge__Group_6_2__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getEdgeAccess().getCommaKeyword_6_2_0()); }

	',' 

{ after(grammarAccess.getEdgeAccess().getCommaKeyword_6_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Edge__Group_6_2__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Edge__Group_6_2__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Edge__Group_6_2__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getEdgeAccess().getTargetAssignment_6_2_1()); }
(rule__Edge__TargetAssignment_6_2_1)
{ after(grammarAccess.getEdgeAccess().getTargetAssignment_6_2_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__EdgeImport__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__EdgeImport__Group__0__Impl
	rule__EdgeImport__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__EdgeImport__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getEdgeImportAccess().getEdgeImportAction_0()); }
(

)
{ after(grammarAccess.getEdgeImportAccess().getEdgeImportAction_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__EdgeImport__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__EdgeImport__Group__1__Impl
	rule__EdgeImport__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__EdgeImport__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getEdgeImportAccess().getEdgeImportKeyword_1()); }

	'EdgeImport' 

{ after(grammarAccess.getEdgeImportAccess().getEdgeImportKeyword_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__EdgeImport__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__EdgeImport__Group__2__Impl
	rule__EdgeImport__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__EdgeImport__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getEdgeImportAccess().getNameAssignment_2()); }
(rule__EdgeImport__NameAssignment_2)
{ after(grammarAccess.getEdgeImportAccess().getNameAssignment_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__EdgeImport__Group__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__EdgeImport__Group__3__Impl
	rule__EdgeImport__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__EdgeImport__Group__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getEdgeImportAccess().getLeftCurlyBracketKeyword_3()); }

	'{' 

{ after(grammarAccess.getEdgeImportAccess().getLeftCurlyBracketKeyword_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__EdgeImport__Group__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__EdgeImport__Group__4__Impl
	rule__EdgeImport__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__EdgeImport__Group__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getEdgeImportAccess().getGroup_4()); }
(rule__EdgeImport__Group_4__0)
{ after(grammarAccess.getEdgeImportAccess().getGroup_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__EdgeImport__Group__5
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__EdgeImport__Group__5__Impl
	rule__EdgeImport__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__EdgeImport__Group__5__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getEdgeImportAccess().getE_descriptionAssignment_5()); }
(rule__EdgeImport__E_descriptionAssignment_5)*
{ after(grammarAccess.getEdgeImportAccess().getE_descriptionAssignment_5()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__EdgeImport__Group__6
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__EdgeImport__Group__6__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__EdgeImport__Group__6__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getEdgeImportAccess().getRightCurlyBracketKeyword_6()); }

	'}' 

{ after(grammarAccess.getEdgeImportAccess().getRightCurlyBracketKeyword_6()); }
)

;
finally {
	restoreStackSize(stackSize);
}
















rule__EdgeImport__Group_4__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__EdgeImport__Group_4__0__Impl
	rule__EdgeImport__Group_4__1
;
finally {
	restoreStackSize(stackSize);
}

rule__EdgeImport__Group_4__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getEdgeImportAccess().getImportKeyword_4_0()); }

	'import:' 

{ after(grammarAccess.getEdgeImportAccess().getImportKeyword_4_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__EdgeImport__Group_4__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__EdgeImport__Group_4__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__EdgeImport__Group_4__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getEdgeImportAccess().getImportsAssignment_4_1()); }
(rule__EdgeImport__ImportsAssignment_4_1)
{ after(grammarAccess.getEdgeImportAccess().getImportsAssignment_4_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__EdgeDomainAssociation__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__EdgeDomainAssociation__Group__0__Impl
	rule__EdgeDomainAssociation__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__EdgeDomainAssociation__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getEdgeDomainAssociationAccess().getEdgeDomainAssociationAction_0()); }
(

)
{ after(grammarAccess.getEdgeDomainAssociationAccess().getEdgeDomainAssociationAction_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__EdgeDomainAssociation__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__EdgeDomainAssociation__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__EdgeDomainAssociation__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getEdgeDomainAssociationAccess().getAlternatives_1()); }
(rule__EdgeDomainAssociation__Alternatives_1)
{ after(grammarAccess.getEdgeDomainAssociationAccess().getAlternatives_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__EdgeDomainAssociation__Group_1_0__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__EdgeDomainAssociation__Group_1_0__0__Impl
	rule__EdgeDomainAssociation__Group_1_0__1
;
finally {
	restoreStackSize(stackSize);
}

rule__EdgeDomainAssociation__Group_1_0__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getEdgeDomainAssociationAccess().getQueryKeyword_1_0_0()); }

	'query:' 

{ after(grammarAccess.getEdgeDomainAssociationAccess().getQueryKeyword_1_0_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__EdgeDomainAssociation__Group_1_0__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__EdgeDomainAssociation__Group_1_0__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__EdgeDomainAssociation__Group_1_0__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getEdgeDomainAssociationAccess().getTarget_queryAssignment_1_0_1()); }
(rule__EdgeDomainAssociation__Target_queryAssignment_1_0_1)
{ after(grammarAccess.getEdgeDomainAssociationAccess().getTarget_queryAssignment_1_0_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__EdgeDomainElement__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__EdgeDomainElement__Group__0__Impl
	rule__EdgeDomainElement__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__EdgeDomainElement__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getEdgeDomainElementAccess().getEdgeDomainElementAction_0()); }
(

)
{ after(grammarAccess.getEdgeDomainElementAccess().getEdgeDomainElementAction_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__EdgeDomainElement__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__EdgeDomainElement__Group__1__Impl
	rule__EdgeDomainElement__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__EdgeDomainElement__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getEdgeDomainElementAccess().getThe_DomainAssignment_1()); }
(rule__EdgeDomainElement__The_DomainAssignment_1)
{ after(grammarAccess.getEdgeDomainElementAccess().getThe_DomainAssignment_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__EdgeDomainElement__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__EdgeDomainElement__Group__2__Impl
	rule__EdgeDomainElement__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__EdgeDomainElement__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getEdgeDomainElementAccess().getAlternatives_2()); }
(rule__EdgeDomainElement__Alternatives_2)
{ after(grammarAccess.getEdgeDomainElementAccess().getAlternatives_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__EdgeDomainElement__Group__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__EdgeDomainElement__Group__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__EdgeDomainElement__Group__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getEdgeDomainElementAccess().getAlternatives_3()); }
(rule__EdgeDomainElement__Alternatives_3)
{ after(grammarAccess.getEdgeDomainElementAccess().getAlternatives_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}










rule__EdgeDomainElement__Group_2_0__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__EdgeDomainElement__Group_2_0__0__Impl
	rule__EdgeDomainElement__Group_2_0__1
;
finally {
	restoreStackSize(stackSize);
}

rule__EdgeDomainElement__Group_2_0__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getEdgeDomainElementAccess().getTargetQueryKeyword_2_0_0()); }

	'target-query:' 

{ after(grammarAccess.getEdgeDomainElementAccess().getTargetQueryKeyword_2_0_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__EdgeDomainElement__Group_2_0__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__EdgeDomainElement__Group_2_0__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__EdgeDomainElement__Group_2_0__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getEdgeDomainElementAccess().getTarget_queryAssignment_2_0_1()); }
(rule__EdgeDomainElement__Target_queryAssignment_2_0_1)
{ after(grammarAccess.getEdgeDomainElementAccess().getTarget_queryAssignment_2_0_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__EdgeDomainElement__Group_2_1__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__EdgeDomainElement__Group_2_1__0__Impl
	rule__EdgeDomainElement__Group_2_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__EdgeDomainElement__Group_2_1__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getEdgeDomainElementAccess().getTargetAssociationKeyword_2_1_0()); }

	'target-association:' 

{ after(grammarAccess.getEdgeDomainElementAccess().getTargetAssociationKeyword_2_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__EdgeDomainElement__Group_2_1__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__EdgeDomainElement__Group_2_1__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__EdgeDomainElement__Group_2_1__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getEdgeDomainElementAccess().getTarget_LocatorAssignment_2_1_1()); }
(rule__EdgeDomainElement__Target_LocatorAssignment_2_1_1)
{ after(grammarAccess.getEdgeDomainElementAccess().getTarget_LocatorAssignment_2_1_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__EdgeDomainElement__Group_3_0__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__EdgeDomainElement__Group_3_0__0__Impl
	rule__EdgeDomainElement__Group_3_0__1
;
finally {
	restoreStackSize(stackSize);
}

rule__EdgeDomainElement__Group_3_0__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getEdgeDomainElementAccess().getSourceQueryKeyword_3_0_0()); }

	'source-query:' 

{ after(grammarAccess.getEdgeDomainElementAccess().getSourceQueryKeyword_3_0_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__EdgeDomainElement__Group_3_0__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__EdgeDomainElement__Group_3_0__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__EdgeDomainElement__Group_3_0__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getEdgeDomainElementAccess().getSource_queryAssignment_3_0_1()); }
(rule__EdgeDomainElement__Source_queryAssignment_3_0_1)
{ after(grammarAccess.getEdgeDomainElementAccess().getSource_queryAssignment_3_0_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__EdgeDomainElement__Group_3_1__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__EdgeDomainElement__Group_3_1__0__Impl
	rule__EdgeDomainElement__Group_3_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__EdgeDomainElement__Group_3_1__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getEdgeDomainElementAccess().getSourceAssociationKeyword_3_1_0()); }

	'source-association:' 

{ after(grammarAccess.getEdgeDomainElementAccess().getSourceAssociationKeyword_3_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__EdgeDomainElement__Group_3_1__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__EdgeDomainElement__Group_3_1__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__EdgeDomainElement__Group_3_1__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getEdgeDomainElementAccess().getSource_LocatorAssignment_3_1_1()); }
(rule__EdgeDomainElement__Source_LocatorAssignment_3_1_1)
{ after(grammarAccess.getEdgeDomainElementAccess().getSource_LocatorAssignment_3_1_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__LocalClass2__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__LocalClass2__Group__0__Impl
	rule__LocalClass2__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__LocalClass2__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getLocalClass2Access().getLocalClassAction_0()); }
(

)
{ after(grammarAccess.getLocalClass2Access().getLocalClassAction_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__LocalClass2__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__LocalClass2__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__LocalClass2__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getLocalClass2Access().getClassAssignment_1()); }
(rule__LocalClass2__ClassAssignment_1)
{ after(grammarAccess.getLocalClass2Access().getClassAssignment_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__ExternalClass__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__ExternalClass__Group__0__Impl
	rule__ExternalClass__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ExternalClass__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getExternalClassAccess().getExternalClassAction_0()); }
(

)
{ after(grammarAccess.getExternalClassAccess().getExternalClassAction_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__ExternalClass__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__ExternalClass__Group__1__Impl
	rule__ExternalClass__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__ExternalClass__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getExternalClassAccess().getExternalKeyword_1()); }

	'external' 

{ after(grammarAccess.getExternalClassAccess().getExternalKeyword_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__ExternalClass__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__ExternalClass__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ExternalClass__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getExternalClassAccess().getClassAssignment_2()); }
(rule__ExternalClass__ClassAssignment_2)
{ after(grammarAccess.getExternalClassAccess().getClassAssignment_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}








rule__LocalAssociation__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__LocalAssociation__Group__0__Impl
	rule__LocalAssociation__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__LocalAssociation__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getLocalAssociationAccess().getLocalAssociationAction_0()); }
(

)
{ after(grammarAccess.getLocalAssociationAccess().getLocalAssociationAction_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__LocalAssociation__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__LocalAssociation__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__LocalAssociation__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getLocalAssociationAccess().getReferenceAssignment_1()); }
(rule__LocalAssociation__ReferenceAssignment_1)
{ after(grammarAccess.getLocalAssociationAccess().getReferenceAssignment_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__ExternalAssociation__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__ExternalAssociation__Group__0__Impl
	rule__ExternalAssociation__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ExternalAssociation__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getExternalAssociationAccess().getExternalAssociationAction_0()); }
(

)
{ after(grammarAccess.getExternalAssociationAccess().getExternalAssociationAction_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__ExternalAssociation__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__ExternalAssociation__Group__1__Impl
	rule__ExternalAssociation__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__ExternalAssociation__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getExternalAssociationAccess().getExternalKeyword_1()); }

	'external' 

{ after(grammarAccess.getExternalAssociationAccess().getExternalKeyword_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__ExternalAssociation__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__ExternalAssociation__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ExternalAssociation__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getExternalAssociationAccess().getReferenceAssignment_2()); }
(rule__ExternalAssociation__ReferenceAssignment_2)
{ after(grammarAccess.getExternalAssociationAccess().getReferenceAssignment_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}








rule__LocalAttribute__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__LocalAttribute__Group__0__Impl
	rule__LocalAttribute__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__LocalAttribute__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getLocalAttributeAccess().getLocalAttributeAction_0()); }
(

)
{ after(grammarAccess.getLocalAttributeAccess().getLocalAttributeAction_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__LocalAttribute__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__LocalAttribute__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__LocalAttribute__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getLocalAttributeAccess().getAttributeAssignment_1()); }
(rule__LocalAttribute__AttributeAssignment_1)
{ after(grammarAccess.getLocalAttributeAccess().getAttributeAssignment_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__ExternalAttribute__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__ExternalAttribute__Group__0__Impl
	rule__ExternalAttribute__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ExternalAttribute__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getExternalAttributeAccess().getExternalAttributeAction_0()); }
(

)
{ after(grammarAccess.getExternalAttributeAccess().getExternalAttributeAction_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__ExternalAttribute__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__ExternalAttribute__Group__1__Impl
	rule__ExternalAttribute__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__ExternalAttribute__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getExternalAttributeAccess().getExternalKeyword_1()); }

	'external' 

{ after(grammarAccess.getExternalAttributeAccess().getExternalKeyword_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__ExternalAttribute__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__ExternalAttribute__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ExternalAttribute__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getExternalAttributeAccess().getAttributeAssignment_2()); }
(rule__ExternalAttribute__AttributeAssignment_2)
{ after(grammarAccess.getExternalAttributeAccess().getAttributeAssignment_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}








rule__Expression__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Expression__Group__0__Impl
	rule__Expression__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Expression__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getExpressionAccess().getExpressionAction_0()); }
(

)
{ after(grammarAccess.getExpressionAccess().getExpressionAction_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Expression__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Expression__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Expression__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getExpressionAccess().getGroup_1()); }
(rule__Expression__Group_1__0)?
{ after(grammarAccess.getExpressionAccess().getGroup_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__Expression__Group_1__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Expression__Group_1__0__Impl
	rule__Expression__Group_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Expression__Group_1__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getExpressionAccess().getExpressionElementsAssignment_1_0()); }
(rule__Expression__ExpressionElementsAssignment_1_0)
{ after(grammarAccess.getExpressionAccess().getExpressionElementsAssignment_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Expression__Group_1__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Expression__Group_1__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Expression__Group_1__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getExpressionAccess().getGroup_1_1()); }
(rule__Expression__Group_1_1__0)*
{ after(grammarAccess.getExpressionAccess().getGroup_1_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__Expression__Group_1_1__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Expression__Group_1_1__0__Impl
	rule__Expression__Group_1_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Expression__Group_1_1__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getExpressionAccess().getPlusSignKeyword_1_1_0()); }

	'+' 

{ after(grammarAccess.getExpressionAccess().getPlusSignKeyword_1_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Expression__Group_1_1__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Expression__Group_1_1__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Expression__Group_1_1__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getExpressionAccess().getExpressionElementsAssignment_1_1_1()); }
(rule__Expression__ExpressionElementsAssignment_1_1_1)
{ after(grammarAccess.getExpressionAccess().getExpressionElementsAssignment_1_1_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__JavaElement__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__JavaElement__Group__0__Impl
	rule__JavaElement__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__JavaElement__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getJavaElementAccess().getJavaElementAction_0()); }
(

)
{ after(grammarAccess.getJavaElementAccess().getJavaElementAction_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__JavaElement__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__JavaElement__Group__1__Impl
	rule__JavaElement__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__JavaElement__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getJavaElementAccess().getJavaKeyword_1()); }

	'Java' 

{ after(grammarAccess.getJavaElementAccess().getJavaKeyword_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__JavaElement__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__JavaElement__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__JavaElement__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getJavaElementAccess().getMethodAssignment_2()); }
(rule__JavaElement__MethodAssignment_2)
{ after(grammarAccess.getJavaElementAccess().getMethodAssignment_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}








rule__DomainElement__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__DomainElement__Group__0__Impl
	rule__DomainElement__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__DomainElement__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getDomainElementAccess().getDomainElementAction_0()); }
(

)
{ after(grammarAccess.getDomainElementAccess().getDomainElementAction_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__DomainElement__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__DomainElement__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__DomainElement__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getDomainElementAccess().getAttributeAssignment_1()); }
(rule__DomainElement__AttributeAssignment_1)
{ after(grammarAccess.getDomainElementAccess().getAttributeAssignment_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__StringElement__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__StringElement__Group__0__Impl
	rule__StringElement__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__StringElement__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getStringElementAccess().getStringElementAction_0()); }
(

)
{ after(grammarAccess.getStringElementAccess().getStringElementAction_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__StringElement__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__StringElement__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__StringElement__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getStringElementAccess().getValueAssignment_1()); }
(rule__StringElement__ValueAssignment_1)
{ after(grammarAccess.getStringElementAccess().getValueAssignment_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__FQN__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__FQN__Group__0__Impl
	rule__FQN__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__FQN__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getFQNAccess().getIDTerminalRuleCall_0()); }
	RULE_ID
{ after(grammarAccess.getFQNAccess().getIDTerminalRuleCall_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__FQN__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__FQN__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__FQN__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getFQNAccess().getGroup_1()); }
(rule__FQN__Group_1__0)*
{ after(grammarAccess.getFQNAccess().getGroup_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__FQN__Group_1__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__FQN__Group_1__0__Impl
	rule__FQN__Group_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__FQN__Group_1__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getFQNAccess().getFullStopKeyword_1_0()); }

	'.' 

{ after(grammarAccess.getFQNAccess().getFullStopKeyword_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__FQN__Group_1__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__FQN__Group_1__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__FQN__Group_1__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getFQNAccess().getIDTerminalRuleCall_1_1()); }
(	RULE_ID)
{ after(grammarAccess.getFQNAccess().getIDTerminalRuleCall_1_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}







rule__Diagrams__ImportsAssignment_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getDiagramsAccess().getImportsAbstractImportParserRuleCall_1_0()); }
	ruleAbstractImport{ after(grammarAccess.getDiagramsAccess().getImportsAbstractImportParserRuleCall_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Diagrams__DiagramsAssignment_2
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getDiagramsAccess().getDiagramsAspectParserRuleCall_2_0()); }
	ruleAspect{ after(grammarAccess.getDiagramsAccess().getDiagramsAspectParserRuleCall_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__ImportNameSpace__ImportedNamespaceAssignment_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getImportNameSpaceAccess().getImportedNamespaceFQNParserRuleCall_1_0()); }
	ruleFQN{ after(grammarAccess.getImportNameSpaceAccess().getImportedNamespaceFQNParserRuleCall_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__ImportGroup__ImportedGroupAssignment_2
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getImportGroupAccess().getImportedGroupEStringParserRuleCall_2_0()); }
	ruleEString{ after(grammarAccess.getImportGroupAccess().getImportedGroupEStringParserRuleCall_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__DiagramSet__NameAssignment_2
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getDiagramSetAccess().getNameFQNParserRuleCall_2_0()); }
	ruleFQN{ after(grammarAccess.getDiagramSetAccess().getNameFQNParserRuleCall_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__DiagramSet__DiagramsAssignment_4
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getDiagramSetAccess().getDiagramsDiagramRepresentationParserRuleCall_4_0()); }
	ruleDiagramRepresentation{ after(grammarAccess.getDiagramSetAccess().getDiagramsDiagramRepresentationParserRuleCall_4_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Diagram__NameAssignment_2
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getDiagramAccess().getNameSTRINGTerminalRuleCall_2_0()); }
	RULE_STRING{ after(grammarAccess.getDiagramAccess().getNameSTRINGTerminalRuleCall_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Diagram__DescriptionAssignment_4_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getDiagramAccess().getDescriptionSTRINGTerminalRuleCall_4_1_0()); }
	RULE_STRING{ after(grammarAccess.getDiagramAccess().getDescriptionSTRINGTerminalRuleCall_4_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Diagram__The_domainAssignment_5
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getDiagramAccess().getThe_domainDomainContainerParserRuleCall_5_0()); }
	ruleDomainContainer{ after(grammarAccess.getDiagramAccess().getThe_domainDomainContainerParserRuleCall_5_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Diagram__The_MappingSetAssignment_6
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getDiagramAccess().getThe_MappingSetMappingSetParserRuleCall_6_0()); }
	ruleMappingSet{ after(grammarAccess.getDiagramAccess().getThe_MappingSetMappingSetParserRuleCall_6_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Diagram__The_ActionSetAssignment_7
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getDiagramAccess().getThe_ActionSetActionSetParserRuleCall_7_0()); }
	ruleActionSet{ after(grammarAccess.getDiagramAccess().getThe_ActionSetActionSetParserRuleCall_7_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__DiagramExtension__NameAssignment_2
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getDiagramExtensionAccess().getNameSTRINGTerminalRuleCall_2_0()); }
	RULE_STRING{ after(grammarAccess.getDiagramExtensionAccess().getNameSTRINGTerminalRuleCall_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__DiagramExtension__Extented_diagramAssignment_4_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getDiagramExtensionAccess().getExtented_diagramDiagramDescriptionCrossReference_4_1_0()); }
(
{ before(grammarAccess.getDiagramExtensionAccess().getExtented_diagramDiagramDescriptionFQNParserRuleCall_4_1_0_1()); }
	ruleFQN{ after(grammarAccess.getDiagramExtensionAccess().getExtented_diagramDiagramDescriptionFQNParserRuleCall_4_1_0_1()); }
)
{ after(grammarAccess.getDiagramExtensionAccess().getExtented_diagramDiagramDescriptionCrossReference_4_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__DiagramExtension__The_MappingSetAssignment_5
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getDiagramExtensionAccess().getThe_MappingSetMappingSetParserRuleCall_5_0()); }
	ruleMappingSet{ after(grammarAccess.getDiagramExtensionAccess().getThe_MappingSetMappingSetParserRuleCall_5_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__DiagramExtension__The_ActionSetAssignment_6
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getDiagramExtensionAccess().getThe_ActionSetActionSetParserRuleCall_6_0()); }
	ruleActionSet{ after(grammarAccess.getDiagramExtensionAccess().getThe_ActionSetActionSetParserRuleCall_6_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MappingSet__Diagram_ElementsAssignment_3
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMappingSetAccess().getDiagram_ElementsDiagramChildrenParserRuleCall_3_0()); }
	ruleDiagramChildren{ after(grammarAccess.getMappingSetAccess().getDiagram_ElementsDiagramChildrenParserRuleCall_3_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__EdgeDescription__ConditionAssignment_3
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getEdgeDescriptionAccess().getConditionConditionParserRuleCall_3_0()); }
	ruleCondition{ after(grammarAccess.getEdgeDescriptionAccess().getConditionConditionParserRuleCall_3_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__EdgeDescription__Begin_LabelAssignment_4_2
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getEdgeDescriptionAccess().getBegin_LabelLabelParserRuleCall_4_2_0()); }
	ruleLabel{ after(grammarAccess.getEdgeDescriptionAccess().getBegin_LabelLabelParserRuleCall_4_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__EdgeDescription__Center_labelAssignment_5_2
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getEdgeDescriptionAccess().getCenter_labelLabelParserRuleCall_5_2_0()); }
	ruleLabel{ after(grammarAccess.getEdgeDescriptionAccess().getCenter_labelLabelParserRuleCall_5_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__EdgeDescription__End_labelAssignment_6_2
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getEdgeDescriptionAccess().getEnd_labelLabelParserRuleCall_6_2_0()); }
	ruleLabel{ after(grammarAccess.getEdgeDescriptionAccess().getEnd_labelLabelParserRuleCall_6_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__EdgeDescription__StyleAssignment_7
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getEdgeDescriptionAccess().getStyleEdgeStyleParserRuleCall_7_0()); }
	ruleEdgeStyle{ after(grammarAccess.getEdgeDescriptionAccess().getStyleEdgeStyleParserRuleCall_7_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Condition__ExpressionAssignment_2
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getConditionAccess().getExpressionForeignExpressionElementParserRuleCall_2_0()); }
	ruleForeignExpressionElement{ after(grammarAccess.getConditionAccess().getExpressionForeignExpressionElementParserRuleCall_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__EdgeStyle__LineStyleAssignment_3_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getEdgeStyleAccess().getLineStyleLineStyleEnumRuleCall_3_1_0()); }
	ruleLineStyle{ after(grammarAccess.getEdgeStyleAccess().getLineStyleLineStyleEnumRuleCall_3_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__EdgeStyle__BeginDecoratorAssignment_4_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getEdgeStyleAccess().getBeginDecoratorEdgeArrowsEnumRuleCall_4_1_0()); }
	ruleEdgeArrows{ after(grammarAccess.getEdgeStyleAccess().getBeginDecoratorEdgeArrowsEnumRuleCall_4_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__EdgeStyle__EndDecoratorAssignment_5_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getEdgeStyleAccess().getEndDecoratorEdgeArrowsEnumRuleCall_5_1_0()); }
	ruleEdgeArrows{ after(grammarAccess.getEdgeStyleAccess().getEndDecoratorEdgeArrowsEnumRuleCall_5_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__EdgeStyle__ColorAssignment_6_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getEdgeStyleAccess().getColorSystemColorsEnumRuleCall_6_1_0()); }
	ruleSystemColors{ after(grammarAccess.getEdgeStyleAccess().getColorSystemColorsEnumRuleCall_6_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Container__NameAssignment_2
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getContainerAccess().getNameEStringParserRuleCall_2_0()); }
	ruleEString{ after(grammarAccess.getContainerAccess().getNameEStringParserRuleCall_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Container__ImportsAssignment_4_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getContainerAccess().getImportsContainerMappingCrossReference_4_1_0()); }
(
{ before(grammarAccess.getContainerAccess().getImportsContainerMappingFQNParserRuleCall_4_1_0_1()); }
	ruleFQN{ after(grammarAccess.getContainerAccess().getImportsContainerMappingFQNParserRuleCall_4_1_0_1()); }
)
{ after(grammarAccess.getContainerAccess().getImportsContainerMappingCrossReference_4_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Container__The_domainAssignment_5_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getContainerAccess().getThe_domainNodeDomainElementParserRuleCall_5_1_0()); }
	ruleNodeDomainElement{ after(grammarAccess.getContainerAccess().getThe_domainNodeDomainElementParserRuleCall_5_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Container__ContentLayoutAssignment_6_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getContainerAccess().getContentLayoutContainerLayoutEnumRuleCall_6_1_0()); }
	ruleContainerLayout{ after(grammarAccess.getContainerAccess().getContentLayoutContainerLayoutEnumRuleCall_6_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Container__StyleAssignment_7
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getContainerAccess().getStyleContainerDescriptionParserRuleCall_7_0()); }
	ruleContainerDescription{ after(grammarAccess.getContainerAccess().getStyleContainerDescriptionParserRuleCall_7_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Container__ChildrenAssignment_8
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getContainerAccess().getChildrenContainerChildrenParserRuleCall_8_0()); }
	ruleContainerChildren{ after(grammarAccess.getContainerAccess().getChildrenContainerChildrenParserRuleCall_8_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__ContainerChildren__Reused_nodesAssignment_3_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getContainerChildrenAccess().getReused_nodesAbstractNodeCrossReference_3_1_0()); }
(
{ before(grammarAccess.getContainerChildrenAccess().getReused_nodesAbstractNodeFQNParserRuleCall_3_1_0_1()); }
	ruleFQN{ after(grammarAccess.getContainerChildrenAccess().getReused_nodesAbstractNodeFQNParserRuleCall_3_1_0_1()); }
)
{ after(grammarAccess.getContainerChildrenAccess().getReused_nodesAbstractNodeCrossReference_3_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__ContainerChildren__Reused_nodesAssignment_3_2_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getContainerChildrenAccess().getReused_nodesAbstractNodeCrossReference_3_2_1_0()); }
(
{ before(grammarAccess.getContainerChildrenAccess().getReused_nodesAbstractNodeFQNParserRuleCall_3_2_1_0_1()); }
	ruleFQN{ after(grammarAccess.getContainerChildrenAccess().getReused_nodesAbstractNodeFQNParserRuleCall_3_2_1_0_1()); }
)
{ after(grammarAccess.getContainerChildrenAccess().getReused_nodesAbstractNodeCrossReference_3_2_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__ContainerChildren__Owned_nodesAssignment_4
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getContainerChildrenAccess().getOwned_nodesAbstractNodeParserRuleCall_4_0()); }
	ruleAbstractNode{ after(grammarAccess.getContainerChildrenAccess().getOwned_nodesAbstractNodeParserRuleCall_4_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__NodeDomainElement__Domain_ClassAssignment_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getNodeDomainElementAccess().getDomain_ClassAbstractClassParserRuleCall_1_0()); }
	ruleAbstractClass{ after(grammarAccess.getNodeDomainElementAccess().getDomain_ClassAbstractClassParserRuleCall_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__NodeDomainElement__QueryAssignment_2_1_0_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getNodeDomainElementAccess().getQuerySTRINGTerminalRuleCall_2_1_0_1_0()); }
	RULE_STRING{ after(grammarAccess.getNodeDomainElementAccess().getQuerySTRINGTerminalRuleCall_2_1_0_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__NodeDomainElement__Chlidren_listAssignment_2_1_1_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getNodeDomainElementAccess().getChlidren_listAbstractAssociation2ParserRuleCall_2_1_1_1_0()); }
	ruleAbstractAssociation2{ after(grammarAccess.getNodeDomainElementAccess().getChlidren_listAbstractAssociation2ParserRuleCall_2_1_1_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__ContainerDescription__ConditionAssignment_3
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getContainerDescriptionAccess().getConditionConditionParserRuleCall_3_0()); }
	ruleCondition{ after(grammarAccess.getContainerDescriptionAccess().getConditionConditionParserRuleCall_3_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__ContainerDescription__Node_LabelAssignment_4_2
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getContainerDescriptionAccess().getNode_LabelLabelParserRuleCall_4_2_0()); }
	ruleLabel{ after(grammarAccess.getContainerDescriptionAccess().getNode_LabelLabelParserRuleCall_4_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__ContainerDescription__StyleAssignment_5_2
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getContainerDescriptionAccess().getStyleAbstractContainerStyleParserRuleCall_5_2_0()); }
	ruleAbstractContainerStyle{ after(grammarAccess.getContainerDescriptionAccess().getStyleAbstractContainerStyleParserRuleCall_5_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__BasicStyle__BorderColorAssignment_3_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getBasicStyleAccess().getBorderColorSystemColorsEnumRuleCall_3_1_0()); }
	ruleSystemColors{ after(grammarAccess.getBasicStyleAccess().getBorderColorSystemColorsEnumRuleCall_3_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__BasicStyle__BackgroundColorAssignment_4_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getBasicStyleAccess().getBackgroundColorSystemColorsEnumRuleCall_4_1_0()); }
	ruleSystemColors{ after(grammarAccess.getBasicStyleAccess().getBackgroundColorSystemColorsEnumRuleCall_4_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__BasicStyle__FormAssignment_5_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getBasicStyleAccess().getFormNode_FormEnumRuleCall_5_1_0()); }
	ruleNode_Form{ after(grammarAccess.getBasicStyleAccess().getFormNode_FormEnumRuleCall_5_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__HistogramStyle__BorderColorAssignment_3_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getHistogramStyleAccess().getBorderColorSystemColorsEnumRuleCall_3_1_0()); }
	ruleSystemColors{ after(grammarAccess.getHistogramStyleAccess().getBorderColorSystemColorsEnumRuleCall_3_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__HistogramStyle__SectionsAssignment_4
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getHistogramStyleAccess().getSectionsHistogramSectionParserRuleCall_4_0()); }
	ruleHistogramSection{ after(grammarAccess.getHistogramStyleAccess().getSectionsHistogramSectionParserRuleCall_4_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__HistogramSection__BackgroundColorAssignment_3_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getHistogramSectionAccess().getBackgroundColorSystemColorsEnumRuleCall_3_1_0()); }
	ruleSystemColors{ after(grammarAccess.getHistogramSectionAccess().getBackgroundColorSystemColorsEnumRuleCall_3_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__HistogramSection__ForgroundColorAssignment_4_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getHistogramSectionAccess().getForgroundColorSystemColorsEnumRuleCall_4_1_0()); }
	ruleSystemColors{ after(grammarAccess.getHistogramSectionAccess().getForgroundColorSystemColorsEnumRuleCall_4_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__HistogramSection__MinValueAssignment_5_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getHistogramSectionAccess().getMinValueForeignExpressionElementParserRuleCall_5_1_0()); }
	ruleForeignExpressionElement{ after(grammarAccess.getHistogramSectionAccess().getMinValueForeignExpressionElementParserRuleCall_5_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__HistogramSection__ValueAssignment_6_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getHistogramSectionAccess().getValueForeignExpressionElementParserRuleCall_6_1_0()); }
	ruleForeignExpressionElement{ after(grammarAccess.getHistogramSectionAccess().getValueForeignExpressionElementParserRuleCall_6_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__HistogramSection__MaxValueAssignment_7_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getHistogramSectionAccess().getMaxValueForeignExpressionElementParserRuleCall_7_1_0()); }
	ruleForeignExpressionElement{ after(grammarAccess.getHistogramSectionAccess().getMaxValueForeignExpressionElementParserRuleCall_7_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__ImageStyle__BorderColorAssignment_3_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getImageStyleAccess().getBorderColorSystemColorsEnumRuleCall_3_1_0()); }
	ruleSystemColors{ after(grammarAccess.getImageStyleAccess().getBorderColorSystemColorsEnumRuleCall_3_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__ImageStyle__ImagePathAssignment_4_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getImageStyleAccess().getImagePathSTRINGTerminalRuleCall_4_1_0()); }
	RULE_STRING{ after(grammarAccess.getImageStyleAccess().getImagePathSTRINGTerminalRuleCall_4_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__FlatStyle__BorderColorAssignment_3_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getFlatStyleAccess().getBorderColorSystemColorsEnumRuleCall_3_1_0()); }
	ruleSystemColors{ after(grammarAccess.getFlatStyleAccess().getBorderColorSystemColorsEnumRuleCall_3_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__FlatStyle__BackgroundStyleAssignment_4_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getFlatStyleAccess().getBackgroundStyleBackgroundStyleEnumRuleCall_4_1_0()); }
	ruleBackgroundStyle{ after(grammarAccess.getFlatStyleAccess().getBackgroundStyleBackgroundStyleEnumRuleCall_4_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__FlatStyle__BackgroundColorAssignment_4_2
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getFlatStyleAccess().getBackgroundColorSystemColorsEnumRuleCall_4_2_0()); }
	ruleSystemColors{ after(grammarAccess.getFlatStyleAccess().getBackgroundColorSystemColorsEnumRuleCall_4_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__FlatStyle__ForgroundColorAssignment_5_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getFlatStyleAccess().getForgroundColorSystemColorsEnumRuleCall_5_1_0()); }
	ruleSystemColors{ after(grammarAccess.getFlatStyleAccess().getForgroundColorSystemColorsEnumRuleCall_5_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Label__ValueAssignment_1_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getLabelAccess().getValueExpressionParserRuleCall_1_1_0()); }
	ruleExpression{ after(grammarAccess.getLabelAccess().getValueExpressionParserRuleCall_1_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Label__BoldAssignment_2_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getLabelAccess().getBoldBoldKeyword_2_1_0()); }
(
{ before(grammarAccess.getLabelAccess().getBoldBoldKeyword_2_1_0()); }

	'bold' 

{ after(grammarAccess.getLabelAccess().getBoldBoldKeyword_2_1_0()); }
)

{ after(grammarAccess.getLabelAccess().getBoldBoldKeyword_2_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Label__ItalicAssignment_2_2
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getLabelAccess().getItalicItalicKeyword_2_2_0()); }
(
{ before(grammarAccess.getLabelAccess().getItalicItalicKeyword_2_2_0()); }

	'italic' 

{ after(grammarAccess.getLabelAccess().getItalicItalicKeyword_2_2_0()); }
)

{ after(grammarAccess.getLabelAccess().getItalicItalicKeyword_2_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Label__ColorAssignment_2_3
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getLabelAccess().getColorSystemColorsEnumRuleCall_2_3_0()); }
	ruleSystemColors{ after(grammarAccess.getLabelAccess().getColorSystemColorsEnumRuleCall_2_3_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Label__SizeAssignment_2_4
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getLabelAccess().getSizeEIntParserRuleCall_2_4_0()); }
	ruleEInt{ after(grammarAccess.getLabelAccess().getSizeEIntParserRuleCall_2_4_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Node__NameAssignment_2
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getNodeAccess().getNameEStringParserRuleCall_2_0()); }
	ruleEString{ after(grammarAccess.getNodeAccess().getNameEStringParserRuleCall_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Node__ImportsAssignment_4_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getNodeAccess().getImportsNodeMappingCrossReference_4_1_0()); }
(
{ before(grammarAccess.getNodeAccess().getImportsNodeMappingFQNParserRuleCall_4_1_0_1()); }
	ruleFQN{ after(grammarAccess.getNodeAccess().getImportsNodeMappingFQNParserRuleCall_4_1_0_1()); }
)
{ after(grammarAccess.getNodeAccess().getImportsNodeMappingCrossReference_4_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Node__The_domainAssignment_5_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getNodeAccess().getThe_domainNodeDomainElementParserRuleCall_5_1_0()); }
	ruleNodeDomainElement{ after(grammarAccess.getNodeAccess().getThe_domainNodeDomainElementParserRuleCall_5_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Node__StyleAssignment_6
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getNodeAccess().getStyleNodeDescriptionParserRuleCall_6_0()); }
	ruleNodeDescription{ after(grammarAccess.getNodeAccess().getStyleNodeDescriptionParserRuleCall_6_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Node__ChildrenAssignment_7
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getNodeAccess().getChildrenNodeChildrenParserRuleCall_7_0()); }
	ruleNodeChildren{ after(grammarAccess.getNodeAccess().getChildrenNodeChildrenParserRuleCall_7_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__NodeChildren__Reused_boderednodesAssignment_3_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getNodeChildrenAccess().getReused_boderednodesBorderedNodeCrossReference_3_1_0()); }
(
{ before(grammarAccess.getNodeChildrenAccess().getReused_boderednodesBorderedNodeFQNParserRuleCall_3_1_0_1()); }
	ruleFQN{ after(grammarAccess.getNodeChildrenAccess().getReused_boderednodesBorderedNodeFQNParserRuleCall_3_1_0_1()); }
)
{ after(grammarAccess.getNodeChildrenAccess().getReused_boderednodesBorderedNodeCrossReference_3_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__NodeChildren__Reused_boderednodesAssignment_3_2_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getNodeChildrenAccess().getReused_boderednodesBorderedNodeCrossReference_3_2_1_0()); }
(
{ before(grammarAccess.getNodeChildrenAccess().getReused_boderednodesBorderedNodeFQNParserRuleCall_3_2_1_0_1()); }
	ruleFQN{ after(grammarAccess.getNodeChildrenAccess().getReused_boderednodesBorderedNodeFQNParserRuleCall_3_2_1_0_1()); }
)
{ after(grammarAccess.getNodeChildrenAccess().getReused_boderednodesBorderedNodeCrossReference_3_2_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__NodeChildren__Owned_boderednodesAssignment_4
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getNodeChildrenAccess().getOwned_boderednodesBorderedNodeParserRuleCall_4_0()); }
	ruleBorderedNode{ after(grammarAccess.getNodeChildrenAccess().getOwned_boderednodesBorderedNodeParserRuleCall_4_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__BorderedNode__NameAssignment_2
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getBorderedNodeAccess().getNameEStringParserRuleCall_2_0()); }
	ruleEString{ after(grammarAccess.getBorderedNodeAccess().getNameEStringParserRuleCall_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__BorderedNode__ImportsAssignment_4_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getBorderedNodeAccess().getImportsNodeMappingCrossReference_4_1_0()); }
(
{ before(grammarAccess.getBorderedNodeAccess().getImportsNodeMappingFQNParserRuleCall_4_1_0_1()); }
	ruleFQN{ after(grammarAccess.getBorderedNodeAccess().getImportsNodeMappingFQNParserRuleCall_4_1_0_1()); }
)
{ after(grammarAccess.getBorderedNodeAccess().getImportsNodeMappingCrossReference_4_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__BorderedNode__The_domainAssignment_5_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getBorderedNodeAccess().getThe_domainNodeDomainElementParserRuleCall_5_1_0()); }
	ruleNodeDomainElement{ after(grammarAccess.getBorderedNodeAccess().getThe_domainNodeDomainElementParserRuleCall_5_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__BorderedNode__StyleAssignment_6
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getBorderedNodeAccess().getStyleNodeDescriptionParserRuleCall_6_0()); }
	ruleNodeDescription{ after(grammarAccess.getBorderedNodeAccess().getStyleNodeDescriptionParserRuleCall_6_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__NodeDescription__ConditionAssignment_3
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getNodeDescriptionAccess().getConditionConditionParserRuleCall_3_0()); }
	ruleCondition{ after(grammarAccess.getNodeDescriptionAccess().getConditionConditionParserRuleCall_3_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__NodeDescription__Node_LabelAssignment_4_2
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getNodeDescriptionAccess().getNode_LabelLabelParserRuleCall_4_2_0()); }
	ruleLabel{ after(grammarAccess.getNodeDescriptionAccess().getNode_LabelLabelParserRuleCall_4_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__NodeDescription__Label_positionAssignment_4_3_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getNodeDescriptionAccess().getLabel_positionLabelPositionEnumRuleCall_4_3_1_0()); }
	ruleLabelPosition{ after(grammarAccess.getNodeDescriptionAccess().getLabel_positionLabelPositionEnumRuleCall_4_3_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__NodeDescription__Label_alignementAssignment_4_4_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getNodeDescriptionAccess().getLabel_alignementLabelAlignmentEnumRuleCall_4_4_1_0()); }
	ruleLabelAlignment{ after(grammarAccess.getNodeDescriptionAccess().getLabel_alignementLabelAlignmentEnumRuleCall_4_4_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__NodeDescription__StyleAssignment_5_2
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getNodeDescriptionAccess().getStyleAbstractNodeStyleParserRuleCall_5_2_0()); }
	ruleAbstractNodeStyle{ after(grammarAccess.getNodeDescriptionAccess().getStyleAbstractNodeStyleParserRuleCall_5_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__ActionSet__ActionsAssignment_3
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getActionSetAccess().getActionsActionParserRuleCall_3_0()); }
	ruleAction{ after(grammarAccess.getActionSetAccess().getActionsActionParserRuleCall_3_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__ActionSet__OpenActionsAssignment_4
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getActionSetAccess().getOpenActionsOpenActionParserRuleCall_4_0()); }
	ruleOpenAction{ after(grammarAccess.getActionSetAccess().getOpenActionsOpenActionParserRuleCall_4_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__OpenAction__NameAssignment_2
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getOpenActionAccess().getNameEStringParserRuleCall_2_0()); }
	ruleEString{ after(grammarAccess.getOpenActionAccess().getNameEStringParserRuleCall_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__OpenAction__PreconditionAssignment_4_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getOpenActionAccess().getPreconditionEStringParserRuleCall_4_1_0()); }
	ruleEString{ after(grammarAccess.getOpenActionAccess().getPreconditionEStringParserRuleCall_4_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__OpenAction__LabelAssignment_5_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getOpenActionAccess().getLabelSTRINGTerminalRuleCall_5_1_0()); }
	RULE_STRING{ after(grammarAccess.getOpenActionAccess().getLabelSTRINGTerminalRuleCall_5_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__OpenAction__IconAssignment_6_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getOpenActionAccess().getIconSTRINGTerminalRuleCall_6_1_0()); }
	RULE_STRING{ after(grammarAccess.getOpenActionAccess().getIconSTRINGTerminalRuleCall_6_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Create__NameAssignment_2
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getCreateAccess().getNameEStringParserRuleCall_2_0()); }
	ruleEString{ after(grammarAccess.getCreateAccess().getNameEStringParserRuleCall_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Create__PreconditionAssignment_4_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getCreateAccess().getPreconditionEStringParserRuleCall_4_1_0()); }
	ruleEString{ after(grammarAccess.getCreateAccess().getPreconditionEStringParserRuleCall_4_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Create__LabelAssignment_5_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getCreateAccess().getLabelSTRINGTerminalRuleCall_5_1_0()); }
	RULE_STRING{ after(grammarAccess.getCreateAccess().getLabelSTRINGTerminalRuleCall_5_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Create__Tool_ForAssignment_6_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getCreateAccess().getTool_ForDiagramElementCrossReference_6_1_0()); }
(
{ before(grammarAccess.getCreateAccess().getTool_ForDiagramElementFQNParserRuleCall_6_1_0_1()); }
	ruleFQN{ after(grammarAccess.getCreateAccess().getTool_ForDiagramElementFQNParserRuleCall_6_1_0_1()); }
)
{ after(grammarAccess.getCreateAccess().getTool_ForDiagramElementCrossReference_6_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Create__IconAssignment_7_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getCreateAccess().getIconSTRINGTerminalRuleCall_7_1_0()); }
	RULE_STRING{ after(grammarAccess.getCreateAccess().getIconSTRINGTerminalRuleCall_7_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Delete__NameAssignment_2
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getDeleteAccess().getNameEStringParserRuleCall_2_0()); }
	ruleEString{ after(grammarAccess.getDeleteAccess().getNameEStringParserRuleCall_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Delete__PreconditionAssignment_4_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getDeleteAccess().getPreconditionEStringParserRuleCall_4_1_0()); }
	ruleEString{ after(grammarAccess.getDeleteAccess().getPreconditionEStringParserRuleCall_4_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Delete__LabelAssignment_5_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getDeleteAccess().getLabelSTRINGTerminalRuleCall_5_1_0()); }
	RULE_STRING{ after(grammarAccess.getDeleteAccess().getLabelSTRINGTerminalRuleCall_5_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Delete__Tool_ForAssignment_6_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getDeleteAccess().getTool_ForDiagramElementCrossReference_6_1_0()); }
(
{ before(grammarAccess.getDeleteAccess().getTool_ForDiagramElementFQNParserRuleCall_6_1_0_1()); }
	ruleFQN{ after(grammarAccess.getDeleteAccess().getTool_ForDiagramElementFQNParserRuleCall_6_1_0_1()); }
)
{ after(grammarAccess.getDeleteAccess().getTool_ForDiagramElementCrossReference_6_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Drop__NameAssignment_2
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getDropAccess().getNameEStringParserRuleCall_2_0()); }
	ruleEString{ after(grammarAccess.getDropAccess().getNameEStringParserRuleCall_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Drop__PreconditionAssignment_4_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getDropAccess().getPreconditionEStringParserRuleCall_4_1_0()); }
	ruleEString{ after(grammarAccess.getDropAccess().getPreconditionEStringParserRuleCall_4_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Drop__LabelAssignment_5_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getDropAccess().getLabelSTRINGTerminalRuleCall_5_1_0()); }
	RULE_STRING{ after(grammarAccess.getDropAccess().getLabelSTRINGTerminalRuleCall_5_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Drop__Tool_ForAssignment_6_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getDropAccess().getTool_ForDiagramElementCrossReference_6_1_0()); }
(
{ before(grammarAccess.getDropAccess().getTool_ForDiagramElementFQNParserRuleCall_6_1_0_1()); }
	ruleFQN{ after(grammarAccess.getDropAccess().getTool_ForDiagramElementFQNParserRuleCall_6_1_0_1()); }
)
{ after(grammarAccess.getDropAccess().getTool_ForDiagramElementCrossReference_6_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__ReconnectEdge__NameAssignment_2
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getReconnectEdgeAccess().getNameEStringParserRuleCall_2_0()); }
	ruleEString{ after(grammarAccess.getReconnectEdgeAccess().getNameEStringParserRuleCall_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__ReconnectEdge__PreconditionAssignment_4_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getReconnectEdgeAccess().getPreconditionEStringParserRuleCall_4_1_0()); }
	ruleEString{ after(grammarAccess.getReconnectEdgeAccess().getPreconditionEStringParserRuleCall_4_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__ReconnectEdge__LabelAssignment_5_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getReconnectEdgeAccess().getLabelSTRINGTerminalRuleCall_5_1_0()); }
	RULE_STRING{ after(grammarAccess.getReconnectEdgeAccess().getLabelSTRINGTerminalRuleCall_5_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__ReconnectEdge__Tool_ForAssignment_6_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getReconnectEdgeAccess().getTool_ForDiagramElementCrossReference_6_1_0()); }
(
{ before(grammarAccess.getReconnectEdgeAccess().getTool_ForDiagramElementFQNParserRuleCall_6_1_0_1()); }
	ruleFQN{ after(grammarAccess.getReconnectEdgeAccess().getTool_ForDiagramElementFQNParserRuleCall_6_1_0_1()); }
)
{ after(grammarAccess.getReconnectEdgeAccess().getTool_ForDiagramElementCrossReference_6_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__DomainContainer__The_domainAssignment_1_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getDomainContainerAccess().getThe_domainAbstractClassParserRuleCall_1_1_0()); }
	ruleAbstractClass{ after(grammarAccess.getDomainContainerAccess().getThe_domainAbstractClassParserRuleCall_1_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Edge__NameAssignment_2
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getEdgeAccess().getNameEStringParserRuleCall_2_0()); }
	ruleEString{ after(grammarAccess.getEdgeAccess().getNameEStringParserRuleCall_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Edge__The_domainAssignment_4_0_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getEdgeAccess().getThe_domainEdgeDomainAssociationParserRuleCall_4_0_1_0()); }
	ruleEdgeDomainAssociation{ after(grammarAccess.getEdgeAccess().getThe_domainEdgeDomainAssociationParserRuleCall_4_0_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Edge__The_domainAssignment_4_1_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getEdgeAccess().getThe_domainEdgeDomainElementParserRuleCall_4_1_1_0()); }
	ruleEdgeDomainElement{ after(grammarAccess.getEdgeAccess().getThe_domainEdgeDomainElementParserRuleCall_4_1_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Edge__SourceAssignment_5_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getEdgeAccess().getSourceDiagramElementCrossReference_5_1_0()); }
(
{ before(grammarAccess.getEdgeAccess().getSourceDiagramElementFQNParserRuleCall_5_1_0_1()); }
	ruleFQN{ after(grammarAccess.getEdgeAccess().getSourceDiagramElementFQNParserRuleCall_5_1_0_1()); }
)
{ after(grammarAccess.getEdgeAccess().getSourceDiagramElementCrossReference_5_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Edge__SourceAssignment_5_2_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getEdgeAccess().getSourceDiagramElementCrossReference_5_2_1_0()); }
(
{ before(grammarAccess.getEdgeAccess().getSourceDiagramElementFQNParserRuleCall_5_2_1_0_1()); }
	ruleFQN{ after(grammarAccess.getEdgeAccess().getSourceDiagramElementFQNParserRuleCall_5_2_1_0_1()); }
)
{ after(grammarAccess.getEdgeAccess().getSourceDiagramElementCrossReference_5_2_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Edge__TargetAssignment_6_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getEdgeAccess().getTargetDiagramElementCrossReference_6_1_0()); }
(
{ before(grammarAccess.getEdgeAccess().getTargetDiagramElementFQNParserRuleCall_6_1_0_1()); }
	ruleFQN{ after(grammarAccess.getEdgeAccess().getTargetDiagramElementFQNParserRuleCall_6_1_0_1()); }
)
{ after(grammarAccess.getEdgeAccess().getTargetDiagramElementCrossReference_6_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Edge__TargetAssignment_6_2_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getEdgeAccess().getTargetDiagramElementCrossReference_6_2_1_0()); }
(
{ before(grammarAccess.getEdgeAccess().getTargetDiagramElementFQNParserRuleCall_6_2_1_0_1()); }
	ruleFQN{ after(grammarAccess.getEdgeAccess().getTargetDiagramElementFQNParserRuleCall_6_2_1_0_1()); }
)
{ after(grammarAccess.getEdgeAccess().getTargetDiagramElementCrossReference_6_2_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Edge__E_descriptionAssignment_7
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getEdgeAccess().getE_descriptionEdgeDescriptionParserRuleCall_7_0()); }
	ruleEdgeDescription{ after(grammarAccess.getEdgeAccess().getE_descriptionEdgeDescriptionParserRuleCall_7_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__EdgeImport__NameAssignment_2
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getEdgeImportAccess().getNameEStringParserRuleCall_2_0()); }
	ruleEString{ after(grammarAccess.getEdgeImportAccess().getNameEStringParserRuleCall_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__EdgeImport__ImportsAssignment_4_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getEdgeImportAccess().getImportsEdgeMappingCrossReference_4_1_0()); }
(
{ before(grammarAccess.getEdgeImportAccess().getImportsEdgeMappingFQNParserRuleCall_4_1_0_1()); }
	ruleFQN{ after(grammarAccess.getEdgeImportAccess().getImportsEdgeMappingFQNParserRuleCall_4_1_0_1()); }
)
{ after(grammarAccess.getEdgeImportAccess().getImportsEdgeMappingCrossReference_4_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__EdgeImport__E_descriptionAssignment_5
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getEdgeImportAccess().getE_descriptionEdgeDescriptionParserRuleCall_5_0()); }
	ruleEdgeDescription{ after(grammarAccess.getEdgeImportAccess().getE_descriptionEdgeDescriptionParserRuleCall_5_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__EdgeDomainAssociation__Target_queryAssignment_1_0_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getEdgeDomainAssociationAccess().getTarget_querySTRINGTerminalRuleCall_1_0_1_0()); }
	RULE_STRING{ after(grammarAccess.getEdgeDomainAssociationAccess().getTarget_querySTRINGTerminalRuleCall_1_0_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__EdgeDomainAssociation__Target_LocatorAssignment_1_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getEdgeDomainAssociationAccess().getTarget_LocatorAbstractAssociation2ParserRuleCall_1_1_0()); }
	ruleAbstractAssociation2{ after(grammarAccess.getEdgeDomainAssociationAccess().getTarget_LocatorAbstractAssociation2ParserRuleCall_1_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__EdgeDomainElement__The_DomainAssignment_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getEdgeDomainElementAccess().getThe_DomainAbstractClassParserRuleCall_1_0()); }
	ruleAbstractClass{ after(grammarAccess.getEdgeDomainElementAccess().getThe_DomainAbstractClassParserRuleCall_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__EdgeDomainElement__Target_queryAssignment_2_0_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getEdgeDomainElementAccess().getTarget_querySTRINGTerminalRuleCall_2_0_1_0()); }
	RULE_STRING{ after(grammarAccess.getEdgeDomainElementAccess().getTarget_querySTRINGTerminalRuleCall_2_0_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__EdgeDomainElement__Target_LocatorAssignment_2_1_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getEdgeDomainElementAccess().getTarget_LocatorAbstractAssociation2ParserRuleCall_2_1_1_0()); }
	ruleAbstractAssociation2{ after(grammarAccess.getEdgeDomainElementAccess().getTarget_LocatorAbstractAssociation2ParserRuleCall_2_1_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__EdgeDomainElement__Source_queryAssignment_3_0_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getEdgeDomainElementAccess().getSource_querySTRINGTerminalRuleCall_3_0_1_0()); }
	RULE_STRING{ after(grammarAccess.getEdgeDomainElementAccess().getSource_querySTRINGTerminalRuleCall_3_0_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__EdgeDomainElement__Source_LocatorAssignment_3_1_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getEdgeDomainElementAccess().getSource_LocatorAbstractAssociation2ParserRuleCall_3_1_1_0()); }
	ruleAbstractAssociation2{ after(grammarAccess.getEdgeDomainElementAccess().getSource_LocatorAbstractAssociation2ParserRuleCall_3_1_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__LocalClass2__ClassAssignment_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getLocalClass2Access().getClassClassCrossReference_1_0()); }
(
{ before(grammarAccess.getLocalClass2Access().getClassClassFQNParserRuleCall_1_0_1()); }
	ruleFQN{ after(grammarAccess.getLocalClass2Access().getClassClassFQNParserRuleCall_1_0_1()); }
)
{ after(grammarAccess.getLocalClass2Access().getClassClassCrossReference_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__ExternalClass__ClassAssignment_2
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getExternalClassAccess().getClassEClassCrossReference_2_0()); }
(
{ before(grammarAccess.getExternalClassAccess().getClassEClassFQNParserRuleCall_2_0_1()); }
	ruleFQN{ after(grammarAccess.getExternalClassAccess().getClassEClassFQNParserRuleCall_2_0_1()); }
)
{ after(grammarAccess.getExternalClassAccess().getClassEClassCrossReference_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__LocalAssociation__ReferenceAssignment_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getLocalAssociationAccess().getReferenceAbstractAssociationCrossReference_1_0()); }
(
{ before(grammarAccess.getLocalAssociationAccess().getReferenceAbstractAssociationFQNParserRuleCall_1_0_1()); }
	ruleFQN{ after(grammarAccess.getLocalAssociationAccess().getReferenceAbstractAssociationFQNParserRuleCall_1_0_1()); }
)
{ after(grammarAccess.getLocalAssociationAccess().getReferenceAbstractAssociationCrossReference_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__ExternalAssociation__ReferenceAssignment_2
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getExternalAssociationAccess().getReferenceEReferenceCrossReference_2_0()); }
(
{ before(grammarAccess.getExternalAssociationAccess().getReferenceEReferenceFQNParserRuleCall_2_0_1()); }
	ruleFQN{ after(grammarAccess.getExternalAssociationAccess().getReferenceEReferenceFQNParserRuleCall_2_0_1()); }
)
{ after(grammarAccess.getExternalAssociationAccess().getReferenceEReferenceCrossReference_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__LocalAttribute__AttributeAssignment_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getLocalAttributeAccess().getAttributeAttributeCrossReference_1_0()); }
(
{ before(grammarAccess.getLocalAttributeAccess().getAttributeAttributeFQNParserRuleCall_1_0_1()); }
	ruleFQN{ after(grammarAccess.getLocalAttributeAccess().getAttributeAttributeFQNParserRuleCall_1_0_1()); }
)
{ after(grammarAccess.getLocalAttributeAccess().getAttributeAttributeCrossReference_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__ExternalAttribute__AttributeAssignment_2
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getExternalAttributeAccess().getAttributeEAttributeCrossReference_2_0()); }
(
{ before(grammarAccess.getExternalAttributeAccess().getAttributeEAttributeFQNParserRuleCall_2_0_1()); }
	ruleFQN{ after(grammarAccess.getExternalAttributeAccess().getAttributeEAttributeFQNParserRuleCall_2_0_1()); }
)
{ after(grammarAccess.getExternalAttributeAccess().getAttributeEAttributeCrossReference_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Expression__ExpressionElementsAssignment_1_0
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getExpressionAccess().getExpressionElementsExpressionElementParserRuleCall_1_0_0()); }
	ruleExpressionElement{ after(grammarAccess.getExpressionAccess().getExpressionElementsExpressionElementParserRuleCall_1_0_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Expression__ExpressionElementsAssignment_1_1_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getExpressionAccess().getExpressionElementsExpressionElementParserRuleCall_1_1_1_0()); }
	ruleExpressionElement{ after(grammarAccess.getExpressionAccess().getExpressionElementsExpressionElementParserRuleCall_1_1_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__JavaElement__MethodAssignment_2
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getJavaElementAccess().getMethodFQNParserRuleCall_2_0()); }
	ruleFQN{ after(grammarAccess.getJavaElementAccess().getMethodFQNParserRuleCall_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__DomainElement__AttributeAssignment_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getDomainElementAccess().getAttributeAttributeCrossReference_1_0()); }
(
{ before(grammarAccess.getDomainElementAccess().getAttributeAttributeFQNParserRuleCall_1_0_1()); }
	ruleFQN{ after(grammarAccess.getDomainElementAccess().getAttributeAttributeFQNParserRuleCall_1_0_1()); }
)
{ after(grammarAccess.getDomainElementAccess().getAttributeAttributeCrossReference_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__StringElement__ValueAssignment_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getStringElementAccess().getValueSTRINGTerminalRuleCall_1_0()); }
	RULE_STRING{ after(grammarAccess.getStringElementAccess().getValueSTRINGTerminalRuleCall_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;



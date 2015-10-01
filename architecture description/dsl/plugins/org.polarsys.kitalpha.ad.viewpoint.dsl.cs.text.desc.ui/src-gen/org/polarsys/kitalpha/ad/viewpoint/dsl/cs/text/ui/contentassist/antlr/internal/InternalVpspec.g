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
grammar InternalVpspec;

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
import org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.VpspecGrammarAccess;

}

@parser::members {
 
 	private VpspecGrammarAccess grammarAccess;
 	
    public void setGrammarAccess(VpspecGrammarAccess grammarAccess) {
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




// Entry rule entryRuleViewpoint
entryRuleViewpoint 
:
{ before(grammarAccess.getViewpointRule()); }
	 ruleViewpoint
{ after(grammarAccess.getViewpointRule()); } 
	 EOF 
;

// Rule Viewpoint
ruleViewpoint
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getViewpointAccess().getGroup()); }
(rule__Viewpoint__Group__0)
{ after(grammarAccess.getViewpointAccess().getGroup()); }
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




rule__Viewpoint__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Viewpoint__Group__0__Impl
	rule__Viewpoint__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Viewpoint__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getViewpointAccess().getViewpointAction_0()); }
(

)
{ after(grammarAccess.getViewpointAccess().getViewpointAction_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Viewpoint__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Viewpoint__Group__1__Impl
	rule__Viewpoint__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Viewpoint__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getViewpointAccess().getViewpointKeyword_1()); }

	'Viewpoint' 

{ after(grammarAccess.getViewpointAccess().getViewpointKeyword_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Viewpoint__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Viewpoint__Group__2__Impl
	rule__Viewpoint__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Viewpoint__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getViewpointAccess().getShortNameAssignment_2()); }
(rule__Viewpoint__ShortNameAssignment_2)?
{ after(grammarAccess.getViewpointAccess().getShortNameAssignment_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Viewpoint__Group__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Viewpoint__Group__3__Impl
	rule__Viewpoint__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__Viewpoint__Group__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getViewpointAccess().getLeftCurlyBracketKeyword_3()); }

	'{' 

{ after(grammarAccess.getViewpointAccess().getLeftCurlyBracketKeyword_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Viewpoint__Group__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Viewpoint__Group__4__Impl
	rule__Viewpoint__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__Viewpoint__Group__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getViewpointAccess().getGroup_4()); }
(rule__Viewpoint__Group_4__0)
{ after(grammarAccess.getViewpointAccess().getGroup_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Viewpoint__Group__5
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Viewpoint__Group__5__Impl
	rule__Viewpoint__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__Viewpoint__Group__5__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getViewpointAccess().getGroup_5()); }
(rule__Viewpoint__Group_5__0)?
{ after(grammarAccess.getViewpointAccess().getGroup_5()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Viewpoint__Group__6
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Viewpoint__Group__6__Impl
	rule__Viewpoint__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__Viewpoint__Group__6__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getViewpointAccess().getGroup_6()); }
(rule__Viewpoint__Group_6__0)?
{ after(grammarAccess.getViewpointAccess().getGroup_6()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Viewpoint__Group__7
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Viewpoint__Group__7__Impl
	rule__Viewpoint__Group__8
;
finally {
	restoreStackSize(stackSize);
}

rule__Viewpoint__Group__7__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getViewpointAccess().getGroup_7()); }
(rule__Viewpoint__Group_7__0)?
{ after(grammarAccess.getViewpointAccess().getGroup_7()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Viewpoint__Group__8
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Viewpoint__Group__8__Impl
	rule__Viewpoint__Group__9
;
finally {
	restoreStackSize(stackSize);
}

rule__Viewpoint__Group__8__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getViewpointAccess().getGroup_8()); }
(rule__Viewpoint__Group_8__0)?
{ after(grammarAccess.getViewpointAccess().getGroup_8()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Viewpoint__Group__9
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Viewpoint__Group__9__Impl
	rule__Viewpoint__Group__10
;
finally {
	restoreStackSize(stackSize);
}

rule__Viewpoint__Group__9__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getViewpointAccess().getGroup_9()); }
(rule__Viewpoint__Group_9__0)?
{ after(grammarAccess.getViewpointAccess().getGroup_9()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Viewpoint__Group__10
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Viewpoint__Group__10__Impl
	rule__Viewpoint__Group__11
;
finally {
	restoreStackSize(stackSize);
}

rule__Viewpoint__Group__10__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getViewpointAccess().getGroup_10()); }
(rule__Viewpoint__Group_10__0)?
{ after(grammarAccess.getViewpointAccess().getGroup_10()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Viewpoint__Group__11
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Viewpoint__Group__11__Impl
	rule__Viewpoint__Group__12
;
finally {
	restoreStackSize(stackSize);
}

rule__Viewpoint__Group__11__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getViewpointAccess().getGroup_11()); }
(rule__Viewpoint__Group_11__0)?
{ after(grammarAccess.getViewpointAccess().getGroup_11()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Viewpoint__Group__12
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Viewpoint__Group__12__Impl
	rule__Viewpoint__Group__13
;
finally {
	restoreStackSize(stackSize);
}

rule__Viewpoint__Group__12__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getViewpointAccess().getGroup_12()); }
(rule__Viewpoint__Group_12__0)?
{ after(grammarAccess.getViewpointAccess().getGroup_12()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Viewpoint__Group__13
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Viewpoint__Group__13__Impl
	rule__Viewpoint__Group__14
;
finally {
	restoreStackSize(stackSize);
}

rule__Viewpoint__Group__13__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getViewpointAccess().getGroup_13()); }
(rule__Viewpoint__Group_13__0)?
{ after(grammarAccess.getViewpointAccess().getGroup_13()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Viewpoint__Group__14
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Viewpoint__Group__14__Impl
	rule__Viewpoint__Group__15
;
finally {
	restoreStackSize(stackSize);
}

rule__Viewpoint__Group__14__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getViewpointAccess().getGroup_14()); }
(rule__Viewpoint__Group_14__0)?
{ after(grammarAccess.getViewpointAccess().getGroup_14()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Viewpoint__Group__15
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Viewpoint__Group__15__Impl
	rule__Viewpoint__Group__16
;
finally {
	restoreStackSize(stackSize);
}

rule__Viewpoint__Group__15__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getViewpointAccess().getGroup_15()); }
(rule__Viewpoint__Group_15__0)?
{ after(grammarAccess.getViewpointAccess().getGroup_15()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Viewpoint__Group__16
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Viewpoint__Group__16__Impl
	rule__Viewpoint__Group__17
;
finally {
	restoreStackSize(stackSize);
}

rule__Viewpoint__Group__16__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getViewpointAccess().getGroup_16()); }
(rule__Viewpoint__Group_16__0)?
{ after(grammarAccess.getViewpointAccess().getGroup_16()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Viewpoint__Group__17
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Viewpoint__Group__17__Impl
	rule__Viewpoint__Group__18
;
finally {
	restoreStackSize(stackSize);
}

rule__Viewpoint__Group__17__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getViewpointAccess().getGroup_17()); }
(rule__Viewpoint__Group_17__0)?
{ after(grammarAccess.getViewpointAccess().getGroup_17()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Viewpoint__Group__18
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Viewpoint__Group__18__Impl
	rule__Viewpoint__Group__19
;
finally {
	restoreStackSize(stackSize);
}

rule__Viewpoint__Group__18__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getViewpointAccess().getGroup_18()); }
(rule__Viewpoint__Group_18__0)?
{ after(grammarAccess.getViewpointAccess().getGroup_18()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Viewpoint__Group__19
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Viewpoint__Group__19__Impl
	rule__Viewpoint__Group__20
;
finally {
	restoreStackSize(stackSize);
}

rule__Viewpoint__Group__19__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getViewpointAccess().getGroup_19()); }
(rule__Viewpoint__Group_19__0)?
{ after(grammarAccess.getViewpointAccess().getGroup_19()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Viewpoint__Group__20
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Viewpoint__Group__20__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Viewpoint__Group__20__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getViewpointAccess().getRightCurlyBracketKeyword_20()); }

	'}' 

{ after(grammarAccess.getViewpointAccess().getRightCurlyBracketKeyword_20()); }
)

;
finally {
	restoreStackSize(stackSize);
}












































rule__Viewpoint__Group_4__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Viewpoint__Group_4__0__Impl
	rule__Viewpoint__Group_4__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Viewpoint__Group_4__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getViewpointAccess().getNameKeyword_4_0()); }

	'name:' 

{ after(grammarAccess.getViewpointAccess().getNameKeyword_4_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Viewpoint__Group_4__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Viewpoint__Group_4__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Viewpoint__Group_4__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getViewpointAccess().getNameAssignment_4_1()); }
(rule__Viewpoint__NameAssignment_4_1)
{ after(grammarAccess.getViewpointAccess().getNameAssignment_4_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__Viewpoint__Group_5__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Viewpoint__Group_5__0__Impl
	rule__Viewpoint__Group_5__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Viewpoint__Group_5__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getViewpointAccess().getDescriptionKeyword_5_0()); }

	'description:' 

{ after(grammarAccess.getViewpointAccess().getDescriptionKeyword_5_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Viewpoint__Group_5__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Viewpoint__Group_5__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Viewpoint__Group_5__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getViewpointAccess().getDescriptionAssignment_5_1()); }
(rule__Viewpoint__DescriptionAssignment_5_1)
{ after(grammarAccess.getViewpointAccess().getDescriptionAssignment_5_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__Viewpoint__Group_6__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Viewpoint__Group_6__0__Impl
	rule__Viewpoint__Group_6__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Viewpoint__Group_6__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getViewpointAccess().getExtendsKeyword_6_0()); }

	'extends' 

{ after(grammarAccess.getViewpointAccess().getExtendsKeyword_6_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Viewpoint__Group_6__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Viewpoint__Group_6__1__Impl
	rule__Viewpoint__Group_6__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Viewpoint__Group_6__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getViewpointAccess().getParentsAssignment_6_1()); }
(rule__Viewpoint__ParentsAssignment_6_1)
{ after(grammarAccess.getViewpointAccess().getParentsAssignment_6_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Viewpoint__Group_6__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Viewpoint__Group_6__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Viewpoint__Group_6__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getViewpointAccess().getGroup_6_2()); }
(rule__Viewpoint__Group_6_2__0)*
{ after(grammarAccess.getViewpointAccess().getGroup_6_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}








rule__Viewpoint__Group_6_2__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Viewpoint__Group_6_2__0__Impl
	rule__Viewpoint__Group_6_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Viewpoint__Group_6_2__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getViewpointAccess().getCommaKeyword_6_2_0()); }

	',' 

{ after(grammarAccess.getViewpointAccess().getCommaKeyword_6_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Viewpoint__Group_6_2__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Viewpoint__Group_6_2__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Viewpoint__Group_6_2__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getViewpointAccess().getParentsAssignment_6_2_1()); }
(rule__Viewpoint__ParentsAssignment_6_2_1)
{ after(grammarAccess.getViewpointAccess().getParentsAssignment_6_2_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__Viewpoint__Group_7__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Viewpoint__Group_7__0__Impl
	rule__Viewpoint__Group_7__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Viewpoint__Group_7__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getViewpointAccess().getAggregatesKeyword_7_0()); }

	'aggregates' 

{ after(grammarAccess.getViewpointAccess().getAggregatesKeyword_7_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Viewpoint__Group_7__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Viewpoint__Group_7__1__Impl
	rule__Viewpoint__Group_7__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Viewpoint__Group_7__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getViewpointAccess().getDependenciesAssignment_7_1()); }
(rule__Viewpoint__DependenciesAssignment_7_1)
{ after(grammarAccess.getViewpointAccess().getDependenciesAssignment_7_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Viewpoint__Group_7__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Viewpoint__Group_7__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Viewpoint__Group_7__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getViewpointAccess().getGroup_7_2()); }
(rule__Viewpoint__Group_7_2__0)*
{ after(grammarAccess.getViewpointAccess().getGroup_7_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}








rule__Viewpoint__Group_7_2__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Viewpoint__Group_7_2__0__Impl
	rule__Viewpoint__Group_7_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Viewpoint__Group_7_2__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getViewpointAccess().getCommaKeyword_7_2_0()); }

	',' 

{ after(grammarAccess.getViewpointAccess().getCommaKeyword_7_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Viewpoint__Group_7_2__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Viewpoint__Group_7_2__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Viewpoint__Group_7_2__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getViewpointAccess().getDependenciesAssignment_7_2_1()); }
(rule__Viewpoint__DependenciesAssignment_7_2_1)
{ after(grammarAccess.getViewpointAccess().getDependenciesAssignment_7_2_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__Viewpoint__Group_8__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Viewpoint__Group_8__0__Impl
	rule__Viewpoint__Group_8__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Viewpoint__Group_8__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getViewpointAccess().getUsesViewpointKeyword_8_0()); }

	'uses viewpoint' 

{ after(grammarAccess.getViewpointAccess().getUsesViewpointKeyword_8_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Viewpoint__Group_8__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Viewpoint__Group_8__1__Impl
	rule__Viewpoint__Group_8__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Viewpoint__Group_8__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getViewpointAccess().getUseViewpointAssignment_8_1()); }
(rule__Viewpoint__UseViewpointAssignment_8_1)
{ after(grammarAccess.getViewpointAccess().getUseViewpointAssignment_8_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Viewpoint__Group_8__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Viewpoint__Group_8__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Viewpoint__Group_8__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getViewpointAccess().getGroup_8_2()); }
(rule__Viewpoint__Group_8_2__0)*
{ after(grammarAccess.getViewpointAccess().getGroup_8_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}








rule__Viewpoint__Group_8_2__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Viewpoint__Group_8_2__0__Impl
	rule__Viewpoint__Group_8_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Viewpoint__Group_8_2__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getViewpointAccess().getCommaKeyword_8_2_0()); }

	',' 

{ after(grammarAccess.getViewpointAccess().getCommaKeyword_8_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Viewpoint__Group_8_2__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Viewpoint__Group_8_2__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Viewpoint__Group_8_2__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getViewpointAccess().getUseViewpointAssignment_8_2_1()); }
(rule__Viewpoint__UseViewpointAssignment_8_2_1)
{ after(grammarAccess.getViewpointAccess().getUseViewpointAssignment_8_2_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__Viewpoint__Group_9__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Viewpoint__Group_9__0__Impl
	rule__Viewpoint__Group_9__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Viewpoint__Group_9__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getViewpointAccess().getUsesModelKeyword_9_0()); }

	'uses-model' 

{ after(grammarAccess.getViewpointAccess().getUsesModelKeyword_9_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Viewpoint__Group_9__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Viewpoint__Group_9__1__Impl
	rule__Viewpoint__Group_9__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Viewpoint__Group_9__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getViewpointAccess().getUseAnyEMFResourceAssignment_9_1()); }
(rule__Viewpoint__UseAnyEMFResourceAssignment_9_1)
{ after(grammarAccess.getViewpointAccess().getUseAnyEMFResourceAssignment_9_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Viewpoint__Group_9__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Viewpoint__Group_9__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Viewpoint__Group_9__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getViewpointAccess().getGroup_9_2()); }
(rule__Viewpoint__Group_9_2__0)*
{ after(grammarAccess.getViewpointAccess().getGroup_9_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}








rule__Viewpoint__Group_9_2__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Viewpoint__Group_9_2__0__Impl
	rule__Viewpoint__Group_9_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Viewpoint__Group_9_2__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getViewpointAccess().getCommaKeyword_9_2_0()); }

	',' 

{ after(grammarAccess.getViewpointAccess().getCommaKeyword_9_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Viewpoint__Group_9_2__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Viewpoint__Group_9_2__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Viewpoint__Group_9_2__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getViewpointAccess().getUseAnyEMFResourceAssignment_9_2_1()); }
(rule__Viewpoint__UseAnyEMFResourceAssignment_9_2_1)
{ after(grammarAccess.getViewpointAccess().getUseAnyEMFResourceAssignment_9_2_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__Viewpoint__Group_10__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Viewpoint__Group_10__0__Impl
	rule__Viewpoint__Group_10__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Viewpoint__Group_10__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getViewpointAccess().getUsesDiagramKeyword_10_0()); }

	'uses-diagram' 

{ after(grammarAccess.getViewpointAccess().getUsesDiagramKeyword_10_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Viewpoint__Group_10__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Viewpoint__Group_10__1__Impl
	rule__Viewpoint__Group_10__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Viewpoint__Group_10__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getViewpointAccess().getUseDiagramResourceAssignment_10_1()); }
(rule__Viewpoint__UseDiagramResourceAssignment_10_1)
{ after(grammarAccess.getViewpointAccess().getUseDiagramResourceAssignment_10_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Viewpoint__Group_10__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Viewpoint__Group_10__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Viewpoint__Group_10__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getViewpointAccess().getGroup_10_2()); }
(rule__Viewpoint__Group_10_2__0)*
{ after(grammarAccess.getViewpointAccess().getGroup_10_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}








rule__Viewpoint__Group_10_2__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Viewpoint__Group_10_2__0__Impl
	rule__Viewpoint__Group_10_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Viewpoint__Group_10_2__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getViewpointAccess().getCommaKeyword_10_2_0()); }

	',' 

{ after(grammarAccess.getViewpointAccess().getCommaKeyword_10_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Viewpoint__Group_10_2__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Viewpoint__Group_10_2__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Viewpoint__Group_10_2__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getViewpointAccess().getUseDiagramResourceAssignment_10_2_1()); }
(rule__Viewpoint__UseDiagramResourceAssignment_10_2_1)
{ after(grammarAccess.getViewpointAccess().getUseDiagramResourceAssignment_10_2_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__Viewpoint__Group_11__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Viewpoint__Group_11__0__Impl
	rule__Viewpoint__Group_11__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Viewpoint__Group_11__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getViewpointAccess().getUsesWorkspaceKeyword_11_0()); }

	'uses-workspace' 

{ after(grammarAccess.getViewpointAccess().getUsesWorkspaceKeyword_11_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Viewpoint__Group_11__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Viewpoint__Group_11__1__Impl
	rule__Viewpoint__Group_11__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Viewpoint__Group_11__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getViewpointAccess().getUseWorkspaceResourceAssignment_11_1()); }
(rule__Viewpoint__UseWorkspaceResourceAssignment_11_1)
{ after(grammarAccess.getViewpointAccess().getUseWorkspaceResourceAssignment_11_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Viewpoint__Group_11__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Viewpoint__Group_11__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Viewpoint__Group_11__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getViewpointAccess().getGroup_11_2()); }
(rule__Viewpoint__Group_11_2__0)*
{ after(grammarAccess.getViewpointAccess().getGroup_11_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}








rule__Viewpoint__Group_11_2__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Viewpoint__Group_11_2__0__Impl
	rule__Viewpoint__Group_11_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Viewpoint__Group_11_2__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getViewpointAccess().getCommaKeyword_11_2_0()); }

	',' 

{ after(grammarAccess.getViewpointAccess().getCommaKeyword_11_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Viewpoint__Group_11_2__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Viewpoint__Group_11_2__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Viewpoint__Group_11_2__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getViewpointAccess().getUseWorkspaceResourceAssignment_11_2_1()); }
(rule__Viewpoint__UseWorkspaceResourceAssignment_11_2_1)
{ after(grammarAccess.getViewpointAccess().getUseWorkspaceResourceAssignment_11_2_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__Viewpoint__Group_12__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Viewpoint__Group_12__0__Impl
	rule__Viewpoint__Group_12__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Viewpoint__Group_12__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getViewpointAccess().getUsesFilesystemKeyword_12_0()); }

	'uses-filesystem' 

{ after(grammarAccess.getViewpointAccess().getUsesFilesystemKeyword_12_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Viewpoint__Group_12__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Viewpoint__Group_12__1__Impl
	rule__Viewpoint__Group_12__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Viewpoint__Group_12__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getViewpointAccess().getUseFSResourceAssignment_12_1()); }
(rule__Viewpoint__UseFSResourceAssignment_12_1)
{ after(grammarAccess.getViewpointAccess().getUseFSResourceAssignment_12_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Viewpoint__Group_12__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Viewpoint__Group_12__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Viewpoint__Group_12__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getViewpointAccess().getGroup_12_2()); }
(rule__Viewpoint__Group_12_2__0)*
{ after(grammarAccess.getViewpointAccess().getGroup_12_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}








rule__Viewpoint__Group_12_2__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Viewpoint__Group_12_2__0__Impl
	rule__Viewpoint__Group_12_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Viewpoint__Group_12_2__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getViewpointAccess().getCommaKeyword_12_2_0()); }

	',' 

{ after(grammarAccess.getViewpointAccess().getCommaKeyword_12_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Viewpoint__Group_12_2__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Viewpoint__Group_12_2__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Viewpoint__Group_12_2__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getViewpointAccess().getUseFSResourceAssignment_12_2_1()); }
(rule__Viewpoint__UseFSResourceAssignment_12_2_1)
{ after(grammarAccess.getViewpointAccess().getUseFSResourceAssignment_12_2_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__Viewpoint__Group_13__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Viewpoint__Group_13__0__Impl
	rule__Viewpoint__Group_13__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Viewpoint__Group_13__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getViewpointAccess().getDataKeyword_13_0()); }

	'Data' 

{ after(grammarAccess.getViewpointAccess().getDataKeyword_13_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Viewpoint__Group_13__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Viewpoint__Group_13__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Viewpoint__Group_13__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getViewpointAccess().getVP_DataAssignment_13_1()); }
(rule__Viewpoint__VP_DataAssignment_13_1)
{ after(grammarAccess.getViewpointAccess().getVP_DataAssignment_13_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__Viewpoint__Group_14__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Viewpoint__Group_14__0__Impl
	rule__Viewpoint__Group_14__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Viewpoint__Group_14__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getViewpointAccess().getTypeAssignment_14_0()); }
(rule__Viewpoint__TypeAssignment_14_0)
{ after(grammarAccess.getViewpointAccess().getTypeAssignment_14_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Viewpoint__Group_14__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Viewpoint__Group_14__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Viewpoint__Group_14__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getViewpointAccess().getVP_AspectsAssignment_14_1()); }
(rule__Viewpoint__VP_AspectsAssignment_14_1)
{ after(grammarAccess.getViewpointAccess().getVP_AspectsAssignment_14_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__Viewpoint__Group_15__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Viewpoint__Group_15__0__Impl
	rule__Viewpoint__Group_15__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Viewpoint__Group_15__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getViewpointAccess().getTypeAssignment_15_0()); }
(rule__Viewpoint__TypeAssignment_15_0)
{ after(grammarAccess.getViewpointAccess().getTypeAssignment_15_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Viewpoint__Group_15__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Viewpoint__Group_15__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Viewpoint__Group_15__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getViewpointAccess().getVP_AspectsAssignment_15_1()); }
(rule__Viewpoint__VP_AspectsAssignment_15_1)
{ after(grammarAccess.getViewpointAccess().getVP_AspectsAssignment_15_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__Viewpoint__Group_16__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Viewpoint__Group_16__0__Impl
	rule__Viewpoint__Group_16__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Viewpoint__Group_16__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getViewpointAccess().getTypeAssignment_16_0()); }
(rule__Viewpoint__TypeAssignment_16_0)
{ after(grammarAccess.getViewpointAccess().getTypeAssignment_16_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Viewpoint__Group_16__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Viewpoint__Group_16__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Viewpoint__Group_16__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getViewpointAccess().getVP_AspectsAssignment_16_1()); }
(rule__Viewpoint__VP_AspectsAssignment_16_1)
{ after(grammarAccess.getViewpointAccess().getVP_AspectsAssignment_16_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__Viewpoint__Group_17__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Viewpoint__Group_17__0__Impl
	rule__Viewpoint__Group_17__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Viewpoint__Group_17__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getViewpointAccess().getTypeAssignment_17_0()); }
(rule__Viewpoint__TypeAssignment_17_0)
{ after(grammarAccess.getViewpointAccess().getTypeAssignment_17_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Viewpoint__Group_17__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Viewpoint__Group_17__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Viewpoint__Group_17__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getViewpointAccess().getVP_AspectsAssignment_17_1()); }
(rule__Viewpoint__VP_AspectsAssignment_17_1)
{ after(grammarAccess.getViewpointAccess().getVP_AspectsAssignment_17_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__Viewpoint__Group_18__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Viewpoint__Group_18__0__Impl
	rule__Viewpoint__Group_18__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Viewpoint__Group_18__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getViewpointAccess().getTypeAssignment_18_0()); }
(rule__Viewpoint__TypeAssignment_18_0)
{ after(grammarAccess.getViewpointAccess().getTypeAssignment_18_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Viewpoint__Group_18__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Viewpoint__Group_18__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Viewpoint__Group_18__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getViewpointAccess().getVP_AspectsAssignment_18_1()); }
(rule__Viewpoint__VP_AspectsAssignment_18_1)
{ after(grammarAccess.getViewpointAccess().getVP_AspectsAssignment_18_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__Viewpoint__Group_19__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Viewpoint__Group_19__0__Impl
	rule__Viewpoint__Group_19__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Viewpoint__Group_19__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getViewpointAccess().getTypeAssignment_19_0()); }
(rule__Viewpoint__TypeAssignment_19_0)
{ after(grammarAccess.getViewpointAccess().getTypeAssignment_19_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Viewpoint__Group_19__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Viewpoint__Group_19__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Viewpoint__Group_19__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getViewpointAccess().getVP_AspectsAssignment_19_1()); }
(rule__Viewpoint__VP_AspectsAssignment_19_1)
{ after(grammarAccess.getViewpointAccess().getVP_AspectsAssignment_19_1()); }
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







rule__Viewpoint__ShortNameAssignment_2
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getViewpointAccess().getShortNameIDTerminalRuleCall_2_0()); }
	RULE_ID{ after(grammarAccess.getViewpointAccess().getShortNameIDTerminalRuleCall_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Viewpoint__NameAssignment_4_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getViewpointAccess().getNameSTRINGTerminalRuleCall_4_1_0()); }
	RULE_STRING{ after(grammarAccess.getViewpointAccess().getNameSTRINGTerminalRuleCall_4_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Viewpoint__DescriptionAssignment_5_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getViewpointAccess().getDescriptionEStringParserRuleCall_5_1_0()); }
	ruleEString{ after(grammarAccess.getViewpointAccess().getDescriptionEStringParserRuleCall_5_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Viewpoint__ParentsAssignment_6_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getViewpointAccess().getParentsViewpointCrossReference_6_1_0()); }
(
{ before(grammarAccess.getViewpointAccess().getParentsViewpointFQNParserRuleCall_6_1_0_1()); }
	ruleFQN{ after(grammarAccess.getViewpointAccess().getParentsViewpointFQNParserRuleCall_6_1_0_1()); }
)
{ after(grammarAccess.getViewpointAccess().getParentsViewpointCrossReference_6_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Viewpoint__ParentsAssignment_6_2_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getViewpointAccess().getParentsViewpointCrossReference_6_2_1_0()); }
(
{ before(grammarAccess.getViewpointAccess().getParentsViewpointFQNParserRuleCall_6_2_1_0_1()); }
	ruleFQN{ after(grammarAccess.getViewpointAccess().getParentsViewpointFQNParserRuleCall_6_2_1_0_1()); }
)
{ after(grammarAccess.getViewpointAccess().getParentsViewpointCrossReference_6_2_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Viewpoint__DependenciesAssignment_7_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getViewpointAccess().getDependenciesViewpointCrossReference_7_1_0()); }
(
{ before(grammarAccess.getViewpointAccess().getDependenciesViewpointFQNParserRuleCall_7_1_0_1()); }
	ruleFQN{ after(grammarAccess.getViewpointAccess().getDependenciesViewpointFQNParserRuleCall_7_1_0_1()); }
)
{ after(grammarAccess.getViewpointAccess().getDependenciesViewpointCrossReference_7_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Viewpoint__DependenciesAssignment_7_2_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getViewpointAccess().getDependenciesViewpointCrossReference_7_2_1_0()); }
(
{ before(grammarAccess.getViewpointAccess().getDependenciesViewpointFQNParserRuleCall_7_2_1_0_1()); }
	ruleFQN{ after(grammarAccess.getViewpointAccess().getDependenciesViewpointFQNParserRuleCall_7_2_1_0_1()); }
)
{ after(grammarAccess.getViewpointAccess().getDependenciesViewpointCrossReference_7_2_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Viewpoint__UseViewpointAssignment_8_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getViewpointAccess().getUseViewpointViewpointCrossReference_8_1_0()); }
(
{ before(grammarAccess.getViewpointAccess().getUseViewpointViewpointFQNParserRuleCall_8_1_0_1()); }
	ruleFQN{ after(grammarAccess.getViewpointAccess().getUseViewpointViewpointFQNParserRuleCall_8_1_0_1()); }
)
{ after(grammarAccess.getViewpointAccess().getUseViewpointViewpointCrossReference_8_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Viewpoint__UseViewpointAssignment_8_2_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getViewpointAccess().getUseViewpointViewpointCrossReference_8_2_1_0()); }
(
{ before(grammarAccess.getViewpointAccess().getUseViewpointViewpointFQNParserRuleCall_8_2_1_0_1()); }
	ruleFQN{ after(grammarAccess.getViewpointAccess().getUseViewpointViewpointFQNParserRuleCall_8_2_1_0_1()); }
)
{ after(grammarAccess.getViewpointAccess().getUseViewpointViewpointCrossReference_8_2_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Viewpoint__UseAnyEMFResourceAssignment_9_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getViewpointAccess().getUseAnyEMFResourceEStringParserRuleCall_9_1_0()); }
	ruleEString{ after(grammarAccess.getViewpointAccess().getUseAnyEMFResourceEStringParserRuleCall_9_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Viewpoint__UseAnyEMFResourceAssignment_9_2_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getViewpointAccess().getUseAnyEMFResourceEStringParserRuleCall_9_2_1_0()); }
	ruleEString{ after(grammarAccess.getViewpointAccess().getUseAnyEMFResourceEStringParserRuleCall_9_2_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Viewpoint__UseDiagramResourceAssignment_10_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getViewpointAccess().getUseDiagramResourceEStringParserRuleCall_10_1_0()); }
	ruleEString{ after(grammarAccess.getViewpointAccess().getUseDiagramResourceEStringParserRuleCall_10_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Viewpoint__UseDiagramResourceAssignment_10_2_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getViewpointAccess().getUseDiagramResourceEStringParserRuleCall_10_2_1_0()); }
	ruleEString{ after(grammarAccess.getViewpointAccess().getUseDiagramResourceEStringParserRuleCall_10_2_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Viewpoint__UseWorkspaceResourceAssignment_11_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getViewpointAccess().getUseWorkspaceResourceEStringParserRuleCall_11_1_0()); }
	ruleEString{ after(grammarAccess.getViewpointAccess().getUseWorkspaceResourceEStringParserRuleCall_11_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Viewpoint__UseWorkspaceResourceAssignment_11_2_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getViewpointAccess().getUseWorkspaceResourceEStringParserRuleCall_11_2_1_0()); }
	ruleEString{ after(grammarAccess.getViewpointAccess().getUseWorkspaceResourceEStringParserRuleCall_11_2_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Viewpoint__UseFSResourceAssignment_12_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getViewpointAccess().getUseFSResourceEStringParserRuleCall_12_1_0()); }
	ruleEString{ after(grammarAccess.getViewpointAccess().getUseFSResourceEStringParserRuleCall_12_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Viewpoint__UseFSResourceAssignment_12_2_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getViewpointAccess().getUseFSResourceEStringParserRuleCall_12_2_1_0()); }
	ruleEString{ after(grammarAccess.getViewpointAccess().getUseFSResourceEStringParserRuleCall_12_2_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Viewpoint__VP_DataAssignment_13_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getViewpointAccess().getVP_DataDataCrossReference_13_1_0()); }
(
{ before(grammarAccess.getViewpointAccess().getVP_DataDataFQNParserRuleCall_13_1_0_1()); }
	ruleFQN{ after(grammarAccess.getViewpointAccess().getVP_DataDataFQNParserRuleCall_13_1_0_1()); }
)
{ after(grammarAccess.getViewpointAccess().getVP_DataDataCrossReference_13_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Viewpoint__TypeAssignment_14_0
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getViewpointAccess().getTypeUIKeyword_14_0_0()); }
(
{ before(grammarAccess.getViewpointAccess().getTypeUIKeyword_14_0_0()); }

	'UI' 

{ after(grammarAccess.getViewpointAccess().getTypeUIKeyword_14_0_0()); }
)

{ after(grammarAccess.getViewpointAccess().getTypeUIKeyword_14_0_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Viewpoint__VP_AspectsAssignment_14_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getViewpointAccess().getVP_AspectsUIDescriptionCrossReference_14_1_0()); }
(
{ before(grammarAccess.getViewpointAccess().getVP_AspectsUIDescriptionFQNParserRuleCall_14_1_0_1()); }
	ruleFQN{ after(grammarAccess.getViewpointAccess().getVP_AspectsUIDescriptionFQNParserRuleCall_14_1_0_1()); }
)
{ after(grammarAccess.getViewpointAccess().getVP_AspectsUIDescriptionCrossReference_14_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Viewpoint__TypeAssignment_15_0
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getViewpointAccess().getTypeDiagramsKeyword_15_0_0()); }
(
{ before(grammarAccess.getViewpointAccess().getTypeDiagramsKeyword_15_0_0()); }

	'Diagrams' 

{ after(grammarAccess.getViewpointAccess().getTypeDiagramsKeyword_15_0_0()); }
)

{ after(grammarAccess.getViewpointAccess().getTypeDiagramsKeyword_15_0_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Viewpoint__VP_AspectsAssignment_15_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getViewpointAccess().getVP_AspectsDiagramSetCrossReference_15_1_0()); }
(
{ before(grammarAccess.getViewpointAccess().getVP_AspectsDiagramSetFQNParserRuleCall_15_1_0_1()); }
	ruleFQN{ after(grammarAccess.getViewpointAccess().getVP_AspectsDiagramSetFQNParserRuleCall_15_1_0_1()); }
)
{ after(grammarAccess.getViewpointAccess().getVP_AspectsDiagramSetCrossReference_15_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Viewpoint__TypeAssignment_16_0
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getViewpointAccess().getTypeActivityExplorerKeyword_16_0_0()); }
(
{ before(grammarAccess.getViewpointAccess().getTypeActivityExplorerKeyword_16_0_0()); }

	'Activity-Explorer' 

{ after(grammarAccess.getViewpointAccess().getTypeActivityExplorerKeyword_16_0_0()); }
)

{ after(grammarAccess.getViewpointAccess().getTypeActivityExplorerKeyword_16_0_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Viewpoint__VP_AspectsAssignment_16_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getViewpointAccess().getVP_AspectsViewpointActivityExplorerCrossReference_16_1_0()); }
(
{ before(grammarAccess.getViewpointAccess().getVP_AspectsViewpointActivityExplorerFQNParserRuleCall_16_1_0_1()); }
	ruleFQN{ after(grammarAccess.getViewpointAccess().getVP_AspectsViewpointActivityExplorerFQNParserRuleCall_16_1_0_1()); }
)
{ after(grammarAccess.getViewpointAccess().getVP_AspectsViewpointActivityExplorerCrossReference_16_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Viewpoint__TypeAssignment_17_0
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getViewpointAccess().getTypeServicesKeyword_17_0_0()); }
(
{ before(grammarAccess.getViewpointAccess().getTypeServicesKeyword_17_0_0()); }

	'Services' 

{ after(grammarAccess.getViewpointAccess().getTypeServicesKeyword_17_0_0()); }
)

{ after(grammarAccess.getViewpointAccess().getTypeServicesKeyword_17_0_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Viewpoint__VP_AspectsAssignment_17_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getViewpointAccess().getVP_AspectsServiceSetCrossReference_17_1_0()); }
(
{ before(grammarAccess.getViewpointAccess().getVP_AspectsServiceSetFQNParserRuleCall_17_1_0_1()); }
	ruleFQN{ after(grammarAccess.getViewpointAccess().getVP_AspectsServiceSetFQNParserRuleCall_17_1_0_1()); }
)
{ after(grammarAccess.getViewpointAccess().getVP_AspectsServiceSetCrossReference_17_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Viewpoint__TypeAssignment_18_0
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getViewpointAccess().getTypeBuildKeyword_18_0_0()); }
(
{ before(grammarAccess.getViewpointAccess().getTypeBuildKeyword_18_0_0()); }

	'Build' 

{ after(grammarAccess.getViewpointAccess().getTypeBuildKeyword_18_0_0()); }
)

{ after(grammarAccess.getViewpointAccess().getTypeBuildKeyword_18_0_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Viewpoint__VP_AspectsAssignment_18_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getViewpointAccess().getVP_AspectsBuildCrossReference_18_1_0()); }
(
{ before(grammarAccess.getViewpointAccess().getVP_AspectsBuildFQNParserRuleCall_18_1_0_1()); }
	ruleFQN{ after(grammarAccess.getViewpointAccess().getVP_AspectsBuildFQNParserRuleCall_18_1_0_1()); }
)
{ after(grammarAccess.getViewpointAccess().getVP_AspectsBuildCrossReference_18_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Viewpoint__TypeAssignment_19_0
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getViewpointAccess().getTypeConfigurationKeyword_19_0_0()); }
(
{ before(grammarAccess.getViewpointAccess().getTypeConfigurationKeyword_19_0_0()); }

	'Configuration' 

{ after(grammarAccess.getViewpointAccess().getTypeConfigurationKeyword_19_0_0()); }
)

{ after(grammarAccess.getViewpointAccess().getTypeConfigurationKeyword_19_0_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Viewpoint__VP_AspectsAssignment_19_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getViewpointAccess().getVP_AspectsConfigurationCrossReference_19_1_0()); }
(
{ before(grammarAccess.getViewpointAccess().getVP_AspectsConfigurationFQNParserRuleCall_19_1_0_1()); }
	ruleFQN{ after(grammarAccess.getViewpointAccess().getVP_AspectsConfigurationFQNParserRuleCall_19_1_0_1()); }
)
{ after(grammarAccess.getViewpointAccess().getVP_AspectsConfigurationCrossReference_19_1_0()); }
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



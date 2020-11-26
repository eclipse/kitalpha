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
grammar InternalVpservices;

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
import org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.VpservicesGrammarAccess;

}

@parser::members {
 
 	private VpservicesGrammarAccess grammarAccess;
 	
    public void setGrammarAccess(VpservicesGrammarAccess grammarAccess) {
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




// Entry rule entryRuleServices
entryRuleServices 
:
{ before(grammarAccess.getServicesRule()); }
	 ruleServices
{ after(grammarAccess.getServicesRule()); } 
	 EOF 
;

// Rule Services
ruleServices
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getServicesAccess().getGroup()); }
(rule__Services__Group__0)
{ after(grammarAccess.getServicesAccess().getGroup()); }
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
{ before(grammarAccess.getAspectAccess().getAlternatives()); }
(rule__Aspect__Alternatives)
{ after(grammarAccess.getAspectAccess().getAlternatives()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleServiceSet
entryRuleServiceSet 
:
{ before(grammarAccess.getServiceSetRule()); }
	 ruleServiceSet
{ after(grammarAccess.getServiceSetRule()); } 
	 EOF 
;

// Rule ServiceSet
ruleServiceSet
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getServiceSetAccess().getGroup()); }
(rule__ServiceSet__Group__0)
{ after(grammarAccess.getServiceSetAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleRuleSet
entryRuleRuleSet 
:
{ before(grammarAccess.getRuleSetRule()); }
	 ruleRuleSet
{ after(grammarAccess.getRuleSetRule()); } 
	 EOF 
;

// Rule RuleSet
ruleRuleSet
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getRuleSetAccess().getGroup()); }
(rule__RuleSet__Group__0)
{ after(grammarAccess.getRuleSetAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleService
entryRuleService 
:
{ before(grammarAccess.getServiceRule()); }
	 ruleService
{ after(grammarAccess.getServiceRule()); } 
	 EOF 
;

// Rule Service
ruleService
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getServiceAccess().getGroup()); }
(rule__Service__Group__0)
{ after(grammarAccess.getServiceAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleRule
entryRuleRule 
:
{ before(grammarAccess.getRuleRule()); }
	 ruleRule
{ after(grammarAccess.getRuleRule()); } 
	 EOF 
;

// Rule Rule
ruleRule
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getRuleAccess().getGroup()); }
(rule__Rule__Group__0)
{ after(grammarAccess.getRuleAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRulePropertySet
entryRulePropertySet 
:
{ before(grammarAccess.getPropertySetRule()); }
	 rulePropertySet
{ after(grammarAccess.getPropertySetRule()); } 
	 EOF 
;

// Rule PropertySet
rulePropertySet
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getPropertySetAccess().getGroup()); }
(rule__PropertySet__Group__0)
{ after(grammarAccess.getPropertySetAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleProperty
entryRuleProperty 
:
{ before(grammarAccess.getPropertyRule()); }
	 ruleProperty
{ after(grammarAccess.getPropertyRule()); } 
	 EOF 
;

// Rule Property
ruleProperty
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getPropertyAccess().getGroup()); }
(rule__Property__Group__0)
{ after(grammarAccess.getPropertyAccess().getGroup()); }
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








// Rule Rules_Types
ruleRules_Types
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getRules_TypesAccess().getAlternatives()); }
(rule__Rules_Types__Alternatives)
{ after(grammarAccess.getRules_TypesAccess().getAlternatives()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Rule PropertyType
rulePropertyType
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getPropertyTypeAccess().getAlternatives()); }
(rule__PropertyType__Alternatives)
{ after(grammarAccess.getPropertyTypeAccess().getAlternatives()); }
)

;
finally {
	restoreStackSize(stackSize);
}



rule__Aspect__Alternatives
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getAspectAccess().getServiceSetParserRuleCall_0()); }
	ruleServiceSet
{ after(grammarAccess.getAspectAccess().getServiceSetParserRuleCall_0()); }
)

    |(
{ before(grammarAccess.getAspectAccess().getRuleSetParserRuleCall_1()); }
	ruleRuleSet
{ after(grammarAccess.getAspectAccess().getRuleSetParserRuleCall_1()); }
)

    |(
{ before(grammarAccess.getAspectAccess().getPropertySetParserRuleCall_2()); }
	rulePropertySet
{ after(grammarAccess.getAspectAccess().getPropertySetParserRuleCall_2()); }
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


rule__Rules_Types__Alternatives
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getRules_TypesAccess().getJavaEnumLiteralDeclaration_0()); }
(	'Java' 
)
{ after(grammarAccess.getRules_TypesAccess().getJavaEnumLiteralDeclaration_0()); }
)

    |(
{ before(grammarAccess.getRules_TypesAccess().getEMFvalidationEnumLiteralDeclaration_1()); }
(	'EMFvalidation' 
)
{ after(grammarAccess.getRules_TypesAccess().getEMFvalidationEnumLiteralDeclaration_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__PropertyType__Alternatives
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getPropertyTypeAccess().getIntegerEnumLiteralDeclaration_0()); }
(	'Integer' 
)
{ after(grammarAccess.getPropertyTypeAccess().getIntegerEnumLiteralDeclaration_0()); }
)

    |(
{ before(grammarAccess.getPropertyTypeAccess().getStringEnumLiteralDeclaration_1()); }
(	'String' 
)
{ after(grammarAccess.getPropertyTypeAccess().getStringEnumLiteralDeclaration_1()); }
)

    |(
{ before(grammarAccess.getPropertyTypeAccess().getBooleanEnumLiteralDeclaration_2()); }
(	'Boolean' 
)
{ after(grammarAccess.getPropertyTypeAccess().getBooleanEnumLiteralDeclaration_2()); }
)

    |(
{ before(grammarAccess.getPropertyTypeAccess().getFloatEnumLiteralDeclaration_3()); }
(	'Float' 
)
{ after(grammarAccess.getPropertyTypeAccess().getFloatEnumLiteralDeclaration_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}



rule__Services__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Services__Group__0__Impl
	rule__Services__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Services__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getServicesAccess().getServicesAction_0()); }
(

)
{ after(grammarAccess.getServicesAccess().getServicesAction_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Services__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Services__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Services__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
(
{ before(grammarAccess.getServicesAccess().getServicesAssignment_1()); }
(rule__Services__ServicesAssignment_1)
{ after(grammarAccess.getServicesAccess().getServicesAssignment_1()); }
)
(
{ before(grammarAccess.getServicesAccess().getServicesAssignment_1()); }
(rule__Services__ServicesAssignment_1)*
{ after(grammarAccess.getServicesAccess().getServicesAssignment_1()); }
)
)

;
finally {
	restoreStackSize(stackSize);
}






rule__ServiceSet__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__ServiceSet__Group__0__Impl
	rule__ServiceSet__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ServiceSet__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getServiceSetAccess().getServiceSetAction_0()); }
(

)
{ after(grammarAccess.getServiceSetAccess().getServiceSetAction_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__ServiceSet__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__ServiceSet__Group__1__Impl
	rule__ServiceSet__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__ServiceSet__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getServiceSetAccess().getServicesKeyword_1()); }

	'Services' 

{ after(grammarAccess.getServiceSetAccess().getServicesKeyword_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__ServiceSet__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__ServiceSet__Group__2__Impl
	rule__ServiceSet__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__ServiceSet__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getServiceSetAccess().getNameAssignment_2()); }
(rule__ServiceSet__NameAssignment_2)
{ after(grammarAccess.getServiceSetAccess().getNameAssignment_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__ServiceSet__Group__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__ServiceSet__Group__3__Impl
	rule__ServiceSet__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__ServiceSet__Group__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getServiceSetAccess().getLeftCurlyBracketKeyword_3()); }

	'{' 

{ after(grammarAccess.getServiceSetAccess().getLeftCurlyBracketKeyword_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__ServiceSet__Group__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__ServiceSet__Group__4__Impl
	rule__ServiceSet__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__ServiceSet__Group__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getServiceSetAccess().getGroup_4()); }
(rule__ServiceSet__Group_4__0)?
{ after(grammarAccess.getServiceSetAccess().getGroup_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__ServiceSet__Group__5
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__ServiceSet__Group__5__Impl
	rule__ServiceSet__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__ServiceSet__Group__5__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getServiceSetAccess().getGroup_5()); }
(rule__ServiceSet__Group_5__0)?
{ after(grammarAccess.getServiceSetAccess().getGroup_5()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__ServiceSet__Group__6
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__ServiceSet__Group__6__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ServiceSet__Group__6__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getServiceSetAccess().getRightCurlyBracketKeyword_6()); }

	'}' 

{ after(grammarAccess.getServiceSetAccess().getRightCurlyBracketKeyword_6()); }
)

;
finally {
	restoreStackSize(stackSize);
}
















rule__ServiceSet__Group_4__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__ServiceSet__Group_4__0__Impl
	rule__ServiceSet__Group_4__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ServiceSet__Group_4__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getServiceSetAccess().getDescriptionKeyword_4_0()); }

	'description:' 

{ after(grammarAccess.getServiceSetAccess().getDescriptionKeyword_4_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__ServiceSet__Group_4__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__ServiceSet__Group_4__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ServiceSet__Group_4__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getServiceSetAccess().getDescriptionAssignment_4_1()); }
(rule__ServiceSet__DescriptionAssignment_4_1)
{ after(grammarAccess.getServiceSetAccess().getDescriptionAssignment_4_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__ServiceSet__Group_5__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__ServiceSet__Group_5__0__Impl
	rule__ServiceSet__Group_5__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ServiceSet__Group_5__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getServiceSetAccess().getVpServicesAssignment_5_0()); }
(rule__ServiceSet__VpServicesAssignment_5_0)
{ after(grammarAccess.getServiceSetAccess().getVpServicesAssignment_5_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__ServiceSet__Group_5__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__ServiceSet__Group_5__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ServiceSet__Group_5__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getServiceSetAccess().getVpServicesAssignment_5_1()); }
(rule__ServiceSet__VpServicesAssignment_5_1)*
{ after(grammarAccess.getServiceSetAccess().getVpServicesAssignment_5_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__RuleSet__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__RuleSet__Group__0__Impl
	rule__RuleSet__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__RuleSet__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getRuleSetAccess().getRuleSetAction_0()); }
(

)
{ after(grammarAccess.getRuleSetAccess().getRuleSetAction_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__RuleSet__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__RuleSet__Group__1__Impl
	rule__RuleSet__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__RuleSet__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getRuleSetAccess().getRulesKeyword_1()); }

	'Rules' 

{ after(grammarAccess.getRuleSetAccess().getRulesKeyword_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__RuleSet__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__RuleSet__Group__2__Impl
	rule__RuleSet__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__RuleSet__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getRuleSetAccess().getNameAssignment_2()); }
(rule__RuleSet__NameAssignment_2)
{ after(grammarAccess.getRuleSetAccess().getNameAssignment_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__RuleSet__Group__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__RuleSet__Group__3__Impl
	rule__RuleSet__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__RuleSet__Group__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getRuleSetAccess().getLeftCurlyBracketKeyword_3()); }

	'{' 

{ after(grammarAccess.getRuleSetAccess().getLeftCurlyBracketKeyword_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__RuleSet__Group__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__RuleSet__Group__4__Impl
	rule__RuleSet__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__RuleSet__Group__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getRuleSetAccess().getGroup_4()); }
(rule__RuleSet__Group_4__0)?
{ after(grammarAccess.getRuleSetAccess().getGroup_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__RuleSet__Group__5
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__RuleSet__Group__5__Impl
	rule__RuleSet__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__RuleSet__Group__5__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getRuleSetAccess().getGroup_5()); }
(rule__RuleSet__Group_5__0)?
{ after(grammarAccess.getRuleSetAccess().getGroup_5()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__RuleSet__Group__6
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__RuleSet__Group__6__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__RuleSet__Group__6__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getRuleSetAccess().getRightCurlyBracketKeyword_6()); }

	'}' 

{ after(grammarAccess.getRuleSetAccess().getRightCurlyBracketKeyword_6()); }
)

;
finally {
	restoreStackSize(stackSize);
}
















rule__RuleSet__Group_4__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__RuleSet__Group_4__0__Impl
	rule__RuleSet__Group_4__1
;
finally {
	restoreStackSize(stackSize);
}

rule__RuleSet__Group_4__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getRuleSetAccess().getDescriptionKeyword_4_0()); }

	'description:' 

{ after(grammarAccess.getRuleSetAccess().getDescriptionKeyword_4_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__RuleSet__Group_4__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__RuleSet__Group_4__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__RuleSet__Group_4__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getRuleSetAccess().getDescriptionAssignment_4_1()); }
(rule__RuleSet__DescriptionAssignment_4_1)
{ after(grammarAccess.getRuleSetAccess().getDescriptionAssignment_4_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__RuleSet__Group_5__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__RuleSet__Group_5__0__Impl
	rule__RuleSet__Group_5__1
;
finally {
	restoreStackSize(stackSize);
}

rule__RuleSet__Group_5__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getRuleSetAccess().getVpRulesAssignment_5_0()); }
(rule__RuleSet__VpRulesAssignment_5_0)
{ after(grammarAccess.getRuleSetAccess().getVpRulesAssignment_5_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__RuleSet__Group_5__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__RuleSet__Group_5__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__RuleSet__Group_5__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getRuleSetAccess().getVpRulesAssignment_5_1()); }
(rule__RuleSet__VpRulesAssignment_5_1)*
{ after(grammarAccess.getRuleSetAccess().getVpRulesAssignment_5_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__Service__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Service__Group__0__Impl
	rule__Service__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Service__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getServiceAccess().getServiceAction_0()); }
(

)
{ after(grammarAccess.getServiceAccess().getServiceAction_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Service__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Service__Group__1__Impl
	rule__Service__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Service__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getServiceAccess().getServiceKeyword_1()); }

	'Service' 

{ after(grammarAccess.getServiceAccess().getServiceKeyword_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Service__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Service__Group__2__Impl
	rule__Service__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Service__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getServiceAccess().getNameAssignment_2()); }
(rule__Service__NameAssignment_2)
{ after(grammarAccess.getServiceAccess().getNameAssignment_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Service__Group__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Service__Group__3__Impl
	rule__Service__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__Service__Group__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getServiceAccess().getGroup_3()); }
(rule__Service__Group_3__0)?
{ after(grammarAccess.getServiceAccess().getGroup_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Service__Group__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Service__Group__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Service__Group__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getServiceAccess().getGroup_4()); }
(rule__Service__Group_4__0)?
{ after(grammarAccess.getServiceAccess().getGroup_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}












rule__Service__Group_3__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Service__Group_3__0__Impl
	rule__Service__Group_3__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Service__Group_3__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getServiceAccess().getDescriptionKeyword_3_0()); }

	'description:' 

{ after(grammarAccess.getServiceAccess().getDescriptionKeyword_3_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Service__Group_3__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Service__Group_3__1__Impl
	rule__Service__Group_3__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Service__Group_3__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getServiceAccess().getDescriptionAssignment_3_1()); }
(rule__Service__DescriptionAssignment_3_1)
{ after(grammarAccess.getServiceAccess().getDescriptionAssignment_3_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Service__Group_3__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Service__Group_3__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Service__Group_3__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getServiceAccess().getCommaKeyword_3_2()); }

	',' 

{ after(grammarAccess.getServiceAccess().getCommaKeyword_3_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}








rule__Service__Group_4__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Service__Group_4__0__Impl
	rule__Service__Group_4__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Service__Group_4__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getServiceAccess().getOrchestratesKeyword_4_0()); }

	'orchestrates' 

{ after(grammarAccess.getServiceAccess().getOrchestratesKeyword_4_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Service__Group_4__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Service__Group_4__1__Impl
	rule__Service__Group_4__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Service__Group_4__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getServiceAccess().getRelatedRulesAssignment_4_1()); }
(rule__Service__RelatedRulesAssignment_4_1)
{ after(grammarAccess.getServiceAccess().getRelatedRulesAssignment_4_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Service__Group_4__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Service__Group_4__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Service__Group_4__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getServiceAccess().getGroup_4_2()); }
(rule__Service__Group_4_2__0)*
{ after(grammarAccess.getServiceAccess().getGroup_4_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}








rule__Service__Group_4_2__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Service__Group_4_2__0__Impl
	rule__Service__Group_4_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Service__Group_4_2__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getServiceAccess().getCommaKeyword_4_2_0()); }

	',' 

{ after(grammarAccess.getServiceAccess().getCommaKeyword_4_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Service__Group_4_2__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Service__Group_4_2__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Service__Group_4_2__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getServiceAccess().getRelatedRulesAssignment_4_2_1()); }
(rule__Service__RelatedRulesAssignment_4_2_1)
{ after(grammarAccess.getServiceAccess().getRelatedRulesAssignment_4_2_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__Rule__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Rule__Group__0__Impl
	rule__Rule__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Rule__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getRuleAccess().getRuleAction_0()); }
(

)
{ after(grammarAccess.getRuleAccess().getRuleAction_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Rule__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Rule__Group__1__Impl
	rule__Rule__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Rule__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getRuleAccess().getRuleKeyword_1()); }

	'Rule' 

{ after(grammarAccess.getRuleAccess().getRuleKeyword_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Rule__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Rule__Group__2__Impl
	rule__Rule__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Rule__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getRuleAccess().getNameAssignment_2()); }
(rule__Rule__NameAssignment_2)
{ after(grammarAccess.getRuleAccess().getNameAssignment_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Rule__Group__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Rule__Group__3__Impl
	rule__Rule__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__Rule__Group__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getRuleAccess().getGroup_3()); }
(rule__Rule__Group_3__0)?
{ after(grammarAccess.getRuleAccess().getGroup_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Rule__Group__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Rule__Group__4__Impl
	rule__Rule__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__Rule__Group__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getRuleAccess().getGroup_4()); }
(rule__Rule__Group_4__0)
{ after(grammarAccess.getRuleAccess().getGroup_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Rule__Group__5
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Rule__Group__5__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Rule__Group__5__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getRuleAccess().getGroup_5()); }
(rule__Rule__Group_5__0)?
{ after(grammarAccess.getRuleAccess().getGroup_5()); }
)

;
finally {
	restoreStackSize(stackSize);
}














rule__Rule__Group_3__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Rule__Group_3__0__Impl
	rule__Rule__Group_3__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Rule__Group_3__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getRuleAccess().getDescriptionKeyword_3_0()); }

	'description:' 

{ after(grammarAccess.getRuleAccess().getDescriptionKeyword_3_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Rule__Group_3__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Rule__Group_3__1__Impl
	rule__Rule__Group_3__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Rule__Group_3__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getRuleAccess().getDescriptionAssignment_3_1()); }
(rule__Rule__DescriptionAssignment_3_1)
{ after(grammarAccess.getRuleAccess().getDescriptionAssignment_3_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Rule__Group_3__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Rule__Group_3__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Rule__Group_3__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getRuleAccess().getCommaKeyword_3_2()); }

	',' 

{ after(grammarAccess.getRuleAccess().getCommaKeyword_3_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}








rule__Rule__Group_4__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Rule__Group_4__0__Impl
	rule__Rule__Group_4__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Rule__Group_4__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getRuleAccess().getTypeKeyword_4_0()); }

	'type' 

{ after(grammarAccess.getRuleAccess().getTypeKeyword_4_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Rule__Group_4__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Rule__Group_4__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Rule__Group_4__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getRuleAccess().getTypeAssignment_4_1()); }
(rule__Rule__TypeAssignment_4_1)
{ after(grammarAccess.getRuleAccess().getTypeAssignment_4_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__Rule__Group_5__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Rule__Group_5__0__Impl
	rule__Rule__Group_5__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Rule__Group_5__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getRuleAccess().getCommaKeyword_5_0()); }

	',' 

{ after(grammarAccess.getRuleAccess().getCommaKeyword_5_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Rule__Group_5__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Rule__Group_5__1__Impl
	rule__Rule__Group_5__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Rule__Group_5__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getRuleAccess().getClassKeyword_5_1()); }

	'class' 

{ after(grammarAccess.getRuleAccess().getClassKeyword_5_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Rule__Group_5__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Rule__Group_5__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Rule__Group_5__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getRuleAccess().getClassAssignment_5_2()); }
(rule__Rule__ClassAssignment_5_2)
{ after(grammarAccess.getRuleAccess().getClassAssignment_5_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}








rule__PropertySet__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__PropertySet__Group__0__Impl
	rule__PropertySet__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__PropertySet__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getPropertySetAccess().getPropertySetAction_0()); }
(

)
{ after(grammarAccess.getPropertySetAccess().getPropertySetAction_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__PropertySet__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__PropertySet__Group__1__Impl
	rule__PropertySet__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__PropertySet__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getPropertySetAccess().getPropertiesKeyword_1()); }

	'Properties' 

{ after(grammarAccess.getPropertySetAccess().getPropertiesKeyword_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__PropertySet__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__PropertySet__Group__2__Impl
	rule__PropertySet__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__PropertySet__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getPropertySetAccess().getNameAssignment_2()); }
(rule__PropertySet__NameAssignment_2)
{ after(grammarAccess.getPropertySetAccess().getNameAssignment_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__PropertySet__Group__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__PropertySet__Group__3__Impl
	rule__PropertySet__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__PropertySet__Group__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getPropertySetAccess().getLeftCurlyBracketKeyword_3()); }

	'{' 

{ after(grammarAccess.getPropertySetAccess().getLeftCurlyBracketKeyword_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__PropertySet__Group__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__PropertySet__Group__4__Impl
	rule__PropertySet__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__PropertySet__Group__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getPropertySetAccess().getVpPropertiesAssignment_4()); }
(rule__PropertySet__VpPropertiesAssignment_4)*
{ after(grammarAccess.getPropertySetAccess().getVpPropertiesAssignment_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__PropertySet__Group__5
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__PropertySet__Group__5__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__PropertySet__Group__5__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getPropertySetAccess().getRightCurlyBracketKeyword_5()); }

	'}' 

{ after(grammarAccess.getPropertySetAccess().getRightCurlyBracketKeyword_5()); }
)

;
finally {
	restoreStackSize(stackSize);
}














rule__Property__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Property__Group__0__Impl
	rule__Property__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Property__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getPropertyAccess().getPropertyAction_0()); }
(

)
{ after(grammarAccess.getPropertyAccess().getPropertyAction_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Property__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Property__Group__1__Impl
	rule__Property__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Property__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getPropertyAccess().getPropertyKeyword_1()); }

	'Property' 

{ after(grammarAccess.getPropertyAccess().getPropertyKeyword_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Property__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Property__Group__2__Impl
	rule__Property__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Property__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getPropertyAccess().getNameAssignment_2()); }
(rule__Property__NameAssignment_2)
{ after(grammarAccess.getPropertyAccess().getNameAssignment_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Property__Group__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Property__Group__3__Impl
	rule__Property__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__Property__Group__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getPropertyAccess().getGroup_3()); }
(rule__Property__Group_3__0)?
{ after(grammarAccess.getPropertyAccess().getGroup_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Property__Group__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Property__Group__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Property__Group__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getPropertyAccess().getGroup_4()); }
(rule__Property__Group_4__0)?
{ after(grammarAccess.getPropertyAccess().getGroup_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}












rule__Property__Group_3__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Property__Group_3__0__Impl
	rule__Property__Group_3__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Property__Group_3__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getPropertyAccess().getTypeKeyword_3_0()); }

	'type' 

{ after(grammarAccess.getPropertyAccess().getTypeKeyword_3_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Property__Group_3__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Property__Group_3__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Property__Group_3__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getPropertyAccess().getTypeAssignment_3_1()); }
(rule__Property__TypeAssignment_3_1)
{ after(grammarAccess.getPropertyAccess().getTypeAssignment_3_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__Property__Group_4__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Property__Group_4__0__Impl
	rule__Property__Group_4__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Property__Group_4__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getPropertyAccess().getValueKeyword_4_0()); }

	'value' 

{ after(grammarAccess.getPropertyAccess().getValueKeyword_4_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Property__Group_4__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Property__Group_4__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Property__Group_4__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getPropertyAccess().getValueAssignment_4_1()); }
(rule__Property__ValueAssignment_4_1)
{ after(grammarAccess.getPropertyAccess().getValueAssignment_4_1()); }
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







rule__Services__ServicesAssignment_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getServicesAccess().getServicesAspectParserRuleCall_1_0()); }
	ruleAspect{ after(grammarAccess.getServicesAccess().getServicesAspectParserRuleCall_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__ServiceSet__NameAssignment_2
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getServiceSetAccess().getNameFQNParserRuleCall_2_0()); }
	ruleFQN{ after(grammarAccess.getServiceSetAccess().getNameFQNParserRuleCall_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__ServiceSet__DescriptionAssignment_4_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getServiceSetAccess().getDescriptionEStringParserRuleCall_4_1_0()); }
	ruleEString{ after(grammarAccess.getServiceSetAccess().getDescriptionEStringParserRuleCall_4_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__ServiceSet__VpServicesAssignment_5_0
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getServiceSetAccess().getVpServicesServiceParserRuleCall_5_0_0()); }
	ruleService{ after(grammarAccess.getServiceSetAccess().getVpServicesServiceParserRuleCall_5_0_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__ServiceSet__VpServicesAssignment_5_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getServiceSetAccess().getVpServicesServiceParserRuleCall_5_1_0()); }
	ruleService{ after(grammarAccess.getServiceSetAccess().getVpServicesServiceParserRuleCall_5_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__RuleSet__NameAssignment_2
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getRuleSetAccess().getNameFQNParserRuleCall_2_0()); }
	ruleFQN{ after(grammarAccess.getRuleSetAccess().getNameFQNParserRuleCall_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__RuleSet__DescriptionAssignment_4_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getRuleSetAccess().getDescriptionEStringParserRuleCall_4_1_0()); }
	ruleEString{ after(grammarAccess.getRuleSetAccess().getDescriptionEStringParserRuleCall_4_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__RuleSet__VpRulesAssignment_5_0
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getRuleSetAccess().getVpRulesRuleParserRuleCall_5_0_0()); }
	ruleRule{ after(grammarAccess.getRuleSetAccess().getVpRulesRuleParserRuleCall_5_0_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__RuleSet__VpRulesAssignment_5_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getRuleSetAccess().getVpRulesRuleParserRuleCall_5_1_0()); }
	ruleRule{ after(grammarAccess.getRuleSetAccess().getVpRulesRuleParserRuleCall_5_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Service__NameAssignment_2
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getServiceAccess().getNameFQNParserRuleCall_2_0()); }
	ruleFQN{ after(grammarAccess.getServiceAccess().getNameFQNParserRuleCall_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Service__DescriptionAssignment_3_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getServiceAccess().getDescriptionEStringParserRuleCall_3_1_0()); }
	ruleEString{ after(grammarAccess.getServiceAccess().getDescriptionEStringParserRuleCall_3_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Service__RelatedRulesAssignment_4_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getServiceAccess().getRelatedRulesRuleCrossReference_4_1_0()); }
(
{ before(grammarAccess.getServiceAccess().getRelatedRulesRuleFQNParserRuleCall_4_1_0_1()); }
	ruleFQN{ after(grammarAccess.getServiceAccess().getRelatedRulesRuleFQNParserRuleCall_4_1_0_1()); }
)
{ after(grammarAccess.getServiceAccess().getRelatedRulesRuleCrossReference_4_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Service__RelatedRulesAssignment_4_2_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getServiceAccess().getRelatedRulesRuleCrossReference_4_2_1_0()); }
(
{ before(grammarAccess.getServiceAccess().getRelatedRulesRuleFQNParserRuleCall_4_2_1_0_1()); }
	ruleFQN{ after(grammarAccess.getServiceAccess().getRelatedRulesRuleFQNParserRuleCall_4_2_1_0_1()); }
)
{ after(grammarAccess.getServiceAccess().getRelatedRulesRuleCrossReference_4_2_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Rule__NameAssignment_2
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getRuleAccess().getNameFQNParserRuleCall_2_0()); }
	ruleFQN{ after(grammarAccess.getRuleAccess().getNameFQNParserRuleCall_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Rule__DescriptionAssignment_3_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getRuleAccess().getDescriptionEStringParserRuleCall_3_1_0()); }
	ruleEString{ after(grammarAccess.getRuleAccess().getDescriptionEStringParserRuleCall_3_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Rule__TypeAssignment_4_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getRuleAccess().getTypeRules_TypesEnumRuleCall_4_1_0()); }
	ruleRules_Types{ after(grammarAccess.getRuleAccess().getTypeRules_TypesEnumRuleCall_4_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Rule__ClassAssignment_5_2
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getRuleAccess().getClassEStringParserRuleCall_5_2_0()); }
	ruleEString{ after(grammarAccess.getRuleAccess().getClassEStringParserRuleCall_5_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__PropertySet__NameAssignment_2
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getPropertySetAccess().getNameFQNParserRuleCall_2_0()); }
	ruleFQN{ after(grammarAccess.getPropertySetAccess().getNameFQNParserRuleCall_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__PropertySet__VpPropertiesAssignment_4
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getPropertySetAccess().getVpPropertiesPropertyParserRuleCall_4_0()); }
	ruleProperty{ after(grammarAccess.getPropertySetAccess().getVpPropertiesPropertyParserRuleCall_4_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Property__NameAssignment_2
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getPropertyAccess().getNameEStringParserRuleCall_2_0()); }
	ruleEString{ after(grammarAccess.getPropertyAccess().getNameEStringParserRuleCall_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Property__TypeAssignment_3_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getPropertyAccess().getTypePropertyTypeEnumRuleCall_3_1_0()); }
	rulePropertyType{ after(grammarAccess.getPropertyAccess().getTypePropertyTypeEnumRuleCall_3_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Property__ValueAssignment_4_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getPropertyAccess().getValueEStringParserRuleCall_4_1_0()); }
	ruleEString{ after(grammarAccess.getPropertyAccess().getValueEStringParserRuleCall_4_1_0()); }
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



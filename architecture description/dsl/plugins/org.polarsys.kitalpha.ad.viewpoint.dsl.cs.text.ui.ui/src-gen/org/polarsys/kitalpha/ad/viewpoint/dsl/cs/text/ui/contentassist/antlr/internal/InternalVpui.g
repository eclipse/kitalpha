/*******************************************************************************
 * Copyright (c) 2017 Thales Global Services S.A.S.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *  Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/
grammar InternalVpui;

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
import org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.VpuiGrammarAccess;

}

@parser::members {
 
 	private VpuiGrammarAccess grammarAccess;
 	
    public void setGrammarAccess(VpuiGrammarAccess grammarAccess) {
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




// Entry rule entryRuleUserInterface
entryRuleUserInterface 
:
{ before(grammarAccess.getUserInterfaceRule()); }
	 ruleUserInterface
{ after(grammarAccess.getUserInterfaceRule()); } 
	 EOF 
;

// Rule UserInterface
ruleUserInterface
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getUserInterfaceAccess().getGroup()); }
(rule__UserInterface__Group__0)
{ after(grammarAccess.getUserInterfaceAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleImport
entryRuleImport 
:
{ before(grammarAccess.getImportRule()); }
	 ruleImport
{ after(grammarAccess.getImportRule()); } 
	 EOF 
;

// Rule Import
ruleImport
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getImportAccess().getGroup()); }
(rule__Import__Group__0)
{ after(grammarAccess.getImportAccess().getGroup()); }
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
{ before(grammarAccess.getAspectAccess().getUIDescriptionParserRuleCall()); }
	ruleUIDescription
{ after(grammarAccess.getAspectAccess().getUIDescriptionParserRuleCall()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleUIDescription
entryRuleUIDescription 
:
{ before(grammarAccess.getUIDescriptionRule()); }
	 ruleUIDescription
{ after(grammarAccess.getUIDescriptionRule()); } 
	 EOF 
;

// Rule UIDescription
ruleUIDescription
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getUIDescriptionAccess().getGroup()); }
(rule__UIDescription__Group__0)
{ after(grammarAccess.getUIDescriptionAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}





// Entry rule entryRuleUI
entryRuleUI 
:
{ before(grammarAccess.getUIRule()); }
	 ruleUI
{ after(grammarAccess.getUIRule()); } 
	 EOF 
;

// Rule UI
ruleUI
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getUIAccess().getGroup()); }
(rule__UI__Group__0)
{ after(grammarAccess.getUIAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleUIContainer
entryRuleUIContainer 
:
{ before(grammarAccess.getUIContainerRule()); }
	 ruleUIContainer
{ after(grammarAccess.getUIContainerRule()); } 
	 EOF 
;

// Rule UIContainer
ruleUIContainer
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getUIContainerAccess().getGroup()); }
(rule__UIContainer__Group__0)
{ after(grammarAccess.getUIContainerAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleDataSource
entryRuleDataSource 
:
{ before(grammarAccess.getDataSourceRule()); }
	 ruleDataSource
{ after(grammarAccess.getDataSourceRule()); } 
	 EOF 
;

// Rule DataSource
ruleDataSource
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getDataSourceAccess().getLocalClassParserRuleCall()); }
	ruleLocalClass
{ after(grammarAccess.getDataSourceAccess().getLocalClassParserRuleCall()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleLocalClass
entryRuleLocalClass 
:
{ before(grammarAccess.getLocalClassRule()); }
	 ruleLocalClass
{ after(grammarAccess.getLocalClassRule()); } 
	 EOF 
;

// Rule LocalClass
ruleLocalClass
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getLocalClassAccess().getGroup()); }
(rule__LocalClass__Group__0)
{ after(grammarAccess.getLocalClassAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleUIField
entryRuleUIField 
:
{ before(grammarAccess.getUIFieldRule()); }
	 ruleUIField
{ after(grammarAccess.getUIFieldRule()); } 
	 EOF 
;

// Rule UIField
ruleUIField
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getUIFieldAccess().getGroup()); }
(rule__UIField__Group__0)
{ after(grammarAccess.getUIFieldAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleFieldMapping
entryRuleFieldMapping 
:
{ before(grammarAccess.getFieldMappingRule()); }
	 ruleFieldMapping
{ after(grammarAccess.getFieldMappingRule()); } 
	 EOF 
;

// Rule FieldMapping
ruleFieldMapping
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getFieldMappingAccess().getGroup()); }
(rule__FieldMapping__Group__0)
{ after(grammarAccess.getFieldMappingAccess().getGroup()); }
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








// Rule UI_Field_Type
ruleUI_Field_Type
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getUI_Field_TypeAccess().getAlternatives()); }
(rule__UI_Field_Type__Alternatives)
{ after(grammarAccess.getUI_Field_TypeAccess().getAlternatives()); }
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


rule__UI_Field_Type__Alternatives
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getUI_Field_TypeAccess().getTextEnumLiteralDeclaration_0()); }
(	'text' 
)
{ after(grammarAccess.getUI_Field_TypeAccess().getTextEnumLiteralDeclaration_0()); }
)

    |(
{ before(grammarAccess.getUI_Field_TypeAccess().getTextareaEnumLiteralDeclaration_1()); }
(	'textarea' 
)
{ after(grammarAccess.getUI_Field_TypeAccess().getTextareaEnumLiteralDeclaration_1()); }
)

    |(
{ before(grammarAccess.getUI_Field_TypeAccess().getCheckboxEnumLiteralDeclaration_2()); }
(	'checkbox' 
)
{ after(grammarAccess.getUI_Field_TypeAccess().getCheckboxEnumLiteralDeclaration_2()); }
)

    |(
{ before(grammarAccess.getUI_Field_TypeAccess().getRadioboxEnumLiteralDeclaration_3()); }
(	'radiobox' 
)
{ after(grammarAccess.getUI_Field_TypeAccess().getRadioboxEnumLiteralDeclaration_3()); }
)

    |(
{ before(grammarAccess.getUI_Field_TypeAccess().getSimpleChoiceListEnumLiteralDeclaration_4()); }
(	'simpleChoiceList' 
)
{ after(grammarAccess.getUI_Field_TypeAccess().getSimpleChoiceListEnumLiteralDeclaration_4()); }
)

    |(
{ before(grammarAccess.getUI_Field_TypeAccess().getMultipleChoiceListEnumLiteralDeclaration_5()); }
(	'multipleChoiceList' 
)
{ after(grammarAccess.getUI_Field_TypeAccess().getMultipleChoiceListEnumLiteralDeclaration_5()); }
)

    |(
{ before(grammarAccess.getUI_Field_TypeAccess().getRichtextEnumLiteralDeclaration_6()); }
(	'richtext' 
)
{ after(grammarAccess.getUI_Field_TypeAccess().getRichtextEnumLiteralDeclaration_6()); }
)

;
finally {
	restoreStackSize(stackSize);
}



rule__UserInterface__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__UserInterface__Group__0__Impl
	rule__UserInterface__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__UserInterface__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getUserInterfaceAccess().getUserInterfaceAction_0()); }
(

)
{ after(grammarAccess.getUserInterfaceAccess().getUserInterfaceAction_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__UserInterface__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__UserInterface__Group__1__Impl
	rule__UserInterface__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__UserInterface__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getUserInterfaceAccess().getImportsAssignment_1()); }
(rule__UserInterface__ImportsAssignment_1)*
{ after(grammarAccess.getUserInterfaceAccess().getImportsAssignment_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__UserInterface__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__UserInterface__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__UserInterface__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getUserInterfaceAccess().getUiDescriptionAssignment_2()); }
(rule__UserInterface__UiDescriptionAssignment_2)
{ after(grammarAccess.getUserInterfaceAccess().getUiDescriptionAssignment_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}








rule__Import__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Import__Group__0__Impl
	rule__Import__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Import__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getImportAccess().getImportKeyword_0()); }

	'import' 

{ after(grammarAccess.getImportAccess().getImportKeyword_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Import__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Import__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Import__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getImportAccess().getImportedNamespaceAssignment_1()); }
(rule__Import__ImportedNamespaceAssignment_1)
{ after(grammarAccess.getImportAccess().getImportedNamespaceAssignment_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__UIDescription__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__UIDescription__Group__0__Impl
	rule__UIDescription__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__UIDescription__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getUIDescriptionAccess().getUIDescriptionAction_0()); }
(

)
{ after(grammarAccess.getUIDescriptionAccess().getUIDescriptionAction_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__UIDescription__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__UIDescription__Group__1__Impl
	rule__UIDescription__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__UIDescription__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getUIDescriptionAccess().getUIDescriptionKeyword_1()); }

	'UIDescription' 

{ after(grammarAccess.getUIDescriptionAccess().getUIDescriptionKeyword_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__UIDescription__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__UIDescription__Group__2__Impl
	rule__UIDescription__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__UIDescription__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getUIDescriptionAccess().getNameAssignment_2()); }
(rule__UIDescription__NameAssignment_2)
{ after(grammarAccess.getUIDescriptionAccess().getNameAssignment_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__UIDescription__Group__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__UIDescription__Group__3__Impl
	rule__UIDescription__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__UIDescription__Group__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getUIDescriptionAccess().getLeftCurlyBracketKeyword_3()); }

	'{' 

{ after(grammarAccess.getUIDescriptionAccess().getLeftCurlyBracketKeyword_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__UIDescription__Group__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__UIDescription__Group__4__Impl
	rule__UIDescription__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__UIDescription__Group__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getUIDescriptionAccess().getUIsAssignment_4()); }
(rule__UIDescription__UIsAssignment_4)*
{ after(grammarAccess.getUIDescriptionAccess().getUIsAssignment_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__UIDescription__Group__5
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__UIDescription__Group__5__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__UIDescription__Group__5__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getUIDescriptionAccess().getRightCurlyBracketKeyword_5()); }

	'}' 

{ after(grammarAccess.getUIDescriptionAccess().getRightCurlyBracketKeyword_5()); }
)

;
finally {
	restoreStackSize(stackSize);
}














rule__UI__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__UI__Group__0__Impl
	rule__UI__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__UI__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getUIAccess().getUIAction_0()); }
(

)
{ after(grammarAccess.getUIAccess().getUIAction_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__UI__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__UI__Group__1__Impl
	rule__UI__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__UI__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getUIAccess().getUIKeyword_1()); }

	'UI' 

{ after(grammarAccess.getUIAccess().getUIKeyword_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__UI__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__UI__Group__2__Impl
	rule__UI__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__UI__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getUIAccess().getNameAssignment_2()); }
(rule__UI__NameAssignment_2)?
{ after(grammarAccess.getUIAccess().getNameAssignment_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__UI__Group__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__UI__Group__3__Impl
	rule__UI__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__UI__Group__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getUIAccess().getUI_DataSourceAssignment_3()); }
(rule__UI__UI_DataSourceAssignment_3)?
{ after(grammarAccess.getUIAccess().getUI_DataSourceAssignment_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__UI__Group__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__UI__Group__4__Impl
	rule__UI__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__UI__Group__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getUIAccess().getLeftCurlyBracketKeyword_4()); }

	'{' 

{ after(grammarAccess.getUIAccess().getLeftCurlyBracketKeyword_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__UI__Group__5
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__UI__Group__5__Impl
	rule__UI__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__UI__Group__5__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getUIAccess().getGroup_5()); }
(rule__UI__Group_5__0)?
{ after(grammarAccess.getUIAccess().getGroup_5()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__UI__Group__6
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__UI__Group__6__Impl
	rule__UI__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__UI__Group__6__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getUIAccess().getUI_ContainersAssignment_6()); }
(rule__UI__UI_ContainersAssignment_6)*
{ after(grammarAccess.getUIAccess().getUI_ContainersAssignment_6()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__UI__Group__7
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__UI__Group__7__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__UI__Group__7__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getUIAccess().getRightCurlyBracketKeyword_7()); }

	'}' 

{ after(grammarAccess.getUIAccess().getRightCurlyBracketKeyword_7()); }
)

;
finally {
	restoreStackSize(stackSize);
}


















rule__UI__Group_5__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__UI__Group_5__0__Impl
	rule__UI__Group_5__1
;
finally {
	restoreStackSize(stackSize);
}

rule__UI__Group_5__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getUIAccess().getLabelKeyword_5_0()); }

	'label:' 

{ after(grammarAccess.getUIAccess().getLabelKeyword_5_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__UI__Group_5__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__UI__Group_5__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__UI__Group_5__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getUIAccess().getLabelAssignment_5_1()); }
(rule__UI__LabelAssignment_5_1)
{ after(grammarAccess.getUIAccess().getLabelAssignment_5_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__UIContainer__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__UIContainer__Group__0__Impl
	rule__UIContainer__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__UIContainer__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getUIContainerAccess().getUIContainerAction_0()); }
(

)
{ after(grammarAccess.getUIContainerAccess().getUIContainerAction_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__UIContainer__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__UIContainer__Group__1__Impl
	rule__UIContainer__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__UIContainer__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getUIContainerAccess().getContainerKeyword_1()); }

	'Container' 

{ after(grammarAccess.getUIContainerAccess().getContainerKeyword_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__UIContainer__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__UIContainer__Group__2__Impl
	rule__UIContainer__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__UIContainer__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getUIContainerAccess().getNameAssignment_2()); }
(rule__UIContainer__NameAssignment_2)?
{ after(grammarAccess.getUIContainerAccess().getNameAssignment_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__UIContainer__Group__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__UIContainer__Group__3__Impl
	rule__UIContainer__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__UIContainer__Group__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getUIContainerAccess().getLeftCurlyBracketKeyword_3()); }

	'{' 

{ after(grammarAccess.getUIContainerAccess().getLeftCurlyBracketKeyword_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__UIContainer__Group__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__UIContainer__Group__4__Impl
	rule__UIContainer__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__UIContainer__Group__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getUIContainerAccess().getGroup_4()); }
(rule__UIContainer__Group_4__0)?
{ after(grammarAccess.getUIContainerAccess().getGroup_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__UIContainer__Group__5
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__UIContainer__Group__5__Impl
	rule__UIContainer__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__UIContainer__Group__5__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getUIContainerAccess().getGroup_5()); }
(rule__UIContainer__Group_5__0)?
{ after(grammarAccess.getUIContainerAccess().getGroup_5()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__UIContainer__Group__6
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__UIContainer__Group__6__Impl
	rule__UIContainer__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__UIContainer__Group__6__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getUIContainerAccess().getGroup_6()); }
(rule__UIContainer__Group_6__0)?
{ after(grammarAccess.getUIContainerAccess().getGroup_6()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__UIContainer__Group__7
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__UIContainer__Group__7__Impl
	rule__UIContainer__Group__8
;
finally {
	restoreStackSize(stackSize);
}

rule__UIContainer__Group__7__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getUIContainerAccess().getGroup_7()); }
(rule__UIContainer__Group_7__0)?
{ after(grammarAccess.getUIContainerAccess().getGroup_7()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__UIContainer__Group__8
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__UIContainer__Group__8__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__UIContainer__Group__8__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getUIContainerAccess().getRightCurlyBracketKeyword_8()); }

	'}' 

{ after(grammarAccess.getUIContainerAccess().getRightCurlyBracketKeyword_8()); }
)

;
finally {
	restoreStackSize(stackSize);
}




















rule__UIContainer__Group_4__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__UIContainer__Group_4__0__Impl
	rule__UIContainer__Group_4__1
;
finally {
	restoreStackSize(stackSize);
}

rule__UIContainer__Group_4__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getUIContainerAccess().getLabelKeyword_4_0()); }

	'label:' 

{ after(grammarAccess.getUIContainerAccess().getLabelKeyword_4_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__UIContainer__Group_4__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__UIContainer__Group_4__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__UIContainer__Group_4__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getUIContainerAccess().getLabelAssignment_4_1()); }
(rule__UIContainer__LabelAssignment_4_1)
{ after(grammarAccess.getUIContainerAccess().getLabelAssignment_4_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__UIContainer__Group_5__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__UIContainer__Group_5__0__Impl
	rule__UIContainer__Group_5__1
;
finally {
	restoreStackSize(stackSize);
}

rule__UIContainer__Group_5__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getUIContainerAccess().getDescriptionKeyword_5_0()); }

	'description:' 

{ after(grammarAccess.getUIContainerAccess().getDescriptionKeyword_5_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__UIContainer__Group_5__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__UIContainer__Group_5__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__UIContainer__Group_5__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getUIContainerAccess().getDescriptionAssignment_5_1()); }
(rule__UIContainer__DescriptionAssignment_5_1)
{ after(grammarAccess.getUIContainerAccess().getDescriptionAssignment_5_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__UIContainer__Group_6__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__UIContainer__Group_6__0__Impl
	rule__UIContainer__Group_6__1
;
finally {
	restoreStackSize(stackSize);
}

rule__UIContainer__Group_6__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getUIContainerAccess().getUI_fieldsAssignment_6_0()); }
(rule__UIContainer__UI_fieldsAssignment_6_0)
{ after(grammarAccess.getUIContainerAccess().getUI_fieldsAssignment_6_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__UIContainer__Group_6__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__UIContainer__Group_6__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__UIContainer__Group_6__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getUIContainerAccess().getUI_fieldsAssignment_6_1()); }
(rule__UIContainer__UI_fieldsAssignment_6_1)*
{ after(grammarAccess.getUIContainerAccess().getUI_fieldsAssignment_6_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__UIContainer__Group_7__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__UIContainer__Group_7__0__Impl
	rule__UIContainer__Group_7__1
;
finally {
	restoreStackSize(stackSize);
}

rule__UIContainer__Group_7__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getUIContainerAccess().getSubContainersAssignment_7_0()); }
(rule__UIContainer__SubContainersAssignment_7_0)
{ after(grammarAccess.getUIContainerAccess().getSubContainersAssignment_7_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__UIContainer__Group_7__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__UIContainer__Group_7__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__UIContainer__Group_7__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getUIContainerAccess().getSubContainersAssignment_7_1()); }
(rule__UIContainer__SubContainersAssignment_7_1)*
{ after(grammarAccess.getUIContainerAccess().getSubContainersAssignment_7_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__LocalClass__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__LocalClass__Group__0__Impl
	rule__LocalClass__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__LocalClass__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getLocalClassAccess().getLocalClassAction_0()); }
(

)
{ after(grammarAccess.getLocalClassAccess().getLocalClassAction_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__LocalClass__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__LocalClass__Group__1__Impl
	rule__LocalClass__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__LocalClass__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getLocalClassAccess().getForKeyword_1()); }

	'for' 

{ after(grammarAccess.getLocalClassAccess().getForKeyword_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__LocalClass__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__LocalClass__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__LocalClass__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getLocalClassAccess().getUI_For_LocalClassAssignment_2()); }
(rule__LocalClass__UI_For_LocalClassAssignment_2)
{ after(grammarAccess.getLocalClassAccess().getUI_For_LocalClassAssignment_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}








rule__UIField__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__UIField__Group__0__Impl
	rule__UIField__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__UIField__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getUIFieldAccess().getUIFieldAction_0()); }
(

)
{ after(grammarAccess.getUIFieldAccess().getUIFieldAction_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__UIField__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__UIField__Group__1__Impl
	rule__UIField__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__UIField__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getUIFieldAccess().getFieldKeyword_1()); }

	'Field' 

{ after(grammarAccess.getUIFieldAccess().getFieldKeyword_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__UIField__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__UIField__Group__2__Impl
	rule__UIField__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__UIField__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getUIFieldAccess().getNameAssignment_2()); }
(rule__UIField__NameAssignment_2)
{ after(grammarAccess.getUIFieldAccess().getNameAssignment_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__UIField__Group__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__UIField__Group__3__Impl
	rule__UIField__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__UIField__Group__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getUIFieldAccess().getGroup_3()); }
(rule__UIField__Group_3__0)?
{ after(grammarAccess.getUIFieldAccess().getGroup_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__UIField__Group__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__UIField__Group__4__Impl
	rule__UIField__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__UIField__Group__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getUIFieldAccess().getGroup_4()); }
(rule__UIField__Group_4__0)?
{ after(grammarAccess.getUIFieldAccess().getGroup_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__UIField__Group__5
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__UIField__Group__5__Impl
	rule__UIField__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__UIField__Group__5__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getUIFieldAccess().getGroup_5()); }
(rule__UIField__Group_5__0)?
{ after(grammarAccess.getUIFieldAccess().getGroup_5()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__UIField__Group__6
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__UIField__Group__6__Impl
	rule__UIField__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__UIField__Group__6__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getUIFieldAccess().getCommaKeyword_6()); }

	',' 

{ after(grammarAccess.getUIFieldAccess().getCommaKeyword_6()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__UIField__Group__7
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__UIField__Group__7__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__UIField__Group__7__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getUIFieldAccess().getMappingAssignment_7()); }
(rule__UIField__MappingAssignment_7)
{ after(grammarAccess.getUIFieldAccess().getMappingAssignment_7()); }
)

;
finally {
	restoreStackSize(stackSize);
}


















rule__UIField__Group_3__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__UIField__Group_3__0__Impl
	rule__UIField__Group_3__1
;
finally {
	restoreStackSize(stackSize);
}

rule__UIField__Group_3__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getUIFieldAccess().getLabelKeyword_3_0()); }

	'label:' 

{ after(grammarAccess.getUIFieldAccess().getLabelKeyword_3_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__UIField__Group_3__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__UIField__Group_3__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__UIField__Group_3__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getUIFieldAccess().getLabelAssignment_3_1()); }
(rule__UIField__LabelAssignment_3_1)
{ after(grammarAccess.getUIFieldAccess().getLabelAssignment_3_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__UIField__Group_4__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__UIField__Group_4__0__Impl
	rule__UIField__Group_4__1
;
finally {
	restoreStackSize(stackSize);
}

rule__UIField__Group_4__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getUIFieldAccess().getDescriptionKeyword_4_0()); }

	'description:' 

{ after(grammarAccess.getUIFieldAccess().getDescriptionKeyword_4_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__UIField__Group_4__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__UIField__Group_4__1__Impl
	rule__UIField__Group_4__2
;
finally {
	restoreStackSize(stackSize);
}

rule__UIField__Group_4__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getUIFieldAccess().getDescriptionAssignment_4_1()); }
(rule__UIField__DescriptionAssignment_4_1)
{ after(grammarAccess.getUIFieldAccess().getDescriptionAssignment_4_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__UIField__Group_4__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__UIField__Group_4__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__UIField__Group_4__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getUIFieldAccess().getCommaKeyword_4_2()); }

	',' 

{ after(grammarAccess.getUIFieldAccess().getCommaKeyword_4_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}








rule__UIField__Group_5__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__UIField__Group_5__0__Impl
	rule__UIField__Group_5__1
;
finally {
	restoreStackSize(stackSize);
}

rule__UIField__Group_5__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getUIFieldAccess().getTypeKeyword_5_0()); }

	'type' 

{ after(grammarAccess.getUIFieldAccess().getTypeKeyword_5_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__UIField__Group_5__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__UIField__Group_5__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__UIField__Group_5__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getUIFieldAccess().getTypeAssignment_5_1()); }
(rule__UIField__TypeAssignment_5_1)
{ after(grammarAccess.getUIFieldAccess().getTypeAssignment_5_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__FieldMapping__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__FieldMapping__Group__0__Impl
	rule__FieldMapping__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__FieldMapping__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getFieldMappingAccess().getFieldMappingAction_0()); }
(

)
{ after(grammarAccess.getFieldMappingAccess().getFieldMappingAction_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__FieldMapping__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__FieldMapping__Group__1__Impl
	rule__FieldMapping__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__FieldMapping__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getFieldMappingAccess().getMappedToKeyword_1()); }

	'mapped-to' 

{ after(grammarAccess.getFieldMappingAccess().getMappedToKeyword_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__FieldMapping__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__FieldMapping__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__FieldMapping__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getFieldMappingAccess().getUI_Field_Mapped_ToAssignment_2()); }
(rule__FieldMapping__UI_Field_Mapped_ToAssignment_2)?
{ after(grammarAccess.getFieldMappingAccess().getUI_Field_Mapped_ToAssignment_2()); }
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







rule__UserInterface__ImportsAssignment_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getUserInterfaceAccess().getImportsImportParserRuleCall_1_0()); }
	ruleImport{ after(grammarAccess.getUserInterfaceAccess().getImportsImportParserRuleCall_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__UserInterface__UiDescriptionAssignment_2
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getUserInterfaceAccess().getUiDescriptionAspectParserRuleCall_2_0()); }
	ruleAspect{ after(grammarAccess.getUserInterfaceAccess().getUiDescriptionAspectParserRuleCall_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Import__ImportedNamespaceAssignment_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getImportAccess().getImportedNamespaceFQNParserRuleCall_1_0()); }
	ruleFQN{ after(grammarAccess.getImportAccess().getImportedNamespaceFQNParserRuleCall_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__UIDescription__NameAssignment_2
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getUIDescriptionAccess().getNameFQNParserRuleCall_2_0()); }
	ruleFQN{ after(grammarAccess.getUIDescriptionAccess().getNameFQNParserRuleCall_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__UIDescription__UIsAssignment_4
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getUIDescriptionAccess().getUIsUIParserRuleCall_4_0()); }
	ruleUI{ after(grammarAccess.getUIDescriptionAccess().getUIsUIParserRuleCall_4_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__UI__NameAssignment_2
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getUIAccess().getNameEStringParserRuleCall_2_0()); }
	ruleEString{ after(grammarAccess.getUIAccess().getNameEStringParserRuleCall_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__UI__UI_DataSourceAssignment_3
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getUIAccess().getUI_DataSourceDataSourceParserRuleCall_3_0()); }
	ruleDataSource{ after(grammarAccess.getUIAccess().getUI_DataSourceDataSourceParserRuleCall_3_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__UI__LabelAssignment_5_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getUIAccess().getLabelEStringParserRuleCall_5_1_0()); }
	ruleEString{ after(grammarAccess.getUIAccess().getLabelEStringParserRuleCall_5_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__UI__UI_ContainersAssignment_6
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getUIAccess().getUI_ContainersUIContainerParserRuleCall_6_0()); }
	ruleUIContainer{ after(grammarAccess.getUIAccess().getUI_ContainersUIContainerParserRuleCall_6_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__UIContainer__NameAssignment_2
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getUIContainerAccess().getNameEStringParserRuleCall_2_0()); }
	ruleEString{ after(grammarAccess.getUIContainerAccess().getNameEStringParserRuleCall_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__UIContainer__LabelAssignment_4_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getUIContainerAccess().getLabelEStringParserRuleCall_4_1_0()); }
	ruleEString{ after(grammarAccess.getUIContainerAccess().getLabelEStringParserRuleCall_4_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__UIContainer__DescriptionAssignment_5_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getUIContainerAccess().getDescriptionEStringParserRuleCall_5_1_0()); }
	ruleEString{ after(grammarAccess.getUIContainerAccess().getDescriptionEStringParserRuleCall_5_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__UIContainer__UI_fieldsAssignment_6_0
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getUIContainerAccess().getUI_fieldsUIFieldParserRuleCall_6_0_0()); }
	ruleUIField{ after(grammarAccess.getUIContainerAccess().getUI_fieldsUIFieldParserRuleCall_6_0_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__UIContainer__UI_fieldsAssignment_6_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getUIContainerAccess().getUI_fieldsUIFieldParserRuleCall_6_1_0()); }
	ruleUIField{ after(grammarAccess.getUIContainerAccess().getUI_fieldsUIFieldParserRuleCall_6_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__UIContainer__SubContainersAssignment_7_0
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getUIContainerAccess().getSubContainersUIContainerParserRuleCall_7_0_0()); }
	ruleUIContainer{ after(grammarAccess.getUIContainerAccess().getSubContainersUIContainerParserRuleCall_7_0_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__UIContainer__SubContainersAssignment_7_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getUIContainerAccess().getSubContainersUIContainerParserRuleCall_7_1_0()); }
	ruleUIContainer{ after(grammarAccess.getUIContainerAccess().getSubContainersUIContainerParserRuleCall_7_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__LocalClass__UI_For_LocalClassAssignment_2
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getLocalClassAccess().getUI_For_LocalClassClassCrossReference_2_0()); }
(
{ before(grammarAccess.getLocalClassAccess().getUI_For_LocalClassClassFQNParserRuleCall_2_0_1()); }
	ruleFQN{ after(grammarAccess.getLocalClassAccess().getUI_For_LocalClassClassFQNParserRuleCall_2_0_1()); }
)
{ after(grammarAccess.getLocalClassAccess().getUI_For_LocalClassClassCrossReference_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__UIField__NameAssignment_2
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getUIFieldAccess().getNameEStringParserRuleCall_2_0()); }
	ruleEString{ after(grammarAccess.getUIFieldAccess().getNameEStringParserRuleCall_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__UIField__LabelAssignment_3_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getUIFieldAccess().getLabelEStringParserRuleCall_3_1_0()); }
	ruleEString{ after(grammarAccess.getUIFieldAccess().getLabelEStringParserRuleCall_3_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__UIField__DescriptionAssignment_4_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getUIFieldAccess().getDescriptionEStringParserRuleCall_4_1_0()); }
	ruleEString{ after(grammarAccess.getUIFieldAccess().getDescriptionEStringParserRuleCall_4_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__UIField__TypeAssignment_5_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getUIFieldAccess().getTypeUI_Field_TypeEnumRuleCall_5_1_0()); }
	ruleUI_Field_Type{ after(grammarAccess.getUIFieldAccess().getTypeUI_Field_TypeEnumRuleCall_5_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__UIField__MappingAssignment_7
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getUIFieldAccess().getMappingFieldMappingParserRuleCall_7_0()); }
	ruleFieldMapping{ after(grammarAccess.getUIFieldAccess().getMappingFieldMappingParserRuleCall_7_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__FieldMapping__UI_Field_Mapped_ToAssignment_2
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getFieldMappingAccess().getUI_Field_Mapped_ToAbstractFeatureCrossReference_2_0()); }
(
{ before(grammarAccess.getFieldMappingAccess().getUI_Field_Mapped_ToAbstractFeatureFQNParserRuleCall_2_0_1()); }
	ruleFQN{ after(grammarAccess.getFieldMappingAccess().getUI_Field_Mapped_ToAbstractFeatureFQNParserRuleCall_2_0_1()); }
)
{ after(grammarAccess.getFieldMappingAccess().getUI_Field_Mapped_ToAbstractFeatureCrossReference_2_0()); }
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



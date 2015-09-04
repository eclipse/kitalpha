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
grammar InternalData;

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
import org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.DataGrammarAccess;

}

@parser::members {
 
 	private DataGrammarAccess grammarAccess;
 	
    public void setGrammarAccess(DataGrammarAccess grammarAccess) {
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




// Entry rule entryRuleDataSpec
entryRuleDataSpec 
:
{ before(grammarAccess.getDataSpecRule()); }
	 ruleDataSpec
{ after(grammarAccess.getDataSpecRule()); } 
	 EOF 
;

// Rule DataSpec
ruleDataSpec
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getDataSpecAccess().getGroup()); }
(rule__DataSpec__Group__0)
{ after(grammarAccess.getDataSpecAccess().getGroup()); }
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



// Entry rule entryRuleImportNamespace
entryRuleImportNamespace 
:
{ before(grammarAccess.getImportNamespaceRule()); }
	 ruleImportNamespace
{ after(grammarAccess.getImportNamespaceRule()); } 
	 EOF 
;

// Rule ImportNamespace
ruleImportNamespace
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getImportNamespaceAccess().getImportedNamespaceAssignment()); }
(rule__ImportNamespace__ImportedNamespaceAssignment)
{ after(grammarAccess.getImportNamespaceAccess().getImportedNamespaceAssignment()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleImportURI
entryRuleImportURI 
:
{ before(grammarAccess.getImportURIRule()); }
	 ruleImportURI
{ after(grammarAccess.getImportURIRule()); } 
	 EOF 
;

// Rule ImportURI
ruleImportURI
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getImportURIAccess().getGroup()); }
(rule__ImportURI__Group__0)
{ after(grammarAccess.getImportURIAccess().getGroup()); }
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



// Entry rule entryRuleData
entryRuleData 
:
{ before(grammarAccess.getDataRule()); }
	 ruleData
{ after(grammarAccess.getDataRule()); } 
	 EOF 
;

// Rule Data
ruleData
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getDataAccess().getGroup()); }
(rule__Data__Group__0)
{ after(grammarAccess.getDataAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleClass
entryRuleClass 
:
{ before(grammarAccess.getClassRule()); }
	 ruleClass
{ after(grammarAccess.getClassRule()); } 
	 EOF 
;

// Rule Class
ruleClass
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getClassAccess().getGroup()); }
(rule__Class__Group__0)
{ after(grammarAccess.getClassAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleEnumeration
entryRuleEnumeration 
:
{ before(grammarAccess.getEnumerationRule()); }
	 ruleEnumeration
{ after(grammarAccess.getEnumerationRule()); } 
	 EOF 
;

// Rule Enumeration
ruleEnumeration
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getEnumerationAccess().getGroup()); }
(rule__Enumeration__Group__0)
{ after(grammarAccess.getEnumerationAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleAbstractSuperClass
entryRuleAbstractSuperClass 
:
{ before(grammarAccess.getAbstractSuperClassRule()); }
	 ruleAbstractSuperClass
{ after(grammarAccess.getAbstractSuperClassRule()); } 
	 EOF 
;

// Rule AbstractSuperClass
ruleAbstractSuperClass
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getAbstractSuperClassAccess().getAlternatives()); }
(rule__AbstractSuperClass__Alternatives)
{ after(grammarAccess.getAbstractSuperClassAccess().getAlternatives()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleLocalSuperClass
entryRuleLocalSuperClass 
:
{ before(grammarAccess.getLocalSuperClassRule()); }
	 ruleLocalSuperClass
{ after(grammarAccess.getLocalSuperClassRule()); } 
	 EOF 
;

// Rule LocalSuperClass
ruleLocalSuperClass
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getLocalSuperClassAccess().getGroup()); }
(rule__LocalSuperClass__Group__0)
{ after(grammarAccess.getLocalSuperClassAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleExternalSuperClass
entryRuleExternalSuperClass 
:
{ before(grammarAccess.getExternalSuperClassRule()); }
	 ruleExternalSuperClass
{ after(grammarAccess.getExternalSuperClassRule()); } 
	 EOF 
;

// Rule ExternalSuperClass
ruleExternalSuperClass
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getExternalSuperClassAccess().getGroup()); }
(rule__ExternalSuperClass__Group__0)
{ after(grammarAccess.getExternalSuperClassAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}





// Entry rule entryRuleAbstractAssociation
entryRuleAbstractAssociation 
:
{ before(grammarAccess.getAbstractAssociationRule()); }
	 ruleAbstractAssociation
{ after(grammarAccess.getAbstractAssociationRule()); } 
	 EOF 
;

// Rule AbstractAssociation
ruleAbstractAssociation
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getAbstractAssociationAccess().getAlternatives()); }
(rule__AbstractAssociation__Alternatives)
{ after(grammarAccess.getAbstractAssociationAccess().getAlternatives()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleLocalClassAssociation
entryRuleLocalClassAssociation 
:
{ before(grammarAccess.getLocalClassAssociationRule()); }
	 ruleLocalClassAssociation
{ after(grammarAccess.getLocalClassAssociationRule()); } 
	 EOF 
;

// Rule LocalClassAssociation
ruleLocalClassAssociation
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getLocalClassAssociationAccess().getGroup()); }
(rule__LocalClassAssociation__Group__0)
{ after(grammarAccess.getLocalClassAssociationAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleExternalClassAssociation
entryRuleExternalClassAssociation 
:
{ before(grammarAccess.getExternalClassAssociationRule()); }
	 ruleExternalClassAssociation
{ after(grammarAccess.getExternalClassAssociationRule()); } 
	 EOF 
;

// Rule ExternalClassAssociation
ruleExternalClassAssociation
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getExternalClassAssociationAccess().getGroup()); }
(rule__ExternalClassAssociation__Group__0)
{ after(grammarAccess.getExternalClassAssociationAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleAbstractAttributeType
entryRuleAbstractAttributeType 
:
{ before(grammarAccess.getAbstractAttributeTypeRule()); }
	 ruleAbstractAttributeType
{ after(grammarAccess.getAbstractAttributeTypeRule()); } 
	 EOF 
;

// Rule AbstractAttributeType
ruleAbstractAttributeType
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getAbstractAttributeTypeAccess().getAlternatives()); }
(rule__AbstractAttributeType__Alternatives)
{ after(grammarAccess.getAbstractAttributeTypeAccess().getAlternatives()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleLocalAttributeType
entryRuleLocalAttributeType 
:
{ before(grammarAccess.getLocalAttributeTypeRule()); }
	 ruleLocalAttributeType
{ after(grammarAccess.getLocalAttributeTypeRule()); } 
	 EOF 
;

// Rule LocalAttributeType
ruleLocalAttributeType
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getLocalAttributeTypeAccess().getGroup()); }
(rule__LocalAttributeType__Group__0)
{ after(grammarAccess.getLocalAttributeTypeAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleExternalAttributeType
entryRuleExternalAttributeType 
:
{ before(grammarAccess.getExternalAttributeTypeRule()); }
	 ruleExternalAttributeType
{ after(grammarAccess.getExternalAttributeTypeRule()); } 
	 EOF 
;

// Rule ExternalAttributeType
ruleExternalAttributeType
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getExternalAttributeTypeAccess().getGroup()); }
(rule__ExternalAttributeType__Group__0)
{ after(grammarAccess.getExternalAttributeTypeAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleAttribute
entryRuleAttribute 
:
{ before(grammarAccess.getAttributeRule()); }
	 ruleAttribute
{ after(grammarAccess.getAttributeRule()); } 
	 EOF 
;

// Rule Attribute
ruleAttribute
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getAttributeAccess().getGroup()); }
(rule__Attribute__Group__0)
{ after(grammarAccess.getAttributeAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleValue
entryRuleValue 
:
{ before(grammarAccess.getValueRule()); }
	 ruleValue
{ after(grammarAccess.getValueRule()); } 
	 EOF 
;

// Rule Value
ruleValue
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getValueAccess().getGroup()); }
(rule__Value__Group__0)
{ after(grammarAccess.getValueAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleOperation
entryRuleOperation 
:
{ before(grammarAccess.getOperationRule()); }
	 ruleOperation
{ after(grammarAccess.getOperationRule()); } 
	 EOF 
;

// Rule Operation
ruleOperation
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getOperationAccess().getGroup()); }
(rule__Operation__Group__0)
{ after(grammarAccess.getOperationAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleParameter
entryRuleParameter 
:
{ before(grammarAccess.getParameterRule()); }
	 ruleParameter
{ after(grammarAccess.getParameterRule()); } 
	 EOF 
;

// Rule Parameter
ruleParameter
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getParameterAccess().getGroup()); }
(rule__Parameter__Group__0)
{ after(grammarAccess.getParameterAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleAbstractType
entryRuleAbstractType 
:
{ before(grammarAccess.getAbstractTypeRule()); }
	 ruleAbstractType
{ after(grammarAccess.getAbstractTypeRule()); } 
	 EOF 
;

// Rule AbstractType
ruleAbstractType
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getAbstractTypeAccess().getAlternatives()); }
(rule__AbstractType__Alternatives)
{ after(grammarAccess.getAbstractTypeAccess().getAlternatives()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleExternalType
entryRuleExternalType 
:
{ before(grammarAccess.getExternalTypeRule()); }
	 ruleExternalType
{ after(grammarAccess.getExternalTypeRule()); } 
	 EOF 
;

// Rule ExternalType
ruleExternalType
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getExternalTypeAccess().getGroup()); }
(rule__ExternalType__Group__0)
{ after(grammarAccess.getExternalTypeAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleLocalType
entryRuleLocalType 
:
{ before(grammarAccess.getLocalTypeRule()); }
	 ruleLocalType
{ after(grammarAccess.getLocalTypeRule()); } 
	 EOF 
;

// Rule LocalType
ruleLocalType
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getLocalTypeAccess().getGroup()); }
(rule__LocalType__Group__0)
{ after(grammarAccess.getLocalTypeAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}





// Entry rule entryRuleAnnotation
entryRuleAnnotation 
:
{ before(grammarAccess.getAnnotationRule()); }
	 ruleAnnotation
{ after(grammarAccess.getAnnotationRule()); } 
	 EOF 
;

// Rule Annotation
ruleAnnotation
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getAnnotationAccess().getGroup()); }
(rule__Annotation__Group__0)
{ after(grammarAccess.getAnnotationAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleDetail
entryRuleDetail 
:
{ before(grammarAccess.getDetailRule()); }
	 ruleDetail
{ after(grammarAccess.getDetailRule()); } 
	 EOF 
;

// Rule Detail
ruleDetail
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getDetailAccess().getGroup()); }
(rule__Detail__Group__0)
{ after(grammarAccess.getDetailAccess().getGroup()); }
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



// Entry rule entryRuleEBoolean
entryRuleEBoolean 
:
{ before(grammarAccess.getEBooleanRule()); }
	 ruleEBoolean
{ after(grammarAccess.getEBooleanRule()); } 
	 EOF 
;

// Rule EBoolean
ruleEBoolean
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getEBooleanAccess().getAlternatives()); }
(rule__EBoolean__Alternatives)
{ after(grammarAccess.getEBooleanAccess().getAlternatives()); }
)

;
finally {
	restoreStackSize(stackSize);
}






// Rule Association_Types
ruleAssociation_Types
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getAssociation_TypesAccess().getAlternatives()); }
(rule__Association_Types__Alternatives)
{ after(grammarAccess.getAssociation_TypesAccess().getAlternatives()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Rule Cardinalities
ruleCardinalities
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getCardinalitiesAccess().getAlternatives()); }
(rule__Cardinalities__Alternatives)
{ after(grammarAccess.getCardinalitiesAccess().getAlternatives()); }
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
{ before(grammarAccess.getAbstractImportAccess().getImportNamespaceParserRuleCall_0()); }
	ruleImportNamespace
{ after(grammarAccess.getAbstractImportAccess().getImportNamespaceParserRuleCall_0()); }
)

    |(
{ before(grammarAccess.getAbstractImportAccess().getImportURIParserRuleCall_1()); }
	ruleImportURI
{ after(grammarAccess.getAbstractImportAccess().getImportURIParserRuleCall_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__AbstractSuperClass__Alternatives
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getAbstractSuperClassAccess().getLocalSuperClassParserRuleCall_0()); }
	ruleLocalSuperClass
{ after(grammarAccess.getAbstractSuperClassAccess().getLocalSuperClassParserRuleCall_0()); }
)

    |(
{ before(grammarAccess.getAbstractSuperClassAccess().getExternalSuperClassParserRuleCall_1()); }
	ruleExternalSuperClass
{ after(grammarAccess.getAbstractSuperClassAccess().getExternalSuperClassParserRuleCall_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__AbstractAssociation__Alternatives
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getAbstractAssociationAccess().getLocalClassAssociationParserRuleCall_0()); }
	ruleLocalClassAssociation
{ after(grammarAccess.getAbstractAssociationAccess().getLocalClassAssociationParserRuleCall_0()); }
)

    |(
{ before(grammarAccess.getAbstractAssociationAccess().getExternalClassAssociationParserRuleCall_1()); }
	ruleExternalClassAssociation
{ after(grammarAccess.getAbstractAssociationAccess().getExternalClassAssociationParserRuleCall_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__AbstractAttributeType__Alternatives
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getAbstractAttributeTypeAccess().getLocalAttributeTypeParserRuleCall_0()); }
	ruleLocalAttributeType
{ after(grammarAccess.getAbstractAttributeTypeAccess().getLocalAttributeTypeParserRuleCall_0()); }
)

    |(
{ before(grammarAccess.getAbstractAttributeTypeAccess().getExternalAttributeTypeParserRuleCall_1()); }
	ruleExternalAttributeType
{ after(grammarAccess.getAbstractAttributeTypeAccess().getExternalAttributeTypeParserRuleCall_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__AbstractType__Alternatives
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getAbstractTypeAccess().getLocalTypeParserRuleCall_0()); }
	ruleLocalType
{ after(grammarAccess.getAbstractTypeAccess().getLocalTypeParserRuleCall_0()); }
)

    |(
{ before(grammarAccess.getAbstractTypeAccess().getExternalTypeParserRuleCall_1()); }
	ruleExternalType
{ after(grammarAccess.getAbstractTypeAccess().getExternalTypeParserRuleCall_1()); }
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

rule__EBoolean__Alternatives
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getEBooleanAccess().getTrueKeyword_0()); }

	'true' 

{ after(grammarAccess.getEBooleanAccess().getTrueKeyword_0()); }
)

    |(
{ before(grammarAccess.getEBooleanAccess().getFalseKeyword_1()); }

	'false' 

{ after(grammarAccess.getEBooleanAccess().getFalseKeyword_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Association_Types__Alternatives
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getAssociation_TypesAccess().getContainmentEnumLiteralDeclaration_0()); }
(	'contains' 
)
{ after(grammarAccess.getAssociation_TypesAccess().getContainmentEnumLiteralDeclaration_0()); }
)

    |(
{ before(grammarAccess.getAssociation_TypesAccess().getReferenceEnumLiteralDeclaration_1()); }
(	'refers' 
)
{ after(grammarAccess.getAssociation_TypesAccess().getReferenceEnumLiteralDeclaration_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Cardinalities__Alternatives
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getCardinalitiesAccess().getNothing_Or_ManyEnumLiteralDeclaration_0()); }
(	'[0,*]' 
)
{ after(grammarAccess.getCardinalitiesAccess().getNothing_Or_ManyEnumLiteralDeclaration_0()); }
)

    |(
{ before(grammarAccess.getCardinalitiesAccess().getOne_Or_ManyEnumLiteralDeclaration_1()); }
(	'[1,*]' 
)
{ after(grammarAccess.getCardinalitiesAccess().getOne_Or_ManyEnumLiteralDeclaration_1()); }
)

    |(
{ before(grammarAccess.getCardinalitiesAccess().getNothing_Or_OneEnumLiteralDeclaration_2()); }
(	'[0,1]' 
)
{ after(grammarAccess.getCardinalitiesAccess().getNothing_Or_OneEnumLiteralDeclaration_2()); }
)

    |(
{ before(grammarAccess.getCardinalitiesAccess().getOnly_OneEnumLiteralDeclaration_3()); }
(	'[1,1]' 
)
{ after(grammarAccess.getCardinalitiesAccess().getOnly_OneEnumLiteralDeclaration_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}



rule__DataSpec__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__DataSpec__Group__0__Impl
	rule__DataSpec__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__DataSpec__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getDataSpecAccess().getDataSpecAction_0()); }
(

)
{ after(grammarAccess.getDataSpecAccess().getDataSpecAction_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__DataSpec__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__DataSpec__Group__1__Impl
	rule__DataSpec__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__DataSpec__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getDataSpecAccess().getImportsAssignment_1()); }
(rule__DataSpec__ImportsAssignment_1)*
{ after(grammarAccess.getDataSpecAccess().getImportsAssignment_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__DataSpec__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__DataSpec__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__DataSpec__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getDataSpecAccess().getDataAssignment_2()); }
(rule__DataSpec__DataAssignment_2)
{ after(grammarAccess.getDataSpecAccess().getDataAssignment_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}








rule__ImportURI__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__ImportURI__Group__0__Impl
	rule__ImportURI__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ImportURI__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getImportURIAccess().getExternalKeyword_0()); }

	'external' 

{ after(grammarAccess.getImportURIAccess().getExternalKeyword_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__ImportURI__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__ImportURI__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ImportURI__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getImportURIAccess().getImportURIAssignment_1()); }
(rule__ImportURI__ImportURIAssignment_1)
{ after(grammarAccess.getImportURIAccess().getImportURIAssignment_1()); }
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
{ before(grammarAccess.getImportAccess().getAbstractImportParserRuleCall_1()); }
	ruleAbstractImport
{ after(grammarAccess.getImportAccess().getAbstractImportParserRuleCall_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__Data__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Data__Group__0__Impl
	rule__Data__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Data__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getDataAccess().getDataAction_0()); }
(

)
{ after(grammarAccess.getDataAccess().getDataAction_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Data__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Data__Group__1__Impl
	rule__Data__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Data__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getDataAccess().getDataKeyword_1()); }

	'Data' 

{ after(grammarAccess.getDataAccess().getDataKeyword_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Data__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Data__Group__2__Impl
	rule__Data__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Data__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getDataAccess().getNameAssignment_2()); }
(rule__Data__NameAssignment_2)?
{ after(grammarAccess.getDataAccess().getNameAssignment_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Data__Group__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Data__Group__3__Impl
	rule__Data__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__Data__Group__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getDataAccess().getLeftCurlyBracketKeyword_3()); }

	'{' 

{ after(grammarAccess.getDataAccess().getLeftCurlyBracketKeyword_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Data__Group__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Data__Group__4__Impl
	rule__Data__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__Data__Group__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getDataAccess().getOwned_annotationsAssignment_4()); }
(rule__Data__Owned_annotationsAssignment_4)*
{ after(grammarAccess.getDataAccess().getOwned_annotationsAssignment_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Data__Group__5
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Data__Group__5__Impl
	rule__Data__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__Data__Group__5__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getDataAccess().getUnorderedGroup_5()); }
(rule__Data__UnorderedGroup_5)
{ after(grammarAccess.getDataAccess().getUnorderedGroup_5()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Data__Group__6
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Data__Group__6__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Data__Group__6__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getDataAccess().getRightCurlyBracketKeyword_6()); }

	'}' 

{ after(grammarAccess.getDataAccess().getRightCurlyBracketKeyword_6()); }
)

;
finally {
	restoreStackSize(stackSize);
}
















rule__Data__Group_5_0__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Data__Group_5_0__0__Impl
	rule__Data__Group_5_0__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Data__Group_5_0__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getDataAccess().getDescriptionKeyword_5_0_0()); }

	'description:' 

{ after(grammarAccess.getDataAccess().getDescriptionKeyword_5_0_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Data__Group_5_0__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Data__Group_5_0__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Data__Group_5_0__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getDataAccess().getDescriptionAssignment_5_0_1()); }
(rule__Data__DescriptionAssignment_5_0_1)
{ after(grammarAccess.getDataAccess().getDescriptionAssignment_5_0_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__Class__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Class__Group__0__Impl
	rule__Class__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Class__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getClassAccess().getClassAction_0()); }
(

)
{ after(grammarAccess.getClassAccess().getClassAction_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Class__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Class__Group__1__Impl
	rule__Class__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Class__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getClassAccess().getClassKeyword_1()); }

	'Class' 

{ after(grammarAccess.getClassAccess().getClassKeyword_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Class__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Class__Group__2__Impl
	rule__Class__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Class__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getClassAccess().getNameAssignment_2()); }
(rule__Class__NameAssignment_2)
{ after(grammarAccess.getClassAccess().getNameAssignment_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Class__Group__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Class__Group__3__Impl
	rule__Class__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__Class__Group__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getClassAccess().getLeftCurlyBracketKeyword_3()); }

	'{' 

{ after(grammarAccess.getClassAccess().getLeftCurlyBracketKeyword_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Class__Group__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Class__Group__4__Impl
	rule__Class__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__Class__Group__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getClassAccess().getGroup_4()); }
(rule__Class__Group_4__0)?
{ after(grammarAccess.getClassAccess().getGroup_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Class__Group__5
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Class__Group__5__Impl
	rule__Class__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__Class__Group__5__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getClassAccess().getGroup_5()); }
(rule__Class__Group_5__0)?
{ after(grammarAccess.getClassAccess().getGroup_5()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Class__Group__6
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Class__Group__6__Impl
	rule__Class__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__Class__Group__6__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getClassAccess().getGroup_6()); }
(rule__Class__Group_6__0)?
{ after(grammarAccess.getClassAccess().getGroup_6()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Class__Group__7
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Class__Group__7__Impl
	rule__Class__Group__8
;
finally {
	restoreStackSize(stackSize);
}

rule__Class__Group__7__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getClassAccess().getGroup_7()); }
(rule__Class__Group_7__0)?
{ after(grammarAccess.getClassAccess().getGroup_7()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Class__Group__8
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Class__Group__8__Impl
	rule__Class__Group__9
;
finally {
	restoreStackSize(stackSize);
}

rule__Class__Group__8__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getClassAccess().getGroup_8()); }
(rule__Class__Group_8__0)?
{ after(grammarAccess.getClassAccess().getGroup_8()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Class__Group__9
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Class__Group__9__Impl
	rule__Class__Group__10
;
finally {
	restoreStackSize(stackSize);
}

rule__Class__Group__9__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getClassAccess().getOwned_annotationsAssignment_9()); }
(rule__Class__Owned_annotationsAssignment_9)*
{ after(grammarAccess.getClassAccess().getOwned_annotationsAssignment_9()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Class__Group__10
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Class__Group__10__Impl
	rule__Class__Group__11
;
finally {
	restoreStackSize(stackSize);
}

rule__Class__Group__10__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getClassAccess().getGroup_10()); }
(rule__Class__Group_10__0)?
{ after(grammarAccess.getClassAccess().getGroup_10()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Class__Group__11
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Class__Group__11__Impl
	rule__Class__Group__12
;
finally {
	restoreStackSize(stackSize);
}

rule__Class__Group__11__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getClassAccess().getGroup_11()); }
(rule__Class__Group_11__0)?
{ after(grammarAccess.getClassAccess().getGroup_11()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Class__Group__12
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Class__Group__12__Impl
	rule__Class__Group__13
;
finally {
	restoreStackSize(stackSize);
}

rule__Class__Group__12__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getClassAccess().getGroup_12()); }
(rule__Class__Group_12__0)?
{ after(grammarAccess.getClassAccess().getGroup_12()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Class__Group__13
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Class__Group__13__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Class__Group__13__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getClassAccess().getRightCurlyBracketKeyword_13()); }

	'}' 

{ after(grammarAccess.getClassAccess().getRightCurlyBracketKeyword_13()); }
)

;
finally {
	restoreStackSize(stackSize);
}






























rule__Class__Group_4__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Class__Group_4__0__Impl
	rule__Class__Group_4__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Class__Group_4__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getClassAccess().getDescriptionKeyword_4_0()); }

	'description:' 

{ after(grammarAccess.getClassAccess().getDescriptionKeyword_4_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Class__Group_4__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Class__Group_4__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Class__Group_4__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getClassAccess().getDescriptionAssignment_4_1()); }
(rule__Class__DescriptionAssignment_4_1)
{ after(grammarAccess.getClassAccess().getDescriptionAssignment_4_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__Class__Group_5__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Class__Group_5__0__Impl
	rule__Class__Group_5__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Class__Group_5__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getClassAccess().getIconKeyword_5_0()); }

	'icon:' 

{ after(grammarAccess.getClassAccess().getIconKeyword_5_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Class__Group_5__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Class__Group_5__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Class__Group_5__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getClassAccess().getIconAssignment_5_1()); }
(rule__Class__IconAssignment_5_1)
{ after(grammarAccess.getClassAccess().getIconAssignment_5_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__Class__Group_6__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Class__Group_6__0__Impl
	rule__Class__Group_6__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Class__Group_6__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getClassAccess().getExtendsKeyword_6_0()); }

	'extends' 

{ after(grammarAccess.getClassAccess().getExtendsKeyword_6_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Class__Group_6__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Class__Group_6__1__Impl
	rule__Class__Group_6__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Class__Group_6__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getClassAccess().getExtendsAssignment_6_1()); }
(rule__Class__ExtendsAssignment_6_1)
{ after(grammarAccess.getClassAccess().getExtendsAssignment_6_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Class__Group_6__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Class__Group_6__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Class__Group_6__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getClassAccess().getGroup_6_2()); }
(rule__Class__Group_6_2__0)*
{ after(grammarAccess.getClassAccess().getGroup_6_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}








rule__Class__Group_6_2__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Class__Group_6_2__0__Impl
	rule__Class__Group_6_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Class__Group_6_2__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getClassAccess().getCommaKeyword_6_2_0()); }

	',' 

{ after(grammarAccess.getClassAccess().getCommaKeyword_6_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Class__Group_6_2__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Class__Group_6_2__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Class__Group_6_2__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getClassAccess().getExtendsAssignment_6_2_1()); }
(rule__Class__ExtendsAssignment_6_2_1)
{ after(grammarAccess.getClassAccess().getExtendsAssignment_6_2_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__Class__Group_7__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Class__Group_7__0__Impl
	rule__Class__Group_7__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Class__Group_7__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getClassAccess().getSuperClassKeyword_7_0()); }

	'superClass' 

{ after(grammarAccess.getClassAccess().getSuperClassKeyword_7_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Class__Group_7__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Class__Group_7__1__Impl
	rule__Class__Group_7__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Class__Group_7__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getClassAccess().getInheritencesAssignment_7_1()); }
(rule__Class__InheritencesAssignment_7_1)
{ after(grammarAccess.getClassAccess().getInheritencesAssignment_7_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Class__Group_7__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Class__Group_7__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Class__Group_7__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getClassAccess().getGroup_7_2()); }
(rule__Class__Group_7_2__0)*
{ after(grammarAccess.getClassAccess().getGroup_7_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}








rule__Class__Group_7_2__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Class__Group_7_2__0__Impl
	rule__Class__Group_7_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Class__Group_7_2__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getClassAccess().getCommaKeyword_7_2_0()); }

	',' 

{ after(grammarAccess.getClassAccess().getCommaKeyword_7_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Class__Group_7_2__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Class__Group_7_2__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Class__Group_7_2__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getClassAccess().getInheritencesAssignment_7_2_1()); }
(rule__Class__InheritencesAssignment_7_2_1)
{ after(grammarAccess.getClassAccess().getInheritencesAssignment_7_2_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__Class__Group_8__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Class__Group_8__0__Impl
	rule__Class__Group_8__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Class__Group_8__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getClassAccess().getAbstractKeyword_8_0()); }

	'abstract:' 

{ after(grammarAccess.getClassAccess().getAbstractKeyword_8_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Class__Group_8__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Class__Group_8__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Class__Group_8__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getClassAccess().getAbstractAssignment_8_1()); }
(rule__Class__AbstractAssignment_8_1)
{ after(grammarAccess.getClassAccess().getAbstractAssignment_8_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__Class__Group_10__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Class__Group_10__0__Impl
	rule__Class__Group_10__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Class__Group_10__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getClassAccess().getAttributesKeyword_10_0()); }

	'Attributes:' 

{ after(grammarAccess.getClassAccess().getAttributesKeyword_10_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Class__Group_10__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Class__Group_10__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Class__Group_10__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getClassAccess().getVP_Class_AttributesAssignment_10_1()); }
(rule__Class__VP_Class_AttributesAssignment_10_1)*
{ after(grammarAccess.getClassAccess().getVP_Class_AttributesAssignment_10_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__Class__Group_11__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Class__Group_11__0__Impl
	rule__Class__Group_11__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Class__Group_11__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getClassAccess().getAssociationsKeyword_11_0()); }

	'Associations:' 

{ after(grammarAccess.getClassAccess().getAssociationsKeyword_11_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Class__Group_11__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Class__Group_11__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Class__Group_11__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getClassAccess().getVP_Classes_AssociationsAssignment_11_1()); }
(rule__Class__VP_Classes_AssociationsAssignment_11_1)*
{ after(grammarAccess.getClassAccess().getVP_Classes_AssociationsAssignment_11_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__Class__Group_12__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Class__Group_12__0__Impl
	rule__Class__Group_12__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Class__Group_12__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getClassAccess().getOperationsKeyword_12_0()); }

	'Operations:' 

{ after(grammarAccess.getClassAccess().getOperationsKeyword_12_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Class__Group_12__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Class__Group_12__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Class__Group_12__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getClassAccess().getVP_Class_OperationsAssignment_12_1()); }
(rule__Class__VP_Class_OperationsAssignment_12_1)*
{ after(grammarAccess.getClassAccess().getVP_Class_OperationsAssignment_12_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__Enumeration__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Enumeration__Group__0__Impl
	rule__Enumeration__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Enumeration__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getEnumerationAccess().getEnumerationAction_0()); }
(

)
{ after(grammarAccess.getEnumerationAccess().getEnumerationAction_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Enumeration__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Enumeration__Group__1__Impl
	rule__Enumeration__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Enumeration__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getEnumerationAccess().getEnumerationKeyword_1()); }

	'Enumeration' 

{ after(grammarAccess.getEnumerationAccess().getEnumerationKeyword_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Enumeration__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Enumeration__Group__2__Impl
	rule__Enumeration__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Enumeration__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getEnumerationAccess().getNameAssignment_2()); }
(rule__Enumeration__NameAssignment_2)
{ after(grammarAccess.getEnumerationAccess().getNameAssignment_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Enumeration__Group__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Enumeration__Group__3__Impl
	rule__Enumeration__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__Enumeration__Group__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getEnumerationAccess().getLeftCurlyBracketKeyword_3()); }

	'{' 

{ after(grammarAccess.getEnumerationAccess().getLeftCurlyBracketKeyword_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Enumeration__Group__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Enumeration__Group__4__Impl
	rule__Enumeration__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__Enumeration__Group__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getEnumerationAccess().getOwned_annotationsAssignment_4()); }
(rule__Enumeration__Owned_annotationsAssignment_4)*
{ after(grammarAccess.getEnumerationAccess().getOwned_annotationsAssignment_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Enumeration__Group__5
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Enumeration__Group__5__Impl
	rule__Enumeration__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__Enumeration__Group__5__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getEnumerationAccess().getGroup_5()); }
(rule__Enumeration__Group_5__0)
{ after(grammarAccess.getEnumerationAccess().getGroup_5()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Enumeration__Group__6
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Enumeration__Group__6__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Enumeration__Group__6__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getEnumerationAccess().getRightCurlyBracketKeyword_6()); }

	'}' 

{ after(grammarAccess.getEnumerationAccess().getRightCurlyBracketKeyword_6()); }
)

;
finally {
	restoreStackSize(stackSize);
}
















rule__Enumeration__Group_5__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Enumeration__Group_5__0__Impl
	rule__Enumeration__Group_5__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Enumeration__Group_5__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getEnumerationAccess().getOwnedValuesAssignment_5_0()); }
(rule__Enumeration__OwnedValuesAssignment_5_0)
{ after(grammarAccess.getEnumerationAccess().getOwnedValuesAssignment_5_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Enumeration__Group_5__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Enumeration__Group_5__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Enumeration__Group_5__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getEnumerationAccess().getGroup_5_1()); }
(rule__Enumeration__Group_5_1__0)*
{ after(grammarAccess.getEnumerationAccess().getGroup_5_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__Enumeration__Group_5_1__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Enumeration__Group_5_1__0__Impl
	rule__Enumeration__Group_5_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Enumeration__Group_5_1__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getEnumerationAccess().getCommaKeyword_5_1_0()); }

	',' 

{ after(grammarAccess.getEnumerationAccess().getCommaKeyword_5_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Enumeration__Group_5_1__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Enumeration__Group_5_1__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Enumeration__Group_5_1__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getEnumerationAccess().getOwnedValuesAssignment_5_1_1()); }
(rule__Enumeration__OwnedValuesAssignment_5_1_1)
{ after(grammarAccess.getEnumerationAccess().getOwnedValuesAssignment_5_1_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__LocalSuperClass__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__LocalSuperClass__Group__0__Impl
	rule__LocalSuperClass__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__LocalSuperClass__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getLocalSuperClassAccess().getLocalSuperClassAction_0()); }
(

)
{ after(grammarAccess.getLocalSuperClassAccess().getLocalSuperClassAction_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__LocalSuperClass__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__LocalSuperClass__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__LocalSuperClass__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getLocalSuperClassAccess().getSuperClassAssignment_1()); }
(rule__LocalSuperClass__SuperClassAssignment_1)
{ after(grammarAccess.getLocalSuperClassAccess().getSuperClassAssignment_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__ExternalSuperClass__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__ExternalSuperClass__Group__0__Impl
	rule__ExternalSuperClass__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ExternalSuperClass__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getExternalSuperClassAccess().getExternalSuperClassAction_0()); }
(

)
{ after(grammarAccess.getExternalSuperClassAccess().getExternalSuperClassAction_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__ExternalSuperClass__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__ExternalSuperClass__Group__1__Impl
	rule__ExternalSuperClass__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__ExternalSuperClass__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getExternalSuperClassAccess().getExternalKeyword_1()); }

	'external' 

{ after(grammarAccess.getExternalSuperClassAccess().getExternalKeyword_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__ExternalSuperClass__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__ExternalSuperClass__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ExternalSuperClass__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getExternalSuperClassAccess().getSuperClassAssignment_2()); }
(rule__ExternalSuperClass__SuperClassAssignment_2)
{ after(grammarAccess.getExternalSuperClassAccess().getSuperClassAssignment_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}








rule__LocalClassAssociation__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__LocalClassAssociation__Group__0__Impl
	rule__LocalClassAssociation__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__LocalClassAssociation__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getLocalClassAssociationAccess().getLocalClassAssociationAction_0()); }
(

)
{ after(grammarAccess.getLocalClassAssociationAccess().getLocalClassAssociationAction_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__LocalClassAssociation__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__LocalClassAssociation__Group__1__Impl
	rule__LocalClassAssociation__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__LocalClassAssociation__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getLocalClassAssociationAccess().getNameAssignment_1()); }
(rule__LocalClassAssociation__NameAssignment_1)
{ after(grammarAccess.getLocalClassAssociationAccess().getNameAssignment_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__LocalClassAssociation__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__LocalClassAssociation__Group__2__Impl
	rule__LocalClassAssociation__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__LocalClassAssociation__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getLocalClassAssociationAccess().getGroup_2()); }
(rule__LocalClassAssociation__Group_2__0)?
{ after(grammarAccess.getLocalClassAssociationAccess().getGroup_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__LocalClassAssociation__Group__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__LocalClassAssociation__Group__3__Impl
	rule__LocalClassAssociation__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__LocalClassAssociation__Group__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getLocalClassAssociationAccess().getTypeAssignment_3()); }
(rule__LocalClassAssociation__TypeAssignment_3)
{ after(grammarAccess.getLocalClassAssociationAccess().getTypeAssignment_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__LocalClassAssociation__Group__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__LocalClassAssociation__Group__4__Impl
	rule__LocalClassAssociation__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__LocalClassAssociation__Group__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getLocalClassAssociationAccess().getCardinalityAssignment_4()); }
(rule__LocalClassAssociation__CardinalityAssignment_4)
{ after(grammarAccess.getLocalClassAssociationAccess().getCardinalityAssignment_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__LocalClassAssociation__Group__5
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__LocalClassAssociation__Group__5__Impl
	rule__LocalClassAssociation__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__LocalClassAssociation__Group__5__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getLocalClassAssociationAccess().getLocalTargetAssignment_5()); }
(rule__LocalClassAssociation__LocalTargetAssignment_5)
{ after(grammarAccess.getLocalClassAssociationAccess().getLocalTargetAssignment_5()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__LocalClassAssociation__Group__6
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__LocalClassAssociation__Group__6__Impl
	rule__LocalClassAssociation__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__LocalClassAssociation__Group__6__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getLocalClassAssociationAccess().getUnorderedGroup_6()); }
(rule__LocalClassAssociation__UnorderedGroup_6)
{ after(grammarAccess.getLocalClassAssociationAccess().getUnorderedGroup_6()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__LocalClassAssociation__Group__7
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__LocalClassAssociation__Group__7__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__LocalClassAssociation__Group__7__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getLocalClassAssociationAccess().getOwned_annotationsAssignment_7()); }
(rule__LocalClassAssociation__Owned_annotationsAssignment_7)*
{ after(grammarAccess.getLocalClassAssociationAccess().getOwned_annotationsAssignment_7()); }
)

;
finally {
	restoreStackSize(stackSize);
}


















rule__LocalClassAssociation__Group_2__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__LocalClassAssociation__Group_2__0__Impl
	rule__LocalClassAssociation__Group_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__LocalClassAssociation__Group_2__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getLocalClassAssociationAccess().getDescriptionKeyword_2_0()); }

	'description' 

{ after(grammarAccess.getLocalClassAssociationAccess().getDescriptionKeyword_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__LocalClassAssociation__Group_2__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__LocalClassAssociation__Group_2__1__Impl
	rule__LocalClassAssociation__Group_2__2
;
finally {
	restoreStackSize(stackSize);
}

rule__LocalClassAssociation__Group_2__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getLocalClassAssociationAccess().getDescriptionAssignment_2_1()); }
(rule__LocalClassAssociation__DescriptionAssignment_2_1)
{ after(grammarAccess.getLocalClassAssociationAccess().getDescriptionAssignment_2_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__LocalClassAssociation__Group_2__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__LocalClassAssociation__Group_2__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__LocalClassAssociation__Group_2__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getLocalClassAssociationAccess().getCommaKeyword_2_2()); }

	',' 

{ after(grammarAccess.getLocalClassAssociationAccess().getCommaKeyword_2_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}








rule__LocalClassAssociation__Group_6_0__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__LocalClassAssociation__Group_6_0__0__Impl
	rule__LocalClassAssociation__Group_6_0__1
;
finally {
	restoreStackSize(stackSize);
}

rule__LocalClassAssociation__Group_6_0__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getLocalClassAssociationAccess().getChangeableKeyword_6_0_0()); }

	'changeable:' 

{ after(grammarAccess.getLocalClassAssociationAccess().getChangeableKeyword_6_0_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__LocalClassAssociation__Group_6_0__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__LocalClassAssociation__Group_6_0__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__LocalClassAssociation__Group_6_0__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getLocalClassAssociationAccess().getChangeableAssignment_6_0_1()); }
(rule__LocalClassAssociation__ChangeableAssignment_6_0_1)
{ after(grammarAccess.getLocalClassAssociationAccess().getChangeableAssignment_6_0_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__LocalClassAssociation__Group_6_1__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__LocalClassAssociation__Group_6_1__0__Impl
	rule__LocalClassAssociation__Group_6_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__LocalClassAssociation__Group_6_1__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getLocalClassAssociationAccess().getDerivedKeyword_6_1_0()); }

	'derived:' 

{ after(grammarAccess.getLocalClassAssociationAccess().getDerivedKeyword_6_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__LocalClassAssociation__Group_6_1__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__LocalClassAssociation__Group_6_1__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__LocalClassAssociation__Group_6_1__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getLocalClassAssociationAccess().getDerivedAssignment_6_1_1()); }
(rule__LocalClassAssociation__DerivedAssignment_6_1_1)
{ after(grammarAccess.getLocalClassAssociationAccess().getDerivedAssignment_6_1_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__LocalClassAssociation__Group_6_2__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__LocalClassAssociation__Group_6_2__0__Impl
	rule__LocalClassAssociation__Group_6_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__LocalClassAssociation__Group_6_2__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getLocalClassAssociationAccess().getOrderedKeyword_6_2_0()); }

	'ordered:' 

{ after(grammarAccess.getLocalClassAssociationAccess().getOrderedKeyword_6_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__LocalClassAssociation__Group_6_2__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__LocalClassAssociation__Group_6_2__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__LocalClassAssociation__Group_6_2__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getLocalClassAssociationAccess().getOrderedAssignment_6_2_1()); }
(rule__LocalClassAssociation__OrderedAssignment_6_2_1)
{ after(grammarAccess.getLocalClassAssociationAccess().getOrderedAssignment_6_2_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__LocalClassAssociation__Group_6_3__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__LocalClassAssociation__Group_6_3__0__Impl
	rule__LocalClassAssociation__Group_6_3__1
;
finally {
	restoreStackSize(stackSize);
}

rule__LocalClassAssociation__Group_6_3__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getLocalClassAssociationAccess().getTransientKeyword_6_3_0()); }

	'transient:' 

{ after(grammarAccess.getLocalClassAssociationAccess().getTransientKeyword_6_3_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__LocalClassAssociation__Group_6_3__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__LocalClassAssociation__Group_6_3__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__LocalClassAssociation__Group_6_3__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getLocalClassAssociationAccess().getTransientAssignment_6_3_1()); }
(rule__LocalClassAssociation__TransientAssignment_6_3_1)
{ after(grammarAccess.getLocalClassAssociationAccess().getTransientAssignment_6_3_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__LocalClassAssociation__Group_6_4__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__LocalClassAssociation__Group_6_4__0__Impl
	rule__LocalClassAssociation__Group_6_4__1
;
finally {
	restoreStackSize(stackSize);
}

rule__LocalClassAssociation__Group_6_4__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getLocalClassAssociationAccess().getUniqueKeyword_6_4_0()); }

	'unique:' 

{ after(grammarAccess.getLocalClassAssociationAccess().getUniqueKeyword_6_4_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__LocalClassAssociation__Group_6_4__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__LocalClassAssociation__Group_6_4__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__LocalClassAssociation__Group_6_4__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getLocalClassAssociationAccess().getUniqueAssignment_6_4_1()); }
(rule__LocalClassAssociation__UniqueAssignment_6_4_1)
{ after(grammarAccess.getLocalClassAssociationAccess().getUniqueAssignment_6_4_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__LocalClassAssociation__Group_6_5__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__LocalClassAssociation__Group_6_5__0__Impl
	rule__LocalClassAssociation__Group_6_5__1
;
finally {
	restoreStackSize(stackSize);
}

rule__LocalClassAssociation__Group_6_5__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getLocalClassAssociationAccess().getUnsettableKeyword_6_5_0()); }

	'unsettable:' 

{ after(grammarAccess.getLocalClassAssociationAccess().getUnsettableKeyword_6_5_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__LocalClassAssociation__Group_6_5__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__LocalClassAssociation__Group_6_5__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__LocalClassAssociation__Group_6_5__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getLocalClassAssociationAccess().getUnsettableAssignment_6_5_1()); }
(rule__LocalClassAssociation__UnsettableAssignment_6_5_1)
{ after(grammarAccess.getLocalClassAssociationAccess().getUnsettableAssignment_6_5_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__LocalClassAssociation__Group_6_6__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__LocalClassAssociation__Group_6_6__0__Impl
	rule__LocalClassAssociation__Group_6_6__1
;
finally {
	restoreStackSize(stackSize);
}

rule__LocalClassAssociation__Group_6_6__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getLocalClassAssociationAccess().getVolatileKeyword_6_6_0()); }

	'volatile:' 

{ after(grammarAccess.getLocalClassAssociationAccess().getVolatileKeyword_6_6_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__LocalClassAssociation__Group_6_6__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__LocalClassAssociation__Group_6_6__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__LocalClassAssociation__Group_6_6__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getLocalClassAssociationAccess().getVolatileAssignment_6_6_1()); }
(rule__LocalClassAssociation__VolatileAssignment_6_6_1)
{ after(grammarAccess.getLocalClassAssociationAccess().getVolatileAssignment_6_6_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__ExternalClassAssociation__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__ExternalClassAssociation__Group__0__Impl
	rule__ExternalClassAssociation__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ExternalClassAssociation__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getExternalClassAssociationAccess().getExternalClassAssociationAction_0()); }
(

)
{ after(grammarAccess.getExternalClassAssociationAccess().getExternalClassAssociationAction_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__ExternalClassAssociation__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__ExternalClassAssociation__Group__1__Impl
	rule__ExternalClassAssociation__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__ExternalClassAssociation__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getExternalClassAssociationAccess().getNameAssignment_1()); }
(rule__ExternalClassAssociation__NameAssignment_1)
{ after(grammarAccess.getExternalClassAssociationAccess().getNameAssignment_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__ExternalClassAssociation__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__ExternalClassAssociation__Group__2__Impl
	rule__ExternalClassAssociation__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__ExternalClassAssociation__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getExternalClassAssociationAccess().getGroup_2()); }
(rule__ExternalClassAssociation__Group_2__0)?
{ after(grammarAccess.getExternalClassAssociationAccess().getGroup_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__ExternalClassAssociation__Group__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__ExternalClassAssociation__Group__3__Impl
	rule__ExternalClassAssociation__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__ExternalClassAssociation__Group__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getExternalClassAssociationAccess().getTypeAssignment_3()); }
(rule__ExternalClassAssociation__TypeAssignment_3)
{ after(grammarAccess.getExternalClassAssociationAccess().getTypeAssignment_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__ExternalClassAssociation__Group__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__ExternalClassAssociation__Group__4__Impl
	rule__ExternalClassAssociation__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__ExternalClassAssociation__Group__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getExternalClassAssociationAccess().getCardinalityAssignment_4()); }
(rule__ExternalClassAssociation__CardinalityAssignment_4)
{ after(grammarAccess.getExternalClassAssociationAccess().getCardinalityAssignment_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__ExternalClassAssociation__Group__5
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__ExternalClassAssociation__Group__5__Impl
	rule__ExternalClassAssociation__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__ExternalClassAssociation__Group__5__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getExternalClassAssociationAccess().getExternalKeyword_5()); }

	'external' 

{ after(grammarAccess.getExternalClassAssociationAccess().getExternalKeyword_5()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__ExternalClassAssociation__Group__6
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__ExternalClassAssociation__Group__6__Impl
	rule__ExternalClassAssociation__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__ExternalClassAssociation__Group__6__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getExternalClassAssociationAccess().getExternalTargetAssignment_6()); }
(rule__ExternalClassAssociation__ExternalTargetAssignment_6)
{ after(grammarAccess.getExternalClassAssociationAccess().getExternalTargetAssignment_6()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__ExternalClassAssociation__Group__7
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__ExternalClassAssociation__Group__7__Impl
	rule__ExternalClassAssociation__Group__8
;
finally {
	restoreStackSize(stackSize);
}

rule__ExternalClassAssociation__Group__7__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getExternalClassAssociationAccess().getUnorderedGroup_7()); }
(rule__ExternalClassAssociation__UnorderedGroup_7)
{ after(grammarAccess.getExternalClassAssociationAccess().getUnorderedGroup_7()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__ExternalClassAssociation__Group__8
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__ExternalClassAssociation__Group__8__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ExternalClassAssociation__Group__8__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getExternalClassAssociationAccess().getOwned_annotationsAssignment_8()); }
(rule__ExternalClassAssociation__Owned_annotationsAssignment_8)*
{ after(grammarAccess.getExternalClassAssociationAccess().getOwned_annotationsAssignment_8()); }
)

;
finally {
	restoreStackSize(stackSize);
}




















rule__ExternalClassAssociation__Group_2__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__ExternalClassAssociation__Group_2__0__Impl
	rule__ExternalClassAssociation__Group_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ExternalClassAssociation__Group_2__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getExternalClassAssociationAccess().getDescriptionKeyword_2_0()); }

	'description' 

{ after(grammarAccess.getExternalClassAssociationAccess().getDescriptionKeyword_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__ExternalClassAssociation__Group_2__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__ExternalClassAssociation__Group_2__1__Impl
	rule__ExternalClassAssociation__Group_2__2
;
finally {
	restoreStackSize(stackSize);
}

rule__ExternalClassAssociation__Group_2__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getExternalClassAssociationAccess().getDescriptionAssignment_2_1()); }
(rule__ExternalClassAssociation__DescriptionAssignment_2_1)
{ after(grammarAccess.getExternalClassAssociationAccess().getDescriptionAssignment_2_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__ExternalClassAssociation__Group_2__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__ExternalClassAssociation__Group_2__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ExternalClassAssociation__Group_2__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getExternalClassAssociationAccess().getCommaKeyword_2_2()); }

	',' 

{ after(grammarAccess.getExternalClassAssociationAccess().getCommaKeyword_2_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}








rule__ExternalClassAssociation__Group_7_0__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__ExternalClassAssociation__Group_7_0__0__Impl
	rule__ExternalClassAssociation__Group_7_0__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ExternalClassAssociation__Group_7_0__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getExternalClassAssociationAccess().getChangeableKeyword_7_0_0()); }

	'changeable:' 

{ after(grammarAccess.getExternalClassAssociationAccess().getChangeableKeyword_7_0_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__ExternalClassAssociation__Group_7_0__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__ExternalClassAssociation__Group_7_0__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ExternalClassAssociation__Group_7_0__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getExternalClassAssociationAccess().getChangeableAssignment_7_0_1()); }
(rule__ExternalClassAssociation__ChangeableAssignment_7_0_1)
{ after(grammarAccess.getExternalClassAssociationAccess().getChangeableAssignment_7_0_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__ExternalClassAssociation__Group_7_1__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__ExternalClassAssociation__Group_7_1__0__Impl
	rule__ExternalClassAssociation__Group_7_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ExternalClassAssociation__Group_7_1__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getExternalClassAssociationAccess().getDerivedKeyword_7_1_0()); }

	'derived:' 

{ after(grammarAccess.getExternalClassAssociationAccess().getDerivedKeyword_7_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__ExternalClassAssociation__Group_7_1__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__ExternalClassAssociation__Group_7_1__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ExternalClassAssociation__Group_7_1__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getExternalClassAssociationAccess().getDerivedAssignment_7_1_1()); }
(rule__ExternalClassAssociation__DerivedAssignment_7_1_1)
{ after(grammarAccess.getExternalClassAssociationAccess().getDerivedAssignment_7_1_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__ExternalClassAssociation__Group_7_2__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__ExternalClassAssociation__Group_7_2__0__Impl
	rule__ExternalClassAssociation__Group_7_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ExternalClassAssociation__Group_7_2__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getExternalClassAssociationAccess().getOrderedKeyword_7_2_0()); }

	'ordered:' 

{ after(grammarAccess.getExternalClassAssociationAccess().getOrderedKeyword_7_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__ExternalClassAssociation__Group_7_2__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__ExternalClassAssociation__Group_7_2__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ExternalClassAssociation__Group_7_2__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getExternalClassAssociationAccess().getOrderedAssignment_7_2_1()); }
(rule__ExternalClassAssociation__OrderedAssignment_7_2_1)
{ after(grammarAccess.getExternalClassAssociationAccess().getOrderedAssignment_7_2_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__ExternalClassAssociation__Group_7_3__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__ExternalClassAssociation__Group_7_3__0__Impl
	rule__ExternalClassAssociation__Group_7_3__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ExternalClassAssociation__Group_7_3__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getExternalClassAssociationAccess().getTransientKeyword_7_3_0()); }

	'transient:' 

{ after(grammarAccess.getExternalClassAssociationAccess().getTransientKeyword_7_3_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__ExternalClassAssociation__Group_7_3__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__ExternalClassAssociation__Group_7_3__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ExternalClassAssociation__Group_7_3__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getExternalClassAssociationAccess().getTransientAssignment_7_3_1()); }
(rule__ExternalClassAssociation__TransientAssignment_7_3_1)
{ after(grammarAccess.getExternalClassAssociationAccess().getTransientAssignment_7_3_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__ExternalClassAssociation__Group_7_4__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__ExternalClassAssociation__Group_7_4__0__Impl
	rule__ExternalClassAssociation__Group_7_4__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ExternalClassAssociation__Group_7_4__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getExternalClassAssociationAccess().getUniqueKeyword_7_4_0()); }

	'unique:' 

{ after(grammarAccess.getExternalClassAssociationAccess().getUniqueKeyword_7_4_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__ExternalClassAssociation__Group_7_4__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__ExternalClassAssociation__Group_7_4__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ExternalClassAssociation__Group_7_4__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getExternalClassAssociationAccess().getUniqueAssignment_7_4_1()); }
(rule__ExternalClassAssociation__UniqueAssignment_7_4_1)
{ after(grammarAccess.getExternalClassAssociationAccess().getUniqueAssignment_7_4_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__ExternalClassAssociation__Group_7_5__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__ExternalClassAssociation__Group_7_5__0__Impl
	rule__ExternalClassAssociation__Group_7_5__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ExternalClassAssociation__Group_7_5__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getExternalClassAssociationAccess().getUnsettableKeyword_7_5_0()); }

	'unsettable:' 

{ after(grammarAccess.getExternalClassAssociationAccess().getUnsettableKeyword_7_5_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__ExternalClassAssociation__Group_7_5__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__ExternalClassAssociation__Group_7_5__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ExternalClassAssociation__Group_7_5__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getExternalClassAssociationAccess().getUnsettableAssignment_7_5_1()); }
(rule__ExternalClassAssociation__UnsettableAssignment_7_5_1)
{ after(grammarAccess.getExternalClassAssociationAccess().getUnsettableAssignment_7_5_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__ExternalClassAssociation__Group_7_6__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__ExternalClassAssociation__Group_7_6__0__Impl
	rule__ExternalClassAssociation__Group_7_6__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ExternalClassAssociation__Group_7_6__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getExternalClassAssociationAccess().getVolatileKeyword_7_6_0()); }

	'volatile:' 

{ after(grammarAccess.getExternalClassAssociationAccess().getVolatileKeyword_7_6_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__ExternalClassAssociation__Group_7_6__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__ExternalClassAssociation__Group_7_6__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ExternalClassAssociation__Group_7_6__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getExternalClassAssociationAccess().getVolatileAssignment_7_6_1()); }
(rule__ExternalClassAssociation__VolatileAssignment_7_6_1)
{ after(grammarAccess.getExternalClassAssociationAccess().getVolatileAssignment_7_6_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__LocalAttributeType__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__LocalAttributeType__Group__0__Impl
	rule__LocalAttributeType__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__LocalAttributeType__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getLocalAttributeTypeAccess().getLocalAttributeTypeAction_0()); }
(

)
{ after(grammarAccess.getLocalAttributeTypeAccess().getLocalAttributeTypeAction_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__LocalAttributeType__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__LocalAttributeType__Group__1__Impl
	rule__LocalAttributeType__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__LocalAttributeType__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getLocalAttributeTypeAccess().getEnumKeyword_1()); }

	'enum' 

{ after(grammarAccess.getLocalAttributeTypeAccess().getEnumKeyword_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__LocalAttributeType__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__LocalAttributeType__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__LocalAttributeType__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getLocalAttributeTypeAccess().getTypeAssignment_2()); }
(rule__LocalAttributeType__TypeAssignment_2)
{ after(grammarAccess.getLocalAttributeTypeAccess().getTypeAssignment_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}








rule__ExternalAttributeType__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__ExternalAttributeType__Group__0__Impl
	rule__ExternalAttributeType__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ExternalAttributeType__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getExternalAttributeTypeAccess().getExternalAttributeTypeAction_0()); }
(

)
{ after(grammarAccess.getExternalAttributeTypeAccess().getExternalAttributeTypeAction_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__ExternalAttributeType__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__ExternalAttributeType__Group__1__Impl
	rule__ExternalAttributeType__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__ExternalAttributeType__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getExternalAttributeTypeAccess().getTypeKeyword_1()); }

	'type' 

{ after(grammarAccess.getExternalAttributeTypeAccess().getTypeKeyword_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__ExternalAttributeType__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__ExternalAttributeType__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ExternalAttributeType__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getExternalAttributeTypeAccess().getTypeAssignment_2()); }
(rule__ExternalAttributeType__TypeAssignment_2)
{ after(grammarAccess.getExternalAttributeTypeAccess().getTypeAssignment_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}








rule__Attribute__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Attribute__Group__0__Impl
	rule__Attribute__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Attribute__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getAttributeAccess().getAttributeAction_0()); }
(

)
{ after(grammarAccess.getAttributeAccess().getAttributeAction_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Attribute__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Attribute__Group__1__Impl
	rule__Attribute__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Attribute__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getAttributeAccess().getNameAssignment_1()); }
(rule__Attribute__NameAssignment_1)
{ after(grammarAccess.getAttributeAccess().getNameAssignment_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Attribute__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Attribute__Group__2__Impl
	rule__Attribute__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Attribute__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getAttributeAccess().getGroup_2()); }
(rule__Attribute__Group_2__0)?
{ after(grammarAccess.getAttributeAccess().getGroup_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Attribute__Group__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Attribute__Group__3__Impl
	rule__Attribute__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__Attribute__Group__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getAttributeAccess().getOwned_typeAssignment_3()); }
(rule__Attribute__Owned_typeAssignment_3)
{ after(grammarAccess.getAttributeAccess().getOwned_typeAssignment_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Attribute__Group__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Attribute__Group__4__Impl
	rule__Attribute__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__Attribute__Group__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getAttributeAccess().getCardinalityAssignment_4()); }
(rule__Attribute__CardinalityAssignment_4)?
{ after(grammarAccess.getAttributeAccess().getCardinalityAssignment_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Attribute__Group__5
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Attribute__Group__5__Impl
	rule__Attribute__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__Attribute__Group__5__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getAttributeAccess().getUnorderedGroup_5()); }
(rule__Attribute__UnorderedGroup_5)
{ after(grammarAccess.getAttributeAccess().getUnorderedGroup_5()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Attribute__Group__6
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Attribute__Group__6__Impl
	rule__Attribute__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__Attribute__Group__6__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getAttributeAccess().getGroup_6()); }
(rule__Attribute__Group_6__0)?
{ after(grammarAccess.getAttributeAccess().getGroup_6()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Attribute__Group__7
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Attribute__Group__7__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Attribute__Group__7__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getAttributeAccess().getOwned_annotationsAssignment_7()); }
(rule__Attribute__Owned_annotationsAssignment_7)*
{ after(grammarAccess.getAttributeAccess().getOwned_annotationsAssignment_7()); }
)

;
finally {
	restoreStackSize(stackSize);
}


















rule__Attribute__Group_2__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Attribute__Group_2__0__Impl
	rule__Attribute__Group_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Attribute__Group_2__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getAttributeAccess().getDescriptionKeyword_2_0()); }

	'description' 

{ after(grammarAccess.getAttributeAccess().getDescriptionKeyword_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Attribute__Group_2__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Attribute__Group_2__1__Impl
	rule__Attribute__Group_2__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Attribute__Group_2__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getAttributeAccess().getDescriptionAssignment_2_1()); }
(rule__Attribute__DescriptionAssignment_2_1)
{ after(grammarAccess.getAttributeAccess().getDescriptionAssignment_2_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Attribute__Group_2__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Attribute__Group_2__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Attribute__Group_2__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getAttributeAccess().getCommaKeyword_2_2()); }

	',' 

{ after(grammarAccess.getAttributeAccess().getCommaKeyword_2_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}








rule__Attribute__Group_5_0__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Attribute__Group_5_0__0__Impl
	rule__Attribute__Group_5_0__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Attribute__Group_5_0__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getAttributeAccess().getIdKeyword_5_0_0()); }

	'id:' 

{ after(grammarAccess.getAttributeAccess().getIdKeyword_5_0_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Attribute__Group_5_0__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Attribute__Group_5_0__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Attribute__Group_5_0__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getAttributeAccess().getIsIdAssignment_5_0_1()); }
(rule__Attribute__IsIdAssignment_5_0_1)
{ after(grammarAccess.getAttributeAccess().getIsIdAssignment_5_0_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__Attribute__Group_5_1__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Attribute__Group_5_1__0__Impl
	rule__Attribute__Group_5_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Attribute__Group_5_1__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getAttributeAccess().getChangeableKeyword_5_1_0()); }

	'changeable:' 

{ after(grammarAccess.getAttributeAccess().getChangeableKeyword_5_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Attribute__Group_5_1__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Attribute__Group_5_1__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Attribute__Group_5_1__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getAttributeAccess().getChangeableAssignment_5_1_1()); }
(rule__Attribute__ChangeableAssignment_5_1_1)
{ after(grammarAccess.getAttributeAccess().getChangeableAssignment_5_1_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__Attribute__Group_5_2__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Attribute__Group_5_2__0__Impl
	rule__Attribute__Group_5_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Attribute__Group_5_2__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getAttributeAccess().getDerivedKeyword_5_2_0()); }

	'derived:' 

{ after(grammarAccess.getAttributeAccess().getDerivedKeyword_5_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Attribute__Group_5_2__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Attribute__Group_5_2__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Attribute__Group_5_2__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getAttributeAccess().getDerivedAssignment_5_2_1()); }
(rule__Attribute__DerivedAssignment_5_2_1)
{ after(grammarAccess.getAttributeAccess().getDerivedAssignment_5_2_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__Attribute__Group_5_3__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Attribute__Group_5_3__0__Impl
	rule__Attribute__Group_5_3__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Attribute__Group_5_3__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getAttributeAccess().getOrderedKeyword_5_3_0()); }

	'ordered:' 

{ after(grammarAccess.getAttributeAccess().getOrderedKeyword_5_3_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Attribute__Group_5_3__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Attribute__Group_5_3__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Attribute__Group_5_3__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getAttributeAccess().getOrderedAssignment_5_3_1()); }
(rule__Attribute__OrderedAssignment_5_3_1)
{ after(grammarAccess.getAttributeAccess().getOrderedAssignment_5_3_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__Attribute__Group_5_4__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Attribute__Group_5_4__0__Impl
	rule__Attribute__Group_5_4__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Attribute__Group_5_4__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getAttributeAccess().getTransientKeyword_5_4_0()); }

	'transient:' 

{ after(grammarAccess.getAttributeAccess().getTransientKeyword_5_4_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Attribute__Group_5_4__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Attribute__Group_5_4__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Attribute__Group_5_4__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getAttributeAccess().getTransientAssignment_5_4_1()); }
(rule__Attribute__TransientAssignment_5_4_1)
{ after(grammarAccess.getAttributeAccess().getTransientAssignment_5_4_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__Attribute__Group_5_5__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Attribute__Group_5_5__0__Impl
	rule__Attribute__Group_5_5__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Attribute__Group_5_5__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getAttributeAccess().getUniqueKeyword_5_5_0()); }

	'unique:' 

{ after(grammarAccess.getAttributeAccess().getUniqueKeyword_5_5_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Attribute__Group_5_5__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Attribute__Group_5_5__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Attribute__Group_5_5__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getAttributeAccess().getUniqueAssignment_5_5_1()); }
(rule__Attribute__UniqueAssignment_5_5_1)
{ after(grammarAccess.getAttributeAccess().getUniqueAssignment_5_5_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__Attribute__Group_5_6__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Attribute__Group_5_6__0__Impl
	rule__Attribute__Group_5_6__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Attribute__Group_5_6__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getAttributeAccess().getUnsettableKeyword_5_6_0()); }

	'unsettable:' 

{ after(grammarAccess.getAttributeAccess().getUnsettableKeyword_5_6_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Attribute__Group_5_6__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Attribute__Group_5_6__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Attribute__Group_5_6__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getAttributeAccess().getUnsettableAssignment_5_6_1()); }
(rule__Attribute__UnsettableAssignment_5_6_1)
{ after(grammarAccess.getAttributeAccess().getUnsettableAssignment_5_6_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__Attribute__Group_5_7__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Attribute__Group_5_7__0__Impl
	rule__Attribute__Group_5_7__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Attribute__Group_5_7__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getAttributeAccess().getVolatileKeyword_5_7_0()); }

	'volatile:' 

{ after(grammarAccess.getAttributeAccess().getVolatileKeyword_5_7_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Attribute__Group_5_7__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Attribute__Group_5_7__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Attribute__Group_5_7__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getAttributeAccess().getVolatileAssignment_5_7_1()); }
(rule__Attribute__VolatileAssignment_5_7_1)
{ after(grammarAccess.getAttributeAccess().getVolatileAssignment_5_7_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__Attribute__Group_6__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Attribute__Group_6__0__Impl
	rule__Attribute__Group_6__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Attribute__Group_6__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getAttributeAccess().getValuesKeyword_6_0()); }

	'values' 

{ after(grammarAccess.getAttributeAccess().getValuesKeyword_6_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Attribute__Group_6__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Attribute__Group_6__1__Impl
	rule__Attribute__Group_6__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Attribute__Group_6__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getAttributeAccess().getLeftParenthesisKeyword_6_1()); }

	'(' 

{ after(grammarAccess.getAttributeAccess().getLeftParenthesisKeyword_6_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Attribute__Group_6__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Attribute__Group_6__2__Impl
	rule__Attribute__Group_6__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Attribute__Group_6__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getAttributeAccess().getGroup_6_2()); }
(rule__Attribute__Group_6_2__0)?
{ after(grammarAccess.getAttributeAccess().getGroup_6_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Attribute__Group_6__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Attribute__Group_6__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Attribute__Group_6__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getAttributeAccess().getRightParenthesisKeyword_6_3()); }

	')' 

{ after(grammarAccess.getAttributeAccess().getRightParenthesisKeyword_6_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}










rule__Attribute__Group_6_2__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Attribute__Group_6_2__0__Impl
	rule__Attribute__Group_6_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Attribute__Group_6_2__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getAttributeAccess().getOwned_valuesAssignment_6_2_0()); }
(rule__Attribute__Owned_valuesAssignment_6_2_0)
{ after(grammarAccess.getAttributeAccess().getOwned_valuesAssignment_6_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Attribute__Group_6_2__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Attribute__Group_6_2__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Attribute__Group_6_2__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getAttributeAccess().getGroup_6_2_1()); }
(rule__Attribute__Group_6_2_1__0)*
{ after(grammarAccess.getAttributeAccess().getGroup_6_2_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__Attribute__Group_6_2_1__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Attribute__Group_6_2_1__0__Impl
	rule__Attribute__Group_6_2_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Attribute__Group_6_2_1__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getAttributeAccess().getCommaKeyword_6_2_1_0()); }

	',' 

{ after(grammarAccess.getAttributeAccess().getCommaKeyword_6_2_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Attribute__Group_6_2_1__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Attribute__Group_6_2_1__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Attribute__Group_6_2_1__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getAttributeAccess().getOwned_valuesAssignment_6_2_1_1()); }
(rule__Attribute__Owned_valuesAssignment_6_2_1_1)
{ after(grammarAccess.getAttributeAccess().getOwned_valuesAssignment_6_2_1_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__Value__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Value__Group__0__Impl
	rule__Value__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Value__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getValueAccess().getValueAction_0()); }
(

)
{ after(grammarAccess.getValueAccess().getValueAction_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Value__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Value__Group__1__Impl
	rule__Value__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Value__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getValueAccess().getGroup_1()); }
(rule__Value__Group_1__0)?
{ after(grammarAccess.getValueAccess().getGroup_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Value__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Value__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Value__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getValueAccess().getLiteralAssignment_2()); }
(rule__Value__LiteralAssignment_2)
{ after(grammarAccess.getValueAccess().getLiteralAssignment_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}








rule__Value__Group_1__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Value__Group_1__0__Impl
	rule__Value__Group_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Value__Group_1__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getValueAccess().getNameAssignment_1_0()); }
(rule__Value__NameAssignment_1_0)
{ after(grammarAccess.getValueAccess().getNameAssignment_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Value__Group_1__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Value__Group_1__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Value__Group_1__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getValueAccess().getLiteralKeyword_1_1()); }

	'literal' 

{ after(grammarAccess.getValueAccess().getLiteralKeyword_1_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__Operation__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Operation__Group__0__Impl
	rule__Operation__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Operation__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getOperationAccess().getOperationAction_0()); }
(

)
{ after(grammarAccess.getOperationAccess().getOperationAction_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Operation__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Operation__Group__1__Impl
	rule__Operation__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Operation__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getOperationAccess().getNameAssignment_1()); }
(rule__Operation__NameAssignment_1)
{ after(grammarAccess.getOperationAccess().getNameAssignment_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Operation__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Operation__Group__2__Impl
	rule__Operation__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Operation__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getOperationAccess().getLeftParenthesisKeyword_2()); }

	'(' 

{ after(grammarAccess.getOperationAccess().getLeftParenthesisKeyword_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Operation__Group__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Operation__Group__3__Impl
	rule__Operation__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__Operation__Group__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getOperationAccess().getGroup_3()); }
(rule__Operation__Group_3__0)?
{ after(grammarAccess.getOperationAccess().getGroup_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Operation__Group__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Operation__Group__4__Impl
	rule__Operation__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__Operation__Group__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getOperationAccess().getRightParenthesisKeyword_4()); }

	')' 

{ after(grammarAccess.getOperationAccess().getRightParenthesisKeyword_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Operation__Group__5
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Operation__Group__5__Impl
	rule__Operation__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__Operation__Group__5__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getOperationAccess().getGroup_5()); }
(rule__Operation__Group_5__0)?
{ after(grammarAccess.getOperationAccess().getGroup_5()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Operation__Group__6
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Operation__Group__6__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Operation__Group__6__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getOperationAccess().getOwned_annotationsAssignment_6()); }
(rule__Operation__Owned_annotationsAssignment_6)*
{ after(grammarAccess.getOperationAccess().getOwned_annotationsAssignment_6()); }
)

;
finally {
	restoreStackSize(stackSize);
}
















rule__Operation__Group_3__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Operation__Group_3__0__Impl
	rule__Operation__Group_3__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Operation__Group_3__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getOperationAccess().getParametersAssignment_3_0()); }
(rule__Operation__ParametersAssignment_3_0)
{ after(grammarAccess.getOperationAccess().getParametersAssignment_3_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Operation__Group_3__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Operation__Group_3__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Operation__Group_3__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getOperationAccess().getGroup_3_1()); }
(rule__Operation__Group_3_1__0)*
{ after(grammarAccess.getOperationAccess().getGroup_3_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__Operation__Group_3_1__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Operation__Group_3_1__0__Impl
	rule__Operation__Group_3_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Operation__Group_3_1__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getOperationAccess().getCommaKeyword_3_1_0()); }

	',' 

{ after(grammarAccess.getOperationAccess().getCommaKeyword_3_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Operation__Group_3_1__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Operation__Group_3_1__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Operation__Group_3_1__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getOperationAccess().getParametersAssignment_3_1_1()); }
(rule__Operation__ParametersAssignment_3_1_1)
{ after(grammarAccess.getOperationAccess().getParametersAssignment_3_1_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__Operation__Group_5__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Operation__Group_5__0__Impl
	rule__Operation__Group_5__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Operation__Group_5__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getOperationAccess().getReturnsKeyword_5_0()); }

	'returns' 

{ after(grammarAccess.getOperationAccess().getReturnsKeyword_5_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Operation__Group_5__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Operation__Group_5__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Operation__Group_5__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getOperationAccess().getOperation_typeAssignment_5_1()); }
(rule__Operation__Operation_typeAssignment_5_1)
{ after(grammarAccess.getOperationAccess().getOperation_typeAssignment_5_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__Parameter__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Parameter__Group__0__Impl
	rule__Parameter__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Parameter__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getParameterAccess().getParameterAction_0()); }
(

)
{ after(grammarAccess.getParameterAccess().getParameterAction_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Parameter__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Parameter__Group__1__Impl
	rule__Parameter__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Parameter__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getParameterAccess().getParameter_typeAssignment_1()); }
(rule__Parameter__Parameter_typeAssignment_1)
{ after(grammarAccess.getParameterAccess().getParameter_typeAssignment_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Parameter__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Parameter__Group__2__Impl
	rule__Parameter__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Parameter__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getParameterAccess().getNameAssignment_2()); }
(rule__Parameter__NameAssignment_2)
{ after(grammarAccess.getParameterAccess().getNameAssignment_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Parameter__Group__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Parameter__Group__3__Impl
	rule__Parameter__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__Parameter__Group__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getParameterAccess().getDescriptionAssignment_3()); }
(rule__Parameter__DescriptionAssignment_3)?
{ after(grammarAccess.getParameterAccess().getDescriptionAssignment_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Parameter__Group__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Parameter__Group__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Parameter__Group__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getParameterAccess().getOwned_annotationsAssignment_4()); }
(rule__Parameter__Owned_annotationsAssignment_4)*
{ after(grammarAccess.getParameterAccess().getOwned_annotationsAssignment_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}












rule__ExternalType__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__ExternalType__Group__0__Impl
	rule__ExternalType__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ExternalType__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getExternalTypeAccess().getExternalTypeAction_0()); }
(

)
{ after(grammarAccess.getExternalTypeAccess().getExternalTypeAction_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__ExternalType__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__ExternalType__Group__1__Impl
	rule__ExternalType__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__ExternalType__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getExternalTypeAccess().getExternalKeyword_1()); }

	'external' 

{ after(grammarAccess.getExternalTypeAccess().getExternalKeyword_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__ExternalType__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__ExternalType__Group__2__Impl
	rule__ExternalType__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__ExternalType__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getExternalTypeAccess().getTypeAssignment_2()); }
(rule__ExternalType__TypeAssignment_2)
{ after(grammarAccess.getExternalTypeAccess().getTypeAssignment_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__ExternalType__Group__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__ExternalType__Group__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ExternalType__Group__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getExternalTypeAccess().getCardinalityAssignment_3()); }
(rule__ExternalType__CardinalityAssignment_3)
{ after(grammarAccess.getExternalTypeAccess().getCardinalityAssignment_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}










rule__LocalType__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__LocalType__Group__0__Impl
	rule__LocalType__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__LocalType__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getLocalTypeAccess().getLocalTypeAction_0()); }
(

)
{ after(grammarAccess.getLocalTypeAccess().getLocalTypeAction_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__LocalType__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__LocalType__Group__1__Impl
	rule__LocalType__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__LocalType__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getLocalTypeAccess().getTypeAssignment_1()); }
(rule__LocalType__TypeAssignment_1)
{ after(grammarAccess.getLocalTypeAccess().getTypeAssignment_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__LocalType__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__LocalType__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__LocalType__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getLocalTypeAccess().getCardinalityAssignment_2()); }
(rule__LocalType__CardinalityAssignment_2)
{ after(grammarAccess.getLocalTypeAccess().getCardinalityAssignment_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}









rule__Annotation__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Annotation__Group__0__Impl
	rule__Annotation__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Annotation__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getAnnotationAccess().getAnnotationAction_0()); }
(

)
{ after(grammarAccess.getAnnotationAccess().getAnnotationAction_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Annotation__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Annotation__Group__1__Impl
	rule__Annotation__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Annotation__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getAnnotationAccess().getAnnotationKeyword_1()); }

	'Annotation' 

{ after(grammarAccess.getAnnotationAccess().getAnnotationKeyword_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Annotation__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Annotation__Group__2__Impl
	rule__Annotation__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Annotation__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getAnnotationAccess().getSourceAssignment_2()); }
(rule__Annotation__SourceAssignment_2)
{ after(grammarAccess.getAnnotationAccess().getSourceAssignment_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Annotation__Group__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Annotation__Group__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Annotation__Group__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getAnnotationAccess().getGroup_3()); }
(rule__Annotation__Group_3__0)?
{ after(grammarAccess.getAnnotationAccess().getGroup_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}










rule__Annotation__Group_3__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Annotation__Group_3__0__Impl
	rule__Annotation__Group_3__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Annotation__Group_3__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getAnnotationAccess().getLeftCurlyBracketKeyword_3_0()); }

	'{' 

{ after(grammarAccess.getAnnotationAccess().getLeftCurlyBracketKeyword_3_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Annotation__Group_3__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Annotation__Group_3__1__Impl
	rule__Annotation__Group_3__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Annotation__Group_3__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
(
{ before(grammarAccess.getAnnotationAccess().getOwned_detailsAssignment_3_1()); }
(rule__Annotation__Owned_detailsAssignment_3_1)
{ after(grammarAccess.getAnnotationAccess().getOwned_detailsAssignment_3_1()); }
)
(
{ before(grammarAccess.getAnnotationAccess().getOwned_detailsAssignment_3_1()); }
(rule__Annotation__Owned_detailsAssignment_3_1)*
{ after(grammarAccess.getAnnotationAccess().getOwned_detailsAssignment_3_1()); }
)
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Annotation__Group_3__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Annotation__Group_3__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Annotation__Group_3__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getAnnotationAccess().getRightCurlyBracketKeyword_3_2()); }

	'}' 

{ after(grammarAccess.getAnnotationAccess().getRightCurlyBracketKeyword_3_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}








rule__Detail__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Detail__Group__0__Impl
	rule__Detail__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Detail__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getDetailAccess().getDetailAction_0()); }
(

)
{ after(grammarAccess.getDetailAccess().getDetailAction_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Detail__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Detail__Group__1__Impl
	rule__Detail__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Detail__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getDetailAccess().getKeyKeyword_1()); }

	'key:' 

{ after(grammarAccess.getDetailAccess().getKeyKeyword_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Detail__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Detail__Group__2__Impl
	rule__Detail__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Detail__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getDetailAccess().getKeyAssignment_2()); }
(rule__Detail__KeyAssignment_2)
{ after(grammarAccess.getDetailAccess().getKeyAssignment_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Detail__Group__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Detail__Group__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Detail__Group__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getDetailAccess().getGroup_3()); }
(rule__Detail__Group_3__0)?
{ after(grammarAccess.getDetailAccess().getGroup_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}










rule__Detail__Group_3__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Detail__Group_3__0__Impl
	rule__Detail__Group_3__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Detail__Group_3__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getDetailAccess().getValueKeyword_3_0()); }

	'value:' 

{ after(grammarAccess.getDetailAccess().getValueKeyword_3_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Detail__Group_3__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Detail__Group_3__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Detail__Group_3__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getDetailAccess().getValueAssignment_3_1()); }
(rule__Detail__ValueAssignment_3_1)
{ after(grammarAccess.getDetailAccess().getValueAssignment_3_1()); }
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







rule__Data__UnorderedGroup_5
    @init {
    	int stackSize = keepStackSize();
		getUnorderedGroupHelper().enter(grammarAccess.getDataAccess().getUnorderedGroup_5());
    }
:
	rule__Data__UnorderedGroup_5__0
	?
	
;
finally {
	getUnorderedGroupHelper().leave(grammarAccess.getDataAccess().getUnorderedGroup_5());
	restoreStackSize(stackSize);
}


rule__Data__UnorderedGroup_5__Impl
	@init {
		int stackSize = keepStackSize();
		boolean selected = false;
    }
:
		(

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getDataAccess().getUnorderedGroup_5(), 0)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getDataAccess().getUnorderedGroup_5(), 0);
	 				}
	 				{
	 				  selected = true;
	 				}
					(
					
						{ before(grammarAccess.getDataAccess().getGroup_5_0()); }
						(rule__Data__Group_5_0__0)
						{ after(grammarAccess.getDataAccess().getGroup_5_0()); }
					)
 				)
			)  |

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getDataAccess().getUnorderedGroup_5(), 1)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getDataAccess().getUnorderedGroup_5(), 1);
	 				}
	 				{
	 				  selected = true;
	 				}
					(
					(
						{ before(grammarAccess.getDataAccess().getVP_ClassesAssignment_5_1()); }
						(rule__Data__VP_ClassesAssignment_5_1)
						{ after(grammarAccess.getDataAccess().getVP_ClassesAssignment_5_1()); }
					)
					(
						{ before(grammarAccess.getDataAccess().getVP_ClassesAssignment_5_1()); }
						((rule__Data__VP_ClassesAssignment_5_1)=>rule__Data__VP_ClassesAssignment_5_1)*
						{ after(grammarAccess.getDataAccess().getVP_ClassesAssignment_5_1()); }
					)					)
 				)
			)  |

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getDataAccess().getUnorderedGroup_5(), 2)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getDataAccess().getUnorderedGroup_5(), 2);
	 				}
	 				{
	 				  selected = true;
	 				}
					(
					(
						{ before(grammarAccess.getDataAccess().getVP_EnumerationsAssignment_5_2()); }
						(rule__Data__VP_EnumerationsAssignment_5_2)
						{ after(grammarAccess.getDataAccess().getVP_EnumerationsAssignment_5_2()); }
					)
					(
						{ before(grammarAccess.getDataAccess().getVP_EnumerationsAssignment_5_2()); }
						((rule__Data__VP_EnumerationsAssignment_5_2)=>rule__Data__VP_EnumerationsAssignment_5_2)*
						{ after(grammarAccess.getDataAccess().getVP_EnumerationsAssignment_5_2()); }
					)					)
 				)
			)  

		)
;
finally {
	if (selected)
		getUnorderedGroupHelper().returnFromSelection(grammarAccess.getDataAccess().getUnorderedGroup_5());
	restoreStackSize(stackSize);
}


rule__Data__UnorderedGroup_5__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Data__UnorderedGroup_5__Impl
	rule__Data__UnorderedGroup_5__1?
;
finally {
	restoreStackSize(stackSize);
}


rule__Data__UnorderedGroup_5__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Data__UnorderedGroup_5__Impl
	rule__Data__UnorderedGroup_5__2?
;
finally {
	restoreStackSize(stackSize);
}


rule__Data__UnorderedGroup_5__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Data__UnorderedGroup_5__Impl
;
finally {
	restoreStackSize(stackSize);
}








rule__LocalClassAssociation__UnorderedGroup_6
    @init {
    	int stackSize = keepStackSize();
		getUnorderedGroupHelper().enter(grammarAccess.getLocalClassAssociationAccess().getUnorderedGroup_6());
    }
:
	rule__LocalClassAssociation__UnorderedGroup_6__0
	?
	
;
finally {
	getUnorderedGroupHelper().leave(grammarAccess.getLocalClassAssociationAccess().getUnorderedGroup_6());
	restoreStackSize(stackSize);
}


rule__LocalClassAssociation__UnorderedGroup_6__Impl
	@init {
		int stackSize = keepStackSize();
		boolean selected = false;
    }
:
		(

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getLocalClassAssociationAccess().getUnorderedGroup_6(), 0)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getLocalClassAssociationAccess().getUnorderedGroup_6(), 0);
	 				}
	 				{
	 				  selected = true;
	 				}
					(
					
						{ before(grammarAccess.getLocalClassAssociationAccess().getGroup_6_0()); }
						(rule__LocalClassAssociation__Group_6_0__0)
						{ after(grammarAccess.getLocalClassAssociationAccess().getGroup_6_0()); }
					)
 				)
			)  |

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getLocalClassAssociationAccess().getUnorderedGroup_6(), 1)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getLocalClassAssociationAccess().getUnorderedGroup_6(), 1);
	 				}
	 				{
	 				  selected = true;
	 				}
					(
					
						{ before(grammarAccess.getLocalClassAssociationAccess().getGroup_6_1()); }
						(rule__LocalClassAssociation__Group_6_1__0)
						{ after(grammarAccess.getLocalClassAssociationAccess().getGroup_6_1()); }
					)
 				)
			)  |

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getLocalClassAssociationAccess().getUnorderedGroup_6(), 2)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getLocalClassAssociationAccess().getUnorderedGroup_6(), 2);
	 				}
	 				{
	 				  selected = true;
	 				}
					(
					
						{ before(grammarAccess.getLocalClassAssociationAccess().getGroup_6_2()); }
						(rule__LocalClassAssociation__Group_6_2__0)
						{ after(grammarAccess.getLocalClassAssociationAccess().getGroup_6_2()); }
					)
 				)
			)  |

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getLocalClassAssociationAccess().getUnorderedGroup_6(), 3)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getLocalClassAssociationAccess().getUnorderedGroup_6(), 3);
	 				}
	 				{
	 				  selected = true;
	 				}
					(
					
						{ before(grammarAccess.getLocalClassAssociationAccess().getGroup_6_3()); }
						(rule__LocalClassAssociation__Group_6_3__0)
						{ after(grammarAccess.getLocalClassAssociationAccess().getGroup_6_3()); }
					)
 				)
			)  |

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getLocalClassAssociationAccess().getUnorderedGroup_6(), 4)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getLocalClassAssociationAccess().getUnorderedGroup_6(), 4);
	 				}
	 				{
	 				  selected = true;
	 				}
					(
					
						{ before(grammarAccess.getLocalClassAssociationAccess().getGroup_6_4()); }
						(rule__LocalClassAssociation__Group_6_4__0)
						{ after(grammarAccess.getLocalClassAssociationAccess().getGroup_6_4()); }
					)
 				)
			)  |

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getLocalClassAssociationAccess().getUnorderedGroup_6(), 5)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getLocalClassAssociationAccess().getUnorderedGroup_6(), 5);
	 				}
	 				{
	 				  selected = true;
	 				}
					(
					
						{ before(grammarAccess.getLocalClassAssociationAccess().getGroup_6_5()); }
						(rule__LocalClassAssociation__Group_6_5__0)
						{ after(grammarAccess.getLocalClassAssociationAccess().getGroup_6_5()); }
					)
 				)
			)  |

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getLocalClassAssociationAccess().getUnorderedGroup_6(), 6)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getLocalClassAssociationAccess().getUnorderedGroup_6(), 6);
	 				}
	 				{
	 				  selected = true;
	 				}
					(
					
						{ before(grammarAccess.getLocalClassAssociationAccess().getGroup_6_6()); }
						(rule__LocalClassAssociation__Group_6_6__0)
						{ after(grammarAccess.getLocalClassAssociationAccess().getGroup_6_6()); }
					)
 				)
			)  

		)
;
finally {
	if (selected)
		getUnorderedGroupHelper().returnFromSelection(grammarAccess.getLocalClassAssociationAccess().getUnorderedGroup_6());
	restoreStackSize(stackSize);
}


rule__LocalClassAssociation__UnorderedGroup_6__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__LocalClassAssociation__UnorderedGroup_6__Impl
	rule__LocalClassAssociation__UnorderedGroup_6__1?
;
finally {
	restoreStackSize(stackSize);
}


rule__LocalClassAssociation__UnorderedGroup_6__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__LocalClassAssociation__UnorderedGroup_6__Impl
	rule__LocalClassAssociation__UnorderedGroup_6__2?
;
finally {
	restoreStackSize(stackSize);
}


rule__LocalClassAssociation__UnorderedGroup_6__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__LocalClassAssociation__UnorderedGroup_6__Impl
	rule__LocalClassAssociation__UnorderedGroup_6__3?
;
finally {
	restoreStackSize(stackSize);
}


rule__LocalClassAssociation__UnorderedGroup_6__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__LocalClassAssociation__UnorderedGroup_6__Impl
	rule__LocalClassAssociation__UnorderedGroup_6__4?
;
finally {
	restoreStackSize(stackSize);
}


rule__LocalClassAssociation__UnorderedGroup_6__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__LocalClassAssociation__UnorderedGroup_6__Impl
	rule__LocalClassAssociation__UnorderedGroup_6__5?
;
finally {
	restoreStackSize(stackSize);
}


rule__LocalClassAssociation__UnorderedGroup_6__5
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__LocalClassAssociation__UnorderedGroup_6__Impl
	rule__LocalClassAssociation__UnorderedGroup_6__6?
;
finally {
	restoreStackSize(stackSize);
}


rule__LocalClassAssociation__UnorderedGroup_6__6
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__LocalClassAssociation__UnorderedGroup_6__Impl
;
finally {
	restoreStackSize(stackSize);
}
















rule__ExternalClassAssociation__UnorderedGroup_7
    @init {
    	int stackSize = keepStackSize();
		getUnorderedGroupHelper().enter(grammarAccess.getExternalClassAssociationAccess().getUnorderedGroup_7());
    }
:
	rule__ExternalClassAssociation__UnorderedGroup_7__0
	?
	
;
finally {
	getUnorderedGroupHelper().leave(grammarAccess.getExternalClassAssociationAccess().getUnorderedGroup_7());
	restoreStackSize(stackSize);
}


rule__ExternalClassAssociation__UnorderedGroup_7__Impl
	@init {
		int stackSize = keepStackSize();
		boolean selected = false;
    }
:
		(

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getExternalClassAssociationAccess().getUnorderedGroup_7(), 0)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getExternalClassAssociationAccess().getUnorderedGroup_7(), 0);
	 				}
	 				{
	 				  selected = true;
	 				}
					(
					
						{ before(grammarAccess.getExternalClassAssociationAccess().getGroup_7_0()); }
						(rule__ExternalClassAssociation__Group_7_0__0)
						{ after(grammarAccess.getExternalClassAssociationAccess().getGroup_7_0()); }
					)
 				)
			)  |

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getExternalClassAssociationAccess().getUnorderedGroup_7(), 1)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getExternalClassAssociationAccess().getUnorderedGroup_7(), 1);
	 				}
	 				{
	 				  selected = true;
	 				}
					(
					
						{ before(grammarAccess.getExternalClassAssociationAccess().getGroup_7_1()); }
						(rule__ExternalClassAssociation__Group_7_1__0)
						{ after(grammarAccess.getExternalClassAssociationAccess().getGroup_7_1()); }
					)
 				)
			)  |

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getExternalClassAssociationAccess().getUnorderedGroup_7(), 2)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getExternalClassAssociationAccess().getUnorderedGroup_7(), 2);
	 				}
	 				{
	 				  selected = true;
	 				}
					(
					
						{ before(grammarAccess.getExternalClassAssociationAccess().getGroup_7_2()); }
						(rule__ExternalClassAssociation__Group_7_2__0)
						{ after(grammarAccess.getExternalClassAssociationAccess().getGroup_7_2()); }
					)
 				)
			)  |

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getExternalClassAssociationAccess().getUnorderedGroup_7(), 3)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getExternalClassAssociationAccess().getUnorderedGroup_7(), 3);
	 				}
	 				{
	 				  selected = true;
	 				}
					(
					
						{ before(grammarAccess.getExternalClassAssociationAccess().getGroup_7_3()); }
						(rule__ExternalClassAssociation__Group_7_3__0)
						{ after(grammarAccess.getExternalClassAssociationAccess().getGroup_7_3()); }
					)
 				)
			)  |

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getExternalClassAssociationAccess().getUnorderedGroup_7(), 4)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getExternalClassAssociationAccess().getUnorderedGroup_7(), 4);
	 				}
	 				{
	 				  selected = true;
	 				}
					(
					
						{ before(grammarAccess.getExternalClassAssociationAccess().getGroup_7_4()); }
						(rule__ExternalClassAssociation__Group_7_4__0)
						{ after(grammarAccess.getExternalClassAssociationAccess().getGroup_7_4()); }
					)
 				)
			)  |

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getExternalClassAssociationAccess().getUnorderedGroup_7(), 5)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getExternalClassAssociationAccess().getUnorderedGroup_7(), 5);
	 				}
	 				{
	 				  selected = true;
	 				}
					(
					
						{ before(grammarAccess.getExternalClassAssociationAccess().getGroup_7_5()); }
						(rule__ExternalClassAssociation__Group_7_5__0)
						{ after(grammarAccess.getExternalClassAssociationAccess().getGroup_7_5()); }
					)
 				)
			)  |

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getExternalClassAssociationAccess().getUnorderedGroup_7(), 6)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getExternalClassAssociationAccess().getUnorderedGroup_7(), 6);
	 				}
	 				{
	 				  selected = true;
	 				}
					(
					
						{ before(grammarAccess.getExternalClassAssociationAccess().getGroup_7_6()); }
						(rule__ExternalClassAssociation__Group_7_6__0)
						{ after(grammarAccess.getExternalClassAssociationAccess().getGroup_7_6()); }
					)
 				)
			)  

		)
;
finally {
	if (selected)
		getUnorderedGroupHelper().returnFromSelection(grammarAccess.getExternalClassAssociationAccess().getUnorderedGroup_7());
	restoreStackSize(stackSize);
}


rule__ExternalClassAssociation__UnorderedGroup_7__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__ExternalClassAssociation__UnorderedGroup_7__Impl
	rule__ExternalClassAssociation__UnorderedGroup_7__1?
;
finally {
	restoreStackSize(stackSize);
}


rule__ExternalClassAssociation__UnorderedGroup_7__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__ExternalClassAssociation__UnorderedGroup_7__Impl
	rule__ExternalClassAssociation__UnorderedGroup_7__2?
;
finally {
	restoreStackSize(stackSize);
}


rule__ExternalClassAssociation__UnorderedGroup_7__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__ExternalClassAssociation__UnorderedGroup_7__Impl
	rule__ExternalClassAssociation__UnorderedGroup_7__3?
;
finally {
	restoreStackSize(stackSize);
}


rule__ExternalClassAssociation__UnorderedGroup_7__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__ExternalClassAssociation__UnorderedGroup_7__Impl
	rule__ExternalClassAssociation__UnorderedGroup_7__4?
;
finally {
	restoreStackSize(stackSize);
}


rule__ExternalClassAssociation__UnorderedGroup_7__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__ExternalClassAssociation__UnorderedGroup_7__Impl
	rule__ExternalClassAssociation__UnorderedGroup_7__5?
;
finally {
	restoreStackSize(stackSize);
}


rule__ExternalClassAssociation__UnorderedGroup_7__5
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__ExternalClassAssociation__UnorderedGroup_7__Impl
	rule__ExternalClassAssociation__UnorderedGroup_7__6?
;
finally {
	restoreStackSize(stackSize);
}


rule__ExternalClassAssociation__UnorderedGroup_7__6
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__ExternalClassAssociation__UnorderedGroup_7__Impl
;
finally {
	restoreStackSize(stackSize);
}
















rule__Attribute__UnorderedGroup_5
    @init {
    	int stackSize = keepStackSize();
		getUnorderedGroupHelper().enter(grammarAccess.getAttributeAccess().getUnorderedGroup_5());
    }
:
	rule__Attribute__UnorderedGroup_5__0
	?
	
;
finally {
	getUnorderedGroupHelper().leave(grammarAccess.getAttributeAccess().getUnorderedGroup_5());
	restoreStackSize(stackSize);
}


rule__Attribute__UnorderedGroup_5__Impl
	@init {
		int stackSize = keepStackSize();
		boolean selected = false;
    }
:
		(

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getAttributeAccess().getUnorderedGroup_5(), 0)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getAttributeAccess().getUnorderedGroup_5(), 0);
	 				}
	 				{
	 				  selected = true;
	 				}
					(
					
						{ before(grammarAccess.getAttributeAccess().getGroup_5_0()); }
						(rule__Attribute__Group_5_0__0)
						{ after(grammarAccess.getAttributeAccess().getGroup_5_0()); }
					)
 				)
			)  |

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getAttributeAccess().getUnorderedGroup_5(), 1)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getAttributeAccess().getUnorderedGroup_5(), 1);
	 				}
	 				{
	 				  selected = true;
	 				}
					(
					
						{ before(grammarAccess.getAttributeAccess().getGroup_5_1()); }
						(rule__Attribute__Group_5_1__0)
						{ after(grammarAccess.getAttributeAccess().getGroup_5_1()); }
					)
 				)
			)  |

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getAttributeAccess().getUnorderedGroup_5(), 2)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getAttributeAccess().getUnorderedGroup_5(), 2);
	 				}
	 				{
	 				  selected = true;
	 				}
					(
					
						{ before(grammarAccess.getAttributeAccess().getGroup_5_2()); }
						(rule__Attribute__Group_5_2__0)
						{ after(grammarAccess.getAttributeAccess().getGroup_5_2()); }
					)
 				)
			)  |

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getAttributeAccess().getUnorderedGroup_5(), 3)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getAttributeAccess().getUnorderedGroup_5(), 3);
	 				}
	 				{
	 				  selected = true;
	 				}
					(
					
						{ before(grammarAccess.getAttributeAccess().getGroup_5_3()); }
						(rule__Attribute__Group_5_3__0)
						{ after(grammarAccess.getAttributeAccess().getGroup_5_3()); }
					)
 				)
			)  |

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getAttributeAccess().getUnorderedGroup_5(), 4)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getAttributeAccess().getUnorderedGroup_5(), 4);
	 				}
	 				{
	 				  selected = true;
	 				}
					(
					
						{ before(grammarAccess.getAttributeAccess().getGroup_5_4()); }
						(rule__Attribute__Group_5_4__0)
						{ after(grammarAccess.getAttributeAccess().getGroup_5_4()); }
					)
 				)
			)  |

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getAttributeAccess().getUnorderedGroup_5(), 5)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getAttributeAccess().getUnorderedGroup_5(), 5);
	 				}
	 				{
	 				  selected = true;
	 				}
					(
					
						{ before(grammarAccess.getAttributeAccess().getGroup_5_5()); }
						(rule__Attribute__Group_5_5__0)
						{ after(grammarAccess.getAttributeAccess().getGroup_5_5()); }
					)
 				)
			)  |

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getAttributeAccess().getUnorderedGroup_5(), 6)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getAttributeAccess().getUnorderedGroup_5(), 6);
	 				}
	 				{
	 				  selected = true;
	 				}
					(
					
						{ before(grammarAccess.getAttributeAccess().getGroup_5_6()); }
						(rule__Attribute__Group_5_6__0)
						{ after(grammarAccess.getAttributeAccess().getGroup_5_6()); }
					)
 				)
			)  |

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getAttributeAccess().getUnorderedGroup_5(), 7)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getAttributeAccess().getUnorderedGroup_5(), 7);
	 				}
	 				{
	 				  selected = true;
	 				}
					(
					
						{ before(grammarAccess.getAttributeAccess().getGroup_5_7()); }
						(rule__Attribute__Group_5_7__0)
						{ after(grammarAccess.getAttributeAccess().getGroup_5_7()); }
					)
 				)
			)  

		)
;
finally {
	if (selected)
		getUnorderedGroupHelper().returnFromSelection(grammarAccess.getAttributeAccess().getUnorderedGroup_5());
	restoreStackSize(stackSize);
}


rule__Attribute__UnorderedGroup_5__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Attribute__UnorderedGroup_5__Impl
	rule__Attribute__UnorderedGroup_5__1?
;
finally {
	restoreStackSize(stackSize);
}


rule__Attribute__UnorderedGroup_5__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Attribute__UnorderedGroup_5__Impl
	rule__Attribute__UnorderedGroup_5__2?
;
finally {
	restoreStackSize(stackSize);
}


rule__Attribute__UnorderedGroup_5__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Attribute__UnorderedGroup_5__Impl
	rule__Attribute__UnorderedGroup_5__3?
;
finally {
	restoreStackSize(stackSize);
}


rule__Attribute__UnorderedGroup_5__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Attribute__UnorderedGroup_5__Impl
	rule__Attribute__UnorderedGroup_5__4?
;
finally {
	restoreStackSize(stackSize);
}


rule__Attribute__UnorderedGroup_5__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Attribute__UnorderedGroup_5__Impl
	rule__Attribute__UnorderedGroup_5__5?
;
finally {
	restoreStackSize(stackSize);
}


rule__Attribute__UnorderedGroup_5__5
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Attribute__UnorderedGroup_5__Impl
	rule__Attribute__UnorderedGroup_5__6?
;
finally {
	restoreStackSize(stackSize);
}


rule__Attribute__UnorderedGroup_5__6
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Attribute__UnorderedGroup_5__Impl
	rule__Attribute__UnorderedGroup_5__7?
;
finally {
	restoreStackSize(stackSize);
}


rule__Attribute__UnorderedGroup_5__7
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Attribute__UnorderedGroup_5__Impl
;
finally {
	restoreStackSize(stackSize);
}


















rule__DataSpec__ImportsAssignment_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getDataSpecAccess().getImportsImportParserRuleCall_1_0()); }
	ruleImport{ after(grammarAccess.getDataSpecAccess().getImportsImportParserRuleCall_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__DataSpec__DataAssignment_2
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getDataSpecAccess().getDataDataParserRuleCall_2_0()); }
	ruleData{ after(grammarAccess.getDataSpecAccess().getDataDataParserRuleCall_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__ImportNamespace__ImportedNamespaceAssignment
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getImportNamespaceAccess().getImportedNamespaceFQNParserRuleCall_0()); }
	ruleFQN{ after(grammarAccess.getImportNamespaceAccess().getImportedNamespaceFQNParserRuleCall_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__ImportURI__ImportURIAssignment_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getImportURIAccess().getImportURIEStringParserRuleCall_1_0()); }
	ruleEString{ after(grammarAccess.getImportURIAccess().getImportURIEStringParserRuleCall_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Data__NameAssignment_2
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getDataAccess().getNameFQNParserRuleCall_2_0()); }
	ruleFQN{ after(grammarAccess.getDataAccess().getNameFQNParserRuleCall_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Data__Owned_annotationsAssignment_4
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getDataAccess().getOwned_annotationsAnnotationParserRuleCall_4_0()); }
	ruleAnnotation{ after(grammarAccess.getDataAccess().getOwned_annotationsAnnotationParserRuleCall_4_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Data__DescriptionAssignment_5_0_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getDataAccess().getDescriptionEStringParserRuleCall_5_0_1_0()); }
	ruleEString{ after(grammarAccess.getDataAccess().getDescriptionEStringParserRuleCall_5_0_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Data__VP_ClassesAssignment_5_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getDataAccess().getVP_ClassesClassParserRuleCall_5_1_0()); }
	ruleClass{ after(grammarAccess.getDataAccess().getVP_ClassesClassParserRuleCall_5_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Data__VP_EnumerationsAssignment_5_2
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getDataAccess().getVP_EnumerationsEnumerationParserRuleCall_5_2_0()); }
	ruleEnumeration{ after(grammarAccess.getDataAccess().getVP_EnumerationsEnumerationParserRuleCall_5_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Class__NameAssignment_2
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getClassAccess().getNameEStringParserRuleCall_2_0()); }
	ruleEString{ after(grammarAccess.getClassAccess().getNameEStringParserRuleCall_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Class__DescriptionAssignment_4_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getClassAccess().getDescriptionEStringParserRuleCall_4_1_0()); }
	ruleEString{ after(grammarAccess.getClassAccess().getDescriptionEStringParserRuleCall_4_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Class__IconAssignment_5_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getClassAccess().getIconSTRINGTerminalRuleCall_5_1_0()); }
	RULE_STRING{ after(grammarAccess.getClassAccess().getIconSTRINGTerminalRuleCall_5_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Class__ExtendsAssignment_6_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getClassAccess().getExtendsEClassCrossReference_6_1_0()); }
(
{ before(grammarAccess.getClassAccess().getExtendsEClassFQNParserRuleCall_6_1_0_1()); }
	ruleFQN{ after(grammarAccess.getClassAccess().getExtendsEClassFQNParserRuleCall_6_1_0_1()); }
)
{ after(grammarAccess.getClassAccess().getExtendsEClassCrossReference_6_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Class__ExtendsAssignment_6_2_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getClassAccess().getExtendsEClassCrossReference_6_2_1_0()); }
(
{ before(grammarAccess.getClassAccess().getExtendsEClassFQNParserRuleCall_6_2_1_0_1()); }
	ruleFQN{ after(grammarAccess.getClassAccess().getExtendsEClassFQNParserRuleCall_6_2_1_0_1()); }
)
{ after(grammarAccess.getClassAccess().getExtendsEClassCrossReference_6_2_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Class__InheritencesAssignment_7_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getClassAccess().getInheritencesAbstractSuperClassParserRuleCall_7_1_0()); }
	ruleAbstractSuperClass{ after(grammarAccess.getClassAccess().getInheritencesAbstractSuperClassParserRuleCall_7_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Class__InheritencesAssignment_7_2_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getClassAccess().getInheritencesAbstractSuperClassParserRuleCall_7_2_1_0()); }
	ruleAbstractSuperClass{ after(grammarAccess.getClassAccess().getInheritencesAbstractSuperClassParserRuleCall_7_2_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Class__AbstractAssignment_8_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getClassAccess().getAbstractEBooleanParserRuleCall_8_1_0()); }
	ruleEBoolean{ after(grammarAccess.getClassAccess().getAbstractEBooleanParserRuleCall_8_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Class__Owned_annotationsAssignment_9
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getClassAccess().getOwned_annotationsAnnotationParserRuleCall_9_0()); }
	ruleAnnotation{ after(grammarAccess.getClassAccess().getOwned_annotationsAnnotationParserRuleCall_9_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Class__VP_Class_AttributesAssignment_10_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getClassAccess().getVP_Class_AttributesAttributeParserRuleCall_10_1_0()); }
	ruleAttribute{ after(grammarAccess.getClassAccess().getVP_Class_AttributesAttributeParserRuleCall_10_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Class__VP_Classes_AssociationsAssignment_11_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getClassAccess().getVP_Classes_AssociationsAbstractAssociationParserRuleCall_11_1_0()); }
	ruleAbstractAssociation{ after(grammarAccess.getClassAccess().getVP_Classes_AssociationsAbstractAssociationParserRuleCall_11_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Class__VP_Class_OperationsAssignment_12_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getClassAccess().getVP_Class_OperationsOperationParserRuleCall_12_1_0()); }
	ruleOperation{ after(grammarAccess.getClassAccess().getVP_Class_OperationsOperationParserRuleCall_12_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Enumeration__NameAssignment_2
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getEnumerationAccess().getNameIDTerminalRuleCall_2_0()); }
	RULE_ID{ after(grammarAccess.getEnumerationAccess().getNameIDTerminalRuleCall_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Enumeration__Owned_annotationsAssignment_4
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getEnumerationAccess().getOwned_annotationsAnnotationParserRuleCall_4_0()); }
	ruleAnnotation{ after(grammarAccess.getEnumerationAccess().getOwned_annotationsAnnotationParserRuleCall_4_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Enumeration__OwnedValuesAssignment_5_0
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getEnumerationAccess().getOwnedValuesValueParserRuleCall_5_0_0()); }
	ruleValue{ after(grammarAccess.getEnumerationAccess().getOwnedValuesValueParserRuleCall_5_0_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Enumeration__OwnedValuesAssignment_5_1_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getEnumerationAccess().getOwnedValuesValueParserRuleCall_5_1_1_0()); }
	ruleValue{ after(grammarAccess.getEnumerationAccess().getOwnedValuesValueParserRuleCall_5_1_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__LocalSuperClass__SuperClassAssignment_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getLocalSuperClassAccess().getSuperClassClassCrossReference_1_0()); }
(
{ before(grammarAccess.getLocalSuperClassAccess().getSuperClassClassFQNParserRuleCall_1_0_1()); }
	ruleFQN{ after(grammarAccess.getLocalSuperClassAccess().getSuperClassClassFQNParserRuleCall_1_0_1()); }
)
{ after(grammarAccess.getLocalSuperClassAccess().getSuperClassClassCrossReference_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__ExternalSuperClass__SuperClassAssignment_2
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getExternalSuperClassAccess().getSuperClassEClassCrossReference_2_0()); }
(
{ before(grammarAccess.getExternalSuperClassAccess().getSuperClassEClassFQNParserRuleCall_2_0_1()); }
	ruleFQN{ after(grammarAccess.getExternalSuperClassAccess().getSuperClassEClassFQNParserRuleCall_2_0_1()); }
)
{ after(grammarAccess.getExternalSuperClassAccess().getSuperClassEClassCrossReference_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__LocalClassAssociation__NameAssignment_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getLocalClassAssociationAccess().getNameEStringParserRuleCall_1_0()); }
	ruleEString{ after(grammarAccess.getLocalClassAssociationAccess().getNameEStringParserRuleCall_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__LocalClassAssociation__DescriptionAssignment_2_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getLocalClassAssociationAccess().getDescriptionEStringParserRuleCall_2_1_0()); }
	ruleEString{ after(grammarAccess.getLocalClassAssociationAccess().getDescriptionEStringParserRuleCall_2_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__LocalClassAssociation__TypeAssignment_3
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getLocalClassAssociationAccess().getTypeAssociation_TypesEnumRuleCall_3_0()); }
	ruleAssociation_Types{ after(grammarAccess.getLocalClassAssociationAccess().getTypeAssociation_TypesEnumRuleCall_3_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__LocalClassAssociation__CardinalityAssignment_4
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getLocalClassAssociationAccess().getCardinalityCardinalitiesEnumRuleCall_4_0()); }
	ruleCardinalities{ after(grammarAccess.getLocalClassAssociationAccess().getCardinalityCardinalitiesEnumRuleCall_4_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__LocalClassAssociation__LocalTargetAssignment_5
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getLocalClassAssociationAccess().getLocalTargetClassCrossReference_5_0()); }
(
{ before(grammarAccess.getLocalClassAssociationAccess().getLocalTargetClassFQNParserRuleCall_5_0_1()); }
	ruleFQN{ after(grammarAccess.getLocalClassAssociationAccess().getLocalTargetClassFQNParserRuleCall_5_0_1()); }
)
{ after(grammarAccess.getLocalClassAssociationAccess().getLocalTargetClassCrossReference_5_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__LocalClassAssociation__ChangeableAssignment_6_0_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getLocalClassAssociationAccess().getChangeableEBooleanParserRuleCall_6_0_1_0()); }
	ruleEBoolean{ after(grammarAccess.getLocalClassAssociationAccess().getChangeableEBooleanParserRuleCall_6_0_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__LocalClassAssociation__DerivedAssignment_6_1_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getLocalClassAssociationAccess().getDerivedEBooleanParserRuleCall_6_1_1_0()); }
	ruleEBoolean{ after(grammarAccess.getLocalClassAssociationAccess().getDerivedEBooleanParserRuleCall_6_1_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__LocalClassAssociation__OrderedAssignment_6_2_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getLocalClassAssociationAccess().getOrderedEBooleanParserRuleCall_6_2_1_0()); }
	ruleEBoolean{ after(grammarAccess.getLocalClassAssociationAccess().getOrderedEBooleanParserRuleCall_6_2_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__LocalClassAssociation__TransientAssignment_6_3_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getLocalClassAssociationAccess().getTransientEBooleanParserRuleCall_6_3_1_0()); }
	ruleEBoolean{ after(grammarAccess.getLocalClassAssociationAccess().getTransientEBooleanParserRuleCall_6_3_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__LocalClassAssociation__UniqueAssignment_6_4_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getLocalClassAssociationAccess().getUniqueEBooleanParserRuleCall_6_4_1_0()); }
	ruleEBoolean{ after(grammarAccess.getLocalClassAssociationAccess().getUniqueEBooleanParserRuleCall_6_4_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__LocalClassAssociation__UnsettableAssignment_6_5_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getLocalClassAssociationAccess().getUnsettableEBooleanParserRuleCall_6_5_1_0()); }
	ruleEBoolean{ after(grammarAccess.getLocalClassAssociationAccess().getUnsettableEBooleanParserRuleCall_6_5_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__LocalClassAssociation__VolatileAssignment_6_6_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getLocalClassAssociationAccess().getVolatileEBooleanParserRuleCall_6_6_1_0()); }
	ruleEBoolean{ after(grammarAccess.getLocalClassAssociationAccess().getVolatileEBooleanParserRuleCall_6_6_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__LocalClassAssociation__Owned_annotationsAssignment_7
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getLocalClassAssociationAccess().getOwned_annotationsAnnotationParserRuleCall_7_0()); }
	ruleAnnotation{ after(grammarAccess.getLocalClassAssociationAccess().getOwned_annotationsAnnotationParserRuleCall_7_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__ExternalClassAssociation__NameAssignment_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getExternalClassAssociationAccess().getNameEStringParserRuleCall_1_0()); }
	ruleEString{ after(grammarAccess.getExternalClassAssociationAccess().getNameEStringParserRuleCall_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__ExternalClassAssociation__DescriptionAssignment_2_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getExternalClassAssociationAccess().getDescriptionEStringParserRuleCall_2_1_0()); }
	ruleEString{ after(grammarAccess.getExternalClassAssociationAccess().getDescriptionEStringParserRuleCall_2_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__ExternalClassAssociation__TypeAssignment_3
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getExternalClassAssociationAccess().getTypeAssociation_TypesEnumRuleCall_3_0()); }
	ruleAssociation_Types{ after(grammarAccess.getExternalClassAssociationAccess().getTypeAssociation_TypesEnumRuleCall_3_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__ExternalClassAssociation__CardinalityAssignment_4
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getExternalClassAssociationAccess().getCardinalityCardinalitiesEnumRuleCall_4_0()); }
	ruleCardinalities{ after(grammarAccess.getExternalClassAssociationAccess().getCardinalityCardinalitiesEnumRuleCall_4_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__ExternalClassAssociation__ExternalTargetAssignment_6
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getExternalClassAssociationAccess().getExternalTargetEClassCrossReference_6_0()); }
(
{ before(grammarAccess.getExternalClassAssociationAccess().getExternalTargetEClassFQNParserRuleCall_6_0_1()); }
	ruleFQN{ after(grammarAccess.getExternalClassAssociationAccess().getExternalTargetEClassFQNParserRuleCall_6_0_1()); }
)
{ after(grammarAccess.getExternalClassAssociationAccess().getExternalTargetEClassCrossReference_6_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__ExternalClassAssociation__ChangeableAssignment_7_0_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getExternalClassAssociationAccess().getChangeableEBooleanParserRuleCall_7_0_1_0()); }
	ruleEBoolean{ after(grammarAccess.getExternalClassAssociationAccess().getChangeableEBooleanParserRuleCall_7_0_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__ExternalClassAssociation__DerivedAssignment_7_1_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getExternalClassAssociationAccess().getDerivedEBooleanParserRuleCall_7_1_1_0()); }
	ruleEBoolean{ after(grammarAccess.getExternalClassAssociationAccess().getDerivedEBooleanParserRuleCall_7_1_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__ExternalClassAssociation__OrderedAssignment_7_2_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getExternalClassAssociationAccess().getOrderedEBooleanParserRuleCall_7_2_1_0()); }
	ruleEBoolean{ after(grammarAccess.getExternalClassAssociationAccess().getOrderedEBooleanParserRuleCall_7_2_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__ExternalClassAssociation__TransientAssignment_7_3_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getExternalClassAssociationAccess().getTransientEBooleanParserRuleCall_7_3_1_0()); }
	ruleEBoolean{ after(grammarAccess.getExternalClassAssociationAccess().getTransientEBooleanParserRuleCall_7_3_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__ExternalClassAssociation__UniqueAssignment_7_4_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getExternalClassAssociationAccess().getUniqueEBooleanParserRuleCall_7_4_1_0()); }
	ruleEBoolean{ after(grammarAccess.getExternalClassAssociationAccess().getUniqueEBooleanParserRuleCall_7_4_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__ExternalClassAssociation__UnsettableAssignment_7_5_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getExternalClassAssociationAccess().getUnsettableEBooleanParserRuleCall_7_5_1_0()); }
	ruleEBoolean{ after(grammarAccess.getExternalClassAssociationAccess().getUnsettableEBooleanParserRuleCall_7_5_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__ExternalClassAssociation__VolatileAssignment_7_6_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getExternalClassAssociationAccess().getVolatileEBooleanParserRuleCall_7_6_1_0()); }
	ruleEBoolean{ after(grammarAccess.getExternalClassAssociationAccess().getVolatileEBooleanParserRuleCall_7_6_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__ExternalClassAssociation__Owned_annotationsAssignment_8
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getExternalClassAssociationAccess().getOwned_annotationsAnnotationParserRuleCall_8_0()); }
	ruleAnnotation{ after(grammarAccess.getExternalClassAssociationAccess().getOwned_annotationsAnnotationParserRuleCall_8_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__LocalAttributeType__TypeAssignment_2
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getLocalAttributeTypeAccess().getTypeEnumerationCrossReference_2_0()); }
(
{ before(grammarAccess.getLocalAttributeTypeAccess().getTypeEnumerationFQNParserRuleCall_2_0_1()); }
	ruleFQN{ after(grammarAccess.getLocalAttributeTypeAccess().getTypeEnumerationFQNParserRuleCall_2_0_1()); }
)
{ after(grammarAccess.getLocalAttributeTypeAccess().getTypeEnumerationCrossReference_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__ExternalAttributeType__TypeAssignment_2
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getExternalAttributeTypeAccess().getTypeEDataTypeCrossReference_2_0()); }
(
{ before(grammarAccess.getExternalAttributeTypeAccess().getTypeEDataTypeFQNParserRuleCall_2_0_1()); }
	ruleFQN{ after(grammarAccess.getExternalAttributeTypeAccess().getTypeEDataTypeFQNParserRuleCall_2_0_1()); }
)
{ after(grammarAccess.getExternalAttributeTypeAccess().getTypeEDataTypeCrossReference_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Attribute__NameAssignment_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getAttributeAccess().getNameEStringParserRuleCall_1_0()); }
	ruleEString{ after(grammarAccess.getAttributeAccess().getNameEStringParserRuleCall_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Attribute__DescriptionAssignment_2_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getAttributeAccess().getDescriptionEStringParserRuleCall_2_1_0()); }
	ruleEString{ after(grammarAccess.getAttributeAccess().getDescriptionEStringParserRuleCall_2_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Attribute__Owned_typeAssignment_3
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getAttributeAccess().getOwned_typeAbstractAttributeTypeParserRuleCall_3_0()); }
	ruleAbstractAttributeType{ after(grammarAccess.getAttributeAccess().getOwned_typeAbstractAttributeTypeParserRuleCall_3_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Attribute__CardinalityAssignment_4
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getAttributeAccess().getCardinalityCardinalitiesEnumRuleCall_4_0()); }
	ruleCardinalities{ after(grammarAccess.getAttributeAccess().getCardinalityCardinalitiesEnumRuleCall_4_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Attribute__IsIdAssignment_5_0_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getAttributeAccess().getIsIdEBooleanParserRuleCall_5_0_1_0()); }
	ruleEBoolean{ after(grammarAccess.getAttributeAccess().getIsIdEBooleanParserRuleCall_5_0_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Attribute__ChangeableAssignment_5_1_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getAttributeAccess().getChangeableEBooleanParserRuleCall_5_1_1_0()); }
	ruleEBoolean{ after(grammarAccess.getAttributeAccess().getChangeableEBooleanParserRuleCall_5_1_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Attribute__DerivedAssignment_5_2_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getAttributeAccess().getDerivedEBooleanParserRuleCall_5_2_1_0()); }
	ruleEBoolean{ after(grammarAccess.getAttributeAccess().getDerivedEBooleanParserRuleCall_5_2_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Attribute__OrderedAssignment_5_3_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getAttributeAccess().getOrderedEBooleanParserRuleCall_5_3_1_0()); }
	ruleEBoolean{ after(grammarAccess.getAttributeAccess().getOrderedEBooleanParserRuleCall_5_3_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Attribute__TransientAssignment_5_4_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getAttributeAccess().getTransientEBooleanParserRuleCall_5_4_1_0()); }
	ruleEBoolean{ after(grammarAccess.getAttributeAccess().getTransientEBooleanParserRuleCall_5_4_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Attribute__UniqueAssignment_5_5_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getAttributeAccess().getUniqueEBooleanParserRuleCall_5_5_1_0()); }
	ruleEBoolean{ after(grammarAccess.getAttributeAccess().getUniqueEBooleanParserRuleCall_5_5_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Attribute__UnsettableAssignment_5_6_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getAttributeAccess().getUnsettableEBooleanParserRuleCall_5_6_1_0()); }
	ruleEBoolean{ after(grammarAccess.getAttributeAccess().getUnsettableEBooleanParserRuleCall_5_6_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Attribute__VolatileAssignment_5_7_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getAttributeAccess().getVolatileEBooleanParserRuleCall_5_7_1_0()); }
	ruleEBoolean{ after(grammarAccess.getAttributeAccess().getVolatileEBooleanParserRuleCall_5_7_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Attribute__Owned_valuesAssignment_6_2_0
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getAttributeAccess().getOwned_valuesValueParserRuleCall_6_2_0_0()); }
	ruleValue{ after(grammarAccess.getAttributeAccess().getOwned_valuesValueParserRuleCall_6_2_0_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Attribute__Owned_valuesAssignment_6_2_1_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getAttributeAccess().getOwned_valuesValueParserRuleCall_6_2_1_1_0()); }
	ruleValue{ after(grammarAccess.getAttributeAccess().getOwned_valuesValueParserRuleCall_6_2_1_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Attribute__Owned_annotationsAssignment_7
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getAttributeAccess().getOwned_annotationsAnnotationParserRuleCall_7_0()); }
	ruleAnnotation{ after(grammarAccess.getAttributeAccess().getOwned_annotationsAnnotationParserRuleCall_7_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Value__NameAssignment_1_0
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getValueAccess().getNameEStringParserRuleCall_1_0_0()); }
	ruleEString{ after(grammarAccess.getValueAccess().getNameEStringParserRuleCall_1_0_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Value__LiteralAssignment_2
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getValueAccess().getLiteralEStringParserRuleCall_2_0()); }
	ruleEString{ after(grammarAccess.getValueAccess().getLiteralEStringParserRuleCall_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Operation__NameAssignment_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getOperationAccess().getNameEStringParserRuleCall_1_0()); }
	ruleEString{ after(grammarAccess.getOperationAccess().getNameEStringParserRuleCall_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Operation__ParametersAssignment_3_0
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getOperationAccess().getParametersParameterParserRuleCall_3_0_0()); }
	ruleParameter{ after(grammarAccess.getOperationAccess().getParametersParameterParserRuleCall_3_0_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Operation__ParametersAssignment_3_1_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getOperationAccess().getParametersParameterParserRuleCall_3_1_1_0()); }
	ruleParameter{ after(grammarAccess.getOperationAccess().getParametersParameterParserRuleCall_3_1_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Operation__Operation_typeAssignment_5_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getOperationAccess().getOperation_typeAbstractTypeParserRuleCall_5_1_0()); }
	ruleAbstractType{ after(grammarAccess.getOperationAccess().getOperation_typeAbstractTypeParserRuleCall_5_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Operation__Owned_annotationsAssignment_6
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getOperationAccess().getOwned_annotationsAnnotationParserRuleCall_6_0()); }
	ruleAnnotation{ after(grammarAccess.getOperationAccess().getOwned_annotationsAnnotationParserRuleCall_6_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Parameter__Parameter_typeAssignment_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getParameterAccess().getParameter_typeAbstractTypeParserRuleCall_1_0()); }
	ruleAbstractType{ after(grammarAccess.getParameterAccess().getParameter_typeAbstractTypeParserRuleCall_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Parameter__NameAssignment_2
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getParameterAccess().getNameEStringParserRuleCall_2_0()); }
	ruleEString{ after(grammarAccess.getParameterAccess().getNameEStringParserRuleCall_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Parameter__DescriptionAssignment_3
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getParameterAccess().getDescriptionEStringParserRuleCall_3_0()); }
	ruleEString{ after(grammarAccess.getParameterAccess().getDescriptionEStringParserRuleCall_3_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Parameter__Owned_annotationsAssignment_4
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getParameterAccess().getOwned_annotationsAnnotationParserRuleCall_4_0()); }
	ruleAnnotation{ after(grammarAccess.getParameterAccess().getOwned_annotationsAnnotationParserRuleCall_4_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__ExternalType__TypeAssignment_2
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getExternalTypeAccess().getTypeEClassifierCrossReference_2_0()); }
(
{ before(grammarAccess.getExternalTypeAccess().getTypeEClassifierFQNParserRuleCall_2_0_1()); }
	ruleFQN{ after(grammarAccess.getExternalTypeAccess().getTypeEClassifierFQNParserRuleCall_2_0_1()); }
)
{ after(grammarAccess.getExternalTypeAccess().getTypeEClassifierCrossReference_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__ExternalType__CardinalityAssignment_3
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getExternalTypeAccess().getCardinalityCardinalitiesEnumRuleCall_3_0()); }
	ruleCardinalities{ after(grammarAccess.getExternalTypeAccess().getCardinalityCardinalitiesEnumRuleCall_3_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__LocalType__TypeAssignment_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getLocalTypeAccess().getTypeViewpointClassifierCrossReference_1_0()); }
(
{ before(grammarAccess.getLocalTypeAccess().getTypeViewpointClassifierFQNParserRuleCall_1_0_1()); }
	ruleFQN{ after(grammarAccess.getLocalTypeAccess().getTypeViewpointClassifierFQNParserRuleCall_1_0_1()); }
)
{ after(grammarAccess.getLocalTypeAccess().getTypeViewpointClassifierCrossReference_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__LocalType__CardinalityAssignment_2
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getLocalTypeAccess().getCardinalityCardinalitiesEnumRuleCall_2_0()); }
	ruleCardinalities{ after(grammarAccess.getLocalTypeAccess().getCardinalityCardinalitiesEnumRuleCall_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Annotation__SourceAssignment_2
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getAnnotationAccess().getSourceEStringParserRuleCall_2_0()); }
	ruleEString{ after(grammarAccess.getAnnotationAccess().getSourceEStringParserRuleCall_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Annotation__Owned_detailsAssignment_3_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getAnnotationAccess().getOwned_detailsDetailParserRuleCall_3_1_0()); }
	ruleDetail{ after(grammarAccess.getAnnotationAccess().getOwned_detailsDetailParserRuleCall_3_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Detail__KeyAssignment_2
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getDetailAccess().getKeyEStringParserRuleCall_2_0()); }
	ruleEString{ after(grammarAccess.getDetailAccess().getKeyEStringParserRuleCall_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Detail__ValueAssignment_3_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getDetailAccess().getValueEStringParserRuleCall_3_1_0()); }
	ruleEString{ after(grammarAccess.getDetailAccess().getValueEStringParserRuleCall_3_1_0()); }
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



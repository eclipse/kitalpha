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
grammar InternalAfdesc;

options {
	superClass=AbstractInternalContentAssistParser;
	backtrack=true;
	
}

@lexer::header {
package org.polarsys.kitalpha.ad.af.dsl.cs.text.ui.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;
}

@parser::header {
package org.polarsys.kitalpha.ad.af.dsl.cs.text.ui.contentassist.antlr.internal; 

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
import org.polarsys.kitalpha.ad.af.dsl.cs.text.services.AfdescGrammarAccess;

}

@parser::members {
 
 	private AfdescGrammarAccess grammarAccess;
 	
    public void setGrammarAccess(AfdescGrammarAccess grammarAccess) {
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




// Entry rule entryRuleNamedElement
entryRuleNamedElement 
:
{ before(grammarAccess.getNamedElementRule()); }
	 ruleNamedElement
{ after(grammarAccess.getNamedElementRule()); } 
	 EOF 
;

// Rule NamedElement
ruleNamedElement
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getNamedElementAccess().getArchitectureFrameworkParserRuleCall()); }
	ruleArchitectureFramework
{ after(grammarAccess.getNamedElementAccess().getArchitectureFrameworkParserRuleCall()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleArchitectureFramework
entryRuleArchitectureFramework 
:
{ before(grammarAccess.getArchitectureFrameworkRule()); }
	 ruleArchitectureFramework
{ after(grammarAccess.getArchitectureFrameworkRule()); } 
	 EOF 
;

// Rule ArchitectureFramework
ruleArchitectureFramework
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getArchitectureFrameworkAccess().getGroup()); }
(rule__ArchitectureFramework__Group__0)
{ after(grammarAccess.getArchitectureFrameworkAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleConfiguration
entryRuleConfiguration 
:
{ before(grammarAccess.getConfigurationRule()); }
	 ruleConfiguration
{ after(grammarAccess.getConfigurationRule()); } 
	 EOF 
;

// Rule Configuration
ruleConfiguration
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getConfigurationAccess().getGroup()); }
(rule__Configuration__Group__0)
{ after(grammarAccess.getConfigurationAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleConfigurationElement
entryRuleConfigurationElement 
:
{ before(grammarAccess.getConfigurationElementRule()); }
	 ruleConfigurationElement
{ after(grammarAccess.getConfigurationElementRule()); } 
	 EOF 
;

// Rule ConfigurationElement
ruleConfigurationElement
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getConfigurationElementAccess().getGenerationConfigurationParserRuleCall()); }
	ruleGenerationConfiguration
{ after(grammarAccess.getConfigurationElementAccess().getGenerationConfigurationParserRuleCall()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleGenerationConfiguration
entryRuleGenerationConfiguration 
:
{ before(grammarAccess.getGenerationConfigurationRule()); }
	 ruleGenerationConfiguration
{ after(grammarAccess.getGenerationConfigurationRule()); } 
	 EOF 
;

// Rule GenerationConfiguration
ruleGenerationConfiguration
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getGenerationConfigurationAccess().getGroup()); }
(rule__GenerationConfiguration__Group__0)
{ after(grammarAccess.getGenerationConfigurationAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleViewpoints
entryRuleViewpoints 
:
{ before(grammarAccess.getViewpointsRule()); }
	 ruleViewpoints
{ after(grammarAccess.getViewpointsRule()); } 
	 EOF 
;

// Rule Viewpoints
ruleViewpoints
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getViewpointsAccess().getGroup()); }
(rule__Viewpoints__Group__0)
{ after(grammarAccess.getViewpointsAccess().getGroup()); }
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






rule__ArchitectureFramework__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__ArchitectureFramework__Group__0__Impl
	rule__ArchitectureFramework__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ArchitectureFramework__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getArchitectureFrameworkAccess().getArchitectureFrameworkAction_0()); }
(

)
{ after(grammarAccess.getArchitectureFrameworkAccess().getArchitectureFrameworkAction_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__ArchitectureFramework__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__ArchitectureFramework__Group__1__Impl
	rule__ArchitectureFramework__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__ArchitectureFramework__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getArchitectureFrameworkAccess().getArchitectureFrameworkKeyword_1()); }

	'ArchitectureFramework' 

{ after(grammarAccess.getArchitectureFrameworkAccess().getArchitectureFrameworkKeyword_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__ArchitectureFramework__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__ArchitectureFramework__Group__2__Impl
	rule__ArchitectureFramework__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__ArchitectureFramework__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getArchitectureFrameworkAccess().getNameAssignment_2()); }
(rule__ArchitectureFramework__NameAssignment_2)?
{ after(grammarAccess.getArchitectureFrameworkAccess().getNameAssignment_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__ArchitectureFramework__Group__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__ArchitectureFramework__Group__3__Impl
	rule__ArchitectureFramework__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__ArchitectureFramework__Group__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getArchitectureFrameworkAccess().getLeftCurlyBracketKeyword_3()); }

	'{' 

{ after(grammarAccess.getArchitectureFrameworkAccess().getLeftCurlyBracketKeyword_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__ArchitectureFramework__Group__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__ArchitectureFramework__Group__4__Impl
	rule__ArchitectureFramework__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__ArchitectureFramework__Group__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getArchitectureFrameworkAccess().getGroup_4()); }
(rule__ArchitectureFramework__Group_4__0)?
{ after(grammarAccess.getArchitectureFrameworkAccess().getGroup_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__ArchitectureFramework__Group__5
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__ArchitectureFramework__Group__5__Impl
	rule__ArchitectureFramework__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__ArchitectureFramework__Group__5__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getArchitectureFrameworkAccess().getGroup_5()); }
(rule__ArchitectureFramework__Group_5__0)?
{ after(grammarAccess.getArchitectureFrameworkAccess().getGroup_5()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__ArchitectureFramework__Group__6
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__ArchitectureFramework__Group__6__Impl
	rule__ArchitectureFramework__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__ArchitectureFramework__Group__6__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getArchitectureFrameworkAccess().getAf_viewpointsAssignment_6()); }
(rule__ArchitectureFramework__Af_viewpointsAssignment_6)?
{ after(grammarAccess.getArchitectureFrameworkAccess().getAf_viewpointsAssignment_6()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__ArchitectureFramework__Group__7
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__ArchitectureFramework__Group__7__Impl
	rule__ArchitectureFramework__Group__8
;
finally {
	restoreStackSize(stackSize);
}

rule__ArchitectureFramework__Group__7__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getArchitectureFrameworkAccess().getOwned_configurationAssignment_7()); }
(rule__ArchitectureFramework__Owned_configurationAssignment_7)
{ after(grammarAccess.getArchitectureFrameworkAccess().getOwned_configurationAssignment_7()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__ArchitectureFramework__Group__8
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__ArchitectureFramework__Group__8__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ArchitectureFramework__Group__8__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getArchitectureFrameworkAccess().getRightCurlyBracketKeyword_8()); }

	'}' 

{ after(grammarAccess.getArchitectureFrameworkAccess().getRightCurlyBracketKeyword_8()); }
)

;
finally {
	restoreStackSize(stackSize);
}




















rule__ArchitectureFramework__Group_4__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__ArchitectureFramework__Group_4__0__Impl
	rule__ArchitectureFramework__Group_4__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ArchitectureFramework__Group_4__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getArchitectureFrameworkAccess().getDescriptionKeyword_4_0()); }

	'description:' 

{ after(grammarAccess.getArchitectureFrameworkAccess().getDescriptionKeyword_4_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__ArchitectureFramework__Group_4__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__ArchitectureFramework__Group_4__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ArchitectureFramework__Group_4__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getArchitectureFrameworkAccess().getDescriptionAssignment_4_1()); }
(rule__ArchitectureFramework__DescriptionAssignment_4_1)
{ after(grammarAccess.getArchitectureFrameworkAccess().getDescriptionAssignment_4_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__ArchitectureFramework__Group_5__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__ArchitectureFramework__Group_5__0__Impl
	rule__ArchitectureFramework__Group_5__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ArchitectureFramework__Group_5__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getArchitectureFrameworkAccess().getShortNameKeyword_5_0()); }

	'shortName:' 

{ after(grammarAccess.getArchitectureFrameworkAccess().getShortNameKeyword_5_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__ArchitectureFramework__Group_5__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__ArchitectureFramework__Group_5__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ArchitectureFramework__Group_5__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getArchitectureFrameworkAccess().getShortNameAssignment_5_1()); }
(rule__ArchitectureFramework__ShortNameAssignment_5_1)
{ after(grammarAccess.getArchitectureFrameworkAccess().getShortNameAssignment_5_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__Configuration__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Configuration__Group__0__Impl
	rule__Configuration__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Configuration__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getConfigurationAccess().getConfigurationAction_0()); }
(

)
{ after(grammarAccess.getConfigurationAccess().getConfigurationAction_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Configuration__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Configuration__Group__1__Impl
	rule__Configuration__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Configuration__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getConfigurationAccess().getConfigurationKeyword_1()); }

	'Configuration' 

{ after(grammarAccess.getConfigurationAccess().getConfigurationKeyword_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Configuration__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Configuration__Group__2__Impl
	rule__Configuration__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Configuration__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getConfigurationAccess().getLeftCurlyBracketKeyword_2()); }

	'{' 

{ after(grammarAccess.getConfigurationAccess().getLeftCurlyBracketKeyword_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Configuration__Group__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Configuration__Group__3__Impl
	rule__Configuration__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__Configuration__Group__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getConfigurationAccess().getGroup_3()); }
(rule__Configuration__Group_3__0)?
{ after(grammarAccess.getConfigurationAccess().getGroup_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Configuration__Group__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Configuration__Group__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Configuration__Group__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getConfigurationAccess().getRightCurlyBracketKeyword_4()); }

	'}' 

{ after(grammarAccess.getConfigurationAccess().getRightCurlyBracketKeyword_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}












rule__Configuration__Group_3__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Configuration__Group_3__0__Impl
	rule__Configuration__Group_3__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Configuration__Group_3__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getConfigurationAccess().getOwned_elementAssignment_3_0()); }
(rule__Configuration__Owned_elementAssignment_3_0)
{ after(grammarAccess.getConfigurationAccess().getOwned_elementAssignment_3_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Configuration__Group_3__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Configuration__Group_3__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Configuration__Group_3__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getConfigurationAccess().getGroup_3_1()); }
(rule__Configuration__Group_3_1__0)*
{ after(grammarAccess.getConfigurationAccess().getGroup_3_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__Configuration__Group_3_1__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Configuration__Group_3_1__0__Impl
	rule__Configuration__Group_3_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Configuration__Group_3_1__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getConfigurationAccess().getCommaKeyword_3_1_0()); }

	',' 

{ after(grammarAccess.getConfigurationAccess().getCommaKeyword_3_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Configuration__Group_3_1__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Configuration__Group_3_1__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Configuration__Group_3_1__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getConfigurationAccess().getOwned_elementAssignment_3_1_1()); }
(rule__Configuration__Owned_elementAssignment_3_1_1)
{ after(grammarAccess.getConfigurationAccess().getOwned_elementAssignment_3_1_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__GenerationConfiguration__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__GenerationConfiguration__Group__0__Impl
	rule__GenerationConfiguration__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GenerationConfiguration__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getGenerationConfigurationAccess().getGenerationConfigurationAction_0()); }
(

)
{ after(grammarAccess.getGenerationConfigurationAccess().getGenerationConfigurationAction_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__GenerationConfiguration__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__GenerationConfiguration__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GenerationConfiguration__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getGenerationConfigurationAccess().getGroup_1()); }
(rule__GenerationConfiguration__Group_1__0)
{ after(grammarAccess.getGenerationConfigurationAccess().getGroup_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__GenerationConfiguration__Group_1__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__GenerationConfiguration__Group_1__0__Impl
	rule__GenerationConfiguration__Group_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GenerationConfiguration__Group_1__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getGenerationConfigurationAccess().getRootProjectNameKeyword_1_0()); }

	'rootProjectName:' 

{ after(grammarAccess.getGenerationConfigurationAccess().getRootProjectNameKeyword_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__GenerationConfiguration__Group_1__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__GenerationConfiguration__Group_1__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GenerationConfiguration__Group_1__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getGenerationConfigurationAccess().getRootProjectNameAssignment_1_1()); }
(rule__GenerationConfiguration__RootProjectNameAssignment_1_1)
{ after(grammarAccess.getGenerationConfigurationAccess().getRootProjectNameAssignment_1_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__Viewpoints__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Viewpoints__Group__0__Impl
	rule__Viewpoints__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Viewpoints__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getViewpointsAccess().getViewpointsAction_0()); }
(

)
{ after(grammarAccess.getViewpointsAccess().getViewpointsAction_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Viewpoints__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Viewpoints__Group__1__Impl
	rule__Viewpoints__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Viewpoints__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getViewpointsAccess().getViewpointsKeyword_1()); }

	'Viewpoints' 

{ after(grammarAccess.getViewpointsAccess().getViewpointsKeyword_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Viewpoints__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Viewpoints__Group__2__Impl
	rule__Viewpoints__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Viewpoints__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getViewpointsAccess().getLeftCurlyBracketKeyword_2()); }

	'{' 

{ after(grammarAccess.getViewpointsAccess().getLeftCurlyBracketKeyword_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Viewpoints__Group__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Viewpoints__Group__3__Impl
	rule__Viewpoints__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__Viewpoints__Group__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getViewpointsAccess().getGroup_3()); }
(rule__Viewpoints__Group_3__0)?
{ after(grammarAccess.getViewpointsAccess().getGroup_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Viewpoints__Group__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Viewpoints__Group__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Viewpoints__Group__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getViewpointsAccess().getRightCurlyBracketKeyword_4()); }

	'}' 

{ after(grammarAccess.getViewpointsAccess().getRightCurlyBracketKeyword_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}












rule__Viewpoints__Group_3__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Viewpoints__Group_3__0__Impl
	rule__Viewpoints__Group_3__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Viewpoints__Group_3__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getViewpointsAccess().getOwned_viewpointsAssignment_3_0()); }
(rule__Viewpoints__Owned_viewpointsAssignment_3_0)
{ after(grammarAccess.getViewpointsAccess().getOwned_viewpointsAssignment_3_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Viewpoints__Group_3__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Viewpoints__Group_3__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Viewpoints__Group_3__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getViewpointsAccess().getGroup_3_1()); }
(rule__Viewpoints__Group_3_1__0)*
{ after(grammarAccess.getViewpointsAccess().getGroup_3_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__Viewpoints__Group_3_1__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Viewpoints__Group_3_1__0__Impl
	rule__Viewpoints__Group_3_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Viewpoints__Group_3_1__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getViewpointsAccess().getCommaKeyword_3_1_0()); }

	',' 

{ after(grammarAccess.getViewpointsAccess().getCommaKeyword_3_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Viewpoints__Group_3_1__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Viewpoints__Group_3_1__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Viewpoints__Group_3_1__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getViewpointsAccess().getOwned_viewpointsAssignment_3_1_1()); }
(rule__Viewpoints__Owned_viewpointsAssignment_3_1_1)
{ after(grammarAccess.getViewpointsAccess().getOwned_viewpointsAssignment_3_1_1()); }
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







rule__ArchitectureFramework__NameAssignment_2
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getArchitectureFrameworkAccess().getNameIDTerminalRuleCall_2_0()); }
	RULE_ID{ after(grammarAccess.getArchitectureFrameworkAccess().getNameIDTerminalRuleCall_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__ArchitectureFramework__DescriptionAssignment_4_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getArchitectureFrameworkAccess().getDescriptionSTRINGTerminalRuleCall_4_1_0()); }
	RULE_STRING{ after(grammarAccess.getArchitectureFrameworkAccess().getDescriptionSTRINGTerminalRuleCall_4_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__ArchitectureFramework__ShortNameAssignment_5_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getArchitectureFrameworkAccess().getShortNameSTRINGTerminalRuleCall_5_1_0()); }
	RULE_STRING{ after(grammarAccess.getArchitectureFrameworkAccess().getShortNameSTRINGTerminalRuleCall_5_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__ArchitectureFramework__Af_viewpointsAssignment_6
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getArchitectureFrameworkAccess().getAf_viewpointsViewpointsParserRuleCall_6_0()); }
	ruleViewpoints{ after(grammarAccess.getArchitectureFrameworkAccess().getAf_viewpointsViewpointsParserRuleCall_6_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__ArchitectureFramework__Owned_configurationAssignment_7
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getArchitectureFrameworkAccess().getOwned_configurationConfigurationParserRuleCall_7_0()); }
	ruleConfiguration{ after(grammarAccess.getArchitectureFrameworkAccess().getOwned_configurationConfigurationParserRuleCall_7_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Configuration__Owned_elementAssignment_3_0
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getConfigurationAccess().getOwned_elementConfigurationElementParserRuleCall_3_0_0()); }
	ruleConfigurationElement{ after(grammarAccess.getConfigurationAccess().getOwned_elementConfigurationElementParserRuleCall_3_0_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Configuration__Owned_elementAssignment_3_1_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getConfigurationAccess().getOwned_elementConfigurationElementParserRuleCall_3_1_1_0()); }
	ruleConfigurationElement{ after(grammarAccess.getConfigurationAccess().getOwned_elementConfigurationElementParserRuleCall_3_1_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__GenerationConfiguration__RootProjectNameAssignment_1_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getGenerationConfigurationAccess().getRootProjectNameFQNParserRuleCall_1_1_0()); }
	ruleFQN{ after(grammarAccess.getGenerationConfigurationAccess().getRootProjectNameFQNParserRuleCall_1_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Viewpoints__Owned_viewpointsAssignment_3_0
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getViewpointsAccess().getOwned_viewpointsViewpointCrossReference_3_0_0()); }
(
{ before(grammarAccess.getViewpointsAccess().getOwned_viewpointsViewpointIDTerminalRuleCall_3_0_0_1()); }
	RULE_ID{ after(grammarAccess.getViewpointsAccess().getOwned_viewpointsViewpointIDTerminalRuleCall_3_0_0_1()); }
)
{ after(grammarAccess.getViewpointsAccess().getOwned_viewpointsViewpointCrossReference_3_0_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Viewpoints__Owned_viewpointsAssignment_3_1_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getViewpointsAccess().getOwned_viewpointsViewpointCrossReference_3_1_1_0()); }
(
{ before(grammarAccess.getViewpointsAccess().getOwned_viewpointsViewpointIDTerminalRuleCall_3_1_1_0_1()); }
	RULE_ID{ after(grammarAccess.getViewpointsAccess().getOwned_viewpointsViewpointIDTerminalRuleCall_3_1_1_0_1()); }
)
{ after(grammarAccess.getViewpointsAccess().getOwned_viewpointsViewpointCrossReference_3_1_1_0()); }
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



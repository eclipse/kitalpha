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
grammar InternalVpbuild;

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
import org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.VpbuildGrammarAccess;

}

@parser::members {
 
 	private VpbuildGrammarAccess grammarAccess;
 	
    public void setGrammarAccess(VpbuildGrammarAccess grammarAccess) {
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




// Entry rule entryRuleBuild
entryRuleBuild 
:
{ before(grammarAccess.getBuildRule()); }
	 ruleBuild
{ after(grammarAccess.getBuildRule()); } 
	 EOF 
;

// Rule Build
ruleBuild
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getBuildAccess().getGroup()); }
(rule__Build__Group__0)
{ after(grammarAccess.getBuildAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleRepository
entryRuleRepository 
:
{ before(grammarAccess.getRepositoryRule()); }
	 ruleRepository
{ after(grammarAccess.getRepositoryRule()); } 
	 EOF 
;

// Rule Repository
ruleRepository
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getRepositoryAccess().getGroup()); }
(rule__Repository__Group__0)
{ after(grammarAccess.getRepositoryAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleSourceFoulder
entryRuleSourceFoulder 
:
{ before(grammarAccess.getSourceFoulderRule()); }
	 ruleSourceFoulder
{ after(grammarAccess.getSourceFoulderRule()); } 
	 EOF 
;

// Rule SourceFoulder
ruleSourceFoulder
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getSourceFoulderAccess().getGroup()); }
(rule__SourceFoulder__Group__0)
{ after(grammarAccess.getSourceFoulderAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleHudsonDeployment
entryRuleHudsonDeployment 
:
{ before(grammarAccess.getHudsonDeploymentRule()); }
	 ruleHudsonDeployment
{ after(grammarAccess.getHudsonDeploymentRule()); } 
	 EOF 
;

// Rule HudsonDeployment
ruleHudsonDeployment
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getHudsonDeploymentAccess().getGroup()); }
(rule__HudsonDeployment__Group__0)
{ after(grammarAccess.getHudsonDeploymentAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleGenerationLocation
entryRuleGenerationLocation 
:
{ before(grammarAccess.getGenerationLocationRule()); }
	 ruleGenerationLocation
{ after(grammarAccess.getGenerationLocationRule()); } 
	 EOF 
;

// Rule GenerationLocation
ruleGenerationLocation
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getGenerationLocationAccess().getGroup()); }
(rule__GenerationLocation__Group__0)
{ after(grammarAccess.getGenerationLocationAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleTrigger
entryRuleTrigger 
:
{ before(grammarAccess.getTriggerRule()); }
	 ruleTrigger
{ after(grammarAccess.getTriggerRule()); } 
	 EOF 
;

// Rule Trigger
ruleTrigger
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getTriggerAccess().getAlternatives()); }
(rule__Trigger__Alternatives)
{ after(grammarAccess.getTriggerAccess().getAlternatives()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleSCM
entryRuleSCM 
:
{ before(grammarAccess.getSCMRule()); }
	 ruleSCM
{ after(grammarAccess.getSCMRule()); } 
	 EOF 
;

// Rule SCM
ruleSCM
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getSCMAccess().getGroup()); }
(rule__SCM__Group__0)
{ after(grammarAccess.getSCMAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleCron
entryRuleCron 
:
{ before(grammarAccess.getCronRule()); }
	 ruleCron
{ after(grammarAccess.getCronRule()); } 
	 EOF 
;

// Rule Cron
ruleCron
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getCronAccess().getGroup()); }
(rule__Cron__Group__0)
{ after(grammarAccess.getCronAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleUser
entryRuleUser 
:
{ before(grammarAccess.getUserRule()); }
	 ruleUser
{ after(grammarAccess.getUserRule()); } 
	 EOF 
;

// Rule User
ruleUser
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getUserAccess().getGroup()); }
(rule__User__Group__0)
{ after(grammarAccess.getUserAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleFeature
entryRuleFeature 
:
{ before(grammarAccess.getFeatureRule()); }
	 ruleFeature
{ after(grammarAccess.getFeatureRule()); } 
	 EOF 
;

// Rule Feature
ruleFeature
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getFeatureAccess().getGroup()); }
(rule__Feature__Group__0)
{ after(grammarAccess.getFeatureAccess().getGroup()); }
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






// Rule ProtocolType
ruleProtocolType
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getProtocolTypeAccess().getAlternatives()); }
(rule__ProtocolType__Alternatives)
{ after(grammarAccess.getProtocolTypeAccess().getAlternatives()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Rule UserPermission
ruleUserPermission
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getUserPermissionAccess().getAlternatives()); }
(rule__UserPermission__Alternatives)
{ after(grammarAccess.getUserPermissionAccess().getAlternatives()); }
)

;
finally {
	restoreStackSize(stackSize);
}



rule__Trigger__Alternatives
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getTriggerAccess().getSCMParserRuleCall_0()); }
	ruleSCM
{ after(grammarAccess.getTriggerAccess().getSCMParserRuleCall_0()); }
)

    |(
{ before(grammarAccess.getTriggerAccess().getCronParserRuleCall_1()); }
	ruleCron
{ after(grammarAccess.getTriggerAccess().getCronParserRuleCall_1()); }
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

rule__ProtocolType__Alternatives
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getProtocolTypeAccess().getGitEnumLiteralDeclaration_0()); }
(	'git' 
)
{ after(grammarAccess.getProtocolTypeAccess().getGitEnumLiteralDeclaration_0()); }
)

    |(
{ before(grammarAccess.getProtocolTypeAccess().getSvnEnumLiteralDeclaration_1()); }
(	'svn://' 
)
{ after(grammarAccess.getProtocolTypeAccess().getSvnEnumLiteralDeclaration_1()); }
)

    |(
{ before(grammarAccess.getProtocolTypeAccess().getSvnsshEnumLiteralDeclaration_2()); }
(	'svn+ssh://' 
)
{ after(grammarAccess.getProtocolTypeAccess().getSvnsshEnumLiteralDeclaration_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__UserPermission__Alternatives
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getUserPermissionAccess().getWRITEEnumLiteralDeclaration_0()); }
(	'WRITE' 
)
{ after(grammarAccess.getUserPermissionAccess().getWRITEEnumLiteralDeclaration_0()); }
)

    |(
{ before(grammarAccess.getUserPermissionAccess().getEXECUTEEnumLiteralDeclaration_1()); }
(	'EXECUTE' 
)
{ after(grammarAccess.getUserPermissionAccess().getEXECUTEEnumLiteralDeclaration_1()); }
)

    |(
{ before(grammarAccess.getUserPermissionAccess().getREADEnumLiteralDeclaration_2()); }
(	'READ' 
)
{ after(grammarAccess.getUserPermissionAccess().getREADEnumLiteralDeclaration_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}



rule__Build__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Build__Group__0__Impl
	rule__Build__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Build__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getBuildAccess().getBuildAction_0()); }
(

)
{ after(grammarAccess.getBuildAccess().getBuildAction_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Build__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Build__Group__1__Impl
	rule__Build__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Build__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getBuildAccess().getBuildKeyword_1()); }

	'Build' 

{ after(grammarAccess.getBuildAccess().getBuildKeyword_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Build__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Build__Group__2__Impl
	rule__Build__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Build__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getBuildAccess().getNameAssignment_2()); }
(rule__Build__NameAssignment_2)
{ after(grammarAccess.getBuildAccess().getNameAssignment_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Build__Group__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Build__Group__3__Impl
	rule__Build__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__Build__Group__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getBuildAccess().getLeftCurlyBracketKeyword_3()); }

	'{' 

{ after(grammarAccess.getBuildAccess().getLeftCurlyBracketKeyword_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Build__Group__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Build__Group__4__Impl
	rule__Build__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__Build__Group__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getBuildAccess().getTargetPlatformKeyword_4()); }

	'target-platform:' 

{ after(grammarAccess.getBuildAccess().getTargetPlatformKeyword_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Build__Group__5
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Build__Group__5__Impl
	rule__Build__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__Build__Group__5__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getBuildAccess().getTarget_platformAssignment_5()); }
(rule__Build__Target_platformAssignment_5)
{ after(grammarAccess.getBuildAccess().getTarget_platformAssignment_5()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Build__Group__6
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Build__Group__6__Impl
	rule__Build__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__Build__Group__6__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getBuildAccess().getMapped_repositoriesAssignment_6()); }
(rule__Build__Mapped_repositoriesAssignment_6)*
{ after(grammarAccess.getBuildAccess().getMapped_repositoriesAssignment_6()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Build__Group__7
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Build__Group__7__Impl
	rule__Build__Group__8
;
finally {
	restoreStackSize(stackSize);
}

rule__Build__Group__7__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getBuildAccess().getHudsonDeploymentAssignment_7()); }
(rule__Build__HudsonDeploymentAssignment_7)?
{ after(grammarAccess.getBuildAccess().getHudsonDeploymentAssignment_7()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Build__Group__8
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Build__Group__8__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Build__Group__8__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getBuildAccess().getRightCurlyBracketKeyword_8()); }

	'}' 

{ after(grammarAccess.getBuildAccess().getRightCurlyBracketKeyword_8()); }
)

;
finally {
	restoreStackSize(stackSize);
}




















rule__Repository__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Repository__Group__0__Impl
	rule__Repository__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Repository__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getRepositoryAccess().getRepositoryAction_0()); }
(

)
{ after(grammarAccess.getRepositoryAccess().getRepositoryAction_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Repository__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Repository__Group__1__Impl
	rule__Repository__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Repository__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getRepositoryAccess().getRepositoryKeyword_1()); }

	'repository:' 

{ after(grammarAccess.getRepositoryAccess().getRepositoryKeyword_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Repository__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Repository__Group__2__Impl
	rule__Repository__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Repository__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getRepositoryAccess().getProtocolAssignment_2()); }
(rule__Repository__ProtocolAssignment_2)
{ after(grammarAccess.getRepositoryAccess().getProtocolAssignment_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Repository__Group__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Repository__Group__3__Impl
	rule__Repository__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__Repository__Group__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getRepositoryAccess().getLocationAssignment_3()); }
(rule__Repository__LocationAssignment_3)
{ after(grammarAccess.getRepositoryAccess().getLocationAssignment_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Repository__Group__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Repository__Group__4__Impl
	rule__Repository__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__Repository__Group__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getRepositoryAccess().getGroup_4()); }
(rule__Repository__Group_4__0)?
{ after(grammarAccess.getRepositoryAccess().getGroup_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Repository__Group__5
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Repository__Group__5__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Repository__Group__5__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getRepositoryAccess().getGroup_5()); }
(rule__Repository__Group_5__0)
{ after(grammarAccess.getRepositoryAccess().getGroup_5()); }
)

;
finally {
	restoreStackSize(stackSize);
}














rule__Repository__Group_4__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Repository__Group_4__0__Impl
	rule__Repository__Group_4__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Repository__Group_4__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getRepositoryAccess().getLeftCurlyBracketKeyword_4_0()); }

	'{' 

{ after(grammarAccess.getRepositoryAccess().getLeftCurlyBracketKeyword_4_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Repository__Group_4__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Repository__Group_4__1__Impl
	rule__Repository__Group_4__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Repository__Group_4__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getRepositoryAccess().getFoldersAssignment_4_1()); }
(rule__Repository__FoldersAssignment_4_1)*
{ after(grammarAccess.getRepositoryAccess().getFoldersAssignment_4_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Repository__Group_4__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Repository__Group_4__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Repository__Group_4__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getRepositoryAccess().getRightCurlyBracketKeyword_4_2()); }

	'}' 

{ after(grammarAccess.getRepositoryAccess().getRightCurlyBracketKeyword_4_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}








rule__Repository__Group_5__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Repository__Group_5__0__Impl
	rule__Repository__Group_5__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Repository__Group_5__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getRepositoryAccess().getFeaturesKeyword_5_0()); }

	'features:' 

{ after(grammarAccess.getRepositoryAccess().getFeaturesKeyword_5_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Repository__Group_5__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Repository__Group_5__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Repository__Group_5__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getRepositoryAccess().getFeaturesAssignment_5_1()); }
(rule__Repository__FeaturesAssignment_5_1)*
{ after(grammarAccess.getRepositoryAccess().getFeaturesAssignment_5_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__SourceFoulder__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__SourceFoulder__Group__0__Impl
	rule__SourceFoulder__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__SourceFoulder__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getSourceFoulderAccess().getSourceFolderAction_0()); }
(

)
{ after(grammarAccess.getSourceFoulderAccess().getSourceFolderAction_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__SourceFoulder__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__SourceFoulder__Group__1__Impl
	rule__SourceFoulder__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__SourceFoulder__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getSourceFoulderAccess().getFolderKeyword_1()); }

	'folder' 

{ after(grammarAccess.getSourceFoulderAccess().getFolderKeyword_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__SourceFoulder__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__SourceFoulder__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__SourceFoulder__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getSourceFoulderAccess().getNameAssignment_2()); }
(rule__SourceFoulder__NameAssignment_2)
{ after(grammarAccess.getSourceFoulderAccess().getNameAssignment_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}








rule__HudsonDeployment__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__HudsonDeployment__Group__0__Impl
	rule__HudsonDeployment__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__HudsonDeployment__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getHudsonDeploymentAccess().getHudsonDeploymentAction_0()); }
(

)
{ after(grammarAccess.getHudsonDeploymentAccess().getHudsonDeploymentAction_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__HudsonDeployment__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__HudsonDeployment__Group__1__Impl
	rule__HudsonDeployment__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__HudsonDeployment__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getHudsonDeploymentAccess().getHudsonDeploymentKeyword_1()); }

	'hudson-deployment' 

{ after(grammarAccess.getHudsonDeploymentAccess().getHudsonDeploymentKeyword_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__HudsonDeployment__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__HudsonDeployment__Group__2__Impl
	rule__HudsonDeployment__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__HudsonDeployment__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getHudsonDeploymentAccess().getLeftCurlyBracketKeyword_2()); }

	'{' 

{ after(grammarAccess.getHudsonDeploymentAccess().getLeftCurlyBracketKeyword_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__HudsonDeployment__Group__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__HudsonDeployment__Group__3__Impl
	rule__HudsonDeployment__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__HudsonDeployment__Group__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getHudsonDeploymentAccess().getGroup_3()); }
(rule__HudsonDeployment__Group_3__0)?
{ after(grammarAccess.getHudsonDeploymentAccess().getGroup_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__HudsonDeployment__Group__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__HudsonDeployment__Group__4__Impl
	rule__HudsonDeployment__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__HudsonDeployment__Group__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getHudsonDeploymentAccess().getGroup_4()); }
(rule__HudsonDeployment__Group_4__0)?
{ after(grammarAccess.getHudsonDeploymentAccess().getGroup_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__HudsonDeployment__Group__5
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__HudsonDeployment__Group__5__Impl
	rule__HudsonDeployment__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__HudsonDeployment__Group__5__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getHudsonDeploymentAccess().getGroup_5()); }
(rule__HudsonDeployment__Group_5__0)?
{ after(grammarAccess.getHudsonDeploymentAccess().getGroup_5()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__HudsonDeployment__Group__6
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__HudsonDeployment__Group__6__Impl
	rule__HudsonDeployment__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__HudsonDeployment__Group__6__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getHudsonDeploymentAccess().getGroup_6()); }
(rule__HudsonDeployment__Group_6__0)?
{ after(grammarAccess.getHudsonDeploymentAccess().getGroup_6()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__HudsonDeployment__Group__7
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__HudsonDeployment__Group__7__Impl
	rule__HudsonDeployment__Group__8
;
finally {
	restoreStackSize(stackSize);
}

rule__HudsonDeployment__Group__7__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getHudsonDeploymentAccess().getGroup_7()); }
(rule__HudsonDeployment__Group_7__0)?
{ after(grammarAccess.getHudsonDeploymentAccess().getGroup_7()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__HudsonDeployment__Group__8
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__HudsonDeployment__Group__8__Impl
	rule__HudsonDeployment__Group__9
;
finally {
	restoreStackSize(stackSize);
}

rule__HudsonDeployment__Group__8__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getHudsonDeploymentAccess().getGroup_8()); }
(rule__HudsonDeployment__Group_8__0)?
{ after(grammarAccess.getHudsonDeploymentAccess().getGroup_8()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__HudsonDeployment__Group__9
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__HudsonDeployment__Group__9__Impl
	rule__HudsonDeployment__Group__10
;
finally {
	restoreStackSize(stackSize);
}

rule__HudsonDeployment__Group__9__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getHudsonDeploymentAccess().getGroup_9()); }
(rule__HudsonDeployment__Group_9__0)?
{ after(grammarAccess.getHudsonDeploymentAccess().getGroup_9()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__HudsonDeployment__Group__10
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__HudsonDeployment__Group__10__Impl
	rule__HudsonDeployment__Group__11
;
finally {
	restoreStackSize(stackSize);
}

rule__HudsonDeployment__Group__10__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getHudsonDeploymentAccess().getGroup_10()); }
(rule__HudsonDeployment__Group_10__0)?
{ after(grammarAccess.getHudsonDeploymentAccess().getGroup_10()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__HudsonDeployment__Group__11
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__HudsonDeployment__Group__11__Impl
	rule__HudsonDeployment__Group__12
;
finally {
	restoreStackSize(stackSize);
}

rule__HudsonDeployment__Group__11__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getHudsonDeploymentAccess().getGroup_11()); }
(rule__HudsonDeployment__Group_11__0)?
{ after(grammarAccess.getHudsonDeploymentAccess().getGroup_11()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__HudsonDeployment__Group__12
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__HudsonDeployment__Group__12__Impl
	rule__HudsonDeployment__Group__13
;
finally {
	restoreStackSize(stackSize);
}

rule__HudsonDeployment__Group__12__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getHudsonDeploymentAccess().getGenerationLocationAssignment_12()); }
(rule__HudsonDeployment__GenerationLocationAssignment_12)?
{ after(grammarAccess.getHudsonDeploymentAccess().getGenerationLocationAssignment_12()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__HudsonDeployment__Group__13
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__HudsonDeployment__Group__13__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__HudsonDeployment__Group__13__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getHudsonDeploymentAccess().getRightCurlyBracketKeyword_13()); }

	'}' 

{ after(grammarAccess.getHudsonDeploymentAccess().getRightCurlyBracketKeyword_13()); }
)

;
finally {
	restoreStackSize(stackSize);
}






























rule__HudsonDeployment__Group_3__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__HudsonDeployment__Group_3__0__Impl
	rule__HudsonDeployment__Group_3__1
;
finally {
	restoreStackSize(stackSize);
}

rule__HudsonDeployment__Group_3__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getHudsonDeploymentAccess().getAntKeyword_3_0()); }

	'ant:' 

{ after(grammarAccess.getHudsonDeploymentAccess().getAntKeyword_3_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__HudsonDeployment__Group_3__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__HudsonDeployment__Group_3__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__HudsonDeployment__Group_3__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getHudsonDeploymentAccess().getAntNameAssignment_3_1()); }
(rule__HudsonDeployment__AntNameAssignment_3_1)
{ after(grammarAccess.getHudsonDeploymentAccess().getAntNameAssignment_3_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__HudsonDeployment__Group_4__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__HudsonDeployment__Group_4__0__Impl
	rule__HudsonDeployment__Group_4__1
;
finally {
	restoreStackSize(stackSize);
}

rule__HudsonDeployment__Group_4__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getHudsonDeploymentAccess().getAssignedNodeKeyword_4_0()); }

	'assigned-node:' 

{ after(grammarAccess.getHudsonDeploymentAccess().getAssignedNodeKeyword_4_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__HudsonDeployment__Group_4__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__HudsonDeployment__Group_4__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__HudsonDeployment__Group_4__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getHudsonDeploymentAccess().getAssignedNodeAssignment_4_1()); }
(rule__HudsonDeployment__AssignedNodeAssignment_4_1)
{ after(grammarAccess.getHudsonDeploymentAccess().getAssignedNodeAssignment_4_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__HudsonDeployment__Group_5__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__HudsonDeployment__Group_5__0__Impl
	rule__HudsonDeployment__Group_5__1
;
finally {
	restoreStackSize(stackSize);
}

rule__HudsonDeployment__Group_5__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getHudsonDeploymentAccess().getBuildIdKeyword_5_0()); }

	'build-id:' 

{ after(grammarAccess.getHudsonDeploymentAccess().getBuildIdKeyword_5_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__HudsonDeployment__Group_5__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__HudsonDeployment__Group_5__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__HudsonDeployment__Group_5__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getHudsonDeploymentAccess().getBuild_idAssignment_5_1()); }
(rule__HudsonDeployment__Build_idAssignment_5_1)
{ after(grammarAccess.getHudsonDeploymentAccess().getBuild_idAssignment_5_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__HudsonDeployment__Group_6__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__HudsonDeployment__Group_6__0__Impl
	rule__HudsonDeployment__Group_6__1
;
finally {
	restoreStackSize(stackSize);
}

rule__HudsonDeployment__Group_6__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getHudsonDeploymentAccess().getEnableKeyword_6_0()); }

	'enable:' 

{ after(grammarAccess.getHudsonDeploymentAccess().getEnableKeyword_6_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__HudsonDeployment__Group_6__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__HudsonDeployment__Group_6__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__HudsonDeployment__Group_6__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getHudsonDeploymentAccess().getEnabledAssignment_6_1()); }
(rule__HudsonDeployment__EnabledAssignment_6_1)
{ after(grammarAccess.getHudsonDeploymentAccess().getEnabledAssignment_6_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__HudsonDeployment__Group_7__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__HudsonDeployment__Group_7__0__Impl
	rule__HudsonDeployment__Group_7__1
;
finally {
	restoreStackSize(stackSize);
}

rule__HudsonDeployment__Group_7__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getHudsonDeploymentAccess().getJdkNameKeyword_7_0()); }

	'jdk-name:' 

{ after(grammarAccess.getHudsonDeploymentAccess().getJdkNameKeyword_7_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__HudsonDeployment__Group_7__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__HudsonDeployment__Group_7__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__HudsonDeployment__Group_7__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getHudsonDeploymentAccess().getJdkNameAssignment_7_1()); }
(rule__HudsonDeployment__JdkNameAssignment_7_1)
{ after(grammarAccess.getHudsonDeploymentAccess().getJdkNameAssignment_7_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__HudsonDeployment__Group_8__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__HudsonDeployment__Group_8__0__Impl
	rule__HudsonDeployment__Group_8__1
;
finally {
	restoreStackSize(stackSize);
}

rule__HudsonDeployment__Group_8__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getHudsonDeploymentAccess().getUserDeployJobNameKeyword_8_0()); }

	'user-deploy-job-name:' 

{ after(grammarAccess.getHudsonDeploymentAccess().getUserDeployJobNameKeyword_8_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__HudsonDeployment__Group_8__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__HudsonDeployment__Group_8__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__HudsonDeployment__Group_8__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getHudsonDeploymentAccess().getUserDeployJobNameAssignment_8_1()); }
(rule__HudsonDeployment__UserDeployJobNameAssignment_8_1)
{ after(grammarAccess.getHudsonDeploymentAccess().getUserDeployJobNameAssignment_8_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__HudsonDeployment__Group_9__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__HudsonDeployment__Group_9__0__Impl
	rule__HudsonDeployment__Group_9__1
;
finally {
	restoreStackSize(stackSize);
}

rule__HudsonDeployment__Group_9__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getHudsonDeploymentAccess().getUserDeployServerUrlKeyword_9_0()); }

	'user-deploy-server-url:' 

{ after(grammarAccess.getHudsonDeploymentAccess().getUserDeployServerUrlKeyword_9_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__HudsonDeployment__Group_9__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__HudsonDeployment__Group_9__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__HudsonDeployment__Group_9__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getHudsonDeploymentAccess().getUserDeployServerUrlAssignment_9_1()); }
(rule__HudsonDeployment__UserDeployServerUrlAssignment_9_1)
{ after(grammarAccess.getHudsonDeploymentAccess().getUserDeployServerUrlAssignment_9_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__HudsonDeployment__Group_10__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__HudsonDeployment__Group_10__0__Impl
	rule__HudsonDeployment__Group_10__1
;
finally {
	restoreStackSize(stackSize);
}

rule__HudsonDeployment__Group_10__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getHudsonDeploymentAccess().getUsersKeyword_10_0()); }

	'users' 

{ after(grammarAccess.getHudsonDeploymentAccess().getUsersKeyword_10_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__HudsonDeployment__Group_10__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__HudsonDeployment__Group_10__1__Impl
	rule__HudsonDeployment__Group_10__2
;
finally {
	restoreStackSize(stackSize);
}

rule__HudsonDeployment__Group_10__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getHudsonDeploymentAccess().getLeftCurlyBracketKeyword_10_1()); }

	'{' 

{ after(grammarAccess.getHudsonDeploymentAccess().getLeftCurlyBracketKeyword_10_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__HudsonDeployment__Group_10__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__HudsonDeployment__Group_10__2__Impl
	rule__HudsonDeployment__Group_10__3
;
finally {
	restoreStackSize(stackSize);
}

rule__HudsonDeployment__Group_10__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getHudsonDeploymentAccess().getUsersAssignment_10_2()); }
(rule__HudsonDeployment__UsersAssignment_10_2)*
{ after(grammarAccess.getHudsonDeploymentAccess().getUsersAssignment_10_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__HudsonDeployment__Group_10__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__HudsonDeployment__Group_10__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__HudsonDeployment__Group_10__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getHudsonDeploymentAccess().getRightCurlyBracketKeyword_10_3()); }

	'}' 

{ after(grammarAccess.getHudsonDeploymentAccess().getRightCurlyBracketKeyword_10_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}










rule__HudsonDeployment__Group_11__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__HudsonDeployment__Group_11__0__Impl
	rule__HudsonDeployment__Group_11__1
;
finally {
	restoreStackSize(stackSize);
}

rule__HudsonDeployment__Group_11__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getHudsonDeploymentAccess().getTriggersKeyword_11_0()); }

	'triggers' 

{ after(grammarAccess.getHudsonDeploymentAccess().getTriggersKeyword_11_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__HudsonDeployment__Group_11__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__HudsonDeployment__Group_11__1__Impl
	rule__HudsonDeployment__Group_11__2
;
finally {
	restoreStackSize(stackSize);
}

rule__HudsonDeployment__Group_11__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getHudsonDeploymentAccess().getLeftCurlyBracketKeyword_11_1()); }

	'{' 

{ after(grammarAccess.getHudsonDeploymentAccess().getLeftCurlyBracketKeyword_11_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__HudsonDeployment__Group_11__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__HudsonDeployment__Group_11__2__Impl
	rule__HudsonDeployment__Group_11__3
;
finally {
	restoreStackSize(stackSize);
}

rule__HudsonDeployment__Group_11__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getHudsonDeploymentAccess().getTriggersAssignment_11_2()); }
(rule__HudsonDeployment__TriggersAssignment_11_2)*
{ after(grammarAccess.getHudsonDeploymentAccess().getTriggersAssignment_11_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__HudsonDeployment__Group_11__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__HudsonDeployment__Group_11__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__HudsonDeployment__Group_11__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getHudsonDeploymentAccess().getRightCurlyBracketKeyword_11_3()); }

	'}' 

{ after(grammarAccess.getHudsonDeploymentAccess().getRightCurlyBracketKeyword_11_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}










rule__GenerationLocation__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__GenerationLocation__Group__0__Impl
	rule__GenerationLocation__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GenerationLocation__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getGenerationLocationAccess().getGenerationLocationAction_0()); }
(

)
{ after(grammarAccess.getGenerationLocationAccess().getGenerationLocationAction_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__GenerationLocation__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__GenerationLocation__Group__1__Impl
	rule__GenerationLocation__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__GenerationLocation__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getGenerationLocationAccess().getGenerationLocationKeyword_1()); }

	'generation-location:' 

{ after(grammarAccess.getGenerationLocationAccess().getGenerationLocationKeyword_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__GenerationLocation__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__GenerationLocation__Group__2__Impl
	rule__GenerationLocation__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__GenerationLocation__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getGenerationLocationAccess().getFolderAssignment_2()); }
(rule__GenerationLocation__FolderAssignment_2)
{ after(grammarAccess.getGenerationLocationAccess().getFolderAssignment_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__GenerationLocation__Group__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__GenerationLocation__Group__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GenerationLocation__Group__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getGenerationLocationAccess().getGroup_3()); }
(rule__GenerationLocation__Group_3__0)?
{ after(grammarAccess.getGenerationLocationAccess().getGroup_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}










rule__GenerationLocation__Group_3__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__GenerationLocation__Group_3__0__Impl
	rule__GenerationLocation__Group_3__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GenerationLocation__Group_3__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getGenerationLocationAccess().getUrlKeyword_3_0()); }

	'url:' 

{ after(grammarAccess.getGenerationLocationAccess().getUrlKeyword_3_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__GenerationLocation__Group_3__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__GenerationLocation__Group_3__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GenerationLocation__Group_3__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getGenerationLocationAccess().getUrlAssignment_3_1()); }
(rule__GenerationLocation__UrlAssignment_3_1)
{ after(grammarAccess.getGenerationLocationAccess().getUrlAssignment_3_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__SCM__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__SCM__Group__0__Impl
	rule__SCM__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__SCM__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getSCMAccess().getSCMAction_0()); }
(

)
{ after(grammarAccess.getSCMAccess().getSCMAction_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__SCM__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__SCM__Group__1__Impl
	rule__SCM__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__SCM__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getSCMAccess().getSCMKeyword_1()); }

	'SCM' 

{ after(grammarAccess.getSCMAccess().getSCMKeyword_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__SCM__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__SCM__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__SCM__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getSCMAccess().getPlanningAssignment_2()); }
(rule__SCM__PlanningAssignment_2)
{ after(grammarAccess.getSCMAccess().getPlanningAssignment_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}








rule__Cron__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Cron__Group__0__Impl
	rule__Cron__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Cron__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getCronAccess().getCronAction_0()); }
(

)
{ after(grammarAccess.getCronAccess().getCronAction_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Cron__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Cron__Group__1__Impl
	rule__Cron__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Cron__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getCronAccess().getCronKeyword_1()); }

	'Cron' 

{ after(grammarAccess.getCronAccess().getCronKeyword_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Cron__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Cron__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Cron__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getCronAccess().getPlanningAssignment_2()); }
(rule__Cron__PlanningAssignment_2)
{ after(grammarAccess.getCronAccess().getPlanningAssignment_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}








rule__User__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__User__Group__0__Impl
	rule__User__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__User__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getUserAccess().getUserAction_0()); }
(

)
{ after(grammarAccess.getUserAccess().getUserAction_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__User__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__User__Group__1__Impl
	rule__User__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__User__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getUserAccess().getLoginKeyword_1()); }

	'login:' 

{ after(grammarAccess.getUserAccess().getLoginKeyword_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__User__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__User__Group__2__Impl
	rule__User__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__User__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getUserAccess().getLoginAssignment_2()); }
(rule__User__LoginAssignment_2)
{ after(grammarAccess.getUserAccess().getLoginAssignment_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__User__Group__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__User__Group__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__User__Group__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getUserAccess().getGroup_3()); }
(rule__User__Group_3__0)?
{ after(grammarAccess.getUserAccess().getGroup_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}










rule__User__Group_3__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__User__Group_3__0__Impl
	rule__User__Group_3__1
;
finally {
	restoreStackSize(stackSize);
}

rule__User__Group_3__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getUserAccess().getPermissionKeyword_3_0()); }

	'permission:' 

{ after(grammarAccess.getUserAccess().getPermissionKeyword_3_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__User__Group_3__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__User__Group_3__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__User__Group_3__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getUserAccess().getPermissionAssignment_3_1()); }
(rule__User__PermissionAssignment_3_1)
{ after(grammarAccess.getUserAccess().getPermissionAssignment_3_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__Feature__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Feature__Group__0__Impl
	rule__Feature__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Feature__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getFeatureAccess().getFeatureAction_0()); }
(

)
{ after(grammarAccess.getFeatureAccess().getFeatureAction_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Feature__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Feature__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Feature__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getFeatureAccess().getNameAssignment_1()); }
(rule__Feature__NameAssignment_1)
{ after(grammarAccess.getFeatureAccess().getNameAssignment_1()); }
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







rule__Build__NameAssignment_2
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getBuildAccess().getNameFQNParserRuleCall_2_0()); }
	ruleFQN{ after(grammarAccess.getBuildAccess().getNameFQNParserRuleCall_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Build__Target_platformAssignment_5
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getBuildAccess().getTarget_platformSTRINGTerminalRuleCall_5_0()); }
	RULE_STRING{ after(grammarAccess.getBuildAccess().getTarget_platformSTRINGTerminalRuleCall_5_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Build__Mapped_repositoriesAssignment_6
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getBuildAccess().getMapped_repositoriesRepositoryParserRuleCall_6_0()); }
	ruleRepository{ after(grammarAccess.getBuildAccess().getMapped_repositoriesRepositoryParserRuleCall_6_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Build__HudsonDeploymentAssignment_7
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getBuildAccess().getHudsonDeploymentHudsonDeploymentParserRuleCall_7_0()); }
	ruleHudsonDeployment{ after(grammarAccess.getBuildAccess().getHudsonDeploymentHudsonDeploymentParserRuleCall_7_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Repository__ProtocolAssignment_2
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getRepositoryAccess().getProtocolProtocolTypeEnumRuleCall_2_0()); }
	ruleProtocolType{ after(grammarAccess.getRepositoryAccess().getProtocolProtocolTypeEnumRuleCall_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Repository__LocationAssignment_3
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getRepositoryAccess().getLocationSTRINGTerminalRuleCall_3_0()); }
	RULE_STRING{ after(grammarAccess.getRepositoryAccess().getLocationSTRINGTerminalRuleCall_3_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Repository__FoldersAssignment_4_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getRepositoryAccess().getFoldersSourceFoulderParserRuleCall_4_1_0()); }
	ruleSourceFoulder{ after(grammarAccess.getRepositoryAccess().getFoldersSourceFoulderParserRuleCall_4_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Repository__FeaturesAssignment_5_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getRepositoryAccess().getFeaturesFeatureParserRuleCall_5_1_0()); }
	ruleFeature{ after(grammarAccess.getRepositoryAccess().getFeaturesFeatureParserRuleCall_5_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__SourceFoulder__NameAssignment_2
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getSourceFoulderAccess().getNameSTRINGTerminalRuleCall_2_0()); }
	RULE_STRING{ after(grammarAccess.getSourceFoulderAccess().getNameSTRINGTerminalRuleCall_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__HudsonDeployment__AntNameAssignment_3_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getHudsonDeploymentAccess().getAntNameSTRINGTerminalRuleCall_3_1_0()); }
	RULE_STRING{ after(grammarAccess.getHudsonDeploymentAccess().getAntNameSTRINGTerminalRuleCall_3_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__HudsonDeployment__AssignedNodeAssignment_4_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getHudsonDeploymentAccess().getAssignedNodeSTRINGTerminalRuleCall_4_1_0()); }
	RULE_STRING{ after(grammarAccess.getHudsonDeploymentAccess().getAssignedNodeSTRINGTerminalRuleCall_4_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__HudsonDeployment__Build_idAssignment_5_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getHudsonDeploymentAccess().getBuild_idSTRINGTerminalRuleCall_5_1_0()); }
	RULE_STRING{ after(grammarAccess.getHudsonDeploymentAccess().getBuild_idSTRINGTerminalRuleCall_5_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__HudsonDeployment__EnabledAssignment_6_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getHudsonDeploymentAccess().getEnabledEBooleanParserRuleCall_6_1_0()); }
	ruleEBoolean{ after(grammarAccess.getHudsonDeploymentAccess().getEnabledEBooleanParserRuleCall_6_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__HudsonDeployment__JdkNameAssignment_7_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getHudsonDeploymentAccess().getJdkNameSTRINGTerminalRuleCall_7_1_0()); }
	RULE_STRING{ after(grammarAccess.getHudsonDeploymentAccess().getJdkNameSTRINGTerminalRuleCall_7_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__HudsonDeployment__UserDeployJobNameAssignment_8_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getHudsonDeploymentAccess().getUserDeployJobNameSTRINGTerminalRuleCall_8_1_0()); }
	RULE_STRING{ after(grammarAccess.getHudsonDeploymentAccess().getUserDeployJobNameSTRINGTerminalRuleCall_8_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__HudsonDeployment__UserDeployServerUrlAssignment_9_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getHudsonDeploymentAccess().getUserDeployServerUrlSTRINGTerminalRuleCall_9_1_0()); }
	RULE_STRING{ after(grammarAccess.getHudsonDeploymentAccess().getUserDeployServerUrlSTRINGTerminalRuleCall_9_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__HudsonDeployment__UsersAssignment_10_2
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getHudsonDeploymentAccess().getUsersUserParserRuleCall_10_2_0()); }
	ruleUser{ after(grammarAccess.getHudsonDeploymentAccess().getUsersUserParserRuleCall_10_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__HudsonDeployment__TriggersAssignment_11_2
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getHudsonDeploymentAccess().getTriggersTriggerParserRuleCall_11_2_0()); }
	ruleTrigger{ after(grammarAccess.getHudsonDeploymentAccess().getTriggersTriggerParserRuleCall_11_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__HudsonDeployment__GenerationLocationAssignment_12
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getHudsonDeploymentAccess().getGenerationLocationGenerationLocationParserRuleCall_12_0()); }
	ruleGenerationLocation{ after(grammarAccess.getHudsonDeploymentAccess().getGenerationLocationGenerationLocationParserRuleCall_12_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__GenerationLocation__FolderAssignment_2
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getGenerationLocationAccess().getFolderSTRINGTerminalRuleCall_2_0()); }
	RULE_STRING{ after(grammarAccess.getGenerationLocationAccess().getFolderSTRINGTerminalRuleCall_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__GenerationLocation__UrlAssignment_3_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getGenerationLocationAccess().getUrlSTRINGTerminalRuleCall_3_1_0()); }
	RULE_STRING{ after(grammarAccess.getGenerationLocationAccess().getUrlSTRINGTerminalRuleCall_3_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__SCM__PlanningAssignment_2
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getSCMAccess().getPlanningSTRINGTerminalRuleCall_2_0()); }
	RULE_STRING{ after(grammarAccess.getSCMAccess().getPlanningSTRINGTerminalRuleCall_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Cron__PlanningAssignment_2
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getCronAccess().getPlanningSTRINGTerminalRuleCall_2_0()); }
	RULE_STRING{ after(grammarAccess.getCronAccess().getPlanningSTRINGTerminalRuleCall_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__User__LoginAssignment_2
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getUserAccess().getLoginSTRINGTerminalRuleCall_2_0()); }
	RULE_STRING{ after(grammarAccess.getUserAccess().getLoginSTRINGTerminalRuleCall_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__User__PermissionAssignment_3_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getUserAccess().getPermissionUserPermissionEnumRuleCall_3_1_0()); }
	ruleUserPermission{ after(grammarAccess.getUserAccess().getPermissionUserPermissionEnumRuleCall_3_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Feature__NameAssignment_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getFeatureAccess().getNameFQNParserRuleCall_1_0()); }
	ruleFQN{ after(grammarAccess.getFeatureAccess().getNameFQNParserRuleCall_1_0()); }
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



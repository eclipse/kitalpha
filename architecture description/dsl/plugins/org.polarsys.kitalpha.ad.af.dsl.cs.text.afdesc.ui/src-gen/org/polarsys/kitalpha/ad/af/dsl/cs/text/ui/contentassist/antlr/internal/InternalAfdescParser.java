/*******************************************************************************
 * Copyright (c) 2014 Thales Global Services S.A.S.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *  Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/
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



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalAfdescParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'ArchitectureFramework'", "'{'", "'}'", "'description:'", "'shortName:'", "'Configuration'", "','", "'rootProjectName:'", "'Viewpoints'", "'.'"
    };
    public static final int RULE_ID=4;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__20=20;
    public static final int EOF=-1;
    public static final int RULE_SL_COMMENT=8;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__19=19;
    public static final int RULE_STRING=5;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__11=11;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_INT=6;
    public static final int RULE_WS=9;

    // delegates
    // delegators


        public InternalAfdescParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalAfdescParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalAfdescParser.tokenNames; }
    public String getGrammarFileName() { return "../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g"; }


     
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




    // $ANTLR start "entryRuleNamedElement"
    // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:61:1: entryRuleNamedElement : ruleNamedElement EOF ;
    public final void entryRuleNamedElement() throws RecognitionException {
        try {
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:62:1: ( ruleNamedElement EOF )
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:63:1: ruleNamedElement EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNamedElementRule()); 
            }
            pushFollow(FOLLOW_ruleNamedElement_in_entryRuleNamedElement67);
            ruleNamedElement();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNamedElementRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNamedElement74); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleNamedElement"


    // $ANTLR start "ruleNamedElement"
    // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:70:1: ruleNamedElement : ( ruleArchitectureFramework ) ;
    public final void ruleNamedElement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:74:2: ( ( ruleArchitectureFramework ) )
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:75:1: ( ruleArchitectureFramework )
            {
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:75:1: ( ruleArchitectureFramework )
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:76:1: ruleArchitectureFramework
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNamedElementAccess().getArchitectureFrameworkParserRuleCall()); 
            }
            pushFollow(FOLLOW_ruleArchitectureFramework_in_ruleNamedElement100);
            ruleArchitectureFramework();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNamedElementAccess().getArchitectureFrameworkParserRuleCall()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNamedElement"


    // $ANTLR start "entryRuleArchitectureFramework"
    // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:89:1: entryRuleArchitectureFramework : ruleArchitectureFramework EOF ;
    public final void entryRuleArchitectureFramework() throws RecognitionException {
        try {
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:90:1: ( ruleArchitectureFramework EOF )
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:91:1: ruleArchitectureFramework EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArchitectureFrameworkRule()); 
            }
            pushFollow(FOLLOW_ruleArchitectureFramework_in_entryRuleArchitectureFramework126);
            ruleArchitectureFramework();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getArchitectureFrameworkRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleArchitectureFramework133); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleArchitectureFramework"


    // $ANTLR start "ruleArchitectureFramework"
    // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:98:1: ruleArchitectureFramework : ( ( rule__ArchitectureFramework__Group__0 ) ) ;
    public final void ruleArchitectureFramework() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:102:2: ( ( ( rule__ArchitectureFramework__Group__0 ) ) )
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:103:1: ( ( rule__ArchitectureFramework__Group__0 ) )
            {
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:103:1: ( ( rule__ArchitectureFramework__Group__0 ) )
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:104:1: ( rule__ArchitectureFramework__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArchitectureFrameworkAccess().getGroup()); 
            }
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:105:1: ( rule__ArchitectureFramework__Group__0 )
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:105:2: rule__ArchitectureFramework__Group__0
            {
            pushFollow(FOLLOW_rule__ArchitectureFramework__Group__0_in_ruleArchitectureFramework159);
            rule__ArchitectureFramework__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getArchitectureFrameworkAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleArchitectureFramework"


    // $ANTLR start "entryRuleConfiguration"
    // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:117:1: entryRuleConfiguration : ruleConfiguration EOF ;
    public final void entryRuleConfiguration() throws RecognitionException {
        try {
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:118:1: ( ruleConfiguration EOF )
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:119:1: ruleConfiguration EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConfigurationRule()); 
            }
            pushFollow(FOLLOW_ruleConfiguration_in_entryRuleConfiguration186);
            ruleConfiguration();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConfigurationRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleConfiguration193); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleConfiguration"


    // $ANTLR start "ruleConfiguration"
    // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:126:1: ruleConfiguration : ( ( rule__Configuration__Group__0 ) ) ;
    public final void ruleConfiguration() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:130:2: ( ( ( rule__Configuration__Group__0 ) ) )
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:131:1: ( ( rule__Configuration__Group__0 ) )
            {
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:131:1: ( ( rule__Configuration__Group__0 ) )
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:132:1: ( rule__Configuration__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConfigurationAccess().getGroup()); 
            }
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:133:1: ( rule__Configuration__Group__0 )
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:133:2: rule__Configuration__Group__0
            {
            pushFollow(FOLLOW_rule__Configuration__Group__0_in_ruleConfiguration219);
            rule__Configuration__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getConfigurationAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleConfiguration"


    // $ANTLR start "entryRuleConfigurationElement"
    // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:145:1: entryRuleConfigurationElement : ruleConfigurationElement EOF ;
    public final void entryRuleConfigurationElement() throws RecognitionException {
        try {
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:146:1: ( ruleConfigurationElement EOF )
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:147:1: ruleConfigurationElement EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConfigurationElementRule()); 
            }
            pushFollow(FOLLOW_ruleConfigurationElement_in_entryRuleConfigurationElement246);
            ruleConfigurationElement();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConfigurationElementRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleConfigurationElement253); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleConfigurationElement"


    // $ANTLR start "ruleConfigurationElement"
    // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:154:1: ruleConfigurationElement : ( ruleGenerationConfiguration ) ;
    public final void ruleConfigurationElement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:158:2: ( ( ruleGenerationConfiguration ) )
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:159:1: ( ruleGenerationConfiguration )
            {
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:159:1: ( ruleGenerationConfiguration )
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:160:1: ruleGenerationConfiguration
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConfigurationElementAccess().getGenerationConfigurationParserRuleCall()); 
            }
            pushFollow(FOLLOW_ruleGenerationConfiguration_in_ruleConfigurationElement279);
            ruleGenerationConfiguration();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConfigurationElementAccess().getGenerationConfigurationParserRuleCall()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleConfigurationElement"


    // $ANTLR start "entryRuleGenerationConfiguration"
    // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:173:1: entryRuleGenerationConfiguration : ruleGenerationConfiguration EOF ;
    public final void entryRuleGenerationConfiguration() throws RecognitionException {
        try {
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:174:1: ( ruleGenerationConfiguration EOF )
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:175:1: ruleGenerationConfiguration EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGenerationConfigurationRule()); 
            }
            pushFollow(FOLLOW_ruleGenerationConfiguration_in_entryRuleGenerationConfiguration305);
            ruleGenerationConfiguration();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGenerationConfigurationRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleGenerationConfiguration312); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleGenerationConfiguration"


    // $ANTLR start "ruleGenerationConfiguration"
    // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:182:1: ruleGenerationConfiguration : ( ( rule__GenerationConfiguration__Group__0 ) ) ;
    public final void ruleGenerationConfiguration() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:186:2: ( ( ( rule__GenerationConfiguration__Group__0 ) ) )
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:187:1: ( ( rule__GenerationConfiguration__Group__0 ) )
            {
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:187:1: ( ( rule__GenerationConfiguration__Group__0 ) )
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:188:1: ( rule__GenerationConfiguration__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGenerationConfigurationAccess().getGroup()); 
            }
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:189:1: ( rule__GenerationConfiguration__Group__0 )
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:189:2: rule__GenerationConfiguration__Group__0
            {
            pushFollow(FOLLOW_rule__GenerationConfiguration__Group__0_in_ruleGenerationConfiguration338);
            rule__GenerationConfiguration__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGenerationConfigurationAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGenerationConfiguration"


    // $ANTLR start "entryRuleViewpoints"
    // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:201:1: entryRuleViewpoints : ruleViewpoints EOF ;
    public final void entryRuleViewpoints() throws RecognitionException {
        try {
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:202:1: ( ruleViewpoints EOF )
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:203:1: ruleViewpoints EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getViewpointsRule()); 
            }
            pushFollow(FOLLOW_ruleViewpoints_in_entryRuleViewpoints365);
            ruleViewpoints();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getViewpointsRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleViewpoints372); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleViewpoints"


    // $ANTLR start "ruleViewpoints"
    // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:210:1: ruleViewpoints : ( ( rule__Viewpoints__Group__0 ) ) ;
    public final void ruleViewpoints() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:214:2: ( ( ( rule__Viewpoints__Group__0 ) ) )
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:215:1: ( ( rule__Viewpoints__Group__0 ) )
            {
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:215:1: ( ( rule__Viewpoints__Group__0 ) )
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:216:1: ( rule__Viewpoints__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getViewpointsAccess().getGroup()); 
            }
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:217:1: ( rule__Viewpoints__Group__0 )
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:217:2: rule__Viewpoints__Group__0
            {
            pushFollow(FOLLOW_rule__Viewpoints__Group__0_in_ruleViewpoints398);
            rule__Viewpoints__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getViewpointsAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleViewpoints"


    // $ANTLR start "entryRuleFQN"
    // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:229:1: entryRuleFQN : ruleFQN EOF ;
    public final void entryRuleFQN() throws RecognitionException {
        try {
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:230:1: ( ruleFQN EOF )
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:231:1: ruleFQN EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFQNRule()); 
            }
            pushFollow(FOLLOW_ruleFQN_in_entryRuleFQN425);
            ruleFQN();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFQNRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFQN432); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFQN"


    // $ANTLR start "ruleFQN"
    // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:238:1: ruleFQN : ( ( rule__FQN__Group__0 ) ) ;
    public final void ruleFQN() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:242:2: ( ( ( rule__FQN__Group__0 ) ) )
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:243:1: ( ( rule__FQN__Group__0 ) )
            {
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:243:1: ( ( rule__FQN__Group__0 ) )
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:244:1: ( rule__FQN__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFQNAccess().getGroup()); 
            }
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:245:1: ( rule__FQN__Group__0 )
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:245:2: rule__FQN__Group__0
            {
            pushFollow(FOLLOW_rule__FQN__Group__0_in_ruleFQN458);
            rule__FQN__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFQNAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFQN"


    // $ANTLR start "rule__ArchitectureFramework__Group__0"
    // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:259:1: rule__ArchitectureFramework__Group__0 : rule__ArchitectureFramework__Group__0__Impl rule__ArchitectureFramework__Group__1 ;
    public final void rule__ArchitectureFramework__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:263:1: ( rule__ArchitectureFramework__Group__0__Impl rule__ArchitectureFramework__Group__1 )
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:264:2: rule__ArchitectureFramework__Group__0__Impl rule__ArchitectureFramework__Group__1
            {
            pushFollow(FOLLOW_rule__ArchitectureFramework__Group__0__Impl_in_rule__ArchitectureFramework__Group__0492);
            rule__ArchitectureFramework__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ArchitectureFramework__Group__1_in_rule__ArchitectureFramework__Group__0495);
            rule__ArchitectureFramework__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArchitectureFramework__Group__0"


    // $ANTLR start "rule__ArchitectureFramework__Group__0__Impl"
    // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:271:1: rule__ArchitectureFramework__Group__0__Impl : ( () ) ;
    public final void rule__ArchitectureFramework__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:275:1: ( ( () ) )
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:276:1: ( () )
            {
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:276:1: ( () )
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:277:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArchitectureFrameworkAccess().getArchitectureFrameworkAction_0()); 
            }
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:278:1: ()
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:280:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getArchitectureFrameworkAccess().getArchitectureFrameworkAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArchitectureFramework__Group__0__Impl"


    // $ANTLR start "rule__ArchitectureFramework__Group__1"
    // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:290:1: rule__ArchitectureFramework__Group__1 : rule__ArchitectureFramework__Group__1__Impl rule__ArchitectureFramework__Group__2 ;
    public final void rule__ArchitectureFramework__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:294:1: ( rule__ArchitectureFramework__Group__1__Impl rule__ArchitectureFramework__Group__2 )
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:295:2: rule__ArchitectureFramework__Group__1__Impl rule__ArchitectureFramework__Group__2
            {
            pushFollow(FOLLOW_rule__ArchitectureFramework__Group__1__Impl_in_rule__ArchitectureFramework__Group__1553);
            rule__ArchitectureFramework__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ArchitectureFramework__Group__2_in_rule__ArchitectureFramework__Group__1556);
            rule__ArchitectureFramework__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArchitectureFramework__Group__1"


    // $ANTLR start "rule__ArchitectureFramework__Group__1__Impl"
    // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:302:1: rule__ArchitectureFramework__Group__1__Impl : ( 'ArchitectureFramework' ) ;
    public final void rule__ArchitectureFramework__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:306:1: ( ( 'ArchitectureFramework' ) )
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:307:1: ( 'ArchitectureFramework' )
            {
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:307:1: ( 'ArchitectureFramework' )
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:308:1: 'ArchitectureFramework'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArchitectureFrameworkAccess().getArchitectureFrameworkKeyword_1()); 
            }
            match(input,11,FOLLOW_11_in_rule__ArchitectureFramework__Group__1__Impl584); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getArchitectureFrameworkAccess().getArchitectureFrameworkKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArchitectureFramework__Group__1__Impl"


    // $ANTLR start "rule__ArchitectureFramework__Group__2"
    // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:321:1: rule__ArchitectureFramework__Group__2 : rule__ArchitectureFramework__Group__2__Impl rule__ArchitectureFramework__Group__3 ;
    public final void rule__ArchitectureFramework__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:325:1: ( rule__ArchitectureFramework__Group__2__Impl rule__ArchitectureFramework__Group__3 )
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:326:2: rule__ArchitectureFramework__Group__2__Impl rule__ArchitectureFramework__Group__3
            {
            pushFollow(FOLLOW_rule__ArchitectureFramework__Group__2__Impl_in_rule__ArchitectureFramework__Group__2615);
            rule__ArchitectureFramework__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ArchitectureFramework__Group__3_in_rule__ArchitectureFramework__Group__2618);
            rule__ArchitectureFramework__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArchitectureFramework__Group__2"


    // $ANTLR start "rule__ArchitectureFramework__Group__2__Impl"
    // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:333:1: rule__ArchitectureFramework__Group__2__Impl : ( ( rule__ArchitectureFramework__NameAssignment_2 )? ) ;
    public final void rule__ArchitectureFramework__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:337:1: ( ( ( rule__ArchitectureFramework__NameAssignment_2 )? ) )
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:338:1: ( ( rule__ArchitectureFramework__NameAssignment_2 )? )
            {
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:338:1: ( ( rule__ArchitectureFramework__NameAssignment_2 )? )
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:339:1: ( rule__ArchitectureFramework__NameAssignment_2 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArchitectureFrameworkAccess().getNameAssignment_2()); 
            }
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:340:1: ( rule__ArchitectureFramework__NameAssignment_2 )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==RULE_ID) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:340:2: rule__ArchitectureFramework__NameAssignment_2
                    {
                    pushFollow(FOLLOW_rule__ArchitectureFramework__NameAssignment_2_in_rule__ArchitectureFramework__Group__2__Impl645);
                    rule__ArchitectureFramework__NameAssignment_2();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getArchitectureFrameworkAccess().getNameAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArchitectureFramework__Group__2__Impl"


    // $ANTLR start "rule__ArchitectureFramework__Group__3"
    // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:350:1: rule__ArchitectureFramework__Group__3 : rule__ArchitectureFramework__Group__3__Impl rule__ArchitectureFramework__Group__4 ;
    public final void rule__ArchitectureFramework__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:354:1: ( rule__ArchitectureFramework__Group__3__Impl rule__ArchitectureFramework__Group__4 )
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:355:2: rule__ArchitectureFramework__Group__3__Impl rule__ArchitectureFramework__Group__4
            {
            pushFollow(FOLLOW_rule__ArchitectureFramework__Group__3__Impl_in_rule__ArchitectureFramework__Group__3676);
            rule__ArchitectureFramework__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ArchitectureFramework__Group__4_in_rule__ArchitectureFramework__Group__3679);
            rule__ArchitectureFramework__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArchitectureFramework__Group__3"


    // $ANTLR start "rule__ArchitectureFramework__Group__3__Impl"
    // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:362:1: rule__ArchitectureFramework__Group__3__Impl : ( '{' ) ;
    public final void rule__ArchitectureFramework__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:366:1: ( ( '{' ) )
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:367:1: ( '{' )
            {
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:367:1: ( '{' )
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:368:1: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArchitectureFrameworkAccess().getLeftCurlyBracketKeyword_3()); 
            }
            match(input,12,FOLLOW_12_in_rule__ArchitectureFramework__Group__3__Impl707); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getArchitectureFrameworkAccess().getLeftCurlyBracketKeyword_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArchitectureFramework__Group__3__Impl"


    // $ANTLR start "rule__ArchitectureFramework__Group__4"
    // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:381:1: rule__ArchitectureFramework__Group__4 : rule__ArchitectureFramework__Group__4__Impl rule__ArchitectureFramework__Group__5 ;
    public final void rule__ArchitectureFramework__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:385:1: ( rule__ArchitectureFramework__Group__4__Impl rule__ArchitectureFramework__Group__5 )
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:386:2: rule__ArchitectureFramework__Group__4__Impl rule__ArchitectureFramework__Group__5
            {
            pushFollow(FOLLOW_rule__ArchitectureFramework__Group__4__Impl_in_rule__ArchitectureFramework__Group__4738);
            rule__ArchitectureFramework__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ArchitectureFramework__Group__5_in_rule__ArchitectureFramework__Group__4741);
            rule__ArchitectureFramework__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArchitectureFramework__Group__4"


    // $ANTLR start "rule__ArchitectureFramework__Group__4__Impl"
    // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:393:1: rule__ArchitectureFramework__Group__4__Impl : ( ( rule__ArchitectureFramework__Group_4__0 )? ) ;
    public final void rule__ArchitectureFramework__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:397:1: ( ( ( rule__ArchitectureFramework__Group_4__0 )? ) )
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:398:1: ( ( rule__ArchitectureFramework__Group_4__0 )? )
            {
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:398:1: ( ( rule__ArchitectureFramework__Group_4__0 )? )
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:399:1: ( rule__ArchitectureFramework__Group_4__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArchitectureFrameworkAccess().getGroup_4()); 
            }
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:400:1: ( rule__ArchitectureFramework__Group_4__0 )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==14) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:400:2: rule__ArchitectureFramework__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__ArchitectureFramework__Group_4__0_in_rule__ArchitectureFramework__Group__4__Impl768);
                    rule__ArchitectureFramework__Group_4__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getArchitectureFrameworkAccess().getGroup_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArchitectureFramework__Group__4__Impl"


    // $ANTLR start "rule__ArchitectureFramework__Group__5"
    // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:410:1: rule__ArchitectureFramework__Group__5 : rule__ArchitectureFramework__Group__5__Impl rule__ArchitectureFramework__Group__6 ;
    public final void rule__ArchitectureFramework__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:414:1: ( rule__ArchitectureFramework__Group__5__Impl rule__ArchitectureFramework__Group__6 )
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:415:2: rule__ArchitectureFramework__Group__5__Impl rule__ArchitectureFramework__Group__6
            {
            pushFollow(FOLLOW_rule__ArchitectureFramework__Group__5__Impl_in_rule__ArchitectureFramework__Group__5799);
            rule__ArchitectureFramework__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ArchitectureFramework__Group__6_in_rule__ArchitectureFramework__Group__5802);
            rule__ArchitectureFramework__Group__6();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArchitectureFramework__Group__5"


    // $ANTLR start "rule__ArchitectureFramework__Group__5__Impl"
    // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:422:1: rule__ArchitectureFramework__Group__5__Impl : ( ( rule__ArchitectureFramework__Group_5__0 )? ) ;
    public final void rule__ArchitectureFramework__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:426:1: ( ( ( rule__ArchitectureFramework__Group_5__0 )? ) )
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:427:1: ( ( rule__ArchitectureFramework__Group_5__0 )? )
            {
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:427:1: ( ( rule__ArchitectureFramework__Group_5__0 )? )
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:428:1: ( rule__ArchitectureFramework__Group_5__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArchitectureFrameworkAccess().getGroup_5()); 
            }
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:429:1: ( rule__ArchitectureFramework__Group_5__0 )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==15) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:429:2: rule__ArchitectureFramework__Group_5__0
                    {
                    pushFollow(FOLLOW_rule__ArchitectureFramework__Group_5__0_in_rule__ArchitectureFramework__Group__5__Impl829);
                    rule__ArchitectureFramework__Group_5__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getArchitectureFrameworkAccess().getGroup_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArchitectureFramework__Group__5__Impl"


    // $ANTLR start "rule__ArchitectureFramework__Group__6"
    // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:439:1: rule__ArchitectureFramework__Group__6 : rule__ArchitectureFramework__Group__6__Impl rule__ArchitectureFramework__Group__7 ;
    public final void rule__ArchitectureFramework__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:443:1: ( rule__ArchitectureFramework__Group__6__Impl rule__ArchitectureFramework__Group__7 )
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:444:2: rule__ArchitectureFramework__Group__6__Impl rule__ArchitectureFramework__Group__7
            {
            pushFollow(FOLLOW_rule__ArchitectureFramework__Group__6__Impl_in_rule__ArchitectureFramework__Group__6860);
            rule__ArchitectureFramework__Group__6__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ArchitectureFramework__Group__7_in_rule__ArchitectureFramework__Group__6863);
            rule__ArchitectureFramework__Group__7();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArchitectureFramework__Group__6"


    // $ANTLR start "rule__ArchitectureFramework__Group__6__Impl"
    // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:451:1: rule__ArchitectureFramework__Group__6__Impl : ( ( rule__ArchitectureFramework__Af_viewpointsAssignment_6 )? ) ;
    public final void rule__ArchitectureFramework__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:455:1: ( ( ( rule__ArchitectureFramework__Af_viewpointsAssignment_6 )? ) )
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:456:1: ( ( rule__ArchitectureFramework__Af_viewpointsAssignment_6 )? )
            {
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:456:1: ( ( rule__ArchitectureFramework__Af_viewpointsAssignment_6 )? )
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:457:1: ( rule__ArchitectureFramework__Af_viewpointsAssignment_6 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArchitectureFrameworkAccess().getAf_viewpointsAssignment_6()); 
            }
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:458:1: ( rule__ArchitectureFramework__Af_viewpointsAssignment_6 )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==19) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:458:2: rule__ArchitectureFramework__Af_viewpointsAssignment_6
                    {
                    pushFollow(FOLLOW_rule__ArchitectureFramework__Af_viewpointsAssignment_6_in_rule__ArchitectureFramework__Group__6__Impl890);
                    rule__ArchitectureFramework__Af_viewpointsAssignment_6();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getArchitectureFrameworkAccess().getAf_viewpointsAssignment_6()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArchitectureFramework__Group__6__Impl"


    // $ANTLR start "rule__ArchitectureFramework__Group__7"
    // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:468:1: rule__ArchitectureFramework__Group__7 : rule__ArchitectureFramework__Group__7__Impl rule__ArchitectureFramework__Group__8 ;
    public final void rule__ArchitectureFramework__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:472:1: ( rule__ArchitectureFramework__Group__7__Impl rule__ArchitectureFramework__Group__8 )
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:473:2: rule__ArchitectureFramework__Group__7__Impl rule__ArchitectureFramework__Group__8
            {
            pushFollow(FOLLOW_rule__ArchitectureFramework__Group__7__Impl_in_rule__ArchitectureFramework__Group__7921);
            rule__ArchitectureFramework__Group__7__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ArchitectureFramework__Group__8_in_rule__ArchitectureFramework__Group__7924);
            rule__ArchitectureFramework__Group__8();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArchitectureFramework__Group__7"


    // $ANTLR start "rule__ArchitectureFramework__Group__7__Impl"
    // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:480:1: rule__ArchitectureFramework__Group__7__Impl : ( ( rule__ArchitectureFramework__Owned_configurationAssignment_7 ) ) ;
    public final void rule__ArchitectureFramework__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:484:1: ( ( ( rule__ArchitectureFramework__Owned_configurationAssignment_7 ) ) )
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:485:1: ( ( rule__ArchitectureFramework__Owned_configurationAssignment_7 ) )
            {
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:485:1: ( ( rule__ArchitectureFramework__Owned_configurationAssignment_7 ) )
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:486:1: ( rule__ArchitectureFramework__Owned_configurationAssignment_7 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArchitectureFrameworkAccess().getOwned_configurationAssignment_7()); 
            }
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:487:1: ( rule__ArchitectureFramework__Owned_configurationAssignment_7 )
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:487:2: rule__ArchitectureFramework__Owned_configurationAssignment_7
            {
            pushFollow(FOLLOW_rule__ArchitectureFramework__Owned_configurationAssignment_7_in_rule__ArchitectureFramework__Group__7__Impl951);
            rule__ArchitectureFramework__Owned_configurationAssignment_7();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getArchitectureFrameworkAccess().getOwned_configurationAssignment_7()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArchitectureFramework__Group__7__Impl"


    // $ANTLR start "rule__ArchitectureFramework__Group__8"
    // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:497:1: rule__ArchitectureFramework__Group__8 : rule__ArchitectureFramework__Group__8__Impl ;
    public final void rule__ArchitectureFramework__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:501:1: ( rule__ArchitectureFramework__Group__8__Impl )
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:502:2: rule__ArchitectureFramework__Group__8__Impl
            {
            pushFollow(FOLLOW_rule__ArchitectureFramework__Group__8__Impl_in_rule__ArchitectureFramework__Group__8981);
            rule__ArchitectureFramework__Group__8__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArchitectureFramework__Group__8"


    // $ANTLR start "rule__ArchitectureFramework__Group__8__Impl"
    // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:508:1: rule__ArchitectureFramework__Group__8__Impl : ( '}' ) ;
    public final void rule__ArchitectureFramework__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:512:1: ( ( '}' ) )
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:513:1: ( '}' )
            {
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:513:1: ( '}' )
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:514:1: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArchitectureFrameworkAccess().getRightCurlyBracketKeyword_8()); 
            }
            match(input,13,FOLLOW_13_in_rule__ArchitectureFramework__Group__8__Impl1009); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getArchitectureFrameworkAccess().getRightCurlyBracketKeyword_8()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArchitectureFramework__Group__8__Impl"


    // $ANTLR start "rule__ArchitectureFramework__Group_4__0"
    // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:545:1: rule__ArchitectureFramework__Group_4__0 : rule__ArchitectureFramework__Group_4__0__Impl rule__ArchitectureFramework__Group_4__1 ;
    public final void rule__ArchitectureFramework__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:549:1: ( rule__ArchitectureFramework__Group_4__0__Impl rule__ArchitectureFramework__Group_4__1 )
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:550:2: rule__ArchitectureFramework__Group_4__0__Impl rule__ArchitectureFramework__Group_4__1
            {
            pushFollow(FOLLOW_rule__ArchitectureFramework__Group_4__0__Impl_in_rule__ArchitectureFramework__Group_4__01058);
            rule__ArchitectureFramework__Group_4__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ArchitectureFramework__Group_4__1_in_rule__ArchitectureFramework__Group_4__01061);
            rule__ArchitectureFramework__Group_4__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArchitectureFramework__Group_4__0"


    // $ANTLR start "rule__ArchitectureFramework__Group_4__0__Impl"
    // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:557:1: rule__ArchitectureFramework__Group_4__0__Impl : ( 'description:' ) ;
    public final void rule__ArchitectureFramework__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:561:1: ( ( 'description:' ) )
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:562:1: ( 'description:' )
            {
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:562:1: ( 'description:' )
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:563:1: 'description:'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArchitectureFrameworkAccess().getDescriptionKeyword_4_0()); 
            }
            match(input,14,FOLLOW_14_in_rule__ArchitectureFramework__Group_4__0__Impl1089); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getArchitectureFrameworkAccess().getDescriptionKeyword_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArchitectureFramework__Group_4__0__Impl"


    // $ANTLR start "rule__ArchitectureFramework__Group_4__1"
    // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:576:1: rule__ArchitectureFramework__Group_4__1 : rule__ArchitectureFramework__Group_4__1__Impl ;
    public final void rule__ArchitectureFramework__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:580:1: ( rule__ArchitectureFramework__Group_4__1__Impl )
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:581:2: rule__ArchitectureFramework__Group_4__1__Impl
            {
            pushFollow(FOLLOW_rule__ArchitectureFramework__Group_4__1__Impl_in_rule__ArchitectureFramework__Group_4__11120);
            rule__ArchitectureFramework__Group_4__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArchitectureFramework__Group_4__1"


    // $ANTLR start "rule__ArchitectureFramework__Group_4__1__Impl"
    // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:587:1: rule__ArchitectureFramework__Group_4__1__Impl : ( ( rule__ArchitectureFramework__DescriptionAssignment_4_1 ) ) ;
    public final void rule__ArchitectureFramework__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:591:1: ( ( ( rule__ArchitectureFramework__DescriptionAssignment_4_1 ) ) )
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:592:1: ( ( rule__ArchitectureFramework__DescriptionAssignment_4_1 ) )
            {
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:592:1: ( ( rule__ArchitectureFramework__DescriptionAssignment_4_1 ) )
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:593:1: ( rule__ArchitectureFramework__DescriptionAssignment_4_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArchitectureFrameworkAccess().getDescriptionAssignment_4_1()); 
            }
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:594:1: ( rule__ArchitectureFramework__DescriptionAssignment_4_1 )
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:594:2: rule__ArchitectureFramework__DescriptionAssignment_4_1
            {
            pushFollow(FOLLOW_rule__ArchitectureFramework__DescriptionAssignment_4_1_in_rule__ArchitectureFramework__Group_4__1__Impl1147);
            rule__ArchitectureFramework__DescriptionAssignment_4_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getArchitectureFrameworkAccess().getDescriptionAssignment_4_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArchitectureFramework__Group_4__1__Impl"


    // $ANTLR start "rule__ArchitectureFramework__Group_5__0"
    // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:608:1: rule__ArchitectureFramework__Group_5__0 : rule__ArchitectureFramework__Group_5__0__Impl rule__ArchitectureFramework__Group_5__1 ;
    public final void rule__ArchitectureFramework__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:612:1: ( rule__ArchitectureFramework__Group_5__0__Impl rule__ArchitectureFramework__Group_5__1 )
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:613:2: rule__ArchitectureFramework__Group_5__0__Impl rule__ArchitectureFramework__Group_5__1
            {
            pushFollow(FOLLOW_rule__ArchitectureFramework__Group_5__0__Impl_in_rule__ArchitectureFramework__Group_5__01181);
            rule__ArchitectureFramework__Group_5__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ArchitectureFramework__Group_5__1_in_rule__ArchitectureFramework__Group_5__01184);
            rule__ArchitectureFramework__Group_5__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArchitectureFramework__Group_5__0"


    // $ANTLR start "rule__ArchitectureFramework__Group_5__0__Impl"
    // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:620:1: rule__ArchitectureFramework__Group_5__0__Impl : ( 'shortName:' ) ;
    public final void rule__ArchitectureFramework__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:624:1: ( ( 'shortName:' ) )
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:625:1: ( 'shortName:' )
            {
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:625:1: ( 'shortName:' )
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:626:1: 'shortName:'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArchitectureFrameworkAccess().getShortNameKeyword_5_0()); 
            }
            match(input,15,FOLLOW_15_in_rule__ArchitectureFramework__Group_5__0__Impl1212); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getArchitectureFrameworkAccess().getShortNameKeyword_5_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArchitectureFramework__Group_5__0__Impl"


    // $ANTLR start "rule__ArchitectureFramework__Group_5__1"
    // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:639:1: rule__ArchitectureFramework__Group_5__1 : rule__ArchitectureFramework__Group_5__1__Impl ;
    public final void rule__ArchitectureFramework__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:643:1: ( rule__ArchitectureFramework__Group_5__1__Impl )
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:644:2: rule__ArchitectureFramework__Group_5__1__Impl
            {
            pushFollow(FOLLOW_rule__ArchitectureFramework__Group_5__1__Impl_in_rule__ArchitectureFramework__Group_5__11243);
            rule__ArchitectureFramework__Group_5__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArchitectureFramework__Group_5__1"


    // $ANTLR start "rule__ArchitectureFramework__Group_5__1__Impl"
    // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:650:1: rule__ArchitectureFramework__Group_5__1__Impl : ( ( rule__ArchitectureFramework__ShortNameAssignment_5_1 ) ) ;
    public final void rule__ArchitectureFramework__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:654:1: ( ( ( rule__ArchitectureFramework__ShortNameAssignment_5_1 ) ) )
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:655:1: ( ( rule__ArchitectureFramework__ShortNameAssignment_5_1 ) )
            {
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:655:1: ( ( rule__ArchitectureFramework__ShortNameAssignment_5_1 ) )
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:656:1: ( rule__ArchitectureFramework__ShortNameAssignment_5_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArchitectureFrameworkAccess().getShortNameAssignment_5_1()); 
            }
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:657:1: ( rule__ArchitectureFramework__ShortNameAssignment_5_1 )
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:657:2: rule__ArchitectureFramework__ShortNameAssignment_5_1
            {
            pushFollow(FOLLOW_rule__ArchitectureFramework__ShortNameAssignment_5_1_in_rule__ArchitectureFramework__Group_5__1__Impl1270);
            rule__ArchitectureFramework__ShortNameAssignment_5_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getArchitectureFrameworkAccess().getShortNameAssignment_5_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArchitectureFramework__Group_5__1__Impl"


    // $ANTLR start "rule__Configuration__Group__0"
    // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:671:1: rule__Configuration__Group__0 : rule__Configuration__Group__0__Impl rule__Configuration__Group__1 ;
    public final void rule__Configuration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:675:1: ( rule__Configuration__Group__0__Impl rule__Configuration__Group__1 )
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:676:2: rule__Configuration__Group__0__Impl rule__Configuration__Group__1
            {
            pushFollow(FOLLOW_rule__Configuration__Group__0__Impl_in_rule__Configuration__Group__01304);
            rule__Configuration__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Configuration__Group__1_in_rule__Configuration__Group__01307);
            rule__Configuration__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Configuration__Group__0"


    // $ANTLR start "rule__Configuration__Group__0__Impl"
    // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:683:1: rule__Configuration__Group__0__Impl : ( () ) ;
    public final void rule__Configuration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:687:1: ( ( () ) )
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:688:1: ( () )
            {
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:688:1: ( () )
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:689:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConfigurationAccess().getConfigurationAction_0()); 
            }
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:690:1: ()
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:692:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getConfigurationAccess().getConfigurationAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Configuration__Group__0__Impl"


    // $ANTLR start "rule__Configuration__Group__1"
    // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:702:1: rule__Configuration__Group__1 : rule__Configuration__Group__1__Impl rule__Configuration__Group__2 ;
    public final void rule__Configuration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:706:1: ( rule__Configuration__Group__1__Impl rule__Configuration__Group__2 )
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:707:2: rule__Configuration__Group__1__Impl rule__Configuration__Group__2
            {
            pushFollow(FOLLOW_rule__Configuration__Group__1__Impl_in_rule__Configuration__Group__11365);
            rule__Configuration__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Configuration__Group__2_in_rule__Configuration__Group__11368);
            rule__Configuration__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Configuration__Group__1"


    // $ANTLR start "rule__Configuration__Group__1__Impl"
    // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:714:1: rule__Configuration__Group__1__Impl : ( 'Configuration' ) ;
    public final void rule__Configuration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:718:1: ( ( 'Configuration' ) )
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:719:1: ( 'Configuration' )
            {
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:719:1: ( 'Configuration' )
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:720:1: 'Configuration'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConfigurationAccess().getConfigurationKeyword_1()); 
            }
            match(input,16,FOLLOW_16_in_rule__Configuration__Group__1__Impl1396); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConfigurationAccess().getConfigurationKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Configuration__Group__1__Impl"


    // $ANTLR start "rule__Configuration__Group__2"
    // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:733:1: rule__Configuration__Group__2 : rule__Configuration__Group__2__Impl rule__Configuration__Group__3 ;
    public final void rule__Configuration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:737:1: ( rule__Configuration__Group__2__Impl rule__Configuration__Group__3 )
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:738:2: rule__Configuration__Group__2__Impl rule__Configuration__Group__3
            {
            pushFollow(FOLLOW_rule__Configuration__Group__2__Impl_in_rule__Configuration__Group__21427);
            rule__Configuration__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Configuration__Group__3_in_rule__Configuration__Group__21430);
            rule__Configuration__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Configuration__Group__2"


    // $ANTLR start "rule__Configuration__Group__2__Impl"
    // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:745:1: rule__Configuration__Group__2__Impl : ( '{' ) ;
    public final void rule__Configuration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:749:1: ( ( '{' ) )
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:750:1: ( '{' )
            {
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:750:1: ( '{' )
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:751:1: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConfigurationAccess().getLeftCurlyBracketKeyword_2()); 
            }
            match(input,12,FOLLOW_12_in_rule__Configuration__Group__2__Impl1458); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConfigurationAccess().getLeftCurlyBracketKeyword_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Configuration__Group__2__Impl"


    // $ANTLR start "rule__Configuration__Group__3"
    // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:764:1: rule__Configuration__Group__3 : rule__Configuration__Group__3__Impl rule__Configuration__Group__4 ;
    public final void rule__Configuration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:768:1: ( rule__Configuration__Group__3__Impl rule__Configuration__Group__4 )
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:769:2: rule__Configuration__Group__3__Impl rule__Configuration__Group__4
            {
            pushFollow(FOLLOW_rule__Configuration__Group__3__Impl_in_rule__Configuration__Group__31489);
            rule__Configuration__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Configuration__Group__4_in_rule__Configuration__Group__31492);
            rule__Configuration__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Configuration__Group__3"


    // $ANTLR start "rule__Configuration__Group__3__Impl"
    // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:776:1: rule__Configuration__Group__3__Impl : ( ( rule__Configuration__Group_3__0 )? ) ;
    public final void rule__Configuration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:780:1: ( ( ( rule__Configuration__Group_3__0 )? ) )
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:781:1: ( ( rule__Configuration__Group_3__0 )? )
            {
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:781:1: ( ( rule__Configuration__Group_3__0 )? )
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:782:1: ( rule__Configuration__Group_3__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConfigurationAccess().getGroup_3()); 
            }
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:783:1: ( rule__Configuration__Group_3__0 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==18) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:783:2: rule__Configuration__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__Configuration__Group_3__0_in_rule__Configuration__Group__3__Impl1519);
                    rule__Configuration__Group_3__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getConfigurationAccess().getGroup_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Configuration__Group__3__Impl"


    // $ANTLR start "rule__Configuration__Group__4"
    // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:793:1: rule__Configuration__Group__4 : rule__Configuration__Group__4__Impl ;
    public final void rule__Configuration__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:797:1: ( rule__Configuration__Group__4__Impl )
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:798:2: rule__Configuration__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Configuration__Group__4__Impl_in_rule__Configuration__Group__41550);
            rule__Configuration__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Configuration__Group__4"


    // $ANTLR start "rule__Configuration__Group__4__Impl"
    // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:804:1: rule__Configuration__Group__4__Impl : ( '}' ) ;
    public final void rule__Configuration__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:808:1: ( ( '}' ) )
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:809:1: ( '}' )
            {
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:809:1: ( '}' )
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:810:1: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConfigurationAccess().getRightCurlyBracketKeyword_4()); 
            }
            match(input,13,FOLLOW_13_in_rule__Configuration__Group__4__Impl1578); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConfigurationAccess().getRightCurlyBracketKeyword_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Configuration__Group__4__Impl"


    // $ANTLR start "rule__Configuration__Group_3__0"
    // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:833:1: rule__Configuration__Group_3__0 : rule__Configuration__Group_3__0__Impl rule__Configuration__Group_3__1 ;
    public final void rule__Configuration__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:837:1: ( rule__Configuration__Group_3__0__Impl rule__Configuration__Group_3__1 )
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:838:2: rule__Configuration__Group_3__0__Impl rule__Configuration__Group_3__1
            {
            pushFollow(FOLLOW_rule__Configuration__Group_3__0__Impl_in_rule__Configuration__Group_3__01619);
            rule__Configuration__Group_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Configuration__Group_3__1_in_rule__Configuration__Group_3__01622);
            rule__Configuration__Group_3__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Configuration__Group_3__0"


    // $ANTLR start "rule__Configuration__Group_3__0__Impl"
    // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:845:1: rule__Configuration__Group_3__0__Impl : ( ( rule__Configuration__Owned_elementAssignment_3_0 ) ) ;
    public final void rule__Configuration__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:849:1: ( ( ( rule__Configuration__Owned_elementAssignment_3_0 ) ) )
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:850:1: ( ( rule__Configuration__Owned_elementAssignment_3_0 ) )
            {
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:850:1: ( ( rule__Configuration__Owned_elementAssignment_3_0 ) )
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:851:1: ( rule__Configuration__Owned_elementAssignment_3_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConfigurationAccess().getOwned_elementAssignment_3_0()); 
            }
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:852:1: ( rule__Configuration__Owned_elementAssignment_3_0 )
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:852:2: rule__Configuration__Owned_elementAssignment_3_0
            {
            pushFollow(FOLLOW_rule__Configuration__Owned_elementAssignment_3_0_in_rule__Configuration__Group_3__0__Impl1649);
            rule__Configuration__Owned_elementAssignment_3_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getConfigurationAccess().getOwned_elementAssignment_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Configuration__Group_3__0__Impl"


    // $ANTLR start "rule__Configuration__Group_3__1"
    // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:862:1: rule__Configuration__Group_3__1 : rule__Configuration__Group_3__1__Impl ;
    public final void rule__Configuration__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:866:1: ( rule__Configuration__Group_3__1__Impl )
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:867:2: rule__Configuration__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__Configuration__Group_3__1__Impl_in_rule__Configuration__Group_3__11679);
            rule__Configuration__Group_3__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Configuration__Group_3__1"


    // $ANTLR start "rule__Configuration__Group_3__1__Impl"
    // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:873:1: rule__Configuration__Group_3__1__Impl : ( ( rule__Configuration__Group_3_1__0 )* ) ;
    public final void rule__Configuration__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:877:1: ( ( ( rule__Configuration__Group_3_1__0 )* ) )
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:878:1: ( ( rule__Configuration__Group_3_1__0 )* )
            {
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:878:1: ( ( rule__Configuration__Group_3_1__0 )* )
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:879:1: ( rule__Configuration__Group_3_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConfigurationAccess().getGroup_3_1()); 
            }
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:880:1: ( rule__Configuration__Group_3_1__0 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==17) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:880:2: rule__Configuration__Group_3_1__0
            	    {
            	    pushFollow(FOLLOW_rule__Configuration__Group_3_1__0_in_rule__Configuration__Group_3__1__Impl1706);
            	    rule__Configuration__Group_3_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getConfigurationAccess().getGroup_3_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Configuration__Group_3__1__Impl"


    // $ANTLR start "rule__Configuration__Group_3_1__0"
    // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:894:1: rule__Configuration__Group_3_1__0 : rule__Configuration__Group_3_1__0__Impl rule__Configuration__Group_3_1__1 ;
    public final void rule__Configuration__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:898:1: ( rule__Configuration__Group_3_1__0__Impl rule__Configuration__Group_3_1__1 )
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:899:2: rule__Configuration__Group_3_1__0__Impl rule__Configuration__Group_3_1__1
            {
            pushFollow(FOLLOW_rule__Configuration__Group_3_1__0__Impl_in_rule__Configuration__Group_3_1__01741);
            rule__Configuration__Group_3_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Configuration__Group_3_1__1_in_rule__Configuration__Group_3_1__01744);
            rule__Configuration__Group_3_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Configuration__Group_3_1__0"


    // $ANTLR start "rule__Configuration__Group_3_1__0__Impl"
    // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:906:1: rule__Configuration__Group_3_1__0__Impl : ( ',' ) ;
    public final void rule__Configuration__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:910:1: ( ( ',' ) )
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:911:1: ( ',' )
            {
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:911:1: ( ',' )
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:912:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConfigurationAccess().getCommaKeyword_3_1_0()); 
            }
            match(input,17,FOLLOW_17_in_rule__Configuration__Group_3_1__0__Impl1772); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConfigurationAccess().getCommaKeyword_3_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Configuration__Group_3_1__0__Impl"


    // $ANTLR start "rule__Configuration__Group_3_1__1"
    // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:925:1: rule__Configuration__Group_3_1__1 : rule__Configuration__Group_3_1__1__Impl ;
    public final void rule__Configuration__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:929:1: ( rule__Configuration__Group_3_1__1__Impl )
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:930:2: rule__Configuration__Group_3_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Configuration__Group_3_1__1__Impl_in_rule__Configuration__Group_3_1__11803);
            rule__Configuration__Group_3_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Configuration__Group_3_1__1"


    // $ANTLR start "rule__Configuration__Group_3_1__1__Impl"
    // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:936:1: rule__Configuration__Group_3_1__1__Impl : ( ( rule__Configuration__Owned_elementAssignment_3_1_1 ) ) ;
    public final void rule__Configuration__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:940:1: ( ( ( rule__Configuration__Owned_elementAssignment_3_1_1 ) ) )
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:941:1: ( ( rule__Configuration__Owned_elementAssignment_3_1_1 ) )
            {
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:941:1: ( ( rule__Configuration__Owned_elementAssignment_3_1_1 ) )
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:942:1: ( rule__Configuration__Owned_elementAssignment_3_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConfigurationAccess().getOwned_elementAssignment_3_1_1()); 
            }
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:943:1: ( rule__Configuration__Owned_elementAssignment_3_1_1 )
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:943:2: rule__Configuration__Owned_elementAssignment_3_1_1
            {
            pushFollow(FOLLOW_rule__Configuration__Owned_elementAssignment_3_1_1_in_rule__Configuration__Group_3_1__1__Impl1830);
            rule__Configuration__Owned_elementAssignment_3_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getConfigurationAccess().getOwned_elementAssignment_3_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Configuration__Group_3_1__1__Impl"


    // $ANTLR start "rule__GenerationConfiguration__Group__0"
    // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:957:1: rule__GenerationConfiguration__Group__0 : rule__GenerationConfiguration__Group__0__Impl rule__GenerationConfiguration__Group__1 ;
    public final void rule__GenerationConfiguration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:961:1: ( rule__GenerationConfiguration__Group__0__Impl rule__GenerationConfiguration__Group__1 )
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:962:2: rule__GenerationConfiguration__Group__0__Impl rule__GenerationConfiguration__Group__1
            {
            pushFollow(FOLLOW_rule__GenerationConfiguration__Group__0__Impl_in_rule__GenerationConfiguration__Group__01864);
            rule__GenerationConfiguration__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__GenerationConfiguration__Group__1_in_rule__GenerationConfiguration__Group__01867);
            rule__GenerationConfiguration__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GenerationConfiguration__Group__0"


    // $ANTLR start "rule__GenerationConfiguration__Group__0__Impl"
    // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:969:1: rule__GenerationConfiguration__Group__0__Impl : ( () ) ;
    public final void rule__GenerationConfiguration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:973:1: ( ( () ) )
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:974:1: ( () )
            {
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:974:1: ( () )
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:975:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGenerationConfigurationAccess().getGenerationConfigurationAction_0()); 
            }
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:976:1: ()
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:978:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGenerationConfigurationAccess().getGenerationConfigurationAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GenerationConfiguration__Group__0__Impl"


    // $ANTLR start "rule__GenerationConfiguration__Group__1"
    // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:988:1: rule__GenerationConfiguration__Group__1 : rule__GenerationConfiguration__Group__1__Impl ;
    public final void rule__GenerationConfiguration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:992:1: ( rule__GenerationConfiguration__Group__1__Impl )
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:993:2: rule__GenerationConfiguration__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__GenerationConfiguration__Group__1__Impl_in_rule__GenerationConfiguration__Group__11925);
            rule__GenerationConfiguration__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GenerationConfiguration__Group__1"


    // $ANTLR start "rule__GenerationConfiguration__Group__1__Impl"
    // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:999:1: rule__GenerationConfiguration__Group__1__Impl : ( ( rule__GenerationConfiguration__Group_1__0 ) ) ;
    public final void rule__GenerationConfiguration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:1003:1: ( ( ( rule__GenerationConfiguration__Group_1__0 ) ) )
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:1004:1: ( ( rule__GenerationConfiguration__Group_1__0 ) )
            {
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:1004:1: ( ( rule__GenerationConfiguration__Group_1__0 ) )
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:1005:1: ( rule__GenerationConfiguration__Group_1__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGenerationConfigurationAccess().getGroup_1()); 
            }
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:1006:1: ( rule__GenerationConfiguration__Group_1__0 )
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:1006:2: rule__GenerationConfiguration__Group_1__0
            {
            pushFollow(FOLLOW_rule__GenerationConfiguration__Group_1__0_in_rule__GenerationConfiguration__Group__1__Impl1952);
            rule__GenerationConfiguration__Group_1__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGenerationConfigurationAccess().getGroup_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GenerationConfiguration__Group__1__Impl"


    // $ANTLR start "rule__GenerationConfiguration__Group_1__0"
    // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:1020:1: rule__GenerationConfiguration__Group_1__0 : rule__GenerationConfiguration__Group_1__0__Impl rule__GenerationConfiguration__Group_1__1 ;
    public final void rule__GenerationConfiguration__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:1024:1: ( rule__GenerationConfiguration__Group_1__0__Impl rule__GenerationConfiguration__Group_1__1 )
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:1025:2: rule__GenerationConfiguration__Group_1__0__Impl rule__GenerationConfiguration__Group_1__1
            {
            pushFollow(FOLLOW_rule__GenerationConfiguration__Group_1__0__Impl_in_rule__GenerationConfiguration__Group_1__01986);
            rule__GenerationConfiguration__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__GenerationConfiguration__Group_1__1_in_rule__GenerationConfiguration__Group_1__01989);
            rule__GenerationConfiguration__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GenerationConfiguration__Group_1__0"


    // $ANTLR start "rule__GenerationConfiguration__Group_1__0__Impl"
    // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:1032:1: rule__GenerationConfiguration__Group_1__0__Impl : ( 'rootProjectName:' ) ;
    public final void rule__GenerationConfiguration__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:1036:1: ( ( 'rootProjectName:' ) )
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:1037:1: ( 'rootProjectName:' )
            {
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:1037:1: ( 'rootProjectName:' )
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:1038:1: 'rootProjectName:'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGenerationConfigurationAccess().getRootProjectNameKeyword_1_0()); 
            }
            match(input,18,FOLLOW_18_in_rule__GenerationConfiguration__Group_1__0__Impl2017); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGenerationConfigurationAccess().getRootProjectNameKeyword_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GenerationConfiguration__Group_1__0__Impl"


    // $ANTLR start "rule__GenerationConfiguration__Group_1__1"
    // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:1051:1: rule__GenerationConfiguration__Group_1__1 : rule__GenerationConfiguration__Group_1__1__Impl ;
    public final void rule__GenerationConfiguration__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:1055:1: ( rule__GenerationConfiguration__Group_1__1__Impl )
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:1056:2: rule__GenerationConfiguration__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__GenerationConfiguration__Group_1__1__Impl_in_rule__GenerationConfiguration__Group_1__12048);
            rule__GenerationConfiguration__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GenerationConfiguration__Group_1__1"


    // $ANTLR start "rule__GenerationConfiguration__Group_1__1__Impl"
    // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:1062:1: rule__GenerationConfiguration__Group_1__1__Impl : ( ( rule__GenerationConfiguration__RootProjectNameAssignment_1_1 ) ) ;
    public final void rule__GenerationConfiguration__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:1066:1: ( ( ( rule__GenerationConfiguration__RootProjectNameAssignment_1_1 ) ) )
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:1067:1: ( ( rule__GenerationConfiguration__RootProjectNameAssignment_1_1 ) )
            {
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:1067:1: ( ( rule__GenerationConfiguration__RootProjectNameAssignment_1_1 ) )
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:1068:1: ( rule__GenerationConfiguration__RootProjectNameAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGenerationConfigurationAccess().getRootProjectNameAssignment_1_1()); 
            }
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:1069:1: ( rule__GenerationConfiguration__RootProjectNameAssignment_1_1 )
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:1069:2: rule__GenerationConfiguration__RootProjectNameAssignment_1_1
            {
            pushFollow(FOLLOW_rule__GenerationConfiguration__RootProjectNameAssignment_1_1_in_rule__GenerationConfiguration__Group_1__1__Impl2075);
            rule__GenerationConfiguration__RootProjectNameAssignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGenerationConfigurationAccess().getRootProjectNameAssignment_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GenerationConfiguration__Group_1__1__Impl"


    // $ANTLR start "rule__Viewpoints__Group__0"
    // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:1083:1: rule__Viewpoints__Group__0 : rule__Viewpoints__Group__0__Impl rule__Viewpoints__Group__1 ;
    public final void rule__Viewpoints__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:1087:1: ( rule__Viewpoints__Group__0__Impl rule__Viewpoints__Group__1 )
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:1088:2: rule__Viewpoints__Group__0__Impl rule__Viewpoints__Group__1
            {
            pushFollow(FOLLOW_rule__Viewpoints__Group__0__Impl_in_rule__Viewpoints__Group__02109);
            rule__Viewpoints__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Viewpoints__Group__1_in_rule__Viewpoints__Group__02112);
            rule__Viewpoints__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Viewpoints__Group__0"


    // $ANTLR start "rule__Viewpoints__Group__0__Impl"
    // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:1095:1: rule__Viewpoints__Group__0__Impl : ( () ) ;
    public final void rule__Viewpoints__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:1099:1: ( ( () ) )
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:1100:1: ( () )
            {
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:1100:1: ( () )
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:1101:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getViewpointsAccess().getViewpointsAction_0()); 
            }
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:1102:1: ()
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:1104:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getViewpointsAccess().getViewpointsAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Viewpoints__Group__0__Impl"


    // $ANTLR start "rule__Viewpoints__Group__1"
    // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:1114:1: rule__Viewpoints__Group__1 : rule__Viewpoints__Group__1__Impl rule__Viewpoints__Group__2 ;
    public final void rule__Viewpoints__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:1118:1: ( rule__Viewpoints__Group__1__Impl rule__Viewpoints__Group__2 )
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:1119:2: rule__Viewpoints__Group__1__Impl rule__Viewpoints__Group__2
            {
            pushFollow(FOLLOW_rule__Viewpoints__Group__1__Impl_in_rule__Viewpoints__Group__12170);
            rule__Viewpoints__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Viewpoints__Group__2_in_rule__Viewpoints__Group__12173);
            rule__Viewpoints__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Viewpoints__Group__1"


    // $ANTLR start "rule__Viewpoints__Group__1__Impl"
    // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:1126:1: rule__Viewpoints__Group__1__Impl : ( 'Viewpoints' ) ;
    public final void rule__Viewpoints__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:1130:1: ( ( 'Viewpoints' ) )
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:1131:1: ( 'Viewpoints' )
            {
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:1131:1: ( 'Viewpoints' )
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:1132:1: 'Viewpoints'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getViewpointsAccess().getViewpointsKeyword_1()); 
            }
            match(input,19,FOLLOW_19_in_rule__Viewpoints__Group__1__Impl2201); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getViewpointsAccess().getViewpointsKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Viewpoints__Group__1__Impl"


    // $ANTLR start "rule__Viewpoints__Group__2"
    // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:1145:1: rule__Viewpoints__Group__2 : rule__Viewpoints__Group__2__Impl rule__Viewpoints__Group__3 ;
    public final void rule__Viewpoints__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:1149:1: ( rule__Viewpoints__Group__2__Impl rule__Viewpoints__Group__3 )
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:1150:2: rule__Viewpoints__Group__2__Impl rule__Viewpoints__Group__3
            {
            pushFollow(FOLLOW_rule__Viewpoints__Group__2__Impl_in_rule__Viewpoints__Group__22232);
            rule__Viewpoints__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Viewpoints__Group__3_in_rule__Viewpoints__Group__22235);
            rule__Viewpoints__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Viewpoints__Group__2"


    // $ANTLR start "rule__Viewpoints__Group__2__Impl"
    // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:1157:1: rule__Viewpoints__Group__2__Impl : ( '{' ) ;
    public final void rule__Viewpoints__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:1161:1: ( ( '{' ) )
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:1162:1: ( '{' )
            {
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:1162:1: ( '{' )
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:1163:1: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getViewpointsAccess().getLeftCurlyBracketKeyword_2()); 
            }
            match(input,12,FOLLOW_12_in_rule__Viewpoints__Group__2__Impl2263); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getViewpointsAccess().getLeftCurlyBracketKeyword_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Viewpoints__Group__2__Impl"


    // $ANTLR start "rule__Viewpoints__Group__3"
    // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:1176:1: rule__Viewpoints__Group__3 : rule__Viewpoints__Group__3__Impl rule__Viewpoints__Group__4 ;
    public final void rule__Viewpoints__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:1180:1: ( rule__Viewpoints__Group__3__Impl rule__Viewpoints__Group__4 )
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:1181:2: rule__Viewpoints__Group__3__Impl rule__Viewpoints__Group__4
            {
            pushFollow(FOLLOW_rule__Viewpoints__Group__3__Impl_in_rule__Viewpoints__Group__32294);
            rule__Viewpoints__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Viewpoints__Group__4_in_rule__Viewpoints__Group__32297);
            rule__Viewpoints__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Viewpoints__Group__3"


    // $ANTLR start "rule__Viewpoints__Group__3__Impl"
    // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:1188:1: rule__Viewpoints__Group__3__Impl : ( ( rule__Viewpoints__Group_3__0 )? ) ;
    public final void rule__Viewpoints__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:1192:1: ( ( ( rule__Viewpoints__Group_3__0 )? ) )
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:1193:1: ( ( rule__Viewpoints__Group_3__0 )? )
            {
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:1193:1: ( ( rule__Viewpoints__Group_3__0 )? )
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:1194:1: ( rule__Viewpoints__Group_3__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getViewpointsAccess().getGroup_3()); 
            }
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:1195:1: ( rule__Viewpoints__Group_3__0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_ID) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:1195:2: rule__Viewpoints__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__Viewpoints__Group_3__0_in_rule__Viewpoints__Group__3__Impl2324);
                    rule__Viewpoints__Group_3__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getViewpointsAccess().getGroup_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Viewpoints__Group__3__Impl"


    // $ANTLR start "rule__Viewpoints__Group__4"
    // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:1205:1: rule__Viewpoints__Group__4 : rule__Viewpoints__Group__4__Impl ;
    public final void rule__Viewpoints__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:1209:1: ( rule__Viewpoints__Group__4__Impl )
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:1210:2: rule__Viewpoints__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Viewpoints__Group__4__Impl_in_rule__Viewpoints__Group__42355);
            rule__Viewpoints__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Viewpoints__Group__4"


    // $ANTLR start "rule__Viewpoints__Group__4__Impl"
    // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:1216:1: rule__Viewpoints__Group__4__Impl : ( '}' ) ;
    public final void rule__Viewpoints__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:1220:1: ( ( '}' ) )
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:1221:1: ( '}' )
            {
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:1221:1: ( '}' )
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:1222:1: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getViewpointsAccess().getRightCurlyBracketKeyword_4()); 
            }
            match(input,13,FOLLOW_13_in_rule__Viewpoints__Group__4__Impl2383); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getViewpointsAccess().getRightCurlyBracketKeyword_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Viewpoints__Group__4__Impl"


    // $ANTLR start "rule__Viewpoints__Group_3__0"
    // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:1245:1: rule__Viewpoints__Group_3__0 : rule__Viewpoints__Group_3__0__Impl rule__Viewpoints__Group_3__1 ;
    public final void rule__Viewpoints__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:1249:1: ( rule__Viewpoints__Group_3__0__Impl rule__Viewpoints__Group_3__1 )
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:1250:2: rule__Viewpoints__Group_3__0__Impl rule__Viewpoints__Group_3__1
            {
            pushFollow(FOLLOW_rule__Viewpoints__Group_3__0__Impl_in_rule__Viewpoints__Group_3__02424);
            rule__Viewpoints__Group_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Viewpoints__Group_3__1_in_rule__Viewpoints__Group_3__02427);
            rule__Viewpoints__Group_3__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Viewpoints__Group_3__0"


    // $ANTLR start "rule__Viewpoints__Group_3__0__Impl"
    // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:1257:1: rule__Viewpoints__Group_3__0__Impl : ( ( rule__Viewpoints__Owned_viewpointsAssignment_3_0 ) ) ;
    public final void rule__Viewpoints__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:1261:1: ( ( ( rule__Viewpoints__Owned_viewpointsAssignment_3_0 ) ) )
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:1262:1: ( ( rule__Viewpoints__Owned_viewpointsAssignment_3_0 ) )
            {
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:1262:1: ( ( rule__Viewpoints__Owned_viewpointsAssignment_3_0 ) )
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:1263:1: ( rule__Viewpoints__Owned_viewpointsAssignment_3_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getViewpointsAccess().getOwned_viewpointsAssignment_3_0()); 
            }
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:1264:1: ( rule__Viewpoints__Owned_viewpointsAssignment_3_0 )
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:1264:2: rule__Viewpoints__Owned_viewpointsAssignment_3_0
            {
            pushFollow(FOLLOW_rule__Viewpoints__Owned_viewpointsAssignment_3_0_in_rule__Viewpoints__Group_3__0__Impl2454);
            rule__Viewpoints__Owned_viewpointsAssignment_3_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getViewpointsAccess().getOwned_viewpointsAssignment_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Viewpoints__Group_3__0__Impl"


    // $ANTLR start "rule__Viewpoints__Group_3__1"
    // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:1274:1: rule__Viewpoints__Group_3__1 : rule__Viewpoints__Group_3__1__Impl ;
    public final void rule__Viewpoints__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:1278:1: ( rule__Viewpoints__Group_3__1__Impl )
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:1279:2: rule__Viewpoints__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__Viewpoints__Group_3__1__Impl_in_rule__Viewpoints__Group_3__12484);
            rule__Viewpoints__Group_3__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Viewpoints__Group_3__1"


    // $ANTLR start "rule__Viewpoints__Group_3__1__Impl"
    // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:1285:1: rule__Viewpoints__Group_3__1__Impl : ( ( rule__Viewpoints__Group_3_1__0 )* ) ;
    public final void rule__Viewpoints__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:1289:1: ( ( ( rule__Viewpoints__Group_3_1__0 )* ) )
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:1290:1: ( ( rule__Viewpoints__Group_3_1__0 )* )
            {
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:1290:1: ( ( rule__Viewpoints__Group_3_1__0 )* )
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:1291:1: ( rule__Viewpoints__Group_3_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getViewpointsAccess().getGroup_3_1()); 
            }
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:1292:1: ( rule__Viewpoints__Group_3_1__0 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==17) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:1292:2: rule__Viewpoints__Group_3_1__0
            	    {
            	    pushFollow(FOLLOW_rule__Viewpoints__Group_3_1__0_in_rule__Viewpoints__Group_3__1__Impl2511);
            	    rule__Viewpoints__Group_3_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getViewpointsAccess().getGroup_3_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Viewpoints__Group_3__1__Impl"


    // $ANTLR start "rule__Viewpoints__Group_3_1__0"
    // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:1306:1: rule__Viewpoints__Group_3_1__0 : rule__Viewpoints__Group_3_1__0__Impl rule__Viewpoints__Group_3_1__1 ;
    public final void rule__Viewpoints__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:1310:1: ( rule__Viewpoints__Group_3_1__0__Impl rule__Viewpoints__Group_3_1__1 )
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:1311:2: rule__Viewpoints__Group_3_1__0__Impl rule__Viewpoints__Group_3_1__1
            {
            pushFollow(FOLLOW_rule__Viewpoints__Group_3_1__0__Impl_in_rule__Viewpoints__Group_3_1__02546);
            rule__Viewpoints__Group_3_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Viewpoints__Group_3_1__1_in_rule__Viewpoints__Group_3_1__02549);
            rule__Viewpoints__Group_3_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Viewpoints__Group_3_1__0"


    // $ANTLR start "rule__Viewpoints__Group_3_1__0__Impl"
    // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:1318:1: rule__Viewpoints__Group_3_1__0__Impl : ( ',' ) ;
    public final void rule__Viewpoints__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:1322:1: ( ( ',' ) )
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:1323:1: ( ',' )
            {
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:1323:1: ( ',' )
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:1324:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getViewpointsAccess().getCommaKeyword_3_1_0()); 
            }
            match(input,17,FOLLOW_17_in_rule__Viewpoints__Group_3_1__0__Impl2577); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getViewpointsAccess().getCommaKeyword_3_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Viewpoints__Group_3_1__0__Impl"


    // $ANTLR start "rule__Viewpoints__Group_3_1__1"
    // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:1337:1: rule__Viewpoints__Group_3_1__1 : rule__Viewpoints__Group_3_1__1__Impl ;
    public final void rule__Viewpoints__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:1341:1: ( rule__Viewpoints__Group_3_1__1__Impl )
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:1342:2: rule__Viewpoints__Group_3_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Viewpoints__Group_3_1__1__Impl_in_rule__Viewpoints__Group_3_1__12608);
            rule__Viewpoints__Group_3_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Viewpoints__Group_3_1__1"


    // $ANTLR start "rule__Viewpoints__Group_3_1__1__Impl"
    // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:1348:1: rule__Viewpoints__Group_3_1__1__Impl : ( ( rule__Viewpoints__Owned_viewpointsAssignment_3_1_1 ) ) ;
    public final void rule__Viewpoints__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:1352:1: ( ( ( rule__Viewpoints__Owned_viewpointsAssignment_3_1_1 ) ) )
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:1353:1: ( ( rule__Viewpoints__Owned_viewpointsAssignment_3_1_1 ) )
            {
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:1353:1: ( ( rule__Viewpoints__Owned_viewpointsAssignment_3_1_1 ) )
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:1354:1: ( rule__Viewpoints__Owned_viewpointsAssignment_3_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getViewpointsAccess().getOwned_viewpointsAssignment_3_1_1()); 
            }
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:1355:1: ( rule__Viewpoints__Owned_viewpointsAssignment_3_1_1 )
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:1355:2: rule__Viewpoints__Owned_viewpointsAssignment_3_1_1
            {
            pushFollow(FOLLOW_rule__Viewpoints__Owned_viewpointsAssignment_3_1_1_in_rule__Viewpoints__Group_3_1__1__Impl2635);
            rule__Viewpoints__Owned_viewpointsAssignment_3_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getViewpointsAccess().getOwned_viewpointsAssignment_3_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Viewpoints__Group_3_1__1__Impl"


    // $ANTLR start "rule__FQN__Group__0"
    // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:1369:1: rule__FQN__Group__0 : rule__FQN__Group__0__Impl rule__FQN__Group__1 ;
    public final void rule__FQN__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:1373:1: ( rule__FQN__Group__0__Impl rule__FQN__Group__1 )
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:1374:2: rule__FQN__Group__0__Impl rule__FQN__Group__1
            {
            pushFollow(FOLLOW_rule__FQN__Group__0__Impl_in_rule__FQN__Group__02669);
            rule__FQN__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__FQN__Group__1_in_rule__FQN__Group__02672);
            rule__FQN__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FQN__Group__0"


    // $ANTLR start "rule__FQN__Group__0__Impl"
    // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:1381:1: rule__FQN__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__FQN__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:1385:1: ( ( RULE_ID ) )
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:1386:1: ( RULE_ID )
            {
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:1386:1: ( RULE_ID )
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:1387:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFQNAccess().getIDTerminalRuleCall_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__FQN__Group__0__Impl2699); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFQNAccess().getIDTerminalRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FQN__Group__0__Impl"


    // $ANTLR start "rule__FQN__Group__1"
    // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:1398:1: rule__FQN__Group__1 : rule__FQN__Group__1__Impl ;
    public final void rule__FQN__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:1402:1: ( rule__FQN__Group__1__Impl )
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:1403:2: rule__FQN__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__FQN__Group__1__Impl_in_rule__FQN__Group__12728);
            rule__FQN__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FQN__Group__1"


    // $ANTLR start "rule__FQN__Group__1__Impl"
    // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:1409:1: rule__FQN__Group__1__Impl : ( ( rule__FQN__Group_1__0 )* ) ;
    public final void rule__FQN__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:1413:1: ( ( ( rule__FQN__Group_1__0 )* ) )
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:1414:1: ( ( rule__FQN__Group_1__0 )* )
            {
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:1414:1: ( ( rule__FQN__Group_1__0 )* )
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:1415:1: ( rule__FQN__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFQNAccess().getGroup_1()); 
            }
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:1416:1: ( rule__FQN__Group_1__0 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==20) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:1416:2: rule__FQN__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__FQN__Group_1__0_in_rule__FQN__Group__1__Impl2755);
            	    rule__FQN__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFQNAccess().getGroup_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FQN__Group__1__Impl"


    // $ANTLR start "rule__FQN__Group_1__0"
    // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:1430:1: rule__FQN__Group_1__0 : rule__FQN__Group_1__0__Impl rule__FQN__Group_1__1 ;
    public final void rule__FQN__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:1434:1: ( rule__FQN__Group_1__0__Impl rule__FQN__Group_1__1 )
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:1435:2: rule__FQN__Group_1__0__Impl rule__FQN__Group_1__1
            {
            pushFollow(FOLLOW_rule__FQN__Group_1__0__Impl_in_rule__FQN__Group_1__02790);
            rule__FQN__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__FQN__Group_1__1_in_rule__FQN__Group_1__02793);
            rule__FQN__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FQN__Group_1__0"


    // $ANTLR start "rule__FQN__Group_1__0__Impl"
    // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:1442:1: rule__FQN__Group_1__0__Impl : ( '.' ) ;
    public final void rule__FQN__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:1446:1: ( ( '.' ) )
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:1447:1: ( '.' )
            {
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:1447:1: ( '.' )
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:1448:1: '.'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFQNAccess().getFullStopKeyword_1_0()); 
            }
            match(input,20,FOLLOW_20_in_rule__FQN__Group_1__0__Impl2821); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFQNAccess().getFullStopKeyword_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FQN__Group_1__0__Impl"


    // $ANTLR start "rule__FQN__Group_1__1"
    // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:1461:1: rule__FQN__Group_1__1 : rule__FQN__Group_1__1__Impl ;
    public final void rule__FQN__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:1465:1: ( rule__FQN__Group_1__1__Impl )
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:1466:2: rule__FQN__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__FQN__Group_1__1__Impl_in_rule__FQN__Group_1__12852);
            rule__FQN__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FQN__Group_1__1"


    // $ANTLR start "rule__FQN__Group_1__1__Impl"
    // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:1472:1: rule__FQN__Group_1__1__Impl : ( ( RULE_ID ) ) ;
    public final void rule__FQN__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:1476:1: ( ( ( RULE_ID ) ) )
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:1477:1: ( ( RULE_ID ) )
            {
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:1477:1: ( ( RULE_ID ) )
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:1478:1: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFQNAccess().getIDTerminalRuleCall_1_1()); 
            }
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:1479:1: ( RULE_ID )
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:1479:3: RULE_ID
            {
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__FQN__Group_1__1__Impl2880); if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFQNAccess().getIDTerminalRuleCall_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FQN__Group_1__1__Impl"


    // $ANTLR start "rule__ArchitectureFramework__NameAssignment_2"
    // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:1494:1: rule__ArchitectureFramework__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__ArchitectureFramework__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:1498:1: ( ( RULE_ID ) )
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:1499:1: ( RULE_ID )
            {
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:1499:1: ( RULE_ID )
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:1500:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArchitectureFrameworkAccess().getNameIDTerminalRuleCall_2_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ArchitectureFramework__NameAssignment_22919); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getArchitectureFrameworkAccess().getNameIDTerminalRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArchitectureFramework__NameAssignment_2"


    // $ANTLR start "rule__ArchitectureFramework__DescriptionAssignment_4_1"
    // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:1509:1: rule__ArchitectureFramework__DescriptionAssignment_4_1 : ( RULE_STRING ) ;
    public final void rule__ArchitectureFramework__DescriptionAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:1513:1: ( ( RULE_STRING ) )
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:1514:1: ( RULE_STRING )
            {
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:1514:1: ( RULE_STRING )
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:1515:1: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArchitectureFrameworkAccess().getDescriptionSTRINGTerminalRuleCall_4_1_0()); 
            }
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__ArchitectureFramework__DescriptionAssignment_4_12950); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getArchitectureFrameworkAccess().getDescriptionSTRINGTerminalRuleCall_4_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArchitectureFramework__DescriptionAssignment_4_1"


    // $ANTLR start "rule__ArchitectureFramework__ShortNameAssignment_5_1"
    // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:1524:1: rule__ArchitectureFramework__ShortNameAssignment_5_1 : ( RULE_STRING ) ;
    public final void rule__ArchitectureFramework__ShortNameAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:1528:1: ( ( RULE_STRING ) )
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:1529:1: ( RULE_STRING )
            {
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:1529:1: ( RULE_STRING )
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:1530:1: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArchitectureFrameworkAccess().getShortNameSTRINGTerminalRuleCall_5_1_0()); 
            }
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__ArchitectureFramework__ShortNameAssignment_5_12981); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getArchitectureFrameworkAccess().getShortNameSTRINGTerminalRuleCall_5_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArchitectureFramework__ShortNameAssignment_5_1"


    // $ANTLR start "rule__ArchitectureFramework__Af_viewpointsAssignment_6"
    // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:1539:1: rule__ArchitectureFramework__Af_viewpointsAssignment_6 : ( ruleViewpoints ) ;
    public final void rule__ArchitectureFramework__Af_viewpointsAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:1543:1: ( ( ruleViewpoints ) )
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:1544:1: ( ruleViewpoints )
            {
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:1544:1: ( ruleViewpoints )
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:1545:1: ruleViewpoints
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArchitectureFrameworkAccess().getAf_viewpointsViewpointsParserRuleCall_6_0()); 
            }
            pushFollow(FOLLOW_ruleViewpoints_in_rule__ArchitectureFramework__Af_viewpointsAssignment_63012);
            ruleViewpoints();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getArchitectureFrameworkAccess().getAf_viewpointsViewpointsParserRuleCall_6_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArchitectureFramework__Af_viewpointsAssignment_6"


    // $ANTLR start "rule__ArchitectureFramework__Owned_configurationAssignment_7"
    // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:1554:1: rule__ArchitectureFramework__Owned_configurationAssignment_7 : ( ruleConfiguration ) ;
    public final void rule__ArchitectureFramework__Owned_configurationAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:1558:1: ( ( ruleConfiguration ) )
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:1559:1: ( ruleConfiguration )
            {
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:1559:1: ( ruleConfiguration )
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:1560:1: ruleConfiguration
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArchitectureFrameworkAccess().getOwned_configurationConfigurationParserRuleCall_7_0()); 
            }
            pushFollow(FOLLOW_ruleConfiguration_in_rule__ArchitectureFramework__Owned_configurationAssignment_73043);
            ruleConfiguration();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getArchitectureFrameworkAccess().getOwned_configurationConfigurationParserRuleCall_7_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArchitectureFramework__Owned_configurationAssignment_7"


    // $ANTLR start "rule__Configuration__Owned_elementAssignment_3_0"
    // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:1569:1: rule__Configuration__Owned_elementAssignment_3_0 : ( ruleConfigurationElement ) ;
    public final void rule__Configuration__Owned_elementAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:1573:1: ( ( ruleConfigurationElement ) )
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:1574:1: ( ruleConfigurationElement )
            {
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:1574:1: ( ruleConfigurationElement )
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:1575:1: ruleConfigurationElement
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConfigurationAccess().getOwned_elementConfigurationElementParserRuleCall_3_0_0()); 
            }
            pushFollow(FOLLOW_ruleConfigurationElement_in_rule__Configuration__Owned_elementAssignment_3_03074);
            ruleConfigurationElement();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConfigurationAccess().getOwned_elementConfigurationElementParserRuleCall_3_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Configuration__Owned_elementAssignment_3_0"


    // $ANTLR start "rule__Configuration__Owned_elementAssignment_3_1_1"
    // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:1584:1: rule__Configuration__Owned_elementAssignment_3_1_1 : ( ruleConfigurationElement ) ;
    public final void rule__Configuration__Owned_elementAssignment_3_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:1588:1: ( ( ruleConfigurationElement ) )
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:1589:1: ( ruleConfigurationElement )
            {
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:1589:1: ( ruleConfigurationElement )
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:1590:1: ruleConfigurationElement
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConfigurationAccess().getOwned_elementConfigurationElementParserRuleCall_3_1_1_0()); 
            }
            pushFollow(FOLLOW_ruleConfigurationElement_in_rule__Configuration__Owned_elementAssignment_3_1_13105);
            ruleConfigurationElement();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConfigurationAccess().getOwned_elementConfigurationElementParserRuleCall_3_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Configuration__Owned_elementAssignment_3_1_1"


    // $ANTLR start "rule__GenerationConfiguration__RootProjectNameAssignment_1_1"
    // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:1599:1: rule__GenerationConfiguration__RootProjectNameAssignment_1_1 : ( ruleFQN ) ;
    public final void rule__GenerationConfiguration__RootProjectNameAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:1603:1: ( ( ruleFQN ) )
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:1604:1: ( ruleFQN )
            {
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:1604:1: ( ruleFQN )
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:1605:1: ruleFQN
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGenerationConfigurationAccess().getRootProjectNameFQNParserRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_ruleFQN_in_rule__GenerationConfiguration__RootProjectNameAssignment_1_13136);
            ruleFQN();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGenerationConfigurationAccess().getRootProjectNameFQNParserRuleCall_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GenerationConfiguration__RootProjectNameAssignment_1_1"


    // $ANTLR start "rule__Viewpoints__Owned_viewpointsAssignment_3_0"
    // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:1614:1: rule__Viewpoints__Owned_viewpointsAssignment_3_0 : ( ( RULE_ID ) ) ;
    public final void rule__Viewpoints__Owned_viewpointsAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:1618:1: ( ( ( RULE_ID ) ) )
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:1619:1: ( ( RULE_ID ) )
            {
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:1619:1: ( ( RULE_ID ) )
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:1620:1: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getViewpointsAccess().getOwned_viewpointsViewpointCrossReference_3_0_0()); 
            }
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:1621:1: ( RULE_ID )
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:1622:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getViewpointsAccess().getOwned_viewpointsViewpointIDTerminalRuleCall_3_0_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Viewpoints__Owned_viewpointsAssignment_3_03171); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getViewpointsAccess().getOwned_viewpointsViewpointIDTerminalRuleCall_3_0_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getViewpointsAccess().getOwned_viewpointsViewpointCrossReference_3_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Viewpoints__Owned_viewpointsAssignment_3_0"


    // $ANTLR start "rule__Viewpoints__Owned_viewpointsAssignment_3_1_1"
    // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:1633:1: rule__Viewpoints__Owned_viewpointsAssignment_3_1_1 : ( ( RULE_ID ) ) ;
    public final void rule__Viewpoints__Owned_viewpointsAssignment_3_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:1637:1: ( ( ( RULE_ID ) ) )
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:1638:1: ( ( RULE_ID ) )
            {
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:1638:1: ( ( RULE_ID ) )
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:1639:1: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getViewpointsAccess().getOwned_viewpointsViewpointCrossReference_3_1_1_0()); 
            }
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:1640:1: ( RULE_ID )
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:1641:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getViewpointsAccess().getOwned_viewpointsViewpointIDTerminalRuleCall_3_1_1_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Viewpoints__Owned_viewpointsAssignment_3_1_13210); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getViewpointsAccess().getOwned_viewpointsViewpointIDTerminalRuleCall_3_1_1_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getViewpointsAccess().getOwned_viewpointsViewpointCrossReference_3_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Viewpoints__Owned_viewpointsAssignment_3_1_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleNamedElement_in_entryRuleNamedElement67 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNamedElement74 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArchitectureFramework_in_ruleNamedElement100 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArchitectureFramework_in_entryRuleArchitectureFramework126 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleArchitectureFramework133 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArchitectureFramework__Group__0_in_ruleArchitectureFramework159 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConfiguration_in_entryRuleConfiguration186 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConfiguration193 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Configuration__Group__0_in_ruleConfiguration219 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConfigurationElement_in_entryRuleConfigurationElement246 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConfigurationElement253 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGenerationConfiguration_in_ruleConfigurationElement279 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGenerationConfiguration_in_entryRuleGenerationConfiguration305 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGenerationConfiguration312 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GenerationConfiguration__Group__0_in_ruleGenerationConfiguration338 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleViewpoints_in_entryRuleViewpoints365 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleViewpoints372 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Viewpoints__Group__0_in_ruleViewpoints398 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFQN_in_entryRuleFQN425 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFQN432 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FQN__Group__0_in_ruleFQN458 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArchitectureFramework__Group__0__Impl_in_rule__ArchitectureFramework__Group__0492 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_rule__ArchitectureFramework__Group__1_in_rule__ArchitectureFramework__Group__0495 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArchitectureFramework__Group__1__Impl_in_rule__ArchitectureFramework__Group__1553 = new BitSet(new long[]{0x0000000000001010L});
    public static final BitSet FOLLOW_rule__ArchitectureFramework__Group__2_in_rule__ArchitectureFramework__Group__1556 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__ArchitectureFramework__Group__1__Impl584 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArchitectureFramework__Group__2__Impl_in_rule__ArchitectureFramework__Group__2615 = new BitSet(new long[]{0x0000000000001010L});
    public static final BitSet FOLLOW_rule__ArchitectureFramework__Group__3_in_rule__ArchitectureFramework__Group__2618 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArchitectureFramework__NameAssignment_2_in_rule__ArchitectureFramework__Group__2__Impl645 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArchitectureFramework__Group__3__Impl_in_rule__ArchitectureFramework__Group__3676 = new BitSet(new long[]{0x000000000009C000L});
    public static final BitSet FOLLOW_rule__ArchitectureFramework__Group__4_in_rule__ArchitectureFramework__Group__3679 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__ArchitectureFramework__Group__3__Impl707 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArchitectureFramework__Group__4__Impl_in_rule__ArchitectureFramework__Group__4738 = new BitSet(new long[]{0x000000000009C000L});
    public static final BitSet FOLLOW_rule__ArchitectureFramework__Group__5_in_rule__ArchitectureFramework__Group__4741 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArchitectureFramework__Group_4__0_in_rule__ArchitectureFramework__Group__4__Impl768 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArchitectureFramework__Group__5__Impl_in_rule__ArchitectureFramework__Group__5799 = new BitSet(new long[]{0x000000000009C000L});
    public static final BitSet FOLLOW_rule__ArchitectureFramework__Group__6_in_rule__ArchitectureFramework__Group__5802 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArchitectureFramework__Group_5__0_in_rule__ArchitectureFramework__Group__5__Impl829 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArchitectureFramework__Group__6__Impl_in_rule__ArchitectureFramework__Group__6860 = new BitSet(new long[]{0x000000000009C000L});
    public static final BitSet FOLLOW_rule__ArchitectureFramework__Group__7_in_rule__ArchitectureFramework__Group__6863 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArchitectureFramework__Af_viewpointsAssignment_6_in_rule__ArchitectureFramework__Group__6__Impl890 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArchitectureFramework__Group__7__Impl_in_rule__ArchitectureFramework__Group__7921 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__ArchitectureFramework__Group__8_in_rule__ArchitectureFramework__Group__7924 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArchitectureFramework__Owned_configurationAssignment_7_in_rule__ArchitectureFramework__Group__7__Impl951 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArchitectureFramework__Group__8__Impl_in_rule__ArchitectureFramework__Group__8981 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__ArchitectureFramework__Group__8__Impl1009 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArchitectureFramework__Group_4__0__Impl_in_rule__ArchitectureFramework__Group_4__01058 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__ArchitectureFramework__Group_4__1_in_rule__ArchitectureFramework__Group_4__01061 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__ArchitectureFramework__Group_4__0__Impl1089 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArchitectureFramework__Group_4__1__Impl_in_rule__ArchitectureFramework__Group_4__11120 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArchitectureFramework__DescriptionAssignment_4_1_in_rule__ArchitectureFramework__Group_4__1__Impl1147 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArchitectureFramework__Group_5__0__Impl_in_rule__ArchitectureFramework__Group_5__01181 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__ArchitectureFramework__Group_5__1_in_rule__ArchitectureFramework__Group_5__01184 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__ArchitectureFramework__Group_5__0__Impl1212 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArchitectureFramework__Group_5__1__Impl_in_rule__ArchitectureFramework__Group_5__11243 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArchitectureFramework__ShortNameAssignment_5_1_in_rule__ArchitectureFramework__Group_5__1__Impl1270 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Configuration__Group__0__Impl_in_rule__Configuration__Group__01304 = new BitSet(new long[]{0x000000000009C000L});
    public static final BitSet FOLLOW_rule__Configuration__Group__1_in_rule__Configuration__Group__01307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Configuration__Group__1__Impl_in_rule__Configuration__Group__11365 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__Configuration__Group__2_in_rule__Configuration__Group__11368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Configuration__Group__1__Impl1396 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Configuration__Group__2__Impl_in_rule__Configuration__Group__21427 = new BitSet(new long[]{0x0000000000042000L});
    public static final BitSet FOLLOW_rule__Configuration__Group__3_in_rule__Configuration__Group__21430 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__Configuration__Group__2__Impl1458 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Configuration__Group__3__Impl_in_rule__Configuration__Group__31489 = new BitSet(new long[]{0x0000000000042000L});
    public static final BitSet FOLLOW_rule__Configuration__Group__4_in_rule__Configuration__Group__31492 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Configuration__Group_3__0_in_rule__Configuration__Group__3__Impl1519 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Configuration__Group__4__Impl_in_rule__Configuration__Group__41550 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Configuration__Group__4__Impl1578 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Configuration__Group_3__0__Impl_in_rule__Configuration__Group_3__01619 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__Configuration__Group_3__1_in_rule__Configuration__Group_3__01622 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Configuration__Owned_elementAssignment_3_0_in_rule__Configuration__Group_3__0__Impl1649 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Configuration__Group_3__1__Impl_in_rule__Configuration__Group_3__11679 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Configuration__Group_3_1__0_in_rule__Configuration__Group_3__1__Impl1706 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_rule__Configuration__Group_3_1__0__Impl_in_rule__Configuration__Group_3_1__01741 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__Configuration__Group_3_1__1_in_rule__Configuration__Group_3_1__01744 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Configuration__Group_3_1__0__Impl1772 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Configuration__Group_3_1__1__Impl_in_rule__Configuration__Group_3_1__11803 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Configuration__Owned_elementAssignment_3_1_1_in_rule__Configuration__Group_3_1__1__Impl1830 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GenerationConfiguration__Group__0__Impl_in_rule__GenerationConfiguration__Group__01864 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__GenerationConfiguration__Group__1_in_rule__GenerationConfiguration__Group__01867 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GenerationConfiguration__Group__1__Impl_in_rule__GenerationConfiguration__Group__11925 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GenerationConfiguration__Group_1__0_in_rule__GenerationConfiguration__Group__1__Impl1952 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GenerationConfiguration__Group_1__0__Impl_in_rule__GenerationConfiguration__Group_1__01986 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__GenerationConfiguration__Group_1__1_in_rule__GenerationConfiguration__Group_1__01989 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__GenerationConfiguration__Group_1__0__Impl2017 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GenerationConfiguration__Group_1__1__Impl_in_rule__GenerationConfiguration__Group_1__12048 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GenerationConfiguration__RootProjectNameAssignment_1_1_in_rule__GenerationConfiguration__Group_1__1__Impl2075 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Viewpoints__Group__0__Impl_in_rule__Viewpoints__Group__02109 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__Viewpoints__Group__1_in_rule__Viewpoints__Group__02112 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Viewpoints__Group__1__Impl_in_rule__Viewpoints__Group__12170 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__Viewpoints__Group__2_in_rule__Viewpoints__Group__12173 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Viewpoints__Group__1__Impl2201 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Viewpoints__Group__2__Impl_in_rule__Viewpoints__Group__22232 = new BitSet(new long[]{0x0000000000002010L});
    public static final BitSet FOLLOW_rule__Viewpoints__Group__3_in_rule__Viewpoints__Group__22235 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__Viewpoints__Group__2__Impl2263 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Viewpoints__Group__3__Impl_in_rule__Viewpoints__Group__32294 = new BitSet(new long[]{0x0000000000002010L});
    public static final BitSet FOLLOW_rule__Viewpoints__Group__4_in_rule__Viewpoints__Group__32297 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Viewpoints__Group_3__0_in_rule__Viewpoints__Group__3__Impl2324 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Viewpoints__Group__4__Impl_in_rule__Viewpoints__Group__42355 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Viewpoints__Group__4__Impl2383 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Viewpoints__Group_3__0__Impl_in_rule__Viewpoints__Group_3__02424 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__Viewpoints__Group_3__1_in_rule__Viewpoints__Group_3__02427 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Viewpoints__Owned_viewpointsAssignment_3_0_in_rule__Viewpoints__Group_3__0__Impl2454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Viewpoints__Group_3__1__Impl_in_rule__Viewpoints__Group_3__12484 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Viewpoints__Group_3_1__0_in_rule__Viewpoints__Group_3__1__Impl2511 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_rule__Viewpoints__Group_3_1__0__Impl_in_rule__Viewpoints__Group_3_1__02546 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Viewpoints__Group_3_1__1_in_rule__Viewpoints__Group_3_1__02549 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Viewpoints__Group_3_1__0__Impl2577 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Viewpoints__Group_3_1__1__Impl_in_rule__Viewpoints__Group_3_1__12608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Viewpoints__Owned_viewpointsAssignment_3_1_1_in_rule__Viewpoints__Group_3_1__1__Impl2635 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FQN__Group__0__Impl_in_rule__FQN__Group__02669 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__FQN__Group__1_in_rule__FQN__Group__02672 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__FQN__Group__0__Impl2699 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FQN__Group__1__Impl_in_rule__FQN__Group__12728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FQN__Group_1__0_in_rule__FQN__Group__1__Impl2755 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_rule__FQN__Group_1__0__Impl_in_rule__FQN__Group_1__02790 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__FQN__Group_1__1_in_rule__FQN__Group_1__02793 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__FQN__Group_1__0__Impl2821 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FQN__Group_1__1__Impl_in_rule__FQN__Group_1__12852 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__FQN__Group_1__1__Impl2880 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ArchitectureFramework__NameAssignment_22919 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__ArchitectureFramework__DescriptionAssignment_4_12950 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__ArchitectureFramework__ShortNameAssignment_5_12981 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleViewpoints_in_rule__ArchitectureFramework__Af_viewpointsAssignment_63012 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConfiguration_in_rule__ArchitectureFramework__Owned_configurationAssignment_73043 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConfigurationElement_in_rule__Configuration__Owned_elementAssignment_3_03074 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConfigurationElement_in_rule__Configuration__Owned_elementAssignment_3_1_13105 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFQN_in_rule__GenerationConfiguration__RootProjectNameAssignment_1_13136 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Viewpoints__Owned_viewpointsAssignment_3_03171 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Viewpoints__Owned_viewpointsAssignment_3_1_13210 = new BitSet(new long[]{0x0000000000000002L});

}

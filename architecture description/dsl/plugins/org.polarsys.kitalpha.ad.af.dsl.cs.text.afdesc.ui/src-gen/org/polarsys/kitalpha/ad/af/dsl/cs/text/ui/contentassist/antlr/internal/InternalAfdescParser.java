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
@SuppressWarnings("all")
public class InternalAfdescParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'ArchitectureFramework'", "'{'", "'}'", "'description:'", "'shortName:'", "'Configuration'", "','", "'rootProjectName:'", "'Viewpoints'", "'.'"
    };
    public static final int T__19=19;
    public static final int RULE_ID=4;
    public static final int RULE_STRING=5;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__11=11;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__20=20;
    public static final int RULE_INT=6;
    public static final int RULE_WS=9;
    public static final int RULE_SL_COMMENT=8;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=7;

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
    // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:68:1: entryRuleNamedElement : ruleNamedElement EOF ;
    public final void entryRuleNamedElement() throws RecognitionException {
        try {
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:69:1: ( ruleNamedElement EOF )
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:70:1: ruleNamedElement EOF
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
    // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:77:1: ruleNamedElement : ( ruleArchitectureFramework ) ;
    public final void ruleNamedElement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:81:2: ( ( ruleArchitectureFramework ) )
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:82:1: ( ruleArchitectureFramework )
            {
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:82:1: ( ruleArchitectureFramework )
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:83:1: ruleArchitectureFramework
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
    // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:96:1: entryRuleArchitectureFramework : ruleArchitectureFramework EOF ;
    public final void entryRuleArchitectureFramework() throws RecognitionException {
        try {
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:97:1: ( ruleArchitectureFramework EOF )
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:98:1: ruleArchitectureFramework EOF
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
    // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:105:1: ruleArchitectureFramework : ( ( rule__ArchitectureFramework__Group__0 ) ) ;
    public final void ruleArchitectureFramework() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:109:2: ( ( ( rule__ArchitectureFramework__Group__0 ) ) )
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:110:1: ( ( rule__ArchitectureFramework__Group__0 ) )
            {
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:110:1: ( ( rule__ArchitectureFramework__Group__0 ) )
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:111:1: ( rule__ArchitectureFramework__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArchitectureFrameworkAccess().getGroup()); 
            }
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:112:1: ( rule__ArchitectureFramework__Group__0 )
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:112:2: rule__ArchitectureFramework__Group__0
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
    // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:124:1: entryRuleConfiguration : ruleConfiguration EOF ;
    public final void entryRuleConfiguration() throws RecognitionException {
        try {
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:125:1: ( ruleConfiguration EOF )
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:126:1: ruleConfiguration EOF
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
    // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:133:1: ruleConfiguration : ( ( rule__Configuration__Group__0 ) ) ;
    public final void ruleConfiguration() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:137:2: ( ( ( rule__Configuration__Group__0 ) ) )
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:138:1: ( ( rule__Configuration__Group__0 ) )
            {
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:138:1: ( ( rule__Configuration__Group__0 ) )
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:139:1: ( rule__Configuration__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConfigurationAccess().getGroup()); 
            }
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:140:1: ( rule__Configuration__Group__0 )
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:140:2: rule__Configuration__Group__0
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
    // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:152:1: entryRuleConfigurationElement : ruleConfigurationElement EOF ;
    public final void entryRuleConfigurationElement() throws RecognitionException {
        try {
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:153:1: ( ruleConfigurationElement EOF )
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:154:1: ruleConfigurationElement EOF
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
    // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:161:1: ruleConfigurationElement : ( ruleGenerationConfiguration ) ;
    public final void ruleConfigurationElement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:165:2: ( ( ruleGenerationConfiguration ) )
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:166:1: ( ruleGenerationConfiguration )
            {
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:166:1: ( ruleGenerationConfiguration )
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:167:1: ruleGenerationConfiguration
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
    // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:180:1: entryRuleGenerationConfiguration : ruleGenerationConfiguration EOF ;
    public final void entryRuleGenerationConfiguration() throws RecognitionException {
        try {
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:181:1: ( ruleGenerationConfiguration EOF )
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:182:1: ruleGenerationConfiguration EOF
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
    // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:189:1: ruleGenerationConfiguration : ( ( rule__GenerationConfiguration__Group__0 ) ) ;
    public final void ruleGenerationConfiguration() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:193:2: ( ( ( rule__GenerationConfiguration__Group__0 ) ) )
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:194:1: ( ( rule__GenerationConfiguration__Group__0 ) )
            {
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:194:1: ( ( rule__GenerationConfiguration__Group__0 ) )
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:195:1: ( rule__GenerationConfiguration__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGenerationConfigurationAccess().getGroup()); 
            }
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:196:1: ( rule__GenerationConfiguration__Group__0 )
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:196:2: rule__GenerationConfiguration__Group__0
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
    // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:208:1: entryRuleViewpoints : ruleViewpoints EOF ;
    public final void entryRuleViewpoints() throws RecognitionException {
        try {
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:209:1: ( ruleViewpoints EOF )
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:210:1: ruleViewpoints EOF
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
    // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:217:1: ruleViewpoints : ( ( rule__Viewpoints__Group__0 ) ) ;
    public final void ruleViewpoints() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:221:2: ( ( ( rule__Viewpoints__Group__0 ) ) )
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:222:1: ( ( rule__Viewpoints__Group__0 ) )
            {
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:222:1: ( ( rule__Viewpoints__Group__0 ) )
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:223:1: ( rule__Viewpoints__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getViewpointsAccess().getGroup()); 
            }
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:224:1: ( rule__Viewpoints__Group__0 )
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:224:2: rule__Viewpoints__Group__0
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
    // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:236:1: entryRuleFQN : ruleFQN EOF ;
    public final void entryRuleFQN() throws RecognitionException {
        try {
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:237:1: ( ruleFQN EOF )
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:238:1: ruleFQN EOF
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
    // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:245:1: ruleFQN : ( ( rule__FQN__Group__0 ) ) ;
    public final void ruleFQN() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:249:2: ( ( ( rule__FQN__Group__0 ) ) )
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:250:1: ( ( rule__FQN__Group__0 ) )
            {
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:250:1: ( ( rule__FQN__Group__0 ) )
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:251:1: ( rule__FQN__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFQNAccess().getGroup()); 
            }
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:252:1: ( rule__FQN__Group__0 )
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:252:2: rule__FQN__Group__0
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
    // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:266:1: rule__ArchitectureFramework__Group__0 : rule__ArchitectureFramework__Group__0__Impl rule__ArchitectureFramework__Group__1 ;
    public final void rule__ArchitectureFramework__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:270:1: ( rule__ArchitectureFramework__Group__0__Impl rule__ArchitectureFramework__Group__1 )
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:271:2: rule__ArchitectureFramework__Group__0__Impl rule__ArchitectureFramework__Group__1
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
    // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:278:1: rule__ArchitectureFramework__Group__0__Impl : ( () ) ;
    public final void rule__ArchitectureFramework__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:282:1: ( ( () ) )
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:283:1: ( () )
            {
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:283:1: ( () )
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:284:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArchitectureFrameworkAccess().getArchitectureFrameworkAction_0()); 
            }
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:285:1: ()
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:287:1: 
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
    // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:297:1: rule__ArchitectureFramework__Group__1 : rule__ArchitectureFramework__Group__1__Impl rule__ArchitectureFramework__Group__2 ;
    public final void rule__ArchitectureFramework__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:301:1: ( rule__ArchitectureFramework__Group__1__Impl rule__ArchitectureFramework__Group__2 )
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:302:2: rule__ArchitectureFramework__Group__1__Impl rule__ArchitectureFramework__Group__2
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
    // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:309:1: rule__ArchitectureFramework__Group__1__Impl : ( 'ArchitectureFramework' ) ;
    public final void rule__ArchitectureFramework__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:313:1: ( ( 'ArchitectureFramework' ) )
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:314:1: ( 'ArchitectureFramework' )
            {
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:314:1: ( 'ArchitectureFramework' )
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:315:1: 'ArchitectureFramework'
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
    // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:328:1: rule__ArchitectureFramework__Group__2 : rule__ArchitectureFramework__Group__2__Impl rule__ArchitectureFramework__Group__3 ;
    public final void rule__ArchitectureFramework__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:332:1: ( rule__ArchitectureFramework__Group__2__Impl rule__ArchitectureFramework__Group__3 )
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:333:2: rule__ArchitectureFramework__Group__2__Impl rule__ArchitectureFramework__Group__3
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
    // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:340:1: rule__ArchitectureFramework__Group__2__Impl : ( ( rule__ArchitectureFramework__NameAssignment_2 )? ) ;
    public final void rule__ArchitectureFramework__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:344:1: ( ( ( rule__ArchitectureFramework__NameAssignment_2 )? ) )
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:345:1: ( ( rule__ArchitectureFramework__NameAssignment_2 )? )
            {
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:345:1: ( ( rule__ArchitectureFramework__NameAssignment_2 )? )
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:346:1: ( rule__ArchitectureFramework__NameAssignment_2 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArchitectureFrameworkAccess().getNameAssignment_2()); 
            }
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:347:1: ( rule__ArchitectureFramework__NameAssignment_2 )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==RULE_ID) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:347:2: rule__ArchitectureFramework__NameAssignment_2
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
    // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:357:1: rule__ArchitectureFramework__Group__3 : rule__ArchitectureFramework__Group__3__Impl rule__ArchitectureFramework__Group__4 ;
    public final void rule__ArchitectureFramework__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:361:1: ( rule__ArchitectureFramework__Group__3__Impl rule__ArchitectureFramework__Group__4 )
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:362:2: rule__ArchitectureFramework__Group__3__Impl rule__ArchitectureFramework__Group__4
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
    // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:369:1: rule__ArchitectureFramework__Group__3__Impl : ( '{' ) ;
    public final void rule__ArchitectureFramework__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:373:1: ( ( '{' ) )
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:374:1: ( '{' )
            {
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:374:1: ( '{' )
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:375:1: '{'
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
    // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:388:1: rule__ArchitectureFramework__Group__4 : rule__ArchitectureFramework__Group__4__Impl rule__ArchitectureFramework__Group__5 ;
    public final void rule__ArchitectureFramework__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:392:1: ( rule__ArchitectureFramework__Group__4__Impl rule__ArchitectureFramework__Group__5 )
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:393:2: rule__ArchitectureFramework__Group__4__Impl rule__ArchitectureFramework__Group__5
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
    // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:400:1: rule__ArchitectureFramework__Group__4__Impl : ( ( rule__ArchitectureFramework__Group_4__0 )? ) ;
    public final void rule__ArchitectureFramework__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:404:1: ( ( ( rule__ArchitectureFramework__Group_4__0 )? ) )
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:405:1: ( ( rule__ArchitectureFramework__Group_4__0 )? )
            {
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:405:1: ( ( rule__ArchitectureFramework__Group_4__0 )? )
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:406:1: ( rule__ArchitectureFramework__Group_4__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArchitectureFrameworkAccess().getGroup_4()); 
            }
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:407:1: ( rule__ArchitectureFramework__Group_4__0 )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==14) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:407:2: rule__ArchitectureFramework__Group_4__0
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
    // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:417:1: rule__ArchitectureFramework__Group__5 : rule__ArchitectureFramework__Group__5__Impl rule__ArchitectureFramework__Group__6 ;
    public final void rule__ArchitectureFramework__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:421:1: ( rule__ArchitectureFramework__Group__5__Impl rule__ArchitectureFramework__Group__6 )
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:422:2: rule__ArchitectureFramework__Group__5__Impl rule__ArchitectureFramework__Group__6
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
    // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:429:1: rule__ArchitectureFramework__Group__5__Impl : ( ( rule__ArchitectureFramework__Group_5__0 )? ) ;
    public final void rule__ArchitectureFramework__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:433:1: ( ( ( rule__ArchitectureFramework__Group_5__0 )? ) )
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:434:1: ( ( rule__ArchitectureFramework__Group_5__0 )? )
            {
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:434:1: ( ( rule__ArchitectureFramework__Group_5__0 )? )
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:435:1: ( rule__ArchitectureFramework__Group_5__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArchitectureFrameworkAccess().getGroup_5()); 
            }
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:436:1: ( rule__ArchitectureFramework__Group_5__0 )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==15) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:436:2: rule__ArchitectureFramework__Group_5__0
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
    // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:446:1: rule__ArchitectureFramework__Group__6 : rule__ArchitectureFramework__Group__6__Impl rule__ArchitectureFramework__Group__7 ;
    public final void rule__ArchitectureFramework__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:450:1: ( rule__ArchitectureFramework__Group__6__Impl rule__ArchitectureFramework__Group__7 )
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:451:2: rule__ArchitectureFramework__Group__6__Impl rule__ArchitectureFramework__Group__7
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
    // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:458:1: rule__ArchitectureFramework__Group__6__Impl : ( ( rule__ArchitectureFramework__Af_viewpointsAssignment_6 )? ) ;
    public final void rule__ArchitectureFramework__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:462:1: ( ( ( rule__ArchitectureFramework__Af_viewpointsAssignment_6 )? ) )
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:463:1: ( ( rule__ArchitectureFramework__Af_viewpointsAssignment_6 )? )
            {
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:463:1: ( ( rule__ArchitectureFramework__Af_viewpointsAssignment_6 )? )
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:464:1: ( rule__ArchitectureFramework__Af_viewpointsAssignment_6 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArchitectureFrameworkAccess().getAf_viewpointsAssignment_6()); 
            }
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:465:1: ( rule__ArchitectureFramework__Af_viewpointsAssignment_6 )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==19) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:465:2: rule__ArchitectureFramework__Af_viewpointsAssignment_6
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
    // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:475:1: rule__ArchitectureFramework__Group__7 : rule__ArchitectureFramework__Group__7__Impl rule__ArchitectureFramework__Group__8 ;
    public final void rule__ArchitectureFramework__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:479:1: ( rule__ArchitectureFramework__Group__7__Impl rule__ArchitectureFramework__Group__8 )
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:480:2: rule__ArchitectureFramework__Group__7__Impl rule__ArchitectureFramework__Group__8
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
    // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:487:1: rule__ArchitectureFramework__Group__7__Impl : ( ( rule__ArchitectureFramework__Owned_configurationAssignment_7 ) ) ;
    public final void rule__ArchitectureFramework__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:491:1: ( ( ( rule__ArchitectureFramework__Owned_configurationAssignment_7 ) ) )
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:492:1: ( ( rule__ArchitectureFramework__Owned_configurationAssignment_7 ) )
            {
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:492:1: ( ( rule__ArchitectureFramework__Owned_configurationAssignment_7 ) )
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:493:1: ( rule__ArchitectureFramework__Owned_configurationAssignment_7 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArchitectureFrameworkAccess().getOwned_configurationAssignment_7()); 
            }
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:494:1: ( rule__ArchitectureFramework__Owned_configurationAssignment_7 )
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:494:2: rule__ArchitectureFramework__Owned_configurationAssignment_7
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
    // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:504:1: rule__ArchitectureFramework__Group__8 : rule__ArchitectureFramework__Group__8__Impl ;
    public final void rule__ArchitectureFramework__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:508:1: ( rule__ArchitectureFramework__Group__8__Impl )
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:509:2: rule__ArchitectureFramework__Group__8__Impl
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
    // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:515:1: rule__ArchitectureFramework__Group__8__Impl : ( '}' ) ;
    public final void rule__ArchitectureFramework__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:519:1: ( ( '}' ) )
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:520:1: ( '}' )
            {
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:520:1: ( '}' )
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:521:1: '}'
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
    // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:552:1: rule__ArchitectureFramework__Group_4__0 : rule__ArchitectureFramework__Group_4__0__Impl rule__ArchitectureFramework__Group_4__1 ;
    public final void rule__ArchitectureFramework__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:556:1: ( rule__ArchitectureFramework__Group_4__0__Impl rule__ArchitectureFramework__Group_4__1 )
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:557:2: rule__ArchitectureFramework__Group_4__0__Impl rule__ArchitectureFramework__Group_4__1
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
    // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:564:1: rule__ArchitectureFramework__Group_4__0__Impl : ( 'description:' ) ;
    public final void rule__ArchitectureFramework__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:568:1: ( ( 'description:' ) )
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:569:1: ( 'description:' )
            {
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:569:1: ( 'description:' )
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:570:1: 'description:'
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
    // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:583:1: rule__ArchitectureFramework__Group_4__1 : rule__ArchitectureFramework__Group_4__1__Impl ;
    public final void rule__ArchitectureFramework__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:587:1: ( rule__ArchitectureFramework__Group_4__1__Impl )
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:588:2: rule__ArchitectureFramework__Group_4__1__Impl
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
    // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:594:1: rule__ArchitectureFramework__Group_4__1__Impl : ( ( rule__ArchitectureFramework__DescriptionAssignment_4_1 ) ) ;
    public final void rule__ArchitectureFramework__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:598:1: ( ( ( rule__ArchitectureFramework__DescriptionAssignment_4_1 ) ) )
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:599:1: ( ( rule__ArchitectureFramework__DescriptionAssignment_4_1 ) )
            {
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:599:1: ( ( rule__ArchitectureFramework__DescriptionAssignment_4_1 ) )
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:600:1: ( rule__ArchitectureFramework__DescriptionAssignment_4_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArchitectureFrameworkAccess().getDescriptionAssignment_4_1()); 
            }
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:601:1: ( rule__ArchitectureFramework__DescriptionAssignment_4_1 )
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:601:2: rule__ArchitectureFramework__DescriptionAssignment_4_1
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
    // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:615:1: rule__ArchitectureFramework__Group_5__0 : rule__ArchitectureFramework__Group_5__0__Impl rule__ArchitectureFramework__Group_5__1 ;
    public final void rule__ArchitectureFramework__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:619:1: ( rule__ArchitectureFramework__Group_5__0__Impl rule__ArchitectureFramework__Group_5__1 )
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:620:2: rule__ArchitectureFramework__Group_5__0__Impl rule__ArchitectureFramework__Group_5__1
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
    // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:627:1: rule__ArchitectureFramework__Group_5__0__Impl : ( 'shortName:' ) ;
    public final void rule__ArchitectureFramework__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:631:1: ( ( 'shortName:' ) )
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:632:1: ( 'shortName:' )
            {
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:632:1: ( 'shortName:' )
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:633:1: 'shortName:'
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
    // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:646:1: rule__ArchitectureFramework__Group_5__1 : rule__ArchitectureFramework__Group_5__1__Impl ;
    public final void rule__ArchitectureFramework__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:650:1: ( rule__ArchitectureFramework__Group_5__1__Impl )
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:651:2: rule__ArchitectureFramework__Group_5__1__Impl
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
    // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:657:1: rule__ArchitectureFramework__Group_5__1__Impl : ( ( rule__ArchitectureFramework__ShortNameAssignment_5_1 ) ) ;
    public final void rule__ArchitectureFramework__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:661:1: ( ( ( rule__ArchitectureFramework__ShortNameAssignment_5_1 ) ) )
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:662:1: ( ( rule__ArchitectureFramework__ShortNameAssignment_5_1 ) )
            {
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:662:1: ( ( rule__ArchitectureFramework__ShortNameAssignment_5_1 ) )
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:663:1: ( rule__ArchitectureFramework__ShortNameAssignment_5_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArchitectureFrameworkAccess().getShortNameAssignment_5_1()); 
            }
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:664:1: ( rule__ArchitectureFramework__ShortNameAssignment_5_1 )
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:664:2: rule__ArchitectureFramework__ShortNameAssignment_5_1
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
    // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:678:1: rule__Configuration__Group__0 : rule__Configuration__Group__0__Impl rule__Configuration__Group__1 ;
    public final void rule__Configuration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:682:1: ( rule__Configuration__Group__0__Impl rule__Configuration__Group__1 )
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:683:2: rule__Configuration__Group__0__Impl rule__Configuration__Group__1
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
    // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:690:1: rule__Configuration__Group__0__Impl : ( () ) ;
    public final void rule__Configuration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:694:1: ( ( () ) )
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:695:1: ( () )
            {
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:695:1: ( () )
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:696:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConfigurationAccess().getConfigurationAction_0()); 
            }
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:697:1: ()
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:699:1: 
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
    // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:709:1: rule__Configuration__Group__1 : rule__Configuration__Group__1__Impl rule__Configuration__Group__2 ;
    public final void rule__Configuration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:713:1: ( rule__Configuration__Group__1__Impl rule__Configuration__Group__2 )
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:714:2: rule__Configuration__Group__1__Impl rule__Configuration__Group__2
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
    // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:721:1: rule__Configuration__Group__1__Impl : ( 'Configuration' ) ;
    public final void rule__Configuration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:725:1: ( ( 'Configuration' ) )
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:726:1: ( 'Configuration' )
            {
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:726:1: ( 'Configuration' )
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:727:1: 'Configuration'
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
    // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:740:1: rule__Configuration__Group__2 : rule__Configuration__Group__2__Impl rule__Configuration__Group__3 ;
    public final void rule__Configuration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:744:1: ( rule__Configuration__Group__2__Impl rule__Configuration__Group__3 )
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:745:2: rule__Configuration__Group__2__Impl rule__Configuration__Group__3
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
    // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:752:1: rule__Configuration__Group__2__Impl : ( '{' ) ;
    public final void rule__Configuration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:756:1: ( ( '{' ) )
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:757:1: ( '{' )
            {
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:757:1: ( '{' )
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:758:1: '{'
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
    // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:771:1: rule__Configuration__Group__3 : rule__Configuration__Group__3__Impl rule__Configuration__Group__4 ;
    public final void rule__Configuration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:775:1: ( rule__Configuration__Group__3__Impl rule__Configuration__Group__4 )
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:776:2: rule__Configuration__Group__3__Impl rule__Configuration__Group__4
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
    // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:783:1: rule__Configuration__Group__3__Impl : ( ( rule__Configuration__Group_3__0 )? ) ;
    public final void rule__Configuration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:787:1: ( ( ( rule__Configuration__Group_3__0 )? ) )
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:788:1: ( ( rule__Configuration__Group_3__0 )? )
            {
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:788:1: ( ( rule__Configuration__Group_3__0 )? )
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:789:1: ( rule__Configuration__Group_3__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConfigurationAccess().getGroup_3()); 
            }
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:790:1: ( rule__Configuration__Group_3__0 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==18) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:790:2: rule__Configuration__Group_3__0
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
    // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:800:1: rule__Configuration__Group__4 : rule__Configuration__Group__4__Impl ;
    public final void rule__Configuration__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:804:1: ( rule__Configuration__Group__4__Impl )
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:805:2: rule__Configuration__Group__4__Impl
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
    // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:811:1: rule__Configuration__Group__4__Impl : ( '}' ) ;
    public final void rule__Configuration__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:815:1: ( ( '}' ) )
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:816:1: ( '}' )
            {
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:816:1: ( '}' )
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:817:1: '}'
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
    // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:840:1: rule__Configuration__Group_3__0 : rule__Configuration__Group_3__0__Impl rule__Configuration__Group_3__1 ;
    public final void rule__Configuration__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:844:1: ( rule__Configuration__Group_3__0__Impl rule__Configuration__Group_3__1 )
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:845:2: rule__Configuration__Group_3__0__Impl rule__Configuration__Group_3__1
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
    // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:852:1: rule__Configuration__Group_3__0__Impl : ( ( rule__Configuration__Owned_elementAssignment_3_0 ) ) ;
    public final void rule__Configuration__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:856:1: ( ( ( rule__Configuration__Owned_elementAssignment_3_0 ) ) )
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:857:1: ( ( rule__Configuration__Owned_elementAssignment_3_0 ) )
            {
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:857:1: ( ( rule__Configuration__Owned_elementAssignment_3_0 ) )
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:858:1: ( rule__Configuration__Owned_elementAssignment_3_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConfigurationAccess().getOwned_elementAssignment_3_0()); 
            }
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:859:1: ( rule__Configuration__Owned_elementAssignment_3_0 )
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:859:2: rule__Configuration__Owned_elementAssignment_3_0
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
    // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:869:1: rule__Configuration__Group_3__1 : rule__Configuration__Group_3__1__Impl ;
    public final void rule__Configuration__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:873:1: ( rule__Configuration__Group_3__1__Impl )
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:874:2: rule__Configuration__Group_3__1__Impl
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
    // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:880:1: rule__Configuration__Group_3__1__Impl : ( ( rule__Configuration__Group_3_1__0 )* ) ;
    public final void rule__Configuration__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:884:1: ( ( ( rule__Configuration__Group_3_1__0 )* ) )
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:885:1: ( ( rule__Configuration__Group_3_1__0 )* )
            {
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:885:1: ( ( rule__Configuration__Group_3_1__0 )* )
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:886:1: ( rule__Configuration__Group_3_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConfigurationAccess().getGroup_3_1()); 
            }
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:887:1: ( rule__Configuration__Group_3_1__0 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==17) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:887:2: rule__Configuration__Group_3_1__0
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
    // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:901:1: rule__Configuration__Group_3_1__0 : rule__Configuration__Group_3_1__0__Impl rule__Configuration__Group_3_1__1 ;
    public final void rule__Configuration__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:905:1: ( rule__Configuration__Group_3_1__0__Impl rule__Configuration__Group_3_1__1 )
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:906:2: rule__Configuration__Group_3_1__0__Impl rule__Configuration__Group_3_1__1
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
    // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:913:1: rule__Configuration__Group_3_1__0__Impl : ( ',' ) ;
    public final void rule__Configuration__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:917:1: ( ( ',' ) )
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:918:1: ( ',' )
            {
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:918:1: ( ',' )
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:919:1: ','
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
    // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:932:1: rule__Configuration__Group_3_1__1 : rule__Configuration__Group_3_1__1__Impl ;
    public final void rule__Configuration__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:936:1: ( rule__Configuration__Group_3_1__1__Impl )
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:937:2: rule__Configuration__Group_3_1__1__Impl
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
    // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:943:1: rule__Configuration__Group_3_1__1__Impl : ( ( rule__Configuration__Owned_elementAssignment_3_1_1 ) ) ;
    public final void rule__Configuration__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:947:1: ( ( ( rule__Configuration__Owned_elementAssignment_3_1_1 ) ) )
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:948:1: ( ( rule__Configuration__Owned_elementAssignment_3_1_1 ) )
            {
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:948:1: ( ( rule__Configuration__Owned_elementAssignment_3_1_1 ) )
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:949:1: ( rule__Configuration__Owned_elementAssignment_3_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConfigurationAccess().getOwned_elementAssignment_3_1_1()); 
            }
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:950:1: ( rule__Configuration__Owned_elementAssignment_3_1_1 )
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:950:2: rule__Configuration__Owned_elementAssignment_3_1_1
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
    // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:964:1: rule__GenerationConfiguration__Group__0 : rule__GenerationConfiguration__Group__0__Impl rule__GenerationConfiguration__Group__1 ;
    public final void rule__GenerationConfiguration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:968:1: ( rule__GenerationConfiguration__Group__0__Impl rule__GenerationConfiguration__Group__1 )
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:969:2: rule__GenerationConfiguration__Group__0__Impl rule__GenerationConfiguration__Group__1
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
    // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:976:1: rule__GenerationConfiguration__Group__0__Impl : ( () ) ;
    public final void rule__GenerationConfiguration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:980:1: ( ( () ) )
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:981:1: ( () )
            {
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:981:1: ( () )
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:982:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGenerationConfigurationAccess().getGenerationConfigurationAction_0()); 
            }
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:983:1: ()
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:985:1: 
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
    // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:995:1: rule__GenerationConfiguration__Group__1 : rule__GenerationConfiguration__Group__1__Impl ;
    public final void rule__GenerationConfiguration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:999:1: ( rule__GenerationConfiguration__Group__1__Impl )
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:1000:2: rule__GenerationConfiguration__Group__1__Impl
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
    // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:1006:1: rule__GenerationConfiguration__Group__1__Impl : ( ( rule__GenerationConfiguration__Group_1__0 ) ) ;
    public final void rule__GenerationConfiguration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:1010:1: ( ( ( rule__GenerationConfiguration__Group_1__0 ) ) )
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:1011:1: ( ( rule__GenerationConfiguration__Group_1__0 ) )
            {
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:1011:1: ( ( rule__GenerationConfiguration__Group_1__0 ) )
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:1012:1: ( rule__GenerationConfiguration__Group_1__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGenerationConfigurationAccess().getGroup_1()); 
            }
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:1013:1: ( rule__GenerationConfiguration__Group_1__0 )
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:1013:2: rule__GenerationConfiguration__Group_1__0
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
    // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:1027:1: rule__GenerationConfiguration__Group_1__0 : rule__GenerationConfiguration__Group_1__0__Impl rule__GenerationConfiguration__Group_1__1 ;
    public final void rule__GenerationConfiguration__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:1031:1: ( rule__GenerationConfiguration__Group_1__0__Impl rule__GenerationConfiguration__Group_1__1 )
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:1032:2: rule__GenerationConfiguration__Group_1__0__Impl rule__GenerationConfiguration__Group_1__1
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
    // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:1039:1: rule__GenerationConfiguration__Group_1__0__Impl : ( 'rootProjectName:' ) ;
    public final void rule__GenerationConfiguration__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:1043:1: ( ( 'rootProjectName:' ) )
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:1044:1: ( 'rootProjectName:' )
            {
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:1044:1: ( 'rootProjectName:' )
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:1045:1: 'rootProjectName:'
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
    // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:1058:1: rule__GenerationConfiguration__Group_1__1 : rule__GenerationConfiguration__Group_1__1__Impl ;
    public final void rule__GenerationConfiguration__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:1062:1: ( rule__GenerationConfiguration__Group_1__1__Impl )
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:1063:2: rule__GenerationConfiguration__Group_1__1__Impl
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
    // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:1069:1: rule__GenerationConfiguration__Group_1__1__Impl : ( ( rule__GenerationConfiguration__RootProjectNameAssignment_1_1 ) ) ;
    public final void rule__GenerationConfiguration__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:1073:1: ( ( ( rule__GenerationConfiguration__RootProjectNameAssignment_1_1 ) ) )
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:1074:1: ( ( rule__GenerationConfiguration__RootProjectNameAssignment_1_1 ) )
            {
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:1074:1: ( ( rule__GenerationConfiguration__RootProjectNameAssignment_1_1 ) )
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:1075:1: ( rule__GenerationConfiguration__RootProjectNameAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGenerationConfigurationAccess().getRootProjectNameAssignment_1_1()); 
            }
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:1076:1: ( rule__GenerationConfiguration__RootProjectNameAssignment_1_1 )
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:1076:2: rule__GenerationConfiguration__RootProjectNameAssignment_1_1
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
    // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:1090:1: rule__Viewpoints__Group__0 : rule__Viewpoints__Group__0__Impl rule__Viewpoints__Group__1 ;
    public final void rule__Viewpoints__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:1094:1: ( rule__Viewpoints__Group__0__Impl rule__Viewpoints__Group__1 )
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:1095:2: rule__Viewpoints__Group__0__Impl rule__Viewpoints__Group__1
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
    // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:1102:1: rule__Viewpoints__Group__0__Impl : ( () ) ;
    public final void rule__Viewpoints__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:1106:1: ( ( () ) )
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:1107:1: ( () )
            {
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:1107:1: ( () )
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:1108:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getViewpointsAccess().getViewpointsAction_0()); 
            }
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:1109:1: ()
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:1111:1: 
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
    // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:1121:1: rule__Viewpoints__Group__1 : rule__Viewpoints__Group__1__Impl rule__Viewpoints__Group__2 ;
    public final void rule__Viewpoints__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:1125:1: ( rule__Viewpoints__Group__1__Impl rule__Viewpoints__Group__2 )
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:1126:2: rule__Viewpoints__Group__1__Impl rule__Viewpoints__Group__2
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
    // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:1133:1: rule__Viewpoints__Group__1__Impl : ( 'Viewpoints' ) ;
    public final void rule__Viewpoints__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:1137:1: ( ( 'Viewpoints' ) )
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:1138:1: ( 'Viewpoints' )
            {
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:1138:1: ( 'Viewpoints' )
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:1139:1: 'Viewpoints'
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
    // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:1152:1: rule__Viewpoints__Group__2 : rule__Viewpoints__Group__2__Impl rule__Viewpoints__Group__3 ;
    public final void rule__Viewpoints__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:1156:1: ( rule__Viewpoints__Group__2__Impl rule__Viewpoints__Group__3 )
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:1157:2: rule__Viewpoints__Group__2__Impl rule__Viewpoints__Group__3
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
    // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:1164:1: rule__Viewpoints__Group__2__Impl : ( '{' ) ;
    public final void rule__Viewpoints__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:1168:1: ( ( '{' ) )
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:1169:1: ( '{' )
            {
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:1169:1: ( '{' )
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:1170:1: '{'
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
    // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:1183:1: rule__Viewpoints__Group__3 : rule__Viewpoints__Group__3__Impl rule__Viewpoints__Group__4 ;
    public final void rule__Viewpoints__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:1187:1: ( rule__Viewpoints__Group__3__Impl rule__Viewpoints__Group__4 )
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:1188:2: rule__Viewpoints__Group__3__Impl rule__Viewpoints__Group__4
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
    // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:1195:1: rule__Viewpoints__Group__3__Impl : ( ( rule__Viewpoints__Group_3__0 )? ) ;
    public final void rule__Viewpoints__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:1199:1: ( ( ( rule__Viewpoints__Group_3__0 )? ) )
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:1200:1: ( ( rule__Viewpoints__Group_3__0 )? )
            {
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:1200:1: ( ( rule__Viewpoints__Group_3__0 )? )
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:1201:1: ( rule__Viewpoints__Group_3__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getViewpointsAccess().getGroup_3()); 
            }
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:1202:1: ( rule__Viewpoints__Group_3__0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_ID) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:1202:2: rule__Viewpoints__Group_3__0
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
    // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:1212:1: rule__Viewpoints__Group__4 : rule__Viewpoints__Group__4__Impl ;
    public final void rule__Viewpoints__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:1216:1: ( rule__Viewpoints__Group__4__Impl )
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:1217:2: rule__Viewpoints__Group__4__Impl
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
    // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:1223:1: rule__Viewpoints__Group__4__Impl : ( '}' ) ;
    public final void rule__Viewpoints__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:1227:1: ( ( '}' ) )
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:1228:1: ( '}' )
            {
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:1228:1: ( '}' )
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:1229:1: '}'
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
    // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:1252:1: rule__Viewpoints__Group_3__0 : rule__Viewpoints__Group_3__0__Impl rule__Viewpoints__Group_3__1 ;
    public final void rule__Viewpoints__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:1256:1: ( rule__Viewpoints__Group_3__0__Impl rule__Viewpoints__Group_3__1 )
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:1257:2: rule__Viewpoints__Group_3__0__Impl rule__Viewpoints__Group_3__1
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
    // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:1264:1: rule__Viewpoints__Group_3__0__Impl : ( ( rule__Viewpoints__Owned_viewpointsAssignment_3_0 ) ) ;
    public final void rule__Viewpoints__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:1268:1: ( ( ( rule__Viewpoints__Owned_viewpointsAssignment_3_0 ) ) )
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:1269:1: ( ( rule__Viewpoints__Owned_viewpointsAssignment_3_0 ) )
            {
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:1269:1: ( ( rule__Viewpoints__Owned_viewpointsAssignment_3_0 ) )
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:1270:1: ( rule__Viewpoints__Owned_viewpointsAssignment_3_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getViewpointsAccess().getOwned_viewpointsAssignment_3_0()); 
            }
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:1271:1: ( rule__Viewpoints__Owned_viewpointsAssignment_3_0 )
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:1271:2: rule__Viewpoints__Owned_viewpointsAssignment_3_0
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
    // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:1281:1: rule__Viewpoints__Group_3__1 : rule__Viewpoints__Group_3__1__Impl ;
    public final void rule__Viewpoints__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:1285:1: ( rule__Viewpoints__Group_3__1__Impl )
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:1286:2: rule__Viewpoints__Group_3__1__Impl
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
    // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:1292:1: rule__Viewpoints__Group_3__1__Impl : ( ( rule__Viewpoints__Group_3_1__0 )* ) ;
    public final void rule__Viewpoints__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:1296:1: ( ( ( rule__Viewpoints__Group_3_1__0 )* ) )
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:1297:1: ( ( rule__Viewpoints__Group_3_1__0 )* )
            {
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:1297:1: ( ( rule__Viewpoints__Group_3_1__0 )* )
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:1298:1: ( rule__Viewpoints__Group_3_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getViewpointsAccess().getGroup_3_1()); 
            }
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:1299:1: ( rule__Viewpoints__Group_3_1__0 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==17) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:1299:2: rule__Viewpoints__Group_3_1__0
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
    // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:1313:1: rule__Viewpoints__Group_3_1__0 : rule__Viewpoints__Group_3_1__0__Impl rule__Viewpoints__Group_3_1__1 ;
    public final void rule__Viewpoints__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:1317:1: ( rule__Viewpoints__Group_3_1__0__Impl rule__Viewpoints__Group_3_1__1 )
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:1318:2: rule__Viewpoints__Group_3_1__0__Impl rule__Viewpoints__Group_3_1__1
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
    // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:1325:1: rule__Viewpoints__Group_3_1__0__Impl : ( ',' ) ;
    public final void rule__Viewpoints__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:1329:1: ( ( ',' ) )
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:1330:1: ( ',' )
            {
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:1330:1: ( ',' )
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:1331:1: ','
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
    // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:1344:1: rule__Viewpoints__Group_3_1__1 : rule__Viewpoints__Group_3_1__1__Impl ;
    public final void rule__Viewpoints__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:1348:1: ( rule__Viewpoints__Group_3_1__1__Impl )
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:1349:2: rule__Viewpoints__Group_3_1__1__Impl
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
    // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:1355:1: rule__Viewpoints__Group_3_1__1__Impl : ( ( rule__Viewpoints__Owned_viewpointsAssignment_3_1_1 ) ) ;
    public final void rule__Viewpoints__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:1359:1: ( ( ( rule__Viewpoints__Owned_viewpointsAssignment_3_1_1 ) ) )
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:1360:1: ( ( rule__Viewpoints__Owned_viewpointsAssignment_3_1_1 ) )
            {
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:1360:1: ( ( rule__Viewpoints__Owned_viewpointsAssignment_3_1_1 ) )
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:1361:1: ( rule__Viewpoints__Owned_viewpointsAssignment_3_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getViewpointsAccess().getOwned_viewpointsAssignment_3_1_1()); 
            }
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:1362:1: ( rule__Viewpoints__Owned_viewpointsAssignment_3_1_1 )
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:1362:2: rule__Viewpoints__Owned_viewpointsAssignment_3_1_1
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
    // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:1376:1: rule__FQN__Group__0 : rule__FQN__Group__0__Impl rule__FQN__Group__1 ;
    public final void rule__FQN__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:1380:1: ( rule__FQN__Group__0__Impl rule__FQN__Group__1 )
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:1381:2: rule__FQN__Group__0__Impl rule__FQN__Group__1
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
    // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:1388:1: rule__FQN__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__FQN__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:1392:1: ( ( RULE_ID ) )
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:1393:1: ( RULE_ID )
            {
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:1393:1: ( RULE_ID )
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:1394:1: RULE_ID
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
    // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:1405:1: rule__FQN__Group__1 : rule__FQN__Group__1__Impl ;
    public final void rule__FQN__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:1409:1: ( rule__FQN__Group__1__Impl )
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:1410:2: rule__FQN__Group__1__Impl
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
    // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:1416:1: rule__FQN__Group__1__Impl : ( ( rule__FQN__Group_1__0 )* ) ;
    public final void rule__FQN__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:1420:1: ( ( ( rule__FQN__Group_1__0 )* ) )
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:1421:1: ( ( rule__FQN__Group_1__0 )* )
            {
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:1421:1: ( ( rule__FQN__Group_1__0 )* )
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:1422:1: ( rule__FQN__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFQNAccess().getGroup_1()); 
            }
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:1423:1: ( rule__FQN__Group_1__0 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==20) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:1423:2: rule__FQN__Group_1__0
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
    // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:1437:1: rule__FQN__Group_1__0 : rule__FQN__Group_1__0__Impl rule__FQN__Group_1__1 ;
    public final void rule__FQN__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:1441:1: ( rule__FQN__Group_1__0__Impl rule__FQN__Group_1__1 )
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:1442:2: rule__FQN__Group_1__0__Impl rule__FQN__Group_1__1
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
    // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:1449:1: rule__FQN__Group_1__0__Impl : ( '.' ) ;
    public final void rule__FQN__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:1453:1: ( ( '.' ) )
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:1454:1: ( '.' )
            {
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:1454:1: ( '.' )
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:1455:1: '.'
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
    // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:1468:1: rule__FQN__Group_1__1 : rule__FQN__Group_1__1__Impl ;
    public final void rule__FQN__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:1472:1: ( rule__FQN__Group_1__1__Impl )
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:1473:2: rule__FQN__Group_1__1__Impl
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
    // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:1479:1: rule__FQN__Group_1__1__Impl : ( ( RULE_ID ) ) ;
    public final void rule__FQN__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:1483:1: ( ( ( RULE_ID ) ) )
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:1484:1: ( ( RULE_ID ) )
            {
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:1484:1: ( ( RULE_ID ) )
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:1485:1: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFQNAccess().getIDTerminalRuleCall_1_1()); 
            }
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:1486:1: ( RULE_ID )
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:1486:3: RULE_ID
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
    // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:1501:1: rule__ArchitectureFramework__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__ArchitectureFramework__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:1505:1: ( ( RULE_ID ) )
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:1506:1: ( RULE_ID )
            {
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:1506:1: ( RULE_ID )
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:1507:1: RULE_ID
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
    // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:1516:1: rule__ArchitectureFramework__DescriptionAssignment_4_1 : ( RULE_STRING ) ;
    public final void rule__ArchitectureFramework__DescriptionAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:1520:1: ( ( RULE_STRING ) )
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:1521:1: ( RULE_STRING )
            {
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:1521:1: ( RULE_STRING )
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:1522:1: RULE_STRING
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
    // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:1531:1: rule__ArchitectureFramework__ShortNameAssignment_5_1 : ( RULE_STRING ) ;
    public final void rule__ArchitectureFramework__ShortNameAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:1535:1: ( ( RULE_STRING ) )
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:1536:1: ( RULE_STRING )
            {
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:1536:1: ( RULE_STRING )
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:1537:1: RULE_STRING
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
    // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:1546:1: rule__ArchitectureFramework__Af_viewpointsAssignment_6 : ( ruleViewpoints ) ;
    public final void rule__ArchitectureFramework__Af_viewpointsAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:1550:1: ( ( ruleViewpoints ) )
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:1551:1: ( ruleViewpoints )
            {
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:1551:1: ( ruleViewpoints )
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:1552:1: ruleViewpoints
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
    // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:1561:1: rule__ArchitectureFramework__Owned_configurationAssignment_7 : ( ruleConfiguration ) ;
    public final void rule__ArchitectureFramework__Owned_configurationAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:1565:1: ( ( ruleConfiguration ) )
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:1566:1: ( ruleConfiguration )
            {
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:1566:1: ( ruleConfiguration )
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:1567:1: ruleConfiguration
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
    // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:1576:1: rule__Configuration__Owned_elementAssignment_3_0 : ( ruleConfigurationElement ) ;
    public final void rule__Configuration__Owned_elementAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:1580:1: ( ( ruleConfigurationElement ) )
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:1581:1: ( ruleConfigurationElement )
            {
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:1581:1: ( ruleConfigurationElement )
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:1582:1: ruleConfigurationElement
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
    // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:1591:1: rule__Configuration__Owned_elementAssignment_3_1_1 : ( ruleConfigurationElement ) ;
    public final void rule__Configuration__Owned_elementAssignment_3_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:1595:1: ( ( ruleConfigurationElement ) )
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:1596:1: ( ruleConfigurationElement )
            {
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:1596:1: ( ruleConfigurationElement )
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:1597:1: ruleConfigurationElement
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
    // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:1606:1: rule__GenerationConfiguration__RootProjectNameAssignment_1_1 : ( ruleFQN ) ;
    public final void rule__GenerationConfiguration__RootProjectNameAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:1610:1: ( ( ruleFQN ) )
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:1611:1: ( ruleFQN )
            {
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:1611:1: ( ruleFQN )
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:1612:1: ruleFQN
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
    // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:1621:1: rule__Viewpoints__Owned_viewpointsAssignment_3_0 : ( ( RULE_ID ) ) ;
    public final void rule__Viewpoints__Owned_viewpointsAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:1625:1: ( ( ( RULE_ID ) ) )
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:1626:1: ( ( RULE_ID ) )
            {
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:1626:1: ( ( RULE_ID ) )
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:1627:1: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getViewpointsAccess().getOwned_viewpointsViewpointCrossReference_3_0_0()); 
            }
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:1628:1: ( RULE_ID )
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:1629:1: RULE_ID
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
    // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:1640:1: rule__Viewpoints__Owned_viewpointsAssignment_3_1_1 : ( ( RULE_ID ) ) ;
    public final void rule__Viewpoints__Owned_viewpointsAssignment_3_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:1644:1: ( ( ( RULE_ID ) ) )
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:1645:1: ( ( RULE_ID ) )
            {
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:1645:1: ( ( RULE_ID ) )
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:1646:1: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getViewpointsAccess().getOwned_viewpointsViewpointCrossReference_3_1_1_0()); 
            }
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:1647:1: ( RULE_ID )
            // ../org.polarsys.kitalpha.ad.af.dsl.cs.text.afdesc.ui/src-gen/org/polarsys/kitalpha/ad/af/dsl/cs/text/ui/contentassist/antlr/internal/InternalAfdesc.g:1648:1: RULE_ID
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
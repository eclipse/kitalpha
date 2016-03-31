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
import org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.VpconfGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
/*******************************************************************************
 * Copyright (c) 2016 Thales Global Services S.A.S.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *  Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/
@SuppressWarnings("all")
public class InternalVpconfParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'_'", "'-'", "'true'", "'false'", "'Configuration'", "'{'", "'}'", "'target'", "'project'", "'nsuri'", "'generation'", "'data'", "'('", "')'", "'Model'", "':'", "'Edit'", "'Editor'", "'Test'", "'Javadoc'", "'OverwriteEcore'", "'diagram'", "'OverwriteOdesign'", "'documentation'", "'EcoreToHtml:'", "'ecore'", "'aird'", "'release'", "'version'", "'description'", "'execution'", "'environments'", "','", "'.'"
    };
    public static final int RULE_ID=5;
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int EOF=-1;
    public static final int T__19=19;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__11=11;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_INT=4;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__44=44;
    public static final int RULE_SL_COMMENT=8;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_STRING=6;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int RULE_WS=9;

    // delegates
    // delegators


        public InternalVpconfParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalVpconfParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalVpconfParser.tokenNames; }
    public String getGrammarFileName() { return "../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g"; }


     
     	private VpconfGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(VpconfGrammarAccess grammarAccess) {
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




    // $ANTLR start "entryRuleConfiguration"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:68:1: entryRuleConfiguration : ruleConfiguration EOF ;
    public final void entryRuleConfiguration() throws RecognitionException {
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:69:1: ( ruleConfiguration EOF )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:70:1: ruleConfiguration EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConfigurationRule()); 
            }
            pushFollow(FOLLOW_ruleConfiguration_in_entryRuleConfiguration67);
            ruleConfiguration();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConfigurationRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleConfiguration74); if (state.failed) return ;

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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:77:1: ruleConfiguration : ( ( rule__Configuration__Group__0 ) ) ;
    public final void ruleConfiguration() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:81:2: ( ( ( rule__Configuration__Group__0 ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:82:1: ( ( rule__Configuration__Group__0 ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:82:1: ( ( rule__Configuration__Group__0 ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:83:1: ( rule__Configuration__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConfigurationAccess().getGroup()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:84:1: ( rule__Configuration__Group__0 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:84:2: rule__Configuration__Group__0
            {
            pushFollow(FOLLOW_rule__Configuration__Group__0_in_ruleConfiguration100);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:96:1: entryRuleConfigurationElement : ruleConfigurationElement EOF ;
    public final void entryRuleConfigurationElement() throws RecognitionException {
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:97:1: ( ruleConfigurationElement EOF )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:98:1: ruleConfigurationElement EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConfigurationElementRule()); 
            }
            pushFollow(FOLLOW_ruleConfigurationElement_in_entryRuleConfigurationElement127);
            ruleConfigurationElement();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConfigurationElementRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleConfigurationElement134); if (state.failed) return ;

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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:105:1: ruleConfigurationElement : ( ( rule__ConfigurationElement__Alternatives ) ) ;
    public final void ruleConfigurationElement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:109:2: ( ( ( rule__ConfigurationElement__Alternatives ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:110:1: ( ( rule__ConfigurationElement__Alternatives ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:110:1: ( ( rule__ConfigurationElement__Alternatives ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:111:1: ( rule__ConfigurationElement__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConfigurationElementAccess().getAlternatives()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:112:1: ( rule__ConfigurationElement__Alternatives )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:112:2: rule__ConfigurationElement__Alternatives
            {
            pushFollow(FOLLOW_rule__ConfigurationElement__Alternatives_in_ruleConfigurationElement160);
            rule__ConfigurationElement__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getConfigurationElementAccess().getAlternatives()); 
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


    // $ANTLR start "entryRuleTargetApplication"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:124:1: entryRuleTargetApplication : ruleTargetApplication EOF ;
    public final void entryRuleTargetApplication() throws RecognitionException {
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:125:1: ( ruleTargetApplication EOF )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:126:1: ruleTargetApplication EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTargetApplicationRule()); 
            }
            pushFollow(FOLLOW_ruleTargetApplication_in_entryRuleTargetApplication187);
            ruleTargetApplication();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTargetApplicationRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTargetApplication194); if (state.failed) return ;

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
    // $ANTLR end "entryRuleTargetApplication"


    // $ANTLR start "ruleTargetApplication"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:133:1: ruleTargetApplication : ( ( rule__TargetApplication__Group__0 ) ) ;
    public final void ruleTargetApplication() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:137:2: ( ( ( rule__TargetApplication__Group__0 ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:138:1: ( ( rule__TargetApplication__Group__0 ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:138:1: ( ( rule__TargetApplication__Group__0 ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:139:1: ( rule__TargetApplication__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTargetApplicationAccess().getGroup()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:140:1: ( rule__TargetApplication__Group__0 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:140:2: rule__TargetApplication__Group__0
            {
            pushFollow(FOLLOW_rule__TargetApplication__Group__0_in_ruleTargetApplication220);
            rule__TargetApplication__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTargetApplicationAccess().getGroup()); 
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
    // $ANTLR end "ruleTargetApplication"


    // $ANTLR start "entryRuleGenerationConfiguration"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:152:1: entryRuleGenerationConfiguration : ruleGenerationConfiguration EOF ;
    public final void entryRuleGenerationConfiguration() throws RecognitionException {
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:153:1: ( ruleGenerationConfiguration EOF )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:154:1: ruleGenerationConfiguration EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGenerationConfigurationRule()); 
            }
            pushFollow(FOLLOW_ruleGenerationConfiguration_in_entryRuleGenerationConfiguration247);
            ruleGenerationConfiguration();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGenerationConfigurationRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleGenerationConfiguration254); if (state.failed) return ;

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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:161:1: ruleGenerationConfiguration : ( ( rule__GenerationConfiguration__Group__0 ) ) ;
    public final void ruleGenerationConfiguration() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:165:2: ( ( ( rule__GenerationConfiguration__Group__0 ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:166:1: ( ( rule__GenerationConfiguration__Group__0 ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:166:1: ( ( rule__GenerationConfiguration__Group__0 ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:167:1: ( rule__GenerationConfiguration__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGenerationConfigurationAccess().getGroup()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:168:1: ( rule__GenerationConfiguration__Group__0 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:168:2: rule__GenerationConfiguration__Group__0
            {
            pushFollow(FOLLOW_rule__GenerationConfiguration__Group__0_in_ruleGenerationConfiguration280);
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


    // $ANTLR start "entryRuleGeneration"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:180:1: entryRuleGeneration : ruleGeneration EOF ;
    public final void entryRuleGeneration() throws RecognitionException {
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:181:1: ( ruleGeneration EOF )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:182:1: ruleGeneration EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGenerationRule()); 
            }
            pushFollow(FOLLOW_ruleGeneration_in_entryRuleGeneration307);
            ruleGeneration();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGenerationRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleGeneration314); if (state.failed) return ;

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
    // $ANTLR end "entryRuleGeneration"


    // $ANTLR start "ruleGeneration"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:189:1: ruleGeneration : ( ( rule__Generation__Group__0 ) ) ;
    public final void ruleGeneration() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:193:2: ( ( ( rule__Generation__Group__0 ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:194:1: ( ( rule__Generation__Group__0 ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:194:1: ( ( rule__Generation__Group__0 ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:195:1: ( rule__Generation__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGenerationAccess().getGroup()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:196:1: ( rule__Generation__Group__0 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:196:2: rule__Generation__Group__0
            {
            pushFollow(FOLLOW_rule__Generation__Group__0_in_ruleGeneration340);
            rule__Generation__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGenerationAccess().getGroup()); 
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
    // $ANTLR end "ruleGeneration"


    // $ANTLR start "entryRuleGData"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:208:1: entryRuleGData : ruleGData EOF ;
    public final void entryRuleGData() throws RecognitionException {
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:209:1: ( ruleGData EOF )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:210:1: ruleGData EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGDataRule()); 
            }
            pushFollow(FOLLOW_ruleGData_in_entryRuleGData367);
            ruleGData();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGDataRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleGData374); if (state.failed) return ;

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
    // $ANTLR end "entryRuleGData"


    // $ANTLR start "ruleGData"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:217:1: ruleGData : ( ( rule__GData__Group__0 ) ) ;
    public final void ruleGData() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:221:2: ( ( ( rule__GData__Group__0 ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:222:1: ( ( rule__GData__Group__0 ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:222:1: ( ( rule__GData__Group__0 ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:223:1: ( rule__GData__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGDataAccess().getGroup()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:224:1: ( rule__GData__Group__0 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:224:2: rule__GData__Group__0
            {
            pushFollow(FOLLOW_rule__GData__Group__0_in_ruleGData400);
            rule__GData__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGDataAccess().getGroup()); 
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
    // $ANTLR end "ruleGData"


    // $ANTLR start "entryRuleExtensionGeneratrionConfiguration"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:236:1: entryRuleExtensionGeneratrionConfiguration : ruleExtensionGeneratrionConfiguration EOF ;
    public final void entryRuleExtensionGeneratrionConfiguration() throws RecognitionException {
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:237:1: ( ruleExtensionGeneratrionConfiguration EOF )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:238:1: ruleExtensionGeneratrionConfiguration EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExtensionGeneratrionConfigurationRule()); 
            }
            pushFollow(FOLLOW_ruleExtensionGeneratrionConfiguration_in_entryRuleExtensionGeneratrionConfiguration427);
            ruleExtensionGeneratrionConfiguration();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExtensionGeneratrionConfigurationRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExtensionGeneratrionConfiguration434); if (state.failed) return ;

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
    // $ANTLR end "entryRuleExtensionGeneratrionConfiguration"


    // $ANTLR start "ruleExtensionGeneratrionConfiguration"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:245:1: ruleExtensionGeneratrionConfiguration : ( ( rule__ExtensionGeneratrionConfiguration__Alternatives ) ) ;
    public final void ruleExtensionGeneratrionConfiguration() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:249:2: ( ( ( rule__ExtensionGeneratrionConfiguration__Alternatives ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:250:1: ( ( rule__ExtensionGeneratrionConfiguration__Alternatives ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:250:1: ( ( rule__ExtensionGeneratrionConfiguration__Alternatives ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:251:1: ( rule__ExtensionGeneratrionConfiguration__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExtensionGeneratrionConfigurationAccess().getAlternatives()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:252:1: ( rule__ExtensionGeneratrionConfiguration__Alternatives )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:252:2: rule__ExtensionGeneratrionConfiguration__Alternatives
            {
            pushFollow(FOLLOW_rule__ExtensionGeneratrionConfiguration__Alternatives_in_ruleExtensionGeneratrionConfiguration460);
            rule__ExtensionGeneratrionConfiguration__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExtensionGeneratrionConfigurationAccess().getAlternatives()); 
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
    // $ANTLR end "ruleExtensionGeneratrionConfiguration"


    // $ANTLR start "entryRuleDiagramGenerationConfiguration"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:264:1: entryRuleDiagramGenerationConfiguration : ruleDiagramGenerationConfiguration EOF ;
    public final void entryRuleDiagramGenerationConfiguration() throws RecognitionException {
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:265:1: ( ruleDiagramGenerationConfiguration EOF )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:266:1: ruleDiagramGenerationConfiguration EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDiagramGenerationConfigurationRule()); 
            }
            pushFollow(FOLLOW_ruleDiagramGenerationConfiguration_in_entryRuleDiagramGenerationConfiguration487);
            ruleDiagramGenerationConfiguration();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDiagramGenerationConfigurationRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDiagramGenerationConfiguration494); if (state.failed) return ;

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
    // $ANTLR end "entryRuleDiagramGenerationConfiguration"


    // $ANTLR start "ruleDiagramGenerationConfiguration"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:273:1: ruleDiagramGenerationConfiguration : ( ( rule__DiagramGenerationConfiguration__Group__0 ) ) ;
    public final void ruleDiagramGenerationConfiguration() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:277:2: ( ( ( rule__DiagramGenerationConfiguration__Group__0 ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:278:1: ( ( rule__DiagramGenerationConfiguration__Group__0 ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:278:1: ( ( rule__DiagramGenerationConfiguration__Group__0 ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:279:1: ( rule__DiagramGenerationConfiguration__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDiagramGenerationConfigurationAccess().getGroup()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:280:1: ( rule__DiagramGenerationConfiguration__Group__0 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:280:2: rule__DiagramGenerationConfiguration__Group__0
            {
            pushFollow(FOLLOW_rule__DiagramGenerationConfiguration__Group__0_in_ruleDiagramGenerationConfiguration520);
            rule__DiagramGenerationConfiguration__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDiagramGenerationConfigurationAccess().getGroup()); 
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
    // $ANTLR end "ruleDiagramGenerationConfiguration"


    // $ANTLR start "entryRuleDocumentationGenerationConfiguration"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:292:1: entryRuleDocumentationGenerationConfiguration : ruleDocumentationGenerationConfiguration EOF ;
    public final void entryRuleDocumentationGenerationConfiguration() throws RecognitionException {
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:293:1: ( ruleDocumentationGenerationConfiguration EOF )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:294:1: ruleDocumentationGenerationConfiguration EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDocumentationGenerationConfigurationRule()); 
            }
            pushFollow(FOLLOW_ruleDocumentationGenerationConfiguration_in_entryRuleDocumentationGenerationConfiguration547);
            ruleDocumentationGenerationConfiguration();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDocumentationGenerationConfigurationRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDocumentationGenerationConfiguration554); if (state.failed) return ;

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
    // $ANTLR end "entryRuleDocumentationGenerationConfiguration"


    // $ANTLR start "ruleDocumentationGenerationConfiguration"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:301:1: ruleDocumentationGenerationConfiguration : ( ( rule__DocumentationGenerationConfiguration__Group__0 ) ) ;
    public final void ruleDocumentationGenerationConfiguration() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:305:2: ( ( ( rule__DocumentationGenerationConfiguration__Group__0 ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:306:1: ( ( rule__DocumentationGenerationConfiguration__Group__0 ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:306:1: ( ( rule__DocumentationGenerationConfiguration__Group__0 ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:307:1: ( rule__DocumentationGenerationConfiguration__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDocumentationGenerationConfigurationAccess().getGroup()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:308:1: ( rule__DocumentationGenerationConfiguration__Group__0 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:308:2: rule__DocumentationGenerationConfiguration__Group__0
            {
            pushFollow(FOLLOW_rule__DocumentationGenerationConfiguration__Group__0_in_ruleDocumentationGenerationConfiguration580);
            rule__DocumentationGenerationConfiguration__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDocumentationGenerationConfigurationAccess().getGroup()); 
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
    // $ANTLR end "ruleDocumentationGenerationConfiguration"


    // $ANTLR start "entryRuleModelsAirdGenerationConfiguration"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:320:1: entryRuleModelsAirdGenerationConfiguration : ruleModelsAirdGenerationConfiguration EOF ;
    public final void entryRuleModelsAirdGenerationConfiguration() throws RecognitionException {
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:321:1: ( ruleModelsAirdGenerationConfiguration EOF )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:322:1: ruleModelsAirdGenerationConfiguration EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelsAirdGenerationConfigurationRule()); 
            }
            pushFollow(FOLLOW_ruleModelsAirdGenerationConfiguration_in_entryRuleModelsAirdGenerationConfiguration607);
            ruleModelsAirdGenerationConfiguration();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelsAirdGenerationConfigurationRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleModelsAirdGenerationConfiguration614); if (state.failed) return ;

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
    // $ANTLR end "entryRuleModelsAirdGenerationConfiguration"


    // $ANTLR start "ruleModelsAirdGenerationConfiguration"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:329:1: ruleModelsAirdGenerationConfiguration : ( ( rule__ModelsAirdGenerationConfiguration__Group__0 ) ) ;
    public final void ruleModelsAirdGenerationConfiguration() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:333:2: ( ( ( rule__ModelsAirdGenerationConfiguration__Group__0 ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:334:1: ( ( rule__ModelsAirdGenerationConfiguration__Group__0 ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:334:1: ( ( rule__ModelsAirdGenerationConfiguration__Group__0 ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:335:1: ( rule__ModelsAirdGenerationConfiguration__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelsAirdGenerationConfigurationAccess().getGroup()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:336:1: ( rule__ModelsAirdGenerationConfiguration__Group__0 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:336:2: rule__ModelsAirdGenerationConfiguration__Group__0
            {
            pushFollow(FOLLOW_rule__ModelsAirdGenerationConfiguration__Group__0_in_ruleModelsAirdGenerationConfiguration640);
            rule__ModelsAirdGenerationConfiguration__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelsAirdGenerationConfigurationAccess().getGroup()); 
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
    // $ANTLR end "ruleModelsAirdGenerationConfiguration"


    // $ANTLR start "entryRuleRelease"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:348:1: entryRuleRelease : ruleRelease EOF ;
    public final void entryRuleRelease() throws RecognitionException {
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:349:1: ( ruleRelease EOF )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:350:1: ruleRelease EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReleaseRule()); 
            }
            pushFollow(FOLLOW_ruleRelease_in_entryRuleRelease667);
            ruleRelease();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getReleaseRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleRelease674); if (state.failed) return ;

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
    // $ANTLR end "entryRuleRelease"


    // $ANTLR start "ruleRelease"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:357:1: ruleRelease : ( ( rule__Release__Group__0 ) ) ;
    public final void ruleRelease() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:361:2: ( ( ( rule__Release__Group__0 ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:362:1: ( ( rule__Release__Group__0 ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:362:1: ( ( rule__Release__Group__0 ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:363:1: ( rule__Release__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReleaseAccess().getGroup()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:364:1: ( rule__Release__Group__0 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:364:2: rule__Release__Group__0
            {
            pushFollow(FOLLOW_rule__Release__Group__0_in_ruleRelease700);
            rule__Release__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getReleaseAccess().getGroup()); 
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
    // $ANTLR end "ruleRelease"


    // $ANTLR start "entryRuleVersion"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:376:1: entryRuleVersion : ruleVersion EOF ;
    public final void entryRuleVersion() throws RecognitionException {
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:377:1: ( ruleVersion EOF )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:378:1: ruleVersion EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVersionRule()); 
            }
            pushFollow(FOLLOW_ruleVersion_in_entryRuleVersion727);
            ruleVersion();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVersionRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleVersion734); if (state.failed) return ;

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
    // $ANTLR end "entryRuleVersion"


    // $ANTLR start "ruleVersion"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:385:1: ruleVersion : ( ( rule__Version__Group__0 ) ) ;
    public final void ruleVersion() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:389:2: ( ( ( rule__Version__Group__0 ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:390:1: ( ( rule__Version__Group__0 ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:390:1: ( ( rule__Version__Group__0 ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:391:1: ( rule__Version__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVersionAccess().getGroup()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:392:1: ( rule__Version__Group__0 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:392:2: rule__Version__Group__0
            {
            pushFollow(FOLLOW_rule__Version__Group__0_in_ruleVersion760);
            rule__Version__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVersionAccess().getGroup()); 
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
    // $ANTLR end "ruleVersion"


    // $ANTLR start "entryRuleQualifier"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:404:1: entryRuleQualifier : ruleQualifier EOF ;
    public final void entryRuleQualifier() throws RecognitionException {
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:405:1: ( ruleQualifier EOF )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:406:1: ruleQualifier EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifierRule()); 
            }
            pushFollow(FOLLOW_ruleQualifier_in_entryRuleQualifier787);
            ruleQualifier();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifierRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifier794); if (state.failed) return ;

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
    // $ANTLR end "entryRuleQualifier"


    // $ANTLR start "ruleQualifier"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:413:1: ruleQualifier : ( ( rule__Qualifier__Group__0 ) ) ;
    public final void ruleQualifier() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:417:2: ( ( ( rule__Qualifier__Group__0 ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:418:1: ( ( rule__Qualifier__Group__0 ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:418:1: ( ( rule__Qualifier__Group__0 ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:419:1: ( rule__Qualifier__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifierAccess().getGroup()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:420:1: ( rule__Qualifier__Group__0 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:420:2: rule__Qualifier__Group__0
            {
            pushFollow(FOLLOW_rule__Qualifier__Group__0_in_ruleQualifier820);
            rule__Qualifier__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifierAccess().getGroup()); 
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
    // $ANTLR end "ruleQualifier"


    // $ANTLR start "entryRuleEString"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:432:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:433:1: ( ruleEString EOF )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:434:1: ruleEString EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEStringRule()); 
            }
            pushFollow(FOLLOW_ruleEString_in_entryRuleEString847);
            ruleEString();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEStringRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEString854); if (state.failed) return ;

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
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:441:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:445:2: ( ( ( rule__EString__Alternatives ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:446:1: ( ( rule__EString__Alternatives ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:446:1: ( ( rule__EString__Alternatives ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:447:1: ( rule__EString__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEStringAccess().getAlternatives()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:448:1: ( rule__EString__Alternatives )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:448:2: rule__EString__Alternatives
            {
            pushFollow(FOLLOW_rule__EString__Alternatives_in_ruleEString880);
            rule__EString__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEStringAccess().getAlternatives()); 
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
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleFQN"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:460:1: entryRuleFQN : ruleFQN EOF ;
    public final void entryRuleFQN() throws RecognitionException {
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:461:1: ( ruleFQN EOF )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:462:1: ruleFQN EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFQNRule()); 
            }
            pushFollow(FOLLOW_ruleFQN_in_entryRuleFQN907);
            ruleFQN();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFQNRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFQN914); if (state.failed) return ;

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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:469:1: ruleFQN : ( ( rule__FQN__Group__0 ) ) ;
    public final void ruleFQN() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:473:2: ( ( ( rule__FQN__Group__0 ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:474:1: ( ( rule__FQN__Group__0 ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:474:1: ( ( rule__FQN__Group__0 ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:475:1: ( rule__FQN__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFQNAccess().getGroup()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:476:1: ( rule__FQN__Group__0 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:476:2: rule__FQN__Group__0
            {
            pushFollow(FOLLOW_rule__FQN__Group__0_in_ruleFQN940);
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


    // $ANTLR start "entryRuleEBoolean"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:488:1: entryRuleEBoolean : ruleEBoolean EOF ;
    public final void entryRuleEBoolean() throws RecognitionException {
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:489:1: ( ruleEBoolean EOF )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:490:1: ruleEBoolean EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEBooleanRule()); 
            }
            pushFollow(FOLLOW_ruleEBoolean_in_entryRuleEBoolean967);
            ruleEBoolean();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEBooleanRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEBoolean974); if (state.failed) return ;

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
    // $ANTLR end "entryRuleEBoolean"


    // $ANTLR start "ruleEBoolean"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:497:1: ruleEBoolean : ( ( rule__EBoolean__Alternatives ) ) ;
    public final void ruleEBoolean() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:501:2: ( ( ( rule__EBoolean__Alternatives ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:502:1: ( ( rule__EBoolean__Alternatives ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:502:1: ( ( rule__EBoolean__Alternatives ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:503:1: ( rule__EBoolean__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEBooleanAccess().getAlternatives()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:504:1: ( rule__EBoolean__Alternatives )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:504:2: rule__EBoolean__Alternatives
            {
            pushFollow(FOLLOW_rule__EBoolean__Alternatives_in_ruleEBoolean1000);
            rule__EBoolean__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEBooleanAccess().getAlternatives()); 
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
    // $ANTLR end "ruleEBoolean"


    // $ANTLR start "rule__ConfigurationElement__Alternatives"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:518:1: rule__ConfigurationElement__Alternatives : ( ( ruleTargetApplication ) | ( ruleGenerationConfiguration ) | ( ruleGeneration ) | ( ruleRelease ) );
    public final void rule__ConfigurationElement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:522:1: ( ( ruleTargetApplication ) | ( ruleGenerationConfiguration ) | ( ruleGeneration ) | ( ruleRelease ) )
            int alt1=4;
            switch ( input.LA(1) ) {
            case 18:
                {
                alt1=1;
                }
                break;
            case 19:
                {
                alt1=2;
                }
                break;
            case 21:
                {
                alt1=3;
                }
                break;
            case 38:
                {
                alt1=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:523:1: ( ruleTargetApplication )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:523:1: ( ruleTargetApplication )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:524:1: ruleTargetApplication
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getConfigurationElementAccess().getTargetApplicationParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_ruleTargetApplication_in_rule__ConfigurationElement__Alternatives1038);
                    ruleTargetApplication();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getConfigurationElementAccess().getTargetApplicationParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:529:6: ( ruleGenerationConfiguration )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:529:6: ( ruleGenerationConfiguration )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:530:1: ruleGenerationConfiguration
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getConfigurationElementAccess().getGenerationConfigurationParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_ruleGenerationConfiguration_in_rule__ConfigurationElement__Alternatives1055);
                    ruleGenerationConfiguration();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getConfigurationElementAccess().getGenerationConfigurationParserRuleCall_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:535:6: ( ruleGeneration )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:535:6: ( ruleGeneration )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:536:1: ruleGeneration
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getConfigurationElementAccess().getGenerationParserRuleCall_2()); 
                    }
                    pushFollow(FOLLOW_ruleGeneration_in_rule__ConfigurationElement__Alternatives1072);
                    ruleGeneration();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getConfigurationElementAccess().getGenerationParserRuleCall_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:541:6: ( ruleRelease )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:541:6: ( ruleRelease )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:542:1: ruleRelease
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getConfigurationElementAccess().getReleaseParserRuleCall_3()); 
                    }
                    pushFollow(FOLLOW_ruleRelease_in_rule__ConfigurationElement__Alternatives1089);
                    ruleRelease();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getConfigurationElementAccess().getReleaseParserRuleCall_3()); 
                    }

                    }


                    }
                    break;

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
    // $ANTLR end "rule__ConfigurationElement__Alternatives"


    // $ANTLR start "rule__ExtensionGeneratrionConfiguration__Alternatives"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:552:1: rule__ExtensionGeneratrionConfiguration__Alternatives : ( ( ruleDiagramGenerationConfiguration ) | ( ruleDocumentationGenerationConfiguration ) | ( ruleModelsAirdGenerationConfiguration ) );
    public final void rule__ExtensionGeneratrionConfiguration__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:556:1: ( ( ruleDiagramGenerationConfiguration ) | ( ruleDocumentationGenerationConfiguration ) | ( ruleModelsAirdGenerationConfiguration ) )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 32:
                {
                alt2=1;
                }
                break;
            case 34:
                {
                alt2=2;
                }
                break;
            case 36:
                {
                alt2=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:557:1: ( ruleDiagramGenerationConfiguration )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:557:1: ( ruleDiagramGenerationConfiguration )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:558:1: ruleDiagramGenerationConfiguration
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getExtensionGeneratrionConfigurationAccess().getDiagramGenerationConfigurationParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_ruleDiagramGenerationConfiguration_in_rule__ExtensionGeneratrionConfiguration__Alternatives1121);
                    ruleDiagramGenerationConfiguration();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getExtensionGeneratrionConfigurationAccess().getDiagramGenerationConfigurationParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:563:6: ( ruleDocumentationGenerationConfiguration )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:563:6: ( ruleDocumentationGenerationConfiguration )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:564:1: ruleDocumentationGenerationConfiguration
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getExtensionGeneratrionConfigurationAccess().getDocumentationGenerationConfigurationParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_ruleDocumentationGenerationConfiguration_in_rule__ExtensionGeneratrionConfiguration__Alternatives1138);
                    ruleDocumentationGenerationConfiguration();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getExtensionGeneratrionConfigurationAccess().getDocumentationGenerationConfigurationParserRuleCall_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:569:6: ( ruleModelsAirdGenerationConfiguration )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:569:6: ( ruleModelsAirdGenerationConfiguration )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:570:1: ruleModelsAirdGenerationConfiguration
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getExtensionGeneratrionConfigurationAccess().getModelsAirdGenerationConfigurationParserRuleCall_2()); 
                    }
                    pushFollow(FOLLOW_ruleModelsAirdGenerationConfiguration_in_rule__ExtensionGeneratrionConfiguration__Alternatives1155);
                    ruleModelsAirdGenerationConfiguration();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getExtensionGeneratrionConfigurationAccess().getModelsAirdGenerationConfigurationParserRuleCall_2()); 
                    }

                    }


                    }
                    break;

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
    // $ANTLR end "rule__ExtensionGeneratrionConfiguration__Alternatives"


    // $ANTLR start "rule__Qualifier__Alternatives_0"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:580:1: rule__Qualifier__Alternatives_0 : ( ( RULE_INT ) | ( RULE_ID ) | ( '_' ) );
    public final void rule__Qualifier__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:584:1: ( ( RULE_INT ) | ( RULE_ID ) | ( '_' ) )
            int alt3=3;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                alt3=1;
                }
                break;
            case RULE_ID:
                {
                alt3=2;
                }
                break;
            case 11:
                {
                alt3=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:585:1: ( RULE_INT )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:585:1: ( RULE_INT )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:586:1: RULE_INT
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getQualifierAccess().getINTTerminalRuleCall_0_0()); 
                    }
                    match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Qualifier__Alternatives_01187); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getQualifierAccess().getINTTerminalRuleCall_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:591:6: ( RULE_ID )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:591:6: ( RULE_ID )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:592:1: RULE_ID
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getQualifierAccess().getIDTerminalRuleCall_0_1()); 
                    }
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Qualifier__Alternatives_01204); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getQualifierAccess().getIDTerminalRuleCall_0_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:597:6: ( '_' )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:597:6: ( '_' )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:598:1: '_'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getQualifierAccess().get_Keyword_0_2()); 
                    }
                    match(input,11,FOLLOW_11_in_rule__Qualifier__Alternatives_01222); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getQualifierAccess().get_Keyword_0_2()); 
                    }

                    }


                    }
                    break;

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
    // $ANTLR end "rule__Qualifier__Alternatives_0"


    // $ANTLR start "rule__Qualifier__Alternatives_1"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:610:1: rule__Qualifier__Alternatives_1 : ( ( RULE_INT ) | ( RULE_ID ) | ( '_' ) | ( '-' ) );
    public final void rule__Qualifier__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:614:1: ( ( RULE_INT ) | ( RULE_ID ) | ( '_' ) | ( '-' ) )
            int alt4=4;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                alt4=1;
                }
                break;
            case RULE_ID:
                {
                alt4=2;
                }
                break;
            case 11:
                {
                alt4=3;
                }
                break;
            case 12:
                {
                alt4=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:615:1: ( RULE_INT )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:615:1: ( RULE_INT )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:616:1: RULE_INT
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getQualifierAccess().getINTTerminalRuleCall_1_0()); 
                    }
                    match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Qualifier__Alternatives_11256); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getQualifierAccess().getINTTerminalRuleCall_1_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:621:6: ( RULE_ID )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:621:6: ( RULE_ID )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:622:1: RULE_ID
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getQualifierAccess().getIDTerminalRuleCall_1_1()); 
                    }
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Qualifier__Alternatives_11273); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getQualifierAccess().getIDTerminalRuleCall_1_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:627:6: ( '_' )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:627:6: ( '_' )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:628:1: '_'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getQualifierAccess().get_Keyword_1_2()); 
                    }
                    match(input,11,FOLLOW_11_in_rule__Qualifier__Alternatives_11291); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getQualifierAccess().get_Keyword_1_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:635:6: ( '-' )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:635:6: ( '-' )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:636:1: '-'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getQualifierAccess().getHyphenMinusKeyword_1_3()); 
                    }
                    match(input,12,FOLLOW_12_in_rule__Qualifier__Alternatives_11311); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getQualifierAccess().getHyphenMinusKeyword_1_3()); 
                    }

                    }


                    }
                    break;

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
    // $ANTLR end "rule__Qualifier__Alternatives_1"


    // $ANTLR start "rule__EString__Alternatives"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:648:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:652:1: ( ( RULE_STRING ) | ( RULE_ID ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_STRING) ) {
                alt5=1;
            }
            else if ( (LA5_0==RULE_ID) ) {
                alt5=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:653:1: ( RULE_STRING )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:653:1: ( RULE_STRING )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:654:1: RULE_STRING
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    }
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__EString__Alternatives1345); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:659:6: ( RULE_ID )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:659:6: ( RULE_ID )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:660:1: RULE_ID
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                    }
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__EString__Alternatives1362); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                    }

                    }


                    }
                    break;

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
    // $ANTLR end "rule__EString__Alternatives"


    // $ANTLR start "rule__EBoolean__Alternatives"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:670:1: rule__EBoolean__Alternatives : ( ( 'true' ) | ( 'false' ) );
    public final void rule__EBoolean__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:674:1: ( ( 'true' ) | ( 'false' ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==13) ) {
                alt6=1;
            }
            else if ( (LA6_0==14) ) {
                alt6=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:675:1: ( 'true' )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:675:1: ( 'true' )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:676:1: 'true'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEBooleanAccess().getTrueKeyword_0()); 
                    }
                    match(input,13,FOLLOW_13_in_rule__EBoolean__Alternatives1395); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEBooleanAccess().getTrueKeyword_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:683:6: ( 'false' )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:683:6: ( 'false' )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:684:1: 'false'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEBooleanAccess().getFalseKeyword_1()); 
                    }
                    match(input,14,FOLLOW_14_in_rule__EBoolean__Alternatives1415); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEBooleanAccess().getFalseKeyword_1()); 
                    }

                    }


                    }
                    break;

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
    // $ANTLR end "rule__EBoolean__Alternatives"


    // $ANTLR start "rule__Configuration__Group__0"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:698:1: rule__Configuration__Group__0 : rule__Configuration__Group__0__Impl rule__Configuration__Group__1 ;
    public final void rule__Configuration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:702:1: ( rule__Configuration__Group__0__Impl rule__Configuration__Group__1 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:703:2: rule__Configuration__Group__0__Impl rule__Configuration__Group__1
            {
            pushFollow(FOLLOW_rule__Configuration__Group__0__Impl_in_rule__Configuration__Group__01447);
            rule__Configuration__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Configuration__Group__1_in_rule__Configuration__Group__01450);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:710:1: rule__Configuration__Group__0__Impl : ( () ) ;
    public final void rule__Configuration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:714:1: ( ( () ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:715:1: ( () )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:715:1: ( () )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:716:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConfigurationAccess().getConfigurationAction_0()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:717:1: ()
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:719:1: 
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:729:1: rule__Configuration__Group__1 : rule__Configuration__Group__1__Impl rule__Configuration__Group__2 ;
    public final void rule__Configuration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:733:1: ( rule__Configuration__Group__1__Impl rule__Configuration__Group__2 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:734:2: rule__Configuration__Group__1__Impl rule__Configuration__Group__2
            {
            pushFollow(FOLLOW_rule__Configuration__Group__1__Impl_in_rule__Configuration__Group__11508);
            rule__Configuration__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Configuration__Group__2_in_rule__Configuration__Group__11511);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:741:1: rule__Configuration__Group__1__Impl : ( 'Configuration' ) ;
    public final void rule__Configuration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:745:1: ( ( 'Configuration' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:746:1: ( 'Configuration' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:746:1: ( 'Configuration' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:747:1: 'Configuration'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConfigurationAccess().getConfigurationKeyword_1()); 
            }
            match(input,15,FOLLOW_15_in_rule__Configuration__Group__1__Impl1539); if (state.failed) return ;
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:760:1: rule__Configuration__Group__2 : rule__Configuration__Group__2__Impl rule__Configuration__Group__3 ;
    public final void rule__Configuration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:764:1: ( rule__Configuration__Group__2__Impl rule__Configuration__Group__3 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:765:2: rule__Configuration__Group__2__Impl rule__Configuration__Group__3
            {
            pushFollow(FOLLOW_rule__Configuration__Group__2__Impl_in_rule__Configuration__Group__21570);
            rule__Configuration__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Configuration__Group__3_in_rule__Configuration__Group__21573);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:772:1: rule__Configuration__Group__2__Impl : ( ( rule__Configuration__NameAssignment_2 ) ) ;
    public final void rule__Configuration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:776:1: ( ( ( rule__Configuration__NameAssignment_2 ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:777:1: ( ( rule__Configuration__NameAssignment_2 ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:777:1: ( ( rule__Configuration__NameAssignment_2 ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:778:1: ( rule__Configuration__NameAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConfigurationAccess().getNameAssignment_2()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:779:1: ( rule__Configuration__NameAssignment_2 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:779:2: rule__Configuration__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__Configuration__NameAssignment_2_in_rule__Configuration__Group__2__Impl1600);
            rule__Configuration__NameAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getConfigurationAccess().getNameAssignment_2()); 
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:789:1: rule__Configuration__Group__3 : rule__Configuration__Group__3__Impl rule__Configuration__Group__4 ;
    public final void rule__Configuration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:793:1: ( rule__Configuration__Group__3__Impl rule__Configuration__Group__4 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:794:2: rule__Configuration__Group__3__Impl rule__Configuration__Group__4
            {
            pushFollow(FOLLOW_rule__Configuration__Group__3__Impl_in_rule__Configuration__Group__31630);
            rule__Configuration__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Configuration__Group__4_in_rule__Configuration__Group__31633);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:801:1: rule__Configuration__Group__3__Impl : ( '{' ) ;
    public final void rule__Configuration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:805:1: ( ( '{' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:806:1: ( '{' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:806:1: ( '{' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:807:1: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConfigurationAccess().getLeftCurlyBracketKeyword_3()); 
            }
            match(input,16,FOLLOW_16_in_rule__Configuration__Group__3__Impl1661); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConfigurationAccess().getLeftCurlyBracketKeyword_3()); 
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:820:1: rule__Configuration__Group__4 : rule__Configuration__Group__4__Impl rule__Configuration__Group__5 ;
    public final void rule__Configuration__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:824:1: ( rule__Configuration__Group__4__Impl rule__Configuration__Group__5 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:825:2: rule__Configuration__Group__4__Impl rule__Configuration__Group__5
            {
            pushFollow(FOLLOW_rule__Configuration__Group__4__Impl_in_rule__Configuration__Group__41692);
            rule__Configuration__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Configuration__Group__5_in_rule__Configuration__Group__41695);
            rule__Configuration__Group__5();

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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:832:1: rule__Configuration__Group__4__Impl : ( ( rule__Configuration__VpConfigurationElementsAssignment_4 )* ) ;
    public final void rule__Configuration__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:836:1: ( ( ( rule__Configuration__VpConfigurationElementsAssignment_4 )* ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:837:1: ( ( rule__Configuration__VpConfigurationElementsAssignment_4 )* )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:837:1: ( ( rule__Configuration__VpConfigurationElementsAssignment_4 )* )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:838:1: ( rule__Configuration__VpConfigurationElementsAssignment_4 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConfigurationAccess().getVpConfigurationElementsAssignment_4()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:839:1: ( rule__Configuration__VpConfigurationElementsAssignment_4 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>=18 && LA7_0<=19)||LA7_0==21||LA7_0==38) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:839:2: rule__Configuration__VpConfigurationElementsAssignment_4
            	    {
            	    pushFollow(FOLLOW_rule__Configuration__VpConfigurationElementsAssignment_4_in_rule__Configuration__Group__4__Impl1722);
            	    rule__Configuration__VpConfigurationElementsAssignment_4();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getConfigurationAccess().getVpConfigurationElementsAssignment_4()); 
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


    // $ANTLR start "rule__Configuration__Group__5"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:849:1: rule__Configuration__Group__5 : rule__Configuration__Group__5__Impl ;
    public final void rule__Configuration__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:853:1: ( rule__Configuration__Group__5__Impl )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:854:2: rule__Configuration__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__Configuration__Group__5__Impl_in_rule__Configuration__Group__51753);
            rule__Configuration__Group__5__Impl();

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
    // $ANTLR end "rule__Configuration__Group__5"


    // $ANTLR start "rule__Configuration__Group__5__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:860:1: rule__Configuration__Group__5__Impl : ( '}' ) ;
    public final void rule__Configuration__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:864:1: ( ( '}' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:865:1: ( '}' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:865:1: ( '}' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:866:1: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConfigurationAccess().getRightCurlyBracketKeyword_5()); 
            }
            match(input,17,FOLLOW_17_in_rule__Configuration__Group__5__Impl1781); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConfigurationAccess().getRightCurlyBracketKeyword_5()); 
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
    // $ANTLR end "rule__Configuration__Group__5__Impl"


    // $ANTLR start "rule__TargetApplication__Group__0"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:891:1: rule__TargetApplication__Group__0 : rule__TargetApplication__Group__0__Impl rule__TargetApplication__Group__1 ;
    public final void rule__TargetApplication__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:895:1: ( rule__TargetApplication__Group__0__Impl rule__TargetApplication__Group__1 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:896:2: rule__TargetApplication__Group__0__Impl rule__TargetApplication__Group__1
            {
            pushFollow(FOLLOW_rule__TargetApplication__Group__0__Impl_in_rule__TargetApplication__Group__01824);
            rule__TargetApplication__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__TargetApplication__Group__1_in_rule__TargetApplication__Group__01827);
            rule__TargetApplication__Group__1();

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
    // $ANTLR end "rule__TargetApplication__Group__0"


    // $ANTLR start "rule__TargetApplication__Group__0__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:903:1: rule__TargetApplication__Group__0__Impl : ( () ) ;
    public final void rule__TargetApplication__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:907:1: ( ( () ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:908:1: ( () )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:908:1: ( () )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:909:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTargetApplicationAccess().getTargetApplicationAction_0()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:910:1: ()
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:912:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTargetApplicationAccess().getTargetApplicationAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TargetApplication__Group__0__Impl"


    // $ANTLR start "rule__TargetApplication__Group__1"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:922:1: rule__TargetApplication__Group__1 : rule__TargetApplication__Group__1__Impl rule__TargetApplication__Group__2 ;
    public final void rule__TargetApplication__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:926:1: ( rule__TargetApplication__Group__1__Impl rule__TargetApplication__Group__2 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:927:2: rule__TargetApplication__Group__1__Impl rule__TargetApplication__Group__2
            {
            pushFollow(FOLLOW_rule__TargetApplication__Group__1__Impl_in_rule__TargetApplication__Group__11885);
            rule__TargetApplication__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__TargetApplication__Group__2_in_rule__TargetApplication__Group__11888);
            rule__TargetApplication__Group__2();

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
    // $ANTLR end "rule__TargetApplication__Group__1"


    // $ANTLR start "rule__TargetApplication__Group__1__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:934:1: rule__TargetApplication__Group__1__Impl : ( 'target' ) ;
    public final void rule__TargetApplication__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:938:1: ( ( 'target' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:939:1: ( 'target' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:939:1: ( 'target' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:940:1: 'target'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTargetApplicationAccess().getTargetKeyword_1()); 
            }
            match(input,18,FOLLOW_18_in_rule__TargetApplication__Group__1__Impl1916); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTargetApplicationAccess().getTargetKeyword_1()); 
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
    // $ANTLR end "rule__TargetApplication__Group__1__Impl"


    // $ANTLR start "rule__TargetApplication__Group__2"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:953:1: rule__TargetApplication__Group__2 : rule__TargetApplication__Group__2__Impl ;
    public final void rule__TargetApplication__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:957:1: ( rule__TargetApplication__Group__2__Impl )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:958:2: rule__TargetApplication__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__TargetApplication__Group__2__Impl_in_rule__TargetApplication__Group__21947);
            rule__TargetApplication__Group__2__Impl();

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
    // $ANTLR end "rule__TargetApplication__Group__2"


    // $ANTLR start "rule__TargetApplication__Group__2__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:964:1: rule__TargetApplication__Group__2__Impl : ( ( rule__TargetApplication__TypeAssignment_2 ) ) ;
    public final void rule__TargetApplication__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:968:1: ( ( ( rule__TargetApplication__TypeAssignment_2 ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:969:1: ( ( rule__TargetApplication__TypeAssignment_2 ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:969:1: ( ( rule__TargetApplication__TypeAssignment_2 ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:970:1: ( rule__TargetApplication__TypeAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTargetApplicationAccess().getTypeAssignment_2()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:971:1: ( rule__TargetApplication__TypeAssignment_2 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:971:2: rule__TargetApplication__TypeAssignment_2
            {
            pushFollow(FOLLOW_rule__TargetApplication__TypeAssignment_2_in_rule__TargetApplication__Group__2__Impl1974);
            rule__TargetApplication__TypeAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTargetApplicationAccess().getTypeAssignment_2()); 
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
    // $ANTLR end "rule__TargetApplication__Group__2__Impl"


    // $ANTLR start "rule__GenerationConfiguration__Group__0"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:987:1: rule__GenerationConfiguration__Group__0 : rule__GenerationConfiguration__Group__0__Impl rule__GenerationConfiguration__Group__1 ;
    public final void rule__GenerationConfiguration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:991:1: ( rule__GenerationConfiguration__Group__0__Impl rule__GenerationConfiguration__Group__1 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:992:2: rule__GenerationConfiguration__Group__0__Impl rule__GenerationConfiguration__Group__1
            {
            pushFollow(FOLLOW_rule__GenerationConfiguration__Group__0__Impl_in_rule__GenerationConfiguration__Group__02010);
            rule__GenerationConfiguration__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__GenerationConfiguration__Group__1_in_rule__GenerationConfiguration__Group__02013);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:999:1: rule__GenerationConfiguration__Group__0__Impl : ( () ) ;
    public final void rule__GenerationConfiguration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1003:1: ( ( () ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1004:1: ( () )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1004:1: ( () )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1005:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGenerationConfigurationAccess().getGenerationConfigurationAction_0()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1006:1: ()
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1008:1: 
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1018:1: rule__GenerationConfiguration__Group__1 : rule__GenerationConfiguration__Group__1__Impl rule__GenerationConfiguration__Group__2 ;
    public final void rule__GenerationConfiguration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1022:1: ( rule__GenerationConfiguration__Group__1__Impl rule__GenerationConfiguration__Group__2 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1023:2: rule__GenerationConfiguration__Group__1__Impl rule__GenerationConfiguration__Group__2
            {
            pushFollow(FOLLOW_rule__GenerationConfiguration__Group__1__Impl_in_rule__GenerationConfiguration__Group__12071);
            rule__GenerationConfiguration__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__GenerationConfiguration__Group__2_in_rule__GenerationConfiguration__Group__12074);
            rule__GenerationConfiguration__Group__2();

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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1030:1: rule__GenerationConfiguration__Group__1__Impl : ( 'project' ) ;
    public final void rule__GenerationConfiguration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1034:1: ( ( 'project' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1035:1: ( 'project' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1035:1: ( 'project' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1036:1: 'project'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGenerationConfigurationAccess().getProjectKeyword_1()); 
            }
            match(input,19,FOLLOW_19_in_rule__GenerationConfiguration__Group__1__Impl2102); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGenerationConfigurationAccess().getProjectKeyword_1()); 
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


    // $ANTLR start "rule__GenerationConfiguration__Group__2"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1049:1: rule__GenerationConfiguration__Group__2 : rule__GenerationConfiguration__Group__2__Impl rule__GenerationConfiguration__Group__3 ;
    public final void rule__GenerationConfiguration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1053:1: ( rule__GenerationConfiguration__Group__2__Impl rule__GenerationConfiguration__Group__3 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1054:2: rule__GenerationConfiguration__Group__2__Impl rule__GenerationConfiguration__Group__3
            {
            pushFollow(FOLLOW_rule__GenerationConfiguration__Group__2__Impl_in_rule__GenerationConfiguration__Group__22133);
            rule__GenerationConfiguration__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__GenerationConfiguration__Group__3_in_rule__GenerationConfiguration__Group__22136);
            rule__GenerationConfiguration__Group__3();

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
    // $ANTLR end "rule__GenerationConfiguration__Group__2"


    // $ANTLR start "rule__GenerationConfiguration__Group__2__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1061:1: rule__GenerationConfiguration__Group__2__Impl : ( ( rule__GenerationConfiguration__ProjectNameAssignment_2 ) ) ;
    public final void rule__GenerationConfiguration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1065:1: ( ( ( rule__GenerationConfiguration__ProjectNameAssignment_2 ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1066:1: ( ( rule__GenerationConfiguration__ProjectNameAssignment_2 ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1066:1: ( ( rule__GenerationConfiguration__ProjectNameAssignment_2 ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1067:1: ( rule__GenerationConfiguration__ProjectNameAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGenerationConfigurationAccess().getProjectNameAssignment_2()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1068:1: ( rule__GenerationConfiguration__ProjectNameAssignment_2 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1068:2: rule__GenerationConfiguration__ProjectNameAssignment_2
            {
            pushFollow(FOLLOW_rule__GenerationConfiguration__ProjectNameAssignment_2_in_rule__GenerationConfiguration__Group__2__Impl2163);
            rule__GenerationConfiguration__ProjectNameAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGenerationConfigurationAccess().getProjectNameAssignment_2()); 
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
    // $ANTLR end "rule__GenerationConfiguration__Group__2__Impl"


    // $ANTLR start "rule__GenerationConfiguration__Group__3"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1078:1: rule__GenerationConfiguration__Group__3 : rule__GenerationConfiguration__Group__3__Impl ;
    public final void rule__GenerationConfiguration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1082:1: ( rule__GenerationConfiguration__Group__3__Impl )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1083:2: rule__GenerationConfiguration__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__GenerationConfiguration__Group__3__Impl_in_rule__GenerationConfiguration__Group__32193);
            rule__GenerationConfiguration__Group__3__Impl();

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
    // $ANTLR end "rule__GenerationConfiguration__Group__3"


    // $ANTLR start "rule__GenerationConfiguration__Group__3__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1089:1: rule__GenerationConfiguration__Group__3__Impl : ( ( rule__GenerationConfiguration__Group_3__0 )? ) ;
    public final void rule__GenerationConfiguration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1093:1: ( ( ( rule__GenerationConfiguration__Group_3__0 )? ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1094:1: ( ( rule__GenerationConfiguration__Group_3__0 )? )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1094:1: ( ( rule__GenerationConfiguration__Group_3__0 )? )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1095:1: ( rule__GenerationConfiguration__Group_3__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGenerationConfigurationAccess().getGroup_3()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1096:1: ( rule__GenerationConfiguration__Group_3__0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==20) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1096:2: rule__GenerationConfiguration__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__GenerationConfiguration__Group_3__0_in_rule__GenerationConfiguration__Group__3__Impl2220);
                    rule__GenerationConfiguration__Group_3__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGenerationConfigurationAccess().getGroup_3()); 
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
    // $ANTLR end "rule__GenerationConfiguration__Group__3__Impl"


    // $ANTLR start "rule__GenerationConfiguration__Group_3__0"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1114:1: rule__GenerationConfiguration__Group_3__0 : rule__GenerationConfiguration__Group_3__0__Impl rule__GenerationConfiguration__Group_3__1 ;
    public final void rule__GenerationConfiguration__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1118:1: ( rule__GenerationConfiguration__Group_3__0__Impl rule__GenerationConfiguration__Group_3__1 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1119:2: rule__GenerationConfiguration__Group_3__0__Impl rule__GenerationConfiguration__Group_3__1
            {
            pushFollow(FOLLOW_rule__GenerationConfiguration__Group_3__0__Impl_in_rule__GenerationConfiguration__Group_3__02259);
            rule__GenerationConfiguration__Group_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__GenerationConfiguration__Group_3__1_in_rule__GenerationConfiguration__Group_3__02262);
            rule__GenerationConfiguration__Group_3__1();

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
    // $ANTLR end "rule__GenerationConfiguration__Group_3__0"


    // $ANTLR start "rule__GenerationConfiguration__Group_3__0__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1126:1: rule__GenerationConfiguration__Group_3__0__Impl : ( 'nsuri' ) ;
    public final void rule__GenerationConfiguration__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1130:1: ( ( 'nsuri' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1131:1: ( 'nsuri' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1131:1: ( 'nsuri' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1132:1: 'nsuri'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGenerationConfigurationAccess().getNsuriKeyword_3_0()); 
            }
            match(input,20,FOLLOW_20_in_rule__GenerationConfiguration__Group_3__0__Impl2290); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGenerationConfigurationAccess().getNsuriKeyword_3_0()); 
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
    // $ANTLR end "rule__GenerationConfiguration__Group_3__0__Impl"


    // $ANTLR start "rule__GenerationConfiguration__Group_3__1"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1145:1: rule__GenerationConfiguration__Group_3__1 : rule__GenerationConfiguration__Group_3__1__Impl ;
    public final void rule__GenerationConfiguration__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1149:1: ( rule__GenerationConfiguration__Group_3__1__Impl )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1150:2: rule__GenerationConfiguration__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__GenerationConfiguration__Group_3__1__Impl_in_rule__GenerationConfiguration__Group_3__12321);
            rule__GenerationConfiguration__Group_3__1__Impl();

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
    // $ANTLR end "rule__GenerationConfiguration__Group_3__1"


    // $ANTLR start "rule__GenerationConfiguration__Group_3__1__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1156:1: rule__GenerationConfiguration__Group_3__1__Impl : ( ( rule__GenerationConfiguration__NsuriAssignment_3_1 ) ) ;
    public final void rule__GenerationConfiguration__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1160:1: ( ( ( rule__GenerationConfiguration__NsuriAssignment_3_1 ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1161:1: ( ( rule__GenerationConfiguration__NsuriAssignment_3_1 ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1161:1: ( ( rule__GenerationConfiguration__NsuriAssignment_3_1 ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1162:1: ( rule__GenerationConfiguration__NsuriAssignment_3_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGenerationConfigurationAccess().getNsuriAssignment_3_1()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1163:1: ( rule__GenerationConfiguration__NsuriAssignment_3_1 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1163:2: rule__GenerationConfiguration__NsuriAssignment_3_1
            {
            pushFollow(FOLLOW_rule__GenerationConfiguration__NsuriAssignment_3_1_in_rule__GenerationConfiguration__Group_3__1__Impl2348);
            rule__GenerationConfiguration__NsuriAssignment_3_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGenerationConfigurationAccess().getNsuriAssignment_3_1()); 
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
    // $ANTLR end "rule__GenerationConfiguration__Group_3__1__Impl"


    // $ANTLR start "rule__Generation__Group__0"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1177:1: rule__Generation__Group__0 : rule__Generation__Group__0__Impl rule__Generation__Group__1 ;
    public final void rule__Generation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1181:1: ( rule__Generation__Group__0__Impl rule__Generation__Group__1 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1182:2: rule__Generation__Group__0__Impl rule__Generation__Group__1
            {
            pushFollow(FOLLOW_rule__Generation__Group__0__Impl_in_rule__Generation__Group__02382);
            rule__Generation__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Generation__Group__1_in_rule__Generation__Group__02385);
            rule__Generation__Group__1();

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
    // $ANTLR end "rule__Generation__Group__0"


    // $ANTLR start "rule__Generation__Group__0__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1189:1: rule__Generation__Group__0__Impl : ( () ) ;
    public final void rule__Generation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1193:1: ( ( () ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1194:1: ( () )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1194:1: ( () )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1195:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGenerationAccess().getGenerationAction_0()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1196:1: ()
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1198:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGenerationAccess().getGenerationAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Generation__Group__0__Impl"


    // $ANTLR start "rule__Generation__Group__1"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1208:1: rule__Generation__Group__1 : rule__Generation__Group__1__Impl rule__Generation__Group__2 ;
    public final void rule__Generation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1212:1: ( rule__Generation__Group__1__Impl rule__Generation__Group__2 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1213:2: rule__Generation__Group__1__Impl rule__Generation__Group__2
            {
            pushFollow(FOLLOW_rule__Generation__Group__1__Impl_in_rule__Generation__Group__12443);
            rule__Generation__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Generation__Group__2_in_rule__Generation__Group__12446);
            rule__Generation__Group__2();

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
    // $ANTLR end "rule__Generation__Group__1"


    // $ANTLR start "rule__Generation__Group__1__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1220:1: rule__Generation__Group__1__Impl : ( 'generation' ) ;
    public final void rule__Generation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1224:1: ( ( 'generation' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1225:1: ( 'generation' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1225:1: ( 'generation' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1226:1: 'generation'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGenerationAccess().getGenerationKeyword_1()); 
            }
            match(input,21,FOLLOW_21_in_rule__Generation__Group__1__Impl2474); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGenerationAccess().getGenerationKeyword_1()); 
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
    // $ANTLR end "rule__Generation__Group__1__Impl"


    // $ANTLR start "rule__Generation__Group__2"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1239:1: rule__Generation__Group__2 : rule__Generation__Group__2__Impl rule__Generation__Group__3 ;
    public final void rule__Generation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1243:1: ( rule__Generation__Group__2__Impl rule__Generation__Group__3 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1244:2: rule__Generation__Group__2__Impl rule__Generation__Group__3
            {
            pushFollow(FOLLOW_rule__Generation__Group__2__Impl_in_rule__Generation__Group__22505);
            rule__Generation__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Generation__Group__3_in_rule__Generation__Group__22508);
            rule__Generation__Group__3();

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
    // $ANTLR end "rule__Generation__Group__2"


    // $ANTLR start "rule__Generation__Group__2__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1251:1: rule__Generation__Group__2__Impl : ( '{' ) ;
    public final void rule__Generation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1255:1: ( ( '{' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1256:1: ( '{' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1256:1: ( '{' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1257:1: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGenerationAccess().getLeftCurlyBracketKeyword_2()); 
            }
            match(input,16,FOLLOW_16_in_rule__Generation__Group__2__Impl2536); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGenerationAccess().getLeftCurlyBracketKeyword_2()); 
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
    // $ANTLR end "rule__Generation__Group__2__Impl"


    // $ANTLR start "rule__Generation__Group__3"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1270:1: rule__Generation__Group__3 : rule__Generation__Group__3__Impl rule__Generation__Group__4 ;
    public final void rule__Generation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1274:1: ( rule__Generation__Group__3__Impl rule__Generation__Group__4 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1275:2: rule__Generation__Group__3__Impl rule__Generation__Group__4
            {
            pushFollow(FOLLOW_rule__Generation__Group__3__Impl_in_rule__Generation__Group__32567);
            rule__Generation__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Generation__Group__4_in_rule__Generation__Group__32570);
            rule__Generation__Group__4();

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
    // $ANTLR end "rule__Generation__Group__3"


    // $ANTLR start "rule__Generation__Group__3__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1282:1: rule__Generation__Group__3__Impl : ( ( rule__Generation__OwnedDataGenerationConfAssignment_3 )? ) ;
    public final void rule__Generation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1286:1: ( ( ( rule__Generation__OwnedDataGenerationConfAssignment_3 )? ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1287:1: ( ( rule__Generation__OwnedDataGenerationConfAssignment_3 )? )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1287:1: ( ( rule__Generation__OwnedDataGenerationConfAssignment_3 )? )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1288:1: ( rule__Generation__OwnedDataGenerationConfAssignment_3 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGenerationAccess().getOwnedDataGenerationConfAssignment_3()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1289:1: ( rule__Generation__OwnedDataGenerationConfAssignment_3 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==22) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1289:2: rule__Generation__OwnedDataGenerationConfAssignment_3
                    {
                    pushFollow(FOLLOW_rule__Generation__OwnedDataGenerationConfAssignment_3_in_rule__Generation__Group__3__Impl2597);
                    rule__Generation__OwnedDataGenerationConfAssignment_3();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGenerationAccess().getOwnedDataGenerationConfAssignment_3()); 
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
    // $ANTLR end "rule__Generation__Group__3__Impl"


    // $ANTLR start "rule__Generation__Group__4"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1299:1: rule__Generation__Group__4 : rule__Generation__Group__4__Impl rule__Generation__Group__5 ;
    public final void rule__Generation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1303:1: ( rule__Generation__Group__4__Impl rule__Generation__Group__5 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1304:2: rule__Generation__Group__4__Impl rule__Generation__Group__5
            {
            pushFollow(FOLLOW_rule__Generation__Group__4__Impl_in_rule__Generation__Group__42628);
            rule__Generation__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Generation__Group__5_in_rule__Generation__Group__42631);
            rule__Generation__Group__5();

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
    // $ANTLR end "rule__Generation__Group__4"


    // $ANTLR start "rule__Generation__Group__4__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1311:1: rule__Generation__Group__4__Impl : ( ( rule__Generation__OwnedExtensionGenConfAssignment_4 )* ) ;
    public final void rule__Generation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1315:1: ( ( ( rule__Generation__OwnedExtensionGenConfAssignment_4 )* ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1316:1: ( ( rule__Generation__OwnedExtensionGenConfAssignment_4 )* )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1316:1: ( ( rule__Generation__OwnedExtensionGenConfAssignment_4 )* )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1317:1: ( rule__Generation__OwnedExtensionGenConfAssignment_4 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGenerationAccess().getOwnedExtensionGenConfAssignment_4()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1318:1: ( rule__Generation__OwnedExtensionGenConfAssignment_4 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==32||LA10_0==34||LA10_0==36) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1318:2: rule__Generation__OwnedExtensionGenConfAssignment_4
            	    {
            	    pushFollow(FOLLOW_rule__Generation__OwnedExtensionGenConfAssignment_4_in_rule__Generation__Group__4__Impl2658);
            	    rule__Generation__OwnedExtensionGenConfAssignment_4();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGenerationAccess().getOwnedExtensionGenConfAssignment_4()); 
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
    // $ANTLR end "rule__Generation__Group__4__Impl"


    // $ANTLR start "rule__Generation__Group__5"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1328:1: rule__Generation__Group__5 : rule__Generation__Group__5__Impl ;
    public final void rule__Generation__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1332:1: ( rule__Generation__Group__5__Impl )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1333:2: rule__Generation__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__Generation__Group__5__Impl_in_rule__Generation__Group__52689);
            rule__Generation__Group__5__Impl();

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
    // $ANTLR end "rule__Generation__Group__5"


    // $ANTLR start "rule__Generation__Group__5__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1339:1: rule__Generation__Group__5__Impl : ( '}' ) ;
    public final void rule__Generation__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1343:1: ( ( '}' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1344:1: ( '}' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1344:1: ( '}' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1345:1: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGenerationAccess().getRightCurlyBracketKeyword_5()); 
            }
            match(input,17,FOLLOW_17_in_rule__Generation__Group__5__Impl2717); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGenerationAccess().getRightCurlyBracketKeyword_5()); 
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
    // $ANTLR end "rule__Generation__Group__5__Impl"


    // $ANTLR start "rule__GData__Group__0"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1370:1: rule__GData__Group__0 : rule__GData__Group__0__Impl rule__GData__Group__1 ;
    public final void rule__GData__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1374:1: ( rule__GData__Group__0__Impl rule__GData__Group__1 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1375:2: rule__GData__Group__0__Impl rule__GData__Group__1
            {
            pushFollow(FOLLOW_rule__GData__Group__0__Impl_in_rule__GData__Group__02760);
            rule__GData__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__GData__Group__1_in_rule__GData__Group__02763);
            rule__GData__Group__1();

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
    // $ANTLR end "rule__GData__Group__0"


    // $ANTLR start "rule__GData__Group__0__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1382:1: rule__GData__Group__0__Impl : ( () ) ;
    public final void rule__GData__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1386:1: ( ( () ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1387:1: ( () )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1387:1: ( () )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1388:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGDataAccess().getGDataAction_0()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1389:1: ()
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1391:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGDataAccess().getGDataAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GData__Group__0__Impl"


    // $ANTLR start "rule__GData__Group__1"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1401:1: rule__GData__Group__1 : rule__GData__Group__1__Impl rule__GData__Group__2 ;
    public final void rule__GData__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1405:1: ( rule__GData__Group__1__Impl rule__GData__Group__2 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1406:2: rule__GData__Group__1__Impl rule__GData__Group__2
            {
            pushFollow(FOLLOW_rule__GData__Group__1__Impl_in_rule__GData__Group__12821);
            rule__GData__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__GData__Group__2_in_rule__GData__Group__12824);
            rule__GData__Group__2();

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
    // $ANTLR end "rule__GData__Group__1"


    // $ANTLR start "rule__GData__Group__1__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1413:1: rule__GData__Group__1__Impl : ( 'data' ) ;
    public final void rule__GData__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1417:1: ( ( 'data' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1418:1: ( 'data' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1418:1: ( 'data' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1419:1: 'data'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGDataAccess().getDataKeyword_1()); 
            }
            match(input,22,FOLLOW_22_in_rule__GData__Group__1__Impl2852); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGDataAccess().getDataKeyword_1()); 
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
    // $ANTLR end "rule__GData__Group__1__Impl"


    // $ANTLR start "rule__GData__Group__2"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1432:1: rule__GData__Group__2 : rule__GData__Group__2__Impl rule__GData__Group__3 ;
    public final void rule__GData__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1436:1: ( rule__GData__Group__2__Impl rule__GData__Group__3 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1437:2: rule__GData__Group__2__Impl rule__GData__Group__3
            {
            pushFollow(FOLLOW_rule__GData__Group__2__Impl_in_rule__GData__Group__22883);
            rule__GData__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__GData__Group__3_in_rule__GData__Group__22886);
            rule__GData__Group__3();

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
    // $ANTLR end "rule__GData__Group__2"


    // $ANTLR start "rule__GData__Group__2__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1444:1: rule__GData__Group__2__Impl : ( '(' ) ;
    public final void rule__GData__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1448:1: ( ( '(' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1449:1: ( '(' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1449:1: ( '(' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1450:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGDataAccess().getLeftParenthesisKeyword_2()); 
            }
            match(input,23,FOLLOW_23_in_rule__GData__Group__2__Impl2914); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGDataAccess().getLeftParenthesisKeyword_2()); 
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
    // $ANTLR end "rule__GData__Group__2__Impl"


    // $ANTLR start "rule__GData__Group__3"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1463:1: rule__GData__Group__3 : rule__GData__Group__3__Impl rule__GData__Group__4 ;
    public final void rule__GData__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1467:1: ( rule__GData__Group__3__Impl rule__GData__Group__4 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1468:2: rule__GData__Group__3__Impl rule__GData__Group__4
            {
            pushFollow(FOLLOW_rule__GData__Group__3__Impl_in_rule__GData__Group__32945);
            rule__GData__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__GData__Group__4_in_rule__GData__Group__32948);
            rule__GData__Group__4();

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
    // $ANTLR end "rule__GData__Group__3"


    // $ANTLR start "rule__GData__Group__3__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1475:1: rule__GData__Group__3__Impl : ( ( rule__GData__Group_3__0 ) ) ;
    public final void rule__GData__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1479:1: ( ( ( rule__GData__Group_3__0 ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1480:1: ( ( rule__GData__Group_3__0 ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1480:1: ( ( rule__GData__Group_3__0 ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1481:1: ( rule__GData__Group_3__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGDataAccess().getGroup_3()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1482:1: ( rule__GData__Group_3__0 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1482:2: rule__GData__Group_3__0
            {
            pushFollow(FOLLOW_rule__GData__Group_3__0_in_rule__GData__Group__3__Impl2975);
            rule__GData__Group_3__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGDataAccess().getGroup_3()); 
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
    // $ANTLR end "rule__GData__Group__3__Impl"


    // $ANTLR start "rule__GData__Group__4"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1492:1: rule__GData__Group__4 : rule__GData__Group__4__Impl ;
    public final void rule__GData__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1496:1: ( rule__GData__Group__4__Impl )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1497:2: rule__GData__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__GData__Group__4__Impl_in_rule__GData__Group__43005);
            rule__GData__Group__4__Impl();

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
    // $ANTLR end "rule__GData__Group__4"


    // $ANTLR start "rule__GData__Group__4__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1503:1: rule__GData__Group__4__Impl : ( ')' ) ;
    public final void rule__GData__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1507:1: ( ( ')' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1508:1: ( ')' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1508:1: ( ')' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1509:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGDataAccess().getRightParenthesisKeyword_4()); 
            }
            match(input,24,FOLLOW_24_in_rule__GData__Group__4__Impl3033); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGDataAccess().getRightParenthesisKeyword_4()); 
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
    // $ANTLR end "rule__GData__Group__4__Impl"


    // $ANTLR start "rule__GData__Group_3__0"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1532:1: rule__GData__Group_3__0 : rule__GData__Group_3__0__Impl rule__GData__Group_3__1 ;
    public final void rule__GData__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1536:1: ( rule__GData__Group_3__0__Impl rule__GData__Group_3__1 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1537:2: rule__GData__Group_3__0__Impl rule__GData__Group_3__1
            {
            pushFollow(FOLLOW_rule__GData__Group_3__0__Impl_in_rule__GData__Group_3__03074);
            rule__GData__Group_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__GData__Group_3__1_in_rule__GData__Group_3__03077);
            rule__GData__Group_3__1();

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
    // $ANTLR end "rule__GData__Group_3__0"


    // $ANTLR start "rule__GData__Group_3__0__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1544:1: rule__GData__Group_3__0__Impl : ( ( rule__GData__Group_3_0__0 )? ) ;
    public final void rule__GData__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1548:1: ( ( ( rule__GData__Group_3_0__0 )? ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1549:1: ( ( rule__GData__Group_3_0__0 )? )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1549:1: ( ( rule__GData__Group_3_0__0 )? )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1550:1: ( rule__GData__Group_3_0__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGDataAccess().getGroup_3_0()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1551:1: ( rule__GData__Group_3_0__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==25) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1551:2: rule__GData__Group_3_0__0
                    {
                    pushFollow(FOLLOW_rule__GData__Group_3_0__0_in_rule__GData__Group_3__0__Impl3104);
                    rule__GData__Group_3_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGDataAccess().getGroup_3_0()); 
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
    // $ANTLR end "rule__GData__Group_3__0__Impl"


    // $ANTLR start "rule__GData__Group_3__1"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1561:1: rule__GData__Group_3__1 : rule__GData__Group_3__1__Impl rule__GData__Group_3__2 ;
    public final void rule__GData__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1565:1: ( rule__GData__Group_3__1__Impl rule__GData__Group_3__2 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1566:2: rule__GData__Group_3__1__Impl rule__GData__Group_3__2
            {
            pushFollow(FOLLOW_rule__GData__Group_3__1__Impl_in_rule__GData__Group_3__13135);
            rule__GData__Group_3__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__GData__Group_3__2_in_rule__GData__Group_3__13138);
            rule__GData__Group_3__2();

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
    // $ANTLR end "rule__GData__Group_3__1"


    // $ANTLR start "rule__GData__Group_3__1__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1573:1: rule__GData__Group_3__1__Impl : ( ( rule__GData__Group_3_1__0 )? ) ;
    public final void rule__GData__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1577:1: ( ( ( rule__GData__Group_3_1__0 )? ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1578:1: ( ( rule__GData__Group_3_1__0 )? )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1578:1: ( ( rule__GData__Group_3_1__0 )? )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1579:1: ( rule__GData__Group_3_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGDataAccess().getGroup_3_1()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1580:1: ( rule__GData__Group_3_1__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==27) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1580:2: rule__GData__Group_3_1__0
                    {
                    pushFollow(FOLLOW_rule__GData__Group_3_1__0_in_rule__GData__Group_3__1__Impl3165);
                    rule__GData__Group_3_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGDataAccess().getGroup_3_1()); 
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
    // $ANTLR end "rule__GData__Group_3__1__Impl"


    // $ANTLR start "rule__GData__Group_3__2"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1590:1: rule__GData__Group_3__2 : rule__GData__Group_3__2__Impl rule__GData__Group_3__3 ;
    public final void rule__GData__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1594:1: ( rule__GData__Group_3__2__Impl rule__GData__Group_3__3 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1595:2: rule__GData__Group_3__2__Impl rule__GData__Group_3__3
            {
            pushFollow(FOLLOW_rule__GData__Group_3__2__Impl_in_rule__GData__Group_3__23196);
            rule__GData__Group_3__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__GData__Group_3__3_in_rule__GData__Group_3__23199);
            rule__GData__Group_3__3();

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
    // $ANTLR end "rule__GData__Group_3__2"


    // $ANTLR start "rule__GData__Group_3__2__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1602:1: rule__GData__Group_3__2__Impl : ( ( rule__GData__Group_3_2__0 )? ) ;
    public final void rule__GData__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1606:1: ( ( ( rule__GData__Group_3_2__0 )? ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1607:1: ( ( rule__GData__Group_3_2__0 )? )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1607:1: ( ( rule__GData__Group_3_2__0 )? )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1608:1: ( rule__GData__Group_3_2__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGDataAccess().getGroup_3_2()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1609:1: ( rule__GData__Group_3_2__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==28) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1609:2: rule__GData__Group_3_2__0
                    {
                    pushFollow(FOLLOW_rule__GData__Group_3_2__0_in_rule__GData__Group_3__2__Impl3226);
                    rule__GData__Group_3_2__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGDataAccess().getGroup_3_2()); 
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
    // $ANTLR end "rule__GData__Group_3__2__Impl"


    // $ANTLR start "rule__GData__Group_3__3"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1619:1: rule__GData__Group_3__3 : rule__GData__Group_3__3__Impl rule__GData__Group_3__4 ;
    public final void rule__GData__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1623:1: ( rule__GData__Group_3__3__Impl rule__GData__Group_3__4 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1624:2: rule__GData__Group_3__3__Impl rule__GData__Group_3__4
            {
            pushFollow(FOLLOW_rule__GData__Group_3__3__Impl_in_rule__GData__Group_3__33257);
            rule__GData__Group_3__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__GData__Group_3__4_in_rule__GData__Group_3__33260);
            rule__GData__Group_3__4();

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
    // $ANTLR end "rule__GData__Group_3__3"


    // $ANTLR start "rule__GData__Group_3__3__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1631:1: rule__GData__Group_3__3__Impl : ( ( rule__GData__Group_3_3__0 )? ) ;
    public final void rule__GData__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1635:1: ( ( ( rule__GData__Group_3_3__0 )? ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1636:1: ( ( rule__GData__Group_3_3__0 )? )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1636:1: ( ( rule__GData__Group_3_3__0 )? )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1637:1: ( rule__GData__Group_3_3__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGDataAccess().getGroup_3_3()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1638:1: ( rule__GData__Group_3_3__0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==29) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1638:2: rule__GData__Group_3_3__0
                    {
                    pushFollow(FOLLOW_rule__GData__Group_3_3__0_in_rule__GData__Group_3__3__Impl3287);
                    rule__GData__Group_3_3__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGDataAccess().getGroup_3_3()); 
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
    // $ANTLR end "rule__GData__Group_3__3__Impl"


    // $ANTLR start "rule__GData__Group_3__4"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1648:1: rule__GData__Group_3__4 : rule__GData__Group_3__4__Impl rule__GData__Group_3__5 ;
    public final void rule__GData__Group_3__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1652:1: ( rule__GData__Group_3__4__Impl rule__GData__Group_3__5 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1653:2: rule__GData__Group_3__4__Impl rule__GData__Group_3__5
            {
            pushFollow(FOLLOW_rule__GData__Group_3__4__Impl_in_rule__GData__Group_3__43318);
            rule__GData__Group_3__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__GData__Group_3__5_in_rule__GData__Group_3__43321);
            rule__GData__Group_3__5();

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
    // $ANTLR end "rule__GData__Group_3__4"


    // $ANTLR start "rule__GData__Group_3__4__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1660:1: rule__GData__Group_3__4__Impl : ( ( rule__GData__Group_3_4__0 )? ) ;
    public final void rule__GData__Group_3__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1664:1: ( ( ( rule__GData__Group_3_4__0 )? ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1665:1: ( ( rule__GData__Group_3_4__0 )? )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1665:1: ( ( rule__GData__Group_3_4__0 )? )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1666:1: ( rule__GData__Group_3_4__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGDataAccess().getGroup_3_4()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1667:1: ( rule__GData__Group_3_4__0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==30) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1667:2: rule__GData__Group_3_4__0
                    {
                    pushFollow(FOLLOW_rule__GData__Group_3_4__0_in_rule__GData__Group_3__4__Impl3348);
                    rule__GData__Group_3_4__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGDataAccess().getGroup_3_4()); 
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
    // $ANTLR end "rule__GData__Group_3__4__Impl"


    // $ANTLR start "rule__GData__Group_3__5"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1677:1: rule__GData__Group_3__5 : rule__GData__Group_3__5__Impl ;
    public final void rule__GData__Group_3__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1681:1: ( rule__GData__Group_3__5__Impl )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1682:2: rule__GData__Group_3__5__Impl
            {
            pushFollow(FOLLOW_rule__GData__Group_3__5__Impl_in_rule__GData__Group_3__53379);
            rule__GData__Group_3__5__Impl();

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
    // $ANTLR end "rule__GData__Group_3__5"


    // $ANTLR start "rule__GData__Group_3__5__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1688:1: rule__GData__Group_3__5__Impl : ( ( rule__GData__Group_3_5__0 )? ) ;
    public final void rule__GData__Group_3__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1692:1: ( ( ( rule__GData__Group_3_5__0 )? ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1693:1: ( ( rule__GData__Group_3_5__0 )? )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1693:1: ( ( rule__GData__Group_3_5__0 )? )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1694:1: ( rule__GData__Group_3_5__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGDataAccess().getGroup_3_5()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1695:1: ( rule__GData__Group_3_5__0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==31) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1695:2: rule__GData__Group_3_5__0
                    {
                    pushFollow(FOLLOW_rule__GData__Group_3_5__0_in_rule__GData__Group_3__5__Impl3406);
                    rule__GData__Group_3_5__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGDataAccess().getGroup_3_5()); 
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
    // $ANTLR end "rule__GData__Group_3__5__Impl"


    // $ANTLR start "rule__GData__Group_3_0__0"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1717:1: rule__GData__Group_3_0__0 : rule__GData__Group_3_0__0__Impl rule__GData__Group_3_0__1 ;
    public final void rule__GData__Group_3_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1721:1: ( rule__GData__Group_3_0__0__Impl rule__GData__Group_3_0__1 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1722:2: rule__GData__Group_3_0__0__Impl rule__GData__Group_3_0__1
            {
            pushFollow(FOLLOW_rule__GData__Group_3_0__0__Impl_in_rule__GData__Group_3_0__03449);
            rule__GData__Group_3_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__GData__Group_3_0__1_in_rule__GData__Group_3_0__03452);
            rule__GData__Group_3_0__1();

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
    // $ANTLR end "rule__GData__Group_3_0__0"


    // $ANTLR start "rule__GData__Group_3_0__0__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1729:1: rule__GData__Group_3_0__0__Impl : ( 'Model' ) ;
    public final void rule__GData__Group_3_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1733:1: ( ( 'Model' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1734:1: ( 'Model' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1734:1: ( 'Model' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1735:1: 'Model'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGDataAccess().getModelKeyword_3_0_0()); 
            }
            match(input,25,FOLLOW_25_in_rule__GData__Group_3_0__0__Impl3480); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGDataAccess().getModelKeyword_3_0_0()); 
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
    // $ANTLR end "rule__GData__Group_3_0__0__Impl"


    // $ANTLR start "rule__GData__Group_3_0__1"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1748:1: rule__GData__Group_3_0__1 : rule__GData__Group_3_0__1__Impl rule__GData__Group_3_0__2 ;
    public final void rule__GData__Group_3_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1752:1: ( rule__GData__Group_3_0__1__Impl rule__GData__Group_3_0__2 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1753:2: rule__GData__Group_3_0__1__Impl rule__GData__Group_3_0__2
            {
            pushFollow(FOLLOW_rule__GData__Group_3_0__1__Impl_in_rule__GData__Group_3_0__13511);
            rule__GData__Group_3_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__GData__Group_3_0__2_in_rule__GData__Group_3_0__13514);
            rule__GData__Group_3_0__2();

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
    // $ANTLR end "rule__GData__Group_3_0__1"


    // $ANTLR start "rule__GData__Group_3_0__1__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1760:1: rule__GData__Group_3_0__1__Impl : ( ':' ) ;
    public final void rule__GData__Group_3_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1764:1: ( ( ':' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1765:1: ( ':' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1765:1: ( ':' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1766:1: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGDataAccess().getColonKeyword_3_0_1()); 
            }
            match(input,26,FOLLOW_26_in_rule__GData__Group_3_0__1__Impl3542); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGDataAccess().getColonKeyword_3_0_1()); 
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
    // $ANTLR end "rule__GData__Group_3_0__1__Impl"


    // $ANTLR start "rule__GData__Group_3_0__2"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1779:1: rule__GData__Group_3_0__2 : rule__GData__Group_3_0__2__Impl ;
    public final void rule__GData__Group_3_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1783:1: ( rule__GData__Group_3_0__2__Impl )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1784:2: rule__GData__Group_3_0__2__Impl
            {
            pushFollow(FOLLOW_rule__GData__Group_3_0__2__Impl_in_rule__GData__Group_3_0__23573);
            rule__GData__Group_3_0__2__Impl();

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
    // $ANTLR end "rule__GData__Group_3_0__2"


    // $ANTLR start "rule__GData__Group_3_0__2__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1790:1: rule__GData__Group_3_0__2__Impl : ( ( rule__GData__ModelAssignment_3_0_2 ) ) ;
    public final void rule__GData__Group_3_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1794:1: ( ( ( rule__GData__ModelAssignment_3_0_2 ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1795:1: ( ( rule__GData__ModelAssignment_3_0_2 ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1795:1: ( ( rule__GData__ModelAssignment_3_0_2 ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1796:1: ( rule__GData__ModelAssignment_3_0_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGDataAccess().getModelAssignment_3_0_2()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1797:1: ( rule__GData__ModelAssignment_3_0_2 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1797:2: rule__GData__ModelAssignment_3_0_2
            {
            pushFollow(FOLLOW_rule__GData__ModelAssignment_3_0_2_in_rule__GData__Group_3_0__2__Impl3600);
            rule__GData__ModelAssignment_3_0_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGDataAccess().getModelAssignment_3_0_2()); 
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
    // $ANTLR end "rule__GData__Group_3_0__2__Impl"


    // $ANTLR start "rule__GData__Group_3_1__0"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1813:1: rule__GData__Group_3_1__0 : rule__GData__Group_3_1__0__Impl rule__GData__Group_3_1__1 ;
    public final void rule__GData__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1817:1: ( rule__GData__Group_3_1__0__Impl rule__GData__Group_3_1__1 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1818:2: rule__GData__Group_3_1__0__Impl rule__GData__Group_3_1__1
            {
            pushFollow(FOLLOW_rule__GData__Group_3_1__0__Impl_in_rule__GData__Group_3_1__03636);
            rule__GData__Group_3_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__GData__Group_3_1__1_in_rule__GData__Group_3_1__03639);
            rule__GData__Group_3_1__1();

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
    // $ANTLR end "rule__GData__Group_3_1__0"


    // $ANTLR start "rule__GData__Group_3_1__0__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1825:1: rule__GData__Group_3_1__0__Impl : ( 'Edit' ) ;
    public final void rule__GData__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1829:1: ( ( 'Edit' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1830:1: ( 'Edit' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1830:1: ( 'Edit' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1831:1: 'Edit'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGDataAccess().getEditKeyword_3_1_0()); 
            }
            match(input,27,FOLLOW_27_in_rule__GData__Group_3_1__0__Impl3667); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGDataAccess().getEditKeyword_3_1_0()); 
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
    // $ANTLR end "rule__GData__Group_3_1__0__Impl"


    // $ANTLR start "rule__GData__Group_3_1__1"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1844:1: rule__GData__Group_3_1__1 : rule__GData__Group_3_1__1__Impl rule__GData__Group_3_1__2 ;
    public final void rule__GData__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1848:1: ( rule__GData__Group_3_1__1__Impl rule__GData__Group_3_1__2 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1849:2: rule__GData__Group_3_1__1__Impl rule__GData__Group_3_1__2
            {
            pushFollow(FOLLOW_rule__GData__Group_3_1__1__Impl_in_rule__GData__Group_3_1__13698);
            rule__GData__Group_3_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__GData__Group_3_1__2_in_rule__GData__Group_3_1__13701);
            rule__GData__Group_3_1__2();

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
    // $ANTLR end "rule__GData__Group_3_1__1"


    // $ANTLR start "rule__GData__Group_3_1__1__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1856:1: rule__GData__Group_3_1__1__Impl : ( ':' ) ;
    public final void rule__GData__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1860:1: ( ( ':' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1861:1: ( ':' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1861:1: ( ':' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1862:1: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGDataAccess().getColonKeyword_3_1_1()); 
            }
            match(input,26,FOLLOW_26_in_rule__GData__Group_3_1__1__Impl3729); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGDataAccess().getColonKeyword_3_1_1()); 
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
    // $ANTLR end "rule__GData__Group_3_1__1__Impl"


    // $ANTLR start "rule__GData__Group_3_1__2"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1875:1: rule__GData__Group_3_1__2 : rule__GData__Group_3_1__2__Impl ;
    public final void rule__GData__Group_3_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1879:1: ( rule__GData__Group_3_1__2__Impl )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1880:2: rule__GData__Group_3_1__2__Impl
            {
            pushFollow(FOLLOW_rule__GData__Group_3_1__2__Impl_in_rule__GData__Group_3_1__23760);
            rule__GData__Group_3_1__2__Impl();

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
    // $ANTLR end "rule__GData__Group_3_1__2"


    // $ANTLR start "rule__GData__Group_3_1__2__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1886:1: rule__GData__Group_3_1__2__Impl : ( ( rule__GData__EditAssignment_3_1_2 ) ) ;
    public final void rule__GData__Group_3_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1890:1: ( ( ( rule__GData__EditAssignment_3_1_2 ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1891:1: ( ( rule__GData__EditAssignment_3_1_2 ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1891:1: ( ( rule__GData__EditAssignment_3_1_2 ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1892:1: ( rule__GData__EditAssignment_3_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGDataAccess().getEditAssignment_3_1_2()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1893:1: ( rule__GData__EditAssignment_3_1_2 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1893:2: rule__GData__EditAssignment_3_1_2
            {
            pushFollow(FOLLOW_rule__GData__EditAssignment_3_1_2_in_rule__GData__Group_3_1__2__Impl3787);
            rule__GData__EditAssignment_3_1_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGDataAccess().getEditAssignment_3_1_2()); 
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
    // $ANTLR end "rule__GData__Group_3_1__2__Impl"


    // $ANTLR start "rule__GData__Group_3_2__0"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1909:1: rule__GData__Group_3_2__0 : rule__GData__Group_3_2__0__Impl rule__GData__Group_3_2__1 ;
    public final void rule__GData__Group_3_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1913:1: ( rule__GData__Group_3_2__0__Impl rule__GData__Group_3_2__1 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1914:2: rule__GData__Group_3_2__0__Impl rule__GData__Group_3_2__1
            {
            pushFollow(FOLLOW_rule__GData__Group_3_2__0__Impl_in_rule__GData__Group_3_2__03823);
            rule__GData__Group_3_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__GData__Group_3_2__1_in_rule__GData__Group_3_2__03826);
            rule__GData__Group_3_2__1();

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
    // $ANTLR end "rule__GData__Group_3_2__0"


    // $ANTLR start "rule__GData__Group_3_2__0__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1921:1: rule__GData__Group_3_2__0__Impl : ( 'Editor' ) ;
    public final void rule__GData__Group_3_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1925:1: ( ( 'Editor' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1926:1: ( 'Editor' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1926:1: ( 'Editor' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1927:1: 'Editor'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGDataAccess().getEditorKeyword_3_2_0()); 
            }
            match(input,28,FOLLOW_28_in_rule__GData__Group_3_2__0__Impl3854); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGDataAccess().getEditorKeyword_3_2_0()); 
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
    // $ANTLR end "rule__GData__Group_3_2__0__Impl"


    // $ANTLR start "rule__GData__Group_3_2__1"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1940:1: rule__GData__Group_3_2__1 : rule__GData__Group_3_2__1__Impl rule__GData__Group_3_2__2 ;
    public final void rule__GData__Group_3_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1944:1: ( rule__GData__Group_3_2__1__Impl rule__GData__Group_3_2__2 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1945:2: rule__GData__Group_3_2__1__Impl rule__GData__Group_3_2__2
            {
            pushFollow(FOLLOW_rule__GData__Group_3_2__1__Impl_in_rule__GData__Group_3_2__13885);
            rule__GData__Group_3_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__GData__Group_3_2__2_in_rule__GData__Group_3_2__13888);
            rule__GData__Group_3_2__2();

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
    // $ANTLR end "rule__GData__Group_3_2__1"


    // $ANTLR start "rule__GData__Group_3_2__1__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1952:1: rule__GData__Group_3_2__1__Impl : ( ':' ) ;
    public final void rule__GData__Group_3_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1956:1: ( ( ':' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1957:1: ( ':' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1957:1: ( ':' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1958:1: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGDataAccess().getColonKeyword_3_2_1()); 
            }
            match(input,26,FOLLOW_26_in_rule__GData__Group_3_2__1__Impl3916); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGDataAccess().getColonKeyword_3_2_1()); 
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
    // $ANTLR end "rule__GData__Group_3_2__1__Impl"


    // $ANTLR start "rule__GData__Group_3_2__2"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1971:1: rule__GData__Group_3_2__2 : rule__GData__Group_3_2__2__Impl ;
    public final void rule__GData__Group_3_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1975:1: ( rule__GData__Group_3_2__2__Impl )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1976:2: rule__GData__Group_3_2__2__Impl
            {
            pushFollow(FOLLOW_rule__GData__Group_3_2__2__Impl_in_rule__GData__Group_3_2__23947);
            rule__GData__Group_3_2__2__Impl();

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
    // $ANTLR end "rule__GData__Group_3_2__2"


    // $ANTLR start "rule__GData__Group_3_2__2__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1982:1: rule__GData__Group_3_2__2__Impl : ( ( rule__GData__EditorAssignment_3_2_2 ) ) ;
    public final void rule__GData__Group_3_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1986:1: ( ( ( rule__GData__EditorAssignment_3_2_2 ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1987:1: ( ( rule__GData__EditorAssignment_3_2_2 ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1987:1: ( ( rule__GData__EditorAssignment_3_2_2 ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1988:1: ( rule__GData__EditorAssignment_3_2_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGDataAccess().getEditorAssignment_3_2_2()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1989:1: ( rule__GData__EditorAssignment_3_2_2 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:1989:2: rule__GData__EditorAssignment_3_2_2
            {
            pushFollow(FOLLOW_rule__GData__EditorAssignment_3_2_2_in_rule__GData__Group_3_2__2__Impl3974);
            rule__GData__EditorAssignment_3_2_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGDataAccess().getEditorAssignment_3_2_2()); 
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
    // $ANTLR end "rule__GData__Group_3_2__2__Impl"


    // $ANTLR start "rule__GData__Group_3_3__0"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2005:1: rule__GData__Group_3_3__0 : rule__GData__Group_3_3__0__Impl rule__GData__Group_3_3__1 ;
    public final void rule__GData__Group_3_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2009:1: ( rule__GData__Group_3_3__0__Impl rule__GData__Group_3_3__1 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2010:2: rule__GData__Group_3_3__0__Impl rule__GData__Group_3_3__1
            {
            pushFollow(FOLLOW_rule__GData__Group_3_3__0__Impl_in_rule__GData__Group_3_3__04010);
            rule__GData__Group_3_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__GData__Group_3_3__1_in_rule__GData__Group_3_3__04013);
            rule__GData__Group_3_3__1();

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
    // $ANTLR end "rule__GData__Group_3_3__0"


    // $ANTLR start "rule__GData__Group_3_3__0__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2017:1: rule__GData__Group_3_3__0__Impl : ( 'Test' ) ;
    public final void rule__GData__Group_3_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2021:1: ( ( 'Test' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2022:1: ( 'Test' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2022:1: ( 'Test' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2023:1: 'Test'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGDataAccess().getTestKeyword_3_3_0()); 
            }
            match(input,29,FOLLOW_29_in_rule__GData__Group_3_3__0__Impl4041); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGDataAccess().getTestKeyword_3_3_0()); 
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
    // $ANTLR end "rule__GData__Group_3_3__0__Impl"


    // $ANTLR start "rule__GData__Group_3_3__1"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2036:1: rule__GData__Group_3_3__1 : rule__GData__Group_3_3__1__Impl rule__GData__Group_3_3__2 ;
    public final void rule__GData__Group_3_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2040:1: ( rule__GData__Group_3_3__1__Impl rule__GData__Group_3_3__2 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2041:2: rule__GData__Group_3_3__1__Impl rule__GData__Group_3_3__2
            {
            pushFollow(FOLLOW_rule__GData__Group_3_3__1__Impl_in_rule__GData__Group_3_3__14072);
            rule__GData__Group_3_3__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__GData__Group_3_3__2_in_rule__GData__Group_3_3__14075);
            rule__GData__Group_3_3__2();

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
    // $ANTLR end "rule__GData__Group_3_3__1"


    // $ANTLR start "rule__GData__Group_3_3__1__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2048:1: rule__GData__Group_3_3__1__Impl : ( ':' ) ;
    public final void rule__GData__Group_3_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2052:1: ( ( ':' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2053:1: ( ':' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2053:1: ( ':' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2054:1: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGDataAccess().getColonKeyword_3_3_1()); 
            }
            match(input,26,FOLLOW_26_in_rule__GData__Group_3_3__1__Impl4103); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGDataAccess().getColonKeyword_3_3_1()); 
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
    // $ANTLR end "rule__GData__Group_3_3__1__Impl"


    // $ANTLR start "rule__GData__Group_3_3__2"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2067:1: rule__GData__Group_3_3__2 : rule__GData__Group_3_3__2__Impl ;
    public final void rule__GData__Group_3_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2071:1: ( rule__GData__Group_3_3__2__Impl )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2072:2: rule__GData__Group_3_3__2__Impl
            {
            pushFollow(FOLLOW_rule__GData__Group_3_3__2__Impl_in_rule__GData__Group_3_3__24134);
            rule__GData__Group_3_3__2__Impl();

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
    // $ANTLR end "rule__GData__Group_3_3__2"


    // $ANTLR start "rule__GData__Group_3_3__2__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2078:1: rule__GData__Group_3_3__2__Impl : ( ( rule__GData__TestAssignment_3_3_2 ) ) ;
    public final void rule__GData__Group_3_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2082:1: ( ( ( rule__GData__TestAssignment_3_3_2 ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2083:1: ( ( rule__GData__TestAssignment_3_3_2 ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2083:1: ( ( rule__GData__TestAssignment_3_3_2 ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2084:1: ( rule__GData__TestAssignment_3_3_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGDataAccess().getTestAssignment_3_3_2()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2085:1: ( rule__GData__TestAssignment_3_3_2 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2085:2: rule__GData__TestAssignment_3_3_2
            {
            pushFollow(FOLLOW_rule__GData__TestAssignment_3_3_2_in_rule__GData__Group_3_3__2__Impl4161);
            rule__GData__TestAssignment_3_3_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGDataAccess().getTestAssignment_3_3_2()); 
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
    // $ANTLR end "rule__GData__Group_3_3__2__Impl"


    // $ANTLR start "rule__GData__Group_3_4__0"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2101:1: rule__GData__Group_3_4__0 : rule__GData__Group_3_4__0__Impl rule__GData__Group_3_4__1 ;
    public final void rule__GData__Group_3_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2105:1: ( rule__GData__Group_3_4__0__Impl rule__GData__Group_3_4__1 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2106:2: rule__GData__Group_3_4__0__Impl rule__GData__Group_3_4__1
            {
            pushFollow(FOLLOW_rule__GData__Group_3_4__0__Impl_in_rule__GData__Group_3_4__04197);
            rule__GData__Group_3_4__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__GData__Group_3_4__1_in_rule__GData__Group_3_4__04200);
            rule__GData__Group_3_4__1();

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
    // $ANTLR end "rule__GData__Group_3_4__0"


    // $ANTLR start "rule__GData__Group_3_4__0__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2113:1: rule__GData__Group_3_4__0__Impl : ( 'Javadoc' ) ;
    public final void rule__GData__Group_3_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2117:1: ( ( 'Javadoc' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2118:1: ( 'Javadoc' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2118:1: ( 'Javadoc' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2119:1: 'Javadoc'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGDataAccess().getJavadocKeyword_3_4_0()); 
            }
            match(input,30,FOLLOW_30_in_rule__GData__Group_3_4__0__Impl4228); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGDataAccess().getJavadocKeyword_3_4_0()); 
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
    // $ANTLR end "rule__GData__Group_3_4__0__Impl"


    // $ANTLR start "rule__GData__Group_3_4__1"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2132:1: rule__GData__Group_3_4__1 : rule__GData__Group_3_4__1__Impl rule__GData__Group_3_4__2 ;
    public final void rule__GData__Group_3_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2136:1: ( rule__GData__Group_3_4__1__Impl rule__GData__Group_3_4__2 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2137:2: rule__GData__Group_3_4__1__Impl rule__GData__Group_3_4__2
            {
            pushFollow(FOLLOW_rule__GData__Group_3_4__1__Impl_in_rule__GData__Group_3_4__14259);
            rule__GData__Group_3_4__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__GData__Group_3_4__2_in_rule__GData__Group_3_4__14262);
            rule__GData__Group_3_4__2();

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
    // $ANTLR end "rule__GData__Group_3_4__1"


    // $ANTLR start "rule__GData__Group_3_4__1__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2144:1: rule__GData__Group_3_4__1__Impl : ( ':' ) ;
    public final void rule__GData__Group_3_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2148:1: ( ( ':' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2149:1: ( ':' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2149:1: ( ':' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2150:1: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGDataAccess().getColonKeyword_3_4_1()); 
            }
            match(input,26,FOLLOW_26_in_rule__GData__Group_3_4__1__Impl4290); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGDataAccess().getColonKeyword_3_4_1()); 
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
    // $ANTLR end "rule__GData__Group_3_4__1__Impl"


    // $ANTLR start "rule__GData__Group_3_4__2"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2163:1: rule__GData__Group_3_4__2 : rule__GData__Group_3_4__2__Impl ;
    public final void rule__GData__Group_3_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2167:1: ( rule__GData__Group_3_4__2__Impl )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2168:2: rule__GData__Group_3_4__2__Impl
            {
            pushFollow(FOLLOW_rule__GData__Group_3_4__2__Impl_in_rule__GData__Group_3_4__24321);
            rule__GData__Group_3_4__2__Impl();

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
    // $ANTLR end "rule__GData__Group_3_4__2"


    // $ANTLR start "rule__GData__Group_3_4__2__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2174:1: rule__GData__Group_3_4__2__Impl : ( ( rule__GData__JavaDocAssignment_3_4_2 ) ) ;
    public final void rule__GData__Group_3_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2178:1: ( ( ( rule__GData__JavaDocAssignment_3_4_2 ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2179:1: ( ( rule__GData__JavaDocAssignment_3_4_2 ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2179:1: ( ( rule__GData__JavaDocAssignment_3_4_2 ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2180:1: ( rule__GData__JavaDocAssignment_3_4_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGDataAccess().getJavaDocAssignment_3_4_2()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2181:1: ( rule__GData__JavaDocAssignment_3_4_2 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2181:2: rule__GData__JavaDocAssignment_3_4_2
            {
            pushFollow(FOLLOW_rule__GData__JavaDocAssignment_3_4_2_in_rule__GData__Group_3_4__2__Impl4348);
            rule__GData__JavaDocAssignment_3_4_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGDataAccess().getJavaDocAssignment_3_4_2()); 
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
    // $ANTLR end "rule__GData__Group_3_4__2__Impl"


    // $ANTLR start "rule__GData__Group_3_5__0"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2197:1: rule__GData__Group_3_5__0 : rule__GData__Group_3_5__0__Impl rule__GData__Group_3_5__1 ;
    public final void rule__GData__Group_3_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2201:1: ( rule__GData__Group_3_5__0__Impl rule__GData__Group_3_5__1 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2202:2: rule__GData__Group_3_5__0__Impl rule__GData__Group_3_5__1
            {
            pushFollow(FOLLOW_rule__GData__Group_3_5__0__Impl_in_rule__GData__Group_3_5__04384);
            rule__GData__Group_3_5__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__GData__Group_3_5__1_in_rule__GData__Group_3_5__04387);
            rule__GData__Group_3_5__1();

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
    // $ANTLR end "rule__GData__Group_3_5__0"


    // $ANTLR start "rule__GData__Group_3_5__0__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2209:1: rule__GData__Group_3_5__0__Impl : ( 'OverwriteEcore' ) ;
    public final void rule__GData__Group_3_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2213:1: ( ( 'OverwriteEcore' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2214:1: ( 'OverwriteEcore' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2214:1: ( 'OverwriteEcore' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2215:1: 'OverwriteEcore'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGDataAccess().getOverwriteEcoreKeyword_3_5_0()); 
            }
            match(input,31,FOLLOW_31_in_rule__GData__Group_3_5__0__Impl4415); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGDataAccess().getOverwriteEcoreKeyword_3_5_0()); 
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
    // $ANTLR end "rule__GData__Group_3_5__0__Impl"


    // $ANTLR start "rule__GData__Group_3_5__1"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2228:1: rule__GData__Group_3_5__1 : rule__GData__Group_3_5__1__Impl rule__GData__Group_3_5__2 ;
    public final void rule__GData__Group_3_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2232:1: ( rule__GData__Group_3_5__1__Impl rule__GData__Group_3_5__2 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2233:2: rule__GData__Group_3_5__1__Impl rule__GData__Group_3_5__2
            {
            pushFollow(FOLLOW_rule__GData__Group_3_5__1__Impl_in_rule__GData__Group_3_5__14446);
            rule__GData__Group_3_5__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__GData__Group_3_5__2_in_rule__GData__Group_3_5__14449);
            rule__GData__Group_3_5__2();

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
    // $ANTLR end "rule__GData__Group_3_5__1"


    // $ANTLR start "rule__GData__Group_3_5__1__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2240:1: rule__GData__Group_3_5__1__Impl : ( ':' ) ;
    public final void rule__GData__Group_3_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2244:1: ( ( ':' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2245:1: ( ':' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2245:1: ( ':' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2246:1: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGDataAccess().getColonKeyword_3_5_1()); 
            }
            match(input,26,FOLLOW_26_in_rule__GData__Group_3_5__1__Impl4477); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGDataAccess().getColonKeyword_3_5_1()); 
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
    // $ANTLR end "rule__GData__Group_3_5__1__Impl"


    // $ANTLR start "rule__GData__Group_3_5__2"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2259:1: rule__GData__Group_3_5__2 : rule__GData__Group_3_5__2__Impl ;
    public final void rule__GData__Group_3_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2263:1: ( rule__GData__Group_3_5__2__Impl )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2264:2: rule__GData__Group_3_5__2__Impl
            {
            pushFollow(FOLLOW_rule__GData__Group_3_5__2__Impl_in_rule__GData__Group_3_5__24508);
            rule__GData__Group_3_5__2__Impl();

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
    // $ANTLR end "rule__GData__Group_3_5__2"


    // $ANTLR start "rule__GData__Group_3_5__2__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2270:1: rule__GData__Group_3_5__2__Impl : ( ( rule__GData__OverwriteEcoreAssignment_3_5_2 ) ) ;
    public final void rule__GData__Group_3_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2274:1: ( ( ( rule__GData__OverwriteEcoreAssignment_3_5_2 ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2275:1: ( ( rule__GData__OverwriteEcoreAssignment_3_5_2 ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2275:1: ( ( rule__GData__OverwriteEcoreAssignment_3_5_2 ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2276:1: ( rule__GData__OverwriteEcoreAssignment_3_5_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGDataAccess().getOverwriteEcoreAssignment_3_5_2()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2277:1: ( rule__GData__OverwriteEcoreAssignment_3_5_2 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2277:2: rule__GData__OverwriteEcoreAssignment_3_5_2
            {
            pushFollow(FOLLOW_rule__GData__OverwriteEcoreAssignment_3_5_2_in_rule__GData__Group_3_5__2__Impl4535);
            rule__GData__OverwriteEcoreAssignment_3_5_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGDataAccess().getOverwriteEcoreAssignment_3_5_2()); 
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
    // $ANTLR end "rule__GData__Group_3_5__2__Impl"


    // $ANTLR start "rule__DiagramGenerationConfiguration__Group__0"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2293:1: rule__DiagramGenerationConfiguration__Group__0 : rule__DiagramGenerationConfiguration__Group__0__Impl rule__DiagramGenerationConfiguration__Group__1 ;
    public final void rule__DiagramGenerationConfiguration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2297:1: ( rule__DiagramGenerationConfiguration__Group__0__Impl rule__DiagramGenerationConfiguration__Group__1 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2298:2: rule__DiagramGenerationConfiguration__Group__0__Impl rule__DiagramGenerationConfiguration__Group__1
            {
            pushFollow(FOLLOW_rule__DiagramGenerationConfiguration__Group__0__Impl_in_rule__DiagramGenerationConfiguration__Group__04571);
            rule__DiagramGenerationConfiguration__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__DiagramGenerationConfiguration__Group__1_in_rule__DiagramGenerationConfiguration__Group__04574);
            rule__DiagramGenerationConfiguration__Group__1();

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
    // $ANTLR end "rule__DiagramGenerationConfiguration__Group__0"


    // $ANTLR start "rule__DiagramGenerationConfiguration__Group__0__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2305:1: rule__DiagramGenerationConfiguration__Group__0__Impl : ( () ) ;
    public final void rule__DiagramGenerationConfiguration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2309:1: ( ( () ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2310:1: ( () )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2310:1: ( () )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2311:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDiagramGenerationConfigurationAccess().getDiagramGenerationConfigurationAction_0()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2312:1: ()
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2314:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDiagramGenerationConfigurationAccess().getDiagramGenerationConfigurationAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DiagramGenerationConfiguration__Group__0__Impl"


    // $ANTLR start "rule__DiagramGenerationConfiguration__Group__1"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2324:1: rule__DiagramGenerationConfiguration__Group__1 : rule__DiagramGenerationConfiguration__Group__1__Impl rule__DiagramGenerationConfiguration__Group__2 ;
    public final void rule__DiagramGenerationConfiguration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2328:1: ( rule__DiagramGenerationConfiguration__Group__1__Impl rule__DiagramGenerationConfiguration__Group__2 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2329:2: rule__DiagramGenerationConfiguration__Group__1__Impl rule__DiagramGenerationConfiguration__Group__2
            {
            pushFollow(FOLLOW_rule__DiagramGenerationConfiguration__Group__1__Impl_in_rule__DiagramGenerationConfiguration__Group__14632);
            rule__DiagramGenerationConfiguration__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__DiagramGenerationConfiguration__Group__2_in_rule__DiagramGenerationConfiguration__Group__14635);
            rule__DiagramGenerationConfiguration__Group__2();

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
    // $ANTLR end "rule__DiagramGenerationConfiguration__Group__1"


    // $ANTLR start "rule__DiagramGenerationConfiguration__Group__1__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2336:1: rule__DiagramGenerationConfiguration__Group__1__Impl : ( 'diagram' ) ;
    public final void rule__DiagramGenerationConfiguration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2340:1: ( ( 'diagram' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2341:1: ( 'diagram' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2341:1: ( 'diagram' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2342:1: 'diagram'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDiagramGenerationConfigurationAccess().getDiagramKeyword_1()); 
            }
            match(input,32,FOLLOW_32_in_rule__DiagramGenerationConfiguration__Group__1__Impl4663); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDiagramGenerationConfigurationAccess().getDiagramKeyword_1()); 
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
    // $ANTLR end "rule__DiagramGenerationConfiguration__Group__1__Impl"


    // $ANTLR start "rule__DiagramGenerationConfiguration__Group__2"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2355:1: rule__DiagramGenerationConfiguration__Group__2 : rule__DiagramGenerationConfiguration__Group__2__Impl rule__DiagramGenerationConfiguration__Group__3 ;
    public final void rule__DiagramGenerationConfiguration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2359:1: ( rule__DiagramGenerationConfiguration__Group__2__Impl rule__DiagramGenerationConfiguration__Group__3 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2360:2: rule__DiagramGenerationConfiguration__Group__2__Impl rule__DiagramGenerationConfiguration__Group__3
            {
            pushFollow(FOLLOW_rule__DiagramGenerationConfiguration__Group__2__Impl_in_rule__DiagramGenerationConfiguration__Group__24694);
            rule__DiagramGenerationConfiguration__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__DiagramGenerationConfiguration__Group__3_in_rule__DiagramGenerationConfiguration__Group__24697);
            rule__DiagramGenerationConfiguration__Group__3();

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
    // $ANTLR end "rule__DiagramGenerationConfiguration__Group__2"


    // $ANTLR start "rule__DiagramGenerationConfiguration__Group__2__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2367:1: rule__DiagramGenerationConfiguration__Group__2__Impl : ( '(' ) ;
    public final void rule__DiagramGenerationConfiguration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2371:1: ( ( '(' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2372:1: ( '(' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2372:1: ( '(' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2373:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDiagramGenerationConfigurationAccess().getLeftParenthesisKeyword_2()); 
            }
            match(input,23,FOLLOW_23_in_rule__DiagramGenerationConfiguration__Group__2__Impl4725); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDiagramGenerationConfigurationAccess().getLeftParenthesisKeyword_2()); 
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
    // $ANTLR end "rule__DiagramGenerationConfiguration__Group__2__Impl"


    // $ANTLR start "rule__DiagramGenerationConfiguration__Group__3"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2386:1: rule__DiagramGenerationConfiguration__Group__3 : rule__DiagramGenerationConfiguration__Group__3__Impl rule__DiagramGenerationConfiguration__Group__4 ;
    public final void rule__DiagramGenerationConfiguration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2390:1: ( rule__DiagramGenerationConfiguration__Group__3__Impl rule__DiagramGenerationConfiguration__Group__4 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2391:2: rule__DiagramGenerationConfiguration__Group__3__Impl rule__DiagramGenerationConfiguration__Group__4
            {
            pushFollow(FOLLOW_rule__DiagramGenerationConfiguration__Group__3__Impl_in_rule__DiagramGenerationConfiguration__Group__34756);
            rule__DiagramGenerationConfiguration__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__DiagramGenerationConfiguration__Group__4_in_rule__DiagramGenerationConfiguration__Group__34759);
            rule__DiagramGenerationConfiguration__Group__4();

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
    // $ANTLR end "rule__DiagramGenerationConfiguration__Group__3"


    // $ANTLR start "rule__DiagramGenerationConfiguration__Group__3__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2398:1: rule__DiagramGenerationConfiguration__Group__3__Impl : ( ( rule__DiagramGenerationConfiguration__Group_3__0 )? ) ;
    public final void rule__DiagramGenerationConfiguration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2402:1: ( ( ( rule__DiagramGenerationConfiguration__Group_3__0 )? ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2403:1: ( ( rule__DiagramGenerationConfiguration__Group_3__0 )? )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2403:1: ( ( rule__DiagramGenerationConfiguration__Group_3__0 )? )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2404:1: ( rule__DiagramGenerationConfiguration__Group_3__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDiagramGenerationConfigurationAccess().getGroup_3()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2405:1: ( rule__DiagramGenerationConfiguration__Group_3__0 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==33) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2405:2: rule__DiagramGenerationConfiguration__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__DiagramGenerationConfiguration__Group_3__0_in_rule__DiagramGenerationConfiguration__Group__3__Impl4786);
                    rule__DiagramGenerationConfiguration__Group_3__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDiagramGenerationConfigurationAccess().getGroup_3()); 
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
    // $ANTLR end "rule__DiagramGenerationConfiguration__Group__3__Impl"


    // $ANTLR start "rule__DiagramGenerationConfiguration__Group__4"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2415:1: rule__DiagramGenerationConfiguration__Group__4 : rule__DiagramGenerationConfiguration__Group__4__Impl ;
    public final void rule__DiagramGenerationConfiguration__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2419:1: ( rule__DiagramGenerationConfiguration__Group__4__Impl )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2420:2: rule__DiagramGenerationConfiguration__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__DiagramGenerationConfiguration__Group__4__Impl_in_rule__DiagramGenerationConfiguration__Group__44817);
            rule__DiagramGenerationConfiguration__Group__4__Impl();

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
    // $ANTLR end "rule__DiagramGenerationConfiguration__Group__4"


    // $ANTLR start "rule__DiagramGenerationConfiguration__Group__4__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2426:1: rule__DiagramGenerationConfiguration__Group__4__Impl : ( ')' ) ;
    public final void rule__DiagramGenerationConfiguration__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2430:1: ( ( ')' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2431:1: ( ')' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2431:1: ( ')' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2432:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDiagramGenerationConfigurationAccess().getRightParenthesisKeyword_4()); 
            }
            match(input,24,FOLLOW_24_in_rule__DiagramGenerationConfiguration__Group__4__Impl4845); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDiagramGenerationConfigurationAccess().getRightParenthesisKeyword_4()); 
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
    // $ANTLR end "rule__DiagramGenerationConfiguration__Group__4__Impl"


    // $ANTLR start "rule__DiagramGenerationConfiguration__Group_3__0"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2455:1: rule__DiagramGenerationConfiguration__Group_3__0 : rule__DiagramGenerationConfiguration__Group_3__0__Impl rule__DiagramGenerationConfiguration__Group_3__1 ;
    public final void rule__DiagramGenerationConfiguration__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2459:1: ( rule__DiagramGenerationConfiguration__Group_3__0__Impl rule__DiagramGenerationConfiguration__Group_3__1 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2460:2: rule__DiagramGenerationConfiguration__Group_3__0__Impl rule__DiagramGenerationConfiguration__Group_3__1
            {
            pushFollow(FOLLOW_rule__DiagramGenerationConfiguration__Group_3__0__Impl_in_rule__DiagramGenerationConfiguration__Group_3__04886);
            rule__DiagramGenerationConfiguration__Group_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__DiagramGenerationConfiguration__Group_3__1_in_rule__DiagramGenerationConfiguration__Group_3__04889);
            rule__DiagramGenerationConfiguration__Group_3__1();

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
    // $ANTLR end "rule__DiagramGenerationConfiguration__Group_3__0"


    // $ANTLR start "rule__DiagramGenerationConfiguration__Group_3__0__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2467:1: rule__DiagramGenerationConfiguration__Group_3__0__Impl : ( 'OverwriteOdesign' ) ;
    public final void rule__DiagramGenerationConfiguration__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2471:1: ( ( 'OverwriteOdesign' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2472:1: ( 'OverwriteOdesign' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2472:1: ( 'OverwriteOdesign' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2473:1: 'OverwriteOdesign'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDiagramGenerationConfigurationAccess().getOverwriteOdesignKeyword_3_0()); 
            }
            match(input,33,FOLLOW_33_in_rule__DiagramGenerationConfiguration__Group_3__0__Impl4917); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDiagramGenerationConfigurationAccess().getOverwriteOdesignKeyword_3_0()); 
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
    // $ANTLR end "rule__DiagramGenerationConfiguration__Group_3__0__Impl"


    // $ANTLR start "rule__DiagramGenerationConfiguration__Group_3__1"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2486:1: rule__DiagramGenerationConfiguration__Group_3__1 : rule__DiagramGenerationConfiguration__Group_3__1__Impl rule__DiagramGenerationConfiguration__Group_3__2 ;
    public final void rule__DiagramGenerationConfiguration__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2490:1: ( rule__DiagramGenerationConfiguration__Group_3__1__Impl rule__DiagramGenerationConfiguration__Group_3__2 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2491:2: rule__DiagramGenerationConfiguration__Group_3__1__Impl rule__DiagramGenerationConfiguration__Group_3__2
            {
            pushFollow(FOLLOW_rule__DiagramGenerationConfiguration__Group_3__1__Impl_in_rule__DiagramGenerationConfiguration__Group_3__14948);
            rule__DiagramGenerationConfiguration__Group_3__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__DiagramGenerationConfiguration__Group_3__2_in_rule__DiagramGenerationConfiguration__Group_3__14951);
            rule__DiagramGenerationConfiguration__Group_3__2();

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
    // $ANTLR end "rule__DiagramGenerationConfiguration__Group_3__1"


    // $ANTLR start "rule__DiagramGenerationConfiguration__Group_3__1__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2498:1: rule__DiagramGenerationConfiguration__Group_3__1__Impl : ( ':' ) ;
    public final void rule__DiagramGenerationConfiguration__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2502:1: ( ( ':' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2503:1: ( ':' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2503:1: ( ':' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2504:1: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDiagramGenerationConfigurationAccess().getColonKeyword_3_1()); 
            }
            match(input,26,FOLLOW_26_in_rule__DiagramGenerationConfiguration__Group_3__1__Impl4979); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDiagramGenerationConfigurationAccess().getColonKeyword_3_1()); 
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
    // $ANTLR end "rule__DiagramGenerationConfiguration__Group_3__1__Impl"


    // $ANTLR start "rule__DiagramGenerationConfiguration__Group_3__2"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2517:1: rule__DiagramGenerationConfiguration__Group_3__2 : rule__DiagramGenerationConfiguration__Group_3__2__Impl ;
    public final void rule__DiagramGenerationConfiguration__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2521:1: ( rule__DiagramGenerationConfiguration__Group_3__2__Impl )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2522:2: rule__DiagramGenerationConfiguration__Group_3__2__Impl
            {
            pushFollow(FOLLOW_rule__DiagramGenerationConfiguration__Group_3__2__Impl_in_rule__DiagramGenerationConfiguration__Group_3__25010);
            rule__DiagramGenerationConfiguration__Group_3__2__Impl();

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
    // $ANTLR end "rule__DiagramGenerationConfiguration__Group_3__2"


    // $ANTLR start "rule__DiagramGenerationConfiguration__Group_3__2__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2528:1: rule__DiagramGenerationConfiguration__Group_3__2__Impl : ( ( rule__DiagramGenerationConfiguration__OverwriteVSMAssignment_3_2 ) ) ;
    public final void rule__DiagramGenerationConfiguration__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2532:1: ( ( ( rule__DiagramGenerationConfiguration__OverwriteVSMAssignment_3_2 ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2533:1: ( ( rule__DiagramGenerationConfiguration__OverwriteVSMAssignment_3_2 ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2533:1: ( ( rule__DiagramGenerationConfiguration__OverwriteVSMAssignment_3_2 ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2534:1: ( rule__DiagramGenerationConfiguration__OverwriteVSMAssignment_3_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDiagramGenerationConfigurationAccess().getOverwriteVSMAssignment_3_2()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2535:1: ( rule__DiagramGenerationConfiguration__OverwriteVSMAssignment_3_2 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2535:2: rule__DiagramGenerationConfiguration__OverwriteVSMAssignment_3_2
            {
            pushFollow(FOLLOW_rule__DiagramGenerationConfiguration__OverwriteVSMAssignment_3_2_in_rule__DiagramGenerationConfiguration__Group_3__2__Impl5037);
            rule__DiagramGenerationConfiguration__OverwriteVSMAssignment_3_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDiagramGenerationConfigurationAccess().getOverwriteVSMAssignment_3_2()); 
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
    // $ANTLR end "rule__DiagramGenerationConfiguration__Group_3__2__Impl"


    // $ANTLR start "rule__DocumentationGenerationConfiguration__Group__0"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2551:1: rule__DocumentationGenerationConfiguration__Group__0 : rule__DocumentationGenerationConfiguration__Group__0__Impl rule__DocumentationGenerationConfiguration__Group__1 ;
    public final void rule__DocumentationGenerationConfiguration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2555:1: ( rule__DocumentationGenerationConfiguration__Group__0__Impl rule__DocumentationGenerationConfiguration__Group__1 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2556:2: rule__DocumentationGenerationConfiguration__Group__0__Impl rule__DocumentationGenerationConfiguration__Group__1
            {
            pushFollow(FOLLOW_rule__DocumentationGenerationConfiguration__Group__0__Impl_in_rule__DocumentationGenerationConfiguration__Group__05073);
            rule__DocumentationGenerationConfiguration__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__DocumentationGenerationConfiguration__Group__1_in_rule__DocumentationGenerationConfiguration__Group__05076);
            rule__DocumentationGenerationConfiguration__Group__1();

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
    // $ANTLR end "rule__DocumentationGenerationConfiguration__Group__0"


    // $ANTLR start "rule__DocumentationGenerationConfiguration__Group__0__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2563:1: rule__DocumentationGenerationConfiguration__Group__0__Impl : ( () ) ;
    public final void rule__DocumentationGenerationConfiguration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2567:1: ( ( () ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2568:1: ( () )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2568:1: ( () )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2569:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDocumentationGenerationConfigurationAccess().getDocumentationGenerationConfigurationAction_0()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2570:1: ()
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2572:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDocumentationGenerationConfigurationAccess().getDocumentationGenerationConfigurationAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DocumentationGenerationConfiguration__Group__0__Impl"


    // $ANTLR start "rule__DocumentationGenerationConfiguration__Group__1"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2582:1: rule__DocumentationGenerationConfiguration__Group__1 : rule__DocumentationGenerationConfiguration__Group__1__Impl rule__DocumentationGenerationConfiguration__Group__2 ;
    public final void rule__DocumentationGenerationConfiguration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2586:1: ( rule__DocumentationGenerationConfiguration__Group__1__Impl rule__DocumentationGenerationConfiguration__Group__2 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2587:2: rule__DocumentationGenerationConfiguration__Group__1__Impl rule__DocumentationGenerationConfiguration__Group__2
            {
            pushFollow(FOLLOW_rule__DocumentationGenerationConfiguration__Group__1__Impl_in_rule__DocumentationGenerationConfiguration__Group__15134);
            rule__DocumentationGenerationConfiguration__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__DocumentationGenerationConfiguration__Group__2_in_rule__DocumentationGenerationConfiguration__Group__15137);
            rule__DocumentationGenerationConfiguration__Group__2();

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
    // $ANTLR end "rule__DocumentationGenerationConfiguration__Group__1"


    // $ANTLR start "rule__DocumentationGenerationConfiguration__Group__1__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2594:1: rule__DocumentationGenerationConfiguration__Group__1__Impl : ( 'documentation' ) ;
    public final void rule__DocumentationGenerationConfiguration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2598:1: ( ( 'documentation' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2599:1: ( 'documentation' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2599:1: ( 'documentation' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2600:1: 'documentation'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDocumentationGenerationConfigurationAccess().getDocumentationKeyword_1()); 
            }
            match(input,34,FOLLOW_34_in_rule__DocumentationGenerationConfiguration__Group__1__Impl5165); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDocumentationGenerationConfigurationAccess().getDocumentationKeyword_1()); 
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
    // $ANTLR end "rule__DocumentationGenerationConfiguration__Group__1__Impl"


    // $ANTLR start "rule__DocumentationGenerationConfiguration__Group__2"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2613:1: rule__DocumentationGenerationConfiguration__Group__2 : rule__DocumentationGenerationConfiguration__Group__2__Impl rule__DocumentationGenerationConfiguration__Group__3 ;
    public final void rule__DocumentationGenerationConfiguration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2617:1: ( rule__DocumentationGenerationConfiguration__Group__2__Impl rule__DocumentationGenerationConfiguration__Group__3 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2618:2: rule__DocumentationGenerationConfiguration__Group__2__Impl rule__DocumentationGenerationConfiguration__Group__3
            {
            pushFollow(FOLLOW_rule__DocumentationGenerationConfiguration__Group__2__Impl_in_rule__DocumentationGenerationConfiguration__Group__25196);
            rule__DocumentationGenerationConfiguration__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__DocumentationGenerationConfiguration__Group__3_in_rule__DocumentationGenerationConfiguration__Group__25199);
            rule__DocumentationGenerationConfiguration__Group__3();

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
    // $ANTLR end "rule__DocumentationGenerationConfiguration__Group__2"


    // $ANTLR start "rule__DocumentationGenerationConfiguration__Group__2__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2625:1: rule__DocumentationGenerationConfiguration__Group__2__Impl : ( '(' ) ;
    public final void rule__DocumentationGenerationConfiguration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2629:1: ( ( '(' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2630:1: ( '(' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2630:1: ( '(' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2631:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDocumentationGenerationConfigurationAccess().getLeftParenthesisKeyword_2()); 
            }
            match(input,23,FOLLOW_23_in_rule__DocumentationGenerationConfiguration__Group__2__Impl5227); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDocumentationGenerationConfigurationAccess().getLeftParenthesisKeyword_2()); 
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
    // $ANTLR end "rule__DocumentationGenerationConfiguration__Group__2__Impl"


    // $ANTLR start "rule__DocumentationGenerationConfiguration__Group__3"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2644:1: rule__DocumentationGenerationConfiguration__Group__3 : rule__DocumentationGenerationConfiguration__Group__3__Impl rule__DocumentationGenerationConfiguration__Group__4 ;
    public final void rule__DocumentationGenerationConfiguration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2648:1: ( rule__DocumentationGenerationConfiguration__Group__3__Impl rule__DocumentationGenerationConfiguration__Group__4 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2649:2: rule__DocumentationGenerationConfiguration__Group__3__Impl rule__DocumentationGenerationConfiguration__Group__4
            {
            pushFollow(FOLLOW_rule__DocumentationGenerationConfiguration__Group__3__Impl_in_rule__DocumentationGenerationConfiguration__Group__35258);
            rule__DocumentationGenerationConfiguration__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__DocumentationGenerationConfiguration__Group__4_in_rule__DocumentationGenerationConfiguration__Group__35261);
            rule__DocumentationGenerationConfiguration__Group__4();

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
    // $ANTLR end "rule__DocumentationGenerationConfiguration__Group__3"


    // $ANTLR start "rule__DocumentationGenerationConfiguration__Group__3__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2656:1: rule__DocumentationGenerationConfiguration__Group__3__Impl : ( ( rule__DocumentationGenerationConfiguration__Group_3__0 )? ) ;
    public final void rule__DocumentationGenerationConfiguration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2660:1: ( ( ( rule__DocumentationGenerationConfiguration__Group_3__0 )? ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2661:1: ( ( rule__DocumentationGenerationConfiguration__Group_3__0 )? )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2661:1: ( ( rule__DocumentationGenerationConfiguration__Group_3__0 )? )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2662:1: ( rule__DocumentationGenerationConfiguration__Group_3__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDocumentationGenerationConfigurationAccess().getGroup_3()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2663:1: ( rule__DocumentationGenerationConfiguration__Group_3__0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==35) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2663:2: rule__DocumentationGenerationConfiguration__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__DocumentationGenerationConfiguration__Group_3__0_in_rule__DocumentationGenerationConfiguration__Group__3__Impl5288);
                    rule__DocumentationGenerationConfiguration__Group_3__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDocumentationGenerationConfigurationAccess().getGroup_3()); 
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
    // $ANTLR end "rule__DocumentationGenerationConfiguration__Group__3__Impl"


    // $ANTLR start "rule__DocumentationGenerationConfiguration__Group__4"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2673:1: rule__DocumentationGenerationConfiguration__Group__4 : rule__DocumentationGenerationConfiguration__Group__4__Impl ;
    public final void rule__DocumentationGenerationConfiguration__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2677:1: ( rule__DocumentationGenerationConfiguration__Group__4__Impl )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2678:2: rule__DocumentationGenerationConfiguration__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__DocumentationGenerationConfiguration__Group__4__Impl_in_rule__DocumentationGenerationConfiguration__Group__45319);
            rule__DocumentationGenerationConfiguration__Group__4__Impl();

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
    // $ANTLR end "rule__DocumentationGenerationConfiguration__Group__4"


    // $ANTLR start "rule__DocumentationGenerationConfiguration__Group__4__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2684:1: rule__DocumentationGenerationConfiguration__Group__4__Impl : ( ')' ) ;
    public final void rule__DocumentationGenerationConfiguration__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2688:1: ( ( ')' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2689:1: ( ')' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2689:1: ( ')' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2690:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDocumentationGenerationConfigurationAccess().getRightParenthesisKeyword_4()); 
            }
            match(input,24,FOLLOW_24_in_rule__DocumentationGenerationConfiguration__Group__4__Impl5347); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDocumentationGenerationConfigurationAccess().getRightParenthesisKeyword_4()); 
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
    // $ANTLR end "rule__DocumentationGenerationConfiguration__Group__4__Impl"


    // $ANTLR start "rule__DocumentationGenerationConfiguration__Group_3__0"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2713:1: rule__DocumentationGenerationConfiguration__Group_3__0 : rule__DocumentationGenerationConfiguration__Group_3__0__Impl rule__DocumentationGenerationConfiguration__Group_3__1 ;
    public final void rule__DocumentationGenerationConfiguration__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2717:1: ( rule__DocumentationGenerationConfiguration__Group_3__0__Impl rule__DocumentationGenerationConfiguration__Group_3__1 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2718:2: rule__DocumentationGenerationConfiguration__Group_3__0__Impl rule__DocumentationGenerationConfiguration__Group_3__1
            {
            pushFollow(FOLLOW_rule__DocumentationGenerationConfiguration__Group_3__0__Impl_in_rule__DocumentationGenerationConfiguration__Group_3__05388);
            rule__DocumentationGenerationConfiguration__Group_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__DocumentationGenerationConfiguration__Group_3__1_in_rule__DocumentationGenerationConfiguration__Group_3__05391);
            rule__DocumentationGenerationConfiguration__Group_3__1();

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
    // $ANTLR end "rule__DocumentationGenerationConfiguration__Group_3__0"


    // $ANTLR start "rule__DocumentationGenerationConfiguration__Group_3__0__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2725:1: rule__DocumentationGenerationConfiguration__Group_3__0__Impl : ( 'EcoreToHtml:' ) ;
    public final void rule__DocumentationGenerationConfiguration__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2729:1: ( ( 'EcoreToHtml:' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2730:1: ( 'EcoreToHtml:' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2730:1: ( 'EcoreToHtml:' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2731:1: 'EcoreToHtml:'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDocumentationGenerationConfigurationAccess().getEcoreToHtmlKeyword_3_0()); 
            }
            match(input,35,FOLLOW_35_in_rule__DocumentationGenerationConfiguration__Group_3__0__Impl5419); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDocumentationGenerationConfigurationAccess().getEcoreToHtmlKeyword_3_0()); 
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
    // $ANTLR end "rule__DocumentationGenerationConfiguration__Group_3__0__Impl"


    // $ANTLR start "rule__DocumentationGenerationConfiguration__Group_3__1"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2744:1: rule__DocumentationGenerationConfiguration__Group_3__1 : rule__DocumentationGenerationConfiguration__Group_3__1__Impl ;
    public final void rule__DocumentationGenerationConfiguration__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2748:1: ( rule__DocumentationGenerationConfiguration__Group_3__1__Impl )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2749:2: rule__DocumentationGenerationConfiguration__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__DocumentationGenerationConfiguration__Group_3__1__Impl_in_rule__DocumentationGenerationConfiguration__Group_3__15450);
            rule__DocumentationGenerationConfiguration__Group_3__1__Impl();

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
    // $ANTLR end "rule__DocumentationGenerationConfiguration__Group_3__1"


    // $ANTLR start "rule__DocumentationGenerationConfiguration__Group_3__1__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2755:1: rule__DocumentationGenerationConfiguration__Group_3__1__Impl : ( ( rule__DocumentationGenerationConfiguration__EcoreToHtmlAssignment_3_1 ) ) ;
    public final void rule__DocumentationGenerationConfiguration__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2759:1: ( ( ( rule__DocumentationGenerationConfiguration__EcoreToHtmlAssignment_3_1 ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2760:1: ( ( rule__DocumentationGenerationConfiguration__EcoreToHtmlAssignment_3_1 ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2760:1: ( ( rule__DocumentationGenerationConfiguration__EcoreToHtmlAssignment_3_1 ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2761:1: ( rule__DocumentationGenerationConfiguration__EcoreToHtmlAssignment_3_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDocumentationGenerationConfigurationAccess().getEcoreToHtmlAssignment_3_1()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2762:1: ( rule__DocumentationGenerationConfiguration__EcoreToHtmlAssignment_3_1 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2762:2: rule__DocumentationGenerationConfiguration__EcoreToHtmlAssignment_3_1
            {
            pushFollow(FOLLOW_rule__DocumentationGenerationConfiguration__EcoreToHtmlAssignment_3_1_in_rule__DocumentationGenerationConfiguration__Group_3__1__Impl5477);
            rule__DocumentationGenerationConfiguration__EcoreToHtmlAssignment_3_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDocumentationGenerationConfigurationAccess().getEcoreToHtmlAssignment_3_1()); 
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
    // $ANTLR end "rule__DocumentationGenerationConfiguration__Group_3__1__Impl"


    // $ANTLR start "rule__ModelsAirdGenerationConfiguration__Group__0"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2776:1: rule__ModelsAirdGenerationConfiguration__Group__0 : rule__ModelsAirdGenerationConfiguration__Group__0__Impl rule__ModelsAirdGenerationConfiguration__Group__1 ;
    public final void rule__ModelsAirdGenerationConfiguration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2780:1: ( rule__ModelsAirdGenerationConfiguration__Group__0__Impl rule__ModelsAirdGenerationConfiguration__Group__1 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2781:2: rule__ModelsAirdGenerationConfiguration__Group__0__Impl rule__ModelsAirdGenerationConfiguration__Group__1
            {
            pushFollow(FOLLOW_rule__ModelsAirdGenerationConfiguration__Group__0__Impl_in_rule__ModelsAirdGenerationConfiguration__Group__05511);
            rule__ModelsAirdGenerationConfiguration__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ModelsAirdGenerationConfiguration__Group__1_in_rule__ModelsAirdGenerationConfiguration__Group__05514);
            rule__ModelsAirdGenerationConfiguration__Group__1();

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
    // $ANTLR end "rule__ModelsAirdGenerationConfiguration__Group__0"


    // $ANTLR start "rule__ModelsAirdGenerationConfiguration__Group__0__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2788:1: rule__ModelsAirdGenerationConfiguration__Group__0__Impl : ( () ) ;
    public final void rule__ModelsAirdGenerationConfiguration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2792:1: ( ( () ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2793:1: ( () )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2793:1: ( () )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2794:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelsAirdGenerationConfigurationAccess().getAirdGenerationConfigurationAction_0()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2795:1: ()
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2797:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelsAirdGenerationConfigurationAccess().getAirdGenerationConfigurationAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelsAirdGenerationConfiguration__Group__0__Impl"


    // $ANTLR start "rule__ModelsAirdGenerationConfiguration__Group__1"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2807:1: rule__ModelsAirdGenerationConfiguration__Group__1 : rule__ModelsAirdGenerationConfiguration__Group__1__Impl rule__ModelsAirdGenerationConfiguration__Group__2 ;
    public final void rule__ModelsAirdGenerationConfiguration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2811:1: ( rule__ModelsAirdGenerationConfiguration__Group__1__Impl rule__ModelsAirdGenerationConfiguration__Group__2 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2812:2: rule__ModelsAirdGenerationConfiguration__Group__1__Impl rule__ModelsAirdGenerationConfiguration__Group__2
            {
            pushFollow(FOLLOW_rule__ModelsAirdGenerationConfiguration__Group__1__Impl_in_rule__ModelsAirdGenerationConfiguration__Group__15572);
            rule__ModelsAirdGenerationConfiguration__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ModelsAirdGenerationConfiguration__Group__2_in_rule__ModelsAirdGenerationConfiguration__Group__15575);
            rule__ModelsAirdGenerationConfiguration__Group__2();

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
    // $ANTLR end "rule__ModelsAirdGenerationConfiguration__Group__1"


    // $ANTLR start "rule__ModelsAirdGenerationConfiguration__Group__1__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2819:1: rule__ModelsAirdGenerationConfiguration__Group__1__Impl : ( 'ecore' ) ;
    public final void rule__ModelsAirdGenerationConfiguration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2823:1: ( ( 'ecore' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2824:1: ( 'ecore' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2824:1: ( 'ecore' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2825:1: 'ecore'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelsAirdGenerationConfigurationAccess().getEcoreKeyword_1()); 
            }
            match(input,36,FOLLOW_36_in_rule__ModelsAirdGenerationConfiguration__Group__1__Impl5603); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelsAirdGenerationConfigurationAccess().getEcoreKeyword_1()); 
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
    // $ANTLR end "rule__ModelsAirdGenerationConfiguration__Group__1__Impl"


    // $ANTLR start "rule__ModelsAirdGenerationConfiguration__Group__2"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2838:1: rule__ModelsAirdGenerationConfiguration__Group__2 : rule__ModelsAirdGenerationConfiguration__Group__2__Impl rule__ModelsAirdGenerationConfiguration__Group__3 ;
    public final void rule__ModelsAirdGenerationConfiguration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2842:1: ( rule__ModelsAirdGenerationConfiguration__Group__2__Impl rule__ModelsAirdGenerationConfiguration__Group__3 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2843:2: rule__ModelsAirdGenerationConfiguration__Group__2__Impl rule__ModelsAirdGenerationConfiguration__Group__3
            {
            pushFollow(FOLLOW_rule__ModelsAirdGenerationConfiguration__Group__2__Impl_in_rule__ModelsAirdGenerationConfiguration__Group__25634);
            rule__ModelsAirdGenerationConfiguration__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ModelsAirdGenerationConfiguration__Group__3_in_rule__ModelsAirdGenerationConfiguration__Group__25637);
            rule__ModelsAirdGenerationConfiguration__Group__3();

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
    // $ANTLR end "rule__ModelsAirdGenerationConfiguration__Group__2"


    // $ANTLR start "rule__ModelsAirdGenerationConfiguration__Group__2__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2850:1: rule__ModelsAirdGenerationConfiguration__Group__2__Impl : ( '(' ) ;
    public final void rule__ModelsAirdGenerationConfiguration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2854:1: ( ( '(' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2855:1: ( '(' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2855:1: ( '(' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2856:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelsAirdGenerationConfigurationAccess().getLeftParenthesisKeyword_2()); 
            }
            match(input,23,FOLLOW_23_in_rule__ModelsAirdGenerationConfiguration__Group__2__Impl5665); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelsAirdGenerationConfigurationAccess().getLeftParenthesisKeyword_2()); 
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
    // $ANTLR end "rule__ModelsAirdGenerationConfiguration__Group__2__Impl"


    // $ANTLR start "rule__ModelsAirdGenerationConfiguration__Group__3"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2869:1: rule__ModelsAirdGenerationConfiguration__Group__3 : rule__ModelsAirdGenerationConfiguration__Group__3__Impl rule__ModelsAirdGenerationConfiguration__Group__4 ;
    public final void rule__ModelsAirdGenerationConfiguration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2873:1: ( rule__ModelsAirdGenerationConfiguration__Group__3__Impl rule__ModelsAirdGenerationConfiguration__Group__4 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2874:2: rule__ModelsAirdGenerationConfiguration__Group__3__Impl rule__ModelsAirdGenerationConfiguration__Group__4
            {
            pushFollow(FOLLOW_rule__ModelsAirdGenerationConfiguration__Group__3__Impl_in_rule__ModelsAirdGenerationConfiguration__Group__35696);
            rule__ModelsAirdGenerationConfiguration__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ModelsAirdGenerationConfiguration__Group__4_in_rule__ModelsAirdGenerationConfiguration__Group__35699);
            rule__ModelsAirdGenerationConfiguration__Group__4();

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
    // $ANTLR end "rule__ModelsAirdGenerationConfiguration__Group__3"


    // $ANTLR start "rule__ModelsAirdGenerationConfiguration__Group__3__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2881:1: rule__ModelsAirdGenerationConfiguration__Group__3__Impl : ( ( rule__ModelsAirdGenerationConfiguration__Group_3__0 )? ) ;
    public final void rule__ModelsAirdGenerationConfiguration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2885:1: ( ( ( rule__ModelsAirdGenerationConfiguration__Group_3__0 )? ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2886:1: ( ( rule__ModelsAirdGenerationConfiguration__Group_3__0 )? )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2886:1: ( ( rule__ModelsAirdGenerationConfiguration__Group_3__0 )? )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2887:1: ( rule__ModelsAirdGenerationConfiguration__Group_3__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelsAirdGenerationConfigurationAccess().getGroup_3()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2888:1: ( rule__ModelsAirdGenerationConfiguration__Group_3__0 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==37) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2888:2: rule__ModelsAirdGenerationConfiguration__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__ModelsAirdGenerationConfiguration__Group_3__0_in_rule__ModelsAirdGenerationConfiguration__Group__3__Impl5726);
                    rule__ModelsAirdGenerationConfiguration__Group_3__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelsAirdGenerationConfigurationAccess().getGroup_3()); 
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
    // $ANTLR end "rule__ModelsAirdGenerationConfiguration__Group__3__Impl"


    // $ANTLR start "rule__ModelsAirdGenerationConfiguration__Group__4"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2898:1: rule__ModelsAirdGenerationConfiguration__Group__4 : rule__ModelsAirdGenerationConfiguration__Group__4__Impl ;
    public final void rule__ModelsAirdGenerationConfiguration__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2902:1: ( rule__ModelsAirdGenerationConfiguration__Group__4__Impl )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2903:2: rule__ModelsAirdGenerationConfiguration__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__ModelsAirdGenerationConfiguration__Group__4__Impl_in_rule__ModelsAirdGenerationConfiguration__Group__45757);
            rule__ModelsAirdGenerationConfiguration__Group__4__Impl();

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
    // $ANTLR end "rule__ModelsAirdGenerationConfiguration__Group__4"


    // $ANTLR start "rule__ModelsAirdGenerationConfiguration__Group__4__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2909:1: rule__ModelsAirdGenerationConfiguration__Group__4__Impl : ( ')' ) ;
    public final void rule__ModelsAirdGenerationConfiguration__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2913:1: ( ( ')' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2914:1: ( ')' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2914:1: ( ')' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2915:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelsAirdGenerationConfigurationAccess().getRightParenthesisKeyword_4()); 
            }
            match(input,24,FOLLOW_24_in_rule__ModelsAirdGenerationConfiguration__Group__4__Impl5785); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelsAirdGenerationConfigurationAccess().getRightParenthesisKeyword_4()); 
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
    // $ANTLR end "rule__ModelsAirdGenerationConfiguration__Group__4__Impl"


    // $ANTLR start "rule__ModelsAirdGenerationConfiguration__Group_3__0"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2938:1: rule__ModelsAirdGenerationConfiguration__Group_3__0 : rule__ModelsAirdGenerationConfiguration__Group_3__0__Impl rule__ModelsAirdGenerationConfiguration__Group_3__1 ;
    public final void rule__ModelsAirdGenerationConfiguration__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2942:1: ( rule__ModelsAirdGenerationConfiguration__Group_3__0__Impl rule__ModelsAirdGenerationConfiguration__Group_3__1 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2943:2: rule__ModelsAirdGenerationConfiguration__Group_3__0__Impl rule__ModelsAirdGenerationConfiguration__Group_3__1
            {
            pushFollow(FOLLOW_rule__ModelsAirdGenerationConfiguration__Group_3__0__Impl_in_rule__ModelsAirdGenerationConfiguration__Group_3__05826);
            rule__ModelsAirdGenerationConfiguration__Group_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ModelsAirdGenerationConfiguration__Group_3__1_in_rule__ModelsAirdGenerationConfiguration__Group_3__05829);
            rule__ModelsAirdGenerationConfiguration__Group_3__1();

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
    // $ANTLR end "rule__ModelsAirdGenerationConfiguration__Group_3__0"


    // $ANTLR start "rule__ModelsAirdGenerationConfiguration__Group_3__0__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2950:1: rule__ModelsAirdGenerationConfiguration__Group_3__0__Impl : ( 'aird' ) ;
    public final void rule__ModelsAirdGenerationConfiguration__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2954:1: ( ( 'aird' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2955:1: ( 'aird' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2955:1: ( 'aird' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2956:1: 'aird'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelsAirdGenerationConfigurationAccess().getAirdKeyword_3_0()); 
            }
            match(input,37,FOLLOW_37_in_rule__ModelsAirdGenerationConfiguration__Group_3__0__Impl5857); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelsAirdGenerationConfigurationAccess().getAirdKeyword_3_0()); 
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
    // $ANTLR end "rule__ModelsAirdGenerationConfiguration__Group_3__0__Impl"


    // $ANTLR start "rule__ModelsAirdGenerationConfiguration__Group_3__1"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2969:1: rule__ModelsAirdGenerationConfiguration__Group_3__1 : rule__ModelsAirdGenerationConfiguration__Group_3__1__Impl rule__ModelsAirdGenerationConfiguration__Group_3__2 ;
    public final void rule__ModelsAirdGenerationConfiguration__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2973:1: ( rule__ModelsAirdGenerationConfiguration__Group_3__1__Impl rule__ModelsAirdGenerationConfiguration__Group_3__2 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2974:2: rule__ModelsAirdGenerationConfiguration__Group_3__1__Impl rule__ModelsAirdGenerationConfiguration__Group_3__2
            {
            pushFollow(FOLLOW_rule__ModelsAirdGenerationConfiguration__Group_3__1__Impl_in_rule__ModelsAirdGenerationConfiguration__Group_3__15888);
            rule__ModelsAirdGenerationConfiguration__Group_3__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ModelsAirdGenerationConfiguration__Group_3__2_in_rule__ModelsAirdGenerationConfiguration__Group_3__15891);
            rule__ModelsAirdGenerationConfiguration__Group_3__2();

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
    // $ANTLR end "rule__ModelsAirdGenerationConfiguration__Group_3__1"


    // $ANTLR start "rule__ModelsAirdGenerationConfiguration__Group_3__1__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2981:1: rule__ModelsAirdGenerationConfiguration__Group_3__1__Impl : ( ':' ) ;
    public final void rule__ModelsAirdGenerationConfiguration__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2985:1: ( ( ':' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2986:1: ( ':' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2986:1: ( ':' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:2987:1: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelsAirdGenerationConfigurationAccess().getColonKeyword_3_1()); 
            }
            match(input,26,FOLLOW_26_in_rule__ModelsAirdGenerationConfiguration__Group_3__1__Impl5919); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelsAirdGenerationConfigurationAccess().getColonKeyword_3_1()); 
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
    // $ANTLR end "rule__ModelsAirdGenerationConfiguration__Group_3__1__Impl"


    // $ANTLR start "rule__ModelsAirdGenerationConfiguration__Group_3__2"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:3000:1: rule__ModelsAirdGenerationConfiguration__Group_3__2 : rule__ModelsAirdGenerationConfiguration__Group_3__2__Impl ;
    public final void rule__ModelsAirdGenerationConfiguration__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:3004:1: ( rule__ModelsAirdGenerationConfiguration__Group_3__2__Impl )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:3005:2: rule__ModelsAirdGenerationConfiguration__Group_3__2__Impl
            {
            pushFollow(FOLLOW_rule__ModelsAirdGenerationConfiguration__Group_3__2__Impl_in_rule__ModelsAirdGenerationConfiguration__Group_3__25950);
            rule__ModelsAirdGenerationConfiguration__Group_3__2__Impl();

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
    // $ANTLR end "rule__ModelsAirdGenerationConfiguration__Group_3__2"


    // $ANTLR start "rule__ModelsAirdGenerationConfiguration__Group_3__2__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:3011:1: rule__ModelsAirdGenerationConfiguration__Group_3__2__Impl : ( ( rule__ModelsAirdGenerationConfiguration__GenRepresentationsAssignment_3_2 ) ) ;
    public final void rule__ModelsAirdGenerationConfiguration__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:3015:1: ( ( ( rule__ModelsAirdGenerationConfiguration__GenRepresentationsAssignment_3_2 ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:3016:1: ( ( rule__ModelsAirdGenerationConfiguration__GenRepresentationsAssignment_3_2 ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:3016:1: ( ( rule__ModelsAirdGenerationConfiguration__GenRepresentationsAssignment_3_2 ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:3017:1: ( rule__ModelsAirdGenerationConfiguration__GenRepresentationsAssignment_3_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelsAirdGenerationConfigurationAccess().getGenRepresentationsAssignment_3_2()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:3018:1: ( rule__ModelsAirdGenerationConfiguration__GenRepresentationsAssignment_3_2 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:3018:2: rule__ModelsAirdGenerationConfiguration__GenRepresentationsAssignment_3_2
            {
            pushFollow(FOLLOW_rule__ModelsAirdGenerationConfiguration__GenRepresentationsAssignment_3_2_in_rule__ModelsAirdGenerationConfiguration__Group_3__2__Impl5977);
            rule__ModelsAirdGenerationConfiguration__GenRepresentationsAssignment_3_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelsAirdGenerationConfigurationAccess().getGenRepresentationsAssignment_3_2()); 
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
    // $ANTLR end "rule__ModelsAirdGenerationConfiguration__Group_3__2__Impl"


    // $ANTLR start "rule__Release__Group__0"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:3034:1: rule__Release__Group__0 : rule__Release__Group__0__Impl rule__Release__Group__1 ;
    public final void rule__Release__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:3038:1: ( rule__Release__Group__0__Impl rule__Release__Group__1 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:3039:2: rule__Release__Group__0__Impl rule__Release__Group__1
            {
            pushFollow(FOLLOW_rule__Release__Group__0__Impl_in_rule__Release__Group__06013);
            rule__Release__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Release__Group__1_in_rule__Release__Group__06016);
            rule__Release__Group__1();

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
    // $ANTLR end "rule__Release__Group__0"


    // $ANTLR start "rule__Release__Group__0__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:3046:1: rule__Release__Group__0__Impl : ( () ) ;
    public final void rule__Release__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:3050:1: ( ( () ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:3051:1: ( () )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:3051:1: ( () )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:3052:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReleaseAccess().getReleaseAction_0()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:3053:1: ()
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:3055:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getReleaseAccess().getReleaseAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Release__Group__0__Impl"


    // $ANTLR start "rule__Release__Group__1"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:3065:1: rule__Release__Group__1 : rule__Release__Group__1__Impl rule__Release__Group__2 ;
    public final void rule__Release__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:3069:1: ( rule__Release__Group__1__Impl rule__Release__Group__2 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:3070:2: rule__Release__Group__1__Impl rule__Release__Group__2
            {
            pushFollow(FOLLOW_rule__Release__Group__1__Impl_in_rule__Release__Group__16074);
            rule__Release__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Release__Group__2_in_rule__Release__Group__16077);
            rule__Release__Group__2();

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
    // $ANTLR end "rule__Release__Group__1"


    // $ANTLR start "rule__Release__Group__1__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:3077:1: rule__Release__Group__1__Impl : ( 'release' ) ;
    public final void rule__Release__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:3081:1: ( ( 'release' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:3082:1: ( 'release' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:3082:1: ( 'release' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:3083:1: 'release'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReleaseAccess().getReleaseKeyword_1()); 
            }
            match(input,38,FOLLOW_38_in_rule__Release__Group__1__Impl6105); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getReleaseAccess().getReleaseKeyword_1()); 
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
    // $ANTLR end "rule__Release__Group__1__Impl"


    // $ANTLR start "rule__Release__Group__2"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:3096:1: rule__Release__Group__2 : rule__Release__Group__2__Impl rule__Release__Group__3 ;
    public final void rule__Release__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:3100:1: ( rule__Release__Group__2__Impl rule__Release__Group__3 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:3101:2: rule__Release__Group__2__Impl rule__Release__Group__3
            {
            pushFollow(FOLLOW_rule__Release__Group__2__Impl_in_rule__Release__Group__26136);
            rule__Release__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Release__Group__3_in_rule__Release__Group__26139);
            rule__Release__Group__3();

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
    // $ANTLR end "rule__Release__Group__2"


    // $ANTLR start "rule__Release__Group__2__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:3108:1: rule__Release__Group__2__Impl : ( '{' ) ;
    public final void rule__Release__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:3112:1: ( ( '{' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:3113:1: ( '{' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:3113:1: ( '{' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:3114:1: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReleaseAccess().getLeftCurlyBracketKeyword_2()); 
            }
            match(input,16,FOLLOW_16_in_rule__Release__Group__2__Impl6167); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getReleaseAccess().getLeftCurlyBracketKeyword_2()); 
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
    // $ANTLR end "rule__Release__Group__2__Impl"


    // $ANTLR start "rule__Release__Group__3"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:3127:1: rule__Release__Group__3 : rule__Release__Group__3__Impl rule__Release__Group__4 ;
    public final void rule__Release__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:3131:1: ( rule__Release__Group__3__Impl rule__Release__Group__4 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:3132:2: rule__Release__Group__3__Impl rule__Release__Group__4
            {
            pushFollow(FOLLOW_rule__Release__Group__3__Impl_in_rule__Release__Group__36198);
            rule__Release__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Release__Group__4_in_rule__Release__Group__36201);
            rule__Release__Group__4();

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
    // $ANTLR end "rule__Release__Group__3"


    // $ANTLR start "rule__Release__Group__3__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:3139:1: rule__Release__Group__3__Impl : ( ( rule__Release__Group_3__0 )? ) ;
    public final void rule__Release__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:3143:1: ( ( ( rule__Release__Group_3__0 )? ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:3144:1: ( ( rule__Release__Group_3__0 )? )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:3144:1: ( ( rule__Release__Group_3__0 )? )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:3145:1: ( rule__Release__Group_3__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReleaseAccess().getGroup_3()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:3146:1: ( rule__Release__Group_3__0 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==39) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:3146:2: rule__Release__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__Release__Group_3__0_in_rule__Release__Group__3__Impl6228);
                    rule__Release__Group_3__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getReleaseAccess().getGroup_3()); 
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
    // $ANTLR end "rule__Release__Group__3__Impl"


    // $ANTLR start "rule__Release__Group__4"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:3156:1: rule__Release__Group__4 : rule__Release__Group__4__Impl rule__Release__Group__5 ;
    public final void rule__Release__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:3160:1: ( rule__Release__Group__4__Impl rule__Release__Group__5 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:3161:2: rule__Release__Group__4__Impl rule__Release__Group__5
            {
            pushFollow(FOLLOW_rule__Release__Group__4__Impl_in_rule__Release__Group__46259);
            rule__Release__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Release__Group__5_in_rule__Release__Group__46262);
            rule__Release__Group__5();

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
    // $ANTLR end "rule__Release__Group__4"


    // $ANTLR start "rule__Release__Group__4__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:3168:1: rule__Release__Group__4__Impl : ( ( rule__Release__Group_4__0 )? ) ;
    public final void rule__Release__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:3172:1: ( ( ( rule__Release__Group_4__0 )? ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:3173:1: ( ( rule__Release__Group_4__0 )? )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:3173:1: ( ( rule__Release__Group_4__0 )? )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:3174:1: ( rule__Release__Group_4__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReleaseAccess().getGroup_4()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:3175:1: ( rule__Release__Group_4__0 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==40) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:3175:2: rule__Release__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__Release__Group_4__0_in_rule__Release__Group__4__Impl6289);
                    rule__Release__Group_4__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getReleaseAccess().getGroup_4()); 
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
    // $ANTLR end "rule__Release__Group__4__Impl"


    // $ANTLR start "rule__Release__Group__5"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:3185:1: rule__Release__Group__5 : rule__Release__Group__5__Impl rule__Release__Group__6 ;
    public final void rule__Release__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:3189:1: ( rule__Release__Group__5__Impl rule__Release__Group__6 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:3190:2: rule__Release__Group__5__Impl rule__Release__Group__6
            {
            pushFollow(FOLLOW_rule__Release__Group__5__Impl_in_rule__Release__Group__56320);
            rule__Release__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Release__Group__6_in_rule__Release__Group__56323);
            rule__Release__Group__6();

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
    // $ANTLR end "rule__Release__Group__5"


    // $ANTLR start "rule__Release__Group__5__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:3197:1: rule__Release__Group__5__Impl : ( ( rule__Release__Group_5__0 )? ) ;
    public final void rule__Release__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:3201:1: ( ( ( rule__Release__Group_5__0 )? ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:3202:1: ( ( rule__Release__Group_5__0 )? )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:3202:1: ( ( rule__Release__Group_5__0 )? )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:3203:1: ( rule__Release__Group_5__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReleaseAccess().getGroup_5()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:3204:1: ( rule__Release__Group_5__0 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==41) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:3204:2: rule__Release__Group_5__0
                    {
                    pushFollow(FOLLOW_rule__Release__Group_5__0_in_rule__Release__Group__5__Impl6350);
                    rule__Release__Group_5__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getReleaseAccess().getGroup_5()); 
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
    // $ANTLR end "rule__Release__Group__5__Impl"


    // $ANTLR start "rule__Release__Group__6"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:3214:1: rule__Release__Group__6 : rule__Release__Group__6__Impl ;
    public final void rule__Release__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:3218:1: ( rule__Release__Group__6__Impl )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:3219:2: rule__Release__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__Release__Group__6__Impl_in_rule__Release__Group__66381);
            rule__Release__Group__6__Impl();

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
    // $ANTLR end "rule__Release__Group__6"


    // $ANTLR start "rule__Release__Group__6__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:3225:1: rule__Release__Group__6__Impl : ( '}' ) ;
    public final void rule__Release__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:3229:1: ( ( '}' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:3230:1: ( '}' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:3230:1: ( '}' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:3231:1: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReleaseAccess().getRightCurlyBracketKeyword_6()); 
            }
            match(input,17,FOLLOW_17_in_rule__Release__Group__6__Impl6409); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getReleaseAccess().getRightCurlyBracketKeyword_6()); 
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
    // $ANTLR end "rule__Release__Group__6__Impl"


    // $ANTLR start "rule__Release__Group_3__0"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:3258:1: rule__Release__Group_3__0 : rule__Release__Group_3__0__Impl rule__Release__Group_3__1 ;
    public final void rule__Release__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:3262:1: ( rule__Release__Group_3__0__Impl rule__Release__Group_3__1 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:3263:2: rule__Release__Group_3__0__Impl rule__Release__Group_3__1
            {
            pushFollow(FOLLOW_rule__Release__Group_3__0__Impl_in_rule__Release__Group_3__06454);
            rule__Release__Group_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Release__Group_3__1_in_rule__Release__Group_3__06457);
            rule__Release__Group_3__1();

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
    // $ANTLR end "rule__Release__Group_3__0"


    // $ANTLR start "rule__Release__Group_3__0__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:3270:1: rule__Release__Group_3__0__Impl : ( 'version' ) ;
    public final void rule__Release__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:3274:1: ( ( 'version' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:3275:1: ( 'version' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:3275:1: ( 'version' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:3276:1: 'version'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReleaseAccess().getVersionKeyword_3_0()); 
            }
            match(input,39,FOLLOW_39_in_rule__Release__Group_3__0__Impl6485); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getReleaseAccess().getVersionKeyword_3_0()); 
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
    // $ANTLR end "rule__Release__Group_3__0__Impl"


    // $ANTLR start "rule__Release__Group_3__1"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:3289:1: rule__Release__Group_3__1 : rule__Release__Group_3__1__Impl rule__Release__Group_3__2 ;
    public final void rule__Release__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:3293:1: ( rule__Release__Group_3__1__Impl rule__Release__Group_3__2 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:3294:2: rule__Release__Group_3__1__Impl rule__Release__Group_3__2
            {
            pushFollow(FOLLOW_rule__Release__Group_3__1__Impl_in_rule__Release__Group_3__16516);
            rule__Release__Group_3__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Release__Group_3__2_in_rule__Release__Group_3__16519);
            rule__Release__Group_3__2();

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
    // $ANTLR end "rule__Release__Group_3__1"


    // $ANTLR start "rule__Release__Group_3__1__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:3301:1: rule__Release__Group_3__1__Impl : ( ':' ) ;
    public final void rule__Release__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:3305:1: ( ( ':' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:3306:1: ( ':' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:3306:1: ( ':' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:3307:1: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReleaseAccess().getColonKeyword_3_1()); 
            }
            match(input,26,FOLLOW_26_in_rule__Release__Group_3__1__Impl6547); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getReleaseAccess().getColonKeyword_3_1()); 
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
    // $ANTLR end "rule__Release__Group_3__1__Impl"


    // $ANTLR start "rule__Release__Group_3__2"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:3320:1: rule__Release__Group_3__2 : rule__Release__Group_3__2__Impl ;
    public final void rule__Release__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:3324:1: ( rule__Release__Group_3__2__Impl )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:3325:2: rule__Release__Group_3__2__Impl
            {
            pushFollow(FOLLOW_rule__Release__Group_3__2__Impl_in_rule__Release__Group_3__26578);
            rule__Release__Group_3__2__Impl();

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
    // $ANTLR end "rule__Release__Group_3__2"


    // $ANTLR start "rule__Release__Group_3__2__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:3331:1: rule__Release__Group_3__2__Impl : ( ( rule__Release__ViewpointVersionAssignment_3_2 ) ) ;
    public final void rule__Release__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:3335:1: ( ( ( rule__Release__ViewpointVersionAssignment_3_2 ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:3336:1: ( ( rule__Release__ViewpointVersionAssignment_3_2 ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:3336:1: ( ( rule__Release__ViewpointVersionAssignment_3_2 ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:3337:1: ( rule__Release__ViewpointVersionAssignment_3_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReleaseAccess().getViewpointVersionAssignment_3_2()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:3338:1: ( rule__Release__ViewpointVersionAssignment_3_2 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:3338:2: rule__Release__ViewpointVersionAssignment_3_2
            {
            pushFollow(FOLLOW_rule__Release__ViewpointVersionAssignment_3_2_in_rule__Release__Group_3__2__Impl6605);
            rule__Release__ViewpointVersionAssignment_3_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getReleaseAccess().getViewpointVersionAssignment_3_2()); 
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
    // $ANTLR end "rule__Release__Group_3__2__Impl"


    // $ANTLR start "rule__Release__Group_4__0"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:3354:1: rule__Release__Group_4__0 : rule__Release__Group_4__0__Impl rule__Release__Group_4__1 ;
    public final void rule__Release__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:3358:1: ( rule__Release__Group_4__0__Impl rule__Release__Group_4__1 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:3359:2: rule__Release__Group_4__0__Impl rule__Release__Group_4__1
            {
            pushFollow(FOLLOW_rule__Release__Group_4__0__Impl_in_rule__Release__Group_4__06641);
            rule__Release__Group_4__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Release__Group_4__1_in_rule__Release__Group_4__06644);
            rule__Release__Group_4__1();

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
    // $ANTLR end "rule__Release__Group_4__0"


    // $ANTLR start "rule__Release__Group_4__0__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:3366:1: rule__Release__Group_4__0__Impl : ( 'description' ) ;
    public final void rule__Release__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:3370:1: ( ( 'description' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:3371:1: ( 'description' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:3371:1: ( 'description' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:3372:1: 'description'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReleaseAccess().getDescriptionKeyword_4_0()); 
            }
            match(input,40,FOLLOW_40_in_rule__Release__Group_4__0__Impl6672); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getReleaseAccess().getDescriptionKeyword_4_0()); 
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
    // $ANTLR end "rule__Release__Group_4__0__Impl"


    // $ANTLR start "rule__Release__Group_4__1"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:3385:1: rule__Release__Group_4__1 : rule__Release__Group_4__1__Impl rule__Release__Group_4__2 ;
    public final void rule__Release__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:3389:1: ( rule__Release__Group_4__1__Impl rule__Release__Group_4__2 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:3390:2: rule__Release__Group_4__1__Impl rule__Release__Group_4__2
            {
            pushFollow(FOLLOW_rule__Release__Group_4__1__Impl_in_rule__Release__Group_4__16703);
            rule__Release__Group_4__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Release__Group_4__2_in_rule__Release__Group_4__16706);
            rule__Release__Group_4__2();

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
    // $ANTLR end "rule__Release__Group_4__1"


    // $ANTLR start "rule__Release__Group_4__1__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:3397:1: rule__Release__Group_4__1__Impl : ( ':' ) ;
    public final void rule__Release__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:3401:1: ( ( ':' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:3402:1: ( ':' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:3402:1: ( ':' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:3403:1: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReleaseAccess().getColonKeyword_4_1()); 
            }
            match(input,26,FOLLOW_26_in_rule__Release__Group_4__1__Impl6734); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getReleaseAccess().getColonKeyword_4_1()); 
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
    // $ANTLR end "rule__Release__Group_4__1__Impl"


    // $ANTLR start "rule__Release__Group_4__2"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:3416:1: rule__Release__Group_4__2 : rule__Release__Group_4__2__Impl ;
    public final void rule__Release__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:3420:1: ( rule__Release__Group_4__2__Impl )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:3421:2: rule__Release__Group_4__2__Impl
            {
            pushFollow(FOLLOW_rule__Release__Group_4__2__Impl_in_rule__Release__Group_4__26765);
            rule__Release__Group_4__2__Impl();

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
    // $ANTLR end "rule__Release__Group_4__2"


    // $ANTLR start "rule__Release__Group_4__2__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:3427:1: rule__Release__Group_4__2__Impl : ( ( rule__Release__ViewpointDescriptionAssignment_4_2 ) ) ;
    public final void rule__Release__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:3431:1: ( ( ( rule__Release__ViewpointDescriptionAssignment_4_2 ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:3432:1: ( ( rule__Release__ViewpointDescriptionAssignment_4_2 ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:3432:1: ( ( rule__Release__ViewpointDescriptionAssignment_4_2 ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:3433:1: ( rule__Release__ViewpointDescriptionAssignment_4_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReleaseAccess().getViewpointDescriptionAssignment_4_2()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:3434:1: ( rule__Release__ViewpointDescriptionAssignment_4_2 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:3434:2: rule__Release__ViewpointDescriptionAssignment_4_2
            {
            pushFollow(FOLLOW_rule__Release__ViewpointDescriptionAssignment_4_2_in_rule__Release__Group_4__2__Impl6792);
            rule__Release__ViewpointDescriptionAssignment_4_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getReleaseAccess().getViewpointDescriptionAssignment_4_2()); 
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
    // $ANTLR end "rule__Release__Group_4__2__Impl"


    // $ANTLR start "rule__Release__Group_5__0"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:3450:1: rule__Release__Group_5__0 : rule__Release__Group_5__0__Impl rule__Release__Group_5__1 ;
    public final void rule__Release__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:3454:1: ( rule__Release__Group_5__0__Impl rule__Release__Group_5__1 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:3455:2: rule__Release__Group_5__0__Impl rule__Release__Group_5__1
            {
            pushFollow(FOLLOW_rule__Release__Group_5__0__Impl_in_rule__Release__Group_5__06828);
            rule__Release__Group_5__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Release__Group_5__1_in_rule__Release__Group_5__06831);
            rule__Release__Group_5__1();

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
    // $ANTLR end "rule__Release__Group_5__0"


    // $ANTLR start "rule__Release__Group_5__0__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:3462:1: rule__Release__Group_5__0__Impl : ( 'execution' ) ;
    public final void rule__Release__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:3466:1: ( ( 'execution' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:3467:1: ( 'execution' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:3467:1: ( 'execution' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:3468:1: 'execution'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReleaseAccess().getExecutionKeyword_5_0()); 
            }
            match(input,41,FOLLOW_41_in_rule__Release__Group_5__0__Impl6859); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getReleaseAccess().getExecutionKeyword_5_0()); 
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
    // $ANTLR end "rule__Release__Group_5__0__Impl"


    // $ANTLR start "rule__Release__Group_5__1"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:3481:1: rule__Release__Group_5__1 : rule__Release__Group_5__1__Impl rule__Release__Group_5__2 ;
    public final void rule__Release__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:3485:1: ( rule__Release__Group_5__1__Impl rule__Release__Group_5__2 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:3486:2: rule__Release__Group_5__1__Impl rule__Release__Group_5__2
            {
            pushFollow(FOLLOW_rule__Release__Group_5__1__Impl_in_rule__Release__Group_5__16890);
            rule__Release__Group_5__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Release__Group_5__2_in_rule__Release__Group_5__16893);
            rule__Release__Group_5__2();

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
    // $ANTLR end "rule__Release__Group_5__1"


    // $ANTLR start "rule__Release__Group_5__1__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:3493:1: rule__Release__Group_5__1__Impl : ( 'environments' ) ;
    public final void rule__Release__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:3497:1: ( ( 'environments' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:3498:1: ( 'environments' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:3498:1: ( 'environments' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:3499:1: 'environments'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReleaseAccess().getEnvironmentsKeyword_5_1()); 
            }
            match(input,42,FOLLOW_42_in_rule__Release__Group_5__1__Impl6921); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getReleaseAccess().getEnvironmentsKeyword_5_1()); 
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
    // $ANTLR end "rule__Release__Group_5__1__Impl"


    // $ANTLR start "rule__Release__Group_5__2"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:3512:1: rule__Release__Group_5__2 : rule__Release__Group_5__2__Impl rule__Release__Group_5__3 ;
    public final void rule__Release__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:3516:1: ( rule__Release__Group_5__2__Impl rule__Release__Group_5__3 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:3517:2: rule__Release__Group_5__2__Impl rule__Release__Group_5__3
            {
            pushFollow(FOLLOW_rule__Release__Group_5__2__Impl_in_rule__Release__Group_5__26952);
            rule__Release__Group_5__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Release__Group_5__3_in_rule__Release__Group_5__26955);
            rule__Release__Group_5__3();

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
    // $ANTLR end "rule__Release__Group_5__2"


    // $ANTLR start "rule__Release__Group_5__2__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:3524:1: rule__Release__Group_5__2__Impl : ( ':' ) ;
    public final void rule__Release__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:3528:1: ( ( ':' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:3529:1: ( ':' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:3529:1: ( ':' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:3530:1: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReleaseAccess().getColonKeyword_5_2()); 
            }
            match(input,26,FOLLOW_26_in_rule__Release__Group_5__2__Impl6983); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getReleaseAccess().getColonKeyword_5_2()); 
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
    // $ANTLR end "rule__Release__Group_5__2__Impl"


    // $ANTLR start "rule__Release__Group_5__3"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:3543:1: rule__Release__Group_5__3 : rule__Release__Group_5__3__Impl ;
    public final void rule__Release__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:3547:1: ( rule__Release__Group_5__3__Impl )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:3548:2: rule__Release__Group_5__3__Impl
            {
            pushFollow(FOLLOW_rule__Release__Group_5__3__Impl_in_rule__Release__Group_5__37014);
            rule__Release__Group_5__3__Impl();

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
    // $ANTLR end "rule__Release__Group_5__3"


    // $ANTLR start "rule__Release__Group_5__3__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:3554:1: rule__Release__Group_5__3__Impl : ( ( rule__Release__Group_5_3__0 ) ) ;
    public final void rule__Release__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:3558:1: ( ( ( rule__Release__Group_5_3__0 ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:3559:1: ( ( rule__Release__Group_5_3__0 ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:3559:1: ( ( rule__Release__Group_5_3__0 ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:3560:1: ( rule__Release__Group_5_3__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReleaseAccess().getGroup_5_3()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:3561:1: ( rule__Release__Group_5_3__0 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:3561:2: rule__Release__Group_5_3__0
            {
            pushFollow(FOLLOW_rule__Release__Group_5_3__0_in_rule__Release__Group_5__3__Impl7041);
            rule__Release__Group_5_3__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getReleaseAccess().getGroup_5_3()); 
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
    // $ANTLR end "rule__Release__Group_5__3__Impl"


    // $ANTLR start "rule__Release__Group_5_3__0"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:3579:1: rule__Release__Group_5_3__0 : rule__Release__Group_5_3__0__Impl rule__Release__Group_5_3__1 ;
    public final void rule__Release__Group_5_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:3583:1: ( rule__Release__Group_5_3__0__Impl rule__Release__Group_5_3__1 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:3584:2: rule__Release__Group_5_3__0__Impl rule__Release__Group_5_3__1
            {
            pushFollow(FOLLOW_rule__Release__Group_5_3__0__Impl_in_rule__Release__Group_5_3__07079);
            rule__Release__Group_5_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Release__Group_5_3__1_in_rule__Release__Group_5_3__07082);
            rule__Release__Group_5_3__1();

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
    // $ANTLR end "rule__Release__Group_5_3__0"


    // $ANTLR start "rule__Release__Group_5_3__0__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:3591:1: rule__Release__Group_5_3__0__Impl : ( ( rule__Release__RequiredExecutionEnvironmentAssignment_5_3_0 ) ) ;
    public final void rule__Release__Group_5_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:3595:1: ( ( ( rule__Release__RequiredExecutionEnvironmentAssignment_5_3_0 ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:3596:1: ( ( rule__Release__RequiredExecutionEnvironmentAssignment_5_3_0 ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:3596:1: ( ( rule__Release__RequiredExecutionEnvironmentAssignment_5_3_0 ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:3597:1: ( rule__Release__RequiredExecutionEnvironmentAssignment_5_3_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReleaseAccess().getRequiredExecutionEnvironmentAssignment_5_3_0()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:3598:1: ( rule__Release__RequiredExecutionEnvironmentAssignment_5_3_0 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:3598:2: rule__Release__RequiredExecutionEnvironmentAssignment_5_3_0
            {
            pushFollow(FOLLOW_rule__Release__RequiredExecutionEnvironmentAssignment_5_3_0_in_rule__Release__Group_5_3__0__Impl7109);
            rule__Release__RequiredExecutionEnvironmentAssignment_5_3_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getReleaseAccess().getRequiredExecutionEnvironmentAssignment_5_3_0()); 
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
    // $ANTLR end "rule__Release__Group_5_3__0__Impl"


    // $ANTLR start "rule__Release__Group_5_3__1"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:3608:1: rule__Release__Group_5_3__1 : rule__Release__Group_5_3__1__Impl ;
    public final void rule__Release__Group_5_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:3612:1: ( rule__Release__Group_5_3__1__Impl )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:3613:2: rule__Release__Group_5_3__1__Impl
            {
            pushFollow(FOLLOW_rule__Release__Group_5_3__1__Impl_in_rule__Release__Group_5_3__17139);
            rule__Release__Group_5_3__1__Impl();

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
    // $ANTLR end "rule__Release__Group_5_3__1"


    // $ANTLR start "rule__Release__Group_5_3__1__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:3619:1: rule__Release__Group_5_3__1__Impl : ( ( rule__Release__Group_5_3_1__0 )* ) ;
    public final void rule__Release__Group_5_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:3623:1: ( ( ( rule__Release__Group_5_3_1__0 )* ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:3624:1: ( ( rule__Release__Group_5_3_1__0 )* )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:3624:1: ( ( rule__Release__Group_5_3_1__0 )* )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:3625:1: ( rule__Release__Group_5_3_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReleaseAccess().getGroup_5_3_1()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:3626:1: ( rule__Release__Group_5_3_1__0 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==43) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:3626:2: rule__Release__Group_5_3_1__0
            	    {
            	    pushFollow(FOLLOW_rule__Release__Group_5_3_1__0_in_rule__Release__Group_5_3__1__Impl7166);
            	    rule__Release__Group_5_3_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getReleaseAccess().getGroup_5_3_1()); 
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
    // $ANTLR end "rule__Release__Group_5_3__1__Impl"


    // $ANTLR start "rule__Release__Group_5_3_1__0"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:3640:1: rule__Release__Group_5_3_1__0 : rule__Release__Group_5_3_1__0__Impl rule__Release__Group_5_3_1__1 ;
    public final void rule__Release__Group_5_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:3644:1: ( rule__Release__Group_5_3_1__0__Impl rule__Release__Group_5_3_1__1 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:3645:2: rule__Release__Group_5_3_1__0__Impl rule__Release__Group_5_3_1__1
            {
            pushFollow(FOLLOW_rule__Release__Group_5_3_1__0__Impl_in_rule__Release__Group_5_3_1__07201);
            rule__Release__Group_5_3_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Release__Group_5_3_1__1_in_rule__Release__Group_5_3_1__07204);
            rule__Release__Group_5_3_1__1();

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
    // $ANTLR end "rule__Release__Group_5_3_1__0"


    // $ANTLR start "rule__Release__Group_5_3_1__0__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:3652:1: rule__Release__Group_5_3_1__0__Impl : ( ',' ) ;
    public final void rule__Release__Group_5_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:3656:1: ( ( ',' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:3657:1: ( ',' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:3657:1: ( ',' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:3658:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReleaseAccess().getCommaKeyword_5_3_1_0()); 
            }
            match(input,43,FOLLOW_43_in_rule__Release__Group_5_3_1__0__Impl7232); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getReleaseAccess().getCommaKeyword_5_3_1_0()); 
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
    // $ANTLR end "rule__Release__Group_5_3_1__0__Impl"


    // $ANTLR start "rule__Release__Group_5_3_1__1"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:3671:1: rule__Release__Group_5_3_1__1 : rule__Release__Group_5_3_1__1__Impl ;
    public final void rule__Release__Group_5_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:3675:1: ( rule__Release__Group_5_3_1__1__Impl )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:3676:2: rule__Release__Group_5_3_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Release__Group_5_3_1__1__Impl_in_rule__Release__Group_5_3_1__17263);
            rule__Release__Group_5_3_1__1__Impl();

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
    // $ANTLR end "rule__Release__Group_5_3_1__1"


    // $ANTLR start "rule__Release__Group_5_3_1__1__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:3682:1: rule__Release__Group_5_3_1__1__Impl : ( ( rule__Release__RequiredExecutionEnvironmentAssignment_5_3_1_1 ) ) ;
    public final void rule__Release__Group_5_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:3686:1: ( ( ( rule__Release__RequiredExecutionEnvironmentAssignment_5_3_1_1 ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:3687:1: ( ( rule__Release__RequiredExecutionEnvironmentAssignment_5_3_1_1 ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:3687:1: ( ( rule__Release__RequiredExecutionEnvironmentAssignment_5_3_1_1 ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:3688:1: ( rule__Release__RequiredExecutionEnvironmentAssignment_5_3_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReleaseAccess().getRequiredExecutionEnvironmentAssignment_5_3_1_1()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:3689:1: ( rule__Release__RequiredExecutionEnvironmentAssignment_5_3_1_1 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:3689:2: rule__Release__RequiredExecutionEnvironmentAssignment_5_3_1_1
            {
            pushFollow(FOLLOW_rule__Release__RequiredExecutionEnvironmentAssignment_5_3_1_1_in_rule__Release__Group_5_3_1__1__Impl7290);
            rule__Release__RequiredExecutionEnvironmentAssignment_5_3_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getReleaseAccess().getRequiredExecutionEnvironmentAssignment_5_3_1_1()); 
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
    // $ANTLR end "rule__Release__Group_5_3_1__1__Impl"


    // $ANTLR start "rule__Version__Group__0"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:3703:1: rule__Version__Group__0 : rule__Version__Group__0__Impl rule__Version__Group__1 ;
    public final void rule__Version__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:3707:1: ( rule__Version__Group__0__Impl rule__Version__Group__1 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:3708:2: rule__Version__Group__0__Impl rule__Version__Group__1
            {
            pushFollow(FOLLOW_rule__Version__Group__0__Impl_in_rule__Version__Group__07324);
            rule__Version__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Version__Group__1_in_rule__Version__Group__07327);
            rule__Version__Group__1();

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
    // $ANTLR end "rule__Version__Group__0"


    // $ANTLR start "rule__Version__Group__0__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:3715:1: rule__Version__Group__0__Impl : ( RULE_INT ) ;
    public final void rule__Version__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:3719:1: ( ( RULE_INT ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:3720:1: ( RULE_INT )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:3720:1: ( RULE_INT )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:3721:1: RULE_INT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVersionAccess().getINTTerminalRuleCall_0()); 
            }
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Version__Group__0__Impl7354); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVersionAccess().getINTTerminalRuleCall_0()); 
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
    // $ANTLR end "rule__Version__Group__0__Impl"


    // $ANTLR start "rule__Version__Group__1"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:3732:1: rule__Version__Group__1 : rule__Version__Group__1__Impl ;
    public final void rule__Version__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:3736:1: ( rule__Version__Group__1__Impl )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:3737:2: rule__Version__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Version__Group__1__Impl_in_rule__Version__Group__17383);
            rule__Version__Group__1__Impl();

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
    // $ANTLR end "rule__Version__Group__1"


    // $ANTLR start "rule__Version__Group__1__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:3743:1: rule__Version__Group__1__Impl : ( ( rule__Version__Group_1__0 )? ) ;
    public final void rule__Version__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:3747:1: ( ( ( rule__Version__Group_1__0 )? ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:3748:1: ( ( rule__Version__Group_1__0 )? )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:3748:1: ( ( rule__Version__Group_1__0 )? )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:3749:1: ( rule__Version__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVersionAccess().getGroup_1()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:3750:1: ( rule__Version__Group_1__0 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==44) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:3750:2: rule__Version__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__Version__Group_1__0_in_rule__Version__Group__1__Impl7410);
                    rule__Version__Group_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVersionAccess().getGroup_1()); 
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
    // $ANTLR end "rule__Version__Group__1__Impl"


    // $ANTLR start "rule__Version__Group_1__0"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:3764:1: rule__Version__Group_1__0 : rule__Version__Group_1__0__Impl rule__Version__Group_1__1 ;
    public final void rule__Version__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:3768:1: ( rule__Version__Group_1__0__Impl rule__Version__Group_1__1 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:3769:2: rule__Version__Group_1__0__Impl rule__Version__Group_1__1
            {
            pushFollow(FOLLOW_rule__Version__Group_1__0__Impl_in_rule__Version__Group_1__07445);
            rule__Version__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Version__Group_1__1_in_rule__Version__Group_1__07448);
            rule__Version__Group_1__1();

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
    // $ANTLR end "rule__Version__Group_1__0"


    // $ANTLR start "rule__Version__Group_1__0__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:3776:1: rule__Version__Group_1__0__Impl : ( '.' ) ;
    public final void rule__Version__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:3780:1: ( ( '.' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:3781:1: ( '.' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:3781:1: ( '.' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:3782:1: '.'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVersionAccess().getFullStopKeyword_1_0()); 
            }
            match(input,44,FOLLOW_44_in_rule__Version__Group_1__0__Impl7476); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVersionAccess().getFullStopKeyword_1_0()); 
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
    // $ANTLR end "rule__Version__Group_1__0__Impl"


    // $ANTLR start "rule__Version__Group_1__1"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:3795:1: rule__Version__Group_1__1 : rule__Version__Group_1__1__Impl ;
    public final void rule__Version__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:3799:1: ( rule__Version__Group_1__1__Impl )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:3800:2: rule__Version__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Version__Group_1__1__Impl_in_rule__Version__Group_1__17507);
            rule__Version__Group_1__1__Impl();

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
    // $ANTLR end "rule__Version__Group_1__1"


    // $ANTLR start "rule__Version__Group_1__1__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:3806:1: rule__Version__Group_1__1__Impl : ( ( rule__Version__Group_1_1__0 ) ) ;
    public final void rule__Version__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:3810:1: ( ( ( rule__Version__Group_1_1__0 ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:3811:1: ( ( rule__Version__Group_1_1__0 ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:3811:1: ( ( rule__Version__Group_1_1__0 ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:3812:1: ( rule__Version__Group_1_1__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVersionAccess().getGroup_1_1()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:3813:1: ( rule__Version__Group_1_1__0 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:3813:2: rule__Version__Group_1_1__0
            {
            pushFollow(FOLLOW_rule__Version__Group_1_1__0_in_rule__Version__Group_1__1__Impl7534);
            rule__Version__Group_1_1__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVersionAccess().getGroup_1_1()); 
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
    // $ANTLR end "rule__Version__Group_1__1__Impl"


    // $ANTLR start "rule__Version__Group_1_1__0"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:3827:1: rule__Version__Group_1_1__0 : rule__Version__Group_1_1__0__Impl rule__Version__Group_1_1__1 ;
    public final void rule__Version__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:3831:1: ( rule__Version__Group_1_1__0__Impl rule__Version__Group_1_1__1 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:3832:2: rule__Version__Group_1_1__0__Impl rule__Version__Group_1_1__1
            {
            pushFollow(FOLLOW_rule__Version__Group_1_1__0__Impl_in_rule__Version__Group_1_1__07568);
            rule__Version__Group_1_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Version__Group_1_1__1_in_rule__Version__Group_1_1__07571);
            rule__Version__Group_1_1__1();

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
    // $ANTLR end "rule__Version__Group_1_1__0"


    // $ANTLR start "rule__Version__Group_1_1__0__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:3839:1: rule__Version__Group_1_1__0__Impl : ( RULE_INT ) ;
    public final void rule__Version__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:3843:1: ( ( RULE_INT ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:3844:1: ( RULE_INT )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:3844:1: ( RULE_INT )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:3845:1: RULE_INT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVersionAccess().getINTTerminalRuleCall_1_1_0()); 
            }
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Version__Group_1_1__0__Impl7598); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVersionAccess().getINTTerminalRuleCall_1_1_0()); 
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
    // $ANTLR end "rule__Version__Group_1_1__0__Impl"


    // $ANTLR start "rule__Version__Group_1_1__1"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:3856:1: rule__Version__Group_1_1__1 : rule__Version__Group_1_1__1__Impl ;
    public final void rule__Version__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:3860:1: ( rule__Version__Group_1_1__1__Impl )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:3861:2: rule__Version__Group_1_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Version__Group_1_1__1__Impl_in_rule__Version__Group_1_1__17627);
            rule__Version__Group_1_1__1__Impl();

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
    // $ANTLR end "rule__Version__Group_1_1__1"


    // $ANTLR start "rule__Version__Group_1_1__1__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:3867:1: rule__Version__Group_1_1__1__Impl : ( ( rule__Version__Group_1_1_1__0 )? ) ;
    public final void rule__Version__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:3871:1: ( ( ( rule__Version__Group_1_1_1__0 )? ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:3872:1: ( ( rule__Version__Group_1_1_1__0 )? )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:3872:1: ( ( rule__Version__Group_1_1_1__0 )? )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:3873:1: ( rule__Version__Group_1_1_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVersionAccess().getGroup_1_1_1()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:3874:1: ( rule__Version__Group_1_1_1__0 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==44) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:3874:2: rule__Version__Group_1_1_1__0
                    {
                    pushFollow(FOLLOW_rule__Version__Group_1_1_1__0_in_rule__Version__Group_1_1__1__Impl7654);
                    rule__Version__Group_1_1_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVersionAccess().getGroup_1_1_1()); 
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
    // $ANTLR end "rule__Version__Group_1_1__1__Impl"


    // $ANTLR start "rule__Version__Group_1_1_1__0"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:3888:1: rule__Version__Group_1_1_1__0 : rule__Version__Group_1_1_1__0__Impl rule__Version__Group_1_1_1__1 ;
    public final void rule__Version__Group_1_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:3892:1: ( rule__Version__Group_1_1_1__0__Impl rule__Version__Group_1_1_1__1 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:3893:2: rule__Version__Group_1_1_1__0__Impl rule__Version__Group_1_1_1__1
            {
            pushFollow(FOLLOW_rule__Version__Group_1_1_1__0__Impl_in_rule__Version__Group_1_1_1__07689);
            rule__Version__Group_1_1_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Version__Group_1_1_1__1_in_rule__Version__Group_1_1_1__07692);
            rule__Version__Group_1_1_1__1();

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
    // $ANTLR end "rule__Version__Group_1_1_1__0"


    // $ANTLR start "rule__Version__Group_1_1_1__0__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:3900:1: rule__Version__Group_1_1_1__0__Impl : ( '.' ) ;
    public final void rule__Version__Group_1_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:3904:1: ( ( '.' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:3905:1: ( '.' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:3905:1: ( '.' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:3906:1: '.'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVersionAccess().getFullStopKeyword_1_1_1_0()); 
            }
            match(input,44,FOLLOW_44_in_rule__Version__Group_1_1_1__0__Impl7720); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVersionAccess().getFullStopKeyword_1_1_1_0()); 
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
    // $ANTLR end "rule__Version__Group_1_1_1__0__Impl"


    // $ANTLR start "rule__Version__Group_1_1_1__1"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:3919:1: rule__Version__Group_1_1_1__1 : rule__Version__Group_1_1_1__1__Impl rule__Version__Group_1_1_1__2 ;
    public final void rule__Version__Group_1_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:3923:1: ( rule__Version__Group_1_1_1__1__Impl rule__Version__Group_1_1_1__2 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:3924:2: rule__Version__Group_1_1_1__1__Impl rule__Version__Group_1_1_1__2
            {
            pushFollow(FOLLOW_rule__Version__Group_1_1_1__1__Impl_in_rule__Version__Group_1_1_1__17751);
            rule__Version__Group_1_1_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Version__Group_1_1_1__2_in_rule__Version__Group_1_1_1__17754);
            rule__Version__Group_1_1_1__2();

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
    // $ANTLR end "rule__Version__Group_1_1_1__1"


    // $ANTLR start "rule__Version__Group_1_1_1__1__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:3931:1: rule__Version__Group_1_1_1__1__Impl : ( RULE_INT ) ;
    public final void rule__Version__Group_1_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:3935:1: ( ( RULE_INT ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:3936:1: ( RULE_INT )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:3936:1: ( RULE_INT )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:3937:1: RULE_INT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVersionAccess().getINTTerminalRuleCall_1_1_1_1()); 
            }
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Version__Group_1_1_1__1__Impl7781); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVersionAccess().getINTTerminalRuleCall_1_1_1_1()); 
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
    // $ANTLR end "rule__Version__Group_1_1_1__1__Impl"


    // $ANTLR start "rule__Version__Group_1_1_1__2"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:3948:1: rule__Version__Group_1_1_1__2 : rule__Version__Group_1_1_1__2__Impl ;
    public final void rule__Version__Group_1_1_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:3952:1: ( rule__Version__Group_1_1_1__2__Impl )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:3953:2: rule__Version__Group_1_1_1__2__Impl
            {
            pushFollow(FOLLOW_rule__Version__Group_1_1_1__2__Impl_in_rule__Version__Group_1_1_1__27810);
            rule__Version__Group_1_1_1__2__Impl();

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
    // $ANTLR end "rule__Version__Group_1_1_1__2"


    // $ANTLR start "rule__Version__Group_1_1_1__2__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:3959:1: rule__Version__Group_1_1_1__2__Impl : ( ( rule__Version__Group_1_1_1_2__0 )? ) ;
    public final void rule__Version__Group_1_1_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:3963:1: ( ( ( rule__Version__Group_1_1_1_2__0 )? ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:3964:1: ( ( rule__Version__Group_1_1_1_2__0 )? )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:3964:1: ( ( rule__Version__Group_1_1_1_2__0 )? )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:3965:1: ( rule__Version__Group_1_1_1_2__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVersionAccess().getGroup_1_1_1_2()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:3966:1: ( rule__Version__Group_1_1_1_2__0 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==44) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:3966:2: rule__Version__Group_1_1_1_2__0
                    {
                    pushFollow(FOLLOW_rule__Version__Group_1_1_1_2__0_in_rule__Version__Group_1_1_1__2__Impl7837);
                    rule__Version__Group_1_1_1_2__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVersionAccess().getGroup_1_1_1_2()); 
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
    // $ANTLR end "rule__Version__Group_1_1_1__2__Impl"


    // $ANTLR start "rule__Version__Group_1_1_1_2__0"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:3982:1: rule__Version__Group_1_1_1_2__0 : rule__Version__Group_1_1_1_2__0__Impl rule__Version__Group_1_1_1_2__1 ;
    public final void rule__Version__Group_1_1_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:3986:1: ( rule__Version__Group_1_1_1_2__0__Impl rule__Version__Group_1_1_1_2__1 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:3987:2: rule__Version__Group_1_1_1_2__0__Impl rule__Version__Group_1_1_1_2__1
            {
            pushFollow(FOLLOW_rule__Version__Group_1_1_1_2__0__Impl_in_rule__Version__Group_1_1_1_2__07874);
            rule__Version__Group_1_1_1_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Version__Group_1_1_1_2__1_in_rule__Version__Group_1_1_1_2__07877);
            rule__Version__Group_1_1_1_2__1();

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
    // $ANTLR end "rule__Version__Group_1_1_1_2__0"


    // $ANTLR start "rule__Version__Group_1_1_1_2__0__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:3994:1: rule__Version__Group_1_1_1_2__0__Impl : ( '.' ) ;
    public final void rule__Version__Group_1_1_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:3998:1: ( ( '.' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:3999:1: ( '.' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:3999:1: ( '.' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:4000:1: '.'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVersionAccess().getFullStopKeyword_1_1_1_2_0()); 
            }
            match(input,44,FOLLOW_44_in_rule__Version__Group_1_1_1_2__0__Impl7905); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVersionAccess().getFullStopKeyword_1_1_1_2_0()); 
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
    // $ANTLR end "rule__Version__Group_1_1_1_2__0__Impl"


    // $ANTLR start "rule__Version__Group_1_1_1_2__1"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:4013:1: rule__Version__Group_1_1_1_2__1 : rule__Version__Group_1_1_1_2__1__Impl ;
    public final void rule__Version__Group_1_1_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:4017:1: ( rule__Version__Group_1_1_1_2__1__Impl )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:4018:2: rule__Version__Group_1_1_1_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Version__Group_1_1_1_2__1__Impl_in_rule__Version__Group_1_1_1_2__17936);
            rule__Version__Group_1_1_1_2__1__Impl();

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
    // $ANTLR end "rule__Version__Group_1_1_1_2__1"


    // $ANTLR start "rule__Version__Group_1_1_1_2__1__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:4024:1: rule__Version__Group_1_1_1_2__1__Impl : ( ruleQualifier ) ;
    public final void rule__Version__Group_1_1_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:4028:1: ( ( ruleQualifier ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:4029:1: ( ruleQualifier )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:4029:1: ( ruleQualifier )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:4030:1: ruleQualifier
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVersionAccess().getQualifierParserRuleCall_1_1_1_2_1()); 
            }
            pushFollow(FOLLOW_ruleQualifier_in_rule__Version__Group_1_1_1_2__1__Impl7963);
            ruleQualifier();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVersionAccess().getQualifierParserRuleCall_1_1_1_2_1()); 
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
    // $ANTLR end "rule__Version__Group_1_1_1_2__1__Impl"


    // $ANTLR start "rule__Qualifier__Group__0"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:4045:1: rule__Qualifier__Group__0 : rule__Qualifier__Group__0__Impl rule__Qualifier__Group__1 ;
    public final void rule__Qualifier__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:4049:1: ( rule__Qualifier__Group__0__Impl rule__Qualifier__Group__1 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:4050:2: rule__Qualifier__Group__0__Impl rule__Qualifier__Group__1
            {
            pushFollow(FOLLOW_rule__Qualifier__Group__0__Impl_in_rule__Qualifier__Group__07996);
            rule__Qualifier__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Qualifier__Group__1_in_rule__Qualifier__Group__07999);
            rule__Qualifier__Group__1();

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
    // $ANTLR end "rule__Qualifier__Group__0"


    // $ANTLR start "rule__Qualifier__Group__0__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:4057:1: rule__Qualifier__Group__0__Impl : ( ( rule__Qualifier__Alternatives_0 ) ) ;
    public final void rule__Qualifier__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:4061:1: ( ( ( rule__Qualifier__Alternatives_0 ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:4062:1: ( ( rule__Qualifier__Alternatives_0 ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:4062:1: ( ( rule__Qualifier__Alternatives_0 ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:4063:1: ( rule__Qualifier__Alternatives_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifierAccess().getAlternatives_0()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:4064:1: ( rule__Qualifier__Alternatives_0 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:4064:2: rule__Qualifier__Alternatives_0
            {
            pushFollow(FOLLOW_rule__Qualifier__Alternatives_0_in_rule__Qualifier__Group__0__Impl8026);
            rule__Qualifier__Alternatives_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifierAccess().getAlternatives_0()); 
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
    // $ANTLR end "rule__Qualifier__Group__0__Impl"


    // $ANTLR start "rule__Qualifier__Group__1"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:4074:1: rule__Qualifier__Group__1 : rule__Qualifier__Group__1__Impl ;
    public final void rule__Qualifier__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:4078:1: ( rule__Qualifier__Group__1__Impl )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:4079:2: rule__Qualifier__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Qualifier__Group__1__Impl_in_rule__Qualifier__Group__18056);
            rule__Qualifier__Group__1__Impl();

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
    // $ANTLR end "rule__Qualifier__Group__1"


    // $ANTLR start "rule__Qualifier__Group__1__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:4085:1: rule__Qualifier__Group__1__Impl : ( ( rule__Qualifier__Alternatives_1 )* ) ;
    public final void rule__Qualifier__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:4089:1: ( ( ( rule__Qualifier__Alternatives_1 )* ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:4090:1: ( ( rule__Qualifier__Alternatives_1 )* )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:4090:1: ( ( rule__Qualifier__Alternatives_1 )* )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:4091:1: ( rule__Qualifier__Alternatives_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifierAccess().getAlternatives_1()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:4092:1: ( rule__Qualifier__Alternatives_1 )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( ((LA27_0>=RULE_INT && LA27_0<=RULE_ID)||(LA27_0>=11 && LA27_0<=12)) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:4092:2: rule__Qualifier__Alternatives_1
            	    {
            	    pushFollow(FOLLOW_rule__Qualifier__Alternatives_1_in_rule__Qualifier__Group__1__Impl8083);
            	    rule__Qualifier__Alternatives_1();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifierAccess().getAlternatives_1()); 
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
    // $ANTLR end "rule__Qualifier__Group__1__Impl"


    // $ANTLR start "rule__FQN__Group__0"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:4106:1: rule__FQN__Group__0 : rule__FQN__Group__0__Impl rule__FQN__Group__1 ;
    public final void rule__FQN__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:4110:1: ( rule__FQN__Group__0__Impl rule__FQN__Group__1 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:4111:2: rule__FQN__Group__0__Impl rule__FQN__Group__1
            {
            pushFollow(FOLLOW_rule__FQN__Group__0__Impl_in_rule__FQN__Group__08118);
            rule__FQN__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__FQN__Group__1_in_rule__FQN__Group__08121);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:4118:1: rule__FQN__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__FQN__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:4122:1: ( ( RULE_ID ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:4123:1: ( RULE_ID )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:4123:1: ( RULE_ID )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:4124:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFQNAccess().getIDTerminalRuleCall_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__FQN__Group__0__Impl8148); if (state.failed) return ;
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:4135:1: rule__FQN__Group__1 : rule__FQN__Group__1__Impl ;
    public final void rule__FQN__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:4139:1: ( rule__FQN__Group__1__Impl )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:4140:2: rule__FQN__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__FQN__Group__1__Impl_in_rule__FQN__Group__18177);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:4146:1: rule__FQN__Group__1__Impl : ( ( rule__FQN__Group_1__0 )* ) ;
    public final void rule__FQN__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:4150:1: ( ( ( rule__FQN__Group_1__0 )* ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:4151:1: ( ( rule__FQN__Group_1__0 )* )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:4151:1: ( ( rule__FQN__Group_1__0 )* )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:4152:1: ( rule__FQN__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFQNAccess().getGroup_1()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:4153:1: ( rule__FQN__Group_1__0 )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==44) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:4153:2: rule__FQN__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__FQN__Group_1__0_in_rule__FQN__Group__1__Impl8204);
            	    rule__FQN__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop28;
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:4167:1: rule__FQN__Group_1__0 : rule__FQN__Group_1__0__Impl rule__FQN__Group_1__1 ;
    public final void rule__FQN__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:4171:1: ( rule__FQN__Group_1__0__Impl rule__FQN__Group_1__1 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:4172:2: rule__FQN__Group_1__0__Impl rule__FQN__Group_1__1
            {
            pushFollow(FOLLOW_rule__FQN__Group_1__0__Impl_in_rule__FQN__Group_1__08239);
            rule__FQN__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__FQN__Group_1__1_in_rule__FQN__Group_1__08242);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:4179:1: rule__FQN__Group_1__0__Impl : ( '.' ) ;
    public final void rule__FQN__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:4183:1: ( ( '.' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:4184:1: ( '.' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:4184:1: ( '.' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:4185:1: '.'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFQNAccess().getFullStopKeyword_1_0()); 
            }
            match(input,44,FOLLOW_44_in_rule__FQN__Group_1__0__Impl8270); if (state.failed) return ;
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:4198:1: rule__FQN__Group_1__1 : rule__FQN__Group_1__1__Impl ;
    public final void rule__FQN__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:4202:1: ( rule__FQN__Group_1__1__Impl )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:4203:2: rule__FQN__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__FQN__Group_1__1__Impl_in_rule__FQN__Group_1__18301);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:4209:1: rule__FQN__Group_1__1__Impl : ( ( RULE_ID ) ) ;
    public final void rule__FQN__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:4213:1: ( ( ( RULE_ID ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:4214:1: ( ( RULE_ID ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:4214:1: ( ( RULE_ID ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:4215:1: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFQNAccess().getIDTerminalRuleCall_1_1()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:4216:1: ( RULE_ID )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:4216:3: RULE_ID
            {
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__FQN__Group_1__1__Impl8329); if (state.failed) return ;

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


    // $ANTLR start "rule__Configuration__NameAssignment_2"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:4231:1: rule__Configuration__NameAssignment_2 : ( ruleFQN ) ;
    public final void rule__Configuration__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:4235:1: ( ( ruleFQN ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:4236:1: ( ruleFQN )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:4236:1: ( ruleFQN )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:4237:1: ruleFQN
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConfigurationAccess().getNameFQNParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleFQN_in_rule__Configuration__NameAssignment_28368);
            ruleFQN();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConfigurationAccess().getNameFQNParserRuleCall_2_0()); 
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
    // $ANTLR end "rule__Configuration__NameAssignment_2"


    // $ANTLR start "rule__Configuration__VpConfigurationElementsAssignment_4"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:4246:1: rule__Configuration__VpConfigurationElementsAssignment_4 : ( ruleConfigurationElement ) ;
    public final void rule__Configuration__VpConfigurationElementsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:4250:1: ( ( ruleConfigurationElement ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:4251:1: ( ruleConfigurationElement )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:4251:1: ( ruleConfigurationElement )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:4252:1: ruleConfigurationElement
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConfigurationAccess().getVpConfigurationElementsConfigurationElementParserRuleCall_4_0()); 
            }
            pushFollow(FOLLOW_ruleConfigurationElement_in_rule__Configuration__VpConfigurationElementsAssignment_48399);
            ruleConfigurationElement();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConfigurationAccess().getVpConfigurationElementsConfigurationElementParserRuleCall_4_0()); 
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
    // $ANTLR end "rule__Configuration__VpConfigurationElementsAssignment_4"


    // $ANTLR start "rule__TargetApplication__TypeAssignment_2"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:4261:1: rule__TargetApplication__TypeAssignment_2 : ( ruleEString ) ;
    public final void rule__TargetApplication__TypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:4265:1: ( ( ruleEString ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:4266:1: ( ruleEString )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:4266:1: ( ruleEString )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:4267:1: ruleEString
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTargetApplicationAccess().getTypeEStringParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleEString_in_rule__TargetApplication__TypeAssignment_28430);
            ruleEString();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTargetApplicationAccess().getTypeEStringParserRuleCall_2_0()); 
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
    // $ANTLR end "rule__TargetApplication__TypeAssignment_2"


    // $ANTLR start "rule__GenerationConfiguration__ProjectNameAssignment_2"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:4276:1: rule__GenerationConfiguration__ProjectNameAssignment_2 : ( ruleFQN ) ;
    public final void rule__GenerationConfiguration__ProjectNameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:4280:1: ( ( ruleFQN ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:4281:1: ( ruleFQN )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:4281:1: ( ruleFQN )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:4282:1: ruleFQN
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGenerationConfigurationAccess().getProjectNameFQNParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleFQN_in_rule__GenerationConfiguration__ProjectNameAssignment_28461);
            ruleFQN();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGenerationConfigurationAccess().getProjectNameFQNParserRuleCall_2_0()); 
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
    // $ANTLR end "rule__GenerationConfiguration__ProjectNameAssignment_2"


    // $ANTLR start "rule__GenerationConfiguration__NsuriAssignment_3_1"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:4291:1: rule__GenerationConfiguration__NsuriAssignment_3_1 : ( RULE_STRING ) ;
    public final void rule__GenerationConfiguration__NsuriAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:4295:1: ( ( RULE_STRING ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:4296:1: ( RULE_STRING )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:4296:1: ( RULE_STRING )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:4297:1: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGenerationConfigurationAccess().getNsuriSTRINGTerminalRuleCall_3_1_0()); 
            }
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__GenerationConfiguration__NsuriAssignment_3_18492); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGenerationConfigurationAccess().getNsuriSTRINGTerminalRuleCall_3_1_0()); 
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
    // $ANTLR end "rule__GenerationConfiguration__NsuriAssignment_3_1"


    // $ANTLR start "rule__Generation__OwnedDataGenerationConfAssignment_3"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:4306:1: rule__Generation__OwnedDataGenerationConfAssignment_3 : ( ruleGData ) ;
    public final void rule__Generation__OwnedDataGenerationConfAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:4310:1: ( ( ruleGData ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:4311:1: ( ruleGData )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:4311:1: ( ruleGData )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:4312:1: ruleGData
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGenerationAccess().getOwnedDataGenerationConfGDataParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_ruleGData_in_rule__Generation__OwnedDataGenerationConfAssignment_38523);
            ruleGData();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGenerationAccess().getOwnedDataGenerationConfGDataParserRuleCall_3_0()); 
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
    // $ANTLR end "rule__Generation__OwnedDataGenerationConfAssignment_3"


    // $ANTLR start "rule__Generation__OwnedExtensionGenConfAssignment_4"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:4321:1: rule__Generation__OwnedExtensionGenConfAssignment_4 : ( ruleExtensionGeneratrionConfiguration ) ;
    public final void rule__Generation__OwnedExtensionGenConfAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:4325:1: ( ( ruleExtensionGeneratrionConfiguration ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:4326:1: ( ruleExtensionGeneratrionConfiguration )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:4326:1: ( ruleExtensionGeneratrionConfiguration )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:4327:1: ruleExtensionGeneratrionConfiguration
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGenerationAccess().getOwnedExtensionGenConfExtensionGeneratrionConfigurationParserRuleCall_4_0()); 
            }
            pushFollow(FOLLOW_ruleExtensionGeneratrionConfiguration_in_rule__Generation__OwnedExtensionGenConfAssignment_48554);
            ruleExtensionGeneratrionConfiguration();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGenerationAccess().getOwnedExtensionGenConfExtensionGeneratrionConfigurationParserRuleCall_4_0()); 
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
    // $ANTLR end "rule__Generation__OwnedExtensionGenConfAssignment_4"


    // $ANTLR start "rule__GData__ModelAssignment_3_0_2"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:4336:1: rule__GData__ModelAssignment_3_0_2 : ( ruleEBoolean ) ;
    public final void rule__GData__ModelAssignment_3_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:4340:1: ( ( ruleEBoolean ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:4341:1: ( ruleEBoolean )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:4341:1: ( ruleEBoolean )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:4342:1: ruleEBoolean
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGDataAccess().getModelEBooleanParserRuleCall_3_0_2_0()); 
            }
            pushFollow(FOLLOW_ruleEBoolean_in_rule__GData__ModelAssignment_3_0_28585);
            ruleEBoolean();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGDataAccess().getModelEBooleanParserRuleCall_3_0_2_0()); 
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
    // $ANTLR end "rule__GData__ModelAssignment_3_0_2"


    // $ANTLR start "rule__GData__EditAssignment_3_1_2"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:4351:1: rule__GData__EditAssignment_3_1_2 : ( ruleEBoolean ) ;
    public final void rule__GData__EditAssignment_3_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:4355:1: ( ( ruleEBoolean ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:4356:1: ( ruleEBoolean )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:4356:1: ( ruleEBoolean )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:4357:1: ruleEBoolean
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGDataAccess().getEditEBooleanParserRuleCall_3_1_2_0()); 
            }
            pushFollow(FOLLOW_ruleEBoolean_in_rule__GData__EditAssignment_3_1_28616);
            ruleEBoolean();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGDataAccess().getEditEBooleanParserRuleCall_3_1_2_0()); 
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
    // $ANTLR end "rule__GData__EditAssignment_3_1_2"


    // $ANTLR start "rule__GData__EditorAssignment_3_2_2"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:4366:1: rule__GData__EditorAssignment_3_2_2 : ( ruleEBoolean ) ;
    public final void rule__GData__EditorAssignment_3_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:4370:1: ( ( ruleEBoolean ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:4371:1: ( ruleEBoolean )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:4371:1: ( ruleEBoolean )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:4372:1: ruleEBoolean
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGDataAccess().getEditorEBooleanParserRuleCall_3_2_2_0()); 
            }
            pushFollow(FOLLOW_ruleEBoolean_in_rule__GData__EditorAssignment_3_2_28647);
            ruleEBoolean();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGDataAccess().getEditorEBooleanParserRuleCall_3_2_2_0()); 
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
    // $ANTLR end "rule__GData__EditorAssignment_3_2_2"


    // $ANTLR start "rule__GData__TestAssignment_3_3_2"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:4381:1: rule__GData__TestAssignment_3_3_2 : ( ruleEBoolean ) ;
    public final void rule__GData__TestAssignment_3_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:4385:1: ( ( ruleEBoolean ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:4386:1: ( ruleEBoolean )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:4386:1: ( ruleEBoolean )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:4387:1: ruleEBoolean
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGDataAccess().getTestEBooleanParserRuleCall_3_3_2_0()); 
            }
            pushFollow(FOLLOW_ruleEBoolean_in_rule__GData__TestAssignment_3_3_28678);
            ruleEBoolean();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGDataAccess().getTestEBooleanParserRuleCall_3_3_2_0()); 
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
    // $ANTLR end "rule__GData__TestAssignment_3_3_2"


    // $ANTLR start "rule__GData__JavaDocAssignment_3_4_2"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:4396:1: rule__GData__JavaDocAssignment_3_4_2 : ( ruleEBoolean ) ;
    public final void rule__GData__JavaDocAssignment_3_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:4400:1: ( ( ruleEBoolean ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:4401:1: ( ruleEBoolean )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:4401:1: ( ruleEBoolean )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:4402:1: ruleEBoolean
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGDataAccess().getJavaDocEBooleanParserRuleCall_3_4_2_0()); 
            }
            pushFollow(FOLLOW_ruleEBoolean_in_rule__GData__JavaDocAssignment_3_4_28709);
            ruleEBoolean();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGDataAccess().getJavaDocEBooleanParserRuleCall_3_4_2_0()); 
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
    // $ANTLR end "rule__GData__JavaDocAssignment_3_4_2"


    // $ANTLR start "rule__GData__OverwriteEcoreAssignment_3_5_2"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:4411:1: rule__GData__OverwriteEcoreAssignment_3_5_2 : ( ruleEBoolean ) ;
    public final void rule__GData__OverwriteEcoreAssignment_3_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:4415:1: ( ( ruleEBoolean ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:4416:1: ( ruleEBoolean )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:4416:1: ( ruleEBoolean )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:4417:1: ruleEBoolean
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGDataAccess().getOverwriteEcoreEBooleanParserRuleCall_3_5_2_0()); 
            }
            pushFollow(FOLLOW_ruleEBoolean_in_rule__GData__OverwriteEcoreAssignment_3_5_28740);
            ruleEBoolean();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGDataAccess().getOverwriteEcoreEBooleanParserRuleCall_3_5_2_0()); 
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
    // $ANTLR end "rule__GData__OverwriteEcoreAssignment_3_5_2"


    // $ANTLR start "rule__DiagramGenerationConfiguration__OverwriteVSMAssignment_3_2"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:4426:1: rule__DiagramGenerationConfiguration__OverwriteVSMAssignment_3_2 : ( ruleEBoolean ) ;
    public final void rule__DiagramGenerationConfiguration__OverwriteVSMAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:4430:1: ( ( ruleEBoolean ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:4431:1: ( ruleEBoolean )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:4431:1: ( ruleEBoolean )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:4432:1: ruleEBoolean
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDiagramGenerationConfigurationAccess().getOverwriteVSMEBooleanParserRuleCall_3_2_0()); 
            }
            pushFollow(FOLLOW_ruleEBoolean_in_rule__DiagramGenerationConfiguration__OverwriteVSMAssignment_3_28771);
            ruleEBoolean();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDiagramGenerationConfigurationAccess().getOverwriteVSMEBooleanParserRuleCall_3_2_0()); 
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
    // $ANTLR end "rule__DiagramGenerationConfiguration__OverwriteVSMAssignment_3_2"


    // $ANTLR start "rule__DocumentationGenerationConfiguration__EcoreToHtmlAssignment_3_1"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:4441:1: rule__DocumentationGenerationConfiguration__EcoreToHtmlAssignment_3_1 : ( ruleEBoolean ) ;
    public final void rule__DocumentationGenerationConfiguration__EcoreToHtmlAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:4445:1: ( ( ruleEBoolean ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:4446:1: ( ruleEBoolean )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:4446:1: ( ruleEBoolean )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:4447:1: ruleEBoolean
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDocumentationGenerationConfigurationAccess().getEcoreToHtmlEBooleanParserRuleCall_3_1_0()); 
            }
            pushFollow(FOLLOW_ruleEBoolean_in_rule__DocumentationGenerationConfiguration__EcoreToHtmlAssignment_3_18802);
            ruleEBoolean();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDocumentationGenerationConfigurationAccess().getEcoreToHtmlEBooleanParserRuleCall_3_1_0()); 
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
    // $ANTLR end "rule__DocumentationGenerationConfiguration__EcoreToHtmlAssignment_3_1"


    // $ANTLR start "rule__ModelsAirdGenerationConfiguration__GenRepresentationsAssignment_3_2"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:4456:1: rule__ModelsAirdGenerationConfiguration__GenRepresentationsAssignment_3_2 : ( ruleEBoolean ) ;
    public final void rule__ModelsAirdGenerationConfiguration__GenRepresentationsAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:4460:1: ( ( ruleEBoolean ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:4461:1: ( ruleEBoolean )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:4461:1: ( ruleEBoolean )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:4462:1: ruleEBoolean
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelsAirdGenerationConfigurationAccess().getGenRepresentationsEBooleanParserRuleCall_3_2_0()); 
            }
            pushFollow(FOLLOW_ruleEBoolean_in_rule__ModelsAirdGenerationConfiguration__GenRepresentationsAssignment_3_28833);
            ruleEBoolean();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelsAirdGenerationConfigurationAccess().getGenRepresentationsEBooleanParserRuleCall_3_2_0()); 
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
    // $ANTLR end "rule__ModelsAirdGenerationConfiguration__GenRepresentationsAssignment_3_2"


    // $ANTLR start "rule__Release__ViewpointVersionAssignment_3_2"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:4471:1: rule__Release__ViewpointVersionAssignment_3_2 : ( ruleVersion ) ;
    public final void rule__Release__ViewpointVersionAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:4475:1: ( ( ruleVersion ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:4476:1: ( ruleVersion )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:4476:1: ( ruleVersion )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:4477:1: ruleVersion
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReleaseAccess().getViewpointVersionVersionParserRuleCall_3_2_0()); 
            }
            pushFollow(FOLLOW_ruleVersion_in_rule__Release__ViewpointVersionAssignment_3_28864);
            ruleVersion();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getReleaseAccess().getViewpointVersionVersionParserRuleCall_3_2_0()); 
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
    // $ANTLR end "rule__Release__ViewpointVersionAssignment_3_2"


    // $ANTLR start "rule__Release__ViewpointDescriptionAssignment_4_2"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:4486:1: rule__Release__ViewpointDescriptionAssignment_4_2 : ( ruleEString ) ;
    public final void rule__Release__ViewpointDescriptionAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:4490:1: ( ( ruleEString ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:4491:1: ( ruleEString )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:4491:1: ( ruleEString )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:4492:1: ruleEString
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReleaseAccess().getViewpointDescriptionEStringParserRuleCall_4_2_0()); 
            }
            pushFollow(FOLLOW_ruleEString_in_rule__Release__ViewpointDescriptionAssignment_4_28895);
            ruleEString();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getReleaseAccess().getViewpointDescriptionEStringParserRuleCall_4_2_0()); 
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
    // $ANTLR end "rule__Release__ViewpointDescriptionAssignment_4_2"


    // $ANTLR start "rule__Release__RequiredExecutionEnvironmentAssignment_5_3_0"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:4501:1: rule__Release__RequiredExecutionEnvironmentAssignment_5_3_0 : ( RULE_STRING ) ;
    public final void rule__Release__RequiredExecutionEnvironmentAssignment_5_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:4505:1: ( ( RULE_STRING ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:4506:1: ( RULE_STRING )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:4506:1: ( RULE_STRING )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:4507:1: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReleaseAccess().getRequiredExecutionEnvironmentSTRINGTerminalRuleCall_5_3_0_0()); 
            }
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Release__RequiredExecutionEnvironmentAssignment_5_3_08926); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getReleaseAccess().getRequiredExecutionEnvironmentSTRINGTerminalRuleCall_5_3_0_0()); 
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
    // $ANTLR end "rule__Release__RequiredExecutionEnvironmentAssignment_5_3_0"


    // $ANTLR start "rule__Release__RequiredExecutionEnvironmentAssignment_5_3_1_1"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:4516:1: rule__Release__RequiredExecutionEnvironmentAssignment_5_3_1_1 : ( RULE_STRING ) ;
    public final void rule__Release__RequiredExecutionEnvironmentAssignment_5_3_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:4520:1: ( ( RULE_STRING ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:4521:1: ( RULE_STRING )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:4521:1: ( RULE_STRING )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.conf.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpconf.g:4522:1: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReleaseAccess().getRequiredExecutionEnvironmentSTRINGTerminalRuleCall_5_3_1_1_0()); 
            }
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Release__RequiredExecutionEnvironmentAssignment_5_3_1_18957); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getReleaseAccess().getRequiredExecutionEnvironmentSTRINGTerminalRuleCall_5_3_1_1_0()); 
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
    // $ANTLR end "rule__Release__RequiredExecutionEnvironmentAssignment_5_3_1_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleConfiguration_in_entryRuleConfiguration67 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConfiguration74 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Configuration__Group__0_in_ruleConfiguration100 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConfigurationElement_in_entryRuleConfigurationElement127 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConfigurationElement134 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConfigurationElement__Alternatives_in_ruleConfigurationElement160 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTargetApplication_in_entryRuleTargetApplication187 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTargetApplication194 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TargetApplication__Group__0_in_ruleTargetApplication220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGenerationConfiguration_in_entryRuleGenerationConfiguration247 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGenerationConfiguration254 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GenerationConfiguration__Group__0_in_ruleGenerationConfiguration280 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGeneration_in_entryRuleGeneration307 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGeneration314 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Generation__Group__0_in_ruleGeneration340 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGData_in_entryRuleGData367 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGData374 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GData__Group__0_in_ruleGData400 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExtensionGeneratrionConfiguration_in_entryRuleExtensionGeneratrionConfiguration427 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExtensionGeneratrionConfiguration434 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExtensionGeneratrionConfiguration__Alternatives_in_ruleExtensionGeneratrionConfiguration460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDiagramGenerationConfiguration_in_entryRuleDiagramGenerationConfiguration487 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDiagramGenerationConfiguration494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DiagramGenerationConfiguration__Group__0_in_ruleDiagramGenerationConfiguration520 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDocumentationGenerationConfiguration_in_entryRuleDocumentationGenerationConfiguration547 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDocumentationGenerationConfiguration554 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DocumentationGenerationConfiguration__Group__0_in_ruleDocumentationGenerationConfiguration580 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModelsAirdGenerationConfiguration_in_entryRuleModelsAirdGenerationConfiguration607 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModelsAirdGenerationConfiguration614 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModelsAirdGenerationConfiguration__Group__0_in_ruleModelsAirdGenerationConfiguration640 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRelease_in_entryRuleRelease667 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRelease674 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Release__Group__0_in_ruleRelease700 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVersion_in_entryRuleVersion727 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVersion734 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Version__Group__0_in_ruleVersion760 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifier_in_entryRuleQualifier787 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifier794 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Qualifier__Group__0_in_ruleQualifier820 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEString_in_entryRuleEString847 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEString854 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EString__Alternatives_in_ruleEString880 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFQN_in_entryRuleFQN907 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFQN914 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FQN__Group__0_in_ruleFQN940 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEBoolean_in_entryRuleEBoolean967 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEBoolean974 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EBoolean__Alternatives_in_ruleEBoolean1000 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTargetApplication_in_rule__ConfigurationElement__Alternatives1038 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGenerationConfiguration_in_rule__ConfigurationElement__Alternatives1055 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGeneration_in_rule__ConfigurationElement__Alternatives1072 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRelease_in_rule__ConfigurationElement__Alternatives1089 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDiagramGenerationConfiguration_in_rule__ExtensionGeneratrionConfiguration__Alternatives1121 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDocumentationGenerationConfiguration_in_rule__ExtensionGeneratrionConfiguration__Alternatives1138 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModelsAirdGenerationConfiguration_in_rule__ExtensionGeneratrionConfiguration__Alternatives1155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Qualifier__Alternatives_01187 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Qualifier__Alternatives_01204 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__Qualifier__Alternatives_01222 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Qualifier__Alternatives_11256 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Qualifier__Alternatives_11273 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__Qualifier__Alternatives_11291 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__Qualifier__Alternatives_11311 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__EString__Alternatives1345 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__EString__Alternatives1362 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__EBoolean__Alternatives1395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__EBoolean__Alternatives1415 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Configuration__Group__0__Impl_in_rule__Configuration__Group__01447 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__Configuration__Group__1_in_rule__Configuration__Group__01450 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Configuration__Group__1__Impl_in_rule__Configuration__Group__11508 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Configuration__Group__2_in_rule__Configuration__Group__11511 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Configuration__Group__1__Impl1539 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Configuration__Group__2__Impl_in_rule__Configuration__Group__21570 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__Configuration__Group__3_in_rule__Configuration__Group__21573 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Configuration__NameAssignment_2_in_rule__Configuration__Group__2__Impl1600 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Configuration__Group__3__Impl_in_rule__Configuration__Group__31630 = new BitSet(new long[]{0x00000040002E0000L});
    public static final BitSet FOLLOW_rule__Configuration__Group__4_in_rule__Configuration__Group__31633 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Configuration__Group__3__Impl1661 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Configuration__Group__4__Impl_in_rule__Configuration__Group__41692 = new BitSet(new long[]{0x00000040002E0000L});
    public static final BitSet FOLLOW_rule__Configuration__Group__5_in_rule__Configuration__Group__41695 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Configuration__VpConfigurationElementsAssignment_4_in_rule__Configuration__Group__4__Impl1722 = new BitSet(new long[]{0x00000040002C0002L});
    public static final BitSet FOLLOW_rule__Configuration__Group__5__Impl_in_rule__Configuration__Group__51753 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Configuration__Group__5__Impl1781 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TargetApplication__Group__0__Impl_in_rule__TargetApplication__Group__01824 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__TargetApplication__Group__1_in_rule__TargetApplication__Group__01827 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TargetApplication__Group__1__Impl_in_rule__TargetApplication__Group__11885 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_rule__TargetApplication__Group__2_in_rule__TargetApplication__Group__11888 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__TargetApplication__Group__1__Impl1916 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TargetApplication__Group__2__Impl_in_rule__TargetApplication__Group__21947 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TargetApplication__TypeAssignment_2_in_rule__TargetApplication__Group__2__Impl1974 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GenerationConfiguration__Group__0__Impl_in_rule__GenerationConfiguration__Group__02010 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__GenerationConfiguration__Group__1_in_rule__GenerationConfiguration__Group__02013 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GenerationConfiguration__Group__1__Impl_in_rule__GenerationConfiguration__Group__12071 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__GenerationConfiguration__Group__2_in_rule__GenerationConfiguration__Group__12074 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__GenerationConfiguration__Group__1__Impl2102 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GenerationConfiguration__Group__2__Impl_in_rule__GenerationConfiguration__Group__22133 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__GenerationConfiguration__Group__3_in_rule__GenerationConfiguration__Group__22136 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GenerationConfiguration__ProjectNameAssignment_2_in_rule__GenerationConfiguration__Group__2__Impl2163 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GenerationConfiguration__Group__3__Impl_in_rule__GenerationConfiguration__Group__32193 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GenerationConfiguration__Group_3__0_in_rule__GenerationConfiguration__Group__3__Impl2220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GenerationConfiguration__Group_3__0__Impl_in_rule__GenerationConfiguration__Group_3__02259 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__GenerationConfiguration__Group_3__1_in_rule__GenerationConfiguration__Group_3__02262 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__GenerationConfiguration__Group_3__0__Impl2290 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GenerationConfiguration__Group_3__1__Impl_in_rule__GenerationConfiguration__Group_3__12321 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GenerationConfiguration__NsuriAssignment_3_1_in_rule__GenerationConfiguration__Group_3__1__Impl2348 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Generation__Group__0__Impl_in_rule__Generation__Group__02382 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__Generation__Group__1_in_rule__Generation__Group__02385 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Generation__Group__1__Impl_in_rule__Generation__Group__12443 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__Generation__Group__2_in_rule__Generation__Group__12446 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Generation__Group__1__Impl2474 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Generation__Group__2__Impl_in_rule__Generation__Group__22505 = new BitSet(new long[]{0x0000001500420000L});
    public static final BitSet FOLLOW_rule__Generation__Group__3_in_rule__Generation__Group__22508 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Generation__Group__2__Impl2536 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Generation__Group__3__Impl_in_rule__Generation__Group__32567 = new BitSet(new long[]{0x0000001500420000L});
    public static final BitSet FOLLOW_rule__Generation__Group__4_in_rule__Generation__Group__32570 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Generation__OwnedDataGenerationConfAssignment_3_in_rule__Generation__Group__3__Impl2597 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Generation__Group__4__Impl_in_rule__Generation__Group__42628 = new BitSet(new long[]{0x0000001500420000L});
    public static final BitSet FOLLOW_rule__Generation__Group__5_in_rule__Generation__Group__42631 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Generation__OwnedExtensionGenConfAssignment_4_in_rule__Generation__Group__4__Impl2658 = new BitSet(new long[]{0x0000001500000002L});
    public static final BitSet FOLLOW_rule__Generation__Group__5__Impl_in_rule__Generation__Group__52689 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Generation__Group__5__Impl2717 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GData__Group__0__Impl_in_rule__GData__Group__02760 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__GData__Group__1_in_rule__GData__Group__02763 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GData__Group__1__Impl_in_rule__GData__Group__12821 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__GData__Group__2_in_rule__GData__Group__12824 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__GData__Group__1__Impl2852 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GData__Group__2__Impl_in_rule__GData__Group__22883 = new BitSet(new long[]{0x00000000FA000000L});
    public static final BitSet FOLLOW_rule__GData__Group__3_in_rule__GData__Group__22886 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__GData__Group__2__Impl2914 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GData__Group__3__Impl_in_rule__GData__Group__32945 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__GData__Group__4_in_rule__GData__Group__32948 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GData__Group_3__0_in_rule__GData__Group__3__Impl2975 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GData__Group__4__Impl_in_rule__GData__Group__43005 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__GData__Group__4__Impl3033 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GData__Group_3__0__Impl_in_rule__GData__Group_3__03074 = new BitSet(new long[]{0x00000000FA000000L});
    public static final BitSet FOLLOW_rule__GData__Group_3__1_in_rule__GData__Group_3__03077 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GData__Group_3_0__0_in_rule__GData__Group_3__0__Impl3104 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GData__Group_3__1__Impl_in_rule__GData__Group_3__13135 = new BitSet(new long[]{0x00000000FA000000L});
    public static final BitSet FOLLOW_rule__GData__Group_3__2_in_rule__GData__Group_3__13138 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GData__Group_3_1__0_in_rule__GData__Group_3__1__Impl3165 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GData__Group_3__2__Impl_in_rule__GData__Group_3__23196 = new BitSet(new long[]{0x00000000FA000000L});
    public static final BitSet FOLLOW_rule__GData__Group_3__3_in_rule__GData__Group_3__23199 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GData__Group_3_2__0_in_rule__GData__Group_3__2__Impl3226 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GData__Group_3__3__Impl_in_rule__GData__Group_3__33257 = new BitSet(new long[]{0x00000000FA000000L});
    public static final BitSet FOLLOW_rule__GData__Group_3__4_in_rule__GData__Group_3__33260 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GData__Group_3_3__0_in_rule__GData__Group_3__3__Impl3287 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GData__Group_3__4__Impl_in_rule__GData__Group_3__43318 = new BitSet(new long[]{0x00000000FA000000L});
    public static final BitSet FOLLOW_rule__GData__Group_3__5_in_rule__GData__Group_3__43321 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GData__Group_3_4__0_in_rule__GData__Group_3__4__Impl3348 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GData__Group_3__5__Impl_in_rule__GData__Group_3__53379 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GData__Group_3_5__0_in_rule__GData__Group_3__5__Impl3406 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GData__Group_3_0__0__Impl_in_rule__GData__Group_3_0__03449 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__GData__Group_3_0__1_in_rule__GData__Group_3_0__03452 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__GData__Group_3_0__0__Impl3480 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GData__Group_3_0__1__Impl_in_rule__GData__Group_3_0__13511 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_rule__GData__Group_3_0__2_in_rule__GData__Group_3_0__13514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__GData__Group_3_0__1__Impl3542 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GData__Group_3_0__2__Impl_in_rule__GData__Group_3_0__23573 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GData__ModelAssignment_3_0_2_in_rule__GData__Group_3_0__2__Impl3600 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GData__Group_3_1__0__Impl_in_rule__GData__Group_3_1__03636 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__GData__Group_3_1__1_in_rule__GData__Group_3_1__03639 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__GData__Group_3_1__0__Impl3667 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GData__Group_3_1__1__Impl_in_rule__GData__Group_3_1__13698 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_rule__GData__Group_3_1__2_in_rule__GData__Group_3_1__13701 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__GData__Group_3_1__1__Impl3729 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GData__Group_3_1__2__Impl_in_rule__GData__Group_3_1__23760 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GData__EditAssignment_3_1_2_in_rule__GData__Group_3_1__2__Impl3787 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GData__Group_3_2__0__Impl_in_rule__GData__Group_3_2__03823 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__GData__Group_3_2__1_in_rule__GData__Group_3_2__03826 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__GData__Group_3_2__0__Impl3854 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GData__Group_3_2__1__Impl_in_rule__GData__Group_3_2__13885 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_rule__GData__Group_3_2__2_in_rule__GData__Group_3_2__13888 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__GData__Group_3_2__1__Impl3916 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GData__Group_3_2__2__Impl_in_rule__GData__Group_3_2__23947 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GData__EditorAssignment_3_2_2_in_rule__GData__Group_3_2__2__Impl3974 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GData__Group_3_3__0__Impl_in_rule__GData__Group_3_3__04010 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__GData__Group_3_3__1_in_rule__GData__Group_3_3__04013 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__GData__Group_3_3__0__Impl4041 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GData__Group_3_3__1__Impl_in_rule__GData__Group_3_3__14072 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_rule__GData__Group_3_3__2_in_rule__GData__Group_3_3__14075 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__GData__Group_3_3__1__Impl4103 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GData__Group_3_3__2__Impl_in_rule__GData__Group_3_3__24134 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GData__TestAssignment_3_3_2_in_rule__GData__Group_3_3__2__Impl4161 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GData__Group_3_4__0__Impl_in_rule__GData__Group_3_4__04197 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__GData__Group_3_4__1_in_rule__GData__Group_3_4__04200 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__GData__Group_3_4__0__Impl4228 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GData__Group_3_4__1__Impl_in_rule__GData__Group_3_4__14259 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_rule__GData__Group_3_4__2_in_rule__GData__Group_3_4__14262 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__GData__Group_3_4__1__Impl4290 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GData__Group_3_4__2__Impl_in_rule__GData__Group_3_4__24321 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GData__JavaDocAssignment_3_4_2_in_rule__GData__Group_3_4__2__Impl4348 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GData__Group_3_5__0__Impl_in_rule__GData__Group_3_5__04384 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__GData__Group_3_5__1_in_rule__GData__Group_3_5__04387 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__GData__Group_3_5__0__Impl4415 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GData__Group_3_5__1__Impl_in_rule__GData__Group_3_5__14446 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_rule__GData__Group_3_5__2_in_rule__GData__Group_3_5__14449 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__GData__Group_3_5__1__Impl4477 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GData__Group_3_5__2__Impl_in_rule__GData__Group_3_5__24508 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GData__OverwriteEcoreAssignment_3_5_2_in_rule__GData__Group_3_5__2__Impl4535 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DiagramGenerationConfiguration__Group__0__Impl_in_rule__DiagramGenerationConfiguration__Group__04571 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__DiagramGenerationConfiguration__Group__1_in_rule__DiagramGenerationConfiguration__Group__04574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DiagramGenerationConfiguration__Group__1__Impl_in_rule__DiagramGenerationConfiguration__Group__14632 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__DiagramGenerationConfiguration__Group__2_in_rule__DiagramGenerationConfiguration__Group__14635 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__DiagramGenerationConfiguration__Group__1__Impl4663 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DiagramGenerationConfiguration__Group__2__Impl_in_rule__DiagramGenerationConfiguration__Group__24694 = new BitSet(new long[]{0x0000000201000000L});
    public static final BitSet FOLLOW_rule__DiagramGenerationConfiguration__Group__3_in_rule__DiagramGenerationConfiguration__Group__24697 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__DiagramGenerationConfiguration__Group__2__Impl4725 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DiagramGenerationConfiguration__Group__3__Impl_in_rule__DiagramGenerationConfiguration__Group__34756 = new BitSet(new long[]{0x0000000201000000L});
    public static final BitSet FOLLOW_rule__DiagramGenerationConfiguration__Group__4_in_rule__DiagramGenerationConfiguration__Group__34759 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DiagramGenerationConfiguration__Group_3__0_in_rule__DiagramGenerationConfiguration__Group__3__Impl4786 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DiagramGenerationConfiguration__Group__4__Impl_in_rule__DiagramGenerationConfiguration__Group__44817 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__DiagramGenerationConfiguration__Group__4__Impl4845 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DiagramGenerationConfiguration__Group_3__0__Impl_in_rule__DiagramGenerationConfiguration__Group_3__04886 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__DiagramGenerationConfiguration__Group_3__1_in_rule__DiagramGenerationConfiguration__Group_3__04889 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__DiagramGenerationConfiguration__Group_3__0__Impl4917 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DiagramGenerationConfiguration__Group_3__1__Impl_in_rule__DiagramGenerationConfiguration__Group_3__14948 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_rule__DiagramGenerationConfiguration__Group_3__2_in_rule__DiagramGenerationConfiguration__Group_3__14951 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__DiagramGenerationConfiguration__Group_3__1__Impl4979 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DiagramGenerationConfiguration__Group_3__2__Impl_in_rule__DiagramGenerationConfiguration__Group_3__25010 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DiagramGenerationConfiguration__OverwriteVSMAssignment_3_2_in_rule__DiagramGenerationConfiguration__Group_3__2__Impl5037 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DocumentationGenerationConfiguration__Group__0__Impl_in_rule__DocumentationGenerationConfiguration__Group__05073 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_rule__DocumentationGenerationConfiguration__Group__1_in_rule__DocumentationGenerationConfiguration__Group__05076 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DocumentationGenerationConfiguration__Group__1__Impl_in_rule__DocumentationGenerationConfiguration__Group__15134 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__DocumentationGenerationConfiguration__Group__2_in_rule__DocumentationGenerationConfiguration__Group__15137 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__DocumentationGenerationConfiguration__Group__1__Impl5165 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DocumentationGenerationConfiguration__Group__2__Impl_in_rule__DocumentationGenerationConfiguration__Group__25196 = new BitSet(new long[]{0x0000000801000000L});
    public static final BitSet FOLLOW_rule__DocumentationGenerationConfiguration__Group__3_in_rule__DocumentationGenerationConfiguration__Group__25199 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__DocumentationGenerationConfiguration__Group__2__Impl5227 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DocumentationGenerationConfiguration__Group__3__Impl_in_rule__DocumentationGenerationConfiguration__Group__35258 = new BitSet(new long[]{0x0000000801000000L});
    public static final BitSet FOLLOW_rule__DocumentationGenerationConfiguration__Group__4_in_rule__DocumentationGenerationConfiguration__Group__35261 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DocumentationGenerationConfiguration__Group_3__0_in_rule__DocumentationGenerationConfiguration__Group__3__Impl5288 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DocumentationGenerationConfiguration__Group__4__Impl_in_rule__DocumentationGenerationConfiguration__Group__45319 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__DocumentationGenerationConfiguration__Group__4__Impl5347 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DocumentationGenerationConfiguration__Group_3__0__Impl_in_rule__DocumentationGenerationConfiguration__Group_3__05388 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_rule__DocumentationGenerationConfiguration__Group_3__1_in_rule__DocumentationGenerationConfiguration__Group_3__05391 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__DocumentationGenerationConfiguration__Group_3__0__Impl5419 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DocumentationGenerationConfiguration__Group_3__1__Impl_in_rule__DocumentationGenerationConfiguration__Group_3__15450 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DocumentationGenerationConfiguration__EcoreToHtmlAssignment_3_1_in_rule__DocumentationGenerationConfiguration__Group_3__1__Impl5477 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModelsAirdGenerationConfiguration__Group__0__Impl_in_rule__ModelsAirdGenerationConfiguration__Group__05511 = new BitSet(new long[]{0x0000001500000000L});
    public static final BitSet FOLLOW_rule__ModelsAirdGenerationConfiguration__Group__1_in_rule__ModelsAirdGenerationConfiguration__Group__05514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModelsAirdGenerationConfiguration__Group__1__Impl_in_rule__ModelsAirdGenerationConfiguration__Group__15572 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__ModelsAirdGenerationConfiguration__Group__2_in_rule__ModelsAirdGenerationConfiguration__Group__15575 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__ModelsAirdGenerationConfiguration__Group__1__Impl5603 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModelsAirdGenerationConfiguration__Group__2__Impl_in_rule__ModelsAirdGenerationConfiguration__Group__25634 = new BitSet(new long[]{0x0000002001000000L});
    public static final BitSet FOLLOW_rule__ModelsAirdGenerationConfiguration__Group__3_in_rule__ModelsAirdGenerationConfiguration__Group__25637 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__ModelsAirdGenerationConfiguration__Group__2__Impl5665 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModelsAirdGenerationConfiguration__Group__3__Impl_in_rule__ModelsAirdGenerationConfiguration__Group__35696 = new BitSet(new long[]{0x0000002001000000L});
    public static final BitSet FOLLOW_rule__ModelsAirdGenerationConfiguration__Group__4_in_rule__ModelsAirdGenerationConfiguration__Group__35699 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModelsAirdGenerationConfiguration__Group_3__0_in_rule__ModelsAirdGenerationConfiguration__Group__3__Impl5726 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModelsAirdGenerationConfiguration__Group__4__Impl_in_rule__ModelsAirdGenerationConfiguration__Group__45757 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__ModelsAirdGenerationConfiguration__Group__4__Impl5785 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModelsAirdGenerationConfiguration__Group_3__0__Impl_in_rule__ModelsAirdGenerationConfiguration__Group_3__05826 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__ModelsAirdGenerationConfiguration__Group_3__1_in_rule__ModelsAirdGenerationConfiguration__Group_3__05829 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__ModelsAirdGenerationConfiguration__Group_3__0__Impl5857 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModelsAirdGenerationConfiguration__Group_3__1__Impl_in_rule__ModelsAirdGenerationConfiguration__Group_3__15888 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_rule__ModelsAirdGenerationConfiguration__Group_3__2_in_rule__ModelsAirdGenerationConfiguration__Group_3__15891 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__ModelsAirdGenerationConfiguration__Group_3__1__Impl5919 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModelsAirdGenerationConfiguration__Group_3__2__Impl_in_rule__ModelsAirdGenerationConfiguration__Group_3__25950 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModelsAirdGenerationConfiguration__GenRepresentationsAssignment_3_2_in_rule__ModelsAirdGenerationConfiguration__Group_3__2__Impl5977 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Release__Group__0__Impl_in_rule__Release__Group__06013 = new BitSet(new long[]{0x00000040002C0000L});
    public static final BitSet FOLLOW_rule__Release__Group__1_in_rule__Release__Group__06016 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Release__Group__1__Impl_in_rule__Release__Group__16074 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__Release__Group__2_in_rule__Release__Group__16077 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__Release__Group__1__Impl6105 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Release__Group__2__Impl_in_rule__Release__Group__26136 = new BitSet(new long[]{0x0000038000020000L});
    public static final BitSet FOLLOW_rule__Release__Group__3_in_rule__Release__Group__26139 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Release__Group__2__Impl6167 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Release__Group__3__Impl_in_rule__Release__Group__36198 = new BitSet(new long[]{0x0000038000020000L});
    public static final BitSet FOLLOW_rule__Release__Group__4_in_rule__Release__Group__36201 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Release__Group_3__0_in_rule__Release__Group__3__Impl6228 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Release__Group__4__Impl_in_rule__Release__Group__46259 = new BitSet(new long[]{0x0000038000020000L});
    public static final BitSet FOLLOW_rule__Release__Group__5_in_rule__Release__Group__46262 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Release__Group_4__0_in_rule__Release__Group__4__Impl6289 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Release__Group__5__Impl_in_rule__Release__Group__56320 = new BitSet(new long[]{0x0000038000020000L});
    public static final BitSet FOLLOW_rule__Release__Group__6_in_rule__Release__Group__56323 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Release__Group_5__0_in_rule__Release__Group__5__Impl6350 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Release__Group__6__Impl_in_rule__Release__Group__66381 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Release__Group__6__Impl6409 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Release__Group_3__0__Impl_in_rule__Release__Group_3__06454 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__Release__Group_3__1_in_rule__Release__Group_3__06457 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__Release__Group_3__0__Impl6485 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Release__Group_3__1__Impl_in_rule__Release__Group_3__16516 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Release__Group_3__2_in_rule__Release__Group_3__16519 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Release__Group_3__1__Impl6547 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Release__Group_3__2__Impl_in_rule__Release__Group_3__26578 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Release__ViewpointVersionAssignment_3_2_in_rule__Release__Group_3__2__Impl6605 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Release__Group_4__0__Impl_in_rule__Release__Group_4__06641 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__Release__Group_4__1_in_rule__Release__Group_4__06644 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__Release__Group_4__0__Impl6672 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Release__Group_4__1__Impl_in_rule__Release__Group_4__16703 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_rule__Release__Group_4__2_in_rule__Release__Group_4__16706 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Release__Group_4__1__Impl6734 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Release__Group_4__2__Impl_in_rule__Release__Group_4__26765 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Release__ViewpointDescriptionAssignment_4_2_in_rule__Release__Group_4__2__Impl6792 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Release__Group_5__0__Impl_in_rule__Release__Group_5__06828 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_rule__Release__Group_5__1_in_rule__Release__Group_5__06831 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__Release__Group_5__0__Impl6859 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Release__Group_5__1__Impl_in_rule__Release__Group_5__16890 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__Release__Group_5__2_in_rule__Release__Group_5__16893 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_rule__Release__Group_5__1__Impl6921 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Release__Group_5__2__Impl_in_rule__Release__Group_5__26952 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Release__Group_5__3_in_rule__Release__Group_5__26955 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Release__Group_5__2__Impl6983 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Release__Group_5__3__Impl_in_rule__Release__Group_5__37014 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Release__Group_5_3__0_in_rule__Release__Group_5__3__Impl7041 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Release__Group_5_3__0__Impl_in_rule__Release__Group_5_3__07079 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_rule__Release__Group_5_3__1_in_rule__Release__Group_5_3__07082 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Release__RequiredExecutionEnvironmentAssignment_5_3_0_in_rule__Release__Group_5_3__0__Impl7109 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Release__Group_5_3__1__Impl_in_rule__Release__Group_5_3__17139 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Release__Group_5_3_1__0_in_rule__Release__Group_5_3__1__Impl7166 = new BitSet(new long[]{0x0000080000000002L});
    public static final BitSet FOLLOW_rule__Release__Group_5_3_1__0__Impl_in_rule__Release__Group_5_3_1__07201 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Release__Group_5_3_1__1_in_rule__Release__Group_5_3_1__07204 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_rule__Release__Group_5_3_1__0__Impl7232 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Release__Group_5_3_1__1__Impl_in_rule__Release__Group_5_3_1__17263 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Release__RequiredExecutionEnvironmentAssignment_5_3_1_1_in_rule__Release__Group_5_3_1__1__Impl7290 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Version__Group__0__Impl_in_rule__Version__Group__07324 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_rule__Version__Group__1_in_rule__Version__Group__07327 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Version__Group__0__Impl7354 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Version__Group__1__Impl_in_rule__Version__Group__17383 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Version__Group_1__0_in_rule__Version__Group__1__Impl7410 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Version__Group_1__0__Impl_in_rule__Version__Group_1__07445 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Version__Group_1__1_in_rule__Version__Group_1__07448 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_rule__Version__Group_1__0__Impl7476 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Version__Group_1__1__Impl_in_rule__Version__Group_1__17507 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Version__Group_1_1__0_in_rule__Version__Group_1__1__Impl7534 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Version__Group_1_1__0__Impl_in_rule__Version__Group_1_1__07568 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_rule__Version__Group_1_1__1_in_rule__Version__Group_1_1__07571 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Version__Group_1_1__0__Impl7598 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Version__Group_1_1__1__Impl_in_rule__Version__Group_1_1__17627 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Version__Group_1_1_1__0_in_rule__Version__Group_1_1__1__Impl7654 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Version__Group_1_1_1__0__Impl_in_rule__Version__Group_1_1_1__07689 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Version__Group_1_1_1__1_in_rule__Version__Group_1_1_1__07692 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_rule__Version__Group_1_1_1__0__Impl7720 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Version__Group_1_1_1__1__Impl_in_rule__Version__Group_1_1_1__17751 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_rule__Version__Group_1_1_1__2_in_rule__Version__Group_1_1_1__17754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Version__Group_1_1_1__1__Impl7781 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Version__Group_1_1_1__2__Impl_in_rule__Version__Group_1_1_1__27810 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Version__Group_1_1_1_2__0_in_rule__Version__Group_1_1_1__2__Impl7837 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Version__Group_1_1_1_2__0__Impl_in_rule__Version__Group_1_1_1_2__07874 = new BitSet(new long[]{0x0000000000000830L});
    public static final BitSet FOLLOW_rule__Version__Group_1_1_1_2__1_in_rule__Version__Group_1_1_1_2__07877 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_rule__Version__Group_1_1_1_2__0__Impl7905 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Version__Group_1_1_1_2__1__Impl_in_rule__Version__Group_1_1_1_2__17936 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifier_in_rule__Version__Group_1_1_1_2__1__Impl7963 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Qualifier__Group__0__Impl_in_rule__Qualifier__Group__07996 = new BitSet(new long[]{0x0000000000001830L});
    public static final BitSet FOLLOW_rule__Qualifier__Group__1_in_rule__Qualifier__Group__07999 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Qualifier__Alternatives_0_in_rule__Qualifier__Group__0__Impl8026 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Qualifier__Group__1__Impl_in_rule__Qualifier__Group__18056 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Qualifier__Alternatives_1_in_rule__Qualifier__Group__1__Impl8083 = new BitSet(new long[]{0x0000000000001832L});
    public static final BitSet FOLLOW_rule__FQN__Group__0__Impl_in_rule__FQN__Group__08118 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_rule__FQN__Group__1_in_rule__FQN__Group__08121 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__FQN__Group__0__Impl8148 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FQN__Group__1__Impl_in_rule__FQN__Group__18177 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FQN__Group_1__0_in_rule__FQN__Group__1__Impl8204 = new BitSet(new long[]{0x0000100000000002L});
    public static final BitSet FOLLOW_rule__FQN__Group_1__0__Impl_in_rule__FQN__Group_1__08239 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__FQN__Group_1__1_in_rule__FQN__Group_1__08242 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_rule__FQN__Group_1__0__Impl8270 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FQN__Group_1__1__Impl_in_rule__FQN__Group_1__18301 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__FQN__Group_1__1__Impl8329 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFQN_in_rule__Configuration__NameAssignment_28368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConfigurationElement_in_rule__Configuration__VpConfigurationElementsAssignment_48399 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEString_in_rule__TargetApplication__TypeAssignment_28430 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFQN_in_rule__GenerationConfiguration__ProjectNameAssignment_28461 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__GenerationConfiguration__NsuriAssignment_3_18492 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGData_in_rule__Generation__OwnedDataGenerationConfAssignment_38523 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExtensionGeneratrionConfiguration_in_rule__Generation__OwnedExtensionGenConfAssignment_48554 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEBoolean_in_rule__GData__ModelAssignment_3_0_28585 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEBoolean_in_rule__GData__EditAssignment_3_1_28616 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEBoolean_in_rule__GData__EditorAssignment_3_2_28647 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEBoolean_in_rule__GData__TestAssignment_3_3_28678 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEBoolean_in_rule__GData__JavaDocAssignment_3_4_28709 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEBoolean_in_rule__GData__OverwriteEcoreAssignment_3_5_28740 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEBoolean_in_rule__DiagramGenerationConfiguration__OverwriteVSMAssignment_3_28771 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEBoolean_in_rule__DocumentationGenerationConfiguration__EcoreToHtmlAssignment_3_18802 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEBoolean_in_rule__ModelsAirdGenerationConfiguration__GenRepresentationsAssignment_3_28833 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVersion_in_rule__Release__ViewpointVersionAssignment_3_28864 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEString_in_rule__Release__ViewpointDescriptionAssignment_4_28895 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Release__RequiredExecutionEnvironmentAssignment_5_3_08926 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Release__RequiredExecutionEnvironmentAssignment_5_3_1_18957 = new BitSet(new long[]{0x0000000000000002L});

}
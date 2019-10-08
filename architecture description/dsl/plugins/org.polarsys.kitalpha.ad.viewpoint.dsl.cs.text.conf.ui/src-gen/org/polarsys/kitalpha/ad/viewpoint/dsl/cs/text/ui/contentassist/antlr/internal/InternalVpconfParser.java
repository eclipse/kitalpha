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
 * Copyright (c) 2017 Thales Global Services S.A.S.
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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'_'", "'-'", "'true'", "'false'", "'Configuration'", "'{'", "'}'", "'target'", "'project'", "'nsuri'", "'generation'", "'data'", "'('", "')'", "'Model'", "':'", "'Edit'", "'Editor'", "'Test'", "'Javadoc'", "'OverwriteEcore'", "'diagram'", "'OverwriteOdesign'", "'documentation'", "'EcoreToHtml:'", "'ecore'", "'aird'", "'release'", "'version'", "'description'", "'execution'", "'environments'", "','", "'view'", "'visible'", "'activable'", "'.'"
    };
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int RULE_ID=5;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=4;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalVpconfParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalVpconfParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalVpconfParser.tokenNames; }
    public String getGrammarFileName() { return "InternalVpconf.g"; }


     
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
    // InternalVpconf.g:68:1: entryRuleConfiguration : ruleConfiguration EOF ;
    public final void entryRuleConfiguration() throws RecognitionException {
        try {
            // InternalVpconf.g:69:1: ( ruleConfiguration EOF )
            // InternalVpconf.g:70:1: ruleConfiguration EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConfigurationRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleConfiguration();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConfigurationRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // InternalVpconf.g:77:1: ruleConfiguration : ( ( rule__Configuration__Group__0 ) ) ;
    public final void ruleConfiguration() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVpconf.g:81:2: ( ( ( rule__Configuration__Group__0 ) ) )
            // InternalVpconf.g:82:1: ( ( rule__Configuration__Group__0 ) )
            {
            // InternalVpconf.g:82:1: ( ( rule__Configuration__Group__0 ) )
            // InternalVpconf.g:83:1: ( rule__Configuration__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConfigurationAccess().getGroup()); 
            }
            // InternalVpconf.g:84:1: ( rule__Configuration__Group__0 )
            // InternalVpconf.g:84:2: rule__Configuration__Group__0
            {
            pushFollow(FOLLOW_2);
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
    // InternalVpconf.g:96:1: entryRuleConfigurationElement : ruleConfigurationElement EOF ;
    public final void entryRuleConfigurationElement() throws RecognitionException {
        try {
            // InternalVpconf.g:97:1: ( ruleConfigurationElement EOF )
            // InternalVpconf.g:98:1: ruleConfigurationElement EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConfigurationElementRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleConfigurationElement();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConfigurationElementRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // InternalVpconf.g:105:1: ruleConfigurationElement : ( ( rule__ConfigurationElement__Alternatives ) ) ;
    public final void ruleConfigurationElement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVpconf.g:109:2: ( ( ( rule__ConfigurationElement__Alternatives ) ) )
            // InternalVpconf.g:110:1: ( ( rule__ConfigurationElement__Alternatives ) )
            {
            // InternalVpconf.g:110:1: ( ( rule__ConfigurationElement__Alternatives ) )
            // InternalVpconf.g:111:1: ( rule__ConfigurationElement__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConfigurationElementAccess().getAlternatives()); 
            }
            // InternalVpconf.g:112:1: ( rule__ConfigurationElement__Alternatives )
            // InternalVpconf.g:112:2: rule__ConfigurationElement__Alternatives
            {
            pushFollow(FOLLOW_2);
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
    // InternalVpconf.g:124:1: entryRuleTargetApplication : ruleTargetApplication EOF ;
    public final void entryRuleTargetApplication() throws RecognitionException {
        try {
            // InternalVpconf.g:125:1: ( ruleTargetApplication EOF )
            // InternalVpconf.g:126:1: ruleTargetApplication EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTargetApplicationRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleTargetApplication();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTargetApplicationRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // InternalVpconf.g:133:1: ruleTargetApplication : ( ( rule__TargetApplication__Group__0 ) ) ;
    public final void ruleTargetApplication() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVpconf.g:137:2: ( ( ( rule__TargetApplication__Group__0 ) ) )
            // InternalVpconf.g:138:1: ( ( rule__TargetApplication__Group__0 ) )
            {
            // InternalVpconf.g:138:1: ( ( rule__TargetApplication__Group__0 ) )
            // InternalVpconf.g:139:1: ( rule__TargetApplication__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTargetApplicationAccess().getGroup()); 
            }
            // InternalVpconf.g:140:1: ( rule__TargetApplication__Group__0 )
            // InternalVpconf.g:140:2: rule__TargetApplication__Group__0
            {
            pushFollow(FOLLOW_2);
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
    // InternalVpconf.g:152:1: entryRuleGenerationConfiguration : ruleGenerationConfiguration EOF ;
    public final void entryRuleGenerationConfiguration() throws RecognitionException {
        try {
            // InternalVpconf.g:153:1: ( ruleGenerationConfiguration EOF )
            // InternalVpconf.g:154:1: ruleGenerationConfiguration EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGenerationConfigurationRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleGenerationConfiguration();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGenerationConfigurationRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // InternalVpconf.g:161:1: ruleGenerationConfiguration : ( ( rule__GenerationConfiguration__Group__0 ) ) ;
    public final void ruleGenerationConfiguration() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVpconf.g:165:2: ( ( ( rule__GenerationConfiguration__Group__0 ) ) )
            // InternalVpconf.g:166:1: ( ( rule__GenerationConfiguration__Group__0 ) )
            {
            // InternalVpconf.g:166:1: ( ( rule__GenerationConfiguration__Group__0 ) )
            // InternalVpconf.g:167:1: ( rule__GenerationConfiguration__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGenerationConfigurationAccess().getGroup()); 
            }
            // InternalVpconf.g:168:1: ( rule__GenerationConfiguration__Group__0 )
            // InternalVpconf.g:168:2: rule__GenerationConfiguration__Group__0
            {
            pushFollow(FOLLOW_2);
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
    // InternalVpconf.g:180:1: entryRuleGeneration : ruleGeneration EOF ;
    public final void entryRuleGeneration() throws RecognitionException {
        try {
            // InternalVpconf.g:181:1: ( ruleGeneration EOF )
            // InternalVpconf.g:182:1: ruleGeneration EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGenerationRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleGeneration();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGenerationRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // InternalVpconf.g:189:1: ruleGeneration : ( ( rule__Generation__Group__0 ) ) ;
    public final void ruleGeneration() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVpconf.g:193:2: ( ( ( rule__Generation__Group__0 ) ) )
            // InternalVpconf.g:194:1: ( ( rule__Generation__Group__0 ) )
            {
            // InternalVpconf.g:194:1: ( ( rule__Generation__Group__0 ) )
            // InternalVpconf.g:195:1: ( rule__Generation__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGenerationAccess().getGroup()); 
            }
            // InternalVpconf.g:196:1: ( rule__Generation__Group__0 )
            // InternalVpconf.g:196:2: rule__Generation__Group__0
            {
            pushFollow(FOLLOW_2);
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
    // InternalVpconf.g:208:1: entryRuleGData : ruleGData EOF ;
    public final void entryRuleGData() throws RecognitionException {
        try {
            // InternalVpconf.g:209:1: ( ruleGData EOF )
            // InternalVpconf.g:210:1: ruleGData EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGDataRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleGData();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGDataRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // InternalVpconf.g:217:1: ruleGData : ( ( rule__GData__Group__0 ) ) ;
    public final void ruleGData() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVpconf.g:221:2: ( ( ( rule__GData__Group__0 ) ) )
            // InternalVpconf.g:222:1: ( ( rule__GData__Group__0 ) )
            {
            // InternalVpconf.g:222:1: ( ( rule__GData__Group__0 ) )
            // InternalVpconf.g:223:1: ( rule__GData__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGDataAccess().getGroup()); 
            }
            // InternalVpconf.g:224:1: ( rule__GData__Group__0 )
            // InternalVpconf.g:224:2: rule__GData__Group__0
            {
            pushFollow(FOLLOW_2);
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
    // InternalVpconf.g:236:1: entryRuleExtensionGeneratrionConfiguration : ruleExtensionGeneratrionConfiguration EOF ;
    public final void entryRuleExtensionGeneratrionConfiguration() throws RecognitionException {
        try {
            // InternalVpconf.g:237:1: ( ruleExtensionGeneratrionConfiguration EOF )
            // InternalVpconf.g:238:1: ruleExtensionGeneratrionConfiguration EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExtensionGeneratrionConfigurationRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleExtensionGeneratrionConfiguration();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExtensionGeneratrionConfigurationRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // InternalVpconf.g:245:1: ruleExtensionGeneratrionConfiguration : ( ( rule__ExtensionGeneratrionConfiguration__Alternatives ) ) ;
    public final void ruleExtensionGeneratrionConfiguration() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVpconf.g:249:2: ( ( ( rule__ExtensionGeneratrionConfiguration__Alternatives ) ) )
            // InternalVpconf.g:250:1: ( ( rule__ExtensionGeneratrionConfiguration__Alternatives ) )
            {
            // InternalVpconf.g:250:1: ( ( rule__ExtensionGeneratrionConfiguration__Alternatives ) )
            // InternalVpconf.g:251:1: ( rule__ExtensionGeneratrionConfiguration__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExtensionGeneratrionConfigurationAccess().getAlternatives()); 
            }
            // InternalVpconf.g:252:1: ( rule__ExtensionGeneratrionConfiguration__Alternatives )
            // InternalVpconf.g:252:2: rule__ExtensionGeneratrionConfiguration__Alternatives
            {
            pushFollow(FOLLOW_2);
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
    // InternalVpconf.g:264:1: entryRuleDiagramGenerationConfiguration : ruleDiagramGenerationConfiguration EOF ;
    public final void entryRuleDiagramGenerationConfiguration() throws RecognitionException {
        try {
            // InternalVpconf.g:265:1: ( ruleDiagramGenerationConfiguration EOF )
            // InternalVpconf.g:266:1: ruleDiagramGenerationConfiguration EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDiagramGenerationConfigurationRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleDiagramGenerationConfiguration();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDiagramGenerationConfigurationRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // InternalVpconf.g:273:1: ruleDiagramGenerationConfiguration : ( ( rule__DiagramGenerationConfiguration__Group__0 ) ) ;
    public final void ruleDiagramGenerationConfiguration() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVpconf.g:277:2: ( ( ( rule__DiagramGenerationConfiguration__Group__0 ) ) )
            // InternalVpconf.g:278:1: ( ( rule__DiagramGenerationConfiguration__Group__0 ) )
            {
            // InternalVpconf.g:278:1: ( ( rule__DiagramGenerationConfiguration__Group__0 ) )
            // InternalVpconf.g:279:1: ( rule__DiagramGenerationConfiguration__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDiagramGenerationConfigurationAccess().getGroup()); 
            }
            // InternalVpconf.g:280:1: ( rule__DiagramGenerationConfiguration__Group__0 )
            // InternalVpconf.g:280:2: rule__DiagramGenerationConfiguration__Group__0
            {
            pushFollow(FOLLOW_2);
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
    // InternalVpconf.g:292:1: entryRuleDocumentationGenerationConfiguration : ruleDocumentationGenerationConfiguration EOF ;
    public final void entryRuleDocumentationGenerationConfiguration() throws RecognitionException {
        try {
            // InternalVpconf.g:293:1: ( ruleDocumentationGenerationConfiguration EOF )
            // InternalVpconf.g:294:1: ruleDocumentationGenerationConfiguration EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDocumentationGenerationConfigurationRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleDocumentationGenerationConfiguration();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDocumentationGenerationConfigurationRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // InternalVpconf.g:301:1: ruleDocumentationGenerationConfiguration : ( ( rule__DocumentationGenerationConfiguration__Group__0 ) ) ;
    public final void ruleDocumentationGenerationConfiguration() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVpconf.g:305:2: ( ( ( rule__DocumentationGenerationConfiguration__Group__0 ) ) )
            // InternalVpconf.g:306:1: ( ( rule__DocumentationGenerationConfiguration__Group__0 ) )
            {
            // InternalVpconf.g:306:1: ( ( rule__DocumentationGenerationConfiguration__Group__0 ) )
            // InternalVpconf.g:307:1: ( rule__DocumentationGenerationConfiguration__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDocumentationGenerationConfigurationAccess().getGroup()); 
            }
            // InternalVpconf.g:308:1: ( rule__DocumentationGenerationConfiguration__Group__0 )
            // InternalVpconf.g:308:2: rule__DocumentationGenerationConfiguration__Group__0
            {
            pushFollow(FOLLOW_2);
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
    // InternalVpconf.g:320:1: entryRuleModelsAirdGenerationConfiguration : ruleModelsAirdGenerationConfiguration EOF ;
    public final void entryRuleModelsAirdGenerationConfiguration() throws RecognitionException {
        try {
            // InternalVpconf.g:321:1: ( ruleModelsAirdGenerationConfiguration EOF )
            // InternalVpconf.g:322:1: ruleModelsAirdGenerationConfiguration EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelsAirdGenerationConfigurationRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleModelsAirdGenerationConfiguration();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelsAirdGenerationConfigurationRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // InternalVpconf.g:329:1: ruleModelsAirdGenerationConfiguration : ( ( rule__ModelsAirdGenerationConfiguration__Group__0 ) ) ;
    public final void ruleModelsAirdGenerationConfiguration() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVpconf.g:333:2: ( ( ( rule__ModelsAirdGenerationConfiguration__Group__0 ) ) )
            // InternalVpconf.g:334:1: ( ( rule__ModelsAirdGenerationConfiguration__Group__0 ) )
            {
            // InternalVpconf.g:334:1: ( ( rule__ModelsAirdGenerationConfiguration__Group__0 ) )
            // InternalVpconf.g:335:1: ( rule__ModelsAirdGenerationConfiguration__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelsAirdGenerationConfigurationAccess().getGroup()); 
            }
            // InternalVpconf.g:336:1: ( rule__ModelsAirdGenerationConfiguration__Group__0 )
            // InternalVpconf.g:336:2: rule__ModelsAirdGenerationConfiguration__Group__0
            {
            pushFollow(FOLLOW_2);
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
    // InternalVpconf.g:348:1: entryRuleRelease : ruleRelease EOF ;
    public final void entryRuleRelease() throws RecognitionException {
        try {
            // InternalVpconf.g:349:1: ( ruleRelease EOF )
            // InternalVpconf.g:350:1: ruleRelease EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReleaseRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleRelease();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getReleaseRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // InternalVpconf.g:357:1: ruleRelease : ( ( rule__Release__Group__0 ) ) ;
    public final void ruleRelease() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVpconf.g:361:2: ( ( ( rule__Release__Group__0 ) ) )
            // InternalVpconf.g:362:1: ( ( rule__Release__Group__0 ) )
            {
            // InternalVpconf.g:362:1: ( ( rule__Release__Group__0 ) )
            // InternalVpconf.g:363:1: ( rule__Release__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReleaseAccess().getGroup()); 
            }
            // InternalVpconf.g:364:1: ( rule__Release__Group__0 )
            // InternalVpconf.g:364:2: rule__Release__Group__0
            {
            pushFollow(FOLLOW_2);
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


    // $ANTLR start "entryRuleViewConfiguration"
    // InternalVpconf.g:376:1: entryRuleViewConfiguration : ruleViewConfiguration EOF ;
    public final void entryRuleViewConfiguration() throws RecognitionException {
        try {
            // InternalVpconf.g:377:1: ( ruleViewConfiguration EOF )
            // InternalVpconf.g:378:1: ruleViewConfiguration EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getViewConfigurationRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleViewConfiguration();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getViewConfigurationRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleViewConfiguration"


    // $ANTLR start "ruleViewConfiguration"
    // InternalVpconf.g:385:1: ruleViewConfiguration : ( ( rule__ViewConfiguration__Group__0 ) ) ;
    public final void ruleViewConfiguration() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVpconf.g:389:2: ( ( ( rule__ViewConfiguration__Group__0 ) ) )
            // InternalVpconf.g:390:1: ( ( rule__ViewConfiguration__Group__0 ) )
            {
            // InternalVpconf.g:390:1: ( ( rule__ViewConfiguration__Group__0 ) )
            // InternalVpconf.g:391:1: ( rule__ViewConfiguration__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getViewConfigurationAccess().getGroup()); 
            }
            // InternalVpconf.g:392:1: ( rule__ViewConfiguration__Group__0 )
            // InternalVpconf.g:392:2: rule__ViewConfiguration__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ViewConfiguration__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getViewConfigurationAccess().getGroup()); 
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
    // $ANTLR end "ruleViewConfiguration"


    // $ANTLR start "entryRuleVersion"
    // InternalVpconf.g:404:1: entryRuleVersion : ruleVersion EOF ;
    public final void entryRuleVersion() throws RecognitionException {
        try {
            // InternalVpconf.g:405:1: ( ruleVersion EOF )
            // InternalVpconf.g:406:1: ruleVersion EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVersionRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleVersion();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVersionRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // InternalVpconf.g:413:1: ruleVersion : ( ( rule__Version__Group__0 ) ) ;
    public final void ruleVersion() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVpconf.g:417:2: ( ( ( rule__Version__Group__0 ) ) )
            // InternalVpconf.g:418:1: ( ( rule__Version__Group__0 ) )
            {
            // InternalVpconf.g:418:1: ( ( rule__Version__Group__0 ) )
            // InternalVpconf.g:419:1: ( rule__Version__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVersionAccess().getGroup()); 
            }
            // InternalVpconf.g:420:1: ( rule__Version__Group__0 )
            // InternalVpconf.g:420:2: rule__Version__Group__0
            {
            pushFollow(FOLLOW_2);
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
    // InternalVpconf.g:432:1: entryRuleQualifier : ruleQualifier EOF ;
    public final void entryRuleQualifier() throws RecognitionException {
        try {
            // InternalVpconf.g:433:1: ( ruleQualifier EOF )
            // InternalVpconf.g:434:1: ruleQualifier EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifierRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleQualifier();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifierRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // InternalVpconf.g:441:1: ruleQualifier : ( ( rule__Qualifier__Group__0 ) ) ;
    public final void ruleQualifier() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVpconf.g:445:2: ( ( ( rule__Qualifier__Group__0 ) ) )
            // InternalVpconf.g:446:1: ( ( rule__Qualifier__Group__0 ) )
            {
            // InternalVpconf.g:446:1: ( ( rule__Qualifier__Group__0 ) )
            // InternalVpconf.g:447:1: ( rule__Qualifier__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifierAccess().getGroup()); 
            }
            // InternalVpconf.g:448:1: ( rule__Qualifier__Group__0 )
            // InternalVpconf.g:448:2: rule__Qualifier__Group__0
            {
            pushFollow(FOLLOW_2);
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
    // InternalVpconf.g:460:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // InternalVpconf.g:461:1: ( ruleEString EOF )
            // InternalVpconf.g:462:1: ruleEString EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEStringRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleEString();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEStringRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // InternalVpconf.g:469:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVpconf.g:473:2: ( ( ( rule__EString__Alternatives ) ) )
            // InternalVpconf.g:474:1: ( ( rule__EString__Alternatives ) )
            {
            // InternalVpconf.g:474:1: ( ( rule__EString__Alternatives ) )
            // InternalVpconf.g:475:1: ( rule__EString__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEStringAccess().getAlternatives()); 
            }
            // InternalVpconf.g:476:1: ( rule__EString__Alternatives )
            // InternalVpconf.g:476:2: rule__EString__Alternatives
            {
            pushFollow(FOLLOW_2);
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
    // InternalVpconf.g:488:1: entryRuleFQN : ruleFQN EOF ;
    public final void entryRuleFQN() throws RecognitionException {
        try {
            // InternalVpconf.g:489:1: ( ruleFQN EOF )
            // InternalVpconf.g:490:1: ruleFQN EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFQNRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleFQN();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFQNRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // InternalVpconf.g:497:1: ruleFQN : ( ( rule__FQN__Group__0 ) ) ;
    public final void ruleFQN() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVpconf.g:501:2: ( ( ( rule__FQN__Group__0 ) ) )
            // InternalVpconf.g:502:1: ( ( rule__FQN__Group__0 ) )
            {
            // InternalVpconf.g:502:1: ( ( rule__FQN__Group__0 ) )
            // InternalVpconf.g:503:1: ( rule__FQN__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFQNAccess().getGroup()); 
            }
            // InternalVpconf.g:504:1: ( rule__FQN__Group__0 )
            // InternalVpconf.g:504:2: rule__FQN__Group__0
            {
            pushFollow(FOLLOW_2);
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
    // InternalVpconf.g:516:1: entryRuleEBoolean : ruleEBoolean EOF ;
    public final void entryRuleEBoolean() throws RecognitionException {
        try {
            // InternalVpconf.g:517:1: ( ruleEBoolean EOF )
            // InternalVpconf.g:518:1: ruleEBoolean EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEBooleanRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleEBoolean();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEBooleanRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // InternalVpconf.g:525:1: ruleEBoolean : ( ( rule__EBoolean__Alternatives ) ) ;
    public final void ruleEBoolean() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVpconf.g:529:2: ( ( ( rule__EBoolean__Alternatives ) ) )
            // InternalVpconf.g:530:1: ( ( rule__EBoolean__Alternatives ) )
            {
            // InternalVpconf.g:530:1: ( ( rule__EBoolean__Alternatives ) )
            // InternalVpconf.g:531:1: ( rule__EBoolean__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEBooleanAccess().getAlternatives()); 
            }
            // InternalVpconf.g:532:1: ( rule__EBoolean__Alternatives )
            // InternalVpconf.g:532:2: rule__EBoolean__Alternatives
            {
            pushFollow(FOLLOW_2);
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
    // InternalVpconf.g:546:1: rule__ConfigurationElement__Alternatives : ( ( ruleTargetApplication ) | ( ruleGenerationConfiguration ) | ( ruleGeneration ) | ( ruleRelease ) | ( ruleViewConfiguration ) );
    public final void rule__ConfigurationElement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVpconf.g:550:1: ( ( ruleTargetApplication ) | ( ruleGenerationConfiguration ) | ( ruleGeneration ) | ( ruleRelease ) | ( ruleViewConfiguration ) )
            int alt1=5;
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
            case 44:
                {
                alt1=5;
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
                    // InternalVpconf.g:551:1: ( ruleTargetApplication )
                    {
                    // InternalVpconf.g:551:1: ( ruleTargetApplication )
                    // InternalVpconf.g:552:1: ruleTargetApplication
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getConfigurationElementAccess().getTargetApplicationParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_2);
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
                    // InternalVpconf.g:557:6: ( ruleGenerationConfiguration )
                    {
                    // InternalVpconf.g:557:6: ( ruleGenerationConfiguration )
                    // InternalVpconf.g:558:1: ruleGenerationConfiguration
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getConfigurationElementAccess().getGenerationConfigurationParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_2);
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
                    // InternalVpconf.g:563:6: ( ruleGeneration )
                    {
                    // InternalVpconf.g:563:6: ( ruleGeneration )
                    // InternalVpconf.g:564:1: ruleGeneration
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getConfigurationElementAccess().getGenerationParserRuleCall_2()); 
                    }
                    pushFollow(FOLLOW_2);
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
                    // InternalVpconf.g:569:6: ( ruleRelease )
                    {
                    // InternalVpconf.g:569:6: ( ruleRelease )
                    // InternalVpconf.g:570:1: ruleRelease
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getConfigurationElementAccess().getReleaseParserRuleCall_3()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleRelease();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getConfigurationElementAccess().getReleaseParserRuleCall_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalVpconf.g:575:6: ( ruleViewConfiguration )
                    {
                    // InternalVpconf.g:575:6: ( ruleViewConfiguration )
                    // InternalVpconf.g:576:1: ruleViewConfiguration
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getConfigurationElementAccess().getViewConfigurationParserRuleCall_4()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleViewConfiguration();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getConfigurationElementAccess().getViewConfigurationParserRuleCall_4()); 
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
    // InternalVpconf.g:586:1: rule__ExtensionGeneratrionConfiguration__Alternatives : ( ( ruleDiagramGenerationConfiguration ) | ( ruleDocumentationGenerationConfiguration ) | ( ruleModelsAirdGenerationConfiguration ) );
    public final void rule__ExtensionGeneratrionConfiguration__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVpconf.g:590:1: ( ( ruleDiagramGenerationConfiguration ) | ( ruleDocumentationGenerationConfiguration ) | ( ruleModelsAirdGenerationConfiguration ) )
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
                    // InternalVpconf.g:591:1: ( ruleDiagramGenerationConfiguration )
                    {
                    // InternalVpconf.g:591:1: ( ruleDiagramGenerationConfiguration )
                    // InternalVpconf.g:592:1: ruleDiagramGenerationConfiguration
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getExtensionGeneratrionConfigurationAccess().getDiagramGenerationConfigurationParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_2);
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
                    // InternalVpconf.g:597:6: ( ruleDocumentationGenerationConfiguration )
                    {
                    // InternalVpconf.g:597:6: ( ruleDocumentationGenerationConfiguration )
                    // InternalVpconf.g:598:1: ruleDocumentationGenerationConfiguration
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getExtensionGeneratrionConfigurationAccess().getDocumentationGenerationConfigurationParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_2);
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
                    // InternalVpconf.g:603:6: ( ruleModelsAirdGenerationConfiguration )
                    {
                    // InternalVpconf.g:603:6: ( ruleModelsAirdGenerationConfiguration )
                    // InternalVpconf.g:604:1: ruleModelsAirdGenerationConfiguration
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getExtensionGeneratrionConfigurationAccess().getModelsAirdGenerationConfigurationParserRuleCall_2()); 
                    }
                    pushFollow(FOLLOW_2);
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
    // InternalVpconf.g:614:1: rule__Qualifier__Alternatives_0 : ( ( RULE_INT ) | ( RULE_ID ) | ( '_' ) );
    public final void rule__Qualifier__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVpconf.g:618:1: ( ( RULE_INT ) | ( RULE_ID ) | ( '_' ) )
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
                    // InternalVpconf.g:619:1: ( RULE_INT )
                    {
                    // InternalVpconf.g:619:1: ( RULE_INT )
                    // InternalVpconf.g:620:1: RULE_INT
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getQualifierAccess().getINTTerminalRuleCall_0_0()); 
                    }
                    match(input,RULE_INT,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getQualifierAccess().getINTTerminalRuleCall_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalVpconf.g:625:6: ( RULE_ID )
                    {
                    // InternalVpconf.g:625:6: ( RULE_ID )
                    // InternalVpconf.g:626:1: RULE_ID
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getQualifierAccess().getIDTerminalRuleCall_0_1()); 
                    }
                    match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getQualifierAccess().getIDTerminalRuleCall_0_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalVpconf.g:631:6: ( '_' )
                    {
                    // InternalVpconf.g:631:6: ( '_' )
                    // InternalVpconf.g:632:1: '_'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getQualifierAccess().get_Keyword_0_2()); 
                    }
                    match(input,11,FOLLOW_2); if (state.failed) return ;
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
    // InternalVpconf.g:644:1: rule__Qualifier__Alternatives_1 : ( ( RULE_INT ) | ( RULE_ID ) | ( '_' ) | ( '-' ) );
    public final void rule__Qualifier__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVpconf.g:648:1: ( ( RULE_INT ) | ( RULE_ID ) | ( '_' ) | ( '-' ) )
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
                    // InternalVpconf.g:649:1: ( RULE_INT )
                    {
                    // InternalVpconf.g:649:1: ( RULE_INT )
                    // InternalVpconf.g:650:1: RULE_INT
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getQualifierAccess().getINTTerminalRuleCall_1_0()); 
                    }
                    match(input,RULE_INT,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getQualifierAccess().getINTTerminalRuleCall_1_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalVpconf.g:655:6: ( RULE_ID )
                    {
                    // InternalVpconf.g:655:6: ( RULE_ID )
                    // InternalVpconf.g:656:1: RULE_ID
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getQualifierAccess().getIDTerminalRuleCall_1_1()); 
                    }
                    match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getQualifierAccess().getIDTerminalRuleCall_1_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalVpconf.g:661:6: ( '_' )
                    {
                    // InternalVpconf.g:661:6: ( '_' )
                    // InternalVpconf.g:662:1: '_'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getQualifierAccess().get_Keyword_1_2()); 
                    }
                    match(input,11,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getQualifierAccess().get_Keyword_1_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalVpconf.g:669:6: ( '-' )
                    {
                    // InternalVpconf.g:669:6: ( '-' )
                    // InternalVpconf.g:670:1: '-'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getQualifierAccess().getHyphenMinusKeyword_1_3()); 
                    }
                    match(input,12,FOLLOW_2); if (state.failed) return ;
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
    // InternalVpconf.g:682:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVpconf.g:686:1: ( ( RULE_STRING ) | ( RULE_ID ) )
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
                    // InternalVpconf.g:687:1: ( RULE_STRING )
                    {
                    // InternalVpconf.g:687:1: ( RULE_STRING )
                    // InternalVpconf.g:688:1: RULE_STRING
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    }
                    match(input,RULE_STRING,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalVpconf.g:693:6: ( RULE_ID )
                    {
                    // InternalVpconf.g:693:6: ( RULE_ID )
                    // InternalVpconf.g:694:1: RULE_ID
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                    }
                    match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
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
    // InternalVpconf.g:704:1: rule__EBoolean__Alternatives : ( ( 'true' ) | ( 'false' ) );
    public final void rule__EBoolean__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVpconf.g:708:1: ( ( 'true' ) | ( 'false' ) )
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
                    // InternalVpconf.g:709:1: ( 'true' )
                    {
                    // InternalVpconf.g:709:1: ( 'true' )
                    // InternalVpconf.g:710:1: 'true'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEBooleanAccess().getTrueKeyword_0()); 
                    }
                    match(input,13,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEBooleanAccess().getTrueKeyword_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalVpconf.g:717:6: ( 'false' )
                    {
                    // InternalVpconf.g:717:6: ( 'false' )
                    // InternalVpconf.g:718:1: 'false'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEBooleanAccess().getFalseKeyword_1()); 
                    }
                    match(input,14,FOLLOW_2); if (state.failed) return ;
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
    // InternalVpconf.g:732:1: rule__Configuration__Group__0 : rule__Configuration__Group__0__Impl rule__Configuration__Group__1 ;
    public final void rule__Configuration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVpconf.g:736:1: ( rule__Configuration__Group__0__Impl rule__Configuration__Group__1 )
            // InternalVpconf.g:737:2: rule__Configuration__Group__0__Impl rule__Configuration__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Configuration__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
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
    // InternalVpconf.g:744:1: rule__Configuration__Group__0__Impl : ( () ) ;
    public final void rule__Configuration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVpconf.g:748:1: ( ( () ) )
            // InternalVpconf.g:749:1: ( () )
            {
            // InternalVpconf.g:749:1: ( () )
            // InternalVpconf.g:750:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConfigurationAccess().getConfigurationAction_0()); 
            }
            // InternalVpconf.g:751:1: ()
            // InternalVpconf.g:753:1: 
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
    // InternalVpconf.g:763:1: rule__Configuration__Group__1 : rule__Configuration__Group__1__Impl rule__Configuration__Group__2 ;
    public final void rule__Configuration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVpconf.g:767:1: ( rule__Configuration__Group__1__Impl rule__Configuration__Group__2 )
            // InternalVpconf.g:768:2: rule__Configuration__Group__1__Impl rule__Configuration__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Configuration__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
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
    // InternalVpconf.g:775:1: rule__Configuration__Group__1__Impl : ( 'Configuration' ) ;
    public final void rule__Configuration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVpconf.g:779:1: ( ( 'Configuration' ) )
            // InternalVpconf.g:780:1: ( 'Configuration' )
            {
            // InternalVpconf.g:780:1: ( 'Configuration' )
            // InternalVpconf.g:781:1: 'Configuration'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConfigurationAccess().getConfigurationKeyword_1()); 
            }
            match(input,15,FOLLOW_2); if (state.failed) return ;
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
    // InternalVpconf.g:794:1: rule__Configuration__Group__2 : rule__Configuration__Group__2__Impl rule__Configuration__Group__3 ;
    public final void rule__Configuration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVpconf.g:798:1: ( rule__Configuration__Group__2__Impl rule__Configuration__Group__3 )
            // InternalVpconf.g:799:2: rule__Configuration__Group__2__Impl rule__Configuration__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__Configuration__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
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
    // InternalVpconf.g:806:1: rule__Configuration__Group__2__Impl : ( ( rule__Configuration__NameAssignment_2 ) ) ;
    public final void rule__Configuration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVpconf.g:810:1: ( ( ( rule__Configuration__NameAssignment_2 ) ) )
            // InternalVpconf.g:811:1: ( ( rule__Configuration__NameAssignment_2 ) )
            {
            // InternalVpconf.g:811:1: ( ( rule__Configuration__NameAssignment_2 ) )
            // InternalVpconf.g:812:1: ( rule__Configuration__NameAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConfigurationAccess().getNameAssignment_2()); 
            }
            // InternalVpconf.g:813:1: ( rule__Configuration__NameAssignment_2 )
            // InternalVpconf.g:813:2: rule__Configuration__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
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
    // InternalVpconf.g:823:1: rule__Configuration__Group__3 : rule__Configuration__Group__3__Impl rule__Configuration__Group__4 ;
    public final void rule__Configuration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVpconf.g:827:1: ( rule__Configuration__Group__3__Impl rule__Configuration__Group__4 )
            // InternalVpconf.g:828:2: rule__Configuration__Group__3__Impl rule__Configuration__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__Configuration__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
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
    // InternalVpconf.g:835:1: rule__Configuration__Group__3__Impl : ( '{' ) ;
    public final void rule__Configuration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVpconf.g:839:1: ( ( '{' ) )
            // InternalVpconf.g:840:1: ( '{' )
            {
            // InternalVpconf.g:840:1: ( '{' )
            // InternalVpconf.g:841:1: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConfigurationAccess().getLeftCurlyBracketKeyword_3()); 
            }
            match(input,16,FOLLOW_2); if (state.failed) return ;
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
    // InternalVpconf.g:854:1: rule__Configuration__Group__4 : rule__Configuration__Group__4__Impl rule__Configuration__Group__5 ;
    public final void rule__Configuration__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVpconf.g:858:1: ( rule__Configuration__Group__4__Impl rule__Configuration__Group__5 )
            // InternalVpconf.g:859:2: rule__Configuration__Group__4__Impl rule__Configuration__Group__5
            {
            pushFollow(FOLLOW_6);
            rule__Configuration__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
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
    // InternalVpconf.g:866:1: rule__Configuration__Group__4__Impl : ( ( rule__Configuration__VpConfigurationElementsAssignment_4 )* ) ;
    public final void rule__Configuration__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVpconf.g:870:1: ( ( ( rule__Configuration__VpConfigurationElementsAssignment_4 )* ) )
            // InternalVpconf.g:871:1: ( ( rule__Configuration__VpConfigurationElementsAssignment_4 )* )
            {
            // InternalVpconf.g:871:1: ( ( rule__Configuration__VpConfigurationElementsAssignment_4 )* )
            // InternalVpconf.g:872:1: ( rule__Configuration__VpConfigurationElementsAssignment_4 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConfigurationAccess().getVpConfigurationElementsAssignment_4()); 
            }
            // InternalVpconf.g:873:1: ( rule__Configuration__VpConfigurationElementsAssignment_4 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>=18 && LA7_0<=19)||LA7_0==21||LA7_0==38||LA7_0==44) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalVpconf.g:873:2: rule__Configuration__VpConfigurationElementsAssignment_4
            	    {
            	    pushFollow(FOLLOW_7);
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
    // InternalVpconf.g:883:1: rule__Configuration__Group__5 : rule__Configuration__Group__5__Impl ;
    public final void rule__Configuration__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVpconf.g:887:1: ( rule__Configuration__Group__5__Impl )
            // InternalVpconf.g:888:2: rule__Configuration__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
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
    // InternalVpconf.g:894:1: rule__Configuration__Group__5__Impl : ( '}' ) ;
    public final void rule__Configuration__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVpconf.g:898:1: ( ( '}' ) )
            // InternalVpconf.g:899:1: ( '}' )
            {
            // InternalVpconf.g:899:1: ( '}' )
            // InternalVpconf.g:900:1: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConfigurationAccess().getRightCurlyBracketKeyword_5()); 
            }
            match(input,17,FOLLOW_2); if (state.failed) return ;
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
    // InternalVpconf.g:925:1: rule__TargetApplication__Group__0 : rule__TargetApplication__Group__0__Impl rule__TargetApplication__Group__1 ;
    public final void rule__TargetApplication__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVpconf.g:929:1: ( rule__TargetApplication__Group__0__Impl rule__TargetApplication__Group__1 )
            // InternalVpconf.g:930:2: rule__TargetApplication__Group__0__Impl rule__TargetApplication__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__TargetApplication__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
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
    // InternalVpconf.g:937:1: rule__TargetApplication__Group__0__Impl : ( () ) ;
    public final void rule__TargetApplication__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVpconf.g:941:1: ( ( () ) )
            // InternalVpconf.g:942:1: ( () )
            {
            // InternalVpconf.g:942:1: ( () )
            // InternalVpconf.g:943:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTargetApplicationAccess().getTargetApplicationAction_0()); 
            }
            // InternalVpconf.g:944:1: ()
            // InternalVpconf.g:946:1: 
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
    // InternalVpconf.g:956:1: rule__TargetApplication__Group__1 : rule__TargetApplication__Group__1__Impl rule__TargetApplication__Group__2 ;
    public final void rule__TargetApplication__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVpconf.g:960:1: ( rule__TargetApplication__Group__1__Impl rule__TargetApplication__Group__2 )
            // InternalVpconf.g:961:2: rule__TargetApplication__Group__1__Impl rule__TargetApplication__Group__2
            {
            pushFollow(FOLLOW_9);
            rule__TargetApplication__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
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
    // InternalVpconf.g:968:1: rule__TargetApplication__Group__1__Impl : ( 'target' ) ;
    public final void rule__TargetApplication__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVpconf.g:972:1: ( ( 'target' ) )
            // InternalVpconf.g:973:1: ( 'target' )
            {
            // InternalVpconf.g:973:1: ( 'target' )
            // InternalVpconf.g:974:1: 'target'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTargetApplicationAccess().getTargetKeyword_1()); 
            }
            match(input,18,FOLLOW_2); if (state.failed) return ;
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
    // InternalVpconf.g:987:1: rule__TargetApplication__Group__2 : rule__TargetApplication__Group__2__Impl ;
    public final void rule__TargetApplication__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVpconf.g:991:1: ( rule__TargetApplication__Group__2__Impl )
            // InternalVpconf.g:992:2: rule__TargetApplication__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
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
    // InternalVpconf.g:998:1: rule__TargetApplication__Group__2__Impl : ( ( rule__TargetApplication__TypeAssignment_2 ) ) ;
    public final void rule__TargetApplication__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVpconf.g:1002:1: ( ( ( rule__TargetApplication__TypeAssignment_2 ) ) )
            // InternalVpconf.g:1003:1: ( ( rule__TargetApplication__TypeAssignment_2 ) )
            {
            // InternalVpconf.g:1003:1: ( ( rule__TargetApplication__TypeAssignment_2 ) )
            // InternalVpconf.g:1004:1: ( rule__TargetApplication__TypeAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTargetApplicationAccess().getTypeAssignment_2()); 
            }
            // InternalVpconf.g:1005:1: ( rule__TargetApplication__TypeAssignment_2 )
            // InternalVpconf.g:1005:2: rule__TargetApplication__TypeAssignment_2
            {
            pushFollow(FOLLOW_2);
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
    // InternalVpconf.g:1021:1: rule__GenerationConfiguration__Group__0 : rule__GenerationConfiguration__Group__0__Impl rule__GenerationConfiguration__Group__1 ;
    public final void rule__GenerationConfiguration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVpconf.g:1025:1: ( rule__GenerationConfiguration__Group__0__Impl rule__GenerationConfiguration__Group__1 )
            // InternalVpconf.g:1026:2: rule__GenerationConfiguration__Group__0__Impl rule__GenerationConfiguration__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__GenerationConfiguration__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
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
    // InternalVpconf.g:1033:1: rule__GenerationConfiguration__Group__0__Impl : ( () ) ;
    public final void rule__GenerationConfiguration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVpconf.g:1037:1: ( ( () ) )
            // InternalVpconf.g:1038:1: ( () )
            {
            // InternalVpconf.g:1038:1: ( () )
            // InternalVpconf.g:1039:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGenerationConfigurationAccess().getGenerationConfigurationAction_0()); 
            }
            // InternalVpconf.g:1040:1: ()
            // InternalVpconf.g:1042:1: 
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
    // InternalVpconf.g:1052:1: rule__GenerationConfiguration__Group__1 : rule__GenerationConfiguration__Group__1__Impl rule__GenerationConfiguration__Group__2 ;
    public final void rule__GenerationConfiguration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVpconf.g:1056:1: ( rule__GenerationConfiguration__Group__1__Impl rule__GenerationConfiguration__Group__2 )
            // InternalVpconf.g:1057:2: rule__GenerationConfiguration__Group__1__Impl rule__GenerationConfiguration__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__GenerationConfiguration__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
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
    // InternalVpconf.g:1064:1: rule__GenerationConfiguration__Group__1__Impl : ( 'project' ) ;
    public final void rule__GenerationConfiguration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVpconf.g:1068:1: ( ( 'project' ) )
            // InternalVpconf.g:1069:1: ( 'project' )
            {
            // InternalVpconf.g:1069:1: ( 'project' )
            // InternalVpconf.g:1070:1: 'project'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGenerationConfigurationAccess().getProjectKeyword_1()); 
            }
            match(input,19,FOLLOW_2); if (state.failed) return ;
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
    // InternalVpconf.g:1083:1: rule__GenerationConfiguration__Group__2 : rule__GenerationConfiguration__Group__2__Impl rule__GenerationConfiguration__Group__3 ;
    public final void rule__GenerationConfiguration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVpconf.g:1087:1: ( rule__GenerationConfiguration__Group__2__Impl rule__GenerationConfiguration__Group__3 )
            // InternalVpconf.g:1088:2: rule__GenerationConfiguration__Group__2__Impl rule__GenerationConfiguration__Group__3
            {
            pushFollow(FOLLOW_11);
            rule__GenerationConfiguration__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
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
    // InternalVpconf.g:1095:1: rule__GenerationConfiguration__Group__2__Impl : ( ( rule__GenerationConfiguration__ProjectNameAssignment_2 ) ) ;
    public final void rule__GenerationConfiguration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVpconf.g:1099:1: ( ( ( rule__GenerationConfiguration__ProjectNameAssignment_2 ) ) )
            // InternalVpconf.g:1100:1: ( ( rule__GenerationConfiguration__ProjectNameAssignment_2 ) )
            {
            // InternalVpconf.g:1100:1: ( ( rule__GenerationConfiguration__ProjectNameAssignment_2 ) )
            // InternalVpconf.g:1101:1: ( rule__GenerationConfiguration__ProjectNameAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGenerationConfigurationAccess().getProjectNameAssignment_2()); 
            }
            // InternalVpconf.g:1102:1: ( rule__GenerationConfiguration__ProjectNameAssignment_2 )
            // InternalVpconf.g:1102:2: rule__GenerationConfiguration__ProjectNameAssignment_2
            {
            pushFollow(FOLLOW_2);
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
    // InternalVpconf.g:1112:1: rule__GenerationConfiguration__Group__3 : rule__GenerationConfiguration__Group__3__Impl ;
    public final void rule__GenerationConfiguration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVpconf.g:1116:1: ( rule__GenerationConfiguration__Group__3__Impl )
            // InternalVpconf.g:1117:2: rule__GenerationConfiguration__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
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
    // InternalVpconf.g:1123:1: rule__GenerationConfiguration__Group__3__Impl : ( ( rule__GenerationConfiguration__Group_3__0 )? ) ;
    public final void rule__GenerationConfiguration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVpconf.g:1127:1: ( ( ( rule__GenerationConfiguration__Group_3__0 )? ) )
            // InternalVpconf.g:1128:1: ( ( rule__GenerationConfiguration__Group_3__0 )? )
            {
            // InternalVpconf.g:1128:1: ( ( rule__GenerationConfiguration__Group_3__0 )? )
            // InternalVpconf.g:1129:1: ( rule__GenerationConfiguration__Group_3__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGenerationConfigurationAccess().getGroup_3()); 
            }
            // InternalVpconf.g:1130:1: ( rule__GenerationConfiguration__Group_3__0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==20) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalVpconf.g:1130:2: rule__GenerationConfiguration__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
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
    // InternalVpconf.g:1148:1: rule__GenerationConfiguration__Group_3__0 : rule__GenerationConfiguration__Group_3__0__Impl rule__GenerationConfiguration__Group_3__1 ;
    public final void rule__GenerationConfiguration__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVpconf.g:1152:1: ( rule__GenerationConfiguration__Group_3__0__Impl rule__GenerationConfiguration__Group_3__1 )
            // InternalVpconf.g:1153:2: rule__GenerationConfiguration__Group_3__0__Impl rule__GenerationConfiguration__Group_3__1
            {
            pushFollow(FOLLOW_12);
            rule__GenerationConfiguration__Group_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
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
    // InternalVpconf.g:1160:1: rule__GenerationConfiguration__Group_3__0__Impl : ( 'nsuri' ) ;
    public final void rule__GenerationConfiguration__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVpconf.g:1164:1: ( ( 'nsuri' ) )
            // InternalVpconf.g:1165:1: ( 'nsuri' )
            {
            // InternalVpconf.g:1165:1: ( 'nsuri' )
            // InternalVpconf.g:1166:1: 'nsuri'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGenerationConfigurationAccess().getNsuriKeyword_3_0()); 
            }
            match(input,20,FOLLOW_2); if (state.failed) return ;
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
    // InternalVpconf.g:1179:1: rule__GenerationConfiguration__Group_3__1 : rule__GenerationConfiguration__Group_3__1__Impl ;
    public final void rule__GenerationConfiguration__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVpconf.g:1183:1: ( rule__GenerationConfiguration__Group_3__1__Impl )
            // InternalVpconf.g:1184:2: rule__GenerationConfiguration__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
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
    // InternalVpconf.g:1190:1: rule__GenerationConfiguration__Group_3__1__Impl : ( ( rule__GenerationConfiguration__NsuriAssignment_3_1 ) ) ;
    public final void rule__GenerationConfiguration__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVpconf.g:1194:1: ( ( ( rule__GenerationConfiguration__NsuriAssignment_3_1 ) ) )
            // InternalVpconf.g:1195:1: ( ( rule__GenerationConfiguration__NsuriAssignment_3_1 ) )
            {
            // InternalVpconf.g:1195:1: ( ( rule__GenerationConfiguration__NsuriAssignment_3_1 ) )
            // InternalVpconf.g:1196:1: ( rule__GenerationConfiguration__NsuriAssignment_3_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGenerationConfigurationAccess().getNsuriAssignment_3_1()); 
            }
            // InternalVpconf.g:1197:1: ( rule__GenerationConfiguration__NsuriAssignment_3_1 )
            // InternalVpconf.g:1197:2: rule__GenerationConfiguration__NsuriAssignment_3_1
            {
            pushFollow(FOLLOW_2);
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
    // InternalVpconf.g:1211:1: rule__Generation__Group__0 : rule__Generation__Group__0__Impl rule__Generation__Group__1 ;
    public final void rule__Generation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVpconf.g:1215:1: ( rule__Generation__Group__0__Impl rule__Generation__Group__1 )
            // InternalVpconf.g:1216:2: rule__Generation__Group__0__Impl rule__Generation__Group__1
            {
            pushFollow(FOLLOW_13);
            rule__Generation__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
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
    // InternalVpconf.g:1223:1: rule__Generation__Group__0__Impl : ( () ) ;
    public final void rule__Generation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVpconf.g:1227:1: ( ( () ) )
            // InternalVpconf.g:1228:1: ( () )
            {
            // InternalVpconf.g:1228:1: ( () )
            // InternalVpconf.g:1229:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGenerationAccess().getGenerationAction_0()); 
            }
            // InternalVpconf.g:1230:1: ()
            // InternalVpconf.g:1232:1: 
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
    // InternalVpconf.g:1242:1: rule__Generation__Group__1 : rule__Generation__Group__1__Impl rule__Generation__Group__2 ;
    public final void rule__Generation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVpconf.g:1246:1: ( rule__Generation__Group__1__Impl rule__Generation__Group__2 )
            // InternalVpconf.g:1247:2: rule__Generation__Group__1__Impl rule__Generation__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__Generation__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
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
    // InternalVpconf.g:1254:1: rule__Generation__Group__1__Impl : ( 'generation' ) ;
    public final void rule__Generation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVpconf.g:1258:1: ( ( 'generation' ) )
            // InternalVpconf.g:1259:1: ( 'generation' )
            {
            // InternalVpconf.g:1259:1: ( 'generation' )
            // InternalVpconf.g:1260:1: 'generation'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGenerationAccess().getGenerationKeyword_1()); 
            }
            match(input,21,FOLLOW_2); if (state.failed) return ;
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
    // InternalVpconf.g:1273:1: rule__Generation__Group__2 : rule__Generation__Group__2__Impl rule__Generation__Group__3 ;
    public final void rule__Generation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVpconf.g:1277:1: ( rule__Generation__Group__2__Impl rule__Generation__Group__3 )
            // InternalVpconf.g:1278:2: rule__Generation__Group__2__Impl rule__Generation__Group__3
            {
            pushFollow(FOLLOW_14);
            rule__Generation__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
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
    // InternalVpconf.g:1285:1: rule__Generation__Group__2__Impl : ( '{' ) ;
    public final void rule__Generation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVpconf.g:1289:1: ( ( '{' ) )
            // InternalVpconf.g:1290:1: ( '{' )
            {
            // InternalVpconf.g:1290:1: ( '{' )
            // InternalVpconf.g:1291:1: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGenerationAccess().getLeftCurlyBracketKeyword_2()); 
            }
            match(input,16,FOLLOW_2); if (state.failed) return ;
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
    // InternalVpconf.g:1304:1: rule__Generation__Group__3 : rule__Generation__Group__3__Impl rule__Generation__Group__4 ;
    public final void rule__Generation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVpconf.g:1308:1: ( rule__Generation__Group__3__Impl rule__Generation__Group__4 )
            // InternalVpconf.g:1309:2: rule__Generation__Group__3__Impl rule__Generation__Group__4
            {
            pushFollow(FOLLOW_14);
            rule__Generation__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
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
    // InternalVpconf.g:1316:1: rule__Generation__Group__3__Impl : ( ( rule__Generation__OwnedDataGenerationConfAssignment_3 )? ) ;
    public final void rule__Generation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVpconf.g:1320:1: ( ( ( rule__Generation__OwnedDataGenerationConfAssignment_3 )? ) )
            // InternalVpconf.g:1321:1: ( ( rule__Generation__OwnedDataGenerationConfAssignment_3 )? )
            {
            // InternalVpconf.g:1321:1: ( ( rule__Generation__OwnedDataGenerationConfAssignment_3 )? )
            // InternalVpconf.g:1322:1: ( rule__Generation__OwnedDataGenerationConfAssignment_3 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGenerationAccess().getOwnedDataGenerationConfAssignment_3()); 
            }
            // InternalVpconf.g:1323:1: ( rule__Generation__OwnedDataGenerationConfAssignment_3 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==22) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalVpconf.g:1323:2: rule__Generation__OwnedDataGenerationConfAssignment_3
                    {
                    pushFollow(FOLLOW_2);
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
    // InternalVpconf.g:1333:1: rule__Generation__Group__4 : rule__Generation__Group__4__Impl rule__Generation__Group__5 ;
    public final void rule__Generation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVpconf.g:1337:1: ( rule__Generation__Group__4__Impl rule__Generation__Group__5 )
            // InternalVpconf.g:1338:2: rule__Generation__Group__4__Impl rule__Generation__Group__5
            {
            pushFollow(FOLLOW_14);
            rule__Generation__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
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
    // InternalVpconf.g:1345:1: rule__Generation__Group__4__Impl : ( ( rule__Generation__OwnedExtensionGenConfAssignment_4 )* ) ;
    public final void rule__Generation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVpconf.g:1349:1: ( ( ( rule__Generation__OwnedExtensionGenConfAssignment_4 )* ) )
            // InternalVpconf.g:1350:1: ( ( rule__Generation__OwnedExtensionGenConfAssignment_4 )* )
            {
            // InternalVpconf.g:1350:1: ( ( rule__Generation__OwnedExtensionGenConfAssignment_4 )* )
            // InternalVpconf.g:1351:1: ( rule__Generation__OwnedExtensionGenConfAssignment_4 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGenerationAccess().getOwnedExtensionGenConfAssignment_4()); 
            }
            // InternalVpconf.g:1352:1: ( rule__Generation__OwnedExtensionGenConfAssignment_4 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==32||LA10_0==34||LA10_0==36) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalVpconf.g:1352:2: rule__Generation__OwnedExtensionGenConfAssignment_4
            	    {
            	    pushFollow(FOLLOW_15);
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
    // InternalVpconf.g:1362:1: rule__Generation__Group__5 : rule__Generation__Group__5__Impl ;
    public final void rule__Generation__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVpconf.g:1366:1: ( rule__Generation__Group__5__Impl )
            // InternalVpconf.g:1367:2: rule__Generation__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
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
    // InternalVpconf.g:1373:1: rule__Generation__Group__5__Impl : ( '}' ) ;
    public final void rule__Generation__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVpconf.g:1377:1: ( ( '}' ) )
            // InternalVpconf.g:1378:1: ( '}' )
            {
            // InternalVpconf.g:1378:1: ( '}' )
            // InternalVpconf.g:1379:1: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGenerationAccess().getRightCurlyBracketKeyword_5()); 
            }
            match(input,17,FOLLOW_2); if (state.failed) return ;
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
    // InternalVpconf.g:1404:1: rule__GData__Group__0 : rule__GData__Group__0__Impl rule__GData__Group__1 ;
    public final void rule__GData__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVpconf.g:1408:1: ( rule__GData__Group__0__Impl rule__GData__Group__1 )
            // InternalVpconf.g:1409:2: rule__GData__Group__0__Impl rule__GData__Group__1
            {
            pushFollow(FOLLOW_16);
            rule__GData__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
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
    // InternalVpconf.g:1416:1: rule__GData__Group__0__Impl : ( () ) ;
    public final void rule__GData__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVpconf.g:1420:1: ( ( () ) )
            // InternalVpconf.g:1421:1: ( () )
            {
            // InternalVpconf.g:1421:1: ( () )
            // InternalVpconf.g:1422:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGDataAccess().getGDataAction_0()); 
            }
            // InternalVpconf.g:1423:1: ()
            // InternalVpconf.g:1425:1: 
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
    // InternalVpconf.g:1435:1: rule__GData__Group__1 : rule__GData__Group__1__Impl rule__GData__Group__2 ;
    public final void rule__GData__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVpconf.g:1439:1: ( rule__GData__Group__1__Impl rule__GData__Group__2 )
            // InternalVpconf.g:1440:2: rule__GData__Group__1__Impl rule__GData__Group__2
            {
            pushFollow(FOLLOW_17);
            rule__GData__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
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
    // InternalVpconf.g:1447:1: rule__GData__Group__1__Impl : ( 'data' ) ;
    public final void rule__GData__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVpconf.g:1451:1: ( ( 'data' ) )
            // InternalVpconf.g:1452:1: ( 'data' )
            {
            // InternalVpconf.g:1452:1: ( 'data' )
            // InternalVpconf.g:1453:1: 'data'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGDataAccess().getDataKeyword_1()); 
            }
            match(input,22,FOLLOW_2); if (state.failed) return ;
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
    // InternalVpconf.g:1466:1: rule__GData__Group__2 : rule__GData__Group__2__Impl rule__GData__Group__3 ;
    public final void rule__GData__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVpconf.g:1470:1: ( rule__GData__Group__2__Impl rule__GData__Group__3 )
            // InternalVpconf.g:1471:2: rule__GData__Group__2__Impl rule__GData__Group__3
            {
            pushFollow(FOLLOW_18);
            rule__GData__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
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
    // InternalVpconf.g:1478:1: rule__GData__Group__2__Impl : ( '(' ) ;
    public final void rule__GData__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVpconf.g:1482:1: ( ( '(' ) )
            // InternalVpconf.g:1483:1: ( '(' )
            {
            // InternalVpconf.g:1483:1: ( '(' )
            // InternalVpconf.g:1484:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGDataAccess().getLeftParenthesisKeyword_2()); 
            }
            match(input,23,FOLLOW_2); if (state.failed) return ;
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
    // InternalVpconf.g:1497:1: rule__GData__Group__3 : rule__GData__Group__3__Impl rule__GData__Group__4 ;
    public final void rule__GData__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVpconf.g:1501:1: ( rule__GData__Group__3__Impl rule__GData__Group__4 )
            // InternalVpconf.g:1502:2: rule__GData__Group__3__Impl rule__GData__Group__4
            {
            pushFollow(FOLLOW_19);
            rule__GData__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
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
    // InternalVpconf.g:1509:1: rule__GData__Group__3__Impl : ( ( rule__GData__Group_3__0 ) ) ;
    public final void rule__GData__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVpconf.g:1513:1: ( ( ( rule__GData__Group_3__0 ) ) )
            // InternalVpconf.g:1514:1: ( ( rule__GData__Group_3__0 ) )
            {
            // InternalVpconf.g:1514:1: ( ( rule__GData__Group_3__0 ) )
            // InternalVpconf.g:1515:1: ( rule__GData__Group_3__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGDataAccess().getGroup_3()); 
            }
            // InternalVpconf.g:1516:1: ( rule__GData__Group_3__0 )
            // InternalVpconf.g:1516:2: rule__GData__Group_3__0
            {
            pushFollow(FOLLOW_2);
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
    // InternalVpconf.g:1526:1: rule__GData__Group__4 : rule__GData__Group__4__Impl ;
    public final void rule__GData__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVpconf.g:1530:1: ( rule__GData__Group__4__Impl )
            // InternalVpconf.g:1531:2: rule__GData__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
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
    // InternalVpconf.g:1537:1: rule__GData__Group__4__Impl : ( ')' ) ;
    public final void rule__GData__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVpconf.g:1541:1: ( ( ')' ) )
            // InternalVpconf.g:1542:1: ( ')' )
            {
            // InternalVpconf.g:1542:1: ( ')' )
            // InternalVpconf.g:1543:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGDataAccess().getRightParenthesisKeyword_4()); 
            }
            match(input,24,FOLLOW_2); if (state.failed) return ;
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
    // InternalVpconf.g:1566:1: rule__GData__Group_3__0 : rule__GData__Group_3__0__Impl rule__GData__Group_3__1 ;
    public final void rule__GData__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVpconf.g:1570:1: ( rule__GData__Group_3__0__Impl rule__GData__Group_3__1 )
            // InternalVpconf.g:1571:2: rule__GData__Group_3__0__Impl rule__GData__Group_3__1
            {
            pushFollow(FOLLOW_18);
            rule__GData__Group_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
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
    // InternalVpconf.g:1578:1: rule__GData__Group_3__0__Impl : ( ( rule__GData__Group_3_0__0 )? ) ;
    public final void rule__GData__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVpconf.g:1582:1: ( ( ( rule__GData__Group_3_0__0 )? ) )
            // InternalVpconf.g:1583:1: ( ( rule__GData__Group_3_0__0 )? )
            {
            // InternalVpconf.g:1583:1: ( ( rule__GData__Group_3_0__0 )? )
            // InternalVpconf.g:1584:1: ( rule__GData__Group_3_0__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGDataAccess().getGroup_3_0()); 
            }
            // InternalVpconf.g:1585:1: ( rule__GData__Group_3_0__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==25) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalVpconf.g:1585:2: rule__GData__Group_3_0__0
                    {
                    pushFollow(FOLLOW_2);
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
    // InternalVpconf.g:1595:1: rule__GData__Group_3__1 : rule__GData__Group_3__1__Impl rule__GData__Group_3__2 ;
    public final void rule__GData__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVpconf.g:1599:1: ( rule__GData__Group_3__1__Impl rule__GData__Group_3__2 )
            // InternalVpconf.g:1600:2: rule__GData__Group_3__1__Impl rule__GData__Group_3__2
            {
            pushFollow(FOLLOW_18);
            rule__GData__Group_3__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
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
    // InternalVpconf.g:1607:1: rule__GData__Group_3__1__Impl : ( ( rule__GData__Group_3_1__0 )? ) ;
    public final void rule__GData__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVpconf.g:1611:1: ( ( ( rule__GData__Group_3_1__0 )? ) )
            // InternalVpconf.g:1612:1: ( ( rule__GData__Group_3_1__0 )? )
            {
            // InternalVpconf.g:1612:1: ( ( rule__GData__Group_3_1__0 )? )
            // InternalVpconf.g:1613:1: ( rule__GData__Group_3_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGDataAccess().getGroup_3_1()); 
            }
            // InternalVpconf.g:1614:1: ( rule__GData__Group_3_1__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==27) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalVpconf.g:1614:2: rule__GData__Group_3_1__0
                    {
                    pushFollow(FOLLOW_2);
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
    // InternalVpconf.g:1624:1: rule__GData__Group_3__2 : rule__GData__Group_3__2__Impl rule__GData__Group_3__3 ;
    public final void rule__GData__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVpconf.g:1628:1: ( rule__GData__Group_3__2__Impl rule__GData__Group_3__3 )
            // InternalVpconf.g:1629:2: rule__GData__Group_3__2__Impl rule__GData__Group_3__3
            {
            pushFollow(FOLLOW_18);
            rule__GData__Group_3__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
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
    // InternalVpconf.g:1636:1: rule__GData__Group_3__2__Impl : ( ( rule__GData__Group_3_2__0 )? ) ;
    public final void rule__GData__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVpconf.g:1640:1: ( ( ( rule__GData__Group_3_2__0 )? ) )
            // InternalVpconf.g:1641:1: ( ( rule__GData__Group_3_2__0 )? )
            {
            // InternalVpconf.g:1641:1: ( ( rule__GData__Group_3_2__0 )? )
            // InternalVpconf.g:1642:1: ( rule__GData__Group_3_2__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGDataAccess().getGroup_3_2()); 
            }
            // InternalVpconf.g:1643:1: ( rule__GData__Group_3_2__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==28) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalVpconf.g:1643:2: rule__GData__Group_3_2__0
                    {
                    pushFollow(FOLLOW_2);
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
    // InternalVpconf.g:1653:1: rule__GData__Group_3__3 : rule__GData__Group_3__3__Impl rule__GData__Group_3__4 ;
    public final void rule__GData__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVpconf.g:1657:1: ( rule__GData__Group_3__3__Impl rule__GData__Group_3__4 )
            // InternalVpconf.g:1658:2: rule__GData__Group_3__3__Impl rule__GData__Group_3__4
            {
            pushFollow(FOLLOW_18);
            rule__GData__Group_3__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
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
    // InternalVpconf.g:1665:1: rule__GData__Group_3__3__Impl : ( ( rule__GData__Group_3_3__0 )? ) ;
    public final void rule__GData__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVpconf.g:1669:1: ( ( ( rule__GData__Group_3_3__0 )? ) )
            // InternalVpconf.g:1670:1: ( ( rule__GData__Group_3_3__0 )? )
            {
            // InternalVpconf.g:1670:1: ( ( rule__GData__Group_3_3__0 )? )
            // InternalVpconf.g:1671:1: ( rule__GData__Group_3_3__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGDataAccess().getGroup_3_3()); 
            }
            // InternalVpconf.g:1672:1: ( rule__GData__Group_3_3__0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==29) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalVpconf.g:1672:2: rule__GData__Group_3_3__0
                    {
                    pushFollow(FOLLOW_2);
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
    // InternalVpconf.g:1682:1: rule__GData__Group_3__4 : rule__GData__Group_3__4__Impl rule__GData__Group_3__5 ;
    public final void rule__GData__Group_3__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVpconf.g:1686:1: ( rule__GData__Group_3__4__Impl rule__GData__Group_3__5 )
            // InternalVpconf.g:1687:2: rule__GData__Group_3__4__Impl rule__GData__Group_3__5
            {
            pushFollow(FOLLOW_18);
            rule__GData__Group_3__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
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
    // InternalVpconf.g:1694:1: rule__GData__Group_3__4__Impl : ( ( rule__GData__Group_3_4__0 )? ) ;
    public final void rule__GData__Group_3__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVpconf.g:1698:1: ( ( ( rule__GData__Group_3_4__0 )? ) )
            // InternalVpconf.g:1699:1: ( ( rule__GData__Group_3_4__0 )? )
            {
            // InternalVpconf.g:1699:1: ( ( rule__GData__Group_3_4__0 )? )
            // InternalVpconf.g:1700:1: ( rule__GData__Group_3_4__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGDataAccess().getGroup_3_4()); 
            }
            // InternalVpconf.g:1701:1: ( rule__GData__Group_3_4__0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==30) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalVpconf.g:1701:2: rule__GData__Group_3_4__0
                    {
                    pushFollow(FOLLOW_2);
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
    // InternalVpconf.g:1711:1: rule__GData__Group_3__5 : rule__GData__Group_3__5__Impl ;
    public final void rule__GData__Group_3__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVpconf.g:1715:1: ( rule__GData__Group_3__5__Impl )
            // InternalVpconf.g:1716:2: rule__GData__Group_3__5__Impl
            {
            pushFollow(FOLLOW_2);
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
    // InternalVpconf.g:1722:1: rule__GData__Group_3__5__Impl : ( ( rule__GData__Group_3_5__0 )? ) ;
    public final void rule__GData__Group_3__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVpconf.g:1726:1: ( ( ( rule__GData__Group_3_5__0 )? ) )
            // InternalVpconf.g:1727:1: ( ( rule__GData__Group_3_5__0 )? )
            {
            // InternalVpconf.g:1727:1: ( ( rule__GData__Group_3_5__0 )? )
            // InternalVpconf.g:1728:1: ( rule__GData__Group_3_5__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGDataAccess().getGroup_3_5()); 
            }
            // InternalVpconf.g:1729:1: ( rule__GData__Group_3_5__0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==31) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalVpconf.g:1729:2: rule__GData__Group_3_5__0
                    {
                    pushFollow(FOLLOW_2);
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
    // InternalVpconf.g:1751:1: rule__GData__Group_3_0__0 : rule__GData__Group_3_0__0__Impl rule__GData__Group_3_0__1 ;
    public final void rule__GData__Group_3_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVpconf.g:1755:1: ( rule__GData__Group_3_0__0__Impl rule__GData__Group_3_0__1 )
            // InternalVpconf.g:1756:2: rule__GData__Group_3_0__0__Impl rule__GData__Group_3_0__1
            {
            pushFollow(FOLLOW_20);
            rule__GData__Group_3_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
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
    // InternalVpconf.g:1763:1: rule__GData__Group_3_0__0__Impl : ( 'Model' ) ;
    public final void rule__GData__Group_3_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVpconf.g:1767:1: ( ( 'Model' ) )
            // InternalVpconf.g:1768:1: ( 'Model' )
            {
            // InternalVpconf.g:1768:1: ( 'Model' )
            // InternalVpconf.g:1769:1: 'Model'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGDataAccess().getModelKeyword_3_0_0()); 
            }
            match(input,25,FOLLOW_2); if (state.failed) return ;
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
    // InternalVpconf.g:1782:1: rule__GData__Group_3_0__1 : rule__GData__Group_3_0__1__Impl rule__GData__Group_3_0__2 ;
    public final void rule__GData__Group_3_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVpconf.g:1786:1: ( rule__GData__Group_3_0__1__Impl rule__GData__Group_3_0__2 )
            // InternalVpconf.g:1787:2: rule__GData__Group_3_0__1__Impl rule__GData__Group_3_0__2
            {
            pushFollow(FOLLOW_21);
            rule__GData__Group_3_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
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
    // InternalVpconf.g:1794:1: rule__GData__Group_3_0__1__Impl : ( ':' ) ;
    public final void rule__GData__Group_3_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVpconf.g:1798:1: ( ( ':' ) )
            // InternalVpconf.g:1799:1: ( ':' )
            {
            // InternalVpconf.g:1799:1: ( ':' )
            // InternalVpconf.g:1800:1: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGDataAccess().getColonKeyword_3_0_1()); 
            }
            match(input,26,FOLLOW_2); if (state.failed) return ;
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
    // InternalVpconf.g:1813:1: rule__GData__Group_3_0__2 : rule__GData__Group_3_0__2__Impl ;
    public final void rule__GData__Group_3_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVpconf.g:1817:1: ( rule__GData__Group_3_0__2__Impl )
            // InternalVpconf.g:1818:2: rule__GData__Group_3_0__2__Impl
            {
            pushFollow(FOLLOW_2);
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
    // InternalVpconf.g:1824:1: rule__GData__Group_3_0__2__Impl : ( ( rule__GData__ModelAssignment_3_0_2 ) ) ;
    public final void rule__GData__Group_3_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVpconf.g:1828:1: ( ( ( rule__GData__ModelAssignment_3_0_2 ) ) )
            // InternalVpconf.g:1829:1: ( ( rule__GData__ModelAssignment_3_0_2 ) )
            {
            // InternalVpconf.g:1829:1: ( ( rule__GData__ModelAssignment_3_0_2 ) )
            // InternalVpconf.g:1830:1: ( rule__GData__ModelAssignment_3_0_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGDataAccess().getModelAssignment_3_0_2()); 
            }
            // InternalVpconf.g:1831:1: ( rule__GData__ModelAssignment_3_0_2 )
            // InternalVpconf.g:1831:2: rule__GData__ModelAssignment_3_0_2
            {
            pushFollow(FOLLOW_2);
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
    // InternalVpconf.g:1847:1: rule__GData__Group_3_1__0 : rule__GData__Group_3_1__0__Impl rule__GData__Group_3_1__1 ;
    public final void rule__GData__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVpconf.g:1851:1: ( rule__GData__Group_3_1__0__Impl rule__GData__Group_3_1__1 )
            // InternalVpconf.g:1852:2: rule__GData__Group_3_1__0__Impl rule__GData__Group_3_1__1
            {
            pushFollow(FOLLOW_20);
            rule__GData__Group_3_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
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
    // InternalVpconf.g:1859:1: rule__GData__Group_3_1__0__Impl : ( 'Edit' ) ;
    public final void rule__GData__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVpconf.g:1863:1: ( ( 'Edit' ) )
            // InternalVpconf.g:1864:1: ( 'Edit' )
            {
            // InternalVpconf.g:1864:1: ( 'Edit' )
            // InternalVpconf.g:1865:1: 'Edit'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGDataAccess().getEditKeyword_3_1_0()); 
            }
            match(input,27,FOLLOW_2); if (state.failed) return ;
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
    // InternalVpconf.g:1878:1: rule__GData__Group_3_1__1 : rule__GData__Group_3_1__1__Impl rule__GData__Group_3_1__2 ;
    public final void rule__GData__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVpconf.g:1882:1: ( rule__GData__Group_3_1__1__Impl rule__GData__Group_3_1__2 )
            // InternalVpconf.g:1883:2: rule__GData__Group_3_1__1__Impl rule__GData__Group_3_1__2
            {
            pushFollow(FOLLOW_21);
            rule__GData__Group_3_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
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
    // InternalVpconf.g:1890:1: rule__GData__Group_3_1__1__Impl : ( ':' ) ;
    public final void rule__GData__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVpconf.g:1894:1: ( ( ':' ) )
            // InternalVpconf.g:1895:1: ( ':' )
            {
            // InternalVpconf.g:1895:1: ( ':' )
            // InternalVpconf.g:1896:1: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGDataAccess().getColonKeyword_3_1_1()); 
            }
            match(input,26,FOLLOW_2); if (state.failed) return ;
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
    // InternalVpconf.g:1909:1: rule__GData__Group_3_1__2 : rule__GData__Group_3_1__2__Impl ;
    public final void rule__GData__Group_3_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVpconf.g:1913:1: ( rule__GData__Group_3_1__2__Impl )
            // InternalVpconf.g:1914:2: rule__GData__Group_3_1__2__Impl
            {
            pushFollow(FOLLOW_2);
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
    // InternalVpconf.g:1920:1: rule__GData__Group_3_1__2__Impl : ( ( rule__GData__EditAssignment_3_1_2 ) ) ;
    public final void rule__GData__Group_3_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVpconf.g:1924:1: ( ( ( rule__GData__EditAssignment_3_1_2 ) ) )
            // InternalVpconf.g:1925:1: ( ( rule__GData__EditAssignment_3_1_2 ) )
            {
            // InternalVpconf.g:1925:1: ( ( rule__GData__EditAssignment_3_1_2 ) )
            // InternalVpconf.g:1926:1: ( rule__GData__EditAssignment_3_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGDataAccess().getEditAssignment_3_1_2()); 
            }
            // InternalVpconf.g:1927:1: ( rule__GData__EditAssignment_3_1_2 )
            // InternalVpconf.g:1927:2: rule__GData__EditAssignment_3_1_2
            {
            pushFollow(FOLLOW_2);
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
    // InternalVpconf.g:1943:1: rule__GData__Group_3_2__0 : rule__GData__Group_3_2__0__Impl rule__GData__Group_3_2__1 ;
    public final void rule__GData__Group_3_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVpconf.g:1947:1: ( rule__GData__Group_3_2__0__Impl rule__GData__Group_3_2__1 )
            // InternalVpconf.g:1948:2: rule__GData__Group_3_2__0__Impl rule__GData__Group_3_2__1
            {
            pushFollow(FOLLOW_20);
            rule__GData__Group_3_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
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
    // InternalVpconf.g:1955:1: rule__GData__Group_3_2__0__Impl : ( 'Editor' ) ;
    public final void rule__GData__Group_3_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVpconf.g:1959:1: ( ( 'Editor' ) )
            // InternalVpconf.g:1960:1: ( 'Editor' )
            {
            // InternalVpconf.g:1960:1: ( 'Editor' )
            // InternalVpconf.g:1961:1: 'Editor'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGDataAccess().getEditorKeyword_3_2_0()); 
            }
            match(input,28,FOLLOW_2); if (state.failed) return ;
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
    // InternalVpconf.g:1974:1: rule__GData__Group_3_2__1 : rule__GData__Group_3_2__1__Impl rule__GData__Group_3_2__2 ;
    public final void rule__GData__Group_3_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVpconf.g:1978:1: ( rule__GData__Group_3_2__1__Impl rule__GData__Group_3_2__2 )
            // InternalVpconf.g:1979:2: rule__GData__Group_3_2__1__Impl rule__GData__Group_3_2__2
            {
            pushFollow(FOLLOW_21);
            rule__GData__Group_3_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
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
    // InternalVpconf.g:1986:1: rule__GData__Group_3_2__1__Impl : ( ':' ) ;
    public final void rule__GData__Group_3_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVpconf.g:1990:1: ( ( ':' ) )
            // InternalVpconf.g:1991:1: ( ':' )
            {
            // InternalVpconf.g:1991:1: ( ':' )
            // InternalVpconf.g:1992:1: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGDataAccess().getColonKeyword_3_2_1()); 
            }
            match(input,26,FOLLOW_2); if (state.failed) return ;
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
    // InternalVpconf.g:2005:1: rule__GData__Group_3_2__2 : rule__GData__Group_3_2__2__Impl ;
    public final void rule__GData__Group_3_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVpconf.g:2009:1: ( rule__GData__Group_3_2__2__Impl )
            // InternalVpconf.g:2010:2: rule__GData__Group_3_2__2__Impl
            {
            pushFollow(FOLLOW_2);
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
    // InternalVpconf.g:2016:1: rule__GData__Group_3_2__2__Impl : ( ( rule__GData__EditorAssignment_3_2_2 ) ) ;
    public final void rule__GData__Group_3_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVpconf.g:2020:1: ( ( ( rule__GData__EditorAssignment_3_2_2 ) ) )
            // InternalVpconf.g:2021:1: ( ( rule__GData__EditorAssignment_3_2_2 ) )
            {
            // InternalVpconf.g:2021:1: ( ( rule__GData__EditorAssignment_3_2_2 ) )
            // InternalVpconf.g:2022:1: ( rule__GData__EditorAssignment_3_2_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGDataAccess().getEditorAssignment_3_2_2()); 
            }
            // InternalVpconf.g:2023:1: ( rule__GData__EditorAssignment_3_2_2 )
            // InternalVpconf.g:2023:2: rule__GData__EditorAssignment_3_2_2
            {
            pushFollow(FOLLOW_2);
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
    // InternalVpconf.g:2039:1: rule__GData__Group_3_3__0 : rule__GData__Group_3_3__0__Impl rule__GData__Group_3_3__1 ;
    public final void rule__GData__Group_3_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVpconf.g:2043:1: ( rule__GData__Group_3_3__0__Impl rule__GData__Group_3_3__1 )
            // InternalVpconf.g:2044:2: rule__GData__Group_3_3__0__Impl rule__GData__Group_3_3__1
            {
            pushFollow(FOLLOW_20);
            rule__GData__Group_3_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
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
    // InternalVpconf.g:2051:1: rule__GData__Group_3_3__0__Impl : ( 'Test' ) ;
    public final void rule__GData__Group_3_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVpconf.g:2055:1: ( ( 'Test' ) )
            // InternalVpconf.g:2056:1: ( 'Test' )
            {
            // InternalVpconf.g:2056:1: ( 'Test' )
            // InternalVpconf.g:2057:1: 'Test'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGDataAccess().getTestKeyword_3_3_0()); 
            }
            match(input,29,FOLLOW_2); if (state.failed) return ;
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
    // InternalVpconf.g:2070:1: rule__GData__Group_3_3__1 : rule__GData__Group_3_3__1__Impl rule__GData__Group_3_3__2 ;
    public final void rule__GData__Group_3_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVpconf.g:2074:1: ( rule__GData__Group_3_3__1__Impl rule__GData__Group_3_3__2 )
            // InternalVpconf.g:2075:2: rule__GData__Group_3_3__1__Impl rule__GData__Group_3_3__2
            {
            pushFollow(FOLLOW_21);
            rule__GData__Group_3_3__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
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
    // InternalVpconf.g:2082:1: rule__GData__Group_3_3__1__Impl : ( ':' ) ;
    public final void rule__GData__Group_3_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVpconf.g:2086:1: ( ( ':' ) )
            // InternalVpconf.g:2087:1: ( ':' )
            {
            // InternalVpconf.g:2087:1: ( ':' )
            // InternalVpconf.g:2088:1: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGDataAccess().getColonKeyword_3_3_1()); 
            }
            match(input,26,FOLLOW_2); if (state.failed) return ;
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
    // InternalVpconf.g:2101:1: rule__GData__Group_3_3__2 : rule__GData__Group_3_3__2__Impl ;
    public final void rule__GData__Group_3_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVpconf.g:2105:1: ( rule__GData__Group_3_3__2__Impl )
            // InternalVpconf.g:2106:2: rule__GData__Group_3_3__2__Impl
            {
            pushFollow(FOLLOW_2);
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
    // InternalVpconf.g:2112:1: rule__GData__Group_3_3__2__Impl : ( ( rule__GData__TestAssignment_3_3_2 ) ) ;
    public final void rule__GData__Group_3_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVpconf.g:2116:1: ( ( ( rule__GData__TestAssignment_3_3_2 ) ) )
            // InternalVpconf.g:2117:1: ( ( rule__GData__TestAssignment_3_3_2 ) )
            {
            // InternalVpconf.g:2117:1: ( ( rule__GData__TestAssignment_3_3_2 ) )
            // InternalVpconf.g:2118:1: ( rule__GData__TestAssignment_3_3_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGDataAccess().getTestAssignment_3_3_2()); 
            }
            // InternalVpconf.g:2119:1: ( rule__GData__TestAssignment_3_3_2 )
            // InternalVpconf.g:2119:2: rule__GData__TestAssignment_3_3_2
            {
            pushFollow(FOLLOW_2);
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
    // InternalVpconf.g:2135:1: rule__GData__Group_3_4__0 : rule__GData__Group_3_4__0__Impl rule__GData__Group_3_4__1 ;
    public final void rule__GData__Group_3_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVpconf.g:2139:1: ( rule__GData__Group_3_4__0__Impl rule__GData__Group_3_4__1 )
            // InternalVpconf.g:2140:2: rule__GData__Group_3_4__0__Impl rule__GData__Group_3_4__1
            {
            pushFollow(FOLLOW_20);
            rule__GData__Group_3_4__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
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
    // InternalVpconf.g:2147:1: rule__GData__Group_3_4__0__Impl : ( 'Javadoc' ) ;
    public final void rule__GData__Group_3_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVpconf.g:2151:1: ( ( 'Javadoc' ) )
            // InternalVpconf.g:2152:1: ( 'Javadoc' )
            {
            // InternalVpconf.g:2152:1: ( 'Javadoc' )
            // InternalVpconf.g:2153:1: 'Javadoc'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGDataAccess().getJavadocKeyword_3_4_0()); 
            }
            match(input,30,FOLLOW_2); if (state.failed) return ;
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
    // InternalVpconf.g:2166:1: rule__GData__Group_3_4__1 : rule__GData__Group_3_4__1__Impl rule__GData__Group_3_4__2 ;
    public final void rule__GData__Group_3_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVpconf.g:2170:1: ( rule__GData__Group_3_4__1__Impl rule__GData__Group_3_4__2 )
            // InternalVpconf.g:2171:2: rule__GData__Group_3_4__1__Impl rule__GData__Group_3_4__2
            {
            pushFollow(FOLLOW_21);
            rule__GData__Group_3_4__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
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
    // InternalVpconf.g:2178:1: rule__GData__Group_3_4__1__Impl : ( ':' ) ;
    public final void rule__GData__Group_3_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVpconf.g:2182:1: ( ( ':' ) )
            // InternalVpconf.g:2183:1: ( ':' )
            {
            // InternalVpconf.g:2183:1: ( ':' )
            // InternalVpconf.g:2184:1: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGDataAccess().getColonKeyword_3_4_1()); 
            }
            match(input,26,FOLLOW_2); if (state.failed) return ;
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
    // InternalVpconf.g:2197:1: rule__GData__Group_3_4__2 : rule__GData__Group_3_4__2__Impl ;
    public final void rule__GData__Group_3_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVpconf.g:2201:1: ( rule__GData__Group_3_4__2__Impl )
            // InternalVpconf.g:2202:2: rule__GData__Group_3_4__2__Impl
            {
            pushFollow(FOLLOW_2);
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
    // InternalVpconf.g:2208:1: rule__GData__Group_3_4__2__Impl : ( ( rule__GData__JavaDocAssignment_3_4_2 ) ) ;
    public final void rule__GData__Group_3_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVpconf.g:2212:1: ( ( ( rule__GData__JavaDocAssignment_3_4_2 ) ) )
            // InternalVpconf.g:2213:1: ( ( rule__GData__JavaDocAssignment_3_4_2 ) )
            {
            // InternalVpconf.g:2213:1: ( ( rule__GData__JavaDocAssignment_3_4_2 ) )
            // InternalVpconf.g:2214:1: ( rule__GData__JavaDocAssignment_3_4_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGDataAccess().getJavaDocAssignment_3_4_2()); 
            }
            // InternalVpconf.g:2215:1: ( rule__GData__JavaDocAssignment_3_4_2 )
            // InternalVpconf.g:2215:2: rule__GData__JavaDocAssignment_3_4_2
            {
            pushFollow(FOLLOW_2);
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
    // InternalVpconf.g:2231:1: rule__GData__Group_3_5__0 : rule__GData__Group_3_5__0__Impl rule__GData__Group_3_5__1 ;
    public final void rule__GData__Group_3_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVpconf.g:2235:1: ( rule__GData__Group_3_5__0__Impl rule__GData__Group_3_5__1 )
            // InternalVpconf.g:2236:2: rule__GData__Group_3_5__0__Impl rule__GData__Group_3_5__1
            {
            pushFollow(FOLLOW_20);
            rule__GData__Group_3_5__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
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
    // InternalVpconf.g:2243:1: rule__GData__Group_3_5__0__Impl : ( 'OverwriteEcore' ) ;
    public final void rule__GData__Group_3_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVpconf.g:2247:1: ( ( 'OverwriteEcore' ) )
            // InternalVpconf.g:2248:1: ( 'OverwriteEcore' )
            {
            // InternalVpconf.g:2248:1: ( 'OverwriteEcore' )
            // InternalVpconf.g:2249:1: 'OverwriteEcore'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGDataAccess().getOverwriteEcoreKeyword_3_5_0()); 
            }
            match(input,31,FOLLOW_2); if (state.failed) return ;
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
    // InternalVpconf.g:2262:1: rule__GData__Group_3_5__1 : rule__GData__Group_3_5__1__Impl rule__GData__Group_3_5__2 ;
    public final void rule__GData__Group_3_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVpconf.g:2266:1: ( rule__GData__Group_3_5__1__Impl rule__GData__Group_3_5__2 )
            // InternalVpconf.g:2267:2: rule__GData__Group_3_5__1__Impl rule__GData__Group_3_5__2
            {
            pushFollow(FOLLOW_21);
            rule__GData__Group_3_5__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
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
    // InternalVpconf.g:2274:1: rule__GData__Group_3_5__1__Impl : ( ':' ) ;
    public final void rule__GData__Group_3_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVpconf.g:2278:1: ( ( ':' ) )
            // InternalVpconf.g:2279:1: ( ':' )
            {
            // InternalVpconf.g:2279:1: ( ':' )
            // InternalVpconf.g:2280:1: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGDataAccess().getColonKeyword_3_5_1()); 
            }
            match(input,26,FOLLOW_2); if (state.failed) return ;
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
    // InternalVpconf.g:2293:1: rule__GData__Group_3_5__2 : rule__GData__Group_3_5__2__Impl ;
    public final void rule__GData__Group_3_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVpconf.g:2297:1: ( rule__GData__Group_3_5__2__Impl )
            // InternalVpconf.g:2298:2: rule__GData__Group_3_5__2__Impl
            {
            pushFollow(FOLLOW_2);
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
    // InternalVpconf.g:2304:1: rule__GData__Group_3_5__2__Impl : ( ( rule__GData__OverwriteEcoreAssignment_3_5_2 ) ) ;
    public final void rule__GData__Group_3_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVpconf.g:2308:1: ( ( ( rule__GData__OverwriteEcoreAssignment_3_5_2 ) ) )
            // InternalVpconf.g:2309:1: ( ( rule__GData__OverwriteEcoreAssignment_3_5_2 ) )
            {
            // InternalVpconf.g:2309:1: ( ( rule__GData__OverwriteEcoreAssignment_3_5_2 ) )
            // InternalVpconf.g:2310:1: ( rule__GData__OverwriteEcoreAssignment_3_5_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGDataAccess().getOverwriteEcoreAssignment_3_5_2()); 
            }
            // InternalVpconf.g:2311:1: ( rule__GData__OverwriteEcoreAssignment_3_5_2 )
            // InternalVpconf.g:2311:2: rule__GData__OverwriteEcoreAssignment_3_5_2
            {
            pushFollow(FOLLOW_2);
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
    // InternalVpconf.g:2327:1: rule__DiagramGenerationConfiguration__Group__0 : rule__DiagramGenerationConfiguration__Group__0__Impl rule__DiagramGenerationConfiguration__Group__1 ;
    public final void rule__DiagramGenerationConfiguration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVpconf.g:2331:1: ( rule__DiagramGenerationConfiguration__Group__0__Impl rule__DiagramGenerationConfiguration__Group__1 )
            // InternalVpconf.g:2332:2: rule__DiagramGenerationConfiguration__Group__0__Impl rule__DiagramGenerationConfiguration__Group__1
            {
            pushFollow(FOLLOW_22);
            rule__DiagramGenerationConfiguration__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
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
    // InternalVpconf.g:2339:1: rule__DiagramGenerationConfiguration__Group__0__Impl : ( () ) ;
    public final void rule__DiagramGenerationConfiguration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVpconf.g:2343:1: ( ( () ) )
            // InternalVpconf.g:2344:1: ( () )
            {
            // InternalVpconf.g:2344:1: ( () )
            // InternalVpconf.g:2345:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDiagramGenerationConfigurationAccess().getDiagramGenerationConfigurationAction_0()); 
            }
            // InternalVpconf.g:2346:1: ()
            // InternalVpconf.g:2348:1: 
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
    // InternalVpconf.g:2358:1: rule__DiagramGenerationConfiguration__Group__1 : rule__DiagramGenerationConfiguration__Group__1__Impl rule__DiagramGenerationConfiguration__Group__2 ;
    public final void rule__DiagramGenerationConfiguration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVpconf.g:2362:1: ( rule__DiagramGenerationConfiguration__Group__1__Impl rule__DiagramGenerationConfiguration__Group__2 )
            // InternalVpconf.g:2363:2: rule__DiagramGenerationConfiguration__Group__1__Impl rule__DiagramGenerationConfiguration__Group__2
            {
            pushFollow(FOLLOW_17);
            rule__DiagramGenerationConfiguration__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
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
    // InternalVpconf.g:2370:1: rule__DiagramGenerationConfiguration__Group__1__Impl : ( 'diagram' ) ;
    public final void rule__DiagramGenerationConfiguration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVpconf.g:2374:1: ( ( 'diagram' ) )
            // InternalVpconf.g:2375:1: ( 'diagram' )
            {
            // InternalVpconf.g:2375:1: ( 'diagram' )
            // InternalVpconf.g:2376:1: 'diagram'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDiagramGenerationConfigurationAccess().getDiagramKeyword_1()); 
            }
            match(input,32,FOLLOW_2); if (state.failed) return ;
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
    // InternalVpconf.g:2389:1: rule__DiagramGenerationConfiguration__Group__2 : rule__DiagramGenerationConfiguration__Group__2__Impl rule__DiagramGenerationConfiguration__Group__3 ;
    public final void rule__DiagramGenerationConfiguration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVpconf.g:2393:1: ( rule__DiagramGenerationConfiguration__Group__2__Impl rule__DiagramGenerationConfiguration__Group__3 )
            // InternalVpconf.g:2394:2: rule__DiagramGenerationConfiguration__Group__2__Impl rule__DiagramGenerationConfiguration__Group__3
            {
            pushFollow(FOLLOW_23);
            rule__DiagramGenerationConfiguration__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
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
    // InternalVpconf.g:2401:1: rule__DiagramGenerationConfiguration__Group__2__Impl : ( '(' ) ;
    public final void rule__DiagramGenerationConfiguration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVpconf.g:2405:1: ( ( '(' ) )
            // InternalVpconf.g:2406:1: ( '(' )
            {
            // InternalVpconf.g:2406:1: ( '(' )
            // InternalVpconf.g:2407:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDiagramGenerationConfigurationAccess().getLeftParenthesisKeyword_2()); 
            }
            match(input,23,FOLLOW_2); if (state.failed) return ;
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
    // InternalVpconf.g:2420:1: rule__DiagramGenerationConfiguration__Group__3 : rule__DiagramGenerationConfiguration__Group__3__Impl rule__DiagramGenerationConfiguration__Group__4 ;
    public final void rule__DiagramGenerationConfiguration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVpconf.g:2424:1: ( rule__DiagramGenerationConfiguration__Group__3__Impl rule__DiagramGenerationConfiguration__Group__4 )
            // InternalVpconf.g:2425:2: rule__DiagramGenerationConfiguration__Group__3__Impl rule__DiagramGenerationConfiguration__Group__4
            {
            pushFollow(FOLLOW_23);
            rule__DiagramGenerationConfiguration__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
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
    // InternalVpconf.g:2432:1: rule__DiagramGenerationConfiguration__Group__3__Impl : ( ( rule__DiagramGenerationConfiguration__Group_3__0 )? ) ;
    public final void rule__DiagramGenerationConfiguration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVpconf.g:2436:1: ( ( ( rule__DiagramGenerationConfiguration__Group_3__0 )? ) )
            // InternalVpconf.g:2437:1: ( ( rule__DiagramGenerationConfiguration__Group_3__0 )? )
            {
            // InternalVpconf.g:2437:1: ( ( rule__DiagramGenerationConfiguration__Group_3__0 )? )
            // InternalVpconf.g:2438:1: ( rule__DiagramGenerationConfiguration__Group_3__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDiagramGenerationConfigurationAccess().getGroup_3()); 
            }
            // InternalVpconf.g:2439:1: ( rule__DiagramGenerationConfiguration__Group_3__0 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==33) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalVpconf.g:2439:2: rule__DiagramGenerationConfiguration__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
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
    // InternalVpconf.g:2449:1: rule__DiagramGenerationConfiguration__Group__4 : rule__DiagramGenerationConfiguration__Group__4__Impl ;
    public final void rule__DiagramGenerationConfiguration__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVpconf.g:2453:1: ( rule__DiagramGenerationConfiguration__Group__4__Impl )
            // InternalVpconf.g:2454:2: rule__DiagramGenerationConfiguration__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
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
    // InternalVpconf.g:2460:1: rule__DiagramGenerationConfiguration__Group__4__Impl : ( ')' ) ;
    public final void rule__DiagramGenerationConfiguration__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVpconf.g:2464:1: ( ( ')' ) )
            // InternalVpconf.g:2465:1: ( ')' )
            {
            // InternalVpconf.g:2465:1: ( ')' )
            // InternalVpconf.g:2466:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDiagramGenerationConfigurationAccess().getRightParenthesisKeyword_4()); 
            }
            match(input,24,FOLLOW_2); if (state.failed) return ;
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
    // InternalVpconf.g:2489:1: rule__DiagramGenerationConfiguration__Group_3__0 : rule__DiagramGenerationConfiguration__Group_3__0__Impl rule__DiagramGenerationConfiguration__Group_3__1 ;
    public final void rule__DiagramGenerationConfiguration__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVpconf.g:2493:1: ( rule__DiagramGenerationConfiguration__Group_3__0__Impl rule__DiagramGenerationConfiguration__Group_3__1 )
            // InternalVpconf.g:2494:2: rule__DiagramGenerationConfiguration__Group_3__0__Impl rule__DiagramGenerationConfiguration__Group_3__1
            {
            pushFollow(FOLLOW_20);
            rule__DiagramGenerationConfiguration__Group_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
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
    // InternalVpconf.g:2501:1: rule__DiagramGenerationConfiguration__Group_3__0__Impl : ( 'OverwriteOdesign' ) ;
    public final void rule__DiagramGenerationConfiguration__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVpconf.g:2505:1: ( ( 'OverwriteOdesign' ) )
            // InternalVpconf.g:2506:1: ( 'OverwriteOdesign' )
            {
            // InternalVpconf.g:2506:1: ( 'OverwriteOdesign' )
            // InternalVpconf.g:2507:1: 'OverwriteOdesign'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDiagramGenerationConfigurationAccess().getOverwriteOdesignKeyword_3_0()); 
            }
            match(input,33,FOLLOW_2); if (state.failed) return ;
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
    // InternalVpconf.g:2520:1: rule__DiagramGenerationConfiguration__Group_3__1 : rule__DiagramGenerationConfiguration__Group_3__1__Impl rule__DiagramGenerationConfiguration__Group_3__2 ;
    public final void rule__DiagramGenerationConfiguration__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVpconf.g:2524:1: ( rule__DiagramGenerationConfiguration__Group_3__1__Impl rule__DiagramGenerationConfiguration__Group_3__2 )
            // InternalVpconf.g:2525:2: rule__DiagramGenerationConfiguration__Group_3__1__Impl rule__DiagramGenerationConfiguration__Group_3__2
            {
            pushFollow(FOLLOW_21);
            rule__DiagramGenerationConfiguration__Group_3__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
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
    // InternalVpconf.g:2532:1: rule__DiagramGenerationConfiguration__Group_3__1__Impl : ( ':' ) ;
    public final void rule__DiagramGenerationConfiguration__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVpconf.g:2536:1: ( ( ':' ) )
            // InternalVpconf.g:2537:1: ( ':' )
            {
            // InternalVpconf.g:2537:1: ( ':' )
            // InternalVpconf.g:2538:1: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDiagramGenerationConfigurationAccess().getColonKeyword_3_1()); 
            }
            match(input,26,FOLLOW_2); if (state.failed) return ;
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
    // InternalVpconf.g:2551:1: rule__DiagramGenerationConfiguration__Group_3__2 : rule__DiagramGenerationConfiguration__Group_3__2__Impl ;
    public final void rule__DiagramGenerationConfiguration__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVpconf.g:2555:1: ( rule__DiagramGenerationConfiguration__Group_3__2__Impl )
            // InternalVpconf.g:2556:2: rule__DiagramGenerationConfiguration__Group_3__2__Impl
            {
            pushFollow(FOLLOW_2);
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
    // InternalVpconf.g:2562:1: rule__DiagramGenerationConfiguration__Group_3__2__Impl : ( ( rule__DiagramGenerationConfiguration__OverwriteVSMAssignment_3_2 ) ) ;
    public final void rule__DiagramGenerationConfiguration__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVpconf.g:2566:1: ( ( ( rule__DiagramGenerationConfiguration__OverwriteVSMAssignment_3_2 ) ) )
            // InternalVpconf.g:2567:1: ( ( rule__DiagramGenerationConfiguration__OverwriteVSMAssignment_3_2 ) )
            {
            // InternalVpconf.g:2567:1: ( ( rule__DiagramGenerationConfiguration__OverwriteVSMAssignment_3_2 ) )
            // InternalVpconf.g:2568:1: ( rule__DiagramGenerationConfiguration__OverwriteVSMAssignment_3_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDiagramGenerationConfigurationAccess().getOverwriteVSMAssignment_3_2()); 
            }
            // InternalVpconf.g:2569:1: ( rule__DiagramGenerationConfiguration__OverwriteVSMAssignment_3_2 )
            // InternalVpconf.g:2569:2: rule__DiagramGenerationConfiguration__OverwriteVSMAssignment_3_2
            {
            pushFollow(FOLLOW_2);
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
    // InternalVpconf.g:2585:1: rule__DocumentationGenerationConfiguration__Group__0 : rule__DocumentationGenerationConfiguration__Group__0__Impl rule__DocumentationGenerationConfiguration__Group__1 ;
    public final void rule__DocumentationGenerationConfiguration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVpconf.g:2589:1: ( rule__DocumentationGenerationConfiguration__Group__0__Impl rule__DocumentationGenerationConfiguration__Group__1 )
            // InternalVpconf.g:2590:2: rule__DocumentationGenerationConfiguration__Group__0__Impl rule__DocumentationGenerationConfiguration__Group__1
            {
            pushFollow(FOLLOW_24);
            rule__DocumentationGenerationConfiguration__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
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
    // InternalVpconf.g:2597:1: rule__DocumentationGenerationConfiguration__Group__0__Impl : ( () ) ;
    public final void rule__DocumentationGenerationConfiguration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVpconf.g:2601:1: ( ( () ) )
            // InternalVpconf.g:2602:1: ( () )
            {
            // InternalVpconf.g:2602:1: ( () )
            // InternalVpconf.g:2603:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDocumentationGenerationConfigurationAccess().getDocumentationGenerationConfigurationAction_0()); 
            }
            // InternalVpconf.g:2604:1: ()
            // InternalVpconf.g:2606:1: 
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
    // InternalVpconf.g:2616:1: rule__DocumentationGenerationConfiguration__Group__1 : rule__DocumentationGenerationConfiguration__Group__1__Impl rule__DocumentationGenerationConfiguration__Group__2 ;
    public final void rule__DocumentationGenerationConfiguration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVpconf.g:2620:1: ( rule__DocumentationGenerationConfiguration__Group__1__Impl rule__DocumentationGenerationConfiguration__Group__2 )
            // InternalVpconf.g:2621:2: rule__DocumentationGenerationConfiguration__Group__1__Impl rule__DocumentationGenerationConfiguration__Group__2
            {
            pushFollow(FOLLOW_17);
            rule__DocumentationGenerationConfiguration__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
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
    // InternalVpconf.g:2628:1: rule__DocumentationGenerationConfiguration__Group__1__Impl : ( 'documentation' ) ;
    public final void rule__DocumentationGenerationConfiguration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVpconf.g:2632:1: ( ( 'documentation' ) )
            // InternalVpconf.g:2633:1: ( 'documentation' )
            {
            // InternalVpconf.g:2633:1: ( 'documentation' )
            // InternalVpconf.g:2634:1: 'documentation'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDocumentationGenerationConfigurationAccess().getDocumentationKeyword_1()); 
            }
            match(input,34,FOLLOW_2); if (state.failed) return ;
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
    // InternalVpconf.g:2647:1: rule__DocumentationGenerationConfiguration__Group__2 : rule__DocumentationGenerationConfiguration__Group__2__Impl rule__DocumentationGenerationConfiguration__Group__3 ;
    public final void rule__DocumentationGenerationConfiguration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVpconf.g:2651:1: ( rule__DocumentationGenerationConfiguration__Group__2__Impl rule__DocumentationGenerationConfiguration__Group__3 )
            // InternalVpconf.g:2652:2: rule__DocumentationGenerationConfiguration__Group__2__Impl rule__DocumentationGenerationConfiguration__Group__3
            {
            pushFollow(FOLLOW_25);
            rule__DocumentationGenerationConfiguration__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
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
    // InternalVpconf.g:2659:1: rule__DocumentationGenerationConfiguration__Group__2__Impl : ( '(' ) ;
    public final void rule__DocumentationGenerationConfiguration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVpconf.g:2663:1: ( ( '(' ) )
            // InternalVpconf.g:2664:1: ( '(' )
            {
            // InternalVpconf.g:2664:1: ( '(' )
            // InternalVpconf.g:2665:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDocumentationGenerationConfigurationAccess().getLeftParenthesisKeyword_2()); 
            }
            match(input,23,FOLLOW_2); if (state.failed) return ;
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
    // InternalVpconf.g:2678:1: rule__DocumentationGenerationConfiguration__Group__3 : rule__DocumentationGenerationConfiguration__Group__3__Impl rule__DocumentationGenerationConfiguration__Group__4 ;
    public final void rule__DocumentationGenerationConfiguration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVpconf.g:2682:1: ( rule__DocumentationGenerationConfiguration__Group__3__Impl rule__DocumentationGenerationConfiguration__Group__4 )
            // InternalVpconf.g:2683:2: rule__DocumentationGenerationConfiguration__Group__3__Impl rule__DocumentationGenerationConfiguration__Group__4
            {
            pushFollow(FOLLOW_25);
            rule__DocumentationGenerationConfiguration__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
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
    // InternalVpconf.g:2690:1: rule__DocumentationGenerationConfiguration__Group__3__Impl : ( ( rule__DocumentationGenerationConfiguration__Group_3__0 )? ) ;
    public final void rule__DocumentationGenerationConfiguration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVpconf.g:2694:1: ( ( ( rule__DocumentationGenerationConfiguration__Group_3__0 )? ) )
            // InternalVpconf.g:2695:1: ( ( rule__DocumentationGenerationConfiguration__Group_3__0 )? )
            {
            // InternalVpconf.g:2695:1: ( ( rule__DocumentationGenerationConfiguration__Group_3__0 )? )
            // InternalVpconf.g:2696:1: ( rule__DocumentationGenerationConfiguration__Group_3__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDocumentationGenerationConfigurationAccess().getGroup_3()); 
            }
            // InternalVpconf.g:2697:1: ( rule__DocumentationGenerationConfiguration__Group_3__0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==35) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalVpconf.g:2697:2: rule__DocumentationGenerationConfiguration__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
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
    // InternalVpconf.g:2707:1: rule__DocumentationGenerationConfiguration__Group__4 : rule__DocumentationGenerationConfiguration__Group__4__Impl ;
    public final void rule__DocumentationGenerationConfiguration__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVpconf.g:2711:1: ( rule__DocumentationGenerationConfiguration__Group__4__Impl )
            // InternalVpconf.g:2712:2: rule__DocumentationGenerationConfiguration__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
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
    // InternalVpconf.g:2718:1: rule__DocumentationGenerationConfiguration__Group__4__Impl : ( ')' ) ;
    public final void rule__DocumentationGenerationConfiguration__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVpconf.g:2722:1: ( ( ')' ) )
            // InternalVpconf.g:2723:1: ( ')' )
            {
            // InternalVpconf.g:2723:1: ( ')' )
            // InternalVpconf.g:2724:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDocumentationGenerationConfigurationAccess().getRightParenthesisKeyword_4()); 
            }
            match(input,24,FOLLOW_2); if (state.failed) return ;
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
    // InternalVpconf.g:2747:1: rule__DocumentationGenerationConfiguration__Group_3__0 : rule__DocumentationGenerationConfiguration__Group_3__0__Impl rule__DocumentationGenerationConfiguration__Group_3__1 ;
    public final void rule__DocumentationGenerationConfiguration__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVpconf.g:2751:1: ( rule__DocumentationGenerationConfiguration__Group_3__0__Impl rule__DocumentationGenerationConfiguration__Group_3__1 )
            // InternalVpconf.g:2752:2: rule__DocumentationGenerationConfiguration__Group_3__0__Impl rule__DocumentationGenerationConfiguration__Group_3__1
            {
            pushFollow(FOLLOW_21);
            rule__DocumentationGenerationConfiguration__Group_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
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
    // InternalVpconf.g:2759:1: rule__DocumentationGenerationConfiguration__Group_3__0__Impl : ( 'EcoreToHtml:' ) ;
    public final void rule__DocumentationGenerationConfiguration__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVpconf.g:2763:1: ( ( 'EcoreToHtml:' ) )
            // InternalVpconf.g:2764:1: ( 'EcoreToHtml:' )
            {
            // InternalVpconf.g:2764:1: ( 'EcoreToHtml:' )
            // InternalVpconf.g:2765:1: 'EcoreToHtml:'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDocumentationGenerationConfigurationAccess().getEcoreToHtmlKeyword_3_0()); 
            }
            match(input,35,FOLLOW_2); if (state.failed) return ;
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
    // InternalVpconf.g:2778:1: rule__DocumentationGenerationConfiguration__Group_3__1 : rule__DocumentationGenerationConfiguration__Group_3__1__Impl ;
    public final void rule__DocumentationGenerationConfiguration__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVpconf.g:2782:1: ( rule__DocumentationGenerationConfiguration__Group_3__1__Impl )
            // InternalVpconf.g:2783:2: rule__DocumentationGenerationConfiguration__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
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
    // InternalVpconf.g:2789:1: rule__DocumentationGenerationConfiguration__Group_3__1__Impl : ( ( rule__DocumentationGenerationConfiguration__EcoreToHtmlAssignment_3_1 ) ) ;
    public final void rule__DocumentationGenerationConfiguration__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVpconf.g:2793:1: ( ( ( rule__DocumentationGenerationConfiguration__EcoreToHtmlAssignment_3_1 ) ) )
            // InternalVpconf.g:2794:1: ( ( rule__DocumentationGenerationConfiguration__EcoreToHtmlAssignment_3_1 ) )
            {
            // InternalVpconf.g:2794:1: ( ( rule__DocumentationGenerationConfiguration__EcoreToHtmlAssignment_3_1 ) )
            // InternalVpconf.g:2795:1: ( rule__DocumentationGenerationConfiguration__EcoreToHtmlAssignment_3_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDocumentationGenerationConfigurationAccess().getEcoreToHtmlAssignment_3_1()); 
            }
            // InternalVpconf.g:2796:1: ( rule__DocumentationGenerationConfiguration__EcoreToHtmlAssignment_3_1 )
            // InternalVpconf.g:2796:2: rule__DocumentationGenerationConfiguration__EcoreToHtmlAssignment_3_1
            {
            pushFollow(FOLLOW_2);
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
    // InternalVpconf.g:2810:1: rule__ModelsAirdGenerationConfiguration__Group__0 : rule__ModelsAirdGenerationConfiguration__Group__0__Impl rule__ModelsAirdGenerationConfiguration__Group__1 ;
    public final void rule__ModelsAirdGenerationConfiguration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVpconf.g:2814:1: ( rule__ModelsAirdGenerationConfiguration__Group__0__Impl rule__ModelsAirdGenerationConfiguration__Group__1 )
            // InternalVpconf.g:2815:2: rule__ModelsAirdGenerationConfiguration__Group__0__Impl rule__ModelsAirdGenerationConfiguration__Group__1
            {
            pushFollow(FOLLOW_26);
            rule__ModelsAirdGenerationConfiguration__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
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
    // InternalVpconf.g:2822:1: rule__ModelsAirdGenerationConfiguration__Group__0__Impl : ( () ) ;
    public final void rule__ModelsAirdGenerationConfiguration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVpconf.g:2826:1: ( ( () ) )
            // InternalVpconf.g:2827:1: ( () )
            {
            // InternalVpconf.g:2827:1: ( () )
            // InternalVpconf.g:2828:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelsAirdGenerationConfigurationAccess().getAirdGenerationConfigurationAction_0()); 
            }
            // InternalVpconf.g:2829:1: ()
            // InternalVpconf.g:2831:1: 
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
    // InternalVpconf.g:2841:1: rule__ModelsAirdGenerationConfiguration__Group__1 : rule__ModelsAirdGenerationConfiguration__Group__1__Impl rule__ModelsAirdGenerationConfiguration__Group__2 ;
    public final void rule__ModelsAirdGenerationConfiguration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVpconf.g:2845:1: ( rule__ModelsAirdGenerationConfiguration__Group__1__Impl rule__ModelsAirdGenerationConfiguration__Group__2 )
            // InternalVpconf.g:2846:2: rule__ModelsAirdGenerationConfiguration__Group__1__Impl rule__ModelsAirdGenerationConfiguration__Group__2
            {
            pushFollow(FOLLOW_17);
            rule__ModelsAirdGenerationConfiguration__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
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
    // InternalVpconf.g:2853:1: rule__ModelsAirdGenerationConfiguration__Group__1__Impl : ( 'ecore' ) ;
    public final void rule__ModelsAirdGenerationConfiguration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVpconf.g:2857:1: ( ( 'ecore' ) )
            // InternalVpconf.g:2858:1: ( 'ecore' )
            {
            // InternalVpconf.g:2858:1: ( 'ecore' )
            // InternalVpconf.g:2859:1: 'ecore'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelsAirdGenerationConfigurationAccess().getEcoreKeyword_1()); 
            }
            match(input,36,FOLLOW_2); if (state.failed) return ;
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
    // InternalVpconf.g:2872:1: rule__ModelsAirdGenerationConfiguration__Group__2 : rule__ModelsAirdGenerationConfiguration__Group__2__Impl rule__ModelsAirdGenerationConfiguration__Group__3 ;
    public final void rule__ModelsAirdGenerationConfiguration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVpconf.g:2876:1: ( rule__ModelsAirdGenerationConfiguration__Group__2__Impl rule__ModelsAirdGenerationConfiguration__Group__3 )
            // InternalVpconf.g:2877:2: rule__ModelsAirdGenerationConfiguration__Group__2__Impl rule__ModelsAirdGenerationConfiguration__Group__3
            {
            pushFollow(FOLLOW_27);
            rule__ModelsAirdGenerationConfiguration__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
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
    // InternalVpconf.g:2884:1: rule__ModelsAirdGenerationConfiguration__Group__2__Impl : ( '(' ) ;
    public final void rule__ModelsAirdGenerationConfiguration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVpconf.g:2888:1: ( ( '(' ) )
            // InternalVpconf.g:2889:1: ( '(' )
            {
            // InternalVpconf.g:2889:1: ( '(' )
            // InternalVpconf.g:2890:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelsAirdGenerationConfigurationAccess().getLeftParenthesisKeyword_2()); 
            }
            match(input,23,FOLLOW_2); if (state.failed) return ;
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
    // InternalVpconf.g:2903:1: rule__ModelsAirdGenerationConfiguration__Group__3 : rule__ModelsAirdGenerationConfiguration__Group__3__Impl rule__ModelsAirdGenerationConfiguration__Group__4 ;
    public final void rule__ModelsAirdGenerationConfiguration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVpconf.g:2907:1: ( rule__ModelsAirdGenerationConfiguration__Group__3__Impl rule__ModelsAirdGenerationConfiguration__Group__4 )
            // InternalVpconf.g:2908:2: rule__ModelsAirdGenerationConfiguration__Group__3__Impl rule__ModelsAirdGenerationConfiguration__Group__4
            {
            pushFollow(FOLLOW_27);
            rule__ModelsAirdGenerationConfiguration__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
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
    // InternalVpconf.g:2915:1: rule__ModelsAirdGenerationConfiguration__Group__3__Impl : ( ( rule__ModelsAirdGenerationConfiguration__Group_3__0 )? ) ;
    public final void rule__ModelsAirdGenerationConfiguration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVpconf.g:2919:1: ( ( ( rule__ModelsAirdGenerationConfiguration__Group_3__0 )? ) )
            // InternalVpconf.g:2920:1: ( ( rule__ModelsAirdGenerationConfiguration__Group_3__0 )? )
            {
            // InternalVpconf.g:2920:1: ( ( rule__ModelsAirdGenerationConfiguration__Group_3__0 )? )
            // InternalVpconf.g:2921:1: ( rule__ModelsAirdGenerationConfiguration__Group_3__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelsAirdGenerationConfigurationAccess().getGroup_3()); 
            }
            // InternalVpconf.g:2922:1: ( rule__ModelsAirdGenerationConfiguration__Group_3__0 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==37) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalVpconf.g:2922:2: rule__ModelsAirdGenerationConfiguration__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
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
    // InternalVpconf.g:2932:1: rule__ModelsAirdGenerationConfiguration__Group__4 : rule__ModelsAirdGenerationConfiguration__Group__4__Impl ;
    public final void rule__ModelsAirdGenerationConfiguration__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVpconf.g:2936:1: ( rule__ModelsAirdGenerationConfiguration__Group__4__Impl )
            // InternalVpconf.g:2937:2: rule__ModelsAirdGenerationConfiguration__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
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
    // InternalVpconf.g:2943:1: rule__ModelsAirdGenerationConfiguration__Group__4__Impl : ( ')' ) ;
    public final void rule__ModelsAirdGenerationConfiguration__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVpconf.g:2947:1: ( ( ')' ) )
            // InternalVpconf.g:2948:1: ( ')' )
            {
            // InternalVpconf.g:2948:1: ( ')' )
            // InternalVpconf.g:2949:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelsAirdGenerationConfigurationAccess().getRightParenthesisKeyword_4()); 
            }
            match(input,24,FOLLOW_2); if (state.failed) return ;
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
    // InternalVpconf.g:2972:1: rule__ModelsAirdGenerationConfiguration__Group_3__0 : rule__ModelsAirdGenerationConfiguration__Group_3__0__Impl rule__ModelsAirdGenerationConfiguration__Group_3__1 ;
    public final void rule__ModelsAirdGenerationConfiguration__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVpconf.g:2976:1: ( rule__ModelsAirdGenerationConfiguration__Group_3__0__Impl rule__ModelsAirdGenerationConfiguration__Group_3__1 )
            // InternalVpconf.g:2977:2: rule__ModelsAirdGenerationConfiguration__Group_3__0__Impl rule__ModelsAirdGenerationConfiguration__Group_3__1
            {
            pushFollow(FOLLOW_20);
            rule__ModelsAirdGenerationConfiguration__Group_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
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
    // InternalVpconf.g:2984:1: rule__ModelsAirdGenerationConfiguration__Group_3__0__Impl : ( 'aird' ) ;
    public final void rule__ModelsAirdGenerationConfiguration__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVpconf.g:2988:1: ( ( 'aird' ) )
            // InternalVpconf.g:2989:1: ( 'aird' )
            {
            // InternalVpconf.g:2989:1: ( 'aird' )
            // InternalVpconf.g:2990:1: 'aird'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelsAirdGenerationConfigurationAccess().getAirdKeyword_3_0()); 
            }
            match(input,37,FOLLOW_2); if (state.failed) return ;
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
    // InternalVpconf.g:3003:1: rule__ModelsAirdGenerationConfiguration__Group_3__1 : rule__ModelsAirdGenerationConfiguration__Group_3__1__Impl rule__ModelsAirdGenerationConfiguration__Group_3__2 ;
    public final void rule__ModelsAirdGenerationConfiguration__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVpconf.g:3007:1: ( rule__ModelsAirdGenerationConfiguration__Group_3__1__Impl rule__ModelsAirdGenerationConfiguration__Group_3__2 )
            // InternalVpconf.g:3008:2: rule__ModelsAirdGenerationConfiguration__Group_3__1__Impl rule__ModelsAirdGenerationConfiguration__Group_3__2
            {
            pushFollow(FOLLOW_21);
            rule__ModelsAirdGenerationConfiguration__Group_3__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
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
    // InternalVpconf.g:3015:1: rule__ModelsAirdGenerationConfiguration__Group_3__1__Impl : ( ':' ) ;
    public final void rule__ModelsAirdGenerationConfiguration__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVpconf.g:3019:1: ( ( ':' ) )
            // InternalVpconf.g:3020:1: ( ':' )
            {
            // InternalVpconf.g:3020:1: ( ':' )
            // InternalVpconf.g:3021:1: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelsAirdGenerationConfigurationAccess().getColonKeyword_3_1()); 
            }
            match(input,26,FOLLOW_2); if (state.failed) return ;
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
    // InternalVpconf.g:3034:1: rule__ModelsAirdGenerationConfiguration__Group_3__2 : rule__ModelsAirdGenerationConfiguration__Group_3__2__Impl ;
    public final void rule__ModelsAirdGenerationConfiguration__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVpconf.g:3038:1: ( rule__ModelsAirdGenerationConfiguration__Group_3__2__Impl )
            // InternalVpconf.g:3039:2: rule__ModelsAirdGenerationConfiguration__Group_3__2__Impl
            {
            pushFollow(FOLLOW_2);
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
    // InternalVpconf.g:3045:1: rule__ModelsAirdGenerationConfiguration__Group_3__2__Impl : ( ( rule__ModelsAirdGenerationConfiguration__GenRepresentationsAssignment_3_2 ) ) ;
    public final void rule__ModelsAirdGenerationConfiguration__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVpconf.g:3049:1: ( ( ( rule__ModelsAirdGenerationConfiguration__GenRepresentationsAssignment_3_2 ) ) )
            // InternalVpconf.g:3050:1: ( ( rule__ModelsAirdGenerationConfiguration__GenRepresentationsAssignment_3_2 ) )
            {
            // InternalVpconf.g:3050:1: ( ( rule__ModelsAirdGenerationConfiguration__GenRepresentationsAssignment_3_2 ) )
            // InternalVpconf.g:3051:1: ( rule__ModelsAirdGenerationConfiguration__GenRepresentationsAssignment_3_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelsAirdGenerationConfigurationAccess().getGenRepresentationsAssignment_3_2()); 
            }
            // InternalVpconf.g:3052:1: ( rule__ModelsAirdGenerationConfiguration__GenRepresentationsAssignment_3_2 )
            // InternalVpconf.g:3052:2: rule__ModelsAirdGenerationConfiguration__GenRepresentationsAssignment_3_2
            {
            pushFollow(FOLLOW_2);
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
    // InternalVpconf.g:3068:1: rule__Release__Group__0 : rule__Release__Group__0__Impl rule__Release__Group__1 ;
    public final void rule__Release__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVpconf.g:3072:1: ( rule__Release__Group__0__Impl rule__Release__Group__1 )
            // InternalVpconf.g:3073:2: rule__Release__Group__0__Impl rule__Release__Group__1
            {
            pushFollow(FOLLOW_28);
            rule__Release__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
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
    // InternalVpconf.g:3080:1: rule__Release__Group__0__Impl : ( () ) ;
    public final void rule__Release__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVpconf.g:3084:1: ( ( () ) )
            // InternalVpconf.g:3085:1: ( () )
            {
            // InternalVpconf.g:3085:1: ( () )
            // InternalVpconf.g:3086:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReleaseAccess().getReleaseAction_0()); 
            }
            // InternalVpconf.g:3087:1: ()
            // InternalVpconf.g:3089:1: 
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
    // InternalVpconf.g:3099:1: rule__Release__Group__1 : rule__Release__Group__1__Impl rule__Release__Group__2 ;
    public final void rule__Release__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVpconf.g:3103:1: ( rule__Release__Group__1__Impl rule__Release__Group__2 )
            // InternalVpconf.g:3104:2: rule__Release__Group__1__Impl rule__Release__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__Release__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
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
    // InternalVpconf.g:3111:1: rule__Release__Group__1__Impl : ( 'release' ) ;
    public final void rule__Release__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVpconf.g:3115:1: ( ( 'release' ) )
            // InternalVpconf.g:3116:1: ( 'release' )
            {
            // InternalVpconf.g:3116:1: ( 'release' )
            // InternalVpconf.g:3117:1: 'release'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReleaseAccess().getReleaseKeyword_1()); 
            }
            match(input,38,FOLLOW_2); if (state.failed) return ;
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
    // InternalVpconf.g:3130:1: rule__Release__Group__2 : rule__Release__Group__2__Impl rule__Release__Group__3 ;
    public final void rule__Release__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVpconf.g:3134:1: ( rule__Release__Group__2__Impl rule__Release__Group__3 )
            // InternalVpconf.g:3135:2: rule__Release__Group__2__Impl rule__Release__Group__3
            {
            pushFollow(FOLLOW_29);
            rule__Release__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
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
    // InternalVpconf.g:3142:1: rule__Release__Group__2__Impl : ( '{' ) ;
    public final void rule__Release__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVpconf.g:3146:1: ( ( '{' ) )
            // InternalVpconf.g:3147:1: ( '{' )
            {
            // InternalVpconf.g:3147:1: ( '{' )
            // InternalVpconf.g:3148:1: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReleaseAccess().getLeftCurlyBracketKeyword_2()); 
            }
            match(input,16,FOLLOW_2); if (state.failed) return ;
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
    // InternalVpconf.g:3161:1: rule__Release__Group__3 : rule__Release__Group__3__Impl rule__Release__Group__4 ;
    public final void rule__Release__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVpconf.g:3165:1: ( rule__Release__Group__3__Impl rule__Release__Group__4 )
            // InternalVpconf.g:3166:2: rule__Release__Group__3__Impl rule__Release__Group__4
            {
            pushFollow(FOLLOW_29);
            rule__Release__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
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
    // InternalVpconf.g:3173:1: rule__Release__Group__3__Impl : ( ( rule__Release__Group_3__0 )? ) ;
    public final void rule__Release__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVpconf.g:3177:1: ( ( ( rule__Release__Group_3__0 )? ) )
            // InternalVpconf.g:3178:1: ( ( rule__Release__Group_3__0 )? )
            {
            // InternalVpconf.g:3178:1: ( ( rule__Release__Group_3__0 )? )
            // InternalVpconf.g:3179:1: ( rule__Release__Group_3__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReleaseAccess().getGroup_3()); 
            }
            // InternalVpconf.g:3180:1: ( rule__Release__Group_3__0 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==39) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalVpconf.g:3180:2: rule__Release__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
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
    // InternalVpconf.g:3190:1: rule__Release__Group__4 : rule__Release__Group__4__Impl rule__Release__Group__5 ;
    public final void rule__Release__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVpconf.g:3194:1: ( rule__Release__Group__4__Impl rule__Release__Group__5 )
            // InternalVpconf.g:3195:2: rule__Release__Group__4__Impl rule__Release__Group__5
            {
            pushFollow(FOLLOW_29);
            rule__Release__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
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
    // InternalVpconf.g:3202:1: rule__Release__Group__4__Impl : ( ( rule__Release__Group_4__0 )? ) ;
    public final void rule__Release__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVpconf.g:3206:1: ( ( ( rule__Release__Group_4__0 )? ) )
            // InternalVpconf.g:3207:1: ( ( rule__Release__Group_4__0 )? )
            {
            // InternalVpconf.g:3207:1: ( ( rule__Release__Group_4__0 )? )
            // InternalVpconf.g:3208:1: ( rule__Release__Group_4__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReleaseAccess().getGroup_4()); 
            }
            // InternalVpconf.g:3209:1: ( rule__Release__Group_4__0 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==40) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalVpconf.g:3209:2: rule__Release__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
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
    // InternalVpconf.g:3219:1: rule__Release__Group__5 : rule__Release__Group__5__Impl rule__Release__Group__6 ;
    public final void rule__Release__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVpconf.g:3223:1: ( rule__Release__Group__5__Impl rule__Release__Group__6 )
            // InternalVpconf.g:3224:2: rule__Release__Group__5__Impl rule__Release__Group__6
            {
            pushFollow(FOLLOW_29);
            rule__Release__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
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
    // InternalVpconf.g:3231:1: rule__Release__Group__5__Impl : ( ( rule__Release__Group_5__0 )? ) ;
    public final void rule__Release__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVpconf.g:3235:1: ( ( ( rule__Release__Group_5__0 )? ) )
            // InternalVpconf.g:3236:1: ( ( rule__Release__Group_5__0 )? )
            {
            // InternalVpconf.g:3236:1: ( ( rule__Release__Group_5__0 )? )
            // InternalVpconf.g:3237:1: ( rule__Release__Group_5__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReleaseAccess().getGroup_5()); 
            }
            // InternalVpconf.g:3238:1: ( rule__Release__Group_5__0 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==41) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalVpconf.g:3238:2: rule__Release__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
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
    // InternalVpconf.g:3248:1: rule__Release__Group__6 : rule__Release__Group__6__Impl ;
    public final void rule__Release__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVpconf.g:3252:1: ( rule__Release__Group__6__Impl )
            // InternalVpconf.g:3253:2: rule__Release__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
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
    // InternalVpconf.g:3259:1: rule__Release__Group__6__Impl : ( '}' ) ;
    public final void rule__Release__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVpconf.g:3263:1: ( ( '}' ) )
            // InternalVpconf.g:3264:1: ( '}' )
            {
            // InternalVpconf.g:3264:1: ( '}' )
            // InternalVpconf.g:3265:1: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReleaseAccess().getRightCurlyBracketKeyword_6()); 
            }
            match(input,17,FOLLOW_2); if (state.failed) return ;
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
    // InternalVpconf.g:3292:1: rule__Release__Group_3__0 : rule__Release__Group_3__0__Impl rule__Release__Group_3__1 ;
    public final void rule__Release__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVpconf.g:3296:1: ( rule__Release__Group_3__0__Impl rule__Release__Group_3__1 )
            // InternalVpconf.g:3297:2: rule__Release__Group_3__0__Impl rule__Release__Group_3__1
            {
            pushFollow(FOLLOW_20);
            rule__Release__Group_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
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
    // InternalVpconf.g:3304:1: rule__Release__Group_3__0__Impl : ( 'version' ) ;
    public final void rule__Release__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVpconf.g:3308:1: ( ( 'version' ) )
            // InternalVpconf.g:3309:1: ( 'version' )
            {
            // InternalVpconf.g:3309:1: ( 'version' )
            // InternalVpconf.g:3310:1: 'version'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReleaseAccess().getVersionKeyword_3_0()); 
            }
            match(input,39,FOLLOW_2); if (state.failed) return ;
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
    // InternalVpconf.g:3323:1: rule__Release__Group_3__1 : rule__Release__Group_3__1__Impl rule__Release__Group_3__2 ;
    public final void rule__Release__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVpconf.g:3327:1: ( rule__Release__Group_3__1__Impl rule__Release__Group_3__2 )
            // InternalVpconf.g:3328:2: rule__Release__Group_3__1__Impl rule__Release__Group_3__2
            {
            pushFollow(FOLLOW_30);
            rule__Release__Group_3__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
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
    // InternalVpconf.g:3335:1: rule__Release__Group_3__1__Impl : ( ':' ) ;
    public final void rule__Release__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVpconf.g:3339:1: ( ( ':' ) )
            // InternalVpconf.g:3340:1: ( ':' )
            {
            // InternalVpconf.g:3340:1: ( ':' )
            // InternalVpconf.g:3341:1: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReleaseAccess().getColonKeyword_3_1()); 
            }
            match(input,26,FOLLOW_2); if (state.failed) return ;
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
    // InternalVpconf.g:3354:1: rule__Release__Group_3__2 : rule__Release__Group_3__2__Impl ;
    public final void rule__Release__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVpconf.g:3358:1: ( rule__Release__Group_3__2__Impl )
            // InternalVpconf.g:3359:2: rule__Release__Group_3__2__Impl
            {
            pushFollow(FOLLOW_2);
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
    // InternalVpconf.g:3365:1: rule__Release__Group_3__2__Impl : ( ( rule__Release__ViewpointVersionAssignment_3_2 ) ) ;
    public final void rule__Release__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVpconf.g:3369:1: ( ( ( rule__Release__ViewpointVersionAssignment_3_2 ) ) )
            // InternalVpconf.g:3370:1: ( ( rule__Release__ViewpointVersionAssignment_3_2 ) )
            {
            // InternalVpconf.g:3370:1: ( ( rule__Release__ViewpointVersionAssignment_3_2 ) )
            // InternalVpconf.g:3371:1: ( rule__Release__ViewpointVersionAssignment_3_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReleaseAccess().getViewpointVersionAssignment_3_2()); 
            }
            // InternalVpconf.g:3372:1: ( rule__Release__ViewpointVersionAssignment_3_2 )
            // InternalVpconf.g:3372:2: rule__Release__ViewpointVersionAssignment_3_2
            {
            pushFollow(FOLLOW_2);
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
    // InternalVpconf.g:3388:1: rule__Release__Group_4__0 : rule__Release__Group_4__0__Impl rule__Release__Group_4__1 ;
    public final void rule__Release__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVpconf.g:3392:1: ( rule__Release__Group_4__0__Impl rule__Release__Group_4__1 )
            // InternalVpconf.g:3393:2: rule__Release__Group_4__0__Impl rule__Release__Group_4__1
            {
            pushFollow(FOLLOW_20);
            rule__Release__Group_4__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
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
    // InternalVpconf.g:3400:1: rule__Release__Group_4__0__Impl : ( 'description' ) ;
    public final void rule__Release__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVpconf.g:3404:1: ( ( 'description' ) )
            // InternalVpconf.g:3405:1: ( 'description' )
            {
            // InternalVpconf.g:3405:1: ( 'description' )
            // InternalVpconf.g:3406:1: 'description'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReleaseAccess().getDescriptionKeyword_4_0()); 
            }
            match(input,40,FOLLOW_2); if (state.failed) return ;
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
    // InternalVpconf.g:3419:1: rule__Release__Group_4__1 : rule__Release__Group_4__1__Impl rule__Release__Group_4__2 ;
    public final void rule__Release__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVpconf.g:3423:1: ( rule__Release__Group_4__1__Impl rule__Release__Group_4__2 )
            // InternalVpconf.g:3424:2: rule__Release__Group_4__1__Impl rule__Release__Group_4__2
            {
            pushFollow(FOLLOW_9);
            rule__Release__Group_4__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
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
    // InternalVpconf.g:3431:1: rule__Release__Group_4__1__Impl : ( ':' ) ;
    public final void rule__Release__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVpconf.g:3435:1: ( ( ':' ) )
            // InternalVpconf.g:3436:1: ( ':' )
            {
            // InternalVpconf.g:3436:1: ( ':' )
            // InternalVpconf.g:3437:1: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReleaseAccess().getColonKeyword_4_1()); 
            }
            match(input,26,FOLLOW_2); if (state.failed) return ;
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
    // InternalVpconf.g:3450:1: rule__Release__Group_4__2 : rule__Release__Group_4__2__Impl ;
    public final void rule__Release__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVpconf.g:3454:1: ( rule__Release__Group_4__2__Impl )
            // InternalVpconf.g:3455:2: rule__Release__Group_4__2__Impl
            {
            pushFollow(FOLLOW_2);
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
    // InternalVpconf.g:3461:1: rule__Release__Group_4__2__Impl : ( ( rule__Release__ViewpointDescriptionAssignment_4_2 ) ) ;
    public final void rule__Release__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVpconf.g:3465:1: ( ( ( rule__Release__ViewpointDescriptionAssignment_4_2 ) ) )
            // InternalVpconf.g:3466:1: ( ( rule__Release__ViewpointDescriptionAssignment_4_2 ) )
            {
            // InternalVpconf.g:3466:1: ( ( rule__Release__ViewpointDescriptionAssignment_4_2 ) )
            // InternalVpconf.g:3467:1: ( rule__Release__ViewpointDescriptionAssignment_4_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReleaseAccess().getViewpointDescriptionAssignment_4_2()); 
            }
            // InternalVpconf.g:3468:1: ( rule__Release__ViewpointDescriptionAssignment_4_2 )
            // InternalVpconf.g:3468:2: rule__Release__ViewpointDescriptionAssignment_4_2
            {
            pushFollow(FOLLOW_2);
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
    // InternalVpconf.g:3484:1: rule__Release__Group_5__0 : rule__Release__Group_5__0__Impl rule__Release__Group_5__1 ;
    public final void rule__Release__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVpconf.g:3488:1: ( rule__Release__Group_5__0__Impl rule__Release__Group_5__1 )
            // InternalVpconf.g:3489:2: rule__Release__Group_5__0__Impl rule__Release__Group_5__1
            {
            pushFollow(FOLLOW_31);
            rule__Release__Group_5__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
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
    // InternalVpconf.g:3496:1: rule__Release__Group_5__0__Impl : ( 'execution' ) ;
    public final void rule__Release__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVpconf.g:3500:1: ( ( 'execution' ) )
            // InternalVpconf.g:3501:1: ( 'execution' )
            {
            // InternalVpconf.g:3501:1: ( 'execution' )
            // InternalVpconf.g:3502:1: 'execution'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReleaseAccess().getExecutionKeyword_5_0()); 
            }
            match(input,41,FOLLOW_2); if (state.failed) return ;
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
    // InternalVpconf.g:3515:1: rule__Release__Group_5__1 : rule__Release__Group_5__1__Impl rule__Release__Group_5__2 ;
    public final void rule__Release__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVpconf.g:3519:1: ( rule__Release__Group_5__1__Impl rule__Release__Group_5__2 )
            // InternalVpconf.g:3520:2: rule__Release__Group_5__1__Impl rule__Release__Group_5__2
            {
            pushFollow(FOLLOW_20);
            rule__Release__Group_5__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
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
    // InternalVpconf.g:3527:1: rule__Release__Group_5__1__Impl : ( 'environments' ) ;
    public final void rule__Release__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVpconf.g:3531:1: ( ( 'environments' ) )
            // InternalVpconf.g:3532:1: ( 'environments' )
            {
            // InternalVpconf.g:3532:1: ( 'environments' )
            // InternalVpconf.g:3533:1: 'environments'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReleaseAccess().getEnvironmentsKeyword_5_1()); 
            }
            match(input,42,FOLLOW_2); if (state.failed) return ;
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
    // InternalVpconf.g:3546:1: rule__Release__Group_5__2 : rule__Release__Group_5__2__Impl rule__Release__Group_5__3 ;
    public final void rule__Release__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVpconf.g:3550:1: ( rule__Release__Group_5__2__Impl rule__Release__Group_5__3 )
            // InternalVpconf.g:3551:2: rule__Release__Group_5__2__Impl rule__Release__Group_5__3
            {
            pushFollow(FOLLOW_12);
            rule__Release__Group_5__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
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
    // InternalVpconf.g:3558:1: rule__Release__Group_5__2__Impl : ( ':' ) ;
    public final void rule__Release__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVpconf.g:3562:1: ( ( ':' ) )
            // InternalVpconf.g:3563:1: ( ':' )
            {
            // InternalVpconf.g:3563:1: ( ':' )
            // InternalVpconf.g:3564:1: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReleaseAccess().getColonKeyword_5_2()); 
            }
            match(input,26,FOLLOW_2); if (state.failed) return ;
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
    // InternalVpconf.g:3577:1: rule__Release__Group_5__3 : rule__Release__Group_5__3__Impl ;
    public final void rule__Release__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVpconf.g:3581:1: ( rule__Release__Group_5__3__Impl )
            // InternalVpconf.g:3582:2: rule__Release__Group_5__3__Impl
            {
            pushFollow(FOLLOW_2);
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
    // InternalVpconf.g:3588:1: rule__Release__Group_5__3__Impl : ( ( rule__Release__Group_5_3__0 ) ) ;
    public final void rule__Release__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVpconf.g:3592:1: ( ( ( rule__Release__Group_5_3__0 ) ) )
            // InternalVpconf.g:3593:1: ( ( rule__Release__Group_5_3__0 ) )
            {
            // InternalVpconf.g:3593:1: ( ( rule__Release__Group_5_3__0 ) )
            // InternalVpconf.g:3594:1: ( rule__Release__Group_5_3__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReleaseAccess().getGroup_5_3()); 
            }
            // InternalVpconf.g:3595:1: ( rule__Release__Group_5_3__0 )
            // InternalVpconf.g:3595:2: rule__Release__Group_5_3__0
            {
            pushFollow(FOLLOW_2);
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
    // InternalVpconf.g:3613:1: rule__Release__Group_5_3__0 : rule__Release__Group_5_3__0__Impl rule__Release__Group_5_3__1 ;
    public final void rule__Release__Group_5_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVpconf.g:3617:1: ( rule__Release__Group_5_3__0__Impl rule__Release__Group_5_3__1 )
            // InternalVpconf.g:3618:2: rule__Release__Group_5_3__0__Impl rule__Release__Group_5_3__1
            {
            pushFollow(FOLLOW_32);
            rule__Release__Group_5_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
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
    // InternalVpconf.g:3625:1: rule__Release__Group_5_3__0__Impl : ( ( rule__Release__RequiredExecutionEnvironmentAssignment_5_3_0 ) ) ;
    public final void rule__Release__Group_5_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVpconf.g:3629:1: ( ( ( rule__Release__RequiredExecutionEnvironmentAssignment_5_3_0 ) ) )
            // InternalVpconf.g:3630:1: ( ( rule__Release__RequiredExecutionEnvironmentAssignment_5_3_0 ) )
            {
            // InternalVpconf.g:3630:1: ( ( rule__Release__RequiredExecutionEnvironmentAssignment_5_3_0 ) )
            // InternalVpconf.g:3631:1: ( rule__Release__RequiredExecutionEnvironmentAssignment_5_3_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReleaseAccess().getRequiredExecutionEnvironmentAssignment_5_3_0()); 
            }
            // InternalVpconf.g:3632:1: ( rule__Release__RequiredExecutionEnvironmentAssignment_5_3_0 )
            // InternalVpconf.g:3632:2: rule__Release__RequiredExecutionEnvironmentAssignment_5_3_0
            {
            pushFollow(FOLLOW_2);
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
    // InternalVpconf.g:3642:1: rule__Release__Group_5_3__1 : rule__Release__Group_5_3__1__Impl ;
    public final void rule__Release__Group_5_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVpconf.g:3646:1: ( rule__Release__Group_5_3__1__Impl )
            // InternalVpconf.g:3647:2: rule__Release__Group_5_3__1__Impl
            {
            pushFollow(FOLLOW_2);
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
    // InternalVpconf.g:3653:1: rule__Release__Group_5_3__1__Impl : ( ( rule__Release__Group_5_3_1__0 )* ) ;
    public final void rule__Release__Group_5_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVpconf.g:3657:1: ( ( ( rule__Release__Group_5_3_1__0 )* ) )
            // InternalVpconf.g:3658:1: ( ( rule__Release__Group_5_3_1__0 )* )
            {
            // InternalVpconf.g:3658:1: ( ( rule__Release__Group_5_3_1__0 )* )
            // InternalVpconf.g:3659:1: ( rule__Release__Group_5_3_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReleaseAccess().getGroup_5_3_1()); 
            }
            // InternalVpconf.g:3660:1: ( rule__Release__Group_5_3_1__0 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==43) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalVpconf.g:3660:2: rule__Release__Group_5_3_1__0
            	    {
            	    pushFollow(FOLLOW_33);
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
    // InternalVpconf.g:3674:1: rule__Release__Group_5_3_1__0 : rule__Release__Group_5_3_1__0__Impl rule__Release__Group_5_3_1__1 ;
    public final void rule__Release__Group_5_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVpconf.g:3678:1: ( rule__Release__Group_5_3_1__0__Impl rule__Release__Group_5_3_1__1 )
            // InternalVpconf.g:3679:2: rule__Release__Group_5_3_1__0__Impl rule__Release__Group_5_3_1__1
            {
            pushFollow(FOLLOW_12);
            rule__Release__Group_5_3_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
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
    // InternalVpconf.g:3686:1: rule__Release__Group_5_3_1__0__Impl : ( ',' ) ;
    public final void rule__Release__Group_5_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVpconf.g:3690:1: ( ( ',' ) )
            // InternalVpconf.g:3691:1: ( ',' )
            {
            // InternalVpconf.g:3691:1: ( ',' )
            // InternalVpconf.g:3692:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReleaseAccess().getCommaKeyword_5_3_1_0()); 
            }
            match(input,43,FOLLOW_2); if (state.failed) return ;
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
    // InternalVpconf.g:3705:1: rule__Release__Group_5_3_1__1 : rule__Release__Group_5_3_1__1__Impl ;
    public final void rule__Release__Group_5_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVpconf.g:3709:1: ( rule__Release__Group_5_3_1__1__Impl )
            // InternalVpconf.g:3710:2: rule__Release__Group_5_3_1__1__Impl
            {
            pushFollow(FOLLOW_2);
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
    // InternalVpconf.g:3716:1: rule__Release__Group_5_3_1__1__Impl : ( ( rule__Release__RequiredExecutionEnvironmentAssignment_5_3_1_1 ) ) ;
    public final void rule__Release__Group_5_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVpconf.g:3720:1: ( ( ( rule__Release__RequiredExecutionEnvironmentAssignment_5_3_1_1 ) ) )
            // InternalVpconf.g:3721:1: ( ( rule__Release__RequiredExecutionEnvironmentAssignment_5_3_1_1 ) )
            {
            // InternalVpconf.g:3721:1: ( ( rule__Release__RequiredExecutionEnvironmentAssignment_5_3_1_1 ) )
            // InternalVpconf.g:3722:1: ( rule__Release__RequiredExecutionEnvironmentAssignment_5_3_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReleaseAccess().getRequiredExecutionEnvironmentAssignment_5_3_1_1()); 
            }
            // InternalVpconf.g:3723:1: ( rule__Release__RequiredExecutionEnvironmentAssignment_5_3_1_1 )
            // InternalVpconf.g:3723:2: rule__Release__RequiredExecutionEnvironmentAssignment_5_3_1_1
            {
            pushFollow(FOLLOW_2);
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


    // $ANTLR start "rule__ViewConfiguration__Group__0"
    // InternalVpconf.g:3737:1: rule__ViewConfiguration__Group__0 : rule__ViewConfiguration__Group__0__Impl rule__ViewConfiguration__Group__1 ;
    public final void rule__ViewConfiguration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVpconf.g:3741:1: ( rule__ViewConfiguration__Group__0__Impl rule__ViewConfiguration__Group__1 )
            // InternalVpconf.g:3742:2: rule__ViewConfiguration__Group__0__Impl rule__ViewConfiguration__Group__1
            {
            pushFollow(FOLLOW_34);
            rule__ViewConfiguration__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ViewConfiguration__Group__1();

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
    // $ANTLR end "rule__ViewConfiguration__Group__0"


    // $ANTLR start "rule__ViewConfiguration__Group__0__Impl"
    // InternalVpconf.g:3749:1: rule__ViewConfiguration__Group__0__Impl : ( () ) ;
    public final void rule__ViewConfiguration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVpconf.g:3753:1: ( ( () ) )
            // InternalVpconf.g:3754:1: ( () )
            {
            // InternalVpconf.g:3754:1: ( () )
            // InternalVpconf.g:3755:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getViewConfigurationAccess().getViewConfigurationAction_0()); 
            }
            // InternalVpconf.g:3756:1: ()
            // InternalVpconf.g:3758:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getViewConfigurationAccess().getViewConfigurationAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ViewConfiguration__Group__0__Impl"


    // $ANTLR start "rule__ViewConfiguration__Group__1"
    // InternalVpconf.g:3768:1: rule__ViewConfiguration__Group__1 : rule__ViewConfiguration__Group__1__Impl rule__ViewConfiguration__Group__2 ;
    public final void rule__ViewConfiguration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVpconf.g:3772:1: ( rule__ViewConfiguration__Group__1__Impl rule__ViewConfiguration__Group__2 )
            // InternalVpconf.g:3773:2: rule__ViewConfiguration__Group__1__Impl rule__ViewConfiguration__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__ViewConfiguration__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ViewConfiguration__Group__2();

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
    // $ANTLR end "rule__ViewConfiguration__Group__1"


    // $ANTLR start "rule__ViewConfiguration__Group__1__Impl"
    // InternalVpconf.g:3780:1: rule__ViewConfiguration__Group__1__Impl : ( 'view' ) ;
    public final void rule__ViewConfiguration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVpconf.g:3784:1: ( ( 'view' ) )
            // InternalVpconf.g:3785:1: ( 'view' )
            {
            // InternalVpconf.g:3785:1: ( 'view' )
            // InternalVpconf.g:3786:1: 'view'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getViewConfigurationAccess().getViewKeyword_1()); 
            }
            match(input,44,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getViewConfigurationAccess().getViewKeyword_1()); 
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
    // $ANTLR end "rule__ViewConfiguration__Group__1__Impl"


    // $ANTLR start "rule__ViewConfiguration__Group__2"
    // InternalVpconf.g:3799:1: rule__ViewConfiguration__Group__2 : rule__ViewConfiguration__Group__2__Impl rule__ViewConfiguration__Group__3 ;
    public final void rule__ViewConfiguration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVpconf.g:3803:1: ( rule__ViewConfiguration__Group__2__Impl rule__ViewConfiguration__Group__3 )
            // InternalVpconf.g:3804:2: rule__ViewConfiguration__Group__2__Impl rule__ViewConfiguration__Group__3
            {
            pushFollow(FOLLOW_35);
            rule__ViewConfiguration__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ViewConfiguration__Group__3();

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
    // $ANTLR end "rule__ViewConfiguration__Group__2"


    // $ANTLR start "rule__ViewConfiguration__Group__2__Impl"
    // InternalVpconf.g:3811:1: rule__ViewConfiguration__Group__2__Impl : ( '{' ) ;
    public final void rule__ViewConfiguration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVpconf.g:3815:1: ( ( '{' ) )
            // InternalVpconf.g:3816:1: ( '{' )
            {
            // InternalVpconf.g:3816:1: ( '{' )
            // InternalVpconf.g:3817:1: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getViewConfigurationAccess().getLeftCurlyBracketKeyword_2()); 
            }
            match(input,16,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getViewConfigurationAccess().getLeftCurlyBracketKeyword_2()); 
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
    // $ANTLR end "rule__ViewConfiguration__Group__2__Impl"


    // $ANTLR start "rule__ViewConfiguration__Group__3"
    // InternalVpconf.g:3830:1: rule__ViewConfiguration__Group__3 : rule__ViewConfiguration__Group__3__Impl rule__ViewConfiguration__Group__4 ;
    public final void rule__ViewConfiguration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVpconf.g:3834:1: ( rule__ViewConfiguration__Group__3__Impl rule__ViewConfiguration__Group__4 )
            // InternalVpconf.g:3835:2: rule__ViewConfiguration__Group__3__Impl rule__ViewConfiguration__Group__4
            {
            pushFollow(FOLLOW_35);
            rule__ViewConfiguration__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ViewConfiguration__Group__4();

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
    // $ANTLR end "rule__ViewConfiguration__Group__3"


    // $ANTLR start "rule__ViewConfiguration__Group__3__Impl"
    // InternalVpconf.g:3842:1: rule__ViewConfiguration__Group__3__Impl : ( ( rule__ViewConfiguration__Group_3__0 )? ) ;
    public final void rule__ViewConfiguration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVpconf.g:3846:1: ( ( ( rule__ViewConfiguration__Group_3__0 )? ) )
            // InternalVpconf.g:3847:1: ( ( rule__ViewConfiguration__Group_3__0 )? )
            {
            // InternalVpconf.g:3847:1: ( ( rule__ViewConfiguration__Group_3__0 )? )
            // InternalVpconf.g:3848:1: ( rule__ViewConfiguration__Group_3__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getViewConfigurationAccess().getGroup_3()); 
            }
            // InternalVpconf.g:3849:1: ( rule__ViewConfiguration__Group_3__0 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==45) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalVpconf.g:3849:2: rule__ViewConfiguration__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ViewConfiguration__Group_3__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getViewConfigurationAccess().getGroup_3()); 
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
    // $ANTLR end "rule__ViewConfiguration__Group__3__Impl"


    // $ANTLR start "rule__ViewConfiguration__Group__4"
    // InternalVpconf.g:3859:1: rule__ViewConfiguration__Group__4 : rule__ViewConfiguration__Group__4__Impl rule__ViewConfiguration__Group__5 ;
    public final void rule__ViewConfiguration__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVpconf.g:3863:1: ( rule__ViewConfiguration__Group__4__Impl rule__ViewConfiguration__Group__5 )
            // InternalVpconf.g:3864:2: rule__ViewConfiguration__Group__4__Impl rule__ViewConfiguration__Group__5
            {
            pushFollow(FOLLOW_35);
            rule__ViewConfiguration__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ViewConfiguration__Group__5();

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
    // $ANTLR end "rule__ViewConfiguration__Group__4"


    // $ANTLR start "rule__ViewConfiguration__Group__4__Impl"
    // InternalVpconf.g:3871:1: rule__ViewConfiguration__Group__4__Impl : ( ( rule__ViewConfiguration__Group_4__0 )? ) ;
    public final void rule__ViewConfiguration__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVpconf.g:3875:1: ( ( ( rule__ViewConfiguration__Group_4__0 )? ) )
            // InternalVpconf.g:3876:1: ( ( rule__ViewConfiguration__Group_4__0 )? )
            {
            // InternalVpconf.g:3876:1: ( ( rule__ViewConfiguration__Group_4__0 )? )
            // InternalVpconf.g:3877:1: ( rule__ViewConfiguration__Group_4__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getViewConfigurationAccess().getGroup_4()); 
            }
            // InternalVpconf.g:3878:1: ( rule__ViewConfiguration__Group_4__0 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==46) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalVpconf.g:3878:2: rule__ViewConfiguration__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ViewConfiguration__Group_4__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getViewConfigurationAccess().getGroup_4()); 
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
    // $ANTLR end "rule__ViewConfiguration__Group__4__Impl"


    // $ANTLR start "rule__ViewConfiguration__Group__5"
    // InternalVpconf.g:3888:1: rule__ViewConfiguration__Group__5 : rule__ViewConfiguration__Group__5__Impl ;
    public final void rule__ViewConfiguration__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVpconf.g:3892:1: ( rule__ViewConfiguration__Group__5__Impl )
            // InternalVpconf.g:3893:2: rule__ViewConfiguration__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ViewConfiguration__Group__5__Impl();

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
    // $ANTLR end "rule__ViewConfiguration__Group__5"


    // $ANTLR start "rule__ViewConfiguration__Group__5__Impl"
    // InternalVpconf.g:3899:1: rule__ViewConfiguration__Group__5__Impl : ( '}' ) ;
    public final void rule__ViewConfiguration__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVpconf.g:3903:1: ( ( '}' ) )
            // InternalVpconf.g:3904:1: ( '}' )
            {
            // InternalVpconf.g:3904:1: ( '}' )
            // InternalVpconf.g:3905:1: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getViewConfigurationAccess().getRightCurlyBracketKeyword_5()); 
            }
            match(input,17,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getViewConfigurationAccess().getRightCurlyBracketKeyword_5()); 
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
    // $ANTLR end "rule__ViewConfiguration__Group__5__Impl"


    // $ANTLR start "rule__ViewConfiguration__Group_3__0"
    // InternalVpconf.g:3930:1: rule__ViewConfiguration__Group_3__0 : rule__ViewConfiguration__Group_3__0__Impl rule__ViewConfiguration__Group_3__1 ;
    public final void rule__ViewConfiguration__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVpconf.g:3934:1: ( rule__ViewConfiguration__Group_3__0__Impl rule__ViewConfiguration__Group_3__1 )
            // InternalVpconf.g:3935:2: rule__ViewConfiguration__Group_3__0__Impl rule__ViewConfiguration__Group_3__1
            {
            pushFollow(FOLLOW_20);
            rule__ViewConfiguration__Group_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ViewConfiguration__Group_3__1();

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
    // $ANTLR end "rule__ViewConfiguration__Group_3__0"


    // $ANTLR start "rule__ViewConfiguration__Group_3__0__Impl"
    // InternalVpconf.g:3942:1: rule__ViewConfiguration__Group_3__0__Impl : ( 'visible' ) ;
    public final void rule__ViewConfiguration__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVpconf.g:3946:1: ( ( 'visible' ) )
            // InternalVpconf.g:3947:1: ( 'visible' )
            {
            // InternalVpconf.g:3947:1: ( 'visible' )
            // InternalVpconf.g:3948:1: 'visible'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getViewConfigurationAccess().getVisibleKeyword_3_0()); 
            }
            match(input,45,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getViewConfigurationAccess().getVisibleKeyword_3_0()); 
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
    // $ANTLR end "rule__ViewConfiguration__Group_3__0__Impl"


    // $ANTLR start "rule__ViewConfiguration__Group_3__1"
    // InternalVpconf.g:3961:1: rule__ViewConfiguration__Group_3__1 : rule__ViewConfiguration__Group_3__1__Impl rule__ViewConfiguration__Group_3__2 ;
    public final void rule__ViewConfiguration__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVpconf.g:3965:1: ( rule__ViewConfiguration__Group_3__1__Impl rule__ViewConfiguration__Group_3__2 )
            // InternalVpconf.g:3966:2: rule__ViewConfiguration__Group_3__1__Impl rule__ViewConfiguration__Group_3__2
            {
            pushFollow(FOLLOW_21);
            rule__ViewConfiguration__Group_3__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ViewConfiguration__Group_3__2();

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
    // $ANTLR end "rule__ViewConfiguration__Group_3__1"


    // $ANTLR start "rule__ViewConfiguration__Group_3__1__Impl"
    // InternalVpconf.g:3973:1: rule__ViewConfiguration__Group_3__1__Impl : ( ':' ) ;
    public final void rule__ViewConfiguration__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVpconf.g:3977:1: ( ( ':' ) )
            // InternalVpconf.g:3978:1: ( ':' )
            {
            // InternalVpconf.g:3978:1: ( ':' )
            // InternalVpconf.g:3979:1: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getViewConfigurationAccess().getColonKeyword_3_1()); 
            }
            match(input,26,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getViewConfigurationAccess().getColonKeyword_3_1()); 
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
    // $ANTLR end "rule__ViewConfiguration__Group_3__1__Impl"


    // $ANTLR start "rule__ViewConfiguration__Group_3__2"
    // InternalVpconf.g:3992:1: rule__ViewConfiguration__Group_3__2 : rule__ViewConfiguration__Group_3__2__Impl ;
    public final void rule__ViewConfiguration__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVpconf.g:3996:1: ( rule__ViewConfiguration__Group_3__2__Impl )
            // InternalVpconf.g:3997:2: rule__ViewConfiguration__Group_3__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ViewConfiguration__Group_3__2__Impl();

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
    // $ANTLR end "rule__ViewConfiguration__Group_3__2"


    // $ANTLR start "rule__ViewConfiguration__Group_3__2__Impl"
    // InternalVpconf.g:4003:1: rule__ViewConfiguration__Group_3__2__Impl : ( ( rule__ViewConfiguration__VisibleAssignment_3_2 ) ) ;
    public final void rule__ViewConfiguration__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVpconf.g:4007:1: ( ( ( rule__ViewConfiguration__VisibleAssignment_3_2 ) ) )
            // InternalVpconf.g:4008:1: ( ( rule__ViewConfiguration__VisibleAssignment_3_2 ) )
            {
            // InternalVpconf.g:4008:1: ( ( rule__ViewConfiguration__VisibleAssignment_3_2 ) )
            // InternalVpconf.g:4009:1: ( rule__ViewConfiguration__VisibleAssignment_3_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getViewConfigurationAccess().getVisibleAssignment_3_2()); 
            }
            // InternalVpconf.g:4010:1: ( rule__ViewConfiguration__VisibleAssignment_3_2 )
            // InternalVpconf.g:4010:2: rule__ViewConfiguration__VisibleAssignment_3_2
            {
            pushFollow(FOLLOW_2);
            rule__ViewConfiguration__VisibleAssignment_3_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getViewConfigurationAccess().getVisibleAssignment_3_2()); 
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
    // $ANTLR end "rule__ViewConfiguration__Group_3__2__Impl"


    // $ANTLR start "rule__ViewConfiguration__Group_4__0"
    // InternalVpconf.g:4026:1: rule__ViewConfiguration__Group_4__0 : rule__ViewConfiguration__Group_4__0__Impl rule__ViewConfiguration__Group_4__1 ;
    public final void rule__ViewConfiguration__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVpconf.g:4030:1: ( rule__ViewConfiguration__Group_4__0__Impl rule__ViewConfiguration__Group_4__1 )
            // InternalVpconf.g:4031:2: rule__ViewConfiguration__Group_4__0__Impl rule__ViewConfiguration__Group_4__1
            {
            pushFollow(FOLLOW_20);
            rule__ViewConfiguration__Group_4__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ViewConfiguration__Group_4__1();

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
    // $ANTLR end "rule__ViewConfiguration__Group_4__0"


    // $ANTLR start "rule__ViewConfiguration__Group_4__0__Impl"
    // InternalVpconf.g:4038:1: rule__ViewConfiguration__Group_4__0__Impl : ( 'activable' ) ;
    public final void rule__ViewConfiguration__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVpconf.g:4042:1: ( ( 'activable' ) )
            // InternalVpconf.g:4043:1: ( 'activable' )
            {
            // InternalVpconf.g:4043:1: ( 'activable' )
            // InternalVpconf.g:4044:1: 'activable'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getViewConfigurationAccess().getActivableKeyword_4_0()); 
            }
            match(input,46,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getViewConfigurationAccess().getActivableKeyword_4_0()); 
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
    // $ANTLR end "rule__ViewConfiguration__Group_4__0__Impl"


    // $ANTLR start "rule__ViewConfiguration__Group_4__1"
    // InternalVpconf.g:4057:1: rule__ViewConfiguration__Group_4__1 : rule__ViewConfiguration__Group_4__1__Impl rule__ViewConfiguration__Group_4__2 ;
    public final void rule__ViewConfiguration__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVpconf.g:4061:1: ( rule__ViewConfiguration__Group_4__1__Impl rule__ViewConfiguration__Group_4__2 )
            // InternalVpconf.g:4062:2: rule__ViewConfiguration__Group_4__1__Impl rule__ViewConfiguration__Group_4__2
            {
            pushFollow(FOLLOW_21);
            rule__ViewConfiguration__Group_4__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ViewConfiguration__Group_4__2();

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
    // $ANTLR end "rule__ViewConfiguration__Group_4__1"


    // $ANTLR start "rule__ViewConfiguration__Group_4__1__Impl"
    // InternalVpconf.g:4069:1: rule__ViewConfiguration__Group_4__1__Impl : ( ':' ) ;
    public final void rule__ViewConfiguration__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVpconf.g:4073:1: ( ( ':' ) )
            // InternalVpconf.g:4074:1: ( ':' )
            {
            // InternalVpconf.g:4074:1: ( ':' )
            // InternalVpconf.g:4075:1: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getViewConfigurationAccess().getColonKeyword_4_1()); 
            }
            match(input,26,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getViewConfigurationAccess().getColonKeyword_4_1()); 
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
    // $ANTLR end "rule__ViewConfiguration__Group_4__1__Impl"


    // $ANTLR start "rule__ViewConfiguration__Group_4__2"
    // InternalVpconf.g:4088:1: rule__ViewConfiguration__Group_4__2 : rule__ViewConfiguration__Group_4__2__Impl ;
    public final void rule__ViewConfiguration__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVpconf.g:4092:1: ( rule__ViewConfiguration__Group_4__2__Impl )
            // InternalVpconf.g:4093:2: rule__ViewConfiguration__Group_4__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ViewConfiguration__Group_4__2__Impl();

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
    // $ANTLR end "rule__ViewConfiguration__Group_4__2"


    // $ANTLR start "rule__ViewConfiguration__Group_4__2__Impl"
    // InternalVpconf.g:4099:1: rule__ViewConfiguration__Group_4__2__Impl : ( ( rule__ViewConfiguration__ActivableAssignment_4_2 ) ) ;
    public final void rule__ViewConfiguration__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVpconf.g:4103:1: ( ( ( rule__ViewConfiguration__ActivableAssignment_4_2 ) ) )
            // InternalVpconf.g:4104:1: ( ( rule__ViewConfiguration__ActivableAssignment_4_2 ) )
            {
            // InternalVpconf.g:4104:1: ( ( rule__ViewConfiguration__ActivableAssignment_4_2 ) )
            // InternalVpconf.g:4105:1: ( rule__ViewConfiguration__ActivableAssignment_4_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getViewConfigurationAccess().getActivableAssignment_4_2()); 
            }
            // InternalVpconf.g:4106:1: ( rule__ViewConfiguration__ActivableAssignment_4_2 )
            // InternalVpconf.g:4106:2: rule__ViewConfiguration__ActivableAssignment_4_2
            {
            pushFollow(FOLLOW_2);
            rule__ViewConfiguration__ActivableAssignment_4_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getViewConfigurationAccess().getActivableAssignment_4_2()); 
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
    // $ANTLR end "rule__ViewConfiguration__Group_4__2__Impl"


    // $ANTLR start "rule__Version__Group__0"
    // InternalVpconf.g:4122:1: rule__Version__Group__0 : rule__Version__Group__0__Impl rule__Version__Group__1 ;
    public final void rule__Version__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVpconf.g:4126:1: ( rule__Version__Group__0__Impl rule__Version__Group__1 )
            // InternalVpconf.g:4127:2: rule__Version__Group__0__Impl rule__Version__Group__1
            {
            pushFollow(FOLLOW_36);
            rule__Version__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
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
    // InternalVpconf.g:4134:1: rule__Version__Group__0__Impl : ( RULE_INT ) ;
    public final void rule__Version__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVpconf.g:4138:1: ( ( RULE_INT ) )
            // InternalVpconf.g:4139:1: ( RULE_INT )
            {
            // InternalVpconf.g:4139:1: ( RULE_INT )
            // InternalVpconf.g:4140:1: RULE_INT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVersionAccess().getINTTerminalRuleCall_0()); 
            }
            match(input,RULE_INT,FOLLOW_2); if (state.failed) return ;
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
    // InternalVpconf.g:4151:1: rule__Version__Group__1 : rule__Version__Group__1__Impl ;
    public final void rule__Version__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVpconf.g:4155:1: ( rule__Version__Group__1__Impl )
            // InternalVpconf.g:4156:2: rule__Version__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
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
    // InternalVpconf.g:4162:1: rule__Version__Group__1__Impl : ( ( rule__Version__Group_1__0 )? ) ;
    public final void rule__Version__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVpconf.g:4166:1: ( ( ( rule__Version__Group_1__0 )? ) )
            // InternalVpconf.g:4167:1: ( ( rule__Version__Group_1__0 )? )
            {
            // InternalVpconf.g:4167:1: ( ( rule__Version__Group_1__0 )? )
            // InternalVpconf.g:4168:1: ( rule__Version__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVersionAccess().getGroup_1()); 
            }
            // InternalVpconf.g:4169:1: ( rule__Version__Group_1__0 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==47) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalVpconf.g:4169:2: rule__Version__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
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
    // InternalVpconf.g:4183:1: rule__Version__Group_1__0 : rule__Version__Group_1__0__Impl rule__Version__Group_1__1 ;
    public final void rule__Version__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVpconf.g:4187:1: ( rule__Version__Group_1__0__Impl rule__Version__Group_1__1 )
            // InternalVpconf.g:4188:2: rule__Version__Group_1__0__Impl rule__Version__Group_1__1
            {
            pushFollow(FOLLOW_30);
            rule__Version__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
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
    // InternalVpconf.g:4195:1: rule__Version__Group_1__0__Impl : ( '.' ) ;
    public final void rule__Version__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVpconf.g:4199:1: ( ( '.' ) )
            // InternalVpconf.g:4200:1: ( '.' )
            {
            // InternalVpconf.g:4200:1: ( '.' )
            // InternalVpconf.g:4201:1: '.'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVersionAccess().getFullStopKeyword_1_0()); 
            }
            match(input,47,FOLLOW_2); if (state.failed) return ;
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
    // InternalVpconf.g:4214:1: rule__Version__Group_1__1 : rule__Version__Group_1__1__Impl ;
    public final void rule__Version__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVpconf.g:4218:1: ( rule__Version__Group_1__1__Impl )
            // InternalVpconf.g:4219:2: rule__Version__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
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
    // InternalVpconf.g:4225:1: rule__Version__Group_1__1__Impl : ( ( rule__Version__Group_1_1__0 ) ) ;
    public final void rule__Version__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVpconf.g:4229:1: ( ( ( rule__Version__Group_1_1__0 ) ) )
            // InternalVpconf.g:4230:1: ( ( rule__Version__Group_1_1__0 ) )
            {
            // InternalVpconf.g:4230:1: ( ( rule__Version__Group_1_1__0 ) )
            // InternalVpconf.g:4231:1: ( rule__Version__Group_1_1__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVersionAccess().getGroup_1_1()); 
            }
            // InternalVpconf.g:4232:1: ( rule__Version__Group_1_1__0 )
            // InternalVpconf.g:4232:2: rule__Version__Group_1_1__0
            {
            pushFollow(FOLLOW_2);
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
    // InternalVpconf.g:4246:1: rule__Version__Group_1_1__0 : rule__Version__Group_1_1__0__Impl rule__Version__Group_1_1__1 ;
    public final void rule__Version__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVpconf.g:4250:1: ( rule__Version__Group_1_1__0__Impl rule__Version__Group_1_1__1 )
            // InternalVpconf.g:4251:2: rule__Version__Group_1_1__0__Impl rule__Version__Group_1_1__1
            {
            pushFollow(FOLLOW_36);
            rule__Version__Group_1_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
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
    // InternalVpconf.g:4258:1: rule__Version__Group_1_1__0__Impl : ( RULE_INT ) ;
    public final void rule__Version__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVpconf.g:4262:1: ( ( RULE_INT ) )
            // InternalVpconf.g:4263:1: ( RULE_INT )
            {
            // InternalVpconf.g:4263:1: ( RULE_INT )
            // InternalVpconf.g:4264:1: RULE_INT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVersionAccess().getINTTerminalRuleCall_1_1_0()); 
            }
            match(input,RULE_INT,FOLLOW_2); if (state.failed) return ;
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
    // InternalVpconf.g:4275:1: rule__Version__Group_1_1__1 : rule__Version__Group_1_1__1__Impl ;
    public final void rule__Version__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVpconf.g:4279:1: ( rule__Version__Group_1_1__1__Impl )
            // InternalVpconf.g:4280:2: rule__Version__Group_1_1__1__Impl
            {
            pushFollow(FOLLOW_2);
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
    // InternalVpconf.g:4286:1: rule__Version__Group_1_1__1__Impl : ( ( rule__Version__Group_1_1_1__0 )? ) ;
    public final void rule__Version__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVpconf.g:4290:1: ( ( ( rule__Version__Group_1_1_1__0 )? ) )
            // InternalVpconf.g:4291:1: ( ( rule__Version__Group_1_1_1__0 )? )
            {
            // InternalVpconf.g:4291:1: ( ( rule__Version__Group_1_1_1__0 )? )
            // InternalVpconf.g:4292:1: ( rule__Version__Group_1_1_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVersionAccess().getGroup_1_1_1()); 
            }
            // InternalVpconf.g:4293:1: ( rule__Version__Group_1_1_1__0 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==47) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalVpconf.g:4293:2: rule__Version__Group_1_1_1__0
                    {
                    pushFollow(FOLLOW_2);
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
    // InternalVpconf.g:4307:1: rule__Version__Group_1_1_1__0 : rule__Version__Group_1_1_1__0__Impl rule__Version__Group_1_1_1__1 ;
    public final void rule__Version__Group_1_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVpconf.g:4311:1: ( rule__Version__Group_1_1_1__0__Impl rule__Version__Group_1_1_1__1 )
            // InternalVpconf.g:4312:2: rule__Version__Group_1_1_1__0__Impl rule__Version__Group_1_1_1__1
            {
            pushFollow(FOLLOW_30);
            rule__Version__Group_1_1_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
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
    // InternalVpconf.g:4319:1: rule__Version__Group_1_1_1__0__Impl : ( '.' ) ;
    public final void rule__Version__Group_1_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVpconf.g:4323:1: ( ( '.' ) )
            // InternalVpconf.g:4324:1: ( '.' )
            {
            // InternalVpconf.g:4324:1: ( '.' )
            // InternalVpconf.g:4325:1: '.'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVersionAccess().getFullStopKeyword_1_1_1_0()); 
            }
            match(input,47,FOLLOW_2); if (state.failed) return ;
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
    // InternalVpconf.g:4338:1: rule__Version__Group_1_1_1__1 : rule__Version__Group_1_1_1__1__Impl rule__Version__Group_1_1_1__2 ;
    public final void rule__Version__Group_1_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVpconf.g:4342:1: ( rule__Version__Group_1_1_1__1__Impl rule__Version__Group_1_1_1__2 )
            // InternalVpconf.g:4343:2: rule__Version__Group_1_1_1__1__Impl rule__Version__Group_1_1_1__2
            {
            pushFollow(FOLLOW_36);
            rule__Version__Group_1_1_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
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
    // InternalVpconf.g:4350:1: rule__Version__Group_1_1_1__1__Impl : ( RULE_INT ) ;
    public final void rule__Version__Group_1_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVpconf.g:4354:1: ( ( RULE_INT ) )
            // InternalVpconf.g:4355:1: ( RULE_INT )
            {
            // InternalVpconf.g:4355:1: ( RULE_INT )
            // InternalVpconf.g:4356:1: RULE_INT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVersionAccess().getINTTerminalRuleCall_1_1_1_1()); 
            }
            match(input,RULE_INT,FOLLOW_2); if (state.failed) return ;
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
    // InternalVpconf.g:4367:1: rule__Version__Group_1_1_1__2 : rule__Version__Group_1_1_1__2__Impl ;
    public final void rule__Version__Group_1_1_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVpconf.g:4371:1: ( rule__Version__Group_1_1_1__2__Impl )
            // InternalVpconf.g:4372:2: rule__Version__Group_1_1_1__2__Impl
            {
            pushFollow(FOLLOW_2);
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
    // InternalVpconf.g:4378:1: rule__Version__Group_1_1_1__2__Impl : ( ( rule__Version__Group_1_1_1_2__0 )? ) ;
    public final void rule__Version__Group_1_1_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVpconf.g:4382:1: ( ( ( rule__Version__Group_1_1_1_2__0 )? ) )
            // InternalVpconf.g:4383:1: ( ( rule__Version__Group_1_1_1_2__0 )? )
            {
            // InternalVpconf.g:4383:1: ( ( rule__Version__Group_1_1_1_2__0 )? )
            // InternalVpconf.g:4384:1: ( rule__Version__Group_1_1_1_2__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVersionAccess().getGroup_1_1_1_2()); 
            }
            // InternalVpconf.g:4385:1: ( rule__Version__Group_1_1_1_2__0 )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==47) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalVpconf.g:4385:2: rule__Version__Group_1_1_1_2__0
                    {
                    pushFollow(FOLLOW_2);
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
    // InternalVpconf.g:4401:1: rule__Version__Group_1_1_1_2__0 : rule__Version__Group_1_1_1_2__0__Impl rule__Version__Group_1_1_1_2__1 ;
    public final void rule__Version__Group_1_1_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVpconf.g:4405:1: ( rule__Version__Group_1_1_1_2__0__Impl rule__Version__Group_1_1_1_2__1 )
            // InternalVpconf.g:4406:2: rule__Version__Group_1_1_1_2__0__Impl rule__Version__Group_1_1_1_2__1
            {
            pushFollow(FOLLOW_37);
            rule__Version__Group_1_1_1_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
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
    // InternalVpconf.g:4413:1: rule__Version__Group_1_1_1_2__0__Impl : ( '.' ) ;
    public final void rule__Version__Group_1_1_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVpconf.g:4417:1: ( ( '.' ) )
            // InternalVpconf.g:4418:1: ( '.' )
            {
            // InternalVpconf.g:4418:1: ( '.' )
            // InternalVpconf.g:4419:1: '.'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVersionAccess().getFullStopKeyword_1_1_1_2_0()); 
            }
            match(input,47,FOLLOW_2); if (state.failed) return ;
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
    // InternalVpconf.g:4432:1: rule__Version__Group_1_1_1_2__1 : rule__Version__Group_1_1_1_2__1__Impl ;
    public final void rule__Version__Group_1_1_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVpconf.g:4436:1: ( rule__Version__Group_1_1_1_2__1__Impl )
            // InternalVpconf.g:4437:2: rule__Version__Group_1_1_1_2__1__Impl
            {
            pushFollow(FOLLOW_2);
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
    // InternalVpconf.g:4443:1: rule__Version__Group_1_1_1_2__1__Impl : ( ruleQualifier ) ;
    public final void rule__Version__Group_1_1_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVpconf.g:4447:1: ( ( ruleQualifier ) )
            // InternalVpconf.g:4448:1: ( ruleQualifier )
            {
            // InternalVpconf.g:4448:1: ( ruleQualifier )
            // InternalVpconf.g:4449:1: ruleQualifier
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVersionAccess().getQualifierParserRuleCall_1_1_1_2_1()); 
            }
            pushFollow(FOLLOW_2);
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
    // InternalVpconf.g:4464:1: rule__Qualifier__Group__0 : rule__Qualifier__Group__0__Impl rule__Qualifier__Group__1 ;
    public final void rule__Qualifier__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVpconf.g:4468:1: ( rule__Qualifier__Group__0__Impl rule__Qualifier__Group__1 )
            // InternalVpconf.g:4469:2: rule__Qualifier__Group__0__Impl rule__Qualifier__Group__1
            {
            pushFollow(FOLLOW_38);
            rule__Qualifier__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
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
    // InternalVpconf.g:4476:1: rule__Qualifier__Group__0__Impl : ( ( rule__Qualifier__Alternatives_0 ) ) ;
    public final void rule__Qualifier__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVpconf.g:4480:1: ( ( ( rule__Qualifier__Alternatives_0 ) ) )
            // InternalVpconf.g:4481:1: ( ( rule__Qualifier__Alternatives_0 ) )
            {
            // InternalVpconf.g:4481:1: ( ( rule__Qualifier__Alternatives_0 ) )
            // InternalVpconf.g:4482:1: ( rule__Qualifier__Alternatives_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifierAccess().getAlternatives_0()); 
            }
            // InternalVpconf.g:4483:1: ( rule__Qualifier__Alternatives_0 )
            // InternalVpconf.g:4483:2: rule__Qualifier__Alternatives_0
            {
            pushFollow(FOLLOW_2);
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
    // InternalVpconf.g:4493:1: rule__Qualifier__Group__1 : rule__Qualifier__Group__1__Impl ;
    public final void rule__Qualifier__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVpconf.g:4497:1: ( rule__Qualifier__Group__1__Impl )
            // InternalVpconf.g:4498:2: rule__Qualifier__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
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
    // InternalVpconf.g:4504:1: rule__Qualifier__Group__1__Impl : ( ( rule__Qualifier__Alternatives_1 )* ) ;
    public final void rule__Qualifier__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVpconf.g:4508:1: ( ( ( rule__Qualifier__Alternatives_1 )* ) )
            // InternalVpconf.g:4509:1: ( ( rule__Qualifier__Alternatives_1 )* )
            {
            // InternalVpconf.g:4509:1: ( ( rule__Qualifier__Alternatives_1 )* )
            // InternalVpconf.g:4510:1: ( rule__Qualifier__Alternatives_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifierAccess().getAlternatives_1()); 
            }
            // InternalVpconf.g:4511:1: ( rule__Qualifier__Alternatives_1 )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( ((LA29_0>=RULE_INT && LA29_0<=RULE_ID)||(LA29_0>=11 && LA29_0<=12)) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // InternalVpconf.g:4511:2: rule__Qualifier__Alternatives_1
            	    {
            	    pushFollow(FOLLOW_39);
            	    rule__Qualifier__Alternatives_1();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop29;
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
    // InternalVpconf.g:4525:1: rule__FQN__Group__0 : rule__FQN__Group__0__Impl rule__FQN__Group__1 ;
    public final void rule__FQN__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVpconf.g:4529:1: ( rule__FQN__Group__0__Impl rule__FQN__Group__1 )
            // InternalVpconf.g:4530:2: rule__FQN__Group__0__Impl rule__FQN__Group__1
            {
            pushFollow(FOLLOW_36);
            rule__FQN__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
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
    // InternalVpconf.g:4537:1: rule__FQN__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__FQN__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVpconf.g:4541:1: ( ( RULE_ID ) )
            // InternalVpconf.g:4542:1: ( RULE_ID )
            {
            // InternalVpconf.g:4542:1: ( RULE_ID )
            // InternalVpconf.g:4543:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFQNAccess().getIDTerminalRuleCall_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
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
    // InternalVpconf.g:4554:1: rule__FQN__Group__1 : rule__FQN__Group__1__Impl ;
    public final void rule__FQN__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVpconf.g:4558:1: ( rule__FQN__Group__1__Impl )
            // InternalVpconf.g:4559:2: rule__FQN__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
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
    // InternalVpconf.g:4565:1: rule__FQN__Group__1__Impl : ( ( rule__FQN__Group_1__0 )* ) ;
    public final void rule__FQN__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVpconf.g:4569:1: ( ( ( rule__FQN__Group_1__0 )* ) )
            // InternalVpconf.g:4570:1: ( ( rule__FQN__Group_1__0 )* )
            {
            // InternalVpconf.g:4570:1: ( ( rule__FQN__Group_1__0 )* )
            // InternalVpconf.g:4571:1: ( rule__FQN__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFQNAccess().getGroup_1()); 
            }
            // InternalVpconf.g:4572:1: ( rule__FQN__Group_1__0 )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==47) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // InternalVpconf.g:4572:2: rule__FQN__Group_1__0
            	    {
            	    pushFollow(FOLLOW_40);
            	    rule__FQN__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop30;
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
    // InternalVpconf.g:4586:1: rule__FQN__Group_1__0 : rule__FQN__Group_1__0__Impl rule__FQN__Group_1__1 ;
    public final void rule__FQN__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVpconf.g:4590:1: ( rule__FQN__Group_1__0__Impl rule__FQN__Group_1__1 )
            // InternalVpconf.g:4591:2: rule__FQN__Group_1__0__Impl rule__FQN__Group_1__1
            {
            pushFollow(FOLLOW_4);
            rule__FQN__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
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
    // InternalVpconf.g:4598:1: rule__FQN__Group_1__0__Impl : ( '.' ) ;
    public final void rule__FQN__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVpconf.g:4602:1: ( ( '.' ) )
            // InternalVpconf.g:4603:1: ( '.' )
            {
            // InternalVpconf.g:4603:1: ( '.' )
            // InternalVpconf.g:4604:1: '.'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFQNAccess().getFullStopKeyword_1_0()); 
            }
            match(input,47,FOLLOW_2); if (state.failed) return ;
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
    // InternalVpconf.g:4617:1: rule__FQN__Group_1__1 : rule__FQN__Group_1__1__Impl ;
    public final void rule__FQN__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVpconf.g:4621:1: ( rule__FQN__Group_1__1__Impl )
            // InternalVpconf.g:4622:2: rule__FQN__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
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
    // InternalVpconf.g:4628:1: rule__FQN__Group_1__1__Impl : ( ( RULE_ID ) ) ;
    public final void rule__FQN__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVpconf.g:4632:1: ( ( ( RULE_ID ) ) )
            // InternalVpconf.g:4633:1: ( ( RULE_ID ) )
            {
            // InternalVpconf.g:4633:1: ( ( RULE_ID ) )
            // InternalVpconf.g:4634:1: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFQNAccess().getIDTerminalRuleCall_1_1()); 
            }
            // InternalVpconf.g:4635:1: ( RULE_ID )
            // InternalVpconf.g:4635:3: RULE_ID
            {
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;

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
    // InternalVpconf.g:4650:1: rule__Configuration__NameAssignment_2 : ( ruleFQN ) ;
    public final void rule__Configuration__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVpconf.g:4654:1: ( ( ruleFQN ) )
            // InternalVpconf.g:4655:1: ( ruleFQN )
            {
            // InternalVpconf.g:4655:1: ( ruleFQN )
            // InternalVpconf.g:4656:1: ruleFQN
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConfigurationAccess().getNameFQNParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_2);
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
    // InternalVpconf.g:4665:1: rule__Configuration__VpConfigurationElementsAssignment_4 : ( ruleConfigurationElement ) ;
    public final void rule__Configuration__VpConfigurationElementsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVpconf.g:4669:1: ( ( ruleConfigurationElement ) )
            // InternalVpconf.g:4670:1: ( ruleConfigurationElement )
            {
            // InternalVpconf.g:4670:1: ( ruleConfigurationElement )
            // InternalVpconf.g:4671:1: ruleConfigurationElement
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConfigurationAccess().getVpConfigurationElementsConfigurationElementParserRuleCall_4_0()); 
            }
            pushFollow(FOLLOW_2);
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
    // InternalVpconf.g:4680:1: rule__TargetApplication__TypeAssignment_2 : ( ruleEString ) ;
    public final void rule__TargetApplication__TypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVpconf.g:4684:1: ( ( ruleEString ) )
            // InternalVpconf.g:4685:1: ( ruleEString )
            {
            // InternalVpconf.g:4685:1: ( ruleEString )
            // InternalVpconf.g:4686:1: ruleEString
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTargetApplicationAccess().getTypeEStringParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_2);
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
    // InternalVpconf.g:4695:1: rule__GenerationConfiguration__ProjectNameAssignment_2 : ( ruleFQN ) ;
    public final void rule__GenerationConfiguration__ProjectNameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVpconf.g:4699:1: ( ( ruleFQN ) )
            // InternalVpconf.g:4700:1: ( ruleFQN )
            {
            // InternalVpconf.g:4700:1: ( ruleFQN )
            // InternalVpconf.g:4701:1: ruleFQN
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGenerationConfigurationAccess().getProjectNameFQNParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_2);
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
    // InternalVpconf.g:4710:1: rule__GenerationConfiguration__NsuriAssignment_3_1 : ( RULE_STRING ) ;
    public final void rule__GenerationConfiguration__NsuriAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVpconf.g:4714:1: ( ( RULE_STRING ) )
            // InternalVpconf.g:4715:1: ( RULE_STRING )
            {
            // InternalVpconf.g:4715:1: ( RULE_STRING )
            // InternalVpconf.g:4716:1: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGenerationConfigurationAccess().getNsuriSTRINGTerminalRuleCall_3_1_0()); 
            }
            match(input,RULE_STRING,FOLLOW_2); if (state.failed) return ;
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
    // InternalVpconf.g:4725:1: rule__Generation__OwnedDataGenerationConfAssignment_3 : ( ruleGData ) ;
    public final void rule__Generation__OwnedDataGenerationConfAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVpconf.g:4729:1: ( ( ruleGData ) )
            // InternalVpconf.g:4730:1: ( ruleGData )
            {
            // InternalVpconf.g:4730:1: ( ruleGData )
            // InternalVpconf.g:4731:1: ruleGData
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGenerationAccess().getOwnedDataGenerationConfGDataParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_2);
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
    // InternalVpconf.g:4740:1: rule__Generation__OwnedExtensionGenConfAssignment_4 : ( ruleExtensionGeneratrionConfiguration ) ;
    public final void rule__Generation__OwnedExtensionGenConfAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVpconf.g:4744:1: ( ( ruleExtensionGeneratrionConfiguration ) )
            // InternalVpconf.g:4745:1: ( ruleExtensionGeneratrionConfiguration )
            {
            // InternalVpconf.g:4745:1: ( ruleExtensionGeneratrionConfiguration )
            // InternalVpconf.g:4746:1: ruleExtensionGeneratrionConfiguration
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGenerationAccess().getOwnedExtensionGenConfExtensionGeneratrionConfigurationParserRuleCall_4_0()); 
            }
            pushFollow(FOLLOW_2);
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
    // InternalVpconf.g:4755:1: rule__GData__ModelAssignment_3_0_2 : ( ruleEBoolean ) ;
    public final void rule__GData__ModelAssignment_3_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVpconf.g:4759:1: ( ( ruleEBoolean ) )
            // InternalVpconf.g:4760:1: ( ruleEBoolean )
            {
            // InternalVpconf.g:4760:1: ( ruleEBoolean )
            // InternalVpconf.g:4761:1: ruleEBoolean
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGDataAccess().getModelEBooleanParserRuleCall_3_0_2_0()); 
            }
            pushFollow(FOLLOW_2);
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
    // InternalVpconf.g:4770:1: rule__GData__EditAssignment_3_1_2 : ( ruleEBoolean ) ;
    public final void rule__GData__EditAssignment_3_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVpconf.g:4774:1: ( ( ruleEBoolean ) )
            // InternalVpconf.g:4775:1: ( ruleEBoolean )
            {
            // InternalVpconf.g:4775:1: ( ruleEBoolean )
            // InternalVpconf.g:4776:1: ruleEBoolean
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGDataAccess().getEditEBooleanParserRuleCall_3_1_2_0()); 
            }
            pushFollow(FOLLOW_2);
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
    // InternalVpconf.g:4785:1: rule__GData__EditorAssignment_3_2_2 : ( ruleEBoolean ) ;
    public final void rule__GData__EditorAssignment_3_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVpconf.g:4789:1: ( ( ruleEBoolean ) )
            // InternalVpconf.g:4790:1: ( ruleEBoolean )
            {
            // InternalVpconf.g:4790:1: ( ruleEBoolean )
            // InternalVpconf.g:4791:1: ruleEBoolean
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGDataAccess().getEditorEBooleanParserRuleCall_3_2_2_0()); 
            }
            pushFollow(FOLLOW_2);
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
    // InternalVpconf.g:4800:1: rule__GData__TestAssignment_3_3_2 : ( ruleEBoolean ) ;
    public final void rule__GData__TestAssignment_3_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVpconf.g:4804:1: ( ( ruleEBoolean ) )
            // InternalVpconf.g:4805:1: ( ruleEBoolean )
            {
            // InternalVpconf.g:4805:1: ( ruleEBoolean )
            // InternalVpconf.g:4806:1: ruleEBoolean
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGDataAccess().getTestEBooleanParserRuleCall_3_3_2_0()); 
            }
            pushFollow(FOLLOW_2);
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
    // InternalVpconf.g:4815:1: rule__GData__JavaDocAssignment_3_4_2 : ( ruleEBoolean ) ;
    public final void rule__GData__JavaDocAssignment_3_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVpconf.g:4819:1: ( ( ruleEBoolean ) )
            // InternalVpconf.g:4820:1: ( ruleEBoolean )
            {
            // InternalVpconf.g:4820:1: ( ruleEBoolean )
            // InternalVpconf.g:4821:1: ruleEBoolean
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGDataAccess().getJavaDocEBooleanParserRuleCall_3_4_2_0()); 
            }
            pushFollow(FOLLOW_2);
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
    // InternalVpconf.g:4830:1: rule__GData__OverwriteEcoreAssignment_3_5_2 : ( ruleEBoolean ) ;
    public final void rule__GData__OverwriteEcoreAssignment_3_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVpconf.g:4834:1: ( ( ruleEBoolean ) )
            // InternalVpconf.g:4835:1: ( ruleEBoolean )
            {
            // InternalVpconf.g:4835:1: ( ruleEBoolean )
            // InternalVpconf.g:4836:1: ruleEBoolean
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGDataAccess().getOverwriteEcoreEBooleanParserRuleCall_3_5_2_0()); 
            }
            pushFollow(FOLLOW_2);
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
    // InternalVpconf.g:4845:1: rule__DiagramGenerationConfiguration__OverwriteVSMAssignment_3_2 : ( ruleEBoolean ) ;
    public final void rule__DiagramGenerationConfiguration__OverwriteVSMAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVpconf.g:4849:1: ( ( ruleEBoolean ) )
            // InternalVpconf.g:4850:1: ( ruleEBoolean )
            {
            // InternalVpconf.g:4850:1: ( ruleEBoolean )
            // InternalVpconf.g:4851:1: ruleEBoolean
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDiagramGenerationConfigurationAccess().getOverwriteVSMEBooleanParserRuleCall_3_2_0()); 
            }
            pushFollow(FOLLOW_2);
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
    // InternalVpconf.g:4860:1: rule__DocumentationGenerationConfiguration__EcoreToHtmlAssignment_3_1 : ( ruleEBoolean ) ;
    public final void rule__DocumentationGenerationConfiguration__EcoreToHtmlAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVpconf.g:4864:1: ( ( ruleEBoolean ) )
            // InternalVpconf.g:4865:1: ( ruleEBoolean )
            {
            // InternalVpconf.g:4865:1: ( ruleEBoolean )
            // InternalVpconf.g:4866:1: ruleEBoolean
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDocumentationGenerationConfigurationAccess().getEcoreToHtmlEBooleanParserRuleCall_3_1_0()); 
            }
            pushFollow(FOLLOW_2);
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
    // InternalVpconf.g:4875:1: rule__ModelsAirdGenerationConfiguration__GenRepresentationsAssignment_3_2 : ( ruleEBoolean ) ;
    public final void rule__ModelsAirdGenerationConfiguration__GenRepresentationsAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVpconf.g:4879:1: ( ( ruleEBoolean ) )
            // InternalVpconf.g:4880:1: ( ruleEBoolean )
            {
            // InternalVpconf.g:4880:1: ( ruleEBoolean )
            // InternalVpconf.g:4881:1: ruleEBoolean
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelsAirdGenerationConfigurationAccess().getGenRepresentationsEBooleanParserRuleCall_3_2_0()); 
            }
            pushFollow(FOLLOW_2);
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
    // InternalVpconf.g:4890:1: rule__Release__ViewpointVersionAssignment_3_2 : ( ruleVersion ) ;
    public final void rule__Release__ViewpointVersionAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVpconf.g:4894:1: ( ( ruleVersion ) )
            // InternalVpconf.g:4895:1: ( ruleVersion )
            {
            // InternalVpconf.g:4895:1: ( ruleVersion )
            // InternalVpconf.g:4896:1: ruleVersion
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReleaseAccess().getViewpointVersionVersionParserRuleCall_3_2_0()); 
            }
            pushFollow(FOLLOW_2);
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
    // InternalVpconf.g:4905:1: rule__Release__ViewpointDescriptionAssignment_4_2 : ( ruleEString ) ;
    public final void rule__Release__ViewpointDescriptionAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVpconf.g:4909:1: ( ( ruleEString ) )
            // InternalVpconf.g:4910:1: ( ruleEString )
            {
            // InternalVpconf.g:4910:1: ( ruleEString )
            // InternalVpconf.g:4911:1: ruleEString
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReleaseAccess().getViewpointDescriptionEStringParserRuleCall_4_2_0()); 
            }
            pushFollow(FOLLOW_2);
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
    // InternalVpconf.g:4920:1: rule__Release__RequiredExecutionEnvironmentAssignment_5_3_0 : ( RULE_STRING ) ;
    public final void rule__Release__RequiredExecutionEnvironmentAssignment_5_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVpconf.g:4924:1: ( ( RULE_STRING ) )
            // InternalVpconf.g:4925:1: ( RULE_STRING )
            {
            // InternalVpconf.g:4925:1: ( RULE_STRING )
            // InternalVpconf.g:4926:1: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReleaseAccess().getRequiredExecutionEnvironmentSTRINGTerminalRuleCall_5_3_0_0()); 
            }
            match(input,RULE_STRING,FOLLOW_2); if (state.failed) return ;
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
    // InternalVpconf.g:4935:1: rule__Release__RequiredExecutionEnvironmentAssignment_5_3_1_1 : ( RULE_STRING ) ;
    public final void rule__Release__RequiredExecutionEnvironmentAssignment_5_3_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVpconf.g:4939:1: ( ( RULE_STRING ) )
            // InternalVpconf.g:4940:1: ( RULE_STRING )
            {
            // InternalVpconf.g:4940:1: ( RULE_STRING )
            // InternalVpconf.g:4941:1: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReleaseAccess().getRequiredExecutionEnvironmentSTRINGTerminalRuleCall_5_3_1_1_0()); 
            }
            match(input,RULE_STRING,FOLLOW_2); if (state.failed) return ;
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


    // $ANTLR start "rule__ViewConfiguration__VisibleAssignment_3_2"
    // InternalVpconf.g:4950:1: rule__ViewConfiguration__VisibleAssignment_3_2 : ( ruleEBoolean ) ;
    public final void rule__ViewConfiguration__VisibleAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVpconf.g:4954:1: ( ( ruleEBoolean ) )
            // InternalVpconf.g:4955:1: ( ruleEBoolean )
            {
            // InternalVpconf.g:4955:1: ( ruleEBoolean )
            // InternalVpconf.g:4956:1: ruleEBoolean
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getViewConfigurationAccess().getVisibleEBooleanParserRuleCall_3_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleEBoolean();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getViewConfigurationAccess().getVisibleEBooleanParserRuleCall_3_2_0()); 
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
    // $ANTLR end "rule__ViewConfiguration__VisibleAssignment_3_2"


    // $ANTLR start "rule__ViewConfiguration__ActivableAssignment_4_2"
    // InternalVpconf.g:4965:1: rule__ViewConfiguration__ActivableAssignment_4_2 : ( ruleEBoolean ) ;
    public final void rule__ViewConfiguration__ActivableAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVpconf.g:4969:1: ( ( ruleEBoolean ) )
            // InternalVpconf.g:4970:1: ( ruleEBoolean )
            {
            // InternalVpconf.g:4970:1: ( ruleEBoolean )
            // InternalVpconf.g:4971:1: ruleEBoolean
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getViewConfigurationAccess().getActivableEBooleanParserRuleCall_4_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleEBoolean();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getViewConfigurationAccess().getActivableEBooleanParserRuleCall_4_2_0()); 
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
    // $ANTLR end "rule__ViewConfiguration__ActivableAssignment_4_2"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x00001040002E0000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x00001040002C0002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000001500420000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000001500000002L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x00000000FA000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000201000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000801000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000001500000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000002001000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000038000020000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000080000000002L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x00001040002C0000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000600000020000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000000000830L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000000000001830L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000000000001832L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000800000000002L});

}
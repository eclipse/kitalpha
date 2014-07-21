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



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalVpservicesParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Java'", "'EMFvalidation'", "'Integer'", "'String'", "'Boolean'", "'Float'", "'Services'", "'{'", "'}'", "'description:'", "'Rules'", "'Service'", "','", "'orchestrates'", "'Rule'", "'type'", "'class'", "'Properties'", "'Property'", "'value'", "'.'"
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
    public static final int RULE_SL_COMMENT=8;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__30=30;
    public static final int T__19=19;
    public static final int T__31=31;
    public static final int RULE_STRING=4;
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


        public InternalVpservicesParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalVpservicesParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalVpservicesParser.tokenNames; }
    public String getGrammarFileName() { return "../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g"; }


     
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




    // $ANTLR start "entryRuleServices"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:61:1: entryRuleServices : ruleServices EOF ;
    public final void entryRuleServices() throws RecognitionException {
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:62:1: ( ruleServices EOF )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:63:1: ruleServices EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getServicesRule()); 
            }
            pushFollow(FOLLOW_ruleServices_in_entryRuleServices67);
            ruleServices();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getServicesRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleServices74); if (state.failed) return ;

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
    // $ANTLR end "entryRuleServices"


    // $ANTLR start "ruleServices"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:70:1: ruleServices : ( ( rule__Services__Group__0 ) ) ;
    public final void ruleServices() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:74:2: ( ( ( rule__Services__Group__0 ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:75:1: ( ( rule__Services__Group__0 ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:75:1: ( ( rule__Services__Group__0 ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:76:1: ( rule__Services__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getServicesAccess().getGroup()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:77:1: ( rule__Services__Group__0 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:77:2: rule__Services__Group__0
            {
            pushFollow(FOLLOW_rule__Services__Group__0_in_ruleServices100);
            rule__Services__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getServicesAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleServices"


    // $ANTLR start "entryRuleAspect"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:89:1: entryRuleAspect : ruleAspect EOF ;
    public final void entryRuleAspect() throws RecognitionException {
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:90:1: ( ruleAspect EOF )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:91:1: ruleAspect EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAspectRule()); 
            }
            pushFollow(FOLLOW_ruleAspect_in_entryRuleAspect127);
            ruleAspect();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAspectRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAspect134); if (state.failed) return ;

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
    // $ANTLR end "entryRuleAspect"


    // $ANTLR start "ruleAspect"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:98:1: ruleAspect : ( ( rule__Aspect__Alternatives ) ) ;
    public final void ruleAspect() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:102:2: ( ( ( rule__Aspect__Alternatives ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:103:1: ( ( rule__Aspect__Alternatives ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:103:1: ( ( rule__Aspect__Alternatives ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:104:1: ( rule__Aspect__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAspectAccess().getAlternatives()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:105:1: ( rule__Aspect__Alternatives )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:105:2: rule__Aspect__Alternatives
            {
            pushFollow(FOLLOW_rule__Aspect__Alternatives_in_ruleAspect160);
            rule__Aspect__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAspectAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAspect"


    // $ANTLR start "entryRuleServiceSet"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:117:1: entryRuleServiceSet : ruleServiceSet EOF ;
    public final void entryRuleServiceSet() throws RecognitionException {
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:118:1: ( ruleServiceSet EOF )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:119:1: ruleServiceSet EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getServiceSetRule()); 
            }
            pushFollow(FOLLOW_ruleServiceSet_in_entryRuleServiceSet187);
            ruleServiceSet();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getServiceSetRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleServiceSet194); if (state.failed) return ;

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
    // $ANTLR end "entryRuleServiceSet"


    // $ANTLR start "ruleServiceSet"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:126:1: ruleServiceSet : ( ( rule__ServiceSet__Group__0 ) ) ;
    public final void ruleServiceSet() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:130:2: ( ( ( rule__ServiceSet__Group__0 ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:131:1: ( ( rule__ServiceSet__Group__0 ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:131:1: ( ( rule__ServiceSet__Group__0 ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:132:1: ( rule__ServiceSet__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getServiceSetAccess().getGroup()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:133:1: ( rule__ServiceSet__Group__0 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:133:2: rule__ServiceSet__Group__0
            {
            pushFollow(FOLLOW_rule__ServiceSet__Group__0_in_ruleServiceSet220);
            rule__ServiceSet__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getServiceSetAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleServiceSet"


    // $ANTLR start "entryRuleRuleSet"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:145:1: entryRuleRuleSet : ruleRuleSet EOF ;
    public final void entryRuleRuleSet() throws RecognitionException {
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:146:1: ( ruleRuleSet EOF )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:147:1: ruleRuleSet EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRuleSetRule()); 
            }
            pushFollow(FOLLOW_ruleRuleSet_in_entryRuleRuleSet247);
            ruleRuleSet();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRuleSetRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleRuleSet254); if (state.failed) return ;

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
    // $ANTLR end "entryRuleRuleSet"


    // $ANTLR start "ruleRuleSet"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:154:1: ruleRuleSet : ( ( rule__RuleSet__Group__0 ) ) ;
    public final void ruleRuleSet() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:158:2: ( ( ( rule__RuleSet__Group__0 ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:159:1: ( ( rule__RuleSet__Group__0 ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:159:1: ( ( rule__RuleSet__Group__0 ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:160:1: ( rule__RuleSet__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRuleSetAccess().getGroup()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:161:1: ( rule__RuleSet__Group__0 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:161:2: rule__RuleSet__Group__0
            {
            pushFollow(FOLLOW_rule__RuleSet__Group__0_in_ruleRuleSet280);
            rule__RuleSet__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRuleSetAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRuleSet"


    // $ANTLR start "entryRuleService"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:173:1: entryRuleService : ruleService EOF ;
    public final void entryRuleService() throws RecognitionException {
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:174:1: ( ruleService EOF )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:175:1: ruleService EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getServiceRule()); 
            }
            pushFollow(FOLLOW_ruleService_in_entryRuleService307);
            ruleService();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getServiceRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleService314); if (state.failed) return ;

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
    // $ANTLR end "entryRuleService"


    // $ANTLR start "ruleService"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:182:1: ruleService : ( ( rule__Service__Group__0 ) ) ;
    public final void ruleService() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:186:2: ( ( ( rule__Service__Group__0 ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:187:1: ( ( rule__Service__Group__0 ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:187:1: ( ( rule__Service__Group__0 ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:188:1: ( rule__Service__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getServiceAccess().getGroup()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:189:1: ( rule__Service__Group__0 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:189:2: rule__Service__Group__0
            {
            pushFollow(FOLLOW_rule__Service__Group__0_in_ruleService340);
            rule__Service__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getServiceAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleService"


    // $ANTLR start "entryRuleRule"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:201:1: entryRuleRule : ruleRule EOF ;
    public final void entryRuleRule() throws RecognitionException {
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:202:1: ( ruleRule EOF )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:203:1: ruleRule EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRuleRule()); 
            }
            pushFollow(FOLLOW_ruleRule_in_entryRuleRule367);
            ruleRule();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRuleRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleRule374); if (state.failed) return ;

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
    // $ANTLR end "entryRuleRule"


    // $ANTLR start "ruleRule"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:210:1: ruleRule : ( ( rule__Rule__Group__0 ) ) ;
    public final void ruleRule() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:214:2: ( ( ( rule__Rule__Group__0 ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:215:1: ( ( rule__Rule__Group__0 ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:215:1: ( ( rule__Rule__Group__0 ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:216:1: ( rule__Rule__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRuleAccess().getGroup()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:217:1: ( rule__Rule__Group__0 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:217:2: rule__Rule__Group__0
            {
            pushFollow(FOLLOW_rule__Rule__Group__0_in_ruleRule400);
            rule__Rule__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRuleAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRule"


    // $ANTLR start "entryRulePropertySet"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:229:1: entryRulePropertySet : rulePropertySet EOF ;
    public final void entryRulePropertySet() throws RecognitionException {
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:230:1: ( rulePropertySet EOF )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:231:1: rulePropertySet EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertySetRule()); 
            }
            pushFollow(FOLLOW_rulePropertySet_in_entryRulePropertySet427);
            rulePropertySet();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPropertySetRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePropertySet434); if (state.failed) return ;

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
    // $ANTLR end "entryRulePropertySet"


    // $ANTLR start "rulePropertySet"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:238:1: rulePropertySet : ( ( rule__PropertySet__Group__0 ) ) ;
    public final void rulePropertySet() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:242:2: ( ( ( rule__PropertySet__Group__0 ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:243:1: ( ( rule__PropertySet__Group__0 ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:243:1: ( ( rule__PropertySet__Group__0 ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:244:1: ( rule__PropertySet__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertySetAccess().getGroup()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:245:1: ( rule__PropertySet__Group__0 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:245:2: rule__PropertySet__Group__0
            {
            pushFollow(FOLLOW_rule__PropertySet__Group__0_in_rulePropertySet460);
            rule__PropertySet__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPropertySetAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePropertySet"


    // $ANTLR start "entryRuleProperty"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:257:1: entryRuleProperty : ruleProperty EOF ;
    public final void entryRuleProperty() throws RecognitionException {
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:258:1: ( ruleProperty EOF )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:259:1: ruleProperty EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyRule()); 
            }
            pushFollow(FOLLOW_ruleProperty_in_entryRuleProperty487);
            ruleProperty();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPropertyRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleProperty494); if (state.failed) return ;

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
    // $ANTLR end "entryRuleProperty"


    // $ANTLR start "ruleProperty"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:266:1: ruleProperty : ( ( rule__Property__Group__0 ) ) ;
    public final void ruleProperty() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:270:2: ( ( ( rule__Property__Group__0 ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:271:1: ( ( rule__Property__Group__0 ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:271:1: ( ( rule__Property__Group__0 ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:272:1: ( rule__Property__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyAccess().getGroup()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:273:1: ( rule__Property__Group__0 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:273:2: rule__Property__Group__0
            {
            pushFollow(FOLLOW_rule__Property__Group__0_in_ruleProperty520);
            rule__Property__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPropertyAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleProperty"


    // $ANTLR start "entryRuleEString"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:285:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:286:1: ( ruleEString EOF )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:287:1: ruleEString EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEStringRule()); 
            }
            pushFollow(FOLLOW_ruleEString_in_entryRuleEString547);
            ruleEString();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEStringRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEString554); if (state.failed) return ;

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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:294:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:298:2: ( ( ( rule__EString__Alternatives ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:299:1: ( ( rule__EString__Alternatives ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:299:1: ( ( rule__EString__Alternatives ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:300:1: ( rule__EString__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEStringAccess().getAlternatives()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:301:1: ( rule__EString__Alternatives )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:301:2: rule__EString__Alternatives
            {
            pushFollow(FOLLOW_rule__EString__Alternatives_in_ruleEString580);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:313:1: entryRuleFQN : ruleFQN EOF ;
    public final void entryRuleFQN() throws RecognitionException {
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:314:1: ( ruleFQN EOF )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:315:1: ruleFQN EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFQNRule()); 
            }
            pushFollow(FOLLOW_ruleFQN_in_entryRuleFQN607);
            ruleFQN();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFQNRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFQN614); if (state.failed) return ;

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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:322:1: ruleFQN : ( ( rule__FQN__Group__0 ) ) ;
    public final void ruleFQN() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:326:2: ( ( ( rule__FQN__Group__0 ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:327:1: ( ( rule__FQN__Group__0 ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:327:1: ( ( rule__FQN__Group__0 ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:328:1: ( rule__FQN__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFQNAccess().getGroup()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:329:1: ( rule__FQN__Group__0 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:329:2: rule__FQN__Group__0
            {
            pushFollow(FOLLOW_rule__FQN__Group__0_in_ruleFQN640);
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


    // $ANTLR start "ruleRules_Types"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:346:1: ruleRules_Types : ( ( rule__Rules_Types__Alternatives ) ) ;
    public final void ruleRules_Types() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:350:1: ( ( ( rule__Rules_Types__Alternatives ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:351:1: ( ( rule__Rules_Types__Alternatives ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:351:1: ( ( rule__Rules_Types__Alternatives ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:352:1: ( rule__Rules_Types__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRules_TypesAccess().getAlternatives()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:353:1: ( rule__Rules_Types__Alternatives )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:353:2: rule__Rules_Types__Alternatives
            {
            pushFollow(FOLLOW_rule__Rules_Types__Alternatives_in_ruleRules_Types681);
            rule__Rules_Types__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRules_TypesAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRules_Types"


    // $ANTLR start "rulePropertyType"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:365:1: rulePropertyType : ( ( rule__PropertyType__Alternatives ) ) ;
    public final void rulePropertyType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:369:1: ( ( ( rule__PropertyType__Alternatives ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:370:1: ( ( rule__PropertyType__Alternatives ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:370:1: ( ( rule__PropertyType__Alternatives ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:371:1: ( rule__PropertyType__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyTypeAccess().getAlternatives()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:372:1: ( rule__PropertyType__Alternatives )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:372:2: rule__PropertyType__Alternatives
            {
            pushFollow(FOLLOW_rule__PropertyType__Alternatives_in_rulePropertyType717);
            rule__PropertyType__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPropertyTypeAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePropertyType"


    // $ANTLR start "rule__Aspect__Alternatives"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:383:1: rule__Aspect__Alternatives : ( ( ruleServiceSet ) | ( ruleRuleSet ) | ( rulePropertySet ) );
    public final void rule__Aspect__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:387:1: ( ( ruleServiceSet ) | ( ruleRuleSet ) | ( rulePropertySet ) )
            int alt1=3;
            switch ( input.LA(1) ) {
            case 17:
                {
                alt1=1;
                }
                break;
            case 21:
                {
                alt1=2;
                }
                break;
            case 28:
                {
                alt1=3;
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
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:388:1: ( ruleServiceSet )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:388:1: ( ruleServiceSet )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:389:1: ruleServiceSet
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAspectAccess().getServiceSetParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_ruleServiceSet_in_rule__Aspect__Alternatives752);
                    ruleServiceSet();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAspectAccess().getServiceSetParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:394:6: ( ruleRuleSet )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:394:6: ( ruleRuleSet )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:395:1: ruleRuleSet
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAspectAccess().getRuleSetParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_ruleRuleSet_in_rule__Aspect__Alternatives769);
                    ruleRuleSet();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAspectAccess().getRuleSetParserRuleCall_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:400:6: ( rulePropertySet )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:400:6: ( rulePropertySet )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:401:1: rulePropertySet
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAspectAccess().getPropertySetParserRuleCall_2()); 
                    }
                    pushFollow(FOLLOW_rulePropertySet_in_rule__Aspect__Alternatives786);
                    rulePropertySet();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAspectAccess().getPropertySetParserRuleCall_2()); 
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
    // $ANTLR end "rule__Aspect__Alternatives"


    // $ANTLR start "rule__EString__Alternatives"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:411:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:415:1: ( ( RULE_STRING ) | ( RULE_ID ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_STRING) ) {
                alt2=1;
            }
            else if ( (LA2_0==RULE_ID) ) {
                alt2=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:416:1: ( RULE_STRING )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:416:1: ( RULE_STRING )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:417:1: RULE_STRING
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    }
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__EString__Alternatives818); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:422:6: ( RULE_ID )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:422:6: ( RULE_ID )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:423:1: RULE_ID
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                    }
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__EString__Alternatives835); if (state.failed) return ;
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


    // $ANTLR start "rule__Rules_Types__Alternatives"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:434:1: rule__Rules_Types__Alternatives : ( ( ( 'Java' ) ) | ( ( 'EMFvalidation' ) ) );
    public final void rule__Rules_Types__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:438:1: ( ( ( 'Java' ) ) | ( ( 'EMFvalidation' ) ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==11) ) {
                alt3=1;
            }
            else if ( (LA3_0==12) ) {
                alt3=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:439:1: ( ( 'Java' ) )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:439:1: ( ( 'Java' ) )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:440:1: ( 'Java' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getRules_TypesAccess().getJavaEnumLiteralDeclaration_0()); 
                    }
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:441:1: ( 'Java' )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:441:3: 'Java'
                    {
                    match(input,11,FOLLOW_11_in_rule__Rules_Types__Alternatives869); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getRules_TypesAccess().getJavaEnumLiteralDeclaration_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:446:6: ( ( 'EMFvalidation' ) )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:446:6: ( ( 'EMFvalidation' ) )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:447:1: ( 'EMFvalidation' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getRules_TypesAccess().getEMFvalidationEnumLiteralDeclaration_1()); 
                    }
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:448:1: ( 'EMFvalidation' )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:448:3: 'EMFvalidation'
                    {
                    match(input,12,FOLLOW_12_in_rule__Rules_Types__Alternatives890); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getRules_TypesAccess().getEMFvalidationEnumLiteralDeclaration_1()); 
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
    // $ANTLR end "rule__Rules_Types__Alternatives"


    // $ANTLR start "rule__PropertyType__Alternatives"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:458:1: rule__PropertyType__Alternatives : ( ( ( 'Integer' ) ) | ( ( 'String' ) ) | ( ( 'Boolean' ) ) | ( ( 'Float' ) ) );
    public final void rule__PropertyType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:462:1: ( ( ( 'Integer' ) ) | ( ( 'String' ) ) | ( ( 'Boolean' ) ) | ( ( 'Float' ) ) )
            int alt4=4;
            switch ( input.LA(1) ) {
            case 13:
                {
                alt4=1;
                }
                break;
            case 14:
                {
                alt4=2;
                }
                break;
            case 15:
                {
                alt4=3;
                }
                break;
            case 16:
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
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:463:1: ( ( 'Integer' ) )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:463:1: ( ( 'Integer' ) )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:464:1: ( 'Integer' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPropertyTypeAccess().getIntegerEnumLiteralDeclaration_0()); 
                    }
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:465:1: ( 'Integer' )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:465:3: 'Integer'
                    {
                    match(input,13,FOLLOW_13_in_rule__PropertyType__Alternatives926); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getPropertyTypeAccess().getIntegerEnumLiteralDeclaration_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:470:6: ( ( 'String' ) )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:470:6: ( ( 'String' ) )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:471:1: ( 'String' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPropertyTypeAccess().getStringEnumLiteralDeclaration_1()); 
                    }
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:472:1: ( 'String' )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:472:3: 'String'
                    {
                    match(input,14,FOLLOW_14_in_rule__PropertyType__Alternatives947); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getPropertyTypeAccess().getStringEnumLiteralDeclaration_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:477:6: ( ( 'Boolean' ) )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:477:6: ( ( 'Boolean' ) )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:478:1: ( 'Boolean' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPropertyTypeAccess().getBooleanEnumLiteralDeclaration_2()); 
                    }
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:479:1: ( 'Boolean' )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:479:3: 'Boolean'
                    {
                    match(input,15,FOLLOW_15_in_rule__PropertyType__Alternatives968); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getPropertyTypeAccess().getBooleanEnumLiteralDeclaration_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:484:6: ( ( 'Float' ) )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:484:6: ( ( 'Float' ) )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:485:1: ( 'Float' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPropertyTypeAccess().getFloatEnumLiteralDeclaration_3()); 
                    }
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:486:1: ( 'Float' )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:486:3: 'Float'
                    {
                    match(input,16,FOLLOW_16_in_rule__PropertyType__Alternatives989); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getPropertyTypeAccess().getFloatEnumLiteralDeclaration_3()); 
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
    // $ANTLR end "rule__PropertyType__Alternatives"


    // $ANTLR start "rule__Services__Group__0"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:498:1: rule__Services__Group__0 : rule__Services__Group__0__Impl rule__Services__Group__1 ;
    public final void rule__Services__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:502:1: ( rule__Services__Group__0__Impl rule__Services__Group__1 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:503:2: rule__Services__Group__0__Impl rule__Services__Group__1
            {
            pushFollow(FOLLOW_rule__Services__Group__0__Impl_in_rule__Services__Group__01022);
            rule__Services__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Services__Group__1_in_rule__Services__Group__01025);
            rule__Services__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Services__Group__0"


    // $ANTLR start "rule__Services__Group__0__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:510:1: rule__Services__Group__0__Impl : ( () ) ;
    public final void rule__Services__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:514:1: ( ( () ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:515:1: ( () )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:515:1: ( () )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:516:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getServicesAccess().getServicesAction_0()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:517:1: ()
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:519:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getServicesAccess().getServicesAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Services__Group__0__Impl"


    // $ANTLR start "rule__Services__Group__1"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:529:1: rule__Services__Group__1 : rule__Services__Group__1__Impl ;
    public final void rule__Services__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:533:1: ( rule__Services__Group__1__Impl )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:534:2: rule__Services__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Services__Group__1__Impl_in_rule__Services__Group__11083);
            rule__Services__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Services__Group__1"


    // $ANTLR start "rule__Services__Group__1__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:540:1: rule__Services__Group__1__Impl : ( ( ( rule__Services__ServicesAssignment_1 ) ) ( ( rule__Services__ServicesAssignment_1 )* ) ) ;
    public final void rule__Services__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:544:1: ( ( ( ( rule__Services__ServicesAssignment_1 ) ) ( ( rule__Services__ServicesAssignment_1 )* ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:545:1: ( ( ( rule__Services__ServicesAssignment_1 ) ) ( ( rule__Services__ServicesAssignment_1 )* ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:545:1: ( ( ( rule__Services__ServicesAssignment_1 ) ) ( ( rule__Services__ServicesAssignment_1 )* ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:546:1: ( ( rule__Services__ServicesAssignment_1 ) ) ( ( rule__Services__ServicesAssignment_1 )* )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:546:1: ( ( rule__Services__ServicesAssignment_1 ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:547:1: ( rule__Services__ServicesAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getServicesAccess().getServicesAssignment_1()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:548:1: ( rule__Services__ServicesAssignment_1 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:548:2: rule__Services__ServicesAssignment_1
            {
            pushFollow(FOLLOW_rule__Services__ServicesAssignment_1_in_rule__Services__Group__1__Impl1112);
            rule__Services__ServicesAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getServicesAccess().getServicesAssignment_1()); 
            }

            }

            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:551:1: ( ( rule__Services__ServicesAssignment_1 )* )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:552:1: ( rule__Services__ServicesAssignment_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getServicesAccess().getServicesAssignment_1()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:553:1: ( rule__Services__ServicesAssignment_1 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==17||LA5_0==21||LA5_0==28) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:553:2: rule__Services__ServicesAssignment_1
            	    {
            	    pushFollow(FOLLOW_rule__Services__ServicesAssignment_1_in_rule__Services__Group__1__Impl1124);
            	    rule__Services__ServicesAssignment_1();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getServicesAccess().getServicesAssignment_1()); 
            }

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Services__Group__1__Impl"


    // $ANTLR start "rule__ServiceSet__Group__0"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:568:1: rule__ServiceSet__Group__0 : rule__ServiceSet__Group__0__Impl rule__ServiceSet__Group__1 ;
    public final void rule__ServiceSet__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:572:1: ( rule__ServiceSet__Group__0__Impl rule__ServiceSet__Group__1 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:573:2: rule__ServiceSet__Group__0__Impl rule__ServiceSet__Group__1
            {
            pushFollow(FOLLOW_rule__ServiceSet__Group__0__Impl_in_rule__ServiceSet__Group__01161);
            rule__ServiceSet__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ServiceSet__Group__1_in_rule__ServiceSet__Group__01164);
            rule__ServiceSet__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServiceSet__Group__0"


    // $ANTLR start "rule__ServiceSet__Group__0__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:580:1: rule__ServiceSet__Group__0__Impl : ( () ) ;
    public final void rule__ServiceSet__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:584:1: ( ( () ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:585:1: ( () )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:585:1: ( () )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:586:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getServiceSetAccess().getServiceSetAction_0()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:587:1: ()
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:589:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getServiceSetAccess().getServiceSetAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServiceSet__Group__0__Impl"


    // $ANTLR start "rule__ServiceSet__Group__1"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:599:1: rule__ServiceSet__Group__1 : rule__ServiceSet__Group__1__Impl rule__ServiceSet__Group__2 ;
    public final void rule__ServiceSet__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:603:1: ( rule__ServiceSet__Group__1__Impl rule__ServiceSet__Group__2 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:604:2: rule__ServiceSet__Group__1__Impl rule__ServiceSet__Group__2
            {
            pushFollow(FOLLOW_rule__ServiceSet__Group__1__Impl_in_rule__ServiceSet__Group__11222);
            rule__ServiceSet__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ServiceSet__Group__2_in_rule__ServiceSet__Group__11225);
            rule__ServiceSet__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServiceSet__Group__1"


    // $ANTLR start "rule__ServiceSet__Group__1__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:611:1: rule__ServiceSet__Group__1__Impl : ( 'Services' ) ;
    public final void rule__ServiceSet__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:615:1: ( ( 'Services' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:616:1: ( 'Services' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:616:1: ( 'Services' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:617:1: 'Services'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getServiceSetAccess().getServicesKeyword_1()); 
            }
            match(input,17,FOLLOW_17_in_rule__ServiceSet__Group__1__Impl1253); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getServiceSetAccess().getServicesKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServiceSet__Group__1__Impl"


    // $ANTLR start "rule__ServiceSet__Group__2"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:630:1: rule__ServiceSet__Group__2 : rule__ServiceSet__Group__2__Impl rule__ServiceSet__Group__3 ;
    public final void rule__ServiceSet__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:634:1: ( rule__ServiceSet__Group__2__Impl rule__ServiceSet__Group__3 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:635:2: rule__ServiceSet__Group__2__Impl rule__ServiceSet__Group__3
            {
            pushFollow(FOLLOW_rule__ServiceSet__Group__2__Impl_in_rule__ServiceSet__Group__21284);
            rule__ServiceSet__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ServiceSet__Group__3_in_rule__ServiceSet__Group__21287);
            rule__ServiceSet__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServiceSet__Group__2"


    // $ANTLR start "rule__ServiceSet__Group__2__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:642:1: rule__ServiceSet__Group__2__Impl : ( ( rule__ServiceSet__NameAssignment_2 ) ) ;
    public final void rule__ServiceSet__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:646:1: ( ( ( rule__ServiceSet__NameAssignment_2 ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:647:1: ( ( rule__ServiceSet__NameAssignment_2 ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:647:1: ( ( rule__ServiceSet__NameAssignment_2 ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:648:1: ( rule__ServiceSet__NameAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getServiceSetAccess().getNameAssignment_2()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:649:1: ( rule__ServiceSet__NameAssignment_2 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:649:2: rule__ServiceSet__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__ServiceSet__NameAssignment_2_in_rule__ServiceSet__Group__2__Impl1314);
            rule__ServiceSet__NameAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getServiceSetAccess().getNameAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServiceSet__Group__2__Impl"


    // $ANTLR start "rule__ServiceSet__Group__3"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:659:1: rule__ServiceSet__Group__3 : rule__ServiceSet__Group__3__Impl rule__ServiceSet__Group__4 ;
    public final void rule__ServiceSet__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:663:1: ( rule__ServiceSet__Group__3__Impl rule__ServiceSet__Group__4 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:664:2: rule__ServiceSet__Group__3__Impl rule__ServiceSet__Group__4
            {
            pushFollow(FOLLOW_rule__ServiceSet__Group__3__Impl_in_rule__ServiceSet__Group__31344);
            rule__ServiceSet__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ServiceSet__Group__4_in_rule__ServiceSet__Group__31347);
            rule__ServiceSet__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServiceSet__Group__3"


    // $ANTLR start "rule__ServiceSet__Group__3__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:671:1: rule__ServiceSet__Group__3__Impl : ( '{' ) ;
    public final void rule__ServiceSet__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:675:1: ( ( '{' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:676:1: ( '{' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:676:1: ( '{' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:677:1: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getServiceSetAccess().getLeftCurlyBracketKeyword_3()); 
            }
            match(input,18,FOLLOW_18_in_rule__ServiceSet__Group__3__Impl1375); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getServiceSetAccess().getLeftCurlyBracketKeyword_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServiceSet__Group__3__Impl"


    // $ANTLR start "rule__ServiceSet__Group__4"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:690:1: rule__ServiceSet__Group__4 : rule__ServiceSet__Group__4__Impl rule__ServiceSet__Group__5 ;
    public final void rule__ServiceSet__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:694:1: ( rule__ServiceSet__Group__4__Impl rule__ServiceSet__Group__5 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:695:2: rule__ServiceSet__Group__4__Impl rule__ServiceSet__Group__5
            {
            pushFollow(FOLLOW_rule__ServiceSet__Group__4__Impl_in_rule__ServiceSet__Group__41406);
            rule__ServiceSet__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ServiceSet__Group__5_in_rule__ServiceSet__Group__41409);
            rule__ServiceSet__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServiceSet__Group__4"


    // $ANTLR start "rule__ServiceSet__Group__4__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:702:1: rule__ServiceSet__Group__4__Impl : ( ( rule__ServiceSet__Group_4__0 )? ) ;
    public final void rule__ServiceSet__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:706:1: ( ( ( rule__ServiceSet__Group_4__0 )? ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:707:1: ( ( rule__ServiceSet__Group_4__0 )? )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:707:1: ( ( rule__ServiceSet__Group_4__0 )? )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:708:1: ( rule__ServiceSet__Group_4__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getServiceSetAccess().getGroup_4()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:709:1: ( rule__ServiceSet__Group_4__0 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==20) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:709:2: rule__ServiceSet__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__ServiceSet__Group_4__0_in_rule__ServiceSet__Group__4__Impl1436);
                    rule__ServiceSet__Group_4__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getServiceSetAccess().getGroup_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServiceSet__Group__4__Impl"


    // $ANTLR start "rule__ServiceSet__Group__5"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:719:1: rule__ServiceSet__Group__5 : rule__ServiceSet__Group__5__Impl rule__ServiceSet__Group__6 ;
    public final void rule__ServiceSet__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:723:1: ( rule__ServiceSet__Group__5__Impl rule__ServiceSet__Group__6 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:724:2: rule__ServiceSet__Group__5__Impl rule__ServiceSet__Group__6
            {
            pushFollow(FOLLOW_rule__ServiceSet__Group__5__Impl_in_rule__ServiceSet__Group__51467);
            rule__ServiceSet__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ServiceSet__Group__6_in_rule__ServiceSet__Group__51470);
            rule__ServiceSet__Group__6();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServiceSet__Group__5"


    // $ANTLR start "rule__ServiceSet__Group__5__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:731:1: rule__ServiceSet__Group__5__Impl : ( ( rule__ServiceSet__Group_5__0 )? ) ;
    public final void rule__ServiceSet__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:735:1: ( ( ( rule__ServiceSet__Group_5__0 )? ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:736:1: ( ( rule__ServiceSet__Group_5__0 )? )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:736:1: ( ( rule__ServiceSet__Group_5__0 )? )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:737:1: ( rule__ServiceSet__Group_5__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getServiceSetAccess().getGroup_5()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:738:1: ( rule__ServiceSet__Group_5__0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==22) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:738:2: rule__ServiceSet__Group_5__0
                    {
                    pushFollow(FOLLOW_rule__ServiceSet__Group_5__0_in_rule__ServiceSet__Group__5__Impl1497);
                    rule__ServiceSet__Group_5__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getServiceSetAccess().getGroup_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServiceSet__Group__5__Impl"


    // $ANTLR start "rule__ServiceSet__Group__6"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:748:1: rule__ServiceSet__Group__6 : rule__ServiceSet__Group__6__Impl ;
    public final void rule__ServiceSet__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:752:1: ( rule__ServiceSet__Group__6__Impl )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:753:2: rule__ServiceSet__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__ServiceSet__Group__6__Impl_in_rule__ServiceSet__Group__61528);
            rule__ServiceSet__Group__6__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServiceSet__Group__6"


    // $ANTLR start "rule__ServiceSet__Group__6__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:759:1: rule__ServiceSet__Group__6__Impl : ( '}' ) ;
    public final void rule__ServiceSet__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:763:1: ( ( '}' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:764:1: ( '}' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:764:1: ( '}' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:765:1: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getServiceSetAccess().getRightCurlyBracketKeyword_6()); 
            }
            match(input,19,FOLLOW_19_in_rule__ServiceSet__Group__6__Impl1556); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getServiceSetAccess().getRightCurlyBracketKeyword_6()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServiceSet__Group__6__Impl"


    // $ANTLR start "rule__ServiceSet__Group_4__0"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:792:1: rule__ServiceSet__Group_4__0 : rule__ServiceSet__Group_4__0__Impl rule__ServiceSet__Group_4__1 ;
    public final void rule__ServiceSet__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:796:1: ( rule__ServiceSet__Group_4__0__Impl rule__ServiceSet__Group_4__1 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:797:2: rule__ServiceSet__Group_4__0__Impl rule__ServiceSet__Group_4__1
            {
            pushFollow(FOLLOW_rule__ServiceSet__Group_4__0__Impl_in_rule__ServiceSet__Group_4__01601);
            rule__ServiceSet__Group_4__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ServiceSet__Group_4__1_in_rule__ServiceSet__Group_4__01604);
            rule__ServiceSet__Group_4__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServiceSet__Group_4__0"


    // $ANTLR start "rule__ServiceSet__Group_4__0__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:804:1: rule__ServiceSet__Group_4__0__Impl : ( 'description:' ) ;
    public final void rule__ServiceSet__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:808:1: ( ( 'description:' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:809:1: ( 'description:' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:809:1: ( 'description:' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:810:1: 'description:'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getServiceSetAccess().getDescriptionKeyword_4_0()); 
            }
            match(input,20,FOLLOW_20_in_rule__ServiceSet__Group_4__0__Impl1632); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getServiceSetAccess().getDescriptionKeyword_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServiceSet__Group_4__0__Impl"


    // $ANTLR start "rule__ServiceSet__Group_4__1"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:823:1: rule__ServiceSet__Group_4__1 : rule__ServiceSet__Group_4__1__Impl ;
    public final void rule__ServiceSet__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:827:1: ( rule__ServiceSet__Group_4__1__Impl )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:828:2: rule__ServiceSet__Group_4__1__Impl
            {
            pushFollow(FOLLOW_rule__ServiceSet__Group_4__1__Impl_in_rule__ServiceSet__Group_4__11663);
            rule__ServiceSet__Group_4__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServiceSet__Group_4__1"


    // $ANTLR start "rule__ServiceSet__Group_4__1__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:834:1: rule__ServiceSet__Group_4__1__Impl : ( ( rule__ServiceSet__DescriptionAssignment_4_1 ) ) ;
    public final void rule__ServiceSet__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:838:1: ( ( ( rule__ServiceSet__DescriptionAssignment_4_1 ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:839:1: ( ( rule__ServiceSet__DescriptionAssignment_4_1 ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:839:1: ( ( rule__ServiceSet__DescriptionAssignment_4_1 ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:840:1: ( rule__ServiceSet__DescriptionAssignment_4_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getServiceSetAccess().getDescriptionAssignment_4_1()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:841:1: ( rule__ServiceSet__DescriptionAssignment_4_1 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:841:2: rule__ServiceSet__DescriptionAssignment_4_1
            {
            pushFollow(FOLLOW_rule__ServiceSet__DescriptionAssignment_4_1_in_rule__ServiceSet__Group_4__1__Impl1690);
            rule__ServiceSet__DescriptionAssignment_4_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getServiceSetAccess().getDescriptionAssignment_4_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServiceSet__Group_4__1__Impl"


    // $ANTLR start "rule__ServiceSet__Group_5__0"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:855:1: rule__ServiceSet__Group_5__0 : rule__ServiceSet__Group_5__0__Impl rule__ServiceSet__Group_5__1 ;
    public final void rule__ServiceSet__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:859:1: ( rule__ServiceSet__Group_5__0__Impl rule__ServiceSet__Group_5__1 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:860:2: rule__ServiceSet__Group_5__0__Impl rule__ServiceSet__Group_5__1
            {
            pushFollow(FOLLOW_rule__ServiceSet__Group_5__0__Impl_in_rule__ServiceSet__Group_5__01724);
            rule__ServiceSet__Group_5__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ServiceSet__Group_5__1_in_rule__ServiceSet__Group_5__01727);
            rule__ServiceSet__Group_5__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServiceSet__Group_5__0"


    // $ANTLR start "rule__ServiceSet__Group_5__0__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:867:1: rule__ServiceSet__Group_5__0__Impl : ( ( rule__ServiceSet__VpServicesAssignment_5_0 ) ) ;
    public final void rule__ServiceSet__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:871:1: ( ( ( rule__ServiceSet__VpServicesAssignment_5_0 ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:872:1: ( ( rule__ServiceSet__VpServicesAssignment_5_0 ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:872:1: ( ( rule__ServiceSet__VpServicesAssignment_5_0 ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:873:1: ( rule__ServiceSet__VpServicesAssignment_5_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getServiceSetAccess().getVpServicesAssignment_5_0()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:874:1: ( rule__ServiceSet__VpServicesAssignment_5_0 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:874:2: rule__ServiceSet__VpServicesAssignment_5_0
            {
            pushFollow(FOLLOW_rule__ServiceSet__VpServicesAssignment_5_0_in_rule__ServiceSet__Group_5__0__Impl1754);
            rule__ServiceSet__VpServicesAssignment_5_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getServiceSetAccess().getVpServicesAssignment_5_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServiceSet__Group_5__0__Impl"


    // $ANTLR start "rule__ServiceSet__Group_5__1"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:884:1: rule__ServiceSet__Group_5__1 : rule__ServiceSet__Group_5__1__Impl ;
    public final void rule__ServiceSet__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:888:1: ( rule__ServiceSet__Group_5__1__Impl )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:889:2: rule__ServiceSet__Group_5__1__Impl
            {
            pushFollow(FOLLOW_rule__ServiceSet__Group_5__1__Impl_in_rule__ServiceSet__Group_5__11784);
            rule__ServiceSet__Group_5__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServiceSet__Group_5__1"


    // $ANTLR start "rule__ServiceSet__Group_5__1__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:895:1: rule__ServiceSet__Group_5__1__Impl : ( ( rule__ServiceSet__VpServicesAssignment_5_1 )* ) ;
    public final void rule__ServiceSet__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:899:1: ( ( ( rule__ServiceSet__VpServicesAssignment_5_1 )* ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:900:1: ( ( rule__ServiceSet__VpServicesAssignment_5_1 )* )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:900:1: ( ( rule__ServiceSet__VpServicesAssignment_5_1 )* )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:901:1: ( rule__ServiceSet__VpServicesAssignment_5_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getServiceSetAccess().getVpServicesAssignment_5_1()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:902:1: ( rule__ServiceSet__VpServicesAssignment_5_1 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==22) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:902:2: rule__ServiceSet__VpServicesAssignment_5_1
            	    {
            	    pushFollow(FOLLOW_rule__ServiceSet__VpServicesAssignment_5_1_in_rule__ServiceSet__Group_5__1__Impl1811);
            	    rule__ServiceSet__VpServicesAssignment_5_1();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getServiceSetAccess().getVpServicesAssignment_5_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServiceSet__Group_5__1__Impl"


    // $ANTLR start "rule__RuleSet__Group__0"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:916:1: rule__RuleSet__Group__0 : rule__RuleSet__Group__0__Impl rule__RuleSet__Group__1 ;
    public final void rule__RuleSet__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:920:1: ( rule__RuleSet__Group__0__Impl rule__RuleSet__Group__1 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:921:2: rule__RuleSet__Group__0__Impl rule__RuleSet__Group__1
            {
            pushFollow(FOLLOW_rule__RuleSet__Group__0__Impl_in_rule__RuleSet__Group__01846);
            rule__RuleSet__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__RuleSet__Group__1_in_rule__RuleSet__Group__01849);
            rule__RuleSet__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RuleSet__Group__0"


    // $ANTLR start "rule__RuleSet__Group__0__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:928:1: rule__RuleSet__Group__0__Impl : ( () ) ;
    public final void rule__RuleSet__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:932:1: ( ( () ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:933:1: ( () )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:933:1: ( () )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:934:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRuleSetAccess().getRuleSetAction_0()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:935:1: ()
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:937:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRuleSetAccess().getRuleSetAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RuleSet__Group__0__Impl"


    // $ANTLR start "rule__RuleSet__Group__1"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:947:1: rule__RuleSet__Group__1 : rule__RuleSet__Group__1__Impl rule__RuleSet__Group__2 ;
    public final void rule__RuleSet__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:951:1: ( rule__RuleSet__Group__1__Impl rule__RuleSet__Group__2 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:952:2: rule__RuleSet__Group__1__Impl rule__RuleSet__Group__2
            {
            pushFollow(FOLLOW_rule__RuleSet__Group__1__Impl_in_rule__RuleSet__Group__11907);
            rule__RuleSet__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__RuleSet__Group__2_in_rule__RuleSet__Group__11910);
            rule__RuleSet__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RuleSet__Group__1"


    // $ANTLR start "rule__RuleSet__Group__1__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:959:1: rule__RuleSet__Group__1__Impl : ( 'Rules' ) ;
    public final void rule__RuleSet__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:963:1: ( ( 'Rules' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:964:1: ( 'Rules' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:964:1: ( 'Rules' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:965:1: 'Rules'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRuleSetAccess().getRulesKeyword_1()); 
            }
            match(input,21,FOLLOW_21_in_rule__RuleSet__Group__1__Impl1938); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRuleSetAccess().getRulesKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RuleSet__Group__1__Impl"


    // $ANTLR start "rule__RuleSet__Group__2"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:978:1: rule__RuleSet__Group__2 : rule__RuleSet__Group__2__Impl rule__RuleSet__Group__3 ;
    public final void rule__RuleSet__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:982:1: ( rule__RuleSet__Group__2__Impl rule__RuleSet__Group__3 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:983:2: rule__RuleSet__Group__2__Impl rule__RuleSet__Group__3
            {
            pushFollow(FOLLOW_rule__RuleSet__Group__2__Impl_in_rule__RuleSet__Group__21969);
            rule__RuleSet__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__RuleSet__Group__3_in_rule__RuleSet__Group__21972);
            rule__RuleSet__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RuleSet__Group__2"


    // $ANTLR start "rule__RuleSet__Group__2__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:990:1: rule__RuleSet__Group__2__Impl : ( ( rule__RuleSet__NameAssignment_2 ) ) ;
    public final void rule__RuleSet__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:994:1: ( ( ( rule__RuleSet__NameAssignment_2 ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:995:1: ( ( rule__RuleSet__NameAssignment_2 ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:995:1: ( ( rule__RuleSet__NameAssignment_2 ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:996:1: ( rule__RuleSet__NameAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRuleSetAccess().getNameAssignment_2()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:997:1: ( rule__RuleSet__NameAssignment_2 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:997:2: rule__RuleSet__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__RuleSet__NameAssignment_2_in_rule__RuleSet__Group__2__Impl1999);
            rule__RuleSet__NameAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRuleSetAccess().getNameAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RuleSet__Group__2__Impl"


    // $ANTLR start "rule__RuleSet__Group__3"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:1007:1: rule__RuleSet__Group__3 : rule__RuleSet__Group__3__Impl rule__RuleSet__Group__4 ;
    public final void rule__RuleSet__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:1011:1: ( rule__RuleSet__Group__3__Impl rule__RuleSet__Group__4 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:1012:2: rule__RuleSet__Group__3__Impl rule__RuleSet__Group__4
            {
            pushFollow(FOLLOW_rule__RuleSet__Group__3__Impl_in_rule__RuleSet__Group__32029);
            rule__RuleSet__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__RuleSet__Group__4_in_rule__RuleSet__Group__32032);
            rule__RuleSet__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RuleSet__Group__3"


    // $ANTLR start "rule__RuleSet__Group__3__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:1019:1: rule__RuleSet__Group__3__Impl : ( '{' ) ;
    public final void rule__RuleSet__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:1023:1: ( ( '{' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:1024:1: ( '{' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:1024:1: ( '{' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:1025:1: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRuleSetAccess().getLeftCurlyBracketKeyword_3()); 
            }
            match(input,18,FOLLOW_18_in_rule__RuleSet__Group__3__Impl2060); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRuleSetAccess().getLeftCurlyBracketKeyword_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RuleSet__Group__3__Impl"


    // $ANTLR start "rule__RuleSet__Group__4"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:1038:1: rule__RuleSet__Group__4 : rule__RuleSet__Group__4__Impl rule__RuleSet__Group__5 ;
    public final void rule__RuleSet__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:1042:1: ( rule__RuleSet__Group__4__Impl rule__RuleSet__Group__5 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:1043:2: rule__RuleSet__Group__4__Impl rule__RuleSet__Group__5
            {
            pushFollow(FOLLOW_rule__RuleSet__Group__4__Impl_in_rule__RuleSet__Group__42091);
            rule__RuleSet__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__RuleSet__Group__5_in_rule__RuleSet__Group__42094);
            rule__RuleSet__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RuleSet__Group__4"


    // $ANTLR start "rule__RuleSet__Group__4__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:1050:1: rule__RuleSet__Group__4__Impl : ( ( rule__RuleSet__Group_4__0 )? ) ;
    public final void rule__RuleSet__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:1054:1: ( ( ( rule__RuleSet__Group_4__0 )? ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:1055:1: ( ( rule__RuleSet__Group_4__0 )? )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:1055:1: ( ( rule__RuleSet__Group_4__0 )? )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:1056:1: ( rule__RuleSet__Group_4__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRuleSetAccess().getGroup_4()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:1057:1: ( rule__RuleSet__Group_4__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==20) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:1057:2: rule__RuleSet__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__RuleSet__Group_4__0_in_rule__RuleSet__Group__4__Impl2121);
                    rule__RuleSet__Group_4__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRuleSetAccess().getGroup_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RuleSet__Group__4__Impl"


    // $ANTLR start "rule__RuleSet__Group__5"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:1067:1: rule__RuleSet__Group__5 : rule__RuleSet__Group__5__Impl rule__RuleSet__Group__6 ;
    public final void rule__RuleSet__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:1071:1: ( rule__RuleSet__Group__5__Impl rule__RuleSet__Group__6 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:1072:2: rule__RuleSet__Group__5__Impl rule__RuleSet__Group__6
            {
            pushFollow(FOLLOW_rule__RuleSet__Group__5__Impl_in_rule__RuleSet__Group__52152);
            rule__RuleSet__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__RuleSet__Group__6_in_rule__RuleSet__Group__52155);
            rule__RuleSet__Group__6();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RuleSet__Group__5"


    // $ANTLR start "rule__RuleSet__Group__5__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:1079:1: rule__RuleSet__Group__5__Impl : ( ( rule__RuleSet__Group_5__0 )? ) ;
    public final void rule__RuleSet__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:1083:1: ( ( ( rule__RuleSet__Group_5__0 )? ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:1084:1: ( ( rule__RuleSet__Group_5__0 )? )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:1084:1: ( ( rule__RuleSet__Group_5__0 )? )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:1085:1: ( rule__RuleSet__Group_5__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRuleSetAccess().getGroup_5()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:1086:1: ( rule__RuleSet__Group_5__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==25) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:1086:2: rule__RuleSet__Group_5__0
                    {
                    pushFollow(FOLLOW_rule__RuleSet__Group_5__0_in_rule__RuleSet__Group__5__Impl2182);
                    rule__RuleSet__Group_5__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRuleSetAccess().getGroup_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RuleSet__Group__5__Impl"


    // $ANTLR start "rule__RuleSet__Group__6"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:1096:1: rule__RuleSet__Group__6 : rule__RuleSet__Group__6__Impl ;
    public final void rule__RuleSet__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:1100:1: ( rule__RuleSet__Group__6__Impl )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:1101:2: rule__RuleSet__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__RuleSet__Group__6__Impl_in_rule__RuleSet__Group__62213);
            rule__RuleSet__Group__6__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RuleSet__Group__6"


    // $ANTLR start "rule__RuleSet__Group__6__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:1107:1: rule__RuleSet__Group__6__Impl : ( '}' ) ;
    public final void rule__RuleSet__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:1111:1: ( ( '}' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:1112:1: ( '}' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:1112:1: ( '}' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:1113:1: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRuleSetAccess().getRightCurlyBracketKeyword_6()); 
            }
            match(input,19,FOLLOW_19_in_rule__RuleSet__Group__6__Impl2241); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRuleSetAccess().getRightCurlyBracketKeyword_6()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RuleSet__Group__6__Impl"


    // $ANTLR start "rule__RuleSet__Group_4__0"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:1140:1: rule__RuleSet__Group_4__0 : rule__RuleSet__Group_4__0__Impl rule__RuleSet__Group_4__1 ;
    public final void rule__RuleSet__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:1144:1: ( rule__RuleSet__Group_4__0__Impl rule__RuleSet__Group_4__1 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:1145:2: rule__RuleSet__Group_4__0__Impl rule__RuleSet__Group_4__1
            {
            pushFollow(FOLLOW_rule__RuleSet__Group_4__0__Impl_in_rule__RuleSet__Group_4__02286);
            rule__RuleSet__Group_4__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__RuleSet__Group_4__1_in_rule__RuleSet__Group_4__02289);
            rule__RuleSet__Group_4__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RuleSet__Group_4__0"


    // $ANTLR start "rule__RuleSet__Group_4__0__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:1152:1: rule__RuleSet__Group_4__0__Impl : ( 'description:' ) ;
    public final void rule__RuleSet__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:1156:1: ( ( 'description:' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:1157:1: ( 'description:' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:1157:1: ( 'description:' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:1158:1: 'description:'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRuleSetAccess().getDescriptionKeyword_4_0()); 
            }
            match(input,20,FOLLOW_20_in_rule__RuleSet__Group_4__0__Impl2317); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRuleSetAccess().getDescriptionKeyword_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RuleSet__Group_4__0__Impl"


    // $ANTLR start "rule__RuleSet__Group_4__1"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:1171:1: rule__RuleSet__Group_4__1 : rule__RuleSet__Group_4__1__Impl ;
    public final void rule__RuleSet__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:1175:1: ( rule__RuleSet__Group_4__1__Impl )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:1176:2: rule__RuleSet__Group_4__1__Impl
            {
            pushFollow(FOLLOW_rule__RuleSet__Group_4__1__Impl_in_rule__RuleSet__Group_4__12348);
            rule__RuleSet__Group_4__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RuleSet__Group_4__1"


    // $ANTLR start "rule__RuleSet__Group_4__1__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:1182:1: rule__RuleSet__Group_4__1__Impl : ( ( rule__RuleSet__DescriptionAssignment_4_1 ) ) ;
    public final void rule__RuleSet__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:1186:1: ( ( ( rule__RuleSet__DescriptionAssignment_4_1 ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:1187:1: ( ( rule__RuleSet__DescriptionAssignment_4_1 ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:1187:1: ( ( rule__RuleSet__DescriptionAssignment_4_1 ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:1188:1: ( rule__RuleSet__DescriptionAssignment_4_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRuleSetAccess().getDescriptionAssignment_4_1()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:1189:1: ( rule__RuleSet__DescriptionAssignment_4_1 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:1189:2: rule__RuleSet__DescriptionAssignment_4_1
            {
            pushFollow(FOLLOW_rule__RuleSet__DescriptionAssignment_4_1_in_rule__RuleSet__Group_4__1__Impl2375);
            rule__RuleSet__DescriptionAssignment_4_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRuleSetAccess().getDescriptionAssignment_4_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RuleSet__Group_4__1__Impl"


    // $ANTLR start "rule__RuleSet__Group_5__0"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:1203:1: rule__RuleSet__Group_5__0 : rule__RuleSet__Group_5__0__Impl rule__RuleSet__Group_5__1 ;
    public final void rule__RuleSet__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:1207:1: ( rule__RuleSet__Group_5__0__Impl rule__RuleSet__Group_5__1 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:1208:2: rule__RuleSet__Group_5__0__Impl rule__RuleSet__Group_5__1
            {
            pushFollow(FOLLOW_rule__RuleSet__Group_5__0__Impl_in_rule__RuleSet__Group_5__02409);
            rule__RuleSet__Group_5__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__RuleSet__Group_5__1_in_rule__RuleSet__Group_5__02412);
            rule__RuleSet__Group_5__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RuleSet__Group_5__0"


    // $ANTLR start "rule__RuleSet__Group_5__0__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:1215:1: rule__RuleSet__Group_5__0__Impl : ( ( rule__RuleSet__VpRulesAssignment_5_0 ) ) ;
    public final void rule__RuleSet__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:1219:1: ( ( ( rule__RuleSet__VpRulesAssignment_5_0 ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:1220:1: ( ( rule__RuleSet__VpRulesAssignment_5_0 ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:1220:1: ( ( rule__RuleSet__VpRulesAssignment_5_0 ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:1221:1: ( rule__RuleSet__VpRulesAssignment_5_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRuleSetAccess().getVpRulesAssignment_5_0()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:1222:1: ( rule__RuleSet__VpRulesAssignment_5_0 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:1222:2: rule__RuleSet__VpRulesAssignment_5_0
            {
            pushFollow(FOLLOW_rule__RuleSet__VpRulesAssignment_5_0_in_rule__RuleSet__Group_5__0__Impl2439);
            rule__RuleSet__VpRulesAssignment_5_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRuleSetAccess().getVpRulesAssignment_5_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RuleSet__Group_5__0__Impl"


    // $ANTLR start "rule__RuleSet__Group_5__1"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:1232:1: rule__RuleSet__Group_5__1 : rule__RuleSet__Group_5__1__Impl ;
    public final void rule__RuleSet__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:1236:1: ( rule__RuleSet__Group_5__1__Impl )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:1237:2: rule__RuleSet__Group_5__1__Impl
            {
            pushFollow(FOLLOW_rule__RuleSet__Group_5__1__Impl_in_rule__RuleSet__Group_5__12469);
            rule__RuleSet__Group_5__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RuleSet__Group_5__1"


    // $ANTLR start "rule__RuleSet__Group_5__1__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:1243:1: rule__RuleSet__Group_5__1__Impl : ( ( rule__RuleSet__VpRulesAssignment_5_1 )* ) ;
    public final void rule__RuleSet__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:1247:1: ( ( ( rule__RuleSet__VpRulesAssignment_5_1 )* ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:1248:1: ( ( rule__RuleSet__VpRulesAssignment_5_1 )* )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:1248:1: ( ( rule__RuleSet__VpRulesAssignment_5_1 )* )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:1249:1: ( rule__RuleSet__VpRulesAssignment_5_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRuleSetAccess().getVpRulesAssignment_5_1()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:1250:1: ( rule__RuleSet__VpRulesAssignment_5_1 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==25) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:1250:2: rule__RuleSet__VpRulesAssignment_5_1
            	    {
            	    pushFollow(FOLLOW_rule__RuleSet__VpRulesAssignment_5_1_in_rule__RuleSet__Group_5__1__Impl2496);
            	    rule__RuleSet__VpRulesAssignment_5_1();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRuleSetAccess().getVpRulesAssignment_5_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RuleSet__Group_5__1__Impl"


    // $ANTLR start "rule__Service__Group__0"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:1264:1: rule__Service__Group__0 : rule__Service__Group__0__Impl rule__Service__Group__1 ;
    public final void rule__Service__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:1268:1: ( rule__Service__Group__0__Impl rule__Service__Group__1 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:1269:2: rule__Service__Group__0__Impl rule__Service__Group__1
            {
            pushFollow(FOLLOW_rule__Service__Group__0__Impl_in_rule__Service__Group__02531);
            rule__Service__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Service__Group__1_in_rule__Service__Group__02534);
            rule__Service__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__Group__0"


    // $ANTLR start "rule__Service__Group__0__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:1276:1: rule__Service__Group__0__Impl : ( () ) ;
    public final void rule__Service__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:1280:1: ( ( () ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:1281:1: ( () )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:1281:1: ( () )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:1282:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getServiceAccess().getServiceAction_0()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:1283:1: ()
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:1285:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getServiceAccess().getServiceAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__Group__0__Impl"


    // $ANTLR start "rule__Service__Group__1"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:1295:1: rule__Service__Group__1 : rule__Service__Group__1__Impl rule__Service__Group__2 ;
    public final void rule__Service__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:1299:1: ( rule__Service__Group__1__Impl rule__Service__Group__2 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:1300:2: rule__Service__Group__1__Impl rule__Service__Group__2
            {
            pushFollow(FOLLOW_rule__Service__Group__1__Impl_in_rule__Service__Group__12592);
            rule__Service__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Service__Group__2_in_rule__Service__Group__12595);
            rule__Service__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__Group__1"


    // $ANTLR start "rule__Service__Group__1__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:1307:1: rule__Service__Group__1__Impl : ( 'Service' ) ;
    public final void rule__Service__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:1311:1: ( ( 'Service' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:1312:1: ( 'Service' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:1312:1: ( 'Service' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:1313:1: 'Service'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getServiceAccess().getServiceKeyword_1()); 
            }
            match(input,22,FOLLOW_22_in_rule__Service__Group__1__Impl2623); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getServiceAccess().getServiceKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__Group__1__Impl"


    // $ANTLR start "rule__Service__Group__2"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:1326:1: rule__Service__Group__2 : rule__Service__Group__2__Impl rule__Service__Group__3 ;
    public final void rule__Service__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:1330:1: ( rule__Service__Group__2__Impl rule__Service__Group__3 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:1331:2: rule__Service__Group__2__Impl rule__Service__Group__3
            {
            pushFollow(FOLLOW_rule__Service__Group__2__Impl_in_rule__Service__Group__22654);
            rule__Service__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Service__Group__3_in_rule__Service__Group__22657);
            rule__Service__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__Group__2"


    // $ANTLR start "rule__Service__Group__2__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:1338:1: rule__Service__Group__2__Impl : ( ( rule__Service__NameAssignment_2 ) ) ;
    public final void rule__Service__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:1342:1: ( ( ( rule__Service__NameAssignment_2 ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:1343:1: ( ( rule__Service__NameAssignment_2 ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:1343:1: ( ( rule__Service__NameAssignment_2 ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:1344:1: ( rule__Service__NameAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getServiceAccess().getNameAssignment_2()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:1345:1: ( rule__Service__NameAssignment_2 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:1345:2: rule__Service__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__Service__NameAssignment_2_in_rule__Service__Group__2__Impl2684);
            rule__Service__NameAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getServiceAccess().getNameAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__Group__2__Impl"


    // $ANTLR start "rule__Service__Group__3"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:1355:1: rule__Service__Group__3 : rule__Service__Group__3__Impl rule__Service__Group__4 ;
    public final void rule__Service__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:1359:1: ( rule__Service__Group__3__Impl rule__Service__Group__4 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:1360:2: rule__Service__Group__3__Impl rule__Service__Group__4
            {
            pushFollow(FOLLOW_rule__Service__Group__3__Impl_in_rule__Service__Group__32714);
            rule__Service__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Service__Group__4_in_rule__Service__Group__32717);
            rule__Service__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__Group__3"


    // $ANTLR start "rule__Service__Group__3__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:1367:1: rule__Service__Group__3__Impl : ( ( rule__Service__Group_3__0 )? ) ;
    public final void rule__Service__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:1371:1: ( ( ( rule__Service__Group_3__0 )? ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:1372:1: ( ( rule__Service__Group_3__0 )? )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:1372:1: ( ( rule__Service__Group_3__0 )? )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:1373:1: ( rule__Service__Group_3__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getServiceAccess().getGroup_3()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:1374:1: ( rule__Service__Group_3__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==20) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:1374:2: rule__Service__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__Service__Group_3__0_in_rule__Service__Group__3__Impl2744);
                    rule__Service__Group_3__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getServiceAccess().getGroup_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__Group__3__Impl"


    // $ANTLR start "rule__Service__Group__4"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:1384:1: rule__Service__Group__4 : rule__Service__Group__4__Impl ;
    public final void rule__Service__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:1388:1: ( rule__Service__Group__4__Impl )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:1389:2: rule__Service__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Service__Group__4__Impl_in_rule__Service__Group__42775);
            rule__Service__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__Group__4"


    // $ANTLR start "rule__Service__Group__4__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:1395:1: rule__Service__Group__4__Impl : ( ( rule__Service__Group_4__0 )? ) ;
    public final void rule__Service__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:1399:1: ( ( ( rule__Service__Group_4__0 )? ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:1400:1: ( ( rule__Service__Group_4__0 )? )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:1400:1: ( ( rule__Service__Group_4__0 )? )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:1401:1: ( rule__Service__Group_4__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getServiceAccess().getGroup_4()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:1402:1: ( rule__Service__Group_4__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==24) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:1402:2: rule__Service__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__Service__Group_4__0_in_rule__Service__Group__4__Impl2802);
                    rule__Service__Group_4__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getServiceAccess().getGroup_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__Group__4__Impl"


    // $ANTLR start "rule__Service__Group_3__0"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:1422:1: rule__Service__Group_3__0 : rule__Service__Group_3__0__Impl rule__Service__Group_3__1 ;
    public final void rule__Service__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:1426:1: ( rule__Service__Group_3__0__Impl rule__Service__Group_3__1 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:1427:2: rule__Service__Group_3__0__Impl rule__Service__Group_3__1
            {
            pushFollow(FOLLOW_rule__Service__Group_3__0__Impl_in_rule__Service__Group_3__02843);
            rule__Service__Group_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Service__Group_3__1_in_rule__Service__Group_3__02846);
            rule__Service__Group_3__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__Group_3__0"


    // $ANTLR start "rule__Service__Group_3__0__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:1434:1: rule__Service__Group_3__0__Impl : ( 'description:' ) ;
    public final void rule__Service__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:1438:1: ( ( 'description:' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:1439:1: ( 'description:' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:1439:1: ( 'description:' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:1440:1: 'description:'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getServiceAccess().getDescriptionKeyword_3_0()); 
            }
            match(input,20,FOLLOW_20_in_rule__Service__Group_3__0__Impl2874); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getServiceAccess().getDescriptionKeyword_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__Group_3__0__Impl"


    // $ANTLR start "rule__Service__Group_3__1"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:1453:1: rule__Service__Group_3__1 : rule__Service__Group_3__1__Impl rule__Service__Group_3__2 ;
    public final void rule__Service__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:1457:1: ( rule__Service__Group_3__1__Impl rule__Service__Group_3__2 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:1458:2: rule__Service__Group_3__1__Impl rule__Service__Group_3__2
            {
            pushFollow(FOLLOW_rule__Service__Group_3__1__Impl_in_rule__Service__Group_3__12905);
            rule__Service__Group_3__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Service__Group_3__2_in_rule__Service__Group_3__12908);
            rule__Service__Group_3__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__Group_3__1"


    // $ANTLR start "rule__Service__Group_3__1__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:1465:1: rule__Service__Group_3__1__Impl : ( ( rule__Service__DescriptionAssignment_3_1 ) ) ;
    public final void rule__Service__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:1469:1: ( ( ( rule__Service__DescriptionAssignment_3_1 ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:1470:1: ( ( rule__Service__DescriptionAssignment_3_1 ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:1470:1: ( ( rule__Service__DescriptionAssignment_3_1 ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:1471:1: ( rule__Service__DescriptionAssignment_3_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getServiceAccess().getDescriptionAssignment_3_1()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:1472:1: ( rule__Service__DescriptionAssignment_3_1 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:1472:2: rule__Service__DescriptionAssignment_3_1
            {
            pushFollow(FOLLOW_rule__Service__DescriptionAssignment_3_1_in_rule__Service__Group_3__1__Impl2935);
            rule__Service__DescriptionAssignment_3_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getServiceAccess().getDescriptionAssignment_3_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__Group_3__1__Impl"


    // $ANTLR start "rule__Service__Group_3__2"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:1482:1: rule__Service__Group_3__2 : rule__Service__Group_3__2__Impl ;
    public final void rule__Service__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:1486:1: ( rule__Service__Group_3__2__Impl )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:1487:2: rule__Service__Group_3__2__Impl
            {
            pushFollow(FOLLOW_rule__Service__Group_3__2__Impl_in_rule__Service__Group_3__22965);
            rule__Service__Group_3__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__Group_3__2"


    // $ANTLR start "rule__Service__Group_3__2__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:1493:1: rule__Service__Group_3__2__Impl : ( ',' ) ;
    public final void rule__Service__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:1497:1: ( ( ',' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:1498:1: ( ',' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:1498:1: ( ',' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:1499:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getServiceAccess().getCommaKeyword_3_2()); 
            }
            match(input,23,FOLLOW_23_in_rule__Service__Group_3__2__Impl2993); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getServiceAccess().getCommaKeyword_3_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__Group_3__2__Impl"


    // $ANTLR start "rule__Service__Group_4__0"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:1518:1: rule__Service__Group_4__0 : rule__Service__Group_4__0__Impl rule__Service__Group_4__1 ;
    public final void rule__Service__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:1522:1: ( rule__Service__Group_4__0__Impl rule__Service__Group_4__1 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:1523:2: rule__Service__Group_4__0__Impl rule__Service__Group_4__1
            {
            pushFollow(FOLLOW_rule__Service__Group_4__0__Impl_in_rule__Service__Group_4__03030);
            rule__Service__Group_4__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Service__Group_4__1_in_rule__Service__Group_4__03033);
            rule__Service__Group_4__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__Group_4__0"


    // $ANTLR start "rule__Service__Group_4__0__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:1530:1: rule__Service__Group_4__0__Impl : ( 'orchestrates' ) ;
    public final void rule__Service__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:1534:1: ( ( 'orchestrates' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:1535:1: ( 'orchestrates' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:1535:1: ( 'orchestrates' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:1536:1: 'orchestrates'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getServiceAccess().getOrchestratesKeyword_4_0()); 
            }
            match(input,24,FOLLOW_24_in_rule__Service__Group_4__0__Impl3061); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getServiceAccess().getOrchestratesKeyword_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__Group_4__0__Impl"


    // $ANTLR start "rule__Service__Group_4__1"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:1549:1: rule__Service__Group_4__1 : rule__Service__Group_4__1__Impl rule__Service__Group_4__2 ;
    public final void rule__Service__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:1553:1: ( rule__Service__Group_4__1__Impl rule__Service__Group_4__2 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:1554:2: rule__Service__Group_4__1__Impl rule__Service__Group_4__2
            {
            pushFollow(FOLLOW_rule__Service__Group_4__1__Impl_in_rule__Service__Group_4__13092);
            rule__Service__Group_4__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Service__Group_4__2_in_rule__Service__Group_4__13095);
            rule__Service__Group_4__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__Group_4__1"


    // $ANTLR start "rule__Service__Group_4__1__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:1561:1: rule__Service__Group_4__1__Impl : ( ( rule__Service__RelatedRulesAssignment_4_1 ) ) ;
    public final void rule__Service__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:1565:1: ( ( ( rule__Service__RelatedRulesAssignment_4_1 ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:1566:1: ( ( rule__Service__RelatedRulesAssignment_4_1 ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:1566:1: ( ( rule__Service__RelatedRulesAssignment_4_1 ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:1567:1: ( rule__Service__RelatedRulesAssignment_4_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getServiceAccess().getRelatedRulesAssignment_4_1()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:1568:1: ( rule__Service__RelatedRulesAssignment_4_1 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:1568:2: rule__Service__RelatedRulesAssignment_4_1
            {
            pushFollow(FOLLOW_rule__Service__RelatedRulesAssignment_4_1_in_rule__Service__Group_4__1__Impl3122);
            rule__Service__RelatedRulesAssignment_4_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getServiceAccess().getRelatedRulesAssignment_4_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__Group_4__1__Impl"


    // $ANTLR start "rule__Service__Group_4__2"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:1578:1: rule__Service__Group_4__2 : rule__Service__Group_4__2__Impl ;
    public final void rule__Service__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:1582:1: ( rule__Service__Group_4__2__Impl )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:1583:2: rule__Service__Group_4__2__Impl
            {
            pushFollow(FOLLOW_rule__Service__Group_4__2__Impl_in_rule__Service__Group_4__23152);
            rule__Service__Group_4__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__Group_4__2"


    // $ANTLR start "rule__Service__Group_4__2__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:1589:1: rule__Service__Group_4__2__Impl : ( ( rule__Service__Group_4_2__0 )* ) ;
    public final void rule__Service__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:1593:1: ( ( ( rule__Service__Group_4_2__0 )* ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:1594:1: ( ( rule__Service__Group_4_2__0 )* )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:1594:1: ( ( rule__Service__Group_4_2__0 )* )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:1595:1: ( rule__Service__Group_4_2__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getServiceAccess().getGroup_4_2()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:1596:1: ( rule__Service__Group_4_2__0 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==23) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:1596:2: rule__Service__Group_4_2__0
            	    {
            	    pushFollow(FOLLOW_rule__Service__Group_4_2__0_in_rule__Service__Group_4__2__Impl3179);
            	    rule__Service__Group_4_2__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getServiceAccess().getGroup_4_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__Group_4__2__Impl"


    // $ANTLR start "rule__Service__Group_4_2__0"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:1612:1: rule__Service__Group_4_2__0 : rule__Service__Group_4_2__0__Impl rule__Service__Group_4_2__1 ;
    public final void rule__Service__Group_4_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:1616:1: ( rule__Service__Group_4_2__0__Impl rule__Service__Group_4_2__1 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:1617:2: rule__Service__Group_4_2__0__Impl rule__Service__Group_4_2__1
            {
            pushFollow(FOLLOW_rule__Service__Group_4_2__0__Impl_in_rule__Service__Group_4_2__03216);
            rule__Service__Group_4_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Service__Group_4_2__1_in_rule__Service__Group_4_2__03219);
            rule__Service__Group_4_2__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__Group_4_2__0"


    // $ANTLR start "rule__Service__Group_4_2__0__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:1624:1: rule__Service__Group_4_2__0__Impl : ( ',' ) ;
    public final void rule__Service__Group_4_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:1628:1: ( ( ',' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:1629:1: ( ',' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:1629:1: ( ',' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:1630:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getServiceAccess().getCommaKeyword_4_2_0()); 
            }
            match(input,23,FOLLOW_23_in_rule__Service__Group_4_2__0__Impl3247); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getServiceAccess().getCommaKeyword_4_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__Group_4_2__0__Impl"


    // $ANTLR start "rule__Service__Group_4_2__1"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:1643:1: rule__Service__Group_4_2__1 : rule__Service__Group_4_2__1__Impl ;
    public final void rule__Service__Group_4_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:1647:1: ( rule__Service__Group_4_2__1__Impl )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:1648:2: rule__Service__Group_4_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Service__Group_4_2__1__Impl_in_rule__Service__Group_4_2__13278);
            rule__Service__Group_4_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__Group_4_2__1"


    // $ANTLR start "rule__Service__Group_4_2__1__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:1654:1: rule__Service__Group_4_2__1__Impl : ( ( rule__Service__RelatedRulesAssignment_4_2_1 ) ) ;
    public final void rule__Service__Group_4_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:1658:1: ( ( ( rule__Service__RelatedRulesAssignment_4_2_1 ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:1659:1: ( ( rule__Service__RelatedRulesAssignment_4_2_1 ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:1659:1: ( ( rule__Service__RelatedRulesAssignment_4_2_1 ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:1660:1: ( rule__Service__RelatedRulesAssignment_4_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getServiceAccess().getRelatedRulesAssignment_4_2_1()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:1661:1: ( rule__Service__RelatedRulesAssignment_4_2_1 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:1661:2: rule__Service__RelatedRulesAssignment_4_2_1
            {
            pushFollow(FOLLOW_rule__Service__RelatedRulesAssignment_4_2_1_in_rule__Service__Group_4_2__1__Impl3305);
            rule__Service__RelatedRulesAssignment_4_2_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getServiceAccess().getRelatedRulesAssignment_4_2_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__Group_4_2__1__Impl"


    // $ANTLR start "rule__Rule__Group__0"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:1675:1: rule__Rule__Group__0 : rule__Rule__Group__0__Impl rule__Rule__Group__1 ;
    public final void rule__Rule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:1679:1: ( rule__Rule__Group__0__Impl rule__Rule__Group__1 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:1680:2: rule__Rule__Group__0__Impl rule__Rule__Group__1
            {
            pushFollow(FOLLOW_rule__Rule__Group__0__Impl_in_rule__Rule__Group__03339);
            rule__Rule__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Rule__Group__1_in_rule__Rule__Group__03342);
            rule__Rule__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__0"


    // $ANTLR start "rule__Rule__Group__0__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:1687:1: rule__Rule__Group__0__Impl : ( () ) ;
    public final void rule__Rule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:1691:1: ( ( () ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:1692:1: ( () )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:1692:1: ( () )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:1693:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRuleAccess().getRuleAction_0()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:1694:1: ()
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:1696:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRuleAccess().getRuleAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__0__Impl"


    // $ANTLR start "rule__Rule__Group__1"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:1706:1: rule__Rule__Group__1 : rule__Rule__Group__1__Impl rule__Rule__Group__2 ;
    public final void rule__Rule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:1710:1: ( rule__Rule__Group__1__Impl rule__Rule__Group__2 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:1711:2: rule__Rule__Group__1__Impl rule__Rule__Group__2
            {
            pushFollow(FOLLOW_rule__Rule__Group__1__Impl_in_rule__Rule__Group__13400);
            rule__Rule__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Rule__Group__2_in_rule__Rule__Group__13403);
            rule__Rule__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__1"


    // $ANTLR start "rule__Rule__Group__1__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:1718:1: rule__Rule__Group__1__Impl : ( 'Rule' ) ;
    public final void rule__Rule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:1722:1: ( ( 'Rule' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:1723:1: ( 'Rule' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:1723:1: ( 'Rule' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:1724:1: 'Rule'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRuleAccess().getRuleKeyword_1()); 
            }
            match(input,25,FOLLOW_25_in_rule__Rule__Group__1__Impl3431); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRuleAccess().getRuleKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__1__Impl"


    // $ANTLR start "rule__Rule__Group__2"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:1737:1: rule__Rule__Group__2 : rule__Rule__Group__2__Impl rule__Rule__Group__3 ;
    public final void rule__Rule__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:1741:1: ( rule__Rule__Group__2__Impl rule__Rule__Group__3 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:1742:2: rule__Rule__Group__2__Impl rule__Rule__Group__3
            {
            pushFollow(FOLLOW_rule__Rule__Group__2__Impl_in_rule__Rule__Group__23462);
            rule__Rule__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Rule__Group__3_in_rule__Rule__Group__23465);
            rule__Rule__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__2"


    // $ANTLR start "rule__Rule__Group__2__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:1749:1: rule__Rule__Group__2__Impl : ( ( rule__Rule__NameAssignment_2 ) ) ;
    public final void rule__Rule__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:1753:1: ( ( ( rule__Rule__NameAssignment_2 ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:1754:1: ( ( rule__Rule__NameAssignment_2 ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:1754:1: ( ( rule__Rule__NameAssignment_2 ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:1755:1: ( rule__Rule__NameAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRuleAccess().getNameAssignment_2()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:1756:1: ( rule__Rule__NameAssignment_2 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:1756:2: rule__Rule__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__Rule__NameAssignment_2_in_rule__Rule__Group__2__Impl3492);
            rule__Rule__NameAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRuleAccess().getNameAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__2__Impl"


    // $ANTLR start "rule__Rule__Group__3"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:1766:1: rule__Rule__Group__3 : rule__Rule__Group__3__Impl rule__Rule__Group__4 ;
    public final void rule__Rule__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:1770:1: ( rule__Rule__Group__3__Impl rule__Rule__Group__4 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:1771:2: rule__Rule__Group__3__Impl rule__Rule__Group__4
            {
            pushFollow(FOLLOW_rule__Rule__Group__3__Impl_in_rule__Rule__Group__33522);
            rule__Rule__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Rule__Group__4_in_rule__Rule__Group__33525);
            rule__Rule__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__3"


    // $ANTLR start "rule__Rule__Group__3__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:1778:1: rule__Rule__Group__3__Impl : ( ( rule__Rule__Group_3__0 )? ) ;
    public final void rule__Rule__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:1782:1: ( ( ( rule__Rule__Group_3__0 )? ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:1783:1: ( ( rule__Rule__Group_3__0 )? )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:1783:1: ( ( rule__Rule__Group_3__0 )? )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:1784:1: ( rule__Rule__Group_3__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRuleAccess().getGroup_3()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:1785:1: ( rule__Rule__Group_3__0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==20) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:1785:2: rule__Rule__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__Rule__Group_3__0_in_rule__Rule__Group__3__Impl3552);
                    rule__Rule__Group_3__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRuleAccess().getGroup_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__3__Impl"


    // $ANTLR start "rule__Rule__Group__4"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:1795:1: rule__Rule__Group__4 : rule__Rule__Group__4__Impl rule__Rule__Group__5 ;
    public final void rule__Rule__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:1799:1: ( rule__Rule__Group__4__Impl rule__Rule__Group__5 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:1800:2: rule__Rule__Group__4__Impl rule__Rule__Group__5
            {
            pushFollow(FOLLOW_rule__Rule__Group__4__Impl_in_rule__Rule__Group__43583);
            rule__Rule__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Rule__Group__5_in_rule__Rule__Group__43586);
            rule__Rule__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__4"


    // $ANTLR start "rule__Rule__Group__4__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:1807:1: rule__Rule__Group__4__Impl : ( ( rule__Rule__Group_4__0 ) ) ;
    public final void rule__Rule__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:1811:1: ( ( ( rule__Rule__Group_4__0 ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:1812:1: ( ( rule__Rule__Group_4__0 ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:1812:1: ( ( rule__Rule__Group_4__0 ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:1813:1: ( rule__Rule__Group_4__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRuleAccess().getGroup_4()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:1814:1: ( rule__Rule__Group_4__0 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:1814:2: rule__Rule__Group_4__0
            {
            pushFollow(FOLLOW_rule__Rule__Group_4__0_in_rule__Rule__Group__4__Impl3613);
            rule__Rule__Group_4__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRuleAccess().getGroup_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__4__Impl"


    // $ANTLR start "rule__Rule__Group__5"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:1824:1: rule__Rule__Group__5 : rule__Rule__Group__5__Impl ;
    public final void rule__Rule__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:1828:1: ( rule__Rule__Group__5__Impl )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:1829:2: rule__Rule__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__Rule__Group__5__Impl_in_rule__Rule__Group__53643);
            rule__Rule__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__5"


    // $ANTLR start "rule__Rule__Group__5__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:1835:1: rule__Rule__Group__5__Impl : ( ( rule__Rule__Group_5__0 )? ) ;
    public final void rule__Rule__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:1839:1: ( ( ( rule__Rule__Group_5__0 )? ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:1840:1: ( ( rule__Rule__Group_5__0 )? )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:1840:1: ( ( rule__Rule__Group_5__0 )? )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:1841:1: ( rule__Rule__Group_5__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRuleAccess().getGroup_5()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:1842:1: ( rule__Rule__Group_5__0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==23) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:1842:2: rule__Rule__Group_5__0
                    {
                    pushFollow(FOLLOW_rule__Rule__Group_5__0_in_rule__Rule__Group__5__Impl3670);
                    rule__Rule__Group_5__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRuleAccess().getGroup_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__5__Impl"


    // $ANTLR start "rule__Rule__Group_3__0"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:1864:1: rule__Rule__Group_3__0 : rule__Rule__Group_3__0__Impl rule__Rule__Group_3__1 ;
    public final void rule__Rule__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:1868:1: ( rule__Rule__Group_3__0__Impl rule__Rule__Group_3__1 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:1869:2: rule__Rule__Group_3__0__Impl rule__Rule__Group_3__1
            {
            pushFollow(FOLLOW_rule__Rule__Group_3__0__Impl_in_rule__Rule__Group_3__03713);
            rule__Rule__Group_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Rule__Group_3__1_in_rule__Rule__Group_3__03716);
            rule__Rule__Group_3__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group_3__0"


    // $ANTLR start "rule__Rule__Group_3__0__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:1876:1: rule__Rule__Group_3__0__Impl : ( 'description:' ) ;
    public final void rule__Rule__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:1880:1: ( ( 'description:' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:1881:1: ( 'description:' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:1881:1: ( 'description:' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:1882:1: 'description:'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRuleAccess().getDescriptionKeyword_3_0()); 
            }
            match(input,20,FOLLOW_20_in_rule__Rule__Group_3__0__Impl3744); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRuleAccess().getDescriptionKeyword_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group_3__0__Impl"


    // $ANTLR start "rule__Rule__Group_3__1"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:1895:1: rule__Rule__Group_3__1 : rule__Rule__Group_3__1__Impl rule__Rule__Group_3__2 ;
    public final void rule__Rule__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:1899:1: ( rule__Rule__Group_3__1__Impl rule__Rule__Group_3__2 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:1900:2: rule__Rule__Group_3__1__Impl rule__Rule__Group_3__2
            {
            pushFollow(FOLLOW_rule__Rule__Group_3__1__Impl_in_rule__Rule__Group_3__13775);
            rule__Rule__Group_3__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Rule__Group_3__2_in_rule__Rule__Group_3__13778);
            rule__Rule__Group_3__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group_3__1"


    // $ANTLR start "rule__Rule__Group_3__1__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:1907:1: rule__Rule__Group_3__1__Impl : ( ( rule__Rule__DescriptionAssignment_3_1 ) ) ;
    public final void rule__Rule__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:1911:1: ( ( ( rule__Rule__DescriptionAssignment_3_1 ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:1912:1: ( ( rule__Rule__DescriptionAssignment_3_1 ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:1912:1: ( ( rule__Rule__DescriptionAssignment_3_1 ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:1913:1: ( rule__Rule__DescriptionAssignment_3_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRuleAccess().getDescriptionAssignment_3_1()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:1914:1: ( rule__Rule__DescriptionAssignment_3_1 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:1914:2: rule__Rule__DescriptionAssignment_3_1
            {
            pushFollow(FOLLOW_rule__Rule__DescriptionAssignment_3_1_in_rule__Rule__Group_3__1__Impl3805);
            rule__Rule__DescriptionAssignment_3_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRuleAccess().getDescriptionAssignment_3_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group_3__1__Impl"


    // $ANTLR start "rule__Rule__Group_3__2"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:1924:1: rule__Rule__Group_3__2 : rule__Rule__Group_3__2__Impl ;
    public final void rule__Rule__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:1928:1: ( rule__Rule__Group_3__2__Impl )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:1929:2: rule__Rule__Group_3__2__Impl
            {
            pushFollow(FOLLOW_rule__Rule__Group_3__2__Impl_in_rule__Rule__Group_3__23835);
            rule__Rule__Group_3__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group_3__2"


    // $ANTLR start "rule__Rule__Group_3__2__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:1935:1: rule__Rule__Group_3__2__Impl : ( ',' ) ;
    public final void rule__Rule__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:1939:1: ( ( ',' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:1940:1: ( ',' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:1940:1: ( ',' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:1941:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRuleAccess().getCommaKeyword_3_2()); 
            }
            match(input,23,FOLLOW_23_in_rule__Rule__Group_3__2__Impl3863); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRuleAccess().getCommaKeyword_3_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group_3__2__Impl"


    // $ANTLR start "rule__Rule__Group_4__0"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:1960:1: rule__Rule__Group_4__0 : rule__Rule__Group_4__0__Impl rule__Rule__Group_4__1 ;
    public final void rule__Rule__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:1964:1: ( rule__Rule__Group_4__0__Impl rule__Rule__Group_4__1 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:1965:2: rule__Rule__Group_4__0__Impl rule__Rule__Group_4__1
            {
            pushFollow(FOLLOW_rule__Rule__Group_4__0__Impl_in_rule__Rule__Group_4__03900);
            rule__Rule__Group_4__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Rule__Group_4__1_in_rule__Rule__Group_4__03903);
            rule__Rule__Group_4__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group_4__0"


    // $ANTLR start "rule__Rule__Group_4__0__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:1972:1: rule__Rule__Group_4__0__Impl : ( 'type' ) ;
    public final void rule__Rule__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:1976:1: ( ( 'type' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:1977:1: ( 'type' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:1977:1: ( 'type' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:1978:1: 'type'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRuleAccess().getTypeKeyword_4_0()); 
            }
            match(input,26,FOLLOW_26_in_rule__Rule__Group_4__0__Impl3931); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRuleAccess().getTypeKeyword_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group_4__0__Impl"


    // $ANTLR start "rule__Rule__Group_4__1"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:1991:1: rule__Rule__Group_4__1 : rule__Rule__Group_4__1__Impl ;
    public final void rule__Rule__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:1995:1: ( rule__Rule__Group_4__1__Impl )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:1996:2: rule__Rule__Group_4__1__Impl
            {
            pushFollow(FOLLOW_rule__Rule__Group_4__1__Impl_in_rule__Rule__Group_4__13962);
            rule__Rule__Group_4__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group_4__1"


    // $ANTLR start "rule__Rule__Group_4__1__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:2002:1: rule__Rule__Group_4__1__Impl : ( ( rule__Rule__TypeAssignment_4_1 ) ) ;
    public final void rule__Rule__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:2006:1: ( ( ( rule__Rule__TypeAssignment_4_1 ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:2007:1: ( ( rule__Rule__TypeAssignment_4_1 ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:2007:1: ( ( rule__Rule__TypeAssignment_4_1 ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:2008:1: ( rule__Rule__TypeAssignment_4_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRuleAccess().getTypeAssignment_4_1()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:2009:1: ( rule__Rule__TypeAssignment_4_1 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:2009:2: rule__Rule__TypeAssignment_4_1
            {
            pushFollow(FOLLOW_rule__Rule__TypeAssignment_4_1_in_rule__Rule__Group_4__1__Impl3989);
            rule__Rule__TypeAssignment_4_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRuleAccess().getTypeAssignment_4_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group_4__1__Impl"


    // $ANTLR start "rule__Rule__Group_5__0"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:2023:1: rule__Rule__Group_5__0 : rule__Rule__Group_5__0__Impl rule__Rule__Group_5__1 ;
    public final void rule__Rule__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:2027:1: ( rule__Rule__Group_5__0__Impl rule__Rule__Group_5__1 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:2028:2: rule__Rule__Group_5__0__Impl rule__Rule__Group_5__1
            {
            pushFollow(FOLLOW_rule__Rule__Group_5__0__Impl_in_rule__Rule__Group_5__04023);
            rule__Rule__Group_5__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Rule__Group_5__1_in_rule__Rule__Group_5__04026);
            rule__Rule__Group_5__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group_5__0"


    // $ANTLR start "rule__Rule__Group_5__0__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:2035:1: rule__Rule__Group_5__0__Impl : ( ',' ) ;
    public final void rule__Rule__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:2039:1: ( ( ',' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:2040:1: ( ',' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:2040:1: ( ',' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:2041:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRuleAccess().getCommaKeyword_5_0()); 
            }
            match(input,23,FOLLOW_23_in_rule__Rule__Group_5__0__Impl4054); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRuleAccess().getCommaKeyword_5_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group_5__0__Impl"


    // $ANTLR start "rule__Rule__Group_5__1"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:2054:1: rule__Rule__Group_5__1 : rule__Rule__Group_5__1__Impl rule__Rule__Group_5__2 ;
    public final void rule__Rule__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:2058:1: ( rule__Rule__Group_5__1__Impl rule__Rule__Group_5__2 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:2059:2: rule__Rule__Group_5__1__Impl rule__Rule__Group_5__2
            {
            pushFollow(FOLLOW_rule__Rule__Group_5__1__Impl_in_rule__Rule__Group_5__14085);
            rule__Rule__Group_5__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Rule__Group_5__2_in_rule__Rule__Group_5__14088);
            rule__Rule__Group_5__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group_5__1"


    // $ANTLR start "rule__Rule__Group_5__1__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:2066:1: rule__Rule__Group_5__1__Impl : ( 'class' ) ;
    public final void rule__Rule__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:2070:1: ( ( 'class' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:2071:1: ( 'class' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:2071:1: ( 'class' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:2072:1: 'class'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRuleAccess().getClassKeyword_5_1()); 
            }
            match(input,27,FOLLOW_27_in_rule__Rule__Group_5__1__Impl4116); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRuleAccess().getClassKeyword_5_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group_5__1__Impl"


    // $ANTLR start "rule__Rule__Group_5__2"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:2085:1: rule__Rule__Group_5__2 : rule__Rule__Group_5__2__Impl ;
    public final void rule__Rule__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:2089:1: ( rule__Rule__Group_5__2__Impl )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:2090:2: rule__Rule__Group_5__2__Impl
            {
            pushFollow(FOLLOW_rule__Rule__Group_5__2__Impl_in_rule__Rule__Group_5__24147);
            rule__Rule__Group_5__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group_5__2"


    // $ANTLR start "rule__Rule__Group_5__2__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:2096:1: rule__Rule__Group_5__2__Impl : ( ( rule__Rule__ClassAssignment_5_2 ) ) ;
    public final void rule__Rule__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:2100:1: ( ( ( rule__Rule__ClassAssignment_5_2 ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:2101:1: ( ( rule__Rule__ClassAssignment_5_2 ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:2101:1: ( ( rule__Rule__ClassAssignment_5_2 ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:2102:1: ( rule__Rule__ClassAssignment_5_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRuleAccess().getClassAssignment_5_2()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:2103:1: ( rule__Rule__ClassAssignment_5_2 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:2103:2: rule__Rule__ClassAssignment_5_2
            {
            pushFollow(FOLLOW_rule__Rule__ClassAssignment_5_2_in_rule__Rule__Group_5__2__Impl4174);
            rule__Rule__ClassAssignment_5_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRuleAccess().getClassAssignment_5_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group_5__2__Impl"


    // $ANTLR start "rule__PropertySet__Group__0"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:2119:1: rule__PropertySet__Group__0 : rule__PropertySet__Group__0__Impl rule__PropertySet__Group__1 ;
    public final void rule__PropertySet__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:2123:1: ( rule__PropertySet__Group__0__Impl rule__PropertySet__Group__1 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:2124:2: rule__PropertySet__Group__0__Impl rule__PropertySet__Group__1
            {
            pushFollow(FOLLOW_rule__PropertySet__Group__0__Impl_in_rule__PropertySet__Group__04210);
            rule__PropertySet__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__PropertySet__Group__1_in_rule__PropertySet__Group__04213);
            rule__PropertySet__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertySet__Group__0"


    // $ANTLR start "rule__PropertySet__Group__0__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:2131:1: rule__PropertySet__Group__0__Impl : ( () ) ;
    public final void rule__PropertySet__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:2135:1: ( ( () ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:2136:1: ( () )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:2136:1: ( () )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:2137:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertySetAccess().getPropertySetAction_0()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:2138:1: ()
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:2140:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPropertySetAccess().getPropertySetAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertySet__Group__0__Impl"


    // $ANTLR start "rule__PropertySet__Group__1"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:2150:1: rule__PropertySet__Group__1 : rule__PropertySet__Group__1__Impl rule__PropertySet__Group__2 ;
    public final void rule__PropertySet__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:2154:1: ( rule__PropertySet__Group__1__Impl rule__PropertySet__Group__2 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:2155:2: rule__PropertySet__Group__1__Impl rule__PropertySet__Group__2
            {
            pushFollow(FOLLOW_rule__PropertySet__Group__1__Impl_in_rule__PropertySet__Group__14271);
            rule__PropertySet__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__PropertySet__Group__2_in_rule__PropertySet__Group__14274);
            rule__PropertySet__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertySet__Group__1"


    // $ANTLR start "rule__PropertySet__Group__1__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:2162:1: rule__PropertySet__Group__1__Impl : ( 'Properties' ) ;
    public final void rule__PropertySet__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:2166:1: ( ( 'Properties' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:2167:1: ( 'Properties' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:2167:1: ( 'Properties' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:2168:1: 'Properties'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertySetAccess().getPropertiesKeyword_1()); 
            }
            match(input,28,FOLLOW_28_in_rule__PropertySet__Group__1__Impl4302); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPropertySetAccess().getPropertiesKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertySet__Group__1__Impl"


    // $ANTLR start "rule__PropertySet__Group__2"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:2181:1: rule__PropertySet__Group__2 : rule__PropertySet__Group__2__Impl rule__PropertySet__Group__3 ;
    public final void rule__PropertySet__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:2185:1: ( rule__PropertySet__Group__2__Impl rule__PropertySet__Group__3 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:2186:2: rule__PropertySet__Group__2__Impl rule__PropertySet__Group__3
            {
            pushFollow(FOLLOW_rule__PropertySet__Group__2__Impl_in_rule__PropertySet__Group__24333);
            rule__PropertySet__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__PropertySet__Group__3_in_rule__PropertySet__Group__24336);
            rule__PropertySet__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertySet__Group__2"


    // $ANTLR start "rule__PropertySet__Group__2__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:2193:1: rule__PropertySet__Group__2__Impl : ( ( rule__PropertySet__NameAssignment_2 ) ) ;
    public final void rule__PropertySet__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:2197:1: ( ( ( rule__PropertySet__NameAssignment_2 ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:2198:1: ( ( rule__PropertySet__NameAssignment_2 ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:2198:1: ( ( rule__PropertySet__NameAssignment_2 ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:2199:1: ( rule__PropertySet__NameAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertySetAccess().getNameAssignment_2()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:2200:1: ( rule__PropertySet__NameAssignment_2 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:2200:2: rule__PropertySet__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__PropertySet__NameAssignment_2_in_rule__PropertySet__Group__2__Impl4363);
            rule__PropertySet__NameAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPropertySetAccess().getNameAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertySet__Group__2__Impl"


    // $ANTLR start "rule__PropertySet__Group__3"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:2210:1: rule__PropertySet__Group__3 : rule__PropertySet__Group__3__Impl rule__PropertySet__Group__4 ;
    public final void rule__PropertySet__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:2214:1: ( rule__PropertySet__Group__3__Impl rule__PropertySet__Group__4 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:2215:2: rule__PropertySet__Group__3__Impl rule__PropertySet__Group__4
            {
            pushFollow(FOLLOW_rule__PropertySet__Group__3__Impl_in_rule__PropertySet__Group__34393);
            rule__PropertySet__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__PropertySet__Group__4_in_rule__PropertySet__Group__34396);
            rule__PropertySet__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertySet__Group__3"


    // $ANTLR start "rule__PropertySet__Group__3__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:2222:1: rule__PropertySet__Group__3__Impl : ( '{' ) ;
    public final void rule__PropertySet__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:2226:1: ( ( '{' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:2227:1: ( '{' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:2227:1: ( '{' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:2228:1: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertySetAccess().getLeftCurlyBracketKeyword_3()); 
            }
            match(input,18,FOLLOW_18_in_rule__PropertySet__Group__3__Impl4424); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPropertySetAccess().getLeftCurlyBracketKeyword_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertySet__Group__3__Impl"


    // $ANTLR start "rule__PropertySet__Group__4"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:2241:1: rule__PropertySet__Group__4 : rule__PropertySet__Group__4__Impl rule__PropertySet__Group__5 ;
    public final void rule__PropertySet__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:2245:1: ( rule__PropertySet__Group__4__Impl rule__PropertySet__Group__5 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:2246:2: rule__PropertySet__Group__4__Impl rule__PropertySet__Group__5
            {
            pushFollow(FOLLOW_rule__PropertySet__Group__4__Impl_in_rule__PropertySet__Group__44455);
            rule__PropertySet__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__PropertySet__Group__5_in_rule__PropertySet__Group__44458);
            rule__PropertySet__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertySet__Group__4"


    // $ANTLR start "rule__PropertySet__Group__4__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:2253:1: rule__PropertySet__Group__4__Impl : ( ( rule__PropertySet__VpPropertiesAssignment_4 )* ) ;
    public final void rule__PropertySet__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:2257:1: ( ( ( rule__PropertySet__VpPropertiesAssignment_4 )* ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:2258:1: ( ( rule__PropertySet__VpPropertiesAssignment_4 )* )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:2258:1: ( ( rule__PropertySet__VpPropertiesAssignment_4 )* )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:2259:1: ( rule__PropertySet__VpPropertiesAssignment_4 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertySetAccess().getVpPropertiesAssignment_4()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:2260:1: ( rule__PropertySet__VpPropertiesAssignment_4 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==29) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:2260:2: rule__PropertySet__VpPropertiesAssignment_4
            	    {
            	    pushFollow(FOLLOW_rule__PropertySet__VpPropertiesAssignment_4_in_rule__PropertySet__Group__4__Impl4485);
            	    rule__PropertySet__VpPropertiesAssignment_4();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPropertySetAccess().getVpPropertiesAssignment_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertySet__Group__4__Impl"


    // $ANTLR start "rule__PropertySet__Group__5"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:2270:1: rule__PropertySet__Group__5 : rule__PropertySet__Group__5__Impl ;
    public final void rule__PropertySet__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:2274:1: ( rule__PropertySet__Group__5__Impl )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:2275:2: rule__PropertySet__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__PropertySet__Group__5__Impl_in_rule__PropertySet__Group__54516);
            rule__PropertySet__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertySet__Group__5"


    // $ANTLR start "rule__PropertySet__Group__5__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:2281:1: rule__PropertySet__Group__5__Impl : ( '}' ) ;
    public final void rule__PropertySet__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:2285:1: ( ( '}' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:2286:1: ( '}' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:2286:1: ( '}' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:2287:1: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertySetAccess().getRightCurlyBracketKeyword_5()); 
            }
            match(input,19,FOLLOW_19_in_rule__PropertySet__Group__5__Impl4544); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPropertySetAccess().getRightCurlyBracketKeyword_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertySet__Group__5__Impl"


    // $ANTLR start "rule__Property__Group__0"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:2312:1: rule__Property__Group__0 : rule__Property__Group__0__Impl rule__Property__Group__1 ;
    public final void rule__Property__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:2316:1: ( rule__Property__Group__0__Impl rule__Property__Group__1 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:2317:2: rule__Property__Group__0__Impl rule__Property__Group__1
            {
            pushFollow(FOLLOW_rule__Property__Group__0__Impl_in_rule__Property__Group__04587);
            rule__Property__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Property__Group__1_in_rule__Property__Group__04590);
            rule__Property__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__Group__0"


    // $ANTLR start "rule__Property__Group__0__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:2324:1: rule__Property__Group__0__Impl : ( () ) ;
    public final void rule__Property__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:2328:1: ( ( () ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:2329:1: ( () )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:2329:1: ( () )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:2330:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyAccess().getPropertyAction_0()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:2331:1: ()
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:2333:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPropertyAccess().getPropertyAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__Group__0__Impl"


    // $ANTLR start "rule__Property__Group__1"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:2343:1: rule__Property__Group__1 : rule__Property__Group__1__Impl rule__Property__Group__2 ;
    public final void rule__Property__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:2347:1: ( rule__Property__Group__1__Impl rule__Property__Group__2 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:2348:2: rule__Property__Group__1__Impl rule__Property__Group__2
            {
            pushFollow(FOLLOW_rule__Property__Group__1__Impl_in_rule__Property__Group__14648);
            rule__Property__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Property__Group__2_in_rule__Property__Group__14651);
            rule__Property__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__Group__1"


    // $ANTLR start "rule__Property__Group__1__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:2355:1: rule__Property__Group__1__Impl : ( 'Property' ) ;
    public final void rule__Property__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:2359:1: ( ( 'Property' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:2360:1: ( 'Property' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:2360:1: ( 'Property' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:2361:1: 'Property'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyAccess().getPropertyKeyword_1()); 
            }
            match(input,29,FOLLOW_29_in_rule__Property__Group__1__Impl4679); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPropertyAccess().getPropertyKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__Group__1__Impl"


    // $ANTLR start "rule__Property__Group__2"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:2374:1: rule__Property__Group__2 : rule__Property__Group__2__Impl rule__Property__Group__3 ;
    public final void rule__Property__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:2378:1: ( rule__Property__Group__2__Impl rule__Property__Group__3 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:2379:2: rule__Property__Group__2__Impl rule__Property__Group__3
            {
            pushFollow(FOLLOW_rule__Property__Group__2__Impl_in_rule__Property__Group__24710);
            rule__Property__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Property__Group__3_in_rule__Property__Group__24713);
            rule__Property__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__Group__2"


    // $ANTLR start "rule__Property__Group__2__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:2386:1: rule__Property__Group__2__Impl : ( ( rule__Property__NameAssignment_2 ) ) ;
    public final void rule__Property__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:2390:1: ( ( ( rule__Property__NameAssignment_2 ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:2391:1: ( ( rule__Property__NameAssignment_2 ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:2391:1: ( ( rule__Property__NameAssignment_2 ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:2392:1: ( rule__Property__NameAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyAccess().getNameAssignment_2()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:2393:1: ( rule__Property__NameAssignment_2 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:2393:2: rule__Property__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__Property__NameAssignment_2_in_rule__Property__Group__2__Impl4740);
            rule__Property__NameAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPropertyAccess().getNameAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__Group__2__Impl"


    // $ANTLR start "rule__Property__Group__3"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:2403:1: rule__Property__Group__3 : rule__Property__Group__3__Impl rule__Property__Group__4 ;
    public final void rule__Property__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:2407:1: ( rule__Property__Group__3__Impl rule__Property__Group__4 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:2408:2: rule__Property__Group__3__Impl rule__Property__Group__4
            {
            pushFollow(FOLLOW_rule__Property__Group__3__Impl_in_rule__Property__Group__34770);
            rule__Property__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Property__Group__4_in_rule__Property__Group__34773);
            rule__Property__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__Group__3"


    // $ANTLR start "rule__Property__Group__3__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:2415:1: rule__Property__Group__3__Impl : ( ( rule__Property__Group_3__0 )? ) ;
    public final void rule__Property__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:2419:1: ( ( ( rule__Property__Group_3__0 )? ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:2420:1: ( ( rule__Property__Group_3__0 )? )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:2420:1: ( ( rule__Property__Group_3__0 )? )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:2421:1: ( rule__Property__Group_3__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyAccess().getGroup_3()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:2422:1: ( rule__Property__Group_3__0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==26) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:2422:2: rule__Property__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__Property__Group_3__0_in_rule__Property__Group__3__Impl4800);
                    rule__Property__Group_3__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPropertyAccess().getGroup_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__Group__3__Impl"


    // $ANTLR start "rule__Property__Group__4"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:2432:1: rule__Property__Group__4 : rule__Property__Group__4__Impl ;
    public final void rule__Property__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:2436:1: ( rule__Property__Group__4__Impl )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:2437:2: rule__Property__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Property__Group__4__Impl_in_rule__Property__Group__44831);
            rule__Property__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__Group__4"


    // $ANTLR start "rule__Property__Group__4__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:2443:1: rule__Property__Group__4__Impl : ( ( rule__Property__Group_4__0 )? ) ;
    public final void rule__Property__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:2447:1: ( ( ( rule__Property__Group_4__0 )? ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:2448:1: ( ( rule__Property__Group_4__0 )? )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:2448:1: ( ( rule__Property__Group_4__0 )? )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:2449:1: ( rule__Property__Group_4__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyAccess().getGroup_4()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:2450:1: ( rule__Property__Group_4__0 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==30) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:2450:2: rule__Property__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__Property__Group_4__0_in_rule__Property__Group__4__Impl4858);
                    rule__Property__Group_4__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPropertyAccess().getGroup_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__Group__4__Impl"


    // $ANTLR start "rule__Property__Group_3__0"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:2470:1: rule__Property__Group_3__0 : rule__Property__Group_3__0__Impl rule__Property__Group_3__1 ;
    public final void rule__Property__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:2474:1: ( rule__Property__Group_3__0__Impl rule__Property__Group_3__1 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:2475:2: rule__Property__Group_3__0__Impl rule__Property__Group_3__1
            {
            pushFollow(FOLLOW_rule__Property__Group_3__0__Impl_in_rule__Property__Group_3__04899);
            rule__Property__Group_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Property__Group_3__1_in_rule__Property__Group_3__04902);
            rule__Property__Group_3__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__Group_3__0"


    // $ANTLR start "rule__Property__Group_3__0__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:2482:1: rule__Property__Group_3__0__Impl : ( 'type' ) ;
    public final void rule__Property__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:2486:1: ( ( 'type' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:2487:1: ( 'type' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:2487:1: ( 'type' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:2488:1: 'type'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyAccess().getTypeKeyword_3_0()); 
            }
            match(input,26,FOLLOW_26_in_rule__Property__Group_3__0__Impl4930); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPropertyAccess().getTypeKeyword_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__Group_3__0__Impl"


    // $ANTLR start "rule__Property__Group_3__1"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:2501:1: rule__Property__Group_3__1 : rule__Property__Group_3__1__Impl ;
    public final void rule__Property__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:2505:1: ( rule__Property__Group_3__1__Impl )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:2506:2: rule__Property__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__Property__Group_3__1__Impl_in_rule__Property__Group_3__14961);
            rule__Property__Group_3__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__Group_3__1"


    // $ANTLR start "rule__Property__Group_3__1__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:2512:1: rule__Property__Group_3__1__Impl : ( ( rule__Property__TypeAssignment_3_1 ) ) ;
    public final void rule__Property__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:2516:1: ( ( ( rule__Property__TypeAssignment_3_1 ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:2517:1: ( ( rule__Property__TypeAssignment_3_1 ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:2517:1: ( ( rule__Property__TypeAssignment_3_1 ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:2518:1: ( rule__Property__TypeAssignment_3_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyAccess().getTypeAssignment_3_1()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:2519:1: ( rule__Property__TypeAssignment_3_1 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:2519:2: rule__Property__TypeAssignment_3_1
            {
            pushFollow(FOLLOW_rule__Property__TypeAssignment_3_1_in_rule__Property__Group_3__1__Impl4988);
            rule__Property__TypeAssignment_3_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPropertyAccess().getTypeAssignment_3_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__Group_3__1__Impl"


    // $ANTLR start "rule__Property__Group_4__0"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:2533:1: rule__Property__Group_4__0 : rule__Property__Group_4__0__Impl rule__Property__Group_4__1 ;
    public final void rule__Property__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:2537:1: ( rule__Property__Group_4__0__Impl rule__Property__Group_4__1 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:2538:2: rule__Property__Group_4__0__Impl rule__Property__Group_4__1
            {
            pushFollow(FOLLOW_rule__Property__Group_4__0__Impl_in_rule__Property__Group_4__05022);
            rule__Property__Group_4__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Property__Group_4__1_in_rule__Property__Group_4__05025);
            rule__Property__Group_4__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__Group_4__0"


    // $ANTLR start "rule__Property__Group_4__0__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:2545:1: rule__Property__Group_4__0__Impl : ( 'value' ) ;
    public final void rule__Property__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:2549:1: ( ( 'value' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:2550:1: ( 'value' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:2550:1: ( 'value' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:2551:1: 'value'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyAccess().getValueKeyword_4_0()); 
            }
            match(input,30,FOLLOW_30_in_rule__Property__Group_4__0__Impl5053); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPropertyAccess().getValueKeyword_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__Group_4__0__Impl"


    // $ANTLR start "rule__Property__Group_4__1"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:2564:1: rule__Property__Group_4__1 : rule__Property__Group_4__1__Impl ;
    public final void rule__Property__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:2568:1: ( rule__Property__Group_4__1__Impl )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:2569:2: rule__Property__Group_4__1__Impl
            {
            pushFollow(FOLLOW_rule__Property__Group_4__1__Impl_in_rule__Property__Group_4__15084);
            rule__Property__Group_4__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__Group_4__1"


    // $ANTLR start "rule__Property__Group_4__1__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:2575:1: rule__Property__Group_4__1__Impl : ( ( rule__Property__ValueAssignment_4_1 ) ) ;
    public final void rule__Property__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:2579:1: ( ( ( rule__Property__ValueAssignment_4_1 ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:2580:1: ( ( rule__Property__ValueAssignment_4_1 ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:2580:1: ( ( rule__Property__ValueAssignment_4_1 ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:2581:1: ( rule__Property__ValueAssignment_4_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyAccess().getValueAssignment_4_1()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:2582:1: ( rule__Property__ValueAssignment_4_1 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:2582:2: rule__Property__ValueAssignment_4_1
            {
            pushFollow(FOLLOW_rule__Property__ValueAssignment_4_1_in_rule__Property__Group_4__1__Impl5111);
            rule__Property__ValueAssignment_4_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPropertyAccess().getValueAssignment_4_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__Group_4__1__Impl"


    // $ANTLR start "rule__FQN__Group__0"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:2596:1: rule__FQN__Group__0 : rule__FQN__Group__0__Impl rule__FQN__Group__1 ;
    public final void rule__FQN__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:2600:1: ( rule__FQN__Group__0__Impl rule__FQN__Group__1 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:2601:2: rule__FQN__Group__0__Impl rule__FQN__Group__1
            {
            pushFollow(FOLLOW_rule__FQN__Group__0__Impl_in_rule__FQN__Group__05145);
            rule__FQN__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__FQN__Group__1_in_rule__FQN__Group__05148);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:2608:1: rule__FQN__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__FQN__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:2612:1: ( ( RULE_ID ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:2613:1: ( RULE_ID )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:2613:1: ( RULE_ID )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:2614:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFQNAccess().getIDTerminalRuleCall_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__FQN__Group__0__Impl5175); if (state.failed) return ;
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:2625:1: rule__FQN__Group__1 : rule__FQN__Group__1__Impl ;
    public final void rule__FQN__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:2629:1: ( rule__FQN__Group__1__Impl )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:2630:2: rule__FQN__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__FQN__Group__1__Impl_in_rule__FQN__Group__15204);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:2636:1: rule__FQN__Group__1__Impl : ( ( rule__FQN__Group_1__0 )* ) ;
    public final void rule__FQN__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:2640:1: ( ( ( rule__FQN__Group_1__0 )* ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:2641:1: ( ( rule__FQN__Group_1__0 )* )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:2641:1: ( ( rule__FQN__Group_1__0 )* )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:2642:1: ( rule__FQN__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFQNAccess().getGroup_1()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:2643:1: ( rule__FQN__Group_1__0 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==31) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:2643:2: rule__FQN__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__FQN__Group_1__0_in_rule__FQN__Group__1__Impl5231);
            	    rule__FQN__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop20;
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:2657:1: rule__FQN__Group_1__0 : rule__FQN__Group_1__0__Impl rule__FQN__Group_1__1 ;
    public final void rule__FQN__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:2661:1: ( rule__FQN__Group_1__0__Impl rule__FQN__Group_1__1 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:2662:2: rule__FQN__Group_1__0__Impl rule__FQN__Group_1__1
            {
            pushFollow(FOLLOW_rule__FQN__Group_1__0__Impl_in_rule__FQN__Group_1__05266);
            rule__FQN__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__FQN__Group_1__1_in_rule__FQN__Group_1__05269);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:2669:1: rule__FQN__Group_1__0__Impl : ( '.' ) ;
    public final void rule__FQN__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:2673:1: ( ( '.' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:2674:1: ( '.' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:2674:1: ( '.' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:2675:1: '.'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFQNAccess().getFullStopKeyword_1_0()); 
            }
            match(input,31,FOLLOW_31_in_rule__FQN__Group_1__0__Impl5297); if (state.failed) return ;
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:2688:1: rule__FQN__Group_1__1 : rule__FQN__Group_1__1__Impl ;
    public final void rule__FQN__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:2692:1: ( rule__FQN__Group_1__1__Impl )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:2693:2: rule__FQN__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__FQN__Group_1__1__Impl_in_rule__FQN__Group_1__15328);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:2699:1: rule__FQN__Group_1__1__Impl : ( ( RULE_ID ) ) ;
    public final void rule__FQN__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:2703:1: ( ( ( RULE_ID ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:2704:1: ( ( RULE_ID ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:2704:1: ( ( RULE_ID ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:2705:1: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFQNAccess().getIDTerminalRuleCall_1_1()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:2706:1: ( RULE_ID )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:2706:3: RULE_ID
            {
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__FQN__Group_1__1__Impl5356); if (state.failed) return ;

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


    // $ANTLR start "rule__Services__ServicesAssignment_1"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:2721:1: rule__Services__ServicesAssignment_1 : ( ruleAspect ) ;
    public final void rule__Services__ServicesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:2725:1: ( ( ruleAspect ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:2726:1: ( ruleAspect )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:2726:1: ( ruleAspect )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:2727:1: ruleAspect
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getServicesAccess().getServicesAspectParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleAspect_in_rule__Services__ServicesAssignment_15395);
            ruleAspect();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getServicesAccess().getServicesAspectParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Services__ServicesAssignment_1"


    // $ANTLR start "rule__ServiceSet__NameAssignment_2"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:2736:1: rule__ServiceSet__NameAssignment_2 : ( ruleFQN ) ;
    public final void rule__ServiceSet__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:2740:1: ( ( ruleFQN ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:2741:1: ( ruleFQN )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:2741:1: ( ruleFQN )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:2742:1: ruleFQN
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getServiceSetAccess().getNameFQNParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleFQN_in_rule__ServiceSet__NameAssignment_25426);
            ruleFQN();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getServiceSetAccess().getNameFQNParserRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServiceSet__NameAssignment_2"


    // $ANTLR start "rule__ServiceSet__DescriptionAssignment_4_1"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:2751:1: rule__ServiceSet__DescriptionAssignment_4_1 : ( ruleEString ) ;
    public final void rule__ServiceSet__DescriptionAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:2755:1: ( ( ruleEString ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:2756:1: ( ruleEString )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:2756:1: ( ruleEString )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:2757:1: ruleEString
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getServiceSetAccess().getDescriptionEStringParserRuleCall_4_1_0()); 
            }
            pushFollow(FOLLOW_ruleEString_in_rule__ServiceSet__DescriptionAssignment_4_15457);
            ruleEString();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getServiceSetAccess().getDescriptionEStringParserRuleCall_4_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServiceSet__DescriptionAssignment_4_1"


    // $ANTLR start "rule__ServiceSet__VpServicesAssignment_5_0"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:2766:1: rule__ServiceSet__VpServicesAssignment_5_0 : ( ruleService ) ;
    public final void rule__ServiceSet__VpServicesAssignment_5_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:2770:1: ( ( ruleService ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:2771:1: ( ruleService )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:2771:1: ( ruleService )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:2772:1: ruleService
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getServiceSetAccess().getVpServicesServiceParserRuleCall_5_0_0()); 
            }
            pushFollow(FOLLOW_ruleService_in_rule__ServiceSet__VpServicesAssignment_5_05488);
            ruleService();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getServiceSetAccess().getVpServicesServiceParserRuleCall_5_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServiceSet__VpServicesAssignment_5_0"


    // $ANTLR start "rule__ServiceSet__VpServicesAssignment_5_1"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:2781:1: rule__ServiceSet__VpServicesAssignment_5_1 : ( ruleService ) ;
    public final void rule__ServiceSet__VpServicesAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:2785:1: ( ( ruleService ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:2786:1: ( ruleService )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:2786:1: ( ruleService )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:2787:1: ruleService
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getServiceSetAccess().getVpServicesServiceParserRuleCall_5_1_0()); 
            }
            pushFollow(FOLLOW_ruleService_in_rule__ServiceSet__VpServicesAssignment_5_15519);
            ruleService();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getServiceSetAccess().getVpServicesServiceParserRuleCall_5_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServiceSet__VpServicesAssignment_5_1"


    // $ANTLR start "rule__RuleSet__NameAssignment_2"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:2796:1: rule__RuleSet__NameAssignment_2 : ( ruleFQN ) ;
    public final void rule__RuleSet__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:2800:1: ( ( ruleFQN ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:2801:1: ( ruleFQN )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:2801:1: ( ruleFQN )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:2802:1: ruleFQN
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRuleSetAccess().getNameFQNParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleFQN_in_rule__RuleSet__NameAssignment_25550);
            ruleFQN();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRuleSetAccess().getNameFQNParserRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RuleSet__NameAssignment_2"


    // $ANTLR start "rule__RuleSet__DescriptionAssignment_4_1"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:2811:1: rule__RuleSet__DescriptionAssignment_4_1 : ( ruleEString ) ;
    public final void rule__RuleSet__DescriptionAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:2815:1: ( ( ruleEString ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:2816:1: ( ruleEString )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:2816:1: ( ruleEString )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:2817:1: ruleEString
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRuleSetAccess().getDescriptionEStringParserRuleCall_4_1_0()); 
            }
            pushFollow(FOLLOW_ruleEString_in_rule__RuleSet__DescriptionAssignment_4_15581);
            ruleEString();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRuleSetAccess().getDescriptionEStringParserRuleCall_4_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RuleSet__DescriptionAssignment_4_1"


    // $ANTLR start "rule__RuleSet__VpRulesAssignment_5_0"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:2826:1: rule__RuleSet__VpRulesAssignment_5_0 : ( ruleRule ) ;
    public final void rule__RuleSet__VpRulesAssignment_5_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:2830:1: ( ( ruleRule ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:2831:1: ( ruleRule )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:2831:1: ( ruleRule )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:2832:1: ruleRule
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRuleSetAccess().getVpRulesRuleParserRuleCall_5_0_0()); 
            }
            pushFollow(FOLLOW_ruleRule_in_rule__RuleSet__VpRulesAssignment_5_05612);
            ruleRule();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRuleSetAccess().getVpRulesRuleParserRuleCall_5_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RuleSet__VpRulesAssignment_5_0"


    // $ANTLR start "rule__RuleSet__VpRulesAssignment_5_1"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:2841:1: rule__RuleSet__VpRulesAssignment_5_1 : ( ruleRule ) ;
    public final void rule__RuleSet__VpRulesAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:2845:1: ( ( ruleRule ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:2846:1: ( ruleRule )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:2846:1: ( ruleRule )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:2847:1: ruleRule
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRuleSetAccess().getVpRulesRuleParserRuleCall_5_1_0()); 
            }
            pushFollow(FOLLOW_ruleRule_in_rule__RuleSet__VpRulesAssignment_5_15643);
            ruleRule();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRuleSetAccess().getVpRulesRuleParserRuleCall_5_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RuleSet__VpRulesAssignment_5_1"


    // $ANTLR start "rule__Service__NameAssignment_2"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:2856:1: rule__Service__NameAssignment_2 : ( ruleFQN ) ;
    public final void rule__Service__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:2860:1: ( ( ruleFQN ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:2861:1: ( ruleFQN )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:2861:1: ( ruleFQN )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:2862:1: ruleFQN
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getServiceAccess().getNameFQNParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleFQN_in_rule__Service__NameAssignment_25674);
            ruleFQN();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getServiceAccess().getNameFQNParserRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__NameAssignment_2"


    // $ANTLR start "rule__Service__DescriptionAssignment_3_1"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:2871:1: rule__Service__DescriptionAssignment_3_1 : ( ruleEString ) ;
    public final void rule__Service__DescriptionAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:2875:1: ( ( ruleEString ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:2876:1: ( ruleEString )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:2876:1: ( ruleEString )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:2877:1: ruleEString
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getServiceAccess().getDescriptionEStringParserRuleCall_3_1_0()); 
            }
            pushFollow(FOLLOW_ruleEString_in_rule__Service__DescriptionAssignment_3_15705);
            ruleEString();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getServiceAccess().getDescriptionEStringParserRuleCall_3_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__DescriptionAssignment_3_1"


    // $ANTLR start "rule__Service__RelatedRulesAssignment_4_1"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:2886:1: rule__Service__RelatedRulesAssignment_4_1 : ( ( ruleFQN ) ) ;
    public final void rule__Service__RelatedRulesAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:2890:1: ( ( ( ruleFQN ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:2891:1: ( ( ruleFQN ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:2891:1: ( ( ruleFQN ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:2892:1: ( ruleFQN )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getServiceAccess().getRelatedRulesRuleCrossReference_4_1_0()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:2893:1: ( ruleFQN )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:2894:1: ruleFQN
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getServiceAccess().getRelatedRulesRuleFQNParserRuleCall_4_1_0_1()); 
            }
            pushFollow(FOLLOW_ruleFQN_in_rule__Service__RelatedRulesAssignment_4_15740);
            ruleFQN();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getServiceAccess().getRelatedRulesRuleFQNParserRuleCall_4_1_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getServiceAccess().getRelatedRulesRuleCrossReference_4_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__RelatedRulesAssignment_4_1"


    // $ANTLR start "rule__Service__RelatedRulesAssignment_4_2_1"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:2905:1: rule__Service__RelatedRulesAssignment_4_2_1 : ( ( ruleFQN ) ) ;
    public final void rule__Service__RelatedRulesAssignment_4_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:2909:1: ( ( ( ruleFQN ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:2910:1: ( ( ruleFQN ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:2910:1: ( ( ruleFQN ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:2911:1: ( ruleFQN )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getServiceAccess().getRelatedRulesRuleCrossReference_4_2_1_0()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:2912:1: ( ruleFQN )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:2913:1: ruleFQN
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getServiceAccess().getRelatedRulesRuleFQNParserRuleCall_4_2_1_0_1()); 
            }
            pushFollow(FOLLOW_ruleFQN_in_rule__Service__RelatedRulesAssignment_4_2_15779);
            ruleFQN();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getServiceAccess().getRelatedRulesRuleFQNParserRuleCall_4_2_1_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getServiceAccess().getRelatedRulesRuleCrossReference_4_2_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__RelatedRulesAssignment_4_2_1"


    // $ANTLR start "rule__Rule__NameAssignment_2"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:2924:1: rule__Rule__NameAssignment_2 : ( ruleFQN ) ;
    public final void rule__Rule__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:2928:1: ( ( ruleFQN ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:2929:1: ( ruleFQN )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:2929:1: ( ruleFQN )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:2930:1: ruleFQN
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRuleAccess().getNameFQNParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleFQN_in_rule__Rule__NameAssignment_25814);
            ruleFQN();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRuleAccess().getNameFQNParserRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__NameAssignment_2"


    // $ANTLR start "rule__Rule__DescriptionAssignment_3_1"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:2939:1: rule__Rule__DescriptionAssignment_3_1 : ( ruleEString ) ;
    public final void rule__Rule__DescriptionAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:2943:1: ( ( ruleEString ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:2944:1: ( ruleEString )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:2944:1: ( ruleEString )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:2945:1: ruleEString
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRuleAccess().getDescriptionEStringParserRuleCall_3_1_0()); 
            }
            pushFollow(FOLLOW_ruleEString_in_rule__Rule__DescriptionAssignment_3_15845);
            ruleEString();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRuleAccess().getDescriptionEStringParserRuleCall_3_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__DescriptionAssignment_3_1"


    // $ANTLR start "rule__Rule__TypeAssignment_4_1"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:2954:1: rule__Rule__TypeAssignment_4_1 : ( ruleRules_Types ) ;
    public final void rule__Rule__TypeAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:2958:1: ( ( ruleRules_Types ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:2959:1: ( ruleRules_Types )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:2959:1: ( ruleRules_Types )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:2960:1: ruleRules_Types
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRuleAccess().getTypeRules_TypesEnumRuleCall_4_1_0()); 
            }
            pushFollow(FOLLOW_ruleRules_Types_in_rule__Rule__TypeAssignment_4_15876);
            ruleRules_Types();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRuleAccess().getTypeRules_TypesEnumRuleCall_4_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__TypeAssignment_4_1"


    // $ANTLR start "rule__Rule__ClassAssignment_5_2"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:2969:1: rule__Rule__ClassAssignment_5_2 : ( ruleEString ) ;
    public final void rule__Rule__ClassAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:2973:1: ( ( ruleEString ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:2974:1: ( ruleEString )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:2974:1: ( ruleEString )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:2975:1: ruleEString
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRuleAccess().getClassEStringParserRuleCall_5_2_0()); 
            }
            pushFollow(FOLLOW_ruleEString_in_rule__Rule__ClassAssignment_5_25907);
            ruleEString();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRuleAccess().getClassEStringParserRuleCall_5_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__ClassAssignment_5_2"


    // $ANTLR start "rule__PropertySet__NameAssignment_2"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:2984:1: rule__PropertySet__NameAssignment_2 : ( ruleFQN ) ;
    public final void rule__PropertySet__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:2988:1: ( ( ruleFQN ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:2989:1: ( ruleFQN )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:2989:1: ( ruleFQN )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:2990:1: ruleFQN
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertySetAccess().getNameFQNParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleFQN_in_rule__PropertySet__NameAssignment_25938);
            ruleFQN();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPropertySetAccess().getNameFQNParserRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertySet__NameAssignment_2"


    // $ANTLR start "rule__PropertySet__VpPropertiesAssignment_4"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:2999:1: rule__PropertySet__VpPropertiesAssignment_4 : ( ruleProperty ) ;
    public final void rule__PropertySet__VpPropertiesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:3003:1: ( ( ruleProperty ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:3004:1: ( ruleProperty )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:3004:1: ( ruleProperty )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:3005:1: ruleProperty
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertySetAccess().getVpPropertiesPropertyParserRuleCall_4_0()); 
            }
            pushFollow(FOLLOW_ruleProperty_in_rule__PropertySet__VpPropertiesAssignment_45969);
            ruleProperty();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPropertySetAccess().getVpPropertiesPropertyParserRuleCall_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertySet__VpPropertiesAssignment_4"


    // $ANTLR start "rule__Property__NameAssignment_2"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:3014:1: rule__Property__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Property__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:3018:1: ( ( ruleEString ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:3019:1: ( ruleEString )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:3019:1: ( ruleEString )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:3020:1: ruleEString
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyAccess().getNameEStringParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleEString_in_rule__Property__NameAssignment_26000);
            ruleEString();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPropertyAccess().getNameEStringParserRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__NameAssignment_2"


    // $ANTLR start "rule__Property__TypeAssignment_3_1"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:3029:1: rule__Property__TypeAssignment_3_1 : ( rulePropertyType ) ;
    public final void rule__Property__TypeAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:3033:1: ( ( rulePropertyType ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:3034:1: ( rulePropertyType )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:3034:1: ( rulePropertyType )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:3035:1: rulePropertyType
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyAccess().getTypePropertyTypeEnumRuleCall_3_1_0()); 
            }
            pushFollow(FOLLOW_rulePropertyType_in_rule__Property__TypeAssignment_3_16031);
            rulePropertyType();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPropertyAccess().getTypePropertyTypeEnumRuleCall_3_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__TypeAssignment_3_1"


    // $ANTLR start "rule__Property__ValueAssignment_4_1"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:3044:1: rule__Property__ValueAssignment_4_1 : ( ruleEString ) ;
    public final void rule__Property__ValueAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:3048:1: ( ( ruleEString ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:3049:1: ( ruleEString )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:3049:1: ( ruleEString )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpservices.g:3050:1: ruleEString
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyAccess().getValueEStringParserRuleCall_4_1_0()); 
            }
            pushFollow(FOLLOW_ruleEString_in_rule__Property__ValueAssignment_4_16062);
            ruleEString();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPropertyAccess().getValueEStringParserRuleCall_4_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__ValueAssignment_4_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleServices_in_entryRuleServices67 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleServices74 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Services__Group__0_in_ruleServices100 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAspect_in_entryRuleAspect127 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAspect134 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Aspect__Alternatives_in_ruleAspect160 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleServiceSet_in_entryRuleServiceSet187 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleServiceSet194 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ServiceSet__Group__0_in_ruleServiceSet220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRuleSet_in_entryRuleRuleSet247 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRuleSet254 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RuleSet__Group__0_in_ruleRuleSet280 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleService_in_entryRuleService307 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleService314 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Service__Group__0_in_ruleService340 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRule_in_entryRuleRule367 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRule374 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rule__Group__0_in_ruleRule400 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePropertySet_in_entryRulePropertySet427 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePropertySet434 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertySet__Group__0_in_rulePropertySet460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProperty_in_entryRuleProperty487 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProperty494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Property__Group__0_in_ruleProperty520 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEString_in_entryRuleEString547 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEString554 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EString__Alternatives_in_ruleEString580 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFQN_in_entryRuleFQN607 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFQN614 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FQN__Group__0_in_ruleFQN640 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rules_Types__Alternatives_in_ruleRules_Types681 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyType__Alternatives_in_rulePropertyType717 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleServiceSet_in_rule__Aspect__Alternatives752 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRuleSet_in_rule__Aspect__Alternatives769 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePropertySet_in_rule__Aspect__Alternatives786 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__EString__Alternatives818 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__EString__Alternatives835 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__Rules_Types__Alternatives869 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__Rules_Types__Alternatives890 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__PropertyType__Alternatives926 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__PropertyType__Alternatives947 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__PropertyType__Alternatives968 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__PropertyType__Alternatives989 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Services__Group__0__Impl_in_rule__Services__Group__01022 = new BitSet(new long[]{0x0000000010220000L});
    public static final BitSet FOLLOW_rule__Services__Group__1_in_rule__Services__Group__01025 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Services__Group__1__Impl_in_rule__Services__Group__11083 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Services__ServicesAssignment_1_in_rule__Services__Group__1__Impl1112 = new BitSet(new long[]{0x0000000010220002L});
    public static final BitSet FOLLOW_rule__Services__ServicesAssignment_1_in_rule__Services__Group__1__Impl1124 = new BitSet(new long[]{0x0000000010220002L});
    public static final BitSet FOLLOW_rule__ServiceSet__Group__0__Impl_in_rule__ServiceSet__Group__01161 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__ServiceSet__Group__1_in_rule__ServiceSet__Group__01164 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ServiceSet__Group__1__Impl_in_rule__ServiceSet__Group__11222 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__ServiceSet__Group__2_in_rule__ServiceSet__Group__11225 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__ServiceSet__Group__1__Impl1253 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ServiceSet__Group__2__Impl_in_rule__ServiceSet__Group__21284 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__ServiceSet__Group__3_in_rule__ServiceSet__Group__21287 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ServiceSet__NameAssignment_2_in_rule__ServiceSet__Group__2__Impl1314 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ServiceSet__Group__3__Impl_in_rule__ServiceSet__Group__31344 = new BitSet(new long[]{0x0000000000580000L});
    public static final BitSet FOLLOW_rule__ServiceSet__Group__4_in_rule__ServiceSet__Group__31347 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__ServiceSet__Group__3__Impl1375 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ServiceSet__Group__4__Impl_in_rule__ServiceSet__Group__41406 = new BitSet(new long[]{0x0000000000580000L});
    public static final BitSet FOLLOW_rule__ServiceSet__Group__5_in_rule__ServiceSet__Group__41409 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ServiceSet__Group_4__0_in_rule__ServiceSet__Group__4__Impl1436 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ServiceSet__Group__5__Impl_in_rule__ServiceSet__Group__51467 = new BitSet(new long[]{0x0000000000580000L});
    public static final BitSet FOLLOW_rule__ServiceSet__Group__6_in_rule__ServiceSet__Group__51470 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ServiceSet__Group_5__0_in_rule__ServiceSet__Group__5__Impl1497 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ServiceSet__Group__6__Impl_in_rule__ServiceSet__Group__61528 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__ServiceSet__Group__6__Impl1556 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ServiceSet__Group_4__0__Impl_in_rule__ServiceSet__Group_4__01601 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_rule__ServiceSet__Group_4__1_in_rule__ServiceSet__Group_4__01604 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__ServiceSet__Group_4__0__Impl1632 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ServiceSet__Group_4__1__Impl_in_rule__ServiceSet__Group_4__11663 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ServiceSet__DescriptionAssignment_4_1_in_rule__ServiceSet__Group_4__1__Impl1690 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ServiceSet__Group_5__0__Impl_in_rule__ServiceSet__Group_5__01724 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__ServiceSet__Group_5__1_in_rule__ServiceSet__Group_5__01727 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ServiceSet__VpServicesAssignment_5_0_in_rule__ServiceSet__Group_5__0__Impl1754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ServiceSet__Group_5__1__Impl_in_rule__ServiceSet__Group_5__11784 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ServiceSet__VpServicesAssignment_5_1_in_rule__ServiceSet__Group_5__1__Impl1811 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_rule__RuleSet__Group__0__Impl_in_rule__RuleSet__Group__01846 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__RuleSet__Group__1_in_rule__RuleSet__Group__01849 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RuleSet__Group__1__Impl_in_rule__RuleSet__Group__11907 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__RuleSet__Group__2_in_rule__RuleSet__Group__11910 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__RuleSet__Group__1__Impl1938 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RuleSet__Group__2__Impl_in_rule__RuleSet__Group__21969 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__RuleSet__Group__3_in_rule__RuleSet__Group__21972 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RuleSet__NameAssignment_2_in_rule__RuleSet__Group__2__Impl1999 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RuleSet__Group__3__Impl_in_rule__RuleSet__Group__32029 = new BitSet(new long[]{0x0000000002180000L});
    public static final BitSet FOLLOW_rule__RuleSet__Group__4_in_rule__RuleSet__Group__32032 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__RuleSet__Group__3__Impl2060 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RuleSet__Group__4__Impl_in_rule__RuleSet__Group__42091 = new BitSet(new long[]{0x0000000002180000L});
    public static final BitSet FOLLOW_rule__RuleSet__Group__5_in_rule__RuleSet__Group__42094 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RuleSet__Group_4__0_in_rule__RuleSet__Group__4__Impl2121 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RuleSet__Group__5__Impl_in_rule__RuleSet__Group__52152 = new BitSet(new long[]{0x0000000002180000L});
    public static final BitSet FOLLOW_rule__RuleSet__Group__6_in_rule__RuleSet__Group__52155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RuleSet__Group_5__0_in_rule__RuleSet__Group__5__Impl2182 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RuleSet__Group__6__Impl_in_rule__RuleSet__Group__62213 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__RuleSet__Group__6__Impl2241 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RuleSet__Group_4__0__Impl_in_rule__RuleSet__Group_4__02286 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_rule__RuleSet__Group_4__1_in_rule__RuleSet__Group_4__02289 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__RuleSet__Group_4__0__Impl2317 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RuleSet__Group_4__1__Impl_in_rule__RuleSet__Group_4__12348 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RuleSet__DescriptionAssignment_4_1_in_rule__RuleSet__Group_4__1__Impl2375 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RuleSet__Group_5__0__Impl_in_rule__RuleSet__Group_5__02409 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__RuleSet__Group_5__1_in_rule__RuleSet__Group_5__02412 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RuleSet__VpRulesAssignment_5_0_in_rule__RuleSet__Group_5__0__Impl2439 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RuleSet__Group_5__1__Impl_in_rule__RuleSet__Group_5__12469 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RuleSet__VpRulesAssignment_5_1_in_rule__RuleSet__Group_5__1__Impl2496 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_rule__Service__Group__0__Impl_in_rule__Service__Group__02531 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__Service__Group__1_in_rule__Service__Group__02534 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Service__Group__1__Impl_in_rule__Service__Group__12592 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Service__Group__2_in_rule__Service__Group__12595 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Service__Group__1__Impl2623 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Service__Group__2__Impl_in_rule__Service__Group__22654 = new BitSet(new long[]{0x0000000001100000L});
    public static final BitSet FOLLOW_rule__Service__Group__3_in_rule__Service__Group__22657 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Service__NameAssignment_2_in_rule__Service__Group__2__Impl2684 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Service__Group__3__Impl_in_rule__Service__Group__32714 = new BitSet(new long[]{0x0000000001100000L});
    public static final BitSet FOLLOW_rule__Service__Group__4_in_rule__Service__Group__32717 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Service__Group_3__0_in_rule__Service__Group__3__Impl2744 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Service__Group__4__Impl_in_rule__Service__Group__42775 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Service__Group_4__0_in_rule__Service__Group__4__Impl2802 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Service__Group_3__0__Impl_in_rule__Service__Group_3__02843 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_rule__Service__Group_3__1_in_rule__Service__Group_3__02846 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Service__Group_3__0__Impl2874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Service__Group_3__1__Impl_in_rule__Service__Group_3__12905 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__Service__Group_3__2_in_rule__Service__Group_3__12908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Service__DescriptionAssignment_3_1_in_rule__Service__Group_3__1__Impl2935 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Service__Group_3__2__Impl_in_rule__Service__Group_3__22965 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Service__Group_3__2__Impl2993 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Service__Group_4__0__Impl_in_rule__Service__Group_4__03030 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Service__Group_4__1_in_rule__Service__Group_4__03033 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Service__Group_4__0__Impl3061 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Service__Group_4__1__Impl_in_rule__Service__Group_4__13092 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__Service__Group_4__2_in_rule__Service__Group_4__13095 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Service__RelatedRulesAssignment_4_1_in_rule__Service__Group_4__1__Impl3122 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Service__Group_4__2__Impl_in_rule__Service__Group_4__23152 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Service__Group_4_2__0_in_rule__Service__Group_4__2__Impl3179 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_rule__Service__Group_4_2__0__Impl_in_rule__Service__Group_4_2__03216 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Service__Group_4_2__1_in_rule__Service__Group_4_2__03219 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Service__Group_4_2__0__Impl3247 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Service__Group_4_2__1__Impl_in_rule__Service__Group_4_2__13278 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Service__RelatedRulesAssignment_4_2_1_in_rule__Service__Group_4_2__1__Impl3305 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rule__Group__0__Impl_in_rule__Rule__Group__03339 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__Rule__Group__1_in_rule__Rule__Group__03342 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rule__Group__1__Impl_in_rule__Rule__Group__13400 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Rule__Group__2_in_rule__Rule__Group__13403 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Rule__Group__1__Impl3431 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rule__Group__2__Impl_in_rule__Rule__Group__23462 = new BitSet(new long[]{0x0000000004100000L});
    public static final BitSet FOLLOW_rule__Rule__Group__3_in_rule__Rule__Group__23465 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rule__NameAssignment_2_in_rule__Rule__Group__2__Impl3492 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rule__Group__3__Impl_in_rule__Rule__Group__33522 = new BitSet(new long[]{0x0000000004100000L});
    public static final BitSet FOLLOW_rule__Rule__Group__4_in_rule__Rule__Group__33525 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rule__Group_3__0_in_rule__Rule__Group__3__Impl3552 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rule__Group__4__Impl_in_rule__Rule__Group__43583 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__Rule__Group__5_in_rule__Rule__Group__43586 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rule__Group_4__0_in_rule__Rule__Group__4__Impl3613 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rule__Group__5__Impl_in_rule__Rule__Group__53643 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rule__Group_5__0_in_rule__Rule__Group__5__Impl3670 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rule__Group_3__0__Impl_in_rule__Rule__Group_3__03713 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_rule__Rule__Group_3__1_in_rule__Rule__Group_3__03716 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Rule__Group_3__0__Impl3744 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rule__Group_3__1__Impl_in_rule__Rule__Group_3__13775 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__Rule__Group_3__2_in_rule__Rule__Group_3__13778 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rule__DescriptionAssignment_3_1_in_rule__Rule__Group_3__1__Impl3805 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rule__Group_3__2__Impl_in_rule__Rule__Group_3__23835 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Rule__Group_3__2__Impl3863 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rule__Group_4__0__Impl_in_rule__Rule__Group_4__03900 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_rule__Rule__Group_4__1_in_rule__Rule__Group_4__03903 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Rule__Group_4__0__Impl3931 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rule__Group_4__1__Impl_in_rule__Rule__Group_4__13962 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rule__TypeAssignment_4_1_in_rule__Rule__Group_4__1__Impl3989 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rule__Group_5__0__Impl_in_rule__Rule__Group_5__04023 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__Rule__Group_5__1_in_rule__Rule__Group_5__04026 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Rule__Group_5__0__Impl4054 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rule__Group_5__1__Impl_in_rule__Rule__Group_5__14085 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_rule__Rule__Group_5__2_in_rule__Rule__Group_5__14088 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__Rule__Group_5__1__Impl4116 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rule__Group_5__2__Impl_in_rule__Rule__Group_5__24147 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rule__ClassAssignment_5_2_in_rule__Rule__Group_5__2__Impl4174 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertySet__Group__0__Impl_in_rule__PropertySet__Group__04210 = new BitSet(new long[]{0x0000000010220000L});
    public static final BitSet FOLLOW_rule__PropertySet__Group__1_in_rule__PropertySet__Group__04213 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertySet__Group__1__Impl_in_rule__PropertySet__Group__14271 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__PropertySet__Group__2_in_rule__PropertySet__Group__14274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__PropertySet__Group__1__Impl4302 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertySet__Group__2__Impl_in_rule__PropertySet__Group__24333 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__PropertySet__Group__3_in_rule__PropertySet__Group__24336 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertySet__NameAssignment_2_in_rule__PropertySet__Group__2__Impl4363 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertySet__Group__3__Impl_in_rule__PropertySet__Group__34393 = new BitSet(new long[]{0x0000000020080000L});
    public static final BitSet FOLLOW_rule__PropertySet__Group__4_in_rule__PropertySet__Group__34396 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__PropertySet__Group__3__Impl4424 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertySet__Group__4__Impl_in_rule__PropertySet__Group__44455 = new BitSet(new long[]{0x0000000020080000L});
    public static final BitSet FOLLOW_rule__PropertySet__Group__5_in_rule__PropertySet__Group__44458 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertySet__VpPropertiesAssignment_4_in_rule__PropertySet__Group__4__Impl4485 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_rule__PropertySet__Group__5__Impl_in_rule__PropertySet__Group__54516 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__PropertySet__Group__5__Impl4544 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Property__Group__0__Impl_in_rule__Property__Group__04587 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rule__Property__Group__1_in_rule__Property__Group__04590 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Property__Group__1__Impl_in_rule__Property__Group__14648 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_rule__Property__Group__2_in_rule__Property__Group__14651 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__Property__Group__1__Impl4679 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Property__Group__2__Impl_in_rule__Property__Group__24710 = new BitSet(new long[]{0x0000000044000000L});
    public static final BitSet FOLLOW_rule__Property__Group__3_in_rule__Property__Group__24713 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Property__NameAssignment_2_in_rule__Property__Group__2__Impl4740 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Property__Group__3__Impl_in_rule__Property__Group__34770 = new BitSet(new long[]{0x0000000044000000L});
    public static final BitSet FOLLOW_rule__Property__Group__4_in_rule__Property__Group__34773 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Property__Group_3__0_in_rule__Property__Group__3__Impl4800 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Property__Group__4__Impl_in_rule__Property__Group__44831 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Property__Group_4__0_in_rule__Property__Group__4__Impl4858 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Property__Group_3__0__Impl_in_rule__Property__Group_3__04899 = new BitSet(new long[]{0x000000000001E000L});
    public static final BitSet FOLLOW_rule__Property__Group_3__1_in_rule__Property__Group_3__04902 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Property__Group_3__0__Impl4930 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Property__Group_3__1__Impl_in_rule__Property__Group_3__14961 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Property__TypeAssignment_3_1_in_rule__Property__Group_3__1__Impl4988 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Property__Group_4__0__Impl_in_rule__Property__Group_4__05022 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_rule__Property__Group_4__1_in_rule__Property__Group_4__05025 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__Property__Group_4__0__Impl5053 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Property__Group_4__1__Impl_in_rule__Property__Group_4__15084 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Property__ValueAssignment_4_1_in_rule__Property__Group_4__1__Impl5111 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FQN__Group__0__Impl_in_rule__FQN__Group__05145 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__FQN__Group__1_in_rule__FQN__Group__05148 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__FQN__Group__0__Impl5175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FQN__Group__1__Impl_in_rule__FQN__Group__15204 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FQN__Group_1__0_in_rule__FQN__Group__1__Impl5231 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_rule__FQN__Group_1__0__Impl_in_rule__FQN__Group_1__05266 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__FQN__Group_1__1_in_rule__FQN__Group_1__05269 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__FQN__Group_1__0__Impl5297 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FQN__Group_1__1__Impl_in_rule__FQN__Group_1__15328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__FQN__Group_1__1__Impl5356 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAspect_in_rule__Services__ServicesAssignment_15395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFQN_in_rule__ServiceSet__NameAssignment_25426 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEString_in_rule__ServiceSet__DescriptionAssignment_4_15457 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleService_in_rule__ServiceSet__VpServicesAssignment_5_05488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleService_in_rule__ServiceSet__VpServicesAssignment_5_15519 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFQN_in_rule__RuleSet__NameAssignment_25550 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEString_in_rule__RuleSet__DescriptionAssignment_4_15581 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRule_in_rule__RuleSet__VpRulesAssignment_5_05612 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRule_in_rule__RuleSet__VpRulesAssignment_5_15643 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFQN_in_rule__Service__NameAssignment_25674 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEString_in_rule__Service__DescriptionAssignment_3_15705 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFQN_in_rule__Service__RelatedRulesAssignment_4_15740 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFQN_in_rule__Service__RelatedRulesAssignment_4_2_15779 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFQN_in_rule__Rule__NameAssignment_25814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEString_in_rule__Rule__DescriptionAssignment_3_15845 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRules_Types_in_rule__Rule__TypeAssignment_4_15876 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEString_in_rule__Rule__ClassAssignment_5_25907 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFQN_in_rule__PropertySet__NameAssignment_25938 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProperty_in_rule__PropertySet__VpPropertiesAssignment_45969 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEString_in_rule__Property__NameAssignment_26000 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePropertyType_in_rule__Property__TypeAssignment_3_16031 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEString_in_rule__Property__ValueAssignment_4_16062 = new BitSet(new long[]{0x0000000000000002L});

}

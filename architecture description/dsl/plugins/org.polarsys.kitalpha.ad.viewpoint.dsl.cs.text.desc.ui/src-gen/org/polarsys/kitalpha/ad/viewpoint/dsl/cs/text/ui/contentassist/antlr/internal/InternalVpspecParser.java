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
import org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.VpspecGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
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
@SuppressWarnings("all")
public class InternalVpspecParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Viewpoint'", "'{'", "'}'", "'name:'", "'description:'", "'extends'", "','", "'aggregates'", "'uses viewpoint'", "'uses model'", "'uses diagram'", "'uses workspace'", "'uses filesystem'", "'Data'", "'.'", "'UI'", "'Diagrams'", "'ActivityExplorer'", "'Services'", "'Build'", "'Configuration'"
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


        public InternalVpspecParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalVpspecParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalVpspecParser.tokenNames; }
    public String getGrammarFileName() { return "../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g"; }


     
     	private VpspecGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(VpspecGrammarAccess grammarAccess) {
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




    // $ANTLR start "entryRuleViewpoint"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:68:1: entryRuleViewpoint : ruleViewpoint EOF ;
    public final void entryRuleViewpoint() throws RecognitionException {
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:69:1: ( ruleViewpoint EOF )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:70:1: ruleViewpoint EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getViewpointRule()); 
            }
            pushFollow(FOLLOW_ruleViewpoint_in_entryRuleViewpoint67);
            ruleViewpoint();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getViewpointRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleViewpoint74); if (state.failed) return ;

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
    // $ANTLR end "entryRuleViewpoint"


    // $ANTLR start "ruleViewpoint"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:77:1: ruleViewpoint : ( ( rule__Viewpoint__Group__0 ) ) ;
    public final void ruleViewpoint() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:81:2: ( ( ( rule__Viewpoint__Group__0 ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:82:1: ( ( rule__Viewpoint__Group__0 ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:82:1: ( ( rule__Viewpoint__Group__0 ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:83:1: ( rule__Viewpoint__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getViewpointAccess().getGroup()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:84:1: ( rule__Viewpoint__Group__0 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:84:2: rule__Viewpoint__Group__0
            {
            pushFollow(FOLLOW_rule__Viewpoint__Group__0_in_ruleViewpoint100);
            rule__Viewpoint__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getViewpointAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleViewpoint"


    // $ANTLR start "entryRuleEString"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:96:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:97:1: ( ruleEString EOF )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:98:1: ruleEString EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEStringRule()); 
            }
            pushFollow(FOLLOW_ruleEString_in_entryRuleEString127);
            ruleEString();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEStringRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEString134); if (state.failed) return ;

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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:105:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:109:2: ( ( ( rule__EString__Alternatives ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:110:1: ( ( rule__EString__Alternatives ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:110:1: ( ( rule__EString__Alternatives ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:111:1: ( rule__EString__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEStringAccess().getAlternatives()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:112:1: ( rule__EString__Alternatives )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:112:2: rule__EString__Alternatives
            {
            pushFollow(FOLLOW_rule__EString__Alternatives_in_ruleEString160);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:124:1: entryRuleFQN : ruleFQN EOF ;
    public final void entryRuleFQN() throws RecognitionException {
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:125:1: ( ruleFQN EOF )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:126:1: ruleFQN EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFQNRule()); 
            }
            pushFollow(FOLLOW_ruleFQN_in_entryRuleFQN187);
            ruleFQN();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFQNRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFQN194); if (state.failed) return ;

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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:133:1: ruleFQN : ( ( rule__FQN__Group__0 ) ) ;
    public final void ruleFQN() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:137:2: ( ( ( rule__FQN__Group__0 ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:138:1: ( ( rule__FQN__Group__0 ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:138:1: ( ( rule__FQN__Group__0 ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:139:1: ( rule__FQN__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFQNAccess().getGroup()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:140:1: ( rule__FQN__Group__0 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:140:2: rule__FQN__Group__0
            {
            pushFollow(FOLLOW_rule__FQN__Group__0_in_ruleFQN220);
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


    // $ANTLR start "rule__EString__Alternatives"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:156:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:160:1: ( ( RULE_STRING ) | ( RULE_ID ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==RULE_STRING) ) {
                alt1=1;
            }
            else if ( (LA1_0==RULE_ID) ) {
                alt1=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:161:1: ( RULE_STRING )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:161:1: ( RULE_STRING )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:162:1: RULE_STRING
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    }
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__EString__Alternatives260); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:167:6: ( RULE_ID )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:167:6: ( RULE_ID )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:168:1: RULE_ID
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                    }
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__EString__Alternatives277); if (state.failed) return ;
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


    // $ANTLR start "rule__Viewpoint__Group__0"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:181:1: rule__Viewpoint__Group__0 : rule__Viewpoint__Group__0__Impl rule__Viewpoint__Group__1 ;
    public final void rule__Viewpoint__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:185:1: ( rule__Viewpoint__Group__0__Impl rule__Viewpoint__Group__1 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:186:2: rule__Viewpoint__Group__0__Impl rule__Viewpoint__Group__1
            {
            pushFollow(FOLLOW_rule__Viewpoint__Group__0__Impl_in_rule__Viewpoint__Group__0308);
            rule__Viewpoint__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Viewpoint__Group__1_in_rule__Viewpoint__Group__0311);
            rule__Viewpoint__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Viewpoint__Group__0"


    // $ANTLR start "rule__Viewpoint__Group__0__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:193:1: rule__Viewpoint__Group__0__Impl : ( () ) ;
    public final void rule__Viewpoint__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:197:1: ( ( () ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:198:1: ( () )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:198:1: ( () )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:199:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getViewpointAccess().getViewpointAction_0()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:200:1: ()
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:202:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getViewpointAccess().getViewpointAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Viewpoint__Group__0__Impl"


    // $ANTLR start "rule__Viewpoint__Group__1"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:212:1: rule__Viewpoint__Group__1 : rule__Viewpoint__Group__1__Impl rule__Viewpoint__Group__2 ;
    public final void rule__Viewpoint__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:216:1: ( rule__Viewpoint__Group__1__Impl rule__Viewpoint__Group__2 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:217:2: rule__Viewpoint__Group__1__Impl rule__Viewpoint__Group__2
            {
            pushFollow(FOLLOW_rule__Viewpoint__Group__1__Impl_in_rule__Viewpoint__Group__1369);
            rule__Viewpoint__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Viewpoint__Group__2_in_rule__Viewpoint__Group__1372);
            rule__Viewpoint__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Viewpoint__Group__1"


    // $ANTLR start "rule__Viewpoint__Group__1__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:224:1: rule__Viewpoint__Group__1__Impl : ( 'Viewpoint' ) ;
    public final void rule__Viewpoint__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:228:1: ( ( 'Viewpoint' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:229:1: ( 'Viewpoint' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:229:1: ( 'Viewpoint' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:230:1: 'Viewpoint'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getViewpointAccess().getViewpointKeyword_1()); 
            }
            match(input,11,FOLLOW_11_in_rule__Viewpoint__Group__1__Impl400); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getViewpointAccess().getViewpointKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Viewpoint__Group__1__Impl"


    // $ANTLR start "rule__Viewpoint__Group__2"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:243:1: rule__Viewpoint__Group__2 : rule__Viewpoint__Group__2__Impl rule__Viewpoint__Group__3 ;
    public final void rule__Viewpoint__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:247:1: ( rule__Viewpoint__Group__2__Impl rule__Viewpoint__Group__3 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:248:2: rule__Viewpoint__Group__2__Impl rule__Viewpoint__Group__3
            {
            pushFollow(FOLLOW_rule__Viewpoint__Group__2__Impl_in_rule__Viewpoint__Group__2431);
            rule__Viewpoint__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Viewpoint__Group__3_in_rule__Viewpoint__Group__2434);
            rule__Viewpoint__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Viewpoint__Group__2"


    // $ANTLR start "rule__Viewpoint__Group__2__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:255:1: rule__Viewpoint__Group__2__Impl : ( ( rule__Viewpoint__ShortNameAssignment_2 )? ) ;
    public final void rule__Viewpoint__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:259:1: ( ( ( rule__Viewpoint__ShortNameAssignment_2 )? ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:260:1: ( ( rule__Viewpoint__ShortNameAssignment_2 )? )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:260:1: ( ( rule__Viewpoint__ShortNameAssignment_2 )? )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:261:1: ( rule__Viewpoint__ShortNameAssignment_2 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getViewpointAccess().getShortNameAssignment_2()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:262:1: ( rule__Viewpoint__ShortNameAssignment_2 )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_ID) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:262:2: rule__Viewpoint__ShortNameAssignment_2
                    {
                    pushFollow(FOLLOW_rule__Viewpoint__ShortNameAssignment_2_in_rule__Viewpoint__Group__2__Impl461);
                    rule__Viewpoint__ShortNameAssignment_2();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getViewpointAccess().getShortNameAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Viewpoint__Group__2__Impl"


    // $ANTLR start "rule__Viewpoint__Group__3"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:272:1: rule__Viewpoint__Group__3 : rule__Viewpoint__Group__3__Impl rule__Viewpoint__Group__4 ;
    public final void rule__Viewpoint__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:276:1: ( rule__Viewpoint__Group__3__Impl rule__Viewpoint__Group__4 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:277:2: rule__Viewpoint__Group__3__Impl rule__Viewpoint__Group__4
            {
            pushFollow(FOLLOW_rule__Viewpoint__Group__3__Impl_in_rule__Viewpoint__Group__3492);
            rule__Viewpoint__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Viewpoint__Group__4_in_rule__Viewpoint__Group__3495);
            rule__Viewpoint__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Viewpoint__Group__3"


    // $ANTLR start "rule__Viewpoint__Group__3__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:284:1: rule__Viewpoint__Group__3__Impl : ( '{' ) ;
    public final void rule__Viewpoint__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:288:1: ( ( '{' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:289:1: ( '{' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:289:1: ( '{' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:290:1: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getViewpointAccess().getLeftCurlyBracketKeyword_3()); 
            }
            match(input,12,FOLLOW_12_in_rule__Viewpoint__Group__3__Impl523); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getViewpointAccess().getLeftCurlyBracketKeyword_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Viewpoint__Group__3__Impl"


    // $ANTLR start "rule__Viewpoint__Group__4"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:303:1: rule__Viewpoint__Group__4 : rule__Viewpoint__Group__4__Impl rule__Viewpoint__Group__5 ;
    public final void rule__Viewpoint__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:307:1: ( rule__Viewpoint__Group__4__Impl rule__Viewpoint__Group__5 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:308:2: rule__Viewpoint__Group__4__Impl rule__Viewpoint__Group__5
            {
            pushFollow(FOLLOW_rule__Viewpoint__Group__4__Impl_in_rule__Viewpoint__Group__4554);
            rule__Viewpoint__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Viewpoint__Group__5_in_rule__Viewpoint__Group__4557);
            rule__Viewpoint__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Viewpoint__Group__4"


    // $ANTLR start "rule__Viewpoint__Group__4__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:315:1: rule__Viewpoint__Group__4__Impl : ( ( rule__Viewpoint__Group_4__0 ) ) ;
    public final void rule__Viewpoint__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:319:1: ( ( ( rule__Viewpoint__Group_4__0 ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:320:1: ( ( rule__Viewpoint__Group_4__0 ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:320:1: ( ( rule__Viewpoint__Group_4__0 ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:321:1: ( rule__Viewpoint__Group_4__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getViewpointAccess().getGroup_4()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:322:1: ( rule__Viewpoint__Group_4__0 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:322:2: rule__Viewpoint__Group_4__0
            {
            pushFollow(FOLLOW_rule__Viewpoint__Group_4__0_in_rule__Viewpoint__Group__4__Impl584);
            rule__Viewpoint__Group_4__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getViewpointAccess().getGroup_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Viewpoint__Group__4__Impl"


    // $ANTLR start "rule__Viewpoint__Group__5"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:332:1: rule__Viewpoint__Group__5 : rule__Viewpoint__Group__5__Impl rule__Viewpoint__Group__6 ;
    public final void rule__Viewpoint__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:336:1: ( rule__Viewpoint__Group__5__Impl rule__Viewpoint__Group__6 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:337:2: rule__Viewpoint__Group__5__Impl rule__Viewpoint__Group__6
            {
            pushFollow(FOLLOW_rule__Viewpoint__Group__5__Impl_in_rule__Viewpoint__Group__5614);
            rule__Viewpoint__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Viewpoint__Group__6_in_rule__Viewpoint__Group__5617);
            rule__Viewpoint__Group__6();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Viewpoint__Group__5"


    // $ANTLR start "rule__Viewpoint__Group__5__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:344:1: rule__Viewpoint__Group__5__Impl : ( ( rule__Viewpoint__Group_5__0 )? ) ;
    public final void rule__Viewpoint__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:348:1: ( ( ( rule__Viewpoint__Group_5__0 )? ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:349:1: ( ( rule__Viewpoint__Group_5__0 )? )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:349:1: ( ( rule__Viewpoint__Group_5__0 )? )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:350:1: ( rule__Viewpoint__Group_5__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getViewpointAccess().getGroup_5()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:351:1: ( rule__Viewpoint__Group_5__0 )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==15) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:351:2: rule__Viewpoint__Group_5__0
                    {
                    pushFollow(FOLLOW_rule__Viewpoint__Group_5__0_in_rule__Viewpoint__Group__5__Impl644);
                    rule__Viewpoint__Group_5__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getViewpointAccess().getGroup_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Viewpoint__Group__5__Impl"


    // $ANTLR start "rule__Viewpoint__Group__6"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:361:1: rule__Viewpoint__Group__6 : rule__Viewpoint__Group__6__Impl rule__Viewpoint__Group__7 ;
    public final void rule__Viewpoint__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:365:1: ( rule__Viewpoint__Group__6__Impl rule__Viewpoint__Group__7 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:366:2: rule__Viewpoint__Group__6__Impl rule__Viewpoint__Group__7
            {
            pushFollow(FOLLOW_rule__Viewpoint__Group__6__Impl_in_rule__Viewpoint__Group__6675);
            rule__Viewpoint__Group__6__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Viewpoint__Group__7_in_rule__Viewpoint__Group__6678);
            rule__Viewpoint__Group__7();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Viewpoint__Group__6"


    // $ANTLR start "rule__Viewpoint__Group__6__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:373:1: rule__Viewpoint__Group__6__Impl : ( ( rule__Viewpoint__Group_6__0 )? ) ;
    public final void rule__Viewpoint__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:377:1: ( ( ( rule__Viewpoint__Group_6__0 )? ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:378:1: ( ( rule__Viewpoint__Group_6__0 )? )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:378:1: ( ( rule__Viewpoint__Group_6__0 )? )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:379:1: ( rule__Viewpoint__Group_6__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getViewpointAccess().getGroup_6()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:380:1: ( rule__Viewpoint__Group_6__0 )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==16) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:380:2: rule__Viewpoint__Group_6__0
                    {
                    pushFollow(FOLLOW_rule__Viewpoint__Group_6__0_in_rule__Viewpoint__Group__6__Impl705);
                    rule__Viewpoint__Group_6__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getViewpointAccess().getGroup_6()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Viewpoint__Group__6__Impl"


    // $ANTLR start "rule__Viewpoint__Group__7"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:390:1: rule__Viewpoint__Group__7 : rule__Viewpoint__Group__7__Impl rule__Viewpoint__Group__8 ;
    public final void rule__Viewpoint__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:394:1: ( rule__Viewpoint__Group__7__Impl rule__Viewpoint__Group__8 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:395:2: rule__Viewpoint__Group__7__Impl rule__Viewpoint__Group__8
            {
            pushFollow(FOLLOW_rule__Viewpoint__Group__7__Impl_in_rule__Viewpoint__Group__7736);
            rule__Viewpoint__Group__7__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Viewpoint__Group__8_in_rule__Viewpoint__Group__7739);
            rule__Viewpoint__Group__8();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Viewpoint__Group__7"


    // $ANTLR start "rule__Viewpoint__Group__7__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:402:1: rule__Viewpoint__Group__7__Impl : ( ( rule__Viewpoint__Group_7__0 )? ) ;
    public final void rule__Viewpoint__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:406:1: ( ( ( rule__Viewpoint__Group_7__0 )? ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:407:1: ( ( rule__Viewpoint__Group_7__0 )? )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:407:1: ( ( rule__Viewpoint__Group_7__0 )? )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:408:1: ( rule__Viewpoint__Group_7__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getViewpointAccess().getGroup_7()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:409:1: ( rule__Viewpoint__Group_7__0 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==18) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:409:2: rule__Viewpoint__Group_7__0
                    {
                    pushFollow(FOLLOW_rule__Viewpoint__Group_7__0_in_rule__Viewpoint__Group__7__Impl766);
                    rule__Viewpoint__Group_7__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getViewpointAccess().getGroup_7()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Viewpoint__Group__7__Impl"


    // $ANTLR start "rule__Viewpoint__Group__8"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:419:1: rule__Viewpoint__Group__8 : rule__Viewpoint__Group__8__Impl rule__Viewpoint__Group__9 ;
    public final void rule__Viewpoint__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:423:1: ( rule__Viewpoint__Group__8__Impl rule__Viewpoint__Group__9 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:424:2: rule__Viewpoint__Group__8__Impl rule__Viewpoint__Group__9
            {
            pushFollow(FOLLOW_rule__Viewpoint__Group__8__Impl_in_rule__Viewpoint__Group__8797);
            rule__Viewpoint__Group__8__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Viewpoint__Group__9_in_rule__Viewpoint__Group__8800);
            rule__Viewpoint__Group__9();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Viewpoint__Group__8"


    // $ANTLR start "rule__Viewpoint__Group__8__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:431:1: rule__Viewpoint__Group__8__Impl : ( ( rule__Viewpoint__Group_8__0 )? ) ;
    public final void rule__Viewpoint__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:435:1: ( ( ( rule__Viewpoint__Group_8__0 )? ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:436:1: ( ( rule__Viewpoint__Group_8__0 )? )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:436:1: ( ( rule__Viewpoint__Group_8__0 )? )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:437:1: ( rule__Viewpoint__Group_8__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getViewpointAccess().getGroup_8()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:438:1: ( rule__Viewpoint__Group_8__0 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==19) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:438:2: rule__Viewpoint__Group_8__0
                    {
                    pushFollow(FOLLOW_rule__Viewpoint__Group_8__0_in_rule__Viewpoint__Group__8__Impl827);
                    rule__Viewpoint__Group_8__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getViewpointAccess().getGroup_8()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Viewpoint__Group__8__Impl"


    // $ANTLR start "rule__Viewpoint__Group__9"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:448:1: rule__Viewpoint__Group__9 : rule__Viewpoint__Group__9__Impl rule__Viewpoint__Group__10 ;
    public final void rule__Viewpoint__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:452:1: ( rule__Viewpoint__Group__9__Impl rule__Viewpoint__Group__10 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:453:2: rule__Viewpoint__Group__9__Impl rule__Viewpoint__Group__10
            {
            pushFollow(FOLLOW_rule__Viewpoint__Group__9__Impl_in_rule__Viewpoint__Group__9858);
            rule__Viewpoint__Group__9__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Viewpoint__Group__10_in_rule__Viewpoint__Group__9861);
            rule__Viewpoint__Group__10();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Viewpoint__Group__9"


    // $ANTLR start "rule__Viewpoint__Group__9__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:460:1: rule__Viewpoint__Group__9__Impl : ( ( rule__Viewpoint__Group_9__0 )? ) ;
    public final void rule__Viewpoint__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:464:1: ( ( ( rule__Viewpoint__Group_9__0 )? ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:465:1: ( ( rule__Viewpoint__Group_9__0 )? )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:465:1: ( ( rule__Viewpoint__Group_9__0 )? )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:466:1: ( rule__Viewpoint__Group_9__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getViewpointAccess().getGroup_9()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:467:1: ( rule__Viewpoint__Group_9__0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==20) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:467:2: rule__Viewpoint__Group_9__0
                    {
                    pushFollow(FOLLOW_rule__Viewpoint__Group_9__0_in_rule__Viewpoint__Group__9__Impl888);
                    rule__Viewpoint__Group_9__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getViewpointAccess().getGroup_9()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Viewpoint__Group__9__Impl"


    // $ANTLR start "rule__Viewpoint__Group__10"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:477:1: rule__Viewpoint__Group__10 : rule__Viewpoint__Group__10__Impl rule__Viewpoint__Group__11 ;
    public final void rule__Viewpoint__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:481:1: ( rule__Viewpoint__Group__10__Impl rule__Viewpoint__Group__11 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:482:2: rule__Viewpoint__Group__10__Impl rule__Viewpoint__Group__11
            {
            pushFollow(FOLLOW_rule__Viewpoint__Group__10__Impl_in_rule__Viewpoint__Group__10919);
            rule__Viewpoint__Group__10__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Viewpoint__Group__11_in_rule__Viewpoint__Group__10922);
            rule__Viewpoint__Group__11();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Viewpoint__Group__10"


    // $ANTLR start "rule__Viewpoint__Group__10__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:489:1: rule__Viewpoint__Group__10__Impl : ( ( rule__Viewpoint__Group_10__0 )? ) ;
    public final void rule__Viewpoint__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:493:1: ( ( ( rule__Viewpoint__Group_10__0 )? ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:494:1: ( ( rule__Viewpoint__Group_10__0 )? )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:494:1: ( ( rule__Viewpoint__Group_10__0 )? )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:495:1: ( rule__Viewpoint__Group_10__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getViewpointAccess().getGroup_10()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:496:1: ( rule__Viewpoint__Group_10__0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==21) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:496:2: rule__Viewpoint__Group_10__0
                    {
                    pushFollow(FOLLOW_rule__Viewpoint__Group_10__0_in_rule__Viewpoint__Group__10__Impl949);
                    rule__Viewpoint__Group_10__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getViewpointAccess().getGroup_10()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Viewpoint__Group__10__Impl"


    // $ANTLR start "rule__Viewpoint__Group__11"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:506:1: rule__Viewpoint__Group__11 : rule__Viewpoint__Group__11__Impl rule__Viewpoint__Group__12 ;
    public final void rule__Viewpoint__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:510:1: ( rule__Viewpoint__Group__11__Impl rule__Viewpoint__Group__12 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:511:2: rule__Viewpoint__Group__11__Impl rule__Viewpoint__Group__12
            {
            pushFollow(FOLLOW_rule__Viewpoint__Group__11__Impl_in_rule__Viewpoint__Group__11980);
            rule__Viewpoint__Group__11__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Viewpoint__Group__12_in_rule__Viewpoint__Group__11983);
            rule__Viewpoint__Group__12();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Viewpoint__Group__11"


    // $ANTLR start "rule__Viewpoint__Group__11__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:518:1: rule__Viewpoint__Group__11__Impl : ( ( rule__Viewpoint__Group_11__0 )? ) ;
    public final void rule__Viewpoint__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:522:1: ( ( ( rule__Viewpoint__Group_11__0 )? ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:523:1: ( ( rule__Viewpoint__Group_11__0 )? )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:523:1: ( ( rule__Viewpoint__Group_11__0 )? )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:524:1: ( rule__Viewpoint__Group_11__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getViewpointAccess().getGroup_11()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:525:1: ( rule__Viewpoint__Group_11__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==22) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:525:2: rule__Viewpoint__Group_11__0
                    {
                    pushFollow(FOLLOW_rule__Viewpoint__Group_11__0_in_rule__Viewpoint__Group__11__Impl1010);
                    rule__Viewpoint__Group_11__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getViewpointAccess().getGroup_11()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Viewpoint__Group__11__Impl"


    // $ANTLR start "rule__Viewpoint__Group__12"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:535:1: rule__Viewpoint__Group__12 : rule__Viewpoint__Group__12__Impl rule__Viewpoint__Group__13 ;
    public final void rule__Viewpoint__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:539:1: ( rule__Viewpoint__Group__12__Impl rule__Viewpoint__Group__13 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:540:2: rule__Viewpoint__Group__12__Impl rule__Viewpoint__Group__13
            {
            pushFollow(FOLLOW_rule__Viewpoint__Group__12__Impl_in_rule__Viewpoint__Group__121041);
            rule__Viewpoint__Group__12__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Viewpoint__Group__13_in_rule__Viewpoint__Group__121044);
            rule__Viewpoint__Group__13();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Viewpoint__Group__12"


    // $ANTLR start "rule__Viewpoint__Group__12__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:547:1: rule__Viewpoint__Group__12__Impl : ( ( rule__Viewpoint__Group_12__0 )? ) ;
    public final void rule__Viewpoint__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:551:1: ( ( ( rule__Viewpoint__Group_12__0 )? ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:552:1: ( ( rule__Viewpoint__Group_12__0 )? )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:552:1: ( ( rule__Viewpoint__Group_12__0 )? )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:553:1: ( rule__Viewpoint__Group_12__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getViewpointAccess().getGroup_12()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:554:1: ( rule__Viewpoint__Group_12__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==23) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:554:2: rule__Viewpoint__Group_12__0
                    {
                    pushFollow(FOLLOW_rule__Viewpoint__Group_12__0_in_rule__Viewpoint__Group__12__Impl1071);
                    rule__Viewpoint__Group_12__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getViewpointAccess().getGroup_12()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Viewpoint__Group__12__Impl"


    // $ANTLR start "rule__Viewpoint__Group__13"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:564:1: rule__Viewpoint__Group__13 : rule__Viewpoint__Group__13__Impl rule__Viewpoint__Group__14 ;
    public final void rule__Viewpoint__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:568:1: ( rule__Viewpoint__Group__13__Impl rule__Viewpoint__Group__14 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:569:2: rule__Viewpoint__Group__13__Impl rule__Viewpoint__Group__14
            {
            pushFollow(FOLLOW_rule__Viewpoint__Group__13__Impl_in_rule__Viewpoint__Group__131102);
            rule__Viewpoint__Group__13__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Viewpoint__Group__14_in_rule__Viewpoint__Group__131105);
            rule__Viewpoint__Group__14();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Viewpoint__Group__13"


    // $ANTLR start "rule__Viewpoint__Group__13__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:576:1: rule__Viewpoint__Group__13__Impl : ( ( rule__Viewpoint__Group_13__0 )? ) ;
    public final void rule__Viewpoint__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:580:1: ( ( ( rule__Viewpoint__Group_13__0 )? ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:581:1: ( ( rule__Viewpoint__Group_13__0 )? )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:581:1: ( ( rule__Viewpoint__Group_13__0 )? )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:582:1: ( rule__Viewpoint__Group_13__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getViewpointAccess().getGroup_13()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:583:1: ( rule__Viewpoint__Group_13__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==24) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:583:2: rule__Viewpoint__Group_13__0
                    {
                    pushFollow(FOLLOW_rule__Viewpoint__Group_13__0_in_rule__Viewpoint__Group__13__Impl1132);
                    rule__Viewpoint__Group_13__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getViewpointAccess().getGroup_13()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Viewpoint__Group__13__Impl"


    // $ANTLR start "rule__Viewpoint__Group__14"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:593:1: rule__Viewpoint__Group__14 : rule__Viewpoint__Group__14__Impl rule__Viewpoint__Group__15 ;
    public final void rule__Viewpoint__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:597:1: ( rule__Viewpoint__Group__14__Impl rule__Viewpoint__Group__15 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:598:2: rule__Viewpoint__Group__14__Impl rule__Viewpoint__Group__15
            {
            pushFollow(FOLLOW_rule__Viewpoint__Group__14__Impl_in_rule__Viewpoint__Group__141163);
            rule__Viewpoint__Group__14__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Viewpoint__Group__15_in_rule__Viewpoint__Group__141166);
            rule__Viewpoint__Group__15();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Viewpoint__Group__14"


    // $ANTLR start "rule__Viewpoint__Group__14__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:605:1: rule__Viewpoint__Group__14__Impl : ( ( rule__Viewpoint__Group_14__0 )? ) ;
    public final void rule__Viewpoint__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:609:1: ( ( ( rule__Viewpoint__Group_14__0 )? ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:610:1: ( ( rule__Viewpoint__Group_14__0 )? )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:610:1: ( ( rule__Viewpoint__Group_14__0 )? )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:611:1: ( rule__Viewpoint__Group_14__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getViewpointAccess().getGroup_14()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:612:1: ( rule__Viewpoint__Group_14__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==26) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:612:2: rule__Viewpoint__Group_14__0
                    {
                    pushFollow(FOLLOW_rule__Viewpoint__Group_14__0_in_rule__Viewpoint__Group__14__Impl1193);
                    rule__Viewpoint__Group_14__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getViewpointAccess().getGroup_14()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Viewpoint__Group__14__Impl"


    // $ANTLR start "rule__Viewpoint__Group__15"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:622:1: rule__Viewpoint__Group__15 : rule__Viewpoint__Group__15__Impl rule__Viewpoint__Group__16 ;
    public final void rule__Viewpoint__Group__15() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:626:1: ( rule__Viewpoint__Group__15__Impl rule__Viewpoint__Group__16 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:627:2: rule__Viewpoint__Group__15__Impl rule__Viewpoint__Group__16
            {
            pushFollow(FOLLOW_rule__Viewpoint__Group__15__Impl_in_rule__Viewpoint__Group__151224);
            rule__Viewpoint__Group__15__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Viewpoint__Group__16_in_rule__Viewpoint__Group__151227);
            rule__Viewpoint__Group__16();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Viewpoint__Group__15"


    // $ANTLR start "rule__Viewpoint__Group__15__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:634:1: rule__Viewpoint__Group__15__Impl : ( ( rule__Viewpoint__Group_15__0 )? ) ;
    public final void rule__Viewpoint__Group__15__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:638:1: ( ( ( rule__Viewpoint__Group_15__0 )? ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:639:1: ( ( rule__Viewpoint__Group_15__0 )? )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:639:1: ( ( rule__Viewpoint__Group_15__0 )? )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:640:1: ( rule__Viewpoint__Group_15__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getViewpointAccess().getGroup_15()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:641:1: ( rule__Viewpoint__Group_15__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==27) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:641:2: rule__Viewpoint__Group_15__0
                    {
                    pushFollow(FOLLOW_rule__Viewpoint__Group_15__0_in_rule__Viewpoint__Group__15__Impl1254);
                    rule__Viewpoint__Group_15__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getViewpointAccess().getGroup_15()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Viewpoint__Group__15__Impl"


    // $ANTLR start "rule__Viewpoint__Group__16"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:651:1: rule__Viewpoint__Group__16 : rule__Viewpoint__Group__16__Impl rule__Viewpoint__Group__17 ;
    public final void rule__Viewpoint__Group__16() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:655:1: ( rule__Viewpoint__Group__16__Impl rule__Viewpoint__Group__17 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:656:2: rule__Viewpoint__Group__16__Impl rule__Viewpoint__Group__17
            {
            pushFollow(FOLLOW_rule__Viewpoint__Group__16__Impl_in_rule__Viewpoint__Group__161285);
            rule__Viewpoint__Group__16__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Viewpoint__Group__17_in_rule__Viewpoint__Group__161288);
            rule__Viewpoint__Group__17();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Viewpoint__Group__16"


    // $ANTLR start "rule__Viewpoint__Group__16__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:663:1: rule__Viewpoint__Group__16__Impl : ( ( rule__Viewpoint__Group_16__0 )? ) ;
    public final void rule__Viewpoint__Group__16__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:667:1: ( ( ( rule__Viewpoint__Group_16__0 )? ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:668:1: ( ( rule__Viewpoint__Group_16__0 )? )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:668:1: ( ( rule__Viewpoint__Group_16__0 )? )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:669:1: ( rule__Viewpoint__Group_16__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getViewpointAccess().getGroup_16()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:670:1: ( rule__Viewpoint__Group_16__0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==28) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:670:2: rule__Viewpoint__Group_16__0
                    {
                    pushFollow(FOLLOW_rule__Viewpoint__Group_16__0_in_rule__Viewpoint__Group__16__Impl1315);
                    rule__Viewpoint__Group_16__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getViewpointAccess().getGroup_16()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Viewpoint__Group__16__Impl"


    // $ANTLR start "rule__Viewpoint__Group__17"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:680:1: rule__Viewpoint__Group__17 : rule__Viewpoint__Group__17__Impl rule__Viewpoint__Group__18 ;
    public final void rule__Viewpoint__Group__17() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:684:1: ( rule__Viewpoint__Group__17__Impl rule__Viewpoint__Group__18 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:685:2: rule__Viewpoint__Group__17__Impl rule__Viewpoint__Group__18
            {
            pushFollow(FOLLOW_rule__Viewpoint__Group__17__Impl_in_rule__Viewpoint__Group__171346);
            rule__Viewpoint__Group__17__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Viewpoint__Group__18_in_rule__Viewpoint__Group__171349);
            rule__Viewpoint__Group__18();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Viewpoint__Group__17"


    // $ANTLR start "rule__Viewpoint__Group__17__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:692:1: rule__Viewpoint__Group__17__Impl : ( ( rule__Viewpoint__Group_17__0 )? ) ;
    public final void rule__Viewpoint__Group__17__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:696:1: ( ( ( rule__Viewpoint__Group_17__0 )? ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:697:1: ( ( rule__Viewpoint__Group_17__0 )? )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:697:1: ( ( rule__Viewpoint__Group_17__0 )? )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:698:1: ( rule__Viewpoint__Group_17__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getViewpointAccess().getGroup_17()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:699:1: ( rule__Viewpoint__Group_17__0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==29) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:699:2: rule__Viewpoint__Group_17__0
                    {
                    pushFollow(FOLLOW_rule__Viewpoint__Group_17__0_in_rule__Viewpoint__Group__17__Impl1376);
                    rule__Viewpoint__Group_17__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getViewpointAccess().getGroup_17()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Viewpoint__Group__17__Impl"


    // $ANTLR start "rule__Viewpoint__Group__18"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:709:1: rule__Viewpoint__Group__18 : rule__Viewpoint__Group__18__Impl rule__Viewpoint__Group__19 ;
    public final void rule__Viewpoint__Group__18() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:713:1: ( rule__Viewpoint__Group__18__Impl rule__Viewpoint__Group__19 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:714:2: rule__Viewpoint__Group__18__Impl rule__Viewpoint__Group__19
            {
            pushFollow(FOLLOW_rule__Viewpoint__Group__18__Impl_in_rule__Viewpoint__Group__181407);
            rule__Viewpoint__Group__18__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Viewpoint__Group__19_in_rule__Viewpoint__Group__181410);
            rule__Viewpoint__Group__19();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Viewpoint__Group__18"


    // $ANTLR start "rule__Viewpoint__Group__18__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:721:1: rule__Viewpoint__Group__18__Impl : ( ( rule__Viewpoint__Group_18__0 )? ) ;
    public final void rule__Viewpoint__Group__18__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:725:1: ( ( ( rule__Viewpoint__Group_18__0 )? ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:726:1: ( ( rule__Viewpoint__Group_18__0 )? )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:726:1: ( ( rule__Viewpoint__Group_18__0 )? )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:727:1: ( rule__Viewpoint__Group_18__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getViewpointAccess().getGroup_18()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:728:1: ( rule__Viewpoint__Group_18__0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==30) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:728:2: rule__Viewpoint__Group_18__0
                    {
                    pushFollow(FOLLOW_rule__Viewpoint__Group_18__0_in_rule__Viewpoint__Group__18__Impl1437);
                    rule__Viewpoint__Group_18__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getViewpointAccess().getGroup_18()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Viewpoint__Group__18__Impl"


    // $ANTLR start "rule__Viewpoint__Group__19"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:738:1: rule__Viewpoint__Group__19 : rule__Viewpoint__Group__19__Impl rule__Viewpoint__Group__20 ;
    public final void rule__Viewpoint__Group__19() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:742:1: ( rule__Viewpoint__Group__19__Impl rule__Viewpoint__Group__20 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:743:2: rule__Viewpoint__Group__19__Impl rule__Viewpoint__Group__20
            {
            pushFollow(FOLLOW_rule__Viewpoint__Group__19__Impl_in_rule__Viewpoint__Group__191468);
            rule__Viewpoint__Group__19__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Viewpoint__Group__20_in_rule__Viewpoint__Group__191471);
            rule__Viewpoint__Group__20();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Viewpoint__Group__19"


    // $ANTLR start "rule__Viewpoint__Group__19__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:750:1: rule__Viewpoint__Group__19__Impl : ( ( rule__Viewpoint__Group_19__0 )? ) ;
    public final void rule__Viewpoint__Group__19__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:754:1: ( ( ( rule__Viewpoint__Group_19__0 )? ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:755:1: ( ( rule__Viewpoint__Group_19__0 )? )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:755:1: ( ( rule__Viewpoint__Group_19__0 )? )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:756:1: ( rule__Viewpoint__Group_19__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getViewpointAccess().getGroup_19()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:757:1: ( rule__Viewpoint__Group_19__0 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==31) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:757:2: rule__Viewpoint__Group_19__0
                    {
                    pushFollow(FOLLOW_rule__Viewpoint__Group_19__0_in_rule__Viewpoint__Group__19__Impl1498);
                    rule__Viewpoint__Group_19__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getViewpointAccess().getGroup_19()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Viewpoint__Group__19__Impl"


    // $ANTLR start "rule__Viewpoint__Group__20"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:767:1: rule__Viewpoint__Group__20 : rule__Viewpoint__Group__20__Impl ;
    public final void rule__Viewpoint__Group__20() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:771:1: ( rule__Viewpoint__Group__20__Impl )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:772:2: rule__Viewpoint__Group__20__Impl
            {
            pushFollow(FOLLOW_rule__Viewpoint__Group__20__Impl_in_rule__Viewpoint__Group__201529);
            rule__Viewpoint__Group__20__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Viewpoint__Group__20"


    // $ANTLR start "rule__Viewpoint__Group__20__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:778:1: rule__Viewpoint__Group__20__Impl : ( '}' ) ;
    public final void rule__Viewpoint__Group__20__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:782:1: ( ( '}' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:783:1: ( '}' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:783:1: ( '}' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:784:1: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getViewpointAccess().getRightCurlyBracketKeyword_20()); 
            }
            match(input,13,FOLLOW_13_in_rule__Viewpoint__Group__20__Impl1557); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getViewpointAccess().getRightCurlyBracketKeyword_20()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Viewpoint__Group__20__Impl"


    // $ANTLR start "rule__Viewpoint__Group_4__0"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:839:1: rule__Viewpoint__Group_4__0 : rule__Viewpoint__Group_4__0__Impl rule__Viewpoint__Group_4__1 ;
    public final void rule__Viewpoint__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:843:1: ( rule__Viewpoint__Group_4__0__Impl rule__Viewpoint__Group_4__1 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:844:2: rule__Viewpoint__Group_4__0__Impl rule__Viewpoint__Group_4__1
            {
            pushFollow(FOLLOW_rule__Viewpoint__Group_4__0__Impl_in_rule__Viewpoint__Group_4__01630);
            rule__Viewpoint__Group_4__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Viewpoint__Group_4__1_in_rule__Viewpoint__Group_4__01633);
            rule__Viewpoint__Group_4__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Viewpoint__Group_4__0"


    // $ANTLR start "rule__Viewpoint__Group_4__0__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:851:1: rule__Viewpoint__Group_4__0__Impl : ( 'name:' ) ;
    public final void rule__Viewpoint__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:855:1: ( ( 'name:' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:856:1: ( 'name:' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:856:1: ( 'name:' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:857:1: 'name:'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getViewpointAccess().getNameKeyword_4_0()); 
            }
            match(input,14,FOLLOW_14_in_rule__Viewpoint__Group_4__0__Impl1661); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getViewpointAccess().getNameKeyword_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Viewpoint__Group_4__0__Impl"


    // $ANTLR start "rule__Viewpoint__Group_4__1"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:870:1: rule__Viewpoint__Group_4__1 : rule__Viewpoint__Group_4__1__Impl ;
    public final void rule__Viewpoint__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:874:1: ( rule__Viewpoint__Group_4__1__Impl )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:875:2: rule__Viewpoint__Group_4__1__Impl
            {
            pushFollow(FOLLOW_rule__Viewpoint__Group_4__1__Impl_in_rule__Viewpoint__Group_4__11692);
            rule__Viewpoint__Group_4__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Viewpoint__Group_4__1"


    // $ANTLR start "rule__Viewpoint__Group_4__1__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:881:1: rule__Viewpoint__Group_4__1__Impl : ( ( rule__Viewpoint__NameAssignment_4_1 ) ) ;
    public final void rule__Viewpoint__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:885:1: ( ( ( rule__Viewpoint__NameAssignment_4_1 ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:886:1: ( ( rule__Viewpoint__NameAssignment_4_1 ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:886:1: ( ( rule__Viewpoint__NameAssignment_4_1 ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:887:1: ( rule__Viewpoint__NameAssignment_4_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getViewpointAccess().getNameAssignment_4_1()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:888:1: ( rule__Viewpoint__NameAssignment_4_1 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:888:2: rule__Viewpoint__NameAssignment_4_1
            {
            pushFollow(FOLLOW_rule__Viewpoint__NameAssignment_4_1_in_rule__Viewpoint__Group_4__1__Impl1719);
            rule__Viewpoint__NameAssignment_4_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getViewpointAccess().getNameAssignment_4_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Viewpoint__Group_4__1__Impl"


    // $ANTLR start "rule__Viewpoint__Group_5__0"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:902:1: rule__Viewpoint__Group_5__0 : rule__Viewpoint__Group_5__0__Impl rule__Viewpoint__Group_5__1 ;
    public final void rule__Viewpoint__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:906:1: ( rule__Viewpoint__Group_5__0__Impl rule__Viewpoint__Group_5__1 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:907:2: rule__Viewpoint__Group_5__0__Impl rule__Viewpoint__Group_5__1
            {
            pushFollow(FOLLOW_rule__Viewpoint__Group_5__0__Impl_in_rule__Viewpoint__Group_5__01753);
            rule__Viewpoint__Group_5__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Viewpoint__Group_5__1_in_rule__Viewpoint__Group_5__01756);
            rule__Viewpoint__Group_5__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Viewpoint__Group_5__0"


    // $ANTLR start "rule__Viewpoint__Group_5__0__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:914:1: rule__Viewpoint__Group_5__0__Impl : ( 'description:' ) ;
    public final void rule__Viewpoint__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:918:1: ( ( 'description:' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:919:1: ( 'description:' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:919:1: ( 'description:' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:920:1: 'description:'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getViewpointAccess().getDescriptionKeyword_5_0()); 
            }
            match(input,15,FOLLOW_15_in_rule__Viewpoint__Group_5__0__Impl1784); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getViewpointAccess().getDescriptionKeyword_5_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Viewpoint__Group_5__0__Impl"


    // $ANTLR start "rule__Viewpoint__Group_5__1"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:933:1: rule__Viewpoint__Group_5__1 : rule__Viewpoint__Group_5__1__Impl ;
    public final void rule__Viewpoint__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:937:1: ( rule__Viewpoint__Group_5__1__Impl )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:938:2: rule__Viewpoint__Group_5__1__Impl
            {
            pushFollow(FOLLOW_rule__Viewpoint__Group_5__1__Impl_in_rule__Viewpoint__Group_5__11815);
            rule__Viewpoint__Group_5__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Viewpoint__Group_5__1"


    // $ANTLR start "rule__Viewpoint__Group_5__1__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:944:1: rule__Viewpoint__Group_5__1__Impl : ( ( rule__Viewpoint__DescriptionAssignment_5_1 ) ) ;
    public final void rule__Viewpoint__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:948:1: ( ( ( rule__Viewpoint__DescriptionAssignment_5_1 ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:949:1: ( ( rule__Viewpoint__DescriptionAssignment_5_1 ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:949:1: ( ( rule__Viewpoint__DescriptionAssignment_5_1 ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:950:1: ( rule__Viewpoint__DescriptionAssignment_5_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getViewpointAccess().getDescriptionAssignment_5_1()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:951:1: ( rule__Viewpoint__DescriptionAssignment_5_1 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:951:2: rule__Viewpoint__DescriptionAssignment_5_1
            {
            pushFollow(FOLLOW_rule__Viewpoint__DescriptionAssignment_5_1_in_rule__Viewpoint__Group_5__1__Impl1842);
            rule__Viewpoint__DescriptionAssignment_5_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getViewpointAccess().getDescriptionAssignment_5_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Viewpoint__Group_5__1__Impl"


    // $ANTLR start "rule__Viewpoint__Group_6__0"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:965:1: rule__Viewpoint__Group_6__0 : rule__Viewpoint__Group_6__0__Impl rule__Viewpoint__Group_6__1 ;
    public final void rule__Viewpoint__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:969:1: ( rule__Viewpoint__Group_6__0__Impl rule__Viewpoint__Group_6__1 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:970:2: rule__Viewpoint__Group_6__0__Impl rule__Viewpoint__Group_6__1
            {
            pushFollow(FOLLOW_rule__Viewpoint__Group_6__0__Impl_in_rule__Viewpoint__Group_6__01876);
            rule__Viewpoint__Group_6__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Viewpoint__Group_6__1_in_rule__Viewpoint__Group_6__01879);
            rule__Viewpoint__Group_6__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Viewpoint__Group_6__0"


    // $ANTLR start "rule__Viewpoint__Group_6__0__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:977:1: rule__Viewpoint__Group_6__0__Impl : ( 'extends' ) ;
    public final void rule__Viewpoint__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:981:1: ( ( 'extends' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:982:1: ( 'extends' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:982:1: ( 'extends' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:983:1: 'extends'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getViewpointAccess().getExtendsKeyword_6_0()); 
            }
            match(input,16,FOLLOW_16_in_rule__Viewpoint__Group_6__0__Impl1907); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getViewpointAccess().getExtendsKeyword_6_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Viewpoint__Group_6__0__Impl"


    // $ANTLR start "rule__Viewpoint__Group_6__1"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:996:1: rule__Viewpoint__Group_6__1 : rule__Viewpoint__Group_6__1__Impl rule__Viewpoint__Group_6__2 ;
    public final void rule__Viewpoint__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1000:1: ( rule__Viewpoint__Group_6__1__Impl rule__Viewpoint__Group_6__2 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1001:2: rule__Viewpoint__Group_6__1__Impl rule__Viewpoint__Group_6__2
            {
            pushFollow(FOLLOW_rule__Viewpoint__Group_6__1__Impl_in_rule__Viewpoint__Group_6__11938);
            rule__Viewpoint__Group_6__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Viewpoint__Group_6__2_in_rule__Viewpoint__Group_6__11941);
            rule__Viewpoint__Group_6__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Viewpoint__Group_6__1"


    // $ANTLR start "rule__Viewpoint__Group_6__1__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1008:1: rule__Viewpoint__Group_6__1__Impl : ( ( rule__Viewpoint__ParentsAssignment_6_1 ) ) ;
    public final void rule__Viewpoint__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1012:1: ( ( ( rule__Viewpoint__ParentsAssignment_6_1 ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1013:1: ( ( rule__Viewpoint__ParentsAssignment_6_1 ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1013:1: ( ( rule__Viewpoint__ParentsAssignment_6_1 ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1014:1: ( rule__Viewpoint__ParentsAssignment_6_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getViewpointAccess().getParentsAssignment_6_1()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1015:1: ( rule__Viewpoint__ParentsAssignment_6_1 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1015:2: rule__Viewpoint__ParentsAssignment_6_1
            {
            pushFollow(FOLLOW_rule__Viewpoint__ParentsAssignment_6_1_in_rule__Viewpoint__Group_6__1__Impl1968);
            rule__Viewpoint__ParentsAssignment_6_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getViewpointAccess().getParentsAssignment_6_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Viewpoint__Group_6__1__Impl"


    // $ANTLR start "rule__Viewpoint__Group_6__2"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1025:1: rule__Viewpoint__Group_6__2 : rule__Viewpoint__Group_6__2__Impl ;
    public final void rule__Viewpoint__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1029:1: ( rule__Viewpoint__Group_6__2__Impl )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1030:2: rule__Viewpoint__Group_6__2__Impl
            {
            pushFollow(FOLLOW_rule__Viewpoint__Group_6__2__Impl_in_rule__Viewpoint__Group_6__21998);
            rule__Viewpoint__Group_6__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Viewpoint__Group_6__2"


    // $ANTLR start "rule__Viewpoint__Group_6__2__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1036:1: rule__Viewpoint__Group_6__2__Impl : ( ( rule__Viewpoint__Group_6_2__0 )* ) ;
    public final void rule__Viewpoint__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1040:1: ( ( ( rule__Viewpoint__Group_6_2__0 )* ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1041:1: ( ( rule__Viewpoint__Group_6_2__0 )* )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1041:1: ( ( rule__Viewpoint__Group_6_2__0 )* )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1042:1: ( rule__Viewpoint__Group_6_2__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getViewpointAccess().getGroup_6_2()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1043:1: ( rule__Viewpoint__Group_6_2__0 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==17) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1043:2: rule__Viewpoint__Group_6_2__0
            	    {
            	    pushFollow(FOLLOW_rule__Viewpoint__Group_6_2__0_in_rule__Viewpoint__Group_6__2__Impl2025);
            	    rule__Viewpoint__Group_6_2__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getViewpointAccess().getGroup_6_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Viewpoint__Group_6__2__Impl"


    // $ANTLR start "rule__Viewpoint__Group_6_2__0"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1059:1: rule__Viewpoint__Group_6_2__0 : rule__Viewpoint__Group_6_2__0__Impl rule__Viewpoint__Group_6_2__1 ;
    public final void rule__Viewpoint__Group_6_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1063:1: ( rule__Viewpoint__Group_6_2__0__Impl rule__Viewpoint__Group_6_2__1 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1064:2: rule__Viewpoint__Group_6_2__0__Impl rule__Viewpoint__Group_6_2__1
            {
            pushFollow(FOLLOW_rule__Viewpoint__Group_6_2__0__Impl_in_rule__Viewpoint__Group_6_2__02062);
            rule__Viewpoint__Group_6_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Viewpoint__Group_6_2__1_in_rule__Viewpoint__Group_6_2__02065);
            rule__Viewpoint__Group_6_2__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Viewpoint__Group_6_2__0"


    // $ANTLR start "rule__Viewpoint__Group_6_2__0__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1071:1: rule__Viewpoint__Group_6_2__0__Impl : ( ',' ) ;
    public final void rule__Viewpoint__Group_6_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1075:1: ( ( ',' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1076:1: ( ',' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1076:1: ( ',' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1077:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getViewpointAccess().getCommaKeyword_6_2_0()); 
            }
            match(input,17,FOLLOW_17_in_rule__Viewpoint__Group_6_2__0__Impl2093); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getViewpointAccess().getCommaKeyword_6_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Viewpoint__Group_6_2__0__Impl"


    // $ANTLR start "rule__Viewpoint__Group_6_2__1"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1090:1: rule__Viewpoint__Group_6_2__1 : rule__Viewpoint__Group_6_2__1__Impl ;
    public final void rule__Viewpoint__Group_6_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1094:1: ( rule__Viewpoint__Group_6_2__1__Impl )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1095:2: rule__Viewpoint__Group_6_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Viewpoint__Group_6_2__1__Impl_in_rule__Viewpoint__Group_6_2__12124);
            rule__Viewpoint__Group_6_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Viewpoint__Group_6_2__1"


    // $ANTLR start "rule__Viewpoint__Group_6_2__1__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1101:1: rule__Viewpoint__Group_6_2__1__Impl : ( ( rule__Viewpoint__ParentsAssignment_6_2_1 ) ) ;
    public final void rule__Viewpoint__Group_6_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1105:1: ( ( ( rule__Viewpoint__ParentsAssignment_6_2_1 ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1106:1: ( ( rule__Viewpoint__ParentsAssignment_6_2_1 ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1106:1: ( ( rule__Viewpoint__ParentsAssignment_6_2_1 ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1107:1: ( rule__Viewpoint__ParentsAssignment_6_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getViewpointAccess().getParentsAssignment_6_2_1()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1108:1: ( rule__Viewpoint__ParentsAssignment_6_2_1 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1108:2: rule__Viewpoint__ParentsAssignment_6_2_1
            {
            pushFollow(FOLLOW_rule__Viewpoint__ParentsAssignment_6_2_1_in_rule__Viewpoint__Group_6_2__1__Impl2151);
            rule__Viewpoint__ParentsAssignment_6_2_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getViewpointAccess().getParentsAssignment_6_2_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Viewpoint__Group_6_2__1__Impl"


    // $ANTLR start "rule__Viewpoint__Group_7__0"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1122:1: rule__Viewpoint__Group_7__0 : rule__Viewpoint__Group_7__0__Impl rule__Viewpoint__Group_7__1 ;
    public final void rule__Viewpoint__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1126:1: ( rule__Viewpoint__Group_7__0__Impl rule__Viewpoint__Group_7__1 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1127:2: rule__Viewpoint__Group_7__0__Impl rule__Viewpoint__Group_7__1
            {
            pushFollow(FOLLOW_rule__Viewpoint__Group_7__0__Impl_in_rule__Viewpoint__Group_7__02185);
            rule__Viewpoint__Group_7__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Viewpoint__Group_7__1_in_rule__Viewpoint__Group_7__02188);
            rule__Viewpoint__Group_7__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Viewpoint__Group_7__0"


    // $ANTLR start "rule__Viewpoint__Group_7__0__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1134:1: rule__Viewpoint__Group_7__0__Impl : ( 'aggregates' ) ;
    public final void rule__Viewpoint__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1138:1: ( ( 'aggregates' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1139:1: ( 'aggregates' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1139:1: ( 'aggregates' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1140:1: 'aggregates'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getViewpointAccess().getAggregatesKeyword_7_0()); 
            }
            match(input,18,FOLLOW_18_in_rule__Viewpoint__Group_7__0__Impl2216); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getViewpointAccess().getAggregatesKeyword_7_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Viewpoint__Group_7__0__Impl"


    // $ANTLR start "rule__Viewpoint__Group_7__1"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1153:1: rule__Viewpoint__Group_7__1 : rule__Viewpoint__Group_7__1__Impl rule__Viewpoint__Group_7__2 ;
    public final void rule__Viewpoint__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1157:1: ( rule__Viewpoint__Group_7__1__Impl rule__Viewpoint__Group_7__2 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1158:2: rule__Viewpoint__Group_7__1__Impl rule__Viewpoint__Group_7__2
            {
            pushFollow(FOLLOW_rule__Viewpoint__Group_7__1__Impl_in_rule__Viewpoint__Group_7__12247);
            rule__Viewpoint__Group_7__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Viewpoint__Group_7__2_in_rule__Viewpoint__Group_7__12250);
            rule__Viewpoint__Group_7__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Viewpoint__Group_7__1"


    // $ANTLR start "rule__Viewpoint__Group_7__1__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1165:1: rule__Viewpoint__Group_7__1__Impl : ( ( rule__Viewpoint__DependenciesAssignment_7_1 ) ) ;
    public final void rule__Viewpoint__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1169:1: ( ( ( rule__Viewpoint__DependenciesAssignment_7_1 ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1170:1: ( ( rule__Viewpoint__DependenciesAssignment_7_1 ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1170:1: ( ( rule__Viewpoint__DependenciesAssignment_7_1 ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1171:1: ( rule__Viewpoint__DependenciesAssignment_7_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getViewpointAccess().getDependenciesAssignment_7_1()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1172:1: ( rule__Viewpoint__DependenciesAssignment_7_1 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1172:2: rule__Viewpoint__DependenciesAssignment_7_1
            {
            pushFollow(FOLLOW_rule__Viewpoint__DependenciesAssignment_7_1_in_rule__Viewpoint__Group_7__1__Impl2277);
            rule__Viewpoint__DependenciesAssignment_7_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getViewpointAccess().getDependenciesAssignment_7_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Viewpoint__Group_7__1__Impl"


    // $ANTLR start "rule__Viewpoint__Group_7__2"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1182:1: rule__Viewpoint__Group_7__2 : rule__Viewpoint__Group_7__2__Impl ;
    public final void rule__Viewpoint__Group_7__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1186:1: ( rule__Viewpoint__Group_7__2__Impl )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1187:2: rule__Viewpoint__Group_7__2__Impl
            {
            pushFollow(FOLLOW_rule__Viewpoint__Group_7__2__Impl_in_rule__Viewpoint__Group_7__22307);
            rule__Viewpoint__Group_7__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Viewpoint__Group_7__2"


    // $ANTLR start "rule__Viewpoint__Group_7__2__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1193:1: rule__Viewpoint__Group_7__2__Impl : ( ( rule__Viewpoint__Group_7_2__0 )* ) ;
    public final void rule__Viewpoint__Group_7__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1197:1: ( ( ( rule__Viewpoint__Group_7_2__0 )* ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1198:1: ( ( rule__Viewpoint__Group_7_2__0 )* )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1198:1: ( ( rule__Viewpoint__Group_7_2__0 )* )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1199:1: ( rule__Viewpoint__Group_7_2__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getViewpointAccess().getGroup_7_2()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1200:1: ( rule__Viewpoint__Group_7_2__0 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==17) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1200:2: rule__Viewpoint__Group_7_2__0
            	    {
            	    pushFollow(FOLLOW_rule__Viewpoint__Group_7_2__0_in_rule__Viewpoint__Group_7__2__Impl2334);
            	    rule__Viewpoint__Group_7_2__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getViewpointAccess().getGroup_7_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Viewpoint__Group_7__2__Impl"


    // $ANTLR start "rule__Viewpoint__Group_7_2__0"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1216:1: rule__Viewpoint__Group_7_2__0 : rule__Viewpoint__Group_7_2__0__Impl rule__Viewpoint__Group_7_2__1 ;
    public final void rule__Viewpoint__Group_7_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1220:1: ( rule__Viewpoint__Group_7_2__0__Impl rule__Viewpoint__Group_7_2__1 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1221:2: rule__Viewpoint__Group_7_2__0__Impl rule__Viewpoint__Group_7_2__1
            {
            pushFollow(FOLLOW_rule__Viewpoint__Group_7_2__0__Impl_in_rule__Viewpoint__Group_7_2__02371);
            rule__Viewpoint__Group_7_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Viewpoint__Group_7_2__1_in_rule__Viewpoint__Group_7_2__02374);
            rule__Viewpoint__Group_7_2__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Viewpoint__Group_7_2__0"


    // $ANTLR start "rule__Viewpoint__Group_7_2__0__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1228:1: rule__Viewpoint__Group_7_2__0__Impl : ( ',' ) ;
    public final void rule__Viewpoint__Group_7_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1232:1: ( ( ',' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1233:1: ( ',' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1233:1: ( ',' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1234:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getViewpointAccess().getCommaKeyword_7_2_0()); 
            }
            match(input,17,FOLLOW_17_in_rule__Viewpoint__Group_7_2__0__Impl2402); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getViewpointAccess().getCommaKeyword_7_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Viewpoint__Group_7_2__0__Impl"


    // $ANTLR start "rule__Viewpoint__Group_7_2__1"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1247:1: rule__Viewpoint__Group_7_2__1 : rule__Viewpoint__Group_7_2__1__Impl ;
    public final void rule__Viewpoint__Group_7_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1251:1: ( rule__Viewpoint__Group_7_2__1__Impl )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1252:2: rule__Viewpoint__Group_7_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Viewpoint__Group_7_2__1__Impl_in_rule__Viewpoint__Group_7_2__12433);
            rule__Viewpoint__Group_7_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Viewpoint__Group_7_2__1"


    // $ANTLR start "rule__Viewpoint__Group_7_2__1__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1258:1: rule__Viewpoint__Group_7_2__1__Impl : ( ( rule__Viewpoint__DependenciesAssignment_7_2_1 ) ) ;
    public final void rule__Viewpoint__Group_7_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1262:1: ( ( ( rule__Viewpoint__DependenciesAssignment_7_2_1 ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1263:1: ( ( rule__Viewpoint__DependenciesAssignment_7_2_1 ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1263:1: ( ( rule__Viewpoint__DependenciesAssignment_7_2_1 ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1264:1: ( rule__Viewpoint__DependenciesAssignment_7_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getViewpointAccess().getDependenciesAssignment_7_2_1()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1265:1: ( rule__Viewpoint__DependenciesAssignment_7_2_1 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1265:2: rule__Viewpoint__DependenciesAssignment_7_2_1
            {
            pushFollow(FOLLOW_rule__Viewpoint__DependenciesAssignment_7_2_1_in_rule__Viewpoint__Group_7_2__1__Impl2460);
            rule__Viewpoint__DependenciesAssignment_7_2_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getViewpointAccess().getDependenciesAssignment_7_2_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Viewpoint__Group_7_2__1__Impl"


    // $ANTLR start "rule__Viewpoint__Group_8__0"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1279:1: rule__Viewpoint__Group_8__0 : rule__Viewpoint__Group_8__0__Impl rule__Viewpoint__Group_8__1 ;
    public final void rule__Viewpoint__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1283:1: ( rule__Viewpoint__Group_8__0__Impl rule__Viewpoint__Group_8__1 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1284:2: rule__Viewpoint__Group_8__0__Impl rule__Viewpoint__Group_8__1
            {
            pushFollow(FOLLOW_rule__Viewpoint__Group_8__0__Impl_in_rule__Viewpoint__Group_8__02494);
            rule__Viewpoint__Group_8__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Viewpoint__Group_8__1_in_rule__Viewpoint__Group_8__02497);
            rule__Viewpoint__Group_8__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Viewpoint__Group_8__0"


    // $ANTLR start "rule__Viewpoint__Group_8__0__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1291:1: rule__Viewpoint__Group_8__0__Impl : ( 'uses viewpoint' ) ;
    public final void rule__Viewpoint__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1295:1: ( ( 'uses viewpoint' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1296:1: ( 'uses viewpoint' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1296:1: ( 'uses viewpoint' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1297:1: 'uses viewpoint'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getViewpointAccess().getUsesViewpointKeyword_8_0()); 
            }
            match(input,19,FOLLOW_19_in_rule__Viewpoint__Group_8__0__Impl2525); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getViewpointAccess().getUsesViewpointKeyword_8_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Viewpoint__Group_8__0__Impl"


    // $ANTLR start "rule__Viewpoint__Group_8__1"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1310:1: rule__Viewpoint__Group_8__1 : rule__Viewpoint__Group_8__1__Impl rule__Viewpoint__Group_8__2 ;
    public final void rule__Viewpoint__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1314:1: ( rule__Viewpoint__Group_8__1__Impl rule__Viewpoint__Group_8__2 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1315:2: rule__Viewpoint__Group_8__1__Impl rule__Viewpoint__Group_8__2
            {
            pushFollow(FOLLOW_rule__Viewpoint__Group_8__1__Impl_in_rule__Viewpoint__Group_8__12556);
            rule__Viewpoint__Group_8__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Viewpoint__Group_8__2_in_rule__Viewpoint__Group_8__12559);
            rule__Viewpoint__Group_8__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Viewpoint__Group_8__1"


    // $ANTLR start "rule__Viewpoint__Group_8__1__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1322:1: rule__Viewpoint__Group_8__1__Impl : ( ( rule__Viewpoint__UseViewpointAssignment_8_1 ) ) ;
    public final void rule__Viewpoint__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1326:1: ( ( ( rule__Viewpoint__UseViewpointAssignment_8_1 ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1327:1: ( ( rule__Viewpoint__UseViewpointAssignment_8_1 ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1327:1: ( ( rule__Viewpoint__UseViewpointAssignment_8_1 ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1328:1: ( rule__Viewpoint__UseViewpointAssignment_8_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getViewpointAccess().getUseViewpointAssignment_8_1()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1329:1: ( rule__Viewpoint__UseViewpointAssignment_8_1 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1329:2: rule__Viewpoint__UseViewpointAssignment_8_1
            {
            pushFollow(FOLLOW_rule__Viewpoint__UseViewpointAssignment_8_1_in_rule__Viewpoint__Group_8__1__Impl2586);
            rule__Viewpoint__UseViewpointAssignment_8_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getViewpointAccess().getUseViewpointAssignment_8_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Viewpoint__Group_8__1__Impl"


    // $ANTLR start "rule__Viewpoint__Group_8__2"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1339:1: rule__Viewpoint__Group_8__2 : rule__Viewpoint__Group_8__2__Impl ;
    public final void rule__Viewpoint__Group_8__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1343:1: ( rule__Viewpoint__Group_8__2__Impl )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1344:2: rule__Viewpoint__Group_8__2__Impl
            {
            pushFollow(FOLLOW_rule__Viewpoint__Group_8__2__Impl_in_rule__Viewpoint__Group_8__22616);
            rule__Viewpoint__Group_8__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Viewpoint__Group_8__2"


    // $ANTLR start "rule__Viewpoint__Group_8__2__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1350:1: rule__Viewpoint__Group_8__2__Impl : ( ( rule__Viewpoint__Group_8_2__0 )* ) ;
    public final void rule__Viewpoint__Group_8__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1354:1: ( ( ( rule__Viewpoint__Group_8_2__0 )* ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1355:1: ( ( rule__Viewpoint__Group_8_2__0 )* )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1355:1: ( ( rule__Viewpoint__Group_8_2__0 )* )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1356:1: ( rule__Viewpoint__Group_8_2__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getViewpointAccess().getGroup_8_2()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1357:1: ( rule__Viewpoint__Group_8_2__0 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==17) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1357:2: rule__Viewpoint__Group_8_2__0
            	    {
            	    pushFollow(FOLLOW_rule__Viewpoint__Group_8_2__0_in_rule__Viewpoint__Group_8__2__Impl2643);
            	    rule__Viewpoint__Group_8_2__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getViewpointAccess().getGroup_8_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Viewpoint__Group_8__2__Impl"


    // $ANTLR start "rule__Viewpoint__Group_8_2__0"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1373:1: rule__Viewpoint__Group_8_2__0 : rule__Viewpoint__Group_8_2__0__Impl rule__Viewpoint__Group_8_2__1 ;
    public final void rule__Viewpoint__Group_8_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1377:1: ( rule__Viewpoint__Group_8_2__0__Impl rule__Viewpoint__Group_8_2__1 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1378:2: rule__Viewpoint__Group_8_2__0__Impl rule__Viewpoint__Group_8_2__1
            {
            pushFollow(FOLLOW_rule__Viewpoint__Group_8_2__0__Impl_in_rule__Viewpoint__Group_8_2__02680);
            rule__Viewpoint__Group_8_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Viewpoint__Group_8_2__1_in_rule__Viewpoint__Group_8_2__02683);
            rule__Viewpoint__Group_8_2__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Viewpoint__Group_8_2__0"


    // $ANTLR start "rule__Viewpoint__Group_8_2__0__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1385:1: rule__Viewpoint__Group_8_2__0__Impl : ( ',' ) ;
    public final void rule__Viewpoint__Group_8_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1389:1: ( ( ',' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1390:1: ( ',' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1390:1: ( ',' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1391:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getViewpointAccess().getCommaKeyword_8_2_0()); 
            }
            match(input,17,FOLLOW_17_in_rule__Viewpoint__Group_8_2__0__Impl2711); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getViewpointAccess().getCommaKeyword_8_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Viewpoint__Group_8_2__0__Impl"


    // $ANTLR start "rule__Viewpoint__Group_8_2__1"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1404:1: rule__Viewpoint__Group_8_2__1 : rule__Viewpoint__Group_8_2__1__Impl ;
    public final void rule__Viewpoint__Group_8_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1408:1: ( rule__Viewpoint__Group_8_2__1__Impl )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1409:2: rule__Viewpoint__Group_8_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Viewpoint__Group_8_2__1__Impl_in_rule__Viewpoint__Group_8_2__12742);
            rule__Viewpoint__Group_8_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Viewpoint__Group_8_2__1"


    // $ANTLR start "rule__Viewpoint__Group_8_2__1__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1415:1: rule__Viewpoint__Group_8_2__1__Impl : ( ( rule__Viewpoint__UseViewpointAssignment_8_2_1 ) ) ;
    public final void rule__Viewpoint__Group_8_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1419:1: ( ( ( rule__Viewpoint__UseViewpointAssignment_8_2_1 ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1420:1: ( ( rule__Viewpoint__UseViewpointAssignment_8_2_1 ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1420:1: ( ( rule__Viewpoint__UseViewpointAssignment_8_2_1 ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1421:1: ( rule__Viewpoint__UseViewpointAssignment_8_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getViewpointAccess().getUseViewpointAssignment_8_2_1()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1422:1: ( rule__Viewpoint__UseViewpointAssignment_8_2_1 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1422:2: rule__Viewpoint__UseViewpointAssignment_8_2_1
            {
            pushFollow(FOLLOW_rule__Viewpoint__UseViewpointAssignment_8_2_1_in_rule__Viewpoint__Group_8_2__1__Impl2769);
            rule__Viewpoint__UseViewpointAssignment_8_2_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getViewpointAccess().getUseViewpointAssignment_8_2_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Viewpoint__Group_8_2__1__Impl"


    // $ANTLR start "rule__Viewpoint__Group_9__0"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1436:1: rule__Viewpoint__Group_9__0 : rule__Viewpoint__Group_9__0__Impl rule__Viewpoint__Group_9__1 ;
    public final void rule__Viewpoint__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1440:1: ( rule__Viewpoint__Group_9__0__Impl rule__Viewpoint__Group_9__1 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1441:2: rule__Viewpoint__Group_9__0__Impl rule__Viewpoint__Group_9__1
            {
            pushFollow(FOLLOW_rule__Viewpoint__Group_9__0__Impl_in_rule__Viewpoint__Group_9__02803);
            rule__Viewpoint__Group_9__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Viewpoint__Group_9__1_in_rule__Viewpoint__Group_9__02806);
            rule__Viewpoint__Group_9__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Viewpoint__Group_9__0"


    // $ANTLR start "rule__Viewpoint__Group_9__0__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1448:1: rule__Viewpoint__Group_9__0__Impl : ( 'uses model' ) ;
    public final void rule__Viewpoint__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1452:1: ( ( 'uses model' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1453:1: ( 'uses model' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1453:1: ( 'uses model' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1454:1: 'uses model'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getViewpointAccess().getUsesModelKeyword_9_0()); 
            }
            match(input,20,FOLLOW_20_in_rule__Viewpoint__Group_9__0__Impl2834); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getViewpointAccess().getUsesModelKeyword_9_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Viewpoint__Group_9__0__Impl"


    // $ANTLR start "rule__Viewpoint__Group_9__1"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1467:1: rule__Viewpoint__Group_9__1 : rule__Viewpoint__Group_9__1__Impl rule__Viewpoint__Group_9__2 ;
    public final void rule__Viewpoint__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1471:1: ( rule__Viewpoint__Group_9__1__Impl rule__Viewpoint__Group_9__2 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1472:2: rule__Viewpoint__Group_9__1__Impl rule__Viewpoint__Group_9__2
            {
            pushFollow(FOLLOW_rule__Viewpoint__Group_9__1__Impl_in_rule__Viewpoint__Group_9__12865);
            rule__Viewpoint__Group_9__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Viewpoint__Group_9__2_in_rule__Viewpoint__Group_9__12868);
            rule__Viewpoint__Group_9__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Viewpoint__Group_9__1"


    // $ANTLR start "rule__Viewpoint__Group_9__1__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1479:1: rule__Viewpoint__Group_9__1__Impl : ( ( rule__Viewpoint__UseAnyEMFResourceAssignment_9_1 ) ) ;
    public final void rule__Viewpoint__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1483:1: ( ( ( rule__Viewpoint__UseAnyEMFResourceAssignment_9_1 ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1484:1: ( ( rule__Viewpoint__UseAnyEMFResourceAssignment_9_1 ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1484:1: ( ( rule__Viewpoint__UseAnyEMFResourceAssignment_9_1 ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1485:1: ( rule__Viewpoint__UseAnyEMFResourceAssignment_9_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getViewpointAccess().getUseAnyEMFResourceAssignment_9_1()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1486:1: ( rule__Viewpoint__UseAnyEMFResourceAssignment_9_1 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1486:2: rule__Viewpoint__UseAnyEMFResourceAssignment_9_1
            {
            pushFollow(FOLLOW_rule__Viewpoint__UseAnyEMFResourceAssignment_9_1_in_rule__Viewpoint__Group_9__1__Impl2895);
            rule__Viewpoint__UseAnyEMFResourceAssignment_9_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getViewpointAccess().getUseAnyEMFResourceAssignment_9_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Viewpoint__Group_9__1__Impl"


    // $ANTLR start "rule__Viewpoint__Group_9__2"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1496:1: rule__Viewpoint__Group_9__2 : rule__Viewpoint__Group_9__2__Impl ;
    public final void rule__Viewpoint__Group_9__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1500:1: ( rule__Viewpoint__Group_9__2__Impl )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1501:2: rule__Viewpoint__Group_9__2__Impl
            {
            pushFollow(FOLLOW_rule__Viewpoint__Group_9__2__Impl_in_rule__Viewpoint__Group_9__22925);
            rule__Viewpoint__Group_9__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Viewpoint__Group_9__2"


    // $ANTLR start "rule__Viewpoint__Group_9__2__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1507:1: rule__Viewpoint__Group_9__2__Impl : ( ( rule__Viewpoint__Group_9_2__0 )* ) ;
    public final void rule__Viewpoint__Group_9__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1511:1: ( ( ( rule__Viewpoint__Group_9_2__0 )* ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1512:1: ( ( rule__Viewpoint__Group_9_2__0 )* )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1512:1: ( ( rule__Viewpoint__Group_9_2__0 )* )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1513:1: ( rule__Viewpoint__Group_9_2__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getViewpointAccess().getGroup_9_2()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1514:1: ( rule__Viewpoint__Group_9_2__0 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==17) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1514:2: rule__Viewpoint__Group_9_2__0
            	    {
            	    pushFollow(FOLLOW_rule__Viewpoint__Group_9_2__0_in_rule__Viewpoint__Group_9__2__Impl2952);
            	    rule__Viewpoint__Group_9_2__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getViewpointAccess().getGroup_9_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Viewpoint__Group_9__2__Impl"


    // $ANTLR start "rule__Viewpoint__Group_9_2__0"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1530:1: rule__Viewpoint__Group_9_2__0 : rule__Viewpoint__Group_9_2__0__Impl rule__Viewpoint__Group_9_2__1 ;
    public final void rule__Viewpoint__Group_9_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1534:1: ( rule__Viewpoint__Group_9_2__0__Impl rule__Viewpoint__Group_9_2__1 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1535:2: rule__Viewpoint__Group_9_2__0__Impl rule__Viewpoint__Group_9_2__1
            {
            pushFollow(FOLLOW_rule__Viewpoint__Group_9_2__0__Impl_in_rule__Viewpoint__Group_9_2__02989);
            rule__Viewpoint__Group_9_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Viewpoint__Group_9_2__1_in_rule__Viewpoint__Group_9_2__02992);
            rule__Viewpoint__Group_9_2__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Viewpoint__Group_9_2__0"


    // $ANTLR start "rule__Viewpoint__Group_9_2__0__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1542:1: rule__Viewpoint__Group_9_2__0__Impl : ( ',' ) ;
    public final void rule__Viewpoint__Group_9_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1546:1: ( ( ',' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1547:1: ( ',' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1547:1: ( ',' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1548:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getViewpointAccess().getCommaKeyword_9_2_0()); 
            }
            match(input,17,FOLLOW_17_in_rule__Viewpoint__Group_9_2__0__Impl3020); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getViewpointAccess().getCommaKeyword_9_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Viewpoint__Group_9_2__0__Impl"


    // $ANTLR start "rule__Viewpoint__Group_9_2__1"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1561:1: rule__Viewpoint__Group_9_2__1 : rule__Viewpoint__Group_9_2__1__Impl ;
    public final void rule__Viewpoint__Group_9_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1565:1: ( rule__Viewpoint__Group_9_2__1__Impl )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1566:2: rule__Viewpoint__Group_9_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Viewpoint__Group_9_2__1__Impl_in_rule__Viewpoint__Group_9_2__13051);
            rule__Viewpoint__Group_9_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Viewpoint__Group_9_2__1"


    // $ANTLR start "rule__Viewpoint__Group_9_2__1__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1572:1: rule__Viewpoint__Group_9_2__1__Impl : ( ( rule__Viewpoint__UseAnyEMFResourceAssignment_9_2_1 ) ) ;
    public final void rule__Viewpoint__Group_9_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1576:1: ( ( ( rule__Viewpoint__UseAnyEMFResourceAssignment_9_2_1 ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1577:1: ( ( rule__Viewpoint__UseAnyEMFResourceAssignment_9_2_1 ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1577:1: ( ( rule__Viewpoint__UseAnyEMFResourceAssignment_9_2_1 ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1578:1: ( rule__Viewpoint__UseAnyEMFResourceAssignment_9_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getViewpointAccess().getUseAnyEMFResourceAssignment_9_2_1()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1579:1: ( rule__Viewpoint__UseAnyEMFResourceAssignment_9_2_1 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1579:2: rule__Viewpoint__UseAnyEMFResourceAssignment_9_2_1
            {
            pushFollow(FOLLOW_rule__Viewpoint__UseAnyEMFResourceAssignment_9_2_1_in_rule__Viewpoint__Group_9_2__1__Impl3078);
            rule__Viewpoint__UseAnyEMFResourceAssignment_9_2_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getViewpointAccess().getUseAnyEMFResourceAssignment_9_2_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Viewpoint__Group_9_2__1__Impl"


    // $ANTLR start "rule__Viewpoint__Group_10__0"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1593:1: rule__Viewpoint__Group_10__0 : rule__Viewpoint__Group_10__0__Impl rule__Viewpoint__Group_10__1 ;
    public final void rule__Viewpoint__Group_10__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1597:1: ( rule__Viewpoint__Group_10__0__Impl rule__Viewpoint__Group_10__1 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1598:2: rule__Viewpoint__Group_10__0__Impl rule__Viewpoint__Group_10__1
            {
            pushFollow(FOLLOW_rule__Viewpoint__Group_10__0__Impl_in_rule__Viewpoint__Group_10__03112);
            rule__Viewpoint__Group_10__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Viewpoint__Group_10__1_in_rule__Viewpoint__Group_10__03115);
            rule__Viewpoint__Group_10__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Viewpoint__Group_10__0"


    // $ANTLR start "rule__Viewpoint__Group_10__0__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1605:1: rule__Viewpoint__Group_10__0__Impl : ( 'uses diagram' ) ;
    public final void rule__Viewpoint__Group_10__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1609:1: ( ( 'uses diagram' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1610:1: ( 'uses diagram' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1610:1: ( 'uses diagram' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1611:1: 'uses diagram'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getViewpointAccess().getUsesDiagramKeyword_10_0()); 
            }
            match(input,21,FOLLOW_21_in_rule__Viewpoint__Group_10__0__Impl3143); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getViewpointAccess().getUsesDiagramKeyword_10_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Viewpoint__Group_10__0__Impl"


    // $ANTLR start "rule__Viewpoint__Group_10__1"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1624:1: rule__Viewpoint__Group_10__1 : rule__Viewpoint__Group_10__1__Impl rule__Viewpoint__Group_10__2 ;
    public final void rule__Viewpoint__Group_10__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1628:1: ( rule__Viewpoint__Group_10__1__Impl rule__Viewpoint__Group_10__2 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1629:2: rule__Viewpoint__Group_10__1__Impl rule__Viewpoint__Group_10__2
            {
            pushFollow(FOLLOW_rule__Viewpoint__Group_10__1__Impl_in_rule__Viewpoint__Group_10__13174);
            rule__Viewpoint__Group_10__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Viewpoint__Group_10__2_in_rule__Viewpoint__Group_10__13177);
            rule__Viewpoint__Group_10__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Viewpoint__Group_10__1"


    // $ANTLR start "rule__Viewpoint__Group_10__1__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1636:1: rule__Viewpoint__Group_10__1__Impl : ( ( rule__Viewpoint__UseDiagramResourceAssignment_10_1 ) ) ;
    public final void rule__Viewpoint__Group_10__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1640:1: ( ( ( rule__Viewpoint__UseDiagramResourceAssignment_10_1 ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1641:1: ( ( rule__Viewpoint__UseDiagramResourceAssignment_10_1 ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1641:1: ( ( rule__Viewpoint__UseDiagramResourceAssignment_10_1 ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1642:1: ( rule__Viewpoint__UseDiagramResourceAssignment_10_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getViewpointAccess().getUseDiagramResourceAssignment_10_1()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1643:1: ( rule__Viewpoint__UseDiagramResourceAssignment_10_1 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1643:2: rule__Viewpoint__UseDiagramResourceAssignment_10_1
            {
            pushFollow(FOLLOW_rule__Viewpoint__UseDiagramResourceAssignment_10_1_in_rule__Viewpoint__Group_10__1__Impl3204);
            rule__Viewpoint__UseDiagramResourceAssignment_10_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getViewpointAccess().getUseDiagramResourceAssignment_10_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Viewpoint__Group_10__1__Impl"


    // $ANTLR start "rule__Viewpoint__Group_10__2"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1653:1: rule__Viewpoint__Group_10__2 : rule__Viewpoint__Group_10__2__Impl ;
    public final void rule__Viewpoint__Group_10__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1657:1: ( rule__Viewpoint__Group_10__2__Impl )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1658:2: rule__Viewpoint__Group_10__2__Impl
            {
            pushFollow(FOLLOW_rule__Viewpoint__Group_10__2__Impl_in_rule__Viewpoint__Group_10__23234);
            rule__Viewpoint__Group_10__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Viewpoint__Group_10__2"


    // $ANTLR start "rule__Viewpoint__Group_10__2__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1664:1: rule__Viewpoint__Group_10__2__Impl : ( ( rule__Viewpoint__Group_10_2__0 )* ) ;
    public final void rule__Viewpoint__Group_10__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1668:1: ( ( ( rule__Viewpoint__Group_10_2__0 )* ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1669:1: ( ( rule__Viewpoint__Group_10_2__0 )* )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1669:1: ( ( rule__Viewpoint__Group_10_2__0 )* )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1670:1: ( rule__Viewpoint__Group_10_2__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getViewpointAccess().getGroup_10_2()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1671:1: ( rule__Viewpoint__Group_10_2__0 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==17) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1671:2: rule__Viewpoint__Group_10_2__0
            	    {
            	    pushFollow(FOLLOW_rule__Viewpoint__Group_10_2__0_in_rule__Viewpoint__Group_10__2__Impl3261);
            	    rule__Viewpoint__Group_10_2__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getViewpointAccess().getGroup_10_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Viewpoint__Group_10__2__Impl"


    // $ANTLR start "rule__Viewpoint__Group_10_2__0"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1687:1: rule__Viewpoint__Group_10_2__0 : rule__Viewpoint__Group_10_2__0__Impl rule__Viewpoint__Group_10_2__1 ;
    public final void rule__Viewpoint__Group_10_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1691:1: ( rule__Viewpoint__Group_10_2__0__Impl rule__Viewpoint__Group_10_2__1 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1692:2: rule__Viewpoint__Group_10_2__0__Impl rule__Viewpoint__Group_10_2__1
            {
            pushFollow(FOLLOW_rule__Viewpoint__Group_10_2__0__Impl_in_rule__Viewpoint__Group_10_2__03298);
            rule__Viewpoint__Group_10_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Viewpoint__Group_10_2__1_in_rule__Viewpoint__Group_10_2__03301);
            rule__Viewpoint__Group_10_2__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Viewpoint__Group_10_2__0"


    // $ANTLR start "rule__Viewpoint__Group_10_2__0__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1699:1: rule__Viewpoint__Group_10_2__0__Impl : ( ',' ) ;
    public final void rule__Viewpoint__Group_10_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1703:1: ( ( ',' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1704:1: ( ',' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1704:1: ( ',' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1705:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getViewpointAccess().getCommaKeyword_10_2_0()); 
            }
            match(input,17,FOLLOW_17_in_rule__Viewpoint__Group_10_2__0__Impl3329); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getViewpointAccess().getCommaKeyword_10_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Viewpoint__Group_10_2__0__Impl"


    // $ANTLR start "rule__Viewpoint__Group_10_2__1"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1718:1: rule__Viewpoint__Group_10_2__1 : rule__Viewpoint__Group_10_2__1__Impl ;
    public final void rule__Viewpoint__Group_10_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1722:1: ( rule__Viewpoint__Group_10_2__1__Impl )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1723:2: rule__Viewpoint__Group_10_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Viewpoint__Group_10_2__1__Impl_in_rule__Viewpoint__Group_10_2__13360);
            rule__Viewpoint__Group_10_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Viewpoint__Group_10_2__1"


    // $ANTLR start "rule__Viewpoint__Group_10_2__1__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1729:1: rule__Viewpoint__Group_10_2__1__Impl : ( ( rule__Viewpoint__UseDiagramResourceAssignment_10_2_1 ) ) ;
    public final void rule__Viewpoint__Group_10_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1733:1: ( ( ( rule__Viewpoint__UseDiagramResourceAssignment_10_2_1 ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1734:1: ( ( rule__Viewpoint__UseDiagramResourceAssignment_10_2_1 ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1734:1: ( ( rule__Viewpoint__UseDiagramResourceAssignment_10_2_1 ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1735:1: ( rule__Viewpoint__UseDiagramResourceAssignment_10_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getViewpointAccess().getUseDiagramResourceAssignment_10_2_1()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1736:1: ( rule__Viewpoint__UseDiagramResourceAssignment_10_2_1 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1736:2: rule__Viewpoint__UseDiagramResourceAssignment_10_2_1
            {
            pushFollow(FOLLOW_rule__Viewpoint__UseDiagramResourceAssignment_10_2_1_in_rule__Viewpoint__Group_10_2__1__Impl3387);
            rule__Viewpoint__UseDiagramResourceAssignment_10_2_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getViewpointAccess().getUseDiagramResourceAssignment_10_2_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Viewpoint__Group_10_2__1__Impl"


    // $ANTLR start "rule__Viewpoint__Group_11__0"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1750:1: rule__Viewpoint__Group_11__0 : rule__Viewpoint__Group_11__0__Impl rule__Viewpoint__Group_11__1 ;
    public final void rule__Viewpoint__Group_11__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1754:1: ( rule__Viewpoint__Group_11__0__Impl rule__Viewpoint__Group_11__1 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1755:2: rule__Viewpoint__Group_11__0__Impl rule__Viewpoint__Group_11__1
            {
            pushFollow(FOLLOW_rule__Viewpoint__Group_11__0__Impl_in_rule__Viewpoint__Group_11__03421);
            rule__Viewpoint__Group_11__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Viewpoint__Group_11__1_in_rule__Viewpoint__Group_11__03424);
            rule__Viewpoint__Group_11__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Viewpoint__Group_11__0"


    // $ANTLR start "rule__Viewpoint__Group_11__0__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1762:1: rule__Viewpoint__Group_11__0__Impl : ( 'uses workspace' ) ;
    public final void rule__Viewpoint__Group_11__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1766:1: ( ( 'uses workspace' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1767:1: ( 'uses workspace' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1767:1: ( 'uses workspace' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1768:1: 'uses workspace'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getViewpointAccess().getUsesWorkspaceKeyword_11_0()); 
            }
            match(input,22,FOLLOW_22_in_rule__Viewpoint__Group_11__0__Impl3452); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getViewpointAccess().getUsesWorkspaceKeyword_11_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Viewpoint__Group_11__0__Impl"


    // $ANTLR start "rule__Viewpoint__Group_11__1"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1781:1: rule__Viewpoint__Group_11__1 : rule__Viewpoint__Group_11__1__Impl rule__Viewpoint__Group_11__2 ;
    public final void rule__Viewpoint__Group_11__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1785:1: ( rule__Viewpoint__Group_11__1__Impl rule__Viewpoint__Group_11__2 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1786:2: rule__Viewpoint__Group_11__1__Impl rule__Viewpoint__Group_11__2
            {
            pushFollow(FOLLOW_rule__Viewpoint__Group_11__1__Impl_in_rule__Viewpoint__Group_11__13483);
            rule__Viewpoint__Group_11__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Viewpoint__Group_11__2_in_rule__Viewpoint__Group_11__13486);
            rule__Viewpoint__Group_11__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Viewpoint__Group_11__1"


    // $ANTLR start "rule__Viewpoint__Group_11__1__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1793:1: rule__Viewpoint__Group_11__1__Impl : ( ( rule__Viewpoint__UseWorkspaceResourceAssignment_11_1 ) ) ;
    public final void rule__Viewpoint__Group_11__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1797:1: ( ( ( rule__Viewpoint__UseWorkspaceResourceAssignment_11_1 ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1798:1: ( ( rule__Viewpoint__UseWorkspaceResourceAssignment_11_1 ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1798:1: ( ( rule__Viewpoint__UseWorkspaceResourceAssignment_11_1 ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1799:1: ( rule__Viewpoint__UseWorkspaceResourceAssignment_11_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getViewpointAccess().getUseWorkspaceResourceAssignment_11_1()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1800:1: ( rule__Viewpoint__UseWorkspaceResourceAssignment_11_1 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1800:2: rule__Viewpoint__UseWorkspaceResourceAssignment_11_1
            {
            pushFollow(FOLLOW_rule__Viewpoint__UseWorkspaceResourceAssignment_11_1_in_rule__Viewpoint__Group_11__1__Impl3513);
            rule__Viewpoint__UseWorkspaceResourceAssignment_11_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getViewpointAccess().getUseWorkspaceResourceAssignment_11_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Viewpoint__Group_11__1__Impl"


    // $ANTLR start "rule__Viewpoint__Group_11__2"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1810:1: rule__Viewpoint__Group_11__2 : rule__Viewpoint__Group_11__2__Impl ;
    public final void rule__Viewpoint__Group_11__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1814:1: ( rule__Viewpoint__Group_11__2__Impl )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1815:2: rule__Viewpoint__Group_11__2__Impl
            {
            pushFollow(FOLLOW_rule__Viewpoint__Group_11__2__Impl_in_rule__Viewpoint__Group_11__23543);
            rule__Viewpoint__Group_11__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Viewpoint__Group_11__2"


    // $ANTLR start "rule__Viewpoint__Group_11__2__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1821:1: rule__Viewpoint__Group_11__2__Impl : ( ( rule__Viewpoint__Group_11_2__0 )* ) ;
    public final void rule__Viewpoint__Group_11__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1825:1: ( ( ( rule__Viewpoint__Group_11_2__0 )* ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1826:1: ( ( rule__Viewpoint__Group_11_2__0 )* )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1826:1: ( ( rule__Viewpoint__Group_11_2__0 )* )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1827:1: ( rule__Viewpoint__Group_11_2__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getViewpointAccess().getGroup_11_2()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1828:1: ( rule__Viewpoint__Group_11_2__0 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==17) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1828:2: rule__Viewpoint__Group_11_2__0
            	    {
            	    pushFollow(FOLLOW_rule__Viewpoint__Group_11_2__0_in_rule__Viewpoint__Group_11__2__Impl3570);
            	    rule__Viewpoint__Group_11_2__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getViewpointAccess().getGroup_11_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Viewpoint__Group_11__2__Impl"


    // $ANTLR start "rule__Viewpoint__Group_11_2__0"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1844:1: rule__Viewpoint__Group_11_2__0 : rule__Viewpoint__Group_11_2__0__Impl rule__Viewpoint__Group_11_2__1 ;
    public final void rule__Viewpoint__Group_11_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1848:1: ( rule__Viewpoint__Group_11_2__0__Impl rule__Viewpoint__Group_11_2__1 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1849:2: rule__Viewpoint__Group_11_2__0__Impl rule__Viewpoint__Group_11_2__1
            {
            pushFollow(FOLLOW_rule__Viewpoint__Group_11_2__0__Impl_in_rule__Viewpoint__Group_11_2__03607);
            rule__Viewpoint__Group_11_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Viewpoint__Group_11_2__1_in_rule__Viewpoint__Group_11_2__03610);
            rule__Viewpoint__Group_11_2__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Viewpoint__Group_11_2__0"


    // $ANTLR start "rule__Viewpoint__Group_11_2__0__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1856:1: rule__Viewpoint__Group_11_2__0__Impl : ( ',' ) ;
    public final void rule__Viewpoint__Group_11_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1860:1: ( ( ',' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1861:1: ( ',' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1861:1: ( ',' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1862:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getViewpointAccess().getCommaKeyword_11_2_0()); 
            }
            match(input,17,FOLLOW_17_in_rule__Viewpoint__Group_11_2__0__Impl3638); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getViewpointAccess().getCommaKeyword_11_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Viewpoint__Group_11_2__0__Impl"


    // $ANTLR start "rule__Viewpoint__Group_11_2__1"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1875:1: rule__Viewpoint__Group_11_2__1 : rule__Viewpoint__Group_11_2__1__Impl ;
    public final void rule__Viewpoint__Group_11_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1879:1: ( rule__Viewpoint__Group_11_2__1__Impl )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1880:2: rule__Viewpoint__Group_11_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Viewpoint__Group_11_2__1__Impl_in_rule__Viewpoint__Group_11_2__13669);
            rule__Viewpoint__Group_11_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Viewpoint__Group_11_2__1"


    // $ANTLR start "rule__Viewpoint__Group_11_2__1__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1886:1: rule__Viewpoint__Group_11_2__1__Impl : ( ( rule__Viewpoint__UseWorkspaceResourceAssignment_11_2_1 ) ) ;
    public final void rule__Viewpoint__Group_11_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1890:1: ( ( ( rule__Viewpoint__UseWorkspaceResourceAssignment_11_2_1 ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1891:1: ( ( rule__Viewpoint__UseWorkspaceResourceAssignment_11_2_1 ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1891:1: ( ( rule__Viewpoint__UseWorkspaceResourceAssignment_11_2_1 ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1892:1: ( rule__Viewpoint__UseWorkspaceResourceAssignment_11_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getViewpointAccess().getUseWorkspaceResourceAssignment_11_2_1()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1893:1: ( rule__Viewpoint__UseWorkspaceResourceAssignment_11_2_1 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1893:2: rule__Viewpoint__UseWorkspaceResourceAssignment_11_2_1
            {
            pushFollow(FOLLOW_rule__Viewpoint__UseWorkspaceResourceAssignment_11_2_1_in_rule__Viewpoint__Group_11_2__1__Impl3696);
            rule__Viewpoint__UseWorkspaceResourceAssignment_11_2_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getViewpointAccess().getUseWorkspaceResourceAssignment_11_2_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Viewpoint__Group_11_2__1__Impl"


    // $ANTLR start "rule__Viewpoint__Group_12__0"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1907:1: rule__Viewpoint__Group_12__0 : rule__Viewpoint__Group_12__0__Impl rule__Viewpoint__Group_12__1 ;
    public final void rule__Viewpoint__Group_12__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1911:1: ( rule__Viewpoint__Group_12__0__Impl rule__Viewpoint__Group_12__1 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1912:2: rule__Viewpoint__Group_12__0__Impl rule__Viewpoint__Group_12__1
            {
            pushFollow(FOLLOW_rule__Viewpoint__Group_12__0__Impl_in_rule__Viewpoint__Group_12__03730);
            rule__Viewpoint__Group_12__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Viewpoint__Group_12__1_in_rule__Viewpoint__Group_12__03733);
            rule__Viewpoint__Group_12__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Viewpoint__Group_12__0"


    // $ANTLR start "rule__Viewpoint__Group_12__0__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1919:1: rule__Viewpoint__Group_12__0__Impl : ( 'uses filesystem' ) ;
    public final void rule__Viewpoint__Group_12__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1923:1: ( ( 'uses filesystem' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1924:1: ( 'uses filesystem' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1924:1: ( 'uses filesystem' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1925:1: 'uses filesystem'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getViewpointAccess().getUsesFilesystemKeyword_12_0()); 
            }
            match(input,23,FOLLOW_23_in_rule__Viewpoint__Group_12__0__Impl3761); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getViewpointAccess().getUsesFilesystemKeyword_12_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Viewpoint__Group_12__0__Impl"


    // $ANTLR start "rule__Viewpoint__Group_12__1"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1938:1: rule__Viewpoint__Group_12__1 : rule__Viewpoint__Group_12__1__Impl rule__Viewpoint__Group_12__2 ;
    public final void rule__Viewpoint__Group_12__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1942:1: ( rule__Viewpoint__Group_12__1__Impl rule__Viewpoint__Group_12__2 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1943:2: rule__Viewpoint__Group_12__1__Impl rule__Viewpoint__Group_12__2
            {
            pushFollow(FOLLOW_rule__Viewpoint__Group_12__1__Impl_in_rule__Viewpoint__Group_12__13792);
            rule__Viewpoint__Group_12__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Viewpoint__Group_12__2_in_rule__Viewpoint__Group_12__13795);
            rule__Viewpoint__Group_12__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Viewpoint__Group_12__1"


    // $ANTLR start "rule__Viewpoint__Group_12__1__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1950:1: rule__Viewpoint__Group_12__1__Impl : ( ( rule__Viewpoint__UseFSResourceAssignment_12_1 ) ) ;
    public final void rule__Viewpoint__Group_12__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1954:1: ( ( ( rule__Viewpoint__UseFSResourceAssignment_12_1 ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1955:1: ( ( rule__Viewpoint__UseFSResourceAssignment_12_1 ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1955:1: ( ( rule__Viewpoint__UseFSResourceAssignment_12_1 ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1956:1: ( rule__Viewpoint__UseFSResourceAssignment_12_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getViewpointAccess().getUseFSResourceAssignment_12_1()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1957:1: ( rule__Viewpoint__UseFSResourceAssignment_12_1 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1957:2: rule__Viewpoint__UseFSResourceAssignment_12_1
            {
            pushFollow(FOLLOW_rule__Viewpoint__UseFSResourceAssignment_12_1_in_rule__Viewpoint__Group_12__1__Impl3822);
            rule__Viewpoint__UseFSResourceAssignment_12_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getViewpointAccess().getUseFSResourceAssignment_12_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Viewpoint__Group_12__1__Impl"


    // $ANTLR start "rule__Viewpoint__Group_12__2"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1967:1: rule__Viewpoint__Group_12__2 : rule__Viewpoint__Group_12__2__Impl ;
    public final void rule__Viewpoint__Group_12__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1971:1: ( rule__Viewpoint__Group_12__2__Impl )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1972:2: rule__Viewpoint__Group_12__2__Impl
            {
            pushFollow(FOLLOW_rule__Viewpoint__Group_12__2__Impl_in_rule__Viewpoint__Group_12__23852);
            rule__Viewpoint__Group_12__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Viewpoint__Group_12__2"


    // $ANTLR start "rule__Viewpoint__Group_12__2__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1978:1: rule__Viewpoint__Group_12__2__Impl : ( ( rule__Viewpoint__Group_12_2__0 )* ) ;
    public final void rule__Viewpoint__Group_12__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1982:1: ( ( ( rule__Viewpoint__Group_12_2__0 )* ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1983:1: ( ( rule__Viewpoint__Group_12_2__0 )* )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1983:1: ( ( rule__Viewpoint__Group_12_2__0 )* )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1984:1: ( rule__Viewpoint__Group_12_2__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getViewpointAccess().getGroup_12_2()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1985:1: ( rule__Viewpoint__Group_12_2__0 )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==17) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:1985:2: rule__Viewpoint__Group_12_2__0
            	    {
            	    pushFollow(FOLLOW_rule__Viewpoint__Group_12_2__0_in_rule__Viewpoint__Group_12__2__Impl3879);
            	    rule__Viewpoint__Group_12_2__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getViewpointAccess().getGroup_12_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Viewpoint__Group_12__2__Impl"


    // $ANTLR start "rule__Viewpoint__Group_12_2__0"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2001:1: rule__Viewpoint__Group_12_2__0 : rule__Viewpoint__Group_12_2__0__Impl rule__Viewpoint__Group_12_2__1 ;
    public final void rule__Viewpoint__Group_12_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2005:1: ( rule__Viewpoint__Group_12_2__0__Impl rule__Viewpoint__Group_12_2__1 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2006:2: rule__Viewpoint__Group_12_2__0__Impl rule__Viewpoint__Group_12_2__1
            {
            pushFollow(FOLLOW_rule__Viewpoint__Group_12_2__0__Impl_in_rule__Viewpoint__Group_12_2__03916);
            rule__Viewpoint__Group_12_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Viewpoint__Group_12_2__1_in_rule__Viewpoint__Group_12_2__03919);
            rule__Viewpoint__Group_12_2__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Viewpoint__Group_12_2__0"


    // $ANTLR start "rule__Viewpoint__Group_12_2__0__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2013:1: rule__Viewpoint__Group_12_2__0__Impl : ( ',' ) ;
    public final void rule__Viewpoint__Group_12_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2017:1: ( ( ',' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2018:1: ( ',' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2018:1: ( ',' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2019:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getViewpointAccess().getCommaKeyword_12_2_0()); 
            }
            match(input,17,FOLLOW_17_in_rule__Viewpoint__Group_12_2__0__Impl3947); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getViewpointAccess().getCommaKeyword_12_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Viewpoint__Group_12_2__0__Impl"


    // $ANTLR start "rule__Viewpoint__Group_12_2__1"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2032:1: rule__Viewpoint__Group_12_2__1 : rule__Viewpoint__Group_12_2__1__Impl ;
    public final void rule__Viewpoint__Group_12_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2036:1: ( rule__Viewpoint__Group_12_2__1__Impl )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2037:2: rule__Viewpoint__Group_12_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Viewpoint__Group_12_2__1__Impl_in_rule__Viewpoint__Group_12_2__13978);
            rule__Viewpoint__Group_12_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Viewpoint__Group_12_2__1"


    // $ANTLR start "rule__Viewpoint__Group_12_2__1__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2043:1: rule__Viewpoint__Group_12_2__1__Impl : ( ( rule__Viewpoint__UseFSResourceAssignment_12_2_1 ) ) ;
    public final void rule__Viewpoint__Group_12_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2047:1: ( ( ( rule__Viewpoint__UseFSResourceAssignment_12_2_1 ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2048:1: ( ( rule__Viewpoint__UseFSResourceAssignment_12_2_1 ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2048:1: ( ( rule__Viewpoint__UseFSResourceAssignment_12_2_1 ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2049:1: ( rule__Viewpoint__UseFSResourceAssignment_12_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getViewpointAccess().getUseFSResourceAssignment_12_2_1()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2050:1: ( rule__Viewpoint__UseFSResourceAssignment_12_2_1 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2050:2: rule__Viewpoint__UseFSResourceAssignment_12_2_1
            {
            pushFollow(FOLLOW_rule__Viewpoint__UseFSResourceAssignment_12_2_1_in_rule__Viewpoint__Group_12_2__1__Impl4005);
            rule__Viewpoint__UseFSResourceAssignment_12_2_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getViewpointAccess().getUseFSResourceAssignment_12_2_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Viewpoint__Group_12_2__1__Impl"


    // $ANTLR start "rule__Viewpoint__Group_13__0"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2064:1: rule__Viewpoint__Group_13__0 : rule__Viewpoint__Group_13__0__Impl rule__Viewpoint__Group_13__1 ;
    public final void rule__Viewpoint__Group_13__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2068:1: ( rule__Viewpoint__Group_13__0__Impl rule__Viewpoint__Group_13__1 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2069:2: rule__Viewpoint__Group_13__0__Impl rule__Viewpoint__Group_13__1
            {
            pushFollow(FOLLOW_rule__Viewpoint__Group_13__0__Impl_in_rule__Viewpoint__Group_13__04039);
            rule__Viewpoint__Group_13__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Viewpoint__Group_13__1_in_rule__Viewpoint__Group_13__04042);
            rule__Viewpoint__Group_13__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Viewpoint__Group_13__0"


    // $ANTLR start "rule__Viewpoint__Group_13__0__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2076:1: rule__Viewpoint__Group_13__0__Impl : ( 'Data' ) ;
    public final void rule__Viewpoint__Group_13__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2080:1: ( ( 'Data' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2081:1: ( 'Data' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2081:1: ( 'Data' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2082:1: 'Data'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getViewpointAccess().getDataKeyword_13_0()); 
            }
            match(input,24,FOLLOW_24_in_rule__Viewpoint__Group_13__0__Impl4070); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getViewpointAccess().getDataKeyword_13_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Viewpoint__Group_13__0__Impl"


    // $ANTLR start "rule__Viewpoint__Group_13__1"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2095:1: rule__Viewpoint__Group_13__1 : rule__Viewpoint__Group_13__1__Impl ;
    public final void rule__Viewpoint__Group_13__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2099:1: ( rule__Viewpoint__Group_13__1__Impl )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2100:2: rule__Viewpoint__Group_13__1__Impl
            {
            pushFollow(FOLLOW_rule__Viewpoint__Group_13__1__Impl_in_rule__Viewpoint__Group_13__14101);
            rule__Viewpoint__Group_13__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Viewpoint__Group_13__1"


    // $ANTLR start "rule__Viewpoint__Group_13__1__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2106:1: rule__Viewpoint__Group_13__1__Impl : ( ( rule__Viewpoint__VP_DataAssignment_13_1 ) ) ;
    public final void rule__Viewpoint__Group_13__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2110:1: ( ( ( rule__Viewpoint__VP_DataAssignment_13_1 ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2111:1: ( ( rule__Viewpoint__VP_DataAssignment_13_1 ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2111:1: ( ( rule__Viewpoint__VP_DataAssignment_13_1 ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2112:1: ( rule__Viewpoint__VP_DataAssignment_13_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getViewpointAccess().getVP_DataAssignment_13_1()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2113:1: ( rule__Viewpoint__VP_DataAssignment_13_1 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2113:2: rule__Viewpoint__VP_DataAssignment_13_1
            {
            pushFollow(FOLLOW_rule__Viewpoint__VP_DataAssignment_13_1_in_rule__Viewpoint__Group_13__1__Impl4128);
            rule__Viewpoint__VP_DataAssignment_13_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getViewpointAccess().getVP_DataAssignment_13_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Viewpoint__Group_13__1__Impl"


    // $ANTLR start "rule__Viewpoint__Group_14__0"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2127:1: rule__Viewpoint__Group_14__0 : rule__Viewpoint__Group_14__0__Impl rule__Viewpoint__Group_14__1 ;
    public final void rule__Viewpoint__Group_14__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2131:1: ( rule__Viewpoint__Group_14__0__Impl rule__Viewpoint__Group_14__1 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2132:2: rule__Viewpoint__Group_14__0__Impl rule__Viewpoint__Group_14__1
            {
            pushFollow(FOLLOW_rule__Viewpoint__Group_14__0__Impl_in_rule__Viewpoint__Group_14__04162);
            rule__Viewpoint__Group_14__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Viewpoint__Group_14__1_in_rule__Viewpoint__Group_14__04165);
            rule__Viewpoint__Group_14__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Viewpoint__Group_14__0"


    // $ANTLR start "rule__Viewpoint__Group_14__0__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2139:1: rule__Viewpoint__Group_14__0__Impl : ( ( rule__Viewpoint__TypeAssignment_14_0 ) ) ;
    public final void rule__Viewpoint__Group_14__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2143:1: ( ( ( rule__Viewpoint__TypeAssignment_14_0 ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2144:1: ( ( rule__Viewpoint__TypeAssignment_14_0 ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2144:1: ( ( rule__Viewpoint__TypeAssignment_14_0 ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2145:1: ( rule__Viewpoint__TypeAssignment_14_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getViewpointAccess().getTypeAssignment_14_0()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2146:1: ( rule__Viewpoint__TypeAssignment_14_0 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2146:2: rule__Viewpoint__TypeAssignment_14_0
            {
            pushFollow(FOLLOW_rule__Viewpoint__TypeAssignment_14_0_in_rule__Viewpoint__Group_14__0__Impl4192);
            rule__Viewpoint__TypeAssignment_14_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getViewpointAccess().getTypeAssignment_14_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Viewpoint__Group_14__0__Impl"


    // $ANTLR start "rule__Viewpoint__Group_14__1"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2156:1: rule__Viewpoint__Group_14__1 : rule__Viewpoint__Group_14__1__Impl ;
    public final void rule__Viewpoint__Group_14__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2160:1: ( rule__Viewpoint__Group_14__1__Impl )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2161:2: rule__Viewpoint__Group_14__1__Impl
            {
            pushFollow(FOLLOW_rule__Viewpoint__Group_14__1__Impl_in_rule__Viewpoint__Group_14__14222);
            rule__Viewpoint__Group_14__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Viewpoint__Group_14__1"


    // $ANTLR start "rule__Viewpoint__Group_14__1__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2167:1: rule__Viewpoint__Group_14__1__Impl : ( ( rule__Viewpoint__VP_AspectsAssignment_14_1 ) ) ;
    public final void rule__Viewpoint__Group_14__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2171:1: ( ( ( rule__Viewpoint__VP_AspectsAssignment_14_1 ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2172:1: ( ( rule__Viewpoint__VP_AspectsAssignment_14_1 ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2172:1: ( ( rule__Viewpoint__VP_AspectsAssignment_14_1 ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2173:1: ( rule__Viewpoint__VP_AspectsAssignment_14_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getViewpointAccess().getVP_AspectsAssignment_14_1()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2174:1: ( rule__Viewpoint__VP_AspectsAssignment_14_1 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2174:2: rule__Viewpoint__VP_AspectsAssignment_14_1
            {
            pushFollow(FOLLOW_rule__Viewpoint__VP_AspectsAssignment_14_1_in_rule__Viewpoint__Group_14__1__Impl4249);
            rule__Viewpoint__VP_AspectsAssignment_14_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getViewpointAccess().getVP_AspectsAssignment_14_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Viewpoint__Group_14__1__Impl"


    // $ANTLR start "rule__Viewpoint__Group_15__0"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2188:1: rule__Viewpoint__Group_15__0 : rule__Viewpoint__Group_15__0__Impl rule__Viewpoint__Group_15__1 ;
    public final void rule__Viewpoint__Group_15__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2192:1: ( rule__Viewpoint__Group_15__0__Impl rule__Viewpoint__Group_15__1 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2193:2: rule__Viewpoint__Group_15__0__Impl rule__Viewpoint__Group_15__1
            {
            pushFollow(FOLLOW_rule__Viewpoint__Group_15__0__Impl_in_rule__Viewpoint__Group_15__04283);
            rule__Viewpoint__Group_15__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Viewpoint__Group_15__1_in_rule__Viewpoint__Group_15__04286);
            rule__Viewpoint__Group_15__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Viewpoint__Group_15__0"


    // $ANTLR start "rule__Viewpoint__Group_15__0__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2200:1: rule__Viewpoint__Group_15__0__Impl : ( ( rule__Viewpoint__TypeAssignment_15_0 ) ) ;
    public final void rule__Viewpoint__Group_15__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2204:1: ( ( ( rule__Viewpoint__TypeAssignment_15_0 ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2205:1: ( ( rule__Viewpoint__TypeAssignment_15_0 ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2205:1: ( ( rule__Viewpoint__TypeAssignment_15_0 ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2206:1: ( rule__Viewpoint__TypeAssignment_15_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getViewpointAccess().getTypeAssignment_15_0()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2207:1: ( rule__Viewpoint__TypeAssignment_15_0 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2207:2: rule__Viewpoint__TypeAssignment_15_0
            {
            pushFollow(FOLLOW_rule__Viewpoint__TypeAssignment_15_0_in_rule__Viewpoint__Group_15__0__Impl4313);
            rule__Viewpoint__TypeAssignment_15_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getViewpointAccess().getTypeAssignment_15_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Viewpoint__Group_15__0__Impl"


    // $ANTLR start "rule__Viewpoint__Group_15__1"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2217:1: rule__Viewpoint__Group_15__1 : rule__Viewpoint__Group_15__1__Impl ;
    public final void rule__Viewpoint__Group_15__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2221:1: ( rule__Viewpoint__Group_15__1__Impl )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2222:2: rule__Viewpoint__Group_15__1__Impl
            {
            pushFollow(FOLLOW_rule__Viewpoint__Group_15__1__Impl_in_rule__Viewpoint__Group_15__14343);
            rule__Viewpoint__Group_15__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Viewpoint__Group_15__1"


    // $ANTLR start "rule__Viewpoint__Group_15__1__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2228:1: rule__Viewpoint__Group_15__1__Impl : ( ( rule__Viewpoint__VP_AspectsAssignment_15_1 ) ) ;
    public final void rule__Viewpoint__Group_15__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2232:1: ( ( ( rule__Viewpoint__VP_AspectsAssignment_15_1 ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2233:1: ( ( rule__Viewpoint__VP_AspectsAssignment_15_1 ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2233:1: ( ( rule__Viewpoint__VP_AspectsAssignment_15_1 ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2234:1: ( rule__Viewpoint__VP_AspectsAssignment_15_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getViewpointAccess().getVP_AspectsAssignment_15_1()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2235:1: ( rule__Viewpoint__VP_AspectsAssignment_15_1 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2235:2: rule__Viewpoint__VP_AspectsAssignment_15_1
            {
            pushFollow(FOLLOW_rule__Viewpoint__VP_AspectsAssignment_15_1_in_rule__Viewpoint__Group_15__1__Impl4370);
            rule__Viewpoint__VP_AspectsAssignment_15_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getViewpointAccess().getVP_AspectsAssignment_15_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Viewpoint__Group_15__1__Impl"


    // $ANTLR start "rule__Viewpoint__Group_16__0"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2249:1: rule__Viewpoint__Group_16__0 : rule__Viewpoint__Group_16__0__Impl rule__Viewpoint__Group_16__1 ;
    public final void rule__Viewpoint__Group_16__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2253:1: ( rule__Viewpoint__Group_16__0__Impl rule__Viewpoint__Group_16__1 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2254:2: rule__Viewpoint__Group_16__0__Impl rule__Viewpoint__Group_16__1
            {
            pushFollow(FOLLOW_rule__Viewpoint__Group_16__0__Impl_in_rule__Viewpoint__Group_16__04404);
            rule__Viewpoint__Group_16__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Viewpoint__Group_16__1_in_rule__Viewpoint__Group_16__04407);
            rule__Viewpoint__Group_16__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Viewpoint__Group_16__0"


    // $ANTLR start "rule__Viewpoint__Group_16__0__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2261:1: rule__Viewpoint__Group_16__0__Impl : ( ( rule__Viewpoint__TypeAssignment_16_0 ) ) ;
    public final void rule__Viewpoint__Group_16__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2265:1: ( ( ( rule__Viewpoint__TypeAssignment_16_0 ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2266:1: ( ( rule__Viewpoint__TypeAssignment_16_0 ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2266:1: ( ( rule__Viewpoint__TypeAssignment_16_0 ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2267:1: ( rule__Viewpoint__TypeAssignment_16_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getViewpointAccess().getTypeAssignment_16_0()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2268:1: ( rule__Viewpoint__TypeAssignment_16_0 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2268:2: rule__Viewpoint__TypeAssignment_16_0
            {
            pushFollow(FOLLOW_rule__Viewpoint__TypeAssignment_16_0_in_rule__Viewpoint__Group_16__0__Impl4434);
            rule__Viewpoint__TypeAssignment_16_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getViewpointAccess().getTypeAssignment_16_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Viewpoint__Group_16__0__Impl"


    // $ANTLR start "rule__Viewpoint__Group_16__1"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2278:1: rule__Viewpoint__Group_16__1 : rule__Viewpoint__Group_16__1__Impl ;
    public final void rule__Viewpoint__Group_16__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2282:1: ( rule__Viewpoint__Group_16__1__Impl )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2283:2: rule__Viewpoint__Group_16__1__Impl
            {
            pushFollow(FOLLOW_rule__Viewpoint__Group_16__1__Impl_in_rule__Viewpoint__Group_16__14464);
            rule__Viewpoint__Group_16__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Viewpoint__Group_16__1"


    // $ANTLR start "rule__Viewpoint__Group_16__1__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2289:1: rule__Viewpoint__Group_16__1__Impl : ( ( rule__Viewpoint__VP_AspectsAssignment_16_1 ) ) ;
    public final void rule__Viewpoint__Group_16__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2293:1: ( ( ( rule__Viewpoint__VP_AspectsAssignment_16_1 ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2294:1: ( ( rule__Viewpoint__VP_AspectsAssignment_16_1 ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2294:1: ( ( rule__Viewpoint__VP_AspectsAssignment_16_1 ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2295:1: ( rule__Viewpoint__VP_AspectsAssignment_16_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getViewpointAccess().getVP_AspectsAssignment_16_1()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2296:1: ( rule__Viewpoint__VP_AspectsAssignment_16_1 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2296:2: rule__Viewpoint__VP_AspectsAssignment_16_1
            {
            pushFollow(FOLLOW_rule__Viewpoint__VP_AspectsAssignment_16_1_in_rule__Viewpoint__Group_16__1__Impl4491);
            rule__Viewpoint__VP_AspectsAssignment_16_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getViewpointAccess().getVP_AspectsAssignment_16_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Viewpoint__Group_16__1__Impl"


    // $ANTLR start "rule__Viewpoint__Group_17__0"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2310:1: rule__Viewpoint__Group_17__0 : rule__Viewpoint__Group_17__0__Impl rule__Viewpoint__Group_17__1 ;
    public final void rule__Viewpoint__Group_17__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2314:1: ( rule__Viewpoint__Group_17__0__Impl rule__Viewpoint__Group_17__1 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2315:2: rule__Viewpoint__Group_17__0__Impl rule__Viewpoint__Group_17__1
            {
            pushFollow(FOLLOW_rule__Viewpoint__Group_17__0__Impl_in_rule__Viewpoint__Group_17__04525);
            rule__Viewpoint__Group_17__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Viewpoint__Group_17__1_in_rule__Viewpoint__Group_17__04528);
            rule__Viewpoint__Group_17__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Viewpoint__Group_17__0"


    // $ANTLR start "rule__Viewpoint__Group_17__0__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2322:1: rule__Viewpoint__Group_17__0__Impl : ( ( rule__Viewpoint__TypeAssignment_17_0 ) ) ;
    public final void rule__Viewpoint__Group_17__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2326:1: ( ( ( rule__Viewpoint__TypeAssignment_17_0 ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2327:1: ( ( rule__Viewpoint__TypeAssignment_17_0 ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2327:1: ( ( rule__Viewpoint__TypeAssignment_17_0 ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2328:1: ( rule__Viewpoint__TypeAssignment_17_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getViewpointAccess().getTypeAssignment_17_0()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2329:1: ( rule__Viewpoint__TypeAssignment_17_0 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2329:2: rule__Viewpoint__TypeAssignment_17_0
            {
            pushFollow(FOLLOW_rule__Viewpoint__TypeAssignment_17_0_in_rule__Viewpoint__Group_17__0__Impl4555);
            rule__Viewpoint__TypeAssignment_17_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getViewpointAccess().getTypeAssignment_17_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Viewpoint__Group_17__0__Impl"


    // $ANTLR start "rule__Viewpoint__Group_17__1"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2339:1: rule__Viewpoint__Group_17__1 : rule__Viewpoint__Group_17__1__Impl ;
    public final void rule__Viewpoint__Group_17__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2343:1: ( rule__Viewpoint__Group_17__1__Impl )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2344:2: rule__Viewpoint__Group_17__1__Impl
            {
            pushFollow(FOLLOW_rule__Viewpoint__Group_17__1__Impl_in_rule__Viewpoint__Group_17__14585);
            rule__Viewpoint__Group_17__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Viewpoint__Group_17__1"


    // $ANTLR start "rule__Viewpoint__Group_17__1__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2350:1: rule__Viewpoint__Group_17__1__Impl : ( ( rule__Viewpoint__VP_AspectsAssignment_17_1 ) ) ;
    public final void rule__Viewpoint__Group_17__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2354:1: ( ( ( rule__Viewpoint__VP_AspectsAssignment_17_1 ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2355:1: ( ( rule__Viewpoint__VP_AspectsAssignment_17_1 ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2355:1: ( ( rule__Viewpoint__VP_AspectsAssignment_17_1 ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2356:1: ( rule__Viewpoint__VP_AspectsAssignment_17_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getViewpointAccess().getVP_AspectsAssignment_17_1()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2357:1: ( rule__Viewpoint__VP_AspectsAssignment_17_1 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2357:2: rule__Viewpoint__VP_AspectsAssignment_17_1
            {
            pushFollow(FOLLOW_rule__Viewpoint__VP_AspectsAssignment_17_1_in_rule__Viewpoint__Group_17__1__Impl4612);
            rule__Viewpoint__VP_AspectsAssignment_17_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getViewpointAccess().getVP_AspectsAssignment_17_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Viewpoint__Group_17__1__Impl"


    // $ANTLR start "rule__Viewpoint__Group_18__0"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2371:1: rule__Viewpoint__Group_18__0 : rule__Viewpoint__Group_18__0__Impl rule__Viewpoint__Group_18__1 ;
    public final void rule__Viewpoint__Group_18__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2375:1: ( rule__Viewpoint__Group_18__0__Impl rule__Viewpoint__Group_18__1 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2376:2: rule__Viewpoint__Group_18__0__Impl rule__Viewpoint__Group_18__1
            {
            pushFollow(FOLLOW_rule__Viewpoint__Group_18__0__Impl_in_rule__Viewpoint__Group_18__04646);
            rule__Viewpoint__Group_18__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Viewpoint__Group_18__1_in_rule__Viewpoint__Group_18__04649);
            rule__Viewpoint__Group_18__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Viewpoint__Group_18__0"


    // $ANTLR start "rule__Viewpoint__Group_18__0__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2383:1: rule__Viewpoint__Group_18__0__Impl : ( ( rule__Viewpoint__TypeAssignment_18_0 ) ) ;
    public final void rule__Viewpoint__Group_18__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2387:1: ( ( ( rule__Viewpoint__TypeAssignment_18_0 ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2388:1: ( ( rule__Viewpoint__TypeAssignment_18_0 ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2388:1: ( ( rule__Viewpoint__TypeAssignment_18_0 ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2389:1: ( rule__Viewpoint__TypeAssignment_18_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getViewpointAccess().getTypeAssignment_18_0()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2390:1: ( rule__Viewpoint__TypeAssignment_18_0 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2390:2: rule__Viewpoint__TypeAssignment_18_0
            {
            pushFollow(FOLLOW_rule__Viewpoint__TypeAssignment_18_0_in_rule__Viewpoint__Group_18__0__Impl4676);
            rule__Viewpoint__TypeAssignment_18_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getViewpointAccess().getTypeAssignment_18_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Viewpoint__Group_18__0__Impl"


    // $ANTLR start "rule__Viewpoint__Group_18__1"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2400:1: rule__Viewpoint__Group_18__1 : rule__Viewpoint__Group_18__1__Impl ;
    public final void rule__Viewpoint__Group_18__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2404:1: ( rule__Viewpoint__Group_18__1__Impl )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2405:2: rule__Viewpoint__Group_18__1__Impl
            {
            pushFollow(FOLLOW_rule__Viewpoint__Group_18__1__Impl_in_rule__Viewpoint__Group_18__14706);
            rule__Viewpoint__Group_18__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Viewpoint__Group_18__1"


    // $ANTLR start "rule__Viewpoint__Group_18__1__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2411:1: rule__Viewpoint__Group_18__1__Impl : ( ( rule__Viewpoint__VP_AspectsAssignment_18_1 ) ) ;
    public final void rule__Viewpoint__Group_18__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2415:1: ( ( ( rule__Viewpoint__VP_AspectsAssignment_18_1 ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2416:1: ( ( rule__Viewpoint__VP_AspectsAssignment_18_1 ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2416:1: ( ( rule__Viewpoint__VP_AspectsAssignment_18_1 ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2417:1: ( rule__Viewpoint__VP_AspectsAssignment_18_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getViewpointAccess().getVP_AspectsAssignment_18_1()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2418:1: ( rule__Viewpoint__VP_AspectsAssignment_18_1 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2418:2: rule__Viewpoint__VP_AspectsAssignment_18_1
            {
            pushFollow(FOLLOW_rule__Viewpoint__VP_AspectsAssignment_18_1_in_rule__Viewpoint__Group_18__1__Impl4733);
            rule__Viewpoint__VP_AspectsAssignment_18_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getViewpointAccess().getVP_AspectsAssignment_18_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Viewpoint__Group_18__1__Impl"


    // $ANTLR start "rule__Viewpoint__Group_19__0"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2432:1: rule__Viewpoint__Group_19__0 : rule__Viewpoint__Group_19__0__Impl rule__Viewpoint__Group_19__1 ;
    public final void rule__Viewpoint__Group_19__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2436:1: ( rule__Viewpoint__Group_19__0__Impl rule__Viewpoint__Group_19__1 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2437:2: rule__Viewpoint__Group_19__0__Impl rule__Viewpoint__Group_19__1
            {
            pushFollow(FOLLOW_rule__Viewpoint__Group_19__0__Impl_in_rule__Viewpoint__Group_19__04767);
            rule__Viewpoint__Group_19__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Viewpoint__Group_19__1_in_rule__Viewpoint__Group_19__04770);
            rule__Viewpoint__Group_19__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Viewpoint__Group_19__0"


    // $ANTLR start "rule__Viewpoint__Group_19__0__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2444:1: rule__Viewpoint__Group_19__0__Impl : ( ( rule__Viewpoint__TypeAssignment_19_0 ) ) ;
    public final void rule__Viewpoint__Group_19__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2448:1: ( ( ( rule__Viewpoint__TypeAssignment_19_0 ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2449:1: ( ( rule__Viewpoint__TypeAssignment_19_0 ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2449:1: ( ( rule__Viewpoint__TypeAssignment_19_0 ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2450:1: ( rule__Viewpoint__TypeAssignment_19_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getViewpointAccess().getTypeAssignment_19_0()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2451:1: ( rule__Viewpoint__TypeAssignment_19_0 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2451:2: rule__Viewpoint__TypeAssignment_19_0
            {
            pushFollow(FOLLOW_rule__Viewpoint__TypeAssignment_19_0_in_rule__Viewpoint__Group_19__0__Impl4797);
            rule__Viewpoint__TypeAssignment_19_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getViewpointAccess().getTypeAssignment_19_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Viewpoint__Group_19__0__Impl"


    // $ANTLR start "rule__Viewpoint__Group_19__1"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2461:1: rule__Viewpoint__Group_19__1 : rule__Viewpoint__Group_19__1__Impl ;
    public final void rule__Viewpoint__Group_19__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2465:1: ( rule__Viewpoint__Group_19__1__Impl )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2466:2: rule__Viewpoint__Group_19__1__Impl
            {
            pushFollow(FOLLOW_rule__Viewpoint__Group_19__1__Impl_in_rule__Viewpoint__Group_19__14827);
            rule__Viewpoint__Group_19__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Viewpoint__Group_19__1"


    // $ANTLR start "rule__Viewpoint__Group_19__1__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2472:1: rule__Viewpoint__Group_19__1__Impl : ( ( rule__Viewpoint__VP_AspectsAssignment_19_1 ) ) ;
    public final void rule__Viewpoint__Group_19__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2476:1: ( ( ( rule__Viewpoint__VP_AspectsAssignment_19_1 ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2477:1: ( ( rule__Viewpoint__VP_AspectsAssignment_19_1 ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2477:1: ( ( rule__Viewpoint__VP_AspectsAssignment_19_1 ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2478:1: ( rule__Viewpoint__VP_AspectsAssignment_19_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getViewpointAccess().getVP_AspectsAssignment_19_1()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2479:1: ( rule__Viewpoint__VP_AspectsAssignment_19_1 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2479:2: rule__Viewpoint__VP_AspectsAssignment_19_1
            {
            pushFollow(FOLLOW_rule__Viewpoint__VP_AspectsAssignment_19_1_in_rule__Viewpoint__Group_19__1__Impl4854);
            rule__Viewpoint__VP_AspectsAssignment_19_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getViewpointAccess().getVP_AspectsAssignment_19_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Viewpoint__Group_19__1__Impl"


    // $ANTLR start "rule__FQN__Group__0"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2493:1: rule__FQN__Group__0 : rule__FQN__Group__0__Impl rule__FQN__Group__1 ;
    public final void rule__FQN__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2497:1: ( rule__FQN__Group__0__Impl rule__FQN__Group__1 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2498:2: rule__FQN__Group__0__Impl rule__FQN__Group__1
            {
            pushFollow(FOLLOW_rule__FQN__Group__0__Impl_in_rule__FQN__Group__04888);
            rule__FQN__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__FQN__Group__1_in_rule__FQN__Group__04891);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2505:1: rule__FQN__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__FQN__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2509:1: ( ( RULE_ID ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2510:1: ( RULE_ID )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2510:1: ( RULE_ID )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2511:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFQNAccess().getIDTerminalRuleCall_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__FQN__Group__0__Impl4918); if (state.failed) return ;
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2522:1: rule__FQN__Group__1 : rule__FQN__Group__1__Impl ;
    public final void rule__FQN__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2526:1: ( rule__FQN__Group__1__Impl )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2527:2: rule__FQN__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__FQN__Group__1__Impl_in_rule__FQN__Group__14947);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2533:1: rule__FQN__Group__1__Impl : ( ( rule__FQN__Group_1__0 )* ) ;
    public final void rule__FQN__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2537:1: ( ( ( rule__FQN__Group_1__0 )* ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2538:1: ( ( rule__FQN__Group_1__0 )* )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2538:1: ( ( rule__FQN__Group_1__0 )* )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2539:1: ( rule__FQN__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFQNAccess().getGroup_1()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2540:1: ( rule__FQN__Group_1__0 )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==25) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2540:2: rule__FQN__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__FQN__Group_1__0_in_rule__FQN__Group__1__Impl4974);
            	    rule__FQN__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop25;
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2554:1: rule__FQN__Group_1__0 : rule__FQN__Group_1__0__Impl rule__FQN__Group_1__1 ;
    public final void rule__FQN__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2558:1: ( rule__FQN__Group_1__0__Impl rule__FQN__Group_1__1 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2559:2: rule__FQN__Group_1__0__Impl rule__FQN__Group_1__1
            {
            pushFollow(FOLLOW_rule__FQN__Group_1__0__Impl_in_rule__FQN__Group_1__05009);
            rule__FQN__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__FQN__Group_1__1_in_rule__FQN__Group_1__05012);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2566:1: rule__FQN__Group_1__0__Impl : ( '.' ) ;
    public final void rule__FQN__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2570:1: ( ( '.' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2571:1: ( '.' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2571:1: ( '.' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2572:1: '.'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFQNAccess().getFullStopKeyword_1_0()); 
            }
            match(input,25,FOLLOW_25_in_rule__FQN__Group_1__0__Impl5040); if (state.failed) return ;
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2585:1: rule__FQN__Group_1__1 : rule__FQN__Group_1__1__Impl ;
    public final void rule__FQN__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2589:1: ( rule__FQN__Group_1__1__Impl )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2590:2: rule__FQN__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__FQN__Group_1__1__Impl_in_rule__FQN__Group_1__15071);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2596:1: rule__FQN__Group_1__1__Impl : ( ( RULE_ID ) ) ;
    public final void rule__FQN__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2600:1: ( ( ( RULE_ID ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2601:1: ( ( RULE_ID ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2601:1: ( ( RULE_ID ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2602:1: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFQNAccess().getIDTerminalRuleCall_1_1()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2603:1: ( RULE_ID )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2603:3: RULE_ID
            {
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__FQN__Group_1__1__Impl5099); if (state.failed) return ;

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


    // $ANTLR start "rule__Viewpoint__ShortNameAssignment_2"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2618:1: rule__Viewpoint__ShortNameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Viewpoint__ShortNameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2622:1: ( ( RULE_ID ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2623:1: ( RULE_ID )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2623:1: ( RULE_ID )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2624:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getViewpointAccess().getShortNameIDTerminalRuleCall_2_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Viewpoint__ShortNameAssignment_25138); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getViewpointAccess().getShortNameIDTerminalRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Viewpoint__ShortNameAssignment_2"


    // $ANTLR start "rule__Viewpoint__NameAssignment_4_1"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2633:1: rule__Viewpoint__NameAssignment_4_1 : ( RULE_STRING ) ;
    public final void rule__Viewpoint__NameAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2637:1: ( ( RULE_STRING ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2638:1: ( RULE_STRING )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2638:1: ( RULE_STRING )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2639:1: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getViewpointAccess().getNameSTRINGTerminalRuleCall_4_1_0()); 
            }
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Viewpoint__NameAssignment_4_15169); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getViewpointAccess().getNameSTRINGTerminalRuleCall_4_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Viewpoint__NameAssignment_4_1"


    // $ANTLR start "rule__Viewpoint__DescriptionAssignment_5_1"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2648:1: rule__Viewpoint__DescriptionAssignment_5_1 : ( ruleEString ) ;
    public final void rule__Viewpoint__DescriptionAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2652:1: ( ( ruleEString ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2653:1: ( ruleEString )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2653:1: ( ruleEString )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2654:1: ruleEString
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getViewpointAccess().getDescriptionEStringParserRuleCall_5_1_0()); 
            }
            pushFollow(FOLLOW_ruleEString_in_rule__Viewpoint__DescriptionAssignment_5_15200);
            ruleEString();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getViewpointAccess().getDescriptionEStringParserRuleCall_5_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Viewpoint__DescriptionAssignment_5_1"


    // $ANTLR start "rule__Viewpoint__ParentsAssignment_6_1"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2663:1: rule__Viewpoint__ParentsAssignment_6_1 : ( ( ruleFQN ) ) ;
    public final void rule__Viewpoint__ParentsAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2667:1: ( ( ( ruleFQN ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2668:1: ( ( ruleFQN ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2668:1: ( ( ruleFQN ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2669:1: ( ruleFQN )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getViewpointAccess().getParentsViewpointCrossReference_6_1_0()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2670:1: ( ruleFQN )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2671:1: ruleFQN
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getViewpointAccess().getParentsViewpointFQNParserRuleCall_6_1_0_1()); 
            }
            pushFollow(FOLLOW_ruleFQN_in_rule__Viewpoint__ParentsAssignment_6_15235);
            ruleFQN();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getViewpointAccess().getParentsViewpointFQNParserRuleCall_6_1_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getViewpointAccess().getParentsViewpointCrossReference_6_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Viewpoint__ParentsAssignment_6_1"


    // $ANTLR start "rule__Viewpoint__ParentsAssignment_6_2_1"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2682:1: rule__Viewpoint__ParentsAssignment_6_2_1 : ( ( ruleFQN ) ) ;
    public final void rule__Viewpoint__ParentsAssignment_6_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2686:1: ( ( ( ruleFQN ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2687:1: ( ( ruleFQN ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2687:1: ( ( ruleFQN ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2688:1: ( ruleFQN )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getViewpointAccess().getParentsViewpointCrossReference_6_2_1_0()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2689:1: ( ruleFQN )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2690:1: ruleFQN
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getViewpointAccess().getParentsViewpointFQNParserRuleCall_6_2_1_0_1()); 
            }
            pushFollow(FOLLOW_ruleFQN_in_rule__Viewpoint__ParentsAssignment_6_2_15274);
            ruleFQN();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getViewpointAccess().getParentsViewpointFQNParserRuleCall_6_2_1_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getViewpointAccess().getParentsViewpointCrossReference_6_2_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Viewpoint__ParentsAssignment_6_2_1"


    // $ANTLR start "rule__Viewpoint__DependenciesAssignment_7_1"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2701:1: rule__Viewpoint__DependenciesAssignment_7_1 : ( ( ruleFQN ) ) ;
    public final void rule__Viewpoint__DependenciesAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2705:1: ( ( ( ruleFQN ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2706:1: ( ( ruleFQN ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2706:1: ( ( ruleFQN ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2707:1: ( ruleFQN )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getViewpointAccess().getDependenciesViewpointCrossReference_7_1_0()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2708:1: ( ruleFQN )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2709:1: ruleFQN
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getViewpointAccess().getDependenciesViewpointFQNParserRuleCall_7_1_0_1()); 
            }
            pushFollow(FOLLOW_ruleFQN_in_rule__Viewpoint__DependenciesAssignment_7_15313);
            ruleFQN();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getViewpointAccess().getDependenciesViewpointFQNParserRuleCall_7_1_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getViewpointAccess().getDependenciesViewpointCrossReference_7_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Viewpoint__DependenciesAssignment_7_1"


    // $ANTLR start "rule__Viewpoint__DependenciesAssignment_7_2_1"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2720:1: rule__Viewpoint__DependenciesAssignment_7_2_1 : ( ( ruleFQN ) ) ;
    public final void rule__Viewpoint__DependenciesAssignment_7_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2724:1: ( ( ( ruleFQN ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2725:1: ( ( ruleFQN ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2725:1: ( ( ruleFQN ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2726:1: ( ruleFQN )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getViewpointAccess().getDependenciesViewpointCrossReference_7_2_1_0()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2727:1: ( ruleFQN )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2728:1: ruleFQN
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getViewpointAccess().getDependenciesViewpointFQNParserRuleCall_7_2_1_0_1()); 
            }
            pushFollow(FOLLOW_ruleFQN_in_rule__Viewpoint__DependenciesAssignment_7_2_15352);
            ruleFQN();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getViewpointAccess().getDependenciesViewpointFQNParserRuleCall_7_2_1_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getViewpointAccess().getDependenciesViewpointCrossReference_7_2_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Viewpoint__DependenciesAssignment_7_2_1"


    // $ANTLR start "rule__Viewpoint__UseViewpointAssignment_8_1"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2739:1: rule__Viewpoint__UseViewpointAssignment_8_1 : ( ( ruleFQN ) ) ;
    public final void rule__Viewpoint__UseViewpointAssignment_8_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2743:1: ( ( ( ruleFQN ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2744:1: ( ( ruleFQN ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2744:1: ( ( ruleFQN ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2745:1: ( ruleFQN )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getViewpointAccess().getUseViewpointViewpointCrossReference_8_1_0()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2746:1: ( ruleFQN )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2747:1: ruleFQN
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getViewpointAccess().getUseViewpointViewpointFQNParserRuleCall_8_1_0_1()); 
            }
            pushFollow(FOLLOW_ruleFQN_in_rule__Viewpoint__UseViewpointAssignment_8_15391);
            ruleFQN();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getViewpointAccess().getUseViewpointViewpointFQNParserRuleCall_8_1_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getViewpointAccess().getUseViewpointViewpointCrossReference_8_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Viewpoint__UseViewpointAssignment_8_1"


    // $ANTLR start "rule__Viewpoint__UseViewpointAssignment_8_2_1"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2758:1: rule__Viewpoint__UseViewpointAssignment_8_2_1 : ( ( ruleFQN ) ) ;
    public final void rule__Viewpoint__UseViewpointAssignment_8_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2762:1: ( ( ( ruleFQN ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2763:1: ( ( ruleFQN ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2763:1: ( ( ruleFQN ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2764:1: ( ruleFQN )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getViewpointAccess().getUseViewpointViewpointCrossReference_8_2_1_0()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2765:1: ( ruleFQN )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2766:1: ruleFQN
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getViewpointAccess().getUseViewpointViewpointFQNParserRuleCall_8_2_1_0_1()); 
            }
            pushFollow(FOLLOW_ruleFQN_in_rule__Viewpoint__UseViewpointAssignment_8_2_15430);
            ruleFQN();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getViewpointAccess().getUseViewpointViewpointFQNParserRuleCall_8_2_1_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getViewpointAccess().getUseViewpointViewpointCrossReference_8_2_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Viewpoint__UseViewpointAssignment_8_2_1"


    // $ANTLR start "rule__Viewpoint__UseAnyEMFResourceAssignment_9_1"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2777:1: rule__Viewpoint__UseAnyEMFResourceAssignment_9_1 : ( ruleEString ) ;
    public final void rule__Viewpoint__UseAnyEMFResourceAssignment_9_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2781:1: ( ( ruleEString ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2782:1: ( ruleEString )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2782:1: ( ruleEString )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2783:1: ruleEString
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getViewpointAccess().getUseAnyEMFResourceEStringParserRuleCall_9_1_0()); 
            }
            pushFollow(FOLLOW_ruleEString_in_rule__Viewpoint__UseAnyEMFResourceAssignment_9_15465);
            ruleEString();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getViewpointAccess().getUseAnyEMFResourceEStringParserRuleCall_9_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Viewpoint__UseAnyEMFResourceAssignment_9_1"


    // $ANTLR start "rule__Viewpoint__UseAnyEMFResourceAssignment_9_2_1"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2792:1: rule__Viewpoint__UseAnyEMFResourceAssignment_9_2_1 : ( ruleEString ) ;
    public final void rule__Viewpoint__UseAnyEMFResourceAssignment_9_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2796:1: ( ( ruleEString ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2797:1: ( ruleEString )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2797:1: ( ruleEString )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2798:1: ruleEString
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getViewpointAccess().getUseAnyEMFResourceEStringParserRuleCall_9_2_1_0()); 
            }
            pushFollow(FOLLOW_ruleEString_in_rule__Viewpoint__UseAnyEMFResourceAssignment_9_2_15496);
            ruleEString();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getViewpointAccess().getUseAnyEMFResourceEStringParserRuleCall_9_2_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Viewpoint__UseAnyEMFResourceAssignment_9_2_1"


    // $ANTLR start "rule__Viewpoint__UseDiagramResourceAssignment_10_1"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2807:1: rule__Viewpoint__UseDiagramResourceAssignment_10_1 : ( ruleEString ) ;
    public final void rule__Viewpoint__UseDiagramResourceAssignment_10_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2811:1: ( ( ruleEString ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2812:1: ( ruleEString )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2812:1: ( ruleEString )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2813:1: ruleEString
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getViewpointAccess().getUseDiagramResourceEStringParserRuleCall_10_1_0()); 
            }
            pushFollow(FOLLOW_ruleEString_in_rule__Viewpoint__UseDiagramResourceAssignment_10_15527);
            ruleEString();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getViewpointAccess().getUseDiagramResourceEStringParserRuleCall_10_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Viewpoint__UseDiagramResourceAssignment_10_1"


    // $ANTLR start "rule__Viewpoint__UseDiagramResourceAssignment_10_2_1"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2822:1: rule__Viewpoint__UseDiagramResourceAssignment_10_2_1 : ( ruleEString ) ;
    public final void rule__Viewpoint__UseDiagramResourceAssignment_10_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2826:1: ( ( ruleEString ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2827:1: ( ruleEString )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2827:1: ( ruleEString )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2828:1: ruleEString
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getViewpointAccess().getUseDiagramResourceEStringParserRuleCall_10_2_1_0()); 
            }
            pushFollow(FOLLOW_ruleEString_in_rule__Viewpoint__UseDiagramResourceAssignment_10_2_15558);
            ruleEString();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getViewpointAccess().getUseDiagramResourceEStringParserRuleCall_10_2_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Viewpoint__UseDiagramResourceAssignment_10_2_1"


    // $ANTLR start "rule__Viewpoint__UseWorkspaceResourceAssignment_11_1"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2837:1: rule__Viewpoint__UseWorkspaceResourceAssignment_11_1 : ( ruleEString ) ;
    public final void rule__Viewpoint__UseWorkspaceResourceAssignment_11_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2841:1: ( ( ruleEString ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2842:1: ( ruleEString )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2842:1: ( ruleEString )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2843:1: ruleEString
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getViewpointAccess().getUseWorkspaceResourceEStringParserRuleCall_11_1_0()); 
            }
            pushFollow(FOLLOW_ruleEString_in_rule__Viewpoint__UseWorkspaceResourceAssignment_11_15589);
            ruleEString();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getViewpointAccess().getUseWorkspaceResourceEStringParserRuleCall_11_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Viewpoint__UseWorkspaceResourceAssignment_11_1"


    // $ANTLR start "rule__Viewpoint__UseWorkspaceResourceAssignment_11_2_1"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2852:1: rule__Viewpoint__UseWorkspaceResourceAssignment_11_2_1 : ( ruleEString ) ;
    public final void rule__Viewpoint__UseWorkspaceResourceAssignment_11_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2856:1: ( ( ruleEString ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2857:1: ( ruleEString )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2857:1: ( ruleEString )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2858:1: ruleEString
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getViewpointAccess().getUseWorkspaceResourceEStringParserRuleCall_11_2_1_0()); 
            }
            pushFollow(FOLLOW_ruleEString_in_rule__Viewpoint__UseWorkspaceResourceAssignment_11_2_15620);
            ruleEString();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getViewpointAccess().getUseWorkspaceResourceEStringParserRuleCall_11_2_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Viewpoint__UseWorkspaceResourceAssignment_11_2_1"


    // $ANTLR start "rule__Viewpoint__UseFSResourceAssignment_12_1"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2867:1: rule__Viewpoint__UseFSResourceAssignment_12_1 : ( ruleEString ) ;
    public final void rule__Viewpoint__UseFSResourceAssignment_12_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2871:1: ( ( ruleEString ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2872:1: ( ruleEString )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2872:1: ( ruleEString )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2873:1: ruleEString
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getViewpointAccess().getUseFSResourceEStringParserRuleCall_12_1_0()); 
            }
            pushFollow(FOLLOW_ruleEString_in_rule__Viewpoint__UseFSResourceAssignment_12_15651);
            ruleEString();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getViewpointAccess().getUseFSResourceEStringParserRuleCall_12_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Viewpoint__UseFSResourceAssignment_12_1"


    // $ANTLR start "rule__Viewpoint__UseFSResourceAssignment_12_2_1"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2882:1: rule__Viewpoint__UseFSResourceAssignment_12_2_1 : ( ruleEString ) ;
    public final void rule__Viewpoint__UseFSResourceAssignment_12_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2886:1: ( ( ruleEString ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2887:1: ( ruleEString )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2887:1: ( ruleEString )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2888:1: ruleEString
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getViewpointAccess().getUseFSResourceEStringParserRuleCall_12_2_1_0()); 
            }
            pushFollow(FOLLOW_ruleEString_in_rule__Viewpoint__UseFSResourceAssignment_12_2_15682);
            ruleEString();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getViewpointAccess().getUseFSResourceEStringParserRuleCall_12_2_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Viewpoint__UseFSResourceAssignment_12_2_1"


    // $ANTLR start "rule__Viewpoint__VP_DataAssignment_13_1"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2897:1: rule__Viewpoint__VP_DataAssignment_13_1 : ( ( ruleFQN ) ) ;
    public final void rule__Viewpoint__VP_DataAssignment_13_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2901:1: ( ( ( ruleFQN ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2902:1: ( ( ruleFQN ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2902:1: ( ( ruleFQN ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2903:1: ( ruleFQN )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getViewpointAccess().getVP_DataDataCrossReference_13_1_0()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2904:1: ( ruleFQN )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2905:1: ruleFQN
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getViewpointAccess().getVP_DataDataFQNParserRuleCall_13_1_0_1()); 
            }
            pushFollow(FOLLOW_ruleFQN_in_rule__Viewpoint__VP_DataAssignment_13_15717);
            ruleFQN();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getViewpointAccess().getVP_DataDataFQNParserRuleCall_13_1_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getViewpointAccess().getVP_DataDataCrossReference_13_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Viewpoint__VP_DataAssignment_13_1"


    // $ANTLR start "rule__Viewpoint__TypeAssignment_14_0"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2916:1: rule__Viewpoint__TypeAssignment_14_0 : ( ( 'UI' ) ) ;
    public final void rule__Viewpoint__TypeAssignment_14_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2920:1: ( ( ( 'UI' ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2921:1: ( ( 'UI' ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2921:1: ( ( 'UI' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2922:1: ( 'UI' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getViewpointAccess().getTypeUIKeyword_14_0_0()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2923:1: ( 'UI' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2924:1: 'UI'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getViewpointAccess().getTypeUIKeyword_14_0_0()); 
            }
            match(input,26,FOLLOW_26_in_rule__Viewpoint__TypeAssignment_14_05757); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getViewpointAccess().getTypeUIKeyword_14_0_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getViewpointAccess().getTypeUIKeyword_14_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Viewpoint__TypeAssignment_14_0"


    // $ANTLR start "rule__Viewpoint__VP_AspectsAssignment_14_1"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2939:1: rule__Viewpoint__VP_AspectsAssignment_14_1 : ( ( ruleFQN ) ) ;
    public final void rule__Viewpoint__VP_AspectsAssignment_14_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2943:1: ( ( ( ruleFQN ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2944:1: ( ( ruleFQN ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2944:1: ( ( ruleFQN ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2945:1: ( ruleFQN )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getViewpointAccess().getVP_AspectsUIDescriptionCrossReference_14_1_0()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2946:1: ( ruleFQN )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2947:1: ruleFQN
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getViewpointAccess().getVP_AspectsUIDescriptionFQNParserRuleCall_14_1_0_1()); 
            }
            pushFollow(FOLLOW_ruleFQN_in_rule__Viewpoint__VP_AspectsAssignment_14_15800);
            ruleFQN();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getViewpointAccess().getVP_AspectsUIDescriptionFQNParserRuleCall_14_1_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getViewpointAccess().getVP_AspectsUIDescriptionCrossReference_14_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Viewpoint__VP_AspectsAssignment_14_1"


    // $ANTLR start "rule__Viewpoint__TypeAssignment_15_0"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2958:1: rule__Viewpoint__TypeAssignment_15_0 : ( ( 'Diagrams' ) ) ;
    public final void rule__Viewpoint__TypeAssignment_15_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2962:1: ( ( ( 'Diagrams' ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2963:1: ( ( 'Diagrams' ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2963:1: ( ( 'Diagrams' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2964:1: ( 'Diagrams' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getViewpointAccess().getTypeDiagramsKeyword_15_0_0()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2965:1: ( 'Diagrams' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2966:1: 'Diagrams'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getViewpointAccess().getTypeDiagramsKeyword_15_0_0()); 
            }
            match(input,27,FOLLOW_27_in_rule__Viewpoint__TypeAssignment_15_05840); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getViewpointAccess().getTypeDiagramsKeyword_15_0_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getViewpointAccess().getTypeDiagramsKeyword_15_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Viewpoint__TypeAssignment_15_0"


    // $ANTLR start "rule__Viewpoint__VP_AspectsAssignment_15_1"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2981:1: rule__Viewpoint__VP_AspectsAssignment_15_1 : ( ( ruleFQN ) ) ;
    public final void rule__Viewpoint__VP_AspectsAssignment_15_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2985:1: ( ( ( ruleFQN ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2986:1: ( ( ruleFQN ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2986:1: ( ( ruleFQN ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2987:1: ( ruleFQN )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getViewpointAccess().getVP_AspectsDiagramSetCrossReference_15_1_0()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2988:1: ( ruleFQN )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:2989:1: ruleFQN
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getViewpointAccess().getVP_AspectsDiagramSetFQNParserRuleCall_15_1_0_1()); 
            }
            pushFollow(FOLLOW_ruleFQN_in_rule__Viewpoint__VP_AspectsAssignment_15_15883);
            ruleFQN();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getViewpointAccess().getVP_AspectsDiagramSetFQNParserRuleCall_15_1_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getViewpointAccess().getVP_AspectsDiagramSetCrossReference_15_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Viewpoint__VP_AspectsAssignment_15_1"


    // $ANTLR start "rule__Viewpoint__TypeAssignment_16_0"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:3000:1: rule__Viewpoint__TypeAssignment_16_0 : ( ( 'ActivityExplorer' ) ) ;
    public final void rule__Viewpoint__TypeAssignment_16_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:3004:1: ( ( ( 'ActivityExplorer' ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:3005:1: ( ( 'ActivityExplorer' ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:3005:1: ( ( 'ActivityExplorer' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:3006:1: ( 'ActivityExplorer' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getViewpointAccess().getTypeActivityExplorerKeyword_16_0_0()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:3007:1: ( 'ActivityExplorer' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:3008:1: 'ActivityExplorer'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getViewpointAccess().getTypeActivityExplorerKeyword_16_0_0()); 
            }
            match(input,28,FOLLOW_28_in_rule__Viewpoint__TypeAssignment_16_05923); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getViewpointAccess().getTypeActivityExplorerKeyword_16_0_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getViewpointAccess().getTypeActivityExplorerKeyword_16_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Viewpoint__TypeAssignment_16_0"


    // $ANTLR start "rule__Viewpoint__VP_AspectsAssignment_16_1"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:3023:1: rule__Viewpoint__VP_AspectsAssignment_16_1 : ( ( ruleFQN ) ) ;
    public final void rule__Viewpoint__VP_AspectsAssignment_16_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:3027:1: ( ( ( ruleFQN ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:3028:1: ( ( ruleFQN ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:3028:1: ( ( ruleFQN ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:3029:1: ( ruleFQN )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getViewpointAccess().getVP_AspectsViewpointActivityExplorerCrossReference_16_1_0()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:3030:1: ( ruleFQN )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:3031:1: ruleFQN
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getViewpointAccess().getVP_AspectsViewpointActivityExplorerFQNParserRuleCall_16_1_0_1()); 
            }
            pushFollow(FOLLOW_ruleFQN_in_rule__Viewpoint__VP_AspectsAssignment_16_15966);
            ruleFQN();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getViewpointAccess().getVP_AspectsViewpointActivityExplorerFQNParserRuleCall_16_1_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getViewpointAccess().getVP_AspectsViewpointActivityExplorerCrossReference_16_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Viewpoint__VP_AspectsAssignment_16_1"


    // $ANTLR start "rule__Viewpoint__TypeAssignment_17_0"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:3042:1: rule__Viewpoint__TypeAssignment_17_0 : ( ( 'Services' ) ) ;
    public final void rule__Viewpoint__TypeAssignment_17_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:3046:1: ( ( ( 'Services' ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:3047:1: ( ( 'Services' ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:3047:1: ( ( 'Services' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:3048:1: ( 'Services' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getViewpointAccess().getTypeServicesKeyword_17_0_0()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:3049:1: ( 'Services' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:3050:1: 'Services'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getViewpointAccess().getTypeServicesKeyword_17_0_0()); 
            }
            match(input,29,FOLLOW_29_in_rule__Viewpoint__TypeAssignment_17_06006); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getViewpointAccess().getTypeServicesKeyword_17_0_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getViewpointAccess().getTypeServicesKeyword_17_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Viewpoint__TypeAssignment_17_0"


    // $ANTLR start "rule__Viewpoint__VP_AspectsAssignment_17_1"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:3065:1: rule__Viewpoint__VP_AspectsAssignment_17_1 : ( ( ruleFQN ) ) ;
    public final void rule__Viewpoint__VP_AspectsAssignment_17_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:3069:1: ( ( ( ruleFQN ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:3070:1: ( ( ruleFQN ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:3070:1: ( ( ruleFQN ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:3071:1: ( ruleFQN )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getViewpointAccess().getVP_AspectsServiceSetCrossReference_17_1_0()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:3072:1: ( ruleFQN )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:3073:1: ruleFQN
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getViewpointAccess().getVP_AspectsServiceSetFQNParserRuleCall_17_1_0_1()); 
            }
            pushFollow(FOLLOW_ruleFQN_in_rule__Viewpoint__VP_AspectsAssignment_17_16049);
            ruleFQN();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getViewpointAccess().getVP_AspectsServiceSetFQNParserRuleCall_17_1_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getViewpointAccess().getVP_AspectsServiceSetCrossReference_17_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Viewpoint__VP_AspectsAssignment_17_1"


    // $ANTLR start "rule__Viewpoint__TypeAssignment_18_0"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:3084:1: rule__Viewpoint__TypeAssignment_18_0 : ( ( 'Build' ) ) ;
    public final void rule__Viewpoint__TypeAssignment_18_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:3088:1: ( ( ( 'Build' ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:3089:1: ( ( 'Build' ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:3089:1: ( ( 'Build' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:3090:1: ( 'Build' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getViewpointAccess().getTypeBuildKeyword_18_0_0()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:3091:1: ( 'Build' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:3092:1: 'Build'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getViewpointAccess().getTypeBuildKeyword_18_0_0()); 
            }
            match(input,30,FOLLOW_30_in_rule__Viewpoint__TypeAssignment_18_06089); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getViewpointAccess().getTypeBuildKeyword_18_0_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getViewpointAccess().getTypeBuildKeyword_18_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Viewpoint__TypeAssignment_18_0"


    // $ANTLR start "rule__Viewpoint__VP_AspectsAssignment_18_1"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:3107:1: rule__Viewpoint__VP_AspectsAssignment_18_1 : ( ( ruleFQN ) ) ;
    public final void rule__Viewpoint__VP_AspectsAssignment_18_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:3111:1: ( ( ( ruleFQN ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:3112:1: ( ( ruleFQN ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:3112:1: ( ( ruleFQN ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:3113:1: ( ruleFQN )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getViewpointAccess().getVP_AspectsBuildCrossReference_18_1_0()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:3114:1: ( ruleFQN )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:3115:1: ruleFQN
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getViewpointAccess().getVP_AspectsBuildFQNParserRuleCall_18_1_0_1()); 
            }
            pushFollow(FOLLOW_ruleFQN_in_rule__Viewpoint__VP_AspectsAssignment_18_16132);
            ruleFQN();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getViewpointAccess().getVP_AspectsBuildFQNParserRuleCall_18_1_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getViewpointAccess().getVP_AspectsBuildCrossReference_18_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Viewpoint__VP_AspectsAssignment_18_1"


    // $ANTLR start "rule__Viewpoint__TypeAssignment_19_0"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:3126:1: rule__Viewpoint__TypeAssignment_19_0 : ( ( 'Configuration' ) ) ;
    public final void rule__Viewpoint__TypeAssignment_19_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:3130:1: ( ( ( 'Configuration' ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:3131:1: ( ( 'Configuration' ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:3131:1: ( ( 'Configuration' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:3132:1: ( 'Configuration' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getViewpointAccess().getTypeConfigurationKeyword_19_0_0()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:3133:1: ( 'Configuration' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:3134:1: 'Configuration'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getViewpointAccess().getTypeConfigurationKeyword_19_0_0()); 
            }
            match(input,31,FOLLOW_31_in_rule__Viewpoint__TypeAssignment_19_06172); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getViewpointAccess().getTypeConfigurationKeyword_19_0_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getViewpointAccess().getTypeConfigurationKeyword_19_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Viewpoint__TypeAssignment_19_0"


    // $ANTLR start "rule__Viewpoint__VP_AspectsAssignment_19_1"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:3149:1: rule__Viewpoint__VP_AspectsAssignment_19_1 : ( ( ruleFQN ) ) ;
    public final void rule__Viewpoint__VP_AspectsAssignment_19_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:3153:1: ( ( ( ruleFQN ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:3154:1: ( ( ruleFQN ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:3154:1: ( ( ruleFQN ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:3155:1: ( ruleFQN )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getViewpointAccess().getVP_AspectsConfigurationCrossReference_19_1_0()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:3156:1: ( ruleFQN )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpspec.g:3157:1: ruleFQN
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getViewpointAccess().getVP_AspectsConfigurationFQNParserRuleCall_19_1_0_1()); 
            }
            pushFollow(FOLLOW_ruleFQN_in_rule__Viewpoint__VP_AspectsAssignment_19_16215);
            ruleFQN();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getViewpointAccess().getVP_AspectsConfigurationFQNParserRuleCall_19_1_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getViewpointAccess().getVP_AspectsConfigurationCrossReference_19_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Viewpoint__VP_AspectsAssignment_19_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleViewpoint_in_entryRuleViewpoint67 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleViewpoint74 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Viewpoint__Group__0_in_ruleViewpoint100 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEString_in_entryRuleEString127 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEString134 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EString__Alternatives_in_ruleEString160 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFQN_in_entryRuleFQN187 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFQN194 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FQN__Group__0_in_ruleFQN220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__EString__Alternatives260 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__EString__Alternatives277 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Viewpoint__Group__0__Impl_in_rule__Viewpoint__Group__0308 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_rule__Viewpoint__Group__1_in_rule__Viewpoint__Group__0311 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Viewpoint__Group__1__Impl_in_rule__Viewpoint__Group__1369 = new BitSet(new long[]{0x0000000000001020L});
    public static final BitSet FOLLOW_rule__Viewpoint__Group__2_in_rule__Viewpoint__Group__1372 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__Viewpoint__Group__1__Impl400 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Viewpoint__Group__2__Impl_in_rule__Viewpoint__Group__2431 = new BitSet(new long[]{0x0000000000001020L});
    public static final BitSet FOLLOW_rule__Viewpoint__Group__3_in_rule__Viewpoint__Group__2434 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Viewpoint__ShortNameAssignment_2_in_rule__Viewpoint__Group__2__Impl461 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Viewpoint__Group__3__Impl_in_rule__Viewpoint__Group__3492 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__Viewpoint__Group__4_in_rule__Viewpoint__Group__3495 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__Viewpoint__Group__3__Impl523 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Viewpoint__Group__4__Impl_in_rule__Viewpoint__Group__4554 = new BitSet(new long[]{0x00000000FDFDA000L});
    public static final BitSet FOLLOW_rule__Viewpoint__Group__5_in_rule__Viewpoint__Group__4557 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Viewpoint__Group_4__0_in_rule__Viewpoint__Group__4__Impl584 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Viewpoint__Group__5__Impl_in_rule__Viewpoint__Group__5614 = new BitSet(new long[]{0x00000000FDFDA000L});
    public static final BitSet FOLLOW_rule__Viewpoint__Group__6_in_rule__Viewpoint__Group__5617 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Viewpoint__Group_5__0_in_rule__Viewpoint__Group__5__Impl644 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Viewpoint__Group__6__Impl_in_rule__Viewpoint__Group__6675 = new BitSet(new long[]{0x00000000FDFDA000L});
    public static final BitSet FOLLOW_rule__Viewpoint__Group__7_in_rule__Viewpoint__Group__6678 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Viewpoint__Group_6__0_in_rule__Viewpoint__Group__6__Impl705 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Viewpoint__Group__7__Impl_in_rule__Viewpoint__Group__7736 = new BitSet(new long[]{0x00000000FDFDA000L});
    public static final BitSet FOLLOW_rule__Viewpoint__Group__8_in_rule__Viewpoint__Group__7739 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Viewpoint__Group_7__0_in_rule__Viewpoint__Group__7__Impl766 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Viewpoint__Group__8__Impl_in_rule__Viewpoint__Group__8797 = new BitSet(new long[]{0x00000000FDFDA000L});
    public static final BitSet FOLLOW_rule__Viewpoint__Group__9_in_rule__Viewpoint__Group__8800 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Viewpoint__Group_8__0_in_rule__Viewpoint__Group__8__Impl827 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Viewpoint__Group__9__Impl_in_rule__Viewpoint__Group__9858 = new BitSet(new long[]{0x00000000FDFDA000L});
    public static final BitSet FOLLOW_rule__Viewpoint__Group__10_in_rule__Viewpoint__Group__9861 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Viewpoint__Group_9__0_in_rule__Viewpoint__Group__9__Impl888 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Viewpoint__Group__10__Impl_in_rule__Viewpoint__Group__10919 = new BitSet(new long[]{0x00000000FDFDA000L});
    public static final BitSet FOLLOW_rule__Viewpoint__Group__11_in_rule__Viewpoint__Group__10922 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Viewpoint__Group_10__0_in_rule__Viewpoint__Group__10__Impl949 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Viewpoint__Group__11__Impl_in_rule__Viewpoint__Group__11980 = new BitSet(new long[]{0x00000000FDFDA000L});
    public static final BitSet FOLLOW_rule__Viewpoint__Group__12_in_rule__Viewpoint__Group__11983 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Viewpoint__Group_11__0_in_rule__Viewpoint__Group__11__Impl1010 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Viewpoint__Group__12__Impl_in_rule__Viewpoint__Group__121041 = new BitSet(new long[]{0x00000000FDFDA000L});
    public static final BitSet FOLLOW_rule__Viewpoint__Group__13_in_rule__Viewpoint__Group__121044 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Viewpoint__Group_12__0_in_rule__Viewpoint__Group__12__Impl1071 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Viewpoint__Group__13__Impl_in_rule__Viewpoint__Group__131102 = new BitSet(new long[]{0x00000000FDFDA000L});
    public static final BitSet FOLLOW_rule__Viewpoint__Group__14_in_rule__Viewpoint__Group__131105 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Viewpoint__Group_13__0_in_rule__Viewpoint__Group__13__Impl1132 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Viewpoint__Group__14__Impl_in_rule__Viewpoint__Group__141163 = new BitSet(new long[]{0x00000000FDFDA000L});
    public static final BitSet FOLLOW_rule__Viewpoint__Group__15_in_rule__Viewpoint__Group__141166 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Viewpoint__Group_14__0_in_rule__Viewpoint__Group__14__Impl1193 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Viewpoint__Group__15__Impl_in_rule__Viewpoint__Group__151224 = new BitSet(new long[]{0x00000000FDFDA000L});
    public static final BitSet FOLLOW_rule__Viewpoint__Group__16_in_rule__Viewpoint__Group__151227 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Viewpoint__Group_15__0_in_rule__Viewpoint__Group__15__Impl1254 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Viewpoint__Group__16__Impl_in_rule__Viewpoint__Group__161285 = new BitSet(new long[]{0x00000000FDFDA000L});
    public static final BitSet FOLLOW_rule__Viewpoint__Group__17_in_rule__Viewpoint__Group__161288 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Viewpoint__Group_16__0_in_rule__Viewpoint__Group__16__Impl1315 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Viewpoint__Group__17__Impl_in_rule__Viewpoint__Group__171346 = new BitSet(new long[]{0x00000000FDFDA000L});
    public static final BitSet FOLLOW_rule__Viewpoint__Group__18_in_rule__Viewpoint__Group__171349 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Viewpoint__Group_17__0_in_rule__Viewpoint__Group__17__Impl1376 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Viewpoint__Group__18__Impl_in_rule__Viewpoint__Group__181407 = new BitSet(new long[]{0x00000000FDFDA000L});
    public static final BitSet FOLLOW_rule__Viewpoint__Group__19_in_rule__Viewpoint__Group__181410 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Viewpoint__Group_18__0_in_rule__Viewpoint__Group__18__Impl1437 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Viewpoint__Group__19__Impl_in_rule__Viewpoint__Group__191468 = new BitSet(new long[]{0x00000000FDFDA000L});
    public static final BitSet FOLLOW_rule__Viewpoint__Group__20_in_rule__Viewpoint__Group__191471 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Viewpoint__Group_19__0_in_rule__Viewpoint__Group__19__Impl1498 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Viewpoint__Group__20__Impl_in_rule__Viewpoint__Group__201529 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Viewpoint__Group__20__Impl1557 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Viewpoint__Group_4__0__Impl_in_rule__Viewpoint__Group_4__01630 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Viewpoint__Group_4__1_in_rule__Viewpoint__Group_4__01633 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Viewpoint__Group_4__0__Impl1661 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Viewpoint__Group_4__1__Impl_in_rule__Viewpoint__Group_4__11692 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Viewpoint__NameAssignment_4_1_in_rule__Viewpoint__Group_4__1__Impl1719 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Viewpoint__Group_5__0__Impl_in_rule__Viewpoint__Group_5__01753 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_rule__Viewpoint__Group_5__1_in_rule__Viewpoint__Group_5__01756 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Viewpoint__Group_5__0__Impl1784 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Viewpoint__Group_5__1__Impl_in_rule__Viewpoint__Group_5__11815 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Viewpoint__DescriptionAssignment_5_1_in_rule__Viewpoint__Group_5__1__Impl1842 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Viewpoint__Group_6__0__Impl_in_rule__Viewpoint__Group_6__01876 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Viewpoint__Group_6__1_in_rule__Viewpoint__Group_6__01879 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Viewpoint__Group_6__0__Impl1907 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Viewpoint__Group_6__1__Impl_in_rule__Viewpoint__Group_6__11938 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__Viewpoint__Group_6__2_in_rule__Viewpoint__Group_6__11941 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Viewpoint__ParentsAssignment_6_1_in_rule__Viewpoint__Group_6__1__Impl1968 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Viewpoint__Group_6__2__Impl_in_rule__Viewpoint__Group_6__21998 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Viewpoint__Group_6_2__0_in_rule__Viewpoint__Group_6__2__Impl2025 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_rule__Viewpoint__Group_6_2__0__Impl_in_rule__Viewpoint__Group_6_2__02062 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Viewpoint__Group_6_2__1_in_rule__Viewpoint__Group_6_2__02065 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Viewpoint__Group_6_2__0__Impl2093 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Viewpoint__Group_6_2__1__Impl_in_rule__Viewpoint__Group_6_2__12124 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Viewpoint__ParentsAssignment_6_2_1_in_rule__Viewpoint__Group_6_2__1__Impl2151 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Viewpoint__Group_7__0__Impl_in_rule__Viewpoint__Group_7__02185 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Viewpoint__Group_7__1_in_rule__Viewpoint__Group_7__02188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Viewpoint__Group_7__0__Impl2216 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Viewpoint__Group_7__1__Impl_in_rule__Viewpoint__Group_7__12247 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__Viewpoint__Group_7__2_in_rule__Viewpoint__Group_7__12250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Viewpoint__DependenciesAssignment_7_1_in_rule__Viewpoint__Group_7__1__Impl2277 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Viewpoint__Group_7__2__Impl_in_rule__Viewpoint__Group_7__22307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Viewpoint__Group_7_2__0_in_rule__Viewpoint__Group_7__2__Impl2334 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_rule__Viewpoint__Group_7_2__0__Impl_in_rule__Viewpoint__Group_7_2__02371 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Viewpoint__Group_7_2__1_in_rule__Viewpoint__Group_7_2__02374 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Viewpoint__Group_7_2__0__Impl2402 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Viewpoint__Group_7_2__1__Impl_in_rule__Viewpoint__Group_7_2__12433 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Viewpoint__DependenciesAssignment_7_2_1_in_rule__Viewpoint__Group_7_2__1__Impl2460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Viewpoint__Group_8__0__Impl_in_rule__Viewpoint__Group_8__02494 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Viewpoint__Group_8__1_in_rule__Viewpoint__Group_8__02497 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Viewpoint__Group_8__0__Impl2525 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Viewpoint__Group_8__1__Impl_in_rule__Viewpoint__Group_8__12556 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__Viewpoint__Group_8__2_in_rule__Viewpoint__Group_8__12559 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Viewpoint__UseViewpointAssignment_8_1_in_rule__Viewpoint__Group_8__1__Impl2586 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Viewpoint__Group_8__2__Impl_in_rule__Viewpoint__Group_8__22616 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Viewpoint__Group_8_2__0_in_rule__Viewpoint__Group_8__2__Impl2643 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_rule__Viewpoint__Group_8_2__0__Impl_in_rule__Viewpoint__Group_8_2__02680 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Viewpoint__Group_8_2__1_in_rule__Viewpoint__Group_8_2__02683 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Viewpoint__Group_8_2__0__Impl2711 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Viewpoint__Group_8_2__1__Impl_in_rule__Viewpoint__Group_8_2__12742 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Viewpoint__UseViewpointAssignment_8_2_1_in_rule__Viewpoint__Group_8_2__1__Impl2769 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Viewpoint__Group_9__0__Impl_in_rule__Viewpoint__Group_9__02803 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_rule__Viewpoint__Group_9__1_in_rule__Viewpoint__Group_9__02806 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Viewpoint__Group_9__0__Impl2834 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Viewpoint__Group_9__1__Impl_in_rule__Viewpoint__Group_9__12865 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__Viewpoint__Group_9__2_in_rule__Viewpoint__Group_9__12868 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Viewpoint__UseAnyEMFResourceAssignment_9_1_in_rule__Viewpoint__Group_9__1__Impl2895 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Viewpoint__Group_9__2__Impl_in_rule__Viewpoint__Group_9__22925 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Viewpoint__Group_9_2__0_in_rule__Viewpoint__Group_9__2__Impl2952 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_rule__Viewpoint__Group_9_2__0__Impl_in_rule__Viewpoint__Group_9_2__02989 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_rule__Viewpoint__Group_9_2__1_in_rule__Viewpoint__Group_9_2__02992 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Viewpoint__Group_9_2__0__Impl3020 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Viewpoint__Group_9_2__1__Impl_in_rule__Viewpoint__Group_9_2__13051 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Viewpoint__UseAnyEMFResourceAssignment_9_2_1_in_rule__Viewpoint__Group_9_2__1__Impl3078 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Viewpoint__Group_10__0__Impl_in_rule__Viewpoint__Group_10__03112 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_rule__Viewpoint__Group_10__1_in_rule__Viewpoint__Group_10__03115 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Viewpoint__Group_10__0__Impl3143 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Viewpoint__Group_10__1__Impl_in_rule__Viewpoint__Group_10__13174 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__Viewpoint__Group_10__2_in_rule__Viewpoint__Group_10__13177 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Viewpoint__UseDiagramResourceAssignment_10_1_in_rule__Viewpoint__Group_10__1__Impl3204 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Viewpoint__Group_10__2__Impl_in_rule__Viewpoint__Group_10__23234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Viewpoint__Group_10_2__0_in_rule__Viewpoint__Group_10__2__Impl3261 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_rule__Viewpoint__Group_10_2__0__Impl_in_rule__Viewpoint__Group_10_2__03298 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_rule__Viewpoint__Group_10_2__1_in_rule__Viewpoint__Group_10_2__03301 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Viewpoint__Group_10_2__0__Impl3329 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Viewpoint__Group_10_2__1__Impl_in_rule__Viewpoint__Group_10_2__13360 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Viewpoint__UseDiagramResourceAssignment_10_2_1_in_rule__Viewpoint__Group_10_2__1__Impl3387 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Viewpoint__Group_11__0__Impl_in_rule__Viewpoint__Group_11__03421 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_rule__Viewpoint__Group_11__1_in_rule__Viewpoint__Group_11__03424 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Viewpoint__Group_11__0__Impl3452 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Viewpoint__Group_11__1__Impl_in_rule__Viewpoint__Group_11__13483 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__Viewpoint__Group_11__2_in_rule__Viewpoint__Group_11__13486 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Viewpoint__UseWorkspaceResourceAssignment_11_1_in_rule__Viewpoint__Group_11__1__Impl3513 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Viewpoint__Group_11__2__Impl_in_rule__Viewpoint__Group_11__23543 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Viewpoint__Group_11_2__0_in_rule__Viewpoint__Group_11__2__Impl3570 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_rule__Viewpoint__Group_11_2__0__Impl_in_rule__Viewpoint__Group_11_2__03607 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_rule__Viewpoint__Group_11_2__1_in_rule__Viewpoint__Group_11_2__03610 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Viewpoint__Group_11_2__0__Impl3638 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Viewpoint__Group_11_2__1__Impl_in_rule__Viewpoint__Group_11_2__13669 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Viewpoint__UseWorkspaceResourceAssignment_11_2_1_in_rule__Viewpoint__Group_11_2__1__Impl3696 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Viewpoint__Group_12__0__Impl_in_rule__Viewpoint__Group_12__03730 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_rule__Viewpoint__Group_12__1_in_rule__Viewpoint__Group_12__03733 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Viewpoint__Group_12__0__Impl3761 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Viewpoint__Group_12__1__Impl_in_rule__Viewpoint__Group_12__13792 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__Viewpoint__Group_12__2_in_rule__Viewpoint__Group_12__13795 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Viewpoint__UseFSResourceAssignment_12_1_in_rule__Viewpoint__Group_12__1__Impl3822 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Viewpoint__Group_12__2__Impl_in_rule__Viewpoint__Group_12__23852 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Viewpoint__Group_12_2__0_in_rule__Viewpoint__Group_12__2__Impl3879 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_rule__Viewpoint__Group_12_2__0__Impl_in_rule__Viewpoint__Group_12_2__03916 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_rule__Viewpoint__Group_12_2__1_in_rule__Viewpoint__Group_12_2__03919 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Viewpoint__Group_12_2__0__Impl3947 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Viewpoint__Group_12_2__1__Impl_in_rule__Viewpoint__Group_12_2__13978 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Viewpoint__UseFSResourceAssignment_12_2_1_in_rule__Viewpoint__Group_12_2__1__Impl4005 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Viewpoint__Group_13__0__Impl_in_rule__Viewpoint__Group_13__04039 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Viewpoint__Group_13__1_in_rule__Viewpoint__Group_13__04042 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Viewpoint__Group_13__0__Impl4070 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Viewpoint__Group_13__1__Impl_in_rule__Viewpoint__Group_13__14101 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Viewpoint__VP_DataAssignment_13_1_in_rule__Viewpoint__Group_13__1__Impl4128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Viewpoint__Group_14__0__Impl_in_rule__Viewpoint__Group_14__04162 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Viewpoint__Group_14__1_in_rule__Viewpoint__Group_14__04165 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Viewpoint__TypeAssignment_14_0_in_rule__Viewpoint__Group_14__0__Impl4192 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Viewpoint__Group_14__1__Impl_in_rule__Viewpoint__Group_14__14222 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Viewpoint__VP_AspectsAssignment_14_1_in_rule__Viewpoint__Group_14__1__Impl4249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Viewpoint__Group_15__0__Impl_in_rule__Viewpoint__Group_15__04283 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Viewpoint__Group_15__1_in_rule__Viewpoint__Group_15__04286 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Viewpoint__TypeAssignment_15_0_in_rule__Viewpoint__Group_15__0__Impl4313 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Viewpoint__Group_15__1__Impl_in_rule__Viewpoint__Group_15__14343 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Viewpoint__VP_AspectsAssignment_15_1_in_rule__Viewpoint__Group_15__1__Impl4370 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Viewpoint__Group_16__0__Impl_in_rule__Viewpoint__Group_16__04404 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Viewpoint__Group_16__1_in_rule__Viewpoint__Group_16__04407 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Viewpoint__TypeAssignment_16_0_in_rule__Viewpoint__Group_16__0__Impl4434 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Viewpoint__Group_16__1__Impl_in_rule__Viewpoint__Group_16__14464 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Viewpoint__VP_AspectsAssignment_16_1_in_rule__Viewpoint__Group_16__1__Impl4491 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Viewpoint__Group_17__0__Impl_in_rule__Viewpoint__Group_17__04525 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Viewpoint__Group_17__1_in_rule__Viewpoint__Group_17__04528 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Viewpoint__TypeAssignment_17_0_in_rule__Viewpoint__Group_17__0__Impl4555 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Viewpoint__Group_17__1__Impl_in_rule__Viewpoint__Group_17__14585 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Viewpoint__VP_AspectsAssignment_17_1_in_rule__Viewpoint__Group_17__1__Impl4612 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Viewpoint__Group_18__0__Impl_in_rule__Viewpoint__Group_18__04646 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Viewpoint__Group_18__1_in_rule__Viewpoint__Group_18__04649 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Viewpoint__TypeAssignment_18_0_in_rule__Viewpoint__Group_18__0__Impl4676 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Viewpoint__Group_18__1__Impl_in_rule__Viewpoint__Group_18__14706 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Viewpoint__VP_AspectsAssignment_18_1_in_rule__Viewpoint__Group_18__1__Impl4733 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Viewpoint__Group_19__0__Impl_in_rule__Viewpoint__Group_19__04767 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Viewpoint__Group_19__1_in_rule__Viewpoint__Group_19__04770 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Viewpoint__TypeAssignment_19_0_in_rule__Viewpoint__Group_19__0__Impl4797 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Viewpoint__Group_19__1__Impl_in_rule__Viewpoint__Group_19__14827 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Viewpoint__VP_AspectsAssignment_19_1_in_rule__Viewpoint__Group_19__1__Impl4854 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FQN__Group__0__Impl_in_rule__FQN__Group__04888 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__FQN__Group__1_in_rule__FQN__Group__04891 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__FQN__Group__0__Impl4918 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FQN__Group__1__Impl_in_rule__FQN__Group__14947 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FQN__Group_1__0_in_rule__FQN__Group__1__Impl4974 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_rule__FQN__Group_1__0__Impl_in_rule__FQN__Group_1__05009 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__FQN__Group_1__1_in_rule__FQN__Group_1__05012 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__FQN__Group_1__0__Impl5040 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FQN__Group_1__1__Impl_in_rule__FQN__Group_1__15071 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__FQN__Group_1__1__Impl5099 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Viewpoint__ShortNameAssignment_25138 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Viewpoint__NameAssignment_4_15169 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEString_in_rule__Viewpoint__DescriptionAssignment_5_15200 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFQN_in_rule__Viewpoint__ParentsAssignment_6_15235 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFQN_in_rule__Viewpoint__ParentsAssignment_6_2_15274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFQN_in_rule__Viewpoint__DependenciesAssignment_7_15313 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFQN_in_rule__Viewpoint__DependenciesAssignment_7_2_15352 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFQN_in_rule__Viewpoint__UseViewpointAssignment_8_15391 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFQN_in_rule__Viewpoint__UseViewpointAssignment_8_2_15430 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEString_in_rule__Viewpoint__UseAnyEMFResourceAssignment_9_15465 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEString_in_rule__Viewpoint__UseAnyEMFResourceAssignment_9_2_15496 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEString_in_rule__Viewpoint__UseDiagramResourceAssignment_10_15527 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEString_in_rule__Viewpoint__UseDiagramResourceAssignment_10_2_15558 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEString_in_rule__Viewpoint__UseWorkspaceResourceAssignment_11_15589 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEString_in_rule__Viewpoint__UseWorkspaceResourceAssignment_11_2_15620 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEString_in_rule__Viewpoint__UseFSResourceAssignment_12_15651 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEString_in_rule__Viewpoint__UseFSResourceAssignment_12_2_15682 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFQN_in_rule__Viewpoint__VP_DataAssignment_13_15717 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Viewpoint__TypeAssignment_14_05757 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFQN_in_rule__Viewpoint__VP_AspectsAssignment_14_15800 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__Viewpoint__TypeAssignment_15_05840 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFQN_in_rule__Viewpoint__VP_AspectsAssignment_15_15883 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__Viewpoint__TypeAssignment_16_05923 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFQN_in_rule__Viewpoint__VP_AspectsAssignment_16_15966 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__Viewpoint__TypeAssignment_17_06006 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFQN_in_rule__Viewpoint__VP_AspectsAssignment_17_16049 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__Viewpoint__TypeAssignment_18_06089 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFQN_in_rule__Viewpoint__VP_AspectsAssignment_18_16132 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__Viewpoint__TypeAssignment_19_06172 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFQN_in_rule__Viewpoint__VP_AspectsAssignment_19_16215 = new BitSet(new long[]{0x0000000000000002L});

}
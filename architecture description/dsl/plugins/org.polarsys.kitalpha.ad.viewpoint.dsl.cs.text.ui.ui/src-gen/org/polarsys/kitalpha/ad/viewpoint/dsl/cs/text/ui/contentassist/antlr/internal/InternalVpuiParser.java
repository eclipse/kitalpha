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
import org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.VpuiGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalVpuiParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'text'", "'textarea'", "'checkbox'", "'radiobox'", "'simpleChoiceList'", "'multipleChoiceList'", "'import'", "'UIDescription'", "'{'", "'}'", "'UI'", "'label:'", "'Container'", "'description:'", "'for'", "'Field'", "','", "'type'", "'mapped-to'", "'.'"
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


        public InternalVpuiParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalVpuiParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalVpuiParser.tokenNames; }
    public String getGrammarFileName() { return "../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g"; }


     
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




    // $ANTLR start "entryRuleUserInterface"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:61:1: entryRuleUserInterface : ruleUserInterface EOF ;
    public final void entryRuleUserInterface() throws RecognitionException {
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:62:1: ( ruleUserInterface EOF )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:63:1: ruleUserInterface EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUserInterfaceRule()); 
            }
            pushFollow(FOLLOW_ruleUserInterface_in_entryRuleUserInterface67);
            ruleUserInterface();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getUserInterfaceRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleUserInterface74); if (state.failed) return ;

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
    // $ANTLR end "entryRuleUserInterface"


    // $ANTLR start "ruleUserInterface"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:70:1: ruleUserInterface : ( ( rule__UserInterface__Group__0 ) ) ;
    public final void ruleUserInterface() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:74:2: ( ( ( rule__UserInterface__Group__0 ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:75:1: ( ( rule__UserInterface__Group__0 ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:75:1: ( ( rule__UserInterface__Group__0 ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:76:1: ( rule__UserInterface__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUserInterfaceAccess().getGroup()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:77:1: ( rule__UserInterface__Group__0 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:77:2: rule__UserInterface__Group__0
            {
            pushFollow(FOLLOW_rule__UserInterface__Group__0_in_ruleUserInterface100);
            rule__UserInterface__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getUserInterfaceAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleUserInterface"


    // $ANTLR start "entryRuleImport"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:89:1: entryRuleImport : ruleImport EOF ;
    public final void entryRuleImport() throws RecognitionException {
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:90:1: ( ruleImport EOF )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:91:1: ruleImport EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImportRule()); 
            }
            pushFollow(FOLLOW_ruleImport_in_entryRuleImport127);
            ruleImport();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getImportRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleImport134); if (state.failed) return ;

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
    // $ANTLR end "entryRuleImport"


    // $ANTLR start "ruleImport"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:98:1: ruleImport : ( ( rule__Import__Group__0 ) ) ;
    public final void ruleImport() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:102:2: ( ( ( rule__Import__Group__0 ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:103:1: ( ( rule__Import__Group__0 ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:103:1: ( ( rule__Import__Group__0 ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:104:1: ( rule__Import__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImportAccess().getGroup()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:105:1: ( rule__Import__Group__0 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:105:2: rule__Import__Group__0
            {
            pushFollow(FOLLOW_rule__Import__Group__0_in_ruleImport160);
            rule__Import__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getImportAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleImport"


    // $ANTLR start "entryRuleAspect"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:117:1: entryRuleAspect : ruleAspect EOF ;
    public final void entryRuleAspect() throws RecognitionException {
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:118:1: ( ruleAspect EOF )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:119:1: ruleAspect EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAspectRule()); 
            }
            pushFollow(FOLLOW_ruleAspect_in_entryRuleAspect187);
            ruleAspect();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAspectRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAspect194); if (state.failed) return ;

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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:126:1: ruleAspect : ( ruleUIDescription ) ;
    public final void ruleAspect() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:130:2: ( ( ruleUIDescription ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:131:1: ( ruleUIDescription )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:131:1: ( ruleUIDescription )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:132:1: ruleUIDescription
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAspectAccess().getUIDescriptionParserRuleCall()); 
            }
            pushFollow(FOLLOW_ruleUIDescription_in_ruleAspect220);
            ruleUIDescription();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAspectAccess().getUIDescriptionParserRuleCall()); 
            }

            }


            }

        }
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


    // $ANTLR start "entryRuleUIDescription"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:145:1: entryRuleUIDescription : ruleUIDescription EOF ;
    public final void entryRuleUIDescription() throws RecognitionException {
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:146:1: ( ruleUIDescription EOF )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:147:1: ruleUIDescription EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUIDescriptionRule()); 
            }
            pushFollow(FOLLOW_ruleUIDescription_in_entryRuleUIDescription246);
            ruleUIDescription();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getUIDescriptionRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleUIDescription253); if (state.failed) return ;

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
    // $ANTLR end "entryRuleUIDescription"


    // $ANTLR start "ruleUIDescription"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:154:1: ruleUIDescription : ( ( rule__UIDescription__Group__0 ) ) ;
    public final void ruleUIDescription() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:158:2: ( ( ( rule__UIDescription__Group__0 ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:159:1: ( ( rule__UIDescription__Group__0 ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:159:1: ( ( rule__UIDescription__Group__0 ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:160:1: ( rule__UIDescription__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUIDescriptionAccess().getGroup()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:161:1: ( rule__UIDescription__Group__0 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:161:2: rule__UIDescription__Group__0
            {
            pushFollow(FOLLOW_rule__UIDescription__Group__0_in_ruleUIDescription279);
            rule__UIDescription__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getUIDescriptionAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleUIDescription"


    // $ANTLR start "entryRuleUI"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:175:1: entryRuleUI : ruleUI EOF ;
    public final void entryRuleUI() throws RecognitionException {
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:176:1: ( ruleUI EOF )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:177:1: ruleUI EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUIRule()); 
            }
            pushFollow(FOLLOW_ruleUI_in_entryRuleUI308);
            ruleUI();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getUIRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleUI315); if (state.failed) return ;

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
    // $ANTLR end "entryRuleUI"


    // $ANTLR start "ruleUI"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:184:1: ruleUI : ( ( rule__UI__Group__0 ) ) ;
    public final void ruleUI() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:188:2: ( ( ( rule__UI__Group__0 ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:189:1: ( ( rule__UI__Group__0 ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:189:1: ( ( rule__UI__Group__0 ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:190:1: ( rule__UI__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUIAccess().getGroup()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:191:1: ( rule__UI__Group__0 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:191:2: rule__UI__Group__0
            {
            pushFollow(FOLLOW_rule__UI__Group__0_in_ruleUI341);
            rule__UI__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getUIAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleUI"


    // $ANTLR start "entryRuleUIContainer"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:203:1: entryRuleUIContainer : ruleUIContainer EOF ;
    public final void entryRuleUIContainer() throws RecognitionException {
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:204:1: ( ruleUIContainer EOF )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:205:1: ruleUIContainer EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUIContainerRule()); 
            }
            pushFollow(FOLLOW_ruleUIContainer_in_entryRuleUIContainer368);
            ruleUIContainer();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getUIContainerRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleUIContainer375); if (state.failed) return ;

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
    // $ANTLR end "entryRuleUIContainer"


    // $ANTLR start "ruleUIContainer"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:212:1: ruleUIContainer : ( ( rule__UIContainer__Group__0 ) ) ;
    public final void ruleUIContainer() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:216:2: ( ( ( rule__UIContainer__Group__0 ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:217:1: ( ( rule__UIContainer__Group__0 ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:217:1: ( ( rule__UIContainer__Group__0 ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:218:1: ( rule__UIContainer__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUIContainerAccess().getGroup()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:219:1: ( rule__UIContainer__Group__0 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:219:2: rule__UIContainer__Group__0
            {
            pushFollow(FOLLOW_rule__UIContainer__Group__0_in_ruleUIContainer401);
            rule__UIContainer__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getUIContainerAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleUIContainer"


    // $ANTLR start "entryRuleDataSource"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:231:1: entryRuleDataSource : ruleDataSource EOF ;
    public final void entryRuleDataSource() throws RecognitionException {
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:232:1: ( ruleDataSource EOF )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:233:1: ruleDataSource EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDataSourceRule()); 
            }
            pushFollow(FOLLOW_ruleDataSource_in_entryRuleDataSource428);
            ruleDataSource();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDataSourceRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDataSource435); if (state.failed) return ;

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
    // $ANTLR end "entryRuleDataSource"


    // $ANTLR start "ruleDataSource"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:240:1: ruleDataSource : ( ruleLocalClass ) ;
    public final void ruleDataSource() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:244:2: ( ( ruleLocalClass ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:245:1: ( ruleLocalClass )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:245:1: ( ruleLocalClass )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:246:1: ruleLocalClass
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDataSourceAccess().getLocalClassParserRuleCall()); 
            }
            pushFollow(FOLLOW_ruleLocalClass_in_ruleDataSource461);
            ruleLocalClass();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDataSourceAccess().getLocalClassParserRuleCall()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDataSource"


    // $ANTLR start "entryRuleLocalClass"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:259:1: entryRuleLocalClass : ruleLocalClass EOF ;
    public final void entryRuleLocalClass() throws RecognitionException {
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:260:1: ( ruleLocalClass EOF )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:261:1: ruleLocalClass EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLocalClassRule()); 
            }
            pushFollow(FOLLOW_ruleLocalClass_in_entryRuleLocalClass487);
            ruleLocalClass();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLocalClassRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLocalClass494); if (state.failed) return ;

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
    // $ANTLR end "entryRuleLocalClass"


    // $ANTLR start "ruleLocalClass"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:268:1: ruleLocalClass : ( ( rule__LocalClass__Group__0 ) ) ;
    public final void ruleLocalClass() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:272:2: ( ( ( rule__LocalClass__Group__0 ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:273:1: ( ( rule__LocalClass__Group__0 ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:273:1: ( ( rule__LocalClass__Group__0 ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:274:1: ( rule__LocalClass__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLocalClassAccess().getGroup()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:275:1: ( rule__LocalClass__Group__0 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:275:2: rule__LocalClass__Group__0
            {
            pushFollow(FOLLOW_rule__LocalClass__Group__0_in_ruleLocalClass520);
            rule__LocalClass__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLocalClassAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLocalClass"


    // $ANTLR start "entryRuleUIField"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:287:1: entryRuleUIField : ruleUIField EOF ;
    public final void entryRuleUIField() throws RecognitionException {
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:288:1: ( ruleUIField EOF )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:289:1: ruleUIField EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUIFieldRule()); 
            }
            pushFollow(FOLLOW_ruleUIField_in_entryRuleUIField547);
            ruleUIField();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getUIFieldRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleUIField554); if (state.failed) return ;

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
    // $ANTLR end "entryRuleUIField"


    // $ANTLR start "ruleUIField"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:296:1: ruleUIField : ( ( rule__UIField__Group__0 ) ) ;
    public final void ruleUIField() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:300:2: ( ( ( rule__UIField__Group__0 ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:301:1: ( ( rule__UIField__Group__0 ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:301:1: ( ( rule__UIField__Group__0 ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:302:1: ( rule__UIField__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUIFieldAccess().getGroup()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:303:1: ( rule__UIField__Group__0 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:303:2: rule__UIField__Group__0
            {
            pushFollow(FOLLOW_rule__UIField__Group__0_in_ruleUIField580);
            rule__UIField__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getUIFieldAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleUIField"


    // $ANTLR start "entryRuleFieldMapping"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:315:1: entryRuleFieldMapping : ruleFieldMapping EOF ;
    public final void entryRuleFieldMapping() throws RecognitionException {
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:316:1: ( ruleFieldMapping EOF )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:317:1: ruleFieldMapping EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldMappingRule()); 
            }
            pushFollow(FOLLOW_ruleFieldMapping_in_entryRuleFieldMapping607);
            ruleFieldMapping();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFieldMappingRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFieldMapping614); if (state.failed) return ;

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
    // $ANTLR end "entryRuleFieldMapping"


    // $ANTLR start "ruleFieldMapping"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:324:1: ruleFieldMapping : ( ( rule__FieldMapping__Group__0 ) ) ;
    public final void ruleFieldMapping() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:328:2: ( ( ( rule__FieldMapping__Group__0 ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:329:1: ( ( rule__FieldMapping__Group__0 ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:329:1: ( ( rule__FieldMapping__Group__0 ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:330:1: ( rule__FieldMapping__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldMappingAccess().getGroup()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:331:1: ( rule__FieldMapping__Group__0 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:331:2: rule__FieldMapping__Group__0
            {
            pushFollow(FOLLOW_rule__FieldMapping__Group__0_in_ruleFieldMapping640);
            rule__FieldMapping__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFieldMappingAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFieldMapping"


    // $ANTLR start "entryRuleEString"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:343:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:344:1: ( ruleEString EOF )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:345:1: ruleEString EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEStringRule()); 
            }
            pushFollow(FOLLOW_ruleEString_in_entryRuleEString667);
            ruleEString();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEStringRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEString674); if (state.failed) return ;

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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:352:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:356:2: ( ( ( rule__EString__Alternatives ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:357:1: ( ( rule__EString__Alternatives ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:357:1: ( ( rule__EString__Alternatives ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:358:1: ( rule__EString__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEStringAccess().getAlternatives()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:359:1: ( rule__EString__Alternatives )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:359:2: rule__EString__Alternatives
            {
            pushFollow(FOLLOW_rule__EString__Alternatives_in_ruleEString700);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:371:1: entryRuleFQN : ruleFQN EOF ;
    public final void entryRuleFQN() throws RecognitionException {
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:372:1: ( ruleFQN EOF )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:373:1: ruleFQN EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFQNRule()); 
            }
            pushFollow(FOLLOW_ruleFQN_in_entryRuleFQN727);
            ruleFQN();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFQNRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFQN734); if (state.failed) return ;

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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:380:1: ruleFQN : ( ( rule__FQN__Group__0 ) ) ;
    public final void ruleFQN() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:384:2: ( ( ( rule__FQN__Group__0 ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:385:1: ( ( rule__FQN__Group__0 ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:385:1: ( ( rule__FQN__Group__0 ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:386:1: ( rule__FQN__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFQNAccess().getGroup()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:387:1: ( rule__FQN__Group__0 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:387:2: rule__FQN__Group__0
            {
            pushFollow(FOLLOW_rule__FQN__Group__0_in_ruleFQN760);
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


    // $ANTLR start "ruleUI_Field_Type"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:404:1: ruleUI_Field_Type : ( ( rule__UI_Field_Type__Alternatives ) ) ;
    public final void ruleUI_Field_Type() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:408:1: ( ( ( rule__UI_Field_Type__Alternatives ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:409:1: ( ( rule__UI_Field_Type__Alternatives ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:409:1: ( ( rule__UI_Field_Type__Alternatives ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:410:1: ( rule__UI_Field_Type__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUI_Field_TypeAccess().getAlternatives()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:411:1: ( rule__UI_Field_Type__Alternatives )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:411:2: rule__UI_Field_Type__Alternatives
            {
            pushFollow(FOLLOW_rule__UI_Field_Type__Alternatives_in_ruleUI_Field_Type801);
            rule__UI_Field_Type__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getUI_Field_TypeAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleUI_Field_Type"


    // $ANTLR start "rule__EString__Alternatives"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:423:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:427:1: ( ( RULE_STRING ) | ( RULE_ID ) )
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
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:428:1: ( RULE_STRING )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:428:1: ( RULE_STRING )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:429:1: RULE_STRING
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    }
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__EString__Alternatives837); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:434:6: ( RULE_ID )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:434:6: ( RULE_ID )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:435:1: RULE_ID
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                    }
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__EString__Alternatives854); if (state.failed) return ;
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


    // $ANTLR start "rule__UI_Field_Type__Alternatives"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:446:1: rule__UI_Field_Type__Alternatives : ( ( ( 'text' ) ) | ( ( 'textarea' ) ) | ( ( 'checkbox' ) ) | ( ( 'radiobox' ) ) | ( ( 'simpleChoiceList' ) ) | ( ( 'multipleChoiceList' ) ) );
    public final void rule__UI_Field_Type__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:450:1: ( ( ( 'text' ) ) | ( ( 'textarea' ) ) | ( ( 'checkbox' ) ) | ( ( 'radiobox' ) ) | ( ( 'simpleChoiceList' ) ) | ( ( 'multipleChoiceList' ) ) )
            int alt2=6;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt2=1;
                }
                break;
            case 12:
                {
                alt2=2;
                }
                break;
            case 13:
                {
                alt2=3;
                }
                break;
            case 14:
                {
                alt2=4;
                }
                break;
            case 15:
                {
                alt2=5;
                }
                break;
            case 16:
                {
                alt2=6;
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
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:451:1: ( ( 'text' ) )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:451:1: ( ( 'text' ) )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:452:1: ( 'text' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getUI_Field_TypeAccess().getTextEnumLiteralDeclaration_0()); 
                    }
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:453:1: ( 'text' )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:453:3: 'text'
                    {
                    match(input,11,FOLLOW_11_in_rule__UI_Field_Type__Alternatives888); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getUI_Field_TypeAccess().getTextEnumLiteralDeclaration_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:458:6: ( ( 'textarea' ) )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:458:6: ( ( 'textarea' ) )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:459:1: ( 'textarea' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getUI_Field_TypeAccess().getTextareaEnumLiteralDeclaration_1()); 
                    }
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:460:1: ( 'textarea' )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:460:3: 'textarea'
                    {
                    match(input,12,FOLLOW_12_in_rule__UI_Field_Type__Alternatives909); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getUI_Field_TypeAccess().getTextareaEnumLiteralDeclaration_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:465:6: ( ( 'checkbox' ) )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:465:6: ( ( 'checkbox' ) )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:466:1: ( 'checkbox' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getUI_Field_TypeAccess().getCheckboxEnumLiteralDeclaration_2()); 
                    }
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:467:1: ( 'checkbox' )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:467:3: 'checkbox'
                    {
                    match(input,13,FOLLOW_13_in_rule__UI_Field_Type__Alternatives930); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getUI_Field_TypeAccess().getCheckboxEnumLiteralDeclaration_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:472:6: ( ( 'radiobox' ) )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:472:6: ( ( 'radiobox' ) )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:473:1: ( 'radiobox' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getUI_Field_TypeAccess().getRadioboxEnumLiteralDeclaration_3()); 
                    }
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:474:1: ( 'radiobox' )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:474:3: 'radiobox'
                    {
                    match(input,14,FOLLOW_14_in_rule__UI_Field_Type__Alternatives951); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getUI_Field_TypeAccess().getRadioboxEnumLiteralDeclaration_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:479:6: ( ( 'simpleChoiceList' ) )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:479:6: ( ( 'simpleChoiceList' ) )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:480:1: ( 'simpleChoiceList' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getUI_Field_TypeAccess().getSimpleChoiceListEnumLiteralDeclaration_4()); 
                    }
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:481:1: ( 'simpleChoiceList' )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:481:3: 'simpleChoiceList'
                    {
                    match(input,15,FOLLOW_15_in_rule__UI_Field_Type__Alternatives972); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getUI_Field_TypeAccess().getSimpleChoiceListEnumLiteralDeclaration_4()); 
                    }

                    }


                    }
                    break;
                case 6 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:486:6: ( ( 'multipleChoiceList' ) )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:486:6: ( ( 'multipleChoiceList' ) )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:487:1: ( 'multipleChoiceList' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getUI_Field_TypeAccess().getMultipleChoiceListEnumLiteralDeclaration_5()); 
                    }
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:488:1: ( 'multipleChoiceList' )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:488:3: 'multipleChoiceList'
                    {
                    match(input,16,FOLLOW_16_in_rule__UI_Field_Type__Alternatives993); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getUI_Field_TypeAccess().getMultipleChoiceListEnumLiteralDeclaration_5()); 
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
    // $ANTLR end "rule__UI_Field_Type__Alternatives"


    // $ANTLR start "rule__UserInterface__Group__0"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:500:1: rule__UserInterface__Group__0 : rule__UserInterface__Group__0__Impl rule__UserInterface__Group__1 ;
    public final void rule__UserInterface__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:504:1: ( rule__UserInterface__Group__0__Impl rule__UserInterface__Group__1 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:505:2: rule__UserInterface__Group__0__Impl rule__UserInterface__Group__1
            {
            pushFollow(FOLLOW_rule__UserInterface__Group__0__Impl_in_rule__UserInterface__Group__01026);
            rule__UserInterface__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__UserInterface__Group__1_in_rule__UserInterface__Group__01029);
            rule__UserInterface__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UserInterface__Group__0"


    // $ANTLR start "rule__UserInterface__Group__0__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:512:1: rule__UserInterface__Group__0__Impl : ( () ) ;
    public final void rule__UserInterface__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:516:1: ( ( () ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:517:1: ( () )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:517:1: ( () )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:518:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUserInterfaceAccess().getUserInterfaceAction_0()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:519:1: ()
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:521:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getUserInterfaceAccess().getUserInterfaceAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UserInterface__Group__0__Impl"


    // $ANTLR start "rule__UserInterface__Group__1"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:531:1: rule__UserInterface__Group__1 : rule__UserInterface__Group__1__Impl rule__UserInterface__Group__2 ;
    public final void rule__UserInterface__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:535:1: ( rule__UserInterface__Group__1__Impl rule__UserInterface__Group__2 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:536:2: rule__UserInterface__Group__1__Impl rule__UserInterface__Group__2
            {
            pushFollow(FOLLOW_rule__UserInterface__Group__1__Impl_in_rule__UserInterface__Group__11087);
            rule__UserInterface__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__UserInterface__Group__2_in_rule__UserInterface__Group__11090);
            rule__UserInterface__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UserInterface__Group__1"


    // $ANTLR start "rule__UserInterface__Group__1__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:543:1: rule__UserInterface__Group__1__Impl : ( ( rule__UserInterface__ImportsAssignment_1 )* ) ;
    public final void rule__UserInterface__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:547:1: ( ( ( rule__UserInterface__ImportsAssignment_1 )* ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:548:1: ( ( rule__UserInterface__ImportsAssignment_1 )* )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:548:1: ( ( rule__UserInterface__ImportsAssignment_1 )* )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:549:1: ( rule__UserInterface__ImportsAssignment_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUserInterfaceAccess().getImportsAssignment_1()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:550:1: ( rule__UserInterface__ImportsAssignment_1 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==17) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:550:2: rule__UserInterface__ImportsAssignment_1
            	    {
            	    pushFollow(FOLLOW_rule__UserInterface__ImportsAssignment_1_in_rule__UserInterface__Group__1__Impl1117);
            	    rule__UserInterface__ImportsAssignment_1();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getUserInterfaceAccess().getImportsAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UserInterface__Group__1__Impl"


    // $ANTLR start "rule__UserInterface__Group__2"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:560:1: rule__UserInterface__Group__2 : rule__UserInterface__Group__2__Impl ;
    public final void rule__UserInterface__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:564:1: ( rule__UserInterface__Group__2__Impl )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:565:2: rule__UserInterface__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__UserInterface__Group__2__Impl_in_rule__UserInterface__Group__21148);
            rule__UserInterface__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UserInterface__Group__2"


    // $ANTLR start "rule__UserInterface__Group__2__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:571:1: rule__UserInterface__Group__2__Impl : ( ( rule__UserInterface__UiDescriptionAssignment_2 ) ) ;
    public final void rule__UserInterface__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:575:1: ( ( ( rule__UserInterface__UiDescriptionAssignment_2 ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:576:1: ( ( rule__UserInterface__UiDescriptionAssignment_2 ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:576:1: ( ( rule__UserInterface__UiDescriptionAssignment_2 ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:577:1: ( rule__UserInterface__UiDescriptionAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUserInterfaceAccess().getUiDescriptionAssignment_2()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:578:1: ( rule__UserInterface__UiDescriptionAssignment_2 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:578:2: rule__UserInterface__UiDescriptionAssignment_2
            {
            pushFollow(FOLLOW_rule__UserInterface__UiDescriptionAssignment_2_in_rule__UserInterface__Group__2__Impl1175);
            rule__UserInterface__UiDescriptionAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getUserInterfaceAccess().getUiDescriptionAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UserInterface__Group__2__Impl"


    // $ANTLR start "rule__Import__Group__0"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:594:1: rule__Import__Group__0 : rule__Import__Group__0__Impl rule__Import__Group__1 ;
    public final void rule__Import__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:598:1: ( rule__Import__Group__0__Impl rule__Import__Group__1 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:599:2: rule__Import__Group__0__Impl rule__Import__Group__1
            {
            pushFollow(FOLLOW_rule__Import__Group__0__Impl_in_rule__Import__Group__01211);
            rule__Import__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Import__Group__1_in_rule__Import__Group__01214);
            rule__Import__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__Group__0"


    // $ANTLR start "rule__Import__Group__0__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:606:1: rule__Import__Group__0__Impl : ( 'import' ) ;
    public final void rule__Import__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:610:1: ( ( 'import' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:611:1: ( 'import' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:611:1: ( 'import' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:612:1: 'import'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImportAccess().getImportKeyword_0()); 
            }
            match(input,17,FOLLOW_17_in_rule__Import__Group__0__Impl1242); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getImportAccess().getImportKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__Group__0__Impl"


    // $ANTLR start "rule__Import__Group__1"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:625:1: rule__Import__Group__1 : rule__Import__Group__1__Impl ;
    public final void rule__Import__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:629:1: ( rule__Import__Group__1__Impl )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:630:2: rule__Import__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Import__Group__1__Impl_in_rule__Import__Group__11273);
            rule__Import__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__Group__1"


    // $ANTLR start "rule__Import__Group__1__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:636:1: rule__Import__Group__1__Impl : ( ( rule__Import__ImportedNamespaceAssignment_1 ) ) ;
    public final void rule__Import__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:640:1: ( ( ( rule__Import__ImportedNamespaceAssignment_1 ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:641:1: ( ( rule__Import__ImportedNamespaceAssignment_1 ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:641:1: ( ( rule__Import__ImportedNamespaceAssignment_1 ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:642:1: ( rule__Import__ImportedNamespaceAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImportAccess().getImportedNamespaceAssignment_1()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:643:1: ( rule__Import__ImportedNamespaceAssignment_1 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:643:2: rule__Import__ImportedNamespaceAssignment_1
            {
            pushFollow(FOLLOW_rule__Import__ImportedNamespaceAssignment_1_in_rule__Import__Group__1__Impl1300);
            rule__Import__ImportedNamespaceAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getImportAccess().getImportedNamespaceAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__Group__1__Impl"


    // $ANTLR start "rule__UIDescription__Group__0"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:657:1: rule__UIDescription__Group__0 : rule__UIDescription__Group__0__Impl rule__UIDescription__Group__1 ;
    public final void rule__UIDescription__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:661:1: ( rule__UIDescription__Group__0__Impl rule__UIDescription__Group__1 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:662:2: rule__UIDescription__Group__0__Impl rule__UIDescription__Group__1
            {
            pushFollow(FOLLOW_rule__UIDescription__Group__0__Impl_in_rule__UIDescription__Group__01334);
            rule__UIDescription__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__UIDescription__Group__1_in_rule__UIDescription__Group__01337);
            rule__UIDescription__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UIDescription__Group__0"


    // $ANTLR start "rule__UIDescription__Group__0__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:669:1: rule__UIDescription__Group__0__Impl : ( () ) ;
    public final void rule__UIDescription__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:673:1: ( ( () ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:674:1: ( () )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:674:1: ( () )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:675:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUIDescriptionAccess().getUIDescriptionAction_0()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:676:1: ()
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:678:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getUIDescriptionAccess().getUIDescriptionAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UIDescription__Group__0__Impl"


    // $ANTLR start "rule__UIDescription__Group__1"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:688:1: rule__UIDescription__Group__1 : rule__UIDescription__Group__1__Impl rule__UIDescription__Group__2 ;
    public final void rule__UIDescription__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:692:1: ( rule__UIDescription__Group__1__Impl rule__UIDescription__Group__2 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:693:2: rule__UIDescription__Group__1__Impl rule__UIDescription__Group__2
            {
            pushFollow(FOLLOW_rule__UIDescription__Group__1__Impl_in_rule__UIDescription__Group__11395);
            rule__UIDescription__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__UIDescription__Group__2_in_rule__UIDescription__Group__11398);
            rule__UIDescription__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UIDescription__Group__1"


    // $ANTLR start "rule__UIDescription__Group__1__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:700:1: rule__UIDescription__Group__1__Impl : ( 'UIDescription' ) ;
    public final void rule__UIDescription__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:704:1: ( ( 'UIDescription' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:705:1: ( 'UIDescription' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:705:1: ( 'UIDescription' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:706:1: 'UIDescription'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUIDescriptionAccess().getUIDescriptionKeyword_1()); 
            }
            match(input,18,FOLLOW_18_in_rule__UIDescription__Group__1__Impl1426); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getUIDescriptionAccess().getUIDescriptionKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UIDescription__Group__1__Impl"


    // $ANTLR start "rule__UIDescription__Group__2"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:719:1: rule__UIDescription__Group__2 : rule__UIDescription__Group__2__Impl rule__UIDescription__Group__3 ;
    public final void rule__UIDescription__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:723:1: ( rule__UIDescription__Group__2__Impl rule__UIDescription__Group__3 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:724:2: rule__UIDescription__Group__2__Impl rule__UIDescription__Group__3
            {
            pushFollow(FOLLOW_rule__UIDescription__Group__2__Impl_in_rule__UIDescription__Group__21457);
            rule__UIDescription__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__UIDescription__Group__3_in_rule__UIDescription__Group__21460);
            rule__UIDescription__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UIDescription__Group__2"


    // $ANTLR start "rule__UIDescription__Group__2__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:731:1: rule__UIDescription__Group__2__Impl : ( ( rule__UIDescription__NameAssignment_2 ) ) ;
    public final void rule__UIDescription__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:735:1: ( ( ( rule__UIDescription__NameAssignment_2 ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:736:1: ( ( rule__UIDescription__NameAssignment_2 ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:736:1: ( ( rule__UIDescription__NameAssignment_2 ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:737:1: ( rule__UIDescription__NameAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUIDescriptionAccess().getNameAssignment_2()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:738:1: ( rule__UIDescription__NameAssignment_2 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:738:2: rule__UIDescription__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__UIDescription__NameAssignment_2_in_rule__UIDescription__Group__2__Impl1487);
            rule__UIDescription__NameAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getUIDescriptionAccess().getNameAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UIDescription__Group__2__Impl"


    // $ANTLR start "rule__UIDescription__Group__3"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:748:1: rule__UIDescription__Group__3 : rule__UIDescription__Group__3__Impl rule__UIDescription__Group__4 ;
    public final void rule__UIDescription__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:752:1: ( rule__UIDescription__Group__3__Impl rule__UIDescription__Group__4 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:753:2: rule__UIDescription__Group__3__Impl rule__UIDescription__Group__4
            {
            pushFollow(FOLLOW_rule__UIDescription__Group__3__Impl_in_rule__UIDescription__Group__31517);
            rule__UIDescription__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__UIDescription__Group__4_in_rule__UIDescription__Group__31520);
            rule__UIDescription__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UIDescription__Group__3"


    // $ANTLR start "rule__UIDescription__Group__3__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:760:1: rule__UIDescription__Group__3__Impl : ( '{' ) ;
    public final void rule__UIDescription__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:764:1: ( ( '{' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:765:1: ( '{' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:765:1: ( '{' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:766:1: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUIDescriptionAccess().getLeftCurlyBracketKeyword_3()); 
            }
            match(input,19,FOLLOW_19_in_rule__UIDescription__Group__3__Impl1548); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getUIDescriptionAccess().getLeftCurlyBracketKeyword_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UIDescription__Group__3__Impl"


    // $ANTLR start "rule__UIDescription__Group__4"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:779:1: rule__UIDescription__Group__4 : rule__UIDescription__Group__4__Impl rule__UIDescription__Group__5 ;
    public final void rule__UIDescription__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:783:1: ( rule__UIDescription__Group__4__Impl rule__UIDescription__Group__5 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:784:2: rule__UIDescription__Group__4__Impl rule__UIDescription__Group__5
            {
            pushFollow(FOLLOW_rule__UIDescription__Group__4__Impl_in_rule__UIDescription__Group__41579);
            rule__UIDescription__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__UIDescription__Group__5_in_rule__UIDescription__Group__41582);
            rule__UIDescription__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UIDescription__Group__4"


    // $ANTLR start "rule__UIDescription__Group__4__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:791:1: rule__UIDescription__Group__4__Impl : ( ( rule__UIDescription__UIsAssignment_4 )* ) ;
    public final void rule__UIDescription__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:795:1: ( ( ( rule__UIDescription__UIsAssignment_4 )* ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:796:1: ( ( rule__UIDescription__UIsAssignment_4 )* )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:796:1: ( ( rule__UIDescription__UIsAssignment_4 )* )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:797:1: ( rule__UIDescription__UIsAssignment_4 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUIDescriptionAccess().getUIsAssignment_4()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:798:1: ( rule__UIDescription__UIsAssignment_4 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==21) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:798:2: rule__UIDescription__UIsAssignment_4
            	    {
            	    pushFollow(FOLLOW_rule__UIDescription__UIsAssignment_4_in_rule__UIDescription__Group__4__Impl1609);
            	    rule__UIDescription__UIsAssignment_4();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getUIDescriptionAccess().getUIsAssignment_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UIDescription__Group__4__Impl"


    // $ANTLR start "rule__UIDescription__Group__5"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:808:1: rule__UIDescription__Group__5 : rule__UIDescription__Group__5__Impl ;
    public final void rule__UIDescription__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:812:1: ( rule__UIDescription__Group__5__Impl )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:813:2: rule__UIDescription__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__UIDescription__Group__5__Impl_in_rule__UIDescription__Group__51640);
            rule__UIDescription__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UIDescription__Group__5"


    // $ANTLR start "rule__UIDescription__Group__5__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:819:1: rule__UIDescription__Group__5__Impl : ( '}' ) ;
    public final void rule__UIDescription__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:823:1: ( ( '}' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:824:1: ( '}' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:824:1: ( '}' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:825:1: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUIDescriptionAccess().getRightCurlyBracketKeyword_5()); 
            }
            match(input,20,FOLLOW_20_in_rule__UIDescription__Group__5__Impl1668); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getUIDescriptionAccess().getRightCurlyBracketKeyword_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UIDescription__Group__5__Impl"


    // $ANTLR start "rule__UI__Group__0"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:850:1: rule__UI__Group__0 : rule__UI__Group__0__Impl rule__UI__Group__1 ;
    public final void rule__UI__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:854:1: ( rule__UI__Group__0__Impl rule__UI__Group__1 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:855:2: rule__UI__Group__0__Impl rule__UI__Group__1
            {
            pushFollow(FOLLOW_rule__UI__Group__0__Impl_in_rule__UI__Group__01711);
            rule__UI__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__UI__Group__1_in_rule__UI__Group__01714);
            rule__UI__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UI__Group__0"


    // $ANTLR start "rule__UI__Group__0__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:862:1: rule__UI__Group__0__Impl : ( () ) ;
    public final void rule__UI__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:866:1: ( ( () ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:867:1: ( () )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:867:1: ( () )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:868:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUIAccess().getUIAction_0()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:869:1: ()
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:871:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getUIAccess().getUIAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UI__Group__0__Impl"


    // $ANTLR start "rule__UI__Group__1"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:881:1: rule__UI__Group__1 : rule__UI__Group__1__Impl rule__UI__Group__2 ;
    public final void rule__UI__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:885:1: ( rule__UI__Group__1__Impl rule__UI__Group__2 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:886:2: rule__UI__Group__1__Impl rule__UI__Group__2
            {
            pushFollow(FOLLOW_rule__UI__Group__1__Impl_in_rule__UI__Group__11772);
            rule__UI__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__UI__Group__2_in_rule__UI__Group__11775);
            rule__UI__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UI__Group__1"


    // $ANTLR start "rule__UI__Group__1__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:893:1: rule__UI__Group__1__Impl : ( 'UI' ) ;
    public final void rule__UI__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:897:1: ( ( 'UI' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:898:1: ( 'UI' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:898:1: ( 'UI' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:899:1: 'UI'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUIAccess().getUIKeyword_1()); 
            }
            match(input,21,FOLLOW_21_in_rule__UI__Group__1__Impl1803); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getUIAccess().getUIKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UI__Group__1__Impl"


    // $ANTLR start "rule__UI__Group__2"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:912:1: rule__UI__Group__2 : rule__UI__Group__2__Impl rule__UI__Group__3 ;
    public final void rule__UI__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:916:1: ( rule__UI__Group__2__Impl rule__UI__Group__3 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:917:2: rule__UI__Group__2__Impl rule__UI__Group__3
            {
            pushFollow(FOLLOW_rule__UI__Group__2__Impl_in_rule__UI__Group__21834);
            rule__UI__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__UI__Group__3_in_rule__UI__Group__21837);
            rule__UI__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UI__Group__2"


    // $ANTLR start "rule__UI__Group__2__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:924:1: rule__UI__Group__2__Impl : ( ( rule__UI__NameAssignment_2 )? ) ;
    public final void rule__UI__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:928:1: ( ( ( rule__UI__NameAssignment_2 )? ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:929:1: ( ( rule__UI__NameAssignment_2 )? )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:929:1: ( ( rule__UI__NameAssignment_2 )? )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:930:1: ( rule__UI__NameAssignment_2 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUIAccess().getNameAssignment_2()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:931:1: ( rule__UI__NameAssignment_2 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( ((LA5_0>=RULE_STRING && LA5_0<=RULE_ID)) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:931:2: rule__UI__NameAssignment_2
                    {
                    pushFollow(FOLLOW_rule__UI__NameAssignment_2_in_rule__UI__Group__2__Impl1864);
                    rule__UI__NameAssignment_2();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getUIAccess().getNameAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UI__Group__2__Impl"


    // $ANTLR start "rule__UI__Group__3"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:941:1: rule__UI__Group__3 : rule__UI__Group__3__Impl rule__UI__Group__4 ;
    public final void rule__UI__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:945:1: ( rule__UI__Group__3__Impl rule__UI__Group__4 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:946:2: rule__UI__Group__3__Impl rule__UI__Group__4
            {
            pushFollow(FOLLOW_rule__UI__Group__3__Impl_in_rule__UI__Group__31895);
            rule__UI__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__UI__Group__4_in_rule__UI__Group__31898);
            rule__UI__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UI__Group__3"


    // $ANTLR start "rule__UI__Group__3__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:953:1: rule__UI__Group__3__Impl : ( ( rule__UI__UI_DataSourceAssignment_3 )? ) ;
    public final void rule__UI__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:957:1: ( ( ( rule__UI__UI_DataSourceAssignment_3 )? ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:958:1: ( ( rule__UI__UI_DataSourceAssignment_3 )? )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:958:1: ( ( rule__UI__UI_DataSourceAssignment_3 )? )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:959:1: ( rule__UI__UI_DataSourceAssignment_3 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUIAccess().getUI_DataSourceAssignment_3()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:960:1: ( rule__UI__UI_DataSourceAssignment_3 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==25) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:960:2: rule__UI__UI_DataSourceAssignment_3
                    {
                    pushFollow(FOLLOW_rule__UI__UI_DataSourceAssignment_3_in_rule__UI__Group__3__Impl1925);
                    rule__UI__UI_DataSourceAssignment_3();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getUIAccess().getUI_DataSourceAssignment_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UI__Group__3__Impl"


    // $ANTLR start "rule__UI__Group__4"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:970:1: rule__UI__Group__4 : rule__UI__Group__4__Impl rule__UI__Group__5 ;
    public final void rule__UI__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:974:1: ( rule__UI__Group__4__Impl rule__UI__Group__5 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:975:2: rule__UI__Group__4__Impl rule__UI__Group__5
            {
            pushFollow(FOLLOW_rule__UI__Group__4__Impl_in_rule__UI__Group__41956);
            rule__UI__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__UI__Group__5_in_rule__UI__Group__41959);
            rule__UI__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UI__Group__4"


    // $ANTLR start "rule__UI__Group__4__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:982:1: rule__UI__Group__4__Impl : ( '{' ) ;
    public final void rule__UI__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:986:1: ( ( '{' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:987:1: ( '{' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:987:1: ( '{' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:988:1: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUIAccess().getLeftCurlyBracketKeyword_4()); 
            }
            match(input,19,FOLLOW_19_in_rule__UI__Group__4__Impl1987); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getUIAccess().getLeftCurlyBracketKeyword_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UI__Group__4__Impl"


    // $ANTLR start "rule__UI__Group__5"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1001:1: rule__UI__Group__5 : rule__UI__Group__5__Impl rule__UI__Group__6 ;
    public final void rule__UI__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1005:1: ( rule__UI__Group__5__Impl rule__UI__Group__6 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1006:2: rule__UI__Group__5__Impl rule__UI__Group__6
            {
            pushFollow(FOLLOW_rule__UI__Group__5__Impl_in_rule__UI__Group__52018);
            rule__UI__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__UI__Group__6_in_rule__UI__Group__52021);
            rule__UI__Group__6();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UI__Group__5"


    // $ANTLR start "rule__UI__Group__5__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1013:1: rule__UI__Group__5__Impl : ( ( rule__UI__Group_5__0 )? ) ;
    public final void rule__UI__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1017:1: ( ( ( rule__UI__Group_5__0 )? ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1018:1: ( ( rule__UI__Group_5__0 )? )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1018:1: ( ( rule__UI__Group_5__0 )? )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1019:1: ( rule__UI__Group_5__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUIAccess().getGroup_5()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1020:1: ( rule__UI__Group_5__0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==22) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1020:2: rule__UI__Group_5__0
                    {
                    pushFollow(FOLLOW_rule__UI__Group_5__0_in_rule__UI__Group__5__Impl2048);
                    rule__UI__Group_5__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getUIAccess().getGroup_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UI__Group__5__Impl"


    // $ANTLR start "rule__UI__Group__6"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1030:1: rule__UI__Group__6 : rule__UI__Group__6__Impl rule__UI__Group__7 ;
    public final void rule__UI__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1034:1: ( rule__UI__Group__6__Impl rule__UI__Group__7 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1035:2: rule__UI__Group__6__Impl rule__UI__Group__7
            {
            pushFollow(FOLLOW_rule__UI__Group__6__Impl_in_rule__UI__Group__62079);
            rule__UI__Group__6__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__UI__Group__7_in_rule__UI__Group__62082);
            rule__UI__Group__7();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UI__Group__6"


    // $ANTLR start "rule__UI__Group__6__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1042:1: rule__UI__Group__6__Impl : ( ( rule__UI__UI_ContainersAssignment_6 )* ) ;
    public final void rule__UI__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1046:1: ( ( ( rule__UI__UI_ContainersAssignment_6 )* ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1047:1: ( ( rule__UI__UI_ContainersAssignment_6 )* )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1047:1: ( ( rule__UI__UI_ContainersAssignment_6 )* )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1048:1: ( rule__UI__UI_ContainersAssignment_6 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUIAccess().getUI_ContainersAssignment_6()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1049:1: ( rule__UI__UI_ContainersAssignment_6 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==23) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1049:2: rule__UI__UI_ContainersAssignment_6
            	    {
            	    pushFollow(FOLLOW_rule__UI__UI_ContainersAssignment_6_in_rule__UI__Group__6__Impl2109);
            	    rule__UI__UI_ContainersAssignment_6();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getUIAccess().getUI_ContainersAssignment_6()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UI__Group__6__Impl"


    // $ANTLR start "rule__UI__Group__7"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1059:1: rule__UI__Group__7 : rule__UI__Group__7__Impl ;
    public final void rule__UI__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1063:1: ( rule__UI__Group__7__Impl )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1064:2: rule__UI__Group__7__Impl
            {
            pushFollow(FOLLOW_rule__UI__Group__7__Impl_in_rule__UI__Group__72140);
            rule__UI__Group__7__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UI__Group__7"


    // $ANTLR start "rule__UI__Group__7__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1070:1: rule__UI__Group__7__Impl : ( '}' ) ;
    public final void rule__UI__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1074:1: ( ( '}' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1075:1: ( '}' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1075:1: ( '}' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1076:1: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUIAccess().getRightCurlyBracketKeyword_7()); 
            }
            match(input,20,FOLLOW_20_in_rule__UI__Group__7__Impl2168); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getUIAccess().getRightCurlyBracketKeyword_7()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UI__Group__7__Impl"


    // $ANTLR start "rule__UI__Group_5__0"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1105:1: rule__UI__Group_5__0 : rule__UI__Group_5__0__Impl rule__UI__Group_5__1 ;
    public final void rule__UI__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1109:1: ( rule__UI__Group_5__0__Impl rule__UI__Group_5__1 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1110:2: rule__UI__Group_5__0__Impl rule__UI__Group_5__1
            {
            pushFollow(FOLLOW_rule__UI__Group_5__0__Impl_in_rule__UI__Group_5__02215);
            rule__UI__Group_5__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__UI__Group_5__1_in_rule__UI__Group_5__02218);
            rule__UI__Group_5__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UI__Group_5__0"


    // $ANTLR start "rule__UI__Group_5__0__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1117:1: rule__UI__Group_5__0__Impl : ( 'label:' ) ;
    public final void rule__UI__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1121:1: ( ( 'label:' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1122:1: ( 'label:' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1122:1: ( 'label:' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1123:1: 'label:'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUIAccess().getLabelKeyword_5_0()); 
            }
            match(input,22,FOLLOW_22_in_rule__UI__Group_5__0__Impl2246); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getUIAccess().getLabelKeyword_5_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UI__Group_5__0__Impl"


    // $ANTLR start "rule__UI__Group_5__1"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1136:1: rule__UI__Group_5__1 : rule__UI__Group_5__1__Impl ;
    public final void rule__UI__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1140:1: ( rule__UI__Group_5__1__Impl )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1141:2: rule__UI__Group_5__1__Impl
            {
            pushFollow(FOLLOW_rule__UI__Group_5__1__Impl_in_rule__UI__Group_5__12277);
            rule__UI__Group_5__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UI__Group_5__1"


    // $ANTLR start "rule__UI__Group_5__1__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1147:1: rule__UI__Group_5__1__Impl : ( ( rule__UI__LabelAssignment_5_1 ) ) ;
    public final void rule__UI__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1151:1: ( ( ( rule__UI__LabelAssignment_5_1 ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1152:1: ( ( rule__UI__LabelAssignment_5_1 ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1152:1: ( ( rule__UI__LabelAssignment_5_1 ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1153:1: ( rule__UI__LabelAssignment_5_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUIAccess().getLabelAssignment_5_1()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1154:1: ( rule__UI__LabelAssignment_5_1 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1154:2: rule__UI__LabelAssignment_5_1
            {
            pushFollow(FOLLOW_rule__UI__LabelAssignment_5_1_in_rule__UI__Group_5__1__Impl2304);
            rule__UI__LabelAssignment_5_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getUIAccess().getLabelAssignment_5_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UI__Group_5__1__Impl"


    // $ANTLR start "rule__UIContainer__Group__0"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1168:1: rule__UIContainer__Group__0 : rule__UIContainer__Group__0__Impl rule__UIContainer__Group__1 ;
    public final void rule__UIContainer__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1172:1: ( rule__UIContainer__Group__0__Impl rule__UIContainer__Group__1 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1173:2: rule__UIContainer__Group__0__Impl rule__UIContainer__Group__1
            {
            pushFollow(FOLLOW_rule__UIContainer__Group__0__Impl_in_rule__UIContainer__Group__02338);
            rule__UIContainer__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__UIContainer__Group__1_in_rule__UIContainer__Group__02341);
            rule__UIContainer__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UIContainer__Group__0"


    // $ANTLR start "rule__UIContainer__Group__0__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1180:1: rule__UIContainer__Group__0__Impl : ( () ) ;
    public final void rule__UIContainer__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1184:1: ( ( () ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1185:1: ( () )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1185:1: ( () )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1186:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUIContainerAccess().getUIContainerAction_0()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1187:1: ()
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1189:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getUIContainerAccess().getUIContainerAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UIContainer__Group__0__Impl"


    // $ANTLR start "rule__UIContainer__Group__1"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1199:1: rule__UIContainer__Group__1 : rule__UIContainer__Group__1__Impl rule__UIContainer__Group__2 ;
    public final void rule__UIContainer__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1203:1: ( rule__UIContainer__Group__1__Impl rule__UIContainer__Group__2 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1204:2: rule__UIContainer__Group__1__Impl rule__UIContainer__Group__2
            {
            pushFollow(FOLLOW_rule__UIContainer__Group__1__Impl_in_rule__UIContainer__Group__12399);
            rule__UIContainer__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__UIContainer__Group__2_in_rule__UIContainer__Group__12402);
            rule__UIContainer__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UIContainer__Group__1"


    // $ANTLR start "rule__UIContainer__Group__1__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1211:1: rule__UIContainer__Group__1__Impl : ( 'Container' ) ;
    public final void rule__UIContainer__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1215:1: ( ( 'Container' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1216:1: ( 'Container' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1216:1: ( 'Container' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1217:1: 'Container'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUIContainerAccess().getContainerKeyword_1()); 
            }
            match(input,23,FOLLOW_23_in_rule__UIContainer__Group__1__Impl2430); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getUIContainerAccess().getContainerKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UIContainer__Group__1__Impl"


    // $ANTLR start "rule__UIContainer__Group__2"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1230:1: rule__UIContainer__Group__2 : rule__UIContainer__Group__2__Impl rule__UIContainer__Group__3 ;
    public final void rule__UIContainer__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1234:1: ( rule__UIContainer__Group__2__Impl rule__UIContainer__Group__3 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1235:2: rule__UIContainer__Group__2__Impl rule__UIContainer__Group__3
            {
            pushFollow(FOLLOW_rule__UIContainer__Group__2__Impl_in_rule__UIContainer__Group__22461);
            rule__UIContainer__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__UIContainer__Group__3_in_rule__UIContainer__Group__22464);
            rule__UIContainer__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UIContainer__Group__2"


    // $ANTLR start "rule__UIContainer__Group__2__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1242:1: rule__UIContainer__Group__2__Impl : ( ( rule__UIContainer__NameAssignment_2 )? ) ;
    public final void rule__UIContainer__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1246:1: ( ( ( rule__UIContainer__NameAssignment_2 )? ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1247:1: ( ( rule__UIContainer__NameAssignment_2 )? )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1247:1: ( ( rule__UIContainer__NameAssignment_2 )? )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1248:1: ( rule__UIContainer__NameAssignment_2 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUIContainerAccess().getNameAssignment_2()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1249:1: ( rule__UIContainer__NameAssignment_2 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( ((LA9_0>=RULE_STRING && LA9_0<=RULE_ID)) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1249:2: rule__UIContainer__NameAssignment_2
                    {
                    pushFollow(FOLLOW_rule__UIContainer__NameAssignment_2_in_rule__UIContainer__Group__2__Impl2491);
                    rule__UIContainer__NameAssignment_2();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getUIContainerAccess().getNameAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UIContainer__Group__2__Impl"


    // $ANTLR start "rule__UIContainer__Group__3"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1259:1: rule__UIContainer__Group__3 : rule__UIContainer__Group__3__Impl rule__UIContainer__Group__4 ;
    public final void rule__UIContainer__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1263:1: ( rule__UIContainer__Group__3__Impl rule__UIContainer__Group__4 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1264:2: rule__UIContainer__Group__3__Impl rule__UIContainer__Group__4
            {
            pushFollow(FOLLOW_rule__UIContainer__Group__3__Impl_in_rule__UIContainer__Group__32522);
            rule__UIContainer__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__UIContainer__Group__4_in_rule__UIContainer__Group__32525);
            rule__UIContainer__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UIContainer__Group__3"


    // $ANTLR start "rule__UIContainer__Group__3__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1271:1: rule__UIContainer__Group__3__Impl : ( '{' ) ;
    public final void rule__UIContainer__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1275:1: ( ( '{' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1276:1: ( '{' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1276:1: ( '{' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1277:1: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUIContainerAccess().getLeftCurlyBracketKeyword_3()); 
            }
            match(input,19,FOLLOW_19_in_rule__UIContainer__Group__3__Impl2553); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getUIContainerAccess().getLeftCurlyBracketKeyword_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UIContainer__Group__3__Impl"


    // $ANTLR start "rule__UIContainer__Group__4"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1290:1: rule__UIContainer__Group__4 : rule__UIContainer__Group__4__Impl rule__UIContainer__Group__5 ;
    public final void rule__UIContainer__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1294:1: ( rule__UIContainer__Group__4__Impl rule__UIContainer__Group__5 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1295:2: rule__UIContainer__Group__4__Impl rule__UIContainer__Group__5
            {
            pushFollow(FOLLOW_rule__UIContainer__Group__4__Impl_in_rule__UIContainer__Group__42584);
            rule__UIContainer__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__UIContainer__Group__5_in_rule__UIContainer__Group__42587);
            rule__UIContainer__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UIContainer__Group__4"


    // $ANTLR start "rule__UIContainer__Group__4__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1302:1: rule__UIContainer__Group__4__Impl : ( ( rule__UIContainer__Group_4__0 )? ) ;
    public final void rule__UIContainer__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1306:1: ( ( ( rule__UIContainer__Group_4__0 )? ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1307:1: ( ( rule__UIContainer__Group_4__0 )? )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1307:1: ( ( rule__UIContainer__Group_4__0 )? )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1308:1: ( rule__UIContainer__Group_4__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUIContainerAccess().getGroup_4()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1309:1: ( rule__UIContainer__Group_4__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==22) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1309:2: rule__UIContainer__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__UIContainer__Group_4__0_in_rule__UIContainer__Group__4__Impl2614);
                    rule__UIContainer__Group_4__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getUIContainerAccess().getGroup_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UIContainer__Group__4__Impl"


    // $ANTLR start "rule__UIContainer__Group__5"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1319:1: rule__UIContainer__Group__5 : rule__UIContainer__Group__5__Impl rule__UIContainer__Group__6 ;
    public final void rule__UIContainer__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1323:1: ( rule__UIContainer__Group__5__Impl rule__UIContainer__Group__6 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1324:2: rule__UIContainer__Group__5__Impl rule__UIContainer__Group__6
            {
            pushFollow(FOLLOW_rule__UIContainer__Group__5__Impl_in_rule__UIContainer__Group__52645);
            rule__UIContainer__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__UIContainer__Group__6_in_rule__UIContainer__Group__52648);
            rule__UIContainer__Group__6();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UIContainer__Group__5"


    // $ANTLR start "rule__UIContainer__Group__5__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1331:1: rule__UIContainer__Group__5__Impl : ( ( rule__UIContainer__Group_5__0 )? ) ;
    public final void rule__UIContainer__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1335:1: ( ( ( rule__UIContainer__Group_5__0 )? ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1336:1: ( ( rule__UIContainer__Group_5__0 )? )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1336:1: ( ( rule__UIContainer__Group_5__0 )? )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1337:1: ( rule__UIContainer__Group_5__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUIContainerAccess().getGroup_5()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1338:1: ( rule__UIContainer__Group_5__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==24) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1338:2: rule__UIContainer__Group_5__0
                    {
                    pushFollow(FOLLOW_rule__UIContainer__Group_5__0_in_rule__UIContainer__Group__5__Impl2675);
                    rule__UIContainer__Group_5__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getUIContainerAccess().getGroup_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UIContainer__Group__5__Impl"


    // $ANTLR start "rule__UIContainer__Group__6"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1348:1: rule__UIContainer__Group__6 : rule__UIContainer__Group__6__Impl rule__UIContainer__Group__7 ;
    public final void rule__UIContainer__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1352:1: ( rule__UIContainer__Group__6__Impl rule__UIContainer__Group__7 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1353:2: rule__UIContainer__Group__6__Impl rule__UIContainer__Group__7
            {
            pushFollow(FOLLOW_rule__UIContainer__Group__6__Impl_in_rule__UIContainer__Group__62706);
            rule__UIContainer__Group__6__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__UIContainer__Group__7_in_rule__UIContainer__Group__62709);
            rule__UIContainer__Group__7();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UIContainer__Group__6"


    // $ANTLR start "rule__UIContainer__Group__6__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1360:1: rule__UIContainer__Group__6__Impl : ( ( rule__UIContainer__Group_6__0 )? ) ;
    public final void rule__UIContainer__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1364:1: ( ( ( rule__UIContainer__Group_6__0 )? ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1365:1: ( ( rule__UIContainer__Group_6__0 )? )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1365:1: ( ( rule__UIContainer__Group_6__0 )? )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1366:1: ( rule__UIContainer__Group_6__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUIContainerAccess().getGroup_6()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1367:1: ( rule__UIContainer__Group_6__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==26) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1367:2: rule__UIContainer__Group_6__0
                    {
                    pushFollow(FOLLOW_rule__UIContainer__Group_6__0_in_rule__UIContainer__Group__6__Impl2736);
                    rule__UIContainer__Group_6__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getUIContainerAccess().getGroup_6()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UIContainer__Group__6__Impl"


    // $ANTLR start "rule__UIContainer__Group__7"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1377:1: rule__UIContainer__Group__7 : rule__UIContainer__Group__7__Impl rule__UIContainer__Group__8 ;
    public final void rule__UIContainer__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1381:1: ( rule__UIContainer__Group__7__Impl rule__UIContainer__Group__8 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1382:2: rule__UIContainer__Group__7__Impl rule__UIContainer__Group__8
            {
            pushFollow(FOLLOW_rule__UIContainer__Group__7__Impl_in_rule__UIContainer__Group__72767);
            rule__UIContainer__Group__7__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__UIContainer__Group__8_in_rule__UIContainer__Group__72770);
            rule__UIContainer__Group__8();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UIContainer__Group__7"


    // $ANTLR start "rule__UIContainer__Group__7__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1389:1: rule__UIContainer__Group__7__Impl : ( ( rule__UIContainer__Group_7__0 )? ) ;
    public final void rule__UIContainer__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1393:1: ( ( ( rule__UIContainer__Group_7__0 )? ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1394:1: ( ( rule__UIContainer__Group_7__0 )? )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1394:1: ( ( rule__UIContainer__Group_7__0 )? )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1395:1: ( rule__UIContainer__Group_7__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUIContainerAccess().getGroup_7()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1396:1: ( rule__UIContainer__Group_7__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==23) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1396:2: rule__UIContainer__Group_7__0
                    {
                    pushFollow(FOLLOW_rule__UIContainer__Group_7__0_in_rule__UIContainer__Group__7__Impl2797);
                    rule__UIContainer__Group_7__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getUIContainerAccess().getGroup_7()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UIContainer__Group__7__Impl"


    // $ANTLR start "rule__UIContainer__Group__8"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1406:1: rule__UIContainer__Group__8 : rule__UIContainer__Group__8__Impl ;
    public final void rule__UIContainer__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1410:1: ( rule__UIContainer__Group__8__Impl )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1411:2: rule__UIContainer__Group__8__Impl
            {
            pushFollow(FOLLOW_rule__UIContainer__Group__8__Impl_in_rule__UIContainer__Group__82828);
            rule__UIContainer__Group__8__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UIContainer__Group__8"


    // $ANTLR start "rule__UIContainer__Group__8__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1417:1: rule__UIContainer__Group__8__Impl : ( '}' ) ;
    public final void rule__UIContainer__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1421:1: ( ( '}' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1422:1: ( '}' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1422:1: ( '}' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1423:1: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUIContainerAccess().getRightCurlyBracketKeyword_8()); 
            }
            match(input,20,FOLLOW_20_in_rule__UIContainer__Group__8__Impl2856); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getUIContainerAccess().getRightCurlyBracketKeyword_8()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UIContainer__Group__8__Impl"


    // $ANTLR start "rule__UIContainer__Group_4__0"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1454:1: rule__UIContainer__Group_4__0 : rule__UIContainer__Group_4__0__Impl rule__UIContainer__Group_4__1 ;
    public final void rule__UIContainer__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1458:1: ( rule__UIContainer__Group_4__0__Impl rule__UIContainer__Group_4__1 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1459:2: rule__UIContainer__Group_4__0__Impl rule__UIContainer__Group_4__1
            {
            pushFollow(FOLLOW_rule__UIContainer__Group_4__0__Impl_in_rule__UIContainer__Group_4__02905);
            rule__UIContainer__Group_4__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__UIContainer__Group_4__1_in_rule__UIContainer__Group_4__02908);
            rule__UIContainer__Group_4__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UIContainer__Group_4__0"


    // $ANTLR start "rule__UIContainer__Group_4__0__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1466:1: rule__UIContainer__Group_4__0__Impl : ( 'label:' ) ;
    public final void rule__UIContainer__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1470:1: ( ( 'label:' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1471:1: ( 'label:' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1471:1: ( 'label:' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1472:1: 'label:'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUIContainerAccess().getLabelKeyword_4_0()); 
            }
            match(input,22,FOLLOW_22_in_rule__UIContainer__Group_4__0__Impl2936); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getUIContainerAccess().getLabelKeyword_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UIContainer__Group_4__0__Impl"


    // $ANTLR start "rule__UIContainer__Group_4__1"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1485:1: rule__UIContainer__Group_4__1 : rule__UIContainer__Group_4__1__Impl ;
    public final void rule__UIContainer__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1489:1: ( rule__UIContainer__Group_4__1__Impl )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1490:2: rule__UIContainer__Group_4__1__Impl
            {
            pushFollow(FOLLOW_rule__UIContainer__Group_4__1__Impl_in_rule__UIContainer__Group_4__12967);
            rule__UIContainer__Group_4__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UIContainer__Group_4__1"


    // $ANTLR start "rule__UIContainer__Group_4__1__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1496:1: rule__UIContainer__Group_4__1__Impl : ( ( rule__UIContainer__LabelAssignment_4_1 ) ) ;
    public final void rule__UIContainer__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1500:1: ( ( ( rule__UIContainer__LabelAssignment_4_1 ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1501:1: ( ( rule__UIContainer__LabelAssignment_4_1 ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1501:1: ( ( rule__UIContainer__LabelAssignment_4_1 ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1502:1: ( rule__UIContainer__LabelAssignment_4_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUIContainerAccess().getLabelAssignment_4_1()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1503:1: ( rule__UIContainer__LabelAssignment_4_1 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1503:2: rule__UIContainer__LabelAssignment_4_1
            {
            pushFollow(FOLLOW_rule__UIContainer__LabelAssignment_4_1_in_rule__UIContainer__Group_4__1__Impl2994);
            rule__UIContainer__LabelAssignment_4_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getUIContainerAccess().getLabelAssignment_4_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UIContainer__Group_4__1__Impl"


    // $ANTLR start "rule__UIContainer__Group_5__0"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1517:1: rule__UIContainer__Group_5__0 : rule__UIContainer__Group_5__0__Impl rule__UIContainer__Group_5__1 ;
    public final void rule__UIContainer__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1521:1: ( rule__UIContainer__Group_5__0__Impl rule__UIContainer__Group_5__1 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1522:2: rule__UIContainer__Group_5__0__Impl rule__UIContainer__Group_5__1
            {
            pushFollow(FOLLOW_rule__UIContainer__Group_5__0__Impl_in_rule__UIContainer__Group_5__03028);
            rule__UIContainer__Group_5__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__UIContainer__Group_5__1_in_rule__UIContainer__Group_5__03031);
            rule__UIContainer__Group_5__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UIContainer__Group_5__0"


    // $ANTLR start "rule__UIContainer__Group_5__0__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1529:1: rule__UIContainer__Group_5__0__Impl : ( 'description:' ) ;
    public final void rule__UIContainer__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1533:1: ( ( 'description:' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1534:1: ( 'description:' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1534:1: ( 'description:' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1535:1: 'description:'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUIContainerAccess().getDescriptionKeyword_5_0()); 
            }
            match(input,24,FOLLOW_24_in_rule__UIContainer__Group_5__0__Impl3059); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getUIContainerAccess().getDescriptionKeyword_5_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UIContainer__Group_5__0__Impl"


    // $ANTLR start "rule__UIContainer__Group_5__1"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1548:1: rule__UIContainer__Group_5__1 : rule__UIContainer__Group_5__1__Impl ;
    public final void rule__UIContainer__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1552:1: ( rule__UIContainer__Group_5__1__Impl )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1553:2: rule__UIContainer__Group_5__1__Impl
            {
            pushFollow(FOLLOW_rule__UIContainer__Group_5__1__Impl_in_rule__UIContainer__Group_5__13090);
            rule__UIContainer__Group_5__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UIContainer__Group_5__1"


    // $ANTLR start "rule__UIContainer__Group_5__1__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1559:1: rule__UIContainer__Group_5__1__Impl : ( ( rule__UIContainer__DescriptionAssignment_5_1 ) ) ;
    public final void rule__UIContainer__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1563:1: ( ( ( rule__UIContainer__DescriptionAssignment_5_1 ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1564:1: ( ( rule__UIContainer__DescriptionAssignment_5_1 ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1564:1: ( ( rule__UIContainer__DescriptionAssignment_5_1 ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1565:1: ( rule__UIContainer__DescriptionAssignment_5_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUIContainerAccess().getDescriptionAssignment_5_1()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1566:1: ( rule__UIContainer__DescriptionAssignment_5_1 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1566:2: rule__UIContainer__DescriptionAssignment_5_1
            {
            pushFollow(FOLLOW_rule__UIContainer__DescriptionAssignment_5_1_in_rule__UIContainer__Group_5__1__Impl3117);
            rule__UIContainer__DescriptionAssignment_5_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getUIContainerAccess().getDescriptionAssignment_5_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UIContainer__Group_5__1__Impl"


    // $ANTLR start "rule__UIContainer__Group_6__0"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1580:1: rule__UIContainer__Group_6__0 : rule__UIContainer__Group_6__0__Impl rule__UIContainer__Group_6__1 ;
    public final void rule__UIContainer__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1584:1: ( rule__UIContainer__Group_6__0__Impl rule__UIContainer__Group_6__1 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1585:2: rule__UIContainer__Group_6__0__Impl rule__UIContainer__Group_6__1
            {
            pushFollow(FOLLOW_rule__UIContainer__Group_6__0__Impl_in_rule__UIContainer__Group_6__03151);
            rule__UIContainer__Group_6__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__UIContainer__Group_6__1_in_rule__UIContainer__Group_6__03154);
            rule__UIContainer__Group_6__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UIContainer__Group_6__0"


    // $ANTLR start "rule__UIContainer__Group_6__0__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1592:1: rule__UIContainer__Group_6__0__Impl : ( ( rule__UIContainer__UI_fieldsAssignment_6_0 ) ) ;
    public final void rule__UIContainer__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1596:1: ( ( ( rule__UIContainer__UI_fieldsAssignment_6_0 ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1597:1: ( ( rule__UIContainer__UI_fieldsAssignment_6_0 ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1597:1: ( ( rule__UIContainer__UI_fieldsAssignment_6_0 ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1598:1: ( rule__UIContainer__UI_fieldsAssignment_6_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUIContainerAccess().getUI_fieldsAssignment_6_0()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1599:1: ( rule__UIContainer__UI_fieldsAssignment_6_0 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1599:2: rule__UIContainer__UI_fieldsAssignment_6_0
            {
            pushFollow(FOLLOW_rule__UIContainer__UI_fieldsAssignment_6_0_in_rule__UIContainer__Group_6__0__Impl3181);
            rule__UIContainer__UI_fieldsAssignment_6_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getUIContainerAccess().getUI_fieldsAssignment_6_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UIContainer__Group_6__0__Impl"


    // $ANTLR start "rule__UIContainer__Group_6__1"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1609:1: rule__UIContainer__Group_6__1 : rule__UIContainer__Group_6__1__Impl ;
    public final void rule__UIContainer__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1613:1: ( rule__UIContainer__Group_6__1__Impl )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1614:2: rule__UIContainer__Group_6__1__Impl
            {
            pushFollow(FOLLOW_rule__UIContainer__Group_6__1__Impl_in_rule__UIContainer__Group_6__13211);
            rule__UIContainer__Group_6__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UIContainer__Group_6__1"


    // $ANTLR start "rule__UIContainer__Group_6__1__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1620:1: rule__UIContainer__Group_6__1__Impl : ( ( rule__UIContainer__UI_fieldsAssignment_6_1 )* ) ;
    public final void rule__UIContainer__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1624:1: ( ( ( rule__UIContainer__UI_fieldsAssignment_6_1 )* ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1625:1: ( ( rule__UIContainer__UI_fieldsAssignment_6_1 )* )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1625:1: ( ( rule__UIContainer__UI_fieldsAssignment_6_1 )* )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1626:1: ( rule__UIContainer__UI_fieldsAssignment_6_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUIContainerAccess().getUI_fieldsAssignment_6_1()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1627:1: ( rule__UIContainer__UI_fieldsAssignment_6_1 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==26) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1627:2: rule__UIContainer__UI_fieldsAssignment_6_1
            	    {
            	    pushFollow(FOLLOW_rule__UIContainer__UI_fieldsAssignment_6_1_in_rule__UIContainer__Group_6__1__Impl3238);
            	    rule__UIContainer__UI_fieldsAssignment_6_1();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getUIContainerAccess().getUI_fieldsAssignment_6_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UIContainer__Group_6__1__Impl"


    // $ANTLR start "rule__UIContainer__Group_7__0"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1641:1: rule__UIContainer__Group_7__0 : rule__UIContainer__Group_7__0__Impl rule__UIContainer__Group_7__1 ;
    public final void rule__UIContainer__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1645:1: ( rule__UIContainer__Group_7__0__Impl rule__UIContainer__Group_7__1 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1646:2: rule__UIContainer__Group_7__0__Impl rule__UIContainer__Group_7__1
            {
            pushFollow(FOLLOW_rule__UIContainer__Group_7__0__Impl_in_rule__UIContainer__Group_7__03273);
            rule__UIContainer__Group_7__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__UIContainer__Group_7__1_in_rule__UIContainer__Group_7__03276);
            rule__UIContainer__Group_7__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UIContainer__Group_7__0"


    // $ANTLR start "rule__UIContainer__Group_7__0__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1653:1: rule__UIContainer__Group_7__0__Impl : ( ( rule__UIContainer__SubContainersAssignment_7_0 ) ) ;
    public final void rule__UIContainer__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1657:1: ( ( ( rule__UIContainer__SubContainersAssignment_7_0 ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1658:1: ( ( rule__UIContainer__SubContainersAssignment_7_0 ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1658:1: ( ( rule__UIContainer__SubContainersAssignment_7_0 ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1659:1: ( rule__UIContainer__SubContainersAssignment_7_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUIContainerAccess().getSubContainersAssignment_7_0()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1660:1: ( rule__UIContainer__SubContainersAssignment_7_0 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1660:2: rule__UIContainer__SubContainersAssignment_7_0
            {
            pushFollow(FOLLOW_rule__UIContainer__SubContainersAssignment_7_0_in_rule__UIContainer__Group_7__0__Impl3303);
            rule__UIContainer__SubContainersAssignment_7_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getUIContainerAccess().getSubContainersAssignment_7_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UIContainer__Group_7__0__Impl"


    // $ANTLR start "rule__UIContainer__Group_7__1"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1670:1: rule__UIContainer__Group_7__1 : rule__UIContainer__Group_7__1__Impl ;
    public final void rule__UIContainer__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1674:1: ( rule__UIContainer__Group_7__1__Impl )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1675:2: rule__UIContainer__Group_7__1__Impl
            {
            pushFollow(FOLLOW_rule__UIContainer__Group_7__1__Impl_in_rule__UIContainer__Group_7__13333);
            rule__UIContainer__Group_7__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UIContainer__Group_7__1"


    // $ANTLR start "rule__UIContainer__Group_7__1__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1681:1: rule__UIContainer__Group_7__1__Impl : ( ( rule__UIContainer__SubContainersAssignment_7_1 )* ) ;
    public final void rule__UIContainer__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1685:1: ( ( ( rule__UIContainer__SubContainersAssignment_7_1 )* ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1686:1: ( ( rule__UIContainer__SubContainersAssignment_7_1 )* )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1686:1: ( ( rule__UIContainer__SubContainersAssignment_7_1 )* )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1687:1: ( rule__UIContainer__SubContainersAssignment_7_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUIContainerAccess().getSubContainersAssignment_7_1()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1688:1: ( rule__UIContainer__SubContainersAssignment_7_1 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==23) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1688:2: rule__UIContainer__SubContainersAssignment_7_1
            	    {
            	    pushFollow(FOLLOW_rule__UIContainer__SubContainersAssignment_7_1_in_rule__UIContainer__Group_7__1__Impl3360);
            	    rule__UIContainer__SubContainersAssignment_7_1();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getUIContainerAccess().getSubContainersAssignment_7_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UIContainer__Group_7__1__Impl"


    // $ANTLR start "rule__LocalClass__Group__0"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1702:1: rule__LocalClass__Group__0 : rule__LocalClass__Group__0__Impl rule__LocalClass__Group__1 ;
    public final void rule__LocalClass__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1706:1: ( rule__LocalClass__Group__0__Impl rule__LocalClass__Group__1 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1707:2: rule__LocalClass__Group__0__Impl rule__LocalClass__Group__1
            {
            pushFollow(FOLLOW_rule__LocalClass__Group__0__Impl_in_rule__LocalClass__Group__03395);
            rule__LocalClass__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__LocalClass__Group__1_in_rule__LocalClass__Group__03398);
            rule__LocalClass__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocalClass__Group__0"


    // $ANTLR start "rule__LocalClass__Group__0__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1714:1: rule__LocalClass__Group__0__Impl : ( () ) ;
    public final void rule__LocalClass__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1718:1: ( ( () ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1719:1: ( () )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1719:1: ( () )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1720:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLocalClassAccess().getLocalClassAction_0()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1721:1: ()
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1723:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLocalClassAccess().getLocalClassAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocalClass__Group__0__Impl"


    // $ANTLR start "rule__LocalClass__Group__1"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1733:1: rule__LocalClass__Group__1 : rule__LocalClass__Group__1__Impl rule__LocalClass__Group__2 ;
    public final void rule__LocalClass__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1737:1: ( rule__LocalClass__Group__1__Impl rule__LocalClass__Group__2 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1738:2: rule__LocalClass__Group__1__Impl rule__LocalClass__Group__2
            {
            pushFollow(FOLLOW_rule__LocalClass__Group__1__Impl_in_rule__LocalClass__Group__13456);
            rule__LocalClass__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__LocalClass__Group__2_in_rule__LocalClass__Group__13459);
            rule__LocalClass__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocalClass__Group__1"


    // $ANTLR start "rule__LocalClass__Group__1__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1745:1: rule__LocalClass__Group__1__Impl : ( 'for' ) ;
    public final void rule__LocalClass__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1749:1: ( ( 'for' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1750:1: ( 'for' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1750:1: ( 'for' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1751:1: 'for'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLocalClassAccess().getForKeyword_1()); 
            }
            match(input,25,FOLLOW_25_in_rule__LocalClass__Group__1__Impl3487); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLocalClassAccess().getForKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocalClass__Group__1__Impl"


    // $ANTLR start "rule__LocalClass__Group__2"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1764:1: rule__LocalClass__Group__2 : rule__LocalClass__Group__2__Impl ;
    public final void rule__LocalClass__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1768:1: ( rule__LocalClass__Group__2__Impl )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1769:2: rule__LocalClass__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__LocalClass__Group__2__Impl_in_rule__LocalClass__Group__23518);
            rule__LocalClass__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocalClass__Group__2"


    // $ANTLR start "rule__LocalClass__Group__2__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1775:1: rule__LocalClass__Group__2__Impl : ( ( rule__LocalClass__UI_For_LocalClassAssignment_2 ) ) ;
    public final void rule__LocalClass__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1779:1: ( ( ( rule__LocalClass__UI_For_LocalClassAssignment_2 ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1780:1: ( ( rule__LocalClass__UI_For_LocalClassAssignment_2 ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1780:1: ( ( rule__LocalClass__UI_For_LocalClassAssignment_2 ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1781:1: ( rule__LocalClass__UI_For_LocalClassAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLocalClassAccess().getUI_For_LocalClassAssignment_2()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1782:1: ( rule__LocalClass__UI_For_LocalClassAssignment_2 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1782:2: rule__LocalClass__UI_For_LocalClassAssignment_2
            {
            pushFollow(FOLLOW_rule__LocalClass__UI_For_LocalClassAssignment_2_in_rule__LocalClass__Group__2__Impl3545);
            rule__LocalClass__UI_For_LocalClassAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLocalClassAccess().getUI_For_LocalClassAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocalClass__Group__2__Impl"


    // $ANTLR start "rule__UIField__Group__0"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1798:1: rule__UIField__Group__0 : rule__UIField__Group__0__Impl rule__UIField__Group__1 ;
    public final void rule__UIField__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1802:1: ( rule__UIField__Group__0__Impl rule__UIField__Group__1 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1803:2: rule__UIField__Group__0__Impl rule__UIField__Group__1
            {
            pushFollow(FOLLOW_rule__UIField__Group__0__Impl_in_rule__UIField__Group__03581);
            rule__UIField__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__UIField__Group__1_in_rule__UIField__Group__03584);
            rule__UIField__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UIField__Group__0"


    // $ANTLR start "rule__UIField__Group__0__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1810:1: rule__UIField__Group__0__Impl : ( () ) ;
    public final void rule__UIField__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1814:1: ( ( () ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1815:1: ( () )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1815:1: ( () )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1816:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUIFieldAccess().getUIFieldAction_0()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1817:1: ()
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1819:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getUIFieldAccess().getUIFieldAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UIField__Group__0__Impl"


    // $ANTLR start "rule__UIField__Group__1"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1829:1: rule__UIField__Group__1 : rule__UIField__Group__1__Impl rule__UIField__Group__2 ;
    public final void rule__UIField__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1833:1: ( rule__UIField__Group__1__Impl rule__UIField__Group__2 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1834:2: rule__UIField__Group__1__Impl rule__UIField__Group__2
            {
            pushFollow(FOLLOW_rule__UIField__Group__1__Impl_in_rule__UIField__Group__13642);
            rule__UIField__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__UIField__Group__2_in_rule__UIField__Group__13645);
            rule__UIField__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UIField__Group__1"


    // $ANTLR start "rule__UIField__Group__1__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1841:1: rule__UIField__Group__1__Impl : ( 'Field' ) ;
    public final void rule__UIField__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1845:1: ( ( 'Field' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1846:1: ( 'Field' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1846:1: ( 'Field' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1847:1: 'Field'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUIFieldAccess().getFieldKeyword_1()); 
            }
            match(input,26,FOLLOW_26_in_rule__UIField__Group__1__Impl3673); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getUIFieldAccess().getFieldKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UIField__Group__1__Impl"


    // $ANTLR start "rule__UIField__Group__2"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1860:1: rule__UIField__Group__2 : rule__UIField__Group__2__Impl rule__UIField__Group__3 ;
    public final void rule__UIField__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1864:1: ( rule__UIField__Group__2__Impl rule__UIField__Group__3 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1865:2: rule__UIField__Group__2__Impl rule__UIField__Group__3
            {
            pushFollow(FOLLOW_rule__UIField__Group__2__Impl_in_rule__UIField__Group__23704);
            rule__UIField__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__UIField__Group__3_in_rule__UIField__Group__23707);
            rule__UIField__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UIField__Group__2"


    // $ANTLR start "rule__UIField__Group__2__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1872:1: rule__UIField__Group__2__Impl : ( ( rule__UIField__NameAssignment_2 ) ) ;
    public final void rule__UIField__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1876:1: ( ( ( rule__UIField__NameAssignment_2 ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1877:1: ( ( rule__UIField__NameAssignment_2 ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1877:1: ( ( rule__UIField__NameAssignment_2 ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1878:1: ( rule__UIField__NameAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUIFieldAccess().getNameAssignment_2()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1879:1: ( rule__UIField__NameAssignment_2 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1879:2: rule__UIField__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__UIField__NameAssignment_2_in_rule__UIField__Group__2__Impl3734);
            rule__UIField__NameAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getUIFieldAccess().getNameAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UIField__Group__2__Impl"


    // $ANTLR start "rule__UIField__Group__3"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1889:1: rule__UIField__Group__3 : rule__UIField__Group__3__Impl rule__UIField__Group__4 ;
    public final void rule__UIField__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1893:1: ( rule__UIField__Group__3__Impl rule__UIField__Group__4 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1894:2: rule__UIField__Group__3__Impl rule__UIField__Group__4
            {
            pushFollow(FOLLOW_rule__UIField__Group__3__Impl_in_rule__UIField__Group__33764);
            rule__UIField__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__UIField__Group__4_in_rule__UIField__Group__33767);
            rule__UIField__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UIField__Group__3"


    // $ANTLR start "rule__UIField__Group__3__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1901:1: rule__UIField__Group__3__Impl : ( ( rule__UIField__Group_3__0 )? ) ;
    public final void rule__UIField__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1905:1: ( ( ( rule__UIField__Group_3__0 )? ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1906:1: ( ( rule__UIField__Group_3__0 )? )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1906:1: ( ( rule__UIField__Group_3__0 )? )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1907:1: ( rule__UIField__Group_3__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUIFieldAccess().getGroup_3()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1908:1: ( rule__UIField__Group_3__0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==22) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1908:2: rule__UIField__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__UIField__Group_3__0_in_rule__UIField__Group__3__Impl3794);
                    rule__UIField__Group_3__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getUIFieldAccess().getGroup_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UIField__Group__3__Impl"


    // $ANTLR start "rule__UIField__Group__4"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1918:1: rule__UIField__Group__4 : rule__UIField__Group__4__Impl rule__UIField__Group__5 ;
    public final void rule__UIField__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1922:1: ( rule__UIField__Group__4__Impl rule__UIField__Group__5 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1923:2: rule__UIField__Group__4__Impl rule__UIField__Group__5
            {
            pushFollow(FOLLOW_rule__UIField__Group__4__Impl_in_rule__UIField__Group__43825);
            rule__UIField__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__UIField__Group__5_in_rule__UIField__Group__43828);
            rule__UIField__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UIField__Group__4"


    // $ANTLR start "rule__UIField__Group__4__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1930:1: rule__UIField__Group__4__Impl : ( ( rule__UIField__Group_4__0 )? ) ;
    public final void rule__UIField__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1934:1: ( ( ( rule__UIField__Group_4__0 )? ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1935:1: ( ( rule__UIField__Group_4__0 )? )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1935:1: ( ( rule__UIField__Group_4__0 )? )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1936:1: ( rule__UIField__Group_4__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUIFieldAccess().getGroup_4()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1937:1: ( rule__UIField__Group_4__0 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==24) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1937:2: rule__UIField__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__UIField__Group_4__0_in_rule__UIField__Group__4__Impl3855);
                    rule__UIField__Group_4__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getUIFieldAccess().getGroup_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UIField__Group__4__Impl"


    // $ANTLR start "rule__UIField__Group__5"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1947:1: rule__UIField__Group__5 : rule__UIField__Group__5__Impl rule__UIField__Group__6 ;
    public final void rule__UIField__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1951:1: ( rule__UIField__Group__5__Impl rule__UIField__Group__6 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1952:2: rule__UIField__Group__5__Impl rule__UIField__Group__6
            {
            pushFollow(FOLLOW_rule__UIField__Group__5__Impl_in_rule__UIField__Group__53886);
            rule__UIField__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__UIField__Group__6_in_rule__UIField__Group__53889);
            rule__UIField__Group__6();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UIField__Group__5"


    // $ANTLR start "rule__UIField__Group__5__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1959:1: rule__UIField__Group__5__Impl : ( ( rule__UIField__Group_5__0 )? ) ;
    public final void rule__UIField__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1963:1: ( ( ( rule__UIField__Group_5__0 )? ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1964:1: ( ( rule__UIField__Group_5__0 )? )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1964:1: ( ( rule__UIField__Group_5__0 )? )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1965:1: ( rule__UIField__Group_5__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUIFieldAccess().getGroup_5()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1966:1: ( rule__UIField__Group_5__0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==28) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1966:2: rule__UIField__Group_5__0
                    {
                    pushFollow(FOLLOW_rule__UIField__Group_5__0_in_rule__UIField__Group__5__Impl3916);
                    rule__UIField__Group_5__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getUIFieldAccess().getGroup_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UIField__Group__5__Impl"


    // $ANTLR start "rule__UIField__Group__6"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1976:1: rule__UIField__Group__6 : rule__UIField__Group__6__Impl rule__UIField__Group__7 ;
    public final void rule__UIField__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1980:1: ( rule__UIField__Group__6__Impl rule__UIField__Group__7 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1981:2: rule__UIField__Group__6__Impl rule__UIField__Group__7
            {
            pushFollow(FOLLOW_rule__UIField__Group__6__Impl_in_rule__UIField__Group__63947);
            rule__UIField__Group__6__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__UIField__Group__7_in_rule__UIField__Group__63950);
            rule__UIField__Group__7();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UIField__Group__6"


    // $ANTLR start "rule__UIField__Group__6__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1988:1: rule__UIField__Group__6__Impl : ( ',' ) ;
    public final void rule__UIField__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1992:1: ( ( ',' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1993:1: ( ',' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1993:1: ( ',' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1994:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUIFieldAccess().getCommaKeyword_6()); 
            }
            match(input,27,FOLLOW_27_in_rule__UIField__Group__6__Impl3978); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getUIFieldAccess().getCommaKeyword_6()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UIField__Group__6__Impl"


    // $ANTLR start "rule__UIField__Group__7"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:2007:1: rule__UIField__Group__7 : rule__UIField__Group__7__Impl ;
    public final void rule__UIField__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:2011:1: ( rule__UIField__Group__7__Impl )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:2012:2: rule__UIField__Group__7__Impl
            {
            pushFollow(FOLLOW_rule__UIField__Group__7__Impl_in_rule__UIField__Group__74009);
            rule__UIField__Group__7__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UIField__Group__7"


    // $ANTLR start "rule__UIField__Group__7__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:2018:1: rule__UIField__Group__7__Impl : ( ( rule__UIField__MappingAssignment_7 ) ) ;
    public final void rule__UIField__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:2022:1: ( ( ( rule__UIField__MappingAssignment_7 ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:2023:1: ( ( rule__UIField__MappingAssignment_7 ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:2023:1: ( ( rule__UIField__MappingAssignment_7 ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:2024:1: ( rule__UIField__MappingAssignment_7 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUIFieldAccess().getMappingAssignment_7()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:2025:1: ( rule__UIField__MappingAssignment_7 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:2025:2: rule__UIField__MappingAssignment_7
            {
            pushFollow(FOLLOW_rule__UIField__MappingAssignment_7_in_rule__UIField__Group__7__Impl4036);
            rule__UIField__MappingAssignment_7();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getUIFieldAccess().getMappingAssignment_7()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UIField__Group__7__Impl"


    // $ANTLR start "rule__UIField__Group_3__0"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:2051:1: rule__UIField__Group_3__0 : rule__UIField__Group_3__0__Impl rule__UIField__Group_3__1 ;
    public final void rule__UIField__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:2055:1: ( rule__UIField__Group_3__0__Impl rule__UIField__Group_3__1 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:2056:2: rule__UIField__Group_3__0__Impl rule__UIField__Group_3__1
            {
            pushFollow(FOLLOW_rule__UIField__Group_3__0__Impl_in_rule__UIField__Group_3__04082);
            rule__UIField__Group_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__UIField__Group_3__1_in_rule__UIField__Group_3__04085);
            rule__UIField__Group_3__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UIField__Group_3__0"


    // $ANTLR start "rule__UIField__Group_3__0__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:2063:1: rule__UIField__Group_3__0__Impl : ( 'label:' ) ;
    public final void rule__UIField__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:2067:1: ( ( 'label:' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:2068:1: ( 'label:' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:2068:1: ( 'label:' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:2069:1: 'label:'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUIFieldAccess().getLabelKeyword_3_0()); 
            }
            match(input,22,FOLLOW_22_in_rule__UIField__Group_3__0__Impl4113); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getUIFieldAccess().getLabelKeyword_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UIField__Group_3__0__Impl"


    // $ANTLR start "rule__UIField__Group_3__1"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:2082:1: rule__UIField__Group_3__1 : rule__UIField__Group_3__1__Impl ;
    public final void rule__UIField__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:2086:1: ( rule__UIField__Group_3__1__Impl )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:2087:2: rule__UIField__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__UIField__Group_3__1__Impl_in_rule__UIField__Group_3__14144);
            rule__UIField__Group_3__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UIField__Group_3__1"


    // $ANTLR start "rule__UIField__Group_3__1__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:2093:1: rule__UIField__Group_3__1__Impl : ( ( rule__UIField__LabelAssignment_3_1 ) ) ;
    public final void rule__UIField__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:2097:1: ( ( ( rule__UIField__LabelAssignment_3_1 ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:2098:1: ( ( rule__UIField__LabelAssignment_3_1 ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:2098:1: ( ( rule__UIField__LabelAssignment_3_1 ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:2099:1: ( rule__UIField__LabelAssignment_3_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUIFieldAccess().getLabelAssignment_3_1()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:2100:1: ( rule__UIField__LabelAssignment_3_1 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:2100:2: rule__UIField__LabelAssignment_3_1
            {
            pushFollow(FOLLOW_rule__UIField__LabelAssignment_3_1_in_rule__UIField__Group_3__1__Impl4171);
            rule__UIField__LabelAssignment_3_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getUIFieldAccess().getLabelAssignment_3_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UIField__Group_3__1__Impl"


    // $ANTLR start "rule__UIField__Group_4__0"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:2114:1: rule__UIField__Group_4__0 : rule__UIField__Group_4__0__Impl rule__UIField__Group_4__1 ;
    public final void rule__UIField__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:2118:1: ( rule__UIField__Group_4__0__Impl rule__UIField__Group_4__1 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:2119:2: rule__UIField__Group_4__0__Impl rule__UIField__Group_4__1
            {
            pushFollow(FOLLOW_rule__UIField__Group_4__0__Impl_in_rule__UIField__Group_4__04205);
            rule__UIField__Group_4__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__UIField__Group_4__1_in_rule__UIField__Group_4__04208);
            rule__UIField__Group_4__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UIField__Group_4__0"


    // $ANTLR start "rule__UIField__Group_4__0__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:2126:1: rule__UIField__Group_4__0__Impl : ( 'description:' ) ;
    public final void rule__UIField__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:2130:1: ( ( 'description:' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:2131:1: ( 'description:' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:2131:1: ( 'description:' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:2132:1: 'description:'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUIFieldAccess().getDescriptionKeyword_4_0()); 
            }
            match(input,24,FOLLOW_24_in_rule__UIField__Group_4__0__Impl4236); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getUIFieldAccess().getDescriptionKeyword_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UIField__Group_4__0__Impl"


    // $ANTLR start "rule__UIField__Group_4__1"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:2145:1: rule__UIField__Group_4__1 : rule__UIField__Group_4__1__Impl rule__UIField__Group_4__2 ;
    public final void rule__UIField__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:2149:1: ( rule__UIField__Group_4__1__Impl rule__UIField__Group_4__2 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:2150:2: rule__UIField__Group_4__1__Impl rule__UIField__Group_4__2
            {
            pushFollow(FOLLOW_rule__UIField__Group_4__1__Impl_in_rule__UIField__Group_4__14267);
            rule__UIField__Group_4__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__UIField__Group_4__2_in_rule__UIField__Group_4__14270);
            rule__UIField__Group_4__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UIField__Group_4__1"


    // $ANTLR start "rule__UIField__Group_4__1__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:2157:1: rule__UIField__Group_4__1__Impl : ( ( rule__UIField__DescriptionAssignment_4_1 ) ) ;
    public final void rule__UIField__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:2161:1: ( ( ( rule__UIField__DescriptionAssignment_4_1 ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:2162:1: ( ( rule__UIField__DescriptionAssignment_4_1 ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:2162:1: ( ( rule__UIField__DescriptionAssignment_4_1 ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:2163:1: ( rule__UIField__DescriptionAssignment_4_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUIFieldAccess().getDescriptionAssignment_4_1()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:2164:1: ( rule__UIField__DescriptionAssignment_4_1 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:2164:2: rule__UIField__DescriptionAssignment_4_1
            {
            pushFollow(FOLLOW_rule__UIField__DescriptionAssignment_4_1_in_rule__UIField__Group_4__1__Impl4297);
            rule__UIField__DescriptionAssignment_4_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getUIFieldAccess().getDescriptionAssignment_4_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UIField__Group_4__1__Impl"


    // $ANTLR start "rule__UIField__Group_4__2"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:2174:1: rule__UIField__Group_4__2 : rule__UIField__Group_4__2__Impl ;
    public final void rule__UIField__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:2178:1: ( rule__UIField__Group_4__2__Impl )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:2179:2: rule__UIField__Group_4__2__Impl
            {
            pushFollow(FOLLOW_rule__UIField__Group_4__2__Impl_in_rule__UIField__Group_4__24327);
            rule__UIField__Group_4__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UIField__Group_4__2"


    // $ANTLR start "rule__UIField__Group_4__2__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:2185:1: rule__UIField__Group_4__2__Impl : ( ',' ) ;
    public final void rule__UIField__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:2189:1: ( ( ',' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:2190:1: ( ',' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:2190:1: ( ',' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:2191:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUIFieldAccess().getCommaKeyword_4_2()); 
            }
            match(input,27,FOLLOW_27_in_rule__UIField__Group_4__2__Impl4355); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getUIFieldAccess().getCommaKeyword_4_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UIField__Group_4__2__Impl"


    // $ANTLR start "rule__UIField__Group_5__0"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:2210:1: rule__UIField__Group_5__0 : rule__UIField__Group_5__0__Impl rule__UIField__Group_5__1 ;
    public final void rule__UIField__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:2214:1: ( rule__UIField__Group_5__0__Impl rule__UIField__Group_5__1 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:2215:2: rule__UIField__Group_5__0__Impl rule__UIField__Group_5__1
            {
            pushFollow(FOLLOW_rule__UIField__Group_5__0__Impl_in_rule__UIField__Group_5__04392);
            rule__UIField__Group_5__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__UIField__Group_5__1_in_rule__UIField__Group_5__04395);
            rule__UIField__Group_5__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UIField__Group_5__0"


    // $ANTLR start "rule__UIField__Group_5__0__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:2222:1: rule__UIField__Group_5__0__Impl : ( 'type' ) ;
    public final void rule__UIField__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:2226:1: ( ( 'type' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:2227:1: ( 'type' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:2227:1: ( 'type' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:2228:1: 'type'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUIFieldAccess().getTypeKeyword_5_0()); 
            }
            match(input,28,FOLLOW_28_in_rule__UIField__Group_5__0__Impl4423); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getUIFieldAccess().getTypeKeyword_5_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UIField__Group_5__0__Impl"


    // $ANTLR start "rule__UIField__Group_5__1"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:2241:1: rule__UIField__Group_5__1 : rule__UIField__Group_5__1__Impl ;
    public final void rule__UIField__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:2245:1: ( rule__UIField__Group_5__1__Impl )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:2246:2: rule__UIField__Group_5__1__Impl
            {
            pushFollow(FOLLOW_rule__UIField__Group_5__1__Impl_in_rule__UIField__Group_5__14454);
            rule__UIField__Group_5__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UIField__Group_5__1"


    // $ANTLR start "rule__UIField__Group_5__1__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:2252:1: rule__UIField__Group_5__1__Impl : ( ( rule__UIField__TypeAssignment_5_1 ) ) ;
    public final void rule__UIField__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:2256:1: ( ( ( rule__UIField__TypeAssignment_5_1 ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:2257:1: ( ( rule__UIField__TypeAssignment_5_1 ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:2257:1: ( ( rule__UIField__TypeAssignment_5_1 ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:2258:1: ( rule__UIField__TypeAssignment_5_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUIFieldAccess().getTypeAssignment_5_1()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:2259:1: ( rule__UIField__TypeAssignment_5_1 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:2259:2: rule__UIField__TypeAssignment_5_1
            {
            pushFollow(FOLLOW_rule__UIField__TypeAssignment_5_1_in_rule__UIField__Group_5__1__Impl4481);
            rule__UIField__TypeAssignment_5_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getUIFieldAccess().getTypeAssignment_5_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UIField__Group_5__1__Impl"


    // $ANTLR start "rule__FieldMapping__Group__0"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:2273:1: rule__FieldMapping__Group__0 : rule__FieldMapping__Group__0__Impl rule__FieldMapping__Group__1 ;
    public final void rule__FieldMapping__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:2277:1: ( rule__FieldMapping__Group__0__Impl rule__FieldMapping__Group__1 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:2278:2: rule__FieldMapping__Group__0__Impl rule__FieldMapping__Group__1
            {
            pushFollow(FOLLOW_rule__FieldMapping__Group__0__Impl_in_rule__FieldMapping__Group__04515);
            rule__FieldMapping__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__FieldMapping__Group__1_in_rule__FieldMapping__Group__04518);
            rule__FieldMapping__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldMapping__Group__0"


    // $ANTLR start "rule__FieldMapping__Group__0__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:2285:1: rule__FieldMapping__Group__0__Impl : ( () ) ;
    public final void rule__FieldMapping__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:2289:1: ( ( () ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:2290:1: ( () )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:2290:1: ( () )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:2291:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldMappingAccess().getFieldMappingAction_0()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:2292:1: ()
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:2294:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFieldMappingAccess().getFieldMappingAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldMapping__Group__0__Impl"


    // $ANTLR start "rule__FieldMapping__Group__1"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:2304:1: rule__FieldMapping__Group__1 : rule__FieldMapping__Group__1__Impl rule__FieldMapping__Group__2 ;
    public final void rule__FieldMapping__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:2308:1: ( rule__FieldMapping__Group__1__Impl rule__FieldMapping__Group__2 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:2309:2: rule__FieldMapping__Group__1__Impl rule__FieldMapping__Group__2
            {
            pushFollow(FOLLOW_rule__FieldMapping__Group__1__Impl_in_rule__FieldMapping__Group__14576);
            rule__FieldMapping__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__FieldMapping__Group__2_in_rule__FieldMapping__Group__14579);
            rule__FieldMapping__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldMapping__Group__1"


    // $ANTLR start "rule__FieldMapping__Group__1__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:2316:1: rule__FieldMapping__Group__1__Impl : ( 'mapped-to' ) ;
    public final void rule__FieldMapping__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:2320:1: ( ( 'mapped-to' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:2321:1: ( 'mapped-to' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:2321:1: ( 'mapped-to' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:2322:1: 'mapped-to'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldMappingAccess().getMappedToKeyword_1()); 
            }
            match(input,29,FOLLOW_29_in_rule__FieldMapping__Group__1__Impl4607); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFieldMappingAccess().getMappedToKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldMapping__Group__1__Impl"


    // $ANTLR start "rule__FieldMapping__Group__2"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:2335:1: rule__FieldMapping__Group__2 : rule__FieldMapping__Group__2__Impl ;
    public final void rule__FieldMapping__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:2339:1: ( rule__FieldMapping__Group__2__Impl )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:2340:2: rule__FieldMapping__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__FieldMapping__Group__2__Impl_in_rule__FieldMapping__Group__24638);
            rule__FieldMapping__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldMapping__Group__2"


    // $ANTLR start "rule__FieldMapping__Group__2__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:2346:1: rule__FieldMapping__Group__2__Impl : ( ( rule__FieldMapping__UI_Field_Mapped_ToAssignment_2 )? ) ;
    public final void rule__FieldMapping__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:2350:1: ( ( ( rule__FieldMapping__UI_Field_Mapped_ToAssignment_2 )? ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:2351:1: ( ( rule__FieldMapping__UI_Field_Mapped_ToAssignment_2 )? )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:2351:1: ( ( rule__FieldMapping__UI_Field_Mapped_ToAssignment_2 )? )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:2352:1: ( rule__FieldMapping__UI_Field_Mapped_ToAssignment_2 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldMappingAccess().getUI_Field_Mapped_ToAssignment_2()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:2353:1: ( rule__FieldMapping__UI_Field_Mapped_ToAssignment_2 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==RULE_ID) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:2353:2: rule__FieldMapping__UI_Field_Mapped_ToAssignment_2
                    {
                    pushFollow(FOLLOW_rule__FieldMapping__UI_Field_Mapped_ToAssignment_2_in_rule__FieldMapping__Group__2__Impl4665);
                    rule__FieldMapping__UI_Field_Mapped_ToAssignment_2();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFieldMappingAccess().getUI_Field_Mapped_ToAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldMapping__Group__2__Impl"


    // $ANTLR start "rule__FQN__Group__0"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:2369:1: rule__FQN__Group__0 : rule__FQN__Group__0__Impl rule__FQN__Group__1 ;
    public final void rule__FQN__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:2373:1: ( rule__FQN__Group__0__Impl rule__FQN__Group__1 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:2374:2: rule__FQN__Group__0__Impl rule__FQN__Group__1
            {
            pushFollow(FOLLOW_rule__FQN__Group__0__Impl_in_rule__FQN__Group__04702);
            rule__FQN__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__FQN__Group__1_in_rule__FQN__Group__04705);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:2381:1: rule__FQN__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__FQN__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:2385:1: ( ( RULE_ID ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:2386:1: ( RULE_ID )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:2386:1: ( RULE_ID )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:2387:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFQNAccess().getIDTerminalRuleCall_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__FQN__Group__0__Impl4732); if (state.failed) return ;
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:2398:1: rule__FQN__Group__1 : rule__FQN__Group__1__Impl ;
    public final void rule__FQN__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:2402:1: ( rule__FQN__Group__1__Impl )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:2403:2: rule__FQN__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__FQN__Group__1__Impl_in_rule__FQN__Group__14761);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:2409:1: rule__FQN__Group__1__Impl : ( ( rule__FQN__Group_1__0 )* ) ;
    public final void rule__FQN__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:2413:1: ( ( ( rule__FQN__Group_1__0 )* ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:2414:1: ( ( rule__FQN__Group_1__0 )* )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:2414:1: ( ( rule__FQN__Group_1__0 )* )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:2415:1: ( rule__FQN__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFQNAccess().getGroup_1()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:2416:1: ( rule__FQN__Group_1__0 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==30) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:2416:2: rule__FQN__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__FQN__Group_1__0_in_rule__FQN__Group__1__Impl4788);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:2430:1: rule__FQN__Group_1__0 : rule__FQN__Group_1__0__Impl rule__FQN__Group_1__1 ;
    public final void rule__FQN__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:2434:1: ( rule__FQN__Group_1__0__Impl rule__FQN__Group_1__1 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:2435:2: rule__FQN__Group_1__0__Impl rule__FQN__Group_1__1
            {
            pushFollow(FOLLOW_rule__FQN__Group_1__0__Impl_in_rule__FQN__Group_1__04823);
            rule__FQN__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__FQN__Group_1__1_in_rule__FQN__Group_1__04826);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:2442:1: rule__FQN__Group_1__0__Impl : ( '.' ) ;
    public final void rule__FQN__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:2446:1: ( ( '.' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:2447:1: ( '.' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:2447:1: ( '.' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:2448:1: '.'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFQNAccess().getFullStopKeyword_1_0()); 
            }
            match(input,30,FOLLOW_30_in_rule__FQN__Group_1__0__Impl4854); if (state.failed) return ;
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:2461:1: rule__FQN__Group_1__1 : rule__FQN__Group_1__1__Impl ;
    public final void rule__FQN__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:2465:1: ( rule__FQN__Group_1__1__Impl )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:2466:2: rule__FQN__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__FQN__Group_1__1__Impl_in_rule__FQN__Group_1__14885);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:2472:1: rule__FQN__Group_1__1__Impl : ( ( RULE_ID ) ) ;
    public final void rule__FQN__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:2476:1: ( ( ( RULE_ID ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:2477:1: ( ( RULE_ID ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:2477:1: ( ( RULE_ID ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:2478:1: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFQNAccess().getIDTerminalRuleCall_1_1()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:2479:1: ( RULE_ID )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:2479:3: RULE_ID
            {
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__FQN__Group_1__1__Impl4913); if (state.failed) return ;

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


    // $ANTLR start "rule__UserInterface__ImportsAssignment_1"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:2494:1: rule__UserInterface__ImportsAssignment_1 : ( ruleImport ) ;
    public final void rule__UserInterface__ImportsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:2498:1: ( ( ruleImport ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:2499:1: ( ruleImport )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:2499:1: ( ruleImport )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:2500:1: ruleImport
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUserInterfaceAccess().getImportsImportParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleImport_in_rule__UserInterface__ImportsAssignment_14952);
            ruleImport();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getUserInterfaceAccess().getImportsImportParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UserInterface__ImportsAssignment_1"


    // $ANTLR start "rule__UserInterface__UiDescriptionAssignment_2"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:2509:1: rule__UserInterface__UiDescriptionAssignment_2 : ( ruleAspect ) ;
    public final void rule__UserInterface__UiDescriptionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:2513:1: ( ( ruleAspect ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:2514:1: ( ruleAspect )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:2514:1: ( ruleAspect )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:2515:1: ruleAspect
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUserInterfaceAccess().getUiDescriptionAspectParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleAspect_in_rule__UserInterface__UiDescriptionAssignment_24983);
            ruleAspect();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getUserInterfaceAccess().getUiDescriptionAspectParserRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UserInterface__UiDescriptionAssignment_2"


    // $ANTLR start "rule__Import__ImportedNamespaceAssignment_1"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:2524:1: rule__Import__ImportedNamespaceAssignment_1 : ( ruleFQN ) ;
    public final void rule__Import__ImportedNamespaceAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:2528:1: ( ( ruleFQN ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:2529:1: ( ruleFQN )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:2529:1: ( ruleFQN )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:2530:1: ruleFQN
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImportAccess().getImportedNamespaceFQNParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleFQN_in_rule__Import__ImportedNamespaceAssignment_15014);
            ruleFQN();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getImportAccess().getImportedNamespaceFQNParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__ImportedNamespaceAssignment_1"


    // $ANTLR start "rule__UIDescription__NameAssignment_2"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:2539:1: rule__UIDescription__NameAssignment_2 : ( ruleFQN ) ;
    public final void rule__UIDescription__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:2543:1: ( ( ruleFQN ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:2544:1: ( ruleFQN )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:2544:1: ( ruleFQN )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:2545:1: ruleFQN
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUIDescriptionAccess().getNameFQNParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleFQN_in_rule__UIDescription__NameAssignment_25045);
            ruleFQN();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getUIDescriptionAccess().getNameFQNParserRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UIDescription__NameAssignment_2"


    // $ANTLR start "rule__UIDescription__UIsAssignment_4"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:2554:1: rule__UIDescription__UIsAssignment_4 : ( ruleUI ) ;
    public final void rule__UIDescription__UIsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:2558:1: ( ( ruleUI ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:2559:1: ( ruleUI )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:2559:1: ( ruleUI )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:2560:1: ruleUI
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUIDescriptionAccess().getUIsUIParserRuleCall_4_0()); 
            }
            pushFollow(FOLLOW_ruleUI_in_rule__UIDescription__UIsAssignment_45076);
            ruleUI();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getUIDescriptionAccess().getUIsUIParserRuleCall_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UIDescription__UIsAssignment_4"


    // $ANTLR start "rule__UI__NameAssignment_2"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:2569:1: rule__UI__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__UI__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:2573:1: ( ( ruleEString ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:2574:1: ( ruleEString )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:2574:1: ( ruleEString )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:2575:1: ruleEString
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUIAccess().getNameEStringParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleEString_in_rule__UI__NameAssignment_25107);
            ruleEString();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getUIAccess().getNameEStringParserRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UI__NameAssignment_2"


    // $ANTLR start "rule__UI__UI_DataSourceAssignment_3"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:2584:1: rule__UI__UI_DataSourceAssignment_3 : ( ruleDataSource ) ;
    public final void rule__UI__UI_DataSourceAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:2588:1: ( ( ruleDataSource ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:2589:1: ( ruleDataSource )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:2589:1: ( ruleDataSource )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:2590:1: ruleDataSource
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUIAccess().getUI_DataSourceDataSourceParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_ruleDataSource_in_rule__UI__UI_DataSourceAssignment_35138);
            ruleDataSource();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getUIAccess().getUI_DataSourceDataSourceParserRuleCall_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UI__UI_DataSourceAssignment_3"


    // $ANTLR start "rule__UI__LabelAssignment_5_1"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:2599:1: rule__UI__LabelAssignment_5_1 : ( ruleEString ) ;
    public final void rule__UI__LabelAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:2603:1: ( ( ruleEString ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:2604:1: ( ruleEString )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:2604:1: ( ruleEString )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:2605:1: ruleEString
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUIAccess().getLabelEStringParserRuleCall_5_1_0()); 
            }
            pushFollow(FOLLOW_ruleEString_in_rule__UI__LabelAssignment_5_15169);
            ruleEString();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getUIAccess().getLabelEStringParserRuleCall_5_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UI__LabelAssignment_5_1"


    // $ANTLR start "rule__UI__UI_ContainersAssignment_6"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:2614:1: rule__UI__UI_ContainersAssignment_6 : ( ruleUIContainer ) ;
    public final void rule__UI__UI_ContainersAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:2618:1: ( ( ruleUIContainer ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:2619:1: ( ruleUIContainer )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:2619:1: ( ruleUIContainer )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:2620:1: ruleUIContainer
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUIAccess().getUI_ContainersUIContainerParserRuleCall_6_0()); 
            }
            pushFollow(FOLLOW_ruleUIContainer_in_rule__UI__UI_ContainersAssignment_65200);
            ruleUIContainer();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getUIAccess().getUI_ContainersUIContainerParserRuleCall_6_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UI__UI_ContainersAssignment_6"


    // $ANTLR start "rule__UIContainer__NameAssignment_2"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:2629:1: rule__UIContainer__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__UIContainer__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:2633:1: ( ( ruleEString ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:2634:1: ( ruleEString )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:2634:1: ( ruleEString )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:2635:1: ruleEString
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUIContainerAccess().getNameEStringParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleEString_in_rule__UIContainer__NameAssignment_25231);
            ruleEString();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getUIContainerAccess().getNameEStringParserRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UIContainer__NameAssignment_2"


    // $ANTLR start "rule__UIContainer__LabelAssignment_4_1"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:2644:1: rule__UIContainer__LabelAssignment_4_1 : ( ruleEString ) ;
    public final void rule__UIContainer__LabelAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:2648:1: ( ( ruleEString ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:2649:1: ( ruleEString )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:2649:1: ( ruleEString )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:2650:1: ruleEString
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUIContainerAccess().getLabelEStringParserRuleCall_4_1_0()); 
            }
            pushFollow(FOLLOW_ruleEString_in_rule__UIContainer__LabelAssignment_4_15262);
            ruleEString();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getUIContainerAccess().getLabelEStringParserRuleCall_4_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UIContainer__LabelAssignment_4_1"


    // $ANTLR start "rule__UIContainer__DescriptionAssignment_5_1"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:2659:1: rule__UIContainer__DescriptionAssignment_5_1 : ( ruleEString ) ;
    public final void rule__UIContainer__DescriptionAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:2663:1: ( ( ruleEString ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:2664:1: ( ruleEString )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:2664:1: ( ruleEString )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:2665:1: ruleEString
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUIContainerAccess().getDescriptionEStringParserRuleCall_5_1_0()); 
            }
            pushFollow(FOLLOW_ruleEString_in_rule__UIContainer__DescriptionAssignment_5_15293);
            ruleEString();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getUIContainerAccess().getDescriptionEStringParserRuleCall_5_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UIContainer__DescriptionAssignment_5_1"


    // $ANTLR start "rule__UIContainer__UI_fieldsAssignment_6_0"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:2674:1: rule__UIContainer__UI_fieldsAssignment_6_0 : ( ruleUIField ) ;
    public final void rule__UIContainer__UI_fieldsAssignment_6_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:2678:1: ( ( ruleUIField ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:2679:1: ( ruleUIField )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:2679:1: ( ruleUIField )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:2680:1: ruleUIField
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUIContainerAccess().getUI_fieldsUIFieldParserRuleCall_6_0_0()); 
            }
            pushFollow(FOLLOW_ruleUIField_in_rule__UIContainer__UI_fieldsAssignment_6_05324);
            ruleUIField();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getUIContainerAccess().getUI_fieldsUIFieldParserRuleCall_6_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UIContainer__UI_fieldsAssignment_6_0"


    // $ANTLR start "rule__UIContainer__UI_fieldsAssignment_6_1"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:2689:1: rule__UIContainer__UI_fieldsAssignment_6_1 : ( ruleUIField ) ;
    public final void rule__UIContainer__UI_fieldsAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:2693:1: ( ( ruleUIField ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:2694:1: ( ruleUIField )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:2694:1: ( ruleUIField )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:2695:1: ruleUIField
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUIContainerAccess().getUI_fieldsUIFieldParserRuleCall_6_1_0()); 
            }
            pushFollow(FOLLOW_ruleUIField_in_rule__UIContainer__UI_fieldsAssignment_6_15355);
            ruleUIField();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getUIContainerAccess().getUI_fieldsUIFieldParserRuleCall_6_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UIContainer__UI_fieldsAssignment_6_1"


    // $ANTLR start "rule__UIContainer__SubContainersAssignment_7_0"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:2704:1: rule__UIContainer__SubContainersAssignment_7_0 : ( ruleUIContainer ) ;
    public final void rule__UIContainer__SubContainersAssignment_7_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:2708:1: ( ( ruleUIContainer ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:2709:1: ( ruleUIContainer )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:2709:1: ( ruleUIContainer )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:2710:1: ruleUIContainer
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUIContainerAccess().getSubContainersUIContainerParserRuleCall_7_0_0()); 
            }
            pushFollow(FOLLOW_ruleUIContainer_in_rule__UIContainer__SubContainersAssignment_7_05386);
            ruleUIContainer();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getUIContainerAccess().getSubContainersUIContainerParserRuleCall_7_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UIContainer__SubContainersAssignment_7_0"


    // $ANTLR start "rule__UIContainer__SubContainersAssignment_7_1"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:2719:1: rule__UIContainer__SubContainersAssignment_7_1 : ( ruleUIContainer ) ;
    public final void rule__UIContainer__SubContainersAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:2723:1: ( ( ruleUIContainer ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:2724:1: ( ruleUIContainer )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:2724:1: ( ruleUIContainer )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:2725:1: ruleUIContainer
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUIContainerAccess().getSubContainersUIContainerParserRuleCall_7_1_0()); 
            }
            pushFollow(FOLLOW_ruleUIContainer_in_rule__UIContainer__SubContainersAssignment_7_15417);
            ruleUIContainer();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getUIContainerAccess().getSubContainersUIContainerParserRuleCall_7_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UIContainer__SubContainersAssignment_7_1"


    // $ANTLR start "rule__LocalClass__UI_For_LocalClassAssignment_2"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:2734:1: rule__LocalClass__UI_For_LocalClassAssignment_2 : ( ( ruleFQN ) ) ;
    public final void rule__LocalClass__UI_For_LocalClassAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:2738:1: ( ( ( ruleFQN ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:2739:1: ( ( ruleFQN ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:2739:1: ( ( ruleFQN ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:2740:1: ( ruleFQN )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLocalClassAccess().getUI_For_LocalClassClassCrossReference_2_0()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:2741:1: ( ruleFQN )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:2742:1: ruleFQN
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLocalClassAccess().getUI_For_LocalClassClassFQNParserRuleCall_2_0_1()); 
            }
            pushFollow(FOLLOW_ruleFQN_in_rule__LocalClass__UI_For_LocalClassAssignment_25452);
            ruleFQN();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLocalClassAccess().getUI_For_LocalClassClassFQNParserRuleCall_2_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLocalClassAccess().getUI_For_LocalClassClassCrossReference_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocalClass__UI_For_LocalClassAssignment_2"


    // $ANTLR start "rule__UIField__NameAssignment_2"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:2753:1: rule__UIField__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__UIField__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:2757:1: ( ( ruleEString ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:2758:1: ( ruleEString )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:2758:1: ( ruleEString )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:2759:1: ruleEString
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUIFieldAccess().getNameEStringParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleEString_in_rule__UIField__NameAssignment_25487);
            ruleEString();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getUIFieldAccess().getNameEStringParserRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UIField__NameAssignment_2"


    // $ANTLR start "rule__UIField__LabelAssignment_3_1"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:2768:1: rule__UIField__LabelAssignment_3_1 : ( ruleEString ) ;
    public final void rule__UIField__LabelAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:2772:1: ( ( ruleEString ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:2773:1: ( ruleEString )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:2773:1: ( ruleEString )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:2774:1: ruleEString
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUIFieldAccess().getLabelEStringParserRuleCall_3_1_0()); 
            }
            pushFollow(FOLLOW_ruleEString_in_rule__UIField__LabelAssignment_3_15518);
            ruleEString();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getUIFieldAccess().getLabelEStringParserRuleCall_3_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UIField__LabelAssignment_3_1"


    // $ANTLR start "rule__UIField__DescriptionAssignment_4_1"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:2783:1: rule__UIField__DescriptionAssignment_4_1 : ( ruleEString ) ;
    public final void rule__UIField__DescriptionAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:2787:1: ( ( ruleEString ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:2788:1: ( ruleEString )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:2788:1: ( ruleEString )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:2789:1: ruleEString
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUIFieldAccess().getDescriptionEStringParserRuleCall_4_1_0()); 
            }
            pushFollow(FOLLOW_ruleEString_in_rule__UIField__DescriptionAssignment_4_15549);
            ruleEString();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getUIFieldAccess().getDescriptionEStringParserRuleCall_4_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UIField__DescriptionAssignment_4_1"


    // $ANTLR start "rule__UIField__TypeAssignment_5_1"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:2798:1: rule__UIField__TypeAssignment_5_1 : ( ruleUI_Field_Type ) ;
    public final void rule__UIField__TypeAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:2802:1: ( ( ruleUI_Field_Type ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:2803:1: ( ruleUI_Field_Type )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:2803:1: ( ruleUI_Field_Type )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:2804:1: ruleUI_Field_Type
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUIFieldAccess().getTypeUI_Field_TypeEnumRuleCall_5_1_0()); 
            }
            pushFollow(FOLLOW_ruleUI_Field_Type_in_rule__UIField__TypeAssignment_5_15580);
            ruleUI_Field_Type();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getUIFieldAccess().getTypeUI_Field_TypeEnumRuleCall_5_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UIField__TypeAssignment_5_1"


    // $ANTLR start "rule__UIField__MappingAssignment_7"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:2813:1: rule__UIField__MappingAssignment_7 : ( ruleFieldMapping ) ;
    public final void rule__UIField__MappingAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:2817:1: ( ( ruleFieldMapping ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:2818:1: ( ruleFieldMapping )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:2818:1: ( ruleFieldMapping )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:2819:1: ruleFieldMapping
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUIFieldAccess().getMappingFieldMappingParserRuleCall_7_0()); 
            }
            pushFollow(FOLLOW_ruleFieldMapping_in_rule__UIField__MappingAssignment_75611);
            ruleFieldMapping();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getUIFieldAccess().getMappingFieldMappingParserRuleCall_7_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UIField__MappingAssignment_7"


    // $ANTLR start "rule__FieldMapping__UI_Field_Mapped_ToAssignment_2"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:2828:1: rule__FieldMapping__UI_Field_Mapped_ToAssignment_2 : ( ( ruleFQN ) ) ;
    public final void rule__FieldMapping__UI_Field_Mapped_ToAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:2832:1: ( ( ( ruleFQN ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:2833:1: ( ( ruleFQN ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:2833:1: ( ( ruleFQN ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:2834:1: ( ruleFQN )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldMappingAccess().getUI_Field_Mapped_ToAbstractFeatureCrossReference_2_0()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:2835:1: ( ruleFQN )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:2836:1: ruleFQN
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldMappingAccess().getUI_Field_Mapped_ToAbstractFeatureFQNParserRuleCall_2_0_1()); 
            }
            pushFollow(FOLLOW_ruleFQN_in_rule__FieldMapping__UI_Field_Mapped_ToAssignment_25646);
            ruleFQN();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFieldMappingAccess().getUI_Field_Mapped_ToAbstractFeatureFQNParserRuleCall_2_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFieldMappingAccess().getUI_Field_Mapped_ToAbstractFeatureCrossReference_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldMapping__UI_Field_Mapped_ToAssignment_2"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleUserInterface_in_entryRuleUserInterface67 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUserInterface74 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UserInterface__Group__0_in_ruleUserInterface100 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_entryRuleImport127 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImport134 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import__Group__0_in_ruleImport160 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAspect_in_entryRuleAspect187 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAspect194 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUIDescription_in_ruleAspect220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUIDescription_in_entryRuleUIDescription246 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUIDescription253 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UIDescription__Group__0_in_ruleUIDescription279 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUI_in_entryRuleUI308 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUI315 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UI__Group__0_in_ruleUI341 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUIContainer_in_entryRuleUIContainer368 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUIContainer375 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UIContainer__Group__0_in_ruleUIContainer401 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDataSource_in_entryRuleDataSource428 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDataSource435 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLocalClass_in_ruleDataSource461 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLocalClass_in_entryRuleLocalClass487 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLocalClass494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LocalClass__Group__0_in_ruleLocalClass520 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUIField_in_entryRuleUIField547 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUIField554 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UIField__Group__0_in_ruleUIField580 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFieldMapping_in_entryRuleFieldMapping607 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFieldMapping614 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FieldMapping__Group__0_in_ruleFieldMapping640 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEString_in_entryRuleEString667 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEString674 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EString__Alternatives_in_ruleEString700 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFQN_in_entryRuleFQN727 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFQN734 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FQN__Group__0_in_ruleFQN760 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UI_Field_Type__Alternatives_in_ruleUI_Field_Type801 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__EString__Alternatives837 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__EString__Alternatives854 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__UI_Field_Type__Alternatives888 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__UI_Field_Type__Alternatives909 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__UI_Field_Type__Alternatives930 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__UI_Field_Type__Alternatives951 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__UI_Field_Type__Alternatives972 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__UI_Field_Type__Alternatives993 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UserInterface__Group__0__Impl_in_rule__UserInterface__Group__01026 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_rule__UserInterface__Group__1_in_rule__UserInterface__Group__01029 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UserInterface__Group__1__Impl_in_rule__UserInterface__Group__11087 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_rule__UserInterface__Group__2_in_rule__UserInterface__Group__11090 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UserInterface__ImportsAssignment_1_in_rule__UserInterface__Group__1__Impl1117 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_rule__UserInterface__Group__2__Impl_in_rule__UserInterface__Group__21148 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UserInterface__UiDescriptionAssignment_2_in_rule__UserInterface__Group__2__Impl1175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import__Group__0__Impl_in_rule__Import__Group__01211 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Import__Group__1_in_rule__Import__Group__01214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Import__Group__0__Impl1242 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import__Group__1__Impl_in_rule__Import__Group__11273 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import__ImportedNamespaceAssignment_1_in_rule__Import__Group__1__Impl1300 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UIDescription__Group__0__Impl_in_rule__UIDescription__Group__01334 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_rule__UIDescription__Group__1_in_rule__UIDescription__Group__01337 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UIDescription__Group__1__Impl_in_rule__UIDescription__Group__11395 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__UIDescription__Group__2_in_rule__UIDescription__Group__11398 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__UIDescription__Group__1__Impl1426 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UIDescription__Group__2__Impl_in_rule__UIDescription__Group__21457 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__UIDescription__Group__3_in_rule__UIDescription__Group__21460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UIDescription__NameAssignment_2_in_rule__UIDescription__Group__2__Impl1487 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UIDescription__Group__3__Impl_in_rule__UIDescription__Group__31517 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_rule__UIDescription__Group__4_in_rule__UIDescription__Group__31520 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__UIDescription__Group__3__Impl1548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UIDescription__Group__4__Impl_in_rule__UIDescription__Group__41579 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_rule__UIDescription__Group__5_in_rule__UIDescription__Group__41582 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UIDescription__UIsAssignment_4_in_rule__UIDescription__Group__4__Impl1609 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_rule__UIDescription__Group__5__Impl_in_rule__UIDescription__Group__51640 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__UIDescription__Group__5__Impl1668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UI__Group__0__Impl_in_rule__UI__Group__01711 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__UI__Group__1_in_rule__UI__Group__01714 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UI__Group__1__Impl_in_rule__UI__Group__11772 = new BitSet(new long[]{0x0000000002080030L});
    public static final BitSet FOLLOW_rule__UI__Group__2_in_rule__UI__Group__11775 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__UI__Group__1__Impl1803 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UI__Group__2__Impl_in_rule__UI__Group__21834 = new BitSet(new long[]{0x0000000002080030L});
    public static final BitSet FOLLOW_rule__UI__Group__3_in_rule__UI__Group__21837 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UI__NameAssignment_2_in_rule__UI__Group__2__Impl1864 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UI__Group__3__Impl_in_rule__UI__Group__31895 = new BitSet(new long[]{0x0000000002080030L});
    public static final BitSet FOLLOW_rule__UI__Group__4_in_rule__UI__Group__31898 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UI__UI_DataSourceAssignment_3_in_rule__UI__Group__3__Impl1925 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UI__Group__4__Impl_in_rule__UI__Group__41956 = new BitSet(new long[]{0x0000000000D00000L});
    public static final BitSet FOLLOW_rule__UI__Group__5_in_rule__UI__Group__41959 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__UI__Group__4__Impl1987 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UI__Group__5__Impl_in_rule__UI__Group__52018 = new BitSet(new long[]{0x0000000000D00000L});
    public static final BitSet FOLLOW_rule__UI__Group__6_in_rule__UI__Group__52021 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UI__Group_5__0_in_rule__UI__Group__5__Impl2048 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UI__Group__6__Impl_in_rule__UI__Group__62079 = new BitSet(new long[]{0x0000000000D00000L});
    public static final BitSet FOLLOW_rule__UI__Group__7_in_rule__UI__Group__62082 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UI__UI_ContainersAssignment_6_in_rule__UI__Group__6__Impl2109 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_rule__UI__Group__7__Impl_in_rule__UI__Group__72140 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__UI__Group__7__Impl2168 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UI__Group_5__0__Impl_in_rule__UI__Group_5__02215 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_rule__UI__Group_5__1_in_rule__UI__Group_5__02218 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__UI__Group_5__0__Impl2246 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UI__Group_5__1__Impl_in_rule__UI__Group_5__12277 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UI__LabelAssignment_5_1_in_rule__UI__Group_5__1__Impl2304 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UIContainer__Group__0__Impl_in_rule__UIContainer__Group__02338 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__UIContainer__Group__1_in_rule__UIContainer__Group__02341 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UIContainer__Group__1__Impl_in_rule__UIContainer__Group__12399 = new BitSet(new long[]{0x0000000000080030L});
    public static final BitSet FOLLOW_rule__UIContainer__Group__2_in_rule__UIContainer__Group__12402 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__UIContainer__Group__1__Impl2430 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UIContainer__Group__2__Impl_in_rule__UIContainer__Group__22461 = new BitSet(new long[]{0x0000000000080030L});
    public static final BitSet FOLLOW_rule__UIContainer__Group__3_in_rule__UIContainer__Group__22464 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UIContainer__NameAssignment_2_in_rule__UIContainer__Group__2__Impl2491 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UIContainer__Group__3__Impl_in_rule__UIContainer__Group__32522 = new BitSet(new long[]{0x0000000005D00000L});
    public static final BitSet FOLLOW_rule__UIContainer__Group__4_in_rule__UIContainer__Group__32525 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__UIContainer__Group__3__Impl2553 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UIContainer__Group__4__Impl_in_rule__UIContainer__Group__42584 = new BitSet(new long[]{0x0000000005D00000L});
    public static final BitSet FOLLOW_rule__UIContainer__Group__5_in_rule__UIContainer__Group__42587 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UIContainer__Group_4__0_in_rule__UIContainer__Group__4__Impl2614 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UIContainer__Group__5__Impl_in_rule__UIContainer__Group__52645 = new BitSet(new long[]{0x0000000005D00000L});
    public static final BitSet FOLLOW_rule__UIContainer__Group__6_in_rule__UIContainer__Group__52648 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UIContainer__Group_5__0_in_rule__UIContainer__Group__5__Impl2675 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UIContainer__Group__6__Impl_in_rule__UIContainer__Group__62706 = new BitSet(new long[]{0x0000000005D00000L});
    public static final BitSet FOLLOW_rule__UIContainer__Group__7_in_rule__UIContainer__Group__62709 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UIContainer__Group_6__0_in_rule__UIContainer__Group__6__Impl2736 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UIContainer__Group__7__Impl_in_rule__UIContainer__Group__72767 = new BitSet(new long[]{0x0000000005D00000L});
    public static final BitSet FOLLOW_rule__UIContainer__Group__8_in_rule__UIContainer__Group__72770 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UIContainer__Group_7__0_in_rule__UIContainer__Group__7__Impl2797 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UIContainer__Group__8__Impl_in_rule__UIContainer__Group__82828 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__UIContainer__Group__8__Impl2856 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UIContainer__Group_4__0__Impl_in_rule__UIContainer__Group_4__02905 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_rule__UIContainer__Group_4__1_in_rule__UIContainer__Group_4__02908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__UIContainer__Group_4__0__Impl2936 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UIContainer__Group_4__1__Impl_in_rule__UIContainer__Group_4__12967 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UIContainer__LabelAssignment_4_1_in_rule__UIContainer__Group_4__1__Impl2994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UIContainer__Group_5__0__Impl_in_rule__UIContainer__Group_5__03028 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_rule__UIContainer__Group_5__1_in_rule__UIContainer__Group_5__03031 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__UIContainer__Group_5__0__Impl3059 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UIContainer__Group_5__1__Impl_in_rule__UIContainer__Group_5__13090 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UIContainer__DescriptionAssignment_5_1_in_rule__UIContainer__Group_5__1__Impl3117 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UIContainer__Group_6__0__Impl_in_rule__UIContainer__Group_6__03151 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__UIContainer__Group_6__1_in_rule__UIContainer__Group_6__03154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UIContainer__UI_fieldsAssignment_6_0_in_rule__UIContainer__Group_6__0__Impl3181 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UIContainer__Group_6__1__Impl_in_rule__UIContainer__Group_6__13211 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UIContainer__UI_fieldsAssignment_6_1_in_rule__UIContainer__Group_6__1__Impl3238 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_rule__UIContainer__Group_7__0__Impl_in_rule__UIContainer__Group_7__03273 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__UIContainer__Group_7__1_in_rule__UIContainer__Group_7__03276 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UIContainer__SubContainersAssignment_7_0_in_rule__UIContainer__Group_7__0__Impl3303 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UIContainer__Group_7__1__Impl_in_rule__UIContainer__Group_7__13333 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UIContainer__SubContainersAssignment_7_1_in_rule__UIContainer__Group_7__1__Impl3360 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_rule__LocalClass__Group__0__Impl_in_rule__LocalClass__Group__03395 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__LocalClass__Group__1_in_rule__LocalClass__Group__03398 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LocalClass__Group__1__Impl_in_rule__LocalClass__Group__13456 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__LocalClass__Group__2_in_rule__LocalClass__Group__13459 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__LocalClass__Group__1__Impl3487 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LocalClass__Group__2__Impl_in_rule__LocalClass__Group__23518 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LocalClass__UI_For_LocalClassAssignment_2_in_rule__LocalClass__Group__2__Impl3545 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UIField__Group__0__Impl_in_rule__UIField__Group__03581 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__UIField__Group__1_in_rule__UIField__Group__03584 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UIField__Group__1__Impl_in_rule__UIField__Group__13642 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_rule__UIField__Group__2_in_rule__UIField__Group__13645 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__UIField__Group__1__Impl3673 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UIField__Group__2__Impl_in_rule__UIField__Group__23704 = new BitSet(new long[]{0x0000000019400000L});
    public static final BitSet FOLLOW_rule__UIField__Group__3_in_rule__UIField__Group__23707 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UIField__NameAssignment_2_in_rule__UIField__Group__2__Impl3734 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UIField__Group__3__Impl_in_rule__UIField__Group__33764 = new BitSet(new long[]{0x0000000019400000L});
    public static final BitSet FOLLOW_rule__UIField__Group__4_in_rule__UIField__Group__33767 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UIField__Group_3__0_in_rule__UIField__Group__3__Impl3794 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UIField__Group__4__Impl_in_rule__UIField__Group__43825 = new BitSet(new long[]{0x0000000019400000L});
    public static final BitSet FOLLOW_rule__UIField__Group__5_in_rule__UIField__Group__43828 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UIField__Group_4__0_in_rule__UIField__Group__4__Impl3855 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UIField__Group__5__Impl_in_rule__UIField__Group__53886 = new BitSet(new long[]{0x0000000019400000L});
    public static final BitSet FOLLOW_rule__UIField__Group__6_in_rule__UIField__Group__53889 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UIField__Group_5__0_in_rule__UIField__Group__5__Impl3916 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UIField__Group__6__Impl_in_rule__UIField__Group__63947 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rule__UIField__Group__7_in_rule__UIField__Group__63950 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__UIField__Group__6__Impl3978 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UIField__Group__7__Impl_in_rule__UIField__Group__74009 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UIField__MappingAssignment_7_in_rule__UIField__Group__7__Impl4036 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UIField__Group_3__0__Impl_in_rule__UIField__Group_3__04082 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_rule__UIField__Group_3__1_in_rule__UIField__Group_3__04085 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__UIField__Group_3__0__Impl4113 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UIField__Group_3__1__Impl_in_rule__UIField__Group_3__14144 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UIField__LabelAssignment_3_1_in_rule__UIField__Group_3__1__Impl4171 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UIField__Group_4__0__Impl_in_rule__UIField__Group_4__04205 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_rule__UIField__Group_4__1_in_rule__UIField__Group_4__04208 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__UIField__Group_4__0__Impl4236 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UIField__Group_4__1__Impl_in_rule__UIField__Group_4__14267 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__UIField__Group_4__2_in_rule__UIField__Group_4__14270 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UIField__DescriptionAssignment_4_1_in_rule__UIField__Group_4__1__Impl4297 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UIField__Group_4__2__Impl_in_rule__UIField__Group_4__24327 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__UIField__Group_4__2__Impl4355 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UIField__Group_5__0__Impl_in_rule__UIField__Group_5__04392 = new BitSet(new long[]{0x000000000001F800L});
    public static final BitSet FOLLOW_rule__UIField__Group_5__1_in_rule__UIField__Group_5__04395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__UIField__Group_5__0__Impl4423 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UIField__Group_5__1__Impl_in_rule__UIField__Group_5__14454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UIField__TypeAssignment_5_1_in_rule__UIField__Group_5__1__Impl4481 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FieldMapping__Group__0__Impl_in_rule__FieldMapping__Group__04515 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rule__FieldMapping__Group__1_in_rule__FieldMapping__Group__04518 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FieldMapping__Group__1__Impl_in_rule__FieldMapping__Group__14576 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__FieldMapping__Group__2_in_rule__FieldMapping__Group__14579 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__FieldMapping__Group__1__Impl4607 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FieldMapping__Group__2__Impl_in_rule__FieldMapping__Group__24638 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FieldMapping__UI_Field_Mapped_ToAssignment_2_in_rule__FieldMapping__Group__2__Impl4665 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FQN__Group__0__Impl_in_rule__FQN__Group__04702 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__FQN__Group__1_in_rule__FQN__Group__04705 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__FQN__Group__0__Impl4732 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FQN__Group__1__Impl_in_rule__FQN__Group__14761 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FQN__Group_1__0_in_rule__FQN__Group__1__Impl4788 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_rule__FQN__Group_1__0__Impl_in_rule__FQN__Group_1__04823 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__FQN__Group_1__1_in_rule__FQN__Group_1__04826 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__FQN__Group_1__0__Impl4854 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FQN__Group_1__1__Impl_in_rule__FQN__Group_1__14885 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__FQN__Group_1__1__Impl4913 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_rule__UserInterface__ImportsAssignment_14952 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAspect_in_rule__UserInterface__UiDescriptionAssignment_24983 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFQN_in_rule__Import__ImportedNamespaceAssignment_15014 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFQN_in_rule__UIDescription__NameAssignment_25045 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUI_in_rule__UIDescription__UIsAssignment_45076 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEString_in_rule__UI__NameAssignment_25107 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDataSource_in_rule__UI__UI_DataSourceAssignment_35138 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEString_in_rule__UI__LabelAssignment_5_15169 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUIContainer_in_rule__UI__UI_ContainersAssignment_65200 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEString_in_rule__UIContainer__NameAssignment_25231 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEString_in_rule__UIContainer__LabelAssignment_4_15262 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEString_in_rule__UIContainer__DescriptionAssignment_5_15293 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUIField_in_rule__UIContainer__UI_fieldsAssignment_6_05324 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUIField_in_rule__UIContainer__UI_fieldsAssignment_6_15355 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUIContainer_in_rule__UIContainer__SubContainersAssignment_7_05386 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUIContainer_in_rule__UIContainer__SubContainersAssignment_7_15417 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFQN_in_rule__LocalClass__UI_For_LocalClassAssignment_25452 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEString_in_rule__UIField__NameAssignment_25487 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEString_in_rule__UIField__LabelAssignment_3_15518 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEString_in_rule__UIField__DescriptionAssignment_4_15549 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUI_Field_Type_in_rule__UIField__TypeAssignment_5_15580 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFieldMapping_in_rule__UIField__MappingAssignment_75611 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFQN_in_rule__FieldMapping__UI_Field_Mapped_ToAssignment_25646 = new BitSet(new long[]{0x0000000000000002L});

}

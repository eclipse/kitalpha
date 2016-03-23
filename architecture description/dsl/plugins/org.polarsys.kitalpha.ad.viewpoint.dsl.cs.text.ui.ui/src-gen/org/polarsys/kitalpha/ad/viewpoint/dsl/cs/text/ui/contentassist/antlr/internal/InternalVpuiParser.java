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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:68:1: entryRuleUserInterface : ruleUserInterface EOF ;
    public final void entryRuleUserInterface() throws RecognitionException {
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:69:1: ( ruleUserInterface EOF )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:70:1: ruleUserInterface EOF
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:77:1: ruleUserInterface : ( ( rule__UserInterface__Group__0 ) ) ;
    public final void ruleUserInterface() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:81:2: ( ( ( rule__UserInterface__Group__0 ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:82:1: ( ( rule__UserInterface__Group__0 ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:82:1: ( ( rule__UserInterface__Group__0 ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:83:1: ( rule__UserInterface__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUserInterfaceAccess().getGroup()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:84:1: ( rule__UserInterface__Group__0 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:84:2: rule__UserInterface__Group__0
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:96:1: entryRuleImport : ruleImport EOF ;
    public final void entryRuleImport() throws RecognitionException {
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:97:1: ( ruleImport EOF )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:98:1: ruleImport EOF
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:105:1: ruleImport : ( ( rule__Import__Group__0 ) ) ;
    public final void ruleImport() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:109:2: ( ( ( rule__Import__Group__0 ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:110:1: ( ( rule__Import__Group__0 ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:110:1: ( ( rule__Import__Group__0 ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:111:1: ( rule__Import__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImportAccess().getGroup()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:112:1: ( rule__Import__Group__0 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:112:2: rule__Import__Group__0
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:124:1: entryRuleAspect : ruleAspect EOF ;
    public final void entryRuleAspect() throws RecognitionException {
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:125:1: ( ruleAspect EOF )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:126:1: ruleAspect EOF
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:133:1: ruleAspect : ( ruleUIDescription ) ;
    public final void ruleAspect() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:137:2: ( ( ruleUIDescription ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:138:1: ( ruleUIDescription )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:138:1: ( ruleUIDescription )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:139:1: ruleUIDescription
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:152:1: entryRuleUIDescription : ruleUIDescription EOF ;
    public final void entryRuleUIDescription() throws RecognitionException {
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:153:1: ( ruleUIDescription EOF )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:154:1: ruleUIDescription EOF
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:161:1: ruleUIDescription : ( ( rule__UIDescription__Group__0 ) ) ;
    public final void ruleUIDescription() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:165:2: ( ( ( rule__UIDescription__Group__0 ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:166:1: ( ( rule__UIDescription__Group__0 ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:166:1: ( ( rule__UIDescription__Group__0 ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:167:1: ( rule__UIDescription__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUIDescriptionAccess().getGroup()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:168:1: ( rule__UIDescription__Group__0 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:168:2: rule__UIDescription__Group__0
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:182:1: entryRuleUI : ruleUI EOF ;
    public final void entryRuleUI() throws RecognitionException {
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:183:1: ( ruleUI EOF )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:184:1: ruleUI EOF
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:191:1: ruleUI : ( ( rule__UI__Group__0 ) ) ;
    public final void ruleUI() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:195:2: ( ( ( rule__UI__Group__0 ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:196:1: ( ( rule__UI__Group__0 ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:196:1: ( ( rule__UI__Group__0 ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:197:1: ( rule__UI__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUIAccess().getGroup()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:198:1: ( rule__UI__Group__0 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:198:2: rule__UI__Group__0
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:210:1: entryRuleUIContainer : ruleUIContainer EOF ;
    public final void entryRuleUIContainer() throws RecognitionException {
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:211:1: ( ruleUIContainer EOF )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:212:1: ruleUIContainer EOF
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:219:1: ruleUIContainer : ( ( rule__UIContainer__Group__0 ) ) ;
    public final void ruleUIContainer() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:223:2: ( ( ( rule__UIContainer__Group__0 ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:224:1: ( ( rule__UIContainer__Group__0 ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:224:1: ( ( rule__UIContainer__Group__0 ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:225:1: ( rule__UIContainer__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUIContainerAccess().getGroup()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:226:1: ( rule__UIContainer__Group__0 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:226:2: rule__UIContainer__Group__0
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:238:1: entryRuleDataSource : ruleDataSource EOF ;
    public final void entryRuleDataSource() throws RecognitionException {
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:239:1: ( ruleDataSource EOF )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:240:1: ruleDataSource EOF
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:247:1: ruleDataSource : ( ruleLocalClass ) ;
    public final void ruleDataSource() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:251:2: ( ( ruleLocalClass ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:252:1: ( ruleLocalClass )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:252:1: ( ruleLocalClass )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:253:1: ruleLocalClass
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:266:1: entryRuleLocalClass : ruleLocalClass EOF ;
    public final void entryRuleLocalClass() throws RecognitionException {
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:267:1: ( ruleLocalClass EOF )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:268:1: ruleLocalClass EOF
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:275:1: ruleLocalClass : ( ( rule__LocalClass__Group__0 ) ) ;
    public final void ruleLocalClass() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:279:2: ( ( ( rule__LocalClass__Group__0 ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:280:1: ( ( rule__LocalClass__Group__0 ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:280:1: ( ( rule__LocalClass__Group__0 ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:281:1: ( rule__LocalClass__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLocalClassAccess().getGroup()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:282:1: ( rule__LocalClass__Group__0 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:282:2: rule__LocalClass__Group__0
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:294:1: entryRuleUIField : ruleUIField EOF ;
    public final void entryRuleUIField() throws RecognitionException {
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:295:1: ( ruleUIField EOF )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:296:1: ruleUIField EOF
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:303:1: ruleUIField : ( ( rule__UIField__Group__0 ) ) ;
    public final void ruleUIField() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:307:2: ( ( ( rule__UIField__Group__0 ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:308:1: ( ( rule__UIField__Group__0 ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:308:1: ( ( rule__UIField__Group__0 ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:309:1: ( rule__UIField__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUIFieldAccess().getGroup()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:310:1: ( rule__UIField__Group__0 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:310:2: rule__UIField__Group__0
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:322:1: entryRuleFieldMapping : ruleFieldMapping EOF ;
    public final void entryRuleFieldMapping() throws RecognitionException {
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:323:1: ( ruleFieldMapping EOF )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:324:1: ruleFieldMapping EOF
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:331:1: ruleFieldMapping : ( ( rule__FieldMapping__Group__0 ) ) ;
    public final void ruleFieldMapping() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:335:2: ( ( ( rule__FieldMapping__Group__0 ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:336:1: ( ( rule__FieldMapping__Group__0 ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:336:1: ( ( rule__FieldMapping__Group__0 ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:337:1: ( rule__FieldMapping__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldMappingAccess().getGroup()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:338:1: ( rule__FieldMapping__Group__0 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:338:2: rule__FieldMapping__Group__0
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:350:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:351:1: ( ruleEString EOF )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:352:1: ruleEString EOF
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:359:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:363:2: ( ( ( rule__EString__Alternatives ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:364:1: ( ( rule__EString__Alternatives ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:364:1: ( ( rule__EString__Alternatives ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:365:1: ( rule__EString__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEStringAccess().getAlternatives()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:366:1: ( rule__EString__Alternatives )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:366:2: rule__EString__Alternatives
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:378:1: entryRuleFQN : ruleFQN EOF ;
    public final void entryRuleFQN() throws RecognitionException {
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:379:1: ( ruleFQN EOF )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:380:1: ruleFQN EOF
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:387:1: ruleFQN : ( ( rule__FQN__Group__0 ) ) ;
    public final void ruleFQN() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:391:2: ( ( ( rule__FQN__Group__0 ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:392:1: ( ( rule__FQN__Group__0 ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:392:1: ( ( rule__FQN__Group__0 ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:393:1: ( rule__FQN__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFQNAccess().getGroup()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:394:1: ( rule__FQN__Group__0 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:394:2: rule__FQN__Group__0
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:411:1: ruleUI_Field_Type : ( ( rule__UI_Field_Type__Alternatives ) ) ;
    public final void ruleUI_Field_Type() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:415:1: ( ( ( rule__UI_Field_Type__Alternatives ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:416:1: ( ( rule__UI_Field_Type__Alternatives ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:416:1: ( ( rule__UI_Field_Type__Alternatives ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:417:1: ( rule__UI_Field_Type__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUI_Field_TypeAccess().getAlternatives()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:418:1: ( rule__UI_Field_Type__Alternatives )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:418:2: rule__UI_Field_Type__Alternatives
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:430:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:434:1: ( ( RULE_STRING ) | ( RULE_ID ) )
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
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:435:1: ( RULE_STRING )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:435:1: ( RULE_STRING )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:436:1: RULE_STRING
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
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:441:6: ( RULE_ID )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:441:6: ( RULE_ID )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:442:1: RULE_ID
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:453:1: rule__UI_Field_Type__Alternatives : ( ( ( 'text' ) ) | ( ( 'textarea' ) ) | ( ( 'checkbox' ) ) | ( ( 'radiobox' ) ) | ( ( 'simpleChoiceList' ) ) | ( ( 'multipleChoiceList' ) ) );
    public final void rule__UI_Field_Type__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:457:1: ( ( ( 'text' ) ) | ( ( 'textarea' ) ) | ( ( 'checkbox' ) ) | ( ( 'radiobox' ) ) | ( ( 'simpleChoiceList' ) ) | ( ( 'multipleChoiceList' ) ) )
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
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:458:1: ( ( 'text' ) )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:458:1: ( ( 'text' ) )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:459:1: ( 'text' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getUI_Field_TypeAccess().getTextEnumLiteralDeclaration_0()); 
                    }
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:460:1: ( 'text' )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:460:3: 'text'
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
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:465:6: ( ( 'textarea' ) )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:465:6: ( ( 'textarea' ) )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:466:1: ( 'textarea' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getUI_Field_TypeAccess().getTextareaEnumLiteralDeclaration_1()); 
                    }
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:467:1: ( 'textarea' )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:467:3: 'textarea'
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
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:472:6: ( ( 'checkbox' ) )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:472:6: ( ( 'checkbox' ) )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:473:1: ( 'checkbox' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getUI_Field_TypeAccess().getCheckboxEnumLiteralDeclaration_2()); 
                    }
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:474:1: ( 'checkbox' )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:474:3: 'checkbox'
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
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:479:6: ( ( 'radiobox' ) )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:479:6: ( ( 'radiobox' ) )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:480:1: ( 'radiobox' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getUI_Field_TypeAccess().getRadioboxEnumLiteralDeclaration_3()); 
                    }
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:481:1: ( 'radiobox' )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:481:3: 'radiobox'
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
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:486:6: ( ( 'simpleChoiceList' ) )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:486:6: ( ( 'simpleChoiceList' ) )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:487:1: ( 'simpleChoiceList' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getUI_Field_TypeAccess().getSimpleChoiceListEnumLiteralDeclaration_4()); 
                    }
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:488:1: ( 'simpleChoiceList' )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:488:3: 'simpleChoiceList'
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
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:493:6: ( ( 'multipleChoiceList' ) )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:493:6: ( ( 'multipleChoiceList' ) )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:494:1: ( 'multipleChoiceList' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getUI_Field_TypeAccess().getMultipleChoiceListEnumLiteralDeclaration_5()); 
                    }
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:495:1: ( 'multipleChoiceList' )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:495:3: 'multipleChoiceList'
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:507:1: rule__UserInterface__Group__0 : rule__UserInterface__Group__0__Impl rule__UserInterface__Group__1 ;
    public final void rule__UserInterface__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:511:1: ( rule__UserInterface__Group__0__Impl rule__UserInterface__Group__1 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:512:2: rule__UserInterface__Group__0__Impl rule__UserInterface__Group__1
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:519:1: rule__UserInterface__Group__0__Impl : ( () ) ;
    public final void rule__UserInterface__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:523:1: ( ( () ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:524:1: ( () )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:524:1: ( () )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:525:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUserInterfaceAccess().getUserInterfaceAction_0()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:526:1: ()
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:528:1: 
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:538:1: rule__UserInterface__Group__1 : rule__UserInterface__Group__1__Impl rule__UserInterface__Group__2 ;
    public final void rule__UserInterface__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:542:1: ( rule__UserInterface__Group__1__Impl rule__UserInterface__Group__2 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:543:2: rule__UserInterface__Group__1__Impl rule__UserInterface__Group__2
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:550:1: rule__UserInterface__Group__1__Impl : ( ( rule__UserInterface__ImportsAssignment_1 )* ) ;
    public final void rule__UserInterface__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:554:1: ( ( ( rule__UserInterface__ImportsAssignment_1 )* ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:555:1: ( ( rule__UserInterface__ImportsAssignment_1 )* )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:555:1: ( ( rule__UserInterface__ImportsAssignment_1 )* )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:556:1: ( rule__UserInterface__ImportsAssignment_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUserInterfaceAccess().getImportsAssignment_1()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:557:1: ( rule__UserInterface__ImportsAssignment_1 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==17) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:557:2: rule__UserInterface__ImportsAssignment_1
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:567:1: rule__UserInterface__Group__2 : rule__UserInterface__Group__2__Impl ;
    public final void rule__UserInterface__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:571:1: ( rule__UserInterface__Group__2__Impl )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:572:2: rule__UserInterface__Group__2__Impl
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:578:1: rule__UserInterface__Group__2__Impl : ( ( rule__UserInterface__UiDescriptionAssignment_2 ) ) ;
    public final void rule__UserInterface__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:582:1: ( ( ( rule__UserInterface__UiDescriptionAssignment_2 ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:583:1: ( ( rule__UserInterface__UiDescriptionAssignment_2 ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:583:1: ( ( rule__UserInterface__UiDescriptionAssignment_2 ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:584:1: ( rule__UserInterface__UiDescriptionAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUserInterfaceAccess().getUiDescriptionAssignment_2()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:585:1: ( rule__UserInterface__UiDescriptionAssignment_2 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:585:2: rule__UserInterface__UiDescriptionAssignment_2
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:601:1: rule__Import__Group__0 : rule__Import__Group__0__Impl rule__Import__Group__1 ;
    public final void rule__Import__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:605:1: ( rule__Import__Group__0__Impl rule__Import__Group__1 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:606:2: rule__Import__Group__0__Impl rule__Import__Group__1
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:613:1: rule__Import__Group__0__Impl : ( 'import' ) ;
    public final void rule__Import__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:617:1: ( ( 'import' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:618:1: ( 'import' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:618:1: ( 'import' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:619:1: 'import'
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:632:1: rule__Import__Group__1 : rule__Import__Group__1__Impl ;
    public final void rule__Import__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:636:1: ( rule__Import__Group__1__Impl )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:637:2: rule__Import__Group__1__Impl
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:643:1: rule__Import__Group__1__Impl : ( ( rule__Import__ImportedNamespaceAssignment_1 ) ) ;
    public final void rule__Import__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:647:1: ( ( ( rule__Import__ImportedNamespaceAssignment_1 ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:648:1: ( ( rule__Import__ImportedNamespaceAssignment_1 ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:648:1: ( ( rule__Import__ImportedNamespaceAssignment_1 ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:649:1: ( rule__Import__ImportedNamespaceAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImportAccess().getImportedNamespaceAssignment_1()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:650:1: ( rule__Import__ImportedNamespaceAssignment_1 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:650:2: rule__Import__ImportedNamespaceAssignment_1
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:664:1: rule__UIDescription__Group__0 : rule__UIDescription__Group__0__Impl rule__UIDescription__Group__1 ;
    public final void rule__UIDescription__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:668:1: ( rule__UIDescription__Group__0__Impl rule__UIDescription__Group__1 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:669:2: rule__UIDescription__Group__0__Impl rule__UIDescription__Group__1
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:676:1: rule__UIDescription__Group__0__Impl : ( () ) ;
    public final void rule__UIDescription__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:680:1: ( ( () ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:681:1: ( () )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:681:1: ( () )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:682:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUIDescriptionAccess().getUIDescriptionAction_0()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:683:1: ()
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:685:1: 
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:695:1: rule__UIDescription__Group__1 : rule__UIDescription__Group__1__Impl rule__UIDescription__Group__2 ;
    public final void rule__UIDescription__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:699:1: ( rule__UIDescription__Group__1__Impl rule__UIDescription__Group__2 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:700:2: rule__UIDescription__Group__1__Impl rule__UIDescription__Group__2
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:707:1: rule__UIDescription__Group__1__Impl : ( 'UIDescription' ) ;
    public final void rule__UIDescription__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:711:1: ( ( 'UIDescription' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:712:1: ( 'UIDescription' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:712:1: ( 'UIDescription' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:713:1: 'UIDescription'
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:726:1: rule__UIDescription__Group__2 : rule__UIDescription__Group__2__Impl rule__UIDescription__Group__3 ;
    public final void rule__UIDescription__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:730:1: ( rule__UIDescription__Group__2__Impl rule__UIDescription__Group__3 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:731:2: rule__UIDescription__Group__2__Impl rule__UIDescription__Group__3
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:738:1: rule__UIDescription__Group__2__Impl : ( ( rule__UIDescription__NameAssignment_2 ) ) ;
    public final void rule__UIDescription__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:742:1: ( ( ( rule__UIDescription__NameAssignment_2 ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:743:1: ( ( rule__UIDescription__NameAssignment_2 ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:743:1: ( ( rule__UIDescription__NameAssignment_2 ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:744:1: ( rule__UIDescription__NameAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUIDescriptionAccess().getNameAssignment_2()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:745:1: ( rule__UIDescription__NameAssignment_2 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:745:2: rule__UIDescription__NameAssignment_2
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:755:1: rule__UIDescription__Group__3 : rule__UIDescription__Group__3__Impl rule__UIDescription__Group__4 ;
    public final void rule__UIDescription__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:759:1: ( rule__UIDescription__Group__3__Impl rule__UIDescription__Group__4 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:760:2: rule__UIDescription__Group__3__Impl rule__UIDescription__Group__4
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:767:1: rule__UIDescription__Group__3__Impl : ( '{' ) ;
    public final void rule__UIDescription__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:771:1: ( ( '{' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:772:1: ( '{' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:772:1: ( '{' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:773:1: '{'
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:786:1: rule__UIDescription__Group__4 : rule__UIDescription__Group__4__Impl rule__UIDescription__Group__5 ;
    public final void rule__UIDescription__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:790:1: ( rule__UIDescription__Group__4__Impl rule__UIDescription__Group__5 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:791:2: rule__UIDescription__Group__4__Impl rule__UIDescription__Group__5
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:798:1: rule__UIDescription__Group__4__Impl : ( ( rule__UIDescription__UIsAssignment_4 )* ) ;
    public final void rule__UIDescription__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:802:1: ( ( ( rule__UIDescription__UIsAssignment_4 )* ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:803:1: ( ( rule__UIDescription__UIsAssignment_4 )* )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:803:1: ( ( rule__UIDescription__UIsAssignment_4 )* )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:804:1: ( rule__UIDescription__UIsAssignment_4 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUIDescriptionAccess().getUIsAssignment_4()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:805:1: ( rule__UIDescription__UIsAssignment_4 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==21) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:805:2: rule__UIDescription__UIsAssignment_4
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:815:1: rule__UIDescription__Group__5 : rule__UIDescription__Group__5__Impl ;
    public final void rule__UIDescription__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:819:1: ( rule__UIDescription__Group__5__Impl )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:820:2: rule__UIDescription__Group__5__Impl
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:826:1: rule__UIDescription__Group__5__Impl : ( '}' ) ;
    public final void rule__UIDescription__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:830:1: ( ( '}' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:831:1: ( '}' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:831:1: ( '}' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:832:1: '}'
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:857:1: rule__UI__Group__0 : rule__UI__Group__0__Impl rule__UI__Group__1 ;
    public final void rule__UI__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:861:1: ( rule__UI__Group__0__Impl rule__UI__Group__1 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:862:2: rule__UI__Group__0__Impl rule__UI__Group__1
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:869:1: rule__UI__Group__0__Impl : ( () ) ;
    public final void rule__UI__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:873:1: ( ( () ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:874:1: ( () )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:874:1: ( () )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:875:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUIAccess().getUIAction_0()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:876:1: ()
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:878:1: 
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:888:1: rule__UI__Group__1 : rule__UI__Group__1__Impl rule__UI__Group__2 ;
    public final void rule__UI__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:892:1: ( rule__UI__Group__1__Impl rule__UI__Group__2 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:893:2: rule__UI__Group__1__Impl rule__UI__Group__2
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:900:1: rule__UI__Group__1__Impl : ( 'UI' ) ;
    public final void rule__UI__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:904:1: ( ( 'UI' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:905:1: ( 'UI' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:905:1: ( 'UI' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:906:1: 'UI'
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:919:1: rule__UI__Group__2 : rule__UI__Group__2__Impl rule__UI__Group__3 ;
    public final void rule__UI__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:923:1: ( rule__UI__Group__2__Impl rule__UI__Group__3 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:924:2: rule__UI__Group__2__Impl rule__UI__Group__3
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:931:1: rule__UI__Group__2__Impl : ( ( rule__UI__NameAssignment_2 )? ) ;
    public final void rule__UI__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:935:1: ( ( ( rule__UI__NameAssignment_2 )? ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:936:1: ( ( rule__UI__NameAssignment_2 )? )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:936:1: ( ( rule__UI__NameAssignment_2 )? )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:937:1: ( rule__UI__NameAssignment_2 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUIAccess().getNameAssignment_2()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:938:1: ( rule__UI__NameAssignment_2 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( ((LA5_0>=RULE_STRING && LA5_0<=RULE_ID)) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:938:2: rule__UI__NameAssignment_2
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:948:1: rule__UI__Group__3 : rule__UI__Group__3__Impl rule__UI__Group__4 ;
    public final void rule__UI__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:952:1: ( rule__UI__Group__3__Impl rule__UI__Group__4 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:953:2: rule__UI__Group__3__Impl rule__UI__Group__4
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:960:1: rule__UI__Group__3__Impl : ( ( rule__UI__UI_DataSourceAssignment_3 )? ) ;
    public final void rule__UI__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:964:1: ( ( ( rule__UI__UI_DataSourceAssignment_3 )? ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:965:1: ( ( rule__UI__UI_DataSourceAssignment_3 )? )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:965:1: ( ( rule__UI__UI_DataSourceAssignment_3 )? )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:966:1: ( rule__UI__UI_DataSourceAssignment_3 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUIAccess().getUI_DataSourceAssignment_3()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:967:1: ( rule__UI__UI_DataSourceAssignment_3 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==25) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:967:2: rule__UI__UI_DataSourceAssignment_3
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:977:1: rule__UI__Group__4 : rule__UI__Group__4__Impl rule__UI__Group__5 ;
    public final void rule__UI__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:981:1: ( rule__UI__Group__4__Impl rule__UI__Group__5 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:982:2: rule__UI__Group__4__Impl rule__UI__Group__5
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:989:1: rule__UI__Group__4__Impl : ( '{' ) ;
    public final void rule__UI__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:993:1: ( ( '{' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:994:1: ( '{' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:994:1: ( '{' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:995:1: '{'
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1008:1: rule__UI__Group__5 : rule__UI__Group__5__Impl rule__UI__Group__6 ;
    public final void rule__UI__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1012:1: ( rule__UI__Group__5__Impl rule__UI__Group__6 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1013:2: rule__UI__Group__5__Impl rule__UI__Group__6
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1020:1: rule__UI__Group__5__Impl : ( ( rule__UI__Group_5__0 )? ) ;
    public final void rule__UI__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1024:1: ( ( ( rule__UI__Group_5__0 )? ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1025:1: ( ( rule__UI__Group_5__0 )? )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1025:1: ( ( rule__UI__Group_5__0 )? )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1026:1: ( rule__UI__Group_5__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUIAccess().getGroup_5()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1027:1: ( rule__UI__Group_5__0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==22) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1027:2: rule__UI__Group_5__0
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1037:1: rule__UI__Group__6 : rule__UI__Group__6__Impl rule__UI__Group__7 ;
    public final void rule__UI__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1041:1: ( rule__UI__Group__6__Impl rule__UI__Group__7 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1042:2: rule__UI__Group__6__Impl rule__UI__Group__7
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1049:1: rule__UI__Group__6__Impl : ( ( rule__UI__UI_ContainersAssignment_6 )* ) ;
    public final void rule__UI__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1053:1: ( ( ( rule__UI__UI_ContainersAssignment_6 )* ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1054:1: ( ( rule__UI__UI_ContainersAssignment_6 )* )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1054:1: ( ( rule__UI__UI_ContainersAssignment_6 )* )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1055:1: ( rule__UI__UI_ContainersAssignment_6 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUIAccess().getUI_ContainersAssignment_6()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1056:1: ( rule__UI__UI_ContainersAssignment_6 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==23) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1056:2: rule__UI__UI_ContainersAssignment_6
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1066:1: rule__UI__Group__7 : rule__UI__Group__7__Impl ;
    public final void rule__UI__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1070:1: ( rule__UI__Group__7__Impl )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1071:2: rule__UI__Group__7__Impl
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1077:1: rule__UI__Group__7__Impl : ( '}' ) ;
    public final void rule__UI__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1081:1: ( ( '}' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1082:1: ( '}' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1082:1: ( '}' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1083:1: '}'
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1112:1: rule__UI__Group_5__0 : rule__UI__Group_5__0__Impl rule__UI__Group_5__1 ;
    public final void rule__UI__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1116:1: ( rule__UI__Group_5__0__Impl rule__UI__Group_5__1 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1117:2: rule__UI__Group_5__0__Impl rule__UI__Group_5__1
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1124:1: rule__UI__Group_5__0__Impl : ( 'label:' ) ;
    public final void rule__UI__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1128:1: ( ( 'label:' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1129:1: ( 'label:' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1129:1: ( 'label:' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1130:1: 'label:'
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1143:1: rule__UI__Group_5__1 : rule__UI__Group_5__1__Impl ;
    public final void rule__UI__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1147:1: ( rule__UI__Group_5__1__Impl )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1148:2: rule__UI__Group_5__1__Impl
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1154:1: rule__UI__Group_5__1__Impl : ( ( rule__UI__LabelAssignment_5_1 ) ) ;
    public final void rule__UI__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1158:1: ( ( ( rule__UI__LabelAssignment_5_1 ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1159:1: ( ( rule__UI__LabelAssignment_5_1 ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1159:1: ( ( rule__UI__LabelAssignment_5_1 ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1160:1: ( rule__UI__LabelAssignment_5_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUIAccess().getLabelAssignment_5_1()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1161:1: ( rule__UI__LabelAssignment_5_1 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1161:2: rule__UI__LabelAssignment_5_1
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1175:1: rule__UIContainer__Group__0 : rule__UIContainer__Group__0__Impl rule__UIContainer__Group__1 ;
    public final void rule__UIContainer__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1179:1: ( rule__UIContainer__Group__0__Impl rule__UIContainer__Group__1 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1180:2: rule__UIContainer__Group__0__Impl rule__UIContainer__Group__1
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1187:1: rule__UIContainer__Group__0__Impl : ( () ) ;
    public final void rule__UIContainer__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1191:1: ( ( () ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1192:1: ( () )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1192:1: ( () )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1193:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUIContainerAccess().getUIContainerAction_0()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1194:1: ()
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1196:1: 
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1206:1: rule__UIContainer__Group__1 : rule__UIContainer__Group__1__Impl rule__UIContainer__Group__2 ;
    public final void rule__UIContainer__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1210:1: ( rule__UIContainer__Group__1__Impl rule__UIContainer__Group__2 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1211:2: rule__UIContainer__Group__1__Impl rule__UIContainer__Group__2
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1218:1: rule__UIContainer__Group__1__Impl : ( 'Container' ) ;
    public final void rule__UIContainer__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1222:1: ( ( 'Container' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1223:1: ( 'Container' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1223:1: ( 'Container' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1224:1: 'Container'
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1237:1: rule__UIContainer__Group__2 : rule__UIContainer__Group__2__Impl rule__UIContainer__Group__3 ;
    public final void rule__UIContainer__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1241:1: ( rule__UIContainer__Group__2__Impl rule__UIContainer__Group__3 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1242:2: rule__UIContainer__Group__2__Impl rule__UIContainer__Group__3
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1249:1: rule__UIContainer__Group__2__Impl : ( ( rule__UIContainer__NameAssignment_2 )? ) ;
    public final void rule__UIContainer__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1253:1: ( ( ( rule__UIContainer__NameAssignment_2 )? ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1254:1: ( ( rule__UIContainer__NameAssignment_2 )? )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1254:1: ( ( rule__UIContainer__NameAssignment_2 )? )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1255:1: ( rule__UIContainer__NameAssignment_2 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUIContainerAccess().getNameAssignment_2()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1256:1: ( rule__UIContainer__NameAssignment_2 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( ((LA9_0>=RULE_STRING && LA9_0<=RULE_ID)) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1256:2: rule__UIContainer__NameAssignment_2
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1266:1: rule__UIContainer__Group__3 : rule__UIContainer__Group__3__Impl rule__UIContainer__Group__4 ;
    public final void rule__UIContainer__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1270:1: ( rule__UIContainer__Group__3__Impl rule__UIContainer__Group__4 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1271:2: rule__UIContainer__Group__3__Impl rule__UIContainer__Group__4
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1278:1: rule__UIContainer__Group__3__Impl : ( '{' ) ;
    public final void rule__UIContainer__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1282:1: ( ( '{' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1283:1: ( '{' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1283:1: ( '{' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1284:1: '{'
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1297:1: rule__UIContainer__Group__4 : rule__UIContainer__Group__4__Impl rule__UIContainer__Group__5 ;
    public final void rule__UIContainer__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1301:1: ( rule__UIContainer__Group__4__Impl rule__UIContainer__Group__5 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1302:2: rule__UIContainer__Group__4__Impl rule__UIContainer__Group__5
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1309:1: rule__UIContainer__Group__4__Impl : ( ( rule__UIContainer__Group_4__0 )? ) ;
    public final void rule__UIContainer__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1313:1: ( ( ( rule__UIContainer__Group_4__0 )? ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1314:1: ( ( rule__UIContainer__Group_4__0 )? )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1314:1: ( ( rule__UIContainer__Group_4__0 )? )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1315:1: ( rule__UIContainer__Group_4__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUIContainerAccess().getGroup_4()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1316:1: ( rule__UIContainer__Group_4__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==22) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1316:2: rule__UIContainer__Group_4__0
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1326:1: rule__UIContainer__Group__5 : rule__UIContainer__Group__5__Impl rule__UIContainer__Group__6 ;
    public final void rule__UIContainer__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1330:1: ( rule__UIContainer__Group__5__Impl rule__UIContainer__Group__6 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1331:2: rule__UIContainer__Group__5__Impl rule__UIContainer__Group__6
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1338:1: rule__UIContainer__Group__5__Impl : ( ( rule__UIContainer__Group_5__0 )? ) ;
    public final void rule__UIContainer__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1342:1: ( ( ( rule__UIContainer__Group_5__0 )? ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1343:1: ( ( rule__UIContainer__Group_5__0 )? )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1343:1: ( ( rule__UIContainer__Group_5__0 )? )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1344:1: ( rule__UIContainer__Group_5__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUIContainerAccess().getGroup_5()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1345:1: ( rule__UIContainer__Group_5__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==24) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1345:2: rule__UIContainer__Group_5__0
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1355:1: rule__UIContainer__Group__6 : rule__UIContainer__Group__6__Impl rule__UIContainer__Group__7 ;
    public final void rule__UIContainer__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1359:1: ( rule__UIContainer__Group__6__Impl rule__UIContainer__Group__7 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1360:2: rule__UIContainer__Group__6__Impl rule__UIContainer__Group__7
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1367:1: rule__UIContainer__Group__6__Impl : ( ( rule__UIContainer__Group_6__0 )? ) ;
    public final void rule__UIContainer__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1371:1: ( ( ( rule__UIContainer__Group_6__0 )? ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1372:1: ( ( rule__UIContainer__Group_6__0 )? )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1372:1: ( ( rule__UIContainer__Group_6__0 )? )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1373:1: ( rule__UIContainer__Group_6__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUIContainerAccess().getGroup_6()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1374:1: ( rule__UIContainer__Group_6__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==26) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1374:2: rule__UIContainer__Group_6__0
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1384:1: rule__UIContainer__Group__7 : rule__UIContainer__Group__7__Impl rule__UIContainer__Group__8 ;
    public final void rule__UIContainer__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1388:1: ( rule__UIContainer__Group__7__Impl rule__UIContainer__Group__8 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1389:2: rule__UIContainer__Group__7__Impl rule__UIContainer__Group__8
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1396:1: rule__UIContainer__Group__7__Impl : ( ( rule__UIContainer__Group_7__0 )? ) ;
    public final void rule__UIContainer__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1400:1: ( ( ( rule__UIContainer__Group_7__0 )? ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1401:1: ( ( rule__UIContainer__Group_7__0 )? )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1401:1: ( ( rule__UIContainer__Group_7__0 )? )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1402:1: ( rule__UIContainer__Group_7__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUIContainerAccess().getGroup_7()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1403:1: ( rule__UIContainer__Group_7__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==23) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1403:2: rule__UIContainer__Group_7__0
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1413:1: rule__UIContainer__Group__8 : rule__UIContainer__Group__8__Impl ;
    public final void rule__UIContainer__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1417:1: ( rule__UIContainer__Group__8__Impl )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1418:2: rule__UIContainer__Group__8__Impl
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1424:1: rule__UIContainer__Group__8__Impl : ( '}' ) ;
    public final void rule__UIContainer__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1428:1: ( ( '}' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1429:1: ( '}' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1429:1: ( '}' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1430:1: '}'
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1461:1: rule__UIContainer__Group_4__0 : rule__UIContainer__Group_4__0__Impl rule__UIContainer__Group_4__1 ;
    public final void rule__UIContainer__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1465:1: ( rule__UIContainer__Group_4__0__Impl rule__UIContainer__Group_4__1 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1466:2: rule__UIContainer__Group_4__0__Impl rule__UIContainer__Group_4__1
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1473:1: rule__UIContainer__Group_4__0__Impl : ( 'label:' ) ;
    public final void rule__UIContainer__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1477:1: ( ( 'label:' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1478:1: ( 'label:' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1478:1: ( 'label:' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1479:1: 'label:'
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1492:1: rule__UIContainer__Group_4__1 : rule__UIContainer__Group_4__1__Impl ;
    public final void rule__UIContainer__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1496:1: ( rule__UIContainer__Group_4__1__Impl )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1497:2: rule__UIContainer__Group_4__1__Impl
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1503:1: rule__UIContainer__Group_4__1__Impl : ( ( rule__UIContainer__LabelAssignment_4_1 ) ) ;
    public final void rule__UIContainer__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1507:1: ( ( ( rule__UIContainer__LabelAssignment_4_1 ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1508:1: ( ( rule__UIContainer__LabelAssignment_4_1 ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1508:1: ( ( rule__UIContainer__LabelAssignment_4_1 ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1509:1: ( rule__UIContainer__LabelAssignment_4_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUIContainerAccess().getLabelAssignment_4_1()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1510:1: ( rule__UIContainer__LabelAssignment_4_1 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1510:2: rule__UIContainer__LabelAssignment_4_1
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1524:1: rule__UIContainer__Group_5__0 : rule__UIContainer__Group_5__0__Impl rule__UIContainer__Group_5__1 ;
    public final void rule__UIContainer__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1528:1: ( rule__UIContainer__Group_5__0__Impl rule__UIContainer__Group_5__1 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1529:2: rule__UIContainer__Group_5__0__Impl rule__UIContainer__Group_5__1
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1536:1: rule__UIContainer__Group_5__0__Impl : ( 'description:' ) ;
    public final void rule__UIContainer__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1540:1: ( ( 'description:' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1541:1: ( 'description:' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1541:1: ( 'description:' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1542:1: 'description:'
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1555:1: rule__UIContainer__Group_5__1 : rule__UIContainer__Group_5__1__Impl ;
    public final void rule__UIContainer__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1559:1: ( rule__UIContainer__Group_5__1__Impl )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1560:2: rule__UIContainer__Group_5__1__Impl
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1566:1: rule__UIContainer__Group_5__1__Impl : ( ( rule__UIContainer__DescriptionAssignment_5_1 ) ) ;
    public final void rule__UIContainer__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1570:1: ( ( ( rule__UIContainer__DescriptionAssignment_5_1 ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1571:1: ( ( rule__UIContainer__DescriptionAssignment_5_1 ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1571:1: ( ( rule__UIContainer__DescriptionAssignment_5_1 ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1572:1: ( rule__UIContainer__DescriptionAssignment_5_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUIContainerAccess().getDescriptionAssignment_5_1()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1573:1: ( rule__UIContainer__DescriptionAssignment_5_1 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1573:2: rule__UIContainer__DescriptionAssignment_5_1
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1587:1: rule__UIContainer__Group_6__0 : rule__UIContainer__Group_6__0__Impl rule__UIContainer__Group_6__1 ;
    public final void rule__UIContainer__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1591:1: ( rule__UIContainer__Group_6__0__Impl rule__UIContainer__Group_6__1 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1592:2: rule__UIContainer__Group_6__0__Impl rule__UIContainer__Group_6__1
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1599:1: rule__UIContainer__Group_6__0__Impl : ( ( rule__UIContainer__UI_fieldsAssignment_6_0 ) ) ;
    public final void rule__UIContainer__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1603:1: ( ( ( rule__UIContainer__UI_fieldsAssignment_6_0 ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1604:1: ( ( rule__UIContainer__UI_fieldsAssignment_6_0 ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1604:1: ( ( rule__UIContainer__UI_fieldsAssignment_6_0 ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1605:1: ( rule__UIContainer__UI_fieldsAssignment_6_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUIContainerAccess().getUI_fieldsAssignment_6_0()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1606:1: ( rule__UIContainer__UI_fieldsAssignment_6_0 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1606:2: rule__UIContainer__UI_fieldsAssignment_6_0
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1616:1: rule__UIContainer__Group_6__1 : rule__UIContainer__Group_6__1__Impl ;
    public final void rule__UIContainer__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1620:1: ( rule__UIContainer__Group_6__1__Impl )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1621:2: rule__UIContainer__Group_6__1__Impl
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1627:1: rule__UIContainer__Group_6__1__Impl : ( ( rule__UIContainer__UI_fieldsAssignment_6_1 )* ) ;
    public final void rule__UIContainer__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1631:1: ( ( ( rule__UIContainer__UI_fieldsAssignment_6_1 )* ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1632:1: ( ( rule__UIContainer__UI_fieldsAssignment_6_1 )* )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1632:1: ( ( rule__UIContainer__UI_fieldsAssignment_6_1 )* )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1633:1: ( rule__UIContainer__UI_fieldsAssignment_6_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUIContainerAccess().getUI_fieldsAssignment_6_1()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1634:1: ( rule__UIContainer__UI_fieldsAssignment_6_1 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==26) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1634:2: rule__UIContainer__UI_fieldsAssignment_6_1
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1648:1: rule__UIContainer__Group_7__0 : rule__UIContainer__Group_7__0__Impl rule__UIContainer__Group_7__1 ;
    public final void rule__UIContainer__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1652:1: ( rule__UIContainer__Group_7__0__Impl rule__UIContainer__Group_7__1 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1653:2: rule__UIContainer__Group_7__0__Impl rule__UIContainer__Group_7__1
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1660:1: rule__UIContainer__Group_7__0__Impl : ( ( rule__UIContainer__SubContainersAssignment_7_0 ) ) ;
    public final void rule__UIContainer__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1664:1: ( ( ( rule__UIContainer__SubContainersAssignment_7_0 ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1665:1: ( ( rule__UIContainer__SubContainersAssignment_7_0 ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1665:1: ( ( rule__UIContainer__SubContainersAssignment_7_0 ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1666:1: ( rule__UIContainer__SubContainersAssignment_7_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUIContainerAccess().getSubContainersAssignment_7_0()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1667:1: ( rule__UIContainer__SubContainersAssignment_7_0 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1667:2: rule__UIContainer__SubContainersAssignment_7_0
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1677:1: rule__UIContainer__Group_7__1 : rule__UIContainer__Group_7__1__Impl ;
    public final void rule__UIContainer__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1681:1: ( rule__UIContainer__Group_7__1__Impl )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1682:2: rule__UIContainer__Group_7__1__Impl
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1688:1: rule__UIContainer__Group_7__1__Impl : ( ( rule__UIContainer__SubContainersAssignment_7_1 )* ) ;
    public final void rule__UIContainer__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1692:1: ( ( ( rule__UIContainer__SubContainersAssignment_7_1 )* ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1693:1: ( ( rule__UIContainer__SubContainersAssignment_7_1 )* )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1693:1: ( ( rule__UIContainer__SubContainersAssignment_7_1 )* )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1694:1: ( rule__UIContainer__SubContainersAssignment_7_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUIContainerAccess().getSubContainersAssignment_7_1()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1695:1: ( rule__UIContainer__SubContainersAssignment_7_1 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==23) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1695:2: rule__UIContainer__SubContainersAssignment_7_1
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1709:1: rule__LocalClass__Group__0 : rule__LocalClass__Group__0__Impl rule__LocalClass__Group__1 ;
    public final void rule__LocalClass__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1713:1: ( rule__LocalClass__Group__0__Impl rule__LocalClass__Group__1 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1714:2: rule__LocalClass__Group__0__Impl rule__LocalClass__Group__1
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1721:1: rule__LocalClass__Group__0__Impl : ( () ) ;
    public final void rule__LocalClass__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1725:1: ( ( () ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1726:1: ( () )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1726:1: ( () )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1727:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLocalClassAccess().getLocalClassAction_0()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1728:1: ()
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1730:1: 
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1740:1: rule__LocalClass__Group__1 : rule__LocalClass__Group__1__Impl rule__LocalClass__Group__2 ;
    public final void rule__LocalClass__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1744:1: ( rule__LocalClass__Group__1__Impl rule__LocalClass__Group__2 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1745:2: rule__LocalClass__Group__1__Impl rule__LocalClass__Group__2
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1752:1: rule__LocalClass__Group__1__Impl : ( 'for' ) ;
    public final void rule__LocalClass__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1756:1: ( ( 'for' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1757:1: ( 'for' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1757:1: ( 'for' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1758:1: 'for'
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1771:1: rule__LocalClass__Group__2 : rule__LocalClass__Group__2__Impl ;
    public final void rule__LocalClass__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1775:1: ( rule__LocalClass__Group__2__Impl )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1776:2: rule__LocalClass__Group__2__Impl
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1782:1: rule__LocalClass__Group__2__Impl : ( ( rule__LocalClass__UI_For_LocalClassAssignment_2 ) ) ;
    public final void rule__LocalClass__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1786:1: ( ( ( rule__LocalClass__UI_For_LocalClassAssignment_2 ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1787:1: ( ( rule__LocalClass__UI_For_LocalClassAssignment_2 ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1787:1: ( ( rule__LocalClass__UI_For_LocalClassAssignment_2 ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1788:1: ( rule__LocalClass__UI_For_LocalClassAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLocalClassAccess().getUI_For_LocalClassAssignment_2()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1789:1: ( rule__LocalClass__UI_For_LocalClassAssignment_2 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1789:2: rule__LocalClass__UI_For_LocalClassAssignment_2
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1805:1: rule__UIField__Group__0 : rule__UIField__Group__0__Impl rule__UIField__Group__1 ;
    public final void rule__UIField__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1809:1: ( rule__UIField__Group__0__Impl rule__UIField__Group__1 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1810:2: rule__UIField__Group__0__Impl rule__UIField__Group__1
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1817:1: rule__UIField__Group__0__Impl : ( () ) ;
    public final void rule__UIField__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1821:1: ( ( () ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1822:1: ( () )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1822:1: ( () )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1823:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUIFieldAccess().getUIFieldAction_0()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1824:1: ()
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1826:1: 
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1836:1: rule__UIField__Group__1 : rule__UIField__Group__1__Impl rule__UIField__Group__2 ;
    public final void rule__UIField__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1840:1: ( rule__UIField__Group__1__Impl rule__UIField__Group__2 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1841:2: rule__UIField__Group__1__Impl rule__UIField__Group__2
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1848:1: rule__UIField__Group__1__Impl : ( 'Field' ) ;
    public final void rule__UIField__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1852:1: ( ( 'Field' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1853:1: ( 'Field' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1853:1: ( 'Field' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1854:1: 'Field'
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1867:1: rule__UIField__Group__2 : rule__UIField__Group__2__Impl rule__UIField__Group__3 ;
    public final void rule__UIField__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1871:1: ( rule__UIField__Group__2__Impl rule__UIField__Group__3 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1872:2: rule__UIField__Group__2__Impl rule__UIField__Group__3
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1879:1: rule__UIField__Group__2__Impl : ( ( rule__UIField__NameAssignment_2 ) ) ;
    public final void rule__UIField__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1883:1: ( ( ( rule__UIField__NameAssignment_2 ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1884:1: ( ( rule__UIField__NameAssignment_2 ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1884:1: ( ( rule__UIField__NameAssignment_2 ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1885:1: ( rule__UIField__NameAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUIFieldAccess().getNameAssignment_2()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1886:1: ( rule__UIField__NameAssignment_2 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1886:2: rule__UIField__NameAssignment_2
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1896:1: rule__UIField__Group__3 : rule__UIField__Group__3__Impl rule__UIField__Group__4 ;
    public final void rule__UIField__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1900:1: ( rule__UIField__Group__3__Impl rule__UIField__Group__4 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1901:2: rule__UIField__Group__3__Impl rule__UIField__Group__4
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1908:1: rule__UIField__Group__3__Impl : ( ( rule__UIField__Group_3__0 )? ) ;
    public final void rule__UIField__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1912:1: ( ( ( rule__UIField__Group_3__0 )? ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1913:1: ( ( rule__UIField__Group_3__0 )? )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1913:1: ( ( rule__UIField__Group_3__0 )? )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1914:1: ( rule__UIField__Group_3__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUIFieldAccess().getGroup_3()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1915:1: ( rule__UIField__Group_3__0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==22) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1915:2: rule__UIField__Group_3__0
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1925:1: rule__UIField__Group__4 : rule__UIField__Group__4__Impl rule__UIField__Group__5 ;
    public final void rule__UIField__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1929:1: ( rule__UIField__Group__4__Impl rule__UIField__Group__5 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1930:2: rule__UIField__Group__4__Impl rule__UIField__Group__5
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1937:1: rule__UIField__Group__4__Impl : ( ( rule__UIField__Group_4__0 )? ) ;
    public final void rule__UIField__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1941:1: ( ( ( rule__UIField__Group_4__0 )? ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1942:1: ( ( rule__UIField__Group_4__0 )? )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1942:1: ( ( rule__UIField__Group_4__0 )? )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1943:1: ( rule__UIField__Group_4__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUIFieldAccess().getGroup_4()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1944:1: ( rule__UIField__Group_4__0 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==24) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1944:2: rule__UIField__Group_4__0
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1954:1: rule__UIField__Group__5 : rule__UIField__Group__5__Impl rule__UIField__Group__6 ;
    public final void rule__UIField__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1958:1: ( rule__UIField__Group__5__Impl rule__UIField__Group__6 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1959:2: rule__UIField__Group__5__Impl rule__UIField__Group__6
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1966:1: rule__UIField__Group__5__Impl : ( ( rule__UIField__Group_5__0 )? ) ;
    public final void rule__UIField__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1970:1: ( ( ( rule__UIField__Group_5__0 )? ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1971:1: ( ( rule__UIField__Group_5__0 )? )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1971:1: ( ( rule__UIField__Group_5__0 )? )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1972:1: ( rule__UIField__Group_5__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUIFieldAccess().getGroup_5()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1973:1: ( rule__UIField__Group_5__0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==28) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1973:2: rule__UIField__Group_5__0
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1983:1: rule__UIField__Group__6 : rule__UIField__Group__6__Impl rule__UIField__Group__7 ;
    public final void rule__UIField__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1987:1: ( rule__UIField__Group__6__Impl rule__UIField__Group__7 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1988:2: rule__UIField__Group__6__Impl rule__UIField__Group__7
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1995:1: rule__UIField__Group__6__Impl : ( ',' ) ;
    public final void rule__UIField__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:1999:1: ( ( ',' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:2000:1: ( ',' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:2000:1: ( ',' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:2001:1: ','
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:2014:1: rule__UIField__Group__7 : rule__UIField__Group__7__Impl ;
    public final void rule__UIField__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:2018:1: ( rule__UIField__Group__7__Impl )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:2019:2: rule__UIField__Group__7__Impl
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:2025:1: rule__UIField__Group__7__Impl : ( ( rule__UIField__MappingAssignment_7 ) ) ;
    public final void rule__UIField__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:2029:1: ( ( ( rule__UIField__MappingAssignment_7 ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:2030:1: ( ( rule__UIField__MappingAssignment_7 ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:2030:1: ( ( rule__UIField__MappingAssignment_7 ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:2031:1: ( rule__UIField__MappingAssignment_7 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUIFieldAccess().getMappingAssignment_7()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:2032:1: ( rule__UIField__MappingAssignment_7 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:2032:2: rule__UIField__MappingAssignment_7
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:2058:1: rule__UIField__Group_3__0 : rule__UIField__Group_3__0__Impl rule__UIField__Group_3__1 ;
    public final void rule__UIField__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:2062:1: ( rule__UIField__Group_3__0__Impl rule__UIField__Group_3__1 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:2063:2: rule__UIField__Group_3__0__Impl rule__UIField__Group_3__1
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:2070:1: rule__UIField__Group_3__0__Impl : ( 'label:' ) ;
    public final void rule__UIField__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:2074:1: ( ( 'label:' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:2075:1: ( 'label:' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:2075:1: ( 'label:' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:2076:1: 'label:'
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:2089:1: rule__UIField__Group_3__1 : rule__UIField__Group_3__1__Impl ;
    public final void rule__UIField__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:2093:1: ( rule__UIField__Group_3__1__Impl )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:2094:2: rule__UIField__Group_3__1__Impl
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:2100:1: rule__UIField__Group_3__1__Impl : ( ( rule__UIField__LabelAssignment_3_1 ) ) ;
    public final void rule__UIField__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:2104:1: ( ( ( rule__UIField__LabelAssignment_3_1 ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:2105:1: ( ( rule__UIField__LabelAssignment_3_1 ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:2105:1: ( ( rule__UIField__LabelAssignment_3_1 ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:2106:1: ( rule__UIField__LabelAssignment_3_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUIFieldAccess().getLabelAssignment_3_1()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:2107:1: ( rule__UIField__LabelAssignment_3_1 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:2107:2: rule__UIField__LabelAssignment_3_1
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:2121:1: rule__UIField__Group_4__0 : rule__UIField__Group_4__0__Impl rule__UIField__Group_4__1 ;
    public final void rule__UIField__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:2125:1: ( rule__UIField__Group_4__0__Impl rule__UIField__Group_4__1 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:2126:2: rule__UIField__Group_4__0__Impl rule__UIField__Group_4__1
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:2133:1: rule__UIField__Group_4__0__Impl : ( 'description:' ) ;
    public final void rule__UIField__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:2137:1: ( ( 'description:' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:2138:1: ( 'description:' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:2138:1: ( 'description:' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:2139:1: 'description:'
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:2152:1: rule__UIField__Group_4__1 : rule__UIField__Group_4__1__Impl rule__UIField__Group_4__2 ;
    public final void rule__UIField__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:2156:1: ( rule__UIField__Group_4__1__Impl rule__UIField__Group_4__2 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:2157:2: rule__UIField__Group_4__1__Impl rule__UIField__Group_4__2
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:2164:1: rule__UIField__Group_4__1__Impl : ( ( rule__UIField__DescriptionAssignment_4_1 ) ) ;
    public final void rule__UIField__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:2168:1: ( ( ( rule__UIField__DescriptionAssignment_4_1 ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:2169:1: ( ( rule__UIField__DescriptionAssignment_4_1 ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:2169:1: ( ( rule__UIField__DescriptionAssignment_4_1 ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:2170:1: ( rule__UIField__DescriptionAssignment_4_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUIFieldAccess().getDescriptionAssignment_4_1()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:2171:1: ( rule__UIField__DescriptionAssignment_4_1 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:2171:2: rule__UIField__DescriptionAssignment_4_1
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:2181:1: rule__UIField__Group_4__2 : rule__UIField__Group_4__2__Impl ;
    public final void rule__UIField__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:2185:1: ( rule__UIField__Group_4__2__Impl )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:2186:2: rule__UIField__Group_4__2__Impl
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:2192:1: rule__UIField__Group_4__2__Impl : ( ',' ) ;
    public final void rule__UIField__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:2196:1: ( ( ',' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:2197:1: ( ',' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:2197:1: ( ',' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:2198:1: ','
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:2217:1: rule__UIField__Group_5__0 : rule__UIField__Group_5__0__Impl rule__UIField__Group_5__1 ;
    public final void rule__UIField__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:2221:1: ( rule__UIField__Group_5__0__Impl rule__UIField__Group_5__1 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:2222:2: rule__UIField__Group_5__0__Impl rule__UIField__Group_5__1
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:2229:1: rule__UIField__Group_5__0__Impl : ( 'type' ) ;
    public final void rule__UIField__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:2233:1: ( ( 'type' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:2234:1: ( 'type' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:2234:1: ( 'type' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:2235:1: 'type'
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:2248:1: rule__UIField__Group_5__1 : rule__UIField__Group_5__1__Impl ;
    public final void rule__UIField__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:2252:1: ( rule__UIField__Group_5__1__Impl )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:2253:2: rule__UIField__Group_5__1__Impl
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:2259:1: rule__UIField__Group_5__1__Impl : ( ( rule__UIField__TypeAssignment_5_1 ) ) ;
    public final void rule__UIField__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:2263:1: ( ( ( rule__UIField__TypeAssignment_5_1 ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:2264:1: ( ( rule__UIField__TypeAssignment_5_1 ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:2264:1: ( ( rule__UIField__TypeAssignment_5_1 ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:2265:1: ( rule__UIField__TypeAssignment_5_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUIFieldAccess().getTypeAssignment_5_1()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:2266:1: ( rule__UIField__TypeAssignment_5_1 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:2266:2: rule__UIField__TypeAssignment_5_1
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:2280:1: rule__FieldMapping__Group__0 : rule__FieldMapping__Group__0__Impl rule__FieldMapping__Group__1 ;
    public final void rule__FieldMapping__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:2284:1: ( rule__FieldMapping__Group__0__Impl rule__FieldMapping__Group__1 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:2285:2: rule__FieldMapping__Group__0__Impl rule__FieldMapping__Group__1
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:2292:1: rule__FieldMapping__Group__0__Impl : ( () ) ;
    public final void rule__FieldMapping__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:2296:1: ( ( () ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:2297:1: ( () )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:2297:1: ( () )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:2298:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldMappingAccess().getFieldMappingAction_0()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:2299:1: ()
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:2301:1: 
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:2311:1: rule__FieldMapping__Group__1 : rule__FieldMapping__Group__1__Impl rule__FieldMapping__Group__2 ;
    public final void rule__FieldMapping__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:2315:1: ( rule__FieldMapping__Group__1__Impl rule__FieldMapping__Group__2 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:2316:2: rule__FieldMapping__Group__1__Impl rule__FieldMapping__Group__2
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:2323:1: rule__FieldMapping__Group__1__Impl : ( 'mapped-to' ) ;
    public final void rule__FieldMapping__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:2327:1: ( ( 'mapped-to' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:2328:1: ( 'mapped-to' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:2328:1: ( 'mapped-to' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:2329:1: 'mapped-to'
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:2342:1: rule__FieldMapping__Group__2 : rule__FieldMapping__Group__2__Impl ;
    public final void rule__FieldMapping__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:2346:1: ( rule__FieldMapping__Group__2__Impl )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:2347:2: rule__FieldMapping__Group__2__Impl
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:2353:1: rule__FieldMapping__Group__2__Impl : ( ( rule__FieldMapping__UI_Field_Mapped_ToAssignment_2 )? ) ;
    public final void rule__FieldMapping__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:2357:1: ( ( ( rule__FieldMapping__UI_Field_Mapped_ToAssignment_2 )? ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:2358:1: ( ( rule__FieldMapping__UI_Field_Mapped_ToAssignment_2 )? )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:2358:1: ( ( rule__FieldMapping__UI_Field_Mapped_ToAssignment_2 )? )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:2359:1: ( rule__FieldMapping__UI_Field_Mapped_ToAssignment_2 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldMappingAccess().getUI_Field_Mapped_ToAssignment_2()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:2360:1: ( rule__FieldMapping__UI_Field_Mapped_ToAssignment_2 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==RULE_ID) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:2360:2: rule__FieldMapping__UI_Field_Mapped_ToAssignment_2
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:2376:1: rule__FQN__Group__0 : rule__FQN__Group__0__Impl rule__FQN__Group__1 ;
    public final void rule__FQN__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:2380:1: ( rule__FQN__Group__0__Impl rule__FQN__Group__1 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:2381:2: rule__FQN__Group__0__Impl rule__FQN__Group__1
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:2388:1: rule__FQN__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__FQN__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:2392:1: ( ( RULE_ID ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:2393:1: ( RULE_ID )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:2393:1: ( RULE_ID )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:2394:1: RULE_ID
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:2405:1: rule__FQN__Group__1 : rule__FQN__Group__1__Impl ;
    public final void rule__FQN__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:2409:1: ( rule__FQN__Group__1__Impl )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:2410:2: rule__FQN__Group__1__Impl
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:2416:1: rule__FQN__Group__1__Impl : ( ( rule__FQN__Group_1__0 )* ) ;
    public final void rule__FQN__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:2420:1: ( ( ( rule__FQN__Group_1__0 )* ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:2421:1: ( ( rule__FQN__Group_1__0 )* )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:2421:1: ( ( rule__FQN__Group_1__0 )* )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:2422:1: ( rule__FQN__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFQNAccess().getGroup_1()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:2423:1: ( rule__FQN__Group_1__0 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==30) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:2423:2: rule__FQN__Group_1__0
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:2437:1: rule__FQN__Group_1__0 : rule__FQN__Group_1__0__Impl rule__FQN__Group_1__1 ;
    public final void rule__FQN__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:2441:1: ( rule__FQN__Group_1__0__Impl rule__FQN__Group_1__1 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:2442:2: rule__FQN__Group_1__0__Impl rule__FQN__Group_1__1
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:2449:1: rule__FQN__Group_1__0__Impl : ( '.' ) ;
    public final void rule__FQN__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:2453:1: ( ( '.' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:2454:1: ( '.' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:2454:1: ( '.' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:2455:1: '.'
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:2468:1: rule__FQN__Group_1__1 : rule__FQN__Group_1__1__Impl ;
    public final void rule__FQN__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:2472:1: ( rule__FQN__Group_1__1__Impl )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:2473:2: rule__FQN__Group_1__1__Impl
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:2479:1: rule__FQN__Group_1__1__Impl : ( ( RULE_ID ) ) ;
    public final void rule__FQN__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:2483:1: ( ( ( RULE_ID ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:2484:1: ( ( RULE_ID ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:2484:1: ( ( RULE_ID ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:2485:1: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFQNAccess().getIDTerminalRuleCall_1_1()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:2486:1: ( RULE_ID )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:2486:3: RULE_ID
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:2501:1: rule__UserInterface__ImportsAssignment_1 : ( ruleImport ) ;
    public final void rule__UserInterface__ImportsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:2505:1: ( ( ruleImport ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:2506:1: ( ruleImport )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:2506:1: ( ruleImport )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:2507:1: ruleImport
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:2516:1: rule__UserInterface__UiDescriptionAssignment_2 : ( ruleAspect ) ;
    public final void rule__UserInterface__UiDescriptionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:2520:1: ( ( ruleAspect ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:2521:1: ( ruleAspect )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:2521:1: ( ruleAspect )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:2522:1: ruleAspect
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:2531:1: rule__Import__ImportedNamespaceAssignment_1 : ( ruleFQN ) ;
    public final void rule__Import__ImportedNamespaceAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:2535:1: ( ( ruleFQN ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:2536:1: ( ruleFQN )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:2536:1: ( ruleFQN )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:2537:1: ruleFQN
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:2546:1: rule__UIDescription__NameAssignment_2 : ( ruleFQN ) ;
    public final void rule__UIDescription__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:2550:1: ( ( ruleFQN ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:2551:1: ( ruleFQN )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:2551:1: ( ruleFQN )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:2552:1: ruleFQN
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:2561:1: rule__UIDescription__UIsAssignment_4 : ( ruleUI ) ;
    public final void rule__UIDescription__UIsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:2565:1: ( ( ruleUI ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:2566:1: ( ruleUI )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:2566:1: ( ruleUI )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:2567:1: ruleUI
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:2576:1: rule__UI__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__UI__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:2580:1: ( ( ruleEString ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:2581:1: ( ruleEString )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:2581:1: ( ruleEString )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:2582:1: ruleEString
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:2591:1: rule__UI__UI_DataSourceAssignment_3 : ( ruleDataSource ) ;
    public final void rule__UI__UI_DataSourceAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:2595:1: ( ( ruleDataSource ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:2596:1: ( ruleDataSource )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:2596:1: ( ruleDataSource )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:2597:1: ruleDataSource
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:2606:1: rule__UI__LabelAssignment_5_1 : ( ruleEString ) ;
    public final void rule__UI__LabelAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:2610:1: ( ( ruleEString ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:2611:1: ( ruleEString )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:2611:1: ( ruleEString )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:2612:1: ruleEString
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:2621:1: rule__UI__UI_ContainersAssignment_6 : ( ruleUIContainer ) ;
    public final void rule__UI__UI_ContainersAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:2625:1: ( ( ruleUIContainer ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:2626:1: ( ruleUIContainer )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:2626:1: ( ruleUIContainer )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:2627:1: ruleUIContainer
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:2636:1: rule__UIContainer__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__UIContainer__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:2640:1: ( ( ruleEString ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:2641:1: ( ruleEString )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:2641:1: ( ruleEString )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:2642:1: ruleEString
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:2651:1: rule__UIContainer__LabelAssignment_4_1 : ( ruleEString ) ;
    public final void rule__UIContainer__LabelAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:2655:1: ( ( ruleEString ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:2656:1: ( ruleEString )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:2656:1: ( ruleEString )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:2657:1: ruleEString
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:2666:1: rule__UIContainer__DescriptionAssignment_5_1 : ( ruleEString ) ;
    public final void rule__UIContainer__DescriptionAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:2670:1: ( ( ruleEString ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:2671:1: ( ruleEString )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:2671:1: ( ruleEString )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:2672:1: ruleEString
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:2681:1: rule__UIContainer__UI_fieldsAssignment_6_0 : ( ruleUIField ) ;
    public final void rule__UIContainer__UI_fieldsAssignment_6_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:2685:1: ( ( ruleUIField ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:2686:1: ( ruleUIField )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:2686:1: ( ruleUIField )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:2687:1: ruleUIField
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:2696:1: rule__UIContainer__UI_fieldsAssignment_6_1 : ( ruleUIField ) ;
    public final void rule__UIContainer__UI_fieldsAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:2700:1: ( ( ruleUIField ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:2701:1: ( ruleUIField )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:2701:1: ( ruleUIField )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:2702:1: ruleUIField
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:2711:1: rule__UIContainer__SubContainersAssignment_7_0 : ( ruleUIContainer ) ;
    public final void rule__UIContainer__SubContainersAssignment_7_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:2715:1: ( ( ruleUIContainer ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:2716:1: ( ruleUIContainer )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:2716:1: ( ruleUIContainer )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:2717:1: ruleUIContainer
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:2726:1: rule__UIContainer__SubContainersAssignment_7_1 : ( ruleUIContainer ) ;
    public final void rule__UIContainer__SubContainersAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:2730:1: ( ( ruleUIContainer ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:2731:1: ( ruleUIContainer )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:2731:1: ( ruleUIContainer )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:2732:1: ruleUIContainer
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:2741:1: rule__LocalClass__UI_For_LocalClassAssignment_2 : ( ( ruleFQN ) ) ;
    public final void rule__LocalClass__UI_For_LocalClassAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:2745:1: ( ( ( ruleFQN ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:2746:1: ( ( ruleFQN ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:2746:1: ( ( ruleFQN ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:2747:1: ( ruleFQN )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLocalClassAccess().getUI_For_LocalClassClassCrossReference_2_0()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:2748:1: ( ruleFQN )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:2749:1: ruleFQN
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:2760:1: rule__UIField__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__UIField__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:2764:1: ( ( ruleEString ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:2765:1: ( ruleEString )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:2765:1: ( ruleEString )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:2766:1: ruleEString
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:2775:1: rule__UIField__LabelAssignment_3_1 : ( ruleEString ) ;
    public final void rule__UIField__LabelAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:2779:1: ( ( ruleEString ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:2780:1: ( ruleEString )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:2780:1: ( ruleEString )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:2781:1: ruleEString
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:2790:1: rule__UIField__DescriptionAssignment_4_1 : ( ruleEString ) ;
    public final void rule__UIField__DescriptionAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:2794:1: ( ( ruleEString ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:2795:1: ( ruleEString )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:2795:1: ( ruleEString )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:2796:1: ruleEString
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:2805:1: rule__UIField__TypeAssignment_5_1 : ( ruleUI_Field_Type ) ;
    public final void rule__UIField__TypeAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:2809:1: ( ( ruleUI_Field_Type ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:2810:1: ( ruleUI_Field_Type )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:2810:1: ( ruleUI_Field_Type )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:2811:1: ruleUI_Field_Type
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:2820:1: rule__UIField__MappingAssignment_7 : ( ruleFieldMapping ) ;
    public final void rule__UIField__MappingAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:2824:1: ( ( ruleFieldMapping ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:2825:1: ( ruleFieldMapping )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:2825:1: ( ruleFieldMapping )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:2826:1: ruleFieldMapping
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:2835:1: rule__FieldMapping__UI_Field_Mapped_ToAssignment_2 : ( ( ruleFQN ) ) ;
    public final void rule__FieldMapping__UI_Field_Mapped_ToAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:2839:1: ( ( ( ruleFQN ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:2840:1: ( ( ruleFQN ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:2840:1: ( ( ruleFQN ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:2841:1: ( ruleFQN )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldMappingAccess().getUI_Field_Mapped_ToAbstractFeatureCrossReference_2_0()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:2842:1: ( ruleFQN )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalVpui.g:2843:1: ruleFQN
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
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
 * Copyright (c) 2017 Thales Global Services S.A.S.
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
public class InternalVpuiParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'text'", "'textarea'", "'checkbox'", "'radiobox'", "'simpleChoiceList'", "'multipleChoiceList'", "'richtext'", "'import'", "'UIDescription'", "'{'", "'}'", "'UI'", "'label:'", "'Container'", "'description:'", "'for'", "'Field'", "','", "'type'", "'mapped-to'", "'.'"
    };
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalVpuiParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalVpuiParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalVpuiParser.tokenNames; }
    public String getGrammarFileName() { return "InternalVpui.g"; }


     
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
    // InternalVpui.g:68:1: entryRuleUserInterface : ruleUserInterface EOF ;
    public final void entryRuleUserInterface() throws RecognitionException {
        try {
            // InternalVpui.g:69:1: ( ruleUserInterface EOF )
            // InternalVpui.g:70:1: ruleUserInterface EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUserInterfaceRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleUserInterface();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getUserInterfaceRule()); 
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
    // $ANTLR end "entryRuleUserInterface"


    // $ANTLR start "ruleUserInterface"
    // InternalVpui.g:77:1: ruleUserInterface : ( ( rule__UserInterface__Group__0 ) ) ;
    public final void ruleUserInterface() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVpui.g:81:2: ( ( ( rule__UserInterface__Group__0 ) ) )
            // InternalVpui.g:82:1: ( ( rule__UserInterface__Group__0 ) )
            {
            // InternalVpui.g:82:1: ( ( rule__UserInterface__Group__0 ) )
            // InternalVpui.g:83:1: ( rule__UserInterface__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUserInterfaceAccess().getGroup()); 
            }
            // InternalVpui.g:84:1: ( rule__UserInterface__Group__0 )
            // InternalVpui.g:84:2: rule__UserInterface__Group__0
            {
            pushFollow(FOLLOW_2);
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
    // InternalVpui.g:96:1: entryRuleImport : ruleImport EOF ;
    public final void entryRuleImport() throws RecognitionException {
        try {
            // InternalVpui.g:97:1: ( ruleImport EOF )
            // InternalVpui.g:98:1: ruleImport EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImportRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleImport();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getImportRule()); 
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
    // $ANTLR end "entryRuleImport"


    // $ANTLR start "ruleImport"
    // InternalVpui.g:105:1: ruleImport : ( ( rule__Import__Group__0 ) ) ;
    public final void ruleImport() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVpui.g:109:2: ( ( ( rule__Import__Group__0 ) ) )
            // InternalVpui.g:110:1: ( ( rule__Import__Group__0 ) )
            {
            // InternalVpui.g:110:1: ( ( rule__Import__Group__0 ) )
            // InternalVpui.g:111:1: ( rule__Import__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImportAccess().getGroup()); 
            }
            // InternalVpui.g:112:1: ( rule__Import__Group__0 )
            // InternalVpui.g:112:2: rule__Import__Group__0
            {
            pushFollow(FOLLOW_2);
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
    // InternalVpui.g:124:1: entryRuleAspect : ruleAspect EOF ;
    public final void entryRuleAspect() throws RecognitionException {
        try {
            // InternalVpui.g:125:1: ( ruleAspect EOF )
            // InternalVpui.g:126:1: ruleAspect EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAspectRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleAspect();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAspectRule()); 
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
    // $ANTLR end "entryRuleAspect"


    // $ANTLR start "ruleAspect"
    // InternalVpui.g:133:1: ruleAspect : ( ruleUIDescription ) ;
    public final void ruleAspect() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVpui.g:137:2: ( ( ruleUIDescription ) )
            // InternalVpui.g:138:1: ( ruleUIDescription )
            {
            // InternalVpui.g:138:1: ( ruleUIDescription )
            // InternalVpui.g:139:1: ruleUIDescription
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAspectAccess().getUIDescriptionParserRuleCall()); 
            }
            pushFollow(FOLLOW_2);
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
    // InternalVpui.g:152:1: entryRuleUIDescription : ruleUIDescription EOF ;
    public final void entryRuleUIDescription() throws RecognitionException {
        try {
            // InternalVpui.g:153:1: ( ruleUIDescription EOF )
            // InternalVpui.g:154:1: ruleUIDescription EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUIDescriptionRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleUIDescription();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getUIDescriptionRule()); 
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
    // $ANTLR end "entryRuleUIDescription"


    // $ANTLR start "ruleUIDescription"
    // InternalVpui.g:161:1: ruleUIDescription : ( ( rule__UIDescription__Group__0 ) ) ;
    public final void ruleUIDescription() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVpui.g:165:2: ( ( ( rule__UIDescription__Group__0 ) ) )
            // InternalVpui.g:166:1: ( ( rule__UIDescription__Group__0 ) )
            {
            // InternalVpui.g:166:1: ( ( rule__UIDescription__Group__0 ) )
            // InternalVpui.g:167:1: ( rule__UIDescription__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUIDescriptionAccess().getGroup()); 
            }
            // InternalVpui.g:168:1: ( rule__UIDescription__Group__0 )
            // InternalVpui.g:168:2: rule__UIDescription__Group__0
            {
            pushFollow(FOLLOW_2);
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
    // InternalVpui.g:182:1: entryRuleUI : ruleUI EOF ;
    public final void entryRuleUI() throws RecognitionException {
        try {
            // InternalVpui.g:183:1: ( ruleUI EOF )
            // InternalVpui.g:184:1: ruleUI EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUIRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleUI();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getUIRule()); 
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
    // $ANTLR end "entryRuleUI"


    // $ANTLR start "ruleUI"
    // InternalVpui.g:191:1: ruleUI : ( ( rule__UI__Group__0 ) ) ;
    public final void ruleUI() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVpui.g:195:2: ( ( ( rule__UI__Group__0 ) ) )
            // InternalVpui.g:196:1: ( ( rule__UI__Group__0 ) )
            {
            // InternalVpui.g:196:1: ( ( rule__UI__Group__0 ) )
            // InternalVpui.g:197:1: ( rule__UI__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUIAccess().getGroup()); 
            }
            // InternalVpui.g:198:1: ( rule__UI__Group__0 )
            // InternalVpui.g:198:2: rule__UI__Group__0
            {
            pushFollow(FOLLOW_2);
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
    // InternalVpui.g:210:1: entryRuleUIContainer : ruleUIContainer EOF ;
    public final void entryRuleUIContainer() throws RecognitionException {
        try {
            // InternalVpui.g:211:1: ( ruleUIContainer EOF )
            // InternalVpui.g:212:1: ruleUIContainer EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUIContainerRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleUIContainer();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getUIContainerRule()); 
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
    // $ANTLR end "entryRuleUIContainer"


    // $ANTLR start "ruleUIContainer"
    // InternalVpui.g:219:1: ruleUIContainer : ( ( rule__UIContainer__Group__0 ) ) ;
    public final void ruleUIContainer() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVpui.g:223:2: ( ( ( rule__UIContainer__Group__0 ) ) )
            // InternalVpui.g:224:1: ( ( rule__UIContainer__Group__0 ) )
            {
            // InternalVpui.g:224:1: ( ( rule__UIContainer__Group__0 ) )
            // InternalVpui.g:225:1: ( rule__UIContainer__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUIContainerAccess().getGroup()); 
            }
            // InternalVpui.g:226:1: ( rule__UIContainer__Group__0 )
            // InternalVpui.g:226:2: rule__UIContainer__Group__0
            {
            pushFollow(FOLLOW_2);
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
    // InternalVpui.g:238:1: entryRuleDataSource : ruleDataSource EOF ;
    public final void entryRuleDataSource() throws RecognitionException {
        try {
            // InternalVpui.g:239:1: ( ruleDataSource EOF )
            // InternalVpui.g:240:1: ruleDataSource EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDataSourceRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleDataSource();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDataSourceRule()); 
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
    // $ANTLR end "entryRuleDataSource"


    // $ANTLR start "ruleDataSource"
    // InternalVpui.g:247:1: ruleDataSource : ( ruleLocalClass ) ;
    public final void ruleDataSource() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVpui.g:251:2: ( ( ruleLocalClass ) )
            // InternalVpui.g:252:1: ( ruleLocalClass )
            {
            // InternalVpui.g:252:1: ( ruleLocalClass )
            // InternalVpui.g:253:1: ruleLocalClass
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDataSourceAccess().getLocalClassParserRuleCall()); 
            }
            pushFollow(FOLLOW_2);
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
    // InternalVpui.g:266:1: entryRuleLocalClass : ruleLocalClass EOF ;
    public final void entryRuleLocalClass() throws RecognitionException {
        try {
            // InternalVpui.g:267:1: ( ruleLocalClass EOF )
            // InternalVpui.g:268:1: ruleLocalClass EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLocalClassRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleLocalClass();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLocalClassRule()); 
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
    // $ANTLR end "entryRuleLocalClass"


    // $ANTLR start "ruleLocalClass"
    // InternalVpui.g:275:1: ruleLocalClass : ( ( rule__LocalClass__Group__0 ) ) ;
    public final void ruleLocalClass() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVpui.g:279:2: ( ( ( rule__LocalClass__Group__0 ) ) )
            // InternalVpui.g:280:1: ( ( rule__LocalClass__Group__0 ) )
            {
            // InternalVpui.g:280:1: ( ( rule__LocalClass__Group__0 ) )
            // InternalVpui.g:281:1: ( rule__LocalClass__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLocalClassAccess().getGroup()); 
            }
            // InternalVpui.g:282:1: ( rule__LocalClass__Group__0 )
            // InternalVpui.g:282:2: rule__LocalClass__Group__0
            {
            pushFollow(FOLLOW_2);
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
    // InternalVpui.g:294:1: entryRuleUIField : ruleUIField EOF ;
    public final void entryRuleUIField() throws RecognitionException {
        try {
            // InternalVpui.g:295:1: ( ruleUIField EOF )
            // InternalVpui.g:296:1: ruleUIField EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUIFieldRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleUIField();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getUIFieldRule()); 
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
    // $ANTLR end "entryRuleUIField"


    // $ANTLR start "ruleUIField"
    // InternalVpui.g:303:1: ruleUIField : ( ( rule__UIField__Group__0 ) ) ;
    public final void ruleUIField() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVpui.g:307:2: ( ( ( rule__UIField__Group__0 ) ) )
            // InternalVpui.g:308:1: ( ( rule__UIField__Group__0 ) )
            {
            // InternalVpui.g:308:1: ( ( rule__UIField__Group__0 ) )
            // InternalVpui.g:309:1: ( rule__UIField__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUIFieldAccess().getGroup()); 
            }
            // InternalVpui.g:310:1: ( rule__UIField__Group__0 )
            // InternalVpui.g:310:2: rule__UIField__Group__0
            {
            pushFollow(FOLLOW_2);
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
    // InternalVpui.g:322:1: entryRuleFieldMapping : ruleFieldMapping EOF ;
    public final void entryRuleFieldMapping() throws RecognitionException {
        try {
            // InternalVpui.g:323:1: ( ruleFieldMapping EOF )
            // InternalVpui.g:324:1: ruleFieldMapping EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldMappingRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleFieldMapping();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFieldMappingRule()); 
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
    // $ANTLR end "entryRuleFieldMapping"


    // $ANTLR start "ruleFieldMapping"
    // InternalVpui.g:331:1: ruleFieldMapping : ( ( rule__FieldMapping__Group__0 ) ) ;
    public final void ruleFieldMapping() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVpui.g:335:2: ( ( ( rule__FieldMapping__Group__0 ) ) )
            // InternalVpui.g:336:1: ( ( rule__FieldMapping__Group__0 ) )
            {
            // InternalVpui.g:336:1: ( ( rule__FieldMapping__Group__0 ) )
            // InternalVpui.g:337:1: ( rule__FieldMapping__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldMappingAccess().getGroup()); 
            }
            // InternalVpui.g:338:1: ( rule__FieldMapping__Group__0 )
            // InternalVpui.g:338:2: rule__FieldMapping__Group__0
            {
            pushFollow(FOLLOW_2);
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
    // InternalVpui.g:350:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // InternalVpui.g:351:1: ( ruleEString EOF )
            // InternalVpui.g:352:1: ruleEString EOF
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
    // InternalVpui.g:359:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVpui.g:363:2: ( ( ( rule__EString__Alternatives ) ) )
            // InternalVpui.g:364:1: ( ( rule__EString__Alternatives ) )
            {
            // InternalVpui.g:364:1: ( ( rule__EString__Alternatives ) )
            // InternalVpui.g:365:1: ( rule__EString__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEStringAccess().getAlternatives()); 
            }
            // InternalVpui.g:366:1: ( rule__EString__Alternatives )
            // InternalVpui.g:366:2: rule__EString__Alternatives
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
    // InternalVpui.g:378:1: entryRuleFQN : ruleFQN EOF ;
    public final void entryRuleFQN() throws RecognitionException {
        try {
            // InternalVpui.g:379:1: ( ruleFQN EOF )
            // InternalVpui.g:380:1: ruleFQN EOF
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
    // InternalVpui.g:387:1: ruleFQN : ( ( rule__FQN__Group__0 ) ) ;
    public final void ruleFQN() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVpui.g:391:2: ( ( ( rule__FQN__Group__0 ) ) )
            // InternalVpui.g:392:1: ( ( rule__FQN__Group__0 ) )
            {
            // InternalVpui.g:392:1: ( ( rule__FQN__Group__0 ) )
            // InternalVpui.g:393:1: ( rule__FQN__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFQNAccess().getGroup()); 
            }
            // InternalVpui.g:394:1: ( rule__FQN__Group__0 )
            // InternalVpui.g:394:2: rule__FQN__Group__0
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


    // $ANTLR start "ruleUI_Field_Type"
    // InternalVpui.g:411:1: ruleUI_Field_Type : ( ( rule__UI_Field_Type__Alternatives ) ) ;
    public final void ruleUI_Field_Type() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVpui.g:415:1: ( ( ( rule__UI_Field_Type__Alternatives ) ) )
            // InternalVpui.g:416:1: ( ( rule__UI_Field_Type__Alternatives ) )
            {
            // InternalVpui.g:416:1: ( ( rule__UI_Field_Type__Alternatives ) )
            // InternalVpui.g:417:1: ( rule__UI_Field_Type__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUI_Field_TypeAccess().getAlternatives()); 
            }
            // InternalVpui.g:418:1: ( rule__UI_Field_Type__Alternatives )
            // InternalVpui.g:418:2: rule__UI_Field_Type__Alternatives
            {
            pushFollow(FOLLOW_2);
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
    // InternalVpui.g:430:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVpui.g:434:1: ( ( RULE_STRING ) | ( RULE_ID ) )
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
                    // InternalVpui.g:435:1: ( RULE_STRING )
                    {
                    // InternalVpui.g:435:1: ( RULE_STRING )
                    // InternalVpui.g:436:1: RULE_STRING
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
                    // InternalVpui.g:441:6: ( RULE_ID )
                    {
                    // InternalVpui.g:441:6: ( RULE_ID )
                    // InternalVpui.g:442:1: RULE_ID
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


    // $ANTLR start "rule__UI_Field_Type__Alternatives"
    // InternalVpui.g:453:1: rule__UI_Field_Type__Alternatives : ( ( ( 'text' ) ) | ( ( 'textarea' ) ) | ( ( 'checkbox' ) ) | ( ( 'radiobox' ) ) | ( ( 'simpleChoiceList' ) ) | ( ( 'multipleChoiceList' ) ) | ( ( 'richtext' ) ) );
    public final void rule__UI_Field_Type__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVpui.g:457:1: ( ( ( 'text' ) ) | ( ( 'textarea' ) ) | ( ( 'checkbox' ) ) | ( ( 'radiobox' ) ) | ( ( 'simpleChoiceList' ) ) | ( ( 'multipleChoiceList' ) ) | ( ( 'richtext' ) ) )
            int alt2=7;
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
            case 17:
                {
                alt2=7;
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
                    // InternalVpui.g:458:1: ( ( 'text' ) )
                    {
                    // InternalVpui.g:458:1: ( ( 'text' ) )
                    // InternalVpui.g:459:1: ( 'text' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getUI_Field_TypeAccess().getTextEnumLiteralDeclaration_0()); 
                    }
                    // InternalVpui.g:460:1: ( 'text' )
                    // InternalVpui.g:460:3: 'text'
                    {
                    match(input,11,FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getUI_Field_TypeAccess().getTextEnumLiteralDeclaration_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalVpui.g:465:6: ( ( 'textarea' ) )
                    {
                    // InternalVpui.g:465:6: ( ( 'textarea' ) )
                    // InternalVpui.g:466:1: ( 'textarea' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getUI_Field_TypeAccess().getTextareaEnumLiteralDeclaration_1()); 
                    }
                    // InternalVpui.g:467:1: ( 'textarea' )
                    // InternalVpui.g:467:3: 'textarea'
                    {
                    match(input,12,FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getUI_Field_TypeAccess().getTextareaEnumLiteralDeclaration_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalVpui.g:472:6: ( ( 'checkbox' ) )
                    {
                    // InternalVpui.g:472:6: ( ( 'checkbox' ) )
                    // InternalVpui.g:473:1: ( 'checkbox' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getUI_Field_TypeAccess().getCheckboxEnumLiteralDeclaration_2()); 
                    }
                    // InternalVpui.g:474:1: ( 'checkbox' )
                    // InternalVpui.g:474:3: 'checkbox'
                    {
                    match(input,13,FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getUI_Field_TypeAccess().getCheckboxEnumLiteralDeclaration_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalVpui.g:479:6: ( ( 'radiobox' ) )
                    {
                    // InternalVpui.g:479:6: ( ( 'radiobox' ) )
                    // InternalVpui.g:480:1: ( 'radiobox' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getUI_Field_TypeAccess().getRadioboxEnumLiteralDeclaration_3()); 
                    }
                    // InternalVpui.g:481:1: ( 'radiobox' )
                    // InternalVpui.g:481:3: 'radiobox'
                    {
                    match(input,14,FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getUI_Field_TypeAccess().getRadioboxEnumLiteralDeclaration_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalVpui.g:486:6: ( ( 'simpleChoiceList' ) )
                    {
                    // InternalVpui.g:486:6: ( ( 'simpleChoiceList' ) )
                    // InternalVpui.g:487:1: ( 'simpleChoiceList' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getUI_Field_TypeAccess().getSimpleChoiceListEnumLiteralDeclaration_4()); 
                    }
                    // InternalVpui.g:488:1: ( 'simpleChoiceList' )
                    // InternalVpui.g:488:3: 'simpleChoiceList'
                    {
                    match(input,15,FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getUI_Field_TypeAccess().getSimpleChoiceListEnumLiteralDeclaration_4()); 
                    }

                    }


                    }
                    break;
                case 6 :
                    // InternalVpui.g:493:6: ( ( 'multipleChoiceList' ) )
                    {
                    // InternalVpui.g:493:6: ( ( 'multipleChoiceList' ) )
                    // InternalVpui.g:494:1: ( 'multipleChoiceList' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getUI_Field_TypeAccess().getMultipleChoiceListEnumLiteralDeclaration_5()); 
                    }
                    // InternalVpui.g:495:1: ( 'multipleChoiceList' )
                    // InternalVpui.g:495:3: 'multipleChoiceList'
                    {
                    match(input,16,FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getUI_Field_TypeAccess().getMultipleChoiceListEnumLiteralDeclaration_5()); 
                    }

                    }


                    }
                    break;
                case 7 :
                    // InternalVpui.g:500:6: ( ( 'richtext' ) )
                    {
                    // InternalVpui.g:500:6: ( ( 'richtext' ) )
                    // InternalVpui.g:501:1: ( 'richtext' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getUI_Field_TypeAccess().getRichtextEnumLiteralDeclaration_6()); 
                    }
                    // InternalVpui.g:502:1: ( 'richtext' )
                    // InternalVpui.g:502:3: 'richtext'
                    {
                    match(input,17,FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getUI_Field_TypeAccess().getRichtextEnumLiteralDeclaration_6()); 
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
    // InternalVpui.g:514:1: rule__UserInterface__Group__0 : rule__UserInterface__Group__0__Impl rule__UserInterface__Group__1 ;
    public final void rule__UserInterface__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVpui.g:518:1: ( rule__UserInterface__Group__0__Impl rule__UserInterface__Group__1 )
            // InternalVpui.g:519:2: rule__UserInterface__Group__0__Impl rule__UserInterface__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__UserInterface__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
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
    // InternalVpui.g:526:1: rule__UserInterface__Group__0__Impl : ( () ) ;
    public final void rule__UserInterface__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVpui.g:530:1: ( ( () ) )
            // InternalVpui.g:531:1: ( () )
            {
            // InternalVpui.g:531:1: ( () )
            // InternalVpui.g:532:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUserInterfaceAccess().getUserInterfaceAction_0()); 
            }
            // InternalVpui.g:533:1: ()
            // InternalVpui.g:535:1: 
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
    // InternalVpui.g:545:1: rule__UserInterface__Group__1 : rule__UserInterface__Group__1__Impl rule__UserInterface__Group__2 ;
    public final void rule__UserInterface__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVpui.g:549:1: ( rule__UserInterface__Group__1__Impl rule__UserInterface__Group__2 )
            // InternalVpui.g:550:2: rule__UserInterface__Group__1__Impl rule__UserInterface__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__UserInterface__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
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
    // InternalVpui.g:557:1: rule__UserInterface__Group__1__Impl : ( ( rule__UserInterface__ImportsAssignment_1 )* ) ;
    public final void rule__UserInterface__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVpui.g:561:1: ( ( ( rule__UserInterface__ImportsAssignment_1 )* ) )
            // InternalVpui.g:562:1: ( ( rule__UserInterface__ImportsAssignment_1 )* )
            {
            // InternalVpui.g:562:1: ( ( rule__UserInterface__ImportsAssignment_1 )* )
            // InternalVpui.g:563:1: ( rule__UserInterface__ImportsAssignment_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUserInterfaceAccess().getImportsAssignment_1()); 
            }
            // InternalVpui.g:564:1: ( rule__UserInterface__ImportsAssignment_1 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==18) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalVpui.g:564:2: rule__UserInterface__ImportsAssignment_1
            	    {
            	    pushFollow(FOLLOW_4);
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
    // InternalVpui.g:574:1: rule__UserInterface__Group__2 : rule__UserInterface__Group__2__Impl ;
    public final void rule__UserInterface__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVpui.g:578:1: ( rule__UserInterface__Group__2__Impl )
            // InternalVpui.g:579:2: rule__UserInterface__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
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
    // InternalVpui.g:585:1: rule__UserInterface__Group__2__Impl : ( ( rule__UserInterface__UiDescriptionAssignment_2 ) ) ;
    public final void rule__UserInterface__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVpui.g:589:1: ( ( ( rule__UserInterface__UiDescriptionAssignment_2 ) ) )
            // InternalVpui.g:590:1: ( ( rule__UserInterface__UiDescriptionAssignment_2 ) )
            {
            // InternalVpui.g:590:1: ( ( rule__UserInterface__UiDescriptionAssignment_2 ) )
            // InternalVpui.g:591:1: ( rule__UserInterface__UiDescriptionAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUserInterfaceAccess().getUiDescriptionAssignment_2()); 
            }
            // InternalVpui.g:592:1: ( rule__UserInterface__UiDescriptionAssignment_2 )
            // InternalVpui.g:592:2: rule__UserInterface__UiDescriptionAssignment_2
            {
            pushFollow(FOLLOW_2);
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
    // InternalVpui.g:608:1: rule__Import__Group__0 : rule__Import__Group__0__Impl rule__Import__Group__1 ;
    public final void rule__Import__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVpui.g:612:1: ( rule__Import__Group__0__Impl rule__Import__Group__1 )
            // InternalVpui.g:613:2: rule__Import__Group__0__Impl rule__Import__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__Import__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
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
    // InternalVpui.g:620:1: rule__Import__Group__0__Impl : ( 'import' ) ;
    public final void rule__Import__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVpui.g:624:1: ( ( 'import' ) )
            // InternalVpui.g:625:1: ( 'import' )
            {
            // InternalVpui.g:625:1: ( 'import' )
            // InternalVpui.g:626:1: 'import'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImportAccess().getImportKeyword_0()); 
            }
            match(input,18,FOLLOW_2); if (state.failed) return ;
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
    // InternalVpui.g:639:1: rule__Import__Group__1 : rule__Import__Group__1__Impl ;
    public final void rule__Import__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVpui.g:643:1: ( rule__Import__Group__1__Impl )
            // InternalVpui.g:644:2: rule__Import__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
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
    // InternalVpui.g:650:1: rule__Import__Group__1__Impl : ( ( rule__Import__ImportedNamespaceAssignment_1 ) ) ;
    public final void rule__Import__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVpui.g:654:1: ( ( ( rule__Import__ImportedNamespaceAssignment_1 ) ) )
            // InternalVpui.g:655:1: ( ( rule__Import__ImportedNamespaceAssignment_1 ) )
            {
            // InternalVpui.g:655:1: ( ( rule__Import__ImportedNamespaceAssignment_1 ) )
            // InternalVpui.g:656:1: ( rule__Import__ImportedNamespaceAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImportAccess().getImportedNamespaceAssignment_1()); 
            }
            // InternalVpui.g:657:1: ( rule__Import__ImportedNamespaceAssignment_1 )
            // InternalVpui.g:657:2: rule__Import__ImportedNamespaceAssignment_1
            {
            pushFollow(FOLLOW_2);
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
    // InternalVpui.g:671:1: rule__UIDescription__Group__0 : rule__UIDescription__Group__0__Impl rule__UIDescription__Group__1 ;
    public final void rule__UIDescription__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVpui.g:675:1: ( rule__UIDescription__Group__0__Impl rule__UIDescription__Group__1 )
            // InternalVpui.g:676:2: rule__UIDescription__Group__0__Impl rule__UIDescription__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__UIDescription__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
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
    // InternalVpui.g:683:1: rule__UIDescription__Group__0__Impl : ( () ) ;
    public final void rule__UIDescription__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVpui.g:687:1: ( ( () ) )
            // InternalVpui.g:688:1: ( () )
            {
            // InternalVpui.g:688:1: ( () )
            // InternalVpui.g:689:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUIDescriptionAccess().getUIDescriptionAction_0()); 
            }
            // InternalVpui.g:690:1: ()
            // InternalVpui.g:692:1: 
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
    // InternalVpui.g:702:1: rule__UIDescription__Group__1 : rule__UIDescription__Group__1__Impl rule__UIDescription__Group__2 ;
    public final void rule__UIDescription__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVpui.g:706:1: ( rule__UIDescription__Group__1__Impl rule__UIDescription__Group__2 )
            // InternalVpui.g:707:2: rule__UIDescription__Group__1__Impl rule__UIDescription__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__UIDescription__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
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
    // InternalVpui.g:714:1: rule__UIDescription__Group__1__Impl : ( 'UIDescription' ) ;
    public final void rule__UIDescription__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVpui.g:718:1: ( ( 'UIDescription' ) )
            // InternalVpui.g:719:1: ( 'UIDescription' )
            {
            // InternalVpui.g:719:1: ( 'UIDescription' )
            // InternalVpui.g:720:1: 'UIDescription'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUIDescriptionAccess().getUIDescriptionKeyword_1()); 
            }
            match(input,19,FOLLOW_2); if (state.failed) return ;
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
    // InternalVpui.g:733:1: rule__UIDescription__Group__2 : rule__UIDescription__Group__2__Impl rule__UIDescription__Group__3 ;
    public final void rule__UIDescription__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVpui.g:737:1: ( rule__UIDescription__Group__2__Impl rule__UIDescription__Group__3 )
            // InternalVpui.g:738:2: rule__UIDescription__Group__2__Impl rule__UIDescription__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__UIDescription__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
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
    // InternalVpui.g:745:1: rule__UIDescription__Group__2__Impl : ( ( rule__UIDescription__NameAssignment_2 ) ) ;
    public final void rule__UIDescription__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVpui.g:749:1: ( ( ( rule__UIDescription__NameAssignment_2 ) ) )
            // InternalVpui.g:750:1: ( ( rule__UIDescription__NameAssignment_2 ) )
            {
            // InternalVpui.g:750:1: ( ( rule__UIDescription__NameAssignment_2 ) )
            // InternalVpui.g:751:1: ( rule__UIDescription__NameAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUIDescriptionAccess().getNameAssignment_2()); 
            }
            // InternalVpui.g:752:1: ( rule__UIDescription__NameAssignment_2 )
            // InternalVpui.g:752:2: rule__UIDescription__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
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
    // InternalVpui.g:762:1: rule__UIDescription__Group__3 : rule__UIDescription__Group__3__Impl rule__UIDescription__Group__4 ;
    public final void rule__UIDescription__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVpui.g:766:1: ( rule__UIDescription__Group__3__Impl rule__UIDescription__Group__4 )
            // InternalVpui.g:767:2: rule__UIDescription__Group__3__Impl rule__UIDescription__Group__4
            {
            pushFollow(FOLLOW_7);
            rule__UIDescription__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
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
    // InternalVpui.g:774:1: rule__UIDescription__Group__3__Impl : ( '{' ) ;
    public final void rule__UIDescription__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVpui.g:778:1: ( ( '{' ) )
            // InternalVpui.g:779:1: ( '{' )
            {
            // InternalVpui.g:779:1: ( '{' )
            // InternalVpui.g:780:1: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUIDescriptionAccess().getLeftCurlyBracketKeyword_3()); 
            }
            match(input,20,FOLLOW_2); if (state.failed) return ;
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
    // InternalVpui.g:793:1: rule__UIDescription__Group__4 : rule__UIDescription__Group__4__Impl rule__UIDescription__Group__5 ;
    public final void rule__UIDescription__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVpui.g:797:1: ( rule__UIDescription__Group__4__Impl rule__UIDescription__Group__5 )
            // InternalVpui.g:798:2: rule__UIDescription__Group__4__Impl rule__UIDescription__Group__5
            {
            pushFollow(FOLLOW_7);
            rule__UIDescription__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
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
    // InternalVpui.g:805:1: rule__UIDescription__Group__4__Impl : ( ( rule__UIDescription__UIsAssignment_4 )* ) ;
    public final void rule__UIDescription__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVpui.g:809:1: ( ( ( rule__UIDescription__UIsAssignment_4 )* ) )
            // InternalVpui.g:810:1: ( ( rule__UIDescription__UIsAssignment_4 )* )
            {
            // InternalVpui.g:810:1: ( ( rule__UIDescription__UIsAssignment_4 )* )
            // InternalVpui.g:811:1: ( rule__UIDescription__UIsAssignment_4 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUIDescriptionAccess().getUIsAssignment_4()); 
            }
            // InternalVpui.g:812:1: ( rule__UIDescription__UIsAssignment_4 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==22) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalVpui.g:812:2: rule__UIDescription__UIsAssignment_4
            	    {
            	    pushFollow(FOLLOW_8);
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
    // InternalVpui.g:822:1: rule__UIDescription__Group__5 : rule__UIDescription__Group__5__Impl ;
    public final void rule__UIDescription__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVpui.g:826:1: ( rule__UIDescription__Group__5__Impl )
            // InternalVpui.g:827:2: rule__UIDescription__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
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
    // InternalVpui.g:833:1: rule__UIDescription__Group__5__Impl : ( '}' ) ;
    public final void rule__UIDescription__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVpui.g:837:1: ( ( '}' ) )
            // InternalVpui.g:838:1: ( '}' )
            {
            // InternalVpui.g:838:1: ( '}' )
            // InternalVpui.g:839:1: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUIDescriptionAccess().getRightCurlyBracketKeyword_5()); 
            }
            match(input,21,FOLLOW_2); if (state.failed) return ;
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
    // InternalVpui.g:864:1: rule__UI__Group__0 : rule__UI__Group__0__Impl rule__UI__Group__1 ;
    public final void rule__UI__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVpui.g:868:1: ( rule__UI__Group__0__Impl rule__UI__Group__1 )
            // InternalVpui.g:869:2: rule__UI__Group__0__Impl rule__UI__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__UI__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
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
    // InternalVpui.g:876:1: rule__UI__Group__0__Impl : ( () ) ;
    public final void rule__UI__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVpui.g:880:1: ( ( () ) )
            // InternalVpui.g:881:1: ( () )
            {
            // InternalVpui.g:881:1: ( () )
            // InternalVpui.g:882:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUIAccess().getUIAction_0()); 
            }
            // InternalVpui.g:883:1: ()
            // InternalVpui.g:885:1: 
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
    // InternalVpui.g:895:1: rule__UI__Group__1 : rule__UI__Group__1__Impl rule__UI__Group__2 ;
    public final void rule__UI__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVpui.g:899:1: ( rule__UI__Group__1__Impl rule__UI__Group__2 )
            // InternalVpui.g:900:2: rule__UI__Group__1__Impl rule__UI__Group__2
            {
            pushFollow(FOLLOW_10);
            rule__UI__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
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
    // InternalVpui.g:907:1: rule__UI__Group__1__Impl : ( 'UI' ) ;
    public final void rule__UI__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVpui.g:911:1: ( ( 'UI' ) )
            // InternalVpui.g:912:1: ( 'UI' )
            {
            // InternalVpui.g:912:1: ( 'UI' )
            // InternalVpui.g:913:1: 'UI'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUIAccess().getUIKeyword_1()); 
            }
            match(input,22,FOLLOW_2); if (state.failed) return ;
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
    // InternalVpui.g:926:1: rule__UI__Group__2 : rule__UI__Group__2__Impl rule__UI__Group__3 ;
    public final void rule__UI__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVpui.g:930:1: ( rule__UI__Group__2__Impl rule__UI__Group__3 )
            // InternalVpui.g:931:2: rule__UI__Group__2__Impl rule__UI__Group__3
            {
            pushFollow(FOLLOW_10);
            rule__UI__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
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
    // InternalVpui.g:938:1: rule__UI__Group__2__Impl : ( ( rule__UI__NameAssignment_2 )? ) ;
    public final void rule__UI__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVpui.g:942:1: ( ( ( rule__UI__NameAssignment_2 )? ) )
            // InternalVpui.g:943:1: ( ( rule__UI__NameAssignment_2 )? )
            {
            // InternalVpui.g:943:1: ( ( rule__UI__NameAssignment_2 )? )
            // InternalVpui.g:944:1: ( rule__UI__NameAssignment_2 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUIAccess().getNameAssignment_2()); 
            }
            // InternalVpui.g:945:1: ( rule__UI__NameAssignment_2 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( ((LA5_0>=RULE_STRING && LA5_0<=RULE_ID)) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalVpui.g:945:2: rule__UI__NameAssignment_2
                    {
                    pushFollow(FOLLOW_2);
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
    // InternalVpui.g:955:1: rule__UI__Group__3 : rule__UI__Group__3__Impl rule__UI__Group__4 ;
    public final void rule__UI__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVpui.g:959:1: ( rule__UI__Group__3__Impl rule__UI__Group__4 )
            // InternalVpui.g:960:2: rule__UI__Group__3__Impl rule__UI__Group__4
            {
            pushFollow(FOLLOW_10);
            rule__UI__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
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
    // InternalVpui.g:967:1: rule__UI__Group__3__Impl : ( ( rule__UI__UI_DataSourceAssignment_3 )? ) ;
    public final void rule__UI__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVpui.g:971:1: ( ( ( rule__UI__UI_DataSourceAssignment_3 )? ) )
            // InternalVpui.g:972:1: ( ( rule__UI__UI_DataSourceAssignment_3 )? )
            {
            // InternalVpui.g:972:1: ( ( rule__UI__UI_DataSourceAssignment_3 )? )
            // InternalVpui.g:973:1: ( rule__UI__UI_DataSourceAssignment_3 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUIAccess().getUI_DataSourceAssignment_3()); 
            }
            // InternalVpui.g:974:1: ( rule__UI__UI_DataSourceAssignment_3 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==26) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalVpui.g:974:2: rule__UI__UI_DataSourceAssignment_3
                    {
                    pushFollow(FOLLOW_2);
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
    // InternalVpui.g:984:1: rule__UI__Group__4 : rule__UI__Group__4__Impl rule__UI__Group__5 ;
    public final void rule__UI__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVpui.g:988:1: ( rule__UI__Group__4__Impl rule__UI__Group__5 )
            // InternalVpui.g:989:2: rule__UI__Group__4__Impl rule__UI__Group__5
            {
            pushFollow(FOLLOW_11);
            rule__UI__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
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
    // InternalVpui.g:996:1: rule__UI__Group__4__Impl : ( '{' ) ;
    public final void rule__UI__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVpui.g:1000:1: ( ( '{' ) )
            // InternalVpui.g:1001:1: ( '{' )
            {
            // InternalVpui.g:1001:1: ( '{' )
            // InternalVpui.g:1002:1: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUIAccess().getLeftCurlyBracketKeyword_4()); 
            }
            match(input,20,FOLLOW_2); if (state.failed) return ;
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
    // InternalVpui.g:1015:1: rule__UI__Group__5 : rule__UI__Group__5__Impl rule__UI__Group__6 ;
    public final void rule__UI__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVpui.g:1019:1: ( rule__UI__Group__5__Impl rule__UI__Group__6 )
            // InternalVpui.g:1020:2: rule__UI__Group__5__Impl rule__UI__Group__6
            {
            pushFollow(FOLLOW_11);
            rule__UI__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
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
    // InternalVpui.g:1027:1: rule__UI__Group__5__Impl : ( ( rule__UI__Group_5__0 )? ) ;
    public final void rule__UI__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVpui.g:1031:1: ( ( ( rule__UI__Group_5__0 )? ) )
            // InternalVpui.g:1032:1: ( ( rule__UI__Group_5__0 )? )
            {
            // InternalVpui.g:1032:1: ( ( rule__UI__Group_5__0 )? )
            // InternalVpui.g:1033:1: ( rule__UI__Group_5__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUIAccess().getGroup_5()); 
            }
            // InternalVpui.g:1034:1: ( rule__UI__Group_5__0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==23) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalVpui.g:1034:2: rule__UI__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
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
    // InternalVpui.g:1044:1: rule__UI__Group__6 : rule__UI__Group__6__Impl rule__UI__Group__7 ;
    public final void rule__UI__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVpui.g:1048:1: ( rule__UI__Group__6__Impl rule__UI__Group__7 )
            // InternalVpui.g:1049:2: rule__UI__Group__6__Impl rule__UI__Group__7
            {
            pushFollow(FOLLOW_11);
            rule__UI__Group__6__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
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
    // InternalVpui.g:1056:1: rule__UI__Group__6__Impl : ( ( rule__UI__UI_ContainersAssignment_6 )* ) ;
    public final void rule__UI__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVpui.g:1060:1: ( ( ( rule__UI__UI_ContainersAssignment_6 )* ) )
            // InternalVpui.g:1061:1: ( ( rule__UI__UI_ContainersAssignment_6 )* )
            {
            // InternalVpui.g:1061:1: ( ( rule__UI__UI_ContainersAssignment_6 )* )
            // InternalVpui.g:1062:1: ( rule__UI__UI_ContainersAssignment_6 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUIAccess().getUI_ContainersAssignment_6()); 
            }
            // InternalVpui.g:1063:1: ( rule__UI__UI_ContainersAssignment_6 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==24) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalVpui.g:1063:2: rule__UI__UI_ContainersAssignment_6
            	    {
            	    pushFollow(FOLLOW_12);
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
    // InternalVpui.g:1073:1: rule__UI__Group__7 : rule__UI__Group__7__Impl ;
    public final void rule__UI__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVpui.g:1077:1: ( rule__UI__Group__7__Impl )
            // InternalVpui.g:1078:2: rule__UI__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
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
    // InternalVpui.g:1084:1: rule__UI__Group__7__Impl : ( '}' ) ;
    public final void rule__UI__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVpui.g:1088:1: ( ( '}' ) )
            // InternalVpui.g:1089:1: ( '}' )
            {
            // InternalVpui.g:1089:1: ( '}' )
            // InternalVpui.g:1090:1: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUIAccess().getRightCurlyBracketKeyword_7()); 
            }
            match(input,21,FOLLOW_2); if (state.failed) return ;
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
    // InternalVpui.g:1119:1: rule__UI__Group_5__0 : rule__UI__Group_5__0__Impl rule__UI__Group_5__1 ;
    public final void rule__UI__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVpui.g:1123:1: ( rule__UI__Group_5__0__Impl rule__UI__Group_5__1 )
            // InternalVpui.g:1124:2: rule__UI__Group_5__0__Impl rule__UI__Group_5__1
            {
            pushFollow(FOLLOW_13);
            rule__UI__Group_5__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
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
    // InternalVpui.g:1131:1: rule__UI__Group_5__0__Impl : ( 'label:' ) ;
    public final void rule__UI__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVpui.g:1135:1: ( ( 'label:' ) )
            // InternalVpui.g:1136:1: ( 'label:' )
            {
            // InternalVpui.g:1136:1: ( 'label:' )
            // InternalVpui.g:1137:1: 'label:'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUIAccess().getLabelKeyword_5_0()); 
            }
            match(input,23,FOLLOW_2); if (state.failed) return ;
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
    // InternalVpui.g:1150:1: rule__UI__Group_5__1 : rule__UI__Group_5__1__Impl ;
    public final void rule__UI__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVpui.g:1154:1: ( rule__UI__Group_5__1__Impl )
            // InternalVpui.g:1155:2: rule__UI__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
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
    // InternalVpui.g:1161:1: rule__UI__Group_5__1__Impl : ( ( rule__UI__LabelAssignment_5_1 ) ) ;
    public final void rule__UI__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVpui.g:1165:1: ( ( ( rule__UI__LabelAssignment_5_1 ) ) )
            // InternalVpui.g:1166:1: ( ( rule__UI__LabelAssignment_5_1 ) )
            {
            // InternalVpui.g:1166:1: ( ( rule__UI__LabelAssignment_5_1 ) )
            // InternalVpui.g:1167:1: ( rule__UI__LabelAssignment_5_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUIAccess().getLabelAssignment_5_1()); 
            }
            // InternalVpui.g:1168:1: ( rule__UI__LabelAssignment_5_1 )
            // InternalVpui.g:1168:2: rule__UI__LabelAssignment_5_1
            {
            pushFollow(FOLLOW_2);
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
    // InternalVpui.g:1182:1: rule__UIContainer__Group__0 : rule__UIContainer__Group__0__Impl rule__UIContainer__Group__1 ;
    public final void rule__UIContainer__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVpui.g:1186:1: ( rule__UIContainer__Group__0__Impl rule__UIContainer__Group__1 )
            // InternalVpui.g:1187:2: rule__UIContainer__Group__0__Impl rule__UIContainer__Group__1
            {
            pushFollow(FOLLOW_14);
            rule__UIContainer__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
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
    // InternalVpui.g:1194:1: rule__UIContainer__Group__0__Impl : ( () ) ;
    public final void rule__UIContainer__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVpui.g:1198:1: ( ( () ) )
            // InternalVpui.g:1199:1: ( () )
            {
            // InternalVpui.g:1199:1: ( () )
            // InternalVpui.g:1200:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUIContainerAccess().getUIContainerAction_0()); 
            }
            // InternalVpui.g:1201:1: ()
            // InternalVpui.g:1203:1: 
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
    // InternalVpui.g:1213:1: rule__UIContainer__Group__1 : rule__UIContainer__Group__1__Impl rule__UIContainer__Group__2 ;
    public final void rule__UIContainer__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVpui.g:1217:1: ( rule__UIContainer__Group__1__Impl rule__UIContainer__Group__2 )
            // InternalVpui.g:1218:2: rule__UIContainer__Group__1__Impl rule__UIContainer__Group__2
            {
            pushFollow(FOLLOW_15);
            rule__UIContainer__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
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
    // InternalVpui.g:1225:1: rule__UIContainer__Group__1__Impl : ( 'Container' ) ;
    public final void rule__UIContainer__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVpui.g:1229:1: ( ( 'Container' ) )
            // InternalVpui.g:1230:1: ( 'Container' )
            {
            // InternalVpui.g:1230:1: ( 'Container' )
            // InternalVpui.g:1231:1: 'Container'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUIContainerAccess().getContainerKeyword_1()); 
            }
            match(input,24,FOLLOW_2); if (state.failed) return ;
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
    // InternalVpui.g:1244:1: rule__UIContainer__Group__2 : rule__UIContainer__Group__2__Impl rule__UIContainer__Group__3 ;
    public final void rule__UIContainer__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVpui.g:1248:1: ( rule__UIContainer__Group__2__Impl rule__UIContainer__Group__3 )
            // InternalVpui.g:1249:2: rule__UIContainer__Group__2__Impl rule__UIContainer__Group__3
            {
            pushFollow(FOLLOW_15);
            rule__UIContainer__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
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
    // InternalVpui.g:1256:1: rule__UIContainer__Group__2__Impl : ( ( rule__UIContainer__NameAssignment_2 )? ) ;
    public final void rule__UIContainer__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVpui.g:1260:1: ( ( ( rule__UIContainer__NameAssignment_2 )? ) )
            // InternalVpui.g:1261:1: ( ( rule__UIContainer__NameAssignment_2 )? )
            {
            // InternalVpui.g:1261:1: ( ( rule__UIContainer__NameAssignment_2 )? )
            // InternalVpui.g:1262:1: ( rule__UIContainer__NameAssignment_2 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUIContainerAccess().getNameAssignment_2()); 
            }
            // InternalVpui.g:1263:1: ( rule__UIContainer__NameAssignment_2 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( ((LA9_0>=RULE_STRING && LA9_0<=RULE_ID)) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalVpui.g:1263:2: rule__UIContainer__NameAssignment_2
                    {
                    pushFollow(FOLLOW_2);
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
    // InternalVpui.g:1273:1: rule__UIContainer__Group__3 : rule__UIContainer__Group__3__Impl rule__UIContainer__Group__4 ;
    public final void rule__UIContainer__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVpui.g:1277:1: ( rule__UIContainer__Group__3__Impl rule__UIContainer__Group__4 )
            // InternalVpui.g:1278:2: rule__UIContainer__Group__3__Impl rule__UIContainer__Group__4
            {
            pushFollow(FOLLOW_16);
            rule__UIContainer__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
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
    // InternalVpui.g:1285:1: rule__UIContainer__Group__3__Impl : ( '{' ) ;
    public final void rule__UIContainer__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVpui.g:1289:1: ( ( '{' ) )
            // InternalVpui.g:1290:1: ( '{' )
            {
            // InternalVpui.g:1290:1: ( '{' )
            // InternalVpui.g:1291:1: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUIContainerAccess().getLeftCurlyBracketKeyword_3()); 
            }
            match(input,20,FOLLOW_2); if (state.failed) return ;
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
    // InternalVpui.g:1304:1: rule__UIContainer__Group__4 : rule__UIContainer__Group__4__Impl rule__UIContainer__Group__5 ;
    public final void rule__UIContainer__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVpui.g:1308:1: ( rule__UIContainer__Group__4__Impl rule__UIContainer__Group__5 )
            // InternalVpui.g:1309:2: rule__UIContainer__Group__4__Impl rule__UIContainer__Group__5
            {
            pushFollow(FOLLOW_16);
            rule__UIContainer__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
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
    // InternalVpui.g:1316:1: rule__UIContainer__Group__4__Impl : ( ( rule__UIContainer__Group_4__0 )? ) ;
    public final void rule__UIContainer__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVpui.g:1320:1: ( ( ( rule__UIContainer__Group_4__0 )? ) )
            // InternalVpui.g:1321:1: ( ( rule__UIContainer__Group_4__0 )? )
            {
            // InternalVpui.g:1321:1: ( ( rule__UIContainer__Group_4__0 )? )
            // InternalVpui.g:1322:1: ( rule__UIContainer__Group_4__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUIContainerAccess().getGroup_4()); 
            }
            // InternalVpui.g:1323:1: ( rule__UIContainer__Group_4__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==23) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalVpui.g:1323:2: rule__UIContainer__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
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
    // InternalVpui.g:1333:1: rule__UIContainer__Group__5 : rule__UIContainer__Group__5__Impl rule__UIContainer__Group__6 ;
    public final void rule__UIContainer__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVpui.g:1337:1: ( rule__UIContainer__Group__5__Impl rule__UIContainer__Group__6 )
            // InternalVpui.g:1338:2: rule__UIContainer__Group__5__Impl rule__UIContainer__Group__6
            {
            pushFollow(FOLLOW_16);
            rule__UIContainer__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
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
    // InternalVpui.g:1345:1: rule__UIContainer__Group__5__Impl : ( ( rule__UIContainer__Group_5__0 )? ) ;
    public final void rule__UIContainer__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVpui.g:1349:1: ( ( ( rule__UIContainer__Group_5__0 )? ) )
            // InternalVpui.g:1350:1: ( ( rule__UIContainer__Group_5__0 )? )
            {
            // InternalVpui.g:1350:1: ( ( rule__UIContainer__Group_5__0 )? )
            // InternalVpui.g:1351:1: ( rule__UIContainer__Group_5__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUIContainerAccess().getGroup_5()); 
            }
            // InternalVpui.g:1352:1: ( rule__UIContainer__Group_5__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==25) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalVpui.g:1352:2: rule__UIContainer__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
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
    // InternalVpui.g:1362:1: rule__UIContainer__Group__6 : rule__UIContainer__Group__6__Impl rule__UIContainer__Group__7 ;
    public final void rule__UIContainer__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVpui.g:1366:1: ( rule__UIContainer__Group__6__Impl rule__UIContainer__Group__7 )
            // InternalVpui.g:1367:2: rule__UIContainer__Group__6__Impl rule__UIContainer__Group__7
            {
            pushFollow(FOLLOW_16);
            rule__UIContainer__Group__6__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
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
    // InternalVpui.g:1374:1: rule__UIContainer__Group__6__Impl : ( ( rule__UIContainer__Group_6__0 )? ) ;
    public final void rule__UIContainer__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVpui.g:1378:1: ( ( ( rule__UIContainer__Group_6__0 )? ) )
            // InternalVpui.g:1379:1: ( ( rule__UIContainer__Group_6__0 )? )
            {
            // InternalVpui.g:1379:1: ( ( rule__UIContainer__Group_6__0 )? )
            // InternalVpui.g:1380:1: ( rule__UIContainer__Group_6__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUIContainerAccess().getGroup_6()); 
            }
            // InternalVpui.g:1381:1: ( rule__UIContainer__Group_6__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==27) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalVpui.g:1381:2: rule__UIContainer__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
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
    // InternalVpui.g:1391:1: rule__UIContainer__Group__7 : rule__UIContainer__Group__7__Impl rule__UIContainer__Group__8 ;
    public final void rule__UIContainer__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVpui.g:1395:1: ( rule__UIContainer__Group__7__Impl rule__UIContainer__Group__8 )
            // InternalVpui.g:1396:2: rule__UIContainer__Group__7__Impl rule__UIContainer__Group__8
            {
            pushFollow(FOLLOW_16);
            rule__UIContainer__Group__7__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
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
    // InternalVpui.g:1403:1: rule__UIContainer__Group__7__Impl : ( ( rule__UIContainer__Group_7__0 )? ) ;
    public final void rule__UIContainer__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVpui.g:1407:1: ( ( ( rule__UIContainer__Group_7__0 )? ) )
            // InternalVpui.g:1408:1: ( ( rule__UIContainer__Group_7__0 )? )
            {
            // InternalVpui.g:1408:1: ( ( rule__UIContainer__Group_7__0 )? )
            // InternalVpui.g:1409:1: ( rule__UIContainer__Group_7__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUIContainerAccess().getGroup_7()); 
            }
            // InternalVpui.g:1410:1: ( rule__UIContainer__Group_7__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==24) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalVpui.g:1410:2: rule__UIContainer__Group_7__0
                    {
                    pushFollow(FOLLOW_2);
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
    // InternalVpui.g:1420:1: rule__UIContainer__Group__8 : rule__UIContainer__Group__8__Impl ;
    public final void rule__UIContainer__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVpui.g:1424:1: ( rule__UIContainer__Group__8__Impl )
            // InternalVpui.g:1425:2: rule__UIContainer__Group__8__Impl
            {
            pushFollow(FOLLOW_2);
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
    // InternalVpui.g:1431:1: rule__UIContainer__Group__8__Impl : ( '}' ) ;
    public final void rule__UIContainer__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVpui.g:1435:1: ( ( '}' ) )
            // InternalVpui.g:1436:1: ( '}' )
            {
            // InternalVpui.g:1436:1: ( '}' )
            // InternalVpui.g:1437:1: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUIContainerAccess().getRightCurlyBracketKeyword_8()); 
            }
            match(input,21,FOLLOW_2); if (state.failed) return ;
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
    // InternalVpui.g:1468:1: rule__UIContainer__Group_4__0 : rule__UIContainer__Group_4__0__Impl rule__UIContainer__Group_4__1 ;
    public final void rule__UIContainer__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVpui.g:1472:1: ( rule__UIContainer__Group_4__0__Impl rule__UIContainer__Group_4__1 )
            // InternalVpui.g:1473:2: rule__UIContainer__Group_4__0__Impl rule__UIContainer__Group_4__1
            {
            pushFollow(FOLLOW_13);
            rule__UIContainer__Group_4__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
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
    // InternalVpui.g:1480:1: rule__UIContainer__Group_4__0__Impl : ( 'label:' ) ;
    public final void rule__UIContainer__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVpui.g:1484:1: ( ( 'label:' ) )
            // InternalVpui.g:1485:1: ( 'label:' )
            {
            // InternalVpui.g:1485:1: ( 'label:' )
            // InternalVpui.g:1486:1: 'label:'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUIContainerAccess().getLabelKeyword_4_0()); 
            }
            match(input,23,FOLLOW_2); if (state.failed) return ;
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
    // InternalVpui.g:1499:1: rule__UIContainer__Group_4__1 : rule__UIContainer__Group_4__1__Impl ;
    public final void rule__UIContainer__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVpui.g:1503:1: ( rule__UIContainer__Group_4__1__Impl )
            // InternalVpui.g:1504:2: rule__UIContainer__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
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
    // InternalVpui.g:1510:1: rule__UIContainer__Group_4__1__Impl : ( ( rule__UIContainer__LabelAssignment_4_1 ) ) ;
    public final void rule__UIContainer__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVpui.g:1514:1: ( ( ( rule__UIContainer__LabelAssignment_4_1 ) ) )
            // InternalVpui.g:1515:1: ( ( rule__UIContainer__LabelAssignment_4_1 ) )
            {
            // InternalVpui.g:1515:1: ( ( rule__UIContainer__LabelAssignment_4_1 ) )
            // InternalVpui.g:1516:1: ( rule__UIContainer__LabelAssignment_4_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUIContainerAccess().getLabelAssignment_4_1()); 
            }
            // InternalVpui.g:1517:1: ( rule__UIContainer__LabelAssignment_4_1 )
            // InternalVpui.g:1517:2: rule__UIContainer__LabelAssignment_4_1
            {
            pushFollow(FOLLOW_2);
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
    // InternalVpui.g:1531:1: rule__UIContainer__Group_5__0 : rule__UIContainer__Group_5__0__Impl rule__UIContainer__Group_5__1 ;
    public final void rule__UIContainer__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVpui.g:1535:1: ( rule__UIContainer__Group_5__0__Impl rule__UIContainer__Group_5__1 )
            // InternalVpui.g:1536:2: rule__UIContainer__Group_5__0__Impl rule__UIContainer__Group_5__1
            {
            pushFollow(FOLLOW_13);
            rule__UIContainer__Group_5__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
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
    // InternalVpui.g:1543:1: rule__UIContainer__Group_5__0__Impl : ( 'description:' ) ;
    public final void rule__UIContainer__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVpui.g:1547:1: ( ( 'description:' ) )
            // InternalVpui.g:1548:1: ( 'description:' )
            {
            // InternalVpui.g:1548:1: ( 'description:' )
            // InternalVpui.g:1549:1: 'description:'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUIContainerAccess().getDescriptionKeyword_5_0()); 
            }
            match(input,25,FOLLOW_2); if (state.failed) return ;
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
    // InternalVpui.g:1562:1: rule__UIContainer__Group_5__1 : rule__UIContainer__Group_5__1__Impl ;
    public final void rule__UIContainer__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVpui.g:1566:1: ( rule__UIContainer__Group_5__1__Impl )
            // InternalVpui.g:1567:2: rule__UIContainer__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
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
    // InternalVpui.g:1573:1: rule__UIContainer__Group_5__1__Impl : ( ( rule__UIContainer__DescriptionAssignment_5_1 ) ) ;
    public final void rule__UIContainer__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVpui.g:1577:1: ( ( ( rule__UIContainer__DescriptionAssignment_5_1 ) ) )
            // InternalVpui.g:1578:1: ( ( rule__UIContainer__DescriptionAssignment_5_1 ) )
            {
            // InternalVpui.g:1578:1: ( ( rule__UIContainer__DescriptionAssignment_5_1 ) )
            // InternalVpui.g:1579:1: ( rule__UIContainer__DescriptionAssignment_5_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUIContainerAccess().getDescriptionAssignment_5_1()); 
            }
            // InternalVpui.g:1580:1: ( rule__UIContainer__DescriptionAssignment_5_1 )
            // InternalVpui.g:1580:2: rule__UIContainer__DescriptionAssignment_5_1
            {
            pushFollow(FOLLOW_2);
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
    // InternalVpui.g:1594:1: rule__UIContainer__Group_6__0 : rule__UIContainer__Group_6__0__Impl rule__UIContainer__Group_6__1 ;
    public final void rule__UIContainer__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVpui.g:1598:1: ( rule__UIContainer__Group_6__0__Impl rule__UIContainer__Group_6__1 )
            // InternalVpui.g:1599:2: rule__UIContainer__Group_6__0__Impl rule__UIContainer__Group_6__1
            {
            pushFollow(FOLLOW_17);
            rule__UIContainer__Group_6__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
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
    // InternalVpui.g:1606:1: rule__UIContainer__Group_6__0__Impl : ( ( rule__UIContainer__UI_fieldsAssignment_6_0 ) ) ;
    public final void rule__UIContainer__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVpui.g:1610:1: ( ( ( rule__UIContainer__UI_fieldsAssignment_6_0 ) ) )
            // InternalVpui.g:1611:1: ( ( rule__UIContainer__UI_fieldsAssignment_6_0 ) )
            {
            // InternalVpui.g:1611:1: ( ( rule__UIContainer__UI_fieldsAssignment_6_0 ) )
            // InternalVpui.g:1612:1: ( rule__UIContainer__UI_fieldsAssignment_6_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUIContainerAccess().getUI_fieldsAssignment_6_0()); 
            }
            // InternalVpui.g:1613:1: ( rule__UIContainer__UI_fieldsAssignment_6_0 )
            // InternalVpui.g:1613:2: rule__UIContainer__UI_fieldsAssignment_6_0
            {
            pushFollow(FOLLOW_2);
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
    // InternalVpui.g:1623:1: rule__UIContainer__Group_6__1 : rule__UIContainer__Group_6__1__Impl ;
    public final void rule__UIContainer__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVpui.g:1627:1: ( rule__UIContainer__Group_6__1__Impl )
            // InternalVpui.g:1628:2: rule__UIContainer__Group_6__1__Impl
            {
            pushFollow(FOLLOW_2);
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
    // InternalVpui.g:1634:1: rule__UIContainer__Group_6__1__Impl : ( ( rule__UIContainer__UI_fieldsAssignment_6_1 )* ) ;
    public final void rule__UIContainer__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVpui.g:1638:1: ( ( ( rule__UIContainer__UI_fieldsAssignment_6_1 )* ) )
            // InternalVpui.g:1639:1: ( ( rule__UIContainer__UI_fieldsAssignment_6_1 )* )
            {
            // InternalVpui.g:1639:1: ( ( rule__UIContainer__UI_fieldsAssignment_6_1 )* )
            // InternalVpui.g:1640:1: ( rule__UIContainer__UI_fieldsAssignment_6_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUIContainerAccess().getUI_fieldsAssignment_6_1()); 
            }
            // InternalVpui.g:1641:1: ( rule__UIContainer__UI_fieldsAssignment_6_1 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==27) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalVpui.g:1641:2: rule__UIContainer__UI_fieldsAssignment_6_1
            	    {
            	    pushFollow(FOLLOW_18);
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
    // InternalVpui.g:1655:1: rule__UIContainer__Group_7__0 : rule__UIContainer__Group_7__0__Impl rule__UIContainer__Group_7__1 ;
    public final void rule__UIContainer__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVpui.g:1659:1: ( rule__UIContainer__Group_7__0__Impl rule__UIContainer__Group_7__1 )
            // InternalVpui.g:1660:2: rule__UIContainer__Group_7__0__Impl rule__UIContainer__Group_7__1
            {
            pushFollow(FOLLOW_14);
            rule__UIContainer__Group_7__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
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
    // InternalVpui.g:1667:1: rule__UIContainer__Group_7__0__Impl : ( ( rule__UIContainer__SubContainersAssignment_7_0 ) ) ;
    public final void rule__UIContainer__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVpui.g:1671:1: ( ( ( rule__UIContainer__SubContainersAssignment_7_0 ) ) )
            // InternalVpui.g:1672:1: ( ( rule__UIContainer__SubContainersAssignment_7_0 ) )
            {
            // InternalVpui.g:1672:1: ( ( rule__UIContainer__SubContainersAssignment_7_0 ) )
            // InternalVpui.g:1673:1: ( rule__UIContainer__SubContainersAssignment_7_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUIContainerAccess().getSubContainersAssignment_7_0()); 
            }
            // InternalVpui.g:1674:1: ( rule__UIContainer__SubContainersAssignment_7_0 )
            // InternalVpui.g:1674:2: rule__UIContainer__SubContainersAssignment_7_0
            {
            pushFollow(FOLLOW_2);
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
    // InternalVpui.g:1684:1: rule__UIContainer__Group_7__1 : rule__UIContainer__Group_7__1__Impl ;
    public final void rule__UIContainer__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVpui.g:1688:1: ( rule__UIContainer__Group_7__1__Impl )
            // InternalVpui.g:1689:2: rule__UIContainer__Group_7__1__Impl
            {
            pushFollow(FOLLOW_2);
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
    // InternalVpui.g:1695:1: rule__UIContainer__Group_7__1__Impl : ( ( rule__UIContainer__SubContainersAssignment_7_1 )* ) ;
    public final void rule__UIContainer__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVpui.g:1699:1: ( ( ( rule__UIContainer__SubContainersAssignment_7_1 )* ) )
            // InternalVpui.g:1700:1: ( ( rule__UIContainer__SubContainersAssignment_7_1 )* )
            {
            // InternalVpui.g:1700:1: ( ( rule__UIContainer__SubContainersAssignment_7_1 )* )
            // InternalVpui.g:1701:1: ( rule__UIContainer__SubContainersAssignment_7_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUIContainerAccess().getSubContainersAssignment_7_1()); 
            }
            // InternalVpui.g:1702:1: ( rule__UIContainer__SubContainersAssignment_7_1 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==24) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalVpui.g:1702:2: rule__UIContainer__SubContainersAssignment_7_1
            	    {
            	    pushFollow(FOLLOW_12);
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
    // InternalVpui.g:1716:1: rule__LocalClass__Group__0 : rule__LocalClass__Group__0__Impl rule__LocalClass__Group__1 ;
    public final void rule__LocalClass__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVpui.g:1720:1: ( rule__LocalClass__Group__0__Impl rule__LocalClass__Group__1 )
            // InternalVpui.g:1721:2: rule__LocalClass__Group__0__Impl rule__LocalClass__Group__1
            {
            pushFollow(FOLLOW_19);
            rule__LocalClass__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
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
    // InternalVpui.g:1728:1: rule__LocalClass__Group__0__Impl : ( () ) ;
    public final void rule__LocalClass__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVpui.g:1732:1: ( ( () ) )
            // InternalVpui.g:1733:1: ( () )
            {
            // InternalVpui.g:1733:1: ( () )
            // InternalVpui.g:1734:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLocalClassAccess().getLocalClassAction_0()); 
            }
            // InternalVpui.g:1735:1: ()
            // InternalVpui.g:1737:1: 
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
    // InternalVpui.g:1747:1: rule__LocalClass__Group__1 : rule__LocalClass__Group__1__Impl rule__LocalClass__Group__2 ;
    public final void rule__LocalClass__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVpui.g:1751:1: ( rule__LocalClass__Group__1__Impl rule__LocalClass__Group__2 )
            // InternalVpui.g:1752:2: rule__LocalClass__Group__1__Impl rule__LocalClass__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__LocalClass__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
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
    // InternalVpui.g:1759:1: rule__LocalClass__Group__1__Impl : ( 'for' ) ;
    public final void rule__LocalClass__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVpui.g:1763:1: ( ( 'for' ) )
            // InternalVpui.g:1764:1: ( 'for' )
            {
            // InternalVpui.g:1764:1: ( 'for' )
            // InternalVpui.g:1765:1: 'for'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLocalClassAccess().getForKeyword_1()); 
            }
            match(input,26,FOLLOW_2); if (state.failed) return ;
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
    // InternalVpui.g:1778:1: rule__LocalClass__Group__2 : rule__LocalClass__Group__2__Impl ;
    public final void rule__LocalClass__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVpui.g:1782:1: ( rule__LocalClass__Group__2__Impl )
            // InternalVpui.g:1783:2: rule__LocalClass__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
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
    // InternalVpui.g:1789:1: rule__LocalClass__Group__2__Impl : ( ( rule__LocalClass__UI_For_LocalClassAssignment_2 ) ) ;
    public final void rule__LocalClass__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVpui.g:1793:1: ( ( ( rule__LocalClass__UI_For_LocalClassAssignment_2 ) ) )
            // InternalVpui.g:1794:1: ( ( rule__LocalClass__UI_For_LocalClassAssignment_2 ) )
            {
            // InternalVpui.g:1794:1: ( ( rule__LocalClass__UI_For_LocalClassAssignment_2 ) )
            // InternalVpui.g:1795:1: ( rule__LocalClass__UI_For_LocalClassAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLocalClassAccess().getUI_For_LocalClassAssignment_2()); 
            }
            // InternalVpui.g:1796:1: ( rule__LocalClass__UI_For_LocalClassAssignment_2 )
            // InternalVpui.g:1796:2: rule__LocalClass__UI_For_LocalClassAssignment_2
            {
            pushFollow(FOLLOW_2);
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
    // InternalVpui.g:1812:1: rule__UIField__Group__0 : rule__UIField__Group__0__Impl rule__UIField__Group__1 ;
    public final void rule__UIField__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVpui.g:1816:1: ( rule__UIField__Group__0__Impl rule__UIField__Group__1 )
            // InternalVpui.g:1817:2: rule__UIField__Group__0__Impl rule__UIField__Group__1
            {
            pushFollow(FOLLOW_17);
            rule__UIField__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
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
    // InternalVpui.g:1824:1: rule__UIField__Group__0__Impl : ( () ) ;
    public final void rule__UIField__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVpui.g:1828:1: ( ( () ) )
            // InternalVpui.g:1829:1: ( () )
            {
            // InternalVpui.g:1829:1: ( () )
            // InternalVpui.g:1830:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUIFieldAccess().getUIFieldAction_0()); 
            }
            // InternalVpui.g:1831:1: ()
            // InternalVpui.g:1833:1: 
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
    // InternalVpui.g:1843:1: rule__UIField__Group__1 : rule__UIField__Group__1__Impl rule__UIField__Group__2 ;
    public final void rule__UIField__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVpui.g:1847:1: ( rule__UIField__Group__1__Impl rule__UIField__Group__2 )
            // InternalVpui.g:1848:2: rule__UIField__Group__1__Impl rule__UIField__Group__2
            {
            pushFollow(FOLLOW_13);
            rule__UIField__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
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
    // InternalVpui.g:1855:1: rule__UIField__Group__1__Impl : ( 'Field' ) ;
    public final void rule__UIField__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVpui.g:1859:1: ( ( 'Field' ) )
            // InternalVpui.g:1860:1: ( 'Field' )
            {
            // InternalVpui.g:1860:1: ( 'Field' )
            // InternalVpui.g:1861:1: 'Field'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUIFieldAccess().getFieldKeyword_1()); 
            }
            match(input,27,FOLLOW_2); if (state.failed) return ;
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
    // InternalVpui.g:1874:1: rule__UIField__Group__2 : rule__UIField__Group__2__Impl rule__UIField__Group__3 ;
    public final void rule__UIField__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVpui.g:1878:1: ( rule__UIField__Group__2__Impl rule__UIField__Group__3 )
            // InternalVpui.g:1879:2: rule__UIField__Group__2__Impl rule__UIField__Group__3
            {
            pushFollow(FOLLOW_20);
            rule__UIField__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
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
    // InternalVpui.g:1886:1: rule__UIField__Group__2__Impl : ( ( rule__UIField__NameAssignment_2 ) ) ;
    public final void rule__UIField__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVpui.g:1890:1: ( ( ( rule__UIField__NameAssignment_2 ) ) )
            // InternalVpui.g:1891:1: ( ( rule__UIField__NameAssignment_2 ) )
            {
            // InternalVpui.g:1891:1: ( ( rule__UIField__NameAssignment_2 ) )
            // InternalVpui.g:1892:1: ( rule__UIField__NameAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUIFieldAccess().getNameAssignment_2()); 
            }
            // InternalVpui.g:1893:1: ( rule__UIField__NameAssignment_2 )
            // InternalVpui.g:1893:2: rule__UIField__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
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
    // InternalVpui.g:1903:1: rule__UIField__Group__3 : rule__UIField__Group__3__Impl rule__UIField__Group__4 ;
    public final void rule__UIField__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVpui.g:1907:1: ( rule__UIField__Group__3__Impl rule__UIField__Group__4 )
            // InternalVpui.g:1908:2: rule__UIField__Group__3__Impl rule__UIField__Group__4
            {
            pushFollow(FOLLOW_20);
            rule__UIField__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
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
    // InternalVpui.g:1915:1: rule__UIField__Group__3__Impl : ( ( rule__UIField__Group_3__0 )? ) ;
    public final void rule__UIField__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVpui.g:1919:1: ( ( ( rule__UIField__Group_3__0 )? ) )
            // InternalVpui.g:1920:1: ( ( rule__UIField__Group_3__0 )? )
            {
            // InternalVpui.g:1920:1: ( ( rule__UIField__Group_3__0 )? )
            // InternalVpui.g:1921:1: ( rule__UIField__Group_3__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUIFieldAccess().getGroup_3()); 
            }
            // InternalVpui.g:1922:1: ( rule__UIField__Group_3__0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==23) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalVpui.g:1922:2: rule__UIField__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
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
    // InternalVpui.g:1932:1: rule__UIField__Group__4 : rule__UIField__Group__4__Impl rule__UIField__Group__5 ;
    public final void rule__UIField__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVpui.g:1936:1: ( rule__UIField__Group__4__Impl rule__UIField__Group__5 )
            // InternalVpui.g:1937:2: rule__UIField__Group__4__Impl rule__UIField__Group__5
            {
            pushFollow(FOLLOW_20);
            rule__UIField__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
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
    // InternalVpui.g:1944:1: rule__UIField__Group__4__Impl : ( ( rule__UIField__Group_4__0 )? ) ;
    public final void rule__UIField__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVpui.g:1948:1: ( ( ( rule__UIField__Group_4__0 )? ) )
            // InternalVpui.g:1949:1: ( ( rule__UIField__Group_4__0 )? )
            {
            // InternalVpui.g:1949:1: ( ( rule__UIField__Group_4__0 )? )
            // InternalVpui.g:1950:1: ( rule__UIField__Group_4__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUIFieldAccess().getGroup_4()); 
            }
            // InternalVpui.g:1951:1: ( rule__UIField__Group_4__0 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==25) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalVpui.g:1951:2: rule__UIField__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
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
    // InternalVpui.g:1961:1: rule__UIField__Group__5 : rule__UIField__Group__5__Impl rule__UIField__Group__6 ;
    public final void rule__UIField__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVpui.g:1965:1: ( rule__UIField__Group__5__Impl rule__UIField__Group__6 )
            // InternalVpui.g:1966:2: rule__UIField__Group__5__Impl rule__UIField__Group__6
            {
            pushFollow(FOLLOW_20);
            rule__UIField__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
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
    // InternalVpui.g:1973:1: rule__UIField__Group__5__Impl : ( ( rule__UIField__Group_5__0 )? ) ;
    public final void rule__UIField__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVpui.g:1977:1: ( ( ( rule__UIField__Group_5__0 )? ) )
            // InternalVpui.g:1978:1: ( ( rule__UIField__Group_5__0 )? )
            {
            // InternalVpui.g:1978:1: ( ( rule__UIField__Group_5__0 )? )
            // InternalVpui.g:1979:1: ( rule__UIField__Group_5__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUIFieldAccess().getGroup_5()); 
            }
            // InternalVpui.g:1980:1: ( rule__UIField__Group_5__0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==29) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalVpui.g:1980:2: rule__UIField__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
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
    // InternalVpui.g:1990:1: rule__UIField__Group__6 : rule__UIField__Group__6__Impl rule__UIField__Group__7 ;
    public final void rule__UIField__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVpui.g:1994:1: ( rule__UIField__Group__6__Impl rule__UIField__Group__7 )
            // InternalVpui.g:1995:2: rule__UIField__Group__6__Impl rule__UIField__Group__7
            {
            pushFollow(FOLLOW_21);
            rule__UIField__Group__6__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
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
    // InternalVpui.g:2002:1: rule__UIField__Group__6__Impl : ( ',' ) ;
    public final void rule__UIField__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVpui.g:2006:1: ( ( ',' ) )
            // InternalVpui.g:2007:1: ( ',' )
            {
            // InternalVpui.g:2007:1: ( ',' )
            // InternalVpui.g:2008:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUIFieldAccess().getCommaKeyword_6()); 
            }
            match(input,28,FOLLOW_2); if (state.failed) return ;
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
    // InternalVpui.g:2021:1: rule__UIField__Group__7 : rule__UIField__Group__7__Impl ;
    public final void rule__UIField__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVpui.g:2025:1: ( rule__UIField__Group__7__Impl )
            // InternalVpui.g:2026:2: rule__UIField__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
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
    // InternalVpui.g:2032:1: rule__UIField__Group__7__Impl : ( ( rule__UIField__MappingAssignment_7 ) ) ;
    public final void rule__UIField__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVpui.g:2036:1: ( ( ( rule__UIField__MappingAssignment_7 ) ) )
            // InternalVpui.g:2037:1: ( ( rule__UIField__MappingAssignment_7 ) )
            {
            // InternalVpui.g:2037:1: ( ( rule__UIField__MappingAssignment_7 ) )
            // InternalVpui.g:2038:1: ( rule__UIField__MappingAssignment_7 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUIFieldAccess().getMappingAssignment_7()); 
            }
            // InternalVpui.g:2039:1: ( rule__UIField__MappingAssignment_7 )
            // InternalVpui.g:2039:2: rule__UIField__MappingAssignment_7
            {
            pushFollow(FOLLOW_2);
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
    // InternalVpui.g:2065:1: rule__UIField__Group_3__0 : rule__UIField__Group_3__0__Impl rule__UIField__Group_3__1 ;
    public final void rule__UIField__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVpui.g:2069:1: ( rule__UIField__Group_3__0__Impl rule__UIField__Group_3__1 )
            // InternalVpui.g:2070:2: rule__UIField__Group_3__0__Impl rule__UIField__Group_3__1
            {
            pushFollow(FOLLOW_13);
            rule__UIField__Group_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
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
    // InternalVpui.g:2077:1: rule__UIField__Group_3__0__Impl : ( 'label:' ) ;
    public final void rule__UIField__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVpui.g:2081:1: ( ( 'label:' ) )
            // InternalVpui.g:2082:1: ( 'label:' )
            {
            // InternalVpui.g:2082:1: ( 'label:' )
            // InternalVpui.g:2083:1: 'label:'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUIFieldAccess().getLabelKeyword_3_0()); 
            }
            match(input,23,FOLLOW_2); if (state.failed) return ;
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
    // InternalVpui.g:2096:1: rule__UIField__Group_3__1 : rule__UIField__Group_3__1__Impl ;
    public final void rule__UIField__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVpui.g:2100:1: ( rule__UIField__Group_3__1__Impl )
            // InternalVpui.g:2101:2: rule__UIField__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
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
    // InternalVpui.g:2107:1: rule__UIField__Group_3__1__Impl : ( ( rule__UIField__LabelAssignment_3_1 ) ) ;
    public final void rule__UIField__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVpui.g:2111:1: ( ( ( rule__UIField__LabelAssignment_3_1 ) ) )
            // InternalVpui.g:2112:1: ( ( rule__UIField__LabelAssignment_3_1 ) )
            {
            // InternalVpui.g:2112:1: ( ( rule__UIField__LabelAssignment_3_1 ) )
            // InternalVpui.g:2113:1: ( rule__UIField__LabelAssignment_3_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUIFieldAccess().getLabelAssignment_3_1()); 
            }
            // InternalVpui.g:2114:1: ( rule__UIField__LabelAssignment_3_1 )
            // InternalVpui.g:2114:2: rule__UIField__LabelAssignment_3_1
            {
            pushFollow(FOLLOW_2);
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
    // InternalVpui.g:2128:1: rule__UIField__Group_4__0 : rule__UIField__Group_4__0__Impl rule__UIField__Group_4__1 ;
    public final void rule__UIField__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVpui.g:2132:1: ( rule__UIField__Group_4__0__Impl rule__UIField__Group_4__1 )
            // InternalVpui.g:2133:2: rule__UIField__Group_4__0__Impl rule__UIField__Group_4__1
            {
            pushFollow(FOLLOW_13);
            rule__UIField__Group_4__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
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
    // InternalVpui.g:2140:1: rule__UIField__Group_4__0__Impl : ( 'description:' ) ;
    public final void rule__UIField__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVpui.g:2144:1: ( ( 'description:' ) )
            // InternalVpui.g:2145:1: ( 'description:' )
            {
            // InternalVpui.g:2145:1: ( 'description:' )
            // InternalVpui.g:2146:1: 'description:'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUIFieldAccess().getDescriptionKeyword_4_0()); 
            }
            match(input,25,FOLLOW_2); if (state.failed) return ;
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
    // InternalVpui.g:2159:1: rule__UIField__Group_4__1 : rule__UIField__Group_4__1__Impl rule__UIField__Group_4__2 ;
    public final void rule__UIField__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVpui.g:2163:1: ( rule__UIField__Group_4__1__Impl rule__UIField__Group_4__2 )
            // InternalVpui.g:2164:2: rule__UIField__Group_4__1__Impl rule__UIField__Group_4__2
            {
            pushFollow(FOLLOW_22);
            rule__UIField__Group_4__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
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
    // InternalVpui.g:2171:1: rule__UIField__Group_4__1__Impl : ( ( rule__UIField__DescriptionAssignment_4_1 ) ) ;
    public final void rule__UIField__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVpui.g:2175:1: ( ( ( rule__UIField__DescriptionAssignment_4_1 ) ) )
            // InternalVpui.g:2176:1: ( ( rule__UIField__DescriptionAssignment_4_1 ) )
            {
            // InternalVpui.g:2176:1: ( ( rule__UIField__DescriptionAssignment_4_1 ) )
            // InternalVpui.g:2177:1: ( rule__UIField__DescriptionAssignment_4_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUIFieldAccess().getDescriptionAssignment_4_1()); 
            }
            // InternalVpui.g:2178:1: ( rule__UIField__DescriptionAssignment_4_1 )
            // InternalVpui.g:2178:2: rule__UIField__DescriptionAssignment_4_1
            {
            pushFollow(FOLLOW_2);
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
    // InternalVpui.g:2188:1: rule__UIField__Group_4__2 : rule__UIField__Group_4__2__Impl ;
    public final void rule__UIField__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVpui.g:2192:1: ( rule__UIField__Group_4__2__Impl )
            // InternalVpui.g:2193:2: rule__UIField__Group_4__2__Impl
            {
            pushFollow(FOLLOW_2);
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
    // InternalVpui.g:2199:1: rule__UIField__Group_4__2__Impl : ( ',' ) ;
    public final void rule__UIField__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVpui.g:2203:1: ( ( ',' ) )
            // InternalVpui.g:2204:1: ( ',' )
            {
            // InternalVpui.g:2204:1: ( ',' )
            // InternalVpui.g:2205:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUIFieldAccess().getCommaKeyword_4_2()); 
            }
            match(input,28,FOLLOW_2); if (state.failed) return ;
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
    // InternalVpui.g:2224:1: rule__UIField__Group_5__0 : rule__UIField__Group_5__0__Impl rule__UIField__Group_5__1 ;
    public final void rule__UIField__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVpui.g:2228:1: ( rule__UIField__Group_5__0__Impl rule__UIField__Group_5__1 )
            // InternalVpui.g:2229:2: rule__UIField__Group_5__0__Impl rule__UIField__Group_5__1
            {
            pushFollow(FOLLOW_23);
            rule__UIField__Group_5__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
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
    // InternalVpui.g:2236:1: rule__UIField__Group_5__0__Impl : ( 'type' ) ;
    public final void rule__UIField__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVpui.g:2240:1: ( ( 'type' ) )
            // InternalVpui.g:2241:1: ( 'type' )
            {
            // InternalVpui.g:2241:1: ( 'type' )
            // InternalVpui.g:2242:1: 'type'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUIFieldAccess().getTypeKeyword_5_0()); 
            }
            match(input,29,FOLLOW_2); if (state.failed) return ;
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
    // InternalVpui.g:2255:1: rule__UIField__Group_5__1 : rule__UIField__Group_5__1__Impl ;
    public final void rule__UIField__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVpui.g:2259:1: ( rule__UIField__Group_5__1__Impl )
            // InternalVpui.g:2260:2: rule__UIField__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
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
    // InternalVpui.g:2266:1: rule__UIField__Group_5__1__Impl : ( ( rule__UIField__TypeAssignment_5_1 ) ) ;
    public final void rule__UIField__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVpui.g:2270:1: ( ( ( rule__UIField__TypeAssignment_5_1 ) ) )
            // InternalVpui.g:2271:1: ( ( rule__UIField__TypeAssignment_5_1 ) )
            {
            // InternalVpui.g:2271:1: ( ( rule__UIField__TypeAssignment_5_1 ) )
            // InternalVpui.g:2272:1: ( rule__UIField__TypeAssignment_5_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUIFieldAccess().getTypeAssignment_5_1()); 
            }
            // InternalVpui.g:2273:1: ( rule__UIField__TypeAssignment_5_1 )
            // InternalVpui.g:2273:2: rule__UIField__TypeAssignment_5_1
            {
            pushFollow(FOLLOW_2);
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
    // InternalVpui.g:2287:1: rule__FieldMapping__Group__0 : rule__FieldMapping__Group__0__Impl rule__FieldMapping__Group__1 ;
    public final void rule__FieldMapping__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVpui.g:2291:1: ( rule__FieldMapping__Group__0__Impl rule__FieldMapping__Group__1 )
            // InternalVpui.g:2292:2: rule__FieldMapping__Group__0__Impl rule__FieldMapping__Group__1
            {
            pushFollow(FOLLOW_21);
            rule__FieldMapping__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
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
    // InternalVpui.g:2299:1: rule__FieldMapping__Group__0__Impl : ( () ) ;
    public final void rule__FieldMapping__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVpui.g:2303:1: ( ( () ) )
            // InternalVpui.g:2304:1: ( () )
            {
            // InternalVpui.g:2304:1: ( () )
            // InternalVpui.g:2305:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldMappingAccess().getFieldMappingAction_0()); 
            }
            // InternalVpui.g:2306:1: ()
            // InternalVpui.g:2308:1: 
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
    // InternalVpui.g:2318:1: rule__FieldMapping__Group__1 : rule__FieldMapping__Group__1__Impl rule__FieldMapping__Group__2 ;
    public final void rule__FieldMapping__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVpui.g:2322:1: ( rule__FieldMapping__Group__1__Impl rule__FieldMapping__Group__2 )
            // InternalVpui.g:2323:2: rule__FieldMapping__Group__1__Impl rule__FieldMapping__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__FieldMapping__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
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
    // InternalVpui.g:2330:1: rule__FieldMapping__Group__1__Impl : ( 'mapped-to' ) ;
    public final void rule__FieldMapping__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVpui.g:2334:1: ( ( 'mapped-to' ) )
            // InternalVpui.g:2335:1: ( 'mapped-to' )
            {
            // InternalVpui.g:2335:1: ( 'mapped-to' )
            // InternalVpui.g:2336:1: 'mapped-to'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldMappingAccess().getMappedToKeyword_1()); 
            }
            match(input,30,FOLLOW_2); if (state.failed) return ;
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
    // InternalVpui.g:2349:1: rule__FieldMapping__Group__2 : rule__FieldMapping__Group__2__Impl ;
    public final void rule__FieldMapping__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVpui.g:2353:1: ( rule__FieldMapping__Group__2__Impl )
            // InternalVpui.g:2354:2: rule__FieldMapping__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
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
    // InternalVpui.g:2360:1: rule__FieldMapping__Group__2__Impl : ( ( rule__FieldMapping__UI_Field_Mapped_ToAssignment_2 )? ) ;
    public final void rule__FieldMapping__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVpui.g:2364:1: ( ( ( rule__FieldMapping__UI_Field_Mapped_ToAssignment_2 )? ) )
            // InternalVpui.g:2365:1: ( ( rule__FieldMapping__UI_Field_Mapped_ToAssignment_2 )? )
            {
            // InternalVpui.g:2365:1: ( ( rule__FieldMapping__UI_Field_Mapped_ToAssignment_2 )? )
            // InternalVpui.g:2366:1: ( rule__FieldMapping__UI_Field_Mapped_ToAssignment_2 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldMappingAccess().getUI_Field_Mapped_ToAssignment_2()); 
            }
            // InternalVpui.g:2367:1: ( rule__FieldMapping__UI_Field_Mapped_ToAssignment_2 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==RULE_ID) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalVpui.g:2367:2: rule__FieldMapping__UI_Field_Mapped_ToAssignment_2
                    {
                    pushFollow(FOLLOW_2);
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
    // InternalVpui.g:2383:1: rule__FQN__Group__0 : rule__FQN__Group__0__Impl rule__FQN__Group__1 ;
    public final void rule__FQN__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVpui.g:2387:1: ( rule__FQN__Group__0__Impl rule__FQN__Group__1 )
            // InternalVpui.g:2388:2: rule__FQN__Group__0__Impl rule__FQN__Group__1
            {
            pushFollow(FOLLOW_24);
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
    // InternalVpui.g:2395:1: rule__FQN__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__FQN__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVpui.g:2399:1: ( ( RULE_ID ) )
            // InternalVpui.g:2400:1: ( RULE_ID )
            {
            // InternalVpui.g:2400:1: ( RULE_ID )
            // InternalVpui.g:2401:1: RULE_ID
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
    // InternalVpui.g:2412:1: rule__FQN__Group__1 : rule__FQN__Group__1__Impl ;
    public final void rule__FQN__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVpui.g:2416:1: ( rule__FQN__Group__1__Impl )
            // InternalVpui.g:2417:2: rule__FQN__Group__1__Impl
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
    // InternalVpui.g:2423:1: rule__FQN__Group__1__Impl : ( ( rule__FQN__Group_1__0 )* ) ;
    public final void rule__FQN__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVpui.g:2427:1: ( ( ( rule__FQN__Group_1__0 )* ) )
            // InternalVpui.g:2428:1: ( ( rule__FQN__Group_1__0 )* )
            {
            // InternalVpui.g:2428:1: ( ( rule__FQN__Group_1__0 )* )
            // InternalVpui.g:2429:1: ( rule__FQN__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFQNAccess().getGroup_1()); 
            }
            // InternalVpui.g:2430:1: ( rule__FQN__Group_1__0 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==31) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalVpui.g:2430:2: rule__FQN__Group_1__0
            	    {
            	    pushFollow(FOLLOW_25);
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
    // InternalVpui.g:2444:1: rule__FQN__Group_1__0 : rule__FQN__Group_1__0__Impl rule__FQN__Group_1__1 ;
    public final void rule__FQN__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVpui.g:2448:1: ( rule__FQN__Group_1__0__Impl rule__FQN__Group_1__1 )
            // InternalVpui.g:2449:2: rule__FQN__Group_1__0__Impl rule__FQN__Group_1__1
            {
            pushFollow(FOLLOW_5);
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
    // InternalVpui.g:2456:1: rule__FQN__Group_1__0__Impl : ( '.' ) ;
    public final void rule__FQN__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVpui.g:2460:1: ( ( '.' ) )
            // InternalVpui.g:2461:1: ( '.' )
            {
            // InternalVpui.g:2461:1: ( '.' )
            // InternalVpui.g:2462:1: '.'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFQNAccess().getFullStopKeyword_1_0()); 
            }
            match(input,31,FOLLOW_2); if (state.failed) return ;
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
    // InternalVpui.g:2475:1: rule__FQN__Group_1__1 : rule__FQN__Group_1__1__Impl ;
    public final void rule__FQN__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVpui.g:2479:1: ( rule__FQN__Group_1__1__Impl )
            // InternalVpui.g:2480:2: rule__FQN__Group_1__1__Impl
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
    // InternalVpui.g:2486:1: rule__FQN__Group_1__1__Impl : ( ( RULE_ID ) ) ;
    public final void rule__FQN__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVpui.g:2490:1: ( ( ( RULE_ID ) ) )
            // InternalVpui.g:2491:1: ( ( RULE_ID ) )
            {
            // InternalVpui.g:2491:1: ( ( RULE_ID ) )
            // InternalVpui.g:2492:1: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFQNAccess().getIDTerminalRuleCall_1_1()); 
            }
            // InternalVpui.g:2493:1: ( RULE_ID )
            // InternalVpui.g:2493:3: RULE_ID
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


    // $ANTLR start "rule__UserInterface__ImportsAssignment_1"
    // InternalVpui.g:2508:1: rule__UserInterface__ImportsAssignment_1 : ( ruleImport ) ;
    public final void rule__UserInterface__ImportsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVpui.g:2512:1: ( ( ruleImport ) )
            // InternalVpui.g:2513:1: ( ruleImport )
            {
            // InternalVpui.g:2513:1: ( ruleImport )
            // InternalVpui.g:2514:1: ruleImport
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUserInterfaceAccess().getImportsImportParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
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
    // InternalVpui.g:2523:1: rule__UserInterface__UiDescriptionAssignment_2 : ( ruleAspect ) ;
    public final void rule__UserInterface__UiDescriptionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVpui.g:2527:1: ( ( ruleAspect ) )
            // InternalVpui.g:2528:1: ( ruleAspect )
            {
            // InternalVpui.g:2528:1: ( ruleAspect )
            // InternalVpui.g:2529:1: ruleAspect
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUserInterfaceAccess().getUiDescriptionAspectParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_2);
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
    // InternalVpui.g:2538:1: rule__Import__ImportedNamespaceAssignment_1 : ( ruleFQN ) ;
    public final void rule__Import__ImportedNamespaceAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVpui.g:2542:1: ( ( ruleFQN ) )
            // InternalVpui.g:2543:1: ( ruleFQN )
            {
            // InternalVpui.g:2543:1: ( ruleFQN )
            // InternalVpui.g:2544:1: ruleFQN
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImportAccess().getImportedNamespaceFQNParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
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
    // InternalVpui.g:2553:1: rule__UIDescription__NameAssignment_2 : ( ruleFQN ) ;
    public final void rule__UIDescription__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVpui.g:2557:1: ( ( ruleFQN ) )
            // InternalVpui.g:2558:1: ( ruleFQN )
            {
            // InternalVpui.g:2558:1: ( ruleFQN )
            // InternalVpui.g:2559:1: ruleFQN
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUIDescriptionAccess().getNameFQNParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_2);
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
    // InternalVpui.g:2568:1: rule__UIDescription__UIsAssignment_4 : ( ruleUI ) ;
    public final void rule__UIDescription__UIsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVpui.g:2572:1: ( ( ruleUI ) )
            // InternalVpui.g:2573:1: ( ruleUI )
            {
            // InternalVpui.g:2573:1: ( ruleUI )
            // InternalVpui.g:2574:1: ruleUI
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUIDescriptionAccess().getUIsUIParserRuleCall_4_0()); 
            }
            pushFollow(FOLLOW_2);
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
    // InternalVpui.g:2583:1: rule__UI__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__UI__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVpui.g:2587:1: ( ( ruleEString ) )
            // InternalVpui.g:2588:1: ( ruleEString )
            {
            // InternalVpui.g:2588:1: ( ruleEString )
            // InternalVpui.g:2589:1: ruleEString
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUIAccess().getNameEStringParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_2);
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
    // InternalVpui.g:2598:1: rule__UI__UI_DataSourceAssignment_3 : ( ruleDataSource ) ;
    public final void rule__UI__UI_DataSourceAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVpui.g:2602:1: ( ( ruleDataSource ) )
            // InternalVpui.g:2603:1: ( ruleDataSource )
            {
            // InternalVpui.g:2603:1: ( ruleDataSource )
            // InternalVpui.g:2604:1: ruleDataSource
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUIAccess().getUI_DataSourceDataSourceParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_2);
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
    // InternalVpui.g:2613:1: rule__UI__LabelAssignment_5_1 : ( ruleEString ) ;
    public final void rule__UI__LabelAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVpui.g:2617:1: ( ( ruleEString ) )
            // InternalVpui.g:2618:1: ( ruleEString )
            {
            // InternalVpui.g:2618:1: ( ruleEString )
            // InternalVpui.g:2619:1: ruleEString
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUIAccess().getLabelEStringParserRuleCall_5_1_0()); 
            }
            pushFollow(FOLLOW_2);
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
    // InternalVpui.g:2628:1: rule__UI__UI_ContainersAssignment_6 : ( ruleUIContainer ) ;
    public final void rule__UI__UI_ContainersAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVpui.g:2632:1: ( ( ruleUIContainer ) )
            // InternalVpui.g:2633:1: ( ruleUIContainer )
            {
            // InternalVpui.g:2633:1: ( ruleUIContainer )
            // InternalVpui.g:2634:1: ruleUIContainer
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUIAccess().getUI_ContainersUIContainerParserRuleCall_6_0()); 
            }
            pushFollow(FOLLOW_2);
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
    // InternalVpui.g:2643:1: rule__UIContainer__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__UIContainer__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVpui.g:2647:1: ( ( ruleEString ) )
            // InternalVpui.g:2648:1: ( ruleEString )
            {
            // InternalVpui.g:2648:1: ( ruleEString )
            // InternalVpui.g:2649:1: ruleEString
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUIContainerAccess().getNameEStringParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_2);
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
    // InternalVpui.g:2658:1: rule__UIContainer__LabelAssignment_4_1 : ( ruleEString ) ;
    public final void rule__UIContainer__LabelAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVpui.g:2662:1: ( ( ruleEString ) )
            // InternalVpui.g:2663:1: ( ruleEString )
            {
            // InternalVpui.g:2663:1: ( ruleEString )
            // InternalVpui.g:2664:1: ruleEString
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUIContainerAccess().getLabelEStringParserRuleCall_4_1_0()); 
            }
            pushFollow(FOLLOW_2);
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
    // InternalVpui.g:2673:1: rule__UIContainer__DescriptionAssignment_5_1 : ( ruleEString ) ;
    public final void rule__UIContainer__DescriptionAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVpui.g:2677:1: ( ( ruleEString ) )
            // InternalVpui.g:2678:1: ( ruleEString )
            {
            // InternalVpui.g:2678:1: ( ruleEString )
            // InternalVpui.g:2679:1: ruleEString
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUIContainerAccess().getDescriptionEStringParserRuleCall_5_1_0()); 
            }
            pushFollow(FOLLOW_2);
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
    // InternalVpui.g:2688:1: rule__UIContainer__UI_fieldsAssignment_6_0 : ( ruleUIField ) ;
    public final void rule__UIContainer__UI_fieldsAssignment_6_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVpui.g:2692:1: ( ( ruleUIField ) )
            // InternalVpui.g:2693:1: ( ruleUIField )
            {
            // InternalVpui.g:2693:1: ( ruleUIField )
            // InternalVpui.g:2694:1: ruleUIField
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUIContainerAccess().getUI_fieldsUIFieldParserRuleCall_6_0_0()); 
            }
            pushFollow(FOLLOW_2);
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
    // InternalVpui.g:2703:1: rule__UIContainer__UI_fieldsAssignment_6_1 : ( ruleUIField ) ;
    public final void rule__UIContainer__UI_fieldsAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVpui.g:2707:1: ( ( ruleUIField ) )
            // InternalVpui.g:2708:1: ( ruleUIField )
            {
            // InternalVpui.g:2708:1: ( ruleUIField )
            // InternalVpui.g:2709:1: ruleUIField
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUIContainerAccess().getUI_fieldsUIFieldParserRuleCall_6_1_0()); 
            }
            pushFollow(FOLLOW_2);
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
    // InternalVpui.g:2718:1: rule__UIContainer__SubContainersAssignment_7_0 : ( ruleUIContainer ) ;
    public final void rule__UIContainer__SubContainersAssignment_7_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVpui.g:2722:1: ( ( ruleUIContainer ) )
            // InternalVpui.g:2723:1: ( ruleUIContainer )
            {
            // InternalVpui.g:2723:1: ( ruleUIContainer )
            // InternalVpui.g:2724:1: ruleUIContainer
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUIContainerAccess().getSubContainersUIContainerParserRuleCall_7_0_0()); 
            }
            pushFollow(FOLLOW_2);
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
    // InternalVpui.g:2733:1: rule__UIContainer__SubContainersAssignment_7_1 : ( ruleUIContainer ) ;
    public final void rule__UIContainer__SubContainersAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVpui.g:2737:1: ( ( ruleUIContainer ) )
            // InternalVpui.g:2738:1: ( ruleUIContainer )
            {
            // InternalVpui.g:2738:1: ( ruleUIContainer )
            // InternalVpui.g:2739:1: ruleUIContainer
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUIContainerAccess().getSubContainersUIContainerParserRuleCall_7_1_0()); 
            }
            pushFollow(FOLLOW_2);
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
    // InternalVpui.g:2748:1: rule__LocalClass__UI_For_LocalClassAssignment_2 : ( ( ruleFQN ) ) ;
    public final void rule__LocalClass__UI_For_LocalClassAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVpui.g:2752:1: ( ( ( ruleFQN ) ) )
            // InternalVpui.g:2753:1: ( ( ruleFQN ) )
            {
            // InternalVpui.g:2753:1: ( ( ruleFQN ) )
            // InternalVpui.g:2754:1: ( ruleFQN )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLocalClassAccess().getUI_For_LocalClassClassCrossReference_2_0()); 
            }
            // InternalVpui.g:2755:1: ( ruleFQN )
            // InternalVpui.g:2756:1: ruleFQN
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLocalClassAccess().getUI_For_LocalClassClassFQNParserRuleCall_2_0_1()); 
            }
            pushFollow(FOLLOW_2);
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
    // InternalVpui.g:2767:1: rule__UIField__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__UIField__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVpui.g:2771:1: ( ( ruleEString ) )
            // InternalVpui.g:2772:1: ( ruleEString )
            {
            // InternalVpui.g:2772:1: ( ruleEString )
            // InternalVpui.g:2773:1: ruleEString
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUIFieldAccess().getNameEStringParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_2);
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
    // InternalVpui.g:2782:1: rule__UIField__LabelAssignment_3_1 : ( ruleEString ) ;
    public final void rule__UIField__LabelAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVpui.g:2786:1: ( ( ruleEString ) )
            // InternalVpui.g:2787:1: ( ruleEString )
            {
            // InternalVpui.g:2787:1: ( ruleEString )
            // InternalVpui.g:2788:1: ruleEString
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUIFieldAccess().getLabelEStringParserRuleCall_3_1_0()); 
            }
            pushFollow(FOLLOW_2);
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
    // InternalVpui.g:2797:1: rule__UIField__DescriptionAssignment_4_1 : ( ruleEString ) ;
    public final void rule__UIField__DescriptionAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVpui.g:2801:1: ( ( ruleEString ) )
            // InternalVpui.g:2802:1: ( ruleEString )
            {
            // InternalVpui.g:2802:1: ( ruleEString )
            // InternalVpui.g:2803:1: ruleEString
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUIFieldAccess().getDescriptionEStringParserRuleCall_4_1_0()); 
            }
            pushFollow(FOLLOW_2);
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
    // InternalVpui.g:2812:1: rule__UIField__TypeAssignment_5_1 : ( ruleUI_Field_Type ) ;
    public final void rule__UIField__TypeAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVpui.g:2816:1: ( ( ruleUI_Field_Type ) )
            // InternalVpui.g:2817:1: ( ruleUI_Field_Type )
            {
            // InternalVpui.g:2817:1: ( ruleUI_Field_Type )
            // InternalVpui.g:2818:1: ruleUI_Field_Type
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUIFieldAccess().getTypeUI_Field_TypeEnumRuleCall_5_1_0()); 
            }
            pushFollow(FOLLOW_2);
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
    // InternalVpui.g:2827:1: rule__UIField__MappingAssignment_7 : ( ruleFieldMapping ) ;
    public final void rule__UIField__MappingAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVpui.g:2831:1: ( ( ruleFieldMapping ) )
            // InternalVpui.g:2832:1: ( ruleFieldMapping )
            {
            // InternalVpui.g:2832:1: ( ruleFieldMapping )
            // InternalVpui.g:2833:1: ruleFieldMapping
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUIFieldAccess().getMappingFieldMappingParserRuleCall_7_0()); 
            }
            pushFollow(FOLLOW_2);
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
    // InternalVpui.g:2842:1: rule__FieldMapping__UI_Field_Mapped_ToAssignment_2 : ( ( ruleFQN ) ) ;
    public final void rule__FieldMapping__UI_Field_Mapped_ToAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVpui.g:2846:1: ( ( ( ruleFQN ) ) )
            // InternalVpui.g:2847:1: ( ( ruleFQN ) )
            {
            // InternalVpui.g:2847:1: ( ( ruleFQN ) )
            // InternalVpui.g:2848:1: ( ruleFQN )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldMappingAccess().getUI_Field_Mapped_ToAbstractFeatureCrossReference_2_0()); 
            }
            // InternalVpui.g:2849:1: ( ruleFQN )
            // InternalVpui.g:2850:1: ruleFQN
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldMappingAccess().getUI_Field_Mapped_ToAbstractFeatureFQNParserRuleCall_2_0_1()); 
            }
            pushFollow(FOLLOW_2);
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


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000600000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000004100030L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000001A00000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000100030L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x000000000BA00000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000032800000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x000000000003F800L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000080000002L});

}
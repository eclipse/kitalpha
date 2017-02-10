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
import org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ActivityexplorerGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalActivityexplorerParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'true'", "'false'", "'activity-explorer'", "'{'", "'}'", "'pages'", "'page'", "'index'", "'description'", "'file-extension'", "'id'", "'label'", "'header'", "'image-on'", "':'", "'image-off'", "'tab-name'", "'predicated'", "'show-viewer'", "'sections'", "'section'", "'filtering'", "'expanded'", "'activities'", "'activity'", "'icon'", "'page-extensions'", "'extended-page'", "'section-extensions'", "'extended-section'", "'Overview'", "'.'"
    };
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__37=37;
    public static final int T__16=16;
    public static final int T__38=38;
    public static final int T__17=17;
    public static final int T__39=39;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__33=33;
    public static final int T__12=12;
    public static final int T__34=34;
    public static final int T__13=13;
    public static final int T__35=35;
    public static final int T__14=14;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
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
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__20=20;
    public static final int T__42=42;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalActivityexplorerParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalActivityexplorerParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalActivityexplorerParser.tokenNames; }
    public String getGrammarFileName() { return "InternalActivityexplorer.g"; }


     
     	private ActivityexplorerGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(ActivityexplorerGrammarAccess grammarAccess) {
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




    // $ANTLR start "entryRuleViewpointActivityExplorer"
    // InternalActivityexplorer.g:61:1: entryRuleViewpointActivityExplorer : ruleViewpointActivityExplorer EOF ;
    public final void entryRuleViewpointActivityExplorer() throws RecognitionException {
        try {
            // InternalActivityexplorer.g:62:1: ( ruleViewpointActivityExplorer EOF )
            // InternalActivityexplorer.g:63:1: ruleViewpointActivityExplorer EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getViewpointActivityExplorerRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleViewpointActivityExplorer();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getViewpointActivityExplorerRule()); 
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
    // $ANTLR end "entryRuleViewpointActivityExplorer"


    // $ANTLR start "ruleViewpointActivityExplorer"
    // InternalActivityexplorer.g:70:1: ruleViewpointActivityExplorer : ( ( rule__ViewpointActivityExplorer__Group__0 ) ) ;
    public final void ruleViewpointActivityExplorer() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActivityexplorer.g:74:2: ( ( ( rule__ViewpointActivityExplorer__Group__0 ) ) )
            // InternalActivityexplorer.g:75:1: ( ( rule__ViewpointActivityExplorer__Group__0 ) )
            {
            // InternalActivityexplorer.g:75:1: ( ( rule__ViewpointActivityExplorer__Group__0 ) )
            // InternalActivityexplorer.g:76:1: ( rule__ViewpointActivityExplorer__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getViewpointActivityExplorerAccess().getGroup()); 
            }
            // InternalActivityexplorer.g:77:1: ( rule__ViewpointActivityExplorer__Group__0 )
            // InternalActivityexplorer.g:77:2: rule__ViewpointActivityExplorer__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ViewpointActivityExplorer__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getViewpointActivityExplorerAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleViewpointActivityExplorer"


    // $ANTLR start "entryRulePage"
    // InternalActivityexplorer.g:91:1: entryRulePage : rulePage EOF ;
    public final void entryRulePage() throws RecognitionException {
        try {
            // InternalActivityexplorer.g:92:1: ( rulePage EOF )
            // InternalActivityexplorer.g:93:1: rulePage EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPageRule()); 
            }
            pushFollow(FOLLOW_1);
            rulePage();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPageRule()); 
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
    // $ANTLR end "entryRulePage"


    // $ANTLR start "rulePage"
    // InternalActivityexplorer.g:100:1: rulePage : ( ( rule__Page__Group__0 ) ) ;
    public final void rulePage() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActivityexplorer.g:104:2: ( ( ( rule__Page__Group__0 ) ) )
            // InternalActivityexplorer.g:105:1: ( ( rule__Page__Group__0 ) )
            {
            // InternalActivityexplorer.g:105:1: ( ( rule__Page__Group__0 ) )
            // InternalActivityexplorer.g:106:1: ( rule__Page__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPageAccess().getGroup()); 
            }
            // InternalActivityexplorer.g:107:1: ( rule__Page__Group__0 )
            // InternalActivityexplorer.g:107:2: rule__Page__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Page__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPageAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePage"


    // $ANTLR start "entryRuleSection"
    // InternalActivityexplorer.g:119:1: entryRuleSection : ruleSection EOF ;
    public final void entryRuleSection() throws RecognitionException {
        try {
            // InternalActivityexplorer.g:120:1: ( ruleSection EOF )
            // InternalActivityexplorer.g:121:1: ruleSection EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSectionRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleSection();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSectionRule()); 
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
    // $ANTLR end "entryRuleSection"


    // $ANTLR start "ruleSection"
    // InternalActivityexplorer.g:128:1: ruleSection : ( ( rule__Section__Group__0 ) ) ;
    public final void ruleSection() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActivityexplorer.g:132:2: ( ( ( rule__Section__Group__0 ) ) )
            // InternalActivityexplorer.g:133:1: ( ( rule__Section__Group__0 ) )
            {
            // InternalActivityexplorer.g:133:1: ( ( rule__Section__Group__0 ) )
            // InternalActivityexplorer.g:134:1: ( rule__Section__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSectionAccess().getGroup()); 
            }
            // InternalActivityexplorer.g:135:1: ( rule__Section__Group__0 )
            // InternalActivityexplorer.g:135:2: rule__Section__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Section__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSectionAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSection"


    // $ANTLR start "entryRuleActivity"
    // InternalActivityexplorer.g:147:1: entryRuleActivity : ruleActivity EOF ;
    public final void entryRuleActivity() throws RecognitionException {
        try {
            // InternalActivityexplorer.g:148:1: ( ruleActivity EOF )
            // InternalActivityexplorer.g:149:1: ruleActivity EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getActivityRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleActivity();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getActivityRule()); 
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
    // $ANTLR end "entryRuleActivity"


    // $ANTLR start "ruleActivity"
    // InternalActivityexplorer.g:156:1: ruleActivity : ( ( rule__Activity__Group__0 ) ) ;
    public final void ruleActivity() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActivityexplorer.g:160:2: ( ( ( rule__Activity__Group__0 ) ) )
            // InternalActivityexplorer.g:161:1: ( ( rule__Activity__Group__0 ) )
            {
            // InternalActivityexplorer.g:161:1: ( ( rule__Activity__Group__0 ) )
            // InternalActivityexplorer.g:162:1: ( rule__Activity__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getActivityAccess().getGroup()); 
            }
            // InternalActivityexplorer.g:163:1: ( rule__Activity__Group__0 )
            // InternalActivityexplorer.g:163:2: rule__Activity__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Activity__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getActivityAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleActivity"


    // $ANTLR start "entryRulePageExtension"
    // InternalActivityexplorer.g:175:1: entryRulePageExtension : rulePageExtension EOF ;
    public final void entryRulePageExtension() throws RecognitionException {
        try {
            // InternalActivityexplorer.g:176:1: ( rulePageExtension EOF )
            // InternalActivityexplorer.g:177:1: rulePageExtension EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPageExtensionRule()); 
            }
            pushFollow(FOLLOW_1);
            rulePageExtension();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPageExtensionRule()); 
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
    // $ANTLR end "entryRulePageExtension"


    // $ANTLR start "rulePageExtension"
    // InternalActivityexplorer.g:184:1: rulePageExtension : ( ( rule__PageExtension__Group__0 ) ) ;
    public final void rulePageExtension() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActivityexplorer.g:188:2: ( ( ( rule__PageExtension__Group__0 ) ) )
            // InternalActivityexplorer.g:189:1: ( ( rule__PageExtension__Group__0 ) )
            {
            // InternalActivityexplorer.g:189:1: ( ( rule__PageExtension__Group__0 ) )
            // InternalActivityexplorer.g:190:1: ( rule__PageExtension__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPageExtensionAccess().getGroup()); 
            }
            // InternalActivityexplorer.g:191:1: ( rule__PageExtension__Group__0 )
            // InternalActivityexplorer.g:191:2: rule__PageExtension__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__PageExtension__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPageExtensionAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePageExtension"


    // $ANTLR start "entryRuleSectionExtension"
    // InternalActivityexplorer.g:203:1: entryRuleSectionExtension : ruleSectionExtension EOF ;
    public final void entryRuleSectionExtension() throws RecognitionException {
        try {
            // InternalActivityexplorer.g:204:1: ( ruleSectionExtension EOF )
            // InternalActivityexplorer.g:205:1: ruleSectionExtension EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSectionExtensionRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleSectionExtension();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSectionExtensionRule()); 
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
    // $ANTLR end "entryRuleSectionExtension"


    // $ANTLR start "ruleSectionExtension"
    // InternalActivityexplorer.g:212:1: ruleSectionExtension : ( ( rule__SectionExtension__Group__0 ) ) ;
    public final void ruleSectionExtension() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActivityexplorer.g:216:2: ( ( ( rule__SectionExtension__Group__0 ) ) )
            // InternalActivityexplorer.g:217:1: ( ( rule__SectionExtension__Group__0 ) )
            {
            // InternalActivityexplorer.g:217:1: ( ( rule__SectionExtension__Group__0 ) )
            // InternalActivityexplorer.g:218:1: ( rule__SectionExtension__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSectionExtensionAccess().getGroup()); 
            }
            // InternalActivityexplorer.g:219:1: ( rule__SectionExtension__Group__0 )
            // InternalActivityexplorer.g:219:2: rule__SectionExtension__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SectionExtension__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSectionExtensionAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSectionExtension"


    // $ANTLR start "entryRuleOverview"
    // InternalActivityexplorer.g:231:1: entryRuleOverview : ruleOverview EOF ;
    public final void entryRuleOverview() throws RecognitionException {
        try {
            // InternalActivityexplorer.g:232:1: ( ruleOverview EOF )
            // InternalActivityexplorer.g:233:1: ruleOverview EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOverviewRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleOverview();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOverviewRule()); 
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
    // $ANTLR end "entryRuleOverview"


    // $ANTLR start "ruleOverview"
    // InternalActivityexplorer.g:240:1: ruleOverview : ( ( rule__Overview__Group__0 ) ) ;
    public final void ruleOverview() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActivityexplorer.g:244:2: ( ( ( rule__Overview__Group__0 ) ) )
            // InternalActivityexplorer.g:245:1: ( ( rule__Overview__Group__0 ) )
            {
            // InternalActivityexplorer.g:245:1: ( ( rule__Overview__Group__0 ) )
            // InternalActivityexplorer.g:246:1: ( rule__Overview__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOverviewAccess().getGroup()); 
            }
            // InternalActivityexplorer.g:247:1: ( rule__Overview__Group__0 )
            // InternalActivityexplorer.g:247:2: rule__Overview__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Overview__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOverviewAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOverview"


    // $ANTLR start "entryRuleFQN"
    // InternalActivityexplorer.g:261:1: entryRuleFQN : ruleFQN EOF ;
    public final void entryRuleFQN() throws RecognitionException {
        try {
            // InternalActivityexplorer.g:262:1: ( ruleFQN EOF )
            // InternalActivityexplorer.g:263:1: ruleFQN EOF
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
    // InternalActivityexplorer.g:270:1: ruleFQN : ( ( rule__FQN__Group__0 ) ) ;
    public final void ruleFQN() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActivityexplorer.g:274:2: ( ( ( rule__FQN__Group__0 ) ) )
            // InternalActivityexplorer.g:275:1: ( ( rule__FQN__Group__0 ) )
            {
            // InternalActivityexplorer.g:275:1: ( ( rule__FQN__Group__0 ) )
            // InternalActivityexplorer.g:276:1: ( rule__FQN__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFQNAccess().getGroup()); 
            }
            // InternalActivityexplorer.g:277:1: ( rule__FQN__Group__0 )
            // InternalActivityexplorer.g:277:2: rule__FQN__Group__0
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
    // InternalActivityexplorer.g:289:1: entryRuleEBoolean : ruleEBoolean EOF ;
    public final void entryRuleEBoolean() throws RecognitionException {
        try {
            // InternalActivityexplorer.g:290:1: ( ruleEBoolean EOF )
            // InternalActivityexplorer.g:291:1: ruleEBoolean EOF
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
    // InternalActivityexplorer.g:298:1: ruleEBoolean : ( ( rule__EBoolean__Alternatives ) ) ;
    public final void ruleEBoolean() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActivityexplorer.g:302:2: ( ( ( rule__EBoolean__Alternatives ) ) )
            // InternalActivityexplorer.g:303:1: ( ( rule__EBoolean__Alternatives ) )
            {
            // InternalActivityexplorer.g:303:1: ( ( rule__EBoolean__Alternatives ) )
            // InternalActivityexplorer.g:304:1: ( rule__EBoolean__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEBooleanAccess().getAlternatives()); 
            }
            // InternalActivityexplorer.g:305:1: ( rule__EBoolean__Alternatives )
            // InternalActivityexplorer.g:305:2: rule__EBoolean__Alternatives
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


    // $ANTLR start "entryRuleEInt"
    // InternalActivityexplorer.g:317:1: entryRuleEInt : ruleEInt EOF ;
    public final void entryRuleEInt() throws RecognitionException {
        try {
            // InternalActivityexplorer.g:318:1: ( ruleEInt EOF )
            // InternalActivityexplorer.g:319:1: ruleEInt EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEIntRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleEInt();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEIntRule()); 
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
    // $ANTLR end "entryRuleEInt"


    // $ANTLR start "ruleEInt"
    // InternalActivityexplorer.g:326:1: ruleEInt : ( RULE_INT ) ;
    public final void ruleEInt() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActivityexplorer.g:330:2: ( ( RULE_INT ) )
            // InternalActivityexplorer.g:331:1: ( RULE_INT )
            {
            // InternalActivityexplorer.g:331:1: ( RULE_INT )
            // InternalActivityexplorer.g:332:1: RULE_INT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEIntAccess().getINTTerminalRuleCall()); 
            }
            match(input,RULE_INT,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEIntAccess().getINTTerminalRuleCall()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEInt"


    // $ANTLR start "rule__EBoolean__Alternatives"
    // InternalActivityexplorer.g:347:1: rule__EBoolean__Alternatives : ( ( 'true' ) | ( 'false' ) );
    public final void rule__EBoolean__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActivityexplorer.g:351:1: ( ( 'true' ) | ( 'false' ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==11) ) {
                alt1=1;
            }
            else if ( (LA1_0==12) ) {
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
                    // InternalActivityexplorer.g:352:1: ( 'true' )
                    {
                    // InternalActivityexplorer.g:352:1: ( 'true' )
                    // InternalActivityexplorer.g:353:1: 'true'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEBooleanAccess().getTrueKeyword_0()); 
                    }
                    match(input,11,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEBooleanAccess().getTrueKeyword_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalActivityexplorer.g:360:6: ( 'false' )
                    {
                    // InternalActivityexplorer.g:360:6: ( 'false' )
                    // InternalActivityexplorer.g:361:1: 'false'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEBooleanAccess().getFalseKeyword_1()); 
                    }
                    match(input,12,FOLLOW_2); if (state.failed) return ;
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


    // $ANTLR start "rule__ViewpointActivityExplorer__Group__0"
    // InternalActivityexplorer.g:375:1: rule__ViewpointActivityExplorer__Group__0 : rule__ViewpointActivityExplorer__Group__0__Impl rule__ViewpointActivityExplorer__Group__1 ;
    public final void rule__ViewpointActivityExplorer__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActivityexplorer.g:379:1: ( rule__ViewpointActivityExplorer__Group__0__Impl rule__ViewpointActivityExplorer__Group__1 )
            // InternalActivityexplorer.g:380:2: rule__ViewpointActivityExplorer__Group__0__Impl rule__ViewpointActivityExplorer__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__ViewpointActivityExplorer__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ViewpointActivityExplorer__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ViewpointActivityExplorer__Group__0"


    // $ANTLR start "rule__ViewpointActivityExplorer__Group__0__Impl"
    // InternalActivityexplorer.g:387:1: rule__ViewpointActivityExplorer__Group__0__Impl : ( () ) ;
    public final void rule__ViewpointActivityExplorer__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActivityexplorer.g:391:1: ( ( () ) )
            // InternalActivityexplorer.g:392:1: ( () )
            {
            // InternalActivityexplorer.g:392:1: ( () )
            // InternalActivityexplorer.g:393:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getViewpointActivityExplorerAccess().getViewpointActivityExplorerAction_0()); 
            }
            // InternalActivityexplorer.g:394:1: ()
            // InternalActivityexplorer.g:396:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getViewpointActivityExplorerAccess().getViewpointActivityExplorerAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ViewpointActivityExplorer__Group__0__Impl"


    // $ANTLR start "rule__ViewpointActivityExplorer__Group__1"
    // InternalActivityexplorer.g:406:1: rule__ViewpointActivityExplorer__Group__1 : rule__ViewpointActivityExplorer__Group__1__Impl rule__ViewpointActivityExplorer__Group__2 ;
    public final void rule__ViewpointActivityExplorer__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActivityexplorer.g:410:1: ( rule__ViewpointActivityExplorer__Group__1__Impl rule__ViewpointActivityExplorer__Group__2 )
            // InternalActivityexplorer.g:411:2: rule__ViewpointActivityExplorer__Group__1__Impl rule__ViewpointActivityExplorer__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__ViewpointActivityExplorer__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ViewpointActivityExplorer__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ViewpointActivityExplorer__Group__1"


    // $ANTLR start "rule__ViewpointActivityExplorer__Group__1__Impl"
    // InternalActivityexplorer.g:418:1: rule__ViewpointActivityExplorer__Group__1__Impl : ( 'activity-explorer' ) ;
    public final void rule__ViewpointActivityExplorer__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActivityexplorer.g:422:1: ( ( 'activity-explorer' ) )
            // InternalActivityexplorer.g:423:1: ( 'activity-explorer' )
            {
            // InternalActivityexplorer.g:423:1: ( 'activity-explorer' )
            // InternalActivityexplorer.g:424:1: 'activity-explorer'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getViewpointActivityExplorerAccess().getActivityExplorerKeyword_1()); 
            }
            match(input,13,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getViewpointActivityExplorerAccess().getActivityExplorerKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ViewpointActivityExplorer__Group__1__Impl"


    // $ANTLR start "rule__ViewpointActivityExplorer__Group__2"
    // InternalActivityexplorer.g:437:1: rule__ViewpointActivityExplorer__Group__2 : rule__ViewpointActivityExplorer__Group__2__Impl rule__ViewpointActivityExplorer__Group__3 ;
    public final void rule__ViewpointActivityExplorer__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActivityexplorer.g:441:1: ( rule__ViewpointActivityExplorer__Group__2__Impl rule__ViewpointActivityExplorer__Group__3 )
            // InternalActivityexplorer.g:442:2: rule__ViewpointActivityExplorer__Group__2__Impl rule__ViewpointActivityExplorer__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__ViewpointActivityExplorer__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ViewpointActivityExplorer__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ViewpointActivityExplorer__Group__2"


    // $ANTLR start "rule__ViewpointActivityExplorer__Group__2__Impl"
    // InternalActivityexplorer.g:449:1: rule__ViewpointActivityExplorer__Group__2__Impl : ( ( rule__ViewpointActivityExplorer__NameAssignment_2 ) ) ;
    public final void rule__ViewpointActivityExplorer__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActivityexplorer.g:453:1: ( ( ( rule__ViewpointActivityExplorer__NameAssignment_2 ) ) )
            // InternalActivityexplorer.g:454:1: ( ( rule__ViewpointActivityExplorer__NameAssignment_2 ) )
            {
            // InternalActivityexplorer.g:454:1: ( ( rule__ViewpointActivityExplorer__NameAssignment_2 ) )
            // InternalActivityexplorer.g:455:1: ( rule__ViewpointActivityExplorer__NameAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getViewpointActivityExplorerAccess().getNameAssignment_2()); 
            }
            // InternalActivityexplorer.g:456:1: ( rule__ViewpointActivityExplorer__NameAssignment_2 )
            // InternalActivityexplorer.g:456:2: rule__ViewpointActivityExplorer__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__ViewpointActivityExplorer__NameAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getViewpointActivityExplorerAccess().getNameAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ViewpointActivityExplorer__Group__2__Impl"


    // $ANTLR start "rule__ViewpointActivityExplorer__Group__3"
    // InternalActivityexplorer.g:466:1: rule__ViewpointActivityExplorer__Group__3 : rule__ViewpointActivityExplorer__Group__3__Impl rule__ViewpointActivityExplorer__Group__4 ;
    public final void rule__ViewpointActivityExplorer__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActivityexplorer.g:470:1: ( rule__ViewpointActivityExplorer__Group__3__Impl rule__ViewpointActivityExplorer__Group__4 )
            // InternalActivityexplorer.g:471:2: rule__ViewpointActivityExplorer__Group__3__Impl rule__ViewpointActivityExplorer__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__ViewpointActivityExplorer__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ViewpointActivityExplorer__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ViewpointActivityExplorer__Group__3"


    // $ANTLR start "rule__ViewpointActivityExplorer__Group__3__Impl"
    // InternalActivityexplorer.g:478:1: rule__ViewpointActivityExplorer__Group__3__Impl : ( '{' ) ;
    public final void rule__ViewpointActivityExplorer__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActivityexplorer.g:482:1: ( ( '{' ) )
            // InternalActivityexplorer.g:483:1: ( '{' )
            {
            // InternalActivityexplorer.g:483:1: ( '{' )
            // InternalActivityexplorer.g:484:1: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getViewpointActivityExplorerAccess().getLeftCurlyBracketKeyword_3()); 
            }
            match(input,14,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getViewpointActivityExplorerAccess().getLeftCurlyBracketKeyword_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ViewpointActivityExplorer__Group__3__Impl"


    // $ANTLR start "rule__ViewpointActivityExplorer__Group__4"
    // InternalActivityexplorer.g:497:1: rule__ViewpointActivityExplorer__Group__4 : rule__ViewpointActivityExplorer__Group__4__Impl rule__ViewpointActivityExplorer__Group__5 ;
    public final void rule__ViewpointActivityExplorer__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActivityexplorer.g:501:1: ( rule__ViewpointActivityExplorer__Group__4__Impl rule__ViewpointActivityExplorer__Group__5 )
            // InternalActivityexplorer.g:502:2: rule__ViewpointActivityExplorer__Group__4__Impl rule__ViewpointActivityExplorer__Group__5
            {
            pushFollow(FOLLOW_6);
            rule__ViewpointActivityExplorer__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ViewpointActivityExplorer__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ViewpointActivityExplorer__Group__4"


    // $ANTLR start "rule__ViewpointActivityExplorer__Group__4__Impl"
    // InternalActivityexplorer.g:509:1: rule__ViewpointActivityExplorer__Group__4__Impl : ( ( rule__ViewpointActivityExplorer__Group_4__0 )? ) ;
    public final void rule__ViewpointActivityExplorer__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActivityexplorer.g:513:1: ( ( ( rule__ViewpointActivityExplorer__Group_4__0 )? ) )
            // InternalActivityexplorer.g:514:1: ( ( rule__ViewpointActivityExplorer__Group_4__0 )? )
            {
            // InternalActivityexplorer.g:514:1: ( ( rule__ViewpointActivityExplorer__Group_4__0 )? )
            // InternalActivityexplorer.g:515:1: ( rule__ViewpointActivityExplorer__Group_4__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getViewpointActivityExplorerAccess().getGroup_4()); 
            }
            // InternalActivityexplorer.g:516:1: ( rule__ViewpointActivityExplorer__Group_4__0 )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==16) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalActivityexplorer.g:516:2: rule__ViewpointActivityExplorer__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ViewpointActivityExplorer__Group_4__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getViewpointActivityExplorerAccess().getGroup_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ViewpointActivityExplorer__Group__4__Impl"


    // $ANTLR start "rule__ViewpointActivityExplorer__Group__5"
    // InternalActivityexplorer.g:526:1: rule__ViewpointActivityExplorer__Group__5 : rule__ViewpointActivityExplorer__Group__5__Impl rule__ViewpointActivityExplorer__Group__6 ;
    public final void rule__ViewpointActivityExplorer__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActivityexplorer.g:530:1: ( rule__ViewpointActivityExplorer__Group__5__Impl rule__ViewpointActivityExplorer__Group__6 )
            // InternalActivityexplorer.g:531:2: rule__ViewpointActivityExplorer__Group__5__Impl rule__ViewpointActivityExplorer__Group__6
            {
            pushFollow(FOLLOW_6);
            rule__ViewpointActivityExplorer__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ViewpointActivityExplorer__Group__6();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ViewpointActivityExplorer__Group__5"


    // $ANTLR start "rule__ViewpointActivityExplorer__Group__5__Impl"
    // InternalActivityexplorer.g:538:1: rule__ViewpointActivityExplorer__Group__5__Impl : ( ( rule__ViewpointActivityExplorer__OwnedPagesAssignment_5 )* ) ;
    public final void rule__ViewpointActivityExplorer__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActivityexplorer.g:542:1: ( ( ( rule__ViewpointActivityExplorer__OwnedPagesAssignment_5 )* ) )
            // InternalActivityexplorer.g:543:1: ( ( rule__ViewpointActivityExplorer__OwnedPagesAssignment_5 )* )
            {
            // InternalActivityexplorer.g:543:1: ( ( rule__ViewpointActivityExplorer__OwnedPagesAssignment_5 )* )
            // InternalActivityexplorer.g:544:1: ( rule__ViewpointActivityExplorer__OwnedPagesAssignment_5 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getViewpointActivityExplorerAccess().getOwnedPagesAssignment_5()); 
            }
            // InternalActivityexplorer.g:545:1: ( rule__ViewpointActivityExplorer__OwnedPagesAssignment_5 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==37) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalActivityexplorer.g:545:2: rule__ViewpointActivityExplorer__OwnedPagesAssignment_5
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__ViewpointActivityExplorer__OwnedPagesAssignment_5();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getViewpointActivityExplorerAccess().getOwnedPagesAssignment_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ViewpointActivityExplorer__Group__5__Impl"


    // $ANTLR start "rule__ViewpointActivityExplorer__Group__6"
    // InternalActivityexplorer.g:555:1: rule__ViewpointActivityExplorer__Group__6 : rule__ViewpointActivityExplorer__Group__6__Impl rule__ViewpointActivityExplorer__Group__7 ;
    public final void rule__ViewpointActivityExplorer__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActivityexplorer.g:559:1: ( rule__ViewpointActivityExplorer__Group__6__Impl rule__ViewpointActivityExplorer__Group__7 )
            // InternalActivityexplorer.g:560:2: rule__ViewpointActivityExplorer__Group__6__Impl rule__ViewpointActivityExplorer__Group__7
            {
            pushFollow(FOLLOW_6);
            rule__ViewpointActivityExplorer__Group__6__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ViewpointActivityExplorer__Group__7();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ViewpointActivityExplorer__Group__6"


    // $ANTLR start "rule__ViewpointActivityExplorer__Group__6__Impl"
    // InternalActivityexplorer.g:567:1: rule__ViewpointActivityExplorer__Group__6__Impl : ( ( rule__ViewpointActivityExplorer__OwnedSectionExtensionsAssignment_6 )* ) ;
    public final void rule__ViewpointActivityExplorer__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActivityexplorer.g:571:1: ( ( ( rule__ViewpointActivityExplorer__OwnedSectionExtensionsAssignment_6 )* ) )
            // InternalActivityexplorer.g:572:1: ( ( rule__ViewpointActivityExplorer__OwnedSectionExtensionsAssignment_6 )* )
            {
            // InternalActivityexplorer.g:572:1: ( ( rule__ViewpointActivityExplorer__OwnedSectionExtensionsAssignment_6 )* )
            // InternalActivityexplorer.g:573:1: ( rule__ViewpointActivityExplorer__OwnedSectionExtensionsAssignment_6 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getViewpointActivityExplorerAccess().getOwnedSectionExtensionsAssignment_6()); 
            }
            // InternalActivityexplorer.g:574:1: ( rule__ViewpointActivityExplorer__OwnedSectionExtensionsAssignment_6 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==39) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalActivityexplorer.g:574:2: rule__ViewpointActivityExplorer__OwnedSectionExtensionsAssignment_6
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__ViewpointActivityExplorer__OwnedSectionExtensionsAssignment_6();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getViewpointActivityExplorerAccess().getOwnedSectionExtensionsAssignment_6()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ViewpointActivityExplorer__Group__6__Impl"


    // $ANTLR start "rule__ViewpointActivityExplorer__Group__7"
    // InternalActivityexplorer.g:584:1: rule__ViewpointActivityExplorer__Group__7 : rule__ViewpointActivityExplorer__Group__7__Impl ;
    public final void rule__ViewpointActivityExplorer__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActivityexplorer.g:588:1: ( rule__ViewpointActivityExplorer__Group__7__Impl )
            // InternalActivityexplorer.g:589:2: rule__ViewpointActivityExplorer__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ViewpointActivityExplorer__Group__7__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ViewpointActivityExplorer__Group__7"


    // $ANTLR start "rule__ViewpointActivityExplorer__Group__7__Impl"
    // InternalActivityexplorer.g:595:1: rule__ViewpointActivityExplorer__Group__7__Impl : ( '}' ) ;
    public final void rule__ViewpointActivityExplorer__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActivityexplorer.g:599:1: ( ( '}' ) )
            // InternalActivityexplorer.g:600:1: ( '}' )
            {
            // InternalActivityexplorer.g:600:1: ( '}' )
            // InternalActivityexplorer.g:601:1: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getViewpointActivityExplorerAccess().getRightCurlyBracketKeyword_7()); 
            }
            match(input,15,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getViewpointActivityExplorerAccess().getRightCurlyBracketKeyword_7()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ViewpointActivityExplorer__Group__7__Impl"


    // $ANTLR start "rule__ViewpointActivityExplorer__Group_4__0"
    // InternalActivityexplorer.g:630:1: rule__ViewpointActivityExplorer__Group_4__0 : rule__ViewpointActivityExplorer__Group_4__0__Impl rule__ViewpointActivityExplorer__Group_4__1 ;
    public final void rule__ViewpointActivityExplorer__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActivityexplorer.g:634:1: ( rule__ViewpointActivityExplorer__Group_4__0__Impl rule__ViewpointActivityExplorer__Group_4__1 )
            // InternalActivityexplorer.g:635:2: rule__ViewpointActivityExplorer__Group_4__0__Impl rule__ViewpointActivityExplorer__Group_4__1
            {
            pushFollow(FOLLOW_5);
            rule__ViewpointActivityExplorer__Group_4__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ViewpointActivityExplorer__Group_4__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ViewpointActivityExplorer__Group_4__0"


    // $ANTLR start "rule__ViewpointActivityExplorer__Group_4__0__Impl"
    // InternalActivityexplorer.g:642:1: rule__ViewpointActivityExplorer__Group_4__0__Impl : ( 'pages' ) ;
    public final void rule__ViewpointActivityExplorer__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActivityexplorer.g:646:1: ( ( 'pages' ) )
            // InternalActivityexplorer.g:647:1: ( 'pages' )
            {
            // InternalActivityexplorer.g:647:1: ( 'pages' )
            // InternalActivityexplorer.g:648:1: 'pages'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getViewpointActivityExplorerAccess().getPagesKeyword_4_0()); 
            }
            match(input,16,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getViewpointActivityExplorerAccess().getPagesKeyword_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ViewpointActivityExplorer__Group_4__0__Impl"


    // $ANTLR start "rule__ViewpointActivityExplorer__Group_4__1"
    // InternalActivityexplorer.g:661:1: rule__ViewpointActivityExplorer__Group_4__1 : rule__ViewpointActivityExplorer__Group_4__1__Impl rule__ViewpointActivityExplorer__Group_4__2 ;
    public final void rule__ViewpointActivityExplorer__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActivityexplorer.g:665:1: ( rule__ViewpointActivityExplorer__Group_4__1__Impl rule__ViewpointActivityExplorer__Group_4__2 )
            // InternalActivityexplorer.g:666:2: rule__ViewpointActivityExplorer__Group_4__1__Impl rule__ViewpointActivityExplorer__Group_4__2
            {
            pushFollow(FOLLOW_9);
            rule__ViewpointActivityExplorer__Group_4__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ViewpointActivityExplorer__Group_4__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ViewpointActivityExplorer__Group_4__1"


    // $ANTLR start "rule__ViewpointActivityExplorer__Group_4__1__Impl"
    // InternalActivityexplorer.g:673:1: rule__ViewpointActivityExplorer__Group_4__1__Impl : ( '{' ) ;
    public final void rule__ViewpointActivityExplorer__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActivityexplorer.g:677:1: ( ( '{' ) )
            // InternalActivityexplorer.g:678:1: ( '{' )
            {
            // InternalActivityexplorer.g:678:1: ( '{' )
            // InternalActivityexplorer.g:679:1: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getViewpointActivityExplorerAccess().getLeftCurlyBracketKeyword_4_1()); 
            }
            match(input,14,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getViewpointActivityExplorerAccess().getLeftCurlyBracketKeyword_4_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ViewpointActivityExplorer__Group_4__1__Impl"


    // $ANTLR start "rule__ViewpointActivityExplorer__Group_4__2"
    // InternalActivityexplorer.g:692:1: rule__ViewpointActivityExplorer__Group_4__2 : rule__ViewpointActivityExplorer__Group_4__2__Impl rule__ViewpointActivityExplorer__Group_4__3 ;
    public final void rule__ViewpointActivityExplorer__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActivityexplorer.g:696:1: ( rule__ViewpointActivityExplorer__Group_4__2__Impl rule__ViewpointActivityExplorer__Group_4__3 )
            // InternalActivityexplorer.g:697:2: rule__ViewpointActivityExplorer__Group_4__2__Impl rule__ViewpointActivityExplorer__Group_4__3
            {
            pushFollow(FOLLOW_9);
            rule__ViewpointActivityExplorer__Group_4__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ViewpointActivityExplorer__Group_4__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ViewpointActivityExplorer__Group_4__2"


    // $ANTLR start "rule__ViewpointActivityExplorer__Group_4__2__Impl"
    // InternalActivityexplorer.g:704:1: rule__ViewpointActivityExplorer__Group_4__2__Impl : ( ( rule__ViewpointActivityExplorer__OwnedPagesAssignment_4_2 )* ) ;
    public final void rule__ViewpointActivityExplorer__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActivityexplorer.g:708:1: ( ( ( rule__ViewpointActivityExplorer__OwnedPagesAssignment_4_2 )* ) )
            // InternalActivityexplorer.g:709:1: ( ( rule__ViewpointActivityExplorer__OwnedPagesAssignment_4_2 )* )
            {
            // InternalActivityexplorer.g:709:1: ( ( rule__ViewpointActivityExplorer__OwnedPagesAssignment_4_2 )* )
            // InternalActivityexplorer.g:710:1: ( rule__ViewpointActivityExplorer__OwnedPagesAssignment_4_2 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getViewpointActivityExplorerAccess().getOwnedPagesAssignment_4_2()); 
            }
            // InternalActivityexplorer.g:711:1: ( rule__ViewpointActivityExplorer__OwnedPagesAssignment_4_2 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==17) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalActivityexplorer.g:711:2: rule__ViewpointActivityExplorer__OwnedPagesAssignment_4_2
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__ViewpointActivityExplorer__OwnedPagesAssignment_4_2();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getViewpointActivityExplorerAccess().getOwnedPagesAssignment_4_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ViewpointActivityExplorer__Group_4__2__Impl"


    // $ANTLR start "rule__ViewpointActivityExplorer__Group_4__3"
    // InternalActivityexplorer.g:721:1: rule__ViewpointActivityExplorer__Group_4__3 : rule__ViewpointActivityExplorer__Group_4__3__Impl ;
    public final void rule__ViewpointActivityExplorer__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActivityexplorer.g:725:1: ( rule__ViewpointActivityExplorer__Group_4__3__Impl )
            // InternalActivityexplorer.g:726:2: rule__ViewpointActivityExplorer__Group_4__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ViewpointActivityExplorer__Group_4__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ViewpointActivityExplorer__Group_4__3"


    // $ANTLR start "rule__ViewpointActivityExplorer__Group_4__3__Impl"
    // InternalActivityexplorer.g:732:1: rule__ViewpointActivityExplorer__Group_4__3__Impl : ( '}' ) ;
    public final void rule__ViewpointActivityExplorer__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActivityexplorer.g:736:1: ( ( '}' ) )
            // InternalActivityexplorer.g:737:1: ( '}' )
            {
            // InternalActivityexplorer.g:737:1: ( '}' )
            // InternalActivityexplorer.g:738:1: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getViewpointActivityExplorerAccess().getRightCurlyBracketKeyword_4_3()); 
            }
            match(input,15,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getViewpointActivityExplorerAccess().getRightCurlyBracketKeyword_4_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ViewpointActivityExplorer__Group_4__3__Impl"


    // $ANTLR start "rule__Page__Group__0"
    // InternalActivityexplorer.g:759:1: rule__Page__Group__0 : rule__Page__Group__0__Impl rule__Page__Group__1 ;
    public final void rule__Page__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActivityexplorer.g:763:1: ( rule__Page__Group__0__Impl rule__Page__Group__1 )
            // InternalActivityexplorer.g:764:2: rule__Page__Group__0__Impl rule__Page__Group__1
            {
            pushFollow(FOLLOW_11);
            rule__Page__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Page__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__Group__0"


    // $ANTLR start "rule__Page__Group__0__Impl"
    // InternalActivityexplorer.g:771:1: rule__Page__Group__0__Impl : ( () ) ;
    public final void rule__Page__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActivityexplorer.g:775:1: ( ( () ) )
            // InternalActivityexplorer.g:776:1: ( () )
            {
            // InternalActivityexplorer.g:776:1: ( () )
            // InternalActivityexplorer.g:777:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPageAccess().getPageAction_0()); 
            }
            // InternalActivityexplorer.g:778:1: ()
            // InternalActivityexplorer.g:780:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPageAccess().getPageAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__Group__0__Impl"


    // $ANTLR start "rule__Page__Group__1"
    // InternalActivityexplorer.g:790:1: rule__Page__Group__1 : rule__Page__Group__1__Impl rule__Page__Group__2 ;
    public final void rule__Page__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActivityexplorer.g:794:1: ( rule__Page__Group__1__Impl rule__Page__Group__2 )
            // InternalActivityexplorer.g:795:2: rule__Page__Group__1__Impl rule__Page__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Page__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Page__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__Group__1"


    // $ANTLR start "rule__Page__Group__1__Impl"
    // InternalActivityexplorer.g:802:1: rule__Page__Group__1__Impl : ( 'page' ) ;
    public final void rule__Page__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActivityexplorer.g:806:1: ( ( 'page' ) )
            // InternalActivityexplorer.g:807:1: ( 'page' )
            {
            // InternalActivityexplorer.g:807:1: ( 'page' )
            // InternalActivityexplorer.g:808:1: 'page'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPageAccess().getPageKeyword_1()); 
            }
            match(input,17,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPageAccess().getPageKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__Group__1__Impl"


    // $ANTLR start "rule__Page__Group__2"
    // InternalActivityexplorer.g:821:1: rule__Page__Group__2 : rule__Page__Group__2__Impl rule__Page__Group__3 ;
    public final void rule__Page__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActivityexplorer.g:825:1: ( rule__Page__Group__2__Impl rule__Page__Group__3 )
            // InternalActivityexplorer.g:826:2: rule__Page__Group__2__Impl rule__Page__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__Page__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Page__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__Group__2"


    // $ANTLR start "rule__Page__Group__2__Impl"
    // InternalActivityexplorer.g:833:1: rule__Page__Group__2__Impl : ( ( rule__Page__NameAssignment_2 ) ) ;
    public final void rule__Page__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActivityexplorer.g:837:1: ( ( ( rule__Page__NameAssignment_2 ) ) )
            // InternalActivityexplorer.g:838:1: ( ( rule__Page__NameAssignment_2 ) )
            {
            // InternalActivityexplorer.g:838:1: ( ( rule__Page__NameAssignment_2 ) )
            // InternalActivityexplorer.g:839:1: ( rule__Page__NameAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPageAccess().getNameAssignment_2()); 
            }
            // InternalActivityexplorer.g:840:1: ( rule__Page__NameAssignment_2 )
            // InternalActivityexplorer.g:840:2: rule__Page__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Page__NameAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPageAccess().getNameAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__Group__2__Impl"


    // $ANTLR start "rule__Page__Group__3"
    // InternalActivityexplorer.g:850:1: rule__Page__Group__3 : rule__Page__Group__3__Impl rule__Page__Group__4 ;
    public final void rule__Page__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActivityexplorer.g:854:1: ( rule__Page__Group__3__Impl rule__Page__Group__4 )
            // InternalActivityexplorer.g:855:2: rule__Page__Group__3__Impl rule__Page__Group__4
            {
            pushFollow(FOLLOW_12);
            rule__Page__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Page__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__Group__3"


    // $ANTLR start "rule__Page__Group__3__Impl"
    // InternalActivityexplorer.g:862:1: rule__Page__Group__3__Impl : ( '{' ) ;
    public final void rule__Page__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActivityexplorer.g:866:1: ( ( '{' ) )
            // InternalActivityexplorer.g:867:1: ( '{' )
            {
            // InternalActivityexplorer.g:867:1: ( '{' )
            // InternalActivityexplorer.g:868:1: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPageAccess().getLeftCurlyBracketKeyword_3()); 
            }
            match(input,14,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPageAccess().getLeftCurlyBracketKeyword_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__Group__3__Impl"


    // $ANTLR start "rule__Page__Group__4"
    // InternalActivityexplorer.g:881:1: rule__Page__Group__4 : rule__Page__Group__4__Impl rule__Page__Group__5 ;
    public final void rule__Page__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActivityexplorer.g:885:1: ( rule__Page__Group__4__Impl rule__Page__Group__5 )
            // InternalActivityexplorer.g:886:2: rule__Page__Group__4__Impl rule__Page__Group__5
            {
            pushFollow(FOLLOW_12);
            rule__Page__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Page__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__Group__4"


    // $ANTLR start "rule__Page__Group__4__Impl"
    // InternalActivityexplorer.g:893:1: rule__Page__Group__4__Impl : ( ( rule__Page__Group_4__0 )? ) ;
    public final void rule__Page__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActivityexplorer.g:897:1: ( ( ( rule__Page__Group_4__0 )? ) )
            // InternalActivityexplorer.g:898:1: ( ( rule__Page__Group_4__0 )? )
            {
            // InternalActivityexplorer.g:898:1: ( ( rule__Page__Group_4__0 )? )
            // InternalActivityexplorer.g:899:1: ( rule__Page__Group_4__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPageAccess().getGroup_4()); 
            }
            // InternalActivityexplorer.g:900:1: ( rule__Page__Group_4__0 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==19) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalActivityexplorer.g:900:2: rule__Page__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Page__Group_4__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPageAccess().getGroup_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__Group__4__Impl"


    // $ANTLR start "rule__Page__Group__5"
    // InternalActivityexplorer.g:910:1: rule__Page__Group__5 : rule__Page__Group__5__Impl rule__Page__Group__6 ;
    public final void rule__Page__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActivityexplorer.g:914:1: ( rule__Page__Group__5__Impl rule__Page__Group__6 )
            // InternalActivityexplorer.g:915:2: rule__Page__Group__5__Impl rule__Page__Group__6
            {
            pushFollow(FOLLOW_12);
            rule__Page__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Page__Group__6();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__Group__5"


    // $ANTLR start "rule__Page__Group__5__Impl"
    // InternalActivityexplorer.g:922:1: rule__Page__Group__5__Impl : ( ( rule__Page__Group_5__0 )? ) ;
    public final void rule__Page__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActivityexplorer.g:926:1: ( ( ( rule__Page__Group_5__0 )? ) )
            // InternalActivityexplorer.g:927:1: ( ( rule__Page__Group_5__0 )? )
            {
            // InternalActivityexplorer.g:927:1: ( ( rule__Page__Group_5__0 )? )
            // InternalActivityexplorer.g:928:1: ( rule__Page__Group_5__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPageAccess().getGroup_5()); 
            }
            // InternalActivityexplorer.g:929:1: ( rule__Page__Group_5__0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==20) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalActivityexplorer.g:929:2: rule__Page__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Page__Group_5__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPageAccess().getGroup_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__Group__5__Impl"


    // $ANTLR start "rule__Page__Group__6"
    // InternalActivityexplorer.g:939:1: rule__Page__Group__6 : rule__Page__Group__6__Impl rule__Page__Group__7 ;
    public final void rule__Page__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActivityexplorer.g:943:1: ( rule__Page__Group__6__Impl rule__Page__Group__7 )
            // InternalActivityexplorer.g:944:2: rule__Page__Group__6__Impl rule__Page__Group__7
            {
            pushFollow(FOLLOW_12);
            rule__Page__Group__6__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Page__Group__7();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__Group__6"


    // $ANTLR start "rule__Page__Group__6__Impl"
    // InternalActivityexplorer.g:951:1: rule__Page__Group__6__Impl : ( ( rule__Page__Group_6__0 )? ) ;
    public final void rule__Page__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActivityexplorer.g:955:1: ( ( ( rule__Page__Group_6__0 )? ) )
            // InternalActivityexplorer.g:956:1: ( ( rule__Page__Group_6__0 )? )
            {
            // InternalActivityexplorer.g:956:1: ( ( rule__Page__Group_6__0 )? )
            // InternalActivityexplorer.g:957:1: ( rule__Page__Group_6__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPageAccess().getGroup_6()); 
            }
            // InternalActivityexplorer.g:958:1: ( rule__Page__Group_6__0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==21) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalActivityexplorer.g:958:2: rule__Page__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Page__Group_6__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPageAccess().getGroup_6()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__Group__6__Impl"


    // $ANTLR start "rule__Page__Group__7"
    // InternalActivityexplorer.g:968:1: rule__Page__Group__7 : rule__Page__Group__7__Impl rule__Page__Group__8 ;
    public final void rule__Page__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActivityexplorer.g:972:1: ( rule__Page__Group__7__Impl rule__Page__Group__8 )
            // InternalActivityexplorer.g:973:2: rule__Page__Group__7__Impl rule__Page__Group__8
            {
            pushFollow(FOLLOW_12);
            rule__Page__Group__7__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Page__Group__8();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__Group__7"


    // $ANTLR start "rule__Page__Group__7__Impl"
    // InternalActivityexplorer.g:980:1: rule__Page__Group__7__Impl : ( ( rule__Page__Group_7__0 )? ) ;
    public final void rule__Page__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActivityexplorer.g:984:1: ( ( ( rule__Page__Group_7__0 )? ) )
            // InternalActivityexplorer.g:985:1: ( ( rule__Page__Group_7__0 )? )
            {
            // InternalActivityexplorer.g:985:1: ( ( rule__Page__Group_7__0 )? )
            // InternalActivityexplorer.g:986:1: ( rule__Page__Group_7__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPageAccess().getGroup_7()); 
            }
            // InternalActivityexplorer.g:987:1: ( rule__Page__Group_7__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==22) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalActivityexplorer.g:987:2: rule__Page__Group_7__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Page__Group_7__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPageAccess().getGroup_7()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__Group__7__Impl"


    // $ANTLR start "rule__Page__Group__8"
    // InternalActivityexplorer.g:997:1: rule__Page__Group__8 : rule__Page__Group__8__Impl rule__Page__Group__9 ;
    public final void rule__Page__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActivityexplorer.g:1001:1: ( rule__Page__Group__8__Impl rule__Page__Group__9 )
            // InternalActivityexplorer.g:1002:2: rule__Page__Group__8__Impl rule__Page__Group__9
            {
            pushFollow(FOLLOW_13);
            rule__Page__Group__8__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Page__Group__9();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__Group__8"


    // $ANTLR start "rule__Page__Group__8__Impl"
    // InternalActivityexplorer.g:1009:1: rule__Page__Group__8__Impl : ( 'index' ) ;
    public final void rule__Page__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActivityexplorer.g:1013:1: ( ( 'index' ) )
            // InternalActivityexplorer.g:1014:1: ( 'index' )
            {
            // InternalActivityexplorer.g:1014:1: ( 'index' )
            // InternalActivityexplorer.g:1015:1: 'index'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPageAccess().getIndexKeyword_8()); 
            }
            match(input,18,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPageAccess().getIndexKeyword_8()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__Group__8__Impl"


    // $ANTLR start "rule__Page__Group__9"
    // InternalActivityexplorer.g:1028:1: rule__Page__Group__9 : rule__Page__Group__9__Impl rule__Page__Group__10 ;
    public final void rule__Page__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActivityexplorer.g:1032:1: ( rule__Page__Group__9__Impl rule__Page__Group__10 )
            // InternalActivityexplorer.g:1033:2: rule__Page__Group__9__Impl rule__Page__Group__10
            {
            pushFollow(FOLLOW_14);
            rule__Page__Group__9__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Page__Group__10();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__Group__9"


    // $ANTLR start "rule__Page__Group__9__Impl"
    // InternalActivityexplorer.g:1040:1: rule__Page__Group__9__Impl : ( ( rule__Page__IndexAssignment_9 ) ) ;
    public final void rule__Page__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActivityexplorer.g:1044:1: ( ( ( rule__Page__IndexAssignment_9 ) ) )
            // InternalActivityexplorer.g:1045:1: ( ( rule__Page__IndexAssignment_9 ) )
            {
            // InternalActivityexplorer.g:1045:1: ( ( rule__Page__IndexAssignment_9 ) )
            // InternalActivityexplorer.g:1046:1: ( rule__Page__IndexAssignment_9 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPageAccess().getIndexAssignment_9()); 
            }
            // InternalActivityexplorer.g:1047:1: ( rule__Page__IndexAssignment_9 )
            // InternalActivityexplorer.g:1047:2: rule__Page__IndexAssignment_9
            {
            pushFollow(FOLLOW_2);
            rule__Page__IndexAssignment_9();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPageAccess().getIndexAssignment_9()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__Group__9__Impl"


    // $ANTLR start "rule__Page__Group__10"
    // InternalActivityexplorer.g:1057:1: rule__Page__Group__10 : rule__Page__Group__10__Impl rule__Page__Group__11 ;
    public final void rule__Page__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActivityexplorer.g:1061:1: ( rule__Page__Group__10__Impl rule__Page__Group__11 )
            // InternalActivityexplorer.g:1062:2: rule__Page__Group__10__Impl rule__Page__Group__11
            {
            pushFollow(FOLLOW_14);
            rule__Page__Group__10__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Page__Group__11();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__Group__10"


    // $ANTLR start "rule__Page__Group__10__Impl"
    // InternalActivityexplorer.g:1069:1: rule__Page__Group__10__Impl : ( ( rule__Page__OwnedOverviewAssignment_10 )? ) ;
    public final void rule__Page__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActivityexplorer.g:1073:1: ( ( ( rule__Page__OwnedOverviewAssignment_10 )? ) )
            // InternalActivityexplorer.g:1074:1: ( ( rule__Page__OwnedOverviewAssignment_10 )? )
            {
            // InternalActivityexplorer.g:1074:1: ( ( rule__Page__OwnedOverviewAssignment_10 )? )
            // InternalActivityexplorer.g:1075:1: ( rule__Page__OwnedOverviewAssignment_10 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPageAccess().getOwnedOverviewAssignment_10()); 
            }
            // InternalActivityexplorer.g:1076:1: ( rule__Page__OwnedOverviewAssignment_10 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==41) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalActivityexplorer.g:1076:2: rule__Page__OwnedOverviewAssignment_10
                    {
                    pushFollow(FOLLOW_2);
                    rule__Page__OwnedOverviewAssignment_10();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPageAccess().getOwnedOverviewAssignment_10()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__Group__10__Impl"


    // $ANTLR start "rule__Page__Group__11"
    // InternalActivityexplorer.g:1086:1: rule__Page__Group__11 : rule__Page__Group__11__Impl rule__Page__Group__12 ;
    public final void rule__Page__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActivityexplorer.g:1090:1: ( rule__Page__Group__11__Impl rule__Page__Group__12 )
            // InternalActivityexplorer.g:1091:2: rule__Page__Group__11__Impl rule__Page__Group__12
            {
            pushFollow(FOLLOW_14);
            rule__Page__Group__11__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Page__Group__12();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__Group__11"


    // $ANTLR start "rule__Page__Group__11__Impl"
    // InternalActivityexplorer.g:1098:1: rule__Page__Group__11__Impl : ( ( rule__Page__Group_11__0 )? ) ;
    public final void rule__Page__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActivityexplorer.g:1102:1: ( ( ( rule__Page__Group_11__0 )? ) )
            // InternalActivityexplorer.g:1103:1: ( ( rule__Page__Group_11__0 )? )
            {
            // InternalActivityexplorer.g:1103:1: ( ( rule__Page__Group_11__0 )? )
            // InternalActivityexplorer.g:1104:1: ( rule__Page__Group_11__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPageAccess().getGroup_11()); 
            }
            // InternalActivityexplorer.g:1105:1: ( rule__Page__Group_11__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==23) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalActivityexplorer.g:1105:2: rule__Page__Group_11__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Page__Group_11__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPageAccess().getGroup_11()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__Group__11__Impl"


    // $ANTLR start "rule__Page__Group__12"
    // InternalActivityexplorer.g:1115:1: rule__Page__Group__12 : rule__Page__Group__12__Impl rule__Page__Group__13 ;
    public final void rule__Page__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActivityexplorer.g:1119:1: ( rule__Page__Group__12__Impl rule__Page__Group__13 )
            // InternalActivityexplorer.g:1120:2: rule__Page__Group__12__Impl rule__Page__Group__13
            {
            pushFollow(FOLLOW_14);
            rule__Page__Group__12__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Page__Group__13();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__Group__12"


    // $ANTLR start "rule__Page__Group__12__Impl"
    // InternalActivityexplorer.g:1127:1: rule__Page__Group__12__Impl : ( ( rule__Page__Group_12__0 )? ) ;
    public final void rule__Page__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActivityexplorer.g:1131:1: ( ( ( rule__Page__Group_12__0 )? ) )
            // InternalActivityexplorer.g:1132:1: ( ( rule__Page__Group_12__0 )? )
            {
            // InternalActivityexplorer.g:1132:1: ( ( rule__Page__Group_12__0 )? )
            // InternalActivityexplorer.g:1133:1: ( rule__Page__Group_12__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPageAccess().getGroup_12()); 
            }
            // InternalActivityexplorer.g:1134:1: ( rule__Page__Group_12__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==27) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalActivityexplorer.g:1134:2: rule__Page__Group_12__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Page__Group_12__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPageAccess().getGroup_12()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__Group__12__Impl"


    // $ANTLR start "rule__Page__Group__13"
    // InternalActivityexplorer.g:1144:1: rule__Page__Group__13 : rule__Page__Group__13__Impl rule__Page__Group__14 ;
    public final void rule__Page__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActivityexplorer.g:1148:1: ( rule__Page__Group__13__Impl rule__Page__Group__14 )
            // InternalActivityexplorer.g:1149:2: rule__Page__Group__13__Impl rule__Page__Group__14
            {
            pushFollow(FOLLOW_14);
            rule__Page__Group__13__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Page__Group__14();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__Group__13"


    // $ANTLR start "rule__Page__Group__13__Impl"
    // InternalActivityexplorer.g:1156:1: rule__Page__Group__13__Impl : ( ( rule__Page__Group_13__0 )? ) ;
    public final void rule__Page__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActivityexplorer.g:1160:1: ( ( ( rule__Page__Group_13__0 )? ) )
            // InternalActivityexplorer.g:1161:1: ( ( rule__Page__Group_13__0 )? )
            {
            // InternalActivityexplorer.g:1161:1: ( ( rule__Page__Group_13__0 )? )
            // InternalActivityexplorer.g:1162:1: ( rule__Page__Group_13__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPageAccess().getGroup_13()); 
            }
            // InternalActivityexplorer.g:1163:1: ( rule__Page__Group_13__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==28) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalActivityexplorer.g:1163:2: rule__Page__Group_13__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Page__Group_13__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPageAccess().getGroup_13()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__Group__13__Impl"


    // $ANTLR start "rule__Page__Group__14"
    // InternalActivityexplorer.g:1173:1: rule__Page__Group__14 : rule__Page__Group__14__Impl rule__Page__Group__15 ;
    public final void rule__Page__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActivityexplorer.g:1177:1: ( rule__Page__Group__14__Impl rule__Page__Group__15 )
            // InternalActivityexplorer.g:1178:2: rule__Page__Group__14__Impl rule__Page__Group__15
            {
            pushFollow(FOLLOW_14);
            rule__Page__Group__14__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Page__Group__15();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__Group__14"


    // $ANTLR start "rule__Page__Group__14__Impl"
    // InternalActivityexplorer.g:1185:1: rule__Page__Group__14__Impl : ( ( rule__Page__Group_14__0 )? ) ;
    public final void rule__Page__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActivityexplorer.g:1189:1: ( ( ( rule__Page__Group_14__0 )? ) )
            // InternalActivityexplorer.g:1190:1: ( ( rule__Page__Group_14__0 )? )
            {
            // InternalActivityexplorer.g:1190:1: ( ( rule__Page__Group_14__0 )? )
            // InternalActivityexplorer.g:1191:1: ( rule__Page__Group_14__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPageAccess().getGroup_14()); 
            }
            // InternalActivityexplorer.g:1192:1: ( rule__Page__Group_14__0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==29) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalActivityexplorer.g:1192:2: rule__Page__Group_14__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Page__Group_14__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPageAccess().getGroup_14()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__Group__14__Impl"


    // $ANTLR start "rule__Page__Group__15"
    // InternalActivityexplorer.g:1202:1: rule__Page__Group__15 : rule__Page__Group__15__Impl rule__Page__Group__16 ;
    public final void rule__Page__Group__15() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActivityexplorer.g:1206:1: ( rule__Page__Group__15__Impl rule__Page__Group__16 )
            // InternalActivityexplorer.g:1207:2: rule__Page__Group__15__Impl rule__Page__Group__16
            {
            pushFollow(FOLLOW_14);
            rule__Page__Group__15__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Page__Group__16();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__Group__15"


    // $ANTLR start "rule__Page__Group__15__Impl"
    // InternalActivityexplorer.g:1214:1: rule__Page__Group__15__Impl : ( ( rule__Page__Group_15__0 )? ) ;
    public final void rule__Page__Group__15__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActivityexplorer.g:1218:1: ( ( ( rule__Page__Group_15__0 )? ) )
            // InternalActivityexplorer.g:1219:1: ( ( rule__Page__Group_15__0 )? )
            {
            // InternalActivityexplorer.g:1219:1: ( ( rule__Page__Group_15__0 )? )
            // InternalActivityexplorer.g:1220:1: ( rule__Page__Group_15__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPageAccess().getGroup_15()); 
            }
            // InternalActivityexplorer.g:1221:1: ( rule__Page__Group_15__0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==30) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalActivityexplorer.g:1221:2: rule__Page__Group_15__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Page__Group_15__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPageAccess().getGroup_15()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__Group__15__Impl"


    // $ANTLR start "rule__Page__Group__16"
    // InternalActivityexplorer.g:1231:1: rule__Page__Group__16 : rule__Page__Group__16__Impl ;
    public final void rule__Page__Group__16() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActivityexplorer.g:1235:1: ( rule__Page__Group__16__Impl )
            // InternalActivityexplorer.g:1236:2: rule__Page__Group__16__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Page__Group__16__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__Group__16"


    // $ANTLR start "rule__Page__Group__16__Impl"
    // InternalActivityexplorer.g:1242:1: rule__Page__Group__16__Impl : ( '}' ) ;
    public final void rule__Page__Group__16__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActivityexplorer.g:1246:1: ( ( '}' ) )
            // InternalActivityexplorer.g:1247:1: ( '}' )
            {
            // InternalActivityexplorer.g:1247:1: ( '}' )
            // InternalActivityexplorer.g:1248:1: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPageAccess().getRightCurlyBracketKeyword_16()); 
            }
            match(input,15,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPageAccess().getRightCurlyBracketKeyword_16()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__Group__16__Impl"


    // $ANTLR start "rule__Page__Group_4__0"
    // InternalActivityexplorer.g:1295:1: rule__Page__Group_4__0 : rule__Page__Group_4__0__Impl rule__Page__Group_4__1 ;
    public final void rule__Page__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActivityexplorer.g:1299:1: ( rule__Page__Group_4__0__Impl rule__Page__Group_4__1 )
            // InternalActivityexplorer.g:1300:2: rule__Page__Group_4__0__Impl rule__Page__Group_4__1
            {
            pushFollow(FOLLOW_15);
            rule__Page__Group_4__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Page__Group_4__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__Group_4__0"


    // $ANTLR start "rule__Page__Group_4__0__Impl"
    // InternalActivityexplorer.g:1307:1: rule__Page__Group_4__0__Impl : ( 'description' ) ;
    public final void rule__Page__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActivityexplorer.g:1311:1: ( ( 'description' ) )
            // InternalActivityexplorer.g:1312:1: ( 'description' )
            {
            // InternalActivityexplorer.g:1312:1: ( 'description' )
            // InternalActivityexplorer.g:1313:1: 'description'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPageAccess().getDescriptionKeyword_4_0()); 
            }
            match(input,19,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPageAccess().getDescriptionKeyword_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__Group_4__0__Impl"


    // $ANTLR start "rule__Page__Group_4__1"
    // InternalActivityexplorer.g:1326:1: rule__Page__Group_4__1 : rule__Page__Group_4__1__Impl ;
    public final void rule__Page__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActivityexplorer.g:1330:1: ( rule__Page__Group_4__1__Impl )
            // InternalActivityexplorer.g:1331:2: rule__Page__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Page__Group_4__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__Group_4__1"


    // $ANTLR start "rule__Page__Group_4__1__Impl"
    // InternalActivityexplorer.g:1337:1: rule__Page__Group_4__1__Impl : ( ( rule__Page__DescriptionAssignment_4_1 ) ) ;
    public final void rule__Page__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActivityexplorer.g:1341:1: ( ( ( rule__Page__DescriptionAssignment_4_1 ) ) )
            // InternalActivityexplorer.g:1342:1: ( ( rule__Page__DescriptionAssignment_4_1 ) )
            {
            // InternalActivityexplorer.g:1342:1: ( ( rule__Page__DescriptionAssignment_4_1 ) )
            // InternalActivityexplorer.g:1343:1: ( rule__Page__DescriptionAssignment_4_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPageAccess().getDescriptionAssignment_4_1()); 
            }
            // InternalActivityexplorer.g:1344:1: ( rule__Page__DescriptionAssignment_4_1 )
            // InternalActivityexplorer.g:1344:2: rule__Page__DescriptionAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Page__DescriptionAssignment_4_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPageAccess().getDescriptionAssignment_4_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__Group_4__1__Impl"


    // $ANTLR start "rule__Page__Group_5__0"
    // InternalActivityexplorer.g:1358:1: rule__Page__Group_5__0 : rule__Page__Group_5__0__Impl rule__Page__Group_5__1 ;
    public final void rule__Page__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActivityexplorer.g:1362:1: ( rule__Page__Group_5__0__Impl rule__Page__Group_5__1 )
            // InternalActivityexplorer.g:1363:2: rule__Page__Group_5__0__Impl rule__Page__Group_5__1
            {
            pushFollow(FOLLOW_15);
            rule__Page__Group_5__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Page__Group_5__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__Group_5__0"


    // $ANTLR start "rule__Page__Group_5__0__Impl"
    // InternalActivityexplorer.g:1370:1: rule__Page__Group_5__0__Impl : ( 'file-extension' ) ;
    public final void rule__Page__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActivityexplorer.g:1374:1: ( ( 'file-extension' ) )
            // InternalActivityexplorer.g:1375:1: ( 'file-extension' )
            {
            // InternalActivityexplorer.g:1375:1: ( 'file-extension' )
            // InternalActivityexplorer.g:1376:1: 'file-extension'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPageAccess().getFileExtensionKeyword_5_0()); 
            }
            match(input,20,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPageAccess().getFileExtensionKeyword_5_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__Group_5__0__Impl"


    // $ANTLR start "rule__Page__Group_5__1"
    // InternalActivityexplorer.g:1389:1: rule__Page__Group_5__1 : rule__Page__Group_5__1__Impl ;
    public final void rule__Page__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActivityexplorer.g:1393:1: ( rule__Page__Group_5__1__Impl )
            // InternalActivityexplorer.g:1394:2: rule__Page__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Page__Group_5__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__Group_5__1"


    // $ANTLR start "rule__Page__Group_5__1__Impl"
    // InternalActivityexplorer.g:1400:1: rule__Page__Group_5__1__Impl : ( ( rule__Page__FileExtensionsAssignment_5_1 ) ) ;
    public final void rule__Page__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActivityexplorer.g:1404:1: ( ( ( rule__Page__FileExtensionsAssignment_5_1 ) ) )
            // InternalActivityexplorer.g:1405:1: ( ( rule__Page__FileExtensionsAssignment_5_1 ) )
            {
            // InternalActivityexplorer.g:1405:1: ( ( rule__Page__FileExtensionsAssignment_5_1 ) )
            // InternalActivityexplorer.g:1406:1: ( rule__Page__FileExtensionsAssignment_5_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPageAccess().getFileExtensionsAssignment_5_1()); 
            }
            // InternalActivityexplorer.g:1407:1: ( rule__Page__FileExtensionsAssignment_5_1 )
            // InternalActivityexplorer.g:1407:2: rule__Page__FileExtensionsAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__Page__FileExtensionsAssignment_5_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPageAccess().getFileExtensionsAssignment_5_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__Group_5__1__Impl"


    // $ANTLR start "rule__Page__Group_6__0"
    // InternalActivityexplorer.g:1421:1: rule__Page__Group_6__0 : rule__Page__Group_6__0__Impl rule__Page__Group_6__1 ;
    public final void rule__Page__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActivityexplorer.g:1425:1: ( rule__Page__Group_6__0__Impl rule__Page__Group_6__1 )
            // InternalActivityexplorer.g:1426:2: rule__Page__Group_6__0__Impl rule__Page__Group_6__1
            {
            pushFollow(FOLLOW_4);
            rule__Page__Group_6__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Page__Group_6__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__Group_6__0"


    // $ANTLR start "rule__Page__Group_6__0__Impl"
    // InternalActivityexplorer.g:1433:1: rule__Page__Group_6__0__Impl : ( 'id' ) ;
    public final void rule__Page__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActivityexplorer.g:1437:1: ( ( 'id' ) )
            // InternalActivityexplorer.g:1438:1: ( 'id' )
            {
            // InternalActivityexplorer.g:1438:1: ( 'id' )
            // InternalActivityexplorer.g:1439:1: 'id'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPageAccess().getIdKeyword_6_0()); 
            }
            match(input,21,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPageAccess().getIdKeyword_6_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__Group_6__0__Impl"


    // $ANTLR start "rule__Page__Group_6__1"
    // InternalActivityexplorer.g:1452:1: rule__Page__Group_6__1 : rule__Page__Group_6__1__Impl ;
    public final void rule__Page__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActivityexplorer.g:1456:1: ( rule__Page__Group_6__1__Impl )
            // InternalActivityexplorer.g:1457:2: rule__Page__Group_6__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Page__Group_6__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__Group_6__1"


    // $ANTLR start "rule__Page__Group_6__1__Impl"
    // InternalActivityexplorer.g:1463:1: rule__Page__Group_6__1__Impl : ( ( rule__Page__ActivityExplorerItemIDAssignment_6_1 ) ) ;
    public final void rule__Page__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActivityexplorer.g:1467:1: ( ( ( rule__Page__ActivityExplorerItemIDAssignment_6_1 ) ) )
            // InternalActivityexplorer.g:1468:1: ( ( rule__Page__ActivityExplorerItemIDAssignment_6_1 ) )
            {
            // InternalActivityexplorer.g:1468:1: ( ( rule__Page__ActivityExplorerItemIDAssignment_6_1 ) )
            // InternalActivityexplorer.g:1469:1: ( rule__Page__ActivityExplorerItemIDAssignment_6_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPageAccess().getActivityExplorerItemIDAssignment_6_1()); 
            }
            // InternalActivityexplorer.g:1470:1: ( rule__Page__ActivityExplorerItemIDAssignment_6_1 )
            // InternalActivityexplorer.g:1470:2: rule__Page__ActivityExplorerItemIDAssignment_6_1
            {
            pushFollow(FOLLOW_2);
            rule__Page__ActivityExplorerItemIDAssignment_6_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPageAccess().getActivityExplorerItemIDAssignment_6_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__Group_6__1__Impl"


    // $ANTLR start "rule__Page__Group_7__0"
    // InternalActivityexplorer.g:1484:1: rule__Page__Group_7__0 : rule__Page__Group_7__0__Impl rule__Page__Group_7__1 ;
    public final void rule__Page__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActivityexplorer.g:1488:1: ( rule__Page__Group_7__0__Impl rule__Page__Group_7__1 )
            // InternalActivityexplorer.g:1489:2: rule__Page__Group_7__0__Impl rule__Page__Group_7__1
            {
            pushFollow(FOLLOW_15);
            rule__Page__Group_7__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Page__Group_7__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__Group_7__0"


    // $ANTLR start "rule__Page__Group_7__0__Impl"
    // InternalActivityexplorer.g:1496:1: rule__Page__Group_7__0__Impl : ( 'label' ) ;
    public final void rule__Page__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActivityexplorer.g:1500:1: ( ( 'label' ) )
            // InternalActivityexplorer.g:1501:1: ( 'label' )
            {
            // InternalActivityexplorer.g:1501:1: ( 'label' )
            // InternalActivityexplorer.g:1502:1: 'label'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPageAccess().getLabelKeyword_7_0()); 
            }
            match(input,22,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPageAccess().getLabelKeyword_7_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__Group_7__0__Impl"


    // $ANTLR start "rule__Page__Group_7__1"
    // InternalActivityexplorer.g:1515:1: rule__Page__Group_7__1 : rule__Page__Group_7__1__Impl ;
    public final void rule__Page__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActivityexplorer.g:1519:1: ( rule__Page__Group_7__1__Impl )
            // InternalActivityexplorer.g:1520:2: rule__Page__Group_7__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Page__Group_7__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__Group_7__1"


    // $ANTLR start "rule__Page__Group_7__1__Impl"
    // InternalActivityexplorer.g:1526:1: rule__Page__Group_7__1__Impl : ( ( rule__Page__LabelAssignment_7_1 ) ) ;
    public final void rule__Page__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActivityexplorer.g:1530:1: ( ( ( rule__Page__LabelAssignment_7_1 ) ) )
            // InternalActivityexplorer.g:1531:1: ( ( rule__Page__LabelAssignment_7_1 ) )
            {
            // InternalActivityexplorer.g:1531:1: ( ( rule__Page__LabelAssignment_7_1 ) )
            // InternalActivityexplorer.g:1532:1: ( rule__Page__LabelAssignment_7_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPageAccess().getLabelAssignment_7_1()); 
            }
            // InternalActivityexplorer.g:1533:1: ( rule__Page__LabelAssignment_7_1 )
            // InternalActivityexplorer.g:1533:2: rule__Page__LabelAssignment_7_1
            {
            pushFollow(FOLLOW_2);
            rule__Page__LabelAssignment_7_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPageAccess().getLabelAssignment_7_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__Group_7__1__Impl"


    // $ANTLR start "rule__Page__Group_11__0"
    // InternalActivityexplorer.g:1547:1: rule__Page__Group_11__0 : rule__Page__Group_11__0__Impl rule__Page__Group_11__1 ;
    public final void rule__Page__Group_11__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActivityexplorer.g:1551:1: ( rule__Page__Group_11__0__Impl rule__Page__Group_11__1 )
            // InternalActivityexplorer.g:1552:2: rule__Page__Group_11__0__Impl rule__Page__Group_11__1
            {
            pushFollow(FOLLOW_5);
            rule__Page__Group_11__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Page__Group_11__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__Group_11__0"


    // $ANTLR start "rule__Page__Group_11__0__Impl"
    // InternalActivityexplorer.g:1559:1: rule__Page__Group_11__0__Impl : ( 'header' ) ;
    public final void rule__Page__Group_11__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActivityexplorer.g:1563:1: ( ( 'header' ) )
            // InternalActivityexplorer.g:1564:1: ( 'header' )
            {
            // InternalActivityexplorer.g:1564:1: ( 'header' )
            // InternalActivityexplorer.g:1565:1: 'header'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPageAccess().getHeaderKeyword_11_0()); 
            }
            match(input,23,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPageAccess().getHeaderKeyword_11_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__Group_11__0__Impl"


    // $ANTLR start "rule__Page__Group_11__1"
    // InternalActivityexplorer.g:1578:1: rule__Page__Group_11__1 : rule__Page__Group_11__1__Impl rule__Page__Group_11__2 ;
    public final void rule__Page__Group_11__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActivityexplorer.g:1582:1: ( rule__Page__Group_11__1__Impl rule__Page__Group_11__2 )
            // InternalActivityexplorer.g:1583:2: rule__Page__Group_11__1__Impl rule__Page__Group_11__2
            {
            pushFollow(FOLLOW_16);
            rule__Page__Group_11__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Page__Group_11__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__Group_11__1"


    // $ANTLR start "rule__Page__Group_11__1__Impl"
    // InternalActivityexplorer.g:1590:1: rule__Page__Group_11__1__Impl : ( '{' ) ;
    public final void rule__Page__Group_11__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActivityexplorer.g:1594:1: ( ( '{' ) )
            // InternalActivityexplorer.g:1595:1: ( '{' )
            {
            // InternalActivityexplorer.g:1595:1: ( '{' )
            // InternalActivityexplorer.g:1596:1: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPageAccess().getLeftCurlyBracketKeyword_11_1()); 
            }
            match(input,14,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPageAccess().getLeftCurlyBracketKeyword_11_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__Group_11__1__Impl"


    // $ANTLR start "rule__Page__Group_11__2"
    // InternalActivityexplorer.g:1609:1: rule__Page__Group_11__2 : rule__Page__Group_11__2__Impl rule__Page__Group_11__3 ;
    public final void rule__Page__Group_11__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActivityexplorer.g:1613:1: ( rule__Page__Group_11__2__Impl rule__Page__Group_11__3 )
            // InternalActivityexplorer.g:1614:2: rule__Page__Group_11__2__Impl rule__Page__Group_11__3
            {
            pushFollow(FOLLOW_16);
            rule__Page__Group_11__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Page__Group_11__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__Group_11__2"


    // $ANTLR start "rule__Page__Group_11__2__Impl"
    // InternalActivityexplorer.g:1621:1: rule__Page__Group_11__2__Impl : ( ( rule__Page__Group_11_2__0 )? ) ;
    public final void rule__Page__Group_11__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActivityexplorer.g:1625:1: ( ( ( rule__Page__Group_11_2__0 )? ) )
            // InternalActivityexplorer.g:1626:1: ( ( rule__Page__Group_11_2__0 )? )
            {
            // InternalActivityexplorer.g:1626:1: ( ( rule__Page__Group_11_2__0 )? )
            // InternalActivityexplorer.g:1627:1: ( rule__Page__Group_11_2__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPageAccess().getGroup_11_2()); 
            }
            // InternalActivityexplorer.g:1628:1: ( rule__Page__Group_11_2__0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==24) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalActivityexplorer.g:1628:2: rule__Page__Group_11_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Page__Group_11_2__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPageAccess().getGroup_11_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__Group_11__2__Impl"


    // $ANTLR start "rule__Page__Group_11__3"
    // InternalActivityexplorer.g:1638:1: rule__Page__Group_11__3 : rule__Page__Group_11__3__Impl rule__Page__Group_11__4 ;
    public final void rule__Page__Group_11__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActivityexplorer.g:1642:1: ( rule__Page__Group_11__3__Impl rule__Page__Group_11__4 )
            // InternalActivityexplorer.g:1643:2: rule__Page__Group_11__3__Impl rule__Page__Group_11__4
            {
            pushFollow(FOLLOW_16);
            rule__Page__Group_11__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Page__Group_11__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__Group_11__3"


    // $ANTLR start "rule__Page__Group_11__3__Impl"
    // InternalActivityexplorer.g:1650:1: rule__Page__Group_11__3__Impl : ( ( rule__Page__Group_11_3__0 )? ) ;
    public final void rule__Page__Group_11__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActivityexplorer.g:1654:1: ( ( ( rule__Page__Group_11_3__0 )? ) )
            // InternalActivityexplorer.g:1655:1: ( ( rule__Page__Group_11_3__0 )? )
            {
            // InternalActivityexplorer.g:1655:1: ( ( rule__Page__Group_11_3__0 )? )
            // InternalActivityexplorer.g:1656:1: ( rule__Page__Group_11_3__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPageAccess().getGroup_11_3()); 
            }
            // InternalActivityexplorer.g:1657:1: ( rule__Page__Group_11_3__0 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==26) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalActivityexplorer.g:1657:2: rule__Page__Group_11_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Page__Group_11_3__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPageAccess().getGroup_11_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__Group_11__3__Impl"


    // $ANTLR start "rule__Page__Group_11__4"
    // InternalActivityexplorer.g:1667:1: rule__Page__Group_11__4 : rule__Page__Group_11__4__Impl ;
    public final void rule__Page__Group_11__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActivityexplorer.g:1671:1: ( rule__Page__Group_11__4__Impl )
            // InternalActivityexplorer.g:1672:2: rule__Page__Group_11__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Page__Group_11__4__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__Group_11__4"


    // $ANTLR start "rule__Page__Group_11__4__Impl"
    // InternalActivityexplorer.g:1678:1: rule__Page__Group_11__4__Impl : ( '}' ) ;
    public final void rule__Page__Group_11__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActivityexplorer.g:1682:1: ( ( '}' ) )
            // InternalActivityexplorer.g:1683:1: ( '}' )
            {
            // InternalActivityexplorer.g:1683:1: ( '}' )
            // InternalActivityexplorer.g:1684:1: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPageAccess().getRightCurlyBracketKeyword_11_4()); 
            }
            match(input,15,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPageAccess().getRightCurlyBracketKeyword_11_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__Group_11__4__Impl"


    // $ANTLR start "rule__Page__Group_11_2__0"
    // InternalActivityexplorer.g:1707:1: rule__Page__Group_11_2__0 : rule__Page__Group_11_2__0__Impl rule__Page__Group_11_2__1 ;
    public final void rule__Page__Group_11_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActivityexplorer.g:1711:1: ( rule__Page__Group_11_2__0__Impl rule__Page__Group_11_2__1 )
            // InternalActivityexplorer.g:1712:2: rule__Page__Group_11_2__0__Impl rule__Page__Group_11_2__1
            {
            pushFollow(FOLLOW_17);
            rule__Page__Group_11_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Page__Group_11_2__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__Group_11_2__0"


    // $ANTLR start "rule__Page__Group_11_2__0__Impl"
    // InternalActivityexplorer.g:1719:1: rule__Page__Group_11_2__0__Impl : ( 'image-on' ) ;
    public final void rule__Page__Group_11_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActivityexplorer.g:1723:1: ( ( 'image-on' ) )
            // InternalActivityexplorer.g:1724:1: ( 'image-on' )
            {
            // InternalActivityexplorer.g:1724:1: ( 'image-on' )
            // InternalActivityexplorer.g:1725:1: 'image-on'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPageAccess().getImageOnKeyword_11_2_0()); 
            }
            match(input,24,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPageAccess().getImageOnKeyword_11_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__Group_11_2__0__Impl"


    // $ANTLR start "rule__Page__Group_11_2__1"
    // InternalActivityexplorer.g:1738:1: rule__Page__Group_11_2__1 : rule__Page__Group_11_2__1__Impl rule__Page__Group_11_2__2 ;
    public final void rule__Page__Group_11_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActivityexplorer.g:1742:1: ( rule__Page__Group_11_2__1__Impl rule__Page__Group_11_2__2 )
            // InternalActivityexplorer.g:1743:2: rule__Page__Group_11_2__1__Impl rule__Page__Group_11_2__2
            {
            pushFollow(FOLLOW_15);
            rule__Page__Group_11_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Page__Group_11_2__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__Group_11_2__1"


    // $ANTLR start "rule__Page__Group_11_2__1__Impl"
    // InternalActivityexplorer.g:1750:1: rule__Page__Group_11_2__1__Impl : ( ':' ) ;
    public final void rule__Page__Group_11_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActivityexplorer.g:1754:1: ( ( ':' ) )
            // InternalActivityexplorer.g:1755:1: ( ':' )
            {
            // InternalActivityexplorer.g:1755:1: ( ':' )
            // InternalActivityexplorer.g:1756:1: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPageAccess().getColonKeyword_11_2_1()); 
            }
            match(input,25,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPageAccess().getColonKeyword_11_2_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__Group_11_2__1__Impl"


    // $ANTLR start "rule__Page__Group_11_2__2"
    // InternalActivityexplorer.g:1769:1: rule__Page__Group_11_2__2 : rule__Page__Group_11_2__2__Impl ;
    public final void rule__Page__Group_11_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActivityexplorer.g:1773:1: ( rule__Page__Group_11_2__2__Impl )
            // InternalActivityexplorer.g:1774:2: rule__Page__Group_11_2__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Page__Group_11_2__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__Group_11_2__2"


    // $ANTLR start "rule__Page__Group_11_2__2__Impl"
    // InternalActivityexplorer.g:1780:1: rule__Page__Group_11_2__2__Impl : ( ( rule__Page__ImagePathOnAssignment_11_2_2 ) ) ;
    public final void rule__Page__Group_11_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActivityexplorer.g:1784:1: ( ( ( rule__Page__ImagePathOnAssignment_11_2_2 ) ) )
            // InternalActivityexplorer.g:1785:1: ( ( rule__Page__ImagePathOnAssignment_11_2_2 ) )
            {
            // InternalActivityexplorer.g:1785:1: ( ( rule__Page__ImagePathOnAssignment_11_2_2 ) )
            // InternalActivityexplorer.g:1786:1: ( rule__Page__ImagePathOnAssignment_11_2_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPageAccess().getImagePathOnAssignment_11_2_2()); 
            }
            // InternalActivityexplorer.g:1787:1: ( rule__Page__ImagePathOnAssignment_11_2_2 )
            // InternalActivityexplorer.g:1787:2: rule__Page__ImagePathOnAssignment_11_2_2
            {
            pushFollow(FOLLOW_2);
            rule__Page__ImagePathOnAssignment_11_2_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPageAccess().getImagePathOnAssignment_11_2_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__Group_11_2__2__Impl"


    // $ANTLR start "rule__Page__Group_11_3__0"
    // InternalActivityexplorer.g:1803:1: rule__Page__Group_11_3__0 : rule__Page__Group_11_3__0__Impl rule__Page__Group_11_3__1 ;
    public final void rule__Page__Group_11_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActivityexplorer.g:1807:1: ( rule__Page__Group_11_3__0__Impl rule__Page__Group_11_3__1 )
            // InternalActivityexplorer.g:1808:2: rule__Page__Group_11_3__0__Impl rule__Page__Group_11_3__1
            {
            pushFollow(FOLLOW_17);
            rule__Page__Group_11_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Page__Group_11_3__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__Group_11_3__0"


    // $ANTLR start "rule__Page__Group_11_3__0__Impl"
    // InternalActivityexplorer.g:1815:1: rule__Page__Group_11_3__0__Impl : ( 'image-off' ) ;
    public final void rule__Page__Group_11_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActivityexplorer.g:1819:1: ( ( 'image-off' ) )
            // InternalActivityexplorer.g:1820:1: ( 'image-off' )
            {
            // InternalActivityexplorer.g:1820:1: ( 'image-off' )
            // InternalActivityexplorer.g:1821:1: 'image-off'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPageAccess().getImageOffKeyword_11_3_0()); 
            }
            match(input,26,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPageAccess().getImageOffKeyword_11_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__Group_11_3__0__Impl"


    // $ANTLR start "rule__Page__Group_11_3__1"
    // InternalActivityexplorer.g:1834:1: rule__Page__Group_11_3__1 : rule__Page__Group_11_3__1__Impl rule__Page__Group_11_3__2 ;
    public final void rule__Page__Group_11_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActivityexplorer.g:1838:1: ( rule__Page__Group_11_3__1__Impl rule__Page__Group_11_3__2 )
            // InternalActivityexplorer.g:1839:2: rule__Page__Group_11_3__1__Impl rule__Page__Group_11_3__2
            {
            pushFollow(FOLLOW_15);
            rule__Page__Group_11_3__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Page__Group_11_3__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__Group_11_3__1"


    // $ANTLR start "rule__Page__Group_11_3__1__Impl"
    // InternalActivityexplorer.g:1846:1: rule__Page__Group_11_3__1__Impl : ( ':' ) ;
    public final void rule__Page__Group_11_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActivityexplorer.g:1850:1: ( ( ':' ) )
            // InternalActivityexplorer.g:1851:1: ( ':' )
            {
            // InternalActivityexplorer.g:1851:1: ( ':' )
            // InternalActivityexplorer.g:1852:1: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPageAccess().getColonKeyword_11_3_1()); 
            }
            match(input,25,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPageAccess().getColonKeyword_11_3_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__Group_11_3__1__Impl"


    // $ANTLR start "rule__Page__Group_11_3__2"
    // InternalActivityexplorer.g:1865:1: rule__Page__Group_11_3__2 : rule__Page__Group_11_3__2__Impl ;
    public final void rule__Page__Group_11_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActivityexplorer.g:1869:1: ( rule__Page__Group_11_3__2__Impl )
            // InternalActivityexplorer.g:1870:2: rule__Page__Group_11_3__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Page__Group_11_3__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__Group_11_3__2"


    // $ANTLR start "rule__Page__Group_11_3__2__Impl"
    // InternalActivityexplorer.g:1876:1: rule__Page__Group_11_3__2__Impl : ( ( rule__Page__ImagePathOffAssignment_11_3_2 ) ) ;
    public final void rule__Page__Group_11_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActivityexplorer.g:1880:1: ( ( ( rule__Page__ImagePathOffAssignment_11_3_2 ) ) )
            // InternalActivityexplorer.g:1881:1: ( ( rule__Page__ImagePathOffAssignment_11_3_2 ) )
            {
            // InternalActivityexplorer.g:1881:1: ( ( rule__Page__ImagePathOffAssignment_11_3_2 ) )
            // InternalActivityexplorer.g:1882:1: ( rule__Page__ImagePathOffAssignment_11_3_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPageAccess().getImagePathOffAssignment_11_3_2()); 
            }
            // InternalActivityexplorer.g:1883:1: ( rule__Page__ImagePathOffAssignment_11_3_2 )
            // InternalActivityexplorer.g:1883:2: rule__Page__ImagePathOffAssignment_11_3_2
            {
            pushFollow(FOLLOW_2);
            rule__Page__ImagePathOffAssignment_11_3_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPageAccess().getImagePathOffAssignment_11_3_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__Group_11_3__2__Impl"


    // $ANTLR start "rule__Page__Group_12__0"
    // InternalActivityexplorer.g:1899:1: rule__Page__Group_12__0 : rule__Page__Group_12__0__Impl rule__Page__Group_12__1 ;
    public final void rule__Page__Group_12__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActivityexplorer.g:1903:1: ( rule__Page__Group_12__0__Impl rule__Page__Group_12__1 )
            // InternalActivityexplorer.g:1904:2: rule__Page__Group_12__0__Impl rule__Page__Group_12__1
            {
            pushFollow(FOLLOW_15);
            rule__Page__Group_12__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Page__Group_12__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__Group_12__0"


    // $ANTLR start "rule__Page__Group_12__0__Impl"
    // InternalActivityexplorer.g:1911:1: rule__Page__Group_12__0__Impl : ( 'tab-name' ) ;
    public final void rule__Page__Group_12__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActivityexplorer.g:1915:1: ( ( 'tab-name' ) )
            // InternalActivityexplorer.g:1916:1: ( 'tab-name' )
            {
            // InternalActivityexplorer.g:1916:1: ( 'tab-name' )
            // InternalActivityexplorer.g:1917:1: 'tab-name'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPageAccess().getTabNameKeyword_12_0()); 
            }
            match(input,27,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPageAccess().getTabNameKeyword_12_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__Group_12__0__Impl"


    // $ANTLR start "rule__Page__Group_12__1"
    // InternalActivityexplorer.g:1930:1: rule__Page__Group_12__1 : rule__Page__Group_12__1__Impl ;
    public final void rule__Page__Group_12__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActivityexplorer.g:1934:1: ( rule__Page__Group_12__1__Impl )
            // InternalActivityexplorer.g:1935:2: rule__Page__Group_12__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Page__Group_12__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__Group_12__1"


    // $ANTLR start "rule__Page__Group_12__1__Impl"
    // InternalActivityexplorer.g:1941:1: rule__Page__Group_12__1__Impl : ( ( rule__Page__TabNameAssignment_12_1 ) ) ;
    public final void rule__Page__Group_12__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActivityexplorer.g:1945:1: ( ( ( rule__Page__TabNameAssignment_12_1 ) ) )
            // InternalActivityexplorer.g:1946:1: ( ( rule__Page__TabNameAssignment_12_1 ) )
            {
            // InternalActivityexplorer.g:1946:1: ( ( rule__Page__TabNameAssignment_12_1 ) )
            // InternalActivityexplorer.g:1947:1: ( rule__Page__TabNameAssignment_12_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPageAccess().getTabNameAssignment_12_1()); 
            }
            // InternalActivityexplorer.g:1948:1: ( rule__Page__TabNameAssignment_12_1 )
            // InternalActivityexplorer.g:1948:2: rule__Page__TabNameAssignment_12_1
            {
            pushFollow(FOLLOW_2);
            rule__Page__TabNameAssignment_12_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPageAccess().getTabNameAssignment_12_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__Group_12__1__Impl"


    // $ANTLR start "rule__Page__Group_13__0"
    // InternalActivityexplorer.g:1962:1: rule__Page__Group_13__0 : rule__Page__Group_13__0__Impl rule__Page__Group_13__1 ;
    public final void rule__Page__Group_13__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActivityexplorer.g:1966:1: ( rule__Page__Group_13__0__Impl rule__Page__Group_13__1 )
            // InternalActivityexplorer.g:1967:2: rule__Page__Group_13__0__Impl rule__Page__Group_13__1
            {
            pushFollow(FOLLOW_17);
            rule__Page__Group_13__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Page__Group_13__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__Group_13__0"


    // $ANTLR start "rule__Page__Group_13__0__Impl"
    // InternalActivityexplorer.g:1974:1: rule__Page__Group_13__0__Impl : ( 'predicated' ) ;
    public final void rule__Page__Group_13__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActivityexplorer.g:1978:1: ( ( 'predicated' ) )
            // InternalActivityexplorer.g:1979:1: ( 'predicated' )
            {
            // InternalActivityexplorer.g:1979:1: ( 'predicated' )
            // InternalActivityexplorer.g:1980:1: 'predicated'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPageAccess().getPredicatedKeyword_13_0()); 
            }
            match(input,28,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPageAccess().getPredicatedKeyword_13_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__Group_13__0__Impl"


    // $ANTLR start "rule__Page__Group_13__1"
    // InternalActivityexplorer.g:1993:1: rule__Page__Group_13__1 : rule__Page__Group_13__1__Impl rule__Page__Group_13__2 ;
    public final void rule__Page__Group_13__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActivityexplorer.g:1997:1: ( rule__Page__Group_13__1__Impl rule__Page__Group_13__2 )
            // InternalActivityexplorer.g:1998:2: rule__Page__Group_13__1__Impl rule__Page__Group_13__2
            {
            pushFollow(FOLLOW_18);
            rule__Page__Group_13__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Page__Group_13__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__Group_13__1"


    // $ANTLR start "rule__Page__Group_13__1__Impl"
    // InternalActivityexplorer.g:2005:1: rule__Page__Group_13__1__Impl : ( ':' ) ;
    public final void rule__Page__Group_13__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActivityexplorer.g:2009:1: ( ( ':' ) )
            // InternalActivityexplorer.g:2010:1: ( ':' )
            {
            // InternalActivityexplorer.g:2010:1: ( ':' )
            // InternalActivityexplorer.g:2011:1: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPageAccess().getColonKeyword_13_1()); 
            }
            match(input,25,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPageAccess().getColonKeyword_13_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__Group_13__1__Impl"


    // $ANTLR start "rule__Page__Group_13__2"
    // InternalActivityexplorer.g:2024:1: rule__Page__Group_13__2 : rule__Page__Group_13__2__Impl ;
    public final void rule__Page__Group_13__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActivityexplorer.g:2028:1: ( rule__Page__Group_13__2__Impl )
            // InternalActivityexplorer.g:2029:2: rule__Page__Group_13__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Page__Group_13__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__Group_13__2"


    // $ANTLR start "rule__Page__Group_13__2__Impl"
    // InternalActivityexplorer.g:2035:1: rule__Page__Group_13__2__Impl : ( ( rule__Page__HasPredicateAssignment_13_2 ) ) ;
    public final void rule__Page__Group_13__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActivityexplorer.g:2039:1: ( ( ( rule__Page__HasPredicateAssignment_13_2 ) ) )
            // InternalActivityexplorer.g:2040:1: ( ( rule__Page__HasPredicateAssignment_13_2 ) )
            {
            // InternalActivityexplorer.g:2040:1: ( ( rule__Page__HasPredicateAssignment_13_2 ) )
            // InternalActivityexplorer.g:2041:1: ( rule__Page__HasPredicateAssignment_13_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPageAccess().getHasPredicateAssignment_13_2()); 
            }
            // InternalActivityexplorer.g:2042:1: ( rule__Page__HasPredicateAssignment_13_2 )
            // InternalActivityexplorer.g:2042:2: rule__Page__HasPredicateAssignment_13_2
            {
            pushFollow(FOLLOW_2);
            rule__Page__HasPredicateAssignment_13_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPageAccess().getHasPredicateAssignment_13_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__Group_13__2__Impl"


    // $ANTLR start "rule__Page__Group_14__0"
    // InternalActivityexplorer.g:2058:1: rule__Page__Group_14__0 : rule__Page__Group_14__0__Impl rule__Page__Group_14__1 ;
    public final void rule__Page__Group_14__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActivityexplorer.g:2062:1: ( rule__Page__Group_14__0__Impl rule__Page__Group_14__1 )
            // InternalActivityexplorer.g:2063:2: rule__Page__Group_14__0__Impl rule__Page__Group_14__1
            {
            pushFollow(FOLLOW_17);
            rule__Page__Group_14__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Page__Group_14__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__Group_14__0"


    // $ANTLR start "rule__Page__Group_14__0__Impl"
    // InternalActivityexplorer.g:2070:1: rule__Page__Group_14__0__Impl : ( 'show-viewer' ) ;
    public final void rule__Page__Group_14__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActivityexplorer.g:2074:1: ( ( 'show-viewer' ) )
            // InternalActivityexplorer.g:2075:1: ( 'show-viewer' )
            {
            // InternalActivityexplorer.g:2075:1: ( 'show-viewer' )
            // InternalActivityexplorer.g:2076:1: 'show-viewer'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPageAccess().getShowViewerKeyword_14_0()); 
            }
            match(input,29,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPageAccess().getShowViewerKeyword_14_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__Group_14__0__Impl"


    // $ANTLR start "rule__Page__Group_14__1"
    // InternalActivityexplorer.g:2089:1: rule__Page__Group_14__1 : rule__Page__Group_14__1__Impl rule__Page__Group_14__2 ;
    public final void rule__Page__Group_14__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActivityexplorer.g:2093:1: ( rule__Page__Group_14__1__Impl rule__Page__Group_14__2 )
            // InternalActivityexplorer.g:2094:2: rule__Page__Group_14__1__Impl rule__Page__Group_14__2
            {
            pushFollow(FOLLOW_18);
            rule__Page__Group_14__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Page__Group_14__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__Group_14__1"


    // $ANTLR start "rule__Page__Group_14__1__Impl"
    // InternalActivityexplorer.g:2101:1: rule__Page__Group_14__1__Impl : ( ':' ) ;
    public final void rule__Page__Group_14__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActivityexplorer.g:2105:1: ( ( ':' ) )
            // InternalActivityexplorer.g:2106:1: ( ':' )
            {
            // InternalActivityexplorer.g:2106:1: ( ':' )
            // InternalActivityexplorer.g:2107:1: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPageAccess().getColonKeyword_14_1()); 
            }
            match(input,25,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPageAccess().getColonKeyword_14_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__Group_14__1__Impl"


    // $ANTLR start "rule__Page__Group_14__2"
    // InternalActivityexplorer.g:2120:1: rule__Page__Group_14__2 : rule__Page__Group_14__2__Impl ;
    public final void rule__Page__Group_14__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActivityexplorer.g:2124:1: ( rule__Page__Group_14__2__Impl )
            // InternalActivityexplorer.g:2125:2: rule__Page__Group_14__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Page__Group_14__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__Group_14__2"


    // $ANTLR start "rule__Page__Group_14__2__Impl"
    // InternalActivityexplorer.g:2131:1: rule__Page__Group_14__2__Impl : ( ( rule__Page__ShowViewerAssignment_14_2 ) ) ;
    public final void rule__Page__Group_14__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActivityexplorer.g:2135:1: ( ( ( rule__Page__ShowViewerAssignment_14_2 ) ) )
            // InternalActivityexplorer.g:2136:1: ( ( rule__Page__ShowViewerAssignment_14_2 ) )
            {
            // InternalActivityexplorer.g:2136:1: ( ( rule__Page__ShowViewerAssignment_14_2 ) )
            // InternalActivityexplorer.g:2137:1: ( rule__Page__ShowViewerAssignment_14_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPageAccess().getShowViewerAssignment_14_2()); 
            }
            // InternalActivityexplorer.g:2138:1: ( rule__Page__ShowViewerAssignment_14_2 )
            // InternalActivityexplorer.g:2138:2: rule__Page__ShowViewerAssignment_14_2
            {
            pushFollow(FOLLOW_2);
            rule__Page__ShowViewerAssignment_14_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPageAccess().getShowViewerAssignment_14_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__Group_14__2__Impl"


    // $ANTLR start "rule__Page__Group_15__0"
    // InternalActivityexplorer.g:2154:1: rule__Page__Group_15__0 : rule__Page__Group_15__0__Impl rule__Page__Group_15__1 ;
    public final void rule__Page__Group_15__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActivityexplorer.g:2158:1: ( rule__Page__Group_15__0__Impl rule__Page__Group_15__1 )
            // InternalActivityexplorer.g:2159:2: rule__Page__Group_15__0__Impl rule__Page__Group_15__1
            {
            pushFollow(FOLLOW_5);
            rule__Page__Group_15__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Page__Group_15__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__Group_15__0"


    // $ANTLR start "rule__Page__Group_15__0__Impl"
    // InternalActivityexplorer.g:2166:1: rule__Page__Group_15__0__Impl : ( 'sections' ) ;
    public final void rule__Page__Group_15__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActivityexplorer.g:2170:1: ( ( 'sections' ) )
            // InternalActivityexplorer.g:2171:1: ( 'sections' )
            {
            // InternalActivityexplorer.g:2171:1: ( 'sections' )
            // InternalActivityexplorer.g:2172:1: 'sections'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPageAccess().getSectionsKeyword_15_0()); 
            }
            match(input,30,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPageAccess().getSectionsKeyword_15_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__Group_15__0__Impl"


    // $ANTLR start "rule__Page__Group_15__1"
    // InternalActivityexplorer.g:2185:1: rule__Page__Group_15__1 : rule__Page__Group_15__1__Impl rule__Page__Group_15__2 ;
    public final void rule__Page__Group_15__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActivityexplorer.g:2189:1: ( rule__Page__Group_15__1__Impl rule__Page__Group_15__2 )
            // InternalActivityexplorer.g:2190:2: rule__Page__Group_15__1__Impl rule__Page__Group_15__2
            {
            pushFollow(FOLLOW_19);
            rule__Page__Group_15__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Page__Group_15__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__Group_15__1"


    // $ANTLR start "rule__Page__Group_15__1__Impl"
    // InternalActivityexplorer.g:2197:1: rule__Page__Group_15__1__Impl : ( '{' ) ;
    public final void rule__Page__Group_15__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActivityexplorer.g:2201:1: ( ( '{' ) )
            // InternalActivityexplorer.g:2202:1: ( '{' )
            {
            // InternalActivityexplorer.g:2202:1: ( '{' )
            // InternalActivityexplorer.g:2203:1: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPageAccess().getLeftCurlyBracketKeyword_15_1()); 
            }
            match(input,14,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPageAccess().getLeftCurlyBracketKeyword_15_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__Group_15__1__Impl"


    // $ANTLR start "rule__Page__Group_15__2"
    // InternalActivityexplorer.g:2216:1: rule__Page__Group_15__2 : rule__Page__Group_15__2__Impl rule__Page__Group_15__3 ;
    public final void rule__Page__Group_15__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActivityexplorer.g:2220:1: ( rule__Page__Group_15__2__Impl rule__Page__Group_15__3 )
            // InternalActivityexplorer.g:2221:2: rule__Page__Group_15__2__Impl rule__Page__Group_15__3
            {
            pushFollow(FOLLOW_19);
            rule__Page__Group_15__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Page__Group_15__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__Group_15__2"


    // $ANTLR start "rule__Page__Group_15__2__Impl"
    // InternalActivityexplorer.g:2228:1: rule__Page__Group_15__2__Impl : ( ( rule__Page__OwnedSectionsAssignment_15_2 )* ) ;
    public final void rule__Page__Group_15__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActivityexplorer.g:2232:1: ( ( ( rule__Page__OwnedSectionsAssignment_15_2 )* ) )
            // InternalActivityexplorer.g:2233:1: ( ( rule__Page__OwnedSectionsAssignment_15_2 )* )
            {
            // InternalActivityexplorer.g:2233:1: ( ( rule__Page__OwnedSectionsAssignment_15_2 )* )
            // InternalActivityexplorer.g:2234:1: ( rule__Page__OwnedSectionsAssignment_15_2 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPageAccess().getOwnedSectionsAssignment_15_2()); 
            }
            // InternalActivityexplorer.g:2235:1: ( rule__Page__OwnedSectionsAssignment_15_2 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==31) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalActivityexplorer.g:2235:2: rule__Page__OwnedSectionsAssignment_15_2
            	    {
            	    pushFollow(FOLLOW_20);
            	    rule__Page__OwnedSectionsAssignment_15_2();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPageAccess().getOwnedSectionsAssignment_15_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__Group_15__2__Impl"


    // $ANTLR start "rule__Page__Group_15__3"
    // InternalActivityexplorer.g:2245:1: rule__Page__Group_15__3 : rule__Page__Group_15__3__Impl ;
    public final void rule__Page__Group_15__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActivityexplorer.g:2249:1: ( rule__Page__Group_15__3__Impl )
            // InternalActivityexplorer.g:2250:2: rule__Page__Group_15__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Page__Group_15__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__Group_15__3"


    // $ANTLR start "rule__Page__Group_15__3__Impl"
    // InternalActivityexplorer.g:2256:1: rule__Page__Group_15__3__Impl : ( '}' ) ;
    public final void rule__Page__Group_15__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActivityexplorer.g:2260:1: ( ( '}' ) )
            // InternalActivityexplorer.g:2261:1: ( '}' )
            {
            // InternalActivityexplorer.g:2261:1: ( '}' )
            // InternalActivityexplorer.g:2262:1: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPageAccess().getRightCurlyBracketKeyword_15_3()); 
            }
            match(input,15,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPageAccess().getRightCurlyBracketKeyword_15_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__Group_15__3__Impl"


    // $ANTLR start "rule__Section__Group__0"
    // InternalActivityexplorer.g:2283:1: rule__Section__Group__0 : rule__Section__Group__0__Impl rule__Section__Group__1 ;
    public final void rule__Section__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActivityexplorer.g:2287:1: ( rule__Section__Group__0__Impl rule__Section__Group__1 )
            // InternalActivityexplorer.g:2288:2: rule__Section__Group__0__Impl rule__Section__Group__1
            {
            pushFollow(FOLLOW_21);
            rule__Section__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Section__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Section__Group__0"


    // $ANTLR start "rule__Section__Group__0__Impl"
    // InternalActivityexplorer.g:2295:1: rule__Section__Group__0__Impl : ( () ) ;
    public final void rule__Section__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActivityexplorer.g:2299:1: ( ( () ) )
            // InternalActivityexplorer.g:2300:1: ( () )
            {
            // InternalActivityexplorer.g:2300:1: ( () )
            // InternalActivityexplorer.g:2301:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSectionAccess().getSectionAction_0()); 
            }
            // InternalActivityexplorer.g:2302:1: ()
            // InternalActivityexplorer.g:2304:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSectionAccess().getSectionAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Section__Group__0__Impl"


    // $ANTLR start "rule__Section__Group__1"
    // InternalActivityexplorer.g:2314:1: rule__Section__Group__1 : rule__Section__Group__1__Impl rule__Section__Group__2 ;
    public final void rule__Section__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActivityexplorer.g:2318:1: ( rule__Section__Group__1__Impl rule__Section__Group__2 )
            // InternalActivityexplorer.g:2319:2: rule__Section__Group__1__Impl rule__Section__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Section__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Section__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Section__Group__1"


    // $ANTLR start "rule__Section__Group__1__Impl"
    // InternalActivityexplorer.g:2326:1: rule__Section__Group__1__Impl : ( 'section' ) ;
    public final void rule__Section__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActivityexplorer.g:2330:1: ( ( 'section' ) )
            // InternalActivityexplorer.g:2331:1: ( 'section' )
            {
            // InternalActivityexplorer.g:2331:1: ( 'section' )
            // InternalActivityexplorer.g:2332:1: 'section'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSectionAccess().getSectionKeyword_1()); 
            }
            match(input,31,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSectionAccess().getSectionKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Section__Group__1__Impl"


    // $ANTLR start "rule__Section__Group__2"
    // InternalActivityexplorer.g:2345:1: rule__Section__Group__2 : rule__Section__Group__2__Impl rule__Section__Group__3 ;
    public final void rule__Section__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActivityexplorer.g:2349:1: ( rule__Section__Group__2__Impl rule__Section__Group__3 )
            // InternalActivityexplorer.g:2350:2: rule__Section__Group__2__Impl rule__Section__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__Section__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Section__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Section__Group__2"


    // $ANTLR start "rule__Section__Group__2__Impl"
    // InternalActivityexplorer.g:2357:1: rule__Section__Group__2__Impl : ( ( rule__Section__NameAssignment_2 ) ) ;
    public final void rule__Section__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActivityexplorer.g:2361:1: ( ( ( rule__Section__NameAssignment_2 ) ) )
            // InternalActivityexplorer.g:2362:1: ( ( rule__Section__NameAssignment_2 ) )
            {
            // InternalActivityexplorer.g:2362:1: ( ( rule__Section__NameAssignment_2 ) )
            // InternalActivityexplorer.g:2363:1: ( rule__Section__NameAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSectionAccess().getNameAssignment_2()); 
            }
            // InternalActivityexplorer.g:2364:1: ( rule__Section__NameAssignment_2 )
            // InternalActivityexplorer.g:2364:2: rule__Section__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Section__NameAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSectionAccess().getNameAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Section__Group__2__Impl"


    // $ANTLR start "rule__Section__Group__3"
    // InternalActivityexplorer.g:2374:1: rule__Section__Group__3 : rule__Section__Group__3__Impl rule__Section__Group__4 ;
    public final void rule__Section__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActivityexplorer.g:2378:1: ( rule__Section__Group__3__Impl rule__Section__Group__4 )
            // InternalActivityexplorer.g:2379:2: rule__Section__Group__3__Impl rule__Section__Group__4
            {
            pushFollow(FOLLOW_22);
            rule__Section__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Section__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Section__Group__3"


    // $ANTLR start "rule__Section__Group__3__Impl"
    // InternalActivityexplorer.g:2386:1: rule__Section__Group__3__Impl : ( '{' ) ;
    public final void rule__Section__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActivityexplorer.g:2390:1: ( ( '{' ) )
            // InternalActivityexplorer.g:2391:1: ( '{' )
            {
            // InternalActivityexplorer.g:2391:1: ( '{' )
            // InternalActivityexplorer.g:2392:1: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSectionAccess().getLeftCurlyBracketKeyword_3()); 
            }
            match(input,14,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSectionAccess().getLeftCurlyBracketKeyword_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Section__Group__3__Impl"


    // $ANTLR start "rule__Section__Group__4"
    // InternalActivityexplorer.g:2405:1: rule__Section__Group__4 : rule__Section__Group__4__Impl rule__Section__Group__5 ;
    public final void rule__Section__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActivityexplorer.g:2409:1: ( rule__Section__Group__4__Impl rule__Section__Group__5 )
            // InternalActivityexplorer.g:2410:2: rule__Section__Group__4__Impl rule__Section__Group__5
            {
            pushFollow(FOLLOW_22);
            rule__Section__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Section__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Section__Group__4"


    // $ANTLR start "rule__Section__Group__4__Impl"
    // InternalActivityexplorer.g:2417:1: rule__Section__Group__4__Impl : ( ( rule__Section__Group_4__0 )? ) ;
    public final void rule__Section__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActivityexplorer.g:2421:1: ( ( ( rule__Section__Group_4__0 )? ) )
            // InternalActivityexplorer.g:2422:1: ( ( rule__Section__Group_4__0 )? )
            {
            // InternalActivityexplorer.g:2422:1: ( ( rule__Section__Group_4__0 )? )
            // InternalActivityexplorer.g:2423:1: ( rule__Section__Group_4__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSectionAccess().getGroup_4()); 
            }
            // InternalActivityexplorer.g:2424:1: ( rule__Section__Group_4__0 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==19) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalActivityexplorer.g:2424:2: rule__Section__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Section__Group_4__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSectionAccess().getGroup_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Section__Group__4__Impl"


    // $ANTLR start "rule__Section__Group__5"
    // InternalActivityexplorer.g:2434:1: rule__Section__Group__5 : rule__Section__Group__5__Impl rule__Section__Group__6 ;
    public final void rule__Section__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActivityexplorer.g:2438:1: ( rule__Section__Group__5__Impl rule__Section__Group__6 )
            // InternalActivityexplorer.g:2439:2: rule__Section__Group__5__Impl rule__Section__Group__6
            {
            pushFollow(FOLLOW_22);
            rule__Section__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Section__Group__6();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Section__Group__5"


    // $ANTLR start "rule__Section__Group__5__Impl"
    // InternalActivityexplorer.g:2446:1: rule__Section__Group__5__Impl : ( ( rule__Section__Group_5__0 )? ) ;
    public final void rule__Section__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActivityexplorer.g:2450:1: ( ( ( rule__Section__Group_5__0 )? ) )
            // InternalActivityexplorer.g:2451:1: ( ( rule__Section__Group_5__0 )? )
            {
            // InternalActivityexplorer.g:2451:1: ( ( rule__Section__Group_5__0 )? )
            // InternalActivityexplorer.g:2452:1: ( rule__Section__Group_5__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSectionAccess().getGroup_5()); 
            }
            // InternalActivityexplorer.g:2453:1: ( rule__Section__Group_5__0 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==21) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalActivityexplorer.g:2453:2: rule__Section__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Section__Group_5__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSectionAccess().getGroup_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Section__Group__5__Impl"


    // $ANTLR start "rule__Section__Group__6"
    // InternalActivityexplorer.g:2463:1: rule__Section__Group__6 : rule__Section__Group__6__Impl rule__Section__Group__7 ;
    public final void rule__Section__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActivityexplorer.g:2467:1: ( rule__Section__Group__6__Impl rule__Section__Group__7 )
            // InternalActivityexplorer.g:2468:2: rule__Section__Group__6__Impl rule__Section__Group__7
            {
            pushFollow(FOLLOW_22);
            rule__Section__Group__6__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Section__Group__7();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Section__Group__6"


    // $ANTLR start "rule__Section__Group__6__Impl"
    // InternalActivityexplorer.g:2475:1: rule__Section__Group__6__Impl : ( ( rule__Section__Group_6__0 )? ) ;
    public final void rule__Section__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActivityexplorer.g:2479:1: ( ( ( rule__Section__Group_6__0 )? ) )
            // InternalActivityexplorer.g:2480:1: ( ( rule__Section__Group_6__0 )? )
            {
            // InternalActivityexplorer.g:2480:1: ( ( rule__Section__Group_6__0 )? )
            // InternalActivityexplorer.g:2481:1: ( rule__Section__Group_6__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSectionAccess().getGroup_6()); 
            }
            // InternalActivityexplorer.g:2482:1: ( rule__Section__Group_6__0 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==22) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalActivityexplorer.g:2482:2: rule__Section__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Section__Group_6__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSectionAccess().getGroup_6()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Section__Group__6__Impl"


    // $ANTLR start "rule__Section__Group__7"
    // InternalActivityexplorer.g:2492:1: rule__Section__Group__7 : rule__Section__Group__7__Impl rule__Section__Group__8 ;
    public final void rule__Section__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActivityexplorer.g:2496:1: ( rule__Section__Group__7__Impl rule__Section__Group__8 )
            // InternalActivityexplorer.g:2497:2: rule__Section__Group__7__Impl rule__Section__Group__8
            {
            pushFollow(FOLLOW_13);
            rule__Section__Group__7__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Section__Group__8();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Section__Group__7"


    // $ANTLR start "rule__Section__Group__7__Impl"
    // InternalActivityexplorer.g:2504:1: rule__Section__Group__7__Impl : ( 'index' ) ;
    public final void rule__Section__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActivityexplorer.g:2508:1: ( ( 'index' ) )
            // InternalActivityexplorer.g:2509:1: ( 'index' )
            {
            // InternalActivityexplorer.g:2509:1: ( 'index' )
            // InternalActivityexplorer.g:2510:1: 'index'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSectionAccess().getIndexKeyword_7()); 
            }
            match(input,18,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSectionAccess().getIndexKeyword_7()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Section__Group__7__Impl"


    // $ANTLR start "rule__Section__Group__8"
    // InternalActivityexplorer.g:2523:1: rule__Section__Group__8 : rule__Section__Group__8__Impl rule__Section__Group__9 ;
    public final void rule__Section__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActivityexplorer.g:2527:1: ( rule__Section__Group__8__Impl rule__Section__Group__9 )
            // InternalActivityexplorer.g:2528:2: rule__Section__Group__8__Impl rule__Section__Group__9
            {
            pushFollow(FOLLOW_23);
            rule__Section__Group__8__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Section__Group__9();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Section__Group__8"


    // $ANTLR start "rule__Section__Group__8__Impl"
    // InternalActivityexplorer.g:2535:1: rule__Section__Group__8__Impl : ( ( rule__Section__IndexAssignment_8 ) ) ;
    public final void rule__Section__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActivityexplorer.g:2539:1: ( ( ( rule__Section__IndexAssignment_8 ) ) )
            // InternalActivityexplorer.g:2540:1: ( ( rule__Section__IndexAssignment_8 ) )
            {
            // InternalActivityexplorer.g:2540:1: ( ( rule__Section__IndexAssignment_8 ) )
            // InternalActivityexplorer.g:2541:1: ( rule__Section__IndexAssignment_8 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSectionAccess().getIndexAssignment_8()); 
            }
            // InternalActivityexplorer.g:2542:1: ( rule__Section__IndexAssignment_8 )
            // InternalActivityexplorer.g:2542:2: rule__Section__IndexAssignment_8
            {
            pushFollow(FOLLOW_2);
            rule__Section__IndexAssignment_8();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSectionAccess().getIndexAssignment_8()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Section__Group__8__Impl"


    // $ANTLR start "rule__Section__Group__9"
    // InternalActivityexplorer.g:2552:1: rule__Section__Group__9 : rule__Section__Group__9__Impl rule__Section__Group__10 ;
    public final void rule__Section__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActivityexplorer.g:2556:1: ( rule__Section__Group__9__Impl rule__Section__Group__10 )
            // InternalActivityexplorer.g:2557:2: rule__Section__Group__9__Impl rule__Section__Group__10
            {
            pushFollow(FOLLOW_23);
            rule__Section__Group__9__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Section__Group__10();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Section__Group__9"


    // $ANTLR start "rule__Section__Group__9__Impl"
    // InternalActivityexplorer.g:2564:1: rule__Section__Group__9__Impl : ( ( rule__Section__Group_9__0 )? ) ;
    public final void rule__Section__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActivityexplorer.g:2568:1: ( ( ( rule__Section__Group_9__0 )? ) )
            // InternalActivityexplorer.g:2569:1: ( ( rule__Section__Group_9__0 )? )
            {
            // InternalActivityexplorer.g:2569:1: ( ( rule__Section__Group_9__0 )? )
            // InternalActivityexplorer.g:2570:1: ( rule__Section__Group_9__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSectionAccess().getGroup_9()); 
            }
            // InternalActivityexplorer.g:2571:1: ( rule__Section__Group_9__0 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==32) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalActivityexplorer.g:2571:2: rule__Section__Group_9__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Section__Group_9__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSectionAccess().getGroup_9()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Section__Group__9__Impl"


    // $ANTLR start "rule__Section__Group__10"
    // InternalActivityexplorer.g:2581:1: rule__Section__Group__10 : rule__Section__Group__10__Impl rule__Section__Group__11 ;
    public final void rule__Section__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActivityexplorer.g:2585:1: ( rule__Section__Group__10__Impl rule__Section__Group__11 )
            // InternalActivityexplorer.g:2586:2: rule__Section__Group__10__Impl rule__Section__Group__11
            {
            pushFollow(FOLLOW_23);
            rule__Section__Group__10__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Section__Group__11();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Section__Group__10"


    // $ANTLR start "rule__Section__Group__10__Impl"
    // InternalActivityexplorer.g:2593:1: rule__Section__Group__10__Impl : ( ( rule__Section__Group_10__0 )? ) ;
    public final void rule__Section__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActivityexplorer.g:2597:1: ( ( ( rule__Section__Group_10__0 )? ) )
            // InternalActivityexplorer.g:2598:1: ( ( rule__Section__Group_10__0 )? )
            {
            // InternalActivityexplorer.g:2598:1: ( ( rule__Section__Group_10__0 )? )
            // InternalActivityexplorer.g:2599:1: ( rule__Section__Group_10__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSectionAccess().getGroup_10()); 
            }
            // InternalActivityexplorer.g:2600:1: ( rule__Section__Group_10__0 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==33) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalActivityexplorer.g:2600:2: rule__Section__Group_10__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Section__Group_10__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSectionAccess().getGroup_10()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Section__Group__10__Impl"


    // $ANTLR start "rule__Section__Group__11"
    // InternalActivityexplorer.g:2610:1: rule__Section__Group__11 : rule__Section__Group__11__Impl rule__Section__Group__12 ;
    public final void rule__Section__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActivityexplorer.g:2614:1: ( rule__Section__Group__11__Impl rule__Section__Group__12 )
            // InternalActivityexplorer.g:2615:2: rule__Section__Group__11__Impl rule__Section__Group__12
            {
            pushFollow(FOLLOW_23);
            rule__Section__Group__11__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Section__Group__12();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Section__Group__11"


    // $ANTLR start "rule__Section__Group__11__Impl"
    // InternalActivityexplorer.g:2622:1: rule__Section__Group__11__Impl : ( ( rule__Section__Group_11__0 )? ) ;
    public final void rule__Section__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActivityexplorer.g:2626:1: ( ( ( rule__Section__Group_11__0 )? ) )
            // InternalActivityexplorer.g:2627:1: ( ( rule__Section__Group_11__0 )? )
            {
            // InternalActivityexplorer.g:2627:1: ( ( rule__Section__Group_11__0 )? )
            // InternalActivityexplorer.g:2628:1: ( rule__Section__Group_11__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSectionAccess().getGroup_11()); 
            }
            // InternalActivityexplorer.g:2629:1: ( rule__Section__Group_11__0 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==34) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalActivityexplorer.g:2629:2: rule__Section__Group_11__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Section__Group_11__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSectionAccess().getGroup_11()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Section__Group__11__Impl"


    // $ANTLR start "rule__Section__Group__12"
    // InternalActivityexplorer.g:2639:1: rule__Section__Group__12 : rule__Section__Group__12__Impl ;
    public final void rule__Section__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActivityexplorer.g:2643:1: ( rule__Section__Group__12__Impl )
            // InternalActivityexplorer.g:2644:2: rule__Section__Group__12__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Section__Group__12__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Section__Group__12"


    // $ANTLR start "rule__Section__Group__12__Impl"
    // InternalActivityexplorer.g:2650:1: rule__Section__Group__12__Impl : ( '}' ) ;
    public final void rule__Section__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActivityexplorer.g:2654:1: ( ( '}' ) )
            // InternalActivityexplorer.g:2655:1: ( '}' )
            {
            // InternalActivityexplorer.g:2655:1: ( '}' )
            // InternalActivityexplorer.g:2656:1: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSectionAccess().getRightCurlyBracketKeyword_12()); 
            }
            match(input,15,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSectionAccess().getRightCurlyBracketKeyword_12()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Section__Group__12__Impl"


    // $ANTLR start "rule__Section__Group_4__0"
    // InternalActivityexplorer.g:2695:1: rule__Section__Group_4__0 : rule__Section__Group_4__0__Impl rule__Section__Group_4__1 ;
    public final void rule__Section__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActivityexplorer.g:2699:1: ( rule__Section__Group_4__0__Impl rule__Section__Group_4__1 )
            // InternalActivityexplorer.g:2700:2: rule__Section__Group_4__0__Impl rule__Section__Group_4__1
            {
            pushFollow(FOLLOW_15);
            rule__Section__Group_4__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Section__Group_4__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Section__Group_4__0"


    // $ANTLR start "rule__Section__Group_4__0__Impl"
    // InternalActivityexplorer.g:2707:1: rule__Section__Group_4__0__Impl : ( 'description' ) ;
    public final void rule__Section__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActivityexplorer.g:2711:1: ( ( 'description' ) )
            // InternalActivityexplorer.g:2712:1: ( 'description' )
            {
            // InternalActivityexplorer.g:2712:1: ( 'description' )
            // InternalActivityexplorer.g:2713:1: 'description'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSectionAccess().getDescriptionKeyword_4_0()); 
            }
            match(input,19,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSectionAccess().getDescriptionKeyword_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Section__Group_4__0__Impl"


    // $ANTLR start "rule__Section__Group_4__1"
    // InternalActivityexplorer.g:2726:1: rule__Section__Group_4__1 : rule__Section__Group_4__1__Impl ;
    public final void rule__Section__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActivityexplorer.g:2730:1: ( rule__Section__Group_4__1__Impl )
            // InternalActivityexplorer.g:2731:2: rule__Section__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Section__Group_4__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Section__Group_4__1"


    // $ANTLR start "rule__Section__Group_4__1__Impl"
    // InternalActivityexplorer.g:2737:1: rule__Section__Group_4__1__Impl : ( ( rule__Section__DescriptionAssignment_4_1 ) ) ;
    public final void rule__Section__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActivityexplorer.g:2741:1: ( ( ( rule__Section__DescriptionAssignment_4_1 ) ) )
            // InternalActivityexplorer.g:2742:1: ( ( rule__Section__DescriptionAssignment_4_1 ) )
            {
            // InternalActivityexplorer.g:2742:1: ( ( rule__Section__DescriptionAssignment_4_1 ) )
            // InternalActivityexplorer.g:2743:1: ( rule__Section__DescriptionAssignment_4_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSectionAccess().getDescriptionAssignment_4_1()); 
            }
            // InternalActivityexplorer.g:2744:1: ( rule__Section__DescriptionAssignment_4_1 )
            // InternalActivityexplorer.g:2744:2: rule__Section__DescriptionAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Section__DescriptionAssignment_4_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSectionAccess().getDescriptionAssignment_4_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Section__Group_4__1__Impl"


    // $ANTLR start "rule__Section__Group_5__0"
    // InternalActivityexplorer.g:2758:1: rule__Section__Group_5__0 : rule__Section__Group_5__0__Impl rule__Section__Group_5__1 ;
    public final void rule__Section__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActivityexplorer.g:2762:1: ( rule__Section__Group_5__0__Impl rule__Section__Group_5__1 )
            // InternalActivityexplorer.g:2763:2: rule__Section__Group_5__0__Impl rule__Section__Group_5__1
            {
            pushFollow(FOLLOW_4);
            rule__Section__Group_5__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Section__Group_5__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Section__Group_5__0"


    // $ANTLR start "rule__Section__Group_5__0__Impl"
    // InternalActivityexplorer.g:2770:1: rule__Section__Group_5__0__Impl : ( 'id' ) ;
    public final void rule__Section__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActivityexplorer.g:2774:1: ( ( 'id' ) )
            // InternalActivityexplorer.g:2775:1: ( 'id' )
            {
            // InternalActivityexplorer.g:2775:1: ( 'id' )
            // InternalActivityexplorer.g:2776:1: 'id'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSectionAccess().getIdKeyword_5_0()); 
            }
            match(input,21,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSectionAccess().getIdKeyword_5_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Section__Group_5__0__Impl"


    // $ANTLR start "rule__Section__Group_5__1"
    // InternalActivityexplorer.g:2789:1: rule__Section__Group_5__1 : rule__Section__Group_5__1__Impl ;
    public final void rule__Section__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActivityexplorer.g:2793:1: ( rule__Section__Group_5__1__Impl )
            // InternalActivityexplorer.g:2794:2: rule__Section__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Section__Group_5__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Section__Group_5__1"


    // $ANTLR start "rule__Section__Group_5__1__Impl"
    // InternalActivityexplorer.g:2800:1: rule__Section__Group_5__1__Impl : ( ( rule__Section__ActivityExplorerItemIDAssignment_5_1 ) ) ;
    public final void rule__Section__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActivityexplorer.g:2804:1: ( ( ( rule__Section__ActivityExplorerItemIDAssignment_5_1 ) ) )
            // InternalActivityexplorer.g:2805:1: ( ( rule__Section__ActivityExplorerItemIDAssignment_5_1 ) )
            {
            // InternalActivityexplorer.g:2805:1: ( ( rule__Section__ActivityExplorerItemIDAssignment_5_1 ) )
            // InternalActivityexplorer.g:2806:1: ( rule__Section__ActivityExplorerItemIDAssignment_5_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSectionAccess().getActivityExplorerItemIDAssignment_5_1()); 
            }
            // InternalActivityexplorer.g:2807:1: ( rule__Section__ActivityExplorerItemIDAssignment_5_1 )
            // InternalActivityexplorer.g:2807:2: rule__Section__ActivityExplorerItemIDAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__Section__ActivityExplorerItemIDAssignment_5_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSectionAccess().getActivityExplorerItemIDAssignment_5_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Section__Group_5__1__Impl"


    // $ANTLR start "rule__Section__Group_6__0"
    // InternalActivityexplorer.g:2821:1: rule__Section__Group_6__0 : rule__Section__Group_6__0__Impl rule__Section__Group_6__1 ;
    public final void rule__Section__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActivityexplorer.g:2825:1: ( rule__Section__Group_6__0__Impl rule__Section__Group_6__1 )
            // InternalActivityexplorer.g:2826:2: rule__Section__Group_6__0__Impl rule__Section__Group_6__1
            {
            pushFollow(FOLLOW_15);
            rule__Section__Group_6__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Section__Group_6__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Section__Group_6__0"


    // $ANTLR start "rule__Section__Group_6__0__Impl"
    // InternalActivityexplorer.g:2833:1: rule__Section__Group_6__0__Impl : ( 'label' ) ;
    public final void rule__Section__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActivityexplorer.g:2837:1: ( ( 'label' ) )
            // InternalActivityexplorer.g:2838:1: ( 'label' )
            {
            // InternalActivityexplorer.g:2838:1: ( 'label' )
            // InternalActivityexplorer.g:2839:1: 'label'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSectionAccess().getLabelKeyword_6_0()); 
            }
            match(input,22,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSectionAccess().getLabelKeyword_6_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Section__Group_6__0__Impl"


    // $ANTLR start "rule__Section__Group_6__1"
    // InternalActivityexplorer.g:2852:1: rule__Section__Group_6__1 : rule__Section__Group_6__1__Impl ;
    public final void rule__Section__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActivityexplorer.g:2856:1: ( rule__Section__Group_6__1__Impl )
            // InternalActivityexplorer.g:2857:2: rule__Section__Group_6__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Section__Group_6__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Section__Group_6__1"


    // $ANTLR start "rule__Section__Group_6__1__Impl"
    // InternalActivityexplorer.g:2863:1: rule__Section__Group_6__1__Impl : ( ( rule__Section__LabelAssignment_6_1 ) ) ;
    public final void rule__Section__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActivityexplorer.g:2867:1: ( ( ( rule__Section__LabelAssignment_6_1 ) ) )
            // InternalActivityexplorer.g:2868:1: ( ( rule__Section__LabelAssignment_6_1 ) )
            {
            // InternalActivityexplorer.g:2868:1: ( ( rule__Section__LabelAssignment_6_1 ) )
            // InternalActivityexplorer.g:2869:1: ( rule__Section__LabelAssignment_6_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSectionAccess().getLabelAssignment_6_1()); 
            }
            // InternalActivityexplorer.g:2870:1: ( rule__Section__LabelAssignment_6_1 )
            // InternalActivityexplorer.g:2870:2: rule__Section__LabelAssignment_6_1
            {
            pushFollow(FOLLOW_2);
            rule__Section__LabelAssignment_6_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSectionAccess().getLabelAssignment_6_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Section__Group_6__1__Impl"


    // $ANTLR start "rule__Section__Group_9__0"
    // InternalActivityexplorer.g:2884:1: rule__Section__Group_9__0 : rule__Section__Group_9__0__Impl rule__Section__Group_9__1 ;
    public final void rule__Section__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActivityexplorer.g:2888:1: ( rule__Section__Group_9__0__Impl rule__Section__Group_9__1 )
            // InternalActivityexplorer.g:2889:2: rule__Section__Group_9__0__Impl rule__Section__Group_9__1
            {
            pushFollow(FOLLOW_17);
            rule__Section__Group_9__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Section__Group_9__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Section__Group_9__0"


    // $ANTLR start "rule__Section__Group_9__0__Impl"
    // InternalActivityexplorer.g:2896:1: rule__Section__Group_9__0__Impl : ( 'filtering' ) ;
    public final void rule__Section__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActivityexplorer.g:2900:1: ( ( 'filtering' ) )
            // InternalActivityexplorer.g:2901:1: ( 'filtering' )
            {
            // InternalActivityexplorer.g:2901:1: ( 'filtering' )
            // InternalActivityexplorer.g:2902:1: 'filtering'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSectionAccess().getFilteringKeyword_9_0()); 
            }
            match(input,32,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSectionAccess().getFilteringKeyword_9_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Section__Group_9__0__Impl"


    // $ANTLR start "rule__Section__Group_9__1"
    // InternalActivityexplorer.g:2915:1: rule__Section__Group_9__1 : rule__Section__Group_9__1__Impl rule__Section__Group_9__2 ;
    public final void rule__Section__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActivityexplorer.g:2919:1: ( rule__Section__Group_9__1__Impl rule__Section__Group_9__2 )
            // InternalActivityexplorer.g:2920:2: rule__Section__Group_9__1__Impl rule__Section__Group_9__2
            {
            pushFollow(FOLLOW_18);
            rule__Section__Group_9__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Section__Group_9__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Section__Group_9__1"


    // $ANTLR start "rule__Section__Group_9__1__Impl"
    // InternalActivityexplorer.g:2927:1: rule__Section__Group_9__1__Impl : ( ':' ) ;
    public final void rule__Section__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActivityexplorer.g:2931:1: ( ( ':' ) )
            // InternalActivityexplorer.g:2932:1: ( ':' )
            {
            // InternalActivityexplorer.g:2932:1: ( ':' )
            // InternalActivityexplorer.g:2933:1: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSectionAccess().getColonKeyword_9_1()); 
            }
            match(input,25,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSectionAccess().getColonKeyword_9_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Section__Group_9__1__Impl"


    // $ANTLR start "rule__Section__Group_9__2"
    // InternalActivityexplorer.g:2946:1: rule__Section__Group_9__2 : rule__Section__Group_9__2__Impl ;
    public final void rule__Section__Group_9__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActivityexplorer.g:2950:1: ( rule__Section__Group_9__2__Impl )
            // InternalActivityexplorer.g:2951:2: rule__Section__Group_9__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Section__Group_9__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Section__Group_9__2"


    // $ANTLR start "rule__Section__Group_9__2__Impl"
    // InternalActivityexplorer.g:2957:1: rule__Section__Group_9__2__Impl : ( ( rule__Section__FilteringAssignment_9_2 ) ) ;
    public final void rule__Section__Group_9__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActivityexplorer.g:2961:1: ( ( ( rule__Section__FilteringAssignment_9_2 ) ) )
            // InternalActivityexplorer.g:2962:1: ( ( rule__Section__FilteringAssignment_9_2 ) )
            {
            // InternalActivityexplorer.g:2962:1: ( ( rule__Section__FilteringAssignment_9_2 ) )
            // InternalActivityexplorer.g:2963:1: ( rule__Section__FilteringAssignment_9_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSectionAccess().getFilteringAssignment_9_2()); 
            }
            // InternalActivityexplorer.g:2964:1: ( rule__Section__FilteringAssignment_9_2 )
            // InternalActivityexplorer.g:2964:2: rule__Section__FilteringAssignment_9_2
            {
            pushFollow(FOLLOW_2);
            rule__Section__FilteringAssignment_9_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSectionAccess().getFilteringAssignment_9_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Section__Group_9__2__Impl"


    // $ANTLR start "rule__Section__Group_10__0"
    // InternalActivityexplorer.g:2980:1: rule__Section__Group_10__0 : rule__Section__Group_10__0__Impl rule__Section__Group_10__1 ;
    public final void rule__Section__Group_10__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActivityexplorer.g:2984:1: ( rule__Section__Group_10__0__Impl rule__Section__Group_10__1 )
            // InternalActivityexplorer.g:2985:2: rule__Section__Group_10__0__Impl rule__Section__Group_10__1
            {
            pushFollow(FOLLOW_17);
            rule__Section__Group_10__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Section__Group_10__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Section__Group_10__0"


    // $ANTLR start "rule__Section__Group_10__0__Impl"
    // InternalActivityexplorer.g:2992:1: rule__Section__Group_10__0__Impl : ( 'expanded' ) ;
    public final void rule__Section__Group_10__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActivityexplorer.g:2996:1: ( ( 'expanded' ) )
            // InternalActivityexplorer.g:2997:1: ( 'expanded' )
            {
            // InternalActivityexplorer.g:2997:1: ( 'expanded' )
            // InternalActivityexplorer.g:2998:1: 'expanded'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSectionAccess().getExpandedKeyword_10_0()); 
            }
            match(input,33,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSectionAccess().getExpandedKeyword_10_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Section__Group_10__0__Impl"


    // $ANTLR start "rule__Section__Group_10__1"
    // InternalActivityexplorer.g:3011:1: rule__Section__Group_10__1 : rule__Section__Group_10__1__Impl rule__Section__Group_10__2 ;
    public final void rule__Section__Group_10__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActivityexplorer.g:3015:1: ( rule__Section__Group_10__1__Impl rule__Section__Group_10__2 )
            // InternalActivityexplorer.g:3016:2: rule__Section__Group_10__1__Impl rule__Section__Group_10__2
            {
            pushFollow(FOLLOW_18);
            rule__Section__Group_10__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Section__Group_10__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Section__Group_10__1"


    // $ANTLR start "rule__Section__Group_10__1__Impl"
    // InternalActivityexplorer.g:3023:1: rule__Section__Group_10__1__Impl : ( ':' ) ;
    public final void rule__Section__Group_10__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActivityexplorer.g:3027:1: ( ( ':' ) )
            // InternalActivityexplorer.g:3028:1: ( ':' )
            {
            // InternalActivityexplorer.g:3028:1: ( ':' )
            // InternalActivityexplorer.g:3029:1: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSectionAccess().getColonKeyword_10_1()); 
            }
            match(input,25,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSectionAccess().getColonKeyword_10_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Section__Group_10__1__Impl"


    // $ANTLR start "rule__Section__Group_10__2"
    // InternalActivityexplorer.g:3042:1: rule__Section__Group_10__2 : rule__Section__Group_10__2__Impl ;
    public final void rule__Section__Group_10__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActivityexplorer.g:3046:1: ( rule__Section__Group_10__2__Impl )
            // InternalActivityexplorer.g:3047:2: rule__Section__Group_10__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Section__Group_10__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Section__Group_10__2"


    // $ANTLR start "rule__Section__Group_10__2__Impl"
    // InternalActivityexplorer.g:3053:1: rule__Section__Group_10__2__Impl : ( ( rule__Section__ExpandedAssignment_10_2 ) ) ;
    public final void rule__Section__Group_10__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActivityexplorer.g:3057:1: ( ( ( rule__Section__ExpandedAssignment_10_2 ) ) )
            // InternalActivityexplorer.g:3058:1: ( ( rule__Section__ExpandedAssignment_10_2 ) )
            {
            // InternalActivityexplorer.g:3058:1: ( ( rule__Section__ExpandedAssignment_10_2 ) )
            // InternalActivityexplorer.g:3059:1: ( rule__Section__ExpandedAssignment_10_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSectionAccess().getExpandedAssignment_10_2()); 
            }
            // InternalActivityexplorer.g:3060:1: ( rule__Section__ExpandedAssignment_10_2 )
            // InternalActivityexplorer.g:3060:2: rule__Section__ExpandedAssignment_10_2
            {
            pushFollow(FOLLOW_2);
            rule__Section__ExpandedAssignment_10_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSectionAccess().getExpandedAssignment_10_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Section__Group_10__2__Impl"


    // $ANTLR start "rule__Section__Group_11__0"
    // InternalActivityexplorer.g:3076:1: rule__Section__Group_11__0 : rule__Section__Group_11__0__Impl rule__Section__Group_11__1 ;
    public final void rule__Section__Group_11__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActivityexplorer.g:3080:1: ( rule__Section__Group_11__0__Impl rule__Section__Group_11__1 )
            // InternalActivityexplorer.g:3081:2: rule__Section__Group_11__0__Impl rule__Section__Group_11__1
            {
            pushFollow(FOLLOW_5);
            rule__Section__Group_11__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Section__Group_11__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Section__Group_11__0"


    // $ANTLR start "rule__Section__Group_11__0__Impl"
    // InternalActivityexplorer.g:3088:1: rule__Section__Group_11__0__Impl : ( 'activities' ) ;
    public final void rule__Section__Group_11__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActivityexplorer.g:3092:1: ( ( 'activities' ) )
            // InternalActivityexplorer.g:3093:1: ( 'activities' )
            {
            // InternalActivityexplorer.g:3093:1: ( 'activities' )
            // InternalActivityexplorer.g:3094:1: 'activities'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSectionAccess().getActivitiesKeyword_11_0()); 
            }
            match(input,34,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSectionAccess().getActivitiesKeyword_11_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Section__Group_11__0__Impl"


    // $ANTLR start "rule__Section__Group_11__1"
    // InternalActivityexplorer.g:3107:1: rule__Section__Group_11__1 : rule__Section__Group_11__1__Impl rule__Section__Group_11__2 ;
    public final void rule__Section__Group_11__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActivityexplorer.g:3111:1: ( rule__Section__Group_11__1__Impl rule__Section__Group_11__2 )
            // InternalActivityexplorer.g:3112:2: rule__Section__Group_11__1__Impl rule__Section__Group_11__2
            {
            pushFollow(FOLLOW_24);
            rule__Section__Group_11__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Section__Group_11__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Section__Group_11__1"


    // $ANTLR start "rule__Section__Group_11__1__Impl"
    // InternalActivityexplorer.g:3119:1: rule__Section__Group_11__1__Impl : ( '{' ) ;
    public final void rule__Section__Group_11__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActivityexplorer.g:3123:1: ( ( '{' ) )
            // InternalActivityexplorer.g:3124:1: ( '{' )
            {
            // InternalActivityexplorer.g:3124:1: ( '{' )
            // InternalActivityexplorer.g:3125:1: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSectionAccess().getLeftCurlyBracketKeyword_11_1()); 
            }
            match(input,14,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSectionAccess().getLeftCurlyBracketKeyword_11_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Section__Group_11__1__Impl"


    // $ANTLR start "rule__Section__Group_11__2"
    // InternalActivityexplorer.g:3138:1: rule__Section__Group_11__2 : rule__Section__Group_11__2__Impl rule__Section__Group_11__3 ;
    public final void rule__Section__Group_11__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActivityexplorer.g:3142:1: ( rule__Section__Group_11__2__Impl rule__Section__Group_11__3 )
            // InternalActivityexplorer.g:3143:2: rule__Section__Group_11__2__Impl rule__Section__Group_11__3
            {
            pushFollow(FOLLOW_24);
            rule__Section__Group_11__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Section__Group_11__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Section__Group_11__2"


    // $ANTLR start "rule__Section__Group_11__2__Impl"
    // InternalActivityexplorer.g:3150:1: rule__Section__Group_11__2__Impl : ( ( rule__Section__OwnedActivitiesAssignment_11_2 )* ) ;
    public final void rule__Section__Group_11__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActivityexplorer.g:3154:1: ( ( ( rule__Section__OwnedActivitiesAssignment_11_2 )* ) )
            // InternalActivityexplorer.g:3155:1: ( ( rule__Section__OwnedActivitiesAssignment_11_2 )* )
            {
            // InternalActivityexplorer.g:3155:1: ( ( rule__Section__OwnedActivitiesAssignment_11_2 )* )
            // InternalActivityexplorer.g:3156:1: ( rule__Section__OwnedActivitiesAssignment_11_2 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSectionAccess().getOwnedActivitiesAssignment_11_2()); 
            }
            // InternalActivityexplorer.g:3157:1: ( rule__Section__OwnedActivitiesAssignment_11_2 )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==35) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalActivityexplorer.g:3157:2: rule__Section__OwnedActivitiesAssignment_11_2
            	    {
            	    pushFollow(FOLLOW_25);
            	    rule__Section__OwnedActivitiesAssignment_11_2();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSectionAccess().getOwnedActivitiesAssignment_11_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Section__Group_11__2__Impl"


    // $ANTLR start "rule__Section__Group_11__3"
    // InternalActivityexplorer.g:3167:1: rule__Section__Group_11__3 : rule__Section__Group_11__3__Impl ;
    public final void rule__Section__Group_11__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActivityexplorer.g:3171:1: ( rule__Section__Group_11__3__Impl )
            // InternalActivityexplorer.g:3172:2: rule__Section__Group_11__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Section__Group_11__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Section__Group_11__3"


    // $ANTLR start "rule__Section__Group_11__3__Impl"
    // InternalActivityexplorer.g:3178:1: rule__Section__Group_11__3__Impl : ( '}' ) ;
    public final void rule__Section__Group_11__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActivityexplorer.g:3182:1: ( ( '}' ) )
            // InternalActivityexplorer.g:3183:1: ( '}' )
            {
            // InternalActivityexplorer.g:3183:1: ( '}' )
            // InternalActivityexplorer.g:3184:1: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSectionAccess().getRightCurlyBracketKeyword_11_3()); 
            }
            match(input,15,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSectionAccess().getRightCurlyBracketKeyword_11_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Section__Group_11__3__Impl"


    // $ANTLR start "rule__Activity__Group__0"
    // InternalActivityexplorer.g:3205:1: rule__Activity__Group__0 : rule__Activity__Group__0__Impl rule__Activity__Group__1 ;
    public final void rule__Activity__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActivityexplorer.g:3209:1: ( rule__Activity__Group__0__Impl rule__Activity__Group__1 )
            // InternalActivityexplorer.g:3210:2: rule__Activity__Group__0__Impl rule__Activity__Group__1
            {
            pushFollow(FOLLOW_26);
            rule__Activity__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Activity__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__Group__0"


    // $ANTLR start "rule__Activity__Group__0__Impl"
    // InternalActivityexplorer.g:3217:1: rule__Activity__Group__0__Impl : ( () ) ;
    public final void rule__Activity__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActivityexplorer.g:3221:1: ( ( () ) )
            // InternalActivityexplorer.g:3222:1: ( () )
            {
            // InternalActivityexplorer.g:3222:1: ( () )
            // InternalActivityexplorer.g:3223:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getActivityAccess().getActivityAction_0()); 
            }
            // InternalActivityexplorer.g:3224:1: ()
            // InternalActivityexplorer.g:3226:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getActivityAccess().getActivityAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__Group__0__Impl"


    // $ANTLR start "rule__Activity__Group__1"
    // InternalActivityexplorer.g:3236:1: rule__Activity__Group__1 : rule__Activity__Group__1__Impl rule__Activity__Group__2 ;
    public final void rule__Activity__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActivityexplorer.g:3240:1: ( rule__Activity__Group__1__Impl rule__Activity__Group__2 )
            // InternalActivityexplorer.g:3241:2: rule__Activity__Group__1__Impl rule__Activity__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Activity__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Activity__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__Group__1"


    // $ANTLR start "rule__Activity__Group__1__Impl"
    // InternalActivityexplorer.g:3248:1: rule__Activity__Group__1__Impl : ( 'activity' ) ;
    public final void rule__Activity__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActivityexplorer.g:3252:1: ( ( 'activity' ) )
            // InternalActivityexplorer.g:3253:1: ( 'activity' )
            {
            // InternalActivityexplorer.g:3253:1: ( 'activity' )
            // InternalActivityexplorer.g:3254:1: 'activity'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getActivityAccess().getActivityKeyword_1()); 
            }
            match(input,35,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getActivityAccess().getActivityKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__Group__1__Impl"


    // $ANTLR start "rule__Activity__Group__2"
    // InternalActivityexplorer.g:3267:1: rule__Activity__Group__2 : rule__Activity__Group__2__Impl rule__Activity__Group__3 ;
    public final void rule__Activity__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActivityexplorer.g:3271:1: ( rule__Activity__Group__2__Impl rule__Activity__Group__3 )
            // InternalActivityexplorer.g:3272:2: rule__Activity__Group__2__Impl rule__Activity__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__Activity__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Activity__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__Group__2"


    // $ANTLR start "rule__Activity__Group__2__Impl"
    // InternalActivityexplorer.g:3279:1: rule__Activity__Group__2__Impl : ( ( rule__Activity__NameAssignment_2 ) ) ;
    public final void rule__Activity__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActivityexplorer.g:3283:1: ( ( ( rule__Activity__NameAssignment_2 ) ) )
            // InternalActivityexplorer.g:3284:1: ( ( rule__Activity__NameAssignment_2 ) )
            {
            // InternalActivityexplorer.g:3284:1: ( ( rule__Activity__NameAssignment_2 ) )
            // InternalActivityexplorer.g:3285:1: ( rule__Activity__NameAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getActivityAccess().getNameAssignment_2()); 
            }
            // InternalActivityexplorer.g:3286:1: ( rule__Activity__NameAssignment_2 )
            // InternalActivityexplorer.g:3286:2: rule__Activity__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Activity__NameAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getActivityAccess().getNameAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__Group__2__Impl"


    // $ANTLR start "rule__Activity__Group__3"
    // InternalActivityexplorer.g:3296:1: rule__Activity__Group__3 : rule__Activity__Group__3__Impl rule__Activity__Group__4 ;
    public final void rule__Activity__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActivityexplorer.g:3300:1: ( rule__Activity__Group__3__Impl rule__Activity__Group__4 )
            // InternalActivityexplorer.g:3301:2: rule__Activity__Group__3__Impl rule__Activity__Group__4
            {
            pushFollow(FOLLOW_22);
            rule__Activity__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Activity__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__Group__3"


    // $ANTLR start "rule__Activity__Group__3__Impl"
    // InternalActivityexplorer.g:3308:1: rule__Activity__Group__3__Impl : ( '{' ) ;
    public final void rule__Activity__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActivityexplorer.g:3312:1: ( ( '{' ) )
            // InternalActivityexplorer.g:3313:1: ( '{' )
            {
            // InternalActivityexplorer.g:3313:1: ( '{' )
            // InternalActivityexplorer.g:3314:1: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getActivityAccess().getLeftCurlyBracketKeyword_3()); 
            }
            match(input,14,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getActivityAccess().getLeftCurlyBracketKeyword_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__Group__3__Impl"


    // $ANTLR start "rule__Activity__Group__4"
    // InternalActivityexplorer.g:3327:1: rule__Activity__Group__4 : rule__Activity__Group__4__Impl rule__Activity__Group__5 ;
    public final void rule__Activity__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActivityexplorer.g:3331:1: ( rule__Activity__Group__4__Impl rule__Activity__Group__5 )
            // InternalActivityexplorer.g:3332:2: rule__Activity__Group__4__Impl rule__Activity__Group__5
            {
            pushFollow(FOLLOW_22);
            rule__Activity__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Activity__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__Group__4"


    // $ANTLR start "rule__Activity__Group__4__Impl"
    // InternalActivityexplorer.g:3339:1: rule__Activity__Group__4__Impl : ( ( rule__Activity__Group_4__0 )? ) ;
    public final void rule__Activity__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActivityexplorer.g:3343:1: ( ( ( rule__Activity__Group_4__0 )? ) )
            // InternalActivityexplorer.g:3344:1: ( ( rule__Activity__Group_4__0 )? )
            {
            // InternalActivityexplorer.g:3344:1: ( ( rule__Activity__Group_4__0 )? )
            // InternalActivityexplorer.g:3345:1: ( rule__Activity__Group_4__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getActivityAccess().getGroup_4()); 
            }
            // InternalActivityexplorer.g:3346:1: ( rule__Activity__Group_4__0 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==19) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalActivityexplorer.g:3346:2: rule__Activity__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Activity__Group_4__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getActivityAccess().getGroup_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__Group__4__Impl"


    // $ANTLR start "rule__Activity__Group__5"
    // InternalActivityexplorer.g:3356:1: rule__Activity__Group__5 : rule__Activity__Group__5__Impl rule__Activity__Group__6 ;
    public final void rule__Activity__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActivityexplorer.g:3360:1: ( rule__Activity__Group__5__Impl rule__Activity__Group__6 )
            // InternalActivityexplorer.g:3361:2: rule__Activity__Group__5__Impl rule__Activity__Group__6
            {
            pushFollow(FOLLOW_22);
            rule__Activity__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Activity__Group__6();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__Group__5"


    // $ANTLR start "rule__Activity__Group__5__Impl"
    // InternalActivityexplorer.g:3368:1: rule__Activity__Group__5__Impl : ( ( rule__Activity__Group_5__0 )? ) ;
    public final void rule__Activity__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActivityexplorer.g:3372:1: ( ( ( rule__Activity__Group_5__0 )? ) )
            // InternalActivityexplorer.g:3373:1: ( ( rule__Activity__Group_5__0 )? )
            {
            // InternalActivityexplorer.g:3373:1: ( ( rule__Activity__Group_5__0 )? )
            // InternalActivityexplorer.g:3374:1: ( rule__Activity__Group_5__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getActivityAccess().getGroup_5()); 
            }
            // InternalActivityexplorer.g:3375:1: ( rule__Activity__Group_5__0 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==21) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalActivityexplorer.g:3375:2: rule__Activity__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Activity__Group_5__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getActivityAccess().getGroup_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__Group__5__Impl"


    // $ANTLR start "rule__Activity__Group__6"
    // InternalActivityexplorer.g:3385:1: rule__Activity__Group__6 : rule__Activity__Group__6__Impl rule__Activity__Group__7 ;
    public final void rule__Activity__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActivityexplorer.g:3389:1: ( rule__Activity__Group__6__Impl rule__Activity__Group__7 )
            // InternalActivityexplorer.g:3390:2: rule__Activity__Group__6__Impl rule__Activity__Group__7
            {
            pushFollow(FOLLOW_22);
            rule__Activity__Group__6__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Activity__Group__7();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__Group__6"


    // $ANTLR start "rule__Activity__Group__6__Impl"
    // InternalActivityexplorer.g:3397:1: rule__Activity__Group__6__Impl : ( ( rule__Activity__Group_6__0 )? ) ;
    public final void rule__Activity__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActivityexplorer.g:3401:1: ( ( ( rule__Activity__Group_6__0 )? ) )
            // InternalActivityexplorer.g:3402:1: ( ( rule__Activity__Group_6__0 )? )
            {
            // InternalActivityexplorer.g:3402:1: ( ( rule__Activity__Group_6__0 )? )
            // InternalActivityexplorer.g:3403:1: ( rule__Activity__Group_6__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getActivityAccess().getGroup_6()); 
            }
            // InternalActivityexplorer.g:3404:1: ( rule__Activity__Group_6__0 )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==22) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalActivityexplorer.g:3404:2: rule__Activity__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Activity__Group_6__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getActivityAccess().getGroup_6()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__Group__6__Impl"


    // $ANTLR start "rule__Activity__Group__7"
    // InternalActivityexplorer.g:3414:1: rule__Activity__Group__7 : rule__Activity__Group__7__Impl rule__Activity__Group__8 ;
    public final void rule__Activity__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActivityexplorer.g:3418:1: ( rule__Activity__Group__7__Impl rule__Activity__Group__8 )
            // InternalActivityexplorer.g:3419:2: rule__Activity__Group__7__Impl rule__Activity__Group__8
            {
            pushFollow(FOLLOW_13);
            rule__Activity__Group__7__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Activity__Group__8();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__Group__7"


    // $ANTLR start "rule__Activity__Group__7__Impl"
    // InternalActivityexplorer.g:3426:1: rule__Activity__Group__7__Impl : ( 'index' ) ;
    public final void rule__Activity__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActivityexplorer.g:3430:1: ( ( 'index' ) )
            // InternalActivityexplorer.g:3431:1: ( 'index' )
            {
            // InternalActivityexplorer.g:3431:1: ( 'index' )
            // InternalActivityexplorer.g:3432:1: 'index'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getActivityAccess().getIndexKeyword_7()); 
            }
            match(input,18,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getActivityAccess().getIndexKeyword_7()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__Group__7__Impl"


    // $ANTLR start "rule__Activity__Group__8"
    // InternalActivityexplorer.g:3445:1: rule__Activity__Group__8 : rule__Activity__Group__8__Impl rule__Activity__Group__9 ;
    public final void rule__Activity__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActivityexplorer.g:3449:1: ( rule__Activity__Group__8__Impl rule__Activity__Group__9 )
            // InternalActivityexplorer.g:3450:2: rule__Activity__Group__8__Impl rule__Activity__Group__9
            {
            pushFollow(FOLLOW_27);
            rule__Activity__Group__8__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Activity__Group__9();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__Group__8"


    // $ANTLR start "rule__Activity__Group__8__Impl"
    // InternalActivityexplorer.g:3457:1: rule__Activity__Group__8__Impl : ( ( rule__Activity__IndexAssignment_8 ) ) ;
    public final void rule__Activity__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActivityexplorer.g:3461:1: ( ( ( rule__Activity__IndexAssignment_8 ) ) )
            // InternalActivityexplorer.g:3462:1: ( ( rule__Activity__IndexAssignment_8 ) )
            {
            // InternalActivityexplorer.g:3462:1: ( ( rule__Activity__IndexAssignment_8 ) )
            // InternalActivityexplorer.g:3463:1: ( rule__Activity__IndexAssignment_8 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getActivityAccess().getIndexAssignment_8()); 
            }
            // InternalActivityexplorer.g:3464:1: ( rule__Activity__IndexAssignment_8 )
            // InternalActivityexplorer.g:3464:2: rule__Activity__IndexAssignment_8
            {
            pushFollow(FOLLOW_2);
            rule__Activity__IndexAssignment_8();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getActivityAccess().getIndexAssignment_8()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__Group__8__Impl"


    // $ANTLR start "rule__Activity__Group__9"
    // InternalActivityexplorer.g:3474:1: rule__Activity__Group__9 : rule__Activity__Group__9__Impl rule__Activity__Group__10 ;
    public final void rule__Activity__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActivityexplorer.g:3478:1: ( rule__Activity__Group__9__Impl rule__Activity__Group__10 )
            // InternalActivityexplorer.g:3479:2: rule__Activity__Group__9__Impl rule__Activity__Group__10
            {
            pushFollow(FOLLOW_27);
            rule__Activity__Group__9__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Activity__Group__10();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__Group__9"


    // $ANTLR start "rule__Activity__Group__9__Impl"
    // InternalActivityexplorer.g:3486:1: rule__Activity__Group__9__Impl : ( ( rule__Activity__Group_9__0 )? ) ;
    public final void rule__Activity__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActivityexplorer.g:3490:1: ( ( ( rule__Activity__Group_9__0 )? ) )
            // InternalActivityexplorer.g:3491:1: ( ( rule__Activity__Group_9__0 )? )
            {
            // InternalActivityexplorer.g:3491:1: ( ( rule__Activity__Group_9__0 )? )
            // InternalActivityexplorer.g:3492:1: ( rule__Activity__Group_9__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getActivityAccess().getGroup_9()); 
            }
            // InternalActivityexplorer.g:3493:1: ( rule__Activity__Group_9__0 )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==28) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalActivityexplorer.g:3493:2: rule__Activity__Group_9__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Activity__Group_9__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getActivityAccess().getGroup_9()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__Group__9__Impl"


    // $ANTLR start "rule__Activity__Group__10"
    // InternalActivityexplorer.g:3503:1: rule__Activity__Group__10 : rule__Activity__Group__10__Impl rule__Activity__Group__11 ;
    public final void rule__Activity__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActivityexplorer.g:3507:1: ( rule__Activity__Group__10__Impl rule__Activity__Group__11 )
            // InternalActivityexplorer.g:3508:2: rule__Activity__Group__10__Impl rule__Activity__Group__11
            {
            pushFollow(FOLLOW_27);
            rule__Activity__Group__10__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Activity__Group__11();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__Group__10"


    // $ANTLR start "rule__Activity__Group__10__Impl"
    // InternalActivityexplorer.g:3515:1: rule__Activity__Group__10__Impl : ( ( rule__Activity__Group_10__0 )? ) ;
    public final void rule__Activity__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActivityexplorer.g:3519:1: ( ( ( rule__Activity__Group_10__0 )? ) )
            // InternalActivityexplorer.g:3520:1: ( ( rule__Activity__Group_10__0 )? )
            {
            // InternalActivityexplorer.g:3520:1: ( ( rule__Activity__Group_10__0 )? )
            // InternalActivityexplorer.g:3521:1: ( rule__Activity__Group_10__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getActivityAccess().getGroup_10()); 
            }
            // InternalActivityexplorer.g:3522:1: ( rule__Activity__Group_10__0 )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==36) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalActivityexplorer.g:3522:2: rule__Activity__Group_10__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Activity__Group_10__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getActivityAccess().getGroup_10()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__Group__10__Impl"


    // $ANTLR start "rule__Activity__Group__11"
    // InternalActivityexplorer.g:3532:1: rule__Activity__Group__11 : rule__Activity__Group__11__Impl ;
    public final void rule__Activity__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActivityexplorer.g:3536:1: ( rule__Activity__Group__11__Impl )
            // InternalActivityexplorer.g:3537:2: rule__Activity__Group__11__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Activity__Group__11__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__Group__11"


    // $ANTLR start "rule__Activity__Group__11__Impl"
    // InternalActivityexplorer.g:3543:1: rule__Activity__Group__11__Impl : ( '}' ) ;
    public final void rule__Activity__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActivityexplorer.g:3547:1: ( ( '}' ) )
            // InternalActivityexplorer.g:3548:1: ( '}' )
            {
            // InternalActivityexplorer.g:3548:1: ( '}' )
            // InternalActivityexplorer.g:3549:1: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getActivityAccess().getRightCurlyBracketKeyword_11()); 
            }
            match(input,15,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getActivityAccess().getRightCurlyBracketKeyword_11()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__Group__11__Impl"


    // $ANTLR start "rule__Activity__Group_4__0"
    // InternalActivityexplorer.g:3586:1: rule__Activity__Group_4__0 : rule__Activity__Group_4__0__Impl rule__Activity__Group_4__1 ;
    public final void rule__Activity__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActivityexplorer.g:3590:1: ( rule__Activity__Group_4__0__Impl rule__Activity__Group_4__1 )
            // InternalActivityexplorer.g:3591:2: rule__Activity__Group_4__0__Impl rule__Activity__Group_4__1
            {
            pushFollow(FOLLOW_15);
            rule__Activity__Group_4__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Activity__Group_4__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__Group_4__0"


    // $ANTLR start "rule__Activity__Group_4__0__Impl"
    // InternalActivityexplorer.g:3598:1: rule__Activity__Group_4__0__Impl : ( 'description' ) ;
    public final void rule__Activity__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActivityexplorer.g:3602:1: ( ( 'description' ) )
            // InternalActivityexplorer.g:3603:1: ( 'description' )
            {
            // InternalActivityexplorer.g:3603:1: ( 'description' )
            // InternalActivityexplorer.g:3604:1: 'description'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getActivityAccess().getDescriptionKeyword_4_0()); 
            }
            match(input,19,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getActivityAccess().getDescriptionKeyword_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__Group_4__0__Impl"


    // $ANTLR start "rule__Activity__Group_4__1"
    // InternalActivityexplorer.g:3617:1: rule__Activity__Group_4__1 : rule__Activity__Group_4__1__Impl ;
    public final void rule__Activity__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActivityexplorer.g:3621:1: ( rule__Activity__Group_4__1__Impl )
            // InternalActivityexplorer.g:3622:2: rule__Activity__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Activity__Group_4__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__Group_4__1"


    // $ANTLR start "rule__Activity__Group_4__1__Impl"
    // InternalActivityexplorer.g:3628:1: rule__Activity__Group_4__1__Impl : ( ( rule__Activity__DescriptionAssignment_4_1 ) ) ;
    public final void rule__Activity__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActivityexplorer.g:3632:1: ( ( ( rule__Activity__DescriptionAssignment_4_1 ) ) )
            // InternalActivityexplorer.g:3633:1: ( ( rule__Activity__DescriptionAssignment_4_1 ) )
            {
            // InternalActivityexplorer.g:3633:1: ( ( rule__Activity__DescriptionAssignment_4_1 ) )
            // InternalActivityexplorer.g:3634:1: ( rule__Activity__DescriptionAssignment_4_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getActivityAccess().getDescriptionAssignment_4_1()); 
            }
            // InternalActivityexplorer.g:3635:1: ( rule__Activity__DescriptionAssignment_4_1 )
            // InternalActivityexplorer.g:3635:2: rule__Activity__DescriptionAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Activity__DescriptionAssignment_4_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getActivityAccess().getDescriptionAssignment_4_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__Group_4__1__Impl"


    // $ANTLR start "rule__Activity__Group_5__0"
    // InternalActivityexplorer.g:3649:1: rule__Activity__Group_5__0 : rule__Activity__Group_5__0__Impl rule__Activity__Group_5__1 ;
    public final void rule__Activity__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActivityexplorer.g:3653:1: ( rule__Activity__Group_5__0__Impl rule__Activity__Group_5__1 )
            // InternalActivityexplorer.g:3654:2: rule__Activity__Group_5__0__Impl rule__Activity__Group_5__1
            {
            pushFollow(FOLLOW_4);
            rule__Activity__Group_5__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Activity__Group_5__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__Group_5__0"


    // $ANTLR start "rule__Activity__Group_5__0__Impl"
    // InternalActivityexplorer.g:3661:1: rule__Activity__Group_5__0__Impl : ( 'id' ) ;
    public final void rule__Activity__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActivityexplorer.g:3665:1: ( ( 'id' ) )
            // InternalActivityexplorer.g:3666:1: ( 'id' )
            {
            // InternalActivityexplorer.g:3666:1: ( 'id' )
            // InternalActivityexplorer.g:3667:1: 'id'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getActivityAccess().getIdKeyword_5_0()); 
            }
            match(input,21,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getActivityAccess().getIdKeyword_5_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__Group_5__0__Impl"


    // $ANTLR start "rule__Activity__Group_5__1"
    // InternalActivityexplorer.g:3680:1: rule__Activity__Group_5__1 : rule__Activity__Group_5__1__Impl ;
    public final void rule__Activity__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActivityexplorer.g:3684:1: ( rule__Activity__Group_5__1__Impl )
            // InternalActivityexplorer.g:3685:2: rule__Activity__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Activity__Group_5__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__Group_5__1"


    // $ANTLR start "rule__Activity__Group_5__1__Impl"
    // InternalActivityexplorer.g:3691:1: rule__Activity__Group_5__1__Impl : ( ( rule__Activity__ActivityExplorerItemIDAssignment_5_1 ) ) ;
    public final void rule__Activity__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActivityexplorer.g:3695:1: ( ( ( rule__Activity__ActivityExplorerItemIDAssignment_5_1 ) ) )
            // InternalActivityexplorer.g:3696:1: ( ( rule__Activity__ActivityExplorerItemIDAssignment_5_1 ) )
            {
            // InternalActivityexplorer.g:3696:1: ( ( rule__Activity__ActivityExplorerItemIDAssignment_5_1 ) )
            // InternalActivityexplorer.g:3697:1: ( rule__Activity__ActivityExplorerItemIDAssignment_5_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getActivityAccess().getActivityExplorerItemIDAssignment_5_1()); 
            }
            // InternalActivityexplorer.g:3698:1: ( rule__Activity__ActivityExplorerItemIDAssignment_5_1 )
            // InternalActivityexplorer.g:3698:2: rule__Activity__ActivityExplorerItemIDAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__Activity__ActivityExplorerItemIDAssignment_5_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getActivityAccess().getActivityExplorerItemIDAssignment_5_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__Group_5__1__Impl"


    // $ANTLR start "rule__Activity__Group_6__0"
    // InternalActivityexplorer.g:3712:1: rule__Activity__Group_6__0 : rule__Activity__Group_6__0__Impl rule__Activity__Group_6__1 ;
    public final void rule__Activity__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActivityexplorer.g:3716:1: ( rule__Activity__Group_6__0__Impl rule__Activity__Group_6__1 )
            // InternalActivityexplorer.g:3717:2: rule__Activity__Group_6__0__Impl rule__Activity__Group_6__1
            {
            pushFollow(FOLLOW_15);
            rule__Activity__Group_6__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Activity__Group_6__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__Group_6__0"


    // $ANTLR start "rule__Activity__Group_6__0__Impl"
    // InternalActivityexplorer.g:3724:1: rule__Activity__Group_6__0__Impl : ( 'label' ) ;
    public final void rule__Activity__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActivityexplorer.g:3728:1: ( ( 'label' ) )
            // InternalActivityexplorer.g:3729:1: ( 'label' )
            {
            // InternalActivityexplorer.g:3729:1: ( 'label' )
            // InternalActivityexplorer.g:3730:1: 'label'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getActivityAccess().getLabelKeyword_6_0()); 
            }
            match(input,22,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getActivityAccess().getLabelKeyword_6_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__Group_6__0__Impl"


    // $ANTLR start "rule__Activity__Group_6__1"
    // InternalActivityexplorer.g:3743:1: rule__Activity__Group_6__1 : rule__Activity__Group_6__1__Impl ;
    public final void rule__Activity__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActivityexplorer.g:3747:1: ( rule__Activity__Group_6__1__Impl )
            // InternalActivityexplorer.g:3748:2: rule__Activity__Group_6__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Activity__Group_6__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__Group_6__1"


    // $ANTLR start "rule__Activity__Group_6__1__Impl"
    // InternalActivityexplorer.g:3754:1: rule__Activity__Group_6__1__Impl : ( ( rule__Activity__LabelAssignment_6_1 ) ) ;
    public final void rule__Activity__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActivityexplorer.g:3758:1: ( ( ( rule__Activity__LabelAssignment_6_1 ) ) )
            // InternalActivityexplorer.g:3759:1: ( ( rule__Activity__LabelAssignment_6_1 ) )
            {
            // InternalActivityexplorer.g:3759:1: ( ( rule__Activity__LabelAssignment_6_1 ) )
            // InternalActivityexplorer.g:3760:1: ( rule__Activity__LabelAssignment_6_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getActivityAccess().getLabelAssignment_6_1()); 
            }
            // InternalActivityexplorer.g:3761:1: ( rule__Activity__LabelAssignment_6_1 )
            // InternalActivityexplorer.g:3761:2: rule__Activity__LabelAssignment_6_1
            {
            pushFollow(FOLLOW_2);
            rule__Activity__LabelAssignment_6_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getActivityAccess().getLabelAssignment_6_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__Group_6__1__Impl"


    // $ANTLR start "rule__Activity__Group_9__0"
    // InternalActivityexplorer.g:3775:1: rule__Activity__Group_9__0 : rule__Activity__Group_9__0__Impl rule__Activity__Group_9__1 ;
    public final void rule__Activity__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActivityexplorer.g:3779:1: ( rule__Activity__Group_9__0__Impl rule__Activity__Group_9__1 )
            // InternalActivityexplorer.g:3780:2: rule__Activity__Group_9__0__Impl rule__Activity__Group_9__1
            {
            pushFollow(FOLLOW_17);
            rule__Activity__Group_9__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Activity__Group_9__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__Group_9__0"


    // $ANTLR start "rule__Activity__Group_9__0__Impl"
    // InternalActivityexplorer.g:3787:1: rule__Activity__Group_9__0__Impl : ( 'predicated' ) ;
    public final void rule__Activity__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActivityexplorer.g:3791:1: ( ( 'predicated' ) )
            // InternalActivityexplorer.g:3792:1: ( 'predicated' )
            {
            // InternalActivityexplorer.g:3792:1: ( 'predicated' )
            // InternalActivityexplorer.g:3793:1: 'predicated'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getActivityAccess().getPredicatedKeyword_9_0()); 
            }
            match(input,28,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getActivityAccess().getPredicatedKeyword_9_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__Group_9__0__Impl"


    // $ANTLR start "rule__Activity__Group_9__1"
    // InternalActivityexplorer.g:3806:1: rule__Activity__Group_9__1 : rule__Activity__Group_9__1__Impl rule__Activity__Group_9__2 ;
    public final void rule__Activity__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActivityexplorer.g:3810:1: ( rule__Activity__Group_9__1__Impl rule__Activity__Group_9__2 )
            // InternalActivityexplorer.g:3811:2: rule__Activity__Group_9__1__Impl rule__Activity__Group_9__2
            {
            pushFollow(FOLLOW_18);
            rule__Activity__Group_9__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Activity__Group_9__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__Group_9__1"


    // $ANTLR start "rule__Activity__Group_9__1__Impl"
    // InternalActivityexplorer.g:3818:1: rule__Activity__Group_9__1__Impl : ( ':' ) ;
    public final void rule__Activity__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActivityexplorer.g:3822:1: ( ( ':' ) )
            // InternalActivityexplorer.g:3823:1: ( ':' )
            {
            // InternalActivityexplorer.g:3823:1: ( ':' )
            // InternalActivityexplorer.g:3824:1: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getActivityAccess().getColonKeyword_9_1()); 
            }
            match(input,25,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getActivityAccess().getColonKeyword_9_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__Group_9__1__Impl"


    // $ANTLR start "rule__Activity__Group_9__2"
    // InternalActivityexplorer.g:3837:1: rule__Activity__Group_9__2 : rule__Activity__Group_9__2__Impl ;
    public final void rule__Activity__Group_9__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActivityexplorer.g:3841:1: ( rule__Activity__Group_9__2__Impl )
            // InternalActivityexplorer.g:3842:2: rule__Activity__Group_9__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Activity__Group_9__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__Group_9__2"


    // $ANTLR start "rule__Activity__Group_9__2__Impl"
    // InternalActivityexplorer.g:3848:1: rule__Activity__Group_9__2__Impl : ( ( rule__Activity__HasPredicateAssignment_9_2 ) ) ;
    public final void rule__Activity__Group_9__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActivityexplorer.g:3852:1: ( ( ( rule__Activity__HasPredicateAssignment_9_2 ) ) )
            // InternalActivityexplorer.g:3853:1: ( ( rule__Activity__HasPredicateAssignment_9_2 ) )
            {
            // InternalActivityexplorer.g:3853:1: ( ( rule__Activity__HasPredicateAssignment_9_2 ) )
            // InternalActivityexplorer.g:3854:1: ( rule__Activity__HasPredicateAssignment_9_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getActivityAccess().getHasPredicateAssignment_9_2()); 
            }
            // InternalActivityexplorer.g:3855:1: ( rule__Activity__HasPredicateAssignment_9_2 )
            // InternalActivityexplorer.g:3855:2: rule__Activity__HasPredicateAssignment_9_2
            {
            pushFollow(FOLLOW_2);
            rule__Activity__HasPredicateAssignment_9_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getActivityAccess().getHasPredicateAssignment_9_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__Group_9__2__Impl"


    // $ANTLR start "rule__Activity__Group_10__0"
    // InternalActivityexplorer.g:3871:1: rule__Activity__Group_10__0 : rule__Activity__Group_10__0__Impl rule__Activity__Group_10__1 ;
    public final void rule__Activity__Group_10__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActivityexplorer.g:3875:1: ( rule__Activity__Group_10__0__Impl rule__Activity__Group_10__1 )
            // InternalActivityexplorer.g:3876:2: rule__Activity__Group_10__0__Impl rule__Activity__Group_10__1
            {
            pushFollow(FOLLOW_17);
            rule__Activity__Group_10__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Activity__Group_10__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__Group_10__0"


    // $ANTLR start "rule__Activity__Group_10__0__Impl"
    // InternalActivityexplorer.g:3883:1: rule__Activity__Group_10__0__Impl : ( 'icon' ) ;
    public final void rule__Activity__Group_10__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActivityexplorer.g:3887:1: ( ( 'icon' ) )
            // InternalActivityexplorer.g:3888:1: ( 'icon' )
            {
            // InternalActivityexplorer.g:3888:1: ( 'icon' )
            // InternalActivityexplorer.g:3889:1: 'icon'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getActivityAccess().getIconKeyword_10_0()); 
            }
            match(input,36,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getActivityAccess().getIconKeyword_10_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__Group_10__0__Impl"


    // $ANTLR start "rule__Activity__Group_10__1"
    // InternalActivityexplorer.g:3902:1: rule__Activity__Group_10__1 : rule__Activity__Group_10__1__Impl rule__Activity__Group_10__2 ;
    public final void rule__Activity__Group_10__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActivityexplorer.g:3906:1: ( rule__Activity__Group_10__1__Impl rule__Activity__Group_10__2 )
            // InternalActivityexplorer.g:3907:2: rule__Activity__Group_10__1__Impl rule__Activity__Group_10__2
            {
            pushFollow(FOLLOW_15);
            rule__Activity__Group_10__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Activity__Group_10__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__Group_10__1"


    // $ANTLR start "rule__Activity__Group_10__1__Impl"
    // InternalActivityexplorer.g:3914:1: rule__Activity__Group_10__1__Impl : ( ':' ) ;
    public final void rule__Activity__Group_10__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActivityexplorer.g:3918:1: ( ( ':' ) )
            // InternalActivityexplorer.g:3919:1: ( ':' )
            {
            // InternalActivityexplorer.g:3919:1: ( ':' )
            // InternalActivityexplorer.g:3920:1: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getActivityAccess().getColonKeyword_10_1()); 
            }
            match(input,25,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getActivityAccess().getColonKeyword_10_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__Group_10__1__Impl"


    // $ANTLR start "rule__Activity__Group_10__2"
    // InternalActivityexplorer.g:3933:1: rule__Activity__Group_10__2 : rule__Activity__Group_10__2__Impl ;
    public final void rule__Activity__Group_10__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActivityexplorer.g:3937:1: ( rule__Activity__Group_10__2__Impl )
            // InternalActivityexplorer.g:3938:2: rule__Activity__Group_10__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Activity__Group_10__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__Group_10__2"


    // $ANTLR start "rule__Activity__Group_10__2__Impl"
    // InternalActivityexplorer.g:3944:1: rule__Activity__Group_10__2__Impl : ( ( rule__Activity__ImagePathOffAssignment_10_2 ) ) ;
    public final void rule__Activity__Group_10__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActivityexplorer.g:3948:1: ( ( ( rule__Activity__ImagePathOffAssignment_10_2 ) ) )
            // InternalActivityexplorer.g:3949:1: ( ( rule__Activity__ImagePathOffAssignment_10_2 ) )
            {
            // InternalActivityexplorer.g:3949:1: ( ( rule__Activity__ImagePathOffAssignment_10_2 ) )
            // InternalActivityexplorer.g:3950:1: ( rule__Activity__ImagePathOffAssignment_10_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getActivityAccess().getImagePathOffAssignment_10_2()); 
            }
            // InternalActivityexplorer.g:3951:1: ( rule__Activity__ImagePathOffAssignment_10_2 )
            // InternalActivityexplorer.g:3951:2: rule__Activity__ImagePathOffAssignment_10_2
            {
            pushFollow(FOLLOW_2);
            rule__Activity__ImagePathOffAssignment_10_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getActivityAccess().getImagePathOffAssignment_10_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__Group_10__2__Impl"


    // $ANTLR start "rule__PageExtension__Group__0"
    // InternalActivityexplorer.g:3967:1: rule__PageExtension__Group__0 : rule__PageExtension__Group__0__Impl rule__PageExtension__Group__1 ;
    public final void rule__PageExtension__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActivityexplorer.g:3971:1: ( rule__PageExtension__Group__0__Impl rule__PageExtension__Group__1 )
            // InternalActivityexplorer.g:3972:2: rule__PageExtension__Group__0__Impl rule__PageExtension__Group__1
            {
            pushFollow(FOLLOW_28);
            rule__PageExtension__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__PageExtension__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PageExtension__Group__0"


    // $ANTLR start "rule__PageExtension__Group__0__Impl"
    // InternalActivityexplorer.g:3979:1: rule__PageExtension__Group__0__Impl : ( () ) ;
    public final void rule__PageExtension__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActivityexplorer.g:3983:1: ( ( () ) )
            // InternalActivityexplorer.g:3984:1: ( () )
            {
            // InternalActivityexplorer.g:3984:1: ( () )
            // InternalActivityexplorer.g:3985:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPageExtensionAccess().getPageExtensionAction_0()); 
            }
            // InternalActivityexplorer.g:3986:1: ()
            // InternalActivityexplorer.g:3988:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPageExtensionAccess().getPageExtensionAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PageExtension__Group__0__Impl"


    // $ANTLR start "rule__PageExtension__Group__1"
    // InternalActivityexplorer.g:3998:1: rule__PageExtension__Group__1 : rule__PageExtension__Group__1__Impl rule__PageExtension__Group__2 ;
    public final void rule__PageExtension__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActivityexplorer.g:4002:1: ( rule__PageExtension__Group__1__Impl rule__PageExtension__Group__2 )
            // InternalActivityexplorer.g:4003:2: rule__PageExtension__Group__1__Impl rule__PageExtension__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__PageExtension__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__PageExtension__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PageExtension__Group__1"


    // $ANTLR start "rule__PageExtension__Group__1__Impl"
    // InternalActivityexplorer.g:4010:1: rule__PageExtension__Group__1__Impl : ( 'page-extensions' ) ;
    public final void rule__PageExtension__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActivityexplorer.g:4014:1: ( ( 'page-extensions' ) )
            // InternalActivityexplorer.g:4015:1: ( 'page-extensions' )
            {
            // InternalActivityexplorer.g:4015:1: ( 'page-extensions' )
            // InternalActivityexplorer.g:4016:1: 'page-extensions'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPageExtensionAccess().getPageExtensionsKeyword_1()); 
            }
            match(input,37,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPageExtensionAccess().getPageExtensionsKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PageExtension__Group__1__Impl"


    // $ANTLR start "rule__PageExtension__Group__2"
    // InternalActivityexplorer.g:4029:1: rule__PageExtension__Group__2 : rule__PageExtension__Group__2__Impl rule__PageExtension__Group__3 ;
    public final void rule__PageExtension__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActivityexplorer.g:4033:1: ( rule__PageExtension__Group__2__Impl rule__PageExtension__Group__3 )
            // InternalActivityexplorer.g:4034:2: rule__PageExtension__Group__2__Impl rule__PageExtension__Group__3
            {
            pushFollow(FOLLOW_29);
            rule__PageExtension__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__PageExtension__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PageExtension__Group__2"


    // $ANTLR start "rule__PageExtension__Group__2__Impl"
    // InternalActivityexplorer.g:4041:1: rule__PageExtension__Group__2__Impl : ( '{' ) ;
    public final void rule__PageExtension__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActivityexplorer.g:4045:1: ( ( '{' ) )
            // InternalActivityexplorer.g:4046:1: ( '{' )
            {
            // InternalActivityexplorer.g:4046:1: ( '{' )
            // InternalActivityexplorer.g:4047:1: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPageExtensionAccess().getLeftCurlyBracketKeyword_2()); 
            }
            match(input,14,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPageExtensionAccess().getLeftCurlyBracketKeyword_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PageExtension__Group__2__Impl"


    // $ANTLR start "rule__PageExtension__Group__3"
    // InternalActivityexplorer.g:4060:1: rule__PageExtension__Group__3 : rule__PageExtension__Group__3__Impl rule__PageExtension__Group__4 ;
    public final void rule__PageExtension__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActivityexplorer.g:4064:1: ( rule__PageExtension__Group__3__Impl rule__PageExtension__Group__4 )
            // InternalActivityexplorer.g:4065:2: rule__PageExtension__Group__3__Impl rule__PageExtension__Group__4
            {
            pushFollow(FOLLOW_4);
            rule__PageExtension__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__PageExtension__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PageExtension__Group__3"


    // $ANTLR start "rule__PageExtension__Group__3__Impl"
    // InternalActivityexplorer.g:4072:1: rule__PageExtension__Group__3__Impl : ( 'extended-page' ) ;
    public final void rule__PageExtension__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActivityexplorer.g:4076:1: ( ( 'extended-page' ) )
            // InternalActivityexplorer.g:4077:1: ( 'extended-page' )
            {
            // InternalActivityexplorer.g:4077:1: ( 'extended-page' )
            // InternalActivityexplorer.g:4078:1: 'extended-page'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPageExtensionAccess().getExtendedPageKeyword_3()); 
            }
            match(input,38,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPageExtensionAccess().getExtendedPageKeyword_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PageExtension__Group__3__Impl"


    // $ANTLR start "rule__PageExtension__Group__4"
    // InternalActivityexplorer.g:4091:1: rule__PageExtension__Group__4 : rule__PageExtension__Group__4__Impl rule__PageExtension__Group__5 ;
    public final void rule__PageExtension__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActivityexplorer.g:4095:1: ( rule__PageExtension__Group__4__Impl rule__PageExtension__Group__5 )
            // InternalActivityexplorer.g:4096:2: rule__PageExtension__Group__4__Impl rule__PageExtension__Group__5
            {
            pushFollow(FOLLOW_19);
            rule__PageExtension__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__PageExtension__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PageExtension__Group__4"


    // $ANTLR start "rule__PageExtension__Group__4__Impl"
    // InternalActivityexplorer.g:4103:1: rule__PageExtension__Group__4__Impl : ( ( rule__PageExtension__ExtendedPageIDAssignment_4 ) ) ;
    public final void rule__PageExtension__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActivityexplorer.g:4107:1: ( ( ( rule__PageExtension__ExtendedPageIDAssignment_4 ) ) )
            // InternalActivityexplorer.g:4108:1: ( ( rule__PageExtension__ExtendedPageIDAssignment_4 ) )
            {
            // InternalActivityexplorer.g:4108:1: ( ( rule__PageExtension__ExtendedPageIDAssignment_4 ) )
            // InternalActivityexplorer.g:4109:1: ( rule__PageExtension__ExtendedPageIDAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPageExtensionAccess().getExtendedPageIDAssignment_4()); 
            }
            // InternalActivityexplorer.g:4110:1: ( rule__PageExtension__ExtendedPageIDAssignment_4 )
            // InternalActivityexplorer.g:4110:2: rule__PageExtension__ExtendedPageIDAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__PageExtension__ExtendedPageIDAssignment_4();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPageExtensionAccess().getExtendedPageIDAssignment_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PageExtension__Group__4__Impl"


    // $ANTLR start "rule__PageExtension__Group__5"
    // InternalActivityexplorer.g:4120:1: rule__PageExtension__Group__5 : rule__PageExtension__Group__5__Impl rule__PageExtension__Group__6 ;
    public final void rule__PageExtension__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActivityexplorer.g:4124:1: ( rule__PageExtension__Group__5__Impl rule__PageExtension__Group__6 )
            // InternalActivityexplorer.g:4125:2: rule__PageExtension__Group__5__Impl rule__PageExtension__Group__6
            {
            pushFollow(FOLLOW_19);
            rule__PageExtension__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__PageExtension__Group__6();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PageExtension__Group__5"


    // $ANTLR start "rule__PageExtension__Group__5__Impl"
    // InternalActivityexplorer.g:4132:1: rule__PageExtension__Group__5__Impl : ( ( rule__PageExtension__OwnedSectionsAssignment_5 )* ) ;
    public final void rule__PageExtension__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActivityexplorer.g:4136:1: ( ( ( rule__PageExtension__OwnedSectionsAssignment_5 )* ) )
            // InternalActivityexplorer.g:4137:1: ( ( rule__PageExtension__OwnedSectionsAssignment_5 )* )
            {
            // InternalActivityexplorer.g:4137:1: ( ( rule__PageExtension__OwnedSectionsAssignment_5 )* )
            // InternalActivityexplorer.g:4138:1: ( rule__PageExtension__OwnedSectionsAssignment_5 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPageExtensionAccess().getOwnedSectionsAssignment_5()); 
            }
            // InternalActivityexplorer.g:4139:1: ( rule__PageExtension__OwnedSectionsAssignment_5 )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==31) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // InternalActivityexplorer.g:4139:2: rule__PageExtension__OwnedSectionsAssignment_5
            	    {
            	    pushFollow(FOLLOW_20);
            	    rule__PageExtension__OwnedSectionsAssignment_5();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop31;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPageExtensionAccess().getOwnedSectionsAssignment_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PageExtension__Group__5__Impl"


    // $ANTLR start "rule__PageExtension__Group__6"
    // InternalActivityexplorer.g:4149:1: rule__PageExtension__Group__6 : rule__PageExtension__Group__6__Impl ;
    public final void rule__PageExtension__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActivityexplorer.g:4153:1: ( rule__PageExtension__Group__6__Impl )
            // InternalActivityexplorer.g:4154:2: rule__PageExtension__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PageExtension__Group__6__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PageExtension__Group__6"


    // $ANTLR start "rule__PageExtension__Group__6__Impl"
    // InternalActivityexplorer.g:4160:1: rule__PageExtension__Group__6__Impl : ( '}' ) ;
    public final void rule__PageExtension__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActivityexplorer.g:4164:1: ( ( '}' ) )
            // InternalActivityexplorer.g:4165:1: ( '}' )
            {
            // InternalActivityexplorer.g:4165:1: ( '}' )
            // InternalActivityexplorer.g:4166:1: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPageExtensionAccess().getRightCurlyBracketKeyword_6()); 
            }
            match(input,15,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPageExtensionAccess().getRightCurlyBracketKeyword_6()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PageExtension__Group__6__Impl"


    // $ANTLR start "rule__SectionExtension__Group__0"
    // InternalActivityexplorer.g:4193:1: rule__SectionExtension__Group__0 : rule__SectionExtension__Group__0__Impl rule__SectionExtension__Group__1 ;
    public final void rule__SectionExtension__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActivityexplorer.g:4197:1: ( rule__SectionExtension__Group__0__Impl rule__SectionExtension__Group__1 )
            // InternalActivityexplorer.g:4198:2: rule__SectionExtension__Group__0__Impl rule__SectionExtension__Group__1
            {
            pushFollow(FOLLOW_30);
            rule__SectionExtension__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__SectionExtension__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SectionExtension__Group__0"


    // $ANTLR start "rule__SectionExtension__Group__0__Impl"
    // InternalActivityexplorer.g:4205:1: rule__SectionExtension__Group__0__Impl : ( () ) ;
    public final void rule__SectionExtension__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActivityexplorer.g:4209:1: ( ( () ) )
            // InternalActivityexplorer.g:4210:1: ( () )
            {
            // InternalActivityexplorer.g:4210:1: ( () )
            // InternalActivityexplorer.g:4211:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSectionExtensionAccess().getSectionExtensionAction_0()); 
            }
            // InternalActivityexplorer.g:4212:1: ()
            // InternalActivityexplorer.g:4214:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSectionExtensionAccess().getSectionExtensionAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SectionExtension__Group__0__Impl"


    // $ANTLR start "rule__SectionExtension__Group__1"
    // InternalActivityexplorer.g:4224:1: rule__SectionExtension__Group__1 : rule__SectionExtension__Group__1__Impl rule__SectionExtension__Group__2 ;
    public final void rule__SectionExtension__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActivityexplorer.g:4228:1: ( rule__SectionExtension__Group__1__Impl rule__SectionExtension__Group__2 )
            // InternalActivityexplorer.g:4229:2: rule__SectionExtension__Group__1__Impl rule__SectionExtension__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__SectionExtension__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__SectionExtension__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SectionExtension__Group__1"


    // $ANTLR start "rule__SectionExtension__Group__1__Impl"
    // InternalActivityexplorer.g:4236:1: rule__SectionExtension__Group__1__Impl : ( 'section-extensions' ) ;
    public final void rule__SectionExtension__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActivityexplorer.g:4240:1: ( ( 'section-extensions' ) )
            // InternalActivityexplorer.g:4241:1: ( 'section-extensions' )
            {
            // InternalActivityexplorer.g:4241:1: ( 'section-extensions' )
            // InternalActivityexplorer.g:4242:1: 'section-extensions'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSectionExtensionAccess().getSectionExtensionsKeyword_1()); 
            }
            match(input,39,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSectionExtensionAccess().getSectionExtensionsKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SectionExtension__Group__1__Impl"


    // $ANTLR start "rule__SectionExtension__Group__2"
    // InternalActivityexplorer.g:4255:1: rule__SectionExtension__Group__2 : rule__SectionExtension__Group__2__Impl rule__SectionExtension__Group__3 ;
    public final void rule__SectionExtension__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActivityexplorer.g:4259:1: ( rule__SectionExtension__Group__2__Impl rule__SectionExtension__Group__3 )
            // InternalActivityexplorer.g:4260:2: rule__SectionExtension__Group__2__Impl rule__SectionExtension__Group__3
            {
            pushFollow(FOLLOW_31);
            rule__SectionExtension__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__SectionExtension__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SectionExtension__Group__2"


    // $ANTLR start "rule__SectionExtension__Group__2__Impl"
    // InternalActivityexplorer.g:4267:1: rule__SectionExtension__Group__2__Impl : ( '{' ) ;
    public final void rule__SectionExtension__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActivityexplorer.g:4271:1: ( ( '{' ) )
            // InternalActivityexplorer.g:4272:1: ( '{' )
            {
            // InternalActivityexplorer.g:4272:1: ( '{' )
            // InternalActivityexplorer.g:4273:1: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSectionExtensionAccess().getLeftCurlyBracketKeyword_2()); 
            }
            match(input,14,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSectionExtensionAccess().getLeftCurlyBracketKeyword_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SectionExtension__Group__2__Impl"


    // $ANTLR start "rule__SectionExtension__Group__3"
    // InternalActivityexplorer.g:4286:1: rule__SectionExtension__Group__3 : rule__SectionExtension__Group__3__Impl rule__SectionExtension__Group__4 ;
    public final void rule__SectionExtension__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActivityexplorer.g:4290:1: ( rule__SectionExtension__Group__3__Impl rule__SectionExtension__Group__4 )
            // InternalActivityexplorer.g:4291:2: rule__SectionExtension__Group__3__Impl rule__SectionExtension__Group__4
            {
            pushFollow(FOLLOW_4);
            rule__SectionExtension__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__SectionExtension__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SectionExtension__Group__3"


    // $ANTLR start "rule__SectionExtension__Group__3__Impl"
    // InternalActivityexplorer.g:4298:1: rule__SectionExtension__Group__3__Impl : ( 'extended-section' ) ;
    public final void rule__SectionExtension__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActivityexplorer.g:4302:1: ( ( 'extended-section' ) )
            // InternalActivityexplorer.g:4303:1: ( 'extended-section' )
            {
            // InternalActivityexplorer.g:4303:1: ( 'extended-section' )
            // InternalActivityexplorer.g:4304:1: 'extended-section'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSectionExtensionAccess().getExtendedSectionKeyword_3()); 
            }
            match(input,40,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSectionExtensionAccess().getExtendedSectionKeyword_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SectionExtension__Group__3__Impl"


    // $ANTLR start "rule__SectionExtension__Group__4"
    // InternalActivityexplorer.g:4317:1: rule__SectionExtension__Group__4 : rule__SectionExtension__Group__4__Impl rule__SectionExtension__Group__5 ;
    public final void rule__SectionExtension__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActivityexplorer.g:4321:1: ( rule__SectionExtension__Group__4__Impl rule__SectionExtension__Group__5 )
            // InternalActivityexplorer.g:4322:2: rule__SectionExtension__Group__4__Impl rule__SectionExtension__Group__5
            {
            pushFollow(FOLLOW_24);
            rule__SectionExtension__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__SectionExtension__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SectionExtension__Group__4"


    // $ANTLR start "rule__SectionExtension__Group__4__Impl"
    // InternalActivityexplorer.g:4329:1: rule__SectionExtension__Group__4__Impl : ( ( rule__SectionExtension__ExtendedSectionIDAssignment_4 ) ) ;
    public final void rule__SectionExtension__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActivityexplorer.g:4333:1: ( ( ( rule__SectionExtension__ExtendedSectionIDAssignment_4 ) ) )
            // InternalActivityexplorer.g:4334:1: ( ( rule__SectionExtension__ExtendedSectionIDAssignment_4 ) )
            {
            // InternalActivityexplorer.g:4334:1: ( ( rule__SectionExtension__ExtendedSectionIDAssignment_4 ) )
            // InternalActivityexplorer.g:4335:1: ( rule__SectionExtension__ExtendedSectionIDAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSectionExtensionAccess().getExtendedSectionIDAssignment_4()); 
            }
            // InternalActivityexplorer.g:4336:1: ( rule__SectionExtension__ExtendedSectionIDAssignment_4 )
            // InternalActivityexplorer.g:4336:2: rule__SectionExtension__ExtendedSectionIDAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__SectionExtension__ExtendedSectionIDAssignment_4();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSectionExtensionAccess().getExtendedSectionIDAssignment_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SectionExtension__Group__4__Impl"


    // $ANTLR start "rule__SectionExtension__Group__5"
    // InternalActivityexplorer.g:4346:1: rule__SectionExtension__Group__5 : rule__SectionExtension__Group__5__Impl rule__SectionExtension__Group__6 ;
    public final void rule__SectionExtension__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActivityexplorer.g:4350:1: ( rule__SectionExtension__Group__5__Impl rule__SectionExtension__Group__6 )
            // InternalActivityexplorer.g:4351:2: rule__SectionExtension__Group__5__Impl rule__SectionExtension__Group__6
            {
            pushFollow(FOLLOW_24);
            rule__SectionExtension__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__SectionExtension__Group__6();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SectionExtension__Group__5"


    // $ANTLR start "rule__SectionExtension__Group__5__Impl"
    // InternalActivityexplorer.g:4358:1: rule__SectionExtension__Group__5__Impl : ( ( rule__SectionExtension__OwnedActivitiesAssignment_5 )* ) ;
    public final void rule__SectionExtension__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActivityexplorer.g:4362:1: ( ( ( rule__SectionExtension__OwnedActivitiesAssignment_5 )* ) )
            // InternalActivityexplorer.g:4363:1: ( ( rule__SectionExtension__OwnedActivitiesAssignment_5 )* )
            {
            // InternalActivityexplorer.g:4363:1: ( ( rule__SectionExtension__OwnedActivitiesAssignment_5 )* )
            // InternalActivityexplorer.g:4364:1: ( rule__SectionExtension__OwnedActivitiesAssignment_5 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSectionExtensionAccess().getOwnedActivitiesAssignment_5()); 
            }
            // InternalActivityexplorer.g:4365:1: ( rule__SectionExtension__OwnedActivitiesAssignment_5 )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==35) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // InternalActivityexplorer.g:4365:2: rule__SectionExtension__OwnedActivitiesAssignment_5
            	    {
            	    pushFollow(FOLLOW_25);
            	    rule__SectionExtension__OwnedActivitiesAssignment_5();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop32;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSectionExtensionAccess().getOwnedActivitiesAssignment_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SectionExtension__Group__5__Impl"


    // $ANTLR start "rule__SectionExtension__Group__6"
    // InternalActivityexplorer.g:4375:1: rule__SectionExtension__Group__6 : rule__SectionExtension__Group__6__Impl ;
    public final void rule__SectionExtension__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActivityexplorer.g:4379:1: ( rule__SectionExtension__Group__6__Impl )
            // InternalActivityexplorer.g:4380:2: rule__SectionExtension__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SectionExtension__Group__6__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SectionExtension__Group__6"


    // $ANTLR start "rule__SectionExtension__Group__6__Impl"
    // InternalActivityexplorer.g:4386:1: rule__SectionExtension__Group__6__Impl : ( '}' ) ;
    public final void rule__SectionExtension__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActivityexplorer.g:4390:1: ( ( '}' ) )
            // InternalActivityexplorer.g:4391:1: ( '}' )
            {
            // InternalActivityexplorer.g:4391:1: ( '}' )
            // InternalActivityexplorer.g:4392:1: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSectionExtensionAccess().getRightCurlyBracketKeyword_6()); 
            }
            match(input,15,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSectionExtensionAccess().getRightCurlyBracketKeyword_6()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SectionExtension__Group__6__Impl"


    // $ANTLR start "rule__Overview__Group__0"
    // InternalActivityexplorer.g:4419:1: rule__Overview__Group__0 : rule__Overview__Group__0__Impl rule__Overview__Group__1 ;
    public final void rule__Overview__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActivityexplorer.g:4423:1: ( rule__Overview__Group__0__Impl rule__Overview__Group__1 )
            // InternalActivityexplorer.g:4424:2: rule__Overview__Group__0__Impl rule__Overview__Group__1
            {
            pushFollow(FOLLOW_32);
            rule__Overview__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Overview__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Overview__Group__0"


    // $ANTLR start "rule__Overview__Group__0__Impl"
    // InternalActivityexplorer.g:4431:1: rule__Overview__Group__0__Impl : ( () ) ;
    public final void rule__Overview__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActivityexplorer.g:4435:1: ( ( () ) )
            // InternalActivityexplorer.g:4436:1: ( () )
            {
            // InternalActivityexplorer.g:4436:1: ( () )
            // InternalActivityexplorer.g:4437:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOverviewAccess().getOverviewAction_0()); 
            }
            // InternalActivityexplorer.g:4438:1: ()
            // InternalActivityexplorer.g:4440:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOverviewAccess().getOverviewAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Overview__Group__0__Impl"


    // $ANTLR start "rule__Overview__Group__1"
    // InternalActivityexplorer.g:4450:1: rule__Overview__Group__1 : rule__Overview__Group__1__Impl rule__Overview__Group__2 ;
    public final void rule__Overview__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActivityexplorer.g:4454:1: ( rule__Overview__Group__1__Impl rule__Overview__Group__2 )
            // InternalActivityexplorer.g:4455:2: rule__Overview__Group__1__Impl rule__Overview__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__Overview__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Overview__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Overview__Group__1"


    // $ANTLR start "rule__Overview__Group__1__Impl"
    // InternalActivityexplorer.g:4462:1: rule__Overview__Group__1__Impl : ( 'Overview' ) ;
    public final void rule__Overview__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActivityexplorer.g:4466:1: ( ( 'Overview' ) )
            // InternalActivityexplorer.g:4467:1: ( 'Overview' )
            {
            // InternalActivityexplorer.g:4467:1: ( 'Overview' )
            // InternalActivityexplorer.g:4468:1: 'Overview'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOverviewAccess().getOverviewKeyword_1()); 
            }
            match(input,41,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOverviewAccess().getOverviewKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Overview__Group__1__Impl"


    // $ANTLR start "rule__Overview__Group__2"
    // InternalActivityexplorer.g:4481:1: rule__Overview__Group__2 : rule__Overview__Group__2__Impl rule__Overview__Group__3 ;
    public final void rule__Overview__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActivityexplorer.g:4485:1: ( rule__Overview__Group__2__Impl rule__Overview__Group__3 )
            // InternalActivityexplorer.g:4486:2: rule__Overview__Group__2__Impl rule__Overview__Group__3
            {
            pushFollow(FOLLOW_33);
            rule__Overview__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Overview__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Overview__Group__2"


    // $ANTLR start "rule__Overview__Group__2__Impl"
    // InternalActivityexplorer.g:4493:1: rule__Overview__Group__2__Impl : ( '{' ) ;
    public final void rule__Overview__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActivityexplorer.g:4497:1: ( ( '{' ) )
            // InternalActivityexplorer.g:4498:1: ( '{' )
            {
            // InternalActivityexplorer.g:4498:1: ( '{' )
            // InternalActivityexplorer.g:4499:1: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOverviewAccess().getLeftCurlyBracketKeyword_2()); 
            }
            match(input,14,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOverviewAccess().getLeftCurlyBracketKeyword_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Overview__Group__2__Impl"


    // $ANTLR start "rule__Overview__Group__3"
    // InternalActivityexplorer.g:4512:1: rule__Overview__Group__3 : rule__Overview__Group__3__Impl rule__Overview__Group__4 ;
    public final void rule__Overview__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActivityexplorer.g:4516:1: ( rule__Overview__Group__3__Impl rule__Overview__Group__4 )
            // InternalActivityexplorer.g:4517:2: rule__Overview__Group__3__Impl rule__Overview__Group__4
            {
            pushFollow(FOLLOW_33);
            rule__Overview__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Overview__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Overview__Group__3"


    // $ANTLR start "rule__Overview__Group__3__Impl"
    // InternalActivityexplorer.g:4524:1: rule__Overview__Group__3__Impl : ( ( rule__Overview__Group_3__0 )? ) ;
    public final void rule__Overview__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActivityexplorer.g:4528:1: ( ( ( rule__Overview__Group_3__0 )? ) )
            // InternalActivityexplorer.g:4529:1: ( ( rule__Overview__Group_3__0 )? )
            {
            // InternalActivityexplorer.g:4529:1: ( ( rule__Overview__Group_3__0 )? )
            // InternalActivityexplorer.g:4530:1: ( rule__Overview__Group_3__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOverviewAccess().getGroup_3()); 
            }
            // InternalActivityexplorer.g:4531:1: ( rule__Overview__Group_3__0 )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==19) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalActivityexplorer.g:4531:2: rule__Overview__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Overview__Group_3__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOverviewAccess().getGroup_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Overview__Group__3__Impl"


    // $ANTLR start "rule__Overview__Group__4"
    // InternalActivityexplorer.g:4541:1: rule__Overview__Group__4 : rule__Overview__Group__4__Impl rule__Overview__Group__5 ;
    public final void rule__Overview__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActivityexplorer.g:4545:1: ( rule__Overview__Group__4__Impl rule__Overview__Group__5 )
            // InternalActivityexplorer.g:4546:2: rule__Overview__Group__4__Impl rule__Overview__Group__5
            {
            pushFollow(FOLLOW_33);
            rule__Overview__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Overview__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Overview__Group__4"


    // $ANTLR start "rule__Overview__Group__4__Impl"
    // InternalActivityexplorer.g:4553:1: rule__Overview__Group__4__Impl : ( ( rule__Overview__Group_4__0 )? ) ;
    public final void rule__Overview__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActivityexplorer.g:4557:1: ( ( ( rule__Overview__Group_4__0 )? ) )
            // InternalActivityexplorer.g:4558:1: ( ( rule__Overview__Group_4__0 )? )
            {
            // InternalActivityexplorer.g:4558:1: ( ( rule__Overview__Group_4__0 )? )
            // InternalActivityexplorer.g:4559:1: ( rule__Overview__Group_4__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOverviewAccess().getGroup_4()); 
            }
            // InternalActivityexplorer.g:4560:1: ( rule__Overview__Group_4__0 )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==24) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalActivityexplorer.g:4560:2: rule__Overview__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Overview__Group_4__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOverviewAccess().getGroup_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Overview__Group__4__Impl"


    // $ANTLR start "rule__Overview__Group__5"
    // InternalActivityexplorer.g:4570:1: rule__Overview__Group__5 : rule__Overview__Group__5__Impl rule__Overview__Group__6 ;
    public final void rule__Overview__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActivityexplorer.g:4574:1: ( rule__Overview__Group__5__Impl rule__Overview__Group__6 )
            // InternalActivityexplorer.g:4575:2: rule__Overview__Group__5__Impl rule__Overview__Group__6
            {
            pushFollow(FOLLOW_33);
            rule__Overview__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Overview__Group__6();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Overview__Group__5"


    // $ANTLR start "rule__Overview__Group__5__Impl"
    // InternalActivityexplorer.g:4582:1: rule__Overview__Group__5__Impl : ( ( rule__Overview__Group_5__0 )? ) ;
    public final void rule__Overview__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActivityexplorer.g:4586:1: ( ( ( rule__Overview__Group_5__0 )? ) )
            // InternalActivityexplorer.g:4587:1: ( ( rule__Overview__Group_5__0 )? )
            {
            // InternalActivityexplorer.g:4587:1: ( ( rule__Overview__Group_5__0 )? )
            // InternalActivityexplorer.g:4588:1: ( rule__Overview__Group_5__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOverviewAccess().getGroup_5()); 
            }
            // InternalActivityexplorer.g:4589:1: ( rule__Overview__Group_5__0 )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==26) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalActivityexplorer.g:4589:2: rule__Overview__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Overview__Group_5__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOverviewAccess().getGroup_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Overview__Group__5__Impl"


    // $ANTLR start "rule__Overview__Group__6"
    // InternalActivityexplorer.g:4599:1: rule__Overview__Group__6 : rule__Overview__Group__6__Impl ;
    public final void rule__Overview__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActivityexplorer.g:4603:1: ( rule__Overview__Group__6__Impl )
            // InternalActivityexplorer.g:4604:2: rule__Overview__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Overview__Group__6__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Overview__Group__6"


    // $ANTLR start "rule__Overview__Group__6__Impl"
    // InternalActivityexplorer.g:4610:1: rule__Overview__Group__6__Impl : ( '}' ) ;
    public final void rule__Overview__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActivityexplorer.g:4614:1: ( ( '}' ) )
            // InternalActivityexplorer.g:4615:1: ( '}' )
            {
            // InternalActivityexplorer.g:4615:1: ( '}' )
            // InternalActivityexplorer.g:4616:1: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOverviewAccess().getRightCurlyBracketKeyword_6()); 
            }
            match(input,15,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOverviewAccess().getRightCurlyBracketKeyword_6()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Overview__Group__6__Impl"


    // $ANTLR start "rule__Overview__Group_3__0"
    // InternalActivityexplorer.g:4643:1: rule__Overview__Group_3__0 : rule__Overview__Group_3__0__Impl rule__Overview__Group_3__1 ;
    public final void rule__Overview__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActivityexplorer.g:4647:1: ( rule__Overview__Group_3__0__Impl rule__Overview__Group_3__1 )
            // InternalActivityexplorer.g:4648:2: rule__Overview__Group_3__0__Impl rule__Overview__Group_3__1
            {
            pushFollow(FOLLOW_15);
            rule__Overview__Group_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Overview__Group_3__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Overview__Group_3__0"


    // $ANTLR start "rule__Overview__Group_3__0__Impl"
    // InternalActivityexplorer.g:4655:1: rule__Overview__Group_3__0__Impl : ( 'description' ) ;
    public final void rule__Overview__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActivityexplorer.g:4659:1: ( ( 'description' ) )
            // InternalActivityexplorer.g:4660:1: ( 'description' )
            {
            // InternalActivityexplorer.g:4660:1: ( 'description' )
            // InternalActivityexplorer.g:4661:1: 'description'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOverviewAccess().getDescriptionKeyword_3_0()); 
            }
            match(input,19,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOverviewAccess().getDescriptionKeyword_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Overview__Group_3__0__Impl"


    // $ANTLR start "rule__Overview__Group_3__1"
    // InternalActivityexplorer.g:4674:1: rule__Overview__Group_3__1 : rule__Overview__Group_3__1__Impl ;
    public final void rule__Overview__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActivityexplorer.g:4678:1: ( rule__Overview__Group_3__1__Impl )
            // InternalActivityexplorer.g:4679:2: rule__Overview__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Overview__Group_3__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Overview__Group_3__1"


    // $ANTLR start "rule__Overview__Group_3__1__Impl"
    // InternalActivityexplorer.g:4685:1: rule__Overview__Group_3__1__Impl : ( ( rule__Overview__DescriptionAssignment_3_1 ) ) ;
    public final void rule__Overview__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActivityexplorer.g:4689:1: ( ( ( rule__Overview__DescriptionAssignment_3_1 ) ) )
            // InternalActivityexplorer.g:4690:1: ( ( rule__Overview__DescriptionAssignment_3_1 ) )
            {
            // InternalActivityexplorer.g:4690:1: ( ( rule__Overview__DescriptionAssignment_3_1 ) )
            // InternalActivityexplorer.g:4691:1: ( rule__Overview__DescriptionAssignment_3_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOverviewAccess().getDescriptionAssignment_3_1()); 
            }
            // InternalActivityexplorer.g:4692:1: ( rule__Overview__DescriptionAssignment_3_1 )
            // InternalActivityexplorer.g:4692:2: rule__Overview__DescriptionAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Overview__DescriptionAssignment_3_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOverviewAccess().getDescriptionAssignment_3_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Overview__Group_3__1__Impl"


    // $ANTLR start "rule__Overview__Group_4__0"
    // InternalActivityexplorer.g:4706:1: rule__Overview__Group_4__0 : rule__Overview__Group_4__0__Impl rule__Overview__Group_4__1 ;
    public final void rule__Overview__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActivityexplorer.g:4710:1: ( rule__Overview__Group_4__0__Impl rule__Overview__Group_4__1 )
            // InternalActivityexplorer.g:4711:2: rule__Overview__Group_4__0__Impl rule__Overview__Group_4__1
            {
            pushFollow(FOLLOW_17);
            rule__Overview__Group_4__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Overview__Group_4__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Overview__Group_4__0"


    // $ANTLR start "rule__Overview__Group_4__0__Impl"
    // InternalActivityexplorer.g:4718:1: rule__Overview__Group_4__0__Impl : ( 'image-on' ) ;
    public final void rule__Overview__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActivityexplorer.g:4722:1: ( ( 'image-on' ) )
            // InternalActivityexplorer.g:4723:1: ( 'image-on' )
            {
            // InternalActivityexplorer.g:4723:1: ( 'image-on' )
            // InternalActivityexplorer.g:4724:1: 'image-on'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOverviewAccess().getImageOnKeyword_4_0()); 
            }
            match(input,24,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOverviewAccess().getImageOnKeyword_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Overview__Group_4__0__Impl"


    // $ANTLR start "rule__Overview__Group_4__1"
    // InternalActivityexplorer.g:4737:1: rule__Overview__Group_4__1 : rule__Overview__Group_4__1__Impl rule__Overview__Group_4__2 ;
    public final void rule__Overview__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActivityexplorer.g:4741:1: ( rule__Overview__Group_4__1__Impl rule__Overview__Group_4__2 )
            // InternalActivityexplorer.g:4742:2: rule__Overview__Group_4__1__Impl rule__Overview__Group_4__2
            {
            pushFollow(FOLLOW_15);
            rule__Overview__Group_4__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Overview__Group_4__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Overview__Group_4__1"


    // $ANTLR start "rule__Overview__Group_4__1__Impl"
    // InternalActivityexplorer.g:4749:1: rule__Overview__Group_4__1__Impl : ( ':' ) ;
    public final void rule__Overview__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActivityexplorer.g:4753:1: ( ( ':' ) )
            // InternalActivityexplorer.g:4754:1: ( ':' )
            {
            // InternalActivityexplorer.g:4754:1: ( ':' )
            // InternalActivityexplorer.g:4755:1: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOverviewAccess().getColonKeyword_4_1()); 
            }
            match(input,25,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOverviewAccess().getColonKeyword_4_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Overview__Group_4__1__Impl"


    // $ANTLR start "rule__Overview__Group_4__2"
    // InternalActivityexplorer.g:4768:1: rule__Overview__Group_4__2 : rule__Overview__Group_4__2__Impl ;
    public final void rule__Overview__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActivityexplorer.g:4772:1: ( rule__Overview__Group_4__2__Impl )
            // InternalActivityexplorer.g:4773:2: rule__Overview__Group_4__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Overview__Group_4__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Overview__Group_4__2"


    // $ANTLR start "rule__Overview__Group_4__2__Impl"
    // InternalActivityexplorer.g:4779:1: rule__Overview__Group_4__2__Impl : ( ( rule__Overview__ImagePathOnAssignment_4_2 ) ) ;
    public final void rule__Overview__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActivityexplorer.g:4783:1: ( ( ( rule__Overview__ImagePathOnAssignment_4_2 ) ) )
            // InternalActivityexplorer.g:4784:1: ( ( rule__Overview__ImagePathOnAssignment_4_2 ) )
            {
            // InternalActivityexplorer.g:4784:1: ( ( rule__Overview__ImagePathOnAssignment_4_2 ) )
            // InternalActivityexplorer.g:4785:1: ( rule__Overview__ImagePathOnAssignment_4_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOverviewAccess().getImagePathOnAssignment_4_2()); 
            }
            // InternalActivityexplorer.g:4786:1: ( rule__Overview__ImagePathOnAssignment_4_2 )
            // InternalActivityexplorer.g:4786:2: rule__Overview__ImagePathOnAssignment_4_2
            {
            pushFollow(FOLLOW_2);
            rule__Overview__ImagePathOnAssignment_4_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOverviewAccess().getImagePathOnAssignment_4_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Overview__Group_4__2__Impl"


    // $ANTLR start "rule__Overview__Group_5__0"
    // InternalActivityexplorer.g:4802:1: rule__Overview__Group_5__0 : rule__Overview__Group_5__0__Impl rule__Overview__Group_5__1 ;
    public final void rule__Overview__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActivityexplorer.g:4806:1: ( rule__Overview__Group_5__0__Impl rule__Overview__Group_5__1 )
            // InternalActivityexplorer.g:4807:2: rule__Overview__Group_5__0__Impl rule__Overview__Group_5__1
            {
            pushFollow(FOLLOW_17);
            rule__Overview__Group_5__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Overview__Group_5__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Overview__Group_5__0"


    // $ANTLR start "rule__Overview__Group_5__0__Impl"
    // InternalActivityexplorer.g:4814:1: rule__Overview__Group_5__0__Impl : ( 'image-off' ) ;
    public final void rule__Overview__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActivityexplorer.g:4818:1: ( ( 'image-off' ) )
            // InternalActivityexplorer.g:4819:1: ( 'image-off' )
            {
            // InternalActivityexplorer.g:4819:1: ( 'image-off' )
            // InternalActivityexplorer.g:4820:1: 'image-off'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOverviewAccess().getImageOffKeyword_5_0()); 
            }
            match(input,26,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOverviewAccess().getImageOffKeyword_5_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Overview__Group_5__0__Impl"


    // $ANTLR start "rule__Overview__Group_5__1"
    // InternalActivityexplorer.g:4833:1: rule__Overview__Group_5__1 : rule__Overview__Group_5__1__Impl rule__Overview__Group_5__2 ;
    public final void rule__Overview__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActivityexplorer.g:4837:1: ( rule__Overview__Group_5__1__Impl rule__Overview__Group_5__2 )
            // InternalActivityexplorer.g:4838:2: rule__Overview__Group_5__1__Impl rule__Overview__Group_5__2
            {
            pushFollow(FOLLOW_15);
            rule__Overview__Group_5__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Overview__Group_5__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Overview__Group_5__1"


    // $ANTLR start "rule__Overview__Group_5__1__Impl"
    // InternalActivityexplorer.g:4845:1: rule__Overview__Group_5__1__Impl : ( ':' ) ;
    public final void rule__Overview__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActivityexplorer.g:4849:1: ( ( ':' ) )
            // InternalActivityexplorer.g:4850:1: ( ':' )
            {
            // InternalActivityexplorer.g:4850:1: ( ':' )
            // InternalActivityexplorer.g:4851:1: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOverviewAccess().getColonKeyword_5_1()); 
            }
            match(input,25,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOverviewAccess().getColonKeyword_5_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Overview__Group_5__1__Impl"


    // $ANTLR start "rule__Overview__Group_5__2"
    // InternalActivityexplorer.g:4864:1: rule__Overview__Group_5__2 : rule__Overview__Group_5__2__Impl ;
    public final void rule__Overview__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActivityexplorer.g:4868:1: ( rule__Overview__Group_5__2__Impl )
            // InternalActivityexplorer.g:4869:2: rule__Overview__Group_5__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Overview__Group_5__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Overview__Group_5__2"


    // $ANTLR start "rule__Overview__Group_5__2__Impl"
    // InternalActivityexplorer.g:4875:1: rule__Overview__Group_5__2__Impl : ( ( rule__Overview__ImagePathOffAssignment_5_2 ) ) ;
    public final void rule__Overview__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActivityexplorer.g:4879:1: ( ( ( rule__Overview__ImagePathOffAssignment_5_2 ) ) )
            // InternalActivityexplorer.g:4880:1: ( ( rule__Overview__ImagePathOffAssignment_5_2 ) )
            {
            // InternalActivityexplorer.g:4880:1: ( ( rule__Overview__ImagePathOffAssignment_5_2 ) )
            // InternalActivityexplorer.g:4881:1: ( rule__Overview__ImagePathOffAssignment_5_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOverviewAccess().getImagePathOffAssignment_5_2()); 
            }
            // InternalActivityexplorer.g:4882:1: ( rule__Overview__ImagePathOffAssignment_5_2 )
            // InternalActivityexplorer.g:4882:2: rule__Overview__ImagePathOffAssignment_5_2
            {
            pushFollow(FOLLOW_2);
            rule__Overview__ImagePathOffAssignment_5_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOverviewAccess().getImagePathOffAssignment_5_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Overview__Group_5__2__Impl"


    // $ANTLR start "rule__FQN__Group__0"
    // InternalActivityexplorer.g:4898:1: rule__FQN__Group__0 : rule__FQN__Group__0__Impl rule__FQN__Group__1 ;
    public final void rule__FQN__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActivityexplorer.g:4902:1: ( rule__FQN__Group__0__Impl rule__FQN__Group__1 )
            // InternalActivityexplorer.g:4903:2: rule__FQN__Group__0__Impl rule__FQN__Group__1
            {
            pushFollow(FOLLOW_34);
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
    // InternalActivityexplorer.g:4910:1: rule__FQN__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__FQN__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActivityexplorer.g:4914:1: ( ( RULE_ID ) )
            // InternalActivityexplorer.g:4915:1: ( RULE_ID )
            {
            // InternalActivityexplorer.g:4915:1: ( RULE_ID )
            // InternalActivityexplorer.g:4916:1: RULE_ID
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
    // InternalActivityexplorer.g:4927:1: rule__FQN__Group__1 : rule__FQN__Group__1__Impl ;
    public final void rule__FQN__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActivityexplorer.g:4931:1: ( rule__FQN__Group__1__Impl )
            // InternalActivityexplorer.g:4932:2: rule__FQN__Group__1__Impl
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
    // InternalActivityexplorer.g:4938:1: rule__FQN__Group__1__Impl : ( ( rule__FQN__Group_1__0 )* ) ;
    public final void rule__FQN__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActivityexplorer.g:4942:1: ( ( ( rule__FQN__Group_1__0 )* ) )
            // InternalActivityexplorer.g:4943:1: ( ( rule__FQN__Group_1__0 )* )
            {
            // InternalActivityexplorer.g:4943:1: ( ( rule__FQN__Group_1__0 )* )
            // InternalActivityexplorer.g:4944:1: ( rule__FQN__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFQNAccess().getGroup_1()); 
            }
            // InternalActivityexplorer.g:4945:1: ( rule__FQN__Group_1__0 )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==42) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // InternalActivityexplorer.g:4945:2: rule__FQN__Group_1__0
            	    {
            	    pushFollow(FOLLOW_35);
            	    rule__FQN__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop36;
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
    // InternalActivityexplorer.g:4959:1: rule__FQN__Group_1__0 : rule__FQN__Group_1__0__Impl rule__FQN__Group_1__1 ;
    public final void rule__FQN__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActivityexplorer.g:4963:1: ( rule__FQN__Group_1__0__Impl rule__FQN__Group_1__1 )
            // InternalActivityexplorer.g:4964:2: rule__FQN__Group_1__0__Impl rule__FQN__Group_1__1
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
    // InternalActivityexplorer.g:4971:1: rule__FQN__Group_1__0__Impl : ( '.' ) ;
    public final void rule__FQN__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActivityexplorer.g:4975:1: ( ( '.' ) )
            // InternalActivityexplorer.g:4976:1: ( '.' )
            {
            // InternalActivityexplorer.g:4976:1: ( '.' )
            // InternalActivityexplorer.g:4977:1: '.'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFQNAccess().getFullStopKeyword_1_0()); 
            }
            match(input,42,FOLLOW_2); if (state.failed) return ;
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
    // InternalActivityexplorer.g:4990:1: rule__FQN__Group_1__1 : rule__FQN__Group_1__1__Impl ;
    public final void rule__FQN__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActivityexplorer.g:4994:1: ( rule__FQN__Group_1__1__Impl )
            // InternalActivityexplorer.g:4995:2: rule__FQN__Group_1__1__Impl
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
    // InternalActivityexplorer.g:5001:1: rule__FQN__Group_1__1__Impl : ( ( RULE_ID ) ) ;
    public final void rule__FQN__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActivityexplorer.g:5005:1: ( ( ( RULE_ID ) ) )
            // InternalActivityexplorer.g:5006:1: ( ( RULE_ID ) )
            {
            // InternalActivityexplorer.g:5006:1: ( ( RULE_ID ) )
            // InternalActivityexplorer.g:5007:1: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFQNAccess().getIDTerminalRuleCall_1_1()); 
            }
            // InternalActivityexplorer.g:5008:1: ( RULE_ID )
            // InternalActivityexplorer.g:5008:3: RULE_ID
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


    // $ANTLR start "rule__ViewpointActivityExplorer__NameAssignment_2"
    // InternalActivityexplorer.g:5023:1: rule__ViewpointActivityExplorer__NameAssignment_2 : ( ruleFQN ) ;
    public final void rule__ViewpointActivityExplorer__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActivityexplorer.g:5027:1: ( ( ruleFQN ) )
            // InternalActivityexplorer.g:5028:1: ( ruleFQN )
            {
            // InternalActivityexplorer.g:5028:1: ( ruleFQN )
            // InternalActivityexplorer.g:5029:1: ruleFQN
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getViewpointActivityExplorerAccess().getNameFQNParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleFQN();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getViewpointActivityExplorerAccess().getNameFQNParserRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ViewpointActivityExplorer__NameAssignment_2"


    // $ANTLR start "rule__ViewpointActivityExplorer__OwnedPagesAssignment_4_2"
    // InternalActivityexplorer.g:5038:1: rule__ViewpointActivityExplorer__OwnedPagesAssignment_4_2 : ( rulePage ) ;
    public final void rule__ViewpointActivityExplorer__OwnedPagesAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActivityexplorer.g:5042:1: ( ( rulePage ) )
            // InternalActivityexplorer.g:5043:1: ( rulePage )
            {
            // InternalActivityexplorer.g:5043:1: ( rulePage )
            // InternalActivityexplorer.g:5044:1: rulePage
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getViewpointActivityExplorerAccess().getOwnedPagesPageParserRuleCall_4_2_0()); 
            }
            pushFollow(FOLLOW_2);
            rulePage();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getViewpointActivityExplorerAccess().getOwnedPagesPageParserRuleCall_4_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ViewpointActivityExplorer__OwnedPagesAssignment_4_2"


    // $ANTLR start "rule__ViewpointActivityExplorer__OwnedPagesAssignment_5"
    // InternalActivityexplorer.g:5053:1: rule__ViewpointActivityExplorer__OwnedPagesAssignment_5 : ( rulePageExtension ) ;
    public final void rule__ViewpointActivityExplorer__OwnedPagesAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActivityexplorer.g:5057:1: ( ( rulePageExtension ) )
            // InternalActivityexplorer.g:5058:1: ( rulePageExtension )
            {
            // InternalActivityexplorer.g:5058:1: ( rulePageExtension )
            // InternalActivityexplorer.g:5059:1: rulePageExtension
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getViewpointActivityExplorerAccess().getOwnedPagesPageExtensionParserRuleCall_5_0()); 
            }
            pushFollow(FOLLOW_2);
            rulePageExtension();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getViewpointActivityExplorerAccess().getOwnedPagesPageExtensionParserRuleCall_5_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ViewpointActivityExplorer__OwnedPagesAssignment_5"


    // $ANTLR start "rule__ViewpointActivityExplorer__OwnedSectionExtensionsAssignment_6"
    // InternalActivityexplorer.g:5068:1: rule__ViewpointActivityExplorer__OwnedSectionExtensionsAssignment_6 : ( ruleSectionExtension ) ;
    public final void rule__ViewpointActivityExplorer__OwnedSectionExtensionsAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActivityexplorer.g:5072:1: ( ( ruleSectionExtension ) )
            // InternalActivityexplorer.g:5073:1: ( ruleSectionExtension )
            {
            // InternalActivityexplorer.g:5073:1: ( ruleSectionExtension )
            // InternalActivityexplorer.g:5074:1: ruleSectionExtension
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getViewpointActivityExplorerAccess().getOwnedSectionExtensionsSectionExtensionParserRuleCall_6_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleSectionExtension();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getViewpointActivityExplorerAccess().getOwnedSectionExtensionsSectionExtensionParserRuleCall_6_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ViewpointActivityExplorer__OwnedSectionExtensionsAssignment_6"


    // $ANTLR start "rule__Page__NameAssignment_2"
    // InternalActivityexplorer.g:5083:1: rule__Page__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Page__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActivityexplorer.g:5087:1: ( ( RULE_ID ) )
            // InternalActivityexplorer.g:5088:1: ( RULE_ID )
            {
            // InternalActivityexplorer.g:5088:1: ( RULE_ID )
            // InternalActivityexplorer.g:5089:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPageAccess().getNameIDTerminalRuleCall_2_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPageAccess().getNameIDTerminalRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__NameAssignment_2"


    // $ANTLR start "rule__Page__DescriptionAssignment_4_1"
    // InternalActivityexplorer.g:5098:1: rule__Page__DescriptionAssignment_4_1 : ( RULE_STRING ) ;
    public final void rule__Page__DescriptionAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActivityexplorer.g:5102:1: ( ( RULE_STRING ) )
            // InternalActivityexplorer.g:5103:1: ( RULE_STRING )
            {
            // InternalActivityexplorer.g:5103:1: ( RULE_STRING )
            // InternalActivityexplorer.g:5104:1: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPageAccess().getDescriptionSTRINGTerminalRuleCall_4_1_0()); 
            }
            match(input,RULE_STRING,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPageAccess().getDescriptionSTRINGTerminalRuleCall_4_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__DescriptionAssignment_4_1"


    // $ANTLR start "rule__Page__FileExtensionsAssignment_5_1"
    // InternalActivityexplorer.g:5113:1: rule__Page__FileExtensionsAssignment_5_1 : ( RULE_STRING ) ;
    public final void rule__Page__FileExtensionsAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActivityexplorer.g:5117:1: ( ( RULE_STRING ) )
            // InternalActivityexplorer.g:5118:1: ( RULE_STRING )
            {
            // InternalActivityexplorer.g:5118:1: ( RULE_STRING )
            // InternalActivityexplorer.g:5119:1: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPageAccess().getFileExtensionsSTRINGTerminalRuleCall_5_1_0()); 
            }
            match(input,RULE_STRING,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPageAccess().getFileExtensionsSTRINGTerminalRuleCall_5_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__FileExtensionsAssignment_5_1"


    // $ANTLR start "rule__Page__ActivityExplorerItemIDAssignment_6_1"
    // InternalActivityexplorer.g:5128:1: rule__Page__ActivityExplorerItemIDAssignment_6_1 : ( ruleFQN ) ;
    public final void rule__Page__ActivityExplorerItemIDAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActivityexplorer.g:5132:1: ( ( ruleFQN ) )
            // InternalActivityexplorer.g:5133:1: ( ruleFQN )
            {
            // InternalActivityexplorer.g:5133:1: ( ruleFQN )
            // InternalActivityexplorer.g:5134:1: ruleFQN
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPageAccess().getActivityExplorerItemIDFQNParserRuleCall_6_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleFQN();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPageAccess().getActivityExplorerItemIDFQNParserRuleCall_6_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__ActivityExplorerItemIDAssignment_6_1"


    // $ANTLR start "rule__Page__LabelAssignment_7_1"
    // InternalActivityexplorer.g:5143:1: rule__Page__LabelAssignment_7_1 : ( RULE_STRING ) ;
    public final void rule__Page__LabelAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActivityexplorer.g:5147:1: ( ( RULE_STRING ) )
            // InternalActivityexplorer.g:5148:1: ( RULE_STRING )
            {
            // InternalActivityexplorer.g:5148:1: ( RULE_STRING )
            // InternalActivityexplorer.g:5149:1: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPageAccess().getLabelSTRINGTerminalRuleCall_7_1_0()); 
            }
            match(input,RULE_STRING,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPageAccess().getLabelSTRINGTerminalRuleCall_7_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__LabelAssignment_7_1"


    // $ANTLR start "rule__Page__IndexAssignment_9"
    // InternalActivityexplorer.g:5158:1: rule__Page__IndexAssignment_9 : ( ruleEInt ) ;
    public final void rule__Page__IndexAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActivityexplorer.g:5162:1: ( ( ruleEInt ) )
            // InternalActivityexplorer.g:5163:1: ( ruleEInt )
            {
            // InternalActivityexplorer.g:5163:1: ( ruleEInt )
            // InternalActivityexplorer.g:5164:1: ruleEInt
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPageAccess().getIndexEIntParserRuleCall_9_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPageAccess().getIndexEIntParserRuleCall_9_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__IndexAssignment_9"


    // $ANTLR start "rule__Page__OwnedOverviewAssignment_10"
    // InternalActivityexplorer.g:5173:1: rule__Page__OwnedOverviewAssignment_10 : ( ruleOverview ) ;
    public final void rule__Page__OwnedOverviewAssignment_10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActivityexplorer.g:5177:1: ( ( ruleOverview ) )
            // InternalActivityexplorer.g:5178:1: ( ruleOverview )
            {
            // InternalActivityexplorer.g:5178:1: ( ruleOverview )
            // InternalActivityexplorer.g:5179:1: ruleOverview
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPageAccess().getOwnedOverviewOverviewParserRuleCall_10_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleOverview();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPageAccess().getOwnedOverviewOverviewParserRuleCall_10_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__OwnedOverviewAssignment_10"


    // $ANTLR start "rule__Page__ImagePathOnAssignment_11_2_2"
    // InternalActivityexplorer.g:5188:1: rule__Page__ImagePathOnAssignment_11_2_2 : ( RULE_STRING ) ;
    public final void rule__Page__ImagePathOnAssignment_11_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActivityexplorer.g:5192:1: ( ( RULE_STRING ) )
            // InternalActivityexplorer.g:5193:1: ( RULE_STRING )
            {
            // InternalActivityexplorer.g:5193:1: ( RULE_STRING )
            // InternalActivityexplorer.g:5194:1: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPageAccess().getImagePathOnSTRINGTerminalRuleCall_11_2_2_0()); 
            }
            match(input,RULE_STRING,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPageAccess().getImagePathOnSTRINGTerminalRuleCall_11_2_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__ImagePathOnAssignment_11_2_2"


    // $ANTLR start "rule__Page__ImagePathOffAssignment_11_3_2"
    // InternalActivityexplorer.g:5203:1: rule__Page__ImagePathOffAssignment_11_3_2 : ( RULE_STRING ) ;
    public final void rule__Page__ImagePathOffAssignment_11_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActivityexplorer.g:5207:1: ( ( RULE_STRING ) )
            // InternalActivityexplorer.g:5208:1: ( RULE_STRING )
            {
            // InternalActivityexplorer.g:5208:1: ( RULE_STRING )
            // InternalActivityexplorer.g:5209:1: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPageAccess().getImagePathOffSTRINGTerminalRuleCall_11_3_2_0()); 
            }
            match(input,RULE_STRING,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPageAccess().getImagePathOffSTRINGTerminalRuleCall_11_3_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__ImagePathOffAssignment_11_3_2"


    // $ANTLR start "rule__Page__TabNameAssignment_12_1"
    // InternalActivityexplorer.g:5218:1: rule__Page__TabNameAssignment_12_1 : ( RULE_STRING ) ;
    public final void rule__Page__TabNameAssignment_12_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActivityexplorer.g:5222:1: ( ( RULE_STRING ) )
            // InternalActivityexplorer.g:5223:1: ( RULE_STRING )
            {
            // InternalActivityexplorer.g:5223:1: ( RULE_STRING )
            // InternalActivityexplorer.g:5224:1: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPageAccess().getTabNameSTRINGTerminalRuleCall_12_1_0()); 
            }
            match(input,RULE_STRING,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPageAccess().getTabNameSTRINGTerminalRuleCall_12_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__TabNameAssignment_12_1"


    // $ANTLR start "rule__Page__HasPredicateAssignment_13_2"
    // InternalActivityexplorer.g:5233:1: rule__Page__HasPredicateAssignment_13_2 : ( ruleEBoolean ) ;
    public final void rule__Page__HasPredicateAssignment_13_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActivityexplorer.g:5237:1: ( ( ruleEBoolean ) )
            // InternalActivityexplorer.g:5238:1: ( ruleEBoolean )
            {
            // InternalActivityexplorer.g:5238:1: ( ruleEBoolean )
            // InternalActivityexplorer.g:5239:1: ruleEBoolean
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPageAccess().getHasPredicateEBooleanParserRuleCall_13_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleEBoolean();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPageAccess().getHasPredicateEBooleanParserRuleCall_13_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__HasPredicateAssignment_13_2"


    // $ANTLR start "rule__Page__ShowViewerAssignment_14_2"
    // InternalActivityexplorer.g:5248:1: rule__Page__ShowViewerAssignment_14_2 : ( ruleEBoolean ) ;
    public final void rule__Page__ShowViewerAssignment_14_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActivityexplorer.g:5252:1: ( ( ruleEBoolean ) )
            // InternalActivityexplorer.g:5253:1: ( ruleEBoolean )
            {
            // InternalActivityexplorer.g:5253:1: ( ruleEBoolean )
            // InternalActivityexplorer.g:5254:1: ruleEBoolean
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPageAccess().getShowViewerEBooleanParserRuleCall_14_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleEBoolean();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPageAccess().getShowViewerEBooleanParserRuleCall_14_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__ShowViewerAssignment_14_2"


    // $ANTLR start "rule__Page__OwnedSectionsAssignment_15_2"
    // InternalActivityexplorer.g:5263:1: rule__Page__OwnedSectionsAssignment_15_2 : ( ruleSection ) ;
    public final void rule__Page__OwnedSectionsAssignment_15_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActivityexplorer.g:5267:1: ( ( ruleSection ) )
            // InternalActivityexplorer.g:5268:1: ( ruleSection )
            {
            // InternalActivityexplorer.g:5268:1: ( ruleSection )
            // InternalActivityexplorer.g:5269:1: ruleSection
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPageAccess().getOwnedSectionsSectionParserRuleCall_15_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleSection();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPageAccess().getOwnedSectionsSectionParserRuleCall_15_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__OwnedSectionsAssignment_15_2"


    // $ANTLR start "rule__Section__NameAssignment_2"
    // InternalActivityexplorer.g:5278:1: rule__Section__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Section__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActivityexplorer.g:5282:1: ( ( RULE_ID ) )
            // InternalActivityexplorer.g:5283:1: ( RULE_ID )
            {
            // InternalActivityexplorer.g:5283:1: ( RULE_ID )
            // InternalActivityexplorer.g:5284:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSectionAccess().getNameIDTerminalRuleCall_2_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSectionAccess().getNameIDTerminalRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Section__NameAssignment_2"


    // $ANTLR start "rule__Section__DescriptionAssignment_4_1"
    // InternalActivityexplorer.g:5293:1: rule__Section__DescriptionAssignment_4_1 : ( RULE_STRING ) ;
    public final void rule__Section__DescriptionAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActivityexplorer.g:5297:1: ( ( RULE_STRING ) )
            // InternalActivityexplorer.g:5298:1: ( RULE_STRING )
            {
            // InternalActivityexplorer.g:5298:1: ( RULE_STRING )
            // InternalActivityexplorer.g:5299:1: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSectionAccess().getDescriptionSTRINGTerminalRuleCall_4_1_0()); 
            }
            match(input,RULE_STRING,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSectionAccess().getDescriptionSTRINGTerminalRuleCall_4_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Section__DescriptionAssignment_4_1"


    // $ANTLR start "rule__Section__ActivityExplorerItemIDAssignment_5_1"
    // InternalActivityexplorer.g:5308:1: rule__Section__ActivityExplorerItemIDAssignment_5_1 : ( ruleFQN ) ;
    public final void rule__Section__ActivityExplorerItemIDAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActivityexplorer.g:5312:1: ( ( ruleFQN ) )
            // InternalActivityexplorer.g:5313:1: ( ruleFQN )
            {
            // InternalActivityexplorer.g:5313:1: ( ruleFQN )
            // InternalActivityexplorer.g:5314:1: ruleFQN
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSectionAccess().getActivityExplorerItemIDFQNParserRuleCall_5_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleFQN();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSectionAccess().getActivityExplorerItemIDFQNParserRuleCall_5_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Section__ActivityExplorerItemIDAssignment_5_1"


    // $ANTLR start "rule__Section__LabelAssignment_6_1"
    // InternalActivityexplorer.g:5323:1: rule__Section__LabelAssignment_6_1 : ( RULE_STRING ) ;
    public final void rule__Section__LabelAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActivityexplorer.g:5327:1: ( ( RULE_STRING ) )
            // InternalActivityexplorer.g:5328:1: ( RULE_STRING )
            {
            // InternalActivityexplorer.g:5328:1: ( RULE_STRING )
            // InternalActivityexplorer.g:5329:1: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSectionAccess().getLabelSTRINGTerminalRuleCall_6_1_0()); 
            }
            match(input,RULE_STRING,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSectionAccess().getLabelSTRINGTerminalRuleCall_6_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Section__LabelAssignment_6_1"


    // $ANTLR start "rule__Section__IndexAssignment_8"
    // InternalActivityexplorer.g:5338:1: rule__Section__IndexAssignment_8 : ( ruleEInt ) ;
    public final void rule__Section__IndexAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActivityexplorer.g:5342:1: ( ( ruleEInt ) )
            // InternalActivityexplorer.g:5343:1: ( ruleEInt )
            {
            // InternalActivityexplorer.g:5343:1: ( ruleEInt )
            // InternalActivityexplorer.g:5344:1: ruleEInt
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSectionAccess().getIndexEIntParserRuleCall_8_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSectionAccess().getIndexEIntParserRuleCall_8_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Section__IndexAssignment_8"


    // $ANTLR start "rule__Section__FilteringAssignment_9_2"
    // InternalActivityexplorer.g:5353:1: rule__Section__FilteringAssignment_9_2 : ( ruleEBoolean ) ;
    public final void rule__Section__FilteringAssignment_9_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActivityexplorer.g:5357:1: ( ( ruleEBoolean ) )
            // InternalActivityexplorer.g:5358:1: ( ruleEBoolean )
            {
            // InternalActivityexplorer.g:5358:1: ( ruleEBoolean )
            // InternalActivityexplorer.g:5359:1: ruleEBoolean
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSectionAccess().getFilteringEBooleanParserRuleCall_9_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleEBoolean();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSectionAccess().getFilteringEBooleanParserRuleCall_9_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Section__FilteringAssignment_9_2"


    // $ANTLR start "rule__Section__ExpandedAssignment_10_2"
    // InternalActivityexplorer.g:5368:1: rule__Section__ExpandedAssignment_10_2 : ( ruleEBoolean ) ;
    public final void rule__Section__ExpandedAssignment_10_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActivityexplorer.g:5372:1: ( ( ruleEBoolean ) )
            // InternalActivityexplorer.g:5373:1: ( ruleEBoolean )
            {
            // InternalActivityexplorer.g:5373:1: ( ruleEBoolean )
            // InternalActivityexplorer.g:5374:1: ruleEBoolean
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSectionAccess().getExpandedEBooleanParserRuleCall_10_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleEBoolean();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSectionAccess().getExpandedEBooleanParserRuleCall_10_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Section__ExpandedAssignment_10_2"


    // $ANTLR start "rule__Section__OwnedActivitiesAssignment_11_2"
    // InternalActivityexplorer.g:5383:1: rule__Section__OwnedActivitiesAssignment_11_2 : ( ruleActivity ) ;
    public final void rule__Section__OwnedActivitiesAssignment_11_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActivityexplorer.g:5387:1: ( ( ruleActivity ) )
            // InternalActivityexplorer.g:5388:1: ( ruleActivity )
            {
            // InternalActivityexplorer.g:5388:1: ( ruleActivity )
            // InternalActivityexplorer.g:5389:1: ruleActivity
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSectionAccess().getOwnedActivitiesActivityParserRuleCall_11_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleActivity();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSectionAccess().getOwnedActivitiesActivityParserRuleCall_11_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Section__OwnedActivitiesAssignment_11_2"


    // $ANTLR start "rule__Activity__NameAssignment_2"
    // InternalActivityexplorer.g:5398:1: rule__Activity__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Activity__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActivityexplorer.g:5402:1: ( ( RULE_ID ) )
            // InternalActivityexplorer.g:5403:1: ( RULE_ID )
            {
            // InternalActivityexplorer.g:5403:1: ( RULE_ID )
            // InternalActivityexplorer.g:5404:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getActivityAccess().getNameIDTerminalRuleCall_2_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getActivityAccess().getNameIDTerminalRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__NameAssignment_2"


    // $ANTLR start "rule__Activity__DescriptionAssignment_4_1"
    // InternalActivityexplorer.g:5413:1: rule__Activity__DescriptionAssignment_4_1 : ( RULE_STRING ) ;
    public final void rule__Activity__DescriptionAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActivityexplorer.g:5417:1: ( ( RULE_STRING ) )
            // InternalActivityexplorer.g:5418:1: ( RULE_STRING )
            {
            // InternalActivityexplorer.g:5418:1: ( RULE_STRING )
            // InternalActivityexplorer.g:5419:1: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getActivityAccess().getDescriptionSTRINGTerminalRuleCall_4_1_0()); 
            }
            match(input,RULE_STRING,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getActivityAccess().getDescriptionSTRINGTerminalRuleCall_4_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__DescriptionAssignment_4_1"


    // $ANTLR start "rule__Activity__ActivityExplorerItemIDAssignment_5_1"
    // InternalActivityexplorer.g:5428:1: rule__Activity__ActivityExplorerItemIDAssignment_5_1 : ( ruleFQN ) ;
    public final void rule__Activity__ActivityExplorerItemIDAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActivityexplorer.g:5432:1: ( ( ruleFQN ) )
            // InternalActivityexplorer.g:5433:1: ( ruleFQN )
            {
            // InternalActivityexplorer.g:5433:1: ( ruleFQN )
            // InternalActivityexplorer.g:5434:1: ruleFQN
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getActivityAccess().getActivityExplorerItemIDFQNParserRuleCall_5_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleFQN();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getActivityAccess().getActivityExplorerItemIDFQNParserRuleCall_5_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__ActivityExplorerItemIDAssignment_5_1"


    // $ANTLR start "rule__Activity__LabelAssignment_6_1"
    // InternalActivityexplorer.g:5443:1: rule__Activity__LabelAssignment_6_1 : ( RULE_STRING ) ;
    public final void rule__Activity__LabelAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActivityexplorer.g:5447:1: ( ( RULE_STRING ) )
            // InternalActivityexplorer.g:5448:1: ( RULE_STRING )
            {
            // InternalActivityexplorer.g:5448:1: ( RULE_STRING )
            // InternalActivityexplorer.g:5449:1: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getActivityAccess().getLabelSTRINGTerminalRuleCall_6_1_0()); 
            }
            match(input,RULE_STRING,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getActivityAccess().getLabelSTRINGTerminalRuleCall_6_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__LabelAssignment_6_1"


    // $ANTLR start "rule__Activity__IndexAssignment_8"
    // InternalActivityexplorer.g:5458:1: rule__Activity__IndexAssignment_8 : ( ruleEInt ) ;
    public final void rule__Activity__IndexAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActivityexplorer.g:5462:1: ( ( ruleEInt ) )
            // InternalActivityexplorer.g:5463:1: ( ruleEInt )
            {
            // InternalActivityexplorer.g:5463:1: ( ruleEInt )
            // InternalActivityexplorer.g:5464:1: ruleEInt
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getActivityAccess().getIndexEIntParserRuleCall_8_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getActivityAccess().getIndexEIntParserRuleCall_8_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__IndexAssignment_8"


    // $ANTLR start "rule__Activity__HasPredicateAssignment_9_2"
    // InternalActivityexplorer.g:5473:1: rule__Activity__HasPredicateAssignment_9_2 : ( ruleEBoolean ) ;
    public final void rule__Activity__HasPredicateAssignment_9_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActivityexplorer.g:5477:1: ( ( ruleEBoolean ) )
            // InternalActivityexplorer.g:5478:1: ( ruleEBoolean )
            {
            // InternalActivityexplorer.g:5478:1: ( ruleEBoolean )
            // InternalActivityexplorer.g:5479:1: ruleEBoolean
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getActivityAccess().getHasPredicateEBooleanParserRuleCall_9_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleEBoolean();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getActivityAccess().getHasPredicateEBooleanParserRuleCall_9_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__HasPredicateAssignment_9_2"


    // $ANTLR start "rule__Activity__ImagePathOffAssignment_10_2"
    // InternalActivityexplorer.g:5488:1: rule__Activity__ImagePathOffAssignment_10_2 : ( RULE_STRING ) ;
    public final void rule__Activity__ImagePathOffAssignment_10_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActivityexplorer.g:5492:1: ( ( RULE_STRING ) )
            // InternalActivityexplorer.g:5493:1: ( RULE_STRING )
            {
            // InternalActivityexplorer.g:5493:1: ( RULE_STRING )
            // InternalActivityexplorer.g:5494:1: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getActivityAccess().getImagePathOffSTRINGTerminalRuleCall_10_2_0()); 
            }
            match(input,RULE_STRING,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getActivityAccess().getImagePathOffSTRINGTerminalRuleCall_10_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__ImagePathOffAssignment_10_2"


    // $ANTLR start "rule__PageExtension__ExtendedPageIDAssignment_4"
    // InternalActivityexplorer.g:5503:1: rule__PageExtension__ExtendedPageIDAssignment_4 : ( ruleFQN ) ;
    public final void rule__PageExtension__ExtendedPageIDAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActivityexplorer.g:5507:1: ( ( ruleFQN ) )
            // InternalActivityexplorer.g:5508:1: ( ruleFQN )
            {
            // InternalActivityexplorer.g:5508:1: ( ruleFQN )
            // InternalActivityexplorer.g:5509:1: ruleFQN
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPageExtensionAccess().getExtendedPageIDFQNParserRuleCall_4_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleFQN();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPageExtensionAccess().getExtendedPageIDFQNParserRuleCall_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PageExtension__ExtendedPageIDAssignment_4"


    // $ANTLR start "rule__PageExtension__OwnedSectionsAssignment_5"
    // InternalActivityexplorer.g:5518:1: rule__PageExtension__OwnedSectionsAssignment_5 : ( ruleSection ) ;
    public final void rule__PageExtension__OwnedSectionsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActivityexplorer.g:5522:1: ( ( ruleSection ) )
            // InternalActivityexplorer.g:5523:1: ( ruleSection )
            {
            // InternalActivityexplorer.g:5523:1: ( ruleSection )
            // InternalActivityexplorer.g:5524:1: ruleSection
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPageExtensionAccess().getOwnedSectionsSectionParserRuleCall_5_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleSection();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPageExtensionAccess().getOwnedSectionsSectionParserRuleCall_5_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PageExtension__OwnedSectionsAssignment_5"


    // $ANTLR start "rule__SectionExtension__ExtendedSectionIDAssignment_4"
    // InternalActivityexplorer.g:5533:1: rule__SectionExtension__ExtendedSectionIDAssignment_4 : ( ruleFQN ) ;
    public final void rule__SectionExtension__ExtendedSectionIDAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActivityexplorer.g:5537:1: ( ( ruleFQN ) )
            // InternalActivityexplorer.g:5538:1: ( ruleFQN )
            {
            // InternalActivityexplorer.g:5538:1: ( ruleFQN )
            // InternalActivityexplorer.g:5539:1: ruleFQN
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSectionExtensionAccess().getExtendedSectionIDFQNParserRuleCall_4_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleFQN();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSectionExtensionAccess().getExtendedSectionIDFQNParserRuleCall_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SectionExtension__ExtendedSectionIDAssignment_4"


    // $ANTLR start "rule__SectionExtension__OwnedActivitiesAssignment_5"
    // InternalActivityexplorer.g:5548:1: rule__SectionExtension__OwnedActivitiesAssignment_5 : ( ruleActivity ) ;
    public final void rule__SectionExtension__OwnedActivitiesAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActivityexplorer.g:5552:1: ( ( ruleActivity ) )
            // InternalActivityexplorer.g:5553:1: ( ruleActivity )
            {
            // InternalActivityexplorer.g:5553:1: ( ruleActivity )
            // InternalActivityexplorer.g:5554:1: ruleActivity
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSectionExtensionAccess().getOwnedActivitiesActivityParserRuleCall_5_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleActivity();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSectionExtensionAccess().getOwnedActivitiesActivityParserRuleCall_5_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SectionExtension__OwnedActivitiesAssignment_5"


    // $ANTLR start "rule__Overview__DescriptionAssignment_3_1"
    // InternalActivityexplorer.g:5563:1: rule__Overview__DescriptionAssignment_3_1 : ( RULE_STRING ) ;
    public final void rule__Overview__DescriptionAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActivityexplorer.g:5567:1: ( ( RULE_STRING ) )
            // InternalActivityexplorer.g:5568:1: ( RULE_STRING )
            {
            // InternalActivityexplorer.g:5568:1: ( RULE_STRING )
            // InternalActivityexplorer.g:5569:1: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOverviewAccess().getDescriptionSTRINGTerminalRuleCall_3_1_0()); 
            }
            match(input,RULE_STRING,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOverviewAccess().getDescriptionSTRINGTerminalRuleCall_3_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Overview__DescriptionAssignment_3_1"


    // $ANTLR start "rule__Overview__ImagePathOnAssignment_4_2"
    // InternalActivityexplorer.g:5578:1: rule__Overview__ImagePathOnAssignment_4_2 : ( RULE_STRING ) ;
    public final void rule__Overview__ImagePathOnAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActivityexplorer.g:5582:1: ( ( RULE_STRING ) )
            // InternalActivityexplorer.g:5583:1: ( RULE_STRING )
            {
            // InternalActivityexplorer.g:5583:1: ( RULE_STRING )
            // InternalActivityexplorer.g:5584:1: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOverviewAccess().getImagePathOnSTRINGTerminalRuleCall_4_2_0()); 
            }
            match(input,RULE_STRING,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOverviewAccess().getImagePathOnSTRINGTerminalRuleCall_4_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Overview__ImagePathOnAssignment_4_2"


    // $ANTLR start "rule__Overview__ImagePathOffAssignment_5_2"
    // InternalActivityexplorer.g:5593:1: rule__Overview__ImagePathOffAssignment_5_2 : ( RULE_STRING ) ;
    public final void rule__Overview__ImagePathOffAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActivityexplorer.g:5597:1: ( ( RULE_STRING ) )
            // InternalActivityexplorer.g:5598:1: ( RULE_STRING )
            {
            // InternalActivityexplorer.g:5598:1: ( RULE_STRING )
            // InternalActivityexplorer.g:5599:1: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOverviewAccess().getImagePathOffSTRINGTerminalRuleCall_5_2_0()); 
            }
            match(input,RULE_STRING,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOverviewAccess().getImagePathOffSTRINGTerminalRuleCall_5_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Overview__ImagePathOffAssignment_5_2"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x000000A000018000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000028000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x00000000007C0000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000020078808000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000005008000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000080008000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x00000000006C0000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000700008000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000800008000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000001010008000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000005088000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000040000000002L});

}
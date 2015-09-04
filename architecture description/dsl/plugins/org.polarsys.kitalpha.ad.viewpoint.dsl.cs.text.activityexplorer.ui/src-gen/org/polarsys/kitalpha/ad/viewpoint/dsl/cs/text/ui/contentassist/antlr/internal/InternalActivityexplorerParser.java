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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'true'", "'false'", "'activity'", "'explorer'", "'{'", "'}'", "'pages'", "'page'", "'index'", "'description'", "'file'", "'extension'", "'id'", "'header'", "'image'", "'on'", "':'", "'off'", "'tab'", "'name'", "'predicated'", "'show'", "'viewer'", "'sections'", "'section'", "'filtering'", "'expanded'", "'activities'", "'icon'", "'extensions'", "'extended'", "'Overview'", "'.'"
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


        public InternalActivityexplorerParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalActivityexplorerParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalActivityexplorerParser.tokenNames; }
    public String getGrammarFileName() { return "../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g"; }


     
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:61:1: entryRuleViewpointActivityExplorer : ruleViewpointActivityExplorer EOF ;
    public final void entryRuleViewpointActivityExplorer() throws RecognitionException {
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:62:1: ( ruleViewpointActivityExplorer EOF )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:63:1: ruleViewpointActivityExplorer EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getViewpointActivityExplorerRule()); 
            }
            pushFollow(FOLLOW_ruleViewpointActivityExplorer_in_entryRuleViewpointActivityExplorer67);
            ruleViewpointActivityExplorer();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getViewpointActivityExplorerRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleViewpointActivityExplorer74); if (state.failed) return ;

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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:70:1: ruleViewpointActivityExplorer : ( ( rule__ViewpointActivityExplorer__Group__0 ) ) ;
    public final void ruleViewpointActivityExplorer() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:74:2: ( ( ( rule__ViewpointActivityExplorer__Group__0 ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:75:1: ( ( rule__ViewpointActivityExplorer__Group__0 ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:75:1: ( ( rule__ViewpointActivityExplorer__Group__0 ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:76:1: ( rule__ViewpointActivityExplorer__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getViewpointActivityExplorerAccess().getGroup()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:77:1: ( rule__ViewpointActivityExplorer__Group__0 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:77:2: rule__ViewpointActivityExplorer__Group__0
            {
            pushFollow(FOLLOW_rule__ViewpointActivityExplorer__Group__0_in_ruleViewpointActivityExplorer100);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:91:1: entryRulePage : rulePage EOF ;
    public final void entryRulePage() throws RecognitionException {
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:92:1: ( rulePage EOF )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:93:1: rulePage EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPageRule()); 
            }
            pushFollow(FOLLOW_rulePage_in_entryRulePage129);
            rulePage();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPageRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePage136); if (state.failed) return ;

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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:100:1: rulePage : ( ( rule__Page__Group__0 ) ) ;
    public final void rulePage() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:104:2: ( ( ( rule__Page__Group__0 ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:105:1: ( ( rule__Page__Group__0 ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:105:1: ( ( rule__Page__Group__0 ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:106:1: ( rule__Page__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPageAccess().getGroup()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:107:1: ( rule__Page__Group__0 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:107:2: rule__Page__Group__0
            {
            pushFollow(FOLLOW_rule__Page__Group__0_in_rulePage162);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:119:1: entryRuleSection : ruleSection EOF ;
    public final void entryRuleSection() throws RecognitionException {
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:120:1: ( ruleSection EOF )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:121:1: ruleSection EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSectionRule()); 
            }
            pushFollow(FOLLOW_ruleSection_in_entryRuleSection189);
            ruleSection();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSectionRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSection196); if (state.failed) return ;

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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:128:1: ruleSection : ( ( rule__Section__Group__0 ) ) ;
    public final void ruleSection() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:132:2: ( ( ( rule__Section__Group__0 ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:133:1: ( ( rule__Section__Group__0 ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:133:1: ( ( rule__Section__Group__0 ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:134:1: ( rule__Section__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSectionAccess().getGroup()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:135:1: ( rule__Section__Group__0 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:135:2: rule__Section__Group__0
            {
            pushFollow(FOLLOW_rule__Section__Group__0_in_ruleSection222);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:147:1: entryRuleActivity : ruleActivity EOF ;
    public final void entryRuleActivity() throws RecognitionException {
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:148:1: ( ruleActivity EOF )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:149:1: ruleActivity EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getActivityRule()); 
            }
            pushFollow(FOLLOW_ruleActivity_in_entryRuleActivity249);
            ruleActivity();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getActivityRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleActivity256); if (state.failed) return ;

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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:156:1: ruleActivity : ( ( rule__Activity__Group__0 ) ) ;
    public final void ruleActivity() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:160:2: ( ( ( rule__Activity__Group__0 ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:161:1: ( ( rule__Activity__Group__0 ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:161:1: ( ( rule__Activity__Group__0 ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:162:1: ( rule__Activity__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getActivityAccess().getGroup()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:163:1: ( rule__Activity__Group__0 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:163:2: rule__Activity__Group__0
            {
            pushFollow(FOLLOW_rule__Activity__Group__0_in_ruleActivity282);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:175:1: entryRulePageExtension : rulePageExtension EOF ;
    public final void entryRulePageExtension() throws RecognitionException {
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:176:1: ( rulePageExtension EOF )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:177:1: rulePageExtension EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPageExtensionRule()); 
            }
            pushFollow(FOLLOW_rulePageExtension_in_entryRulePageExtension309);
            rulePageExtension();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPageExtensionRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePageExtension316); if (state.failed) return ;

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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:184:1: rulePageExtension : ( ( rule__PageExtension__Group__0 ) ) ;
    public final void rulePageExtension() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:188:2: ( ( ( rule__PageExtension__Group__0 ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:189:1: ( ( rule__PageExtension__Group__0 ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:189:1: ( ( rule__PageExtension__Group__0 ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:190:1: ( rule__PageExtension__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPageExtensionAccess().getGroup()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:191:1: ( rule__PageExtension__Group__0 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:191:2: rule__PageExtension__Group__0
            {
            pushFollow(FOLLOW_rule__PageExtension__Group__0_in_rulePageExtension342);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:203:1: entryRuleSectionExtension : ruleSectionExtension EOF ;
    public final void entryRuleSectionExtension() throws RecognitionException {
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:204:1: ( ruleSectionExtension EOF )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:205:1: ruleSectionExtension EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSectionExtensionRule()); 
            }
            pushFollow(FOLLOW_ruleSectionExtension_in_entryRuleSectionExtension369);
            ruleSectionExtension();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSectionExtensionRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSectionExtension376); if (state.failed) return ;

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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:212:1: ruleSectionExtension : ( ( rule__SectionExtension__Group__0 ) ) ;
    public final void ruleSectionExtension() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:216:2: ( ( ( rule__SectionExtension__Group__0 ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:217:1: ( ( rule__SectionExtension__Group__0 ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:217:1: ( ( rule__SectionExtension__Group__0 ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:218:1: ( rule__SectionExtension__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSectionExtensionAccess().getGroup()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:219:1: ( rule__SectionExtension__Group__0 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:219:2: rule__SectionExtension__Group__0
            {
            pushFollow(FOLLOW_rule__SectionExtension__Group__0_in_ruleSectionExtension402);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:231:1: entryRuleOverview : ruleOverview EOF ;
    public final void entryRuleOverview() throws RecognitionException {
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:232:1: ( ruleOverview EOF )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:233:1: ruleOverview EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOverviewRule()); 
            }
            pushFollow(FOLLOW_ruleOverview_in_entryRuleOverview429);
            ruleOverview();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOverviewRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOverview436); if (state.failed) return ;

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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:240:1: ruleOverview : ( ( rule__Overview__Group__0 ) ) ;
    public final void ruleOverview() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:244:2: ( ( ( rule__Overview__Group__0 ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:245:1: ( ( rule__Overview__Group__0 ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:245:1: ( ( rule__Overview__Group__0 ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:246:1: ( rule__Overview__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOverviewAccess().getGroup()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:247:1: ( rule__Overview__Group__0 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:247:2: rule__Overview__Group__0
            {
            pushFollow(FOLLOW_rule__Overview__Group__0_in_ruleOverview462);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:261:1: entryRuleFQN : ruleFQN EOF ;
    public final void entryRuleFQN() throws RecognitionException {
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:262:1: ( ruleFQN EOF )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:263:1: ruleFQN EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFQNRule()); 
            }
            pushFollow(FOLLOW_ruleFQN_in_entryRuleFQN491);
            ruleFQN();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFQNRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFQN498); if (state.failed) return ;

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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:270:1: ruleFQN : ( ( rule__FQN__Group__0 ) ) ;
    public final void ruleFQN() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:274:2: ( ( ( rule__FQN__Group__0 ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:275:1: ( ( rule__FQN__Group__0 ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:275:1: ( ( rule__FQN__Group__0 ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:276:1: ( rule__FQN__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFQNAccess().getGroup()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:277:1: ( rule__FQN__Group__0 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:277:2: rule__FQN__Group__0
            {
            pushFollow(FOLLOW_rule__FQN__Group__0_in_ruleFQN524);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:289:1: entryRuleEBoolean : ruleEBoolean EOF ;
    public final void entryRuleEBoolean() throws RecognitionException {
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:290:1: ( ruleEBoolean EOF )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:291:1: ruleEBoolean EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEBooleanRule()); 
            }
            pushFollow(FOLLOW_ruleEBoolean_in_entryRuleEBoolean551);
            ruleEBoolean();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEBooleanRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEBoolean558); if (state.failed) return ;

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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:298:1: ruleEBoolean : ( ( rule__EBoolean__Alternatives ) ) ;
    public final void ruleEBoolean() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:302:2: ( ( ( rule__EBoolean__Alternatives ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:303:1: ( ( rule__EBoolean__Alternatives ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:303:1: ( ( rule__EBoolean__Alternatives ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:304:1: ( rule__EBoolean__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEBooleanAccess().getAlternatives()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:305:1: ( rule__EBoolean__Alternatives )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:305:2: rule__EBoolean__Alternatives
            {
            pushFollow(FOLLOW_rule__EBoolean__Alternatives_in_ruleEBoolean584);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:317:1: entryRuleEInt : ruleEInt EOF ;
    public final void entryRuleEInt() throws RecognitionException {
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:318:1: ( ruleEInt EOF )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:319:1: ruleEInt EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEIntRule()); 
            }
            pushFollow(FOLLOW_ruleEInt_in_entryRuleEInt611);
            ruleEInt();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEIntRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEInt618); if (state.failed) return ;

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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:326:1: ruleEInt : ( RULE_INT ) ;
    public final void ruleEInt() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:330:2: ( ( RULE_INT ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:331:1: ( RULE_INT )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:331:1: ( RULE_INT )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:332:1: RULE_INT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEIntAccess().getINTTerminalRuleCall()); 
            }
            match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleEInt644); if (state.failed) return ;
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:347:1: rule__EBoolean__Alternatives : ( ( 'true' ) | ( 'false' ) );
    public final void rule__EBoolean__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:351:1: ( ( 'true' ) | ( 'false' ) )
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
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:352:1: ( 'true' )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:352:1: ( 'true' )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:353:1: 'true'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEBooleanAccess().getTrueKeyword_0()); 
                    }
                    match(input,11,FOLLOW_11_in_rule__EBoolean__Alternatives682); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEBooleanAccess().getTrueKeyword_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:360:6: ( 'false' )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:360:6: ( 'false' )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:361:1: 'false'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEBooleanAccess().getFalseKeyword_1()); 
                    }
                    match(input,12,FOLLOW_12_in_rule__EBoolean__Alternatives702); if (state.failed) return ;
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:375:1: rule__ViewpointActivityExplorer__Group__0 : rule__ViewpointActivityExplorer__Group__0__Impl rule__ViewpointActivityExplorer__Group__1 ;
    public final void rule__ViewpointActivityExplorer__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:379:1: ( rule__ViewpointActivityExplorer__Group__0__Impl rule__ViewpointActivityExplorer__Group__1 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:380:2: rule__ViewpointActivityExplorer__Group__0__Impl rule__ViewpointActivityExplorer__Group__1
            {
            pushFollow(FOLLOW_rule__ViewpointActivityExplorer__Group__0__Impl_in_rule__ViewpointActivityExplorer__Group__0734);
            rule__ViewpointActivityExplorer__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ViewpointActivityExplorer__Group__1_in_rule__ViewpointActivityExplorer__Group__0737);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:387:1: rule__ViewpointActivityExplorer__Group__0__Impl : ( () ) ;
    public final void rule__ViewpointActivityExplorer__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:391:1: ( ( () ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:392:1: ( () )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:392:1: ( () )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:393:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getViewpointActivityExplorerAccess().getViewpointActivityExplorerAction_0()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:394:1: ()
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:396:1: 
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:406:1: rule__ViewpointActivityExplorer__Group__1 : rule__ViewpointActivityExplorer__Group__1__Impl rule__ViewpointActivityExplorer__Group__2 ;
    public final void rule__ViewpointActivityExplorer__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:410:1: ( rule__ViewpointActivityExplorer__Group__1__Impl rule__ViewpointActivityExplorer__Group__2 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:411:2: rule__ViewpointActivityExplorer__Group__1__Impl rule__ViewpointActivityExplorer__Group__2
            {
            pushFollow(FOLLOW_rule__ViewpointActivityExplorer__Group__1__Impl_in_rule__ViewpointActivityExplorer__Group__1795);
            rule__ViewpointActivityExplorer__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ViewpointActivityExplorer__Group__2_in_rule__ViewpointActivityExplorer__Group__1798);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:418:1: rule__ViewpointActivityExplorer__Group__1__Impl : ( 'activity' ) ;
    public final void rule__ViewpointActivityExplorer__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:422:1: ( ( 'activity' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:423:1: ( 'activity' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:423:1: ( 'activity' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:424:1: 'activity'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getViewpointActivityExplorerAccess().getActivityKeyword_1()); 
            }
            match(input,13,FOLLOW_13_in_rule__ViewpointActivityExplorer__Group__1__Impl826); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getViewpointActivityExplorerAccess().getActivityKeyword_1()); 
            }

            }


            }

        }
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:437:1: rule__ViewpointActivityExplorer__Group__2 : rule__ViewpointActivityExplorer__Group__2__Impl rule__ViewpointActivityExplorer__Group__3 ;
    public final void rule__ViewpointActivityExplorer__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:441:1: ( rule__ViewpointActivityExplorer__Group__2__Impl rule__ViewpointActivityExplorer__Group__3 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:442:2: rule__ViewpointActivityExplorer__Group__2__Impl rule__ViewpointActivityExplorer__Group__3
            {
            pushFollow(FOLLOW_rule__ViewpointActivityExplorer__Group__2__Impl_in_rule__ViewpointActivityExplorer__Group__2857);
            rule__ViewpointActivityExplorer__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ViewpointActivityExplorer__Group__3_in_rule__ViewpointActivityExplorer__Group__2860);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:449:1: rule__ViewpointActivityExplorer__Group__2__Impl : ( 'explorer' ) ;
    public final void rule__ViewpointActivityExplorer__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:453:1: ( ( 'explorer' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:454:1: ( 'explorer' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:454:1: ( 'explorer' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:455:1: 'explorer'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getViewpointActivityExplorerAccess().getExplorerKeyword_2()); 
            }
            match(input,14,FOLLOW_14_in_rule__ViewpointActivityExplorer__Group__2__Impl888); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getViewpointActivityExplorerAccess().getExplorerKeyword_2()); 
            }

            }


            }

        }
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:468:1: rule__ViewpointActivityExplorer__Group__3 : rule__ViewpointActivityExplorer__Group__3__Impl rule__ViewpointActivityExplorer__Group__4 ;
    public final void rule__ViewpointActivityExplorer__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:472:1: ( rule__ViewpointActivityExplorer__Group__3__Impl rule__ViewpointActivityExplorer__Group__4 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:473:2: rule__ViewpointActivityExplorer__Group__3__Impl rule__ViewpointActivityExplorer__Group__4
            {
            pushFollow(FOLLOW_rule__ViewpointActivityExplorer__Group__3__Impl_in_rule__ViewpointActivityExplorer__Group__3919);
            rule__ViewpointActivityExplorer__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ViewpointActivityExplorer__Group__4_in_rule__ViewpointActivityExplorer__Group__3922);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:480:1: rule__ViewpointActivityExplorer__Group__3__Impl : ( ( rule__ViewpointActivityExplorer__NameAssignment_3 ) ) ;
    public final void rule__ViewpointActivityExplorer__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:484:1: ( ( ( rule__ViewpointActivityExplorer__NameAssignment_3 ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:485:1: ( ( rule__ViewpointActivityExplorer__NameAssignment_3 ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:485:1: ( ( rule__ViewpointActivityExplorer__NameAssignment_3 ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:486:1: ( rule__ViewpointActivityExplorer__NameAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getViewpointActivityExplorerAccess().getNameAssignment_3()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:487:1: ( rule__ViewpointActivityExplorer__NameAssignment_3 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:487:2: rule__ViewpointActivityExplorer__NameAssignment_3
            {
            pushFollow(FOLLOW_rule__ViewpointActivityExplorer__NameAssignment_3_in_rule__ViewpointActivityExplorer__Group__3__Impl949);
            rule__ViewpointActivityExplorer__NameAssignment_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getViewpointActivityExplorerAccess().getNameAssignment_3()); 
            }

            }


            }

        }
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:497:1: rule__ViewpointActivityExplorer__Group__4 : rule__ViewpointActivityExplorer__Group__4__Impl rule__ViewpointActivityExplorer__Group__5 ;
    public final void rule__ViewpointActivityExplorer__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:501:1: ( rule__ViewpointActivityExplorer__Group__4__Impl rule__ViewpointActivityExplorer__Group__5 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:502:2: rule__ViewpointActivityExplorer__Group__4__Impl rule__ViewpointActivityExplorer__Group__5
            {
            pushFollow(FOLLOW_rule__ViewpointActivityExplorer__Group__4__Impl_in_rule__ViewpointActivityExplorer__Group__4979);
            rule__ViewpointActivityExplorer__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ViewpointActivityExplorer__Group__5_in_rule__ViewpointActivityExplorer__Group__4982);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:509:1: rule__ViewpointActivityExplorer__Group__4__Impl : ( '{' ) ;
    public final void rule__ViewpointActivityExplorer__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:513:1: ( ( '{' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:514:1: ( '{' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:514:1: ( '{' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:515:1: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getViewpointActivityExplorerAccess().getLeftCurlyBracketKeyword_4()); 
            }
            match(input,15,FOLLOW_15_in_rule__ViewpointActivityExplorer__Group__4__Impl1010); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getViewpointActivityExplorerAccess().getLeftCurlyBracketKeyword_4()); 
            }

            }


            }

        }
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:528:1: rule__ViewpointActivityExplorer__Group__5 : rule__ViewpointActivityExplorer__Group__5__Impl rule__ViewpointActivityExplorer__Group__6 ;
    public final void rule__ViewpointActivityExplorer__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:532:1: ( rule__ViewpointActivityExplorer__Group__5__Impl rule__ViewpointActivityExplorer__Group__6 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:533:2: rule__ViewpointActivityExplorer__Group__5__Impl rule__ViewpointActivityExplorer__Group__6
            {
            pushFollow(FOLLOW_rule__ViewpointActivityExplorer__Group__5__Impl_in_rule__ViewpointActivityExplorer__Group__51041);
            rule__ViewpointActivityExplorer__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ViewpointActivityExplorer__Group__6_in_rule__ViewpointActivityExplorer__Group__51044);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:540:1: rule__ViewpointActivityExplorer__Group__5__Impl : ( ( rule__ViewpointActivityExplorer__Group_5__0 )? ) ;
    public final void rule__ViewpointActivityExplorer__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:544:1: ( ( ( rule__ViewpointActivityExplorer__Group_5__0 )? ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:545:1: ( ( rule__ViewpointActivityExplorer__Group_5__0 )? )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:545:1: ( ( rule__ViewpointActivityExplorer__Group_5__0 )? )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:546:1: ( rule__ViewpointActivityExplorer__Group_5__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getViewpointActivityExplorerAccess().getGroup_5()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:547:1: ( rule__ViewpointActivityExplorer__Group_5__0 )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==17) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:547:2: rule__ViewpointActivityExplorer__Group_5__0
                    {
                    pushFollow(FOLLOW_rule__ViewpointActivityExplorer__Group_5__0_in_rule__ViewpointActivityExplorer__Group__5__Impl1071);
                    rule__ViewpointActivityExplorer__Group_5__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getViewpointActivityExplorerAccess().getGroup_5()); 
            }

            }


            }

        }
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:557:1: rule__ViewpointActivityExplorer__Group__6 : rule__ViewpointActivityExplorer__Group__6__Impl rule__ViewpointActivityExplorer__Group__7 ;
    public final void rule__ViewpointActivityExplorer__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:561:1: ( rule__ViewpointActivityExplorer__Group__6__Impl rule__ViewpointActivityExplorer__Group__7 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:562:2: rule__ViewpointActivityExplorer__Group__6__Impl rule__ViewpointActivityExplorer__Group__7
            {
            pushFollow(FOLLOW_rule__ViewpointActivityExplorer__Group__6__Impl_in_rule__ViewpointActivityExplorer__Group__61102);
            rule__ViewpointActivityExplorer__Group__6__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ViewpointActivityExplorer__Group__7_in_rule__ViewpointActivityExplorer__Group__61105);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:569:1: rule__ViewpointActivityExplorer__Group__6__Impl : ( ( rule__ViewpointActivityExplorer__OwnedPagesAssignment_6 )* ) ;
    public final void rule__ViewpointActivityExplorer__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:573:1: ( ( ( rule__ViewpointActivityExplorer__OwnedPagesAssignment_6 )* ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:574:1: ( ( rule__ViewpointActivityExplorer__OwnedPagesAssignment_6 )* )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:574:1: ( ( rule__ViewpointActivityExplorer__OwnedPagesAssignment_6 )* )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:575:1: ( rule__ViewpointActivityExplorer__OwnedPagesAssignment_6 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getViewpointActivityExplorerAccess().getOwnedPagesAssignment_6()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:576:1: ( rule__ViewpointActivityExplorer__OwnedPagesAssignment_6 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==18) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:576:2: rule__ViewpointActivityExplorer__OwnedPagesAssignment_6
            	    {
            	    pushFollow(FOLLOW_rule__ViewpointActivityExplorer__OwnedPagesAssignment_6_in_rule__ViewpointActivityExplorer__Group__6__Impl1132);
            	    rule__ViewpointActivityExplorer__OwnedPagesAssignment_6();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getViewpointActivityExplorerAccess().getOwnedPagesAssignment_6()); 
            }

            }


            }

        }
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:586:1: rule__ViewpointActivityExplorer__Group__7 : rule__ViewpointActivityExplorer__Group__7__Impl rule__ViewpointActivityExplorer__Group__8 ;
    public final void rule__ViewpointActivityExplorer__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:590:1: ( rule__ViewpointActivityExplorer__Group__7__Impl rule__ViewpointActivityExplorer__Group__8 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:591:2: rule__ViewpointActivityExplorer__Group__7__Impl rule__ViewpointActivityExplorer__Group__8
            {
            pushFollow(FOLLOW_rule__ViewpointActivityExplorer__Group__7__Impl_in_rule__ViewpointActivityExplorer__Group__71163);
            rule__ViewpointActivityExplorer__Group__7__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ViewpointActivityExplorer__Group__8_in_rule__ViewpointActivityExplorer__Group__71166);
            rule__ViewpointActivityExplorer__Group__8();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:598:1: rule__ViewpointActivityExplorer__Group__7__Impl : ( ( rule__ViewpointActivityExplorer__OwnedSectionExtensionsAssignment_7 )* ) ;
    public final void rule__ViewpointActivityExplorer__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:602:1: ( ( ( rule__ViewpointActivityExplorer__OwnedSectionExtensionsAssignment_7 )* ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:603:1: ( ( rule__ViewpointActivityExplorer__OwnedSectionExtensionsAssignment_7 )* )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:603:1: ( ( rule__ViewpointActivityExplorer__OwnedSectionExtensionsAssignment_7 )* )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:604:1: ( rule__ViewpointActivityExplorer__OwnedSectionExtensionsAssignment_7 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getViewpointActivityExplorerAccess().getOwnedSectionExtensionsAssignment_7()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:605:1: ( rule__ViewpointActivityExplorer__OwnedSectionExtensionsAssignment_7 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==35) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:605:2: rule__ViewpointActivityExplorer__OwnedSectionExtensionsAssignment_7
            	    {
            	    pushFollow(FOLLOW_rule__ViewpointActivityExplorer__OwnedSectionExtensionsAssignment_7_in_rule__ViewpointActivityExplorer__Group__7__Impl1193);
            	    rule__ViewpointActivityExplorer__OwnedSectionExtensionsAssignment_7();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getViewpointActivityExplorerAccess().getOwnedSectionExtensionsAssignment_7()); 
            }

            }


            }

        }
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


    // $ANTLR start "rule__ViewpointActivityExplorer__Group__8"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:615:1: rule__ViewpointActivityExplorer__Group__8 : rule__ViewpointActivityExplorer__Group__8__Impl ;
    public final void rule__ViewpointActivityExplorer__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:619:1: ( rule__ViewpointActivityExplorer__Group__8__Impl )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:620:2: rule__ViewpointActivityExplorer__Group__8__Impl
            {
            pushFollow(FOLLOW_rule__ViewpointActivityExplorer__Group__8__Impl_in_rule__ViewpointActivityExplorer__Group__81224);
            rule__ViewpointActivityExplorer__Group__8__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ViewpointActivityExplorer__Group__8"


    // $ANTLR start "rule__ViewpointActivityExplorer__Group__8__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:626:1: rule__ViewpointActivityExplorer__Group__8__Impl : ( '}' ) ;
    public final void rule__ViewpointActivityExplorer__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:630:1: ( ( '}' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:631:1: ( '}' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:631:1: ( '}' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:632:1: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getViewpointActivityExplorerAccess().getRightCurlyBracketKeyword_8()); 
            }
            match(input,16,FOLLOW_16_in_rule__ViewpointActivityExplorer__Group__8__Impl1252); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getViewpointActivityExplorerAccess().getRightCurlyBracketKeyword_8()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ViewpointActivityExplorer__Group__8__Impl"


    // $ANTLR start "rule__ViewpointActivityExplorer__Group_5__0"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:663:1: rule__ViewpointActivityExplorer__Group_5__0 : rule__ViewpointActivityExplorer__Group_5__0__Impl rule__ViewpointActivityExplorer__Group_5__1 ;
    public final void rule__ViewpointActivityExplorer__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:667:1: ( rule__ViewpointActivityExplorer__Group_5__0__Impl rule__ViewpointActivityExplorer__Group_5__1 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:668:2: rule__ViewpointActivityExplorer__Group_5__0__Impl rule__ViewpointActivityExplorer__Group_5__1
            {
            pushFollow(FOLLOW_rule__ViewpointActivityExplorer__Group_5__0__Impl_in_rule__ViewpointActivityExplorer__Group_5__01301);
            rule__ViewpointActivityExplorer__Group_5__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ViewpointActivityExplorer__Group_5__1_in_rule__ViewpointActivityExplorer__Group_5__01304);
            rule__ViewpointActivityExplorer__Group_5__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ViewpointActivityExplorer__Group_5__0"


    // $ANTLR start "rule__ViewpointActivityExplorer__Group_5__0__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:675:1: rule__ViewpointActivityExplorer__Group_5__0__Impl : ( 'pages' ) ;
    public final void rule__ViewpointActivityExplorer__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:679:1: ( ( 'pages' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:680:1: ( 'pages' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:680:1: ( 'pages' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:681:1: 'pages'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getViewpointActivityExplorerAccess().getPagesKeyword_5_0()); 
            }
            match(input,17,FOLLOW_17_in_rule__ViewpointActivityExplorer__Group_5__0__Impl1332); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getViewpointActivityExplorerAccess().getPagesKeyword_5_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ViewpointActivityExplorer__Group_5__0__Impl"


    // $ANTLR start "rule__ViewpointActivityExplorer__Group_5__1"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:694:1: rule__ViewpointActivityExplorer__Group_5__1 : rule__ViewpointActivityExplorer__Group_5__1__Impl rule__ViewpointActivityExplorer__Group_5__2 ;
    public final void rule__ViewpointActivityExplorer__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:698:1: ( rule__ViewpointActivityExplorer__Group_5__1__Impl rule__ViewpointActivityExplorer__Group_5__2 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:699:2: rule__ViewpointActivityExplorer__Group_5__1__Impl rule__ViewpointActivityExplorer__Group_5__2
            {
            pushFollow(FOLLOW_rule__ViewpointActivityExplorer__Group_5__1__Impl_in_rule__ViewpointActivityExplorer__Group_5__11363);
            rule__ViewpointActivityExplorer__Group_5__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ViewpointActivityExplorer__Group_5__2_in_rule__ViewpointActivityExplorer__Group_5__11366);
            rule__ViewpointActivityExplorer__Group_5__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ViewpointActivityExplorer__Group_5__1"


    // $ANTLR start "rule__ViewpointActivityExplorer__Group_5__1__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:706:1: rule__ViewpointActivityExplorer__Group_5__1__Impl : ( '{' ) ;
    public final void rule__ViewpointActivityExplorer__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:710:1: ( ( '{' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:711:1: ( '{' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:711:1: ( '{' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:712:1: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getViewpointActivityExplorerAccess().getLeftCurlyBracketKeyword_5_1()); 
            }
            match(input,15,FOLLOW_15_in_rule__ViewpointActivityExplorer__Group_5__1__Impl1394); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getViewpointActivityExplorerAccess().getLeftCurlyBracketKeyword_5_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ViewpointActivityExplorer__Group_5__1__Impl"


    // $ANTLR start "rule__ViewpointActivityExplorer__Group_5__2"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:725:1: rule__ViewpointActivityExplorer__Group_5__2 : rule__ViewpointActivityExplorer__Group_5__2__Impl rule__ViewpointActivityExplorer__Group_5__3 ;
    public final void rule__ViewpointActivityExplorer__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:729:1: ( rule__ViewpointActivityExplorer__Group_5__2__Impl rule__ViewpointActivityExplorer__Group_5__3 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:730:2: rule__ViewpointActivityExplorer__Group_5__2__Impl rule__ViewpointActivityExplorer__Group_5__3
            {
            pushFollow(FOLLOW_rule__ViewpointActivityExplorer__Group_5__2__Impl_in_rule__ViewpointActivityExplorer__Group_5__21425);
            rule__ViewpointActivityExplorer__Group_5__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ViewpointActivityExplorer__Group_5__3_in_rule__ViewpointActivityExplorer__Group_5__21428);
            rule__ViewpointActivityExplorer__Group_5__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ViewpointActivityExplorer__Group_5__2"


    // $ANTLR start "rule__ViewpointActivityExplorer__Group_5__2__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:737:1: rule__ViewpointActivityExplorer__Group_5__2__Impl : ( ( rule__ViewpointActivityExplorer__OwnedPagesAssignment_5_2 )* ) ;
    public final void rule__ViewpointActivityExplorer__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:741:1: ( ( ( rule__ViewpointActivityExplorer__OwnedPagesAssignment_5_2 )* ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:742:1: ( ( rule__ViewpointActivityExplorer__OwnedPagesAssignment_5_2 )* )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:742:1: ( ( rule__ViewpointActivityExplorer__OwnedPagesAssignment_5_2 )* )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:743:1: ( rule__ViewpointActivityExplorer__OwnedPagesAssignment_5_2 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getViewpointActivityExplorerAccess().getOwnedPagesAssignment_5_2()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:744:1: ( rule__ViewpointActivityExplorer__OwnedPagesAssignment_5_2 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==18) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:744:2: rule__ViewpointActivityExplorer__OwnedPagesAssignment_5_2
            	    {
            	    pushFollow(FOLLOW_rule__ViewpointActivityExplorer__OwnedPagesAssignment_5_2_in_rule__ViewpointActivityExplorer__Group_5__2__Impl1455);
            	    rule__ViewpointActivityExplorer__OwnedPagesAssignment_5_2();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getViewpointActivityExplorerAccess().getOwnedPagesAssignment_5_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ViewpointActivityExplorer__Group_5__2__Impl"


    // $ANTLR start "rule__ViewpointActivityExplorer__Group_5__3"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:754:1: rule__ViewpointActivityExplorer__Group_5__3 : rule__ViewpointActivityExplorer__Group_5__3__Impl ;
    public final void rule__ViewpointActivityExplorer__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:758:1: ( rule__ViewpointActivityExplorer__Group_5__3__Impl )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:759:2: rule__ViewpointActivityExplorer__Group_5__3__Impl
            {
            pushFollow(FOLLOW_rule__ViewpointActivityExplorer__Group_5__3__Impl_in_rule__ViewpointActivityExplorer__Group_5__31486);
            rule__ViewpointActivityExplorer__Group_5__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ViewpointActivityExplorer__Group_5__3"


    // $ANTLR start "rule__ViewpointActivityExplorer__Group_5__3__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:765:1: rule__ViewpointActivityExplorer__Group_5__3__Impl : ( '}' ) ;
    public final void rule__ViewpointActivityExplorer__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:769:1: ( ( '}' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:770:1: ( '}' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:770:1: ( '}' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:771:1: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getViewpointActivityExplorerAccess().getRightCurlyBracketKeyword_5_3()); 
            }
            match(input,16,FOLLOW_16_in_rule__ViewpointActivityExplorer__Group_5__3__Impl1514); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getViewpointActivityExplorerAccess().getRightCurlyBracketKeyword_5_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ViewpointActivityExplorer__Group_5__3__Impl"


    // $ANTLR start "rule__Page__Group__0"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:792:1: rule__Page__Group__0 : rule__Page__Group__0__Impl rule__Page__Group__1 ;
    public final void rule__Page__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:796:1: ( rule__Page__Group__0__Impl rule__Page__Group__1 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:797:2: rule__Page__Group__0__Impl rule__Page__Group__1
            {
            pushFollow(FOLLOW_rule__Page__Group__0__Impl_in_rule__Page__Group__01553);
            rule__Page__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Page__Group__1_in_rule__Page__Group__01556);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:804:1: rule__Page__Group__0__Impl : ( () ) ;
    public final void rule__Page__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:808:1: ( ( () ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:809:1: ( () )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:809:1: ( () )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:810:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPageAccess().getPageAction_0()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:811:1: ()
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:813:1: 
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:823:1: rule__Page__Group__1 : rule__Page__Group__1__Impl rule__Page__Group__2 ;
    public final void rule__Page__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:827:1: ( rule__Page__Group__1__Impl rule__Page__Group__2 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:828:2: rule__Page__Group__1__Impl rule__Page__Group__2
            {
            pushFollow(FOLLOW_rule__Page__Group__1__Impl_in_rule__Page__Group__11614);
            rule__Page__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Page__Group__2_in_rule__Page__Group__11617);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:835:1: rule__Page__Group__1__Impl : ( 'page' ) ;
    public final void rule__Page__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:839:1: ( ( 'page' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:840:1: ( 'page' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:840:1: ( 'page' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:841:1: 'page'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPageAccess().getPageKeyword_1()); 
            }
            match(input,18,FOLLOW_18_in_rule__Page__Group__1__Impl1645); if (state.failed) return ;
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:854:1: rule__Page__Group__2 : rule__Page__Group__2__Impl rule__Page__Group__3 ;
    public final void rule__Page__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:858:1: ( rule__Page__Group__2__Impl rule__Page__Group__3 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:859:2: rule__Page__Group__2__Impl rule__Page__Group__3
            {
            pushFollow(FOLLOW_rule__Page__Group__2__Impl_in_rule__Page__Group__21676);
            rule__Page__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Page__Group__3_in_rule__Page__Group__21679);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:866:1: rule__Page__Group__2__Impl : ( ( rule__Page__NameAssignment_2 ) ) ;
    public final void rule__Page__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:870:1: ( ( ( rule__Page__NameAssignment_2 ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:871:1: ( ( rule__Page__NameAssignment_2 ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:871:1: ( ( rule__Page__NameAssignment_2 ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:872:1: ( rule__Page__NameAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPageAccess().getNameAssignment_2()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:873:1: ( rule__Page__NameAssignment_2 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:873:2: rule__Page__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__Page__NameAssignment_2_in_rule__Page__Group__2__Impl1706);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:883:1: rule__Page__Group__3 : rule__Page__Group__3__Impl rule__Page__Group__4 ;
    public final void rule__Page__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:887:1: ( rule__Page__Group__3__Impl rule__Page__Group__4 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:888:2: rule__Page__Group__3__Impl rule__Page__Group__4
            {
            pushFollow(FOLLOW_rule__Page__Group__3__Impl_in_rule__Page__Group__31736);
            rule__Page__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Page__Group__4_in_rule__Page__Group__31739);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:895:1: rule__Page__Group__3__Impl : ( '{' ) ;
    public final void rule__Page__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:899:1: ( ( '{' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:900:1: ( '{' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:900:1: ( '{' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:901:1: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPageAccess().getLeftCurlyBracketKeyword_3()); 
            }
            match(input,15,FOLLOW_15_in_rule__Page__Group__3__Impl1767); if (state.failed) return ;
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:914:1: rule__Page__Group__4 : rule__Page__Group__4__Impl rule__Page__Group__5 ;
    public final void rule__Page__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:918:1: ( rule__Page__Group__4__Impl rule__Page__Group__5 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:919:2: rule__Page__Group__4__Impl rule__Page__Group__5
            {
            pushFollow(FOLLOW_rule__Page__Group__4__Impl_in_rule__Page__Group__41798);
            rule__Page__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Page__Group__5_in_rule__Page__Group__41801);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:926:1: rule__Page__Group__4__Impl : ( ( rule__Page__Group_4__0 )? ) ;
    public final void rule__Page__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:930:1: ( ( ( rule__Page__Group_4__0 )? ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:931:1: ( ( rule__Page__Group_4__0 )? )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:931:1: ( ( rule__Page__Group_4__0 )? )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:932:1: ( rule__Page__Group_4__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPageAccess().getGroup_4()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:933:1: ( rule__Page__Group_4__0 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==20) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:933:2: rule__Page__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__Page__Group_4__0_in_rule__Page__Group__4__Impl1828);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:943:1: rule__Page__Group__5 : rule__Page__Group__5__Impl rule__Page__Group__6 ;
    public final void rule__Page__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:947:1: ( rule__Page__Group__5__Impl rule__Page__Group__6 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:948:2: rule__Page__Group__5__Impl rule__Page__Group__6
            {
            pushFollow(FOLLOW_rule__Page__Group__5__Impl_in_rule__Page__Group__51859);
            rule__Page__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Page__Group__6_in_rule__Page__Group__51862);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:955:1: rule__Page__Group__5__Impl : ( ( rule__Page__Group_5__0 )? ) ;
    public final void rule__Page__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:959:1: ( ( ( rule__Page__Group_5__0 )? ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:960:1: ( ( rule__Page__Group_5__0 )? )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:960:1: ( ( rule__Page__Group_5__0 )? )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:961:1: ( rule__Page__Group_5__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPageAccess().getGroup_5()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:962:1: ( rule__Page__Group_5__0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==21) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:962:2: rule__Page__Group_5__0
                    {
                    pushFollow(FOLLOW_rule__Page__Group_5__0_in_rule__Page__Group__5__Impl1889);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:972:1: rule__Page__Group__6 : rule__Page__Group__6__Impl rule__Page__Group__7 ;
    public final void rule__Page__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:976:1: ( rule__Page__Group__6__Impl rule__Page__Group__7 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:977:2: rule__Page__Group__6__Impl rule__Page__Group__7
            {
            pushFollow(FOLLOW_rule__Page__Group__6__Impl_in_rule__Page__Group__61920);
            rule__Page__Group__6__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Page__Group__7_in_rule__Page__Group__61923);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:984:1: rule__Page__Group__6__Impl : ( ( rule__Page__Group_6__0 )? ) ;
    public final void rule__Page__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:988:1: ( ( ( rule__Page__Group_6__0 )? ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:989:1: ( ( rule__Page__Group_6__0 )? )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:989:1: ( ( rule__Page__Group_6__0 )? )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:990:1: ( rule__Page__Group_6__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPageAccess().getGroup_6()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:991:1: ( rule__Page__Group_6__0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==23) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:991:2: rule__Page__Group_6__0
                    {
                    pushFollow(FOLLOW_rule__Page__Group_6__0_in_rule__Page__Group__6__Impl1950);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1001:1: rule__Page__Group__7 : rule__Page__Group__7__Impl rule__Page__Group__8 ;
    public final void rule__Page__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1005:1: ( rule__Page__Group__7__Impl rule__Page__Group__8 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1006:2: rule__Page__Group__7__Impl rule__Page__Group__8
            {
            pushFollow(FOLLOW_rule__Page__Group__7__Impl_in_rule__Page__Group__71981);
            rule__Page__Group__7__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Page__Group__8_in_rule__Page__Group__71984);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1013:1: rule__Page__Group__7__Impl : ( 'index' ) ;
    public final void rule__Page__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1017:1: ( ( 'index' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1018:1: ( 'index' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1018:1: ( 'index' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1019:1: 'index'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPageAccess().getIndexKeyword_7()); 
            }
            match(input,19,FOLLOW_19_in_rule__Page__Group__7__Impl2012); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPageAccess().getIndexKeyword_7()); 
            }

            }


            }

        }
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1032:1: rule__Page__Group__8 : rule__Page__Group__8__Impl rule__Page__Group__9 ;
    public final void rule__Page__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1036:1: ( rule__Page__Group__8__Impl rule__Page__Group__9 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1037:2: rule__Page__Group__8__Impl rule__Page__Group__9
            {
            pushFollow(FOLLOW_rule__Page__Group__8__Impl_in_rule__Page__Group__82043);
            rule__Page__Group__8__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Page__Group__9_in_rule__Page__Group__82046);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1044:1: rule__Page__Group__8__Impl : ( ( rule__Page__IndexAssignment_8 ) ) ;
    public final void rule__Page__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1048:1: ( ( ( rule__Page__IndexAssignment_8 ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1049:1: ( ( rule__Page__IndexAssignment_8 ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1049:1: ( ( rule__Page__IndexAssignment_8 ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1050:1: ( rule__Page__IndexAssignment_8 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPageAccess().getIndexAssignment_8()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1051:1: ( rule__Page__IndexAssignment_8 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1051:2: rule__Page__IndexAssignment_8
            {
            pushFollow(FOLLOW_rule__Page__IndexAssignment_8_in_rule__Page__Group__8__Impl2073);
            rule__Page__IndexAssignment_8();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPageAccess().getIndexAssignment_8()); 
            }

            }


            }

        }
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1061:1: rule__Page__Group__9 : rule__Page__Group__9__Impl rule__Page__Group__10 ;
    public final void rule__Page__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1065:1: ( rule__Page__Group__9__Impl rule__Page__Group__10 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1066:2: rule__Page__Group__9__Impl rule__Page__Group__10
            {
            pushFollow(FOLLOW_rule__Page__Group__9__Impl_in_rule__Page__Group__92103);
            rule__Page__Group__9__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Page__Group__10_in_rule__Page__Group__92106);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1073:1: rule__Page__Group__9__Impl : ( ( rule__Page__OwnedOverviewAssignment_9 )? ) ;
    public final void rule__Page__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1077:1: ( ( ( rule__Page__OwnedOverviewAssignment_9 )? ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1078:1: ( ( rule__Page__OwnedOverviewAssignment_9 )? )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1078:1: ( ( rule__Page__OwnedOverviewAssignment_9 )? )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1079:1: ( rule__Page__OwnedOverviewAssignment_9 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPageAccess().getOwnedOverviewAssignment_9()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1080:1: ( rule__Page__OwnedOverviewAssignment_9 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==42) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1080:2: rule__Page__OwnedOverviewAssignment_9
                    {
                    pushFollow(FOLLOW_rule__Page__OwnedOverviewAssignment_9_in_rule__Page__Group__9__Impl2133);
                    rule__Page__OwnedOverviewAssignment_9();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPageAccess().getOwnedOverviewAssignment_9()); 
            }

            }


            }

        }
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1090:1: rule__Page__Group__10 : rule__Page__Group__10__Impl rule__Page__Group__11 ;
    public final void rule__Page__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1094:1: ( rule__Page__Group__10__Impl rule__Page__Group__11 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1095:2: rule__Page__Group__10__Impl rule__Page__Group__11
            {
            pushFollow(FOLLOW_rule__Page__Group__10__Impl_in_rule__Page__Group__102164);
            rule__Page__Group__10__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Page__Group__11_in_rule__Page__Group__102167);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1102:1: rule__Page__Group__10__Impl : ( ( rule__Page__Group_10__0 )? ) ;
    public final void rule__Page__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1106:1: ( ( ( rule__Page__Group_10__0 )? ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1107:1: ( ( rule__Page__Group_10__0 )? )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1107:1: ( ( rule__Page__Group_10__0 )? )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1108:1: ( rule__Page__Group_10__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPageAccess().getGroup_10()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1109:1: ( rule__Page__Group_10__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==24) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1109:2: rule__Page__Group_10__0
                    {
                    pushFollow(FOLLOW_rule__Page__Group_10__0_in_rule__Page__Group__10__Impl2194);
                    rule__Page__Group_10__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPageAccess().getGroup_10()); 
            }

            }


            }

        }
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1119:1: rule__Page__Group__11 : rule__Page__Group__11__Impl rule__Page__Group__12 ;
    public final void rule__Page__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1123:1: ( rule__Page__Group__11__Impl rule__Page__Group__12 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1124:2: rule__Page__Group__11__Impl rule__Page__Group__12
            {
            pushFollow(FOLLOW_rule__Page__Group__11__Impl_in_rule__Page__Group__112225);
            rule__Page__Group__11__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Page__Group__12_in_rule__Page__Group__112228);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1131:1: rule__Page__Group__11__Impl : ( ( rule__Page__Group_11__0 )? ) ;
    public final void rule__Page__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1135:1: ( ( ( rule__Page__Group_11__0 )? ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1136:1: ( ( rule__Page__Group_11__0 )? )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1136:1: ( ( rule__Page__Group_11__0 )? )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1137:1: ( rule__Page__Group_11__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPageAccess().getGroup_11()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1138:1: ( rule__Page__Group_11__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==29) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1138:2: rule__Page__Group_11__0
                    {
                    pushFollow(FOLLOW_rule__Page__Group_11__0_in_rule__Page__Group__11__Impl2255);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1148:1: rule__Page__Group__12 : rule__Page__Group__12__Impl rule__Page__Group__13 ;
    public final void rule__Page__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1152:1: ( rule__Page__Group__12__Impl rule__Page__Group__13 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1153:2: rule__Page__Group__12__Impl rule__Page__Group__13
            {
            pushFollow(FOLLOW_rule__Page__Group__12__Impl_in_rule__Page__Group__122286);
            rule__Page__Group__12__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Page__Group__13_in_rule__Page__Group__122289);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1160:1: rule__Page__Group__12__Impl : ( ( rule__Page__Group_12__0 )? ) ;
    public final void rule__Page__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1164:1: ( ( ( rule__Page__Group_12__0 )? ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1165:1: ( ( rule__Page__Group_12__0 )? )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1165:1: ( ( rule__Page__Group_12__0 )? )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1166:1: ( rule__Page__Group_12__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPageAccess().getGroup_12()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1167:1: ( rule__Page__Group_12__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==31) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1167:2: rule__Page__Group_12__0
                    {
                    pushFollow(FOLLOW_rule__Page__Group_12__0_in_rule__Page__Group__12__Impl2316);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1177:1: rule__Page__Group__13 : rule__Page__Group__13__Impl rule__Page__Group__14 ;
    public final void rule__Page__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1181:1: ( rule__Page__Group__13__Impl rule__Page__Group__14 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1182:2: rule__Page__Group__13__Impl rule__Page__Group__14
            {
            pushFollow(FOLLOW_rule__Page__Group__13__Impl_in_rule__Page__Group__132347);
            rule__Page__Group__13__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Page__Group__14_in_rule__Page__Group__132350);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1189:1: rule__Page__Group__13__Impl : ( ( rule__Page__Group_13__0 )? ) ;
    public final void rule__Page__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1193:1: ( ( ( rule__Page__Group_13__0 )? ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1194:1: ( ( rule__Page__Group_13__0 )? )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1194:1: ( ( rule__Page__Group_13__0 )? )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1195:1: ( rule__Page__Group_13__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPageAccess().getGroup_13()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1196:1: ( rule__Page__Group_13__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==32) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1196:2: rule__Page__Group_13__0
                    {
                    pushFollow(FOLLOW_rule__Page__Group_13__0_in_rule__Page__Group__13__Impl2377);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1206:1: rule__Page__Group__14 : rule__Page__Group__14__Impl rule__Page__Group__15 ;
    public final void rule__Page__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1210:1: ( rule__Page__Group__14__Impl rule__Page__Group__15 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1211:2: rule__Page__Group__14__Impl rule__Page__Group__15
            {
            pushFollow(FOLLOW_rule__Page__Group__14__Impl_in_rule__Page__Group__142408);
            rule__Page__Group__14__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Page__Group__15_in_rule__Page__Group__142411);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1218:1: rule__Page__Group__14__Impl : ( ( rule__Page__Group_14__0 )? ) ;
    public final void rule__Page__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1222:1: ( ( ( rule__Page__Group_14__0 )? ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1223:1: ( ( rule__Page__Group_14__0 )? )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1223:1: ( ( rule__Page__Group_14__0 )? )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1224:1: ( rule__Page__Group_14__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPageAccess().getGroup_14()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1225:1: ( rule__Page__Group_14__0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==34) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1225:2: rule__Page__Group_14__0
                    {
                    pushFollow(FOLLOW_rule__Page__Group_14__0_in_rule__Page__Group__14__Impl2438);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1235:1: rule__Page__Group__15 : rule__Page__Group__15__Impl ;
    public final void rule__Page__Group__15() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1239:1: ( rule__Page__Group__15__Impl )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1240:2: rule__Page__Group__15__Impl
            {
            pushFollow(FOLLOW_rule__Page__Group__15__Impl_in_rule__Page__Group__152469);
            rule__Page__Group__15__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1246:1: rule__Page__Group__15__Impl : ( '}' ) ;
    public final void rule__Page__Group__15__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1250:1: ( ( '}' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1251:1: ( '}' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1251:1: ( '}' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1252:1: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPageAccess().getRightCurlyBracketKeyword_15()); 
            }
            match(input,16,FOLLOW_16_in_rule__Page__Group__15__Impl2497); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPageAccess().getRightCurlyBracketKeyword_15()); 
            }

            }


            }

        }
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


    // $ANTLR start "rule__Page__Group_4__0"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1297:1: rule__Page__Group_4__0 : rule__Page__Group_4__0__Impl rule__Page__Group_4__1 ;
    public final void rule__Page__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1301:1: ( rule__Page__Group_4__0__Impl rule__Page__Group_4__1 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1302:2: rule__Page__Group_4__0__Impl rule__Page__Group_4__1
            {
            pushFollow(FOLLOW_rule__Page__Group_4__0__Impl_in_rule__Page__Group_4__02560);
            rule__Page__Group_4__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Page__Group_4__1_in_rule__Page__Group_4__02563);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1309:1: rule__Page__Group_4__0__Impl : ( 'description' ) ;
    public final void rule__Page__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1313:1: ( ( 'description' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1314:1: ( 'description' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1314:1: ( 'description' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1315:1: 'description'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPageAccess().getDescriptionKeyword_4_0()); 
            }
            match(input,20,FOLLOW_20_in_rule__Page__Group_4__0__Impl2591); if (state.failed) return ;
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1328:1: rule__Page__Group_4__1 : rule__Page__Group_4__1__Impl ;
    public final void rule__Page__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1332:1: ( rule__Page__Group_4__1__Impl )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1333:2: rule__Page__Group_4__1__Impl
            {
            pushFollow(FOLLOW_rule__Page__Group_4__1__Impl_in_rule__Page__Group_4__12622);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1339:1: rule__Page__Group_4__1__Impl : ( ( rule__Page__DescriptionAssignment_4_1 ) ) ;
    public final void rule__Page__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1343:1: ( ( ( rule__Page__DescriptionAssignment_4_1 ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1344:1: ( ( rule__Page__DescriptionAssignment_4_1 ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1344:1: ( ( rule__Page__DescriptionAssignment_4_1 ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1345:1: ( rule__Page__DescriptionAssignment_4_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPageAccess().getDescriptionAssignment_4_1()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1346:1: ( rule__Page__DescriptionAssignment_4_1 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1346:2: rule__Page__DescriptionAssignment_4_1
            {
            pushFollow(FOLLOW_rule__Page__DescriptionAssignment_4_1_in_rule__Page__Group_4__1__Impl2649);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1360:1: rule__Page__Group_5__0 : rule__Page__Group_5__0__Impl rule__Page__Group_5__1 ;
    public final void rule__Page__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1364:1: ( rule__Page__Group_5__0__Impl rule__Page__Group_5__1 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1365:2: rule__Page__Group_5__0__Impl rule__Page__Group_5__1
            {
            pushFollow(FOLLOW_rule__Page__Group_5__0__Impl_in_rule__Page__Group_5__02683);
            rule__Page__Group_5__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Page__Group_5__1_in_rule__Page__Group_5__02686);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1372:1: rule__Page__Group_5__0__Impl : ( 'file' ) ;
    public final void rule__Page__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1376:1: ( ( 'file' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1377:1: ( 'file' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1377:1: ( 'file' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1378:1: 'file'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPageAccess().getFileKeyword_5_0()); 
            }
            match(input,21,FOLLOW_21_in_rule__Page__Group_5__0__Impl2714); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPageAccess().getFileKeyword_5_0()); 
            }

            }


            }

        }
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1391:1: rule__Page__Group_5__1 : rule__Page__Group_5__1__Impl rule__Page__Group_5__2 ;
    public final void rule__Page__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1395:1: ( rule__Page__Group_5__1__Impl rule__Page__Group_5__2 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1396:2: rule__Page__Group_5__1__Impl rule__Page__Group_5__2
            {
            pushFollow(FOLLOW_rule__Page__Group_5__1__Impl_in_rule__Page__Group_5__12745);
            rule__Page__Group_5__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Page__Group_5__2_in_rule__Page__Group_5__12748);
            rule__Page__Group_5__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1403:1: rule__Page__Group_5__1__Impl : ( 'extension' ) ;
    public final void rule__Page__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1407:1: ( ( 'extension' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1408:1: ( 'extension' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1408:1: ( 'extension' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1409:1: 'extension'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPageAccess().getExtensionKeyword_5_1()); 
            }
            match(input,22,FOLLOW_22_in_rule__Page__Group_5__1__Impl2776); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPageAccess().getExtensionKeyword_5_1()); 
            }

            }


            }

        }
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


    // $ANTLR start "rule__Page__Group_5__2"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1422:1: rule__Page__Group_5__2 : rule__Page__Group_5__2__Impl ;
    public final void rule__Page__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1426:1: ( rule__Page__Group_5__2__Impl )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1427:2: rule__Page__Group_5__2__Impl
            {
            pushFollow(FOLLOW_rule__Page__Group_5__2__Impl_in_rule__Page__Group_5__22807);
            rule__Page__Group_5__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__Group_5__2"


    // $ANTLR start "rule__Page__Group_5__2__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1433:1: rule__Page__Group_5__2__Impl : ( ( rule__Page__FileExtensionsAssignment_5_2 ) ) ;
    public final void rule__Page__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1437:1: ( ( ( rule__Page__FileExtensionsAssignment_5_2 ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1438:1: ( ( rule__Page__FileExtensionsAssignment_5_2 ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1438:1: ( ( rule__Page__FileExtensionsAssignment_5_2 ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1439:1: ( rule__Page__FileExtensionsAssignment_5_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPageAccess().getFileExtensionsAssignment_5_2()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1440:1: ( rule__Page__FileExtensionsAssignment_5_2 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1440:2: rule__Page__FileExtensionsAssignment_5_2
            {
            pushFollow(FOLLOW_rule__Page__FileExtensionsAssignment_5_2_in_rule__Page__Group_5__2__Impl2834);
            rule__Page__FileExtensionsAssignment_5_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPageAccess().getFileExtensionsAssignment_5_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__Group_5__2__Impl"


    // $ANTLR start "rule__Page__Group_6__0"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1456:1: rule__Page__Group_6__0 : rule__Page__Group_6__0__Impl rule__Page__Group_6__1 ;
    public final void rule__Page__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1460:1: ( rule__Page__Group_6__0__Impl rule__Page__Group_6__1 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1461:2: rule__Page__Group_6__0__Impl rule__Page__Group_6__1
            {
            pushFollow(FOLLOW_rule__Page__Group_6__0__Impl_in_rule__Page__Group_6__02870);
            rule__Page__Group_6__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Page__Group_6__1_in_rule__Page__Group_6__02873);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1468:1: rule__Page__Group_6__0__Impl : ( 'id' ) ;
    public final void rule__Page__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1472:1: ( ( 'id' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1473:1: ( 'id' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1473:1: ( 'id' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1474:1: 'id'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPageAccess().getIdKeyword_6_0()); 
            }
            match(input,23,FOLLOW_23_in_rule__Page__Group_6__0__Impl2901); if (state.failed) return ;
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1487:1: rule__Page__Group_6__1 : rule__Page__Group_6__1__Impl ;
    public final void rule__Page__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1491:1: ( rule__Page__Group_6__1__Impl )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1492:2: rule__Page__Group_6__1__Impl
            {
            pushFollow(FOLLOW_rule__Page__Group_6__1__Impl_in_rule__Page__Group_6__12932);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1498:1: rule__Page__Group_6__1__Impl : ( ( rule__Page__ActivityExplorerItemIDAssignment_6_1 ) ) ;
    public final void rule__Page__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1502:1: ( ( ( rule__Page__ActivityExplorerItemIDAssignment_6_1 ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1503:1: ( ( rule__Page__ActivityExplorerItemIDAssignment_6_1 ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1503:1: ( ( rule__Page__ActivityExplorerItemIDAssignment_6_1 ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1504:1: ( rule__Page__ActivityExplorerItemIDAssignment_6_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPageAccess().getActivityExplorerItemIDAssignment_6_1()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1505:1: ( rule__Page__ActivityExplorerItemIDAssignment_6_1 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1505:2: rule__Page__ActivityExplorerItemIDAssignment_6_1
            {
            pushFollow(FOLLOW_rule__Page__ActivityExplorerItemIDAssignment_6_1_in_rule__Page__Group_6__1__Impl2959);
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


    // $ANTLR start "rule__Page__Group_10__0"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1519:1: rule__Page__Group_10__0 : rule__Page__Group_10__0__Impl rule__Page__Group_10__1 ;
    public final void rule__Page__Group_10__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1523:1: ( rule__Page__Group_10__0__Impl rule__Page__Group_10__1 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1524:2: rule__Page__Group_10__0__Impl rule__Page__Group_10__1
            {
            pushFollow(FOLLOW_rule__Page__Group_10__0__Impl_in_rule__Page__Group_10__02993);
            rule__Page__Group_10__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Page__Group_10__1_in_rule__Page__Group_10__02996);
            rule__Page__Group_10__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__Group_10__0"


    // $ANTLR start "rule__Page__Group_10__0__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1531:1: rule__Page__Group_10__0__Impl : ( 'header' ) ;
    public final void rule__Page__Group_10__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1535:1: ( ( 'header' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1536:1: ( 'header' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1536:1: ( 'header' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1537:1: 'header'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPageAccess().getHeaderKeyword_10_0()); 
            }
            match(input,24,FOLLOW_24_in_rule__Page__Group_10__0__Impl3024); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPageAccess().getHeaderKeyword_10_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__Group_10__0__Impl"


    // $ANTLR start "rule__Page__Group_10__1"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1550:1: rule__Page__Group_10__1 : rule__Page__Group_10__1__Impl rule__Page__Group_10__2 ;
    public final void rule__Page__Group_10__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1554:1: ( rule__Page__Group_10__1__Impl rule__Page__Group_10__2 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1555:2: rule__Page__Group_10__1__Impl rule__Page__Group_10__2
            {
            pushFollow(FOLLOW_rule__Page__Group_10__1__Impl_in_rule__Page__Group_10__13055);
            rule__Page__Group_10__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Page__Group_10__2_in_rule__Page__Group_10__13058);
            rule__Page__Group_10__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__Group_10__1"


    // $ANTLR start "rule__Page__Group_10__1__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1562:1: rule__Page__Group_10__1__Impl : ( '{' ) ;
    public final void rule__Page__Group_10__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1566:1: ( ( '{' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1567:1: ( '{' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1567:1: ( '{' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1568:1: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPageAccess().getLeftCurlyBracketKeyword_10_1()); 
            }
            match(input,15,FOLLOW_15_in_rule__Page__Group_10__1__Impl3086); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPageAccess().getLeftCurlyBracketKeyword_10_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__Group_10__1__Impl"


    // $ANTLR start "rule__Page__Group_10__2"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1581:1: rule__Page__Group_10__2 : rule__Page__Group_10__2__Impl rule__Page__Group_10__3 ;
    public final void rule__Page__Group_10__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1585:1: ( rule__Page__Group_10__2__Impl rule__Page__Group_10__3 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1586:2: rule__Page__Group_10__2__Impl rule__Page__Group_10__3
            {
            pushFollow(FOLLOW_rule__Page__Group_10__2__Impl_in_rule__Page__Group_10__23117);
            rule__Page__Group_10__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Page__Group_10__3_in_rule__Page__Group_10__23120);
            rule__Page__Group_10__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__Group_10__2"


    // $ANTLR start "rule__Page__Group_10__2__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1593:1: rule__Page__Group_10__2__Impl : ( ( rule__Page__Group_10_2__0 )? ) ;
    public final void rule__Page__Group_10__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1597:1: ( ( ( rule__Page__Group_10_2__0 )? ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1598:1: ( ( rule__Page__Group_10_2__0 )? )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1598:1: ( ( rule__Page__Group_10_2__0 )? )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1599:1: ( rule__Page__Group_10_2__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPageAccess().getGroup_10_2()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1600:1: ( rule__Page__Group_10_2__0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==25) ) {
                int LA15_1 = input.LA(2);

                if ( (LA15_1==26) ) {
                    alt15=1;
                }
            }
            switch (alt15) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1600:2: rule__Page__Group_10_2__0
                    {
                    pushFollow(FOLLOW_rule__Page__Group_10_2__0_in_rule__Page__Group_10__2__Impl3147);
                    rule__Page__Group_10_2__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPageAccess().getGroup_10_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__Group_10__2__Impl"


    // $ANTLR start "rule__Page__Group_10__3"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1610:1: rule__Page__Group_10__3 : rule__Page__Group_10__3__Impl rule__Page__Group_10__4 ;
    public final void rule__Page__Group_10__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1614:1: ( rule__Page__Group_10__3__Impl rule__Page__Group_10__4 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1615:2: rule__Page__Group_10__3__Impl rule__Page__Group_10__4
            {
            pushFollow(FOLLOW_rule__Page__Group_10__3__Impl_in_rule__Page__Group_10__33178);
            rule__Page__Group_10__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Page__Group_10__4_in_rule__Page__Group_10__33181);
            rule__Page__Group_10__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__Group_10__3"


    // $ANTLR start "rule__Page__Group_10__3__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1622:1: rule__Page__Group_10__3__Impl : ( ( rule__Page__Group_10_3__0 )? ) ;
    public final void rule__Page__Group_10__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1626:1: ( ( ( rule__Page__Group_10_3__0 )? ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1627:1: ( ( rule__Page__Group_10_3__0 )? )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1627:1: ( ( rule__Page__Group_10_3__0 )? )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1628:1: ( rule__Page__Group_10_3__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPageAccess().getGroup_10_3()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1629:1: ( rule__Page__Group_10_3__0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==25) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1629:2: rule__Page__Group_10_3__0
                    {
                    pushFollow(FOLLOW_rule__Page__Group_10_3__0_in_rule__Page__Group_10__3__Impl3208);
                    rule__Page__Group_10_3__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPageAccess().getGroup_10_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__Group_10__3__Impl"


    // $ANTLR start "rule__Page__Group_10__4"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1639:1: rule__Page__Group_10__4 : rule__Page__Group_10__4__Impl ;
    public final void rule__Page__Group_10__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1643:1: ( rule__Page__Group_10__4__Impl )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1644:2: rule__Page__Group_10__4__Impl
            {
            pushFollow(FOLLOW_rule__Page__Group_10__4__Impl_in_rule__Page__Group_10__43239);
            rule__Page__Group_10__4__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__Group_10__4"


    // $ANTLR start "rule__Page__Group_10__4__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1650:1: rule__Page__Group_10__4__Impl : ( '}' ) ;
    public final void rule__Page__Group_10__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1654:1: ( ( '}' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1655:1: ( '}' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1655:1: ( '}' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1656:1: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPageAccess().getRightCurlyBracketKeyword_10_4()); 
            }
            match(input,16,FOLLOW_16_in_rule__Page__Group_10__4__Impl3267); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPageAccess().getRightCurlyBracketKeyword_10_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__Group_10__4__Impl"


    // $ANTLR start "rule__Page__Group_10_2__0"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1679:1: rule__Page__Group_10_2__0 : rule__Page__Group_10_2__0__Impl rule__Page__Group_10_2__1 ;
    public final void rule__Page__Group_10_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1683:1: ( rule__Page__Group_10_2__0__Impl rule__Page__Group_10_2__1 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1684:2: rule__Page__Group_10_2__0__Impl rule__Page__Group_10_2__1
            {
            pushFollow(FOLLOW_rule__Page__Group_10_2__0__Impl_in_rule__Page__Group_10_2__03308);
            rule__Page__Group_10_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Page__Group_10_2__1_in_rule__Page__Group_10_2__03311);
            rule__Page__Group_10_2__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__Group_10_2__0"


    // $ANTLR start "rule__Page__Group_10_2__0__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1691:1: rule__Page__Group_10_2__0__Impl : ( 'image' ) ;
    public final void rule__Page__Group_10_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1695:1: ( ( 'image' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1696:1: ( 'image' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1696:1: ( 'image' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1697:1: 'image'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPageAccess().getImageKeyword_10_2_0()); 
            }
            match(input,25,FOLLOW_25_in_rule__Page__Group_10_2__0__Impl3339); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPageAccess().getImageKeyword_10_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__Group_10_2__0__Impl"


    // $ANTLR start "rule__Page__Group_10_2__1"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1710:1: rule__Page__Group_10_2__1 : rule__Page__Group_10_2__1__Impl rule__Page__Group_10_2__2 ;
    public final void rule__Page__Group_10_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1714:1: ( rule__Page__Group_10_2__1__Impl rule__Page__Group_10_2__2 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1715:2: rule__Page__Group_10_2__1__Impl rule__Page__Group_10_2__2
            {
            pushFollow(FOLLOW_rule__Page__Group_10_2__1__Impl_in_rule__Page__Group_10_2__13370);
            rule__Page__Group_10_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Page__Group_10_2__2_in_rule__Page__Group_10_2__13373);
            rule__Page__Group_10_2__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__Group_10_2__1"


    // $ANTLR start "rule__Page__Group_10_2__1__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1722:1: rule__Page__Group_10_2__1__Impl : ( 'on' ) ;
    public final void rule__Page__Group_10_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1726:1: ( ( 'on' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1727:1: ( 'on' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1727:1: ( 'on' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1728:1: 'on'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPageAccess().getOnKeyword_10_2_1()); 
            }
            match(input,26,FOLLOW_26_in_rule__Page__Group_10_2__1__Impl3401); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPageAccess().getOnKeyword_10_2_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__Group_10_2__1__Impl"


    // $ANTLR start "rule__Page__Group_10_2__2"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1741:1: rule__Page__Group_10_2__2 : rule__Page__Group_10_2__2__Impl rule__Page__Group_10_2__3 ;
    public final void rule__Page__Group_10_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1745:1: ( rule__Page__Group_10_2__2__Impl rule__Page__Group_10_2__3 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1746:2: rule__Page__Group_10_2__2__Impl rule__Page__Group_10_2__3
            {
            pushFollow(FOLLOW_rule__Page__Group_10_2__2__Impl_in_rule__Page__Group_10_2__23432);
            rule__Page__Group_10_2__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Page__Group_10_2__3_in_rule__Page__Group_10_2__23435);
            rule__Page__Group_10_2__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__Group_10_2__2"


    // $ANTLR start "rule__Page__Group_10_2__2__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1753:1: rule__Page__Group_10_2__2__Impl : ( ':' ) ;
    public final void rule__Page__Group_10_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1757:1: ( ( ':' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1758:1: ( ':' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1758:1: ( ':' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1759:1: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPageAccess().getColonKeyword_10_2_2()); 
            }
            match(input,27,FOLLOW_27_in_rule__Page__Group_10_2__2__Impl3463); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPageAccess().getColonKeyword_10_2_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__Group_10_2__2__Impl"


    // $ANTLR start "rule__Page__Group_10_2__3"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1772:1: rule__Page__Group_10_2__3 : rule__Page__Group_10_2__3__Impl ;
    public final void rule__Page__Group_10_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1776:1: ( rule__Page__Group_10_2__3__Impl )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1777:2: rule__Page__Group_10_2__3__Impl
            {
            pushFollow(FOLLOW_rule__Page__Group_10_2__3__Impl_in_rule__Page__Group_10_2__33494);
            rule__Page__Group_10_2__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__Group_10_2__3"


    // $ANTLR start "rule__Page__Group_10_2__3__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1783:1: rule__Page__Group_10_2__3__Impl : ( ( rule__Page__ImagePathOnAssignment_10_2_3 ) ) ;
    public final void rule__Page__Group_10_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1787:1: ( ( ( rule__Page__ImagePathOnAssignment_10_2_3 ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1788:1: ( ( rule__Page__ImagePathOnAssignment_10_2_3 ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1788:1: ( ( rule__Page__ImagePathOnAssignment_10_2_3 ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1789:1: ( rule__Page__ImagePathOnAssignment_10_2_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPageAccess().getImagePathOnAssignment_10_2_3()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1790:1: ( rule__Page__ImagePathOnAssignment_10_2_3 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1790:2: rule__Page__ImagePathOnAssignment_10_2_3
            {
            pushFollow(FOLLOW_rule__Page__ImagePathOnAssignment_10_2_3_in_rule__Page__Group_10_2__3__Impl3521);
            rule__Page__ImagePathOnAssignment_10_2_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPageAccess().getImagePathOnAssignment_10_2_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__Group_10_2__3__Impl"


    // $ANTLR start "rule__Page__Group_10_3__0"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1808:1: rule__Page__Group_10_3__0 : rule__Page__Group_10_3__0__Impl rule__Page__Group_10_3__1 ;
    public final void rule__Page__Group_10_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1812:1: ( rule__Page__Group_10_3__0__Impl rule__Page__Group_10_3__1 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1813:2: rule__Page__Group_10_3__0__Impl rule__Page__Group_10_3__1
            {
            pushFollow(FOLLOW_rule__Page__Group_10_3__0__Impl_in_rule__Page__Group_10_3__03559);
            rule__Page__Group_10_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Page__Group_10_3__1_in_rule__Page__Group_10_3__03562);
            rule__Page__Group_10_3__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__Group_10_3__0"


    // $ANTLR start "rule__Page__Group_10_3__0__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1820:1: rule__Page__Group_10_3__0__Impl : ( 'image' ) ;
    public final void rule__Page__Group_10_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1824:1: ( ( 'image' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1825:1: ( 'image' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1825:1: ( 'image' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1826:1: 'image'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPageAccess().getImageKeyword_10_3_0()); 
            }
            match(input,25,FOLLOW_25_in_rule__Page__Group_10_3__0__Impl3590); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPageAccess().getImageKeyword_10_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__Group_10_3__0__Impl"


    // $ANTLR start "rule__Page__Group_10_3__1"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1839:1: rule__Page__Group_10_3__1 : rule__Page__Group_10_3__1__Impl rule__Page__Group_10_3__2 ;
    public final void rule__Page__Group_10_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1843:1: ( rule__Page__Group_10_3__1__Impl rule__Page__Group_10_3__2 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1844:2: rule__Page__Group_10_3__1__Impl rule__Page__Group_10_3__2
            {
            pushFollow(FOLLOW_rule__Page__Group_10_3__1__Impl_in_rule__Page__Group_10_3__13621);
            rule__Page__Group_10_3__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Page__Group_10_3__2_in_rule__Page__Group_10_3__13624);
            rule__Page__Group_10_3__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__Group_10_3__1"


    // $ANTLR start "rule__Page__Group_10_3__1__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1851:1: rule__Page__Group_10_3__1__Impl : ( 'off' ) ;
    public final void rule__Page__Group_10_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1855:1: ( ( 'off' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1856:1: ( 'off' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1856:1: ( 'off' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1857:1: 'off'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPageAccess().getOffKeyword_10_3_1()); 
            }
            match(input,28,FOLLOW_28_in_rule__Page__Group_10_3__1__Impl3652); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPageAccess().getOffKeyword_10_3_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__Group_10_3__1__Impl"


    // $ANTLR start "rule__Page__Group_10_3__2"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1870:1: rule__Page__Group_10_3__2 : rule__Page__Group_10_3__2__Impl rule__Page__Group_10_3__3 ;
    public final void rule__Page__Group_10_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1874:1: ( rule__Page__Group_10_3__2__Impl rule__Page__Group_10_3__3 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1875:2: rule__Page__Group_10_3__2__Impl rule__Page__Group_10_3__3
            {
            pushFollow(FOLLOW_rule__Page__Group_10_3__2__Impl_in_rule__Page__Group_10_3__23683);
            rule__Page__Group_10_3__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Page__Group_10_3__3_in_rule__Page__Group_10_3__23686);
            rule__Page__Group_10_3__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__Group_10_3__2"


    // $ANTLR start "rule__Page__Group_10_3__2__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1882:1: rule__Page__Group_10_3__2__Impl : ( ':' ) ;
    public final void rule__Page__Group_10_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1886:1: ( ( ':' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1887:1: ( ':' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1887:1: ( ':' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1888:1: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPageAccess().getColonKeyword_10_3_2()); 
            }
            match(input,27,FOLLOW_27_in_rule__Page__Group_10_3__2__Impl3714); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPageAccess().getColonKeyword_10_3_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__Group_10_3__2__Impl"


    // $ANTLR start "rule__Page__Group_10_3__3"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1901:1: rule__Page__Group_10_3__3 : rule__Page__Group_10_3__3__Impl ;
    public final void rule__Page__Group_10_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1905:1: ( rule__Page__Group_10_3__3__Impl )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1906:2: rule__Page__Group_10_3__3__Impl
            {
            pushFollow(FOLLOW_rule__Page__Group_10_3__3__Impl_in_rule__Page__Group_10_3__33745);
            rule__Page__Group_10_3__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__Group_10_3__3"


    // $ANTLR start "rule__Page__Group_10_3__3__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1912:1: rule__Page__Group_10_3__3__Impl : ( ( rule__Page__ImagePathOffAssignment_10_3_3 ) ) ;
    public final void rule__Page__Group_10_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1916:1: ( ( ( rule__Page__ImagePathOffAssignment_10_3_3 ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1917:1: ( ( rule__Page__ImagePathOffAssignment_10_3_3 ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1917:1: ( ( rule__Page__ImagePathOffAssignment_10_3_3 ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1918:1: ( rule__Page__ImagePathOffAssignment_10_3_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPageAccess().getImagePathOffAssignment_10_3_3()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1919:1: ( rule__Page__ImagePathOffAssignment_10_3_3 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1919:2: rule__Page__ImagePathOffAssignment_10_3_3
            {
            pushFollow(FOLLOW_rule__Page__ImagePathOffAssignment_10_3_3_in_rule__Page__Group_10_3__3__Impl3772);
            rule__Page__ImagePathOffAssignment_10_3_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPageAccess().getImagePathOffAssignment_10_3_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__Group_10_3__3__Impl"


    // $ANTLR start "rule__Page__Group_11__0"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1937:1: rule__Page__Group_11__0 : rule__Page__Group_11__0__Impl rule__Page__Group_11__1 ;
    public final void rule__Page__Group_11__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1941:1: ( rule__Page__Group_11__0__Impl rule__Page__Group_11__1 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1942:2: rule__Page__Group_11__0__Impl rule__Page__Group_11__1
            {
            pushFollow(FOLLOW_rule__Page__Group_11__0__Impl_in_rule__Page__Group_11__03810);
            rule__Page__Group_11__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Page__Group_11__1_in_rule__Page__Group_11__03813);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1949:1: rule__Page__Group_11__0__Impl : ( 'tab' ) ;
    public final void rule__Page__Group_11__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1953:1: ( ( 'tab' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1954:1: ( 'tab' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1954:1: ( 'tab' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1955:1: 'tab'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPageAccess().getTabKeyword_11_0()); 
            }
            match(input,29,FOLLOW_29_in_rule__Page__Group_11__0__Impl3841); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPageAccess().getTabKeyword_11_0()); 
            }

            }


            }

        }
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1968:1: rule__Page__Group_11__1 : rule__Page__Group_11__1__Impl rule__Page__Group_11__2 ;
    public final void rule__Page__Group_11__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1972:1: ( rule__Page__Group_11__1__Impl rule__Page__Group_11__2 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1973:2: rule__Page__Group_11__1__Impl rule__Page__Group_11__2
            {
            pushFollow(FOLLOW_rule__Page__Group_11__1__Impl_in_rule__Page__Group_11__13872);
            rule__Page__Group_11__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Page__Group_11__2_in_rule__Page__Group_11__13875);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1980:1: rule__Page__Group_11__1__Impl : ( 'name' ) ;
    public final void rule__Page__Group_11__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1984:1: ( ( 'name' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1985:1: ( 'name' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1985:1: ( 'name' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1986:1: 'name'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPageAccess().getNameKeyword_11_1()); 
            }
            match(input,30,FOLLOW_30_in_rule__Page__Group_11__1__Impl3903); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPageAccess().getNameKeyword_11_1()); 
            }

            }


            }

        }
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1999:1: rule__Page__Group_11__2 : rule__Page__Group_11__2__Impl ;
    public final void rule__Page__Group_11__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2003:1: ( rule__Page__Group_11__2__Impl )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2004:2: rule__Page__Group_11__2__Impl
            {
            pushFollow(FOLLOW_rule__Page__Group_11__2__Impl_in_rule__Page__Group_11__23934);
            rule__Page__Group_11__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2010:1: rule__Page__Group_11__2__Impl : ( ( rule__Page__TabNameAssignment_11_2 ) ) ;
    public final void rule__Page__Group_11__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2014:1: ( ( ( rule__Page__TabNameAssignment_11_2 ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2015:1: ( ( rule__Page__TabNameAssignment_11_2 ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2015:1: ( ( rule__Page__TabNameAssignment_11_2 ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2016:1: ( rule__Page__TabNameAssignment_11_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPageAccess().getTabNameAssignment_11_2()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2017:1: ( rule__Page__TabNameAssignment_11_2 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2017:2: rule__Page__TabNameAssignment_11_2
            {
            pushFollow(FOLLOW_rule__Page__TabNameAssignment_11_2_in_rule__Page__Group_11__2__Impl3961);
            rule__Page__TabNameAssignment_11_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPageAccess().getTabNameAssignment_11_2()); 
            }

            }


            }

        }
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


    // $ANTLR start "rule__Page__Group_12__0"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2033:1: rule__Page__Group_12__0 : rule__Page__Group_12__0__Impl rule__Page__Group_12__1 ;
    public final void rule__Page__Group_12__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2037:1: ( rule__Page__Group_12__0__Impl rule__Page__Group_12__1 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2038:2: rule__Page__Group_12__0__Impl rule__Page__Group_12__1
            {
            pushFollow(FOLLOW_rule__Page__Group_12__0__Impl_in_rule__Page__Group_12__03997);
            rule__Page__Group_12__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Page__Group_12__1_in_rule__Page__Group_12__04000);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2045:1: rule__Page__Group_12__0__Impl : ( 'predicated' ) ;
    public final void rule__Page__Group_12__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2049:1: ( ( 'predicated' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2050:1: ( 'predicated' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2050:1: ( 'predicated' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2051:1: 'predicated'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPageAccess().getPredicatedKeyword_12_0()); 
            }
            match(input,31,FOLLOW_31_in_rule__Page__Group_12__0__Impl4028); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPageAccess().getPredicatedKeyword_12_0()); 
            }

            }


            }

        }
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2064:1: rule__Page__Group_12__1 : rule__Page__Group_12__1__Impl rule__Page__Group_12__2 ;
    public final void rule__Page__Group_12__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2068:1: ( rule__Page__Group_12__1__Impl rule__Page__Group_12__2 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2069:2: rule__Page__Group_12__1__Impl rule__Page__Group_12__2
            {
            pushFollow(FOLLOW_rule__Page__Group_12__1__Impl_in_rule__Page__Group_12__14059);
            rule__Page__Group_12__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Page__Group_12__2_in_rule__Page__Group_12__14062);
            rule__Page__Group_12__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2076:1: rule__Page__Group_12__1__Impl : ( ':' ) ;
    public final void rule__Page__Group_12__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2080:1: ( ( ':' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2081:1: ( ':' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2081:1: ( ':' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2082:1: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPageAccess().getColonKeyword_12_1()); 
            }
            match(input,27,FOLLOW_27_in_rule__Page__Group_12__1__Impl4090); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPageAccess().getColonKeyword_12_1()); 
            }

            }


            }

        }
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


    // $ANTLR start "rule__Page__Group_12__2"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2095:1: rule__Page__Group_12__2 : rule__Page__Group_12__2__Impl ;
    public final void rule__Page__Group_12__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2099:1: ( rule__Page__Group_12__2__Impl )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2100:2: rule__Page__Group_12__2__Impl
            {
            pushFollow(FOLLOW_rule__Page__Group_12__2__Impl_in_rule__Page__Group_12__24121);
            rule__Page__Group_12__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__Group_12__2"


    // $ANTLR start "rule__Page__Group_12__2__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2106:1: rule__Page__Group_12__2__Impl : ( ( rule__Page__HasPredicateAssignment_12_2 ) ) ;
    public final void rule__Page__Group_12__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2110:1: ( ( ( rule__Page__HasPredicateAssignment_12_2 ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2111:1: ( ( rule__Page__HasPredicateAssignment_12_2 ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2111:1: ( ( rule__Page__HasPredicateAssignment_12_2 ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2112:1: ( rule__Page__HasPredicateAssignment_12_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPageAccess().getHasPredicateAssignment_12_2()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2113:1: ( rule__Page__HasPredicateAssignment_12_2 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2113:2: rule__Page__HasPredicateAssignment_12_2
            {
            pushFollow(FOLLOW_rule__Page__HasPredicateAssignment_12_2_in_rule__Page__Group_12__2__Impl4148);
            rule__Page__HasPredicateAssignment_12_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPageAccess().getHasPredicateAssignment_12_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__Group_12__2__Impl"


    // $ANTLR start "rule__Page__Group_13__0"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2129:1: rule__Page__Group_13__0 : rule__Page__Group_13__0__Impl rule__Page__Group_13__1 ;
    public final void rule__Page__Group_13__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2133:1: ( rule__Page__Group_13__0__Impl rule__Page__Group_13__1 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2134:2: rule__Page__Group_13__0__Impl rule__Page__Group_13__1
            {
            pushFollow(FOLLOW_rule__Page__Group_13__0__Impl_in_rule__Page__Group_13__04184);
            rule__Page__Group_13__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Page__Group_13__1_in_rule__Page__Group_13__04187);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2141:1: rule__Page__Group_13__0__Impl : ( 'show' ) ;
    public final void rule__Page__Group_13__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2145:1: ( ( 'show' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2146:1: ( 'show' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2146:1: ( 'show' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2147:1: 'show'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPageAccess().getShowKeyword_13_0()); 
            }
            match(input,32,FOLLOW_32_in_rule__Page__Group_13__0__Impl4215); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPageAccess().getShowKeyword_13_0()); 
            }

            }


            }

        }
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2160:1: rule__Page__Group_13__1 : rule__Page__Group_13__1__Impl rule__Page__Group_13__2 ;
    public final void rule__Page__Group_13__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2164:1: ( rule__Page__Group_13__1__Impl rule__Page__Group_13__2 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2165:2: rule__Page__Group_13__1__Impl rule__Page__Group_13__2
            {
            pushFollow(FOLLOW_rule__Page__Group_13__1__Impl_in_rule__Page__Group_13__14246);
            rule__Page__Group_13__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Page__Group_13__2_in_rule__Page__Group_13__14249);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2172:1: rule__Page__Group_13__1__Impl : ( 'viewer' ) ;
    public final void rule__Page__Group_13__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2176:1: ( ( 'viewer' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2177:1: ( 'viewer' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2177:1: ( 'viewer' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2178:1: 'viewer'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPageAccess().getViewerKeyword_13_1()); 
            }
            match(input,33,FOLLOW_33_in_rule__Page__Group_13__1__Impl4277); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPageAccess().getViewerKeyword_13_1()); 
            }

            }


            }

        }
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2191:1: rule__Page__Group_13__2 : rule__Page__Group_13__2__Impl rule__Page__Group_13__3 ;
    public final void rule__Page__Group_13__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2195:1: ( rule__Page__Group_13__2__Impl rule__Page__Group_13__3 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2196:2: rule__Page__Group_13__2__Impl rule__Page__Group_13__3
            {
            pushFollow(FOLLOW_rule__Page__Group_13__2__Impl_in_rule__Page__Group_13__24308);
            rule__Page__Group_13__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Page__Group_13__3_in_rule__Page__Group_13__24311);
            rule__Page__Group_13__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2203:1: rule__Page__Group_13__2__Impl : ( ':' ) ;
    public final void rule__Page__Group_13__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2207:1: ( ( ':' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2208:1: ( ':' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2208:1: ( ':' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2209:1: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPageAccess().getColonKeyword_13_2()); 
            }
            match(input,27,FOLLOW_27_in_rule__Page__Group_13__2__Impl4339); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPageAccess().getColonKeyword_13_2()); 
            }

            }


            }

        }
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


    // $ANTLR start "rule__Page__Group_13__3"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2222:1: rule__Page__Group_13__3 : rule__Page__Group_13__3__Impl ;
    public final void rule__Page__Group_13__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2226:1: ( rule__Page__Group_13__3__Impl )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2227:2: rule__Page__Group_13__3__Impl
            {
            pushFollow(FOLLOW_rule__Page__Group_13__3__Impl_in_rule__Page__Group_13__34370);
            rule__Page__Group_13__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__Group_13__3"


    // $ANTLR start "rule__Page__Group_13__3__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2233:1: rule__Page__Group_13__3__Impl : ( ( rule__Page__ShowViewerAssignment_13_3 ) ) ;
    public final void rule__Page__Group_13__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2237:1: ( ( ( rule__Page__ShowViewerAssignment_13_3 ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2238:1: ( ( rule__Page__ShowViewerAssignment_13_3 ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2238:1: ( ( rule__Page__ShowViewerAssignment_13_3 ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2239:1: ( rule__Page__ShowViewerAssignment_13_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPageAccess().getShowViewerAssignment_13_3()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2240:1: ( rule__Page__ShowViewerAssignment_13_3 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2240:2: rule__Page__ShowViewerAssignment_13_3
            {
            pushFollow(FOLLOW_rule__Page__ShowViewerAssignment_13_3_in_rule__Page__Group_13__3__Impl4397);
            rule__Page__ShowViewerAssignment_13_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPageAccess().getShowViewerAssignment_13_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__Group_13__3__Impl"


    // $ANTLR start "rule__Page__Group_14__0"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2258:1: rule__Page__Group_14__0 : rule__Page__Group_14__0__Impl rule__Page__Group_14__1 ;
    public final void rule__Page__Group_14__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2262:1: ( rule__Page__Group_14__0__Impl rule__Page__Group_14__1 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2263:2: rule__Page__Group_14__0__Impl rule__Page__Group_14__1
            {
            pushFollow(FOLLOW_rule__Page__Group_14__0__Impl_in_rule__Page__Group_14__04435);
            rule__Page__Group_14__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Page__Group_14__1_in_rule__Page__Group_14__04438);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2270:1: rule__Page__Group_14__0__Impl : ( 'sections' ) ;
    public final void rule__Page__Group_14__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2274:1: ( ( 'sections' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2275:1: ( 'sections' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2275:1: ( 'sections' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2276:1: 'sections'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPageAccess().getSectionsKeyword_14_0()); 
            }
            match(input,34,FOLLOW_34_in_rule__Page__Group_14__0__Impl4466); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPageAccess().getSectionsKeyword_14_0()); 
            }

            }


            }

        }
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2289:1: rule__Page__Group_14__1 : rule__Page__Group_14__1__Impl rule__Page__Group_14__2 ;
    public final void rule__Page__Group_14__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2293:1: ( rule__Page__Group_14__1__Impl rule__Page__Group_14__2 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2294:2: rule__Page__Group_14__1__Impl rule__Page__Group_14__2
            {
            pushFollow(FOLLOW_rule__Page__Group_14__1__Impl_in_rule__Page__Group_14__14497);
            rule__Page__Group_14__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Page__Group_14__2_in_rule__Page__Group_14__14500);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2301:1: rule__Page__Group_14__1__Impl : ( '{' ) ;
    public final void rule__Page__Group_14__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2305:1: ( ( '{' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2306:1: ( '{' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2306:1: ( '{' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2307:1: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPageAccess().getLeftCurlyBracketKeyword_14_1()); 
            }
            match(input,15,FOLLOW_15_in_rule__Page__Group_14__1__Impl4528); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPageAccess().getLeftCurlyBracketKeyword_14_1()); 
            }

            }


            }

        }
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2320:1: rule__Page__Group_14__2 : rule__Page__Group_14__2__Impl rule__Page__Group_14__3 ;
    public final void rule__Page__Group_14__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2324:1: ( rule__Page__Group_14__2__Impl rule__Page__Group_14__3 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2325:2: rule__Page__Group_14__2__Impl rule__Page__Group_14__3
            {
            pushFollow(FOLLOW_rule__Page__Group_14__2__Impl_in_rule__Page__Group_14__24559);
            rule__Page__Group_14__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Page__Group_14__3_in_rule__Page__Group_14__24562);
            rule__Page__Group_14__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2332:1: rule__Page__Group_14__2__Impl : ( ( rule__Page__OwnedSectionsAssignment_14_2 )* ) ;
    public final void rule__Page__Group_14__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2336:1: ( ( ( rule__Page__OwnedSectionsAssignment_14_2 )* ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2337:1: ( ( rule__Page__OwnedSectionsAssignment_14_2 )* )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2337:1: ( ( rule__Page__OwnedSectionsAssignment_14_2 )* )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2338:1: ( rule__Page__OwnedSectionsAssignment_14_2 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPageAccess().getOwnedSectionsAssignment_14_2()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2339:1: ( rule__Page__OwnedSectionsAssignment_14_2 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==35) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2339:2: rule__Page__OwnedSectionsAssignment_14_2
            	    {
            	    pushFollow(FOLLOW_rule__Page__OwnedSectionsAssignment_14_2_in_rule__Page__Group_14__2__Impl4589);
            	    rule__Page__OwnedSectionsAssignment_14_2();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPageAccess().getOwnedSectionsAssignment_14_2()); 
            }

            }


            }

        }
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


    // $ANTLR start "rule__Page__Group_14__3"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2349:1: rule__Page__Group_14__3 : rule__Page__Group_14__3__Impl ;
    public final void rule__Page__Group_14__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2353:1: ( rule__Page__Group_14__3__Impl )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2354:2: rule__Page__Group_14__3__Impl
            {
            pushFollow(FOLLOW_rule__Page__Group_14__3__Impl_in_rule__Page__Group_14__34620);
            rule__Page__Group_14__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__Group_14__3"


    // $ANTLR start "rule__Page__Group_14__3__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2360:1: rule__Page__Group_14__3__Impl : ( '}' ) ;
    public final void rule__Page__Group_14__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2364:1: ( ( '}' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2365:1: ( '}' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2365:1: ( '}' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2366:1: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPageAccess().getRightCurlyBracketKeyword_14_3()); 
            }
            match(input,16,FOLLOW_16_in_rule__Page__Group_14__3__Impl4648); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPageAccess().getRightCurlyBracketKeyword_14_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__Group_14__3__Impl"


    // $ANTLR start "rule__Section__Group__0"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2387:1: rule__Section__Group__0 : rule__Section__Group__0__Impl rule__Section__Group__1 ;
    public final void rule__Section__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2391:1: ( rule__Section__Group__0__Impl rule__Section__Group__1 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2392:2: rule__Section__Group__0__Impl rule__Section__Group__1
            {
            pushFollow(FOLLOW_rule__Section__Group__0__Impl_in_rule__Section__Group__04687);
            rule__Section__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Section__Group__1_in_rule__Section__Group__04690);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2399:1: rule__Section__Group__0__Impl : ( () ) ;
    public final void rule__Section__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2403:1: ( ( () ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2404:1: ( () )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2404:1: ( () )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2405:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSectionAccess().getSectionAction_0()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2406:1: ()
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2408:1: 
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2418:1: rule__Section__Group__1 : rule__Section__Group__1__Impl rule__Section__Group__2 ;
    public final void rule__Section__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2422:1: ( rule__Section__Group__1__Impl rule__Section__Group__2 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2423:2: rule__Section__Group__1__Impl rule__Section__Group__2
            {
            pushFollow(FOLLOW_rule__Section__Group__1__Impl_in_rule__Section__Group__14748);
            rule__Section__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Section__Group__2_in_rule__Section__Group__14751);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2430:1: rule__Section__Group__1__Impl : ( 'section' ) ;
    public final void rule__Section__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2434:1: ( ( 'section' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2435:1: ( 'section' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2435:1: ( 'section' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2436:1: 'section'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSectionAccess().getSectionKeyword_1()); 
            }
            match(input,35,FOLLOW_35_in_rule__Section__Group__1__Impl4779); if (state.failed) return ;
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2449:1: rule__Section__Group__2 : rule__Section__Group__2__Impl rule__Section__Group__3 ;
    public final void rule__Section__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2453:1: ( rule__Section__Group__2__Impl rule__Section__Group__3 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2454:2: rule__Section__Group__2__Impl rule__Section__Group__3
            {
            pushFollow(FOLLOW_rule__Section__Group__2__Impl_in_rule__Section__Group__24810);
            rule__Section__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Section__Group__3_in_rule__Section__Group__24813);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2461:1: rule__Section__Group__2__Impl : ( ( rule__Section__NameAssignment_2 ) ) ;
    public final void rule__Section__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2465:1: ( ( ( rule__Section__NameAssignment_2 ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2466:1: ( ( rule__Section__NameAssignment_2 ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2466:1: ( ( rule__Section__NameAssignment_2 ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2467:1: ( rule__Section__NameAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSectionAccess().getNameAssignment_2()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2468:1: ( rule__Section__NameAssignment_2 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2468:2: rule__Section__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__Section__NameAssignment_2_in_rule__Section__Group__2__Impl4840);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2478:1: rule__Section__Group__3 : rule__Section__Group__3__Impl rule__Section__Group__4 ;
    public final void rule__Section__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2482:1: ( rule__Section__Group__3__Impl rule__Section__Group__4 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2483:2: rule__Section__Group__3__Impl rule__Section__Group__4
            {
            pushFollow(FOLLOW_rule__Section__Group__3__Impl_in_rule__Section__Group__34870);
            rule__Section__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Section__Group__4_in_rule__Section__Group__34873);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2490:1: rule__Section__Group__3__Impl : ( '{' ) ;
    public final void rule__Section__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2494:1: ( ( '{' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2495:1: ( '{' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2495:1: ( '{' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2496:1: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSectionAccess().getLeftCurlyBracketKeyword_3()); 
            }
            match(input,15,FOLLOW_15_in_rule__Section__Group__3__Impl4901); if (state.failed) return ;
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2509:1: rule__Section__Group__4 : rule__Section__Group__4__Impl rule__Section__Group__5 ;
    public final void rule__Section__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2513:1: ( rule__Section__Group__4__Impl rule__Section__Group__5 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2514:2: rule__Section__Group__4__Impl rule__Section__Group__5
            {
            pushFollow(FOLLOW_rule__Section__Group__4__Impl_in_rule__Section__Group__44932);
            rule__Section__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Section__Group__5_in_rule__Section__Group__44935);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2521:1: rule__Section__Group__4__Impl : ( ( rule__Section__Group_4__0 )? ) ;
    public final void rule__Section__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2525:1: ( ( ( rule__Section__Group_4__0 )? ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2526:1: ( ( rule__Section__Group_4__0 )? )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2526:1: ( ( rule__Section__Group_4__0 )? )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2527:1: ( rule__Section__Group_4__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSectionAccess().getGroup_4()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2528:1: ( rule__Section__Group_4__0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==20) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2528:2: rule__Section__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__Section__Group_4__0_in_rule__Section__Group__4__Impl4962);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2538:1: rule__Section__Group__5 : rule__Section__Group__5__Impl rule__Section__Group__6 ;
    public final void rule__Section__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2542:1: ( rule__Section__Group__5__Impl rule__Section__Group__6 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2543:2: rule__Section__Group__5__Impl rule__Section__Group__6
            {
            pushFollow(FOLLOW_rule__Section__Group__5__Impl_in_rule__Section__Group__54993);
            rule__Section__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Section__Group__6_in_rule__Section__Group__54996);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2550:1: rule__Section__Group__5__Impl : ( ( rule__Section__Group_5__0 )? ) ;
    public final void rule__Section__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2554:1: ( ( ( rule__Section__Group_5__0 )? ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2555:1: ( ( rule__Section__Group_5__0 )? )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2555:1: ( ( rule__Section__Group_5__0 )? )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2556:1: ( rule__Section__Group_5__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSectionAccess().getGroup_5()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2557:1: ( rule__Section__Group_5__0 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==23) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2557:2: rule__Section__Group_5__0
                    {
                    pushFollow(FOLLOW_rule__Section__Group_5__0_in_rule__Section__Group__5__Impl5023);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2567:1: rule__Section__Group__6 : rule__Section__Group__6__Impl rule__Section__Group__7 ;
    public final void rule__Section__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2571:1: ( rule__Section__Group__6__Impl rule__Section__Group__7 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2572:2: rule__Section__Group__6__Impl rule__Section__Group__7
            {
            pushFollow(FOLLOW_rule__Section__Group__6__Impl_in_rule__Section__Group__65054);
            rule__Section__Group__6__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Section__Group__7_in_rule__Section__Group__65057);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2579:1: rule__Section__Group__6__Impl : ( 'index' ) ;
    public final void rule__Section__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2583:1: ( ( 'index' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2584:1: ( 'index' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2584:1: ( 'index' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2585:1: 'index'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSectionAccess().getIndexKeyword_6()); 
            }
            match(input,19,FOLLOW_19_in_rule__Section__Group__6__Impl5085); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSectionAccess().getIndexKeyword_6()); 
            }

            }


            }

        }
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2598:1: rule__Section__Group__7 : rule__Section__Group__7__Impl rule__Section__Group__8 ;
    public final void rule__Section__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2602:1: ( rule__Section__Group__7__Impl rule__Section__Group__8 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2603:2: rule__Section__Group__7__Impl rule__Section__Group__8
            {
            pushFollow(FOLLOW_rule__Section__Group__7__Impl_in_rule__Section__Group__75116);
            rule__Section__Group__7__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Section__Group__8_in_rule__Section__Group__75119);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2610:1: rule__Section__Group__7__Impl : ( ( rule__Section__IndexAssignment_7 ) ) ;
    public final void rule__Section__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2614:1: ( ( ( rule__Section__IndexAssignment_7 ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2615:1: ( ( rule__Section__IndexAssignment_7 ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2615:1: ( ( rule__Section__IndexAssignment_7 ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2616:1: ( rule__Section__IndexAssignment_7 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSectionAccess().getIndexAssignment_7()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2617:1: ( rule__Section__IndexAssignment_7 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2617:2: rule__Section__IndexAssignment_7
            {
            pushFollow(FOLLOW_rule__Section__IndexAssignment_7_in_rule__Section__Group__7__Impl5146);
            rule__Section__IndexAssignment_7();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSectionAccess().getIndexAssignment_7()); 
            }

            }


            }

        }
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2627:1: rule__Section__Group__8 : rule__Section__Group__8__Impl rule__Section__Group__9 ;
    public final void rule__Section__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2631:1: ( rule__Section__Group__8__Impl rule__Section__Group__9 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2632:2: rule__Section__Group__8__Impl rule__Section__Group__9
            {
            pushFollow(FOLLOW_rule__Section__Group__8__Impl_in_rule__Section__Group__85176);
            rule__Section__Group__8__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Section__Group__9_in_rule__Section__Group__85179);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2639:1: rule__Section__Group__8__Impl : ( ( rule__Section__Group_8__0 )? ) ;
    public final void rule__Section__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2643:1: ( ( ( rule__Section__Group_8__0 )? ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2644:1: ( ( rule__Section__Group_8__0 )? )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2644:1: ( ( rule__Section__Group_8__0 )? )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2645:1: ( rule__Section__Group_8__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSectionAccess().getGroup_8()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2646:1: ( rule__Section__Group_8__0 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==36) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2646:2: rule__Section__Group_8__0
                    {
                    pushFollow(FOLLOW_rule__Section__Group_8__0_in_rule__Section__Group__8__Impl5206);
                    rule__Section__Group_8__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSectionAccess().getGroup_8()); 
            }

            }


            }

        }
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2656:1: rule__Section__Group__9 : rule__Section__Group__9__Impl rule__Section__Group__10 ;
    public final void rule__Section__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2660:1: ( rule__Section__Group__9__Impl rule__Section__Group__10 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2661:2: rule__Section__Group__9__Impl rule__Section__Group__10
            {
            pushFollow(FOLLOW_rule__Section__Group__9__Impl_in_rule__Section__Group__95237);
            rule__Section__Group__9__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Section__Group__10_in_rule__Section__Group__95240);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2668:1: rule__Section__Group__9__Impl : ( ( rule__Section__Group_9__0 )? ) ;
    public final void rule__Section__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2672:1: ( ( ( rule__Section__Group_9__0 )? ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2673:1: ( ( rule__Section__Group_9__0 )? )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2673:1: ( ( rule__Section__Group_9__0 )? )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2674:1: ( rule__Section__Group_9__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSectionAccess().getGroup_9()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2675:1: ( rule__Section__Group_9__0 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==37) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2675:2: rule__Section__Group_9__0
                    {
                    pushFollow(FOLLOW_rule__Section__Group_9__0_in_rule__Section__Group__9__Impl5267);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2685:1: rule__Section__Group__10 : rule__Section__Group__10__Impl rule__Section__Group__11 ;
    public final void rule__Section__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2689:1: ( rule__Section__Group__10__Impl rule__Section__Group__11 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2690:2: rule__Section__Group__10__Impl rule__Section__Group__11
            {
            pushFollow(FOLLOW_rule__Section__Group__10__Impl_in_rule__Section__Group__105298);
            rule__Section__Group__10__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Section__Group__11_in_rule__Section__Group__105301);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2697:1: rule__Section__Group__10__Impl : ( ( rule__Section__Group_10__0 )? ) ;
    public final void rule__Section__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2701:1: ( ( ( rule__Section__Group_10__0 )? ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2702:1: ( ( rule__Section__Group_10__0 )? )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2702:1: ( ( rule__Section__Group_10__0 )? )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2703:1: ( rule__Section__Group_10__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSectionAccess().getGroup_10()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2704:1: ( rule__Section__Group_10__0 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==38) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2704:2: rule__Section__Group_10__0
                    {
                    pushFollow(FOLLOW_rule__Section__Group_10__0_in_rule__Section__Group__10__Impl5328);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2714:1: rule__Section__Group__11 : rule__Section__Group__11__Impl ;
    public final void rule__Section__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2718:1: ( rule__Section__Group__11__Impl )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2719:2: rule__Section__Group__11__Impl
            {
            pushFollow(FOLLOW_rule__Section__Group__11__Impl_in_rule__Section__Group__115359);
            rule__Section__Group__11__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2725:1: rule__Section__Group__11__Impl : ( '}' ) ;
    public final void rule__Section__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2729:1: ( ( '}' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2730:1: ( '}' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2730:1: ( '}' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2731:1: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSectionAccess().getRightCurlyBracketKeyword_11()); 
            }
            match(input,16,FOLLOW_16_in_rule__Section__Group__11__Impl5387); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSectionAccess().getRightCurlyBracketKeyword_11()); 
            }

            }


            }

        }
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


    // $ANTLR start "rule__Section__Group_4__0"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2768:1: rule__Section__Group_4__0 : rule__Section__Group_4__0__Impl rule__Section__Group_4__1 ;
    public final void rule__Section__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2772:1: ( rule__Section__Group_4__0__Impl rule__Section__Group_4__1 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2773:2: rule__Section__Group_4__0__Impl rule__Section__Group_4__1
            {
            pushFollow(FOLLOW_rule__Section__Group_4__0__Impl_in_rule__Section__Group_4__05442);
            rule__Section__Group_4__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Section__Group_4__1_in_rule__Section__Group_4__05445);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2780:1: rule__Section__Group_4__0__Impl : ( 'description' ) ;
    public final void rule__Section__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2784:1: ( ( 'description' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2785:1: ( 'description' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2785:1: ( 'description' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2786:1: 'description'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSectionAccess().getDescriptionKeyword_4_0()); 
            }
            match(input,20,FOLLOW_20_in_rule__Section__Group_4__0__Impl5473); if (state.failed) return ;
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2799:1: rule__Section__Group_4__1 : rule__Section__Group_4__1__Impl ;
    public final void rule__Section__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2803:1: ( rule__Section__Group_4__1__Impl )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2804:2: rule__Section__Group_4__1__Impl
            {
            pushFollow(FOLLOW_rule__Section__Group_4__1__Impl_in_rule__Section__Group_4__15504);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2810:1: rule__Section__Group_4__1__Impl : ( ( rule__Section__DescriptionAssignment_4_1 ) ) ;
    public final void rule__Section__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2814:1: ( ( ( rule__Section__DescriptionAssignment_4_1 ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2815:1: ( ( rule__Section__DescriptionAssignment_4_1 ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2815:1: ( ( rule__Section__DescriptionAssignment_4_1 ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2816:1: ( rule__Section__DescriptionAssignment_4_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSectionAccess().getDescriptionAssignment_4_1()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2817:1: ( rule__Section__DescriptionAssignment_4_1 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2817:2: rule__Section__DescriptionAssignment_4_1
            {
            pushFollow(FOLLOW_rule__Section__DescriptionAssignment_4_1_in_rule__Section__Group_4__1__Impl5531);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2831:1: rule__Section__Group_5__0 : rule__Section__Group_5__0__Impl rule__Section__Group_5__1 ;
    public final void rule__Section__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2835:1: ( rule__Section__Group_5__0__Impl rule__Section__Group_5__1 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2836:2: rule__Section__Group_5__0__Impl rule__Section__Group_5__1
            {
            pushFollow(FOLLOW_rule__Section__Group_5__0__Impl_in_rule__Section__Group_5__05565);
            rule__Section__Group_5__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Section__Group_5__1_in_rule__Section__Group_5__05568);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2843:1: rule__Section__Group_5__0__Impl : ( 'id' ) ;
    public final void rule__Section__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2847:1: ( ( 'id' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2848:1: ( 'id' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2848:1: ( 'id' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2849:1: 'id'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSectionAccess().getIdKeyword_5_0()); 
            }
            match(input,23,FOLLOW_23_in_rule__Section__Group_5__0__Impl5596); if (state.failed) return ;
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2862:1: rule__Section__Group_5__1 : rule__Section__Group_5__1__Impl ;
    public final void rule__Section__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2866:1: ( rule__Section__Group_5__1__Impl )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2867:2: rule__Section__Group_5__1__Impl
            {
            pushFollow(FOLLOW_rule__Section__Group_5__1__Impl_in_rule__Section__Group_5__15627);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2873:1: rule__Section__Group_5__1__Impl : ( ( rule__Section__ActivityExplorerItemIDAssignment_5_1 ) ) ;
    public final void rule__Section__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2877:1: ( ( ( rule__Section__ActivityExplorerItemIDAssignment_5_1 ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2878:1: ( ( rule__Section__ActivityExplorerItemIDAssignment_5_1 ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2878:1: ( ( rule__Section__ActivityExplorerItemIDAssignment_5_1 ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2879:1: ( rule__Section__ActivityExplorerItemIDAssignment_5_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSectionAccess().getActivityExplorerItemIDAssignment_5_1()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2880:1: ( rule__Section__ActivityExplorerItemIDAssignment_5_1 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2880:2: rule__Section__ActivityExplorerItemIDAssignment_5_1
            {
            pushFollow(FOLLOW_rule__Section__ActivityExplorerItemIDAssignment_5_1_in_rule__Section__Group_5__1__Impl5654);
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


    // $ANTLR start "rule__Section__Group_8__0"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2894:1: rule__Section__Group_8__0 : rule__Section__Group_8__0__Impl rule__Section__Group_8__1 ;
    public final void rule__Section__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2898:1: ( rule__Section__Group_8__0__Impl rule__Section__Group_8__1 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2899:2: rule__Section__Group_8__0__Impl rule__Section__Group_8__1
            {
            pushFollow(FOLLOW_rule__Section__Group_8__0__Impl_in_rule__Section__Group_8__05688);
            rule__Section__Group_8__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Section__Group_8__1_in_rule__Section__Group_8__05691);
            rule__Section__Group_8__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Section__Group_8__0"


    // $ANTLR start "rule__Section__Group_8__0__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2906:1: rule__Section__Group_8__0__Impl : ( 'filtering' ) ;
    public final void rule__Section__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2910:1: ( ( 'filtering' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2911:1: ( 'filtering' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2911:1: ( 'filtering' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2912:1: 'filtering'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSectionAccess().getFilteringKeyword_8_0()); 
            }
            match(input,36,FOLLOW_36_in_rule__Section__Group_8__0__Impl5719); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSectionAccess().getFilteringKeyword_8_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Section__Group_8__0__Impl"


    // $ANTLR start "rule__Section__Group_8__1"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2925:1: rule__Section__Group_8__1 : rule__Section__Group_8__1__Impl rule__Section__Group_8__2 ;
    public final void rule__Section__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2929:1: ( rule__Section__Group_8__1__Impl rule__Section__Group_8__2 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2930:2: rule__Section__Group_8__1__Impl rule__Section__Group_8__2
            {
            pushFollow(FOLLOW_rule__Section__Group_8__1__Impl_in_rule__Section__Group_8__15750);
            rule__Section__Group_8__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Section__Group_8__2_in_rule__Section__Group_8__15753);
            rule__Section__Group_8__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Section__Group_8__1"


    // $ANTLR start "rule__Section__Group_8__1__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2937:1: rule__Section__Group_8__1__Impl : ( ':' ) ;
    public final void rule__Section__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2941:1: ( ( ':' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2942:1: ( ':' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2942:1: ( ':' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2943:1: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSectionAccess().getColonKeyword_8_1()); 
            }
            match(input,27,FOLLOW_27_in_rule__Section__Group_8__1__Impl5781); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSectionAccess().getColonKeyword_8_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Section__Group_8__1__Impl"


    // $ANTLR start "rule__Section__Group_8__2"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2956:1: rule__Section__Group_8__2 : rule__Section__Group_8__2__Impl ;
    public final void rule__Section__Group_8__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2960:1: ( rule__Section__Group_8__2__Impl )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2961:2: rule__Section__Group_8__2__Impl
            {
            pushFollow(FOLLOW_rule__Section__Group_8__2__Impl_in_rule__Section__Group_8__25812);
            rule__Section__Group_8__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Section__Group_8__2"


    // $ANTLR start "rule__Section__Group_8__2__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2967:1: rule__Section__Group_8__2__Impl : ( ( rule__Section__FilteringAssignment_8_2 ) ) ;
    public final void rule__Section__Group_8__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2971:1: ( ( ( rule__Section__FilteringAssignment_8_2 ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2972:1: ( ( rule__Section__FilteringAssignment_8_2 ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2972:1: ( ( rule__Section__FilteringAssignment_8_2 ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2973:1: ( rule__Section__FilteringAssignment_8_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSectionAccess().getFilteringAssignment_8_2()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2974:1: ( rule__Section__FilteringAssignment_8_2 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2974:2: rule__Section__FilteringAssignment_8_2
            {
            pushFollow(FOLLOW_rule__Section__FilteringAssignment_8_2_in_rule__Section__Group_8__2__Impl5839);
            rule__Section__FilteringAssignment_8_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSectionAccess().getFilteringAssignment_8_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Section__Group_8__2__Impl"


    // $ANTLR start "rule__Section__Group_9__0"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2990:1: rule__Section__Group_9__0 : rule__Section__Group_9__0__Impl rule__Section__Group_9__1 ;
    public final void rule__Section__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2994:1: ( rule__Section__Group_9__0__Impl rule__Section__Group_9__1 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2995:2: rule__Section__Group_9__0__Impl rule__Section__Group_9__1
            {
            pushFollow(FOLLOW_rule__Section__Group_9__0__Impl_in_rule__Section__Group_9__05875);
            rule__Section__Group_9__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Section__Group_9__1_in_rule__Section__Group_9__05878);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3002:1: rule__Section__Group_9__0__Impl : ( 'expanded' ) ;
    public final void rule__Section__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3006:1: ( ( 'expanded' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3007:1: ( 'expanded' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3007:1: ( 'expanded' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3008:1: 'expanded'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSectionAccess().getExpandedKeyword_9_0()); 
            }
            match(input,37,FOLLOW_37_in_rule__Section__Group_9__0__Impl5906); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSectionAccess().getExpandedKeyword_9_0()); 
            }

            }


            }

        }
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3021:1: rule__Section__Group_9__1 : rule__Section__Group_9__1__Impl rule__Section__Group_9__2 ;
    public final void rule__Section__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3025:1: ( rule__Section__Group_9__1__Impl rule__Section__Group_9__2 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3026:2: rule__Section__Group_9__1__Impl rule__Section__Group_9__2
            {
            pushFollow(FOLLOW_rule__Section__Group_9__1__Impl_in_rule__Section__Group_9__15937);
            rule__Section__Group_9__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Section__Group_9__2_in_rule__Section__Group_9__15940);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3033:1: rule__Section__Group_9__1__Impl : ( ':' ) ;
    public final void rule__Section__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3037:1: ( ( ':' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3038:1: ( ':' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3038:1: ( ':' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3039:1: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSectionAccess().getColonKeyword_9_1()); 
            }
            match(input,27,FOLLOW_27_in_rule__Section__Group_9__1__Impl5968); if (state.failed) return ;
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3052:1: rule__Section__Group_9__2 : rule__Section__Group_9__2__Impl ;
    public final void rule__Section__Group_9__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3056:1: ( rule__Section__Group_9__2__Impl )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3057:2: rule__Section__Group_9__2__Impl
            {
            pushFollow(FOLLOW_rule__Section__Group_9__2__Impl_in_rule__Section__Group_9__25999);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3063:1: rule__Section__Group_9__2__Impl : ( ( rule__Section__ExpandedAssignment_9_2 ) ) ;
    public final void rule__Section__Group_9__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3067:1: ( ( ( rule__Section__ExpandedAssignment_9_2 ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3068:1: ( ( rule__Section__ExpandedAssignment_9_2 ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3068:1: ( ( rule__Section__ExpandedAssignment_9_2 ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3069:1: ( rule__Section__ExpandedAssignment_9_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSectionAccess().getExpandedAssignment_9_2()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3070:1: ( rule__Section__ExpandedAssignment_9_2 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3070:2: rule__Section__ExpandedAssignment_9_2
            {
            pushFollow(FOLLOW_rule__Section__ExpandedAssignment_9_2_in_rule__Section__Group_9__2__Impl6026);
            rule__Section__ExpandedAssignment_9_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSectionAccess().getExpandedAssignment_9_2()); 
            }

            }


            }

        }
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3086:1: rule__Section__Group_10__0 : rule__Section__Group_10__0__Impl rule__Section__Group_10__1 ;
    public final void rule__Section__Group_10__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3090:1: ( rule__Section__Group_10__0__Impl rule__Section__Group_10__1 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3091:2: rule__Section__Group_10__0__Impl rule__Section__Group_10__1
            {
            pushFollow(FOLLOW_rule__Section__Group_10__0__Impl_in_rule__Section__Group_10__06062);
            rule__Section__Group_10__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Section__Group_10__1_in_rule__Section__Group_10__06065);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3098:1: rule__Section__Group_10__0__Impl : ( 'activities' ) ;
    public final void rule__Section__Group_10__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3102:1: ( ( 'activities' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3103:1: ( 'activities' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3103:1: ( 'activities' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3104:1: 'activities'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSectionAccess().getActivitiesKeyword_10_0()); 
            }
            match(input,38,FOLLOW_38_in_rule__Section__Group_10__0__Impl6093); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSectionAccess().getActivitiesKeyword_10_0()); 
            }

            }


            }

        }
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3117:1: rule__Section__Group_10__1 : rule__Section__Group_10__1__Impl rule__Section__Group_10__2 ;
    public final void rule__Section__Group_10__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3121:1: ( rule__Section__Group_10__1__Impl rule__Section__Group_10__2 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3122:2: rule__Section__Group_10__1__Impl rule__Section__Group_10__2
            {
            pushFollow(FOLLOW_rule__Section__Group_10__1__Impl_in_rule__Section__Group_10__16124);
            rule__Section__Group_10__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Section__Group_10__2_in_rule__Section__Group_10__16127);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3129:1: rule__Section__Group_10__1__Impl : ( '{' ) ;
    public final void rule__Section__Group_10__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3133:1: ( ( '{' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3134:1: ( '{' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3134:1: ( '{' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3135:1: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSectionAccess().getLeftCurlyBracketKeyword_10_1()); 
            }
            match(input,15,FOLLOW_15_in_rule__Section__Group_10__1__Impl6155); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSectionAccess().getLeftCurlyBracketKeyword_10_1()); 
            }

            }


            }

        }
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3148:1: rule__Section__Group_10__2 : rule__Section__Group_10__2__Impl rule__Section__Group_10__3 ;
    public final void rule__Section__Group_10__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3152:1: ( rule__Section__Group_10__2__Impl rule__Section__Group_10__3 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3153:2: rule__Section__Group_10__2__Impl rule__Section__Group_10__3
            {
            pushFollow(FOLLOW_rule__Section__Group_10__2__Impl_in_rule__Section__Group_10__26186);
            rule__Section__Group_10__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Section__Group_10__3_in_rule__Section__Group_10__26189);
            rule__Section__Group_10__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3160:1: rule__Section__Group_10__2__Impl : ( ( rule__Section__OwnedActivitiesAssignment_10_2 )* ) ;
    public final void rule__Section__Group_10__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3164:1: ( ( ( rule__Section__OwnedActivitiesAssignment_10_2 )* ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3165:1: ( ( rule__Section__OwnedActivitiesAssignment_10_2 )* )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3165:1: ( ( rule__Section__OwnedActivitiesAssignment_10_2 )* )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3166:1: ( rule__Section__OwnedActivitiesAssignment_10_2 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSectionAccess().getOwnedActivitiesAssignment_10_2()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3167:1: ( rule__Section__OwnedActivitiesAssignment_10_2 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==13) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3167:2: rule__Section__OwnedActivitiesAssignment_10_2
            	    {
            	    pushFollow(FOLLOW_rule__Section__OwnedActivitiesAssignment_10_2_in_rule__Section__Group_10__2__Impl6216);
            	    rule__Section__OwnedActivitiesAssignment_10_2();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSectionAccess().getOwnedActivitiesAssignment_10_2()); 
            }

            }


            }

        }
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


    // $ANTLR start "rule__Section__Group_10__3"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3177:1: rule__Section__Group_10__3 : rule__Section__Group_10__3__Impl ;
    public final void rule__Section__Group_10__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3181:1: ( rule__Section__Group_10__3__Impl )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3182:2: rule__Section__Group_10__3__Impl
            {
            pushFollow(FOLLOW_rule__Section__Group_10__3__Impl_in_rule__Section__Group_10__36247);
            rule__Section__Group_10__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Section__Group_10__3"


    // $ANTLR start "rule__Section__Group_10__3__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3188:1: rule__Section__Group_10__3__Impl : ( '}' ) ;
    public final void rule__Section__Group_10__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3192:1: ( ( '}' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3193:1: ( '}' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3193:1: ( '}' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3194:1: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSectionAccess().getRightCurlyBracketKeyword_10_3()); 
            }
            match(input,16,FOLLOW_16_in_rule__Section__Group_10__3__Impl6275); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSectionAccess().getRightCurlyBracketKeyword_10_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Section__Group_10__3__Impl"


    // $ANTLR start "rule__Activity__Group__0"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3215:1: rule__Activity__Group__0 : rule__Activity__Group__0__Impl rule__Activity__Group__1 ;
    public final void rule__Activity__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3219:1: ( rule__Activity__Group__0__Impl rule__Activity__Group__1 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3220:2: rule__Activity__Group__0__Impl rule__Activity__Group__1
            {
            pushFollow(FOLLOW_rule__Activity__Group__0__Impl_in_rule__Activity__Group__06314);
            rule__Activity__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Activity__Group__1_in_rule__Activity__Group__06317);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3227:1: rule__Activity__Group__0__Impl : ( () ) ;
    public final void rule__Activity__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3231:1: ( ( () ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3232:1: ( () )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3232:1: ( () )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3233:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getActivityAccess().getActivityAction_0()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3234:1: ()
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3236:1: 
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3246:1: rule__Activity__Group__1 : rule__Activity__Group__1__Impl rule__Activity__Group__2 ;
    public final void rule__Activity__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3250:1: ( rule__Activity__Group__1__Impl rule__Activity__Group__2 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3251:2: rule__Activity__Group__1__Impl rule__Activity__Group__2
            {
            pushFollow(FOLLOW_rule__Activity__Group__1__Impl_in_rule__Activity__Group__16375);
            rule__Activity__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Activity__Group__2_in_rule__Activity__Group__16378);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3258:1: rule__Activity__Group__1__Impl : ( 'activity' ) ;
    public final void rule__Activity__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3262:1: ( ( 'activity' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3263:1: ( 'activity' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3263:1: ( 'activity' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3264:1: 'activity'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getActivityAccess().getActivityKeyword_1()); 
            }
            match(input,13,FOLLOW_13_in_rule__Activity__Group__1__Impl6406); if (state.failed) return ;
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3277:1: rule__Activity__Group__2 : rule__Activity__Group__2__Impl rule__Activity__Group__3 ;
    public final void rule__Activity__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3281:1: ( rule__Activity__Group__2__Impl rule__Activity__Group__3 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3282:2: rule__Activity__Group__2__Impl rule__Activity__Group__3
            {
            pushFollow(FOLLOW_rule__Activity__Group__2__Impl_in_rule__Activity__Group__26437);
            rule__Activity__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Activity__Group__3_in_rule__Activity__Group__26440);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3289:1: rule__Activity__Group__2__Impl : ( ( rule__Activity__NameAssignment_2 ) ) ;
    public final void rule__Activity__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3293:1: ( ( ( rule__Activity__NameAssignment_2 ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3294:1: ( ( rule__Activity__NameAssignment_2 ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3294:1: ( ( rule__Activity__NameAssignment_2 ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3295:1: ( rule__Activity__NameAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getActivityAccess().getNameAssignment_2()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3296:1: ( rule__Activity__NameAssignment_2 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3296:2: rule__Activity__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__Activity__NameAssignment_2_in_rule__Activity__Group__2__Impl6467);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3306:1: rule__Activity__Group__3 : rule__Activity__Group__3__Impl rule__Activity__Group__4 ;
    public final void rule__Activity__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3310:1: ( rule__Activity__Group__3__Impl rule__Activity__Group__4 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3311:2: rule__Activity__Group__3__Impl rule__Activity__Group__4
            {
            pushFollow(FOLLOW_rule__Activity__Group__3__Impl_in_rule__Activity__Group__36497);
            rule__Activity__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Activity__Group__4_in_rule__Activity__Group__36500);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3318:1: rule__Activity__Group__3__Impl : ( '{' ) ;
    public final void rule__Activity__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3322:1: ( ( '{' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3323:1: ( '{' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3323:1: ( '{' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3324:1: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getActivityAccess().getLeftCurlyBracketKeyword_3()); 
            }
            match(input,15,FOLLOW_15_in_rule__Activity__Group__3__Impl6528); if (state.failed) return ;
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3337:1: rule__Activity__Group__4 : rule__Activity__Group__4__Impl rule__Activity__Group__5 ;
    public final void rule__Activity__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3341:1: ( rule__Activity__Group__4__Impl rule__Activity__Group__5 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3342:2: rule__Activity__Group__4__Impl rule__Activity__Group__5
            {
            pushFollow(FOLLOW_rule__Activity__Group__4__Impl_in_rule__Activity__Group__46559);
            rule__Activity__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Activity__Group__5_in_rule__Activity__Group__46562);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3349:1: rule__Activity__Group__4__Impl : ( ( rule__Activity__Group_4__0 )? ) ;
    public final void rule__Activity__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3353:1: ( ( ( rule__Activity__Group_4__0 )? ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3354:1: ( ( rule__Activity__Group_4__0 )? )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3354:1: ( ( rule__Activity__Group_4__0 )? )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3355:1: ( rule__Activity__Group_4__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getActivityAccess().getGroup_4()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3356:1: ( rule__Activity__Group_4__0 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==20) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3356:2: rule__Activity__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__Activity__Group_4__0_in_rule__Activity__Group__4__Impl6589);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3366:1: rule__Activity__Group__5 : rule__Activity__Group__5__Impl rule__Activity__Group__6 ;
    public final void rule__Activity__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3370:1: ( rule__Activity__Group__5__Impl rule__Activity__Group__6 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3371:2: rule__Activity__Group__5__Impl rule__Activity__Group__6
            {
            pushFollow(FOLLOW_rule__Activity__Group__5__Impl_in_rule__Activity__Group__56620);
            rule__Activity__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Activity__Group__6_in_rule__Activity__Group__56623);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3378:1: rule__Activity__Group__5__Impl : ( ( rule__Activity__Group_5__0 )? ) ;
    public final void rule__Activity__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3382:1: ( ( ( rule__Activity__Group_5__0 )? ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3383:1: ( ( rule__Activity__Group_5__0 )? )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3383:1: ( ( rule__Activity__Group_5__0 )? )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3384:1: ( rule__Activity__Group_5__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getActivityAccess().getGroup_5()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3385:1: ( rule__Activity__Group_5__0 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==23) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3385:2: rule__Activity__Group_5__0
                    {
                    pushFollow(FOLLOW_rule__Activity__Group_5__0_in_rule__Activity__Group__5__Impl6650);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3395:1: rule__Activity__Group__6 : rule__Activity__Group__6__Impl rule__Activity__Group__7 ;
    public final void rule__Activity__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3399:1: ( rule__Activity__Group__6__Impl rule__Activity__Group__7 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3400:2: rule__Activity__Group__6__Impl rule__Activity__Group__7
            {
            pushFollow(FOLLOW_rule__Activity__Group__6__Impl_in_rule__Activity__Group__66681);
            rule__Activity__Group__6__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Activity__Group__7_in_rule__Activity__Group__66684);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3407:1: rule__Activity__Group__6__Impl : ( 'index' ) ;
    public final void rule__Activity__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3411:1: ( ( 'index' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3412:1: ( 'index' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3412:1: ( 'index' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3413:1: 'index'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getActivityAccess().getIndexKeyword_6()); 
            }
            match(input,19,FOLLOW_19_in_rule__Activity__Group__6__Impl6712); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getActivityAccess().getIndexKeyword_6()); 
            }

            }


            }

        }
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3426:1: rule__Activity__Group__7 : rule__Activity__Group__7__Impl rule__Activity__Group__8 ;
    public final void rule__Activity__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3430:1: ( rule__Activity__Group__7__Impl rule__Activity__Group__8 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3431:2: rule__Activity__Group__7__Impl rule__Activity__Group__8
            {
            pushFollow(FOLLOW_rule__Activity__Group__7__Impl_in_rule__Activity__Group__76743);
            rule__Activity__Group__7__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Activity__Group__8_in_rule__Activity__Group__76746);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3438:1: rule__Activity__Group__7__Impl : ( ( rule__Activity__IndexAssignment_7 ) ) ;
    public final void rule__Activity__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3442:1: ( ( ( rule__Activity__IndexAssignment_7 ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3443:1: ( ( rule__Activity__IndexAssignment_7 ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3443:1: ( ( rule__Activity__IndexAssignment_7 ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3444:1: ( rule__Activity__IndexAssignment_7 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getActivityAccess().getIndexAssignment_7()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3445:1: ( rule__Activity__IndexAssignment_7 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3445:2: rule__Activity__IndexAssignment_7
            {
            pushFollow(FOLLOW_rule__Activity__IndexAssignment_7_in_rule__Activity__Group__7__Impl6773);
            rule__Activity__IndexAssignment_7();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getActivityAccess().getIndexAssignment_7()); 
            }

            }


            }

        }
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3455:1: rule__Activity__Group__8 : rule__Activity__Group__8__Impl rule__Activity__Group__9 ;
    public final void rule__Activity__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3459:1: ( rule__Activity__Group__8__Impl rule__Activity__Group__9 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3460:2: rule__Activity__Group__8__Impl rule__Activity__Group__9
            {
            pushFollow(FOLLOW_rule__Activity__Group__8__Impl_in_rule__Activity__Group__86803);
            rule__Activity__Group__8__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Activity__Group__9_in_rule__Activity__Group__86806);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3467:1: rule__Activity__Group__8__Impl : ( ( rule__Activity__Group_8__0 )? ) ;
    public final void rule__Activity__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3471:1: ( ( ( rule__Activity__Group_8__0 )? ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3472:1: ( ( rule__Activity__Group_8__0 )? )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3472:1: ( ( rule__Activity__Group_8__0 )? )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3473:1: ( rule__Activity__Group_8__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getActivityAccess().getGroup_8()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3474:1: ( rule__Activity__Group_8__0 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==31) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3474:2: rule__Activity__Group_8__0
                    {
                    pushFollow(FOLLOW_rule__Activity__Group_8__0_in_rule__Activity__Group__8__Impl6833);
                    rule__Activity__Group_8__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getActivityAccess().getGroup_8()); 
            }

            }


            }

        }
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3484:1: rule__Activity__Group__9 : rule__Activity__Group__9__Impl rule__Activity__Group__10 ;
    public final void rule__Activity__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3488:1: ( rule__Activity__Group__9__Impl rule__Activity__Group__10 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3489:2: rule__Activity__Group__9__Impl rule__Activity__Group__10
            {
            pushFollow(FOLLOW_rule__Activity__Group__9__Impl_in_rule__Activity__Group__96864);
            rule__Activity__Group__9__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Activity__Group__10_in_rule__Activity__Group__96867);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3496:1: rule__Activity__Group__9__Impl : ( ( rule__Activity__Group_9__0 )? ) ;
    public final void rule__Activity__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3500:1: ( ( ( rule__Activity__Group_9__0 )? ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3501:1: ( ( rule__Activity__Group_9__0 )? )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3501:1: ( ( rule__Activity__Group_9__0 )? )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3502:1: ( rule__Activity__Group_9__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getActivityAccess().getGroup_9()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3503:1: ( rule__Activity__Group_9__0 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==39) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3503:2: rule__Activity__Group_9__0
                    {
                    pushFollow(FOLLOW_rule__Activity__Group_9__0_in_rule__Activity__Group__9__Impl6894);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3513:1: rule__Activity__Group__10 : rule__Activity__Group__10__Impl ;
    public final void rule__Activity__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3517:1: ( rule__Activity__Group__10__Impl )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3518:2: rule__Activity__Group__10__Impl
            {
            pushFollow(FOLLOW_rule__Activity__Group__10__Impl_in_rule__Activity__Group__106925);
            rule__Activity__Group__10__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3524:1: rule__Activity__Group__10__Impl : ( '}' ) ;
    public final void rule__Activity__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3528:1: ( ( '}' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3529:1: ( '}' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3529:1: ( '}' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3530:1: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getActivityAccess().getRightCurlyBracketKeyword_10()); 
            }
            match(input,16,FOLLOW_16_in_rule__Activity__Group__10__Impl6953); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getActivityAccess().getRightCurlyBracketKeyword_10()); 
            }

            }


            }

        }
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


    // $ANTLR start "rule__Activity__Group_4__0"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3565:1: rule__Activity__Group_4__0 : rule__Activity__Group_4__0__Impl rule__Activity__Group_4__1 ;
    public final void rule__Activity__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3569:1: ( rule__Activity__Group_4__0__Impl rule__Activity__Group_4__1 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3570:2: rule__Activity__Group_4__0__Impl rule__Activity__Group_4__1
            {
            pushFollow(FOLLOW_rule__Activity__Group_4__0__Impl_in_rule__Activity__Group_4__07006);
            rule__Activity__Group_4__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Activity__Group_4__1_in_rule__Activity__Group_4__07009);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3577:1: rule__Activity__Group_4__0__Impl : ( 'description' ) ;
    public final void rule__Activity__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3581:1: ( ( 'description' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3582:1: ( 'description' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3582:1: ( 'description' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3583:1: 'description'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getActivityAccess().getDescriptionKeyword_4_0()); 
            }
            match(input,20,FOLLOW_20_in_rule__Activity__Group_4__0__Impl7037); if (state.failed) return ;
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3596:1: rule__Activity__Group_4__1 : rule__Activity__Group_4__1__Impl ;
    public final void rule__Activity__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3600:1: ( rule__Activity__Group_4__1__Impl )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3601:2: rule__Activity__Group_4__1__Impl
            {
            pushFollow(FOLLOW_rule__Activity__Group_4__1__Impl_in_rule__Activity__Group_4__17068);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3607:1: rule__Activity__Group_4__1__Impl : ( ( rule__Activity__DescriptionAssignment_4_1 ) ) ;
    public final void rule__Activity__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3611:1: ( ( ( rule__Activity__DescriptionAssignment_4_1 ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3612:1: ( ( rule__Activity__DescriptionAssignment_4_1 ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3612:1: ( ( rule__Activity__DescriptionAssignment_4_1 ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3613:1: ( rule__Activity__DescriptionAssignment_4_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getActivityAccess().getDescriptionAssignment_4_1()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3614:1: ( rule__Activity__DescriptionAssignment_4_1 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3614:2: rule__Activity__DescriptionAssignment_4_1
            {
            pushFollow(FOLLOW_rule__Activity__DescriptionAssignment_4_1_in_rule__Activity__Group_4__1__Impl7095);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3628:1: rule__Activity__Group_5__0 : rule__Activity__Group_5__0__Impl rule__Activity__Group_5__1 ;
    public final void rule__Activity__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3632:1: ( rule__Activity__Group_5__0__Impl rule__Activity__Group_5__1 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3633:2: rule__Activity__Group_5__0__Impl rule__Activity__Group_5__1
            {
            pushFollow(FOLLOW_rule__Activity__Group_5__0__Impl_in_rule__Activity__Group_5__07129);
            rule__Activity__Group_5__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Activity__Group_5__1_in_rule__Activity__Group_5__07132);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3640:1: rule__Activity__Group_5__0__Impl : ( 'id' ) ;
    public final void rule__Activity__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3644:1: ( ( 'id' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3645:1: ( 'id' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3645:1: ( 'id' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3646:1: 'id'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getActivityAccess().getIdKeyword_5_0()); 
            }
            match(input,23,FOLLOW_23_in_rule__Activity__Group_5__0__Impl7160); if (state.failed) return ;
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3659:1: rule__Activity__Group_5__1 : rule__Activity__Group_5__1__Impl ;
    public final void rule__Activity__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3663:1: ( rule__Activity__Group_5__1__Impl )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3664:2: rule__Activity__Group_5__1__Impl
            {
            pushFollow(FOLLOW_rule__Activity__Group_5__1__Impl_in_rule__Activity__Group_5__17191);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3670:1: rule__Activity__Group_5__1__Impl : ( ( rule__Activity__ActivityExplorerItemIDAssignment_5_1 ) ) ;
    public final void rule__Activity__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3674:1: ( ( ( rule__Activity__ActivityExplorerItemIDAssignment_5_1 ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3675:1: ( ( rule__Activity__ActivityExplorerItemIDAssignment_5_1 ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3675:1: ( ( rule__Activity__ActivityExplorerItemIDAssignment_5_1 ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3676:1: ( rule__Activity__ActivityExplorerItemIDAssignment_5_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getActivityAccess().getActivityExplorerItemIDAssignment_5_1()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3677:1: ( rule__Activity__ActivityExplorerItemIDAssignment_5_1 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3677:2: rule__Activity__ActivityExplorerItemIDAssignment_5_1
            {
            pushFollow(FOLLOW_rule__Activity__ActivityExplorerItemIDAssignment_5_1_in_rule__Activity__Group_5__1__Impl7218);
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


    // $ANTLR start "rule__Activity__Group_8__0"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3691:1: rule__Activity__Group_8__0 : rule__Activity__Group_8__0__Impl rule__Activity__Group_8__1 ;
    public final void rule__Activity__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3695:1: ( rule__Activity__Group_8__0__Impl rule__Activity__Group_8__1 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3696:2: rule__Activity__Group_8__0__Impl rule__Activity__Group_8__1
            {
            pushFollow(FOLLOW_rule__Activity__Group_8__0__Impl_in_rule__Activity__Group_8__07252);
            rule__Activity__Group_8__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Activity__Group_8__1_in_rule__Activity__Group_8__07255);
            rule__Activity__Group_8__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__Group_8__0"


    // $ANTLR start "rule__Activity__Group_8__0__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3703:1: rule__Activity__Group_8__0__Impl : ( 'predicated' ) ;
    public final void rule__Activity__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3707:1: ( ( 'predicated' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3708:1: ( 'predicated' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3708:1: ( 'predicated' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3709:1: 'predicated'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getActivityAccess().getPredicatedKeyword_8_0()); 
            }
            match(input,31,FOLLOW_31_in_rule__Activity__Group_8__0__Impl7283); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getActivityAccess().getPredicatedKeyword_8_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__Group_8__0__Impl"


    // $ANTLR start "rule__Activity__Group_8__1"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3722:1: rule__Activity__Group_8__1 : rule__Activity__Group_8__1__Impl rule__Activity__Group_8__2 ;
    public final void rule__Activity__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3726:1: ( rule__Activity__Group_8__1__Impl rule__Activity__Group_8__2 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3727:2: rule__Activity__Group_8__1__Impl rule__Activity__Group_8__2
            {
            pushFollow(FOLLOW_rule__Activity__Group_8__1__Impl_in_rule__Activity__Group_8__17314);
            rule__Activity__Group_8__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Activity__Group_8__2_in_rule__Activity__Group_8__17317);
            rule__Activity__Group_8__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__Group_8__1"


    // $ANTLR start "rule__Activity__Group_8__1__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3734:1: rule__Activity__Group_8__1__Impl : ( ':' ) ;
    public final void rule__Activity__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3738:1: ( ( ':' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3739:1: ( ':' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3739:1: ( ':' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3740:1: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getActivityAccess().getColonKeyword_8_1()); 
            }
            match(input,27,FOLLOW_27_in_rule__Activity__Group_8__1__Impl7345); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getActivityAccess().getColonKeyword_8_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__Group_8__1__Impl"


    // $ANTLR start "rule__Activity__Group_8__2"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3753:1: rule__Activity__Group_8__2 : rule__Activity__Group_8__2__Impl ;
    public final void rule__Activity__Group_8__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3757:1: ( rule__Activity__Group_8__2__Impl )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3758:2: rule__Activity__Group_8__2__Impl
            {
            pushFollow(FOLLOW_rule__Activity__Group_8__2__Impl_in_rule__Activity__Group_8__27376);
            rule__Activity__Group_8__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__Group_8__2"


    // $ANTLR start "rule__Activity__Group_8__2__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3764:1: rule__Activity__Group_8__2__Impl : ( ( rule__Activity__HasPredicateAssignment_8_2 ) ) ;
    public final void rule__Activity__Group_8__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3768:1: ( ( ( rule__Activity__HasPredicateAssignment_8_2 ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3769:1: ( ( rule__Activity__HasPredicateAssignment_8_2 ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3769:1: ( ( rule__Activity__HasPredicateAssignment_8_2 ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3770:1: ( rule__Activity__HasPredicateAssignment_8_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getActivityAccess().getHasPredicateAssignment_8_2()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3771:1: ( rule__Activity__HasPredicateAssignment_8_2 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3771:2: rule__Activity__HasPredicateAssignment_8_2
            {
            pushFollow(FOLLOW_rule__Activity__HasPredicateAssignment_8_2_in_rule__Activity__Group_8__2__Impl7403);
            rule__Activity__HasPredicateAssignment_8_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getActivityAccess().getHasPredicateAssignment_8_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__Group_8__2__Impl"


    // $ANTLR start "rule__Activity__Group_9__0"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3787:1: rule__Activity__Group_9__0 : rule__Activity__Group_9__0__Impl rule__Activity__Group_9__1 ;
    public final void rule__Activity__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3791:1: ( rule__Activity__Group_9__0__Impl rule__Activity__Group_9__1 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3792:2: rule__Activity__Group_9__0__Impl rule__Activity__Group_9__1
            {
            pushFollow(FOLLOW_rule__Activity__Group_9__0__Impl_in_rule__Activity__Group_9__07439);
            rule__Activity__Group_9__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Activity__Group_9__1_in_rule__Activity__Group_9__07442);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3799:1: rule__Activity__Group_9__0__Impl : ( 'icon' ) ;
    public final void rule__Activity__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3803:1: ( ( 'icon' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3804:1: ( 'icon' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3804:1: ( 'icon' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3805:1: 'icon'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getActivityAccess().getIconKeyword_9_0()); 
            }
            match(input,39,FOLLOW_39_in_rule__Activity__Group_9__0__Impl7470); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getActivityAccess().getIconKeyword_9_0()); 
            }

            }


            }

        }
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3818:1: rule__Activity__Group_9__1 : rule__Activity__Group_9__1__Impl rule__Activity__Group_9__2 ;
    public final void rule__Activity__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3822:1: ( rule__Activity__Group_9__1__Impl rule__Activity__Group_9__2 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3823:2: rule__Activity__Group_9__1__Impl rule__Activity__Group_9__2
            {
            pushFollow(FOLLOW_rule__Activity__Group_9__1__Impl_in_rule__Activity__Group_9__17501);
            rule__Activity__Group_9__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Activity__Group_9__2_in_rule__Activity__Group_9__17504);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3830:1: rule__Activity__Group_9__1__Impl : ( ':' ) ;
    public final void rule__Activity__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3834:1: ( ( ':' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3835:1: ( ':' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3835:1: ( ':' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3836:1: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getActivityAccess().getColonKeyword_9_1()); 
            }
            match(input,27,FOLLOW_27_in_rule__Activity__Group_9__1__Impl7532); if (state.failed) return ;
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3849:1: rule__Activity__Group_9__2 : rule__Activity__Group_9__2__Impl ;
    public final void rule__Activity__Group_9__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3853:1: ( rule__Activity__Group_9__2__Impl )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3854:2: rule__Activity__Group_9__2__Impl
            {
            pushFollow(FOLLOW_rule__Activity__Group_9__2__Impl_in_rule__Activity__Group_9__27563);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3860:1: rule__Activity__Group_9__2__Impl : ( ( rule__Activity__ImagePathOffAssignment_9_2 ) ) ;
    public final void rule__Activity__Group_9__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3864:1: ( ( ( rule__Activity__ImagePathOffAssignment_9_2 ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3865:1: ( ( rule__Activity__ImagePathOffAssignment_9_2 ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3865:1: ( ( rule__Activity__ImagePathOffAssignment_9_2 ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3866:1: ( rule__Activity__ImagePathOffAssignment_9_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getActivityAccess().getImagePathOffAssignment_9_2()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3867:1: ( rule__Activity__ImagePathOffAssignment_9_2 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3867:2: rule__Activity__ImagePathOffAssignment_9_2
            {
            pushFollow(FOLLOW_rule__Activity__ImagePathOffAssignment_9_2_in_rule__Activity__Group_9__2__Impl7590);
            rule__Activity__ImagePathOffAssignment_9_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getActivityAccess().getImagePathOffAssignment_9_2()); 
            }

            }


            }

        }
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


    // $ANTLR start "rule__PageExtension__Group__0"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3883:1: rule__PageExtension__Group__0 : rule__PageExtension__Group__0__Impl rule__PageExtension__Group__1 ;
    public final void rule__PageExtension__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3887:1: ( rule__PageExtension__Group__0__Impl rule__PageExtension__Group__1 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3888:2: rule__PageExtension__Group__0__Impl rule__PageExtension__Group__1
            {
            pushFollow(FOLLOW_rule__PageExtension__Group__0__Impl_in_rule__PageExtension__Group__07626);
            rule__PageExtension__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__PageExtension__Group__1_in_rule__PageExtension__Group__07629);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3895:1: rule__PageExtension__Group__0__Impl : ( () ) ;
    public final void rule__PageExtension__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3899:1: ( ( () ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3900:1: ( () )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3900:1: ( () )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3901:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPageExtensionAccess().getPageExtensionAction_0()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3902:1: ()
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3904:1: 
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3914:1: rule__PageExtension__Group__1 : rule__PageExtension__Group__1__Impl rule__PageExtension__Group__2 ;
    public final void rule__PageExtension__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3918:1: ( rule__PageExtension__Group__1__Impl rule__PageExtension__Group__2 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3919:2: rule__PageExtension__Group__1__Impl rule__PageExtension__Group__2
            {
            pushFollow(FOLLOW_rule__PageExtension__Group__1__Impl_in_rule__PageExtension__Group__17687);
            rule__PageExtension__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__PageExtension__Group__2_in_rule__PageExtension__Group__17690);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3926:1: rule__PageExtension__Group__1__Impl : ( 'page' ) ;
    public final void rule__PageExtension__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3930:1: ( ( 'page' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3931:1: ( 'page' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3931:1: ( 'page' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3932:1: 'page'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPageExtensionAccess().getPageKeyword_1()); 
            }
            match(input,18,FOLLOW_18_in_rule__PageExtension__Group__1__Impl7718); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPageExtensionAccess().getPageKeyword_1()); 
            }

            }


            }

        }
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3945:1: rule__PageExtension__Group__2 : rule__PageExtension__Group__2__Impl rule__PageExtension__Group__3 ;
    public final void rule__PageExtension__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3949:1: ( rule__PageExtension__Group__2__Impl rule__PageExtension__Group__3 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3950:2: rule__PageExtension__Group__2__Impl rule__PageExtension__Group__3
            {
            pushFollow(FOLLOW_rule__PageExtension__Group__2__Impl_in_rule__PageExtension__Group__27749);
            rule__PageExtension__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__PageExtension__Group__3_in_rule__PageExtension__Group__27752);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3957:1: rule__PageExtension__Group__2__Impl : ( 'extensions' ) ;
    public final void rule__PageExtension__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3961:1: ( ( 'extensions' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3962:1: ( 'extensions' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3962:1: ( 'extensions' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3963:1: 'extensions'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPageExtensionAccess().getExtensionsKeyword_2()); 
            }
            match(input,40,FOLLOW_40_in_rule__PageExtension__Group__2__Impl7780); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPageExtensionAccess().getExtensionsKeyword_2()); 
            }

            }


            }

        }
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3976:1: rule__PageExtension__Group__3 : rule__PageExtension__Group__3__Impl rule__PageExtension__Group__4 ;
    public final void rule__PageExtension__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3980:1: ( rule__PageExtension__Group__3__Impl rule__PageExtension__Group__4 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3981:2: rule__PageExtension__Group__3__Impl rule__PageExtension__Group__4
            {
            pushFollow(FOLLOW_rule__PageExtension__Group__3__Impl_in_rule__PageExtension__Group__37811);
            rule__PageExtension__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__PageExtension__Group__4_in_rule__PageExtension__Group__37814);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3988:1: rule__PageExtension__Group__3__Impl : ( '{' ) ;
    public final void rule__PageExtension__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3992:1: ( ( '{' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3993:1: ( '{' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3993:1: ( '{' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3994:1: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPageExtensionAccess().getLeftCurlyBracketKeyword_3()); 
            }
            match(input,15,FOLLOW_15_in_rule__PageExtension__Group__3__Impl7842); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPageExtensionAccess().getLeftCurlyBracketKeyword_3()); 
            }

            }


            }

        }
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4007:1: rule__PageExtension__Group__4 : rule__PageExtension__Group__4__Impl rule__PageExtension__Group__5 ;
    public final void rule__PageExtension__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4011:1: ( rule__PageExtension__Group__4__Impl rule__PageExtension__Group__5 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4012:2: rule__PageExtension__Group__4__Impl rule__PageExtension__Group__5
            {
            pushFollow(FOLLOW_rule__PageExtension__Group__4__Impl_in_rule__PageExtension__Group__47873);
            rule__PageExtension__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__PageExtension__Group__5_in_rule__PageExtension__Group__47876);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4019:1: rule__PageExtension__Group__4__Impl : ( 'extended' ) ;
    public final void rule__PageExtension__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4023:1: ( ( 'extended' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4024:1: ( 'extended' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4024:1: ( 'extended' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4025:1: 'extended'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPageExtensionAccess().getExtendedKeyword_4()); 
            }
            match(input,41,FOLLOW_41_in_rule__PageExtension__Group__4__Impl7904); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPageExtensionAccess().getExtendedKeyword_4()); 
            }

            }


            }

        }
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4038:1: rule__PageExtension__Group__5 : rule__PageExtension__Group__5__Impl rule__PageExtension__Group__6 ;
    public final void rule__PageExtension__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4042:1: ( rule__PageExtension__Group__5__Impl rule__PageExtension__Group__6 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4043:2: rule__PageExtension__Group__5__Impl rule__PageExtension__Group__6
            {
            pushFollow(FOLLOW_rule__PageExtension__Group__5__Impl_in_rule__PageExtension__Group__57935);
            rule__PageExtension__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__PageExtension__Group__6_in_rule__PageExtension__Group__57938);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4050:1: rule__PageExtension__Group__5__Impl : ( 'page' ) ;
    public final void rule__PageExtension__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4054:1: ( ( 'page' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4055:1: ( 'page' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4055:1: ( 'page' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4056:1: 'page'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPageExtensionAccess().getPageKeyword_5()); 
            }
            match(input,18,FOLLOW_18_in_rule__PageExtension__Group__5__Impl7966); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPageExtensionAccess().getPageKeyword_5()); 
            }

            }


            }

        }
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4069:1: rule__PageExtension__Group__6 : rule__PageExtension__Group__6__Impl rule__PageExtension__Group__7 ;
    public final void rule__PageExtension__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4073:1: ( rule__PageExtension__Group__6__Impl rule__PageExtension__Group__7 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4074:2: rule__PageExtension__Group__6__Impl rule__PageExtension__Group__7
            {
            pushFollow(FOLLOW_rule__PageExtension__Group__6__Impl_in_rule__PageExtension__Group__67997);
            rule__PageExtension__Group__6__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__PageExtension__Group__7_in_rule__PageExtension__Group__68000);
            rule__PageExtension__Group__7();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4081:1: rule__PageExtension__Group__6__Impl : ( ( rule__PageExtension__ExtendedPageIDAssignment_6 ) ) ;
    public final void rule__PageExtension__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4085:1: ( ( ( rule__PageExtension__ExtendedPageIDAssignment_6 ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4086:1: ( ( rule__PageExtension__ExtendedPageIDAssignment_6 ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4086:1: ( ( rule__PageExtension__ExtendedPageIDAssignment_6 ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4087:1: ( rule__PageExtension__ExtendedPageIDAssignment_6 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPageExtensionAccess().getExtendedPageIDAssignment_6()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4088:1: ( rule__PageExtension__ExtendedPageIDAssignment_6 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4088:2: rule__PageExtension__ExtendedPageIDAssignment_6
            {
            pushFollow(FOLLOW_rule__PageExtension__ExtendedPageIDAssignment_6_in_rule__PageExtension__Group__6__Impl8027);
            rule__PageExtension__ExtendedPageIDAssignment_6();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPageExtensionAccess().getExtendedPageIDAssignment_6()); 
            }

            }


            }

        }
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


    // $ANTLR start "rule__PageExtension__Group__7"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4098:1: rule__PageExtension__Group__7 : rule__PageExtension__Group__7__Impl rule__PageExtension__Group__8 ;
    public final void rule__PageExtension__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4102:1: ( rule__PageExtension__Group__7__Impl rule__PageExtension__Group__8 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4103:2: rule__PageExtension__Group__7__Impl rule__PageExtension__Group__8
            {
            pushFollow(FOLLOW_rule__PageExtension__Group__7__Impl_in_rule__PageExtension__Group__78057);
            rule__PageExtension__Group__7__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__PageExtension__Group__8_in_rule__PageExtension__Group__78060);
            rule__PageExtension__Group__8();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PageExtension__Group__7"


    // $ANTLR start "rule__PageExtension__Group__7__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4110:1: rule__PageExtension__Group__7__Impl : ( ( rule__PageExtension__OwnedSectionsAssignment_7 )* ) ;
    public final void rule__PageExtension__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4114:1: ( ( ( rule__PageExtension__OwnedSectionsAssignment_7 )* ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4115:1: ( ( rule__PageExtension__OwnedSectionsAssignment_7 )* )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4115:1: ( ( rule__PageExtension__OwnedSectionsAssignment_7 )* )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4116:1: ( rule__PageExtension__OwnedSectionsAssignment_7 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPageExtensionAccess().getOwnedSectionsAssignment_7()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4117:1: ( rule__PageExtension__OwnedSectionsAssignment_7 )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==35) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4117:2: rule__PageExtension__OwnedSectionsAssignment_7
            	    {
            	    pushFollow(FOLLOW_rule__PageExtension__OwnedSectionsAssignment_7_in_rule__PageExtension__Group__7__Impl8087);
            	    rule__PageExtension__OwnedSectionsAssignment_7();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPageExtensionAccess().getOwnedSectionsAssignment_7()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PageExtension__Group__7__Impl"


    // $ANTLR start "rule__PageExtension__Group__8"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4127:1: rule__PageExtension__Group__8 : rule__PageExtension__Group__8__Impl ;
    public final void rule__PageExtension__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4131:1: ( rule__PageExtension__Group__8__Impl )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4132:2: rule__PageExtension__Group__8__Impl
            {
            pushFollow(FOLLOW_rule__PageExtension__Group__8__Impl_in_rule__PageExtension__Group__88118);
            rule__PageExtension__Group__8__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PageExtension__Group__8"


    // $ANTLR start "rule__PageExtension__Group__8__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4138:1: rule__PageExtension__Group__8__Impl : ( '}' ) ;
    public final void rule__PageExtension__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4142:1: ( ( '}' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4143:1: ( '}' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4143:1: ( '}' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4144:1: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPageExtensionAccess().getRightCurlyBracketKeyword_8()); 
            }
            match(input,16,FOLLOW_16_in_rule__PageExtension__Group__8__Impl8146); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPageExtensionAccess().getRightCurlyBracketKeyword_8()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PageExtension__Group__8__Impl"


    // $ANTLR start "rule__SectionExtension__Group__0"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4175:1: rule__SectionExtension__Group__0 : rule__SectionExtension__Group__0__Impl rule__SectionExtension__Group__1 ;
    public final void rule__SectionExtension__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4179:1: ( rule__SectionExtension__Group__0__Impl rule__SectionExtension__Group__1 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4180:2: rule__SectionExtension__Group__0__Impl rule__SectionExtension__Group__1
            {
            pushFollow(FOLLOW_rule__SectionExtension__Group__0__Impl_in_rule__SectionExtension__Group__08195);
            rule__SectionExtension__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__SectionExtension__Group__1_in_rule__SectionExtension__Group__08198);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4187:1: rule__SectionExtension__Group__0__Impl : ( () ) ;
    public final void rule__SectionExtension__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4191:1: ( ( () ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4192:1: ( () )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4192:1: ( () )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4193:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSectionExtensionAccess().getSectionExtensionAction_0()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4194:1: ()
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4196:1: 
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4206:1: rule__SectionExtension__Group__1 : rule__SectionExtension__Group__1__Impl rule__SectionExtension__Group__2 ;
    public final void rule__SectionExtension__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4210:1: ( rule__SectionExtension__Group__1__Impl rule__SectionExtension__Group__2 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4211:2: rule__SectionExtension__Group__1__Impl rule__SectionExtension__Group__2
            {
            pushFollow(FOLLOW_rule__SectionExtension__Group__1__Impl_in_rule__SectionExtension__Group__18256);
            rule__SectionExtension__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__SectionExtension__Group__2_in_rule__SectionExtension__Group__18259);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4218:1: rule__SectionExtension__Group__1__Impl : ( 'section' ) ;
    public final void rule__SectionExtension__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4222:1: ( ( 'section' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4223:1: ( 'section' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4223:1: ( 'section' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4224:1: 'section'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSectionExtensionAccess().getSectionKeyword_1()); 
            }
            match(input,35,FOLLOW_35_in_rule__SectionExtension__Group__1__Impl8287); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSectionExtensionAccess().getSectionKeyword_1()); 
            }

            }


            }

        }
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4237:1: rule__SectionExtension__Group__2 : rule__SectionExtension__Group__2__Impl rule__SectionExtension__Group__3 ;
    public final void rule__SectionExtension__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4241:1: ( rule__SectionExtension__Group__2__Impl rule__SectionExtension__Group__3 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4242:2: rule__SectionExtension__Group__2__Impl rule__SectionExtension__Group__3
            {
            pushFollow(FOLLOW_rule__SectionExtension__Group__2__Impl_in_rule__SectionExtension__Group__28318);
            rule__SectionExtension__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__SectionExtension__Group__3_in_rule__SectionExtension__Group__28321);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4249:1: rule__SectionExtension__Group__2__Impl : ( 'extensions' ) ;
    public final void rule__SectionExtension__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4253:1: ( ( 'extensions' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4254:1: ( 'extensions' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4254:1: ( 'extensions' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4255:1: 'extensions'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSectionExtensionAccess().getExtensionsKeyword_2()); 
            }
            match(input,40,FOLLOW_40_in_rule__SectionExtension__Group__2__Impl8349); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSectionExtensionAccess().getExtensionsKeyword_2()); 
            }

            }


            }

        }
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4268:1: rule__SectionExtension__Group__3 : rule__SectionExtension__Group__3__Impl rule__SectionExtension__Group__4 ;
    public final void rule__SectionExtension__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4272:1: ( rule__SectionExtension__Group__3__Impl rule__SectionExtension__Group__4 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4273:2: rule__SectionExtension__Group__3__Impl rule__SectionExtension__Group__4
            {
            pushFollow(FOLLOW_rule__SectionExtension__Group__3__Impl_in_rule__SectionExtension__Group__38380);
            rule__SectionExtension__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__SectionExtension__Group__4_in_rule__SectionExtension__Group__38383);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4280:1: rule__SectionExtension__Group__3__Impl : ( '{' ) ;
    public final void rule__SectionExtension__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4284:1: ( ( '{' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4285:1: ( '{' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4285:1: ( '{' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4286:1: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSectionExtensionAccess().getLeftCurlyBracketKeyword_3()); 
            }
            match(input,15,FOLLOW_15_in_rule__SectionExtension__Group__3__Impl8411); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSectionExtensionAccess().getLeftCurlyBracketKeyword_3()); 
            }

            }


            }

        }
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4299:1: rule__SectionExtension__Group__4 : rule__SectionExtension__Group__4__Impl rule__SectionExtension__Group__5 ;
    public final void rule__SectionExtension__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4303:1: ( rule__SectionExtension__Group__4__Impl rule__SectionExtension__Group__5 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4304:2: rule__SectionExtension__Group__4__Impl rule__SectionExtension__Group__5
            {
            pushFollow(FOLLOW_rule__SectionExtension__Group__4__Impl_in_rule__SectionExtension__Group__48442);
            rule__SectionExtension__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__SectionExtension__Group__5_in_rule__SectionExtension__Group__48445);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4311:1: rule__SectionExtension__Group__4__Impl : ( 'extended' ) ;
    public final void rule__SectionExtension__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4315:1: ( ( 'extended' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4316:1: ( 'extended' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4316:1: ( 'extended' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4317:1: 'extended'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSectionExtensionAccess().getExtendedKeyword_4()); 
            }
            match(input,41,FOLLOW_41_in_rule__SectionExtension__Group__4__Impl8473); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSectionExtensionAccess().getExtendedKeyword_4()); 
            }

            }


            }

        }
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4330:1: rule__SectionExtension__Group__5 : rule__SectionExtension__Group__5__Impl rule__SectionExtension__Group__6 ;
    public final void rule__SectionExtension__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4334:1: ( rule__SectionExtension__Group__5__Impl rule__SectionExtension__Group__6 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4335:2: rule__SectionExtension__Group__5__Impl rule__SectionExtension__Group__6
            {
            pushFollow(FOLLOW_rule__SectionExtension__Group__5__Impl_in_rule__SectionExtension__Group__58504);
            rule__SectionExtension__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__SectionExtension__Group__6_in_rule__SectionExtension__Group__58507);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4342:1: rule__SectionExtension__Group__5__Impl : ( 'section' ) ;
    public final void rule__SectionExtension__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4346:1: ( ( 'section' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4347:1: ( 'section' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4347:1: ( 'section' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4348:1: 'section'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSectionExtensionAccess().getSectionKeyword_5()); 
            }
            match(input,35,FOLLOW_35_in_rule__SectionExtension__Group__5__Impl8535); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSectionExtensionAccess().getSectionKeyword_5()); 
            }

            }


            }

        }
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4361:1: rule__SectionExtension__Group__6 : rule__SectionExtension__Group__6__Impl rule__SectionExtension__Group__7 ;
    public final void rule__SectionExtension__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4365:1: ( rule__SectionExtension__Group__6__Impl rule__SectionExtension__Group__7 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4366:2: rule__SectionExtension__Group__6__Impl rule__SectionExtension__Group__7
            {
            pushFollow(FOLLOW_rule__SectionExtension__Group__6__Impl_in_rule__SectionExtension__Group__68566);
            rule__SectionExtension__Group__6__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__SectionExtension__Group__7_in_rule__SectionExtension__Group__68569);
            rule__SectionExtension__Group__7();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4373:1: rule__SectionExtension__Group__6__Impl : ( ( rule__SectionExtension__ExtendedSectionIDAssignment_6 ) ) ;
    public final void rule__SectionExtension__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4377:1: ( ( ( rule__SectionExtension__ExtendedSectionIDAssignment_6 ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4378:1: ( ( rule__SectionExtension__ExtendedSectionIDAssignment_6 ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4378:1: ( ( rule__SectionExtension__ExtendedSectionIDAssignment_6 ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4379:1: ( rule__SectionExtension__ExtendedSectionIDAssignment_6 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSectionExtensionAccess().getExtendedSectionIDAssignment_6()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4380:1: ( rule__SectionExtension__ExtendedSectionIDAssignment_6 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4380:2: rule__SectionExtension__ExtendedSectionIDAssignment_6
            {
            pushFollow(FOLLOW_rule__SectionExtension__ExtendedSectionIDAssignment_6_in_rule__SectionExtension__Group__6__Impl8596);
            rule__SectionExtension__ExtendedSectionIDAssignment_6();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSectionExtensionAccess().getExtendedSectionIDAssignment_6()); 
            }

            }


            }

        }
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


    // $ANTLR start "rule__SectionExtension__Group__7"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4390:1: rule__SectionExtension__Group__7 : rule__SectionExtension__Group__7__Impl rule__SectionExtension__Group__8 ;
    public final void rule__SectionExtension__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4394:1: ( rule__SectionExtension__Group__7__Impl rule__SectionExtension__Group__8 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4395:2: rule__SectionExtension__Group__7__Impl rule__SectionExtension__Group__8
            {
            pushFollow(FOLLOW_rule__SectionExtension__Group__7__Impl_in_rule__SectionExtension__Group__78626);
            rule__SectionExtension__Group__7__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__SectionExtension__Group__8_in_rule__SectionExtension__Group__78629);
            rule__SectionExtension__Group__8();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SectionExtension__Group__7"


    // $ANTLR start "rule__SectionExtension__Group__7__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4402:1: rule__SectionExtension__Group__7__Impl : ( ( rule__SectionExtension__OwnedActivitiesAssignment_7 )* ) ;
    public final void rule__SectionExtension__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4406:1: ( ( ( rule__SectionExtension__OwnedActivitiesAssignment_7 )* ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4407:1: ( ( rule__SectionExtension__OwnedActivitiesAssignment_7 )* )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4407:1: ( ( rule__SectionExtension__OwnedActivitiesAssignment_7 )* )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4408:1: ( rule__SectionExtension__OwnedActivitiesAssignment_7 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSectionExtensionAccess().getOwnedActivitiesAssignment_7()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4409:1: ( rule__SectionExtension__OwnedActivitiesAssignment_7 )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==13) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4409:2: rule__SectionExtension__OwnedActivitiesAssignment_7
            	    {
            	    pushFollow(FOLLOW_rule__SectionExtension__OwnedActivitiesAssignment_7_in_rule__SectionExtension__Group__7__Impl8656);
            	    rule__SectionExtension__OwnedActivitiesAssignment_7();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop29;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSectionExtensionAccess().getOwnedActivitiesAssignment_7()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SectionExtension__Group__7__Impl"


    // $ANTLR start "rule__SectionExtension__Group__8"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4419:1: rule__SectionExtension__Group__8 : rule__SectionExtension__Group__8__Impl ;
    public final void rule__SectionExtension__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4423:1: ( rule__SectionExtension__Group__8__Impl )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4424:2: rule__SectionExtension__Group__8__Impl
            {
            pushFollow(FOLLOW_rule__SectionExtension__Group__8__Impl_in_rule__SectionExtension__Group__88687);
            rule__SectionExtension__Group__8__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SectionExtension__Group__8"


    // $ANTLR start "rule__SectionExtension__Group__8__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4430:1: rule__SectionExtension__Group__8__Impl : ( '}' ) ;
    public final void rule__SectionExtension__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4434:1: ( ( '}' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4435:1: ( '}' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4435:1: ( '}' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4436:1: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSectionExtensionAccess().getRightCurlyBracketKeyword_8()); 
            }
            match(input,16,FOLLOW_16_in_rule__SectionExtension__Group__8__Impl8715); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSectionExtensionAccess().getRightCurlyBracketKeyword_8()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SectionExtension__Group__8__Impl"


    // $ANTLR start "rule__Overview__Group__0"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4467:1: rule__Overview__Group__0 : rule__Overview__Group__0__Impl rule__Overview__Group__1 ;
    public final void rule__Overview__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4471:1: ( rule__Overview__Group__0__Impl rule__Overview__Group__1 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4472:2: rule__Overview__Group__0__Impl rule__Overview__Group__1
            {
            pushFollow(FOLLOW_rule__Overview__Group__0__Impl_in_rule__Overview__Group__08764);
            rule__Overview__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Overview__Group__1_in_rule__Overview__Group__08767);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4479:1: rule__Overview__Group__0__Impl : ( () ) ;
    public final void rule__Overview__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4483:1: ( ( () ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4484:1: ( () )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4484:1: ( () )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4485:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOverviewAccess().getOverviewAction_0()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4486:1: ()
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4488:1: 
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4498:1: rule__Overview__Group__1 : rule__Overview__Group__1__Impl rule__Overview__Group__2 ;
    public final void rule__Overview__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4502:1: ( rule__Overview__Group__1__Impl rule__Overview__Group__2 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4503:2: rule__Overview__Group__1__Impl rule__Overview__Group__2
            {
            pushFollow(FOLLOW_rule__Overview__Group__1__Impl_in_rule__Overview__Group__18825);
            rule__Overview__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Overview__Group__2_in_rule__Overview__Group__18828);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4510:1: rule__Overview__Group__1__Impl : ( 'Overview' ) ;
    public final void rule__Overview__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4514:1: ( ( 'Overview' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4515:1: ( 'Overview' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4515:1: ( 'Overview' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4516:1: 'Overview'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOverviewAccess().getOverviewKeyword_1()); 
            }
            match(input,42,FOLLOW_42_in_rule__Overview__Group__1__Impl8856); if (state.failed) return ;
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4529:1: rule__Overview__Group__2 : rule__Overview__Group__2__Impl rule__Overview__Group__3 ;
    public final void rule__Overview__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4533:1: ( rule__Overview__Group__2__Impl rule__Overview__Group__3 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4534:2: rule__Overview__Group__2__Impl rule__Overview__Group__3
            {
            pushFollow(FOLLOW_rule__Overview__Group__2__Impl_in_rule__Overview__Group__28887);
            rule__Overview__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Overview__Group__3_in_rule__Overview__Group__28890);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4541:1: rule__Overview__Group__2__Impl : ( '{' ) ;
    public final void rule__Overview__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4545:1: ( ( '{' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4546:1: ( '{' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4546:1: ( '{' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4547:1: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOverviewAccess().getLeftCurlyBracketKeyword_2()); 
            }
            match(input,15,FOLLOW_15_in_rule__Overview__Group__2__Impl8918); if (state.failed) return ;
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4560:1: rule__Overview__Group__3 : rule__Overview__Group__3__Impl rule__Overview__Group__4 ;
    public final void rule__Overview__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4564:1: ( rule__Overview__Group__3__Impl rule__Overview__Group__4 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4565:2: rule__Overview__Group__3__Impl rule__Overview__Group__4
            {
            pushFollow(FOLLOW_rule__Overview__Group__3__Impl_in_rule__Overview__Group__38949);
            rule__Overview__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Overview__Group__4_in_rule__Overview__Group__38952);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4572:1: rule__Overview__Group__3__Impl : ( ( rule__Overview__Group_3__0 )? ) ;
    public final void rule__Overview__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4576:1: ( ( ( rule__Overview__Group_3__0 )? ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4577:1: ( ( rule__Overview__Group_3__0 )? )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4577:1: ( ( rule__Overview__Group_3__0 )? )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4578:1: ( rule__Overview__Group_3__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOverviewAccess().getGroup_3()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4579:1: ( rule__Overview__Group_3__0 )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==20) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4579:2: rule__Overview__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__Overview__Group_3__0_in_rule__Overview__Group__3__Impl8979);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4589:1: rule__Overview__Group__4 : rule__Overview__Group__4__Impl rule__Overview__Group__5 ;
    public final void rule__Overview__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4593:1: ( rule__Overview__Group__4__Impl rule__Overview__Group__5 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4594:2: rule__Overview__Group__4__Impl rule__Overview__Group__5
            {
            pushFollow(FOLLOW_rule__Overview__Group__4__Impl_in_rule__Overview__Group__49010);
            rule__Overview__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Overview__Group__5_in_rule__Overview__Group__49013);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4601:1: rule__Overview__Group__4__Impl : ( ( rule__Overview__Group_4__0 )? ) ;
    public final void rule__Overview__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4605:1: ( ( ( rule__Overview__Group_4__0 )? ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4606:1: ( ( rule__Overview__Group_4__0 )? )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4606:1: ( ( rule__Overview__Group_4__0 )? )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4607:1: ( rule__Overview__Group_4__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOverviewAccess().getGroup_4()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4608:1: ( rule__Overview__Group_4__0 )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==25) ) {
                int LA31_1 = input.LA(2);

                if ( (LA31_1==26) ) {
                    alt31=1;
                }
            }
            switch (alt31) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4608:2: rule__Overview__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__Overview__Group_4__0_in_rule__Overview__Group__4__Impl9040);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4618:1: rule__Overview__Group__5 : rule__Overview__Group__5__Impl rule__Overview__Group__6 ;
    public final void rule__Overview__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4622:1: ( rule__Overview__Group__5__Impl rule__Overview__Group__6 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4623:2: rule__Overview__Group__5__Impl rule__Overview__Group__6
            {
            pushFollow(FOLLOW_rule__Overview__Group__5__Impl_in_rule__Overview__Group__59071);
            rule__Overview__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Overview__Group__6_in_rule__Overview__Group__59074);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4630:1: rule__Overview__Group__5__Impl : ( ( rule__Overview__Group_5__0 )? ) ;
    public final void rule__Overview__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4634:1: ( ( ( rule__Overview__Group_5__0 )? ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4635:1: ( ( rule__Overview__Group_5__0 )? )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4635:1: ( ( rule__Overview__Group_5__0 )? )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4636:1: ( rule__Overview__Group_5__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOverviewAccess().getGroup_5()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4637:1: ( rule__Overview__Group_5__0 )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==25) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4637:2: rule__Overview__Group_5__0
                    {
                    pushFollow(FOLLOW_rule__Overview__Group_5__0_in_rule__Overview__Group__5__Impl9101);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4647:1: rule__Overview__Group__6 : rule__Overview__Group__6__Impl ;
    public final void rule__Overview__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4651:1: ( rule__Overview__Group__6__Impl )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4652:2: rule__Overview__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__Overview__Group__6__Impl_in_rule__Overview__Group__69132);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4658:1: rule__Overview__Group__6__Impl : ( '}' ) ;
    public final void rule__Overview__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4662:1: ( ( '}' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4663:1: ( '}' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4663:1: ( '}' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4664:1: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOverviewAccess().getRightCurlyBracketKeyword_6()); 
            }
            match(input,16,FOLLOW_16_in_rule__Overview__Group__6__Impl9160); if (state.failed) return ;
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4691:1: rule__Overview__Group_3__0 : rule__Overview__Group_3__0__Impl rule__Overview__Group_3__1 ;
    public final void rule__Overview__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4695:1: ( rule__Overview__Group_3__0__Impl rule__Overview__Group_3__1 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4696:2: rule__Overview__Group_3__0__Impl rule__Overview__Group_3__1
            {
            pushFollow(FOLLOW_rule__Overview__Group_3__0__Impl_in_rule__Overview__Group_3__09205);
            rule__Overview__Group_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Overview__Group_3__1_in_rule__Overview__Group_3__09208);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4703:1: rule__Overview__Group_3__0__Impl : ( 'description' ) ;
    public final void rule__Overview__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4707:1: ( ( 'description' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4708:1: ( 'description' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4708:1: ( 'description' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4709:1: 'description'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOverviewAccess().getDescriptionKeyword_3_0()); 
            }
            match(input,20,FOLLOW_20_in_rule__Overview__Group_3__0__Impl9236); if (state.failed) return ;
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4722:1: rule__Overview__Group_3__1 : rule__Overview__Group_3__1__Impl ;
    public final void rule__Overview__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4726:1: ( rule__Overview__Group_3__1__Impl )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4727:2: rule__Overview__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__Overview__Group_3__1__Impl_in_rule__Overview__Group_3__19267);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4733:1: rule__Overview__Group_3__1__Impl : ( ( rule__Overview__DescriptionAssignment_3_1 ) ) ;
    public final void rule__Overview__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4737:1: ( ( ( rule__Overview__DescriptionAssignment_3_1 ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4738:1: ( ( rule__Overview__DescriptionAssignment_3_1 ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4738:1: ( ( rule__Overview__DescriptionAssignment_3_1 ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4739:1: ( rule__Overview__DescriptionAssignment_3_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOverviewAccess().getDescriptionAssignment_3_1()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4740:1: ( rule__Overview__DescriptionAssignment_3_1 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4740:2: rule__Overview__DescriptionAssignment_3_1
            {
            pushFollow(FOLLOW_rule__Overview__DescriptionAssignment_3_1_in_rule__Overview__Group_3__1__Impl9294);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4754:1: rule__Overview__Group_4__0 : rule__Overview__Group_4__0__Impl rule__Overview__Group_4__1 ;
    public final void rule__Overview__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4758:1: ( rule__Overview__Group_4__0__Impl rule__Overview__Group_4__1 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4759:2: rule__Overview__Group_4__0__Impl rule__Overview__Group_4__1
            {
            pushFollow(FOLLOW_rule__Overview__Group_4__0__Impl_in_rule__Overview__Group_4__09328);
            rule__Overview__Group_4__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Overview__Group_4__1_in_rule__Overview__Group_4__09331);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4766:1: rule__Overview__Group_4__0__Impl : ( 'image' ) ;
    public final void rule__Overview__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4770:1: ( ( 'image' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4771:1: ( 'image' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4771:1: ( 'image' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4772:1: 'image'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOverviewAccess().getImageKeyword_4_0()); 
            }
            match(input,25,FOLLOW_25_in_rule__Overview__Group_4__0__Impl9359); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOverviewAccess().getImageKeyword_4_0()); 
            }

            }


            }

        }
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4785:1: rule__Overview__Group_4__1 : rule__Overview__Group_4__1__Impl rule__Overview__Group_4__2 ;
    public final void rule__Overview__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4789:1: ( rule__Overview__Group_4__1__Impl rule__Overview__Group_4__2 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4790:2: rule__Overview__Group_4__1__Impl rule__Overview__Group_4__2
            {
            pushFollow(FOLLOW_rule__Overview__Group_4__1__Impl_in_rule__Overview__Group_4__19390);
            rule__Overview__Group_4__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Overview__Group_4__2_in_rule__Overview__Group_4__19393);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4797:1: rule__Overview__Group_4__1__Impl : ( 'on' ) ;
    public final void rule__Overview__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4801:1: ( ( 'on' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4802:1: ( 'on' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4802:1: ( 'on' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4803:1: 'on'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOverviewAccess().getOnKeyword_4_1()); 
            }
            match(input,26,FOLLOW_26_in_rule__Overview__Group_4__1__Impl9421); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOverviewAccess().getOnKeyword_4_1()); 
            }

            }


            }

        }
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4816:1: rule__Overview__Group_4__2 : rule__Overview__Group_4__2__Impl rule__Overview__Group_4__3 ;
    public final void rule__Overview__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4820:1: ( rule__Overview__Group_4__2__Impl rule__Overview__Group_4__3 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4821:2: rule__Overview__Group_4__2__Impl rule__Overview__Group_4__3
            {
            pushFollow(FOLLOW_rule__Overview__Group_4__2__Impl_in_rule__Overview__Group_4__29452);
            rule__Overview__Group_4__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Overview__Group_4__3_in_rule__Overview__Group_4__29455);
            rule__Overview__Group_4__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4828:1: rule__Overview__Group_4__2__Impl : ( ':' ) ;
    public final void rule__Overview__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4832:1: ( ( ':' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4833:1: ( ':' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4833:1: ( ':' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4834:1: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOverviewAccess().getColonKeyword_4_2()); 
            }
            match(input,27,FOLLOW_27_in_rule__Overview__Group_4__2__Impl9483); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOverviewAccess().getColonKeyword_4_2()); 
            }

            }


            }

        }
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


    // $ANTLR start "rule__Overview__Group_4__3"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4847:1: rule__Overview__Group_4__3 : rule__Overview__Group_4__3__Impl ;
    public final void rule__Overview__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4851:1: ( rule__Overview__Group_4__3__Impl )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4852:2: rule__Overview__Group_4__3__Impl
            {
            pushFollow(FOLLOW_rule__Overview__Group_4__3__Impl_in_rule__Overview__Group_4__39514);
            rule__Overview__Group_4__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Overview__Group_4__3"


    // $ANTLR start "rule__Overview__Group_4__3__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4858:1: rule__Overview__Group_4__3__Impl : ( ( rule__Overview__ImagePathOnAssignment_4_3 ) ) ;
    public final void rule__Overview__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4862:1: ( ( ( rule__Overview__ImagePathOnAssignment_4_3 ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4863:1: ( ( rule__Overview__ImagePathOnAssignment_4_3 ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4863:1: ( ( rule__Overview__ImagePathOnAssignment_4_3 ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4864:1: ( rule__Overview__ImagePathOnAssignment_4_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOverviewAccess().getImagePathOnAssignment_4_3()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4865:1: ( rule__Overview__ImagePathOnAssignment_4_3 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4865:2: rule__Overview__ImagePathOnAssignment_4_3
            {
            pushFollow(FOLLOW_rule__Overview__ImagePathOnAssignment_4_3_in_rule__Overview__Group_4__3__Impl9541);
            rule__Overview__ImagePathOnAssignment_4_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOverviewAccess().getImagePathOnAssignment_4_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Overview__Group_4__3__Impl"


    // $ANTLR start "rule__Overview__Group_5__0"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4883:1: rule__Overview__Group_5__0 : rule__Overview__Group_5__0__Impl rule__Overview__Group_5__1 ;
    public final void rule__Overview__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4887:1: ( rule__Overview__Group_5__0__Impl rule__Overview__Group_5__1 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4888:2: rule__Overview__Group_5__0__Impl rule__Overview__Group_5__1
            {
            pushFollow(FOLLOW_rule__Overview__Group_5__0__Impl_in_rule__Overview__Group_5__09579);
            rule__Overview__Group_5__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Overview__Group_5__1_in_rule__Overview__Group_5__09582);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4895:1: rule__Overview__Group_5__0__Impl : ( 'image' ) ;
    public final void rule__Overview__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4899:1: ( ( 'image' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4900:1: ( 'image' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4900:1: ( 'image' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4901:1: 'image'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOverviewAccess().getImageKeyword_5_0()); 
            }
            match(input,25,FOLLOW_25_in_rule__Overview__Group_5__0__Impl9610); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOverviewAccess().getImageKeyword_5_0()); 
            }

            }


            }

        }
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4914:1: rule__Overview__Group_5__1 : rule__Overview__Group_5__1__Impl rule__Overview__Group_5__2 ;
    public final void rule__Overview__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4918:1: ( rule__Overview__Group_5__1__Impl rule__Overview__Group_5__2 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4919:2: rule__Overview__Group_5__1__Impl rule__Overview__Group_5__2
            {
            pushFollow(FOLLOW_rule__Overview__Group_5__1__Impl_in_rule__Overview__Group_5__19641);
            rule__Overview__Group_5__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Overview__Group_5__2_in_rule__Overview__Group_5__19644);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4926:1: rule__Overview__Group_5__1__Impl : ( 'off' ) ;
    public final void rule__Overview__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4930:1: ( ( 'off' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4931:1: ( 'off' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4931:1: ( 'off' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4932:1: 'off'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOverviewAccess().getOffKeyword_5_1()); 
            }
            match(input,28,FOLLOW_28_in_rule__Overview__Group_5__1__Impl9672); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOverviewAccess().getOffKeyword_5_1()); 
            }

            }


            }

        }
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4945:1: rule__Overview__Group_5__2 : rule__Overview__Group_5__2__Impl rule__Overview__Group_5__3 ;
    public final void rule__Overview__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4949:1: ( rule__Overview__Group_5__2__Impl rule__Overview__Group_5__3 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4950:2: rule__Overview__Group_5__2__Impl rule__Overview__Group_5__3
            {
            pushFollow(FOLLOW_rule__Overview__Group_5__2__Impl_in_rule__Overview__Group_5__29703);
            rule__Overview__Group_5__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Overview__Group_5__3_in_rule__Overview__Group_5__29706);
            rule__Overview__Group_5__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4957:1: rule__Overview__Group_5__2__Impl : ( ':' ) ;
    public final void rule__Overview__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4961:1: ( ( ':' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4962:1: ( ':' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4962:1: ( ':' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4963:1: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOverviewAccess().getColonKeyword_5_2()); 
            }
            match(input,27,FOLLOW_27_in_rule__Overview__Group_5__2__Impl9734); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOverviewAccess().getColonKeyword_5_2()); 
            }

            }


            }

        }
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


    // $ANTLR start "rule__Overview__Group_5__3"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4976:1: rule__Overview__Group_5__3 : rule__Overview__Group_5__3__Impl ;
    public final void rule__Overview__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4980:1: ( rule__Overview__Group_5__3__Impl )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4981:2: rule__Overview__Group_5__3__Impl
            {
            pushFollow(FOLLOW_rule__Overview__Group_5__3__Impl_in_rule__Overview__Group_5__39765);
            rule__Overview__Group_5__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Overview__Group_5__3"


    // $ANTLR start "rule__Overview__Group_5__3__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4987:1: rule__Overview__Group_5__3__Impl : ( ( rule__Overview__ImagePathOffAssignment_5_3 ) ) ;
    public final void rule__Overview__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4991:1: ( ( ( rule__Overview__ImagePathOffAssignment_5_3 ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4992:1: ( ( rule__Overview__ImagePathOffAssignment_5_3 ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4992:1: ( ( rule__Overview__ImagePathOffAssignment_5_3 ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4993:1: ( rule__Overview__ImagePathOffAssignment_5_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOverviewAccess().getImagePathOffAssignment_5_3()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4994:1: ( rule__Overview__ImagePathOffAssignment_5_3 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4994:2: rule__Overview__ImagePathOffAssignment_5_3
            {
            pushFollow(FOLLOW_rule__Overview__ImagePathOffAssignment_5_3_in_rule__Overview__Group_5__3__Impl9792);
            rule__Overview__ImagePathOffAssignment_5_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOverviewAccess().getImagePathOffAssignment_5_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Overview__Group_5__3__Impl"


    // $ANTLR start "rule__FQN__Group__0"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5012:1: rule__FQN__Group__0 : rule__FQN__Group__0__Impl rule__FQN__Group__1 ;
    public final void rule__FQN__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5016:1: ( rule__FQN__Group__0__Impl rule__FQN__Group__1 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5017:2: rule__FQN__Group__0__Impl rule__FQN__Group__1
            {
            pushFollow(FOLLOW_rule__FQN__Group__0__Impl_in_rule__FQN__Group__09830);
            rule__FQN__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__FQN__Group__1_in_rule__FQN__Group__09833);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5024:1: rule__FQN__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__FQN__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5028:1: ( ( RULE_ID ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5029:1: ( RULE_ID )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5029:1: ( RULE_ID )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5030:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFQNAccess().getIDTerminalRuleCall_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__FQN__Group__0__Impl9860); if (state.failed) return ;
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5041:1: rule__FQN__Group__1 : rule__FQN__Group__1__Impl ;
    public final void rule__FQN__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5045:1: ( rule__FQN__Group__1__Impl )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5046:2: rule__FQN__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__FQN__Group__1__Impl_in_rule__FQN__Group__19889);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5052:1: rule__FQN__Group__1__Impl : ( ( rule__FQN__Group_1__0 )* ) ;
    public final void rule__FQN__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5056:1: ( ( ( rule__FQN__Group_1__0 )* ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5057:1: ( ( rule__FQN__Group_1__0 )* )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5057:1: ( ( rule__FQN__Group_1__0 )* )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5058:1: ( rule__FQN__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFQNAccess().getGroup_1()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5059:1: ( rule__FQN__Group_1__0 )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==43) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5059:2: rule__FQN__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__FQN__Group_1__0_in_rule__FQN__Group__1__Impl9916);
            	    rule__FQN__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop33;
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5073:1: rule__FQN__Group_1__0 : rule__FQN__Group_1__0__Impl rule__FQN__Group_1__1 ;
    public final void rule__FQN__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5077:1: ( rule__FQN__Group_1__0__Impl rule__FQN__Group_1__1 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5078:2: rule__FQN__Group_1__0__Impl rule__FQN__Group_1__1
            {
            pushFollow(FOLLOW_rule__FQN__Group_1__0__Impl_in_rule__FQN__Group_1__09951);
            rule__FQN__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__FQN__Group_1__1_in_rule__FQN__Group_1__09954);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5085:1: rule__FQN__Group_1__0__Impl : ( '.' ) ;
    public final void rule__FQN__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5089:1: ( ( '.' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5090:1: ( '.' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5090:1: ( '.' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5091:1: '.'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFQNAccess().getFullStopKeyword_1_0()); 
            }
            match(input,43,FOLLOW_43_in_rule__FQN__Group_1__0__Impl9982); if (state.failed) return ;
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5104:1: rule__FQN__Group_1__1 : rule__FQN__Group_1__1__Impl ;
    public final void rule__FQN__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5108:1: ( rule__FQN__Group_1__1__Impl )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5109:2: rule__FQN__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__FQN__Group_1__1__Impl_in_rule__FQN__Group_1__110013);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5115:1: rule__FQN__Group_1__1__Impl : ( ( RULE_ID ) ) ;
    public final void rule__FQN__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5119:1: ( ( ( RULE_ID ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5120:1: ( ( RULE_ID ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5120:1: ( ( RULE_ID ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5121:1: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFQNAccess().getIDTerminalRuleCall_1_1()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5122:1: ( RULE_ID )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5122:3: RULE_ID
            {
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__FQN__Group_1__1__Impl10041); if (state.failed) return ;

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


    // $ANTLR start "rule__ViewpointActivityExplorer__NameAssignment_3"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5137:1: rule__ViewpointActivityExplorer__NameAssignment_3 : ( ruleFQN ) ;
    public final void rule__ViewpointActivityExplorer__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5141:1: ( ( ruleFQN ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5142:1: ( ruleFQN )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5142:1: ( ruleFQN )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5143:1: ruleFQN
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getViewpointActivityExplorerAccess().getNameFQNParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_ruleFQN_in_rule__ViewpointActivityExplorer__NameAssignment_310080);
            ruleFQN();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getViewpointActivityExplorerAccess().getNameFQNParserRuleCall_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ViewpointActivityExplorer__NameAssignment_3"


    // $ANTLR start "rule__ViewpointActivityExplorer__OwnedPagesAssignment_5_2"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5152:1: rule__ViewpointActivityExplorer__OwnedPagesAssignment_5_2 : ( rulePage ) ;
    public final void rule__ViewpointActivityExplorer__OwnedPagesAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5156:1: ( ( rulePage ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5157:1: ( rulePage )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5157:1: ( rulePage )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5158:1: rulePage
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getViewpointActivityExplorerAccess().getOwnedPagesPageParserRuleCall_5_2_0()); 
            }
            pushFollow(FOLLOW_rulePage_in_rule__ViewpointActivityExplorer__OwnedPagesAssignment_5_210111);
            rulePage();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getViewpointActivityExplorerAccess().getOwnedPagesPageParserRuleCall_5_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ViewpointActivityExplorer__OwnedPagesAssignment_5_2"


    // $ANTLR start "rule__ViewpointActivityExplorer__OwnedPagesAssignment_6"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5167:1: rule__ViewpointActivityExplorer__OwnedPagesAssignment_6 : ( rulePageExtension ) ;
    public final void rule__ViewpointActivityExplorer__OwnedPagesAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5171:1: ( ( rulePageExtension ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5172:1: ( rulePageExtension )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5172:1: ( rulePageExtension )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5173:1: rulePageExtension
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getViewpointActivityExplorerAccess().getOwnedPagesPageExtensionParserRuleCall_6_0()); 
            }
            pushFollow(FOLLOW_rulePageExtension_in_rule__ViewpointActivityExplorer__OwnedPagesAssignment_610142);
            rulePageExtension();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getViewpointActivityExplorerAccess().getOwnedPagesPageExtensionParserRuleCall_6_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ViewpointActivityExplorer__OwnedPagesAssignment_6"


    // $ANTLR start "rule__ViewpointActivityExplorer__OwnedSectionExtensionsAssignment_7"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5182:1: rule__ViewpointActivityExplorer__OwnedSectionExtensionsAssignment_7 : ( ruleSectionExtension ) ;
    public final void rule__ViewpointActivityExplorer__OwnedSectionExtensionsAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5186:1: ( ( ruleSectionExtension ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5187:1: ( ruleSectionExtension )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5187:1: ( ruleSectionExtension )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5188:1: ruleSectionExtension
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getViewpointActivityExplorerAccess().getOwnedSectionExtensionsSectionExtensionParserRuleCall_7_0()); 
            }
            pushFollow(FOLLOW_ruleSectionExtension_in_rule__ViewpointActivityExplorer__OwnedSectionExtensionsAssignment_710173);
            ruleSectionExtension();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getViewpointActivityExplorerAccess().getOwnedSectionExtensionsSectionExtensionParserRuleCall_7_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ViewpointActivityExplorer__OwnedSectionExtensionsAssignment_7"


    // $ANTLR start "rule__Page__NameAssignment_2"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5197:1: rule__Page__NameAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Page__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5201:1: ( ( RULE_STRING ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5202:1: ( RULE_STRING )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5202:1: ( RULE_STRING )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5203:1: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPageAccess().getNameSTRINGTerminalRuleCall_2_0()); 
            }
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Page__NameAssignment_210204); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPageAccess().getNameSTRINGTerminalRuleCall_2_0()); 
            }

            }


            }

        }
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5212:1: rule__Page__DescriptionAssignment_4_1 : ( RULE_STRING ) ;
    public final void rule__Page__DescriptionAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5216:1: ( ( RULE_STRING ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5217:1: ( RULE_STRING )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5217:1: ( RULE_STRING )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5218:1: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPageAccess().getDescriptionSTRINGTerminalRuleCall_4_1_0()); 
            }
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Page__DescriptionAssignment_4_110235); if (state.failed) return ;
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


    // $ANTLR start "rule__Page__FileExtensionsAssignment_5_2"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5227:1: rule__Page__FileExtensionsAssignment_5_2 : ( RULE_STRING ) ;
    public final void rule__Page__FileExtensionsAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5231:1: ( ( RULE_STRING ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5232:1: ( RULE_STRING )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5232:1: ( RULE_STRING )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5233:1: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPageAccess().getFileExtensionsSTRINGTerminalRuleCall_5_2_0()); 
            }
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Page__FileExtensionsAssignment_5_210266); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPageAccess().getFileExtensionsSTRINGTerminalRuleCall_5_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__FileExtensionsAssignment_5_2"


    // $ANTLR start "rule__Page__ActivityExplorerItemIDAssignment_6_1"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5242:1: rule__Page__ActivityExplorerItemIDAssignment_6_1 : ( ruleFQN ) ;
    public final void rule__Page__ActivityExplorerItemIDAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5246:1: ( ( ruleFQN ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5247:1: ( ruleFQN )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5247:1: ( ruleFQN )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5248:1: ruleFQN
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPageAccess().getActivityExplorerItemIDFQNParserRuleCall_6_1_0()); 
            }
            pushFollow(FOLLOW_ruleFQN_in_rule__Page__ActivityExplorerItemIDAssignment_6_110297);
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


    // $ANTLR start "rule__Page__IndexAssignment_8"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5257:1: rule__Page__IndexAssignment_8 : ( ruleEInt ) ;
    public final void rule__Page__IndexAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5261:1: ( ( ruleEInt ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5262:1: ( ruleEInt )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5262:1: ( ruleEInt )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5263:1: ruleEInt
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPageAccess().getIndexEIntParserRuleCall_8_0()); 
            }
            pushFollow(FOLLOW_ruleEInt_in_rule__Page__IndexAssignment_810328);
            ruleEInt();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPageAccess().getIndexEIntParserRuleCall_8_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__IndexAssignment_8"


    // $ANTLR start "rule__Page__OwnedOverviewAssignment_9"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5272:1: rule__Page__OwnedOverviewAssignment_9 : ( ruleOverview ) ;
    public final void rule__Page__OwnedOverviewAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5276:1: ( ( ruleOverview ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5277:1: ( ruleOverview )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5277:1: ( ruleOverview )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5278:1: ruleOverview
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPageAccess().getOwnedOverviewOverviewParserRuleCall_9_0()); 
            }
            pushFollow(FOLLOW_ruleOverview_in_rule__Page__OwnedOverviewAssignment_910359);
            ruleOverview();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPageAccess().getOwnedOverviewOverviewParserRuleCall_9_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__OwnedOverviewAssignment_9"


    // $ANTLR start "rule__Page__ImagePathOnAssignment_10_2_3"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5287:1: rule__Page__ImagePathOnAssignment_10_2_3 : ( RULE_STRING ) ;
    public final void rule__Page__ImagePathOnAssignment_10_2_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5291:1: ( ( RULE_STRING ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5292:1: ( RULE_STRING )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5292:1: ( RULE_STRING )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5293:1: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPageAccess().getImagePathOnSTRINGTerminalRuleCall_10_2_3_0()); 
            }
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Page__ImagePathOnAssignment_10_2_310390); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPageAccess().getImagePathOnSTRINGTerminalRuleCall_10_2_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__ImagePathOnAssignment_10_2_3"


    // $ANTLR start "rule__Page__ImagePathOffAssignment_10_3_3"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5302:1: rule__Page__ImagePathOffAssignment_10_3_3 : ( RULE_STRING ) ;
    public final void rule__Page__ImagePathOffAssignment_10_3_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5306:1: ( ( RULE_STRING ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5307:1: ( RULE_STRING )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5307:1: ( RULE_STRING )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5308:1: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPageAccess().getImagePathOffSTRINGTerminalRuleCall_10_3_3_0()); 
            }
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Page__ImagePathOffAssignment_10_3_310421); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPageAccess().getImagePathOffSTRINGTerminalRuleCall_10_3_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__ImagePathOffAssignment_10_3_3"


    // $ANTLR start "rule__Page__TabNameAssignment_11_2"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5317:1: rule__Page__TabNameAssignment_11_2 : ( RULE_STRING ) ;
    public final void rule__Page__TabNameAssignment_11_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5321:1: ( ( RULE_STRING ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5322:1: ( RULE_STRING )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5322:1: ( RULE_STRING )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5323:1: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPageAccess().getTabNameSTRINGTerminalRuleCall_11_2_0()); 
            }
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Page__TabNameAssignment_11_210452); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPageAccess().getTabNameSTRINGTerminalRuleCall_11_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__TabNameAssignment_11_2"


    // $ANTLR start "rule__Page__HasPredicateAssignment_12_2"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5332:1: rule__Page__HasPredicateAssignment_12_2 : ( ruleEBoolean ) ;
    public final void rule__Page__HasPredicateAssignment_12_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5336:1: ( ( ruleEBoolean ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5337:1: ( ruleEBoolean )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5337:1: ( ruleEBoolean )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5338:1: ruleEBoolean
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPageAccess().getHasPredicateEBooleanParserRuleCall_12_2_0()); 
            }
            pushFollow(FOLLOW_ruleEBoolean_in_rule__Page__HasPredicateAssignment_12_210483);
            ruleEBoolean();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPageAccess().getHasPredicateEBooleanParserRuleCall_12_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__HasPredicateAssignment_12_2"


    // $ANTLR start "rule__Page__ShowViewerAssignment_13_3"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5347:1: rule__Page__ShowViewerAssignment_13_3 : ( ruleEBoolean ) ;
    public final void rule__Page__ShowViewerAssignment_13_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5351:1: ( ( ruleEBoolean ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5352:1: ( ruleEBoolean )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5352:1: ( ruleEBoolean )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5353:1: ruleEBoolean
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPageAccess().getShowViewerEBooleanParserRuleCall_13_3_0()); 
            }
            pushFollow(FOLLOW_ruleEBoolean_in_rule__Page__ShowViewerAssignment_13_310514);
            ruleEBoolean();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPageAccess().getShowViewerEBooleanParserRuleCall_13_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__ShowViewerAssignment_13_3"


    // $ANTLR start "rule__Page__OwnedSectionsAssignment_14_2"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5362:1: rule__Page__OwnedSectionsAssignment_14_2 : ( ruleSection ) ;
    public final void rule__Page__OwnedSectionsAssignment_14_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5366:1: ( ( ruleSection ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5367:1: ( ruleSection )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5367:1: ( ruleSection )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5368:1: ruleSection
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPageAccess().getOwnedSectionsSectionParserRuleCall_14_2_0()); 
            }
            pushFollow(FOLLOW_ruleSection_in_rule__Page__OwnedSectionsAssignment_14_210545);
            ruleSection();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPageAccess().getOwnedSectionsSectionParserRuleCall_14_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__OwnedSectionsAssignment_14_2"


    // $ANTLR start "rule__Section__NameAssignment_2"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5377:1: rule__Section__NameAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Section__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5381:1: ( ( RULE_STRING ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5382:1: ( RULE_STRING )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5382:1: ( RULE_STRING )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5383:1: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSectionAccess().getNameSTRINGTerminalRuleCall_2_0()); 
            }
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Section__NameAssignment_210576); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSectionAccess().getNameSTRINGTerminalRuleCall_2_0()); 
            }

            }


            }

        }
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5392:1: rule__Section__DescriptionAssignment_4_1 : ( RULE_STRING ) ;
    public final void rule__Section__DescriptionAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5396:1: ( ( RULE_STRING ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5397:1: ( RULE_STRING )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5397:1: ( RULE_STRING )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5398:1: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSectionAccess().getDescriptionSTRINGTerminalRuleCall_4_1_0()); 
            }
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Section__DescriptionAssignment_4_110607); if (state.failed) return ;
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5407:1: rule__Section__ActivityExplorerItemIDAssignment_5_1 : ( ruleFQN ) ;
    public final void rule__Section__ActivityExplorerItemIDAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5411:1: ( ( ruleFQN ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5412:1: ( ruleFQN )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5412:1: ( ruleFQN )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5413:1: ruleFQN
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSectionAccess().getActivityExplorerItemIDFQNParserRuleCall_5_1_0()); 
            }
            pushFollow(FOLLOW_ruleFQN_in_rule__Section__ActivityExplorerItemIDAssignment_5_110638);
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


    // $ANTLR start "rule__Section__IndexAssignment_7"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5422:1: rule__Section__IndexAssignment_7 : ( ruleEInt ) ;
    public final void rule__Section__IndexAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5426:1: ( ( ruleEInt ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5427:1: ( ruleEInt )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5427:1: ( ruleEInt )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5428:1: ruleEInt
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSectionAccess().getIndexEIntParserRuleCall_7_0()); 
            }
            pushFollow(FOLLOW_ruleEInt_in_rule__Section__IndexAssignment_710669);
            ruleEInt();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSectionAccess().getIndexEIntParserRuleCall_7_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Section__IndexAssignment_7"


    // $ANTLR start "rule__Section__FilteringAssignment_8_2"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5437:1: rule__Section__FilteringAssignment_8_2 : ( ruleEBoolean ) ;
    public final void rule__Section__FilteringAssignment_8_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5441:1: ( ( ruleEBoolean ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5442:1: ( ruleEBoolean )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5442:1: ( ruleEBoolean )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5443:1: ruleEBoolean
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSectionAccess().getFilteringEBooleanParserRuleCall_8_2_0()); 
            }
            pushFollow(FOLLOW_ruleEBoolean_in_rule__Section__FilteringAssignment_8_210700);
            ruleEBoolean();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSectionAccess().getFilteringEBooleanParserRuleCall_8_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Section__FilteringAssignment_8_2"


    // $ANTLR start "rule__Section__ExpandedAssignment_9_2"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5452:1: rule__Section__ExpandedAssignment_9_2 : ( ruleEBoolean ) ;
    public final void rule__Section__ExpandedAssignment_9_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5456:1: ( ( ruleEBoolean ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5457:1: ( ruleEBoolean )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5457:1: ( ruleEBoolean )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5458:1: ruleEBoolean
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSectionAccess().getExpandedEBooleanParserRuleCall_9_2_0()); 
            }
            pushFollow(FOLLOW_ruleEBoolean_in_rule__Section__ExpandedAssignment_9_210731);
            ruleEBoolean();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSectionAccess().getExpandedEBooleanParserRuleCall_9_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Section__ExpandedAssignment_9_2"


    // $ANTLR start "rule__Section__OwnedActivitiesAssignment_10_2"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5467:1: rule__Section__OwnedActivitiesAssignment_10_2 : ( ruleActivity ) ;
    public final void rule__Section__OwnedActivitiesAssignment_10_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5471:1: ( ( ruleActivity ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5472:1: ( ruleActivity )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5472:1: ( ruleActivity )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5473:1: ruleActivity
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSectionAccess().getOwnedActivitiesActivityParserRuleCall_10_2_0()); 
            }
            pushFollow(FOLLOW_ruleActivity_in_rule__Section__OwnedActivitiesAssignment_10_210762);
            ruleActivity();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSectionAccess().getOwnedActivitiesActivityParserRuleCall_10_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Section__OwnedActivitiesAssignment_10_2"


    // $ANTLR start "rule__Activity__NameAssignment_2"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5482:1: rule__Activity__NameAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Activity__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5486:1: ( ( RULE_STRING ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5487:1: ( RULE_STRING )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5487:1: ( RULE_STRING )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5488:1: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getActivityAccess().getNameSTRINGTerminalRuleCall_2_0()); 
            }
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Activity__NameAssignment_210793); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getActivityAccess().getNameSTRINGTerminalRuleCall_2_0()); 
            }

            }


            }

        }
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5497:1: rule__Activity__DescriptionAssignment_4_1 : ( RULE_STRING ) ;
    public final void rule__Activity__DescriptionAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5501:1: ( ( RULE_STRING ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5502:1: ( RULE_STRING )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5502:1: ( RULE_STRING )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5503:1: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getActivityAccess().getDescriptionSTRINGTerminalRuleCall_4_1_0()); 
            }
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Activity__DescriptionAssignment_4_110824); if (state.failed) return ;
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5512:1: rule__Activity__ActivityExplorerItemIDAssignment_5_1 : ( ruleFQN ) ;
    public final void rule__Activity__ActivityExplorerItemIDAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5516:1: ( ( ruleFQN ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5517:1: ( ruleFQN )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5517:1: ( ruleFQN )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5518:1: ruleFQN
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getActivityAccess().getActivityExplorerItemIDFQNParserRuleCall_5_1_0()); 
            }
            pushFollow(FOLLOW_ruleFQN_in_rule__Activity__ActivityExplorerItemIDAssignment_5_110855);
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


    // $ANTLR start "rule__Activity__IndexAssignment_7"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5527:1: rule__Activity__IndexAssignment_7 : ( ruleEInt ) ;
    public final void rule__Activity__IndexAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5531:1: ( ( ruleEInt ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5532:1: ( ruleEInt )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5532:1: ( ruleEInt )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5533:1: ruleEInt
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getActivityAccess().getIndexEIntParserRuleCall_7_0()); 
            }
            pushFollow(FOLLOW_ruleEInt_in_rule__Activity__IndexAssignment_710886);
            ruleEInt();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getActivityAccess().getIndexEIntParserRuleCall_7_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__IndexAssignment_7"


    // $ANTLR start "rule__Activity__HasPredicateAssignment_8_2"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5542:1: rule__Activity__HasPredicateAssignment_8_2 : ( ruleEBoolean ) ;
    public final void rule__Activity__HasPredicateAssignment_8_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5546:1: ( ( ruleEBoolean ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5547:1: ( ruleEBoolean )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5547:1: ( ruleEBoolean )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5548:1: ruleEBoolean
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getActivityAccess().getHasPredicateEBooleanParserRuleCall_8_2_0()); 
            }
            pushFollow(FOLLOW_ruleEBoolean_in_rule__Activity__HasPredicateAssignment_8_210917);
            ruleEBoolean();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getActivityAccess().getHasPredicateEBooleanParserRuleCall_8_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__HasPredicateAssignment_8_2"


    // $ANTLR start "rule__Activity__ImagePathOffAssignment_9_2"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5557:1: rule__Activity__ImagePathOffAssignment_9_2 : ( RULE_STRING ) ;
    public final void rule__Activity__ImagePathOffAssignment_9_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5561:1: ( ( RULE_STRING ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5562:1: ( RULE_STRING )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5562:1: ( RULE_STRING )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5563:1: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getActivityAccess().getImagePathOffSTRINGTerminalRuleCall_9_2_0()); 
            }
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Activity__ImagePathOffAssignment_9_210948); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getActivityAccess().getImagePathOffSTRINGTerminalRuleCall_9_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__ImagePathOffAssignment_9_2"


    // $ANTLR start "rule__PageExtension__ExtendedPageIDAssignment_6"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5572:1: rule__PageExtension__ExtendedPageIDAssignment_6 : ( ruleFQN ) ;
    public final void rule__PageExtension__ExtendedPageIDAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5576:1: ( ( ruleFQN ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5577:1: ( ruleFQN )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5577:1: ( ruleFQN )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5578:1: ruleFQN
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPageExtensionAccess().getExtendedPageIDFQNParserRuleCall_6_0()); 
            }
            pushFollow(FOLLOW_ruleFQN_in_rule__PageExtension__ExtendedPageIDAssignment_610979);
            ruleFQN();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPageExtensionAccess().getExtendedPageIDFQNParserRuleCall_6_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PageExtension__ExtendedPageIDAssignment_6"


    // $ANTLR start "rule__PageExtension__OwnedSectionsAssignment_7"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5587:1: rule__PageExtension__OwnedSectionsAssignment_7 : ( ruleSection ) ;
    public final void rule__PageExtension__OwnedSectionsAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5591:1: ( ( ruleSection ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5592:1: ( ruleSection )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5592:1: ( ruleSection )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5593:1: ruleSection
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPageExtensionAccess().getOwnedSectionsSectionParserRuleCall_7_0()); 
            }
            pushFollow(FOLLOW_ruleSection_in_rule__PageExtension__OwnedSectionsAssignment_711010);
            ruleSection();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPageExtensionAccess().getOwnedSectionsSectionParserRuleCall_7_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PageExtension__OwnedSectionsAssignment_7"


    // $ANTLR start "rule__SectionExtension__ExtendedSectionIDAssignment_6"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5602:1: rule__SectionExtension__ExtendedSectionIDAssignment_6 : ( ruleFQN ) ;
    public final void rule__SectionExtension__ExtendedSectionIDAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5606:1: ( ( ruleFQN ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5607:1: ( ruleFQN )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5607:1: ( ruleFQN )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5608:1: ruleFQN
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSectionExtensionAccess().getExtendedSectionIDFQNParserRuleCall_6_0()); 
            }
            pushFollow(FOLLOW_ruleFQN_in_rule__SectionExtension__ExtendedSectionIDAssignment_611041);
            ruleFQN();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSectionExtensionAccess().getExtendedSectionIDFQNParserRuleCall_6_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SectionExtension__ExtendedSectionIDAssignment_6"


    // $ANTLR start "rule__SectionExtension__OwnedActivitiesAssignment_7"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5617:1: rule__SectionExtension__OwnedActivitiesAssignment_7 : ( ruleActivity ) ;
    public final void rule__SectionExtension__OwnedActivitiesAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5621:1: ( ( ruleActivity ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5622:1: ( ruleActivity )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5622:1: ( ruleActivity )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5623:1: ruleActivity
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSectionExtensionAccess().getOwnedActivitiesActivityParserRuleCall_7_0()); 
            }
            pushFollow(FOLLOW_ruleActivity_in_rule__SectionExtension__OwnedActivitiesAssignment_711072);
            ruleActivity();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSectionExtensionAccess().getOwnedActivitiesActivityParserRuleCall_7_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SectionExtension__OwnedActivitiesAssignment_7"


    // $ANTLR start "rule__Overview__DescriptionAssignment_3_1"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5632:1: rule__Overview__DescriptionAssignment_3_1 : ( RULE_STRING ) ;
    public final void rule__Overview__DescriptionAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5636:1: ( ( RULE_STRING ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5637:1: ( RULE_STRING )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5637:1: ( RULE_STRING )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5638:1: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOverviewAccess().getDescriptionSTRINGTerminalRuleCall_3_1_0()); 
            }
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Overview__DescriptionAssignment_3_111103); if (state.failed) return ;
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


    // $ANTLR start "rule__Overview__ImagePathOnAssignment_4_3"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5647:1: rule__Overview__ImagePathOnAssignment_4_3 : ( RULE_STRING ) ;
    public final void rule__Overview__ImagePathOnAssignment_4_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5651:1: ( ( RULE_STRING ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5652:1: ( RULE_STRING )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5652:1: ( RULE_STRING )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5653:1: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOverviewAccess().getImagePathOnSTRINGTerminalRuleCall_4_3_0()); 
            }
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Overview__ImagePathOnAssignment_4_311134); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOverviewAccess().getImagePathOnSTRINGTerminalRuleCall_4_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Overview__ImagePathOnAssignment_4_3"


    // $ANTLR start "rule__Overview__ImagePathOffAssignment_5_3"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5662:1: rule__Overview__ImagePathOffAssignment_5_3 : ( RULE_STRING ) ;
    public final void rule__Overview__ImagePathOffAssignment_5_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5666:1: ( ( RULE_STRING ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5667:1: ( RULE_STRING )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5667:1: ( RULE_STRING )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5668:1: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOverviewAccess().getImagePathOffSTRINGTerminalRuleCall_5_3_0()); 
            }
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Overview__ImagePathOffAssignment_5_311165); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOverviewAccess().getImagePathOffSTRINGTerminalRuleCall_5_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Overview__ImagePathOffAssignment_5_3"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleViewpointActivityExplorer_in_entryRuleViewpointActivityExplorer67 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleViewpointActivityExplorer74 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ViewpointActivityExplorer__Group__0_in_ruleViewpointActivityExplorer100 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePage_in_entryRulePage129 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePage136 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Page__Group__0_in_rulePage162 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSection_in_entryRuleSection189 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSection196 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Section__Group__0_in_ruleSection222 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActivity_in_entryRuleActivity249 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleActivity256 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group__0_in_ruleActivity282 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePageExtension_in_entryRulePageExtension309 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePageExtension316 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PageExtension__Group__0_in_rulePageExtension342 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSectionExtension_in_entryRuleSectionExtension369 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSectionExtension376 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SectionExtension__Group__0_in_ruleSectionExtension402 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOverview_in_entryRuleOverview429 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOverview436 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Overview__Group__0_in_ruleOverview462 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFQN_in_entryRuleFQN491 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFQN498 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FQN__Group__0_in_ruleFQN524 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEBoolean_in_entryRuleEBoolean551 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEBoolean558 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EBoolean__Alternatives_in_ruleEBoolean584 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEInt_in_entryRuleEInt611 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEInt618 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleEInt644 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__EBoolean__Alternatives682 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__EBoolean__Alternatives702 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ViewpointActivityExplorer__Group__0__Impl_in_rule__ViewpointActivityExplorer__Group__0734 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__ViewpointActivityExplorer__Group__1_in_rule__ViewpointActivityExplorer__Group__0737 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ViewpointActivityExplorer__Group__1__Impl_in_rule__ViewpointActivityExplorer__Group__1795 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__ViewpointActivityExplorer__Group__2_in_rule__ViewpointActivityExplorer__Group__1798 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__ViewpointActivityExplorer__Group__1__Impl826 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ViewpointActivityExplorer__Group__2__Impl_in_rule__ViewpointActivityExplorer__Group__2857 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__ViewpointActivityExplorer__Group__3_in_rule__ViewpointActivityExplorer__Group__2860 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__ViewpointActivityExplorer__Group__2__Impl888 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ViewpointActivityExplorer__Group__3__Impl_in_rule__ViewpointActivityExplorer__Group__3919 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__ViewpointActivityExplorer__Group__4_in_rule__ViewpointActivityExplorer__Group__3922 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ViewpointActivityExplorer__NameAssignment_3_in_rule__ViewpointActivityExplorer__Group__3__Impl949 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ViewpointActivityExplorer__Group__4__Impl_in_rule__ViewpointActivityExplorer__Group__4979 = new BitSet(new long[]{0x0000000800070000L});
    public static final BitSet FOLLOW_rule__ViewpointActivityExplorer__Group__5_in_rule__ViewpointActivityExplorer__Group__4982 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__ViewpointActivityExplorer__Group__4__Impl1010 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ViewpointActivityExplorer__Group__5__Impl_in_rule__ViewpointActivityExplorer__Group__51041 = new BitSet(new long[]{0x0000000800070000L});
    public static final BitSet FOLLOW_rule__ViewpointActivityExplorer__Group__6_in_rule__ViewpointActivityExplorer__Group__51044 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ViewpointActivityExplorer__Group_5__0_in_rule__ViewpointActivityExplorer__Group__5__Impl1071 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ViewpointActivityExplorer__Group__6__Impl_in_rule__ViewpointActivityExplorer__Group__61102 = new BitSet(new long[]{0x0000000800070000L});
    public static final BitSet FOLLOW_rule__ViewpointActivityExplorer__Group__7_in_rule__ViewpointActivityExplorer__Group__61105 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ViewpointActivityExplorer__OwnedPagesAssignment_6_in_rule__ViewpointActivityExplorer__Group__6__Impl1132 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_rule__ViewpointActivityExplorer__Group__7__Impl_in_rule__ViewpointActivityExplorer__Group__71163 = new BitSet(new long[]{0x0000000800070000L});
    public static final BitSet FOLLOW_rule__ViewpointActivityExplorer__Group__8_in_rule__ViewpointActivityExplorer__Group__71166 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ViewpointActivityExplorer__OwnedSectionExtensionsAssignment_7_in_rule__ViewpointActivityExplorer__Group__7__Impl1193 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_rule__ViewpointActivityExplorer__Group__8__Impl_in_rule__ViewpointActivityExplorer__Group__81224 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__ViewpointActivityExplorer__Group__8__Impl1252 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ViewpointActivityExplorer__Group_5__0__Impl_in_rule__ViewpointActivityExplorer__Group_5__01301 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__ViewpointActivityExplorer__Group_5__1_in_rule__ViewpointActivityExplorer__Group_5__01304 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__ViewpointActivityExplorer__Group_5__0__Impl1332 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ViewpointActivityExplorer__Group_5__1__Impl_in_rule__ViewpointActivityExplorer__Group_5__11363 = new BitSet(new long[]{0x0000000000050000L});
    public static final BitSet FOLLOW_rule__ViewpointActivityExplorer__Group_5__2_in_rule__ViewpointActivityExplorer__Group_5__11366 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__ViewpointActivityExplorer__Group_5__1__Impl1394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ViewpointActivityExplorer__Group_5__2__Impl_in_rule__ViewpointActivityExplorer__Group_5__21425 = new BitSet(new long[]{0x0000000000050000L});
    public static final BitSet FOLLOW_rule__ViewpointActivityExplorer__Group_5__3_in_rule__ViewpointActivityExplorer__Group_5__21428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ViewpointActivityExplorer__OwnedPagesAssignment_5_2_in_rule__ViewpointActivityExplorer__Group_5__2__Impl1455 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_rule__ViewpointActivityExplorer__Group_5__3__Impl_in_rule__ViewpointActivityExplorer__Group_5__31486 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__ViewpointActivityExplorer__Group_5__3__Impl1514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Page__Group__0__Impl_in_rule__Page__Group__01553 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__Page__Group__1_in_rule__Page__Group__01556 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Page__Group__1__Impl_in_rule__Page__Group__11614 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Page__Group__2_in_rule__Page__Group__11617 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Page__Group__1__Impl1645 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Page__Group__2__Impl_in_rule__Page__Group__21676 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__Page__Group__3_in_rule__Page__Group__21679 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Page__NameAssignment_2_in_rule__Page__Group__2__Impl1706 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Page__Group__3__Impl_in_rule__Page__Group__31736 = new BitSet(new long[]{0x0000000000B80000L});
    public static final BitSet FOLLOW_rule__Page__Group__4_in_rule__Page__Group__31739 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Page__Group__3__Impl1767 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Page__Group__4__Impl_in_rule__Page__Group__41798 = new BitSet(new long[]{0x0000000000B80000L});
    public static final BitSet FOLLOW_rule__Page__Group__5_in_rule__Page__Group__41801 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Page__Group_4__0_in_rule__Page__Group__4__Impl1828 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Page__Group__5__Impl_in_rule__Page__Group__51859 = new BitSet(new long[]{0x0000000000B80000L});
    public static final BitSet FOLLOW_rule__Page__Group__6_in_rule__Page__Group__51862 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Page__Group_5__0_in_rule__Page__Group__5__Impl1889 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Page__Group__6__Impl_in_rule__Page__Group__61920 = new BitSet(new long[]{0x0000000000B80000L});
    public static final BitSet FOLLOW_rule__Page__Group__7_in_rule__Page__Group__61923 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Page__Group_6__0_in_rule__Page__Group__6__Impl1950 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Page__Group__7__Impl_in_rule__Page__Group__71981 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Page__Group__8_in_rule__Page__Group__71984 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Page__Group__7__Impl2012 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Page__Group__8__Impl_in_rule__Page__Group__82043 = new BitSet(new long[]{0x00000405A1010000L});
    public static final BitSet FOLLOW_rule__Page__Group__9_in_rule__Page__Group__82046 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Page__IndexAssignment_8_in_rule__Page__Group__8__Impl2073 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Page__Group__9__Impl_in_rule__Page__Group__92103 = new BitSet(new long[]{0x00000405A1010000L});
    public static final BitSet FOLLOW_rule__Page__Group__10_in_rule__Page__Group__92106 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Page__OwnedOverviewAssignment_9_in_rule__Page__Group__9__Impl2133 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Page__Group__10__Impl_in_rule__Page__Group__102164 = new BitSet(new long[]{0x00000405A1010000L});
    public static final BitSet FOLLOW_rule__Page__Group__11_in_rule__Page__Group__102167 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Page__Group_10__0_in_rule__Page__Group__10__Impl2194 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Page__Group__11__Impl_in_rule__Page__Group__112225 = new BitSet(new long[]{0x00000405A1010000L});
    public static final BitSet FOLLOW_rule__Page__Group__12_in_rule__Page__Group__112228 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Page__Group_11__0_in_rule__Page__Group__11__Impl2255 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Page__Group__12__Impl_in_rule__Page__Group__122286 = new BitSet(new long[]{0x00000405A1010000L});
    public static final BitSet FOLLOW_rule__Page__Group__13_in_rule__Page__Group__122289 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Page__Group_12__0_in_rule__Page__Group__12__Impl2316 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Page__Group__13__Impl_in_rule__Page__Group__132347 = new BitSet(new long[]{0x00000405A1010000L});
    public static final BitSet FOLLOW_rule__Page__Group__14_in_rule__Page__Group__132350 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Page__Group_13__0_in_rule__Page__Group__13__Impl2377 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Page__Group__14__Impl_in_rule__Page__Group__142408 = new BitSet(new long[]{0x00000405A1010000L});
    public static final BitSet FOLLOW_rule__Page__Group__15_in_rule__Page__Group__142411 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Page__Group_14__0_in_rule__Page__Group__14__Impl2438 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Page__Group__15__Impl_in_rule__Page__Group__152469 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Page__Group__15__Impl2497 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Page__Group_4__0__Impl_in_rule__Page__Group_4__02560 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Page__Group_4__1_in_rule__Page__Group_4__02563 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Page__Group_4__0__Impl2591 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Page__Group_4__1__Impl_in_rule__Page__Group_4__12622 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Page__DescriptionAssignment_4_1_in_rule__Page__Group_4__1__Impl2649 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Page__Group_5__0__Impl_in_rule__Page__Group_5__02683 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__Page__Group_5__1_in_rule__Page__Group_5__02686 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Page__Group_5__0__Impl2714 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Page__Group_5__1__Impl_in_rule__Page__Group_5__12745 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Page__Group_5__2_in_rule__Page__Group_5__12748 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Page__Group_5__1__Impl2776 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Page__Group_5__2__Impl_in_rule__Page__Group_5__22807 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Page__FileExtensionsAssignment_5_2_in_rule__Page__Group_5__2__Impl2834 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Page__Group_6__0__Impl_in_rule__Page__Group_6__02870 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Page__Group_6__1_in_rule__Page__Group_6__02873 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Page__Group_6__0__Impl2901 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Page__Group_6__1__Impl_in_rule__Page__Group_6__12932 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Page__ActivityExplorerItemIDAssignment_6_1_in_rule__Page__Group_6__1__Impl2959 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Page__Group_10__0__Impl_in_rule__Page__Group_10__02993 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__Page__Group_10__1_in_rule__Page__Group_10__02996 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Page__Group_10__0__Impl3024 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Page__Group_10__1__Impl_in_rule__Page__Group_10__13055 = new BitSet(new long[]{0x0000000002010000L});
    public static final BitSet FOLLOW_rule__Page__Group_10__2_in_rule__Page__Group_10__13058 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Page__Group_10__1__Impl3086 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Page__Group_10__2__Impl_in_rule__Page__Group_10__23117 = new BitSet(new long[]{0x0000000002010000L});
    public static final BitSet FOLLOW_rule__Page__Group_10__3_in_rule__Page__Group_10__23120 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Page__Group_10_2__0_in_rule__Page__Group_10__2__Impl3147 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Page__Group_10__3__Impl_in_rule__Page__Group_10__33178 = new BitSet(new long[]{0x0000000002010000L});
    public static final BitSet FOLLOW_rule__Page__Group_10__4_in_rule__Page__Group_10__33181 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Page__Group_10_3__0_in_rule__Page__Group_10__3__Impl3208 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Page__Group_10__4__Impl_in_rule__Page__Group_10__43239 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Page__Group_10__4__Impl3267 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Page__Group_10_2__0__Impl_in_rule__Page__Group_10_2__03308 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__Page__Group_10_2__1_in_rule__Page__Group_10_2__03311 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Page__Group_10_2__0__Impl3339 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Page__Group_10_2__1__Impl_in_rule__Page__Group_10_2__13370 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__Page__Group_10_2__2_in_rule__Page__Group_10_2__13373 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Page__Group_10_2__1__Impl3401 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Page__Group_10_2__2__Impl_in_rule__Page__Group_10_2__23432 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Page__Group_10_2__3_in_rule__Page__Group_10_2__23435 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__Page__Group_10_2__2__Impl3463 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Page__Group_10_2__3__Impl_in_rule__Page__Group_10_2__33494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Page__ImagePathOnAssignment_10_2_3_in_rule__Page__Group_10_2__3__Impl3521 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Page__Group_10_3__0__Impl_in_rule__Page__Group_10_3__03559 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__Page__Group_10_3__1_in_rule__Page__Group_10_3__03562 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Page__Group_10_3__0__Impl3590 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Page__Group_10_3__1__Impl_in_rule__Page__Group_10_3__13621 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__Page__Group_10_3__2_in_rule__Page__Group_10_3__13624 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__Page__Group_10_3__1__Impl3652 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Page__Group_10_3__2__Impl_in_rule__Page__Group_10_3__23683 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Page__Group_10_3__3_in_rule__Page__Group_10_3__23686 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__Page__Group_10_3__2__Impl3714 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Page__Group_10_3__3__Impl_in_rule__Page__Group_10_3__33745 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Page__ImagePathOffAssignment_10_3_3_in_rule__Page__Group_10_3__3__Impl3772 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Page__Group_11__0__Impl_in_rule__Page__Group_11__03810 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__Page__Group_11__1_in_rule__Page__Group_11__03813 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__Page__Group_11__0__Impl3841 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Page__Group_11__1__Impl_in_rule__Page__Group_11__13872 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Page__Group_11__2_in_rule__Page__Group_11__13875 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__Page__Group_11__1__Impl3903 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Page__Group_11__2__Impl_in_rule__Page__Group_11__23934 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Page__TabNameAssignment_11_2_in_rule__Page__Group_11__2__Impl3961 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Page__Group_12__0__Impl_in_rule__Page__Group_12__03997 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__Page__Group_12__1_in_rule__Page__Group_12__04000 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__Page__Group_12__0__Impl4028 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Page__Group_12__1__Impl_in_rule__Page__Group_12__14059 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_rule__Page__Group_12__2_in_rule__Page__Group_12__14062 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__Page__Group_12__1__Impl4090 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Page__Group_12__2__Impl_in_rule__Page__Group_12__24121 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Page__HasPredicateAssignment_12_2_in_rule__Page__Group_12__2__Impl4148 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Page__Group_13__0__Impl_in_rule__Page__Group_13__04184 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_rule__Page__Group_13__1_in_rule__Page__Group_13__04187 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__Page__Group_13__0__Impl4215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Page__Group_13__1__Impl_in_rule__Page__Group_13__14246 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__Page__Group_13__2_in_rule__Page__Group_13__14249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__Page__Group_13__1__Impl4277 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Page__Group_13__2__Impl_in_rule__Page__Group_13__24308 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_rule__Page__Group_13__3_in_rule__Page__Group_13__24311 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__Page__Group_13__2__Impl4339 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Page__Group_13__3__Impl_in_rule__Page__Group_13__34370 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Page__ShowViewerAssignment_13_3_in_rule__Page__Group_13__3__Impl4397 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Page__Group_14__0__Impl_in_rule__Page__Group_14__04435 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__Page__Group_14__1_in_rule__Page__Group_14__04438 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__Page__Group_14__0__Impl4466 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Page__Group_14__1__Impl_in_rule__Page__Group_14__14497 = new BitSet(new long[]{0x0000000800010000L});
    public static final BitSet FOLLOW_rule__Page__Group_14__2_in_rule__Page__Group_14__14500 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Page__Group_14__1__Impl4528 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Page__Group_14__2__Impl_in_rule__Page__Group_14__24559 = new BitSet(new long[]{0x0000000800010000L});
    public static final BitSet FOLLOW_rule__Page__Group_14__3_in_rule__Page__Group_14__24562 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Page__OwnedSectionsAssignment_14_2_in_rule__Page__Group_14__2__Impl4589 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_rule__Page__Group_14__3__Impl_in_rule__Page__Group_14__34620 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Page__Group_14__3__Impl4648 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Section__Group__0__Impl_in_rule__Section__Group__04687 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_rule__Section__Group__1_in_rule__Section__Group__04690 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Section__Group__1__Impl_in_rule__Section__Group__14748 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Section__Group__2_in_rule__Section__Group__14751 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__Section__Group__1__Impl4779 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Section__Group__2__Impl_in_rule__Section__Group__24810 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__Section__Group__3_in_rule__Section__Group__24813 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Section__NameAssignment_2_in_rule__Section__Group__2__Impl4840 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Section__Group__3__Impl_in_rule__Section__Group__34870 = new BitSet(new long[]{0x0000000000980000L});
    public static final BitSet FOLLOW_rule__Section__Group__4_in_rule__Section__Group__34873 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Section__Group__3__Impl4901 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Section__Group__4__Impl_in_rule__Section__Group__44932 = new BitSet(new long[]{0x0000000000980000L});
    public static final BitSet FOLLOW_rule__Section__Group__5_in_rule__Section__Group__44935 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Section__Group_4__0_in_rule__Section__Group__4__Impl4962 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Section__Group__5__Impl_in_rule__Section__Group__54993 = new BitSet(new long[]{0x0000000000980000L});
    public static final BitSet FOLLOW_rule__Section__Group__6_in_rule__Section__Group__54996 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Section__Group_5__0_in_rule__Section__Group__5__Impl5023 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Section__Group__6__Impl_in_rule__Section__Group__65054 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Section__Group__7_in_rule__Section__Group__65057 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Section__Group__6__Impl5085 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Section__Group__7__Impl_in_rule__Section__Group__75116 = new BitSet(new long[]{0x0000007000010000L});
    public static final BitSet FOLLOW_rule__Section__Group__8_in_rule__Section__Group__75119 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Section__IndexAssignment_7_in_rule__Section__Group__7__Impl5146 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Section__Group__8__Impl_in_rule__Section__Group__85176 = new BitSet(new long[]{0x0000007000010000L});
    public static final BitSet FOLLOW_rule__Section__Group__9_in_rule__Section__Group__85179 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Section__Group_8__0_in_rule__Section__Group__8__Impl5206 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Section__Group__9__Impl_in_rule__Section__Group__95237 = new BitSet(new long[]{0x0000007000010000L});
    public static final BitSet FOLLOW_rule__Section__Group__10_in_rule__Section__Group__95240 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Section__Group_9__0_in_rule__Section__Group__9__Impl5267 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Section__Group__10__Impl_in_rule__Section__Group__105298 = new BitSet(new long[]{0x0000007000010000L});
    public static final BitSet FOLLOW_rule__Section__Group__11_in_rule__Section__Group__105301 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Section__Group_10__0_in_rule__Section__Group__10__Impl5328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Section__Group__11__Impl_in_rule__Section__Group__115359 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Section__Group__11__Impl5387 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Section__Group_4__0__Impl_in_rule__Section__Group_4__05442 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Section__Group_4__1_in_rule__Section__Group_4__05445 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Section__Group_4__0__Impl5473 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Section__Group_4__1__Impl_in_rule__Section__Group_4__15504 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Section__DescriptionAssignment_4_1_in_rule__Section__Group_4__1__Impl5531 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Section__Group_5__0__Impl_in_rule__Section__Group_5__05565 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Section__Group_5__1_in_rule__Section__Group_5__05568 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Section__Group_5__0__Impl5596 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Section__Group_5__1__Impl_in_rule__Section__Group_5__15627 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Section__ActivityExplorerItemIDAssignment_5_1_in_rule__Section__Group_5__1__Impl5654 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Section__Group_8__0__Impl_in_rule__Section__Group_8__05688 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__Section__Group_8__1_in_rule__Section__Group_8__05691 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__Section__Group_8__0__Impl5719 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Section__Group_8__1__Impl_in_rule__Section__Group_8__15750 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_rule__Section__Group_8__2_in_rule__Section__Group_8__15753 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__Section__Group_8__1__Impl5781 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Section__Group_8__2__Impl_in_rule__Section__Group_8__25812 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Section__FilteringAssignment_8_2_in_rule__Section__Group_8__2__Impl5839 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Section__Group_9__0__Impl_in_rule__Section__Group_9__05875 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__Section__Group_9__1_in_rule__Section__Group_9__05878 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__Section__Group_9__0__Impl5906 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Section__Group_9__1__Impl_in_rule__Section__Group_9__15937 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_rule__Section__Group_9__2_in_rule__Section__Group_9__15940 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__Section__Group_9__1__Impl5968 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Section__Group_9__2__Impl_in_rule__Section__Group_9__25999 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Section__ExpandedAssignment_9_2_in_rule__Section__Group_9__2__Impl6026 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Section__Group_10__0__Impl_in_rule__Section__Group_10__06062 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__Section__Group_10__1_in_rule__Section__Group_10__06065 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__Section__Group_10__0__Impl6093 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Section__Group_10__1__Impl_in_rule__Section__Group_10__16124 = new BitSet(new long[]{0x0000000000012000L});
    public static final BitSet FOLLOW_rule__Section__Group_10__2_in_rule__Section__Group_10__16127 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Section__Group_10__1__Impl6155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Section__Group_10__2__Impl_in_rule__Section__Group_10__26186 = new BitSet(new long[]{0x0000000000012000L});
    public static final BitSet FOLLOW_rule__Section__Group_10__3_in_rule__Section__Group_10__26189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Section__OwnedActivitiesAssignment_10_2_in_rule__Section__Group_10__2__Impl6216 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_rule__Section__Group_10__3__Impl_in_rule__Section__Group_10__36247 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Section__Group_10__3__Impl6275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group__0__Impl_in_rule__Activity__Group__06314 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__Activity__Group__1_in_rule__Activity__Group__06317 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group__1__Impl_in_rule__Activity__Group__16375 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Activity__Group__2_in_rule__Activity__Group__16378 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Activity__Group__1__Impl6406 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group__2__Impl_in_rule__Activity__Group__26437 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__Activity__Group__3_in_rule__Activity__Group__26440 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__NameAssignment_2_in_rule__Activity__Group__2__Impl6467 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group__3__Impl_in_rule__Activity__Group__36497 = new BitSet(new long[]{0x0000000000980000L});
    public static final BitSet FOLLOW_rule__Activity__Group__4_in_rule__Activity__Group__36500 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Activity__Group__3__Impl6528 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group__4__Impl_in_rule__Activity__Group__46559 = new BitSet(new long[]{0x0000000000980000L});
    public static final BitSet FOLLOW_rule__Activity__Group__5_in_rule__Activity__Group__46562 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group_4__0_in_rule__Activity__Group__4__Impl6589 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group__5__Impl_in_rule__Activity__Group__56620 = new BitSet(new long[]{0x0000000000980000L});
    public static final BitSet FOLLOW_rule__Activity__Group__6_in_rule__Activity__Group__56623 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group_5__0_in_rule__Activity__Group__5__Impl6650 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group__6__Impl_in_rule__Activity__Group__66681 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Activity__Group__7_in_rule__Activity__Group__66684 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Activity__Group__6__Impl6712 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group__7__Impl_in_rule__Activity__Group__76743 = new BitSet(new long[]{0x0000008080010000L});
    public static final BitSet FOLLOW_rule__Activity__Group__8_in_rule__Activity__Group__76746 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__IndexAssignment_7_in_rule__Activity__Group__7__Impl6773 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group__8__Impl_in_rule__Activity__Group__86803 = new BitSet(new long[]{0x0000008080010000L});
    public static final BitSet FOLLOW_rule__Activity__Group__9_in_rule__Activity__Group__86806 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group_8__0_in_rule__Activity__Group__8__Impl6833 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group__9__Impl_in_rule__Activity__Group__96864 = new BitSet(new long[]{0x0000008080010000L});
    public static final BitSet FOLLOW_rule__Activity__Group__10_in_rule__Activity__Group__96867 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group_9__0_in_rule__Activity__Group__9__Impl6894 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group__10__Impl_in_rule__Activity__Group__106925 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Activity__Group__10__Impl6953 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group_4__0__Impl_in_rule__Activity__Group_4__07006 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Activity__Group_4__1_in_rule__Activity__Group_4__07009 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Activity__Group_4__0__Impl7037 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group_4__1__Impl_in_rule__Activity__Group_4__17068 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__DescriptionAssignment_4_1_in_rule__Activity__Group_4__1__Impl7095 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group_5__0__Impl_in_rule__Activity__Group_5__07129 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Activity__Group_5__1_in_rule__Activity__Group_5__07132 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Activity__Group_5__0__Impl7160 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group_5__1__Impl_in_rule__Activity__Group_5__17191 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__ActivityExplorerItemIDAssignment_5_1_in_rule__Activity__Group_5__1__Impl7218 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group_8__0__Impl_in_rule__Activity__Group_8__07252 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__Activity__Group_8__1_in_rule__Activity__Group_8__07255 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__Activity__Group_8__0__Impl7283 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group_8__1__Impl_in_rule__Activity__Group_8__17314 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_rule__Activity__Group_8__2_in_rule__Activity__Group_8__17317 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__Activity__Group_8__1__Impl7345 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group_8__2__Impl_in_rule__Activity__Group_8__27376 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__HasPredicateAssignment_8_2_in_rule__Activity__Group_8__2__Impl7403 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group_9__0__Impl_in_rule__Activity__Group_9__07439 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__Activity__Group_9__1_in_rule__Activity__Group_9__07442 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__Activity__Group_9__0__Impl7470 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group_9__1__Impl_in_rule__Activity__Group_9__17501 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Activity__Group_9__2_in_rule__Activity__Group_9__17504 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__Activity__Group_9__1__Impl7532 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group_9__2__Impl_in_rule__Activity__Group_9__27563 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__ImagePathOffAssignment_9_2_in_rule__Activity__Group_9__2__Impl7590 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PageExtension__Group__0__Impl_in_rule__PageExtension__Group__07626 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__PageExtension__Group__1_in_rule__PageExtension__Group__07629 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PageExtension__Group__1__Impl_in_rule__PageExtension__Group__17687 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_rule__PageExtension__Group__2_in_rule__PageExtension__Group__17690 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__PageExtension__Group__1__Impl7718 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PageExtension__Group__2__Impl_in_rule__PageExtension__Group__27749 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__PageExtension__Group__3_in_rule__PageExtension__Group__27752 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__PageExtension__Group__2__Impl7780 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PageExtension__Group__3__Impl_in_rule__PageExtension__Group__37811 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_rule__PageExtension__Group__4_in_rule__PageExtension__Group__37814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__PageExtension__Group__3__Impl7842 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PageExtension__Group__4__Impl_in_rule__PageExtension__Group__47873 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__PageExtension__Group__5_in_rule__PageExtension__Group__47876 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__PageExtension__Group__4__Impl7904 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PageExtension__Group__5__Impl_in_rule__PageExtension__Group__57935 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__PageExtension__Group__6_in_rule__PageExtension__Group__57938 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__PageExtension__Group__5__Impl7966 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PageExtension__Group__6__Impl_in_rule__PageExtension__Group__67997 = new BitSet(new long[]{0x0000000800010000L});
    public static final BitSet FOLLOW_rule__PageExtension__Group__7_in_rule__PageExtension__Group__68000 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PageExtension__ExtendedPageIDAssignment_6_in_rule__PageExtension__Group__6__Impl8027 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PageExtension__Group__7__Impl_in_rule__PageExtension__Group__78057 = new BitSet(new long[]{0x0000000800010000L});
    public static final BitSet FOLLOW_rule__PageExtension__Group__8_in_rule__PageExtension__Group__78060 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PageExtension__OwnedSectionsAssignment_7_in_rule__PageExtension__Group__7__Impl8087 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_rule__PageExtension__Group__8__Impl_in_rule__PageExtension__Group__88118 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__PageExtension__Group__8__Impl8146 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SectionExtension__Group__0__Impl_in_rule__SectionExtension__Group__08195 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_rule__SectionExtension__Group__1_in_rule__SectionExtension__Group__08198 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SectionExtension__Group__1__Impl_in_rule__SectionExtension__Group__18256 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_rule__SectionExtension__Group__2_in_rule__SectionExtension__Group__18259 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__SectionExtension__Group__1__Impl8287 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SectionExtension__Group__2__Impl_in_rule__SectionExtension__Group__28318 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__SectionExtension__Group__3_in_rule__SectionExtension__Group__28321 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__SectionExtension__Group__2__Impl8349 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SectionExtension__Group__3__Impl_in_rule__SectionExtension__Group__38380 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_rule__SectionExtension__Group__4_in_rule__SectionExtension__Group__38383 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__SectionExtension__Group__3__Impl8411 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SectionExtension__Group__4__Impl_in_rule__SectionExtension__Group__48442 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_rule__SectionExtension__Group__5_in_rule__SectionExtension__Group__48445 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__SectionExtension__Group__4__Impl8473 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SectionExtension__Group__5__Impl_in_rule__SectionExtension__Group__58504 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__SectionExtension__Group__6_in_rule__SectionExtension__Group__58507 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__SectionExtension__Group__5__Impl8535 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SectionExtension__Group__6__Impl_in_rule__SectionExtension__Group__68566 = new BitSet(new long[]{0x0000000000012000L});
    public static final BitSet FOLLOW_rule__SectionExtension__Group__7_in_rule__SectionExtension__Group__68569 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SectionExtension__ExtendedSectionIDAssignment_6_in_rule__SectionExtension__Group__6__Impl8596 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SectionExtension__Group__7__Impl_in_rule__SectionExtension__Group__78626 = new BitSet(new long[]{0x0000000000012000L});
    public static final BitSet FOLLOW_rule__SectionExtension__Group__8_in_rule__SectionExtension__Group__78629 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SectionExtension__OwnedActivitiesAssignment_7_in_rule__SectionExtension__Group__7__Impl8656 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_rule__SectionExtension__Group__8__Impl_in_rule__SectionExtension__Group__88687 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__SectionExtension__Group__8__Impl8715 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Overview__Group__0__Impl_in_rule__Overview__Group__08764 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_rule__Overview__Group__1_in_rule__Overview__Group__08767 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Overview__Group__1__Impl_in_rule__Overview__Group__18825 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__Overview__Group__2_in_rule__Overview__Group__18828 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_rule__Overview__Group__1__Impl8856 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Overview__Group__2__Impl_in_rule__Overview__Group__28887 = new BitSet(new long[]{0x0000000002110000L});
    public static final BitSet FOLLOW_rule__Overview__Group__3_in_rule__Overview__Group__28890 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Overview__Group__2__Impl8918 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Overview__Group__3__Impl_in_rule__Overview__Group__38949 = new BitSet(new long[]{0x0000000002110000L});
    public static final BitSet FOLLOW_rule__Overview__Group__4_in_rule__Overview__Group__38952 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Overview__Group_3__0_in_rule__Overview__Group__3__Impl8979 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Overview__Group__4__Impl_in_rule__Overview__Group__49010 = new BitSet(new long[]{0x0000000002110000L});
    public static final BitSet FOLLOW_rule__Overview__Group__5_in_rule__Overview__Group__49013 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Overview__Group_4__0_in_rule__Overview__Group__4__Impl9040 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Overview__Group__5__Impl_in_rule__Overview__Group__59071 = new BitSet(new long[]{0x0000000002110000L});
    public static final BitSet FOLLOW_rule__Overview__Group__6_in_rule__Overview__Group__59074 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Overview__Group_5__0_in_rule__Overview__Group__5__Impl9101 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Overview__Group__6__Impl_in_rule__Overview__Group__69132 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Overview__Group__6__Impl9160 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Overview__Group_3__0__Impl_in_rule__Overview__Group_3__09205 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Overview__Group_3__1_in_rule__Overview__Group_3__09208 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Overview__Group_3__0__Impl9236 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Overview__Group_3__1__Impl_in_rule__Overview__Group_3__19267 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Overview__DescriptionAssignment_3_1_in_rule__Overview__Group_3__1__Impl9294 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Overview__Group_4__0__Impl_in_rule__Overview__Group_4__09328 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__Overview__Group_4__1_in_rule__Overview__Group_4__09331 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Overview__Group_4__0__Impl9359 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Overview__Group_4__1__Impl_in_rule__Overview__Group_4__19390 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__Overview__Group_4__2_in_rule__Overview__Group_4__19393 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Overview__Group_4__1__Impl9421 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Overview__Group_4__2__Impl_in_rule__Overview__Group_4__29452 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Overview__Group_4__3_in_rule__Overview__Group_4__29455 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__Overview__Group_4__2__Impl9483 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Overview__Group_4__3__Impl_in_rule__Overview__Group_4__39514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Overview__ImagePathOnAssignment_4_3_in_rule__Overview__Group_4__3__Impl9541 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Overview__Group_5__0__Impl_in_rule__Overview__Group_5__09579 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__Overview__Group_5__1_in_rule__Overview__Group_5__09582 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Overview__Group_5__0__Impl9610 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Overview__Group_5__1__Impl_in_rule__Overview__Group_5__19641 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__Overview__Group_5__2_in_rule__Overview__Group_5__19644 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__Overview__Group_5__1__Impl9672 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Overview__Group_5__2__Impl_in_rule__Overview__Group_5__29703 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Overview__Group_5__3_in_rule__Overview__Group_5__29706 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__Overview__Group_5__2__Impl9734 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Overview__Group_5__3__Impl_in_rule__Overview__Group_5__39765 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Overview__ImagePathOffAssignment_5_3_in_rule__Overview__Group_5__3__Impl9792 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FQN__Group__0__Impl_in_rule__FQN__Group__09830 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_rule__FQN__Group__1_in_rule__FQN__Group__09833 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__FQN__Group__0__Impl9860 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FQN__Group__1__Impl_in_rule__FQN__Group__19889 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FQN__Group_1__0_in_rule__FQN__Group__1__Impl9916 = new BitSet(new long[]{0x0000080000000002L});
    public static final BitSet FOLLOW_rule__FQN__Group_1__0__Impl_in_rule__FQN__Group_1__09951 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__FQN__Group_1__1_in_rule__FQN__Group_1__09954 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_rule__FQN__Group_1__0__Impl9982 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FQN__Group_1__1__Impl_in_rule__FQN__Group_1__110013 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__FQN__Group_1__1__Impl10041 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFQN_in_rule__ViewpointActivityExplorer__NameAssignment_310080 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePage_in_rule__ViewpointActivityExplorer__OwnedPagesAssignment_5_210111 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePageExtension_in_rule__ViewpointActivityExplorer__OwnedPagesAssignment_610142 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSectionExtension_in_rule__ViewpointActivityExplorer__OwnedSectionExtensionsAssignment_710173 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Page__NameAssignment_210204 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Page__DescriptionAssignment_4_110235 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Page__FileExtensionsAssignment_5_210266 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFQN_in_rule__Page__ActivityExplorerItemIDAssignment_6_110297 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEInt_in_rule__Page__IndexAssignment_810328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOverview_in_rule__Page__OwnedOverviewAssignment_910359 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Page__ImagePathOnAssignment_10_2_310390 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Page__ImagePathOffAssignment_10_3_310421 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Page__TabNameAssignment_11_210452 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEBoolean_in_rule__Page__HasPredicateAssignment_12_210483 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEBoolean_in_rule__Page__ShowViewerAssignment_13_310514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSection_in_rule__Page__OwnedSectionsAssignment_14_210545 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Section__NameAssignment_210576 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Section__DescriptionAssignment_4_110607 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFQN_in_rule__Section__ActivityExplorerItemIDAssignment_5_110638 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEInt_in_rule__Section__IndexAssignment_710669 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEBoolean_in_rule__Section__FilteringAssignment_8_210700 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEBoolean_in_rule__Section__ExpandedAssignment_9_210731 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActivity_in_rule__Section__OwnedActivitiesAssignment_10_210762 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Activity__NameAssignment_210793 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Activity__DescriptionAssignment_4_110824 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFQN_in_rule__Activity__ActivityExplorerItemIDAssignment_5_110855 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEInt_in_rule__Activity__IndexAssignment_710886 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEBoolean_in_rule__Activity__HasPredicateAssignment_8_210917 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Activity__ImagePathOffAssignment_9_210948 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFQN_in_rule__PageExtension__ExtendedPageIDAssignment_610979 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSection_in_rule__PageExtension__OwnedSectionsAssignment_711010 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFQN_in_rule__SectionExtension__ExtendedSectionIDAssignment_611041 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActivity_in_rule__SectionExtension__OwnedActivitiesAssignment_711072 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Overview__DescriptionAssignment_3_111103 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Overview__ImagePathOnAssignment_4_311134 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Overview__ImagePathOffAssignment_5_311165 = new BitSet(new long[]{0x0000000000000002L});

}
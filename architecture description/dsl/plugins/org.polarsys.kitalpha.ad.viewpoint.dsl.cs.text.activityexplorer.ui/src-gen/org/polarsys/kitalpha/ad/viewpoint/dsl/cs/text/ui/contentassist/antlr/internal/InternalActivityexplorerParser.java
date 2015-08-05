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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'true'", "'false'", "'activity'", "'explorer'", "'{'", "'}'", "'pages'", "'page'", "'index'", "'sections'", "'description'", "'file'", "'extension'", "'id'", "'header'", "'image'", "'on'", "':'", "'off'", "'tab'", "'name'", "'predicated'", "'show'", "'viewer'", "'section'", "'filtering'", "'expanded'", "'activities'", "'icon'", "'extensions'", "'extended'", "'Overview'", "'.'"
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

            if ( (LA6_0==21) ) {
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

            if ( (LA7_0==22) ) {
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

            if ( (LA8_0==24) ) {
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

            if ( (LA10_0==25) ) {
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

            if ( (LA11_0==30) ) {
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

            if ( (LA12_0==32) ) {
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

            if ( (LA13_0==33) ) {
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1218:1: rule__Page__Group__14__Impl : ( 'sections' ) ;
    public final void rule__Page__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1222:1: ( ( 'sections' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1223:1: ( 'sections' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1223:1: ( 'sections' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1224:1: 'sections'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPageAccess().getSectionsKeyword_14()); 
            }
            match(input,20,FOLLOW_20_in_rule__Page__Group__14__Impl2439); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPageAccess().getSectionsKeyword_14()); 
            }

            }


            }

        }
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1237:1: rule__Page__Group__15 : rule__Page__Group__15__Impl rule__Page__Group__16 ;
    public final void rule__Page__Group__15() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1241:1: ( rule__Page__Group__15__Impl rule__Page__Group__16 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1242:2: rule__Page__Group__15__Impl rule__Page__Group__16
            {
            pushFollow(FOLLOW_rule__Page__Group__15__Impl_in_rule__Page__Group__152470);
            rule__Page__Group__15__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Page__Group__16_in_rule__Page__Group__152473);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1249:1: rule__Page__Group__15__Impl : ( '{' ) ;
    public final void rule__Page__Group__15__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1253:1: ( ( '{' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1254:1: ( '{' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1254:1: ( '{' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1255:1: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPageAccess().getLeftCurlyBracketKeyword_15()); 
            }
            match(input,15,FOLLOW_15_in_rule__Page__Group__15__Impl2501); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPageAccess().getLeftCurlyBracketKeyword_15()); 
            }

            }


            }

        }
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1268:1: rule__Page__Group__16 : rule__Page__Group__16__Impl rule__Page__Group__17 ;
    public final void rule__Page__Group__16() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1272:1: ( rule__Page__Group__16__Impl rule__Page__Group__17 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1273:2: rule__Page__Group__16__Impl rule__Page__Group__17
            {
            pushFollow(FOLLOW_rule__Page__Group__16__Impl_in_rule__Page__Group__162532);
            rule__Page__Group__16__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Page__Group__17_in_rule__Page__Group__162535);
            rule__Page__Group__17();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1280:1: rule__Page__Group__16__Impl : ( ( rule__Page__OwnedSectionsAssignment_16 )* ) ;
    public final void rule__Page__Group__16__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1284:1: ( ( ( rule__Page__OwnedSectionsAssignment_16 )* ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1285:1: ( ( rule__Page__OwnedSectionsAssignment_16 )* )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1285:1: ( ( rule__Page__OwnedSectionsAssignment_16 )* )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1286:1: ( rule__Page__OwnedSectionsAssignment_16 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPageAccess().getOwnedSectionsAssignment_16()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1287:1: ( rule__Page__OwnedSectionsAssignment_16 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==35) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1287:2: rule__Page__OwnedSectionsAssignment_16
            	    {
            	    pushFollow(FOLLOW_rule__Page__OwnedSectionsAssignment_16_in_rule__Page__Group__16__Impl2562);
            	    rule__Page__OwnedSectionsAssignment_16();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPageAccess().getOwnedSectionsAssignment_16()); 
            }

            }


            }

        }
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


    // $ANTLR start "rule__Page__Group__17"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1297:1: rule__Page__Group__17 : rule__Page__Group__17__Impl rule__Page__Group__18 ;
    public final void rule__Page__Group__17() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1301:1: ( rule__Page__Group__17__Impl rule__Page__Group__18 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1302:2: rule__Page__Group__17__Impl rule__Page__Group__18
            {
            pushFollow(FOLLOW_rule__Page__Group__17__Impl_in_rule__Page__Group__172593);
            rule__Page__Group__17__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Page__Group__18_in_rule__Page__Group__172596);
            rule__Page__Group__18();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__Group__17"


    // $ANTLR start "rule__Page__Group__17__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1309:1: rule__Page__Group__17__Impl : ( '}' ) ;
    public final void rule__Page__Group__17__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1313:1: ( ( '}' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1314:1: ( '}' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1314:1: ( '}' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1315:1: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPageAccess().getRightCurlyBracketKeyword_17()); 
            }
            match(input,16,FOLLOW_16_in_rule__Page__Group__17__Impl2624); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPageAccess().getRightCurlyBracketKeyword_17()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__Group__17__Impl"


    // $ANTLR start "rule__Page__Group__18"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1328:1: rule__Page__Group__18 : rule__Page__Group__18__Impl ;
    public final void rule__Page__Group__18() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1332:1: ( rule__Page__Group__18__Impl )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1333:2: rule__Page__Group__18__Impl
            {
            pushFollow(FOLLOW_rule__Page__Group__18__Impl_in_rule__Page__Group__182655);
            rule__Page__Group__18__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__Group__18"


    // $ANTLR start "rule__Page__Group__18__Impl"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1339:1: rule__Page__Group__18__Impl : ( '}' ) ;
    public final void rule__Page__Group__18__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1343:1: ( ( '}' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1344:1: ( '}' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1344:1: ( '}' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1345:1: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPageAccess().getRightCurlyBracketKeyword_18()); 
            }
            match(input,16,FOLLOW_16_in_rule__Page__Group__18__Impl2683); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPageAccess().getRightCurlyBracketKeyword_18()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__Group__18__Impl"


    // $ANTLR start "rule__Page__Group_4__0"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1396:1: rule__Page__Group_4__0 : rule__Page__Group_4__0__Impl rule__Page__Group_4__1 ;
    public final void rule__Page__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1400:1: ( rule__Page__Group_4__0__Impl rule__Page__Group_4__1 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1401:2: rule__Page__Group_4__0__Impl rule__Page__Group_4__1
            {
            pushFollow(FOLLOW_rule__Page__Group_4__0__Impl_in_rule__Page__Group_4__02752);
            rule__Page__Group_4__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Page__Group_4__1_in_rule__Page__Group_4__02755);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1408:1: rule__Page__Group_4__0__Impl : ( 'description' ) ;
    public final void rule__Page__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1412:1: ( ( 'description' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1413:1: ( 'description' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1413:1: ( 'description' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1414:1: 'description'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPageAccess().getDescriptionKeyword_4_0()); 
            }
            match(input,21,FOLLOW_21_in_rule__Page__Group_4__0__Impl2783); if (state.failed) return ;
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1427:1: rule__Page__Group_4__1 : rule__Page__Group_4__1__Impl ;
    public final void rule__Page__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1431:1: ( rule__Page__Group_4__1__Impl )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1432:2: rule__Page__Group_4__1__Impl
            {
            pushFollow(FOLLOW_rule__Page__Group_4__1__Impl_in_rule__Page__Group_4__12814);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1438:1: rule__Page__Group_4__1__Impl : ( ( rule__Page__DescriptionAssignment_4_1 ) ) ;
    public final void rule__Page__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1442:1: ( ( ( rule__Page__DescriptionAssignment_4_1 ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1443:1: ( ( rule__Page__DescriptionAssignment_4_1 ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1443:1: ( ( rule__Page__DescriptionAssignment_4_1 ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1444:1: ( rule__Page__DescriptionAssignment_4_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPageAccess().getDescriptionAssignment_4_1()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1445:1: ( rule__Page__DescriptionAssignment_4_1 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1445:2: rule__Page__DescriptionAssignment_4_1
            {
            pushFollow(FOLLOW_rule__Page__DescriptionAssignment_4_1_in_rule__Page__Group_4__1__Impl2841);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1459:1: rule__Page__Group_5__0 : rule__Page__Group_5__0__Impl rule__Page__Group_5__1 ;
    public final void rule__Page__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1463:1: ( rule__Page__Group_5__0__Impl rule__Page__Group_5__1 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1464:2: rule__Page__Group_5__0__Impl rule__Page__Group_5__1
            {
            pushFollow(FOLLOW_rule__Page__Group_5__0__Impl_in_rule__Page__Group_5__02875);
            rule__Page__Group_5__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Page__Group_5__1_in_rule__Page__Group_5__02878);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1471:1: rule__Page__Group_5__0__Impl : ( 'file' ) ;
    public final void rule__Page__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1475:1: ( ( 'file' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1476:1: ( 'file' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1476:1: ( 'file' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1477:1: 'file'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPageAccess().getFileKeyword_5_0()); 
            }
            match(input,22,FOLLOW_22_in_rule__Page__Group_5__0__Impl2906); if (state.failed) return ;
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1490:1: rule__Page__Group_5__1 : rule__Page__Group_5__1__Impl rule__Page__Group_5__2 ;
    public final void rule__Page__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1494:1: ( rule__Page__Group_5__1__Impl rule__Page__Group_5__2 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1495:2: rule__Page__Group_5__1__Impl rule__Page__Group_5__2
            {
            pushFollow(FOLLOW_rule__Page__Group_5__1__Impl_in_rule__Page__Group_5__12937);
            rule__Page__Group_5__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Page__Group_5__2_in_rule__Page__Group_5__12940);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1502:1: rule__Page__Group_5__1__Impl : ( 'extension' ) ;
    public final void rule__Page__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1506:1: ( ( 'extension' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1507:1: ( 'extension' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1507:1: ( 'extension' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1508:1: 'extension'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPageAccess().getExtensionKeyword_5_1()); 
            }
            match(input,23,FOLLOW_23_in_rule__Page__Group_5__1__Impl2968); if (state.failed) return ;
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1521:1: rule__Page__Group_5__2 : rule__Page__Group_5__2__Impl ;
    public final void rule__Page__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1525:1: ( rule__Page__Group_5__2__Impl )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1526:2: rule__Page__Group_5__2__Impl
            {
            pushFollow(FOLLOW_rule__Page__Group_5__2__Impl_in_rule__Page__Group_5__22999);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1532:1: rule__Page__Group_5__2__Impl : ( ( rule__Page__FileExtensionsAssignment_5_2 ) ) ;
    public final void rule__Page__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1536:1: ( ( ( rule__Page__FileExtensionsAssignment_5_2 ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1537:1: ( ( rule__Page__FileExtensionsAssignment_5_2 ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1537:1: ( ( rule__Page__FileExtensionsAssignment_5_2 ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1538:1: ( rule__Page__FileExtensionsAssignment_5_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPageAccess().getFileExtensionsAssignment_5_2()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1539:1: ( rule__Page__FileExtensionsAssignment_5_2 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1539:2: rule__Page__FileExtensionsAssignment_5_2
            {
            pushFollow(FOLLOW_rule__Page__FileExtensionsAssignment_5_2_in_rule__Page__Group_5__2__Impl3026);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1555:1: rule__Page__Group_6__0 : rule__Page__Group_6__0__Impl rule__Page__Group_6__1 ;
    public final void rule__Page__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1559:1: ( rule__Page__Group_6__0__Impl rule__Page__Group_6__1 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1560:2: rule__Page__Group_6__0__Impl rule__Page__Group_6__1
            {
            pushFollow(FOLLOW_rule__Page__Group_6__0__Impl_in_rule__Page__Group_6__03062);
            rule__Page__Group_6__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Page__Group_6__1_in_rule__Page__Group_6__03065);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1567:1: rule__Page__Group_6__0__Impl : ( 'id' ) ;
    public final void rule__Page__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1571:1: ( ( 'id' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1572:1: ( 'id' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1572:1: ( 'id' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1573:1: 'id'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPageAccess().getIdKeyword_6_0()); 
            }
            match(input,24,FOLLOW_24_in_rule__Page__Group_6__0__Impl3093); if (state.failed) return ;
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1586:1: rule__Page__Group_6__1 : rule__Page__Group_6__1__Impl ;
    public final void rule__Page__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1590:1: ( rule__Page__Group_6__1__Impl )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1591:2: rule__Page__Group_6__1__Impl
            {
            pushFollow(FOLLOW_rule__Page__Group_6__1__Impl_in_rule__Page__Group_6__13124);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1597:1: rule__Page__Group_6__1__Impl : ( ( rule__Page__ActivityExplorerItemIDAssignment_6_1 ) ) ;
    public final void rule__Page__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1601:1: ( ( ( rule__Page__ActivityExplorerItemIDAssignment_6_1 ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1602:1: ( ( rule__Page__ActivityExplorerItemIDAssignment_6_1 ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1602:1: ( ( rule__Page__ActivityExplorerItemIDAssignment_6_1 ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1603:1: ( rule__Page__ActivityExplorerItemIDAssignment_6_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPageAccess().getActivityExplorerItemIDAssignment_6_1()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1604:1: ( rule__Page__ActivityExplorerItemIDAssignment_6_1 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1604:2: rule__Page__ActivityExplorerItemIDAssignment_6_1
            {
            pushFollow(FOLLOW_rule__Page__ActivityExplorerItemIDAssignment_6_1_in_rule__Page__Group_6__1__Impl3151);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1618:1: rule__Page__Group_10__0 : rule__Page__Group_10__0__Impl rule__Page__Group_10__1 ;
    public final void rule__Page__Group_10__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1622:1: ( rule__Page__Group_10__0__Impl rule__Page__Group_10__1 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1623:2: rule__Page__Group_10__0__Impl rule__Page__Group_10__1
            {
            pushFollow(FOLLOW_rule__Page__Group_10__0__Impl_in_rule__Page__Group_10__03185);
            rule__Page__Group_10__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Page__Group_10__1_in_rule__Page__Group_10__03188);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1630:1: rule__Page__Group_10__0__Impl : ( 'header' ) ;
    public final void rule__Page__Group_10__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1634:1: ( ( 'header' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1635:1: ( 'header' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1635:1: ( 'header' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1636:1: 'header'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPageAccess().getHeaderKeyword_10_0()); 
            }
            match(input,25,FOLLOW_25_in_rule__Page__Group_10__0__Impl3216); if (state.failed) return ;
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1649:1: rule__Page__Group_10__1 : rule__Page__Group_10__1__Impl rule__Page__Group_10__2 ;
    public final void rule__Page__Group_10__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1653:1: ( rule__Page__Group_10__1__Impl rule__Page__Group_10__2 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1654:2: rule__Page__Group_10__1__Impl rule__Page__Group_10__2
            {
            pushFollow(FOLLOW_rule__Page__Group_10__1__Impl_in_rule__Page__Group_10__13247);
            rule__Page__Group_10__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Page__Group_10__2_in_rule__Page__Group_10__13250);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1661:1: rule__Page__Group_10__1__Impl : ( '{' ) ;
    public final void rule__Page__Group_10__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1665:1: ( ( '{' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1666:1: ( '{' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1666:1: ( '{' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1667:1: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPageAccess().getLeftCurlyBracketKeyword_10_1()); 
            }
            match(input,15,FOLLOW_15_in_rule__Page__Group_10__1__Impl3278); if (state.failed) return ;
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1680:1: rule__Page__Group_10__2 : rule__Page__Group_10__2__Impl rule__Page__Group_10__3 ;
    public final void rule__Page__Group_10__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1684:1: ( rule__Page__Group_10__2__Impl rule__Page__Group_10__3 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1685:2: rule__Page__Group_10__2__Impl rule__Page__Group_10__3
            {
            pushFollow(FOLLOW_rule__Page__Group_10__2__Impl_in_rule__Page__Group_10__23309);
            rule__Page__Group_10__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Page__Group_10__3_in_rule__Page__Group_10__23312);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1692:1: rule__Page__Group_10__2__Impl : ( ( rule__Page__Group_10_2__0 )? ) ;
    public final void rule__Page__Group_10__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1696:1: ( ( ( rule__Page__Group_10_2__0 )? ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1697:1: ( ( rule__Page__Group_10_2__0 )? )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1697:1: ( ( rule__Page__Group_10_2__0 )? )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1698:1: ( rule__Page__Group_10_2__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPageAccess().getGroup_10_2()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1699:1: ( rule__Page__Group_10_2__0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==26) ) {
                int LA15_1 = input.LA(2);

                if ( (LA15_1==27) ) {
                    alt15=1;
                }
            }
            switch (alt15) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1699:2: rule__Page__Group_10_2__0
                    {
                    pushFollow(FOLLOW_rule__Page__Group_10_2__0_in_rule__Page__Group_10__2__Impl3339);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1709:1: rule__Page__Group_10__3 : rule__Page__Group_10__3__Impl rule__Page__Group_10__4 ;
    public final void rule__Page__Group_10__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1713:1: ( rule__Page__Group_10__3__Impl rule__Page__Group_10__4 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1714:2: rule__Page__Group_10__3__Impl rule__Page__Group_10__4
            {
            pushFollow(FOLLOW_rule__Page__Group_10__3__Impl_in_rule__Page__Group_10__33370);
            rule__Page__Group_10__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Page__Group_10__4_in_rule__Page__Group_10__33373);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1721:1: rule__Page__Group_10__3__Impl : ( ( rule__Page__Group_10_3__0 )? ) ;
    public final void rule__Page__Group_10__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1725:1: ( ( ( rule__Page__Group_10_3__0 )? ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1726:1: ( ( rule__Page__Group_10_3__0 )? )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1726:1: ( ( rule__Page__Group_10_3__0 )? )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1727:1: ( rule__Page__Group_10_3__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPageAccess().getGroup_10_3()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1728:1: ( rule__Page__Group_10_3__0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==26) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1728:2: rule__Page__Group_10_3__0
                    {
                    pushFollow(FOLLOW_rule__Page__Group_10_3__0_in_rule__Page__Group_10__3__Impl3400);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1738:1: rule__Page__Group_10__4 : rule__Page__Group_10__4__Impl ;
    public final void rule__Page__Group_10__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1742:1: ( rule__Page__Group_10__4__Impl )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1743:2: rule__Page__Group_10__4__Impl
            {
            pushFollow(FOLLOW_rule__Page__Group_10__4__Impl_in_rule__Page__Group_10__43431);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1749:1: rule__Page__Group_10__4__Impl : ( '}' ) ;
    public final void rule__Page__Group_10__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1753:1: ( ( '}' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1754:1: ( '}' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1754:1: ( '}' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1755:1: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPageAccess().getRightCurlyBracketKeyword_10_4()); 
            }
            match(input,16,FOLLOW_16_in_rule__Page__Group_10__4__Impl3459); if (state.failed) return ;
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1778:1: rule__Page__Group_10_2__0 : rule__Page__Group_10_2__0__Impl rule__Page__Group_10_2__1 ;
    public final void rule__Page__Group_10_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1782:1: ( rule__Page__Group_10_2__0__Impl rule__Page__Group_10_2__1 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1783:2: rule__Page__Group_10_2__0__Impl rule__Page__Group_10_2__1
            {
            pushFollow(FOLLOW_rule__Page__Group_10_2__0__Impl_in_rule__Page__Group_10_2__03500);
            rule__Page__Group_10_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Page__Group_10_2__1_in_rule__Page__Group_10_2__03503);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1790:1: rule__Page__Group_10_2__0__Impl : ( 'image' ) ;
    public final void rule__Page__Group_10_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1794:1: ( ( 'image' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1795:1: ( 'image' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1795:1: ( 'image' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1796:1: 'image'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPageAccess().getImageKeyword_10_2_0()); 
            }
            match(input,26,FOLLOW_26_in_rule__Page__Group_10_2__0__Impl3531); if (state.failed) return ;
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1809:1: rule__Page__Group_10_2__1 : rule__Page__Group_10_2__1__Impl rule__Page__Group_10_2__2 ;
    public final void rule__Page__Group_10_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1813:1: ( rule__Page__Group_10_2__1__Impl rule__Page__Group_10_2__2 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1814:2: rule__Page__Group_10_2__1__Impl rule__Page__Group_10_2__2
            {
            pushFollow(FOLLOW_rule__Page__Group_10_2__1__Impl_in_rule__Page__Group_10_2__13562);
            rule__Page__Group_10_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Page__Group_10_2__2_in_rule__Page__Group_10_2__13565);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1821:1: rule__Page__Group_10_2__1__Impl : ( 'on' ) ;
    public final void rule__Page__Group_10_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1825:1: ( ( 'on' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1826:1: ( 'on' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1826:1: ( 'on' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1827:1: 'on'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPageAccess().getOnKeyword_10_2_1()); 
            }
            match(input,27,FOLLOW_27_in_rule__Page__Group_10_2__1__Impl3593); if (state.failed) return ;
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1840:1: rule__Page__Group_10_2__2 : rule__Page__Group_10_2__2__Impl rule__Page__Group_10_2__3 ;
    public final void rule__Page__Group_10_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1844:1: ( rule__Page__Group_10_2__2__Impl rule__Page__Group_10_2__3 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1845:2: rule__Page__Group_10_2__2__Impl rule__Page__Group_10_2__3
            {
            pushFollow(FOLLOW_rule__Page__Group_10_2__2__Impl_in_rule__Page__Group_10_2__23624);
            rule__Page__Group_10_2__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Page__Group_10_2__3_in_rule__Page__Group_10_2__23627);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1852:1: rule__Page__Group_10_2__2__Impl : ( ':' ) ;
    public final void rule__Page__Group_10_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1856:1: ( ( ':' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1857:1: ( ':' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1857:1: ( ':' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1858:1: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPageAccess().getColonKeyword_10_2_2()); 
            }
            match(input,28,FOLLOW_28_in_rule__Page__Group_10_2__2__Impl3655); if (state.failed) return ;
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1871:1: rule__Page__Group_10_2__3 : rule__Page__Group_10_2__3__Impl ;
    public final void rule__Page__Group_10_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1875:1: ( rule__Page__Group_10_2__3__Impl )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1876:2: rule__Page__Group_10_2__3__Impl
            {
            pushFollow(FOLLOW_rule__Page__Group_10_2__3__Impl_in_rule__Page__Group_10_2__33686);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1882:1: rule__Page__Group_10_2__3__Impl : ( ( rule__Page__ImagePathOnAssignment_10_2_3 ) ) ;
    public final void rule__Page__Group_10_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1886:1: ( ( ( rule__Page__ImagePathOnAssignment_10_2_3 ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1887:1: ( ( rule__Page__ImagePathOnAssignment_10_2_3 ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1887:1: ( ( rule__Page__ImagePathOnAssignment_10_2_3 ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1888:1: ( rule__Page__ImagePathOnAssignment_10_2_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPageAccess().getImagePathOnAssignment_10_2_3()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1889:1: ( rule__Page__ImagePathOnAssignment_10_2_3 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1889:2: rule__Page__ImagePathOnAssignment_10_2_3
            {
            pushFollow(FOLLOW_rule__Page__ImagePathOnAssignment_10_2_3_in_rule__Page__Group_10_2__3__Impl3713);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1907:1: rule__Page__Group_10_3__0 : rule__Page__Group_10_3__0__Impl rule__Page__Group_10_3__1 ;
    public final void rule__Page__Group_10_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1911:1: ( rule__Page__Group_10_3__0__Impl rule__Page__Group_10_3__1 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1912:2: rule__Page__Group_10_3__0__Impl rule__Page__Group_10_3__1
            {
            pushFollow(FOLLOW_rule__Page__Group_10_3__0__Impl_in_rule__Page__Group_10_3__03751);
            rule__Page__Group_10_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Page__Group_10_3__1_in_rule__Page__Group_10_3__03754);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1919:1: rule__Page__Group_10_3__0__Impl : ( 'image' ) ;
    public final void rule__Page__Group_10_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1923:1: ( ( 'image' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1924:1: ( 'image' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1924:1: ( 'image' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1925:1: 'image'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPageAccess().getImageKeyword_10_3_0()); 
            }
            match(input,26,FOLLOW_26_in_rule__Page__Group_10_3__0__Impl3782); if (state.failed) return ;
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1938:1: rule__Page__Group_10_3__1 : rule__Page__Group_10_3__1__Impl rule__Page__Group_10_3__2 ;
    public final void rule__Page__Group_10_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1942:1: ( rule__Page__Group_10_3__1__Impl rule__Page__Group_10_3__2 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1943:2: rule__Page__Group_10_3__1__Impl rule__Page__Group_10_3__2
            {
            pushFollow(FOLLOW_rule__Page__Group_10_3__1__Impl_in_rule__Page__Group_10_3__13813);
            rule__Page__Group_10_3__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Page__Group_10_3__2_in_rule__Page__Group_10_3__13816);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1950:1: rule__Page__Group_10_3__1__Impl : ( 'off' ) ;
    public final void rule__Page__Group_10_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1954:1: ( ( 'off' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1955:1: ( 'off' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1955:1: ( 'off' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1956:1: 'off'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPageAccess().getOffKeyword_10_3_1()); 
            }
            match(input,29,FOLLOW_29_in_rule__Page__Group_10_3__1__Impl3844); if (state.failed) return ;
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1969:1: rule__Page__Group_10_3__2 : rule__Page__Group_10_3__2__Impl rule__Page__Group_10_3__3 ;
    public final void rule__Page__Group_10_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1973:1: ( rule__Page__Group_10_3__2__Impl rule__Page__Group_10_3__3 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1974:2: rule__Page__Group_10_3__2__Impl rule__Page__Group_10_3__3
            {
            pushFollow(FOLLOW_rule__Page__Group_10_3__2__Impl_in_rule__Page__Group_10_3__23875);
            rule__Page__Group_10_3__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Page__Group_10_3__3_in_rule__Page__Group_10_3__23878);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1981:1: rule__Page__Group_10_3__2__Impl : ( ':' ) ;
    public final void rule__Page__Group_10_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1985:1: ( ( ':' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1986:1: ( ':' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1986:1: ( ':' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:1987:1: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPageAccess().getColonKeyword_10_3_2()); 
            }
            match(input,28,FOLLOW_28_in_rule__Page__Group_10_3__2__Impl3906); if (state.failed) return ;
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2000:1: rule__Page__Group_10_3__3 : rule__Page__Group_10_3__3__Impl ;
    public final void rule__Page__Group_10_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2004:1: ( rule__Page__Group_10_3__3__Impl )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2005:2: rule__Page__Group_10_3__3__Impl
            {
            pushFollow(FOLLOW_rule__Page__Group_10_3__3__Impl_in_rule__Page__Group_10_3__33937);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2011:1: rule__Page__Group_10_3__3__Impl : ( ( rule__Page__ImagePathOffAssignment_10_3_3 ) ) ;
    public final void rule__Page__Group_10_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2015:1: ( ( ( rule__Page__ImagePathOffAssignment_10_3_3 ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2016:1: ( ( rule__Page__ImagePathOffAssignment_10_3_3 ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2016:1: ( ( rule__Page__ImagePathOffAssignment_10_3_3 ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2017:1: ( rule__Page__ImagePathOffAssignment_10_3_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPageAccess().getImagePathOffAssignment_10_3_3()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2018:1: ( rule__Page__ImagePathOffAssignment_10_3_3 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2018:2: rule__Page__ImagePathOffAssignment_10_3_3
            {
            pushFollow(FOLLOW_rule__Page__ImagePathOffAssignment_10_3_3_in_rule__Page__Group_10_3__3__Impl3964);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2036:1: rule__Page__Group_11__0 : rule__Page__Group_11__0__Impl rule__Page__Group_11__1 ;
    public final void rule__Page__Group_11__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2040:1: ( rule__Page__Group_11__0__Impl rule__Page__Group_11__1 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2041:2: rule__Page__Group_11__0__Impl rule__Page__Group_11__1
            {
            pushFollow(FOLLOW_rule__Page__Group_11__0__Impl_in_rule__Page__Group_11__04002);
            rule__Page__Group_11__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Page__Group_11__1_in_rule__Page__Group_11__04005);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2048:1: rule__Page__Group_11__0__Impl : ( 'tab' ) ;
    public final void rule__Page__Group_11__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2052:1: ( ( 'tab' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2053:1: ( 'tab' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2053:1: ( 'tab' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2054:1: 'tab'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPageAccess().getTabKeyword_11_0()); 
            }
            match(input,30,FOLLOW_30_in_rule__Page__Group_11__0__Impl4033); if (state.failed) return ;
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2067:1: rule__Page__Group_11__1 : rule__Page__Group_11__1__Impl rule__Page__Group_11__2 ;
    public final void rule__Page__Group_11__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2071:1: ( rule__Page__Group_11__1__Impl rule__Page__Group_11__2 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2072:2: rule__Page__Group_11__1__Impl rule__Page__Group_11__2
            {
            pushFollow(FOLLOW_rule__Page__Group_11__1__Impl_in_rule__Page__Group_11__14064);
            rule__Page__Group_11__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Page__Group_11__2_in_rule__Page__Group_11__14067);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2079:1: rule__Page__Group_11__1__Impl : ( 'name' ) ;
    public final void rule__Page__Group_11__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2083:1: ( ( 'name' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2084:1: ( 'name' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2084:1: ( 'name' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2085:1: 'name'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPageAccess().getNameKeyword_11_1()); 
            }
            match(input,31,FOLLOW_31_in_rule__Page__Group_11__1__Impl4095); if (state.failed) return ;
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2098:1: rule__Page__Group_11__2 : rule__Page__Group_11__2__Impl ;
    public final void rule__Page__Group_11__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2102:1: ( rule__Page__Group_11__2__Impl )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2103:2: rule__Page__Group_11__2__Impl
            {
            pushFollow(FOLLOW_rule__Page__Group_11__2__Impl_in_rule__Page__Group_11__24126);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2109:1: rule__Page__Group_11__2__Impl : ( ( rule__Page__TabNameAssignment_11_2 ) ) ;
    public final void rule__Page__Group_11__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2113:1: ( ( ( rule__Page__TabNameAssignment_11_2 ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2114:1: ( ( rule__Page__TabNameAssignment_11_2 ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2114:1: ( ( rule__Page__TabNameAssignment_11_2 ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2115:1: ( rule__Page__TabNameAssignment_11_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPageAccess().getTabNameAssignment_11_2()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2116:1: ( rule__Page__TabNameAssignment_11_2 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2116:2: rule__Page__TabNameAssignment_11_2
            {
            pushFollow(FOLLOW_rule__Page__TabNameAssignment_11_2_in_rule__Page__Group_11__2__Impl4153);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2132:1: rule__Page__Group_12__0 : rule__Page__Group_12__0__Impl rule__Page__Group_12__1 ;
    public final void rule__Page__Group_12__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2136:1: ( rule__Page__Group_12__0__Impl rule__Page__Group_12__1 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2137:2: rule__Page__Group_12__0__Impl rule__Page__Group_12__1
            {
            pushFollow(FOLLOW_rule__Page__Group_12__0__Impl_in_rule__Page__Group_12__04189);
            rule__Page__Group_12__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Page__Group_12__1_in_rule__Page__Group_12__04192);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2144:1: rule__Page__Group_12__0__Impl : ( 'predicated' ) ;
    public final void rule__Page__Group_12__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2148:1: ( ( 'predicated' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2149:1: ( 'predicated' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2149:1: ( 'predicated' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2150:1: 'predicated'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPageAccess().getPredicatedKeyword_12_0()); 
            }
            match(input,32,FOLLOW_32_in_rule__Page__Group_12__0__Impl4220); if (state.failed) return ;
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2163:1: rule__Page__Group_12__1 : rule__Page__Group_12__1__Impl rule__Page__Group_12__2 ;
    public final void rule__Page__Group_12__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2167:1: ( rule__Page__Group_12__1__Impl rule__Page__Group_12__2 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2168:2: rule__Page__Group_12__1__Impl rule__Page__Group_12__2
            {
            pushFollow(FOLLOW_rule__Page__Group_12__1__Impl_in_rule__Page__Group_12__14251);
            rule__Page__Group_12__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Page__Group_12__2_in_rule__Page__Group_12__14254);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2175:1: rule__Page__Group_12__1__Impl : ( ':' ) ;
    public final void rule__Page__Group_12__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2179:1: ( ( ':' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2180:1: ( ':' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2180:1: ( ':' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2181:1: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPageAccess().getColonKeyword_12_1()); 
            }
            match(input,28,FOLLOW_28_in_rule__Page__Group_12__1__Impl4282); if (state.failed) return ;
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2194:1: rule__Page__Group_12__2 : rule__Page__Group_12__2__Impl ;
    public final void rule__Page__Group_12__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2198:1: ( rule__Page__Group_12__2__Impl )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2199:2: rule__Page__Group_12__2__Impl
            {
            pushFollow(FOLLOW_rule__Page__Group_12__2__Impl_in_rule__Page__Group_12__24313);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2205:1: rule__Page__Group_12__2__Impl : ( ( rule__Page__HasPredicateAssignment_12_2 ) ) ;
    public final void rule__Page__Group_12__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2209:1: ( ( ( rule__Page__HasPredicateAssignment_12_2 ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2210:1: ( ( rule__Page__HasPredicateAssignment_12_2 ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2210:1: ( ( rule__Page__HasPredicateAssignment_12_2 ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2211:1: ( rule__Page__HasPredicateAssignment_12_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPageAccess().getHasPredicateAssignment_12_2()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2212:1: ( rule__Page__HasPredicateAssignment_12_2 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2212:2: rule__Page__HasPredicateAssignment_12_2
            {
            pushFollow(FOLLOW_rule__Page__HasPredicateAssignment_12_2_in_rule__Page__Group_12__2__Impl4340);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2228:1: rule__Page__Group_13__0 : rule__Page__Group_13__0__Impl rule__Page__Group_13__1 ;
    public final void rule__Page__Group_13__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2232:1: ( rule__Page__Group_13__0__Impl rule__Page__Group_13__1 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2233:2: rule__Page__Group_13__0__Impl rule__Page__Group_13__1
            {
            pushFollow(FOLLOW_rule__Page__Group_13__0__Impl_in_rule__Page__Group_13__04376);
            rule__Page__Group_13__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Page__Group_13__1_in_rule__Page__Group_13__04379);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2240:1: rule__Page__Group_13__0__Impl : ( 'show' ) ;
    public final void rule__Page__Group_13__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2244:1: ( ( 'show' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2245:1: ( 'show' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2245:1: ( 'show' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2246:1: 'show'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPageAccess().getShowKeyword_13_0()); 
            }
            match(input,33,FOLLOW_33_in_rule__Page__Group_13__0__Impl4407); if (state.failed) return ;
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2259:1: rule__Page__Group_13__1 : rule__Page__Group_13__1__Impl rule__Page__Group_13__2 ;
    public final void rule__Page__Group_13__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2263:1: ( rule__Page__Group_13__1__Impl rule__Page__Group_13__2 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2264:2: rule__Page__Group_13__1__Impl rule__Page__Group_13__2
            {
            pushFollow(FOLLOW_rule__Page__Group_13__1__Impl_in_rule__Page__Group_13__14438);
            rule__Page__Group_13__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Page__Group_13__2_in_rule__Page__Group_13__14441);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2271:1: rule__Page__Group_13__1__Impl : ( 'viewer' ) ;
    public final void rule__Page__Group_13__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2275:1: ( ( 'viewer' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2276:1: ( 'viewer' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2276:1: ( 'viewer' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2277:1: 'viewer'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPageAccess().getViewerKeyword_13_1()); 
            }
            match(input,34,FOLLOW_34_in_rule__Page__Group_13__1__Impl4469); if (state.failed) return ;
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2290:1: rule__Page__Group_13__2 : rule__Page__Group_13__2__Impl rule__Page__Group_13__3 ;
    public final void rule__Page__Group_13__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2294:1: ( rule__Page__Group_13__2__Impl rule__Page__Group_13__3 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2295:2: rule__Page__Group_13__2__Impl rule__Page__Group_13__3
            {
            pushFollow(FOLLOW_rule__Page__Group_13__2__Impl_in_rule__Page__Group_13__24500);
            rule__Page__Group_13__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Page__Group_13__3_in_rule__Page__Group_13__24503);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2302:1: rule__Page__Group_13__2__Impl : ( ':' ) ;
    public final void rule__Page__Group_13__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2306:1: ( ( ':' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2307:1: ( ':' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2307:1: ( ':' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2308:1: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPageAccess().getColonKeyword_13_2()); 
            }
            match(input,28,FOLLOW_28_in_rule__Page__Group_13__2__Impl4531); if (state.failed) return ;
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2321:1: rule__Page__Group_13__3 : rule__Page__Group_13__3__Impl ;
    public final void rule__Page__Group_13__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2325:1: ( rule__Page__Group_13__3__Impl )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2326:2: rule__Page__Group_13__3__Impl
            {
            pushFollow(FOLLOW_rule__Page__Group_13__3__Impl_in_rule__Page__Group_13__34562);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2332:1: rule__Page__Group_13__3__Impl : ( ( rule__Page__ShowViewerAssignment_13_3 ) ) ;
    public final void rule__Page__Group_13__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2336:1: ( ( ( rule__Page__ShowViewerAssignment_13_3 ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2337:1: ( ( rule__Page__ShowViewerAssignment_13_3 ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2337:1: ( ( rule__Page__ShowViewerAssignment_13_3 ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2338:1: ( rule__Page__ShowViewerAssignment_13_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPageAccess().getShowViewerAssignment_13_3()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2339:1: ( rule__Page__ShowViewerAssignment_13_3 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2339:2: rule__Page__ShowViewerAssignment_13_3
            {
            pushFollow(FOLLOW_rule__Page__ShowViewerAssignment_13_3_in_rule__Page__Group_13__3__Impl4589);
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


    // $ANTLR start "rule__Section__Group__0"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2357:1: rule__Section__Group__0 : rule__Section__Group__0__Impl rule__Section__Group__1 ;
    public final void rule__Section__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2361:1: ( rule__Section__Group__0__Impl rule__Section__Group__1 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2362:2: rule__Section__Group__0__Impl rule__Section__Group__1
            {
            pushFollow(FOLLOW_rule__Section__Group__0__Impl_in_rule__Section__Group__04627);
            rule__Section__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Section__Group__1_in_rule__Section__Group__04630);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2369:1: rule__Section__Group__0__Impl : ( () ) ;
    public final void rule__Section__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2373:1: ( ( () ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2374:1: ( () )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2374:1: ( () )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2375:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSectionAccess().getSectionAction_0()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2376:1: ()
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2378:1: 
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2388:1: rule__Section__Group__1 : rule__Section__Group__1__Impl rule__Section__Group__2 ;
    public final void rule__Section__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2392:1: ( rule__Section__Group__1__Impl rule__Section__Group__2 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2393:2: rule__Section__Group__1__Impl rule__Section__Group__2
            {
            pushFollow(FOLLOW_rule__Section__Group__1__Impl_in_rule__Section__Group__14688);
            rule__Section__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Section__Group__2_in_rule__Section__Group__14691);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2400:1: rule__Section__Group__1__Impl : ( 'section' ) ;
    public final void rule__Section__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2404:1: ( ( 'section' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2405:1: ( 'section' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2405:1: ( 'section' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2406:1: 'section'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSectionAccess().getSectionKeyword_1()); 
            }
            match(input,35,FOLLOW_35_in_rule__Section__Group__1__Impl4719); if (state.failed) return ;
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2419:1: rule__Section__Group__2 : rule__Section__Group__2__Impl rule__Section__Group__3 ;
    public final void rule__Section__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2423:1: ( rule__Section__Group__2__Impl rule__Section__Group__3 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2424:2: rule__Section__Group__2__Impl rule__Section__Group__3
            {
            pushFollow(FOLLOW_rule__Section__Group__2__Impl_in_rule__Section__Group__24750);
            rule__Section__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Section__Group__3_in_rule__Section__Group__24753);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2431:1: rule__Section__Group__2__Impl : ( ( rule__Section__NameAssignment_2 ) ) ;
    public final void rule__Section__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2435:1: ( ( ( rule__Section__NameAssignment_2 ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2436:1: ( ( rule__Section__NameAssignment_2 ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2436:1: ( ( rule__Section__NameAssignment_2 ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2437:1: ( rule__Section__NameAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSectionAccess().getNameAssignment_2()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2438:1: ( rule__Section__NameAssignment_2 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2438:2: rule__Section__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__Section__NameAssignment_2_in_rule__Section__Group__2__Impl4780);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2448:1: rule__Section__Group__3 : rule__Section__Group__3__Impl rule__Section__Group__4 ;
    public final void rule__Section__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2452:1: ( rule__Section__Group__3__Impl rule__Section__Group__4 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2453:2: rule__Section__Group__3__Impl rule__Section__Group__4
            {
            pushFollow(FOLLOW_rule__Section__Group__3__Impl_in_rule__Section__Group__34810);
            rule__Section__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Section__Group__4_in_rule__Section__Group__34813);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2460:1: rule__Section__Group__3__Impl : ( '{' ) ;
    public final void rule__Section__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2464:1: ( ( '{' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2465:1: ( '{' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2465:1: ( '{' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2466:1: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSectionAccess().getLeftCurlyBracketKeyword_3()); 
            }
            match(input,15,FOLLOW_15_in_rule__Section__Group__3__Impl4841); if (state.failed) return ;
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2479:1: rule__Section__Group__4 : rule__Section__Group__4__Impl rule__Section__Group__5 ;
    public final void rule__Section__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2483:1: ( rule__Section__Group__4__Impl rule__Section__Group__5 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2484:2: rule__Section__Group__4__Impl rule__Section__Group__5
            {
            pushFollow(FOLLOW_rule__Section__Group__4__Impl_in_rule__Section__Group__44872);
            rule__Section__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Section__Group__5_in_rule__Section__Group__44875);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2491:1: rule__Section__Group__4__Impl : ( ( rule__Section__Group_4__0 )? ) ;
    public final void rule__Section__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2495:1: ( ( ( rule__Section__Group_4__0 )? ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2496:1: ( ( rule__Section__Group_4__0 )? )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2496:1: ( ( rule__Section__Group_4__0 )? )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2497:1: ( rule__Section__Group_4__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSectionAccess().getGroup_4()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2498:1: ( rule__Section__Group_4__0 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==21) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2498:2: rule__Section__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__Section__Group_4__0_in_rule__Section__Group__4__Impl4902);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2508:1: rule__Section__Group__5 : rule__Section__Group__5__Impl rule__Section__Group__6 ;
    public final void rule__Section__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2512:1: ( rule__Section__Group__5__Impl rule__Section__Group__6 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2513:2: rule__Section__Group__5__Impl rule__Section__Group__6
            {
            pushFollow(FOLLOW_rule__Section__Group__5__Impl_in_rule__Section__Group__54933);
            rule__Section__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Section__Group__6_in_rule__Section__Group__54936);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2520:1: rule__Section__Group__5__Impl : ( ( rule__Section__Group_5__0 )? ) ;
    public final void rule__Section__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2524:1: ( ( ( rule__Section__Group_5__0 )? ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2525:1: ( ( rule__Section__Group_5__0 )? )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2525:1: ( ( rule__Section__Group_5__0 )? )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2526:1: ( rule__Section__Group_5__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSectionAccess().getGroup_5()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2527:1: ( rule__Section__Group_5__0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==24) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2527:2: rule__Section__Group_5__0
                    {
                    pushFollow(FOLLOW_rule__Section__Group_5__0_in_rule__Section__Group__5__Impl4963);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2537:1: rule__Section__Group__6 : rule__Section__Group__6__Impl rule__Section__Group__7 ;
    public final void rule__Section__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2541:1: ( rule__Section__Group__6__Impl rule__Section__Group__7 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2542:2: rule__Section__Group__6__Impl rule__Section__Group__7
            {
            pushFollow(FOLLOW_rule__Section__Group__6__Impl_in_rule__Section__Group__64994);
            rule__Section__Group__6__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Section__Group__7_in_rule__Section__Group__64997);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2549:1: rule__Section__Group__6__Impl : ( 'index' ) ;
    public final void rule__Section__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2553:1: ( ( 'index' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2554:1: ( 'index' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2554:1: ( 'index' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2555:1: 'index'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSectionAccess().getIndexKeyword_6()); 
            }
            match(input,19,FOLLOW_19_in_rule__Section__Group__6__Impl5025); if (state.failed) return ;
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2568:1: rule__Section__Group__7 : rule__Section__Group__7__Impl rule__Section__Group__8 ;
    public final void rule__Section__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2572:1: ( rule__Section__Group__7__Impl rule__Section__Group__8 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2573:2: rule__Section__Group__7__Impl rule__Section__Group__8
            {
            pushFollow(FOLLOW_rule__Section__Group__7__Impl_in_rule__Section__Group__75056);
            rule__Section__Group__7__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Section__Group__8_in_rule__Section__Group__75059);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2580:1: rule__Section__Group__7__Impl : ( ( rule__Section__IndexAssignment_7 ) ) ;
    public final void rule__Section__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2584:1: ( ( ( rule__Section__IndexAssignment_7 ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2585:1: ( ( rule__Section__IndexAssignment_7 ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2585:1: ( ( rule__Section__IndexAssignment_7 ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2586:1: ( rule__Section__IndexAssignment_7 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSectionAccess().getIndexAssignment_7()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2587:1: ( rule__Section__IndexAssignment_7 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2587:2: rule__Section__IndexAssignment_7
            {
            pushFollow(FOLLOW_rule__Section__IndexAssignment_7_in_rule__Section__Group__7__Impl5086);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2597:1: rule__Section__Group__8 : rule__Section__Group__8__Impl rule__Section__Group__9 ;
    public final void rule__Section__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2601:1: ( rule__Section__Group__8__Impl rule__Section__Group__9 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2602:2: rule__Section__Group__8__Impl rule__Section__Group__9
            {
            pushFollow(FOLLOW_rule__Section__Group__8__Impl_in_rule__Section__Group__85116);
            rule__Section__Group__8__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Section__Group__9_in_rule__Section__Group__85119);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2609:1: rule__Section__Group__8__Impl : ( ( rule__Section__Group_8__0 )? ) ;
    public final void rule__Section__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2613:1: ( ( ( rule__Section__Group_8__0 )? ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2614:1: ( ( rule__Section__Group_8__0 )? )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2614:1: ( ( rule__Section__Group_8__0 )? )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2615:1: ( rule__Section__Group_8__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSectionAccess().getGroup_8()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2616:1: ( rule__Section__Group_8__0 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==36) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2616:2: rule__Section__Group_8__0
                    {
                    pushFollow(FOLLOW_rule__Section__Group_8__0_in_rule__Section__Group__8__Impl5146);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2626:1: rule__Section__Group__9 : rule__Section__Group__9__Impl rule__Section__Group__10 ;
    public final void rule__Section__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2630:1: ( rule__Section__Group__9__Impl rule__Section__Group__10 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2631:2: rule__Section__Group__9__Impl rule__Section__Group__10
            {
            pushFollow(FOLLOW_rule__Section__Group__9__Impl_in_rule__Section__Group__95177);
            rule__Section__Group__9__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Section__Group__10_in_rule__Section__Group__95180);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2638:1: rule__Section__Group__9__Impl : ( ( rule__Section__Group_9__0 )? ) ;
    public final void rule__Section__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2642:1: ( ( ( rule__Section__Group_9__0 )? ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2643:1: ( ( rule__Section__Group_9__0 )? )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2643:1: ( ( rule__Section__Group_9__0 )? )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2644:1: ( rule__Section__Group_9__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSectionAccess().getGroup_9()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2645:1: ( rule__Section__Group_9__0 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==37) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2645:2: rule__Section__Group_9__0
                    {
                    pushFollow(FOLLOW_rule__Section__Group_9__0_in_rule__Section__Group__9__Impl5207);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2655:1: rule__Section__Group__10 : rule__Section__Group__10__Impl rule__Section__Group__11 ;
    public final void rule__Section__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2659:1: ( rule__Section__Group__10__Impl rule__Section__Group__11 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2660:2: rule__Section__Group__10__Impl rule__Section__Group__11
            {
            pushFollow(FOLLOW_rule__Section__Group__10__Impl_in_rule__Section__Group__105238);
            rule__Section__Group__10__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Section__Group__11_in_rule__Section__Group__105241);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2667:1: rule__Section__Group__10__Impl : ( ( rule__Section__Group_10__0 )? ) ;
    public final void rule__Section__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2671:1: ( ( ( rule__Section__Group_10__0 )? ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2672:1: ( ( rule__Section__Group_10__0 )? )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2672:1: ( ( rule__Section__Group_10__0 )? )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2673:1: ( rule__Section__Group_10__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSectionAccess().getGroup_10()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2674:1: ( rule__Section__Group_10__0 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==38) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2674:2: rule__Section__Group_10__0
                    {
                    pushFollow(FOLLOW_rule__Section__Group_10__0_in_rule__Section__Group__10__Impl5268);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2684:1: rule__Section__Group__11 : rule__Section__Group__11__Impl ;
    public final void rule__Section__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2688:1: ( rule__Section__Group__11__Impl )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2689:2: rule__Section__Group__11__Impl
            {
            pushFollow(FOLLOW_rule__Section__Group__11__Impl_in_rule__Section__Group__115299);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2695:1: rule__Section__Group__11__Impl : ( '}' ) ;
    public final void rule__Section__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2699:1: ( ( '}' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2700:1: ( '}' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2700:1: ( '}' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2701:1: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSectionAccess().getRightCurlyBracketKeyword_11()); 
            }
            match(input,16,FOLLOW_16_in_rule__Section__Group__11__Impl5327); if (state.failed) return ;
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2738:1: rule__Section__Group_4__0 : rule__Section__Group_4__0__Impl rule__Section__Group_4__1 ;
    public final void rule__Section__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2742:1: ( rule__Section__Group_4__0__Impl rule__Section__Group_4__1 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2743:2: rule__Section__Group_4__0__Impl rule__Section__Group_4__1
            {
            pushFollow(FOLLOW_rule__Section__Group_4__0__Impl_in_rule__Section__Group_4__05382);
            rule__Section__Group_4__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Section__Group_4__1_in_rule__Section__Group_4__05385);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2750:1: rule__Section__Group_4__0__Impl : ( 'description' ) ;
    public final void rule__Section__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2754:1: ( ( 'description' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2755:1: ( 'description' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2755:1: ( 'description' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2756:1: 'description'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSectionAccess().getDescriptionKeyword_4_0()); 
            }
            match(input,21,FOLLOW_21_in_rule__Section__Group_4__0__Impl5413); if (state.failed) return ;
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2769:1: rule__Section__Group_4__1 : rule__Section__Group_4__1__Impl ;
    public final void rule__Section__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2773:1: ( rule__Section__Group_4__1__Impl )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2774:2: rule__Section__Group_4__1__Impl
            {
            pushFollow(FOLLOW_rule__Section__Group_4__1__Impl_in_rule__Section__Group_4__15444);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2780:1: rule__Section__Group_4__1__Impl : ( ( rule__Section__DescriptionAssignment_4_1 ) ) ;
    public final void rule__Section__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2784:1: ( ( ( rule__Section__DescriptionAssignment_4_1 ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2785:1: ( ( rule__Section__DescriptionAssignment_4_1 ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2785:1: ( ( rule__Section__DescriptionAssignment_4_1 ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2786:1: ( rule__Section__DescriptionAssignment_4_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSectionAccess().getDescriptionAssignment_4_1()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2787:1: ( rule__Section__DescriptionAssignment_4_1 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2787:2: rule__Section__DescriptionAssignment_4_1
            {
            pushFollow(FOLLOW_rule__Section__DescriptionAssignment_4_1_in_rule__Section__Group_4__1__Impl5471);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2801:1: rule__Section__Group_5__0 : rule__Section__Group_5__0__Impl rule__Section__Group_5__1 ;
    public final void rule__Section__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2805:1: ( rule__Section__Group_5__0__Impl rule__Section__Group_5__1 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2806:2: rule__Section__Group_5__0__Impl rule__Section__Group_5__1
            {
            pushFollow(FOLLOW_rule__Section__Group_5__0__Impl_in_rule__Section__Group_5__05505);
            rule__Section__Group_5__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Section__Group_5__1_in_rule__Section__Group_5__05508);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2813:1: rule__Section__Group_5__0__Impl : ( 'id' ) ;
    public final void rule__Section__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2817:1: ( ( 'id' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2818:1: ( 'id' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2818:1: ( 'id' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2819:1: 'id'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSectionAccess().getIdKeyword_5_0()); 
            }
            match(input,24,FOLLOW_24_in_rule__Section__Group_5__0__Impl5536); if (state.failed) return ;
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2832:1: rule__Section__Group_5__1 : rule__Section__Group_5__1__Impl ;
    public final void rule__Section__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2836:1: ( rule__Section__Group_5__1__Impl )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2837:2: rule__Section__Group_5__1__Impl
            {
            pushFollow(FOLLOW_rule__Section__Group_5__1__Impl_in_rule__Section__Group_5__15567);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2843:1: rule__Section__Group_5__1__Impl : ( ( rule__Section__ActivityExplorerItemIDAssignment_5_1 ) ) ;
    public final void rule__Section__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2847:1: ( ( ( rule__Section__ActivityExplorerItemIDAssignment_5_1 ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2848:1: ( ( rule__Section__ActivityExplorerItemIDAssignment_5_1 ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2848:1: ( ( rule__Section__ActivityExplorerItemIDAssignment_5_1 ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2849:1: ( rule__Section__ActivityExplorerItemIDAssignment_5_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSectionAccess().getActivityExplorerItemIDAssignment_5_1()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2850:1: ( rule__Section__ActivityExplorerItemIDAssignment_5_1 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2850:2: rule__Section__ActivityExplorerItemIDAssignment_5_1
            {
            pushFollow(FOLLOW_rule__Section__ActivityExplorerItemIDAssignment_5_1_in_rule__Section__Group_5__1__Impl5594);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2864:1: rule__Section__Group_8__0 : rule__Section__Group_8__0__Impl rule__Section__Group_8__1 ;
    public final void rule__Section__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2868:1: ( rule__Section__Group_8__0__Impl rule__Section__Group_8__1 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2869:2: rule__Section__Group_8__0__Impl rule__Section__Group_8__1
            {
            pushFollow(FOLLOW_rule__Section__Group_8__0__Impl_in_rule__Section__Group_8__05628);
            rule__Section__Group_8__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Section__Group_8__1_in_rule__Section__Group_8__05631);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2876:1: rule__Section__Group_8__0__Impl : ( 'filtering' ) ;
    public final void rule__Section__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2880:1: ( ( 'filtering' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2881:1: ( 'filtering' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2881:1: ( 'filtering' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2882:1: 'filtering'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSectionAccess().getFilteringKeyword_8_0()); 
            }
            match(input,36,FOLLOW_36_in_rule__Section__Group_8__0__Impl5659); if (state.failed) return ;
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2895:1: rule__Section__Group_8__1 : rule__Section__Group_8__1__Impl rule__Section__Group_8__2 ;
    public final void rule__Section__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2899:1: ( rule__Section__Group_8__1__Impl rule__Section__Group_8__2 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2900:2: rule__Section__Group_8__1__Impl rule__Section__Group_8__2
            {
            pushFollow(FOLLOW_rule__Section__Group_8__1__Impl_in_rule__Section__Group_8__15690);
            rule__Section__Group_8__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Section__Group_8__2_in_rule__Section__Group_8__15693);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2907:1: rule__Section__Group_8__1__Impl : ( ':' ) ;
    public final void rule__Section__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2911:1: ( ( ':' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2912:1: ( ':' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2912:1: ( ':' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2913:1: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSectionAccess().getColonKeyword_8_1()); 
            }
            match(input,28,FOLLOW_28_in_rule__Section__Group_8__1__Impl5721); if (state.failed) return ;
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2926:1: rule__Section__Group_8__2 : rule__Section__Group_8__2__Impl ;
    public final void rule__Section__Group_8__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2930:1: ( rule__Section__Group_8__2__Impl )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2931:2: rule__Section__Group_8__2__Impl
            {
            pushFollow(FOLLOW_rule__Section__Group_8__2__Impl_in_rule__Section__Group_8__25752);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2937:1: rule__Section__Group_8__2__Impl : ( ( rule__Section__FilteringAssignment_8_2 ) ) ;
    public final void rule__Section__Group_8__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2941:1: ( ( ( rule__Section__FilteringAssignment_8_2 ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2942:1: ( ( rule__Section__FilteringAssignment_8_2 ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2942:1: ( ( rule__Section__FilteringAssignment_8_2 ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2943:1: ( rule__Section__FilteringAssignment_8_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSectionAccess().getFilteringAssignment_8_2()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2944:1: ( rule__Section__FilteringAssignment_8_2 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2944:2: rule__Section__FilteringAssignment_8_2
            {
            pushFollow(FOLLOW_rule__Section__FilteringAssignment_8_2_in_rule__Section__Group_8__2__Impl5779);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2960:1: rule__Section__Group_9__0 : rule__Section__Group_9__0__Impl rule__Section__Group_9__1 ;
    public final void rule__Section__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2964:1: ( rule__Section__Group_9__0__Impl rule__Section__Group_9__1 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2965:2: rule__Section__Group_9__0__Impl rule__Section__Group_9__1
            {
            pushFollow(FOLLOW_rule__Section__Group_9__0__Impl_in_rule__Section__Group_9__05815);
            rule__Section__Group_9__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Section__Group_9__1_in_rule__Section__Group_9__05818);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2972:1: rule__Section__Group_9__0__Impl : ( 'expanded' ) ;
    public final void rule__Section__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2976:1: ( ( 'expanded' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2977:1: ( 'expanded' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2977:1: ( 'expanded' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2978:1: 'expanded'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSectionAccess().getExpandedKeyword_9_0()); 
            }
            match(input,37,FOLLOW_37_in_rule__Section__Group_9__0__Impl5846); if (state.failed) return ;
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2991:1: rule__Section__Group_9__1 : rule__Section__Group_9__1__Impl rule__Section__Group_9__2 ;
    public final void rule__Section__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2995:1: ( rule__Section__Group_9__1__Impl rule__Section__Group_9__2 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:2996:2: rule__Section__Group_9__1__Impl rule__Section__Group_9__2
            {
            pushFollow(FOLLOW_rule__Section__Group_9__1__Impl_in_rule__Section__Group_9__15877);
            rule__Section__Group_9__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Section__Group_9__2_in_rule__Section__Group_9__15880);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3003:1: rule__Section__Group_9__1__Impl : ( ':' ) ;
    public final void rule__Section__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3007:1: ( ( ':' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3008:1: ( ':' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3008:1: ( ':' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3009:1: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSectionAccess().getColonKeyword_9_1()); 
            }
            match(input,28,FOLLOW_28_in_rule__Section__Group_9__1__Impl5908); if (state.failed) return ;
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3022:1: rule__Section__Group_9__2 : rule__Section__Group_9__2__Impl ;
    public final void rule__Section__Group_9__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3026:1: ( rule__Section__Group_9__2__Impl )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3027:2: rule__Section__Group_9__2__Impl
            {
            pushFollow(FOLLOW_rule__Section__Group_9__2__Impl_in_rule__Section__Group_9__25939);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3033:1: rule__Section__Group_9__2__Impl : ( ( rule__Section__ExpandedAssignment_9_2 ) ) ;
    public final void rule__Section__Group_9__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3037:1: ( ( ( rule__Section__ExpandedAssignment_9_2 ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3038:1: ( ( rule__Section__ExpandedAssignment_9_2 ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3038:1: ( ( rule__Section__ExpandedAssignment_9_2 ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3039:1: ( rule__Section__ExpandedAssignment_9_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSectionAccess().getExpandedAssignment_9_2()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3040:1: ( rule__Section__ExpandedAssignment_9_2 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3040:2: rule__Section__ExpandedAssignment_9_2
            {
            pushFollow(FOLLOW_rule__Section__ExpandedAssignment_9_2_in_rule__Section__Group_9__2__Impl5966);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3056:1: rule__Section__Group_10__0 : rule__Section__Group_10__0__Impl rule__Section__Group_10__1 ;
    public final void rule__Section__Group_10__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3060:1: ( rule__Section__Group_10__0__Impl rule__Section__Group_10__1 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3061:2: rule__Section__Group_10__0__Impl rule__Section__Group_10__1
            {
            pushFollow(FOLLOW_rule__Section__Group_10__0__Impl_in_rule__Section__Group_10__06002);
            rule__Section__Group_10__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Section__Group_10__1_in_rule__Section__Group_10__06005);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3068:1: rule__Section__Group_10__0__Impl : ( 'activities' ) ;
    public final void rule__Section__Group_10__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3072:1: ( ( 'activities' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3073:1: ( 'activities' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3073:1: ( 'activities' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3074:1: 'activities'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSectionAccess().getActivitiesKeyword_10_0()); 
            }
            match(input,38,FOLLOW_38_in_rule__Section__Group_10__0__Impl6033); if (state.failed) return ;
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3087:1: rule__Section__Group_10__1 : rule__Section__Group_10__1__Impl rule__Section__Group_10__2 ;
    public final void rule__Section__Group_10__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3091:1: ( rule__Section__Group_10__1__Impl rule__Section__Group_10__2 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3092:2: rule__Section__Group_10__1__Impl rule__Section__Group_10__2
            {
            pushFollow(FOLLOW_rule__Section__Group_10__1__Impl_in_rule__Section__Group_10__16064);
            rule__Section__Group_10__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Section__Group_10__2_in_rule__Section__Group_10__16067);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3099:1: rule__Section__Group_10__1__Impl : ( '{' ) ;
    public final void rule__Section__Group_10__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3103:1: ( ( '{' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3104:1: ( '{' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3104:1: ( '{' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3105:1: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSectionAccess().getLeftCurlyBracketKeyword_10_1()); 
            }
            match(input,15,FOLLOW_15_in_rule__Section__Group_10__1__Impl6095); if (state.failed) return ;
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3118:1: rule__Section__Group_10__2 : rule__Section__Group_10__2__Impl rule__Section__Group_10__3 ;
    public final void rule__Section__Group_10__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3122:1: ( rule__Section__Group_10__2__Impl rule__Section__Group_10__3 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3123:2: rule__Section__Group_10__2__Impl rule__Section__Group_10__3
            {
            pushFollow(FOLLOW_rule__Section__Group_10__2__Impl_in_rule__Section__Group_10__26126);
            rule__Section__Group_10__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Section__Group_10__3_in_rule__Section__Group_10__26129);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3130:1: rule__Section__Group_10__2__Impl : ( ( rule__Section__OwnedActivitiesAssignment_10_2 )* ) ;
    public final void rule__Section__Group_10__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3134:1: ( ( ( rule__Section__OwnedActivitiesAssignment_10_2 )* ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3135:1: ( ( rule__Section__OwnedActivitiesAssignment_10_2 )* )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3135:1: ( ( rule__Section__OwnedActivitiesAssignment_10_2 )* )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3136:1: ( rule__Section__OwnedActivitiesAssignment_10_2 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSectionAccess().getOwnedActivitiesAssignment_10_2()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3137:1: ( rule__Section__OwnedActivitiesAssignment_10_2 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==13) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3137:2: rule__Section__OwnedActivitiesAssignment_10_2
            	    {
            	    pushFollow(FOLLOW_rule__Section__OwnedActivitiesAssignment_10_2_in_rule__Section__Group_10__2__Impl6156);
            	    rule__Section__OwnedActivitiesAssignment_10_2();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop22;
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3147:1: rule__Section__Group_10__3 : rule__Section__Group_10__3__Impl ;
    public final void rule__Section__Group_10__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3151:1: ( rule__Section__Group_10__3__Impl )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3152:2: rule__Section__Group_10__3__Impl
            {
            pushFollow(FOLLOW_rule__Section__Group_10__3__Impl_in_rule__Section__Group_10__36187);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3158:1: rule__Section__Group_10__3__Impl : ( '}' ) ;
    public final void rule__Section__Group_10__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3162:1: ( ( '}' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3163:1: ( '}' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3163:1: ( '}' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3164:1: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSectionAccess().getRightCurlyBracketKeyword_10_3()); 
            }
            match(input,16,FOLLOW_16_in_rule__Section__Group_10__3__Impl6215); if (state.failed) return ;
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3185:1: rule__Activity__Group__0 : rule__Activity__Group__0__Impl rule__Activity__Group__1 ;
    public final void rule__Activity__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3189:1: ( rule__Activity__Group__0__Impl rule__Activity__Group__1 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3190:2: rule__Activity__Group__0__Impl rule__Activity__Group__1
            {
            pushFollow(FOLLOW_rule__Activity__Group__0__Impl_in_rule__Activity__Group__06254);
            rule__Activity__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Activity__Group__1_in_rule__Activity__Group__06257);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3197:1: rule__Activity__Group__0__Impl : ( () ) ;
    public final void rule__Activity__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3201:1: ( ( () ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3202:1: ( () )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3202:1: ( () )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3203:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getActivityAccess().getActivityAction_0()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3204:1: ()
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3206:1: 
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3216:1: rule__Activity__Group__1 : rule__Activity__Group__1__Impl rule__Activity__Group__2 ;
    public final void rule__Activity__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3220:1: ( rule__Activity__Group__1__Impl rule__Activity__Group__2 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3221:2: rule__Activity__Group__1__Impl rule__Activity__Group__2
            {
            pushFollow(FOLLOW_rule__Activity__Group__1__Impl_in_rule__Activity__Group__16315);
            rule__Activity__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Activity__Group__2_in_rule__Activity__Group__16318);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3228:1: rule__Activity__Group__1__Impl : ( 'activity' ) ;
    public final void rule__Activity__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3232:1: ( ( 'activity' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3233:1: ( 'activity' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3233:1: ( 'activity' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3234:1: 'activity'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getActivityAccess().getActivityKeyword_1()); 
            }
            match(input,13,FOLLOW_13_in_rule__Activity__Group__1__Impl6346); if (state.failed) return ;
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3247:1: rule__Activity__Group__2 : rule__Activity__Group__2__Impl rule__Activity__Group__3 ;
    public final void rule__Activity__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3251:1: ( rule__Activity__Group__2__Impl rule__Activity__Group__3 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3252:2: rule__Activity__Group__2__Impl rule__Activity__Group__3
            {
            pushFollow(FOLLOW_rule__Activity__Group__2__Impl_in_rule__Activity__Group__26377);
            rule__Activity__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Activity__Group__3_in_rule__Activity__Group__26380);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3259:1: rule__Activity__Group__2__Impl : ( ( rule__Activity__NameAssignment_2 ) ) ;
    public final void rule__Activity__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3263:1: ( ( ( rule__Activity__NameAssignment_2 ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3264:1: ( ( rule__Activity__NameAssignment_2 ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3264:1: ( ( rule__Activity__NameAssignment_2 ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3265:1: ( rule__Activity__NameAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getActivityAccess().getNameAssignment_2()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3266:1: ( rule__Activity__NameAssignment_2 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3266:2: rule__Activity__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__Activity__NameAssignment_2_in_rule__Activity__Group__2__Impl6407);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3276:1: rule__Activity__Group__3 : rule__Activity__Group__3__Impl rule__Activity__Group__4 ;
    public final void rule__Activity__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3280:1: ( rule__Activity__Group__3__Impl rule__Activity__Group__4 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3281:2: rule__Activity__Group__3__Impl rule__Activity__Group__4
            {
            pushFollow(FOLLOW_rule__Activity__Group__3__Impl_in_rule__Activity__Group__36437);
            rule__Activity__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Activity__Group__4_in_rule__Activity__Group__36440);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3288:1: rule__Activity__Group__3__Impl : ( '{' ) ;
    public final void rule__Activity__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3292:1: ( ( '{' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3293:1: ( '{' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3293:1: ( '{' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3294:1: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getActivityAccess().getLeftCurlyBracketKeyword_3()); 
            }
            match(input,15,FOLLOW_15_in_rule__Activity__Group__3__Impl6468); if (state.failed) return ;
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3307:1: rule__Activity__Group__4 : rule__Activity__Group__4__Impl rule__Activity__Group__5 ;
    public final void rule__Activity__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3311:1: ( rule__Activity__Group__4__Impl rule__Activity__Group__5 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3312:2: rule__Activity__Group__4__Impl rule__Activity__Group__5
            {
            pushFollow(FOLLOW_rule__Activity__Group__4__Impl_in_rule__Activity__Group__46499);
            rule__Activity__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Activity__Group__5_in_rule__Activity__Group__46502);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3319:1: rule__Activity__Group__4__Impl : ( ( rule__Activity__Group_4__0 )? ) ;
    public final void rule__Activity__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3323:1: ( ( ( rule__Activity__Group_4__0 )? ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3324:1: ( ( rule__Activity__Group_4__0 )? )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3324:1: ( ( rule__Activity__Group_4__0 )? )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3325:1: ( rule__Activity__Group_4__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getActivityAccess().getGroup_4()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3326:1: ( rule__Activity__Group_4__0 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==21) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3326:2: rule__Activity__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__Activity__Group_4__0_in_rule__Activity__Group__4__Impl6529);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3336:1: rule__Activity__Group__5 : rule__Activity__Group__5__Impl rule__Activity__Group__6 ;
    public final void rule__Activity__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3340:1: ( rule__Activity__Group__5__Impl rule__Activity__Group__6 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3341:2: rule__Activity__Group__5__Impl rule__Activity__Group__6
            {
            pushFollow(FOLLOW_rule__Activity__Group__5__Impl_in_rule__Activity__Group__56560);
            rule__Activity__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Activity__Group__6_in_rule__Activity__Group__56563);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3348:1: rule__Activity__Group__5__Impl : ( ( rule__Activity__Group_5__0 )? ) ;
    public final void rule__Activity__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3352:1: ( ( ( rule__Activity__Group_5__0 )? ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3353:1: ( ( rule__Activity__Group_5__0 )? )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3353:1: ( ( rule__Activity__Group_5__0 )? )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3354:1: ( rule__Activity__Group_5__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getActivityAccess().getGroup_5()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3355:1: ( rule__Activity__Group_5__0 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==24) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3355:2: rule__Activity__Group_5__0
                    {
                    pushFollow(FOLLOW_rule__Activity__Group_5__0_in_rule__Activity__Group__5__Impl6590);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3365:1: rule__Activity__Group__6 : rule__Activity__Group__6__Impl rule__Activity__Group__7 ;
    public final void rule__Activity__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3369:1: ( rule__Activity__Group__6__Impl rule__Activity__Group__7 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3370:2: rule__Activity__Group__6__Impl rule__Activity__Group__7
            {
            pushFollow(FOLLOW_rule__Activity__Group__6__Impl_in_rule__Activity__Group__66621);
            rule__Activity__Group__6__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Activity__Group__7_in_rule__Activity__Group__66624);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3377:1: rule__Activity__Group__6__Impl : ( 'index' ) ;
    public final void rule__Activity__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3381:1: ( ( 'index' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3382:1: ( 'index' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3382:1: ( 'index' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3383:1: 'index'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getActivityAccess().getIndexKeyword_6()); 
            }
            match(input,19,FOLLOW_19_in_rule__Activity__Group__6__Impl6652); if (state.failed) return ;
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3396:1: rule__Activity__Group__7 : rule__Activity__Group__7__Impl rule__Activity__Group__8 ;
    public final void rule__Activity__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3400:1: ( rule__Activity__Group__7__Impl rule__Activity__Group__8 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3401:2: rule__Activity__Group__7__Impl rule__Activity__Group__8
            {
            pushFollow(FOLLOW_rule__Activity__Group__7__Impl_in_rule__Activity__Group__76683);
            rule__Activity__Group__7__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Activity__Group__8_in_rule__Activity__Group__76686);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3408:1: rule__Activity__Group__7__Impl : ( ( rule__Activity__IndexAssignment_7 ) ) ;
    public final void rule__Activity__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3412:1: ( ( ( rule__Activity__IndexAssignment_7 ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3413:1: ( ( rule__Activity__IndexAssignment_7 ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3413:1: ( ( rule__Activity__IndexAssignment_7 ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3414:1: ( rule__Activity__IndexAssignment_7 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getActivityAccess().getIndexAssignment_7()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3415:1: ( rule__Activity__IndexAssignment_7 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3415:2: rule__Activity__IndexAssignment_7
            {
            pushFollow(FOLLOW_rule__Activity__IndexAssignment_7_in_rule__Activity__Group__7__Impl6713);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3425:1: rule__Activity__Group__8 : rule__Activity__Group__8__Impl rule__Activity__Group__9 ;
    public final void rule__Activity__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3429:1: ( rule__Activity__Group__8__Impl rule__Activity__Group__9 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3430:2: rule__Activity__Group__8__Impl rule__Activity__Group__9
            {
            pushFollow(FOLLOW_rule__Activity__Group__8__Impl_in_rule__Activity__Group__86743);
            rule__Activity__Group__8__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Activity__Group__9_in_rule__Activity__Group__86746);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3437:1: rule__Activity__Group__8__Impl : ( ( rule__Activity__Group_8__0 )? ) ;
    public final void rule__Activity__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3441:1: ( ( ( rule__Activity__Group_8__0 )? ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3442:1: ( ( rule__Activity__Group_8__0 )? )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3442:1: ( ( rule__Activity__Group_8__0 )? )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3443:1: ( rule__Activity__Group_8__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getActivityAccess().getGroup_8()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3444:1: ( rule__Activity__Group_8__0 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==32) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3444:2: rule__Activity__Group_8__0
                    {
                    pushFollow(FOLLOW_rule__Activity__Group_8__0_in_rule__Activity__Group__8__Impl6773);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3454:1: rule__Activity__Group__9 : rule__Activity__Group__9__Impl rule__Activity__Group__10 ;
    public final void rule__Activity__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3458:1: ( rule__Activity__Group__9__Impl rule__Activity__Group__10 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3459:2: rule__Activity__Group__9__Impl rule__Activity__Group__10
            {
            pushFollow(FOLLOW_rule__Activity__Group__9__Impl_in_rule__Activity__Group__96804);
            rule__Activity__Group__9__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Activity__Group__10_in_rule__Activity__Group__96807);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3466:1: rule__Activity__Group__9__Impl : ( ( rule__Activity__Group_9__0 )? ) ;
    public final void rule__Activity__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3470:1: ( ( ( rule__Activity__Group_9__0 )? ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3471:1: ( ( rule__Activity__Group_9__0 )? )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3471:1: ( ( rule__Activity__Group_9__0 )? )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3472:1: ( rule__Activity__Group_9__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getActivityAccess().getGroup_9()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3473:1: ( rule__Activity__Group_9__0 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==39) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3473:2: rule__Activity__Group_9__0
                    {
                    pushFollow(FOLLOW_rule__Activity__Group_9__0_in_rule__Activity__Group__9__Impl6834);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3483:1: rule__Activity__Group__10 : rule__Activity__Group__10__Impl ;
    public final void rule__Activity__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3487:1: ( rule__Activity__Group__10__Impl )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3488:2: rule__Activity__Group__10__Impl
            {
            pushFollow(FOLLOW_rule__Activity__Group__10__Impl_in_rule__Activity__Group__106865);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3494:1: rule__Activity__Group__10__Impl : ( '}' ) ;
    public final void rule__Activity__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3498:1: ( ( '}' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3499:1: ( '}' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3499:1: ( '}' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3500:1: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getActivityAccess().getRightCurlyBracketKeyword_10()); 
            }
            match(input,16,FOLLOW_16_in_rule__Activity__Group__10__Impl6893); if (state.failed) return ;
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3535:1: rule__Activity__Group_4__0 : rule__Activity__Group_4__0__Impl rule__Activity__Group_4__1 ;
    public final void rule__Activity__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3539:1: ( rule__Activity__Group_4__0__Impl rule__Activity__Group_4__1 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3540:2: rule__Activity__Group_4__0__Impl rule__Activity__Group_4__1
            {
            pushFollow(FOLLOW_rule__Activity__Group_4__0__Impl_in_rule__Activity__Group_4__06946);
            rule__Activity__Group_4__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Activity__Group_4__1_in_rule__Activity__Group_4__06949);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3547:1: rule__Activity__Group_4__0__Impl : ( 'description' ) ;
    public final void rule__Activity__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3551:1: ( ( 'description' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3552:1: ( 'description' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3552:1: ( 'description' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3553:1: 'description'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getActivityAccess().getDescriptionKeyword_4_0()); 
            }
            match(input,21,FOLLOW_21_in_rule__Activity__Group_4__0__Impl6977); if (state.failed) return ;
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3566:1: rule__Activity__Group_4__1 : rule__Activity__Group_4__1__Impl ;
    public final void rule__Activity__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3570:1: ( rule__Activity__Group_4__1__Impl )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3571:2: rule__Activity__Group_4__1__Impl
            {
            pushFollow(FOLLOW_rule__Activity__Group_4__1__Impl_in_rule__Activity__Group_4__17008);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3577:1: rule__Activity__Group_4__1__Impl : ( ( rule__Activity__DescriptionAssignment_4_1 ) ) ;
    public final void rule__Activity__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3581:1: ( ( ( rule__Activity__DescriptionAssignment_4_1 ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3582:1: ( ( rule__Activity__DescriptionAssignment_4_1 ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3582:1: ( ( rule__Activity__DescriptionAssignment_4_1 ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3583:1: ( rule__Activity__DescriptionAssignment_4_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getActivityAccess().getDescriptionAssignment_4_1()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3584:1: ( rule__Activity__DescriptionAssignment_4_1 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3584:2: rule__Activity__DescriptionAssignment_4_1
            {
            pushFollow(FOLLOW_rule__Activity__DescriptionAssignment_4_1_in_rule__Activity__Group_4__1__Impl7035);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3598:1: rule__Activity__Group_5__0 : rule__Activity__Group_5__0__Impl rule__Activity__Group_5__1 ;
    public final void rule__Activity__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3602:1: ( rule__Activity__Group_5__0__Impl rule__Activity__Group_5__1 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3603:2: rule__Activity__Group_5__0__Impl rule__Activity__Group_5__1
            {
            pushFollow(FOLLOW_rule__Activity__Group_5__0__Impl_in_rule__Activity__Group_5__07069);
            rule__Activity__Group_5__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Activity__Group_5__1_in_rule__Activity__Group_5__07072);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3610:1: rule__Activity__Group_5__0__Impl : ( 'id' ) ;
    public final void rule__Activity__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3614:1: ( ( 'id' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3615:1: ( 'id' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3615:1: ( 'id' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3616:1: 'id'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getActivityAccess().getIdKeyword_5_0()); 
            }
            match(input,24,FOLLOW_24_in_rule__Activity__Group_5__0__Impl7100); if (state.failed) return ;
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3629:1: rule__Activity__Group_5__1 : rule__Activity__Group_5__1__Impl ;
    public final void rule__Activity__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3633:1: ( rule__Activity__Group_5__1__Impl )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3634:2: rule__Activity__Group_5__1__Impl
            {
            pushFollow(FOLLOW_rule__Activity__Group_5__1__Impl_in_rule__Activity__Group_5__17131);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3640:1: rule__Activity__Group_5__1__Impl : ( ( rule__Activity__ActivityExplorerItemIDAssignment_5_1 ) ) ;
    public final void rule__Activity__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3644:1: ( ( ( rule__Activity__ActivityExplorerItemIDAssignment_5_1 ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3645:1: ( ( rule__Activity__ActivityExplorerItemIDAssignment_5_1 ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3645:1: ( ( rule__Activity__ActivityExplorerItemIDAssignment_5_1 ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3646:1: ( rule__Activity__ActivityExplorerItemIDAssignment_5_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getActivityAccess().getActivityExplorerItemIDAssignment_5_1()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3647:1: ( rule__Activity__ActivityExplorerItemIDAssignment_5_1 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3647:2: rule__Activity__ActivityExplorerItemIDAssignment_5_1
            {
            pushFollow(FOLLOW_rule__Activity__ActivityExplorerItemIDAssignment_5_1_in_rule__Activity__Group_5__1__Impl7158);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3661:1: rule__Activity__Group_8__0 : rule__Activity__Group_8__0__Impl rule__Activity__Group_8__1 ;
    public final void rule__Activity__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3665:1: ( rule__Activity__Group_8__0__Impl rule__Activity__Group_8__1 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3666:2: rule__Activity__Group_8__0__Impl rule__Activity__Group_8__1
            {
            pushFollow(FOLLOW_rule__Activity__Group_8__0__Impl_in_rule__Activity__Group_8__07192);
            rule__Activity__Group_8__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Activity__Group_8__1_in_rule__Activity__Group_8__07195);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3673:1: rule__Activity__Group_8__0__Impl : ( 'predicated' ) ;
    public final void rule__Activity__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3677:1: ( ( 'predicated' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3678:1: ( 'predicated' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3678:1: ( 'predicated' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3679:1: 'predicated'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getActivityAccess().getPredicatedKeyword_8_0()); 
            }
            match(input,32,FOLLOW_32_in_rule__Activity__Group_8__0__Impl7223); if (state.failed) return ;
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3692:1: rule__Activity__Group_8__1 : rule__Activity__Group_8__1__Impl rule__Activity__Group_8__2 ;
    public final void rule__Activity__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3696:1: ( rule__Activity__Group_8__1__Impl rule__Activity__Group_8__2 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3697:2: rule__Activity__Group_8__1__Impl rule__Activity__Group_8__2
            {
            pushFollow(FOLLOW_rule__Activity__Group_8__1__Impl_in_rule__Activity__Group_8__17254);
            rule__Activity__Group_8__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Activity__Group_8__2_in_rule__Activity__Group_8__17257);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3704:1: rule__Activity__Group_8__1__Impl : ( ':' ) ;
    public final void rule__Activity__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3708:1: ( ( ':' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3709:1: ( ':' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3709:1: ( ':' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3710:1: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getActivityAccess().getColonKeyword_8_1()); 
            }
            match(input,28,FOLLOW_28_in_rule__Activity__Group_8__1__Impl7285); if (state.failed) return ;
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3723:1: rule__Activity__Group_8__2 : rule__Activity__Group_8__2__Impl ;
    public final void rule__Activity__Group_8__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3727:1: ( rule__Activity__Group_8__2__Impl )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3728:2: rule__Activity__Group_8__2__Impl
            {
            pushFollow(FOLLOW_rule__Activity__Group_8__2__Impl_in_rule__Activity__Group_8__27316);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3734:1: rule__Activity__Group_8__2__Impl : ( ( rule__Activity__HasPredicateAssignment_8_2 ) ) ;
    public final void rule__Activity__Group_8__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3738:1: ( ( ( rule__Activity__HasPredicateAssignment_8_2 ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3739:1: ( ( rule__Activity__HasPredicateAssignment_8_2 ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3739:1: ( ( rule__Activity__HasPredicateAssignment_8_2 ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3740:1: ( rule__Activity__HasPredicateAssignment_8_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getActivityAccess().getHasPredicateAssignment_8_2()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3741:1: ( rule__Activity__HasPredicateAssignment_8_2 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3741:2: rule__Activity__HasPredicateAssignment_8_2
            {
            pushFollow(FOLLOW_rule__Activity__HasPredicateAssignment_8_2_in_rule__Activity__Group_8__2__Impl7343);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3757:1: rule__Activity__Group_9__0 : rule__Activity__Group_9__0__Impl rule__Activity__Group_9__1 ;
    public final void rule__Activity__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3761:1: ( rule__Activity__Group_9__0__Impl rule__Activity__Group_9__1 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3762:2: rule__Activity__Group_9__0__Impl rule__Activity__Group_9__1
            {
            pushFollow(FOLLOW_rule__Activity__Group_9__0__Impl_in_rule__Activity__Group_9__07379);
            rule__Activity__Group_9__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Activity__Group_9__1_in_rule__Activity__Group_9__07382);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3769:1: rule__Activity__Group_9__0__Impl : ( 'icon' ) ;
    public final void rule__Activity__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3773:1: ( ( 'icon' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3774:1: ( 'icon' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3774:1: ( 'icon' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3775:1: 'icon'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getActivityAccess().getIconKeyword_9_0()); 
            }
            match(input,39,FOLLOW_39_in_rule__Activity__Group_9__0__Impl7410); if (state.failed) return ;
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3788:1: rule__Activity__Group_9__1 : rule__Activity__Group_9__1__Impl rule__Activity__Group_9__2 ;
    public final void rule__Activity__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3792:1: ( rule__Activity__Group_9__1__Impl rule__Activity__Group_9__2 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3793:2: rule__Activity__Group_9__1__Impl rule__Activity__Group_9__2
            {
            pushFollow(FOLLOW_rule__Activity__Group_9__1__Impl_in_rule__Activity__Group_9__17441);
            rule__Activity__Group_9__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Activity__Group_9__2_in_rule__Activity__Group_9__17444);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3800:1: rule__Activity__Group_9__1__Impl : ( ':' ) ;
    public final void rule__Activity__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3804:1: ( ( ':' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3805:1: ( ':' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3805:1: ( ':' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3806:1: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getActivityAccess().getColonKeyword_9_1()); 
            }
            match(input,28,FOLLOW_28_in_rule__Activity__Group_9__1__Impl7472); if (state.failed) return ;
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3819:1: rule__Activity__Group_9__2 : rule__Activity__Group_9__2__Impl ;
    public final void rule__Activity__Group_9__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3823:1: ( rule__Activity__Group_9__2__Impl )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3824:2: rule__Activity__Group_9__2__Impl
            {
            pushFollow(FOLLOW_rule__Activity__Group_9__2__Impl_in_rule__Activity__Group_9__27503);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3830:1: rule__Activity__Group_9__2__Impl : ( ( rule__Activity__ImagePathOffAssignment_9_2 ) ) ;
    public final void rule__Activity__Group_9__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3834:1: ( ( ( rule__Activity__ImagePathOffAssignment_9_2 ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3835:1: ( ( rule__Activity__ImagePathOffAssignment_9_2 ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3835:1: ( ( rule__Activity__ImagePathOffAssignment_9_2 ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3836:1: ( rule__Activity__ImagePathOffAssignment_9_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getActivityAccess().getImagePathOffAssignment_9_2()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3837:1: ( rule__Activity__ImagePathOffAssignment_9_2 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3837:2: rule__Activity__ImagePathOffAssignment_9_2
            {
            pushFollow(FOLLOW_rule__Activity__ImagePathOffAssignment_9_2_in_rule__Activity__Group_9__2__Impl7530);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3853:1: rule__PageExtension__Group__0 : rule__PageExtension__Group__0__Impl rule__PageExtension__Group__1 ;
    public final void rule__PageExtension__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3857:1: ( rule__PageExtension__Group__0__Impl rule__PageExtension__Group__1 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3858:2: rule__PageExtension__Group__0__Impl rule__PageExtension__Group__1
            {
            pushFollow(FOLLOW_rule__PageExtension__Group__0__Impl_in_rule__PageExtension__Group__07566);
            rule__PageExtension__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__PageExtension__Group__1_in_rule__PageExtension__Group__07569);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3865:1: rule__PageExtension__Group__0__Impl : ( () ) ;
    public final void rule__PageExtension__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3869:1: ( ( () ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3870:1: ( () )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3870:1: ( () )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3871:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPageExtensionAccess().getPageExtensionAction_0()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3872:1: ()
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3874:1: 
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3884:1: rule__PageExtension__Group__1 : rule__PageExtension__Group__1__Impl rule__PageExtension__Group__2 ;
    public final void rule__PageExtension__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3888:1: ( rule__PageExtension__Group__1__Impl rule__PageExtension__Group__2 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3889:2: rule__PageExtension__Group__1__Impl rule__PageExtension__Group__2
            {
            pushFollow(FOLLOW_rule__PageExtension__Group__1__Impl_in_rule__PageExtension__Group__17627);
            rule__PageExtension__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__PageExtension__Group__2_in_rule__PageExtension__Group__17630);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3896:1: rule__PageExtension__Group__1__Impl : ( 'page' ) ;
    public final void rule__PageExtension__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3900:1: ( ( 'page' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3901:1: ( 'page' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3901:1: ( 'page' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3902:1: 'page'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPageExtensionAccess().getPageKeyword_1()); 
            }
            match(input,18,FOLLOW_18_in_rule__PageExtension__Group__1__Impl7658); if (state.failed) return ;
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3915:1: rule__PageExtension__Group__2 : rule__PageExtension__Group__2__Impl rule__PageExtension__Group__3 ;
    public final void rule__PageExtension__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3919:1: ( rule__PageExtension__Group__2__Impl rule__PageExtension__Group__3 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3920:2: rule__PageExtension__Group__2__Impl rule__PageExtension__Group__3
            {
            pushFollow(FOLLOW_rule__PageExtension__Group__2__Impl_in_rule__PageExtension__Group__27689);
            rule__PageExtension__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__PageExtension__Group__3_in_rule__PageExtension__Group__27692);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3927:1: rule__PageExtension__Group__2__Impl : ( 'extensions' ) ;
    public final void rule__PageExtension__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3931:1: ( ( 'extensions' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3932:1: ( 'extensions' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3932:1: ( 'extensions' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3933:1: 'extensions'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPageExtensionAccess().getExtensionsKeyword_2()); 
            }
            match(input,40,FOLLOW_40_in_rule__PageExtension__Group__2__Impl7720); if (state.failed) return ;
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3946:1: rule__PageExtension__Group__3 : rule__PageExtension__Group__3__Impl rule__PageExtension__Group__4 ;
    public final void rule__PageExtension__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3950:1: ( rule__PageExtension__Group__3__Impl rule__PageExtension__Group__4 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3951:2: rule__PageExtension__Group__3__Impl rule__PageExtension__Group__4
            {
            pushFollow(FOLLOW_rule__PageExtension__Group__3__Impl_in_rule__PageExtension__Group__37751);
            rule__PageExtension__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__PageExtension__Group__4_in_rule__PageExtension__Group__37754);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3958:1: rule__PageExtension__Group__3__Impl : ( '{' ) ;
    public final void rule__PageExtension__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3962:1: ( ( '{' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3963:1: ( '{' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3963:1: ( '{' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3964:1: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPageExtensionAccess().getLeftCurlyBracketKeyword_3()); 
            }
            match(input,15,FOLLOW_15_in_rule__PageExtension__Group__3__Impl7782); if (state.failed) return ;
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3977:1: rule__PageExtension__Group__4 : rule__PageExtension__Group__4__Impl rule__PageExtension__Group__5 ;
    public final void rule__PageExtension__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3981:1: ( rule__PageExtension__Group__4__Impl rule__PageExtension__Group__5 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3982:2: rule__PageExtension__Group__4__Impl rule__PageExtension__Group__5
            {
            pushFollow(FOLLOW_rule__PageExtension__Group__4__Impl_in_rule__PageExtension__Group__47813);
            rule__PageExtension__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__PageExtension__Group__5_in_rule__PageExtension__Group__47816);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3989:1: rule__PageExtension__Group__4__Impl : ( 'extended' ) ;
    public final void rule__PageExtension__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3993:1: ( ( 'extended' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3994:1: ( 'extended' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3994:1: ( 'extended' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:3995:1: 'extended'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPageExtensionAccess().getExtendedKeyword_4()); 
            }
            match(input,41,FOLLOW_41_in_rule__PageExtension__Group__4__Impl7844); if (state.failed) return ;
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4008:1: rule__PageExtension__Group__5 : rule__PageExtension__Group__5__Impl rule__PageExtension__Group__6 ;
    public final void rule__PageExtension__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4012:1: ( rule__PageExtension__Group__5__Impl rule__PageExtension__Group__6 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4013:2: rule__PageExtension__Group__5__Impl rule__PageExtension__Group__6
            {
            pushFollow(FOLLOW_rule__PageExtension__Group__5__Impl_in_rule__PageExtension__Group__57875);
            rule__PageExtension__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__PageExtension__Group__6_in_rule__PageExtension__Group__57878);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4020:1: rule__PageExtension__Group__5__Impl : ( 'page' ) ;
    public final void rule__PageExtension__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4024:1: ( ( 'page' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4025:1: ( 'page' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4025:1: ( 'page' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4026:1: 'page'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPageExtensionAccess().getPageKeyword_5()); 
            }
            match(input,18,FOLLOW_18_in_rule__PageExtension__Group__5__Impl7906); if (state.failed) return ;
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4039:1: rule__PageExtension__Group__6 : rule__PageExtension__Group__6__Impl rule__PageExtension__Group__7 ;
    public final void rule__PageExtension__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4043:1: ( rule__PageExtension__Group__6__Impl rule__PageExtension__Group__7 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4044:2: rule__PageExtension__Group__6__Impl rule__PageExtension__Group__7
            {
            pushFollow(FOLLOW_rule__PageExtension__Group__6__Impl_in_rule__PageExtension__Group__67937);
            rule__PageExtension__Group__6__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__PageExtension__Group__7_in_rule__PageExtension__Group__67940);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4051:1: rule__PageExtension__Group__6__Impl : ( ( rule__PageExtension__ExtendedPageIDAssignment_6 ) ) ;
    public final void rule__PageExtension__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4055:1: ( ( ( rule__PageExtension__ExtendedPageIDAssignment_6 ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4056:1: ( ( rule__PageExtension__ExtendedPageIDAssignment_6 ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4056:1: ( ( rule__PageExtension__ExtendedPageIDAssignment_6 ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4057:1: ( rule__PageExtension__ExtendedPageIDAssignment_6 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPageExtensionAccess().getExtendedPageIDAssignment_6()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4058:1: ( rule__PageExtension__ExtendedPageIDAssignment_6 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4058:2: rule__PageExtension__ExtendedPageIDAssignment_6
            {
            pushFollow(FOLLOW_rule__PageExtension__ExtendedPageIDAssignment_6_in_rule__PageExtension__Group__6__Impl7967);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4068:1: rule__PageExtension__Group__7 : rule__PageExtension__Group__7__Impl rule__PageExtension__Group__8 ;
    public final void rule__PageExtension__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4072:1: ( rule__PageExtension__Group__7__Impl rule__PageExtension__Group__8 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4073:2: rule__PageExtension__Group__7__Impl rule__PageExtension__Group__8
            {
            pushFollow(FOLLOW_rule__PageExtension__Group__7__Impl_in_rule__PageExtension__Group__77997);
            rule__PageExtension__Group__7__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__PageExtension__Group__8_in_rule__PageExtension__Group__78000);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4080:1: rule__PageExtension__Group__7__Impl : ( ( rule__PageExtension__OwnedSectionsAssignment_7 )* ) ;
    public final void rule__PageExtension__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4084:1: ( ( ( rule__PageExtension__OwnedSectionsAssignment_7 )* ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4085:1: ( ( rule__PageExtension__OwnedSectionsAssignment_7 )* )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4085:1: ( ( rule__PageExtension__OwnedSectionsAssignment_7 )* )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4086:1: ( rule__PageExtension__OwnedSectionsAssignment_7 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPageExtensionAccess().getOwnedSectionsAssignment_7()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4087:1: ( rule__PageExtension__OwnedSectionsAssignment_7 )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==35) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4087:2: rule__PageExtension__OwnedSectionsAssignment_7
            	    {
            	    pushFollow(FOLLOW_rule__PageExtension__OwnedSectionsAssignment_7_in_rule__PageExtension__Group__7__Impl8027);
            	    rule__PageExtension__OwnedSectionsAssignment_7();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop27;
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4097:1: rule__PageExtension__Group__8 : rule__PageExtension__Group__8__Impl ;
    public final void rule__PageExtension__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4101:1: ( rule__PageExtension__Group__8__Impl )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4102:2: rule__PageExtension__Group__8__Impl
            {
            pushFollow(FOLLOW_rule__PageExtension__Group__8__Impl_in_rule__PageExtension__Group__88058);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4108:1: rule__PageExtension__Group__8__Impl : ( '}' ) ;
    public final void rule__PageExtension__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4112:1: ( ( '}' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4113:1: ( '}' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4113:1: ( '}' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4114:1: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPageExtensionAccess().getRightCurlyBracketKeyword_8()); 
            }
            match(input,16,FOLLOW_16_in_rule__PageExtension__Group__8__Impl8086); if (state.failed) return ;
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4145:1: rule__SectionExtension__Group__0 : rule__SectionExtension__Group__0__Impl rule__SectionExtension__Group__1 ;
    public final void rule__SectionExtension__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4149:1: ( rule__SectionExtension__Group__0__Impl rule__SectionExtension__Group__1 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4150:2: rule__SectionExtension__Group__0__Impl rule__SectionExtension__Group__1
            {
            pushFollow(FOLLOW_rule__SectionExtension__Group__0__Impl_in_rule__SectionExtension__Group__08135);
            rule__SectionExtension__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__SectionExtension__Group__1_in_rule__SectionExtension__Group__08138);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4157:1: rule__SectionExtension__Group__0__Impl : ( () ) ;
    public final void rule__SectionExtension__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4161:1: ( ( () ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4162:1: ( () )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4162:1: ( () )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4163:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSectionExtensionAccess().getSectionExtensionAction_0()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4164:1: ()
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4166:1: 
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4176:1: rule__SectionExtension__Group__1 : rule__SectionExtension__Group__1__Impl rule__SectionExtension__Group__2 ;
    public final void rule__SectionExtension__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4180:1: ( rule__SectionExtension__Group__1__Impl rule__SectionExtension__Group__2 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4181:2: rule__SectionExtension__Group__1__Impl rule__SectionExtension__Group__2
            {
            pushFollow(FOLLOW_rule__SectionExtension__Group__1__Impl_in_rule__SectionExtension__Group__18196);
            rule__SectionExtension__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__SectionExtension__Group__2_in_rule__SectionExtension__Group__18199);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4188:1: rule__SectionExtension__Group__1__Impl : ( 'section' ) ;
    public final void rule__SectionExtension__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4192:1: ( ( 'section' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4193:1: ( 'section' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4193:1: ( 'section' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4194:1: 'section'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSectionExtensionAccess().getSectionKeyword_1()); 
            }
            match(input,35,FOLLOW_35_in_rule__SectionExtension__Group__1__Impl8227); if (state.failed) return ;
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4207:1: rule__SectionExtension__Group__2 : rule__SectionExtension__Group__2__Impl rule__SectionExtension__Group__3 ;
    public final void rule__SectionExtension__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4211:1: ( rule__SectionExtension__Group__2__Impl rule__SectionExtension__Group__3 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4212:2: rule__SectionExtension__Group__2__Impl rule__SectionExtension__Group__3
            {
            pushFollow(FOLLOW_rule__SectionExtension__Group__2__Impl_in_rule__SectionExtension__Group__28258);
            rule__SectionExtension__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__SectionExtension__Group__3_in_rule__SectionExtension__Group__28261);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4219:1: rule__SectionExtension__Group__2__Impl : ( 'extensions' ) ;
    public final void rule__SectionExtension__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4223:1: ( ( 'extensions' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4224:1: ( 'extensions' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4224:1: ( 'extensions' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4225:1: 'extensions'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSectionExtensionAccess().getExtensionsKeyword_2()); 
            }
            match(input,40,FOLLOW_40_in_rule__SectionExtension__Group__2__Impl8289); if (state.failed) return ;
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4238:1: rule__SectionExtension__Group__3 : rule__SectionExtension__Group__3__Impl rule__SectionExtension__Group__4 ;
    public final void rule__SectionExtension__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4242:1: ( rule__SectionExtension__Group__3__Impl rule__SectionExtension__Group__4 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4243:2: rule__SectionExtension__Group__3__Impl rule__SectionExtension__Group__4
            {
            pushFollow(FOLLOW_rule__SectionExtension__Group__3__Impl_in_rule__SectionExtension__Group__38320);
            rule__SectionExtension__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__SectionExtension__Group__4_in_rule__SectionExtension__Group__38323);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4250:1: rule__SectionExtension__Group__3__Impl : ( '{' ) ;
    public final void rule__SectionExtension__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4254:1: ( ( '{' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4255:1: ( '{' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4255:1: ( '{' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4256:1: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSectionExtensionAccess().getLeftCurlyBracketKeyword_3()); 
            }
            match(input,15,FOLLOW_15_in_rule__SectionExtension__Group__3__Impl8351); if (state.failed) return ;
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4269:1: rule__SectionExtension__Group__4 : rule__SectionExtension__Group__4__Impl rule__SectionExtension__Group__5 ;
    public final void rule__SectionExtension__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4273:1: ( rule__SectionExtension__Group__4__Impl rule__SectionExtension__Group__5 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4274:2: rule__SectionExtension__Group__4__Impl rule__SectionExtension__Group__5
            {
            pushFollow(FOLLOW_rule__SectionExtension__Group__4__Impl_in_rule__SectionExtension__Group__48382);
            rule__SectionExtension__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__SectionExtension__Group__5_in_rule__SectionExtension__Group__48385);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4281:1: rule__SectionExtension__Group__4__Impl : ( 'extended' ) ;
    public final void rule__SectionExtension__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4285:1: ( ( 'extended' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4286:1: ( 'extended' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4286:1: ( 'extended' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4287:1: 'extended'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSectionExtensionAccess().getExtendedKeyword_4()); 
            }
            match(input,41,FOLLOW_41_in_rule__SectionExtension__Group__4__Impl8413); if (state.failed) return ;
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4300:1: rule__SectionExtension__Group__5 : rule__SectionExtension__Group__5__Impl rule__SectionExtension__Group__6 ;
    public final void rule__SectionExtension__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4304:1: ( rule__SectionExtension__Group__5__Impl rule__SectionExtension__Group__6 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4305:2: rule__SectionExtension__Group__5__Impl rule__SectionExtension__Group__6
            {
            pushFollow(FOLLOW_rule__SectionExtension__Group__5__Impl_in_rule__SectionExtension__Group__58444);
            rule__SectionExtension__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__SectionExtension__Group__6_in_rule__SectionExtension__Group__58447);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4312:1: rule__SectionExtension__Group__5__Impl : ( 'section' ) ;
    public final void rule__SectionExtension__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4316:1: ( ( 'section' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4317:1: ( 'section' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4317:1: ( 'section' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4318:1: 'section'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSectionExtensionAccess().getSectionKeyword_5()); 
            }
            match(input,35,FOLLOW_35_in_rule__SectionExtension__Group__5__Impl8475); if (state.failed) return ;
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4331:1: rule__SectionExtension__Group__6 : rule__SectionExtension__Group__6__Impl rule__SectionExtension__Group__7 ;
    public final void rule__SectionExtension__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4335:1: ( rule__SectionExtension__Group__6__Impl rule__SectionExtension__Group__7 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4336:2: rule__SectionExtension__Group__6__Impl rule__SectionExtension__Group__7
            {
            pushFollow(FOLLOW_rule__SectionExtension__Group__6__Impl_in_rule__SectionExtension__Group__68506);
            rule__SectionExtension__Group__6__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__SectionExtension__Group__7_in_rule__SectionExtension__Group__68509);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4343:1: rule__SectionExtension__Group__6__Impl : ( ( rule__SectionExtension__ExtendedSectionIDAssignment_6 ) ) ;
    public final void rule__SectionExtension__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4347:1: ( ( ( rule__SectionExtension__ExtendedSectionIDAssignment_6 ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4348:1: ( ( rule__SectionExtension__ExtendedSectionIDAssignment_6 ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4348:1: ( ( rule__SectionExtension__ExtendedSectionIDAssignment_6 ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4349:1: ( rule__SectionExtension__ExtendedSectionIDAssignment_6 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSectionExtensionAccess().getExtendedSectionIDAssignment_6()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4350:1: ( rule__SectionExtension__ExtendedSectionIDAssignment_6 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4350:2: rule__SectionExtension__ExtendedSectionIDAssignment_6
            {
            pushFollow(FOLLOW_rule__SectionExtension__ExtendedSectionIDAssignment_6_in_rule__SectionExtension__Group__6__Impl8536);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4360:1: rule__SectionExtension__Group__7 : rule__SectionExtension__Group__7__Impl rule__SectionExtension__Group__8 ;
    public final void rule__SectionExtension__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4364:1: ( rule__SectionExtension__Group__7__Impl rule__SectionExtension__Group__8 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4365:2: rule__SectionExtension__Group__7__Impl rule__SectionExtension__Group__8
            {
            pushFollow(FOLLOW_rule__SectionExtension__Group__7__Impl_in_rule__SectionExtension__Group__78566);
            rule__SectionExtension__Group__7__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__SectionExtension__Group__8_in_rule__SectionExtension__Group__78569);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4372:1: rule__SectionExtension__Group__7__Impl : ( ( rule__SectionExtension__OwnedActivitiesAssignment_7 )* ) ;
    public final void rule__SectionExtension__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4376:1: ( ( ( rule__SectionExtension__OwnedActivitiesAssignment_7 )* ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4377:1: ( ( rule__SectionExtension__OwnedActivitiesAssignment_7 )* )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4377:1: ( ( rule__SectionExtension__OwnedActivitiesAssignment_7 )* )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4378:1: ( rule__SectionExtension__OwnedActivitiesAssignment_7 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSectionExtensionAccess().getOwnedActivitiesAssignment_7()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4379:1: ( rule__SectionExtension__OwnedActivitiesAssignment_7 )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==13) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4379:2: rule__SectionExtension__OwnedActivitiesAssignment_7
            	    {
            	    pushFollow(FOLLOW_rule__SectionExtension__OwnedActivitiesAssignment_7_in_rule__SectionExtension__Group__7__Impl8596);
            	    rule__SectionExtension__OwnedActivitiesAssignment_7();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop28;
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4389:1: rule__SectionExtension__Group__8 : rule__SectionExtension__Group__8__Impl ;
    public final void rule__SectionExtension__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4393:1: ( rule__SectionExtension__Group__8__Impl )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4394:2: rule__SectionExtension__Group__8__Impl
            {
            pushFollow(FOLLOW_rule__SectionExtension__Group__8__Impl_in_rule__SectionExtension__Group__88627);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4400:1: rule__SectionExtension__Group__8__Impl : ( '}' ) ;
    public final void rule__SectionExtension__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4404:1: ( ( '}' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4405:1: ( '}' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4405:1: ( '}' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4406:1: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSectionExtensionAccess().getRightCurlyBracketKeyword_8()); 
            }
            match(input,16,FOLLOW_16_in_rule__SectionExtension__Group__8__Impl8655); if (state.failed) return ;
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4437:1: rule__Overview__Group__0 : rule__Overview__Group__0__Impl rule__Overview__Group__1 ;
    public final void rule__Overview__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4441:1: ( rule__Overview__Group__0__Impl rule__Overview__Group__1 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4442:2: rule__Overview__Group__0__Impl rule__Overview__Group__1
            {
            pushFollow(FOLLOW_rule__Overview__Group__0__Impl_in_rule__Overview__Group__08704);
            rule__Overview__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Overview__Group__1_in_rule__Overview__Group__08707);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4449:1: rule__Overview__Group__0__Impl : ( () ) ;
    public final void rule__Overview__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4453:1: ( ( () ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4454:1: ( () )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4454:1: ( () )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4455:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOverviewAccess().getOverviewAction_0()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4456:1: ()
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4458:1: 
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4468:1: rule__Overview__Group__1 : rule__Overview__Group__1__Impl rule__Overview__Group__2 ;
    public final void rule__Overview__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4472:1: ( rule__Overview__Group__1__Impl rule__Overview__Group__2 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4473:2: rule__Overview__Group__1__Impl rule__Overview__Group__2
            {
            pushFollow(FOLLOW_rule__Overview__Group__1__Impl_in_rule__Overview__Group__18765);
            rule__Overview__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Overview__Group__2_in_rule__Overview__Group__18768);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4480:1: rule__Overview__Group__1__Impl : ( 'Overview' ) ;
    public final void rule__Overview__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4484:1: ( ( 'Overview' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4485:1: ( 'Overview' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4485:1: ( 'Overview' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4486:1: 'Overview'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOverviewAccess().getOverviewKeyword_1()); 
            }
            match(input,42,FOLLOW_42_in_rule__Overview__Group__1__Impl8796); if (state.failed) return ;
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4499:1: rule__Overview__Group__2 : rule__Overview__Group__2__Impl rule__Overview__Group__3 ;
    public final void rule__Overview__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4503:1: ( rule__Overview__Group__2__Impl rule__Overview__Group__3 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4504:2: rule__Overview__Group__2__Impl rule__Overview__Group__3
            {
            pushFollow(FOLLOW_rule__Overview__Group__2__Impl_in_rule__Overview__Group__28827);
            rule__Overview__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Overview__Group__3_in_rule__Overview__Group__28830);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4511:1: rule__Overview__Group__2__Impl : ( '{' ) ;
    public final void rule__Overview__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4515:1: ( ( '{' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4516:1: ( '{' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4516:1: ( '{' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4517:1: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOverviewAccess().getLeftCurlyBracketKeyword_2()); 
            }
            match(input,15,FOLLOW_15_in_rule__Overview__Group__2__Impl8858); if (state.failed) return ;
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4530:1: rule__Overview__Group__3 : rule__Overview__Group__3__Impl rule__Overview__Group__4 ;
    public final void rule__Overview__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4534:1: ( rule__Overview__Group__3__Impl rule__Overview__Group__4 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4535:2: rule__Overview__Group__3__Impl rule__Overview__Group__4
            {
            pushFollow(FOLLOW_rule__Overview__Group__3__Impl_in_rule__Overview__Group__38889);
            rule__Overview__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Overview__Group__4_in_rule__Overview__Group__38892);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4542:1: rule__Overview__Group__3__Impl : ( ( rule__Overview__Group_3__0 )? ) ;
    public final void rule__Overview__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4546:1: ( ( ( rule__Overview__Group_3__0 )? ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4547:1: ( ( rule__Overview__Group_3__0 )? )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4547:1: ( ( rule__Overview__Group_3__0 )? )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4548:1: ( rule__Overview__Group_3__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOverviewAccess().getGroup_3()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4549:1: ( rule__Overview__Group_3__0 )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==21) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4549:2: rule__Overview__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__Overview__Group_3__0_in_rule__Overview__Group__3__Impl8919);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4559:1: rule__Overview__Group__4 : rule__Overview__Group__4__Impl rule__Overview__Group__5 ;
    public final void rule__Overview__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4563:1: ( rule__Overview__Group__4__Impl rule__Overview__Group__5 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4564:2: rule__Overview__Group__4__Impl rule__Overview__Group__5
            {
            pushFollow(FOLLOW_rule__Overview__Group__4__Impl_in_rule__Overview__Group__48950);
            rule__Overview__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Overview__Group__5_in_rule__Overview__Group__48953);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4571:1: rule__Overview__Group__4__Impl : ( ( rule__Overview__Group_4__0 )? ) ;
    public final void rule__Overview__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4575:1: ( ( ( rule__Overview__Group_4__0 )? ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4576:1: ( ( rule__Overview__Group_4__0 )? )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4576:1: ( ( rule__Overview__Group_4__0 )? )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4577:1: ( rule__Overview__Group_4__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOverviewAccess().getGroup_4()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4578:1: ( rule__Overview__Group_4__0 )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==26) ) {
                int LA30_1 = input.LA(2);

                if ( (LA30_1==27) ) {
                    alt30=1;
                }
            }
            switch (alt30) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4578:2: rule__Overview__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__Overview__Group_4__0_in_rule__Overview__Group__4__Impl8980);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4588:1: rule__Overview__Group__5 : rule__Overview__Group__5__Impl rule__Overview__Group__6 ;
    public final void rule__Overview__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4592:1: ( rule__Overview__Group__5__Impl rule__Overview__Group__6 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4593:2: rule__Overview__Group__5__Impl rule__Overview__Group__6
            {
            pushFollow(FOLLOW_rule__Overview__Group__5__Impl_in_rule__Overview__Group__59011);
            rule__Overview__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Overview__Group__6_in_rule__Overview__Group__59014);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4600:1: rule__Overview__Group__5__Impl : ( ( rule__Overview__Group_5__0 )? ) ;
    public final void rule__Overview__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4604:1: ( ( ( rule__Overview__Group_5__0 )? ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4605:1: ( ( rule__Overview__Group_5__0 )? )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4605:1: ( ( rule__Overview__Group_5__0 )? )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4606:1: ( rule__Overview__Group_5__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOverviewAccess().getGroup_5()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4607:1: ( rule__Overview__Group_5__0 )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==26) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4607:2: rule__Overview__Group_5__0
                    {
                    pushFollow(FOLLOW_rule__Overview__Group_5__0_in_rule__Overview__Group__5__Impl9041);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4617:1: rule__Overview__Group__6 : rule__Overview__Group__6__Impl ;
    public final void rule__Overview__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4621:1: ( rule__Overview__Group__6__Impl )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4622:2: rule__Overview__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__Overview__Group__6__Impl_in_rule__Overview__Group__69072);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4628:1: rule__Overview__Group__6__Impl : ( '}' ) ;
    public final void rule__Overview__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4632:1: ( ( '}' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4633:1: ( '}' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4633:1: ( '}' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4634:1: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOverviewAccess().getRightCurlyBracketKeyword_6()); 
            }
            match(input,16,FOLLOW_16_in_rule__Overview__Group__6__Impl9100); if (state.failed) return ;
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4661:1: rule__Overview__Group_3__0 : rule__Overview__Group_3__0__Impl rule__Overview__Group_3__1 ;
    public final void rule__Overview__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4665:1: ( rule__Overview__Group_3__0__Impl rule__Overview__Group_3__1 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4666:2: rule__Overview__Group_3__0__Impl rule__Overview__Group_3__1
            {
            pushFollow(FOLLOW_rule__Overview__Group_3__0__Impl_in_rule__Overview__Group_3__09145);
            rule__Overview__Group_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Overview__Group_3__1_in_rule__Overview__Group_3__09148);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4673:1: rule__Overview__Group_3__0__Impl : ( 'description' ) ;
    public final void rule__Overview__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4677:1: ( ( 'description' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4678:1: ( 'description' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4678:1: ( 'description' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4679:1: 'description'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOverviewAccess().getDescriptionKeyword_3_0()); 
            }
            match(input,21,FOLLOW_21_in_rule__Overview__Group_3__0__Impl9176); if (state.failed) return ;
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4692:1: rule__Overview__Group_3__1 : rule__Overview__Group_3__1__Impl ;
    public final void rule__Overview__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4696:1: ( rule__Overview__Group_3__1__Impl )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4697:2: rule__Overview__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__Overview__Group_3__1__Impl_in_rule__Overview__Group_3__19207);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4703:1: rule__Overview__Group_3__1__Impl : ( ( rule__Overview__DescriptionAssignment_3_1 ) ) ;
    public final void rule__Overview__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4707:1: ( ( ( rule__Overview__DescriptionAssignment_3_1 ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4708:1: ( ( rule__Overview__DescriptionAssignment_3_1 ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4708:1: ( ( rule__Overview__DescriptionAssignment_3_1 ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4709:1: ( rule__Overview__DescriptionAssignment_3_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOverviewAccess().getDescriptionAssignment_3_1()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4710:1: ( rule__Overview__DescriptionAssignment_3_1 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4710:2: rule__Overview__DescriptionAssignment_3_1
            {
            pushFollow(FOLLOW_rule__Overview__DescriptionAssignment_3_1_in_rule__Overview__Group_3__1__Impl9234);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4724:1: rule__Overview__Group_4__0 : rule__Overview__Group_4__0__Impl rule__Overview__Group_4__1 ;
    public final void rule__Overview__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4728:1: ( rule__Overview__Group_4__0__Impl rule__Overview__Group_4__1 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4729:2: rule__Overview__Group_4__0__Impl rule__Overview__Group_4__1
            {
            pushFollow(FOLLOW_rule__Overview__Group_4__0__Impl_in_rule__Overview__Group_4__09268);
            rule__Overview__Group_4__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Overview__Group_4__1_in_rule__Overview__Group_4__09271);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4736:1: rule__Overview__Group_4__0__Impl : ( 'image' ) ;
    public final void rule__Overview__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4740:1: ( ( 'image' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4741:1: ( 'image' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4741:1: ( 'image' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4742:1: 'image'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOverviewAccess().getImageKeyword_4_0()); 
            }
            match(input,26,FOLLOW_26_in_rule__Overview__Group_4__0__Impl9299); if (state.failed) return ;
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4755:1: rule__Overview__Group_4__1 : rule__Overview__Group_4__1__Impl rule__Overview__Group_4__2 ;
    public final void rule__Overview__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4759:1: ( rule__Overview__Group_4__1__Impl rule__Overview__Group_4__2 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4760:2: rule__Overview__Group_4__1__Impl rule__Overview__Group_4__2
            {
            pushFollow(FOLLOW_rule__Overview__Group_4__1__Impl_in_rule__Overview__Group_4__19330);
            rule__Overview__Group_4__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Overview__Group_4__2_in_rule__Overview__Group_4__19333);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4767:1: rule__Overview__Group_4__1__Impl : ( 'on' ) ;
    public final void rule__Overview__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4771:1: ( ( 'on' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4772:1: ( 'on' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4772:1: ( 'on' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4773:1: 'on'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOverviewAccess().getOnKeyword_4_1()); 
            }
            match(input,27,FOLLOW_27_in_rule__Overview__Group_4__1__Impl9361); if (state.failed) return ;
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4786:1: rule__Overview__Group_4__2 : rule__Overview__Group_4__2__Impl rule__Overview__Group_4__3 ;
    public final void rule__Overview__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4790:1: ( rule__Overview__Group_4__2__Impl rule__Overview__Group_4__3 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4791:2: rule__Overview__Group_4__2__Impl rule__Overview__Group_4__3
            {
            pushFollow(FOLLOW_rule__Overview__Group_4__2__Impl_in_rule__Overview__Group_4__29392);
            rule__Overview__Group_4__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Overview__Group_4__3_in_rule__Overview__Group_4__29395);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4798:1: rule__Overview__Group_4__2__Impl : ( ':' ) ;
    public final void rule__Overview__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4802:1: ( ( ':' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4803:1: ( ':' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4803:1: ( ':' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4804:1: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOverviewAccess().getColonKeyword_4_2()); 
            }
            match(input,28,FOLLOW_28_in_rule__Overview__Group_4__2__Impl9423); if (state.failed) return ;
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4817:1: rule__Overview__Group_4__3 : rule__Overview__Group_4__3__Impl ;
    public final void rule__Overview__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4821:1: ( rule__Overview__Group_4__3__Impl )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4822:2: rule__Overview__Group_4__3__Impl
            {
            pushFollow(FOLLOW_rule__Overview__Group_4__3__Impl_in_rule__Overview__Group_4__39454);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4828:1: rule__Overview__Group_4__3__Impl : ( ( rule__Overview__ImagePathOnAssignment_4_3 ) ) ;
    public final void rule__Overview__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4832:1: ( ( ( rule__Overview__ImagePathOnAssignment_4_3 ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4833:1: ( ( rule__Overview__ImagePathOnAssignment_4_3 ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4833:1: ( ( rule__Overview__ImagePathOnAssignment_4_3 ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4834:1: ( rule__Overview__ImagePathOnAssignment_4_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOverviewAccess().getImagePathOnAssignment_4_3()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4835:1: ( rule__Overview__ImagePathOnAssignment_4_3 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4835:2: rule__Overview__ImagePathOnAssignment_4_3
            {
            pushFollow(FOLLOW_rule__Overview__ImagePathOnAssignment_4_3_in_rule__Overview__Group_4__3__Impl9481);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4853:1: rule__Overview__Group_5__0 : rule__Overview__Group_5__0__Impl rule__Overview__Group_5__1 ;
    public final void rule__Overview__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4857:1: ( rule__Overview__Group_5__0__Impl rule__Overview__Group_5__1 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4858:2: rule__Overview__Group_5__0__Impl rule__Overview__Group_5__1
            {
            pushFollow(FOLLOW_rule__Overview__Group_5__0__Impl_in_rule__Overview__Group_5__09519);
            rule__Overview__Group_5__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Overview__Group_5__1_in_rule__Overview__Group_5__09522);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4865:1: rule__Overview__Group_5__0__Impl : ( 'image' ) ;
    public final void rule__Overview__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4869:1: ( ( 'image' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4870:1: ( 'image' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4870:1: ( 'image' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4871:1: 'image'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOverviewAccess().getImageKeyword_5_0()); 
            }
            match(input,26,FOLLOW_26_in_rule__Overview__Group_5__0__Impl9550); if (state.failed) return ;
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4884:1: rule__Overview__Group_5__1 : rule__Overview__Group_5__1__Impl rule__Overview__Group_5__2 ;
    public final void rule__Overview__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4888:1: ( rule__Overview__Group_5__1__Impl rule__Overview__Group_5__2 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4889:2: rule__Overview__Group_5__1__Impl rule__Overview__Group_5__2
            {
            pushFollow(FOLLOW_rule__Overview__Group_5__1__Impl_in_rule__Overview__Group_5__19581);
            rule__Overview__Group_5__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Overview__Group_5__2_in_rule__Overview__Group_5__19584);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4896:1: rule__Overview__Group_5__1__Impl : ( 'off' ) ;
    public final void rule__Overview__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4900:1: ( ( 'off' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4901:1: ( 'off' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4901:1: ( 'off' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4902:1: 'off'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOverviewAccess().getOffKeyword_5_1()); 
            }
            match(input,29,FOLLOW_29_in_rule__Overview__Group_5__1__Impl9612); if (state.failed) return ;
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4915:1: rule__Overview__Group_5__2 : rule__Overview__Group_5__2__Impl rule__Overview__Group_5__3 ;
    public final void rule__Overview__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4919:1: ( rule__Overview__Group_5__2__Impl rule__Overview__Group_5__3 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4920:2: rule__Overview__Group_5__2__Impl rule__Overview__Group_5__3
            {
            pushFollow(FOLLOW_rule__Overview__Group_5__2__Impl_in_rule__Overview__Group_5__29643);
            rule__Overview__Group_5__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Overview__Group_5__3_in_rule__Overview__Group_5__29646);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4927:1: rule__Overview__Group_5__2__Impl : ( ':' ) ;
    public final void rule__Overview__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4931:1: ( ( ':' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4932:1: ( ':' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4932:1: ( ':' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4933:1: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOverviewAccess().getColonKeyword_5_2()); 
            }
            match(input,28,FOLLOW_28_in_rule__Overview__Group_5__2__Impl9674); if (state.failed) return ;
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4946:1: rule__Overview__Group_5__3 : rule__Overview__Group_5__3__Impl ;
    public final void rule__Overview__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4950:1: ( rule__Overview__Group_5__3__Impl )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4951:2: rule__Overview__Group_5__3__Impl
            {
            pushFollow(FOLLOW_rule__Overview__Group_5__3__Impl_in_rule__Overview__Group_5__39705);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4957:1: rule__Overview__Group_5__3__Impl : ( ( rule__Overview__ImagePathOffAssignment_5_3 ) ) ;
    public final void rule__Overview__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4961:1: ( ( ( rule__Overview__ImagePathOffAssignment_5_3 ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4962:1: ( ( rule__Overview__ImagePathOffAssignment_5_3 ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4962:1: ( ( rule__Overview__ImagePathOffAssignment_5_3 ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4963:1: ( rule__Overview__ImagePathOffAssignment_5_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOverviewAccess().getImagePathOffAssignment_5_3()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4964:1: ( rule__Overview__ImagePathOffAssignment_5_3 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4964:2: rule__Overview__ImagePathOffAssignment_5_3
            {
            pushFollow(FOLLOW_rule__Overview__ImagePathOffAssignment_5_3_in_rule__Overview__Group_5__3__Impl9732);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4982:1: rule__FQN__Group__0 : rule__FQN__Group__0__Impl rule__FQN__Group__1 ;
    public final void rule__FQN__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4986:1: ( rule__FQN__Group__0__Impl rule__FQN__Group__1 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4987:2: rule__FQN__Group__0__Impl rule__FQN__Group__1
            {
            pushFollow(FOLLOW_rule__FQN__Group__0__Impl_in_rule__FQN__Group__09770);
            rule__FQN__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__FQN__Group__1_in_rule__FQN__Group__09773);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4994:1: rule__FQN__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__FQN__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4998:1: ( ( RULE_ID ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4999:1: ( RULE_ID )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:4999:1: ( RULE_ID )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5000:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFQNAccess().getIDTerminalRuleCall_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__FQN__Group__0__Impl9800); if (state.failed) return ;
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5011:1: rule__FQN__Group__1 : rule__FQN__Group__1__Impl ;
    public final void rule__FQN__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5015:1: ( rule__FQN__Group__1__Impl )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5016:2: rule__FQN__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__FQN__Group__1__Impl_in_rule__FQN__Group__19829);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5022:1: rule__FQN__Group__1__Impl : ( ( rule__FQN__Group_1__0 )* ) ;
    public final void rule__FQN__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5026:1: ( ( ( rule__FQN__Group_1__0 )* ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5027:1: ( ( rule__FQN__Group_1__0 )* )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5027:1: ( ( rule__FQN__Group_1__0 )* )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5028:1: ( rule__FQN__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFQNAccess().getGroup_1()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5029:1: ( rule__FQN__Group_1__0 )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==43) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5029:2: rule__FQN__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__FQN__Group_1__0_in_rule__FQN__Group__1__Impl9856);
            	    rule__FQN__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop32;
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5043:1: rule__FQN__Group_1__0 : rule__FQN__Group_1__0__Impl rule__FQN__Group_1__1 ;
    public final void rule__FQN__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5047:1: ( rule__FQN__Group_1__0__Impl rule__FQN__Group_1__1 )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5048:2: rule__FQN__Group_1__0__Impl rule__FQN__Group_1__1
            {
            pushFollow(FOLLOW_rule__FQN__Group_1__0__Impl_in_rule__FQN__Group_1__09891);
            rule__FQN__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__FQN__Group_1__1_in_rule__FQN__Group_1__09894);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5055:1: rule__FQN__Group_1__0__Impl : ( '.' ) ;
    public final void rule__FQN__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5059:1: ( ( '.' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5060:1: ( '.' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5060:1: ( '.' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5061:1: '.'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFQNAccess().getFullStopKeyword_1_0()); 
            }
            match(input,43,FOLLOW_43_in_rule__FQN__Group_1__0__Impl9922); if (state.failed) return ;
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5074:1: rule__FQN__Group_1__1 : rule__FQN__Group_1__1__Impl ;
    public final void rule__FQN__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5078:1: ( rule__FQN__Group_1__1__Impl )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5079:2: rule__FQN__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__FQN__Group_1__1__Impl_in_rule__FQN__Group_1__19953);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5085:1: rule__FQN__Group_1__1__Impl : ( ( RULE_ID ) ) ;
    public final void rule__FQN__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5089:1: ( ( ( RULE_ID ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5090:1: ( ( RULE_ID ) )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5090:1: ( ( RULE_ID ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5091:1: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFQNAccess().getIDTerminalRuleCall_1_1()); 
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5092:1: ( RULE_ID )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5092:3: RULE_ID
            {
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__FQN__Group_1__1__Impl9981); if (state.failed) return ;

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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5107:1: rule__ViewpointActivityExplorer__NameAssignment_3 : ( ruleFQN ) ;
    public final void rule__ViewpointActivityExplorer__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5111:1: ( ( ruleFQN ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5112:1: ( ruleFQN )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5112:1: ( ruleFQN )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5113:1: ruleFQN
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getViewpointActivityExplorerAccess().getNameFQNParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_ruleFQN_in_rule__ViewpointActivityExplorer__NameAssignment_310020);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5122:1: rule__ViewpointActivityExplorer__OwnedPagesAssignment_5_2 : ( rulePage ) ;
    public final void rule__ViewpointActivityExplorer__OwnedPagesAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5126:1: ( ( rulePage ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5127:1: ( rulePage )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5127:1: ( rulePage )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5128:1: rulePage
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getViewpointActivityExplorerAccess().getOwnedPagesPageParserRuleCall_5_2_0()); 
            }
            pushFollow(FOLLOW_rulePage_in_rule__ViewpointActivityExplorer__OwnedPagesAssignment_5_210051);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5137:1: rule__ViewpointActivityExplorer__OwnedPagesAssignment_6 : ( rulePageExtension ) ;
    public final void rule__ViewpointActivityExplorer__OwnedPagesAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5141:1: ( ( rulePageExtension ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5142:1: ( rulePageExtension )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5142:1: ( rulePageExtension )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5143:1: rulePageExtension
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getViewpointActivityExplorerAccess().getOwnedPagesPageExtensionParserRuleCall_6_0()); 
            }
            pushFollow(FOLLOW_rulePageExtension_in_rule__ViewpointActivityExplorer__OwnedPagesAssignment_610082);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5152:1: rule__ViewpointActivityExplorer__OwnedSectionExtensionsAssignment_7 : ( ruleSectionExtension ) ;
    public final void rule__ViewpointActivityExplorer__OwnedSectionExtensionsAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5156:1: ( ( ruleSectionExtension ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5157:1: ( ruleSectionExtension )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5157:1: ( ruleSectionExtension )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5158:1: ruleSectionExtension
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getViewpointActivityExplorerAccess().getOwnedSectionExtensionsSectionExtensionParserRuleCall_7_0()); 
            }
            pushFollow(FOLLOW_ruleSectionExtension_in_rule__ViewpointActivityExplorer__OwnedSectionExtensionsAssignment_710113);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5167:1: rule__Page__NameAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Page__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5171:1: ( ( RULE_STRING ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5172:1: ( RULE_STRING )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5172:1: ( RULE_STRING )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5173:1: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPageAccess().getNameSTRINGTerminalRuleCall_2_0()); 
            }
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Page__NameAssignment_210144); if (state.failed) return ;
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5182:1: rule__Page__DescriptionAssignment_4_1 : ( RULE_STRING ) ;
    public final void rule__Page__DescriptionAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5186:1: ( ( RULE_STRING ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5187:1: ( RULE_STRING )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5187:1: ( RULE_STRING )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5188:1: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPageAccess().getDescriptionSTRINGTerminalRuleCall_4_1_0()); 
            }
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Page__DescriptionAssignment_4_110175); if (state.failed) return ;
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5197:1: rule__Page__FileExtensionsAssignment_5_2 : ( RULE_STRING ) ;
    public final void rule__Page__FileExtensionsAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5201:1: ( ( RULE_STRING ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5202:1: ( RULE_STRING )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5202:1: ( RULE_STRING )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5203:1: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPageAccess().getFileExtensionsSTRINGTerminalRuleCall_5_2_0()); 
            }
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Page__FileExtensionsAssignment_5_210206); if (state.failed) return ;
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5212:1: rule__Page__ActivityExplorerItemIDAssignment_6_1 : ( ruleFQN ) ;
    public final void rule__Page__ActivityExplorerItemIDAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5216:1: ( ( ruleFQN ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5217:1: ( ruleFQN )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5217:1: ( ruleFQN )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5218:1: ruleFQN
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPageAccess().getActivityExplorerItemIDFQNParserRuleCall_6_1_0()); 
            }
            pushFollow(FOLLOW_ruleFQN_in_rule__Page__ActivityExplorerItemIDAssignment_6_110237);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5227:1: rule__Page__IndexAssignment_8 : ( ruleEInt ) ;
    public final void rule__Page__IndexAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5231:1: ( ( ruleEInt ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5232:1: ( ruleEInt )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5232:1: ( ruleEInt )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5233:1: ruleEInt
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPageAccess().getIndexEIntParserRuleCall_8_0()); 
            }
            pushFollow(FOLLOW_ruleEInt_in_rule__Page__IndexAssignment_810268);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5242:1: rule__Page__OwnedOverviewAssignment_9 : ( ruleOverview ) ;
    public final void rule__Page__OwnedOverviewAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5246:1: ( ( ruleOverview ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5247:1: ( ruleOverview )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5247:1: ( ruleOverview )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5248:1: ruleOverview
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPageAccess().getOwnedOverviewOverviewParserRuleCall_9_0()); 
            }
            pushFollow(FOLLOW_ruleOverview_in_rule__Page__OwnedOverviewAssignment_910299);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5257:1: rule__Page__ImagePathOnAssignment_10_2_3 : ( RULE_STRING ) ;
    public final void rule__Page__ImagePathOnAssignment_10_2_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5261:1: ( ( RULE_STRING ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5262:1: ( RULE_STRING )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5262:1: ( RULE_STRING )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5263:1: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPageAccess().getImagePathOnSTRINGTerminalRuleCall_10_2_3_0()); 
            }
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Page__ImagePathOnAssignment_10_2_310330); if (state.failed) return ;
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5272:1: rule__Page__ImagePathOffAssignment_10_3_3 : ( RULE_STRING ) ;
    public final void rule__Page__ImagePathOffAssignment_10_3_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5276:1: ( ( RULE_STRING ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5277:1: ( RULE_STRING )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5277:1: ( RULE_STRING )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5278:1: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPageAccess().getImagePathOffSTRINGTerminalRuleCall_10_3_3_0()); 
            }
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Page__ImagePathOffAssignment_10_3_310361); if (state.failed) return ;
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5287:1: rule__Page__TabNameAssignment_11_2 : ( RULE_STRING ) ;
    public final void rule__Page__TabNameAssignment_11_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5291:1: ( ( RULE_STRING ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5292:1: ( RULE_STRING )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5292:1: ( RULE_STRING )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5293:1: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPageAccess().getTabNameSTRINGTerminalRuleCall_11_2_0()); 
            }
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Page__TabNameAssignment_11_210392); if (state.failed) return ;
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5302:1: rule__Page__HasPredicateAssignment_12_2 : ( ruleEBoolean ) ;
    public final void rule__Page__HasPredicateAssignment_12_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5306:1: ( ( ruleEBoolean ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5307:1: ( ruleEBoolean )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5307:1: ( ruleEBoolean )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5308:1: ruleEBoolean
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPageAccess().getHasPredicateEBooleanParserRuleCall_12_2_0()); 
            }
            pushFollow(FOLLOW_ruleEBoolean_in_rule__Page__HasPredicateAssignment_12_210423);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5317:1: rule__Page__ShowViewerAssignment_13_3 : ( ruleEBoolean ) ;
    public final void rule__Page__ShowViewerAssignment_13_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5321:1: ( ( ruleEBoolean ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5322:1: ( ruleEBoolean )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5322:1: ( ruleEBoolean )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5323:1: ruleEBoolean
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPageAccess().getShowViewerEBooleanParserRuleCall_13_3_0()); 
            }
            pushFollow(FOLLOW_ruleEBoolean_in_rule__Page__ShowViewerAssignment_13_310454);
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


    // $ANTLR start "rule__Page__OwnedSectionsAssignment_16"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5332:1: rule__Page__OwnedSectionsAssignment_16 : ( ruleSection ) ;
    public final void rule__Page__OwnedSectionsAssignment_16() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5336:1: ( ( ruleSection ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5337:1: ( ruleSection )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5337:1: ( ruleSection )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5338:1: ruleSection
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPageAccess().getOwnedSectionsSectionParserRuleCall_16_0()); 
            }
            pushFollow(FOLLOW_ruleSection_in_rule__Page__OwnedSectionsAssignment_1610485);
            ruleSection();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPageAccess().getOwnedSectionsSectionParserRuleCall_16_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__OwnedSectionsAssignment_16"


    // $ANTLR start "rule__Section__NameAssignment_2"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5347:1: rule__Section__NameAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Section__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5351:1: ( ( RULE_STRING ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5352:1: ( RULE_STRING )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5352:1: ( RULE_STRING )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5353:1: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSectionAccess().getNameSTRINGTerminalRuleCall_2_0()); 
            }
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Section__NameAssignment_210516); if (state.failed) return ;
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5362:1: rule__Section__DescriptionAssignment_4_1 : ( RULE_STRING ) ;
    public final void rule__Section__DescriptionAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5366:1: ( ( RULE_STRING ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5367:1: ( RULE_STRING )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5367:1: ( RULE_STRING )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5368:1: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSectionAccess().getDescriptionSTRINGTerminalRuleCall_4_1_0()); 
            }
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Section__DescriptionAssignment_4_110547); if (state.failed) return ;
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5377:1: rule__Section__ActivityExplorerItemIDAssignment_5_1 : ( ruleFQN ) ;
    public final void rule__Section__ActivityExplorerItemIDAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5381:1: ( ( ruleFQN ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5382:1: ( ruleFQN )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5382:1: ( ruleFQN )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5383:1: ruleFQN
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSectionAccess().getActivityExplorerItemIDFQNParserRuleCall_5_1_0()); 
            }
            pushFollow(FOLLOW_ruleFQN_in_rule__Section__ActivityExplorerItemIDAssignment_5_110578);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5392:1: rule__Section__IndexAssignment_7 : ( ruleEInt ) ;
    public final void rule__Section__IndexAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5396:1: ( ( ruleEInt ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5397:1: ( ruleEInt )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5397:1: ( ruleEInt )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5398:1: ruleEInt
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSectionAccess().getIndexEIntParserRuleCall_7_0()); 
            }
            pushFollow(FOLLOW_ruleEInt_in_rule__Section__IndexAssignment_710609);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5407:1: rule__Section__FilteringAssignment_8_2 : ( ruleEBoolean ) ;
    public final void rule__Section__FilteringAssignment_8_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5411:1: ( ( ruleEBoolean ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5412:1: ( ruleEBoolean )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5412:1: ( ruleEBoolean )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5413:1: ruleEBoolean
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSectionAccess().getFilteringEBooleanParserRuleCall_8_2_0()); 
            }
            pushFollow(FOLLOW_ruleEBoolean_in_rule__Section__FilteringAssignment_8_210640);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5422:1: rule__Section__ExpandedAssignment_9_2 : ( ruleEBoolean ) ;
    public final void rule__Section__ExpandedAssignment_9_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5426:1: ( ( ruleEBoolean ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5427:1: ( ruleEBoolean )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5427:1: ( ruleEBoolean )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5428:1: ruleEBoolean
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSectionAccess().getExpandedEBooleanParserRuleCall_9_2_0()); 
            }
            pushFollow(FOLLOW_ruleEBoolean_in_rule__Section__ExpandedAssignment_9_210671);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5437:1: rule__Section__OwnedActivitiesAssignment_10_2 : ( ruleActivity ) ;
    public final void rule__Section__OwnedActivitiesAssignment_10_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5441:1: ( ( ruleActivity ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5442:1: ( ruleActivity )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5442:1: ( ruleActivity )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5443:1: ruleActivity
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSectionAccess().getOwnedActivitiesActivityParserRuleCall_10_2_0()); 
            }
            pushFollow(FOLLOW_ruleActivity_in_rule__Section__OwnedActivitiesAssignment_10_210702);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5452:1: rule__Activity__NameAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Activity__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5456:1: ( ( RULE_STRING ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5457:1: ( RULE_STRING )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5457:1: ( RULE_STRING )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5458:1: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getActivityAccess().getNameSTRINGTerminalRuleCall_2_0()); 
            }
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Activity__NameAssignment_210733); if (state.failed) return ;
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5467:1: rule__Activity__DescriptionAssignment_4_1 : ( RULE_STRING ) ;
    public final void rule__Activity__DescriptionAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5471:1: ( ( RULE_STRING ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5472:1: ( RULE_STRING )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5472:1: ( RULE_STRING )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5473:1: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getActivityAccess().getDescriptionSTRINGTerminalRuleCall_4_1_0()); 
            }
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Activity__DescriptionAssignment_4_110764); if (state.failed) return ;
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5482:1: rule__Activity__ActivityExplorerItemIDAssignment_5_1 : ( ruleFQN ) ;
    public final void rule__Activity__ActivityExplorerItemIDAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5486:1: ( ( ruleFQN ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5487:1: ( ruleFQN )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5487:1: ( ruleFQN )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5488:1: ruleFQN
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getActivityAccess().getActivityExplorerItemIDFQNParserRuleCall_5_1_0()); 
            }
            pushFollow(FOLLOW_ruleFQN_in_rule__Activity__ActivityExplorerItemIDAssignment_5_110795);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5497:1: rule__Activity__IndexAssignment_7 : ( ruleEInt ) ;
    public final void rule__Activity__IndexAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5501:1: ( ( ruleEInt ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5502:1: ( ruleEInt )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5502:1: ( ruleEInt )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5503:1: ruleEInt
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getActivityAccess().getIndexEIntParserRuleCall_7_0()); 
            }
            pushFollow(FOLLOW_ruleEInt_in_rule__Activity__IndexAssignment_710826);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5512:1: rule__Activity__HasPredicateAssignment_8_2 : ( ruleEBoolean ) ;
    public final void rule__Activity__HasPredicateAssignment_8_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5516:1: ( ( ruleEBoolean ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5517:1: ( ruleEBoolean )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5517:1: ( ruleEBoolean )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5518:1: ruleEBoolean
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getActivityAccess().getHasPredicateEBooleanParserRuleCall_8_2_0()); 
            }
            pushFollow(FOLLOW_ruleEBoolean_in_rule__Activity__HasPredicateAssignment_8_210857);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5527:1: rule__Activity__ImagePathOffAssignment_9_2 : ( RULE_STRING ) ;
    public final void rule__Activity__ImagePathOffAssignment_9_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5531:1: ( ( RULE_STRING ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5532:1: ( RULE_STRING )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5532:1: ( RULE_STRING )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5533:1: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getActivityAccess().getImagePathOffSTRINGTerminalRuleCall_9_2_0()); 
            }
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Activity__ImagePathOffAssignment_9_210888); if (state.failed) return ;
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5542:1: rule__PageExtension__ExtendedPageIDAssignment_6 : ( ruleFQN ) ;
    public final void rule__PageExtension__ExtendedPageIDAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5546:1: ( ( ruleFQN ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5547:1: ( ruleFQN )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5547:1: ( ruleFQN )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5548:1: ruleFQN
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPageExtensionAccess().getExtendedPageIDFQNParserRuleCall_6_0()); 
            }
            pushFollow(FOLLOW_ruleFQN_in_rule__PageExtension__ExtendedPageIDAssignment_610919);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5557:1: rule__PageExtension__OwnedSectionsAssignment_7 : ( ruleSection ) ;
    public final void rule__PageExtension__OwnedSectionsAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5561:1: ( ( ruleSection ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5562:1: ( ruleSection )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5562:1: ( ruleSection )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5563:1: ruleSection
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPageExtensionAccess().getOwnedSectionsSectionParserRuleCall_7_0()); 
            }
            pushFollow(FOLLOW_ruleSection_in_rule__PageExtension__OwnedSectionsAssignment_710950);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5572:1: rule__SectionExtension__ExtendedSectionIDAssignment_6 : ( ruleFQN ) ;
    public final void rule__SectionExtension__ExtendedSectionIDAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5576:1: ( ( ruleFQN ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5577:1: ( ruleFQN )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5577:1: ( ruleFQN )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5578:1: ruleFQN
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSectionExtensionAccess().getExtendedSectionIDFQNParserRuleCall_6_0()); 
            }
            pushFollow(FOLLOW_ruleFQN_in_rule__SectionExtension__ExtendedSectionIDAssignment_610981);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5587:1: rule__SectionExtension__OwnedActivitiesAssignment_7 : ( ruleActivity ) ;
    public final void rule__SectionExtension__OwnedActivitiesAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5591:1: ( ( ruleActivity ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5592:1: ( ruleActivity )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5592:1: ( ruleActivity )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5593:1: ruleActivity
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSectionExtensionAccess().getOwnedActivitiesActivityParserRuleCall_7_0()); 
            }
            pushFollow(FOLLOW_ruleActivity_in_rule__SectionExtension__OwnedActivitiesAssignment_711012);
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5602:1: rule__Overview__DescriptionAssignment_3_1 : ( RULE_STRING ) ;
    public final void rule__Overview__DescriptionAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5606:1: ( ( RULE_STRING ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5607:1: ( RULE_STRING )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5607:1: ( RULE_STRING )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5608:1: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOverviewAccess().getDescriptionSTRINGTerminalRuleCall_3_1_0()); 
            }
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Overview__DescriptionAssignment_3_111043); if (state.failed) return ;
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5617:1: rule__Overview__ImagePathOnAssignment_4_3 : ( RULE_STRING ) ;
    public final void rule__Overview__ImagePathOnAssignment_4_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5621:1: ( ( RULE_STRING ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5622:1: ( RULE_STRING )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5622:1: ( RULE_STRING )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5623:1: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOverviewAccess().getImagePathOnSTRINGTerminalRuleCall_4_3_0()); 
            }
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Overview__ImagePathOnAssignment_4_311074); if (state.failed) return ;
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
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5632:1: rule__Overview__ImagePathOffAssignment_5_3 : ( RULE_STRING ) ;
    public final void rule__Overview__ImagePathOffAssignment_5_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5636:1: ( ( RULE_STRING ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5637:1: ( RULE_STRING )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5637:1: ( RULE_STRING )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.activityexplorer.ui/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/ui/contentassist/antlr/internal/InternalActivityexplorer.g:5638:1: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOverviewAccess().getImagePathOffSTRINGTerminalRuleCall_5_3_0()); 
            }
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Overview__ImagePathOffAssignment_5_311105); if (state.failed) return ;
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
    public static final BitSet FOLLOW_rule__Page__Group__3__Impl_in_rule__Page__Group__31736 = new BitSet(new long[]{0x0000000001680000L});
    public static final BitSet FOLLOW_rule__Page__Group__4_in_rule__Page__Group__31739 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Page__Group__3__Impl1767 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Page__Group__4__Impl_in_rule__Page__Group__41798 = new BitSet(new long[]{0x0000000001680000L});
    public static final BitSet FOLLOW_rule__Page__Group__5_in_rule__Page__Group__41801 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Page__Group_4__0_in_rule__Page__Group__4__Impl1828 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Page__Group__5__Impl_in_rule__Page__Group__51859 = new BitSet(new long[]{0x0000000001680000L});
    public static final BitSet FOLLOW_rule__Page__Group__6_in_rule__Page__Group__51862 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Page__Group_5__0_in_rule__Page__Group__5__Impl1889 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Page__Group__6__Impl_in_rule__Page__Group__61920 = new BitSet(new long[]{0x0000000001680000L});
    public static final BitSet FOLLOW_rule__Page__Group__7_in_rule__Page__Group__61923 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Page__Group_6__0_in_rule__Page__Group__6__Impl1950 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Page__Group__7__Impl_in_rule__Page__Group__71981 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Page__Group__8_in_rule__Page__Group__71984 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Page__Group__7__Impl2012 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Page__Group__8__Impl_in_rule__Page__Group__82043 = new BitSet(new long[]{0x0000040342100000L});
    public static final BitSet FOLLOW_rule__Page__Group__9_in_rule__Page__Group__82046 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Page__IndexAssignment_8_in_rule__Page__Group__8__Impl2073 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Page__Group__9__Impl_in_rule__Page__Group__92103 = new BitSet(new long[]{0x0000040342100000L});
    public static final BitSet FOLLOW_rule__Page__Group__10_in_rule__Page__Group__92106 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Page__OwnedOverviewAssignment_9_in_rule__Page__Group__9__Impl2133 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Page__Group__10__Impl_in_rule__Page__Group__102164 = new BitSet(new long[]{0x0000040342100000L});
    public static final BitSet FOLLOW_rule__Page__Group__11_in_rule__Page__Group__102167 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Page__Group_10__0_in_rule__Page__Group__10__Impl2194 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Page__Group__11__Impl_in_rule__Page__Group__112225 = new BitSet(new long[]{0x0000040342100000L});
    public static final BitSet FOLLOW_rule__Page__Group__12_in_rule__Page__Group__112228 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Page__Group_11__0_in_rule__Page__Group__11__Impl2255 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Page__Group__12__Impl_in_rule__Page__Group__122286 = new BitSet(new long[]{0x0000040342100000L});
    public static final BitSet FOLLOW_rule__Page__Group__13_in_rule__Page__Group__122289 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Page__Group_12__0_in_rule__Page__Group__12__Impl2316 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Page__Group__13__Impl_in_rule__Page__Group__132347 = new BitSet(new long[]{0x0000040342100000L});
    public static final BitSet FOLLOW_rule__Page__Group__14_in_rule__Page__Group__132350 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Page__Group_13__0_in_rule__Page__Group__13__Impl2377 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Page__Group__14__Impl_in_rule__Page__Group__142408 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__Page__Group__15_in_rule__Page__Group__142411 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Page__Group__14__Impl2439 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Page__Group__15__Impl_in_rule__Page__Group__152470 = new BitSet(new long[]{0x0000000800010000L});
    public static final BitSet FOLLOW_rule__Page__Group__16_in_rule__Page__Group__152473 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Page__Group__15__Impl2501 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Page__Group__16__Impl_in_rule__Page__Group__162532 = new BitSet(new long[]{0x0000000800010000L});
    public static final BitSet FOLLOW_rule__Page__Group__17_in_rule__Page__Group__162535 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Page__OwnedSectionsAssignment_16_in_rule__Page__Group__16__Impl2562 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_rule__Page__Group__17__Impl_in_rule__Page__Group__172593 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__Page__Group__18_in_rule__Page__Group__172596 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Page__Group__17__Impl2624 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Page__Group__18__Impl_in_rule__Page__Group__182655 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Page__Group__18__Impl2683 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Page__Group_4__0__Impl_in_rule__Page__Group_4__02752 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Page__Group_4__1_in_rule__Page__Group_4__02755 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Page__Group_4__0__Impl2783 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Page__Group_4__1__Impl_in_rule__Page__Group_4__12814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Page__DescriptionAssignment_4_1_in_rule__Page__Group_4__1__Impl2841 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Page__Group_5__0__Impl_in_rule__Page__Group_5__02875 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__Page__Group_5__1_in_rule__Page__Group_5__02878 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Page__Group_5__0__Impl2906 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Page__Group_5__1__Impl_in_rule__Page__Group_5__12937 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Page__Group_5__2_in_rule__Page__Group_5__12940 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Page__Group_5__1__Impl2968 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Page__Group_5__2__Impl_in_rule__Page__Group_5__22999 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Page__FileExtensionsAssignment_5_2_in_rule__Page__Group_5__2__Impl3026 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Page__Group_6__0__Impl_in_rule__Page__Group_6__03062 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Page__Group_6__1_in_rule__Page__Group_6__03065 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Page__Group_6__0__Impl3093 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Page__Group_6__1__Impl_in_rule__Page__Group_6__13124 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Page__ActivityExplorerItemIDAssignment_6_1_in_rule__Page__Group_6__1__Impl3151 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Page__Group_10__0__Impl_in_rule__Page__Group_10__03185 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__Page__Group_10__1_in_rule__Page__Group_10__03188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Page__Group_10__0__Impl3216 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Page__Group_10__1__Impl_in_rule__Page__Group_10__13247 = new BitSet(new long[]{0x0000000004010000L});
    public static final BitSet FOLLOW_rule__Page__Group_10__2_in_rule__Page__Group_10__13250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Page__Group_10__1__Impl3278 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Page__Group_10__2__Impl_in_rule__Page__Group_10__23309 = new BitSet(new long[]{0x0000000004010000L});
    public static final BitSet FOLLOW_rule__Page__Group_10__3_in_rule__Page__Group_10__23312 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Page__Group_10_2__0_in_rule__Page__Group_10__2__Impl3339 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Page__Group_10__3__Impl_in_rule__Page__Group_10__33370 = new BitSet(new long[]{0x0000000004010000L});
    public static final BitSet FOLLOW_rule__Page__Group_10__4_in_rule__Page__Group_10__33373 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Page__Group_10_3__0_in_rule__Page__Group_10__3__Impl3400 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Page__Group_10__4__Impl_in_rule__Page__Group_10__43431 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Page__Group_10__4__Impl3459 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Page__Group_10_2__0__Impl_in_rule__Page__Group_10_2__03500 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__Page__Group_10_2__1_in_rule__Page__Group_10_2__03503 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Page__Group_10_2__0__Impl3531 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Page__Group_10_2__1__Impl_in_rule__Page__Group_10_2__13562 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__Page__Group_10_2__2_in_rule__Page__Group_10_2__13565 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__Page__Group_10_2__1__Impl3593 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Page__Group_10_2__2__Impl_in_rule__Page__Group_10_2__23624 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Page__Group_10_2__3_in_rule__Page__Group_10_2__23627 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__Page__Group_10_2__2__Impl3655 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Page__Group_10_2__3__Impl_in_rule__Page__Group_10_2__33686 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Page__ImagePathOnAssignment_10_2_3_in_rule__Page__Group_10_2__3__Impl3713 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Page__Group_10_3__0__Impl_in_rule__Page__Group_10_3__03751 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rule__Page__Group_10_3__1_in_rule__Page__Group_10_3__03754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Page__Group_10_3__0__Impl3782 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Page__Group_10_3__1__Impl_in_rule__Page__Group_10_3__13813 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__Page__Group_10_3__2_in_rule__Page__Group_10_3__13816 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__Page__Group_10_3__1__Impl3844 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Page__Group_10_3__2__Impl_in_rule__Page__Group_10_3__23875 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Page__Group_10_3__3_in_rule__Page__Group_10_3__23878 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__Page__Group_10_3__2__Impl3906 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Page__Group_10_3__3__Impl_in_rule__Page__Group_10_3__33937 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Page__ImagePathOffAssignment_10_3_3_in_rule__Page__Group_10_3__3__Impl3964 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Page__Group_11__0__Impl_in_rule__Page__Group_11__04002 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__Page__Group_11__1_in_rule__Page__Group_11__04005 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__Page__Group_11__0__Impl4033 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Page__Group_11__1__Impl_in_rule__Page__Group_11__14064 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Page__Group_11__2_in_rule__Page__Group_11__14067 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__Page__Group_11__1__Impl4095 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Page__Group_11__2__Impl_in_rule__Page__Group_11__24126 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Page__TabNameAssignment_11_2_in_rule__Page__Group_11__2__Impl4153 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Page__Group_12__0__Impl_in_rule__Page__Group_12__04189 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__Page__Group_12__1_in_rule__Page__Group_12__04192 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__Page__Group_12__0__Impl4220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Page__Group_12__1__Impl_in_rule__Page__Group_12__14251 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_rule__Page__Group_12__2_in_rule__Page__Group_12__14254 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__Page__Group_12__1__Impl4282 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Page__Group_12__2__Impl_in_rule__Page__Group_12__24313 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Page__HasPredicateAssignment_12_2_in_rule__Page__Group_12__2__Impl4340 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Page__Group_13__0__Impl_in_rule__Page__Group_13__04376 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_rule__Page__Group_13__1_in_rule__Page__Group_13__04379 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__Page__Group_13__0__Impl4407 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Page__Group_13__1__Impl_in_rule__Page__Group_13__14438 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__Page__Group_13__2_in_rule__Page__Group_13__14441 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__Page__Group_13__1__Impl4469 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Page__Group_13__2__Impl_in_rule__Page__Group_13__24500 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_rule__Page__Group_13__3_in_rule__Page__Group_13__24503 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__Page__Group_13__2__Impl4531 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Page__Group_13__3__Impl_in_rule__Page__Group_13__34562 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Page__ShowViewerAssignment_13_3_in_rule__Page__Group_13__3__Impl4589 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Section__Group__0__Impl_in_rule__Section__Group__04627 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_rule__Section__Group__1_in_rule__Section__Group__04630 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Section__Group__1__Impl_in_rule__Section__Group__14688 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Section__Group__2_in_rule__Section__Group__14691 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__Section__Group__1__Impl4719 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Section__Group__2__Impl_in_rule__Section__Group__24750 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__Section__Group__3_in_rule__Section__Group__24753 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Section__NameAssignment_2_in_rule__Section__Group__2__Impl4780 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Section__Group__3__Impl_in_rule__Section__Group__34810 = new BitSet(new long[]{0x0000000001280000L});
    public static final BitSet FOLLOW_rule__Section__Group__4_in_rule__Section__Group__34813 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Section__Group__3__Impl4841 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Section__Group__4__Impl_in_rule__Section__Group__44872 = new BitSet(new long[]{0x0000000001280000L});
    public static final BitSet FOLLOW_rule__Section__Group__5_in_rule__Section__Group__44875 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Section__Group_4__0_in_rule__Section__Group__4__Impl4902 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Section__Group__5__Impl_in_rule__Section__Group__54933 = new BitSet(new long[]{0x0000000001280000L});
    public static final BitSet FOLLOW_rule__Section__Group__6_in_rule__Section__Group__54936 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Section__Group_5__0_in_rule__Section__Group__5__Impl4963 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Section__Group__6__Impl_in_rule__Section__Group__64994 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Section__Group__7_in_rule__Section__Group__64997 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Section__Group__6__Impl5025 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Section__Group__7__Impl_in_rule__Section__Group__75056 = new BitSet(new long[]{0x0000007000010000L});
    public static final BitSet FOLLOW_rule__Section__Group__8_in_rule__Section__Group__75059 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Section__IndexAssignment_7_in_rule__Section__Group__7__Impl5086 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Section__Group__8__Impl_in_rule__Section__Group__85116 = new BitSet(new long[]{0x0000007000010000L});
    public static final BitSet FOLLOW_rule__Section__Group__9_in_rule__Section__Group__85119 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Section__Group_8__0_in_rule__Section__Group__8__Impl5146 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Section__Group__9__Impl_in_rule__Section__Group__95177 = new BitSet(new long[]{0x0000007000010000L});
    public static final BitSet FOLLOW_rule__Section__Group__10_in_rule__Section__Group__95180 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Section__Group_9__0_in_rule__Section__Group__9__Impl5207 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Section__Group__10__Impl_in_rule__Section__Group__105238 = new BitSet(new long[]{0x0000007000010000L});
    public static final BitSet FOLLOW_rule__Section__Group__11_in_rule__Section__Group__105241 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Section__Group_10__0_in_rule__Section__Group__10__Impl5268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Section__Group__11__Impl_in_rule__Section__Group__115299 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Section__Group__11__Impl5327 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Section__Group_4__0__Impl_in_rule__Section__Group_4__05382 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Section__Group_4__1_in_rule__Section__Group_4__05385 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Section__Group_4__0__Impl5413 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Section__Group_4__1__Impl_in_rule__Section__Group_4__15444 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Section__DescriptionAssignment_4_1_in_rule__Section__Group_4__1__Impl5471 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Section__Group_5__0__Impl_in_rule__Section__Group_5__05505 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Section__Group_5__1_in_rule__Section__Group_5__05508 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Section__Group_5__0__Impl5536 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Section__Group_5__1__Impl_in_rule__Section__Group_5__15567 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Section__ActivityExplorerItemIDAssignment_5_1_in_rule__Section__Group_5__1__Impl5594 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Section__Group_8__0__Impl_in_rule__Section__Group_8__05628 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__Section__Group_8__1_in_rule__Section__Group_8__05631 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__Section__Group_8__0__Impl5659 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Section__Group_8__1__Impl_in_rule__Section__Group_8__15690 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_rule__Section__Group_8__2_in_rule__Section__Group_8__15693 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__Section__Group_8__1__Impl5721 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Section__Group_8__2__Impl_in_rule__Section__Group_8__25752 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Section__FilteringAssignment_8_2_in_rule__Section__Group_8__2__Impl5779 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Section__Group_9__0__Impl_in_rule__Section__Group_9__05815 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__Section__Group_9__1_in_rule__Section__Group_9__05818 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__Section__Group_9__0__Impl5846 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Section__Group_9__1__Impl_in_rule__Section__Group_9__15877 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_rule__Section__Group_9__2_in_rule__Section__Group_9__15880 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__Section__Group_9__1__Impl5908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Section__Group_9__2__Impl_in_rule__Section__Group_9__25939 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Section__ExpandedAssignment_9_2_in_rule__Section__Group_9__2__Impl5966 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Section__Group_10__0__Impl_in_rule__Section__Group_10__06002 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__Section__Group_10__1_in_rule__Section__Group_10__06005 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__Section__Group_10__0__Impl6033 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Section__Group_10__1__Impl_in_rule__Section__Group_10__16064 = new BitSet(new long[]{0x0000000000012000L});
    public static final BitSet FOLLOW_rule__Section__Group_10__2_in_rule__Section__Group_10__16067 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Section__Group_10__1__Impl6095 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Section__Group_10__2__Impl_in_rule__Section__Group_10__26126 = new BitSet(new long[]{0x0000000000012000L});
    public static final BitSet FOLLOW_rule__Section__Group_10__3_in_rule__Section__Group_10__26129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Section__OwnedActivitiesAssignment_10_2_in_rule__Section__Group_10__2__Impl6156 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_rule__Section__Group_10__3__Impl_in_rule__Section__Group_10__36187 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Section__Group_10__3__Impl6215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group__0__Impl_in_rule__Activity__Group__06254 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__Activity__Group__1_in_rule__Activity__Group__06257 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group__1__Impl_in_rule__Activity__Group__16315 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Activity__Group__2_in_rule__Activity__Group__16318 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Activity__Group__1__Impl6346 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group__2__Impl_in_rule__Activity__Group__26377 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__Activity__Group__3_in_rule__Activity__Group__26380 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__NameAssignment_2_in_rule__Activity__Group__2__Impl6407 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group__3__Impl_in_rule__Activity__Group__36437 = new BitSet(new long[]{0x0000000001280000L});
    public static final BitSet FOLLOW_rule__Activity__Group__4_in_rule__Activity__Group__36440 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Activity__Group__3__Impl6468 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group__4__Impl_in_rule__Activity__Group__46499 = new BitSet(new long[]{0x0000000001280000L});
    public static final BitSet FOLLOW_rule__Activity__Group__5_in_rule__Activity__Group__46502 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group_4__0_in_rule__Activity__Group__4__Impl6529 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group__5__Impl_in_rule__Activity__Group__56560 = new BitSet(new long[]{0x0000000001280000L});
    public static final BitSet FOLLOW_rule__Activity__Group__6_in_rule__Activity__Group__56563 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group_5__0_in_rule__Activity__Group__5__Impl6590 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group__6__Impl_in_rule__Activity__Group__66621 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Activity__Group__7_in_rule__Activity__Group__66624 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Activity__Group__6__Impl6652 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group__7__Impl_in_rule__Activity__Group__76683 = new BitSet(new long[]{0x0000008100010000L});
    public static final BitSet FOLLOW_rule__Activity__Group__8_in_rule__Activity__Group__76686 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__IndexAssignment_7_in_rule__Activity__Group__7__Impl6713 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group__8__Impl_in_rule__Activity__Group__86743 = new BitSet(new long[]{0x0000008100010000L});
    public static final BitSet FOLLOW_rule__Activity__Group__9_in_rule__Activity__Group__86746 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group_8__0_in_rule__Activity__Group__8__Impl6773 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group__9__Impl_in_rule__Activity__Group__96804 = new BitSet(new long[]{0x0000008100010000L});
    public static final BitSet FOLLOW_rule__Activity__Group__10_in_rule__Activity__Group__96807 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group_9__0_in_rule__Activity__Group__9__Impl6834 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group__10__Impl_in_rule__Activity__Group__106865 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Activity__Group__10__Impl6893 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group_4__0__Impl_in_rule__Activity__Group_4__06946 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Activity__Group_4__1_in_rule__Activity__Group_4__06949 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Activity__Group_4__0__Impl6977 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group_4__1__Impl_in_rule__Activity__Group_4__17008 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__DescriptionAssignment_4_1_in_rule__Activity__Group_4__1__Impl7035 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group_5__0__Impl_in_rule__Activity__Group_5__07069 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Activity__Group_5__1_in_rule__Activity__Group_5__07072 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Activity__Group_5__0__Impl7100 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group_5__1__Impl_in_rule__Activity__Group_5__17131 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__ActivityExplorerItemIDAssignment_5_1_in_rule__Activity__Group_5__1__Impl7158 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group_8__0__Impl_in_rule__Activity__Group_8__07192 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__Activity__Group_8__1_in_rule__Activity__Group_8__07195 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__Activity__Group_8__0__Impl7223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group_8__1__Impl_in_rule__Activity__Group_8__17254 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_rule__Activity__Group_8__2_in_rule__Activity__Group_8__17257 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__Activity__Group_8__1__Impl7285 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group_8__2__Impl_in_rule__Activity__Group_8__27316 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__HasPredicateAssignment_8_2_in_rule__Activity__Group_8__2__Impl7343 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group_9__0__Impl_in_rule__Activity__Group_9__07379 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__Activity__Group_9__1_in_rule__Activity__Group_9__07382 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__Activity__Group_9__0__Impl7410 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group_9__1__Impl_in_rule__Activity__Group_9__17441 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Activity__Group_9__2_in_rule__Activity__Group_9__17444 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__Activity__Group_9__1__Impl7472 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group_9__2__Impl_in_rule__Activity__Group_9__27503 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__ImagePathOffAssignment_9_2_in_rule__Activity__Group_9__2__Impl7530 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PageExtension__Group__0__Impl_in_rule__PageExtension__Group__07566 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__PageExtension__Group__1_in_rule__PageExtension__Group__07569 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PageExtension__Group__1__Impl_in_rule__PageExtension__Group__17627 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_rule__PageExtension__Group__2_in_rule__PageExtension__Group__17630 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__PageExtension__Group__1__Impl7658 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PageExtension__Group__2__Impl_in_rule__PageExtension__Group__27689 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__PageExtension__Group__3_in_rule__PageExtension__Group__27692 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__PageExtension__Group__2__Impl7720 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PageExtension__Group__3__Impl_in_rule__PageExtension__Group__37751 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_rule__PageExtension__Group__4_in_rule__PageExtension__Group__37754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__PageExtension__Group__3__Impl7782 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PageExtension__Group__4__Impl_in_rule__PageExtension__Group__47813 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__PageExtension__Group__5_in_rule__PageExtension__Group__47816 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__PageExtension__Group__4__Impl7844 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PageExtension__Group__5__Impl_in_rule__PageExtension__Group__57875 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__PageExtension__Group__6_in_rule__PageExtension__Group__57878 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__PageExtension__Group__5__Impl7906 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PageExtension__Group__6__Impl_in_rule__PageExtension__Group__67937 = new BitSet(new long[]{0x0000000800010000L});
    public static final BitSet FOLLOW_rule__PageExtension__Group__7_in_rule__PageExtension__Group__67940 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PageExtension__ExtendedPageIDAssignment_6_in_rule__PageExtension__Group__6__Impl7967 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PageExtension__Group__7__Impl_in_rule__PageExtension__Group__77997 = new BitSet(new long[]{0x0000000800010000L});
    public static final BitSet FOLLOW_rule__PageExtension__Group__8_in_rule__PageExtension__Group__78000 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PageExtension__OwnedSectionsAssignment_7_in_rule__PageExtension__Group__7__Impl8027 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_rule__PageExtension__Group__8__Impl_in_rule__PageExtension__Group__88058 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__PageExtension__Group__8__Impl8086 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SectionExtension__Group__0__Impl_in_rule__SectionExtension__Group__08135 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_rule__SectionExtension__Group__1_in_rule__SectionExtension__Group__08138 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SectionExtension__Group__1__Impl_in_rule__SectionExtension__Group__18196 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_rule__SectionExtension__Group__2_in_rule__SectionExtension__Group__18199 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__SectionExtension__Group__1__Impl8227 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SectionExtension__Group__2__Impl_in_rule__SectionExtension__Group__28258 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__SectionExtension__Group__3_in_rule__SectionExtension__Group__28261 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__SectionExtension__Group__2__Impl8289 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SectionExtension__Group__3__Impl_in_rule__SectionExtension__Group__38320 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_rule__SectionExtension__Group__4_in_rule__SectionExtension__Group__38323 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__SectionExtension__Group__3__Impl8351 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SectionExtension__Group__4__Impl_in_rule__SectionExtension__Group__48382 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_rule__SectionExtension__Group__5_in_rule__SectionExtension__Group__48385 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__SectionExtension__Group__4__Impl8413 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SectionExtension__Group__5__Impl_in_rule__SectionExtension__Group__58444 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__SectionExtension__Group__6_in_rule__SectionExtension__Group__58447 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__SectionExtension__Group__5__Impl8475 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SectionExtension__Group__6__Impl_in_rule__SectionExtension__Group__68506 = new BitSet(new long[]{0x0000000000012000L});
    public static final BitSet FOLLOW_rule__SectionExtension__Group__7_in_rule__SectionExtension__Group__68509 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SectionExtension__ExtendedSectionIDAssignment_6_in_rule__SectionExtension__Group__6__Impl8536 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SectionExtension__Group__7__Impl_in_rule__SectionExtension__Group__78566 = new BitSet(new long[]{0x0000000000012000L});
    public static final BitSet FOLLOW_rule__SectionExtension__Group__8_in_rule__SectionExtension__Group__78569 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SectionExtension__OwnedActivitiesAssignment_7_in_rule__SectionExtension__Group__7__Impl8596 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_rule__SectionExtension__Group__8__Impl_in_rule__SectionExtension__Group__88627 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__SectionExtension__Group__8__Impl8655 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Overview__Group__0__Impl_in_rule__Overview__Group__08704 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_rule__Overview__Group__1_in_rule__Overview__Group__08707 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Overview__Group__1__Impl_in_rule__Overview__Group__18765 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__Overview__Group__2_in_rule__Overview__Group__18768 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_rule__Overview__Group__1__Impl8796 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Overview__Group__2__Impl_in_rule__Overview__Group__28827 = new BitSet(new long[]{0x0000000004210000L});
    public static final BitSet FOLLOW_rule__Overview__Group__3_in_rule__Overview__Group__28830 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Overview__Group__2__Impl8858 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Overview__Group__3__Impl_in_rule__Overview__Group__38889 = new BitSet(new long[]{0x0000000004210000L});
    public static final BitSet FOLLOW_rule__Overview__Group__4_in_rule__Overview__Group__38892 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Overview__Group_3__0_in_rule__Overview__Group__3__Impl8919 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Overview__Group__4__Impl_in_rule__Overview__Group__48950 = new BitSet(new long[]{0x0000000004210000L});
    public static final BitSet FOLLOW_rule__Overview__Group__5_in_rule__Overview__Group__48953 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Overview__Group_4__0_in_rule__Overview__Group__4__Impl8980 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Overview__Group__5__Impl_in_rule__Overview__Group__59011 = new BitSet(new long[]{0x0000000004210000L});
    public static final BitSet FOLLOW_rule__Overview__Group__6_in_rule__Overview__Group__59014 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Overview__Group_5__0_in_rule__Overview__Group__5__Impl9041 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Overview__Group__6__Impl_in_rule__Overview__Group__69072 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Overview__Group__6__Impl9100 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Overview__Group_3__0__Impl_in_rule__Overview__Group_3__09145 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Overview__Group_3__1_in_rule__Overview__Group_3__09148 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Overview__Group_3__0__Impl9176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Overview__Group_3__1__Impl_in_rule__Overview__Group_3__19207 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Overview__DescriptionAssignment_3_1_in_rule__Overview__Group_3__1__Impl9234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Overview__Group_4__0__Impl_in_rule__Overview__Group_4__09268 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__Overview__Group_4__1_in_rule__Overview__Group_4__09271 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Overview__Group_4__0__Impl9299 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Overview__Group_4__1__Impl_in_rule__Overview__Group_4__19330 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__Overview__Group_4__2_in_rule__Overview__Group_4__19333 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__Overview__Group_4__1__Impl9361 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Overview__Group_4__2__Impl_in_rule__Overview__Group_4__29392 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Overview__Group_4__3_in_rule__Overview__Group_4__29395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__Overview__Group_4__2__Impl9423 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Overview__Group_4__3__Impl_in_rule__Overview__Group_4__39454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Overview__ImagePathOnAssignment_4_3_in_rule__Overview__Group_4__3__Impl9481 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Overview__Group_5__0__Impl_in_rule__Overview__Group_5__09519 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rule__Overview__Group_5__1_in_rule__Overview__Group_5__09522 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Overview__Group_5__0__Impl9550 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Overview__Group_5__1__Impl_in_rule__Overview__Group_5__19581 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__Overview__Group_5__2_in_rule__Overview__Group_5__19584 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__Overview__Group_5__1__Impl9612 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Overview__Group_5__2__Impl_in_rule__Overview__Group_5__29643 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Overview__Group_5__3_in_rule__Overview__Group_5__29646 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__Overview__Group_5__2__Impl9674 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Overview__Group_5__3__Impl_in_rule__Overview__Group_5__39705 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Overview__ImagePathOffAssignment_5_3_in_rule__Overview__Group_5__3__Impl9732 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FQN__Group__0__Impl_in_rule__FQN__Group__09770 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_rule__FQN__Group__1_in_rule__FQN__Group__09773 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__FQN__Group__0__Impl9800 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FQN__Group__1__Impl_in_rule__FQN__Group__19829 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FQN__Group_1__0_in_rule__FQN__Group__1__Impl9856 = new BitSet(new long[]{0x0000080000000002L});
    public static final BitSet FOLLOW_rule__FQN__Group_1__0__Impl_in_rule__FQN__Group_1__09891 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__FQN__Group_1__1_in_rule__FQN__Group_1__09894 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_rule__FQN__Group_1__0__Impl9922 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FQN__Group_1__1__Impl_in_rule__FQN__Group_1__19953 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__FQN__Group_1__1__Impl9981 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFQN_in_rule__ViewpointActivityExplorer__NameAssignment_310020 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePage_in_rule__ViewpointActivityExplorer__OwnedPagesAssignment_5_210051 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePageExtension_in_rule__ViewpointActivityExplorer__OwnedPagesAssignment_610082 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSectionExtension_in_rule__ViewpointActivityExplorer__OwnedSectionExtensionsAssignment_710113 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Page__NameAssignment_210144 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Page__DescriptionAssignment_4_110175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Page__FileExtensionsAssignment_5_210206 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFQN_in_rule__Page__ActivityExplorerItemIDAssignment_6_110237 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEInt_in_rule__Page__IndexAssignment_810268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOverview_in_rule__Page__OwnedOverviewAssignment_910299 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Page__ImagePathOnAssignment_10_2_310330 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Page__ImagePathOffAssignment_10_3_310361 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Page__TabNameAssignment_11_210392 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEBoolean_in_rule__Page__HasPredicateAssignment_12_210423 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEBoolean_in_rule__Page__ShowViewerAssignment_13_310454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSection_in_rule__Page__OwnedSectionsAssignment_1610485 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Section__NameAssignment_210516 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Section__DescriptionAssignment_4_110547 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFQN_in_rule__Section__ActivityExplorerItemIDAssignment_5_110578 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEInt_in_rule__Section__IndexAssignment_710609 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEBoolean_in_rule__Section__FilteringAssignment_8_210640 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEBoolean_in_rule__Section__ExpandedAssignment_9_210671 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActivity_in_rule__Section__OwnedActivitiesAssignment_10_210702 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Activity__NameAssignment_210733 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Activity__DescriptionAssignment_4_110764 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFQN_in_rule__Activity__ActivityExplorerItemIDAssignment_5_110795 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEInt_in_rule__Activity__IndexAssignment_710826 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEBoolean_in_rule__Activity__HasPredicateAssignment_8_210857 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Activity__ImagePathOffAssignment_9_210888 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFQN_in_rule__PageExtension__ExtendedPageIDAssignment_610919 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSection_in_rule__PageExtension__OwnedSectionsAssignment_710950 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFQN_in_rule__SectionExtension__ExtendedSectionIDAssignment_610981 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActivity_in_rule__SectionExtension__OwnedActivitiesAssignment_711012 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Overview__DescriptionAssignment_3_111043 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Overview__ImagePathOnAssignment_4_311074 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Overview__ImagePathOffAssignment_5_311105 = new BitSet(new long[]{0x0000000000000002L});

}